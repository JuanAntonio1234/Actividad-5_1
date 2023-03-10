package Paneles;


import Paneles.buscarPersona;
import Paneles.editarPersona;
import Paneles.eliminarPersona;
import java.io.*;
import java.util.*;
import javax.swing.*;
import noPaneles.*;

public class Inicio extends javax.swing.JFrame {
    
    panelCrearPersona formPersonas;
    buscarPersona buscarPersonas;
    editarPersona editarPersonas;
    eliminarPersona eliminarPersonas;
    ArrayList<Persona> listaPersonas = new ArrayList<>();
    
    public Inicio(){
        initComponents();
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraMenu = new javax.swing.JMenuBar();
        opcionesPersona = new javax.swing.JMenu();
        añadirPersona = new javax.swing.JMenuItem();
        buscarPersona = new javax.swing.JMenuItem();
        editarPersona = new javax.swing.JMenuItem();
        eliminarPersona = new javax.swing.JMenuItem();
        exportarPersonas = new javax.swing.JMenu();
        crearFicheroTexto = new javax.swing.JMenuItem();
        crearXML = new javax.swing.JMenuItem();
        crearJSON = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        opcionesPersona.setText("Opciones Persona");

        añadirPersona.setText("Añadir persona");
        añadirPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirPersonaActionPerformed(evt);
            }
        });
        opcionesPersona.add(añadirPersona);

        buscarPersona.setText("Buscar persona por ID");
        buscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPersonaActionPerformed(evt);
            }
        });
        opcionesPersona.add(buscarPersona);

        editarPersona.setText("Editar persona");
        editarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarPersonaActionPerformed(evt);
            }
        });
        opcionesPersona.add(editarPersona);

        eliminarPersona.setText("Eliminar persona");
        eliminarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPersonaActionPerformed(evt);
            }
        });
        opcionesPersona.add(eliminarPersona);

        barraMenu.add(opcionesPersona);

        exportarPersonas.setText("Exportar Personas");

        crearFicheroTexto.setText("Crear fichero texto");
        crearFicheroTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearFicheroTextoActionPerformed(evt);
            }
        });
        exportarPersonas.add(crearFicheroTexto);

        crearXML.setText("Crear XML");
        crearXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearXMLActionPerformed(evt);
            }
        });
        exportarPersonas.add(crearXML);

        crearJSON.setText("Crear JSON");
        exportarPersonas.add(crearJSON);

        barraMenu.add(exportarPersonas);

        Salir.setText("Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        barraMenu.add(Salir);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearFicheroTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearFicheroTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearFicheroTextoActionPerformed

    public  JMenuBar getBarraMenu(){
    return barraMenu;    
    }
    
    private void añadirPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirPersonaActionPerformed
        barraMenu.setVisible(false);
        formPersonas = new panelCrearPersona(barraMenu, listaPersonas);
        formPersonas.setVisible(false);
        this.getContentPane().add(formPersonas);
        formPersonas.setVisible(true);
        this.pack();
    }//GEN-LAST:event_añadirPersonaActionPerformed

    
    private void crearXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearXMLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearXMLActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(1);
    }//GEN-LAST:event_SalirActionPerformed

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(1);
    }//GEN-LAST:event_SalirMouseClicked

    private void buscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPersonaActionPerformed
        barraMenu.setVisible(false);
        buscarPersonas = new buscarPersona(barraMenu);
        buscarPersonas.setVisible(false);
        this.getContentPane().add(buscarPersonas);
        buscarPersonas.setVisible(true);
        this.pack();
    }//GEN-LAST:event_buscarPersonaActionPerformed

    private void editarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarPersonaActionPerformed
        barraMenu.setVisible(false);
        editarPersonas = new editarPersona(barraMenu);
        editarPersonas.setVisible(false);
        this.getContentPane().add(editarPersonas);
        editarPersonas.setVisible(true);
        this.pack();
    }//GEN-LAST:event_editarPersonaActionPerformed

    private void eliminarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPersonaActionPerformed
        barraMenu.setVisible(false);
        eliminarPersonas = new eliminarPersona(barraMenu);
        eliminarPersonas.setVisible(false);
        this.getContentPane().add(eliminarPersonas);
        eliminarPersonas.setVisible(true);
        this.pack();
    }//GEN-LAST:event_eliminarPersonaActionPerformed
           

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Salir;
    private javax.swing.JMenuItem añadirPersona;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem buscarPersona;
    private javax.swing.JMenuItem crearFicheroTexto;
    private javax.swing.JMenuItem crearJSON;
    private javax.swing.JMenuItem crearXML;
    private javax.swing.JMenuItem editarPersona;
    private javax.swing.JMenuItem eliminarPersona;
    private javax.swing.JMenu exportarPersonas;
    private javax.swing.JMenu opcionesPersona;
    // End of variables declaration//GEN-END:variables
}