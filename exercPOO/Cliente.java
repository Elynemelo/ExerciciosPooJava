package exercPOO;

public class Cliente {

	private String nome;  //ATRIBUTOS DA CLASSE CLIENTE.
	private String codigo;
	
	
	public Cliente() {   //CONTRUTORES. Sendo 1 vazio e o outro com os atributos.
		
	}
	
	public Cliente(String nome, String codigo) {
	this.nome = nome;
	this.codigo = codigo;
			
	}
						//GETTERS AND SETTERS DOS ATRIBUTOS.
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	//void metodo1();{
//}
    
   //void metodo2(); {
//}
   
}



