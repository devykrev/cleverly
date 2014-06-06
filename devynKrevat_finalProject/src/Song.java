
import java.util.ArrayList;

/*The MIT License (MIT)

Copyright (c) <year> <copyright holders>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devyn
 */
public class Song {
    Scale scale;
    Chord[] verse = new Chord[4];
    Chord[] chorus = new Chord[4];
    Chord[] bridge = new Chord[2];
    
    Note[]  verseMelody = new Note[16];
    Note[]  chorusMelody = new Note[16];
    Note[]  bridgeMelody = new Note[8];
      
      
    ArrayList<Note>[] chorusMelodies = new ArrayList[4];
    ArrayList<Note>[] verseMelodies = new ArrayList[4];
    ArrayList<Note>[] bridgeMelodies = new ArrayList[2];
    /**
     * This method takes in a scale and constructs two measures of melody for the bridge, using music theory and an array of ArrayLists of Notes. 
     * @param scale 
     */
    public void constructBridgeMelodies(Scale scale){
        int measureTime;
        int give;
        int time;
        int rNote;
        bridgeMelodies[0] = new ArrayList<Note>();
        bridgeMelodies[1] = new ArrayList<Note>();
        
        
        
        for(int i = 0; i<bridgeMelodies.length; i++){
            measureTime = 2000;
            
            while(measureTime > 0){
                
               give = (int)((Math.random()*5)); 
               rNote = (int)(Math.random()*7);
               
               if(give == 0){
                   
                   time = 2000;
                   if(time == measureTime){
                       
                      bridgeMelodies[i].add(new Note(scale.keyNotes[rNote].getNote(), scale.keyNotes[rNote].getName(), time));  
                      measureTime = measureTime - time;
                      
                   }               
               }
               
               if(give == 1){
                   time = 1000;
                   if(time <= measureTime){
                      bridgeMelodies[i].add(new Note(scale.keyNotes[rNote].getNote(), scale.keyNotes[rNote].getName(), time)); 
                      measureTime = measureTime - time;
                   }
               }
               
               if(give == 2 || give == 4){
                   
                   time = 500;
                   if(time <= measureTime){
                      bridgeMelodies[i].add(new Note(scale.keyNotes[rNote].getNote(), scale.keyNotes[rNote].getName(), time)); 
                      measureTime = measureTime - time;
                   }
               }
               
               if(give == 3){
                   time = 250;
                   if(time <= measureTime){
                      bridgeMelodies[i].add(new Note(scale.keyNotes[rNote].getNote(), scale.keyNotes[rNote].getName(), time));
                      measureTime = measureTime - time;
                   }
               }
               
//               if(give == 4){
//                   time = 125;
//                   if(time <= measureTime){
//                      bridgeMelodies[i].add(new Note(scale.keyNotes[rNote].getNote(), scale.keyNotes[rNote].getName(), time));  
//                      measureTime = measureTime - time;
//                   }
//               }
            }
        }
    }
    /**
     *  This method takes in a scale and constructs four measures of melody for the verse, using music theory and an array of ArrayLists of Notes. 
     * @param scale 
     */
    public void constructVerseMelodies(Scale scale){
        int measureTime;
        int give;
        int time;
        int rNote;
        verseMelodies[0] = new ArrayList<Note>();
        verseMelodies[1] = new ArrayList<Note>();
        verseMelodies[2] = new ArrayList<Note>();
        verseMelodies[3] = new ArrayList<Note>();
        
        
        for(int i = 0; i<verseMelodies.length; i++){
            measureTime = 2000;
            
            while(measureTime > 0){
                
               give = (int)((Math.random()*5)); 
               rNote = (int)(Math.random()*7);
               
               if(give == 0){
                   
                   time = 2000;
                   if(time == measureTime){
                       
                      verseMelodies[i].add(new Note(scale.keyNotes[rNote].getNote(), scale.keyNotes[rNote].getName(), time));  
                      measureTime = measureTime - time;
                      
                   }               
               }
               
               if(give == 1){
                   time = 1000;
                   if(time <= measureTime){
                      verseMelodies[i].add(new Note(scale.keyNotes[rNote].getNote(), scale.keyNotes[rNote].getName(), time)); 
                      measureTime = measureTime - time;
                   }
               }
               
               if(give == 2 || give == 4){
                   
                   time = 500;
                   if(time <= measureTime){
                      verseMelodies[i].add(new Note(scale.keyNotes[rNote].getNote(), scale.keyNotes[rNote].getName(), time)); 
                      measureTime = measureTime - time;
                   }
               }
               
               if(give == 3){
                   time = 250;
                   if(time <= measureTime){
                      verseMelodies[i].add(new Note(scale.keyNotes[rNote].getNote(), scale.keyNotes[rNote].getName(), time));
                      measureTime = measureTime - time;
                   }
               }
               
//               if(give == 4){
//                   time = 125;
//                   if(time <= measureTime){
//                      verseMelodies[i].add(new Note(scale.keyNotes[rNote].getNote(), scale.keyNotes[rNote].getName(), time));  
//                      measureTime = measureTime - time;
//                   }
//               }
            }
        }
    }
    /**
     * This method takes in a scale and constructs four measures of melody for the chorus, using music theory and an array of ArrayLists of Notes. 
     * @param scale 
     */
    public void constructChorusMelodies(Scale scale){
        int measureTime;
        int give;
        int time;
        int rNote;
        chorusMelodies[0] = new ArrayList<Note>();
        chorusMelodies[1] = new ArrayList<Note>();
        chorusMelodies[2] = new ArrayList<Note>();
        chorusMelodies[3] = new ArrayList<Note>();
        
        
        for(int i = 0; i<chorusMelodies.length; i++){
            measureTime = 2000;
            
            while(measureTime > 0){
                
               give = (int)((Math.random()*5)); 
               rNote = (int)(Math.random()*7);
               
               if(give == 0){
                   
                   time = 2000;
                   if(time == measureTime){
                       
                      chorusMelodies[i].add(new Note(scale.keyNotes[rNote].getNote(), scale.keyNotes[rNote].getName(), time));  
                      measureTime = measureTime - time;
                      
                   }               
               }
               
               if(give == 1){
                   time = 1000;
                   if(time <= measureTime){
                      chorusMelodies[i].add(new Note(scale.keyNotes[rNote].getNote(), scale.keyNotes[rNote].getName(), time)); 
                      measureTime = measureTime - time;
                   }
               }
               
               if(give == 2 || give == 4){
                   
                   time = 500;
                   if(time <= measureTime){
                      chorusMelodies[i].add(new Note(scale.keyNotes[rNote].getNote(), scale.keyNotes[rNote].getName(), time)); 
                      measureTime = measureTime - time;
                   }
               }
               
               if(give == 3){
                   time = 250;
                   if(time <= measureTime){
                      chorusMelodies[i].add(new Note(scale.keyNotes[rNote].getNote(), scale.keyNotes[rNote].getName(), time));
                      measureTime = measureTime - time;
                   }
               }
               //This is the if statement that would generate sixteenth notes. 
//               if(give == 4){
//                   time = 125;
//                   if(time <= measureTime){
//                      chorusMelodies[i].add(new Note(scale.keyNotes[rNote].getNote(), scale.keyNotes[rNote].getName(), time));  
//                      measureTime = measureTime - time;
//                   }
//               }
            }
        }
    }
    
