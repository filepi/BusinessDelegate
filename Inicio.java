public class Inicio {

	public static void main(String[] args) {

		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setTipoDePersistencia("txt");

		Aluno aluno = new Aluno(businessDelegate);
		aluno.persistir();

		businessDelegate.setTipoDePersistencia("db");
		aluno.persistir();
		
		businessDelegate.setTipoDePersistencia("cloud");
		aluno.persistir();
		
	}
}
