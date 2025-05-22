
public class Classeprincipal {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario(); // instanciar
		Funcionario f2 = new Funcionario(); // f2 = objeto
		
		f1.nomeAt = "Rafael"; // Errada! 
		f1.mostrarNomeMet(); //get
		f1.rendaAt = 10_000; // Errada (correto linha 14)
		f1.mostrarRendaMet(); //get
		
		f1.receberRendaMet(15_000); // igual a linha 11

	}

}
