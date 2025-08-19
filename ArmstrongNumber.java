package JAP82.OOPs.ClassMethod;

class Armstrong {
    boolean checkArmstrong(int n)
    {
        int temp =n; int power=0; int sum=0;
        while(temp!=0)
        {
            temp/=10;
            power++;
        }
        temp=n;
        while(temp!=0)
        {
            sum+=Math.pow(temp%10, power);
            temp/=10;
        }
        return sum==n;
    }
}

public class ArmstrongNumber {
    public static void main(String[] args) {
        Armstrong a2 = new Armstrong();
        System.out.println(a2.checkArmstrong(153));
    }
}
