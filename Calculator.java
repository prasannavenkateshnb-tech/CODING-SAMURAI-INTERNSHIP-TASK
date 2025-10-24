import java.util.*;
public class Calculator{
    public int add(int num1,int num2){
        return num1+num2;

    }
    public int sub(int num1,int num2){
         return num1-num2;
    }
    public int mul(int num1,int num2){
         return num1*num2;
    }
    public double div(int num1,int num2){
        if(num2==0){
            System.out.println("Division by zero is not possible");
        }
        return (double)num1/num2;
    }
    public void calculate(int num1,int num2){
        System.out.println("Addition"+add(num1,num2));
        System.out.println("Subtraction"+sub(num1,num2));
        System.out.println("Multiplication"+mul(num1,num2));
        System.out.println("Division "+div(num1,num2));


        
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1");
        int num1=sc.nextInt();
        System.out.println("Enter number2");
        int num2=sc.nextInt();
        Calculator obj=new Calculator();
        obj.calculate(num1,num2);



    }
}