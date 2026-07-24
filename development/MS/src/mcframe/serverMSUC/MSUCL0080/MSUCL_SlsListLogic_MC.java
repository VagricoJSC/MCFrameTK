package mcframe.serverMSUC.MSUCL0080;

import mcframe.commonCore.container.MCRow;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverMA.dbc.MAM_LOC_R;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverFXUC.FXUCL0020.FXUCL_MCDbUtil.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;

abstract public class MSUCL_SlsListLogic_MC extends mcframe.serverMAUD.MAUDL5070.MAUDL_ListLogicBase {
	
	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * 売上消費税ＣＤを取得する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>itm_cd</td><td>品目ＣＤ</td></tr>
	 * <tr><td>itm_sub1</td><td>枝番１</td></tr>
	 * <tr><td>itm_sub2</td><td>枝番２</td></tr>
	 * <tr><td>itm_sub3</td><td>枝番３</td></tr>
	 * <tr><td>cst_cd</td><td>得意先ＣＤ</td></tr>
	 * <tr><td>base_dt</td><td>基準日</td></tr>
	 * </table>
	 * 
	 * @param up 検索条件
	 * @return 売上消費税ＣＤ
	 */
	public MCRow _getSlsTaxCd(MCRow up) {

		MCRow down = MCRow.create();
		sql(createSqlId("MSUCL0080", "MAPA_TAX$F_GET_SLS_TAX_CD", "MSUCL_SlsListLogic__getSlsTaxCd"))
						.mainQuery()
						.select(MAPA_TAX$F_GET_SLS_TAX_CD(
								bind("itm_cd"),
								bind("itm_sub1"),
								bind("itm_sub2"),
								bind("itm_sub3"),
								bind("cst_cd"),
								bind("base_dt"))
								.as("tax_cd"))
						.executeQuery(up, down);
		return down;
	}
	
	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * 売上部門CDを元に仕入直送中継場所のワーキンググループを取得する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>dpt_cd</td><td>部門ＣＤ</td></tr>
	 * <tr><td>base_dt</td><td>基準日</td></tr>
	 * </table>
	 * 
	 * @param up 検索条件
	 * @return 仕入直送中継場所のワーキンググループＣＤ
	 */
	public MCRow _getMidLocWgCd(MCRow up) {

		MCRow result = MCRow.create();
		sql(createSqlId("MSUCL0080", "MAPA_LOC$F_GET_SLS_DPT_LOC_CD_NE", "MSUCL_SlsListLogic__getMidLocWgCd"))
						.mainQuery()
						.select(MAPA_LOC$F_GET_SLS_DPT_LOC_CD_NE(
								bind("dpt_cd"),
								bind("base_dt"))
								.as("loc_cd"))
						.executeQuery(up, result);

		MAM_LOC_R locR = MAM_LOC_R.create();
		MAM_LOC_R t = MAM_LOC_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.setSelect(t.wg_cd);
		dbSelectKey(createSqlId("MSUCL0080", t, "MSUCL_SlsListLogic__getMidLocWgCd"), locR, builder, result.getStringNE("loc_cd"));

		MCRow down = MCRow.create();
		down.addStringColumn("wg_cd", locR.wg_cd());
		
		return down;
	}
}
