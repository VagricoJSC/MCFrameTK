package mcframe.clientMABC.MABCP0440;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.text.*;
import mcframe.clientCore.beans.list.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.param.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.commonCore.meta.MCMeta;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.beans.popup.MCTextPopupMenuItem;
import mcframe.clientCore.beans.text.MCInputMethodType;
import mcframe.clientMABC.MABCP0440.MABCP_SttlReg_MC.MA_MABCL0440_Srch01Caller;
import mcframe.clientMABC.MABCP0440.MABCP_SttlReg_MC.MA_MABCL0440_Upd01Caller;
import mcframe.clientMABC.MABCP0440.MABCP_SttlReg_MC.MA_MABCL0440_Del01Caller;

/**
 * 画面"MABCP_SttlReg"パネルクラスです。<p>
 *
 * 決済方法マスタ、決済方法マスタ(ロケール別情報)の検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_SttlReg_MC_A extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABCP0440";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [ScreenOpe]ブロック関連のField定義
	public MCPanel ScreenOpePanel = null;
	public MCTitledBorder ScreenOpeTitledBorder = null;
	// [ScreenOpe]ブロックの項目のField定義
	// [Mst]ブロック関連のField定義
	public MCPanel MstPanel = null;
	// [Mst]ブロックの項目のField定義
	public MCLabel Mst_mst_set_typ_nm_Label = null;
	/**
	 * Management 管理.<p>
	 *
	 */
	public MCTextField Mst_mst_set_typ_nm = null;
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;UPD_ADMIN,Create/Modify (Administrator),2;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;UPD_ADMIN,登録・訂正する（管理者）,2;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_UPD_ADMIN = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_sttl_cd_Label = null;
	/**
	 * Settlement method cd. 決済方法ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_sttl_cd = null;
	/**
	 * Settlement method name 決済方法名.<p>
	 *
	 */
	public MCTextField Cnd_sttl_nm = null;
	public MCLabel Cnd_ar_sttl_typ_Label = null;
	/**
	 * AR settlement type 債権決済区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ar_sttl_typ = null;
	/**
	 * AR settlement type name 債権決済区分名.<p>
	 *
	 */
	public MCTextField Cnd_ar_sttl_typ_nm = null;
	public MCLabel Cnd_ap_sttl_typ_Label = null;
	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ap_sttl_typ = null;
	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public MCTextField Cnd_ap_sttl_typ_nm = null;
	public MCLabel Cnd_memo1_Label = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCTextField Cnd_memo1 = null;
	public MCLabel Cnd_memo2_Label = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCTextField Cnd_memo2 = null;
	public MCLabel Cnd_memo3_Label = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCTextField Cnd_memo3 = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCLabel Cnd_del_flg_lab = null;
	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_off_del_flg = null;
	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_on_del_flg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Wrk]ブロック関連のField定義
	public MCPanel WrkPanel = null;
	// [Wrk]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0440.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_flg = null;
	/**
	 * Settlement method cd. 決済方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sttl_cd = null;
	/**
	 * Settlement method name 決済方法名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sttl_nm_lcl = null;
	/**
	 * Standard settlement method name 標準決済方法名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sttl_nm = null;
	/**
	 * AR settlement method 債権決済方法.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_sttl_flg = null;
	/**
	 * AP settlement method 債務決済方法.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_sttl_flg = null;
	/**
	 * AR settlement type 債権決済区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_sttl_typ = null;
	/**
	 * AR settlement type name 債権決済区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_sttl_typ_nm = null;
	/**
	 * Payment received entry type 入金登録区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcv_reg_typ = null;
	/**
	 * Payment received entry type name 入金登録区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcv_reg_typ_nm = null;
	/**
	 * Fee calculation 手数料計算.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_com_paid_flg = null;
	/**
	 * Offset method cd. 相殺方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_setoff_cd = null;
	/**
	 * Offset method name 相殺方法名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_setoff_nm = null;
	/**
	 * AR/AP BP identification type 債権債務先識別区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_debt_cred_id_typ = null;
	/**
	 * AR/AP identification type name 債権債務先識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_debt_cred_id_typ_nm = null;
	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_sttl_typ = null;
	/**
	 * AP settlement type name 債務決済区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_sttl_typ_nm = null;
	/**
	 * AP offset destination type 債務相殺先区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_setoff_typ = null;
	/**
	 * AP offset destination name 債務相殺先区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_setoff_typ_nm = null;
	/**
	 * AP offset result recording 債務相殺実績計上.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_setoff_act_flg = null;
	/**
	 * Sales purchase tax type 売上仕入税区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_purc_typ = null;
	/**
	 * Sales purchase tax type name 売上仕入税区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_purc_typ_nm = null;
	/**
	 * Display tax amount on invoice 請求書税額表示.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_tax_disp_flg = null;
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_rsn_cd = null;
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_rsn_nm = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_ts = null;
	// [DtlBtn]ブロック関連のField定義
	public MCPanel DtlBtnPanel = null;
	// [DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton DtlBtn_rcopy = null;
	// [LclWrk]ブロック関連のField定義
	public MCPanel LclWrkPanel = null;
	// [LclWrk]ブロックの項目のField定義
	// [Lcl]ブロック関連のField定義
	public MCPanel LclPanel = null;
	public MCScrollPane LclScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0440.LclR> LclTable = null;
	// [Lcl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnLcl_check = null;
	/**
	 * Settlement method cd. 決済方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_sttl_cd = null;
	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_lcl_cd = null;
	/**
	 * Locale name ロケール名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_lcl_nm = null;
	/**
	 * Settlement method name 決済方法名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_sttl_nm = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_srv_req_no = null;
	// [LclBtn]ブロック関連のField定義
	public MCPanel LclBtnPanel = null;
	// [LclBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton LclBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton LclBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton LclBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton LclBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton LclBtn_rcopy = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_admin = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [UPD_ADMIN]モードを表す定数 */
	public static final String UPD_ADMIN = "UPD_ADMIN";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, UPD_ADMIN, FIX, DEL, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABCL0440_Srch01]のCallerの作成 */
	protected MABCP_SttlReg_MC.MA_MABCL0440_Srch01Caller createMA_MABCL0440_Srch01() {
		MABCP_SttlReg_MC.MA_MABCL0440_Srch01Caller<MABCP_SttlReg, MA_MABCL0440_Srch01Bridge>
		caller = ((MABCP_SttlReg_MC)this).new MA_MABCL0440_Srch01Caller<MABCP_SttlReg, MA_MABCL0440_Srch01Bridge>(
					(MABCP_SttlReg)this, new MA_MABCL0440_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0440_Srch01]の呼び出し */
	protected void callMA_MABCL0440_Srch01() {
		MCCaller caller = createMA_MABCL0440_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0440_Upd01]のCallerの作成 */
	protected MABCP_SttlReg_MC.MA_MABCL0440_Upd01Caller createMA_MABCL0440_Upd01() {
		MABCP_SttlReg_MC.MA_MABCL0440_Upd01Caller<MABCP_SttlReg, MA_MABCL0440_Upd01Bridge>
		caller = ((MABCP_SttlReg_MC)this).new MA_MABCL0440_Upd01Caller<MABCP_SttlReg, MA_MABCL0440_Upd01Bridge>(
					(MABCP_SttlReg)this, new MA_MABCL0440_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0440_Upd01]の呼び出し */
	protected void callMA_MABCL0440_Upd01() {
		MCCaller caller = createMA_MABCL0440_Upd01();
		caller.exec();
	}
	/** [MA_MABCL0440_Del01]のCallerの作成 */
	protected MABCP_SttlReg_MC.MA_MABCL0440_Del01Caller createMA_MABCL0440_Del01() {
		MABCP_SttlReg_MC.MA_MABCL0440_Del01Caller<MABCP_SttlReg, MA_MABCL0440_Del01Bridge>
		caller = ((MABCP_SttlReg_MC)this).new MA_MABCL0440_Del01Caller<MABCP_SttlReg, MA_MABCL0440_Del01Bridge>(
					(MABCP_SttlReg)this, new MA_MABCL0440_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL0440_Del01]の呼び出し */
	protected void callMA_MABCL0440_Del01() {
		MCCaller caller = createMA_MABCL0440_Del01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0440.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0440.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0440.DtlR> aDtlL;
	/** [Lcl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0440.LclR> aLclL;
	/** [LclAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0440.LclR> aLclAllL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP0440.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0440.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0440.MstR createMstR() {
		return mcframe.clientMABC.MABCP0440.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0440.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0440.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0440.CndR createCndR() {
		return mcframe.clientMABC.MABCP0440.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0440.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0440.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0440.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0440.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0440.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0440.DtlR.class);
	}

	/**
	 * DtlTableを初期化します。
	 */
	protected void createDtlTable(){
		if(DtlTable == null){
			DtlTable = beansFactory.createTable2("Dtl.table");
		}
	}

	/**
	 * コピーによってaLclLを設定します。
	 *
	 * aLclLのインスタンスは変更されません。
	 *
	 * @param dataset LclL
	 */
	public void setLclL(MCList<mcframe.clientMABC.MABCP0440.LclR> aList) {
		if (getLclL() != aList) {
			getLclL().setAll(aList);
		}
	}

	/**
	 * [Lcl]ブロックのコンテナaLclLを返します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP0440.LclR> getLclL() {
		return aLclL;
	}

	/**
	 * aLclRを作成します。
	 *
	 * @return LclR
	 */
	public mcframe.clientMABC.MABCP0440.LclR createLclR() {
		return mcframe.clientMABC.MABCP0440.LclR.create();
	}

	/**
	 * aLclLを作成します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABC.MABCP0440.LclR> createLclL() {
		return MCList.create(mcframe.clientMABC.MABCP0440.LclR.class);
	}

	/**
	 * LclTableを初期化します。
	 */
	protected void createLclTable(){
		if(LclTable == null){
			LclTable = beansFactory.createTable2("Lcl.table");
		}
	}

	/**
	 * コピーによってaLclAllLを設定します。
	 *
	 * aLclAllLのインスタンスは変更されません。
	 *
	 * @param dataset LclAllL
	 */
	public void setLclAllL(MCList<mcframe.clientMABC.MABCP0440.LclR> aList) {
		if (getLclAllL() != aList) {
			getLclAllL().setAll(aList);
		}
	}

	/**
	 * [LclAll]ブロックのコンテナaLclAllLを返します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0440.LclR> getLclAllL() {
		return aLclAllL;
	}

	/**
	 * aLclAllRを作成します。
	 *
	 * @return LclAllR
	 */
	public mcframe.clientMABC.MABCP0440.LclR createLclAllR() {
		return mcframe.clientMABC.MABCP0440.LclR.create();
	}

	/**
	 * aLclAllLを作成します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0440.LclR> createLclAllL() {
		return MCList.create(mcframe.clientMABC.MABCP0440.LclR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getMstR())) ret.add(getMstR());
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getLclL())) ret.add(getLclL());
		if(!MCCollectionUtil.contains(ret, getLclAllL())) ret.add(getLclAllL());
		return ret;
	}

	/**
	 * コンテナに対応したブロックのIDを返します。
	 *
	 * 引数のコンテナに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return ブロックID
	 */
	public String getBlockId(MCContainer aCnt){
		if(aCnt == null) return null;
		if(aCnt == getMstR()) return "Mst";
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getLclL()) return "Lcl";
		if(aCnt == getLclAllL()) return "LclAll";
		return super.getBlockId(aCnt);
	}

	/**
	 * ブロックIDに対応したコンテナを返します。
	 *
	 * 引数のブロックIDに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return コンテナ
	 */
	public MCContainer getContainer(String bId){
		if(bId == null) return null;
		if(bId.equals("Mst")) return getMstR();
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("Lcl")) return getLclL();
		if(bId.equals("LclAll")) return getLclAllL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(ScreenOpePanel);
		ret.add(MstPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(WrkPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(LclWrkPanel);
		ret.add(LclPanel);
		ret.add(LclBtnPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_SttlReg_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aDtlL = createDtlL();
		aLclL = createLclL();
		aLclAllL = createLclAllL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_SttlReg_MC_A(String name) {
		aMstR = createMstR();
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aLclL = createLclL();
		createLclTable();
		LclTable.setRowName(name);
		aLclAllL = createLclAllL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_SttlReg_MC.jbCreateScreenOpe((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbCreateMst((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbCreateTop((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbCreateFold((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbCreateCnd((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbCreateCtrl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbCreateWrk((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbCreateDtl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbCreateDtlBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbCreateLclWrk((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbCreateLcl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbCreateLclBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbCreateBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbCreateEastBtn((MABCP_SttlReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_SttlReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_SttlReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_SttlReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_SttlReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_SttlReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_SttlReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Wrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk(MABCP_SttlReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_SttlReg p) {
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABCP_SttlReg p) {
	}

	/**
	 * [LclWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclWrk(MABCP_SttlReg p) {
	}

	/**
	 * [Lcl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLcl(MABCP_SttlReg p) {
	}

	/**
	 * [LclBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclBtn(MABCP_SttlReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_SttlReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_SttlReg p) {
	}

	/**
	 * この画面のステータスのSet集合を返します。
	 * 
	 * @return ステータスのSet
	 */
	@Override
	public Set<String> getStatusSet(){
		Set<String> sSet = super.getStatusSet();
		for(String aStr : statusArray) sSet.add(aStr);
		return sSet;
	}

	
	/** [Cnd_sttl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sttl_cd_p = null;

	/**
	 * [Cnd_sttl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sttl_cd_ListPutter() {
		if (Cnd_sttl_cd_p == null) {
			Cnd_sttl_cd_p = createCnd_sttl_cd_ListPutter(Cnd_sttl_cd, "sttl_cd", "sttl_nm");

		}
		return Cnd_sttl_cd_p;
	}
	
	
	/** [Cnd_ar_sttl_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ar_sttl_typ_p = null;

	/**
	 * [Cnd_ar_sttl_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ar_sttl_typ_ListPutter() {
		if (Cnd_ar_sttl_typ_p == null) {
			Cnd_ar_sttl_typ_p = createCnd_ar_sttl_typ_ListPutter(Cnd_ar_sttl_typ, "ar_sttl_typ", "ar_sttl_typ_nm");

		}
		return Cnd_ar_sttl_typ_p;
	}
	
	
	/** [Cnd_ap_sttl_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ap_sttl_typ_p = null;

	/**
	 * [Cnd_ap_sttl_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ap_sttl_typ_ListPutter() {
		if (Cnd_ap_sttl_typ_p == null) {
			Cnd_ap_sttl_typ_p = createCnd_ap_sttl_typ_ListPutter(Cnd_ap_sttl_typ, "ap_sttl_typ", "ap_sttl_typ_nm");

		}
		return Cnd_ap_sttl_typ_p;
	}
	
	
	/** [Dtl_ar_sttl_typ_ListPutter]の定義 */
	private MCListPutter Dtl_ar_sttl_typ_p = null;

	/**
	 * [Dtl_ar_sttl_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ar_sttl_typ_ListPutter() {
		if (Dtl_ar_sttl_typ_p == null) {
			Dtl_ar_sttl_typ_p = createDtl_ar_sttl_typ_ListPutter(columnDtl_ar_sttl_typ, "ar_sttl_typ", "ar_sttl_typ_nm");

		}
		return Dtl_ar_sttl_typ_p;
	}
	
	
	/** [Dtl_rcv_reg_typ_ListPutter]の定義 */
	private MCListPutter Dtl_rcv_reg_typ_p = null;

	/**
	 * [Dtl_rcv_reg_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_rcv_reg_typ_ListPutter() {
		if (Dtl_rcv_reg_typ_p == null) {
			Dtl_rcv_reg_typ_p = createDtl_rcv_reg_typ_ListPutter(columnDtl_rcv_reg_typ, "rcv_reg_typ", "rcv_reg_typ_nm");

		}
		return Dtl_rcv_reg_typ_p;
	}
	
	
	/** [Dtl_ar_setoff_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ar_setoff_cd_p = null;

	/**
	 * [Dtl_ar_setoff_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ar_setoff_cd_ListPutter() {
		if (Dtl_ar_setoff_cd_p == null) {
			Dtl_ar_setoff_cd_p = createDtl_ar_setoff_cd_ListPutter(columnDtl_ar_setoff_cd, "ar_setoff_cd", "ar_setoff_nm");

		}
		return Dtl_ar_setoff_cd_p;
	}
	
	
	/** [Dtl_debt_cred_id_typ_ListPutter]の定義 */
	private MCListPutter Dtl_debt_cred_id_typ_p = null;

	/**
	 * [Dtl_debt_cred_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_debt_cred_id_typ_ListPutter() {
		if (Dtl_debt_cred_id_typ_p == null) {
			Dtl_debt_cred_id_typ_p = createDtl_debt_cred_id_typ_ListPutter(columnDtl_debt_cred_id_typ, "debt_cred_id_typ", "debt_cred_id_typ_nm");

		}
		return Dtl_debt_cred_id_typ_p;
	}
	
	
	/** [Dtl_ap_sttl_typ_ListPutter]の定義 */
	private MCListPutter Dtl_ap_sttl_typ_p = null;

	/**
	 * [Dtl_ap_sttl_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ap_sttl_typ_ListPutter() {
		if (Dtl_ap_sttl_typ_p == null) {
			Dtl_ap_sttl_typ_p = createDtl_ap_sttl_typ_ListPutter(columnDtl_ap_sttl_typ, "ap_sttl_typ", "ap_sttl_typ_nm");

		}
		return Dtl_ap_sttl_typ_p;
	}
	
	
	/** [Dtl_ap_setoff_typ_ListPutter]の定義 */
	private MCListPutter Dtl_ap_setoff_typ_p = null;

	/**
	 * [Dtl_ap_setoff_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ap_setoff_typ_ListPutter() {
		if (Dtl_ap_setoff_typ_p == null) {
			Dtl_ap_setoff_typ_p = createDtl_ap_setoff_typ_ListPutter(columnDtl_ap_setoff_typ, "ap_setoff_typ", "ap_setoff_typ_nm");

		}
		return Dtl_ap_setoff_typ_p;
	}
	
	
	/** [Dtl_sls_purc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sls_purc_typ_p = null;

	/**
	 * [Dtl_sls_purc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sls_purc_typ_ListPutter() {
		if (Dtl_sls_purc_typ_p == null) {
			Dtl_sls_purc_typ_p = createDtl_sls_purc_typ_ListPutter(columnDtl_sls_purc_typ, "sls_purc_typ", "sls_purc_typ_nm");

		}
		return Dtl_sls_purc_typ_p;
	}
	
	
	/** [Dtl_ac_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ac_rsn_cd_p = null;

	/**
	 * [Dtl_ac_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ac_rsn_cd_ListPutter() {
		if (Dtl_ac_rsn_cd_p == null) {
			Dtl_ac_rsn_cd_p = createDtl_ac_rsn_cd_ListPutter(columnDtl_ac_rsn_cd, "ac_rsn_cd", "ac_rsn_nm");

		}
		return Dtl_ac_rsn_cd_p;
	}
	
	
	/** [Lcl_lcl_cd_ListPutter]の定義 */
	private MCListPutter Lcl_lcl_cd_p = null;

	/**
	 * [Lcl_lcl_cd_ListPutter]の取得
	 */
	protected MCListPutter getLcl_lcl_cd_ListPutter() {
		if (Lcl_lcl_cd_p == null) {
			Lcl_lcl_cd_p = createLcl_lcl_cd_ListPutter(columnLcl_lcl_cd, "lcl_cd", "lcl_nm");

		}
		return Lcl_lcl_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_SttlReg create(){
		MABCP_SttlReg p = new MABCP_SttlReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_SttlReg create(String name){
		MABCP_SttlReg p = new MABCP_SttlReg(name);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * 画面部品初期設定
	 */
	protected void jbInit() {
		super.jbInit();
		MABCP_SttlReg_MC.jbfInitScreenOpe((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbfInitMst((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbfInitTop((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbfInitFold((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbfInitCnd((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbfInitCtrl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbfInitWrk((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbfInitDtl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbfInitDtlBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbfInitLclWrk((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbfInitLcl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbfInitLclBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbfInitBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbfInitEastBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbInitScreenOpe((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbInitMst((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbInitTop((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbInitFold((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbInitCnd((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbInitCtrl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbInitWrk((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbInitDtl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbInitDtlBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbInitLclWrk((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbInitLcl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbInitLclBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbInitBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.jbInitEastBtn((MABCP_SttlReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.MstPanel = p.beansFactory.createPanel("Mst");
		// ブロックの項目の初期化
		p.Mst_mst_set_typ_nm_Label = p.beansFactory.createLabel("Mst.mst_set_typ_nm_Label");
		p.Mst_mst_set_typ_nm = p.beansFactory.createTextField("Mst.mst_set_typ_nm");
		p.Mst_mst_set_typ_nm.setLabel(p.Mst_mst_set_typ_nm_Label);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_UPD_ADMIN = p.beansFactory.createRadioButton("Cnd.ope_UPD_ADMIN");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_sttl_cd_Label = p.beansFactory.createLabel("Cnd.sttl_cd_Label");
		p.Cnd_sttl_cd = p.beansFactory.createTextComboBox("Cnd.sttl_cd");
		p.Cnd_sttl_cd.setLabel(p.Cnd_sttl_cd_Label);
		p.Cnd_sttl_nm = p.beansFactory.createTextField("Cnd.sttl_nm");
		p.Cnd_ar_sttl_typ_Label = p.beansFactory.createLabel("Cnd.ar_sttl_typ_Label");
		p.Cnd_ar_sttl_typ = p.beansFactory.createTextComboBox("Cnd.ar_sttl_typ");
		p.Cnd_ar_sttl_typ.setLabel(p.Cnd_ar_sttl_typ_Label);
		p.Cnd_ar_sttl_typ_nm = p.beansFactory.createTextField("Cnd.ar_sttl_typ_nm");
		p.Cnd_ap_sttl_typ_Label = p.beansFactory.createLabel("Cnd.ap_sttl_typ_Label");
		p.Cnd_ap_sttl_typ = p.beansFactory.createTextComboBox("Cnd.ap_sttl_typ");
		p.Cnd_ap_sttl_typ.setLabel(p.Cnd_ap_sttl_typ_Label);
		p.Cnd_ap_sttl_typ_nm = p.beansFactory.createTextField("Cnd.ap_sttl_typ_nm");
		p.Cnd_memo1_Label = p.beansFactory.createLabel("Cnd.memo1_Label");
		p.Cnd_memo1 = p.beansFactory.createTextField("Cnd.memo1");
		p.Cnd_memo1.setLabel(p.Cnd_memo1_Label);
		p.Cnd_memo2_Label = p.beansFactory.createLabel("Cnd.memo2_Label");
		p.Cnd_memo2 = p.beansFactory.createTextField("Cnd.memo2");
		p.Cnd_memo2.setLabel(p.Cnd_memo2_Label);
		p.Cnd_memo3_Label = p.beansFactory.createLabel("Cnd.memo3_Label");
		p.Cnd_memo3 = p.beansFactory.createTextField("Cnd.memo3");
		p.Cnd_memo3.setLabel(p.Cnd_memo3_Label);
		p.Cnd_del_flg_lab = p.beansFactory.createLabel("Cnd.del_flg_lab");
		p.Cnd_off_del_flg = p.beansFactory.createCheckBox("Cnd.off_del_flg");
		p.Cnd_on_del_flg = p.beansFactory.createCheckBox("Cnd.on_del_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.WrkPanel = p.beansFactory.createPanel("Wrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_sttl_cd = p.beansFactory.createTableColumn("Dtl.sttl_cd", MCColumnType.TEXT);
		p.columnDtl_sttl_nm_lcl = p.beansFactory.createTableColumn("Dtl.sttl_nm_lcl", MCColumnType.TEXT);
		p.columnDtl_sttl_nm = p.beansFactory.createTableColumn("Dtl.sttl_nm", MCColumnType.TEXT);
		p.columnDtl_ar_sttl_flg = p.beansFactory.createTableColumn("Dtl.ar_sttl_flg", MCColumnType.CHECK);
		p.columnDtl_ap_sttl_flg = p.beansFactory.createTableColumn("Dtl.ap_sttl_flg", MCColumnType.CHECK);
		p.columnDtl_ar_sttl_typ = p.beansFactory.createTableColumn("Dtl.ar_sttl_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_ar_sttl_typ_nm = p.beansFactory.createTableColumn("Dtl.ar_sttl_typ_nm", MCColumnType.TEXT);
		p.columnDtl_rcv_reg_typ = p.beansFactory.createTableColumn("Dtl.rcv_reg_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_rcv_reg_typ_nm = p.beansFactory.createTableColumn("Dtl.rcv_reg_typ_nm", MCColumnType.TEXT);
		p.columnDtl_calc_com_paid_flg = p.beansFactory.createTableColumn("Dtl.calc_com_paid_flg", MCColumnType.CHECK);
		p.columnDtl_ar_setoff_cd = p.beansFactory.createTableColumn("Dtl.ar_setoff_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ar_setoff_nm = p.beansFactory.createTableColumn("Dtl.ar_setoff_nm", MCColumnType.TEXT);
		p.columnDtl_debt_cred_id_typ = p.beansFactory.createTableColumn("Dtl.debt_cred_id_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_debt_cred_id_typ_nm = p.beansFactory.createTableColumn("Dtl.debt_cred_id_typ_nm", MCColumnType.TEXT);
		p.columnDtl_ap_sttl_typ = p.beansFactory.createTableColumn("Dtl.ap_sttl_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_ap_sttl_typ_nm = p.beansFactory.createTableColumn("Dtl.ap_sttl_typ_nm", MCColumnType.TEXT);
		p.columnDtl_ap_setoff_typ = p.beansFactory.createTableColumn("Dtl.ap_setoff_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_ap_setoff_typ_nm = p.beansFactory.createTableColumn("Dtl.ap_setoff_typ_nm", MCColumnType.TEXT);
		p.columnDtl_ap_setoff_act_flg = p.beansFactory.createTableColumn("Dtl.ap_setoff_act_flg", MCColumnType.CHECK);
		p.columnDtl_sls_purc_typ = p.beansFactory.createTableColumn("Dtl.sls_purc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sls_purc_typ_nm = p.beansFactory.createTableColumn("Dtl.sls_purc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_bill_tax_disp_flg = p.beansFactory.createTableColumn("Dtl.bill_tax_disp_flg", MCColumnType.CHECK);
		p.columnDtl_ac_rsn_cd = p.beansFactory.createTableColumn("Dtl.ac_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ac_rsn_nm = p.beansFactory.createTableColumn("Dtl.ac_rsn_nm", MCColumnType.TEXT);
		p.columnDtl_memo1 = p.beansFactory.createTableColumn("Dtl.memo1", MCColumnType.TEXT);
		p.columnDtl_memo2 = p.beansFactory.createTableColumn("Dtl.memo2", MCColumnType.TEXT);
		p.columnDtl_memo3 = p.beansFactory.createTableColumn("Dtl.memo3", MCColumnType.TEXT);
		p.columnDtl_ins_usr_id = p.beansFactory.createTableColumn("Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_ts = p.beansFactory.createTableColumn("Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_ins_func_id = p.beansFactory.createTableColumn("Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm = p.beansFactory.createTableColumn("Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_cntr = p.beansFactory.createTableColumn("Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_upd_usr_id = p.beansFactory.createTableColumn("Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_upd_ts = p.beansFactory.createTableColumn("Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_func_id = p.beansFactory.createTableColumn("Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm = p.beansFactory.createTableColumn("Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtl_del_usr_id = p.beansFactory.createTableColumn("Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnDtl_del_usr_nm = p.beansFactory.createTableColumn("Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnDtl_del_ts = p.beansFactory.createTableColumn("Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_select_all = p.beansFactory.createButton("DtlBtn.select_all", "no_border");
		p.DtlBtn_deselect_all = p.beansFactory.createButton("DtlBtn.deselect_all", "no_border");
		p.DtlBtn_radd = p.beansFactory.createButton("DtlBtn.radd", "no_border");
		p.DtlBtn_rdel = p.beansFactory.createButton("DtlBtn.rdel", "no_border");
		p.DtlBtn_rcopy = p.beansFactory.createButton("DtlBtn.rcopy", "no_border");
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclWrk(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.LclWrkPanel = p.beansFactory.createPanel("LclWrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLcl(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.LclPanel = p.beansFactory.createPanel("Lcl");
		p.LclScrollPane = p.beansFactory.createScrollPane("Lcl.scroll");
		p.createLclTable();
		// ブロックの項目の初期化
		p.columnLcl_check = p.beansFactory.createTableColumn("Lcl.check", MCColumnType.CHECK);
		p.columnLcl_sttl_cd = p.beansFactory.createTableColumn("Lcl.sttl_cd", MCColumnType.TEXT);
		p.columnLcl_lcl_cd = p.beansFactory.createTableColumn("Lcl.lcl_cd", MCColumnType.TEXT_COMBO);
		p.columnLcl_lcl_nm = p.beansFactory.createTableColumn("Lcl.lcl_nm", MCColumnType.TEXT);
		p.columnLcl_sttl_nm = p.beansFactory.createTableColumn("Lcl.sttl_nm", MCColumnType.TEXT);
		p.columnLcl_memo1 = p.beansFactory.createTableColumn("Lcl.memo1", MCColumnType.TEXT);
		p.columnLcl_memo2 = p.beansFactory.createTableColumn("Lcl.memo2", MCColumnType.TEXT);
		p.columnLcl_memo3 = p.beansFactory.createTableColumn("Lcl.memo3", MCColumnType.TEXT);
		p.columnLcl_ins_usr_id = p.beansFactory.createTableColumn("Lcl.ins_usr_id", MCColumnType.TEXT);
		p.columnLcl_ins_usr_nm = p.beansFactory.createTableColumn("Lcl.ins_usr_nm", MCColumnType.TEXT);
		p.columnLcl_ins_ts = p.beansFactory.createTableColumn("Lcl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnLcl_ins_func_id = p.beansFactory.createTableColumn("Lcl.ins_func_id", MCColumnType.TEXT);
		p.columnLcl_ins_func_nm = p.beansFactory.createTableColumn("Lcl.ins_func_nm", MCColumnType.TEXT);
		p.columnLcl_upd_cntr = p.beansFactory.createTableColumn("Lcl.upd_cntr", MCColumnType.NUMBER);
		p.columnLcl_upd_usr_id = p.beansFactory.createTableColumn("Lcl.upd_usr_id", MCColumnType.TEXT);
		p.columnLcl_upd_usr_nm = p.beansFactory.createTableColumn("Lcl.upd_usr_nm", MCColumnType.TEXT);
		p.columnLcl_upd_ts = p.beansFactory.createTableColumn("Lcl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnLcl_upd_func_id = p.beansFactory.createTableColumn("Lcl.upd_func_id", MCColumnType.TEXT);
		p.columnLcl_upd_func_nm = p.beansFactory.createTableColumn("Lcl.upd_func_nm", MCColumnType.TEXT);
		p.columnLcl_upd_srv_req_no = p.beansFactory.createTableColumn("Lcl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [LclBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclBtn(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.LclBtnPanel = p.beansFactory.createPanel("LclBtn");
		// ブロックの項目の初期化
		p.LclBtn_select_all = p.beansFactory.createButton("LclBtn.select_all", "no_border");
		p.LclBtn_deselect_all = p.beansFactory.createButton("LclBtn.deselect_all", "no_border");
		p.LclBtn_radd = p.beansFactory.createButton("LclBtn.radd", "no_border");
		p.LclBtn_rdel = p.beansFactory.createButton("LclBtn.rdel", "no_border");
		p.LclBtn_rcopy = p.beansFactory.createButton("LclBtn.rcopy", "no_border");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_upd_admin = p.beansFactory.createButton("Btn.upd_admin", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.MstPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMst(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.TopPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP0440.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.WrkPanel);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.FoldBasePanel);
		p.FoldBasePanel.add(p.FoldScrollPane);
		p.FoldScrollPane.setBorder(null);
		p.FoldScrollPane.setViewportView(p.FoldPanel);
		p.FoldBasePanel.setLayoutPosition("C");
		p.TopPanel.setLastBeans(p.FoldPanel);
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_UPD_ADMIN);
		p.Cnd_ope_UPD_ADMIN.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD_ADMIN);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD_ADMIN);
		p.Cnd_ope_UPD_ADMIN.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0440.CndR.ope_META);
		p.Cnd_sttl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sttl_cd, true);
		p.Cnd_sttl_cd.setLinkBeans(p.Cnd_sttl_nm);
		p.CndPanel.add(p.Cnd_sttl_cd_Label);
		p.CndPanel.add(p.Cnd_sttl_cd);
		p.CndPanel.setLastBeans(p.Cnd_sttl_cd);
		p.Cnd_sttl_cd.setNextBeans(p.Cnd_sttl_nm);
		p.Cnd_sttl_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0440.CndR.sttl_cd_META);
		p.CndPanel.add(p.Cnd_sttl_nm);
		p.Cnd_sttl_nm.setNextBeans(p.Cnd_ar_sttl_typ);
		p.Cnd_sttl_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0440.CndR.sttl_nm_META);
		p.setPluralValueEnable(p.Cnd_sttl_nm, true);
		p.Cnd_ar_sttl_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ar_sttl_typ, true);
		p.Cnd_ar_sttl_typ.setLinkBeans(p.Cnd_ar_sttl_typ_nm);
		p.CndPanel.add(p.Cnd_ar_sttl_typ_Label);
		p.CndPanel.add(p.Cnd_ar_sttl_typ);
		p.Cnd_ar_sttl_typ.setNextBeans(p.Cnd_ar_sttl_typ_nm);
		p.Cnd_ar_sttl_typ.setRow(p.getCndR(), mcframe.clientMABC.MABCP0440.CndR.ar_sttl_typ_META);
		p.CndPanel.add(p.Cnd_ar_sttl_typ_nm);
		p.Cnd_ar_sttl_typ_nm.setNextBeans(p.Cnd_ap_sttl_typ);
		p.Cnd_ar_sttl_typ_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0440.CndR.ar_sttl_typ_nm_META);
		p.Cnd_ap_sttl_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ap_sttl_typ, true);
		p.Cnd_ap_sttl_typ.setLinkBeans(p.Cnd_ap_sttl_typ_nm);
		p.CndPanel.add(p.Cnd_ap_sttl_typ_Label);
		p.CndPanel.add(p.Cnd_ap_sttl_typ);
		p.Cnd_ap_sttl_typ.setNextBeans(p.Cnd_ap_sttl_typ_nm);
		p.Cnd_ap_sttl_typ.setRow(p.getCndR(), mcframe.clientMABC.MABCP0440.CndR.ap_sttl_typ_META);
		p.CndPanel.add(p.Cnd_ap_sttl_typ_nm);
		p.Cnd_ap_sttl_typ_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_ap_sttl_typ_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0440.CndR.ap_sttl_typ_nm_META);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0440.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0440.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0440.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0440.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0440.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.add(p.WrkPanel);
		p.WrkPanel.setNextBeans(p.LclWrkPanel);
		p.WrkPanel.setLayoutPosition("CBCT+");
		// ブロックの項目の初期化
		p.WrkPanel.add(p.DtlPanel, null);
		p.WrkPanel.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.WrkPanel.add(p.DtlBtnPanel, null);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.DtlBtn_select_all.setIcon("SELECT_ALL");
		p.DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.DtlBtnPanel.add(p.DtlBtn_select_all);
		p.DtlBtnPanel.setLastBeans(p.DtlBtn_select_all);
		p.DtlBtn_select_all.setNextBeans(p.DtlBtn_deselect_all);
		p.DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.DtlBtnPanel.add(p.DtlBtn_deselect_all);
		p.DtlBtn_deselect_all.setNextBeans(p.DtlBtn_radd);
		p.DtlBtn_radd.setIcon("INSERT_RECORD");
		p.DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.DtlBtnPanel.add(p.DtlBtn_radd);
		p.DtlBtn_radd.setNextBeans(p.DtlBtn_rdel);
		p.DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.DtlBtnPanel.add(p.DtlBtn_rdel);
		p.DtlBtn_rdel.setNextBeans(p.DtlBtn_rcopy);
		p.DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.DtlBtnPanel.add(p.DtlBtn_rcopy);
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclWrk(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.add(p.LclWrkPanel);
		p.LclWrkPanel.setNextBeans(p.BtnPanel);
		p.LclWrkPanel.setLayoutPosition("CBCB+");
		// ブロックの項目の初期化
		p.LclWrkPanel.add(p.LclPanel, null);
		p.LclWrkPanel.setLastBeans(p.LclPanel);
		p.LclPanel.setNextBeans(p.LclBtnPanel);
		p.LclWrkPanel.add(p.LclBtnPanel, null);
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLcl(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.LclPanel.add(p.LclScrollPane);
		p.LclPanel.setLastBeans(p.LclTable);
		p.LclScrollPane.setViewportView(p.LclTable);
		p.LclTable.setList(p.getLclL());
		p.LclPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LclBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclBtn(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.LclBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.LclBtn_select_all.setIcon("SELECT_ALL");
		p.LclBtn_select_all.setFunctionKey(MCFunctionKey.F18);
		p.LclBtnPanel.add(p.LclBtn_select_all);
		p.LclBtnPanel.setLastBeans(p.LclBtn_select_all);
		p.LclBtn_select_all.setNextBeans(p.LclBtn_deselect_all);
		p.LclBtn_deselect_all.setIcon("DESELECT_ALL");
		p.LclBtn_deselect_all.setFunctionKey(MCFunctionKey.F19);
		p.LclBtnPanel.add(p.LclBtn_deselect_all);
		p.LclBtn_deselect_all.setNextBeans(p.LclBtn_radd);
		p.LclBtn_radd.setIcon("INSERT_RECORD");
		p.LclBtn_radd.setFunctionKey(MCFunctionKey.F7);
		p.LclBtnPanel.add(p.LclBtn_radd);
		p.LclBtn_radd.setNextBeans(p.LclBtn_rdel);
		p.LclBtn_rdel.setIcon("DELETE_RECORD");
		p.LclBtn_rdel.setFunctionKey(MCFunctionKey.F8);
		p.LclBtnPanel.add(p.LclBtn_rdel);
		p.LclBtn_rdel.setNextBeans(p.LclBtn_rcopy);
		p.LclBtn_rcopy.setIcon("COPY_RECORD");
		p.LclBtn_rcopy.setFunctionKey(MCFunctionKey.F20);
		p.LclBtnPanel.add(p.LclBtn_rcopy);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.BtnPanel.setLastBeans(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_upd_admin);
		p.Btn_upd_admin.setIcon("REGISTER");
		p.Btn_upd_admin.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_admin);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABCP_SttlReg p) {
		// ブロック関連の初期化
		p.add(p.EastBtnPanel);
		p.EastBtnPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		Ctrl_ctrl_PPanel.expandInit();
		Ctrl_ctrl_PPanel.setDefaultDividerLocation();
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MABCP_SttlReg_MC.mcInitScreenOpe((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.mcInitMst((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.mcInitTop((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.mcInitFold((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.mcInitCnd((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.mcInitCtrl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.mcInitWrk((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.mcInitDtl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.mcInitDtlBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.mcInitLclWrk((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.mcInitLcl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.mcInitLclBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.mcInitBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.mcInitEastBtn((MABCP_SttlReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_SttlReg_MC.statusInitUPD_ScreenOpe((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD_Mst((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD_Top((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD_Fold((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD_Cnd((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD_Ctrl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD_Wrk((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD_Dtl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD_DtlBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD_LclWrk((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD_Lcl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD_LclAll((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD_LclBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD_Btn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD_EastBtn((MABCP_SttlReg)this);

		// [UPD_ADMIN]ステータスのモードの設定
		MABCP_SttlReg_MC.statusInitUPD__ADMIN_ScreenOpe((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD__ADMIN_Mst((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD__ADMIN_Top((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD__ADMIN_Fold((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD__ADMIN_Cnd((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD__ADMIN_Ctrl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD__ADMIN_Wrk((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD__ADMIN_Dtl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD__ADMIN_DtlBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD__ADMIN_LclWrk((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD__ADMIN_Lcl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD__ADMIN_LclAll((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD__ADMIN_LclBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD__ADMIN_Btn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitUPD__ADMIN_EastBtn((MABCP_SttlReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_SttlReg_MC.statusInitFIX_ScreenOpe((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitFIX_Mst((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitFIX_Top((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitFIX_Fold((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitFIX_Cnd((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitFIX_Ctrl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitFIX_Wrk((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitFIX_Dtl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitFIX_DtlBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitFIX_LclWrk((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitFIX_Lcl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitFIX_LclAll((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitFIX_LclBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitFIX_Btn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitFIX_EastBtn((MABCP_SttlReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_SttlReg_MC.statusInitDEL_ScreenOpe((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitDEL_Mst((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitDEL_Top((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitDEL_Fold((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitDEL_Cnd((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitDEL_Ctrl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitDEL_Wrk((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitDEL_Dtl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitDEL_DtlBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitDEL_LclWrk((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitDEL_Lcl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitDEL_LclAll((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitDEL_LclBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitDEL_Btn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitDEL_EastBtn((MABCP_SttlReg)this);

		// [REF]ステータスのモードの設定
		MABCP_SttlReg_MC.statusInitREF_ScreenOpe((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitREF_Mst((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitREF_Top((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitREF_Fold((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitREF_Cnd((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitREF_Ctrl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitREF_Wrk((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitREF_Dtl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitREF_DtlBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitREF_LclWrk((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitREF_Lcl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitREF_LclAll((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitREF_LclBtn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitREF_Btn((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.statusInitREF_EastBtn((MABCP_SttlReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_SttlReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_SttlReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_SttlReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_SttlReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_SttlReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_UPD_ADMIN.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_sttl_cd.setListListener(p);
		p.Cnd_sttl_cd.addAllListener(p);
		p.Cnd_sttl_nm.setListListener(p);
		p.Cnd_sttl_nm.addAllListener(p);
		p.Cnd_ar_sttl_typ.setListListener(p);
		p.Cnd_ar_sttl_typ.addAllListener(p);
		p.Cnd_ar_sttl_typ_nm.setListListener(p);
		p.Cnd_ar_sttl_typ_nm.addAllListener(p);
		p.Cnd_ap_sttl_typ.setListListener(p);
		p.Cnd_ap_sttl_typ.addAllListener(p);
		p.Cnd_ap_sttl_typ_nm.setListListener(p);
		p.Cnd_ap_sttl_typ_nm.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABCP_SttlReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Wrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk(MABCP_SttlReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_SttlReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_sttl_cd.addAllListener(p);
		p.columnDtl_sttl_cd.setListListener(p);
		p.columnDtl_sttl_nm_lcl.addAllListener(p);
		p.columnDtl_sttl_nm_lcl.setListListener(p);
		p.columnDtl_sttl_nm.addAllListener(p);
		p.columnDtl_sttl_nm.setListListener(p);
		p.columnDtl_ar_sttl_flg.addAllListener(p);
		p.columnDtl_ap_sttl_flg.addAllListener(p);
		p.columnDtl_ar_sttl_typ.addAllListener(p);
		p.columnDtl_ar_sttl_typ.setListListener(p);
		p.columnDtl_ar_sttl_typ_nm.addAllListener(p);
		p.columnDtl_ar_sttl_typ_nm.setListListener(p);
		p.columnDtl_rcv_reg_typ.addAllListener(p);
		p.columnDtl_rcv_reg_typ.setListListener(p);
		p.columnDtl_rcv_reg_typ_nm.addAllListener(p);
		p.columnDtl_rcv_reg_typ_nm.setListListener(p);
		p.columnDtl_calc_com_paid_flg.addAllListener(p);
		p.columnDtl_ar_setoff_cd.addAllListener(p);
		p.columnDtl_ar_setoff_cd.setListListener(p);
		p.columnDtl_ar_setoff_nm.addAllListener(p);
		p.columnDtl_ar_setoff_nm.setListListener(p);
		p.columnDtl_debt_cred_id_typ.addAllListener(p);
		p.columnDtl_debt_cred_id_typ.setListListener(p);
		p.columnDtl_debt_cred_id_typ_nm.addAllListener(p);
		p.columnDtl_debt_cred_id_typ_nm.setListListener(p);
		p.columnDtl_ap_sttl_typ.addAllListener(p);
		p.columnDtl_ap_sttl_typ.setListListener(p);
		p.columnDtl_ap_sttl_typ_nm.addAllListener(p);
		p.columnDtl_ap_sttl_typ_nm.setListListener(p);
		p.columnDtl_ap_setoff_typ.addAllListener(p);
		p.columnDtl_ap_setoff_typ.setListListener(p);
		p.columnDtl_ap_setoff_typ_nm.addAllListener(p);
		p.columnDtl_ap_setoff_typ_nm.setListListener(p);
		p.columnDtl_ap_setoff_act_flg.addAllListener(p);
		p.columnDtl_sls_purc_typ.addAllListener(p);
		p.columnDtl_sls_purc_typ.setListListener(p);
		p.columnDtl_sls_purc_typ_nm.addAllListener(p);
		p.columnDtl_sls_purc_typ_nm.setListListener(p);
		p.columnDtl_bill_tax_disp_flg.addAllListener(p);
		p.columnDtl_ac_rsn_cd.addAllListener(p);
		p.columnDtl_ac_rsn_cd.setListListener(p);
		p.columnDtl_ac_rsn_nm.addAllListener(p);
		p.columnDtl_ac_rsn_nm.setListListener(p);
		p.columnDtl_memo1.addAllListener(p);
		p.columnDtl_memo1.setListListener(p);
		p.columnDtl_memo2.addAllListener(p);
		p.columnDtl_memo2.setListListener(p);
		p.columnDtl_memo3.addAllListener(p);
		p.columnDtl_memo3.setListListener(p);
		p.columnDtl_ins_usr_id.addAllListener(p);
		p.columnDtl_ins_usr_id.setListListener(p);
		p.columnDtl_ins_usr_nm.addAllListener(p);
		p.columnDtl_ins_usr_nm.setListListener(p);
		p.columnDtl_ins_ts.addAllListener(p);
		p.columnDtl_ins_ts.setListListener(p);
		p.columnDtl_ins_func_id.addAllListener(p);
		p.columnDtl_ins_func_id.setListListener(p);
		p.columnDtl_ins_func_nm.addAllListener(p);
		p.columnDtl_ins_func_nm.setListListener(p);
		p.columnDtl_upd_cntr.addAllListener(p);
		p.columnDtl_upd_cntr.setListListener(p);
		p.columnDtl_upd_usr_id.addAllListener(p);
		p.columnDtl_upd_usr_id.setListListener(p);
		p.columnDtl_upd_usr_nm.addAllListener(p);
		p.columnDtl_upd_usr_nm.setListListener(p);
		p.columnDtl_upd_ts.addAllListener(p);
		p.columnDtl_upd_ts.setListListener(p);
		p.columnDtl_upd_func_id.addAllListener(p);
		p.columnDtl_upd_func_id.setListListener(p);
		p.columnDtl_upd_func_nm.addAllListener(p);
		p.columnDtl_upd_func_nm.setListListener(p);
		p.columnDtl_upd_srv_req_no.addAllListener(p);
		p.columnDtl_upd_srv_req_no.setListListener(p);
		p.columnDtl_del_usr_id.addAllListener(p);
		p.columnDtl_del_usr_id.setListListener(p);
		p.columnDtl_del_usr_nm.addAllListener(p);
		p.columnDtl_del_usr_nm.setListListener(p);
		p.columnDtl_del_ts.addAllListener(p);
		p.columnDtl_del_ts.setListListener(p);
	}

	/**
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABCP_SttlReg p) {
		p.DtlBtn_select_all.addAllListener(p);
		p.DtlBtn_select_all.setAPMethodName("doDtlBtn_select_all");
		p.DtlBtn_deselect_all.addAllListener(p);
		p.DtlBtn_deselect_all.setAPMethodName("doDtlBtn_deselect_all");
		p.DtlBtn_radd.addAllListener(p);
		p.DtlBtn_radd.setAPMethodName("doDtlBtn_radd");
		p.DtlBtn_rdel.addAllListener(p);
		p.DtlBtn_rdel.setAPMethodName("doDtlBtn_rdel");
		p.DtlBtn_rcopy.addAllListener(p);
		p.DtlBtn_rcopy.setAPMethodName("doDtlBtn_rcopy");
	}

	/**
	 *  [LclWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclWrk(MABCP_SttlReg p) {
	}

	/**
	 *  [Lcl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLcl(MABCP_SttlReg p) {
		p.LclTable.addAllListener(p);
		p.columnLcl_check.addAllListener(p);
		p.columnLcl_sttl_cd.addAllListener(p);
		p.columnLcl_sttl_cd.setListListener(p);
		p.columnLcl_lcl_cd.addAllListener(p);
		p.columnLcl_lcl_cd.setListListener(p);
		p.columnLcl_lcl_nm.addAllListener(p);
		p.columnLcl_lcl_nm.setListListener(p);
		p.columnLcl_sttl_nm.addAllListener(p);
		p.columnLcl_sttl_nm.setListListener(p);
		p.columnLcl_memo1.addAllListener(p);
		p.columnLcl_memo1.setListListener(p);
		p.columnLcl_memo2.addAllListener(p);
		p.columnLcl_memo2.setListListener(p);
		p.columnLcl_memo3.addAllListener(p);
		p.columnLcl_memo3.setListListener(p);
		p.columnLcl_ins_usr_id.addAllListener(p);
		p.columnLcl_ins_usr_id.setListListener(p);
		p.columnLcl_ins_usr_nm.addAllListener(p);
		p.columnLcl_ins_usr_nm.setListListener(p);
		p.columnLcl_ins_ts.addAllListener(p);
		p.columnLcl_ins_ts.setListListener(p);
		p.columnLcl_ins_func_id.addAllListener(p);
		p.columnLcl_ins_func_id.setListListener(p);
		p.columnLcl_ins_func_nm.addAllListener(p);
		p.columnLcl_ins_func_nm.setListListener(p);
		p.columnLcl_upd_cntr.addAllListener(p);
		p.columnLcl_upd_cntr.setListListener(p);
		p.columnLcl_upd_usr_id.addAllListener(p);
		p.columnLcl_upd_usr_id.setListListener(p);
		p.columnLcl_upd_usr_nm.addAllListener(p);
		p.columnLcl_upd_usr_nm.setListListener(p);
		p.columnLcl_upd_ts.addAllListener(p);
		p.columnLcl_upd_ts.setListListener(p);
		p.columnLcl_upd_func_id.addAllListener(p);
		p.columnLcl_upd_func_id.setListListener(p);
		p.columnLcl_upd_func_nm.addAllListener(p);
		p.columnLcl_upd_func_nm.setListListener(p);
		p.columnLcl_upd_srv_req_no.addAllListener(p);
		p.columnLcl_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [LclBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclBtn(MABCP_SttlReg p) {
		p.LclBtn_select_all.addAllListener(p);
		p.LclBtn_select_all.setAPMethodName("doLclBtn_select_all");
		p.LclBtn_deselect_all.addAllListener(p);
		p.LclBtn_deselect_all.setAPMethodName("doLclBtn_deselect_all");
		p.LclBtn_radd.addAllListener(p);
		p.LclBtn_radd.setAPMethodName("doLclBtn_radd");
		p.LclBtn_rdel.addAllListener(p);
		p.LclBtn_rdel.setAPMethodName("doLclBtn_rdel");
		p.LclBtn_rcopy.addAllListener(p);
		p.LclBtn_rcopy.setAPMethodName("doLclBtn_rcopy");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABCP_SttlReg p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_upd_admin.addAllListener(p);
		p.Btn_upd_admin.setAPMethodName("doBtn_upd_admin");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABCP_SttlReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_SttlReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABCP_SttlReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_SttlReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_SttlReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_SttlReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sttl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sttl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ar_sttl_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ar_sttl_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ap_sttl_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ap_sttl_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_SttlReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk(MABCP_SttlReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_SttlReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sttl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sttl_nm_lcl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sttl_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ar_sttl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ap_sttl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ar_sttl_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ar_sttl_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rcv_reg_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_rcv_reg_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_calc_com_paid_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ar_setoff_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ar_setoff_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_debt_cred_id_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_debt_cred_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ap_sttl_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ap_setoff_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_act_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sls_purc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sls_purc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bill_tax_disp_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ac_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ac_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtn(MABCP_SttlReg p){
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclWrk(MABCP_SttlReg p){

	}

	/**
	 * [UPD]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Lcl(MABCP_SttlReg p){
		p.columnLcl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_sttl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_sttl_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclAll(MABCP_SttlReg p){

	}

	/**
	 * [UPD]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclBtn(MABCP_SttlReg p){
		p.LclBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABCP_SttlReg p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_admin.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABCP_SttlReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_ScreenOpe(MABCP_SttlReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Mst(MABCP_SttlReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_ADMIN]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Top(MABCP_SttlReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Fold(MABCP_SttlReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Cnd(MABCP_SttlReg p){
		p.Cnd_ope_Group.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.Cnd_sttl_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_sttl_nm.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_ar_sttl_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_ar_sttl_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Cnd_ap_sttl_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_ap_sttl_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD_ADMIN, MCMode.ENABLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Ctrl(MABCP_SttlReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Wrk(MABCP_SttlReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Dtl(MABCP_SttlReg p){
		p.columnDtl_check.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_sttl_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_sttl_nm_lcl.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_sttl_nm.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_ar_sttl_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_ap_sttl_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_ar_sttl_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_ar_sttl_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_rcv_reg_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_rcv_reg_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_calc_com_paid_flg.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_ar_setoff_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_ar_setoff_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_debt_cred_id_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_debt_cred_id_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_ap_sttl_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_ap_setoff_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_act_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_sls_purc_typ.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_sls_purc_typ_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_bill_tax_disp_flg.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnDtl_ac_rsn_cd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_ac_rsn_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnDtl_ins_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_ADMIN]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_DtlBtn(MABCP_SttlReg p){
		p.DtlBtn_select_all.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD_ADMIN, MCMode.ENABLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_LclWrk(MABCP_SttlReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Lcl(MABCP_SttlReg p){
		p.columnLcl_check.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnLcl_sttl_cd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_sttl_nm.putMode(p, UPD_ADMIN, MCMode.REQUIRED);
		p.columnLcl_memo1.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_memo2.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_memo3.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.columnLcl_ins_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, UPD_ADMIN, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_ADMIN]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_LclAll(MABCP_SttlReg p){

	}

	/**
	 * [UPD_ADMIN]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_LclBtn(MABCP_SttlReg p){
		p.LclBtn_select_all.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, UPD_ADMIN, MCMode.ENABLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_Btn(MABCP_SttlReg p){
		p.Btn_upd.putMode(p, UPD_ADMIN, MCMode.INVISIBLE);
		p.Btn_upd_admin.putMode(p, UPD_ADMIN, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD_ADMIN, MCMode.DISABLE);

	}

	/**
	 * [UPD_ADMIN]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__ADMIN_EastBtn(MABCP_SttlReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_SttlReg p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABCP_SttlReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_SttlReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_SttlReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_SttlReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_sttl_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sttl_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ar_sttl_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ar_sttl_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_ap_sttl_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ap_sttl_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABCP_SttlReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk(MABCP_SttlReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_SttlReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sttl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sttl_nm_lcl.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sttl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rcv_reg_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rcv_reg_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_calc_com_paid_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ar_setoff_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ar_setoff_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_debt_cred_id_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_debt_cred_id_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_act_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_purc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_purc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bill_tax_disp_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlBtn(MABCP_SttlReg p){
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclWrk(MABCP_SttlReg p){

	}

	/**
	 * [FIX]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Lcl(MABCP_SttlReg p){
		p.columnLcl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_sttl_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_sttl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclAll(MABCP_SttlReg p){

	}

	/**
	 * [FIX]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclBtn(MABCP_SttlReg p){
		p.LclBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABCP_SttlReg p){
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd_admin.putMode(p, FIX, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABCP_SttlReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_SttlReg p){

	}

	/**
	 * [DEL]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mst(MABCP_SttlReg p){
		p.Mst_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABCP_SttlReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABCP_SttlReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_SttlReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_sttl_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sttl_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ar_sttl_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ar_sttl_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ap_sttl_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ap_sttl_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABCP_SttlReg p){

	}

	/**
	 * [DEL]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Wrk(MABCP_SttlReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_SttlReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sttl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sttl_nm_lcl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sttl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rcv_reg_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rcv_reg_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_calc_com_paid_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ar_setoff_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ar_setoff_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_debt_cred_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_debt_cred_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_act_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_purc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_purc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bill_tax_disp_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtn(MABCP_SttlReg p){
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclWrk(MABCP_SttlReg p){

	}

	/**
	 * [DEL]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Lcl(MABCP_SttlReg p){
		p.columnLcl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_sttl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_sttl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclAll(MABCP_SttlReg p){

	}

	/**
	 * [DEL]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclBtn(MABCP_SttlReg p){
		p.LclBtn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABCP_SttlReg p){
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd_admin.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABCP_SttlReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_SttlReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_SttlReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_SttlReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_SttlReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_SttlReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sttl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sttl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ar_sttl_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ar_sttl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ap_sttl_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ap_sttl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_SttlReg p){

	}

	/**
	 * [REF]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk(MABCP_SttlReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_SttlReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sttl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sttl_nm_lcl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sttl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ar_sttl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rcv_reg_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rcv_reg_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_com_paid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ar_setoff_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ar_setoff_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_debt_cred_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_debt_cred_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_sttl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_setoff_act_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_purc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_purc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bill_tax_disp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtn(MABCP_SttlReg p){
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclWrk(MABCP_SttlReg p){

	}

	/**
	 * [REF]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Lcl(MABCP_SttlReg p){
		p.columnLcl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_sttl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_sttl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclAll(MABCP_SttlReg p){

	}

	/**
	 * [REF]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclBtn(MABCP_SttlReg p){
		p.LclBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABCP_SttlReg p){
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_admin.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABCP_SttlReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return UPD;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MABCP_SttlReg_MC.setTableConfigDtl((MABCP_SttlReg)this);
		MABCP_SttlReg_MC.setTableConfigLcl((MABCP_SttlReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_SttlReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP0440.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABC.MABCP0440.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_sttl_cd.setMeta(mcframe.clientMABC.MABCP0440.DtlR.sttl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sttl_cd);
		p.columnDtl_sttl_nm_lcl.setMeta(mcframe.clientMABC.MABCP0440.DtlR.sttl_nm_lcl_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sttl_nm_lcl);
		p.columnDtl_sttl_nm.setMeta(mcframe.clientMABC.MABCP0440.DtlR.sttl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sttl_nm);
		p.columnDtl_ar_sttl_flg.setMeta(mcframe.clientMABC.MABCP0440.DtlR.ar_sttl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_sttl_flg);
		p.columnDtl_ap_sttl_flg.setMeta(mcframe.clientMABC.MABCP0440.DtlR.ap_sttl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_sttl_flg);
		p.columnDtl_ar_sttl_typ.setMeta(mcframe.clientMABC.MABCP0440.DtlR.ar_sttl_typ_META);
		p.columnDtl_ar_sttl_typ.addLinkBeans(p.columnDtl_ar_sttl_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_sttl_typ);
		p.columnDtl_ar_sttl_typ_nm.setMeta(mcframe.clientMABC.MABCP0440.DtlR.ar_sttl_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_sttl_typ_nm);
		p.columnDtl_rcv_reg_typ.setMeta(mcframe.clientMABC.MABCP0440.DtlR.rcv_reg_typ_META);
		p.columnDtl_rcv_reg_typ.addLinkBeans(p.columnDtl_rcv_reg_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_rcv_reg_typ);
		p.columnDtl_rcv_reg_typ_nm.setMeta(mcframe.clientMABC.MABCP0440.DtlR.rcv_reg_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rcv_reg_typ_nm);
		p.columnDtl_calc_com_paid_flg.setMeta(mcframe.clientMABC.MABCP0440.DtlR.calc_com_paid_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_com_paid_flg);
		p.columnDtl_ar_setoff_cd.setMeta(mcframe.clientMABC.MABCP0440.DtlR.ar_setoff_cd_META);
		p.columnDtl_ar_setoff_cd.addLinkBeans(p.columnDtl_ar_setoff_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_setoff_cd);
		p.columnDtl_ar_setoff_nm.setMeta(mcframe.clientMABC.MABCP0440.DtlR.ar_setoff_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_setoff_nm);
		p.columnDtl_debt_cred_id_typ.setMeta(mcframe.clientMABC.MABCP0440.DtlR.debt_cred_id_typ_META);
		p.columnDtl_debt_cred_id_typ.addLinkBeans(p.columnDtl_debt_cred_id_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_debt_cred_id_typ);
		p.columnDtl_debt_cred_id_typ_nm.setMeta(mcframe.clientMABC.MABCP0440.DtlR.debt_cred_id_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_debt_cred_id_typ_nm);
		p.columnDtl_ap_sttl_typ.setMeta(mcframe.clientMABC.MABCP0440.DtlR.ap_sttl_typ_META);
		p.columnDtl_ap_sttl_typ.addLinkBeans(p.columnDtl_ap_sttl_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_sttl_typ);
		p.columnDtl_ap_sttl_typ_nm.setMeta(mcframe.clientMABC.MABCP0440.DtlR.ap_sttl_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_sttl_typ_nm);
		p.columnDtl_ap_setoff_typ.setMeta(mcframe.clientMABC.MABCP0440.DtlR.ap_setoff_typ_META);
		p.columnDtl_ap_setoff_typ.addLinkBeans(p.columnDtl_ap_setoff_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_setoff_typ);
		p.columnDtl_ap_setoff_typ_nm.setMeta(mcframe.clientMABC.MABCP0440.DtlR.ap_setoff_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_setoff_typ_nm);
		p.columnDtl_ap_setoff_act_flg.setMeta(mcframe.clientMABC.MABCP0440.DtlR.ap_setoff_act_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_setoff_act_flg);
		p.columnDtl_sls_purc_typ.setMeta(mcframe.clientMABC.MABCP0440.DtlR.sls_purc_typ_META);
		p.columnDtl_sls_purc_typ.addLinkBeans(p.columnDtl_sls_purc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_purc_typ);
		p.columnDtl_sls_purc_typ_nm.setMeta(mcframe.clientMABC.MABCP0440.DtlR.sls_purc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_purc_typ_nm);
		p.columnDtl_bill_tax_disp_flg.setMeta(mcframe.clientMABC.MABCP0440.DtlR.bill_tax_disp_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_tax_disp_flg);
		p.columnDtl_ac_rsn_cd.setMeta(mcframe.clientMABC.MABCP0440.DtlR.ac_rsn_cd_META);
		p.columnDtl_ac_rsn_cd.addLinkBeans(p.columnDtl_ac_rsn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_rsn_cd);
		p.columnDtl_ac_rsn_nm.setMeta(mcframe.clientMABC.MABCP0440.DtlR.ac_rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_rsn_nm);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP0440.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP0440.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP0440.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0440.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0440.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0440.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0440.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0440.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0440.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0440.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0440.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0440.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0440.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0440.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0440.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0440.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0440.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABC.MABCP0440.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * [Lcl]ブロックのTableの設定
	 */
	protected static void setTableConfigLcl(MABCP_SttlReg p) {
		p.columnLcl_check.setMeta(mcframe.clientMABC.MABCP0440.LclR.check_META);
		p.LclTable.addColumnConfig(p.columnLcl_check);
		p.columnLcl_sttl_cd.setMeta(mcframe.clientMABC.MABCP0440.LclR.sttl_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_sttl_cd);
		p.columnLcl_lcl_cd.setMeta(mcframe.clientMABC.MABCP0440.LclR.lcl_cd_META);
		p.columnLcl_lcl_cd.addLinkBeans(p.columnLcl_lcl_nm);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_cd);
		p.columnLcl_lcl_nm.setMeta(mcframe.clientMABC.MABCP0440.LclR.lcl_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_nm);
		p.columnLcl_sttl_nm.setMeta(mcframe.clientMABC.MABCP0440.LclR.sttl_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_sttl_nm);
		p.columnLcl_memo1.setMeta(mcframe.clientMABC.MABCP0440.LclR.memo1_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo1);
		p.columnLcl_memo2.setMeta(mcframe.clientMABC.MABCP0440.LclR.memo2_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo2);
		p.columnLcl_memo3.setMeta(mcframe.clientMABC.MABCP0440.LclR.memo3_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo3);
		p.columnLcl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0440.LclR.ins_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_id);
		p.columnLcl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0440.LclR.ins_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_nm);
		p.columnLcl_ins_ts.setMeta(mcframe.clientMABC.MABCP0440.LclR.ins_ts_META);
		p.columnLcl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_ins_ts);
		p.columnLcl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0440.LclR.ins_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_id);
		p.columnLcl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0440.LclR.ins_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_nm);
		p.columnLcl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0440.LclR.upd_cntr_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_cntr);
		p.columnLcl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0440.LclR.upd_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_id);
		p.columnLcl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0440.LclR.upd_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_nm);
		p.columnLcl_upd_ts.setMeta(mcframe.clientMABC.MABCP0440.LclR.upd_ts_META);
		p.columnLcl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_upd_ts);
		p.columnLcl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0440.LclR.upd_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_id);
		p.columnLcl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0440.LclR.upd_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_nm);
		p.columnLcl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0440.LclR.upd_srv_req_no_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.LclTable.setUnscrollColumn(p.columnLcl_lcl_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_sttl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sttl_cd.getListConfig().setPutter(getCnd_sttl_cd_ListPutter());
		Cnd_ar_sttl_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ar_sttl_typ.getListConfig().setPutter(getCnd_ar_sttl_typ_ListPutter());
		Cnd_ap_sttl_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ap_sttl_typ.getListConfig().setPutter(getCnd_ap_sttl_typ_ListPutter());
		columnDtl_ar_sttl_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ar_sttl_typ.getListConfig().setPutter(getDtl_ar_sttl_typ_ListPutter());
		columnDtl_rcv_reg_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_rcv_reg_typ.getListConfig().setPutter(getDtl_rcv_reg_typ_ListPutter());
		columnDtl_ar_setoff_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ar_setoff_cd.getListConfig().setPutter(getDtl_ar_setoff_cd_ListPutter());
		columnDtl_debt_cred_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_debt_cred_id_typ.getListConfig().setPutter(getDtl_debt_cred_id_typ_ListPutter());
		columnDtl_ap_sttl_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ap_sttl_typ.getListConfig().setPutter(getDtl_ap_sttl_typ_ListPutter());
		columnDtl_ap_setoff_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ap_setoff_typ.getListConfig().setPutter(getDtl_ap_setoff_typ_ListPutter());
		columnDtl_sls_purc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sls_purc_typ.getListConfig().setPutter(getDtl_sls_purc_typ_ListPutter());
		columnDtl_ac_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ac_rsn_cd.getListConfig().setPutter(getDtl_ac_rsn_cd_ListPutter());
		columnLcl_lcl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnLcl_lcl_cd.getListConfig().setPutter(getLcl_lcl_cd_ListPutter());
	}

	/**
	 * この画面を[UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPDStatus() {
		status = UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_ADMIN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_ADMINStatus() {
		status = UPD_ADMIN;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIXStatus() {
		status = FIX;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (UPD_ADMIN.equals(status)) {
			setUPD_ADMINStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * この画面のステータスを返します。
	 *
	 * @return ステータス
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * [Cnd_sttl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sttl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Sttl");
		return lp;
	}
	 
	/**
	 * [Cnd_ar_sttl_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ar_sttl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ArSttlTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_ap_sttl_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ap_sttl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ApSttlTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_ar_sttl_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ar_sttl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ArSttlTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_rcv_reg_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_rcv_reg_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RcvRegTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_ar_setoff_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ar_setoff_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Sttl");
		return lp;
	}
	 
	/**
	 * [Dtl_debt_cred_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_debt_cred_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DebtCredIdTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_ap_sttl_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ap_sttl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ApSttlTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_ap_setoff_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ap_setoff_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ApSetoffTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sls_purc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sls_purc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsPurcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_ac_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ac_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcRsn");
		return lp;
	}
	 
	/**
	 * [Lcl_lcl_cd_ListPutter]の作成
	 */
	protected MCListPutter createLcl_lcl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocaleEntry");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_sttl_cd) return getCnd_sttl_cd(row, info);
		if(combo == Cnd_ar_sttl_typ) return getCnd_ar_sttl_typ(row, info);
		if(combo == Cnd_ap_sttl_typ) return getCnd_ap_sttl_typ(row, info);
		if(combo == columnDtl_ar_sttl_typ) return getDtl_ar_sttl_typ(row, info);
		if(combo == columnDtl_rcv_reg_typ) return getDtl_rcv_reg_typ(row, info);
		if(combo == columnDtl_ar_setoff_cd) return getDtl_ar_setoff_cd(row, info);
		if(combo == columnDtl_debt_cred_id_typ) return getDtl_debt_cred_id_typ(row, info);
		if(combo == columnDtl_ap_sttl_typ) return getDtl_ap_sttl_typ(row, info);
		if(combo == columnDtl_ap_setoff_typ) return getDtl_ap_setoff_typ(row, info);
		if(combo == columnDtl_sls_purc_typ) return getDtl_sls_purc_typ(row, info);
		if(combo == columnDtl_ac_rsn_cd) return getDtl_ac_rsn_cd(row, info);
		if(combo == columnLcl_lcl_cd) return getLcl_lcl_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == DtlBtn_select_all) doDtlBtn_select_all(info);
		else if (ap == DtlBtn_deselect_all) doDtlBtn_deselect_all(info);
		else if (ap == DtlBtn_radd) doDtlBtn_radd(info);
		else if (ap == DtlBtn_rdel) doDtlBtn_rdel(info);
		else if (ap == DtlBtn_rcopy) doDtlBtn_rcopy(info);
		else if (ap == LclBtn_select_all) doLclBtn_select_all(info);
		else if (ap == LclBtn_deselect_all) doLclBtn_deselect_all(info);
		else if (ap == LclBtn_radd) doLclBtn_radd(info);
		else if (ap == LclBtn_rdel) doLclBtn_rdel(info);
		else if (ap == LclBtn_rcopy) doLclBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_upd_admin) doBtn_upd_admin(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_select_all(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_radd(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_rdel(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_rcopy(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_select_all(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_deselect_all(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_radd(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_rdel(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_admin]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_admin(MCEventInfo info);

	/**
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

	/**
	 * ValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param vc イベント対象のGUI部品
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (!super.doVCEvent(vc, info)) {
			return false;
		}
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == LclTable) return doLcl_VC(info);
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_sttl_cd) return doCnd_sttl_cd_VC(info);
		if (vc == Cnd_sttl_nm) return doCnd_sttl_nm_VC(info);
		if (vc == Cnd_ar_sttl_typ) return doCnd_ar_sttl_typ_VC(info);
		if (vc == Cnd_ar_sttl_typ_nm) return doCnd_ar_sttl_typ_nm_VC(info);
		if (vc == Cnd_ap_sttl_typ) return doCnd_ap_sttl_typ_VC(info);
		if (vc == Cnd_ap_sttl_typ_nm) return doCnd_ap_sttl_typ_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_sttl_cd) return doDtl_sttl_cd_VC(info);
		if (vc == columnDtl_sttl_nm_lcl) return doDtl_sttl_nm_lcl_VC(info);
		if (vc == columnDtl_sttl_nm) return doDtl_sttl_nm_VC(info);
		if (vc == columnDtl_ar_sttl_flg) return doDtl_ar_sttl_flg_VC(info);
		if (vc == columnDtl_ap_sttl_flg) return doDtl_ap_sttl_flg_VC(info);
		if (vc == columnDtl_ar_sttl_typ) return doDtl_ar_sttl_typ_VC(info);
		if (vc == columnDtl_ar_sttl_typ_nm) return doDtl_ar_sttl_typ_nm_VC(info);
		if (vc == columnDtl_rcv_reg_typ) return doDtl_rcv_reg_typ_VC(info);
		if (vc == columnDtl_rcv_reg_typ_nm) return doDtl_rcv_reg_typ_nm_VC(info);
		if (vc == columnDtl_calc_com_paid_flg) return doDtl_calc_com_paid_flg_VC(info);
		if (vc == columnDtl_ar_setoff_cd) return doDtl_ar_setoff_cd_VC(info);
		if (vc == columnDtl_ar_setoff_nm) return doDtl_ar_setoff_nm_VC(info);
		if (vc == columnDtl_debt_cred_id_typ) return doDtl_debt_cred_id_typ_VC(info);
		if (vc == columnDtl_debt_cred_id_typ_nm) return doDtl_debt_cred_id_typ_nm_VC(info);
		if (vc == columnDtl_ap_sttl_typ) return doDtl_ap_sttl_typ_VC(info);
		if (vc == columnDtl_ap_sttl_typ_nm) return doDtl_ap_sttl_typ_nm_VC(info);
		if (vc == columnDtl_ap_setoff_typ) return doDtl_ap_setoff_typ_VC(info);
		if (vc == columnDtl_ap_setoff_typ_nm) return doDtl_ap_setoff_typ_nm_VC(info);
		if (vc == columnDtl_ap_setoff_act_flg) return doDtl_ap_setoff_act_flg_VC(info);
		if (vc == columnDtl_sls_purc_typ) return doDtl_sls_purc_typ_VC(info);
		if (vc == columnDtl_sls_purc_typ_nm) return doDtl_sls_purc_typ_nm_VC(info);
		if (vc == columnDtl_bill_tax_disp_flg) return doDtl_bill_tax_disp_flg_VC(info);
		if (vc == columnDtl_ac_rsn_cd) return doDtl_ac_rsn_cd_VC(info);
		if (vc == columnDtl_ac_rsn_nm) return doDtl_ac_rsn_nm_VC(info);
		if (vc == columnDtl_memo1) return doDtl_memo1_VC(info);
		if (vc == columnDtl_memo2) return doDtl_memo2_VC(info);
		if (vc == columnDtl_memo3) return doDtl_memo3_VC(info);
		if (vc == columnDtl_ins_usr_id) return doDtl_ins_usr_id_VC(info);
		if (vc == columnDtl_ins_usr_nm) return doDtl_ins_usr_nm_VC(info);
		if (vc == columnDtl_ins_ts) return doDtl_ins_ts_VC(info);
		if (vc == columnDtl_ins_func_id) return doDtl_ins_func_id_VC(info);
		if (vc == columnDtl_ins_func_nm) return doDtl_ins_func_nm_VC(info);
		if (vc == columnDtl_upd_cntr) return doDtl_upd_cntr_VC(info);
		if (vc == columnDtl_upd_usr_id) return doDtl_upd_usr_id_VC(info);
		if (vc == columnDtl_upd_usr_nm) return doDtl_upd_usr_nm_VC(info);
		if (vc == columnDtl_upd_ts) return doDtl_upd_ts_VC(info);
		if (vc == columnDtl_upd_func_id) return doDtl_upd_func_id_VC(info);
		if (vc == columnDtl_upd_func_nm) return doDtl_upd_func_nm_VC(info);
		if (vc == columnDtl_upd_srv_req_no) return doDtl_upd_srv_req_no_VC(info);
		if (vc == columnDtl_del_usr_id) return doDtl_del_usr_id_VC(info);
		if (vc == columnDtl_del_usr_nm) return doDtl_del_usr_nm_VC(info);
		if (vc == columnDtl_del_ts) return doDtl_del_ts_VC(info);
		if (vc == columnLcl_check) return doLcl_check_VC(info);
		if (vc == columnLcl_sttl_cd) return doLcl_sttl_cd_VC(info);
		if (vc == columnLcl_lcl_cd) return doLcl_lcl_cd_VC(info);
		if (vc == columnLcl_lcl_nm) return doLcl_lcl_nm_VC(info);
		if (vc == columnLcl_sttl_nm) return doLcl_sttl_nm_VC(info);
		if (vc == columnLcl_memo1) return doLcl_memo1_VC(info);
		if (vc == columnLcl_memo2) return doLcl_memo2_VC(info);
		if (vc == columnLcl_memo3) return doLcl_memo3_VC(info);
		if (vc == columnLcl_ins_usr_id) return doLcl_ins_usr_id_VC(info);
		if (vc == columnLcl_ins_usr_nm) return doLcl_ins_usr_nm_VC(info);
		if (vc == columnLcl_ins_ts) return doLcl_ins_ts_VC(info);
		if (vc == columnLcl_ins_func_id) return doLcl_ins_func_id_VC(info);
		if (vc == columnLcl_ins_func_nm) return doLcl_ins_func_nm_VC(info);
		if (vc == columnLcl_upd_cntr) return doLcl_upd_cntr_VC(info);
		if (vc == columnLcl_upd_usr_id) return doLcl_upd_usr_id_VC(info);
		if (vc == columnLcl_upd_usr_nm) return doLcl_upd_usr_nm_VC(info);
		if (vc == columnLcl_upd_ts) return doLcl_upd_ts_VC(info);
		if (vc == columnLcl_upd_func_id) return doLcl_upd_func_id_VC(info);
		if (vc == columnLcl_upd_func_nm) return doLcl_upd_func_nm_VC(info);
		if (vc == columnLcl_upd_srv_req_no) return doLcl_upd_srv_req_no_VC(info);
		return true;
	}

	/**
	 * [Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMst_mst_set_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ar_sttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ar_sttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ar_sttl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ar_sttl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_sttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_sttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_sttl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_sttl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_off_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_on_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sttl_nm_lcl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sttl_nm_lcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_sttl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_sttl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_sttl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_sttl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_sttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_sttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_sttl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_sttl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcv_reg_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcv_reg_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcv_reg_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcv_reg_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_com_paid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_com_paid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_setoff_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_setoff_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_setoff_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_setoff_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[debt_cred_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_debt_cred_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[debt_cred_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_debt_cred_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_sttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_sttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_sttl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_sttl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_setoff_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_setoff_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_setoff_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_setoff_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_setoff_act_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_setoff_act_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_purc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_purc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_purc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_purc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_tax_disp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_tax_disp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_lcl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_lcl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == DtlTable) doDtl_NC(info);
		else if (nc == LclTable) doLcl_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_sttl_cd) doCnd_sttl_cd_NC(info);
		else if (nc == Cnd_sttl_nm) doCnd_sttl_nm_NC(info);
		else if (nc == Cnd_ar_sttl_typ) doCnd_ar_sttl_typ_NC(info);
		else if (nc == Cnd_ar_sttl_typ_nm) doCnd_ar_sttl_typ_nm_NC(info);
		else if (nc == Cnd_ap_sttl_typ) doCnd_ap_sttl_typ_NC(info);
		else if (nc == Cnd_ap_sttl_typ_nm) doCnd_ap_sttl_typ_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_sttl_cd) doDtl_sttl_cd_NC(info);
		else if (nc == columnDtl_sttl_nm_lcl) doDtl_sttl_nm_lcl_NC(info);
		else if (nc == columnDtl_sttl_nm) doDtl_sttl_nm_NC(info);
		else if (nc == columnDtl_ar_sttl_flg) doDtl_ar_sttl_flg_NC(info);
		else if (nc == columnDtl_ap_sttl_flg) doDtl_ap_sttl_flg_NC(info);
		else if (nc == columnDtl_ar_sttl_typ) doDtl_ar_sttl_typ_NC(info);
		else if (nc == columnDtl_ar_sttl_typ_nm) doDtl_ar_sttl_typ_nm_NC(info);
		else if (nc == columnDtl_rcv_reg_typ) doDtl_rcv_reg_typ_NC(info);
		else if (nc == columnDtl_rcv_reg_typ_nm) doDtl_rcv_reg_typ_nm_NC(info);
		else if (nc == columnDtl_calc_com_paid_flg) doDtl_calc_com_paid_flg_NC(info);
		else if (nc == columnDtl_ar_setoff_cd) doDtl_ar_setoff_cd_NC(info);
		else if (nc == columnDtl_ar_setoff_nm) doDtl_ar_setoff_nm_NC(info);
		else if (nc == columnDtl_debt_cred_id_typ) doDtl_debt_cred_id_typ_NC(info);
		else if (nc == columnDtl_debt_cred_id_typ_nm) doDtl_debt_cred_id_typ_nm_NC(info);
		else if (nc == columnDtl_ap_sttl_typ) doDtl_ap_sttl_typ_NC(info);
		else if (nc == columnDtl_ap_sttl_typ_nm) doDtl_ap_sttl_typ_nm_NC(info);
		else if (nc == columnDtl_ap_setoff_typ) doDtl_ap_setoff_typ_NC(info);
		else if (nc == columnDtl_ap_setoff_typ_nm) doDtl_ap_setoff_typ_nm_NC(info);
		else if (nc == columnDtl_ap_setoff_act_flg) doDtl_ap_setoff_act_flg_NC(info);
		else if (nc == columnDtl_sls_purc_typ) doDtl_sls_purc_typ_NC(info);
		else if (nc == columnDtl_sls_purc_typ_nm) doDtl_sls_purc_typ_nm_NC(info);
		else if (nc == columnDtl_bill_tax_disp_flg) doDtl_bill_tax_disp_flg_NC(info);
		else if (nc == columnDtl_ac_rsn_cd) doDtl_ac_rsn_cd_NC(info);
		else if (nc == columnDtl_ac_rsn_nm) doDtl_ac_rsn_nm_NC(info);
		else if (nc == columnDtl_memo1) doDtl_memo1_NC(info);
		else if (nc == columnDtl_memo2) doDtl_memo2_NC(info);
		else if (nc == columnDtl_memo3) doDtl_memo3_NC(info);
		else if (nc == columnDtl_ins_usr_id) doDtl_ins_usr_id_NC(info);
		else if (nc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NC(info);
		else if (nc == columnDtl_ins_ts) doDtl_ins_ts_NC(info);
		else if (nc == columnDtl_ins_func_id) doDtl_ins_func_id_NC(info);
		else if (nc == columnDtl_ins_func_nm) doDtl_ins_func_nm_NC(info);
		else if (nc == columnDtl_upd_cntr) doDtl_upd_cntr_NC(info);
		else if (nc == columnDtl_upd_usr_id) doDtl_upd_usr_id_NC(info);
		else if (nc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NC(info);
		else if (nc == columnDtl_upd_ts) doDtl_upd_ts_NC(info);
		else if (nc == columnDtl_upd_func_id) doDtl_upd_func_id_NC(info);
		else if (nc == columnDtl_upd_func_nm) doDtl_upd_func_nm_NC(info);
		else if (nc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NC(info);
		else if (nc == columnDtl_del_usr_id) doDtl_del_usr_id_NC(info);
		else if (nc == columnDtl_del_usr_nm) doDtl_del_usr_nm_NC(info);
		else if (nc == columnDtl_del_ts) doDtl_del_ts_NC(info);
		else if (nc == columnLcl_check) doLcl_check_NC(info);
		else if (nc == columnLcl_sttl_cd) doLcl_sttl_cd_NC(info);
		else if (nc == columnLcl_lcl_cd) doLcl_lcl_cd_NC(info);
		else if (nc == columnLcl_lcl_nm) doLcl_lcl_nm_NC(info);
		else if (nc == columnLcl_sttl_nm) doLcl_sttl_nm_NC(info);
		else if (nc == columnLcl_memo1) doLcl_memo1_NC(info);
		else if (nc == columnLcl_memo2) doLcl_memo2_NC(info);
		else if (nc == columnLcl_memo3) doLcl_memo3_NC(info);
		else if (nc == columnLcl_ins_usr_id) doLcl_ins_usr_id_NC(info);
		else if (nc == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NC(info);
		else if (nc == columnLcl_ins_ts) doLcl_ins_ts_NC(info);
		else if (nc == columnLcl_ins_func_id) doLcl_ins_func_id_NC(info);
		else if (nc == columnLcl_ins_func_nm) doLcl_ins_func_nm_NC(info);
		else if (nc == columnLcl_upd_cntr) doLcl_upd_cntr_NC(info);
		else if (nc == columnLcl_upd_usr_id) doLcl_upd_usr_id_NC(info);
		else if (nc == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NC(info);
		else if (nc == columnLcl_upd_ts) doLcl_upd_ts_NC(info);
		else if (nc == columnLcl_upd_func_id) doLcl_upd_func_id_NC(info);
		else if (nc == columnLcl_upd_func_nm) doLcl_upd_func_nm_NC(info);
		else if (nc == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NC(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_sttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_sttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_sttl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_sttl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sttl_nm_lcl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sttl_nm_lcl_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_reg_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_reg_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_reg_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_reg_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_com_paid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_com_paid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_setoff_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_setoff_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_setoff_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_setoff_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[debt_cred_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_debt_cred_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[debt_cred_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_debt_cred_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_setoff_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_setoff_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_setoff_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_setoff_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_setoff_act_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_setoff_act_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_purc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_purc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_purc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_purc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_tax_disp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_tax_disp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DtlTable) doDtl_NE(info);
		else if (ne == LclTable) doLcl_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_sttl_cd) doCnd_sttl_cd_NE(info);
		else if (ne == Cnd_sttl_nm) doCnd_sttl_nm_NE(info);
		else if (ne == Cnd_ar_sttl_typ) doCnd_ar_sttl_typ_NE(info);
		else if (ne == Cnd_ar_sttl_typ_nm) doCnd_ar_sttl_typ_nm_NE(info);
		else if (ne == Cnd_ap_sttl_typ) doCnd_ap_sttl_typ_NE(info);
		else if (ne == Cnd_ap_sttl_typ_nm) doCnd_ap_sttl_typ_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_sttl_cd) doDtl_sttl_cd_NE(info);
		else if (ne == columnDtl_sttl_nm_lcl) doDtl_sttl_nm_lcl_NE(info);
		else if (ne == columnDtl_sttl_nm) doDtl_sttl_nm_NE(info);
		else if (ne == columnDtl_ar_sttl_flg) doDtl_ar_sttl_flg_NE(info);
		else if (ne == columnDtl_ap_sttl_flg) doDtl_ap_sttl_flg_NE(info);
		else if (ne == columnDtl_ar_sttl_typ) doDtl_ar_sttl_typ_NE(info);
		else if (ne == columnDtl_ar_sttl_typ_nm) doDtl_ar_sttl_typ_nm_NE(info);
		else if (ne == columnDtl_rcv_reg_typ) doDtl_rcv_reg_typ_NE(info);
		else if (ne == columnDtl_rcv_reg_typ_nm) doDtl_rcv_reg_typ_nm_NE(info);
		else if (ne == columnDtl_calc_com_paid_flg) doDtl_calc_com_paid_flg_NE(info);
		else if (ne == columnDtl_ar_setoff_cd) doDtl_ar_setoff_cd_NE(info);
		else if (ne == columnDtl_ar_setoff_nm) doDtl_ar_setoff_nm_NE(info);
		else if (ne == columnDtl_debt_cred_id_typ) doDtl_debt_cred_id_typ_NE(info);
		else if (ne == columnDtl_debt_cred_id_typ_nm) doDtl_debt_cred_id_typ_nm_NE(info);
		else if (ne == columnDtl_ap_sttl_typ) doDtl_ap_sttl_typ_NE(info);
		else if (ne == columnDtl_ap_sttl_typ_nm) doDtl_ap_sttl_typ_nm_NE(info);
		else if (ne == columnDtl_ap_setoff_typ) doDtl_ap_setoff_typ_NE(info);
		else if (ne == columnDtl_ap_setoff_typ_nm) doDtl_ap_setoff_typ_nm_NE(info);
		else if (ne == columnDtl_ap_setoff_act_flg) doDtl_ap_setoff_act_flg_NE(info);
		else if (ne == columnDtl_sls_purc_typ) doDtl_sls_purc_typ_NE(info);
		else if (ne == columnDtl_sls_purc_typ_nm) doDtl_sls_purc_typ_nm_NE(info);
		else if (ne == columnDtl_bill_tax_disp_flg) doDtl_bill_tax_disp_flg_NE(info);
		else if (ne == columnDtl_ac_rsn_cd) doDtl_ac_rsn_cd_NE(info);
		else if (ne == columnDtl_ac_rsn_nm) doDtl_ac_rsn_nm_NE(info);
		else if (ne == columnDtl_memo1) doDtl_memo1_NE(info);
		else if (ne == columnDtl_memo2) doDtl_memo2_NE(info);
		else if (ne == columnDtl_memo3) doDtl_memo3_NE(info);
		else if (ne == columnDtl_ins_usr_id) doDtl_ins_usr_id_NE(info);
		else if (ne == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NE(info);
		else if (ne == columnDtl_ins_ts) doDtl_ins_ts_NE(info);
		else if (ne == columnDtl_ins_func_id) doDtl_ins_func_id_NE(info);
		else if (ne == columnDtl_ins_func_nm) doDtl_ins_func_nm_NE(info);
		else if (ne == columnDtl_upd_cntr) doDtl_upd_cntr_NE(info);
		else if (ne == columnDtl_upd_usr_id) doDtl_upd_usr_id_NE(info);
		else if (ne == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NE(info);
		else if (ne == columnDtl_upd_ts) doDtl_upd_ts_NE(info);
		else if (ne == columnDtl_upd_func_id) doDtl_upd_func_id_NE(info);
		else if (ne == columnDtl_upd_func_nm) doDtl_upd_func_nm_NE(info);
		else if (ne == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NE(info);
		else if (ne == columnDtl_del_usr_id) doDtl_del_usr_id_NE(info);
		else if (ne == columnDtl_del_usr_nm) doDtl_del_usr_nm_NE(info);
		else if (ne == columnDtl_del_ts) doDtl_del_ts_NE(info);
		else if (ne == columnLcl_check) doLcl_check_NE(info);
		else if (ne == columnLcl_sttl_cd) doLcl_sttl_cd_NE(info);
		else if (ne == columnLcl_lcl_cd) doLcl_lcl_cd_NE(info);
		else if (ne == columnLcl_lcl_nm) doLcl_lcl_nm_NE(info);
		else if (ne == columnLcl_sttl_nm) doLcl_sttl_nm_NE(info);
		else if (ne == columnLcl_memo1) doLcl_memo1_NE(info);
		else if (ne == columnLcl_memo2) doLcl_memo2_NE(info);
		else if (ne == columnLcl_memo3) doLcl_memo3_NE(info);
		else if (ne == columnLcl_ins_usr_id) doLcl_ins_usr_id_NE(info);
		else if (ne == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NE(info);
		else if (ne == columnLcl_ins_ts) doLcl_ins_ts_NE(info);
		else if (ne == columnLcl_ins_func_id) doLcl_ins_func_id_NE(info);
		else if (ne == columnLcl_ins_func_nm) doLcl_ins_func_nm_NE(info);
		else if (ne == columnLcl_upd_cntr) doLcl_upd_cntr_NE(info);
		else if (ne == columnLcl_upd_usr_id) doLcl_upd_usr_id_NE(info);
		else if (ne == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NE(info);
		else if (ne == columnLcl_upd_ts) doLcl_upd_ts_NE(info);
		else if (ne == columnLcl_upd_func_id) doLcl_upd_func_id_NE(info);
		else if (ne == columnLcl_upd_func_nm) doLcl_upd_func_nm_NE(info);
		else if (ne == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NE(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_sttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_sttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_sttl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_sttl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sttl_nm_lcl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sttl_nm_lcl_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_reg_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_reg_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_reg_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_reg_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_com_paid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_com_paid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_setoff_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_setoff_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_setoff_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_setoff_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[debt_cred_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_debt_cred_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[debt_cred_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_debt_cred_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_setoff_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_setoff_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_setoff_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_setoff_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_setoff_act_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_setoff_act_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_purc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_purc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_purc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_purc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_tax_disp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_tax_disp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DtlTable) doDtl_NX(info);
		else if (nx == LclTable) doLcl_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_sttl_cd) doCnd_sttl_cd_NX(info);
		else if (nx == Cnd_sttl_nm) doCnd_sttl_nm_NX(info);
		else if (nx == Cnd_ar_sttl_typ) doCnd_ar_sttl_typ_NX(info);
		else if (nx == Cnd_ar_sttl_typ_nm) doCnd_ar_sttl_typ_nm_NX(info);
		else if (nx == Cnd_ap_sttl_typ) doCnd_ap_sttl_typ_NX(info);
		else if (nx == Cnd_ap_sttl_typ_nm) doCnd_ap_sttl_typ_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_sttl_cd) doDtl_sttl_cd_NX(info);
		else if (nx == columnDtl_sttl_nm_lcl) doDtl_sttl_nm_lcl_NX(info);
		else if (nx == columnDtl_sttl_nm) doDtl_sttl_nm_NX(info);
		else if (nx == columnDtl_ar_sttl_flg) doDtl_ar_sttl_flg_NX(info);
		else if (nx == columnDtl_ap_sttl_flg) doDtl_ap_sttl_flg_NX(info);
		else if (nx == columnDtl_ar_sttl_typ) doDtl_ar_sttl_typ_NX(info);
		else if (nx == columnDtl_ar_sttl_typ_nm) doDtl_ar_sttl_typ_nm_NX(info);
		else if (nx == columnDtl_rcv_reg_typ) doDtl_rcv_reg_typ_NX(info);
		else if (nx == columnDtl_rcv_reg_typ_nm) doDtl_rcv_reg_typ_nm_NX(info);
		else if (nx == columnDtl_calc_com_paid_flg) doDtl_calc_com_paid_flg_NX(info);
		else if (nx == columnDtl_ar_setoff_cd) doDtl_ar_setoff_cd_NX(info);
		else if (nx == columnDtl_ar_setoff_nm) doDtl_ar_setoff_nm_NX(info);
		else if (nx == columnDtl_debt_cred_id_typ) doDtl_debt_cred_id_typ_NX(info);
		else if (nx == columnDtl_debt_cred_id_typ_nm) doDtl_debt_cred_id_typ_nm_NX(info);
		else if (nx == columnDtl_ap_sttl_typ) doDtl_ap_sttl_typ_NX(info);
		else if (nx == columnDtl_ap_sttl_typ_nm) doDtl_ap_sttl_typ_nm_NX(info);
		else if (nx == columnDtl_ap_setoff_typ) doDtl_ap_setoff_typ_NX(info);
		else if (nx == columnDtl_ap_setoff_typ_nm) doDtl_ap_setoff_typ_nm_NX(info);
		else if (nx == columnDtl_ap_setoff_act_flg) doDtl_ap_setoff_act_flg_NX(info);
		else if (nx == columnDtl_sls_purc_typ) doDtl_sls_purc_typ_NX(info);
		else if (nx == columnDtl_sls_purc_typ_nm) doDtl_sls_purc_typ_nm_NX(info);
		else if (nx == columnDtl_bill_tax_disp_flg) doDtl_bill_tax_disp_flg_NX(info);
		else if (nx == columnDtl_ac_rsn_cd) doDtl_ac_rsn_cd_NX(info);
		else if (nx == columnDtl_ac_rsn_nm) doDtl_ac_rsn_nm_NX(info);
		else if (nx == columnDtl_memo1) doDtl_memo1_NX(info);
		else if (nx == columnDtl_memo2) doDtl_memo2_NX(info);
		else if (nx == columnDtl_memo3) doDtl_memo3_NX(info);
		else if (nx == columnDtl_ins_usr_id) doDtl_ins_usr_id_NX(info);
		else if (nx == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NX(info);
		else if (nx == columnDtl_ins_ts) doDtl_ins_ts_NX(info);
		else if (nx == columnDtl_ins_func_id) doDtl_ins_func_id_NX(info);
		else if (nx == columnDtl_ins_func_nm) doDtl_ins_func_nm_NX(info);
		else if (nx == columnDtl_upd_cntr) doDtl_upd_cntr_NX(info);
		else if (nx == columnDtl_upd_usr_id) doDtl_upd_usr_id_NX(info);
		else if (nx == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NX(info);
		else if (nx == columnDtl_upd_ts) doDtl_upd_ts_NX(info);
		else if (nx == columnDtl_upd_func_id) doDtl_upd_func_id_NX(info);
		else if (nx == columnDtl_upd_func_nm) doDtl_upd_func_nm_NX(info);
		else if (nx == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NX(info);
		else if (nx == columnDtl_del_usr_id) doDtl_del_usr_id_NX(info);
		else if (nx == columnDtl_del_usr_nm) doDtl_del_usr_nm_NX(info);
		else if (nx == columnDtl_del_ts) doDtl_del_ts_NX(info);
		else if (nx == columnLcl_check) doLcl_check_NX(info);
		else if (nx == columnLcl_sttl_cd) doLcl_sttl_cd_NX(info);
		else if (nx == columnLcl_lcl_cd) doLcl_lcl_cd_NX(info);
		else if (nx == columnLcl_lcl_nm) doLcl_lcl_nm_NX(info);
		else if (nx == columnLcl_sttl_nm) doLcl_sttl_nm_NX(info);
		else if (nx == columnLcl_memo1) doLcl_memo1_NX(info);
		else if (nx == columnLcl_memo2) doLcl_memo2_NX(info);
		else if (nx == columnLcl_memo3) doLcl_memo3_NX(info);
		else if (nx == columnLcl_ins_usr_id) doLcl_ins_usr_id_NX(info);
		else if (nx == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NX(info);
		else if (nx == columnLcl_ins_ts) doLcl_ins_ts_NX(info);
		else if (nx == columnLcl_ins_func_id) doLcl_ins_func_id_NX(info);
		else if (nx == columnLcl_ins_func_nm) doLcl_ins_func_nm_NX(info);
		else if (nx == columnLcl_upd_cntr) doLcl_upd_cntr_NX(info);
		else if (nx == columnLcl_upd_usr_id) doLcl_upd_usr_id_NX(info);
		else if (nx == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NX(info);
		else if (nx == columnLcl_upd_ts) doLcl_upd_ts_NX(info);
		else if (nx == columnLcl_upd_func_id) doLcl_upd_func_id_NX(info);
		else if (nx == columnLcl_upd_func_nm) doLcl_upd_func_nm_NX(info);
		else if (nx == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NX(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_sttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_sttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_sttl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_sttl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sttl_nm_lcl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sttl_nm_lcl_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_reg_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_reg_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_reg_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_reg_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_com_paid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_com_paid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_setoff_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_setoff_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_setoff_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_setoff_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[debt_cred_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_debt_cred_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[debt_cred_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_debt_cred_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_setoff_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_setoff_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_setoff_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_setoff_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_setoff_act_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_setoff_act_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_purc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_purc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_purc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_purc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_tax_disp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_tax_disp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_LC(info);
		else if (lc == Cnd_sttl_cd) doCnd_sttl_cd_LC(info);
		else if (lc == Cnd_sttl_nm) doCnd_sttl_nm_LC(info);
		else if (lc == Cnd_ar_sttl_typ) doCnd_ar_sttl_typ_LC(info);
		else if (lc == Cnd_ar_sttl_typ_nm) doCnd_ar_sttl_typ_nm_LC(info);
		else if (lc == Cnd_ap_sttl_typ) doCnd_ap_sttl_typ_LC(info);
		else if (lc == Cnd_ap_sttl_typ_nm) doCnd_ap_sttl_typ_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == columnDtl_sttl_cd) doDtl_sttl_cd_LC(info);
		else if (lc == columnDtl_sttl_nm_lcl) doDtl_sttl_nm_lcl_LC(info);
		else if (lc == columnDtl_sttl_nm) doDtl_sttl_nm_LC(info);
		else if (lc == columnDtl_ar_sttl_typ) doDtl_ar_sttl_typ_LC(info);
		else if (lc == columnDtl_ar_sttl_typ_nm) doDtl_ar_sttl_typ_nm_LC(info);
		else if (lc == columnDtl_rcv_reg_typ) doDtl_rcv_reg_typ_LC(info);
		else if (lc == columnDtl_rcv_reg_typ_nm) doDtl_rcv_reg_typ_nm_LC(info);
		else if (lc == columnDtl_ar_setoff_cd) doDtl_ar_setoff_cd_LC(info);
		else if (lc == columnDtl_ar_setoff_nm) doDtl_ar_setoff_nm_LC(info);
		else if (lc == columnDtl_debt_cred_id_typ) doDtl_debt_cred_id_typ_LC(info);
		else if (lc == columnDtl_debt_cred_id_typ_nm) doDtl_debt_cred_id_typ_nm_LC(info);
		else if (lc == columnDtl_ap_sttl_typ) doDtl_ap_sttl_typ_LC(info);
		else if (lc == columnDtl_ap_sttl_typ_nm) doDtl_ap_sttl_typ_nm_LC(info);
		else if (lc == columnDtl_ap_setoff_typ) doDtl_ap_setoff_typ_LC(info);
		else if (lc == columnDtl_ap_setoff_typ_nm) doDtl_ap_setoff_typ_nm_LC(info);
		else if (lc == columnDtl_sls_purc_typ) doDtl_sls_purc_typ_LC(info);
		else if (lc == columnDtl_sls_purc_typ_nm) doDtl_sls_purc_typ_nm_LC(info);
		else if (lc == columnDtl_ac_rsn_cd) doDtl_ac_rsn_cd_LC(info);
		else if (lc == columnDtl_ac_rsn_nm) doDtl_ac_rsn_nm_LC(info);
		else if (lc == columnDtl_memo1) doDtl_memo1_LC(info);
		else if (lc == columnDtl_memo2) doDtl_memo2_LC(info);
		else if (lc == columnDtl_memo3) doDtl_memo3_LC(info);
		else if (lc == columnDtl_ins_usr_id) doDtl_ins_usr_id_LC(info);
		else if (lc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_LC(info);
		else if (lc == columnDtl_ins_ts) doDtl_ins_ts_LC(info);
		else if (lc == columnDtl_ins_func_id) doDtl_ins_func_id_LC(info);
		else if (lc == columnDtl_ins_func_nm) doDtl_ins_func_nm_LC(info);
		else if (lc == columnDtl_upd_cntr) doDtl_upd_cntr_LC(info);
		else if (lc == columnDtl_upd_usr_id) doDtl_upd_usr_id_LC(info);
		else if (lc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_LC(info);
		else if (lc == columnDtl_upd_ts) doDtl_upd_ts_LC(info);
		else if (lc == columnDtl_upd_func_id) doDtl_upd_func_id_LC(info);
		else if (lc == columnDtl_upd_func_nm) doDtl_upd_func_nm_LC(info);
		else if (lc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_LC(info);
		else if (lc == columnDtl_del_usr_id) doDtl_del_usr_id_LC(info);
		else if (lc == columnDtl_del_usr_nm) doDtl_del_usr_nm_LC(info);
		else if (lc == columnDtl_del_ts) doDtl_del_ts_LC(info);
		else if (lc == columnLcl_sttl_cd) doLcl_sttl_cd_LC(info);
		else if (lc == columnLcl_lcl_cd) doLcl_lcl_cd_LC(info);
		else if (lc == columnLcl_lcl_nm) doLcl_lcl_nm_LC(info);
		else if (lc == columnLcl_sttl_nm) doLcl_sttl_nm_LC(info);
		else if (lc == columnLcl_memo1) doLcl_memo1_LC(info);
		else if (lc == columnLcl_memo2) doLcl_memo2_LC(info);
		else if (lc == columnLcl_memo3) doLcl_memo3_LC(info);
		else if (lc == columnLcl_ins_usr_id) doLcl_ins_usr_id_LC(info);
		else if (lc == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_LC(info);
		else if (lc == columnLcl_ins_ts) doLcl_ins_ts_LC(info);
		else if (lc == columnLcl_ins_func_id) doLcl_ins_func_id_LC(info);
		else if (lc == columnLcl_ins_func_nm) doLcl_ins_func_nm_LC(info);
		else if (lc == columnLcl_upd_cntr) doLcl_upd_cntr_LC(info);
		else if (lc == columnLcl_upd_usr_id) doLcl_upd_usr_id_LC(info);
		else if (lc == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_LC(info);
		else if (lc == columnLcl_upd_ts) doLcl_upd_ts_LC(info);
		else if (lc == columnLcl_upd_func_id) doLcl_upd_func_id_LC(info);
		else if (lc == columnLcl_upd_func_nm) doLcl_upd_func_nm_LC(info);
		else if (lc == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_LC(info);
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_sttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_sttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_sttl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_sttl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_sttl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_sttl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sttl_nm_lcl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sttl_nm_lcl_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_sttl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_sttl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_reg_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_reg_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcv_reg_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcv_reg_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_setoff_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_setoff_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_setoff_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_setoff_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[debt_cred_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_debt_cred_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[debt_cred_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_debt_cred_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_sttl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_sttl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_setoff_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_setoff_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_setoff_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_setoff_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_purc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_purc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_purc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_purc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_sttl_cd]の作成メソッド
	 */
	public MCList getCnd_sttl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSttl(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ar_sttl_typ]の作成メソッド
	 */
	public MCList getCnd_ar_sttl_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArSttlTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ap_sttl_typ]の作成メソッド
	 */
	public MCList getCnd_ap_sttl_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApSttlTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ar_sttl_typ]の作成メソッド
	 */
	public MCList getDtl_ar_sttl_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArSttlTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_rcv_reg_typ]の作成メソッド
	 */
	public MCList getDtl_rcv_reg_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRcvRegTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ar_setoff_cd]の作成メソッド
	 */
	public MCList getDtl_ar_setoff_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSttl(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_debt_cred_id_typ]の作成メソッド
	 */
	public MCList getDtl_debt_cred_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDebtCredIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ap_sttl_typ]の作成メソッド
	 */
	public MCList getDtl_ap_sttl_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApSttlTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ap_setoff_typ]の作成メソッド
	 */
	public MCList getDtl_ap_setoff_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApSetoffTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sls_purc_typ]の作成メソッド
	 */
	public MCList getDtl_sls_purc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsPurcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ac_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_ac_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnLcl_lcl_cd]の作成メソッド
	 */
	public MCList getLcl_lcl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocaleEntry(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0440.Srch01")) {
			return new MA_MABCL0440_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0440.Upd01")) {
			return new MA_MABCL0440_Upd01Bridge();
		}
		if (id.equals("MA.MABCL0440.Del01")) {
			return new MA_MABCL0440_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0440_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0440_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0440_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0440_Srch01Bridge() {
			p_MA_MABCL0440_Srch01 = new MCParam(PDef.MA_MABCL0440_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0440_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0440.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0440.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0440.LclR.class));

			p_MA_MABCL0440_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0440_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0440_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0440_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0440_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0440.CndR up0() {
			return (mcframe.clientMABC.MABCP0440.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0440.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0440.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0440.LclR> down1() {
			return (MCList<mcframe.clientMABC.MABCP0440.LclR>)down(1);
		}

		protected void setupDownParam() {
			p_MA_MABCL0440_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0440.DtlR.class));
			p_MA_MABCL0440_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0440.LclR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0440_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0440.DtlR>)p_MA_MABCL0440_Srch01.getContainerParam().getDownBlock(0));
			setLclAllL((MCList<mcframe.clientMABC.MABCP0440.LclR>)p_MA_MABCL0440_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getDtlL().clear();
			getLclAllL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getLclAllL());
			return result;
		}
	}
	/**
	 * [MA_MABCL0440_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0440_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0440_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0440_Upd01Bridge() {
			p_MA_MABCL0440_Upd01 = new MCParam(PDef.MA_MABCL0440_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0440_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0440.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0440.LclR.class));
			// Down

			p_MA_MABCL0440_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0440_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0440_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABCL0440_Upd01.addUpBlock(getLclAllL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0440_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0440_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0440.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0440.DtlR>)up(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0440.LclR> up1() {
			return (MCList<mcframe.clientMABC.MABCP0440.LclR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0440_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getLclAllL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MA_MABCL0440_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0440_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0440_Del01;

		/** コンストラクタ */
		protected MA_MABCL0440_Del01Bridge() {
			p_MA_MABCL0440_Del01 = new MCParam(PDef.MA_MABCL0440_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0440_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0440.DtlR.class));
			// Down

			p_MA_MABCL0440_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0440_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0440_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0440_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0440_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0440.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0440.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0440_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}