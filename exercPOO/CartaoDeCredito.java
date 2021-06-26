package exercPOO;

public class CartaoDeCredito{

	//ATRIBUTOS
	private String numero;
	private String data_de_validade;
	private Cliente cliente;  //Vínculo de CartaoDeCredito com Cliente.
	
	//CONSTRUTORES. 1 VAZIO E OUTRO COM OS ATRIBUTOS.
	public CartaoDeCredito () {
		
	}
	
	public CartaoDeCredito (String numero, String data_de_validade, Cliente cliente) {
	this.numero = numero;
	this.data_de_validade = data_de_validade;
	this.cliente = cliente;
	
	}
	//GETTERS AND SETTERS
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getData_de_validade() {
		return data_de_validade;
	}

	public void setData_de_validade(String data_de_validade) {
		this.data_de_validade = data_de_validade;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}	

	//MÉTODOS
	
	//void metodo1();{
//}


	   //void metodo2(); {
//}
	
	





