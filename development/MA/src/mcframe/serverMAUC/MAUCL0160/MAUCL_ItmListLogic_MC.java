package mcframe.serverMAUC.MAUCL0160;

import mcframe.commonCore.container.MCRow;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverMA.dbc.MAM_BP_ITM_R;
import mcframe.serverMA.dbc.MAM_ITM_LCL_R;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;

abstract public class MAUCL_ItmListLogic_MC extends mcframe.serverMAUD.MAUDL5070.MAUDL_ListLogicBase {
	
	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * 品目マスタ(ロケール別情報)のロケール別情報を取得する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>lcl_cd</td><td>ロケールＣＤ</td></tr>
	 * <tr><td>itm_cd</td><td>品目ＣＤ</td></tr>
	 * <tr><td>itm_sub1</td><td>枝番１</td></tr>
	 * <tr><td>itm_sub2</td><td>枝番２</td></tr>
	 * <tr><td>itm_sub3</td><td>枝番３</td></tr>
	 * </table>
	 * 
	 * @param up 検索条件
	 * @return 品目マスタ(ロケール別情報)のロケール別情報
	 */
	public MCRow _getItmLcl(MCRow up) {
		MAM_ITM_LCL_R result = MAM_ITM_LCL_R.create();
		MAM_ITM_LCL_R t = MAM_ITM_LCL_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);

		builder.setSelect(t.lcl_cd);
		builder.addSelect(t.itm_cd);
		builder.addSelect(t.itm_sub1);
		builder.addSelect(t.itm_sub2);
		builder.addSelect(t.itm_sub3);
		builder.addSelect(t.itm_nm);
		builder.addSelect(t.itm_alt_nm1);
		builder.addSelect(t.itm_alt_nm2);
		builder.addSelect(t.itm_alt_nm3);
		builder.addSelect(t.itm_alt_nm4);
		builder.addWhereWithAnd(t.lcl_cd.eq(bind("lcl_cd")));
		builder.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
		builder.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
		builder.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
		builder.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
		dbSelect(createSqlId(LOGIC_ID, t, "S01"), result, builder, up);

		return result;
	}
	
	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * 取引先品目情報情報を取得する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>bp_cd</td><td>取引先ＣＤ</td></tr>
	 * <tr><td>itm_cd</td><td>品目ＣＤ</td></tr>
	 * <tr><td>itm_sub1</td><td>枝番１</td></tr>
	 * <tr><td>itm_sub2</td><td>枝番２</td></tr>
	 * <tr><td>itm_sub3</td><td>枝番３</td></tr>
	 * <tr><td>dt</td><td>基準日</td></tr>
	 * </table>
	 * 
	 * @param up 検索条件
	 * @return 取引先品目情報
	 */
	protected MCRow _getBpItm(MCRow up) {
		MAM_BP_ITM_R result = MAM_BP_ITM_R.create();
		MAM_BP_ITM_R t = MAM_BP_ITM_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);

		builder.setSelect(t.bp_cd);
		builder.addSelect(t.itm_cd);
		builder.addSelect(t.itm_sub1);
		builder.addSelect(t.itm_sub2);
		builder.addSelect(t.itm_sub3);
		builder.addSelect(t.bp_itm_cd);
		builder.addSelect(t.bp_itm_nm);
		builder.addWhereWithAnd(t.bp_cd.eq(bind("bp_cd")));
		builder.addWhereWithAnd(t.itm_cd.eq(bind("itm_cd")));
		builder.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
		builder.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
		builder.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
		builder.addWhereWithAnd(bind("dt").between(t.st_dt, t.end_dt));
		dbSelect(createSqlId(LOGIC_ID, t, "S02"), result, builder, up);
		
		return result;
	}
	

	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * 源泉税率を取得する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>itm_cd</td><td>品目ＣＤ</td></tr>
	 * <tr><td>itm_sub1</td><td>枝番１</td></tr>
	 * <tr><td>itm_sub2</td><td>枝番２</td></tr>
	 * <tr><td>itm_sub3</td><td>枝番３</td></tr>
	 * <tr><td>dt</td><td>基準日</td></tr>
	 * </table>	 * 
	 * @param up 検索条件
	 * @return 源泉税率
	 */
	public MCRow _getWtaxRate(MCRow up) {
		MCRow r = MCRow.create();
		r.addNumberColumn("wtax_rate");

		sql(createSqlId(LOGIC_ID, "MAPA_TAX$F_GET_WTAX_RATE", "_getWtaxRate"))
		.mainQuery()
		.select(MAPA_TAX$F_GET_WTAX_RATE(bind("itm_cd"), bind("itm_sub1"), bind("itm_sub2"), bind("itm_sub3"), bind("dt"))
				.as("wtax_rate"))
		.executeQuery(up, r);

		return r;
	}
}
