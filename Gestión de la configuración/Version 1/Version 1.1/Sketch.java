package cadena_de_montaje;

import processing.core.PApplet;

public class Sketch extends PApplet {
	
	//centro de los circulos q simulan la piezas
	int x1=45; 
	int y1=130;
	int x2=70;
	int y2=130;
	int x3=95;
	int y3=320;
	//inic. movimiento
	int n=1;
	int m=1;
	
	boolean producido=false;//bool que cuando llegan las piezas, cambia, y deja al producto ir al almacen
	boolean producir=false;//bool que permite iniciar la animacion cuando cambia al pulsar el boton
	
	
public void setup(){
	size(600,600);
}

public void draw(){
	background(100,35,35);
	//int n,int m creo q deberian ir mejor aqui y para q desaparezcan las piezas mejor radio 0
	
	fill(225,225,225);
	rect(30,30,200,100);//almacen arriba
	text("almacen",30,30);
	
	rect(30,320,200,100);//cadena de montaje, abajo
	text("cadena de montaje",30,320);
	rect(300,300,50,50);//boton
	
	fill(225,0,225);
	ellipse(70,45,20,20);//pieza 1 en almacen
	ellipse(95,45,20,20);//pieza 3 en almacen(parte1/2)
	
	fill(225,225,0);
	ellipse(45,45,10,10);//pieza 2 en almacen
	ellipse(95,45,10,10);//pieza 3 en almacen(parte2/2)
	
	fill(225,225,0);
	ellipse(x1,y1,10,10);//pieza 1 inicio movimiento a cadena de montaje
	fill(225,0,225);
	ellipse(x2,y2,20,20);//pieza 2 inicio movimiento a cadena de montaje
	
	
	if(producir==true){
	
	y1=y1+n;
	y2=y2+n;//movimiento de almacen a caden de montaje
	
	if(y1==320){  //parar al llegar a cadena de montaje
		n=6000;
		producido=true; //puede moverse el producido
		/*delay(2000);*/ }
	
	if(producido==true){ //se mueve el producido
	fill(225,0,225);
	ellipse(x3,y3,20,20);
	fill(225,225,0);
	ellipse(x3,y3,10,10);
	y3=y3-m;}
	
	if(y3==130){m=6000;producido=true;producir=false;} //para al llegar al almacen
	
}
	}




public void keyPressed(){}
public void mousePressed(){
	if(overbox_producir()){producir=true;}
}
	

public boolean overbox_producir(){
	boolean flag=false;
	if(mouseX>=300&&mouseX<=350&&mouseY>=300&&mouseY<=350){    //((parent.mouseX>aux.getX())&&(parent.mouseX<(aux.getX()+10)))&&((parent.mouseY>aux.getY())&&(parent.mouseY<(aux.getY()+10)))
		flag=true;
		return flag;}
	else return flag;
}
	
}
