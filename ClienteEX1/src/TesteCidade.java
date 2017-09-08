import java.util.Scanner;

public class TesteCidade {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Cidade cidade = new Cidade();
		Estado estado = new Estado ();
		System.out.println("Digite o nome de sua cidade : ");
		cidade.nome=teclado.next();
		
		System.out.println("Digite seu Estado : ");
		estado.nome=teclado.next();
		
		System.out.println("Digite a sigla de seu estado  : " );
		estado.sigla=teclado.next();
		
		
		System.out.println(cidade.nome);
		System.out.println(cidade.estado.nome);
		System.out.println(cidade.estado.sigla);
		
		cidade.estado=estado;
		
		

	}

}
