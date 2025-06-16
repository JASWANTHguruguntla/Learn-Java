import java.util.*;
class SkippingLetters{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        int n=sc.nextInt();
        int len=word.length();
        if(n<0||n>=len){
            System.out.println(word);
        }else{
            String modifiedWord=word.substring(0,n)+word.substring(n+1);
            System.out.println(modifiedWord);
        }
    }
}
/*
Sample Input 1
Combine
4
Sample Output 1
Combne
________________
Sample Input 2
Completeness
12
Sample Output 2
Completeness
*/
