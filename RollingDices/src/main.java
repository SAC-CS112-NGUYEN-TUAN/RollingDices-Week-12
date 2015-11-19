import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Dice throwing = new Dice();
		Dice boucing = new Dice();
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Insert bounces :");
			int b = input.nextInt();
		
		System.out.println("Insert dices :");
			int d = input.nextInt();	
		if (d == 0){
				System.out.println(throwing.Throw(b));
		}
		else{
		System.out.println(throwing.Throw(d,b));
		}
	}

}
