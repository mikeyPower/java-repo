/*
"In computing, End Of File (commonly abbreviated EOF) is a condition in 
a computer operating system where no more data can be read from a data source." 
— (Wikipedia: End-of-file)

The challenge here is to read n lines of input until you reach EOF, 
then number and print all n lines of content.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner s = new Scanner(System.in);
        int count = 1;

        while(s.hasNext()) {
            String ns = s.nextLine();
            System.out.println(count + " " + ns);
            count++;

    }
    }
}