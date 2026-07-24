package mcframe.serverMAUC.MAUCL0100;

import mcframe.commonCore.container.MCRow;

abstract public class MAUCL_AmtUtilListLogic_MC extends mcframe.serverMAUD.MAUDL5070.MAUDL_ListLogicBase {
	
	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * デフォルトの為替レートを取得する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>cur_cd_fr</td><td>換算元通貨ＣＤ</td></tr>
	 * <tr><td>cur_cd_to</td><td>換算先通貨ＣＤ</td></tr>
	 * <tr><td>xrate_cd</td><td>為替レートＣＤ</td></tr>
	 * <tr><td>base_dt</td><td>基準日</td></tr>
	 * </table>
	 * 
	 * @param up 検索条件
	 * @return デフォルトの為替レート
	 */
	public MCRow _getDefXrate(MCRow up) {
		MCRow r = MCRow.create();
		r.setNumberNE("xrate", MAUCL_AmtUtil.getDefXrate(up.getString("cur_cd_fr")
				, up.getString("cur_cd_to")
				, up.getString("xrate_cd")
				, up.getDate("base_dt")));
		return r;
	}
	
	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * デフォルトの為替レートを取得する。
	 * 取得できない場合は、NULLを返す。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>cur_cd_fr</td><td>換算元通貨ＣＤ</td></tr>
	 * <tr><td>cur_cd_to</td><td>換算先通貨ＣＤ</td></tr>
	 * <tr><td>xrate_cd</td><td>為替レートＣＤ</td></tr>
	 * <tr><td>base_dt</td><td>基準日</td></tr>
	 * </table>
	 * 
	 * @param up 検索条件
	 * @return デフォルトの為替レートまたはNULL
	 */
	public MCRow _getDefXrateNE(MCRow up) {
		MCRow r = MCRow.create();
		r.setNumberNE("xrate", MAUCL_AmtUtil.getDefXrateNE(up.getString("cur_cd_fr")
				, up.getString("cur_cd_to")
				, up.getString("xrate_cd")
				, up.getDate("base_dt")));
		return r;
	}
	
}
