import java.util.Scanner;
class Main
{
	public static void main(String[] args) 
	{
        Scanner s=new Scanner(System.in);
        System.out.println("Enter tha value of a:");
        int a=s.nextInt();
        System.out.println("Enter the value of b:");
        int b=s.nextInt();
        System.out.println("Addition:"+(a+b));
        System.out.println("Subtraction:"+(a-b));
        System.out.println("Multiplication:"+(a*b));
        System.out.println("Division:"+(a/b));
        System.out.println("MOdulus:"+(a%b));
        if(a>b)
        {
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("a is less than b");
        }
        a+=b;
        System.out.println("a+=b:"+a);
        a*=b;
        System.out.println("a*=b:"+a);
	}
}
