package exercicioE3;

public class Profissional {
	private String nome;
	private String profissao;
	private float salario;
	private int tempoCasa;
	
	public Profissional(String nome, String profissao, float salario, int tempoCasa) {
		this.nome = nome;
		this.profissao = profissao;
		this.salario = salario;
		this.tempoCasa = tempoCasa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public int getTempoCasa() {
		return tempoCasa;
	}
	public void setTempoCasa(int tempoCasa) {
		this.tempoCasa = tempoCasa;
	}
	
	public void exercerFuncao() {
		System.out.println("Profissional está exercendo sua função.");
	}
	
	public void passarAno() {
		this.tempoCasa ++;
	}
	
	public void informarDados() {
		System.out.println("Profissioanl: " + getNome() + "\nProfissão: " + getProfissao() + "\nSalário: " + getSalario() + "\nTempo de casa: " + getTempoCasa() + "\n");
	}
	

}
