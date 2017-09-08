import java.util.Scanner;

public class TesteContato {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        Contato contato = new Contato();
        
        System.out.println("Email : ");
        contato.email=teclado.next();
        System.out.println("Telefone : ");
        contato.telefone=teclado.next();
        System.out.println("celular : ");
        contato.celular=teclado.next();
        System.out.println("Voip : ");
        contato.voip=teclado.next();
        
        
        
        System.out.println(contato.email);
        System.out.println(contato.telefone);
        System.out.println(contato.celular);
        System.out.println(contato.voip);
        
        
	}

}
