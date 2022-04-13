package bsu.comp152;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	
    int[] numbersArray;

    //create file object and scanner
    File myFile = new File("Numbers.txt");
    Scanner file = new Scanner(myFile);

    //read numbers from file and put them into an array of specified size(number of numbers in the file)
    public void arrayGenerator(int arraySize){
        numbersArray = new int[arraySize];
        for (int i = 0; i<numbersArray.length; i++){
            int number = Integer.parseInt(file.nextLine());
            numbersArray[i] = number;
        }

    }


    public static int medianMethod(ArrayList medianArray){
        if (2/medianArray.size() == 1/2){
            int medianValue1 = (int) medianArray.get((medianArray.size()/2)-1);
            int medianValue2 = (int) medianArray.get(medianArray.size()/2);
            return (medianValue1 + medianValue2)/2;}

        else {return (int) medianArray.get((medianArray.size()/2)-1);}
    }
    public static void main(String[] args) {
	/*int[] randNumbers = new int[40];
    Random rand = new Random();
    for(int i=0; i < randNumbers.length; i++){
        randNumbers[i] = rand.nextInt(10);
    }
        System.out.println(Arrays.toString(randNumbers));
	 */

    //private static void selectionSort(){
        // }




        }





    }

