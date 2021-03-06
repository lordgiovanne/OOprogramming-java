
public class CartaLacaio {
	
	private int ID;
	private String nome;
	private int ataque;
	private int vidaAtual;
	private int vidaMaxima;
	private int custoMana;
	
	//Metodo construtor aqui
	public CartaLacaio(int ID, String nome, int ataque, int vida, int mana){
		this.ID = ID;
		this.nome = nome;
		this.ataque = ataque;
		this.vidaAtual = vida;
		this.vidaMaxima = vida;
		this.custoMana = mana;
	}
	//Demais metodos aqui
	public int getID(){
		return ID;
	}
	
	public void setID(int ID){
		this.ID = ID;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public int getAtaque(){
		return ataque;
	}
	
	public void setAtaque(int ataque){
		this.ataque = ataque;
	}
	
	public int getVidaAtual(){
		return vidaAtual;
	}
	
	public void setVidaAtual(int vida){
		this.vidaAtual = vida;
	}
	
	public int getVidaMaxima(){
		return vidaMaxima;
	}
	
	public void setVidaMaxima(int vida){
		this.vidaMaxima = vida;
	}
	
	public int getCustoMana(){
		return custoMana;
	}
	
	public void setCustoMana(int mana){
		this.custoMana = mana;
	}
	
	public String toString(){
		String out = getNome() + " (ID: " + getID() + ")\n";
		out = out + "Ataque = " + getAtaque() + "\n";
		out = out + "Vida Atual = " + getVidaAtual() + "\n";
		out = out + "Vida Maxima = " + getVidaMaxima() + "\n";
		out = out + "Custo de Mana = " + getCustoMana() + "\n";
		return out;
	}
	
}
