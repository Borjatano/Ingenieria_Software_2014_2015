package cadena_de_montaje;

import processing.core.PApplet;

import java.util.ArrayList;


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
	int r1=10;
	int r2=20;
	int r32=20;
	int r31=10;
	boolean producido=false;//bool que cuando llegan las piezas, cambia, y deja al producto ir al almacen
	boolean boton_producir=false;//bool que permite iniciar la animacion cuando cambia al pulsar el boton
	boolean fabricando=false;
	
	Pieza p1 =new Pieza (2,"1",this);
	Pieza p2 =new Pieza (3,"2",this);
	Pieza producto=new Pieza (1,"3",this);
	Pieza [] listaPiezas = {p1,p2,producto};
	
	
	
	
	Almacen almacen = new Almacen(listaPiezas,this);
	Fabrica fabrica = new Fabrica(almacen);
	
	
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
	rect(300,300,40,20);//boton
	text("Pulsa el boton para producir nueva pieza",300,295);
	
	fill(225,0,225);
	String textp1 = Integer.toString(p1.disponibilidad);
	String textp2 = Integer.toString(p2.disponibilidad);
	String textp3 = Integer.toString(producto.disponibilidad);
	text(textp1,45,70);
	text(textp2,70,70);
	text(textp3,95,70);
	
	rect(45,130,0,178);
	rect(70,130,0,178);
	rect(95,130,0,178);
	fill(225,0,225);
	ellipse(70,45,20,20);//pieza 1 en almacen
	ellipse(95,45,20,20);//pieza 3 en almacen(parte1/2)
	
	fill(225,225,0);
	ellipse(45,45,10,10);//pieza 2 en almacen
	ellipse(95,45,10,10);//pieza 3 en almacen(parte2/2)
	
	
	
	
	if(boton_producir==true){
		
		if(fabricando==false){
			fabrica.fabricar();
		fabricando=true;}
	
	
		fill(225,225,0);
		ellipse(x1,y1,r1,r1);//pieza 1 inicio movimiento a cadena de montaje
		fill(225,0,225);
		ellipse(x2,y2,r2,r2);//pieza 2 inicio movimiento a cadena de montaje
		
	y1=y1+n; 
	y2=y2+n;//movimientos de las piezas del almacen a caden de montaje
	
	
	
	if(y1==320){  //parar al llegar a cadena de montaje
		//delay(2000);
		r1=0;//hacemos radio 0 para q desaparezca
		r2=0;
		producido=true; //puede moverse el producido
		/*delay(2000);*/ }
	
	if(producido==true){ //se mueve el producido
		
		fill(225,0,225);
	ellipse(x3,y3,r32,r32);//pieza3 (1/2) inicio movimiento a almacen
	fill(225,225,0);
	ellipse(x3,y3,r31,r31);//pieza3 (2/2) inicio movimiento a almacen
	y3=y3-m;}//movimientos de las piezas de la caden de montaje a almacen 
	
	if(y3==130){r32=0;r31=0;producido=false;boton_producir=false;//para al llegar al almacen
	fabricando=false;
	//resetear valores para volver a iniciar animacion
	x1=45; y1=130;x2=70; y2=130;x3=95;y3=320;n=1;m=1;r1=10;r2=20;r32=20;r31=10;} 
	
}
	}




public void keyPressed(){}
public void mousePressed(){
	if(overbox_producir()){boton_producir=true;}
}
	

public boolean overbox_producir(){
	boolean flag=false;
	if(mouseX>=300&&mouseX<=350&&mouseY>=300&&mouseY<=350){    //((parent.mouseX>aux.getX())&&(parent.mouseX<(aux.getX()+10)))&&((parent.mouseY>aux.getY())&&(parent.mouseY<(aux.getY()+10)))
		flag=true;
		//fabrica.fabricar();
		return flag;}
	else return flag;
}
	
}
