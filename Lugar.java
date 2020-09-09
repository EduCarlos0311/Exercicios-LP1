package exercicioE3;

public class Lugar {
	private String cidade;
	private String pais;
	private boolean pontoTuristico;
	private String clima;
	
	public Lugar(String cidade, String pais, String clima) {
		this.cidade = cidade;
		this.pais = pais;
		this.pontoTuristico = false;
		this.clima = clima;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public boolean getPontoTuristico() {
		return pontoTuristico;
	}

	public void setPontoTuristico(boolean pontoTuristico) {
		this.pontoTuristico = pontoTuristico;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}
	
	public void visitar() {
		System.out.println("O lugar está sendo visitado.");
	}
	
	public void chover() {
		System.out.println("Está chovendo neste local.");
	}
	
	public void serPontoTuristico() {
		this.pontoTuristico = true;
	}
	
	public void status() {
		System.out.println("Cidade: " + getCidade() + "\nPaís: " + getPais() + "\nÉ ponto turístico? " + getPontoTuristico() + "\nClima: " + getClima() + "\n");
	}
	
	
	

}
