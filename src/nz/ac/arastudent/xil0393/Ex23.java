package nz.ac.arastudent.xil0393;

import java.util.Dictionary;
import java.util.Hashtable;

public class Ex23 {
    private Dictionary words = new Hashtable();
    private boolean[] guessResult;
    private char[] targetChar;
    public char[] outputChar;
    public Ex23(){
        this.words.put(1,"boolean");
        this.words.put(2,"statement");
        this.words.put(3,"equality");
        this.words.put(4,"array");
        this.words.put(5,"string");
        this.words.put(6,"break");
        this.words.put(7,"bitwise");
        this.words.put(8,"operator");
        this.words.put(9,"bitcoin");
        this.words.put(0,"copyto");
        int targetWordIndex = (int)(Math.random()*10);
        String targetWord = (String) this.words.get(targetWordIndex);
        this.guessResult = new boolean[targetWord.length()];
        this.outputChar = new char[targetWord.length()];
        for (int i=0;i<targetWord.length();i++){
            this.guessResult[i] = false;
            this.outputChar[i] = '_';
        }
        this.targetChar = targetWord.toCharArray();
    }
    public boolean WordGuess(char guessChar){
        for (int i=0;i<this.targetChar.length;i++){
            if (guessChar==this.targetChar[i]){
                this.guessResult[i]=true;
                this.outputChar[i]=guessChar;
            }
        }
        boolean result = true;
        for (boolean b:guessResult) {
            if (b==false) result = false;
        }
        return result;
    }
    public boolean WordGuessStrict(char[] guessChar){
        for (int i=0;i<this.targetChar.length;i++){
            if (guessChar[i]!=this.targetChar[i]){
                return false;
            }
        }
        return true;
    }
}
