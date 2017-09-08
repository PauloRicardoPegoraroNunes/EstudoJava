package conta;

import org.junit.Assert;
import org.junit.Test;

public class ContaCorrenteTest {

	@Test
	public void deveCriarContaCorrente() {
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.saldo = 100.00;

		Assert.assertEquals(new Double(100), contaCorrente.imprimirSaldo());
	}
	
	@Test
	public void deveDepositar() {
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.saldo = 100.00;

		Assert.assertEquals(new Double(100), contaCorrente.imprimirSaldo());
		
		contaCorrente.depositar(187.00);
		
		Assert.assertEquals(new Double(287), contaCorrente.imprimirSaldo());
	}
	
	@Test
	public void deveSacar() {
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.saldo = 100.00;

		Assert.assertEquals(new Double(100), contaCorrente.imprimirSaldo());
		
		contaCorrente.sacar(75.00);
		
		Assert.assertEquals(new Double(25), contaCorrente.imprimirSaldo());
	}
	
	
}
