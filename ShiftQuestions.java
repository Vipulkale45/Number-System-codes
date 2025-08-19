package JAP82.OOPs.ClassMethod;

class Shift{

    int shiftFirsttoLast(int n)
    {
        int temp=n, length=1;
        while(temp>9)
        {
            temp/=10;
            length*=10;
        }
        n%=length;
        n*=10;
        n+=temp;
        return n;
    }   

    int swapFirstAndLast(int n)
    {
        int last=n%10;
        n/=10;
        int temp = n, length=1;
        while(temp>9)
        {
            temp /=10;
            length*=10;
        }
        n%=length;
        last*=length;
        last+=n;
        last*=10;
        last+=temp;
        return last;
    }

    int findMaxDigit(int n)
    {
        int max=0;
        while(n!=0)
        {
            int last = n%10;
            if(max<last)
            {
                max=last;
            }
            n/=10;
        }
        return max;
    }

    int findMinDigit(int n)
    {
        int min = n%10;
        while(n!=0)
        {
            int last = n%10;
            if(min>last)
            {
                min = last;
            }
            if(min==0)
            {
                break;
            }
            n=n/10;
        }
        return min;
    }
}
public class ShiftQuestions {
    public static void main(String[] args) {
        Shift s1 = new Shift();
        System.out.println(s1.shiftFirsttoLast(12345));
        System.out.println(s1.swapFirstAndLast(5487));
        System.out.println(s1.findMaxDigit(58749));
        System.out.println(s1.findMinDigit(98724));
    }
}
