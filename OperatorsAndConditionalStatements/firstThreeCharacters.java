import java.util.*;
class FirstThreeCharacters{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println(input.substring(0,3));
    }
}
/*
Sample Input 1
github
Sample Output 1
git
*/
