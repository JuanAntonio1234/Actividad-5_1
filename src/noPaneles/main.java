package noPaneles;


import Paneles.Inicio;
import java.util.ArrayList;
import java.awt.BorderLayout;


public class main {
 
    public static Inicio inicio; 
    public ArrayList<Persona> listaPersonas = new ArrayList<>();
  
    public static void initComponentss() {
        inicio = new Inicio();
    }
  
    public static void main(String[] args) {
         initComponentss();
         inicio.setSize(800, 600);
         inicio.setResizable(true);
         inicio.getContentPane().setLayout(new BorderLayout());
         inicio.setVisible(true);
    }
    
}
