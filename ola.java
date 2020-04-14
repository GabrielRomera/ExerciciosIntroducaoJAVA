import java.util.Scanner;

public class ola {

	public static void main(String[] args) {
	
		 Scanner leitor = new Scanner(System.in);
		 
	        System.out.print("Qual o seu nome:");
	        String nome = leitor.next();
	        System.out.print("\n");
	        
	        System.out.print("Qual a sua idade:");
	        String idade = leitor.next();
	        System.out.print("\n");
	        
	        System.out.print("Aonde voce mora:");
	        String cidade = leitor.next();
	        
	      
	       
	        System.out.printf("\n" + "Seja bem vindo " + nome + ", voce tem " + idade + 
	        		" anos e mora em " + cidade + ".");
	       
	        
	    	/* Codigo feito por Gabriel Romera */
	        
	}

}
