package mcframe.serverMSUC.MSUCL0100;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.serverMSBH.MSBHL5010.MSBHL_ApUtil;

abstract public class MSUCL_ApListLogic_MC extends mcframe.serverMAUD.MAUDL5070.MAUDL_ListLogicBase {
	
	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * 支払予定管理先締日を取得する。<br/>
	 * 支払起算日／支払繰越回数から支払予定管理先締年月日を算出し、設定する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>bsppl_cd</td><td>支払予定管理先ＣＤ</td></tr>
	 * <tr><td>pay_basis_dt</td><td>支払起算日</td></tr>
	 * <tr><td>pay_crryovr_times</td><td>支払繰越回数</td></tr>
	 * </table>
	 * 
	 * @param up 検索条件
	 * @return 支払予定管理先締日
	 */
	public MCRow _getBspplClDt(MCRow up) {

		MCList<MCRow> list = MCList.create(up);
		list.addStringColumn("bsppl_cd");
		list.add(up);
		mcframe.serverMSBH.MSBHL5010.MSBHL_ApUtil.setBspplClDt(list, "bsppl_cd",
				"pay_basis_dt", "pay_crryovr_times", "bsppl_cl_dt", "bsppl_cl_ym",
				"bsppl_cl_day");

		return up;
	}
	
	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * 手数料税ＣＤを取得する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>base_dt</td><td>基準日</td></tr>
	 * </table>
	 * 
	 * @param up 検索条件
	 * @return 手数料税ＣＤ
	 */
	public MCRow _getComPaidTaxCd(MCRow up) {
		String tax_cd = MSBHL_ApUtil.getComPaidAndSetoffTaxCd(up.getDate("base_dt"));

		MCRow down = MCRow.create();
		down.addStringColumn("tax_cd", tax_cd);
		
		return down;
	}
}
