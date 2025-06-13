import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        System.out.println(word.substring(0,word.length()/2));
        
    }
}

/* 
Sample Input 1
Amazon
Sample Output 1
Ama
Sample Input 2
Bottle
Sample Output 2
Bot
*/
