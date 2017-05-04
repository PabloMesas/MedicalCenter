package GUI;


import clases.Conexion;
import java.awt.BorderLayout;
import java.sql.Connection;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan
 */
public class MenuDePaciente extends javax.swing.JPanel {

	/**
	 * Creates new form MenuDePaciente
	 */
	private Conexion con;
	private Connection reg;
	private MenuGestor menuGestor;
	private InterfazGrafica principal;
	private mostrarCitas mostrarCitas;

	public MenuDePaciente(Conexion con) {
		initComponents();
		this.con = con;
		this.reg = con.getCon();
		principal = new InterfazGrafica();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuOpciones = new javax.swing.JPanel();
        buttonMostrarCitas = new javax.swing.JButton();
        labelMenuDelPaciente = new javax.swing.JLabel();
        buttonPedirCita = new javax.swing.JButton();
        buttonCancelarCita = new javax.swing.JButton();
        buttonCambiarPaciente = new javax.swing.JButton();
        buttonModificarPaciente = new javax.swing.JButton();
        labelPacienteActual = new javax.swing.JLabel();
        mostrarDatos = new javax.swing.JPanel();

        menuOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 153)));

        buttonMostrarCitas.setText("Mostrar citas");
        buttonMostrarCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMostrarCitasActionPerformed(evt);
            }
        });

        labelMenuDelPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelMenuDelPaciente.setText("Menu del paciente:");

        buttonPedirCita.setText("Pedir cita");

        buttonCancelarCita.setText("Cancelar cita");

        buttonCambiarPaciente.setText("Cambiar de paciente");

        buttonModificarPaciente.setText("Modificar paciente");

        labelPacienteActual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelPacienteActual.setText("Paciente");

        javax.swing.GroupLayout menuOpcionesLayout = new javax.swing.GroupLayout(menuOpciones);
        menuOpciones.setLayout(menuOpcionesLayout);
        menuOpcionesLayout.setHorizontalGroup(
            menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuOpcionesLayout.createSequentialGroup()
                        .addComponent(labelMenuDelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelPacienteActual, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonMostrarCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPedirCita, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancelarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonModificarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCambiarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        menuOpcionesLayout.setVerticalGroup(
            menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMenuDelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPacienteActual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonCambiarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonMostrarCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonPedirCita, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonCancelarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonModificarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        mostrarDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        javax.swing.GroupLayout mostrarDatosLayout = new javax.swing.GroupLayout(mostrarDatos);
        mostrarDatos.setLayout(mostrarDatosLayout);
        mostrarDatosLayout.setHorizontalGroup(
            mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );
        mostrarDatosLayout.setVerticalGroup(
            mostrarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mostrarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mostrarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMostrarCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMostrarCitasActionPerformed
		mostrarCitas = new mostrarCitas(con);
		mostrarCitas.setSize(mostrarDatos.getWidth(), mostrarDatos.getHeight());
		mostrarCitas.setLocation(0, 0);
		
		mostrarDatos.removeAll();
		mostrarDatos.add(mostrarCitas, BorderLayout.CENTER);
        mostrarDatos.revalidate();
        mostrarDatos.repaint();
                                    
    }//GEN-LAST:event_buttonMostrarCitasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCambiarPaciente;
    private javax.swing.JButton buttonCancelarCita;
    private javax.swing.JButton buttonModificarPaciente;
    private javax.swing.JButton buttonMostrarCitas;
    private javax.swing.JButton buttonPedirCita;
    private javax.swing.JLabel labelMenuDelPaciente;
    private javax.swing.JLabel labelPacienteActual;
    private javax.swing.JPanel menuOpciones;
    private javax.swing.JPanel mostrarDatos;
    // End of variables declaration//GEN-END:variables
}
