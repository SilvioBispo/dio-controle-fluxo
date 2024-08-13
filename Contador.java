import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

			
			contar(parametroUm, parametroDois);
		
		
	}
	static void contar(int parametroUm, int parametroDois )  {
		if (parametroUm < parametroDois){

		
			int contagem = parametroDois - parametroUm;

			while (contagem > 0) {

				System.out.println("numero de ocorrencias:"+contagem);

				contagem = contagem-1;

			}
		}
	}
}