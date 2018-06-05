
package Ejemplos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Administrador1
 * El Ejemplo empieza en el video 66
 */
public class EjVid65 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoBotones miMarco=new MarcoBotones();
        
    }
    
}

class MarcoBotones extends JFrame{
    
    public MarcoBotones(){
        iniciarComponentes();
        
        LaminaBotones miLamina=new LaminaBotones();
        
        add(miLamina);
    }
    
    public void iniciarComponentes(){
        setBounds(700, 300, 500, 300);
        
        setTitle("Botones y Eventos");
        
        setVisible(true);
        
        setResizable(false);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class LaminaBotones extends JPanel/* implements ActionListener*/{
    
    JButton botonAzul=new JButton("Azul");
    
    JButton botonAmarillo=new JButton("Amarillo");
    
    JButton botonRojo=new JButton("Rojo");
    
    public LaminaBotones(){
        add(botonAzul);
        
        add(botonAmarillo);
        
        add(botonRojo);
        
        ColorFondo Amarillo=new ColorFondo(Color.yellow);
        
        ColorFondo Azul=new ColorFondo(Color.blue);
        
        ColorFondo Rojo=new ColorFondo(Color.red);
        
        botonAzul.addActionListener(Azul);
        
        botonAmarillo.addActionListener(Amarillo);
        
        botonRojo.addActionListener(Rojo);
    }
    
//    public void actionPerformed(ActionEvent e){
//        Object botonPulsado=e.getSource();
//        
//        if(botonPulsado==botonAzul){
//            
//            setBackground(Color.blue);
//            
//        }else if(botonPulsado==botonAmarillo){
//            
//            setBackground(Color.yellow);
//            
//        }else{
//            setBackground(Color.red);
//        }
//    }

        private class ColorFondo implements ActionListener{

            public ColorFondo(Color c){

                colorFondo=c;

            }

            public void actionPerformed(ActionEvent e){
                setBackground(colorFondo);
            }

            private Color colorFondo;
        }
    
}

