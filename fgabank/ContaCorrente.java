package fgabank;

public class ContaCorrente extends Conta {

	private double limite; 
	private double saldoComLimite;
	
	public ContaCorrente() {
		this.limite = 500.0;
		this.saldoComLimite = super.saldo+limite;
		
	}
	
	
	public double getLimite() {
		return this.limite; 
	}
	
	public double getSaldoComLimite() {
		this.saldoComLimite = this.limite + super.saldo;
		return this.saldoComLimite;
	}
	
	@Override 
	public boolean sacar(double valor){
		if(valor > 0 && saldo >= valor){
			saldo-=valor;
			return true;
		}else if(valor<=saldoComLimite) {
			saldo-=valor;
			return true;
		}
		return false;
		
}
    @Override 
	public boolean transferir(double valor, Conta destinatario) {
		if(valor > 0 && saldo >= valor) {
			saldo-=valor;
			destinatario.depositar(valor);
			return true;
		}
		    return false;
}
}