package mcframe.clientMABS.MABSP0450;

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
import mcframe.clientMABS.MABSP0450.MABSP_ShipWkGrpReg_MC.MA_MABSL0450_Srch01Caller;
import mcframe.clientMABS.MABSP0450.MABSP_ShipWkGrpReg_MC.MA_MABSL0450_Upd01Caller;
import mcframe.clientMABS.MABSP0450.MABSP_ShipWkGrpReg_MC.MA_MABSL0450_Del01Caller;

/**
 * 画面"MABSP_ShipWkGrpReg"パネルクラスです。<p>
 *
 * 出荷作業グループマスタ、出荷作業判定マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSP_ShipWkGrpReg_MC_A extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase{
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
	public static final String SCREEN_ID = "MABSP0450";

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
	public MCLabel Cnd_ship_wk_cd_Label = null;
	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ship_wk_cd = null;
	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public MCTextField Cnd_ship_wk_nm = null;
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
	// [TopDtl]ブロック関連のField定義
	public MCPanel TopDtlPanel = null;
	// [TopDtl]ブロックの項目のField定義
	// [WkGrp]ブロック関連のField定義
	public MCPanel WkGrpPanel = null;
	// [WkGrp]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0450.DtlR> DtlTable = null;
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
	 * Shipping operation group cd. 出荷作業グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_wk_grp_cd = null;
	/**
	 * Shipping operation group name 出荷作業グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_wk_grp_nm_lcl = null;
	/**
	 * Standard shipping operation group name 標準出荷作業グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_wk_grp_nm = null;
	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_wk_cd = null;
	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_wk_nm = null;
	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_schd_time_disp = null;
	/**
	 * Shipping schedule time (String) 出荷予定時刻（文字列）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_schd_time = null;
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
	// [BtmDtl]ブロック関連のField定義
	public MCPanel BtmDtlPanel = null;
	// [BtmDtl]ブロックの項目のField定義
	// [BtmTab]ブロック関連のField定義
	public MCPanel BtmTabPanel = null;
	public MCTabbedPane BtmTabTab = null;
	// [BtmTab]ブロックの項目のField定義
	// [WkJdg]ブロック関連のField定義
	public MCPanel WkJdgPanel = null;
	// [WkJdg]ブロックの項目のField定義
	// [DtlWkJdg]ブロック関連のField定義
	public MCPanel DtlWkJdgPanel = null;
	public MCScrollPane DtlWkJdgScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0450.DtlWkJdgR> DtlWkJdgTable = null;
	// [DtlWkJdg]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_del_flg = null;
	/**
	 * Shipping operation group cd. 出荷作業グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_ship_wk_grp_cd = null;
	/**
	 * Delivery deadline 納入締切時刻.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_dlv_ded_time_disp = null;
	/**
	 * Delivery deadline time (String) 納入締切時刻（文字列）.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_dlv_ded_time = null;
	/**
	 * Shipping operation cd. 出荷作業ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_ship_wk_cd = null;
	/**
	 * Shipping operation name 出荷作業名.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_ship_wk_nm = null;
	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_ship_schd_time_disp = null;
	/**
	 * Shipping schedule time (String) 出荷予定時刻（文字列）.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_ship_schd_time = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnDtlWkJdg_del_ts = null;
	// [DtlBtnWkJdg]ブロック関連のField定義
	public MCPanel DtlBtnWkJdgPanel = null;
	// [DtlBtnWkJdg]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton DtlBtnWkJdg_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton DtlBtnWkJdg_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton DtlBtnWkJdg_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton DtlBtnWkJdg_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton DtlBtnWkJdg_rcopy = null;
	// [LclWkGrp]ブロック関連のField定義
	public MCPanel LclWkGrpPanel = null;
	// [LclWkGrp]ブロックの項目のField定義
	// [Lcl]ブロック関連のField定義
	public MCPanel LclPanel = null;
	public MCScrollPane LclScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0450.LclR> LclTable = null;
	// [Lcl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnLcl_check = null;
	/**
	 * Shipping operation group cd. 出荷作業グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ship_wk_grp_cd = null;
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
	 * Shipping operation group name 出荷作業グループ名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ship_wk_grp_nm = null;
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
	
	/** [MA_MABSL0450_Srch01]のCallerの作成 */
	protected MABSP_ShipWkGrpReg_MC.MA_MABSL0450_Srch01Caller createMA_MABSL0450_Srch01() {
		MABSP_ShipWkGrpReg_MC.MA_MABSL0450_Srch01Caller<MABSP_ShipWkGrpReg, MA_MABSL0450_Srch01Bridge>
		caller = ((MABSP_ShipWkGrpReg_MC)this).new MA_MABSL0450_Srch01Caller<MABSP_ShipWkGrpReg, MA_MABSL0450_Srch01Bridge>(
					(MABSP_ShipWkGrpReg)this, new MA_MABSL0450_Srch01Bridge());
		return caller;
	}
	/** [MA_MABSL0450_Srch01]の呼び出し */
	protected void callMA_MABSL0450_Srch01() {
		MCCaller caller = createMA_MABSL0450_Srch01();
		caller.exec();
	}
	/** [MA_MABSL0450_Upd01]のCallerの作成 */
	protected MABSP_ShipWkGrpReg_MC.MA_MABSL0450_Upd01Caller createMA_MABSL0450_Upd01() {
		MABSP_ShipWkGrpReg_MC.MA_MABSL0450_Upd01Caller<MABSP_ShipWkGrpReg, MA_MABSL0450_Upd01Bridge>
		caller = ((MABSP_ShipWkGrpReg_MC)this).new MA_MABSL0450_Upd01Caller<MABSP_ShipWkGrpReg, MA_MABSL0450_Upd01Bridge>(
					(MABSP_ShipWkGrpReg)this, new MA_MABSL0450_Upd01Bridge());
		return caller;
	}
	/** [MA_MABSL0450_Upd01]の呼び出し */
	protected void callMA_MABSL0450_Upd01() {
		MCCaller caller = createMA_MABSL0450_Upd01();
		caller.exec();
	}
	/** [MA_MABSL0450_Del01]のCallerの作成 */
	protected MABSP_ShipWkGrpReg_MC.MA_MABSL0450_Del01Caller createMA_MABSL0450_Del01() {
		MABSP_ShipWkGrpReg_MC.MA_MABSL0450_Del01Caller<MABSP_ShipWkGrpReg, MA_MABSL0450_Del01Bridge>
		caller = ((MABSP_ShipWkGrpReg_MC)this).new MA_MABSL0450_Del01Caller<MABSP_ShipWkGrpReg, MA_MABSL0450_Del01Bridge>(
					(MABSP_ShipWkGrpReg)this, new MA_MABSL0450_Del01Bridge());
		return caller;
	}
	/** [MA_MABSL0450_Del01]の呼び出し */
	protected void callMA_MABSL0450_Del01() {
		MCCaller caller = createMA_MABSL0450_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP0450.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0450.DtlR> aDtlL;
	/** [DtlWkJdg]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0450.DtlWkJdgR> aDtlWkJdgL;
	/** [Lcl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0450.LclR> aLclL;
	/** [DtlWkJdgAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0450.DtlWkJdgR> aDtlWkJdgAllL;
	/** [LclAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0450.LclR> aLclAllL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABS.MABSP0450.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP0450.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP0450.CndR createCndR() {
		return mcframe.clientMABS.MABSP0450.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABS.MABSP0450.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0450.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABS.MABSP0450.DtlR createDtlR() {
		return mcframe.clientMABS.MABSP0450.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0450.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0450.DtlR.class);
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
	 * コピーによってaDtlWkJdgLを設定します。
	 *
	 * aDtlWkJdgLのインスタンスは変更されません。
	 *
	 * @param dataset DtlWkJdgL
	 */
	public void setDtlWkJdgL(MCList<mcframe.clientMABS.MABSP0450.DtlWkJdgR> aList) {
		if (getDtlWkJdgL() != aList) {
			getDtlWkJdgL().setAll(aList);
		}
	}

	/**
	 * [DtlWkJdg]ブロックのコンテナaDtlWkJdgLを返します。
	 *
	 * @return DtlWkJdgL
	 */
	public MCList<mcframe.clientMABS.MABSP0450.DtlWkJdgR> getDtlWkJdgL() {
		return aDtlWkJdgL;
	}

	/**
	 * aDtlWkJdgRを作成します。
	 *
	 * @return DtlWkJdgR
	 */
	public mcframe.clientMABS.MABSP0450.DtlWkJdgR createDtlWkJdgR() {
		return mcframe.clientMABS.MABSP0450.DtlWkJdgR.create();
	}

	/**
	 * aDtlWkJdgLを作成します。
	 *
	 * @return DtlWkJdgL
	 */
	public MCList<mcframe.clientMABS.MABSP0450.DtlWkJdgR> createDtlWkJdgL() {
		return MCList.create(mcframe.clientMABS.MABSP0450.DtlWkJdgR.class);
	}

	/**
	 * DtlWkJdgTableを初期化します。
	 */
	protected void createDtlWkJdgTable(){
		if(DtlWkJdgTable == null){
			DtlWkJdgTable = beansFactory.createTable2("DtlWkJdg.table");
		}
	}

	/**
	 * コピーによってaLclLを設定します。
	 *
	 * aLclLのインスタンスは変更されません。
	 *
	 * @param dataset LclL
	 */
	public void setLclL(MCList<mcframe.clientMABS.MABSP0450.LclR> aList) {
		if (getLclL() != aList) {
			getLclL().setAll(aList);
		}
	}

	/**
	 * [Lcl]ブロックのコンテナaLclLを返します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABS.MABSP0450.LclR> getLclL() {
		return aLclL;
	}

	/**
	 * aLclRを作成します。
	 *
	 * @return LclR
	 */
	public mcframe.clientMABS.MABSP0450.LclR createLclR() {
		return mcframe.clientMABS.MABSP0450.LclR.create();
	}

	/**
	 * aLclLを作成します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABS.MABSP0450.LclR> createLclL() {
		return MCList.create(mcframe.clientMABS.MABSP0450.LclR.class);
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
	 * コピーによってaDtlWkJdgAllLを設定します。
	 *
	 * aDtlWkJdgAllLのインスタンスは変更されません。
	 *
	 * @param dataset DtlWkJdgAllL
	 */
	public void setDtlWkJdgAllL(MCList<mcframe.clientMABS.MABSP0450.DtlWkJdgR> aList) {
		if (getDtlWkJdgAllL() != aList) {
			getDtlWkJdgAllL().setAll(aList);
		}
	}

	/**
	 * [DtlWkJdgAll]ブロックのコンテナaDtlWkJdgAllLを返します。
	 *
	 * @return DtlWkJdgAllL
	 */
	public MCList<mcframe.clientMABS.MABSP0450.DtlWkJdgR> getDtlWkJdgAllL() {
		return aDtlWkJdgAllL;
	}

	/**
	 * aDtlWkJdgAllRを作成します。
	 *
	 * @return DtlWkJdgAllR
	 */
	public mcframe.clientMABS.MABSP0450.DtlWkJdgR createDtlWkJdgAllR() {
		return mcframe.clientMABS.MABSP0450.DtlWkJdgR.create();
	}

	/**
	 * aDtlWkJdgAllLを作成します。
	 *
	 * @return DtlWkJdgAllL
	 */
	public MCList<mcframe.clientMABS.MABSP0450.DtlWkJdgR> createDtlWkJdgAllL() {
		return MCList.create(mcframe.clientMABS.MABSP0450.DtlWkJdgR.class);
	}

	/**
	 * コピーによってaLclAllLを設定します。
	 *
	 * aLclAllLのインスタンスは変更されません。
	 *
	 * @param dataset LclAllL
	 */
	public void setLclAllL(MCList<mcframe.clientMABS.MABSP0450.LclR> aList) {
		if (getLclAllL() != aList) {
			getLclAllL().setAll(aList);
		}
	}

	/**
	 * [LclAll]ブロックのコンテナaLclAllLを返します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABS.MABSP0450.LclR> getLclAllL() {
		return aLclAllL;
	}

	/**
	 * aLclAllRを作成します。
	 *
	 * @return LclAllR
	 */
	public mcframe.clientMABS.MABSP0450.LclR createLclAllR() {
		return mcframe.clientMABS.MABSP0450.LclR.create();
	}

	/**
	 * aLclAllLを作成します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABS.MABSP0450.LclR> createLclAllL() {
		return MCList.create(mcframe.clientMABS.MABSP0450.LclR.class);
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
		if(!MCCollectionUtil.contains(ret, getDtlWkJdgL())) ret.add(getDtlWkJdgL());
		if(!MCCollectionUtil.contains(ret, getLclL())) ret.add(getLclL());
		if(!MCCollectionUtil.contains(ret, getDtlWkJdgAllL())) ret.add(getDtlWkJdgAllL());
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
		if(aCnt == getDtlWkJdgL()) return "DtlWkJdg";
		if(aCnt == getLclL()) return "Lcl";
		if(aCnt == getDtlWkJdgAllL()) return "DtlWkJdgAll";
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
		if(bId.equals("DtlWkJdg")) return getDtlWkJdgL();
		if(bId.equals("Lcl")) return getLclL();
		if(bId.equals("DtlWkJdgAll")) return getDtlWkJdgAllL();
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
		ret.add(TopDtlPanel);
		ret.add(WkGrpPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(BtmDtlPanel);
		ret.add(BtmTabPanel);
		ret.add(WkJdgPanel);
		ret.add(DtlWkJdgPanel);
		ret.add(DtlBtnWkJdgPanel);
		ret.add(LclWkGrpPanel);
		ret.add(LclPanel);
		ret.add(LclBtnPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_ShipWkGrpReg_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();
		aDtlWkJdgL = createDtlWkJdgL();
		aLclL = createLclL();
		aDtlWkJdgAllL = createDtlWkJdgAllL();
		aLclAllL = createLclAllL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABSP_ShipWkGrpReg_MC_A(String name) {
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aDtlWkJdgL = createDtlWkJdgL();
		createDtlWkJdgTable();
		DtlWkJdgTable.setRowName(name);
		aLclL = createLclL();
		createLclTable();
		LclTable.setRowName(name);
		aDtlWkJdgAllL = createDtlWkJdgAllL();
		aLclAllL = createLclAllL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABSP_ShipWkGrpReg_MC.jbCreateScreenOpe((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbCreateTop((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbCreateFold((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbCreateCnd((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbCreateCtrl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbCreateTopDtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbCreateWkGrp((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbCreateDtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbCreateDtlBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbCreateBtmDtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbCreateBtmTab((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbCreateWkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbCreateDtlWkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbCreateDtlBtnWkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbCreateLclWkGrp((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbCreateLcl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbCreateLclBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbCreateBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbCreateEastBtn((MABSP_ShipWkGrpReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABSP_ShipWkGrpReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABSP_ShipWkGrpReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABSP_ShipWkGrpReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABSP_ShipWkGrpReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABSP_ShipWkGrpReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [TopDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTopDtl(MABSP_ShipWkGrpReg p) {
	}

	/**
	 * [WkGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWkGrp(MABSP_ShipWkGrpReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABSP_ShipWkGrpReg p) {
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABSP_ShipWkGrpReg p) {
	}

	/**
	 * [BtmDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtmDtl(MABSP_ShipWkGrpReg p) {
	}

	/**
	 * [BtmTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtmTab(MABSP_ShipWkGrpReg p) {
	}

	/**
	 * [WkJdg]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWkJdg(MABSP_ShipWkGrpReg p) {
	}

	/**
	 * [DtlWkJdg]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlWkJdg(MABSP_ShipWkGrpReg p) {
	}

	/**
	 * [DtlBtnWkJdg]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtnWkJdg(MABSP_ShipWkGrpReg p) {
	}

	/**
	 * [LclWkGrp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclWkGrp(MABSP_ShipWkGrpReg p) {
	}

	/**
	 * [Lcl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLcl(MABSP_ShipWkGrpReg p) {
	}

	/**
	 * [LclBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclBtn(MABSP_ShipWkGrpReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABSP_ShipWkGrpReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABSP_ShipWkGrpReg p) {
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
	
	
	/** [Cnd_ship_wk_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ship_wk_cd_p = null;

	/**
	 * [Cnd_ship_wk_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ship_wk_cd_ListPutter() {
		if (Cnd_ship_wk_cd_p == null) {
			Cnd_ship_wk_cd_p = createCnd_ship_wk_cd_ListPutter(Cnd_ship_wk_cd, "ship_wk_cd", "ship_wk_nm");

		}
		return Cnd_ship_wk_cd_p;
	}
	
	
	/** [Dtl_ship_wk_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ship_wk_cd_p = null;

	/**
	 * [Dtl_ship_wk_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ship_wk_cd_ListPutter() {
		if (Dtl_ship_wk_cd_p == null) {
			Dtl_ship_wk_cd_p = createDtl_ship_wk_cd_ListPutter(columnDtl_ship_wk_cd, "ship_wk_cd", "ship_wk_nm");

		}
		return Dtl_ship_wk_cd_p;
	}
	
	
	/** [DtlWkJdg_ship_wk_cd_ListPutter]の定義 */
	private MCListPutter DtlWkJdg_ship_wk_cd_p = null;

	/**
	 * [DtlWkJdg_ship_wk_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtlWkJdg_ship_wk_cd_ListPutter() {
		if (DtlWkJdg_ship_wk_cd_p == null) {
			DtlWkJdg_ship_wk_cd_p = createDtlWkJdg_ship_wk_cd_ListPutter(columnDtlWkJdg_ship_wk_cd, "ship_wk_cd", "ship_wk_nm");

		}
		return DtlWkJdg_ship_wk_cd_p;
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
	public static MABSP_ShipWkGrpReg create(){
		MABSP_ShipWkGrpReg p = new MABSP_ShipWkGrpReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_ShipWkGrpReg create(String name){
		MABSP_ShipWkGrpReg p = new MABSP_ShipWkGrpReg(name);
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
		MABSP_ShipWkGrpReg_MC.jbfInitScreenOpe((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbfInitTop((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbfInitFold((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbfInitCnd((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbfInitCtrl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbfInitTopDtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbfInitWkGrp((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbfInitDtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbfInitDtlBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbfInitBtmDtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbfInitBtmTab((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbfInitWkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbfInitDtlWkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbfInitDtlBtnWkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbfInitLclWkGrp((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbfInitLcl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbfInitLclBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbfInitBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbfInitEastBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbInitScreenOpe((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbInitTop((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbInitFold((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbInitCnd((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbInitCtrl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbInitTopDtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbInitWkGrp((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbInitDtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbInitDtlBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbInitBtmDtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbInitBtmTab((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbInitWkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbInitDtlWkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbInitDtlBtnWkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbInitLclWkGrp((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbInitLcl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbInitLclBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbInitBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.jbInitEastBtn((MABSP_ShipWkGrpReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ship_wk_grp_cd_Label = p.beansFactory.createLabel("Cnd.ship_wk_grp_cd_Label");
		p.Cnd_ship_wk_grp_cd = p.beansFactory.createTextComboBox("Cnd.ship_wk_grp_cd");
		p.Cnd_ship_wk_grp_cd.setLabel(p.Cnd_ship_wk_grp_cd_Label);
		p.Cnd_ship_wk_grp_nm = p.beansFactory.createTextField("Cnd.ship_wk_grp_nm");
		p.Cnd_ship_wk_cd_Label = p.beansFactory.createLabel("Cnd.ship_wk_cd_Label");
		p.Cnd_ship_wk_cd = p.beansFactory.createTextComboBox("Cnd.ship_wk_cd");
		p.Cnd_ship_wk_cd.setLabel(p.Cnd_ship_wk_cd_Label);
		p.Cnd_ship_wk_nm = p.beansFactory.createTextField("Cnd.ship_wk_nm");
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
	protected static void jbfInitCtrl(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [TopDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTopDtl(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.TopDtlPanel = p.beansFactory.createPanel("TopDtl");
		// ブロックの項目の初期化
	}

	/**
	 * [WkGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWkGrp(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.WkGrpPanel = p.beansFactory.createPanel("WkGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_ship_wk_grp_cd = p.beansFactory.createTableColumn("Dtl.ship_wk_grp_cd", MCColumnType.TEXT);
		p.columnDtl_ship_wk_grp_nm_lcl = p.beansFactory.createTableColumn("Dtl.ship_wk_grp_nm_lcl", MCColumnType.TEXT);
		p.columnDtl_ship_wk_grp_nm = p.beansFactory.createTableColumn("Dtl.ship_wk_grp_nm", MCColumnType.TEXT);
		p.columnDtl_ship_wk_cd = p.beansFactory.createTableColumn("Dtl.ship_wk_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ship_wk_nm = p.beansFactory.createTableColumn("Dtl.ship_wk_nm", MCColumnType.TEXT);
		p.columnDtl_ship_schd_time_disp = p.beansFactory.createTableColumn("Dtl.ship_schd_time_disp", MCColumnType.DATE);
		p.columnDtl_ship_schd_time = p.beansFactory.createTableColumn("Dtl.ship_schd_time", MCColumnType.TEXT);
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
	protected static void jbfInitDtlBtn(MABSP_ShipWkGrpReg p) {
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
	 * [BtmDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtmDtl(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.BtmDtlPanel = p.beansFactory.createPanel("BtmDtl");
		// ブロックの項目の初期化
	}

	/**
	 * [BtmTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtmTab(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.BtmTabPanel = p.beansFactory.createPanel("BtmTab");
		p.BtmTabTab = p.beansFactory.createTabbedPane("BtmTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [WkJdg]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWkJdg(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.WkJdgPanel = p.beansFactory.createPanel("WkJdg");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlWkJdg]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlWkJdg(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.DtlWkJdgPanel = p.beansFactory.createPanel("DtlWkJdg");
		p.DtlWkJdgScrollPane = p.beansFactory.createScrollPane("DtlWkJdg.scroll");
		p.createDtlWkJdgTable();
		// ブロックの項目の初期化
		p.columnDtlWkJdg_check = p.beansFactory.createTableColumn("DtlWkJdg.check", MCColumnType.CHECK);
		p.columnDtlWkJdg_del_flg = p.beansFactory.createTableColumn("DtlWkJdg.del_flg", MCColumnType.CHECK);
		p.columnDtlWkJdg_ship_wk_grp_cd = p.beansFactory.createTableColumn("DtlWkJdg.ship_wk_grp_cd", MCColumnType.TEXT);
		p.columnDtlWkJdg_dlv_ded_time_disp = p.beansFactory.createTableColumn("DtlWkJdg.dlv_ded_time_disp", MCColumnType.DATE);
		p.columnDtlWkJdg_dlv_ded_time = p.beansFactory.createTableColumn("DtlWkJdg.dlv_ded_time", MCColumnType.TEXT);
		p.columnDtlWkJdg_ship_wk_cd = p.beansFactory.createTableColumn("DtlWkJdg.ship_wk_cd", MCColumnType.TEXT_COMBO);
		p.columnDtlWkJdg_ship_wk_nm = p.beansFactory.createTableColumn("DtlWkJdg.ship_wk_nm", MCColumnType.TEXT);
		p.columnDtlWkJdg_ship_schd_time_disp = p.beansFactory.createTableColumn("DtlWkJdg.ship_schd_time_disp", MCColumnType.DATE);
		p.columnDtlWkJdg_ship_schd_time = p.beansFactory.createTableColumn("DtlWkJdg.ship_schd_time", MCColumnType.TEXT);
		p.columnDtlWkJdg_memo1 = p.beansFactory.createTableColumn("DtlWkJdg.memo1", MCColumnType.TEXT);
		p.columnDtlWkJdg_memo2 = p.beansFactory.createTableColumn("DtlWkJdg.memo2", MCColumnType.TEXT);
		p.columnDtlWkJdg_memo3 = p.beansFactory.createTableColumn("DtlWkJdg.memo3", MCColumnType.TEXT);
		p.columnDtlWkJdg_ins_usr_id = p.beansFactory.createTableColumn("DtlWkJdg.ins_usr_id", MCColumnType.TEXT);
		p.columnDtlWkJdg_ins_usr_nm = p.beansFactory.createTableColumn("DtlWkJdg.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtlWkJdg_ins_ts = p.beansFactory.createTableColumn("DtlWkJdg.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtlWkJdg_ins_func_id = p.beansFactory.createTableColumn("DtlWkJdg.ins_func_id", MCColumnType.TEXT);
		p.columnDtlWkJdg_ins_func_nm = p.beansFactory.createTableColumn("DtlWkJdg.ins_func_nm", MCColumnType.TEXT);
		p.columnDtlWkJdg_upd_cntr = p.beansFactory.createTableColumn("DtlWkJdg.upd_cntr", MCColumnType.NUMBER);
		p.columnDtlWkJdg_upd_usr_id = p.beansFactory.createTableColumn("DtlWkJdg.upd_usr_id", MCColumnType.TEXT);
		p.columnDtlWkJdg_upd_usr_nm = p.beansFactory.createTableColumn("DtlWkJdg.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtlWkJdg_upd_ts = p.beansFactory.createTableColumn("DtlWkJdg.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtlWkJdg_upd_func_id = p.beansFactory.createTableColumn("DtlWkJdg.upd_func_id", MCColumnType.TEXT);
		p.columnDtlWkJdg_upd_func_nm = p.beansFactory.createTableColumn("DtlWkJdg.upd_func_nm", MCColumnType.TEXT);
		p.columnDtlWkJdg_upd_srv_req_no = p.beansFactory.createTableColumn("DtlWkJdg.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtlWkJdg_del_usr_id = p.beansFactory.createTableColumn("DtlWkJdg.del_usr_id", MCColumnType.TEXT);
		p.columnDtlWkJdg_del_usr_nm = p.beansFactory.createTableColumn("DtlWkJdg.del_usr_nm", MCColumnType.TEXT);
		p.columnDtlWkJdg_del_ts = p.beansFactory.createTableColumn("DtlWkJdg.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [DtlBtnWkJdg]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtnWkJdg(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.DtlBtnWkJdgPanel = p.beansFactory.createPanel("DtlBtnWkJdg");
		// ブロックの項目の初期化
		p.DtlBtnWkJdg_select_all = p.beansFactory.createButton("DtlBtnWkJdg.select_all", "no_border");
		p.DtlBtnWkJdg_deselect_all = p.beansFactory.createButton("DtlBtnWkJdg.deselect_all", "no_border");
		p.DtlBtnWkJdg_radd = p.beansFactory.createButton("DtlBtnWkJdg.radd", "no_border");
		p.DtlBtnWkJdg_rdel = p.beansFactory.createButton("DtlBtnWkJdg.rdel", "no_border");
		p.DtlBtnWkJdg_rcopy = p.beansFactory.createButton("DtlBtnWkJdg.rcopy", "no_border");
	}

	/**
	 * [LclWkGrp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclWkGrp(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.LclWkGrpPanel = p.beansFactory.createPanel("LclWkGrp");
		// ブロックの項目の初期化
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLcl(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.LclPanel = p.beansFactory.createPanel("Lcl");
		p.LclScrollPane = p.beansFactory.createScrollPane("Lcl.scroll");
		p.createLclTable();
		// ブロックの項目の初期化
		p.columnLcl_check = p.beansFactory.createTableColumn("Lcl.check", MCColumnType.CHECK);
		p.columnLcl_ship_wk_grp_cd = p.beansFactory.createTableColumn("Lcl.ship_wk_grp_cd", MCColumnType.TEXT);
		p.columnLcl_lcl_cd = p.beansFactory.createTableColumn("Lcl.lcl_cd", MCColumnType.TEXT_COMBO);
		p.columnLcl_lcl_nm = p.beansFactory.createTableColumn("Lcl.lcl_nm", MCColumnType.TEXT);
		p.columnLcl_ship_wk_grp_nm = p.beansFactory.createTableColumn("Lcl.ship_wk_grp_nm", MCColumnType.TEXT);
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
	protected static void jbfInitLclBtn(MABSP_ShipWkGrpReg p) {
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
	protected static void jbfInitBtn(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABSP_ShipWkGrpReg p) {
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
	protected static void jbInitTop(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.TopDtlPanel);
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
	protected static void jbInitFold(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABSP_ShipWkGrpReg p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABS.MABSP0450.CndR.ope_META);
		p.Cnd_ship_wk_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_wk_grp_cd, true);
		p.Cnd_ship_wk_grp_cd.setLinkBeans(p.Cnd_ship_wk_grp_nm);
		p.CndPanel.add(p.Cnd_ship_wk_grp_cd_Label);
		p.CndPanel.add(p.Cnd_ship_wk_grp_cd);
		p.CndPanel.setLastBeans(p.Cnd_ship_wk_grp_cd);
		p.Cnd_ship_wk_grp_cd.setNextBeans(p.Cnd_ship_wk_grp_nm);
		p.Cnd_ship_wk_grp_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0450.CndR.ship_wk_grp_cd_META);
		p.CndPanel.add(p.Cnd_ship_wk_grp_nm);
		p.Cnd_ship_wk_grp_nm.setNextBeans(p.Cnd_ship_wk_cd);
		p.Cnd_ship_wk_grp_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0450.CndR.ship_wk_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_wk_grp_nm, true);
		p.Cnd_ship_wk_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ship_wk_cd, true);
		p.Cnd_ship_wk_cd.setLinkBeans(p.Cnd_ship_wk_nm);
		p.CndPanel.add(p.Cnd_ship_wk_cd_Label);
		p.CndPanel.add(p.Cnd_ship_wk_cd);
		p.Cnd_ship_wk_cd.setNextBeans(p.Cnd_ship_wk_nm);
		p.Cnd_ship_wk_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0450.CndR.ship_wk_cd_META);
		p.CndPanel.add(p.Cnd_ship_wk_nm);
		p.Cnd_ship_wk_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_ship_wk_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0450.CndR.ship_wk_nm_META);
		p.setPluralValueEnable(p.Cnd_ship_wk_nm, true);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0450.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0450.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0450.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0450.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0450.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [TopDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTopDtl(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.add(p.TopDtlPanel);
		p.TopDtlPanel.setNextBeans(p.BtmDtlPanel);
		p.TopDtlPanel.setLayoutPosition("CBCT+");
		// ブロックの項目の初期化
		p.TopDtlPanel.add(p.WkGrpPanel, null);
		p.TopDtlPanel.setLastBeans(p.WkGrpPanel);
	}

	/**
	 * [WkGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWkGrp(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.WkGrpPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.WkGrpPanel.add(p.DtlPanel, null);
		p.WkGrpPanel.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.WkGrpPanel.add(p.DtlBtnPanel, null);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABSP_ShipWkGrpReg p) {
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
	protected static void jbInitDtlBtn(MABSP_ShipWkGrpReg p) {
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
	 * [BtmDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtmDtl(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.add(p.BtmDtlPanel);
		p.BtmDtlPanel.setNextBeans(p.BtnPanel);
		p.BtmDtlPanel.setLayoutPosition("CBCB+");
		// ブロックの項目の初期化
		p.BtmDtlPanel.add(p.BtmTabPanel, null);
		p.BtmDtlPanel.setLastBeans(p.BtmTabPanel);
	}

	/**
	 * [BtmTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtmTab(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.BtmTabPanel.add(p.BtmTabTab);
		p.BtmTabPanel.setLastBeans(p.BtmTabTab);
		p.BtmTabPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.BtmTabTab.add(p.WkJdgPanel, "BtmTab.wkjdg");
		p.BtmTabTab.setLastBeans(p.WkJdgPanel);
		p.WkJdgPanel.setNextBeans(p.LclWkGrpPanel);
		p.BtmTabTab.add(p.LclWkGrpPanel, "BtmTab.lclwkgrp");
	}

	/**
	 * [WkJdg]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWkJdg(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.WkJdgPanel.setNextBeans(p.LclWkGrpPanel);
		p.WkJdgPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.WkJdgPanel.add(p.DtlWkJdgPanel, null);
		p.WkJdgPanel.setLastBeans(p.DtlWkJdgPanel);
		p.DtlWkJdgPanel.setNextBeans(p.DtlBtnWkJdgPanel);
		p.WkJdgPanel.add(p.DtlBtnWkJdgPanel, null);
	}

	/**
	 * [DtlWkJdg]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlWkJdg(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.DtlWkJdgPanel.add(p.DtlWkJdgScrollPane);
		p.DtlWkJdgPanel.setLastBeans(p.DtlWkJdgTable);
		p.DtlWkJdgScrollPane.setViewportView(p.DtlWkJdgTable);
		p.DtlWkJdgTable.setList(p.getDtlWkJdgL());
		p.DtlWkJdgPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtnWkJdg]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtnWkJdg(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.DtlBtnWkJdgPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.DtlBtnWkJdg_select_all.setIcon("SELECT_ALL");
		p.DtlBtnWkJdg_select_all.setFunctionKey(MCFunctionKey.F18);
		p.DtlBtnWkJdgPanel.add(p.DtlBtnWkJdg_select_all);
		p.DtlBtnWkJdgPanel.setLastBeans(p.DtlBtnWkJdg_select_all);
		p.DtlBtnWkJdg_select_all.setNextBeans(p.DtlBtnWkJdg_deselect_all);
		p.DtlBtnWkJdg_deselect_all.setIcon("DESELECT_ALL");
		p.DtlBtnWkJdg_deselect_all.setFunctionKey(MCFunctionKey.F19);
		p.DtlBtnWkJdgPanel.add(p.DtlBtnWkJdg_deselect_all);
		p.DtlBtnWkJdg_deselect_all.setNextBeans(p.DtlBtnWkJdg_radd);
		p.DtlBtnWkJdg_radd.setIcon("INSERT_RECORD");
		p.DtlBtnWkJdg_radd.setFunctionKey(MCFunctionKey.F7);
		p.DtlBtnWkJdgPanel.add(p.DtlBtnWkJdg_radd);
		p.DtlBtnWkJdg_radd.setNextBeans(p.DtlBtnWkJdg_rdel);
		p.DtlBtnWkJdg_rdel.setIcon("DELETE_RECORD");
		p.DtlBtnWkJdg_rdel.setFunctionKey(MCFunctionKey.F8);
		p.DtlBtnWkJdgPanel.add(p.DtlBtnWkJdg_rdel);
		p.DtlBtnWkJdg_rdel.setNextBeans(p.DtlBtnWkJdg_rcopy);
		p.DtlBtnWkJdg_rcopy.setIcon("COPY_RECORD");
		p.DtlBtnWkJdg_rcopy.setFunctionKey(MCFunctionKey.F20);
		p.DtlBtnWkJdgPanel.add(p.DtlBtnWkJdg_rcopy);
	}

	/**
	 * [LclWkGrp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclWkGrp(MABSP_ShipWkGrpReg p) {
		// ブロック関連の初期化
		p.LclWkGrpPanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.LclWkGrpPanel.add(p.LclPanel, null);
		p.LclWkGrpPanel.setLastBeans(p.LclPanel);
		p.LclPanel.setNextBeans(p.LclBtnPanel);
		p.LclWkGrpPanel.add(p.LclBtnPanel, null);
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLcl(MABSP_ShipWkGrpReg p) {
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
	protected static void jbInitLclBtn(MABSP_ShipWkGrpReg p) {
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
	protected static void jbInitBtn(MABSP_ShipWkGrpReg p) {
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
	protected static void jbInitEastBtn(MABSP_ShipWkGrpReg p) {
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
		MABSP_ShipWkGrpReg_MC.mcInitScreenOpe((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.mcInitTop((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.mcInitFold((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.mcInitCnd((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.mcInitCtrl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.mcInitTopDtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.mcInitWkGrp((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.mcInitDtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.mcInitDtlBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.mcInitBtmDtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.mcInitBtmTab((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.mcInitWkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.mcInitDtlWkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.mcInitDtlBtnWkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.mcInitLclWkGrp((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.mcInitLcl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.mcInitLclBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.mcInitBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.mcInitEastBtn((MABSP_ShipWkGrpReg)this);

		// [UPD]ステータスのモードの設定
		MABSP_ShipWkGrpReg_MC.statusInitUPD_ScreenOpe((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitUPD_Top((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitUPD_Fold((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitUPD_Cnd((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitUPD_Ctrl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitUPD_TopDtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitUPD_WkGrp((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitUPD_Dtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitUPD_DtlBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitUPD_BtmDtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitUPD_BtmTab((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitUPD_WkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitUPD_DtlWkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitUPD_DtlBtnWkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitUPD_LclWkGrp((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitUPD_Lcl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitUPD_LclBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitUPD_Btn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitUPD_EastBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitUPD_DtlWkJdgAll((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitUPD_LclAll((MABSP_ShipWkGrpReg)this);

		// [FIX]ステータスのモードの設定
		MABSP_ShipWkGrpReg_MC.statusInitFIX_ScreenOpe((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitFIX_Top((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitFIX_Fold((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitFIX_Cnd((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitFIX_Ctrl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitFIX_TopDtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitFIX_WkGrp((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitFIX_Dtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitFIX_DtlBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitFIX_BtmDtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitFIX_BtmTab((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitFIX_WkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitFIX_DtlWkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitFIX_DtlBtnWkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitFIX_LclWkGrp((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitFIX_Lcl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitFIX_LclBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitFIX_Btn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitFIX_EastBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitFIX_DtlWkJdgAll((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitFIX_LclAll((MABSP_ShipWkGrpReg)this);

		// [DEL]ステータスのモードの設定
		MABSP_ShipWkGrpReg_MC.statusInitDEL_ScreenOpe((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitDEL_Top((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitDEL_Fold((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitDEL_Cnd((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitDEL_Ctrl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitDEL_TopDtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitDEL_WkGrp((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitDEL_Dtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitDEL_DtlBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitDEL_BtmDtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitDEL_BtmTab((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitDEL_WkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitDEL_DtlWkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitDEL_DtlBtnWkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitDEL_LclWkGrp((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitDEL_Lcl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitDEL_LclBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitDEL_Btn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitDEL_EastBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitDEL_DtlWkJdgAll((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitDEL_LclAll((MABSP_ShipWkGrpReg)this);

		// [REF]ステータスのモードの設定
		MABSP_ShipWkGrpReg_MC.statusInitREF_ScreenOpe((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitREF_Top((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitREF_Fold((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitREF_Cnd((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitREF_Ctrl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitREF_TopDtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitREF_WkGrp((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitREF_Dtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitREF_DtlBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitREF_BtmDtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitREF_BtmTab((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitREF_WkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitREF_DtlWkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitREF_DtlBtnWkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitREF_LclWkGrp((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitREF_Lcl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitREF_LclBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitREF_Btn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitREF_EastBtn((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitREF_DtlWkJdgAll((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.statusInitREF_LclAll((MABSP_ShipWkGrpReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABSP_ShipWkGrpReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABSP_ShipWkGrpReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABSP_ShipWkGrpReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABSP_ShipWkGrpReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ship_wk_grp_cd.setListListener(p);
		p.Cnd_ship_wk_grp_cd.addAllListener(p);
		p.Cnd_ship_wk_grp_nm.setListListener(p);
		p.Cnd_ship_wk_grp_nm.addAllListener(p);
		p.Cnd_ship_wk_cd.setListListener(p);
		p.Cnd_ship_wk_cd.addAllListener(p);
		p.Cnd_ship_wk_nm.setListListener(p);
		p.Cnd_ship_wk_nm.addAllListener(p);
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
	protected static void mcInitCtrl(MABSP_ShipWkGrpReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [TopDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTopDtl(MABSP_ShipWkGrpReg p) {
	}

	/**
	 *  [WkGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWkGrp(MABSP_ShipWkGrpReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABSP_ShipWkGrpReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_ship_wk_grp_cd.addAllListener(p);
		p.columnDtl_ship_wk_grp_cd.setListListener(p);
		p.columnDtl_ship_wk_grp_nm_lcl.addAllListener(p);
		p.columnDtl_ship_wk_grp_nm_lcl.setListListener(p);
		p.columnDtl_ship_wk_grp_nm.addAllListener(p);
		p.columnDtl_ship_wk_grp_nm.setListListener(p);
		p.columnDtl_ship_wk_cd.addAllListener(p);
		p.columnDtl_ship_wk_cd.setListListener(p);
		p.columnDtl_ship_wk_nm.addAllListener(p);
		p.columnDtl_ship_wk_nm.setListListener(p);
		p.columnDtl_ship_schd_time_disp.addAllListener(p);
		p.columnDtl_ship_schd_time_disp.setListListener(p);
		p.columnDtl_ship_schd_time.addAllListener(p);
		p.columnDtl_ship_schd_time.setListListener(p);
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
	protected static void mcInitDtlBtn(MABSP_ShipWkGrpReg p) {
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
	 *  [BtmDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtmDtl(MABSP_ShipWkGrpReg p) {
	}

	/**
	 *  [BtmTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtmTab(MABSP_ShipWkGrpReg p) {
		p.BtmTabTab.addAllListener(p);
	}

	/**
	 *  [WkJdg]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWkJdg(MABSP_ShipWkGrpReg p) {
	}

	/**
	 *  [DtlWkJdg]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlWkJdg(MABSP_ShipWkGrpReg p) {
		p.DtlWkJdgTable.addAllListener(p);
		p.columnDtlWkJdg_check.addAllListener(p);
		p.columnDtlWkJdg_del_flg.addAllListener(p);
		p.columnDtlWkJdg_ship_wk_grp_cd.addAllListener(p);
		p.columnDtlWkJdg_ship_wk_grp_cd.setListListener(p);
		p.columnDtlWkJdg_dlv_ded_time_disp.addAllListener(p);
		p.columnDtlWkJdg_dlv_ded_time_disp.setListListener(p);
		p.columnDtlWkJdg_dlv_ded_time.addAllListener(p);
		p.columnDtlWkJdg_dlv_ded_time.setListListener(p);
		p.columnDtlWkJdg_ship_wk_cd.addAllListener(p);
		p.columnDtlWkJdg_ship_wk_cd.setListListener(p);
		p.columnDtlWkJdg_ship_wk_nm.addAllListener(p);
		p.columnDtlWkJdg_ship_wk_nm.setListListener(p);
		p.columnDtlWkJdg_ship_schd_time_disp.addAllListener(p);
		p.columnDtlWkJdg_ship_schd_time_disp.setListListener(p);
		p.columnDtlWkJdg_ship_schd_time.addAllListener(p);
		p.columnDtlWkJdg_ship_schd_time.setListListener(p);
		p.columnDtlWkJdg_memo1.addAllListener(p);
		p.columnDtlWkJdg_memo1.setListListener(p);
		p.columnDtlWkJdg_memo2.addAllListener(p);
		p.columnDtlWkJdg_memo2.setListListener(p);
		p.columnDtlWkJdg_memo3.addAllListener(p);
		p.columnDtlWkJdg_memo3.setListListener(p);
		p.columnDtlWkJdg_ins_usr_id.addAllListener(p);
		p.columnDtlWkJdg_ins_usr_id.setListListener(p);
		p.columnDtlWkJdg_ins_usr_nm.addAllListener(p);
		p.columnDtlWkJdg_ins_usr_nm.setListListener(p);
		p.columnDtlWkJdg_ins_ts.addAllListener(p);
		p.columnDtlWkJdg_ins_ts.setListListener(p);
		p.columnDtlWkJdg_ins_func_id.addAllListener(p);
		p.columnDtlWkJdg_ins_func_id.setListListener(p);
		p.columnDtlWkJdg_ins_func_nm.addAllListener(p);
		p.columnDtlWkJdg_ins_func_nm.setListListener(p);
		p.columnDtlWkJdg_upd_cntr.addAllListener(p);
		p.columnDtlWkJdg_upd_cntr.setListListener(p);
		p.columnDtlWkJdg_upd_usr_id.addAllListener(p);
		p.columnDtlWkJdg_upd_usr_id.setListListener(p);
		p.columnDtlWkJdg_upd_usr_nm.addAllListener(p);
		p.columnDtlWkJdg_upd_usr_nm.setListListener(p);
		p.columnDtlWkJdg_upd_ts.addAllListener(p);
		p.columnDtlWkJdg_upd_ts.setListListener(p);
		p.columnDtlWkJdg_upd_func_id.addAllListener(p);
		p.columnDtlWkJdg_upd_func_id.setListListener(p);
		p.columnDtlWkJdg_upd_func_nm.addAllListener(p);
		p.columnDtlWkJdg_upd_func_nm.setListListener(p);
		p.columnDtlWkJdg_upd_srv_req_no.addAllListener(p);
		p.columnDtlWkJdg_upd_srv_req_no.setListListener(p);
		p.columnDtlWkJdg_del_usr_id.addAllListener(p);
		p.columnDtlWkJdg_del_usr_id.setListListener(p);
		p.columnDtlWkJdg_del_usr_nm.addAllListener(p);
		p.columnDtlWkJdg_del_usr_nm.setListListener(p);
		p.columnDtlWkJdg_del_ts.addAllListener(p);
		p.columnDtlWkJdg_del_ts.setListListener(p);
	}

	/**
	 *  [DtlBtnWkJdg]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtnWkJdg(MABSP_ShipWkGrpReg p) {
		p.DtlBtnWkJdg_select_all.addAllListener(p);
		p.DtlBtnWkJdg_select_all.setAPMethodName("doDtlBtnWkJdg_select_all");
		p.DtlBtnWkJdg_deselect_all.addAllListener(p);
		p.DtlBtnWkJdg_deselect_all.setAPMethodName("doDtlBtnWkJdg_deselect_all");
		p.DtlBtnWkJdg_radd.addAllListener(p);
		p.DtlBtnWkJdg_radd.setAPMethodName("doDtlBtnWkJdg_radd");
		p.DtlBtnWkJdg_rdel.addAllListener(p);
		p.DtlBtnWkJdg_rdel.setAPMethodName("doDtlBtnWkJdg_rdel");
		p.DtlBtnWkJdg_rcopy.addAllListener(p);
		p.DtlBtnWkJdg_rcopy.setAPMethodName("doDtlBtnWkJdg_rcopy");
	}

	/**
	 *  [LclWkGrp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclWkGrp(MABSP_ShipWkGrpReg p) {
	}

	/**
	 *  [Lcl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLcl(MABSP_ShipWkGrpReg p) {
		p.LclTable.addAllListener(p);
		p.columnLcl_check.addAllListener(p);
		p.columnLcl_ship_wk_grp_cd.addAllListener(p);
		p.columnLcl_ship_wk_grp_cd.setListListener(p);
		p.columnLcl_lcl_cd.addAllListener(p);
		p.columnLcl_lcl_cd.setListListener(p);
		p.columnLcl_lcl_nm.addAllListener(p);
		p.columnLcl_lcl_nm.setListListener(p);
		p.columnLcl_ship_wk_grp_nm.addAllListener(p);
		p.columnLcl_ship_wk_grp_nm.setListListener(p);
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
	protected static void mcInitLclBtn(MABSP_ShipWkGrpReg p) {
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
	protected static void mcInitBtn(MABSP_ShipWkGrpReg p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABSP_ShipWkGrpReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABSP_ShipWkGrpReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ship_wk_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_wk_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_wk_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_del_flg_lab.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [UPD]ステータスの[TopDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TopDtl(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [UPD]ステータスの[WkGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_WkGrp(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABSP_ShipWkGrpReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ship_wk_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ship_wk_grp_nm_lcl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_grp_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ship_wk_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ship_wk_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_time_disp.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ship_schd_time.putMode(p, UPD, MCMode.INVISIBLE);
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
	protected static void statusInitUPD_DtlBtn(MABSP_ShipWkGrpReg p){
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BtmDtl(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [UPD]ステータスの[BtmTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BtmTab(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [UPD]ステータスの[WkJdg]ブロックのモードの設定
	 */
	protected static void statusInitUPD_WkJdg(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [UPD]ステータスの[DtlWkJdg]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlWkJdg(MABSP_ShipWkGrpReg p){
		p.columnDtlWkJdg_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlWkJdg_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlWkJdg_ship_wk_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlWkJdg_dlv_ded_time_disp.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlWkJdg_dlv_ded_time.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlWkJdg_ship_wk_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtlWkJdg_ship_wk_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ship_schd_time_disp.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlWkJdg_ship_schd_time.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlWkJdg_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlWkJdg_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlWkJdg_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtlWkJdg_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtlWkJdg_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlWkJdg_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlWkJdg_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtlWkJdg_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[DtlBtnWkJdg]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtnWkJdg(MABSP_ShipWkGrpReg p){
		p.DtlBtnWkJdg_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtnWkJdg_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtnWkJdg_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtnWkJdg_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtnWkJdg_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[LclWkGrp]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclWkGrp(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [UPD]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Lcl(MABSP_ShipWkGrpReg p){
		p.columnLcl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_ship_wk_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ship_wk_grp_nm.putMode(p, UPD, MCMode.REQUIRED);
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
	 * [UPD]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclBtn(MABSP_ShipWkGrpReg p){
		p.LclBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABSP_ShipWkGrpReg p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [UPD]ステータスの[DtlWkJdgAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlWkJdgAll(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [UPD]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclAll(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABSP_ShipWkGrpReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_ship_wk_grp_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ship_wk_grp_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ship_wk_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_del_flg_lab.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [FIX]ステータスの[TopDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_TopDtl(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [FIX]ステータスの[WkGrp]ブロックのモードの設定
	 */
	protected static void statusInitFIX_WkGrp(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABSP_ShipWkGrpReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_grp_nm_lcl.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_time_disp.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_time.putMode(p, FIX, MCMode.INVISIBLE);
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
	protected static void statusInitFIX_DtlBtn(MABSP_ShipWkGrpReg p){
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BtmDtl(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [FIX]ステータスの[BtmTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BtmTab(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [FIX]ステータスの[WkJdg]ブロックのモードの設定
	 */
	protected static void statusInitFIX_WkJdg(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [FIX]ステータスの[DtlWkJdg]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlWkJdg(MABSP_ShipWkGrpReg p){
		p.columnDtlWkJdg_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ship_wk_grp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtlWkJdg_dlv_ded_time_disp.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_dlv_ded_time.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtlWkJdg_ship_wk_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ship_wk_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ship_schd_time_disp.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ship_schd_time.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtlWkJdg_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtlWkJdg_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtlWkJdg_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[DtlBtnWkJdg]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlBtnWkJdg(MABSP_ShipWkGrpReg p){
		p.DtlBtnWkJdg_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtnWkJdg_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtnWkJdg_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtnWkJdg_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtnWkJdg_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[LclWkGrp]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclWkGrp(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [FIX]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Lcl(MABSP_ShipWkGrpReg p){
		p.columnLcl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ship_wk_grp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_ship_wk_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
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
	 * [FIX]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclBtn(MABSP_ShipWkGrpReg p){
		p.LclBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABSP_ShipWkGrpReg p){
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [FIX]ステータスの[DtlWkJdgAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlWkJdgAll(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [FIX]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclAll(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABSP_ShipWkGrpReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_ship_wk_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_wk_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_wk_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_del_flg_lab.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [DEL]ステータスの[TopDtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_TopDtl(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [DEL]ステータスの[WkGrp]ブロックのモードの設定
	 */
	protected static void statusInitDEL_WkGrp(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABSP_ShipWkGrpReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_grp_nm_lcl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_time_disp.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_time.putMode(p, DEL, MCMode.INVISIBLE);
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
	protected static void statusInitDEL_DtlBtn(MABSP_ShipWkGrpReg p){
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BtmDtl(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [DEL]ステータスの[BtmTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BtmTab(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [DEL]ステータスの[WkJdg]ブロックのモードの設定
	 */
	protected static void statusInitDEL_WkJdg(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [DEL]ステータスの[DtlWkJdg]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlWkJdg(MABSP_ShipWkGrpReg p){
		p.columnDtlWkJdg_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ship_wk_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlWkJdg_dlv_ded_time_disp.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_dlv_ded_time.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlWkJdg_ship_wk_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ship_wk_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ship_schd_time_disp.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ship_schd_time.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlWkJdg_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtlWkJdg_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtlWkJdg_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[DtlBtnWkJdg]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtnWkJdg(MABSP_ShipWkGrpReg p){
		p.DtlBtnWkJdg_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtnWkJdg_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtnWkJdg_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtnWkJdg_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtnWkJdg_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[LclWkGrp]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclWkGrp(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [DEL]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Lcl(MABSP_ShipWkGrpReg p){
		p.columnLcl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ship_wk_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ship_wk_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
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
	 * [DEL]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclBtn(MABSP_ShipWkGrpReg p){
		p.LclBtn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABSP_ShipWkGrpReg p){
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [DEL]ステータスの[DtlWkJdgAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlWkJdgAll(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [DEL]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclAll(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABSP_ShipWkGrpReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ship_wk_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_wk_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_wk_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ship_wk_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_del_flg_lab.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [REF]ステータスの[TopDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_TopDtl(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [REF]ステータスの[WkGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF_WkGrp(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABSP_ShipWkGrpReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_grp_nm_lcl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_wk_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_time_disp.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_time.putMode(p, REF, MCMode.INVISIBLE);
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
	protected static void statusInitREF_DtlBtn(MABSP_ShipWkGrpReg p){
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_BtmDtl(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [REF]ステータスの[BtmTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_BtmTab(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [REF]ステータスの[WkJdg]ブロックのモードの設定
	 */
	protected static void statusInitREF_WkJdg(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [REF]ステータスの[DtlWkJdg]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlWkJdg(MABSP_ShipWkGrpReg p){
		p.columnDtlWkJdg_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlWkJdg_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ship_wk_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlWkJdg_dlv_ded_time_disp.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlWkJdg_dlv_ded_time.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlWkJdg_ship_wk_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ship_wk_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ship_schd_time_disp.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ship_schd_time.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlWkJdg_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlWkJdg_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlWkJdg_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlWkJdg_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtlWkJdg_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlWkJdg_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlWkJdg_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlWkJdg_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtlWkJdg_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[DtlBtnWkJdg]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtnWkJdg(MABSP_ShipWkGrpReg p){
		p.DtlBtnWkJdg_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtnWkJdg_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtnWkJdg_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtnWkJdg_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtnWkJdg_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[LclWkGrp]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclWkGrp(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [REF]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Lcl(MABSP_ShipWkGrpReg p){
		p.columnLcl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_ship_wk_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ship_wk_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
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
	 * [REF]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclBtn(MABSP_ShipWkGrpReg p){
		p.LclBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABSP_ShipWkGrpReg p){
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [REF]ステータスの[DtlWkJdgAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlWkJdgAll(MABSP_ShipWkGrpReg p){

	}

	/**
	 * [REF]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclAll(MABSP_ShipWkGrpReg p){

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
		MABSP_ShipWkGrpReg_MC.setTableConfigDtl((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.setTableConfigDtlWkJdg((MABSP_ShipWkGrpReg)this);
		MABSP_ShipWkGrpReg_MC.setTableConfigLcl((MABSP_ShipWkGrpReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABSP_ShipWkGrpReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABS.MABSP0450.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABS.MABSP0450.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_ship_wk_grp_cd.setMeta(mcframe.clientMABS.MABSP0450.DtlR.ship_wk_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_wk_grp_cd);
		p.columnDtl_ship_wk_grp_nm_lcl.setMeta(mcframe.clientMABS.MABSP0450.DtlR.ship_wk_grp_nm_lcl_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_wk_grp_nm_lcl);
		p.columnDtl_ship_wk_grp_nm.setMeta(mcframe.clientMABS.MABSP0450.DtlR.ship_wk_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_wk_grp_nm);
		p.columnDtl_ship_wk_cd.setMeta(mcframe.clientMABS.MABSP0450.DtlR.ship_wk_cd_META);
		p.columnDtl_ship_wk_cd.addLinkBeans(p.columnDtl_ship_wk_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_wk_cd);
		p.columnDtl_ship_wk_nm.setMeta(mcframe.clientMABS.MABSP0450.DtlR.ship_wk_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_wk_nm);
		p.columnDtl_ship_schd_time_disp.setMeta(mcframe.clientMABS.MABSP0450.DtlR.ship_schd_time_disp_META);
		p.columnDtl_ship_schd_time_disp.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_schd_time_disp);
		p.columnDtl_ship_schd_time.setMeta(mcframe.clientMABS.MABSP0450.DtlR.ship_schd_time_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_schd_time);
		p.columnDtl_memo1.setMeta(mcframe.clientMABS.MABSP0450.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABS.MABSP0450.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABS.MABSP0450.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0450.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0450.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABS.MABSP0450.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0450.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0450.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP0450.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0450.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0450.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABS.MABSP0450.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0450.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0450.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0450.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP0450.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP0450.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABS.MABSP0450.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * [DtlWkJdg]ブロックのTableの設定
	 */
	protected static void setTableConfigDtlWkJdg(MABSP_ShipWkGrpReg p) {
		p.columnDtlWkJdg_check.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.check_META);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_check);
		p.columnDtlWkJdg_del_flg.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.del_flg_META);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_del_flg);
		p.columnDtlWkJdg_ship_wk_grp_cd.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.ship_wk_grp_cd_META);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_ship_wk_grp_cd);
		p.columnDtlWkJdg_dlv_ded_time_disp.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.dlv_ded_time_disp_META);
		p.columnDtlWkJdg_dlv_ded_time_disp.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_dlv_ded_time_disp);
		p.columnDtlWkJdg_dlv_ded_time.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.dlv_ded_time_META);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_dlv_ded_time);
		p.columnDtlWkJdg_ship_wk_cd.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.ship_wk_cd_META);
		p.columnDtlWkJdg_ship_wk_cd.addLinkBeans(p.columnDtlWkJdg_ship_wk_nm);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_ship_wk_cd);
		p.columnDtlWkJdg_ship_wk_nm.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.ship_wk_nm_META);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_ship_wk_nm);
		p.columnDtlWkJdg_ship_schd_time_disp.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.ship_schd_time_disp_META);
		p.columnDtlWkJdg_ship_schd_time_disp.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_ship_schd_time_disp);
		p.columnDtlWkJdg_ship_schd_time.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.ship_schd_time_META);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_ship_schd_time);
		p.columnDtlWkJdg_memo1.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.memo1_META);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_memo1);
		p.columnDtlWkJdg_memo2.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.memo2_META);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_memo2);
		p.columnDtlWkJdg_memo3.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.memo3_META);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_memo3);
		p.columnDtlWkJdg_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.ins_usr_id_META);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_ins_usr_id);
		p.columnDtlWkJdg_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.ins_usr_nm_META);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_ins_usr_nm);
		p.columnDtlWkJdg_ins_ts.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.ins_ts_META);
		p.columnDtlWkJdg_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_ins_ts);
		p.columnDtlWkJdg_ins_func_id.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.ins_func_id_META);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_ins_func_id);
		p.columnDtlWkJdg_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.ins_func_nm_META);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_ins_func_nm);
		p.columnDtlWkJdg_upd_cntr.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.upd_cntr_META);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_upd_cntr);
		p.columnDtlWkJdg_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.upd_usr_id_META);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_upd_usr_id);
		p.columnDtlWkJdg_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.upd_usr_nm_META);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_upd_usr_nm);
		p.columnDtlWkJdg_upd_ts.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.upd_ts_META);
		p.columnDtlWkJdg_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_upd_ts);
		p.columnDtlWkJdg_upd_func_id.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.upd_func_id_META);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_upd_func_id);
		p.columnDtlWkJdg_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.upd_func_nm_META);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_upd_func_nm);
		p.columnDtlWkJdg_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.upd_srv_req_no_META);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_upd_srv_req_no);
		p.columnDtlWkJdg_del_usr_id.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.del_usr_id_META);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_del_usr_id);
		p.columnDtlWkJdg_del_usr_nm.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.del_usr_nm_META);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_del_usr_nm);
		p.columnDtlWkJdg_del_ts.setMeta(mcframe.clientMABS.MABSP0450.DtlWkJdgR.del_ts_META);
		p.columnDtlWkJdg_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlWkJdgTable.addColumnConfig(p.columnDtlWkJdg_del_ts);
		// スクロール固定カラムの指定
		p.DtlWkJdgTable.setUnscrollColumn(p.columnDtlWkJdg_del_flg);
	}

	/**
	 * [Lcl]ブロックのTableの設定
	 */
	protected static void setTableConfigLcl(MABSP_ShipWkGrpReg p) {
		p.columnLcl_check.setMeta(mcframe.clientMABS.MABSP0450.LclR.check_META);
		p.LclTable.addColumnConfig(p.columnLcl_check);
		p.columnLcl_ship_wk_grp_cd.setMeta(mcframe.clientMABS.MABSP0450.LclR.ship_wk_grp_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_ship_wk_grp_cd);
		p.columnLcl_lcl_cd.setMeta(mcframe.clientMABS.MABSP0450.LclR.lcl_cd_META);
		p.columnLcl_lcl_cd.addLinkBeans(p.columnLcl_lcl_nm);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_cd);
		p.columnLcl_lcl_nm.setMeta(mcframe.clientMABS.MABSP0450.LclR.lcl_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_nm);
		p.columnLcl_ship_wk_grp_nm.setMeta(mcframe.clientMABS.MABSP0450.LclR.ship_wk_grp_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ship_wk_grp_nm);
		p.columnLcl_memo1.setMeta(mcframe.clientMABS.MABSP0450.LclR.memo1_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo1);
		p.columnLcl_memo2.setMeta(mcframe.clientMABS.MABSP0450.LclR.memo2_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo2);
		p.columnLcl_memo3.setMeta(mcframe.clientMABS.MABSP0450.LclR.memo3_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo3);
		p.columnLcl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0450.LclR.ins_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_id);
		p.columnLcl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0450.LclR.ins_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_nm);
		p.columnLcl_ins_ts.setMeta(mcframe.clientMABS.MABSP0450.LclR.ins_ts_META);
		p.columnLcl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_ins_ts);
		p.columnLcl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0450.LclR.ins_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_id);
		p.columnLcl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0450.LclR.ins_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_nm);
		p.columnLcl_upd_cntr.setMeta(mcframe.clientMABS.MABSP0450.LclR.upd_cntr_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_cntr);
		p.columnLcl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0450.LclR.upd_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_id);
		p.columnLcl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0450.LclR.upd_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_nm);
		p.columnLcl_upd_ts.setMeta(mcframe.clientMABS.MABSP0450.LclR.upd_ts_META);
		p.columnLcl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_upd_ts);
		p.columnLcl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0450.LclR.upd_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_id);
		p.columnLcl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0450.LclR.upd_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_nm);
		p.columnLcl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0450.LclR.upd_srv_req_no_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.LclTable.setUnscrollColumn(p.columnLcl_lcl_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_ship_wk_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_wk_grp_cd.getListConfig().setPutter(getCnd_ship_wk_grp_cd_ListPutter());
		Cnd_ship_wk_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ship_wk_cd.getListConfig().setPutter(getCnd_ship_wk_cd_ListPutter());
		columnDtl_ship_wk_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ship_wk_cd.getListConfig().setPutter(getDtl_ship_wk_cd_ListPutter());
		columnDtlWkJdg_ship_wk_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtlWkJdg_ship_wk_cd.getListConfig().setPutter(getDtlWkJdg_ship_wk_cd_ListPutter());
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
	 * [Cnd_ship_wk_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_wk_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipWkGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_ship_wk_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ship_wk_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipWk");
		return lp;
	}
	 
	/**
	 * [Dtl_ship_wk_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ship_wk_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipWk");
		return lp;
	}
	 
	/**
	 * [DtlWkJdg_ship_wk_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtlWkJdg_ship_wk_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipWk");
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
		if(combo == Cnd_ship_wk_grp_cd) return getCnd_ship_wk_grp_cd(row, info);
		if(combo == Cnd_ship_wk_cd) return getCnd_ship_wk_cd(row, info);
		if(combo == columnDtl_ship_wk_cd) return getDtl_ship_wk_cd(row, info);
		if(combo == columnDtlWkJdg_ship_wk_cd) return getDtlWkJdg_ship_wk_cd(row, info);
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
		else if (ap == DtlBtnWkJdg_select_all) doDtlBtnWkJdg_select_all(info);
		else if (ap == DtlBtnWkJdg_deselect_all) doDtlBtnWkJdg_deselect_all(info);
		else if (ap == DtlBtnWkJdg_radd) doDtlBtnWkJdg_radd(info);
		else if (ap == DtlBtnWkJdg_rdel) doDtlBtnWkJdg_rdel(info);
		else if (ap == DtlBtnWkJdg_rcopy) doDtlBtnWkJdg_rcopy(info);
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
	 * [DtlBtnWkJdg]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnWkJdg_select_all(MCEventInfo info);

	/**
	 * [DtlBtnWkJdg]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnWkJdg_deselect_all(MCEventInfo info);

	/**
	 * [DtlBtnWkJdg]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnWkJdg_radd(MCEventInfo info);

	/**
	 * [DtlBtnWkJdg]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnWkJdg_rdel(MCEventInfo info);

	/**
	 * [DtlBtnWkJdg]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtnWkJdg_rcopy(MCEventInfo info);

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
		if (vc == BtmTabTab) return doBtmTab_VC(info);
		if (vc == DtlWkJdgTable) return doDtlWkJdg_VC(info);
		if (vc == LclTable) return doLcl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_ship_wk_grp_cd) return doCnd_ship_wk_grp_cd_VC(info);
		if (vc == Cnd_ship_wk_grp_nm) return doCnd_ship_wk_grp_nm_VC(info);
		if (vc == Cnd_ship_wk_cd) return doCnd_ship_wk_cd_VC(info);
		if (vc == Cnd_ship_wk_nm) return doCnd_ship_wk_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_ship_wk_grp_cd) return doDtl_ship_wk_grp_cd_VC(info);
		if (vc == columnDtl_ship_wk_grp_nm_lcl) return doDtl_ship_wk_grp_nm_lcl_VC(info);
		if (vc == columnDtl_ship_wk_grp_nm) return doDtl_ship_wk_grp_nm_VC(info);
		if (vc == columnDtl_ship_wk_cd) return doDtl_ship_wk_cd_VC(info);
		if (vc == columnDtl_ship_wk_nm) return doDtl_ship_wk_nm_VC(info);
		if (vc == columnDtl_ship_schd_time_disp) return doDtl_ship_schd_time_disp_VC(info);
		if (vc == columnDtl_ship_schd_time) return doDtl_ship_schd_time_VC(info);
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
		if (vc == columnDtlWkJdg_check) return doDtlWkJdg_check_VC(info);
		if (vc == columnDtlWkJdg_del_flg) return doDtlWkJdg_del_flg_VC(info);
		if (vc == columnDtlWkJdg_ship_wk_grp_cd) return doDtlWkJdg_ship_wk_grp_cd_VC(info);
		if (vc == columnDtlWkJdg_dlv_ded_time_disp) return doDtlWkJdg_dlv_ded_time_disp_VC(info);
		if (vc == columnDtlWkJdg_dlv_ded_time) return doDtlWkJdg_dlv_ded_time_VC(info);
		if (vc == columnDtlWkJdg_ship_wk_cd) return doDtlWkJdg_ship_wk_cd_VC(info);
		if (vc == columnDtlWkJdg_ship_wk_nm) return doDtlWkJdg_ship_wk_nm_VC(info);
		if (vc == columnDtlWkJdg_ship_schd_time_disp) return doDtlWkJdg_ship_schd_time_disp_VC(info);
		if (vc == columnDtlWkJdg_ship_schd_time) return doDtlWkJdg_ship_schd_time_VC(info);
		if (vc == columnDtlWkJdg_memo1) return doDtlWkJdg_memo1_VC(info);
		if (vc == columnDtlWkJdg_memo2) return doDtlWkJdg_memo2_VC(info);
		if (vc == columnDtlWkJdg_memo3) return doDtlWkJdg_memo3_VC(info);
		if (vc == columnDtlWkJdg_ins_usr_id) return doDtlWkJdg_ins_usr_id_VC(info);
		if (vc == columnDtlWkJdg_ins_usr_nm) return doDtlWkJdg_ins_usr_nm_VC(info);
		if (vc == columnDtlWkJdg_ins_ts) return doDtlWkJdg_ins_ts_VC(info);
		if (vc == columnDtlWkJdg_ins_func_id) return doDtlWkJdg_ins_func_id_VC(info);
		if (vc == columnDtlWkJdg_ins_func_nm) return doDtlWkJdg_ins_func_nm_VC(info);
		if (vc == columnDtlWkJdg_upd_cntr) return doDtlWkJdg_upd_cntr_VC(info);
		if (vc == columnDtlWkJdg_upd_usr_id) return doDtlWkJdg_upd_usr_id_VC(info);
		if (vc == columnDtlWkJdg_upd_usr_nm) return doDtlWkJdg_upd_usr_nm_VC(info);
		if (vc == columnDtlWkJdg_upd_ts) return doDtlWkJdg_upd_ts_VC(info);
		if (vc == columnDtlWkJdg_upd_func_id) return doDtlWkJdg_upd_func_id_VC(info);
		if (vc == columnDtlWkJdg_upd_func_nm) return doDtlWkJdg_upd_func_nm_VC(info);
		if (vc == columnDtlWkJdg_upd_srv_req_no) return doDtlWkJdg_upd_srv_req_no_VC(info);
		if (vc == columnDtlWkJdg_del_usr_id) return doDtlWkJdg_del_usr_id_VC(info);
		if (vc == columnDtlWkJdg_del_usr_nm) return doDtlWkJdg_del_usr_nm_VC(info);
		if (vc == columnDtlWkJdg_del_ts) return doDtlWkJdg_del_ts_VC(info);
		if (vc == columnLcl_check) return doLcl_check_VC(info);
		if (vc == columnLcl_ship_wk_grp_cd) return doLcl_ship_wk_grp_cd_VC(info);
		if (vc == columnLcl_lcl_cd) return doLcl_lcl_cd_VC(info);
		if (vc == columnLcl_lcl_nm) return doLcl_lcl_nm_VC(info);
		if (vc == columnLcl_ship_wk_grp_nm) return doLcl_ship_wk_grp_nm_VC(info);
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
	 * [BtmTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtmTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_wk_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_wk_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_wk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_wk_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_wk_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_wk_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_wk_grp_nm_lcl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_wk_grp_nm_lcl_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_wk_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_wk_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_wk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_wk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_schd_time_disp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_schd_time_disp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_schd_time]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_schd_time_VC(MCEventInfo info){
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
	 * [DtlWkJdg]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[ship_wk_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_ship_wk_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[dlv_ded_time_disp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_dlv_ded_time_disp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[dlv_ded_time]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_dlv_ded_time_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[ship_wk_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_ship_wk_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[ship_wk_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_ship_wk_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[ship_schd_time_disp]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_ship_schd_time_disp_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[ship_schd_time]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_ship_schd_time_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [DtlWkJdg]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlWkJdg_del_ts_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[ship_wk_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ship_wk_grp_cd_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[ship_wk_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ship_wk_grp_nm_VC(MCEventInfo info){
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
		else if (nc == BtmTabTab) doBtmTab_NC(info);
		else if (nc == DtlWkJdgTable) doDtlWkJdg_NC(info);
		else if (nc == LclTable) doLcl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_ship_wk_grp_cd) doCnd_ship_wk_grp_cd_NC(info);
		else if (nc == Cnd_ship_wk_grp_nm) doCnd_ship_wk_grp_nm_NC(info);
		else if (nc == Cnd_ship_wk_cd) doCnd_ship_wk_cd_NC(info);
		else if (nc == Cnd_ship_wk_nm) doCnd_ship_wk_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_ship_wk_grp_cd) doDtl_ship_wk_grp_cd_NC(info);
		else if (nc == columnDtl_ship_wk_grp_nm_lcl) doDtl_ship_wk_grp_nm_lcl_NC(info);
		else if (nc == columnDtl_ship_wk_grp_nm) doDtl_ship_wk_grp_nm_NC(info);
		else if (nc == columnDtl_ship_wk_cd) doDtl_ship_wk_cd_NC(info);
		else if (nc == columnDtl_ship_wk_nm) doDtl_ship_wk_nm_NC(info);
		else if (nc == columnDtl_ship_schd_time_disp) doDtl_ship_schd_time_disp_NC(info);
		else if (nc == columnDtl_ship_schd_time) doDtl_ship_schd_time_NC(info);
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
		else if (nc == columnDtlWkJdg_check) doDtlWkJdg_check_NC(info);
		else if (nc == columnDtlWkJdg_del_flg) doDtlWkJdg_del_flg_NC(info);
		else if (nc == columnDtlWkJdg_ship_wk_grp_cd) doDtlWkJdg_ship_wk_grp_cd_NC(info);
		else if (nc == columnDtlWkJdg_dlv_ded_time_disp) doDtlWkJdg_dlv_ded_time_disp_NC(info);
		else if (nc == columnDtlWkJdg_dlv_ded_time) doDtlWkJdg_dlv_ded_time_NC(info);
		else if (nc == columnDtlWkJdg_ship_wk_cd) doDtlWkJdg_ship_wk_cd_NC(info);
		else if (nc == columnDtlWkJdg_ship_wk_nm) doDtlWkJdg_ship_wk_nm_NC(info);
		else if (nc == columnDtlWkJdg_ship_schd_time_disp) doDtlWkJdg_ship_schd_time_disp_NC(info);
		else if (nc == columnDtlWkJdg_ship_schd_time) doDtlWkJdg_ship_schd_time_NC(info);
		else if (nc == columnDtlWkJdg_memo1) doDtlWkJdg_memo1_NC(info);
		else if (nc == columnDtlWkJdg_memo2) doDtlWkJdg_memo2_NC(info);
		else if (nc == columnDtlWkJdg_memo3) doDtlWkJdg_memo3_NC(info);
		else if (nc == columnDtlWkJdg_ins_usr_id) doDtlWkJdg_ins_usr_id_NC(info);
		else if (nc == columnDtlWkJdg_ins_usr_nm) doDtlWkJdg_ins_usr_nm_NC(info);
		else if (nc == columnDtlWkJdg_ins_ts) doDtlWkJdg_ins_ts_NC(info);
		else if (nc == columnDtlWkJdg_ins_func_id) doDtlWkJdg_ins_func_id_NC(info);
		else if (nc == columnDtlWkJdg_ins_func_nm) doDtlWkJdg_ins_func_nm_NC(info);
		else if (nc == columnDtlWkJdg_upd_cntr) doDtlWkJdg_upd_cntr_NC(info);
		else if (nc == columnDtlWkJdg_upd_usr_id) doDtlWkJdg_upd_usr_id_NC(info);
		else if (nc == columnDtlWkJdg_upd_usr_nm) doDtlWkJdg_upd_usr_nm_NC(info);
		else if (nc == columnDtlWkJdg_upd_ts) doDtlWkJdg_upd_ts_NC(info);
		else if (nc == columnDtlWkJdg_upd_func_id) doDtlWkJdg_upd_func_id_NC(info);
		else if (nc == columnDtlWkJdg_upd_func_nm) doDtlWkJdg_upd_func_nm_NC(info);
		else if (nc == columnDtlWkJdg_upd_srv_req_no) doDtlWkJdg_upd_srv_req_no_NC(info);
		else if (nc == columnDtlWkJdg_del_usr_id) doDtlWkJdg_del_usr_id_NC(info);
		else if (nc == columnDtlWkJdg_del_usr_nm) doDtlWkJdg_del_usr_nm_NC(info);
		else if (nc == columnDtlWkJdg_del_ts) doDtlWkJdg_del_ts_NC(info);
		else if (nc == columnLcl_check) doLcl_check_NC(info);
		else if (nc == columnLcl_ship_wk_grp_cd) doLcl_ship_wk_grp_cd_NC(info);
		else if (nc == columnLcl_lcl_cd) doLcl_lcl_cd_NC(info);
		else if (nc == columnLcl_lcl_nm) doLcl_lcl_nm_NC(info);
		else if (nc == columnLcl_ship_wk_grp_nm) doLcl_ship_wk_grp_nm_NC(info);
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
	 * [BtmTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtmTab_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_wk_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_wk_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_grp_nm_lcl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_grp_nm_lcl_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_time_disp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_time_disp_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_time]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_time_NC(MCEventInfo info){
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
	 * [DtlWkJdg]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_check_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ship_wk_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ship_wk_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[dlv_ded_time_disp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_dlv_ded_time_disp_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[dlv_ded_time]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_dlv_ded_time_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ship_wk_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ship_wk_cd_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ship_wk_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ship_wk_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ship_schd_time_disp]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ship_schd_time_disp_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ship_schd_time]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ship_schd_time_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_memo1_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_memo2_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_memo3_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ship_wk_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ship_wk_grp_cd_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[ship_wk_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ship_wk_grp_nm_NC(MCEventInfo info){
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
		else if (ne == BtmTabTab) doBtmTab_NE(info);
		else if (ne == DtlWkJdgTable) doDtlWkJdg_NE(info);
		else if (ne == LclTable) doLcl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_ship_wk_grp_cd) doCnd_ship_wk_grp_cd_NE(info);
		else if (ne == Cnd_ship_wk_grp_nm) doCnd_ship_wk_grp_nm_NE(info);
		else if (ne == Cnd_ship_wk_cd) doCnd_ship_wk_cd_NE(info);
		else if (ne == Cnd_ship_wk_nm) doCnd_ship_wk_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_ship_wk_grp_cd) doDtl_ship_wk_grp_cd_NE(info);
		else if (ne == columnDtl_ship_wk_grp_nm_lcl) doDtl_ship_wk_grp_nm_lcl_NE(info);
		else if (ne == columnDtl_ship_wk_grp_nm) doDtl_ship_wk_grp_nm_NE(info);
		else if (ne == columnDtl_ship_wk_cd) doDtl_ship_wk_cd_NE(info);
		else if (ne == columnDtl_ship_wk_nm) doDtl_ship_wk_nm_NE(info);
		else if (ne == columnDtl_ship_schd_time_disp) doDtl_ship_schd_time_disp_NE(info);
		else if (ne == columnDtl_ship_schd_time) doDtl_ship_schd_time_NE(info);
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
		else if (ne == columnDtlWkJdg_check) doDtlWkJdg_check_NE(info);
		else if (ne == columnDtlWkJdg_del_flg) doDtlWkJdg_del_flg_NE(info);
		else if (ne == columnDtlWkJdg_ship_wk_grp_cd) doDtlWkJdg_ship_wk_grp_cd_NE(info);
		else if (ne == columnDtlWkJdg_dlv_ded_time_disp) doDtlWkJdg_dlv_ded_time_disp_NE(info);
		else if (ne == columnDtlWkJdg_dlv_ded_time) doDtlWkJdg_dlv_ded_time_NE(info);
		else if (ne == columnDtlWkJdg_ship_wk_cd) doDtlWkJdg_ship_wk_cd_NE(info);
		else if (ne == columnDtlWkJdg_ship_wk_nm) doDtlWkJdg_ship_wk_nm_NE(info);
		else if (ne == columnDtlWkJdg_ship_schd_time_disp) doDtlWkJdg_ship_schd_time_disp_NE(info);
		else if (ne == columnDtlWkJdg_ship_schd_time) doDtlWkJdg_ship_schd_time_NE(info);
		else if (ne == columnDtlWkJdg_memo1) doDtlWkJdg_memo1_NE(info);
		else if (ne == columnDtlWkJdg_memo2) doDtlWkJdg_memo2_NE(info);
		else if (ne == columnDtlWkJdg_memo3) doDtlWkJdg_memo3_NE(info);
		else if (ne == columnDtlWkJdg_ins_usr_id) doDtlWkJdg_ins_usr_id_NE(info);
		else if (ne == columnDtlWkJdg_ins_usr_nm) doDtlWkJdg_ins_usr_nm_NE(info);
		else if (ne == columnDtlWkJdg_ins_ts) doDtlWkJdg_ins_ts_NE(info);
		else if (ne == columnDtlWkJdg_ins_func_id) doDtlWkJdg_ins_func_id_NE(info);
		else if (ne == columnDtlWkJdg_ins_func_nm) doDtlWkJdg_ins_func_nm_NE(info);
		else if (ne == columnDtlWkJdg_upd_cntr) doDtlWkJdg_upd_cntr_NE(info);
		else if (ne == columnDtlWkJdg_upd_usr_id) doDtlWkJdg_upd_usr_id_NE(info);
		else if (ne == columnDtlWkJdg_upd_usr_nm) doDtlWkJdg_upd_usr_nm_NE(info);
		else if (ne == columnDtlWkJdg_upd_ts) doDtlWkJdg_upd_ts_NE(info);
		else if (ne == columnDtlWkJdg_upd_func_id) doDtlWkJdg_upd_func_id_NE(info);
		else if (ne == columnDtlWkJdg_upd_func_nm) doDtlWkJdg_upd_func_nm_NE(info);
		else if (ne == columnDtlWkJdg_upd_srv_req_no) doDtlWkJdg_upd_srv_req_no_NE(info);
		else if (ne == columnDtlWkJdg_del_usr_id) doDtlWkJdg_del_usr_id_NE(info);
		else if (ne == columnDtlWkJdg_del_usr_nm) doDtlWkJdg_del_usr_nm_NE(info);
		else if (ne == columnDtlWkJdg_del_ts) doDtlWkJdg_del_ts_NE(info);
		else if (ne == columnLcl_check) doLcl_check_NE(info);
		else if (ne == columnLcl_ship_wk_grp_cd) doLcl_ship_wk_grp_cd_NE(info);
		else if (ne == columnLcl_lcl_cd) doLcl_lcl_cd_NE(info);
		else if (ne == columnLcl_lcl_nm) doLcl_lcl_nm_NE(info);
		else if (ne == columnLcl_ship_wk_grp_nm) doLcl_ship_wk_grp_nm_NE(info);
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
	 * [BtmTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtmTab_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_wk_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_wk_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_grp_nm_lcl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_grp_nm_lcl_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_time_disp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_time_disp_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_time]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_time_NE(MCEventInfo info){
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
	 * [DtlWkJdg]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_check_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ship_wk_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ship_wk_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[dlv_ded_time_disp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_dlv_ded_time_disp_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[dlv_ded_time]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_dlv_ded_time_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ship_wk_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ship_wk_cd_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ship_wk_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ship_wk_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ship_schd_time_disp]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ship_schd_time_disp_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ship_schd_time]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ship_schd_time_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_memo1_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_memo2_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_memo3_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ship_wk_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ship_wk_grp_cd_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[ship_wk_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ship_wk_grp_nm_NE(MCEventInfo info){
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
		else if (nx == BtmTabTab) doBtmTab_NX(info);
		else if (nx == DtlWkJdgTable) doDtlWkJdg_NX(info);
		else if (nx == LclTable) doLcl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_ship_wk_grp_cd) doCnd_ship_wk_grp_cd_NX(info);
		else if (nx == Cnd_ship_wk_grp_nm) doCnd_ship_wk_grp_nm_NX(info);
		else if (nx == Cnd_ship_wk_cd) doCnd_ship_wk_cd_NX(info);
		else if (nx == Cnd_ship_wk_nm) doCnd_ship_wk_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_ship_wk_grp_cd) doDtl_ship_wk_grp_cd_NX(info);
		else if (nx == columnDtl_ship_wk_grp_nm_lcl) doDtl_ship_wk_grp_nm_lcl_NX(info);
		else if (nx == columnDtl_ship_wk_grp_nm) doDtl_ship_wk_grp_nm_NX(info);
		else if (nx == columnDtl_ship_wk_cd) doDtl_ship_wk_cd_NX(info);
		else if (nx == columnDtl_ship_wk_nm) doDtl_ship_wk_nm_NX(info);
		else if (nx == columnDtl_ship_schd_time_disp) doDtl_ship_schd_time_disp_NX(info);
		else if (nx == columnDtl_ship_schd_time) doDtl_ship_schd_time_NX(info);
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
		else if (nx == columnDtlWkJdg_check) doDtlWkJdg_check_NX(info);
		else if (nx == columnDtlWkJdg_del_flg) doDtlWkJdg_del_flg_NX(info);
		else if (nx == columnDtlWkJdg_ship_wk_grp_cd) doDtlWkJdg_ship_wk_grp_cd_NX(info);
		else if (nx == columnDtlWkJdg_dlv_ded_time_disp) doDtlWkJdg_dlv_ded_time_disp_NX(info);
		else if (nx == columnDtlWkJdg_dlv_ded_time) doDtlWkJdg_dlv_ded_time_NX(info);
		else if (nx == columnDtlWkJdg_ship_wk_cd) doDtlWkJdg_ship_wk_cd_NX(info);
		else if (nx == columnDtlWkJdg_ship_wk_nm) doDtlWkJdg_ship_wk_nm_NX(info);
		else if (nx == columnDtlWkJdg_ship_schd_time_disp) doDtlWkJdg_ship_schd_time_disp_NX(info);
		else if (nx == columnDtlWkJdg_ship_schd_time) doDtlWkJdg_ship_schd_time_NX(info);
		else if (nx == columnDtlWkJdg_memo1) doDtlWkJdg_memo1_NX(info);
		else if (nx == columnDtlWkJdg_memo2) doDtlWkJdg_memo2_NX(info);
		else if (nx == columnDtlWkJdg_memo3) doDtlWkJdg_memo3_NX(info);
		else if (nx == columnDtlWkJdg_ins_usr_id) doDtlWkJdg_ins_usr_id_NX(info);
		else if (nx == columnDtlWkJdg_ins_usr_nm) doDtlWkJdg_ins_usr_nm_NX(info);
		else if (nx == columnDtlWkJdg_ins_ts) doDtlWkJdg_ins_ts_NX(info);
		else if (nx == columnDtlWkJdg_ins_func_id) doDtlWkJdg_ins_func_id_NX(info);
		else if (nx == columnDtlWkJdg_ins_func_nm) doDtlWkJdg_ins_func_nm_NX(info);
		else if (nx == columnDtlWkJdg_upd_cntr) doDtlWkJdg_upd_cntr_NX(info);
		else if (nx == columnDtlWkJdg_upd_usr_id) doDtlWkJdg_upd_usr_id_NX(info);
		else if (nx == columnDtlWkJdg_upd_usr_nm) doDtlWkJdg_upd_usr_nm_NX(info);
		else if (nx == columnDtlWkJdg_upd_ts) doDtlWkJdg_upd_ts_NX(info);
		else if (nx == columnDtlWkJdg_upd_func_id) doDtlWkJdg_upd_func_id_NX(info);
		else if (nx == columnDtlWkJdg_upd_func_nm) doDtlWkJdg_upd_func_nm_NX(info);
		else if (nx == columnDtlWkJdg_upd_srv_req_no) doDtlWkJdg_upd_srv_req_no_NX(info);
		else if (nx == columnDtlWkJdg_del_usr_id) doDtlWkJdg_del_usr_id_NX(info);
		else if (nx == columnDtlWkJdg_del_usr_nm) doDtlWkJdg_del_usr_nm_NX(info);
		else if (nx == columnDtlWkJdg_del_ts) doDtlWkJdg_del_ts_NX(info);
		else if (nx == columnLcl_check) doLcl_check_NX(info);
		else if (nx == columnLcl_ship_wk_grp_cd) doLcl_ship_wk_grp_cd_NX(info);
		else if (nx == columnLcl_lcl_cd) doLcl_lcl_cd_NX(info);
		else if (nx == columnLcl_lcl_nm) doLcl_lcl_nm_NX(info);
		else if (nx == columnLcl_ship_wk_grp_nm) doLcl_ship_wk_grp_nm_NX(info);
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
	 * [BtmTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtmTab_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ship_wk_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_wk_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_grp_nm_lcl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_grp_nm_lcl_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_time_disp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_time_disp_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_time]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_time_NX(MCEventInfo info){
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
	 * [DtlWkJdg]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_check_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ship_wk_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ship_wk_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[dlv_ded_time_disp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_dlv_ded_time_disp_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[dlv_ded_time]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_dlv_ded_time_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ship_wk_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ship_wk_cd_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ship_wk_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ship_wk_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ship_schd_time_disp]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ship_schd_time_disp_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ship_schd_time]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ship_schd_time_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_memo1_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_memo2_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_memo3_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ship_wk_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ship_wk_grp_cd_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[ship_wk_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ship_wk_grp_nm_NX(MCEventInfo info){
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
		if (lc == Cnd_ship_wk_grp_cd) doCnd_ship_wk_grp_cd_LC(info);
		else if (lc == Cnd_ship_wk_grp_nm) doCnd_ship_wk_grp_nm_LC(info);
		else if (lc == Cnd_ship_wk_cd) doCnd_ship_wk_cd_LC(info);
		else if (lc == Cnd_ship_wk_nm) doCnd_ship_wk_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == columnDtl_ship_wk_grp_cd) doDtl_ship_wk_grp_cd_LC(info);
		else if (lc == columnDtl_ship_wk_grp_nm_lcl) doDtl_ship_wk_grp_nm_lcl_LC(info);
		else if (lc == columnDtl_ship_wk_grp_nm) doDtl_ship_wk_grp_nm_LC(info);
		else if (lc == columnDtl_ship_wk_cd) doDtl_ship_wk_cd_LC(info);
		else if (lc == columnDtl_ship_wk_nm) doDtl_ship_wk_nm_LC(info);
		else if (lc == columnDtl_ship_schd_time_disp) doDtl_ship_schd_time_disp_LC(info);
		else if (lc == columnDtl_ship_schd_time) doDtl_ship_schd_time_LC(info);
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
		else if (lc == columnDtlWkJdg_ship_wk_grp_cd) doDtlWkJdg_ship_wk_grp_cd_LC(info);
		else if (lc == columnDtlWkJdg_dlv_ded_time_disp) doDtlWkJdg_dlv_ded_time_disp_LC(info);
		else if (lc == columnDtlWkJdg_dlv_ded_time) doDtlWkJdg_dlv_ded_time_LC(info);
		else if (lc == columnDtlWkJdg_ship_wk_cd) doDtlWkJdg_ship_wk_cd_LC(info);
		else if (lc == columnDtlWkJdg_ship_wk_nm) doDtlWkJdg_ship_wk_nm_LC(info);
		else if (lc == columnDtlWkJdg_ship_schd_time_disp) doDtlWkJdg_ship_schd_time_disp_LC(info);
		else if (lc == columnDtlWkJdg_ship_schd_time) doDtlWkJdg_ship_schd_time_LC(info);
		else if (lc == columnDtlWkJdg_memo1) doDtlWkJdg_memo1_LC(info);
		else if (lc == columnDtlWkJdg_memo2) doDtlWkJdg_memo2_LC(info);
		else if (lc == columnDtlWkJdg_memo3) doDtlWkJdg_memo3_LC(info);
		else if (lc == columnDtlWkJdg_ins_usr_id) doDtlWkJdg_ins_usr_id_LC(info);
		else if (lc == columnDtlWkJdg_ins_usr_nm) doDtlWkJdg_ins_usr_nm_LC(info);
		else if (lc == columnDtlWkJdg_ins_ts) doDtlWkJdg_ins_ts_LC(info);
		else if (lc == columnDtlWkJdg_ins_func_id) doDtlWkJdg_ins_func_id_LC(info);
		else if (lc == columnDtlWkJdg_ins_func_nm) doDtlWkJdg_ins_func_nm_LC(info);
		else if (lc == columnDtlWkJdg_upd_cntr) doDtlWkJdg_upd_cntr_LC(info);
		else if (lc == columnDtlWkJdg_upd_usr_id) doDtlWkJdg_upd_usr_id_LC(info);
		else if (lc == columnDtlWkJdg_upd_usr_nm) doDtlWkJdg_upd_usr_nm_LC(info);
		else if (lc == columnDtlWkJdg_upd_ts) doDtlWkJdg_upd_ts_LC(info);
		else if (lc == columnDtlWkJdg_upd_func_id) doDtlWkJdg_upd_func_id_LC(info);
		else if (lc == columnDtlWkJdg_upd_func_nm) doDtlWkJdg_upd_func_nm_LC(info);
		else if (lc == columnDtlWkJdg_upd_srv_req_no) doDtlWkJdg_upd_srv_req_no_LC(info);
		else if (lc == columnDtlWkJdg_del_usr_id) doDtlWkJdg_del_usr_id_LC(info);
		else if (lc == columnDtlWkJdg_del_usr_nm) doDtlWkJdg_del_usr_nm_LC(info);
		else if (lc == columnDtlWkJdg_del_ts) doDtlWkJdg_del_ts_LC(info);
		else if (lc == columnLcl_ship_wk_grp_cd) doLcl_ship_wk_grp_cd_LC(info);
		else if (lc == columnLcl_lcl_cd) doLcl_lcl_cd_LC(info);
		else if (lc == columnLcl_lcl_nm) doLcl_lcl_nm_LC(info);
		else if (lc == columnLcl_ship_wk_grp_nm) doLcl_ship_wk_grp_nm_LC(info);
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
	 * [Cnd]パネルの[ship_wk_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_wk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_wk_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[ship_wk_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_grp_nm_lcl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_grp_nm_lcl_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wk_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_time_disp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_time_disp_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_time]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_time_LC(MCEventInfo info){
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
	 * [DtlWkJdg]パネルの[ship_wk_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ship_wk_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[dlv_ded_time_disp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_dlv_ded_time_disp_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[dlv_ded_time]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_dlv_ded_time_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ship_wk_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ship_wk_cd_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ship_wk_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ship_wk_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ship_schd_time_disp]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ship_schd_time_disp_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ship_schd_time]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ship_schd_time_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_memo1_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_memo2_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_memo3_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [DtlWkJdg]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlWkJdg_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ship_wk_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ship_wk_grp_cd_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[ship_wk_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ship_wk_grp_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_ship_wk_grp_cd]の作成メソッド
	 */
	public MCList getCnd_ship_wk_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipWkGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ship_wk_cd]の作成メソッド
	 */
	public MCList getCnd_ship_wk_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipWk(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ship_wk_cd]の作成メソッド
	 */
	public MCList getDtl_ship_wk_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipWk(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtlWkJdg_ship_wk_cd]の作成メソッド
	 */
	public MCList getDtlWkJdg_ship_wk_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipWk(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnLcl_lcl_cd]の作成メソッド
	 */
	public MCList getLcl_lcl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocaleEntry(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABSL0450.Srch01")) {
			return new MA_MABSL0450_Srch01Bridge();
		}
		if (id.equals("MA.MABSL0450.Upd01")) {
			return new MA_MABSL0450_Upd01Bridge();
		}
		if (id.equals("MA.MABSL0450.Del01")) {
			return new MA_MABSL0450_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABSL0450_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0450_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0450_Srch01;

		/** コンストラクタ */
		protected MA_MABSL0450_Srch01Bridge() {
			p_MA_MABSL0450_Srch01 = new MCParam(PDef.MA_MABSL0450_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0450_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABS.MABSP0450.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0450.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0450.DtlWkJdgR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0450.LclR.class));

			p_MA_MABSL0450_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0450_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0450_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0450_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0450_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABS.MABSP0450.CndR up0() {
			return (mcframe.clientMABS.MABSP0450.CndR)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP0450.DtlR> down0() {
			return (MCList<mcframe.clientMABS.MABSP0450.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMABS.MABSP0450.DtlWkJdgR> down1() {
			return (MCList<mcframe.clientMABS.MABSP0450.DtlWkJdgR>)down(1);
		}
		protected MCList<mcframe.clientMABS.MABSP0450.LclR> down2() {
			return (MCList<mcframe.clientMABS.MABSP0450.LclR>)down(2);
		}

		protected void setupDownParam() {
			p_MA_MABSL0450_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0450.DtlR.class));
			p_MA_MABSL0450_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0450.DtlWkJdgR.class));
			p_MA_MABSL0450_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0450.LclR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL0450_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABS.MABSP0450.DtlR>)p_MA_MABSL0450_Srch01.getContainerParam().getDownBlock(0));
			setDtlWkJdgAllL((MCList<mcframe.clientMABS.MABSP0450.DtlWkJdgR>)p_MA_MABSL0450_Srch01.getContainerParam().getDownBlock(1));
			setLclAllL((MCList<mcframe.clientMABS.MABSP0450.LclR>)p_MA_MABSL0450_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getDtlL().clear();
			getDtlWkJdgAllL().clear();
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
			result.add(getDtlWkJdgAllL());
			result.add(getLclAllL());
			return result;
		}
	}
	/**
	 * [MA_MABSL0450_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0450_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0450_Upd01;

		/** コンストラクタ */
		protected MA_MABSL0450_Upd01Bridge() {
			p_MA_MABSL0450_Upd01 = new MCParam(PDef.MA_MABSL0450_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0450_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0450.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0450.DtlWkJdgR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0450.LclR.class));
			// Down

			p_MA_MABSL0450_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0450_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0450_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABSL0450_Upd01.addUpBlock(getDtlWkJdgAllL().shallowClone());
			p_MA_MABSL0450_Upd01.addUpBlock(getLclAllL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0450_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0450_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0450.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0450.DtlR>)up(0);
		}
		protected MCList<mcframe.clientMABS.MABSP0450.DtlWkJdgR> up1() {
			return (MCList<mcframe.clientMABS.MABSP0450.DtlWkJdgR>)up(1);
		}
		protected MCList<mcframe.clientMABS.MABSP0450.LclR> up2() {
			return (MCList<mcframe.clientMABS.MABSP0450.LclR>)up(2);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL0450_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getDtlWkJdgAllL());
			result.add(getLclAllL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MA_MABSL0450_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0450_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0450_Del01;

		/** コンストラクタ */
		protected MA_MABSL0450_Del01Bridge() {
			p_MA_MABSL0450_Del01 = new MCParam(PDef.MA_MABSL0450_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0450_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0450.DtlR.class));
			// Down

			p_MA_MABSL0450_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0450_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0450_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0450_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0450_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0450.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0450.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL0450_Del01;
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