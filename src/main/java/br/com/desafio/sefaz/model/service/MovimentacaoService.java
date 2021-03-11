package br.com.desafio.sefaz.model.service;

import java.util.List;

import br.com.desafio.sefaz.model.dao.DaoFactory;
import br.com.desafio.sefaz.model.dao.MovimentacaoDao;
import br.com.desafio.sefaz.model.entitie.Movimentacao;

public class MovimentacaoService {

	private MovimentacaoDao movimentacaoDao = DaoFactory.createMovimentacaoDao();

    public List<Movimentacao> selectAll() throws Exception {
        return movimentacaoDao.selectAll();
    }

    public MovimentacaoService insert(List<Movimentacao> lista) throws Exception {
        for (Movimentacao obj : lista) {
            movimentacaoDao.insert(obj);
        }

        return this;
    }

    public MovimentacaoService update(Movimentacao obj) throws Exception {
        movimentacaoDao.update(obj);
        return this;
    }

    public MovimentacaoService delete(Movimentacao obj) throws Exception {
        movimentacaoDao.delete(obj);
        return this;
    }

    public Movimentacao select(Integer id) throws Exception {
        return movimentacaoDao.select(id);
    }
}
