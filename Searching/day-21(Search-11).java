import java.util.Scanner;

class Search11{
    public static void main(String[] args) {
        //linear search in string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int size = sc.nextInt();
        System.out.println("Enter the names: ");
        String[] names = new String[size];
        for(int i = 0;i<size;i++){
           names[i] = sc.next();
        }
        System.out.println("Enter the name to search: ");
        String search = sc.next();
        int flag = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(search)) {
                System.out.println("Found at index: " + i);
                flag = 1;
                break;
            }
        }
        if (flag==0) {
            System.out.println("Not Found");
        }

       sc.close();
        
    }
}