import java.util.Scanner;
class ValidTriangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println((a+b+c==180)?"It's a Triangle":"It's not a Triangle");
    }
}
/*
Sample Input 1
80
90
100
Sample Output 1
It's not a Triangle

Sample Input 2
60
60
60
Sample Output 2
It's a Triangle
*/
