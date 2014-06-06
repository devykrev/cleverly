

// DrawImageControlPanel.java

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class SoundControlPanel extends JPanel
{
  
  String skey = "c";
  Song test;
  //pic.show();
 
  /**
   * Constructs the Sound Control Panel
   */
  public SoundControlPanel()
  {
    setSize( 600, 480 ); 
    
  }
  
   
   /**
    * Sets the scale for the song to be created in.
    * @param kale 
    */
   public void pickKey(String kale){
      skey = kale;
   }
   
   /**
    * Constructs a song in the designated key. Also creates and initializes the verse melodies, bridge melodies, and chorus melodies.
    * @throws InterruptedException 
    */
   public void constructSong(){
        test = new Song(new Scale(skey), "a");
        test.constructVerseMelodies(new Scale(skey));
        test.constructBridgeMelodies(new Scale(skey));
        test.constructChorusMelodies(new Scale(skey));
   }
   
   /**
    * Plays the song constructed previously.
    * @throws InterruptedException 
    */
   public void playSound() throws InterruptedException {
        test.playSong();
   }
  
  
  
}
