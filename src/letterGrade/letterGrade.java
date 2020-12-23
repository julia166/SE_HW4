package letterGrade;
import java.util.Scanner;

public class letterGrade {

	char ScoreGrade(int score) {
		char grade;
		if (score <0 || score > 100)
		grade = 'X';
		else if (score>=90 && score <=100)
		grade = 'A';
		else if (score>=80 && score <90)
		grade = 'B';
		else if (score>=70 && score <80)
		grade = 'C';
		else if (score>=60 && score <70)
		grade = 'D';
		else
		grade ='F';
		return grade;
	}
	
	public static void main(String[] args) {
		int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input three score(divide with space white)");
        if(scanner.hasNextInt()) {        	
        	num1 = scanner.nextInt();
        	num2 = scanner.nextInt();
        	num3 = scanner.nextInt();
        	letterGrade g = new letterGrade();
        	System.out.println("First score is: " + num1 + ", Grade:" + g.ScoreGrade(num1));
        	System.out.println("Second score is: " + num2 + ", Grade:" + g.ScoreGrade(num2));
        	System.out.println("Third score is: " + num3 + ", Grade:" + g.ScoreGrade(num3));
        }
        scanner.close();
	}
	
}
