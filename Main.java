import java.util.*;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

class Main {
  public static void main(String[] args) throws IOException{

    Scanner scan = new Scanner(System.in);
    /*System.out.println("Welcome to the password generator!");
    System.out.println("Please select which type of password you would like to generate!\n1.Lowercase letters\n2.Uppercase letters\n3.Uppercase and Lowercase letters\n4.Uppercase, Lowercase, and Numbers\n5.Uppercase, Lowercase, Numbers and Symbols\n0.Exit\n\nEnter Selection by typing numbers 1,2,3,4,5 or 0 to Exit:");

    int selection = scan.nextInt();
    if(selection == 1)
    {

    }
    else if(selection == 2)
    {
      
    }
    else if(selection == 3)
    {
      
    }
    else if(selection == 4)
    {
      
    }
    else if(selection == 5)
    {
      
    }
    else if(selection == 0)
    {
      
    }*/

    //generate lowercase letters
    File fileName1 = new File("Lower.txt");
    PrintWriter outFile1 = new PrintWriter(fileName1);
    for (int loop = 1; loop <= 1000; loop++)
    {
      int lc = (int)(Math.random()*(122-97 + 1) + 97);
      outFile1.println(lc);
    } //new line or not? //as of rn i do not know
    outFile1.close();


    //generate upercase letters
    File fileName2 = new File("Upper.txt");
    PrintWriter outFile2 = new PrintWriter(fileName2);
    for (int loop = 1; loop <= 1000; loop++)
    {
      int uc = (int)(Math.random()*(90-65 + 1) + 65);
      outFile2.println(uc);
    }
    outFile2.close();


    //generate mixed upercase and lowercase letters
    File fileName3 = new File("Mixed_letters.txt");
    PrintWriter outFile3 = new PrintWriter(fileName3);
    for (int loop = 1; loop <= 1000; loop++)
    {
      int mxl = (int)(Math.random()*(90-65 + 1) + 65); //within two ranges  https://stackoverflow.com/questions/15591173/generating-a-random-number-between-multiple-ranges/15591239 
      outFile2.println(mxl);
    }
    outFile3.close();


    //generate mixed upercase and lowercase letters and numbers
    File fileName4 = new File("Mixed_letters_numbers.txt");
    PrintWriter outFile4 = new PrintWriter(fileName4);
    for (int loop = 1; loop <= 1000; loop++)
    {
      int mxln = (int)(Math.random()*(90-65 + 1) + 65); // within three ranges
      outFile4.println(mxln);
    }
    outFile4.close();


    //generate anything but a space(letters, numbers, symbols)
    File fileName5 = new File("Mixed_chars.txt");
    PrintWriter outFile5 = new PrintWriter(fileName5);
    for (int loop = 1; loop <= 1000; loop++)
    {
      int all = (int)(Math.random()*(90-65 + 1) + 65); // within three ranges
      outFile4.println(all);
    }
    outFile5.close();



//(max-min+1)+min)
//(122-97 + 1) + 97









/*
    int upperInts = new int[1000];
    int lowerInts = new int[1000];
    int mixedLetInts = new int[1000];
    int mixedLetNumInts = new int[1000];
    int allCharsInts = new int[1000];




    



    */




  }
}