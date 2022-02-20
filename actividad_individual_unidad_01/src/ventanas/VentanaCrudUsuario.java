
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
public class VentanaCrudUsuario extends javax.swing.JFrame {

    
    public VentanaCrudUsuario() {
        initComponents();
    }

  //Se declara un objeto de la clase CRUD para utilizarlo en todos los metodos.
    
    CRUDCurso crudCursoObject=new CRUDCurso();
    
    @SuppressWarnings("unchecked")
                           
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldPassword = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jTextFieldHoras = new javax.swing.JTextField();
        jTextFieldNivel = new javax.swing.JTextField();
        jTextFieldProfesor = new javax.swing.JTextField();
        jTextFieldInstitucion = new javax.swing.JTextField();
        jTextFieldIncipcion = new javax.swing.JTextField();
        jTextFieldFIncripcion = new javax.swing.JTextField();
        jTextFieldFInicio = new javax.swing.JTextField();
        jTextFieldFCierre = new javax.swing.JTextField();
        jTextFieldNAlumnos = new javax.swing.JTextField();
        jLabelId = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jLabelNombre = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelHoras = new javax.swing.JLabel();
        jLabelNivel = new javax.swing.JLabel();
        jLabelProfesor = new javax.swing.JLabel();
        jLabelInstirucion = new javax.swing.JLabel();
        jLabelFIncripción = new javax.swing.JLabel();
        jLabelIncripcionF = new javax.swing.JLabel();
        jLabelFInicio = new javax.swing.JLabel();
        jLabelCierre = new javax.swing.JLabel();
        jLabelNAlumnos = new javax.swing.JLabel();
        jTextFieldModalidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelEditeCampos = new javax.swing.JLabel();
        jLabelClickGuardar = new javax.swing.JLabel();
        jLabelNoExiste = new javax.swing.JLabel();
//------------------------------------------------------------------------------------------------------------------------------
        
        jTextFieldBuscar = new javax.swing.JTextField();
        jLabelBuscar = new javax.swing.JLabel();
        JButtonIR = new javax.swing.JButton();
        
        jTextFieldBuscar.setVisible(false);
        jLabelBuscar.setVisible(false);
        JButtonIR.setVisible(false);
        
	//--------------------------------------------------	
        jButtonEditar.setVisible(false);
        jButtonEliminar.setVisible(false);
        
        
        
        
        
        //------------------------------------------
		
		
        jLabelBuscar.setText("Buscar por nombre:");

        JButtonIR.setText("OK");
        
        //------------------------------------------------------------------------------------------------------------
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setBounds(new java.awt.Rectangle(450, 100, 0, 0));
        setResizable(false);
       
       // this.setPreferredSize(getPreferredSize());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Programa CRUD-Arrays Unidad 01");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("CRUD -Cursos");

