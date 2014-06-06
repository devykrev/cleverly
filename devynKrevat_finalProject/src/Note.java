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
public class Note {
    
    
    private Sound note;
    private String name;
    private int time;
    
    /**
     * Constructor that creates a note given a Sound and a String. The sound is the Note sound and the String is the note name. Sets default time to 500, what would be a quarter note
     * with the given measure.
     * @param no
     * @param na 
     */
    public Note(Sound no, String na){
        name = na;
        note = no;
        time = 500;
    }
    
    
    /**
     * Plays the note back with a flexible wait time. This allows a melody to have randomly generated beats given to each Note, creating a more dynamic melody.
     * @throws InterruptedException 
     */
    public void playback() throws InterruptedException{
        getNote().play();
        Thread.sleep(time);
    }
    
    /**
     * Constructs a Note with a sound, name, and wait time. The wait time must correspond with a note type, for instance, 1000 is a half note, 500 is a quarter note, 250 is an eighth
     * note, and 125 is a sixteenth note. Sixteenth notes ended up muddying up the overall sound quality so are no longer created by the Song class.
     * @param no
     * @param na
     * @param wait 
     */
    public Note(Sound no, String na, int wait){
        name = na;
        note = no;
        time = wait;
    }
  
    /**
     * @return the note
     */
    public Sound getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(Sound note) {
        this.note = note;
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
    
}
