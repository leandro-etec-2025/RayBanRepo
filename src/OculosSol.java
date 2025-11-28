
public class OculosSol extends Produtos{
	
	String corLente;
	
	// Construtor
	public OculosSol(String cor, float preco, String pigmentacao){
		super(cor, preco);

		this.corLente = pigmentacao;
	
	}
	
	public void setCorLente(String pigmento){
		this.corLente = pigmento;
	}
	
	public String getCorLente(){
		return corLente;
	}
	
	
	

}
