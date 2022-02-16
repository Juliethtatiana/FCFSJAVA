/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcfsjava;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.canva;

/**
 *
 * @author Julie
 */
public class Logica implements Runnable {
    private ArrayList<Proceso> procesos ;
    private ArrayList<Proceso> colaBloqueados;
    private canva tablaProcesos;
    private int ultmProceso=0;
    public Logica( canva tablaProcesos){
        procesos = new ArrayList<Proceso> ();
        this.tablaProcesos =tablaProcesos;
    }
    
    public void start(int numprocesos){
        int tLl=0;
        for(int i=0;i<numprocesos;i++){
            procesos.add(new Proceso(Integer.toString(i), tLl, (int) Math.floor(Math.random()*(10000-1000+1)+1000)));
            tLl+=1000;
        }
        Thread t = new Thread(this);
        t.start();
    
    }
   

    public ArrayList<Proceso> getProcesos() {
        return procesos;
    }

    public void setProcesos(ArrayList<Proceso> procesos) {
        this.procesos = procesos;
    }

    @Override
    public void run() {
        while(procesos.get(ultmProceso).getEstado().equals("inactivo")){
            tablaProcesos.actualizar(procesos);
            try {
                Thread.sleep(procesos.get(ultmProceso).getRafaga());
            } catch (InterruptedException ex) {
                Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
            }
            procesos.get(ultmProceso).setEstado("activo");
            
       ultmProceso++;
        
        }
        
    }
    
}
