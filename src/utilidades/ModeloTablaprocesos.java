/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Julie
 */
public class ModeloTablaprocesos extends DefaultTableModel{
    String [] titulos;
    Object [][] datos;
    
    public ModeloTablaprocesos(Object [][] datos, String[] titulos){
        super();
        this.titulos=titulos;
        this.datos=datos;
        setDataVector(datos, titulos);
    }
    
}
