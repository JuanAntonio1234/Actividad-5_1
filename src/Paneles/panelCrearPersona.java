package Paneles;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import noPaneles.Persona;
import noPaneles.funciones;


public class panelCrearPersona extends javax.swing.JPanel {
    
    private final JMenuBar menuBar;
    
    ArrayList<Persona> listaPersonas = new ArrayList<>();
    ArrayList<Integer> listaIDs = new ArrayList<>();
    funciones f = new funciones();

    
    public panelCrearPersona(JMenuBar menuBarInicio, ArrayList<Persona> listaPersonas) {
        initComponents();
        this.menuBar = menuBarInicio;
        this.listaPersonas = listaPersonas;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoNombre = new javax.swing.JTextField();
        campoApellidos = new javax.swing.JTextField();
        campoAñoNac = new javax.swing.JTextField();
        campoID = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        textoNombre = new javax.swing.JLabel();
        textoAñoNac = new javax.swing.JLabel();
        textoApellidos = new javax.swing.JLabel();
        textoFORMULARIO = new javax.swing.JLabel();
        textoID = new javax.swing.JLabel();
        textoCorreo = new javax.swing.JLabel();
        textoContraseña = new javax.swing.JLabel();
        crearPersona = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPersonas = new javax.swing.JTable();
        campoContraseña = new javax.swing.JPasswordField();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });

        campoApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoApellidosActionPerformed(evt);
            }
        });

        campoAñoNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAñoNacActionPerformed(evt);
            }
        });

        campoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIDActionPerformed(evt);
            }
        });

        campoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCorreoActionPerformed(evt);
            }
        });

        textoNombre.setText("Nombre");

        textoAñoNac.setText("Año nacimiento");

        textoApellidos.setText("Apellidos");

        textoFORMULARIO.setText("FORMULARIO CREAR PERSONAS");
        textoFORMULARIO.setToolTipText("");

        textoID.setText("ID");

        textoCorreo.setText("Correo");

        textoContraseña.setText("Contraseña");

        crearPersona.setText("Crear persona");
        crearPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPersonaActionPerformed(evt);
            }
        });

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        tablaPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellidos", "Año nacimiento", "Correo", "Contraseña"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaPersonas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tablaPersonasFocusGained(evt);
            }
        });
        tablaPersonas.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tablaPersonasComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPersonas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(Volver))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textoID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textoNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textoApellidos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(crearPersona)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textoAñoNac)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoAñoNac, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(textoCorreo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(textoContraseña)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(textoFORMULARIO)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoFORMULARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoID)
                    .addComponent(textoNombre)
                    .addComponent(textoApellidos)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCorreo)
                    .addComponent(textoContraseña)
                    .addComponent(textoAñoNac)
                    .addComponent(campoAñoNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Volver)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(crearPersona)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    

    private void crearPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPersonaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tablaPersonas.getModel();
        
        
        
        Persona p1 = new Persona();
        p1.setId(Integer.parseInt(campoID.getText()));
        p1.setNombre(campoNombre.getText());
        p1.setApellidos(campoApellidos.getText());
        p1.setCorreo(campoCorreo.getText());
        p1.setAñoNac(Integer.parseInt(campoAñoNac.getText()));
        p1.setContraseña(campoContraseña.getText());
        
        if(f.personaEsValida(p1, listaIDs)){
            listaPersonas.add(p1);
            listaIDs.add(Integer.valueOf(campoID.getText()));
            JFrame popUp = new JFrame();
            JOptionPane.showMessageDialog(popUp, "Persona creada correctamente");
            modelo.addRow(new Object[]{p1.getId(), p1.getNombre(), p1.getApellidos(), p1.getAñoNac(), p1.getCorreo(), p1.getContraseña()});
        }
        else{
            JFrame popUp = new JFrame();
            if(listaIDs.contains(campoID.getText())){
                JOptionPane.showMessageDialog(popUp, "El ID " +campoID.getText() + " ya está asignado.");
            }
            else if(!campoID.getText().matches("[-]*[0-9]*")){
                JOptionPane.showMessageDialog(popUp, "El ID debe ser un número.");
            }
            
            else if(!campoAñoNac.getText().matches("[-]*[0-9]*")){
                JOptionPane.showMessageDialog(popUp, "El año de nacimiento debe ser un número.");
            }
        }
        
        
    }//GEN-LAST:event_crearPersonaActionPerformed

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void campoApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoApellidosActionPerformed

    private void campoAñoNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAñoNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAñoNacActionPerformed

    private void campoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIDActionPerformed

    private void campoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCorreoActionPerformed

    }//GEN-LAST:event_campoCorreoActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        menuBar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VolverActionPerformed

    private void tablaPersonasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tablaPersonasFocusGained

    }//GEN-LAST:event_tablaPersonasFocusGained

    private void tablaPersonasComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tablaPersonasComponentShown

    }//GEN-LAST:event_tablaPersonasComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        if(!listaPersonas.isEmpty()){
            f.cargarTabla(listaPersonas, tablaPersonas);
        }
    }//GEN-LAST:event_formComponentShown

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoAñoNac;
    private javax.swing.JPasswordField campoContraseña;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JButton crearPersona;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPersonas;
    private javax.swing.JLabel textoApellidos;
    private javax.swing.JLabel textoAñoNac;
    private javax.swing.JLabel textoContraseña;
    private javax.swing.JLabel textoCorreo;
    private javax.swing.JLabel textoFORMULARIO;
    private javax.swing.JLabel textoID;
    private javax.swing.JLabel textoNombre;
    // End of variables declaration//GEN-END:variables
}
