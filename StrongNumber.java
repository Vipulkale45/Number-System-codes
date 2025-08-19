package JAP82.OOPs.ClassMethod;

class Strong{
    boolean checkStrong(int n)
    {
        int temp = n, sum=0;
        while(temp!=0)
        {
            int fact=1;
            for(int i=1; i<=temp%10; i++)
            {
                fact*=i;
            }
            sum+=fact;
            temp/=10;
        }
        return sum==n;
    }
    
}

public class StrongNumber {
    public static void main(String[] args) {
        Strong s1 = new Strong();
        
        System.out.println(s1.checkStrong(145));
    }
}
