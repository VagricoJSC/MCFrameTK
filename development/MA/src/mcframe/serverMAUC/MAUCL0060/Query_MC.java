package mcframe.serverMAUC.MAUCL0060;

import mcframe.serverCore.mcjdbc.MCDatabaseManager;

import java.util.Optional;
/**
 * SQLを管理するクラスです。
 */
abstract public class Query_MC {
	
	protected static final Query INSTANCE = new Query();
	
	protected Query _oracle = null;
	protected Query _postgresql = null;
	
	protected Query_MC() {
		super();
	}
	
	/**
	 * OracleDatabase用のSQLを管理します。
	 */
	protected class ORACLE extends Query{
		/**
		 * SELECT SEQ FROM TABLE(MAPA_NUM.F_GET_SEQ_LIST(:seqNm, :cnt))
		 */
		@Override
		protected String MACUL0060_MAPA_NUM_S01(){
			return "-- MACUL0060_MAPA_NUM_S01\n"
					+ "SELECT SEQ FROM TABLE(MAPA_NUM.F_GET_SEQ_LIST(:seqNm, :cnt))";
		};
	}

	/**
	 * PostgresqlDatabase用のSQLを管理します。
	 */
	protected class POSTGRESQL extends Query {
		
		/**
		 * select seq from mapa_num$f_get_seq_list(:seqNm, :cnt)
		 */
		@Override
		protected String MACUL0060_MAPA_NUM_S01(){
			return "select seq from mapa_num$f_get_seq_list(:seqNm, :cnt)";
		};
	}
	
	/**
	 * Oracle:{@link ORACLE#MACUL0060_MAPA_NUM_S01()}<br>
	 * Postgresql:{@link POSTGRESQL#MACUL0060_MAPA_NUM_S01()}
	 * @return sql
	 */
	protected String MACUL0060_MAPA_NUM_S01(){
		return null;
	};

	/**
	 * Databaseに対応したインスタンスを返します。
	 */
	protected static Query get() {
		return INSTANCE._get();
	}
	/**
	 * Databaseに対応したインスタンスを返します。
	 */
	protected Query _get() {
		if (MCDatabaseManager.isOracle()) {
			return Optional.
					ofNullable(_oracle).
					orElseGet(()->{
							_oracle = new ORACLE();
							return _oracle;
						});
		}

		return Optional.
				ofNullable(_postgresql).
				orElseGet(()->{
						_postgresql = new POSTGRESQL();
						return _postgresql;
					});
	}
	
}
