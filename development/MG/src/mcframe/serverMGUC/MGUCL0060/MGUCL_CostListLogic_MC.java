package mcframe.serverMGUC.MGUCL0060;

import mcframe.commonCore.container.MCRow;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverMG.dbc.MGT_YM_NO_R;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;

abstract public class MGUCL_CostListLogic_MC extends mcframe.serverMAUD.MAUDL5070.MAUDL_ListLogicBase {
	
	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * 原価計算ＮＯを年月別原価計算ＮＯ情報（MGT_YM_NO）から取得する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>calc_grp_cd</td><td>計算グループＣＤ</td></tr>
	 * <tr><td>ym</td><td>年月</td></tr>
	 * </table>
	 * 
	 * @param up 検索条件
	 * @return 原価計算ＮＯ
	 */
	public MCRow _getCalcNoByYm(MCRow up) {
		MGT_YM_NO_R ymNoR = MGT_YM_NO_R.create();
		MGT_YM_NO_R t = MGT_YM_NO_R.create("T");
		MCQueryApiBuilder ymNoR_bldr = MCQueryApiBuilder.create(t);
		ymNoR_bldr.setSelect(t.calc_no);
		ymNoR_bldr.setWhere(t.calc_grp_cd.eq(bind("1")), up.getString("calc_grp_cd"));
		ymNoR_bldr.addWhereWithAnd(t.ym.eq(bind("1")), up.getDate("ym"));
		dbSelect(createSqlId("MGUCL0060", t, "MGUCL_CostListLogic_S01"), ymNoR, ymNoR_bldr);

		MCRow down = MCRow.create();
		down.addStringColumn("calc_no", ymNoR.calc_no());

		return down;
	}

}
