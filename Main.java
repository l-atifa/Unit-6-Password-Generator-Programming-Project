import java.util.*;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

class Main {
  public static void main(String[] args) throws IOException{

   // Scanner scan = new Scanner(System.in);
    //System.out.println("Welcome to the password generator!");
    //System.out.println("Please select which type of password you would like to generate!\n1.Lowercase letters\n2.Uppercase letters\n3.Uppercase and Lowercase letters\n4.Uppercase, Lowercase, and Numbers\n5.Uppercase, Lowercase, Numbers and Symbols\n0.Exit\n\nEnter Selection by typing numbers 1,2,3,4,5 or 0 to Exit:");

File fileName1 = new File("Lower.txt");
      PrintWriter outFile1 = new PrintWriter(fileName1);
      for (int loop = 1; loop <= 1000; loop++)
      {
        int lc = (int)(Math.random()*(122-97 + 1) + 97);
        outFile1.println(lc);
      }
      outFile1.close();

      int[] lowerInts = new int[1000];

      //read lowercase and store
      File xfileName1 = new File("Lower.txt");
      Scanner inputFile1 = new Scanner(xfileName1); //new Scanner
      int index1 = 0;
      while(inputFile1.hasNextInt())
      {
        lowerInts[index1] = inputFile1.nextInt();
        index1++;
      }
      inputFile1.close();

      //fill String array with converted int values
      //maybe come back and make this a char array if you figure out how
      String[] lower = new String[1000];
      for(int i = 0; i<lower.length; i++)
      {
        lower[i] = Character.toString((char)lowerInts[i]);
      }

      //generate lowercase password file
      File ffileName1 = new File("Lowerpw.txt"); //final file name 1
      PrintWriter foutFile1 = new PrintWriter(ffileName1); // final outfile 1
      int perLine = 0;
      for(int i = 0; i<lower.length; i++)//this is printing them in console rather than the file
      {
        foutfile1.print(lower[i]);//going to make 125 passwords, 8 per line
        perLine++;
        if(perLine == 8)
        {
          foutfile1.println();
          perLine = 0;
        }
      }
      foutFile1.close();
      //nothing should be in the console
      //char array is 1000, password file prints 8 of the array per line

    /*int selection = scan.nextInt();
    if(selection == 1)
    {
      //generate lowercase letters
      

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
      System.out.println("Would you like to play again?")

    }
    else if(selection == 0)
    {
      System.out.println("Thank you");
    }*/

    
/*
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
      int mxl = (int)(Math.random()*(122-65 + 1) + 65); //within two ranges   
       while (mxl >=91 && mxl<97)
      {
        mxl = (int)(Math.random()*(90-65 + 1) + 65); 
      }
      outFile3.println(mxl);
    }
    outFile3.close();

    //generate mixed upercase and lowercase letters and numbers
    //48 to 57, 65 skip 122
    File fileName4 = new File("Mixed_letters_numbers.txt");
    PrintWriter outFile4 = new PrintWriter(fileName4);
    for (int loop = 1; loop <= 1000; loop++)
    {
      int mxln = (int)(Math.random()*(122-48 + 1) + 48); // within three ranges
       while ((mxln>=58 && mxln<65) || (mxln >=91 && mxln<97))
      {
        mxln = (int)(Math.random()*(122-48 + 1) + 48); 
      }
      outFile4.println(mxln);
    }
    outFile4.close();

    //generate anything but a space(letters, numbers, symbols)
    File fileName5 = new File("Mixed_chars.txt");
    PrintWriter outFile5 = new PrintWriter(fileName5);
    for (int loop = 1; loop <= 1000; loop++)
    {
      int all = (int)(Math.random()*(125-33 + 1) + 33); // within three ranges
      outFile5.println(all);
    }
    outFile5.close();


    int[] upperInts = new int[1000];
    
    int[] mixedLetInts = new int[1000];
    int[] mixedLetNumInts = new int[1000];
    int[] allCharsInts = new int[1000];


    
   
    //read uppercase and store
    File xfileName2 = new File("Upper.txt");
    Scanner inputFile2 = new Scanner(xfileName2); //new Scanner
    int index2 = 0;
    while(inputFile2.hasNext())
    {
      upperInts[index2] = inputFile2.nextInt();
      index2++;
    }
    inputFile2.close();

    //read mixed case and store
    File xfileName3 = new File("Mixed_letters.txt");
    Scanner inputFile3 = new Scanner(xfileName3); //new Scanner
    int index3 = 0;
    while(inputFile3.hasNext())
    {
      mixedLetInts[index3] = inputFile3.nextInt();
      index3++;
    }
    inputFile3.close();

    //read mixed case + num and store
    File xfileName4 = new File("Mixed_letters_numbers.txt");
    Scanner inputFile4 = new Scanner(xfileName4); //new Scanner
    int index4 = 0;
    while(inputFile4.hasNext())
    {
      mixedLetNumInts[index4] = inputFile4.nextInt();
      index4++;
    }
    inputFile4.close();
    
     //read mixed all char and store
    File xfileName5 = new File("Mixed_chars.txt");
    Scanner inputFile5 = new Scanner(xfileName5); //new Scanner
    int index5 = 0;
    while(inputFile5.hasNext())
    {
      allCharsInts[index5] = inputFile5.nextInt();
      index5++;
    }
    inputFile5.close();



    String[] upper = new String[1000];
    for(int i = 0; i<upper.length; i++)
    {
      upper[i] = Character.toString((char)upperInts[i]);
      //Character.toChars
    }

    

    String[] mixed = new String[1000];
    for(int i = 0; i<mixed.length; i++)
    {
      mixed[i] = Character.toString((char)mixedLetInts[i]);
    }

    String[] mixedNum = new String[1000];
    for(int i = 0; i<mixedNum.length; i++)
    {
      mixedNum[i] = Character.toString((char)mixedLetNumInts[i]);
    }

    String[] allChars = new String[1000];
    for(int i = 0; i<allChars.length; i++)
    {
      allChars[i] = Character.toString((char)allCharsInts[i]);
    }

 
*/

    







  }
}