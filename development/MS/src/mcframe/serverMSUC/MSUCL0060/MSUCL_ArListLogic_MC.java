package mcframe.serverMSUC.MSUCL0060;

import mcframe.commonCore.container.MCRow;
import mcframe.serverMSBG.MSBGL5080.*;

abstract public class MSUCL_ArListLogic_MC extends mcframe.serverMAUD.MAUDL5070.MAUDL_ListLogicBase {
	
	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * 得意先および通貨に対応する与信枠残高を取得する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>cst_cd</td><td>得意先ＣＤ</td></tr>
	 * <tr><td>cur_cd</td><td>通貨ＣＤ</td></tr>
	 * </table>
	 * 
	 * @param up 検索条件
	 * @return 与信枠残高
	 */
	public MCRow _getCred(MCRow up) {
		
		MSBGL_CredService.Cred_Srch01 ope = MSBGL_CredService.crtCred_Srch01();
		ope.up0().cst_cd(up.getString("cst_cd"));
		ope.up0().cur_cd(up.getString("cur_cd"));
		ope.exec();
		
		return ope.down0();
	}
	
}
