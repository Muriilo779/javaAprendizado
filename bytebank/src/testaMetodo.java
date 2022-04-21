
public class testaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(50);
		System.out.println(conta.saldo);
		
		boolean depositouOuNao = conta.saca(40);
		System.out.println(conta.saldo);
		System.out.println(depositouOuNao);
		
		Conta conta2 = new Conta();
		conta2.deposita(100);
		conta2.transfere(80, conta);
		System.out.println(conta.saldo);
		System.out.println(conta2.saldo);
	}
}
