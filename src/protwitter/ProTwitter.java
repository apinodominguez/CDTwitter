package protwitter;

import javax.swing.JOptionPane;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class ProTwitter {

    
    public static void main(String[] args) throws TwitterException {
        
        Procesos obx = new Procesos();
                int opcion;
        //Menú de opciones
        do{
            opcion =Integer.parseInt(JOptionPane.showInputDialog(null, "Elige opción\n"
                    + "1 -> Enviar tweet\n"
                    + "2 -> Mostrar TimeTable\n"
                    + "3 -> Buscar Tweet\n"
                    + "0 -> Salir"));
            
            switch(opcion){
                case 1:
                    obx.tweet();
                    break;
                case 2:
                    obx.historial();
                    break;
                case 3:
                    obx.buscarTweet(JOptionPane.showInputDialog(null, "Palabra a buscar"));
                    break;
            }
                  
        }while(opcion == 0);

    }

}
    
    

