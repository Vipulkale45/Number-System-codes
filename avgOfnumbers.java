package JAP82.OOPs.ClassMethod;

class Demo {

	double avgOfnumber(int n) {
		double avg = 0;
		int count = 0;
		while (n != 0) {
			avg += n % 10;
			n /= 10;
			count++;
		}
		return avg / count;
	}

}

public class avgOfnumbers {
	public static void main(String args[]) {
		Demo d1 = new Demo();

		System.out.println(d1.avgOfnumber(5246));

	}

}
