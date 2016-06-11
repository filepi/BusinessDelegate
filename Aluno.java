
public class Aluno {
	
	BusinessDelegate businessService;

	public Aluno(BusinessDelegate businessService) {
		this.businessService = businessService;
	}

	public void persistir() {
		businessService.realizarOperacao();
	}
}
