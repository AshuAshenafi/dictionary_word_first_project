/*This program receives ten words from user and
1. prints with insertion order,
2. prints array of words in alphabetical order,
3. prints array of words in reverse alphabetical order, and
4. prints array of words that start with vowel."
 */
import java.util.Arrays;
import java.util.Scanner;

public class DictionaryProj1 {

    public static void main(String[] args) {

        //instantiate scanner object
        Scanner input = new Scanner(System.in);

        //declare and initialize arrays and variables
        int arrlength = 10;
        String str1[] = new String[arrlength];
        String str2[] = new String[arrlength];
        String str3[] = new String[arrlength];
        String str4[] = new String[arrlength];
        char vwl [] = {'a', 'e', 'i', 'o', 'u'};
        int num1=0;


        //PROMPT USER TO ENTER TEN WORDS & SCAN
        System.out.println("Please enter ten words: ");
        for(int i = 0; i < str1.length; i++){
            System.out.print("Enter word (" + (i+1) + "/" + str1.length + "): ");
            str1[i] = input.nextLine();
        }

        //ASCENDING ALPHABETICAL ORDER
        //copy the first array to the second
        for(int i = 0, num =0; i < str1.length; i++)    {
            str2[i] = str1[i];
        }

        //bubble sort algorithm
        for(int i =0; i < str2.length; i++) {
            for(int j = i+1; j < str2.length; j++)  {
                //change the value to lowercase for fair comparison (the value entered might be
                // either small or capital letter)
                String temp1 = str2[i].toLowerCase();
                //change the value to lowercase
                String temp2 = str2[j].toLowerCase();
                //make comparison between two strings
                if(temp2.compareTo(temp1) < 0)  {
                    //swaping of values
                    String temp = str2[i];
                    str2[i] = str2[j];
                    str2[j] = temp;
                }
            }

        }

        //REVERSE ALPHABETICAL ORDER

        //index of string two (str2[]) starts from the maximum and goes down
        //while index of the third string increases from zero to the maximum
        for(int i = str2.length-1, num =0; i >= 0; i--) {
            str3[num] = str2[i];
            num++;
        }

        //IDENTIFY WORDS THAT START WITH EITHER OF THE VOWELS (a, e, i, o, u)
        for(int i = 0; i < str2.length; i++)    {
            for(int j = 0; j < vwl.length; j++) {
                //convert string into lowercase
                String temp1 = str2[i].toLowerCase();
                //get the first character of the string
                char temp2 = temp1.charAt(0);
                //check if the first char of each string value is one of the vowels
                if(temp2 == vwl[j]){
                    str4[num1] = str2[i];
                    num1++;
                }
            }
        }

        //DISPLAY THE RESULT

        //display array according to the insertion order
        System.out.println("\nOriginal Order: ");
        //System.out.println(Arrays.toString(str1));
        for(int i = 0; i < str1.length; i++){
            System.out.print(str1[i] + " ");
        }

        //display the array in alphabetical order
        System.out.println("\n\nAlphabetical Order: ");
        System.out.println(Arrays.toString(str2));

        //display the array in reverse alphabetical order
        System.out.println("\nReversed Alphabetical Order: ");
        System.out.println(Arrays.toString(str3));

        //display words that start with vowel
        System.out.print("\nWords that start with vowel are: \n" + num1 + " Results: ");
        //System.out.println(num1 + " Results: " + Arrays.toString(str4));
        for(int i = 0; i < num1; i++){
            System.out.print(str4[i] + " ");
        }

    }
}
