package gabriel;

import java.util.Scanner;

	public class main {

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        System.out.print("Qual é o seu nome? ");
	        String nome = entrada.nextLine();

	        System.out.print("Digite o primeiro número: ");
	        double n1 = entrada.nextDouble();

	        System.out.print("Digite o segundo número: ");
	        double n2 = entrada.nextDouble();

	        double soma = n1 + n2;

	        System.out.println("Olá, " + nome + "!");
	        System.out.println("A soma de " + n1 + " + " + n2 + " é " + soma);

	        entrada.close();
	    }
	
		//inicio da branch
	    
	    System.out.println("edicao branch");
	    
	    //fim branch
	
	}


