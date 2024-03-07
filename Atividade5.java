import java.util.Scanner;

class Ativadade5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma palavra:");
		String palavra = sc.nextLine();

		char[] caracteres = palavra.toCharArray();
		int tamanho = caracteres.length;

		for (int i = 0; i < tamanho / 2; i++) {
			char temp = caracteres[i];
			caracteres[i] = caracteres[tamanho - 1 - i];
			caracteres[tamanho - 1 - i] = temp;
		}

		System.out.println(caracteres);

		sc.close();

	}

}