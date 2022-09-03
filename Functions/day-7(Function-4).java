import java.util.Scanner;

class Functions4 {
    public static void main(String[] args) {
        // Display the middle character of a string in Java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String name = sc.nextLine();
        sc.close();
        String res = middle(name);
        System.out.println("Middle Words is "+res);

    }
    public static String middle(String str){
        int pos,len;
        if(str.length()%2==0){
            pos = str.length()/2-1;
            len = 2;
        }else{
            pos = str.length()/2;
            len = 1;
        }
        return str.substring(len, pos+len);
    }
}
