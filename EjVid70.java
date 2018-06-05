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
public class EjVid70 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoEstado miMarco=new MarcoEstado();
        
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MarcoEstado extends JFrame{
    
    public MarcoEstado(){
        inicializarComponentes();
        
        CambiaEstado nuevoEstado=new CambiaEstado();
        
        addWindowStateListener(nuevoEstado);
    }
    
    public void inicializarComponentes(){
        setVisible(true);
        
        setBounds(300, 300, 500, 350);
    }
    
}

class CambiaEstado implements WindowStateListener{
    
    public void windowStateChanged(WindowEvent e){
        
//        System.out.println("La ventana a cambiado de estado");
        
//        System.out.println(e.getNewState());
        
        if(e.getNewState()==Frame.MAXIMIZED_BOTH){
            System.out.println("La ventana está a pantalla completa");
        }else if(e.getNewState()==Frame.NORMAL){
            System.out.println("La ventana está normal");
        }else if(e.getNewState()==Frame.ICONIFIED){
            System.out.println("La ventana está minimizada");
        }
        
    }
    
}
