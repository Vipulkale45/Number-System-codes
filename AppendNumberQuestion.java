package JAP82.OOPs.ClassMethod;

class Append
{
    int appendSumAtLast(int n)
    {
        int sum=0;
        int temp=n;
        while(temp!=0)
        {
            sum=sum+temp%10;
            temp=temp/10;
        }
        if(sum<10)
        {
            n=n*10;
        }
        else
        {
            n=n*100;
        }
        return n+sum;
    }

    int appendSumAtFirst(int n)
    {
        int temp=n; 
        int sum=0;
        int power=1;
        while(temp!=0)
        {
            sum=sum+temp%10;
            temp=temp/10;
            power=power*10;
        }
        sum*=power;
        return sum+n;
    }

    int appendTwoNumber(int a, int b)
    {
        int temp=b, count=1;
        while(temp!=0)
        {
            count=count*10;
            temp/=10;
        }
        a*=count;
        return a+b;
    }
}

public class AppendNumberQuestion {
    public static void main(String[] args) {
        Append a1 = new Append();
        System.out.println(a1.appendSumAtLast(24516));
        System.out.println(a1.appendSumAtFirst(549));
        System.out.println(a1.appendTwoNumber(826, 5627));
    }
}
