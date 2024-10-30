import java.util.Scanner;

public class Main {

	static int[] dictionary = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000,1000000};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rounds = sc.nextInt();

		for (int i=0;i<rounds;i++) {
			int idx = sc.nextInt();
			dictionary[idx-1] = 0;
		}
		
		double sum = 0;
		for (int i=0;i<dictionary.length;i++) {
			sum+=dictionary[i];
		}
		
		double avg = sum/(10-rounds);
		double offer = sc.nextDouble();
		if (offer > avg) {
			System.out.println("deal");
		} else {
			System.out.println("no deal");
		}

	}

}
