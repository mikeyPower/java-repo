/*
In each line of output there should be two columns: 
The first column contains the String and is left justified using exactly  characters. 
The second column contains the integer, expressed in exactly  digits; 
if the original input has less than three digits, you must pad your output's 
leading digits with zeroes.
*/


import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String leadingZero = "";
                int noOfSpaces = 0;
                String space ="";
                String s1=sc.next();
                if (s1.length() < 15){
                    noOfSpaces = 15-s1.length();
                    for(int j = 0; j < noOfSpaces; j++)
                    {
                        space = space + " ";
                    }
                }
                int x=sc.nextInt();
                if (x <= 99 && x>=10)
                {
                   leadingZero = "0";
                }
                else if (x < 10 && x >= 0 ){
                    leadingZero = "00";
                }
                //Complete this line
                System.out.printf("%s%s%s%d\n",s1,space,leadingZero,x);
            }
            System.out.println("================================");

    }
}


