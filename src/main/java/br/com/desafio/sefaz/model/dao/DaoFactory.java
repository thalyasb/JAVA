package br.com.desafio.sefaz.model.dao;

import br.com.desafio.sefaz.model.dao.implement.MovimentacaoDaoJDBC;
import br.com.desafio.sefaz.utils.mysql.DB;

public class DaoFactory {

	public static MovimentacaoDao createMovimentacaoDao() {
		 return  new MovimentacaoDaoJDBC(DB.getConnection());
	}
}
