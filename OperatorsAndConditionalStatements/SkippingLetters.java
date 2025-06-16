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
