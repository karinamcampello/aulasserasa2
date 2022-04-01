package fgabank;

public class Conta {
//atributos
	private int agencia;
	private int numeroConta;
	protected double saldo;
	private PessoaHerança titular;
	
	//construtores
	public Conta() { //padrão
		
	}

	

public Conta(int agencia, int numeroConta, PessoaHerança titular) {//sobrecarregado
		super();
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0;
	}



//metodos

public void depositar(double valor) {
 if (valor > 0) {
	 saldo+=valor; //saldo = saldo + valor;
 }
	
	
}


public boolean sacar(double valor) {
	if(valor > 0 && saldo >= valor) {
		saldo-=valor;
		return true;
	}
	
	return false;
}

public boolean transferir(double valor, Conta destinatario) {
	if(valor > 0 && saldo >= valor) {
		saldo-=valor;
		destinatario.depositar(valor);
		return true;
	}
	
	return false;
}

	//encapsulamentos
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int conta) {
		this.numeroConta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public PessoaHerança getTitular() {
		return titular;
	}
	public void setTipoConta(PessoaHerança titular) {
		this.titular = titular;
	}
	
	
	
	
	
	
}
