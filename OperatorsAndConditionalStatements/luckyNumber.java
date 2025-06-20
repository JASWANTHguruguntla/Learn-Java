import java.util.Scanner;
class LuckyNumber{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(((a==6)||(b==6)||(a+b==6)||(a-b==6)||(b-a==6))?"Lucky":"Not Lucky");
    }
}

/*
Q.Given two integers they are considered a Lucky Pair if any of them is 6 or if their sum or difference is equal to 6

Sample Input 1
6
1
Sample Output 1
Lucky

Sample Input 2
3
2
Sample Output 2
Not Lucky
*/
