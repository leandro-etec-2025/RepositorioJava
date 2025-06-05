public class ClasseIndividuo {

	// Atributo
	private String nomeAt;
	private int rendaAt;
	
	// Construtor
	public ClasseIndividuo(String nome, int renda) {
		this.nomeAt = nome;
		this.rendaAt = renda;
	}
	
	//Método
	public void mostrarNome() {
		System.out.println(this.nomeAt);
	}
	
	// Método
	public void mostrarRenda() {
		System.out.println(this.rendaAt);
	}
	
}
