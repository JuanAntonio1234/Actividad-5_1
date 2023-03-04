/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.awt.BorderLayout;

/**
 *
 * @author saagy
 */
public class main {

    /**
     * @param args the command line arguments
     */
 
  public static Inicio inicio;  
  
  public static void initComponentss() {
      
   inicio = new Inicio();
    
 }
  
  
    
    public static void main(String[] args) {
        // TODO code application logic here
        /* Create and display the form */
        
         initComponentss();
         inicio.setSize(800, 600);
         inicio.setResizable(true);
         inicio.getContentPane().setLayout(new BorderLayout());
         inicio.setVisible(true);
        
        
        
    }
    
}
