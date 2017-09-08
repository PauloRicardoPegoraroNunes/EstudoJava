import java.util.Scanner;

public class TesteEstado {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Estado estado = new Estado();

		
		System.out.println("Digite um estado : ");
		estado.nome=teclado.nextLine();
		System.out.println("Digite a sigla : ");
		estado.sigla=teclado.nextLine();
		
		
		System.out.println(estado.nome);
		System.out.println(estado.sigla);
		
	}

}
