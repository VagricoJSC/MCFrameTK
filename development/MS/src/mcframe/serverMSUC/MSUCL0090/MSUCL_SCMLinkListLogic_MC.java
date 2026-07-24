package mcframe.serverMSUC.MSUCL0090;

import mcframe.commonCore.container.MCRow;

abstract public class MSUCL_SCMLinkListLogic_MC extends mcframe.serverMAUD.MAUDL5070.MAUDL_ListLogicBase {
	
	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * SCM IF制御マスタ情報を取得する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>if_proc_typ</td><td>ＩＦ処理区分</td></tr>
	 * <tr><td>loc_cd</td><td>場所ＣＤ</td></tr>
	 * <tr><td>lg_grp_cd</td><td>物流グループＣＤ</td></tr>
	 * <tr><td>itm_cd</td><td>品目ＣＤ</td></tr>
	 * <tr><td>itm_sub1</td><td>枝番１</td></tr>
	 * <tr><td>itm_sub2</td><td>枝番２</td></tr>
	 * <tr><td>itm_sub3</td><td>枝番３</td></tr>
	 * <tr><td>oper_cd</td><td>工程ＣＤ</td></tr>
	 * <tr><td>dlv_cd</td><td>納品先ＣＤ(*1)</td></tr>
	 * <tr><td>gr_loc_cd</td><td>入庫場所ＣＤ(*1)</td></tr>
	 * <tr><td>master_dt</td><td>マスタ適用日</td></tr>
	 * </table>
	 * *1：出荷指図からの呼び出しの場合、納品先ＣＤまたは入庫場所ＣＤのいずれかを指定する
	 * 
	 * @param up 検索条件
	 * @return SCM IF制御マスタ情報
	 */
	public MCRow _getScmIfCtrl(MCRow up) {

		SCMLinkUtil_Srch01_CndR r = SCMLinkUtil_Srch01_CndR.create();
		r.peg_no(1);
		r.if_proc_typ(up.getString("if_proc_typ"));
		r.loc_cd(up.getString("loc_cd"));
		r.lg_grp_cd(up.getString("lg_grp_cd"));
		r.itm_cd(up.getString("itm_cd"));
		r.itm_sub1(up.getString("itm_sub1"));
		r.itm_sub2(up.getString("itm_sub2"));
		r.itm_sub3(up.getString("itm_sub3"));
		r.oper_cd(up.getString("oper_cd"));
		r.dlv_cd(up.getString("dlv_cd"));
		r.gr_loc_cd(up.getString("gr_loc_cd"));
		r.master_dt(up.getDate("master_dt"));

		MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();
		o.up0().add(r);
		o.exec();
		return o.down0().get(0);
	}

	/**
	 * <font color="red">
	 * クライアントのリストロジック通信用のメソッド
	 * </font>
	 * <p>
	 * MESフラグを取得する。
	 * <p>
	 * 検索条件には以下の項目が設定されている必要がある。
	 * <p>
	 * <table border="1">
	 * <tr><th>項目名</th><th>説明</th></tr>
	 * <tr><td>loc_cd</td><td>場所ＣＤ</td></tr>
	 * <tr><td>itm_cd</td><td>品目ＣＤ</td></tr>
	 * <tr><td>itm_sub1</td><td>枝番１</td></tr>
	 * <tr><td>itm_sub2</td><td>枝番２</td></tr>
	 * <tr><td>itm_sub3</td><td>枝番３</td></tr>
	 * <tr><td>oper_cd/td><td>工程ＣＤ</td></tr>
	 * <tr><td>master_dt</td><td>マスタ適用日</td></tr>
	 * </table>
	 * 
	 * @param up 検索条件
	 * @return MESフラグ または null
	 */
	public MCRow _getScmIfCtrlForMes(MCRow up) {

		SCMLinkUtil_Srch02_CndR r = SCMLinkUtil_Srch02_CndR.create();
		r.peg_no(1);
		r.loc_cd(up.getString("loc_cd"));
		r.itm_cd(up.getString("itm_cd"));
		r.itm_sub1(up.getString("itm_sub1"));
		r.itm_sub2(up.getString("itm_sub2"));
		r.itm_sub3(up.getString("itm_sub3"));
		r.oper_cd(up.getString("oper_cd"));
		r.master_dt(up.getDate("master_dt"));

		MSUCL_SCMLinkUtil.SCMLinkUtil_Srch02 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch02();
		o.up0().add(r);
		o.exec();
		return o.down0().get(0);
	}
}
