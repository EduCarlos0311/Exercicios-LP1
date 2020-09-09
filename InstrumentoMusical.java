package exercicioE3;

public class InstrumentoMusical {
	private String nome;
	private String marca;
	private boolean afinacao;
	
	public InstrumentoMusical(String nome, String marca) {
		this.nome = nome;
		this.marca = marca;
		this.afinacao = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean getAfinacao() {
		return afinacao;
	}

	public void setAfinacao(boolean afinacao) {
		this.afinacao = afinacao;
	}
	
	public void afinar() {
		if(!afinacao) {
			this.afinacao = true;
			System.out.println("Instrumento afinado!");
		}
	}
	
	public void tocar() {
		if (afinacao == true) {
			System.out.println("Instrumento está sendo tocado.");
		}else {
			System.out.println("Instrumento desafinado, afine-o!");
		}
	}
	
	public void checarInformacoes() {
		System.out.println("Instrumento: " + getNome() + "\nMarca: " + getMarca() + "\nAfinação: " + getAfinacao());
	}
	
	
	
	
	

}
