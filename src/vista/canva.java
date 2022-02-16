/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Julie
 */
import fcfsjava.Proceso;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class canva extends Canvas   {
     private boolean mTrucking;
     private ArrayList<Proceso> procesos;
    
     public canva(){
         this.procesos=new ArrayList<Proceso>();
     
     }
     
     public void actualizar(ArrayList<Proceso> procesos){
         this.procesos=procesos;
         repaint();
     }
   
          public void stop() {
    mTrucking = false;
  }

	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(Color.RED);
		g2d.fillRect(0, 0, 500, 28);
		 g2d.setColor(Color.BLACK);
		g2d.drawString("ID", 10, 20);
                g2d.drawString("T.LLegada", 50, 20);
                g2d.drawString("Rafaga", 120, 20);
                g2d.drawString("T.Com", 180, 20);
                g2d.drawString("T.Final", 240, 20);
                g2d.drawString("T.Retorno", 300, 20);
                g2d.drawString("T.Retorno", 360, 20);
                g2d.drawString("Estado", 430, 20);
                for(int i=0;i<procesos.size();i++){
                    g2d.setColor(Color.lightGray);
                    g2d.fillRect(0, 30+(30*i), 500, 30);
                    g2d.setColor(Color.BLACK);
		g2d.drawString(procesos.get(i).getId(), 10, 40+(30*i));
                g2d.drawString(Integer.toString(procesos.get(i).gettLlegada()), 50, 40+(30*i));
                g2d.drawString(Integer.toString(procesos.get(i).getRafaga()), 120, 40+(30*i));
                g2d.drawString(procesos.get(i).gettComienzo(), 180, 40+(30*i));
                g2d.drawString(procesos.get(i).gettFinal(), 240, 40+(30*i));
                g2d.drawString(procesos.get(i).gettRetorno(), 300, 40+(30*i));
                g2d.drawString(procesos.get(i).gettEspera(), 360, 40+(30*i));
                g2d.drawString(procesos.get(i).getEstado(), 430, 40+(30*i));
                    
                }
                g2d.drawString("", TOP_ALIGNMENT, TOP_ALIGNMENT);	
                
                

		
	}

   
     
	
}
