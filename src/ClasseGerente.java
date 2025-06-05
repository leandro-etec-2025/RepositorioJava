
public class ClasseGerente extends ClasseIndividuo{

	// Atributo
	private String setorAt;
	
	// Construtor 
	public ClasseGerente(String nome, int renda, String setor) {
		Super(nome, renda, setor);
		this.setorAt = setor;
	}
	
}
