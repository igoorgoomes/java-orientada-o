
public class TestaValores {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337,24226);
	
		Conta conta2 = new Conta(1337,24227);
		
		Conta conta3 = new Conta(1337,24227);
		
		System.out.println("Total de conta abertas é "+Conta.getTotal());
		
	}
}
