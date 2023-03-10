package noPaneles;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class funciones {
    
    public void cargarTabla(ArrayList<Persona> listaPersonas, JTable tablaACargar){
        for(int i=0;i<listaPersonas.size();i++){
            DefaultTableModel modelo = (DefaultTableModel) tablaACargar.getModel();
            modelo.addRow(new Object[]{listaPersonas.get(i).getId(), listaPersonas.get(i).getNombre(), listaPersonas.get(i).getApellidos(), listaPersonas.get(i).getAñoNac(), listaPersonas.get(i).getCorreo(), listaPersonas.get(i).getContraseña()});
        }
    }
    
    public boolean personaEsValida(Persona persona, ArrayList<Integer> listaIDs){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
        return Integer.toString(persona.getAñoNac()).matches("[-]*[0-9]*") && Integer.toString(persona.getEdad()).matches("[-]*[0-9]*") && Integer.toString(persona.getId()).matches("[-]*[0-9]*")  && !listaIDs.contains(persona.getId());
                                                                                                                                                                                                                                                                     
    }                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                                                                                                                                                                             
}                                                                                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      