public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	//static atribui um valor a classe
	
	public Conta(int agencia, int numero) {
		Conta.total ++;
		//System.out.println("Total de conta abertas � "+total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Ol�, seja bem vindo ao BancoJava!");
		//System.out.println("Ag�ncia: "+this.agencia);
		//System.out.println("Conta: "+this.numero);
	}
	
	void deposita(double valor) {
		
		this.saldo += valor;
		
	}
	
	public boolean saca (double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	//Getter
	public double getSaldo() {
		return saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	//Setter
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("n�o pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0 ) {
			System.out.println("n�o pode valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
}
