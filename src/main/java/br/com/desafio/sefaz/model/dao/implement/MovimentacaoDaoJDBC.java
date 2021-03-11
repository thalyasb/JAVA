package br.com.desafio.sefaz.model.dao.implement;

import br.com.desafio.sefaz.model.dao.MovimentacaoDao;
import br.com.desafio.sefaz.model.entitie.Movimentacao;
import br.com.desafio.sefaz.model.enums.Status;
import br.com.desafio.sefaz.utils.mysql.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovimentacaoDaoJDBC implements MovimentacaoDao {

	private Connection conn;

	final private static String INSERT = "";
	final private static String UPDATE = "";
	final private static String DELETE = "";
	final private static String SELECT = "SELECT kanji, leitura, tipo, quantidade, percentual, media, percMedia, corSequencial FROM estatistica WHERE kanji = ? AND leitura = ? ;";
	final private static String SELECT_ALL = "";

	public MovimentacaoDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	public void update(Movimentacao obj) throws Exception {
// TODO Auto-generated method stub

	}

	public void delete(Movimentacao obj) throws Exception {
// TODO Auto-generated method stub

	}

	public Movimentacao select(Integer id) throws Exception {
// TODO Auto-generated method stub
		return null;
	}

	public List<Movimentacao> selectAll() throws Exception {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {

			
			st = conn.prepareStatement(SELECT_ALL);
			rs = st.executeQuery();

			List<Movimentacao> list = new ArrayList<Movimentacao>();

			while (rs.next()) {
				list.add(new Movimentacao(rs.getInt("id"), rs.getString("descrica"), rs.getDate("vencimento"),
						Status.valueOf(rs.getString("status")), rs.getDouble("valor")));
			}

			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Erro ao fazer o select");
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public void insert(Movimentacao obj) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
