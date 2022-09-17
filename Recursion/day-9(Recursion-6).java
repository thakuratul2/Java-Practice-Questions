import java.util.Scanner;


class Recursion6 {
    public static int first = -1;
    public static int last = -1;
    
    public static void Occurance(String st,int inx,char element){
        if(inx==st.length()){
            System.out.println("First Occurance: "+first);
            System.out.println("Last Occurance: "+last);
            return;
        }
        char currentChar = st.charAt(inx);
        if(currentChar == element){
            if(first==-1){
                first = inx;
            }else{
                last = inx;
            }
        }
        
        Occurance(st,inx+1,element);
    }
    public static void main(String[] args) {
        //find the occurance

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("Enter the character to find: ");
        char el = sc.nextLine().charAt(0);
        sc.close();
       // System.out.println("The occurance of "+el+" is "+Occurance(str,el));
       Occurance(str, 0, el);


    }
    
}
