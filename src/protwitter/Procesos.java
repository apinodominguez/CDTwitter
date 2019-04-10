
package protwitter;

import java.util.List;
import javax.swing.JOptionPane;
import twitter4j.DirectMessage;
import twitter4j.DirectMessageList;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class Procesos {
    
    //Crear tweet
    
    public void tweet() throws TwitterException {
        String latestStatus = JOptionPane.showInputDialog(null, "Escribe aqui el tweet: ");
        Twitter twitter = TwitterFactory.getSingleton();
        Status status = twitter.updateStatus(latestStatus);
        JOptionPane.showMessageDialog(null, "Se ha enviado el siguiente tweet: " + status.getText());
    }

    
    // Mostrar historial
    
    public void historial() throws TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();
        List<Status> stat = twitter.getHomeTimeline();
        System.out.println("Mostrando historial: ");
        for (Status status : stat) {
            System.out.println(status.getUser().getName() + ":"
                    + status.getText() + "\n");
        }
    }
    
    //buscar tweets
    
    public void buscarTweet(String busqueda) throws TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();
        Query query = new Query(busqueda);
        QueryResult result = twitter.search(query);
        for (Status status : result.getTweets()) {
            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText()+"\n");
        }
    }

}
