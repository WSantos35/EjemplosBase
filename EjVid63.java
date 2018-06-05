
package Ejemplos;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.imageio.*;
/**
 *
 * @author Administrador1
 */
public class EjVid63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoImagen miMarco=new MarcoImagen();
        
        
    }
    
}

class MarcoImagen extends JFrame{
    
    public MarcoImagen(){
      iniciarComponentes(); 
      
      LaminaImagen miLamina=new LaminaImagen();
      
      add(miLamina);
    }
    
    public void iniciarComponentes(){
        setBounds(750, 300, 300, 300);
        
        setTitle("Marco con Imagen");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }
    
}


class LaminaImagen extends JPanel{
    
    public LaminaImagen(){
        try{
            
            imagen=ImageIO.read(new File("src/graficos/icono2.png"));
            
        }catch(Exception e){
            System.out.println("Error al cargar Imagen");
        }
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
//        try{
//            
////            File miImagen=new File("src/graficos/icono1.jpg");
//        
//            imagen=ImageIO.read(new File("src/graficos/icono2.png"));
//            
//        }catch(Exception e){
//            System.out.println("Error al cargar Imagen");
//        }
        
        int anchoImagen=imagen.getWidth(this);
        
        int altoImagen=imagen.getHeight(this);
        
        g.drawImage(imagen, 0, 0, null);
        
        for(int i=0;i<500;i++){
            
           for(int j=0;j<500;j++){
               
               if(i+j>0){
                   
               g.copyArea(0, 0, anchoImagen, altoImagen, i*anchoImagen, j*altoImagen);
               
               }
           }
            
        }
        
        
    }
    
    private Image imagen;
}
