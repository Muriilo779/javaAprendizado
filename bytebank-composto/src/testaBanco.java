
public class testaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Fernando";
		paulo.cpf = "222.222.222-22";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
	}
}
