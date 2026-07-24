package mcframe.clientMGBD.MGBDP0520;

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
import mcframe.clientMGBD.MGBDP0520.MGBDP_BomReg_MC.MG_MGBDL0520_Srch01Caller;
import mcframe.clientMGBD.MGBDP0520.MGBDP_BomReg_MC.MG_MGBDL0520_Upd01Caller;
import mcframe.clientMGBD.MGBDP0520.MGBDP_BomReg_MC.MG_MGBDL0520_Del01Caller;

/**
 * 画面"MGBDP_BomReg"パネルクラスです。<p>
 *
 * 原価ＢＯＭ情報を登録します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDP_BomReg_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MGBD";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MGBDP0520";

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
	// [RegTarget]ブロック関連のField定義
	public MCPanel RegTargetPanel = null;
	public MCTitledBorder RegTargetTitledBorder = null;
	// [RegTarget]ブロックの項目のField定義
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
	/**
	 * Common 共通.<p>
	 *
	 */
	public MCCheckBox Cnd_cmn_flg = null;
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public MCCheckBox Cnd_wg_flg = null;
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
	public mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H Cnd_term_p_PPanel;
	public MCDateComboBox Cnd_term;	// [Cnd]の[term_p.term]を[Cnd_term]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_par_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_par_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_par_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_par_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_par_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_par_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_par_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_bom_ptn_Label = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCTextComboBox Cnd_bom_ptn = null;
	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public MCLabel Cnd_non_calc_flg_lab = null;
	/**
	 * Not to calculate. Off 計算対象外.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_off_non_calc_flg = null;
	/**
	 * Not to calculate. On 計算対象外.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_on_non_calc_flg = null;
	/**
	 * Search (Common) 検索する（共通）.<p>
	 *
	 */
	public MCButton Cnd_srch_cmn = null;
	/**
	 * Search (WG) 検索する（ワーキンググループ）.<p>
	 *
	 */
	public MCButton Cnd_srch_wg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	public MCTitledBorder HdrTitledBorder = null;
	// [Hdr]ブロックの項目のField定義
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
	public mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H Hdr_term_p_PPanel;
	public MCDateComboBox Hdr_term;	// [Hdr]の[term_p.term]を[Hdr_term]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Hdr_itm_p_PPanel;
	public MCTextField Hdr_par_itm_cd;	// [Hdr]の[itm_p.itm_cd]を[Hdr_par_itm_cd]としてエイリアス定義。
	public MCTextComboBox Hdr_par_itm_sub1;	// [Hdr]の[itm_p.itm_sub1]を[Hdr_par_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Hdr_par_itm_sub2;	// [Hdr]の[itm_p.itm_sub2]を[Hdr_par_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Hdr_par_itm_sub3;	// [Hdr]の[itm_p.itm_sub3]を[Hdr_par_itm_sub3]としてエイリアス定義。
	public MCTextField Hdr_par_itm_nm;	// [Hdr]の[itm_p.itm_nm]を[Hdr_par_itm_nm]としてエイリアス定義。
	/**
	 * Parent unit cd. 親単位ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_par_unit_cd = null;
	/**
	 * Parent unit name 親単位名.<p>
	 *
	 */
	public MCTextField Hdr_par_unit_nm = null;
	/**
	 * Parent number of decimal places 親小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_par_dec_place = null;
	/**
	 * Parent cost base qty. 親原価基準数.<p>
	 *
	 */
	public MCNumberField Hdr_par_cost_std_qty = null;
	public MCLabel Hdr_bom_ptn_Label = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCTextField Hdr_bom_ptn = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0520.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
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
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_seq = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_disp_seq = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_chd_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_chd_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_chd_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_chd_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_chd_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_chd_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_chd_itm_nm]としてエイリアス定義。
	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_itm_typ = null;
	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_itm_typ_nm = null;
	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_itm_typ_d_cd = null;
	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_itm_typ_d_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_par_rqmt_qty_p_PPanel;
	public MCColumnConfig columnRslt_par_rqmt_qty;// [Rslt]の[par_rqmt_qty_p.qty]を[columnRslt_par_rqmt_qty]としてエイリアス定義。
	/**
	 * Parent unit cd. 親単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_unit_cd = null;
	/**
	 * Parent unit name 親単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_chd_rqmt_qty_p_PPanel;
	public MCColumnConfig columnRslt_chd_rqmt_qty;// [Rslt]の[chd_rqmt_qty_p.qty]を[columnRslt_chd_rqmt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_chd_base_qty_p_PPanel;
	public MCColumnConfig columnRslt_chd_base_qty;// [Rslt]の[chd_base_qty_p.qty]を[columnRslt_chd_base_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_fxd_chd_rqmt_qty_p_PPanel;
	public MCColumnConfig columnRslt_fxd_chd_rqmt_qty;// [Rslt]の[fxd_chd_rqmt_qty_p.qty]を[columnRslt_fxd_chd_rqmt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_chd_min_qty_p_PPanel;
	public MCColumnConfig columnRslt_chd_min_qty;// [Rslt]の[chd_min_qty_p.qty]を[columnRslt_chd_min_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_chd_batch_qty_p_PPanel;
	public MCColumnConfig columnRslt_chd_batch_qty;// [Rslt]の[chd_batch_qty_p.qty]を[columnRslt_chd_batch_qty]としてエイリアス定義。
	/**
	 * Child unit cd. 子単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_unit_cd = null;
	/**
	 * Child unit name 子単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_unit_nm = null;
	/**
	 * Child number of decimal places 子小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_chd_dec_place = null;
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_grp_cd = null;
	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alt_itm_ratio = null;
	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_expns_cd = null;
	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_expns_nm = null;
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
	/**
	 * Not to calculate 計算対象外.<p>
	 *
	 */
	public MCColumnConfig columnRslt_non_calc_flg = null;
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
	 * Cost item info. entry 原価品目情報登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBDP0500 = null;
	/**
	 * Cost item details entry 原価品目詳細登録.<p>
	 *
	 */
	public MCButton Btn_open_MGBDP0510 = null;
	/**
	 * Cost BOM (Explosion) 原価ＢＯＭ一覧照会（展開）.<p>
	 *
	 */
	public MCButton Btn_open_MGBDP0540 = null;
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
	public MCButton Btn_ins_cmn = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_ins_wg = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_cmn = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_wg = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del_cmn = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del_wg = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [SRCH_UPD]モードを表す定数 */
	public static final String SRCH_UPD = "SRCH_UPD";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [SRCH_REF]モードを表す定数 */
	public static final String SRCH_REF = "SRCH_REF";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [SRCH_DEL]モードを表す定数 */
	public static final String SRCH_DEL = "SRCH_DEL";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INS, SRCH_UPD, UPD, SRCH_REF, REF, SRCH_DEL, DEL, FIX_I};
	
	/** [MG_MGBDL0520_Srch01]のCallerの作成 */
	protected MGBDP_BomReg_MC.MG_MGBDL0520_Srch01Caller createMG_MGBDL0520_Srch01() {
		MGBDP_BomReg_MC.MG_MGBDL0520_Srch01Caller<MGBDP_BomReg, MG_MGBDL0520_Srch01Bridge>
		caller = ((MGBDP_BomReg_MC)this).new MG_MGBDL0520_Srch01Caller<MGBDP_BomReg, MG_MGBDL0520_Srch01Bridge>(
					(MGBDP_BomReg)this, new MG_MGBDL0520_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBDL0520_Srch01]の呼び出し */
	protected void callMG_MGBDL0520_Srch01() {
		MCCaller caller = createMG_MGBDL0520_Srch01();
		caller.exec();
	}
	/** [MG_MGBDL0520_Upd01]のCallerの作成 */
	protected MGBDP_BomReg_MC.MG_MGBDL0520_Upd01Caller createMG_MGBDL0520_Upd01() {
		MGBDP_BomReg_MC.MG_MGBDL0520_Upd01Caller<MGBDP_BomReg, MG_MGBDL0520_Upd01Bridge>
		caller = ((MGBDP_BomReg_MC)this).new MG_MGBDL0520_Upd01Caller<MGBDP_BomReg, MG_MGBDL0520_Upd01Bridge>(
					(MGBDP_BomReg)this, new MG_MGBDL0520_Upd01Bridge());
		return caller;
	}
	/** [MG_MGBDL0520_Upd01]の呼び出し */
	protected void callMG_MGBDL0520_Upd01() {
		MCCaller caller = createMG_MGBDL0520_Upd01();
		caller.exec();
	}
	/** [MG_MGBDL0520_Del01]のCallerの作成 */
	protected MGBDP_BomReg_MC.MG_MGBDL0520_Del01Caller createMG_MGBDL0520_Del01() {
		MGBDP_BomReg_MC.MG_MGBDL0520_Del01Caller<MGBDP_BomReg, MG_MGBDL0520_Del01Bridge>
		caller = ((MGBDP_BomReg_MC)this).new MG_MGBDL0520_Del01Caller<MGBDP_BomReg, MG_MGBDL0520_Del01Bridge>(
					(MGBDP_BomReg)this, new MG_MGBDL0520_Del01Bridge());
		return caller;
	}
	/** [MG_MGBDL0520_Del01]の呼び出し */
	protected void callMG_MGBDL0520_Del01() {
		MCCaller caller = createMG_MGBDL0520_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0520.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0520.HdrR aHdrR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0520.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBD.MGBDP0520.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0520.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0520.CndR createCndR() {
		return mcframe.clientMGBD.MGBDP0520.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMGBD.MGBDP0520.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMGBD.MGBDP0520.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMGBD.MGBDP0520.HdrR createHdrR() {
		return mcframe.clientMGBD.MGBDP0520.HdrR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMGBD.MGBDP0520.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0520.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMGBD.MGBDP0520.RsltR createRsltR() {
		return mcframe.clientMGBD.MGBDP0520.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0520.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0520.RsltR.class);
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
		ret.add(RegTargetPanel);
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
	public MGBDP_BomReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBDP_BomReg_MC_A(String name) {
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
		MGBDP_BomReg_MC.jbCreateScreenOpe((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbCreateRegTarget((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbCreateTop((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbCreateFold((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbCreateCnd((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbCreateCtrl((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbCreateHdr((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbCreateRslt((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbCreateBtn((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbCreateEastBtn((MGBDP_BomReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBDP_BomReg p) {
	}

	/**
	 * [RegTarget]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRegTarget(MGBDP_BomReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBDP_BomReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBDP_BomReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBDP_BomReg p) {
		p.Cnd_term_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getCndR().term_p());
		p.Cnd_term_p_PPanel.setName("Cnd.term_p");
		p.Cnd_term = p.Cnd_term_p_PPanel.Term_term;
		p.Cnd_term.addAliasName("Cnd.term", p);
		p.Cnd_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().itm_p());
		p.Cnd_itm_p_PPanel.setName("Cnd.itm_p");
		p.Cnd_par_itm_cd = p.Cnd_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_par_itm_cd.addAliasName("Cnd.par_itm_cd", p);
		p.Cnd_par_itm_sub1 = p.Cnd_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_par_itm_sub1.addAliasName("Cnd.par_itm_sub1", p);
		p.Cnd_par_itm_sub2 = p.Cnd_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_par_itm_sub2.addAliasName("Cnd.par_itm_sub2", p);
		p.Cnd_par_itm_sub3 = p.Cnd_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_par_itm_sub3.addAliasName("Cnd.par_itm_sub3", p);
		p.Cnd_par_itm_nm = p.Cnd_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_par_itm_nm.addAliasName("Cnd.par_itm_nm", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBDP_BomReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MGBDP_BomReg p) {
		p.Hdr_term_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getHdrR().term_p());
		p.Hdr_term_p_PPanel.setName("Hdr.term_p");
		p.Hdr_term = p.Hdr_term_p_PPanel.Term_term;
		p.Hdr_term.addAliasName("Hdr.term", p);
		p.Hdr_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getHdrR().itm_p());
		p.Hdr_itm_p_PPanel.setName("Hdr.itm_p");
		p.Hdr_par_itm_cd = p.Hdr_itm_p_PPanel.Itm_itm_cd;
		p.Hdr_par_itm_cd.addAliasName("Hdr.par_itm_cd", p);
		p.Hdr_par_itm_sub1 = p.Hdr_itm_p_PPanel.Itm_itm_sub1;
		p.Hdr_par_itm_sub1.addAliasName("Hdr.par_itm_sub1", p);
		p.Hdr_par_itm_sub2 = p.Hdr_itm_p_PPanel.Itm_itm_sub2;
		p.Hdr_par_itm_sub2.addAliasName("Hdr.par_itm_sub2", p);
		p.Hdr_par_itm_sub3 = p.Hdr_itm_p_PPanel.Itm_itm_sub3;
		p.Hdr_par_itm_sub3.addAliasName("Hdr.par_itm_sub3", p);
		p.Hdr_par_itm_nm = p.Hdr_itm_p_PPanel.Itm_itm_nm;
		p.Hdr_par_itm_nm.addAliasName("Hdr.par_itm_nm", p);
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MGBDP_BomReg p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBD.MGBDP0520.RsltR.$itm_p);
		p.Rslt_itm_p_PPanel.setName("Rslt.itm_p");
		p.columnRslt_chd_itm_cd = p.Rslt_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt_chd_itm_cd.addAliasName("Rslt.chd_itm_cd", p);
		p.columnRslt_chd_itm_sub1 = p.Rslt_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_chd_itm_sub1.addAliasName("Rslt.chd_itm_sub1", p);
		p.columnRslt_chd_itm_sub2 = p.Rslt_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_chd_itm_sub2.addAliasName("Rslt.chd_itm_sub2", p);
		p.columnRslt_chd_itm_sub3 = p.Rslt_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_chd_itm_sub3.addAliasName("Rslt.chd_itm_sub3", p);
		p.columnRslt_chd_itm_nm = p.Rslt_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt_chd_itm_nm.addAliasName("Rslt.chd_itm_nm", p);
		p.Rslt_par_rqmt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0520.RsltR.$par_rqmt_qty_p);
		p.Rslt_par_rqmt_qty_p_PPanel.setName("Rslt.par_rqmt_qty_p");
		p.columnRslt_par_rqmt_qty = p.Rslt_par_rqmt_qty_p_PPanel.columnQty_qty;
		p.columnRslt_par_rqmt_qty.addAliasName("Rslt.par_rqmt_qty", p);
		p.Rslt_chd_rqmt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0520.RsltR.$chd_rqmt_qty_p);
		p.Rslt_chd_rqmt_qty_p_PPanel.setName("Rslt.chd_rqmt_qty_p");
		p.columnRslt_chd_rqmt_qty = p.Rslt_chd_rqmt_qty_p_PPanel.columnQty_qty;
		p.columnRslt_chd_rqmt_qty.addAliasName("Rslt.chd_rqmt_qty", p);
		p.Rslt_chd_base_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0520.RsltR.$chd_base_qty_p);
		p.Rslt_chd_base_qty_p_PPanel.setName("Rslt.chd_base_qty_p");
		p.columnRslt_chd_base_qty = p.Rslt_chd_base_qty_p_PPanel.columnQty_qty;
		p.columnRslt_chd_base_qty.addAliasName("Rslt.chd_base_qty", p);
		p.Rslt_fxd_chd_rqmt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0520.RsltR.$fxd_chd_rqmt_qty_p);
		p.Rslt_fxd_chd_rqmt_qty_p_PPanel.setName("Rslt.fxd_chd_rqmt_qty_p");
		p.columnRslt_fxd_chd_rqmt_qty = p.Rslt_fxd_chd_rqmt_qty_p_PPanel.columnQty_qty;
		p.columnRslt_fxd_chd_rqmt_qty.addAliasName("Rslt.fxd_chd_rqmt_qty", p);
		p.Rslt_chd_min_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0520.RsltR.$chd_min_qty_p);
		p.Rslt_chd_min_qty_p_PPanel.setName("Rslt.chd_min_qty_p");
		p.columnRslt_chd_min_qty = p.Rslt_chd_min_qty_p_PPanel.columnQty_qty;
		p.columnRslt_chd_min_qty.addAliasName("Rslt.chd_min_qty", p);
		p.Rslt_chd_batch_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMGBD.MGBDP0520.RsltR.$chd_batch_qty_p);
		p.Rslt_chd_batch_qty_p_PPanel.setName("Rslt.chd_batch_qty_p");
		p.columnRslt_chd_batch_qty = p.Rslt_chd_batch_qty_p_PPanel.columnQty_qty;
		p.columnRslt_chd_batch_qty.addAliasName("Rslt.chd_batch_qty", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMGBD.MGBDP0520.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBDP_BomReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MGBDP_BomReg p) {
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
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_cd_p = createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_itm_p_PPanel.Itm_itm_cd, "par_itm_cd", "par_itm_nm","par_itm_sub1","par_itm_sub2","par_itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub1_p = createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub1, "par_itm_sub1", "par_itm_nm","par_itm_sub2","par_itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub2_p = createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub2, "par_itm_sub2", "par_itm_nm","par_itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub3_p = createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub3, "par_itm_sub3", "par_itm_nm");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [Cnd_bom_ptn_ListPutter]の定義 */
	private MCListPutter Cnd_bom_ptn_p = null;

	/**
	 * [Cnd_bom_ptn_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bom_ptn_ListPutter() {
		if (Cnd_bom_ptn_p == null) {
			Cnd_bom_ptn_p = createCnd_bom_ptn_ListPutter(Cnd_bom_ptn, "bom_ptn");

		}
		return Cnd_bom_ptn_p;
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
	
	
	/** [Hdr_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Hdr_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Hdr_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Hdr_itm_p_PPanel_Itm_itm_cd_p == null) {
			Hdr_itm_p_PPanel_Itm_itm_cd_p = createHdr_itm_p_PPanel_Itm_itm_cd_ListPutter(Hdr_itm_p_PPanel.Itm_itm_cd, "par_itm_cd", "par_itm_nm","par_itm_sub1","par_itm_sub2","par_itm_sub3","par_dec_place","par_unit_cd","par_unit_nm","par_cost_std_qty");
		}
		return Hdr_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Hdr_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Hdr_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Hdr_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getHdr_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Hdr_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Hdr_itm_p_PPanel_Itm_itm_sub1_p = createHdr_itm_p_PPanel_Itm_itm_sub1_ListPutter(Hdr_itm_p_PPanel.Itm_itm_sub1, "par_itm_sub1", "par_itm_nm","par_itm_sub2","par_itm_sub3","par_dec_place","par_unit_cd","par_unit_nm","par_cost_std_qty");
		}
		return Hdr_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Hdr_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Hdr_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Hdr_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getHdr_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Hdr_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Hdr_itm_p_PPanel_Itm_itm_sub2_p = createHdr_itm_p_PPanel_Itm_itm_sub2_ListPutter(Hdr_itm_p_PPanel.Itm_itm_sub2, "par_itm_sub2", "par_itm_nm","par_itm_sub3","par_dec_place","par_unit_cd","par_unit_nm","par_cost_std_qty");
		}
		return Hdr_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Hdr_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Hdr_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Hdr_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getHdr_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Hdr_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Hdr_itm_p_PPanel_Itm_itm_sub3_p = createHdr_itm_p_PPanel_Itm_itm_sub3_ListPutter(Hdr_itm_p_PPanel.Itm_itm_sub3, "par_itm_sub3", "par_itm_nm","par_dec_place","par_unit_cd","par_unit_nm","par_cost_std_qty");
		}
		return Hdr_itm_p_PPanel_Itm_itm_sub3_p;
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
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_cd_p = createRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_cd, "chd_itm_cd", "chd_dec_place","chd_unit_cd","chd_unit_nm","chd_itm_typ","chd_itm_typ_nm","chd_itm_typ_d_cd","chd_itm_typ_d_nm","chd_itm_nm","chd_itm_sub1","chd_itm_sub2","chd_itm_sub3");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub1_p = createRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub1, "chd_itm_sub1", "chd_dec_place","chd_unit_cd","chd_unit_nm","chd_itm_typ","chd_itm_typ_nm","chd_itm_typ_d_cd","chd_itm_typ_d_nm","chd_itm_nm","chd_itm_sub2","chd_itm_sub3");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub2_p = createRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub2, "chd_itm_sub2", "chd_dec_place","chd_unit_cd","chd_unit_nm","chd_itm_typ","chd_itm_typ_nm","chd_itm_typ_d_cd","chd_itm_typ_d_nm","chd_itm_nm","chd_itm_sub3");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub3_p = createRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub3, "chd_itm_sub3", "chd_dec_place","chd_unit_cd","chd_unit_nm","chd_itm_typ","chd_itm_typ_nm","chd_itm_typ_d_cd","chd_itm_typ_d_nm","chd_itm_nm");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Rslt_expns_cd_ListPutter]の定義 */
	private MCListPutter Rslt_expns_cd_p = null;

	/**
	 * [Rslt_expns_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_expns_cd_ListPutter() {
		if (Rslt_expns_cd_p == null) {
			Rslt_expns_cd_p = createRslt_expns_cd_ListPutter(columnRslt_expns_cd, "expns_cd", "expns_nm");

		}
		return Rslt_expns_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_BomReg create(){
		MGBDP_BomReg p = new MGBDP_BomReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_BomReg create(String name){
		MGBDP_BomReg p = new MGBDP_BomReg(name);
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
		MGBDP_BomReg_MC.jbfInitScreenOpe((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbfInitRegTarget((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbfInitTop((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbfInitFold((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbfInitCnd((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbfInitCtrl((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbfInitHdr((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbfInitRslt((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbfInitBtn((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbfInitEastBtn((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbInitScreenOpe((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbInitRegTarget((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbInitTop((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbInitFold((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbInitCnd((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbInitCtrl((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbInitHdr((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbInitRslt((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbInitBtn((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.jbInitEastBtn((MGBDP_BomReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBDP_BomReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [RegTarget]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRegTarget(MGBDP_BomReg p) {
		// ブロック関連の初期化
		p.RegTargetPanel = p.beansFactory.createPanel("RegTarget");
		p.RegTargetTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBDP_BomReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBDP_BomReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBDP_BomReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_cmn_flg = p.beansFactory.createCheckBox("Cnd.cmn_flg");
		p.Cnd_wg_flg = p.beansFactory.createCheckBox("Cnd.wg_flg");
		p.Cnd_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.calc_ctg_cd_Label");
		p.Cnd_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.calc_ctg_cd");
		p.Cnd_calc_ctg_cd.setLabel(p.Cnd_calc_ctg_cd_Label);
		p.Cnd_calc_ctg_nm = p.beansFactory.createTextField("Cnd.calc_ctg_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_bom_ptn_Label = p.beansFactory.createLabel("Cnd.bom_ptn_Label");
		p.Cnd_bom_ptn = p.beansFactory.createTextComboBox("Cnd.bom_ptn");
		p.Cnd_bom_ptn.setLabel(p.Cnd_bom_ptn_Label);
		p.Cnd_non_calc_flg_lab = p.beansFactory.createLabel("Cnd.non_calc_flg_lab");
		p.Cnd_off_non_calc_flg = p.beansFactory.createCheckBox("Cnd.off_non_calc_flg");
		p.Cnd_on_non_calc_flg = p.beansFactory.createCheckBox("Cnd.on_non_calc_flg");
		p.Cnd_srch_cmn = p.beansFactory.createButton("Cnd.srch_cmn");
		p.Cnd_srch_wg = p.beansFactory.createButton("Cnd.srch_wg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBDP_BomReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MGBDP_BomReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		p.HdrTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Hdr_calc_ctg_cd_Label = p.beansFactory.createLabel("Hdr.calc_ctg_cd_Label");
		p.Hdr_calc_ctg_cd = p.beansFactory.createTextComboBox("Hdr.calc_ctg_cd");
		p.Hdr_calc_ctg_cd.setLabel(p.Hdr_calc_ctg_cd_Label);
		p.Hdr_calc_ctg_nm = p.beansFactory.createTextField("Hdr.calc_ctg_nm");
		p.Hdr_wg_cd_Label = p.beansFactory.createLabel("Hdr.wg_cd_Label");
		p.Hdr_wg_cd = p.beansFactory.createTextComboBox("Hdr.wg_cd");
		p.Hdr_wg_cd.setLabel(p.Hdr_wg_cd_Label);
		p.Hdr_wg_nm = p.beansFactory.createTextField("Hdr.wg_nm");
		p.Hdr_par_unit_cd = p.beansFactory.createTextField("Hdr.par_unit_cd");
		p.Hdr_par_unit_nm = p.beansFactory.createTextField("Hdr.par_unit_nm");
		p.Hdr_par_dec_place = p.beansFactory.createNumberField("Hdr.par_dec_place");
		p.Hdr_par_cost_std_qty = p.beansFactory.createNumberField("Hdr.par_cost_std_qty");
		p.Hdr_bom_ptn_Label = p.beansFactory.createLabel("Hdr.bom_ptn_Label");
		p.Hdr_bom_ptn = p.beansFactory.createTextField("Hdr.bom_ptn");
		p.Hdr_bom_ptn.setLabel(p.Hdr_bom_ptn_Label);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MGBDP_BomReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_oper_cd = p.beansFactory.createTableColumn("Rslt.oper_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_oper_nm = p.beansFactory.createTableColumn("Rslt.oper_nm", MCColumnType.TEXT);
		p.columnRslt_oper_seq = p.beansFactory.createTableColumn("Rslt.oper_seq", MCColumnType.NUMBER);
		p.columnRslt_disp_seq = p.beansFactory.createTableColumn("Rslt.disp_seq", MCColumnType.NUMBER);
		p.columnRslt_chd_itm_typ = p.beansFactory.createTableColumn("Rslt.chd_itm_typ", MCColumnType.TEXT);
		p.columnRslt_chd_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.chd_itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_chd_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.chd_itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_chd_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.chd_itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_par_unit_cd = p.beansFactory.createTableColumn("Rslt.par_unit_cd", MCColumnType.TEXT);
		p.columnRslt_par_unit_nm = p.beansFactory.createTableColumn("Rslt.par_unit_nm", MCColumnType.TEXT);
		p.columnRslt_chd_unit_cd = p.beansFactory.createTableColumn("Rslt.chd_unit_cd", MCColumnType.TEXT);
		p.columnRslt_chd_unit_nm = p.beansFactory.createTableColumn("Rslt.chd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_chd_dec_place = p.beansFactory.createTableColumn("Rslt.chd_dec_place", MCColumnType.NUMBER);
		p.columnRslt_alt_grp_cd = p.beansFactory.createTableColumn("Rslt.alt_grp_cd", MCColumnType.TEXT);
		p.columnRslt_alt_itm_ratio = p.beansFactory.createTableColumn("Rslt.alt_itm_ratio", MCColumnType.NUMBER);
		p.columnRslt_expns_cd = p.beansFactory.createTableColumn("Rslt.expns_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_expns_nm = p.beansFactory.createTableColumn("Rslt.expns_nm", MCColumnType.TEXT);
		p.columnRslt_rmrks = p.beansFactory.createTableColumn("Rslt.rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_non_calc_flg = p.beansFactory.createTableColumn("Rslt.non_calc_flg", MCColumnType.CHECK);
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
	protected static void jbfInitBtn(MGBDP_BomReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MGBDP0500 = p.beansFactory.createButton("Btn.open_MGBDP0500", "open");
		p.Btn_open_MGBDP0510 = p.beansFactory.createButton("Btn.open_MGBDP0510", "open");
		p.Btn_open_MGBDP0540 = p.beansFactory.createButton("Btn.open_MGBDP0540", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_ins_cmn = p.beansFactory.createButton("Btn.ins_cmn", "upd");
		p.Btn_ins_wg = p.beansFactory.createButton("Btn.ins_wg", "upd");
		p.Btn_upd_cmn = p.beansFactory.createButton("Btn.upd_cmn", "upd");
		p.Btn_upd_wg = p.beansFactory.createButton("Btn.upd_wg", "upd");
		p.Btn_del_cmn = p.beansFactory.createButton("Btn.del_cmn", "del");
		p.Btn_del_wg = p.beansFactory.createButton("Btn.del_wg", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MGBDP_BomReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBDP_BomReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.RegTargetPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [RegTarget]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRegTarget(MGBDP_BomReg p) {
		// ブロック関連の初期化
		p.RegTargetPanel.setBorder(p.RegTargetTitledBorder);
		p.add(p.RegTargetPanel);
		p.RegTargetPanel.setNextBeans(p.TopPanel);
		p.RegTargetPanel.setValueCheck(false);
		p.RegTargetPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RegTargetPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MGBDP_BomReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.HdrPanel);
		p.TopPanel.setValueCheck(false);
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
	protected static void jbInitFold(MGBDP_BomReg p) {
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
	protected static void jbInitCnd(MGBDP_BomReg p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0520.CndR.ope_META);
		p.RegTargetPanel.add(p.Cnd_cmn_flg);
		p.RegTargetPanel.setLastBeans(p.Cnd_cmn_flg);
		p.Cnd_cmn_flg.setNextBeans(p.Cnd_wg_flg);
		p.Cnd_cmn_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0520.CndR.cmn_flg_META);
		p.RegTargetPanel.add(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0520.CndR.wg_flg_META);
		p.Cnd_calc_ctg_cd.setListType(MCListType.FREE);
		p.Cnd_calc_ctg_cd.setLinkBeans(p.Cnd_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_calc_ctg_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_ctg_cd);
		p.Cnd_calc_ctg_cd.setNextBeans(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0520.CndR.calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0520.CndR.calc_ctg_nm_META);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0520.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_term_p_PPanel);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0520.CndR.wg_nm_META);
		p.CndPanel.add(p.Cnd_term_p_PPanel);
		p.Cnd_term_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_term_p_PPanel.Term_term.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_bom_ptn);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_cd, false);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub1,p.Cnd_par_itm_sub2,p.Cnd_par_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub1, false);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub2,p.Cnd_par_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub2, false);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub3, false);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_par_itm_nm);
		p.Cnd_bom_ptn.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_bom_ptn_Label);
		p.CndPanel.add(p.Cnd_bom_ptn);
		p.Cnd_bom_ptn.setNextBeans(p.Cnd_off_non_calc_flg);
		p.Cnd_bom_ptn.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0520.CndR.bom_ptn_META);
		p.CndPanel.add(p.Cnd_non_calc_flg_lab);
		p.CndPanel.add(p.Cnd_off_non_calc_flg);
		p.Cnd_off_non_calc_flg.setNextBeans(p.Cnd_on_non_calc_flg);
		p.Cnd_off_non_calc_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0520.CndR.off_non_calc_flg_META);
		p.CndPanel.add(p.Cnd_on_non_calc_flg);
		p.Cnd_on_non_calc_flg.setNextBeans(p.Cnd_srch_cmn);
		p.Cnd_on_non_calc_flg.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0520.CndR.on_non_calc_flg_META);
		p.Cnd_srch_cmn.setIcon("SEARCH");
		p.CndPanel.add(p.Cnd_srch_cmn);
		p.Cnd_srch_cmn.setNextBeans(p.Cnd_srch_wg);
		p.Cnd_srch_wg.setIcon("SEARCH");
		p.CndPanel.add(p.Cnd_srch_wg);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBDP_BomReg p) {
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
	protected static void jbInitHdr(MGBDP_BomReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setBorder(p.HdrTitledBorder);
		p.add(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.RsltPanel);
		p.HdrPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.Hdr_calc_ctg_cd.setListType(MCListType.STRICT);
		p.Hdr_calc_ctg_cd.setLinkBeans(p.Hdr_calc_ctg_nm);
		p.HdrPanel.add(p.Hdr_calc_ctg_cd_Label);
		p.HdrPanel.add(p.Hdr_calc_ctg_cd);
		p.HdrPanel.setLastBeans(p.Hdr_calc_ctg_cd);
		p.Hdr_calc_ctg_cd.setNextBeans(p.Hdr_calc_ctg_nm);
		p.Hdr_calc_ctg_cd.setRow(p.getHdrR(), mcframe.clientMGBD.MGBDP0520.HdrR.calc_ctg_cd_META);
		p.HdrPanel.add(p.Hdr_calc_ctg_nm);
		p.Hdr_calc_ctg_nm.setNextBeans(p.Hdr_wg_cd);
		p.Hdr_calc_ctg_nm.setRow(p.getHdrR(), mcframe.clientMGBD.MGBDP0520.HdrR.calc_ctg_nm_META);
		p.Hdr_wg_cd.setListType(MCListType.STRICT);
		p.Hdr_wg_cd.setLinkBeans(p.Hdr_wg_nm);
		p.HdrPanel.add(p.Hdr_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_wg_cd);
		p.Hdr_wg_cd.setNextBeans(p.Hdr_wg_nm);
		p.Hdr_wg_cd.setRow(p.getHdrR(), mcframe.clientMGBD.MGBDP0520.HdrR.wg_cd_META);
		p.HdrPanel.add(p.Hdr_wg_nm);
		p.Hdr_wg_nm.setNextBeans(p.Hdr_term_p_PPanel);
		p.Hdr_wg_nm.setRow(p.getHdrR(), mcframe.clientMGBD.MGBDP0520.HdrR.wg_nm_META);
		p.HdrPanel.add(p.Hdr_term_p_PPanel);
		p.Hdr_term_p_PPanel.setNextBeans(p.Hdr_itm_p_PPanel);
		p.HdrPanel.add(p.Hdr_itm_p_PPanel);
		p.Hdr_itm_p_PPanel.setNextBeans(p.Hdr_par_unit_cd);
		p.Hdr_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Hdr_par_itm_nm,p.Hdr_par_itm_sub1,p.Hdr_par_itm_sub2,p.Hdr_par_itm_sub3,p.Hdr_par_dec_place,p.Hdr_par_unit_cd,p.Hdr_par_unit_nm,p.Hdr_par_cost_std_qty);
		p.Hdr_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Hdr_par_itm_nm,p.Hdr_par_itm_sub2,p.Hdr_par_itm_sub3,p.Hdr_par_dec_place,p.Hdr_par_unit_cd,p.Hdr_par_unit_nm,p.Hdr_par_cost_std_qty);
		p.Hdr_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Hdr_par_itm_nm,p.Hdr_par_itm_sub3,p.Hdr_par_dec_place,p.Hdr_par_unit_cd,p.Hdr_par_unit_nm,p.Hdr_par_cost_std_qty);
		p.Hdr_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Hdr_par_itm_nm,p.Hdr_par_dec_place,p.Hdr_par_unit_cd,p.Hdr_par_unit_nm,p.Hdr_par_cost_std_qty);
		p.HdrPanel.add(p.Hdr_par_unit_cd);
		p.Hdr_par_unit_cd.setNextBeans(p.Hdr_par_unit_nm);
		p.Hdr_par_unit_cd.setRow(p.getHdrR(), mcframe.clientMGBD.MGBDP0520.HdrR.par_unit_cd_META);
		p.HdrPanel.add(p.Hdr_par_unit_nm);
		p.Hdr_par_unit_nm.setNextBeans(p.Hdr_par_dec_place);
		p.Hdr_par_unit_nm.setRow(p.getHdrR(), mcframe.clientMGBD.MGBDP0520.HdrR.par_unit_nm_META);
		p.HdrPanel.add(p.Hdr_par_dec_place);
		p.Hdr_par_dec_place.setNextBeans(p.Hdr_par_cost_std_qty);
		p.Hdr_par_dec_place.setRow(p.getHdrR(), mcframe.clientMGBD.MGBDP0520.HdrR.par_dec_place_META);
		p.HdrPanel.add(p.Hdr_par_cost_std_qty);
		p.Hdr_par_cost_std_qty.setNextBeans(p.Hdr_bom_ptn);
		p.Hdr_par_cost_std_qty.setRow(p.getHdrR(), mcframe.clientMGBD.MGBDP0520.HdrR.par_cost_std_qty_META);
		p.HdrPanel.add(p.Hdr_bom_ptn_Label);
		p.HdrPanel.add(p.Hdr_bom_ptn);
		p.Hdr_bom_ptn.setRow(p.getHdrR(), mcframe.clientMGBD.MGBDP0520.HdrR.bom_ptn_META);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MGBDP_BomReg p) {
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
	protected static void jbInitBtn(MGBDP_BomReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MGBDP0500.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MGBDP0500);
		p.BtnPanel.setLastBeans(p.Btn_open_MGBDP0500);
		p.Btn_open_MGBDP0500.setNextBeans(p.Btn_open_MGBDP0510);
		p.Btn_open_MGBDP0510.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MGBDP0510);
		p.Btn_open_MGBDP0510.setNextBeans(p.Btn_open_MGBDP0540);
		p.Btn_open_MGBDP0540.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_open_MGBDP0540);
		p.Btn_open_MGBDP0540.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
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
		p.Btn_rcopy.setNextBeans(p.Btn_ins_cmn);
		p.Btn_ins_cmn.setIcon("REGISTER");
		p.Btn_ins_cmn.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins_cmn);
		p.Btn_ins_cmn.setNextBeans(p.Btn_ins_wg);
		p.Btn_ins_wg.setIcon("REGISTER");
		p.Btn_ins_wg.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins_wg);
		p.Btn_ins_wg.setNextBeans(p.Btn_upd_cmn);
		p.Btn_upd_cmn.setIcon("REGISTER");
		p.Btn_upd_cmn.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_cmn);
		p.Btn_upd_cmn.setNextBeans(p.Btn_upd_wg);
		p.Btn_upd_wg.setIcon("REGISTER");
		p.Btn_upd_wg.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_wg);
		p.Btn_del_cmn.setIcon("DELETE");
		p.Btn_del_cmn.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del_cmn);
		p.EastBtnPanel.add(p.Btn_del_cmn);
		p.Btn_del_cmn.setNextBeans(p.Btn_del_wg);
		p.Btn_del_wg.setIcon("DELETE");
		p.Btn_del_wg.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del_wg);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MGBDP_BomReg p) {
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
		MGBDP_BomReg_MC.mcInitScreenOpe((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.mcInitRegTarget((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.mcInitTop((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.mcInitFold((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.mcInitCnd((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.mcInitCtrl((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.mcInitHdr((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.mcInitRslt((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.mcInitBtn((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.mcInitEastBtn((MGBDP_BomReg)this);

		// [INS]ステータスのモードの設定
		MGBDP_BomReg_MC.statusInitINS_ScreenOpe((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitINS_RegTarget((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitINS_Top((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitINS_Fold((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitINS_Cnd((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitINS_Ctrl((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitINS_Hdr((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitINS_Rslt((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitINS_Btn((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitINS_EastBtn((MGBDP_BomReg)this);

		// [SRCH_UPD]ステータスのモードの設定
		MGBDP_BomReg_MC.statusInitSRCH__UPD_ScreenOpe((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__UPD_RegTarget((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__UPD_Top((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__UPD_Fold((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__UPD_Cnd((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__UPD_Ctrl((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__UPD_Hdr((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__UPD_Rslt((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__UPD_Btn((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__UPD_EastBtn((MGBDP_BomReg)this);

		// [UPD]ステータスのモードの設定
		MGBDP_BomReg_MC.statusInitUPD_ScreenOpe((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitUPD_RegTarget((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitUPD_Top((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitUPD_Fold((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitUPD_Cnd((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitUPD_Ctrl((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitUPD_Hdr((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitUPD_Rslt((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitUPD_Btn((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitUPD_EastBtn((MGBDP_BomReg)this);

		// [SRCH_REF]ステータスのモードの設定
		MGBDP_BomReg_MC.statusInitSRCH__REF_ScreenOpe((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__REF_RegTarget((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__REF_Top((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__REF_Fold((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__REF_Cnd((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__REF_Ctrl((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__REF_Hdr((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__REF_Rslt((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__REF_Btn((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__REF_EastBtn((MGBDP_BomReg)this);

		// [REF]ステータスのモードの設定
		MGBDP_BomReg_MC.statusInitREF_ScreenOpe((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitREF_RegTarget((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitREF_Top((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitREF_Fold((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitREF_Cnd((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitREF_Ctrl((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitREF_Hdr((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitREF_Rslt((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitREF_Btn((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitREF_EastBtn((MGBDP_BomReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MGBDP_BomReg_MC.statusInitSRCH__DEL_ScreenOpe((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__DEL_RegTarget((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__DEL_Top((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__DEL_Fold((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__DEL_Cnd((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__DEL_Ctrl((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__DEL_Hdr((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__DEL_Rslt((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__DEL_Btn((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitSRCH__DEL_EastBtn((MGBDP_BomReg)this);

		// [DEL]ステータスのモードの設定
		MGBDP_BomReg_MC.statusInitDEL_ScreenOpe((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitDEL_RegTarget((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitDEL_Top((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitDEL_Fold((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitDEL_Cnd((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitDEL_Ctrl((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitDEL_Hdr((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitDEL_Rslt((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitDEL_Btn((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitDEL_EastBtn((MGBDP_BomReg)this);

		// [FIX_I]ステータスのモードの設定
		MGBDP_BomReg_MC.statusInitFIX__I_ScreenOpe((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitFIX__I_RegTarget((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitFIX__I_Top((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitFIX__I_Fold((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitFIX__I_Cnd((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitFIX__I_Ctrl((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitFIX__I_Hdr((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitFIX__I_Rslt((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitFIX__I_Btn((MGBDP_BomReg)this);
		MGBDP_BomReg_MC.statusInitFIX__I_EastBtn((MGBDP_BomReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBDP_BomReg p) {
	}

	/**
	 *  [RegTarget]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRegTarget(MGBDP_BomReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBDP_BomReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBDP_BomReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBDP_BomReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_cmn_flg.addAllListener(p);
		p.Cnd_wg_flg.addAllListener(p);
		p.Cnd_calc_ctg_cd.setListListener(p);
		p.Cnd_calc_ctg_cd.addAllListener(p);
		p.Cnd_calc_ctg_nm.setListListener(p);
		p.Cnd_calc_ctg_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_bom_ptn.setListListener(p);
		p.Cnd_bom_ptn.addAllListener(p);
		p.Cnd_off_non_calc_flg.addAllListener(p);
		p.Cnd_on_non_calc_flg.addAllListener(p);
		p.Cnd_srch_cmn.addAllListener(p);
		p.Cnd_srch_cmn.setAPMethodName("doCnd_srch_cmn");
		p.Cnd_srch_wg.addAllListener(p);
		p.Cnd_srch_wg.setAPMethodName("doCnd_srch_wg");
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBDP_BomReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MGBDP_BomReg p) {
		p.Hdr_calc_ctg_cd.setListListener(p);
		p.Hdr_calc_ctg_cd.addAllListener(p);
		p.Hdr_calc_ctg_nm.setListListener(p);
		p.Hdr_calc_ctg_nm.addAllListener(p);
		p.Hdr_wg_cd.setListListener(p);
		p.Hdr_wg_cd.addAllListener(p);
		p.Hdr_wg_nm.setListListener(p);
		p.Hdr_wg_nm.addAllListener(p);
		p.Hdr_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_par_unit_cd.setListListener(p);
		p.Hdr_par_unit_cd.addAllListener(p);
		p.Hdr_par_unit_nm.setListListener(p);
		p.Hdr_par_unit_nm.addAllListener(p);
		p.Hdr_par_dec_place.setListListener(p);
		p.Hdr_par_dec_place.addAllListener(p);
		p.Hdr_par_cost_std_qty.setListListener(p);
		p.Hdr_par_cost_std_qty.addAllListener(p);
		p.Hdr_bom_ptn.setListListener(p);
		p.Hdr_bom_ptn.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MGBDP_BomReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_oper_cd.addAllListener(p);
		p.columnRslt_oper_cd.setListListener(p);
		p.columnRslt_oper_nm.addAllListener(p);
		p.columnRslt_oper_nm.setListListener(p);
		p.columnRslt_oper_seq.addAllListener(p);
		p.columnRslt_oper_seq.setListListener(p);
		p.columnRslt_disp_seq.addAllListener(p);
		p.columnRslt_disp_seq.setListListener(p);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_chd_itm_typ.addAllListener(p);
		p.columnRslt_chd_itm_typ.setListListener(p);
		p.columnRslt_chd_itm_typ_nm.addAllListener(p);
		p.columnRslt_chd_itm_typ_nm.setListListener(p);
		p.columnRslt_chd_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_chd_itm_typ_d_cd.setListListener(p);
		p.columnRslt_chd_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_chd_itm_typ_d_nm.setListListener(p);
		p.columnRslt_par_unit_cd.addAllListener(p);
		p.columnRslt_par_unit_cd.setListListener(p);
		p.columnRslt_par_unit_nm.addAllListener(p);
		p.columnRslt_par_unit_nm.setListListener(p);
		p.columnRslt_chd_unit_cd.addAllListener(p);
		p.columnRslt_chd_unit_cd.setListListener(p);
		p.columnRslt_chd_unit_nm.addAllListener(p);
		p.columnRslt_chd_unit_nm.setListListener(p);
		p.columnRslt_chd_dec_place.addAllListener(p);
		p.columnRslt_chd_dec_place.setListListener(p);
		p.columnRslt_alt_grp_cd.addAllListener(p);
		p.columnRslt_alt_grp_cd.setListListener(p);
		p.columnRslt_alt_itm_ratio.addAllListener(p);
		p.columnRslt_alt_itm_ratio.setListListener(p);
		p.columnRslt_expns_cd.addAllListener(p);
		p.columnRslt_expns_cd.setListListener(p);
		p.columnRslt_expns_nm.addAllListener(p);
		p.columnRslt_expns_nm.setListListener(p);
		p.columnRslt_rmrks.addAllListener(p);
		p.columnRslt_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_non_calc_flg.addAllListener(p);
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
	protected static void mcInitBtn(MGBDP_BomReg p) {
		p.Btn_open_MGBDP0500.addAllListener(p);
		p.Btn_open_MGBDP0500.setAPMethodName("doBtn_open_MGBDP0500");
		p.Btn_open_MGBDP0510.addAllListener(p);
		p.Btn_open_MGBDP0510.setAPMethodName("doBtn_open_MGBDP0510");
		p.Btn_open_MGBDP0540.addAllListener(p);
		p.Btn_open_MGBDP0540.setAPMethodName("doBtn_open_MGBDP0540");
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
		p.Btn_ins_cmn.addAllListener(p);
		p.Btn_ins_cmn.setAPMethodName("doBtn_ins_cmn");
		p.Btn_ins_wg.addAllListener(p);
		p.Btn_ins_wg.setAPMethodName("doBtn_ins_wg");
		p.Btn_upd_cmn.addAllListener(p);
		p.Btn_upd_cmn.setAPMethodName("doBtn_upd_cmn");
		p.Btn_upd_wg.addAllListener(p);
		p.Btn_upd_wg.setAPMethodName("doBtn_upd_wg");
		p.Btn_del_cmn.addAllListener(p);
		p.Btn_del_cmn.setAPMethodName("doBtn_del_cmn");
		p.Btn_del_wg.addAllListener(p);
		p.Btn_del_wg.setAPMethodName("doBtn_del_wg");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MGBDP_BomReg p) {
	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MGBDP_BomReg p){

	}

	/**
	 * [INS]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitINS_RegTarget(MGBDP_BomReg p){

	}

	/**
	 * [INS]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS_Top(MGBDP_BomReg p){

	}

	/**
	 * [INS]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINS_Fold(MGBDP_BomReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MGBDP_BomReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_calc_ctg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_bom_ptn.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_off_non_calc_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_on_non_calc_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Ctrl(MGBDP_BomReg p){
		p.Ctrl_ctrl_PPanel.putStatus(INS, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.DISABLE);

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MGBDP_BomReg p){
		p.Hdr_calc_ctg_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_calc_ctg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_term_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Hdr_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Hdr_par_unit_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_par_unit_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_par_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_par_cost_std_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, INS, MCMode.REQUIRED);

	}

	/**
	 * [INS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rslt(MGBDP_BomReg p){
		p.columnRslt_check.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_oper_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_oper_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_disp_seq.putMode(p, INS, MCMode.REQUIRED);
		p.Rslt_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnRslt_chd_itm_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_par_rqmt_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_par_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_par_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_chd_rqmt_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Rslt_chd_base_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Rslt_fxd_chd_rqmt_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Rslt_chd_min_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Rslt_chd_batch_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_chd_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_chd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_chd_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_alt_grp_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_alt_itm_ratio.putMode(p, INS, MCMode.REQUIRED);
		p.columnRslt_expns_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_expns_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnRslt_non_calc_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Rslt_rts_msg_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
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
	protected static void statusInitINS_Btn(MGBDP_BomReg p){
		p.Btn_open_MGBDP0500.putMode(p, INS, MCMode.ENABLE);
		p.Btn_open_MGBDP0510.putMode(p, INS, MCMode.ENABLE);
		p.Btn_open_MGBDP0540.putMode(p, INS, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INS, MCMode.ENABLE);
		p.Btn_radd.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, INS, MCMode.ENABLE);
		p.Btn_ins_cmn.putMode(p, INS, MCMode.ENABLE);
		p.Btn_ins_wg.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd_cmn.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd_wg.putMode(p, INS, MCMode.ENABLE);
		p.Btn_del_cmn.putMode(p, INS, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MGBDP_BomReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ScreenOpe(MGBDP_BomReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_RegTarget(MGBDP_BomReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Top(MGBDP_BomReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Fold(MGBDP_BomReg p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Cnd(MGBDP_BomReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_bom_ptn.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_off_non_calc_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_on_non_calc_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_srch_cmn.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Ctrl(MGBDP_BomReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Hdr(MGBDP_BomReg p){
		p.Hdr_calc_ctg_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Hdr_term_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_par_unit_cd.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Hdr_par_unit_nm.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Hdr_par_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Hdr_par_cost_std_qty.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, SRCH_UPD, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Rslt(MGBDP_BomReg p){
		p.columnRslt_check.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_chd_itm_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_par_rqmt_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_par_unit_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_par_unit_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_chd_rqmt_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_base_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_fxd_chd_rqmt_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_min_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_batch_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_chd_unit_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_unit_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_alt_grp_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_ratio.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_expns_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_expns_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_non_calc_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Btn(MGBDP_BomReg p){
		p.Btn_open_MGBDP0500.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Btn_open_MGBDP0510.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Btn_open_MGBDP0540.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_ins_cmn.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_ins_wg.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, SRCH_UPD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_EastBtn(MGBDP_BomReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MGBDP_BomReg p){

	}

	/**
	 * [UPD]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RegTarget(MGBDP_BomReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MGBDP_BomReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MGBDP_BomReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MGBDP_BomReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_bom_ptn.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_off_non_calc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_on_non_calc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_srch_cmn.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MGBDP_BomReg p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MGBDP_BomReg p){
		p.Hdr_calc_ctg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_term_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_par_unit_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_par_unit_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_par_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_par_cost_std_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MGBDP_BomReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_oper_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_oper_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_disp_seq.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnRslt_chd_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_par_rqmt_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_par_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_par_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_chd_rqmt_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Rslt_chd_base_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Rslt_fxd_chd_rqmt_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Rslt_chd_min_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Rslt_chd_batch_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_chd_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_chd_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_alt_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_alt_itm_ratio.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_expns_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_expns_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_non_calc_flg.putMode(p, UPD, MCMode.REQUIRED);
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
	protected static void statusInitUPD_Btn(MGBDP_BomReg p){
		p.Btn_open_MGBDP0500.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBDP0510.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MGBDP0540.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_ins_cmn.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_ins_wg.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_cmn.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_wg.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del_cmn.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MGBDP_BomReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ScreenOpe(MGBDP_BomReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_RegTarget(MGBDP_BomReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Top(MGBDP_BomReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Fold(MGBDP_BomReg p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd(MGBDP_BomReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_bom_ptn.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_off_non_calc_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_on_non_calc_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_srch_cmn.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Ctrl(MGBDP_BomReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Hdr(MGBDP_BomReg p){
		p.Hdr_calc_ctg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Hdr_term_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_par_unit_cd.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Hdr_par_unit_nm.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Hdr_par_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Hdr_par_cost_std_qty.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, SRCH_REF, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Rslt(MGBDP_BomReg p){
		p.columnRslt_check.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_chd_itm_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_par_rqmt_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_par_unit_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_par_unit_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_chd_rqmt_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_base_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_fxd_chd_rqmt_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_min_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_batch_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_chd_unit_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_chd_unit_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_chd_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_alt_grp_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_ratio.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_expns_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_expns_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_non_calc_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Btn(MGBDP_BomReg p){
		p.Btn_open_MGBDP0500.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_open_MGBDP0510.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_open_MGBDP0540.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_ins_cmn.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_ins_wg.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, SRCH_REF, MCMode.DISABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_EastBtn(MGBDP_BomReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MGBDP_BomReg p){

	}

	/**
	 * [REF]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitREF_RegTarget(MGBDP_BomReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBDP_BomReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBDP_BomReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBDP_BomReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_bom_ptn.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_off_non_calc_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_on_non_calc_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch_cmn.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBDP_BomReg p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MGBDP_BomReg p){
		p.Hdr_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_par_unit_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_par_unit_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_par_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_par_cost_std_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MGBDP_BomReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_chd_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_par_rqmt_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_par_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_par_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_chd_rqmt_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_base_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_fxd_chd_rqmt_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_min_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_batch_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_chd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_chd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_chd_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_alt_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_ratio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_expns_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_expns_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_non_calc_flg.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_Btn(MGBDP_BomReg p){
		p.Btn_open_MGBDP0500.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MGBDP0510.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MGBDP0540.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_ins_cmn.putMode(p, REF, MCMode.DISABLE);
		p.Btn_ins_wg.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MGBDP_BomReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MGBDP_BomReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_RegTarget(MGBDP_BomReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MGBDP_BomReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MGBDP_BomReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MGBDP_BomReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_bom_ptn.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_off_non_calc_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_on_non_calc_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_srch_cmn.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MGBDP_BomReg p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Hdr(MGBDP_BomReg p){
		p.Hdr_calc_ctg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Hdr_term_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_par_unit_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Hdr_par_unit_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Hdr_par_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Hdr_par_cost_std_qty.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, SRCH_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MGBDP_BomReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_chd_itm_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_par_rqmt_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_par_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_par_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_chd_rqmt_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_base_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_fxd_chd_rqmt_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_min_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_batch_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_chd_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_chd_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_chd_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_alt_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_ratio.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_expns_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_expns_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_non_calc_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MGBDP_BomReg p){
		p.Btn_open_MGBDP0500.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MGBDP0510.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MGBDP0540.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_ins_cmn.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_ins_wg.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MGBDP_BomReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MGBDP_BomReg p){

	}

	/**
	 * [DEL]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RegTarget(MGBDP_BomReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MGBDP_BomReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MGBDP_BomReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MGBDP_BomReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_bom_ptn.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_off_non_calc_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_on_non_calc_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch_cmn.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MGBDP_BomReg p){
		p.Ctrl_ctrl_PPanel.putStatus(DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MGBDP_BomReg p){
		p.Hdr_calc_ctg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_term_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_par_unit_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_par_unit_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_par_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_par_cost_std_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MGBDP_BomReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_oper_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_chd_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_par_rqmt_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_par_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_par_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_chd_rqmt_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_base_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_fxd_chd_rqmt_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_min_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_batch_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_chd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_chd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_chd_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_alt_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_ratio.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_expns_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_expns_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_non_calc_flg.putMode(p, DEL, MCMode.READ_ONLY);
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
	protected static void statusInitDEL_Btn(MGBDP_BomReg p){
		p.Btn_open_MGBDP0500.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MGBDP0510.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MGBDP0540.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins_cmn.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins_wg.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_del_wg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MGBDP_BomReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MGBDP_BomReg p){

	}

	/**
	 * [FIX_I]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_RegTarget(MGBDP_BomReg p){

	}

	/**
	 * [FIX_I]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Top(MGBDP_BomReg p){

	}

	/**
	 * [FIX_I]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Fold(MGBDP_BomReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MGBDP_BomReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_wg_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_calc_ctg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_bom_ptn.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_off_non_calc_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_on_non_calc_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Ctrl(MGBDP_BomReg p){
		p.Ctrl_ctrl_PPanel.putStatus(FIX_I, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MGBDP_BomReg p){
		p.Hdr_calc_ctg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_calc_ctg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_term_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);
		p.Hdr_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_par_unit_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_par_unit_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_par_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_par_cost_std_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_bom_ptn.putMode(p, FIX_I, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_I]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Rslt(MGBDP_BomReg p){
		p.columnRslt_check.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_oper_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_oper_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_oper_seq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_chd_itm_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_chd_itm_typ_d_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_par_rqmt_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_par_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_par_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_chd_rqmt_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_base_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_fxd_chd_rqmt_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_min_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_chd_batch_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_chd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_chd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_chd_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_alt_grp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_alt_itm_ratio.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_expns_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_expns_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_non_calc_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
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
	protected static void statusInitFIX__I_Btn(MGBDP_BomReg p){
		p.Btn_open_MGBDP0500.putMode(p, FIX_I, MCMode.ENABLE);
		p.Btn_open_MGBDP0510.putMode(p, FIX_I, MCMode.ENABLE);
		p.Btn_open_MGBDP0540.putMode(p, FIX_I, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_ins_cmn.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_ins_wg.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MGBDP_BomReg p){

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
		MGBDP_BomReg_MC.setTableConfigRslt((MGBDP_BomReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MGBDP_BomReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_oper_cd.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.oper_cd_META);
		p.columnRslt_oper_cd.addLinkBeans(p.columnRslt_oper_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_cd);
		p.columnRslt_oper_nm.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.oper_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_nm);
		p.columnRslt_oper_seq.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.oper_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_seq);
		p.columnRslt_disp_seq.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.disp_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_seq);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnRslt_chd_dec_place, p.columnRslt_chd_unit_cd, p.columnRslt_chd_unit_nm, p.columnRslt_chd_itm_typ, p.columnRslt_chd_itm_typ_nm, p.columnRslt_chd_itm_typ_d_cd, p.columnRslt_chd_itm_typ_d_nm, p.columnRslt_chd_itm_nm, p.columnRslt_chd_itm_sub1, p.columnRslt_chd_itm_sub2, p.columnRslt_chd_itm_sub3);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnRslt_chd_dec_place, p.columnRslt_chd_unit_cd, p.columnRslt_chd_unit_nm, p.columnRslt_chd_itm_typ, p.columnRslt_chd_itm_typ_nm, p.columnRslt_chd_itm_typ_d_cd, p.columnRslt_chd_itm_typ_d_nm, p.columnRslt_chd_itm_nm, p.columnRslt_chd_itm_sub2, p.columnRslt_chd_itm_sub3);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnRslt_chd_dec_place, p.columnRslt_chd_unit_cd, p.columnRslt_chd_unit_nm, p.columnRslt_chd_itm_typ, p.columnRslt_chd_itm_typ_nm, p.columnRslt_chd_itm_typ_d_cd, p.columnRslt_chd_itm_typ_d_nm, p.columnRslt_chd_itm_nm, p.columnRslt_chd_itm_sub3);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnRslt_chd_dec_place, p.columnRslt_chd_unit_cd, p.columnRslt_chd_unit_nm, p.columnRslt_chd_itm_typ, p.columnRslt_chd_itm_typ_nm, p.columnRslt_chd_itm_typ_d_cd, p.columnRslt_chd_itm_typ_d_nm, p.columnRslt_chd_itm_nm);
		p.columnRslt_chd_itm_typ.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.chd_itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_itm_typ);
		p.columnRslt_chd_itm_typ_nm.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.chd_itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_itm_typ_nm);
		p.columnRslt_chd_itm_typ_d_cd.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.chd_itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_itm_typ_d_cd);
		p.columnRslt_chd_itm_typ_d_nm.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.chd_itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_par_rqmt_qty_p_PPanel.QtyTable);
		p.columnRslt_par_unit_cd.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.par_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_unit_cd);
		p.columnRslt_par_unit_nm.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.par_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_unit_nm);
		p.RsltTable.addTable(p.Rslt_chd_rqmt_qty_p_PPanel.QtyTable);
		p.Rslt_chd_rqmt_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.RsltTable.addTable(p.Rslt_chd_base_qty_p_PPanel.QtyTable);
		p.Rslt_chd_base_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.RsltTable.addTable(p.Rslt_fxd_chd_rqmt_qty_p_PPanel.QtyTable);
		p.Rslt_fxd_chd_rqmt_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.RsltTable.addTable(p.Rslt_chd_min_qty_p_PPanel.QtyTable);
		p.Rslt_chd_min_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.RsltTable.addTable(p.Rslt_chd_batch_qty_p_PPanel.QtyTable);
		p.Rslt_chd_batch_qty_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnRslt_chd_unit_cd.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.chd_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_unit_cd);
		p.columnRslt_chd_unit_nm.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.chd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_unit_nm);
		p.columnRslt_chd_dec_place.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.chd_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_chd_dec_place);
		p.columnRslt_alt_grp_cd.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.alt_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_grp_cd);
		p.columnRslt_alt_itm_ratio.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.alt_itm_ratio_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alt_itm_ratio);
		p.columnRslt_expns_cd.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.expns_cd_META);
		p.columnRslt_expns_cd.addLinkBeans(p.columnRslt_expns_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_expns_cd);
		p.columnRslt_expns_nm.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.expns_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_expns_nm);
		p.columnRslt_rmrks.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_non_calc_flg.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.non_calc_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_non_calc_flg);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMGBD.MGBDP0520.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_ctg_cd.getListConfig().setPutter(getCnd_calc_ctg_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_bom_ptn.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bom_ptn.getListConfig().setPutter(getCnd_bom_ptn_ListPutter());
		Hdr_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_calc_ctg_cd.getListConfig().setPutter(getHdr_calc_ctg_cd_ListPutter());
		Hdr_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_wg_cd.getListConfig().setPutter(getHdr_wg_cd_ListPutter());
		Hdr_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getHdr_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Hdr_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getHdr_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Hdr_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getHdr_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Hdr_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getHdr_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		columnRslt_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_oper_cd.getListConfig().setPutter(getRslt_oper_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnRslt_expns_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_expns_cd.getListConfig().setPutter(getRslt_expns_cd_ListPutter());
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
	 * この画面を[SRCH_UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_UPDStatus() {
		status = SRCH_UPD;
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
	 * この画面を[SRCH_REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_REFStatus() {
		status = SRCH_REF;
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
	 * この画面を[SRCH_DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DELStatus() {
		status = SRCH_DEL;
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
	 * この画面を[FIX_I]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_IStatus() {
		status = FIX_I;
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
		else if (SRCH_UPD.equals(status)) {
			setSRCH_UPDStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (SRCH_REF.equals(status)) {
			setSRCH_REFStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (SRCH_DEL.equals(status)) {
			setSRCH_DELStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
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
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Cnd_bom_ptn_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bom_ptn_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MG.MGUAP0010.BomPtn");
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
	 * [Hdr_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Hdr_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createHdr_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Hdr_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createHdr_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Hdr_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createHdr_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
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
	 * [Rslt_expns_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_expns_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Expns");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_ctg_cd) return getCnd_calc_ctg_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_bom_ptn) return getCnd_bom_ptn(row, info);
		if(combo == Hdr_calc_ctg_cd) return getHdr_calc_ctg_cd(row, info);
		if(combo == Hdr_wg_cd) return getHdr_wg_cd(row, info);
		if(combo == Hdr_itm_p_PPanel.Itm_itm_cd) return getHdr_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Hdr_itm_p_PPanel.Itm_itm_sub1) return getHdr_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Hdr_itm_p_PPanel.Itm_itm_sub2) return getHdr_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Hdr_itm_p_PPanel.Itm_itm_sub3) return getHdr_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == columnRslt_oper_cd) return getRslt_oper_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_cd) return getRslt_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub1) return getRslt_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub2) return getRslt_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub3) return getRslt_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnRslt_expns_cd) return getRslt_expns_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch_cmn) doCnd_srch_cmn(info);
		else if (ap == Cnd_srch_wg) doCnd_srch_wg(info);
		else if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == Btn_open_MGBDP0500) doBtn_open_MGBDP0500(info);
		else if (ap == Btn_open_MGBDP0510) doBtn_open_MGBDP0510(info);
		else if (ap == Btn_open_MGBDP0540) doBtn_open_MGBDP0540(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_ins_cmn) doBtn_ins_cmn(info);
		else if (ap == Btn_ins_wg) doBtn_ins_wg(info);
		else if (ap == Btn_upd_cmn) doBtn_upd_cmn(info);
		else if (ap == Btn_upd_wg) doBtn_upd_wg(info);
		else if (ap == Btn_del_cmn) doBtn_del_cmn(info);
		else if (ap == Btn_del_wg) doBtn_del_wg(info);
	}

	/**
	 * [Cnd]パネルの[srch_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_cmn(MCEventInfo info);

	/**
	 * [Cnd]パネルの[srch_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_wg(MCEventInfo info);

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBDP0500]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBDP0500(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBDP0510]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBDP0510(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MGBDP0540]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MGBDP0540(MCEventInfo info);

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
	 * [Btn]パネルの[ins_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins_cmn(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins_wg(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_cmn(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_wg(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_cmn(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_wg(MCEventInfo info);

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
		if (vc == Cnd_cmn_flg) return doCnd_cmn_flg_VC(info);
		if (vc == Cnd_wg_flg) return doCnd_wg_flg_VC(info);
		if (vc == Cnd_calc_ctg_cd) return doCnd_calc_ctg_cd_VC(info);
		if (vc == Cnd_calc_ctg_nm) return doCnd_calc_ctg_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_bom_ptn) return doCnd_bom_ptn_VC(info);
		if (vc == Cnd_off_non_calc_flg) return doCnd_off_non_calc_flg_VC(info);
		if (vc == Cnd_on_non_calc_flg) return doCnd_on_non_calc_flg_VC(info);
		if (vc == Hdr_calc_ctg_cd) return doHdr_calc_ctg_cd_VC(info);
		if (vc == Hdr_calc_ctg_nm) return doHdr_calc_ctg_nm_VC(info);
		if (vc == Hdr_wg_cd) return doHdr_wg_cd_VC(info);
		if (vc == Hdr_wg_nm) return doHdr_wg_nm_VC(info);
		if (vc == Hdr_par_unit_cd) return doHdr_par_unit_cd_VC(info);
		if (vc == Hdr_par_unit_nm) return doHdr_par_unit_nm_VC(info);
		if (vc == Hdr_par_dec_place) return doHdr_par_dec_place_VC(info);
		if (vc == Hdr_par_cost_std_qty) return doHdr_par_cost_std_qty_VC(info);
		if (vc == Hdr_bom_ptn) return doHdr_bom_ptn_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_oper_cd) return doRslt_oper_cd_VC(info);
		if (vc == columnRslt_oper_nm) return doRslt_oper_nm_VC(info);
		if (vc == columnRslt_oper_seq) return doRslt_oper_seq_VC(info);
		if (vc == columnRslt_disp_seq) return doRslt_disp_seq_VC(info);
		if (vc == columnRslt_chd_itm_typ) return doRslt_chd_itm_typ_VC(info);
		if (vc == columnRslt_chd_itm_typ_nm) return doRslt_chd_itm_typ_nm_VC(info);
		if (vc == columnRslt_chd_itm_typ_d_cd) return doRslt_chd_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_chd_itm_typ_d_nm) return doRslt_chd_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_par_unit_cd) return doRslt_par_unit_cd_VC(info);
		if (vc == columnRslt_par_unit_nm) return doRslt_par_unit_nm_VC(info);
		if (vc == columnRslt_chd_unit_cd) return doRslt_chd_unit_cd_VC(info);
		if (vc == columnRslt_chd_unit_nm) return doRslt_chd_unit_nm_VC(info);
		if (vc == columnRslt_chd_dec_place) return doRslt_chd_dec_place_VC(info);
		if (vc == columnRslt_alt_grp_cd) return doRslt_alt_grp_cd_VC(info);
		if (vc == columnRslt_alt_itm_ratio) return doRslt_alt_itm_ratio_VC(info);
		if (vc == columnRslt_expns_cd) return doRslt_expns_cd_VC(info);
		if (vc == columnRslt_expns_nm) return doRslt_expns_nm_VC(info);
		if (vc == columnRslt_rmrks) return doRslt_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_non_calc_flg) return doRslt_non_calc_flg_VC(info);
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
	 * [Cnd]パネルの[cmn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cmn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[off_non_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_off_non_calc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[on_non_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_on_non_calc_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[par_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_par_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[par_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_par_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[par_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_par_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[par_cost_std_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_par_cost_std_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bom_ptn_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[chd_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_chd_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alt_itm_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alt_itm_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_expns_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[non_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_non_calc_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_cmn_flg) doCnd_cmn_flg_NC(info);
		else if (nc == Cnd_wg_flg) doCnd_wg_flg_NC(info);
		else if (nc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NC(info);
		else if (nc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_bom_ptn) doCnd_bom_ptn_NC(info);
		else if (nc == Cnd_off_non_calc_flg) doCnd_off_non_calc_flg_NC(info);
		else if (nc == Cnd_on_non_calc_flg) doCnd_on_non_calc_flg_NC(info);
		else if (nc == Hdr_calc_ctg_cd) doHdr_calc_ctg_cd_NC(info);
		else if (nc == Hdr_calc_ctg_nm) doHdr_calc_ctg_nm_NC(info);
		else if (nc == Hdr_wg_cd) doHdr_wg_cd_NC(info);
		else if (nc == Hdr_wg_nm) doHdr_wg_nm_NC(info);
		else if (nc == Hdr_par_unit_cd) doHdr_par_unit_cd_NC(info);
		else if (nc == Hdr_par_unit_nm) doHdr_par_unit_nm_NC(info);
		else if (nc == Hdr_par_dec_place) doHdr_par_dec_place_NC(info);
		else if (nc == Hdr_par_cost_std_qty) doHdr_par_cost_std_qty_NC(info);
		else if (nc == Hdr_bom_ptn) doHdr_bom_ptn_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_oper_cd) doRslt_oper_cd_NC(info);
		else if (nc == columnRslt_oper_nm) doRslt_oper_nm_NC(info);
		else if (nc == columnRslt_oper_seq) doRslt_oper_seq_NC(info);
		else if (nc == columnRslt_disp_seq) doRslt_disp_seq_NC(info);
		else if (nc == columnRslt_chd_itm_typ) doRslt_chd_itm_typ_NC(info);
		else if (nc == columnRslt_chd_itm_typ_nm) doRslt_chd_itm_typ_nm_NC(info);
		else if (nc == columnRslt_chd_itm_typ_d_cd) doRslt_chd_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_chd_itm_typ_d_nm) doRslt_chd_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_par_unit_cd) doRslt_par_unit_cd_NC(info);
		else if (nc == columnRslt_par_unit_nm) doRslt_par_unit_nm_NC(info);
		else if (nc == columnRslt_chd_unit_cd) doRslt_chd_unit_cd_NC(info);
		else if (nc == columnRslt_chd_unit_nm) doRslt_chd_unit_nm_NC(info);
		else if (nc == columnRslt_chd_dec_place) doRslt_chd_dec_place_NC(info);
		else if (nc == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_NC(info);
		else if (nc == columnRslt_alt_itm_ratio) doRslt_alt_itm_ratio_NC(info);
		else if (nc == columnRslt_expns_cd) doRslt_expns_cd_NC(info);
		else if (nc == columnRslt_expns_nm) doRslt_expns_nm_NC(info);
		else if (nc == columnRslt_rmrks) doRslt_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_non_calc_flg) doRslt_non_calc_flg_NC(info);
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
	 * [Cnd]パネルの[cmn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_non_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_non_calc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_non_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_non_calc_flg_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[par_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_cost_std_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_cost_std_qty_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_ratio_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[non_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_non_calc_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_cmn_flg) doCnd_cmn_flg_NE(info);
		else if (ne == Cnd_wg_flg) doCnd_wg_flg_NE(info);
		else if (ne == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NE(info);
		else if (ne == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_bom_ptn) doCnd_bom_ptn_NE(info);
		else if (ne == Cnd_off_non_calc_flg) doCnd_off_non_calc_flg_NE(info);
		else if (ne == Cnd_on_non_calc_flg) doCnd_on_non_calc_flg_NE(info);
		else if (ne == Hdr_calc_ctg_cd) doHdr_calc_ctg_cd_NE(info);
		else if (ne == Hdr_calc_ctg_nm) doHdr_calc_ctg_nm_NE(info);
		else if (ne == Hdr_wg_cd) doHdr_wg_cd_NE(info);
		else if (ne == Hdr_wg_nm) doHdr_wg_nm_NE(info);
		else if (ne == Hdr_par_unit_cd) doHdr_par_unit_cd_NE(info);
		else if (ne == Hdr_par_unit_nm) doHdr_par_unit_nm_NE(info);
		else if (ne == Hdr_par_dec_place) doHdr_par_dec_place_NE(info);
		else if (ne == Hdr_par_cost_std_qty) doHdr_par_cost_std_qty_NE(info);
		else if (ne == Hdr_bom_ptn) doHdr_bom_ptn_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_oper_cd) doRslt_oper_cd_NE(info);
		else if (ne == columnRslt_oper_nm) doRslt_oper_nm_NE(info);
		else if (ne == columnRslt_oper_seq) doRslt_oper_seq_NE(info);
		else if (ne == columnRslt_disp_seq) doRslt_disp_seq_NE(info);
		else if (ne == columnRslt_chd_itm_typ) doRslt_chd_itm_typ_NE(info);
		else if (ne == columnRslt_chd_itm_typ_nm) doRslt_chd_itm_typ_nm_NE(info);
		else if (ne == columnRslt_chd_itm_typ_d_cd) doRslt_chd_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_chd_itm_typ_d_nm) doRslt_chd_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_par_unit_cd) doRslt_par_unit_cd_NE(info);
		else if (ne == columnRslt_par_unit_nm) doRslt_par_unit_nm_NE(info);
		else if (ne == columnRslt_chd_unit_cd) doRslt_chd_unit_cd_NE(info);
		else if (ne == columnRslt_chd_unit_nm) doRslt_chd_unit_nm_NE(info);
		else if (ne == columnRslt_chd_dec_place) doRslt_chd_dec_place_NE(info);
		else if (ne == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_NE(info);
		else if (ne == columnRslt_alt_itm_ratio) doRslt_alt_itm_ratio_NE(info);
		else if (ne == columnRslt_expns_cd) doRslt_expns_cd_NE(info);
		else if (ne == columnRslt_expns_nm) doRslt_expns_nm_NE(info);
		else if (ne == columnRslt_rmrks) doRslt_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_non_calc_flg) doRslt_non_calc_flg_NE(info);
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
	 * [Cnd]パネルの[cmn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_non_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_non_calc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_non_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_non_calc_flg_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[par_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_cost_std_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_cost_std_qty_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_ratio_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[non_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_non_calc_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_cmn_flg) doCnd_cmn_flg_NX(info);
		else if (nx == Cnd_wg_flg) doCnd_wg_flg_NX(info);
		else if (nx == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NX(info);
		else if (nx == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_bom_ptn) doCnd_bom_ptn_NX(info);
		else if (nx == Cnd_off_non_calc_flg) doCnd_off_non_calc_flg_NX(info);
		else if (nx == Cnd_on_non_calc_flg) doCnd_on_non_calc_flg_NX(info);
		else if (nx == Hdr_calc_ctg_cd) doHdr_calc_ctg_cd_NX(info);
		else if (nx == Hdr_calc_ctg_nm) doHdr_calc_ctg_nm_NX(info);
		else if (nx == Hdr_wg_cd) doHdr_wg_cd_NX(info);
		else if (nx == Hdr_wg_nm) doHdr_wg_nm_NX(info);
		else if (nx == Hdr_par_unit_cd) doHdr_par_unit_cd_NX(info);
		else if (nx == Hdr_par_unit_nm) doHdr_par_unit_nm_NX(info);
		else if (nx == Hdr_par_dec_place) doHdr_par_dec_place_NX(info);
		else if (nx == Hdr_par_cost_std_qty) doHdr_par_cost_std_qty_NX(info);
		else if (nx == Hdr_bom_ptn) doHdr_bom_ptn_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_oper_cd) doRslt_oper_cd_NX(info);
		else if (nx == columnRslt_oper_nm) doRslt_oper_nm_NX(info);
		else if (nx == columnRslt_oper_seq) doRslt_oper_seq_NX(info);
		else if (nx == columnRslt_disp_seq) doRslt_disp_seq_NX(info);
		else if (nx == columnRslt_chd_itm_typ) doRslt_chd_itm_typ_NX(info);
		else if (nx == columnRslt_chd_itm_typ_nm) doRslt_chd_itm_typ_nm_NX(info);
		else if (nx == columnRslt_chd_itm_typ_d_cd) doRslt_chd_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_chd_itm_typ_d_nm) doRslt_chd_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_par_unit_cd) doRslt_par_unit_cd_NX(info);
		else if (nx == columnRslt_par_unit_nm) doRslt_par_unit_nm_NX(info);
		else if (nx == columnRslt_chd_unit_cd) doRslt_chd_unit_cd_NX(info);
		else if (nx == columnRslt_chd_unit_nm) doRslt_chd_unit_nm_NX(info);
		else if (nx == columnRslt_chd_dec_place) doRslt_chd_dec_place_NX(info);
		else if (nx == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_NX(info);
		else if (nx == columnRslt_alt_itm_ratio) doRslt_alt_itm_ratio_NX(info);
		else if (nx == columnRslt_expns_cd) doRslt_expns_cd_NX(info);
		else if (nx == columnRslt_expns_nm) doRslt_expns_nm_NX(info);
		else if (nx == columnRslt_rmrks) doRslt_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_non_calc_flg) doRslt_non_calc_flg_NX(info);
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
	 * [Cnd]パネルの[cmn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_non_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_non_calc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_non_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_non_calc_flg_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[par_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_cost_std_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_cost_std_qty_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_ratio_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[non_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_non_calc_flg_NX(MCEventInfo info){
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
		if (lc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_LC(info);
		else if (lc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_bom_ptn) doCnd_bom_ptn_LC(info);
		else if (lc == Hdr_calc_ctg_cd) doHdr_calc_ctg_cd_LC(info);
		else if (lc == Hdr_calc_ctg_nm) doHdr_calc_ctg_nm_LC(info);
		else if (lc == Hdr_wg_cd) doHdr_wg_cd_LC(info);
		else if (lc == Hdr_wg_nm) doHdr_wg_nm_LC(info);
		else if (lc == Hdr_par_unit_cd) doHdr_par_unit_cd_LC(info);
		else if (lc == Hdr_par_unit_nm) doHdr_par_unit_nm_LC(info);
		else if (lc == Hdr_par_dec_place) doHdr_par_dec_place_LC(info);
		else if (lc == Hdr_par_cost_std_qty) doHdr_par_cost_std_qty_LC(info);
		else if (lc == Hdr_bom_ptn) doHdr_bom_ptn_LC(info);
		else if (lc == columnRslt_oper_cd) doRslt_oper_cd_LC(info);
		else if (lc == columnRslt_oper_nm) doRslt_oper_nm_LC(info);
		else if (lc == columnRslt_oper_seq) doRslt_oper_seq_LC(info);
		else if (lc == columnRslt_disp_seq) doRslt_disp_seq_LC(info);
		else if (lc == columnRslt_chd_itm_typ) doRslt_chd_itm_typ_LC(info);
		else if (lc == columnRslt_chd_itm_typ_nm) doRslt_chd_itm_typ_nm_LC(info);
		else if (lc == columnRslt_chd_itm_typ_d_cd) doRslt_chd_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_chd_itm_typ_d_nm) doRslt_chd_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_par_unit_cd) doRslt_par_unit_cd_LC(info);
		else if (lc == columnRslt_par_unit_nm) doRslt_par_unit_nm_LC(info);
		else if (lc == columnRslt_chd_unit_cd) doRslt_chd_unit_cd_LC(info);
		else if (lc == columnRslt_chd_unit_nm) doRslt_chd_unit_nm_LC(info);
		else if (lc == columnRslt_chd_dec_place) doRslt_chd_dec_place_LC(info);
		else if (lc == columnRslt_alt_grp_cd) doRslt_alt_grp_cd_LC(info);
		else if (lc == columnRslt_alt_itm_ratio) doRslt_alt_itm_ratio_LC(info);
		else if (lc == columnRslt_expns_cd) doRslt_expns_cd_LC(info);
		else if (lc == columnRslt_expns_nm) doRslt_expns_nm_LC(info);
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
	 * [Cnd]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[par_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[par_cost_std_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_par_cost_std_qty_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bom_ptn_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[oper_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[chd_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_chd_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alt_itm_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alt_itm_ratio_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_expns_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bom_ptn]の作成メソッド
	 */
	public MCList getCnd_bom_ptn(MCRow row, MCEventInfo info){
		return ((mcframe.clientMGUA.MGUAP0010.MGUAP_List)MCListLogic.create("mcframe.clientMGUA.MGUAP0010.MGUAP_List", this)).getBomPtn(row, info);
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
	 * コンボ／リストのリスト[Hdr_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getHdr_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getHdr_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getHdr_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getHdr_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_oper_cd]の作成メソッド
	 */
	public MCList getRslt_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
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
	 * コンボ／リストのリスト[columnRslt_expns_cd]の作成メソッド
	 */
	public MCList getRslt_expns_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpns(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBDL0520.Srch01")) {
			return new MG_MGBDL0520_Srch01Bridge();
		}
		if (id.equals("MG.MGBDL0520.Upd01")) {
			return new MG_MGBDL0520_Upd01Bridge();
		}
		if (id.equals("MG.MGBDL0520.Del01")) {
			return new MG_MGBDL0520_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBDL0520_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0520_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0520_Srch01;

		/** コンストラクタ */
		protected MG_MGBDL0520_Srch01Bridge() {
			p_MG_MGBDL0520_Srch01 = new MCParam(PDef.MG_MGBDL0520_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0520_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0520.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0520.RsltR.class));

			p_MG_MGBDL0520_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0520_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0520_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0520_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0520_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0520.CndR up0() {
			return (mcframe.clientMGBD.MGBDP0520.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0520.RsltR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0520.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0520_Srch01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0520.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0520_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBD.MGBDP0520.RsltR>)p_MG_MGBDL0520_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MG_MGBDL0520_Upd01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0520_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0520_Upd01;

		/** コンストラクタ */
		protected MG_MGBDL0520_Upd01Bridge() {
			p_MG_MGBDL0520_Upd01 = new MCParam(PDef.MG_MGBDL0520_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0520_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0520.RsltR.class));
			param.addUpBlock(mcframe.clientMGBD.MGBDP0520.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0520.RsltR.class));

			p_MG_MGBDL0520_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0520_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0520_Upd01.addUpBlock(getRsltL().shallowClone());
			p_MG_MGBDL0520_Upd01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0520_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0520_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBD.MGBDP0520.RsltR> up0() {
			return (MCList<mcframe.clientMGBD.MGBDP0520.RsltR>)up(0);
		}
		protected mcframe.clientMGBD.MGBDP0520.CndR up1() {
			return (mcframe.clientMGBD.MGBDP0520.CndR)up(1);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0520.RsltR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0520.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0520_Upd01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0520.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0520_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBD.MGBDP0520.RsltR>)p_MG_MGBDL0520_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
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
	 * [MG_MGBDL0520_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0520_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0520_Del01;

		/** コンストラクタ */
		protected MG_MGBDL0520_Del01Bridge() {
			p_MG_MGBDL0520_Del01 = new MCParam(PDef.MG_MGBDL0520_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0520_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0520.RsltR.class));
			param.addUpBlock(mcframe.clientMGBD.MGBDP0520.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0520.RsltR.class));

			p_MG_MGBDL0520_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0520_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0520_Del01.addUpBlock(getRsltL().shallowClone());
			p_MG_MGBDL0520_Del01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0520_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0520_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBD.MGBDP0520.RsltR> up0() {
			return (MCList<mcframe.clientMGBD.MGBDP0520.RsltR>)up(0);
		}
		protected mcframe.clientMGBD.MGBDP0520.CndR up1() {
			return (mcframe.clientMGBD.MGBDP0520.CndR)up(1);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0520.RsltR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0520.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0520_Del01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0520.RsltR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0520_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMGBD.MGBDP0520.RsltR>)p_MG_MGBDL0520_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}