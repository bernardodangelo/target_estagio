import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		int a = 0, b = 1;
		boolean fibonacci = false;

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um número:");
		int num = sc.nextInt();

		while (b < num) {
			int temp = b;
			b = b + a;
			a = temp;

			if (b == num) {
				fibonacci = true;
			}
		}

		if (fibonacci) {
			System.out.println("O número " + num + " faz parte da sequência de Fibonacci");
		} else {
			System.out.println("O número " + num + " não faz parte da sequência de Fibonacci");
		}

		sc.close();
	}

}