   /**
    * The constructor for Song takes a key and a progression. The progression is left over from the original concept for the project that was less cool. The constructor accesses the 
    * available chords created in the Scale and randomly selects them. I have the first and last chords in a verse and chorus only be major chords so the song has a better chance of sounding
    * nice. I removed the possibility of accessing a diminished chord sound wonky at best and terrible with the musical set up here. 
    * @param key
    * @param progression 
    */ 
    public Song(Scale key, String progression){
         scale = key;
         //leftover form original project design 
        if(progression.equals("a")){
            int spin;
            spin = (int)(Math.random()*3);
            if(spin == 0){
                spin = 0;
            }
            if(spin == 1){
                spin = 3;
            }
             if(spin == 2){
                spin = 4;
            }
            
            verse[0] = key.availChords[spin];
            verse[1] = key.availChords[(int)(Math.random()*6)];
            verse[2] = key.availChords[(int)(Math.random()*6)];
            
            spin = (int)(Math.random()*3);
            if(spin == 0){
                spin = 0;
            }
            if(spin == 1){
                spin = 3;
            }
             if(spin == 2){
                spin = 4;
            }
            verse[3] = key.availChords[spin];
            
            for(int i = 0; i<verseMelody.length; i++){
                verseMelody[i] = new Note(key.keyNotes[(int)(Math.random()*7)].getNote(), key.keyNotes[(int)(Math.random()*7)].getName());
            }
            
            bridge[0] = key.availChords[(int)(Math.random()*6)];
            bridge[1] = key.availChords[(int)(Math.random()*6)];
            
            for(int i = 0; i<bridgeMelody.length; i++){
                bridgeMelody[i] = new Note(key.keyNotes[(int)(Math.random()*7)].getNote(), key.keyNotes[(int)(Math.random()*7)].getName());
            }
            
            spin = (int)(Math.random()*3);
            if(spin == 0){
                spin = 0;
            }
            if(spin == 1){
                spin = 3;
            }
             if(spin == 2){
                spin = 4;
            }
             
            chorus[0] = key.availChords[spin];
            chorus[1] = key.availChords[(int)(Math.random()*6)];
            chorus[2] = key.availChords[(int)(Math.random()*6)];
            
            spin = (int)(Math.random()*3);
            if(spin == 0){
                spin = 0;
            }
            if(spin == 1){
                spin = 3;
            }
             if(spin == 2){
                spin = 4;
            }
            chorus[3] = key.availChords[spin];
            
            for(int i = 0; i<chorusMelody.length; i++){
                chorusMelody[i] = new Note(key.keyNotes[(int)(Math.random()*7)].getNote(), key.keyNotes[(int)(Math.random()*7)].getName());
            }
            
            
        }
    }
    
