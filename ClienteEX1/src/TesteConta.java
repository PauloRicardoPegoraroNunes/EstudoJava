import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria();
        Cliente cliente = new Cliente(); 
		
		System.out.println("Numero : ");
		conta.numero=teclado.next();
		System.out.println("Agencia : ");
		conta.agencia=teclado.next();
		System.out.println("Cliente : ");
		cliente.nome=teclado.next();
		
		
		conta.cliente=cliente;
		
		System.out.println(conta.numero);
		System.out.println(conta.agencia);
		System.out.println(conta.cliente.nome);
		
		
		
		
	}

}
