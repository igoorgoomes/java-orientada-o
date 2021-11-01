
public class TesteBanco {
	public static void main(String[] args) {
		Conta contaDoIgor = new Conta();
		contaDoIgor.agencia = 17;
		contaDoIgor.numero = 181203;
		//depositando um valor;	
		contaDoIgor.deposita(1000);
		
		
		//associando a conta ao titular;
		contaDoIgor.titular = new Cliente();
		contaDoIgor.titular.nome = "Igor Gomes Araujo";
		contaDoIgor.titular.cpf = "123.456.789-10";
		contaDoIgor.titular.profissao = "Programador";
		
		System.out.println(contaDoIgor.titular.nome);
		System.out.println(contaDoIgor.titular.cpf);
		System.out.println(contaDoIgor.titular.profissao);
		System.out.println("O seu saldo é de R$"+contaDoIgor.saldo);
				
		
	}
}