    //main class to generate a random song without having to use the panel program
//    public static void main(String[] args) throws InterruptedException{
//        Song test = new Song(new Scale("c"), "a");
//        test.constructVerseMelodies(new Scale("c"));
//        test.constructBridgeMelodies(new Scale("c"));
//        test.constructChorusMelodies(new Scale("c"));
//        test.playSong();
//    }
    /*
    This method plays a measure of melody, then plays a chord, for the entire verse. Then it does the same thing for the chorus, then repeats the verse and the chorus. Then it plays
    the bridge twice before ending with the chorus.
    */
    public void playSong()  throws InterruptedException{
        for(int i = 0; i<verse.length; i++){
            for(int j = 0; j<verseMelodies[i].size(); j++){
                verseMelodies[i].get(j).playback();
            }
            if(i == 0){
                System.out.println("Verse: ");
            }
            System.out.println(verse[i].getName());
            verse[i].playback();
            
        }
        for(int i = 0; i<chorus.length; i++){

            for(int j = 0; j<chorusMelodies[i].size(); j++){
                chorusMelodies[i].get(j).playback();
            }
            if(i == 0){
                System.out.println("Chorus: ");
            }
            System.out.println(chorus[i].getName());
            chorus[i].playback();
            
        }
        for(int i = 0; i<verse.length; i++){

            for(int j = 0; j<verseMelodies[i].size(); j++){
                verseMelodies[i].get(j).playback();
            }
            if(i == 0){
                System.out.println("Verse: ");
            }
            System.out.println(verse[i].getName());
            verse[i].playback();
            
        }
        for(int i = 0; i<chorus.length; i++){

            for(int j = 0; j<chorusMelodies[i].size(); j++){
                chorusMelodies[i].get(j).playback();
            }
            if(i == 0){
                System.out.println("Chorus: ");
            }
            System.out.println(chorus[i].getName());
            chorus[i].playback();
            
        }
        for(int i = 0; i<bridge.length; i++){

            for(int j = 0; j<bridgeMelodies[i].size(); j++){
                bridgeMelodies[i].get(j).playback();
            }
            if(i == 0){
                System.out.println("Bridge: ");
            }
            System.out.println(bridge[i].getName());
            bridge[i].playback();
            
            
        }
        for(int i = 0; i<bridge.length; i++){

            for(int j = 0; j<bridgeMelodies[i].size(); j++){
                bridgeMelodies[i].get(j).playback();
            }
            System.out.println(bridge[i].getName());
            bridge[i].playback();
            
        }
        for(int i = 0; i<chorus.length; i++){

            for(int j = 0; j<chorusMelodies[i].size(); j++){
                chorusMelodies[i].get(j).playback();
            }
            if(i == 0){
                System.out.println("Chorus: ");
            }
            System.out.println(chorus[i].getName());
            chorus[i].playback();
            
        }
    }
}
