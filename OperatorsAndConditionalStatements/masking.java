import java.util.*;
class Masking{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        String masked=word.charAt(0)+"*".repeat(word.length()-2)+word.charAt(word.length()-1);
        System.out.println(masked);
    }
}
/*
Sample Input 1
hello@2025
Sample Output 1
h********5
Sample Input 2
987654321
Sample Output 2
9*******1
*/
