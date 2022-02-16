/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import fcfsjava.Logica;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Julie
 */
public class Index extends JFrame implements ActionListener{
    public JTextField numTarjeta;
    public JPanel panel;
    public JPanel paneltproc;
    public JLabel FCFSLbl;
    public canva tablaProceso;
    public JButton btnIniciar;
    public JButton btnBloquear;
    public JButton btnañadir;
    private Logica logica;
    
    //Funcion para cambiar un color de hexadecimal a entero
    private int hex( String color_hex )
    {
        return Integer.parseInt(color_hex,  16 );
    }
    
    
    public Index(){
        
        //Configuración de la ventana 
        setSize(1000,800);
        setTitle("FCFS");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
       btnIniciar= new JButton("iniciar");
        btnBloquear= new JButton("bloquear");
         btnañadir= new JButton("añadir");
        
        
        //Creacion del panel 
        btnIniciar.setBounds(530, 10, 100, 50);
        btnBloquear.setBounds(530, 70, 100, 50);
        btnañadir.setBounds(530, 130, 100, 50);
        
        
        tablaProceso= new canva();
        tablaProceso.setBounds(0, 10, 500, 300);
        logica = new Logica(tablaProceso);
        //Creacion de labels
        FCFSLbl = new JLabel("FCFS Algorithm");
        FCFSLbl.setFont(new Font("Serif",Font.PLAIN,15));
        
        
        btnIniciar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               
            logica.start(5);
            }
        });
        
       
        
        //Se agregan los componentes al panel
      
        this.add(FCFSLbl);
       
        this.add(tablaProceso);
        this.add(btnIniciar);
        this.add(btnBloquear);
        this.add(btnañadir);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
}
