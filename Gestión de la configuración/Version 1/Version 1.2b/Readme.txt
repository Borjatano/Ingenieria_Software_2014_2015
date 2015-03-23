Cambios respecto a version 1.2:

	· Almacen.java:

		- Lista de piezas pasa a ser un array en lugar de un arrayList
		- Implementación del constructor Almacén
		- Modificaciones en la función damePieza() y eliminación de las excepciones

	· Fabrica.java:

		- Modificaciones en la funcion fabricar()
		- Modificacion del tipo devuelto en la función producir(), ahora en lugar de devolver una Pieza es un método void.

	· Pieza.java:

		- Prestate no trata las excepciones con un mensaje de error, sino que te lo muestra por parte gráfica

	· Sketch.java:

		- Mejora de la parte gráfica gracias a los cambios anteriores