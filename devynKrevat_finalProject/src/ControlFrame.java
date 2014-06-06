

// ControlFrame.java
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class ControlFrame extends JFrame
{ 
  private JPanel mainPanel;
  private final JPanel calcPanel;
  private JPanel songPanel;
  private JPanel soundPanel;
  private JSlider widthJSlider;
 
  
  private String xStr;
  private String yStr;
  
  public ControlFrame(String title)
  {
    super( title );
    mainPanel = new JPanel( new BorderLayout() );
    mainPanel.setSize(200, 250);    
    
    calcPanel = new JPanel( new FlowLayout() );    
    calcPanel.setSize(200, 200);    

       
    
   
    
    final SoundControlPanel soundPanel = new SoundControlPanel();
    soundPanel.setSize(200, 200);   
    
    
    
    this.setContentPane( mainPanel );
    
    JMenu fileMenu = new JMenu( "File" );
    fileMenu.setMnemonic( 'F' );
    JMenuItem aboutItem = new JMenuItem( "About..." );
    aboutItem.setMnemonic( 'A' );
    final JMenu playSoundItem = new JMenu( " Play Song " );
    fileMenu.add( aboutItem );
    
    
    final JMenuBar bar = new JMenuBar();  // Create a JMenuBar so we can attach menus to it.
    setJMenuBar( bar );  // Attach the JMenuBar to the ControlFrame.
    bar.add( fileMenu );  // Add the file menu to the JMenuBar.
  
    aboutItem.addActionListener(
      new ActionListener()  // Beginning of anonymous inner class
      {
        public void actionPerformed( ActionEvent event )
        {
          JOptionPane.showMessageDialog( ControlFrame.this,
                                      "This project generates a random song in whatever key the user chooses.",
                                      "About", JOptionPane.PLAIN_MESSAGE );
        }
     }  // End of anonymous inner class
    );
      
   final JMenu soundMenu = new JMenu( " Key ");
    soundMenu.setMnemonic('S');
  
  
    JMenuItem playItem = new JMenuItem("Play");
    playSoundItem.add(playItem);
    
   /**
    *  All the action listeners in this class construct songs in the given key.
    */      
    JMenuItem f = new JMenuItem( "F" );
    soundMenu.add( f );
    f.addActionListener(
      new ActionListener()  // Beginning of anonymous inner class
      {
        public void actionPerformed( ActionEvent event )
        {
          soundPanel.pickKey("f");
           soundPanel.constructSong();
           bar.add( playSoundItem );
           validate();
          repaint();
        }
     }  // End of anonymous inner class
    );
    
    JMenuItem fs = new JMenuItem( "F#" );
    soundMenu.add( fs );
    fs.addActionListener(
      new ActionListener()  // Beginning of anonymous inner class
      {
        public void actionPerformed( ActionEvent event )
        {
          soundPanel.pickKey("fs"); 
          soundPanel.constructSong();
          bar.add( playSoundItem );
          validate();
          repaint();
        }
     }  // End of anonymous inner class
    );
    
    JMenuItem g = new JMenuItem( "G" );
    soundMenu.add( g );
    g.addActionListener(
      new ActionListener()  // Beginning of anonymous inner class
      {
        public void actionPerformed( ActionEvent event )
        {
          soundPanel.pickKey("g");
          soundPanel.constructSong();
           bar.add( playSoundItem );
           validate();
          repaint();
        }
     }  // End of anonymous inner class
    );
    
    JMenuItem gs = new JMenuItem( "G#" );
    soundMenu.add( gs );
    gs.addActionListener(
      new ActionListener()  // Beginning of anonymous inner class
      {
        public void actionPerformed( ActionEvent event )
        {
          soundPanel.pickKey("gs");
          soundPanel.constructSong();
           bar.add( playSoundItem );
           validate();
          repaint();
        }
     }  // End of anonymous inner class
    );
    
    JMenuItem a = new JMenuItem( "A" );
    soundMenu.add(a  );
    a.addActionListener(
      new ActionListener()  // Beginning of anonymous inner class
      {
        public void actionPerformed( ActionEvent event )
        {
          soundPanel.pickKey("a");
          soundPanel.constructSong();
           bar.add( playSoundItem );
           validate();
          repaint();
        }
     }  // End of anonymous inner class
    );
    
     JMenuItem as = new JMenuItem( "A#" );
    soundMenu.add(as  );
    as.addActionListener(
      new ActionListener()  // Beginning of anonymous inner class
      {
        public void actionPerformed( ActionEvent event )
        {
          soundPanel.pickKey("as");
          soundPanel.constructSong();
           bar.add( playSoundItem );
           validate();
          repaint();
        }
     }  // End of anonymous inner class
    );
    
    JMenuItem b = new JMenuItem( "B" );
    soundMenu.add(b);
    b.addActionListener(
      new ActionListener()  // Beginning of anonymous inner class
      {
        public void actionPerformed( ActionEvent event )
        {
          soundPanel.pickKey("b");
          soundPanel.constructSong();
           bar.add( playSoundItem );
           validate();
          repaint();
        }
     }  // End of anonymous inner class
    );
    
    JMenuItem c = new JMenuItem( "C" );
    soundMenu.add(c);
    c.addActionListener(
      new ActionListener()  // Beginning of anonymous inner class
      {
        public void actionPerformed( ActionEvent event )
        {
          soundPanel.pickKey("c");
          soundPanel.constructSong();
           bar.add( playSoundItem );
           validate();
          repaint();
        }
     }  // End of anonymous inner class
    );
    
    JMenuItem cs = new JMenuItem( "C#" );
    soundMenu.add(cs);
    cs.addActionListener(
      new ActionListener()  // Beginning of anonymous inner class
      {
        public void actionPerformed( ActionEvent event )
        {
          soundPanel.pickKey("cs");
          soundPanel.constructSong();
           bar.add( playSoundItem );
           validate();
          repaint();
        }
     }  // End of anonymous inner class
    );
    
    JMenuItem d = new JMenuItem( "D" );
    soundMenu.add(d);
    d.addActionListener(
      new ActionListener()  // Beginning of anonymous inner class
      {
        public void actionPerformed( ActionEvent event )
        {
          soundPanel.pickKey("d");
          soundPanel.constructSong();
           bar.add( playSoundItem );
           validate();
          repaint();
        }
     }  // End of anonymous inner class
    );
    
    JMenuItem ds = new JMenuItem( "D#" );
    soundMenu.add(ds);
    ds.addActionListener(
      new ActionListener()  // Beginning of anonymous inner class
      {
        public void actionPerformed( ActionEvent event )
        {
          soundPanel.pickKey("ds");
          soundPanel.constructSong();
           bar.add( playSoundItem );
           validate();
          repaint();
        }
     }  // End of anonymous inner class
    );
    
    JMenuItem e = new JMenuItem( "E" );
    soundMenu.add(e);
    e.addActionListener(
      new ActionListener()  // Beginning of anonymous inner class
      {
        public void actionPerformed( ActionEvent event )
        {
          soundPanel.pickKey("e");
          soundPanel.constructSong();
          bar.add( playSoundItem );
          validate();
          repaint();
          
          
        }
     }  // End of anonymous inner class
    );
    
    
 
   
    
    
   /**
    * Plays song.
    */
    playItem.addActionListener(
      new ActionListener()  // Beginning of anonymous inner class
      {
        public void actionPerformed( ActionEvent event ) 
        {
            try {
                soundPanel.playSound();
            } catch (InterruptedException ex) {
                Logger.getLogger(ControlFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
          soundPanel.repaint();
        }
     }  // End of anonymous inner class
    );
    
    
     
    JMenuItem makeSoundItem = new JMenuItem( "Create Song" );
    makeSoundItem.setMnemonic( 'S' );
    fileMenu.add( makeSoundItem );
    makeSoundItem.addActionListener(
      new ActionListener()
      {
        public void actionPerformed( ActionEvent event )
        {
            //adds the color Menu, which was defined earlier
          bar.add( soundMenu );  
          validate();
          repaint();
        }
      }
    );
    
    JMenuItem exitItem = new JMenuItem( "Exit" );
    exitItem.setMnemonic( 'x' );
    fileMenu.add( exitItem );
    exitItem.addActionListener(
      new ActionListener()
      {
        public void actionPerformed( ActionEvent event )
        {
          System.exit( 0 );
        }
      }
    );
  
    
   
    
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    setSize( 200, 250 );
    setVisible( true );
    validate();
  }
}  