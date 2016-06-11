public class BusinessLookUp {

	public FuncoesDoSistema getTipoDePersistencia(String persistencia) {

		if (persistencia.equalsIgnoreCase("db"))
			return new PersistenciaViaDB();
		else if (persistencia.equalsIgnoreCase("txt"))
			return new PersistenciaViaArquivo();
		else
			return new PersistenciaViaNuvem();
	}
}
