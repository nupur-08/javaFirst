package unit_01;
import java.util.Scanner;
public class P7_SwitchStatement {
public static void main(String[] args) {
		
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}

}

class SwitchStatements {
	void switchStatements() {
		
		// Write Logic here! 
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.println("the current year is - ");
			break;
			
		case 2:
			System.out.println("the current month is - ");
			break;
			
		case 3:
			System.out.println("the current day is - ");
			break;
			
		case 4:
			System.out.println("choice not applicable");
			break;
		}
		
	}
}
		

