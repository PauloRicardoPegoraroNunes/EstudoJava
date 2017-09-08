package cliente;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

	@Test
	public void deveCriarCliente() {
		Cliente cliente = new Cliente();
		cliente.nome = "Joao Saldanha";
		cliente.cpf = "265";
		cliente.idade = 22;
		
		Assert.assertEquals("Joao Saldanha", cliente.nome);
		Assert.assertEquals("265", cliente.cpf);
		Assert.assertEquals(22, cliente.idade);
	}
	
}