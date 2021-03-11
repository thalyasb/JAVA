package br.com.desafio.sefaz.model.dao;

import java.util.List;

import br.com.desafio.sefaz.model.entitie.Movimentacao;

public interface MovimentacaoDao {
 
	public static MovimentacaoDao createMovimentacaoDao() {
        return null; // new MovimentacaoDaoJDBC(DB.getConnection());
    }
	
	void insert(Movimentacao obj) throws Exception;

    void update(Movimentacao obj) throws Exception;

    void delete(Movimentacao obj) throws Exception;

    Movimentacao select(Integer id) throws Exception;

    List<Movimentacao> selectAll() throws Exception;
}
