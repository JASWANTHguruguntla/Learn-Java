import java.util.Scanner;
class lastCharacter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String w=sc.nextLine();
        System.out.println(w.charAt(w.length()-1));
    }
}