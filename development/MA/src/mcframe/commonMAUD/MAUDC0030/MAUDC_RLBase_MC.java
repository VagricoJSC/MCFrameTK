package mcframe.commonMAUD.MAUDC0030;

import mcframe.commonFXBA.FXBAC0050.FXBAC_RLBase;

public class MAUDC_RLBase_MC extends FXBAC_RLBase {
	
	protected static MAUDC_RLBase me() {
		return new MAUDC_RLBase();
	}

	/**画面、ロジック(ＤＢコンテナ含む)共通の登録担当者名カラム名*/
	protected static final String $INS_USR_NM = "ins_usr_nm";

	/**画面、ロジック(ＤＢコンテナ含む)共通の更新担当者名カラム名*/
	protected static final String $UPD_USR_NM = "upd_usr_nm";

	/**画面、ロジック(ＤＢコンテナ含む)共通の論理削除ユーザＩＤカラム名*/
	protected static final String $DEL_USR_ID = "del_usr_id";

	/**画面、ロジック(ＤＢコンテナ含む)共通の論理削除ユーザ名カラム名*/
	protected static final String $DEL_USR_NM = "del_usr_nm";

	/**画面、ロジック(ＤＢコンテナ含む)共通の論理削除日時カラム名*/
	protected static final String $DEL_TS = "del_ts";

	/**画面、ロジック(ＤＢコンテナ含む)共通の登録機能ＩＤカラム名*/
	protected static final String $INS_FUNC_ID = "ins_func_id";

	/**画面、ロジック(ＤＢコンテナ含む)共通の登録機能名カラム名*/
	protected static final String $INS_FUNC_NM = "ins_func_nm";

	/**画面、ロジック(ＤＢコンテナ含む)共通の更新機能ＩＤカラム名*/
	protected static final String $UPD_FUNC_ID = "upd_func_id";

	/**画面、ロジック(ＤＢコンテナ含む)共通の更新機能名カラム名*/
	protected static final String $UPD_FUNC_NM = "upd_func_nm";

	/**画面、ロジック(ＤＢコンテナ含む)共通の更新リクエストＮＯカラム名*/
	protected static final String $UPD_SRV_REQ_NO = "upd_srv_req_no";
	
	/**
	 * 画面、ロジック共通の登録担当者名カラム名を取得します。<p>
	 * 画面、ロジックではそれぞれCPP_RLUtil、CPL_RLUtilの同名メソッドを使用して下さい。
	 */
	public static String getInsUsrNmColumn(){
		return me()._getInsUsrNmColumn();
	}
	/**
	 * 画面、ロジック共通の登録担当者名カラム名を取得します。<p>
	 */
	protected String _getInsUsrNmColumn(){
		return $INS_USR_NM;
	}
	/**
	 * 画面、ロジック共通の更新担当者名カラム名を取得します。<p>
	 * 画面、ロジックではそれぞれCPP_RLUtil、CPL_RLUtilの同名メソッドを使用して下さい。
	 */
	public static String getUpdUsrNmColumn(){
		return me()._getUpdUsrNmColumn();
	}
	/**
	 * 画面、ロジック共通の更新担当者名カラム名を取得します。<p>
	 */
	protected String _getUpdUsrNmColumn(){
		return $UPD_USR_NM;
	}
	/**
	 * 画面、ロジック共通の論理削除ユーザＩＤカラム名を取得します。<p>
	 * 画面、ロジックではそれぞれCPP_RLUtil、CPL_RLUtilの同名メソッドを使用して下さい。
	 */
	public static String getDelUsrIdColumn(){
		return me()._getDelUsrIdColumn();
	}
	/**
	 * 画面、ロジック共通の論理削除ユーザＩＤカラム名を取得します。<p>
	 */
	protected String _getDelUsrIdColumn(){
		return $DEL_USR_ID;
	}
	/**
	 * 画面、ロジック共通の論理削除ユーザ名カラム名を取得します。<p>
	 * 画面、ロジックではそれぞれCPP_RLUtil、CPL_RLUtilの同名メソッドを使用して下さい。
	 */
	public static String getDelUsrNmColumn(){
		return me()._getDelUsrNmColumn();
	}
	/**
	 * 画面、ロジック共通の論理削除ユーザ名カラム名を取得します。<p>
	 */
	protected String _getDelUsrNmColumn(){
		return $DEL_USR_NM;
	}
	/**
	 * 画面、ロジック共通の論理削除日時カラム名を取得します。<p>
	 * 画面、ロジックではそれぞれCPP_RLUtil、CPL_RLUtilの同名メソッドを使用して下さい。
	 */
	public static String getDelTsColumn(){
		return me()._getDelTsColumn();
	}
	/**
	 * 画面、ロジック共通の論理削除日時カラム名を取得します。<p>
	 */
	protected String _getDelTsColumn(){
		return $DEL_TS;
	}
	/**
	 * 画面、ロジック共通の登録機能ＩＤカラム名を取得します。<p>
	 * 画面、ロジックではそれぞれCPP_RLUtil、CPL_RLUtilの同名メソッドを使用して下さい。
	 */
	public static String getInsFuncIdColumn(){
		return me()._getInsFuncIdColumn();
	}
	/**
	 * 画面、ロジック共通の登録機能ＩＤカラム名を取得します。<p>
	 */
	protected String _getInsFuncIdColumn(){
		return $INS_FUNC_ID;
	}
	/**
	 * 画面、ロジック共通の登録機能名カラム名を取得します。<p>
	 * 画面、ロジックではそれぞれCPP_RLUtil、CPL_RLUtilの同名メソッドを使用して下さい。
	 */
	public static String getInsFuncNmColumn(){
		return me()._getInsFuncNmColumn();
	}
	/**
	 * 画面、ロジック共通の登録機能名カラム名を取得します。<p>
	 */
	protected String _getInsFuncNmColumn(){
		return $INS_FUNC_NM;
	}
	/**
	 * 画面、ロジック共通の更新機能ＩＤカラム名を取得します。<p>
	 * 画面、ロジックではそれぞれCPP_RLUtil、CPL_RLUtilの同名メソッドを使用して下さい。
	 */
	public static String getUpdFuncIdColumn(){
		return me()._getUpdFuncIdColumn();
	}
	/**
	 * 画面、ロジック共通の更新機能ＩＤカラム名を取得します。<p>
	 */
	protected String _getUpdFuncIdColumn(){
		return $UPD_FUNC_ID;
	}
	/**
	 * 画面、ロジック共通の更新機能名カラム名を取得します。<p>
	 * 画面、ロジックではそれぞれCPP_RLUtil、CPL_RLUtilの同名メソッドを使用して下さい。
	 */
	public static String getUpdFuncNmColumn(){
		return me()._getUpdFuncNmColumn();
	}
	/**
	 * 画面、ロジック共通の更新機能名カラム名を取得します。<p>
	 */
	protected String _getUpdFuncNmColumn(){
		return $UPD_FUNC_NM;
	}
	/**
	 * 画面、ロジック共通の更新リクエストＮＯカラム名を取得します。<p>
	 * 画面、ロジックではそれぞれCPP_RLUtil、CPL_RLUtilの同名メソッドを使用して下さい。
	 */
	public static String getUpdSrvReqNoColumn(){
		return me()._getUpdSrvReqNoColumn();
	}
	/**
	 * 画面、ロジック共通の更新リクエストＮＯカラム名を取得します。<p>
	 */
	protected String _getUpdSrvReqNoColumn(){
		return $UPD_SRV_REQ_NO;
	}
}

