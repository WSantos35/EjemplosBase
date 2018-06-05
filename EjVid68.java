/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Administrador1
 */
public class EjVid68 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoVentana miMarco=new MarcoVentana();
        
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        miMarco.setTitle("Ventana 1");
        
        miMarco.setBounds(300, 300, 500, 350);
        
        MarcoVentana miMarco2=new MarcoVentana();
        
        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        miMarco2.setTitle("Ventana 2");
        
        miMarco2.setBounds(900, 300, 500, 350);
    }
    
}

class MarcoVentana extends JFrame{
    
    public MarcoVentana(){
        inicializarComponentes();
        
        /*
        M_Ventana oyenteVentana=new M_Ventana();
        
        addWindowListener(oyenteVentana);
        */
        addWindowListener(new M_Ventana());
    }
    
    public void inicializarComponentes(){
//        setTitle("Respondiendo");
//        
//        setBounds(300,300,500,350);
        
        setVisible(true);
        
    }
    
}

class M_Ventana /*implements WindowListener*/ extends WindowAdapter{
    
    /*
    public void windowActivated(WindowEvent e){
       
        System.out.println("Ventana Activada");
    }
    
    public void windowClosed(WindowEvent e){
        System.out.println("La ventana a sido cerrada");
    }
    
    public void windowClosing(WindowEvent e){
        System.out.println("Cerrando Ventana");
    }
    
    public void windowDeactivated(WindowEvent e){
        System.out.println("Ventana Desactivada");
    }
    
    public void windowDeiconified(WindowEvent e){
        System.out.println("Ventana Restaurada");
    }
    */
    public void windowIconified(WindowEvent e){
        System.out.println("Ventana Minimizada");
    }
    /*
    public void windowOpened(WindowEvent e){
        System.out.println("Ventana Abierta");
    }
    */
}