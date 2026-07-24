package mcframe.clientMABS.MABSP0440;

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
import mcframe.clientMABS.MABSP0440.MABSP_LgCtlReg_MC.MA_MABSL0440_Srch01Caller;
import mcframe.clientMABS.MABSP0440.MABSP_LgCtlReg_MC.MA_MABSL0440_Upd01Caller;
import mcframe.clientMABS.MABSP0440.MABSP_LgCtlReg_MC.MA_MABSL0440_Del01Caller;

/**
 * 画面"MABSP_LgCtlReg"パネルクラスです。<p>
 *
 * 汎用分類マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSP_LgCtlReg_MC_A extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase{
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
	public static final String SUBMODULE_ID = "MABS";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABSP0440";

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
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_fr_lg_grp_cd_Label = null;
	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_fr_lg_grp_cd = null;
	/**
	 * Shipping point distribution group name 出荷元物流グループ名.<p>
	 *
	 */
	public MCTextField Cnd_fr_lg_grp_nm = null;
	public MCLabel Cnd_to_lg_grp_cd_Label = null;
	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_to_lg_grp_cd = null;
	/**
	 * Receiving point distribution group name 出荷先物流グループ名.<p>
	 *
	 */
	public MCTextField Cnd_to_lg_grp_nm = null;
	public MCLabel Cnd_ship_term_cd_Label = null;
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_term_cd = null;
	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public MCTextField Cnd_ship_term_nm = null;
	public MCLabel Cnd_ship_wk_grp_cd_Label = null;
	/**
	 * Shipping operation group cd. 出荷作業グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_wk_grp_cd = null;
	/**
	 * Shipping operation group name 出荷作業グループ名.<p>
	 *
	 */
	public MCTextField Cnd_ship_wk_grp_nm = null;
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
	public MCTable2<mcframe.clientMABS.MABSP0440.DtlR> DtlTable = null;
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
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fr_lg_grp_cd = null;
	/**
	 * Shipping point distribution group name 出荷元物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fr_lg_grp_nm = null;
	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_to_lg_grp_cd = null;
	/**
	 * Receiving point distribution group name 出荷先物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_to_lg_grp_nm = null;
	/**
	 * Set location (Receiving point distribution group) 場所設定（出荷先物流グループ）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_to_lg_grp_loc_flg = null;
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_term_cd = null;
	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_term_nm = null;
	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xfr_lt = null;
	/**
	 * Shipping closing time 出荷締時刻.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fin_cl_time_disp = null;
	/**
	 * Shipping closing time (String) 出荷締時刻（文字列）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fin_cl_time = null;
	/**
	 * Number of days added to earliest shipping date 最早出荷日加算日数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_early_ship_dt_add_days = null;
	/**
	 * Allocatable days 引当可能日数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alloc_days = null;
	/**
	 * Invoice transaction インボイス取引.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_trd_flg = null;
	/**
	 * Standard receiving point cd. 標準配送先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_tdlv_cd = null;
	/**
	 * Standard receiving point name 標準配送先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_tdlv_nm = null;
	/**
	 * Shipping operation group cd. 出荷作業グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_wk_grp_cd = null;
	/**
	 * Shipping operation group name 出荷作業グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_wk_grp_nm = null;
	/**
	 * Without demand LT 需要情報ＬＴ無し.<p>
	 *
	 */
	public MCColumnConfig columnDtl_non_dmnd_lt_flg = null;
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
	public MCTable2<mcframe.clientMABS.MABSP0440.LclR> LclTable = null;
	// [Lcl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnLcl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnLcl_del_flg = null;
	/**
	 * Shipping point distribution group cd. 出荷元物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_fr_lg_grp_cd = null;
	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_to_lg_grp_cd = null;
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ship_term_cd = null;
	/**
	 * Day of week 曜日.<p>
	 *
	 */
	public MCColumnConfig columnLcl_day_week_typ = null;
	/**
	 * Day name 曜日名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_day_week_typ_nm = null;
	/**
	 * Shipping closing time 出荷締時刻.<p>
	 *
	 */
	public MCColumnConfig columnLcl_fin_cl_time_disp = null;
	/**
	 * Shipping closing time (String) 出荷締時刻（文字列）.<p>
	 *
	 */
	public MCColumnConfig columnLcl_fin_cl_time = null;
	/**
	 * Shipping disallowed 出荷不可.<p>
	 *
	 */
	public MCColumnConfig columnLcl_no_ship_flg = null;
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
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnLcl_del_ts = null;
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
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
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
	public static final String[] statusArray = new String[]{UPD, FIX, DEL, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABSL0440_Srch01]のCallerの作成 */
	protected MABSP_LgCtlReg_MC.MA_MABSL0440_Srch01Caller createMA_MABSL0440_Srch01() {
		MABSP_LgCtlReg_MC.MA_MABSL0440_Srch01Caller<MABSP_LgCtlReg, MA_MABSL0440_Srch01Bridge>
		caller = ((MABSP_LgCtlReg_MC)this).new MA_MABSL0440_Srch01Caller<MABSP_LgCtlReg, MA_MABSL0440_Srch01Bridge>(
					(MABSP_LgCtlReg)this, new MA_MABSL0440_Srch01Bridge());
		return caller;
	}
	/** [MA_MABSL0440_Srch01]の呼び出し */
	protected void callMA_MABSL0440_Srch01() {
		MCCaller caller = createMA_MABSL0440_Srch01();
		caller.exec();
	}
	/** [MA_MABSL0440_Upd01]のCallerの作成 */
	protected MABSP_LgCtlReg_MC.MA_MABSL0440_Upd01Caller createMA_MABSL0440_Upd01() {
		MABSP_LgCtlReg_MC.MA_MABSL0440_Upd01Caller<MABSP_LgCtlReg, MA_MABSL0440_Upd01Bridge>
		caller = ((MABSP_LgCtlReg_MC)this).new MA_MABSL0440_Upd01Caller<MABSP_LgCtlReg, MA_MABSL0440_Upd01Bridge>(
					(MABSP_LgCtlReg)this, new MA_MABSL0440_Upd01Bridge());
		return caller;
	}
	/** [MA_MABSL0440_Upd01]の呼び出し */
	protected void callMA_MABSL0440_Upd01() {
		MCCaller caller = createMA_MABSL0440_Upd01();
		caller.exec();
	}
	/** [MA_MABSL0440_Del01]のCallerの作成 */
	protected MABSP_LgCtlReg_MC.MA_MABSL0440_Del01Caller createMA_MABSL0440_Del01() {
		MABSP_LgCtlReg_MC.MA_MABSL0440_Del01Caller<MABSP_LgCtlReg, MA_MABSL0440_Del01Bridge>
		caller = ((MABSP_LgCtlReg_MC)this).new MA_MABSL0440_Del01Caller<MABSP_LgCtlReg, MA_MABSL0440_Del01Bridge>(
					(MABSP_LgCtlReg)this, new MA_MABSL0440_Del01Bridge());
		return caller;
	}
	/** [MA_MABSL0440_Del01]の呼び出し */
	protected void callMA_MABSL0440_Del01() {
		MCCaller caller = createMA_MABSL0440_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP0440.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0440.DtlR> aDtlL;
	/** [Lcl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0440.LclR> aLclL;
	/** [LclAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0440.LclR> aLclAllL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABS.MABSP0440.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP0440.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP0440.CndR createCndR() {
		return mcframe.clientMABS.MABSP0440.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABS.MABSP0440.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0440.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABS.MABSP0440.DtlR createDtlR() {
		return mcframe.clientMABS.MABSP0440.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0440.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0440.DtlR.class);
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
	public void setLclL(MCList<mcframe.clientMABS.MABSP0440.LclR> aList) {
		if (getLclL() != aList) {
			getLclL().setAll(aList);
		}
	}

	/**
	 * [Lcl]ブロックのコンテナaLclLを返します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABS.MABSP0440.LclR> getLclL() {
		return aLclL;
	}

	/**
	 * aLclRを作成します。
	 *
	 * @return LclR
	 */
	public mcframe.clientMABS.MABSP0440.LclR createLclR() {
		return mcframe.clientMABS.MABSP0440.LclR.create();
	}

	/**
	 * aLclLを作成します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABS.MABSP0440.LclR> createLclL() {
		return MCList.create(mcframe.clientMABS.MABSP0440.LclR.class);
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
	public void setLclAllL(MCList<mcframe.clientMABS.MABSP0440.LclR> aList) {
		if (getLclAllL() != aList) {
			getLclAllL().setAll(aList);
		}
	}

	/**
	 * [LclAll]ブロックのコンテナaLclAllLを返します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABS.MABSP0440.LclR> getLclAllL() {
		return aLclAllL;
	}

	/**
	 * aLclAllRを作成します。
	 *
	 * @return LclAllR
	 */
	public mcframe.clientMABS.MABSP0440.LclR createLclAllR() {
		return mcframe.clientMABS.MABSP0440.LclR.create();
	}

	/**
	 * aLclAllLを作成します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABS.MABSP0440.LclR> createLclAllL() {
		return MCList.create(mcframe.clientMABS.MABSP0440.LclR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
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
	public MABSP_LgCtlReg_MC_A() {
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
	public MABSP_LgCtlReg_MC_A(String name) {
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
		MABSP_LgCtlReg_MC.jbCreateScreenOpe((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbCreateTop((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbCreateFold((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbCreateCnd((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbCreateCtrl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbCreateWrk((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbCreateDtl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbCreateDtlBtn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbCreateLclWrk((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbCreateLcl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbCreateLclBtn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbCreateBtn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbCreateEastBtn((MABSP_LgCtlReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABSP_LgCtlReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABSP_LgCtlReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABSP_LgCtlReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABSP_LgCtlReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABSP_LgCtlReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Wrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk(MABSP_LgCtlReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABSP_LgCtlReg p) {
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABSP_LgCtlReg p) {
	}

	/**
	 * [LclWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclWrk(MABSP_LgCtlReg p) {
	}

	/**
	 * [Lcl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLcl(MABSP_LgCtlReg p) {
	}

	/**
	 * [LclBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclBtn(MABSP_LgCtlReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABSP_LgCtlReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABSP_LgCtlReg p) {
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

	
	/** [Cnd_fr_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_fr_lg_grp_cd_p = null;

	/**
	 * [Cnd_fr_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_fr_lg_grp_cd_ListPutter() {
		if (Cnd_fr_lg_grp_cd_p == null) {
			Cnd_fr_lg_grp_cd_p = createCnd_fr_lg_grp_cd_ListPutter(Cnd_fr_lg_grp_cd, "fr_lg_grp_cd", "fr_lg_grp_nm");

		}
		return Cnd_fr_lg_grp_cd_p;
	}
	
	
	/** [Cnd_to_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_to_lg_grp_cd_p = null;

	/**
	 * [Cnd_to_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_to_lg_grp_cd_ListPutter() {
		if (Cnd_to_lg_grp_cd_p == null) {
			Cnd_to_lg_grp_cd_p = createCnd_to_lg_grp_cd_ListPutter(Cnd_to_lg_grp_cd, "to_lg_grp_cd", "to_lg_grp_nm");

		}
		return Cnd_to_lg_grp_cd_p;
	}
	
	
	/** [Cnd_ship_term_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ship_term_cd_p = null;

	/**
	 * [Cnd_ship_term_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_term_cd_ListPutter() {
		if (Cnd_ship_term_cd_p == null) {
			Cnd_ship_term_cd_p = createCnd_ship_term_cd_ListPutter(Cnd_ship_term_cd, "ship_term_cd", "ship_term_nm");

		}
		return Cnd_ship_term_cd_p;
	}
	
	
	/** [Cnd_ship_wk_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ship_wk_grp_cd_p = null;

	/**
	 * [Cnd_ship_wk_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_wk_grp_cd_ListPutter() {
		if (Cnd_ship_wk_grp_cd_p == null) {
			Cnd_ship_wk_grp_cd_p = createCnd_ship_wk_grp_cd_ListPutter(Cnd_ship_wk_grp_cd, "ship_wk_grp_cd", "ship_wk_grp_nm");

		}
		return Cnd_ship_wk_grp_cd_p;
	}
	
	
	/** [Dtl_fr_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_fr_lg_grp_cd_p = null;

	/**
	 * [Dtl_fr_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_fr_lg_grp_cd_ListPutter() {
		if (Dtl_fr_lg_grp_cd_p == null) {
			Dtl_fr_lg_grp_cd_p = createDtl_fr_lg_grp_cd_ListPutter(columnDtl_fr_lg_grp_cd, "fr_lg_grp_cd", "fr_lg_grp_nm");

		}
		return Dtl_fr_lg_grp_cd_p;
	}
	
	
	/** [Dtl_to_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_to_lg_grp_cd_p = null;

	/**
	 * [Dtl_to_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_to_lg_grp_cd_ListPutter() {
		if (Dtl_to_lg_grp_cd_p == null) {
			Dtl_to_lg_grp_cd_p = createDtl_to_lg_grp_cd_ListPutter(columnDtl_to_lg_grp_cd, "to_lg_grp_cd", "to_lg_grp_nm","to_lg_grp_loc_flg");

		}
		return Dtl_to_lg_grp_cd_p;
	}
	
	
	/** [Dtl_ship_term_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ship_term_cd_p = null;

	/**
	 * [Dtl_ship_term_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ship_term_cd_ListPutter() {
		if (Dtl_ship_term_cd_p == null) {
			Dtl_ship_term_cd_p = createDtl_ship_term_cd_ListPutter(columnDtl_ship_term_cd, "ship_term_cd", "ship_term_nm");

		}
		return Dtl_ship_term_cd_p;
	}
	
	
	/** [Dtl_def_tdlv_cd_ListPutter]の定義 */
	private MCListPutter Dtl_def_tdlv_cd_p = null;

	/**
	 * [Dtl_def_tdlv_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_def_tdlv_cd_ListPutter() {
		if (Dtl_def_tdlv_cd_p == null) {
			Dtl_def_tdlv_cd_p = createDtl_def_tdlv_cd_ListPutter(columnDtl_def_tdlv_cd, "def_tdlv_cd", "def_tdlv_nm");

		}
		return Dtl_def_tdlv_cd_p;
	}
	
	
	/** [Dtl_ship_wk_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ship_wk_grp_cd_p = null;

	/**
	 * [Dtl_ship_wk_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ship_wk_grp_cd_ListPutter() {
		if (Dtl_ship_wk_grp_cd_p == null) {
			Dtl_ship_wk_grp_cd_p = createDtl_ship_wk_grp_cd_ListPutter(columnDtl_ship_wk_grp_cd, "ship_wk_grp_cd", "ship_wk_grp_nm");

		}
		return Dtl_ship_wk_grp_cd_p;
	}
	
	
	/** [Lcl_day_week_typ_ListPutter]の定義 */
	private MCListPutter Lcl_day_week_typ_p = null;

	/**
	 * [Lcl_day_week_typ_ListPutter]の取得
	 */
	protected MCListPutter getLcl_day_week_typ_ListPutter() {
		if (Lcl_day_week_typ_p == null) {
			Lcl_day_week_typ_p = createLcl_day_week_typ_ListPutter(columnLcl_day_week_typ, "day_week_typ", "day_week_typ_nm");

		}
		return Lcl_day_week_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_LgCtlReg create(){
		MABSP_LgCtlReg p = new MABSP_LgCtlReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_LgCtlReg create(String name){
		MABSP_LgCtlReg p = new MABSP_LgCtlReg(name);
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
		MABSP_LgCtlReg_MC.jbfInitScreenOpe((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbfInitTop((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbfInitFold((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbfInitCnd((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbfInitCtrl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbfInitWrk((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbfInitDtl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbfInitDtlBtn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbfInitLclWrk((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbfInitLcl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbfInitLclBtn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbfInitBtn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbfInitEastBtn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbInitScreenOpe((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbInitTop((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbInitFold((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbInitCnd((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbInitCtrl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbInitWrk((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbInitDtl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbInitDtlBtn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbInitLclWrk((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbInitLcl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbInitLclBtn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbInitBtn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.jbInitEastBtn((MABSP_LgCtlReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABSP_LgCtlReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABSP_LgCtlReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABSP_LgCtlReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABSP_LgCtlReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_fr_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.fr_lg_grp_cd_Label");
		p.Cnd_fr_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.fr_lg_grp_cd");
		p.Cnd_fr_lg_grp_cd.setLabel(p.Cnd_fr_lg_grp_cd_Label);
		p.Cnd_fr_lg_grp_nm = p.beansFactory.createTextField("Cnd.fr_lg_grp_nm");
		p.Cnd_to_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.to_lg_grp_cd_Label");
		p.Cnd_to_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.to_lg_grp_cd");
		p.Cnd_to_lg_grp_cd.setLabel(p.Cnd_to_lg_grp_cd_Label);
		p.Cnd_to_lg_grp_nm = p.beansFactory.createTextField("Cnd.to_lg_grp_nm");
		p.Cnd_ship_term_cd_Label = p.beansFactory.createLabel("Cnd.ship_term_cd_Label");
		p.Cnd_ship_term_cd = p.beansFactory.createTextComboBox("Cnd.ship_term_cd");
		p.Cnd_ship_term_cd.setLabel(p.Cnd_ship_term_cd_Label);
		p.Cnd_ship_term_nm = p.beansFactory.createTextField("Cnd.ship_term_nm");
		p.Cnd_ship_wk_grp_cd_Label = p.beansFactory.createLabel("Cnd.ship_wk_grp_cd_Label");
		p.Cnd_ship_wk_grp_cd = p.beansFactory.createTextComboBox("Cnd.ship_wk_grp_cd");
		p.Cnd_ship_wk_grp_cd.setLabel(p.Cnd_ship_wk_grp_cd_Label);
		p.Cnd_ship_wk_grp_nm = p.beansFactory.createTextField("Cnd.ship_wk_grp_nm");
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
	protected static void jbfInitCtrl(MABSP_LgCtlReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk(MABSP_LgCtlReg p) {
		// ブロック関連の初期化
		p.WrkPanel = p.beansFactory.createPanel("Wrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABSP_LgCtlReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_fr_lg_grp_cd = p.beansFactory.createTableColumn("Dtl.fr_lg_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_fr_lg_grp_nm = p.beansFactory.createTableColumn("Dtl.fr_lg_grp_nm", MCColumnType.TEXT);
		p.columnDtl_to_lg_grp_cd = p.beansFactory.createTableColumn("Dtl.to_lg_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_to_lg_grp_nm = p.beansFactory.createTableColumn("Dtl.to_lg_grp_nm", MCColumnType.TEXT);
		p.columnDtl_to_lg_grp_loc_flg = p.beansFactory.createTableColumn("Dtl.to_lg_grp_loc_flg", MCColumnType.CHECK);
		p.columnDtl_ship_term_cd = p.beansFactory.createTableColumn("Dtl.ship_term_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ship_term_nm = p.beansFactory.createTableColumn("Dtl.ship_term_nm", MCColumnType.TEXT);
		p.columnDtl_xfr_lt = p.beansFactory.createTableColumn("Dtl.xfr_lt", MCColumnType.NUMBER);
		p.columnDtl_fin_cl_time_disp = p.beansFactory.createTableColumn("Dtl.fin_cl_time_disp", MCColumnType.DATE);
		p.columnDtl_fin_cl_time = p.beansFactory.createTableColumn("Dtl.fin_cl_time", MCColumnType.TEXT);
		p.columnDtl_early_ship_dt_add_days = p.beansFactory.createTableColumn("Dtl.early_ship_dt_add_days", MCColumnType.NUMBER);
		p.columnDtl_alloc_days = p.beansFactory.createTableColumn("Dtl.alloc_days", MCColumnType.NUMBER);
		p.columnDtl_iv_trd_flg = p.beansFactory.createTableColumn("Dtl.iv_trd_flg", MCColumnType.CHECK);
		p.columnDtl_def_tdlv_cd = p.beansFactory.createTableColumn("Dtl.def_tdlv_cd", MCColumnType.TEXT);
		p.columnDtl_def_tdlv_nm = p.beansFactory.createTableColumn("Dtl.def_tdlv_nm", MCColumnType.TEXT);
		p.columnDtl_ship_wk_grp_cd = p.beansFactory.createTableColumn("Dtl.ship_wk_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ship_wk_grp_nm = p.beansFactory.createTableColumn("Dtl.ship_wk_grp_nm", MCColumnType.TEXT);
		p.columnDtl_non_dmnd_lt_flg = p.beansFactory.createTableColumn("Dtl.non_dmnd_lt_flg", MCColumnType.CHECK);
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
	protected static void jbfInitDtlBtn(MABSP_LgCtlReg p) {
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
	protected static void jbfInitLclWrk(MABSP_LgCtlReg p) {
		// ブロック関連の初期化
		p.LclWrkPanel = p.beansFactory.createPanel("LclWrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLcl(MABSP_LgCtlReg p) {
		// ブロック関連の初期化
		p.LclPanel = p.beansFactory.createPanel("Lcl");
		p.LclScrollPane = p.beansFactory.createScrollPane("Lcl.scroll");
		p.createLclTable();
		// ブロックの項目の初期化
		p.columnLcl_check = p.beansFactory.createTableColumn("Lcl.check", MCColumnType.CHECK);
		p.columnLcl_del_flg = p.beansFactory.createTableColumn("Lcl.del_flg", MCColumnType.CHECK);
		p.columnLcl_fr_lg_grp_cd = p.beansFactory.createTableColumn("Lcl.fr_lg_grp_cd", MCColumnType.TEXT);
		p.columnLcl_to_lg_grp_cd = p.beansFactory.createTableColumn("Lcl.to_lg_grp_cd", MCColumnType.TEXT);
		p.columnLcl_ship_term_cd = p.beansFactory.createTableColumn("Lcl.ship_term_cd", MCColumnType.TEXT);
		p.columnLcl_day_week_typ = p.beansFactory.createTableColumn("Lcl.day_week_typ", MCColumnType.TEXT_COMBO);
		p.columnLcl_day_week_typ_nm = p.beansFactory.createTableColumn("Lcl.day_week_typ_nm", MCColumnType.TEXT);
		p.columnLcl_fin_cl_time_disp = p.beansFactory.createTableColumn("Lcl.fin_cl_time_disp", MCColumnType.DATE);
		p.columnLcl_fin_cl_time = p.beansFactory.createTableColumn("Lcl.fin_cl_time", MCColumnType.TEXT);
		p.columnLcl_no_ship_flg = p.beansFactory.createTableColumn("Lcl.no_ship_flg", MCColumnType.CHECK);
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
		p.columnLcl_del_usr_id = p.beansFactory.createTableColumn("Lcl.del_usr_id", MCColumnType.TEXT);
		p.columnLcl_del_usr_nm = p.beansFactory.createTableColumn("Lcl.del_usr_nm", MCColumnType.TEXT);
		p.columnLcl_del_ts = p.beansFactory.createTableColumn("Lcl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [LclBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclBtn(MABSP_LgCtlReg p) {
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
	protected static void jbfInitBtn(MABSP_LgCtlReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABSP_LgCtlReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABSP_LgCtlReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TopPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABSP_LgCtlReg p) {
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
	protected static void jbInitFold(MABSP_LgCtlReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABSP_LgCtlReg p) {
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
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABS.MABSP0440.CndR.ope_META);
		p.Cnd_fr_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_fr_lg_grp_cd, true);
		p.Cnd_fr_lg_grp_cd.setLinkBeans(p.Cnd_fr_lg_grp_nm);
		p.CndPanel.add(p.Cnd_fr_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_fr_lg_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_fr_lg_grp_cd);
		p.Cnd_fr_lg_grp_cd.setNextBeans(p.Cnd_fr_lg_grp_nm);
		p.Cnd_fr_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0440.CndR.fr_lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_fr_lg_grp_nm);
		p.Cnd_fr_lg_grp_nm.setNextBeans(p.Cnd_to_lg_grp_cd);
		p.Cnd_fr_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0440.CndR.fr_lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_fr_lg_grp_nm, true);
		p.Cnd_to_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_to_lg_grp_cd, true);
		p.Cnd_to_lg_grp_cd.setLinkBeans(p.Cnd_to_lg_grp_nm);
		p.CndPanel.add(p.Cnd_to_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_to_lg_grp_cd);
		p.Cnd_to_lg_grp_cd.setNextBeans(p.Cnd_to_lg_grp_nm);
		p.Cnd_to_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0440.CndR.to_lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_to_lg_grp_nm);
		p.Cnd_to_lg_grp_nm.setNextBeans(p.Cnd_ship_term_cd);
		p.Cnd_to_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0440.CndR.to_lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_to_lg_grp_nm, true);
		p.Cnd_ship_term_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_term_cd, true);
		p.Cnd_ship_term_cd.setLinkBeans(p.Cnd_ship_term_nm);
		p.CndPanel.add(p.Cnd_ship_term_cd_Label);
		p.CndPanel.add(p.Cnd_ship_term_cd);
		p.Cnd_ship_term_cd.setNextBeans(p.Cnd_ship_term_nm);
		p.Cnd_ship_term_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0440.CndR.ship_term_cd_META);
		p.CndPanel.add(p.Cnd_ship_term_nm);
		p.Cnd_ship_term_nm.setNextBeans(p.Cnd_ship_wk_grp_cd);
		p.Cnd_ship_term_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0440.CndR.ship_term_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_term_nm, true);
		p.Cnd_ship_wk_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_wk_grp_cd, true);
		p.Cnd_ship_wk_grp_cd.setLinkBeans(p.Cnd_ship_wk_grp_nm);
		p.CndPanel.add(p.Cnd_ship_wk_grp_cd_Label);
		p.CndPanel.add(p.Cnd_ship_wk_grp_cd);
		p.Cnd_ship_wk_grp_cd.setNextBeans(p.Cnd_ship_wk_grp_nm);
		p.Cnd_ship_wk_grp_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0440.CndR.ship_wk_grp_cd_META);
		p.CndPanel.add(p.Cnd_ship_wk_grp_nm);
		p.Cnd_ship_wk_grp_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_ship_wk_grp_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0440.CndR.ship_wk_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_wk_grp_nm, true);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0440.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0440.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0440.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0440.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0440.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABSP_LgCtlReg p) {
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
	protected static void jbInitWrk(MABSP_LgCtlReg p) {
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
	protected static void jbInitDtl(MABSP_LgCtlReg p) {
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
	protected static void jbInitDtlBtn(MABSP_LgCtlReg p) {
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
	protected static void jbInitLclWrk(MABSP_LgCtlReg p) {
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
	protected static void jbInitLcl(MABSP_LgCtlReg p) {
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
	protected static void jbInitLclBtn(MABSP_LgCtlReg p) {
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
	protected static void jbInitBtn(MABSP_LgCtlReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.BtnPanel.setLastBeans(p.Btn_upd);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABSP_LgCtlReg p) {
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
		MABSP_LgCtlReg_MC.mcInitScreenOpe((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.mcInitTop((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.mcInitFold((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.mcInitCnd((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.mcInitCtrl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.mcInitWrk((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.mcInitDtl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.mcInitDtlBtn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.mcInitLclWrk((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.mcInitLcl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.mcInitLclBtn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.mcInitBtn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.mcInitEastBtn((MABSP_LgCtlReg)this);

		// [UPD]ステータスのモードの設定
		MABSP_LgCtlReg_MC.statusInitUPD_ScreenOpe((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitUPD_Top((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitUPD_Fold((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitUPD_Cnd((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitUPD_Ctrl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitUPD_Wrk((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitUPD_Dtl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitUPD_DtlBtn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitUPD_LclWrk((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitUPD_Lcl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitUPD_LclAll((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitUPD_LclBtn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitUPD_Btn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitUPD_EastBtn((MABSP_LgCtlReg)this);

		// [FIX]ステータスのモードの設定
		MABSP_LgCtlReg_MC.statusInitFIX_ScreenOpe((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitFIX_Top((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitFIX_Fold((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitFIX_Cnd((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitFIX_Ctrl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitFIX_Wrk((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitFIX_Dtl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitFIX_DtlBtn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitFIX_LclWrk((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitFIX_Lcl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitFIX_LclAll((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitFIX_LclBtn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitFIX_Btn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitFIX_EastBtn((MABSP_LgCtlReg)this);

		// [DEL]ステータスのモードの設定
		MABSP_LgCtlReg_MC.statusInitDEL_ScreenOpe((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitDEL_Top((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitDEL_Fold((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitDEL_Cnd((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitDEL_Ctrl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitDEL_Wrk((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitDEL_Dtl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitDEL_DtlBtn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitDEL_LclWrk((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitDEL_Lcl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitDEL_LclAll((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitDEL_LclBtn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitDEL_Btn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitDEL_EastBtn((MABSP_LgCtlReg)this);

		// [REF]ステータスのモードの設定
		MABSP_LgCtlReg_MC.statusInitREF_ScreenOpe((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitREF_Top((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitREF_Fold((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitREF_Cnd((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitREF_Ctrl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitREF_Wrk((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitREF_Dtl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitREF_DtlBtn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitREF_LclWrk((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitREF_Lcl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitREF_LclAll((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitREF_LclBtn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitREF_Btn((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.statusInitREF_EastBtn((MABSP_LgCtlReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABSP_LgCtlReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABSP_LgCtlReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABSP_LgCtlReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABSP_LgCtlReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_fr_lg_grp_cd.setListListener(p);
		p.Cnd_fr_lg_grp_cd.addAllListener(p);
		p.Cnd_fr_lg_grp_nm.setListListener(p);
		p.Cnd_fr_lg_grp_nm.addAllListener(p);
		p.Cnd_to_lg_grp_cd.setListListener(p);
		p.Cnd_to_lg_grp_cd.addAllListener(p);
		p.Cnd_to_lg_grp_nm.setListListener(p);
		p.Cnd_to_lg_grp_nm.addAllListener(p);
		p.Cnd_ship_term_cd.setListListener(p);
		p.Cnd_ship_term_cd.addAllListener(p);
		p.Cnd_ship_term_nm.setListListener(p);
		p.Cnd_ship_term_nm.addAllListener(p);
		p.Cnd_ship_wk_grp_cd.setListListener(p);
		p.Cnd_ship_wk_grp_cd.addAllListener(p);
		p.Cnd_ship_wk_grp_nm.setListListener(p);
		p.Cnd_ship_wk_grp_nm.addAllListener(p);
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
	protected static void mcInitCtrl(MABSP_LgCtlReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Wrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk(MABSP_LgCtlReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABSP_LgCtlReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_fr_lg_grp_cd.addAllListener(p);
		p.columnDtl_fr_lg_grp_cd.setListListener(p);
		p.columnDtl_fr_lg_grp_nm.addAllListener(p);
		p.columnDtl_fr_lg_grp_nm.setListListener(p);
		p.columnDtl_to_lg_grp_cd.addAllListener(p);
		p.columnDtl_to_lg_grp_cd.setListListener(p);
		p.columnDtl_to_lg_grp_nm.addAllListener(p);
		p.columnDtl_to_lg_grp_nm.setListListener(p);
		p.columnDtl_to_lg_grp_loc_flg.addAllListener(p);
		p.columnDtl_ship_term_cd.addAllListener(p);
		p.columnDtl_ship_term_cd.setListListener(p);
		p.columnDtl_ship_term_nm.addAllListener(p);
		p.columnDtl_ship_term_nm.setListListener(p);
		p.columnDtl_xfr_lt.addAllListener(p);
		p.columnDtl_xfr_lt.setListListener(p);
		p.columnDtl_fin_cl_time_disp.addAllListener(p);
		p.columnDtl_fin_cl_time_disp.setListListener(p);
		p.columnDtl_fin_cl_time.addAllListener(p);
		p.columnDtl_fin_cl_time.setListListener(p);
		p.columnDtl_early_ship_dt_add_days.addAllListener(p);
		p.columnDtl_early_ship_dt_add_days.setListListener(p);
		p.columnDtl_alloc_days.addAllListener(p);
		p.columnDtl_alloc_days.setListListener(p);
		p.columnDtl_iv_trd_flg.addAllListener(p);
		p.columnDtl_def_tdlv_cd.addAllListener(p);
		p.columnDtl_def_tdlv_cd.setListListener(p);
		p.columnDtl_def_tdlv_nm.addAllListener(p);
		p.columnDtl_def_tdlv_nm.setListListener(p);
		p.columnDtl_ship_wk_grp_cd.addAllListener(p);
		p.columnDtl_ship_wk_grp_cd.setListListener(p);
		p.columnDtl_ship_wk_grp_nm.addAllListener(p);
		p.columnDtl_ship_wk_grp_nm.setListListener(p);
		p.columnDtl_non_dmnd_lt_flg.addAllListener(p);
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
	protected static void mcInitDtlBtn(MABSP_LgCtlReg p) {
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
	protected static void mcInitLclWrk(MABSP_LgCtlReg p) {
	}

	/**
	 *  [Lcl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLcl(MABSP_LgCtlReg p) {
		p.LclTable.addAllListener(p);
		p.columnLcl_check.addAllListener(p);
		p.columnLcl_del_flg.addAllListener(p);
		p.columnLcl_fr_lg_grp_cd.addAllListener(p);
		p.columnLcl_fr_lg_grp_cd.setListListener(p);
		p.columnLcl_to_lg_grp_cd.addAllListener(p);
		p.columnLcl_to_lg_grp_cd.setListListener(p);
		p.columnLcl_ship_term_cd.addAllListener(p);
		p.columnLcl_ship_term_cd.setListListener(p);
		p.columnLcl_day_week_typ.addAllListener(p);
		p.columnLcl_day_week_typ.setListListener(p);
		p.columnLcl_day_week_typ_nm.addAllListener(p);
		p.columnLcl_day_week_typ_nm.setListListener(p);
		p.columnLcl_fin_cl_time_disp.addAllListener(p);
		p.columnLcl_fin_cl_time_disp.setListListener(p);
		p.columnLcl_fin_cl_time.addAllListener(p);
		p.columnLcl_fin_cl_time.setListListener(p);
		p.columnLcl_no_ship_flg.addAllListener(p);
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
		p.columnLcl_del_usr_id.addAllListener(p);
		p.columnLcl_del_usr_id.setListListener(p);
		p.columnLcl_del_usr_nm.addAllListener(p);
		p.columnLcl_del_usr_nm.setListListener(p);
		p.columnLcl_del_ts.addAllListener(p);
		p.columnLcl_del_ts.setListListener(p);
	}

	/**
	 *  [LclBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclBtn(MABSP_LgCtlReg p) {
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
	protected static void mcInitBtn(MABSP_LgCtlReg p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABSP_LgCtlReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABSP_LgCtlReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABSP_LgCtlReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABSP_LgCtlReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABSP_LgCtlReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_fr_lg_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_fr_lg_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_to_lg_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_to_lg_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_term_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_wk_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_wk_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABSP_LgCtlReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk(MABSP_LgCtlReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABSP_LgCtlReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_fr_lg_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_fr_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_to_lg_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_to_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_to_lg_grp_loc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_term_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ship_term_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_xfr_lt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_fin_cl_time_disp.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_fin_cl_time.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_early_ship_dt_add_days.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_alloc_days.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_iv_trd_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_def_tdlv_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_def_tdlv_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ship_wk_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_non_dmnd_lt_flg.putMode(p, UPD, MCMode.ENABLE);
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
	protected static void statusInitUPD_DtlBtn(MABSP_LgCtlReg p){
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclWrk(MABSP_LgCtlReg p){

	}

	/**
	 * [UPD]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Lcl(MABSP_LgCtlReg p){
		p.columnLcl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_fr_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_to_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_ship_term_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_day_week_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_day_week_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_fin_cl_time_disp.putMode(p, UPD, MCMode.ENABLE);
		p.columnLcl_fin_cl_time.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_no_ship_flg.putMode(p, UPD, MCMode.ENABLE);
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
		p.columnLcl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclAll(MABSP_LgCtlReg p){

	}

	/**
	 * [UPD]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclBtn(MABSP_LgCtlReg p){
		p.LclBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABSP_LgCtlReg p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABSP_LgCtlReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABSP_LgCtlReg p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABSP_LgCtlReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABSP_LgCtlReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABSP_LgCtlReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_fr_lg_grp_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_fr_lg_grp_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_to_lg_grp_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_to_lg_grp_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ship_term_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ship_wk_grp_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ship_wk_grp_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABSP_LgCtlReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk(MABSP_LgCtlReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABSP_LgCtlReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_fr_lg_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_fr_lg_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_to_lg_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_to_lg_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_to_lg_grp_loc_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ship_term_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_term_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_xfr_lt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_fin_cl_time_disp.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_fin_cl_time.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_early_ship_dt_add_days.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alloc_days.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_iv_trd_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_tdlv_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_def_tdlv_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_non_dmnd_lt_flg.putMode(p, FIX, MCMode.READ_ONLY);
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
	protected static void statusInitFIX_DtlBtn(MABSP_LgCtlReg p){
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclWrk(MABSP_LgCtlReg p){

	}

	/**
	 * [FIX]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Lcl(MABSP_LgCtlReg p){
		p.columnLcl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_fr_lg_grp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_to_lg_grp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_ship_term_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_day_week_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_day_week_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_fin_cl_time_disp.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_fin_cl_time.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_no_ship_flg.putMode(p, FIX, MCMode.READ_ONLY);
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
		p.columnLcl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclAll(MABSP_LgCtlReg p){

	}

	/**
	 * [FIX]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclBtn(MABSP_LgCtlReg p){
		p.LclBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABSP_LgCtlReg p){
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABSP_LgCtlReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABSP_LgCtlReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABSP_LgCtlReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABSP_LgCtlReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABSP_LgCtlReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_fr_lg_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_fr_lg_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_to_lg_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_to_lg_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_term_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_wk_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_wk_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABSP_LgCtlReg p){

	}

	/**
	 * [DEL]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Wrk(MABSP_LgCtlReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABSP_LgCtlReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fr_lg_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fr_lg_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_to_lg_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_to_lg_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_to_lg_grp_loc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_term_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_term_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_xfr_lt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fin_cl_time_disp.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fin_cl_time.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_early_ship_dt_add_days.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alloc_days.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_iv_trd_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_tdlv_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_def_tdlv_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_non_dmnd_lt_flg.putMode(p, DEL, MCMode.READ_ONLY);
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
	protected static void statusInitDEL_DtlBtn(MABSP_LgCtlReg p){
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclWrk(MABSP_LgCtlReg p){

	}

	/**
	 * [DEL]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Lcl(MABSP_LgCtlReg p){
		p.columnLcl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_fr_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_to_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_ship_term_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_day_week_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_day_week_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_fin_cl_time_disp.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_fin_cl_time.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_no_ship_flg.putMode(p, DEL, MCMode.READ_ONLY);
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
		p.columnLcl_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclAll(MABSP_LgCtlReg p){

	}

	/**
	 * [DEL]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclBtn(MABSP_LgCtlReg p){
		p.LclBtn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABSP_LgCtlReg p){
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABSP_LgCtlReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABSP_LgCtlReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABSP_LgCtlReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABSP_LgCtlReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABSP_LgCtlReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_fr_lg_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_fr_lg_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_to_lg_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_to_lg_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_term_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_term_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_wk_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_wk_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABSP_LgCtlReg p){

	}

	/**
	 * [REF]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk(MABSP_LgCtlReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABSP_LgCtlReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fr_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fr_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_to_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_to_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_to_lg_grp_loc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_term_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_term_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_xfr_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fin_cl_time_disp.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fin_cl_time.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_early_ship_dt_add_days.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alloc_days.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_iv_trd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_tdlv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_def_tdlv_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_non_dmnd_lt_flg.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_DtlBtn(MABSP_LgCtlReg p){
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclWrk(MABSP_LgCtlReg p){

	}

	/**
	 * [REF]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Lcl(MABSP_LgCtlReg p){
		p.columnLcl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_fr_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_to_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_ship_term_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_day_week_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_day_week_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_fin_cl_time_disp.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_fin_cl_time.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_no_ship_flg.putMode(p, REF, MCMode.READ_ONLY);
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
		p.columnLcl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclAll(MABSP_LgCtlReg p){

	}

	/**
	 * [REF]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclBtn(MABSP_LgCtlReg p){
		p.LclBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABSP_LgCtlReg p){
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABSP_LgCtlReg p){

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
		MABSP_LgCtlReg_MC.setTableConfigDtl((MABSP_LgCtlReg)this);
		MABSP_LgCtlReg_MC.setTableConfigLcl((MABSP_LgCtlReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABSP_LgCtlReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABS.MABSP0440.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABS.MABSP0440.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_fr_lg_grp_cd.setMeta(mcframe.clientMABS.MABSP0440.DtlR.fr_lg_grp_cd_META);
		p.columnDtl_fr_lg_grp_cd.addLinkBeans(p.columnDtl_fr_lg_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_fr_lg_grp_cd);
		p.columnDtl_fr_lg_grp_nm.setMeta(mcframe.clientMABS.MABSP0440.DtlR.fr_lg_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fr_lg_grp_nm);
		p.columnDtl_to_lg_grp_cd.setMeta(mcframe.clientMABS.MABSP0440.DtlR.to_lg_grp_cd_META);
		p.columnDtl_to_lg_grp_cd.addLinkBeans(p.columnDtl_to_lg_grp_nm,p.columnDtl_to_lg_grp_loc_flg);
		p.DtlTable.addColumnConfig(p.columnDtl_to_lg_grp_cd);
		p.columnDtl_to_lg_grp_nm.setMeta(mcframe.clientMABS.MABSP0440.DtlR.to_lg_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_to_lg_grp_nm);
		p.columnDtl_to_lg_grp_loc_flg.setMeta(mcframe.clientMABS.MABSP0440.DtlR.to_lg_grp_loc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_to_lg_grp_loc_flg);
		p.columnDtl_ship_term_cd.setMeta(mcframe.clientMABS.MABSP0440.DtlR.ship_term_cd_META);
		p.columnDtl_ship_term_cd.addLinkBeans(p.columnDtl_ship_term_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_term_cd);
		p.columnDtl_ship_term_nm.setMeta(mcframe.clientMABS.MABSP0440.DtlR.ship_term_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_term_nm);
		p.columnDtl_xfr_lt.setMeta(mcframe.clientMABS.MABSP0440.DtlR.xfr_lt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xfr_lt);
		p.columnDtl_fin_cl_time_disp.setMeta(mcframe.clientMABS.MABSP0440.DtlR.fin_cl_time_disp_META);
		p.columnDtl_fin_cl_time_disp.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_fin_cl_time_disp);
		p.columnDtl_fin_cl_time.setMeta(mcframe.clientMABS.MABSP0440.DtlR.fin_cl_time_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fin_cl_time);
		p.columnDtl_early_ship_dt_add_days.setMeta(mcframe.clientMABS.MABSP0440.DtlR.early_ship_dt_add_days_META);
		p.DtlTable.addColumnConfig(p.columnDtl_early_ship_dt_add_days);
		p.columnDtl_alloc_days.setMeta(mcframe.clientMABS.MABSP0440.DtlR.alloc_days_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alloc_days);
		p.columnDtl_iv_trd_flg.setMeta(mcframe.clientMABS.MABSP0440.DtlR.iv_trd_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_trd_flg);
		p.columnDtl_def_tdlv_cd.setMeta(mcframe.clientMABS.MABSP0440.DtlR.def_tdlv_cd_META);
		p.columnDtl_def_tdlv_cd.setListType(MCListType.STRICT);
		p.columnDtl_def_tdlv_cd.addLinkBeans(p.columnDtl_def_tdlv_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_def_tdlv_cd);
		p.columnDtl_def_tdlv_nm.setMeta(mcframe.clientMABS.MABSP0440.DtlR.def_tdlv_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_tdlv_nm);
		p.columnDtl_ship_wk_grp_cd.setMeta(mcframe.clientMABS.MABSP0440.DtlR.ship_wk_grp_cd_META);
		p.columnDtl_ship_wk_grp_cd.addLinkBeans(p.columnDtl_ship_wk_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_wk_grp_cd);
		p.columnDtl_ship_wk_grp_nm.setMeta(mcframe.clientMABS.MABSP0440.DtlR.ship_wk_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_wk_grp_nm);
		p.columnDtl_non_dmnd_lt_flg.setMeta(mcframe.clientMABS.MABSP0440.DtlR.non_dmnd_lt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_non_dmnd_lt_flg);
		p.columnDtl_memo1.setMeta(mcframe.clientMABS.MABSP0440.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABS.MABSP0440.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABS.MABSP0440.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0440.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0440.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABS.MABSP0440.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0440.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0440.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP0440.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0440.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0440.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABS.MABSP0440.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0440.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0440.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0440.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP0440.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP0440.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABS.MABSP0440.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * [Lcl]ブロックのTableの設定
	 */
	protected static void setTableConfigLcl(MABSP_LgCtlReg p) {
		p.columnLcl_check.setMeta(mcframe.clientMABS.MABSP0440.LclR.check_META);
		p.LclTable.addColumnConfig(p.columnLcl_check);
		p.columnLcl_del_flg.setMeta(mcframe.clientMABS.MABSP0440.LclR.del_flg_META);
		p.LclTable.addColumnConfig(p.columnLcl_del_flg);
		p.columnLcl_fr_lg_grp_cd.setMeta(mcframe.clientMABS.MABSP0440.LclR.fr_lg_grp_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_fr_lg_grp_cd);
		p.columnLcl_to_lg_grp_cd.setMeta(mcframe.clientMABS.MABSP0440.LclR.to_lg_grp_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_to_lg_grp_cd);
		p.columnLcl_ship_term_cd.setMeta(mcframe.clientMABS.MABSP0440.LclR.ship_term_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_ship_term_cd);
		p.columnLcl_day_week_typ.setMeta(mcframe.clientMABS.MABSP0440.LclR.day_week_typ_META);
		p.columnLcl_day_week_typ.addLinkBeans(p.columnLcl_day_week_typ_nm);
		p.LclTable.addColumnConfig(p.columnLcl_day_week_typ);
		p.columnLcl_day_week_typ_nm.setMeta(mcframe.clientMABS.MABSP0440.LclR.day_week_typ_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_day_week_typ_nm);
		p.columnLcl_fin_cl_time_disp.setMeta(mcframe.clientMABS.MABSP0440.LclR.fin_cl_time_disp_META);
		p.columnLcl_fin_cl_time_disp.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_fin_cl_time_disp);
		p.columnLcl_fin_cl_time.setMeta(mcframe.clientMABS.MABSP0440.LclR.fin_cl_time_META);
		p.LclTable.addColumnConfig(p.columnLcl_fin_cl_time);
		p.columnLcl_no_ship_flg.setMeta(mcframe.clientMABS.MABSP0440.LclR.no_ship_flg_META);
		p.LclTable.addColumnConfig(p.columnLcl_no_ship_flg);
		p.columnLcl_memo1.setMeta(mcframe.clientMABS.MABSP0440.LclR.memo1_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo1);
		p.columnLcl_memo2.setMeta(mcframe.clientMABS.MABSP0440.LclR.memo2_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo2);
		p.columnLcl_memo3.setMeta(mcframe.clientMABS.MABSP0440.LclR.memo3_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo3);
		p.columnLcl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0440.LclR.ins_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_id);
		p.columnLcl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0440.LclR.ins_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_nm);
		p.columnLcl_ins_ts.setMeta(mcframe.clientMABS.MABSP0440.LclR.ins_ts_META);
		p.columnLcl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_ins_ts);
		p.columnLcl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0440.LclR.ins_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_id);
		p.columnLcl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0440.LclR.ins_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_nm);
		p.columnLcl_upd_cntr.setMeta(mcframe.clientMABS.MABSP0440.LclR.upd_cntr_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_cntr);
		p.columnLcl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0440.LclR.upd_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_id);
		p.columnLcl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0440.LclR.upd_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_nm);
		p.columnLcl_upd_ts.setMeta(mcframe.clientMABS.MABSP0440.LclR.upd_ts_META);
		p.columnLcl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_upd_ts);
		p.columnLcl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0440.LclR.upd_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_id);
		p.columnLcl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0440.LclR.upd_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_nm);
		p.columnLcl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0440.LclR.upd_srv_req_no_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_srv_req_no);
		p.columnLcl_del_usr_id.setMeta(mcframe.clientMABS.MABSP0440.LclR.del_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_del_usr_id);
		p.columnLcl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP0440.LclR.del_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_del_usr_nm);
		p.columnLcl_del_ts.setMeta(mcframe.clientMABS.MABSP0440.LclR.del_ts_META);
		p.columnLcl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_del_ts);
		// スクロール固定カラムの指定
		p.LclTable.setUnscrollColumn(p.columnLcl_del_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_fr_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_fr_lg_grp_cd.getListConfig().setPutter(getCnd_fr_lg_grp_cd_ListPutter());
		Cnd_to_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_to_lg_grp_cd.getListConfig().setPutter(getCnd_to_lg_grp_cd_ListPutter());
		Cnd_ship_term_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_term_cd.getListConfig().setPutter(getCnd_ship_term_cd_ListPutter());
		Cnd_ship_wk_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_wk_grp_cd.getListConfig().setPutter(getCnd_ship_wk_grp_cd_ListPutter());
		columnDtl_fr_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_fr_lg_grp_cd.getListConfig().setPutter(getDtl_fr_lg_grp_cd_ListPutter());
		columnDtl_to_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_to_lg_grp_cd.getListConfig().setPutter(getDtl_to_lg_grp_cd_ListPutter());
		columnDtl_ship_term_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ship_term_cd.getListConfig().setPutter(getDtl_ship_term_cd_ListPutter());
		columnDtl_def_tdlv_cd.getListConfig().setPutter(getDtl_def_tdlv_cd_ListPutter());
		columnDtl_ship_wk_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ship_wk_grp_cd.getListConfig().setPutter(getDtl_ship_wk_grp_cd_ListPutter());
		columnLcl_day_week_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnLcl_day_week_typ.getListConfig().setPutter(getLcl_day_week_typ_ListPutter());
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
	 * [Cnd_fr_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_fr_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrpForLoc");
		return lp;
	}
	 
	/**
	 * [Cnd_to_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_to_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_ship_term_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_term_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipTerm");
		return lp;
	}
	 
	/**
	 * [Cnd_ship_wk_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_wk_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipWkGrp");
		return lp;
	}
	 
	/**
	 * [Dtl_fr_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_fr_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrpForLoc");
		return lp;
	}
	 
	/**
	 * [Dtl_to_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_to_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrp");
		return lp;
	}
	 
	/**
	 * [Dtl_ship_term_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ship_term_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipTerm");
		return lp;
	}
	 
	/**
	 * [Dtl_def_tdlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_def_tdlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl_ship_wk_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ship_wk_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipWkGrp");
		return lp;
	}
	 
	/**
	 * [Lcl_day_week_typ_ListPutter]の作成
	 */
	protected MCListPutter createLcl_day_week_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DayWeekTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_fr_lg_grp_cd) return getCnd_fr_lg_grp_cd(row, info);
		if(combo == Cnd_to_lg_grp_cd) return getCnd_to_lg_grp_cd(row, info);
		if(combo == Cnd_ship_term_cd) return getCnd_ship_term_cd(row, info);
		if(combo == Cnd_ship_wk_grp_cd) return getCnd_ship_wk_grp_cd(row, info);
		if(combo == columnDtl_fr_lg_grp_cd) return getDtl_fr_lg_grp_cd(row, info);
		if(combo == columnDtl_to_lg_grp_cd) return getDtl_to_lg_grp_cd(row, info);
		if(combo == columnDtl_ship_term_cd) return getDtl_ship_term_cd(row, info);
		if(combo == columnDtl_def_tdlv_cd) return getDtl_def_tdlv_cd(row, info);
		if(combo == columnDtl_ship_wk_grp_cd) return getDtl_ship_wk_grp_cd(row, info);
		if(combo == columnLcl_day_week_typ) return getLcl_day_week_typ(row, info);
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
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_fr_lg_grp_cd) return doCnd_fr_lg_grp_cd_VC(info);
		if (vc == Cnd_fr_lg_grp_nm) return doCnd_fr_lg_grp_nm_VC(info);
		if (vc == Cnd_to_lg_grp_cd) return doCnd_to_lg_grp_cd_VC(info);
		if (vc == Cnd_to_lg_grp_nm) return doCnd_to_lg_grp_nm_VC(info);
		if (vc == Cnd_ship_term_cd) return doCnd_ship_term_cd_VC(info);
		if (vc == Cnd_ship_term_nm) return doCnd_ship_term_nm_VC(info);
		if (vc == Cnd_ship_wk_grp_cd) return doCnd_ship_wk_grp_cd_VC(info);
		if (vc == Cnd_ship_wk_grp_nm) return doCnd_ship_wk_grp_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_fr_lg_grp_cd) return doDtl_fr_lg_grp_cd_VC(info);
		if (vc == columnDtl_fr_lg_grp_nm) return doDtl_fr_lg_grp_nm_VC(info);
		if (vc == columnDtl_to_lg_grp_cd) return doDtl_to_lg_grp_cd_VC(info);
		if (vc == columnDtl_to_lg_grp_nm) return doDtl_to_lg_grp_nm_VC(info);
		if (vc == columnDtl_to_lg_grp_loc_flg) return doDtl_to_lg_grp_loc_flg_VC(info);
		if (vc == columnDtl_ship_term_cd) return doDtl_ship_term_cd_VC(info);
		if (vc == columnDtl_ship_term_nm) return doDtl_ship_term_nm_VC(info);
		if (vc == columnDtl_xfr_lt) return doDtl_xfr_lt_VC(info);
		if (vc == columnDtl_fin_cl_time_disp) return doDtl_fin_cl_time_disp_VC(info);
		if (vc == columnDtl_fin_cl_time) return doDtl_fin_cl_time_VC(info);
		if (vc == columnDtl_early_ship_dt_add_days) return doDtl_early_ship_dt_add_days_VC(info);
		if (vc == columnDtl_alloc_days) return doDtl_alloc_days_VC(info);
		if (vc == columnDtl_iv_trd_flg) return doDtl_iv_trd_flg_VC(info);
		if (vc == columnDtl_def_tdlv_cd) return doDtl_def_tdlv_cd_VC(info);
		if (vc == columnDtl_def_tdlv_nm) return doDtl_def_tdlv_nm_VC(info);
		if (vc == columnDtl_ship_wk_grp_cd) return doDtl_ship_wk_grp_cd_VC(info);
		if (vc == columnDtl_ship_wk_grp_nm) return doDtl_ship_wk_grp_nm_VC(info);
		if (vc == columnDtl_non_dmnd_lt_flg) return doDtl_non_dmnd_lt_flg_VC(info);
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
		if (vc == columnLcl_del_flg) return doLcl_del_flg_VC(info);
		if (vc == columnLcl_fr_lg_grp_cd) return doLcl_fr_lg_grp_cd_VC(info);
		if (vc == columnLcl_to_lg_grp_cd) return doLcl_to_lg_grp_cd_VC(info);
		if (vc == columnLcl_ship_term_cd) return doLcl_ship_term_cd_VC(info);
		if (vc == columnLcl_day_week_typ) return doLcl_day_week_typ_VC(info);
		if (vc == columnLcl_day_week_typ_nm) return doLcl_day_week_typ_nm_VC(info);
		if (vc == columnLcl_fin_cl_time_disp) return doLcl_fin_cl_time_disp_VC(info);
		if (vc == columnLcl_fin_cl_time) return doLcl_fin_cl_time_VC(info);
		if (vc == columnLcl_no_ship_flg) return doLcl_no_ship_flg_VC(info);
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
		if (vc == columnLcl_del_usr_id) return doLcl_del_usr_id_VC(info);
		if (vc == columnLcl_del_usr_nm) return doLcl_del_usr_nm_VC(info);
		if (vc == columnLcl_del_ts) return doLcl_del_ts_VC(info);
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
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fr_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fr_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fr_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[to_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_to_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[to_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_to_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_term_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_term_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_term_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_term_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_wk_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_wk_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_wk_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_wk_grp_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[fr_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fr_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fr_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[to_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_to_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[to_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_to_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[to_lg_grp_loc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_to_lg_grp_loc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_term_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_term_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_term_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_term_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xfr_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xfr_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fin_cl_time_disp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fin_cl_time_disp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fin_cl_time]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fin_cl_time_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[early_ship_dt_add_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_early_ship_dt_add_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alloc_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alloc_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_trd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_trd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_tdlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_tdlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_tdlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_tdlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_wk_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_wk_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_wk_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_wk_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[non_dmnd_lt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_non_dmnd_lt_flg_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[fr_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_fr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[to_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_to_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ship_term_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ship_term_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[day_week_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_day_week_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[day_week_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_day_week_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[fin_cl_time_disp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_fin_cl_time_disp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[fin_cl_time]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_fin_cl_time_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[no_ship_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_no_ship_flg_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_del_ts_VC(MCEventInfo info){
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
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_fr_lg_grp_cd) doCnd_fr_lg_grp_cd_NC(info);
		else if (nc == Cnd_fr_lg_grp_nm) doCnd_fr_lg_grp_nm_NC(info);
		else if (nc == Cnd_to_lg_grp_cd) doCnd_to_lg_grp_cd_NC(info);
		else if (nc == Cnd_to_lg_grp_nm) doCnd_to_lg_grp_nm_NC(info);
		else if (nc == Cnd_ship_term_cd) doCnd_ship_term_cd_NC(info);
		else if (nc == Cnd_ship_term_nm) doCnd_ship_term_nm_NC(info);
		else if (nc == Cnd_ship_wk_grp_cd) doCnd_ship_wk_grp_cd_NC(info);
		else if (nc == Cnd_ship_wk_grp_nm) doCnd_ship_wk_grp_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_fr_lg_grp_cd) doDtl_fr_lg_grp_cd_NC(info);
		else if (nc == columnDtl_fr_lg_grp_nm) doDtl_fr_lg_grp_nm_NC(info);
		else if (nc == columnDtl_to_lg_grp_cd) doDtl_to_lg_grp_cd_NC(info);
		else if (nc == columnDtl_to_lg_grp_nm) doDtl_to_lg_grp_nm_NC(info);
		else if (nc == columnDtl_to_lg_grp_loc_flg) doDtl_to_lg_grp_loc_flg_NC(info);
		else if (nc == columnDtl_ship_term_cd) doDtl_ship_term_cd_NC(info);
		else if (nc == columnDtl_ship_term_nm) doDtl_ship_term_nm_NC(info);
		else if (nc == columnDtl_xfr_lt) doDtl_xfr_lt_NC(info);
		else if (nc == columnDtl_fin_cl_time_disp) doDtl_fin_cl_time_disp_NC(info);
		else if (nc == columnDtl_fin_cl_time) doDtl_fin_cl_time_NC(info);
		else if (nc == columnDtl_early_ship_dt_add_days) doDtl_early_ship_dt_add_days_NC(info);
		else if (nc == columnDtl_alloc_days) doDtl_alloc_days_NC(info);
		else if (nc == columnDtl_iv_trd_flg) doDtl_iv_trd_flg_NC(info);
		else if (nc == columnDtl_def_tdlv_cd) doDtl_def_tdlv_cd_NC(info);
		else if (nc == columnDtl_def_tdlv_nm) doDtl_def_tdlv_nm_NC(info);
		else if (nc == columnDtl_ship_wk_grp_cd) doDtl_ship_wk_grp_cd_NC(info);
		else if (nc == columnDtl_ship_wk_grp_nm) doDtl_ship_wk_grp_nm_NC(info);
		else if (nc == columnDtl_non_dmnd_lt_flg) doDtl_non_dmnd_lt_flg_NC(info);
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
		else if (nc == columnLcl_del_flg) doLcl_del_flg_NC(info);
		else if (nc == columnLcl_fr_lg_grp_cd) doLcl_fr_lg_grp_cd_NC(info);
		else if (nc == columnLcl_to_lg_grp_cd) doLcl_to_lg_grp_cd_NC(info);
		else if (nc == columnLcl_ship_term_cd) doLcl_ship_term_cd_NC(info);
		else if (nc == columnLcl_day_week_typ) doLcl_day_week_typ_NC(info);
		else if (nc == columnLcl_day_week_typ_nm) doLcl_day_week_typ_nm_NC(info);
		else if (nc == columnLcl_fin_cl_time_disp) doLcl_fin_cl_time_disp_NC(info);
		else if (nc == columnLcl_fin_cl_time) doLcl_fin_cl_time_NC(info);
		else if (nc == columnLcl_no_ship_flg) doLcl_no_ship_flg_NC(info);
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
		else if (nc == columnLcl_del_usr_id) doLcl_del_usr_id_NC(info);
		else if (nc == columnLcl_del_usr_nm) doLcl_del_usr_nm_NC(info);
		else if (nc == columnLcl_del_ts) doLcl_del_ts_NC(info);
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
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fr_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fr_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fr_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[to_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_to_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[to_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_to_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_term_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_term_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_grp_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[fr_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fr_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fr_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[to_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_to_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[to_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_to_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[to_lg_grp_loc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_to_lg_grp_loc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_term_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_term_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_term_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_term_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_lt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fin_cl_time_disp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fin_cl_time_disp_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fin_cl_time]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fin_cl_time_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[early_ship_dt_add_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_early_ship_dt_add_days_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_days_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_trd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_trd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_tdlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_tdlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_tdlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_tdlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_dmnd_lt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_dmnd_lt_flg_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[fr_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_fr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[to_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_to_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ship_term_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ship_term_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[day_week_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_day_week_typ_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[day_week_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_day_week_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[fin_cl_time_disp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_fin_cl_time_disp_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[fin_cl_time]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_fin_cl_time_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[no_ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_no_ship_flg_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_del_ts_NC(MCEventInfo info){
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
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_fr_lg_grp_cd) doCnd_fr_lg_grp_cd_NE(info);
		else if (ne == Cnd_fr_lg_grp_nm) doCnd_fr_lg_grp_nm_NE(info);
		else if (ne == Cnd_to_lg_grp_cd) doCnd_to_lg_grp_cd_NE(info);
		else if (ne == Cnd_to_lg_grp_nm) doCnd_to_lg_grp_nm_NE(info);
		else if (ne == Cnd_ship_term_cd) doCnd_ship_term_cd_NE(info);
		else if (ne == Cnd_ship_term_nm) doCnd_ship_term_nm_NE(info);
		else if (ne == Cnd_ship_wk_grp_cd) doCnd_ship_wk_grp_cd_NE(info);
		else if (ne == Cnd_ship_wk_grp_nm) doCnd_ship_wk_grp_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_fr_lg_grp_cd) doDtl_fr_lg_grp_cd_NE(info);
		else if (ne == columnDtl_fr_lg_grp_nm) doDtl_fr_lg_grp_nm_NE(info);
		else if (ne == columnDtl_to_lg_grp_cd) doDtl_to_lg_grp_cd_NE(info);
		else if (ne == columnDtl_to_lg_grp_nm) doDtl_to_lg_grp_nm_NE(info);
		else if (ne == columnDtl_to_lg_grp_loc_flg) doDtl_to_lg_grp_loc_flg_NE(info);
		else if (ne == columnDtl_ship_term_cd) doDtl_ship_term_cd_NE(info);
		else if (ne == columnDtl_ship_term_nm) doDtl_ship_term_nm_NE(info);
		else if (ne == columnDtl_xfr_lt) doDtl_xfr_lt_NE(info);
		else if (ne == columnDtl_fin_cl_time_disp) doDtl_fin_cl_time_disp_NE(info);
		else if (ne == columnDtl_fin_cl_time) doDtl_fin_cl_time_NE(info);
		else if (ne == columnDtl_early_ship_dt_add_days) doDtl_early_ship_dt_add_days_NE(info);
		else if (ne == columnDtl_alloc_days) doDtl_alloc_days_NE(info);
		else if (ne == columnDtl_iv_trd_flg) doDtl_iv_trd_flg_NE(info);
		else if (ne == columnDtl_def_tdlv_cd) doDtl_def_tdlv_cd_NE(info);
		else if (ne == columnDtl_def_tdlv_nm) doDtl_def_tdlv_nm_NE(info);
		else if (ne == columnDtl_ship_wk_grp_cd) doDtl_ship_wk_grp_cd_NE(info);
		else if (ne == columnDtl_ship_wk_grp_nm) doDtl_ship_wk_grp_nm_NE(info);
		else if (ne == columnDtl_non_dmnd_lt_flg) doDtl_non_dmnd_lt_flg_NE(info);
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
		else if (ne == columnLcl_del_flg) doLcl_del_flg_NE(info);
		else if (ne == columnLcl_fr_lg_grp_cd) doLcl_fr_lg_grp_cd_NE(info);
		else if (ne == columnLcl_to_lg_grp_cd) doLcl_to_lg_grp_cd_NE(info);
		else if (ne == columnLcl_ship_term_cd) doLcl_ship_term_cd_NE(info);
		else if (ne == columnLcl_day_week_typ) doLcl_day_week_typ_NE(info);
		else if (ne == columnLcl_day_week_typ_nm) doLcl_day_week_typ_nm_NE(info);
		else if (ne == columnLcl_fin_cl_time_disp) doLcl_fin_cl_time_disp_NE(info);
		else if (ne == columnLcl_fin_cl_time) doLcl_fin_cl_time_NE(info);
		else if (ne == columnLcl_no_ship_flg) doLcl_no_ship_flg_NE(info);
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
		else if (ne == columnLcl_del_usr_id) doLcl_del_usr_id_NE(info);
		else if (ne == columnLcl_del_usr_nm) doLcl_del_usr_nm_NE(info);
		else if (ne == columnLcl_del_ts) doLcl_del_ts_NE(info);
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
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fr_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fr_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fr_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[to_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_to_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[to_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_to_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_term_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_term_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_grp_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[fr_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fr_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fr_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[to_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_to_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[to_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_to_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[to_lg_grp_loc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_to_lg_grp_loc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_term_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_term_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_term_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_term_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_lt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fin_cl_time_disp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fin_cl_time_disp_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fin_cl_time]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fin_cl_time_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[early_ship_dt_add_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_early_ship_dt_add_days_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_days_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_trd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_trd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_tdlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_tdlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_tdlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_tdlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_dmnd_lt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_dmnd_lt_flg_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[fr_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_fr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[to_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_to_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ship_term_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ship_term_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[day_week_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_day_week_typ_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[day_week_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_day_week_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[fin_cl_time_disp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_fin_cl_time_disp_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[fin_cl_time]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_fin_cl_time_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[no_ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_no_ship_flg_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_del_ts_NE(MCEventInfo info){
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
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_fr_lg_grp_cd) doCnd_fr_lg_grp_cd_NX(info);
		else if (nx == Cnd_fr_lg_grp_nm) doCnd_fr_lg_grp_nm_NX(info);
		else if (nx == Cnd_to_lg_grp_cd) doCnd_to_lg_grp_cd_NX(info);
		else if (nx == Cnd_to_lg_grp_nm) doCnd_to_lg_grp_nm_NX(info);
		else if (nx == Cnd_ship_term_cd) doCnd_ship_term_cd_NX(info);
		else if (nx == Cnd_ship_term_nm) doCnd_ship_term_nm_NX(info);
		else if (nx == Cnd_ship_wk_grp_cd) doCnd_ship_wk_grp_cd_NX(info);
		else if (nx == Cnd_ship_wk_grp_nm) doCnd_ship_wk_grp_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_fr_lg_grp_cd) doDtl_fr_lg_grp_cd_NX(info);
		else if (nx == columnDtl_fr_lg_grp_nm) doDtl_fr_lg_grp_nm_NX(info);
		else if (nx == columnDtl_to_lg_grp_cd) doDtl_to_lg_grp_cd_NX(info);
		else if (nx == columnDtl_to_lg_grp_nm) doDtl_to_lg_grp_nm_NX(info);
		else if (nx == columnDtl_to_lg_grp_loc_flg) doDtl_to_lg_grp_loc_flg_NX(info);
		else if (nx == columnDtl_ship_term_cd) doDtl_ship_term_cd_NX(info);
		else if (nx == columnDtl_ship_term_nm) doDtl_ship_term_nm_NX(info);
		else if (nx == columnDtl_xfr_lt) doDtl_xfr_lt_NX(info);
		else if (nx == columnDtl_fin_cl_time_disp) doDtl_fin_cl_time_disp_NX(info);
		else if (nx == columnDtl_fin_cl_time) doDtl_fin_cl_time_NX(info);
		else if (nx == columnDtl_early_ship_dt_add_days) doDtl_early_ship_dt_add_days_NX(info);
		else if (nx == columnDtl_alloc_days) doDtl_alloc_days_NX(info);
		else if (nx == columnDtl_iv_trd_flg) doDtl_iv_trd_flg_NX(info);
		else if (nx == columnDtl_def_tdlv_cd) doDtl_def_tdlv_cd_NX(info);
		else if (nx == columnDtl_def_tdlv_nm) doDtl_def_tdlv_nm_NX(info);
		else if (nx == columnDtl_ship_wk_grp_cd) doDtl_ship_wk_grp_cd_NX(info);
		else if (nx == columnDtl_ship_wk_grp_nm) doDtl_ship_wk_grp_nm_NX(info);
		else if (nx == columnDtl_non_dmnd_lt_flg) doDtl_non_dmnd_lt_flg_NX(info);
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
		else if (nx == columnLcl_del_flg) doLcl_del_flg_NX(info);
		else if (nx == columnLcl_fr_lg_grp_cd) doLcl_fr_lg_grp_cd_NX(info);
		else if (nx == columnLcl_to_lg_grp_cd) doLcl_to_lg_grp_cd_NX(info);
		else if (nx == columnLcl_ship_term_cd) doLcl_ship_term_cd_NX(info);
		else if (nx == columnLcl_day_week_typ) doLcl_day_week_typ_NX(info);
		else if (nx == columnLcl_day_week_typ_nm) doLcl_day_week_typ_nm_NX(info);
		else if (nx == columnLcl_fin_cl_time_disp) doLcl_fin_cl_time_disp_NX(info);
		else if (nx == columnLcl_fin_cl_time) doLcl_fin_cl_time_NX(info);
		else if (nx == columnLcl_no_ship_flg) doLcl_no_ship_flg_NX(info);
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
		else if (nx == columnLcl_del_usr_id) doLcl_del_usr_id_NX(info);
		else if (nx == columnLcl_del_usr_nm) doLcl_del_usr_nm_NX(info);
		else if (nx == columnLcl_del_ts) doLcl_del_ts_NX(info);
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
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fr_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fr_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fr_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[to_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_to_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[to_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_to_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_term_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_term_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_grp_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[fr_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fr_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fr_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[to_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_to_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[to_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_to_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[to_lg_grp_loc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_to_lg_grp_loc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_term_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_term_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_term_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_term_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_lt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fin_cl_time_disp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fin_cl_time_disp_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fin_cl_time]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fin_cl_time_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[early_ship_dt_add_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_early_ship_dt_add_days_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_days_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_trd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_trd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_tdlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_tdlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_tdlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_tdlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[non_dmnd_lt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_non_dmnd_lt_flg_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[fr_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_fr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[to_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_to_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ship_term_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ship_term_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[day_week_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_day_week_typ_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[day_week_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_day_week_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[fin_cl_time_disp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_fin_cl_time_disp_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[fin_cl_time]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_fin_cl_time_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[no_ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_no_ship_flg_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_fr_lg_grp_cd) doCnd_fr_lg_grp_cd_LC(info);
		else if (lc == Cnd_fr_lg_grp_nm) doCnd_fr_lg_grp_nm_LC(info);
		else if (lc == Cnd_to_lg_grp_cd) doCnd_to_lg_grp_cd_LC(info);
		else if (lc == Cnd_to_lg_grp_nm) doCnd_to_lg_grp_nm_LC(info);
		else if (lc == Cnd_ship_term_cd) doCnd_ship_term_cd_LC(info);
		else if (lc == Cnd_ship_term_nm) doCnd_ship_term_nm_LC(info);
		else if (lc == Cnd_ship_wk_grp_cd) doCnd_ship_wk_grp_cd_LC(info);
		else if (lc == Cnd_ship_wk_grp_nm) doCnd_ship_wk_grp_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == columnDtl_fr_lg_grp_cd) doDtl_fr_lg_grp_cd_LC(info);
		else if (lc == columnDtl_fr_lg_grp_nm) doDtl_fr_lg_grp_nm_LC(info);
		else if (lc == columnDtl_to_lg_grp_cd) doDtl_to_lg_grp_cd_LC(info);
		else if (lc == columnDtl_to_lg_grp_nm) doDtl_to_lg_grp_nm_LC(info);
		else if (lc == columnDtl_ship_term_cd) doDtl_ship_term_cd_LC(info);
		else if (lc == columnDtl_ship_term_nm) doDtl_ship_term_nm_LC(info);
		else if (lc == columnDtl_xfr_lt) doDtl_xfr_lt_LC(info);
		else if (lc == columnDtl_fin_cl_time_disp) doDtl_fin_cl_time_disp_LC(info);
		else if (lc == columnDtl_fin_cl_time) doDtl_fin_cl_time_LC(info);
		else if (lc == columnDtl_early_ship_dt_add_days) doDtl_early_ship_dt_add_days_LC(info);
		else if (lc == columnDtl_alloc_days) doDtl_alloc_days_LC(info);
		else if (lc == columnDtl_def_tdlv_cd) doDtl_def_tdlv_cd_LC(info);
		else if (lc == columnDtl_def_tdlv_nm) doDtl_def_tdlv_nm_LC(info);
		else if (lc == columnDtl_ship_wk_grp_cd) doDtl_ship_wk_grp_cd_LC(info);
		else if (lc == columnDtl_ship_wk_grp_nm) doDtl_ship_wk_grp_nm_LC(info);
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
		else if (lc == columnLcl_fr_lg_grp_cd) doLcl_fr_lg_grp_cd_LC(info);
		else if (lc == columnLcl_to_lg_grp_cd) doLcl_to_lg_grp_cd_LC(info);
		else if (lc == columnLcl_ship_term_cd) doLcl_ship_term_cd_LC(info);
		else if (lc == columnLcl_day_week_typ) doLcl_day_week_typ_LC(info);
		else if (lc == columnLcl_day_week_typ_nm) doLcl_day_week_typ_nm_LC(info);
		else if (lc == columnLcl_fin_cl_time_disp) doLcl_fin_cl_time_disp_LC(info);
		else if (lc == columnLcl_fin_cl_time) doLcl_fin_cl_time_LC(info);
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
		else if (lc == columnLcl_del_usr_id) doLcl_del_usr_id_LC(info);
		else if (lc == columnLcl_del_usr_nm) doLcl_del_usr_nm_LC(info);
		else if (lc == columnLcl_del_ts) doLcl_del_ts_LC(info);
	}

	/**
	 * [Cnd]パネルの[fr_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fr_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fr_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[to_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_to_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[to_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_to_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_term_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_term_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_term_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_grp_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[fr_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fr_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fr_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[to_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_to_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[to_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_to_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_term_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_term_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_term_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_term_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_lt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fin_cl_time_disp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fin_cl_time_disp_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fin_cl_time]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fin_cl_time_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[early_ship_dt_add_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_early_ship_dt_add_days_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_days_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_tdlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_tdlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_tdlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_tdlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_grp_nm_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[fr_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_fr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[to_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_to_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ship_term_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ship_term_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[day_week_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_day_week_typ_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[day_week_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_day_week_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[fin_cl_time_disp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_fin_cl_time_disp_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[fin_cl_time]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_fin_cl_time_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_fr_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_fr_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrpForLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_to_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_to_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_term_cd]の作成メソッド
	 */
	public MCList getCnd_ship_term_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipTerm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_wk_grp_cd]の作成メソッド
	 */
	public MCList getCnd_ship_wk_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipWkGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_fr_lg_grp_cd]の作成メソッド
	 */
	public MCList getDtl_fr_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrpForLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_to_lg_grp_cd]の作成メソッド
	 */
	public MCList getDtl_to_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ship_term_cd]の作成メソッド
	 */
	public MCList getDtl_ship_term_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipTerm(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_def_tdlv_cd]の作成メソッド
	 */
	public MCList getDtl_def_tdlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ship_wk_grp_cd]の作成メソッド
	 */
	public MCList getDtl_ship_wk_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipWkGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnLcl_day_week_typ]の作成メソッド
	 */
	public MCList getLcl_day_week_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDayWeekTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABSL0440.Srch01")) {
			return new MA_MABSL0440_Srch01Bridge();
		}
		if (id.equals("MA.MABSL0440.Upd01")) {
			return new MA_MABSL0440_Upd01Bridge();
		}
		if (id.equals("MA.MABSL0440.Del01")) {
			return new MA_MABSL0440_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABSL0440_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0440_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0440_Srch01;

		/** コンストラクタ */
		protected MA_MABSL0440_Srch01Bridge() {
			p_MA_MABSL0440_Srch01 = new MCParam(PDef.MA_MABSL0440_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0440_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABS.MABSP0440.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0440.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0440.LclR.class));

			p_MA_MABSL0440_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0440_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0440_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0440_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0440_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABS.MABSP0440.CndR up0() {
			return (mcframe.clientMABS.MABSP0440.CndR)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP0440.DtlR> down0() {
			return (MCList<mcframe.clientMABS.MABSP0440.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMABS.MABSP0440.LclR> down1() {
			return (MCList<mcframe.clientMABS.MABSP0440.LclR>)down(1);
		}

		protected void setupDownParam() {
			p_MA_MABSL0440_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0440.DtlR.class));
			p_MA_MABSL0440_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0440.LclR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL0440_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABS.MABSP0440.DtlR>)p_MA_MABSL0440_Srch01.getContainerParam().getDownBlock(0));
			setLclAllL((MCList<mcframe.clientMABS.MABSP0440.LclR>)p_MA_MABSL0440_Srch01.getContainerParam().getDownBlock(1));
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
	 * [MA_MABSL0440_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0440_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0440_Upd01;

		/** コンストラクタ */
		protected MA_MABSL0440_Upd01Bridge() {
			p_MA_MABSL0440_Upd01 = new MCParam(PDef.MA_MABSL0440_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0440_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0440.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0440.LclR.class));
			// Down

			p_MA_MABSL0440_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0440_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0440_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABSL0440_Upd01.addUpBlock(getLclAllL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0440_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0440_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0440.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0440.DtlR>)up(0);
		}
		protected MCList<mcframe.clientMABS.MABSP0440.LclR> up1() {
			return (MCList<mcframe.clientMABS.MABSP0440.LclR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL0440_Upd01;
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
	 * [MA_MABSL0440_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0440_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0440_Del01;

		/** コンストラクタ */
		protected MA_MABSL0440_Del01Bridge() {
			p_MA_MABSL0440_Del01 = new MCParam(PDef.MA_MABSL0440_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0440_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0440.DtlR.class));
			// Down

			p_MA_MABSL0440_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0440_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0440_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0440_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0440_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0440.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0440.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL0440_Del01;
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