
public class TesteBanco {
	public static void main(String[] args) {
		Conta contaDoIgor = new Conta(1337,24226);
		contaDoIgor.setAgencia(17);
		contaDoIgor.setNumero(181203);
		//depositando um valor;	
		contaDoIgor.deposita(1000);
		
		
		//associando a conta ao titular;
		contaDoIgor.setTitular(new Cliente());
		contaDoIgor.getTitular().nome = "Igor Gomes Araujo";
		contaDoIgor.getTitular().cpf = "123.456.789-10";
		contaDoIgor.getTitular().profissao = "Programador";
		
		System.out.println(contaDoIgor.getTitular().nome);
		System.out.println(contaDoIgor.getTitular().cpf);
		System.out.println(contaDoIgor.getTitular().profissao);
		System.out.println("O seu saldo é de R$"+contaDoIgor.getSaldo());
				
		
	}
}
