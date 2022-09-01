package Strings;

class Strings2{
     public static void main(String[] args) {
          int count1 = 0;
          int count2 = 0;
        //Java Program to count the total number of vowels and consonants in a string
        String str = "Hello World";
        str.toLowerCase();
        for(int i=0;i<str.length();i++){
        //  int count1=0,count2=0;
          if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
            count1++;
          }
          else if(str.charAt(i)>='a'&& str.charAt(i)<='z'){
            count2++;
          }
     }
          System.out.println(count1);
          System.out.println(count2);
        
     }
}