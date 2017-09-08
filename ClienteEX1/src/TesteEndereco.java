import java.util.Scanner;

public class TesteEndereco {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Endereco endereco = new Endereco();
		Cidade cidade = new Cidade();
		
		
		System.out.println("Rua : ");
		endereco.rua=teclado.next();
		System.out.println("Numero : ");
		endereco.numero=teclado.next();
		System.out.println("Bairro : ");
		endereco.bairro=teclado.next();
		System.out.println("complemento : ");
		endereco.complemento=teclado.next();
		System.out.println("Cep : ");
		endereco.cep=teclado.next();
		System.out.println("Cidade : ");
		cidade.nome=teclado.next();
		
		
		System.out.println(endereco.rua);
		System.out.println(endereco.numero);
		System.out.println(endereco.bairro);
		System.out.println(endereco.complemento);
		System.out.println(endereco.cep);
		System.out.println(endereco.cidade.nome);
		
		endereco.cidade=cidade;
	}

}
