import java.util.Scanner;

public class calcu {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
        int num1 = leitor.nextInt();
        System.out.print("\n");
		
        System.out.print("Digite o segundo numero: ");
        int num2 = leitor.nextInt();
        System.out.print("\n");
         
		
		int mult = num1 * num2;
		int div = num1 / num2;
		double divint = (double) num1 / num2; 
		int soma = num1 + num2;
		int subt = num1 - num2;
		int resto = num1 % num2;
	
		
		System.out.printf("\n" + "Resultados:" + "\n" + 
				"\n" + "Soma: " + soma +
				"\n" + "Subtracao: " + subt + 
				"\n" + "Multiplicacao: " + mult +
				"\n" + "Divisao: " + div +
				"\n" + "Resto: " + resto + 
				"\n" + "Divisao decimal: " + divint);
		
		
	
		/* Codigo feito por Gabriel Romera */
		
	}

}
