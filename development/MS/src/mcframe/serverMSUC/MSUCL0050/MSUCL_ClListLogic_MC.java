package mcframe.serverMSUC.MSUCL0050;

import mcframe.commonCore.container.MCRow;

abstract public class MSUCL_ClListLogic_MC extends mcframe.serverMAUD.MAUDL5070.MAUDL_ListLogicBase {
	
	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * 締処理情報を取得する。
	 * <p>
	 * 検索条件のカラムは設定は不要。
	 * <p>
	 * </table>
	 * 
	 * @param up 検索条件
	 * @return 締処理情報
	 */
	public MCRow _getClose(MCRow up) {

		return MSUCL_ClUtil.getClose();
	}
	
}
