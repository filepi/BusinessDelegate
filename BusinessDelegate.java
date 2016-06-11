
public class BusinessDelegate {

	private BusinessLookUp lookupService = new BusinessLookUp();
	
	private FuncoesDoSistema businessService;
	
	private String tipoDePersistencia;

	public void setTipoDePersistencia(String tipoPersistencia) {
		this.tipoDePersistencia = tipoPersistencia;
	}

	public void realizarOperacao() {
		businessService = lookupService.getTipoDePersistencia(tipoDePersistencia);
		businessService.persisteAluno();
	}
}
