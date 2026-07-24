package mcframe.serverMSUC.MSUCL0110;

import mcframe.commonCore.container.MCRow;

abstract public class MSUCL_StrLnListLogic_MC extends mcframe.serverMAUD.MAUDL5070.MAUDL_ListLogicBase {
	
	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * 品目と場所から標準の棚・ラインＣＤを取得する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>itm_cd</td><td>品目ＣＤ</td></tr>
	 * <tr><td>itm_sub1</td><td>枝番１</td></tr>
	 * <tr><td>itm_sub2</td><td>枝番２</td></tr>
	 * <tr><td>itm_sub3</td><td>枝番３</td></tr>
	 * <tr><td>loc_cd</td><td>場所ＣＤ</td></tr>

	 * </table>
	 * 
	 * @param up 検索条件
	 * @return 標準棚・ラインＣＤ
	 */
	public MCRow _getDefStrLnCd(MCRow up) {

		StrLnUtil_Srch01_CndR r = StrLnUtil_Srch01_CndR.create();
		r.peg_no(1);
		r.itm_cd(up.getString("itm_cd"));
		r.itm_sub1(up.getString("itm_sub1"));
		r.itm_sub2(up.getString("itm_sub2"));
		r.itm_sub3(up.getString("itm_sub3"));
		r.loc_cd(up.getString("loc_cd"));

		MSUCL_StrLnUtil.StrLnUtil_Srch01 o = MSUCL_StrLnUtil.crtStrLnUtil_Srch01();
		o.up0().add(r);
		o.exec();
		return o.down0().get(0);
	}
}
