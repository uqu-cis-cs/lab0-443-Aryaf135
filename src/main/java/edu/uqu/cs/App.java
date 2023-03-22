package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/


public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/

/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/public static void main(String [] args) {
        

        /* Write your code here */
     twisters();
       //call method twisters()
       //prompt user to enter a string 
       //call method phoneKeypad(string)
    Scanner scant  = new Scanner(System.in);
   String str = scant.nextLine();
   phoneKeypad(str);
    }
public static void twisters(){
for(int x = 1; x <= 20; x++){
if( x% 6 ==0 || x % 4 == 0 || x % 2 ==0) {

if (x % 2 == 0 ){
System.out.print("Tweetle");

}
if(x % 4 == 0){
    System.out.print("Beetle");
}
if(x % 6 == 0){
    System.out.print( "Poodle");
}
}
else
 {
    System.out.print( x );
}
System.out.print(" ");
}
}

public static void phoneKeypad (String str){
    String out = "";
    for(int n = 0; n < str.length(); n++){
 char a = str.toUpperCase().charAt(n);
     switch(a){
       case 'A' : case 'B': case 'C':
        out+='2';
        break;
         case 'D' : case 'E' : case 'F' :
        out +='3';
        break;
         case 'G' : case 'H' : case 'I':
        out += '4';
        break;
         case 'J' : case 'K' : case 'L':
        out += '5';
        break;
         case 'M' : case 'N' : case 'O': 
         out += '6';
         break;
        case  'P' : case 'Q' : case 'R' : case 'S': 
        out += '7';
       break;
       case 'T': case 'U': case 'V':
     out+='8';
     break;
     case 'W': case 'X': case 'Y': case 'Z':
     out+='9';
     break;
     }
    }System.out.print(out);

}

}














 
    

    


