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
public class Chord {
    
    //make sound array
     Sound f = new Sound("src/f.wav");
    Sound fs = new Sound("src/fs.wav");
    Sound g = new Sound("src/g.wav");
    Sound gs = new Sound("src/gs.wav");
    Sound a = new Sound("src/a.wav");
    Sound as = new Sound("src/as.wav");
    Sound b = new Sound("src/b.wav");
    Sound c = new Sound("src/c.wav");
    Sound cs = new Sound("src/cs.wav");
    Sound d = new Sound("src/d.wav");
    Sound ds = new Sound("src/ds.wav");
    Sound e = new Sound("src/e.wav");
    
    private Note[] notes = {new Note(f, "f"), new Note(fs, "fs"), new Note(g, "g"), new Note(gs, "gs"), new Note(a, "a"), new Note(as, "as"), 
                              new Note(b, "b"), new Note(c, "c"), new Note(cs, "cs"), new Note(d, "d"), new Note(ds, "ds"), new Note(e, "e"), new Note(f, "f"),
                              new Note(fs, "fs"), new Note(g, "g"), new Note(gs, "gs"), new Note(a, "a"), new Note(as, "as"), 
                              new Note(b, "b"), new Note(c, "c"), new Note(cs, "cs"), new Note(d, "d"), new Note(ds, "ds"), new Note(e, "e"), new Note(f, "f")};
    
    private Note note1;
    private Note note2;
    private Note note3;
    private String name;
   
    /**
     * Takes a string name that includes a note name and chord type, say "C" and type "maj" for a major chord. It then constructs the chord based on the music theory definitions of the 
     * chord. For example, a major chord is constructed of a one, a three, and a five, so the program builds a major chord using the one, three, and five in a scale. If the chord is 
     * minor, indicated by "min", the constructor utilizes a different chord equation to create the minor chord (one, flat three, five). A diminished chord, "dim", is made up of a one,
     * a flat three, and a flat five. The constructor sets note1, note2, and note3, as well as the name of the chord. It gets the sounds by using the Note[] initialized beforehand.
     * @param chord 
     */
    public Chord(String chord){
       String root = "";
       String type = "";

       root = chord.substring(0,1).toLowerCase();
       if(chord.substring(1,2).toLowerCase().equals("s")){
           root = chord.substring(0,2).toLowerCase();
           type = chord.substring(2,chord.length());
       }
       else{
          type = chord.substring(1,chord.length()); 
       }
   
       setName(chord);

       for(int i = 0; i<notes.length; i++){
           if(root.equals(notes[i].getName()) && type.equals("maj")){
               setNote1(notes[i]);
               setNote2(notes[i + 4]);
               setNote3(notes[i+7]); 
               break;
               
           }
           if(root.equals(notes[i].getName()) && type.equals("min")){
               setNote1(notes[i]);
               setNote2(notes[i + 3]);
               setNote3(notes[i+7]);  
               break;
           }
           if(root.equals(notes[i].getName()) && type.equals("dim")){
               setNote1(notes[i]);
               setNote2(notes[i + 3]);
               setNote3(notes[i+6]); 
               break;
           }
       }
       
    }
    
   
    /**
     * This method plays the chord with the designated time for a measure, 2000. It throws Interrupted Exception so the chord only plays for the designated amount of time.
     * @throws InterruptedException 
     */
    public void playback() throws InterruptedException{
        note1.getNote().play();
        note2.getNote().play();
        note3.getNote().play();
        Thread.sleep(2000);
    }
   
    /**
     * @return the notes
     */
    public Note[] getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(Note[] notes) {
        this.notes = notes;
    }

    /**
     * @return the note1
     */
    public Note getNote1() {
        return note1;
    }

    /**
     * @param note1 the note1 to set
     */
    public void setNote1(Note note1) {
        this.note1 = note1;
    }

    /**
     * @return the note2
     */
    public Note getNote2() {
        return note2;
    }

    /**
     * @param note2 the note2 to set
     */
    public void setNote2(Note note2) {
        this.note2 = note2;
    }

    /**
     * @return the note3
     */
    public Note getNote3() {
        return note3;
    }

    /**
     * @param note3 the note3 to set
     */
    public void setNote3(Note note3) {
        this.note3 = note3;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the toPlay
     */
   

 
    
}
