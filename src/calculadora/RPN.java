package calculadora;

class RPN {
	public void pushPila(double nuevo_dato) {
		NodoPila nuevo_nodo = new NodoPila(nuevo_dato, data.arriba);
		data.arriba = nuevo_nodo;
	}

	public double popPila() {
		double dato_arriba = data.arriba.data.dato;
		data.arriba = data.arriba.data.abajo;
		return dato_arriba;
	}

	public RPN(String commando) {
		data.arriba = null;
		this.data.commando = commando;
	}

	public double resultado() {
		double a, b;
		int j;
		for (int i = 0; i < data.commando.length(); i++) {
			// si es un digito
			if (Character.isDigit(data.commando.charAt(i))) {
				double numero;

				// obtener un string a partir del numero
				String temp = "";
				for (j = 0; (j < 100) && (Character.isDigit(data.commando.charAt(i)) || (data.commando.charAt(i) == '.')); j++) {
					temp = temp + String.valueOf(data.commando.charAt(i));
				}
				// convertira double y añadira la pila
				numero = Double.parseDouble(temp);

				pushPila(numero);
			} else if (data.commando.charAt(i) == '+')

			{
				b = popPila();
				a = popPila();
				pushPila(a + b);
			} else if (data.commando.charAt(i) == '-') {
				b = popPila();
				a = popPila();
				pushPila(a - b);
			} else if (data.commando.charAt(i) == '*') {
				b = popPila();
				a = popPila();
				pushPila(a * b);
			} else if (data.commando.charAt(i) == '/') {
				b = popPila();
				a = popPila();
				pushPila(a / b);
			} else if (data.commando.charAt(i) == '^') {
				b = popPila();
				a = popPila();
				pushPila(Math.pow(a, b));
			} else if (data.commando.charAt(i) == '%') {
				b = popPila();
				a = popPila();
				pushPila(a % b);
			} else if (data.commando.charAt(i) != ' ') {
				throw new IllegalArgumentException();
			}
		}
		double val = popPila();
		if (data.arriba != null) {
			throw new IllegalArgumentException();
		}
		return val;
	}

	private RPNData data = new RPNData();

}