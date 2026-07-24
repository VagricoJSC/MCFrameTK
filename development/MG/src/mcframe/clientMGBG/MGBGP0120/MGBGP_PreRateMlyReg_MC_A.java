package mcframe.clientMGBG.MGBGP0120;

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
import mcframe.clientMGBG.MGBGP0120.MGBGP_PreRateMlyReg_MC.MG_MGBGL0120_Srch01Caller;
import mcframe.clientMGBG.MGBGP0120.MGBGP_PreRateMlyReg_MC.MG_MGBGL0120_Ins01Caller;
import mcframe.clientMGBG.MGBGP0120.MGBGP_PreRateMlyReg_MC.MG_MGBGL0120_Upd01Caller;
import mcframe.clientMGBG.MGBGP0120.MGBGP_PreRateMlyReg_MC.MG_MGBGL0120_Del01Caller;

/**
 * 画面"MGBGP_PreRateMlyReg"パネルクラスです。<p>
 *
 * 一次配賦月次比率を登録します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBGP_PreRateMlyReg_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MG";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MGBG";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBGP0120";

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
	 * INS,Create,0;UPD,Modify,1;DEL,Delete,2;REF,View,3 INS,登録する,0;UPD,訂正する,1;DEL,削除する,2;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_sa_typ_Label = null;
	/**
	 * Plan/Result type 予実区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_sa_typ = null;
	/**
	 * Plan/Result type name 予実区分名.<p>
	 *
	 */
	public MCTextField Cnd_sa_typ_nm = null;
	public MCLabel Cnd_calc_ctg_cd_Label = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Cnd_calc_ctg_nm = null;
	public MCLabel Cnd_ym_Label = null;
	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDateField Cnd_ym = null;
	public MCLabel Cnd_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_wg_nm = null;
	public MCLabel Cnd_pre_alc_rate_cd_Label = null;
	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_pre_alc_rate_cd = null;
	/**
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public MCTextField Cnd_pre_alc_rate_nm = null;
	public MCLabel Cnd_pre_alc_ptn_cd_Label = null;
	/**
	 * Departmental alloc. pattern cd. 一次配賦パタンＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_pre_alc_ptn_cd = null;
	/**
	 * Departmental alloc. pattern name 一次配賦パタン名.<p>
	 *
	 */
	public MCTextField Cnd_pre_alc_ptn_nm = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	public MCTitledBorder HdrTitledBorder = null;
	// [Hdr]ブロックの項目のField定義
	public MCLabel Hdr_sa_typ_Label = null;
	/**
	 * Plan/Result type 予実区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_sa_typ = null;
	/**
	 * Plan/Result type name 予実区分名.<p>
	 *
	 */
	public MCTextField Hdr_sa_typ_nm = null;
	public MCLabel Hdr_calc_ctg_cd_Label = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Hdr_calc_ctg_nm = null;
	public MCLabel Hdr_ym_Label = null;
	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDateField Hdr_ym = null;
	public MCLabel Hdr_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Hdr_wg_nm = null;
	public MCLabel Hdr_pre_alc_rate_cd_Label = null;
	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_pre_alc_rate_cd = null;
	/**
	 * Departmental alloc. basis name 一次配賦基準名.<p>
	 *
	 */
	public MCTextField Hdr_pre_alc_rate_nm = null;
	public MCLabel Hdr_pre_alc_ptn_cd_Label = null;
	/**
	 * Departmental alloc. pattern cd. 一次配賦パタンＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_pre_alc_ptn_cd = null;
	/**
	 * Departmental alloc. pattern name 一次配賦パタン名.<p>
	 *
	 */
	public MCTextField Hdr_pre_alc_ptn_nm = null;
	/**
	 * Dept. allocation type 部門配賦区分.<p>
	 *
	 */
	public MCTextField Hdr_dpt_alc_typ = null;
	/**
	 * Location allocation type 場所配賦区分.<p>
	 *
	 */
	public MCTextField Hdr_loc_alc_typ = null;
	/**
	 * Operation allocation type 工程配賦区分.<p>
	 *
	 */
	public MCTextField Hdr_oper_alc_typ = null;
	/**
	 * BP allocation type 取引先配賦区分.<p>
	 *
	 */
	public MCTextField Hdr_bp_alc_typ = null;
	/**
	 * Item category allocation type 品群配賦区分.<p>
	 *
	 */
	public MCTextField Hdr_ctg_alc_typ = null;
	/**
	 * Item allocation type 品目配賦区分.<p>
	 *
	 */
	public MCTextField Hdr_itm_alc_typ = null;
	/**
	 * Lot No. allocation type ロットＮＯ配賦区分.<p>
	 *
	 */
	public MCTextField Hdr_lot_alc_typ = null;
	/**
	 * Sublot No. allocation type サブロットＮＯ配賦区分.<p>
	 *
	 */
	public MCTextField Hdr_sublot_alc_typ = null;
	/**
	 * SEIBAN No. 1 allocation type 手配ＮＯ１配賦区分.<p>
	 *
	 */
	public MCTextField Hdr_sno1_alc_typ = null;
	/**
	 * SEIBAN No. 2 allocation type 手配ＮＯ２配賦区分.<p>
	 *
	 */
	public MCTextField Hdr_sno2_alc_typ = null;
	/**
	 * SEIBAN No. 3 allocation type 手配ＮＯ３配賦区分.<p>
	 *
	 */
	public MCTextField Hdr_sno3_alc_typ = null;
	/**
	 * SEIBAN No. 4 allocation type 手配ＮＯ４配賦区分.<p>
	 *
	 */
	public MCTextField Hdr_sno4_alc_typ = null;
	/**
	 * Order allocation type 指図配賦区分.<p>
	 *
	 */
	public MCTextField Hdr_inst_alc_typ = null;
	/**
	 * Invoice allocation type インボイス配賦区分.<p>
	 *
	 */
	public MCTextField Hdr_iv_alc_typ = null;
	/**
	 * PO allocation type 発注配賦区分.<p>
	 *
	 */
	public MCTextField Hdr_po_alc_typ = null;
	/**
	 * Sales order allocation type 受注配賦区分.<p>
	 *
	 */
	public MCTextField Hdr_slo_alc_typ = null;
	/**
	 * Allocation account allocation type 配賦科目配賦区分.<p>
	 *
	 */
	public MCTextField Hdr_alc_ac_alc_typ = null;
	/**
	 * WG allocation type ワーキンググループ配賦区分.<p>
	 *
	 */
	public MCTextField Hdr_wg_alc_typ = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMGBG.MGBGP0120.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Plan/Result type 予実区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sa_typ = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_calc_ctg_cd = null;
	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ym = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_cd = null;
	/**
	 * Departmental alloc. basis cd. 一次配賦基準ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_alc_rate_cd = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_nm = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_nm = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_nm = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_nm = null;
	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ctg_cd = null;
	/**
	 * Item category name 品群名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ctg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_no = null;
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno1 = null;
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno2 = null;
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno3 = null;
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno4 = null;
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_mfg_inst_no = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_no = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_no = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_no = null;
	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_ac_cd = null;
	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alc_ac_nm = null;
	/**
	 * Transfer WG cd. 振替ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_wg_cd = null;
	/**
	 * Transfer WG name 振替ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_wg_nm = null;
	/**
	 * Ratio 比率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pre_alc_rate = null;
	/**
	 * Difference adjustment 差額調整.<p>
	 *
	 */
	public MCColumnConfig columnRslt_adj_flg = null;
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char3 = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_srv_req_no = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_cntr = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Btn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Btn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Btn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btn_rcopy = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_ins = null;
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
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INS, FIX_I, SRCH, UPD, DEL, REF};
	
	/** [MG_MGBGL0120_Srch01]のCallerの作成 */
	protected MGBGP_PreRateMlyReg_MC.MG_MGBGL0120_Srch01Caller createMG_MGBGL0120_Srch01() {
		MGBGP_PreRateMlyReg_MC.MG_MGBGL0120_Srch01Caller<MGBGP_PreRateMlyReg, MG_MGBGL0120_Srch01Bridge>
		caller = ((MGBGP_PreRateMlyReg_MC)this).new MG_MGBGL0120_Srch01Caller<MGBGP_PreRateMlyReg, MG_MGBGL0120_Srch01Bridge>(
					(MGBGP_PreRateMlyReg)this, new MG_MGBGL0120_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBGL0120_Srch01]の呼び出し */
	protected void callMG_MGBGL0120_Srch01() {
		MCCaller caller = createMG_MGBGL0120_Srch01();
		caller.exec();
	}
	/** [MG_MGBGL0120_Ins01]のCallerの作成 */
	protected MGBGP_PreRateMlyReg_MC.MG_MGBGL0120_Ins01Caller createMG_MGBGL0120_Ins01() {
		MGBGP_PreRateMlyReg_MC.MG_MGBGL0120_Ins01Caller<MGBGP_PreRateMlyReg, MG_MGBGL0120_Ins01Bridge>
		caller = ((MGBGP_PreRateMlyReg_MC)this).new MG_MGBGL0120_Ins01Caller<MGBGP_PreRateMlyReg, MG_MGBGL0120_Ins01Bridge>(
					(MGBGP_PreRateMlyReg)this, new MG_MGBGL0120_Ins01Bridge());
		return caller;
	}
	/** [MG_MGBGL0120_Ins01]の呼び出し */
	protected void callMG_MGBGL0120_Ins01() {
		MCCaller caller = createMG_MGBGL0120_Ins01();
		caller.exec();
	}
	/** [MG_MGBGL0120_Upd01]のCallerの作成 */
	protected MGBGP_PreRateMlyReg_MC.MG_MGBGL0120_Upd01Caller createMG_MGBGL0120_Upd01() {
		MGBGP_PreRateMlyReg_MC.MG_MGBGL0120_Upd01Caller<MGBGP_PreRateMlyReg, MG_MGBGL0120_Upd01Bridge>
		caller = ((MGBGP_PreRateMlyReg_MC)this).new MG_MGBGL0120_Upd01Caller<MGBGP_PreRateMlyReg, MG_MGBGL0120_Upd01Bridge>(
					(MGBGP_PreRateMlyReg)this, new MG_MGBGL0120_Upd01Bridge());
		return caller;
	}
	/** [MG_MGBGL0120_Upd01]の呼び出し */
	protected void callMG_MGBGL0120_Upd01() {
		MCCaller caller = createMG_MGBGL0120_Upd01();
		caller.exec();
	}
	/** [MG_MGBGL0120_Del01]のCallerの作成 */
	protected MGBGP_PreRateMlyReg_MC.MG_MGBGL0120_Del01Caller createMG_MGBGL0120_Del01() {
		MGBGP_PreRateMlyReg_MC.MG_MGBGL0120_Del01Caller<MGBGP_PreRateMlyReg, MG_MGBGL0120_Del01Bridge>
		caller = ((MGBGP_PreRateMlyReg_MC)this).new MG_MGBGL0120_Del01Caller<MGBGP_PreRateMlyReg, MG_MGBGL0120_Del01Bridge>(
					(MGBGP_PreRateMlyReg)this, new MG_MGBGL0120_Del01Bridge());
		return caller;
	}
	/** [MG_MGBGL0120_Del01]の呼び出し */
	protected void callMG_MGBGL0120_Del01() {
		MCCaller caller = createMG_MGBGL0120_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBG.MGBGP0120.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMGBG.MGBGP0120.HdrR aHdrR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBG.MGBGP0120.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBG.MGBGP0120.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBG.MGBGP0120.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBG.MGBGP0120.CndR createCndR() {
		return mcframe.clientMGBG.MGBGP0120.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMGBG.MGBGP0120.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMGBG.MGBGP0120.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMGBG.MGBGP0120.HdrR createHdrR() {
		return mcframe.clientMGBG.MGBGP0120.HdrR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBG.MGBGP0120.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBG.MGBGP0120.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBG.MGBGP0120.RsltR createRsltR() {
		return mcframe.clientMGBG.MGBGP0120.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBG.MGBGP0120.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBG.MGBGP0120.RsltR.class);
	}

	/**
	 * RsltTableを初期化します。
	 */
	protected void createRsltTable(){
		if(RsltTable == null){
			RsltTable = beansFactory.createTable2("Rslt.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
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
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getRsltL()) return "Rslt";
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
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("Rslt")) return getRsltL();
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
		ret.add(HdrPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBGP_PreRateMlyReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBGP_PreRateMlyReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBGP_PreRateMlyReg_MC.jbCreateScreenOpe((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbCreateTop((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbCreateFold((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbCreateCnd((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbCreateCtrl((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbCreateHdr((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbCreateRslt((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbCreateBtn((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbCreateEastBtn((MGBGP_PreRateMlyReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBGP_PreRateMlyReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBGP_PreRateMlyReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBGP_PreRateMlyReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBGP_PreRateMlyReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBGP_PreRateMlyReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MGBGP_PreRateMlyReg p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBGP_PreRateMlyReg p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBG.MGBGP0120.RsltR.$itm_p);
		p.Rslt_itm_p_PPanel.setName("Rslt.itm_p");
		p.columnRslt_itm_cd = p.Rslt_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt_itm_cd.addAliasName("Rslt.itm_cd", p);
		p.columnRslt_itm_sub1 = p.Rslt_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_itm_sub1.addAliasName("Rslt.itm_sub1", p);
		p.columnRslt_itm_sub2 = p.Rslt_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_itm_sub2.addAliasName("Rslt.itm_sub2", p);
		p.columnRslt_itm_sub3 = p.Rslt_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_itm_sub3.addAliasName("Rslt.itm_sub3", p);
		p.columnRslt_itm_nm = p.Rslt_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt_itm_nm.addAliasName("Rslt.itm_nm", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMGBG.MGBGP0120.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBGP_PreRateMlyReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MGBGP_PreRateMlyReg p) {
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

	
	/** [Cnd_sa_typ_ListPutter]の定義 */
	private MCListPutter Cnd_sa_typ_p = null;

	/**
	 * [Cnd_sa_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sa_typ_ListPutter() {
		if (Cnd_sa_typ_p == null) {
			Cnd_sa_typ_p = createCnd_sa_typ_ListPutter(Cnd_sa_typ, "sa_typ", "sa_typ_nm");

		}
		return Cnd_sa_typ_p;
	}
	
	
	/** [Cnd_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_calc_ctg_cd_p = null;

	/**
	 * [Cnd_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_ctg_cd_ListPutter() {
		if (Cnd_calc_ctg_cd_p == null) {
			Cnd_calc_ctg_cd_p = createCnd_calc_ctg_cd_ListPutter(Cnd_calc_ctg_cd, "calc_ctg_cd", "calc_ctg_nm");

		}
		return Cnd_calc_ctg_cd_p;
	}
	
	
	/** [Cnd_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_wg_cd_p = null;

	/**
	 * [Cnd_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wg_cd_ListPutter() {
		if (Cnd_wg_cd_p == null) {
			Cnd_wg_cd_p = createCnd_wg_cd_ListPutter(Cnd_wg_cd, "wg_cd", "wg_nm");

		}
		return Cnd_wg_cd_p;
	}
	
	
	/** [Cnd_pre_alc_rate_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pre_alc_rate_cd_p = null;

	/**
	 * [Cnd_pre_alc_rate_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pre_alc_rate_cd_ListPutter() {
		if (Cnd_pre_alc_rate_cd_p == null) {
			Cnd_pre_alc_rate_cd_p = createCnd_pre_alc_rate_cd_ListPutter(Cnd_pre_alc_rate_cd, "pre_alc_rate_cd", "pre_alc_rate_nm","pre_alc_ptn_cd","pre_alc_ptn_nm");

		}
		return Cnd_pre_alc_rate_cd_p;
	}
	
	
	/** [Hdr_sa_typ_ListPutter]の定義 */
	private MCListPutter Hdr_sa_typ_p = null;

	/**
	 * [Hdr_sa_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_sa_typ_ListPutter() {
		if (Hdr_sa_typ_p == null) {
			Hdr_sa_typ_p = createHdr_sa_typ_ListPutter(Hdr_sa_typ, "sa_typ", "sa_typ_nm");

		}
		return Hdr_sa_typ_p;
	}
	
	
	/** [Hdr_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter Hdr_calc_ctg_cd_p = null;

	/**
	 * [Hdr_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_calc_ctg_cd_ListPutter() {
		if (Hdr_calc_ctg_cd_p == null) {
			Hdr_calc_ctg_cd_p = createHdr_calc_ctg_cd_ListPutter(Hdr_calc_ctg_cd, "calc_ctg_cd", "calc_ctg_nm");

		}
		return Hdr_calc_ctg_cd_p;
	}
	
	
	/** [Hdr_wg_cd_ListPutter]の定義 */
	private MCListPutter Hdr_wg_cd_p = null;

	/**
	 * [Hdr_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_wg_cd_ListPutter() {
		if (Hdr_wg_cd_p == null) {
			Hdr_wg_cd_p = createHdr_wg_cd_ListPutter(Hdr_wg_cd, "wg_cd", "wg_nm");

		}
		return Hdr_wg_cd_p;
	}
	
	
	/** [Hdr_pre_alc_rate_cd_ListPutter]の定義 */
	private MCListPutter Hdr_pre_alc_rate_cd_p = null;

	/**
	 * [Hdr_pre_alc_rate_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_pre_alc_rate_cd_ListPutter() {
		if (Hdr_pre_alc_rate_cd_p == null) {
			Hdr_pre_alc_rate_cd_p = createHdr_pre_alc_rate_cd_ListPutter(Hdr_pre_alc_rate_cd, "pre_alc_rate_cd", "pre_alc_rate_nm","pre_alc_ptn_cd");

		}
		return Hdr_pre_alc_rate_cd_p;
	}
	
	
	/** [Hdr_pre_alc_ptn_cd_ListPutter]の定義 */
	private MCListPutter Hdr_pre_alc_ptn_cd_p = null;

	/**
	 * [Hdr_pre_alc_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_pre_alc_ptn_cd_ListPutter() {
		if (Hdr_pre_alc_ptn_cd_p == null) {
			Hdr_pre_alc_ptn_cd_p = createHdr_pre_alc_ptn_cd_ListPutter(Hdr_pre_alc_ptn_cd, "pre_alc_ptn_cd", "pre_alc_ptn_nm","dpt_alc_typ","loc_alc_typ","oper_alc_typ","bp_alc_typ","ctg_alc_typ","itm_alc_typ","lot_alc_typ","sublot_alc_typ","sno1_alc_typ","sno2_alc_typ","sno3_alc_typ","sno4_alc_typ","inst_alc_typ","iv_alc_typ","po_alc_typ","slo_alc_typ","alc_ac_alc_typ","wg_alc_typ");

		}
		return Hdr_pre_alc_ptn_cd_p;
	}
	
	
	/** [Rslt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_dpt_cd_p = null;

	/**
	 * [Rslt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dpt_cd_ListPutter() {
		if (Rslt_dpt_cd_p == null) {
			Rslt_dpt_cd_p = createRslt_dpt_cd_ListPutter(columnRslt_dpt_cd, "dpt_cd", "dpt_nm");

		}
		return Rslt_dpt_cd_p;
	}
	
	
	/** [Rslt_loc_cd_ListPutter]の定義 */
	private MCListPutter Rslt_loc_cd_p = null;

	/**
	 * [Rslt_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_loc_cd_ListPutter() {
		if (Rslt_loc_cd_p == null) {
			Rslt_loc_cd_p = createRslt_loc_cd_ListPutter(columnRslt_loc_cd, "loc_cd", "loc_nm");

		}
		return Rslt_loc_cd_p;
	}
	
	
	/** [Rslt_oper_cd_ListPutter]の定義 */
	private MCListPutter Rslt_oper_cd_p = null;

	/**
	 * [Rslt_oper_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_oper_cd_ListPutter() {
		if (Rslt_oper_cd_p == null) {
			Rslt_oper_cd_p = createRslt_oper_cd_ListPutter(columnRslt_oper_cd, "oper_cd", "oper_nm");

		}
		return Rslt_oper_cd_p;
	}
	
	
	/** [Rslt_bp_cd_ListPutter]の定義 */
	private MCListPutter Rslt_bp_cd_p = null;

	/**
	 * [Rslt_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_bp_cd_ListPutter() {
		if (Rslt_bp_cd_p == null) {
			Rslt_bp_cd_p = createRslt_bp_cd_ListPutter(columnRslt_bp_cd, "bp_cd", "bp_nm");

		}
		return Rslt_bp_cd_p;
	}
	
	
	/** [Rslt_ctg_cd_ListPutter]の定義 */
	private MCListPutter Rslt_ctg_cd_p = null;

	/**
	 * [Rslt_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_ctg_cd_ListPutter() {
		if (Rslt_ctg_cd_p == null) {
			Rslt_ctg_cd_p = createRslt_ctg_cd_ListPutter(columnRslt_ctg_cd, "ctg_cd", "ctg_nm");

		}
		return Rslt_ctg_cd_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_cd_p = createRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_sub1_p = createRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_sub2_p = createRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_sub3_p = createRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Rslt_alc_ac_cd_ListPutter]の定義 */
	private MCListPutter Rslt_alc_ac_cd_p = null;

	/**
	 * [Rslt_alc_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_alc_ac_cd_ListPutter() {
		if (Rslt_alc_ac_cd_p == null) {
			Rslt_alc_ac_cd_p = createRslt_alc_ac_cd_ListPutter(columnRslt_alc_ac_cd, "alc_ac_cd", "alc_ac_nm");

		}
		return Rslt_alc_ac_cd_p;
	}
	
	
	/** [Rslt_trd_wg_cd_ListPutter]の定義 */
	private MCListPutter Rslt_trd_wg_cd_p = null;

	/**
	 * [Rslt_trd_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_trd_wg_cd_ListPutter() {
		if (Rslt_trd_wg_cd_p == null) {
			Rslt_trd_wg_cd_p = createRslt_trd_wg_cd_ListPutter(columnRslt_trd_wg_cd, "trd_wg_cd", "trd_wg_nm");

		}
		return Rslt_trd_wg_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBGP_PreRateMlyReg create(){
		MGBGP_PreRateMlyReg p = new MGBGP_PreRateMlyReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBGP_PreRateMlyReg create(String name){
		MGBGP_PreRateMlyReg p = new MGBGP_PreRateMlyReg(name);
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
		MGBGP_PreRateMlyReg_MC.jbfInitScreenOpe((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbfInitTop((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbfInitFold((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbfInitCnd((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbfInitCtrl((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbfInitHdr((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbfInitRslt((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbfInitBtn((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbfInitEastBtn((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbInitScreenOpe((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbInitTop((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbInitFold((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbInitCnd((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbInitCtrl((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbInitHdr((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbInitRslt((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbInitBtn((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.jbInitEastBtn((MGBGP_PreRateMlyReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBGP_PreRateMlyReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBGP_PreRateMlyReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBGP_PreRateMlyReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBGP_PreRateMlyReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_sa_typ_Label = p.beansFactory.createLabel("Cnd.sa_typ_Label");
		p.Cnd_sa_typ = p.beansFactory.createTextComboBox("Cnd.sa_typ");
		p.Cnd_sa_typ.setLabel(p.Cnd_sa_typ_Label);
		p.Cnd_sa_typ_nm = p.beansFactory.createTextField("Cnd.sa_typ_nm");
		p.Cnd_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.calc_ctg_cd_Label");
		p.Cnd_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.calc_ctg_cd");
		p.Cnd_calc_ctg_cd.setLabel(p.Cnd_calc_ctg_cd_Label);
		p.Cnd_calc_ctg_nm = p.beansFactory.createTextField("Cnd.calc_ctg_nm");
		p.Cnd_ym_Label = p.beansFactory.createLabel("Cnd.ym_Label");
		p.Cnd_ym = p.beansFactory.createDateField("Cnd.ym");
		p.Cnd_ym.setLabel(p.Cnd_ym_Label);
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_pre_alc_rate_cd_Label = p.beansFactory.createLabel("Cnd.pre_alc_rate_cd_Label");
		p.Cnd_pre_alc_rate_cd = p.beansFactory.createTextComboBox("Cnd.pre_alc_rate_cd");
		p.Cnd_pre_alc_rate_cd.setLabel(p.Cnd_pre_alc_rate_cd_Label);
		p.Cnd_pre_alc_rate_nm = p.beansFactory.createTextField("Cnd.pre_alc_rate_nm");
		p.Cnd_pre_alc_ptn_cd_Label = p.beansFactory.createLabel("Cnd.pre_alc_ptn_cd_Label");
		p.Cnd_pre_alc_ptn_cd = p.beansFactory.createTextField("Cnd.pre_alc_ptn_cd");
		p.Cnd_pre_alc_ptn_cd.setLabel(p.Cnd_pre_alc_ptn_cd_Label);
		p.Cnd_pre_alc_ptn_nm = p.beansFactory.createTextField("Cnd.pre_alc_ptn_nm");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBGP_PreRateMlyReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MGBGP_PreRateMlyReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		p.HdrTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Hdr_sa_typ_Label = p.beansFactory.createLabel("Hdr.sa_typ_Label");
		p.Hdr_sa_typ = p.beansFactory.createTextComboBox("Hdr.sa_typ");
		p.Hdr_sa_typ.setLabel(p.Hdr_sa_typ_Label);
		p.Hdr_sa_typ_nm = p.beansFactory.createTextField("Hdr.sa_typ_nm");
		p.Hdr_calc_ctg_cd_Label = p.beansFactory.createLabel("Hdr.calc_ctg_cd_Label");
		p.Hdr_calc_ctg_cd = p.beansFactory.createTextComboBox("Hdr.calc_ctg_cd");
		p.Hdr_calc_ctg_cd.setLabel(p.Hdr_calc_ctg_cd_Label);
		p.Hdr_calc_ctg_nm = p.beansFactory.createTextField("Hdr.calc_ctg_nm");
		p.Hdr_ym_Label = p.beansFactory.createLabel("Hdr.ym_Label");
		p.Hdr_ym = p.beansFactory.createDateField("Hdr.ym");
		p.Hdr_ym.setLabel(p.Hdr_ym_Label);
		p.Hdr_wg_cd_Label = p.beansFactory.createLabel("Hdr.wg_cd_Label");
		p.Hdr_wg_cd = p.beansFactory.createTextComboBox("Hdr.wg_cd");
		p.Hdr_wg_cd.setLabel(p.Hdr_wg_cd_Label);
		p.Hdr_wg_nm = p.beansFactory.createTextField("Hdr.wg_nm");
		p.Hdr_pre_alc_rate_cd_Label = p.beansFactory.createLabel("Hdr.pre_alc_rate_cd_Label");
		p.Hdr_pre_alc_rate_cd = p.beansFactory.createTextComboBox("Hdr.pre_alc_rate_cd");
		p.Hdr_pre_alc_rate_cd.setLabel(p.Hdr_pre_alc_rate_cd_Label);
		p.Hdr_pre_alc_rate_nm = p.beansFactory.createTextField("Hdr.pre_alc_rate_nm");
		p.Hdr_pre_alc_ptn_cd_Label = p.beansFactory.createLabel("Hdr.pre_alc_ptn_cd_Label");
		p.Hdr_pre_alc_ptn_cd = p.beansFactory.createTextComboBox("Hdr.pre_alc_ptn_cd");
		p.Hdr_pre_alc_ptn_cd.setLabel(p.Hdr_pre_alc_ptn_cd_Label);
		p.Hdr_pre_alc_ptn_nm = p.beansFactory.createTextField("Hdr.pre_alc_ptn_nm");
		p.Hdr_dpt_alc_typ = p.beansFactory.createTextField("Hdr.dpt_alc_typ");
		p.Hdr_loc_alc_typ = p.beansFactory.createTextField("Hdr.loc_alc_typ");
		p.Hdr_oper_alc_typ = p.beansFactory.createTextField("Hdr.oper_alc_typ");
		p.Hdr_bp_alc_typ = p.beansFactory.createTextField("Hdr.bp_alc_typ");
		p.Hdr_ctg_alc_typ = p.beansFactory.createTextField("Hdr.ctg_alc_typ");
		p.Hdr_itm_alc_typ = p.beansFactory.createTextField("Hdr.itm_alc_typ");
		p.Hdr_lot_alc_typ = p.beansFactory.createTextField("Hdr.lot_alc_typ");
		p.Hdr_sublot_alc_typ = p.beansFactory.createTextField("Hdr.sublot_alc_typ");
		p.Hdr_sno1_alc_typ = p.beansFactory.createTextField("Hdr.sno1_alc_typ");
		p.Hdr_sno2_alc_typ = p.beansFactory.createTextField("Hdr.sno2_alc_typ");
		p.Hdr_sno3_alc_typ = p.beansFactory.createTextField("Hdr.sno3_alc_typ");
		p.Hdr_sno4_alc_typ = p.beansFactory.createTextField("Hdr.sno4_alc_typ");
		p.Hdr_inst_alc_typ = p.beansFactory.createTextField("Hdr.inst_alc_typ");
		p.Hdr_iv_alc_typ = p.beansFactory.createTextField("Hdr.iv_alc_typ");
		p.Hdr_po_alc_typ = p.beansFactory.createTextField("Hdr.po_alc_typ");
		p.Hdr_slo_alc_typ = p.beansFactory.createTextField("Hdr.slo_alc_typ");
		p.Hdr_alc_ac_alc_typ = p.beansFactory.createTextField("Hdr.alc_ac_alc_typ");
		p.Hdr_wg_alc_typ = p.beansFactory.createTextField("Hdr.wg_alc_typ");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBGP_PreRateMlyReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_sa_typ = p.beansFactory.createTableColumn("Rslt.sa_typ", MCColumnType.TEXT);
		p.columnRslt_calc_ctg_cd = p.beansFactory.createTableColumn("Rslt.calc_ctg_cd", MCColumnType.TEXT);
		p.columnRslt_ym = p.beansFactory.createTableColumn("Rslt.ym", MCColumnType.DATE);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_pre_alc_rate_cd = p.beansFactory.createTableColumn("Rslt.pre_alc_rate_cd", MCColumnType.TEXT);
		p.columnRslt_dpt_cd = p.beansFactory.createTableColumn("Rslt.dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_dpt_nm = p.beansFactory.createTableColumn("Rslt.dpt_nm", MCColumnType.TEXT);
		p.columnRslt_loc_cd = p.beansFactory.createTableColumn("Rslt.loc_cd", MCColumnType.TEXT);
		p.columnRslt_loc_nm = p.beansFactory.createTableColumn("Rslt.loc_nm", MCColumnType.TEXT);
		p.columnRslt_oper_cd = p.beansFactory.createTableColumn("Rslt.oper_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_oper_nm = p.beansFactory.createTableColumn("Rslt.oper_nm", MCColumnType.TEXT);
		p.columnRslt_bp_cd = p.beansFactory.createTableColumn("Rslt.bp_cd", MCColumnType.TEXT);
		p.columnRslt_bp_nm = p.beansFactory.createTableColumn("Rslt.bp_nm", MCColumnType.TEXT);
		p.columnRslt_ctg_cd = p.beansFactory.createTableColumn("Rslt.ctg_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_ctg_nm = p.beansFactory.createTableColumn("Rslt.ctg_nm", MCColumnType.TEXT);
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
		p.columnRslt_sno1 = p.beansFactory.createTableColumn("Rslt.sno1", MCColumnType.TEXT);
		p.columnRslt_sno2 = p.beansFactory.createTableColumn("Rslt.sno2", MCColumnType.TEXT);
		p.columnRslt_sno3 = p.beansFactory.createTableColumn("Rslt.sno3", MCColumnType.TEXT);
		p.columnRslt_sno4 = p.beansFactory.createTableColumn("Rslt.sno4", MCColumnType.TEXT);
		p.columnRslt_itm_mfg_inst_no = p.beansFactory.createTableColumn("Rslt.itm_mfg_inst_no", MCColumnType.TEXT);
		p.columnRslt_iv_no = p.beansFactory.createTableColumn("Rslt.iv_no", MCColumnType.TEXT);
		p.columnRslt_po_no = p.beansFactory.createTableColumn("Rslt.po_no", MCColumnType.TEXT);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_alc_ac_cd = p.beansFactory.createTableColumn("Rslt.alc_ac_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_alc_ac_nm = p.beansFactory.createTableColumn("Rslt.alc_ac_nm", MCColumnType.TEXT);
		p.columnRslt_trd_wg_cd = p.beansFactory.createTableColumn("Rslt.trd_wg_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_trd_wg_nm = p.beansFactory.createTableColumn("Rslt.trd_wg_nm", MCColumnType.TEXT);
		p.columnRslt_pre_alc_rate = p.beansFactory.createTableColumn("Rslt.pre_alc_rate", MCColumnType.NUMBER);
		p.columnRslt_adj_flg = p.beansFactory.createTableColumn("Rslt.adj_flg", MCColumnType.CHECK);
		p.columnRslt_rmrks = p.beansFactory.createTableColumn("Rslt.rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBGP_PreRateMlyReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MGBGP_PreRateMlyReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBGP_PreRateMlyReg p) {
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
	protected static void jbInitTop(MGBGP_PreRateMlyReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.HdrPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
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
	protected static void jbInitFold(MGBGP_PreRateMlyReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MGBGP_PreRateMlyReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_INS);
		p.ScreenOpePanel.add(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setNextBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0120.CndR.ope_META);
		p.Cnd_sa_typ.setListType(MCListType.FREE);
		p.Cnd_sa_typ.setLinkBeans(p.Cnd_sa_typ_nm);
		p.CndPanel.add(p.Cnd_sa_typ_Label);
		p.CndPanel.add(p.Cnd_sa_typ);
		p.CndPanel.setLastBeans(p.Cnd_sa_typ);
		p.Cnd_sa_typ.setNextBeans(p.Cnd_sa_typ_nm);
		p.Cnd_sa_typ.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0120.CndR.sa_typ_META);
		p.CndPanel.add(p.Cnd_sa_typ_nm);
		p.Cnd_sa_typ_nm.setNextBeans(p.Cnd_calc_ctg_cd);
		p.Cnd_sa_typ_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0120.CndR.sa_typ_nm_META);
		p.Cnd_calc_ctg_cd.setListType(MCListType.FREE);
		p.Cnd_calc_ctg_cd.setLinkBeans(p.Cnd_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_calc_ctg_cd);
		p.Cnd_calc_ctg_cd.setNextBeans(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0120.CndR.calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_nm.setNextBeans(p.Cnd_ym);
		p.Cnd_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0120.CndR.calc_ctg_nm_META);
		p.CndPanel.add(p.Cnd_ym_Label);
		p.CndPanel.add(p.Cnd_ym);
		p.Cnd_ym.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_ym.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0120.CndR.ym_META);
		p.Cnd_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0120.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_pre_alc_rate_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0120.CndR.wg_nm_META);
		p.Cnd_pre_alc_rate_cd.setListType(MCListType.FREE);
		p.Cnd_pre_alc_rate_cd.setLinkBeans(p.Cnd_pre_alc_rate_nm,p.Cnd_pre_alc_ptn_cd,p.Cnd_pre_alc_ptn_nm);
		p.CndPanel.add(p.Cnd_pre_alc_rate_cd_Label);
		p.CndPanel.add(p.Cnd_pre_alc_rate_cd);
		p.Cnd_pre_alc_rate_cd.setNextBeans(p.Cnd_pre_alc_rate_nm);
		p.Cnd_pre_alc_rate_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0120.CndR.pre_alc_rate_cd_META);
		p.CndPanel.add(p.Cnd_pre_alc_rate_nm);
		p.Cnd_pre_alc_rate_nm.setNextBeans(p.Cnd_pre_alc_ptn_cd);
		p.Cnd_pre_alc_rate_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0120.CndR.pre_alc_rate_nm_META);
		p.CndPanel.add(p.Cnd_pre_alc_ptn_cd_Label);
		p.CndPanel.add(p.Cnd_pre_alc_ptn_cd);
		p.Cnd_pre_alc_ptn_cd.setNextBeans(p.Cnd_pre_alc_ptn_nm);
		p.Cnd_pre_alc_ptn_cd.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0120.CndR.pre_alc_ptn_cd_META);
		p.CndPanel.add(p.Cnd_pre_alc_ptn_nm);
		p.Cnd_pre_alc_ptn_nm.setRow(p.getCndR(), mcframe.clientMGBG.MGBGP0120.CndR.pre_alc_ptn_nm_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBGP_PreRateMlyReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MGBGP_PreRateMlyReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setBorder(p.HdrTitledBorder);
		p.add(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.RsltPanel);
		p.HdrPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.Hdr_sa_typ.setListType(MCListType.STRICT);
		p.Hdr_sa_typ.setLinkBeans(p.Hdr_sa_typ_nm);
		p.HdrPanel.add(p.Hdr_sa_typ_Label);
		p.HdrPanel.add(p.Hdr_sa_typ);
		p.HdrPanel.setLastBeans(p.Hdr_sa_typ);
		p.Hdr_sa_typ.setNextBeans(p.Hdr_sa_typ_nm);
		p.Hdr_sa_typ.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.sa_typ_META);
		p.HdrPanel.add(p.Hdr_sa_typ_nm);
		p.Hdr_sa_typ_nm.setNextBeans(p.Hdr_calc_ctg_cd);
		p.Hdr_sa_typ_nm.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.sa_typ_nm_META);
		p.Hdr_calc_ctg_cd.setListType(MCListType.STRICT);
		p.Hdr_calc_ctg_cd.setLinkBeans(p.Hdr_calc_ctg_nm);
		p.HdrPanel.add(p.Hdr_calc_ctg_cd_Label);
		p.HdrPanel.add(p.Hdr_calc_ctg_cd);
		p.Hdr_calc_ctg_cd.setNextBeans(p.Hdr_calc_ctg_nm);
		p.Hdr_calc_ctg_cd.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.calc_ctg_cd_META);
		p.HdrPanel.add(p.Hdr_calc_ctg_nm);
		p.Hdr_calc_ctg_nm.setNextBeans(p.Hdr_ym);
		p.Hdr_calc_ctg_nm.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.calc_ctg_nm_META);
		p.HdrPanel.add(p.Hdr_ym_Label);
		p.HdrPanel.add(p.Hdr_ym);
		p.Hdr_ym.setNextBeans(p.Hdr_wg_cd);
		p.Hdr_ym.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.ym_META);
		p.Hdr_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Hdr_wg_cd.setListType(MCListType.STRICT);
		p.Hdr_wg_cd.setLinkBeans(p.Hdr_wg_nm);
		p.HdrPanel.add(p.Hdr_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_wg_cd);
		p.Hdr_wg_cd.setNextBeans(p.Hdr_wg_nm);
		p.Hdr_wg_cd.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.wg_cd_META);
		p.HdrPanel.add(p.Hdr_wg_nm);
		p.Hdr_wg_nm.setNextBeans(p.Hdr_pre_alc_rate_cd);
		p.Hdr_wg_nm.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.wg_nm_META);
		p.Hdr_pre_alc_rate_cd.setListType(MCListType.STRICT);
		p.Hdr_pre_alc_rate_cd.setLinkBeans(p.Hdr_pre_alc_rate_nm,p.Hdr_pre_alc_ptn_cd);
		p.HdrPanel.add(p.Hdr_pre_alc_rate_cd_Label);
		p.HdrPanel.add(p.Hdr_pre_alc_rate_cd);
		p.Hdr_pre_alc_rate_cd.setNextBeans(p.Hdr_pre_alc_rate_nm);
		p.Hdr_pre_alc_rate_cd.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.pre_alc_rate_cd_META);
		p.HdrPanel.add(p.Hdr_pre_alc_rate_nm);
		p.Hdr_pre_alc_rate_nm.setNextBeans(p.Hdr_pre_alc_ptn_cd);
		p.Hdr_pre_alc_rate_nm.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.pre_alc_rate_nm_META);
		p.Hdr_pre_alc_ptn_cd.setListType(MCListType.STRICT);
		p.Hdr_pre_alc_ptn_cd.setLinkBeans(p.Hdr_pre_alc_ptn_nm,p.Hdr_dpt_alc_typ,p.Hdr_loc_alc_typ,p.Hdr_oper_alc_typ,p.Hdr_bp_alc_typ,p.Hdr_ctg_alc_typ,p.Hdr_itm_alc_typ,p.Hdr_lot_alc_typ,p.Hdr_sublot_alc_typ,p.Hdr_sno1_alc_typ,p.Hdr_sno2_alc_typ,p.Hdr_sno3_alc_typ,p.Hdr_sno4_alc_typ,p.Hdr_inst_alc_typ,p.Hdr_iv_alc_typ,p.Hdr_po_alc_typ,p.Hdr_slo_alc_typ,p.Hdr_alc_ac_alc_typ,p.Hdr_wg_alc_typ);
		p.HdrPanel.add(p.Hdr_pre_alc_ptn_cd_Label);
		p.HdrPanel.add(p.Hdr_pre_alc_ptn_cd);
		p.Hdr_pre_alc_ptn_cd.setNextBeans(p.Hdr_pre_alc_ptn_nm);
		p.Hdr_pre_alc_ptn_cd.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.pre_alc_ptn_cd_META);
		p.HdrPanel.add(p.Hdr_pre_alc_ptn_nm);
		p.Hdr_pre_alc_ptn_nm.setNextBeans(p.Hdr_dpt_alc_typ);
		p.Hdr_pre_alc_ptn_nm.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.pre_alc_ptn_nm_META);
		p.HdrPanel.add(p.Hdr_dpt_alc_typ);
		p.Hdr_dpt_alc_typ.setNextBeans(p.Hdr_loc_alc_typ);
		p.Hdr_dpt_alc_typ.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.dpt_alc_typ_META);
		p.HdrPanel.add(p.Hdr_loc_alc_typ);
		p.Hdr_loc_alc_typ.setNextBeans(p.Hdr_oper_alc_typ);
		p.Hdr_loc_alc_typ.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.loc_alc_typ_META);
		p.HdrPanel.add(p.Hdr_oper_alc_typ);
		p.Hdr_oper_alc_typ.setNextBeans(p.Hdr_bp_alc_typ);
		p.Hdr_oper_alc_typ.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.oper_alc_typ_META);
		p.HdrPanel.add(p.Hdr_bp_alc_typ);
		p.Hdr_bp_alc_typ.setNextBeans(p.Hdr_ctg_alc_typ);
		p.Hdr_bp_alc_typ.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.bp_alc_typ_META);
		p.HdrPanel.add(p.Hdr_ctg_alc_typ);
		p.Hdr_ctg_alc_typ.setNextBeans(p.Hdr_itm_alc_typ);
		p.Hdr_ctg_alc_typ.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.ctg_alc_typ_META);
		p.HdrPanel.add(p.Hdr_itm_alc_typ);
		p.Hdr_itm_alc_typ.setNextBeans(p.Hdr_lot_alc_typ);
		p.Hdr_itm_alc_typ.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.itm_alc_typ_META);
		p.HdrPanel.add(p.Hdr_lot_alc_typ);
		p.Hdr_lot_alc_typ.setNextBeans(p.Hdr_sublot_alc_typ);
		p.Hdr_lot_alc_typ.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.lot_alc_typ_META);
		p.HdrPanel.add(p.Hdr_sublot_alc_typ);
		p.Hdr_sublot_alc_typ.setNextBeans(p.Hdr_sno1_alc_typ);
		p.Hdr_sublot_alc_typ.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.sublot_alc_typ_META);
		p.HdrPanel.add(p.Hdr_sno1_alc_typ);
		p.Hdr_sno1_alc_typ.setNextBeans(p.Hdr_sno2_alc_typ);
		p.Hdr_sno1_alc_typ.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.sno1_alc_typ_META);
		p.HdrPanel.add(p.Hdr_sno2_alc_typ);
		p.Hdr_sno2_alc_typ.setNextBeans(p.Hdr_sno3_alc_typ);
		p.Hdr_sno2_alc_typ.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.sno2_alc_typ_META);
		p.HdrPanel.add(p.Hdr_sno3_alc_typ);
		p.Hdr_sno3_alc_typ.setNextBeans(p.Hdr_sno4_alc_typ);
		p.Hdr_sno3_alc_typ.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.sno3_alc_typ_META);
		p.HdrPanel.add(p.Hdr_sno4_alc_typ);
		p.Hdr_sno4_alc_typ.setNextBeans(p.Hdr_inst_alc_typ);
		p.Hdr_sno4_alc_typ.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.sno4_alc_typ_META);
		p.HdrPanel.add(p.Hdr_inst_alc_typ);
		p.Hdr_inst_alc_typ.setNextBeans(p.Hdr_iv_alc_typ);
		p.Hdr_inst_alc_typ.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.inst_alc_typ_META);
		p.HdrPanel.add(p.Hdr_iv_alc_typ);
		p.Hdr_iv_alc_typ.setNextBeans(p.Hdr_po_alc_typ);
		p.Hdr_iv_alc_typ.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.iv_alc_typ_META);
		p.HdrPanel.add(p.Hdr_po_alc_typ);
		p.Hdr_po_alc_typ.setNextBeans(p.Hdr_slo_alc_typ);
		p.Hdr_po_alc_typ.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.po_alc_typ_META);
		p.HdrPanel.add(p.Hdr_slo_alc_typ);
		p.Hdr_slo_alc_typ.setNextBeans(p.Hdr_alc_ac_alc_typ);
		p.Hdr_slo_alc_typ.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.slo_alc_typ_META);
		p.HdrPanel.add(p.Hdr_alc_ac_alc_typ);
		p.Hdr_alc_ac_alc_typ.setNextBeans(p.Hdr_wg_alc_typ);
		p.Hdr_alc_ac_alc_typ.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.alc_ac_alc_typ_META);
		p.HdrPanel.add(p.Hdr_wg_alc_typ);
		p.Hdr_wg_alc_typ.setRow(p.getHdrR(), mcframe.clientMGBG.MGBGP0120.HdrR.wg_alc_typ_META);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MGBGP_PreRateMlyReg p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBGP_PreRateMlyReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.BtnPanel.setLastBeans(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_radd);
		p.Btn_radd.setIcon("INSERT_RECORD");
		p.Btn_radd.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_radd);
		p.Btn_radd.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_rcopy);
		p.Btn_rcopy.setIcon("COPY_RECORD");
		p.Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_rcopy);
		p.Btn_rcopy.setNextBeans(p.Btn_ins);
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins);
		p.Btn_ins.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MGBGP_PreRateMlyReg p) {
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
		MGBGP_PreRateMlyReg_MC.mcInitScreenOpe((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.mcInitTop((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.mcInitFold((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.mcInitCnd((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.mcInitCtrl((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.mcInitHdr((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.mcInitRslt((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.mcInitBtn((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.mcInitEastBtn((MGBGP_PreRateMlyReg)this);

		// [INS]ステータスのモードの設定
		MGBGP_PreRateMlyReg_MC.statusInitINS_ScreenOpe((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitINS_Top((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitINS_Fold((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitINS_Cnd((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitINS_Ctrl((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitINS_Hdr((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitINS_Rslt((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitINS_Btn((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitINS_EastBtn((MGBGP_PreRateMlyReg)this);

		// [FIX_I]ステータスのモードの設定
		MGBGP_PreRateMlyReg_MC.statusInitFIX__I_ScreenOpe((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitFIX__I_Top((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitFIX__I_Fold((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitFIX__I_Cnd((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitFIX__I_Ctrl((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitFIX__I_Hdr((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitFIX__I_Rslt((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitFIX__I_Btn((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitFIX__I_EastBtn((MGBGP_PreRateMlyReg)this);

		// [SRCH]ステータスのモードの設定
		MGBGP_PreRateMlyReg_MC.statusInitSRCH_ScreenOpe((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitSRCH_Top((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitSRCH_Fold((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitSRCH_Cnd((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitSRCH_Ctrl((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitSRCH_Hdr((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitSRCH_Rslt((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitSRCH_Btn((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitSRCH_EastBtn((MGBGP_PreRateMlyReg)this);

		// [UPD]ステータスのモードの設定
		MGBGP_PreRateMlyReg_MC.statusInitUPD_ScreenOpe((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitUPD_Top((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitUPD_Fold((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitUPD_Cnd((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitUPD_Ctrl((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitUPD_Hdr((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitUPD_Rslt((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitUPD_Btn((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitUPD_EastBtn((MGBGP_PreRateMlyReg)this);

		// [DEL]ステータスのモードの設定
		MGBGP_PreRateMlyReg_MC.statusInitDEL_ScreenOpe((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitDEL_Top((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitDEL_Fold((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitDEL_Cnd((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitDEL_Ctrl((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitDEL_Hdr((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitDEL_Rslt((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitDEL_Btn((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitDEL_EastBtn((MGBGP_PreRateMlyReg)this);

		// [REF]ステータスのモードの設定
		MGBGP_PreRateMlyReg_MC.statusInitREF_ScreenOpe((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitREF_Top((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitREF_Fold((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitREF_Cnd((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitREF_Ctrl((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitREF_Hdr((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitREF_Rslt((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitREF_Btn((MGBGP_PreRateMlyReg)this);
		MGBGP_PreRateMlyReg_MC.statusInitREF_EastBtn((MGBGP_PreRateMlyReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBGP_PreRateMlyReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBGP_PreRateMlyReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBGP_PreRateMlyReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBGP_PreRateMlyReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_sa_typ.setListListener(p);
		p.Cnd_sa_typ.addAllListener(p);
		p.Cnd_sa_typ_nm.setListListener(p);
		p.Cnd_sa_typ_nm.addAllListener(p);
		p.Cnd_calc_ctg_cd.setListListener(p);
		p.Cnd_calc_ctg_cd.addAllListener(p);
		p.Cnd_calc_ctg_nm.setListListener(p);
		p.Cnd_calc_ctg_nm.addAllListener(p);
		p.Cnd_ym.setListListener(p);
		p.Cnd_ym.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_pre_alc_rate_cd.setListListener(p);
		p.Cnd_pre_alc_rate_cd.addAllListener(p);
		p.Cnd_pre_alc_rate_nm.setListListener(p);
		p.Cnd_pre_alc_rate_nm.addAllListener(p);
		p.Cnd_pre_alc_ptn_cd.setListListener(p);
		p.Cnd_pre_alc_ptn_cd.addAllListener(p);
		p.Cnd_pre_alc_ptn_nm.setListListener(p);
		p.Cnd_pre_alc_ptn_nm.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBGP_PreRateMlyReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MGBGP_PreRateMlyReg p) {
		p.Hdr_sa_typ.setListListener(p);
		p.Hdr_sa_typ.addAllListener(p);
		p.Hdr_sa_typ_nm.setListListener(p);
		p.Hdr_sa_typ_nm.addAllListener(p);
		p.Hdr_calc_ctg_cd.setListListener(p);
		p.Hdr_calc_ctg_cd.addAllListener(p);
		p.Hdr_calc_ctg_nm.setListListener(p);
		p.Hdr_calc_ctg_nm.addAllListener(p);
		p.Hdr_ym.setListListener(p);
		p.Hdr_ym.addAllListener(p);
		p.Hdr_wg_cd.setListListener(p);
		p.Hdr_wg_cd.addAllListener(p);
		p.Hdr_wg_nm.setListListener(p);
		p.Hdr_wg_nm.addAllListener(p);
		p.Hdr_pre_alc_rate_cd.setListListener(p);
		p.Hdr_pre_alc_rate_cd.addAllListener(p);
		p.Hdr_pre_alc_rate_nm.setListListener(p);
		p.Hdr_pre_alc_rate_nm.addAllListener(p);
		p.Hdr_pre_alc_ptn_cd.setListListener(p);
		p.Hdr_pre_alc_ptn_cd.addAllListener(p);
		p.Hdr_pre_alc_ptn_nm.setListListener(p);
		p.Hdr_pre_alc_ptn_nm.addAllListener(p);
		p.Hdr_dpt_alc_typ.setListListener(p);
		p.Hdr_dpt_alc_typ.addAllListener(p);
		p.Hdr_loc_alc_typ.setListListener(p);
		p.Hdr_loc_alc_typ.addAllListener(p);
		p.Hdr_oper_alc_typ.setListListener(p);
		p.Hdr_oper_alc_typ.addAllListener(p);
		p.Hdr_bp_alc_typ.setListListener(p);
		p.Hdr_bp_alc_typ.addAllListener(p);
		p.Hdr_ctg_alc_typ.setListListener(p);
		p.Hdr_ctg_alc_typ.addAllListener(p);
		p.Hdr_itm_alc_typ.setListListener(p);
		p.Hdr_itm_alc_typ.addAllListener(p);
		p.Hdr_lot_alc_typ.setListListener(p);
		p.Hdr_lot_alc_typ.addAllListener(p);
		p.Hdr_sublot_alc_typ.setListListener(p);
		p.Hdr_sublot_alc_typ.addAllListener(p);
		p.Hdr_sno1_alc_typ.setListListener(p);
		p.Hdr_sno1_alc_typ.addAllListener(p);
		p.Hdr_sno2_alc_typ.setListListener(p);
		p.Hdr_sno2_alc_typ.addAllListener(p);
		p.Hdr_sno3_alc_typ.setListListener(p);
		p.Hdr_sno3_alc_typ.addAllListener(p);
		p.Hdr_sno4_alc_typ.setListListener(p);
		p.Hdr_sno4_alc_typ.addAllListener(p);
		p.Hdr_inst_alc_typ.setListListener(p);
		p.Hdr_inst_alc_typ.addAllListener(p);
		p.Hdr_iv_alc_typ.setListListener(p);
		p.Hdr_iv_alc_typ.addAllListener(p);
		p.Hdr_po_alc_typ.setListListener(p);
		p.Hdr_po_alc_typ.addAllListener(p);
		p.Hdr_slo_alc_typ.setListListener(p);
		p.Hdr_slo_alc_typ.addAllListener(p);
		p.Hdr_alc_ac_alc_typ.setListListener(p);
		p.Hdr_alc_ac_alc_typ.addAllListener(p);
		p.Hdr_wg_alc_typ.setListListener(p);
		p.Hdr_wg_alc_typ.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBGP_PreRateMlyReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_sa_typ.addAllListener(p);
		p.columnRslt_sa_typ.setListListener(p);
		p.columnRslt_calc_ctg_cd.addAllListener(p);
		p.columnRslt_calc_ctg_cd.setListListener(p);
		p.columnRslt_ym.addAllListener(p);
		p.columnRslt_ym.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_pre_alc_rate_cd.addAllListener(p);
		p.columnRslt_pre_alc_rate_cd.setListListener(p);
		p.columnRslt_dpt_cd.addAllListener(p);
		p.columnRslt_dpt_cd.setListListener(p);
		p.columnRslt_dpt_nm.addAllListener(p);
		p.columnRslt_dpt_nm.setListListener(p);
		p.columnRslt_loc_cd.addAllListener(p);
		p.columnRslt_loc_cd.setListListener(p);
		p.columnRslt_loc_nm.addAllListener(p);
		p.columnRslt_loc_nm.setListListener(p);
		p.columnRslt_oper_cd.addAllListener(p);
		p.columnRslt_oper_cd.setListListener(p);
		p.columnRslt_oper_nm.addAllListener(p);
		p.columnRslt_oper_nm.setListListener(p);
		p.columnRslt_bp_cd.addAllListener(p);
		p.columnRslt_bp_cd.setListListener(p);
		p.columnRslt_bp_nm.addAllListener(p);
		p.columnRslt_bp_nm.setListListener(p);
		p.columnRslt_ctg_cd.addAllListener(p);
		p.columnRslt_ctg_cd.setListListener(p);
		p.columnRslt_ctg_nm.addAllListener(p);
		p.columnRslt_ctg_nm.setListListener(p);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_lot_no.addAllListener(p);
		p.columnRslt_lot_no.setListListener(p);
		p.columnRslt_sublot_no.addAllListener(p);
		p.columnRslt_sublot_no.setListListener(p);
		p.columnRslt_sno1.addAllListener(p);
		p.columnRslt_sno1.setListListener(p);
		p.columnRslt_sno2.addAllListener(p);
		p.columnRslt_sno2.setListListener(p);
		p.columnRslt_sno3.addAllListener(p);
		p.columnRslt_sno3.setListListener(p);
		p.columnRslt_sno4.addAllListener(p);
		p.columnRslt_sno4.setListListener(p);
		p.columnRslt_itm_mfg_inst_no.addAllListener(p);
		p.columnRslt_itm_mfg_inst_no.setListListener(p);
		p.columnRslt_iv_no.addAllListener(p);
		p.columnRslt_iv_no.setListListener(p);
		p.columnRslt_po_no.addAllListener(p);
		p.columnRslt_po_no.setListListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_alc_ac_cd.addAllListener(p);
		p.columnRslt_alc_ac_cd.setListListener(p);
		p.columnRslt_alc_ac_nm.addAllListener(p);
		p.columnRslt_alc_ac_nm.setListListener(p);
		p.columnRslt_trd_wg_cd.addAllListener(p);
		p.columnRslt_trd_wg_cd.setListListener(p);
		p.columnRslt_trd_wg_nm.addAllListener(p);
		p.columnRslt_trd_wg_nm.setListListener(p);
		p.columnRslt_pre_alc_rate.addAllListener(p);
		p.columnRslt_pre_alc_rate.setListListener(p);
		p.columnRslt_adj_flg.addAllListener(p);
		p.columnRslt_rmrks.addAllListener(p);
		p.columnRslt_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_ins_usr_id.addAllListener(p);
		p.columnRslt_ins_usr_id.setListListener(p);
		p.columnRslt_ins_usr_nm.addAllListener(p);
		p.columnRslt_ins_usr_nm.setListListener(p);
		p.columnRslt_ins_func_id.addAllListener(p);
		p.columnRslt_ins_func_id.setListListener(p);
		p.columnRslt_ins_func_nm.addAllListener(p);
		p.columnRslt_ins_func_nm.setListListener(p);
		p.columnRslt_ins_ts.addAllListener(p);
		p.columnRslt_ins_ts.setListListener(p);
		p.columnRslt_upd_usr_id.addAllListener(p);
		p.columnRslt_upd_usr_id.setListListener(p);
		p.columnRslt_upd_usr_nm.addAllListener(p);
		p.columnRslt_upd_usr_nm.setListListener(p);
		p.columnRslt_upd_func_id.addAllListener(p);
		p.columnRslt_upd_func_id.setListListener(p);
		p.columnRslt_upd_func_nm.addAllListener(p);
		p.columnRslt_upd_func_nm.setListListener(p);
		p.columnRslt_upd_ts.addAllListener(p);
		p.columnRslt_upd_ts.setListListener(p);
		p.columnRslt_upd_srv_req_no.addAllListener(p);
		p.columnRslt_upd_srv_req_no.setListListener(p);
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBGP_PreRateMlyReg p) {
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_ins.addAllListener(p);
		p.Btn_ins.setAPMethodName("doBtn_ins");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MGBGP_PreRateMlyReg p) {
	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [INS]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS_Top(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [INS]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINS_Fold(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MGBGP_PreRateMlyReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_sa_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_sa_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_calc_ctg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_calc_ctg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_ym.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_pre_alc_rate_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_pre_alc_rate_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_pre_alc_ptn_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_pre_alc_ptn_nm.putMode(p, INS, MCMode.READ_ONLY);

	}

	/**
	 * [INS]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Ctrl(MGBGP_PreRateMlyReg p){
		p.Ctrl_ctrl_PPanel.putStatus(INS, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.DISABLE);

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MGBGP_PreRateMlyReg p){
		p.Hdr_sa_typ.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_sa_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_calc_ctg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ym.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_wg_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_pre_alc_rate_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_pre_alc_rate_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_pre_alc_ptn_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_pre_alc_ptn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dpt_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_loc_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_oper_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_bp_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ctg_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_itm_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_lot_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sublot_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sno1_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sno2_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sno3_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_sno4_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_inst_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_iv_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_po_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_slo_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_alc_ac_alc_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_wg_alc_typ.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rslt(MGBGP_PreRateMlyReg p){
		p.columnRslt_check.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_sa_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_calc_ctg_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_ym.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_pre_alc_rate_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_dpt_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_oper_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_bp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ctg_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_ctg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.ENABLE);
		p.columnRslt_lot_no.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_sublot_no.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_sno1.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_sno2.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_sno3.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_sno4.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_itm_mfg_inst_no.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_iv_no.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_po_no.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_slo_no.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_alc_ac_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_alc_ac_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_trd_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_adj_flg.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MGBGP_PreRateMlyReg p){
		p.Btn_select_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_radd.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, INS, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [FIX_I]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Top(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [FIX_I]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Fold(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MGBGP_PreRateMlyReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_sa_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_sa_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_calc_ctg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_calc_ctg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_ym.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_pre_alc_rate_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_pre_alc_rate_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_pre_alc_ptn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_pre_alc_ptn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Ctrl(MGBGP_PreRateMlyReg p){
		p.Ctrl_ctrl_PPanel.putStatus(FIX_I, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MGBGP_PreRateMlyReg p){
		p.Hdr_sa_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sa_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ym.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pre_alc_rate_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pre_alc_rate_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pre_alc_ptn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_pre_alc_ptn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dpt_alc_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_loc_alc_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_oper_alc_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_bp_alc_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ctg_alc_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_itm_alc_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_lot_alc_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sublot_alc_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sno1_alc_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sno2_alc_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sno3_alc_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_sno4_alc_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_inst_alc_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_iv_alc_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_po_alc_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_slo_alc_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_alc_ac_alc_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_wg_alc_typ.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Rslt(MGBGP_PreRateMlyReg p){
		p.columnRslt_check.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sa_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_calc_ctg_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_ym.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_pre_alc_rate_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ctg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ctg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_adj_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MGBGP_PreRateMlyReg p){
		p.Btn_select_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBGP_PreRateMlyReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sa_typ.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_sa_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_calc_ctg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ym.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_pre_alc_rate_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_pre_alc_rate_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_pre_alc_ptn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_pre_alc_ptn_nm.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBGP_PreRateMlyReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MGBGP_PreRateMlyReg p){
		p.Hdr_sa_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sa_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pre_alc_rate_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pre_alc_rate_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pre_alc_ptn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pre_alc_ptn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dpt_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_loc_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_oper_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_bp_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ctg_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_itm_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_lot_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sublot_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sno1_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sno2_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sno3_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sno4_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_inst_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_iv_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_po_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_slo_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_alc_ac_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_wg_alc_typ.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MGBGP_PreRateMlyReg p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sa_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_calc_ctg_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ym.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_pre_alc_rate_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_adj_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MGBGP_PreRateMlyReg p){
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MGBGP_PreRateMlyReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sa_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_sa_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_calc_ctg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_ym.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_pre_alc_rate_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_pre_alc_rate_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_pre_alc_ptn_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_pre_alc_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MGBGP_PreRateMlyReg p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MGBGP_PreRateMlyReg p){
		p.Hdr_sa_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sa_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_pre_alc_rate_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_pre_alc_rate_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_pre_alc_ptn_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_pre_alc_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dpt_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_loc_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_oper_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_bp_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ctg_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_itm_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_lot_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sublot_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sno1_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sno2_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sno3_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sno4_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_inst_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_iv_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_po_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_slo_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_alc_ac_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_wg_alc_typ.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MGBGP_PreRateMlyReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_sa_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_calc_ctg_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ym.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_pre_alc_rate_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_oper_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ctg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.ENABLE);
		p.columnRslt_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sublot_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sno1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sno2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sno3.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sno4.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_itm_mfg_inst_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_iv_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_po_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_slo_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_alc_ac_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_alc_ac_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_trd_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_adj_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MGBGP_PreRateMlyReg p){
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MGBGP_PreRateMlyReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_sa_typ.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_sa_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_calc_ctg_cd.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_ym.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_pre_alc_rate_cd.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_pre_alc_rate_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_pre_alc_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_pre_alc_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MGBGP_PreRateMlyReg p){
		p.Ctrl_ctrl_PPanel.putStatus(DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MGBGP_PreRateMlyReg p){
		p.Hdr_sa_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sa_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pre_alc_rate_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pre_alc_rate_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pre_alc_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_pre_alc_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dpt_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_loc_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_oper_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_bp_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ctg_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_itm_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_lot_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sublot_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sno1_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sno2_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sno3_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_sno4_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_inst_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_iv_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_po_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_slo_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_alc_ac_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_wg_alc_typ.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MGBGP_PreRateMlyReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_sa_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_calc_ctg_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ym.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_pre_alc_rate_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ctg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ctg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_adj_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MGBGP_PreRateMlyReg p){
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBGP_PreRateMlyReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBGP_PreRateMlyReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sa_typ.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sa_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_calc_ctg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ym.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_pre_alc_rate_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_pre_alc_rate_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_pre_alc_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_pre_alc_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBGP_PreRateMlyReg p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MGBGP_PreRateMlyReg p){
		p.Hdr_sa_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sa_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pre_alc_rate_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pre_alc_rate_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pre_alc_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pre_alc_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dpt_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_loc_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_oper_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_bp_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ctg_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_itm_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_lot_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sublot_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sno1_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sno2_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sno3_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sno4_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_inst_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_iv_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_po_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_slo_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_alc_ac_alc_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_wg_alc_typ.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBGP_PreRateMlyReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sa_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_calc_ctg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ym.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_pre_alc_rate_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sno4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_mfg_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alc_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pre_alc_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_adj_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MGBGP_PreRateMlyReg p){
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_ins.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MGBGP_PreRateMlyReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return INS;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MGBGP_PreRateMlyReg_MC.setTableConfigRslt((MGBGP_PreRateMlyReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBGP_PreRateMlyReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_sa_typ.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.sa_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sa_typ);
		p.columnRslt_calc_ctg_cd.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.calc_ctg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_calc_ctg_cd);
		p.columnRslt_ym.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.ym_META);
		p.columnRslt_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ym);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_pre_alc_rate_cd.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.pre_alc_rate_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_alc_rate_cd);
		p.columnRslt_dpt_cd.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.dpt_cd_META);
		p.columnRslt_dpt_cd.addLinkBeans(p.columnRslt_dpt_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_cd);
		p.columnRslt_dpt_nm.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_nm);
		p.columnRslt_loc_cd.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.loc_cd_META);
		p.columnRslt_loc_cd.setListType(MCListType.STRICT);
		p.columnRslt_loc_cd.addLinkBeans(p.columnRslt_loc_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_cd);
		p.columnRslt_loc_nm.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_nm);
		p.columnRslt_oper_cd.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.oper_cd_META);
		p.columnRslt_oper_cd.addLinkBeans(p.columnRslt_oper_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_cd);
		p.columnRslt_oper_nm.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.oper_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_nm);
		p.columnRslt_bp_cd.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.bp_cd_META);
		p.columnRslt_bp_cd.setListType(MCListType.STRICT);
		p.columnRslt_bp_cd.addLinkBeans(p.columnRslt_bp_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_cd);
		p.columnRslt_bp_nm.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_nm);
		p.columnRslt_ctg_cd.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.ctg_cd_META);
		p.columnRslt_ctg_cd.addLinkBeans(p.columnRslt_ctg_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_ctg_cd);
		p.columnRslt_ctg_nm.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.ctg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ctg_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub1, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub3);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnRslt_itm_nm);
		p.columnRslt_lot_no.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.columnRslt_sno1.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.sno1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1);
		p.columnRslt_sno2.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.sno2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2);
		p.columnRslt_sno3.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.sno3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3);
		p.columnRslt_sno4.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.sno4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4);
		p.columnRslt_itm_mfg_inst_no.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.itm_mfg_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_mfg_inst_no);
		p.columnRslt_iv_no.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_no);
		p.columnRslt_po_no.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_no);
		p.columnRslt_slo_no.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_alc_ac_cd.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.alc_ac_cd_META);
		p.columnRslt_alc_ac_cd.addLinkBeans(p.columnRslt_alc_ac_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_ac_cd);
		p.columnRslt_alc_ac_nm.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.alc_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alc_ac_nm);
		p.columnRslt_trd_wg_cd.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.trd_wg_cd_META);
		p.columnRslt_trd_wg_cd.addLinkBeans(p.columnRslt_trd_wg_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_wg_cd);
		p.columnRslt_trd_wg_nm.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.trd_wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_wg_nm);
		p.columnRslt_pre_alc_rate.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.pre_alc_rate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pre_alc_rate);
		p.columnRslt_adj_flg.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.adj_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_adj_flg);
		p.columnRslt_rmrks.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMGBG.MGBGP0120.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_sa_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sa_typ.getListConfig().setPutter(getCnd_sa_typ_ListPutter());
		Cnd_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_ctg_cd.getListConfig().setPutter(getCnd_calc_ctg_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_pre_alc_rate_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_pre_alc_rate_cd.getListConfig().setPutter(getCnd_pre_alc_rate_cd_ListPutter());
		Hdr_sa_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_sa_typ.getListConfig().setPutter(getHdr_sa_typ_ListPutter());
		Hdr_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_calc_ctg_cd.getListConfig().setPutter(getHdr_calc_ctg_cd_ListPutter());
		Hdr_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_wg_cd.getListConfig().setPutter(getHdr_wg_cd_ListPutter());
		Hdr_pre_alc_rate_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_pre_alc_rate_cd.getListConfig().setPutter(getHdr_pre_alc_rate_cd_ListPutter());
		Hdr_pre_alc_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_pre_alc_ptn_cd.getListConfig().setPutter(getHdr_pre_alc_ptn_cd_ListPutter());
		columnRslt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_dpt_cd.getListConfig().setPutter(getRslt_dpt_cd_ListPutter());
		columnRslt_loc_cd.getListConfig().setPutter(getRslt_loc_cd_ListPutter());
		columnRslt_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_oper_cd.getListConfig().setPutter(getRslt_oper_cd_ListPutter());
		columnRslt_bp_cd.getListConfig().setPutter(getRslt_bp_cd_ListPutter());
		columnRslt_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_ctg_cd.getListConfig().setPutter(getRslt_ctg_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnRslt_alc_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_alc_ac_cd.getListConfig().setPutter(getRslt_alc_ac_cd_ListPutter());
		columnRslt_trd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_trd_wg_cd.getListConfig().setPutter(getRslt_trd_wg_cd_ListPutter());
	}

	/**
	 * この画面を[INS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINSStatus() {
		status = INS;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_I]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_IStatus() {
		status = FIX_I;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCHStatus() {
		status = SRCH;
		setAllStatus(status);
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
		if (INS.equals(status)) {
			setINSStatus();
		}
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Cnd_sa_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sa_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SaTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [Cnd_pre_alc_rate_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pre_alc_rate_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.PreAlcRateWithPtn");
		return lp;
	}
	 
	/**
	 * [Hdr_sa_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_sa_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SaTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [Hdr_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [Hdr_pre_alc_rate_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_pre_alc_rate_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.PreAlcRateWithPtnNotInPreRateMly");
		return lp;
	}
	 
	/**
	 * [Hdr_pre_alc_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_pre_alc_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PreAlcPtn");
		return lp;
	}
	 
	/**
	 * [Rslt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
		return lp;
	}
	 
	/**
	 * [Rslt_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Rslt_oper_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_oper_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Oper");
		return lp;
	}
	 
	/**
	 * [Rslt_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Rslt_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostCtg");
		return lp;
	}
	 
	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Rslt_alc_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_alc_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAc");
		return lp;
	}
	 
	/**
	 * [Rslt_trd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_trd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_sa_typ) return getCnd_sa_typ(row, info);
		if(combo == Cnd_calc_ctg_cd) return getCnd_calc_ctg_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_pre_alc_rate_cd) return getCnd_pre_alc_rate_cd(row, info);
		if(combo == Hdr_sa_typ) return getHdr_sa_typ(row, info);
		if(combo == Hdr_calc_ctg_cd) return getHdr_calc_ctg_cd(row, info);
		if(combo == Hdr_wg_cd) return getHdr_wg_cd(row, info);
		if(combo == Hdr_pre_alc_rate_cd) return getHdr_pre_alc_rate_cd(row, info);
		if(combo == Hdr_pre_alc_ptn_cd) return getHdr_pre_alc_ptn_cd(row, info);
		if(combo == columnRslt_dpt_cd) return getRslt_dpt_cd(row, info);
		if(combo == columnRslt_loc_cd) return getRslt_loc_cd(row, info);
		if(combo == columnRslt_oper_cd) return getRslt_oper_cd(row, info);
		if(combo == columnRslt_bp_cd) return getRslt_bp_cd(row, info);
		if(combo == columnRslt_ctg_cd) return getRslt_ctg_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_cd) return getRslt_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub1) return getRslt_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub2) return getRslt_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub3) return getRslt_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnRslt_alc_ac_cd) return getRslt_alc_ac_cd(row, info);
		if(combo == columnRslt_trd_wg_cd) return getRslt_trd_wg_cd(row, info);
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
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_radd(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel(MCEventInfo info);

	/**
	 * [Btn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins(MCEventInfo info);

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
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_sa_typ) return doCnd_sa_typ_VC(info);
		if (vc == Cnd_sa_typ_nm) return doCnd_sa_typ_nm_VC(info);
		if (vc == Cnd_calc_ctg_cd) return doCnd_calc_ctg_cd_VC(info);
		if (vc == Cnd_calc_ctg_nm) return doCnd_calc_ctg_nm_VC(info);
		if (vc == Cnd_ym) return doCnd_ym_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_pre_alc_rate_cd) return doCnd_pre_alc_rate_cd_VC(info);
		if (vc == Cnd_pre_alc_rate_nm) return doCnd_pre_alc_rate_nm_VC(info);
		if (vc == Cnd_pre_alc_ptn_cd) return doCnd_pre_alc_ptn_cd_VC(info);
		if (vc == Cnd_pre_alc_ptn_nm) return doCnd_pre_alc_ptn_nm_VC(info);
		if (vc == Hdr_sa_typ) return doHdr_sa_typ_VC(info);
		if (vc == Hdr_sa_typ_nm) return doHdr_sa_typ_nm_VC(info);
		if (vc == Hdr_calc_ctg_cd) return doHdr_calc_ctg_cd_VC(info);
		if (vc == Hdr_calc_ctg_nm) return doHdr_calc_ctg_nm_VC(info);
		if (vc == Hdr_ym) return doHdr_ym_VC(info);
		if (vc == Hdr_wg_cd) return doHdr_wg_cd_VC(info);
		if (vc == Hdr_wg_nm) return doHdr_wg_nm_VC(info);
		if (vc == Hdr_pre_alc_rate_cd) return doHdr_pre_alc_rate_cd_VC(info);
		if (vc == Hdr_pre_alc_rate_nm) return doHdr_pre_alc_rate_nm_VC(info);
		if (vc == Hdr_pre_alc_ptn_cd) return doHdr_pre_alc_ptn_cd_VC(info);
		if (vc == Hdr_pre_alc_ptn_nm) return doHdr_pre_alc_ptn_nm_VC(info);
		if (vc == Hdr_dpt_alc_typ) return doHdr_dpt_alc_typ_VC(info);
		if (vc == Hdr_loc_alc_typ) return doHdr_loc_alc_typ_VC(info);
		if (vc == Hdr_oper_alc_typ) return doHdr_oper_alc_typ_VC(info);
		if (vc == Hdr_bp_alc_typ) return doHdr_bp_alc_typ_VC(info);
		if (vc == Hdr_ctg_alc_typ) return doHdr_ctg_alc_typ_VC(info);
		if (vc == Hdr_itm_alc_typ) return doHdr_itm_alc_typ_VC(info);
		if (vc == Hdr_lot_alc_typ) return doHdr_lot_alc_typ_VC(info);
		if (vc == Hdr_sublot_alc_typ) return doHdr_sublot_alc_typ_VC(info);
		if (vc == Hdr_sno1_alc_typ) return doHdr_sno1_alc_typ_VC(info);
		if (vc == Hdr_sno2_alc_typ) return doHdr_sno2_alc_typ_VC(info);
		if (vc == Hdr_sno3_alc_typ) return doHdr_sno3_alc_typ_VC(info);
		if (vc == Hdr_sno4_alc_typ) return doHdr_sno4_alc_typ_VC(info);
		if (vc == Hdr_inst_alc_typ) return doHdr_inst_alc_typ_VC(info);
		if (vc == Hdr_iv_alc_typ) return doHdr_iv_alc_typ_VC(info);
		if (vc == Hdr_po_alc_typ) return doHdr_po_alc_typ_VC(info);
		if (vc == Hdr_slo_alc_typ) return doHdr_slo_alc_typ_VC(info);
		if (vc == Hdr_alc_ac_alc_typ) return doHdr_alc_ac_alc_typ_VC(info);
		if (vc == Hdr_wg_alc_typ) return doHdr_wg_alc_typ_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_sa_typ) return doRslt_sa_typ_VC(info);
		if (vc == columnRslt_calc_ctg_cd) return doRslt_calc_ctg_cd_VC(info);
		if (vc == columnRslt_ym) return doRslt_ym_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_pre_alc_rate_cd) return doRslt_pre_alc_rate_cd_VC(info);
		if (vc == columnRslt_dpt_cd) return doRslt_dpt_cd_VC(info);
		if (vc == columnRslt_dpt_nm) return doRslt_dpt_nm_VC(info);
		if (vc == columnRslt_loc_cd) return doRslt_loc_cd_VC(info);
		if (vc == columnRslt_loc_nm) return doRslt_loc_nm_VC(info);
		if (vc == columnRslt_oper_cd) return doRslt_oper_cd_VC(info);
		if (vc == columnRslt_oper_nm) return doRslt_oper_nm_VC(info);
		if (vc == columnRslt_bp_cd) return doRslt_bp_cd_VC(info);
		if (vc == columnRslt_bp_nm) return doRslt_bp_nm_VC(info);
		if (vc == columnRslt_ctg_cd) return doRslt_ctg_cd_VC(info);
		if (vc == columnRslt_ctg_nm) return doRslt_ctg_nm_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
		if (vc == columnRslt_sno1) return doRslt_sno1_VC(info);
		if (vc == columnRslt_sno2) return doRslt_sno2_VC(info);
		if (vc == columnRslt_sno3) return doRslt_sno3_VC(info);
		if (vc == columnRslt_sno4) return doRslt_sno4_VC(info);
		if (vc == columnRslt_itm_mfg_inst_no) return doRslt_itm_mfg_inst_no_VC(info);
		if (vc == columnRslt_iv_no) return doRslt_iv_no_VC(info);
		if (vc == columnRslt_po_no) return doRslt_po_no_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_alc_ac_cd) return doRslt_alc_ac_cd_VC(info);
		if (vc == columnRslt_alc_ac_nm) return doRslt_alc_ac_nm_VC(info);
		if (vc == columnRslt_trd_wg_cd) return doRslt_trd_wg_cd_VC(info);
		if (vc == columnRslt_trd_wg_nm) return doRslt_trd_wg_nm_VC(info);
		if (vc == columnRslt_pre_alc_rate) return doRslt_pre_alc_rate_VC(info);
		if (vc == columnRslt_adj_flg) return doRslt_adj_flg_VC(info);
		if (vc == columnRslt_rmrks) return doRslt_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
		return true;
	}

	/**
	 * [Rslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sa_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sa_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sa_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sa_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pre_alc_rate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pre_alc_rate_nm_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[sa_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sa_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sa_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sa_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pre_alc_rate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pre_alc_rate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pre_alc_rate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pre_alc_rate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pre_alc_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pre_alc_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pre_alc_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pre_alc_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dpt_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dpt_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[loc_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_loc_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[oper_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_oper_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bp_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bp_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ctg_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ctg_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[itm_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_itm_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lot_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lot_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sublot_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sublot_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sno1_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sno1_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sno2_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sno2_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sno3_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sno3_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sno4_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sno4_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[inst_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_inst_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[iv_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_iv_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[po_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_po_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[slo_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_slo_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[alc_ac_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_alc_ac_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wg_alc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wg_alc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sa_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sa_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_alc_rate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alc_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alc_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alc_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pre_alc_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[adj_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_adj_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_cntr_VC(MCEventInfo info){
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
		if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_sa_typ) doCnd_sa_typ_NC(info);
		else if (nc == Cnd_sa_typ_nm) doCnd_sa_typ_nm_NC(info);
		else if (nc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NC(info);
		else if (nc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NC(info);
		else if (nc == Cnd_ym) doCnd_ym_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_pre_alc_rate_cd) doCnd_pre_alc_rate_cd_NC(info);
		else if (nc == Cnd_pre_alc_rate_nm) doCnd_pre_alc_rate_nm_NC(info);
		else if (nc == Cnd_pre_alc_ptn_cd) doCnd_pre_alc_ptn_cd_NC(info);
		else if (nc == Cnd_pre_alc_ptn_nm) doCnd_pre_alc_ptn_nm_NC(info);
		else if (nc == Hdr_sa_typ) doHdr_sa_typ_NC(info);
		else if (nc == Hdr_sa_typ_nm) doHdr_sa_typ_nm_NC(info);
		else if (nc == Hdr_calc_ctg_cd) doHdr_calc_ctg_cd_NC(info);
		else if (nc == Hdr_calc_ctg_nm) doHdr_calc_ctg_nm_NC(info);
		else if (nc == Hdr_ym) doHdr_ym_NC(info);
		else if (nc == Hdr_wg_cd) doHdr_wg_cd_NC(info);
		else if (nc == Hdr_wg_nm) doHdr_wg_nm_NC(info);
		else if (nc == Hdr_pre_alc_rate_cd) doHdr_pre_alc_rate_cd_NC(info);
		else if (nc == Hdr_pre_alc_rate_nm) doHdr_pre_alc_rate_nm_NC(info);
		else if (nc == Hdr_pre_alc_ptn_cd) doHdr_pre_alc_ptn_cd_NC(info);
		else if (nc == Hdr_pre_alc_ptn_nm) doHdr_pre_alc_ptn_nm_NC(info);
		else if (nc == Hdr_dpt_alc_typ) doHdr_dpt_alc_typ_NC(info);
		else if (nc == Hdr_loc_alc_typ) doHdr_loc_alc_typ_NC(info);
		else if (nc == Hdr_oper_alc_typ) doHdr_oper_alc_typ_NC(info);
		else if (nc == Hdr_bp_alc_typ) doHdr_bp_alc_typ_NC(info);
		else if (nc == Hdr_ctg_alc_typ) doHdr_ctg_alc_typ_NC(info);
		else if (nc == Hdr_itm_alc_typ) doHdr_itm_alc_typ_NC(info);
		else if (nc == Hdr_lot_alc_typ) doHdr_lot_alc_typ_NC(info);
		else if (nc == Hdr_sublot_alc_typ) doHdr_sublot_alc_typ_NC(info);
		else if (nc == Hdr_sno1_alc_typ) doHdr_sno1_alc_typ_NC(info);
		else if (nc == Hdr_sno2_alc_typ) doHdr_sno2_alc_typ_NC(info);
		else if (nc == Hdr_sno3_alc_typ) doHdr_sno3_alc_typ_NC(info);
		else if (nc == Hdr_sno4_alc_typ) doHdr_sno4_alc_typ_NC(info);
		else if (nc == Hdr_inst_alc_typ) doHdr_inst_alc_typ_NC(info);
		else if (nc == Hdr_iv_alc_typ) doHdr_iv_alc_typ_NC(info);
		else if (nc == Hdr_po_alc_typ) doHdr_po_alc_typ_NC(info);
		else if (nc == Hdr_slo_alc_typ) doHdr_slo_alc_typ_NC(info);
		else if (nc == Hdr_alc_ac_alc_typ) doHdr_alc_ac_alc_typ_NC(info);
		else if (nc == Hdr_wg_alc_typ) doHdr_wg_alc_typ_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_sa_typ) doRslt_sa_typ_NC(info);
		else if (nc == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_NC(info);
		else if (nc == columnRslt_ym) doRslt_ym_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_pre_alc_rate_cd) doRslt_pre_alc_rate_cd_NC(info);
		else if (nc == columnRslt_dpt_cd) doRslt_dpt_cd_NC(info);
		else if (nc == columnRslt_dpt_nm) doRslt_dpt_nm_NC(info);
		else if (nc == columnRslt_loc_cd) doRslt_loc_cd_NC(info);
		else if (nc == columnRslt_loc_nm) doRslt_loc_nm_NC(info);
		else if (nc == columnRslt_oper_cd) doRslt_oper_cd_NC(info);
		else if (nc == columnRslt_oper_nm) doRslt_oper_nm_NC(info);
		else if (nc == columnRslt_bp_cd) doRslt_bp_cd_NC(info);
		else if (nc == columnRslt_bp_nm) doRslt_bp_nm_NC(info);
		else if (nc == columnRslt_ctg_cd) doRslt_ctg_cd_NC(info);
		else if (nc == columnRslt_ctg_nm) doRslt_ctg_nm_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
		else if (nc == columnRslt_sno1) doRslt_sno1_NC(info);
		else if (nc == columnRslt_sno2) doRslt_sno2_NC(info);
		else if (nc == columnRslt_sno3) doRslt_sno3_NC(info);
		else if (nc == columnRslt_sno4) doRslt_sno4_NC(info);
		else if (nc == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_NC(info);
		else if (nc == columnRslt_iv_no) doRslt_iv_no_NC(info);
		else if (nc == columnRslt_po_no) doRslt_po_no_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_alc_ac_cd) doRslt_alc_ac_cd_NC(info);
		else if (nc == columnRslt_alc_ac_nm) doRslt_alc_ac_nm_NC(info);
		else if (nc == columnRslt_trd_wg_cd) doRslt_trd_wg_cd_NC(info);
		else if (nc == columnRslt_trd_wg_nm) doRslt_trd_wg_nm_NC(info);
		else if (nc == columnRslt_pre_alc_rate) doRslt_pre_alc_rate_NC(info);
		else if (nc == columnRslt_adj_flg) doRslt_adj_flg_NC(info);
		else if (nc == columnRslt_rmrks) doRslt_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sa_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sa_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sa_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sa_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_nm_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[sa_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sa_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sa_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sa_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ym_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_alc_rate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_alc_rate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_alc_rate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_alc_rate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_alc_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_alc_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_alc_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_alc_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dpt_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dpt_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[loc_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_loc_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[oper_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_oper_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bp_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ctg_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ctg_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sublot_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sublot_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno1_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno1_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno2_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno2_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno3_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno3_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno4_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno4_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inst_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inst_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[alc_ac_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_alc_ac_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_alc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_alc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sa_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sa_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adj_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adj_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_sa_typ) doCnd_sa_typ_NE(info);
		else if (ne == Cnd_sa_typ_nm) doCnd_sa_typ_nm_NE(info);
		else if (ne == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NE(info);
		else if (ne == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NE(info);
		else if (ne == Cnd_ym) doCnd_ym_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_pre_alc_rate_cd) doCnd_pre_alc_rate_cd_NE(info);
		else if (ne == Cnd_pre_alc_rate_nm) doCnd_pre_alc_rate_nm_NE(info);
		else if (ne == Cnd_pre_alc_ptn_cd) doCnd_pre_alc_ptn_cd_NE(info);
		else if (ne == Cnd_pre_alc_ptn_nm) doCnd_pre_alc_ptn_nm_NE(info);
		else if (ne == Hdr_sa_typ) doHdr_sa_typ_NE(info);
		else if (ne == Hdr_sa_typ_nm) doHdr_sa_typ_nm_NE(info);
		else if (ne == Hdr_calc_ctg_cd) doHdr_calc_ctg_cd_NE(info);
		else if (ne == Hdr_calc_ctg_nm) doHdr_calc_ctg_nm_NE(info);
		else if (ne == Hdr_ym) doHdr_ym_NE(info);
		else if (ne == Hdr_wg_cd) doHdr_wg_cd_NE(info);
		else if (ne == Hdr_wg_nm) doHdr_wg_nm_NE(info);
		else if (ne == Hdr_pre_alc_rate_cd) doHdr_pre_alc_rate_cd_NE(info);
		else if (ne == Hdr_pre_alc_rate_nm) doHdr_pre_alc_rate_nm_NE(info);
		else if (ne == Hdr_pre_alc_ptn_cd) doHdr_pre_alc_ptn_cd_NE(info);
		else if (ne == Hdr_pre_alc_ptn_nm) doHdr_pre_alc_ptn_nm_NE(info);
		else if (ne == Hdr_dpt_alc_typ) doHdr_dpt_alc_typ_NE(info);
		else if (ne == Hdr_loc_alc_typ) doHdr_loc_alc_typ_NE(info);
		else if (ne == Hdr_oper_alc_typ) doHdr_oper_alc_typ_NE(info);
		else if (ne == Hdr_bp_alc_typ) doHdr_bp_alc_typ_NE(info);
		else if (ne == Hdr_ctg_alc_typ) doHdr_ctg_alc_typ_NE(info);
		else if (ne == Hdr_itm_alc_typ) doHdr_itm_alc_typ_NE(info);
		else if (ne == Hdr_lot_alc_typ) doHdr_lot_alc_typ_NE(info);
		else if (ne == Hdr_sublot_alc_typ) doHdr_sublot_alc_typ_NE(info);
		else if (ne == Hdr_sno1_alc_typ) doHdr_sno1_alc_typ_NE(info);
		else if (ne == Hdr_sno2_alc_typ) doHdr_sno2_alc_typ_NE(info);
		else if (ne == Hdr_sno3_alc_typ) doHdr_sno3_alc_typ_NE(info);
		else if (ne == Hdr_sno4_alc_typ) doHdr_sno4_alc_typ_NE(info);
		else if (ne == Hdr_inst_alc_typ) doHdr_inst_alc_typ_NE(info);
		else if (ne == Hdr_iv_alc_typ) doHdr_iv_alc_typ_NE(info);
		else if (ne == Hdr_po_alc_typ) doHdr_po_alc_typ_NE(info);
		else if (ne == Hdr_slo_alc_typ) doHdr_slo_alc_typ_NE(info);
		else if (ne == Hdr_alc_ac_alc_typ) doHdr_alc_ac_alc_typ_NE(info);
		else if (ne == Hdr_wg_alc_typ) doHdr_wg_alc_typ_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_sa_typ) doRslt_sa_typ_NE(info);
		else if (ne == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_NE(info);
		else if (ne == columnRslt_ym) doRslt_ym_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_pre_alc_rate_cd) doRslt_pre_alc_rate_cd_NE(info);
		else if (ne == columnRslt_dpt_cd) doRslt_dpt_cd_NE(info);
		else if (ne == columnRslt_dpt_nm) doRslt_dpt_nm_NE(info);
		else if (ne == columnRslt_loc_cd) doRslt_loc_cd_NE(info);
		else if (ne == columnRslt_loc_nm) doRslt_loc_nm_NE(info);
		else if (ne == columnRslt_oper_cd) doRslt_oper_cd_NE(info);
		else if (ne == columnRslt_oper_nm) doRslt_oper_nm_NE(info);
		else if (ne == columnRslt_bp_cd) doRslt_bp_cd_NE(info);
		else if (ne == columnRslt_bp_nm) doRslt_bp_nm_NE(info);
		else if (ne == columnRslt_ctg_cd) doRslt_ctg_cd_NE(info);
		else if (ne == columnRslt_ctg_nm) doRslt_ctg_nm_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
		else if (ne == columnRslt_sno1) doRslt_sno1_NE(info);
		else if (ne == columnRslt_sno2) doRslt_sno2_NE(info);
		else if (ne == columnRslt_sno3) doRslt_sno3_NE(info);
		else if (ne == columnRslt_sno4) doRslt_sno4_NE(info);
		else if (ne == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_NE(info);
		else if (ne == columnRslt_iv_no) doRslt_iv_no_NE(info);
		else if (ne == columnRslt_po_no) doRslt_po_no_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_alc_ac_cd) doRslt_alc_ac_cd_NE(info);
		else if (ne == columnRslt_alc_ac_nm) doRslt_alc_ac_nm_NE(info);
		else if (ne == columnRslt_trd_wg_cd) doRslt_trd_wg_cd_NE(info);
		else if (ne == columnRslt_trd_wg_nm) doRslt_trd_wg_nm_NE(info);
		else if (ne == columnRslt_pre_alc_rate) doRslt_pre_alc_rate_NE(info);
		else if (ne == columnRslt_adj_flg) doRslt_adj_flg_NE(info);
		else if (ne == columnRslt_rmrks) doRslt_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sa_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sa_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sa_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sa_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_nm_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[sa_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sa_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sa_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sa_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ym_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_alc_rate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_alc_rate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_alc_rate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_alc_rate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_alc_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_alc_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_alc_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_alc_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dpt_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dpt_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[loc_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_loc_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[oper_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_oper_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bp_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ctg_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ctg_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sublot_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sublot_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno1_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno1_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno2_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno2_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno3_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno3_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno4_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno4_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inst_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inst_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[alc_ac_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_alc_ac_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_alc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_alc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sa_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sa_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adj_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adj_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_sa_typ) doCnd_sa_typ_NX(info);
		else if (nx == Cnd_sa_typ_nm) doCnd_sa_typ_nm_NX(info);
		else if (nx == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NX(info);
		else if (nx == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NX(info);
		else if (nx == Cnd_ym) doCnd_ym_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_pre_alc_rate_cd) doCnd_pre_alc_rate_cd_NX(info);
		else if (nx == Cnd_pre_alc_rate_nm) doCnd_pre_alc_rate_nm_NX(info);
		else if (nx == Cnd_pre_alc_ptn_cd) doCnd_pre_alc_ptn_cd_NX(info);
		else if (nx == Cnd_pre_alc_ptn_nm) doCnd_pre_alc_ptn_nm_NX(info);
		else if (nx == Hdr_sa_typ) doHdr_sa_typ_NX(info);
		else if (nx == Hdr_sa_typ_nm) doHdr_sa_typ_nm_NX(info);
		else if (nx == Hdr_calc_ctg_cd) doHdr_calc_ctg_cd_NX(info);
		else if (nx == Hdr_calc_ctg_nm) doHdr_calc_ctg_nm_NX(info);
		else if (nx == Hdr_ym) doHdr_ym_NX(info);
		else if (nx == Hdr_wg_cd) doHdr_wg_cd_NX(info);
		else if (nx == Hdr_wg_nm) doHdr_wg_nm_NX(info);
		else if (nx == Hdr_pre_alc_rate_cd) doHdr_pre_alc_rate_cd_NX(info);
		else if (nx == Hdr_pre_alc_rate_nm) doHdr_pre_alc_rate_nm_NX(info);
		else if (nx == Hdr_pre_alc_ptn_cd) doHdr_pre_alc_ptn_cd_NX(info);
		else if (nx == Hdr_pre_alc_ptn_nm) doHdr_pre_alc_ptn_nm_NX(info);
		else if (nx == Hdr_dpt_alc_typ) doHdr_dpt_alc_typ_NX(info);
		else if (nx == Hdr_loc_alc_typ) doHdr_loc_alc_typ_NX(info);
		else if (nx == Hdr_oper_alc_typ) doHdr_oper_alc_typ_NX(info);
		else if (nx == Hdr_bp_alc_typ) doHdr_bp_alc_typ_NX(info);
		else if (nx == Hdr_ctg_alc_typ) doHdr_ctg_alc_typ_NX(info);
		else if (nx == Hdr_itm_alc_typ) doHdr_itm_alc_typ_NX(info);
		else if (nx == Hdr_lot_alc_typ) doHdr_lot_alc_typ_NX(info);
		else if (nx == Hdr_sublot_alc_typ) doHdr_sublot_alc_typ_NX(info);
		else if (nx == Hdr_sno1_alc_typ) doHdr_sno1_alc_typ_NX(info);
		else if (nx == Hdr_sno2_alc_typ) doHdr_sno2_alc_typ_NX(info);
		else if (nx == Hdr_sno3_alc_typ) doHdr_sno3_alc_typ_NX(info);
		else if (nx == Hdr_sno4_alc_typ) doHdr_sno4_alc_typ_NX(info);
		else if (nx == Hdr_inst_alc_typ) doHdr_inst_alc_typ_NX(info);
		else if (nx == Hdr_iv_alc_typ) doHdr_iv_alc_typ_NX(info);
		else if (nx == Hdr_po_alc_typ) doHdr_po_alc_typ_NX(info);
		else if (nx == Hdr_slo_alc_typ) doHdr_slo_alc_typ_NX(info);
		else if (nx == Hdr_alc_ac_alc_typ) doHdr_alc_ac_alc_typ_NX(info);
		else if (nx == Hdr_wg_alc_typ) doHdr_wg_alc_typ_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_sa_typ) doRslt_sa_typ_NX(info);
		else if (nx == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_NX(info);
		else if (nx == columnRslt_ym) doRslt_ym_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_pre_alc_rate_cd) doRslt_pre_alc_rate_cd_NX(info);
		else if (nx == columnRslt_dpt_cd) doRslt_dpt_cd_NX(info);
		else if (nx == columnRslt_dpt_nm) doRslt_dpt_nm_NX(info);
		else if (nx == columnRslt_loc_cd) doRslt_loc_cd_NX(info);
		else if (nx == columnRslt_loc_nm) doRslt_loc_nm_NX(info);
		else if (nx == columnRslt_oper_cd) doRslt_oper_cd_NX(info);
		else if (nx == columnRslt_oper_nm) doRslt_oper_nm_NX(info);
		else if (nx == columnRslt_bp_cd) doRslt_bp_cd_NX(info);
		else if (nx == columnRslt_bp_nm) doRslt_bp_nm_NX(info);
		else if (nx == columnRslt_ctg_cd) doRslt_ctg_cd_NX(info);
		else if (nx == columnRslt_ctg_nm) doRslt_ctg_nm_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
		else if (nx == columnRslt_sno1) doRslt_sno1_NX(info);
		else if (nx == columnRslt_sno2) doRslt_sno2_NX(info);
		else if (nx == columnRslt_sno3) doRslt_sno3_NX(info);
		else if (nx == columnRslt_sno4) doRslt_sno4_NX(info);
		else if (nx == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_NX(info);
		else if (nx == columnRslt_iv_no) doRslt_iv_no_NX(info);
		else if (nx == columnRslt_po_no) doRslt_po_no_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_alc_ac_cd) doRslt_alc_ac_cd_NX(info);
		else if (nx == columnRslt_alc_ac_nm) doRslt_alc_ac_nm_NX(info);
		else if (nx == columnRslt_trd_wg_cd) doRslt_trd_wg_cd_NX(info);
		else if (nx == columnRslt_trd_wg_nm) doRslt_trd_wg_nm_NX(info);
		else if (nx == columnRslt_pre_alc_rate) doRslt_pre_alc_rate_NX(info);
		else if (nx == columnRslt_adj_flg) doRslt_adj_flg_NX(info);
		else if (nx == columnRslt_rmrks) doRslt_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sa_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sa_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sa_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sa_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_nm_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[sa_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sa_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sa_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sa_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ym_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_alc_rate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_alc_rate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_alc_rate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_alc_rate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_alc_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_alc_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_alc_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_alc_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dpt_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dpt_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[loc_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_loc_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[oper_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_oper_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bp_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ctg_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ctg_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sublot_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sublot_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno1_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno1_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno2_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno2_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno3_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno3_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno4_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno4_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inst_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inst_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[alc_ac_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_alc_ac_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_alc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_alc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sa_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sa_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[adj_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_adj_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_sa_typ) doCnd_sa_typ_LC(info);
		else if (lc == Cnd_sa_typ_nm) doCnd_sa_typ_nm_LC(info);
		else if (lc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_LC(info);
		else if (lc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_LC(info);
		else if (lc == Cnd_ym) doCnd_ym_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_pre_alc_rate_cd) doCnd_pre_alc_rate_cd_LC(info);
		else if (lc == Cnd_pre_alc_rate_nm) doCnd_pre_alc_rate_nm_LC(info);
		else if (lc == Cnd_pre_alc_ptn_cd) doCnd_pre_alc_ptn_cd_LC(info);
		else if (lc == Cnd_pre_alc_ptn_nm) doCnd_pre_alc_ptn_nm_LC(info);
		else if (lc == Hdr_sa_typ) doHdr_sa_typ_LC(info);
		else if (lc == Hdr_sa_typ_nm) doHdr_sa_typ_nm_LC(info);
		else if (lc == Hdr_calc_ctg_cd) doHdr_calc_ctg_cd_LC(info);
		else if (lc == Hdr_calc_ctg_nm) doHdr_calc_ctg_nm_LC(info);
		else if (lc == Hdr_ym) doHdr_ym_LC(info);
		else if (lc == Hdr_wg_cd) doHdr_wg_cd_LC(info);
		else if (lc == Hdr_wg_nm) doHdr_wg_nm_LC(info);
		else if (lc == Hdr_pre_alc_rate_cd) doHdr_pre_alc_rate_cd_LC(info);
		else if (lc == Hdr_pre_alc_rate_nm) doHdr_pre_alc_rate_nm_LC(info);
		else if (lc == Hdr_pre_alc_ptn_cd) doHdr_pre_alc_ptn_cd_LC(info);
		else if (lc == Hdr_pre_alc_ptn_nm) doHdr_pre_alc_ptn_nm_LC(info);
		else if (lc == Hdr_dpt_alc_typ) doHdr_dpt_alc_typ_LC(info);
		else if (lc == Hdr_loc_alc_typ) doHdr_loc_alc_typ_LC(info);
		else if (lc == Hdr_oper_alc_typ) doHdr_oper_alc_typ_LC(info);
		else if (lc == Hdr_bp_alc_typ) doHdr_bp_alc_typ_LC(info);
		else if (lc == Hdr_ctg_alc_typ) doHdr_ctg_alc_typ_LC(info);
		else if (lc == Hdr_itm_alc_typ) doHdr_itm_alc_typ_LC(info);
		else if (lc == Hdr_lot_alc_typ) doHdr_lot_alc_typ_LC(info);
		else if (lc == Hdr_sublot_alc_typ) doHdr_sublot_alc_typ_LC(info);
		else if (lc == Hdr_sno1_alc_typ) doHdr_sno1_alc_typ_LC(info);
		else if (lc == Hdr_sno2_alc_typ) doHdr_sno2_alc_typ_LC(info);
		else if (lc == Hdr_sno3_alc_typ) doHdr_sno3_alc_typ_LC(info);
		else if (lc == Hdr_sno4_alc_typ) doHdr_sno4_alc_typ_LC(info);
		else if (lc == Hdr_inst_alc_typ) doHdr_inst_alc_typ_LC(info);
		else if (lc == Hdr_iv_alc_typ) doHdr_iv_alc_typ_LC(info);
		else if (lc == Hdr_po_alc_typ) doHdr_po_alc_typ_LC(info);
		else if (lc == Hdr_slo_alc_typ) doHdr_slo_alc_typ_LC(info);
		else if (lc == Hdr_alc_ac_alc_typ) doHdr_alc_ac_alc_typ_LC(info);
		else if (lc == Hdr_wg_alc_typ) doHdr_wg_alc_typ_LC(info);
		else if (lc == columnRslt_sa_typ) doRslt_sa_typ_LC(info);
		else if (lc == columnRslt_calc_ctg_cd) doRslt_calc_ctg_cd_LC(info);
		else if (lc == columnRslt_ym) doRslt_ym_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_pre_alc_rate_cd) doRslt_pre_alc_rate_cd_LC(info);
		else if (lc == columnRslt_dpt_cd) doRslt_dpt_cd_LC(info);
		else if (lc == columnRslt_dpt_nm) doRslt_dpt_nm_LC(info);
		else if (lc == columnRslt_loc_cd) doRslt_loc_cd_LC(info);
		else if (lc == columnRslt_loc_nm) doRslt_loc_nm_LC(info);
		else if (lc == columnRslt_oper_cd) doRslt_oper_cd_LC(info);
		else if (lc == columnRslt_oper_nm) doRslt_oper_nm_LC(info);
		else if (lc == columnRslt_bp_cd) doRslt_bp_cd_LC(info);
		else if (lc == columnRslt_bp_nm) doRslt_bp_nm_LC(info);
		else if (lc == columnRslt_ctg_cd) doRslt_ctg_cd_LC(info);
		else if (lc == columnRslt_ctg_nm) doRslt_ctg_nm_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
		else if (lc == columnRslt_sno1) doRslt_sno1_LC(info);
		else if (lc == columnRslt_sno2) doRslt_sno2_LC(info);
		else if (lc == columnRslt_sno3) doRslt_sno3_LC(info);
		else if (lc == columnRslt_sno4) doRslt_sno4_LC(info);
		else if (lc == columnRslt_itm_mfg_inst_no) doRslt_itm_mfg_inst_no_LC(info);
		else if (lc == columnRslt_iv_no) doRslt_iv_no_LC(info);
		else if (lc == columnRslt_po_no) doRslt_po_no_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_alc_ac_cd) doRslt_alc_ac_cd_LC(info);
		else if (lc == columnRslt_alc_ac_nm) doRslt_alc_ac_nm_LC(info);
		else if (lc == columnRslt_trd_wg_cd) doRslt_trd_wg_cd_LC(info);
		else if (lc == columnRslt_trd_wg_nm) doRslt_trd_wg_nm_LC(info);
		else if (lc == columnRslt_pre_alc_rate) doRslt_pre_alc_rate_LC(info);
		else if (lc == columnRslt_rmrks) doRslt_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
	}

	/**
	 * [Cnd]パネルの[sa_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sa_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sa_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sa_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ym_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pre_alc_rate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pre_alc_rate_nm_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[sa_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sa_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sa_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sa_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ym_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_alc_rate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_alc_rate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_alc_rate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_alc_rate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_alc_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_alc_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pre_alc_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pre_alc_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dpt_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dpt_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[loc_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_loc_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[oper_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_oper_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bp_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ctg_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ctg_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[itm_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_itm_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sublot_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sublot_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno1_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno1_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno2_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno2_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno3_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno3_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno4_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno4_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inst_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inst_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[po_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_po_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[slo_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_slo_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[alc_ac_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_alc_ac_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_alc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_alc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sa_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sa_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alc_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alc_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pre_alc_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pre_alc_rate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_sa_typ]の作成メソッド
	 */
	public MCList getCnd_sa_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSaTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pre_alc_rate_cd]の作成メソッド
	 */
	public MCList getCnd_pre_alc_rate_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getPreAlcRateWithPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_sa_typ]の作成メソッド
	 */
	public MCList getHdr_sa_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSaTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_calc_ctg_cd]の作成メソッド
	 */
	public MCList getHdr_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_wg_cd]の作成メソッド
	 */
	public MCList getHdr_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_pre_alc_rate_cd]の作成メソッド
	 */
	public MCList getHdr_pre_alc_rate_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getPreAlcRateWithPtnNotInPreRateMly(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_pre_alc_ptn_cd]の作成メソッド
	 */
	public MCList getHdr_pre_alc_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPreAlcPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_loc_cd]の作成メソッド
	 */
	public MCList getRslt_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_oper_cd]の作成メソッド
	 */
	public MCList getRslt_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_bp_cd]の作成メソッド
	 */
	public MCList getRslt_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_ctg_cd]の作成メソッド
	 */
	public MCList getRslt_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_alc_ac_cd]の作成メソッド
	 */
	public MCList getRslt_alc_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_trd_wg_cd]の作成メソッド
	 */
	public MCList getRslt_trd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBGL0120.Srch01")) {
			return new MG_MGBGL0120_Srch01Bridge();
		}
		if (id.equals("MG.MGBGL0120.Ins01")) {
			return new MG_MGBGL0120_Ins01Bridge();
		}
		if (id.equals("MG.MGBGL0120.Upd01")) {
			return new MG_MGBGL0120_Upd01Bridge();
		}
		if (id.equals("MG.MGBGL0120.Del01")) {
			return new MG_MGBGL0120_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBGL0120_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0120_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0120_Srch01;

		/** コンストラクタ */
		protected MG_MGBGL0120_Srch01Bridge() {
			p_MG_MGBGL0120_Srch01 = new MCParam(PDef.MG_MGBGL0120_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0120_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBG.MGBGP0120.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0120.RsltR.class));

			p_MG_MGBGL0120_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0120_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0120_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0120_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0120_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBG.MGBGP0120.CndR up0() {
			return (mcframe.clientMGBG.MGBGP0120.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBG.MGBGP0120.RsltR> down0() {
			return (MCList<mcframe.clientMGBG.MGBGP0120.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBGL0120_Srch01.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0120.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBGL0120_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBG.MGBGP0120.RsltR>)p_MG_MGBGL0120_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MG_MGBGL0120_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0120_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0120_Ins01;

		/** コンストラクタ */
		protected MG_MGBGL0120_Ins01Bridge() {
			p_MG_MGBGL0120_Ins01 = new MCParam(PDef.MG_MGBGL0120_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0120_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBG.MGBGP0120.RsltR.class));
			// Down

			p_MG_MGBGL0120_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0120_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0120_Ins01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0120_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0120_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBG.MGBGP0120.RsltR> up0() {
			return (MCList<mcframe.clientMGBG.MGBGP0120.RsltR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBGL0120_Ins01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MG_MGBGL0120_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0120_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0120_Upd01;

		/** コンストラクタ */
		protected MG_MGBGL0120_Upd01Bridge() {
			p_MG_MGBGL0120_Upd01 = new MCParam(PDef.MG_MGBGL0120_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0120_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBG.MGBGP0120.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0120.RsltR.class));

			p_MG_MGBGL0120_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0120_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0120_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0120_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0120_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBG.MGBGP0120.RsltR> up0() {
			return (MCList<mcframe.clientMGBG.MGBGP0120.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBG.MGBGP0120.RsltR> down0() {
			return (MCList<mcframe.clientMGBG.MGBGP0120.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBGL0120_Upd01.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0120.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBGL0120_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBG.MGBGP0120.RsltR>)p_MG_MGBGL0120_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MG_MGBGL0120_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBGL0120_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBGL0120_Del01;

		/** コンストラクタ */
		protected MG_MGBGL0120_Del01Bridge() {
			p_MG_MGBGL0120_Del01 = new MCParam(PDef.MG_MGBGL0120_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBGL0120_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBG.MGBGP0120.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0120.RsltR.class));

			p_MG_MGBGL0120_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBGL0120_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBGL0120_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBGL0120_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBGL0120_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBG.MGBGP0120.RsltR> up0() {
			return (MCList<mcframe.clientMGBG.MGBGP0120.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMGBG.MGBGP0120.RsltR> down0() {
			return (MCList<mcframe.clientMGBG.MGBGP0120.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBGL0120_Del01.addDownBlock(MCList.create(mcframe.clientMGBG.MGBGP0120.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBGL0120_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBG.MGBGP0120.RsltR>)p_MG_MGBGL0120_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}