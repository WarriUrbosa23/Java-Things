import java.util.Scanner;

public class palindromes{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("String: ");
        String k = input.nextLine();
        input.close();
        k = k.strip();
        String l = k.toLowerCase().replace(" ", "");
        System.out.println(l);
        boolean p = true;
        int x = -1;
        for (int idx = l.length()-1; idx != 0; idx--) {
            x = x+1;
            if(l.charAt(idx) != l.charAt(x)){
                p = false;
                System.out.println(p);
                break;

            }
        }
        System.out.println("The statement that '" + 
        k + "' is a palindrome would be " + p);

    }
}