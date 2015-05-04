package cadena_de_montaje;

import javax.swing.JButton;

public class GUI extends javax.swing.JFrame{
    private JButton jButton1;

    public GUI(){
    	this.setSize(1040, 750);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        /*
        javax.swing.JPanel panel = new javax.swing.JPanel();
        panel.setBounds(20, 20, 600, 600);
        processing.core.PApplet sketch = new Sketch_Old();
        panel.add(sketch);
        this.add(panel);
        sketch.init(); //this is the function used to start the execution of the sketch
        */
        javax.swing.JTabbedPane pes = new Pestania();
        pes.setBounds(20, 20, 600, 600);
        this.add(pes);
        
        this.setVisible(true);
        
    	//init();
    }
    
    private void init(){
    	
    	javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    	getContentPane().setLayout(layout);
    	layout.setHorizontalGroup(
    			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    			.addComponent(jButton1)
    			);
    	layout.setVerticalGroup(
    			layout.createSequentialGroup()
    			.addComponent(jButton1)
    			);

        pack();
        
        this.setVisible(true);

    }
}
