import java.util.*;
class VoteEligibility{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}

/*
Sample Input 1
15
Sample Output 1
Not Eligible
Sample Input 2
21
Sample Output 2
Eligible
*/
