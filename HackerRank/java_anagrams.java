/*
Two strings, a and b, are called anagrams if they contain all the same characters in the same 
frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If  and  are case-insensitive anagrams, print 
"Anagrams"; otherwise, print "Not Anagrams" instead.
*/
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length())
        {
            return false;
        }

        String lowA = a.toLowerCase();
        String lowB = b.toLowerCase();

        char tempArrayA[] = lowA.toCharArray();
        char tempArrayB[] = lowB.toCharArray();

        // sort tempArray
        char temp ='a';
        for(int i=0; i < tempArrayA.length; i++){  
                 for(int j=1; j < (tempArrayA.length-i); j++){  
                          if(tempArrayA[j-1] > tempArrayA[j]){  
                                 //swap elements  
                                 temp = tempArrayA[j-1];  
                                 tempArrayA[j-1] = tempArrayA[j];  
                                 tempArrayA[j] = temp;  
                         }  
                          
                 }  
         }  



         for(int i=0; i < tempArrayB.length; i++){  
                 for(int j=1; j < (tempArrayB.length-i); j++){  
                          if(tempArrayB[j-1] > tempArrayB[j]){  
                                 //swap elements  
                                 temp = tempArrayB[j-1];  
                                 tempArrayB[j-1] = tempArrayB[j];  
                                 tempArrayB[j] = temp;  
                         }  
                          
                 }  
         }  
        for(int i =0; i<tempArrayA.length;i++)
        {
            if(tempArrayA[i]!=tempArrayB[i])
            return false;
        }

        return true;
    }