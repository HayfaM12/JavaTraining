package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
       float[] notes = new float[20];
        for (int i = 0; i < notes.length; i++) {
            System.out.println("Please enter the note " );
            Scanner sc= new Scanner(System.in);
            notes[i] = sc.nextFloat();
            if((notes[i]>20)||notes[i]<0)
                System.out.println(" retry ");
            while (notes[i] > 20){
                System.out.println("Please retry, the note must be between 0 and 20");
                notes[i] = sc.nextFloat();
            }
            System.out.println("Your selected note is " + notes[i]);
        }












    }
}
