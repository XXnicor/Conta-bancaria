package Conta;

import java.util.Scanner;
import java.util.Locale;


public class ContaBancaria {
	
	
	    public static void main (String[]args) {
	    
	    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	    
	    System.out.println("Digite o numero da conta: ");
	    int numeroDaConta = scanner.nextInt();
	    
	    System.out.println("Digite o numero da agencia: ");
	    double agenciaNumero = scanner.nextDouble();
	    
	    System.out.println("Digite seu nome : ");
	    String nome = scanner.next();
	    
	    System.out.println("Digite seu saldo atual: ");
	    double saldo = scanner.nextDouble();
	    
	    
	    System.out.println("Olá " + nome + " Obrigado por criar uma conta no nosso banco, sua agencia é "+agenciaNumero+" conta "+numeroDaConta+" e seu saldo "+saldo+" já esta disponivel para saque.");	    
	    
	    	
	    }
	

}
  