import sun.audio.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Sound {
    public static void main(String[] args)
    {
       JFrame frame = new JFrame();
       frame.setSize(200,200);
       frame.setLocationRelativeTo(null);
       JButton button = new JButton("Click Me");
       frame.add(button);
       button.addActionListener(new AL());
       frame.show(true);
       
    }
    public static class AL implements ActionListener{
      @Override
      public final void actionPerformed(ActionEvent e) {
          music();
      }}
    
    public static void music()
    {
     AudioPlayer MGP = AudioPlayer.player;
     AudioStream BGM;
     AudioData MD;
     ContinuousAudioDataStream loop = null;
     
     try{
     BGM = new AudioStream (new FileInputStream("Beyonce_Jealous.mp3"));
     MD = BGM.getData();
     loop = new ContinuousAudioDataStream(MD);
    }catch(IOException error){        
     
    }
     
     MGP.start(loop);
    }
    
}
       
     