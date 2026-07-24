package mcframe.clientMSBC.MSBCP0020;

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
import mcframe.clientMSBC.MSBCP0020.MSBCP_MstrPlnReg_MC.MS_MSBCL0020_Srch01Caller;
import mcframe.clientMSBC.MSBCP0020.MSBCP_MstrPlnReg_MC.MS_MSBCL0020_Sprt01Caller;
import mcframe.clientMSBC.MSBCP0020.MSBCP_MstrPlnReg_MC.MS_MSBCL0020_Upd01Caller;
import mcframe.clientMSBC.MSBCP0020.MSBCP_MstrPlnReg_MC.MS_MSBCL0020_Del01Caller;

/**
 * 画面"MSBCP_MstrPlnReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCP_MstrPlnReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBCP0020";

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
	 * UPD,Create/Modify;DEL,Cancel;REF,View UPD,登録・訂正する;DEL,取り消す;REF,参照する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
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
	public MCLabel Cnd_mps_grp_cd_Label = null;
	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_mps_grp_cd = null;
	/**
	 * MPS group name ＭＰＳグループ名.<p>
	 *
	 */
	public MCTextField Cnd_mps_grp_nm = null;
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
	/**
	 * Display key column キー項目表示.<p>
	 *
	 */
	public MCCheckBox Cnd_disp_key_flg = null;
	/**
	 * Shipping schedule 出荷予定.<p>
	 *
	 */
	public MCCheckBox Cnd_disp_ship_schd_flg = null;
	/**
	 * Long LT order 先行手配.<p>
	 *
	 */
	public MCCheckBox Cnd_disp_prcd_flg = null;
	/**
	 * MPS possible production qty. ＭＰＳ生産可能数.<p>
	 *
	 */
	public MCCheckBox Cnd_disp_mps_flg = null;
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [LPnl]ブロック関連のField定義
	public MCPanel LPnlPanel = null;
	// [LPnl]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBC.MSBCP0020.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_peg_no = null;
	/**
	 * Key キー.<p>
	 *
	 */
	public MCColumnConfig columnRslt_disp_00 = null;
	/**
	 * MPS group cd. MPSグループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mps_grp_cd = null;
	/**
	 * MPS group name MPSグループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mps_grp_nm = null;
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
	 * Requested cd. 依頼先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_loc_cd = null;
	/**
	 * Requested-to name 依頼先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_loc_nm = null;
	/**
	 * Procurement provider cd. 調達先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_proc_cd = null;
	/**
	 * Procurement provider name 調達先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_proc_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
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
	/**
	 * Column value 項目値.<p>
	 *
	 */
	public MCColumnConfig columnRslt_row_title_col = null;
	/**
	 * Column 項目.<p>
	 *
	 */
	public MCColumnConfig columnRslt_row_title_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_00_p_PPanel;
	public MCColumnConfig columnRslt_qty_00;// [Rslt]の[qty_00_p.qty]を[columnRslt_qty_00]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_01_p_PPanel;
	public MCColumnConfig columnRslt_qty_01;// [Rslt]の[qty_01_p.qty]を[columnRslt_qty_01]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_02_p_PPanel;
	public MCColumnConfig columnRslt_qty_02;// [Rslt]の[qty_02_p.qty]を[columnRslt_qty_02]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_03_p_PPanel;
	public MCColumnConfig columnRslt_qty_03;// [Rslt]の[qty_03_p.qty]を[columnRslt_qty_03]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_04_p_PPanel;
	public MCColumnConfig columnRslt_qty_04;// [Rslt]の[qty_04_p.qty]を[columnRslt_qty_04]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_05_p_PPanel;
	public MCColumnConfig columnRslt_qty_05;// [Rslt]の[qty_05_p.qty]を[columnRslt_qty_05]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_06_p_PPanel;
	public MCColumnConfig columnRslt_qty_06;// [Rslt]の[qty_06_p.qty]を[columnRslt_qty_06]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_07_p_PPanel;
	public MCColumnConfig columnRslt_qty_07;// [Rslt]の[qty_07_p.qty]を[columnRslt_qty_07]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_08_p_PPanel;
	public MCColumnConfig columnRslt_qty_08;// [Rslt]の[qty_08_p.qty]を[columnRslt_qty_08]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_09_p_PPanel;
	public MCColumnConfig columnRslt_qty_09;// [Rslt]の[qty_09_p.qty]を[columnRslt_qty_09]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_10_p_PPanel;
	public MCColumnConfig columnRslt_qty_10;// [Rslt]の[qty_10_p.qty]を[columnRslt_qty_10]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_11_p_PPanel;
	public MCColumnConfig columnRslt_qty_11;// [Rslt]の[qty_11_p.qty]を[columnRslt_qty_11]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_12_p_PPanel;
	public MCColumnConfig columnRslt_qty_12;// [Rslt]の[qty_12_p.qty]を[columnRslt_qty_12]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_13_p_PPanel;
	public MCColumnConfig columnRslt_qty_13;// [Rslt]の[qty_13_p.qty]を[columnRslt_qty_13]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_14_p_PPanel;
	public MCColumnConfig columnRslt_qty_14;// [Rslt]の[qty_14_p.qty]を[columnRslt_qty_14]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_15_p_PPanel;
	public MCColumnConfig columnRslt_qty_15;// [Rslt]の[qty_15_p.qty]を[columnRslt_qty_15]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_16_p_PPanel;
	public MCColumnConfig columnRslt_qty_16;// [Rslt]の[qty_16_p.qty]を[columnRslt_qty_16]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_17_p_PPanel;
	public MCColumnConfig columnRslt_qty_17;// [Rslt]の[qty_17_p.qty]を[columnRslt_qty_17]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_18_p_PPanel;
	public MCColumnConfig columnRslt_qty_18;// [Rslt]の[qty_18_p.qty]を[columnRslt_qty_18]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_19_p_PPanel;
	public MCColumnConfig columnRslt_qty_19;// [Rslt]の[qty_19_p.qty]を[columnRslt_qty_19]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_20_p_PPanel;
	public MCColumnConfig columnRslt_qty_20;// [Rslt]の[qty_20_p.qty]を[columnRslt_qty_20]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_21_p_PPanel;
	public MCColumnConfig columnRslt_qty_21;// [Rslt]の[qty_21_p.qty]を[columnRslt_qty_21]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_22_p_PPanel;
	public MCColumnConfig columnRslt_qty_22;// [Rslt]の[qty_22_p.qty]を[columnRslt_qty_22]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_23_p_PPanel;
	public MCColumnConfig columnRslt_qty_23;// [Rslt]の[qty_23_p.qty]を[columnRslt_qty_23]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_24_p_PPanel;
	public MCColumnConfig columnRslt_qty_24;// [Rslt]の[qty_24_p.qty]を[columnRslt_qty_24]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_25_p_PPanel;
	public MCColumnConfig columnRslt_qty_25;// [Rslt]の[qty_25_p.qty]を[columnRslt_qty_25]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_26_p_PPanel;
	public MCColumnConfig columnRslt_qty_26;// [Rslt]の[qty_26_p.qty]を[columnRslt_qty_26]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_27_p_PPanel;
	public MCColumnConfig columnRslt_qty_27;// [Rslt]の[qty_27_p.qty]を[columnRslt_qty_27]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_28_p_PPanel;
	public MCColumnConfig columnRslt_qty_28;// [Rslt]の[qty_28_p.qty]を[columnRslt_qty_28]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_29_p_PPanel;
	public MCColumnConfig columnRslt_qty_29;// [Rslt]の[qty_29_p.qty]を[columnRslt_qty_29]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_30_p_PPanel;
	public MCColumnConfig columnRslt_qty_30;// [Rslt]の[qty_30_p.qty]を[columnRslt_qty_30]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_31_p_PPanel;
	public MCColumnConfig columnRslt_qty_31;// [Rslt]の[qty_31_p.qty]を[columnRslt_qty_31]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_32_p_PPanel;
	public MCColumnConfig columnRslt_qty_32;// [Rslt]の[qty_32_p.qty]を[columnRslt_qty_32]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_33_p_PPanel;
	public MCColumnConfig columnRslt_qty_33;// [Rslt]の[qty_33_p.qty]を[columnRslt_qty_33]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_34_p_PPanel;
	public MCColumnConfig columnRslt_qty_34;// [Rslt]の[qty_34_p.qty]を[columnRslt_qty_34]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_35_p_PPanel;
	public MCColumnConfig columnRslt_qty_35;// [Rslt]の[qty_35_p.qty]を[columnRslt_qty_35]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_36_p_PPanel;
	public MCColumnConfig columnRslt_qty_36;// [Rslt]の[qty_36_p.qty]を[columnRslt_qty_36]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_37_p_PPanel;
	public MCColumnConfig columnRslt_qty_37;// [Rslt]の[qty_37_p.qty]を[columnRslt_qty_37]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_38_p_PPanel;
	public MCColumnConfig columnRslt_qty_38;// [Rslt]の[qty_38_p.qty]を[columnRslt_qty_38]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_39_p_PPanel;
	public MCColumnConfig columnRslt_qty_39;// [Rslt]の[qty_39_p.qty]を[columnRslt_qty_39]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_40_p_PPanel;
	public MCColumnConfig columnRslt_qty_40;// [Rslt]の[qty_40_p.qty]を[columnRslt_qty_40]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_41_p_PPanel;
	public MCColumnConfig columnRslt_qty_41;// [Rslt]の[qty_41_p.qty]を[columnRslt_qty_41]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_42_p_PPanel;
	public MCColumnConfig columnRslt_qty_42;// [Rslt]の[qty_42_p.qty]を[columnRslt_qty_42]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_43_p_PPanel;
	public MCColumnConfig columnRslt_qty_43;// [Rslt]の[qty_43_p.qty]を[columnRslt_qty_43]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_44_p_PPanel;
	public MCColumnConfig columnRslt_qty_44;// [Rslt]の[qty_44_p.qty]を[columnRslt_qty_44]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_45_p_PPanel;
	public MCColumnConfig columnRslt_qty_45;// [Rslt]の[qty_45_p.qty]を[columnRslt_qty_45]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_46_p_PPanel;
	public MCColumnConfig columnRslt_qty_46;// [Rslt]の[qty_46_p.qty]を[columnRslt_qty_46]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_47_p_PPanel;
	public MCColumnConfig columnRslt_qty_47;// [Rslt]の[qty_47_p.qty]を[columnRslt_qty_47]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_48_p_PPanel;
	public MCColumnConfig columnRslt_qty_48;// [Rslt]の[qty_48_p.qty]を[columnRslt_qty_48]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_49_p_PPanel;
	public MCColumnConfig columnRslt_qty_49;// [Rslt]の[qty_49_p.qty]を[columnRslt_qty_49]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_50_p_PPanel;
	public MCColumnConfig columnRslt_qty_50;// [Rslt]の[qty_50_p.qty]を[columnRslt_qty_50]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_51_p_PPanel;
	public MCColumnConfig columnRslt_qty_51;// [Rslt]の[qty_51_p.qty]を[columnRslt_qty_51]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_52_p_PPanel;
	public MCColumnConfig columnRslt_qty_52;// [Rslt]の[qty_52_p.qty]を[columnRslt_qty_52]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_53_p_PPanel;
	public MCColumnConfig columnRslt_qty_53;// [Rslt]の[qty_53_p.qty]を[columnRslt_qty_53]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_54_p_PPanel;
	public MCColumnConfig columnRslt_qty_54;// [Rslt]の[qty_54_p.qty]を[columnRslt_qty_54]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_55_p_PPanel;
	public MCColumnConfig columnRslt_qty_55;// [Rslt]の[qty_55_p.qty]を[columnRslt_qty_55]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_56_p_PPanel;
	public MCColumnConfig columnRslt_qty_56;// [Rslt]の[qty_56_p.qty]を[columnRslt_qty_56]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_57_p_PPanel;
	public MCColumnConfig columnRslt_qty_57;// [Rslt]の[qty_57_p.qty]を[columnRslt_qty_57]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_58_p_PPanel;
	public MCColumnConfig columnRslt_qty_58;// [Rslt]の[qty_58_p.qty]を[columnRslt_qty_58]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_59_p_PPanel;
	public MCColumnConfig columnRslt_qty_59;// [Rslt]の[qty_59_p.qty]を[columnRslt_qty_59]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_60_p_PPanel;
	public MCColumnConfig columnRslt_qty_60;// [Rslt]の[qty_60_p.qty]を[columnRslt_qty_60]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_61_p_PPanel;
	public MCColumnConfig columnRslt_qty_61;// [Rslt]の[qty_61_p.qty]を[columnRslt_qty_61]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_62_p_PPanel;
	public MCColumnConfig columnRslt_qty_62;// [Rslt]の[qty_62_p.qty]を[columnRslt_qty_62]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_63_p_PPanel;
	public MCColumnConfig columnRslt_qty_63;// [Rslt]の[qty_63_p.qty]を[columnRslt_qty_63]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_64_p_PPanel;
	public MCColumnConfig columnRslt_qty_64;// [Rslt]の[qty_64_p.qty]を[columnRslt_qty_64]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_65_p_PPanel;
	public MCColumnConfig columnRslt_qty_65;// [Rslt]の[qty_65_p.qty]を[columnRslt_qty_65]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_66_p_PPanel;
	public MCColumnConfig columnRslt_qty_66;// [Rslt]の[qty_66_p.qty]を[columnRslt_qty_66]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_67_p_PPanel;
	public MCColumnConfig columnRslt_qty_67;// [Rslt]の[qty_67_p.qty]を[columnRslt_qty_67]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_68_p_PPanel;
	public MCColumnConfig columnRslt_qty_68;// [Rslt]の[qty_68_p.qty]を[columnRslt_qty_68]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_69_p_PPanel;
	public MCColumnConfig columnRslt_qty_69;// [Rslt]の[qty_69_p.qty]を[columnRslt_qty_69]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_70_p_PPanel;
	public MCColumnConfig columnRslt_qty_70;// [Rslt]の[qty_70_p.qty]を[columnRslt_qty_70]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_71_p_PPanel;
	public MCColumnConfig columnRslt_qty_71;// [Rslt]の[qty_71_p.qty]を[columnRslt_qty_71]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_72_p_PPanel;
	public MCColumnConfig columnRslt_qty_72;// [Rslt]の[qty_72_p.qty]を[columnRslt_qty_72]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_73_p_PPanel;
	public MCColumnConfig columnRslt_qty_73;// [Rslt]の[qty_73_p.qty]を[columnRslt_qty_73]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_74_p_PPanel;
	public MCColumnConfig columnRslt_qty_74;// [Rslt]の[qty_74_p.qty]を[columnRslt_qty_74]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_75_p_PPanel;
	public MCColumnConfig columnRslt_qty_75;// [Rslt]の[qty_75_p.qty]を[columnRslt_qty_75]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_76_p_PPanel;
	public MCColumnConfig columnRslt_qty_76;// [Rslt]の[qty_76_p.qty]を[columnRslt_qty_76]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_77_p_PPanel;
	public MCColumnConfig columnRslt_qty_77;// [Rslt]の[qty_77_p.qty]を[columnRslt_qty_77]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_78_p_PPanel;
	public MCColumnConfig columnRslt_qty_78;// [Rslt]の[qty_78_p.qty]を[columnRslt_qty_78]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_79_p_PPanel;
	public MCColumnConfig columnRslt_qty_79;// [Rslt]の[qty_79_p.qty]を[columnRslt_qty_79]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_80_p_PPanel;
	public MCColumnConfig columnRslt_qty_80;// [Rslt]の[qty_80_p.qty]を[columnRslt_qty_80]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_81_p_PPanel;
	public MCColumnConfig columnRslt_qty_81;// [Rslt]の[qty_81_p.qty]を[columnRslt_qty_81]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_82_p_PPanel;
	public MCColumnConfig columnRslt_qty_82;// [Rslt]の[qty_82_p.qty]を[columnRslt_qty_82]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_83_p_PPanel;
	public MCColumnConfig columnRslt_qty_83;// [Rslt]の[qty_83_p.qty]を[columnRslt_qty_83]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_84_p_PPanel;
	public MCColumnConfig columnRslt_qty_84;// [Rslt]の[qty_84_p.qty]を[columnRslt_qty_84]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_85_p_PPanel;
	public MCColumnConfig columnRslt_qty_85;// [Rslt]の[qty_85_p.qty]を[columnRslt_qty_85]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_86_p_PPanel;
	public MCColumnConfig columnRslt_qty_86;// [Rslt]の[qty_86_p.qty]を[columnRslt_qty_86]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_87_p_PPanel;
	public MCColumnConfig columnRslt_qty_87;// [Rslt]の[qty_87_p.qty]を[columnRslt_qty_87]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_88_p_PPanel;
	public MCColumnConfig columnRslt_qty_88;// [Rslt]の[qty_88_p.qty]を[columnRslt_qty_88]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_89_p_PPanel;
	public MCColumnConfig columnRslt_qty_89;// [Rslt]の[qty_89_p.qty]を[columnRslt_qty_89]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_90_p_PPanel;
	public MCColumnConfig columnRslt_qty_90;// [Rslt]の[qty_90_p.qty]を[columnRslt_qty_90]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_91_p_PPanel;
	public MCColumnConfig columnRslt_qty_91;// [Rslt]の[qty_91_p.qty]を[columnRslt_qty_91]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_92_p_PPanel;
	public MCColumnConfig columnRslt_qty_92;// [Rslt]の[qty_92_p.qty]を[columnRslt_qty_92]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_qty_93_p_PPanel;
	public MCColumnConfig columnRslt_qty_93;// [Rslt]の[qty_93_p.qty]を[columnRslt_qty_93]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_record_id = null;
	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_record_grp_id = null;
	// [ReqRslt]ブロック関連のField定義
	public MCPanel ReqRsltPanel = null;
	public MCScrollPane ReqRsltScrollPane = null;
	public MCTable2<mcframe.clientMSBC.MSBCP0020.ReqRsltR> ReqRsltTable = null;
	// [ReqRslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_check = null;
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_hdr_peg_no = null;
	/**
	 * Numbering SEIBAN No. 手配ＮＯ発番.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_sno_sprt_flg = null;
	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_rqmt_no = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D ReqRslt_rqmt_qty_p_PPanel;
	public MCColumnConfig columnReqRslt_rqmt_qty;// [ReqRslt]の[rqmt_qty_p.qty]を[columnReqRslt_rqmt_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_dec_place = null;
	/**
	 * Due date 納期.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_due_dt = null;
	/**
	 * Delivery date_[Before change] 納期_[変更前].<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_old_due_dt = null;
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_sno4_mng_typ = null;
	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_sno1_num_typ = null;
	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_sno2_num_typ = null;
	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_sno3_num_typ = null;
	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_sno4_num_typ = null;
	/**
	 * Requirements SEIBAN No. 1 required 所要手配ＮＯ１必須.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_rqmt_sno1_flg = null;
	/**
	 * Requirements SEIBAN No. 2 required 所要手配ＮＯ２必須.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_rqmt_sno2_flg = null;
	/**
	 * Requirements SEIBAN No. 3 required 所要手配ＮＯ３必須.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_rqmt_sno3_flg = null;
	/**
	 * Requirements SEIBAN No. 4 required 所要手配ＮＯ４必須.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_rqmt_sno4_flg = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D ReqRslt_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnReqRslt_sno1;// [ReqRslt]の[sno_wrk_no_p.sno1]を[columnReqRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_sno2;// [ReqRslt]の[sno_wrk_no_p.sno2]を[columnReqRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_sno3;// [ReqRslt]の[sno_wrk_no_p.sno3]を[columnReqRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_sno4;// [ReqRslt]の[sno_wrk_no_p.sno4]を[columnReqRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_wrk_no;// [ReqRslt]の[sno_wrk_no_p.wrk_no]を[columnReqRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_wrk_nm;// [ReqRslt]の[sno_wrk_no_p.wrk_nm]を[columnReqRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_fix_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D ReqRslt_itm_p_PPanel;
	public MCColumnConfig columnReqRslt_itm_cd;// [ReqRslt]の[itm_p.itm_cd]を[columnReqRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_sub1;// [ReqRslt]の[itm_p.itm_sub1]を[columnReqRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_sub2;// [ReqRslt]の[itm_p.itm_sub2]を[columnReqRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_sub3;// [ReqRslt]の[itm_p.itm_sub3]を[columnReqRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_nm;// [ReqRslt]の[itm_p.itm_nm]を[columnReqRslt_itm_nm]としてエイリアス定義。
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_mfg_loc_nm = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_sppl_nm = null;
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_rqst_loc_cd = null;
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_rqst_loc_nm = null;
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_rqst_wg_cd = null;
	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_rqst_wg_nm = null;
	/**
	 * Generate-from type 生成元区分.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_rqmt_gnrt_typ = null;
	/**
	 * Generate-from type name 生成元区分名.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_rqmt_gnrt_typ_nm = null;
	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_rqmt_typ = null;
	/**
	 * Requirements type name 所要区分名.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_rqmt_typ_nm = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_intr_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_sub_char3 = null;
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_strg_loc_cd = null;
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_strg_loc_nm = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_site_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_wg_nm = null;
	/**
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_strg_loc_grp_cd = null;
	/**
	 * Storage location group name 格納場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_strg_loc_grp_nm = null;
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_itm_typ_d_nm = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D ReqRslt_rts_msg_p_PPanel;
	public MCColumnConfig columnReqRslt_rtn_sts_typ;// [ReqRslt]の[rts_msg_p.rtn_sts_typ]を[columnReqRslt_rtn_sts_typ]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D ReqRslt_itm_grp_p_PPanel;
	public MCColumnConfig columnReqRslt_itm_grp_cd1;// [ReqRslt]の[itm_grp_p.itm_grp_cd1]を[columnReqRslt_itm_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_grp_nm1;// [ReqRslt]の[itm_grp_p.itm_grp_nm1]を[columnReqRslt_itm_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_grp_cd2;// [ReqRslt]の[itm_grp_p.itm_grp_cd2]を[columnReqRslt_itm_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_grp_nm2;// [ReqRslt]の[itm_grp_p.itm_grp_nm2]を[columnReqRslt_itm_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_grp_cd3;// [ReqRslt]の[itm_grp_p.itm_grp_cd3]を[columnReqRslt_itm_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_grp_nm3;// [ReqRslt]の[itm_grp_p.itm_grp_nm3]を[columnReqRslt_itm_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_grp_cd4;// [ReqRslt]の[itm_grp_p.itm_grp_cd4]を[columnReqRslt_itm_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_grp_nm4;// [ReqRslt]の[itm_grp_p.itm_grp_nm4]を[columnReqRslt_itm_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_grp_cd5;// [ReqRslt]の[itm_grp_p.itm_grp_cd5]を[columnReqRslt_itm_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_grp_nm5;// [ReqRslt]の[itm_grp_p.itm_grp_nm5]を[columnReqRslt_itm_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_grp_cd6;// [ReqRslt]の[itm_grp_p.itm_grp_cd6]を[columnReqRslt_itm_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_grp_nm6;// [ReqRslt]の[itm_grp_p.itm_grp_nm6]を[columnReqRslt_itm_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_grp_cd7;// [ReqRslt]の[itm_grp_p.itm_grp_cd7]を[columnReqRslt_itm_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_grp_nm7;// [ReqRslt]の[itm_grp_p.itm_grp_nm7]を[columnReqRslt_itm_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_grp_cd8;// [ReqRslt]の[itm_grp_p.itm_grp_cd8]を[columnReqRslt_itm_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_grp_nm8;// [ReqRslt]の[itm_grp_p.itm_grp_nm8]を[columnReqRslt_itm_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_grp_cd9;// [ReqRslt]の[itm_grp_p.itm_grp_cd9]を[columnReqRslt_itm_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_grp_nm9;// [ReqRslt]の[itm_grp_p.itm_grp_nm9]を[columnReqRslt_itm_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_grp_cd10;// [ReqRslt]の[itm_grp_p.itm_grp_cd10]を[columnReqRslt_itm_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnReqRslt_itm_grp_nm10;// [ReqRslt]の[itm_grp_p.itm_grp_nm10]を[columnReqRslt_itm_grp_nm10]としてエイリアス定義。
	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_mps_grp_cd = null;
	/**
	 * MPS group name ＭＰＳグループ名.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_mps_grp_nm = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_ins_ts = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnReqRslt_upd_srv_req_no = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Numbering SEIBAN No. 手配ＮＯ発番.<p>
	 *
	 */
	public MCButton Btn_sprt_sno = null;
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
	public MCButton Btn_upd = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
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
	public static final String[] statusArray = new String[]{UPD, SRCH_DEL, DEL, SRCH, REF};
	
	/** [MS_MSBCL0020_Srch01]のCallerの作成 */
	protected MSBCP_MstrPlnReg_MC.MS_MSBCL0020_Srch01Caller createMS_MSBCL0020_Srch01() {
		MSBCP_MstrPlnReg_MC.MS_MSBCL0020_Srch01Caller<MSBCP_MstrPlnReg, MS_MSBCL0020_Srch01Bridge>
		caller = ((MSBCP_MstrPlnReg_MC)this).new MS_MSBCL0020_Srch01Caller<MSBCP_MstrPlnReg, MS_MSBCL0020_Srch01Bridge>(
					(MSBCP_MstrPlnReg)this, new MS_MSBCL0020_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBCL0020_Srch01]の呼び出し */
	protected void callMS_MSBCL0020_Srch01() {
		MCCaller caller = createMS_MSBCL0020_Srch01();
		caller.exec();
	}
	/** [MS_MSBCL0020_Sprt01]のCallerの作成 */
	protected MSBCP_MstrPlnReg_MC.MS_MSBCL0020_Sprt01Caller createMS_MSBCL0020_Sprt01() {
		MSBCP_MstrPlnReg_MC.MS_MSBCL0020_Sprt01Caller<MSBCP_MstrPlnReg, MS_MSBCL0020_Sprt01Bridge>
		caller = ((MSBCP_MstrPlnReg_MC)this).new MS_MSBCL0020_Sprt01Caller<MSBCP_MstrPlnReg, MS_MSBCL0020_Sprt01Bridge>(
					(MSBCP_MstrPlnReg)this, new MS_MSBCL0020_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBCL0020_Sprt01]の呼び出し */
	protected void callMS_MSBCL0020_Sprt01() {
		MCCaller caller = createMS_MSBCL0020_Sprt01();
		caller.exec();
	}
	/** [MS_MSBCL0020_Upd01]のCallerの作成 */
	protected MSBCP_MstrPlnReg_MC.MS_MSBCL0020_Upd01Caller createMS_MSBCL0020_Upd01() {
		MSBCP_MstrPlnReg_MC.MS_MSBCL0020_Upd01Caller<MSBCP_MstrPlnReg, MS_MSBCL0020_Upd01Bridge>
		caller = ((MSBCP_MstrPlnReg_MC)this).new MS_MSBCL0020_Upd01Caller<MSBCP_MstrPlnReg, MS_MSBCL0020_Upd01Bridge>(
					(MSBCP_MstrPlnReg)this, new MS_MSBCL0020_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBCL0020_Upd01]の呼び出し */
	protected void callMS_MSBCL0020_Upd01() {
		MCCaller caller = createMS_MSBCL0020_Upd01();
		caller.exec();
	}
	/** [MS_MSBCL0020_Del01]のCallerの作成 */
	protected MSBCP_MstrPlnReg_MC.MS_MSBCL0020_Del01Caller createMS_MSBCL0020_Del01() {
		MSBCP_MstrPlnReg_MC.MS_MSBCL0020_Del01Caller<MSBCP_MstrPlnReg, MS_MSBCL0020_Del01Bridge>
		caller = ((MSBCP_MstrPlnReg_MC)this).new MS_MSBCL0020_Del01Caller<MSBCP_MstrPlnReg, MS_MSBCL0020_Del01Bridge>(
					(MSBCP_MstrPlnReg)this, new MS_MSBCL0020_Del01Bridge());
		return caller;
	}
	/** [MS_MSBCL0020_Del01]の呼び出し */
	protected void callMS_MSBCL0020_Del01() {
		MCCaller caller = createMS_MSBCL0020_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP0020.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0020.RsltR> aRsltL;
	/** [Pln]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0020.PlnR> aPlnL;
	/** [ReqRslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR> aReqRsltL;
	/** [MpsMaxRslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0020.RsltR> aMpsMaxRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBC.MSBCP0020.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0020.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0020.CndR createCndR() {
		return mcframe.clientMSBC.MSBCP0020.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBC.MSBCP0020.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0020.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBC.MSBCP0020.RsltR createRsltR() {
		return mcframe.clientMSBC.MSBCP0020.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0020.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0020.RsltR.class);
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
	 * コピーによってaPlnLを設定します。
	 *
	 * aPlnLのインスタンスは変更されません。
	 *
	 * @param dataset PlnL
	 */
	public void setPlnL(MCList<mcframe.clientMSBC.MSBCP0020.PlnR> aList) {
		if (getPlnL() != aList) {
			getPlnL().setAll(aList);
		}
	}

	/**
	 * [Pln]ブロックのコンテナaPlnLを返します。
	 *
	 * @return PlnL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0020.PlnR> getPlnL() {
		return aPlnL;
	}

	/**
	 * aPlnRを作成します。
	 *
	 * @return PlnR
	 */
	public mcframe.clientMSBC.MSBCP0020.PlnR createPlnR() {
		return mcframe.clientMSBC.MSBCP0020.PlnR.create();
	}

	/**
	 * aPlnLを作成します。
	 *
	 * @return PlnL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0020.PlnR> createPlnL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0020.PlnR.class);
	}

	/**
	 * コピーによってaReqRsltLを設定します。
	 *
	 * aReqRsltLのインスタンスは変更されません。
	 *
	 * @param dataset ReqRsltL
	 */
	public void setReqRsltL(MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR> aList) {
		if (getReqRsltL() != aList) {
			getReqRsltL().setAll(aList);
		}
	}

	/**
	 * [ReqRslt]ブロックのコンテナaReqRsltLを返します。
	 *
	 * @return ReqRsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR> getReqRsltL() {
		return aReqRsltL;
	}

	/**
	 * aReqRsltRを作成します。
	 *
	 * @return ReqRsltR
	 */
	public mcframe.clientMSBC.MSBCP0020.ReqRsltR createReqRsltR() {
		return mcframe.clientMSBC.MSBCP0020.ReqRsltR.create();
	}

	/**
	 * aReqRsltLを作成します。
	 *
	 * @return ReqRsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR> createReqRsltL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0020.ReqRsltR.class);
	}

	/**
	 * ReqRsltTableを初期化します。
	 */
	protected void createReqRsltTable(){
		if(ReqRsltTable == null){
			ReqRsltTable = beansFactory.createTable2("ReqRslt.table");
		}
	}

	/**
	 * コピーによってaMpsMaxRsltLを設定します。
	 *
	 * aMpsMaxRsltLのインスタンスは変更されません。
	 *
	 * @param dataset MpsMaxRsltL
	 */
	public void setMpsMaxRsltL(MCList<mcframe.clientMSBC.MSBCP0020.RsltR> aList) {
		if (getMpsMaxRsltL() != aList) {
			getMpsMaxRsltL().setAll(aList);
		}
	}

	/**
	 * [MpsMaxRslt]ブロックのコンテナaMpsMaxRsltLを返します。
	 *
	 * @return MpsMaxRsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0020.RsltR> getMpsMaxRsltL() {
		return aMpsMaxRsltL;
	}

	/**
	 * aMpsMaxRsltRを作成します。
	 *
	 * @return MpsMaxRsltR
	 */
	public mcframe.clientMSBC.MSBCP0020.RsltR createMpsMaxRsltR() {
		return mcframe.clientMSBC.MSBCP0020.RsltR.create();
	}

	/**
	 * aMpsMaxRsltLを作成します。
	 *
	 * @return MpsMaxRsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0020.RsltR> createMpsMaxRsltL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0020.RsltR.class);
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
		if(!MCCollectionUtil.contains(ret, getPlnL())) ret.add(getPlnL());
		if(!MCCollectionUtil.contains(ret, getReqRsltL())) ret.add(getReqRsltL());
		if(!MCCollectionUtil.contains(ret, getMpsMaxRsltL())) ret.add(getMpsMaxRsltL());
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
		if(aCnt == getPlnL()) return "Pln";
		if(aCnt == getReqRsltL()) return "ReqRslt";
		if(aCnt == getMpsMaxRsltL()) return "MpsMaxRslt";
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
		if(bId.equals("Pln")) return getPlnL();
		if(bId.equals("ReqRslt")) return getReqRsltL();
		if(bId.equals("MpsMaxRslt")) return getMpsMaxRsltL();
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
		ret.add(ReqRsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_MstrPlnReg_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aPlnL = createPlnL();
		aReqRsltL = createReqRsltL();
		aMpsMaxRsltL = createMpsMaxRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_MstrPlnReg_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aPlnL = createPlnL();
		aReqRsltL = createReqRsltL();
		createReqRsltTable();
		ReqRsltTable.setRowName(name);
		aMpsMaxRsltL = createMpsMaxRsltL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBCP_MstrPlnReg_MC.jbCreateScreenOpe((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbCreateTop((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbCreateFold((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbCreateTab1((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbCreateTab2((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbCreateCnd((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbCreateCnd2((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbCreateLPnl((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbCreateCtrl((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbCreateRslt((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbCreateReqRslt((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbCreateBtn((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbCreateEastBtn((MSBCP_MstrPlnReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBCP_MstrPlnReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBCP_MstrPlnReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBCP_MstrPlnReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBCP_MstrPlnReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBCP_MstrPlnReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBCP_MstrPlnReg p) {
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
	protected static void jbCreateCnd2(MSBCP_MstrPlnReg p) {
	}

	/**
	 * [LPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLPnl(MSBCP_MstrPlnReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBCP_MstrPlnReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBCP_MstrPlnReg p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$itm_p);
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
		p.Rslt_qty_00_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_00_p);
		p.Rslt_qty_00_p_PPanel.setName("Rslt.qty_00_p");
		p.columnRslt_qty_00 = p.Rslt_qty_00_p_PPanel.columnQty_qty;
		p.columnRslt_qty_00.addAliasName("Rslt.qty_00", p);
		p.Rslt_qty_01_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_01_p);
		p.Rslt_qty_01_p_PPanel.setName("Rslt.qty_01_p");
		p.columnRslt_qty_01 = p.Rslt_qty_01_p_PPanel.columnQty_qty;
		p.columnRslt_qty_01.addAliasName("Rslt.qty_01", p);
		p.Rslt_qty_02_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_02_p);
		p.Rslt_qty_02_p_PPanel.setName("Rslt.qty_02_p");
		p.columnRslt_qty_02 = p.Rslt_qty_02_p_PPanel.columnQty_qty;
		p.columnRslt_qty_02.addAliasName("Rslt.qty_02", p);
		p.Rslt_qty_03_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_03_p);
		p.Rslt_qty_03_p_PPanel.setName("Rslt.qty_03_p");
		p.columnRslt_qty_03 = p.Rslt_qty_03_p_PPanel.columnQty_qty;
		p.columnRslt_qty_03.addAliasName("Rslt.qty_03", p);
		p.Rslt_qty_04_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_04_p);
		p.Rslt_qty_04_p_PPanel.setName("Rslt.qty_04_p");
		p.columnRslt_qty_04 = p.Rslt_qty_04_p_PPanel.columnQty_qty;
		p.columnRslt_qty_04.addAliasName("Rslt.qty_04", p);
		p.Rslt_qty_05_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_05_p);
		p.Rslt_qty_05_p_PPanel.setName("Rslt.qty_05_p");
		p.columnRslt_qty_05 = p.Rslt_qty_05_p_PPanel.columnQty_qty;
		p.columnRslt_qty_05.addAliasName("Rslt.qty_05", p);
		p.Rslt_qty_06_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_06_p);
		p.Rslt_qty_06_p_PPanel.setName("Rslt.qty_06_p");
		p.columnRslt_qty_06 = p.Rslt_qty_06_p_PPanel.columnQty_qty;
		p.columnRslt_qty_06.addAliasName("Rslt.qty_06", p);
		p.Rslt_qty_07_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_07_p);
		p.Rslt_qty_07_p_PPanel.setName("Rslt.qty_07_p");
		p.columnRslt_qty_07 = p.Rslt_qty_07_p_PPanel.columnQty_qty;
		p.columnRslt_qty_07.addAliasName("Rslt.qty_07", p);
		p.Rslt_qty_08_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_08_p);
		p.Rslt_qty_08_p_PPanel.setName("Rslt.qty_08_p");
		p.columnRslt_qty_08 = p.Rslt_qty_08_p_PPanel.columnQty_qty;
		p.columnRslt_qty_08.addAliasName("Rslt.qty_08", p);
		p.Rslt_qty_09_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_09_p);
		p.Rslt_qty_09_p_PPanel.setName("Rslt.qty_09_p");
		p.columnRslt_qty_09 = p.Rslt_qty_09_p_PPanel.columnQty_qty;
		p.columnRslt_qty_09.addAliasName("Rslt.qty_09", p);
		p.Rslt_qty_10_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_10_p);
		p.Rslt_qty_10_p_PPanel.setName("Rslt.qty_10_p");
		p.columnRslt_qty_10 = p.Rslt_qty_10_p_PPanel.columnQty_qty;
		p.columnRslt_qty_10.addAliasName("Rslt.qty_10", p);
		p.Rslt_qty_11_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_11_p);
		p.Rslt_qty_11_p_PPanel.setName("Rslt.qty_11_p");
		p.columnRslt_qty_11 = p.Rslt_qty_11_p_PPanel.columnQty_qty;
		p.columnRslt_qty_11.addAliasName("Rslt.qty_11", p);
		p.Rslt_qty_12_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_12_p);
		p.Rslt_qty_12_p_PPanel.setName("Rslt.qty_12_p");
		p.columnRslt_qty_12 = p.Rslt_qty_12_p_PPanel.columnQty_qty;
		p.columnRslt_qty_12.addAliasName("Rslt.qty_12", p);
		p.Rslt_qty_13_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_13_p);
		p.Rslt_qty_13_p_PPanel.setName("Rslt.qty_13_p");
		p.columnRslt_qty_13 = p.Rslt_qty_13_p_PPanel.columnQty_qty;
		p.columnRslt_qty_13.addAliasName("Rslt.qty_13", p);
		p.Rslt_qty_14_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_14_p);
		p.Rslt_qty_14_p_PPanel.setName("Rslt.qty_14_p");
		p.columnRslt_qty_14 = p.Rslt_qty_14_p_PPanel.columnQty_qty;
		p.columnRslt_qty_14.addAliasName("Rslt.qty_14", p);
		p.Rslt_qty_15_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_15_p);
		p.Rslt_qty_15_p_PPanel.setName("Rslt.qty_15_p");
		p.columnRslt_qty_15 = p.Rslt_qty_15_p_PPanel.columnQty_qty;
		p.columnRslt_qty_15.addAliasName("Rslt.qty_15", p);
		p.Rslt_qty_16_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_16_p);
		p.Rslt_qty_16_p_PPanel.setName("Rslt.qty_16_p");
		p.columnRslt_qty_16 = p.Rslt_qty_16_p_PPanel.columnQty_qty;
		p.columnRslt_qty_16.addAliasName("Rslt.qty_16", p);
		p.Rslt_qty_17_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_17_p);
		p.Rslt_qty_17_p_PPanel.setName("Rslt.qty_17_p");
		p.columnRslt_qty_17 = p.Rslt_qty_17_p_PPanel.columnQty_qty;
		p.columnRslt_qty_17.addAliasName("Rslt.qty_17", p);
		p.Rslt_qty_18_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_18_p);
		p.Rslt_qty_18_p_PPanel.setName("Rslt.qty_18_p");
		p.columnRslt_qty_18 = p.Rslt_qty_18_p_PPanel.columnQty_qty;
		p.columnRslt_qty_18.addAliasName("Rslt.qty_18", p);
		p.Rslt_qty_19_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_19_p);
		p.Rslt_qty_19_p_PPanel.setName("Rslt.qty_19_p");
		p.columnRslt_qty_19 = p.Rslt_qty_19_p_PPanel.columnQty_qty;
		p.columnRslt_qty_19.addAliasName("Rslt.qty_19", p);
		p.Rslt_qty_20_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_20_p);
		p.Rslt_qty_20_p_PPanel.setName("Rslt.qty_20_p");
		p.columnRslt_qty_20 = p.Rslt_qty_20_p_PPanel.columnQty_qty;
		p.columnRslt_qty_20.addAliasName("Rslt.qty_20", p);
		p.Rslt_qty_21_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_21_p);
		p.Rslt_qty_21_p_PPanel.setName("Rslt.qty_21_p");
		p.columnRslt_qty_21 = p.Rslt_qty_21_p_PPanel.columnQty_qty;
		p.columnRslt_qty_21.addAliasName("Rslt.qty_21", p);
		p.Rslt_qty_22_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_22_p);
		p.Rslt_qty_22_p_PPanel.setName("Rslt.qty_22_p");
		p.columnRslt_qty_22 = p.Rslt_qty_22_p_PPanel.columnQty_qty;
		p.columnRslt_qty_22.addAliasName("Rslt.qty_22", p);
		p.Rslt_qty_23_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_23_p);
		p.Rslt_qty_23_p_PPanel.setName("Rslt.qty_23_p");
		p.columnRslt_qty_23 = p.Rslt_qty_23_p_PPanel.columnQty_qty;
		p.columnRslt_qty_23.addAliasName("Rslt.qty_23", p);
		p.Rslt_qty_24_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_24_p);
		p.Rslt_qty_24_p_PPanel.setName("Rslt.qty_24_p");
		p.columnRslt_qty_24 = p.Rslt_qty_24_p_PPanel.columnQty_qty;
		p.columnRslt_qty_24.addAliasName("Rslt.qty_24", p);
		p.Rslt_qty_25_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_25_p);
		p.Rslt_qty_25_p_PPanel.setName("Rslt.qty_25_p");
		p.columnRslt_qty_25 = p.Rslt_qty_25_p_PPanel.columnQty_qty;
		p.columnRslt_qty_25.addAliasName("Rslt.qty_25", p);
		p.Rslt_qty_26_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_26_p);
		p.Rslt_qty_26_p_PPanel.setName("Rslt.qty_26_p");
		p.columnRslt_qty_26 = p.Rslt_qty_26_p_PPanel.columnQty_qty;
		p.columnRslt_qty_26.addAliasName("Rslt.qty_26", p);
		p.Rslt_qty_27_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_27_p);
		p.Rslt_qty_27_p_PPanel.setName("Rslt.qty_27_p");
		p.columnRslt_qty_27 = p.Rslt_qty_27_p_PPanel.columnQty_qty;
		p.columnRslt_qty_27.addAliasName("Rslt.qty_27", p);
		p.Rslt_qty_28_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_28_p);
		p.Rslt_qty_28_p_PPanel.setName("Rslt.qty_28_p");
		p.columnRslt_qty_28 = p.Rslt_qty_28_p_PPanel.columnQty_qty;
		p.columnRslt_qty_28.addAliasName("Rslt.qty_28", p);
		p.Rslt_qty_29_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_29_p);
		p.Rslt_qty_29_p_PPanel.setName("Rslt.qty_29_p");
		p.columnRslt_qty_29 = p.Rslt_qty_29_p_PPanel.columnQty_qty;
		p.columnRslt_qty_29.addAliasName("Rslt.qty_29", p);
		p.Rslt_qty_30_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_30_p);
		p.Rslt_qty_30_p_PPanel.setName("Rslt.qty_30_p");
		p.columnRslt_qty_30 = p.Rslt_qty_30_p_PPanel.columnQty_qty;
		p.columnRslt_qty_30.addAliasName("Rslt.qty_30", p);
		p.Rslt_qty_31_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_31_p);
		p.Rslt_qty_31_p_PPanel.setName("Rslt.qty_31_p");
		p.columnRslt_qty_31 = p.Rslt_qty_31_p_PPanel.columnQty_qty;
		p.columnRslt_qty_31.addAliasName("Rslt.qty_31", p);
		p.Rslt_qty_32_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_32_p);
		p.Rslt_qty_32_p_PPanel.setName("Rslt.qty_32_p");
		p.columnRslt_qty_32 = p.Rslt_qty_32_p_PPanel.columnQty_qty;
		p.columnRslt_qty_32.addAliasName("Rslt.qty_32", p);
		p.Rslt_qty_33_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_33_p);
		p.Rslt_qty_33_p_PPanel.setName("Rslt.qty_33_p");
		p.columnRslt_qty_33 = p.Rslt_qty_33_p_PPanel.columnQty_qty;
		p.columnRslt_qty_33.addAliasName("Rslt.qty_33", p);
		p.Rslt_qty_34_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_34_p);
		p.Rslt_qty_34_p_PPanel.setName("Rslt.qty_34_p");
		p.columnRslt_qty_34 = p.Rslt_qty_34_p_PPanel.columnQty_qty;
		p.columnRslt_qty_34.addAliasName("Rslt.qty_34", p);
		p.Rslt_qty_35_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_35_p);
		p.Rslt_qty_35_p_PPanel.setName("Rslt.qty_35_p");
		p.columnRslt_qty_35 = p.Rslt_qty_35_p_PPanel.columnQty_qty;
		p.columnRslt_qty_35.addAliasName("Rslt.qty_35", p);
		p.Rslt_qty_36_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_36_p);
		p.Rslt_qty_36_p_PPanel.setName("Rslt.qty_36_p");
		p.columnRslt_qty_36 = p.Rslt_qty_36_p_PPanel.columnQty_qty;
		p.columnRslt_qty_36.addAliasName("Rslt.qty_36", p);
		p.Rslt_qty_37_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_37_p);
		p.Rslt_qty_37_p_PPanel.setName("Rslt.qty_37_p");
		p.columnRslt_qty_37 = p.Rslt_qty_37_p_PPanel.columnQty_qty;
		p.columnRslt_qty_37.addAliasName("Rslt.qty_37", p);
		p.Rslt_qty_38_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_38_p);
		p.Rslt_qty_38_p_PPanel.setName("Rslt.qty_38_p");
		p.columnRslt_qty_38 = p.Rslt_qty_38_p_PPanel.columnQty_qty;
		p.columnRslt_qty_38.addAliasName("Rslt.qty_38", p);
		p.Rslt_qty_39_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_39_p);
		p.Rslt_qty_39_p_PPanel.setName("Rslt.qty_39_p");
		p.columnRslt_qty_39 = p.Rslt_qty_39_p_PPanel.columnQty_qty;
		p.columnRslt_qty_39.addAliasName("Rslt.qty_39", p);
		p.Rslt_qty_40_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_40_p);
		p.Rslt_qty_40_p_PPanel.setName("Rslt.qty_40_p");
		p.columnRslt_qty_40 = p.Rslt_qty_40_p_PPanel.columnQty_qty;
		p.columnRslt_qty_40.addAliasName("Rslt.qty_40", p);
		p.Rslt_qty_41_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_41_p);
		p.Rslt_qty_41_p_PPanel.setName("Rslt.qty_41_p");
		p.columnRslt_qty_41 = p.Rslt_qty_41_p_PPanel.columnQty_qty;
		p.columnRslt_qty_41.addAliasName("Rslt.qty_41", p);
		p.Rslt_qty_42_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_42_p);
		p.Rslt_qty_42_p_PPanel.setName("Rslt.qty_42_p");
		p.columnRslt_qty_42 = p.Rslt_qty_42_p_PPanel.columnQty_qty;
		p.columnRslt_qty_42.addAliasName("Rslt.qty_42", p);
		p.Rslt_qty_43_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_43_p);
		p.Rslt_qty_43_p_PPanel.setName("Rslt.qty_43_p");
		p.columnRslt_qty_43 = p.Rslt_qty_43_p_PPanel.columnQty_qty;
		p.columnRslt_qty_43.addAliasName("Rslt.qty_43", p);
		p.Rslt_qty_44_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_44_p);
		p.Rslt_qty_44_p_PPanel.setName("Rslt.qty_44_p");
		p.columnRslt_qty_44 = p.Rslt_qty_44_p_PPanel.columnQty_qty;
		p.columnRslt_qty_44.addAliasName("Rslt.qty_44", p);
		p.Rslt_qty_45_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_45_p);
		p.Rslt_qty_45_p_PPanel.setName("Rslt.qty_45_p");
		p.columnRslt_qty_45 = p.Rslt_qty_45_p_PPanel.columnQty_qty;
		p.columnRslt_qty_45.addAliasName("Rslt.qty_45", p);
		p.Rslt_qty_46_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_46_p);
		p.Rslt_qty_46_p_PPanel.setName("Rslt.qty_46_p");
		p.columnRslt_qty_46 = p.Rslt_qty_46_p_PPanel.columnQty_qty;
		p.columnRslt_qty_46.addAliasName("Rslt.qty_46", p);
		p.Rslt_qty_47_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_47_p);
		p.Rslt_qty_47_p_PPanel.setName("Rslt.qty_47_p");
		p.columnRslt_qty_47 = p.Rslt_qty_47_p_PPanel.columnQty_qty;
		p.columnRslt_qty_47.addAliasName("Rslt.qty_47", p);
		p.Rslt_qty_48_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_48_p);
		p.Rslt_qty_48_p_PPanel.setName("Rslt.qty_48_p");
		p.columnRslt_qty_48 = p.Rslt_qty_48_p_PPanel.columnQty_qty;
		p.columnRslt_qty_48.addAliasName("Rslt.qty_48", p);
		p.Rslt_qty_49_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_49_p);
		p.Rslt_qty_49_p_PPanel.setName("Rslt.qty_49_p");
		p.columnRslt_qty_49 = p.Rslt_qty_49_p_PPanel.columnQty_qty;
		p.columnRslt_qty_49.addAliasName("Rslt.qty_49", p);
		p.Rslt_qty_50_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_50_p);
		p.Rslt_qty_50_p_PPanel.setName("Rslt.qty_50_p");
		p.columnRslt_qty_50 = p.Rslt_qty_50_p_PPanel.columnQty_qty;
		p.columnRslt_qty_50.addAliasName("Rslt.qty_50", p);
		p.Rslt_qty_51_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_51_p);
		p.Rslt_qty_51_p_PPanel.setName("Rslt.qty_51_p");
		p.columnRslt_qty_51 = p.Rslt_qty_51_p_PPanel.columnQty_qty;
		p.columnRslt_qty_51.addAliasName("Rslt.qty_51", p);
		p.Rslt_qty_52_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_52_p);
		p.Rslt_qty_52_p_PPanel.setName("Rslt.qty_52_p");
		p.columnRslt_qty_52 = p.Rslt_qty_52_p_PPanel.columnQty_qty;
		p.columnRslt_qty_52.addAliasName("Rslt.qty_52", p);
		p.Rslt_qty_53_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_53_p);
		p.Rslt_qty_53_p_PPanel.setName("Rslt.qty_53_p");
		p.columnRslt_qty_53 = p.Rslt_qty_53_p_PPanel.columnQty_qty;
		p.columnRslt_qty_53.addAliasName("Rslt.qty_53", p);
		p.Rslt_qty_54_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_54_p);
		p.Rslt_qty_54_p_PPanel.setName("Rslt.qty_54_p");
		p.columnRslt_qty_54 = p.Rslt_qty_54_p_PPanel.columnQty_qty;
		p.columnRslt_qty_54.addAliasName("Rslt.qty_54", p);
		p.Rslt_qty_55_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_55_p);
		p.Rslt_qty_55_p_PPanel.setName("Rslt.qty_55_p");
		p.columnRslt_qty_55 = p.Rslt_qty_55_p_PPanel.columnQty_qty;
		p.columnRslt_qty_55.addAliasName("Rslt.qty_55", p);
		p.Rslt_qty_56_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_56_p);
		p.Rslt_qty_56_p_PPanel.setName("Rslt.qty_56_p");
		p.columnRslt_qty_56 = p.Rslt_qty_56_p_PPanel.columnQty_qty;
		p.columnRslt_qty_56.addAliasName("Rslt.qty_56", p);
		p.Rslt_qty_57_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_57_p);
		p.Rslt_qty_57_p_PPanel.setName("Rslt.qty_57_p");
		p.columnRslt_qty_57 = p.Rslt_qty_57_p_PPanel.columnQty_qty;
		p.columnRslt_qty_57.addAliasName("Rslt.qty_57", p);
		p.Rslt_qty_58_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_58_p);
		p.Rslt_qty_58_p_PPanel.setName("Rslt.qty_58_p");
		p.columnRslt_qty_58 = p.Rslt_qty_58_p_PPanel.columnQty_qty;
		p.columnRslt_qty_58.addAliasName("Rslt.qty_58", p);
		p.Rslt_qty_59_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_59_p);
		p.Rslt_qty_59_p_PPanel.setName("Rslt.qty_59_p");
		p.columnRslt_qty_59 = p.Rslt_qty_59_p_PPanel.columnQty_qty;
		p.columnRslt_qty_59.addAliasName("Rslt.qty_59", p);
		p.Rslt_qty_60_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_60_p);
		p.Rslt_qty_60_p_PPanel.setName("Rslt.qty_60_p");
		p.columnRslt_qty_60 = p.Rslt_qty_60_p_PPanel.columnQty_qty;
		p.columnRslt_qty_60.addAliasName("Rslt.qty_60", p);
		p.Rslt_qty_61_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_61_p);
		p.Rslt_qty_61_p_PPanel.setName("Rslt.qty_61_p");
		p.columnRslt_qty_61 = p.Rslt_qty_61_p_PPanel.columnQty_qty;
		p.columnRslt_qty_61.addAliasName("Rslt.qty_61", p);
		p.Rslt_qty_62_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_62_p);
		p.Rslt_qty_62_p_PPanel.setName("Rslt.qty_62_p");
		p.columnRslt_qty_62 = p.Rslt_qty_62_p_PPanel.columnQty_qty;
		p.columnRslt_qty_62.addAliasName("Rslt.qty_62", p);
		p.Rslt_qty_63_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_63_p);
		p.Rslt_qty_63_p_PPanel.setName("Rslt.qty_63_p");
		p.columnRslt_qty_63 = p.Rslt_qty_63_p_PPanel.columnQty_qty;
		p.columnRslt_qty_63.addAliasName("Rslt.qty_63", p);
		p.Rslt_qty_64_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_64_p);
		p.Rslt_qty_64_p_PPanel.setName("Rslt.qty_64_p");
		p.columnRslt_qty_64 = p.Rslt_qty_64_p_PPanel.columnQty_qty;
		p.columnRslt_qty_64.addAliasName("Rslt.qty_64", p);
		p.Rslt_qty_65_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_65_p);
		p.Rslt_qty_65_p_PPanel.setName("Rslt.qty_65_p");
		p.columnRslt_qty_65 = p.Rslt_qty_65_p_PPanel.columnQty_qty;
		p.columnRslt_qty_65.addAliasName("Rslt.qty_65", p);
		p.Rslt_qty_66_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_66_p);
		p.Rslt_qty_66_p_PPanel.setName("Rslt.qty_66_p");
		p.columnRslt_qty_66 = p.Rslt_qty_66_p_PPanel.columnQty_qty;
		p.columnRslt_qty_66.addAliasName("Rslt.qty_66", p);
		p.Rslt_qty_67_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_67_p);
		p.Rslt_qty_67_p_PPanel.setName("Rslt.qty_67_p");
		p.columnRslt_qty_67 = p.Rslt_qty_67_p_PPanel.columnQty_qty;
		p.columnRslt_qty_67.addAliasName("Rslt.qty_67", p);
		p.Rslt_qty_68_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_68_p);
		p.Rslt_qty_68_p_PPanel.setName("Rslt.qty_68_p");
		p.columnRslt_qty_68 = p.Rslt_qty_68_p_PPanel.columnQty_qty;
		p.columnRslt_qty_68.addAliasName("Rslt.qty_68", p);
		p.Rslt_qty_69_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_69_p);
		p.Rslt_qty_69_p_PPanel.setName("Rslt.qty_69_p");
		p.columnRslt_qty_69 = p.Rslt_qty_69_p_PPanel.columnQty_qty;
		p.columnRslt_qty_69.addAliasName("Rslt.qty_69", p);
		p.Rslt_qty_70_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_70_p);
		p.Rslt_qty_70_p_PPanel.setName("Rslt.qty_70_p");
		p.columnRslt_qty_70 = p.Rslt_qty_70_p_PPanel.columnQty_qty;
		p.columnRslt_qty_70.addAliasName("Rslt.qty_70", p);
		p.Rslt_qty_71_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_71_p);
		p.Rslt_qty_71_p_PPanel.setName("Rslt.qty_71_p");
		p.columnRslt_qty_71 = p.Rslt_qty_71_p_PPanel.columnQty_qty;
		p.columnRslt_qty_71.addAliasName("Rslt.qty_71", p);
		p.Rslt_qty_72_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_72_p);
		p.Rslt_qty_72_p_PPanel.setName("Rslt.qty_72_p");
		p.columnRslt_qty_72 = p.Rslt_qty_72_p_PPanel.columnQty_qty;
		p.columnRslt_qty_72.addAliasName("Rslt.qty_72", p);
		p.Rslt_qty_73_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_73_p);
		p.Rslt_qty_73_p_PPanel.setName("Rslt.qty_73_p");
		p.columnRslt_qty_73 = p.Rslt_qty_73_p_PPanel.columnQty_qty;
		p.columnRslt_qty_73.addAliasName("Rslt.qty_73", p);
		p.Rslt_qty_74_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_74_p);
		p.Rslt_qty_74_p_PPanel.setName("Rslt.qty_74_p");
		p.columnRslt_qty_74 = p.Rslt_qty_74_p_PPanel.columnQty_qty;
		p.columnRslt_qty_74.addAliasName("Rslt.qty_74", p);
		p.Rslt_qty_75_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_75_p);
		p.Rslt_qty_75_p_PPanel.setName("Rslt.qty_75_p");
		p.columnRslt_qty_75 = p.Rslt_qty_75_p_PPanel.columnQty_qty;
		p.columnRslt_qty_75.addAliasName("Rslt.qty_75", p);
		p.Rslt_qty_76_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_76_p);
		p.Rslt_qty_76_p_PPanel.setName("Rslt.qty_76_p");
		p.columnRslt_qty_76 = p.Rslt_qty_76_p_PPanel.columnQty_qty;
		p.columnRslt_qty_76.addAliasName("Rslt.qty_76", p);
		p.Rslt_qty_77_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_77_p);
		p.Rslt_qty_77_p_PPanel.setName("Rslt.qty_77_p");
		p.columnRslt_qty_77 = p.Rslt_qty_77_p_PPanel.columnQty_qty;
		p.columnRslt_qty_77.addAliasName("Rslt.qty_77", p);
		p.Rslt_qty_78_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_78_p);
		p.Rslt_qty_78_p_PPanel.setName("Rslt.qty_78_p");
		p.columnRslt_qty_78 = p.Rslt_qty_78_p_PPanel.columnQty_qty;
		p.columnRslt_qty_78.addAliasName("Rslt.qty_78", p);
		p.Rslt_qty_79_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_79_p);
		p.Rslt_qty_79_p_PPanel.setName("Rslt.qty_79_p");
		p.columnRslt_qty_79 = p.Rslt_qty_79_p_PPanel.columnQty_qty;
		p.columnRslt_qty_79.addAliasName("Rslt.qty_79", p);
		p.Rslt_qty_80_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_80_p);
		p.Rslt_qty_80_p_PPanel.setName("Rslt.qty_80_p");
		p.columnRslt_qty_80 = p.Rslt_qty_80_p_PPanel.columnQty_qty;
		p.columnRslt_qty_80.addAliasName("Rslt.qty_80", p);
		p.Rslt_qty_81_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_81_p);
		p.Rslt_qty_81_p_PPanel.setName("Rslt.qty_81_p");
		p.columnRslt_qty_81 = p.Rslt_qty_81_p_PPanel.columnQty_qty;
		p.columnRslt_qty_81.addAliasName("Rslt.qty_81", p);
		p.Rslt_qty_82_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_82_p);
		p.Rslt_qty_82_p_PPanel.setName("Rslt.qty_82_p");
		p.columnRslt_qty_82 = p.Rslt_qty_82_p_PPanel.columnQty_qty;
		p.columnRslt_qty_82.addAliasName("Rslt.qty_82", p);
		p.Rslt_qty_83_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_83_p);
		p.Rslt_qty_83_p_PPanel.setName("Rslt.qty_83_p");
		p.columnRslt_qty_83 = p.Rslt_qty_83_p_PPanel.columnQty_qty;
		p.columnRslt_qty_83.addAliasName("Rslt.qty_83", p);
		p.Rslt_qty_84_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_84_p);
		p.Rslt_qty_84_p_PPanel.setName("Rslt.qty_84_p");
		p.columnRslt_qty_84 = p.Rslt_qty_84_p_PPanel.columnQty_qty;
		p.columnRslt_qty_84.addAliasName("Rslt.qty_84", p);
		p.Rslt_qty_85_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_85_p);
		p.Rslt_qty_85_p_PPanel.setName("Rslt.qty_85_p");
		p.columnRslt_qty_85 = p.Rslt_qty_85_p_PPanel.columnQty_qty;
		p.columnRslt_qty_85.addAliasName("Rslt.qty_85", p);
		p.Rslt_qty_86_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_86_p);
		p.Rslt_qty_86_p_PPanel.setName("Rslt.qty_86_p");
		p.columnRslt_qty_86 = p.Rslt_qty_86_p_PPanel.columnQty_qty;
		p.columnRslt_qty_86.addAliasName("Rslt.qty_86", p);
		p.Rslt_qty_87_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_87_p);
		p.Rslt_qty_87_p_PPanel.setName("Rslt.qty_87_p");
		p.columnRslt_qty_87 = p.Rslt_qty_87_p_PPanel.columnQty_qty;
		p.columnRslt_qty_87.addAliasName("Rslt.qty_87", p);
		p.Rslt_qty_88_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_88_p);
		p.Rslt_qty_88_p_PPanel.setName("Rslt.qty_88_p");
		p.columnRslt_qty_88 = p.Rslt_qty_88_p_PPanel.columnQty_qty;
		p.columnRslt_qty_88.addAliasName("Rslt.qty_88", p);
		p.Rslt_qty_89_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_89_p);
		p.Rslt_qty_89_p_PPanel.setName("Rslt.qty_89_p");
		p.columnRslt_qty_89 = p.Rslt_qty_89_p_PPanel.columnQty_qty;
		p.columnRslt_qty_89.addAliasName("Rslt.qty_89", p);
		p.Rslt_qty_90_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_90_p);
		p.Rslt_qty_90_p_PPanel.setName("Rslt.qty_90_p");
		p.columnRslt_qty_90 = p.Rslt_qty_90_p_PPanel.columnQty_qty;
		p.columnRslt_qty_90.addAliasName("Rslt.qty_90", p);
		p.Rslt_qty_91_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_91_p);
		p.Rslt_qty_91_p_PPanel.setName("Rslt.qty_91_p");
		p.columnRslt_qty_91 = p.Rslt_qty_91_p_PPanel.columnQty_qty;
		p.columnRslt_qty_91.addAliasName("Rslt.qty_91", p);
		p.Rslt_qty_92_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_92_p);
		p.Rslt_qty_92_p_PPanel.setName("Rslt.qty_92_p");
		p.columnRslt_qty_92 = p.Rslt_qty_92_p_PPanel.columnQty_qty;
		p.columnRslt_qty_92.addAliasName("Rslt.qty_92", p);
		p.Rslt_qty_93_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$qty_93_p);
		p.Rslt_qty_93_p_PPanel.setName("Rslt.qty_93_p");
		p.columnRslt_qty_93 = p.Rslt_qty_93_p_PPanel.columnQty_qty;
		p.columnRslt_qty_93.addAliasName("Rslt.qty_93", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBC.MSBCP0020.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
	}

	/**
	 * [ReqRslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateReqRslt(MSBCP_MstrPlnReg p) {
		p.ReqRslt_rqmt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0020.ReqRsltR.$rqmt_qty_p);
		p.ReqRslt_rqmt_qty_p_PPanel.setName("ReqRslt.rqmt_qty_p");
		p.columnReqRslt_rqmt_qty = p.ReqRslt_rqmt_qty_p_PPanel.columnQty_qty;
		p.columnReqRslt_rqmt_qty.addAliasName("ReqRslt.rqmt_qty", p);
		p.ReqRslt_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBC.MSBCP0020.ReqRsltR.$sno_wrk_no_p);
		p.ReqRslt_sno_wrk_no_p_PPanel.setName("ReqRslt.sno_wrk_no_p");
		p.columnReqRslt_sno1 = p.ReqRslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnReqRslt_sno1.addAliasName("ReqRslt.sno1", p);
		p.columnReqRslt_sno2 = p.ReqRslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnReqRslt_sno2.addAliasName("ReqRslt.sno2", p);
		p.columnReqRslt_sno3 = p.ReqRslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnReqRslt_sno3.addAliasName("ReqRslt.sno3", p);
		p.columnReqRslt_sno4 = p.ReqRslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnReqRslt_sno4.addAliasName("ReqRslt.sno4", p);
		p.columnReqRslt_wrk_no = p.ReqRslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnReqRslt_wrk_no.addAliasName("ReqRslt.wrk_no", p);
		p.columnReqRslt_wrk_nm = p.ReqRslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnReqRslt_wrk_nm.addAliasName("ReqRslt.wrk_nm", p);
		p.ReqRslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBC.MSBCP0020.ReqRsltR.$itm_p);
		p.ReqRslt_itm_p_PPanel.setName("ReqRslt.itm_p");
		p.columnReqRslt_itm_cd = p.ReqRslt_itm_p_PPanel.columnItm_itm_cd;
		p.columnReqRslt_itm_cd.addAliasName("ReqRslt.itm_cd", p);
		p.columnReqRslt_itm_sub1 = p.ReqRslt_itm_p_PPanel.columnItm_itm_sub1;
		p.columnReqRslt_itm_sub1.addAliasName("ReqRslt.itm_sub1", p);
		p.columnReqRslt_itm_sub2 = p.ReqRslt_itm_p_PPanel.columnItm_itm_sub2;
		p.columnReqRslt_itm_sub2.addAliasName("ReqRslt.itm_sub2", p);
		p.columnReqRslt_itm_sub3 = p.ReqRslt_itm_p_PPanel.columnItm_itm_sub3;
		p.columnReqRslt_itm_sub3.addAliasName("ReqRslt.itm_sub3", p);
		p.columnReqRslt_itm_nm = p.ReqRslt_itm_p_PPanel.columnItm_itm_nm;
		p.columnReqRslt_itm_nm.addAliasName("ReqRslt.itm_nm", p);
		p.ReqRslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBC.MSBCP0020.ReqRsltR.$rts_msg_p);
		p.ReqRslt_rts_msg_p_PPanel.setName("ReqRslt.rts_msg_p");
		p.columnReqRslt_rtn_sts_typ = p.ReqRslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnReqRslt_rtn_sts_typ.addAliasName("ReqRslt.rtn_sts_typ", p);
		p.ReqRslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBC.MSBCP0020.ReqRsltR.$itm_grp_p);
		p.ReqRslt_itm_grp_p_PPanel.setName("ReqRslt.itm_grp_p");
		p.columnReqRslt_itm_grp_cd1 = p.ReqRslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd1;
		p.columnReqRslt_itm_grp_cd1.addAliasName("ReqRslt.itm_grp_cd1", p);
		p.columnReqRslt_itm_grp_nm1 = p.ReqRslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm1;
		p.columnReqRslt_itm_grp_nm1.addAliasName("ReqRslt.itm_grp_nm1", p);
		p.columnReqRslt_itm_grp_cd2 = p.ReqRslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd2;
		p.columnReqRslt_itm_grp_cd2.addAliasName("ReqRslt.itm_grp_cd2", p);
		p.columnReqRslt_itm_grp_nm2 = p.ReqRslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm2;
		p.columnReqRslt_itm_grp_nm2.addAliasName("ReqRslt.itm_grp_nm2", p);
		p.columnReqRslt_itm_grp_cd3 = p.ReqRslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd3;
		p.columnReqRslt_itm_grp_cd3.addAliasName("ReqRslt.itm_grp_cd3", p);
		p.columnReqRslt_itm_grp_nm3 = p.ReqRslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm3;
		p.columnReqRslt_itm_grp_nm3.addAliasName("ReqRslt.itm_grp_nm3", p);
		p.columnReqRslt_itm_grp_cd4 = p.ReqRslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd4;
		p.columnReqRslt_itm_grp_cd4.addAliasName("ReqRslt.itm_grp_cd4", p);
		p.columnReqRslt_itm_grp_nm4 = p.ReqRslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm4;
		p.columnReqRslt_itm_grp_nm4.addAliasName("ReqRslt.itm_grp_nm4", p);
		p.columnReqRslt_itm_grp_cd5 = p.ReqRslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd5;
		p.columnReqRslt_itm_grp_cd5.addAliasName("ReqRslt.itm_grp_cd5", p);
		p.columnReqRslt_itm_grp_nm5 = p.ReqRslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm5;
		p.columnReqRslt_itm_grp_nm5.addAliasName("ReqRslt.itm_grp_nm5", p);
		p.columnReqRslt_itm_grp_cd6 = p.ReqRslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd6;
		p.columnReqRslt_itm_grp_cd6.addAliasName("ReqRslt.itm_grp_cd6", p);
		p.columnReqRslt_itm_grp_nm6 = p.ReqRslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm6;
		p.columnReqRslt_itm_grp_nm6.addAliasName("ReqRslt.itm_grp_nm6", p);
		p.columnReqRslt_itm_grp_cd7 = p.ReqRslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd7;
		p.columnReqRslt_itm_grp_cd7.addAliasName("ReqRslt.itm_grp_cd7", p);
		p.columnReqRslt_itm_grp_nm7 = p.ReqRslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm7;
		p.columnReqRslt_itm_grp_nm7.addAliasName("ReqRslt.itm_grp_nm7", p);
		p.columnReqRslt_itm_grp_cd8 = p.ReqRslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd8;
		p.columnReqRslt_itm_grp_cd8.addAliasName("ReqRslt.itm_grp_cd8", p);
		p.columnReqRslt_itm_grp_nm8 = p.ReqRslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm8;
		p.columnReqRslt_itm_grp_nm8.addAliasName("ReqRslt.itm_grp_nm8", p);
		p.columnReqRslt_itm_grp_cd9 = p.ReqRslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd9;
		p.columnReqRslt_itm_grp_cd9.addAliasName("ReqRslt.itm_grp_cd9", p);
		p.columnReqRslt_itm_grp_nm9 = p.ReqRslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm9;
		p.columnReqRslt_itm_grp_nm9.addAliasName("ReqRslt.itm_grp_nm9", p);
		p.columnReqRslt_itm_grp_cd10 = p.ReqRslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd10;
		p.columnReqRslt_itm_grp_cd10.addAliasName("ReqRslt.itm_grp_cd10", p);
		p.columnReqRslt_itm_grp_nm10 = p.ReqRslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm10;
		p.columnReqRslt_itm_grp_nm10.addAliasName("ReqRslt.itm_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBCP_MstrPlnReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBCP_MstrPlnReg p) {
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

	
	/** [Cnd_mps_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mps_grp_cd_p = null;

	/**
	 * [Cnd_mps_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mps_grp_cd_ListPutter() {
		if (Cnd_mps_grp_cd_p == null) {
			Cnd_mps_grp_cd_p = createCnd_mps_grp_cd_ListPutter(Cnd_mps_grp_cd, "mps_grp_cd", "mps_grp_nm");

		}
		return Cnd_mps_grp_cd_p;
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
	
	
	/** [ReqRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter ReqRslt_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [ReqRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getReqRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (ReqRslt_itm_p_PPanel_columnItm_itm_cd_p == null) {
			ReqRslt_itm_p_PPanel_columnItm_itm_cd_p = createReqRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter(ReqRslt_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3","unit_cd","unit_nm","dec_place","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sno1_num_typ","sno2_num_typ","sno3_num_typ","sno4_num_typ","rqmt_sno1_flg","rqmt_sno2_flg","rqmt_sno3_flg","rqmt_sno4_flg");
		}
		return ReqRslt_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [ReqRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter ReqRslt_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [ReqRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getReqRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (ReqRslt_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			ReqRslt_itm_p_PPanel_columnItm_itm_sub1_p = createReqRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(ReqRslt_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3","unit_cd","unit_nm","dec_place","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sno1_num_typ","sno2_num_typ","sno3_num_typ","sno4_num_typ","rqmt_sno1_flg","rqmt_sno2_flg","rqmt_sno3_flg","rqmt_sno4_flg");
		}
		return ReqRslt_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [ReqRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter ReqRslt_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [ReqRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getReqRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (ReqRslt_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			ReqRslt_itm_p_PPanel_columnItm_itm_sub2_p = createReqRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(ReqRslt_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3","unit_cd","unit_nm","dec_place","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sno1_num_typ","sno2_num_typ","sno3_num_typ","sno4_num_typ","rqmt_sno1_flg","rqmt_sno2_flg","rqmt_sno3_flg","rqmt_sno4_flg");
		}
		return ReqRslt_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [ReqRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter ReqRslt_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [ReqRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getReqRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (ReqRslt_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			ReqRslt_itm_p_PPanel_columnItm_itm_sub3_p = createReqRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(ReqRslt_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","unit_cd","unit_nm","dec_place","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sno1_num_typ","sno2_num_typ","sno3_num_typ","sno4_num_typ","rqmt_sno1_flg","rqmt_sno2_flg","rqmt_sno3_flg","rqmt_sno4_flg");
		}
		return ReqRslt_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [ReqRslt_mfg_loc_cd_ListPutter]の定義 */
	private MCListPutter ReqRslt_mfg_loc_cd_p = null;

	/**
	 * [ReqRslt_mfg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getReqRslt_mfg_loc_cd_ListPutter() {
		if (ReqRslt_mfg_loc_cd_p == null) {
			ReqRslt_mfg_loc_cd_p = createReqRslt_mfg_loc_cd_ListPutter(columnReqRslt_mfg_loc_cd, "mfg_loc_cd", "mfg_loc_nm");

		}
		return ReqRslt_mfg_loc_cd_p;
	}
	
	
	/** [ReqRslt_sppl_cd_ListPutter]の定義 */
	private MCListPutter ReqRslt_sppl_cd_p = null;

	/**
	 * [ReqRslt_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getReqRslt_sppl_cd_ListPutter() {
		if (ReqRslt_sppl_cd_p == null) {
			ReqRslt_sppl_cd_p = createReqRslt_sppl_cd_ListPutter(columnReqRslt_sppl_cd, "sppl_cd", "sppl_nm");

		}
		return ReqRslt_sppl_cd_p;
	}
	
	
	/** [ReqRslt_rqst_loc_cd_ListPutter]の定義 */
	private MCListPutter ReqRslt_rqst_loc_cd_p = null;

	/**
	 * [ReqRslt_rqst_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getReqRslt_rqst_loc_cd_ListPutter() {
		if (ReqRslt_rqst_loc_cd_p == null) {
			ReqRslt_rqst_loc_cd_p = createReqRslt_rqst_loc_cd_ListPutter(columnReqRslt_rqst_loc_cd, "rqst_loc_cd", "rqst_loc_nm","rqst_wg_cd","rqst_wg_nm");

		}
		return ReqRslt_rqst_loc_cd_p;
	}
	
	
	/** [ReqRslt_rqmt_typ_ListPutter]の定義 */
	private MCListPutter ReqRslt_rqmt_typ_p = null;

	/**
	 * [ReqRslt_rqmt_typ_ListPutter]の取得
	 */
	protected MCListPutter getReqRslt_rqmt_typ_ListPutter() {
		if (ReqRslt_rqmt_typ_p == null) {
			ReqRslt_rqmt_typ_p = createReqRslt_rqmt_typ_ListPutter(columnReqRslt_rqmt_typ, "rqmt_typ", "rqmt_typ_nm");

		}
		return ReqRslt_rqmt_typ_p;
	}
	
	
	/** [ReqRslt_strg_loc_cd_ListPutter]の定義 */
	private MCListPutter ReqRslt_strg_loc_cd_p = null;

	/**
	 * [ReqRslt_strg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getReqRslt_strg_loc_cd_ListPutter() {
		if (ReqRslt_strg_loc_cd_p == null) {
			ReqRslt_strg_loc_cd_p = createReqRslt_strg_loc_cd_ListPutter(columnReqRslt_strg_loc_cd, "strg_loc_cd", "strg_loc_nm","site_cd","site_nm","wg_cd","wg_nm","strg_loc_grp_cd","strg_loc_grp_nm");

		}
		return ReqRslt_strg_loc_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_MstrPlnReg create(){
		MSBCP_MstrPlnReg p = new MSBCP_MstrPlnReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_MstrPlnReg create(String name){
		MSBCP_MstrPlnReg p = new MSBCP_MstrPlnReg(name);
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
		MSBCP_MstrPlnReg_MC.jbfInitScreenOpe((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbfInitTop((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbfInitFold((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbfInitTab1((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbfInitTab2((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbfInitCnd((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbfInitCnd2((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbfInitLPnl((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbfInitCtrl((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbfInitRslt((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbfInitReqRslt((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbfInitBtn((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbfInitEastBtn((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbInitScreenOpe((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbInitTop((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbInitFold((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbInitTab1((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbInitTab2((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbInitCnd((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbInitCnd2((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbInitLPnl((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbInitCtrl((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbInitRslt((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbInitReqRslt((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbInitBtn((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.jbInitEastBtn((MSBCP_MstrPlnReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBCP_MstrPlnReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBCP_MstrPlnReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBCP_MstrPlnReg p) {
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
	protected static void jbfInitTab1(MSBCP_MstrPlnReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBCP_MstrPlnReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBCP_MstrPlnReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_due_dt_fr_Label = p.beansFactory.createLabel("Cnd.due_dt_fr_Label");
		p.Cnd_due_dt_fr = p.beansFactory.createDateField("Cnd.due_dt_fr");
		p.Cnd_due_dt_fr.setLabel(p.Cnd_due_dt_fr_Label);
		p.Cnd_due_dt_to_Label = p.beansFactory.createLabel("Cnd.due_dt_to_Label");
		p.Cnd_due_dt_to = p.beansFactory.createDateField("Cnd.due_dt_to");
		p.Cnd_due_dt_to.setLabel(p.Cnd_due_dt_to_Label);
		p.Cnd_mps_grp_cd_Label = p.beansFactory.createLabel("Cnd.mps_grp_cd_Label");
		p.Cnd_mps_grp_cd = p.beansFactory.createTextComboBox("Cnd.mps_grp_cd");
		p.Cnd_mps_grp_cd.setLabel(p.Cnd_mps_grp_cd_Label);
		p.Cnd_mps_grp_nm = p.beansFactory.createTextField("Cnd.mps_grp_nm");
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
		p.Cnd_disp_key_flg = p.beansFactory.createCheckBox("Cnd.disp_key_flg");
		p.Cnd_disp_ship_schd_flg = p.beansFactory.createCheckBox("Cnd.disp_ship_schd_flg");
		p.Cnd_disp_prcd_flg = p.beansFactory.createCheckBox("Cnd.disp_prcd_flg");
		p.Cnd_disp_mps_flg = p.beansFactory.createCheckBox("Cnd.disp_mps_flg");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBCP_MstrPlnReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLPnl(MSBCP_MstrPlnReg p) {
		// ブロック関連の初期化
		p.LPnlPanel = p.beansFactory.createPanel("LPnl");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBCP_MstrPlnReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBCP_MstrPlnReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_peg_no = p.beansFactory.createTableColumn("Rslt.peg_no", MCColumnType.NUMBER);
		p.columnRslt_disp_00 = p.beansFactory.createTableColumn("Rslt.disp_00", MCColumnType.TEXT);
		p.columnRslt_mps_grp_cd = p.beansFactory.createTableColumn("Rslt.mps_grp_cd", MCColumnType.TEXT);
		p.columnRslt_mps_grp_nm = p.beansFactory.createTableColumn("Rslt.mps_grp_nm", MCColumnType.TEXT);
		p.columnRslt_strg_loc_cd = p.beansFactory.createTableColumn("Rslt.strg_loc_cd", MCColumnType.TEXT);
		p.columnRslt_strg_loc_nm = p.beansFactory.createTableColumn("Rslt.strg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_cd = p.beansFactory.createTableColumn("Rslt.mfg_loc_cd", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_nm = p.beansFactory.createTableColumn("Rslt.mfg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_rqst_loc_cd = p.beansFactory.createTableColumn("Rslt.rqst_loc_cd", MCColumnType.TEXT);
		p.columnRslt_rqst_loc_nm = p.beansFactory.createTableColumn("Rslt.rqst_loc_nm", MCColumnType.TEXT);
		p.columnRslt_proc_cd = p.beansFactory.createTableColumn("Rslt.proc_cd", MCColumnType.TEXT);
		p.columnRslt_proc_nm = p.beansFactory.createTableColumn("Rslt.proc_nm", MCColumnType.TEXT);
		p.columnRslt_unit_cd = p.beansFactory.createTableColumn("Rslt.unit_cd", MCColumnType.TEXT);
		p.columnRslt_unit_nm = p.beansFactory.createTableColumn("Rslt.unit_nm", MCColumnType.TEXT);
		p.columnRslt_dec_place = p.beansFactory.createTableColumn("Rslt.dec_place", MCColumnType.NUMBER);
		p.columnRslt_site_cd = p.beansFactory.createTableColumn("Rslt.site_cd", MCColumnType.TEXT);
		p.columnRslt_site_nm = p.beansFactory.createTableColumn("Rslt.site_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
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
		p.columnRslt_row_title_col = p.beansFactory.createTableColumn("Rslt.row_title_col", MCColumnType.TEXT);
		p.columnRslt_row_title_nm = p.beansFactory.createTableColumn("Rslt.row_title_nm", MCColumnType.TEXT);
		p.columnRslt_record_id = p.beansFactory.createTableColumn("Rslt.record_id", MCColumnType.NUMBER);
		p.columnRslt_record_grp_id = p.beansFactory.createTableColumn("Rslt.record_grp_id", MCColumnType.NUMBER);
	}

	/**
	 * [ReqRslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitReqRslt(MSBCP_MstrPlnReg p) {
		// ブロック関連の初期化
		p.ReqRsltPanel = p.beansFactory.createPanel("ReqRslt");
		p.ReqRsltScrollPane = p.beansFactory.createScrollPane("ReqRslt.scroll");
		p.createReqRsltTable();
		// ブロックの項目の初期化
		p.columnReqRslt_check = p.beansFactory.createTableColumn("ReqRslt.check", MCColumnType.CHECK);
		p.columnReqRslt_hdr_peg_no = p.beansFactory.createTableColumn("ReqRslt.hdr_peg_no", MCColumnType.NUMBER);
		p.columnReqRslt_sno_sprt_flg = p.beansFactory.createTableColumn("ReqRslt.sno_sprt_flg", MCColumnType.CHECK);
		p.columnReqRslt_rqmt_no = p.beansFactory.createTableColumn("ReqRslt.rqmt_no", MCColumnType.TEXT);
		p.columnReqRslt_unit_cd = p.beansFactory.createTableColumn("ReqRslt.unit_cd", MCColumnType.TEXT);
		p.columnReqRslt_unit_nm = p.beansFactory.createTableColumn("ReqRslt.unit_nm", MCColumnType.TEXT);
		p.columnReqRslt_dec_place = p.beansFactory.createTableColumn("ReqRslt.dec_place", MCColumnType.NUMBER);
		p.columnReqRslt_due_dt = p.beansFactory.createTableColumn("ReqRslt.due_dt", MCColumnType.DATE);
		p.columnReqRslt_old_due_dt = p.beansFactory.createTableColumn("ReqRslt.old_due_dt", MCColumnType.DATE);
		p.columnReqRslt_sno1_mng_typ = p.beansFactory.createTableColumn("ReqRslt.sno1_mng_typ", MCColumnType.TEXT);
		p.columnReqRslt_sno2_mng_typ = p.beansFactory.createTableColumn("ReqRslt.sno2_mng_typ", MCColumnType.TEXT);
		p.columnReqRslt_sno3_mng_typ = p.beansFactory.createTableColumn("ReqRslt.sno3_mng_typ", MCColumnType.TEXT);
		p.columnReqRslt_sno4_mng_typ = p.beansFactory.createTableColumn("ReqRslt.sno4_mng_typ", MCColumnType.TEXT);
		p.columnReqRslt_sno1_num_typ = p.beansFactory.createTableColumn("ReqRslt.sno1_num_typ", MCColumnType.TEXT);
		p.columnReqRslt_sno2_num_typ = p.beansFactory.createTableColumn("ReqRslt.sno2_num_typ", MCColumnType.TEXT);
		p.columnReqRslt_sno3_num_typ = p.beansFactory.createTableColumn("ReqRslt.sno3_num_typ", MCColumnType.TEXT);
		p.columnReqRslt_sno4_num_typ = p.beansFactory.createTableColumn("ReqRslt.sno4_num_typ", MCColumnType.TEXT);
		p.columnReqRslt_rqmt_sno1_flg = p.beansFactory.createTableColumn("ReqRslt.rqmt_sno1_flg", MCColumnType.CHECK);
		p.columnReqRslt_rqmt_sno2_flg = p.beansFactory.createTableColumn("ReqRslt.rqmt_sno2_flg", MCColumnType.CHECK);
		p.columnReqRslt_rqmt_sno3_flg = p.beansFactory.createTableColumn("ReqRslt.rqmt_sno3_flg", MCColumnType.CHECK);
		p.columnReqRslt_rqmt_sno4_flg = p.beansFactory.createTableColumn("ReqRslt.rqmt_sno4_flg", MCColumnType.CHECK);
		p.columnReqRslt_fix_flg = p.beansFactory.createTableColumn("ReqRslt.fix_flg", MCColumnType.CHECK);
		p.columnReqRslt_mfg_loc_cd = p.beansFactory.createTableColumn("ReqRslt.mfg_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnReqRslt_mfg_loc_nm = p.beansFactory.createTableColumn("ReqRslt.mfg_loc_nm", MCColumnType.TEXT);
		p.columnReqRslt_sppl_cd = p.beansFactory.createTableColumn("ReqRslt.sppl_cd", MCColumnType.TEXT_COMBO);
		p.columnReqRslt_sppl_nm = p.beansFactory.createTableColumn("ReqRslt.sppl_nm", MCColumnType.TEXT);
		p.columnReqRslt_rqst_loc_cd = p.beansFactory.createTableColumn("ReqRslt.rqst_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnReqRslt_rqst_loc_nm = p.beansFactory.createTableColumn("ReqRslt.rqst_loc_nm", MCColumnType.TEXT);
		p.columnReqRslt_rqst_wg_cd = p.beansFactory.createTableColumn("ReqRslt.rqst_wg_cd", MCColumnType.TEXT);
		p.columnReqRslt_rqst_wg_nm = p.beansFactory.createTableColumn("ReqRslt.rqst_wg_nm", MCColumnType.TEXT);
		p.columnReqRslt_rqmt_gnrt_typ = p.beansFactory.createTableColumn("ReqRslt.rqmt_gnrt_typ", MCColumnType.TEXT);
		p.columnReqRslt_rqmt_gnrt_typ_nm = p.beansFactory.createTableColumn("ReqRslt.rqmt_gnrt_typ_nm", MCColumnType.TEXT);
		p.columnReqRslt_rqmt_typ = p.beansFactory.createTableColumn("ReqRslt.rqmt_typ", MCColumnType.TEXT_COMBO);
		p.columnReqRslt_rqmt_typ_nm = p.beansFactory.createTableColumn("ReqRslt.rqmt_typ_nm", MCColumnType.TEXT);
		p.columnReqRslt_intr_rmrks = p.beansFactory.createTableColumn("ReqRslt.intr_rmrks", MCColumnType.TEXT);
		p.columnReqRslt_sub_char1 = p.beansFactory.createTableColumn("ReqRslt.sub_char1", MCColumnType.TEXT);
		p.columnReqRslt_sub_char2 = p.beansFactory.createTableColumn("ReqRslt.sub_char2", MCColumnType.TEXT);
		p.columnReqRslt_sub_char3 = p.beansFactory.createTableColumn("ReqRslt.sub_char3", MCColumnType.TEXT);
		p.columnReqRslt_strg_loc_cd = p.beansFactory.createTableColumn("ReqRslt.strg_loc_cd", MCColumnType.TEXT);
		p.columnReqRslt_strg_loc_nm = p.beansFactory.createTableColumn("ReqRslt.strg_loc_nm", MCColumnType.TEXT);
		p.columnReqRslt_site_cd = p.beansFactory.createTableColumn("ReqRslt.site_cd", MCColumnType.TEXT);
		p.columnReqRslt_site_nm = p.beansFactory.createTableColumn("ReqRslt.site_nm", MCColumnType.TEXT);
		p.columnReqRslt_wg_cd = p.beansFactory.createTableColumn("ReqRslt.wg_cd", MCColumnType.TEXT);
		p.columnReqRslt_wg_nm = p.beansFactory.createTableColumn("ReqRslt.wg_nm", MCColumnType.TEXT);
		p.columnReqRslt_strg_loc_grp_cd = p.beansFactory.createTableColumn("ReqRslt.strg_loc_grp_cd", MCColumnType.TEXT);
		p.columnReqRslt_strg_loc_grp_nm = p.beansFactory.createTableColumn("ReqRslt.strg_loc_grp_nm", MCColumnType.TEXT);
		p.columnReqRslt_itm_typ = p.beansFactory.createTableColumn("ReqRslt.itm_typ", MCColumnType.TEXT);
		p.columnReqRslt_itm_typ_nm = p.beansFactory.createTableColumn("ReqRslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnReqRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("ReqRslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnReqRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("ReqRslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnReqRslt_mps_grp_cd = p.beansFactory.createTableColumn("ReqRslt.mps_grp_cd", MCColumnType.TEXT);
		p.columnReqRslt_mps_grp_nm = p.beansFactory.createTableColumn("ReqRslt.mps_grp_nm", MCColumnType.TEXT);
		p.columnReqRslt_ins_usr_id = p.beansFactory.createTableColumn("ReqRslt.ins_usr_id", MCColumnType.TEXT);
		p.columnReqRslt_ins_usr_nm = p.beansFactory.createTableColumn("ReqRslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnReqRslt_ins_func_id = p.beansFactory.createTableColumn("ReqRslt.ins_func_id", MCColumnType.TEXT);
		p.columnReqRslt_ins_func_nm = p.beansFactory.createTableColumn("ReqRslt.ins_func_nm", MCColumnType.TEXT);
		p.columnReqRslt_ins_ts = p.beansFactory.createTableColumn("ReqRslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnReqRslt_upd_cntr = p.beansFactory.createTableColumn("ReqRslt.upd_cntr", MCColumnType.NUMBER);
		p.columnReqRslt_upd_usr_id = p.beansFactory.createTableColumn("ReqRslt.upd_usr_id", MCColumnType.TEXT);
		p.columnReqRslt_upd_usr_nm = p.beansFactory.createTableColumn("ReqRslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnReqRslt_upd_func_id = p.beansFactory.createTableColumn("ReqRslt.upd_func_id", MCColumnType.TEXT);
		p.columnReqRslt_upd_func_nm = p.beansFactory.createTableColumn("ReqRslt.upd_func_nm", MCColumnType.TEXT);
		p.columnReqRslt_upd_ts = p.beansFactory.createTableColumn("ReqRslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnReqRslt_upd_srv_req_no = p.beansFactory.createTableColumn("ReqRslt.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBCP_MstrPlnReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_sprt_sno = p.beansFactory.createButton("Btn.sprt_sno");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBCP_MstrPlnReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBCP_MstrPlnReg p) {
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
	protected static void jbInitTop(MSBCP_MstrPlnReg p) {
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
		p.FoldPanel.setNextBeans(p.LPnlPanel);
		p.TopPanel.add(p.LPnlPanel, null);
		p.LPnlPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBCP_MstrPlnReg p) {
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
	protected static void jbInitTab1(MSBCP_MstrPlnReg p) {
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
	protected static void jbInitTab2(MSBCP_MstrPlnReg p) {
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
	protected static void jbInitCnd(MSBCP_MstrPlnReg p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0020.CndR.ope_META);
		p.CndPanel.add(p.Cnd_due_dt_fr_Label);
		p.CndPanel.add(p.Cnd_due_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_due_dt_fr);
		p.Cnd_due_dt_fr.setNextBeans(p.Cnd_due_dt_to);
		p.Cnd_due_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0020.CndR.due_dt_fr_META);
		p.Cnd_due_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_due_dt_to_Label);
		p.CndPanel.add(p.Cnd_due_dt_to);
		p.Cnd_due_dt_to.setNextBeans(p.Cnd_mps_grp_cd);
		p.Cnd_due_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0020.CndR.due_dt_to_META);
		p.Cnd_due_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_mps_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mps_grp_cd, true);
		p.Cnd_mps_grp_cd.setLinkBeans(p.Cnd_mps_grp_nm);
		p.CndPanel.add(p.Cnd_mps_grp_cd_Label);
		p.CndPanel.add(p.Cnd_mps_grp_cd);
		p.Cnd_mps_grp_cd.setNextBeans(p.Cnd_mps_grp_nm);
		p.Cnd_mps_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0020.CndR.mps_grp_cd_META);
		p.CndPanel.add(p.Cnd_mps_grp_nm);
		p.Cnd_mps_grp_nm.setNextBeans(p.Cnd_site_cd);
		p.Cnd_mps_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0020.CndR.mps_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_mps_grp_nm, true);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.CndPanel.add(p.Cnd_site_cd_Label);
		p.CndPanel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0020.CndR.site_cd_META);
		p.CndPanel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0020.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0020.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_strg_loc_grp_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0020.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_strg_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_strg_loc_grp_cd, true);
		p.Cnd_strg_loc_grp_cd.setLinkBeans(p.Cnd_strg_loc_grp_nm);
		p.CndPanel.add(p.Cnd_strg_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_strg_loc_grp_cd);
		p.Cnd_strg_loc_grp_cd.setNextBeans(p.Cnd_strg_loc_grp_nm);
		p.Cnd_strg_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0020.CndR.strg_loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_strg_loc_grp_nm);
		p.Cnd_strg_loc_grp_nm.setNextBeans(p.Cnd_strg_loc_cd);
		p.Cnd_strg_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0020.CndR.strg_loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_strg_loc_grp_nm, true);
		p.CndPanel.add(p.Cnd_strg_loc_cd_Label);
		p.CndPanel.add(p.Cnd_strg_loc_cd);
		p.Cnd_strg_loc_cd.setNextBeans(p.Cnd_strg_loc_nm);
		p.Cnd_strg_loc_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0020.CndR.strg_loc_cd_META);
		p.Cnd_strg_loc_cd.addLinkBeans(p.Cnd_strg_loc_nm);
		p.Cnd_strg_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_strg_loc_cd, true);
		p.CndPanel.add(p.Cnd_strg_loc_nm);
		p.Cnd_strg_loc_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_strg_loc_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0020.CndR.strg_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_strg_loc_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
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
		p.Cnd2Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
		p.LPnlPanel.add(p.Cnd_disp_key_flg);
		p.LPnlPanel.setLastBeans(p.Cnd_disp_key_flg);
		p.Cnd_disp_key_flg.setNextBeans(p.Cnd_disp_ship_schd_flg);
		p.Cnd_disp_key_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0020.CndR.disp_key_flg_META);
		p.LPnlPanel.add(p.Cnd_disp_ship_schd_flg);
		p.Cnd_disp_ship_schd_flg.setNextBeans(p.Cnd_disp_prcd_flg);
		p.Cnd_disp_ship_schd_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0020.CndR.disp_ship_schd_flg_META);
		p.LPnlPanel.add(p.Cnd_disp_prcd_flg);
		p.Cnd_disp_prcd_flg.setNextBeans(p.Cnd_disp_mps_flg);
		p.Cnd_disp_prcd_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0020.CndR.disp_prcd_flg_META);
		p.LPnlPanel.add(p.Cnd_disp_mps_flg);
		p.Cnd_disp_mps_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0020.CndR.disp_mps_flg_META);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBCP_MstrPlnReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLPnl(MSBCP_MstrPlnReg p) {
		// ブロック関連の初期化
		p.LPnlPanel.setValueCheck(false);
		p.LPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LPnlPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBCP_MstrPlnReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBCP_MstrPlnReg p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.ReqRsltPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("CBCT");
		// ブロックの項目の初期化
	}

	/**
	 * [ReqRslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitReqRslt(MSBCP_MstrPlnReg p) {
		// ブロック関連の初期化
		p.add(p.ReqRsltPanel);
		p.ReqRsltPanel.setNextBeans(p.BtnPanel);
		p.ReqRsltPanel.add(p.ReqRsltScrollPane);
		p.ReqRsltPanel.setLastBeans(p.ReqRsltTable);
		p.ReqRsltScrollPane.setViewportView(p.ReqRsltTable);
		p.ReqRsltTable.setList(p.getReqRsltL());
		p.ReqRsltPanel.setLayoutPosition("CBCBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBCP_MstrPlnReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.BtnPanel.add(p.Btn_sprt_sno);
		p.BtnPanel.setLastBeans(p.Btn_sprt_sno);
		p.Btn_sprt_sno.setNextBeans(p.Btn_select_all);
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
		p.Btn_rcopy.setNextBeans(p.Btn_upd);
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
	protected static void jbInitEastBtn(MSBCP_MstrPlnReg p) {
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
		MSBCP_MstrPlnReg_MC.mcInitScreenOpe((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.mcInitTop((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.mcInitFold((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.mcInitTab1((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.mcInitTab2((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.mcInitCnd((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.mcInitCnd2((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.mcInitLPnl((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.mcInitCtrl((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.mcInitRslt((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.mcInitReqRslt((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.mcInitBtn((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.mcInitEastBtn((MSBCP_MstrPlnReg)this);

		// [UPD]ステータスのモードの設定
		MSBCP_MstrPlnReg_MC.statusInitUPD_ScreenOpe((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitUPD_Top((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitUPD_Fold((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitUPD_Tab1((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitUPD_Tab2((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitUPD_Cnd((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitUPD_Cnd2((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitUPD_LPnl((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitUPD_Ctrl((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitUPD_Rslt((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitUPD_Pln((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitUPD_ReqRslt((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitUPD_Btn((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitUPD_EastBtn((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitUPD_MpsMaxRslt((MSBCP_MstrPlnReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MSBCP_MstrPlnReg_MC.statusInitSRCH__DEL_ScreenOpe((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH__DEL_Top((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH__DEL_Fold((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH__DEL_Tab1((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH__DEL_Tab2((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH__DEL_Cnd((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH__DEL_Cnd2((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH__DEL_LPnl((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH__DEL_Ctrl((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH__DEL_Rslt((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH__DEL_Pln((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH__DEL_ReqRslt((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH__DEL_Btn((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH__DEL_EastBtn((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH__DEL_MpsMaxRslt((MSBCP_MstrPlnReg)this);

		// [DEL]ステータスのモードの設定
		MSBCP_MstrPlnReg_MC.statusInitDEL_ScreenOpe((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitDEL_Top((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitDEL_Fold((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitDEL_Tab1((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitDEL_Tab2((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitDEL_Cnd((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitDEL_Cnd2((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitDEL_LPnl((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitDEL_Ctrl((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitDEL_Rslt((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitDEL_Pln((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitDEL_ReqRslt((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitDEL_Btn((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitDEL_EastBtn((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitDEL_MpsMaxRslt((MSBCP_MstrPlnReg)this);

		// [SRCH]ステータスのモードの設定
		MSBCP_MstrPlnReg_MC.statusInitSRCH_ScreenOpe((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH_Top((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH_Fold((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH_Tab1((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH_Tab2((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH_Cnd((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH_Cnd2((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH_LPnl((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH_Ctrl((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH_Rslt((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH_Pln((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH_ReqRslt((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH_Btn((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH_EastBtn((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitSRCH_MpsMaxRslt((MSBCP_MstrPlnReg)this);

		// [REF]ステータスのモードの設定
		MSBCP_MstrPlnReg_MC.statusInitREF_ScreenOpe((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitREF_Top((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitREF_Fold((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitREF_Tab1((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitREF_Tab2((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitREF_Cnd((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitREF_Cnd2((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitREF_LPnl((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitREF_Ctrl((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitREF_Rslt((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitREF_Pln((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitREF_ReqRslt((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitREF_Btn((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitREF_EastBtn((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.statusInitREF_MpsMaxRslt((MSBCP_MstrPlnReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBCP_MstrPlnReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBCP_MstrPlnReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBCP_MstrPlnReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBCP_MstrPlnReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBCP_MstrPlnReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBCP_MstrPlnReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_due_dt_fr.setListListener(p);
		p.Cnd_due_dt_fr.addAllListener(p);
		p.Cnd_due_dt_to.setListListener(p);
		p.Cnd_due_dt_to.addAllListener(p);
		p.Cnd_mps_grp_cd.setListListener(p);
		p.Cnd_mps_grp_cd.addAllListener(p);
		p.Cnd_mps_grp_nm.setListListener(p);
		p.Cnd_mps_grp_nm.addAllListener(p);
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
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_disp_key_flg.addAllListener(p);
		p.Cnd_disp_ship_schd_flg.addAllListener(p);
		p.Cnd_disp_prcd_flg.addAllListener(p);
		p.Cnd_disp_mps_flg.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBCP_MstrPlnReg p) {
	}

	/**
	 *  [LPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLPnl(MSBCP_MstrPlnReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBCP_MstrPlnReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBCP_MstrPlnReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_peg_no.addAllListener(p);
		p.columnRslt_peg_no.setListListener(p);
		p.columnRslt_disp_00.addAllListener(p);
		p.columnRslt_disp_00.setListListener(p);
		p.columnRslt_mps_grp_cd.addAllListener(p);
		p.columnRslt_mps_grp_cd.setListListener(p);
		p.columnRslt_mps_grp_nm.addAllListener(p);
		p.columnRslt_mps_grp_nm.setListListener(p);
		p.columnRslt_strg_loc_cd.addAllListener(p);
		p.columnRslt_strg_loc_cd.setListListener(p);
		p.columnRslt_strg_loc_nm.addAllListener(p);
		p.columnRslt_strg_loc_nm.setListListener(p);
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
		p.columnRslt_proc_cd.addAllListener(p);
		p.columnRslt_proc_cd.setListListener(p);
		p.columnRslt_proc_nm.addAllListener(p);
		p.columnRslt_proc_nm.setListListener(p);
		p.columnRslt_unit_cd.addAllListener(p);
		p.columnRslt_unit_cd.setListListener(p);
		p.columnRslt_unit_nm.addAllListener(p);
		p.columnRslt_unit_nm.setListListener(p);
		p.columnRslt_dec_place.addAllListener(p);
		p.columnRslt_dec_place.setListListener(p);
		p.columnRslt_site_cd.addAllListener(p);
		p.columnRslt_site_cd.setListListener(p);
		p.columnRslt_site_nm.addAllListener(p);
		p.columnRslt_site_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
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
		p.columnRslt_row_title_col.addAllListener(p);
		p.columnRslt_row_title_col.setListListener(p);
		p.columnRslt_row_title_nm.addAllListener(p);
		p.columnRslt_row_title_nm.setListListener(p);
		p.columnRslt_record_id.addAllListener(p);
		p.columnRslt_record_id.setListListener(p);
		p.columnRslt_record_grp_id.addAllListener(p);
		p.columnRslt_record_grp_id.setListListener(p);
	}

	/**
	 *  [ReqRslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitReqRslt(MSBCP_MstrPlnReg p) {
		p.ReqRsltTable.addAllListener(p);
		p.columnReqRslt_check.addAllListener(p);
		p.columnReqRslt_hdr_peg_no.addAllListener(p);
		p.columnReqRslt_hdr_peg_no.setListListener(p);
		p.columnReqRslt_sno_sprt_flg.addAllListener(p);
		p.columnReqRslt_rqmt_no.addAllListener(p);
		p.columnReqRslt_rqmt_no.setListListener(p);
		p.columnReqRslt_unit_cd.addAllListener(p);
		p.columnReqRslt_unit_cd.setListListener(p);
		p.columnReqRslt_unit_nm.addAllListener(p);
		p.columnReqRslt_unit_nm.setListListener(p);
		p.columnReqRslt_dec_place.addAllListener(p);
		p.columnReqRslt_dec_place.setListListener(p);
		p.columnReqRslt_due_dt.addAllListener(p);
		p.columnReqRslt_due_dt.setListListener(p);
		p.columnReqRslt_old_due_dt.addAllListener(p);
		p.columnReqRslt_old_due_dt.setListListener(p);
		p.columnReqRslt_sno1_mng_typ.addAllListener(p);
		p.columnReqRslt_sno1_mng_typ.setListListener(p);
		p.columnReqRslt_sno2_mng_typ.addAllListener(p);
		p.columnReqRslt_sno2_mng_typ.setListListener(p);
		p.columnReqRslt_sno3_mng_typ.addAllListener(p);
		p.columnReqRslt_sno3_mng_typ.setListListener(p);
		p.columnReqRslt_sno4_mng_typ.addAllListener(p);
		p.columnReqRslt_sno4_mng_typ.setListListener(p);
		p.columnReqRslt_sno1_num_typ.addAllListener(p);
		p.columnReqRslt_sno1_num_typ.setListListener(p);
		p.columnReqRslt_sno2_num_typ.addAllListener(p);
		p.columnReqRslt_sno2_num_typ.setListListener(p);
		p.columnReqRslt_sno3_num_typ.addAllListener(p);
		p.columnReqRslt_sno3_num_typ.setListListener(p);
		p.columnReqRslt_sno4_num_typ.addAllListener(p);
		p.columnReqRslt_sno4_num_typ.setListListener(p);
		p.columnReqRslt_rqmt_sno1_flg.addAllListener(p);
		p.columnReqRslt_rqmt_sno2_flg.addAllListener(p);
		p.columnReqRslt_rqmt_sno3_flg.addAllListener(p);
		p.columnReqRslt_rqmt_sno4_flg.addAllListener(p);
		p.columnReqRslt_fix_flg.addAllListener(p);
		p.ReqRslt_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.ReqRslt_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.ReqRslt_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.ReqRslt_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnReqRslt_mfg_loc_cd.addAllListener(p);
		p.columnReqRslt_mfg_loc_cd.setListListener(p);
		p.columnReqRslt_mfg_loc_nm.addAllListener(p);
		p.columnReqRslt_mfg_loc_nm.setListListener(p);
		p.columnReqRslt_sppl_cd.addAllListener(p);
		p.columnReqRslt_sppl_cd.setListListener(p);
		p.columnReqRslt_sppl_nm.addAllListener(p);
		p.columnReqRslt_sppl_nm.setListListener(p);
		p.columnReqRslt_rqst_loc_cd.addAllListener(p);
		p.columnReqRslt_rqst_loc_cd.setListListener(p);
		p.columnReqRslt_rqst_loc_nm.addAllListener(p);
		p.columnReqRslt_rqst_loc_nm.setListListener(p);
		p.columnReqRslt_rqst_wg_cd.addAllListener(p);
		p.columnReqRslt_rqst_wg_cd.setListListener(p);
		p.columnReqRslt_rqst_wg_nm.addAllListener(p);
		p.columnReqRslt_rqst_wg_nm.setListListener(p);
		p.columnReqRslt_rqmt_gnrt_typ.addAllListener(p);
		p.columnReqRslt_rqmt_gnrt_typ.setListListener(p);
		p.columnReqRslt_rqmt_gnrt_typ_nm.addAllListener(p);
		p.columnReqRslt_rqmt_gnrt_typ_nm.setListListener(p);
		p.columnReqRslt_rqmt_typ.addAllListener(p);
		p.columnReqRslt_rqmt_typ.setListListener(p);
		p.columnReqRslt_rqmt_typ_nm.addAllListener(p);
		p.columnReqRslt_rqmt_typ_nm.setListListener(p);
		p.columnReqRslt_intr_rmrks.addAllListener(p);
		p.columnReqRslt_intr_rmrks.setListListener(p);
		p.columnReqRslt_sub_char1.addAllListener(p);
		p.columnReqRslt_sub_char1.setListListener(p);
		p.columnReqRslt_sub_char2.addAllListener(p);
		p.columnReqRslt_sub_char2.setListListener(p);
		p.columnReqRslt_sub_char3.addAllListener(p);
		p.columnReqRslt_sub_char3.setListListener(p);
		p.columnReqRslt_strg_loc_cd.addAllListener(p);
		p.columnReqRslt_strg_loc_cd.setListListener(p);
		p.columnReqRslt_strg_loc_nm.addAllListener(p);
		p.columnReqRslt_strg_loc_nm.setListListener(p);
		p.columnReqRslt_site_cd.addAllListener(p);
		p.columnReqRslt_site_cd.setListListener(p);
		p.columnReqRslt_site_nm.addAllListener(p);
		p.columnReqRslt_site_nm.setListListener(p);
		p.columnReqRslt_wg_cd.addAllListener(p);
		p.columnReqRslt_wg_cd.setListListener(p);
		p.columnReqRslt_wg_nm.addAllListener(p);
		p.columnReqRslt_wg_nm.setListListener(p);
		p.columnReqRslt_strg_loc_grp_cd.addAllListener(p);
		p.columnReqRslt_strg_loc_grp_cd.setListListener(p);
		p.columnReqRslt_strg_loc_grp_nm.addAllListener(p);
		p.columnReqRslt_strg_loc_grp_nm.setListListener(p);
		p.columnReqRslt_itm_typ.addAllListener(p);
		p.columnReqRslt_itm_typ.setListListener(p);
		p.columnReqRslt_itm_typ_nm.addAllListener(p);
		p.columnReqRslt_itm_typ_nm.setListListener(p);
		p.columnReqRslt_itm_typ_d_cd.addAllListener(p);
		p.columnReqRslt_itm_typ_d_cd.setListListener(p);
		p.columnReqRslt_itm_typ_d_nm.addAllListener(p);
		p.columnReqRslt_itm_typ_d_nm.setListListener(p);
		p.columnReqRslt_mps_grp_cd.addAllListener(p);
		p.columnReqRslt_mps_grp_cd.setListListener(p);
		p.columnReqRslt_mps_grp_nm.addAllListener(p);
		p.columnReqRslt_mps_grp_nm.setListListener(p);
		p.columnReqRslt_ins_usr_id.addAllListener(p);
		p.columnReqRslt_ins_usr_id.setListListener(p);
		p.columnReqRslt_ins_usr_nm.addAllListener(p);
		p.columnReqRslt_ins_usr_nm.setListListener(p);
		p.columnReqRslt_ins_func_id.addAllListener(p);
		p.columnReqRslt_ins_func_id.setListListener(p);
		p.columnReqRslt_ins_func_nm.addAllListener(p);
		p.columnReqRslt_ins_func_nm.setListListener(p);
		p.columnReqRslt_ins_ts.addAllListener(p);
		p.columnReqRslt_ins_ts.setListListener(p);
		p.columnReqRslt_upd_cntr.addAllListener(p);
		p.columnReqRslt_upd_cntr.setListListener(p);
		p.columnReqRslt_upd_usr_id.addAllListener(p);
		p.columnReqRslt_upd_usr_id.setListListener(p);
		p.columnReqRslt_upd_usr_nm.addAllListener(p);
		p.columnReqRslt_upd_usr_nm.setListListener(p);
		p.columnReqRslt_upd_func_id.addAllListener(p);
		p.columnReqRslt_upd_func_id.setListListener(p);
		p.columnReqRslt_upd_func_nm.addAllListener(p);
		p.columnReqRslt_upd_func_nm.setListListener(p);
		p.columnReqRslt_upd_ts.addAllListener(p);
		p.columnReqRslt_upd_ts.setListListener(p);
		p.columnReqRslt_upd_srv_req_no.addAllListener(p);
		p.columnReqRslt_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBCP_MstrPlnReg p) {
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
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBCP_MstrPlnReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBCP_MstrPlnReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBCP_MstrPlnReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBCP_MstrPlnReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBCP_MstrPlnReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBCP_MstrPlnReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBCP_MstrPlnReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_due_dt_fr.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_due_dt_to.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_mps_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mps_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_disp_key_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_disp_ship_schd_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_disp_prcd_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_disp_mps_flg.putMode(p, UPD, MCMode.REQUIRED);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MSBCP_MstrPlnReg p){

	}

	/**
	 * [UPD]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LPnl(MSBCP_MstrPlnReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBCP_MstrPlnReg p){

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBCP_MstrPlnReg p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_peg_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_disp_00.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_mps_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mps_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sppl_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rqst_loc_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rqst_loc_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_proc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_proc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_site_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_wg_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno1_num_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno2_num_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno3_num_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_sno4_num_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno1_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno2_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno3_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno4_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_row_title_col.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_row_title_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_qty_00_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_01_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_02_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_03_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_04_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_05_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_06_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_07_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_08_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_09_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_10_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_11_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_12_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_13_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_14_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_15_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_16_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_17_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_18_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_19_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_20_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_21_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_22_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_23_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_24_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_25_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_26_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_27_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_28_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_29_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_30_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_31_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_32_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_33_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_34_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_35_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_36_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_37_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_38_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_39_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_40_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_41_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_42_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_43_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_44_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_45_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_46_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_47_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_48_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_49_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_50_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_51_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_52_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_53_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_54_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_55_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_56_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_57_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_58_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_59_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_60_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_61_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_62_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_63_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_64_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_65_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_66_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_67_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_68_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_69_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_70_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_71_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_72_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_73_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_74_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_75_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_76_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_77_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_78_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_79_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_80_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_81_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_82_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_83_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_84_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_85_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_86_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_87_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_88_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_89_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_90_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_91_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_92_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_93_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_record_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_record_grp_id.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Pln]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Pln(MSBCP_MstrPlnReg p){

	}

	/**
	 * [UPD]ステータスの[ReqRslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ReqRslt(MSBCP_MstrPlnReg p){
		p.columnReqRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnReqRslt_hdr_peg_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnReqRslt_sno_sprt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnReqRslt_rqmt_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.ReqRslt_rqmt_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnReqRslt_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnReqRslt_due_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnReqRslt_old_due_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnReqRslt_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnReqRslt_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnReqRslt_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnReqRslt_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnReqRslt_sno1_num_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnReqRslt_sno2_num_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnReqRslt_sno3_num_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnReqRslt_sno4_num_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnReqRslt_rqmt_sno1_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnReqRslt_rqmt_sno2_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnReqRslt_rqmt_sno3_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnReqRslt_rqmt_sno4_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.ReqRslt_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.columnReqRslt_fix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.ReqRslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnReqRslt_mfg_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_mfg_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_sppl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_rqst_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_rqst_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_rqst_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_rqst_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_gnrt_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_gnrt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnReqRslt_rqmt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnReqRslt_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnReqRslt_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnReqRslt_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnReqRslt_strg_loc_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_strg_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_site_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_strg_loc_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_strg_loc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ReqRslt_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.ReqRslt_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnReqRslt_mps_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_mps_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnReqRslt_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnReqRslt_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBCP_MstrPlnReg p){
		p.Btn_sprt_sno.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBCP_MstrPlnReg p){

	}

	/**
	 * [UPD]ステータスの[MpsMaxRslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_MpsMaxRslt(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab1(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab2(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MSBCP_MstrPlnReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_due_dt_fr.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_due_dt_to.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_mps_grp_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mps_grp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_disp_key_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_disp_ship_schd_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_disp_prcd_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_disp_mps_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd2(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_LPnl(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MSBCP_MstrPlnReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_peg_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_disp_00.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_mps_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mps_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sppl_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sppl_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_rqst_loc_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_rqst_loc_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_proc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_proc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_site_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_wg_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno1_num_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno2_num_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno3_num_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_sno4_num_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno1_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno2_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno3_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno4_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_row_title_col.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_row_title_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_qty_00_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_01_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_02_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_03_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_04_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_05_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_06_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_07_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_08_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_09_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_10_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_11_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_12_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_13_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_14_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_15_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_16_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_17_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_18_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_19_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_20_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_21_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_22_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_23_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_24_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_25_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_26_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_27_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_28_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_29_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_30_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_31_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_32_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_33_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_34_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_35_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_36_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_37_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_38_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_39_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_40_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_41_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_42_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_43_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_44_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_45_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_46_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_47_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_48_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_49_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_50_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_51_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_52_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_53_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_54_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_55_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_56_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_57_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_58_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_59_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_60_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_61_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_62_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_63_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_64_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_65_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_66_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_67_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_68_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_69_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_70_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_71_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_72_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_73_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_74_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_75_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_76_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_77_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_78_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_79_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_80_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_81_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_82_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_83_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_84_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_85_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_86_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_87_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_88_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_89_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_90_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_91_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_92_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_93_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_record_id.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_record_grp_id.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Pln]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Pln(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ReqRslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ReqRslt(MSBCP_MstrPlnReg p){
		p.columnReqRslt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_hdr_peg_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnReqRslt_sno_sprt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.ReqRslt_rqmt_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnReqRslt_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnReqRslt_due_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_old_due_dt.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnReqRslt_sno1_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnReqRslt_sno2_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnReqRslt_sno3_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnReqRslt_sno4_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnReqRslt_sno1_num_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnReqRslt_sno2_num_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnReqRslt_sno3_num_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnReqRslt_sno4_num_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnReqRslt_rqmt_sno1_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnReqRslt_rqmt_sno2_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnReqRslt_rqmt_sno3_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnReqRslt_rqmt_sno4_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.ReqRslt_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnReqRslt_fix_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.ReqRslt_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnReqRslt_mfg_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_mfg_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_sppl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_sppl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_rqst_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_rqst_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_rqst_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_rqst_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_gnrt_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_gnrt_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_intr_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_strg_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_strg_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_site_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_site_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_strg_loc_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_strg_loc_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_itm_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_itm_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_itm_typ_d_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_itm_typ_d_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.ReqRslt_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.ReqRslt_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnReqRslt_mps_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_mps_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_ins_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_ins_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_ins_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_ins_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_ins_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnReqRslt_upd_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_upd_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_upd_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_upd_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_upd_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnReqRslt_upd_srv_req_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MSBCP_MstrPlnReg p){
		p.Btn_sprt_sno.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[MpsMaxRslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_MpsMaxRslt(MSBCP_MstrPlnReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBCP_MstrPlnReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MSBCP_MstrPlnReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBCP_MstrPlnReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MSBCP_MstrPlnReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBCP_MstrPlnReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBCP_MstrPlnReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_due_dt_fr.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_due_dt_to.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_mps_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mps_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_disp_key_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_disp_ship_schd_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_disp_prcd_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_disp_mps_flg.putMode(p, DEL, MCMode.REQUIRED);

	}

	/**
	 * [DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd2(MSBCP_MstrPlnReg p){

	}

	/**
	 * [DEL]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LPnl(MSBCP_MstrPlnReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MSBCP_MstrPlnReg p){

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MSBCP_MstrPlnReg p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRslt_peg_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_disp_00.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_mps_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mps_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sppl_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_rqst_loc_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_rqst_loc_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_proc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_proc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_site_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_wg_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno1_num_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno2_num_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno3_num_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_sno4_num_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno1_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno2_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno3_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno4_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_row_title_col.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_row_title_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_qty_00_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_01_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_02_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_03_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_04_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_05_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_06_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_07_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_08_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_09_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_10_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_11_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_12_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_13_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_14_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_15_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_16_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_17_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_18_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_19_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_20_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_21_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_22_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_23_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_24_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_25_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_26_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_27_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_28_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_29_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_30_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_31_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_32_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_33_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_34_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_35_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_36_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_37_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_38_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_39_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_40_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_41_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_42_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_43_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_44_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_45_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_46_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_47_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_48_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_49_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_50_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_51_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_52_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_53_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_54_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_55_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_56_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_57_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_58_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_59_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_60_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_61_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_62_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_63_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_64_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_65_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_66_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_67_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_68_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_69_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_70_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_71_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_72_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_73_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_74_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_75_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_76_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_77_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_78_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_79_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_80_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_81_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_82_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_83_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_84_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_85_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_86_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_87_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_88_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_89_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_90_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_91_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_92_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_93_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_record_id.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_record_grp_id.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Pln]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Pln(MSBCP_MstrPlnReg p){

	}

	/**
	 * [DEL]ステータスの[ReqRslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ReqRslt(MSBCP_MstrPlnReg p){
		p.columnReqRslt_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_hdr_peg_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnReqRslt_sno_sprt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.ReqRslt_rqmt_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnReqRslt_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnReqRslt_due_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_old_due_dt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnReqRslt_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnReqRslt_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnReqRslt_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnReqRslt_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnReqRslt_sno1_num_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnReqRslt_sno2_num_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnReqRslt_sno3_num_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnReqRslt_sno4_num_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnReqRslt_rqmt_sno1_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnReqRslt_rqmt_sno2_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnReqRslt_rqmt_sno3_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnReqRslt_rqmt_sno4_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.ReqRslt_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnReqRslt_fix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.ReqRslt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnReqRslt_mfg_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_mfg_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_rqst_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_rqst_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_rqst_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_rqst_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_gnrt_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_gnrt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_strg_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_strg_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_site_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_site_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_strg_loc_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_strg_loc_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.ReqRslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.ReqRslt_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnReqRslt_mps_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_mps_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnReqRslt_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnReqRslt_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBCP_MstrPlnReg p){
		p.Btn_sprt_sno.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBCP_MstrPlnReg p){

	}

	/**
	 * [DEL]ステータスの[MpsMaxRslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_MpsMaxRslt(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBCP_MstrPlnReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_due_dt_fr.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_due_dt_to.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_mps_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_mps_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_disp_key_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_disp_ship_schd_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_disp_prcd_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_disp_mps_flg.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LPnl(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBCP_MstrPlnReg p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_peg_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_disp_00.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_mps_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mps_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sppl_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rqst_loc_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rqst_loc_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_proc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_proc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_site_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno1_num_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno2_num_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno3_num_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_sno4_num_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno1_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno2_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno3_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno4_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_row_title_col.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_row_title_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_qty_00_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_01_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_02_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_03_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_04_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_05_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_06_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_07_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_08_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_09_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_10_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_11_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_12_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_13_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_14_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_15_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_16_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_17_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_18_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_19_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_20_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_21_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_22_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_23_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_24_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_25_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_26_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_27_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_28_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_29_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_30_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_31_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_32_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_33_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_34_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_35_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_36_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_37_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_38_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_39_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_40_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_41_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_42_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_43_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_44_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_45_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_46_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_47_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_48_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_49_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_50_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_51_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_52_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_53_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_54_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_55_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_56_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_57_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_58_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_59_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_60_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_61_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_62_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_63_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_64_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_65_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_66_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_67_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_68_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_69_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_70_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_71_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_72_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_73_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_74_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_75_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_76_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_77_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_78_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_79_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_80_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_81_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_82_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_83_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_84_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_85_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_86_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_87_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_88_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_89_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_90_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_91_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_92_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_93_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_record_id.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_record_grp_id.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Pln]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Pln(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH]ステータスの[ReqRslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ReqRslt(MSBCP_MstrPlnReg p){
		p.columnReqRslt_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_hdr_peg_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnReqRslt_sno_sprt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ReqRslt_rqmt_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnReqRslt_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnReqRslt_due_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_old_due_dt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnReqRslt_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnReqRslt_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnReqRslt_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnReqRslt_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnReqRslt_sno1_num_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnReqRslt_sno2_num_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnReqRslt_sno3_num_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnReqRslt_sno4_num_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnReqRslt_rqmt_sno1_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnReqRslt_rqmt_sno2_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnReqRslt_rqmt_sno3_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnReqRslt_rqmt_sno4_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ReqRslt_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnReqRslt_fix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ReqRslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnReqRslt_mfg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_mfg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_rqst_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_rqst_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_rqst_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_rqst_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_gnrt_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_gnrt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_strg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_strg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_site_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_site_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_strg_loc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_strg_loc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ReqRslt_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.ReqRslt_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnReqRslt_mps_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_mps_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnReqRslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnReqRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBCP_MstrPlnReg p){
		p.Btn_sprt_sno.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBCP_MstrPlnReg p){

	}

	/**
	 * [SRCH]ステータスの[MpsMaxRslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_MpsMaxRslt(MSBCP_MstrPlnReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBCP_MstrPlnReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBCP_MstrPlnReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBCP_MstrPlnReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBCP_MstrPlnReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBCP_MstrPlnReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBCP_MstrPlnReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_due_dt_fr.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_due_dt_to.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_mps_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mps_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);
		p.Cnd_disp_key_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_disp_ship_schd_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_disp_prcd_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_disp_mps_flg.putMode(p, REF, MCMode.REQUIRED);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MSBCP_MstrPlnReg p){

	}

	/**
	 * [REF]ステータスの[LPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_LPnl(MSBCP_MstrPlnReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBCP_MstrPlnReg p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBCP_MstrPlnReg p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_peg_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_disp_00.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_mps_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mps_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_mfg_loc_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sppl_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_rqst_loc_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_rqst_loc_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_proc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_proc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_site_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_site_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno1_num_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno2_num_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno3_num_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_sno4_num_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno1_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno2_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno3_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_rqmt_sno4_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_row_title_col.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_row_title_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_qty_00_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_01_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_02_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_03_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_04_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_05_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_06_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_07_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_08_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_09_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_10_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_11_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_12_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_13_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_14_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_15_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_16_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_17_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_18_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_19_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_20_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_21_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_22_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_23_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_24_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_25_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_26_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_27_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_28_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_29_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_30_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_31_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_32_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_33_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_34_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_35_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_36_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_37_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_38_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_39_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_40_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_41_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_42_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_43_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_44_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_45_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_46_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_47_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_48_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_49_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_50_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_51_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_52_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_53_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_54_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_55_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_56_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_57_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_58_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_59_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_60_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_61_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_62_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_63_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_64_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_65_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_66_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_67_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_68_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_69_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_70_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_71_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_72_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_73_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_74_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_75_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_76_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_77_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_78_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_79_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_80_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_81_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_82_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_83_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_84_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_85_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_86_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_87_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_88_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_89_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_90_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_91_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_92_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_qty_93_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRslt_record_id.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_record_grp_id.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Pln]ブロックのモードの設定
	 */
	protected static void statusInitREF_Pln(MSBCP_MstrPlnReg p){

	}

	/**
	 * [REF]ステータスの[ReqRslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_ReqRslt(MSBCP_MstrPlnReg p){
		p.columnReqRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_hdr_peg_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnReqRslt_sno_sprt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_no.putMode(p, REF, MCMode.READ_ONLY);
		p.ReqRslt_rqmt_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnReqRslt_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnReqRslt_due_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_old_due_dt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnReqRslt_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnReqRslt_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnReqRslt_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnReqRslt_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnReqRslt_sno1_num_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnReqRslt_sno2_num_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnReqRslt_sno3_num_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnReqRslt_sno4_num_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnReqRslt_rqmt_sno1_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnReqRslt_rqmt_sno2_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnReqRslt_rqmt_sno3_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnReqRslt_rqmt_sno4_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.ReqRslt_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnReqRslt_fix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.ReqRslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnReqRslt_mfg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_mfg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_rqst_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_rqst_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_rqst_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_rqst_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_gnrt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_gnrt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_rqmt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_strg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_strg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_strg_loc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_strg_loc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ReqRslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.ReqRslt_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnReqRslt_mps_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_mps_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnReqRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnReqRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBCP_MstrPlnReg p){
		p.Btn_sprt_sno.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBCP_MstrPlnReg p){

	}

	/**
	 * [REF]ステータスの[MpsMaxRslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_MpsMaxRslt(MSBCP_MstrPlnReg p){

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
		MSBCP_MstrPlnReg_MC.setTableConfigRslt((MSBCP_MstrPlnReg)this);
		MSBCP_MstrPlnReg_MC.setTableConfigReqRslt((MSBCP_MstrPlnReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBCP_MstrPlnReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_peg_no.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.peg_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_peg_no);
		p.columnRslt_disp_00.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.disp_00_META);
		p.RsltTable.addColumnConfig(p.columnRslt_disp_00);
		p.columnRslt_mps_grp_cd.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.mps_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mps_grp_cd);
		p.columnRslt_mps_grp_nm.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.mps_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mps_grp_nm);
		p.columnRslt_strg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.strg_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_cd);
		p.columnRslt_strg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.strg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_nm);
		p.columnRslt_mfg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.mfg_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_cd);
		p.columnRslt_mfg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.mfg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_nm);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.columnRslt_rqst_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.rqst_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_loc_cd);
		p.columnRslt_rqst_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.rqst_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_loc_nm);
		p.columnRslt_proc_cd.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.proc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_proc_cd);
		p.columnRslt_proc_nm.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.proc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_proc_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_unit_cd.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_cd);
		p.columnRslt_unit_nm.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unit_nm);
		p.columnRslt_dec_place.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dec_place);
		p.columnRslt_site_cd.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_cd);
		p.columnRslt_site_nm.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_site_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_sno1_mng_typ.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.sno1_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1_mng_typ);
		p.columnRslt_sno2_mng_typ.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.sno2_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2_mng_typ);
		p.columnRslt_sno3_mng_typ.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.sno3_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3_mng_typ);
		p.columnRslt_sno4_mng_typ.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.sno4_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4_mng_typ);
		p.columnRslt_sno1_num_typ.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.sno1_num_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno1_num_typ);
		p.columnRslt_sno2_num_typ.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.sno2_num_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno2_num_typ);
		p.columnRslt_sno3_num_typ.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.sno3_num_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno3_num_typ);
		p.columnRslt_sno4_num_typ.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.sno4_num_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sno4_num_typ);
		p.columnRslt_rqmt_sno1_flg.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.rqmt_sno1_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqmt_sno1_flg);
		p.columnRslt_rqmt_sno2_flg.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.rqmt_sno2_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqmt_sno2_flg);
		p.columnRslt_rqmt_sno3_flg.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.rqmt_sno3_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqmt_sno3_flg);
		p.columnRslt_rqmt_sno4_flg.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.rqmt_sno4_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqmt_sno4_flg);
		p.columnRslt_row_title_col.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.row_title_col_META);
		p.RsltTable.addColumnConfig(p.columnRslt_row_title_col);
		p.columnRslt_row_title_nm.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.row_title_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_row_title_nm);
		p.RsltTable.addTable(p.Rslt_qty_00_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_01_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_02_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_03_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_04_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_05_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_06_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_07_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_08_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_09_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_10_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_11_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_12_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_13_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_14_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_15_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_16_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_17_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_18_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_19_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_20_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_21_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_22_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_23_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_24_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_25_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_26_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_27_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_28_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_29_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_30_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_31_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_32_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_33_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_34_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_35_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_36_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_37_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_38_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_39_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_40_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_41_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_42_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_43_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_44_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_45_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_46_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_47_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_48_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_49_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_50_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_51_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_52_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_53_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_54_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_55_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_56_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_57_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_58_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_59_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_60_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_61_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_62_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_63_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_64_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_65_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_66_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_67_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_68_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_69_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_70_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_71_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_72_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_73_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_74_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_75_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_76_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_77_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_78_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_79_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_80_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_81_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_82_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_83_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_84_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_85_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_86_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_87_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_88_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_89_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_90_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_91_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_92_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_qty_93_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRslt_record_id.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.record_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_record_id);
		p.columnRslt_record_grp_id.setMeta(mcframe.clientMSBC.MSBCP0020.RsltR.record_grp_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_record_grp_id);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_peg_no);
	}

	/**
	 * [ReqRslt]ブロックのTableの設定
	 */
	protected static void setTableConfigReqRslt(MSBCP_MstrPlnReg p) {
		p.columnReqRslt_check.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.check_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_check);
		p.columnReqRslt_hdr_peg_no.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.hdr_peg_no_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_hdr_peg_no);
		p.columnReqRslt_sno_sprt_flg.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.sno_sprt_flg_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_sno_sprt_flg);
		p.columnReqRslt_rqmt_no.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.rqmt_no_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_rqmt_no);
		p.ReqRsltTable.addTable(p.ReqRslt_rqmt_qty_p_PPanel.QtyTable);
		p.columnReqRslt_unit_cd.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.unit_cd_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_unit_cd);
		p.columnReqRslt_unit_nm.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.unit_nm_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_unit_nm);
		p.columnReqRslt_dec_place.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.dec_place_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_dec_place);
		p.columnReqRslt_due_dt.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.due_dt_META);
		p.columnReqRslt_due_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_due_dt);
		p.columnReqRslt_old_due_dt.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.old_due_dt_META);
		p.columnReqRslt_old_due_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_old_due_dt);
		p.columnReqRslt_sno1_mng_typ.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.sno1_mng_typ_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_sno1_mng_typ);
		p.columnReqRslt_sno2_mng_typ.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.sno2_mng_typ_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_sno2_mng_typ);
		p.columnReqRslt_sno3_mng_typ.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.sno3_mng_typ_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_sno3_mng_typ);
		p.columnReqRslt_sno4_mng_typ.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.sno4_mng_typ_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_sno4_mng_typ);
		p.columnReqRslt_sno1_num_typ.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.sno1_num_typ_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_sno1_num_typ);
		p.columnReqRslt_sno2_num_typ.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.sno2_num_typ_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_sno2_num_typ);
		p.columnReqRslt_sno3_num_typ.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.sno3_num_typ_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_sno3_num_typ);
		p.columnReqRslt_sno4_num_typ.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.sno4_num_typ_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_sno4_num_typ);
		p.columnReqRslt_rqmt_sno1_flg.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.rqmt_sno1_flg_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_rqmt_sno1_flg);
		p.columnReqRslt_rqmt_sno2_flg.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.rqmt_sno2_flg_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_rqmt_sno2_flg);
		p.columnReqRslt_rqmt_sno3_flg.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.rqmt_sno3_flg_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_rqmt_sno3_flg);
		p.columnReqRslt_rqmt_sno4_flg.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.rqmt_sno4_flg_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_rqmt_sno4_flg);
		p.ReqRsltTable.addTable(p.ReqRslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnReqRslt_fix_flg.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.fix_flg_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_fix_flg);
		p.ReqRsltTable.addTable(p.ReqRslt_itm_p_PPanel.ItmTable);
		p.ReqRslt_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnReqRslt_itm_nm, p.columnReqRslt_itm_sub1, p.columnReqRslt_itm_sub2, p.columnReqRslt_itm_sub3, p.columnReqRslt_unit_cd, p.columnReqRslt_unit_nm, p.columnReqRslt_dec_place, p.columnReqRslt_sno1_mng_typ, p.columnReqRslt_sno2_mng_typ, p.columnReqRslt_sno3_mng_typ, p.columnReqRslt_sno4_mng_typ, p.columnReqRslt_sno1_num_typ, p.columnReqRslt_sno2_num_typ, p.columnReqRslt_sno3_num_typ, p.columnReqRslt_sno4_num_typ, p.columnReqRslt_rqmt_sno1_flg, p.columnReqRslt_rqmt_sno2_flg, p.columnReqRslt_rqmt_sno3_flg, p.columnReqRslt_rqmt_sno4_flg);
		p.ReqRslt_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnReqRslt_itm_nm, p.columnReqRslt_itm_sub2, p.columnReqRslt_itm_sub3, p.columnReqRslt_unit_cd, p.columnReqRslt_unit_nm, p.columnReqRslt_dec_place, p.columnReqRslt_sno1_mng_typ, p.columnReqRslt_sno2_mng_typ, p.columnReqRslt_sno3_mng_typ, p.columnReqRslt_sno4_mng_typ, p.columnReqRslt_sno1_num_typ, p.columnReqRslt_sno2_num_typ, p.columnReqRslt_sno3_num_typ, p.columnReqRslt_sno4_num_typ, p.columnReqRslt_rqmt_sno1_flg, p.columnReqRslt_rqmt_sno2_flg, p.columnReqRslt_rqmt_sno3_flg, p.columnReqRslt_rqmt_sno4_flg);
		p.ReqRslt_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnReqRslt_itm_nm, p.columnReqRslt_itm_sub3, p.columnReqRslt_unit_cd, p.columnReqRslt_unit_nm, p.columnReqRslt_dec_place, p.columnReqRslt_sno1_mng_typ, p.columnReqRslt_sno2_mng_typ, p.columnReqRslt_sno3_mng_typ, p.columnReqRslt_sno4_mng_typ, p.columnReqRslt_sno1_num_typ, p.columnReqRslt_sno2_num_typ, p.columnReqRslt_sno3_num_typ, p.columnReqRslt_sno4_num_typ, p.columnReqRslt_rqmt_sno1_flg, p.columnReqRslt_rqmt_sno2_flg, p.columnReqRslt_rqmt_sno3_flg, p.columnReqRslt_rqmt_sno4_flg);
		p.ReqRslt_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnReqRslt_itm_nm, p.columnReqRslt_unit_cd, p.columnReqRslt_unit_nm, p.columnReqRslt_dec_place, p.columnReqRslt_sno1_mng_typ, p.columnReqRslt_sno2_mng_typ, p.columnReqRslt_sno3_mng_typ, p.columnReqRslt_sno4_mng_typ, p.columnReqRslt_sno1_num_typ, p.columnReqRslt_sno2_num_typ, p.columnReqRslt_sno3_num_typ, p.columnReqRslt_sno4_num_typ, p.columnReqRslt_rqmt_sno1_flg, p.columnReqRslt_rqmt_sno2_flg, p.columnReqRslt_rqmt_sno3_flg, p.columnReqRslt_rqmt_sno4_flg);
		p.columnReqRslt_mfg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.mfg_loc_cd_META);
		p.columnReqRslt_mfg_loc_cd.addLinkBeans(p.columnReqRslt_mfg_loc_nm);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_mfg_loc_cd);
		p.columnReqRslt_mfg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.mfg_loc_nm_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_mfg_loc_nm);
		p.columnReqRslt_sppl_cd.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.sppl_cd_META);
		p.columnReqRslt_sppl_cd.addLinkBeans(p.columnReqRslt_sppl_nm);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_sppl_cd);
		p.columnReqRslt_sppl_nm.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.sppl_nm_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_sppl_nm);
		p.columnReqRslt_rqst_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.rqst_loc_cd_META);
		p.columnReqRslt_rqst_loc_cd.addLinkBeans(p.columnReqRslt_rqst_loc_nm,p.columnReqRslt_rqst_wg_cd,p.columnReqRslt_rqst_wg_nm);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_rqst_loc_cd);
		p.columnReqRslt_rqst_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.rqst_loc_nm_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_rqst_loc_nm);
		p.columnReqRslt_rqst_wg_cd.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.rqst_wg_cd_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_rqst_wg_cd);
		p.columnReqRslt_rqst_wg_nm.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.rqst_wg_nm_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_rqst_wg_nm);
		p.columnReqRslt_rqmt_gnrt_typ.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.rqmt_gnrt_typ_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_rqmt_gnrt_typ);
		p.columnReqRslt_rqmt_gnrt_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.rqmt_gnrt_typ_nm_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_rqmt_gnrt_typ_nm);
		p.columnReqRslt_rqmt_typ.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.rqmt_typ_META);
		p.columnReqRslt_rqmt_typ.addLinkBeans(p.columnReqRslt_rqmt_typ_nm);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_rqmt_typ);
		p.columnReqRslt_rqmt_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.rqmt_typ_nm_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_rqmt_typ_nm);
		p.columnReqRslt_intr_rmrks.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.intr_rmrks_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_intr_rmrks);
		p.columnReqRslt_sub_char1.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.sub_char1_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_sub_char1);
		p.columnReqRslt_sub_char2.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.sub_char2_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_sub_char2);
		p.columnReqRslt_sub_char3.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.sub_char3_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_sub_char3);
		p.columnReqRslt_strg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.strg_loc_cd_META);
		p.columnReqRslt_strg_loc_cd.setListType(MCListType.STRICT);
		p.columnReqRslt_strg_loc_cd.addLinkBeans(p.columnReqRslt_strg_loc_nm,p.columnReqRslt_site_cd,p.columnReqRslt_site_nm,p.columnReqRslt_wg_cd,p.columnReqRslt_wg_nm,p.columnReqRslt_strg_loc_grp_cd,p.columnReqRslt_strg_loc_grp_nm);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_strg_loc_cd);
		p.columnReqRslt_strg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.strg_loc_nm_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_strg_loc_nm);
		p.columnReqRslt_site_cd.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.site_cd_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_site_cd);
		p.columnReqRslt_site_nm.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.site_nm_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_site_nm);
		p.columnReqRslt_wg_cd.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.wg_cd_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_wg_cd);
		p.columnReqRslt_wg_nm.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.wg_nm_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_wg_nm);
		p.columnReqRslt_strg_loc_grp_cd.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.strg_loc_grp_cd_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_strg_loc_grp_cd);
		p.columnReqRslt_strg_loc_grp_nm.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.strg_loc_grp_nm_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_strg_loc_grp_nm);
		p.columnReqRslt_itm_typ.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.itm_typ_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_itm_typ);
		p.columnReqRslt_itm_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.itm_typ_nm_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_itm_typ_nm);
		p.columnReqRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.itm_typ_d_cd_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_itm_typ_d_cd);
		p.columnReqRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.itm_typ_d_nm_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_itm_typ_d_nm);
		p.ReqRsltTable.addTable(p.ReqRslt_rts_msg_p_PPanel.RtnMsgTable);
		p.ReqRsltTable.addTable(p.ReqRslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnReqRslt_mps_grp_cd.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.mps_grp_cd_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_mps_grp_cd);
		p.columnReqRslt_mps_grp_nm.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.mps_grp_nm_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_mps_grp_nm);
		p.columnReqRslt_ins_usr_id.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.ins_usr_id_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_ins_usr_id);
		p.columnReqRslt_ins_usr_nm.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.ins_usr_nm_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_ins_usr_nm);
		p.columnReqRslt_ins_func_id.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.ins_func_id_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_ins_func_id);
		p.columnReqRslt_ins_func_nm.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.ins_func_nm_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_ins_func_nm);
		p.columnReqRslt_ins_ts.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.ins_ts_META);
		p.columnReqRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_ins_ts);
		p.columnReqRslt_upd_cntr.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.upd_cntr_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_upd_cntr);
		p.columnReqRslt_upd_usr_id.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.upd_usr_id_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_upd_usr_id);
		p.columnReqRslt_upd_usr_nm.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.upd_usr_nm_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_upd_usr_nm);
		p.columnReqRslt_upd_func_id.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.upd_func_id_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_upd_func_id);
		p.columnReqRslt_upd_func_nm.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.upd_func_nm_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_upd_func_nm);
		p.columnReqRslt_upd_ts.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.upd_ts_META);
		p.columnReqRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_upd_ts);
		p.columnReqRslt_upd_srv_req_no.setMeta(mcframe.clientMSBC.MSBCP0020.ReqRsltR.upd_srv_req_no_META);
		p.ReqRsltTable.addColumnConfig(p.columnReqRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.ReqRsltTable.setUnscrollColumn(p.columnReqRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_mps_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mps_grp_cd.getListConfig().setPutter(getCnd_mps_grp_cd_ListPutter());
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_strg_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_strg_loc_grp_cd.getListConfig().setPutter(getCnd_strg_loc_grp_cd_ListPutter());
		Cnd_strg_loc_cd.getListConfig().setPutter(getCnd_strg_loc_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		ReqRslt_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getReqRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		ReqRslt_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		ReqRslt_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getReqRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		ReqRslt_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		ReqRslt_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getReqRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		ReqRslt_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		ReqRslt_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getReqRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnReqRslt_mfg_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnReqRslt_mfg_loc_cd.getListConfig().setPutter(getReqRslt_mfg_loc_cd_ListPutter());
		columnReqRslt_sppl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnReqRslt_sppl_cd.getListConfig().setPutter(getReqRslt_sppl_cd_ListPutter());
		columnReqRslt_rqst_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnReqRslt_rqst_loc_cd.getListConfig().setPutter(getReqRslt_rqst_loc_cd_ListPutter());
		columnReqRslt_rqmt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnReqRslt_rqmt_typ.getListConfig().setPutter(getReqRslt_rqmt_typ_ListPutter());
		columnReqRslt_strg_loc_cd.getListConfig().setPutter(getReqRslt_strg_loc_cd_ListPutter());
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
		if (UPD.equals(status)) {
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
	 * [Cnd_mps_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mps_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.MpsGrp");
		return lp;
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
	 * [ReqRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createReqRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [ReqRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createReqRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [ReqRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createReqRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [ReqRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createReqRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [ReqRslt_mfg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createReqRslt_mfg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlMfgLoc");
		return lp;
	}
	 
	/**
	 * [ReqRslt_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createReqRslt_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlSppl");
		return lp;
	}
	 
	/**
	 * [ReqRslt_rqst_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createReqRslt_rqst_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlRqstLoc");
		return lp;
	}
	 
	/**
	 * [ReqRslt_rqmt_typ_ListPutter]の作成
	 */
	protected MCListPutter createReqRslt_rqmt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RqmtTyp");
		return lp;
	}
	 
	/**
	 * [ReqRslt_strg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createReqRslt_strg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_mps_grp_cd) return getCnd_mps_grp_cd(row, info);
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_strg_loc_grp_cd) return getCnd_strg_loc_grp_cd(row, info);
		if(combo == Cnd_strg_loc_cd) return getCnd_strg_loc_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == ReqRslt_itm_p_PPanel.columnItm_itm_cd) return getReqRslt_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == ReqRslt_itm_p_PPanel.columnItm_itm_sub1) return getReqRslt_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == ReqRslt_itm_p_PPanel.columnItm_itm_sub2) return getReqRslt_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == ReqRslt_itm_p_PPanel.columnItm_itm_sub3) return getReqRslt_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnReqRslt_mfg_loc_cd) return getReqRslt_mfg_loc_cd(row, info);
		if(combo == columnReqRslt_sppl_cd) return getReqRslt_sppl_cd(row, info);
		if(combo == columnReqRslt_rqst_loc_cd) return getReqRslt_rqst_loc_cd(row, info);
		if(combo == columnReqRslt_rqmt_typ) return getReqRslt_rqmt_typ(row, info);
		if(combo == columnReqRslt_strg_loc_cd) return getReqRslt_strg_loc_cd(row, info);
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
		else if (ap == Btn_sprt_sno) doBtn_sprt_sno(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

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
		if (vc == ReqRsltTable) return doReqRslt_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_due_dt_fr) return doCnd_due_dt_fr_VC(info);
		if (vc == Cnd_due_dt_to) return doCnd_due_dt_to_VC(info);
		if (vc == Cnd_mps_grp_cd) return doCnd_mps_grp_cd_VC(info);
		if (vc == Cnd_mps_grp_nm) return doCnd_mps_grp_nm_VC(info);
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_strg_loc_grp_cd) return doCnd_strg_loc_grp_cd_VC(info);
		if (vc == Cnd_strg_loc_grp_nm) return doCnd_strg_loc_grp_nm_VC(info);
		if (vc == Cnd_strg_loc_cd) return doCnd_strg_loc_cd_VC(info);
		if (vc == Cnd_strg_loc_nm) return doCnd_strg_loc_nm_VC(info);
		if (vc == Cnd_disp_key_flg) return doCnd_disp_key_flg_VC(info);
		if (vc == Cnd_disp_ship_schd_flg) return doCnd_disp_ship_schd_flg_VC(info);
		if (vc == Cnd_disp_prcd_flg) return doCnd_disp_prcd_flg_VC(info);
		if (vc == Cnd_disp_mps_flg) return doCnd_disp_mps_flg_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_peg_no) return doRslt_peg_no_VC(info);
		if (vc == columnRslt_disp_00) return doRslt_disp_00_VC(info);
		if (vc == columnRslt_mps_grp_cd) return doRslt_mps_grp_cd_VC(info);
		if (vc == columnRslt_mps_grp_nm) return doRslt_mps_grp_nm_VC(info);
		if (vc == columnRslt_strg_loc_cd) return doRslt_strg_loc_cd_VC(info);
		if (vc == columnRslt_strg_loc_nm) return doRslt_strg_loc_nm_VC(info);
		if (vc == columnRslt_mfg_loc_cd) return doRslt_mfg_loc_cd_VC(info);
		if (vc == columnRslt_mfg_loc_nm) return doRslt_mfg_loc_nm_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_rqst_loc_cd) return doRslt_rqst_loc_cd_VC(info);
		if (vc == columnRslt_rqst_loc_nm) return doRslt_rqst_loc_nm_VC(info);
		if (vc == columnRslt_proc_cd) return doRslt_proc_cd_VC(info);
		if (vc == columnRslt_proc_nm) return doRslt_proc_nm_VC(info);
		if (vc == columnRslt_unit_cd) return doRslt_unit_cd_VC(info);
		if (vc == columnRslt_unit_nm) return doRslt_unit_nm_VC(info);
		if (vc == columnRslt_dec_place) return doRslt_dec_place_VC(info);
		if (vc == columnRslt_site_cd) return doRslt_site_cd_VC(info);
		if (vc == columnRslt_site_nm) return doRslt_site_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
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
		if (vc == columnRslt_row_title_col) return doRslt_row_title_col_VC(info);
		if (vc == columnRslt_row_title_nm) return doRslt_row_title_nm_VC(info);
		if (vc == columnRslt_record_id) return doRslt_record_id_VC(info);
		if (vc == columnRslt_record_grp_id) return doRslt_record_grp_id_VC(info);
		if (vc == columnReqRslt_check) return doReqRslt_check_VC(info);
		if (vc == columnReqRslt_hdr_peg_no) return doReqRslt_hdr_peg_no_VC(info);
		if (vc == columnReqRslt_sno_sprt_flg) return doReqRslt_sno_sprt_flg_VC(info);
		if (vc == columnReqRslt_rqmt_no) return doReqRslt_rqmt_no_VC(info);
		if (vc == columnReqRslt_unit_cd) return doReqRslt_unit_cd_VC(info);
		if (vc == columnReqRslt_unit_nm) return doReqRslt_unit_nm_VC(info);
		if (vc == columnReqRslt_dec_place) return doReqRslt_dec_place_VC(info);
		if (vc == columnReqRslt_due_dt) return doReqRslt_due_dt_VC(info);
		if (vc == columnReqRslt_old_due_dt) return doReqRslt_old_due_dt_VC(info);
		if (vc == columnReqRslt_sno1_mng_typ) return doReqRslt_sno1_mng_typ_VC(info);
		if (vc == columnReqRslt_sno2_mng_typ) return doReqRslt_sno2_mng_typ_VC(info);
		if (vc == columnReqRslt_sno3_mng_typ) return doReqRslt_sno3_mng_typ_VC(info);
		if (vc == columnReqRslt_sno4_mng_typ) return doReqRslt_sno4_mng_typ_VC(info);
		if (vc == columnReqRslt_sno1_num_typ) return doReqRslt_sno1_num_typ_VC(info);
		if (vc == columnReqRslt_sno2_num_typ) return doReqRslt_sno2_num_typ_VC(info);
		if (vc == columnReqRslt_sno3_num_typ) return doReqRslt_sno3_num_typ_VC(info);
		if (vc == columnReqRslt_sno4_num_typ) return doReqRslt_sno4_num_typ_VC(info);
		if (vc == columnReqRslt_rqmt_sno1_flg) return doReqRslt_rqmt_sno1_flg_VC(info);
		if (vc == columnReqRslt_rqmt_sno2_flg) return doReqRslt_rqmt_sno2_flg_VC(info);
		if (vc == columnReqRslt_rqmt_sno3_flg) return doReqRslt_rqmt_sno3_flg_VC(info);
		if (vc == columnReqRslt_rqmt_sno4_flg) return doReqRslt_rqmt_sno4_flg_VC(info);
		if (vc == columnReqRslt_fix_flg) return doReqRslt_fix_flg_VC(info);
		if (vc == columnReqRslt_mfg_loc_cd) return doReqRslt_mfg_loc_cd_VC(info);
		if (vc == columnReqRslt_mfg_loc_nm) return doReqRslt_mfg_loc_nm_VC(info);
		if (vc == columnReqRslt_sppl_cd) return doReqRslt_sppl_cd_VC(info);
		if (vc == columnReqRslt_sppl_nm) return doReqRslt_sppl_nm_VC(info);
		if (vc == columnReqRslt_rqst_loc_cd) return doReqRslt_rqst_loc_cd_VC(info);
		if (vc == columnReqRslt_rqst_loc_nm) return doReqRslt_rqst_loc_nm_VC(info);
		if (vc == columnReqRslt_rqst_wg_cd) return doReqRslt_rqst_wg_cd_VC(info);
		if (vc == columnReqRslt_rqst_wg_nm) return doReqRslt_rqst_wg_nm_VC(info);
		if (vc == columnReqRslt_rqmt_gnrt_typ) return doReqRslt_rqmt_gnrt_typ_VC(info);
		if (vc == columnReqRslt_rqmt_gnrt_typ_nm) return doReqRslt_rqmt_gnrt_typ_nm_VC(info);
		if (vc == columnReqRslt_rqmt_typ) return doReqRslt_rqmt_typ_VC(info);
		if (vc == columnReqRslt_rqmt_typ_nm) return doReqRslt_rqmt_typ_nm_VC(info);
		if (vc == columnReqRslt_intr_rmrks) return doReqRslt_intr_rmrks_VC(info);
		if (vc == columnReqRslt_sub_char1) return doReqRslt_sub_char1_VC(info);
		if (vc == columnReqRslt_sub_char2) return doReqRslt_sub_char2_VC(info);
		if (vc == columnReqRslt_sub_char3) return doReqRslt_sub_char3_VC(info);
		if (vc == columnReqRslt_strg_loc_cd) return doReqRslt_strg_loc_cd_VC(info);
		if (vc == columnReqRslt_strg_loc_nm) return doReqRslt_strg_loc_nm_VC(info);
		if (vc == columnReqRslt_site_cd) return doReqRslt_site_cd_VC(info);
		if (vc == columnReqRslt_site_nm) return doReqRslt_site_nm_VC(info);
		if (vc == columnReqRslt_wg_cd) return doReqRslt_wg_cd_VC(info);
		if (vc == columnReqRslt_wg_nm) return doReqRslt_wg_nm_VC(info);
		if (vc == columnReqRslt_strg_loc_grp_cd) return doReqRslt_strg_loc_grp_cd_VC(info);
		if (vc == columnReqRslt_strg_loc_grp_nm) return doReqRslt_strg_loc_grp_nm_VC(info);
		if (vc == columnReqRslt_itm_typ) return doReqRslt_itm_typ_VC(info);
		if (vc == columnReqRslt_itm_typ_nm) return doReqRslt_itm_typ_nm_VC(info);
		if (vc == columnReqRslt_itm_typ_d_cd) return doReqRslt_itm_typ_d_cd_VC(info);
		if (vc == columnReqRslt_itm_typ_d_nm) return doReqRslt_itm_typ_d_nm_VC(info);
		if (vc == columnReqRslt_mps_grp_cd) return doReqRslt_mps_grp_cd_VC(info);
		if (vc == columnReqRslt_mps_grp_nm) return doReqRslt_mps_grp_nm_VC(info);
		if (vc == columnReqRslt_ins_usr_id) return doReqRslt_ins_usr_id_VC(info);
		if (vc == columnReqRslt_ins_usr_nm) return doReqRslt_ins_usr_nm_VC(info);
		if (vc == columnReqRslt_ins_func_id) return doReqRslt_ins_func_id_VC(info);
		if (vc == columnReqRslt_ins_func_nm) return doReqRslt_ins_func_nm_VC(info);
		if (vc == columnReqRslt_ins_ts) return doReqRslt_ins_ts_VC(info);
		if (vc == columnReqRslt_upd_cntr) return doReqRslt_upd_cntr_VC(info);
		if (vc == columnReqRslt_upd_usr_id) return doReqRslt_upd_usr_id_VC(info);
		if (vc == columnReqRslt_upd_usr_nm) return doReqRslt_upd_usr_nm_VC(info);
		if (vc == columnReqRslt_upd_func_id) return doReqRslt_upd_func_id_VC(info);
		if (vc == columnReqRslt_upd_func_nm) return doReqRslt_upd_func_nm_VC(info);
		if (vc == columnReqRslt_upd_ts) return doReqRslt_upd_ts_VC(info);
		if (vc == columnReqRslt_upd_srv_req_no) return doReqRslt_upd_srv_req_no_VC(info);
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
	 * [ReqRslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[mps_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mps_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mps_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mps_grp_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[disp_key_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_key_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[disp_ship_schd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_ship_schd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[disp_prcd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_prcd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[disp_mps_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_mps_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[peg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_peg_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[disp_00]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_disp_00_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mps_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mps_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mps_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mps_grp_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[proc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_proc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[proc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_proc_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[row_title_col]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_row_title_col_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[row_title_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_row_title_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[record_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_record_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[record_grp_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_record_grp_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[hdr_peg_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_hdr_peg_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[sno_sprt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_sno_sprt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[rqmt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_rqmt_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[due_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_due_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[old_due_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_old_due_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[sno1_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_sno1_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[sno2_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_sno2_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[sno3_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_sno3_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[sno4_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_sno4_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[rqmt_sno1_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_rqmt_sno1_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[rqmt_sno2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_rqmt_sno2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[rqmt_sno3_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_rqmt_sno3_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[rqmt_sno4_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_rqmt_sno4_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[rqst_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_rqst_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[rqst_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_rqst_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[rqst_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_rqst_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[rqst_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_rqst_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[rqmt_gnrt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_rqmt_gnrt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[rqmt_gnrt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_rqmt_gnrt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[rqmt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_rqmt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[rqmt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_rqmt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[strg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_strg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[strg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_strg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[strg_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_strg_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[strg_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_strg_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[mps_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_mps_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[mps_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_mps_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ReqRslt]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doReqRslt_upd_srv_req_no_VC(MCEventInfo info){
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
		else if (nc == ReqRsltTable) doReqRslt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_due_dt_fr) doCnd_due_dt_fr_NC(info);
		else if (nc == Cnd_due_dt_to) doCnd_due_dt_to_NC(info);
		else if (nc == Cnd_mps_grp_cd) doCnd_mps_grp_cd_NC(info);
		else if (nc == Cnd_mps_grp_nm) doCnd_mps_grp_nm_NC(info);
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_strg_loc_grp_cd) doCnd_strg_loc_grp_cd_NC(info);
		else if (nc == Cnd_strg_loc_grp_nm) doCnd_strg_loc_grp_nm_NC(info);
		else if (nc == Cnd_strg_loc_cd) doCnd_strg_loc_cd_NC(info);
		else if (nc == Cnd_strg_loc_nm) doCnd_strg_loc_nm_NC(info);
		else if (nc == Cnd_disp_key_flg) doCnd_disp_key_flg_NC(info);
		else if (nc == Cnd_disp_ship_schd_flg) doCnd_disp_ship_schd_flg_NC(info);
		else if (nc == Cnd_disp_prcd_flg) doCnd_disp_prcd_flg_NC(info);
		else if (nc == Cnd_disp_mps_flg) doCnd_disp_mps_flg_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_peg_no) doRslt_peg_no_NC(info);
		else if (nc == columnRslt_disp_00) doRslt_disp_00_NC(info);
		else if (nc == columnRslt_mps_grp_cd) doRslt_mps_grp_cd_NC(info);
		else if (nc == columnRslt_mps_grp_nm) doRslt_mps_grp_nm_NC(info);
		else if (nc == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NC(info);
		else if (nc == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NC(info);
		else if (nc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NC(info);
		else if (nc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_NC(info);
		else if (nc == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_NC(info);
		else if (nc == columnRslt_proc_cd) doRslt_proc_cd_NC(info);
		else if (nc == columnRslt_proc_nm) doRslt_proc_nm_NC(info);
		else if (nc == columnRslt_unit_cd) doRslt_unit_cd_NC(info);
		else if (nc == columnRslt_unit_nm) doRslt_unit_nm_NC(info);
		else if (nc == columnRslt_dec_place) doRslt_dec_place_NC(info);
		else if (nc == columnRslt_site_cd) doRslt_site_cd_NC(info);
		else if (nc == columnRslt_site_nm) doRslt_site_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
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
		else if (nc == columnRslt_row_title_col) doRslt_row_title_col_NC(info);
		else if (nc == columnRslt_row_title_nm) doRslt_row_title_nm_NC(info);
		else if (nc == columnRslt_record_id) doRslt_record_id_NC(info);
		else if (nc == columnRslt_record_grp_id) doRslt_record_grp_id_NC(info);
		else if (nc == columnReqRslt_check) doReqRslt_check_NC(info);
		else if (nc == columnReqRslt_hdr_peg_no) doReqRslt_hdr_peg_no_NC(info);
		else if (nc == columnReqRslt_sno_sprt_flg) doReqRslt_sno_sprt_flg_NC(info);
		else if (nc == columnReqRslt_rqmt_no) doReqRslt_rqmt_no_NC(info);
		else if (nc == columnReqRslt_unit_cd) doReqRslt_unit_cd_NC(info);
		else if (nc == columnReqRslt_unit_nm) doReqRslt_unit_nm_NC(info);
		else if (nc == columnReqRslt_dec_place) doReqRslt_dec_place_NC(info);
		else if (nc == columnReqRslt_due_dt) doReqRslt_due_dt_NC(info);
		else if (nc == columnReqRslt_old_due_dt) doReqRslt_old_due_dt_NC(info);
		else if (nc == columnReqRslt_sno1_mng_typ) doReqRslt_sno1_mng_typ_NC(info);
		else if (nc == columnReqRslt_sno2_mng_typ) doReqRslt_sno2_mng_typ_NC(info);
		else if (nc == columnReqRslt_sno3_mng_typ) doReqRslt_sno3_mng_typ_NC(info);
		else if (nc == columnReqRslt_sno4_mng_typ) doReqRslt_sno4_mng_typ_NC(info);
		else if (nc == columnReqRslt_sno1_num_typ) doReqRslt_sno1_num_typ_NC(info);
		else if (nc == columnReqRslt_sno2_num_typ) doReqRslt_sno2_num_typ_NC(info);
		else if (nc == columnReqRslt_sno3_num_typ) doReqRslt_sno3_num_typ_NC(info);
		else if (nc == columnReqRslt_sno4_num_typ) doReqRslt_sno4_num_typ_NC(info);
		else if (nc == columnReqRslt_rqmt_sno1_flg) doReqRslt_rqmt_sno1_flg_NC(info);
		else if (nc == columnReqRslt_rqmt_sno2_flg) doReqRslt_rqmt_sno2_flg_NC(info);
		else if (nc == columnReqRslt_rqmt_sno3_flg) doReqRslt_rqmt_sno3_flg_NC(info);
		else if (nc == columnReqRslt_rqmt_sno4_flg) doReqRslt_rqmt_sno4_flg_NC(info);
		else if (nc == columnReqRslt_fix_flg) doReqRslt_fix_flg_NC(info);
		else if (nc == columnReqRslt_mfg_loc_cd) doReqRslt_mfg_loc_cd_NC(info);
		else if (nc == columnReqRslt_mfg_loc_nm) doReqRslt_mfg_loc_nm_NC(info);
		else if (nc == columnReqRslt_sppl_cd) doReqRslt_sppl_cd_NC(info);
		else if (nc == columnReqRslt_sppl_nm) doReqRslt_sppl_nm_NC(info);
		else if (nc == columnReqRslt_rqst_loc_cd) doReqRslt_rqst_loc_cd_NC(info);
		else if (nc == columnReqRslt_rqst_loc_nm) doReqRslt_rqst_loc_nm_NC(info);
		else if (nc == columnReqRslt_rqst_wg_cd) doReqRslt_rqst_wg_cd_NC(info);
		else if (nc == columnReqRslt_rqst_wg_nm) doReqRslt_rqst_wg_nm_NC(info);
		else if (nc == columnReqRslt_rqmt_gnrt_typ) doReqRslt_rqmt_gnrt_typ_NC(info);
		else if (nc == columnReqRslt_rqmt_gnrt_typ_nm) doReqRslt_rqmt_gnrt_typ_nm_NC(info);
		else if (nc == columnReqRslt_rqmt_typ) doReqRslt_rqmt_typ_NC(info);
		else if (nc == columnReqRslt_rqmt_typ_nm) doReqRslt_rqmt_typ_nm_NC(info);
		else if (nc == columnReqRslt_intr_rmrks) doReqRslt_intr_rmrks_NC(info);
		else if (nc == columnReqRslt_sub_char1) doReqRslt_sub_char1_NC(info);
		else if (nc == columnReqRslt_sub_char2) doReqRslt_sub_char2_NC(info);
		else if (nc == columnReqRslt_sub_char3) doReqRslt_sub_char3_NC(info);
		else if (nc == columnReqRslt_strg_loc_cd) doReqRslt_strg_loc_cd_NC(info);
		else if (nc == columnReqRslt_strg_loc_nm) doReqRslt_strg_loc_nm_NC(info);
		else if (nc == columnReqRslt_site_cd) doReqRslt_site_cd_NC(info);
		else if (nc == columnReqRslt_site_nm) doReqRslt_site_nm_NC(info);
		else if (nc == columnReqRslt_wg_cd) doReqRslt_wg_cd_NC(info);
		else if (nc == columnReqRslt_wg_nm) doReqRslt_wg_nm_NC(info);
		else if (nc == columnReqRslt_strg_loc_grp_cd) doReqRslt_strg_loc_grp_cd_NC(info);
		else if (nc == columnReqRslt_strg_loc_grp_nm) doReqRslt_strg_loc_grp_nm_NC(info);
		else if (nc == columnReqRslt_itm_typ) doReqRslt_itm_typ_NC(info);
		else if (nc == columnReqRslt_itm_typ_nm) doReqRslt_itm_typ_nm_NC(info);
		else if (nc == columnReqRslt_itm_typ_d_cd) doReqRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnReqRslt_itm_typ_d_nm) doReqRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnReqRslt_mps_grp_cd) doReqRslt_mps_grp_cd_NC(info);
		else if (nc == columnReqRslt_mps_grp_nm) doReqRslt_mps_grp_nm_NC(info);
		else if (nc == columnReqRslt_ins_usr_id) doReqRslt_ins_usr_id_NC(info);
		else if (nc == columnReqRslt_ins_usr_nm) doReqRslt_ins_usr_nm_NC(info);
		else if (nc == columnReqRslt_ins_func_id) doReqRslt_ins_func_id_NC(info);
		else if (nc == columnReqRslt_ins_func_nm) doReqRslt_ins_func_nm_NC(info);
		else if (nc == columnReqRslt_ins_ts) doReqRslt_ins_ts_NC(info);
		else if (nc == columnReqRslt_upd_cntr) doReqRslt_upd_cntr_NC(info);
		else if (nc == columnReqRslt_upd_usr_id) doReqRslt_upd_usr_id_NC(info);
		else if (nc == columnReqRslt_upd_usr_nm) doReqRslt_upd_usr_nm_NC(info);
		else if (nc == columnReqRslt_upd_func_id) doReqRslt_upd_func_id_NC(info);
		else if (nc == columnReqRslt_upd_func_nm) doReqRslt_upd_func_nm_NC(info);
		else if (nc == columnReqRslt_upd_ts) doReqRslt_upd_ts_NC(info);
		else if (nc == columnReqRslt_upd_srv_req_no) doReqRslt_upd_srv_req_no_NC(info);
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
	 * [ReqRslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[mps_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mps_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mps_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mps_grp_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[disp_key_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_key_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_ship_schd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_ship_schd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_prcd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_prcd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_mps_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_mps_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[peg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_peg_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_00]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_00_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mps_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mps_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mps_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mps_grp_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[proc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[row_title_col]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_row_title_col_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[row_title_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_row_title_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[record_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_record_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[record_grp_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_record_grp_id_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[hdr_peg_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_hdr_peg_no_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno_sprt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno_sprt_flg_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_no_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[due_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_due_dt_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[old_due_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_old_due_dt_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno1_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno1_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno2_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno2_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno3_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno3_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno4_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno4_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_sno1_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_sno1_flg_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_sno2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_sno2_flg_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_sno3_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_sno3_flg_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_sno4_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_sno4_flg_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqst_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqst_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqst_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqst_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqst_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqst_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqst_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqst_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_gnrt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_gnrt_typ_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_gnrt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_gnrt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_typ_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[strg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_strg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[strg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_strg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[strg_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_strg_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[strg_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_strg_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[mps_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_mps_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[mps_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_mps_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_srv_req_no_NC(MCEventInfo info){
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
		else if (ne == ReqRsltTable) doReqRslt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_due_dt_fr) doCnd_due_dt_fr_NE(info);
		else if (ne == Cnd_due_dt_to) doCnd_due_dt_to_NE(info);
		else if (ne == Cnd_mps_grp_cd) doCnd_mps_grp_cd_NE(info);
		else if (ne == Cnd_mps_grp_nm) doCnd_mps_grp_nm_NE(info);
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_strg_loc_grp_cd) doCnd_strg_loc_grp_cd_NE(info);
		else if (ne == Cnd_strg_loc_grp_nm) doCnd_strg_loc_grp_nm_NE(info);
		else if (ne == Cnd_strg_loc_cd) doCnd_strg_loc_cd_NE(info);
		else if (ne == Cnd_strg_loc_nm) doCnd_strg_loc_nm_NE(info);
		else if (ne == Cnd_disp_key_flg) doCnd_disp_key_flg_NE(info);
		else if (ne == Cnd_disp_ship_schd_flg) doCnd_disp_ship_schd_flg_NE(info);
		else if (ne == Cnd_disp_prcd_flg) doCnd_disp_prcd_flg_NE(info);
		else if (ne == Cnd_disp_mps_flg) doCnd_disp_mps_flg_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_peg_no) doRslt_peg_no_NE(info);
		else if (ne == columnRslt_disp_00) doRslt_disp_00_NE(info);
		else if (ne == columnRslt_mps_grp_cd) doRslt_mps_grp_cd_NE(info);
		else if (ne == columnRslt_mps_grp_nm) doRslt_mps_grp_nm_NE(info);
		else if (ne == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NE(info);
		else if (ne == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NE(info);
		else if (ne == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NE(info);
		else if (ne == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_NE(info);
		else if (ne == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_NE(info);
		else if (ne == columnRslt_proc_cd) doRslt_proc_cd_NE(info);
		else if (ne == columnRslt_proc_nm) doRslt_proc_nm_NE(info);
		else if (ne == columnRslt_unit_cd) doRslt_unit_cd_NE(info);
		else if (ne == columnRslt_unit_nm) doRslt_unit_nm_NE(info);
		else if (ne == columnRslt_dec_place) doRslt_dec_place_NE(info);
		else if (ne == columnRslt_site_cd) doRslt_site_cd_NE(info);
		else if (ne == columnRslt_site_nm) doRslt_site_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
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
		else if (ne == columnRslt_row_title_col) doRslt_row_title_col_NE(info);
		else if (ne == columnRslt_row_title_nm) doRslt_row_title_nm_NE(info);
		else if (ne == columnRslt_record_id) doRslt_record_id_NE(info);
		else if (ne == columnRslt_record_grp_id) doRslt_record_grp_id_NE(info);
		else if (ne == columnReqRslt_check) doReqRslt_check_NE(info);
		else if (ne == columnReqRslt_hdr_peg_no) doReqRslt_hdr_peg_no_NE(info);
		else if (ne == columnReqRslt_sno_sprt_flg) doReqRslt_sno_sprt_flg_NE(info);
		else if (ne == columnReqRslt_rqmt_no) doReqRslt_rqmt_no_NE(info);
		else if (ne == columnReqRslt_unit_cd) doReqRslt_unit_cd_NE(info);
		else if (ne == columnReqRslt_unit_nm) doReqRslt_unit_nm_NE(info);
		else if (ne == columnReqRslt_dec_place) doReqRslt_dec_place_NE(info);
		else if (ne == columnReqRslt_due_dt) doReqRslt_due_dt_NE(info);
		else if (ne == columnReqRslt_old_due_dt) doReqRslt_old_due_dt_NE(info);
		else if (ne == columnReqRslt_sno1_mng_typ) doReqRslt_sno1_mng_typ_NE(info);
		else if (ne == columnReqRslt_sno2_mng_typ) doReqRslt_sno2_mng_typ_NE(info);
		else if (ne == columnReqRslt_sno3_mng_typ) doReqRslt_sno3_mng_typ_NE(info);
		else if (ne == columnReqRslt_sno4_mng_typ) doReqRslt_sno4_mng_typ_NE(info);
		else if (ne == columnReqRslt_sno1_num_typ) doReqRslt_sno1_num_typ_NE(info);
		else if (ne == columnReqRslt_sno2_num_typ) doReqRslt_sno2_num_typ_NE(info);
		else if (ne == columnReqRslt_sno3_num_typ) doReqRslt_sno3_num_typ_NE(info);
		else if (ne == columnReqRslt_sno4_num_typ) doReqRslt_sno4_num_typ_NE(info);
		else if (ne == columnReqRslt_rqmt_sno1_flg) doReqRslt_rqmt_sno1_flg_NE(info);
		else if (ne == columnReqRslt_rqmt_sno2_flg) doReqRslt_rqmt_sno2_flg_NE(info);
		else if (ne == columnReqRslt_rqmt_sno3_flg) doReqRslt_rqmt_sno3_flg_NE(info);
		else if (ne == columnReqRslt_rqmt_sno4_flg) doReqRslt_rqmt_sno4_flg_NE(info);
		else if (ne == columnReqRslt_fix_flg) doReqRslt_fix_flg_NE(info);
		else if (ne == columnReqRslt_mfg_loc_cd) doReqRslt_mfg_loc_cd_NE(info);
		else if (ne == columnReqRslt_mfg_loc_nm) doReqRslt_mfg_loc_nm_NE(info);
		else if (ne == columnReqRslt_sppl_cd) doReqRslt_sppl_cd_NE(info);
		else if (ne == columnReqRslt_sppl_nm) doReqRslt_sppl_nm_NE(info);
		else if (ne == columnReqRslt_rqst_loc_cd) doReqRslt_rqst_loc_cd_NE(info);
		else if (ne == columnReqRslt_rqst_loc_nm) doReqRslt_rqst_loc_nm_NE(info);
		else if (ne == columnReqRslt_rqst_wg_cd) doReqRslt_rqst_wg_cd_NE(info);
		else if (ne == columnReqRslt_rqst_wg_nm) doReqRslt_rqst_wg_nm_NE(info);
		else if (ne == columnReqRslt_rqmt_gnrt_typ) doReqRslt_rqmt_gnrt_typ_NE(info);
		else if (ne == columnReqRslt_rqmt_gnrt_typ_nm) doReqRslt_rqmt_gnrt_typ_nm_NE(info);
		else if (ne == columnReqRslt_rqmt_typ) doReqRslt_rqmt_typ_NE(info);
		else if (ne == columnReqRslt_rqmt_typ_nm) doReqRslt_rqmt_typ_nm_NE(info);
		else if (ne == columnReqRslt_intr_rmrks) doReqRslt_intr_rmrks_NE(info);
		else if (ne == columnReqRslt_sub_char1) doReqRslt_sub_char1_NE(info);
		else if (ne == columnReqRslt_sub_char2) doReqRslt_sub_char2_NE(info);
		else if (ne == columnReqRslt_sub_char3) doReqRslt_sub_char3_NE(info);
		else if (ne == columnReqRslt_strg_loc_cd) doReqRslt_strg_loc_cd_NE(info);
		else if (ne == columnReqRslt_strg_loc_nm) doReqRslt_strg_loc_nm_NE(info);
		else if (ne == columnReqRslt_site_cd) doReqRslt_site_cd_NE(info);
		else if (ne == columnReqRslt_site_nm) doReqRslt_site_nm_NE(info);
		else if (ne == columnReqRslt_wg_cd) doReqRslt_wg_cd_NE(info);
		else if (ne == columnReqRslt_wg_nm) doReqRslt_wg_nm_NE(info);
		else if (ne == columnReqRslt_strg_loc_grp_cd) doReqRslt_strg_loc_grp_cd_NE(info);
		else if (ne == columnReqRslt_strg_loc_grp_nm) doReqRslt_strg_loc_grp_nm_NE(info);
		else if (ne == columnReqRslt_itm_typ) doReqRslt_itm_typ_NE(info);
		else if (ne == columnReqRslt_itm_typ_nm) doReqRslt_itm_typ_nm_NE(info);
		else if (ne == columnReqRslt_itm_typ_d_cd) doReqRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnReqRslt_itm_typ_d_nm) doReqRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnReqRslt_mps_grp_cd) doReqRslt_mps_grp_cd_NE(info);
		else if (ne == columnReqRslt_mps_grp_nm) doReqRslt_mps_grp_nm_NE(info);
		else if (ne == columnReqRslt_ins_usr_id) doReqRslt_ins_usr_id_NE(info);
		else if (ne == columnReqRslt_ins_usr_nm) doReqRslt_ins_usr_nm_NE(info);
		else if (ne == columnReqRslt_ins_func_id) doReqRslt_ins_func_id_NE(info);
		else if (ne == columnReqRslt_ins_func_nm) doReqRslt_ins_func_nm_NE(info);
		else if (ne == columnReqRslt_ins_ts) doReqRslt_ins_ts_NE(info);
		else if (ne == columnReqRslt_upd_cntr) doReqRslt_upd_cntr_NE(info);
		else if (ne == columnReqRslt_upd_usr_id) doReqRslt_upd_usr_id_NE(info);
		else if (ne == columnReqRslt_upd_usr_nm) doReqRslt_upd_usr_nm_NE(info);
		else if (ne == columnReqRslt_upd_func_id) doReqRslt_upd_func_id_NE(info);
		else if (ne == columnReqRslt_upd_func_nm) doReqRslt_upd_func_nm_NE(info);
		else if (ne == columnReqRslt_upd_ts) doReqRslt_upd_ts_NE(info);
		else if (ne == columnReqRslt_upd_srv_req_no) doReqRslt_upd_srv_req_no_NE(info);
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
	 * [ReqRslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[mps_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mps_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mps_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mps_grp_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[disp_key_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_key_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_ship_schd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_ship_schd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_prcd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_prcd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_mps_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_mps_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[peg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_peg_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_00]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_00_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mps_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mps_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mps_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mps_grp_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[proc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[row_title_col]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_row_title_col_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[row_title_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_row_title_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[record_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_record_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[record_grp_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_record_grp_id_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[hdr_peg_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_hdr_peg_no_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno_sprt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno_sprt_flg_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_no_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[due_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_due_dt_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[old_due_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_old_due_dt_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno1_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno1_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno2_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno2_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno3_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno3_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno4_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno4_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_sno1_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_sno1_flg_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_sno2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_sno2_flg_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_sno3_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_sno3_flg_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_sno4_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_sno4_flg_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqst_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqst_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqst_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqst_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqst_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqst_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqst_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqst_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_gnrt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_gnrt_typ_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_gnrt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_gnrt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_typ_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[strg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_strg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[strg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_strg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[strg_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_strg_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[strg_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_strg_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[mps_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_mps_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[mps_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_mps_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_srv_req_no_NE(MCEventInfo info){
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
		else if (nx == ReqRsltTable) doReqRslt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_due_dt_fr) doCnd_due_dt_fr_NX(info);
		else if (nx == Cnd_due_dt_to) doCnd_due_dt_to_NX(info);
		else if (nx == Cnd_mps_grp_cd) doCnd_mps_grp_cd_NX(info);
		else if (nx == Cnd_mps_grp_nm) doCnd_mps_grp_nm_NX(info);
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_strg_loc_grp_cd) doCnd_strg_loc_grp_cd_NX(info);
		else if (nx == Cnd_strg_loc_grp_nm) doCnd_strg_loc_grp_nm_NX(info);
		else if (nx == Cnd_strg_loc_cd) doCnd_strg_loc_cd_NX(info);
		else if (nx == Cnd_strg_loc_nm) doCnd_strg_loc_nm_NX(info);
		else if (nx == Cnd_disp_key_flg) doCnd_disp_key_flg_NX(info);
		else if (nx == Cnd_disp_ship_schd_flg) doCnd_disp_ship_schd_flg_NX(info);
		else if (nx == Cnd_disp_prcd_flg) doCnd_disp_prcd_flg_NX(info);
		else if (nx == Cnd_disp_mps_flg) doCnd_disp_mps_flg_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_peg_no) doRslt_peg_no_NX(info);
		else if (nx == columnRslt_disp_00) doRslt_disp_00_NX(info);
		else if (nx == columnRslt_mps_grp_cd) doRslt_mps_grp_cd_NX(info);
		else if (nx == columnRslt_mps_grp_nm) doRslt_mps_grp_nm_NX(info);
		else if (nx == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NX(info);
		else if (nx == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NX(info);
		else if (nx == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NX(info);
		else if (nx == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_NX(info);
		else if (nx == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_NX(info);
		else if (nx == columnRslt_proc_cd) doRslt_proc_cd_NX(info);
		else if (nx == columnRslt_proc_nm) doRslt_proc_nm_NX(info);
		else if (nx == columnRslt_unit_cd) doRslt_unit_cd_NX(info);
		else if (nx == columnRslt_unit_nm) doRslt_unit_nm_NX(info);
		else if (nx == columnRslt_dec_place) doRslt_dec_place_NX(info);
		else if (nx == columnRslt_site_cd) doRslt_site_cd_NX(info);
		else if (nx == columnRslt_site_nm) doRslt_site_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
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
		else if (nx == columnRslt_row_title_col) doRslt_row_title_col_NX(info);
		else if (nx == columnRslt_row_title_nm) doRslt_row_title_nm_NX(info);
		else if (nx == columnRslt_record_id) doRslt_record_id_NX(info);
		else if (nx == columnRslt_record_grp_id) doRslt_record_grp_id_NX(info);
		else if (nx == columnReqRslt_check) doReqRslt_check_NX(info);
		else if (nx == columnReqRslt_hdr_peg_no) doReqRslt_hdr_peg_no_NX(info);
		else if (nx == columnReqRslt_sno_sprt_flg) doReqRslt_sno_sprt_flg_NX(info);
		else if (nx == columnReqRslt_rqmt_no) doReqRslt_rqmt_no_NX(info);
		else if (nx == columnReqRslt_unit_cd) doReqRslt_unit_cd_NX(info);
		else if (nx == columnReqRslt_unit_nm) doReqRslt_unit_nm_NX(info);
		else if (nx == columnReqRslt_dec_place) doReqRslt_dec_place_NX(info);
		else if (nx == columnReqRslt_due_dt) doReqRslt_due_dt_NX(info);
		else if (nx == columnReqRslt_old_due_dt) doReqRslt_old_due_dt_NX(info);
		else if (nx == columnReqRslt_sno1_mng_typ) doReqRslt_sno1_mng_typ_NX(info);
		else if (nx == columnReqRslt_sno2_mng_typ) doReqRslt_sno2_mng_typ_NX(info);
		else if (nx == columnReqRslt_sno3_mng_typ) doReqRslt_sno3_mng_typ_NX(info);
		else if (nx == columnReqRslt_sno4_mng_typ) doReqRslt_sno4_mng_typ_NX(info);
		else if (nx == columnReqRslt_sno1_num_typ) doReqRslt_sno1_num_typ_NX(info);
		else if (nx == columnReqRslt_sno2_num_typ) doReqRslt_sno2_num_typ_NX(info);
		else if (nx == columnReqRslt_sno3_num_typ) doReqRslt_sno3_num_typ_NX(info);
		else if (nx == columnReqRslt_sno4_num_typ) doReqRslt_sno4_num_typ_NX(info);
		else if (nx == columnReqRslt_rqmt_sno1_flg) doReqRslt_rqmt_sno1_flg_NX(info);
		else if (nx == columnReqRslt_rqmt_sno2_flg) doReqRslt_rqmt_sno2_flg_NX(info);
		else if (nx == columnReqRslt_rqmt_sno3_flg) doReqRslt_rqmt_sno3_flg_NX(info);
		else if (nx == columnReqRslt_rqmt_sno4_flg) doReqRslt_rqmt_sno4_flg_NX(info);
		else if (nx == columnReqRslt_fix_flg) doReqRslt_fix_flg_NX(info);
		else if (nx == columnReqRslt_mfg_loc_cd) doReqRslt_mfg_loc_cd_NX(info);
		else if (nx == columnReqRslt_mfg_loc_nm) doReqRslt_mfg_loc_nm_NX(info);
		else if (nx == columnReqRslt_sppl_cd) doReqRslt_sppl_cd_NX(info);
		else if (nx == columnReqRslt_sppl_nm) doReqRslt_sppl_nm_NX(info);
		else if (nx == columnReqRslt_rqst_loc_cd) doReqRslt_rqst_loc_cd_NX(info);
		else if (nx == columnReqRslt_rqst_loc_nm) doReqRslt_rqst_loc_nm_NX(info);
		else if (nx == columnReqRslt_rqst_wg_cd) doReqRslt_rqst_wg_cd_NX(info);
		else if (nx == columnReqRslt_rqst_wg_nm) doReqRslt_rqst_wg_nm_NX(info);
		else if (nx == columnReqRslt_rqmt_gnrt_typ) doReqRslt_rqmt_gnrt_typ_NX(info);
		else if (nx == columnReqRslt_rqmt_gnrt_typ_nm) doReqRslt_rqmt_gnrt_typ_nm_NX(info);
		else if (nx == columnReqRslt_rqmt_typ) doReqRslt_rqmt_typ_NX(info);
		else if (nx == columnReqRslt_rqmt_typ_nm) doReqRslt_rqmt_typ_nm_NX(info);
		else if (nx == columnReqRslt_intr_rmrks) doReqRslt_intr_rmrks_NX(info);
		else if (nx == columnReqRslt_sub_char1) doReqRslt_sub_char1_NX(info);
		else if (nx == columnReqRslt_sub_char2) doReqRslt_sub_char2_NX(info);
		else if (nx == columnReqRslt_sub_char3) doReqRslt_sub_char3_NX(info);
		else if (nx == columnReqRslt_strg_loc_cd) doReqRslt_strg_loc_cd_NX(info);
		else if (nx == columnReqRslt_strg_loc_nm) doReqRslt_strg_loc_nm_NX(info);
		else if (nx == columnReqRslt_site_cd) doReqRslt_site_cd_NX(info);
		else if (nx == columnReqRslt_site_nm) doReqRslt_site_nm_NX(info);
		else if (nx == columnReqRslt_wg_cd) doReqRslt_wg_cd_NX(info);
		else if (nx == columnReqRslt_wg_nm) doReqRslt_wg_nm_NX(info);
		else if (nx == columnReqRslt_strg_loc_grp_cd) doReqRslt_strg_loc_grp_cd_NX(info);
		else if (nx == columnReqRslt_strg_loc_grp_nm) doReqRslt_strg_loc_grp_nm_NX(info);
		else if (nx == columnReqRslt_itm_typ) doReqRslt_itm_typ_NX(info);
		else if (nx == columnReqRslt_itm_typ_nm) doReqRslt_itm_typ_nm_NX(info);
		else if (nx == columnReqRslt_itm_typ_d_cd) doReqRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnReqRslt_itm_typ_d_nm) doReqRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnReqRslt_mps_grp_cd) doReqRslt_mps_grp_cd_NX(info);
		else if (nx == columnReqRslt_mps_grp_nm) doReqRslt_mps_grp_nm_NX(info);
		else if (nx == columnReqRslt_ins_usr_id) doReqRslt_ins_usr_id_NX(info);
		else if (nx == columnReqRslt_ins_usr_nm) doReqRslt_ins_usr_nm_NX(info);
		else if (nx == columnReqRslt_ins_func_id) doReqRslt_ins_func_id_NX(info);
		else if (nx == columnReqRslt_ins_func_nm) doReqRslt_ins_func_nm_NX(info);
		else if (nx == columnReqRslt_ins_ts) doReqRslt_ins_ts_NX(info);
		else if (nx == columnReqRslt_upd_cntr) doReqRslt_upd_cntr_NX(info);
		else if (nx == columnReqRslt_upd_usr_id) doReqRslt_upd_usr_id_NX(info);
		else if (nx == columnReqRslt_upd_usr_nm) doReqRslt_upd_usr_nm_NX(info);
		else if (nx == columnReqRslt_upd_func_id) doReqRslt_upd_func_id_NX(info);
		else if (nx == columnReqRslt_upd_func_nm) doReqRslt_upd_func_nm_NX(info);
		else if (nx == columnReqRslt_upd_ts) doReqRslt_upd_ts_NX(info);
		else if (nx == columnReqRslt_upd_srv_req_no) doReqRslt_upd_srv_req_no_NX(info);
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
	 * [ReqRslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[mps_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mps_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mps_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mps_grp_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[disp_key_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_key_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_ship_schd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_ship_schd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_prcd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_prcd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_mps_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_mps_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[peg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_peg_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_00]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_00_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mps_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mps_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mps_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mps_grp_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[proc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[row_title_col]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_row_title_col_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[row_title_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_row_title_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[record_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_record_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[record_grp_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_record_grp_id_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[hdr_peg_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_hdr_peg_no_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno_sprt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno_sprt_flg_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_no_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[due_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_due_dt_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[old_due_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_old_due_dt_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno1_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno1_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno2_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno2_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno3_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno3_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno4_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno4_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_sno1_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_sno1_flg_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_sno2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_sno2_flg_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_sno3_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_sno3_flg_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_sno4_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_sno4_flg_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqst_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqst_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqst_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqst_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqst_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqst_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqst_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqst_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_gnrt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_gnrt_typ_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_gnrt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_gnrt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_typ_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[strg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_strg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[strg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_strg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[strg_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_strg_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[strg_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_strg_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[mps_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_mps_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[mps_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_mps_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_srv_req_no_NX(MCEventInfo info){
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
		else if (lc == Cnd_mps_grp_cd) doCnd_mps_grp_cd_LC(info);
		else if (lc == Cnd_mps_grp_nm) doCnd_mps_grp_nm_LC(info);
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_strg_loc_grp_cd) doCnd_strg_loc_grp_cd_LC(info);
		else if (lc == Cnd_strg_loc_grp_nm) doCnd_strg_loc_grp_nm_LC(info);
		else if (lc == Cnd_strg_loc_cd) doCnd_strg_loc_cd_LC(info);
		else if (lc == Cnd_strg_loc_nm) doCnd_strg_loc_nm_LC(info);
		else if (lc == columnRslt_peg_no) doRslt_peg_no_LC(info);
		else if (lc == columnRslt_disp_00) doRslt_disp_00_LC(info);
		else if (lc == columnRslt_mps_grp_cd) doRslt_mps_grp_cd_LC(info);
		else if (lc == columnRslt_mps_grp_nm) doRslt_mps_grp_nm_LC(info);
		else if (lc == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_LC(info);
		else if (lc == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_LC(info);
		else if (lc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_LC(info);
		else if (lc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_LC(info);
		else if (lc == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_LC(info);
		else if (lc == columnRslt_proc_cd) doRslt_proc_cd_LC(info);
		else if (lc == columnRslt_proc_nm) doRslt_proc_nm_LC(info);
		else if (lc == columnRslt_unit_cd) doRslt_unit_cd_LC(info);
		else if (lc == columnRslt_unit_nm) doRslt_unit_nm_LC(info);
		else if (lc == columnRslt_dec_place) doRslt_dec_place_LC(info);
		else if (lc == columnRslt_site_cd) doRslt_site_cd_LC(info);
		else if (lc == columnRslt_site_nm) doRslt_site_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_sno1_mng_typ) doRslt_sno1_mng_typ_LC(info);
		else if (lc == columnRslt_sno2_mng_typ) doRslt_sno2_mng_typ_LC(info);
		else if (lc == columnRslt_sno3_mng_typ) doRslt_sno3_mng_typ_LC(info);
		else if (lc == columnRslt_sno4_mng_typ) doRslt_sno4_mng_typ_LC(info);
		else if (lc == columnRslt_sno1_num_typ) doRslt_sno1_num_typ_LC(info);
		else if (lc == columnRslt_sno2_num_typ) doRslt_sno2_num_typ_LC(info);
		else if (lc == columnRslt_sno3_num_typ) doRslt_sno3_num_typ_LC(info);
		else if (lc == columnRslt_sno4_num_typ) doRslt_sno4_num_typ_LC(info);
		else if (lc == columnRslt_row_title_col) doRslt_row_title_col_LC(info);
		else if (lc == columnRslt_row_title_nm) doRslt_row_title_nm_LC(info);
		else if (lc == columnRslt_record_id) doRslt_record_id_LC(info);
		else if (lc == columnRslt_record_grp_id) doRslt_record_grp_id_LC(info);
		else if (lc == columnReqRslt_hdr_peg_no) doReqRslt_hdr_peg_no_LC(info);
		else if (lc == columnReqRslt_rqmt_no) doReqRslt_rqmt_no_LC(info);
		else if (lc == columnReqRslt_unit_cd) doReqRslt_unit_cd_LC(info);
		else if (lc == columnReqRslt_unit_nm) doReqRslt_unit_nm_LC(info);
		else if (lc == columnReqRslt_dec_place) doReqRslt_dec_place_LC(info);
		else if (lc == columnReqRslt_due_dt) doReqRslt_due_dt_LC(info);
		else if (lc == columnReqRslt_old_due_dt) doReqRslt_old_due_dt_LC(info);
		else if (lc == columnReqRslt_sno1_mng_typ) doReqRslt_sno1_mng_typ_LC(info);
		else if (lc == columnReqRslt_sno2_mng_typ) doReqRslt_sno2_mng_typ_LC(info);
		else if (lc == columnReqRslt_sno3_mng_typ) doReqRslt_sno3_mng_typ_LC(info);
		else if (lc == columnReqRslt_sno4_mng_typ) doReqRslt_sno4_mng_typ_LC(info);
		else if (lc == columnReqRslt_sno1_num_typ) doReqRslt_sno1_num_typ_LC(info);
		else if (lc == columnReqRslt_sno2_num_typ) doReqRslt_sno2_num_typ_LC(info);
		else if (lc == columnReqRslt_sno3_num_typ) doReqRslt_sno3_num_typ_LC(info);
		else if (lc == columnReqRslt_sno4_num_typ) doReqRslt_sno4_num_typ_LC(info);
		else if (lc == columnReqRslt_mfg_loc_cd) doReqRslt_mfg_loc_cd_LC(info);
		else if (lc == columnReqRslt_mfg_loc_nm) doReqRslt_mfg_loc_nm_LC(info);
		else if (lc == columnReqRslt_sppl_cd) doReqRslt_sppl_cd_LC(info);
		else if (lc == columnReqRslt_sppl_nm) doReqRslt_sppl_nm_LC(info);
		else if (lc == columnReqRslt_rqst_loc_cd) doReqRslt_rqst_loc_cd_LC(info);
		else if (lc == columnReqRslt_rqst_loc_nm) doReqRslt_rqst_loc_nm_LC(info);
		else if (lc == columnReqRslt_rqst_wg_cd) doReqRslt_rqst_wg_cd_LC(info);
		else if (lc == columnReqRslt_rqst_wg_nm) doReqRslt_rqst_wg_nm_LC(info);
		else if (lc == columnReqRslt_rqmt_gnrt_typ) doReqRslt_rqmt_gnrt_typ_LC(info);
		else if (lc == columnReqRslt_rqmt_gnrt_typ_nm) doReqRslt_rqmt_gnrt_typ_nm_LC(info);
		else if (lc == columnReqRslt_rqmt_typ) doReqRslt_rqmt_typ_LC(info);
		else if (lc == columnReqRslt_rqmt_typ_nm) doReqRslt_rqmt_typ_nm_LC(info);
		else if (lc == columnReqRslt_intr_rmrks) doReqRslt_intr_rmrks_LC(info);
		else if (lc == columnReqRslt_sub_char1) doReqRslt_sub_char1_LC(info);
		else if (lc == columnReqRslt_sub_char2) doReqRslt_sub_char2_LC(info);
		else if (lc == columnReqRslt_sub_char3) doReqRslt_sub_char3_LC(info);
		else if (lc == columnReqRslt_strg_loc_cd) doReqRslt_strg_loc_cd_LC(info);
		else if (lc == columnReqRslt_strg_loc_nm) doReqRslt_strg_loc_nm_LC(info);
		else if (lc == columnReqRslt_site_cd) doReqRslt_site_cd_LC(info);
		else if (lc == columnReqRslt_site_nm) doReqRslt_site_nm_LC(info);
		else if (lc == columnReqRslt_wg_cd) doReqRslt_wg_cd_LC(info);
		else if (lc == columnReqRslt_wg_nm) doReqRslt_wg_nm_LC(info);
		else if (lc == columnReqRslt_strg_loc_grp_cd) doReqRslt_strg_loc_grp_cd_LC(info);
		else if (lc == columnReqRslt_strg_loc_grp_nm) doReqRslt_strg_loc_grp_nm_LC(info);
		else if (lc == columnReqRslt_itm_typ) doReqRslt_itm_typ_LC(info);
		else if (lc == columnReqRslt_itm_typ_nm) doReqRslt_itm_typ_nm_LC(info);
		else if (lc == columnReqRslt_itm_typ_d_cd) doReqRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnReqRslt_itm_typ_d_nm) doReqRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnReqRslt_mps_grp_cd) doReqRslt_mps_grp_cd_LC(info);
		else if (lc == columnReqRslt_mps_grp_nm) doReqRslt_mps_grp_nm_LC(info);
		else if (lc == columnReqRslt_ins_usr_id) doReqRslt_ins_usr_id_LC(info);
		else if (lc == columnReqRslt_ins_usr_nm) doReqRslt_ins_usr_nm_LC(info);
		else if (lc == columnReqRslt_ins_func_id) doReqRslt_ins_func_id_LC(info);
		else if (lc == columnReqRslt_ins_func_nm) doReqRslt_ins_func_nm_LC(info);
		else if (lc == columnReqRslt_ins_ts) doReqRslt_ins_ts_LC(info);
		else if (lc == columnReqRslt_upd_cntr) doReqRslt_upd_cntr_LC(info);
		else if (lc == columnReqRslt_upd_usr_id) doReqRslt_upd_usr_id_LC(info);
		else if (lc == columnReqRslt_upd_usr_nm) doReqRslt_upd_usr_nm_LC(info);
		else if (lc == columnReqRslt_upd_func_id) doReqRslt_upd_func_id_LC(info);
		else if (lc == columnReqRslt_upd_func_nm) doReqRslt_upd_func_nm_LC(info);
		else if (lc == columnReqRslt_upd_ts) doReqRslt_upd_ts_LC(info);
		else if (lc == columnReqRslt_upd_srv_req_no) doReqRslt_upd_srv_req_no_LC(info);
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
	 * [Cnd]パネルの[mps_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mps_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mps_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mps_grp_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[peg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_peg_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[disp_00]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_disp_00_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mps_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mps_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mps_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mps_grp_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[proc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[proc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_proc_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[row_title_col]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_row_title_col_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[row_title_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_row_title_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[record_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_record_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[record_grp_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_record_grp_id_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[hdr_peg_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_hdr_peg_no_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_no_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[due_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_due_dt_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[old_due_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_old_due_dt_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno1_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno1_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno2_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno2_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno3_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno3_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sno4_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sno4_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqst_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqst_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqst_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqst_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqst_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqst_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqst_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqst_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_gnrt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_gnrt_typ_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_gnrt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_gnrt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_typ_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[rqmt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_rqmt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[strg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_strg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[strg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_strg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[strg_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_strg_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[strg_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_strg_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[mps_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_mps_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[mps_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_mps_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [ReqRslt]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doReqRslt_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_mps_grp_cd]の作成メソッド
	 */
	public MCList getCnd_mps_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getMpsGrp(row, info);
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
	 * コンボ／リストのリスト[ReqRslt_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getReqRslt_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[ReqRslt_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getReqRslt_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[ReqRslt_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getReqRslt_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[ReqRslt_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getReqRslt_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnReqRslt_mfg_loc_cd]の作成メソッド
	 */
	public MCList getReqRslt_mfg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlMfgLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnReqRslt_sppl_cd]の作成メソッド
	 */
	public MCList getReqRslt_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlSppl(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnReqRslt_rqst_loc_cd]の作成メソッド
	 */
	public MCList getReqRslt_rqst_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlRqstLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnReqRslt_rqmt_typ]の作成メソッド
	 */
	public MCList getReqRslt_rqmt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRqmtTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnReqRslt_strg_loc_cd]の作成メソッド
	 */
	public MCList getReqRslt_strg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBCL0020.Srch01")) {
			return new MS_MSBCL0020_Srch01Bridge();
		}
		if (id.equals("MS.MSBCL0020.Sprt01")) {
			return new MS_MSBCL0020_Sprt01Bridge();
		}
		if (id.equals("MS.MSBCL0020.Upd01")) {
			return new MS_MSBCL0020_Upd01Bridge();
		}
		if (id.equals("MS.MSBCL0020.Del01")) {
			return new MS_MSBCL0020_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBCL0020_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0020_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0020_Srch01;

		/** コンストラクタ */
		protected MS_MSBCL0020_Srch01Bridge() {
			p_MS_MSBCL0020_Srch01 = new MCParam(PDef.MS_MSBCL0020_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0020_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0020.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0020.PlnR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0020.ReqRsltR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0020.RsltR.class));

			p_MS_MSBCL0020_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0020_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0020_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0020_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0020_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0020.CndR up0() {
			return (mcframe.clientMSBC.MSBCP0020.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0020.PlnR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0020.PlnR>)down(0);
		}
		protected MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR> down1() {
			return (MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR>)down(1);
		}
		protected MCList<mcframe.clientMSBC.MSBCP0020.RsltR> down2() {
			return (MCList<mcframe.clientMSBC.MSBCP0020.RsltR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0020_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0020.PlnR.class));
			p_MS_MSBCL0020_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0020.ReqRsltR.class));
			p_MS_MSBCL0020_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0020.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0020_Srch01;
		}

		protected void show() {
			setPlnL((MCList<mcframe.clientMSBC.MSBCP0020.PlnR>)p_MS_MSBCL0020_Srch01.getContainerParam().getDownBlock(0));
			setReqRsltL((MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR>)p_MS_MSBCL0020_Srch01.getContainerParam().getDownBlock(1));
			setMpsMaxRsltL((MCList<mcframe.clientMSBC.MSBCP0020.RsltR>)p_MS_MSBCL0020_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getPlnL().clear();
			getReqRsltL().clear();
			getMpsMaxRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getPlnL());
			result.add(getReqRsltL());
			result.add(getMpsMaxRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBCL0020_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0020_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0020_Sprt01;

		/** コンストラクタ */
		protected MS_MSBCL0020_Sprt01Bridge() {
			p_MS_MSBCL0020_Sprt01 = new MCParam(PDef.MS_MSBCL0020_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0020_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0020.ReqRsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0020.ReqRsltR.class));

			p_MS_MSBCL0020_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0020_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0020_Sprt01.addUpBlock(getReqRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0020_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0020_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0020_Sprt01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0020.ReqRsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0020_Sprt01;
		}

		protected void show() {
			setReqRsltL((MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR>)p_MS_MSBCL0020_Sprt01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getReqRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getReqRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getReqRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBCL0020_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0020_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0020_Upd01;

		/** コンストラクタ */
		protected MS_MSBCL0020_Upd01Bridge() {
			p_MS_MSBCL0020_Upd01 = new MCParam(PDef.MS_MSBCL0020_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0020_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0020.RsltR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0020.ReqRsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0020.RsltR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0020.ReqRsltR.class));

			p_MS_MSBCL0020_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0020_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0020_Upd01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBCL0020_Upd01.addUpBlock(getReqRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0020_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0020_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0020.RsltR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0020.RsltR>)up(0);
		}
		protected MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR> up1() {
			return (MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR>)up(1);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0020.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0020.RsltR>)down(0);
		}
		protected MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR> down1() {
			return (MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0020_Upd01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0020.RsltR.class));
			p_MS_MSBCL0020_Upd01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0020.ReqRsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0020_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0020.RsltR>)p_MS_MSBCL0020_Upd01.getContainerParam().getDownBlock(0));
			setReqRsltL((MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR>)p_MS_MSBCL0020_Upd01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getRsltL().clear();
			getReqRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getReqRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getReqRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBCL0020_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0020_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0020_Del01;

		/** コンストラクタ */
		protected MS_MSBCL0020_Del01Bridge() {
			p_MS_MSBCL0020_Del01 = new MCParam(PDef.MS_MSBCL0020_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0020_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0020.RsltR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0020.ReqRsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0020.RsltR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0020.ReqRsltR.class));

			p_MS_MSBCL0020_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0020_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0020_Del01.addUpBlock(getRsltL().shallowClone());
			p_MS_MSBCL0020_Del01.addUpBlock(getReqRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0020_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0020_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0020.RsltR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0020.RsltR>)up(0);
		}
		protected MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR> up1() {
			return (MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR>)up(1);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0020.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0020.RsltR>)down(0);
		}
		protected MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR> down1() {
			return (MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0020_Del01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0020.RsltR.class));
			p_MS_MSBCL0020_Del01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0020.ReqRsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0020_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0020.RsltR>)p_MS_MSBCL0020_Del01.getContainerParam().getDownBlock(0));
			setReqRsltL((MCList<mcframe.clientMSBC.MSBCP0020.ReqRsltR>)p_MS_MSBCL0020_Del01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getRsltL().clear();
			getReqRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getReqRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			result.add(getReqRsltL());
			return result;
		}
	}
}