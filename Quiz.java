package JAP82.NumberSystem;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer1 = "Rohit";
        String answer2 = "Gill";
        String answer3 = "Surya";

        int count = 0;

        System.out.println("Who is the ODI captain of india");
        String ans1 = sc.nextLine();
        System.out.println("Who is the test captain of india");
        String ans2 = sc.nextLine();
        System.out.println("Who is the T20 captain of india");
        String ans3 = sc.nextLine();
        
        if(ans1.equals(answer1)){
            count+=1;
        }
        if(ans2.equals(answer2)){
            count+=1;
        }
        if(ans3.equals(answer3)){
            count+=1;
        }
        System.out.println(count);
    }
}
