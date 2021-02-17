package ch04homework;

public class Exercise04 {

	public static void main(String[] args) {
		while(true) {
			int firstDice = (int) (Math.random() * 6) + 1;
			int secondDice = (int) (Math.random() * 6) + 1;
			if(firstDice + secondDice == 5) {
				break;
			} else {
				System.out.println("(" + firstDice + ", " + secondDice + ")");
			}
		}
		
	}

}
