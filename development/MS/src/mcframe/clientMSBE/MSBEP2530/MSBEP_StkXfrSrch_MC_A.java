package mcframe.clientMSBE.MSBEP2530;

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
import mcframe.clientMSBE.MSBEP2530.MSBEP_StkXfrSrch_MC.MS_MSBEL2530_Srch01Caller;
import mcframe.clientMSBE.MSBEP2530.MSBEP_StkXfrSrch_MC.MS_MSBEL2530_Prnt01Caller;

/**
 * 画面"MSBEP_StkXfrSrch"パネルクラスです。<p>
 *
 * 在庫振替実績を照会する画面<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_StkXfrSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBEP2530";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCTabbedPane FoldTab = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	public MCTitledBorder Cnd2TitledBorder = null;
	// [Cnd2]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	public MCLabel Cnd_trd_cd_Label = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCTextField Cnd_trd_nm = null;
	public MCLabel Cnd_wg_cd_Label = null;
	/**
	 * WG ＷＧ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_cd = null;
	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public MCTextField Cnd_wg_nm = null;
	public MCLabel Cnd_stk_xfr_act_no_Label = null;
	/**
	 * Inventory transfer result No. 在庫振替実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_stk_xfr_act_no = null;
	public MCLabel Cnd_loc_cd_Label = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCTextField Cnd_loc_nm = null;
	public MCLabel Cnd_str_ln_cd_Label = null;
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_str_ln_cd = null;
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public MCTextField Cnd_str_ln_nm = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_nm;	// [Cnd]の[itm_typ_p.itm_typ_nm]を[Cnd_itm_typ_nm]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H Cnd_ver_no_p_PPanel;
	public MCTextComboBox Cnd_ver_no;	// [Cnd]の[ver_no_p.ver_no]を[Cnd_ver_no]としてエイリアス定義。
	public MCLabel Cnd_lot_no_Label = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCTextComboBox Cnd_sublot_no = null;
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[sno_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[sno_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_ac_dt_fr_Label = null;
	/**
	 * Transfer recording date 振替計上日.<p>
	 *
	 */
	public MCDateField Cnd_ac_dt_fr = null;
	public MCLabel Cnd_ac_dt_to_Label = null;
	/**
	 * - ～.<p>
	 *
	 */
	public MCDateField Cnd_ac_dt_to = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_xfr_act_dt_p_PPanel;
	public MCDateField Cnd_xfr_act_dt_fr;	// [Cnd]の[xfr_act_dt_p.ymd_fr]を[Cnd_xfr_act_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_xfr_act_hm_fr;	// [Cnd]の[xfr_act_dt_p.hm_fr]を[Cnd_xfr_act_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_xfr_act_dt_to;	// [Cnd]の[xfr_act_dt_p.ymd_to]を[Cnd_xfr_act_dt_to]としてエイリアス定義。
	public MCDateField Cnd_xfr_act_hm_to;	// [Cnd]の[xfr_act_dt_p.hm_to]を[Cnd_xfr_act_hm_to]としてエイリアス定義。
	public MCLabel Cnd_act_usr_cd_Label = null;
	/**
	 * Implementation PIC cd. 実施担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_act_usr_cd = null;
	/**
	 * Implementation PC name 実施担当者名.<p>
	 *
	 */
	public MCTextField Cnd_act_usr_nm = null;
	public MCLabel Cnd_act_dpt_cd_Label = null;
	/**
	 * Implement dept. cd. 実施部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_act_dpt_cd = null;
	/**
	 * Implement dept. name 実施部門名.<p>
	 *
	 */
	public MCTextField Cnd_act_dpt_nm = null;
	public MCLabel Cnd_stk_xfr_rsn_cd_Label = null;
	/**
	 * Reason 理由.<p>
	 *
	 */
	public MCTextComboBox Cnd_stk_xfr_rsn_cd = null;
	public MCTextField Cnd_stk_xfr_rsn_nm = null;
	public MCLabel Cnd_intr_rmrks_Label = null;
	/**
	 * Internal remarks (Header) 内部備考（ヘッダ）.<p>
	 *
	 */
	public MCTextField Cnd_intr_rmrks = null;
	public MCLabel Cnd_trd_rmrks_Label = null;
	/**
	 * Transaction remarks (Header) 取引備考（ヘッダ）.<p>
	 *
	 */
	public MCTextField Cnd_trd_rmrks = null;
	public MCLabel Cnd_sub_char1_Label = null;
	/**
	 * Spare 1 (Header) 予備１（ヘッダ）.<p>
	 *
	 */
	public MCTextField Cnd_sub_char1 = null;
	public MCLabel Cnd_sub_char2_Label = null;
	/**
	 * Spare 2 (Header) 予備２（ヘッダ）.<p>
	 *
	 */
	public MCTextField Cnd_sub_char2 = null;
	public MCLabel Cnd_sub_char3_Label = null;
	/**
	 * Spare 3 (Header) 予備３（ヘッダ）.<p>
	 *
	 */
	public MCTextField Cnd_sub_char3 = null;
	public MCLabel Cnd_intr_d_rmrks_Label = null;
	/**
	 * Internal remarks (Details) 内部備考（明細）.<p>
	 *
	 */
	public MCTextField Cnd_intr_d_rmrks = null;
	public MCLabel Cnd_trd_d_rmrks_Label = null;
	/**
	 * Transaction remarks (Details) 取引備考（明細）.<p>
	 *
	 */
	public MCTextField Cnd_trd_d_rmrks = null;
	public MCLabel Cnd_sub_d_char1_Label = null;
	/**
	 * Spare 1 (Details) 予備１（明細）.<p>
	 *
	 */
	public MCTextField Cnd_sub_d_char1 = null;
	public MCLabel Cnd_sub_d_char2_Label = null;
	/**
	 * Spare 2 (Details) 予備２（明細）.<p>
	 *
	 */
	public MCTextField Cnd_sub_d_char2 = null;
	public MCLabel Cnd_sub_d_char3_Label = null;
	/**
	 * Spare 3 (Details) 予備３（明細）.<p>
	 *
	 */
	public MCTextField Cnd_sub_d_char3 = null;
	public mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S Cnd_itm_grp_p_PPanel;
	public MCCheckBox Cnd_itm_grp_flg1;	// [Cnd]の[itm_grp_p.itm_grp_flg1]を[Cnd_itm_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd1;	// [Cnd]の[itm_grp_p.itm_grp_cd1]を[Cnd_itm_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm1;	// [Cnd]の[itm_grp_p.itm_grp_nm1]を[Cnd_itm_grp_nm1]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg2;	// [Cnd]の[itm_grp_p.itm_grp_flg2]を[Cnd_itm_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd2;	// [Cnd]の[itm_grp_p.itm_grp_cd2]を[Cnd_itm_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm2;	// [Cnd]の[itm_grp_p.itm_grp_nm2]を[Cnd_itm_grp_nm2]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg3;	// [Cnd]の[itm_grp_p.itm_grp_flg3]を[Cnd_itm_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd3;	// [Cnd]の[itm_grp_p.itm_grp_cd3]を[Cnd_itm_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm3;	// [Cnd]の[itm_grp_p.itm_grp_nm3]を[Cnd_itm_grp_nm3]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg4;	// [Cnd]の[itm_grp_p.itm_grp_flg4]を[Cnd_itm_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd4;	// [Cnd]の[itm_grp_p.itm_grp_cd4]を[Cnd_itm_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm4;	// [Cnd]の[itm_grp_p.itm_grp_nm4]を[Cnd_itm_grp_nm4]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg5;	// [Cnd]の[itm_grp_p.itm_grp_flg5]を[Cnd_itm_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd5;	// [Cnd]の[itm_grp_p.itm_grp_cd5]を[Cnd_itm_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm5;	// [Cnd]の[itm_grp_p.itm_grp_nm5]を[Cnd_itm_grp_nm5]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg6;	// [Cnd]の[itm_grp_p.itm_grp_flg6]を[Cnd_itm_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd6;	// [Cnd]の[itm_grp_p.itm_grp_cd6]を[Cnd_itm_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm6;	// [Cnd]の[itm_grp_p.itm_grp_nm6]を[Cnd_itm_grp_nm6]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg7;	// [Cnd]の[itm_grp_p.itm_grp_flg7]を[Cnd_itm_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd7;	// [Cnd]の[itm_grp_p.itm_grp_cd7]を[Cnd_itm_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm7;	// [Cnd]の[itm_grp_p.itm_grp_nm7]を[Cnd_itm_grp_nm7]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg8;	// [Cnd]の[itm_grp_p.itm_grp_flg8]を[Cnd_itm_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd8;	// [Cnd]の[itm_grp_p.itm_grp_cd8]を[Cnd_itm_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm8;	// [Cnd]の[itm_grp_p.itm_grp_nm8]を[Cnd_itm_grp_nm8]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg9;	// [Cnd]の[itm_grp_p.itm_grp_flg9]を[Cnd_itm_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd9;	// [Cnd]の[itm_grp_p.itm_grp_cd9]を[Cnd_itm_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm9;	// [Cnd]の[itm_grp_p.itm_grp_nm9]を[Cnd_itm_grp_nm9]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg10;	// [Cnd]の[itm_grp_p.itm_grp_flg10]を[Cnd_itm_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd10;	// [Cnd]の[itm_grp_p.itm_grp_cd10]を[Cnd_itm_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm10;	// [Cnd]の[itm_grp_p.itm_grp_nm10]を[Cnd_itm_grp_nm10]としてエイリアス定義。
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [RPnl]ブロック関連のField定義
	public MCPanel RPnlPanel = null;
	// [RPnl]ブロックの項目のField定義
	/**
	 * Download ダウンロードする.<p>
	 *
	 */
	public MCButton RPnl_dwnld = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP2530.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_nm = null;
	/**
	 * WG cd. ＷＧＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_cd = null;
	/**
	 * WG name ＷＧ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_nm = null;
	/**
	 * GR/GI type 入出庫区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_typ = null;
	/**
	 * GR/GI type name 入出庫区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ver_no = null;
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
	 * Transaction unit 取引単位.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_cd = null;
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_trd_unit_p_PPanel;
	public MCColumnConfig columnRslt_trd_unit_qty;// [Rslt]の[trd_unit_p.qty]を[columnRslt_trd_unit_qty]としてエイリアス定義。
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_dec_place = null;
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_unit_rnd_typ = null;
	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_qty;// [Rslt]の[base_unit_p.qty]を[columnRslt_base_unit_qty]としてエイリアス定義。
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_dec_place = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_rnd_typ = null;
	/**
	 * SKU 荷姿単位.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_unit_cd = null;
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_pack_unit_p_PPanel;
	public MCColumnConfig columnRslt_pack_unit_qty;// [Rslt]の[pack_unit_p.qty]を[columnRslt_pack_unit_qty]としてエイリアス定義。
	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_unit_dec_place = null;
	/**
	 * SKU rounding type 荷姿単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_unit_rnd_typ = null;
	/**
	 * Actual transfer date 振替実績日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_xfr_act_dt = null;
	/**
	 * Actual transfer time 振替実績時刻.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_xfr_act_hm = null;
	/**
	 * Transfer recording date 振替計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_dt = null;
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
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_str_ln_cd = null;
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_str_ln_nm = null;
	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public MCColumnConfig columnRslt_str_ln_cd_none_flg = null;
	/**
	 * Inventory arriving point 在庫着荷先.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_arrv_bp_cd = null;
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_arrv_bp_nm = null;
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_quality_typ_nm = null;
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_insp_typ = null;
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_insp_typ_nm = null;
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_id_typ_nm = null;
	/**
	 * Grading 格付.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gd_nm = null;
	public mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D Rslt_stk_bp_p_PPanel;
	public MCColumnConfig columnRslt_stk_bp_cd;// [Rslt]の[stk_bp_p.stk_bp_cd]を[columnRslt_stk_bp_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_stk_bp_nm;// [Rslt]の[stk_bp_p.stk_bp_nm]を[columnRslt_stk_bp_nm]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_wrk_no_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_wrk_no_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_wrk_no_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_wrk_no_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Implementation PIC 実施担当者.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_usr_cd = null;
	/**
	 * Implementation PC name 実施担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_usr_nm = null;
	/**
	 * Implementation dept. 実施部門.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_dpt_cd = null;
	/**
	 * Implement dept. name 実施部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_act_dpt_nm = null;
	/**
	 * Inventory transfer reason 在庫振替理由.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_xfr_rsn_cd = null;
	/**
	 * Inventory transfer reason name 在庫振替理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_xfr_rsn_nm = null;
	/**
	 * Internal remarks (Header) 内部備考（ヘッダ）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_intr_rmrks = null;
	/**
	 * Transaction remarks (Header) 取引備考（ヘッダ）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_rmrks = null;
	/**
	 * Spare 1 (Header) 予備１（ヘッダ）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char1 = null;
	/**
	 * Spare 2 (Header) 予備２（ヘッダ）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char2 = null;
	/**
	 * Spare 3 (Header) 予備３（ヘッダ）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char3 = null;
	/**
	 * Internal remarks (Details) 内部備考（明細）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_intr_d_rmrks = null;
	/**
	 * Transaction remarks (Details) 取引備考（明細）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_d_rmrks = null;
	/**
	 * Spare 1 (Details) 予備１（明細）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_d_char1 = null;
	/**
	 * Spare 2 (Details) 予備２（明細）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_d_char2 = null;
	/**
	 * Spare 3 (Details) 予備３（明細）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_d_char3 = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnRslt_disp_seq = null;
	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fix_no_typ = null;
	/**
	 * Firm No. type name 確定ＮＯ区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fix_no_typ_nm = null;
	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fix_no = null;
	/**
	 * Inventory transfer result No. 在庫振替実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_xfr_act_no = null;
	/**
	 * Inventory transfer result details No. 在庫振替実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_xfr_act_d_no = null;
	/**
	 * Delivery slip No. 納品伝票ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_slip_no = null;
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_d_nm = null;
	public mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D Rslt_itm_grp_p_PPanel;
	public MCColumnConfig columnRslt_itm_grp_cd1;// [Rslt]の[itm_grp_p.itm_grp_cd1]を[columnRslt_itm_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm1;// [Rslt]の[itm_grp_p.itm_grp_nm1]を[columnRslt_itm_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd2;// [Rslt]の[itm_grp_p.itm_grp_cd2]を[columnRslt_itm_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm2;// [Rslt]の[itm_grp_p.itm_grp_nm2]を[columnRslt_itm_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd3;// [Rslt]の[itm_grp_p.itm_grp_cd3]を[columnRslt_itm_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm3;// [Rslt]の[itm_grp_p.itm_grp_nm3]を[columnRslt_itm_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd4;// [Rslt]の[itm_grp_p.itm_grp_cd4]を[columnRslt_itm_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm4;// [Rslt]の[itm_grp_p.itm_grp_nm4]を[columnRslt_itm_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd5;// [Rslt]の[itm_grp_p.itm_grp_cd5]を[columnRslt_itm_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm5;// [Rslt]の[itm_grp_p.itm_grp_nm5]を[columnRslt_itm_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd6;// [Rslt]の[itm_grp_p.itm_grp_cd6]を[columnRslt_itm_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm6;// [Rslt]の[itm_grp_p.itm_grp_nm6]を[columnRslt_itm_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd7;// [Rslt]の[itm_grp_p.itm_grp_cd7]を[columnRslt_itm_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm7;// [Rslt]の[itm_grp_p.itm_grp_nm7]を[columnRslt_itm_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd8;// [Rslt]の[itm_grp_p.itm_grp_cd8]を[columnRslt_itm_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm8;// [Rslt]の[itm_grp_p.itm_grp_nm8]を[columnRslt_itm_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd9;// [Rslt]の[itm_grp_p.itm_grp_cd9]を[columnRslt_itm_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm9;// [Rslt]の[itm_grp_p.itm_grp_nm9]を[columnRslt_itm_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd10;// [Rslt]の[itm_grp_p.itm_grp_cd10]を[columnRslt_itm_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm10;// [Rslt]の[itm_grp_p.itm_grp_nm10]を[columnRslt_itm_grp_nm10]としてエイリアス定義。
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_cntr = null;
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
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Inventory transfer result 在庫振替実績.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP2520 = null;
	/**
	 * Transfer slip 振替伝票.<p>
	 *
	 */
	public MCButton Btn_prnt = null;
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
	/** [INI]モードを表す定数 */
	public static final String INI = "INI";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{INI, REF};
	
	/** [MS_MSBEL2530_Srch01]のCallerの作成 */
	protected MSBEP_StkXfrSrch_MC.MS_MSBEL2530_Srch01Caller createMS_MSBEL2530_Srch01() {
		MSBEP_StkXfrSrch_MC.MS_MSBEL2530_Srch01Caller<MSBEP_StkXfrSrch, MS_MSBEL2530_Srch01Bridge>
		caller = ((MSBEP_StkXfrSrch_MC)this).new MS_MSBEL2530_Srch01Caller<MSBEP_StkXfrSrch, MS_MSBEL2530_Srch01Bridge>(
					(MSBEP_StkXfrSrch)this, new MS_MSBEL2530_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL2530_Srch01]の呼び出し */
	protected void callMS_MSBEL2530_Srch01() {
		MCCaller caller = createMS_MSBEL2530_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL2530_Prnt01]のCallerの作成 */
	protected MSBEP_StkXfrSrch_MC.MS_MSBEL2530_Prnt01Caller createMS_MSBEL2530_Prnt01() {
		MSBEP_StkXfrSrch_MC.MS_MSBEL2530_Prnt01Caller<MSBEP_StkXfrSrch, MS_MSBEL2530_Prnt01Bridge>
		caller = ((MSBEP_StkXfrSrch_MC)this).new MS_MSBEL2530_Prnt01Caller<MSBEP_StkXfrSrch, MS_MSBEL2530_Prnt01Bridge>(
					(MSBEP_StkXfrSrch)this, new MS_MSBEL2530_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBEL2530_Prnt01]の呼び出し */
	protected void callMS_MSBEL2530_Prnt01() {
		MCCaller caller = createMS_MSBEL2530_Prnt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP2530.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP2530.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP2530.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP2530.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP2530.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP2530.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBE.MSBEP2530.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP2530.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBE.MSBEP2530.RsltR createRsltR() {
		return mcframe.clientMSBE.MSBEP2530.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP2530.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBE.MSBEP2530.RsltR.class);
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Cnd2Panel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_StkXfrSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_StkXfrSrch_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBEP_StkXfrSrch_MC.jbCreateTop((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbCreateFold((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbCreateTab1((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbCreateTab2((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbCreateCnd2((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbCreateCnd((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbCreateCtrl((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbCreateRPnl((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbCreateRslt((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbCreateBtn((MSBEP_StkXfrSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_StkXfrSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_StkXfrSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBEP_StkXfrSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBEP_StkXfrSrch p) {
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MSBEP_StkXfrSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_StkXfrSrch p) {
		p.Cnd_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().itm_typ_p());
		p.Cnd_itm_typ_p_PPanel.setName("Cnd.itm_typ_p");
		p.Cnd_itm_typ = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_itm_typ.addAliasName("Cnd.itm_typ", p);
		p.Cnd_itm_typ_nm = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_nm;
		p.Cnd_itm_typ_nm.addAliasName("Cnd.itm_typ_nm", p);
		p.Cnd_itm_typ_d_cd = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_cd;
		p.Cnd_itm_typ_d_cd.addAliasName("Cnd.itm_typ_d_cd", p);
		p.Cnd_itm_typ_d_nm = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_nm;
		p.Cnd_itm_typ_d_nm.addAliasName("Cnd.itm_typ_d_nm", p);
		p.Cnd_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().itm_p());
		p.Cnd_itm_p_PPanel.setName("Cnd.itm_p");
		p.Cnd_itm_cd = p.Cnd_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_itm_cd.addAliasName("Cnd.itm_cd", p);
		p.Cnd_itm_sub1 = p.Cnd_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_itm_sub1.addAliasName("Cnd.itm_sub1", p);
		p.Cnd_itm_sub2 = p.Cnd_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_itm_sub2.addAliasName("Cnd.itm_sub2", p);
		p.Cnd_itm_sub3 = p.Cnd_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_itm_sub3.addAliasName("Cnd.itm_sub3", p);
		p.Cnd_itm_nm = p.Cnd_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_itm_nm.addAliasName("Cnd.itm_nm", p);
		p.Cnd_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.create(p.getCndR().ver_no_p());
		p.Cnd_ver_no_p_PPanel.setName("Cnd.ver_no_p");
		p.Cnd_ver_no = p.Cnd_ver_no_p_PPanel.VerNo_ver_no;
		p.Cnd_ver_no.addAliasName("Cnd.ver_no", p);
		p.Cnd_sno_p_PPanel = mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.create(p.getCndR().sno_p());
		p.Cnd_sno_p_PPanel.setName("Cnd.sno_p");
		p.Cnd_sno1 = p.Cnd_sno_p_PPanel.SnoWrkNo_sno1;
		p.Cnd_sno1.addAliasName("Cnd.sno1", p);
		p.Cnd_sno2 = p.Cnd_sno_p_PPanel.SnoWrkNo_sno2;
		p.Cnd_sno2.addAliasName("Cnd.sno2", p);
		p.Cnd_sno3 = p.Cnd_sno_p_PPanel.SnoWrkNo_sno3;
		p.Cnd_sno3.addAliasName("Cnd.sno3", p);
		p.Cnd_sno4 = p.Cnd_sno_p_PPanel.SnoWrkNo_sno4;
		p.Cnd_sno4.addAliasName("Cnd.sno4", p);
		p.Cnd_wrk_no = p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm;
		p.Cnd_wrk_nm.addAliasName("Cnd.wrk_nm", p);
		p.Cnd_xfr_act_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().xfr_act_dt_p());
		p.Cnd_xfr_act_dt_p_PPanel.setName("Cnd.xfr_act_dt_p");
		p.Cnd_xfr_act_dt_fr = p.Cnd_xfr_act_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_xfr_act_dt_fr.addAliasName("Cnd.xfr_act_dt_fr", p);
		p.Cnd_xfr_act_hm_fr = p.Cnd_xfr_act_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_xfr_act_hm_fr.addAliasName("Cnd.xfr_act_hm_fr", p);
		p.Cnd_xfr_act_dt_to = p.Cnd_xfr_act_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_xfr_act_dt_to.addAliasName("Cnd.xfr_act_dt_to", p);
		p.Cnd_xfr_act_hm_to = p.Cnd_xfr_act_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_xfr_act_hm_to.addAliasName("Cnd.xfr_act_hm_to", p);
		p.Cnd_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.create(p.getCndR().itm_grp_p());
		p.Cnd_itm_grp_p_PPanel.setName("Cnd.itm_grp_p");
		p.Cnd_itm_grp_flg1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1;
		p.Cnd_itm_grp_flg1.addAliasName("Cnd.itm_grp_flg1", p);
		p.Cnd_itm_grp_cd1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1;
		p.Cnd_itm_grp_cd1.addAliasName("Cnd.itm_grp_cd1", p);
		p.Cnd_itm_grp_nm1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1;
		p.Cnd_itm_grp_nm1.addAliasName("Cnd.itm_grp_nm1", p);
		p.Cnd_itm_grp_flg2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2;
		p.Cnd_itm_grp_flg2.addAliasName("Cnd.itm_grp_flg2", p);
		p.Cnd_itm_grp_cd2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2;
		p.Cnd_itm_grp_cd2.addAliasName("Cnd.itm_grp_cd2", p);
		p.Cnd_itm_grp_nm2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2;
		p.Cnd_itm_grp_nm2.addAliasName("Cnd.itm_grp_nm2", p);
		p.Cnd_itm_grp_flg3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3;
		p.Cnd_itm_grp_flg3.addAliasName("Cnd.itm_grp_flg3", p);
		p.Cnd_itm_grp_cd3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3;
		p.Cnd_itm_grp_cd3.addAliasName("Cnd.itm_grp_cd3", p);
		p.Cnd_itm_grp_nm3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3;
		p.Cnd_itm_grp_nm3.addAliasName("Cnd.itm_grp_nm3", p);
		p.Cnd_itm_grp_flg4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4;
		p.Cnd_itm_grp_flg4.addAliasName("Cnd.itm_grp_flg4", p);
		p.Cnd_itm_grp_cd4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4;
		p.Cnd_itm_grp_cd4.addAliasName("Cnd.itm_grp_cd4", p);
		p.Cnd_itm_grp_nm4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4;
		p.Cnd_itm_grp_nm4.addAliasName("Cnd.itm_grp_nm4", p);
		p.Cnd_itm_grp_flg5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5;
		p.Cnd_itm_grp_flg5.addAliasName("Cnd.itm_grp_flg5", p);
		p.Cnd_itm_grp_cd5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5;
		p.Cnd_itm_grp_cd5.addAliasName("Cnd.itm_grp_cd5", p);
		p.Cnd_itm_grp_nm5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5;
		p.Cnd_itm_grp_nm5.addAliasName("Cnd.itm_grp_nm5", p);
		p.Cnd_itm_grp_flg6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6;
		p.Cnd_itm_grp_flg6.addAliasName("Cnd.itm_grp_flg6", p);
		p.Cnd_itm_grp_cd6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6;
		p.Cnd_itm_grp_cd6.addAliasName("Cnd.itm_grp_cd6", p);
		p.Cnd_itm_grp_nm6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6;
		p.Cnd_itm_grp_nm6.addAliasName("Cnd.itm_grp_nm6", p);
		p.Cnd_itm_grp_flg7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7;
		p.Cnd_itm_grp_flg7.addAliasName("Cnd.itm_grp_flg7", p);
		p.Cnd_itm_grp_cd7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7;
		p.Cnd_itm_grp_cd7.addAliasName("Cnd.itm_grp_cd7", p);
		p.Cnd_itm_grp_nm7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7;
		p.Cnd_itm_grp_nm7.addAliasName("Cnd.itm_grp_nm7", p);
		p.Cnd_itm_grp_flg8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8;
		p.Cnd_itm_grp_flg8.addAliasName("Cnd.itm_grp_flg8", p);
		p.Cnd_itm_grp_cd8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8;
		p.Cnd_itm_grp_cd8.addAliasName("Cnd.itm_grp_cd8", p);
		p.Cnd_itm_grp_nm8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8;
		p.Cnd_itm_grp_nm8.addAliasName("Cnd.itm_grp_nm8", p);
		p.Cnd_itm_grp_flg9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9;
		p.Cnd_itm_grp_flg9.addAliasName("Cnd.itm_grp_flg9", p);
		p.Cnd_itm_grp_cd9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9;
		p.Cnd_itm_grp_cd9.addAliasName("Cnd.itm_grp_cd9", p);
		p.Cnd_itm_grp_nm9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9;
		p.Cnd_itm_grp_nm9.addAliasName("Cnd.itm_grp_nm9", p);
		p.Cnd_itm_grp_flg10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10;
		p.Cnd_itm_grp_flg10.addAliasName("Cnd.itm_grp_flg10", p);
		p.Cnd_itm_grp_cd10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10;
		p.Cnd_itm_grp_cd10.addAliasName("Cnd.itm_grp_cd10", p);
		p.Cnd_itm_grp_nm10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10;
		p.Cnd_itm_grp_nm10.addAliasName("Cnd.itm_grp_nm10", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBEP_StkXfrSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBEP_StkXfrSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBEP_StkXfrSrch p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP2530.RsltR.$itm_p);
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
		p.Rslt_trd_unit_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2530.RsltR.$trd_unit_p);
		p.Rslt_trd_unit_p_PPanel.setName("Rslt.trd_unit_p");
		p.columnRslt_trd_unit_qty = p.Rslt_trd_unit_p_PPanel.columnQty_qty;
		p.columnRslt_trd_unit_qty.addAliasName("Rslt.trd_unit_qty", p);
		p.Rslt_base_unit_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2530.RsltR.$base_unit_p);
		p.Rslt_base_unit_p_PPanel.setName("Rslt.base_unit_p");
		p.columnRslt_base_unit_qty = p.Rslt_base_unit_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_qty.addAliasName("Rslt.base_unit_qty", p);
		p.Rslt_pack_unit_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP2530.RsltR.$pack_unit_p);
		p.Rslt_pack_unit_p_PPanel.setName("Rslt.pack_unit_p");
		p.columnRslt_pack_unit_qty = p.Rslt_pack_unit_p_PPanel.columnQty_qty;
		p.columnRslt_pack_unit_qty.addAliasName("Rslt.pack_unit_qty", p);
		p.Rslt_stk_bp_p_PPanel = mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.create(mcframe.clientMSBE.MSBEP2530.RsltR.$stk_bp_p);
		p.Rslt_stk_bp_p_PPanel.setName("Rslt.stk_bp_p");
		p.columnRslt_stk_bp_cd = p.Rslt_stk_bp_p_PPanel.columnStkBp_stk_bp_cd;
		p.columnRslt_stk_bp_cd.addAliasName("Rslt.stk_bp_cd", p);
		p.columnRslt_stk_bp_nm = p.Rslt_stk_bp_p_PPanel.columnStkBp_stk_bp_nm;
		p.columnRslt_stk_bp_nm.addAliasName("Rslt.stk_bp_nm", p);
		p.Rslt_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP2530.RsltR.$sno_wrk_no_p);
		p.Rslt_sno_wrk_no_p_PPanel.setName("Rslt.sno_wrk_no_p");
		p.columnRslt_sno1 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt_sno1.addAliasName("Rslt.sno1", p);
		p.columnRslt_sno2 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt_sno2.addAliasName("Rslt.sno2", p);
		p.columnRslt_sno3 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt_sno3.addAliasName("Rslt.sno3", p);
		p.columnRslt_sno4 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt_sno4.addAliasName("Rslt.sno4", p);
		p.columnRslt_wrk_no = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBE.MSBEP2530.RsltR.$itm_grp_p);
		p.Rslt_itm_grp_p_PPanel.setName("Rslt.itm_grp_p");
		p.columnRslt_itm_grp_cd1 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd1;
		p.columnRslt_itm_grp_cd1.addAliasName("Rslt.itm_grp_cd1", p);
		p.columnRslt_itm_grp_nm1 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm1;
		p.columnRslt_itm_grp_nm1.addAliasName("Rslt.itm_grp_nm1", p);
		p.columnRslt_itm_grp_cd2 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd2;
		p.columnRslt_itm_grp_cd2.addAliasName("Rslt.itm_grp_cd2", p);
		p.columnRslt_itm_grp_nm2 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm2;
		p.columnRslt_itm_grp_nm2.addAliasName("Rslt.itm_grp_nm2", p);
		p.columnRslt_itm_grp_cd3 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd3;
		p.columnRslt_itm_grp_cd3.addAliasName("Rslt.itm_grp_cd3", p);
		p.columnRslt_itm_grp_nm3 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm3;
		p.columnRslt_itm_grp_nm3.addAliasName("Rslt.itm_grp_nm3", p);
		p.columnRslt_itm_grp_cd4 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd4;
		p.columnRslt_itm_grp_cd4.addAliasName("Rslt.itm_grp_cd4", p);
		p.columnRslt_itm_grp_nm4 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm4;
		p.columnRslt_itm_grp_nm4.addAliasName("Rslt.itm_grp_nm4", p);
		p.columnRslt_itm_grp_cd5 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd5;
		p.columnRslt_itm_grp_cd5.addAliasName("Rslt.itm_grp_cd5", p);
		p.columnRslt_itm_grp_nm5 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm5;
		p.columnRslt_itm_grp_nm5.addAliasName("Rslt.itm_grp_nm5", p);
		p.columnRslt_itm_grp_cd6 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd6;
		p.columnRslt_itm_grp_cd6.addAliasName("Rslt.itm_grp_cd6", p);
		p.columnRslt_itm_grp_nm6 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm6;
		p.columnRslt_itm_grp_nm6.addAliasName("Rslt.itm_grp_nm6", p);
		p.columnRslt_itm_grp_cd7 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd7;
		p.columnRslt_itm_grp_cd7.addAliasName("Rslt.itm_grp_cd7", p);
		p.columnRslt_itm_grp_nm7 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm7;
		p.columnRslt_itm_grp_nm7.addAliasName("Rslt.itm_grp_nm7", p);
		p.columnRslt_itm_grp_cd8 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd8;
		p.columnRslt_itm_grp_cd8.addAliasName("Rslt.itm_grp_cd8", p);
		p.columnRslt_itm_grp_nm8 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm8;
		p.columnRslt_itm_grp_nm8.addAliasName("Rslt.itm_grp_nm8", p);
		p.columnRslt_itm_grp_cd9 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd9;
		p.columnRslt_itm_grp_cd9.addAliasName("Rslt.itm_grp_cd9", p);
		p.columnRslt_itm_grp_nm9 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm9;
		p.columnRslt_itm_grp_nm9.addAliasName("Rslt.itm_grp_nm9", p);
		p.columnRslt_itm_grp_cd10 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd10;
		p.columnRslt_itm_grp_cd10.addAliasName("Rslt.itm_grp_cd10", p);
		p.columnRslt_itm_grp_nm10 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm10;
		p.columnRslt_itm_grp_nm10.addAliasName("Rslt.itm_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_StkXfrSrch p) {
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

	
	/** [Cnd_trd_cd_ListPutter]の定義 */
	private MCListPutter Cnd_trd_cd_p = null;

	/**
	 * [Cnd_trd_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_trd_cd_ListPutter() {
		if (Cnd_trd_cd_p == null) {
			Cnd_trd_cd_p = createCnd_trd_cd_ListPutter(Cnd_trd_cd, "trd_cd", "trd_nm");

		}
		return Cnd_trd_cd_p;
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
	
	
	/** [Cnd_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_loc_cd_p = null;

	/**
	 * [Cnd_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_loc_cd_ListPutter() {
		if (Cnd_loc_cd_p == null) {
			Cnd_loc_cd_p = createCnd_loc_cd_ListPutter(Cnd_loc_cd, "loc_cd", "loc_nm");

		}
		return Cnd_loc_cd_p;
	}
	
	
	/** [Cnd_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Cnd_str_ln_cd_p = null;

	/**
	 * [Cnd_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_str_ln_cd_ListPutter() {
		if (Cnd_str_ln_cd_p == null) {
			Cnd_str_ln_cd_p = createCnd_str_ln_cd_ListPutter(Cnd_str_ln_cd, "str_ln_cd", "str_ln_nm");

		}
		return Cnd_str_ln_cd_p;
	}
	
	
	/** [Cnd_lot_no_ListPutter]の定義 */
	private MCListPutter Cnd_lot_no_p = null;

	/**
	 * [Cnd_lot_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_lot_no_ListPutter() {
		if (Cnd_lot_no_p == null) {
			Cnd_lot_no_p = createCnd_lot_no_ListPutter(Cnd_lot_no, "lot_no");

		}
		return Cnd_lot_no_p;
	}
	
	
	/** [Cnd_sublot_no_ListPutter]の定義 */
	private MCListPutter Cnd_sublot_no_p = null;

	/**
	 * [Cnd_sublot_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sublot_no_ListPutter() {
		if (Cnd_sublot_no_p == null) {
			Cnd_sublot_no_p = createCnd_sublot_no_ListPutter(Cnd_sublot_no, "sublot_no");

		}
		return Cnd_sublot_no_p;
	}
	
	
	/** [Cnd_act_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_act_usr_cd_p = null;

	/**
	 * [Cnd_act_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_act_usr_cd_ListPutter() {
		if (Cnd_act_usr_cd_p == null) {
			Cnd_act_usr_cd_p = createCnd_act_usr_cd_ListPutter(Cnd_act_usr_cd, "act_usr_cd", "act_usr_nm");

		}
		return Cnd_act_usr_cd_p;
	}
	
	
	/** [Cnd_act_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_act_dpt_cd_p = null;

	/**
	 * [Cnd_act_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_act_dpt_cd_ListPutter() {
		if (Cnd_act_dpt_cd_p == null) {
			Cnd_act_dpt_cd_p = createCnd_act_dpt_cd_ListPutter(Cnd_act_dpt_cd, "act_dpt_cd", "act_dpt_nm");

		}
		return Cnd_act_dpt_cd_p;
	}
	
	
	/** [Cnd_stk_xfr_rsn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_stk_xfr_rsn_cd_p = null;

	/**
	 * [Cnd_stk_xfr_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_stk_xfr_rsn_cd_ListPutter() {
		if (Cnd_stk_xfr_rsn_cd_p == null) {
			Cnd_stk_xfr_rsn_cd_p = createCnd_stk_xfr_rsn_cd_ListPutter(Cnd_stk_xfr_rsn_cd, "stk_xfr_rsn_cd", "stk_xfr_rsn_nm");

		}
		return Cnd_stk_xfr_rsn_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_StkXfrSrch create(){
		MSBEP_StkXfrSrch p = new MSBEP_StkXfrSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_StkXfrSrch create(String name){
		MSBEP_StkXfrSrch p = new MSBEP_StkXfrSrch(name);
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
		MSBEP_StkXfrSrch_MC.jbfInitTop((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbfInitFold((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbfInitTab1((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbfInitTab2((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbfInitCnd2((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbfInitCnd((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbfInitCtrl((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbfInitRPnl((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbfInitRslt((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbfInitBtn((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbInitTop((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbInitFold((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbInitTab1((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbInitTab2((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbInitCnd2((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbInitCnd((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbInitCtrl((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbInitRPnl((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbInitRslt((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.jbInitBtn((MSBEP_StkXfrSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_StkXfrSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_StkXfrSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldTab = p.beansFactory.createTabbedPane("Fold.tab");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MSBEP_StkXfrSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBEP_StkXfrSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBEP_StkXfrSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		p.Cnd2TitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_StkXfrSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_trd_cd_Label = p.beansFactory.createLabel("Cnd.trd_cd_Label");
		p.Cnd_trd_cd = p.beansFactory.createTextComboBox("Cnd.trd_cd");
		p.Cnd_trd_cd.setLabel(p.Cnd_trd_cd_Label);
		p.Cnd_trd_nm = p.beansFactory.createTextField("Cnd.trd_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_stk_xfr_act_no_Label = p.beansFactory.createLabel("Cnd.stk_xfr_act_no_Label");
		p.Cnd_stk_xfr_act_no = p.beansFactory.createTextField("Cnd.stk_xfr_act_no");
		p.Cnd_stk_xfr_act_no.setLabel(p.Cnd_stk_xfr_act_no_Label);
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextField("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
		p.Cnd_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.str_ln_cd_Label");
		p.Cnd_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.str_ln_cd");
		p.Cnd_str_ln_cd.setLabel(p.Cnd_str_ln_cd_Label);
		p.Cnd_str_ln_nm = p.beansFactory.createTextField("Cnd.str_ln_nm");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextComboBox("Cnd.sublot_no");
		p.Cnd_ac_dt_fr_Label = p.beansFactory.createLabel("Cnd.ac_dt_fr_Label");
		p.Cnd_ac_dt_fr = p.beansFactory.createDateField("Cnd.ac_dt_fr");
		p.Cnd_ac_dt_fr.setLabel(p.Cnd_ac_dt_fr_Label);
		p.Cnd_ac_dt_to_Label = p.beansFactory.createLabel("Cnd.ac_dt_to_Label");
		p.Cnd_ac_dt_to = p.beansFactory.createDateField("Cnd.ac_dt_to");
		p.Cnd_ac_dt_to.setLabel(p.Cnd_ac_dt_to_Label);
		p.Cnd_act_usr_cd_Label = p.beansFactory.createLabel("Cnd.act_usr_cd_Label");
		p.Cnd_act_usr_cd = p.beansFactory.createTextField("Cnd.act_usr_cd");
		p.Cnd_act_usr_cd.setLabel(p.Cnd_act_usr_cd_Label);
		p.Cnd_act_usr_nm = p.beansFactory.createTextField("Cnd.act_usr_nm");
		p.Cnd_act_dpt_cd_Label = p.beansFactory.createLabel("Cnd.act_dpt_cd_Label");
		p.Cnd_act_dpt_cd = p.beansFactory.createTextField("Cnd.act_dpt_cd");
		p.Cnd_act_dpt_cd.setLabel(p.Cnd_act_dpt_cd_Label);
		p.Cnd_act_dpt_nm = p.beansFactory.createTextField("Cnd.act_dpt_nm");
		p.Cnd_stk_xfr_rsn_cd_Label = p.beansFactory.createLabel("Cnd.stk_xfr_rsn_cd_Label");
		p.Cnd_stk_xfr_rsn_cd = p.beansFactory.createTextComboBox("Cnd.stk_xfr_rsn_cd");
		p.Cnd_stk_xfr_rsn_cd.setLabel(p.Cnd_stk_xfr_rsn_cd_Label);
		p.Cnd_stk_xfr_rsn_nm = p.beansFactory.createTextField("Cnd.stk_xfr_rsn_nm");
		p.Cnd_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_rmrks_Label");
		p.Cnd_intr_rmrks = p.beansFactory.createTextField("Cnd.intr_rmrks");
		p.Cnd_intr_rmrks.setLabel(p.Cnd_intr_rmrks_Label);
		p.Cnd_trd_rmrks_Label = p.beansFactory.createLabel("Cnd.trd_rmrks_Label");
		p.Cnd_trd_rmrks = p.beansFactory.createTextField("Cnd.trd_rmrks");
		p.Cnd_trd_rmrks.setLabel(p.Cnd_trd_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_intr_d_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_d_rmrks_Label");
		p.Cnd_intr_d_rmrks = p.beansFactory.createTextField("Cnd.intr_d_rmrks");
		p.Cnd_intr_d_rmrks.setLabel(p.Cnd_intr_d_rmrks_Label);
		p.Cnd_trd_d_rmrks_Label = p.beansFactory.createLabel("Cnd.trd_d_rmrks_Label");
		p.Cnd_trd_d_rmrks = p.beansFactory.createTextField("Cnd.trd_d_rmrks");
		p.Cnd_trd_d_rmrks.setLabel(p.Cnd_trd_d_rmrks_Label);
		p.Cnd_sub_d_char1_Label = p.beansFactory.createLabel("Cnd.sub_d_char1_Label");
		p.Cnd_sub_d_char1 = p.beansFactory.createTextField("Cnd.sub_d_char1");
		p.Cnd_sub_d_char1.setLabel(p.Cnd_sub_d_char1_Label);
		p.Cnd_sub_d_char2_Label = p.beansFactory.createLabel("Cnd.sub_d_char2_Label");
		p.Cnd_sub_d_char2 = p.beansFactory.createTextField("Cnd.sub_d_char2");
		p.Cnd_sub_d_char2.setLabel(p.Cnd_sub_d_char2_Label);
		p.Cnd_sub_d_char3_Label = p.beansFactory.createLabel("Cnd.sub_d_char3_Label");
		p.Cnd_sub_d_char3 = p.beansFactory.createTextField("Cnd.sub_d_char3");
		p.Cnd_sub_d_char3.setLabel(p.Cnd_sub_d_char3_Label);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_StkXfrSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBEP_StkXfrSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBEP_StkXfrSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_trd_cd = p.beansFactory.createTableColumn("Rslt.trd_cd", MCColumnType.TEXT);
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_io_typ = p.beansFactory.createTableColumn("Rslt.io_typ", MCColumnType.TEXT);
		p.columnRslt_io_typ_nm = p.beansFactory.createTableColumn("Rslt.io_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ver_no = p.beansFactory.createTableColumn("Rslt.ver_no", MCColumnType.TEXT);
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
		p.columnRslt_trd_unit_cd = p.beansFactory.createTableColumn("Rslt.trd_unit_cd", MCColumnType.TEXT);
		p.columnRslt_trd_unit_nm = p.beansFactory.createTableColumn("Rslt.trd_unit_nm", MCColumnType.TEXT);
		p.columnRslt_trd_unit_dec_place = p.beansFactory.createTableColumn("Rslt.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_pack_unit_cd = p.beansFactory.createTableColumn("Rslt.pack_unit_cd", MCColumnType.TEXT);
		p.columnRslt_pack_unit_nm = p.beansFactory.createTableColumn("Rslt.pack_unit_nm", MCColumnType.TEXT);
		p.columnRslt_pack_unit_dec_place = p.beansFactory.createTableColumn("Rslt.pack_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_pack_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.pack_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_stk_xfr_act_dt = p.beansFactory.createTableColumn("Rslt.stk_xfr_act_dt", MCColumnType.DATE);
		p.columnRslt_stk_xfr_act_hm = p.beansFactory.createTableColumn("Rslt.stk_xfr_act_hm", MCColumnType.DATE);
		p.columnRslt_ac_dt = p.beansFactory.createTableColumn("Rslt.ac_dt", MCColumnType.DATE);
		p.columnRslt_loc_cd = p.beansFactory.createTableColumn("Rslt.loc_cd", MCColumnType.TEXT);
		p.columnRslt_loc_nm = p.beansFactory.createTableColumn("Rslt.loc_nm", MCColumnType.TEXT);
		p.columnRslt_str_ln_cd = p.beansFactory.createTableColumn("Rslt.str_ln_cd", MCColumnType.TEXT);
		p.columnRslt_str_ln_nm = p.beansFactory.createTableColumn("Rslt.str_ln_nm", MCColumnType.TEXT);
		p.columnRslt_str_ln_cd_none_flg = p.beansFactory.createTableColumn("Rslt.str_ln_cd_none_flg", MCColumnType.CHECK);
		p.columnRslt_stk_arrv_bp_cd = p.beansFactory.createTableColumn("Rslt.stk_arrv_bp_cd", MCColumnType.TEXT);
		p.columnRslt_stk_arrv_bp_nm = p.beansFactory.createTableColumn("Rslt.stk_arrv_bp_nm", MCColumnType.TEXT);
		p.columnRslt_quality_typ = p.beansFactory.createTableColumn("Rslt.quality_typ", MCColumnType.TEXT);
		p.columnRslt_quality_typ_nm = p.beansFactory.createTableColumn("Rslt.quality_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ = p.beansFactory.createTableColumn("Rslt.stk_insp_typ", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_insp_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ = p.beansFactory.createTableColumn("Rslt.stk_id_typ", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_gd_cd = p.beansFactory.createTableColumn("Rslt.gd_cd", MCColumnType.TEXT);
		p.columnRslt_gd_nm = p.beansFactory.createTableColumn("Rslt.gd_nm", MCColumnType.TEXT);
		p.columnRslt_act_usr_cd = p.beansFactory.createTableColumn("Rslt.act_usr_cd", MCColumnType.TEXT);
		p.columnRslt_act_usr_nm = p.beansFactory.createTableColumn("Rslt.act_usr_nm", MCColumnType.TEXT);
		p.columnRslt_act_dpt_cd = p.beansFactory.createTableColumn("Rslt.act_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_act_dpt_nm = p.beansFactory.createTableColumn("Rslt.act_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_stk_xfr_rsn_cd = p.beansFactory.createTableColumn("Rslt.stk_xfr_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_stk_xfr_rsn_nm = p.beansFactory.createTableColumn("Rslt.stk_xfr_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_trd_rmrks = p.beansFactory.createTableColumn("Rslt.trd_rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_intr_d_rmrks = p.beansFactory.createTableColumn("Rslt.intr_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_trd_d_rmrks = p.beansFactory.createTableColumn("Rslt.trd_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_d_char1 = p.beansFactory.createTableColumn("Rslt.sub_d_char1", MCColumnType.TEXT);
		p.columnRslt_sub_d_char2 = p.beansFactory.createTableColumn("Rslt.sub_d_char2", MCColumnType.TEXT);
		p.columnRslt_sub_d_char3 = p.beansFactory.createTableColumn("Rslt.sub_d_char3", MCColumnType.TEXT);
		p.columnRslt_disp_seq = p.beansFactory.createTableColumn("Rslt.disp_seq", MCColumnType.NUMBER);
		p.columnRslt_fix_no_typ = p.beansFactory.createTableColumn("Rslt.fix_no_typ", MCColumnType.TEXT);
		p.columnRslt_fix_no_typ_nm = p.beansFactory.createTableColumn("Rslt.fix_no_typ_nm", MCColumnType.TEXT);
		p.columnRslt_fix_no = p.beansFactory.createTableColumn("Rslt.fix_no", MCColumnType.TEXT);
		p.columnRslt_stk_xfr_act_no = p.beansFactory.createTableColumn("Rslt.stk_xfr_act_no", MCColumnType.TEXT);
		p.columnRslt_stk_xfr_act_d_no = p.beansFactory.createTableColumn("Rslt.stk_xfr_act_d_no", MCColumnType.TEXT);
		p.columnRslt_dlv_slip_no = p.beansFactory.createTableColumn("Rslt.dlv_slip_no", MCColumnType.TEXT);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_StkXfrSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP2520 = p.beansFactory.createButton("Btn.open_MSBEP2520", "open");
		p.Btn_prnt = p.beansFactory.createButton("Btn.prnt", "prnt");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBEP_StkXfrSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
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
		p.CtrlPanel.setNextBeans(p.RPnlPanel);
		p.TopPanel.add(p.RPnlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBEP_StkXfrSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.add(p.FoldTab);
		p.FoldPanel.setLastBeans(p.FoldTab);
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldTab.add(p.Tab1Panel, "Fold.tab1");
		p.FoldTab.setLastBeans(p.Tab1Panel);
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.FoldTab.add(p.Tab2Panel, "Fold.tab2");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBEP_StkXfrSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBEP_StkXfrSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBEP_StkXfrSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setBorder(p.Cnd2TitledBorder);
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_StkXfrSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Cnd_trd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_trd_cd, true);
		p.Cnd_trd_cd.setLinkBeans(p.Cnd_trd_nm);
		p.CndPanel.add(p.Cnd_trd_cd_Label);
		p.CndPanel.add(p.Cnd_trd_cd);
		p.CndPanel.setLastBeans(p.Cnd_trd_cd);
		p.Cnd_trd_cd.setNextBeans(p.Cnd_trd_nm);
		p.Cnd_trd_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.trd_cd_META);
		p.CndPanel.add(p.Cnd_trd_nm);
		p.Cnd_trd_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_trd_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.trd_nm_META);
		p.setPluralValueEnable(p.Cnd_trd_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_stk_xfr_act_no);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_stk_xfr_act_no_Label);
		p.CndPanel.add(p.Cnd_stk_xfr_act_no);
		p.Cnd_stk_xfr_act_no.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_stk_xfr_act_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.stk_xfr_act_no_META);
		p.setPluralValueEnable(p.Cnd_stk_xfr_act_no, true);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_str_ln_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_str_ln_cd, true);
		p.Cnd_str_ln_cd.setLinkBeans(p.Cnd_str_ln_nm);
		p.CndPanel.add(p.Cnd_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_str_ln_cd);
		p.Cnd_str_ln_cd.setNextBeans(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.str_ln_cd_META);
		p.CndPanel.add(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_str_ln_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_ver_no_p_PPanel);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_cd, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub3, true);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_nm, true);
		p.CndPanel.add(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_lot_no);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno_p_PPanel);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.sublot_no_META);
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
		p.Cnd_sno_p_PPanel.setNextBeans(p.Cnd_ac_dt_fr);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.CndPanel.add(p.Cnd_ac_dt_fr_Label);
		p.CndPanel.add(p.Cnd_ac_dt_fr);
		p.Cnd_ac_dt_fr.setNextBeans(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.ac_dt_fr_META);
		p.Cnd_ac_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_ac_dt_to_Label);
		p.CndPanel.add(p.Cnd_ac_dt_to);
		p.Cnd_ac_dt_to.setNextBeans(p.Cnd_xfr_act_dt_p_PPanel);
		p.Cnd_ac_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.ac_dt_to_META);
		p.Cnd_ac_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_xfr_act_dt_p_PPanel);
		p.Cnd_xfr_act_dt_p_PPanel.setNextBeans(p.Cnd_act_usr_cd);
		p.CndPanel.add(p.Cnd_act_usr_cd_Label);
		p.CndPanel.add(p.Cnd_act_usr_cd);
		p.Cnd_act_usr_cd.setNextBeans(p.Cnd_act_usr_nm);
		p.Cnd_act_usr_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.act_usr_cd_META);
		p.Cnd_act_usr_cd.addLinkBeans(p.Cnd_act_usr_nm);
		p.Cnd_act_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_act_usr_cd, true);
		p.CndPanel.add(p.Cnd_act_usr_nm);
		p.Cnd_act_usr_nm.setNextBeans(p.Cnd_act_dpt_cd);
		p.Cnd_act_usr_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.act_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_act_usr_nm, true);
		p.CndPanel.add(p.Cnd_act_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_act_dpt_cd);
		p.Cnd_act_dpt_cd.setNextBeans(p.Cnd_act_dpt_nm);
		p.Cnd_act_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.act_dpt_cd_META);
		p.Cnd_act_dpt_cd.addLinkBeans(p.Cnd_act_dpt_nm);
		p.Cnd_act_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_act_dpt_cd, true);
		p.CndPanel.add(p.Cnd_act_dpt_nm);
		p.Cnd_act_dpt_nm.setNextBeans(p.Cnd_stk_xfr_rsn_cd);
		p.Cnd_act_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.act_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_act_dpt_nm, true);
		p.Cnd_stk_xfr_rsn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_stk_xfr_rsn_cd, true);
		p.Cnd_stk_xfr_rsn_cd.setLinkBeans(p.Cnd_stk_xfr_rsn_nm);
		p.CndPanel.add(p.Cnd_stk_xfr_rsn_cd_Label);
		p.CndPanel.add(p.Cnd_stk_xfr_rsn_cd);
		p.Cnd_stk_xfr_rsn_cd.setNextBeans(p.Cnd_stk_xfr_rsn_nm);
		p.Cnd_stk_xfr_rsn_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.stk_xfr_rsn_cd_META);
		p.CndPanel.add(p.Cnd_stk_xfr_rsn_nm);
		p.Cnd_stk_xfr_rsn_nm.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_stk_xfr_rsn_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.stk_xfr_rsn_nm_META);
		p.setPluralValueEnable(p.Cnd_stk_xfr_rsn_nm, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_trd_rmrks);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.intr_rmrks_META);
		p.CndPanel.add(p.Cnd_trd_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_rmrks);
		p.Cnd_trd_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_trd_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.trd_rmrks_META);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.sub_char1_META);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.sub_char2_META);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_intr_d_rmrks);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.sub_char3_META);
		p.CndPanel.add(p.Cnd_intr_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_d_rmrks);
		p.Cnd_intr_d_rmrks.setNextBeans(p.Cnd_trd_d_rmrks);
		p.Cnd_intr_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.intr_d_rmrks_META);
		p.CndPanel.add(p.Cnd_trd_d_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_d_rmrks);
		p.Cnd_trd_d_rmrks.setNextBeans(p.Cnd_sub_d_char1);
		p.Cnd_trd_d_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.trd_d_rmrks_META);
		p.CndPanel.add(p.Cnd_sub_d_char1_Label);
		p.CndPanel.add(p.Cnd_sub_d_char1);
		p.Cnd_sub_d_char1.setNextBeans(p.Cnd_sub_d_char2);
		p.Cnd_sub_d_char1.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.sub_d_char1_META);
		p.CndPanel.add(p.Cnd_sub_d_char2_Label);
		p.CndPanel.add(p.Cnd_sub_d_char2);
		p.Cnd_sub_d_char2.setNextBeans(p.Cnd_sub_d_char3);
		p.Cnd_sub_d_char2.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.sub_d_char2_META);
		p.CndPanel.add(p.Cnd_sub_d_char3_Label);
		p.CndPanel.add(p.Cnd_sub_d_char3);
		p.Cnd_sub_d_char3.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP2530.CndR.sub_d_char3_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_StkXfrSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRPnl(MSBEP_StkXfrSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel.setValueCheck(false);
		p.RPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RPnlPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
		p.RPnl_dwnld.setIcon("DWNLD");
		p.RPnl_dwnld.setFunctionKey(MCFunctionKey.F11);
		p.RPnlPanel.add(p.RPnl_dwnld);
		p.RPnlPanel.setLastBeans(p.RPnl_dwnld);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBEP_StkXfrSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setValueCheck(false);
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBEP_StkXfrSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP2520.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBEP2520);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBEP2520);
		p.Btn_open_MSBEP2520.setNextBeans(p.Btn_prnt);
		p.Btn_prnt.setIcon("PRINT");
		p.Btn_prnt.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_prnt);
		p.Btn_prnt.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
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
		MSBEP_StkXfrSrch_MC.mcInitTop((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.mcInitFold((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.mcInitTab1((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.mcInitTab2((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.mcInitCnd2((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.mcInitCnd((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.mcInitCtrl((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.mcInitRPnl((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.mcInitRslt((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.mcInitBtn((MSBEP_StkXfrSrch)this);

		// [INI]ステータスのモードの設定
		MSBEP_StkXfrSrch_MC.statusInitINI_Top((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.statusInitINI_Fold((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.statusInitINI_Tab1((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.statusInitINI_Tab2((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.statusInitINI_Cnd2((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.statusInitINI_Cnd((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.statusInitINI_Ctrl((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.statusInitINI_RPnl((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.statusInitINI_Rslt((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.statusInitINI_Btn((MSBEP_StkXfrSrch)this);

		// [REF]ステータスのモードの設定
		MSBEP_StkXfrSrch_MC.statusInitREF_Top((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.statusInitREF_Fold((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.statusInitREF_Tab1((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.statusInitREF_Tab2((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.statusInitREF_Cnd2((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.statusInitREF_Cnd((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.statusInitREF_Ctrl((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.statusInitREF_RPnl((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.statusInitREF_Rslt((MSBEP_StkXfrSrch)this);
		MSBEP_StkXfrSrch_MC.statusInitREF_Btn((MSBEP_StkXfrSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_StkXfrSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_StkXfrSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBEP_StkXfrSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBEP_StkXfrSrch p) {
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBEP_StkXfrSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_StkXfrSrch p) {
		p.Cnd_trd_cd.setListListener(p);
		p.Cnd_trd_cd.addAllListener(p);
		p.Cnd_trd_nm.setListListener(p);
		p.Cnd_trd_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_stk_xfr_act_no.setListListener(p);
		p.Cnd_stk_xfr_act_no.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_str_ln_cd.setListListener(p);
		p.Cnd_str_ln_cd.addAllListener(p);
		p.Cnd_str_ln_nm.setListListener(p);
		p.Cnd_str_ln_nm.addAllListener(p);
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_ac_dt_fr.setListListener(p);
		p.Cnd_ac_dt_fr.addAllListener(p);
		p.Cnd_ac_dt_to.setListListener(p);
		p.Cnd_ac_dt_to.addAllListener(p);
		p.Cnd_act_usr_cd.setListListener(p);
		p.Cnd_act_usr_cd.addAllListener(p);
		p.Cnd_act_usr_nm.setListListener(p);
		p.Cnd_act_usr_nm.addAllListener(p);
		p.Cnd_act_dpt_cd.setListListener(p);
		p.Cnd_act_dpt_cd.addAllListener(p);
		p.Cnd_act_dpt_nm.setListListener(p);
		p.Cnd_act_dpt_nm.addAllListener(p);
		p.Cnd_stk_xfr_rsn_cd.setListListener(p);
		p.Cnd_stk_xfr_rsn_cd.addAllListener(p);
		p.Cnd_stk_xfr_rsn_nm.setListListener(p);
		p.Cnd_stk_xfr_rsn_nm.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_trd_rmrks.setListListener(p);
		p.Cnd_trd_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_intr_d_rmrks.setListListener(p);
		p.Cnd_intr_d_rmrks.addAllListener(p);
		p.Cnd_trd_d_rmrks.setListListener(p);
		p.Cnd_trd_d_rmrks.addAllListener(p);
		p.Cnd_sub_d_char1.setListListener(p);
		p.Cnd_sub_d_char1.addAllListener(p);
		p.Cnd_sub_d_char2.setListListener(p);
		p.Cnd_sub_d_char2.addAllListener(p);
		p.Cnd_sub_d_char3.setListListener(p);
		p.Cnd_sub_d_char3.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_StkXfrSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBEP_StkXfrSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBEP_StkXfrSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_trd_cd.addAllListener(p);
		p.columnRslt_trd_cd.setListListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_io_typ.addAllListener(p);
		p.columnRslt_io_typ.setListListener(p);
		p.columnRslt_io_typ_nm.addAllListener(p);
		p.columnRslt_io_typ_nm.setListListener(p);
		p.columnRslt_ver_no.addAllListener(p);
		p.columnRslt_ver_no.setListListener(p);
		p.columnRslt_lot_no.addAllListener(p);
		p.columnRslt_lot_no.setListListener(p);
		p.columnRslt_sublot_no.addAllListener(p);
		p.columnRslt_sublot_no.setListListener(p);
		p.columnRslt_trd_unit_cd.addAllListener(p);
		p.columnRslt_trd_unit_cd.setListListener(p);
		p.columnRslt_trd_unit_nm.addAllListener(p);
		p.columnRslt_trd_unit_nm.setListListener(p);
		p.columnRslt_trd_unit_dec_place.addAllListener(p);
		p.columnRslt_trd_unit_dec_place.setListListener(p);
		p.columnRslt_trd_unit_rnd_typ.addAllListener(p);
		p.columnRslt_trd_unit_rnd_typ.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_unit_dec_place.addAllListener(p);
		p.columnRslt_base_unit_dec_place.setListListener(p);
		p.columnRslt_base_unit_rnd_typ.addAllListener(p);
		p.columnRslt_base_unit_rnd_typ.setListListener(p);
		p.columnRslt_pack_unit_cd.addAllListener(p);
		p.columnRslt_pack_unit_cd.setListListener(p);
		p.columnRslt_pack_unit_nm.addAllListener(p);
		p.columnRslt_pack_unit_nm.setListListener(p);
		p.columnRslt_pack_unit_dec_place.addAllListener(p);
		p.columnRslt_pack_unit_dec_place.setListListener(p);
		p.columnRslt_pack_unit_rnd_typ.addAllListener(p);
		p.columnRslt_pack_unit_rnd_typ.setListListener(p);
		p.columnRslt_stk_xfr_act_dt.addAllListener(p);
		p.columnRslt_stk_xfr_act_dt.setListListener(p);
		p.columnRslt_stk_xfr_act_hm.addAllListener(p);
		p.columnRslt_stk_xfr_act_hm.setListListener(p);
		p.columnRslt_ac_dt.addAllListener(p);
		p.columnRslt_ac_dt.setListListener(p);
		p.columnRslt_loc_cd.addAllListener(p);
		p.columnRslt_loc_cd.setListListener(p);
		p.columnRslt_loc_nm.addAllListener(p);
		p.columnRslt_loc_nm.setListListener(p);
		p.columnRslt_str_ln_cd.addAllListener(p);
		p.columnRslt_str_ln_cd.setListListener(p);
		p.columnRslt_str_ln_nm.addAllListener(p);
		p.columnRslt_str_ln_nm.setListListener(p);
		p.columnRslt_str_ln_cd_none_flg.addAllListener(p);
		p.columnRslt_stk_arrv_bp_cd.addAllListener(p);
		p.columnRslt_stk_arrv_bp_cd.setListListener(p);
		p.columnRslt_stk_arrv_bp_nm.addAllListener(p);
		p.columnRslt_stk_arrv_bp_nm.setListListener(p);
		p.columnRslt_quality_typ.addAllListener(p);
		p.columnRslt_quality_typ.setListListener(p);
		p.columnRslt_quality_typ_nm.addAllListener(p);
		p.columnRslt_quality_typ_nm.setListListener(p);
		p.columnRslt_stk_insp_typ.addAllListener(p);
		p.columnRslt_stk_insp_typ.setListListener(p);
		p.columnRslt_stk_insp_typ_nm.addAllListener(p);
		p.columnRslt_stk_insp_typ_nm.setListListener(p);
		p.columnRslt_stk_id_typ.addAllListener(p);
		p.columnRslt_stk_id_typ.setListListener(p);
		p.columnRslt_stk_id_typ_nm.addAllListener(p);
		p.columnRslt_stk_id_typ_nm.setListListener(p);
		p.columnRslt_gd_cd.addAllListener(p);
		p.columnRslt_gd_cd.setListListener(p);
		p.columnRslt_gd_nm.addAllListener(p);
		p.columnRslt_gd_nm.setListListener(p);
		p.columnRslt_act_usr_cd.addAllListener(p);
		p.columnRslt_act_usr_cd.setListListener(p);
		p.columnRslt_act_usr_nm.addAllListener(p);
		p.columnRslt_act_usr_nm.setListListener(p);
		p.columnRslt_act_dpt_cd.addAllListener(p);
		p.columnRslt_act_dpt_cd.setListListener(p);
		p.columnRslt_act_dpt_nm.addAllListener(p);
		p.columnRslt_act_dpt_nm.setListListener(p);
		p.columnRslt_stk_xfr_rsn_cd.addAllListener(p);
		p.columnRslt_stk_xfr_rsn_cd.setListListener(p);
		p.columnRslt_stk_xfr_rsn_nm.addAllListener(p);
		p.columnRslt_stk_xfr_rsn_nm.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
		p.columnRslt_trd_rmrks.addAllListener(p);
		p.columnRslt_trd_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_intr_d_rmrks.addAllListener(p);
		p.columnRslt_intr_d_rmrks.setListListener(p);
		p.columnRslt_trd_d_rmrks.addAllListener(p);
		p.columnRslt_trd_d_rmrks.setListListener(p);
		p.columnRslt_sub_d_char1.addAllListener(p);
		p.columnRslt_sub_d_char1.setListListener(p);
		p.columnRslt_sub_d_char2.addAllListener(p);
		p.columnRslt_sub_d_char2.setListListener(p);
		p.columnRslt_sub_d_char3.addAllListener(p);
		p.columnRslt_sub_d_char3.setListListener(p);
		p.columnRslt_disp_seq.addAllListener(p);
		p.columnRslt_disp_seq.setListListener(p);
		p.columnRslt_fix_no_typ.addAllListener(p);
		p.columnRslt_fix_no_typ.setListListener(p);
		p.columnRslt_fix_no_typ_nm.addAllListener(p);
		p.columnRslt_fix_no_typ_nm.setListListener(p);
		p.columnRslt_fix_no.addAllListener(p);
		p.columnRslt_fix_no.setListListener(p);
		p.columnRslt_stk_xfr_act_no.addAllListener(p);
		p.columnRslt_stk_xfr_act_no.setListListener(p);
		p.columnRslt_stk_xfr_act_d_no.addAllListener(p);
		p.columnRslt_stk_xfr_act_d_no.setListListener(p);
		p.columnRslt_dlv_slip_no.addAllListener(p);
		p.columnRslt_dlv_slip_no.setListListener(p);
		p.columnRslt_itm_typ.addAllListener(p);
		p.columnRslt_itm_typ.setListListener(p);
		p.columnRslt_itm_typ_nm.addAllListener(p);
		p.columnRslt_itm_typ_nm.setListListener(p);
		p.columnRslt_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_itm_typ_d_cd.setListListener(p);
		p.columnRslt_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_itm_typ_d_nm.setListListener(p);
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
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
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
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_StkXfrSrch p) {
		p.Btn_open_MSBEP2520.addAllListener(p);
		p.Btn_open_MSBEP2520.setAPMethodName("doBtn_open_MSBEP2520");
		p.Btn_prnt.addAllListener(p);
		p.Btn_prnt.setAPMethodName("doBtn_prnt");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
	}

	/**
	 * [INI]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINI_Top(MSBEP_StkXfrSrch p){

	}

	/**
	 * [INI]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINI_Fold(MSBEP_StkXfrSrch p){

	}

	/**
	 * [INI]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINI_Tab1(MSBEP_StkXfrSrch p){

	}

	/**
	 * [INI]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINI_Tab2(MSBEP_StkXfrSrch p){

	}

	/**
	 * [INI]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitINI_Cnd2(MSBEP_StkXfrSrch p){

	}

	/**
	 * [INI]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINI_Cnd(MSBEP_StkXfrSrch p){
		p.Cnd_trd_cd.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_stk_xfr_act_no.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(INI, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(INI, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(INI, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(INI, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, INI, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, INI, MCMode.INVISIBLE);
		p.Cnd_ac_dt_fr.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_xfr_act_dt_p_PPanel.putStatus(INI, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_act_usr_cd.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_stk_xfr_rsn_cd.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_stk_xfr_rsn_nm.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sub_d_char1.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sub_d_char2.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_sub_d_char3.putMode(p, INI, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(INI, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [INI]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINI_Ctrl(MSBEP_StkXfrSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(INI, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [INI]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitINI_RPnl(MSBEP_StkXfrSrch p){
		p.RPnl_dwnld.putMode(p, INI, MCMode.ENABLE);

	}

	/**
	 * [INI]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINI_Rslt(MSBEP_StkXfrSrch p){
		p.columnRslt_check.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_typ.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_io_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(INI, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.Rslt_trd_unit_p_PPanel.putStatus(INI, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, INI, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, INI, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.Rslt_base_unit_p_PPanel.putStatus(INI, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, INI, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, INI, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.Rslt_pack_unit_p_PPanel.putStatus(INI, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pack_unit_dec_place.putMode(p, INI, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_rnd_typ.putMode(p, INI, MCMode.INVISIBLE);
		p.columnRslt_stk_xfr_act_dt.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_stk_xfr_act_hm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.Rslt_stk_bp_p_PPanel.putStatus(INI, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(INI, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_act_usr_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_act_usr_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_act_dpt_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_act_dpt_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_stk_xfr_rsn_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_stk_xfr_rsn_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_sub_d_char1.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_sub_d_char2.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_sub_d_char3.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, INI, MCMode.INVISIBLE);
		p.columnRslt_fix_no_typ.putMode(p, INI, MCMode.INVISIBLE);
		p.columnRslt_fix_no_typ_nm.putMode(p, INI, MCMode.INVISIBLE);
		p.columnRslt_fix_no.putMode(p, INI, MCMode.INVISIBLE);
		p.columnRslt_stk_xfr_act_no.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_stk_xfr_act_d_no.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(INI, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, INI, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, INI, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, INI, MCMode.READ_ONLY);

	}

	/**
	 * [INI]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINI_Btn(MSBEP_StkXfrSrch p){
		p.Btn_open_MSBEP2520.putMode(p, INI, MCMode.DISABLE);
		p.Btn_prnt.putMode(p, INI, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, INI, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, INI, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBEP_StkXfrSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBEP_StkXfrSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBEP_StkXfrSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBEP_StkXfrSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MSBEP_StkXfrSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBEP_StkXfrSrch p){
		p.Cnd_trd_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_stk_xfr_act_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_no.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_sno_p_PPanel.SnoWrkNo_wrk_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_ac_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_xfr_act_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_act_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_act_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_act_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_act_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_stk_xfr_rsn_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_stk_xfr_rsn_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_intr_d_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_trd_d_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_d_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_d_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_d_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBEP_StkXfrSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBEP_StkXfrSrch p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBEP_StkXfrSrch p){
		p.columnRslt_check.putMode(p, REF, MCMode.ENABLE);
		p.columnRslt_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_trd_unit_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_trd_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_base_unit_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_pack_unit_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pack_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_stk_xfr_act_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_xfr_act_hm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_stk_bp_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_act_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_act_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_xfr_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_xfr_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_intr_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_d_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_d_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_d_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_disp_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_fix_no_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_fix_no_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_fix_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_stk_xfr_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_xfr_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBEP_StkXfrSrch p){
		p.Btn_open_MSBEP2520.putMode(p, REF, MCMode.ENABLE);
		p.Btn_prnt.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return INI;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBEP_StkXfrSrch_MC.setTableConfigRslt((MSBEP_StkXfrSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBEP_StkXfrSrch p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_trd_cd.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.trd_cd_META);
		p.columnRslt_trd_cd.addLinkBeans(p.columnRslt_trd_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cd);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.wg_cd_META);
		p.columnRslt_wg_cd.addLinkBeans(p.columnRslt_wg_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_io_typ.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.io_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_typ);
		p.columnRslt_io_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.io_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_typ_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_ver_no.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.ver_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ver_no);
		p.columnRslt_lot_no.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.columnRslt_trd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.trd_unit_cd_META);
		p.columnRslt_trd_unit_cd.addLinkBeans(p.columnRslt_trd_unit_nm,p.columnRslt_trd_unit_dec_place);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_cd);
		p.columnRslt_trd_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.trd_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_nm);
		p.RsltTable.addTable(p.Rslt_trd_unit_p_PPanel.QtyTable);
		p.columnRslt_trd_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.trd_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_dec_place);
		p.columnRslt_trd_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.trd_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_unit_rnd_typ);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.base_unit_cd_META);
		p.columnRslt_base_unit_cd.addLinkBeans(p.columnRslt_base_unit_nm,p.columnRslt_base_unit_dec_place);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.RsltTable.addTable(p.Rslt_base_unit_p_PPanel.QtyTable);
		p.columnRslt_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_dec_place);
		p.columnRslt_base_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.base_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_rnd_typ);
		p.columnRslt_pack_unit_cd.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.pack_unit_cd_META);
		p.columnRslt_pack_unit_cd.addLinkBeans(p.columnRslt_pack_unit_nm,p.columnRslt_pack_unit_dec_place);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_cd);
		p.columnRslt_pack_unit_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.pack_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_nm);
		p.RsltTable.addTable(p.Rslt_pack_unit_p_PPanel.QtyTable);
		p.columnRslt_pack_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.pack_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_dec_place);
		p.columnRslt_pack_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.pack_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_rnd_typ);
		p.columnRslt_stk_xfr_act_dt.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.stk_xfr_act_dt_META);
		p.columnRslt_stk_xfr_act_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_xfr_act_dt);
		p.columnRslt_stk_xfr_act_hm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.stk_xfr_act_hm_META);
		p.columnRslt_stk_xfr_act_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_xfr_act_hm);
		p.columnRslt_ac_dt.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.ac_dt_META);
		p.columnRslt_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_dt);
		p.columnRslt_loc_cd.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_cd);
		p.columnRslt_loc_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_nm);
		p.columnRslt_str_ln_cd.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.str_ln_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_cd);
		p.columnRslt_str_ln_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.str_ln_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_nm);
		p.columnRslt_str_ln_cd_none_flg.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.str_ln_cd_none_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_cd_none_flg);
		p.columnRslt_stk_arrv_bp_cd.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.stk_arrv_bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_arrv_bp_cd);
		p.columnRslt_stk_arrv_bp_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.stk_arrv_bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_arrv_bp_nm);
		p.columnRslt_quality_typ.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.quality_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ);
		p.columnRslt_quality_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.quality_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ_nm);
		p.columnRslt_stk_insp_typ.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.stk_insp_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ);
		p.columnRslt_stk_insp_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.stk_insp_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ_nm);
		p.columnRslt_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.stk_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ);
		p.columnRslt_stk_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.stk_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ_nm);
		p.columnRslt_gd_cd.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.gd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_cd);
		p.columnRslt_gd_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.gd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_nm);
		p.RsltTable.addTable(p.Rslt_stk_bp_p_PPanel.StkBpTable);
		p.RsltTable.addTable(p.Rslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRslt_act_usr_cd.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.act_usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_usr_cd);
		p.columnRslt_act_usr_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.act_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_usr_nm);
		p.columnRslt_act_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.act_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_dpt_cd);
		p.columnRslt_act_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.act_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_act_dpt_nm);
		p.columnRslt_stk_xfr_rsn_cd.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.stk_xfr_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_xfr_rsn_cd);
		p.columnRslt_stk_xfr_rsn_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.stk_xfr_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_xfr_rsn_nm);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_trd_rmrks.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.trd_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_intr_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.intr_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_d_rmrks);
		p.columnRslt_trd_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.trd_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_d_rmrks);
		p.columnRslt_sub_d_char1.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.sub_d_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_d_char1);
		p.columnRslt_sub_d_char2.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.sub_d_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_d_char2);
		p.columnRslt_sub_d_char3.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.sub_d_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_d_char3);
		p.columnRslt_disp_seq.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.disp_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_seq);
		p.columnRslt_fix_no_typ.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.fix_no_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fix_no_typ);
		p.columnRslt_fix_no_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.fix_no_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fix_no_typ_nm);
		p.columnRslt_fix_no.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.fix_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fix_no);
		p.columnRslt_stk_xfr_act_no.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.stk_xfr_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_xfr_act_no);
		p.columnRslt_stk_xfr_act_d_no.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.stk_xfr_act_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_xfr_act_d_no);
		p.columnRslt_dlv_slip_no.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.dlv_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_no);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBE.MSBEP2530.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_trd_cd.getListConfig().setPutter(getCnd_trd_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_str_ln_cd.getListConfig().setPutter(getCnd_str_ln_cd_ListPutter());
		Cnd_lot_no.getListConfig().setPutter(getCnd_lot_no_ListPutter());
		Cnd_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sublot_no.getListConfig().setPutter(getCnd_sublot_no_ListPutter());
		Cnd_act_usr_cd.getListConfig().setPutter(getCnd_act_usr_cd_ListPutter());
		Cnd_act_dpt_cd.getListConfig().setPutter(getCnd_act_dpt_cd_ListPutter());
		Cnd_stk_xfr_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_stk_xfr_rsn_cd.getListConfig().setPutter(getCnd_stk_xfr_rsn_cd_ListPutter());
	}

	/**
	 * この画面を[INI]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINIStatus() {
		status = INI;
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
		if (INI.equals(status)) {
			setINIStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * [Cnd_trd_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_trd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trd");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Cnd_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}
	 
	/**
	 * [Cnd_lot_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_lot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.LotNo");
		return lp;
	}
	 
	/**
	 * [Cnd_sublot_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sublot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.SublotNo");
		return lp;
	}
	 
	/**
	 * [Cnd_act_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_act_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_act_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_act_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_stk_xfr_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_stk_xfr_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkXfrBizRsn");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_trd_cd) return getCnd_trd_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_str_ln_cd) return getCnd_str_ln_cd(row, info);
		if(combo == Cnd_lot_no) return getCnd_lot_no(row, info);
		if(combo == Cnd_sublot_no) return getCnd_sublot_no(row, info);
		if(combo == Cnd_act_usr_cd) return getCnd_act_usr_cd(row, info);
		if(combo == Cnd_act_dpt_cd) return getCnd_act_dpt_cd(row, info);
		if(combo == Cnd_stk_xfr_rsn_cd) return getCnd_stk_xfr_rsn_cd(row, info);
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
		else if (ap == RPnl_dwnld) doRPnl_dwnld(info);
		else if (ap == Btn_open_MSBEP2520) doBtn_open_MSBEP2520(info);
		else if (ap == Btn_prnt) doBtn_prnt(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [RPnl]パネルの[dwnld]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRPnl_dwnld(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP2520]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP2520(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

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
		if (vc == FoldTab) return doFold_VC(info);
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_trd_cd) return doCnd_trd_cd_VC(info);
		if (vc == Cnd_trd_nm) return doCnd_trd_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_stk_xfr_act_no) return doCnd_stk_xfr_act_no_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_str_ln_cd) return doCnd_str_ln_cd_VC(info);
		if (vc == Cnd_str_ln_nm) return doCnd_str_ln_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_ac_dt_fr) return doCnd_ac_dt_fr_VC(info);
		if (vc == Cnd_ac_dt_to) return doCnd_ac_dt_to_VC(info);
		if (vc == Cnd_act_usr_cd) return doCnd_act_usr_cd_VC(info);
		if (vc == Cnd_act_usr_nm) return doCnd_act_usr_nm_VC(info);
		if (vc == Cnd_act_dpt_cd) return doCnd_act_dpt_cd_VC(info);
		if (vc == Cnd_act_dpt_nm) return doCnd_act_dpt_nm_VC(info);
		if (vc == Cnd_stk_xfr_rsn_cd) return doCnd_stk_xfr_rsn_cd_VC(info);
		if (vc == Cnd_stk_xfr_rsn_nm) return doCnd_stk_xfr_rsn_nm_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_trd_rmrks) return doCnd_trd_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_intr_d_rmrks) return doCnd_intr_d_rmrks_VC(info);
		if (vc == Cnd_trd_d_rmrks) return doCnd_trd_d_rmrks_VC(info);
		if (vc == Cnd_sub_d_char1) return doCnd_sub_d_char1_VC(info);
		if (vc == Cnd_sub_d_char2) return doCnd_sub_d_char2_VC(info);
		if (vc == Cnd_sub_d_char3) return doCnd_sub_d_char3_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_trd_cd) return doRslt_trd_cd_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_io_typ) return doRslt_io_typ_VC(info);
		if (vc == columnRslt_io_typ_nm) return doRslt_io_typ_nm_VC(info);
		if (vc == columnRslt_ver_no) return doRslt_ver_no_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
		if (vc == columnRslt_trd_unit_cd) return doRslt_trd_unit_cd_VC(info);
		if (vc == columnRslt_trd_unit_nm) return doRslt_trd_unit_nm_VC(info);
		if (vc == columnRslt_trd_unit_dec_place) return doRslt_trd_unit_dec_place_VC(info);
		if (vc == columnRslt_trd_unit_rnd_typ) return doRslt_trd_unit_rnd_typ_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_dec_place) return doRslt_base_unit_dec_place_VC(info);
		if (vc == columnRslt_base_unit_rnd_typ) return doRslt_base_unit_rnd_typ_VC(info);
		if (vc == columnRslt_pack_unit_cd) return doRslt_pack_unit_cd_VC(info);
		if (vc == columnRslt_pack_unit_nm) return doRslt_pack_unit_nm_VC(info);
		if (vc == columnRslt_pack_unit_dec_place) return doRslt_pack_unit_dec_place_VC(info);
		if (vc == columnRslt_pack_unit_rnd_typ) return doRslt_pack_unit_rnd_typ_VC(info);
		if (vc == columnRslt_stk_xfr_act_dt) return doRslt_stk_xfr_act_dt_VC(info);
		if (vc == columnRslt_stk_xfr_act_hm) return doRslt_stk_xfr_act_hm_VC(info);
		if (vc == columnRslt_ac_dt) return doRslt_ac_dt_VC(info);
		if (vc == columnRslt_loc_cd) return doRslt_loc_cd_VC(info);
		if (vc == columnRslt_loc_nm) return doRslt_loc_nm_VC(info);
		if (vc == columnRslt_str_ln_cd) return doRslt_str_ln_cd_VC(info);
		if (vc == columnRslt_str_ln_nm) return doRslt_str_ln_nm_VC(info);
		if (vc == columnRslt_str_ln_cd_none_flg) return doRslt_str_ln_cd_none_flg_VC(info);
		if (vc == columnRslt_stk_arrv_bp_cd) return doRslt_stk_arrv_bp_cd_VC(info);
		if (vc == columnRslt_stk_arrv_bp_nm) return doRslt_stk_arrv_bp_nm_VC(info);
		if (vc == columnRslt_quality_typ) return doRslt_quality_typ_VC(info);
		if (vc == columnRslt_quality_typ_nm) return doRslt_quality_typ_nm_VC(info);
		if (vc == columnRslt_stk_insp_typ) return doRslt_stk_insp_typ_VC(info);
		if (vc == columnRslt_stk_insp_typ_nm) return doRslt_stk_insp_typ_nm_VC(info);
		if (vc == columnRslt_stk_id_typ) return doRslt_stk_id_typ_VC(info);
		if (vc == columnRslt_stk_id_typ_nm) return doRslt_stk_id_typ_nm_VC(info);
		if (vc == columnRslt_gd_cd) return doRslt_gd_cd_VC(info);
		if (vc == columnRslt_gd_nm) return doRslt_gd_nm_VC(info);
		if (vc == columnRslt_act_usr_cd) return doRslt_act_usr_cd_VC(info);
		if (vc == columnRslt_act_usr_nm) return doRslt_act_usr_nm_VC(info);
		if (vc == columnRslt_act_dpt_cd) return doRslt_act_dpt_cd_VC(info);
		if (vc == columnRslt_act_dpt_nm) return doRslt_act_dpt_nm_VC(info);
		if (vc == columnRslt_stk_xfr_rsn_cd) return doRslt_stk_xfr_rsn_cd_VC(info);
		if (vc == columnRslt_stk_xfr_rsn_nm) return doRslt_stk_xfr_rsn_nm_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
		if (vc == columnRslt_trd_rmrks) return doRslt_trd_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_intr_d_rmrks) return doRslt_intr_d_rmrks_VC(info);
		if (vc == columnRslt_trd_d_rmrks) return doRslt_trd_d_rmrks_VC(info);
		if (vc == columnRslt_sub_d_char1) return doRslt_sub_d_char1_VC(info);
		if (vc == columnRslt_sub_d_char2) return doRslt_sub_d_char2_VC(info);
		if (vc == columnRslt_sub_d_char3) return doRslt_sub_d_char3_VC(info);
		if (vc == columnRslt_disp_seq) return doRslt_disp_seq_VC(info);
		if (vc == columnRslt_fix_no_typ) return doRslt_fix_no_typ_VC(info);
		if (vc == columnRslt_fix_no_typ_nm) return doRslt_fix_no_typ_nm_VC(info);
		if (vc == columnRslt_fix_no) return doRslt_fix_no_VC(info);
		if (vc == columnRslt_stk_xfr_act_no) return doRslt_stk_xfr_act_no_VC(info);
		if (vc == columnRslt_stk_xfr_act_d_no) return doRslt_stk_xfr_act_d_no_VC(info);
		if (vc == columnRslt_dlv_slip_no) return doRslt_dlv_slip_no_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
		return true;
	}

	/**
	 * [Fold]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFold_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_xfr_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_xfr_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_xfr_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_xfr_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_xfr_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_xfr_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_d_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_d_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_d_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_d_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_d_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_d_char3_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ver_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ver_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pack_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pack_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pack_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pack_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pack_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pack_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pack_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pack_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_xfr_act_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_xfr_act_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_xfr_act_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_xfr_act_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[str_ln_cd_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_str_ln_cd_none_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_arrv_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_arrv_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_insp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_insp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[act_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_act_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_xfr_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_xfr_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_xfr_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_xfr_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_d_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_d_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_d_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_d_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_d_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_d_char3_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[fix_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fix_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fix_no_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fix_no_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fix_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fix_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_xfr_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_xfr_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_xfr_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_xfr_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_d_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_cntr_VC(MCEventInfo info){
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
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == FoldTab) doFold_NC(info);
		else if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_trd_cd) doCnd_trd_cd_NC(info);
		else if (nc == Cnd_trd_nm) doCnd_trd_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_stk_xfr_act_no) doCnd_stk_xfr_act_no_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_str_ln_cd) doCnd_str_ln_cd_NC(info);
		else if (nc == Cnd_str_ln_nm) doCnd_str_ln_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NC(info);
		else if (nc == Cnd_ac_dt_to) doCnd_ac_dt_to_NC(info);
		else if (nc == Cnd_act_usr_cd) doCnd_act_usr_cd_NC(info);
		else if (nc == Cnd_act_usr_nm) doCnd_act_usr_nm_NC(info);
		else if (nc == Cnd_act_dpt_cd) doCnd_act_dpt_cd_NC(info);
		else if (nc == Cnd_act_dpt_nm) doCnd_act_dpt_nm_NC(info);
		else if (nc == Cnd_stk_xfr_rsn_cd) doCnd_stk_xfr_rsn_cd_NC(info);
		else if (nc == Cnd_stk_xfr_rsn_nm) doCnd_stk_xfr_rsn_nm_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_trd_rmrks) doCnd_trd_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_NC(info);
		else if (nc == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NC(info);
		else if (nc == Cnd_sub_d_char1) doCnd_sub_d_char1_NC(info);
		else if (nc == Cnd_sub_d_char2) doCnd_sub_d_char2_NC(info);
		else if (nc == Cnd_sub_d_char3) doCnd_sub_d_char3_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_trd_cd) doRslt_trd_cd_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_io_typ) doRslt_io_typ_NC(info);
		else if (nc == columnRslt_io_typ_nm) doRslt_io_typ_nm_NC(info);
		else if (nc == columnRslt_ver_no) doRslt_ver_no_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
		else if (nc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NC(info);
		else if (nc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NC(info);
		else if (nc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NC(info);
		else if (nc == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_NC(info);
		else if (nc == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_NC(info);
		else if (nc == columnRslt_pack_unit_dec_place) doRslt_pack_unit_dec_place_NC(info);
		else if (nc == columnRslt_pack_unit_rnd_typ) doRslt_pack_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_stk_xfr_act_dt) doRslt_stk_xfr_act_dt_NC(info);
		else if (nc == columnRslt_stk_xfr_act_hm) doRslt_stk_xfr_act_hm_NC(info);
		else if (nc == columnRslt_ac_dt) doRslt_ac_dt_NC(info);
		else if (nc == columnRslt_loc_cd) doRslt_loc_cd_NC(info);
		else if (nc == columnRslt_loc_nm) doRslt_loc_nm_NC(info);
		else if (nc == columnRslt_str_ln_cd) doRslt_str_ln_cd_NC(info);
		else if (nc == columnRslt_str_ln_nm) doRslt_str_ln_nm_NC(info);
		else if (nc == columnRslt_str_ln_cd_none_flg) doRslt_str_ln_cd_none_flg_NC(info);
		else if (nc == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NC(info);
		else if (nc == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NC(info);
		else if (nc == columnRslt_quality_typ) doRslt_quality_typ_NC(info);
		else if (nc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NC(info);
		else if (nc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NC(info);
		else if (nc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NC(info);
		else if (nc == columnRslt_stk_id_typ) doRslt_stk_id_typ_NC(info);
		else if (nc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NC(info);
		else if (nc == columnRslt_gd_cd) doRslt_gd_cd_NC(info);
		else if (nc == columnRslt_gd_nm) doRslt_gd_nm_NC(info);
		else if (nc == columnRslt_act_usr_cd) doRslt_act_usr_cd_NC(info);
		else if (nc == columnRslt_act_usr_nm) doRslt_act_usr_nm_NC(info);
		else if (nc == columnRslt_act_dpt_cd) doRslt_act_dpt_cd_NC(info);
		else if (nc == columnRslt_act_dpt_nm) doRslt_act_dpt_nm_NC(info);
		else if (nc == columnRslt_stk_xfr_rsn_cd) doRslt_stk_xfr_rsn_cd_NC(info);
		else if (nc == columnRslt_stk_xfr_rsn_nm) doRslt_stk_xfr_rsn_nm_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
		else if (nc == columnRslt_trd_rmrks) doRslt_trd_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_NC(info);
		else if (nc == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NC(info);
		else if (nc == columnRslt_sub_d_char1) doRslt_sub_d_char1_NC(info);
		else if (nc == columnRslt_sub_d_char2) doRslt_sub_d_char2_NC(info);
		else if (nc == columnRslt_sub_d_char3) doRslt_sub_d_char3_NC(info);
		else if (nc == columnRslt_disp_seq) doRslt_disp_seq_NC(info);
		else if (nc == columnRslt_fix_no_typ) doRslt_fix_no_typ_NC(info);
		else if (nc == columnRslt_fix_no_typ_nm) doRslt_fix_no_typ_nm_NC(info);
		else if (nc == columnRslt_fix_no) doRslt_fix_no_NC(info);
		else if (nc == columnRslt_stk_xfr_act_no) doRslt_stk_xfr_act_no_NC(info);
		else if (nc == columnRslt_stk_xfr_act_d_no) doRslt_stk_xfr_act_d_no_NC(info);
		else if (nc == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_xfr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_xfr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_xfr_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_xfr_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_xfr_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_xfr_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_d_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_d_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_d_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_act_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_act_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_act_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_act_hm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_cd_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_none_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_d_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_d_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_d_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_d_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_d_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_d_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NC(MCEventInfo info){
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
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == FoldTab) doFold_NE(info);
		else if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_trd_cd) doCnd_trd_cd_NE(info);
		else if (ne == Cnd_trd_nm) doCnd_trd_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_stk_xfr_act_no) doCnd_stk_xfr_act_no_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_str_ln_cd) doCnd_str_ln_cd_NE(info);
		else if (ne == Cnd_str_ln_nm) doCnd_str_ln_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NE(info);
		else if (ne == Cnd_ac_dt_to) doCnd_ac_dt_to_NE(info);
		else if (ne == Cnd_act_usr_cd) doCnd_act_usr_cd_NE(info);
		else if (ne == Cnd_act_usr_nm) doCnd_act_usr_nm_NE(info);
		else if (ne == Cnd_act_dpt_cd) doCnd_act_dpt_cd_NE(info);
		else if (ne == Cnd_act_dpt_nm) doCnd_act_dpt_nm_NE(info);
		else if (ne == Cnd_stk_xfr_rsn_cd) doCnd_stk_xfr_rsn_cd_NE(info);
		else if (ne == Cnd_stk_xfr_rsn_nm) doCnd_stk_xfr_rsn_nm_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_trd_rmrks) doCnd_trd_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_NE(info);
		else if (ne == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NE(info);
		else if (ne == Cnd_sub_d_char1) doCnd_sub_d_char1_NE(info);
		else if (ne == Cnd_sub_d_char2) doCnd_sub_d_char2_NE(info);
		else if (ne == Cnd_sub_d_char3) doCnd_sub_d_char3_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_trd_cd) doRslt_trd_cd_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_io_typ) doRslt_io_typ_NE(info);
		else if (ne == columnRslt_io_typ_nm) doRslt_io_typ_nm_NE(info);
		else if (ne == columnRslt_ver_no) doRslt_ver_no_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
		else if (ne == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NE(info);
		else if (ne == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NE(info);
		else if (ne == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NE(info);
		else if (ne == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_NE(info);
		else if (ne == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_NE(info);
		else if (ne == columnRslt_pack_unit_dec_place) doRslt_pack_unit_dec_place_NE(info);
		else if (ne == columnRslt_pack_unit_rnd_typ) doRslt_pack_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_stk_xfr_act_dt) doRslt_stk_xfr_act_dt_NE(info);
		else if (ne == columnRslt_stk_xfr_act_hm) doRslt_stk_xfr_act_hm_NE(info);
		else if (ne == columnRslt_ac_dt) doRslt_ac_dt_NE(info);
		else if (ne == columnRslt_loc_cd) doRslt_loc_cd_NE(info);
		else if (ne == columnRslt_loc_nm) doRslt_loc_nm_NE(info);
		else if (ne == columnRslt_str_ln_cd) doRslt_str_ln_cd_NE(info);
		else if (ne == columnRslt_str_ln_nm) doRslt_str_ln_nm_NE(info);
		else if (ne == columnRslt_str_ln_cd_none_flg) doRslt_str_ln_cd_none_flg_NE(info);
		else if (ne == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NE(info);
		else if (ne == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NE(info);
		else if (ne == columnRslt_quality_typ) doRslt_quality_typ_NE(info);
		else if (ne == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NE(info);
		else if (ne == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NE(info);
		else if (ne == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NE(info);
		else if (ne == columnRslt_stk_id_typ) doRslt_stk_id_typ_NE(info);
		else if (ne == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NE(info);
		else if (ne == columnRslt_gd_cd) doRslt_gd_cd_NE(info);
		else if (ne == columnRslt_gd_nm) doRslt_gd_nm_NE(info);
		else if (ne == columnRslt_act_usr_cd) doRslt_act_usr_cd_NE(info);
		else if (ne == columnRslt_act_usr_nm) doRslt_act_usr_nm_NE(info);
		else if (ne == columnRslt_act_dpt_cd) doRslt_act_dpt_cd_NE(info);
		else if (ne == columnRslt_act_dpt_nm) doRslt_act_dpt_nm_NE(info);
		else if (ne == columnRslt_stk_xfr_rsn_cd) doRslt_stk_xfr_rsn_cd_NE(info);
		else if (ne == columnRslt_stk_xfr_rsn_nm) doRslt_stk_xfr_rsn_nm_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
		else if (ne == columnRslt_trd_rmrks) doRslt_trd_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_NE(info);
		else if (ne == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NE(info);
		else if (ne == columnRslt_sub_d_char1) doRslt_sub_d_char1_NE(info);
		else if (ne == columnRslt_sub_d_char2) doRslt_sub_d_char2_NE(info);
		else if (ne == columnRslt_sub_d_char3) doRslt_sub_d_char3_NE(info);
		else if (ne == columnRslt_disp_seq) doRslt_disp_seq_NE(info);
		else if (ne == columnRslt_fix_no_typ) doRslt_fix_no_typ_NE(info);
		else if (ne == columnRslt_fix_no_typ_nm) doRslt_fix_no_typ_nm_NE(info);
		else if (ne == columnRslt_fix_no) doRslt_fix_no_NE(info);
		else if (ne == columnRslt_stk_xfr_act_no) doRslt_stk_xfr_act_no_NE(info);
		else if (ne == columnRslt_stk_xfr_act_d_no) doRslt_stk_xfr_act_d_no_NE(info);
		else if (ne == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_xfr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_xfr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_xfr_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_xfr_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_xfr_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_xfr_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_d_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_d_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_d_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_act_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_act_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_act_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_act_hm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_cd_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_none_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_d_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_d_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_d_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_d_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_d_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_d_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NE(MCEventInfo info){
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
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == FoldTab) doFold_NX(info);
		else if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_trd_cd) doCnd_trd_cd_NX(info);
		else if (nx == Cnd_trd_nm) doCnd_trd_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_stk_xfr_act_no) doCnd_stk_xfr_act_no_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_str_ln_cd) doCnd_str_ln_cd_NX(info);
		else if (nx == Cnd_str_ln_nm) doCnd_str_ln_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_ac_dt_fr) doCnd_ac_dt_fr_NX(info);
		else if (nx == Cnd_ac_dt_to) doCnd_ac_dt_to_NX(info);
		else if (nx == Cnd_act_usr_cd) doCnd_act_usr_cd_NX(info);
		else if (nx == Cnd_act_usr_nm) doCnd_act_usr_nm_NX(info);
		else if (nx == Cnd_act_dpt_cd) doCnd_act_dpt_cd_NX(info);
		else if (nx == Cnd_act_dpt_nm) doCnd_act_dpt_nm_NX(info);
		else if (nx == Cnd_stk_xfr_rsn_cd) doCnd_stk_xfr_rsn_cd_NX(info);
		else if (nx == Cnd_stk_xfr_rsn_nm) doCnd_stk_xfr_rsn_nm_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_trd_rmrks) doCnd_trd_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_NX(info);
		else if (nx == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_NX(info);
		else if (nx == Cnd_sub_d_char1) doCnd_sub_d_char1_NX(info);
		else if (nx == Cnd_sub_d_char2) doCnd_sub_d_char2_NX(info);
		else if (nx == Cnd_sub_d_char3) doCnd_sub_d_char3_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_trd_cd) doRslt_trd_cd_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_io_typ) doRslt_io_typ_NX(info);
		else if (nx == columnRslt_io_typ_nm) doRslt_io_typ_nm_NX(info);
		else if (nx == columnRslt_ver_no) doRslt_ver_no_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
		else if (nx == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_NX(info);
		else if (nx == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_NX(info);
		else if (nx == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_NX(info);
		else if (nx == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_NX(info);
		else if (nx == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_NX(info);
		else if (nx == columnRslt_pack_unit_dec_place) doRslt_pack_unit_dec_place_NX(info);
		else if (nx == columnRslt_pack_unit_rnd_typ) doRslt_pack_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_stk_xfr_act_dt) doRslt_stk_xfr_act_dt_NX(info);
		else if (nx == columnRslt_stk_xfr_act_hm) doRslt_stk_xfr_act_hm_NX(info);
		else if (nx == columnRslt_ac_dt) doRslt_ac_dt_NX(info);
		else if (nx == columnRslt_loc_cd) doRslt_loc_cd_NX(info);
		else if (nx == columnRslt_loc_nm) doRslt_loc_nm_NX(info);
		else if (nx == columnRslt_str_ln_cd) doRslt_str_ln_cd_NX(info);
		else if (nx == columnRslt_str_ln_nm) doRslt_str_ln_nm_NX(info);
		else if (nx == columnRslt_str_ln_cd_none_flg) doRslt_str_ln_cd_none_flg_NX(info);
		else if (nx == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NX(info);
		else if (nx == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NX(info);
		else if (nx == columnRslt_quality_typ) doRslt_quality_typ_NX(info);
		else if (nx == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NX(info);
		else if (nx == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NX(info);
		else if (nx == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NX(info);
		else if (nx == columnRslt_stk_id_typ) doRslt_stk_id_typ_NX(info);
		else if (nx == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NX(info);
		else if (nx == columnRslt_gd_cd) doRslt_gd_cd_NX(info);
		else if (nx == columnRslt_gd_nm) doRslt_gd_nm_NX(info);
		else if (nx == columnRslt_act_usr_cd) doRslt_act_usr_cd_NX(info);
		else if (nx == columnRslt_act_usr_nm) doRslt_act_usr_nm_NX(info);
		else if (nx == columnRslt_act_dpt_cd) doRslt_act_dpt_cd_NX(info);
		else if (nx == columnRslt_act_dpt_nm) doRslt_act_dpt_nm_NX(info);
		else if (nx == columnRslt_stk_xfr_rsn_cd) doRslt_stk_xfr_rsn_cd_NX(info);
		else if (nx == columnRslt_stk_xfr_rsn_nm) doRslt_stk_xfr_rsn_nm_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
		else if (nx == columnRslt_trd_rmrks) doRslt_trd_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_NX(info);
		else if (nx == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NX(info);
		else if (nx == columnRslt_sub_d_char1) doRslt_sub_d_char1_NX(info);
		else if (nx == columnRslt_sub_d_char2) doRslt_sub_d_char2_NX(info);
		else if (nx == columnRslt_sub_d_char3) doRslt_sub_d_char3_NX(info);
		else if (nx == columnRslt_disp_seq) doRslt_disp_seq_NX(info);
		else if (nx == columnRslt_fix_no_typ) doRslt_fix_no_typ_NX(info);
		else if (nx == columnRslt_fix_no_typ_nm) doRslt_fix_no_typ_nm_NX(info);
		else if (nx == columnRslt_fix_no) doRslt_fix_no_NX(info);
		else if (nx == columnRslt_stk_xfr_act_no) doRslt_stk_xfr_act_no_NX(info);
		else if (nx == columnRslt_stk_xfr_act_d_no) doRslt_stk_xfr_act_d_no_NX(info);
		else if (nx == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_xfr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_xfr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_xfr_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_xfr_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_xfr_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_xfr_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_d_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_d_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_d_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_act_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_act_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_act_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_act_hm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_cd_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_none_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_d_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_d_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_d_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_d_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_d_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_d_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NX(MCEventInfo info){
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
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_trd_cd) doCnd_trd_cd_LC(info);
		else if (lc == Cnd_trd_nm) doCnd_trd_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_stk_xfr_act_no) doCnd_stk_xfr_act_no_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_str_ln_cd) doCnd_str_ln_cd_LC(info);
		else if (lc == Cnd_str_ln_nm) doCnd_str_ln_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_ac_dt_fr) doCnd_ac_dt_fr_LC(info);
		else if (lc == Cnd_ac_dt_to) doCnd_ac_dt_to_LC(info);
		else if (lc == Cnd_act_usr_cd) doCnd_act_usr_cd_LC(info);
		else if (lc == Cnd_act_usr_nm) doCnd_act_usr_nm_LC(info);
		else if (lc == Cnd_act_dpt_cd) doCnd_act_dpt_cd_LC(info);
		else if (lc == Cnd_act_dpt_nm) doCnd_act_dpt_nm_LC(info);
		else if (lc == Cnd_stk_xfr_rsn_cd) doCnd_stk_xfr_rsn_cd_LC(info);
		else if (lc == Cnd_stk_xfr_rsn_nm) doCnd_stk_xfr_rsn_nm_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_trd_rmrks) doCnd_trd_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == Cnd_intr_d_rmrks) doCnd_intr_d_rmrks_LC(info);
		else if (lc == Cnd_trd_d_rmrks) doCnd_trd_d_rmrks_LC(info);
		else if (lc == Cnd_sub_d_char1) doCnd_sub_d_char1_LC(info);
		else if (lc == Cnd_sub_d_char2) doCnd_sub_d_char2_LC(info);
		else if (lc == Cnd_sub_d_char3) doCnd_sub_d_char3_LC(info);
		else if (lc == columnRslt_trd_cd) doRslt_trd_cd_LC(info);
		else if (lc == columnRslt_trd_nm) doRslt_trd_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_io_typ) doRslt_io_typ_LC(info);
		else if (lc == columnRslt_io_typ_nm) doRslt_io_typ_nm_LC(info);
		else if (lc == columnRslt_ver_no) doRslt_ver_no_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
		else if (lc == columnRslt_trd_unit_cd) doRslt_trd_unit_cd_LC(info);
		else if (lc == columnRslt_trd_unit_nm) doRslt_trd_unit_nm_LC(info);
		else if (lc == columnRslt_trd_unit_dec_place) doRslt_trd_unit_dec_place_LC(info);
		else if (lc == columnRslt_trd_unit_rnd_typ) doRslt_trd_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_LC(info);
		else if (lc == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_LC(info);
		else if (lc == columnRslt_pack_unit_dec_place) doRslt_pack_unit_dec_place_LC(info);
		else if (lc == columnRslt_pack_unit_rnd_typ) doRslt_pack_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_stk_xfr_act_dt) doRslt_stk_xfr_act_dt_LC(info);
		else if (lc == columnRslt_stk_xfr_act_hm) doRslt_stk_xfr_act_hm_LC(info);
		else if (lc == columnRslt_ac_dt) doRslt_ac_dt_LC(info);
		else if (lc == columnRslt_loc_cd) doRslt_loc_cd_LC(info);
		else if (lc == columnRslt_loc_nm) doRslt_loc_nm_LC(info);
		else if (lc == columnRslt_str_ln_cd) doRslt_str_ln_cd_LC(info);
		else if (lc == columnRslt_str_ln_nm) doRslt_str_ln_nm_LC(info);
		else if (lc == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_LC(info);
		else if (lc == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_LC(info);
		else if (lc == columnRslt_quality_typ) doRslt_quality_typ_LC(info);
		else if (lc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_LC(info);
		else if (lc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_LC(info);
		else if (lc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_LC(info);
		else if (lc == columnRslt_stk_id_typ) doRslt_stk_id_typ_LC(info);
		else if (lc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_LC(info);
		else if (lc == columnRslt_gd_cd) doRslt_gd_cd_LC(info);
		else if (lc == columnRslt_gd_nm) doRslt_gd_nm_LC(info);
		else if (lc == columnRslt_act_usr_cd) doRslt_act_usr_cd_LC(info);
		else if (lc == columnRslt_act_usr_nm) doRslt_act_usr_nm_LC(info);
		else if (lc == columnRslt_act_dpt_cd) doRslt_act_dpt_cd_LC(info);
		else if (lc == columnRslt_act_dpt_nm) doRslt_act_dpt_nm_LC(info);
		else if (lc == columnRslt_stk_xfr_rsn_cd) doRslt_stk_xfr_rsn_cd_LC(info);
		else if (lc == columnRslt_stk_xfr_rsn_nm) doRslt_stk_xfr_rsn_nm_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
		else if (lc == columnRslt_trd_rmrks) doRslt_trd_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_intr_d_rmrks) doRslt_intr_d_rmrks_LC(info);
		else if (lc == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_LC(info);
		else if (lc == columnRslt_sub_d_char1) doRslt_sub_d_char1_LC(info);
		else if (lc == columnRslt_sub_d_char2) doRslt_sub_d_char2_LC(info);
		else if (lc == columnRslt_sub_d_char3) doRslt_sub_d_char3_LC(info);
		else if (lc == columnRslt_disp_seq) doRslt_disp_seq_LC(info);
		else if (lc == columnRslt_fix_no_typ) doRslt_fix_no_typ_LC(info);
		else if (lc == columnRslt_fix_no_typ_nm) doRslt_fix_no_typ_nm_LC(info);
		else if (lc == columnRslt_fix_no) doRslt_fix_no_LC(info);
		else if (lc == columnRslt_stk_xfr_act_no) doRslt_stk_xfr_act_no_LC(info);
		else if (lc == columnRslt_stk_xfr_act_d_no) doRslt_stk_xfr_act_d_no_LC(info);
		else if (lc == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[stk_xfr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_xfr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_xfr_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_xfr_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_xfr_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_xfr_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_d_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_d_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_d_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_d_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_act_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_act_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_act_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_act_hm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[act_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_act_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_d_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_d_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_d_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_d_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_d_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_d_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_xfr_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_xfr_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_trd_cd]の作成メソッド
	 */
	public MCList getCnd_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_cd]の作成メソッド
	 */
	public MCList getCnd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_lot_no]の作成メソッド
	 */
	public MCList getCnd_lot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getLotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sublot_no]の作成メソッド
	 */
	public MCList getCnd_sublot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getSublotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_act_usr_cd]の作成メソッド
	 */
	public MCList getCnd_act_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_act_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_act_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_stk_xfr_rsn_cd]の作成メソッド
	 */
	public MCList getCnd_stk_xfr_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkXfrBizRsn(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL2530.Srch01")) {
			return new MS_MSBEL2530_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL2530.Prnt01")) {
			return new MS_MSBEL2530_Prnt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL2530_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2530_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2530_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL2530_Srch01Bridge() {
			p_MS_MSBEL2530_Srch01 = new MCParam(PDef.MS_MSBEL2530_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2530_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP2530.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2530.RsltR.class));

			p_MS_MSBEL2530_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2530_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2530_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2530_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2530_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP2530.CndR up0() {
			return (mcframe.clientMSBE.MSBEP2530.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP2530.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP2530.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL2530_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP2530.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL2530_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP2530.RsltR>)p_MS_MSBEL2530_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL2530_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL2530_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL2530_Prnt01;

		/** コンストラクタ */
		protected MS_MSBEL2530_Prnt01Bridge() {
			p_MS_MSBEL2530_Prnt01 = new MCParam(PDef.MS_MSBEL2530_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL2530_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP2530.RsltR.class));
			// Down

			p_MS_MSBEL2530_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL2530_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL2530_Prnt01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL2530_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL2530_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP2530.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP2530.RsltR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBEL2530_Prnt01;
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
}