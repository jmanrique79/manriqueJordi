package calculadora;

/*Objetivo: Obtener código refactorizado a partir de otro que no lo está.
 * Tarea: Para esta tarea, se refactorizará un programa mal escrito, sin cambiar la forma en que funciona el programa. 
 * Este programa, RPN.java es una calculadora de notación inversa polaca que utiliza una pila.
 * Reverse Polish notation (RPN) Notación Polaca inversa, por ejemplo la expresión:4 * 5 -7 / 2 % 3 nos da 1,5 respetandola prioridad de 
 * los operadores en notación RPN seria: 4 5 * 7 2 / -3 % (pues no podemos poner los paréntesis para alterar la prioridad) 
 * Se debe reorganizar este código usando almenos tres de las reglas vistas en clase.*/

class NodoPila {
	public NodoPila(double dato, NodoPila abajo) {
		this.data.dato = dato;
		this.data.abajo = abajo;
	}

	public NodoPilaData data = new NodoPilaData();
}


	


