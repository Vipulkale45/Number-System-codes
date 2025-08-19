package JAP82.OOPs.ClassMethod;

class Program
{
    int lastDigitOfnumber(int n)
    {
        return n%10;
    }

    int secondLastDigit(int n)
    {
        return (n/10)%10;
    }

    int firstDigitOfNumber(int n)
    {
        while(n>9)
        {
            n=n/10;
           
        }
         return n;
    }

    int secondDigitOfNumber(int n)
    {
        for(int i= 99; i<=n; i++)
        {
            n=n/10;
        }
        
        return n; 
    }

    int sumOfDigit(int n)
    {
        int sum=0;

        while(n!=0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
}

public class DigitNumberSystem {
    public static void main(String[] args) {
        Program d2 = new Program();
        System.out.println(d2.lastDigitOfnumber(54269));
        System.out.println(d2.secondLastDigit(85976));
        System.out.println(d2.firstDigitOfNumber(264893));
        System.out.println(d2.secondDigitOfNumber(87493));
        System.out.println(d2.sumOfDigit(54321));
    }
}
