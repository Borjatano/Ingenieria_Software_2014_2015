Cambios respecto a version 1.2:

	� Almacen.java:

		- Lista de piezas pasa a ser un array en lugar de un arrayList
		- Implementaci�n del constructor Almac�n
		- Modificaciones en la funci�n damePieza() y eliminaci�n de las excepciones

	� Fabrica.java:

		- Modificaciones en la funcion fabricar()
		- Modificacion del tipo devuelto en la funci�n producir(), ahora en lugar de devolver una Pieza es un m�todo void.

	� Pieza.java:

		- Prestate no trata las excepciones con un mensaje de error, sino que te lo muestra por parte gr�fica

	� Sketch.java:

		- Mejora de la parte gr�fica gracias a los cambios anteriores