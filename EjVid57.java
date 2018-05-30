/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import javax.swing.*;

import java.awt.*;


public class EjVid57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MarcoCentrado miMarco=new MarcoCentrado();
        
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        miMarco.setVisible(true);
    }
    
}

class MarcoCentrado extends JFrame{
    
    public MarcoCentrado(){
        
        Toolkit miPantalla=Toolkit.getDefaultToolkit();
        
        Dimension tamanoPantalla=miPantalla.getScreenSize();
        
        int alturaPantalla=tamanoPantalla.height;
        
        int anchoPantalla=tamanoPantalla.width;
        
        setSize(anchoPantalla/2, alturaPantalla/2);
        
        setLocation(anchoPantalla/4, alturaPantalla/4);
        
        setTitle("Marco Centrado");
        
        Image miIcono=miPantalla.getImage("src//graficos//icono.jpg");
        
        setIconImage(miIcono);
        
    }
    
}
