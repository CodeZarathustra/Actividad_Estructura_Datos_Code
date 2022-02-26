package ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.CRUDCurso;
import modelo.Curso;

/**
 *
 * @author Usuario
 */
public class VentanaBuscar extends javax.swing.JFrame {

    /**
     * Creates new form VentanaBuscar
     */
    public VentanaBuscar() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
                            
    private void initComponents() {

        jTextFieldBuscarArray = new javax.swing.JTextField();
        jButtonOkBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelNoExiste = new javax.swing.JLabel();
        setResizable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(700, 200, 0, 0));

        jButtonOkBuscar.setText("OK");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Buscar curso por nombre:");

        jLabelNoExiste.setForeground(new java.awt.Color(204, 0, 0));
        jLabelNoExiste.setText("El curso no existe.");
        jLabelNoExiste.setVisible(false);
    
        
     //-----------------------------------------------------------------------
     //LLAMADO AL METODO LISTENER
        jButtonOkBuscar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				// TODO Auto-generated method stub
				buscarButotonActionPerformed(e);
				
				
				
			}
        	
        	
        });
        
        
   //---------------------------------------------------------------------------------------------------------------------------------

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jTextFieldBuscarArray, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jButtonOkBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabelNoExiste, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldBuscarArray, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabelNoExiste)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonOkBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }                   

 //--------------------------------------------------------------------------------------------------------------------------------
   /* public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
 //---------------------------------------------------------------------------------------------------------------------------------

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBuscar().setVisible(true);
            }
        });
    }*/
//-------------------------------------------------------------------------------------------------------------------------------------
 
    private void buscarButotonActionPerformed(ActionEvent e) {
    	
    	
    	//Para refactorizar crear un objeto de la clase Crud dentro de la instancia contenedora
    		CRUDCurso c= new CRUDCurso();
    		String nombreBuscar=jTextFieldBuscarArray.getText();
    		Curso resultado=c.buscar(nombreBuscar);
    		//String nombreG=resultado.getNombre();
	    		
	    		if(resultado==null){
	    			
	    			//JOptionPane.showInternalMessageDialog(null, "El curso no existe n\" Ingrese un valor valido",
	 		    		   //"Error", JOptionPane.INFORMATION_MESSAGE);
	    			jLabelNoExiste.setVisible(true);
	    				
	    		} else {
	    			
	    			//Desplegar en ventana principal los valores
	    			//ocultar esta ventana
	    			//Visualizar Ventan principal
	    			setVisible(false);
	    			
	    			String codigo =resultado.getCodigo();
			        String passWord=resultado.getPassword();
			        String nombre=resultado.getNombre();
			        String precio=resultado.getPrecio();
			        String horas=resultado.getHoras();
			        String nivel=resultado.getNivel();
			        String profesor=resultado.getProfesor();
			        String instituciion=resultado.getInstitución();
			        String inicioincripcion=resultado.getFechaInscricionI();
			        String finalIncripcion=resultado.getFechaInsncriocionF();
			        String inicio=resultado.getFechaInicio();
			        String cierre=resultado.getFechaCierre();
			        String alumnos=resultado.getNumAlumnos();
			        String modalidad=resultado.getModalidad();
			        String decripcion=resultado.getDescripción();
	    			 
	    			//Desplegar ventana
	    	        java.awt.EventQueue.invokeLater(new Runnable() {
	    	            public void run() {
	    	            	VentanaCrudUsuario ventana= new VentanaCrudUsuario();
	    	            	ventana.setVisible(true);
	    	            	ventana.getjTextFieldCodigo().setText(codigo);
	    	            	ventana.getjTextFieldPassword().setText(passWord);
	    	            	ventana.getjTextFieldNombre().setText(nombre);
	    	            	ventana.getjTextFieldPrecio().setText(precio);
	    	            	ventana.getjTextFieldHoras().setText(horas);
	    	            	ventana.getjTextFieldNivel().setText(nivel);
	    	            	ventana.getjTextFieldProfesor().setText(profesor);
	    	            	ventana.getjTextFieldInstitucion().setText(instituciion);
	    	            	ventana.getjTextFieldIncipcion().setText(inicioincripcion);
	    	            	ventana.getjTextFieldFIncripcion().setText(finalIncripcion);
	    	            	ventana.getjTextFieldFInicio().setText(inicio);
	    	            	ventana.getjTextFieldFCierre().setText(cierre);
	    	            	ventana.getjTextFieldNAlumnos().setText(alumnos);
	    	            	ventana.getjTextFieldModalidad().setText(modalidad);
	    	            	ventana.getjTextAreaDescripcion().setText(decripcion);
	    	            	
	    	                
	    	                
	    	            }
	    	        });
	    	        //Desplegar valores
	    	        
	    			
	    			
	    			
	    			
	    			
	    		}
    		
    	
    }
    
    
    
    
 //---------------------------------------------------------------------------------------------------------------------- 
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonOkBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNoExiste;
    private javax.swing.JTextField jTextFieldBuscarArray;
    // End of variables declaration 
    //-------------------------------------------------------------------------------------------------------------------
}
