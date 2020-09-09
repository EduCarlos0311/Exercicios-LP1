package exercicioE3;

public class Teste {

	public static void main(String[] args) {
		//Lugar
		Lugar l[] = new Lugar[5];
		l[0] = new Lugar("Cidade1", "País1", "Tropical");
		l[0].visitar();
		l[0].chover();
		l[0].serPontoTuristico();
		l[0].status();
		
		l[1] = new Lugar("Cidade2", "País2", "Temperado");
		l[1].visitar();
		l[1].status();
		
		l[2] = new Lugar("Cidade3", "País3", "SubTropical");
		l[2].chover();
		l[2].serPontoTuristico();
		l[2].status();
		
		l[3] = new Lugar("Cidade4", "País4", "Mediterrâneo");
		l[3].visitar();
		l[3].chover();
		l[3].status();
		
		l[4] = new Lugar("Cidade5", "País5", "Semiárido");
		l[4].chover();
		l[4].serPontoTuristico();
		l[4].status();
		
		//Pessoa
		Pessoa pes[] = new Pessoa[5];
		pes[0] = new Pessoa("Carlos", 21, 70, "M");
		pes[0].statusPessoa();
		pes[0].fazerAniverario();
		pes[0].statusPessoa();
		
		pes[1] = new Pessoa("Pedro", 32, 85 , "M");
		pes[1].statusPessoa();
		pes[1].engordar(3.5f);
		pes[1].statusPessoa();
		
		pes[2] = new Pessoa("Maria", 24, 61 , "F");
		pes[2].statusPessoa();
		pes[2].emagrecer(4.7f);
		pes[2].statusPessoa();
		
		pes[3] = new Pessoa("Leona", 19, 57 , "F");
		pes[3].statusPessoa();
		pes[3].emagrecer(3);
		pes[3].fazerAniverario();
		pes[3].statusPessoa();
		
		pes[4] = new Pessoa("Paulo", 45, 93 , "M");
		pes[4].statusPessoa();
		pes[4].engordar(5);
		pes[4].fazerAniverario();
		pes[4].statusPessoa();
		
		//Aluno
		Aluno alu[] = new Aluno[5];
		alu[0] = new Aluno("João", 111111111, "Banco de dados");
		alu[0].fazerProva();
		alu[0].matricularAluno();
		alu[0].checarMatricula();
		
		alu[1] = new Aluno("Maria", 222222222, "Logística");
		alu[1].checarMatricula();
		alu[1].fazerProva();
		
		alu[2] = new Aluno("Carlos", 333333333, "ADS");
		alu[2].matricularAluno();
		alu[2].checarMatricula();
		alu[2].fazerProva();
		
		alu[3] = new Aluno("Marcos", 444444444, "GPI");
		alu[3].matricularAluno();
		alu[3].checarMatricula();
		
		alu[4] = new Aluno("Marcela", 555555555, "Banco de dados");
		alu[4].matricularAluno();
		alu[4].checarMatricula();
		alu[4].fazerProva();

		
		//Instrumento Musical
		InstrumentoMusical inst[] = new InstrumentoMusical[5];
		inst[0] = new InstrumentoMusical("Violão", "Tagima");
		inst[0].tocar();
		inst[0].checarInformacoes();
		inst[0].afinar();
		inst[0].checarInformacoes();
		
		inst[1] = new InstrumentoMusical("Violino", "Eagle");
		inst[1].tocar();
		inst[1].checarInformacoes();
		inst[1].afinar();
		inst[1].checarInformacoes();
		
		inst[2] = new InstrumentoMusical("Saxofone", "Benson");
		inst[2].tocar();
		inst[2].checarInformacoes();
		inst[2].afinar();
		inst[2].checarInformacoes();
		
		inst[3] = new InstrumentoMusical("Bateria", "Pearl");
		inst[3].tocar();
		inst[3].checarInformacoes();
		inst[3].afinar();
		inst[3].checarInformacoes();
		
		inst[4] = new InstrumentoMusical("Violoncelo ", "Hofma");
		inst[4].tocar();
		inst[4].checarInformacoes();
		inst[4].afinar();
		inst[4].checarInformacoes();
		
		
		//Profissional
		Profissional pro[] = new Profissional[5];
		pro[0] = new Profissional("Marcos", "Policial Militar", 3300.97f, 8);
		pro[0].exercerFuncao();
		pro[0].passarAno();
		pro[0].informarDados();
		
		pro[1] = new Profissional("Maria", "Advogada", 4964.00f, 10);
		pro[1].exercerFuncao();
		pro[1].passarAno();
		pro[1].informarDados();
		
		pro[2] = new Profissional("Julia", "Médica", 9977.00f, 20);
		pro[2].exercerFuncao();
		pro[2].passarAno();
		pro[2].informarDados();
		
		pro[3] = new Profissional("Pedro", "Engenheiro Civil", 6416.00f, 22);
		pro[3].exercerFuncao();
		pro[3].passarAno();
		pro[3].informarDados();
		
		pro[4] = new Profissional("Paulo", "Bombeiro Militar",  3116.76f, 3);
		pro[4].exercerFuncao();
		pro[4].passarAno();
		pro[4].informarDados();
		
		
		//Calçado
		Calcado calc[] = new Calcado[5];
		calc[0] = new Calcado("Esportivo", "Adidas", "Cinza" , 159.99f);
		calc[0].alterarCorPara("Cinza");
		calc[0].mostrarInformacoes();
		
		calc[1] = new Calcado("Chuteira", "Nike", "Preto" , 248.99f);
		calc[1].alterarCorPara("Vermelho");
		calc[1].comprarCalcado();
		calc[1].mostrarInformacoes();
		
		calc[2] = new Calcado("Bota Feminina", "Neway", "Preto" , 147.99f);
		calc[2].alterarCorPara("Marrom");
		calc[2].mostrarInformacoes();
		
		calc[3] = new Calcado("Bota Feminina", "Lallu", "Cinza" , 140.99f);
		calc[3].comprarCalcado();
		calc[3].mostrarInformacoes();
		
		calc[4] = new Calcado("Tenis Casual", "Polo", "Azul" , 79.99f);
		calc[4].alterarCorPara("Azul");
		calc[4].mostrarInformacoes();
		calc[4].alterarCorPara("Verde");
		calc[4].mostrarInformacoes();
			
	}

}
