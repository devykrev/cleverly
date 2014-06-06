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


import java.util.Arrays;

/**
 *
 * @author Devyn
 */
public class Scale {
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
                              new Note(b, "b"), new Note(c, "c"), new Note(cs, "cs"), new Note(d, "d"), new Note(ds, "ds"), new Note(e, "e"), new Note(f, "f"),};
    
    public String key;
    public Note[] keyNotes = new Note[7];
    public Chord[] availChords = new Chord[7];
    public String prog;
    
    public int keyStart(String k){
        for(int i = 0; i<notes.length; i++){
            if(k == notes[i].getName()){
                return i;
            }
        }
        
        return -1;    
    }
    
    public void setChords(int start){
        keyNotes[0] = notes[start];
        keyNotes[1] = notes[start+2];
        keyNotes[2] = notes[start+4];
        keyNotes[3] = notes[start+5];
        keyNotes[4] = notes[start+7];
        keyNotes[5] = notes[start+9];
        keyNotes[6] = notes[start+11]; 
        
        availChords[0] = new Chord(keyNotes[0].getName().toUpperCase()+ "maj");
        availChords[1] = new Chord(keyNotes[1].getName().toUpperCase()+ "min");
        availChords[2] = new Chord(keyNotes[2].getName().toUpperCase()+ "min");
        availChords[3] = new Chord(keyNotes[3].getName().toUpperCase()+ "maj");
        availChords[4] = new Chord(keyNotes[4].getName().toUpperCase()+ "maj");
        availChords[5] = new Chord(keyNotes[5].getName().toUpperCase()+ "min");
        availChords[6] = new Chord(keyNotes[6].getName().toUpperCase()+ "dim");

        
    }
    
    
    public static void main(String[] args)throws InterruptedException {
        Scale test = new Scale("a");
    }
    
    
    public String toString(){
        String chordsInScale = Arrays.toString(availChords);
        String notesInScale = Arrays.toString(keyNotes);
        
        return "Notes in the scale are: " + notesInScale + "\n Chords in the scale are" + 
                chordsInScale;
    }
    
    //constructor
    public Scale(String key){
        int k = keyStart(key);
        setChords(k);
        
    }
    
    public Scale(Note one, Note two, Note three, Note four, Note five, Note six, Note seven){
        keyNotes[0] = one;
        keyNotes[1] = two;
        keyNotes[2] = three;
        keyNotes[3] = four;
        keyNotes[4] = five;
        keyNotes[5] = six;
        keyNotes[6] = seven;
        
        availChords[0] = new Chord(keyNotes[0].getName().toUpperCase()+ "maj");
        availChords[1] = new Chord(keyNotes[1].getName().toUpperCase()+ "min");
        availChords[2] = new Chord(keyNotes[2].getName().toUpperCase()+ "min");
        availChords[3] = new Chord(keyNotes[3].getName().toUpperCase()+ "maj");
        availChords[4] = new Chord(keyNotes[4].getName().toUpperCase()+ "maj");
        availChords[5] = new Chord(keyNotes[5].getName().toUpperCase()+ "min");
        availChords[6] = new Chord(keyNotes[6].getName().toUpperCase()+ "dim");
    }
    
   
}