        jButtonGuardar.setText("Guardar");
        //-----------------------------------------------------------------------------
        //Metodo Action Performed GUARDAR
        jButtonGuardar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				// TODO Auto-generated method stub
				botonGuardarActionPerformed (e);
			
			
			}
        	
        	
        });
        //-------------------------------------------------------------------------------
      //Metodo Action Performed BUSCAR
        jButtonBuscar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				// TODO Auto-generated method stub
				botonBuscarActionPerformed (e);
				
			
			
			}
        	
        	
        });
        //-------------------------------------------------------------------------------
      //Metodo Action Performed EDITAR
        jButtonEditar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				// TODO Auto-generated method stub
				actualizarActionPerformed (e);
			
			
			}
        	
        	
        });
        //-------------------------------------------------------------------------------
      //Metodo Action Performed ELIMINAR
        jButtonEliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				// TODO Auto-generated method stub
				
				eliminarGuardarActionPerformed (e);
			
			}
        	
        	
        });
        //-------------------------------------------------------------------------------
        JButtonIR.addActionListener(new ActionListener() {

     			@Override
     			public void actionPerformed(ActionEvent e) {
     				
     				
     				
     				// TODO Auto-generated method stub
     			
     				buttonIrActionPerformed(e); 
     				
     				
     			}
             	
             	
             });
        
        
        //------------------------------------------------------------------------------
        
        //EDITAR LISTENER
        
        jButtonLimpiar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				limpiarActionPerformed(e);
				
				
			}
        		
        	
        });
        
        
        
        
        
        
        
        //------------------------------------------------------------------------------

        jButtonBuscar.setText("Buscar");

        jButtonEditar.setText("Actualizar");

        jButtonEliminar.setText("Eliminar");

        jButtonLimpiar.setText("Limpiar");

        jTextFieldCodigo.setToolTipText("");

        jLabelId.setText("Codigo:");

        jLabelPassword.setText("Password:");

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setLineWrap(true);
        jTextAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        jLabelNombre.setText("Nombre:");

        jLabelPrecio.setText("Precio:");

        jLabelHoras.setText("Horas:");

        jLabelNivel.setText("Nivel:");

        jLabelProfesor.setText("Profesor:");

        jLabelInstirucion.setText("Institución:");

        jLabelFIncripción.setText("Inicio Incripción:");

        jLabelIncripcionF.setText("Fin Incripción:");

        jLabelFInicio.setText("Fecha Inicio:");

        jLabelCierre.setText("Fecha Cierre:");

        jLabelNAlumnos.setText("N° Alumnos:");

        jLabel3.setText("Modalidad:");

        jLabelDescripcion.setText("Descripción:");

        jLabelEditeCampos.setForeground(new java.awt.Color(204, 0, 0));
        jLabelEditeCampos.setText("Edite Campos. ");
        

        jLabelClickGuardar.setForeground(new java.awt.Color(204, 0, 51));
        jLabelClickGuardar.setText("Click en Guardar");
        
        jLabelNoExiste.setForeground(new java.awt.Color(204, 0, 0));
        jLabelNoExiste.setText("El elemento no existe");
        
        jLabelEditeCampos.setVisible(false);
        jLabelClickGuardar.setVisible(false);

   //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelHoras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelNivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldHoras)
                                        .addComponent(jTextFieldPrecio)
                                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelInstirucion, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelIncripcionF, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelFInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(JButtonIR, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelFIncripción, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldProfesor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNivel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelNAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNAlumnos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(jTextFieldFCierre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldFInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldFIncripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldInstitucion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldIncipcion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jTextFieldModalidad))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButtonEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelEditeCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelClickGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabelEditeCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelClickGuardar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelBuscar)
                                .addComponent(JButtonIR)))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelId)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelInstirucion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIncipcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPassword)
                            .addComponent(jLabelFIncripción))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFIncripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelIncripcionF))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPrecio)
                            .addComponent(jLabelFInicio))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHoras)
                            .addComponent(jLabelCierre))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNivel)
                    .addComponent(jLabelNAlumnos)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProfesor)
                    .addComponent(jTextFieldModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDescripcion)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
   
   
    
    
    }

  //--------------------------------------------------------------------------------------------------------------------------------
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCrudUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
  //----------------------------------------------------------------------------------------------------------------------------------

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCrudUsuario().setVisible(true);
            }
        });
    }
