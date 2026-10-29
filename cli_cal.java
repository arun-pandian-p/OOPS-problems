import java.util.Scanner;
class cal{
    void add(int num1,int num2){
        int sum=num1+num2;
        System.out.println("===Addition===");
        System.out.println(sum);
    }
    void sub(int num1,int num2){
        int sum=num1-num2;
        System.out.println("===Subtraction===");
        System.out.println(sum);
    }
    void mul(int num1,int num2){
        int sum=num1*num2;
        System.out.println("===Multiplication===");
        System.out.println(sum);
    }
    void div(int num1,int num2){
        if(num2==0)
        {
            System.out.print("Division by zero not allowed");
        }
        else {
            int sum=num1/num2;
            System.out.println("===Division===");
            System.out.println(sum);
        }

    }
}


public class cli_cal {
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose operation /n + /n -/n * /n /");
        char op=sc.next().charAt(0);
        System.out.println("Enter the num1");
        int num1=sc.nextInt();
        System.out.println("Enter the Num2");
        int num2=sc.nextInt();
        cal c1=new cal();
        switch(op){
            case '+':
                c1.add(num1,num2);
                break;
            case '-':
                c1.sub(num1,num2);
                break;
            case '*':
                c1.mul(num1,num2);
                break;
            case '/':
                c1.div(num1,num2);
                break;
        }
    }
}
