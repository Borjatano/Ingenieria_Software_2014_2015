package cadena_de_montaje;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JPanelFabrica extends javax.swing.JPanel{
	
	private final SketchFabricaDemo sketch;

	public JPanelFabrica(){
		
        sketch = new SketchFabricaDemo();
        init();
	}

	
	public void init(){

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
				layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(sketch)
				.addContainerGap()
				);
		layout.setVerticalGroup(
				layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(sketch)
				.addContainerGap()
				);

		sketch.init();
	}
	
	
	
	public void stop(){
		sketch.stop();
	}
	
	public void start(){
		sketch.start();
	}
	
	public void setBounds(int x, int y, int width, int height){
    	super.setBounds(x, y, width, height);
    	sketch.setBounds(x, y, width, height);
    }

}
