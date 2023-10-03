package app;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
	   Scanner sc=  new Scanner(System.in);
	   int n1,n2;
	   System.out.println("numer 1");
	   n1=sc.nextInt();
	   System.out.println("numero 2");
	   n2=sc.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(n1,n2);
		
		}
		catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int n1, int n2 ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(n1>n2) {
			 throw new ParametrosInvalidosException();
			
		}
		
		
		 int contagem = n1;
		  for (int i = n1; i < n2; i++) {
	            System.out.println(contagem);
	            contagem++;
	        }
   
    }
	

	

	}
	
	


