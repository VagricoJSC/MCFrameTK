package mcframe.clientMSBE.MSBEP1480;

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
import mcframe.clientMSBE.MSBEP1480.MSBEP_ShipStkRplLst_MC.MS_MSBEL1480_Srch01Caller;
import mcframe.clientMSBE.MSBEP1480.MSBEP_ShipStkRplLst_MC.MS_MSBEL1480_Upd01Caller;
import mcframe.clientMSBE.MSBEP1480.MSBEP_ShipStkRplLst_MC.MS_MSBEL1480_Del01Caller;
import mcframe.clientMSBE.MSBEP1480.MSBEP_ShipStkRplLst_MC.MS_MSBEL1480_Upd02Caller;

/**
 * 画面"MSBEP_ShipStkRplLst"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_ShipStkRplLst_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP1480";

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
	 * XFR,Create movement schedule;UPD,Modify;DEL,Cancel; REF,View XFR,移動予定を作成する;UPD,訂正する;DEL,取り消す;REF,参照する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_XFR = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_schd_dt_fr_Label = null;
	/**
	 * Scheduled date FROM 予定日付ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_schd_dt_fr = null;
	public MCLabel Cnd_schd_dt_to_Label = null;
	/**
	 * Scheduled date TO 予定日付ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_schd_dt_to = null;
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
	public MCLabel Cnd_lg_grp_cd_Label = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCTextField Cnd_lg_grp_nm = null;
	public MCLabel Cnd_loc_grp_cd_Label = null;
	/**
	 * Location group cd. 場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_loc_grp_cd = null;
	/**
	 * Location group name 場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_loc_grp_nm = null;
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
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_wrk_no_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_wrk_no_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_wrk_no_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_wrk_no_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_wrk_no_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[sno_wrk_no_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[sno_wrk_no_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_batch_log_no_Label = null;
	/**
	 * Batch log No. バッチログＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_batch_log_no = null;
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
	// [LPnl]ブロック関連のField定義
	public MCPanel LPnlPanel = null;
	// [LPnl]ブロックの項目のField定義
	/**
	 * Display detailed column 詳細項目表示.<p>
	 *
	 */
	public MCCheckBox LPnl_dtl_flg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP1480.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Scheduled date 予定日付.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_dt = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Rslt_ver_no_p_PPanel;
	public MCColumnConfig columnRslt_ver_no;// [Rslt]の[ver_no_p.ver_no]を[columnRslt_ver_no]としてエイリアス定義。
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
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_wrk_no_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno1_null_flg;// [Rslt]の[sno_wrk_no_p.sno1_null_flg]を[columnRslt_sno1_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_wrk_no_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2_null_flg;// [Rslt]の[sno_wrk_no_p.sno2_null_flg]を[columnRslt_sno2_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_wrk_no_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3_null_flg;// [Rslt]の[sno_wrk_no_p.sno3_null_flg]を[columnRslt_sno3_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_wrk_no_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4_null_flg;// [Rslt]の[sno_wrk_no_p.sno4_null_flg]を[columnRslt_sno4_null_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_pack_unit_short_qty_p_PPanel;
	public MCColumnConfig columnRslt_pack_unit_short_qty;// [Rslt]の[pack_unit_short_qty_p.qty]を[columnRslt_pack_unit_short_qty]としてエイリアス定義。
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_unit_cd = null;
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_unit_nm = null;
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
	 * SKU conversion base qty. 荷姿単位換算基準数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_unit_conv_base_qty = null;
	/**
	 * SKU conversion qty. 荷姿単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_unit_conv_qty = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_short_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_short_qty;// [Rslt]の[base_unit_short_qty_p.qty]を[columnRslt_base_unit_short_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_nm = null;
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
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Rslt_str_ln_p_PPanel;
	public MCColumnConfig columnRslt_str_ln_cd;// [Rslt]の[str_ln_p.str_ln_cd]を[columnRslt_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_str_ln_nm;// [Rslt]の[str_ln_p.str_ln_nm]を[columnRslt_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnRslt_str_ln_cd_none_flg;// [Rslt]の[str_ln_p.str_ln_cd_none_flg]を[columnRslt_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Location group cd. 場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_grp_cd = null;
	/**
	 * Location group name 場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_grp_nm = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lg_grp_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_nm = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_site_nm = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_d_no = null;
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_schd_no = null;
	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_typ = null;
	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_typ_nm = null;
	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sts_typ = null;
	/**
	 * GR/GI schedule status type 受払予定状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sts_typ_nm = null;
	/**
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_no = null;
	/**
	 * GR/GI schedule sequence number 受払予定連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_seq = null;
	/**
	 * GR/GI schedule slip No. 受払予定伝票ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slip_schd_no = null;
	/**
	 * GR/GI schedule spare type 1 受払予定予備区分１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_typ1 = null;
	/**
	 * GR/GI schedule spare type name 1 受払予定予備区分名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_typ_nm1 = null;
	/**
	 * GR/GI schedule No. 1 受払予定ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_no1 = null;
	/**
	 * GR/GI schedule spare type 2 受払予定予備区分２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_typ2 = null;
	/**
	 * GR/GI schedule spare type name 2 受払予定予備区分名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_typ_nm2 = null;
	/**
	 * GR/GI schedule No. 2 受払予定ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_no2 = null;
	/**
	 * GR/GI schedule spare type 3 受払予定予備区分３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_typ3 = null;
	/**
	 * GR/GI schedule spare type name 3 受払予定予備区分名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_typ_nm3 = null;
	/**
	 * GR/GI schedule No. 3 受払予定ＮＯ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_no3 = null;
	/**
	 * GR/GI schedule spare type 4 受払予定予備区分４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_typ4 = null;
	/**
	 * GR/GI schedule spare type name 4 受払予定予備区分名４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_typ_nm4 = null;
	/**
	 * GR/GI schedule No. 4 受払予定ＮＯ４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_sub_no4 = null;
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_pr_no = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gd_nm = null;
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
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_bp_cd = null;
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_bp_nm = null;
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_arrv_bp_cd = null;
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_arrv_bp_nm = null;
	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_vld_dt_fr = null;
	/**
	 * Allocation 引当.<p>
	 *
	 */
	public MCColumnConfig columnRslt_alloc_flg = null;
	/**
	 * Batch log No. バッチログＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_batch_log_no = null;
	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_batch_data_no = null;
	/**
	 * List creation date and time 一覧作成日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_exec_tm = null;
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
	 * Sales order entry 受注登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBBP1210 = null;
	/**
	 * Shipping schedule change entry 出荷予定変更登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP1420 = null;
	/**
	 * Movement/transport schedule entry 移動・移送予定登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP1000 = null;
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
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_xfr = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH_XFR]モードを表す定数 */
	public static final String SRCH_XFR = "SRCH_XFR";
	/** [XFR]モードを表す定数 */
	public static final String XFR = "XFR";
	/** [SRCH_UPD]モードを表す定数 */
	public static final String SRCH_UPD = "SRCH_UPD";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [SRCH_DEL]モードを表す定数 */
	public static final String SRCH_DEL = "SRCH_DEL";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_XFR, XFR, SRCH_UPD, UPD, SRCH_DEL, DEL, SRCH, REF};
	
	/** [MS_MSBEL1480_Srch01]のCallerの作成 */
	protected MSBEP_ShipStkRplLst_MC.MS_MSBEL1480_Srch01Caller createMS_MSBEL1480_Srch01() {
		MSBEP_ShipStkRplLst_MC.MS_MSBEL1480_Srch01Caller<MSBEP_ShipStkRplLst, MS_MSBEL1480_Srch01Bridge>
		caller = ((MSBEP_ShipStkRplLst_MC)this).new MS_MSBEL1480_Srch01Caller<MSBEP_ShipStkRplLst, MS_MSBEL1480_Srch01Bridge>(
					(MSBEP_ShipStkRplLst)this, new MS_MSBEL1480_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL1480_Srch01]の呼び出し */
	protected void callMS_MSBEL1480_Srch01() {
		MCCaller caller = createMS_MSBEL1480_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL1480_Upd01]のCallerの作成 */
	protected MSBEP_ShipStkRplLst_MC.MS_MSBEL1480_Upd01Caller createMS_MSBEL1480_Upd01() {
		MSBEP_ShipStkRplLst_MC.MS_MSBEL1480_Upd01Caller<MSBEP_ShipStkRplLst, MS_MSBEL1480_Upd01Bridge>
		caller = ((MSBEP_ShipStkRplLst_MC)this).new MS_MSBEL1480_Upd01Caller<MSBEP_ShipStkRplLst, MS_MSBEL1480_Upd01Bridge>(
					(MSBEP_ShipStkRplLst)this, new MS_MSBEL1480_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBEL1480_Upd01]の呼び出し */
	protected void callMS_MSBEL1480_Upd01() {
		MCCaller caller = createMS_MSBEL1480_Upd01();
		caller.exec();
	}
	/** [MS_MSBEL1480_Del01]のCallerの作成 */
	protected MSBEP_ShipStkRplLst_MC.MS_MSBEL1480_Del01Caller createMS_MSBEL1480_Del01() {
		MSBEP_ShipStkRplLst_MC.MS_MSBEL1480_Del01Caller<MSBEP_ShipStkRplLst, MS_MSBEL1480_Del01Bridge>
		caller = ((MSBEP_ShipStkRplLst_MC)this).new MS_MSBEL1480_Del01Caller<MSBEP_ShipStkRplLst, MS_MSBEL1480_Del01Bridge>(
					(MSBEP_ShipStkRplLst)this, new MS_MSBEL1480_Del01Bridge());
		return caller;
	}
	/** [MS_MSBEL1480_Del01]の呼び出し */
	protected void callMS_MSBEL1480_Del01() {
		MCCaller caller = createMS_MSBEL1480_Del01();
		caller.exec();
	}
	/** [MS_MSBEL1480_Upd02]のCallerの作成 */
	protected MSBEP_ShipStkRplLst_MC.MS_MSBEL1480_Upd02Caller createMS_MSBEL1480_Upd02() {
		MSBEP_ShipStkRplLst_MC.MS_MSBEL1480_Upd02Caller<MSBEP_ShipStkRplLst, MS_MSBEL1480_Upd02Bridge>
		caller = ((MSBEP_ShipStkRplLst_MC)this).new MS_MSBEL1480_Upd02Caller<MSBEP_ShipStkRplLst, MS_MSBEL1480_Upd02Bridge>(
					(MSBEP_ShipStkRplLst)this, new MS_MSBEL1480_Upd02Bridge());
		return caller;
	}
	/** [MS_MSBEL1480_Upd02]の呼び出し */
	protected void callMS_MSBEL1480_Upd02() {
		MCCaller caller = createMS_MSBEL1480_Upd02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1480.CndR aCndR;
	/** [LPnl]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1480.LPnlR aLPnlR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1480.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP1480.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1480.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1480.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP1480.CndR.create();
	}

	/**
	 * 項目コピーによってaLPnlRを設定します。
	 *
	 * aLPnlRのインスタンスは変更されません。
	 *
	 * @param row LPnlR
	 */
	public void setLPnlR(mcframe.clientMSBE.MSBEP1480.LPnlR row) {
		if (row != null) {
			MCRow.copyall(getLPnlR(), row);
		}
	}

	/**
	 * [LPnl]ブロックのコンテナaLPnlRを返します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMSBE.MSBEP1480.LPnlR getLPnlR() {
		return aLPnlR;
	}

	/**
	 * aLPnlRを作成します。
	 *
	 * @return LPnlR
	 */
	public mcframe.clientMSBE.MSBEP1480.LPnlR createLPnlR() {
		return mcframe.clientMSBE.MSBEP1480.LPnlR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBE.MSBEP1480.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1480.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBE.MSBEP1480.RsltR createRsltR() {
		return mcframe.clientMSBE.MSBEP1480.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1480.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1480.RsltR.class);
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
		if(!MCCollectionUtil.contains(ret, getLPnlR())) ret.add(getLPnlR());
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
		if(aCnt == getLPnlR()) return "LPnl";
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
		if(bId.equals("LPnl")) return getLPnlR();
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
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(LPnlPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_ShipStkRplLst_MC_A() {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_ShipStkRplLst_MC_A(String name) {
		aCndR = createCndR();
		aLPnlR = createLPnlR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBEP_ShipStkRplLst_MC.jbCreateScreenOpe((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbCreateTop((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbCreateFold((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbCreateTab1((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbCreateTab2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbCreateCnd((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbCreateCnd2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbCreateLPnl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbCreateCtrl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbCreateRslt((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbCreateBtn((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbCreateEastBtn((MSBEP_ShipStkRplLst)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_ShipStkRplLst p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_ShipStkRplLst p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_ShipStkRplLst p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBEP_ShipStkRplLst p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBEP_ShipStkRplLst p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_ShipStkRplLst p) {
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
		p.Cnd_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.create(p.getCndR().sno_wrk_no_p());
		p.Cnd_sno_wrk_no_p_PPanel.setName("Cnd.sno_wrk_no_p");
		p.Cnd_sno1 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno1;
		p.Cnd_sno1.addAliasName("Cnd.sno1", p);
		p.Cnd_sno2 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno2;
		p.Cnd_sno2.addAliasName("Cnd.sno2", p);
		p.Cnd_sno3 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno3;
		p.Cnd_sno3.addAliasName("Cnd.sno3", p);
		p.Cnd_sno4 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno4;
		p.Cnd_sno4.addAliasName("Cnd.sno4", p);
		p.Cnd_wrk_no = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm;
		p.Cnd_wrk_nm.addAliasName("Cnd.wrk_nm", p);
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
	protected static void jbCreateCnd2(MSBEP_ShipStkRplLst p) {
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MSBEP_ShipStkRplLst p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBEP_ShipStkRplLst p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBEP_ShipStkRplLst p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP1480.RsltR.$itm_p);
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
		p.Rslt_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBE.MSBEP1480.RsltR.$ver_no_p);
		p.Rslt_ver_no_p_PPanel.setName("Rslt.ver_no_p");
		p.columnRslt_ver_no = p.Rslt_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnRslt_ver_no.addAliasName("Rslt.ver_no", p);
		p.Rslt_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP1480.RsltR.$sno_wrk_no_p);
		p.Rslt_sno_wrk_no_p_PPanel.setName("Rslt.sno_wrk_no_p");
		p.columnRslt_sno1 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt_sno1.addAliasName("Rslt.sno1", p);
		p.columnRslt_sno1_null_flg = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg;
		p.columnRslt_sno1_null_flg.addAliasName("Rslt.sno1_null_flg", p);
		p.columnRslt_sno2 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt_sno2.addAliasName("Rslt.sno2", p);
		p.columnRslt_sno2_null_flg = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg;
		p.columnRslt_sno2_null_flg.addAliasName("Rslt.sno2_null_flg", p);
		p.columnRslt_sno3 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt_sno3.addAliasName("Rslt.sno3", p);
		p.columnRslt_sno3_null_flg = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg;
		p.columnRslt_sno3_null_flg.addAliasName("Rslt.sno3_null_flg", p);
		p.columnRslt_sno4 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt_sno4.addAliasName("Rslt.sno4", p);
		p.columnRslt_sno4_null_flg = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg;
		p.columnRslt_sno4_null_flg.addAliasName("Rslt.sno4_null_flg", p);
		p.columnRslt_wrk_no = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_pack_unit_short_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1480.RsltR.$pack_unit_short_qty_p);
		p.Rslt_pack_unit_short_qty_p_PPanel.setName("Rslt.pack_unit_short_qty_p");
		p.columnRslt_pack_unit_short_qty = p.Rslt_pack_unit_short_qty_p_PPanel.columnQty_qty;
		p.columnRslt_pack_unit_short_qty.addAliasName("Rslt.pack_unit_short_qty", p);
		p.Rslt_base_unit_short_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1480.RsltR.$base_unit_short_qty_p);
		p.Rslt_base_unit_short_qty_p_PPanel.setName("Rslt.base_unit_short_qty_p");
		p.columnRslt_base_unit_short_qty = p.Rslt_base_unit_short_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_short_qty.addAliasName("Rslt.base_unit_short_qty", p);
		p.Rslt_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBE.MSBEP1480.RsltR.$str_ln_p);
		p.Rslt_str_ln_p_PPanel.setName("Rslt.str_ln_p");
		p.columnRslt_str_ln_cd = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnRslt_str_ln_cd.addAliasName("Rslt.str_ln_cd", p);
		p.columnRslt_str_ln_nm = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnRslt_str_ln_nm.addAliasName("Rslt.str_ln_nm", p);
		p.columnRslt_str_ln_cd_none_flg = p.Rslt_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnRslt_str_ln_cd_none_flg.addAliasName("Rslt.str_ln_cd_none_flg", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBE.MSBEP1480.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_ShipStkRplLst p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBEP_ShipStkRplLst p) {
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
	
	
	/** [Cnd_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_lg_grp_cd_p = null;

	/**
	 * [Cnd_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_lg_grp_cd_ListPutter() {
		if (Cnd_lg_grp_cd_p == null) {
			Cnd_lg_grp_cd_p = createCnd_lg_grp_cd_ListPutter(Cnd_lg_grp_cd, "lg_grp_cd", "lg_grp_nm");

		}
		return Cnd_lg_grp_cd_p;
	}
	
	
	/** [Cnd_loc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_loc_grp_cd_p = null;

	/**
	 * [Cnd_loc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_loc_grp_cd_ListPutter() {
		if (Cnd_loc_grp_cd_p == null) {
			Cnd_loc_grp_cd_p = createCnd_loc_grp_cd_ListPutter(Cnd_loc_grp_cd, "loc_grp_cd", "loc_grp_nm");

		}
		return Cnd_loc_grp_cd_p;
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
	
	
	/** [Rslt_loc_cd_ListPutter]の定義 */
	private MCListPutter Rslt_loc_cd_p = null;

	/**
	 * [Rslt_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_loc_cd_ListPutter() {
		if (Rslt_loc_cd_p == null) {
			Rslt_loc_cd_p = createRslt_loc_cd_ListPutter(columnRslt_loc_cd, "loc_cd");

		}
		return Rslt_loc_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_ShipStkRplLst create(){
		MSBEP_ShipStkRplLst p = new MSBEP_ShipStkRplLst();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_ShipStkRplLst create(String name){
		MSBEP_ShipStkRplLst p = new MSBEP_ShipStkRplLst(name);
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
		MSBEP_ShipStkRplLst_MC.jbfInitScreenOpe((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbfInitTop((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbfInitFold((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbfInitTab1((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbfInitTab2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbfInitCnd((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbfInitCnd2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbfInitLPnl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbfInitCtrl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbfInitRslt((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbfInitBtn((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbfInitEastBtn((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbInitScreenOpe((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbInitTop((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbInitFold((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbInitTab1((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbInitTab2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbInitCnd((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbInitCnd2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbInitLPnl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbInitCtrl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbInitRslt((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbInitBtn((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.jbInitEastBtn((MSBEP_ShipStkRplLst)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_ShipStkRplLst p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_ShipStkRplLst p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_ShipStkRplLst p) {
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
	protected static void jbfInitTab1(MSBEP_ShipStkRplLst p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBEP_ShipStkRplLst p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_ShipStkRplLst p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_XFR = p.beansFactory.createRadioButton("Cnd.ope_XFR");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.schd_dt_fr_Label");
		p.Cnd_schd_dt_fr = p.beansFactory.createDateField("Cnd.schd_dt_fr");
		p.Cnd_schd_dt_fr.setLabel(p.Cnd_schd_dt_fr_Label);
		p.Cnd_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.schd_dt_to_Label");
		p.Cnd_schd_dt_to = p.beansFactory.createDateField("Cnd.schd_dt_to");
		p.Cnd_schd_dt_to.setLabel(p.Cnd_schd_dt_to_Label);
		p.Cnd_site_cd_Label = p.beansFactory.createLabel("Cnd.site_cd_Label");
		p.Cnd_site_cd = p.beansFactory.createTextComboBox("Cnd.site_cd");
		p.Cnd_site_cd.setLabel(p.Cnd_site_cd_Label);
		p.Cnd_site_nm = p.beansFactory.createTextField("Cnd.site_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.lg_grp_cd_Label");
		p.Cnd_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.lg_grp_cd");
		p.Cnd_lg_grp_cd.setLabel(p.Cnd_lg_grp_cd_Label);
		p.Cnd_lg_grp_nm = p.beansFactory.createTextField("Cnd.lg_grp_nm");
		p.Cnd_loc_grp_cd_Label = p.beansFactory.createLabel("Cnd.loc_grp_cd_Label");
		p.Cnd_loc_grp_cd = p.beansFactory.createTextComboBox("Cnd.loc_grp_cd");
		p.Cnd_loc_grp_cd.setLabel(p.Cnd_loc_grp_cd_Label);
		p.Cnd_loc_grp_nm = p.beansFactory.createTextField("Cnd.loc_grp_nm");
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
		p.Cnd_batch_log_no_Label = p.beansFactory.createLabel("Cnd.batch_log_no_Label");
		p.Cnd_batch_log_no = p.beansFactory.createTextField("Cnd.batch_log_no");
		p.Cnd_batch_log_no.setLabel(p.Cnd_batch_log_no_Label);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBEP_ShipStkRplLst p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MSBEP_ShipStkRplLst p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
		p.LPnl_dtl_flg = p.beansFactory.createCheckBox("LPnl.dtl_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_ShipStkRplLst p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBEP_ShipStkRplLst p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_schd_dt = p.beansFactory.createTableColumn("Rslt.schd_dt", MCColumnType.DATE);
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
		p.columnRslt_pack_unit_cd = p.beansFactory.createTableColumn("Rslt.pack_unit_cd", MCColumnType.TEXT);
		p.columnRslt_pack_unit_nm = p.beansFactory.createTableColumn("Rslt.pack_unit_nm", MCColumnType.TEXT);
		p.columnRslt_pack_unit_dec_place = p.beansFactory.createTableColumn("Rslt.pack_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_pack_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.pack_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_pack_unit_conv_base_qty = p.beansFactory.createTableColumn("Rslt.pack_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnRslt_pack_unit_conv_qty = p.beansFactory.createTableColumn("Rslt.pack_unit_conv_qty", MCColumnType.NUMBER);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_unit_dec_place = p.beansFactory.createTableColumn("Rslt.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_loc_cd = p.beansFactory.createTableColumn("Rslt.loc_cd", MCColumnType.TEXT);
		p.columnRslt_loc_nm = p.beansFactory.createTableColumn("Rslt.loc_nm", MCColumnType.TEXT);
		p.columnRslt_str_ln_tgt_flg = p.beansFactory.createTableColumn("Rslt.str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnRslt_loc_grp_cd = p.beansFactory.createTableColumn("Rslt.loc_grp_cd", MCColumnType.TEXT);
		p.columnRslt_loc_grp_nm = p.beansFactory.createTableColumn("Rslt.loc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_lg_grp_nm = p.beansFactory.createTableColumn("Rslt.lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_site_cd = p.beansFactory.createTableColumn("Rslt.site_cd", MCColumnType.TEXT);
		p.columnRslt_site_nm = p.beansFactory.createTableColumn("Rslt.site_nm", MCColumnType.TEXT);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_slo_d_no = p.beansFactory.createTableColumn("Rslt.slo_d_no", MCColumnType.TEXT);
		p.columnRslt_ship_schd_no = p.beansFactory.createTableColumn("Rslt.ship_schd_no", MCColumnType.TEXT);
		p.columnRslt_io_schd_typ = p.beansFactory.createTableColumn("Rslt.io_schd_typ", MCColumnType.TEXT);
		p.columnRslt_io_schd_typ_nm = p.beansFactory.createTableColumn("Rslt.io_schd_typ_nm", MCColumnType.TEXT);
		p.columnRslt_io_schd_sts_typ = p.beansFactory.createTableColumn("Rslt.io_schd_sts_typ", MCColumnType.TEXT);
		p.columnRslt_io_schd_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.io_schd_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_io_schd_no = p.beansFactory.createTableColumn("Rslt.io_schd_no", MCColumnType.TEXT);
		p.columnRslt_io_schd_seq = p.beansFactory.createTableColumn("Rslt.io_schd_seq", MCColumnType.NUMBER);
		p.columnRslt_slip_schd_no = p.beansFactory.createTableColumn("Rslt.slip_schd_no", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_typ1 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_typ1", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_typ_nm1 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_typ_nm1", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_no1 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_no1", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_typ2 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_typ2", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_typ_nm2 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_typ_nm2", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_no2 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_no2", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_typ3 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_typ3", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_typ_nm3 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_typ_nm3", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_no3 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_no3", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_typ4 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_typ4", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_typ_nm4 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_typ_nm4", MCColumnType.TEXT);
		p.columnRslt_io_schd_sub_no4 = p.beansFactory.createTableColumn("Rslt.io_schd_sub_no4", MCColumnType.TEXT);
		p.columnRslt_io_schd_pr_no = p.beansFactory.createTableColumn("Rslt.io_schd_pr_no", MCColumnType.TEXT);
		p.columnRslt_gd_cd = p.beansFactory.createTableColumn("Rslt.gd_cd", MCColumnType.TEXT);
		p.columnRslt_gd_nm = p.beansFactory.createTableColumn("Rslt.gd_nm", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ = p.beansFactory.createTableColumn("Rslt.stk_id_typ", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_bp_cd = p.beansFactory.createTableColumn("Rslt.stk_bp_cd", MCColumnType.TEXT);
		p.columnRslt_stk_bp_nm = p.beansFactory.createTableColumn("Rslt.stk_bp_nm", MCColumnType.TEXT);
		p.columnRslt_stk_arrv_bp_cd = p.beansFactory.createTableColumn("Rslt.stk_arrv_bp_cd", MCColumnType.TEXT);
		p.columnRslt_stk_arrv_bp_nm = p.beansFactory.createTableColumn("Rslt.stk_arrv_bp_nm", MCColumnType.TEXT);
		p.columnRslt_vld_dt_fr = p.beansFactory.createTableColumn("Rslt.vld_dt_fr", MCColumnType.DATE);
		p.columnRslt_alloc_flg = p.beansFactory.createTableColumn("Rslt.alloc_flg", MCColumnType.CHECK);
		p.columnRslt_batch_log_no = p.beansFactory.createTableColumn("Rslt.batch_log_no", MCColumnType.TEXT);
		p.columnRslt_batch_data_no = p.beansFactory.createTableColumn("Rslt.batch_data_no", MCColumnType.TEXT);
		p.columnRslt_exec_tm = p.beansFactory.createTableColumn("Rslt.exec_tm", MCColumnType.DATE);
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
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_ShipStkRplLst p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP0010 = p.beansFactory.createButton("Btn.open_MSBEP0010", "open");
		p.Btn_open_MSBEP0070 = p.beansFactory.createButton("Btn.open_MSBEP0070", "open");
		p.Btn_open_MSBBP1210 = p.beansFactory.createButton("Btn.open_MSBBP1210", "open");
		p.Btn_open_MSBEP1420 = p.beansFactory.createButton("Btn.open_MSBEP1420", "open");
		p.Btn_open_MSBEP1000 = p.beansFactory.createButton("Btn.open_MSBEP1000", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd_xfr = p.beansFactory.createButton("Btn.upd_xfr", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBEP_ShipStkRplLst p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_ShipStkRplLst p) {
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
	protected static void jbInitTop(MSBEP_ShipStkRplLst p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
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
		p.FoldPanel.setNextBeans(p.LPnlPanel);
		p.TopPanel.add(p.LPnlPanel, null);
		p.LPnlPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBEP_ShipStkRplLst p) {
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
	protected static void jbInitTab1(MSBEP_ShipStkRplLst p) {
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
	protected static void jbInitTab2(MSBEP_ShipStkRplLst p) {
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
	protected static void jbInitCnd(MSBEP_ShipStkRplLst p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_XFR);
		p.Cnd_ope_XFR.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_XFR);
		p.ScreenOpePanel.add(p.Cnd_ope_XFR);
		p.Cnd_ope_XFR.setNextBeans(p.Cnd_ope_UPD);
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1480.CndR.ope_META);
		p.CndPanel.add(p.Cnd_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_schd_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_schd_dt_fr);
		p.Cnd_schd_dt_fr.setNextBeans(p.Cnd_schd_dt_to);
		p.Cnd_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1480.CndR.schd_dt_fr_META);
		p.Cnd_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_schd_dt_to);
		p.Cnd_schd_dt_to.setNextBeans(p.Cnd_site_cd);
		p.Cnd_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1480.CndR.schd_dt_to_META);
		p.Cnd_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1480.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1480.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1480.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_lg_grp_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1480.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lg_grp_cd, true);
		p.Cnd_lg_grp_cd.setLinkBeans(p.Cnd_lg_grp_nm);
		p.CndPanel.add(p.Cnd_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_lg_grp_cd);
		p.Cnd_lg_grp_cd.setNextBeans(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1480.CndR.lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_nm.setNextBeans(p.Cnd_loc_grp_cd);
		p.Cnd_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1480.CndR.lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_lg_grp_nm, true);
		p.Cnd_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_grp_cd, true);
		p.Cnd_loc_grp_cd.setLinkBeans(p.Cnd_loc_grp_nm);
		p.CndPanel.add(p.Cnd_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_loc_grp_cd);
		p.Cnd_loc_grp_cd.setNextBeans(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1480.CndR.loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_loc_grp_nm);
		p.Cnd_loc_grp_nm.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1480.CndR.loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_grp_nm, true);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1480.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_str_ln_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1480.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_str_ln_cd, true);
		p.Cnd_str_ln_cd.setLinkBeans(p.Cnd_str_ln_nm);
		p.CndPanel.add(p.Cnd_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_str_ln_cd);
		p.Cnd_str_ln_cd.setNextBeans(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1480.CndR.str_ln_cd_META);
		p.CndPanel.add(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1480.CndR.str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_str_ln_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_ver_no_p_PPanel);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.CndPanel.add(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_lot_no);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1480.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_sno_wrk_no_p_PPanel);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1480.CndR.sublot_no_META);
		p.CndPanel.add(p.Cnd_sno_wrk_no_p_PPanel);
		p.Cnd_sno_wrk_no_p_PPanel.setNextBeans(p.Cnd_batch_log_no);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.CndPanel.add(p.Cnd_batch_log_no_Label);
		p.CndPanel.add(p.Cnd_batch_log_no);
		p.Cnd_batch_log_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1480.CndR.batch_log_no_META);
		p.setPluralValueEnable(p.Cnd_batch_log_no, true);
		p.Cnd2Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBEP_ShipStkRplLst p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MSBEP_ShipStkRplLst p) {
		// ブロック関連の初期化
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.LPnlPanel.add(p.LPnl_dtl_flg);
		p.LPnlPanel.setLastBeans(p.LPnl_dtl_flg);
		p.LPnl_dtl_flg.setRow(p.getLPnlR(), mcframe.clientMSBE.MSBEP1480.LPnlR.dtl_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_ShipStkRplLst p) {
		// ブロック関連の初期化
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBEP_ShipStkRplLst p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBEP_ShipStkRplLst p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP0010.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBEP0010);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBEP0010);
		p.Btn_open_MSBEP0010.setNextBeans(p.Btn_open_MSBEP0070);
		p.Btn_open_MSBEP0070.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBEP0070);
		p.Btn_open_MSBEP0070.setNextBeans(p.Btn_open_MSBBP1210);
		p.Btn_open_MSBBP1210.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBBP1210);
		p.Btn_open_MSBBP1210.setNextBeans(p.Btn_open_MSBEP1420);
		p.Btn_open_MSBEP1420.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_open_MSBEP1420);
		p.Btn_open_MSBEP1420.setNextBeans(p.Btn_open_MSBEP1000);
		p.Btn_open_MSBEP1000.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_open_MSBEP1000);
		p.Btn_open_MSBEP1000.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_upd_xfr);
		p.Btn_upd_xfr.setIcon("REGISTER");
		p.Btn_upd_xfr.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_xfr);
		p.Btn_upd_xfr.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBEP_ShipStkRplLst p) {
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
		MSBEP_ShipStkRplLst_MC.mcInitScreenOpe((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.mcInitTop((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.mcInitFold((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.mcInitTab1((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.mcInitTab2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.mcInitCnd((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.mcInitCnd2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.mcInitLPnl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.mcInitCtrl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.mcInitRslt((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.mcInitBtn((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.mcInitEastBtn((MSBEP_ShipStkRplLst)this);

		// [SRCH_XFR]ステータスのモードの設定
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__XFR_ScreenOpe((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__XFR_Top((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__XFR_Fold((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__XFR_Tab1((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__XFR_Tab2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__XFR_Cnd((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__XFR_Cnd2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__XFR_LPnl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__XFR_Ctrl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__XFR_Rslt((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__XFR_Btn((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__XFR_EastBtn((MSBEP_ShipStkRplLst)this);

		// [XFR]ステータスのモードの設定
		MSBEP_ShipStkRplLst_MC.statusInitXFR_ScreenOpe((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitXFR_Top((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitXFR_Fold((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitXFR_Tab1((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitXFR_Tab2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitXFR_Cnd((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitXFR_Cnd2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitXFR_LPnl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitXFR_Ctrl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitXFR_Rslt((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitXFR_Btn((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitXFR_EastBtn((MSBEP_ShipStkRplLst)this);

		// [SRCH_UPD]ステータスのモードの設定
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__UPD_ScreenOpe((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__UPD_Top((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__UPD_Fold((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__UPD_Tab1((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__UPD_Tab2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__UPD_Cnd((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__UPD_Cnd2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__UPD_LPnl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__UPD_Ctrl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__UPD_Rslt((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__UPD_Btn((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__UPD_EastBtn((MSBEP_ShipStkRplLst)this);

		// [UPD]ステータスのモードの設定
		MSBEP_ShipStkRplLst_MC.statusInitUPD_ScreenOpe((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitUPD_Top((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitUPD_Fold((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitUPD_Tab1((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitUPD_Tab2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitUPD_Cnd((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitUPD_Cnd2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitUPD_LPnl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitUPD_Ctrl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitUPD_Rslt((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitUPD_Btn((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitUPD_EastBtn((MSBEP_ShipStkRplLst)this);

		// [SRCH_DEL]ステータスのモードの設定
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__DEL_ScreenOpe((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__DEL_Top((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__DEL_Fold((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__DEL_Tab1((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__DEL_Tab2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__DEL_Cnd((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__DEL_Cnd2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__DEL_LPnl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__DEL_Ctrl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__DEL_Rslt((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__DEL_Btn((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH__DEL_EastBtn((MSBEP_ShipStkRplLst)this);

		// [DEL]ステータスのモードの設定
		MSBEP_ShipStkRplLst_MC.statusInitDEL_ScreenOpe((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitDEL_Top((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitDEL_Fold((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitDEL_Tab1((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitDEL_Tab2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitDEL_Cnd((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitDEL_Cnd2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitDEL_LPnl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitDEL_Ctrl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitDEL_Rslt((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitDEL_Btn((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitDEL_EastBtn((MSBEP_ShipStkRplLst)this);

		// [SRCH]ステータスのモードの設定
		MSBEP_ShipStkRplLst_MC.statusInitSRCH_ScreenOpe((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH_Top((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH_Fold((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH_Tab1((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH_Tab2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH_Cnd((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH_Cnd2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH_LPnl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH_Ctrl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH_Rslt((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH_Btn((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitSRCH_EastBtn((MSBEP_ShipStkRplLst)this);

		// [REF]ステータスのモードの設定
		MSBEP_ShipStkRplLst_MC.statusInitREF_ScreenOpe((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitREF_Top((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitREF_Fold((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitREF_Tab1((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitREF_Tab2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitREF_Cnd((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitREF_Cnd2((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitREF_LPnl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitREF_Ctrl((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitREF_Rslt((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitREF_Btn((MSBEP_ShipStkRplLst)this);
		MSBEP_ShipStkRplLst_MC.statusInitREF_EastBtn((MSBEP_ShipStkRplLst)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_ShipStkRplLst p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_ShipStkRplLst p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_ShipStkRplLst p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBEP_ShipStkRplLst p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBEP_ShipStkRplLst p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_ShipStkRplLst p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_XFR.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_schd_dt_fr.setListListener(p);
		p.Cnd_schd_dt_fr.addAllListener(p);
		p.Cnd_schd_dt_to.setListListener(p);
		p.Cnd_schd_dt_to.addAllListener(p);
		p.Cnd_site_cd.setListListener(p);
		p.Cnd_site_cd.addAllListener(p);
		p.Cnd_site_nm.setListListener(p);
		p.Cnd_site_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_lg_grp_cd.setListListener(p);
		p.Cnd_lg_grp_cd.addAllListener(p);
		p.Cnd_lg_grp_nm.setListListener(p);
		p.Cnd_lg_grp_nm.addAllListener(p);
		p.Cnd_loc_grp_cd.setListListener(p);
		p.Cnd_loc_grp_cd.addAllListener(p);
		p.Cnd_loc_grp_nm.setListListener(p);
		p.Cnd_loc_grp_nm.addAllListener(p);
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
		p.Cnd_batch_log_no.setListListener(p);
		p.Cnd_batch_log_no.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBEP_ShipStkRplLst p) {
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MSBEP_ShipStkRplLst p) {
		p.LPnl_dtl_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_ShipStkRplLst p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBEP_ShipStkRplLst p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_schd_dt.addAllListener(p);
		p.columnRslt_schd_dt.setListListener(p);
		p.columnRslt_lot_no.addAllListener(p);
		p.columnRslt_lot_no.setListListener(p);
		p.columnRslt_sublot_no.addAllListener(p);
		p.columnRslt_sublot_no.setListListener(p);
		p.columnRslt_pack_unit_cd.addAllListener(p);
		p.columnRslt_pack_unit_cd.setListListener(p);
		p.columnRslt_pack_unit_nm.addAllListener(p);
		p.columnRslt_pack_unit_nm.setListListener(p);
		p.columnRslt_pack_unit_dec_place.addAllListener(p);
		p.columnRslt_pack_unit_dec_place.setListListener(p);
		p.columnRslt_pack_unit_rnd_typ.addAllListener(p);
		p.columnRslt_pack_unit_rnd_typ.setListListener(p);
		p.columnRslt_pack_unit_conv_base_qty.addAllListener(p);
		p.columnRslt_pack_unit_conv_base_qty.setListListener(p);
		p.columnRslt_pack_unit_conv_qty.addAllListener(p);
		p.columnRslt_pack_unit_conv_qty.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_unit_dec_place.addAllListener(p);
		p.columnRslt_base_unit_dec_place.setListListener(p);
		p.columnRslt_base_unit_rnd_typ.addAllListener(p);
		p.columnRslt_base_unit_rnd_typ.setListListener(p);
		p.columnRslt_loc_cd.addAllListener(p);
		p.columnRslt_loc_cd.setListListener(p);
		p.columnRslt_loc_nm.addAllListener(p);
		p.columnRslt_loc_nm.setListListener(p);
		p.columnRslt_str_ln_tgt_flg.addAllListener(p);
		p.columnRslt_loc_grp_cd.addAllListener(p);
		p.columnRslt_loc_grp_cd.setListListener(p);
		p.columnRslt_loc_grp_nm.addAllListener(p);
		p.columnRslt_loc_grp_nm.setListListener(p);
		p.columnRslt_lg_grp_cd.addAllListener(p);
		p.columnRslt_lg_grp_cd.setListListener(p);
		p.columnRslt_lg_grp_nm.addAllListener(p);
		p.columnRslt_lg_grp_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_site_cd.addAllListener(p);
		p.columnRslt_site_cd.setListListener(p);
		p.columnRslt_site_nm.addAllListener(p);
		p.columnRslt_site_nm.setListListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_slo_d_no.addAllListener(p);
		p.columnRslt_slo_d_no.setListListener(p);
		p.columnRslt_ship_schd_no.addAllListener(p);
		p.columnRslt_ship_schd_no.setListListener(p);
		p.columnRslt_io_schd_typ.addAllListener(p);
		p.columnRslt_io_schd_typ.setListListener(p);
		p.columnRslt_io_schd_typ_nm.addAllListener(p);
		p.columnRslt_io_schd_typ_nm.setListListener(p);
		p.columnRslt_io_schd_sts_typ.addAllListener(p);
		p.columnRslt_io_schd_sts_typ.setListListener(p);
		p.columnRslt_io_schd_sts_typ_nm.addAllListener(p);
		p.columnRslt_io_schd_sts_typ_nm.setListListener(p);
		p.columnRslt_io_schd_no.addAllListener(p);
		p.columnRslt_io_schd_no.setListListener(p);
		p.columnRslt_io_schd_seq.addAllListener(p);
		p.columnRslt_io_schd_seq.setListListener(p);
		p.columnRslt_slip_schd_no.addAllListener(p);
		p.columnRslt_slip_schd_no.setListListener(p);
		p.columnRslt_io_schd_sub_typ1.addAllListener(p);
		p.columnRslt_io_schd_sub_typ1.setListListener(p);
		p.columnRslt_io_schd_sub_typ_nm1.addAllListener(p);
		p.columnRslt_io_schd_sub_typ_nm1.setListListener(p);
		p.columnRslt_io_schd_sub_no1.addAllListener(p);
		p.columnRslt_io_schd_sub_no1.setListListener(p);
		p.columnRslt_io_schd_sub_typ2.addAllListener(p);
		p.columnRslt_io_schd_sub_typ2.setListListener(p);
		p.columnRslt_io_schd_sub_typ_nm2.addAllListener(p);
		p.columnRslt_io_schd_sub_typ_nm2.setListListener(p);
		p.columnRslt_io_schd_sub_no2.addAllListener(p);
		p.columnRslt_io_schd_sub_no2.setListListener(p);
		p.columnRslt_io_schd_sub_typ3.addAllListener(p);
		p.columnRslt_io_schd_sub_typ3.setListListener(p);
		p.columnRslt_io_schd_sub_typ_nm3.addAllListener(p);
		p.columnRslt_io_schd_sub_typ_nm3.setListListener(p);
		p.columnRslt_io_schd_sub_no3.addAllListener(p);
		p.columnRslt_io_schd_sub_no3.setListListener(p);
		p.columnRslt_io_schd_sub_typ4.addAllListener(p);
		p.columnRslt_io_schd_sub_typ4.setListListener(p);
		p.columnRslt_io_schd_sub_typ_nm4.addAllListener(p);
		p.columnRslt_io_schd_sub_typ_nm4.setListListener(p);
		p.columnRslt_io_schd_sub_no4.addAllListener(p);
		p.columnRslt_io_schd_sub_no4.setListListener(p);
		p.columnRslt_io_schd_pr_no.addAllListener(p);
		p.columnRslt_io_schd_pr_no.setListListener(p);
		p.columnRslt_gd_cd.addAllListener(p);
		p.columnRslt_gd_cd.setListListener(p);
		p.columnRslt_gd_nm.addAllListener(p);
		p.columnRslt_gd_nm.setListListener(p);
		p.columnRslt_stk_id_typ.addAllListener(p);
		p.columnRslt_stk_id_typ.setListListener(p);
		p.columnRslt_stk_id_typ_nm.addAllListener(p);
		p.columnRslt_stk_id_typ_nm.setListListener(p);
		p.columnRslt_stk_bp_cd.addAllListener(p);
		p.columnRslt_stk_bp_cd.setListListener(p);
		p.columnRslt_stk_bp_nm.addAllListener(p);
		p.columnRslt_stk_bp_nm.setListListener(p);
		p.columnRslt_stk_arrv_bp_cd.addAllListener(p);
		p.columnRslt_stk_arrv_bp_cd.setListListener(p);
		p.columnRslt_stk_arrv_bp_nm.addAllListener(p);
		p.columnRslt_stk_arrv_bp_nm.setListListener(p);
		p.columnRslt_vld_dt_fr.addAllListener(p);
		p.columnRslt_vld_dt_fr.setListListener(p);
		p.columnRslt_alloc_flg.addAllListener(p);
		p.columnRslt_batch_log_no.addAllListener(p);
		p.columnRslt_batch_log_no.setListListener(p);
		p.columnRslt_batch_data_no.addAllListener(p);
		p.columnRslt_batch_data_no.setListListener(p);
		p.columnRslt_exec_tm.addAllListener(p);
		p.columnRslt_exec_tm.setListListener(p);
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
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_ShipStkRplLst p) {
		p.Btn_open_MSBEP0010.addAllListener(p);
		p.Btn_open_MSBEP0010.setAPMethodName("doBtn_open_MSBEP0010");
		p.Btn_open_MSBEP0070.addAllListener(p);
		p.Btn_open_MSBEP0070.setAPMethodName("doBtn_open_MSBEP0070");
		p.Btn_open_MSBBP1210.addAllListener(p);
		p.Btn_open_MSBBP1210.setAPMethodName("doBtn_open_MSBBP1210");
		p.Btn_open_MSBEP1420.addAllListener(p);
		p.Btn_open_MSBEP1420.setAPMethodName("doBtn_open_MSBEP1420");
		p.Btn_open_MSBEP1000.addAllListener(p);
		p.Btn_open_MSBEP1000.setAPMethodName("doBtn_open_MSBEP1000");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_upd_xfr.addAllListener(p);
		p.Btn_upd_xfr.setAPMethodName("doBtn_upd_xfr");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBEP_ShipStkRplLst p) {
	}

	/**
	 * [SRCH_XFR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__XFR_ScreenOpe(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_XFR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__XFR_Top(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_XFR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__XFR_Fold(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_XFR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__XFR_Tab1(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_XFR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__XFR_Tab2(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_XFR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__XFR_Cnd(MSBEP_ShipStkRplLst p){
		p.Cnd_ope_Group.putMode(p, SRCH_XFR, MCMode.REQUIRED);
		p.Cnd_schd_dt_fr.putMode(p, SRCH_XFR, MCMode.ENABLE);
		p.Cnd_schd_dt_to.putMode(p, SRCH_XFR, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_XFR, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_XFR, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_XFR, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_XFR, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_XFR, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_XFR, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_XFR, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_XFR, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_XFR, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_XFR, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_XFR, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_XFR, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_XFR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_XFR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_XFR, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_XFR, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_XFR, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_XFR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_batch_log_no.putMode(p, SRCH_XFR, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_XFR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_XFR]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__XFR_Cnd2(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_XFR]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__XFR_LPnl(MSBEP_ShipStkRplLst p){
		p.LPnl_dtl_flg.putMode(p, SRCH_XFR, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_XFR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__XFR_Ctrl(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_XFR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__XFR_Rslt(MSBEP_ShipStkRplLst p){
		p.columnRslt_check.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_schd_dt.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_XFR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_XFR, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_XFR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.Rslt_pack_unit_short_qty_p_PPanel.putStatus(SRCH_XFR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_dec_place.putMode(p, SRCH_XFR, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_rnd_typ.putMode(p, SRCH_XFR, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_conv_base_qty.putMode(p, SRCH_XFR, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_conv_qty.putMode(p, SRCH_XFR, MCMode.INVISIBLE);
		p.Rslt_base_unit_short_qty_p_PPanel.putStatus(SRCH_XFR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_XFR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH_XFR, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, SRCH_XFR, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(SRCH_XFR, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ_nm.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ_nm.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_no.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_seq.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_slip_schd_no.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ1.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm1.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no1.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ2.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm2.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no2.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ3.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm3.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no3.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ4.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm4.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no4.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_fr.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_batch_log_no.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_batch_data_no.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_exec_tm.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_XFR, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_XFR, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_XFR, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_XFR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__XFR_Btn(MSBEP_ShipStkRplLst p){
		p.Btn_open_MSBEP0010.putMode(p, SRCH_XFR, MCMode.DISABLE);
		p.Btn_open_MSBEP0070.putMode(p, SRCH_XFR, MCMode.DISABLE);
		p.Btn_open_MSBBP1210.putMode(p, SRCH_XFR, MCMode.DISABLE);
		p.Btn_open_MSBEP1420.putMode(p, SRCH_XFR, MCMode.DISABLE);
		p.Btn_open_MSBEP1000.putMode(p, SRCH_XFR, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_XFR, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_XFR, MCMode.DISABLE);
		p.Btn_upd_xfr.putMode(p, SRCH_XFR, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_XFR, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH_XFR, MCMode.DISABLE);

	}

	/**
	 * [SRCH_XFR]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__XFR_EastBtn(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [XFR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitXFR_ScreenOpe(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [XFR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitXFR_Top(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [XFR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitXFR_Fold(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [XFR]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitXFR_Tab1(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [XFR]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitXFR_Tab2(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [XFR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitXFR_Cnd(MSBEP_ShipStkRplLst p){
		p.Cnd_ope_Group.putMode(p, XFR, MCMode.REQUIRED);
		p.Cnd_schd_dt_fr.putMode(p, XFR, MCMode.ENABLE);
		p.Cnd_schd_dt_to.putMode(p, XFR, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, XFR, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, XFR, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, XFR, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, XFR, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, XFR, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, XFR, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, XFR, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, XFR, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, XFR, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, XFR, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, XFR, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, XFR, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(XFR, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(XFR, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(XFR, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, XFR, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, XFR, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(XFR, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_batch_log_no.putMode(p, XFR, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(XFR, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [XFR]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitXFR_Cnd2(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [XFR]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitXFR_LPnl(MSBEP_ShipStkRplLst p){
		p.LPnl_dtl_flg.putMode(p, XFR, MCMode.REQUIRED);

	}

	/**
	 * [XFR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitXFR_Ctrl(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [XFR]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitXFR_Rslt(MSBEP_ShipStkRplLst p){
		p.columnRslt_check.putMode(p, XFR, MCMode.REQUIRED);
		p.columnRslt_schd_dt.putMode(p, XFR, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(XFR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(XFR, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, XFR, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(XFR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, XFR, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, XFR, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, XFR, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, XFR, MCMode.READ_ONLY);
		p.Rslt_pack_unit_short_qty_p_PPanel.putStatus(XFR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_dec_place.putMode(p, XFR, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_rnd_typ.putMode(p, XFR, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_conv_base_qty.putMode(p, XFR, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_conv_qty.putMode(p, XFR, MCMode.INVISIBLE);
		p.Rslt_base_unit_short_qty_p_PPanel.putStatus(XFR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, XFR, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, XFR, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, XFR, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(XFR, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ_nm.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ_nm.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_no.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_seq.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_slip_schd_no.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ1.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm1.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no1.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ2.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm2.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no2.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ3.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm3.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no3.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ4.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm4.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no4.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_fr.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_batch_log_no.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_batch_data_no.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_exec_tm.putMode(p, XFR, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(XFR, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, XFR, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, XFR, MCMode.READ_ONLY);

	}

	/**
	 * [XFR]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitXFR_Btn(MSBEP_ShipStkRplLst p){
		p.Btn_open_MSBEP0010.putMode(p, XFR, MCMode.ENABLE);
		p.Btn_open_MSBEP0070.putMode(p, XFR, MCMode.ENABLE);
		p.Btn_open_MSBBP1210.putMode(p, XFR, MCMode.ENABLE);
		p.Btn_open_MSBEP1420.putMode(p, XFR, MCMode.ENABLE);
		p.Btn_open_MSBEP1000.putMode(p, XFR, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, XFR, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, XFR, MCMode.ENABLE);
		p.Btn_upd_xfr.putMode(p, XFR, MCMode.ENABLE);
		p.Btn_upd.putMode(p, XFR, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, XFR, MCMode.DISABLE);

	}

	/**
	 * [XFR]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitXFR_EastBtn(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_ScreenOpe(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Top(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Fold(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab1(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Tab2(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Cnd(MSBEP_ShipStkRplLst p){
		p.Cnd_ope_Group.putMode(p, SRCH_UPD, MCMode.REQUIRED);
		p.Cnd_schd_dt_fr.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_schd_dt_to.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_batch_log_no.putMode(p, SRCH_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Cnd2(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_UPD]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_LPnl(MSBEP_ShipStkRplLst p){
		p.LPnl_dtl_flg.putMode(p, SRCH_UPD, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Ctrl(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Rslt(MSBEP_ShipStkRplLst p){
		p.columnRslt_check.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_schd_dt.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.Rslt_pack_unit_short_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_rnd_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_conv_base_qty.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_conv_qty.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_base_unit_short_qty_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(SRCH_UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_seq.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_slip_schd_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no1.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no2.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no3.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ4.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm4.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no4.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_fr.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_batch_log_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_batch_data_no.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
		p.columnRslt_exec_tm.putMode(p, SRCH_UPD, MCMode.READ_ONLY);
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

	}

	/**
	 * [SRCH_UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_Btn(MSBEP_ShipStkRplLst p){
		p.Btn_open_MSBEP0010.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_open_MSBEP0070.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_open_MSBBP1210.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_open_MSBEP1420.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_open_MSBEP1000.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_upd_xfr.putMode(p, SRCH_UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, SRCH_UPD, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_UPD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__UPD_EastBtn(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBEP_ShipStkRplLst p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_schd_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_schd_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_batch_log_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [UPD]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LPnl(MSBEP_ShipStkRplLst p){
		p.LPnl_dtl_flg.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBEP_ShipStkRplLst p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_schd_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_pack_unit_short_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_pack_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_base_unit_short_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_slip_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_fr.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_batch_log_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_batch_data_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_exec_tm.putMode(p, UPD, MCMode.READ_ONLY);
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

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBEP_ShipStkRplLst p){
		p.Btn_open_MSBEP0010.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MSBEP0070.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MSBBP1210.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MSBEP1420.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MSBEP1000.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_xfr.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab1(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab2(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MSBEP_ShipStkRplLst p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_schd_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_schd_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_batch_log_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd2(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_DEL]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_LPnl(MSBEP_ShipStkRplLst p){
		p.LPnl_dtl_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MSBEP_ShipStkRplLst p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_pack_unit_short_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_conv_base_qty.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_conv_qty.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_base_unit_short_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_seq.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_slip_schd_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ4.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm4.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no4.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_fr.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_batch_log_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_batch_data_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_exec_tm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
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

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MSBEP_ShipStkRplLst p){
		p.Btn_open_MSBEP0010.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MSBEP0070.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MSBBP1210.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MSBEP1420.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MSBEP1000.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd_xfr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBEP_ShipStkRplLst p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_schd_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_schd_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_batch_log_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd2(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [DEL]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LPnl(MSBEP_ShipStkRplLst p){
		p.LPnl_dtl_flg.putMode(p, DEL, MCMode.REQUIRED);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MSBEP_ShipStkRplLst p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_schd_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_pack_unit_short_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_base_unit_short_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_slip_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_fr.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_batch_log_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_batch_data_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_exec_tm.putMode(p, DEL, MCMode.READ_ONLY);
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

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBEP_ShipStkRplLst p){
		p.Btn_open_MSBEP0010.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MSBEP0070.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MSBBP1210.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MSBEP1420.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MSBEP1000.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_upd_xfr.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBEP_ShipStkRplLst p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_schd_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_schd_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_batch_log_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LPnl(MSBEP_ShipStkRplLst p){
		p.LPnl_dtl_flg.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBEP_ShipStkRplLst p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_pack_unit_short_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_base_unit_short_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_io_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_io_schd_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_slip_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_fr.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_batch_log_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_batch_data_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_exec_tm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
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

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBEP_ShipStkRplLst p){
		p.Btn_open_MSBEP0010.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBEP0070.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBBP1210.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBEP1420.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBEP1000.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_xfr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBEP_ShipStkRplLst p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_schd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_batch_log_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_LPnl(MSBEP_ShipStkRplLst p){
		p.LPnl_dtl_flg.putMode(p, REF, MCMode.REQUIRED);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBEP_ShipStkRplLst p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBEP_ShipStkRplLst p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_pack_unit_short_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_pack_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_base_unit_short_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnRslt_loc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_loc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ship_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_slip_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_typ_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_sub_no4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_vld_dt_fr.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_alloc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_batch_log_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_batch_data_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_exec_tm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
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

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBEP_ShipStkRplLst p){
		p.Btn_open_MSBEP0010.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBEP0070.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBBP1210.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBEP1420.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBEP1000.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_xfr.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBEP_ShipStkRplLst p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_XFR;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBEP_ShipStkRplLst_MC.setTableConfigRslt((MSBEP_ShipStkRplLst)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBEP_ShipStkRplLst p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_schd_dt.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.schd_dt_META);
		p.columnRslt_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_dt);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.RsltTable.addTable(p.Rslt_ver_no_p_PPanel.VerNoTable);
		p.columnRslt_lot_no.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.RsltTable.addTable(p.Rslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.RsltTable.addTable(p.Rslt_pack_unit_short_qty_p_PPanel.QtyTable);
		p.columnRslt_pack_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.pack_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_cd);
		p.columnRslt_pack_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.pack_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_nm);
		p.columnRslt_pack_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.pack_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_dec_place);
		p.columnRslt_pack_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.pack_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_rnd_typ);
		p.columnRslt_pack_unit_conv_base_qty.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.pack_unit_conv_base_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_conv_base_qty);
		p.columnRslt_pack_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.pack_unit_conv_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_conv_qty);
		p.RsltTable.addTable(p.Rslt_base_unit_short_qty_p_PPanel.QtyTable);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.base_unit_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_dec_place);
		p.columnRslt_base_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.base_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_rnd_typ);
		p.columnRslt_loc_cd.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.loc_cd_META);
		p.columnRslt_loc_cd.setListType(MCListType.STRICT);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_cd);
		p.columnRslt_loc_nm.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_nm);
		p.columnRslt_str_ln_tgt_flg.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.str_ln_tgt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_tgt_flg);
		p.RsltTable.addTable(p.Rslt_str_ln_p_PPanel.StrLnTable);
		p.columnRslt_loc_grp_cd.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.loc_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_grp_cd);
		p.columnRslt_loc_grp_nm.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.loc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_grp_nm);
		p.columnRslt_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.lg_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lg_grp_cd);
		p.columnRslt_lg_grp_nm.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.lg_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lg_grp_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_site_cd.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_cd);
		p.columnRslt_site_nm.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_nm);
		p.columnRslt_slo_no.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_slo_d_no.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.slo_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_d_no);
		p.columnRslt_ship_schd_no.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.ship_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_schd_no);
		p.columnRslt_io_schd_typ.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.io_schd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_typ);
		p.columnRslt_io_schd_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.io_schd_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_typ_nm);
		p.columnRslt_io_schd_sts_typ.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.io_schd_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sts_typ);
		p.columnRslt_io_schd_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.io_schd_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sts_typ_nm);
		p.columnRslt_io_schd_no.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.io_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_no);
		p.columnRslt_io_schd_seq.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.io_schd_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_seq);
		p.columnRslt_slip_schd_no.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.slip_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slip_schd_no);
		p.columnRslt_io_schd_sub_typ1.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.io_schd_sub_typ1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_typ1);
		p.columnRslt_io_schd_sub_typ_nm1.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.io_schd_sub_typ_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_typ_nm1);
		p.columnRslt_io_schd_sub_no1.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.io_schd_sub_no1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_no1);
		p.columnRslt_io_schd_sub_typ2.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.io_schd_sub_typ2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_typ2);
		p.columnRslt_io_schd_sub_typ_nm2.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.io_schd_sub_typ_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_typ_nm2);
		p.columnRslt_io_schd_sub_no2.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.io_schd_sub_no2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_no2);
		p.columnRslt_io_schd_sub_typ3.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.io_schd_sub_typ3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_typ3);
		p.columnRslt_io_schd_sub_typ_nm3.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.io_schd_sub_typ_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_typ_nm3);
		p.columnRslt_io_schd_sub_no3.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.io_schd_sub_no3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_no3);
		p.columnRslt_io_schd_sub_typ4.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.io_schd_sub_typ4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_typ4);
		p.columnRslt_io_schd_sub_typ_nm4.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.io_schd_sub_typ_nm4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_typ_nm4);
		p.columnRslt_io_schd_sub_no4.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.io_schd_sub_no4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_sub_no4);
		p.columnRslt_io_schd_pr_no.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.io_schd_pr_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_pr_no);
		p.columnRslt_gd_cd.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.gd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_cd);
		p.columnRslt_gd_nm.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.gd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_nm);
		p.columnRslt_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.stk_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ);
		p.columnRslt_stk_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.stk_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ_nm);
		p.columnRslt_stk_bp_cd.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.stk_bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_bp_cd);
		p.columnRslt_stk_bp_nm.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.stk_bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_bp_nm);
		p.columnRslt_stk_arrv_bp_cd.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.stk_arrv_bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_arrv_bp_cd);
		p.columnRslt_stk_arrv_bp_nm.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.stk_arrv_bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_arrv_bp_nm);
		p.columnRslt_vld_dt_fr.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.vld_dt_fr_META);
		p.columnRslt_vld_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_vld_dt_fr);
		p.columnRslt_alloc_flg.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.alloc_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_alloc_flg);
		p.columnRslt_batch_log_no.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.batch_log_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_batch_log_no);
		p.columnRslt_batch_data_no.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.batch_data_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_batch_data_no);
		p.columnRslt_exec_tm.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.exec_tm_META);
		p.columnRslt_exec_tm.setFormatID(mcframe.commonMA.meta.MA_META.TM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_exec_tm);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBE.MSBEP1480.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_lg_grp_cd.getListConfig().setPutter(getCnd_lg_grp_cd_ListPutter());
		Cnd_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_loc_grp_cd.getListConfig().setPutter(getCnd_loc_grp_cd_ListPutter());
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
		columnRslt_loc_cd.getListConfig().setPutter(getRslt_loc_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_XFR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_XFRStatus() {
		status = SRCH_XFR;
		setAllStatus(status);
	}

	/**
	 * この画面を[XFR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setXFRStatus() {
		status = XFR;
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
	 * この画面を[SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCHStatus() {
		status = SRCH;
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
		if (SRCH_XFR.equals(status)) {
			setSRCH_XFRStatus();
		}
		else if (XFR.equals(status)) {
			setXFRStatus();
		}
		else if (SRCH_UPD.equals(status)) {
			setSRCH_UPDStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (SRCH_DEL.equals(status)) {
			setSRCH_DELStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
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
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgWg");
		return lp;
	}
	 
	/**
	 * [Cnd_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_loc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocGrp");
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
	 * [Rslt_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_lg_grp_cd) return getCnd_lg_grp_cd(row, info);
		if(combo == Cnd_loc_grp_cd) return getCnd_loc_grp_cd(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_str_ln_cd) return getCnd_str_ln_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_lot_no) return getCnd_lot_no(row, info);
		if(combo == Cnd_sublot_no) return getCnd_sublot_no(row, info);
		if(combo == columnRslt_loc_cd) return getRslt_loc_cd(row, info);
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
		else if (ap == Btn_open_MSBBP1210) doBtn_open_MSBBP1210(info);
		else if (ap == Btn_open_MSBEP1420) doBtn_open_MSBEP1420(info);
		else if (ap == Btn_open_MSBEP1000) doBtn_open_MSBEP1000(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd_xfr) doBtn_upd_xfr(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
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
	 * [Btn]パネルの[open_MSBBP1210]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBBP1210(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP1420]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP1420(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP1000]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP1000(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_xfr]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_xfr(MCEventInfo info);

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
		if (vc == FoldTab) return doFold_VC(info);
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_schd_dt_fr) return doCnd_schd_dt_fr_VC(info);
		if (vc == Cnd_schd_dt_to) return doCnd_schd_dt_to_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_lg_grp_cd) return doCnd_lg_grp_cd_VC(info);
		if (vc == Cnd_lg_grp_nm) return doCnd_lg_grp_nm_VC(info);
		if (vc == Cnd_loc_grp_cd) return doCnd_loc_grp_cd_VC(info);
		if (vc == Cnd_loc_grp_nm) return doCnd_loc_grp_nm_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_str_ln_cd) return doCnd_str_ln_cd_VC(info);
		if (vc == Cnd_str_ln_nm) return doCnd_str_ln_nm_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_batch_log_no) return doCnd_batch_log_no_VC(info);
		if (vc == LPnl_dtl_flg) return doLPnl_dtl_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_schd_dt) return doRslt_schd_dt_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
		if (vc == columnRslt_pack_unit_cd) return doRslt_pack_unit_cd_VC(info);
		if (vc == columnRslt_pack_unit_nm) return doRslt_pack_unit_nm_VC(info);
		if (vc == columnRslt_pack_unit_dec_place) return doRslt_pack_unit_dec_place_VC(info);
		if (vc == columnRslt_pack_unit_rnd_typ) return doRslt_pack_unit_rnd_typ_VC(info);
		if (vc == columnRslt_pack_unit_conv_base_qty) return doRslt_pack_unit_conv_base_qty_VC(info);
		if (vc == columnRslt_pack_unit_conv_qty) return doRslt_pack_unit_conv_qty_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_unit_dec_place) return doRslt_base_unit_dec_place_VC(info);
		if (vc == columnRslt_base_unit_rnd_typ) return doRslt_base_unit_rnd_typ_VC(info);
		if (vc == columnRslt_loc_cd) return doRslt_loc_cd_VC(info);
		if (vc == columnRslt_loc_nm) return doRslt_loc_nm_VC(info);
		if (vc == columnRslt_str_ln_tgt_flg) return doRslt_str_ln_tgt_flg_VC(info);
		if (vc == columnRslt_loc_grp_cd) return doRslt_loc_grp_cd_VC(info);
		if (vc == columnRslt_loc_grp_nm) return doRslt_loc_grp_nm_VC(info);
		if (vc == columnRslt_lg_grp_cd) return doRslt_lg_grp_cd_VC(info);
		if (vc == columnRslt_lg_grp_nm) return doRslt_lg_grp_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_site_cd) return doRslt_site_cd_VC(info);
		if (vc == columnRslt_site_nm) return doRslt_site_nm_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_slo_d_no) return doRslt_slo_d_no_VC(info);
		if (vc == columnRslt_ship_schd_no) return doRslt_ship_schd_no_VC(info);
		if (vc == columnRslt_io_schd_typ) return doRslt_io_schd_typ_VC(info);
		if (vc == columnRslt_io_schd_typ_nm) return doRslt_io_schd_typ_nm_VC(info);
		if (vc == columnRslt_io_schd_sts_typ) return doRslt_io_schd_sts_typ_VC(info);
		if (vc == columnRslt_io_schd_sts_typ_nm) return doRslt_io_schd_sts_typ_nm_VC(info);
		if (vc == columnRslt_io_schd_no) return doRslt_io_schd_no_VC(info);
		if (vc == columnRslt_io_schd_seq) return doRslt_io_schd_seq_VC(info);
		if (vc == columnRslt_slip_schd_no) return doRslt_slip_schd_no_VC(info);
		if (vc == columnRslt_io_schd_sub_typ1) return doRslt_io_schd_sub_typ1_VC(info);
		if (vc == columnRslt_io_schd_sub_typ_nm1) return doRslt_io_schd_sub_typ_nm1_VC(info);
		if (vc == columnRslt_io_schd_sub_no1) return doRslt_io_schd_sub_no1_VC(info);
		if (vc == columnRslt_io_schd_sub_typ2) return doRslt_io_schd_sub_typ2_VC(info);
		if (vc == columnRslt_io_schd_sub_typ_nm2) return doRslt_io_schd_sub_typ_nm2_VC(info);
		if (vc == columnRslt_io_schd_sub_no2) return doRslt_io_schd_sub_no2_VC(info);
		if (vc == columnRslt_io_schd_sub_typ3) return doRslt_io_schd_sub_typ3_VC(info);
		if (vc == columnRslt_io_schd_sub_typ_nm3) return doRslt_io_schd_sub_typ_nm3_VC(info);
		if (vc == columnRslt_io_schd_sub_no3) return doRslt_io_schd_sub_no3_VC(info);
		if (vc == columnRslt_io_schd_sub_typ4) return doRslt_io_schd_sub_typ4_VC(info);
		if (vc == columnRslt_io_schd_sub_typ_nm4) return doRslt_io_schd_sub_typ_nm4_VC(info);
		if (vc == columnRslt_io_schd_sub_no4) return doRslt_io_schd_sub_no4_VC(info);
		if (vc == columnRslt_io_schd_pr_no) return doRslt_io_schd_pr_no_VC(info);
		if (vc == columnRslt_gd_cd) return doRslt_gd_cd_VC(info);
		if (vc == columnRslt_gd_nm) return doRslt_gd_nm_VC(info);
		if (vc == columnRslt_stk_id_typ) return doRslt_stk_id_typ_VC(info);
		if (vc == columnRslt_stk_id_typ_nm) return doRslt_stk_id_typ_nm_VC(info);
		if (vc == columnRslt_stk_bp_cd) return doRslt_stk_bp_cd_VC(info);
		if (vc == columnRslt_stk_bp_nm) return doRslt_stk_bp_nm_VC(info);
		if (vc == columnRslt_stk_arrv_bp_cd) return doRslt_stk_arrv_bp_cd_VC(info);
		if (vc == columnRslt_stk_arrv_bp_nm) return doRslt_stk_arrv_bp_nm_VC(info);
		if (vc == columnRslt_vld_dt_fr) return doRslt_vld_dt_fr_VC(info);
		if (vc == columnRslt_alloc_flg) return doRslt_alloc_flg_VC(info);
		if (vc == columnRslt_batch_log_no) return doRslt_batch_log_no_VC(info);
		if (vc == columnRslt_batch_data_no) return doRslt_batch_data_no_VC(info);
		if (vc == columnRslt_exec_tm) return doRslt_exec_tm_VC(info);
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
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_schd_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_grp_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[batch_log_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_batch_log_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [LPnl]パネルの[dtl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLPnl_dtl_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pack_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pack_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pack_unit_conv_qty_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lg_grp_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_site_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slip_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slip_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_typ1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_typ_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_no1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_typ2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_typ_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_no2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_typ3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_typ_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_no3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_typ4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_typ_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_sub_no4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_pr_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_bp_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[vld_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_vld_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_alloc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[batch_log_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_batch_log_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[batch_data_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_batch_data_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[exec_tm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_exec_tm_VC(MCEventInfo info){
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
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == FoldTab) doFold_NC(info);
		else if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_schd_dt_fr) doCnd_schd_dt_fr_NC(info);
		else if (nc == Cnd_schd_dt_to) doCnd_schd_dt_to_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NC(info);
		else if (nc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NC(info);
		else if (nc == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NC(info);
		else if (nc == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_str_ln_cd) doCnd_str_ln_cd_NC(info);
		else if (nc == Cnd_str_ln_nm) doCnd_str_ln_nm_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_batch_log_no) doCnd_batch_log_no_NC(info);
		else if (nc == LPnl_dtl_flg) doLPnl_dtl_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_schd_dt) doRslt_schd_dt_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
		else if (nc == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_NC(info);
		else if (nc == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_NC(info);
		else if (nc == columnRslt_pack_unit_dec_place) doRslt_pack_unit_dec_place_NC(info);
		else if (nc == columnRslt_pack_unit_rnd_typ) doRslt_pack_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_pack_unit_conv_base_qty) doRslt_pack_unit_conv_base_qty_NC(info);
		else if (nc == columnRslt_pack_unit_conv_qty) doRslt_pack_unit_conv_qty_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_loc_cd) doRslt_loc_cd_NC(info);
		else if (nc == columnRslt_loc_nm) doRslt_loc_nm_NC(info);
		else if (nc == columnRslt_str_ln_tgt_flg) doRslt_str_ln_tgt_flg_NC(info);
		else if (nc == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_NC(info);
		else if (nc == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_NC(info);
		else if (nc == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NC(info);
		else if (nc == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_site_cd) doRslt_site_cd_NC(info);
		else if (nc == columnRslt_site_nm) doRslt_site_nm_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_slo_d_no) doRslt_slo_d_no_NC(info);
		else if (nc == columnRslt_ship_schd_no) doRslt_ship_schd_no_NC(info);
		else if (nc == columnRslt_io_schd_typ) doRslt_io_schd_typ_NC(info);
		else if (nc == columnRslt_io_schd_typ_nm) doRslt_io_schd_typ_nm_NC(info);
		else if (nc == columnRslt_io_schd_sts_typ) doRslt_io_schd_sts_typ_NC(info);
		else if (nc == columnRslt_io_schd_sts_typ_nm) doRslt_io_schd_sts_typ_nm_NC(info);
		else if (nc == columnRslt_io_schd_no) doRslt_io_schd_no_NC(info);
		else if (nc == columnRslt_io_schd_seq) doRslt_io_schd_seq_NC(info);
		else if (nc == columnRslt_slip_schd_no) doRslt_slip_schd_no_NC(info);
		else if (nc == columnRslt_io_schd_sub_typ1) doRslt_io_schd_sub_typ1_NC(info);
		else if (nc == columnRslt_io_schd_sub_typ_nm1) doRslt_io_schd_sub_typ_nm1_NC(info);
		else if (nc == columnRslt_io_schd_sub_no1) doRslt_io_schd_sub_no1_NC(info);
		else if (nc == columnRslt_io_schd_sub_typ2) doRslt_io_schd_sub_typ2_NC(info);
		else if (nc == columnRslt_io_schd_sub_typ_nm2) doRslt_io_schd_sub_typ_nm2_NC(info);
		else if (nc == columnRslt_io_schd_sub_no2) doRslt_io_schd_sub_no2_NC(info);
		else if (nc == columnRslt_io_schd_sub_typ3) doRslt_io_schd_sub_typ3_NC(info);
		else if (nc == columnRslt_io_schd_sub_typ_nm3) doRslt_io_schd_sub_typ_nm3_NC(info);
		else if (nc == columnRslt_io_schd_sub_no3) doRslt_io_schd_sub_no3_NC(info);
		else if (nc == columnRslt_io_schd_sub_typ4) doRslt_io_schd_sub_typ4_NC(info);
		else if (nc == columnRslt_io_schd_sub_typ_nm4) doRslt_io_schd_sub_typ_nm4_NC(info);
		else if (nc == columnRslt_io_schd_sub_no4) doRslt_io_schd_sub_no4_NC(info);
		else if (nc == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_NC(info);
		else if (nc == columnRslt_gd_cd) doRslt_gd_cd_NC(info);
		else if (nc == columnRslt_gd_nm) doRslt_gd_nm_NC(info);
		else if (nc == columnRslt_stk_id_typ) doRslt_stk_id_typ_NC(info);
		else if (nc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NC(info);
		else if (nc == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NC(info);
		else if (nc == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NC(info);
		else if (nc == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NC(info);
		else if (nc == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NC(info);
		else if (nc == columnRslt_vld_dt_fr) doRslt_vld_dt_fr_NC(info);
		else if (nc == columnRslt_alloc_flg) doRslt_alloc_flg_NC(info);
		else if (nc == columnRslt_batch_log_no) doRslt_batch_log_no_NC(info);
		else if (nc == columnRslt_batch_data_no) doRslt_batch_data_no_NC(info);
		else if (nc == columnRslt_exec_tm) doRslt_exec_tm_NC(info);
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
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[batch_log_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_log_no_NC(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[dtl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_dtl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_conv_qty_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[vld_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[batch_log_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_batch_log_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[batch_data_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_batch_data_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[exec_tm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_exec_tm_NC(MCEventInfo info){
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
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == FoldTab) doFold_NE(info);
		else if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_schd_dt_fr) doCnd_schd_dt_fr_NE(info);
		else if (ne == Cnd_schd_dt_to) doCnd_schd_dt_to_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NE(info);
		else if (ne == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NE(info);
		else if (ne == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NE(info);
		else if (ne == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_str_ln_cd) doCnd_str_ln_cd_NE(info);
		else if (ne == Cnd_str_ln_nm) doCnd_str_ln_nm_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_batch_log_no) doCnd_batch_log_no_NE(info);
		else if (ne == LPnl_dtl_flg) doLPnl_dtl_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_schd_dt) doRslt_schd_dt_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
		else if (ne == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_NE(info);
		else if (ne == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_NE(info);
		else if (ne == columnRslt_pack_unit_dec_place) doRslt_pack_unit_dec_place_NE(info);
		else if (ne == columnRslt_pack_unit_rnd_typ) doRslt_pack_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_pack_unit_conv_base_qty) doRslt_pack_unit_conv_base_qty_NE(info);
		else if (ne == columnRslt_pack_unit_conv_qty) doRslt_pack_unit_conv_qty_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_loc_cd) doRslt_loc_cd_NE(info);
		else if (ne == columnRslt_loc_nm) doRslt_loc_nm_NE(info);
		else if (ne == columnRslt_str_ln_tgt_flg) doRslt_str_ln_tgt_flg_NE(info);
		else if (ne == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_NE(info);
		else if (ne == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_NE(info);
		else if (ne == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NE(info);
		else if (ne == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_site_cd) doRslt_site_cd_NE(info);
		else if (ne == columnRslt_site_nm) doRslt_site_nm_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_slo_d_no) doRslt_slo_d_no_NE(info);
		else if (ne == columnRslt_ship_schd_no) doRslt_ship_schd_no_NE(info);
		else if (ne == columnRslt_io_schd_typ) doRslt_io_schd_typ_NE(info);
		else if (ne == columnRslt_io_schd_typ_nm) doRslt_io_schd_typ_nm_NE(info);
		else if (ne == columnRslt_io_schd_sts_typ) doRslt_io_schd_sts_typ_NE(info);
		else if (ne == columnRslt_io_schd_sts_typ_nm) doRslt_io_schd_sts_typ_nm_NE(info);
		else if (ne == columnRslt_io_schd_no) doRslt_io_schd_no_NE(info);
		else if (ne == columnRslt_io_schd_seq) doRslt_io_schd_seq_NE(info);
		else if (ne == columnRslt_slip_schd_no) doRslt_slip_schd_no_NE(info);
		else if (ne == columnRslt_io_schd_sub_typ1) doRslt_io_schd_sub_typ1_NE(info);
		else if (ne == columnRslt_io_schd_sub_typ_nm1) doRslt_io_schd_sub_typ_nm1_NE(info);
		else if (ne == columnRslt_io_schd_sub_no1) doRslt_io_schd_sub_no1_NE(info);
		else if (ne == columnRslt_io_schd_sub_typ2) doRslt_io_schd_sub_typ2_NE(info);
		else if (ne == columnRslt_io_schd_sub_typ_nm2) doRslt_io_schd_sub_typ_nm2_NE(info);
		else if (ne == columnRslt_io_schd_sub_no2) doRslt_io_schd_sub_no2_NE(info);
		else if (ne == columnRslt_io_schd_sub_typ3) doRslt_io_schd_sub_typ3_NE(info);
		else if (ne == columnRslt_io_schd_sub_typ_nm3) doRslt_io_schd_sub_typ_nm3_NE(info);
		else if (ne == columnRslt_io_schd_sub_no3) doRslt_io_schd_sub_no3_NE(info);
		else if (ne == columnRslt_io_schd_sub_typ4) doRslt_io_schd_sub_typ4_NE(info);
		else if (ne == columnRslt_io_schd_sub_typ_nm4) doRslt_io_schd_sub_typ_nm4_NE(info);
		else if (ne == columnRslt_io_schd_sub_no4) doRslt_io_schd_sub_no4_NE(info);
		else if (ne == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_NE(info);
		else if (ne == columnRslt_gd_cd) doRslt_gd_cd_NE(info);
		else if (ne == columnRslt_gd_nm) doRslt_gd_nm_NE(info);
		else if (ne == columnRslt_stk_id_typ) doRslt_stk_id_typ_NE(info);
		else if (ne == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NE(info);
		else if (ne == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NE(info);
		else if (ne == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NE(info);
		else if (ne == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NE(info);
		else if (ne == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NE(info);
		else if (ne == columnRslt_vld_dt_fr) doRslt_vld_dt_fr_NE(info);
		else if (ne == columnRslt_alloc_flg) doRslt_alloc_flg_NE(info);
		else if (ne == columnRslt_batch_log_no) doRslt_batch_log_no_NE(info);
		else if (ne == columnRslt_batch_data_no) doRslt_batch_data_no_NE(info);
		else if (ne == columnRslt_exec_tm) doRslt_exec_tm_NE(info);
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
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[batch_log_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_log_no_NE(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[dtl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_dtl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_conv_qty_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[vld_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[batch_log_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_batch_log_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[batch_data_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_batch_data_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[exec_tm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_exec_tm_NE(MCEventInfo info){
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
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == FoldTab) doFold_NX(info);
		else if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_schd_dt_fr) doCnd_schd_dt_fr_NX(info);
		else if (nx == Cnd_schd_dt_to) doCnd_schd_dt_to_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NX(info);
		else if (nx == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NX(info);
		else if (nx == Cnd_loc_grp_cd) doCnd_loc_grp_cd_NX(info);
		else if (nx == Cnd_loc_grp_nm) doCnd_loc_grp_nm_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_str_ln_cd) doCnd_str_ln_cd_NX(info);
		else if (nx == Cnd_str_ln_nm) doCnd_str_ln_nm_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_batch_log_no) doCnd_batch_log_no_NX(info);
		else if (nx == LPnl_dtl_flg) doLPnl_dtl_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_schd_dt) doRslt_schd_dt_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
		else if (nx == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_NX(info);
		else if (nx == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_NX(info);
		else if (nx == columnRslt_pack_unit_dec_place) doRslt_pack_unit_dec_place_NX(info);
		else if (nx == columnRslt_pack_unit_rnd_typ) doRslt_pack_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_pack_unit_conv_base_qty) doRslt_pack_unit_conv_base_qty_NX(info);
		else if (nx == columnRslt_pack_unit_conv_qty) doRslt_pack_unit_conv_qty_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_loc_cd) doRslt_loc_cd_NX(info);
		else if (nx == columnRslt_loc_nm) doRslt_loc_nm_NX(info);
		else if (nx == columnRslt_str_ln_tgt_flg) doRslt_str_ln_tgt_flg_NX(info);
		else if (nx == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_NX(info);
		else if (nx == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_NX(info);
		else if (nx == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_NX(info);
		else if (nx == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_site_cd) doRslt_site_cd_NX(info);
		else if (nx == columnRslt_site_nm) doRslt_site_nm_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_slo_d_no) doRslt_slo_d_no_NX(info);
		else if (nx == columnRslt_ship_schd_no) doRslt_ship_schd_no_NX(info);
		else if (nx == columnRslt_io_schd_typ) doRslt_io_schd_typ_NX(info);
		else if (nx == columnRslt_io_schd_typ_nm) doRslt_io_schd_typ_nm_NX(info);
		else if (nx == columnRslt_io_schd_sts_typ) doRslt_io_schd_sts_typ_NX(info);
		else if (nx == columnRslt_io_schd_sts_typ_nm) doRslt_io_schd_sts_typ_nm_NX(info);
		else if (nx == columnRslt_io_schd_no) doRslt_io_schd_no_NX(info);
		else if (nx == columnRslt_io_schd_seq) doRslt_io_schd_seq_NX(info);
		else if (nx == columnRslt_slip_schd_no) doRslt_slip_schd_no_NX(info);
		else if (nx == columnRslt_io_schd_sub_typ1) doRslt_io_schd_sub_typ1_NX(info);
		else if (nx == columnRslt_io_schd_sub_typ_nm1) doRslt_io_schd_sub_typ_nm1_NX(info);
		else if (nx == columnRslt_io_schd_sub_no1) doRslt_io_schd_sub_no1_NX(info);
		else if (nx == columnRslt_io_schd_sub_typ2) doRslt_io_schd_sub_typ2_NX(info);
		else if (nx == columnRslt_io_schd_sub_typ_nm2) doRslt_io_schd_sub_typ_nm2_NX(info);
		else if (nx == columnRslt_io_schd_sub_no2) doRslt_io_schd_sub_no2_NX(info);
		else if (nx == columnRslt_io_schd_sub_typ3) doRslt_io_schd_sub_typ3_NX(info);
		else if (nx == columnRslt_io_schd_sub_typ_nm3) doRslt_io_schd_sub_typ_nm3_NX(info);
		else if (nx == columnRslt_io_schd_sub_no3) doRslt_io_schd_sub_no3_NX(info);
		else if (nx == columnRslt_io_schd_sub_typ4) doRslt_io_schd_sub_typ4_NX(info);
		else if (nx == columnRslt_io_schd_sub_typ_nm4) doRslt_io_schd_sub_typ_nm4_NX(info);
		else if (nx == columnRslt_io_schd_sub_no4) doRslt_io_schd_sub_no4_NX(info);
		else if (nx == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_NX(info);
		else if (nx == columnRslt_gd_cd) doRslt_gd_cd_NX(info);
		else if (nx == columnRslt_gd_nm) doRslt_gd_nm_NX(info);
		else if (nx == columnRslt_stk_id_typ) doRslt_stk_id_typ_NX(info);
		else if (nx == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NX(info);
		else if (nx == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NX(info);
		else if (nx == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_NX(info);
		else if (nx == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NX(info);
		else if (nx == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NX(info);
		else if (nx == columnRslt_vld_dt_fr) doRslt_vld_dt_fr_NX(info);
		else if (nx == columnRslt_alloc_flg) doRslt_alloc_flg_NX(info);
		else if (nx == columnRslt_batch_log_no) doRslt_batch_log_no_NX(info);
		else if (nx == columnRslt_batch_data_no) doRslt_batch_data_no_NX(info);
		else if (nx == columnRslt_exec_tm) doRslt_exec_tm_NX(info);
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
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[batch_log_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_log_no_NX(MCEventInfo info){
	}

	/**
	 * [LPnl]パネルの[dtl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLPnl_dtl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_conv_qty_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[vld_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[alloc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_alloc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[batch_log_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_batch_log_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[batch_data_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_batch_data_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[exec_tm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_exec_tm_NX(MCEventInfo info){
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
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_schd_dt_fr) doCnd_schd_dt_fr_LC(info);
		else if (lc == Cnd_schd_dt_to) doCnd_schd_dt_to_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_LC(info);
		else if (lc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_LC(info);
		else if (lc == Cnd_loc_grp_cd) doCnd_loc_grp_cd_LC(info);
		else if (lc == Cnd_loc_grp_nm) doCnd_loc_grp_nm_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_str_ln_cd) doCnd_str_ln_cd_LC(info);
		else if (lc == Cnd_str_ln_nm) doCnd_str_ln_nm_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_batch_log_no) doCnd_batch_log_no_LC(info);
		else if (lc == columnRslt_schd_dt) doRslt_schd_dt_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
		else if (lc == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_LC(info);
		else if (lc == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_LC(info);
		else if (lc == columnRslt_pack_unit_dec_place) doRslt_pack_unit_dec_place_LC(info);
		else if (lc == columnRslt_pack_unit_rnd_typ) doRslt_pack_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_pack_unit_conv_base_qty) doRslt_pack_unit_conv_base_qty_LC(info);
		else if (lc == columnRslt_pack_unit_conv_qty) doRslt_pack_unit_conv_qty_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_unit_dec_place) doRslt_base_unit_dec_place_LC(info);
		else if (lc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_loc_cd) doRslt_loc_cd_LC(info);
		else if (lc == columnRslt_loc_nm) doRslt_loc_nm_LC(info);
		else if (lc == columnRslt_loc_grp_cd) doRslt_loc_grp_cd_LC(info);
		else if (lc == columnRslt_loc_grp_nm) doRslt_loc_grp_nm_LC(info);
		else if (lc == columnRslt_lg_grp_cd) doRslt_lg_grp_cd_LC(info);
		else if (lc == columnRslt_lg_grp_nm) doRslt_lg_grp_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_site_cd) doRslt_site_cd_LC(info);
		else if (lc == columnRslt_site_nm) doRslt_site_nm_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_slo_d_no) doRslt_slo_d_no_LC(info);
		else if (lc == columnRslt_ship_schd_no) doRslt_ship_schd_no_LC(info);
		else if (lc == columnRslt_io_schd_typ) doRslt_io_schd_typ_LC(info);
		else if (lc == columnRslt_io_schd_typ_nm) doRslt_io_schd_typ_nm_LC(info);
		else if (lc == columnRslt_io_schd_sts_typ) doRslt_io_schd_sts_typ_LC(info);
		else if (lc == columnRslt_io_schd_sts_typ_nm) doRslt_io_schd_sts_typ_nm_LC(info);
		else if (lc == columnRslt_io_schd_no) doRslt_io_schd_no_LC(info);
		else if (lc == columnRslt_io_schd_seq) doRslt_io_schd_seq_LC(info);
		else if (lc == columnRslt_slip_schd_no) doRslt_slip_schd_no_LC(info);
		else if (lc == columnRslt_io_schd_sub_typ1) doRslt_io_schd_sub_typ1_LC(info);
		else if (lc == columnRslt_io_schd_sub_typ_nm1) doRslt_io_schd_sub_typ_nm1_LC(info);
		else if (lc == columnRslt_io_schd_sub_no1) doRslt_io_schd_sub_no1_LC(info);
		else if (lc == columnRslt_io_schd_sub_typ2) doRslt_io_schd_sub_typ2_LC(info);
		else if (lc == columnRslt_io_schd_sub_typ_nm2) doRslt_io_schd_sub_typ_nm2_LC(info);
		else if (lc == columnRslt_io_schd_sub_no2) doRslt_io_schd_sub_no2_LC(info);
		else if (lc == columnRslt_io_schd_sub_typ3) doRslt_io_schd_sub_typ3_LC(info);
		else if (lc == columnRslt_io_schd_sub_typ_nm3) doRslt_io_schd_sub_typ_nm3_LC(info);
		else if (lc == columnRslt_io_schd_sub_no3) doRslt_io_schd_sub_no3_LC(info);
		else if (lc == columnRslt_io_schd_sub_typ4) doRslt_io_schd_sub_typ4_LC(info);
		else if (lc == columnRslt_io_schd_sub_typ_nm4) doRslt_io_schd_sub_typ_nm4_LC(info);
		else if (lc == columnRslt_io_schd_sub_no4) doRslt_io_schd_sub_no4_LC(info);
		else if (lc == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_LC(info);
		else if (lc == columnRslt_gd_cd) doRslt_gd_cd_LC(info);
		else if (lc == columnRslt_gd_nm) doRslt_gd_nm_LC(info);
		else if (lc == columnRslt_stk_id_typ) doRslt_stk_id_typ_LC(info);
		else if (lc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_LC(info);
		else if (lc == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_LC(info);
		else if (lc == columnRslt_stk_bp_nm) doRslt_stk_bp_nm_LC(info);
		else if (lc == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_LC(info);
		else if (lc == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_LC(info);
		else if (lc == columnRslt_vld_dt_fr) doRslt_vld_dt_fr_LC(info);
		else if (lc == columnRslt_batch_log_no) doRslt_batch_log_no_LC(info);
		else if (lc == columnRslt_batch_data_no) doRslt_batch_data_no_LC(info);
		else if (lc == columnRslt_exec_tm) doRslt_exec_tm_LC(info);
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
	}

	/**
	 * [Cnd]パネルの[schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_schd_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_grp_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[batch_log_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_batch_log_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_conv_qty_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lg_grp_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_typ_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_typ_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_sub_no4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_sub_no4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[vld_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[batch_log_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_batch_log_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[batch_data_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_batch_data_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[exec_tm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_exec_tm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_site_cd]の作成メソッド
	 */
	public MCList getCnd_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
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

	/**
	 * コンボ／リストのリスト[columnRslt_loc_cd]の作成メソッド
	 */
	public MCList getRslt_loc_cd(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL1480.Srch01")) {
			return new MS_MSBEL1480_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL1480.Upd01")) {
			return new MS_MSBEL1480_Upd01Bridge();
		}
		if (id.equals("MS.MSBEL1480.Del01")) {
			return new MS_MSBEL1480_Del01Bridge();
		}
		if (id.equals("MS.MSBEL1480.Upd02")) {
			return new MS_MSBEL1480_Upd02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL1480_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1480_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1480_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL1480_Srch01Bridge() {
			p_MS_MSBEL1480_Srch01 = new MCParam(PDef.MS_MSBEL1480_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1480_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1480.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1480.RsltR.class));

			p_MS_MSBEL1480_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1480_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1480_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1480_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1480_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1480.CndR up0() {
			return (mcframe.clientMSBE.MSBEP1480.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1480.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1480.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1480_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1480.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1480_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1480.RsltR>)p_MS_MSBEL1480_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL1480_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1480_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1480_Upd01;

		/** コンストラクタ */
		protected MS_MSBEL1480_Upd01Bridge() {
			p_MS_MSBEL1480_Upd01 = new MCParam(PDef.MS_MSBEL1480_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1480_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1480.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1480.RsltR.class));

			p_MS_MSBEL1480_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1480_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1480_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1480_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1480_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1480.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1480.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1480.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1480.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1480_Upd01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1480.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1480_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1480.RsltR>)p_MS_MSBEL1480_Upd01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL1480_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1480_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1480_Del01;

		/** コンストラクタ */
		protected MS_MSBEL1480_Del01Bridge() {
			p_MS_MSBEL1480_Del01 = new MCParam(PDef.MS_MSBEL1480_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1480_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1480.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1480.RsltR.class));

			p_MS_MSBEL1480_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1480_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1480_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1480_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1480_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1480.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1480.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1480.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1480.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1480_Del01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1480.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1480_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1480.RsltR>)p_MS_MSBEL1480_Del01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBEL1480_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1480_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1480_Upd02;

		/** コンストラクタ */
		protected MS_MSBEL1480_Upd02Bridge() {
			p_MS_MSBEL1480_Upd02 = new MCParam(PDef.MS_MSBEL1480_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1480_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1480.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1480.RsltR.class));

			p_MS_MSBEL1480_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1480_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1480_Upd02.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1480_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1480_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1480.RsltR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1480.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1480.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1480.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1480_Upd02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1480.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1480_Upd02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1480.RsltR>)p_MS_MSBEL1480_Upd02.getContainerParam().getDownBlock(0));
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