package mcframe.serverMAUD.MAUDL6010;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverFXBA.FXBAL0060.FXBAL_MCRLUtil;
import mcframe.commonCore.lang.MCDataType;
import static mcframe.serverCore.queryapi.IFMCSQL.*;

public abstract class MAUDL_RLSearcher_MC extends
		mcframe.serverMAUD.MAUDL5030.MAUDL_RLSearcher {

	// //////////////////////////////////////////
	// 検索前処理（ここから）
	// //////////////////////////////////////////

	protected static final String _stDtColName = "st_dt";
	protected static final String _endDtColName = "end_dt";

	/**
	 * 検索条件、適用開始日適用終了日FromToのカラム名
	 */
	protected static final String _stDtFrColName = "st_dt_fr";
	protected static final String _stDtToColName = "st_dt_to";
	protected static final String _endDtFrColName = "end_dt_fr";
	protected static final String _endDtToColName = "end_dt_to";
	
	/**
	 * 検索条件のLCL名称の末尾の文字列
	 */
	protected static final String _lclName = "_nm_lcl";
	
	@Override
	protected void condCustomize(MCRow cond) {
		super.condCustomize(cond);
		if (cond == null) {
			return;
		}
		checkDtFromToCnd(cond);
	}

	protected boolean _hasStDtFr;
	protected boolean _hasStDtTo;
	protected boolean _hasEndDtFr;
	protected boolean _hasEndDtTo;
	/**
	 * 適用開始日停止日FromTo検索条件の有無を確認します。
	 * 
	 */
	protected void checkDtFromToCnd(MCRow r) {
		_hasStDtFr = r.contains(_stDtFrColName);
		_hasStDtTo = r.contains(_stDtToColName);
		_hasEndDtFr = r.contains(_endDtFrColName);
		_hasEndDtTo = r.contains(_endDtToColName);
	}

	@Override
	protected <R extends MCDBContainer> void dbcCustomize(MCQueryApiBuilder builder, MCList<R> rslt) {
		super.dbcCustomize(builder, rslt);
		addDtFromToCnd(builder);
	}
	
	/**
	 * LCL名称の検索条件を追加します（LCL名称の上り電文のカラム名とDBコンテナのカラム名が異なるためO/R）<br>
	 * 例：<br>
	 * ・LCL名称の検索条件のカラム名：num_ptn_nm_lcl<br>
	 * ・DBコンテナのカラム名：num_ptn_nm<br>
	 */
	@Override
	protected void setWhere(MCQueryApiBuilder builder) {
		super.setWhere(builder);
		MCRow upR = getCond(getCurrentController());

		if (upR != null) {
			String[] upC = upR.getConstColumnPathArray();
			MCDBContainer dbc = builder.getBaseDbc();

			for (int i = 0; i < upC.length; i++) {
				String upCol = upC[i];
				if (upCol.endsWith(_lclName)) {
					// 末尾の「_lcl」を削除
					String dbcCol = upCol.substring(0, upCol.length()-4);
					// 末尾の「_lcl」を削除した文字列がDBコンテナに存在することを確認
					if (FXBAL_MCRLUtil.isLinkedToTableColumn(dbc, dbcCol)) {
						/* WHERE句を取得します。 */
						MCPermColumn col = dbc.getColumn$(dbcCol);
						MCPredicate where = getWhere(MCDataType.STRING, col, upCol);

						/* WHERE句を設定します。 */
						builder.addWhereWithCutOffAnd(where);
					}
				}
			}
		}
	}

	protected void addDtFromToCnd(MCQueryApiBuilder builder) {
		MCPermColumn st_dt = builder.getBaseDbc().getColumn$(_stDtColName);
		if(st_dt != null && st_dt instanceof MCDateExpr) {
			if(_hasStDtFr){
				builder.addWhereWithCutOffAnd(((MCDateExpr)st_dt).gte(bind(_stDtFrColName)));
			}
			if(_hasStDtTo){
				builder.addWhereWithCutOffAnd(((MCDateExpr)st_dt).lte(bind(_stDtToColName)));
			}
		}
		MCPermColumn end_dt = builder.getBaseDbc().getColumn$(_endDtColName);
		if(end_dt != null && end_dt instanceof MCDateExpr) {
			if(_hasEndDtFr){
				builder.addWhereWithCutOffAnd(((MCDateExpr)end_dt).gte(bind(_endDtFrColName)));
			}
			if(_hasEndDtTo){
				builder.addWhereWithCutOffAnd(((MCDateExpr)end_dt).lte(bind(_endDtToColName)));
			}
		}
	}

	// //////////////////////////////////////////
	// 検索前処理（ここまで）
	// //////////////////////////////////////////
}

