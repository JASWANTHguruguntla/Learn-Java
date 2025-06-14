import java.util.*;
class ValidatePassword{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        boolean validatePassword=input.length()>7;
        if (validatePassword){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
/*
Sample Input 1
passwd
Sample Output 1
False
Sample Input 2
1a2b3c4d5e
Sample Output 2
True
*/
