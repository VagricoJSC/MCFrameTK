package mcframe.clientMSBE.MSBEP0100;

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
import mcframe.clientMSBE.MSBEP0100.MSBEP_IoRecSrch_MC.MS_MSBEL0100_Srch01Caller;

/**
 * 画面"MSBEP_IoRecSrch"パネルクラスです。<p>
 *
 * 品目、ロット、サブロット、工場・物流倉庫ごとに、入出庫の実績を日付順に照会する画面<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_IoRecSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP0100";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [SrchMode]ブロック関連のField定義
	public MCPanel SrchModePanel = null;
	public MCTitledBorder SrchModeTitledBorder = null;
	// [SrchMode]ブロックの項目のField定義
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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * SITE,Factory/Distribution warehouse,1;SPPL,Location BP,2;LOC,Location,3;STRLN,Rack/Line,4 SITE,工場・物流倉庫,1;SPPL,場所取引先,2;LOC,場所,3;STRLN,棚・ライン,4.<p>
	 *
	 */
	public MCButtonGroup Cnd_md_Group = null;
	public MCRadioButton Cnd_md_SITE = null;
	public MCRadioButton Cnd_md_SPPL = null;
	public MCRadioButton Cnd_md_LOC = null;
	public MCRadioButton Cnd_md_STRLN = null;
	public MCLabel Cnd_act_dt_fr_Label = null;
	/**
	 * Actual date FROM 実績日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_act_dt_fr = null;
	public MCLabel Cnd_act_dt_to_Label = null;
	/**
	 * Actual date TO 実績日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_act_dt_to = null;
	public MCLabel Cnd_site_cd_Label = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField Cnd_site_nm = null;
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
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Lot]ブロック関連のField定義
	public MCPanel LotPanel = null;
	public MCTitledBorder LotTitledBorder = null;
	public MCScrollPane LotScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP0100.LotR> LotTable = null;
	// [Lot]ブロックの項目のField定義
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnLot_peg_no = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Lot_itm_p_PPanel;
	public MCColumnConfig columnLot_itm_cd;// [Lot]の[itm_p.itm_cd]を[columnLot_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnLot_itm_sub1;// [Lot]の[itm_p.itm_sub1]を[columnLot_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnLot_itm_sub2;// [Lot]の[itm_p.itm_sub2]を[columnLot_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnLot_itm_sub3;// [Lot]の[itm_p.itm_sub3]を[columnLot_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnLot_itm_nm;// [Lot]の[itm_p.itm_nm]を[columnLot_itm_nm]としてエイリアス定義。
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnLot_sublot_mng_typ = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Lot_ver_no_p_PPanel;
	public MCColumnConfig columnLot_ver_no;// [Lot]の[ver_no_p.ver_no]を[columnLot_ver_no]としてエイリアス定義。
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnLot_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnLot_sublot_no = null;
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnLot_bp_lot_no = null;
	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCColumnConfig columnLot_first_gr_dt = null;
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCColumnConfig columnLot_vld_dt = null;
	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCColumnConfig columnLot_lmt_dt = null;
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnLot_insp_no = null;
	/**
	 * Start date 開始日.<p>
	 *
	 */
	public MCColumnConfig columnLot_st_dt = null;
	/**
	 * Start time 開始時刻.<p>
	 *
	 */
	public MCColumnConfig columnLot_st_hm = null;
	/**
	 * End date 終了日.<p>
	 *
	 */
	public MCColumnConfig columnLot_end_dt = null;
	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public MCColumnConfig columnLot_end_hm = null;
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCColumnConfig columnLot_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCColumnConfig columnLot_quality_typ_nm = null;
	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public MCColumnConfig columnLot_judg_dt = null;
	/**
	 * Decision result type 判定結果区分.<p>
	 *
	 */
	public MCColumnConfig columnLot_insp_judg_rslt_typ = null;
	/**
	 * Decision result type name 判定結果区分名.<p>
	 *
	 */
	public MCColumnConfig columnLot_insp_judg_rslt_typ_nm = null;
	/**
	 * Number of inspection results 検査実績件数.<p>
	 *
	 */
	public MCColumnConfig columnLot_insp_cnt = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLot_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnLot_site_nm = null;
	/**
	 * Location BP cd. 場所取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLot_loc_sppl_cd = null;
	/**
	 * Location BP name 場所取引先名.<p>
	 *
	 */
	public MCColumnConfig columnLot_loc_sppl_nm = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLot_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnLot_loc_nm = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Lot_str_ln_p_PPanel;
	public MCColumnConfig columnLot_str_ln_cd;// [Lot]の[str_ln_p.str_ln_cd]を[columnLot_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnLot_str_ln_nm;// [Lot]の[str_ln_p.str_ln_nm]を[columnLot_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnLot_str_ln_cd_none_flg;// [Lot]の[str_ln_p.str_ln_cd_none_flg]を[columnLot_str_ln_cd_none_flg]としてエイリアス定義。
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCTitledBorder DtlTitledBorder = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP0100.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_peg_no = null;
	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_dt = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_nm = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_ptn_typ = null;
	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_ptn_typ_nm = null;
	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_act_typ = null;
	/**
	 * GR/GI type name 受払区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_act_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_base_unit_gr_qty_p_PPanel;
	public MCColumnConfig columnDtl_base_unit_gr_qty;// [Dtl]の[base_unit_gr_qty_p.qty]を[columnDtl_base_unit_gr_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_base_unit_gi_qty_p_PPanel;
	public MCColumnConfig columnDtl_base_unit_gi_qty;// [Dtl]の[base_unit_gi_qty_p.qty]を[columnDtl_base_unit_gi_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_base_unit_qty;// [Dtl]の[base_unit_qty_p.qty]を[columnDtl_base_unit_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_pack_unit_gr_qty_p_PPanel;
	public MCColumnConfig columnDtl_pack_unit_gr_qty;// [Dtl]の[pack_unit_gr_qty_p.qty]を[columnDtl_pack_unit_gr_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_pack_unit_gi_qty_p_PPanel;
	public MCColumnConfig columnDtl_pack_unit_gi_qty;// [Dtl]の[pack_unit_gi_qty_p.qty]を[columnDtl_pack_unit_gi_qty]としてエイリアス定義。
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pack_unit_cd = null;
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pack_unit_nm = null;
	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pack_unit_dec_place = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_nm = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Dtl_str_ln_p_PPanel;
	public MCColumnConfig columnDtl_str_ln_cd;// [Dtl]の[str_ln_p.str_ln_cd]を[columnDtl_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_str_ln_nm;// [Dtl]の[str_ln_p.str_ln_nm]を[columnDtl_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_str_ln_cd_none_flg;// [Dtl]の[str_ln_p.str_ln_cd_none_flg]を[columnDtl_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_nm = null;
	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tdlv_cd = null;
	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tdlv_nm = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_nm = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_nm = null;
	/**
	 * Movement/transport destination/source location cd. 移動・移送先／元場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xfr_loc_cd = null;
	/**
	 * Movement/transport destination/source location name 移動・移送先／元場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xfr_loc_nm = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_wrk_no_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_wrk_no_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_wrk_no_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_wrk_no_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_no;// [Dtl]の[sno_wrk_no_p.wrk_no]を[columnDtl_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_nm;// [Dtl]の[sno_wrk_no_p.wrk_nm]を[columnDtl_wrk_nm]としてエイリアス定義。
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_no = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_par_itm_p_PPanel;
	public MCColumnConfig columnDtl_par_itm_cd;// [Dtl]の[par_itm_p.itm_cd]を[columnDtl_par_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_sub1;// [Dtl]の[par_itm_p.itm_sub1]を[columnDtl_par_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_sub2;// [Dtl]の[par_itm_p.itm_sub2]を[columnDtl_par_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_sub3;// [Dtl]の[par_itm_p.itm_sub3]を[columnDtl_par_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_nm;// [Dtl]の[par_itm_p.itm_nm]を[columnDtl_par_itm_nm]としてエイリアス定義。
	/**
	 * Parent/charged lot No. 親／負担ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_lot_no = null;
	/**
	 * Parent/charged sublot No. 親／負担サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_sublot_no = null;
	/**
	 * Business reason cd. 業務理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsn_cd = null;
	/**
	 * Business reason name 業務理由名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsn_nm = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_dt = null;
	/**
	 * GR/GI type 入出庫区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_typ = null;
	/**
	 * GR/GI type name 入出庫区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_typ_nm = null;
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_inst_no = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_no = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_no = null;
	/**
	 * Slip No. 伝票ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slip_no = null;
	/**
	 * Slip sequence number 伝票連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slip_seq_no = null;
	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trn_typ = null;
	/**
	 * Transaction type name トランザクション区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trn_typ_nm = null;
	/**
	 * Header result No. ヘッダ実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_no = null;
	/**
	 * Details result No. 明細実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_act_d_no = null;
	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_srt_no = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Current inventory 現状在庫一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP0010 = null;
	/**
	 * Inventory forecasting details 在庫推移明細照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP0070 = null;
	/**
	 * GR/GI result 受払実績一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP0080 = null;
	/**
	 * Lot trace (Explosion) ロットトレース（原因調査）.<p>
	 *
	 */
	public MCButton Btn_open_MSBFP0120 = null;
	/**
	 * Lot trace (Implosion) ロットトレース（影響調査）.<p>
	 *
	 */
	public MCButton Btn_open_MSBFP0130 = null;
	/**
	 * Inspection result 検査実績一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBFP0060 = null;
	/** [SRCH_SITE]モードを表す定数 */
	public static final String SRCH_SITE = "SRCH_SITE";
	/** [REF_SITE]モードを表す定数 */
	public static final String REF_SITE = "REF_SITE";
	/** [SRCH_SPPL]モードを表す定数 */
	public static final String SRCH_SPPL = "SRCH_SPPL";
	/** [REF_SPPL]モードを表す定数 */
	public static final String REF_SPPL = "REF_SPPL";
	/** [SRCH_LOC]モードを表す定数 */
	public static final String SRCH_LOC = "SRCH_LOC";
	/** [REF_LOC]モードを表す定数 */
	public static final String REF_LOC = "REF_LOC";
	/** [SRCH_STRLN]モードを表す定数 */
	public static final String SRCH_STRLN = "SRCH_STRLN";
	/** [REF_STRLN]モードを表す定数 */
	public static final String REF_STRLN = "REF_STRLN";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_SITE, REF_SITE, SRCH_SPPL, REF_SPPL, SRCH_LOC, REF_LOC, SRCH_STRLN, REF_STRLN};
	
	/** [MS_MSBEL0100_Srch01]のCallerの作成 */
	protected MSBEP_IoRecSrch_MC.MS_MSBEL0100_Srch01Caller createMS_MSBEL0100_Srch01() {
		MSBEP_IoRecSrch_MC.MS_MSBEL0100_Srch01Caller<MSBEP_IoRecSrch, MS_MSBEL0100_Srch01Bridge>
		caller = ((MSBEP_IoRecSrch_MC)this).new MS_MSBEL0100_Srch01Caller<MSBEP_IoRecSrch, MS_MSBEL0100_Srch01Bridge>(
					(MSBEP_IoRecSrch)this, new MS_MSBEL0100_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL0100_Srch01]の呼び出し */
	protected void callMS_MSBEL0100_Srch01() {
		MCCaller caller = createMS_MSBEL0100_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP0100.CndR aCndR;
	/** [Lot]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP0100.LotR> aLotL;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP0100.DtlR> aDtlL;
	/** [DtlHide]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP0100.DtlR> aDtlHideL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP0100.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP0100.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP0100.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP0100.CndR.create();
	}

	/**
	 * コピーによってaLotLを設定します。
	 *
	 * aLotLのインスタンスは変更されません。
	 *
	 * @param dataset LotL
	 */
	public void setLotL(MCList<mcframe.clientMSBE.MSBEP0100.LotR> aList) {
		if (getLotL() != aList) {
			getLotL().setAll(aList);
		}
	}

	/**
	 * [Lot]ブロックのコンテナaLotLを返します。
	 *
	 * @return LotL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0100.LotR> getLotL() {
		return aLotL;
	}

	/**
	 * aLotRを作成します。
	 *
	 * @return LotR
	 */
	public mcframe.clientMSBE.MSBEP0100.LotR createLotR() {
		return mcframe.clientMSBE.MSBEP0100.LotR.create();
	}

	/**
	 * aLotLを作成します。
	 *
	 * @return LotL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0100.LotR> createLotL() {
		return MCList.create(mcframe.clientMSBE.MSBEP0100.LotR.class);
	}

	/**
	 * LotTableを初期化します。
	 */
	protected void createLotTable(){
		if(LotTable == null){
			LotTable = beansFactory.createTable2("Lot.table");
		}
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBE.MSBEP0100.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0100.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBE.MSBEP0100.DtlR createDtlR() {
		return mcframe.clientMSBE.MSBEP0100.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0100.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBE.MSBEP0100.DtlR.class);
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
	 * コピーによってaDtlHideLを設定します。
	 *
	 * aDtlHideLのインスタンスは変更されません。
	 *
	 * @param dataset DtlHideL
	 */
	public void setDtlHideL(MCList<mcframe.clientMSBE.MSBEP0100.DtlR> aList) {
		if (getDtlHideL() != aList) {
			getDtlHideL().setAll(aList);
		}
	}

	/**
	 * [DtlHide]ブロックのコンテナaDtlHideLを返します。
	 *
	 * @return DtlHideL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0100.DtlR> getDtlHideL() {
		return aDtlHideL;
	}

	/**
	 * aDtlHideRを作成します。
	 *
	 * @return DtlHideR
	 */
	public mcframe.clientMSBE.MSBEP0100.DtlR createDtlHideR() {
		return mcframe.clientMSBE.MSBEP0100.DtlR.create();
	}

	/**
	 * aDtlHideLを作成します。
	 *
	 * @return DtlHideL
	 */
	public MCList<mcframe.clientMSBE.MSBEP0100.DtlR> createDtlHideL() {
		return MCList.create(mcframe.clientMSBE.MSBEP0100.DtlR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getLotL())) ret.add(getLotL());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getDtlHideL())) ret.add(getDtlHideL());
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
		if(aCnt == getLotL()) return "Lot";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getDtlHideL()) return "DtlHide";
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
		if(bId.equals("Lot")) return getLotL();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("DtlHide")) return getDtlHideL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(SrchModePanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(CtrlPanel);
		ret.add(LotPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_IoRecSrch_MC_A() {
		aCndR = createCndR();
		aLotL = createLotL();
		aDtlL = createDtlL();
		aDtlHideL = createDtlHideL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_IoRecSrch_MC_A(String name) {
		aCndR = createCndR();
		aLotL = createLotL();
		createLotTable();
		LotTable.setRowName(name);
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aDtlHideL = createDtlHideL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBEP_IoRecSrch_MC.jbCreateSrchMode((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbCreateTop((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbCreateFold((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbCreateTab1((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbCreateTab2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbCreateCnd((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbCreateCnd2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbCreateCtrl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbCreateLot((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbCreateDtl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbCreateBtn((MSBEP_IoRecSrch)this);
	}

	/**
	 * [SrchMode]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchMode(MSBEP_IoRecSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_IoRecSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_IoRecSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBEP_IoRecSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBEP_IoRecSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_IoRecSrch p) {
		p.Cnd_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().itm_typ_p());
		p.Cnd_itm_typ_p_PPanel.setName("Cnd.itm_typ_p");
		p.Cnd_itm_typ = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_itm_typ.addAliasName("Cnd.itm_typ", p);
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
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MSBEP_IoRecSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBEP_IoRecSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Lot]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLot(MSBEP_IoRecSrch p) {
		p.Lot_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP0100.LotR.$itm_p);
		p.Lot_itm_p_PPanel.setName("Lot.itm_p");
		p.columnLot_itm_cd = p.Lot_itm_p_PPanel.columnItm_itm_cd;
		p.columnLot_itm_cd.addAliasName("Lot.itm_cd", p);
		p.columnLot_itm_sub1 = p.Lot_itm_p_PPanel.columnItm_itm_sub1;
		p.columnLot_itm_sub1.addAliasName("Lot.itm_sub1", p);
		p.columnLot_itm_sub2 = p.Lot_itm_p_PPanel.columnItm_itm_sub2;
		p.columnLot_itm_sub2.addAliasName("Lot.itm_sub2", p);
		p.columnLot_itm_sub3 = p.Lot_itm_p_PPanel.columnItm_itm_sub3;
		p.columnLot_itm_sub3.addAliasName("Lot.itm_sub3", p);
		p.columnLot_itm_nm = p.Lot_itm_p_PPanel.columnItm_itm_nm;
		p.columnLot_itm_nm.addAliasName("Lot.itm_nm", p);
		p.Lot_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBE.MSBEP0100.LotR.$ver_no_p);
		p.Lot_ver_no_p_PPanel.setName("Lot.ver_no_p");
		p.columnLot_ver_no = p.Lot_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnLot_ver_no.addAliasName("Lot.ver_no", p);
		p.Lot_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBE.MSBEP0100.LotR.$str_ln_p);
		p.Lot_str_ln_p_PPanel.setName("Lot.str_ln_p");
		p.columnLot_str_ln_cd = p.Lot_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnLot_str_ln_cd.addAliasName("Lot.str_ln_cd", p);
		p.columnLot_str_ln_nm = p.Lot_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnLot_str_ln_nm.addAliasName("Lot.str_ln_nm", p);
		p.columnLot_str_ln_cd_none_flg = p.Lot_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnLot_str_ln_cd_none_flg.addAliasName("Lot.str_ln_cd_none_flg", p);
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBEP_IoRecSrch p) {
		p.Dtl_base_unit_gr_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0100.DtlR.$base_unit_gr_qty_p);
		p.Dtl_base_unit_gr_qty_p_PPanel.setName("Dtl.base_unit_gr_qty_p");
		p.columnDtl_base_unit_gr_qty = p.Dtl_base_unit_gr_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_unit_gr_qty.addAliasName("Dtl.base_unit_gr_qty", p);
		p.Dtl_base_unit_gi_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0100.DtlR.$base_unit_gi_qty_p);
		p.Dtl_base_unit_gi_qty_p_PPanel.setName("Dtl.base_unit_gi_qty_p");
		p.columnDtl_base_unit_gi_qty = p.Dtl_base_unit_gi_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_unit_gi_qty.addAliasName("Dtl.base_unit_gi_qty", p);
		p.Dtl_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0100.DtlR.$base_unit_qty_p);
		p.Dtl_base_unit_qty_p_PPanel.setName("Dtl.base_unit_qty_p");
		p.columnDtl_base_unit_qty = p.Dtl_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_unit_qty.addAliasName("Dtl.base_unit_qty", p);
		p.Dtl_pack_unit_gr_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0100.DtlR.$pack_unit_gr_qty_p);
		p.Dtl_pack_unit_gr_qty_p_PPanel.setName("Dtl.pack_unit_gr_qty_p");
		p.columnDtl_pack_unit_gr_qty = p.Dtl_pack_unit_gr_qty_p_PPanel.columnQty_qty;
		p.columnDtl_pack_unit_gr_qty.addAliasName("Dtl.pack_unit_gr_qty", p);
		p.Dtl_pack_unit_gi_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP0100.DtlR.$pack_unit_gi_qty_p);
		p.Dtl_pack_unit_gi_qty_p_PPanel.setName("Dtl.pack_unit_gi_qty_p");
		p.columnDtl_pack_unit_gi_qty = p.Dtl_pack_unit_gi_qty_p_PPanel.columnQty_qty;
		p.columnDtl_pack_unit_gi_qty.addAliasName("Dtl.pack_unit_gi_qty", p);
		p.Dtl_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBE.MSBEP0100.DtlR.$str_ln_p);
		p.Dtl_str_ln_p_PPanel.setName("Dtl.str_ln_p");
		p.columnDtl_str_ln_cd = p.Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnDtl_str_ln_cd.addAliasName("Dtl.str_ln_cd", p);
		p.columnDtl_str_ln_nm = p.Dtl_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnDtl_str_ln_nm.addAliasName("Dtl.str_ln_nm", p);
		p.columnDtl_str_ln_cd_none_flg = p.Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnDtl_str_ln_cd_none_flg.addAliasName("Dtl.str_ln_cd_none_flg", p);
		p.Dtl_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP0100.DtlR.$sno_wrk_no_p);
		p.Dtl_sno_wrk_no_p_PPanel.setName("Dtl.sno_wrk_no_p");
		p.columnDtl_sno1 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnDtl_sno1.addAliasName("Dtl.sno1", p);
		p.columnDtl_sno2 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnDtl_sno2.addAliasName("Dtl.sno2", p);
		p.columnDtl_sno3 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnDtl_sno3.addAliasName("Dtl.sno3", p);
		p.columnDtl_sno4 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnDtl_sno4.addAliasName("Dtl.sno4", p);
		p.columnDtl_wrk_no = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnDtl_wrk_no.addAliasName("Dtl.wrk_no", p);
		p.columnDtl_wrk_nm = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnDtl_wrk_nm.addAliasName("Dtl.wrk_nm", p);
		p.Dtl_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP0100.DtlR.$par_itm_p);
		p.Dtl_par_itm_p_PPanel.setName("Dtl.par_itm_p");
		p.columnDtl_par_itm_cd = p.Dtl_par_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_par_itm_cd.addAliasName("Dtl.par_itm_cd", p);
		p.columnDtl_par_itm_sub1 = p.Dtl_par_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_par_itm_sub1.addAliasName("Dtl.par_itm_sub1", p);
		p.columnDtl_par_itm_sub2 = p.Dtl_par_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_par_itm_sub2.addAliasName("Dtl.par_itm_sub2", p);
		p.columnDtl_par_itm_sub3 = p.Dtl_par_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_par_itm_sub3.addAliasName("Dtl.par_itm_sub3", p);
		p.columnDtl_par_itm_nm = p.Dtl_par_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_par_itm_nm.addAliasName("Dtl.par_itm_nm", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_IoRecSrch p) {
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

	
	/** [Cnd_site_cd_ListPutter]の定義 */
	private MCListPutter Cnd_site_cd_p = null;

	/**
	 * [Cnd_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_site_cd_ListPutter() {
		if (Cnd_site_cd_p == null) {
			Cnd_site_cd_p = createCnd_site_cd_ListPutter(Cnd_site_cd, "site_cd", "site_nm");

		}
		return Cnd_site_cd_p;
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
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_cd_p = createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_itm_p_PPanel.Itm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3");
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
			Cnd_itm_p_PPanel_Itm_itm_sub1_p = createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3");
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
			Cnd_itm_p_PPanel_Itm_itm_sub2_p = createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3");
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
			Cnd_itm_p_PPanel_Itm_itm_sub3_p = createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub3, "itm_sub3", "itm_nm");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub3_p;
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_IoRecSrch create(){
		MSBEP_IoRecSrch p = new MSBEP_IoRecSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_IoRecSrch create(String name){
		MSBEP_IoRecSrch p = new MSBEP_IoRecSrch(name);
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
		MSBEP_IoRecSrch_MC.jbfInitSrchMode((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbfInitTop((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbfInitFold((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbfInitTab1((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbfInitTab2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbfInitCnd((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbfInitCnd2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbfInitCtrl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbfInitLot((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbfInitDtl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbfInitBtn((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbInitSrchMode((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbInitTop((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbInitFold((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbInitTab1((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbInitTab2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbInitCnd((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbInitCnd2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbInitCtrl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbInitLot((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbInitDtl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.jbInitBtn((MSBEP_IoRecSrch)this);
	}

	/**
	 * [SrchMode]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchMode(MSBEP_IoRecSrch p) {
		// ブロック関連の初期化
		p.SrchModePanel = p.beansFactory.createPanel("SrchMode");
		p.SrchModeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_IoRecSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_IoRecSrch p) {
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
	protected static void jbfInitTab1(MSBEP_IoRecSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBEP_IoRecSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_IoRecSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_md_Group = p.beansFactory.createButtonGroup("Cnd.md");
		p.Cnd_md_SITE = p.beansFactory.createRadioButton("Cnd.md_SITE");
		p.Cnd_md_SPPL = p.beansFactory.createRadioButton("Cnd.md_SPPL");
		p.Cnd_md_LOC = p.beansFactory.createRadioButton("Cnd.md_LOC");
		p.Cnd_md_STRLN = p.beansFactory.createRadioButton("Cnd.md_STRLN");
		p.Cnd_act_dt_fr_Label = p.beansFactory.createLabel("Cnd.act_dt_fr_Label");
		p.Cnd_act_dt_fr = p.beansFactory.createDateField("Cnd.act_dt_fr");
		p.Cnd_act_dt_fr.setLabel(p.Cnd_act_dt_fr_Label);
		p.Cnd_act_dt_to_Label = p.beansFactory.createLabel("Cnd.act_dt_to_Label");
		p.Cnd_act_dt_to = p.beansFactory.createDateField("Cnd.act_dt_to");
		p.Cnd_act_dt_to.setLabel(p.Cnd_act_dt_to_Label);
		p.Cnd_site_cd_Label = p.beansFactory.createLabel("Cnd.site_cd_Label");
		p.Cnd_site_cd = p.beansFactory.createTextComboBox("Cnd.site_cd");
		p.Cnd_site_cd.setLabel(p.Cnd_site_cd_Label);
		p.Cnd_site_nm = p.beansFactory.createTextField("Cnd.site_nm");
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
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBEP_IoRecSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_IoRecSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Lot]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLot(MSBEP_IoRecSrch p) {
		// ブロック関連の初期化
		p.LotPanel = p.beansFactory.createPanel("Lot");
		p.LotTitledBorder = p.beansFactory.createTitledBorder();
		p.LotScrollPane = p.beansFactory.createScrollPane("Lot.scroll");
		p.createLotTable();
		// ブロックの項目の初期化
		p.columnLot_peg_no = p.beansFactory.createTableColumn("Lot.peg_no", MCColumnType.NUMBER);
		p.columnLot_sublot_mng_typ = p.beansFactory.createTableColumn("Lot.sublot_mng_typ", MCColumnType.TEXT);
		p.columnLot_lot_no = p.beansFactory.createTableColumn("Lot.lot_no", MCColumnType.TEXT);
		p.columnLot_sublot_no = p.beansFactory.createTableColumn("Lot.sublot_no", MCColumnType.TEXT);
		p.columnLot_bp_lot_no = p.beansFactory.createTableColumn("Lot.bp_lot_no", MCColumnType.TEXT);
		p.columnLot_first_gr_dt = p.beansFactory.createTableColumn("Lot.first_gr_dt", MCColumnType.DATE);
		p.columnLot_vld_dt = p.beansFactory.createTableColumn("Lot.vld_dt", MCColumnType.DATE);
		p.columnLot_lmt_dt = p.beansFactory.createTableColumn("Lot.lmt_dt", MCColumnType.DATE);
		p.columnLot_insp_no = p.beansFactory.createTableColumn("Lot.insp_no", MCColumnType.TEXT);
		p.columnLot_st_dt = p.beansFactory.createTableColumn("Lot.st_dt", MCColumnType.DATE);
		p.columnLot_st_hm = p.beansFactory.createTableColumn("Lot.st_hm", MCColumnType.DATE);
		p.columnLot_end_dt = p.beansFactory.createTableColumn("Lot.end_dt", MCColumnType.DATE);
		p.columnLot_end_hm = p.beansFactory.createTableColumn("Lot.end_hm", MCColumnType.DATE);
		p.columnLot_quality_typ = p.beansFactory.createTableColumn("Lot.quality_typ", MCColumnType.TEXT);
		p.columnLot_quality_typ_nm = p.beansFactory.createTableColumn("Lot.quality_typ_nm", MCColumnType.TEXT);
		p.columnLot_judg_dt = p.beansFactory.createTableColumn("Lot.judg_dt", MCColumnType.DATE);
		p.columnLot_insp_judg_rslt_typ = p.beansFactory.createTableColumn("Lot.insp_judg_rslt_typ", MCColumnType.TEXT);
		p.columnLot_insp_judg_rslt_typ_nm = p.beansFactory.createTableColumn("Lot.insp_judg_rslt_typ_nm", MCColumnType.TEXT);
		p.columnLot_insp_cnt = p.beansFactory.createTableColumn("Lot.insp_cnt", MCColumnType.NUMBER);
		p.columnLot_site_cd = p.beansFactory.createTableColumn("Lot.site_cd", MCColumnType.TEXT);
		p.columnLot_site_nm = p.beansFactory.createTableColumn("Lot.site_nm", MCColumnType.TEXT);
		p.columnLot_loc_sppl_cd = p.beansFactory.createTableColumn("Lot.loc_sppl_cd", MCColumnType.TEXT);
		p.columnLot_loc_sppl_nm = p.beansFactory.createTableColumn("Lot.loc_sppl_nm", MCColumnType.TEXT);
		p.columnLot_loc_cd = p.beansFactory.createTableColumn("Lot.loc_cd", MCColumnType.TEXT);
		p.columnLot_loc_nm = p.beansFactory.createTableColumn("Lot.loc_nm", MCColumnType.TEXT);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBEP_IoRecSrch p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlTitledBorder = p.beansFactory.createTitledBorder();
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_peg_no = p.beansFactory.createTableColumn("Dtl.peg_no", MCColumnType.NUMBER);
		p.columnDtl_act_dt = p.beansFactory.createTableColumn("Dtl.act_dt", MCColumnType.DATE);
		p.columnDtl_trd_cd = p.beansFactory.createTableColumn("Dtl.trd_cd", MCColumnType.TEXT);
		p.columnDtl_trd_nm = p.beansFactory.createTableColumn("Dtl.trd_nm", MCColumnType.TEXT);
		p.columnDtl_trd_ptn_typ = p.beansFactory.createTableColumn("Dtl.trd_ptn_typ", MCColumnType.TEXT);
		p.columnDtl_trd_ptn_typ_nm = p.beansFactory.createTableColumn("Dtl.trd_ptn_typ_nm", MCColumnType.TEXT);
		p.columnDtl_io_act_typ = p.beansFactory.createTableColumn("Dtl.io_act_typ", MCColumnType.TEXT);
		p.columnDtl_io_act_typ_nm = p.beansFactory.createTableColumn("Dtl.io_act_typ_nm", MCColumnType.TEXT);
		p.columnDtl_base_unit_cd = p.beansFactory.createTableColumn("Dtl.base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_base_unit_nm = p.beansFactory.createTableColumn("Dtl.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_pack_unit_cd = p.beansFactory.createTableColumn("Dtl.pack_unit_cd", MCColumnType.TEXT);
		p.columnDtl_pack_unit_nm = p.beansFactory.createTableColumn("Dtl.pack_unit_nm", MCColumnType.TEXT);
		p.columnDtl_pack_unit_dec_place = p.beansFactory.createTableColumn("Dtl.pack_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_loc_cd = p.beansFactory.createTableColumn("Dtl.loc_cd", MCColumnType.TEXT);
		p.columnDtl_loc_nm = p.beansFactory.createTableColumn("Dtl.loc_nm", MCColumnType.TEXT);
		p.columnDtl_dlv_cd = p.beansFactory.createTableColumn("Dtl.dlv_cd", MCColumnType.TEXT);
		p.columnDtl_dlv_nm = p.beansFactory.createTableColumn("Dtl.dlv_nm", MCColumnType.TEXT);
		p.columnDtl_tdlv_cd = p.beansFactory.createTableColumn("Dtl.tdlv_cd", MCColumnType.TEXT);
		p.columnDtl_tdlv_nm = p.beansFactory.createTableColumn("Dtl.tdlv_nm", MCColumnType.TEXT);
		p.columnDtl_cst_cd = p.beansFactory.createTableColumn("Dtl.cst_cd", MCColumnType.TEXT);
		p.columnDtl_cst_nm = p.beansFactory.createTableColumn("Dtl.cst_nm", MCColumnType.TEXT);
		p.columnDtl_sppl_cd = p.beansFactory.createTableColumn("Dtl.sppl_cd", MCColumnType.TEXT);
		p.columnDtl_sppl_nm = p.beansFactory.createTableColumn("Dtl.sppl_nm", MCColumnType.TEXT);
		p.columnDtl_xfr_loc_cd = p.beansFactory.createTableColumn("Dtl.xfr_loc_cd", MCColumnType.TEXT);
		p.columnDtl_xfr_loc_nm = p.beansFactory.createTableColumn("Dtl.xfr_loc_nm", MCColumnType.TEXT);
		p.columnDtl_sublot_no = p.beansFactory.createTableColumn("Dtl.sublot_no", MCColumnType.TEXT);
		p.columnDtl_par_lot_no = p.beansFactory.createTableColumn("Dtl.par_lot_no", MCColumnType.TEXT);
		p.columnDtl_par_sublot_no = p.beansFactory.createTableColumn("Dtl.par_sublot_no", MCColumnType.TEXT);
		p.columnDtl_rsn_cd = p.beansFactory.createTableColumn("Dtl.rsn_cd", MCColumnType.TEXT);
		p.columnDtl_rsn_nm = p.beansFactory.createTableColumn("Dtl.rsn_nm", MCColumnType.TEXT);
		p.columnDtl_ac_dt = p.beansFactory.createTableColumn("Dtl.ac_dt", MCColumnType.DATE);
		p.columnDtl_io_typ = p.beansFactory.createTableColumn("Dtl.io_typ", MCColumnType.TEXT);
		p.columnDtl_io_typ_nm = p.beansFactory.createTableColumn("Dtl.io_typ_nm", MCColumnType.TEXT);
		p.columnDtl_mfg_inst_no = p.beansFactory.createTableColumn("Dtl.mfg_inst_no", MCColumnType.TEXT);
		p.columnDtl_slo_no = p.beansFactory.createTableColumn("Dtl.slo_no", MCColumnType.TEXT);
		p.columnDtl_po_no = p.beansFactory.createTableColumn("Dtl.po_no", MCColumnType.TEXT);
		p.columnDtl_slip_no = p.beansFactory.createTableColumn("Dtl.slip_no", MCColumnType.TEXT);
		p.columnDtl_slip_seq_no = p.beansFactory.createTableColumn("Dtl.slip_seq_no", MCColumnType.NUMBER);
		p.columnDtl_trn_typ = p.beansFactory.createTableColumn("Dtl.trn_typ", MCColumnType.TEXT);
		p.columnDtl_trn_typ_nm = p.beansFactory.createTableColumn("Dtl.trn_typ_nm", MCColumnType.TEXT);
		p.columnDtl_act_no = p.beansFactory.createTableColumn("Dtl.act_no", MCColumnType.TEXT);
		p.columnDtl_act_d_no = p.beansFactory.createTableColumn("Dtl.act_d_no", MCColumnType.TEXT);
		p.columnDtl_srt_no = p.beansFactory.createTableColumn("Dtl.srt_no", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_IoRecSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP0010 = p.beansFactory.createButton("Btn.open_MSBEP0010", "open");
		p.Btn_open_MSBEP0070 = p.beansFactory.createButton("Btn.open_MSBEP0070", "open");
		p.Btn_open_MSBEP0080 = p.beansFactory.createButton("Btn.open_MSBEP0080", "open");
		p.Btn_open_MSBFP0120 = p.beansFactory.createButton("Btn.open_MSBFP0120", "open");
		p.Btn_open_MSBFP0130 = p.beansFactory.createButton("Btn.open_MSBFP0130", "open");
		p.Btn_open_MSBFP0060 = p.beansFactory.createButton("Btn.open_MSBFP0060", "open");
	}

	/**
	 * [SrchMode]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchMode(MSBEP_IoRecSrch p) {
		// ブロック関連の初期化
		p.SrchModePanel.setBorder(p.SrchModeTitledBorder);
		p.add(p.SrchModePanel);
		p.setLastBeans(p.SrchModePanel);
		p.SrchModePanel.setNextBeans(p.TopPanel);
		p.SrchModePanel.setValueCheck(false);
		p.SrchModePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SrchModePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBEP_IoRecSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.LotPanel);
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
	protected static void jbInitFold(MSBEP_IoRecSrch p) {
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
	protected static void jbInitTab1(MSBEP_IoRecSrch p) {
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
	protected static void jbInitTab2(MSBEP_IoRecSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_IoRecSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.SrchModePanel.setLastBeans(p.Cnd_md_Group);
		p.Cnd_md_Group.setFirstBeans(p.Cnd_md_SITE);
		p.Cnd_md_SITE.setActionCommand("1");
		p.Cnd_md_Group.add(p.Cnd_md_SITE);
		p.SrchModePanel.add(p.Cnd_md_SITE);
		p.Cnd_md_SITE.setNextBeans(p.Cnd_md_SPPL);
		p.Cnd_md_SPPL.setActionCommand("2");
		p.Cnd_md_Group.add(p.Cnd_md_SPPL);
		p.SrchModePanel.add(p.Cnd_md_SPPL);
		p.Cnd_md_SPPL.setNextBeans(p.Cnd_md_LOC);
		p.Cnd_md_LOC.setActionCommand("3");
		p.Cnd_md_Group.add(p.Cnd_md_LOC);
		p.SrchModePanel.add(p.Cnd_md_LOC);
		p.Cnd_md_LOC.setNextBeans(p.Cnd_md_STRLN);
		p.Cnd_md_STRLN.setActionCommand("4");
		p.Cnd_md_Group.add(p.Cnd_md_STRLN);
		p.SrchModePanel.add(p.Cnd_md_STRLN);
		p.Cnd_md_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0100.CndR.md_META);
		p.CndPanel.add(p.Cnd_act_dt_fr_Label);
		p.CndPanel.add(p.Cnd_act_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_act_dt_fr);
		p.Cnd_act_dt_fr.setNextBeans(p.Cnd_act_dt_to);
		p.Cnd_act_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0100.CndR.act_dt_fr_META);
		p.Cnd_act_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_act_dt_to_Label);
		p.CndPanel.add(p.Cnd_act_dt_to);
		p.Cnd_act_dt_to.setNextBeans(p.Cnd_site_cd);
		p.Cnd_act_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0100.CndR.act_dt_to_META);
		p.Cnd_act_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0100.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0100.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0100.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_str_ln_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0100.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_str_ln_cd, true);
		p.Cnd_str_ln_cd.setLinkBeans(p.Cnd_str_ln_nm);
		p.CndPanel.add(p.Cnd_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_str_ln_cd);
		p.Cnd_str_ln_cd.setNextBeans(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0100.CndR.str_ln_cd_META);
		p.CndPanel.add(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0100.CndR.str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_str_ln_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_ver_no_p_PPanel);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_cd, true);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub3, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_nm, true);
		p.CndPanel.add(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_lot_no);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0100.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP0100.CndR.sublot_no_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBEP_IoRecSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_IoRecSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Lot]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLot(MSBEP_IoRecSrch p) {
		// ブロック関連の初期化
		p.LotPanel.setBorder(p.LotTitledBorder);
		p.add(p.LotPanel);
		p.LotPanel.setNextBeans(p.DtlPanel);
		p.LotPanel.add(p.LotScrollPane);
		p.LotPanel.setLastBeans(p.LotTable);
		p.LotScrollPane.setViewportView(p.LotTable);
		p.LotTable.setList(p.getLotL());
		p.LotTable.setStatusColumnVisible(false);
		p.LotPanel.setLayoutPosition("CBCTC");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBEP_IoRecSrch p) {
		// ブロック関連の初期化
		p.DtlPanel.setBorder(p.DtlTitledBorder);
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlTable.setStatusColumnVisible(false);
		p.DtlPanel.setLayoutPosition("CBCBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBEP_IoRecSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP0010.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBEP0010);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBEP0010);
		p.Btn_open_MSBEP0010.setNextBeans(p.Btn_open_MSBEP0070);
		p.Btn_open_MSBEP0070.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBEP0070);
		p.Btn_open_MSBEP0070.setNextBeans(p.Btn_open_MSBEP0080);
		p.Btn_open_MSBEP0080.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBEP0080);
		p.Btn_open_MSBEP0080.setNextBeans(p.Btn_open_MSBFP0120);
		p.Btn_open_MSBFP0120.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_open_MSBFP0120);
		p.Btn_open_MSBFP0120.setNextBeans(p.Btn_open_MSBFP0130);
		p.Btn_open_MSBFP0130.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_open_MSBFP0130);
		p.Btn_open_MSBFP0130.setNextBeans(p.Btn_open_MSBFP0060);
		p.Btn_open_MSBFP0060.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_open_MSBFP0060);
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
		MSBEP_IoRecSrch_MC.mcInitSrchMode((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.mcInitTop((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.mcInitFold((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.mcInitTab1((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.mcInitTab2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.mcInitCnd((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.mcInitCnd2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.mcInitCtrl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.mcInitLot((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.mcInitDtl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.mcInitBtn((MSBEP_IoRecSrch)this);

		// [SRCH_SITE]ステータスのモードの設定
		MSBEP_IoRecSrch_MC.statusInitSRCH__SITE_SrchMode((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SITE_Top((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SITE_Fold((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SITE_Tab1((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SITE_Tab2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SITE_Cnd((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SITE_Cnd2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SITE_Ctrl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SITE_Lot((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SITE_Dtl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SITE_DtlHide((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SITE_Btn((MSBEP_IoRecSrch)this);

		// [REF_SITE]ステータスのモードの設定
		MSBEP_IoRecSrch_MC.statusInitREF__SITE_SrchMode((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SITE_Top((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SITE_Fold((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SITE_Tab1((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SITE_Tab2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SITE_Cnd((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SITE_Cnd2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SITE_Ctrl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SITE_Lot((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SITE_Dtl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SITE_DtlHide((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SITE_Btn((MSBEP_IoRecSrch)this);

		// [SRCH_SPPL]ステータスのモードの設定
		MSBEP_IoRecSrch_MC.statusInitSRCH__SPPL_SrchMode((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SPPL_Top((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SPPL_Fold((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SPPL_Tab1((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SPPL_Tab2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SPPL_Cnd((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SPPL_Cnd2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SPPL_Ctrl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SPPL_Lot((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SPPL_Dtl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SPPL_DtlHide((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__SPPL_Btn((MSBEP_IoRecSrch)this);

		// [REF_SPPL]ステータスのモードの設定
		MSBEP_IoRecSrch_MC.statusInitREF__SPPL_SrchMode((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SPPL_Top((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SPPL_Fold((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SPPL_Tab1((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SPPL_Tab2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SPPL_Cnd((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SPPL_Cnd2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SPPL_Ctrl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SPPL_Lot((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SPPL_Dtl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SPPL_DtlHide((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__SPPL_Btn((MSBEP_IoRecSrch)this);

		// [SRCH_LOC]ステータスのモードの設定
		MSBEP_IoRecSrch_MC.statusInitSRCH__LOC_SrchMode((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__LOC_Top((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__LOC_Fold((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__LOC_Tab1((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__LOC_Tab2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__LOC_Cnd((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__LOC_Cnd2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__LOC_Ctrl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__LOC_Lot((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__LOC_Dtl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__LOC_DtlHide((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__LOC_Btn((MSBEP_IoRecSrch)this);

		// [REF_LOC]ステータスのモードの設定
		MSBEP_IoRecSrch_MC.statusInitREF__LOC_SrchMode((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__LOC_Top((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__LOC_Fold((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__LOC_Tab1((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__LOC_Tab2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__LOC_Cnd((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__LOC_Cnd2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__LOC_Ctrl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__LOC_Lot((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__LOC_Dtl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__LOC_DtlHide((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__LOC_Btn((MSBEP_IoRecSrch)this);

		// [SRCH_STRLN]ステータスのモードの設定
		MSBEP_IoRecSrch_MC.statusInitSRCH__STRLN_SrchMode((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__STRLN_Top((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__STRLN_Fold((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__STRLN_Tab1((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__STRLN_Tab2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__STRLN_Cnd((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__STRLN_Cnd2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__STRLN_Ctrl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__STRLN_Lot((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__STRLN_Dtl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__STRLN_DtlHide((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitSRCH__STRLN_Btn((MSBEP_IoRecSrch)this);

		// [REF_STRLN]ステータスのモードの設定
		MSBEP_IoRecSrch_MC.statusInitREF__STRLN_SrchMode((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__STRLN_Top((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__STRLN_Fold((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__STRLN_Tab1((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__STRLN_Tab2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__STRLN_Cnd((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__STRLN_Cnd2((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__STRLN_Ctrl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__STRLN_Lot((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__STRLN_Dtl((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__STRLN_DtlHide((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.statusInitREF__STRLN_Btn((MSBEP_IoRecSrch)this);

	}

	/**
	 *  [SrchMode]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchMode(MSBEP_IoRecSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_IoRecSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_IoRecSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBEP_IoRecSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBEP_IoRecSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_IoRecSrch p) {
		p.Cnd_md_Group.addAllListener(p);
		p.Cnd_md_SITE.addAllListener(p);
		p.Cnd_md_SPPL.addAllListener(p);
		p.Cnd_md_LOC.addAllListener(p);
		p.Cnd_md_STRLN.addAllListener(p);
		p.Cnd_act_dt_fr.setListListener(p);
		p.Cnd_act_dt_fr.addAllListener(p);
		p.Cnd_act_dt_to.setListListener(p);
		p.Cnd_act_dt_to.addAllListener(p);
		p.Cnd_site_cd.setListListener(p);
		p.Cnd_site_cd.addAllListener(p);
		p.Cnd_site_nm.setListListener(p);
		p.Cnd_site_nm.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_str_ln_cd.setListListener(p);
		p.Cnd_str_ln_cd.addAllListener(p);
		p.Cnd_str_ln_nm.setListListener(p);
		p.Cnd_str_ln_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBEP_IoRecSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_IoRecSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Lot]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLot(MSBEP_IoRecSrch p) {
		p.LotTable.addAllListener(p);
		p.columnLot_peg_no.addAllListener(p);
		p.columnLot_peg_no.setListListener(p);
		p.columnLot_sublot_mng_typ.addAllListener(p);
		p.columnLot_sublot_mng_typ.setListListener(p);
		p.columnLot_lot_no.addAllListener(p);
		p.columnLot_lot_no.setListListener(p);
		p.columnLot_sublot_no.addAllListener(p);
		p.columnLot_sublot_no.setListListener(p);
		p.columnLot_bp_lot_no.addAllListener(p);
		p.columnLot_bp_lot_no.setListListener(p);
		p.columnLot_first_gr_dt.addAllListener(p);
		p.columnLot_first_gr_dt.setListListener(p);
		p.columnLot_vld_dt.addAllListener(p);
		p.columnLot_vld_dt.setListListener(p);
		p.columnLot_lmt_dt.addAllListener(p);
		p.columnLot_lmt_dt.setListListener(p);
		p.columnLot_insp_no.addAllListener(p);
		p.columnLot_insp_no.setListListener(p);
		p.columnLot_st_dt.addAllListener(p);
		p.columnLot_st_dt.setListListener(p);
		p.columnLot_st_hm.addAllListener(p);
		p.columnLot_st_hm.setListListener(p);
		p.columnLot_end_dt.addAllListener(p);
		p.columnLot_end_dt.setListListener(p);
		p.columnLot_end_hm.addAllListener(p);
		p.columnLot_end_hm.setListListener(p);
		p.columnLot_quality_typ.addAllListener(p);
		p.columnLot_quality_typ.setListListener(p);
		p.columnLot_quality_typ_nm.addAllListener(p);
		p.columnLot_quality_typ_nm.setListListener(p);
		p.columnLot_judg_dt.addAllListener(p);
		p.columnLot_judg_dt.setListListener(p);
		p.columnLot_insp_judg_rslt_typ.addAllListener(p);
		p.columnLot_insp_judg_rslt_typ.setListListener(p);
		p.columnLot_insp_judg_rslt_typ_nm.addAllListener(p);
		p.columnLot_insp_judg_rslt_typ_nm.setListListener(p);
		p.columnLot_insp_cnt.addAllListener(p);
		p.columnLot_insp_cnt.setListListener(p);
		p.columnLot_site_cd.addAllListener(p);
		p.columnLot_site_cd.setListListener(p);
		p.columnLot_site_nm.addAllListener(p);
		p.columnLot_site_nm.setListListener(p);
		p.columnLot_loc_sppl_cd.addAllListener(p);
		p.columnLot_loc_sppl_cd.setListListener(p);
		p.columnLot_loc_sppl_nm.addAllListener(p);
		p.columnLot_loc_sppl_nm.setListListener(p);
		p.columnLot_loc_cd.addAllListener(p);
		p.columnLot_loc_cd.setListListener(p);
		p.columnLot_loc_nm.addAllListener(p);
		p.columnLot_loc_nm.setListListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBEP_IoRecSrch p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_peg_no.addAllListener(p);
		p.columnDtl_peg_no.setListListener(p);
		p.columnDtl_act_dt.addAllListener(p);
		p.columnDtl_act_dt.setListListener(p);
		p.columnDtl_trd_cd.addAllListener(p);
		p.columnDtl_trd_cd.setListListener(p);
		p.columnDtl_trd_nm.addAllListener(p);
		p.columnDtl_trd_nm.setListListener(p);
		p.columnDtl_trd_ptn_typ.addAllListener(p);
		p.columnDtl_trd_ptn_typ.setListListener(p);
		p.columnDtl_trd_ptn_typ_nm.addAllListener(p);
		p.columnDtl_trd_ptn_typ_nm.setListListener(p);
		p.columnDtl_io_act_typ.addAllListener(p);
		p.columnDtl_io_act_typ.setListListener(p);
		p.columnDtl_io_act_typ_nm.addAllListener(p);
		p.columnDtl_io_act_typ_nm.setListListener(p);
		p.columnDtl_base_unit_cd.addAllListener(p);
		p.columnDtl_base_unit_cd.setListListener(p);
		p.columnDtl_base_unit_nm.addAllListener(p);
		p.columnDtl_base_unit_nm.setListListener(p);
		p.columnDtl_base_unit_dec_place.addAllListener(p);
		p.columnDtl_base_unit_dec_place.setListListener(p);
		p.columnDtl_pack_unit_cd.addAllListener(p);
		p.columnDtl_pack_unit_cd.setListListener(p);
		p.columnDtl_pack_unit_nm.addAllListener(p);
		p.columnDtl_pack_unit_nm.setListListener(p);
		p.columnDtl_pack_unit_dec_place.addAllListener(p);
		p.columnDtl_pack_unit_dec_place.setListListener(p);
		p.columnDtl_loc_cd.addAllListener(p);
		p.columnDtl_loc_cd.setListListener(p);
		p.columnDtl_loc_nm.addAllListener(p);
		p.columnDtl_loc_nm.setListListener(p);
		p.columnDtl_dlv_cd.addAllListener(p);
		p.columnDtl_dlv_cd.setListListener(p);
		p.columnDtl_dlv_nm.addAllListener(p);
		p.columnDtl_dlv_nm.setListListener(p);
		p.columnDtl_tdlv_cd.addAllListener(p);
		p.columnDtl_tdlv_cd.setListListener(p);
		p.columnDtl_tdlv_nm.addAllListener(p);
		p.columnDtl_tdlv_nm.setListListener(p);
		p.columnDtl_cst_cd.addAllListener(p);
		p.columnDtl_cst_cd.setListListener(p);
		p.columnDtl_cst_nm.addAllListener(p);
		p.columnDtl_cst_nm.setListListener(p);
		p.columnDtl_sppl_cd.addAllListener(p);
		p.columnDtl_sppl_cd.setListListener(p);
		p.columnDtl_sppl_nm.addAllListener(p);
		p.columnDtl_sppl_nm.setListListener(p);
		p.columnDtl_xfr_loc_cd.addAllListener(p);
		p.columnDtl_xfr_loc_cd.setListListener(p);
		p.columnDtl_xfr_loc_nm.addAllListener(p);
		p.columnDtl_xfr_loc_nm.setListListener(p);
		p.columnDtl_sublot_no.addAllListener(p);
		p.columnDtl_sublot_no.setListListener(p);
		p.columnDtl_par_lot_no.addAllListener(p);
		p.columnDtl_par_lot_no.setListListener(p);
		p.columnDtl_par_sublot_no.addAllListener(p);
		p.columnDtl_par_sublot_no.setListListener(p);
		p.columnDtl_rsn_cd.addAllListener(p);
		p.columnDtl_rsn_cd.setListListener(p);
		p.columnDtl_rsn_nm.addAllListener(p);
		p.columnDtl_rsn_nm.setListListener(p);
		p.columnDtl_ac_dt.addAllListener(p);
		p.columnDtl_ac_dt.setListListener(p);
		p.columnDtl_io_typ.addAllListener(p);
		p.columnDtl_io_typ.setListListener(p);
		p.columnDtl_io_typ_nm.addAllListener(p);
		p.columnDtl_io_typ_nm.setListListener(p);
		p.columnDtl_mfg_inst_no.addAllListener(p);
		p.columnDtl_mfg_inst_no.setListListener(p);
		p.columnDtl_slo_no.addAllListener(p);
		p.columnDtl_slo_no.setListListener(p);
		p.columnDtl_po_no.addAllListener(p);
		p.columnDtl_po_no.setListListener(p);
		p.columnDtl_slip_no.addAllListener(p);
		p.columnDtl_slip_no.setListListener(p);
		p.columnDtl_slip_seq_no.addAllListener(p);
		p.columnDtl_slip_seq_no.setListListener(p);
		p.columnDtl_trn_typ.addAllListener(p);
		p.columnDtl_trn_typ.setListListener(p);
		p.columnDtl_trn_typ_nm.addAllListener(p);
		p.columnDtl_trn_typ_nm.setListListener(p);
		p.columnDtl_act_no.addAllListener(p);
		p.columnDtl_act_no.setListListener(p);
		p.columnDtl_act_d_no.addAllListener(p);
		p.columnDtl_act_d_no.setListListener(p);
		p.columnDtl_srt_no.addAllListener(p);
		p.columnDtl_srt_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_IoRecSrch p) {
		p.Btn_open_MSBEP0010.addAllListener(p);
		p.Btn_open_MSBEP0010.setAPMethodName("doBtn_open_MSBEP0010");
		p.Btn_open_MSBEP0070.addAllListener(p);
		p.Btn_open_MSBEP0070.setAPMethodName("doBtn_open_MSBEP0070");
		p.Btn_open_MSBEP0080.addAllListener(p);
		p.Btn_open_MSBEP0080.setAPMethodName("doBtn_open_MSBEP0080");
		p.Btn_open_MSBFP0120.addAllListener(p);
		p.Btn_open_MSBFP0120.setAPMethodName("doBtn_open_MSBFP0120");
		p.Btn_open_MSBFP0130.addAllListener(p);
		p.Btn_open_MSBFP0130.setAPMethodName("doBtn_open_MSBFP0130");
		p.Btn_open_MSBFP0060.addAllListener(p);
		p.Btn_open_MSBFP0060.setAPMethodName("doBtn_open_MSBFP0060");
	}

	/**
	 * [SRCH_SITE]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SITE_SrchMode(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_SITE]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SITE_Top(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_SITE]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SITE_Fold(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_SITE]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SITE_Tab1(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_SITE]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SITE_Tab2(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_SITE]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SITE_Cnd(MSBEP_IoRecSrch p){
		p.Cnd_md_Group.putMode(p, SRCH_SITE, MCMode.REQUIRED);
		p.Cnd_act_dt_fr.putMode(p, SRCH_SITE, MCMode.REQUIRED);
		p.Cnd_act_dt_to.putMode(p, SRCH_SITE, MCMode.REQUIRED);
		p.Cnd_site_cd.putMode(p, SRCH_SITE, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_SITE, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_SITE, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_SITE, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_SITE, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_SITE, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_SITE, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_SITE, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_SITE]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SITE_Cnd2(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_SITE]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SITE_Ctrl(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_SITE]ステータスの[Lot]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SITE_Lot(MSBEP_IoRecSrch p){
		p.columnLot_peg_no.putMode(p, SRCH_SITE, MCMode.INVISIBLE);
		p.Lot_itm_p_PPanel.putStatus(SRCH_SITE, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnLot_sublot_mng_typ.putMode(p, SRCH_SITE, MCMode.INVISIBLE);
		p.Lot_ver_no_p_PPanel.putStatus(SRCH_SITE, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnLot_lot_no.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnLot_sublot_no.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnLot_bp_lot_no.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnLot_first_gr_dt.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnLot_vld_dt.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnLot_lmt_dt.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnLot_insp_no.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnLot_st_dt.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnLot_st_hm.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnLot_end_dt.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnLot_end_hm.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnLot_quality_typ.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnLot_quality_typ_nm.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnLot_judg_dt.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnLot_insp_judg_rslt_typ.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnLot_insp_judg_rslt_typ_nm.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnLot_insp_cnt.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnLot_site_cd.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnLot_site_nm.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnLot_loc_sppl_cd.putMode(p, SRCH_SITE, MCMode.INVISIBLE);
		p.columnLot_loc_sppl_nm.putMode(p, SRCH_SITE, MCMode.INVISIBLE);
		p.columnLot_loc_cd.putMode(p, SRCH_SITE, MCMode.INVISIBLE);
		p.columnLot_loc_nm.putMode(p, SRCH_SITE, MCMode.INVISIBLE);
		p.Lot_str_ln_p_PPanel.putStatus(SRCH_SITE, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.INVISIBLE);

	}

	/**
	 * [SRCH_SITE]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SITE_Dtl(MSBEP_IoRecSrch p){
		p.columnDtl_peg_no.putMode(p, SRCH_SITE, MCMode.INVISIBLE);
		p.columnDtl_act_dt.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ_nm.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_io_act_typ.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_io_act_typ_nm.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.Dtl_base_unit_gr_qty_p_PPanel.putStatus(SRCH_SITE, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_gi_qty_p_PPanel.putStatus(SRCH_SITE, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH_SITE, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH_SITE, MCMode.INVISIBLE);
		p.Dtl_pack_unit_gr_qty_p_PPanel.putStatus(SRCH_SITE, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_pack_unit_gi_qty_p_PPanel.putStatus(SRCH_SITE, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_nm.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_dec_place.putMode(p, SRCH_SITE, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(SRCH_SITE, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_tdlv_cd.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_tdlv_nm.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_xfr_loc_cd.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_xfr_loc_nm.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH_SITE, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, SRCH_SITE, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, SRCH_SITE, MCMode.INVISIBLE);
		p.columnDtl_sublot_no.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(SRCH_SITE, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_par_lot_no.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_par_sublot_no.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_io_typ.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_io_typ_nm.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_slip_no.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_slip_seq_no.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_trn_typ.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_trn_typ_nm.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_act_no.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_act_d_no.putMode(p, SRCH_SITE, MCMode.READ_ONLY);
		p.columnDtl_srt_no.putMode(p, SRCH_SITE, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_SITE]ステータスの[DtlHide]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SITE_DtlHide(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_SITE]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SITE_Btn(MSBEP_IoRecSrch p){
		p.Btn_open_MSBEP0010.putMode(p, SRCH_SITE, MCMode.DISABLE);
		p.Btn_open_MSBEP0070.putMode(p, SRCH_SITE, MCMode.DISABLE);
		p.Btn_open_MSBEP0080.putMode(p, SRCH_SITE, MCMode.DISABLE);
		p.Btn_open_MSBFP0120.putMode(p, SRCH_SITE, MCMode.DISABLE);
		p.Btn_open_MSBFP0130.putMode(p, SRCH_SITE, MCMode.DISABLE);
		p.Btn_open_MSBFP0060.putMode(p, SRCH_SITE, MCMode.DISABLE);

	}

	/**
	 * [REF_SITE]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__SITE_SrchMode(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_SITE]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__SITE_Top(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_SITE]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__SITE_Fold(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_SITE]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__SITE_Tab1(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_SITE]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__SITE_Tab2(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_SITE]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SITE_Cnd(MSBEP_IoRecSrch p){
		p.Cnd_md_Group.putMode(p, REF_SITE, MCMode.REQUIRED);
		p.Cnd_act_dt_fr.putMode(p, REF_SITE, MCMode.REQUIRED);
		p.Cnd_act_dt_to.putMode(p, REF_SITE, MCMode.REQUIRED);
		p.Cnd_site_cd.putMode(p, REF_SITE, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_SITE, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_SITE, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_SITE, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_SITE, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_SITE, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_SITE, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_SITE, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_SITE]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF__SITE_Cnd2(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_SITE]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SITE_Ctrl(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_SITE]ステータスの[Lot]ブロックのモードの設定
	 */
	protected static void statusInitREF__SITE_Lot(MSBEP_IoRecSrch p){
		p.columnLot_peg_no.putMode(p, REF_SITE, MCMode.INVISIBLE);
		p.Lot_itm_p_PPanel.putStatus(REF_SITE, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnLot_sublot_mng_typ.putMode(p, REF_SITE, MCMode.INVISIBLE);
		p.Lot_ver_no_p_PPanel.putStatus(REF_SITE, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnLot_lot_no.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnLot_sublot_no.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnLot_bp_lot_no.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnLot_first_gr_dt.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnLot_vld_dt.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnLot_lmt_dt.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnLot_insp_no.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnLot_st_dt.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnLot_st_hm.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnLot_end_dt.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnLot_end_hm.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnLot_quality_typ.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnLot_quality_typ_nm.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnLot_judg_dt.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnLot_insp_judg_rslt_typ.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnLot_insp_judg_rslt_typ_nm.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnLot_insp_cnt.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnLot_site_cd.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnLot_site_nm.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnLot_loc_sppl_cd.putMode(p, REF_SITE, MCMode.INVISIBLE);
		p.columnLot_loc_sppl_nm.putMode(p, REF_SITE, MCMode.INVISIBLE);
		p.columnLot_loc_cd.putMode(p, REF_SITE, MCMode.INVISIBLE);
		p.columnLot_loc_nm.putMode(p, REF_SITE, MCMode.INVISIBLE);
		p.Lot_str_ln_p_PPanel.putStatus(REF_SITE, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.INVISIBLE);

	}

	/**
	 * [REF_SITE]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SITE_Dtl(MSBEP_IoRecSrch p){
		p.columnDtl_peg_no.putMode(p, REF_SITE, MCMode.INVISIBLE);
		p.columnDtl_act_dt.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ_nm.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_io_act_typ.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_io_act_typ_nm.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.Dtl_base_unit_gr_qty_p_PPanel.putStatus(REF_SITE, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_gi_qty_p_PPanel.putStatus(REF_SITE, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF_SITE, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, REF_SITE, MCMode.INVISIBLE);
		p.Dtl_pack_unit_gr_qty_p_PPanel.putStatus(REF_SITE, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_pack_unit_gi_qty_p_PPanel.putStatus(REF_SITE, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_nm.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_dec_place.putMode(p, REF_SITE, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(REF_SITE, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_tdlv_cd.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_tdlv_nm.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_xfr_loc_cd.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_xfr_loc_nm.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF_SITE, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, REF_SITE, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, REF_SITE, MCMode.INVISIBLE);
		p.columnDtl_sublot_no.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(REF_SITE, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_par_lot_no.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_par_sublot_no.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_io_typ.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_io_typ_nm.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_slip_no.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_slip_seq_no.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_trn_typ.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_trn_typ_nm.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_act_no.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_act_d_no.putMode(p, REF_SITE, MCMode.READ_ONLY);
		p.columnDtl_srt_no.putMode(p, REF_SITE, MCMode.INVISIBLE);

	}

	/**
	 * [REF_SITE]ステータスの[DtlHide]ブロックのモードの設定
	 */
	protected static void statusInitREF__SITE_DtlHide(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_SITE]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__SITE_Btn(MSBEP_IoRecSrch p){
		p.Btn_open_MSBEP0010.putMode(p, REF_SITE, MCMode.ENABLE);
		p.Btn_open_MSBEP0070.putMode(p, REF_SITE, MCMode.ENABLE);
		p.Btn_open_MSBEP0080.putMode(p, REF_SITE, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, REF_SITE, MCMode.ENABLE);
		p.Btn_open_MSBFP0130.putMode(p, REF_SITE, MCMode.ENABLE);
		p.Btn_open_MSBFP0060.putMode(p, REF_SITE, MCMode.ENABLE);

	}

	/**
	 * [SRCH_SPPL]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPPL_SrchMode(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_SPPL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPPL_Top(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_SPPL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPPL_Fold(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_SPPL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPPL_Tab1(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_SPPL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPPL_Tab2(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_SPPL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPPL_Cnd(MSBEP_IoRecSrch p){
		p.Cnd_md_Group.putMode(p, SRCH_SPPL, MCMode.REQUIRED);
		p.Cnd_act_dt_fr.putMode(p, SRCH_SPPL, MCMode.REQUIRED);
		p.Cnd_act_dt_to.putMode(p, SRCH_SPPL, MCMode.REQUIRED);
		p.Cnd_site_cd.putMode(p, SRCH_SPPL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_SPPL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_SPPL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_SPPL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_SPPL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_SPPL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_SPPL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_SPPL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_SPPL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPPL_Cnd2(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_SPPL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPPL_Ctrl(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_SPPL]ステータスの[Lot]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPPL_Lot(MSBEP_IoRecSrch p){
		p.columnLot_peg_no.putMode(p, SRCH_SPPL, MCMode.INVISIBLE);
		p.Lot_itm_p_PPanel.putStatus(SRCH_SPPL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnLot_sublot_mng_typ.putMode(p, SRCH_SPPL, MCMode.INVISIBLE);
		p.Lot_ver_no_p_PPanel.putStatus(SRCH_SPPL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnLot_lot_no.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnLot_sublot_no.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnLot_bp_lot_no.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnLot_first_gr_dt.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnLot_vld_dt.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnLot_lmt_dt.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnLot_insp_no.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnLot_st_dt.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnLot_st_hm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnLot_end_dt.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnLot_end_hm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnLot_quality_typ.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnLot_quality_typ_nm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnLot_judg_dt.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnLot_insp_judg_rslt_typ.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnLot_insp_judg_rslt_typ_nm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnLot_insp_cnt.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnLot_site_cd.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnLot_site_nm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnLot_loc_sppl_cd.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnLot_loc_sppl_nm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnLot_loc_cd.putMode(p, SRCH_SPPL, MCMode.INVISIBLE);
		p.columnLot_loc_nm.putMode(p, SRCH_SPPL, MCMode.INVISIBLE);
		p.Lot_str_ln_p_PPanel.putStatus(SRCH_SPPL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.INVISIBLE);

	}

	/**
	 * [SRCH_SPPL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPPL_Dtl(MSBEP_IoRecSrch p){
		p.columnDtl_peg_no.putMode(p, SRCH_SPPL, MCMode.INVISIBLE);
		p.columnDtl_act_dt.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ_nm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_io_act_typ.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_io_act_typ_nm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.Dtl_base_unit_gr_qty_p_PPanel.putStatus(SRCH_SPPL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_gi_qty_p_PPanel.putStatus(SRCH_SPPL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH_SPPL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH_SPPL, MCMode.INVISIBLE);
		p.Dtl_pack_unit_gr_qty_p_PPanel.putStatus(SRCH_SPPL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_pack_unit_gi_qty_p_PPanel.putStatus(SRCH_SPPL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_nm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_dec_place.putMode(p, SRCH_SPPL, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(SRCH_SPPL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_tdlv_cd.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_tdlv_nm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_xfr_loc_cd.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_xfr_loc_nm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH_SPPL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, SRCH_SPPL, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, SRCH_SPPL, MCMode.INVISIBLE);
		p.columnDtl_sublot_no.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(SRCH_SPPL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_par_lot_no.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_par_sublot_no.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_io_typ.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_io_typ_nm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_slip_no.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_slip_seq_no.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_trn_typ.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_trn_typ_nm.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_act_no.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_act_d_no.putMode(p, SRCH_SPPL, MCMode.READ_ONLY);
		p.columnDtl_srt_no.putMode(p, SRCH_SPPL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_SPPL]ステータスの[DtlHide]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPPL_DtlHide(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_SPPL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SPPL_Btn(MSBEP_IoRecSrch p){
		p.Btn_open_MSBEP0010.putMode(p, SRCH_SPPL, MCMode.DISABLE);
		p.Btn_open_MSBEP0070.putMode(p, SRCH_SPPL, MCMode.DISABLE);
		p.Btn_open_MSBEP0080.putMode(p, SRCH_SPPL, MCMode.DISABLE);
		p.Btn_open_MSBFP0120.putMode(p, SRCH_SPPL, MCMode.DISABLE);
		p.Btn_open_MSBFP0130.putMode(p, SRCH_SPPL, MCMode.DISABLE);
		p.Btn_open_MSBFP0060.putMode(p, SRCH_SPPL, MCMode.DISABLE);

	}

	/**
	 * [REF_SPPL]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__SPPL_SrchMode(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_SPPL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__SPPL_Top(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_SPPL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__SPPL_Fold(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_SPPL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__SPPL_Tab1(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_SPPL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__SPPL_Tab2(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_SPPL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SPPL_Cnd(MSBEP_IoRecSrch p){
		p.Cnd_md_Group.putMode(p, REF_SPPL, MCMode.REQUIRED);
		p.Cnd_act_dt_fr.putMode(p, REF_SPPL, MCMode.REQUIRED);
		p.Cnd_act_dt_to.putMode(p, REF_SPPL, MCMode.REQUIRED);
		p.Cnd_site_cd.putMode(p, REF_SPPL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_SPPL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.Cnd_loc_nm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_SPPL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_SPPL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_SPPL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_SPPL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_SPPL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_SPPL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_SPPL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF__SPPL_Cnd2(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_SPPL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SPPL_Ctrl(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_SPPL]ステータスの[Lot]ブロックのモードの設定
	 */
	protected static void statusInitREF__SPPL_Lot(MSBEP_IoRecSrch p){
		p.columnLot_peg_no.putMode(p, REF_SPPL, MCMode.INVISIBLE);
		p.Lot_itm_p_PPanel.putStatus(REF_SPPL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnLot_sublot_mng_typ.putMode(p, REF_SPPL, MCMode.INVISIBLE);
		p.Lot_ver_no_p_PPanel.putStatus(REF_SPPL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnLot_lot_no.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnLot_sublot_no.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnLot_bp_lot_no.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnLot_first_gr_dt.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnLot_vld_dt.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnLot_lmt_dt.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnLot_insp_no.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnLot_st_dt.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnLot_st_hm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnLot_end_dt.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnLot_end_hm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnLot_quality_typ.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnLot_quality_typ_nm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnLot_judg_dt.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnLot_insp_judg_rslt_typ.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnLot_insp_judg_rslt_typ_nm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnLot_insp_cnt.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnLot_site_cd.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnLot_site_nm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnLot_loc_sppl_cd.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnLot_loc_sppl_nm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnLot_loc_cd.putMode(p, REF_SPPL, MCMode.INVISIBLE);
		p.columnLot_loc_nm.putMode(p, REF_SPPL, MCMode.INVISIBLE);
		p.Lot_str_ln_p_PPanel.putStatus(REF_SPPL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.INVISIBLE);

	}

	/**
	 * [REF_SPPL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SPPL_Dtl(MSBEP_IoRecSrch p){
		p.columnDtl_peg_no.putMode(p, REF_SPPL, MCMode.INVISIBLE);
		p.columnDtl_act_dt.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ_nm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_io_act_typ.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_io_act_typ_nm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.Dtl_base_unit_gr_qty_p_PPanel.putStatus(REF_SPPL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_gi_qty_p_PPanel.putStatus(REF_SPPL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF_SPPL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, REF_SPPL, MCMode.INVISIBLE);
		p.Dtl_pack_unit_gr_qty_p_PPanel.putStatus(REF_SPPL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_pack_unit_gi_qty_p_PPanel.putStatus(REF_SPPL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_nm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_dec_place.putMode(p, REF_SPPL, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(REF_SPPL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_tdlv_cd.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_tdlv_nm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_xfr_loc_cd.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_xfr_loc_nm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF_SPPL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, REF_SPPL, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, REF_SPPL, MCMode.INVISIBLE);
		p.columnDtl_sublot_no.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(REF_SPPL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_par_lot_no.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_par_sublot_no.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_io_typ.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_io_typ_nm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_slip_no.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_slip_seq_no.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_trn_typ.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_trn_typ_nm.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_act_no.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_act_d_no.putMode(p, REF_SPPL, MCMode.READ_ONLY);
		p.columnDtl_srt_no.putMode(p, REF_SPPL, MCMode.INVISIBLE);

	}

	/**
	 * [REF_SPPL]ステータスの[DtlHide]ブロックのモードの設定
	 */
	protected static void statusInitREF__SPPL_DtlHide(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_SPPL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__SPPL_Btn(MSBEP_IoRecSrch p){
		p.Btn_open_MSBEP0010.putMode(p, REF_SPPL, MCMode.ENABLE);
		p.Btn_open_MSBEP0070.putMode(p, REF_SPPL, MCMode.ENABLE);
		p.Btn_open_MSBEP0080.putMode(p, REF_SPPL, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, REF_SPPL, MCMode.ENABLE);
		p.Btn_open_MSBFP0130.putMode(p, REF_SPPL, MCMode.ENABLE);
		p.Btn_open_MSBFP0060.putMode(p, REF_SPPL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_LOC]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_SrchMode(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_LOC]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_Top(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_LOC]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_Fold(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_LOC]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_Tab1(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_LOC]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_Tab2(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_LOC]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_Cnd(MSBEP_IoRecSrch p){
		p.Cnd_md_Group.putMode(p, SRCH_LOC, MCMode.REQUIRED);
		p.Cnd_act_dt_fr.putMode(p, SRCH_LOC, MCMode.REQUIRED);
		p.Cnd_act_dt_to.putMode(p, SRCH_LOC, MCMode.REQUIRED);
		p.Cnd_site_cd.putMode(p, SRCH_LOC, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_LOC, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_LOC, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_LOC, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_LOC, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_LOC, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_LOC]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_Cnd2(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_LOC]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_Ctrl(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_LOC]ステータスの[Lot]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_Lot(MSBEP_IoRecSrch p){
		p.columnLot_peg_no.putMode(p, SRCH_LOC, MCMode.INVISIBLE);
		p.Lot_itm_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnLot_sublot_mng_typ.putMode(p, SRCH_LOC, MCMode.INVISIBLE);
		p.Lot_ver_no_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnLot_lot_no.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_sublot_no.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_bp_lot_no.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_first_gr_dt.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_vld_dt.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_lmt_dt.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_insp_no.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_st_dt.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_st_hm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_end_dt.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_end_hm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_quality_typ.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_quality_typ_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_judg_dt.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_insp_judg_rslt_typ.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_insp_judg_rslt_typ_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_insp_cnt.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_site_cd.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_site_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_loc_sppl_cd.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_loc_sppl_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_loc_cd.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnLot_loc_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.Lot_str_ln_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.INVISIBLE);

	}

	/**
	 * [SRCH_LOC]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_Dtl(MSBEP_IoRecSrch p){
		p.columnDtl_peg_no.putMode(p, SRCH_LOC, MCMode.INVISIBLE);
		p.columnDtl_act_dt.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_io_act_typ.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_io_act_typ_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.Dtl_base_unit_gr_qty_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_gi_qty_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH_LOC, MCMode.INVISIBLE);
		p.Dtl_pack_unit_gr_qty_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_pack_unit_gi_qty_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_dec_place.putMode(p, SRCH_LOC, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_tdlv_cd.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_tdlv_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_xfr_loc_cd.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_xfr_loc_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, SRCH_LOC, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, SRCH_LOC, MCMode.INVISIBLE);
		p.columnDtl_sublot_no.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(SRCH_LOC, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_par_lot_no.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_par_sublot_no.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_io_typ.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_io_typ_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_slip_no.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_slip_seq_no.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_trn_typ.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_trn_typ_nm.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_act_no.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_act_d_no.putMode(p, SRCH_LOC, MCMode.READ_ONLY);
		p.columnDtl_srt_no.putMode(p, SRCH_LOC, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_LOC]ステータスの[DtlHide]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_DtlHide(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_LOC]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LOC_Btn(MSBEP_IoRecSrch p){
		p.Btn_open_MSBEP0010.putMode(p, SRCH_LOC, MCMode.DISABLE);
		p.Btn_open_MSBEP0070.putMode(p, SRCH_LOC, MCMode.DISABLE);
		p.Btn_open_MSBEP0080.putMode(p, SRCH_LOC, MCMode.DISABLE);
		p.Btn_open_MSBFP0120.putMode(p, SRCH_LOC, MCMode.DISABLE);
		p.Btn_open_MSBFP0130.putMode(p, SRCH_LOC, MCMode.DISABLE);
		p.Btn_open_MSBFP0060.putMode(p, SRCH_LOC, MCMode.DISABLE);

	}

	/**
	 * [REF_LOC]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_SrchMode(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_LOC]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_Top(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_LOC]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_Fold(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_LOC]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_Tab1(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_LOC]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_Tab2(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_LOC]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_Cnd(MSBEP_IoRecSrch p){
		p.Cnd_md_Group.putMode(p, REF_LOC, MCMode.REQUIRED);
		p.Cnd_act_dt_fr.putMode(p, REF_LOC, MCMode.REQUIRED);
		p.Cnd_act_dt_to.putMode(p, REF_LOC, MCMode.REQUIRED);
		p.Cnd_site_cd.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.Cnd_str_ln_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_LOC]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_Cnd2(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_LOC]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_Ctrl(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_LOC]ステータスの[Lot]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_Lot(MSBEP_IoRecSrch p){
		p.columnLot_peg_no.putMode(p, REF_LOC, MCMode.INVISIBLE);
		p.Lot_itm_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnLot_sublot_mng_typ.putMode(p, REF_LOC, MCMode.INVISIBLE);
		p.Lot_ver_no_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnLot_lot_no.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_sublot_no.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_bp_lot_no.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_first_gr_dt.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_vld_dt.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_lmt_dt.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_insp_no.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_st_dt.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_st_hm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_end_dt.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_end_hm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_quality_typ.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_quality_typ_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_judg_dt.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_insp_judg_rslt_typ.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_insp_judg_rslt_typ_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_insp_cnt.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_site_cd.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_site_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_loc_sppl_cd.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_loc_sppl_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_loc_cd.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnLot_loc_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.Lot_str_ln_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.INVISIBLE);

	}

	/**
	 * [REF_LOC]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_Dtl(MSBEP_IoRecSrch p){
		p.columnDtl_peg_no.putMode(p, REF_LOC, MCMode.INVISIBLE);
		p.columnDtl_act_dt.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_io_act_typ.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_io_act_typ_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.Dtl_base_unit_gr_qty_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_gi_qty_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, REF_LOC, MCMode.INVISIBLE);
		p.Dtl_pack_unit_gr_qty_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_pack_unit_gi_qty_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_dec_place.putMode(p, REF_LOC, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_tdlv_cd.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_tdlv_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_xfr_loc_cd.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_xfr_loc_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF_LOC, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, REF_LOC, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, REF_LOC, MCMode.INVISIBLE);
		p.columnDtl_sublot_no.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(REF_LOC, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_par_lot_no.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_par_sublot_no.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_io_typ.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_io_typ_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_slip_no.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_slip_seq_no.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_trn_typ.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_trn_typ_nm.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_act_no.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_act_d_no.putMode(p, REF_LOC, MCMode.READ_ONLY);
		p.columnDtl_srt_no.putMode(p, REF_LOC, MCMode.INVISIBLE);

	}

	/**
	 * [REF_LOC]ステータスの[DtlHide]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_DtlHide(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_LOC]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__LOC_Btn(MSBEP_IoRecSrch p){
		p.Btn_open_MSBEP0010.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Btn_open_MSBEP0070.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Btn_open_MSBEP0080.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Btn_open_MSBFP0130.putMode(p, REF_LOC, MCMode.ENABLE);
		p.Btn_open_MSBFP0060.putMode(p, REF_LOC, MCMode.ENABLE);

	}

	/**
	 * [SRCH_STRLN]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__STRLN_SrchMode(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_STRLN]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__STRLN_Top(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_STRLN]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__STRLN_Fold(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_STRLN]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__STRLN_Tab1(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_STRLN]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__STRLN_Tab2(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_STRLN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__STRLN_Cnd(MSBEP_IoRecSrch p){
		p.Cnd_md_Group.putMode(p, SRCH_STRLN, MCMode.REQUIRED);
		p.Cnd_act_dt_fr.putMode(p, SRCH_STRLN, MCMode.REQUIRED);
		p.Cnd_act_dt_to.putMode(p, SRCH_STRLN, MCMode.REQUIRED);
		p.Cnd_site_cd.putMode(p, SRCH_STRLN, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_STRLN, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_STRLN, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_STRLN, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_STRLN, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_STRLN, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_STRLN, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_STRLN, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_STRLN, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_STRLN, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_STRLN, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_STRLN, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_STRLN]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__STRLN_Cnd2(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_STRLN]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__STRLN_Ctrl(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_STRLN]ステータスの[Lot]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__STRLN_Lot(MSBEP_IoRecSrch p){
		p.columnLot_peg_no.putMode(p, SRCH_STRLN, MCMode.INVISIBLE);
		p.Lot_itm_p_PPanel.putStatus(SRCH_STRLN, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnLot_sublot_mng_typ.putMode(p, SRCH_STRLN, MCMode.INVISIBLE);
		p.Lot_ver_no_p_PPanel.putStatus(SRCH_STRLN, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnLot_lot_no.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_sublot_no.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_bp_lot_no.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_first_gr_dt.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_vld_dt.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_lmt_dt.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_insp_no.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_st_dt.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_st_hm.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_end_dt.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_end_hm.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_quality_typ.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_quality_typ_nm.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_judg_dt.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_insp_judg_rslt_typ.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_insp_judg_rslt_typ_nm.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_insp_cnt.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_site_cd.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_site_nm.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_loc_sppl_cd.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_loc_sppl_nm.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_loc_cd.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnLot_loc_nm.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.Lot_str_ln_p_PPanel.putStatus(SRCH_STRLN, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);

	}

	/**
	 * [SRCH_STRLN]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__STRLN_Dtl(MSBEP_IoRecSrch p){
		p.columnDtl_peg_no.putMode(p, SRCH_STRLN, MCMode.INVISIBLE);
		p.columnDtl_act_dt.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ_nm.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_io_act_typ.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_io_act_typ_nm.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.Dtl_base_unit_gr_qty_p_PPanel.putStatus(SRCH_STRLN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_gi_qty_p_PPanel.putStatus(SRCH_STRLN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH_STRLN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH_STRLN, MCMode.INVISIBLE);
		p.Dtl_pack_unit_gr_qty_p_PPanel.putStatus(SRCH_STRLN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_pack_unit_gi_qty_p_PPanel.putStatus(SRCH_STRLN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_nm.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_dec_place.putMode(p, SRCH_STRLN, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(SRCH_STRLN, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_tdlv_cd.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_tdlv_nm.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_xfr_loc_cd.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_xfr_loc_nm.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH_STRLN, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, SRCH_STRLN, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, SRCH_STRLN, MCMode.INVISIBLE);
		p.columnDtl_sublot_no.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(SRCH_STRLN, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_par_lot_no.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_par_sublot_no.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_io_typ.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_io_typ_nm.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_slip_no.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_slip_seq_no.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_trn_typ.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_trn_typ_nm.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_act_no.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_act_d_no.putMode(p, SRCH_STRLN, MCMode.READ_ONLY);
		p.columnDtl_srt_no.putMode(p, SRCH_STRLN, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_STRLN]ステータスの[DtlHide]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__STRLN_DtlHide(MSBEP_IoRecSrch p){

	}

	/**
	 * [SRCH_STRLN]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__STRLN_Btn(MSBEP_IoRecSrch p){
		p.Btn_open_MSBEP0010.putMode(p, SRCH_STRLN, MCMode.DISABLE);
		p.Btn_open_MSBEP0070.putMode(p, SRCH_STRLN, MCMode.DISABLE);
		p.Btn_open_MSBEP0080.putMode(p, SRCH_STRLN, MCMode.DISABLE);
		p.Btn_open_MSBFP0120.putMode(p, SRCH_STRLN, MCMode.DISABLE);
		p.Btn_open_MSBFP0130.putMode(p, SRCH_STRLN, MCMode.DISABLE);
		p.Btn_open_MSBFP0060.putMode(p, SRCH_STRLN, MCMode.DISABLE);

	}

	/**
	 * [REF_STRLN]ステータスの[SrchMode]ブロックのモードの設定
	 */
	protected static void statusInitREF__STRLN_SrchMode(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_STRLN]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__STRLN_Top(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_STRLN]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__STRLN_Fold(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_STRLN]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__STRLN_Tab1(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_STRLN]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__STRLN_Tab2(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_STRLN]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__STRLN_Cnd(MSBEP_IoRecSrch p){
		p.Cnd_md_Group.putMode(p, REF_STRLN, MCMode.REQUIRED);
		p.Cnd_act_dt_fr.putMode(p, REF_STRLN, MCMode.REQUIRED);
		p.Cnd_act_dt_to.putMode(p, REF_STRLN, MCMode.REQUIRED);
		p.Cnd_site_cd.putMode(p, REF_STRLN, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_STRLN, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF_STRLN, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF_STRLN, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF_STRLN, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF_STRLN, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_STRLN, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_STRLN, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(REF_STRLN, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF_STRLN, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF_STRLN, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_STRLN, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_STRLN]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF__STRLN_Cnd2(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_STRLN]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__STRLN_Ctrl(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_STRLN]ステータスの[Lot]ブロックのモードの設定
	 */
	protected static void statusInitREF__STRLN_Lot(MSBEP_IoRecSrch p){
		p.columnLot_peg_no.putMode(p, REF_STRLN, MCMode.INVISIBLE);
		p.Lot_itm_p_PPanel.putStatus(REF_STRLN, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnLot_sublot_mng_typ.putMode(p, REF_STRLN, MCMode.INVISIBLE);
		p.Lot_ver_no_p_PPanel.putStatus(REF_STRLN, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnLot_lot_no.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_sublot_no.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_bp_lot_no.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_first_gr_dt.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_vld_dt.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_lmt_dt.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_insp_no.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_st_dt.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_st_hm.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_end_dt.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_end_hm.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_quality_typ.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_quality_typ_nm.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_judg_dt.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_insp_judg_rslt_typ.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_insp_judg_rslt_typ_nm.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_insp_cnt.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_site_cd.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_site_nm.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_loc_sppl_cd.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_loc_sppl_nm.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_loc_cd.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnLot_loc_nm.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.Lot_str_ln_p_PPanel.putStatus(REF_STRLN, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);

	}

	/**
	 * [REF_STRLN]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__STRLN_Dtl(MSBEP_IoRecSrch p){
		p.columnDtl_peg_no.putMode(p, REF_STRLN, MCMode.INVISIBLE);
		p.columnDtl_act_dt.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ_nm.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_io_act_typ.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_io_act_typ_nm.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.Dtl_base_unit_gr_qty_p_PPanel.putStatus(REF_STRLN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_gi_qty_p_PPanel.putStatus(REF_STRLN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF_STRLN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, REF_STRLN, MCMode.INVISIBLE);
		p.Dtl_pack_unit_gr_qty_p_PPanel.putStatus(REF_STRLN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_pack_unit_gi_qty_p_PPanel.putStatus(REF_STRLN, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_pack_unit_cd.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_nm.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_pack_unit_dec_place.putMode(p, REF_STRLN, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.Dtl_str_ln_p_PPanel.putStatus(REF_STRLN, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_tdlv_cd.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_tdlv_nm.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_xfr_loc_cd.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_xfr_loc_nm.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF_STRLN, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, REF_STRLN, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, REF_STRLN, MCMode.INVISIBLE);
		p.columnDtl_sublot_no.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(REF_STRLN, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_par_lot_no.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_par_sublot_no.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_ac_dt.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_io_typ.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_io_typ_nm.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_mfg_inst_no.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_po_no.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_slip_no.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_slip_seq_no.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_trn_typ.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_trn_typ_nm.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_act_no.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_act_d_no.putMode(p, REF_STRLN, MCMode.READ_ONLY);
		p.columnDtl_srt_no.putMode(p, REF_STRLN, MCMode.INVISIBLE);

	}

	/**
	 * [REF_STRLN]ステータスの[DtlHide]ブロックのモードの設定
	 */
	protected static void statusInitREF__STRLN_DtlHide(MSBEP_IoRecSrch p){

	}

	/**
	 * [REF_STRLN]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__STRLN_Btn(MSBEP_IoRecSrch p){
		p.Btn_open_MSBEP0010.putMode(p, REF_STRLN, MCMode.ENABLE);
		p.Btn_open_MSBEP0070.putMode(p, REF_STRLN, MCMode.ENABLE);
		p.Btn_open_MSBEP0080.putMode(p, REF_STRLN, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, REF_STRLN, MCMode.ENABLE);
		p.Btn_open_MSBFP0130.putMode(p, REF_STRLN, MCMode.ENABLE);
		p.Btn_open_MSBFP0060.putMode(p, REF_STRLN, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_SITE;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBEP_IoRecSrch_MC.setTableConfigLot((MSBEP_IoRecSrch)this);
		MSBEP_IoRecSrch_MC.setTableConfigDtl((MSBEP_IoRecSrch)this);
	}

	/**
	 * [Lot]ブロックのTableの設定
	 */
	protected static void setTableConfigLot(MSBEP_IoRecSrch p) {
		p.columnLot_peg_no.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.peg_no_META);
		p.LotTable.addColumnConfig(p.columnLot_peg_no);
		p.LotTable.addTable(p.Lot_itm_p_PPanel.ItmTable);
		p.columnLot_sublot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.sublot_mng_typ_META);
		p.LotTable.addColumnConfig(p.columnLot_sublot_mng_typ);
		p.LotTable.addTable(p.Lot_ver_no_p_PPanel.VerNoTable);
		p.columnLot_lot_no.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.lot_no_META);
		p.LotTable.addColumnConfig(p.columnLot_lot_no);
		p.columnLot_sublot_no.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.sublot_no_META);
		p.LotTable.addColumnConfig(p.columnLot_sublot_no);
		p.columnLot_bp_lot_no.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.bp_lot_no_META);
		p.LotTable.addColumnConfig(p.columnLot_bp_lot_no);
		p.columnLot_first_gr_dt.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.first_gr_dt_META);
		p.columnLot_first_gr_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.LotTable.addColumnConfig(p.columnLot_first_gr_dt);
		p.columnLot_vld_dt.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.vld_dt_META);
		p.columnLot_vld_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.LotTable.addColumnConfig(p.columnLot_vld_dt);
		p.columnLot_lmt_dt.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.lmt_dt_META);
		p.columnLot_lmt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.LotTable.addColumnConfig(p.columnLot_lmt_dt);
		p.columnLot_insp_no.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.insp_no_META);
		p.LotTable.addColumnConfig(p.columnLot_insp_no);
		p.columnLot_st_dt.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.st_dt_META);
		p.columnLot_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.LotTable.addColumnConfig(p.columnLot_st_dt);
		p.columnLot_st_hm.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.st_hm_META);
		p.columnLot_st_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.LotTable.addColumnConfig(p.columnLot_st_hm);
		p.columnLot_end_dt.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.end_dt_META);
		p.columnLot_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.LotTable.addColumnConfig(p.columnLot_end_dt);
		p.columnLot_end_hm.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.end_hm_META);
		p.columnLot_end_hm.setFormatID(mcframe.commonMA.meta.MA_META.HM_FORMAT);
		p.LotTable.addColumnConfig(p.columnLot_end_hm);
		p.columnLot_quality_typ.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.quality_typ_META);
		p.LotTable.addColumnConfig(p.columnLot_quality_typ);
		p.columnLot_quality_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.quality_typ_nm_META);
		p.LotTable.addColumnConfig(p.columnLot_quality_typ_nm);
		p.columnLot_judg_dt.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.judg_dt_META);
		p.columnLot_judg_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.LotTable.addColumnConfig(p.columnLot_judg_dt);
		p.columnLot_insp_judg_rslt_typ.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.insp_judg_rslt_typ_META);
		p.LotTable.addColumnConfig(p.columnLot_insp_judg_rslt_typ);
		p.columnLot_insp_judg_rslt_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.insp_judg_rslt_typ_nm_META);
		p.LotTable.addColumnConfig(p.columnLot_insp_judg_rslt_typ_nm);
		p.columnLot_insp_cnt.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.insp_cnt_META);
		p.LotTable.addColumnConfig(p.columnLot_insp_cnt);
		p.columnLot_site_cd.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.site_cd_META);
		p.LotTable.addColumnConfig(p.columnLot_site_cd);
		p.columnLot_site_nm.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.site_nm_META);
		p.LotTable.addColumnConfig(p.columnLot_site_nm);
		p.columnLot_loc_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.loc_sppl_cd_META);
		p.LotTable.addColumnConfig(p.columnLot_loc_sppl_cd);
		p.columnLot_loc_sppl_nm.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.loc_sppl_nm_META);
		p.LotTable.addColumnConfig(p.columnLot_loc_sppl_nm);
		p.columnLot_loc_cd.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.loc_cd_META);
		p.LotTable.addColumnConfig(p.columnLot_loc_cd);
		p.columnLot_loc_nm.setMeta(mcframe.clientMSBE.MSBEP0100.LotR.loc_nm_META);
		p.LotTable.addColumnConfig(p.columnLot_loc_nm);
		p.LotTable.addTable(p.Lot_str_ln_p_PPanel.StrLnTable);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBEP_IoRecSrch p) {
		p.columnDtl_peg_no.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.peg_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_peg_no);
		p.columnDtl_act_dt.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.act_dt_META);
		p.columnDtl_act_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_act_dt);
		p.columnDtl_trd_cd.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.trd_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cd);
		p.columnDtl_trd_nm.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.trd_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_nm);
		p.columnDtl_trd_ptn_typ.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.trd_ptn_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_ptn_typ);
		p.columnDtl_trd_ptn_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.trd_ptn_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_ptn_typ_nm);
		p.columnDtl_io_act_typ.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.io_act_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_io_act_typ);
		p.columnDtl_io_act_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.io_act_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_io_act_typ_nm);
		p.DtlTable.addTable(p.Dtl_base_unit_gr_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_base_unit_gi_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_base_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_cd);
		p.columnDtl_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_nm);
		p.columnDtl_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.base_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_dec_place);
		p.DtlTable.addTable(p.Dtl_pack_unit_gr_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_pack_unit_gi_qty_p_PPanel.QtyTable);
		p.columnDtl_pack_unit_cd.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.pack_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pack_unit_cd);
		p.columnDtl_pack_unit_nm.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.pack_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pack_unit_nm);
		p.columnDtl_pack_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.pack_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pack_unit_dec_place);
		p.columnDtl_loc_cd.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.loc_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_cd);
		p.columnDtl_loc_nm.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_nm);
		p.DtlTable.addTable(p.Dtl_str_ln_p_PPanel.StrLnTable);
		p.columnDtl_dlv_cd.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.dlv_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_cd);
		p.columnDtl_dlv_nm.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.dlv_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_nm);
		p.columnDtl_tdlv_cd.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.tdlv_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tdlv_cd);
		p.columnDtl_tdlv_nm.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.tdlv_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tdlv_nm);
		p.columnDtl_cst_cd.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.cst_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_cd);
		p.columnDtl_cst_nm.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.cst_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_nm);
		p.columnDtl_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.sppl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_cd);
		p.columnDtl_sppl_nm.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.sppl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_nm);
		p.columnDtl_xfr_loc_cd.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.xfr_loc_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xfr_loc_cd);
		p.columnDtl_xfr_loc_nm.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.xfr_loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xfr_loc_nm);
		p.DtlTable.addTable(p.Dtl_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnDtl_sublot_no.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.sublot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_no);
		p.DtlTable.addTable(p.Dtl_par_itm_p_PPanel.ItmTable);
		p.columnDtl_par_lot_no.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.par_lot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_lot_no);
		p.columnDtl_par_sublot_no.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.par_sublot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_sublot_no);
		p.columnDtl_rsn_cd.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.rsn_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rsn_cd);
		p.columnDtl_rsn_nm.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rsn_nm);
		p.columnDtl_ac_dt.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.ac_dt_META);
		p.columnDtl_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_dt);
		p.columnDtl_io_typ.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.io_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_io_typ);
		p.columnDtl_io_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.io_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_io_typ_nm);
		p.columnDtl_mfg_inst_no.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.mfg_inst_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_inst_no);
		p.columnDtl_slo_no.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.slo_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_no);
		p.columnDtl_po_no.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.po_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_no);
		p.columnDtl_slip_no.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.slip_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slip_no);
		p.columnDtl_slip_seq_no.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.slip_seq_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slip_seq_no);
		p.columnDtl_trn_typ.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.trn_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trn_typ);
		p.columnDtl_trn_typ_nm.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.trn_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trn_typ_nm);
		p.columnDtl_act_no.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_act_no);
		p.columnDtl_act_d_no.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_act_d_no);
		p.columnDtl_srt_no.setMeta(mcframe.clientMSBE.MSBEP0100.DtlR.srt_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_srt_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_str_ln_cd.getListConfig().setPutter(getCnd_str_ln_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_lot_no.getListConfig().setPutter(getCnd_lot_no_ListPutter());
		Cnd_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sublot_no.getListConfig().setPutter(getCnd_sublot_no_ListPutter());
	}

	/**
	 * この画面を[SRCH_SITE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_SITEStatus() {
		status = SRCH_SITE;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_SITE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_SITEStatus() {
		status = REF_SITE;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_SPPL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_SPPLStatus() {
		status = SRCH_SPPL;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_SPPL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_SPPLStatus() {
		status = REF_SPPL;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_LOC]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_LOCStatus() {
		status = SRCH_LOC;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_LOC]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_LOCStatus() {
		status = REF_LOC;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_STRLN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_STRLNStatus() {
		status = SRCH_STRLN;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_STRLN]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_STRLNStatus() {
		status = REF_STRLN;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_SITE.equals(status)) {
			setSRCH_SITEStatus();
		}
		else if (REF_SITE.equals(status)) {
			setREF_SITEStatus();
		}
		else if (SRCH_SPPL.equals(status)) {
			setSRCH_SPPLStatus();
		}
		else if (REF_SPPL.equals(status)) {
			setREF_SPPLStatus();
		}
		else if (SRCH_LOC.equals(status)) {
			setSRCH_LOCStatus();
		}
		else if (REF_LOC.equals(status)) {
			setREF_LOCStatus();
		}
		else if (SRCH_STRLN.equals(status)) {
			setSRCH_STRLNStatus();
		}
		else if (REF_STRLN.equals(status)) {
			setREF_STRLNStatus();
		}
	}

	/**
	 * [Cnd_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_str_ln_cd) return getCnd_str_ln_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_lot_no) return getCnd_lot_no(row, info);
		if(combo == Cnd_sublot_no) return getCnd_sublot_no(row, info);
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
		else if (ap == Btn_open_MSBEP0010) doBtn_open_MSBEP0010(info);
		else if (ap == Btn_open_MSBEP0070) doBtn_open_MSBEP0070(info);
		else if (ap == Btn_open_MSBEP0080) doBtn_open_MSBEP0080(info);
		else if (ap == Btn_open_MSBFP0120) doBtn_open_MSBFP0120(info);
		else if (ap == Btn_open_MSBFP0130) doBtn_open_MSBFP0130(info);
		else if (ap == Btn_open_MSBFP0060) doBtn_open_MSBFP0060(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP0010]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP0010(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP0070]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP0070(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP0080]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP0080(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBFP0120]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBFP0120(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBFP0130]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBFP0130(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBFP0060]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBFP0060(MCEventInfo info);

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
		if (vc == LotTable) return doLot_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_md_Group) return doCnd_md_VC(info);
		if (vc == Cnd_act_dt_fr) return doCnd_act_dt_fr_VC(info);
		if (vc == Cnd_act_dt_to) return doCnd_act_dt_to_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_str_ln_cd) return doCnd_str_ln_cd_VC(info);
		if (vc == Cnd_str_ln_nm) return doCnd_str_ln_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == columnLot_peg_no) return doLot_peg_no_VC(info);
		if (vc == columnLot_sublot_mng_typ) return doLot_sublot_mng_typ_VC(info);
		if (vc == columnLot_lot_no) return doLot_lot_no_VC(info);
		if (vc == columnLot_sublot_no) return doLot_sublot_no_VC(info);
		if (vc == columnLot_bp_lot_no) return doLot_bp_lot_no_VC(info);
		if (vc == columnLot_first_gr_dt) return doLot_first_gr_dt_VC(info);
		if (vc == columnLot_vld_dt) return doLot_vld_dt_VC(info);
		if (vc == columnLot_lmt_dt) return doLot_lmt_dt_VC(info);
		if (vc == columnLot_insp_no) return doLot_insp_no_VC(info);
		if (vc == columnLot_st_dt) return doLot_st_dt_VC(info);
		if (vc == columnLot_st_hm) return doLot_st_hm_VC(info);
		if (vc == columnLot_end_dt) return doLot_end_dt_VC(info);
		if (vc == columnLot_end_hm) return doLot_end_hm_VC(info);
		if (vc == columnLot_quality_typ) return doLot_quality_typ_VC(info);
		if (vc == columnLot_quality_typ_nm) return doLot_quality_typ_nm_VC(info);
		if (vc == columnLot_judg_dt) return doLot_judg_dt_VC(info);
		if (vc == columnLot_insp_judg_rslt_typ) return doLot_insp_judg_rslt_typ_VC(info);
		if (vc == columnLot_insp_judg_rslt_typ_nm) return doLot_insp_judg_rslt_typ_nm_VC(info);
		if (vc == columnLot_insp_cnt) return doLot_insp_cnt_VC(info);
		if (vc == columnLot_site_cd) return doLot_site_cd_VC(info);
		if (vc == columnLot_site_nm) return doLot_site_nm_VC(info);
		if (vc == columnLot_loc_sppl_cd) return doLot_loc_sppl_cd_VC(info);
		if (vc == columnLot_loc_sppl_nm) return doLot_loc_sppl_nm_VC(info);
		if (vc == columnLot_loc_cd) return doLot_loc_cd_VC(info);
		if (vc == columnLot_loc_nm) return doLot_loc_nm_VC(info);
		if (vc == columnDtl_peg_no) return doDtl_peg_no_VC(info);
		if (vc == columnDtl_act_dt) return doDtl_act_dt_VC(info);
		if (vc == columnDtl_trd_cd) return doDtl_trd_cd_VC(info);
		if (vc == columnDtl_trd_nm) return doDtl_trd_nm_VC(info);
		if (vc == columnDtl_trd_ptn_typ) return doDtl_trd_ptn_typ_VC(info);
		if (vc == columnDtl_trd_ptn_typ_nm) return doDtl_trd_ptn_typ_nm_VC(info);
		if (vc == columnDtl_io_act_typ) return doDtl_io_act_typ_VC(info);
		if (vc == columnDtl_io_act_typ_nm) return doDtl_io_act_typ_nm_VC(info);
		if (vc == columnDtl_base_unit_cd) return doDtl_base_unit_cd_VC(info);
		if (vc == columnDtl_base_unit_nm) return doDtl_base_unit_nm_VC(info);
		if (vc == columnDtl_base_unit_dec_place) return doDtl_base_unit_dec_place_VC(info);
		if (vc == columnDtl_pack_unit_cd) return doDtl_pack_unit_cd_VC(info);
		if (vc == columnDtl_pack_unit_nm) return doDtl_pack_unit_nm_VC(info);
		if (vc == columnDtl_pack_unit_dec_place) return doDtl_pack_unit_dec_place_VC(info);
		if (vc == columnDtl_loc_cd) return doDtl_loc_cd_VC(info);
		if (vc == columnDtl_loc_nm) return doDtl_loc_nm_VC(info);
		if (vc == columnDtl_dlv_cd) return doDtl_dlv_cd_VC(info);
		if (vc == columnDtl_dlv_nm) return doDtl_dlv_nm_VC(info);
		if (vc == columnDtl_tdlv_cd) return doDtl_tdlv_cd_VC(info);
		if (vc == columnDtl_tdlv_nm) return doDtl_tdlv_nm_VC(info);
		if (vc == columnDtl_cst_cd) return doDtl_cst_cd_VC(info);
		if (vc == columnDtl_cst_nm) return doDtl_cst_nm_VC(info);
		if (vc == columnDtl_sppl_cd) return doDtl_sppl_cd_VC(info);
		if (vc == columnDtl_sppl_nm) return doDtl_sppl_nm_VC(info);
		if (vc == columnDtl_xfr_loc_cd) return doDtl_xfr_loc_cd_VC(info);
		if (vc == columnDtl_xfr_loc_nm) return doDtl_xfr_loc_nm_VC(info);
		if (vc == columnDtl_sublot_no) return doDtl_sublot_no_VC(info);
		if (vc == columnDtl_par_lot_no) return doDtl_par_lot_no_VC(info);
		if (vc == columnDtl_par_sublot_no) return doDtl_par_sublot_no_VC(info);
		if (vc == columnDtl_rsn_cd) return doDtl_rsn_cd_VC(info);
		if (vc == columnDtl_rsn_nm) return doDtl_rsn_nm_VC(info);
		if (vc == columnDtl_ac_dt) return doDtl_ac_dt_VC(info);
		if (vc == columnDtl_io_typ) return doDtl_io_typ_VC(info);
		if (vc == columnDtl_io_typ_nm) return doDtl_io_typ_nm_VC(info);
		if (vc == columnDtl_mfg_inst_no) return doDtl_mfg_inst_no_VC(info);
		if (vc == columnDtl_slo_no) return doDtl_slo_no_VC(info);
		if (vc == columnDtl_po_no) return doDtl_po_no_VC(info);
		if (vc == columnDtl_slip_no) return doDtl_slip_no_VC(info);
		if (vc == columnDtl_slip_seq_no) return doDtl_slip_seq_no_VC(info);
		if (vc == columnDtl_trn_typ) return doDtl_trn_typ_VC(info);
		if (vc == columnDtl_trn_typ_nm) return doDtl_trn_typ_nm_VC(info);
		if (vc == columnDtl_act_no) return doDtl_act_no_VC(info);
		if (vc == columnDtl_act_d_no) return doDtl_act_d_no_VC(info);
		if (vc == columnDtl_srt_no) return doDtl_srt_no_VC(info);
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
	 * [Lot]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[md]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_md_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[act_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_act_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_site_nm_VC(MCEventInfo info){
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
	 * [Lot]パネルの[peg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_peg_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[bp_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_bp_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[first_gr_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_first_gr_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[vld_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_vld_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[lmt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_lmt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[insp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_insp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[st_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_st_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[end_hm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_end_hm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[judg_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_judg_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[insp_judg_rslt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_insp_judg_rslt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[insp_judg_rslt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_insp_judg_rslt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[insp_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_insp_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[loc_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_loc_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[loc_sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_loc_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lot]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLot_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[peg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_peg_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_ptn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_act_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_act_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_act_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_act_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pack_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pack_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pack_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pack_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pack_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pack_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tdlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tdlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tdlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tdlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xfr_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xfr_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xfr_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xfr_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slip_seq_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slip_seq_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[srt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_srt_no_VC(MCEventInfo info){
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
		else if (nc == LotTable) doLot_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_md_Group) doCnd_md_NC(info);
		else if (nc == Cnd_act_dt_fr) doCnd_act_dt_fr_NC(info);
		else if (nc == Cnd_act_dt_to) doCnd_act_dt_to_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_str_ln_cd) doCnd_str_ln_cd_NC(info);
		else if (nc == Cnd_str_ln_nm) doCnd_str_ln_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == columnLot_peg_no) doLot_peg_no_NC(info);
		else if (nc == columnLot_sublot_mng_typ) doLot_sublot_mng_typ_NC(info);
		else if (nc == columnLot_lot_no) doLot_lot_no_NC(info);
		else if (nc == columnLot_sublot_no) doLot_sublot_no_NC(info);
		else if (nc == columnLot_bp_lot_no) doLot_bp_lot_no_NC(info);
		else if (nc == columnLot_first_gr_dt) doLot_first_gr_dt_NC(info);
		else if (nc == columnLot_vld_dt) doLot_vld_dt_NC(info);
		else if (nc == columnLot_lmt_dt) doLot_lmt_dt_NC(info);
		else if (nc == columnLot_insp_no) doLot_insp_no_NC(info);
		else if (nc == columnLot_st_dt) doLot_st_dt_NC(info);
		else if (nc == columnLot_st_hm) doLot_st_hm_NC(info);
		else if (nc == columnLot_end_dt) doLot_end_dt_NC(info);
		else if (nc == columnLot_end_hm) doLot_end_hm_NC(info);
		else if (nc == columnLot_quality_typ) doLot_quality_typ_NC(info);
		else if (nc == columnLot_quality_typ_nm) doLot_quality_typ_nm_NC(info);
		else if (nc == columnLot_judg_dt) doLot_judg_dt_NC(info);
		else if (nc == columnLot_insp_judg_rslt_typ) doLot_insp_judg_rslt_typ_NC(info);
		else if (nc == columnLot_insp_judg_rslt_typ_nm) doLot_insp_judg_rslt_typ_nm_NC(info);
		else if (nc == columnLot_insp_cnt) doLot_insp_cnt_NC(info);
		else if (nc == columnLot_site_cd) doLot_site_cd_NC(info);
		else if (nc == columnLot_site_nm) doLot_site_nm_NC(info);
		else if (nc == columnLot_loc_sppl_cd) doLot_loc_sppl_cd_NC(info);
		else if (nc == columnLot_loc_sppl_nm) doLot_loc_sppl_nm_NC(info);
		else if (nc == columnLot_loc_cd) doLot_loc_cd_NC(info);
		else if (nc == columnLot_loc_nm) doLot_loc_nm_NC(info);
		else if (nc == columnDtl_peg_no) doDtl_peg_no_NC(info);
		else if (nc == columnDtl_act_dt) doDtl_act_dt_NC(info);
		else if (nc == columnDtl_trd_cd) doDtl_trd_cd_NC(info);
		else if (nc == columnDtl_trd_nm) doDtl_trd_nm_NC(info);
		else if (nc == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NC(info);
		else if (nc == columnDtl_trd_ptn_typ_nm) doDtl_trd_ptn_typ_nm_NC(info);
		else if (nc == columnDtl_io_act_typ) doDtl_io_act_typ_NC(info);
		else if (nc == columnDtl_io_act_typ_nm) doDtl_io_act_typ_nm_NC(info);
		else if (nc == columnDtl_base_unit_cd) doDtl_base_unit_cd_NC(info);
		else if (nc == columnDtl_base_unit_nm) doDtl_base_unit_nm_NC(info);
		else if (nc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NC(info);
		else if (nc == columnDtl_pack_unit_cd) doDtl_pack_unit_cd_NC(info);
		else if (nc == columnDtl_pack_unit_nm) doDtl_pack_unit_nm_NC(info);
		else if (nc == columnDtl_pack_unit_dec_place) doDtl_pack_unit_dec_place_NC(info);
		else if (nc == columnDtl_loc_cd) doDtl_loc_cd_NC(info);
		else if (nc == columnDtl_loc_nm) doDtl_loc_nm_NC(info);
		else if (nc == columnDtl_dlv_cd) doDtl_dlv_cd_NC(info);
		else if (nc == columnDtl_dlv_nm) doDtl_dlv_nm_NC(info);
		else if (nc == columnDtl_tdlv_cd) doDtl_tdlv_cd_NC(info);
		else if (nc == columnDtl_tdlv_nm) doDtl_tdlv_nm_NC(info);
		else if (nc == columnDtl_cst_cd) doDtl_cst_cd_NC(info);
		else if (nc == columnDtl_cst_nm) doDtl_cst_nm_NC(info);
		else if (nc == columnDtl_sppl_cd) doDtl_sppl_cd_NC(info);
		else if (nc == columnDtl_sppl_nm) doDtl_sppl_nm_NC(info);
		else if (nc == columnDtl_xfr_loc_cd) doDtl_xfr_loc_cd_NC(info);
		else if (nc == columnDtl_xfr_loc_nm) doDtl_xfr_loc_nm_NC(info);
		else if (nc == columnDtl_sublot_no) doDtl_sublot_no_NC(info);
		else if (nc == columnDtl_par_lot_no) doDtl_par_lot_no_NC(info);
		else if (nc == columnDtl_par_sublot_no) doDtl_par_sublot_no_NC(info);
		else if (nc == columnDtl_rsn_cd) doDtl_rsn_cd_NC(info);
		else if (nc == columnDtl_rsn_nm) doDtl_rsn_nm_NC(info);
		else if (nc == columnDtl_ac_dt) doDtl_ac_dt_NC(info);
		else if (nc == columnDtl_io_typ) doDtl_io_typ_NC(info);
		else if (nc == columnDtl_io_typ_nm) doDtl_io_typ_nm_NC(info);
		else if (nc == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_NC(info);
		else if (nc == columnDtl_slo_no) doDtl_slo_no_NC(info);
		else if (nc == columnDtl_po_no) doDtl_po_no_NC(info);
		else if (nc == columnDtl_slip_no) doDtl_slip_no_NC(info);
		else if (nc == columnDtl_slip_seq_no) doDtl_slip_seq_no_NC(info);
		else if (nc == columnDtl_trn_typ) doDtl_trn_typ_NC(info);
		else if (nc == columnDtl_trn_typ_nm) doDtl_trn_typ_nm_NC(info);
		else if (nc == columnDtl_act_no) doDtl_act_no_NC(info);
		else if (nc == columnDtl_act_d_no) doDtl_act_d_no_NC(info);
		else if (nc == columnDtl_srt_no) doDtl_srt_no_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [Lot]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[md]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_md_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_nm_NC(MCEventInfo info){
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
	 * [Lot]パネルの[peg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_peg_no_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_bp_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[first_gr_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_first_gr_dt_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[vld_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_vld_dt_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[lmt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_lmt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[insp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_insp_no_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[st_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_st_hm_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[end_hm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_end_hm_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[judg_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_judg_dt_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[insp_judg_rslt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_insp_judg_rslt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[insp_judg_rslt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_insp_judg_rslt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[insp_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_insp_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[loc_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_loc_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[loc_sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_loc_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[peg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_peg_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_act_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_act_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_act_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_act_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tdlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tdlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tdlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tdlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_seq_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_seq_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[srt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_srt_no_NC(MCEventInfo info){
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
		else if (ne == LotTable) doLot_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_md_Group) doCnd_md_NE(info);
		else if (ne == Cnd_act_dt_fr) doCnd_act_dt_fr_NE(info);
		else if (ne == Cnd_act_dt_to) doCnd_act_dt_to_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_str_ln_cd) doCnd_str_ln_cd_NE(info);
		else if (ne == Cnd_str_ln_nm) doCnd_str_ln_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == columnLot_peg_no) doLot_peg_no_NE(info);
		else if (ne == columnLot_sublot_mng_typ) doLot_sublot_mng_typ_NE(info);
		else if (ne == columnLot_lot_no) doLot_lot_no_NE(info);
		else if (ne == columnLot_sublot_no) doLot_sublot_no_NE(info);
		else if (ne == columnLot_bp_lot_no) doLot_bp_lot_no_NE(info);
		else if (ne == columnLot_first_gr_dt) doLot_first_gr_dt_NE(info);
		else if (ne == columnLot_vld_dt) doLot_vld_dt_NE(info);
		else if (ne == columnLot_lmt_dt) doLot_lmt_dt_NE(info);
		else if (ne == columnLot_insp_no) doLot_insp_no_NE(info);
		else if (ne == columnLot_st_dt) doLot_st_dt_NE(info);
		else if (ne == columnLot_st_hm) doLot_st_hm_NE(info);
		else if (ne == columnLot_end_dt) doLot_end_dt_NE(info);
		else if (ne == columnLot_end_hm) doLot_end_hm_NE(info);
		else if (ne == columnLot_quality_typ) doLot_quality_typ_NE(info);
		else if (ne == columnLot_quality_typ_nm) doLot_quality_typ_nm_NE(info);
		else if (ne == columnLot_judg_dt) doLot_judg_dt_NE(info);
		else if (ne == columnLot_insp_judg_rslt_typ) doLot_insp_judg_rslt_typ_NE(info);
		else if (ne == columnLot_insp_judg_rslt_typ_nm) doLot_insp_judg_rslt_typ_nm_NE(info);
		else if (ne == columnLot_insp_cnt) doLot_insp_cnt_NE(info);
		else if (ne == columnLot_site_cd) doLot_site_cd_NE(info);
		else if (ne == columnLot_site_nm) doLot_site_nm_NE(info);
		else if (ne == columnLot_loc_sppl_cd) doLot_loc_sppl_cd_NE(info);
		else if (ne == columnLot_loc_sppl_nm) doLot_loc_sppl_nm_NE(info);
		else if (ne == columnLot_loc_cd) doLot_loc_cd_NE(info);
		else if (ne == columnLot_loc_nm) doLot_loc_nm_NE(info);
		else if (ne == columnDtl_peg_no) doDtl_peg_no_NE(info);
		else if (ne == columnDtl_act_dt) doDtl_act_dt_NE(info);
		else if (ne == columnDtl_trd_cd) doDtl_trd_cd_NE(info);
		else if (ne == columnDtl_trd_nm) doDtl_trd_nm_NE(info);
		else if (ne == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NE(info);
		else if (ne == columnDtl_trd_ptn_typ_nm) doDtl_trd_ptn_typ_nm_NE(info);
		else if (ne == columnDtl_io_act_typ) doDtl_io_act_typ_NE(info);
		else if (ne == columnDtl_io_act_typ_nm) doDtl_io_act_typ_nm_NE(info);
		else if (ne == columnDtl_base_unit_cd) doDtl_base_unit_cd_NE(info);
		else if (ne == columnDtl_base_unit_nm) doDtl_base_unit_nm_NE(info);
		else if (ne == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NE(info);
		else if (ne == columnDtl_pack_unit_cd) doDtl_pack_unit_cd_NE(info);
		else if (ne == columnDtl_pack_unit_nm) doDtl_pack_unit_nm_NE(info);
		else if (ne == columnDtl_pack_unit_dec_place) doDtl_pack_unit_dec_place_NE(info);
		else if (ne == columnDtl_loc_cd) doDtl_loc_cd_NE(info);
		else if (ne == columnDtl_loc_nm) doDtl_loc_nm_NE(info);
		else if (ne == columnDtl_dlv_cd) doDtl_dlv_cd_NE(info);
		else if (ne == columnDtl_dlv_nm) doDtl_dlv_nm_NE(info);
		else if (ne == columnDtl_tdlv_cd) doDtl_tdlv_cd_NE(info);
		else if (ne == columnDtl_tdlv_nm) doDtl_tdlv_nm_NE(info);
		else if (ne == columnDtl_cst_cd) doDtl_cst_cd_NE(info);
		else if (ne == columnDtl_cst_nm) doDtl_cst_nm_NE(info);
		else if (ne == columnDtl_sppl_cd) doDtl_sppl_cd_NE(info);
		else if (ne == columnDtl_sppl_nm) doDtl_sppl_nm_NE(info);
		else if (ne == columnDtl_xfr_loc_cd) doDtl_xfr_loc_cd_NE(info);
		else if (ne == columnDtl_xfr_loc_nm) doDtl_xfr_loc_nm_NE(info);
		else if (ne == columnDtl_sublot_no) doDtl_sublot_no_NE(info);
		else if (ne == columnDtl_par_lot_no) doDtl_par_lot_no_NE(info);
		else if (ne == columnDtl_par_sublot_no) doDtl_par_sublot_no_NE(info);
		else if (ne == columnDtl_rsn_cd) doDtl_rsn_cd_NE(info);
		else if (ne == columnDtl_rsn_nm) doDtl_rsn_nm_NE(info);
		else if (ne == columnDtl_ac_dt) doDtl_ac_dt_NE(info);
		else if (ne == columnDtl_io_typ) doDtl_io_typ_NE(info);
		else if (ne == columnDtl_io_typ_nm) doDtl_io_typ_nm_NE(info);
		else if (ne == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_NE(info);
		else if (ne == columnDtl_slo_no) doDtl_slo_no_NE(info);
		else if (ne == columnDtl_po_no) doDtl_po_no_NE(info);
		else if (ne == columnDtl_slip_no) doDtl_slip_no_NE(info);
		else if (ne == columnDtl_slip_seq_no) doDtl_slip_seq_no_NE(info);
		else if (ne == columnDtl_trn_typ) doDtl_trn_typ_NE(info);
		else if (ne == columnDtl_trn_typ_nm) doDtl_trn_typ_nm_NE(info);
		else if (ne == columnDtl_act_no) doDtl_act_no_NE(info);
		else if (ne == columnDtl_act_d_no) doDtl_act_d_no_NE(info);
		else if (ne == columnDtl_srt_no) doDtl_srt_no_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [Lot]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[md]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_md_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_nm_NE(MCEventInfo info){
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
	 * [Lot]パネルの[peg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_peg_no_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_bp_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[first_gr_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_first_gr_dt_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[vld_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_vld_dt_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[lmt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_lmt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[insp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_insp_no_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[st_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_st_hm_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[end_hm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_end_hm_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[judg_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_judg_dt_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[insp_judg_rslt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_insp_judg_rslt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[insp_judg_rslt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_insp_judg_rslt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[insp_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_insp_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[loc_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_loc_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[loc_sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_loc_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[peg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_peg_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_act_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_act_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_act_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_act_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tdlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tdlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tdlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tdlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_seq_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_seq_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[srt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_srt_no_NE(MCEventInfo info){
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
		else if (nx == LotTable) doLot_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_md_Group) doCnd_md_NX(info);
		else if (nx == Cnd_act_dt_fr) doCnd_act_dt_fr_NX(info);
		else if (nx == Cnd_act_dt_to) doCnd_act_dt_to_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_str_ln_cd) doCnd_str_ln_cd_NX(info);
		else if (nx == Cnd_str_ln_nm) doCnd_str_ln_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == columnLot_peg_no) doLot_peg_no_NX(info);
		else if (nx == columnLot_sublot_mng_typ) doLot_sublot_mng_typ_NX(info);
		else if (nx == columnLot_lot_no) doLot_lot_no_NX(info);
		else if (nx == columnLot_sublot_no) doLot_sublot_no_NX(info);
		else if (nx == columnLot_bp_lot_no) doLot_bp_lot_no_NX(info);
		else if (nx == columnLot_first_gr_dt) doLot_first_gr_dt_NX(info);
		else if (nx == columnLot_vld_dt) doLot_vld_dt_NX(info);
		else if (nx == columnLot_lmt_dt) doLot_lmt_dt_NX(info);
		else if (nx == columnLot_insp_no) doLot_insp_no_NX(info);
		else if (nx == columnLot_st_dt) doLot_st_dt_NX(info);
		else if (nx == columnLot_st_hm) doLot_st_hm_NX(info);
		else if (nx == columnLot_end_dt) doLot_end_dt_NX(info);
		else if (nx == columnLot_end_hm) doLot_end_hm_NX(info);
		else if (nx == columnLot_quality_typ) doLot_quality_typ_NX(info);
		else if (nx == columnLot_quality_typ_nm) doLot_quality_typ_nm_NX(info);
		else if (nx == columnLot_judg_dt) doLot_judg_dt_NX(info);
		else if (nx == columnLot_insp_judg_rslt_typ) doLot_insp_judg_rslt_typ_NX(info);
		else if (nx == columnLot_insp_judg_rslt_typ_nm) doLot_insp_judg_rslt_typ_nm_NX(info);
		else if (nx == columnLot_insp_cnt) doLot_insp_cnt_NX(info);
		else if (nx == columnLot_site_cd) doLot_site_cd_NX(info);
		else if (nx == columnLot_site_nm) doLot_site_nm_NX(info);
		else if (nx == columnLot_loc_sppl_cd) doLot_loc_sppl_cd_NX(info);
		else if (nx == columnLot_loc_sppl_nm) doLot_loc_sppl_nm_NX(info);
		else if (nx == columnLot_loc_cd) doLot_loc_cd_NX(info);
		else if (nx == columnLot_loc_nm) doLot_loc_nm_NX(info);
		else if (nx == columnDtl_peg_no) doDtl_peg_no_NX(info);
		else if (nx == columnDtl_act_dt) doDtl_act_dt_NX(info);
		else if (nx == columnDtl_trd_cd) doDtl_trd_cd_NX(info);
		else if (nx == columnDtl_trd_nm) doDtl_trd_nm_NX(info);
		else if (nx == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NX(info);
		else if (nx == columnDtl_trd_ptn_typ_nm) doDtl_trd_ptn_typ_nm_NX(info);
		else if (nx == columnDtl_io_act_typ) doDtl_io_act_typ_NX(info);
		else if (nx == columnDtl_io_act_typ_nm) doDtl_io_act_typ_nm_NX(info);
		else if (nx == columnDtl_base_unit_cd) doDtl_base_unit_cd_NX(info);
		else if (nx == columnDtl_base_unit_nm) doDtl_base_unit_nm_NX(info);
		else if (nx == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NX(info);
		else if (nx == columnDtl_pack_unit_cd) doDtl_pack_unit_cd_NX(info);
		else if (nx == columnDtl_pack_unit_nm) doDtl_pack_unit_nm_NX(info);
		else if (nx == columnDtl_pack_unit_dec_place) doDtl_pack_unit_dec_place_NX(info);
		else if (nx == columnDtl_loc_cd) doDtl_loc_cd_NX(info);
		else if (nx == columnDtl_loc_nm) doDtl_loc_nm_NX(info);
		else if (nx == columnDtl_dlv_cd) doDtl_dlv_cd_NX(info);
		else if (nx == columnDtl_dlv_nm) doDtl_dlv_nm_NX(info);
		else if (nx == columnDtl_tdlv_cd) doDtl_tdlv_cd_NX(info);
		else if (nx == columnDtl_tdlv_nm) doDtl_tdlv_nm_NX(info);
		else if (nx == columnDtl_cst_cd) doDtl_cst_cd_NX(info);
		else if (nx == columnDtl_cst_nm) doDtl_cst_nm_NX(info);
		else if (nx == columnDtl_sppl_cd) doDtl_sppl_cd_NX(info);
		else if (nx == columnDtl_sppl_nm) doDtl_sppl_nm_NX(info);
		else if (nx == columnDtl_xfr_loc_cd) doDtl_xfr_loc_cd_NX(info);
		else if (nx == columnDtl_xfr_loc_nm) doDtl_xfr_loc_nm_NX(info);
		else if (nx == columnDtl_sublot_no) doDtl_sublot_no_NX(info);
		else if (nx == columnDtl_par_lot_no) doDtl_par_lot_no_NX(info);
		else if (nx == columnDtl_par_sublot_no) doDtl_par_sublot_no_NX(info);
		else if (nx == columnDtl_rsn_cd) doDtl_rsn_cd_NX(info);
		else if (nx == columnDtl_rsn_nm) doDtl_rsn_nm_NX(info);
		else if (nx == columnDtl_ac_dt) doDtl_ac_dt_NX(info);
		else if (nx == columnDtl_io_typ) doDtl_io_typ_NX(info);
		else if (nx == columnDtl_io_typ_nm) doDtl_io_typ_nm_NX(info);
		else if (nx == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_NX(info);
		else if (nx == columnDtl_slo_no) doDtl_slo_no_NX(info);
		else if (nx == columnDtl_po_no) doDtl_po_no_NX(info);
		else if (nx == columnDtl_slip_no) doDtl_slip_no_NX(info);
		else if (nx == columnDtl_slip_seq_no) doDtl_slip_seq_no_NX(info);
		else if (nx == columnDtl_trn_typ) doDtl_trn_typ_NX(info);
		else if (nx == columnDtl_trn_typ_nm) doDtl_trn_typ_nm_NX(info);
		else if (nx == columnDtl_act_no) doDtl_act_no_NX(info);
		else if (nx == columnDtl_act_d_no) doDtl_act_d_no_NX(info);
		else if (nx == columnDtl_srt_no) doDtl_srt_no_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [Lot]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[md]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_md_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_nm_NX(MCEventInfo info){
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
	 * [Lot]パネルの[peg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_peg_no_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_bp_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[first_gr_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_first_gr_dt_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[vld_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_vld_dt_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[lmt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_lmt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[insp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_insp_no_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[st_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_st_hm_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[end_hm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_end_hm_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[judg_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_judg_dt_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[insp_judg_rslt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_insp_judg_rslt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[insp_judg_rslt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_insp_judg_rslt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[insp_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_insp_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[loc_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_loc_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[loc_sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_loc_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[peg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_peg_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_act_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_act_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_act_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_act_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tdlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tdlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tdlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tdlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_seq_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_seq_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[srt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_srt_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_act_dt_fr) doCnd_act_dt_fr_LC(info);
		else if (lc == Cnd_act_dt_to) doCnd_act_dt_to_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_str_ln_cd) doCnd_str_ln_cd_LC(info);
		else if (lc == Cnd_str_ln_nm) doCnd_str_ln_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == columnLot_peg_no) doLot_peg_no_LC(info);
		else if (lc == columnLot_sublot_mng_typ) doLot_sublot_mng_typ_LC(info);
		else if (lc == columnLot_lot_no) doLot_lot_no_LC(info);
		else if (lc == columnLot_sublot_no) doLot_sublot_no_LC(info);
		else if (lc == columnLot_bp_lot_no) doLot_bp_lot_no_LC(info);
		else if (lc == columnLot_first_gr_dt) doLot_first_gr_dt_LC(info);
		else if (lc == columnLot_vld_dt) doLot_vld_dt_LC(info);
		else if (lc == columnLot_lmt_dt) doLot_lmt_dt_LC(info);
		else if (lc == columnLot_insp_no) doLot_insp_no_LC(info);
		else if (lc == columnLot_st_dt) doLot_st_dt_LC(info);
		else if (lc == columnLot_st_hm) doLot_st_hm_LC(info);
		else if (lc == columnLot_end_dt) doLot_end_dt_LC(info);
		else if (lc == columnLot_end_hm) doLot_end_hm_LC(info);
		else if (lc == columnLot_quality_typ) doLot_quality_typ_LC(info);
		else if (lc == columnLot_quality_typ_nm) doLot_quality_typ_nm_LC(info);
		else if (lc == columnLot_judg_dt) doLot_judg_dt_LC(info);
		else if (lc == columnLot_insp_judg_rslt_typ) doLot_insp_judg_rslt_typ_LC(info);
		else if (lc == columnLot_insp_judg_rslt_typ_nm) doLot_insp_judg_rslt_typ_nm_LC(info);
		else if (lc == columnLot_insp_cnt) doLot_insp_cnt_LC(info);
		else if (lc == columnLot_site_cd) doLot_site_cd_LC(info);
		else if (lc == columnLot_site_nm) doLot_site_nm_LC(info);
		else if (lc == columnLot_loc_sppl_cd) doLot_loc_sppl_cd_LC(info);
		else if (lc == columnLot_loc_sppl_nm) doLot_loc_sppl_nm_LC(info);
		else if (lc == columnLot_loc_cd) doLot_loc_cd_LC(info);
		else if (lc == columnLot_loc_nm) doLot_loc_nm_LC(info);
		else if (lc == columnDtl_peg_no) doDtl_peg_no_LC(info);
		else if (lc == columnDtl_act_dt) doDtl_act_dt_LC(info);
		else if (lc == columnDtl_trd_cd) doDtl_trd_cd_LC(info);
		else if (lc == columnDtl_trd_nm) doDtl_trd_nm_LC(info);
		else if (lc == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_LC(info);
		else if (lc == columnDtl_trd_ptn_typ_nm) doDtl_trd_ptn_typ_nm_LC(info);
		else if (lc == columnDtl_io_act_typ) doDtl_io_act_typ_LC(info);
		else if (lc == columnDtl_io_act_typ_nm) doDtl_io_act_typ_nm_LC(info);
		else if (lc == columnDtl_base_unit_cd) doDtl_base_unit_cd_LC(info);
		else if (lc == columnDtl_base_unit_nm) doDtl_base_unit_nm_LC(info);
		else if (lc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_LC(info);
		else if (lc == columnDtl_pack_unit_cd) doDtl_pack_unit_cd_LC(info);
		else if (lc == columnDtl_pack_unit_nm) doDtl_pack_unit_nm_LC(info);
		else if (lc == columnDtl_pack_unit_dec_place) doDtl_pack_unit_dec_place_LC(info);
		else if (lc == columnDtl_loc_cd) doDtl_loc_cd_LC(info);
		else if (lc == columnDtl_loc_nm) doDtl_loc_nm_LC(info);
		else if (lc == columnDtl_dlv_cd) doDtl_dlv_cd_LC(info);
		else if (lc == columnDtl_dlv_nm) doDtl_dlv_nm_LC(info);
		else if (lc == columnDtl_tdlv_cd) doDtl_tdlv_cd_LC(info);
		else if (lc == columnDtl_tdlv_nm) doDtl_tdlv_nm_LC(info);
		else if (lc == columnDtl_cst_cd) doDtl_cst_cd_LC(info);
		else if (lc == columnDtl_cst_nm) doDtl_cst_nm_LC(info);
		else if (lc == columnDtl_sppl_cd) doDtl_sppl_cd_LC(info);
		else if (lc == columnDtl_sppl_nm) doDtl_sppl_nm_LC(info);
		else if (lc == columnDtl_xfr_loc_cd) doDtl_xfr_loc_cd_LC(info);
		else if (lc == columnDtl_xfr_loc_nm) doDtl_xfr_loc_nm_LC(info);
		else if (lc == columnDtl_sublot_no) doDtl_sublot_no_LC(info);
		else if (lc == columnDtl_par_lot_no) doDtl_par_lot_no_LC(info);
		else if (lc == columnDtl_par_sublot_no) doDtl_par_sublot_no_LC(info);
		else if (lc == columnDtl_rsn_cd) doDtl_rsn_cd_LC(info);
		else if (lc == columnDtl_rsn_nm) doDtl_rsn_nm_LC(info);
		else if (lc == columnDtl_ac_dt) doDtl_ac_dt_LC(info);
		else if (lc == columnDtl_io_typ) doDtl_io_typ_LC(info);
		else if (lc == columnDtl_io_typ_nm) doDtl_io_typ_nm_LC(info);
		else if (lc == columnDtl_mfg_inst_no) doDtl_mfg_inst_no_LC(info);
		else if (lc == columnDtl_slo_no) doDtl_slo_no_LC(info);
		else if (lc == columnDtl_po_no) doDtl_po_no_LC(info);
		else if (lc == columnDtl_slip_no) doDtl_slip_no_LC(info);
		else if (lc == columnDtl_slip_seq_no) doDtl_slip_seq_no_LC(info);
		else if (lc == columnDtl_trn_typ) doDtl_trn_typ_LC(info);
		else if (lc == columnDtl_trn_typ_nm) doDtl_trn_typ_nm_LC(info);
		else if (lc == columnDtl_act_no) doDtl_act_no_LC(info);
		else if (lc == columnDtl_act_d_no) doDtl_act_d_no_LC(info);
		else if (lc == columnDtl_srt_no) doDtl_srt_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[act_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[act_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_act_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_site_nm_LC(MCEventInfo info){
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
	 * [Lot]パネルの[peg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_peg_no_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_bp_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[first_gr_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_first_gr_dt_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[vld_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_vld_dt_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[lmt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_lmt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[insp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_insp_no_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[st_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_st_hm_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[end_hm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_end_hm_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[judg_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_judg_dt_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[insp_judg_rslt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_insp_judg_rslt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[insp_judg_rslt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_insp_judg_rslt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[insp_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_insp_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[loc_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_loc_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[loc_sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_loc_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lot]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLot_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[peg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_peg_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_act_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_act_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_act_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_act_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pack_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pack_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tdlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tdlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tdlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tdlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slip_seq_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slip_seq_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[srt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_srt_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_site_cd]の作成メソッド
	 */
	public MCList getCnd_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
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

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL0100.Srch01")) {
			return new MS_MSBEL0100_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL0100_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL0100_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL0100_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL0100_Srch01Bridge() {
			p_MS_MSBEL0100_Srch01 = new MCParam(PDef.MS_MSBEL0100_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL0100_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP0100.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0100.LotR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0100.DtlR.class));

			p_MS_MSBEL0100_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL0100_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL0100_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL0100_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL0100_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP0100.CndR up0() {
			return (mcframe.clientMSBE.MSBEP0100.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP0100.LotR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP0100.LotR>)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP0100.DtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP0100.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBEL0100_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0100.LotR.class));
			p_MS_MSBEL0100_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP0100.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL0100_Srch01;
		}

		protected void show() {
			setLotL((MCList<mcframe.clientMSBE.MSBEP0100.LotR>)p_MS_MSBEL0100_Srch01.getContainerParam().getDownBlock(0));
			setDtlHideL((MCList<mcframe.clientMSBE.MSBEP0100.DtlR>)p_MS_MSBEL0100_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getLotL().clear();
			getDtlHideL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getLotL());
			result.add(getDtlHideL());
			return result;
		}
	}
}