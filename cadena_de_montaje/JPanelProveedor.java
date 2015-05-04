package cadena_de_montaje;

import java.awt.GridLayout;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelProveedor extends JPanel {

	private final SketchProveedorDemo sketch;
	
	public JPanelProveedor(){
		
		sketch = new SketchProveedorDemo();
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
	
	
	
	//ELIMINAR
    protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        
        //Ver bordes luego. Esto se meteria en la clase JpanelOpcionesProveedor
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        
        
        return panel;
    }
	
}
