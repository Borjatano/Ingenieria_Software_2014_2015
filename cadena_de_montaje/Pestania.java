package cadena_de_montaje;


import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class Pestania extends javax.swing.JTabbedPane {
	
	private int index;
	private JPanelFabrica panel1;
	private JPanelProveedor panel2;
	private JPanelAlmacen panel3;
	private JPanelInfo panel4;
	
	private ImageIcon iconFabrica;
	private ImageIcon iconProveedor;
	private ImageIcon iconAlmacen;
	private ImageIcon iconAux;
	
	/*
	JComponent panel2;
	JPanelProveedor panel3;
	*/

	public Pestania(){
		
		index=0;
		
		iconFabrica = createImageIcon("/imagenes/fabrica.png");
		iconProveedor = createImageIcon("/imagenes/proveedor.png");
		iconAlmacen = createImageIcon("/imagenes/almacen.png");
		iconAux = createImageIcon("/imagenes/aux.png");
		
		
		panel1 = new JPanelFabrica();//habria que pasarle la fabrica
		
		this.addTab("Fabrica", iconFabrica, panel1,
				"Visualización de la fábrica");
		//this.setMnemonicAt(1, KeyEvent.VK_1);
		
		//JComponent panel2 = makeTextPanel("Panel #2");
		
		panel2 = new JPanelProveedor();//habria que pasarle el proveedor
		
		this.addTab("Proveedores", iconProveedor, panel2,
				"Visualización del proveedor");
		//this.setMnemonicAt(2, KeyEvent.VK_2);
		
		panel3 = new JPanelAlmacen();//habria que pasarle cosas

		this.addTab("Almacen", iconAlmacen, panel3,
				"Visualización del almacen");
		//this.setMnemonicAt(3, KeyEvent.VK_3);

		panel4 = new JPanelInfo();

		this.addTab("Extra", iconAux, panel4,
				"Visualización extra");
		//this.setMnemonicAt(4, KeyEvent.VK_4);

		

		ChangeListener changeListener = new ChangeListener() {
			public void stateChanged(ChangeEvent changeEvent) {
				Pestania sourceTabbedPane = (Pestania) changeEvent.getSource();
				//System.out.println("Tab changed from: " + sourceTabbedPane.getTitleAt(index));
				
				switch (index) {
					case 0:	panel1.stop();	break;					
					case 1:	panel2.stop();	break;				
					case 2:	panel3.stop();	break;				
					case 3:	panel4.stop();	break;				
					default: System.err.println("Tab origen no valida");	break;
				}

				index = sourceTabbedPane.getSelectedIndex();
				//System.out.println("Tab changed to: " + sourceTabbedPane.getTitleAt(index));
				
				switch (index) {
					case 0:	panel1.start(); break;
					case 1:	panel2.start(); break;
					case 2:	panel3.start();	break;
					case 3:	panel4.start();	break;
					default: System.err.println("Tab destino no valida");	break;
				}
			}};
		
		
		this.addChangeListener(changeListener);


		
		
	}
	
	
    protected JComponent makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
    }
    
    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Pestania.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("No se pudo encontrar el archivo: " + path);
            return null;
        }
    }
    
    public void setBounds(int x, int y, int width, int height){
    	super.setBounds(x, y, width, height);
    	panel1.setBounds(x, y, width, height-100);
    	panel2.setBounds(x, y, width, height-100);
    	panel3.setBounds(x, y, width, height-100);
    	panel4.setBounds(x, y, width, height-100);
    }
    
    
  
    
    
}
