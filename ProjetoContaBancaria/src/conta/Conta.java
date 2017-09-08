package conta;

public abstract class Conta {

	public Double saldo;
	
	public void depositar(Double valorDeposito) {
		saldo = saldo + valorDeposito;
	}
	
	public void sacar(Double valorDeposito) {
		saldo = saldo - valorDeposito;
	}
	
	public Double imprimirSaldo() {
		return saldo;
	}
	
}