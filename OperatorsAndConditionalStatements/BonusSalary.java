/*
BONUS SALARY
A company decided to give a bonus of 5% to an employee if his/her years of service is more than five years.
Write a program that reads an employee's salary and years of service and decides whether the employee gets the bonus or not.
Input
The first line of input will contain the salary of an employee.
The second line of input will contain years of service.
Output
If the employee gets a bonus, print the net bonus amount.
If the employee doesn't get the bonus, print 
No Bonus

Explanation
For example, if the employee's salary is 25000 and years of experience is 3. As the years of experience is less than 5, the output should be 
No Bonus
. Similarly, if the employee's salary is 50000 and years of experience is 6. As the years of experience is more than 5, the employee is eligible for the bonus. By computing the 5% of his salary, the net bonus amount should be 2500.0
*/
import java.util.*;
class BonusSalary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int salary=sc.nextInt();
        int experience=sc.nextInt();
        if(experience>5){
            double bonus=salary*0.05;
            System.out.println(bonus);
        }
        else{
            System.out.println("No bonus");
        }
    }
}
/*
Sample Input 1
25000
3
Sample Output 1
No bonus
_______________
Sample Input 2
50000
6
Sample Output 2
5000.0
*/
