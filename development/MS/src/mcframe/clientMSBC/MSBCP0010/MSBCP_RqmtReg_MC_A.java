package mcframe.clientMSBC.MSBCP0010;

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
import mcframe.clientMSBC.MSBCP0010.MSBCP_RqmtReg_MC.MS_MSBCL0010_Srch01Caller;
import mcframe.clientMSBC.MSBCP0010.MSBCP_RqmtReg_MC.MS_MSBCL0010_Imp01Caller;
import mcframe.clientMSBC.MSBCP0010.MSBCP_RqmtReg_MC.MS_MSBCL0010_Sprt01Caller;
import mcframe.clientMSBC.MSBCP0010.MSBCP_RqmtReg_MC.MS_MSBCL0010_Upd01Caller;
import mcframe.clientMSBC.MSBCP0010.MSBCP_RqmtReg_MC.MS_MSBCL0010_Del01Caller;

/**
 * 画面"MSBCP_RqmtReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCP_RqmtReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBCP0010";

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
	// [RqmtTyp]ブロック関連のField定義
	public MCPanel RqmtTypPanel = null;
	public MCTitledBorder RqmtTypTitledBorder = null;
	// [RqmtTyp]ブロックの項目のField定義
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
	 * UPD,Create/Modify;DEL,Cancel;REF,View UPD,登録・訂正する;DEL,取り消す;REF,参照する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * NRML,Normal,1; PRCD,Long LT,2 NRML,通常,1;PRCD,先行手配,2.<p>
	 *
	 */
	public MCButtonGroup Cnd_mrp_typ_r_Group = null;
	public MCRadioButton Cnd_mrp_typ_r_NRML = null;
	public MCRadioButton Cnd_mrp_typ_r_PRCD = null;
	public MCLabel Cnd_due_dt_fr_Label = null;
	/**
	 * Delivery date FROM 納期ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_due_dt_fr = null;
	public MCLabel Cnd_due_dt_to_Label = null;
	/**
	 * Delivery date TO 納期ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_due_dt_to = null;
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
	public MCLabel Cnd_strg_loc_grp_cd_Label = null;
	/**
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_strg_loc_grp_cd = null;
	/**
	 * Storage location group name 格納場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_strg_loc_grp_nm = null;
	public MCLabel Cnd_strg_loc_cd_Label = null;
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_strg_loc_cd = null;
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public MCTextField Cnd_strg_loc_nm = null;
	public MCLabel Cnd_mfg_loc_cd_Label = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_loc_nm = null;
	public MCLabel Cnd_sppl_cd_Label = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCTextField Cnd_sppl_nm = null;
	public MCLabel Cnd_rqst_wg_cd_Label = null;
	/**
	 * Requested WG cd. 依頼先ＷＧＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_rqst_wg_cd = null;
	/**
	 * Requested WG name 依頼先ＷＧ名.<p>
	 *
	 */
	public MCTextField Cnd_rqst_wg_nm = null;
	public MCLabel Cnd_rqst_loc_cd_Label = null;
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_rqst_loc_cd = null;
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public MCTextField Cnd_rqst_loc_nm = null;
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
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_wrk_no_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_wrk_no_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_wrk_no_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_wrk_no_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_wrk_no_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[sno_wrk_no_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[sno_wrk_no_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_rqmt_no_Label = null;
	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_rqmt_no = null;
	/**
	 * Include firm 確定含む.<p>
	 *
	 */
	public MCCheckBox Cnd_fix_flg = null;
	public MCLabel Cnd_rqmt_gnrt_typ_Label = null;
	/**
	 * Generate-from type 生成元区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_rqmt_gnrt_typ = null;
	/**
	 * Generate-from type name 生成元区分名.<p>
	 *
	 */
	public MCTextField Cnd_rqmt_gnrt_typ_nm = null;
	public MCLabel Cnd_rqmt_typ_Label = null;
	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_rqmt_typ = null;
	/**
	 * Requirements type name 所要区分名.<p>
	 *
	 */
	public MCTextField Cnd_rqmt_typ_nm = null;
	public MCLabel Cnd_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Cnd_intr_rmrks = null;
	public MCLabel Cnd_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Cnd_sub_char1 = null;
	public MCLabel Cnd_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Cnd_sub_char2 = null;
	public MCLabel Cnd_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Cnd_sub_char3 = null;
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
	public MCTable2<mcframe.clientMSBC.MSBCP0010.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Numbering SEIBAN No. 手配ＮＯ発番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno_sprt_flg = null;
	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqmt_no = null;
	/**
	 * Due date 納期.<p>
	 *
	 */
	public MCColumnConfig columnRslt_due_dt = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_loc_cd = null;
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_loc_nm = null;
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
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_loc_grp_cd = null;
	/**
	 * Storage location group name 格納場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_loc_grp_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_rqmt_qty_p_PPanel;
	public MCColumnConfig columnRslt_rqmt_qty;// [Rslt]の[rqmt_qty_p.qty]を[columnRslt_rqmt_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dec_place = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_nm = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_nm = null;
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_loc_cd = null;
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_loc_nm = null;
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_wg_cd = null;
	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_wg_nm = null;
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno4_mng_typ = null;
	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno1_num_typ = null;
	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno2_num_typ = null;
	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno3_num_typ = null;
	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sno4_num_typ = null;
	/**
	 * Requirements SEIBAN No. 1 required 所要手配ＮＯ１必須.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqmt_sno1_flg = null;
	/**
	 * Requirements SEIBAN No. 2 required 所要手配ＮＯ２必須.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqmt_sno2_flg = null;
	/**
	 * Requirements SEIBAN No. 3 required 所要手配ＮＯ３必須.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqmt_sno3_flg = null;
	/**
	 * Requirements SEIBAN No. 4 required 所要手配ＮＯ４必須.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqmt_sno4_flg = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_wrk_no_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_wrk_no_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_wrk_no_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_wrk_no_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fix_flg = null;
	/**
	 * Generate-from type 生成元区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqmt_gnrt_typ = null;
	/**
	 * Generate-from type name 生成元区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqmt_gnrt_typ_nm = null;
	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqmt_typ = null;
	/**
	 * Requirements type name 所要区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqmt_typ_nm = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_intr_rmrks = null;
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
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
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
	 * Order explosion オーダ展開情報照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0070 = null;
	/**
	 * Item order progress 品目オーダ進捗一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0080 = null;
	/**
	 * Select numbering target 発番対象選択.<p>
	 *
	 */
	public MCLabel Btn_label_sno = null;
	/**
	 * Select all (SEIBAN No. numbering) 全選択（手配ＮＯ発番）.<p>
	 *
	 */
	public MCButton Btn_sno_select_all = null;
	/**
	 * Release all (SEIBAN No. numbering) 全解除（手配ＮＯ発番）.<p>
	 *
	 */
	public MCButton Btn_sno_deselect_all = null;
	/**
	 * Numbering SEIBAN No. 手配ＮＯ発番.<p>
	 *
	 */
	public MCButton Btn_sprt_sno = null;
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCLabel Btn_label_check = null;
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
	public MCButton Btn_upd_nrml = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_prcd = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del_nrml = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del_prcd = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD_NRML]モードを表す定数 */
	public static final String UPD_NRML = "UPD_NRML";
	/** [FIX_U_NRML]モードを表す定数 */
	public static final String FIX_U_NRML = "FIX_U_NRML";
	/** [SRCH_DEL_NRML]モードを表す定数 */
	public static final String SRCH_DEL_NRML = "SRCH_DEL_NRML";
	/** [DEL_NRML]モードを表す定数 */
	public static final String DEL_NRML = "DEL_NRML";
	/** [SRCH_NRML]モードを表す定数 */
	public static final String SRCH_NRML = "SRCH_NRML";
	/** [REF_NRML]モードを表す定数 */
	public static final String REF_NRML = "REF_NRML";
	/** [UPD_PRCD]モードを表す定数 */
	public static final String UPD_PRCD = "UPD_PRCD";
	/** [FIX_U_PRCD]モードを表す定数 */
	public static final String FIX_U_PRCD = "FIX_U_PRCD";
	/** [SRCH_DEL_PRCD]モードを表す定数 */
	public static final String SRCH_DEL_PRCD = "SRCH_DEL_PRCD";
	/** [DEL_PRCD]モードを表す定数 */
	public static final String DEL_PRCD = "DEL_PRCD";
	/** [SRCH_PRCD]モードを表す定数 */
	public static final String SRCH_PRCD = "SRCH_PRCD";
	/** [REF_PRCD]モードを表す定数 */
	public static final String REF_PRCD = "REF_PRCD";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD_NRML, FIX_U_NRML, SRCH_DEL_NRML, DEL_NRML, SRCH_NRML, REF_NRML, UPD_PRCD, FIX_U_PRCD, SRCH_DEL_PRCD, DEL_PRCD, SRCH_PRCD, REF_PRCD};
	
	/** [MS_MSBCL0010_Srch01]のCallerの作成 */
	protected MSBCP_RqmtReg_MC.MS_MSBCL0010_Srch01Caller createMS_MSBCL0010_Srch01() {
		MSBCP_RqmtReg_MC.MS_MSBCL0010_Srch01Caller<MSBCP_RqmtReg, MS_MSBCL0010_Srch01Bridge>
		caller = ((MSBCP_RqmtReg_MC)this).new MS_MSBCL0010_Srch01Caller<MSBCP_RqmtReg, MS_MSBCL0010_Srch01Bridge>(
					(MSBCP_RqmtReg)this, new MS_MSBCL0010_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBCL0010_Srch01]の呼び出し */
	protected void callMS_MSBCL0010_Srch01() {
		MCCaller caller = createMS_MSBCL0010_Srch01();
		caller.exec();
	}
	/** [MS_MSBCL0010_Imp01]のCallerの作成 */
	protected MSBCP_RqmtReg_MC.MS_MSBCL0010_Imp01Caller createMS_MSBCL0010_Imp01() {
		MSBCP_RqmtReg_MC.MS_MSBCL0010_Imp01Caller<MSBCP_RqmtReg, MS_MSBCL0010_Imp01Bridge>
		caller = ((MSBCP_RqmtReg_MC)this).new MS_MSBCL0010_Imp01Caller<MSBCP_RqmtReg, MS_MSBCL0010_Imp01Bridge>(
					(MSBCP_RqmtReg)this, new MS_MSBCL0010_Imp01Bridge());
		return caller;
	}
	/** [MS_MSBCL0010_Imp01]の呼び出し */
	protected void callMS_MSBCL0010_Imp01() {
		MCCaller caller = createMS_MSBCL0010_Imp01();
		caller.exec();
	}
	/** [MS_MSBCL0010_Sprt01]のCallerの作成 */
	protected MSBCP_RqmtReg_MC.MS_MSBCL0010_Sprt01Caller createMS_MSBCL0010_Sprt01() {
		MSBCP_RqmtReg_MC.MS_MSBCL0010_Sprt01Caller<MSBCP_RqmtReg, MS_MSBCL0010_Sprt01Bridge>
		caller = ((MSBCP_RqmtReg_MC)this).new MS_MSBCL0010_Sprt01Caller<MSBCP_RqmtReg, MS_MSBCL0010_Sprt01Bridge>(
					(MSBCP_RqmtReg)this, new MS_MSBCL0010_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBCL0010_Sprt01]の呼び出し */
	protected void callMS_MSBCL0010_Sprt01() {
		MCCaller caller = createMS_MSBCL0010_Sprt01();
		caller.exec();
	}
	/** [MS_MSBCL0010_Upd01]のCallerの作成 */
	protected MSBCP_RqmtReg_MC.MS_MSBCL0010_Upd01Caller createMS_MSBCL0010_Upd01() {
		MSBCP_RqmtReg_MC.MS_MSBCL0010_Upd01Caller<MSBCP_RqmtReg, MS_MSBCL0010_Upd01Bridge>
		caller = ((MSBCP_RqmtReg_MC)this).new MS_MSBCL0010_Upd01Caller<MSBCP_RqmtReg, MS_MSBCL0010_Upd01Bridge>(
					(MSBCP_RqmtReg)this, new MS_MSBCL0010_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBCL0010_Upd01]の呼び出し */
	protected void callMS_MSBCL0010_Upd01() {
		MCCaller caller = createMS_MSBCL0010_Upd01();
		caller.exec();
	}
	/** [MS_MSBCL0010_Del01]のCallerの作成 */
	protected MSBCP_RqmtReg_MC.MS_MSBCL0010_Del01Caller createMS_MSBCL0010_Del01() {
		MSBCP_RqmtReg_MC.MS_MSBCL0010_Del01Caller<MSBCP_RqmtReg, MS_MSBCL0010_Del01Bridge>
		caller = ((MSBCP_RqmtReg_MC)this).new MS_MSBCL0010_Del01Caller<MSBCP_RqmtReg, MS_MSBCL0010_Del01Bridge>(
					(MSBCP_RqmtReg)this, new MS_MSBCL0010_Del01Bridge());
		return caller;
	}
	/** [MS_MSBCL0010_Del01]の呼び出し */
	protected void callMS_MSBCL0010_Del01() {
		MCCaller caller = createMS_MSBCL0010_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP0010.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0010.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBC.MSBCP0010.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0010.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0010.CndR createCndR() {
		return mcframe.clientMSBC.MSBCP0010.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBC.MSBCP0010.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0010.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBC.MSBCP0010.RsltR createRsltR() {
		return mcframe.clientMSBC.MSBCP0010.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0010.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0010.RsltR.class);
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
		ret.add(ScreenOpePanel);
		ret.add(RqmtTypPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_RqmtReg_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_RqmtReg_MC_A(String name) {
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
		MSBCP_RqmtReg_MC.jbCreateScreenOpe((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbCreateRqmtTyp((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbCreateTop((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbCreateFold((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbCreateTab1((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbCreateTab2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbCreateCnd((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbCreateCnd2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbCreateCtrl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbCreateRPnl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbCreateRslt((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbCreateBtn((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbCreateEastBtn((MSBCP_RqmtReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBCP_RqmtReg p) {
	}

	/**
	 * [RqmtTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRqmtTyp(MSBCP_RqmtReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBCP_RqmtReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBCP_RqmtReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBCP_RqmtReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBCP_RqmtReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBCP_RqmtReg p) {
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
	protected static void jbCreateCnd2(MSBCP_RqmtReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBCP_RqmtReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBCP_RqmtReg p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBCP_RqmtReg p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBC.MSBCP0010.RsltR.$itm_p);
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
		p.Rslt_rqmt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0010.RsltR.$rqmt_qty_p);
		p.Rslt_rqmt_qty_p_PPanel.setName("Rslt.rqmt_qty_p");
		p.columnRslt_rqmt_qty = p.Rslt_rqmt_qty_p_PPanel.columnQty_qty;
		p.columnRslt_rqmt_qty.addAliasName("Rslt.rqmt_qty", p);
		p.Rslt_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBC.MSBCP0010.RsltR.$sno_wrk_no_p);
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
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBC.MSBCP0010.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBC.MSBCP0010.RsltR.$itm_grp_p);
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
	protected static void jbCreateBtn(MSBCP_RqmtReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBCP_RqmtReg p) {
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
	
	
	/** [Cnd_strg_loc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_strg_loc_grp_cd_p = null;

	/**
	 * [Cnd_strg_loc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_strg_loc_grp_cd_ListPutter() {
		if (Cnd_strg_loc_grp_cd_p == null) {
			Cnd_strg_loc_grp_cd_p = createCnd_strg_loc_grp_cd_ListPutter(Cnd_strg_loc_grp_cd, "strg_loc_grp_cd", "strg_loc_grp_nm");

		}
		return Cnd_strg_loc_grp_cd_p;
	}
	
	
	/** [Cnd_strg_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_strg_loc_cd_p = null;

	/**
	 * [Cnd_strg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_strg_loc_cd_ListPutter() {
		if (Cnd_strg_loc_cd_p == null) {
			Cnd_strg_loc_cd_p = createCnd_strg_loc_cd_ListPutter(Cnd_strg_loc_cd, "strg_loc_cd", "strg_loc_nm");

		}
		return Cnd_strg_loc_cd_p;
	}
	
	
	/** [Cnd_mfg_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_loc_cd_p = null;

	/**
	 * [Cnd_mfg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_loc_cd_ListPutter() {
		if (Cnd_mfg_loc_cd_p == null) {
			Cnd_mfg_loc_cd_p = createCnd_mfg_loc_cd_ListPutter(Cnd_mfg_loc_cd, "mfg_loc_cd", "mfg_loc_nm");

		}
		return Cnd_mfg_loc_cd_p;
	}
	
	
	/** [Cnd_sppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_cd_p = null;

	/**
	 * [Cnd_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_cd_ListPutter() {
		if (Cnd_sppl_cd_p == null) {
			Cnd_sppl_cd_p = createCnd_sppl_cd_ListPutter(Cnd_sppl_cd, "sppl_cd", "sppl_nm");

		}
		return Cnd_sppl_cd_p;
	}
	
	
	/** [Cnd_rqst_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rqst_wg_cd_p = null;

	/**
	 * [Cnd_rqst_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqst_wg_cd_ListPutter() {
		if (Cnd_rqst_wg_cd_p == null) {
			Cnd_rqst_wg_cd_p = createCnd_rqst_wg_cd_ListPutter(Cnd_rqst_wg_cd, "rqst_wg_cd", "rqst_wg_nm");

		}
		return Cnd_rqst_wg_cd_p;
	}
	
	
	/** [Cnd_rqst_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rqst_loc_cd_p = null;

	/**
	 * [Cnd_rqst_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqst_loc_cd_ListPutter() {
		if (Cnd_rqst_loc_cd_p == null) {
			Cnd_rqst_loc_cd_p = createCnd_rqst_loc_cd_ListPutter(Cnd_rqst_loc_cd, "rqst_loc_cd", "rqst_loc_nm");

		}
		return Cnd_rqst_loc_cd_p;
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
	
	
	/** [Cnd_rqmt_gnrt_typ_ListPutter]の定義 */
	private MCListPutter Cnd_rqmt_gnrt_typ_p = null;

	/**
	 * [Cnd_rqmt_gnrt_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqmt_gnrt_typ_ListPutter() {
		if (Cnd_rqmt_gnrt_typ_p == null) {
			Cnd_rqmt_gnrt_typ_p = createCnd_rqmt_gnrt_typ_ListPutter(Cnd_rqmt_gnrt_typ, "rqmt_gnrt_typ", "rqmt_gnrt_typ_nm");

		}
		return Cnd_rqmt_gnrt_typ_p;
	}
	
	
	/** [Cnd_rqmt_typ_ListPutter]の定義 */
	private MCListPutter Cnd_rqmt_typ_p = null;

	/**
	 * [Cnd_rqmt_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqmt_typ_ListPutter() {
		if (Cnd_rqmt_typ_p == null) {
			Cnd_rqmt_typ_p = createCnd_rqmt_typ_ListPutter(Cnd_rqmt_typ, "rqmt_typ", "rqmt_typ_nm");

		}
		return Cnd_rqmt_typ_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_cd_p = createRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3","unit_cd","unit_nm","dec_place","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sno1_num_typ","sno2_num_typ","sno3_num_typ","sno4_num_typ","rqmt_sno1_flg","rqmt_sno2_flg","rqmt_sno3_flg","rqmt_sno4_flg");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub1_p = createRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3","unit_cd","unit_nm","dec_place","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sno1_num_typ","sno2_num_typ","sno3_num_typ","sno4_num_typ","rqmt_sno1_flg","rqmt_sno2_flg","rqmt_sno3_flg","rqmt_sno4_flg");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub2_p = createRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3","unit_cd","unit_nm","dec_place","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sno1_num_typ","sno2_num_typ","sno3_num_typ","sno4_num_typ","rqmt_sno1_flg","rqmt_sno2_flg","rqmt_sno3_flg","rqmt_sno4_flg");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub3_p = createRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","unit_cd","unit_nm","dec_place","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sno1_num_typ","sno2_num_typ","sno3_num_typ","sno4_num_typ","rqmt_sno1_flg","rqmt_sno2_flg","rqmt_sno3_flg","rqmt_sno4_flg");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Rslt_strg_loc_cd_ListPutter]の定義 */
	private MCListPutter Rslt_strg_loc_cd_p = null;

	/**
	 * [Rslt_strg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_strg_loc_cd_ListPutter() {
		if (Rslt_strg_loc_cd_p == null) {
			Rslt_strg_loc_cd_p = createRslt_strg_loc_cd_ListPutter(columnRslt_strg_loc_cd, "strg_loc_cd", "strg_loc_nm","site_cd","site_nm","wg_cd","wg_nm","strg_loc_grp_cd","strg_loc_grp_nm");

		}
		return Rslt_strg_loc_cd_p;
	}
	
	
	/** [Rslt_mfg_loc_cd_ListPutter]の定義 */
	private MCListPutter Rslt_mfg_loc_cd_p = null;

	/**
	 * [Rslt_mfg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_mfg_loc_cd_ListPutter() {
		if (Rslt_mfg_loc_cd_p == null) {
			Rslt_mfg_loc_cd_p = createRslt_mfg_loc_cd_ListPutter(columnRslt_mfg_loc_cd, "mfg_loc_cd", "mfg_loc_nm");

		}
		return Rslt_mfg_loc_cd_p;
	}
	
	
	/** [Rslt_sppl_cd_ListPutter]の定義 */
	private MCListPutter Rslt_sppl_cd_p = null;

	/**
	 * [Rslt_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_sppl_cd_ListPutter() {
		if (Rslt_sppl_cd_p == null) {
			Rslt_sppl_cd_p = createRslt_sppl_cd_ListPutter(columnRslt_sppl_cd, "sppl_cd", "sppl_nm");

		}
		return Rslt_sppl_cd_p;
	}
	
	
	/** [Rslt_rqst_loc_cd_ListPutter]の定義 */
	private MCListPutter Rslt_rqst_loc_cd_p = null;

	/**
	 * [Rslt_rqst_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_rqst_loc_cd_ListPutter() {
		if (Rslt_rqst_loc_cd_p == null) {
			Rslt_rqst_loc_cd_p = createRslt_rqst_loc_cd_ListPutter(columnRslt_rqst_loc_cd, "rqst_loc_cd", "rqst_loc_nm","rqst_wg_cd","rqst_wg_nm");

		}
		return Rslt_rqst_loc_cd_p;
	}
	
	
	/** [Rslt_rqmt_typ_ListPutter]の定義 */
	private MCListPutter Rslt_rqmt_typ_p = null;

	/**
	 * [Rslt_rqmt_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_rqmt_typ_ListPutter() {
		if (Rslt_rqmt_typ_p == null) {
			Rslt_rqmt_typ_p = createRslt_rqmt_typ_ListPutter(columnRslt_rqmt_typ, "rqmt_typ", "rqmt_typ_nm");

		}
		return Rslt_rqmt_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_RqmtReg create(){
		MSBCP_RqmtReg p = new MSBCP_RqmtReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_RqmtReg create(String name){
		MSBCP_RqmtReg p = new MSBCP_RqmtReg(name);
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
		MSBCP_RqmtReg_MC.jbfInitScreenOpe((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbfInitRqmtTyp((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbfInitTop((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbfInitFold((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbfInitTab1((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbfInitTab2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbfInitCnd((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbfInitCnd2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbfInitCtrl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbfInitRPnl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbfInitRslt((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbfInitBtn((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbfInitEastBtn((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbInitScreenOpe((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbInitRqmtTyp((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbInitTop((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbInitFold((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbInitTab1((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbInitTab2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbInitCnd((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbInitCnd2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbInitCtrl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbInitRPnl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbInitRslt((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbInitBtn((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.jbInitEastBtn((MSBCP_RqmtReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBCP_RqmtReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [RqmtTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRqmtTyp(MSBCP_RqmtReg p) {
		// ブロック関連の初期化
		p.RqmtTypPanel = p.beansFactory.createPanel("RqmtTyp");
		p.RqmtTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBCP_RqmtReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBCP_RqmtReg p) {
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
	protected static void jbfInitTab1(MSBCP_RqmtReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBCP_RqmtReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBCP_RqmtReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_mrp_typ_r_Group = p.beansFactory.createButtonGroup("Cnd.mrp_typ_r");
		p.Cnd_mrp_typ_r_NRML = p.beansFactory.createRadioButton("Cnd.mrp_typ_r_NRML");
		p.Cnd_mrp_typ_r_PRCD = p.beansFactory.createRadioButton("Cnd.mrp_typ_r_PRCD");
		p.Cnd_due_dt_fr_Label = p.beansFactory.createLabel("Cnd.due_dt_fr_Label");
		p.Cnd_due_dt_fr = p.beansFactory.createDateField("Cnd.due_dt_fr");
		p.Cnd_due_dt_fr.setLabel(p.Cnd_due_dt_fr_Label);
		p.Cnd_due_dt_to_Label = p.beansFactory.createLabel("Cnd.due_dt_to_Label");
		p.Cnd_due_dt_to = p.beansFactory.createDateField("Cnd.due_dt_to");
		p.Cnd_due_dt_to.setLabel(p.Cnd_due_dt_to_Label);
		p.Cnd_site_cd_Label = p.beansFactory.createLabel("Cnd.site_cd_Label");
		p.Cnd_site_cd = p.beansFactory.createTextComboBox("Cnd.site_cd");
		p.Cnd_site_cd.setLabel(p.Cnd_site_cd_Label);
		p.Cnd_site_nm = p.beansFactory.createTextField("Cnd.site_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_strg_loc_grp_cd_Label = p.beansFactory.createLabel("Cnd.strg_loc_grp_cd_Label");
		p.Cnd_strg_loc_grp_cd = p.beansFactory.createTextComboBox("Cnd.strg_loc_grp_cd");
		p.Cnd_strg_loc_grp_cd.setLabel(p.Cnd_strg_loc_grp_cd_Label);
		p.Cnd_strg_loc_grp_nm = p.beansFactory.createTextField("Cnd.strg_loc_grp_nm");
		p.Cnd_strg_loc_cd_Label = p.beansFactory.createLabel("Cnd.strg_loc_cd_Label");
		p.Cnd_strg_loc_cd = p.beansFactory.createTextField("Cnd.strg_loc_cd");
		p.Cnd_strg_loc_cd.setLabel(p.Cnd_strg_loc_cd_Label);
		p.Cnd_strg_loc_nm = p.beansFactory.createTextField("Cnd.strg_loc_nm");
		p.Cnd_mfg_loc_cd_Label = p.beansFactory.createLabel("Cnd.mfg_loc_cd_Label");
		p.Cnd_mfg_loc_cd = p.beansFactory.createTextField("Cnd.mfg_loc_cd");
		p.Cnd_mfg_loc_cd.setLabel(p.Cnd_mfg_loc_cd_Label);
		p.Cnd_mfg_loc_nm = p.beansFactory.createTextField("Cnd.mfg_loc_nm");
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_rqst_wg_cd_Label = p.beansFactory.createLabel("Cnd.rqst_wg_cd_Label");
		p.Cnd_rqst_wg_cd = p.beansFactory.createTextComboBox("Cnd.rqst_wg_cd");
		p.Cnd_rqst_wg_cd.setLabel(p.Cnd_rqst_wg_cd_Label);
		p.Cnd_rqst_wg_nm = p.beansFactory.createTextField("Cnd.rqst_wg_nm");
		p.Cnd_rqst_loc_cd_Label = p.beansFactory.createLabel("Cnd.rqst_loc_cd_Label");
		p.Cnd_rqst_loc_cd = p.beansFactory.createTextField("Cnd.rqst_loc_cd");
		p.Cnd_rqst_loc_cd.setLabel(p.Cnd_rqst_loc_cd_Label);
		p.Cnd_rqst_loc_nm = p.beansFactory.createTextField("Cnd.rqst_loc_nm");
		p.Cnd_rqmt_no_Label = p.beansFactory.createLabel("Cnd.rqmt_no_Label");
		p.Cnd_rqmt_no = p.beansFactory.createTextField("Cnd.rqmt_no");
		p.Cnd_rqmt_no.setLabel(p.Cnd_rqmt_no_Label);
		p.Cnd_fix_flg = p.beansFactory.createCheckBox("Cnd.fix_flg");
		p.Cnd_rqmt_gnrt_typ_Label = p.beansFactory.createLabel("Cnd.rqmt_gnrt_typ_Label");
		p.Cnd_rqmt_gnrt_typ = p.beansFactory.createTextComboBox("Cnd.rqmt_gnrt_typ");
		p.Cnd_rqmt_gnrt_typ.setLabel(p.Cnd_rqmt_gnrt_typ_Label);
		p.Cnd_rqmt_gnrt_typ_nm = p.beansFactory.createTextField("Cnd.rqmt_gnrt_typ_nm");
		p.Cnd_rqmt_typ_Label = p.beansFactory.createLabel("Cnd.rqmt_typ_Label");
		p.Cnd_rqmt_typ = p.beansFactory.createTextComboBox("Cnd.rqmt_typ");
		p.Cnd_rqmt_typ.setLabel(p.Cnd_rqmt_typ_Label);
		p.Cnd_rqmt_typ_nm = p.beansFactory.createTextField("Cnd.rqmt_typ_nm");
		p.Cnd_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_rmrks_Label");
		p.Cnd_intr_rmrks = p.beansFactory.createTextField("Cnd.intr_rmrks");
		p.Cnd_intr_rmrks.setLabel(p.Cnd_intr_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBCP_RqmtReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBCP_RqmtReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBCP_RqmtReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBCP_RqmtReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_sno_sprt_flg = p.beansFactory.createTableColumn("Rslt.sno_sprt_flg", MCColumnType.CHECK);
		p.columnRslt_rqmt_no = p.beansFactory.createTableColumn("Rslt.rqmt_no", MCColumnType.TEXT);
		p.columnRslt_due_dt = p.beansFactory.createTableColumn("Rslt.due_dt", MCColumnType.DATE);
		p.columnRslt_strg_loc_cd = p.beansFactory.createTableColumn("Rslt.strg_loc_cd", MCColumnType.TEXT);
		p.columnRslt_strg_loc_nm = p.beansFactory.createTableColumn("Rslt.strg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_site_cd = p.beansFactory.createTableColumn("Rslt.site_cd", MCColumnType.TEXT);
		p.columnRslt_site_nm = p.beansFactory.createTableColumn("Rslt.site_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_strg_loc_grp_cd = p.beansFactory.createTableColumn("Rslt.strg_loc_grp_cd", MCColumnType.TEXT);
		p.columnRslt_strg_loc_grp_nm = p.beansFactory.createTableColumn("Rslt.strg_loc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_unit_cd = p.beansFactory.createTableColumn("Rslt.unit_cd", MCColumnType.TEXT);
		p.columnRslt_unit_nm = p.beansFactory.createTableColumn("Rslt.unit_nm", MCColumnType.TEXT);
		p.columnRslt_dec_place = p.beansFactory.createTableColumn("Rslt.dec_place", MCColumnType.NUMBER);
		p.columnRslt_mfg_loc_cd = p.beansFactory.createTableColumn("Rslt.mfg_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_mfg_loc_nm = p.beansFactory.createTableColumn("Rslt.mfg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_rqst_loc_cd = p.beansFactory.createTableColumn("Rslt.rqst_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnRslt_rqst_loc_nm = p.beansFactory.createTableColumn("Rslt.rqst_loc_nm", MCColumnType.TEXT);
		p.columnRslt_rqst_wg_cd = p.beansFactory.createTableColumn("Rslt.rqst_wg_cd", MCColumnType.TEXT);
		p.columnRslt_rqst_wg_nm = p.beansFactory.createTableColumn("Rslt.rqst_wg_nm", MCColumnType.TEXT);
		p.columnRslt_sno1_mng_typ = p.beansFactory.createTableColumn("Rslt.sno1_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno2_mng_typ = p.beansFactory.createTableColumn("Rslt.sno2_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno3_mng_typ = p.beansFactory.createTableColumn("Rslt.sno3_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno4_mng_typ = p.beansFactory.createTableColumn("Rslt.sno4_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sno1_num_typ = p.beansFactory.createTableColumn("Rslt.sno1_num_typ", MCColumnType.TEXT);
		p.columnRslt_sno2_num_typ = p.beansFactory.createTableColumn("Rslt.sno2_num_typ", MCColumnType.TEXT);
		p.columnRslt_sno3_num_typ = p.beansFactory.createTableColumn("Rslt.sno3_num_typ", MCColumnType.TEXT);
		p.columnRslt_sno4_num_typ = p.beansFactory.createTableColumn("Rslt.sno4_num_typ", MCColumnType.TEXT);
		p.columnRslt_rqmt_sno1_flg = p.beansFactory.createTableColumn("Rslt.rqmt_sno1_flg", MCColumnType.CHECK);
		p.columnRslt_rqmt_sno2_flg = p.beansFactory.createTableColumn("Rslt.rqmt_sno2_flg", MCColumnType.CHECK);
		p.columnRslt_rqmt_sno3_flg = p.beansFactory.createTableColumn("Rslt.rqmt_sno3_flg", MCColumnType.CHECK);
		p.columnRslt_rqmt_sno4_flg = p.beansFactory.createTableColumn("Rslt.rqmt_sno4_flg", MCColumnType.CHECK);
		p.columnRslt_fix_flg = p.beansFactory.createTableColumn("Rslt.fix_flg", MCColumnType.CHECK);
		p.columnRslt_rqmt_gnrt_typ = p.beansFactory.createTableColumn("Rslt.rqmt_gnrt_typ", MCColumnType.TEXT);
		p.columnRslt_rqmt_gnrt_typ_nm = p.beansFactory.createTableColumn("Rslt.rqmt_gnrt_typ_nm", MCColumnType.TEXT);
		p.columnRslt_rqmt_typ = p.beansFactory.createTableColumn("Rslt.rqmt_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_rqmt_typ_nm = p.beansFactory.createTableColumn("Rslt.rqmt_typ_nm", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
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
	protected static void jbfInitBtn(MSBCP_RqmtReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBCP0070 = p.beansFactory.createButton("Btn.open_MSBCP0070", "open");
		p.Btn_open_MSBCP0080 = p.beansFactory.createButton("Btn.open_MSBCP0080", "open");
		p.Btn_label_sno = p.beansFactory.createLabel("Btn.label_sno");
		p.Btn_sno_select_all = p.beansFactory.createButton("Btn.sno_select_all", "no_border");
		p.Btn_sno_deselect_all = p.beansFactory.createButton("Btn.sno_deselect_all", "no_border");
		p.Btn_sprt_sno = p.beansFactory.createButton("Btn.sprt_sno");
		p.Btn_label_check = p.beansFactory.createLabel("Btn.label_check");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd_nrml = p.beansFactory.createButton("Btn.upd_nrml", "upd");
		p.Btn_upd_prcd = p.beansFactory.createButton("Btn.upd_prcd", "upd");
		p.Btn_del_nrml = p.beansFactory.createButton("Btn.del_nrml", "del");
		p.Btn_del_prcd = p.beansFactory.createButton("Btn.del_prcd", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBCP_RqmtReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBCP_RqmtReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.RqmtTypPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [RqmtTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRqmtTyp(MSBCP_RqmtReg p) {
		// ブロック関連の初期化
		p.RqmtTypPanel.setBorder(p.RqmtTypTitledBorder);
		p.add(p.RqmtTypPanel);
		p.RqmtTypPanel.setNextBeans(p.TopPanel);
		p.RqmtTypPanel.setValueCheck(false);
		p.RqmtTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RqmtTypPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBCP_RqmtReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
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
	protected static void jbInitFold(MSBCP_RqmtReg p) {
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
	protected static void jbInitTab1(MSBCP_RqmtReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBCP_RqmtReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBCP_RqmtReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
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
		p.Cnd_ope_REF.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.ope_META);
		p.RqmtTypPanel.setLastBeans(p.Cnd_mrp_typ_r_Group);
		p.Cnd_mrp_typ_r_Group.setFirstBeans(p.Cnd_mrp_typ_r_NRML);
		p.Cnd_mrp_typ_r_NRML.setActionCommand("1");
		p.Cnd_mrp_typ_r_Group.add(p.Cnd_mrp_typ_r_NRML);
		p.RqmtTypPanel.add(p.Cnd_mrp_typ_r_NRML);
		p.Cnd_mrp_typ_r_NRML.setNextBeans(p.Cnd_mrp_typ_r_PRCD);
		p.Cnd_mrp_typ_r_PRCD.setActionCommand("2");
		p.Cnd_mrp_typ_r_Group.add(p.Cnd_mrp_typ_r_PRCD);
		p.RqmtTypPanel.add(p.Cnd_mrp_typ_r_PRCD);
		p.Cnd_mrp_typ_r_Group.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.mrp_typ_r_META);
		p.CndPanel.add(p.Cnd_due_dt_fr_Label);
		p.CndPanel.add(p.Cnd_due_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_due_dt_fr);
		p.Cnd_due_dt_fr.setNextBeans(p.Cnd_due_dt_to);
		p.Cnd_due_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.due_dt_fr_META);
		p.Cnd_due_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_due_dt_to_Label);
		p.CndPanel.add(p.Cnd_due_dt_to);
		p.Cnd_due_dt_to.setNextBeans(p.Cnd_site_cd);
		p.Cnd_due_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.due_dt_to_META);
		p.Cnd_due_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_strg_loc_grp_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_strg_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_strg_loc_grp_cd, true);
		p.Cnd_strg_loc_grp_cd.setLinkBeans(p.Cnd_strg_loc_grp_nm);
		p.CndPanel.add(p.Cnd_strg_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_strg_loc_grp_cd);
		p.Cnd_strg_loc_grp_cd.setNextBeans(p.Cnd_strg_loc_grp_nm);
		p.Cnd_strg_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.strg_loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_strg_loc_grp_nm);
		p.Cnd_strg_loc_grp_nm.setNextBeans(p.Cnd_strg_loc_cd);
		p.Cnd_strg_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.strg_loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_strg_loc_grp_nm, true);
		p.CndPanel.add(p.Cnd_strg_loc_cd_Label);
		p.CndPanel.add(p.Cnd_strg_loc_cd);
		p.Cnd_strg_loc_cd.setNextBeans(p.Cnd_strg_loc_nm);
		p.Cnd_strg_loc_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.strg_loc_cd_META);
		p.Cnd_strg_loc_cd.addLinkBeans(p.Cnd_strg_loc_nm);
		p.Cnd_strg_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_strg_loc_cd, true);
		p.CndPanel.add(p.Cnd_strg_loc_nm);
		p.Cnd_strg_loc_nm.setNextBeans(p.Cnd_mfg_loc_cd);
		p.Cnd_strg_loc_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.strg_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_strg_loc_nm, true);
		p.CndPanel.add(p.Cnd_mfg_loc_cd_Label);
		p.CndPanel.add(p.Cnd_mfg_loc_cd);
		p.Cnd_mfg_loc_cd.setNextBeans(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.mfg_loc_cd_META);
		p.Cnd_mfg_loc_cd.addLinkBeans(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_loc_cd, true);
		p.CndPanel.add(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_nm.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_mfg_loc_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.mfg_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_mfg_loc_nm, true);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_rqst_wg_cd);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
		p.Cnd_rqst_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_wg_cd, true);
		p.Cnd_rqst_wg_cd.setLinkBeans(p.Cnd_rqst_wg_nm);
		p.CndPanel.add(p.Cnd_rqst_wg_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_wg_cd);
		p.Cnd_rqst_wg_cd.setNextBeans(p.Cnd_rqst_wg_nm);
		p.Cnd_rqst_wg_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.rqst_wg_cd_META);
		p.CndPanel.add(p.Cnd_rqst_wg_nm);
		p.Cnd_rqst_wg_nm.setNextBeans(p.Cnd_rqst_loc_cd);
		p.Cnd_rqst_wg_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.rqst_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_wg_nm, true);
		p.CndPanel.add(p.Cnd_rqst_loc_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_loc_cd);
		p.Cnd_rqst_loc_cd.setNextBeans(p.Cnd_rqst_loc_nm);
		p.Cnd_rqst_loc_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.rqst_loc_cd_META);
		p.Cnd_rqst_loc_cd.addLinkBeans(p.Cnd_rqst_loc_nm);
		p.Cnd_rqst_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_loc_cd, true);
		p.CndPanel.add(p.Cnd_rqst_loc_nm);
		p.Cnd_rqst_loc_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_rqst_loc_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.rqst_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_loc_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_sno_wrk_no_p_PPanel);
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
		p.CndPanel.add(p.Cnd_sno_wrk_no_p_PPanel);
		p.Cnd_sno_wrk_no_p_PPanel.setNextBeans(p.Cnd_rqmt_no);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.CndPanel.add(p.Cnd_rqmt_no_Label);
		p.CndPanel.add(p.Cnd_rqmt_no);
		p.Cnd_rqmt_no.setNextBeans(p.Cnd_fix_flg);
		p.Cnd_rqmt_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.rqmt_no_META);
		p.setPluralValueEnable(p.Cnd_rqmt_no, true);
		p.CndPanel.add(p.Cnd_fix_flg);
		p.Cnd_fix_flg.setNextBeans(p.Cnd_rqmt_gnrt_typ);
		p.Cnd_fix_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.fix_flg_META);
		p.Cnd_rqmt_gnrt_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqmt_gnrt_typ, true);
		p.Cnd_rqmt_gnrt_typ.setLinkBeans(p.Cnd_rqmt_gnrt_typ_nm);
		p.CndPanel.add(p.Cnd_rqmt_gnrt_typ_Label);
		p.CndPanel.add(p.Cnd_rqmt_gnrt_typ);
		p.Cnd_rqmt_gnrt_typ.setNextBeans(p.Cnd_rqmt_gnrt_typ_nm);
		p.Cnd_rqmt_gnrt_typ.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.rqmt_gnrt_typ_META);
		p.CndPanel.add(p.Cnd_rqmt_gnrt_typ_nm);
		p.Cnd_rqmt_gnrt_typ_nm.setNextBeans(p.Cnd_rqmt_typ);
		p.Cnd_rqmt_gnrt_typ_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.rqmt_gnrt_typ_nm_META);
		p.Cnd_rqmt_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqmt_typ, true);
		p.Cnd_rqmt_typ.setLinkBeans(p.Cnd_rqmt_typ_nm);
		p.CndPanel.add(p.Cnd_rqmt_typ_Label);
		p.CndPanel.add(p.Cnd_rqmt_typ);
		p.Cnd_rqmt_typ.setNextBeans(p.Cnd_rqmt_typ_nm);
		p.Cnd_rqmt_typ.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.rqmt_typ_META);
		p.CndPanel.add(p.Cnd_rqmt_typ_nm);
		p.Cnd_rqmt_typ_nm.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_rqmt_typ_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.rqmt_typ_nm_META);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0010.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.Cnd2Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBCP_RqmtReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBCP_RqmtReg p) {
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
	protected static void jbInitRPnl(MSBCP_RqmtReg p) {
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
	protected static void jbInitRslt(MSBCP_RqmtReg p) {
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
	protected static void jbInitBtn(MSBCP_RqmtReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBCP0070.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBCP0070);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBCP0070);
		p.Btn_open_MSBCP0070.setNextBeans(p.Btn_open_MSBCP0080);
		p.Btn_open_MSBCP0080.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBCP0080);
		p.Btn_open_MSBCP0080.setNextBeans(p.Btn_sno_select_all);
		p.BtnPanel.add(p.Btn_label_sno);
		p.Btn_sno_select_all.setIcon("SELECT_ALL");
		p.Btn_sno_select_all.setFunctionKey(MCFunctionKey.F15);
		p.BtnPanel.add(p.Btn_sno_select_all);
		p.Btn_sno_select_all.setNextBeans(p.Btn_sno_deselect_all);
		p.Btn_sno_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_sno_deselect_all.setFunctionKey(MCFunctionKey.F16);
		p.BtnPanel.add(p.Btn_sno_deselect_all);
		p.Btn_sno_deselect_all.setNextBeans(p.Btn_sprt_sno);
		p.Btn_sprt_sno.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_sprt_sno);
		p.Btn_sprt_sno.setNextBeans(p.Btn_select_all);
		p.BtnPanel.add(p.Btn_label_check);
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
		p.Btn_rcopy.setNextBeans(p.Btn_upd_nrml);
		p.Btn_upd_nrml.setIcon("REGISTER");
		p.Btn_upd_nrml.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_nrml);
		p.Btn_upd_nrml.setNextBeans(p.Btn_upd_prcd);
		p.Btn_upd_prcd.setIcon("REGISTER");
		p.Btn_upd_prcd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_prcd);
		p.Btn_del_nrml.setIcon("CANCEL");
		p.Btn_del_nrml.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del_nrml);
		p.EastBtnPanel.add(p.Btn_del_nrml);
		p.Btn_del_nrml.setNextBeans(p.Btn_del_prcd);
		p.Btn_del_prcd.setIcon("CANCEL");
		p.Btn_del_prcd.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del_prcd);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBCP_RqmtReg p) {
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
		MSBCP_RqmtReg_MC.mcInitScreenOpe((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.mcInitRqmtTyp((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.mcInitTop((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.mcInitFold((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.mcInitTab1((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.mcInitTab2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.mcInitCnd((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.mcInitCnd2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.mcInitCtrl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.mcInitRPnl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.mcInitRslt((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.mcInitBtn((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.mcInitEastBtn((MSBCP_RqmtReg)this);

		// [UPD_NRML]ステータスのモードの設定
		MSBCP_RqmtReg_MC.statusInitUPD__NRML_ScreenOpe((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__NRML_RqmtTyp((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__NRML_Top((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__NRML_Fold((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__NRML_Tab1((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__NRML_Tab2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__NRML_Cnd((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__NRML_Cnd2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__NRML_Ctrl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__NRML_RPnl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__NRML_Rslt((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__NRML_Btn((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__NRML_EastBtn((MSBCP_RqmtReg)this);

		// [FIX_U_NRML]ステータスのモードの設定
		MSBCP_RqmtReg_MC.statusInitFIX__U__NRML_ScreenOpe((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__NRML_RqmtTyp((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__NRML_Top((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__NRML_Fold((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__NRML_Tab1((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__NRML_Tab2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__NRML_Cnd((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__NRML_Cnd2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__NRML_Ctrl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__NRML_RPnl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__NRML_Rslt((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__NRML_Btn((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__NRML_EastBtn((MSBCP_RqmtReg)this);

		// [SRCH_DEL_NRML]ステータスのモードの設定
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__NRML_ScreenOpe((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__NRML_RqmtTyp((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__NRML_Top((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__NRML_Fold((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__NRML_Tab1((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__NRML_Tab2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__NRML_Cnd((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__NRML_Cnd2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__NRML_Ctrl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__NRML_RPnl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__NRML_Rslt((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__NRML_Btn((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__NRML_EastBtn((MSBCP_RqmtReg)this);

		// [DEL_NRML]ステータスのモードの設定
		MSBCP_RqmtReg_MC.statusInitDEL__NRML_ScreenOpe((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__NRML_RqmtTyp((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__NRML_Top((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__NRML_Fold((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__NRML_Tab1((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__NRML_Tab2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__NRML_Cnd((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__NRML_Cnd2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__NRML_Ctrl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__NRML_RPnl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__NRML_Rslt((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__NRML_Btn((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__NRML_EastBtn((MSBCP_RqmtReg)this);

		// [SRCH_NRML]ステータスのモードの設定
		MSBCP_RqmtReg_MC.statusInitSRCH__NRML_ScreenOpe((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__NRML_RqmtTyp((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__NRML_Top((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__NRML_Fold((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__NRML_Tab1((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__NRML_Tab2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__NRML_Cnd((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__NRML_Cnd2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__NRML_Ctrl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__NRML_RPnl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__NRML_Rslt((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__NRML_Btn((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__NRML_EastBtn((MSBCP_RqmtReg)this);

		// [REF_NRML]ステータスのモードの設定
		MSBCP_RqmtReg_MC.statusInitREF__NRML_ScreenOpe((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__NRML_RqmtTyp((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__NRML_Top((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__NRML_Fold((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__NRML_Tab1((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__NRML_Tab2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__NRML_Cnd((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__NRML_Cnd2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__NRML_Ctrl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__NRML_RPnl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__NRML_Rslt((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__NRML_Btn((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__NRML_EastBtn((MSBCP_RqmtReg)this);

		// [UPD_PRCD]ステータスのモードの設定
		MSBCP_RqmtReg_MC.statusInitUPD__PRCD_ScreenOpe((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__PRCD_RqmtTyp((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__PRCD_Top((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__PRCD_Fold((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__PRCD_Tab1((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__PRCD_Tab2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__PRCD_Cnd((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__PRCD_Cnd2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__PRCD_Ctrl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__PRCD_RPnl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__PRCD_Rslt((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__PRCD_Btn((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitUPD__PRCD_EastBtn((MSBCP_RqmtReg)this);

		// [FIX_U_PRCD]ステータスのモードの設定
		MSBCP_RqmtReg_MC.statusInitFIX__U__PRCD_ScreenOpe((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__PRCD_RqmtTyp((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__PRCD_Top((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__PRCD_Fold((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__PRCD_Tab1((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__PRCD_Tab2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__PRCD_Cnd((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__PRCD_Cnd2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__PRCD_Ctrl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__PRCD_RPnl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__PRCD_Rslt((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__PRCD_Btn((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitFIX__U__PRCD_EastBtn((MSBCP_RqmtReg)this);

		// [SRCH_DEL_PRCD]ステータスのモードの設定
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__PRCD_ScreenOpe((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__PRCD_RqmtTyp((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__PRCD_Top((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__PRCD_Fold((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__PRCD_Tab1((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__PRCD_Tab2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__PRCD_Cnd((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__PRCD_Cnd2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__PRCD_Ctrl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__PRCD_RPnl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__PRCD_Rslt((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__PRCD_Btn((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__DEL__PRCD_EastBtn((MSBCP_RqmtReg)this);

		// [DEL_PRCD]ステータスのモードの設定
		MSBCP_RqmtReg_MC.statusInitDEL__PRCD_ScreenOpe((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__PRCD_RqmtTyp((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__PRCD_Top((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__PRCD_Fold((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__PRCD_Tab1((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__PRCD_Tab2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__PRCD_Cnd((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__PRCD_Cnd2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__PRCD_Ctrl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__PRCD_RPnl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__PRCD_Rslt((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__PRCD_Btn((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitDEL__PRCD_EastBtn((MSBCP_RqmtReg)this);

		// [SRCH_PRCD]ステータスのモードの設定
		MSBCP_RqmtReg_MC.statusInitSRCH__PRCD_ScreenOpe((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__PRCD_RqmtTyp((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__PRCD_Top((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__PRCD_Fold((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__PRCD_Tab1((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__PRCD_Tab2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__PRCD_Cnd((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__PRCD_Cnd2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__PRCD_Ctrl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__PRCD_RPnl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__PRCD_Rslt((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__PRCD_Btn((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitSRCH__PRCD_EastBtn((MSBCP_RqmtReg)this);

		// [REF_PRCD]ステータスのモードの設定
		MSBCP_RqmtReg_MC.statusInitREF__PRCD_ScreenOpe((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__PRCD_RqmtTyp((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__PRCD_Top((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__PRCD_Fold((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__PRCD_Tab1((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__PRCD_Tab2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__PRCD_Cnd((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__PRCD_Cnd2((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__PRCD_Ctrl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__PRCD_RPnl((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__PRCD_Rslt((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__PRCD_Btn((MSBCP_RqmtReg)this);
		MSBCP_RqmtReg_MC.statusInitREF__PRCD_EastBtn((MSBCP_RqmtReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBCP_RqmtReg p) {
	}

	/**
	 *  [RqmtTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRqmtTyp(MSBCP_RqmtReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBCP_RqmtReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBCP_RqmtReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBCP_RqmtReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBCP_RqmtReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBCP_RqmtReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_mrp_typ_r_Group.addAllListener(p);
		p.Cnd_mrp_typ_r_NRML.addAllListener(p);
		p.Cnd_mrp_typ_r_PRCD.addAllListener(p);
		p.Cnd_due_dt_fr.setListListener(p);
		p.Cnd_due_dt_fr.addAllListener(p);
		p.Cnd_due_dt_to.setListListener(p);
		p.Cnd_due_dt_to.addAllListener(p);
		p.Cnd_site_cd.setListListener(p);
		p.Cnd_site_cd.addAllListener(p);
		p.Cnd_site_nm.setListListener(p);
		p.Cnd_site_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_strg_loc_grp_cd.setListListener(p);
		p.Cnd_strg_loc_grp_cd.addAllListener(p);
		p.Cnd_strg_loc_grp_nm.setListListener(p);
		p.Cnd_strg_loc_grp_nm.addAllListener(p);
		p.Cnd_strg_loc_cd.setListListener(p);
		p.Cnd_strg_loc_cd.addAllListener(p);
		p.Cnd_strg_loc_nm.setListListener(p);
		p.Cnd_strg_loc_nm.addAllListener(p);
		p.Cnd_mfg_loc_cd.setListListener(p);
		p.Cnd_mfg_loc_cd.addAllListener(p);
		p.Cnd_mfg_loc_nm.setListListener(p);
		p.Cnd_mfg_loc_nm.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_rqst_wg_cd.setListListener(p);
		p.Cnd_rqst_wg_cd.addAllListener(p);
		p.Cnd_rqst_wg_nm.setListListener(p);
		p.Cnd_rqst_wg_nm.addAllListener(p);
		p.Cnd_rqst_loc_cd.setListListener(p);
		p.Cnd_rqst_loc_cd.addAllListener(p);
		p.Cnd_rqst_loc_nm.setListListener(p);
		p.Cnd_rqst_loc_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_rqmt_no.setListListener(p);
		p.Cnd_rqmt_no.addAllListener(p);
		p.Cnd_fix_flg.addAllListener(p);
		p.Cnd_rqmt_gnrt_typ.setListListener(p);
		p.Cnd_rqmt_gnrt_typ.addAllListener(p);
		p.Cnd_rqmt_gnrt_typ_nm.setListListener(p);
		p.Cnd_rqmt_gnrt_typ_nm.addAllListener(p);
		p.Cnd_rqmt_typ.setListListener(p);
		p.Cnd_rqmt_typ.addAllListener(p);
		p.Cnd_rqmt_typ_nm.setListListener(p);
		p.Cnd_rqmt_typ_nm.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBCP_RqmtReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBCP_RqmtReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBCP_RqmtReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBCP_RqmtReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_sno_sprt_flg.addAllListener(p);
		p.columnRslt_rqmt_no.addAllListener(p);
		p.columnRslt_rqmt_no.setListListener(p);
		p.columnRslt_due_dt.addAllListener(p);
		p.columnRslt_due_dt.setListListener(p);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_strg_loc_cd.addAllListener(p);
		p.columnRslt_strg_loc_cd.setListListener(p);
		p.columnRslt_strg_loc_nm.addAllListener(p);
		p.columnRslt_strg_loc_nm.setListListener(p);
		p.columnRslt_site_cd.addAllListener(p);
		p.columnRslt_site_cd.setListListener(p);
		p.columnRslt_site_nm.addAllListener(p);
		p.columnRslt_site_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_strg_loc_grp_cd.addAllListener(p);
		p.columnRslt_strg_loc_grp_cd.setListListener(p);
		p.columnRslt_strg_loc_grp_nm.addAllListener(p);
		p.columnRslt_strg_loc_grp_nm.setListListener(p);
		p.columnRslt_unit_cd.addAllListener(p);
		p.columnRslt_unit_cd.setListListener(p);
		p.columnRslt_unit_nm.addAllListener(p);
		p.columnRslt_unit_nm.setListListener(p);
		p.columnRslt_dec_place.addAllListener(p);
		p.columnRslt_dec_place.setListListener(p);
		p.columnRslt_mfg_loc_cd.addAllListener(p);
		p.columnRslt_mfg_loc_cd.setListListener(p);
		p.columnRslt_mfg_loc_nm.addAllListener(p);
		p.columnRslt_mfg_loc_nm.setListListener(p);
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_sppl_nm.addAllListener(p);
		p.columnRslt_sppl_nm.setListListener(p);
		p.columnRslt_rqst_loc_cd.addAllListener(p);
		p.columnRslt_rqst_loc_cd.setListListener(p);
		p.columnRslt_rqst_loc_nm.addAllListener(p);
		p.columnRslt_rqst_loc_nm.setListListener(p);
		p.columnRslt_rqst_wg_cd.addAllListener(p);
		p.columnRslt_rqst_wg_cd.setListListener(p);
		p.columnRslt_rqst_wg_nm.addAllListener(p);
		p.columnRslt_rqst_wg_nm.setListListener(p);
		p.columnRslt_sno1_mng_typ.addAllListener(p);
		p.columnRslt_sno1_mng_typ.setListListener(p);
		p.columnRslt_sno2_mng_typ.addAllListener(p);
		p.columnRslt_sno2_mng_typ.setListListener(p);
		p.columnRslt_sno3_mng_typ.addAllListener(p);
		p.columnRslt_sno3_mng_typ.setListListener(p);
		p.columnRslt_sno4_mng_typ.addAllListener(p);
		p.columnRslt_sno4_mng_typ.setListListener(p);
		p.columnRslt_sno1_num_typ.addAllListener(p);
		p.columnRslt_sno1_num_typ.setListListener(p);
		p.columnRslt_sno2_num_typ.addAllListener(p);
		p.columnRslt_sno2_num_typ.setListListener(p);
		p.columnRslt_sno3_num_typ.addAllListener(p);
		p.columnRslt_sno3_num_typ.setListListener(p);
		p.columnRslt_sno4_num_typ.addAllListener(p);
		p.columnRslt_sno4_num_typ.setListListener(p);
		p.columnRslt_rqmt_sno1_flg.addAllListener(p);
		p.columnRslt_rqmt_sno2_flg.addAllListener(p);
		p.columnRslt_rqmt_sno3_flg.addAllListener(p);
		p.columnRslt_rqmt_sno4_flg.addAllListener(p);
		p.columnRslt_fix_flg.addAllListener(p);
		p.columnRslt_rqmt_gnrt_typ.addAllListener(p);
		p.columnRslt_rqmt_gnrt_typ.setListListener(p);
		p.columnRslt_rqmt_gnrt_typ_nm.addAllListener(p);
		p.columnRslt_rqmt_gnrt_typ_nm.setListListener(p);
		p.columnRslt_rqmt_typ.addAllListener(p);
		p.columnRslt_rqmt_typ.setListListener(p);
		p.columnRslt_rqmt_typ_nm.addAllListener(p);
		p.columnRslt_rqmt_typ_nm.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
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
	protected static void mcInitBtn(MSBCP_RqmtReg p) {
		p.Btn_open_MSBCP0070.addAllListener(p);
		p.Btn_open_MSBCP0070.setAPMethodName("doBtn_open_MSBCP0070");
		p.Btn_open_MSBCP0080.addAllListener(p);
		p.Btn_open_MSBCP0080.setAPMethodName("doBtn_open_MSBCP0080");
		p.Btn_sno_select_all.addAllListener(p);
		p.Btn_sno_select_all.setAPMethodName("doBtn_sno_select_all");
		p.Btn_sno_deselect_all.addAllListener(p);
		p.Btn_sno_deselect_all.setAPMethodName("doBtn_sno_deselect_all");
		p.Btn_sprt_sno.addAllListener(p);
		p.Btn_sprt_sno.setAPMethodName("doBtn_sprt_sno");
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
		p.Btn_upd_nrml.addAllListener(p);
		p.Btn_upd_nrml.setAPMethodName("doBtn_upd_nrml");
		p.Btn_upd_prcd.addAllListener(p);
		p.Btn_upd_prcd.setAPMethodName("doBtn_upd_prcd");
		p.Btn_del_nrml.addAllListener(p);
		p.Btn_del_nrml.setAPMethodName("doBtn_del_nrml");
		p.Btn_del_prcd.addAllListener(p);
		p.Btn_del_prcd.setAPMethodName("doBtn_del_prcd");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBCP_RqmtReg p) {
	}

	/**
	 * [UPD_NRML]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NRML_ScreenOpe(MSBCP_RqmtReg p){

	}

	/**
	 * [UPD_NRML]ステータスの[RqmtTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NRML_RqmtTyp(MSBCP_RqmtReg p){

	}

	/**
	 * [UPD_NRML]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NRML_Top(MSBCP_RqmtReg p){

	}

	/**
	 * [UPD_NRML]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NRML_Fold(MSBCP_RqmtReg p){

	}

	/**
	 * [UPD_NRML]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NRML_Tab1(MSBCP_RqmtReg p){

	}

	/**
	 * [UPD_NRML]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NRML_Tab2(MSBCP_RqmtReg p){

	}

	/**
	 * [UPD_NRML]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NRML_Cnd(MSBCP_RqmtReg p){
		p.Cnd_ope_Group.putMode(p, UPD_NRML, MCMode.REQUIRED);
		p.Cnd_mrp_typ_r_Group.putMode(p, UPD_NRML, MCMode.REQUIRED);
		p.Cnd_due_dt_fr.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_due_dt_to.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_NRML, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD_NRML, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(UPD_NRML, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqmt_no.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_fix_flg.putMode(p, UPD_NRML, MCMode.REQUIRED);
		p.Cnd_rqmt_gnrt_typ.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_rqmt_gnrt_typ_nm.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.Cnd_rqmt_typ.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_rqmt_typ_nm.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD_NRML, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD_NRML]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NRML_Cnd2(MSBCP_RqmtReg p){

	}

	/**
	 * [UPD_NRML]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NRML_Ctrl(MSBCP_RqmtReg p){

	}

	/**
	 * [UPD_NRML]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NRML_RPnl(MSBCP_RqmtReg p){
		p.RPnl_dwnld.putMode(p, UPD_NRML, MCMode.ENABLE);

	}

	/**
	 * [UPD_NRML]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NRML_Rslt(MSBCP_RqmtReg p){
		p.columnRslt_check.putMode(p, UPD_NRML, MCMode.REQUIRED);
		p.columnRslt_sno_sprt_flg.putMode(p, UPD_NRML, MCMode.REQUIRED);
		p.columnRslt_rqmt_no.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, UPD_NRML, MCMode.REQUIRED);
		p.Rslt_itm_p_PPanel.putStatus(UPD_NRML, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnRslt_strg_loc_cd.putMode(p, UPD_NRML, MCMode.REQUIRED);
		p.columnRslt_strg_loc_nm.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.Rslt_rqmt_qty_p_PPanel.putStatus(UPD_NRML, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_unit_cd.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, UPD_NRML, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_cd.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.columnRslt_mfg_loc_nm.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.columnRslt_sppl_nm.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.columnRslt_rqst_loc_nm.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, UPD_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, UPD_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, UPD_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, UPD_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno1_num_typ.putMode(p, UPD_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno2_num_typ.putMode(p, UPD_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno3_num_typ.putMode(p, UPD_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno4_num_typ.putMode(p, UPD_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno1_flg.putMode(p, UPD_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno2_flg.putMode(p, UPD_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno3_flg.putMode(p, UPD_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno4_flg.putMode(p, UPD_NRML, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(UPD_NRML, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.columnRslt_fix_flg.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ_nm.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.columnRslt_rqmt_typ_nm.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.columnRslt_itm_typ.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_NRML, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD_NRML, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, UPD_NRML, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_NRML, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_NRML]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NRML_Btn(MSBCP_RqmtReg p){
		p.Btn_open_MSBCP0070.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Btn_open_MSBCP0080.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Btn_sno_select_all.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Btn_sno_deselect_all.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Btn_sprt_sno.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Btn_upd_nrml.putMode(p, UPD_NRML, MCMode.ENABLE);
		p.Btn_upd_prcd.putMode(p, UPD_NRML, MCMode.INVISIBLE);
		p.Btn_del_nrml.putMode(p, UPD_NRML, MCMode.DISABLE);
		p.Btn_del_prcd.putMode(p, UPD_NRML, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_NRML]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NRML_EastBtn(MSBCP_RqmtReg p){

	}

	/**
	 * [FIX_U_NRML]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NRML_ScreenOpe(MSBCP_RqmtReg p){

	}

	/**
	 * [FIX_U_NRML]ステータスの[RqmtTyp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NRML_RqmtTyp(MSBCP_RqmtReg p){

	}

	/**
	 * [FIX_U_NRML]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NRML_Top(MSBCP_RqmtReg p){

	}

	/**
	 * [FIX_U_NRML]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NRML_Fold(MSBCP_RqmtReg p){

	}

	/**
	 * [FIX_U_NRML]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NRML_Tab1(MSBCP_RqmtReg p){

	}

	/**
	 * [FIX_U_NRML]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NRML_Tab2(MSBCP_RqmtReg p){

	}

	/**
	 * [FIX_U_NRML]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NRML_Cnd(MSBCP_RqmtReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U_NRML, MCMode.REQUIRED);
		p.Cnd_mrp_typ_r_Group.putMode(p, FIX_U_NRML, MCMode.REQUIRED);
		p.Cnd_due_dt_fr.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_due_dt_to.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_U_NRML, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_U_NRML, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(FIX_U_NRML, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqmt_no.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_fix_flg.putMode(p, FIX_U_NRML, MCMode.REQUIRED);
		p.Cnd_rqmt_gnrt_typ.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_rqmt_gnrt_typ_nm.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.Cnd_rqmt_typ.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_rqmt_typ_nm.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_U_NRML, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [FIX_U_NRML]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NRML_Cnd2(MSBCP_RqmtReg p){

	}

	/**
	 * [FIX_U_NRML]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NRML_Ctrl(MSBCP_RqmtReg p){

	}

	/**
	 * [FIX_U_NRML]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NRML_RPnl(MSBCP_RqmtReg p){
		p.RPnl_dwnld.putMode(p, FIX_U_NRML, MCMode.ENABLE);

	}

	/**
	 * [FIX_U_NRML]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NRML_Rslt(MSBCP_RqmtReg p){
		p.columnRslt_check.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_sno_sprt_flg.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_U_NRML, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.Rslt_rqmt_qty_p_PPanel.putStatus(FIX_U_NRML, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, FIX_U_NRML, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_cd.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, FIX_U_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, FIX_U_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, FIX_U_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, FIX_U_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno1_num_typ.putMode(p, FIX_U_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno2_num_typ.putMode(p, FIX_U_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno3_num_typ.putMode(p, FIX_U_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno4_num_typ.putMode(p, FIX_U_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno1_flg.putMode(p, FIX_U_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno2_flg.putMode(p, FIX_U_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno3_flg.putMode(p, FIX_U_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno4_flg.putMode(p, FIX_U_NRML, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(FIX_U_NRML, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ_nm.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ_nm.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_U_NRML, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(FIX_U_NRML, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, FIX_U_NRML, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_U_NRML, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U_NRML]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NRML_Btn(MSBCP_RqmtReg p){
		p.Btn_open_MSBCP0070.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Btn_open_MSBCP0080.putMode(p, FIX_U_NRML, MCMode.ENABLE);
		p.Btn_sno_select_all.putMode(p, FIX_U_NRML, MCMode.DISABLE);
		p.Btn_sno_deselect_all.putMode(p, FIX_U_NRML, MCMode.DISABLE);
		p.Btn_sprt_sno.putMode(p, FIX_U_NRML, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_U_NRML, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U_NRML, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U_NRML, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U_NRML, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U_NRML, MCMode.DISABLE);
		p.Btn_upd_nrml.putMode(p, FIX_U_NRML, MCMode.DISABLE);
		p.Btn_upd_prcd.putMode(p, FIX_U_NRML, MCMode.INVISIBLE);
		p.Btn_del_nrml.putMode(p, FIX_U_NRML, MCMode.DISABLE);
		p.Btn_del_prcd.putMode(p, FIX_U_NRML, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U_NRML]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NRML_EastBtn(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_DEL_NRML]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__NRML_ScreenOpe(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_DEL_NRML]ステータスの[RqmtTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__NRML_RqmtTyp(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_DEL_NRML]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__NRML_Top(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_DEL_NRML]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__NRML_Fold(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_DEL_NRML]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__NRML_Tab1(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_DEL_NRML]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__NRML_Tab2(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_DEL_NRML]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__NRML_Cnd(MSBCP_RqmtReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL_NRML, MCMode.REQUIRED);
		p.Cnd_mrp_typ_r_Group.putMode(p, SRCH_DEL_NRML, MCMode.REQUIRED);
		p.Cnd_due_dt_fr.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_due_dt_to.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL_NRML, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL_NRML, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL_NRML, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqmt_no.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_fix_flg.putMode(p, SRCH_DEL_NRML, MCMode.REQUIRED);
		p.Cnd_rqmt_gnrt_typ.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_rqmt_gnrt_typ_nm.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.Cnd_rqmt_typ.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_rqmt_typ_nm.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DEL_NRML, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DEL_NRML]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__NRML_Cnd2(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_DEL_NRML]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__NRML_Ctrl(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_DEL_NRML]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__NRML_RPnl(MSBCP_RqmtReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL_NRML, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL_NRML]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__NRML_Rslt(MSBCP_RqmtReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_sno_sprt_flg.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL_NRML, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.Rslt_rqmt_qty_p_PPanel.putStatus(SRCH_DEL_NRML, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno1_num_typ.putMode(p, SRCH_DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno2_num_typ.putMode(p, SRCH_DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno3_num_typ.putMode(p, SRCH_DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno4_num_typ.putMode(p, SRCH_DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno1_flg.putMode(p, SRCH_DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno2_flg.putMode(p, SRCH_DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno3_flg.putMode(p, SRCH_DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno4_flg.putMode(p, SRCH_DEL_NRML, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL_NRML, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ_nm.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ_nm.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL_NRML, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_DEL_NRML, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DEL_NRML, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL_NRML]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__NRML_Btn(MSBCP_RqmtReg p){
		p.Btn_open_MSBCP0070.putMode(p, SRCH_DEL_NRML, MCMode.DISABLE);
		p.Btn_open_MSBCP0080.putMode(p, SRCH_DEL_NRML, MCMode.DISABLE);
		p.Btn_sno_select_all.putMode(p, SRCH_DEL_NRML, MCMode.DISABLE);
		p.Btn_sno_deselect_all.putMode(p, SRCH_DEL_NRML, MCMode.DISABLE);
		p.Btn_sprt_sno.putMode(p, SRCH_DEL_NRML, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL_NRML, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL_NRML, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_DEL_NRML, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_DEL_NRML, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_DEL_NRML, MCMode.DISABLE);
		p.Btn_upd_nrml.putMode(p, SRCH_DEL_NRML, MCMode.DISABLE);
		p.Btn_upd_prcd.putMode(p, SRCH_DEL_NRML, MCMode.INVISIBLE);
		p.Btn_del_nrml.putMode(p, SRCH_DEL_NRML, MCMode.DISABLE);
		p.Btn_del_prcd.putMode(p, SRCH_DEL_NRML, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL_NRML]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__NRML_EastBtn(MSBCP_RqmtReg p){

	}

	/**
	 * [DEL_NRML]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NRML_ScreenOpe(MSBCP_RqmtReg p){

	}

	/**
	 * [DEL_NRML]ステータスの[RqmtTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NRML_RqmtTyp(MSBCP_RqmtReg p){

	}

	/**
	 * [DEL_NRML]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NRML_Top(MSBCP_RqmtReg p){

	}

	/**
	 * [DEL_NRML]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NRML_Fold(MSBCP_RqmtReg p){

	}

	/**
	 * [DEL_NRML]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NRML_Tab1(MSBCP_RqmtReg p){

	}

	/**
	 * [DEL_NRML]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NRML_Tab2(MSBCP_RqmtReg p){

	}

	/**
	 * [DEL_NRML]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NRML_Cnd(MSBCP_RqmtReg p){
		p.Cnd_ope_Group.putMode(p, DEL_NRML, MCMode.REQUIRED);
		p.Cnd_mrp_typ_r_Group.putMode(p, DEL_NRML, MCMode.REQUIRED);
		p.Cnd_due_dt_fr.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_due_dt_to.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL_NRML, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL_NRML, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(DEL_NRML, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqmt_no.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_fix_flg.putMode(p, DEL_NRML, MCMode.REQUIRED);
		p.Cnd_rqmt_gnrt_typ.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_rqmt_gnrt_typ_nm.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.Cnd_rqmt_typ.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_rqmt_typ_nm.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL_NRML, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [DEL_NRML]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NRML_Cnd2(MSBCP_RqmtReg p){

	}

	/**
	 * [DEL_NRML]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NRML_Ctrl(MSBCP_RqmtReg p){

	}

	/**
	 * [DEL_NRML]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NRML_RPnl(MSBCP_RqmtReg p){
		p.RPnl_dwnld.putMode(p, DEL_NRML, MCMode.ENABLE);

	}

	/**
	 * [DEL_NRML]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NRML_Rslt(MSBCP_RqmtReg p){
		p.columnRslt_check.putMode(p, DEL_NRML, MCMode.REQUIRED);
		p.columnRslt_sno_sprt_flg.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL_NRML, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.Rslt_rqmt_qty_p_PPanel.putStatus(DEL_NRML, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_cd.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno1_num_typ.putMode(p, DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno2_num_typ.putMode(p, DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno3_num_typ.putMode(p, DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno4_num_typ.putMode(p, DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno1_flg.putMode(p, DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno2_flg.putMode(p, DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno3_flg.putMode(p, DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno4_flg.putMode(p, DEL_NRML, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(DEL_NRML, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ_nm.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ_nm.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL_NRML, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(DEL_NRML, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, DEL_NRML, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL_NRML, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_NRML]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NRML_Btn(MSBCP_RqmtReg p){
		p.Btn_open_MSBCP0070.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Btn_open_MSBCP0080.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Btn_sno_select_all.putMode(p, DEL_NRML, MCMode.DISABLE);
		p.Btn_sno_deselect_all.putMode(p, DEL_NRML, MCMode.DISABLE);
		p.Btn_sprt_sno.putMode(p, DEL_NRML, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL_NRML, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL_NRML, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL_NRML, MCMode.DISABLE);
		p.Btn_upd_nrml.putMode(p, DEL_NRML, MCMode.DISABLE);
		p.Btn_upd_prcd.putMode(p, DEL_NRML, MCMode.INVISIBLE);
		p.Btn_del_nrml.putMode(p, DEL_NRML, MCMode.ENABLE);
		p.Btn_del_prcd.putMode(p, DEL_NRML, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_NRML]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NRML_EastBtn(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_NRML]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NRML_ScreenOpe(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_NRML]ステータスの[RqmtTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NRML_RqmtTyp(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_NRML]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NRML_Top(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_NRML]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NRML_Fold(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_NRML]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NRML_Tab1(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_NRML]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NRML_Tab2(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_NRML]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NRML_Cnd(MSBCP_RqmtReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_NRML, MCMode.REQUIRED);
		p.Cnd_mrp_typ_r_Group.putMode(p, SRCH_NRML, MCMode.REQUIRED);
		p.Cnd_due_dt_fr.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_due_dt_to.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_NRML, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_NRML, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_NRML, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqmt_no.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_fix_flg.putMode(p, SRCH_NRML, MCMode.REQUIRED);
		p.Cnd_rqmt_gnrt_typ.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_rqmt_gnrt_typ_nm.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.Cnd_rqmt_typ.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_rqmt_typ_nm.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_NRML, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_NRML, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_NRML]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NRML_Cnd2(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_NRML]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NRML_Ctrl(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_NRML]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NRML_RPnl(MSBCP_RqmtReg p){
		p.RPnl_dwnld.putMode(p, SRCH_NRML, MCMode.ENABLE);

	}

	/**
	 * [SRCH_NRML]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NRML_Rslt(MSBCP_RqmtReg p){
		p.columnRslt_check.putMode(p, SRCH_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno_sprt_flg.putMode(p, SRCH_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_no.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_NRML, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.Rslt_rqmt_qty_p_PPanel.putStatus(SRCH_NRML, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_NRML, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno1_num_typ.putMode(p, SRCH_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno2_num_typ.putMode(p, SRCH_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno3_num_typ.putMode(p, SRCH_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno4_num_typ.putMode(p, SRCH_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno1_flg.putMode(p, SRCH_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno2_flg.putMode(p, SRCH_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno3_flg.putMode(p, SRCH_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno4_flg.putMode(p, SRCH_NRML, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_NRML, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ_nm.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ_nm.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_NRML, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_NRML, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_NRML, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_NRML, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_NRML]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NRML_Btn(MSBCP_RqmtReg p){
		p.Btn_open_MSBCP0070.putMode(p, SRCH_NRML, MCMode.DISABLE);
		p.Btn_open_MSBCP0080.putMode(p, SRCH_NRML, MCMode.DISABLE);
		p.Btn_sno_select_all.putMode(p, SRCH_NRML, MCMode.DISABLE);
		p.Btn_sno_deselect_all.putMode(p, SRCH_NRML, MCMode.DISABLE);
		p.Btn_sprt_sno.putMode(p, SRCH_NRML, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_NRML, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_NRML, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_NRML, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_NRML, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_NRML, MCMode.DISABLE);
		p.Btn_upd_nrml.putMode(p, SRCH_NRML, MCMode.DISABLE);
		p.Btn_upd_prcd.putMode(p, SRCH_NRML, MCMode.INVISIBLE);
		p.Btn_del_nrml.putMode(p, SRCH_NRML, MCMode.DISABLE);
		p.Btn_del_prcd.putMode(p, SRCH_NRML, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_NRML]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__NRML_EastBtn(MSBCP_RqmtReg p){

	}

	/**
	 * [REF_NRML]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__NRML_ScreenOpe(MSBCP_RqmtReg p){

	}

	/**
	 * [REF_NRML]ステータスの[RqmtTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF__NRML_RqmtTyp(MSBCP_RqmtReg p){

	}

	/**
	 * [REF_NRML]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__NRML_Top(MSBCP_RqmtReg p){

	}

	/**
	 * [REF_NRML]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__NRML_Fold(MSBCP_RqmtReg p){

	}

	/**
	 * [REF_NRML]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__NRML_Tab1(MSBCP_RqmtReg p){

	}

	/**
	 * [REF_NRML]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__NRML_Tab2(MSBCP_RqmtReg p){

	}

	/**
	 * [REF_NRML]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__NRML_Cnd(MSBCP_RqmtReg p){
		p.Cnd_ope_Group.putMode(p, REF_NRML, MCMode.REQUIRED);
		p.Cnd_mrp_typ_r_Group.putMode(p, REF_NRML, MCMode.REQUIRED);
		p.Cnd_due_dt_fr.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_due_dt_to.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_NRML, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_NRML, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(REF_NRML, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqmt_no.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_fix_flg.putMode(p, REF_NRML, MCMode.REQUIRED);
		p.Cnd_rqmt_gnrt_typ.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_rqmt_gnrt_typ_nm.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.Cnd_rqmt_typ.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_rqmt_typ_nm.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_NRML, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_NRML]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF__NRML_Cnd2(MSBCP_RqmtReg p){

	}

	/**
	 * [REF_NRML]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__NRML_Ctrl(MSBCP_RqmtReg p){

	}

	/**
	 * [REF_NRML]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__NRML_RPnl(MSBCP_RqmtReg p){
		p.RPnl_dwnld.putMode(p, REF_NRML, MCMode.ENABLE);

	}

	/**
	 * [REF_NRML]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__NRML_Rslt(MSBCP_RqmtReg p){
		p.columnRslt_check.putMode(p, REF_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno_sprt_flg.putMode(p, REF_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_no.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_NRML, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.Rslt_rqmt_qty_p_PPanel.putStatus(REF_NRML, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, REF_NRML, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_cd.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, REF_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, REF_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, REF_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, REF_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno1_num_typ.putMode(p, REF_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno2_num_typ.putMode(p, REF_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno3_num_typ.putMode(p, REF_NRML, MCMode.INVISIBLE);
		p.columnRslt_sno4_num_typ.putMode(p, REF_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno1_flg.putMode(p, REF_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno2_flg.putMode(p, REF_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno3_flg.putMode(p, REF_NRML, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno4_flg.putMode(p, REF_NRML, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(REF_NRML, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ_nm.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ_nm.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF_NRML, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_NRML, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, REF_NRML, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_NRML, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_NRML, MCMode.READ_ONLY);

	}

	/**
	 * [REF_NRML]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__NRML_Btn(MSBCP_RqmtReg p){
		p.Btn_open_MSBCP0070.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Btn_open_MSBCP0080.putMode(p, REF_NRML, MCMode.ENABLE);
		p.Btn_sno_select_all.putMode(p, REF_NRML, MCMode.DISABLE);
		p.Btn_sno_deselect_all.putMode(p, REF_NRML, MCMode.DISABLE);
		p.Btn_sprt_sno.putMode(p, REF_NRML, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF_NRML, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_NRML, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF_NRML, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF_NRML, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF_NRML, MCMode.DISABLE);
		p.Btn_upd_nrml.putMode(p, REF_NRML, MCMode.DISABLE);
		p.Btn_upd_prcd.putMode(p, REF_NRML, MCMode.INVISIBLE);
		p.Btn_del_nrml.putMode(p, REF_NRML, MCMode.DISABLE);
		p.Btn_del_prcd.putMode(p, REF_NRML, MCMode.INVISIBLE);

	}

	/**
	 * [REF_NRML]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__NRML_EastBtn(MSBCP_RqmtReg p){

	}

	/**
	 * [UPD_PRCD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRCD_ScreenOpe(MSBCP_RqmtReg p){

	}

	/**
	 * [UPD_PRCD]ステータスの[RqmtTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRCD_RqmtTyp(MSBCP_RqmtReg p){

	}

	/**
	 * [UPD_PRCD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRCD_Top(MSBCP_RqmtReg p){

	}

	/**
	 * [UPD_PRCD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRCD_Fold(MSBCP_RqmtReg p){

	}

	/**
	 * [UPD_PRCD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRCD_Tab1(MSBCP_RqmtReg p){

	}

	/**
	 * [UPD_PRCD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRCD_Tab2(MSBCP_RqmtReg p){

	}

	/**
	 * [UPD_PRCD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRCD_Cnd(MSBCP_RqmtReg p){
		p.Cnd_ope_Group.putMode(p, UPD_PRCD, MCMode.REQUIRED);
		p.Cnd_mrp_typ_r_Group.putMode(p, UPD_PRCD, MCMode.REQUIRED);
		p.Cnd_due_dt_fr.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_due_dt_to.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_PRCD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD_PRCD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(UPD_PRCD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqmt_no.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_fix_flg.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.Cnd_rqmt_gnrt_typ.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_rqmt_gnrt_typ_nm.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.Cnd_rqmt_typ.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_rqmt_typ_nm.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD_PRCD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD_PRCD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRCD_Cnd2(MSBCP_RqmtReg p){

	}

	/**
	 * [UPD_PRCD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRCD_Ctrl(MSBCP_RqmtReg p){

	}

	/**
	 * [UPD_PRCD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRCD_RPnl(MSBCP_RqmtReg p){
		p.RPnl_dwnld.putMode(p, UPD_PRCD, MCMode.ENABLE);

	}

	/**
	 * [UPD_PRCD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRCD_Rslt(MSBCP_RqmtReg p){
		p.columnRslt_check.putMode(p, UPD_PRCD, MCMode.REQUIRED);
		p.columnRslt_sno_sprt_flg.putMode(p, UPD_PRCD, MCMode.REQUIRED);
		p.columnRslt_rqmt_no.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, UPD_PRCD, MCMode.REQUIRED);
		p.Rslt_itm_p_PPanel.putStatus(UPD_PRCD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnRslt_strg_loc_cd.putMode(p, UPD_PRCD, MCMode.REQUIRED);
		p.columnRslt_strg_loc_nm.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.Rslt_rqmt_qty_p_PPanel.putStatus(UPD_PRCD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_unit_cd.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, UPD_PRCD, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_cd.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.columnRslt_mfg_loc_nm.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.columnRslt_sppl_nm.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.columnRslt_rqst_loc_nm.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, UPD_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, UPD_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, UPD_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, UPD_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno1_num_typ.putMode(p, UPD_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno2_num_typ.putMode(p, UPD_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno3_num_typ.putMode(p, UPD_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno4_num_typ.putMode(p, UPD_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno1_flg.putMode(p, UPD_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno2_flg.putMode(p, UPD_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno3_flg.putMode(p, UPD_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno4_flg.putMode(p, UPD_PRCD, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(UPD_PRCD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.columnRslt_fix_flg.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ_nm.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.columnRslt_rqmt_typ_nm.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.columnRslt_itm_typ.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_PRCD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD_PRCD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, UPD_PRCD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_PRCD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_PRCD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRCD_Btn(MSBCP_RqmtReg p){
		p.Btn_open_MSBCP0070.putMode(p, UPD_PRCD, MCMode.DISABLE);
		p.Btn_open_MSBCP0080.putMode(p, UPD_PRCD, MCMode.DISABLE);
		p.Btn_sno_select_all.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Btn_sno_deselect_all.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Btn_sprt_sno.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Btn_upd_nrml.putMode(p, UPD_PRCD, MCMode.INVISIBLE);
		p.Btn_upd_prcd.putMode(p, UPD_PRCD, MCMode.ENABLE);
		p.Btn_del_nrml.putMode(p, UPD_PRCD, MCMode.INVISIBLE);
		p.Btn_del_prcd.putMode(p, UPD_PRCD, MCMode.DISABLE);

	}

	/**
	 * [UPD_PRCD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__PRCD_EastBtn(MSBCP_RqmtReg p){

	}

	/**
	 * [FIX_U_PRCD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__PRCD_ScreenOpe(MSBCP_RqmtReg p){

	}

	/**
	 * [FIX_U_PRCD]ステータスの[RqmtTyp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__PRCD_RqmtTyp(MSBCP_RqmtReg p){

	}

	/**
	 * [FIX_U_PRCD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__PRCD_Top(MSBCP_RqmtReg p){

	}

	/**
	 * [FIX_U_PRCD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__PRCD_Fold(MSBCP_RqmtReg p){

	}

	/**
	 * [FIX_U_PRCD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__PRCD_Tab1(MSBCP_RqmtReg p){

	}

	/**
	 * [FIX_U_PRCD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__PRCD_Tab2(MSBCP_RqmtReg p){

	}

	/**
	 * [FIX_U_PRCD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__PRCD_Cnd(MSBCP_RqmtReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U_PRCD, MCMode.REQUIRED);
		p.Cnd_mrp_typ_r_Group.putMode(p, FIX_U_PRCD, MCMode.REQUIRED);
		p.Cnd_due_dt_fr.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_due_dt_to.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_U_PRCD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_U_PRCD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(FIX_U_PRCD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqmt_no.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_fix_flg.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.Cnd_rqmt_gnrt_typ.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_rqmt_gnrt_typ_nm.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.Cnd_rqmt_typ.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_rqmt_typ_nm.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_U_PRCD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_U_PRCD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [FIX_U_PRCD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__PRCD_Cnd2(MSBCP_RqmtReg p){

	}

	/**
	 * [FIX_U_PRCD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__PRCD_Ctrl(MSBCP_RqmtReg p){

	}

	/**
	 * [FIX_U_PRCD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__PRCD_RPnl(MSBCP_RqmtReg p){
		p.RPnl_dwnld.putMode(p, FIX_U_PRCD, MCMode.ENABLE);

	}

	/**
	 * [FIX_U_PRCD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__PRCD_Rslt(MSBCP_RqmtReg p){
		p.columnRslt_check.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sno_sprt_flg.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_U_PRCD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.Rslt_rqmt_qty_p_PPanel.putStatus(FIX_U_PRCD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, FIX_U_PRCD, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_cd.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, FIX_U_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, FIX_U_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, FIX_U_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, FIX_U_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno1_num_typ.putMode(p, FIX_U_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno2_num_typ.putMode(p, FIX_U_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno3_num_typ.putMode(p, FIX_U_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno4_num_typ.putMode(p, FIX_U_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno1_flg.putMode(p, FIX_U_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno2_flg.putMode(p, FIX_U_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno3_flg.putMode(p, FIX_U_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno4_flg.putMode(p, FIX_U_PRCD, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(FIX_U_PRCD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ_nm.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ_nm.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_U_PRCD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(FIX_U_PRCD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, FIX_U_PRCD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_U_PRCD, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U_PRCD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__PRCD_Btn(MSBCP_RqmtReg p){
		p.Btn_open_MSBCP0070.putMode(p, FIX_U_PRCD, MCMode.DISABLE);
		p.Btn_open_MSBCP0080.putMode(p, FIX_U_PRCD, MCMode.DISABLE);
		p.Btn_sno_select_all.putMode(p, FIX_U_PRCD, MCMode.DISABLE);
		p.Btn_sno_deselect_all.putMode(p, FIX_U_PRCD, MCMode.DISABLE);
		p.Btn_sprt_sno.putMode(p, FIX_U_PRCD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_U_PRCD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U_PRCD, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U_PRCD, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U_PRCD, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U_PRCD, MCMode.DISABLE);
		p.Btn_upd_nrml.putMode(p, FIX_U_PRCD, MCMode.INVISIBLE);
		p.Btn_upd_prcd.putMode(p, FIX_U_PRCD, MCMode.DISABLE);
		p.Btn_del_nrml.putMode(p, FIX_U_PRCD, MCMode.INVISIBLE);
		p.Btn_del_prcd.putMode(p, FIX_U_PRCD, MCMode.DISABLE);

	}

	/**
	 * [FIX_U_PRCD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__PRCD_EastBtn(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_DEL_PRCD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__PRCD_ScreenOpe(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_DEL_PRCD]ステータスの[RqmtTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__PRCD_RqmtTyp(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_DEL_PRCD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__PRCD_Top(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_DEL_PRCD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__PRCD_Fold(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_DEL_PRCD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__PRCD_Tab1(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_DEL_PRCD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__PRCD_Tab2(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_DEL_PRCD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__PRCD_Cnd(MSBCP_RqmtReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL_PRCD, MCMode.REQUIRED);
		p.Cnd_mrp_typ_r_Group.putMode(p, SRCH_DEL_PRCD, MCMode.REQUIRED);
		p.Cnd_due_dt_fr.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_due_dt_to.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL_PRCD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL_PRCD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL_PRCD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqmt_no.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_fix_flg.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.Cnd_rqmt_gnrt_typ.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_rqmt_gnrt_typ_nm.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.Cnd_rqmt_typ.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_rqmt_typ_nm.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DEL_PRCD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DEL_PRCD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__PRCD_Cnd2(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_DEL_PRCD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__PRCD_Ctrl(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_DEL_PRCD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__PRCD_RPnl(MSBCP_RqmtReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL_PRCD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL_PRCD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__PRCD_Rslt(MSBCP_RqmtReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sno_sprt_flg.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL_PRCD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.Rslt_rqmt_qty_p_PPanel.putStatus(SRCH_DEL_PRCD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno1_num_typ.putMode(p, SRCH_DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno2_num_typ.putMode(p, SRCH_DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno3_num_typ.putMode(p, SRCH_DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno4_num_typ.putMode(p, SRCH_DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno1_flg.putMode(p, SRCH_DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno2_flg.putMode(p, SRCH_DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno3_flg.putMode(p, SRCH_DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno4_flg.putMode(p, SRCH_DEL_PRCD, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL_PRCD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ_nm.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ_nm.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL_PRCD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_DEL_PRCD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DEL_PRCD, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL_PRCD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__PRCD_Btn(MSBCP_RqmtReg p){
		p.Btn_open_MSBCP0070.putMode(p, SRCH_DEL_PRCD, MCMode.DISABLE);
		p.Btn_open_MSBCP0080.putMode(p, SRCH_DEL_PRCD, MCMode.DISABLE);
		p.Btn_sno_select_all.putMode(p, SRCH_DEL_PRCD, MCMode.DISABLE);
		p.Btn_sno_deselect_all.putMode(p, SRCH_DEL_PRCD, MCMode.DISABLE);
		p.Btn_sprt_sno.putMode(p, SRCH_DEL_PRCD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL_PRCD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL_PRCD, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_DEL_PRCD, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_DEL_PRCD, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_DEL_PRCD, MCMode.DISABLE);
		p.Btn_upd_nrml.putMode(p, SRCH_DEL_PRCD, MCMode.INVISIBLE);
		p.Btn_upd_prcd.putMode(p, SRCH_DEL_PRCD, MCMode.DISABLE);
		p.Btn_del_nrml.putMode(p, SRCH_DEL_PRCD, MCMode.INVISIBLE);
		p.Btn_del_prcd.putMode(p, SRCH_DEL_PRCD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL_PRCD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__PRCD_EastBtn(MSBCP_RqmtReg p){

	}

	/**
	 * [DEL_PRCD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__PRCD_ScreenOpe(MSBCP_RqmtReg p){

	}

	/**
	 * [DEL_PRCD]ステータスの[RqmtTyp]ブロックのモードの設定
	 */
	protected static void statusInitDEL__PRCD_RqmtTyp(MSBCP_RqmtReg p){

	}

	/**
	 * [DEL_PRCD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL__PRCD_Top(MSBCP_RqmtReg p){

	}

	/**
	 * [DEL_PRCD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL__PRCD_Fold(MSBCP_RqmtReg p){

	}

	/**
	 * [DEL_PRCD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL__PRCD_Tab1(MSBCP_RqmtReg p){

	}

	/**
	 * [DEL_PRCD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__PRCD_Tab2(MSBCP_RqmtReg p){

	}

	/**
	 * [DEL_PRCD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__PRCD_Cnd(MSBCP_RqmtReg p){
		p.Cnd_ope_Group.putMode(p, DEL_PRCD, MCMode.REQUIRED);
		p.Cnd_mrp_typ_r_Group.putMode(p, DEL_PRCD, MCMode.REQUIRED);
		p.Cnd_due_dt_fr.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_due_dt_to.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL_PRCD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL_PRCD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(DEL_PRCD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqmt_no.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_fix_flg.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.Cnd_rqmt_gnrt_typ.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_rqmt_gnrt_typ_nm.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.Cnd_rqmt_typ.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_rqmt_typ_nm.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL_PRCD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [DEL_PRCD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__PRCD_Cnd2(MSBCP_RqmtReg p){

	}

	/**
	 * [DEL_PRCD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__PRCD_Ctrl(MSBCP_RqmtReg p){

	}

	/**
	 * [DEL_PRCD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__PRCD_RPnl(MSBCP_RqmtReg p){
		p.RPnl_dwnld.putMode(p, DEL_PRCD, MCMode.ENABLE);

	}

	/**
	 * [DEL_PRCD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__PRCD_Rslt(MSBCP_RqmtReg p){
		p.columnRslt_check.putMode(p, DEL_PRCD, MCMode.REQUIRED);
		p.columnRslt_sno_sprt_flg.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL_PRCD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.Rslt_rqmt_qty_p_PPanel.putStatus(DEL_PRCD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_cd.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno1_num_typ.putMode(p, DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno2_num_typ.putMode(p, DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno3_num_typ.putMode(p, DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno4_num_typ.putMode(p, DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno1_flg.putMode(p, DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno2_flg.putMode(p, DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno3_flg.putMode(p, DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno4_flg.putMode(p, DEL_PRCD, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(DEL_PRCD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ_nm.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ_nm.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL_PRCD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(DEL_PRCD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, DEL_PRCD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL_PRCD, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_PRCD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__PRCD_Btn(MSBCP_RqmtReg p){
		p.Btn_open_MSBCP0070.putMode(p, DEL_PRCD, MCMode.DISABLE);
		p.Btn_open_MSBCP0080.putMode(p, DEL_PRCD, MCMode.DISABLE);
		p.Btn_sno_select_all.putMode(p, DEL_PRCD, MCMode.DISABLE);
		p.Btn_sno_deselect_all.putMode(p, DEL_PRCD, MCMode.DISABLE);
		p.Btn_sprt_sno.putMode(p, DEL_PRCD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL_PRCD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL_PRCD, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL_PRCD, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL_PRCD, MCMode.DISABLE);
		p.Btn_upd_nrml.putMode(p, DEL_PRCD, MCMode.INVISIBLE);
		p.Btn_upd_prcd.putMode(p, DEL_PRCD, MCMode.DISABLE);
		p.Btn_del_nrml.putMode(p, DEL_PRCD, MCMode.INVISIBLE);
		p.Btn_del_prcd.putMode(p, DEL_PRCD, MCMode.ENABLE);

	}

	/**
	 * [DEL_PRCD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__PRCD_EastBtn(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_PRCD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRCD_ScreenOpe(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_PRCD]ステータスの[RqmtTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRCD_RqmtTyp(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_PRCD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRCD_Top(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_PRCD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRCD_Fold(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_PRCD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRCD_Tab1(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_PRCD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRCD_Tab2(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_PRCD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRCD_Cnd(MSBCP_RqmtReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_PRCD, MCMode.REQUIRED);
		p.Cnd_mrp_typ_r_Group.putMode(p, SRCH_PRCD, MCMode.REQUIRED);
		p.Cnd_due_dt_fr.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_due_dt_to.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_PRCD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_PRCD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_PRCD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqmt_no.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_fix_flg.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.Cnd_rqmt_gnrt_typ.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_rqmt_gnrt_typ_nm.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.Cnd_rqmt_typ.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_rqmt_typ_nm.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_PRCD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_PRCD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_PRCD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRCD_Cnd2(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_PRCD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRCD_Ctrl(MSBCP_RqmtReg p){

	}

	/**
	 * [SRCH_PRCD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRCD_RPnl(MSBCP_RqmtReg p){
		p.RPnl_dwnld.putMode(p, SRCH_PRCD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_PRCD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRCD_Rslt(MSBCP_RqmtReg p){
		p.columnRslt_check.putMode(p, SRCH_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno_sprt_flg.putMode(p, SRCH_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_no.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_PRCD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.Rslt_rqmt_qty_p_PPanel.putStatus(SRCH_PRCD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_PRCD, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno1_num_typ.putMode(p, SRCH_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno2_num_typ.putMode(p, SRCH_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno3_num_typ.putMode(p, SRCH_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno4_num_typ.putMode(p, SRCH_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno1_flg.putMode(p, SRCH_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno2_flg.putMode(p, SRCH_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno3_flg.putMode(p, SRCH_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno4_flg.putMode(p, SRCH_PRCD, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_PRCD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ_nm.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ_nm.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_PRCD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_PRCD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_PRCD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_PRCD, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_PRCD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRCD_Btn(MSBCP_RqmtReg p){
		p.Btn_open_MSBCP0070.putMode(p, SRCH_PRCD, MCMode.DISABLE);
		p.Btn_open_MSBCP0080.putMode(p, SRCH_PRCD, MCMode.DISABLE);
		p.Btn_sno_select_all.putMode(p, SRCH_PRCD, MCMode.DISABLE);
		p.Btn_sno_deselect_all.putMode(p, SRCH_PRCD, MCMode.DISABLE);
		p.Btn_sprt_sno.putMode(p, SRCH_PRCD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_PRCD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_PRCD, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_PRCD, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_PRCD, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_PRCD, MCMode.DISABLE);
		p.Btn_upd_nrml.putMode(p, SRCH_PRCD, MCMode.INVISIBLE);
		p.Btn_upd_prcd.putMode(p, SRCH_PRCD, MCMode.DISABLE);
		p.Btn_del_nrml.putMode(p, SRCH_PRCD, MCMode.INVISIBLE);
		p.Btn_del_prcd.putMode(p, SRCH_PRCD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_PRCD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__PRCD_EastBtn(MSBCP_RqmtReg p){

	}

	/**
	 * [REF_PRCD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__PRCD_ScreenOpe(MSBCP_RqmtReg p){

	}

	/**
	 * [REF_PRCD]ステータスの[RqmtTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF__PRCD_RqmtTyp(MSBCP_RqmtReg p){

	}

	/**
	 * [REF_PRCD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__PRCD_Top(MSBCP_RqmtReg p){

	}

	/**
	 * [REF_PRCD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__PRCD_Fold(MSBCP_RqmtReg p){

	}

	/**
	 * [REF_PRCD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__PRCD_Tab1(MSBCP_RqmtReg p){

	}

	/**
	 * [REF_PRCD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__PRCD_Tab2(MSBCP_RqmtReg p){

	}

	/**
	 * [REF_PRCD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__PRCD_Cnd(MSBCP_RqmtReg p){
		p.Cnd_ope_Group.putMode(p, REF_PRCD, MCMode.REQUIRED);
		p.Cnd_mrp_typ_r_Group.putMode(p, REF_PRCD, MCMode.REQUIRED);
		p.Cnd_due_dt_fr.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_due_dt_to.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_PRCD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_PRCD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(REF_PRCD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_rqmt_no.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_fix_flg.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.Cnd_rqmt_gnrt_typ.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_rqmt_gnrt_typ_nm.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.Cnd_rqmt_typ.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_rqmt_typ_nm.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.Cnd_intr_rmrks.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF_PRCD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF_PRCD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF_PRCD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF__PRCD_Cnd2(MSBCP_RqmtReg p){

	}

	/**
	 * [REF_PRCD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__PRCD_Ctrl(MSBCP_RqmtReg p){

	}

	/**
	 * [REF_PRCD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__PRCD_RPnl(MSBCP_RqmtReg p){
		p.RPnl_dwnld.putMode(p, REF_PRCD, MCMode.ENABLE);

	}

	/**
	 * [REF_PRCD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF__PRCD_Rslt(MSBCP_RqmtReg p){
		p.columnRslt_check.putMode(p, REF_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno_sprt_flg.putMode(p, REF_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_no.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_due_dt.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF_PRCD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_site_cd.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_site_nm.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.Rslt_rqmt_qty_p_PPanel.putStatus(REF_PRCD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, REF_PRCD, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_cd.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sno1_mng_typ.putMode(p, REF_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, REF_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, REF_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, REF_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno1_num_typ.putMode(p, REF_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno2_num_typ.putMode(p, REF_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno3_num_typ.putMode(p, REF_PRCD, MCMode.INVISIBLE);
		p.columnRslt_sno4_num_typ.putMode(p, REF_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno1_flg.putMode(p, REF_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno2_flg.putMode(p, REF_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno3_flg.putMode(p, REF_PRCD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno4_flg.putMode(p, REF_PRCD, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(REF_PRCD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_fix_flg.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_gnrt_typ_nm.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_typ_nm.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF_PRCD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF_PRCD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, REF_PRCD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF_PRCD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF_PRCD, MCMode.READ_ONLY);

	}

	/**
	 * [REF_PRCD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__PRCD_Btn(MSBCP_RqmtReg p){
		p.Btn_open_MSBCP0070.putMode(p, REF_PRCD, MCMode.DISABLE);
		p.Btn_open_MSBCP0080.putMode(p, REF_PRCD, MCMode.DISABLE);
		p.Btn_sno_select_all.putMode(p, REF_PRCD, MCMode.DISABLE);
		p.Btn_sno_deselect_all.putMode(p, REF_PRCD, MCMode.DISABLE);
		p.Btn_sprt_sno.putMode(p, REF_PRCD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF_PRCD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF_PRCD, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF_PRCD, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF_PRCD, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF_PRCD, MCMode.DISABLE);
		p.Btn_upd_nrml.putMode(p, REF_PRCD, MCMode.INVISIBLE);
		p.Btn_upd_prcd.putMode(p, REF_PRCD, MCMode.DISABLE);
		p.Btn_del_nrml.putMode(p, REF_PRCD, MCMode.INVISIBLE);
		p.Btn_del_prcd.putMode(p, REF_PRCD, MCMode.DISABLE);

	}

	/**
	 * [REF_PRCD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__PRCD_EastBtn(MSBCP_RqmtReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return UPD_NRML;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBCP_RqmtReg_MC.setTableConfigRslt((MSBCP_RqmtReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBCP_RqmtReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_sno_sprt_flg.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.sno_sprt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno_sprt_flg);
		p.columnRslt_rqmt_no.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.rqmt_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqmt_no);
		p.columnRslt_due_dt.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.due_dt_META);
		p.columnRslt_due_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_due_dt);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub1, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3, p.columnRslt_unit_cd, p.columnRslt_unit_nm, p.columnRslt_dec_place, p.columnRslt_sno1_mng_typ, p.columnRslt_sno2_mng_typ, p.columnRslt_sno3_mng_typ, p.columnRslt_sno4_mng_typ, p.columnRslt_sno1_num_typ, p.columnRslt_sno2_num_typ, p.columnRslt_sno3_num_typ, p.columnRslt_sno4_num_typ, p.columnRslt_rqmt_sno1_flg, p.columnRslt_rqmt_sno2_flg, p.columnRslt_rqmt_sno3_flg, p.columnRslt_rqmt_sno4_flg);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3, p.columnRslt_unit_cd, p.columnRslt_unit_nm, p.columnRslt_dec_place, p.columnRslt_sno1_mng_typ, p.columnRslt_sno2_mng_typ, p.columnRslt_sno3_mng_typ, p.columnRslt_sno4_mng_typ, p.columnRslt_sno1_num_typ, p.columnRslt_sno2_num_typ, p.columnRslt_sno3_num_typ, p.columnRslt_sno4_num_typ, p.columnRslt_rqmt_sno1_flg, p.columnRslt_rqmt_sno2_flg, p.columnRslt_rqmt_sno3_flg, p.columnRslt_rqmt_sno4_flg);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub3, p.columnRslt_unit_cd, p.columnRslt_unit_nm, p.columnRslt_dec_place, p.columnRslt_sno1_mng_typ, p.columnRslt_sno2_mng_typ, p.columnRslt_sno3_mng_typ, p.columnRslt_sno4_mng_typ, p.columnRslt_sno1_num_typ, p.columnRslt_sno2_num_typ, p.columnRslt_sno3_num_typ, p.columnRslt_sno4_num_typ, p.columnRslt_rqmt_sno1_flg, p.columnRslt_rqmt_sno2_flg, p.columnRslt_rqmt_sno3_flg, p.columnRslt_rqmt_sno4_flg);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_unit_cd, p.columnRslt_unit_nm, p.columnRslt_dec_place, p.columnRslt_sno1_mng_typ, p.columnRslt_sno2_mng_typ, p.columnRslt_sno3_mng_typ, p.columnRslt_sno4_mng_typ, p.columnRslt_sno1_num_typ, p.columnRslt_sno2_num_typ, p.columnRslt_sno3_num_typ, p.columnRslt_sno4_num_typ, p.columnRslt_rqmt_sno1_flg, p.columnRslt_rqmt_sno2_flg, p.columnRslt_rqmt_sno3_flg, p.columnRslt_rqmt_sno4_flg);
		p.columnRslt_strg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.strg_loc_cd_META);
		p.columnRslt_strg_loc_cd.setListType(MCListType.STRICT);
		p.columnRslt_strg_loc_cd.addLinkBeans(p.columnRslt_strg_loc_nm,p.columnRslt_site_cd,p.columnRslt_site_nm,p.columnRslt_wg_cd,p.columnRslt_wg_nm,p.columnRslt_strg_loc_grp_cd,p.columnRslt_strg_loc_grp_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_cd);
		p.columnRslt_strg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.strg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_nm);
		p.columnRslt_site_cd.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_cd);
		p.columnRslt_site_nm.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_strg_loc_grp_cd.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.strg_loc_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_grp_cd);
		p.columnRslt_strg_loc_grp_nm.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.strg_loc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_grp_nm);
		p.RsltTable.addTable(p.Rslt_rqmt_qty_p_PPanel.QtyTable);
		p.columnRslt_unit_cd.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_cd);
		p.columnRslt_unit_nm.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_nm);
		p.columnRslt_dec_place.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dec_place);
		p.columnRslt_mfg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.mfg_loc_cd_META);
		p.columnRslt_mfg_loc_cd.addLinkBeans(p.columnRslt_mfg_loc_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_cd);
		p.columnRslt_mfg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.mfg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_nm);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.sppl_cd_META);
		p.columnRslt_sppl_cd.addLinkBeans(p.columnRslt_sppl_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.columnRslt_rqst_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.rqst_loc_cd_META);
		p.columnRslt_rqst_loc_cd.addLinkBeans(p.columnRslt_rqst_loc_nm,p.columnRslt_rqst_wg_cd,p.columnRslt_rqst_wg_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_loc_cd);
		p.columnRslt_rqst_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.rqst_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_loc_nm);
		p.columnRslt_rqst_wg_cd.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.rqst_wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_wg_cd);
		p.columnRslt_rqst_wg_nm.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.rqst_wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_wg_nm);
		p.columnRslt_sno1_mng_typ.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.sno1_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1_mng_typ);
		p.columnRslt_sno2_mng_typ.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.sno2_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2_mng_typ);
		p.columnRslt_sno3_mng_typ.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.sno3_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3_mng_typ);
		p.columnRslt_sno4_mng_typ.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.sno4_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4_mng_typ);
		p.columnRslt_sno1_num_typ.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.sno1_num_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1_num_typ);
		p.columnRslt_sno2_num_typ.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.sno2_num_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2_num_typ);
		p.columnRslt_sno3_num_typ.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.sno3_num_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3_num_typ);
		p.columnRslt_sno4_num_typ.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.sno4_num_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4_num_typ);
		p.columnRslt_rqmt_sno1_flg.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.rqmt_sno1_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqmt_sno1_flg);
		p.columnRslt_rqmt_sno2_flg.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.rqmt_sno2_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqmt_sno2_flg);
		p.columnRslt_rqmt_sno3_flg.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.rqmt_sno3_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqmt_sno3_flg);
		p.columnRslt_rqmt_sno4_flg.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.rqmt_sno4_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqmt_sno4_flg);
		p.RsltTable.addTable(p.Rslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRslt_fix_flg.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.fix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fix_flg);
		p.columnRslt_rqmt_gnrt_typ.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.rqmt_gnrt_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqmt_gnrt_typ);
		p.columnRslt_rqmt_gnrt_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.rqmt_gnrt_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqmt_gnrt_typ_nm);
		p.columnRslt_rqmt_typ.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.rqmt_typ_META);
		p.columnRslt_rqmt_typ.addLinkBeans(p.columnRslt_rqmt_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_rqmt_typ);
		p.columnRslt_rqmt_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.rqmt_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqmt_typ_nm);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBC.MSBCP0010.RsltR.upd_srv_req_no_META);
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
		Cnd_strg_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_strg_loc_grp_cd.getListConfig().setPutter(getCnd_strg_loc_grp_cd_ListPutter());
		Cnd_strg_loc_cd.getListConfig().setPutter(getCnd_strg_loc_cd_ListPutter());
		Cnd_mfg_loc_cd.getListConfig().setPutter(getCnd_mfg_loc_cd_ListPutter());
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_rqst_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rqst_wg_cd.getListConfig().setPutter(getCnd_rqst_wg_cd_ListPutter());
		Cnd_rqst_loc_cd.getListConfig().setPutter(getCnd_rqst_loc_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_rqmt_gnrt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rqmt_gnrt_typ.getListConfig().setPutter(getCnd_rqmt_gnrt_typ_ListPutter());
		Cnd_rqmt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rqmt_typ.getListConfig().setPutter(getCnd_rqmt_typ_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnRslt_strg_loc_cd.getListConfig().setPutter(getRslt_strg_loc_cd_ListPutter());
		columnRslt_mfg_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_mfg_loc_cd.getListConfig().setPutter(getRslt_mfg_loc_cd_ListPutter());
		columnRslt_sppl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_sppl_cd.getListConfig().setPutter(getRslt_sppl_cd_ListPutter());
		columnRslt_rqst_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_rqst_loc_cd.getListConfig().setPutter(getRslt_rqst_loc_cd_ListPutter());
		columnRslt_rqmt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_rqmt_typ.getListConfig().setPutter(getRslt_rqmt_typ_ListPutter());
	}

	/**
	 * この画面を[UPD_NRML]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_NRMLStatus() {
		status = UPD_NRML;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_U_NRML]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_U_NRMLStatus() {
		status = FIX_U_NRML;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_DEL_NRML]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DEL_NRMLStatus() {
		status = SRCH_DEL_NRML;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_NRML]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_NRMLStatus() {
		status = DEL_NRML;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_NRML]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_NRMLStatus() {
		status = SRCH_NRML;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_NRML]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_NRMLStatus() {
		status = REF_NRML;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_PRCD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_PRCDStatus() {
		status = UPD_PRCD;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_U_PRCD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_U_PRCDStatus() {
		status = FIX_U_PRCD;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_DEL_PRCD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DEL_PRCDStatus() {
		status = SRCH_DEL_PRCD;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_PRCD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_PRCDStatus() {
		status = DEL_PRCD;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_PRCD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_PRCDStatus() {
		status = SRCH_PRCD;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_PRCD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_PRCDStatus() {
		status = REF_PRCD;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (UPD_NRML.equals(status)) {
			setUPD_NRMLStatus();
		}
		else if (FIX_U_NRML.equals(status)) {
			setFIX_U_NRMLStatus();
		}
		else if (SRCH_DEL_NRML.equals(status)) {
			setSRCH_DEL_NRMLStatus();
		}
		else if (DEL_NRML.equals(status)) {
			setDEL_NRMLStatus();
		}
		else if (SRCH_NRML.equals(status)) {
			setSRCH_NRMLStatus();
		}
		else if (REF_NRML.equals(status)) {
			setREF_NRMLStatus();
		}
		else if (UPD_PRCD.equals(status)) {
			setUPD_PRCDStatus();
		}
		else if (FIX_U_PRCD.equals(status)) {
			setFIX_U_PRCDStatus();
		}
		else if (SRCH_DEL_PRCD.equals(status)) {
			setSRCH_DEL_PRCDStatus();
		}
		else if (DEL_PRCD.equals(status)) {
			setDEL_PRCDStatus();
		}
		else if (SRCH_PRCD.equals(status)) {
			setSRCH_PRCDStatus();
		}
		else if (REF_PRCD.equals(status)) {
			setREF_PRCDStatus();
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
	 * [Cnd_strg_loc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_strg_loc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_strg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_strg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_rqst_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqst_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgWg");
		return lp;
	}
	 
	/**
	 * [Cnd_rqst_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqst_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
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
	 * [Cnd_rqmt_gnrt_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqmt_gnrt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.RqmtGnrtTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_rqmt_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqmt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RqmtTyp");
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
	 * [Rslt_strg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_strg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Rslt_mfg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_mfg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlMfgLoc");
		return lp;
	}
	 
	/**
	 * [Rslt_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlSppl");
		return lp;
	}
	 
	/**
	 * [Rslt_rqst_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_rqst_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlRqstLoc");
		return lp;
	}
	 
	/**
	 * [Rslt_rqmt_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_rqmt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RqmtTyp");
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
		if(combo == Cnd_strg_loc_grp_cd) return getCnd_strg_loc_grp_cd(row, info);
		if(combo == Cnd_strg_loc_cd) return getCnd_strg_loc_cd(row, info);
		if(combo == Cnd_mfg_loc_cd) return getCnd_mfg_loc_cd(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_rqst_wg_cd) return getCnd_rqst_wg_cd(row, info);
		if(combo == Cnd_rqst_loc_cd) return getCnd_rqst_loc_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_rqmt_gnrt_typ) return getCnd_rqmt_gnrt_typ(row, info);
		if(combo == Cnd_rqmt_typ) return getCnd_rqmt_typ(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_cd) return getRslt_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub1) return getRslt_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub2) return getRslt_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub3) return getRslt_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnRslt_strg_loc_cd) return getRslt_strg_loc_cd(row, info);
		if(combo == columnRslt_mfg_loc_cd) return getRslt_mfg_loc_cd(row, info);
		if(combo == columnRslt_sppl_cd) return getRslt_sppl_cd(row, info);
		if(combo == columnRslt_rqst_loc_cd) return getRslt_rqst_loc_cd(row, info);
		if(combo == columnRslt_rqmt_typ) return getRslt_rqmt_typ(row, info);
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
		else if (ap == Btn_open_MSBCP0070) doBtn_open_MSBCP0070(info);
		else if (ap == Btn_open_MSBCP0080) doBtn_open_MSBCP0080(info);
		else if (ap == Btn_sno_select_all) doBtn_sno_select_all(info);
		else if (ap == Btn_sno_deselect_all) doBtn_sno_deselect_all(info);
		else if (ap == Btn_sprt_sno) doBtn_sprt_sno(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd_nrml) doBtn_upd_nrml(info);
		else if (ap == Btn_upd_prcd) doBtn_upd_prcd(info);
		else if (ap == Btn_del_nrml) doBtn_del_nrml(info);
		else if (ap == Btn_del_prcd) doBtn_del_prcd(info);
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
	 * [Btn]パネルの[open_MSBCP0070]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0070(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP0080]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0080(MCEventInfo info);

	/**
	 * [Btn]パネルの[sno_select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_sno_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[sno_deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_sno_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[sprt_sno]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_sprt_sno(MCEventInfo info);

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
	 * [Btn]パネルの[upd_nrml]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_nrml(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_prcd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_prcd(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_nrml]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_nrml(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_prcd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_prcd(MCEventInfo info);

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
		if (vc == Cnd_mrp_typ_r_Group) return doCnd_mrp_typ_r_VC(info);
		if (vc == Cnd_due_dt_fr) return doCnd_due_dt_fr_VC(info);
		if (vc == Cnd_due_dt_to) return doCnd_due_dt_to_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_strg_loc_grp_cd) return doCnd_strg_loc_grp_cd_VC(info);
		if (vc == Cnd_strg_loc_grp_nm) return doCnd_strg_loc_grp_nm_VC(info);
		if (vc == Cnd_strg_loc_cd) return doCnd_strg_loc_cd_VC(info);
		if (vc == Cnd_strg_loc_nm) return doCnd_strg_loc_nm_VC(info);
		if (vc == Cnd_mfg_loc_cd) return doCnd_mfg_loc_cd_VC(info);
		if (vc == Cnd_mfg_loc_nm) return doCnd_mfg_loc_nm_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_rqst_wg_cd) return doCnd_rqst_wg_cd_VC(info);
		if (vc == Cnd_rqst_wg_nm) return doCnd_rqst_wg_nm_VC(info);
		if (vc == Cnd_rqst_loc_cd) return doCnd_rqst_loc_cd_VC(info);
		if (vc == Cnd_rqst_loc_nm) return doCnd_rqst_loc_nm_VC(info);
		if (vc == Cnd_rqmt_no) return doCnd_rqmt_no_VC(info);
		if (vc == Cnd_fix_flg) return doCnd_fix_flg_VC(info);
		if (vc == Cnd_rqmt_gnrt_typ) return doCnd_rqmt_gnrt_typ_VC(info);
		if (vc == Cnd_rqmt_gnrt_typ_nm) return doCnd_rqmt_gnrt_typ_nm_VC(info);
		if (vc == Cnd_rqmt_typ) return doCnd_rqmt_typ_VC(info);
		if (vc == Cnd_rqmt_typ_nm) return doCnd_rqmt_typ_nm_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_sno_sprt_flg) return doRslt_sno_sprt_flg_VC(info);
		if (vc == columnRslt_rqmt_no) return doRslt_rqmt_no_VC(info);
		if (vc == columnRslt_due_dt) return doRslt_due_dt_VC(info);
		if (vc == columnRslt_strg_loc_cd) return doRslt_strg_loc_cd_VC(info);
		if (vc == columnRslt_strg_loc_nm) return doRslt_strg_loc_nm_VC(info);
		if (vc == columnRslt_site_cd) return doRslt_site_cd_VC(info);
		if (vc == columnRslt_site_nm) return doRslt_site_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_strg_loc_grp_cd) return doRslt_strg_loc_grp_cd_VC(info);
		if (vc == columnRslt_strg_loc_grp_nm) return doRslt_strg_loc_grp_nm_VC(info);
		if (vc == columnRslt_unit_cd) return doRslt_unit_cd_VC(info);
		if (vc == columnRslt_unit_nm) return doRslt_unit_nm_VC(info);
		if (vc == columnRslt_dec_place) return doRslt_dec_place_VC(info);
		if (vc == columnRslt_mfg_loc_cd) return doRslt_mfg_loc_cd_VC(info);
		if (vc == columnRslt_mfg_loc_nm) return doRslt_mfg_loc_nm_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_rqst_loc_cd) return doRslt_rqst_loc_cd_VC(info);
		if (vc == columnRslt_rqst_loc_nm) return doRslt_rqst_loc_nm_VC(info);
		if (vc == columnRslt_rqst_wg_cd) return doRslt_rqst_wg_cd_VC(info);
		if (vc == columnRslt_rqst_wg_nm) return doRslt_rqst_wg_nm_VC(info);
		if (vc == columnRslt_sno1_mng_typ) return doRslt_sno1_mng_typ_VC(info);
		if (vc == columnRslt_sno2_mng_typ) return doRslt_sno2_mng_typ_VC(info);
		if (vc == columnRslt_sno3_mng_typ) return doRslt_sno3_mng_typ_VC(info);
		if (vc == columnRslt_sno4_mng_typ) return doRslt_sno4_mng_typ_VC(info);
		if (vc == columnRslt_sno1_num_typ) return doRslt_sno1_num_typ_VC(info);
		if (vc == columnRslt_sno2_num_typ) return doRslt_sno2_num_typ_VC(info);
		if (vc == columnRslt_sno3_num_typ) return doRslt_sno3_num_typ_VC(info);
		if (vc == columnRslt_sno4_num_typ) return doRslt_sno4_num_typ_VC(info);
		if (vc == columnRslt_rqmt_sno1_flg) return doRslt_rqmt_sno1_flg_VC(info);
		if (vc == columnRslt_rqmt_sno2_flg) return doRslt_rqmt_sno2_flg_VC(info);
		if (vc == columnRslt_rqmt_sno3_flg) return doRslt_rqmt_sno3_flg_VC(info);
		if (vc == columnRslt_rqmt_sno4_flg) return doRslt_rqmt_sno4_flg_VC(info);
		if (vc == columnRslt_fix_flg) return doRslt_fix_flg_VC(info);
		if (vc == columnRslt_rqmt_gnrt_typ) return doRslt_rqmt_gnrt_typ_VC(info);
		if (vc == columnRslt_rqmt_gnrt_typ_nm) return doRslt_rqmt_gnrt_typ_nm_VC(info);
		if (vc == columnRslt_rqmt_typ) return doRslt_rqmt_typ_VC(info);
		if (vc == columnRslt_rqmt_typ_nm) return doRslt_rqmt_typ_nm_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
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
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mrp_typ_r]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mrp_typ_r_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[due_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_due_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[due_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_due_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[strg_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqmt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqmt_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqmt_gnrt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqmt_gnrt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqmt_gnrt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqmt_gnrt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqmt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqmt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqmt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqmt_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno_sprt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno_sprt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqmt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqmt_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[due_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_due_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_loc_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[strg_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno1_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno1_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno2_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno2_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno3_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno3_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sno4_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sno4_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqmt_sno1_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqmt_sno1_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqmt_sno2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqmt_sno2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqmt_sno3_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqmt_sno3_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqmt_sno4_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqmt_sno4_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqmt_gnrt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqmt_gnrt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqmt_gnrt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqmt_gnrt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqmt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqmt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqmt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqmt_typ_nm_VC(MCEventInfo info){
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
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_mrp_typ_r_Group) doCnd_mrp_typ_r_NC(info);
		else if (nc == Cnd_due_dt_fr) doCnd_due_dt_fr_NC(info);
		else if (nc == Cnd_due_dt_to) doCnd_due_dt_to_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_strg_loc_grp_cd) doCnd_strg_loc_grp_cd_NC(info);
		else if (nc == Cnd_strg_loc_grp_nm) doCnd_strg_loc_grp_nm_NC(info);
		else if (nc == Cnd_strg_loc_cd) doCnd_strg_loc_cd_NC(info);
		else if (nc == Cnd_strg_loc_nm) doCnd_strg_loc_nm_NC(info);
		else if (nc == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NC(info);
		else if (nc == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_rqst_wg_cd) doCnd_rqst_wg_cd_NC(info);
		else if (nc == Cnd_rqst_wg_nm) doCnd_rqst_wg_nm_NC(info);
		else if (nc == Cnd_rqst_loc_cd) doCnd_rqst_loc_cd_NC(info);
		else if (nc == Cnd_rqst_loc_nm) doCnd_rqst_loc_nm_NC(info);
		else if (nc == Cnd_rqmt_no) doCnd_rqmt_no_NC(info);
		else if (nc == Cnd_fix_flg) doCnd_fix_flg_NC(info);
		else if (nc == Cnd_rqmt_gnrt_typ) doCnd_rqmt_gnrt_typ_NC(info);
		else if (nc == Cnd_rqmt_gnrt_typ_nm) doCnd_rqmt_gnrt_typ_nm_NC(info);
		else if (nc == Cnd_rqmt_typ) doCnd_rqmt_typ_NC(info);
		else if (nc == Cnd_rqmt_typ_nm) doCnd_rqmt_typ_nm_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_sno_sprt_flg) doRslt_sno_sprt_flg_NC(info);
		else if (nc == columnRslt_rqmt_no) doRslt_rqmt_no_NC(info);
		else if (nc == columnRslt_due_dt) doRslt_due_dt_NC(info);
		else if (nc == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NC(info);
		else if (nc == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NC(info);
		else if (nc == columnRslt_site_cd) doRslt_site_cd_NC(info);
		else if (nc == columnRslt_site_nm) doRslt_site_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_strg_loc_grp_cd) doRslt_strg_loc_grp_cd_NC(info);
		else if (nc == columnRslt_strg_loc_grp_nm) doRslt_strg_loc_grp_nm_NC(info);
		else if (nc == columnRslt_unit_cd) doRslt_unit_cd_NC(info);
		else if (nc == columnRslt_unit_nm) doRslt_unit_nm_NC(info);
		else if (nc == columnRslt_dec_place) doRslt_dec_place_NC(info);
		else if (nc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NC(info);
		else if (nc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_NC(info);
		else if (nc == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_NC(info);
		else if (nc == columnRslt_rqst_wg_cd) doRslt_rqst_wg_cd_NC(info);
		else if (nc == columnRslt_rqst_wg_nm) doRslt_rqst_wg_nm_NC(info);
		else if (nc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NC(info);
		else if (nc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NC(info);
		else if (nc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NC(info);
		else if (nc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NC(info);
		else if (nc == columnRslt_sno1_num_typ) doRslt_sno1_num_typ_NC(info);
		else if (nc == columnRslt_sno2_num_typ) doRslt_sno2_num_typ_NC(info);
		else if (nc == columnRslt_sno3_num_typ) doRslt_sno3_num_typ_NC(info);
		else if (nc == columnRslt_sno4_num_typ) doRslt_sno4_num_typ_NC(info);
		else if (nc == columnRslt_rqmt_sno1_flg) doRslt_rqmt_sno1_flg_NC(info);
		else if (nc == columnRslt_rqmt_sno2_flg) doRslt_rqmt_sno2_flg_NC(info);
		else if (nc == columnRslt_rqmt_sno3_flg) doRslt_rqmt_sno3_flg_NC(info);
		else if (nc == columnRslt_rqmt_sno4_flg) doRslt_rqmt_sno4_flg_NC(info);
		else if (nc == columnRslt_fix_flg) doRslt_fix_flg_NC(info);
		else if (nc == columnRslt_rqmt_gnrt_typ) doRslt_rqmt_gnrt_typ_NC(info);
		else if (nc == columnRslt_rqmt_gnrt_typ_nm) doRslt_rqmt_gnrt_typ_nm_NC(info);
		else if (nc == columnRslt_rqmt_typ) doRslt_rqmt_typ_NC(info);
		else if (nc == columnRslt_rqmt_typ_nm) doRslt_rqmt_typ_nm_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
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
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_typ_r]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_typ_r_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[due_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_due_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[due_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_due_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[strg_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_gnrt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_gnrt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_gnrt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_gnrt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_sprt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_sprt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[strg_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_sno1_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_sno1_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_sno2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_sno2_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_sno3_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_sno3_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_sno4_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_sno4_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_gnrt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_gnrt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_gnrt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_gnrt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NC(MCEventInfo info){
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
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_mrp_typ_r_Group) doCnd_mrp_typ_r_NE(info);
		else if (ne == Cnd_due_dt_fr) doCnd_due_dt_fr_NE(info);
		else if (ne == Cnd_due_dt_to) doCnd_due_dt_to_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_strg_loc_grp_cd) doCnd_strg_loc_grp_cd_NE(info);
		else if (ne == Cnd_strg_loc_grp_nm) doCnd_strg_loc_grp_nm_NE(info);
		else if (ne == Cnd_strg_loc_cd) doCnd_strg_loc_cd_NE(info);
		else if (ne == Cnd_strg_loc_nm) doCnd_strg_loc_nm_NE(info);
		else if (ne == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NE(info);
		else if (ne == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_rqst_wg_cd) doCnd_rqst_wg_cd_NE(info);
		else if (ne == Cnd_rqst_wg_nm) doCnd_rqst_wg_nm_NE(info);
		else if (ne == Cnd_rqst_loc_cd) doCnd_rqst_loc_cd_NE(info);
		else if (ne == Cnd_rqst_loc_nm) doCnd_rqst_loc_nm_NE(info);
		else if (ne == Cnd_rqmt_no) doCnd_rqmt_no_NE(info);
		else if (ne == Cnd_fix_flg) doCnd_fix_flg_NE(info);
		else if (ne == Cnd_rqmt_gnrt_typ) doCnd_rqmt_gnrt_typ_NE(info);
		else if (ne == Cnd_rqmt_gnrt_typ_nm) doCnd_rqmt_gnrt_typ_nm_NE(info);
		else if (ne == Cnd_rqmt_typ) doCnd_rqmt_typ_NE(info);
		else if (ne == Cnd_rqmt_typ_nm) doCnd_rqmt_typ_nm_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_sno_sprt_flg) doRslt_sno_sprt_flg_NE(info);
		else if (ne == columnRslt_rqmt_no) doRslt_rqmt_no_NE(info);
		else if (ne == columnRslt_due_dt) doRslt_due_dt_NE(info);
		else if (ne == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NE(info);
		else if (ne == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NE(info);
		else if (ne == columnRslt_site_cd) doRslt_site_cd_NE(info);
		else if (ne == columnRslt_site_nm) doRslt_site_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_strg_loc_grp_cd) doRslt_strg_loc_grp_cd_NE(info);
		else if (ne == columnRslt_strg_loc_grp_nm) doRslt_strg_loc_grp_nm_NE(info);
		else if (ne == columnRslt_unit_cd) doRslt_unit_cd_NE(info);
		else if (ne == columnRslt_unit_nm) doRslt_unit_nm_NE(info);
		else if (ne == columnRslt_dec_place) doRslt_dec_place_NE(info);
		else if (ne == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NE(info);
		else if (ne == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_NE(info);
		else if (ne == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_NE(info);
		else if (ne == columnRslt_rqst_wg_cd) doRslt_rqst_wg_cd_NE(info);
		else if (ne == columnRslt_rqst_wg_nm) doRslt_rqst_wg_nm_NE(info);
		else if (ne == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NE(info);
		else if (ne == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NE(info);
		else if (ne == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NE(info);
		else if (ne == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NE(info);
		else if (ne == columnRslt_sno1_num_typ) doRslt_sno1_num_typ_NE(info);
		else if (ne == columnRslt_sno2_num_typ) doRslt_sno2_num_typ_NE(info);
		else if (ne == columnRslt_sno3_num_typ) doRslt_sno3_num_typ_NE(info);
		else if (ne == columnRslt_sno4_num_typ) doRslt_sno4_num_typ_NE(info);
		else if (ne == columnRslt_rqmt_sno1_flg) doRslt_rqmt_sno1_flg_NE(info);
		else if (ne == columnRslt_rqmt_sno2_flg) doRslt_rqmt_sno2_flg_NE(info);
		else if (ne == columnRslt_rqmt_sno3_flg) doRslt_rqmt_sno3_flg_NE(info);
		else if (ne == columnRslt_rqmt_sno4_flg) doRslt_rqmt_sno4_flg_NE(info);
		else if (ne == columnRslt_fix_flg) doRslt_fix_flg_NE(info);
		else if (ne == columnRslt_rqmt_gnrt_typ) doRslt_rqmt_gnrt_typ_NE(info);
		else if (ne == columnRslt_rqmt_gnrt_typ_nm) doRslt_rqmt_gnrt_typ_nm_NE(info);
		else if (ne == columnRslt_rqmt_typ) doRslt_rqmt_typ_NE(info);
		else if (ne == columnRslt_rqmt_typ_nm) doRslt_rqmt_typ_nm_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
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
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_typ_r]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_typ_r_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[due_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_due_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[due_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_due_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[strg_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_gnrt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_gnrt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_gnrt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_gnrt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_sprt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_sprt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[strg_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_sno1_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_sno1_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_sno2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_sno2_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_sno3_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_sno3_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_sno4_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_sno4_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_gnrt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_gnrt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_gnrt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_gnrt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NE(MCEventInfo info){
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
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_mrp_typ_r_Group) doCnd_mrp_typ_r_NX(info);
		else if (nx == Cnd_due_dt_fr) doCnd_due_dt_fr_NX(info);
		else if (nx == Cnd_due_dt_to) doCnd_due_dt_to_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_strg_loc_grp_cd) doCnd_strg_loc_grp_cd_NX(info);
		else if (nx == Cnd_strg_loc_grp_nm) doCnd_strg_loc_grp_nm_NX(info);
		else if (nx == Cnd_strg_loc_cd) doCnd_strg_loc_cd_NX(info);
		else if (nx == Cnd_strg_loc_nm) doCnd_strg_loc_nm_NX(info);
		else if (nx == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NX(info);
		else if (nx == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_rqst_wg_cd) doCnd_rqst_wg_cd_NX(info);
		else if (nx == Cnd_rqst_wg_nm) doCnd_rqst_wg_nm_NX(info);
		else if (nx == Cnd_rqst_loc_cd) doCnd_rqst_loc_cd_NX(info);
		else if (nx == Cnd_rqst_loc_nm) doCnd_rqst_loc_nm_NX(info);
		else if (nx == Cnd_rqmt_no) doCnd_rqmt_no_NX(info);
		else if (nx == Cnd_fix_flg) doCnd_fix_flg_NX(info);
		else if (nx == Cnd_rqmt_gnrt_typ) doCnd_rqmt_gnrt_typ_NX(info);
		else if (nx == Cnd_rqmt_gnrt_typ_nm) doCnd_rqmt_gnrt_typ_nm_NX(info);
		else if (nx == Cnd_rqmt_typ) doCnd_rqmt_typ_NX(info);
		else if (nx == Cnd_rqmt_typ_nm) doCnd_rqmt_typ_nm_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_sno_sprt_flg) doRslt_sno_sprt_flg_NX(info);
		else if (nx == columnRslt_rqmt_no) doRslt_rqmt_no_NX(info);
		else if (nx == columnRslt_due_dt) doRslt_due_dt_NX(info);
		else if (nx == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NX(info);
		else if (nx == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NX(info);
		else if (nx == columnRslt_site_cd) doRslt_site_cd_NX(info);
		else if (nx == columnRslt_site_nm) doRslt_site_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_strg_loc_grp_cd) doRslt_strg_loc_grp_cd_NX(info);
		else if (nx == columnRslt_strg_loc_grp_nm) doRslt_strg_loc_grp_nm_NX(info);
		else if (nx == columnRslt_unit_cd) doRslt_unit_cd_NX(info);
		else if (nx == columnRslt_unit_nm) doRslt_unit_nm_NX(info);
		else if (nx == columnRslt_dec_place) doRslt_dec_place_NX(info);
		else if (nx == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NX(info);
		else if (nx == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_NX(info);
		else if (nx == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_NX(info);
		else if (nx == columnRslt_rqst_wg_cd) doRslt_rqst_wg_cd_NX(info);
		else if (nx == columnRslt_rqst_wg_nm) doRslt_rqst_wg_nm_NX(info);
		else if (nx == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_NX(info);
		else if (nx == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_NX(info);
		else if (nx == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_NX(info);
		else if (nx == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_NX(info);
		else if (nx == columnRslt_sno1_num_typ) doRslt_sno1_num_typ_NX(info);
		else if (nx == columnRslt_sno2_num_typ) doRslt_sno2_num_typ_NX(info);
		else if (nx == columnRslt_sno3_num_typ) doRslt_sno3_num_typ_NX(info);
		else if (nx == columnRslt_sno4_num_typ) doRslt_sno4_num_typ_NX(info);
		else if (nx == columnRslt_rqmt_sno1_flg) doRslt_rqmt_sno1_flg_NX(info);
		else if (nx == columnRslt_rqmt_sno2_flg) doRslt_rqmt_sno2_flg_NX(info);
		else if (nx == columnRslt_rqmt_sno3_flg) doRslt_rqmt_sno3_flg_NX(info);
		else if (nx == columnRslt_rqmt_sno4_flg) doRslt_rqmt_sno4_flg_NX(info);
		else if (nx == columnRslt_fix_flg) doRslt_fix_flg_NX(info);
		else if (nx == columnRslt_rqmt_gnrt_typ) doRslt_rqmt_gnrt_typ_NX(info);
		else if (nx == columnRslt_rqmt_gnrt_typ_nm) doRslt_rqmt_gnrt_typ_nm_NX(info);
		else if (nx == columnRslt_rqmt_typ) doRslt_rqmt_typ_NX(info);
		else if (nx == columnRslt_rqmt_typ_nm) doRslt_rqmt_typ_nm_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
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
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_typ_r]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_typ_r_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[due_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_due_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[due_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_due_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[strg_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_gnrt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_gnrt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_gnrt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_gnrt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno_sprt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno_sprt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[strg_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_sno1_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_sno1_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_sno2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_sno2_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_sno3_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_sno3_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_sno4_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_sno4_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_gnrt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_gnrt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_gnrt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_gnrt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NX(MCEventInfo info){
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
		if (lc == Cnd_due_dt_fr) doCnd_due_dt_fr_LC(info);
		else if (lc == Cnd_due_dt_to) doCnd_due_dt_to_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_strg_loc_grp_cd) doCnd_strg_loc_grp_cd_LC(info);
		else if (lc == Cnd_strg_loc_grp_nm) doCnd_strg_loc_grp_nm_LC(info);
		else if (lc == Cnd_strg_loc_cd) doCnd_strg_loc_cd_LC(info);
		else if (lc == Cnd_strg_loc_nm) doCnd_strg_loc_nm_LC(info);
		else if (lc == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_LC(info);
		else if (lc == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_rqst_wg_cd) doCnd_rqst_wg_cd_LC(info);
		else if (lc == Cnd_rqst_wg_nm) doCnd_rqst_wg_nm_LC(info);
		else if (lc == Cnd_rqst_loc_cd) doCnd_rqst_loc_cd_LC(info);
		else if (lc == Cnd_rqst_loc_nm) doCnd_rqst_loc_nm_LC(info);
		else if (lc == Cnd_rqmt_no) doCnd_rqmt_no_LC(info);
		else if (lc == Cnd_rqmt_gnrt_typ) doCnd_rqmt_gnrt_typ_LC(info);
		else if (lc == Cnd_rqmt_gnrt_typ_nm) doCnd_rqmt_gnrt_typ_nm_LC(info);
		else if (lc == Cnd_rqmt_typ) doCnd_rqmt_typ_LC(info);
		else if (lc == Cnd_rqmt_typ_nm) doCnd_rqmt_typ_nm_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == columnRslt_rqmt_no) doRslt_rqmt_no_LC(info);
		else if (lc == columnRslt_due_dt) doRslt_due_dt_LC(info);
		else if (lc == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_LC(info);
		else if (lc == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_LC(info);
		else if (lc == columnRslt_site_cd) doRslt_site_cd_LC(info);
		else if (lc == columnRslt_site_nm) doRslt_site_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_strg_loc_grp_cd) doRslt_strg_loc_grp_cd_LC(info);
		else if (lc == columnRslt_strg_loc_grp_nm) doRslt_strg_loc_grp_nm_LC(info);
		else if (lc == columnRslt_unit_cd) doRslt_unit_cd_LC(info);
		else if (lc == columnRslt_unit_nm) doRslt_unit_nm_LC(info);
		else if (lc == columnRslt_dec_place) doRslt_dec_place_LC(info);
		else if (lc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_LC(info);
		else if (lc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_LC(info);
		else if (lc == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_LC(info);
		else if (lc == columnRslt_rqst_wg_cd) doRslt_rqst_wg_cd_LC(info);
		else if (lc == columnRslt_rqst_wg_nm) doRslt_rqst_wg_nm_LC(info);
		else if (lc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_LC(info);
		else if (lc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_LC(info);
		else if (lc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_LC(info);
		else if (lc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_LC(info);
		else if (lc == columnRslt_sno1_num_typ) doRslt_sno1_num_typ_LC(info);
		else if (lc == columnRslt_sno2_num_typ) doRslt_sno2_num_typ_LC(info);
		else if (lc == columnRslt_sno3_num_typ) doRslt_sno3_num_typ_LC(info);
		else if (lc == columnRslt_sno4_num_typ) doRslt_sno4_num_typ_LC(info);
		else if (lc == columnRslt_rqmt_gnrt_typ) doRslt_rqmt_gnrt_typ_LC(info);
		else if (lc == columnRslt_rqmt_gnrt_typ_nm) doRslt_rqmt_gnrt_typ_nm_LC(info);
		else if (lc == columnRslt_rqmt_typ) doRslt_rqmt_typ_LC(info);
		else if (lc == columnRslt_rqmt_typ_nm) doRslt_rqmt_typ_nm_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
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
	 * [Cnd]パネルの[due_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_due_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[due_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_due_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[strg_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_gnrt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_gnrt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_gnrt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_gnrt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[rqmt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[due_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_due_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[strg_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno1_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno1_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno2_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno2_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno3_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno3_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sno4_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sno4_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_gnrt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_gnrt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_gnrt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_gnrt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_strg_loc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_strg_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_strg_loc_cd]の作成メソッド
	 */
	public MCList getCnd_strg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_loc_cd]の作成メソッド
	 */
	public MCList getCnd_mfg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_wg_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_loc_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
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
	 * コンボ／リストのリスト[Cnd_rqmt_gnrt_typ]の作成メソッド
	 */
	public MCList getCnd_rqmt_gnrt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getRqmtGnrtTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqmt_typ]の作成メソッド
	 */
	public MCList getCnd_rqmt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRqmtTyp(row, info);
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
	 * コンボ／リストのリスト[columnRslt_strg_loc_cd]の作成メソッド
	 */
	public MCList getRslt_strg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_mfg_loc_cd]の作成メソッド
	 */
	public MCList getRslt_mfg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlMfgLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_sppl_cd]の作成メソッド
	 */
	public MCList getRslt_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlSppl(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_rqst_loc_cd]の作成メソッド
	 */
	public MCList getRslt_rqst_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlRqstLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_rqmt_typ]の作成メソッド
	 */
	public MCList getRslt_rqmt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRqmtTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBCL0010.Srch01")) {
			return new MS_MSBCL0010_Srch01Bridge();
		}
		if (id.equals("MS.MSBCL0010.Imp01")) {
			return new MS_MSBCL0010_Imp01Bridge();
		}
		if (id.equals("MS.MSBCL0010.Sprt01")) {
			return new MS_MSBCL0010_Sprt01Bridge();
		}
		if (id.equals("MS.MSBCL0010.Upd01")) {
			return new MS_MSBCL0010_Upd01Bridge();
		}
		if (id.equals("MS.MSBCL0010.Del01")) {
			return new MS_MSBCL0010_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBCL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0010_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0010_Srch01;

		/** コンストラクタ */
		protected MS_MSBCL0010_Srch01Bridge() {
			p_MS_MSBCL0010_Srch01 = new MCParam(PDef.MS_MSBCL0010_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0010_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0010.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0010.RsltR.class));

			p_MS_MSBCL0010_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0010_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0010_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0010_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0010_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0010.CndR up0() {
			return (mcframe.clientMSBC.MSBCP0010.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0010.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0010.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0010_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0010.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0010_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0010.RsltR>)p_MS_MSBCL0010_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBCL0010_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0010_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0010_Imp01;

		/** コンストラクタ */
		protected MS_MSBCL0010_Imp01Bridge() {
			p_MS_MSBCL0010_Imp01 = new MCParam(PDef.MS_MSBCL0010_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0010_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0010.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0010.RsltR.class));

			p_MS_MSBCL0010_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0010_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0010_Imp01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0010_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0010_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0010.RsltR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0010.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0010.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0010.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0010_Imp01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0010.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0010_Imp01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0010.RsltR>)p_MS_MSBCL0010_Imp01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBCL0010_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0010_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0010_Sprt01;

		/** コンストラクタ */
		protected MS_MSBCL0010_Sprt01Bridge() {
			p_MS_MSBCL0010_Sprt01 = new MCParam(PDef.MS_MSBCL0010_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0010_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0010.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0010.RsltR.class));

			p_MS_MSBCL0010_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0010_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0010_Sprt01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0010_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0010_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0010.RsltR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0010.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0010.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0010.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0010_Sprt01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0010.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0010_Sprt01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0010.RsltR>)p_MS_MSBCL0010_Sprt01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBCL0010_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0010_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0010_Upd01;

		/** コンストラクタ */
		protected MS_MSBCL0010_Upd01Bridge() {
			p_MS_MSBCL0010_Upd01 = new MCParam(PDef.MS_MSBCL0010_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0010_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0010.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0010.RsltR.class));

			p_MS_MSBCL0010_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0010_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0010_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0010_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0010_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0010.RsltR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0010.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0010.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0010.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0010_Upd01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0010.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0010_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0010.RsltR>)p_MS_MSBCL0010_Upd01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBCL0010_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0010_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0010_Del01;

		/** コンストラクタ */
		protected MS_MSBCL0010_Del01Bridge() {
			p_MS_MSBCL0010_Del01 = new MCParam(PDef.MS_MSBCL0010_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0010_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0010.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0010.RsltR.class));

			p_MS_MSBCL0010_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0010_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0010_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0010_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0010_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0010.RsltR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0010.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0010.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0010.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0010_Del01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0010.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0010_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0010.RsltR>)p_MS_MSBCL0010_Del01.getContainerParam().getDownBlock(0));
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