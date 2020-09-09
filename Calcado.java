package exercicioE3;

public class Calcado {
	private String tipo;
	private String marca;
	private String cor;
	private float preco;
	
	public Calcado(String tipo, String marca, String cor, float preco) {
		this.tipo = tipo;
		this.marca = marca;
		this.cor = cor;
		this.preco = preco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void alterarCorPara(String c) {
		if(!this.cor.equals(c)) {
			this.cor = c;
			System.out.println("Cor alterada com sucesso!");
		}else {
			System.out.println("Calçado já se encontra na cor desejada..");
		}
	}
	
	public void comprarCalcado() {
		System.out.println("O calçado foi comprado!");
	}
	
	public void mostrarInformacoes() {
		System.out.println("\nTipo de calçado: " + getTipo() + "\nMarca: " + getMarca() + "\nCor: " + getCor() + "\nPreço: " + getPreco());
	}
	
	
	

}
