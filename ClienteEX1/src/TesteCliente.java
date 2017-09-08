import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Contato contato = new Contato();
		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();

		System.out.println("Nome : ");
		cliente.nome = teclado.next();
		System.out.println("Sobre Nome : ");
		cliente.sobrenome = teclado.next();
		System.out.println("Nome Fantasia : ");
		cliente.nomefantasia = teclado.next();
		System.out.println("Razão Social : ");
		cliente.razaosocial = teclado.next();
		System.out.println("Cpf : ");
		cliente.cpf = teclado.next();
		System.out.println("RG : ");
		cliente.rg = teclado.next();
		System.out.println("CNPJ : ");
		cliente.cnpj = teclado.next();
		System.out.println("Inscrição Social : ");
		cliente.inscricaosocial = teclado.next();

		System.out.println("Contato : ");
		contato.celular = teclado.next();

		System.out.println("Endereço : ");
		endereco.bairro = teclado.next();

		cliente.endereco = endereco;
		cliente.contato = contato;

		System.out.println(cliente.nome);
		System.out.println(cliente.sobrenome);
		System.out.println(cliente.nomefantasia);
		System.out.println(cliente.razaosocial);
		System.out.println(cliente.cpf);
		System.out.println(cliente.rg);
		System.out.println(cliente.cnpj);
		System.out.println(cliente.inscricaosocial);
		System.out.println(cliente.contato.celular);
		System.out.println(cliente.endereco.bairro);

	}

}
