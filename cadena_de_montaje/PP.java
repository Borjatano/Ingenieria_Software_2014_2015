package cadena_de_montaje;


public class PP {

	public static void main (String[] args) { 

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}catch (Exception ex){
			System.out.println(ex.getMessage());
		}

		javax.swing.SwingUtilities.invokeLater( new Runnable() {
			public void run() {
				//GUI ventana = 
						new GUI();
				//ventana.setVisible(true);
				//ventana.inicializarPresentacion();
			}});


	}
}
