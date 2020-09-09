package exercicioE3;

public class Pessoa {
	private String nome;
	private int idade;
	private float peso;
	private String sexo;
	
	public Pessoa(String nome, int idade, float peso, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void fazerAniverario() {
		this.idade ++;
	}
	
	public void engordar(float quilos) {
		this.peso = this.peso + quilos;
	}
	
	public void emagrecer(float quilos) {
		this.peso = this.peso - quilos;
	}
	
	public void statusPessoa() {
		System.out.println("\nNome: " + getNome() + "\nIdade: " + getIdade() + "\nPeso: "+ getPeso() + "\nSexo: " + getSexo());
	}
}