//--------------------------------------------------------------------------------------------------------------------------------------
    //ACTION PERFORMED METODOS
    //-----------------------------------------------------------------
    private void botonGuardarActionPerformed (ActionEvent e) {
    	
    	jButtonGuardar.setVisible(true);
    	String codigo =jTextFieldCodigo.getText();
        String passWord=jTextFieldPassword.getText();
        String nombre=jTextFieldNombre.getText();
        String precio=jTextFieldPrecio.getText();
        String horas=jTextFieldHoras.getText();
        String nivel=jTextFieldNivel.getText();
        String profesor=jTextFieldProfesor.getText();
        String instituciion=jTextFieldInstitucion.getText();
        String inicioincripcion=jTextFieldIncipcion.getText();
        String finalIncripcion=jTextFieldFIncripcion.getText();
        String inicio=jTextFieldFInicio.getText();
        String cierre=jTextFieldFCierre.getText();
        String alumnos=jTextFieldNAlumnos.getText();
        String modalidad=jTextFieldModalidad.getText();
        String decripcion=jTextAreaDescripcion.getText();
    	
    	
    	if (codigo.isEmpty()||passWord.isEmpty()||nombre.isEmpty()) {
		    	 //-----------------------------------------------------------
			       jTextFieldCodigo.setVisible(true);
			       jTextFieldPassword.setVisible(true);
			       jTextFieldNombre.setVisible(true);
			       jTextFieldPrecio.setVisible(true);
			       jTextFieldHoras.setVisible(true);
			       jTextFieldNivel.setVisible(true);
			       jTextFieldProfesor.setVisible(true);
			       jTextFieldInstitucion.setVisible(true);
			       jTextFieldIncipcion.setVisible(true);
			       jTextFieldFIncripcion.setVisible(true);
			       jTextFieldFInicio.setVisible(true);
			       jTextFieldFCierre.setVisible(true);
			       jTextFieldNAlumnos.setVisible(true);
			       jTextFieldModalidad.setVisible(true);
			       jTextAreaDescripcion.setVisible(true);
			       
			       
					jLabelId.setVisible(true);
			        jLabelPassword.setVisible(true);
					jLabelNombre.setVisible(true);
			        jLabelPrecio.setVisible(true);
			        jLabelHoras.setVisible(true);
			        jLabelNivel.setVisible(true);
			        jLabelProfesor.setVisible(true);
			        jLabelInstirucion.setVisible(true);
			        jLabelFIncripción.setVisible(true);
			        jLabelIncripcionF.setVisible(true);
			        jLabelFInicio.setVisible(true);
			        jLabelCierre.setVisible(true);
			        jLabelNAlumnos.setVisible(true);
			        jLabel3.setVisible(true);
			        jLabelDescripcion.setVisible(true);
			        
			        //jLabelEditeCampos.setVisible(false);
			       //  jLabelClickGuardar.setVisible(false);
    	
    	
         jTextFieldBuscar.setVisible(false);
         jLabelBuscar.setVisible(false);
         JButtonIR.setVisible(false);} else {
    	
		        
	//--------------------------------------------------------------------
        	 
					      
        	int flag= crudCursoObject.guardar(codigo, passWord, nombre, precio, horas, nivel, profesor, instituciion,
					        		inicioincripcion,finalIncripcion, inicio, cierre, alumnos, modalidad, decripcion);
				
        	if(flag==0) {
					        
						       jTextFieldCodigo.setText("");
						       jTextFieldPassword.setText("");
						       jTextFieldNombre.setText("");
						       jTextFieldPrecio.setText("");
						       jTextFieldHoras.setText("");
						       jTextFieldNivel.setText("");
						       jTextFieldProfesor.setText("");
						       jTextFieldInstitucion.setText("");
						       jTextFieldIncipcion.setText("");
						       jTextFieldFIncripcion.setText("");
						       jTextFieldFInicio.setText("");
						       jTextFieldFCierre.setText("");
						       jTextFieldNAlumnos.setText("");
						       jTextFieldModalidad.setText("");
						       jTextAreaDescripcion.setText("");
						       
						       JOptionPane.showInternalMessageDialog(null, "Curso Guardado Exitosamente",
						    		   "Confirmación", JOptionPane.INFORMATION_MESSAGE);
        	} else {
        		
        		 jTextFieldCodigo.setText("");
			       jTextFieldPassword.setText("");
			       jTextFieldNombre.setText("");
			       jTextFieldPrecio.setText("");
			       jTextFieldHoras.setText("");
			       jTextFieldNivel.setText("");
			       jTextFieldProfesor.setText("");
			       jTextFieldInstitucion.setText("");
			       jTextFieldIncipcion.setText("");
			       jTextFieldFIncripcion.setText("");
			       jTextFieldFInicio.setText("");
			       jTextFieldFCierre.setText("");
			       jTextFieldNAlumnos.setText("");
			       jTextFieldModalidad.setText("");
			       jTextAreaDescripcion.setText("");
			       
			       JOptionPane.showInternalMessageDialog(null, "El elemento ingresado ya existe",
			    		   "Confirmación", JOptionPane.INFORMATION_MESSAGE);
        		
        		
        	}
         }
		      
    }
  //-----------------------------------------------------------------
    //LLAMADO a la ventan buscar
    
    private void botonBuscarActionPerformed (ActionEvent e) {
    
    	//jButtonGuardar.setVisible(false);
    	
    	 jTextFieldBuscar.setVisible(true);
         jLabelBuscar.setVisible(true);
         JButtonIR.setVisible(true);
         //jLabelEditeCampos.setVisible(false);
         //jLabelClickGuardar.setVisible(false);
    	
    		//Ocultar ventana principal
    	
    		jTextFieldCodigo.setVisible(false);
	       jTextFieldPassword.setVisible(false);
	       jTextFieldNombre.setVisible(false);
	       jTextFieldPrecio.setVisible(false);
	       jTextFieldHoras.setVisible(false);
	       jTextFieldNivel.setVisible(false);
	       jTextFieldProfesor.setVisible(false);
	       jTextFieldInstitucion.setVisible(false);
	       jTextFieldIncipcion.setVisible(false);
	       jTextFieldFIncripcion.setVisible(false);
	       jTextFieldFInicio.setVisible(false);
	       jTextFieldFCierre.setVisible(false);
	       jTextFieldNAlumnos.setVisible(false);
	       jTextFieldModalidad.setVisible(false);
	       jTextAreaDescripcion.setVisible(false);
	       
	       
			jLabelId.setVisible(false);
	        jLabelPassword.setVisible(false);
			jLabelNombre.setVisible(false);
	        jLabelPrecio.setVisible(false);
	        jLabelHoras.setVisible(false);
	        jLabelNivel.setVisible(false);
	        jLabelProfesor.setVisible(false);
	        jLabelInstirucion.setVisible(false);
	        jLabelFIncripción.setVisible(false);
	        jLabelIncripcionF.setVisible(false);
	        jLabelFInicio.setVisible(false);
	        jLabelCierre.setVisible(false);
	        jLabelNAlumnos.setVisible(false);
	        jLabel3.setVisible(false);
	        jLabelDescripcion.setVisible(false);
    	
	    	
    		
    	  			
    }
 //--------------------------------------------------------------------
    Curso resultado;
    private void actualizarActionPerformed (ActionEvent e) {
    	
    	//Ocultar labels
       // jLabelEditeCampos.setVisible(true);
        //jLabelClickGuardar.setVisible(true);
        jTextFieldCodigo.setVisible(true);
	       jTextFieldPassword.setVisible(true);
	       jTextFieldNombre.setVisible(true);
	       jTextFieldPrecio.setVisible(true);
	       jTextFieldHoras.setVisible(true);
	       jTextFieldNivel.setVisible(true);
	       jTextFieldProfesor.setVisible(true);
	       jTextFieldInstitucion.setVisible(true);
	       jTextFieldIncipcion.setVisible(true);
	       jTextFieldFIncripcion.setVisible(true);
	       jTextFieldFInicio.setVisible(true);
	       jTextFieldFCierre.setVisible(true);
	       jTextFieldNAlumnos.setVisible(true);
	       jTextFieldModalidad.setVisible(true);
	       jTextAreaDescripcion.setVisible(true);
	       
	       
			jLabelId.setVisible(true);
	        jLabelPassword.setVisible(true);
			jLabelNombre.setVisible(true);
	        jLabelPrecio.setVisible(true);
	        jLabelHoras.setVisible(true);
	        jLabelNivel.setVisible(true);
	        jLabelProfesor.setVisible(true);
	        jLabelInstirucion.setVisible(true);
	        jLabelFIncripción.setVisible(true);
	        jLabelIncripcionF.setVisible(true);
	        jLabelFInicio.setVisible(true);
	        jLabelCierre.setVisible(true);
	        jLabelNAlumnos.setVisible(true);
	        jLabel3.setVisible(true);
	        jLabelDescripcion.setVisible(true);
	        
	   	 jTextFieldBuscar.setVisible(false);
         jLabelBuscar.setVisible(false);
         JButtonIR.setVisible(false);
         
         jButtonGuardar.setVisible(false);

    	
 	//---------------------------

     	String codigo =jTextFieldCodigo.getText();
        String passWord=jTextFieldPassword.getText();
        String nombre=jTextFieldNombre.getText();
        String precio=jTextFieldPrecio.getText();
        String horas=jTextFieldHoras.getText();
        String nivel=jTextFieldNivel.getText();
        String profesor=jTextFieldProfesor.getText();
        String instituciion=jTextFieldInstitucion.getText();
        String inicioincripcion=jTextFieldIncipcion.getText();
        String finalIncripcion=jTextFieldFIncripcion.getText();
        String inicio=jTextFieldFInicio.getText();
        String cierre=jTextFieldFCierre.getText();
        String alumnos=jTextFieldNAlumnos.getText();
        String modalidad=jTextFieldModalidad.getText();
        String decripcion=jTextAreaDescripcion.getText();
         
       //--------------------------  
         
			resultado.setCodigo(codigo);
	        resultado.setPassword(passWord);
	        resultado.setNombre(nombre);
	        resultado.setPrecio(precio);
	        resultado.setHoras(horas);
	        resultado.setNivel(nivel);
	        resultado.setProfesor(profesor);
	        resultado.setInstitución(instituciion);
	        resultado.setFechaInscricionI(inicioincripcion);
	        resultado.setFechaInsncriocionF(finalIncripcion);
	        resultado.setFechaInicio(inicio);
	        resultado.setFechaCierre(cierre);
	        resultado.setNumAlumnos(alumnos);
	        resultado.setModalidad(modalidad);
	        resultado.setDescripción(decripcion);
	        

		       JOptionPane.showInternalMessageDialog(null, "Curso "+resultado.getNombre()+" Actualizado",
			    		   "Confirmación", JOptionPane.INFORMATION_MESSAGE);
 	
    }
 //--------------------------------------------------------------------
    private void eliminarGuardarActionPerformed (ActionEvent e) {
 	
    	crudCursoObject.eliminar(resultado);
    	
    	 jTextFieldCodigo.setText("");
	       jTextFieldPassword.setText("");
	       jTextFieldNombre.setText("");
	       jTextFieldPrecio.setText("");
	       jTextFieldHoras.setText("");
	       jTextFieldNivel.setText("");
	       jTextFieldProfesor.setText("");
	       jTextFieldInstitucion.setText("");
	       jTextFieldIncipcion.setText("");
	       jTextFieldFIncripcion.setText("");
	       jTextFieldFInicio.setText("");
	       jTextFieldFCierre.setText("");
	       jTextFieldNAlumnos.setText("");
	       jTextFieldModalidad.setText("");
	       jTextAreaDescripcion.setText("");
    	
    	JOptionPane.showInternalMessageDialog(null, "Curso "+resultado.getNombre()+" eliminado",
	    		   "Confirmación", JOptionPane.INFORMATION_MESSAGE);

   	
 	
    }
    //-------------------------------------------------------------------
    
    private void limpiarActionPerformed(ActionEvent e) {
    	
    	 jTextFieldCodigo.setText("");
	       jTextFieldPassword.setText("");
	       jTextFieldNombre.setText("");
	       jTextFieldPrecio.setText("");
	       jTextFieldHoras.setText("");
	       jTextFieldNivel.setText("");
	       jTextFieldProfesor.setText("");
	       jTextFieldInstitucion.setText("");
	       jTextFieldIncipcion.setText("");
	       jTextFieldFIncripcion.setText("");
	       jTextFieldFInicio.setText("");
	       jTextFieldFCierre.setText("");
	       jTextFieldNAlumnos.setText("");
	       jTextFieldModalidad.setText("");
	       jTextAreaDescripcion.setText("");
    	
    	
    }
    
  
    
    //-------------------------------------------------------------------
    private void buttonIrActionPerformed(ActionEvent e) {
    	
    	jButtonGuardar.setVisible(true);
    	
    	String nombreBuscar=jTextFieldBuscar.getText();
		 resultado=crudCursoObject.buscar(nombreBuscar);
		//String nombreG=resultado.getNombre();
    		
    		if(resultado==null){
    			
    			//JOptionPane.showInternalMessageDialog(null, "El curso no existe n\" Ingrese un valor valido",
 		    		   //"Error", JOptionPane.INFORMATION_MESSAGE);
    			jTextFieldBuscar.setText("**No existe**");
    			
    				
    		} else {
    			
    			//Desplegar en ventana principal los valores
    			//ocultar esta ventana
    			//Visualizar Ventan principal
    			//jLabelEditeCampos.setVisible(false);
    	       // jLabelClickGuardar.setVisible(false);
    	        
    	        	jTextFieldCodigo.setVisible(true);
    		       jTextFieldPassword.setVisible(true);
    		       jTextFieldNombre.setVisible(true);
    		       jTextFieldPrecio.setVisible(true);
    		       jTextFieldHoras.setVisible(true);
    		       jTextFieldNivel.setVisible(true);
    		       jTextFieldProfesor.setVisible(true);
    		       jTextFieldInstitucion.setVisible(true);
    		       jTextFieldIncipcion.setVisible(true);
    		       jTextFieldFIncripcion.setVisible(true);
    		       jTextFieldFInicio.setVisible(true);
    		       jTextFieldFCierre.setVisible(true);
    		       jTextFieldNAlumnos.setVisible(true);
    		       jTextFieldModalidad.setVisible(true);
    		       jTextAreaDescripcion.setVisible(true);
    		       
    		       
    				jLabelId.setVisible(true);
    		        jLabelPassword.setVisible(true);
    				jLabelNombre.setVisible(true);
    		        jLabelPrecio.setVisible(true);
    		        jLabelHoras.setVisible(true);
    		        jLabelNivel.setVisible(true);
    		        jLabelProfesor.setVisible(true);
    		        jLabelInstirucion.setVisible(true);
    		        jLabelFIncripción.setVisible(true);
    		        jLabelIncripcionF.setVisible(true);
    		        jLabelFInicio.setVisible(true);
    		        jLabelCierre.setVisible(true);
    		        jLabelNAlumnos.setVisible(true);
    		        jLabel3.setVisible(true);
    		        jLabelDescripcion.setVisible(true);
    			
    			
    			
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
			        
			        jTextFieldCodigo.setText(codigo);
				       jTextFieldPassword.setText(passWord);
	    		       jTextFieldNombre.setText(nombre);
	    		       jTextFieldPrecio.setText(precio);
	    		       jTextFieldHoras.setText(horas);
	    		       jTextFieldNivel.setText(nivel);
	    		       jTextFieldProfesor.setText(profesor);
	    		       jTextFieldInstitucion.setText(instituciion);
	    		       jTextFieldIncipcion.setText(inicioincripcion);
	    		       jTextFieldFIncripcion.setText(finalIncripcion);
	    		       jTextFieldFInicio.setText(inicio);
	    		       jTextFieldFCierre.setText(cierre);
	    		       jTextFieldNAlumnos.setText(alumnos);
	    		       jTextFieldModalidad.setText(modalidad);
	    		       jTextAreaDescripcion.setText(decripcion);
        
	       jButtonEditar.setVisible(true);
	       jButtonEliminar.setVisible(true);        
			        
    		
    		
    		
    		}
    	
    	
    	
    }
    
 //------------------------------------------------------------------------------------------------------------------------------------   
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCierre;
    private javax.swing.JLabel jLabelClickGuardar;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelEditeCampos;
    private javax.swing.JLabel jLabelFIncripción;
    private javax.swing.JLabel jLabelFInicio;
    private javax.swing.JLabel jLabelHoras;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelIncripcionF;
    private javax.swing.JLabel jLabelInstirucion;
    private javax.swing.JLabel jLabelNAlumnos;
    private javax.swing.JLabel jLabelNivel;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelProfesor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldFCierre;
    private javax.swing.JTextField jTextFieldFIncripcion;
    private javax.swing.JTextField jTextFieldFInicio;
    private javax.swing.JTextField jTextFieldHoras;
    private javax.swing.JTextField jTextFieldIncipcion;
    private javax.swing.JTextField jTextFieldInstitucion;
    private javax.swing.JTextField jTextFieldModalidad;
    private javax.swing.JTextField jTextFieldNAlumnos;
    private javax.swing.JTextField jTextFieldNivel;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldProfesor;
    private javax.swing.JLabel jLabelNoExiste;
    
    private javax.swing.JTextField jTextFieldBuscar;
	private javax.swing.JLabel jLabelBuscar;
	private javax.swing.JButton JButtonIR;
	
    
    // End of variables declaration   
	public javax.swing.JTextArea getjTextAreaDescripcion() {
		return jTextAreaDescripcion;
	}


	public void setjTextAreaDescripcion(javax.swing.JTextArea jTextAreaDescripcion) {
		this.jTextAreaDescripcion = jTextAreaDescripcion;
	}


	public javax.swing.JTextField getjTextFieldCodigo() {
		return jTextFieldCodigo;
	}


	public void setjTextFieldCodigo(javax.swing.JTextField jTextFieldCodigo) {
		this.jTextFieldCodigo = jTextFieldCodigo;
	}


	public javax.swing.JTextField getjTextFieldFCierre() {
		return jTextFieldFCierre;
	}


	public void setjTextFieldFCierre(javax.swing.JTextField jTextFieldFCierre) {
		this.jTextFieldFCierre = jTextFieldFCierre;
	}


	public javax.swing.JTextField getjTextFieldFIncripcion() {
		return jTextFieldFIncripcion;
	}


	public void setjTextFieldFIncripcion(javax.swing.JTextField jTextFieldFIncripcion) {
		this.jTextFieldFIncripcion = jTextFieldFIncripcion;
	}


	public javax.swing.JTextField getjTextFieldFInicio() {
		return jTextFieldFInicio;
	}


	public void setjTextFieldFInicio(javax.swing.JTextField jTextFieldFInicio) {
		this.jTextFieldFInicio = jTextFieldFInicio;
	}


	public javax.swing.JTextField getjTextFieldHoras() {
		return jTextFieldHoras;
	}


	public void setjTextFieldHoras(javax.swing.JTextField jTextFieldHoras) {
		this.jTextFieldHoras = jTextFieldHoras;
	}


	public javax.swing.JTextField getjTextFieldIncipcion() {
		return jTextFieldIncipcion;
	}


	public void setjTextFieldIncipcion(javax.swing.JTextField jTextFieldIncipcion) {
		this.jTextFieldIncipcion = jTextFieldIncipcion;
	}


	public javax.swing.JTextField getjTextFieldInstitucion() {
		return jTextFieldInstitucion;
	}


	public void setjTextFieldInstitucion(javax.swing.JTextField jTextFieldInstitucion) {
		this.jTextFieldInstitucion = jTextFieldInstitucion;
	}


	public javax.swing.JTextField getjTextFieldModalidad() {
		return jTextFieldModalidad;
	}


	public void setjTextFieldModalidad(javax.swing.JTextField jTextFieldModalidad) {
		this.jTextFieldModalidad = jTextFieldModalidad;
	}


	public javax.swing.JTextField getjTextFieldNAlumnos() {
		return jTextFieldNAlumnos;
	}


	public void setjTextFieldNAlumnos(javax.swing.JTextField jTextFieldNAlumnos) {
		this.jTextFieldNAlumnos = jTextFieldNAlumnos;
	}


	public javax.swing.JTextField getjTextFieldNivel() {
		return jTextFieldNivel;
	}


	public void setjTextFieldNivel(javax.swing.JTextField jTextFieldNivel) {
		this.jTextFieldNivel = jTextFieldNivel;
	}


	public javax.swing.JTextField getjTextFieldNombre() {
		return jTextFieldNombre;
	}


	public void setjTextFieldNombre(javax.swing.JTextField jTextFieldNombre) {
		this.jTextFieldNombre = jTextFieldNombre;
	}


	public javax.swing.JTextField getjTextFieldPassword() {
		return jTextFieldPassword;
	}


	public void setjTextFieldPassword(javax.swing.JTextField jTextFieldPassword) {
		this.jTextFieldPassword = jTextFieldPassword;
	}


	public javax.swing.JTextField getjTextFieldPrecio() {
		return jTextFieldPrecio;
	}


	public void setjTextFieldPrecio(javax.swing.JTextField jTextFieldPrecio) {
		this.jTextFieldPrecio = jTextFieldPrecio;
	}


	public javax.swing.JTextField getjTextFieldProfesor() {
		return jTextFieldProfesor;
	}


	public void setjTextFieldProfesor(javax.swing.JTextField jTextFieldProfesor) {
		this.jTextFieldProfesor = jTextFieldProfesor;
	}
    
    //
}
