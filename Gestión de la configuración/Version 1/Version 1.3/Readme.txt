Cambios respecto a version 1.2b:

	- Implementación de las primeras pruebas de la cadena de montaje en pruebas.java 
	- Pruebas de pieza y almacen


	· Almacen.java:
		
		- damePieza() ha sido modificado, ahora no hay que pasarle ningun atributo, sino que internamente utiliza un puntero

	· Fabrica.java:

		- fabricar() ahora es un metodo booleano en lugar de un void
		- solicitar() ha sido mejorado
		- producir() ahora es un metodo booleano en lugar de un void

	· Pieza.java:
		
		- Implementación de getters para poder realizar las pruebas

	· Sketch.java:
		
		- Fixeo de bugs en la parte gráfica, antes te dejaba seguir produciendo pese a no quedar piezas en el almacén.