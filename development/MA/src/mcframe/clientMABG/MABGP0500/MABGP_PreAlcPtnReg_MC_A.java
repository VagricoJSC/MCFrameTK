package mcframe.clientMABG.MABGP0500;

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
import mcframe.clientMABG.MABGP0500.MABGP_PreAlcPtnReg_MC.MA_MABGL0500_Srch01Caller;
import mcframe.clientMABG.MABGP0500.MABGP_PreAlcPtnReg_MC.MA_MABGL0500_Upd01Caller;
import mcframe.clientMABG.MABGP0500.MABGP_PreAlcPtnReg_MC.MA_MABGL0500_Del01Caller;

/**
 * 画面"MABGP_PreAlcPtnReg"パネルクラスです。<p>
 *
 * 一次配賦パタンマスタ、一次配賦パタンマスタ(ロケール別情報)の検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABGP_PreAlcPtnReg_MC_A extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase{
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
	public static final String SUBMODULE_ID = "MABG";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABGP0500";

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
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_pre_alc_ptn_cd_Label = null;
	/**
	 * Departmental alloc. pattern cd. 一次配賦パタンＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_pre_alc_ptn_cd = null;
	/**
	 * Departmental alloc. pattern name 一次配賦パタン名.<p>
	 *
	 */
	public MCTextField Cnd_pre_alc_ptn_nm = null;
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
	public MCTable2<mcframe.clientMABG.MABGP0500.DtlR> DtlTable = null;
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
	 * Departmental alloc. pattern cd. 一次配賦パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pre_alc_ptn_cd = null;
	/**
	 * Departmental alloc. pattern name 一次配賦パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pre_alc_ptn_nm_lcl = null;
	/**
	 * Standard Departmental alloc. pattern name 標準一次配賦パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pre_alc_ptn_nm = null;
	/**
	 * Dept. allocation type 部門配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_alc_typ = null;
	/**
	 * Dept. allocation type name 部門配賦区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_alc_typ_nm = null;
	/**
	 * Location allocation type 場所配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_alc_typ = null;
	/**
	 * Location allocation type name 場所配賦区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_alc_typ_nm = null;
	/**
	 * Operation allocation type 工程配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_alc_typ = null;
	/**
	 * Operation allocation type name 工程配賦区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_alc_typ_nm = null;
	/**
	 * BP allocation type 取引先配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_alc_typ = null;
	/**
	 * BP allocation type name 取引先配賦区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_alc_typ_nm = null;
	/**
	 * Item category allocation type 品群配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ctg_alc_typ = null;
	/**
	 * Item category allocation type name 品群配賦区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ctg_alc_typ_nm = null;
	/**
	 * Item allocation type 品目配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_alc_typ = null;
	/**
	 * Item allocation type name 品目配賦区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_alc_typ_nm = null;
	/**
	 * Lot No. allocation type ロットＮＯ配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_alc_typ = null;
	/**
	 * Lot No. allocation type name ロットＮＯ配賦区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_alc_typ_nm = null;
	/**
	 * Sublot No. allocation type サブロットＮＯ配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_alc_typ = null;
	/**
	 * Sublot No. allocation type name サブロットＮＯ配賦区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_alc_typ_nm = null;
	/**
	 * SEIBAN No. 1 allocation type 手配ＮＯ１配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_alc_typ = null;
	/**
	 * SEIBAN No. 1 allocation type name 手配ＮＯ１配賦区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_alc_typ_nm = null;
	/**
	 * SEIBAN No. 2 allocation type 手配ＮＯ２配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_alc_typ = null;
	/**
	 * SEIBAN No. 2 allocation type name 手配ＮＯ２配賦区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_alc_typ_nm = null;
	/**
	 * SEIBAN No. 3 allocation type 手配ＮＯ３配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_alc_typ = null;
	/**
	 * SEIBAN No. 3 allocation type name 手配ＮＯ３配賦区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_alc_typ_nm = null;
	/**
	 * SEIBAN No. 4 allocation type 手配ＮＯ４配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_alc_typ = null;
	/**
	 * SEIBAN No. 4 allocation type name 手配ＮＯ４配賦区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_alc_typ_nm = null;
	/**
	 * Order allocation type 指図配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inst_alc_typ = null;
	/**
	 * Order allocation type name 指図配賦区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inst_alc_typ_nm = null;
	/**
	 * Invoice allocation type インボイス配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_alc_typ = null;
	/**
	 * Invoice allocation type name インボイス配賦区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_alc_typ_nm = null;
	/**
	 * PO allocation type 発注配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_alc_typ = null;
	/**
	 * PO allocation type name 発注配賦区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_alc_typ_nm = null;
	/**
	 * Sales order allocation type 受注配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_alc_typ = null;
	/**
	 * Sales order allocation type name 受注配賦区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_alc_typ_nm = null;
	/**
	 * Allocation account allocation type 配賦科目配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_ac_alc_typ = null;
	/**
	 * Allocation account allocation type name 配賦科目配賦区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_ac_alc_typ_nm = null;
	/**
	 * WG allocation type ワーキンググループ配賦区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_alc_typ = null;
	/**
	 * WG allocation type name ワーキンググループ配賦区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_alc_typ_nm = null;
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
	public MCTable2<mcframe.clientMABG.MABGP0500.LclR> LclTable = null;
	// [Lcl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnLcl_check = null;
	/**
	 * Departmental alloc. pattern cd. 一次配賦パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_pre_alc_ptn_cd = null;
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
	 * Departmental alloc. pattern name 一次配賦パタン名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_pre_alc_ptn_nm = null;
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
	
	/** [MA_MABGL0500_Srch01]のCallerの作成 */
	protected MABGP_PreAlcPtnReg_MC.MA_MABGL0500_Srch01Caller createMA_MABGL0500_Srch01() {
		MABGP_PreAlcPtnReg_MC.MA_MABGL0500_Srch01Caller<MABGP_PreAlcPtnReg, MA_MABGL0500_Srch01Bridge>
		caller = ((MABGP_PreAlcPtnReg_MC)this).new MA_MABGL0500_Srch01Caller<MABGP_PreAlcPtnReg, MA_MABGL0500_Srch01Bridge>(
					(MABGP_PreAlcPtnReg)this, new MA_MABGL0500_Srch01Bridge());
		return caller;
	}
	/** [MA_MABGL0500_Srch01]の呼び出し */
	protected void callMA_MABGL0500_Srch01() {
		MCCaller caller = createMA_MABGL0500_Srch01();
		caller.exec();
	}
	/** [MA_MABGL0500_Upd01]のCallerの作成 */
	protected MABGP_PreAlcPtnReg_MC.MA_MABGL0500_Upd01Caller createMA_MABGL0500_Upd01() {
		MABGP_PreAlcPtnReg_MC.MA_MABGL0500_Upd01Caller<MABGP_PreAlcPtnReg, MA_MABGL0500_Upd01Bridge>
		caller = ((MABGP_PreAlcPtnReg_MC)this).new MA_MABGL0500_Upd01Caller<MABGP_PreAlcPtnReg, MA_MABGL0500_Upd01Bridge>(
					(MABGP_PreAlcPtnReg)this, new MA_MABGL0500_Upd01Bridge());
		return caller;
	}
	/** [MA_MABGL0500_Upd01]の呼び出し */
	protected void callMA_MABGL0500_Upd01() {
		MCCaller caller = createMA_MABGL0500_Upd01();
		caller.exec();
	}
	/** [MA_MABGL0500_Del01]のCallerの作成 */
	protected MABGP_PreAlcPtnReg_MC.MA_MABGL0500_Del01Caller createMA_MABGL0500_Del01() {
		MABGP_PreAlcPtnReg_MC.MA_MABGL0500_Del01Caller<MABGP_PreAlcPtnReg, MA_MABGL0500_Del01Bridge>
		caller = ((MABGP_PreAlcPtnReg_MC)this).new MA_MABGL0500_Del01Caller<MABGP_PreAlcPtnReg, MA_MABGL0500_Del01Bridge>(
					(MABGP_PreAlcPtnReg)this, new MA_MABGL0500_Del01Bridge());
		return caller;
	}
	/** [MA_MABGL0500_Del01]の呼び出し */
	protected void callMA_MABGL0500_Del01() {
		MCCaller caller = createMA_MABGL0500_Del01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABG.MABGP0500.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABG.MABGP0500.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABG.MABGP0500.DtlR> aDtlL;
	/** [Lcl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABG.MABGP0500.LclR> aLclL;
	/** [LclAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABG.MABGP0500.LclR> aLclAllL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABG.MABGP0500.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABG.MABGP0500.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABG.MABGP0500.MstR createMstR() {
		return mcframe.clientMABG.MABGP0500.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABG.MABGP0500.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABG.MABGP0500.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABG.MABGP0500.CndR createCndR() {
		return mcframe.clientMABG.MABGP0500.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABG.MABGP0500.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABG.MABGP0500.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABG.MABGP0500.DtlR createDtlR() {
		return mcframe.clientMABG.MABGP0500.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABG.MABGP0500.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABG.MABGP0500.DtlR.class);
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
	public void setLclL(MCList<mcframe.clientMABG.MABGP0500.LclR> aList) {
		if (getLclL() != aList) {
			getLclL().setAll(aList);
		}
	}

	/**
	 * [Lcl]ブロックのコンテナaLclLを返します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABG.MABGP0500.LclR> getLclL() {
		return aLclL;
	}

	/**
	 * aLclRを作成します。
	 *
	 * @return LclR
	 */
	public mcframe.clientMABG.MABGP0500.LclR createLclR() {
		return mcframe.clientMABG.MABGP0500.LclR.create();
	}

	/**
	 * aLclLを作成します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABG.MABGP0500.LclR> createLclL() {
		return MCList.create(mcframe.clientMABG.MABGP0500.LclR.class);
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
	public void setLclAllL(MCList<mcframe.clientMABG.MABGP0500.LclR> aList) {
		if (getLclAllL() != aList) {
			getLclAllL().setAll(aList);
		}
	}

	/**
	 * [LclAll]ブロックのコンテナaLclAllLを返します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABG.MABGP0500.LclR> getLclAllL() {
		return aLclAllL;
	}

	/**
	 * aLclAllRを作成します。
	 *
	 * @return LclAllR
	 */
	public mcframe.clientMABG.MABGP0500.LclR createLclAllR() {
		return mcframe.clientMABG.MABGP0500.LclR.create();
	}

	/**
	 * aLclAllLを作成します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABG.MABGP0500.LclR> createLclAllL() {
		return MCList.create(mcframe.clientMABG.MABGP0500.LclR.class);
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
	public MABGP_PreAlcPtnReg_MC_A() {
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
	public MABGP_PreAlcPtnReg_MC_A(String name) {
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
		MABGP_PreAlcPtnReg_MC.jbCreateScreenOpe((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbCreateMst((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbCreateTop((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbCreateFold((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbCreateCnd((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbCreateCtrl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbCreateWrk((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbCreateDtl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbCreateDtlBtn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbCreateLclWrk((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbCreateLcl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbCreateLclBtn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbCreateBtn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbCreateEastBtn((MABGP_PreAlcPtnReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABGP_PreAlcPtnReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABGP_PreAlcPtnReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABGP_PreAlcPtnReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABGP_PreAlcPtnReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABGP_PreAlcPtnReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABGP_PreAlcPtnReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Wrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk(MABGP_PreAlcPtnReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABGP_PreAlcPtnReg p) {
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABGP_PreAlcPtnReg p) {
	}

	/**
	 * [LclWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclWrk(MABGP_PreAlcPtnReg p) {
	}

	/**
	 * [Lcl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLcl(MABGP_PreAlcPtnReg p) {
	}

	/**
	 * [LclBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclBtn(MABGP_PreAlcPtnReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABGP_PreAlcPtnReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABGP_PreAlcPtnReg p) {
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

	
	/** [Cnd_pre_alc_ptn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pre_alc_ptn_cd_p = null;

	/**
	 * [Cnd_pre_alc_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pre_alc_ptn_cd_ListPutter() {
		if (Cnd_pre_alc_ptn_cd_p == null) {
			Cnd_pre_alc_ptn_cd_p = createCnd_pre_alc_ptn_cd_ListPutter(Cnd_pre_alc_ptn_cd, "pre_alc_ptn_cd", "pre_alc_ptn_nm");

		}
		return Cnd_pre_alc_ptn_cd_p;
	}
	
	
	/** [Dtl_dpt_alc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_dpt_alc_typ_p = null;

	/**
	 * [Dtl_dpt_alc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dpt_alc_typ_ListPutter() {
		if (Dtl_dpt_alc_typ_p == null) {
			Dtl_dpt_alc_typ_p = createDtl_dpt_alc_typ_ListPutter(columnDtl_dpt_alc_typ, "dpt_alc_typ", "dpt_alc_typ_nm");

		}
		return Dtl_dpt_alc_typ_p;
	}
	
	
	/** [Dtl_loc_alc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_loc_alc_typ_p = null;

	/**
	 * [Dtl_loc_alc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_loc_alc_typ_ListPutter() {
		if (Dtl_loc_alc_typ_p == null) {
			Dtl_loc_alc_typ_p = createDtl_loc_alc_typ_ListPutter(columnDtl_loc_alc_typ, "loc_alc_typ", "loc_alc_typ_nm");

		}
		return Dtl_loc_alc_typ_p;
	}
	
	
	/** [Dtl_oper_alc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_oper_alc_typ_p = null;

	/**
	 * [Dtl_oper_alc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_oper_alc_typ_ListPutter() {
		if (Dtl_oper_alc_typ_p == null) {
			Dtl_oper_alc_typ_p = createDtl_oper_alc_typ_ListPutter(columnDtl_oper_alc_typ, "oper_alc_typ", "oper_alc_typ_nm");

		}
		return Dtl_oper_alc_typ_p;
	}
	
	
	/** [Dtl_bp_alc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_bp_alc_typ_p = null;

	/**
	 * [Dtl_bp_alc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bp_alc_typ_ListPutter() {
		if (Dtl_bp_alc_typ_p == null) {
			Dtl_bp_alc_typ_p = createDtl_bp_alc_typ_ListPutter(columnDtl_bp_alc_typ, "bp_alc_typ", "bp_alc_typ_nm");

		}
		return Dtl_bp_alc_typ_p;
	}
	
	
	/** [Dtl_ctg_alc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_ctg_alc_typ_p = null;

	/**
	 * [Dtl_ctg_alc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ctg_alc_typ_ListPutter() {
		if (Dtl_ctg_alc_typ_p == null) {
			Dtl_ctg_alc_typ_p = createDtl_ctg_alc_typ_ListPutter(columnDtl_ctg_alc_typ, "ctg_alc_typ", "ctg_alc_typ_nm");

		}
		return Dtl_ctg_alc_typ_p;
	}
	
	
	/** [Dtl_itm_alc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_itm_alc_typ_p = null;

	/**
	 * [Dtl_itm_alc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_alc_typ_ListPutter() {
		if (Dtl_itm_alc_typ_p == null) {
			Dtl_itm_alc_typ_p = createDtl_itm_alc_typ_ListPutter(columnDtl_itm_alc_typ, "itm_alc_typ", "itm_alc_typ_nm");

		}
		return Dtl_itm_alc_typ_p;
	}
	
	
	/** [Dtl_lot_alc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_lot_alc_typ_p = null;

	/**
	 * [Dtl_lot_alc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_lot_alc_typ_ListPutter() {
		if (Dtl_lot_alc_typ_p == null) {
			Dtl_lot_alc_typ_p = createDtl_lot_alc_typ_ListPutter(columnDtl_lot_alc_typ, "lot_alc_typ", "lot_alc_typ_nm");

		}
		return Dtl_lot_alc_typ_p;
	}
	
	
	/** [Dtl_sublot_alc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sublot_alc_typ_p = null;

	/**
	 * [Dtl_sublot_alc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sublot_alc_typ_ListPutter() {
		if (Dtl_sublot_alc_typ_p == null) {
			Dtl_sublot_alc_typ_p = createDtl_sublot_alc_typ_ListPutter(columnDtl_sublot_alc_typ, "sublot_alc_typ", "sublot_alc_typ_nm");

		}
		return Dtl_sublot_alc_typ_p;
	}
	
	
	/** [Dtl_sno1_alc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno1_alc_typ_p = null;

	/**
	 * [Dtl_sno1_alc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno1_alc_typ_ListPutter() {
		if (Dtl_sno1_alc_typ_p == null) {
			Dtl_sno1_alc_typ_p = createDtl_sno1_alc_typ_ListPutter(columnDtl_sno1_alc_typ, "sno1_alc_typ", "sno1_alc_typ_nm");

		}
		return Dtl_sno1_alc_typ_p;
	}
	
	
	/** [Dtl_sno2_alc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno2_alc_typ_p = null;

	/**
	 * [Dtl_sno2_alc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno2_alc_typ_ListPutter() {
		if (Dtl_sno2_alc_typ_p == null) {
			Dtl_sno2_alc_typ_p = createDtl_sno2_alc_typ_ListPutter(columnDtl_sno2_alc_typ, "sno2_alc_typ", "sno2_alc_typ_nm");

		}
		return Dtl_sno2_alc_typ_p;
	}
	
	
	/** [Dtl_sno3_alc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno3_alc_typ_p = null;

	/**
	 * [Dtl_sno3_alc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno3_alc_typ_ListPutter() {
		if (Dtl_sno3_alc_typ_p == null) {
			Dtl_sno3_alc_typ_p = createDtl_sno3_alc_typ_ListPutter(columnDtl_sno3_alc_typ, "sno3_alc_typ", "sno3_alc_typ_nm");

		}
		return Dtl_sno3_alc_typ_p;
	}
	
	
	/** [Dtl_sno4_alc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sno4_alc_typ_p = null;

	/**
	 * [Dtl_sno4_alc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno4_alc_typ_ListPutter() {
		if (Dtl_sno4_alc_typ_p == null) {
			Dtl_sno4_alc_typ_p = createDtl_sno4_alc_typ_ListPutter(columnDtl_sno4_alc_typ, "sno4_alc_typ", "sno4_alc_typ_nm");

		}
		return Dtl_sno4_alc_typ_p;
	}
	
	
	/** [Dtl_inst_alc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_inst_alc_typ_p = null;

	/**
	 * [Dtl_inst_alc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_inst_alc_typ_ListPutter() {
		if (Dtl_inst_alc_typ_p == null) {
			Dtl_inst_alc_typ_p = createDtl_inst_alc_typ_ListPutter(columnDtl_inst_alc_typ, "inst_alc_typ", "inst_alc_typ_nm");

		}
		return Dtl_inst_alc_typ_p;
	}
	
	
	/** [Dtl_iv_alc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_iv_alc_typ_p = null;

	/**
	 * [Dtl_iv_alc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_iv_alc_typ_ListPutter() {
		if (Dtl_iv_alc_typ_p == null) {
			Dtl_iv_alc_typ_p = createDtl_iv_alc_typ_ListPutter(columnDtl_iv_alc_typ, "iv_alc_typ", "iv_alc_typ_nm");

		}
		return Dtl_iv_alc_typ_p;
	}
	
	
	/** [Dtl_po_alc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_po_alc_typ_p = null;

	/**
	 * [Dtl_po_alc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_po_alc_typ_ListPutter() {
		if (Dtl_po_alc_typ_p == null) {
			Dtl_po_alc_typ_p = createDtl_po_alc_typ_ListPutter(columnDtl_po_alc_typ, "po_alc_typ", "po_alc_typ_nm");

		}
		return Dtl_po_alc_typ_p;
	}
	
	
	/** [Dtl_slo_alc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_slo_alc_typ_p = null;

	/**
	 * [Dtl_slo_alc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_slo_alc_typ_ListPutter() {
		if (Dtl_slo_alc_typ_p == null) {
			Dtl_slo_alc_typ_p = createDtl_slo_alc_typ_ListPutter(columnDtl_slo_alc_typ, "slo_alc_typ", "slo_alc_typ_nm");

		}
		return Dtl_slo_alc_typ_p;
	}
	
	
	/** [Dtl_alc_ac_alc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_alc_ac_alc_typ_p = null;

	/**
	 * [Dtl_alc_ac_alc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_alc_ac_alc_typ_ListPutter() {
		if (Dtl_alc_ac_alc_typ_p == null) {
			Dtl_alc_ac_alc_typ_p = createDtl_alc_ac_alc_typ_ListPutter(columnDtl_alc_ac_alc_typ, "alc_ac_alc_typ", "alc_ac_alc_typ_nm");

		}
		return Dtl_alc_ac_alc_typ_p;
	}
	
	
	/** [Dtl_wg_alc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_wg_alc_typ_p = null;

	/**
	 * [Dtl_wg_alc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_wg_alc_typ_ListPutter() {
		if (Dtl_wg_alc_typ_p == null) {
			Dtl_wg_alc_typ_p = createDtl_wg_alc_typ_ListPutter(columnDtl_wg_alc_typ, "wg_alc_typ", "wg_alc_typ_nm");

		}
		return Dtl_wg_alc_typ_p;
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
	public static MABGP_PreAlcPtnReg create(){
		MABGP_PreAlcPtnReg p = new MABGP_PreAlcPtnReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABGP_PreAlcPtnReg create(String name){
		MABGP_PreAlcPtnReg p = new MABGP_PreAlcPtnReg(name);
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
		MABGP_PreAlcPtnReg_MC.jbfInitScreenOpe((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbfInitMst((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbfInitTop((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbfInitFold((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbfInitCnd((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbfInitCtrl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbfInitWrk((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbfInitDtl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbfInitDtlBtn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbfInitLclWrk((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbfInitLcl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbfInitLclBtn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbfInitBtn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbfInitEastBtn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbInitScreenOpe((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbInitMst((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbInitTop((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbInitFold((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbInitCnd((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbInitCtrl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbInitWrk((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbInitDtl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbInitDtlBtn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbInitLclWrk((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbInitLcl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbInitLclBtn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbInitBtn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.jbInitEastBtn((MABGP_PreAlcPtnReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABGP_PreAlcPtnReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABGP_PreAlcPtnReg p) {
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
	protected static void jbfInitTop(MABGP_PreAlcPtnReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABGP_PreAlcPtnReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABGP_PreAlcPtnReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_pre_alc_ptn_cd_Label = p.beansFactory.createLabel("Cnd.pre_alc_ptn_cd_Label");
		p.Cnd_pre_alc_ptn_cd = p.beansFactory.createTextComboBox("Cnd.pre_alc_ptn_cd");
		p.Cnd_pre_alc_ptn_cd.setLabel(p.Cnd_pre_alc_ptn_cd_Label);
		p.Cnd_pre_alc_ptn_nm = p.beansFactory.createTextField("Cnd.pre_alc_ptn_nm");
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
	protected static void jbfInitCtrl(MABGP_PreAlcPtnReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk(MABGP_PreAlcPtnReg p) {
		// ブロック関連の初期化
		p.WrkPanel = p.beansFactory.createPanel("Wrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABGP_PreAlcPtnReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_pre_alc_ptn_cd = p.beansFactory.createTableColumn("Dtl.pre_alc_ptn_cd", MCColumnType.TEXT);
		p.columnDtl_pre_alc_ptn_nm_lcl = p.beansFactory.createTableColumn("Dtl.pre_alc_ptn_nm_lcl", MCColumnType.TEXT);
		p.columnDtl_pre_alc_ptn_nm = p.beansFactory.createTableColumn("Dtl.pre_alc_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_dpt_alc_typ = p.beansFactory.createTableColumn("Dtl.dpt_alc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_dpt_alc_typ_nm = p.beansFactory.createTableColumn("Dtl.dpt_alc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_loc_alc_typ = p.beansFactory.createTableColumn("Dtl.loc_alc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_loc_alc_typ_nm = p.beansFactory.createTableColumn("Dtl.loc_alc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_oper_alc_typ = p.beansFactory.createTableColumn("Dtl.oper_alc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_oper_alc_typ_nm = p.beansFactory.createTableColumn("Dtl.oper_alc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_bp_alc_typ = p.beansFactory.createTableColumn("Dtl.bp_alc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_bp_alc_typ_nm = p.beansFactory.createTableColumn("Dtl.bp_alc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_ctg_alc_typ = p.beansFactory.createTableColumn("Dtl.ctg_alc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_ctg_alc_typ_nm = p.beansFactory.createTableColumn("Dtl.ctg_alc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_itm_alc_typ = p.beansFactory.createTableColumn("Dtl.itm_alc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_alc_typ_nm = p.beansFactory.createTableColumn("Dtl.itm_alc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_lot_alc_typ = p.beansFactory.createTableColumn("Dtl.lot_alc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_lot_alc_typ_nm = p.beansFactory.createTableColumn("Dtl.lot_alc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sublot_alc_typ = p.beansFactory.createTableColumn("Dtl.sublot_alc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sublot_alc_typ_nm = p.beansFactory.createTableColumn("Dtl.sublot_alc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno1_alc_typ = p.beansFactory.createTableColumn("Dtl.sno1_alc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno1_alc_typ_nm = p.beansFactory.createTableColumn("Dtl.sno1_alc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno2_alc_typ = p.beansFactory.createTableColumn("Dtl.sno2_alc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno2_alc_typ_nm = p.beansFactory.createTableColumn("Dtl.sno2_alc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno3_alc_typ = p.beansFactory.createTableColumn("Dtl.sno3_alc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno3_alc_typ_nm = p.beansFactory.createTableColumn("Dtl.sno3_alc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sno4_alc_typ = p.beansFactory.createTableColumn("Dtl.sno4_alc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno4_alc_typ_nm = p.beansFactory.createTableColumn("Dtl.sno4_alc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_inst_alc_typ = p.beansFactory.createTableColumn("Dtl.inst_alc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_inst_alc_typ_nm = p.beansFactory.createTableColumn("Dtl.inst_alc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_iv_alc_typ = p.beansFactory.createTableColumn("Dtl.iv_alc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_iv_alc_typ_nm = p.beansFactory.createTableColumn("Dtl.iv_alc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_po_alc_typ = p.beansFactory.createTableColumn("Dtl.po_alc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_po_alc_typ_nm = p.beansFactory.createTableColumn("Dtl.po_alc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_slo_alc_typ = p.beansFactory.createTableColumn("Dtl.slo_alc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_slo_alc_typ_nm = p.beansFactory.createTableColumn("Dtl.slo_alc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_alc_ac_alc_typ = p.beansFactory.createTableColumn("Dtl.alc_ac_alc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_alc_ac_alc_typ_nm = p.beansFactory.createTableColumn("Dtl.alc_ac_alc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_wg_alc_typ = p.beansFactory.createTableColumn("Dtl.wg_alc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_wg_alc_typ_nm = p.beansFactory.createTableColumn("Dtl.wg_alc_typ_nm", MCColumnType.TEXT);
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
	protected static void jbfInitDtlBtn(MABGP_PreAlcPtnReg p) {
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
	protected static void jbfInitLclWrk(MABGP_PreAlcPtnReg p) {
		// ブロック関連の初期化
		p.LclWrkPanel = p.beansFactory.createPanel("LclWrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLcl(MABGP_PreAlcPtnReg p) {
		// ブロック関連の初期化
		p.LclPanel = p.beansFactory.createPanel("Lcl");
		p.LclScrollPane = p.beansFactory.createScrollPane("Lcl.scroll");
		p.createLclTable();
		// ブロックの項目の初期化
		p.columnLcl_check = p.beansFactory.createTableColumn("Lcl.check", MCColumnType.CHECK);
		p.columnLcl_pre_alc_ptn_cd = p.beansFactory.createTableColumn("Lcl.pre_alc_ptn_cd", MCColumnType.TEXT);
		p.columnLcl_lcl_cd = p.beansFactory.createTableColumn("Lcl.lcl_cd", MCColumnType.TEXT_COMBO);
		p.columnLcl_lcl_nm = p.beansFactory.createTableColumn("Lcl.lcl_nm", MCColumnType.TEXT);
		p.columnLcl_pre_alc_ptn_nm = p.beansFactory.createTableColumn("Lcl.pre_alc_ptn_nm", MCColumnType.TEXT);
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
	protected static void jbfInitLclBtn(MABGP_PreAlcPtnReg p) {
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
	protected static void jbfInitBtn(MABGP_PreAlcPtnReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABGP_PreAlcPtnReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABGP_PreAlcPtnReg p) {
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
	protected static void jbInitMst(MABGP_PreAlcPtnReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.TopPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABG.MABGP0500.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABGP_PreAlcPtnReg p) {
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
	protected static void jbInitFold(MABGP_PreAlcPtnReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABGP_PreAlcPtnReg p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABG.MABGP0500.CndR.ope_META);
		p.Cnd_pre_alc_ptn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pre_alc_ptn_cd, true);
		p.Cnd_pre_alc_ptn_cd.setLinkBeans(p.Cnd_pre_alc_ptn_nm);
		p.CndPanel.add(p.Cnd_pre_alc_ptn_cd_Label);
		p.CndPanel.add(p.Cnd_pre_alc_ptn_cd);
		p.CndPanel.setLastBeans(p.Cnd_pre_alc_ptn_cd);
		p.Cnd_pre_alc_ptn_cd.setNextBeans(p.Cnd_pre_alc_ptn_nm);
		p.Cnd_pre_alc_ptn_cd.setRow(p.getCndR(), mcframe.clientMABG.MABGP0500.CndR.pre_alc_ptn_cd_META);
		p.CndPanel.add(p.Cnd_pre_alc_ptn_nm);
		p.Cnd_pre_alc_ptn_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_pre_alc_ptn_nm.setRow(p.getCndR(), mcframe.clientMABG.MABGP0500.CndR.pre_alc_ptn_nm_META);
		p.setPluralValueEnable(p.Cnd_pre_alc_ptn_nm, true);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABG.MABGP0500.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABG.MABGP0500.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABG.MABGP0500.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABG.MABGP0500.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABG.MABGP0500.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABGP_PreAlcPtnReg p) {
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
	protected static void jbInitWrk(MABGP_PreAlcPtnReg p) {
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
	protected static void jbInitDtl(MABGP_PreAlcPtnReg p) {
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
	protected static void jbInitDtlBtn(MABGP_PreAlcPtnReg p) {
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
	protected static void jbInitLclWrk(MABGP_PreAlcPtnReg p) {
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
	protected static void jbInitLcl(MABGP_PreAlcPtnReg p) {
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
	protected static void jbInitLclBtn(MABGP_PreAlcPtnReg p) {
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
	protected static void jbInitBtn(MABGP_PreAlcPtnReg p) {
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
	protected static void jbInitEastBtn(MABGP_PreAlcPtnReg p) {
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
		MABGP_PreAlcPtnReg_MC.mcInitScreenOpe((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.mcInitMst((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.mcInitTop((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.mcInitFold((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.mcInitCnd((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.mcInitCtrl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.mcInitWrk((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.mcInitDtl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.mcInitDtlBtn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.mcInitLclWrk((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.mcInitLcl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.mcInitLclBtn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.mcInitBtn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.mcInitEastBtn((MABGP_PreAlcPtnReg)this);

		// [UPD]ステータスのモードの設定
		MABGP_PreAlcPtnReg_MC.statusInitUPD_ScreenOpe((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitUPD_Mst((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitUPD_Top((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitUPD_Fold((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitUPD_Cnd((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitUPD_Ctrl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitUPD_Wrk((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitUPD_Dtl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitUPD_DtlBtn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitUPD_LclWrk((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitUPD_Lcl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitUPD_LclAll((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitUPD_LclBtn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitUPD_Btn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitUPD_EastBtn((MABGP_PreAlcPtnReg)this);

		// [FIX]ステータスのモードの設定
		MABGP_PreAlcPtnReg_MC.statusInitFIX_ScreenOpe((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitFIX_Mst((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitFIX_Top((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitFIX_Fold((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitFIX_Cnd((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitFIX_Ctrl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitFIX_Wrk((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitFIX_Dtl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitFIX_DtlBtn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitFIX_LclWrk((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitFIX_Lcl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitFIX_LclAll((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitFIX_LclBtn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitFIX_Btn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitFIX_EastBtn((MABGP_PreAlcPtnReg)this);

		// [DEL]ステータスのモードの設定
		MABGP_PreAlcPtnReg_MC.statusInitDEL_ScreenOpe((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitDEL_Mst((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitDEL_Top((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitDEL_Fold((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitDEL_Cnd((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitDEL_Ctrl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitDEL_Wrk((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitDEL_Dtl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitDEL_DtlBtn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitDEL_LclWrk((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitDEL_Lcl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitDEL_LclAll((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitDEL_LclBtn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitDEL_Btn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitDEL_EastBtn((MABGP_PreAlcPtnReg)this);

		// [REF]ステータスのモードの設定
		MABGP_PreAlcPtnReg_MC.statusInitREF_ScreenOpe((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitREF_Mst((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitREF_Top((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitREF_Fold((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitREF_Cnd((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitREF_Ctrl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitREF_Wrk((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitREF_Dtl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitREF_DtlBtn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitREF_LclWrk((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitREF_Lcl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitREF_LclAll((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitREF_LclBtn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitREF_Btn((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.statusInitREF_EastBtn((MABGP_PreAlcPtnReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABGP_PreAlcPtnReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABGP_PreAlcPtnReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABGP_PreAlcPtnReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABGP_PreAlcPtnReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABGP_PreAlcPtnReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_pre_alc_ptn_cd.setListListener(p);
		p.Cnd_pre_alc_ptn_cd.addAllListener(p);
		p.Cnd_pre_alc_ptn_nm.setListListener(p);
		p.Cnd_pre_alc_ptn_nm.addAllListener(p);
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
	protected static void mcInitCtrl(MABGP_PreAlcPtnReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Wrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk(MABGP_PreAlcPtnReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABGP_PreAlcPtnReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_pre_alc_ptn_cd.addAllListener(p);
		p.columnDtl_pre_alc_ptn_cd.setListListener(p);
		p.columnDtl_pre_alc_ptn_nm_lcl.addAllListener(p);
		p.columnDtl_pre_alc_ptn_nm_lcl.setListListener(p);
		p.columnDtl_pre_alc_ptn_nm.addAllListener(p);
		p.columnDtl_pre_alc_ptn_nm.setListListener(p);
		p.columnDtl_dpt_alc_typ.addAllListener(p);
		p.columnDtl_dpt_alc_typ.setListListener(p);
		p.columnDtl_dpt_alc_typ_nm.addAllListener(p);
		p.columnDtl_dpt_alc_typ_nm.setListListener(p);
		p.columnDtl_loc_alc_typ.addAllListener(p);
		p.columnDtl_loc_alc_typ.setListListener(p);
		p.columnDtl_loc_alc_typ_nm.addAllListener(p);
		p.columnDtl_loc_alc_typ_nm.setListListener(p);
		p.columnDtl_oper_alc_typ.addAllListener(p);
		p.columnDtl_oper_alc_typ.setListListener(p);
		p.columnDtl_oper_alc_typ_nm.addAllListener(p);
		p.columnDtl_oper_alc_typ_nm.setListListener(p);
		p.columnDtl_bp_alc_typ.addAllListener(p);
		p.columnDtl_bp_alc_typ.setListListener(p);
		p.columnDtl_bp_alc_typ_nm.addAllListener(p);
		p.columnDtl_bp_alc_typ_nm.setListListener(p);
		p.columnDtl_ctg_alc_typ.addAllListener(p);
		p.columnDtl_ctg_alc_typ.setListListener(p);
		p.columnDtl_ctg_alc_typ_nm.addAllListener(p);
		p.columnDtl_ctg_alc_typ_nm.setListListener(p);
		p.columnDtl_itm_alc_typ.addAllListener(p);
		p.columnDtl_itm_alc_typ.setListListener(p);
		p.columnDtl_itm_alc_typ_nm.addAllListener(p);
		p.columnDtl_itm_alc_typ_nm.setListListener(p);
		p.columnDtl_lot_alc_typ.addAllListener(p);
		p.columnDtl_lot_alc_typ.setListListener(p);
		p.columnDtl_lot_alc_typ_nm.addAllListener(p);
		p.columnDtl_lot_alc_typ_nm.setListListener(p);
		p.columnDtl_sublot_alc_typ.addAllListener(p);
		p.columnDtl_sublot_alc_typ.setListListener(p);
		p.columnDtl_sublot_alc_typ_nm.addAllListener(p);
		p.columnDtl_sublot_alc_typ_nm.setListListener(p);
		p.columnDtl_sno1_alc_typ.addAllListener(p);
		p.columnDtl_sno1_alc_typ.setListListener(p);
		p.columnDtl_sno1_alc_typ_nm.addAllListener(p);
		p.columnDtl_sno1_alc_typ_nm.setListListener(p);
		p.columnDtl_sno2_alc_typ.addAllListener(p);
		p.columnDtl_sno2_alc_typ.setListListener(p);
		p.columnDtl_sno2_alc_typ_nm.addAllListener(p);
		p.columnDtl_sno2_alc_typ_nm.setListListener(p);
		p.columnDtl_sno3_alc_typ.addAllListener(p);
		p.columnDtl_sno3_alc_typ.setListListener(p);
		p.columnDtl_sno3_alc_typ_nm.addAllListener(p);
		p.columnDtl_sno3_alc_typ_nm.setListListener(p);
		p.columnDtl_sno4_alc_typ.addAllListener(p);
		p.columnDtl_sno4_alc_typ.setListListener(p);
		p.columnDtl_sno4_alc_typ_nm.addAllListener(p);
		p.columnDtl_sno4_alc_typ_nm.setListListener(p);
		p.columnDtl_inst_alc_typ.addAllListener(p);
		p.columnDtl_inst_alc_typ.setListListener(p);
		p.columnDtl_inst_alc_typ_nm.addAllListener(p);
		p.columnDtl_inst_alc_typ_nm.setListListener(p);
		p.columnDtl_iv_alc_typ.addAllListener(p);
		p.columnDtl_iv_alc_typ.setListListener(p);
		p.columnDtl_iv_alc_typ_nm.addAllListener(p);
		p.columnDtl_iv_alc_typ_nm.setListListener(p);
		p.columnDtl_po_alc_typ.addAllListener(p);
		p.columnDtl_po_alc_typ.setListListener(p);
		p.columnDtl_po_alc_typ_nm.addAllListener(p);
		p.columnDtl_po_alc_typ_nm.setListListener(p);
		p.columnDtl_slo_alc_typ.addAllListener(p);
		p.columnDtl_slo_alc_typ.setListListener(p);
		p.columnDtl_slo_alc_typ_nm.addAllListener(p);
		p.columnDtl_slo_alc_typ_nm.setListListener(p);
		p.columnDtl_alc_ac_alc_typ.addAllListener(p);
		p.columnDtl_alc_ac_alc_typ.setListListener(p);
		p.columnDtl_alc_ac_alc_typ_nm.addAllListener(p);
		p.columnDtl_alc_ac_alc_typ_nm.setListListener(p);
		p.columnDtl_wg_alc_typ.addAllListener(p);
		p.columnDtl_wg_alc_typ.setListListener(p);
		p.columnDtl_wg_alc_typ_nm.addAllListener(p);
		p.columnDtl_wg_alc_typ_nm.setListListener(p);
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
	protected static void mcInitDtlBtn(MABGP_PreAlcPtnReg p) {
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
	protected static void mcInitLclWrk(MABGP_PreAlcPtnReg p) {
	}

	/**
	 *  [Lcl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLcl(MABGP_PreAlcPtnReg p) {
		p.LclTable.addAllListener(p);
		p.columnLcl_check.addAllListener(p);
		p.columnLcl_pre_alc_ptn_cd.addAllListener(p);
		p.columnLcl_pre_alc_ptn_cd.setListListener(p);
		p.columnLcl_lcl_cd.addAllListener(p);
		p.columnLcl_lcl_cd.setListListener(p);
		p.columnLcl_lcl_nm.addAllListener(p);
		p.columnLcl_lcl_nm.setListListener(p);
		p.columnLcl_pre_alc_ptn_nm.addAllListener(p);
		p.columnLcl_pre_alc_ptn_nm.setListListener(p);
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
	protected static void mcInitLclBtn(MABGP_PreAlcPtnReg p) {
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
	protected static void mcInitBtn(MABGP_PreAlcPtnReg p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABGP_PreAlcPtnReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABGP_PreAlcPtnReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABGP_PreAlcPtnReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_pre_alc_ptn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_pre_alc_ptn_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABGP_PreAlcPtnReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_pre_alc_ptn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_pre_alc_ptn_nm_lcl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_ptn_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_dpt_alc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dpt_alc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_loc_alc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_loc_alc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_oper_alc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_oper_alc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bp_alc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bp_alc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ctg_alc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ctg_alc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_alc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itm_alc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_lot_alc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_lot_alc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sublot_alc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sublot_alc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno1_alc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno1_alc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno2_alc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno2_alc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno3_alc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno3_alc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno4_alc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno4_alc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_inst_alc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_inst_alc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_iv_alc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_iv_alc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_alc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_po_alc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_alc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_slo_alc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_alc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_alc_ac_alc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wg_alc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_wg_alc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
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
	protected static void statusInitUPD_DtlBtn(MABGP_PreAlcPtnReg p){
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclWrk(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [UPD]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Lcl(MABGP_PreAlcPtnReg p){
		p.columnLcl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_pre_alc_ptn_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_pre_alc_ptn_nm.putMode(p, UPD, MCMode.REQUIRED);
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
	protected static void statusInitUPD_LclAll(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [UPD]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclBtn(MABGP_PreAlcPtnReg p){
		p.LclBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABGP_PreAlcPtnReg p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABGP_PreAlcPtnReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABGP_PreAlcPtnReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_pre_alc_ptn_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_pre_alc_ptn_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABGP_PreAlcPtnReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_ptn_nm_lcl.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dpt_alc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dpt_alc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_loc_alc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_loc_alc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_oper_alc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_oper_alc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_alc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_alc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ctg_alc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ctg_alc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_alc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_alc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lot_alc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lot_alc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sublot_alc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sublot_alc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno1_alc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno1_alc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno2_alc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno2_alc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno3_alc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno3_alc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno4_alc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno4_alc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_inst_alc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_inst_alc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_iv_alc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_iv_alc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_po_alc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_po_alc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_slo_alc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_slo_alc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_alc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_alc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wg_alc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wg_alc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
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
	protected static void statusInitFIX_DtlBtn(MABGP_PreAlcPtnReg p){
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclWrk(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [FIX]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Lcl(MABGP_PreAlcPtnReg p){
		p.columnLcl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_pre_alc_ptn_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnLcl_pre_alc_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
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
	protected static void statusInitFIX_LclAll(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [FIX]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LclBtn(MABGP_PreAlcPtnReg p){
		p.LclBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABGP_PreAlcPtnReg p){
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [DEL]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mst(MABGP_PreAlcPtnReg p){
		p.Mst_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABGP_PreAlcPtnReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_pre_alc_ptn_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_pre_alc_ptn_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [DEL]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Wrk(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABGP_PreAlcPtnReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_ptn_nm_lcl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dpt_alc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dpt_alc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_alc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_alc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_alc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_alc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_alc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_alc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ctg_alc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ctg_alc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_alc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_alc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lot_alc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lot_alc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sublot_alc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sublot_alc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno1_alc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno1_alc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno2_alc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno2_alc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno3_alc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno3_alc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno4_alc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno4_alc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inst_alc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inst_alc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_iv_alc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_iv_alc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_alc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_alc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_alc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_alc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_alc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_alc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_alc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_alc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
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
	protected static void statusInitDEL_DtlBtn(MABGP_PreAlcPtnReg p){
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclWrk(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [DEL]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Lcl(MABGP_PreAlcPtnReg p){
		p.columnLcl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_pre_alc_ptn_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_pre_alc_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
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
	protected static void statusInitDEL_LclAll(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [DEL]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclBtn(MABGP_PreAlcPtnReg p){
		p.LclBtn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABGP_PreAlcPtnReg p){
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABGP_PreAlcPtnReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABGP_PreAlcPtnReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_pre_alc_ptn_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_pre_alc_ptn_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [REF]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABGP_PreAlcPtnReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_ptn_nm_lcl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pre_alc_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dpt_alc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dpt_alc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_alc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_alc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_alc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_alc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_alc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_alc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ctg_alc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ctg_alc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_alc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_alc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_alc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_alc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sublot_alc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sublot_alc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno1_alc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno1_alc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno2_alc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno2_alc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno3_alc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno3_alc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno4_alc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno4_alc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inst_alc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inst_alc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_iv_alc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_iv_alc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_alc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_alc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_alc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_alc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_alc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_alc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_alc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_alc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_DtlBtn(MABGP_PreAlcPtnReg p){
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclWrk(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [REF]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Lcl(MABGP_PreAlcPtnReg p){
		p.columnLcl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_pre_alc_ptn_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_pre_alc_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_LclAll(MABGP_PreAlcPtnReg p){

	}

	/**
	 * [REF]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclBtn(MABGP_PreAlcPtnReg p){
		p.LclBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABGP_PreAlcPtnReg p){
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABGP_PreAlcPtnReg p){

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
		MABGP_PreAlcPtnReg_MC.setTableConfigDtl((MABGP_PreAlcPtnReg)this);
		MABGP_PreAlcPtnReg_MC.setTableConfigLcl((MABGP_PreAlcPtnReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABGP_PreAlcPtnReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABG.MABGP0500.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABG.MABGP0500.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_pre_alc_ptn_cd.setMeta(mcframe.clientMABG.MABGP0500.DtlR.pre_alc_ptn_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pre_alc_ptn_cd);
		p.columnDtl_pre_alc_ptn_nm_lcl.setMeta(mcframe.clientMABG.MABGP0500.DtlR.pre_alc_ptn_nm_lcl_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pre_alc_ptn_nm_lcl);
		p.columnDtl_pre_alc_ptn_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.pre_alc_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pre_alc_ptn_nm);
		p.columnDtl_dpt_alc_typ.setMeta(mcframe.clientMABG.MABGP0500.DtlR.dpt_alc_typ_META);
		p.columnDtl_dpt_alc_typ.addLinkBeans(p.columnDtl_dpt_alc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_alc_typ);
		p.columnDtl_dpt_alc_typ_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.dpt_alc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_alc_typ_nm);
		p.columnDtl_loc_alc_typ.setMeta(mcframe.clientMABG.MABGP0500.DtlR.loc_alc_typ_META);
		p.columnDtl_loc_alc_typ.addLinkBeans(p.columnDtl_loc_alc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_alc_typ);
		p.columnDtl_loc_alc_typ_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.loc_alc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_alc_typ_nm);
		p.columnDtl_oper_alc_typ.setMeta(mcframe.clientMABG.MABGP0500.DtlR.oper_alc_typ_META);
		p.columnDtl_oper_alc_typ.addLinkBeans(p.columnDtl_oper_alc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_alc_typ);
		p.columnDtl_oper_alc_typ_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.oper_alc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_alc_typ_nm);
		p.columnDtl_bp_alc_typ.setMeta(mcframe.clientMABG.MABGP0500.DtlR.bp_alc_typ_META);
		p.columnDtl_bp_alc_typ.addLinkBeans(p.columnDtl_bp_alc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_alc_typ);
		p.columnDtl_bp_alc_typ_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.bp_alc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_alc_typ_nm);
		p.columnDtl_ctg_alc_typ.setMeta(mcframe.clientMABG.MABGP0500.DtlR.ctg_alc_typ_META);
		p.columnDtl_ctg_alc_typ.addLinkBeans(p.columnDtl_ctg_alc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ctg_alc_typ);
		p.columnDtl_ctg_alc_typ_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.ctg_alc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ctg_alc_typ_nm);
		p.columnDtl_itm_alc_typ.setMeta(mcframe.clientMABG.MABGP0500.DtlR.itm_alc_typ_META);
		p.columnDtl_itm_alc_typ.addLinkBeans(p.columnDtl_itm_alc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_alc_typ);
		p.columnDtl_itm_alc_typ_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.itm_alc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_alc_typ_nm);
		p.columnDtl_lot_alc_typ.setMeta(mcframe.clientMABG.MABGP0500.DtlR.lot_alc_typ_META);
		p.columnDtl_lot_alc_typ.addLinkBeans(p.columnDtl_lot_alc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_alc_typ);
		p.columnDtl_lot_alc_typ_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.lot_alc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_alc_typ_nm);
		p.columnDtl_sublot_alc_typ.setMeta(mcframe.clientMABG.MABGP0500.DtlR.sublot_alc_typ_META);
		p.columnDtl_sublot_alc_typ.addLinkBeans(p.columnDtl_sublot_alc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_alc_typ);
		p.columnDtl_sublot_alc_typ_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.sublot_alc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_alc_typ_nm);
		p.columnDtl_sno1_alc_typ.setMeta(mcframe.clientMABG.MABGP0500.DtlR.sno1_alc_typ_META);
		p.columnDtl_sno1_alc_typ.addLinkBeans(p.columnDtl_sno1_alc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_alc_typ);
		p.columnDtl_sno1_alc_typ_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.sno1_alc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_alc_typ_nm);
		p.columnDtl_sno2_alc_typ.setMeta(mcframe.clientMABG.MABGP0500.DtlR.sno2_alc_typ_META);
		p.columnDtl_sno2_alc_typ.addLinkBeans(p.columnDtl_sno2_alc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_alc_typ);
		p.columnDtl_sno2_alc_typ_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.sno2_alc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_alc_typ_nm);
		p.columnDtl_sno3_alc_typ.setMeta(mcframe.clientMABG.MABGP0500.DtlR.sno3_alc_typ_META);
		p.columnDtl_sno3_alc_typ.addLinkBeans(p.columnDtl_sno3_alc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_alc_typ);
		p.columnDtl_sno3_alc_typ_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.sno3_alc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_alc_typ_nm);
		p.columnDtl_sno4_alc_typ.setMeta(mcframe.clientMABG.MABGP0500.DtlR.sno4_alc_typ_META);
		p.columnDtl_sno4_alc_typ.addLinkBeans(p.columnDtl_sno4_alc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_alc_typ);
		p.columnDtl_sno4_alc_typ_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.sno4_alc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_alc_typ_nm);
		p.columnDtl_inst_alc_typ.setMeta(mcframe.clientMABG.MABGP0500.DtlR.inst_alc_typ_META);
		p.columnDtl_inst_alc_typ.addLinkBeans(p.columnDtl_inst_alc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_inst_alc_typ);
		p.columnDtl_inst_alc_typ_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.inst_alc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inst_alc_typ_nm);
		p.columnDtl_iv_alc_typ.setMeta(mcframe.clientMABG.MABGP0500.DtlR.iv_alc_typ_META);
		p.columnDtl_iv_alc_typ.addLinkBeans(p.columnDtl_iv_alc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_alc_typ);
		p.columnDtl_iv_alc_typ_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.iv_alc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_alc_typ_nm);
		p.columnDtl_po_alc_typ.setMeta(mcframe.clientMABG.MABGP0500.DtlR.po_alc_typ_META);
		p.columnDtl_po_alc_typ.addLinkBeans(p.columnDtl_po_alc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_po_alc_typ);
		p.columnDtl_po_alc_typ_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.po_alc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_alc_typ_nm);
		p.columnDtl_slo_alc_typ.setMeta(mcframe.clientMABG.MABGP0500.DtlR.slo_alc_typ_META);
		p.columnDtl_slo_alc_typ.addLinkBeans(p.columnDtl_slo_alc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_alc_typ);
		p.columnDtl_slo_alc_typ_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.slo_alc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_alc_typ_nm);
		p.columnDtl_alc_ac_alc_typ.setMeta(mcframe.clientMABG.MABGP0500.DtlR.alc_ac_alc_typ_META);
		p.columnDtl_alc_ac_alc_typ.addLinkBeans(p.columnDtl_alc_ac_alc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_ac_alc_typ);
		p.columnDtl_alc_ac_alc_typ_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.alc_ac_alc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_ac_alc_typ_nm);
		p.columnDtl_wg_alc_typ.setMeta(mcframe.clientMABG.MABGP0500.DtlR.wg_alc_typ_META);
		p.columnDtl_wg_alc_typ.addLinkBeans(p.columnDtl_wg_alc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_alc_typ);
		p.columnDtl_wg_alc_typ_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.wg_alc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_alc_typ_nm);
		p.columnDtl_memo1.setMeta(mcframe.clientMABG.MABGP0500.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABG.MABGP0500.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABG.MABGP0500.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABG.MABGP0500.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABG.MABGP0500.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABG.MABGP0500.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABG.MABGP0500.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABG.MABGP0500.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABG.MABGP0500.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABG.MABGP0500.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABG.MABGP0500.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABG.MABGP0500.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABG.MABGP0500.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABG.MABGP0500.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * [Lcl]ブロックのTableの設定
	 */
	protected static void setTableConfigLcl(MABGP_PreAlcPtnReg p) {
		p.columnLcl_check.setMeta(mcframe.clientMABG.MABGP0500.LclR.check_META);
		p.LclTable.addColumnConfig(p.columnLcl_check);
		p.columnLcl_pre_alc_ptn_cd.setMeta(mcframe.clientMABG.MABGP0500.LclR.pre_alc_ptn_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_pre_alc_ptn_cd);
		p.columnLcl_lcl_cd.setMeta(mcframe.clientMABG.MABGP0500.LclR.lcl_cd_META);
		p.columnLcl_lcl_cd.addLinkBeans(p.columnLcl_lcl_nm);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_cd);
		p.columnLcl_lcl_nm.setMeta(mcframe.clientMABG.MABGP0500.LclR.lcl_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_nm);
		p.columnLcl_pre_alc_ptn_nm.setMeta(mcframe.clientMABG.MABGP0500.LclR.pre_alc_ptn_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_pre_alc_ptn_nm);
		p.columnLcl_memo1.setMeta(mcframe.clientMABG.MABGP0500.LclR.memo1_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo1);
		p.columnLcl_memo2.setMeta(mcframe.clientMABG.MABGP0500.LclR.memo2_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo2);
		p.columnLcl_memo3.setMeta(mcframe.clientMABG.MABGP0500.LclR.memo3_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo3);
		p.columnLcl_ins_usr_id.setMeta(mcframe.clientMABG.MABGP0500.LclR.ins_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_id);
		p.columnLcl_ins_usr_nm.setMeta(mcframe.clientMABG.MABGP0500.LclR.ins_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_nm);
		p.columnLcl_ins_ts.setMeta(mcframe.clientMABG.MABGP0500.LclR.ins_ts_META);
		p.columnLcl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_ins_ts);
		p.columnLcl_ins_func_id.setMeta(mcframe.clientMABG.MABGP0500.LclR.ins_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_id);
		p.columnLcl_ins_func_nm.setMeta(mcframe.clientMABG.MABGP0500.LclR.ins_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_nm);
		p.columnLcl_upd_cntr.setMeta(mcframe.clientMABG.MABGP0500.LclR.upd_cntr_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_cntr);
		p.columnLcl_upd_usr_id.setMeta(mcframe.clientMABG.MABGP0500.LclR.upd_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_id);
		p.columnLcl_upd_usr_nm.setMeta(mcframe.clientMABG.MABGP0500.LclR.upd_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_nm);
		p.columnLcl_upd_ts.setMeta(mcframe.clientMABG.MABGP0500.LclR.upd_ts_META);
		p.columnLcl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_upd_ts);
		p.columnLcl_upd_func_id.setMeta(mcframe.clientMABG.MABGP0500.LclR.upd_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_id);
		p.columnLcl_upd_func_nm.setMeta(mcframe.clientMABG.MABGP0500.LclR.upd_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_nm);
		p.columnLcl_upd_srv_req_no.setMeta(mcframe.clientMABG.MABGP0500.LclR.upd_srv_req_no_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.LclTable.setUnscrollColumn(p.columnLcl_lcl_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_pre_alc_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_pre_alc_ptn_cd.getListConfig().setPutter(getCnd_pre_alc_ptn_cd_ListPutter());
		columnDtl_dpt_alc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_dpt_alc_typ.getListConfig().setPutter(getDtl_dpt_alc_typ_ListPutter());
		columnDtl_loc_alc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_loc_alc_typ.getListConfig().setPutter(getDtl_loc_alc_typ_ListPutter());
		columnDtl_oper_alc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_oper_alc_typ.getListConfig().setPutter(getDtl_oper_alc_typ_ListPutter());
		columnDtl_bp_alc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bp_alc_typ.getListConfig().setPutter(getDtl_bp_alc_typ_ListPutter());
		columnDtl_ctg_alc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ctg_alc_typ.getListConfig().setPutter(getDtl_ctg_alc_typ_ListPutter());
		columnDtl_itm_alc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_alc_typ.getListConfig().setPutter(getDtl_itm_alc_typ_ListPutter());
		columnDtl_lot_alc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_lot_alc_typ.getListConfig().setPutter(getDtl_lot_alc_typ_ListPutter());
		columnDtl_sublot_alc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sublot_alc_typ.getListConfig().setPutter(getDtl_sublot_alc_typ_ListPutter());
		columnDtl_sno1_alc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno1_alc_typ.getListConfig().setPutter(getDtl_sno1_alc_typ_ListPutter());
		columnDtl_sno2_alc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno2_alc_typ.getListConfig().setPutter(getDtl_sno2_alc_typ_ListPutter());
		columnDtl_sno3_alc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno3_alc_typ.getListConfig().setPutter(getDtl_sno3_alc_typ_ListPutter());
		columnDtl_sno4_alc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno4_alc_typ.getListConfig().setPutter(getDtl_sno4_alc_typ_ListPutter());
		columnDtl_inst_alc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_inst_alc_typ.getListConfig().setPutter(getDtl_inst_alc_typ_ListPutter());
		columnDtl_iv_alc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_iv_alc_typ.getListConfig().setPutter(getDtl_iv_alc_typ_ListPutter());
		columnDtl_po_alc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_po_alc_typ.getListConfig().setPutter(getDtl_po_alc_typ_ListPutter());
		columnDtl_slo_alc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_slo_alc_typ.getListConfig().setPutter(getDtl_slo_alc_typ_ListPutter());
		columnDtl_alc_ac_alc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_alc_ac_alc_typ.getListConfig().setPutter(getDtl_alc_ac_alc_typ_ListPutter());
		columnDtl_wg_alc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_wg_alc_typ.getListConfig().setPutter(getDtl_wg_alc_typ_ListPutter());
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
	 * [Cnd_pre_alc_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pre_alc_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcPtn");
		return lp;
	}
	 
	/**
	 * [Dtl_dpt_alc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dpt_alc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_loc_alc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_loc_alc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_oper_alc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_oper_alc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_bp_alc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bp_alc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_ctg_alc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ctg_alc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_alc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_alc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_lot_alc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_lot_alc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sublot_alc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sublot_alc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno1_alc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno1_alc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno2_alc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno2_alc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno3_alc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno3_alc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno4_alc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno4_alc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_inst_alc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_inst_alc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_iv_alc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_iv_alc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_po_alc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_po_alc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_slo_alc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_slo_alc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_alc_ac_alc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_alc_ac_alc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_wg_alc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_wg_alc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcTyp");
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
		if(combo == Cnd_pre_alc_ptn_cd) return getCnd_pre_alc_ptn_cd(row, info);
		if(combo == columnDtl_dpt_alc_typ) return getDtl_dpt_alc_typ(row, info);
		if(combo == columnDtl_loc_alc_typ) return getDtl_loc_alc_typ(row, info);
		if(combo == columnDtl_oper_alc_typ) return getDtl_oper_alc_typ(row, info);
		if(combo == columnDtl_bp_alc_typ) return getDtl_bp_alc_typ(row, info);
		if(combo == columnDtl_ctg_alc_typ) return getDtl_ctg_alc_typ(row, info);
		if(combo == columnDtl_itm_alc_typ) return getDtl_itm_alc_typ(row, info);
		if(combo == columnDtl_lot_alc_typ) return getDtl_lot_alc_typ(row, info);
		if(combo == columnDtl_sublot_alc_typ) return getDtl_sublot_alc_typ(row, info);
		if(combo == columnDtl_sno1_alc_typ) return getDtl_sno1_alc_typ(row, info);
		if(combo == columnDtl_sno2_alc_typ) return getDtl_sno2_alc_typ(row, info);
		if(combo == columnDtl_sno3_alc_typ) return getDtl_sno3_alc_typ(row, info);
		if(combo == columnDtl_sno4_alc_typ) return getDtl_sno4_alc_typ(row, info);
		if(combo == columnDtl_inst_alc_typ) return getDtl_inst_alc_typ(row, info);
		if(combo == columnDtl_iv_alc_typ) return getDtl_iv_alc_typ(row, info);
		if(combo == columnDtl_po_alc_typ) return getDtl_po_alc_typ(row, info);
		if(combo == columnDtl_slo_alc_typ) return getDtl_slo_alc_typ(row, info);
		if(combo == columnDtl_alc_ac_alc_typ) return getDtl_alc_ac_alc_typ(row, info);
		if(combo == columnDtl_wg_alc_typ) return getDtl_wg_alc_typ(row, info);
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
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_pre_alc_ptn_cd) return doCnd_pre_alc_ptn_cd_VC(info);
		if (vc == Cnd_pre_alc_ptn_nm) return doCnd_pre_alc_ptn_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_pre_alc_ptn_cd) return doDtl_pre_alc_ptn_cd_VC(info);
		if (vc == columnDtl_pre_alc_ptn_nm_lcl) return doDtl_pre_alc_ptn_nm_lcl_VC(info);
		if (vc == columnDtl_pre_alc_ptn_nm) return doDtl_pre_alc_ptn_nm_VC(info);
		if (vc == columnDtl_dpt_alc_typ) return doDtl_dpt_alc_typ_VC(info);
		if (vc == columnDtl_dpt_alc_typ_nm) return doDtl_dpt_alc_typ_nm_VC(info);
		if (vc == columnDtl_loc_alc_typ) return doDtl_loc_alc_typ_VC(info);
		if (vc == columnDtl_loc_alc_typ_nm) return doDtl_loc_alc_typ_nm_VC(info);
		if (vc == columnDtl_oper_alc_typ) return doDtl_oper_alc_typ_VC(info);
		if (vc == columnDtl_oper_alc_typ_nm) return doDtl_oper_alc_typ_nm_VC(info);
		if (vc == columnDtl_bp_alc_typ) return doDtl_bp_alc_typ_VC(info);
		if (vc == columnDtl_bp_alc_typ_nm) return doDtl_bp_alc_typ_nm_VC(info);
		if (vc == columnDtl_ctg_alc_typ) return doDtl_ctg_alc_typ_VC(info);
		if (vc == columnDtl_ctg_alc_typ_nm) return doDtl_ctg_alc_typ_nm_VC(info);
		if (vc == columnDtl_itm_alc_typ) return doDtl_itm_alc_typ_VC(info);
		if (vc == columnDtl_itm_alc_typ_nm) return doDtl_itm_alc_typ_nm_VC(info);
		if (vc == columnDtl_lot_alc_typ) return doDtl_lot_alc_typ_VC(info);
		if (vc == columnDtl_lot_alc_typ_nm) return doDtl_lot_alc_typ_nm_VC(info);
		if (vc == columnDtl_sublot_alc_typ) return doDtl_sublot_alc_typ_VC(info);
		if (vc == columnDtl_sublot_alc_typ_nm) return doDtl_sublot_alc_typ_nm_VC(info);
		if (vc == columnDtl_sno1_alc_typ) return doDtl_sno1_alc_typ_VC(info);
		if (vc == columnDtl_sno1_alc_typ_nm) return doDtl_sno1_alc_typ_nm_VC(info);
		if (vc == columnDtl_sno2_alc_typ) return doDtl_sno2_alc_typ_VC(info);
		if (vc == columnDtl_sno2_alc_typ_nm) return doDtl_sno2_alc_typ_nm_VC(info);
		if (vc == columnDtl_sno3_alc_typ) return doDtl_sno3_alc_typ_VC(info);
		if (vc == columnDtl_sno3_alc_typ_nm) return doDtl_sno3_alc_typ_nm_VC(info);
		if (vc == columnDtl_sno4_alc_typ) return doDtl_sno4_alc_typ_VC(info);
		if (vc == columnDtl_sno4_alc_typ_nm) return doDtl_sno4_alc_typ_nm_VC(info);
		if (vc == columnDtl_inst_alc_typ) return doDtl_inst_alc_typ_VC(info);
		if (vc == columnDtl_inst_alc_typ_nm) return doDtl_inst_alc_typ_nm_VC(info);
		if (vc == columnDtl_iv_alc_typ) return doDtl_iv_alc_typ_VC(info);
		if (vc == columnDtl_iv_alc_typ_nm) return doDtl_iv_alc_typ_nm_VC(info);
		if (vc == columnDtl_po_alc_typ) return doDtl_po_alc_typ_VC(info);
		if (vc == columnDtl_po_alc_typ_nm) return doDtl_po_alc_typ_nm_VC(info);
		if (vc == columnDtl_slo_alc_typ) return doDtl_slo_alc_typ_VC(info);
		if (vc == columnDtl_slo_alc_typ_nm) return doDtl_slo_alc_typ_nm_VC(info);
		if (vc == columnDtl_alc_ac_alc_typ) return doDtl_alc_ac_alc_typ_VC(info);
		if (vc == columnDtl_alc_ac_alc_typ_nm) return doDtl_alc_ac_alc_typ_nm_VC(info);
		if (vc == columnDtl_wg_alc_typ) return doDtl_wg_alc_typ_VC(info);
		if (vc == columnDtl_wg_alc_typ_nm) return doDtl_wg_alc_typ_nm_VC(info);
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
		if (vc == columnLcl_pre_alc_ptn_cd) return doLcl_pre_alc_ptn_cd_VC(info);
		if (vc == columnLcl_lcl_cd) return doLcl_lcl_cd_VC(info);
		if (vc == columnLcl_lcl_nm) return doLcl_lcl_nm_VC(info);
		if (vc == columnLcl_pre_alc_ptn_nm) return doLcl_pre_alc_ptn_nm_VC(info);
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
	 * [Cnd]パネルの[pre_alc_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pre_alc_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pre_alc_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pre_alc_ptn_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[pre_alc_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pre_alc_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pre_alc_ptn_nm_lcl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pre_alc_ptn_nm_lcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pre_alc_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pre_alc_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dpt_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dpt_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dpt_alc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dpt_alc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_alc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_alc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_alc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_alc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_alc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_alc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ctg_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ctg_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ctg_alc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ctg_alc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_alc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_alc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_alc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_alc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_alc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_alc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_alc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_alc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_alc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_alc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_alc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_alc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_alc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_alc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inst_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inst_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inst_alc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inst_alc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_alc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_alc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_alc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_alc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_alc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_alc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_ac_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_ac_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_ac_alc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_ac_alc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_alc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_alc_typ_nm_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[pre_alc_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_pre_alc_ptn_cd_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[pre_alc_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_pre_alc_ptn_nm_VC(MCEventInfo info){
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
		else if (nc == Cnd_pre_alc_ptn_cd) doCnd_pre_alc_ptn_cd_NC(info);
		else if (nc == Cnd_pre_alc_ptn_nm) doCnd_pre_alc_ptn_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_pre_alc_ptn_cd) doDtl_pre_alc_ptn_cd_NC(info);
		else if (nc == columnDtl_pre_alc_ptn_nm_lcl) doDtl_pre_alc_ptn_nm_lcl_NC(info);
		else if (nc == columnDtl_pre_alc_ptn_nm) doDtl_pre_alc_ptn_nm_NC(info);
		else if (nc == columnDtl_dpt_alc_typ) doDtl_dpt_alc_typ_NC(info);
		else if (nc == columnDtl_dpt_alc_typ_nm) doDtl_dpt_alc_typ_nm_NC(info);
		else if (nc == columnDtl_loc_alc_typ) doDtl_loc_alc_typ_NC(info);
		else if (nc == columnDtl_loc_alc_typ_nm) doDtl_loc_alc_typ_nm_NC(info);
		else if (nc == columnDtl_oper_alc_typ) doDtl_oper_alc_typ_NC(info);
		else if (nc == columnDtl_oper_alc_typ_nm) doDtl_oper_alc_typ_nm_NC(info);
		else if (nc == columnDtl_bp_alc_typ) doDtl_bp_alc_typ_NC(info);
		else if (nc == columnDtl_bp_alc_typ_nm) doDtl_bp_alc_typ_nm_NC(info);
		else if (nc == columnDtl_ctg_alc_typ) doDtl_ctg_alc_typ_NC(info);
		else if (nc == columnDtl_ctg_alc_typ_nm) doDtl_ctg_alc_typ_nm_NC(info);
		else if (nc == columnDtl_itm_alc_typ) doDtl_itm_alc_typ_NC(info);
		else if (nc == columnDtl_itm_alc_typ_nm) doDtl_itm_alc_typ_nm_NC(info);
		else if (nc == columnDtl_lot_alc_typ) doDtl_lot_alc_typ_NC(info);
		else if (nc == columnDtl_lot_alc_typ_nm) doDtl_lot_alc_typ_nm_NC(info);
		else if (nc == columnDtl_sublot_alc_typ) doDtl_sublot_alc_typ_NC(info);
		else if (nc == columnDtl_sublot_alc_typ_nm) doDtl_sublot_alc_typ_nm_NC(info);
		else if (nc == columnDtl_sno1_alc_typ) doDtl_sno1_alc_typ_NC(info);
		else if (nc == columnDtl_sno1_alc_typ_nm) doDtl_sno1_alc_typ_nm_NC(info);
		else if (nc == columnDtl_sno2_alc_typ) doDtl_sno2_alc_typ_NC(info);
		else if (nc == columnDtl_sno2_alc_typ_nm) doDtl_sno2_alc_typ_nm_NC(info);
		else if (nc == columnDtl_sno3_alc_typ) doDtl_sno3_alc_typ_NC(info);
		else if (nc == columnDtl_sno3_alc_typ_nm) doDtl_sno3_alc_typ_nm_NC(info);
		else if (nc == columnDtl_sno4_alc_typ) doDtl_sno4_alc_typ_NC(info);
		else if (nc == columnDtl_sno4_alc_typ_nm) doDtl_sno4_alc_typ_nm_NC(info);
		else if (nc == columnDtl_inst_alc_typ) doDtl_inst_alc_typ_NC(info);
		else if (nc == columnDtl_inst_alc_typ_nm) doDtl_inst_alc_typ_nm_NC(info);
		else if (nc == columnDtl_iv_alc_typ) doDtl_iv_alc_typ_NC(info);
		else if (nc == columnDtl_iv_alc_typ_nm) doDtl_iv_alc_typ_nm_NC(info);
		else if (nc == columnDtl_po_alc_typ) doDtl_po_alc_typ_NC(info);
		else if (nc == columnDtl_po_alc_typ_nm) doDtl_po_alc_typ_nm_NC(info);
		else if (nc == columnDtl_slo_alc_typ) doDtl_slo_alc_typ_NC(info);
		else if (nc == columnDtl_slo_alc_typ_nm) doDtl_slo_alc_typ_nm_NC(info);
		else if (nc == columnDtl_alc_ac_alc_typ) doDtl_alc_ac_alc_typ_NC(info);
		else if (nc == columnDtl_alc_ac_alc_typ_nm) doDtl_alc_ac_alc_typ_nm_NC(info);
		else if (nc == columnDtl_wg_alc_typ) doDtl_wg_alc_typ_NC(info);
		else if (nc == columnDtl_wg_alc_typ_nm) doDtl_wg_alc_typ_nm_NC(info);
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
		else if (nc == columnLcl_pre_alc_ptn_cd) doLcl_pre_alc_ptn_cd_NC(info);
		else if (nc == columnLcl_lcl_cd) doLcl_lcl_cd_NC(info);
		else if (nc == columnLcl_lcl_nm) doLcl_lcl_nm_NC(info);
		else if (nc == columnLcl_pre_alc_ptn_nm) doLcl_pre_alc_ptn_nm_NC(info);
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
	 * [Cnd]パネルの[pre_alc_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_ptn_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[pre_alc_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_ptn_nm_lcl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_ptn_nm_lcl_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_alc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_alc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_alc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_alc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_alc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_alc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_alc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_alc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_alc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_alc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_alc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_alc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_alc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_alc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_alc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_alc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_alc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_alc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_alc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_alc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_alc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_alc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_alc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_alc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_alc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_alc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_alc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_alc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_alc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_alc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_alc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_alc_typ_nm_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[pre_alc_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_pre_alc_ptn_cd_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[pre_alc_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_pre_alc_ptn_nm_NC(MCEventInfo info){
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
		else if (ne == Cnd_pre_alc_ptn_cd) doCnd_pre_alc_ptn_cd_NE(info);
		else if (ne == Cnd_pre_alc_ptn_nm) doCnd_pre_alc_ptn_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_pre_alc_ptn_cd) doDtl_pre_alc_ptn_cd_NE(info);
		else if (ne == columnDtl_pre_alc_ptn_nm_lcl) doDtl_pre_alc_ptn_nm_lcl_NE(info);
		else if (ne == columnDtl_pre_alc_ptn_nm) doDtl_pre_alc_ptn_nm_NE(info);
		else if (ne == columnDtl_dpt_alc_typ) doDtl_dpt_alc_typ_NE(info);
		else if (ne == columnDtl_dpt_alc_typ_nm) doDtl_dpt_alc_typ_nm_NE(info);
		else if (ne == columnDtl_loc_alc_typ) doDtl_loc_alc_typ_NE(info);
		else if (ne == columnDtl_loc_alc_typ_nm) doDtl_loc_alc_typ_nm_NE(info);
		else if (ne == columnDtl_oper_alc_typ) doDtl_oper_alc_typ_NE(info);
		else if (ne == columnDtl_oper_alc_typ_nm) doDtl_oper_alc_typ_nm_NE(info);
		else if (ne == columnDtl_bp_alc_typ) doDtl_bp_alc_typ_NE(info);
		else if (ne == columnDtl_bp_alc_typ_nm) doDtl_bp_alc_typ_nm_NE(info);
		else if (ne == columnDtl_ctg_alc_typ) doDtl_ctg_alc_typ_NE(info);
		else if (ne == columnDtl_ctg_alc_typ_nm) doDtl_ctg_alc_typ_nm_NE(info);
		else if (ne == columnDtl_itm_alc_typ) doDtl_itm_alc_typ_NE(info);
		else if (ne == columnDtl_itm_alc_typ_nm) doDtl_itm_alc_typ_nm_NE(info);
		else if (ne == columnDtl_lot_alc_typ) doDtl_lot_alc_typ_NE(info);
		else if (ne == columnDtl_lot_alc_typ_nm) doDtl_lot_alc_typ_nm_NE(info);
		else if (ne == columnDtl_sublot_alc_typ) doDtl_sublot_alc_typ_NE(info);
		else if (ne == columnDtl_sublot_alc_typ_nm) doDtl_sublot_alc_typ_nm_NE(info);
		else if (ne == columnDtl_sno1_alc_typ) doDtl_sno1_alc_typ_NE(info);
		else if (ne == columnDtl_sno1_alc_typ_nm) doDtl_sno1_alc_typ_nm_NE(info);
		else if (ne == columnDtl_sno2_alc_typ) doDtl_sno2_alc_typ_NE(info);
		else if (ne == columnDtl_sno2_alc_typ_nm) doDtl_sno2_alc_typ_nm_NE(info);
		else if (ne == columnDtl_sno3_alc_typ) doDtl_sno3_alc_typ_NE(info);
		else if (ne == columnDtl_sno3_alc_typ_nm) doDtl_sno3_alc_typ_nm_NE(info);
		else if (ne == columnDtl_sno4_alc_typ) doDtl_sno4_alc_typ_NE(info);
		else if (ne == columnDtl_sno4_alc_typ_nm) doDtl_sno4_alc_typ_nm_NE(info);
		else if (ne == columnDtl_inst_alc_typ) doDtl_inst_alc_typ_NE(info);
		else if (ne == columnDtl_inst_alc_typ_nm) doDtl_inst_alc_typ_nm_NE(info);
		else if (ne == columnDtl_iv_alc_typ) doDtl_iv_alc_typ_NE(info);
		else if (ne == columnDtl_iv_alc_typ_nm) doDtl_iv_alc_typ_nm_NE(info);
		else if (ne == columnDtl_po_alc_typ) doDtl_po_alc_typ_NE(info);
		else if (ne == columnDtl_po_alc_typ_nm) doDtl_po_alc_typ_nm_NE(info);
		else if (ne == columnDtl_slo_alc_typ) doDtl_slo_alc_typ_NE(info);
		else if (ne == columnDtl_slo_alc_typ_nm) doDtl_slo_alc_typ_nm_NE(info);
		else if (ne == columnDtl_alc_ac_alc_typ) doDtl_alc_ac_alc_typ_NE(info);
		else if (ne == columnDtl_alc_ac_alc_typ_nm) doDtl_alc_ac_alc_typ_nm_NE(info);
		else if (ne == columnDtl_wg_alc_typ) doDtl_wg_alc_typ_NE(info);
		else if (ne == columnDtl_wg_alc_typ_nm) doDtl_wg_alc_typ_nm_NE(info);
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
		else if (ne == columnLcl_pre_alc_ptn_cd) doLcl_pre_alc_ptn_cd_NE(info);
		else if (ne == columnLcl_lcl_cd) doLcl_lcl_cd_NE(info);
		else if (ne == columnLcl_lcl_nm) doLcl_lcl_nm_NE(info);
		else if (ne == columnLcl_pre_alc_ptn_nm) doLcl_pre_alc_ptn_nm_NE(info);
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
	 * [Cnd]パネルの[pre_alc_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_ptn_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[pre_alc_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_ptn_nm_lcl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_ptn_nm_lcl_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_alc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_alc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_alc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_alc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_alc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_alc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_alc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_alc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_alc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_alc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_alc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_alc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_alc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_alc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_alc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_alc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_alc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_alc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_alc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_alc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_alc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_alc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_alc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_alc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_alc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_alc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_alc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_alc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_alc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_alc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_alc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_alc_typ_nm_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[pre_alc_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_pre_alc_ptn_cd_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[pre_alc_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_pre_alc_ptn_nm_NE(MCEventInfo info){
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
		else if (nx == Cnd_pre_alc_ptn_cd) doCnd_pre_alc_ptn_cd_NX(info);
		else if (nx == Cnd_pre_alc_ptn_nm) doCnd_pre_alc_ptn_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_pre_alc_ptn_cd) doDtl_pre_alc_ptn_cd_NX(info);
		else if (nx == columnDtl_pre_alc_ptn_nm_lcl) doDtl_pre_alc_ptn_nm_lcl_NX(info);
		else if (nx == columnDtl_pre_alc_ptn_nm) doDtl_pre_alc_ptn_nm_NX(info);
		else if (nx == columnDtl_dpt_alc_typ) doDtl_dpt_alc_typ_NX(info);
		else if (nx == columnDtl_dpt_alc_typ_nm) doDtl_dpt_alc_typ_nm_NX(info);
		else if (nx == columnDtl_loc_alc_typ) doDtl_loc_alc_typ_NX(info);
		else if (nx == columnDtl_loc_alc_typ_nm) doDtl_loc_alc_typ_nm_NX(info);
		else if (nx == columnDtl_oper_alc_typ) doDtl_oper_alc_typ_NX(info);
		else if (nx == columnDtl_oper_alc_typ_nm) doDtl_oper_alc_typ_nm_NX(info);
		else if (nx == columnDtl_bp_alc_typ) doDtl_bp_alc_typ_NX(info);
		else if (nx == columnDtl_bp_alc_typ_nm) doDtl_bp_alc_typ_nm_NX(info);
		else if (nx == columnDtl_ctg_alc_typ) doDtl_ctg_alc_typ_NX(info);
		else if (nx == columnDtl_ctg_alc_typ_nm) doDtl_ctg_alc_typ_nm_NX(info);
		else if (nx == columnDtl_itm_alc_typ) doDtl_itm_alc_typ_NX(info);
		else if (nx == columnDtl_itm_alc_typ_nm) doDtl_itm_alc_typ_nm_NX(info);
		else if (nx == columnDtl_lot_alc_typ) doDtl_lot_alc_typ_NX(info);
		else if (nx == columnDtl_lot_alc_typ_nm) doDtl_lot_alc_typ_nm_NX(info);
		else if (nx == columnDtl_sublot_alc_typ) doDtl_sublot_alc_typ_NX(info);
		else if (nx == columnDtl_sublot_alc_typ_nm) doDtl_sublot_alc_typ_nm_NX(info);
		else if (nx == columnDtl_sno1_alc_typ) doDtl_sno1_alc_typ_NX(info);
		else if (nx == columnDtl_sno1_alc_typ_nm) doDtl_sno1_alc_typ_nm_NX(info);
		else if (nx == columnDtl_sno2_alc_typ) doDtl_sno2_alc_typ_NX(info);
		else if (nx == columnDtl_sno2_alc_typ_nm) doDtl_sno2_alc_typ_nm_NX(info);
		else if (nx == columnDtl_sno3_alc_typ) doDtl_sno3_alc_typ_NX(info);
		else if (nx == columnDtl_sno3_alc_typ_nm) doDtl_sno3_alc_typ_nm_NX(info);
		else if (nx == columnDtl_sno4_alc_typ) doDtl_sno4_alc_typ_NX(info);
		else if (nx == columnDtl_sno4_alc_typ_nm) doDtl_sno4_alc_typ_nm_NX(info);
		else if (nx == columnDtl_inst_alc_typ) doDtl_inst_alc_typ_NX(info);
		else if (nx == columnDtl_inst_alc_typ_nm) doDtl_inst_alc_typ_nm_NX(info);
		else if (nx == columnDtl_iv_alc_typ) doDtl_iv_alc_typ_NX(info);
		else if (nx == columnDtl_iv_alc_typ_nm) doDtl_iv_alc_typ_nm_NX(info);
		else if (nx == columnDtl_po_alc_typ) doDtl_po_alc_typ_NX(info);
		else if (nx == columnDtl_po_alc_typ_nm) doDtl_po_alc_typ_nm_NX(info);
		else if (nx == columnDtl_slo_alc_typ) doDtl_slo_alc_typ_NX(info);
		else if (nx == columnDtl_slo_alc_typ_nm) doDtl_slo_alc_typ_nm_NX(info);
		else if (nx == columnDtl_alc_ac_alc_typ) doDtl_alc_ac_alc_typ_NX(info);
		else if (nx == columnDtl_alc_ac_alc_typ_nm) doDtl_alc_ac_alc_typ_nm_NX(info);
		else if (nx == columnDtl_wg_alc_typ) doDtl_wg_alc_typ_NX(info);
		else if (nx == columnDtl_wg_alc_typ_nm) doDtl_wg_alc_typ_nm_NX(info);
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
		else if (nx == columnLcl_pre_alc_ptn_cd) doLcl_pre_alc_ptn_cd_NX(info);
		else if (nx == columnLcl_lcl_cd) doLcl_lcl_cd_NX(info);
		else if (nx == columnLcl_lcl_nm) doLcl_lcl_nm_NX(info);
		else if (nx == columnLcl_pre_alc_ptn_nm) doLcl_pre_alc_ptn_nm_NX(info);
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
	 * [Cnd]パネルの[pre_alc_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_ptn_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[pre_alc_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_ptn_nm_lcl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_ptn_nm_lcl_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_alc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_alc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_alc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_alc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_alc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_alc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_alc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_alc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_alc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_alc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_alc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_alc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_alc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_alc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_alc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_alc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_alc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_alc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_alc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_alc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_alc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_alc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_alc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_alc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_alc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_alc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_alc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_alc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_alc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_alc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_alc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_alc_typ_nm_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[pre_alc_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_pre_alc_ptn_cd_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[pre_alc_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_pre_alc_ptn_nm_NX(MCEventInfo info){
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
		else if (lc == Cnd_pre_alc_ptn_cd) doCnd_pre_alc_ptn_cd_LC(info);
		else if (lc == Cnd_pre_alc_ptn_nm) doCnd_pre_alc_ptn_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == columnDtl_pre_alc_ptn_cd) doDtl_pre_alc_ptn_cd_LC(info);
		else if (lc == columnDtl_pre_alc_ptn_nm_lcl) doDtl_pre_alc_ptn_nm_lcl_LC(info);
		else if (lc == columnDtl_pre_alc_ptn_nm) doDtl_pre_alc_ptn_nm_LC(info);
		else if (lc == columnDtl_dpt_alc_typ) doDtl_dpt_alc_typ_LC(info);
		else if (lc == columnDtl_dpt_alc_typ_nm) doDtl_dpt_alc_typ_nm_LC(info);
		else if (lc == columnDtl_loc_alc_typ) doDtl_loc_alc_typ_LC(info);
		else if (lc == columnDtl_loc_alc_typ_nm) doDtl_loc_alc_typ_nm_LC(info);
		else if (lc == columnDtl_oper_alc_typ) doDtl_oper_alc_typ_LC(info);
		else if (lc == columnDtl_oper_alc_typ_nm) doDtl_oper_alc_typ_nm_LC(info);
		else if (lc == columnDtl_bp_alc_typ) doDtl_bp_alc_typ_LC(info);
		else if (lc == columnDtl_bp_alc_typ_nm) doDtl_bp_alc_typ_nm_LC(info);
		else if (lc == columnDtl_ctg_alc_typ) doDtl_ctg_alc_typ_LC(info);
		else if (lc == columnDtl_ctg_alc_typ_nm) doDtl_ctg_alc_typ_nm_LC(info);
		else if (lc == columnDtl_itm_alc_typ) doDtl_itm_alc_typ_LC(info);
		else if (lc == columnDtl_itm_alc_typ_nm) doDtl_itm_alc_typ_nm_LC(info);
		else if (lc == columnDtl_lot_alc_typ) doDtl_lot_alc_typ_LC(info);
		else if (lc == columnDtl_lot_alc_typ_nm) doDtl_lot_alc_typ_nm_LC(info);
		else if (lc == columnDtl_sublot_alc_typ) doDtl_sublot_alc_typ_LC(info);
		else if (lc == columnDtl_sublot_alc_typ_nm) doDtl_sublot_alc_typ_nm_LC(info);
		else if (lc == columnDtl_sno1_alc_typ) doDtl_sno1_alc_typ_LC(info);
		else if (lc == columnDtl_sno1_alc_typ_nm) doDtl_sno1_alc_typ_nm_LC(info);
		else if (lc == columnDtl_sno2_alc_typ) doDtl_sno2_alc_typ_LC(info);
		else if (lc == columnDtl_sno2_alc_typ_nm) doDtl_sno2_alc_typ_nm_LC(info);
		else if (lc == columnDtl_sno3_alc_typ) doDtl_sno3_alc_typ_LC(info);
		else if (lc == columnDtl_sno3_alc_typ_nm) doDtl_sno3_alc_typ_nm_LC(info);
		else if (lc == columnDtl_sno4_alc_typ) doDtl_sno4_alc_typ_LC(info);
		else if (lc == columnDtl_sno4_alc_typ_nm) doDtl_sno4_alc_typ_nm_LC(info);
		else if (lc == columnDtl_inst_alc_typ) doDtl_inst_alc_typ_LC(info);
		else if (lc == columnDtl_inst_alc_typ_nm) doDtl_inst_alc_typ_nm_LC(info);
		else if (lc == columnDtl_iv_alc_typ) doDtl_iv_alc_typ_LC(info);
		else if (lc == columnDtl_iv_alc_typ_nm) doDtl_iv_alc_typ_nm_LC(info);
		else if (lc == columnDtl_po_alc_typ) doDtl_po_alc_typ_LC(info);
		else if (lc == columnDtl_po_alc_typ_nm) doDtl_po_alc_typ_nm_LC(info);
		else if (lc == columnDtl_slo_alc_typ) doDtl_slo_alc_typ_LC(info);
		else if (lc == columnDtl_slo_alc_typ_nm) doDtl_slo_alc_typ_nm_LC(info);
		else if (lc == columnDtl_alc_ac_alc_typ) doDtl_alc_ac_alc_typ_LC(info);
		else if (lc == columnDtl_alc_ac_alc_typ_nm) doDtl_alc_ac_alc_typ_nm_LC(info);
		else if (lc == columnDtl_wg_alc_typ) doDtl_wg_alc_typ_LC(info);
		else if (lc == columnDtl_wg_alc_typ_nm) doDtl_wg_alc_typ_nm_LC(info);
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
		else if (lc == columnLcl_pre_alc_ptn_cd) doLcl_pre_alc_ptn_cd_LC(info);
		else if (lc == columnLcl_lcl_cd) doLcl_lcl_cd_LC(info);
		else if (lc == columnLcl_lcl_nm) doLcl_lcl_nm_LC(info);
		else if (lc == columnLcl_pre_alc_ptn_nm) doLcl_pre_alc_ptn_nm_LC(info);
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
	 * [Cnd]パネルの[pre_alc_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_ptn_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[pre_alc_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_ptn_nm_lcl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_ptn_nm_lcl_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_alc_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_alc_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_alc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_alc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_alc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_alc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_alc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_alc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_alc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_alc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_alc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_alc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_alc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_alc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_alc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_alc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_alc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_alc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_alc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_alc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_alc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_alc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_alc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_alc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_alc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_alc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_alc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_alc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_alc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_alc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_alc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_alc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_alc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_alc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_alc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_alc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_alc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_alc_typ_nm_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[pre_alc_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_pre_alc_ptn_cd_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[pre_alc_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_pre_alc_ptn_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_pre_alc_ptn_cd]の作成メソッド
	 */
	public MCList getCnd_pre_alc_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dpt_alc_typ]の作成メソッド
	 */
	public MCList getDtl_dpt_alc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_loc_alc_typ]の作成メソッド
	 */
	public MCList getDtl_loc_alc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_oper_alc_typ]の作成メソッド
	 */
	public MCList getDtl_oper_alc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bp_alc_typ]の作成メソッド
	 */
	public MCList getDtl_bp_alc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ctg_alc_typ]の作成メソッド
	 */
	public MCList getDtl_ctg_alc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_alc_typ]の作成メソッド
	 */
	public MCList getDtl_itm_alc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_lot_alc_typ]の作成メソッド
	 */
	public MCList getDtl_lot_alc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sublot_alc_typ]の作成メソッド
	 */
	public MCList getDtl_sublot_alc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno1_alc_typ]の作成メソッド
	 */
	public MCList getDtl_sno1_alc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno2_alc_typ]の作成メソッド
	 */
	public MCList getDtl_sno2_alc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno3_alc_typ]の作成メソッド
	 */
	public MCList getDtl_sno3_alc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno4_alc_typ]の作成メソッド
	 */
	public MCList getDtl_sno4_alc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_inst_alc_typ]の作成メソッド
	 */
	public MCList getDtl_inst_alc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_iv_alc_typ]の作成メソッド
	 */
	public MCList getDtl_iv_alc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_po_alc_typ]の作成メソッド
	 */
	public MCList getDtl_po_alc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_slo_alc_typ]の作成メソッド
	 */
	public MCList getDtl_slo_alc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_alc_ac_alc_typ]の作成メソッド
	 */
	public MCList getDtl_alc_ac_alc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_wg_alc_typ]の作成メソッド
	 */
	public MCList getDtl_wg_alc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnLcl_lcl_cd]の作成メソッド
	 */
	public MCList getLcl_lcl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocaleEntry(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABGL0500.Srch01")) {
			return new MA_MABGL0500_Srch01Bridge();
		}
		if (id.equals("MA.MABGL0500.Upd01")) {
			return new MA_MABGL0500_Upd01Bridge();
		}
		if (id.equals("MA.MABGL0500.Del01")) {
			return new MA_MABGL0500_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABGL0500_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0500_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0500_Srch01;

		/** コンストラクタ */
		protected MA_MABGL0500_Srch01Bridge() {
			p_MA_MABGL0500_Srch01 = new MCParam(PDef.MA_MABGL0500_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0500_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABG.MABGP0500.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0500.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0500.LclR.class));

			p_MA_MABGL0500_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0500_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0500_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0500_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0500_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABG.MABGP0500.CndR up0() {
			return (mcframe.clientMABG.MABGP0500.CndR)up(0);
		}

		protected MCList<mcframe.clientMABG.MABGP0500.DtlR> down0() {
			return (MCList<mcframe.clientMABG.MABGP0500.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMABG.MABGP0500.LclR> down1() {
			return (MCList<mcframe.clientMABG.MABGP0500.LclR>)down(1);
		}

		protected void setupDownParam() {
			p_MA_MABGL0500_Srch01.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0500.DtlR.class));
			p_MA_MABGL0500_Srch01.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0500.LclR.class));
		}
		protected MCParam param() {
			return p_MA_MABGL0500_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABG.MABGP0500.DtlR>)p_MA_MABGL0500_Srch01.getContainerParam().getDownBlock(0));
			setLclAllL((MCList<mcframe.clientMABG.MABGP0500.LclR>)p_MA_MABGL0500_Srch01.getContainerParam().getDownBlock(1));
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
	 * [MA_MABGL0500_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0500_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0500_Upd01;

		/** コンストラクタ */
		protected MA_MABGL0500_Upd01Bridge() {
			p_MA_MABGL0500_Upd01 = new MCParam(PDef.MA_MABGL0500_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0500_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0500.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0500.LclR.class));
			// Down

			p_MA_MABGL0500_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0500_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0500_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABGL0500_Upd01.addUpBlock(getLclAllL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0500_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0500_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABG.MABGP0500.DtlR> up0() {
			return (MCList<mcframe.clientMABG.MABGP0500.DtlR>)up(0);
		}
		protected MCList<mcframe.clientMABG.MABGP0500.LclR> up1() {
			return (MCList<mcframe.clientMABG.MABGP0500.LclR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABGL0500_Upd01;
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
	 * [MA_MABGL0500_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0500_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0500_Del01;

		/** コンストラクタ */
		protected MA_MABGL0500_Del01Bridge() {
			p_MA_MABGL0500_Del01 = new MCParam(PDef.MA_MABGL0500_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0500_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0500.DtlR.class));
			// Down

			p_MA_MABGL0500_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0500_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0500_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0500_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0500_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABG.MABGP0500.DtlR> up0() {
			return (MCList<mcframe.clientMABG.MABGP0500.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABGL0500_Del01;
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