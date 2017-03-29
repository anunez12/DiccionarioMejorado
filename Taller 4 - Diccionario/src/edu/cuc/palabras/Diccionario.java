package edu.cuc.palabras;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexisdelahoz
 */
public class Diccionario {
    private ArrayList<Palabra> listadoPalabras = new ArrayList<>();
    
    public void adicionarPalabra(Palabra palabraNueva) {
        listadoPalabras.add(palabraNueva);
    }
    
    public boolean buscarPalabra(Palabra palabraNueva) {
        return listadoPalabras.contains(palabraNueva);
    }
    
    public Palabra buscarPalabra(String palabra) {
        for (int i = 0; i < listadoPalabras.size(); i++) {
            Palabra actual = listadoPalabras.get(i);
            if (actual.getPalabra().equals(palabra)) {
                return actual;
            }
        }
        return null;
    }
    
    public boolean eliminarPalabra(Palabra palabraNueva) {
        return listadoPalabras.remove(palabraNueva);
    }

    @Override
    public String toString() {
        return "Diccionario{" + "listadoPalabras=" + listadoPalabras + '}';
    }
    
     /**
     * Metodo para mostrar los sinonimos en un modelo de JTable
     */
    public DefaultTableModel getListSinonimos() {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] titulosColumnas = {"Palabra", "Significado", "Cant. Sinonimos"};
        modelo.setColumnIdentifiers(titulosColumnas);
        for (int i = 0; i < listadoPalabras.size(); i++) {
            Palabra actual = listadoPalabras.get(i);
            String[] contenidoPalabra = {actual.getPalabra(), 
                                         actual.getSignificado(), 
                                         ""+actual.cantidadSinonimos()};
            modelo.addRow(contenidoPalabra);
        }
        
        return modelo;
    }
}
