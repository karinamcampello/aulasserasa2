package fgabank;

public class TestaBanco {
	
	public static void main(String[] args) {
		
//		Pessoa pessoaNumero1 = new Pessoa(); //criar uma inst�ncia (c�pia)
//		pessoaNumero1.nome="Jose das Couves";
//		pessoaNumero1.profissao="Agricultor";
//		pessoaNumero1.cpf="643.829.641-48";
//		
//		System.out.println("Nome: "+pessoaNumero1.nome);
//		System.out.println("Profiss�o: "+pessoaNumero1.profissao);
//		System.out.println("CPF: "+pessoaNumero1.cpf);
//		
//		Pessoa pessoaNumero2 = pessoaNumero1;
//		pessoaNumero2.nome = "Jo�o dos Tomates";
//		
//		System.out.println("=======================");
//		
//		System.out.println("Nome: "+pessoaNumero1.nome);
//		System.out.println("Nome: "+pessoaNumero2.nome);
		
		
		
	//	Pessoa pessoaNova = new Pessoa(); //Instanciamos a classe Pessoa
	//	pessoaNova.setNome("José das Couves");
	//	System.out.println("Nome: "+ pessoaNova.getNome());
		
	//	Pessoa pessoaComConstrutor1 = new Pessoa("João dos Tomates", "259.800.966-55","123,456-78");
		
	//	 System.out.println("Nome: " + pessoaComConstrutor1.getNome());
	//	 System.out.println("RG: " + pessoaComConstrutor1.getRg());
	//	 System.out.println("CPF: " + pessoaComConstrutor1.getCpf());
		
		
		
		
		PessoaFisica pfKarina = new PessoaFisica();
		pfKarina.setNome("Karina Campello");
		pfKarina.setEmail("karinamcmenezes@hotmail.com");
		pfKarina.setTelefone("81998807393");
		pfKarina.setCpf("879.359.983-88");
		pfKarina.setProfissao("Estagiária");
		pfKarina.setRg("12345678");
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
		//conta1.setSaldo(1000000.50); não se deve alterar diretamente esta informação. Ela apenas pode ser exibida.
		conta1.setTipoConta(pfKarina);
		
		conta1.depositar(100000);
		
		System.out.println("Agencia: "+conta1.getAgencia());
		System.out.println("Conta: "+conta1.getNumeroConta());
		System.out.println("Titular: "+conta1.getTitular().getNome());
		System.out.printf("Saldo Atual: R$ %.2f\n ",conta1.getSaldo());
		
		if(conta1.sacar(20.0)) {
			System.out.println("Saque efetuado com sucesso!");
		}else {
			System.out.println("Verifique valor do saldo!");
		}
		
		System.out.printf("Saldo Atual: R$ %.2f\n ",conta1.getSaldo());
		
		Conta conta2 = new Conta();
			conta2.setAgencia(5582);
			conta2.setNumeroConta(2234);
			
			conta1.transferir(10000.0, conta2);
			
			System.out.printf("Saldo Atual Karina: R$ %.2f\n ",conta1.getSaldo());
			System.out.printf("Saldo Atual Fernanda: R$ %.2f\n ",conta2.getSaldo());
			
			ContaCorrente cc1 = new ContaCorrente();
			cc1.depositar(1000.0);
			System.out.println("Saldo: "+cc1.getSaldo());
			System.out.println("Limite: "+cc1.getLimite());
			System.out.println("Saldo com Limite: "+cc1.getSaldoComLimite());
            cc1.sacar(1500);
            System.out.println(cc1.getSaldoComLimite());
			
		}
		
	}


