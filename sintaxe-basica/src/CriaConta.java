
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		//referiando a conta que criamos;
		primeiraConta.saldo = 200;
		//atribuindo um valor ao atributo primeiraConta;
		System.out.println("Saldo da primeira conta R$"+primeiraConta.saldo);
				
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Saldo da segunda conta R$"+segundaConta.saldo);
		
		
		//primeiraConta e segundaConta são referências, quando imprimimos, vemos um código um tanto estranho e isso ocorre pois são referências diferentes.
		
		
	}
}
