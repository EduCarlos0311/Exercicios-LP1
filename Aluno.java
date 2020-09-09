package exercicioE3;

public class Aluno {
	private String nome;
	private int ra;
	private String curso;
	private boolean matricula;
	
	public Aluno(String nome, int ra, String curso) {
		this.nome = nome;
		this.ra = ra;
		this.curso = curso;
		this.matricula = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public boolean getMatricula() {
		return matricula;
	}

	public void setMatricula(boolean matricula) {
		this.matricula = matricula;
	}
	
	public void matricularAluno() {
		this.matricula = true;
	}
	
	public void fazerProva() {
		if (matricula) {
			System.out.println("O aluno " + getNome() + " de " + getCurso() + " está fazendo prova.");
		}else {
			System.out.println("Aluno não matriculado!");
		}
	}
	
	public void checarMatricula() {
		System.out.println("\nAluno: " + getNome() + "\nRA: " + getRa() + "\nMatricula: "+ getMatricula());
	}
	
	
	
	

}
