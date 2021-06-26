package exercPOO;

public class TesteCartaodecredito {

	public static void main(String[] args) {
		
		//Criação do 1º objeto de Cliente e seus respectivos valores. 
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Maria Jose");
		cliente1.setCodigo("0102");
		
		//Criação do 2º objeto de Cliente e seus respectivos valores.
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Joao da Silva");
		cliente2.setCodigo("0103");
		
		//Criação do 1º objeto de CartaoDeCredito e seus respectivos valores.
		CartaoDeCredito cartao1 = new CartaoDeCredito();
		cartao1.setNumero("3245567821");
		cartao1.setData_de_validade("02/22");
		cartao1.setCliente(cliente1);
		
		//Criação do 2º objeto de CartaoDeCredito e seus respectivos valores.
		CartaoDeCredito cartao2 = new CartaoDeCredito();
		cartao2.setNumero("0506070811");
		cartao2.setData_de_validade("05/23");
		cartao2.setCliente(cliente2);
		
		//Dados da tela
		System.out.println("_________CLIENTES_________");
		System.out.println("Nome: " + cartao1.getCliente().getNome() + "\n"+ "Codigo: " + cliente1.getCodigo());
		System.out.println("Cartao: " + cartao1.getNumero() + "\n"+ "Data de validade: " + cartao1.getData_de_validade());
		
		System.out.println("\n" +"Nome: " + cartao2.getCliente().getNome() + "\n"+ "Codigo: " + cliente2.getCodigo());
		System.out.println("Cartao: " + cartao2.getNumero() + "\n"+ "Data de validade: " + cartao2.getData_de_validade());
		
		//cartao2.metodo1();
		
		
		
		

	}

}
