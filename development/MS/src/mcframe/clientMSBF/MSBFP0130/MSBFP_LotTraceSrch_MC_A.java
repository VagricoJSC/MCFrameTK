package mcframe.clientMSBF.MSBFP0130;

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
import mcframe.clientMSBF.MSBFP0130.MSBFP_LotTraceSrch_MC.MS_MSBFL0130_Srch01Caller;
import mcframe.clientMSBF.MSBFP0130.MSBFP_LotTraceSrch_MC.MS_MSBFL0130_Srch02Caller;

/**
 * 画面"MSBFP_LotTraceSrch"パネルクラスです。<p>
 *
 * 後工程品へ向かってのロットトレースする画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFP_LotTraceSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBF";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBFP0130";

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
	public MCTitledBorder FoldTitledBorder = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [LotTyp]ブロック関連のField定義
	public MCPanel LotTypPanel = null;
	public MCTitledBorder LotTypTitledBorder = null;
	// [LotTyp]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * Allow same lot No. 同一ロット許可.<p>
	 *
	 */
	public MCCheckBox Cnd_dupl_abl_flg = null;
	/**
	 * Do not manage lot No. ロット管理しない.<p>
	 *
	 */
	public MCCheckBox Cnd_not_mng_flg = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H Cnd_ver_no_p_PPanel;
	public MCTextComboBox Cnd_ver_no;	// [Cnd]の[ver_no_p.ver_no]を[Cnd_ver_no]としてエイリアス定義。
	/**
	 * For version control flg. 版管理対象ＦＬＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_ver_flg = null;
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
	public MCLabel Cnd_bp_lot_no_Label = null;
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_bp_lot_no = null;
	public mcframe.clientMAUB.MAUBP0080.MAUBP_Sno_H Cnd_sno_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	/**
	 * Display only the bottom layer 最下層のみ表示.<p>
	 *
	 */
	public MCCheckBox Cnd_bottom_layer_only_flg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [SrchAll]ブロック関連のField定義
	public MCPanel SrchAllPanel = null;
	// [SrchAll]ブロックの項目のField定義
	/**
	 * Explode all 全展開する.<p>
	 *
	 */
	public MCButton SrchAll_srch_all = null;
	// [RsltPanel]ブロック関連のField定義
	public MCPanel RsltPanelPanel = null;
	// [RsltPanel]ブロックの項目のField定義
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBF.MSBFP0130.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D Rslt_hrrchy_p_PPanel;
	public MCColumnConfig columnRslt_extno;// [Rslt]の[hrrchy_p.extno]を[columnRslt_extno]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_extno;// [Rslt]の[hrrchy_p.par_extno]を[columnRslt_par_extno]としてエイリアス定義。
	public MCColumnConfig columnRslt_loop_flg;// [Rslt]の[hrrchy_p.loop_flg]を[columnRslt_loop_flg]としてエイリアス定義。
	public MCColumnConfig columnRslt_leaf_str;// [Rslt]の[hrrchy_p.leaf_str]を[columnRslt_leaf_str]としてエイリアス定義。
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
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Rslt_ver_no_p_PPanel;
	public MCColumnConfig columnRslt_ver_no;// [Rslt]の[ver_no_p.ver_no]を[columnRslt_ver_no]としてエイリアス定義。
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_lot_no = null;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Rslt_sno_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_aprv_sts_typ = null;
	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_aprv_sts_typ_nm = null;
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
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_rmrks = null;
	/**
	 * Lot spare (String) 1 ロット予備（文字列）１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_char1 = null;
	/**
	 * Lot spare (String) 2 ロット予備（文字列）２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_char2 = null;
	/**
	 * Lot spare (String) 3 ロット予備（文字列）３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_char3 = null;
	/**
	 * Lot spare (String) 4 ロット予備（文字列）４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_char4 = null;
	/**
	 * Lot spare (String) 5 ロット予備（文字列）５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_char5 = null;
	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_num1 = null;
	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_num2 = null;
	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_num3 = null;
	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_num4 = null;
	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_num5 = null;
	/**
	 * Lot spare (Date) 1 ロット予備（日付）１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_dt1 = null;
	/**
	 * Lot spare (Date) 2 ロット予備（日付）２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_dt2 = null;
	/**
	 * Lot spare (Date) 3 ロット予備（日付）３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_dt3 = null;
	/**
	 * Lot spare (Date) 4 ロット予備（日付）４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_dt4 = null;
	/**
	 * Lot spare (Date) 5 ロット予備（日付）５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_dt5 = null;
	/**
	 * Lot spare (flg.) 1 ロット予備（ＦＬＧ）１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_flg1 = null;
	/**
	 * Lot spare (flg.) 2 ロット予備（ＦＬＧ）２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_flg2 = null;
	/**
	 * Lot spare (flg.) 3 ロット予備（ＦＬＧ）３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_flg3 = null;
	/**
	 * Lot spare (flg.) 4 ロット予備（ＦＬＧ）４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_flg4 = null;
	/**
	 * Lot spare (flg.) 5 ロット予備（ＦＬＧ）５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_sub_flg5 = null;
	/**
	 * Lot No. management type ロットＮＯ管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_mng_typ = null;
	/**
	 * Lot No. management type name ロットＮＯ管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_mng_typ_nm = null;
	/**
	 * Sublot No. management type サブロットＮＯ管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_mng_typ = null;
	/**
	 * Sublot No. management type name サブロットＮＯ管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_mng_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_par_itm_p_PPanel;
	public MCColumnConfig columnRslt_par_itm_cd;// [Rslt]の[par_itm_p.itm_cd]を[columnRslt_par_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_sub1;// [Rslt]の[par_itm_p.itm_sub1]を[columnRslt_par_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_sub2;// [Rslt]の[par_itm_p.itm_sub2]を[columnRslt_par_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_itm_sub3;// [Rslt]の[par_itm_p.itm_sub3]を[columnRslt_par_itm_sub3]としてエイリアス定義。
	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_lot_no = null;
	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_par_sublot_no = null;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Rslt_par_sno_p_PPanel;
	public MCColumnConfig columnRslt_par_sno1;// [Rslt]の[par_sno_p.sno1]を[columnRslt_par_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_sno2;// [Rslt]の[par_sno_p.sno2]を[columnRslt_par_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_sno3;// [Rslt]の[par_sno_p.sno3]を[columnRslt_par_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_par_sno4;// [Rslt]の[par_sno_p.sno4]を[columnRslt_par_sno4]としてエイリアス定義。
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_mng_typ = null;
	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_mng_typ_nm = null;
	// [BtnLotTrace]ブロック関連のField定義
	public MCPanel BtnLotTracePanel = null;
	// [BtnLotTrace]ブロックの項目のField定義
	/**
	 * Lot trace (Explosion) ロットトレース（原因調査）.<p>
	 *
	 */
	public MCButton BtnLotTrace_open_MSBFP0120 = null;
	/**
	 * Current inventory 現状在庫一覧照会.<p>
	 *
	 */
	public MCButton BtnLotTrace_open_MSBEP0010 = null;
	/**
	 * Lot info. list ロット情報一覧.<p>
	 *
	 */
	public MCButton BtnLotTrace_open_MSBFP0110 = null;
	/**
	 * Inspection result list entry 検査実績一覧登録.<p>
	 *
	 */
	public MCButton BtnLotTrace_open_MSBFP0060 = null;
	// [RsltBtmTab]ブロック関連のField定義
	public MCPanel RsltBtmTabPanel = null;
	public MCTabbedPane RsltBtmTabTab = null;
	// [RsltBtmTab]ブロックの項目のField定義
	// [LotTraceGr]ブロック関連のField定義
	public MCPanel LotTraceGrPanel = null;
	// [LotTraceGr]ブロックの項目のField定義
	// [RsltGr]ブロック関連のField定義
	public MCPanel RsltGrPanel = null;
	public MCScrollPane RsltGrScrollPane = null;
	public MCTable2<mcframe.clientMSBF.MSBFP0130.RsltGrR> RsltGrTable = null;
	// [RsltGr]ブロックの項目のField定義
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_itm_mfg_inst_no = null;
	/**
	 * Inventory transfer result No. 在庫振替実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_stk_xfr_act_no = null;
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_mfg_act_no = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_trd_ptn_typ = null;
	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_trd_ptn_typ_nm = null;
	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_io_act_typ = null;
	/**
	 * GR/GI type name 受払区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_io_act_typ_nm = null;
	/**
	 * Slip No. 伝票ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_slip_no = null;
	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_io_schd_typ = null;
	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_io_schd_typ_nm = null;
	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_io_schd_sts_typ = null;
	/**
	 * GR/GI schedule status type 受払予定状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_io_schd_sts_typ_nm = null;
	/**
	 * GR/GI schedule slip No. 受払予定伝票ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_slip_schd_no = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D RsltGr_itm_p_PPanel;
	public MCColumnConfig columnRsltGr_itm_cd;// [RsltGr]の[itm_p.itm_cd]を[columnRsltGr_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRsltGr_itm_sub1;// [RsltGr]の[itm_p.itm_sub1]を[columnRsltGr_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRsltGr_itm_sub2;// [RsltGr]の[itm_p.itm_sub2]を[columnRsltGr_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRsltGr_itm_sub3;// [RsltGr]の[itm_p.itm_sub3]を[columnRsltGr_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRsltGr_itm_nm;// [RsltGr]の[itm_p.itm_nm]を[columnRsltGr_itm_nm]としてエイリアス定義。
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_sublot_no = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D RsltGr_ver_no_p_PPanel;
	public MCColumnConfig columnRsltGr_ver_no;// [RsltGr]の[ver_no_p.ver_no]を[columnRsltGr_ver_no]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D RsltGr_sno_p_PPanel;
	public MCColumnConfig columnRsltGr_sno1;// [RsltGr]の[sno_p.sno1]を[columnRsltGr_sno1]としてエイリアス定義。
	public MCColumnConfig columnRsltGr_sno2;// [RsltGr]の[sno_p.sno2]を[columnRsltGr_sno2]としてエイリアス定義。
	public MCColumnConfig columnRsltGr_sno3;// [RsltGr]の[sno_p.sno3]を[columnRsltGr_sno3]としてエイリアス定義。
	public MCColumnConfig columnRsltGr_sno4;// [RsltGr]の[sno_p.sno4]を[columnRsltGr_sno4]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGr_qty_p_PPanel;
	public MCColumnConfig columnRsltGr_base_gr_qty;// [RsltGr]の[qty_p.qty]を[columnRsltGr_base_gr_qty]としてエイリアス定義。
	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_base_dec_place = null;
	/**
	 * Scheduled date 予定日.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_schd_dt = null;
	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_act_dt = null;
	/**
	 * Mfg. location 製造場所.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_mfg_loc_nm = null;
	/**
	 * Storage location 格納場所.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_strg_loc_cd = null;
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_strg_loc_nm = null;
	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_sppl_nm = null;
	/**
	 * Schedule/Result type 予定実績区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_schd_act_typ = null;
	/**
	 * Schedule/result type name 予定実績区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_schd_act_typ_nm = null;
	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_lot_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_sub_char3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGr_upd_srv_req_no = null;
	// [BtnGr]ブロック関連のField定義
	public MCPanel BtnGrPanel = null;
	// [BtnGr]ブロックの項目のField定義
	/**
	 * Mfg. order progress 製造指図進捗一覧照会.<p>
	 *
	 */
	public MCButton BtnGr_open_MSBCP1070_gr = null;
	/**
	 * GR/GI result 受払実績一覧照会.<p>
	 *
	 */
	public MCButton BtnGr_open_MSBEP0080_gr = null;
	/**
	 * GR/GI schedule 受払予定一覧照会.<p>
	 *
	 */
	public MCButton BtnGr_open_MSBEP0090_gr = null;
	// [LotTraceGi]ブロック関連のField定義
	public MCPanel LotTraceGiPanel = null;
	// [LotTraceGi]ブロックの項目のField定義
	// [RsltGi]ブロック関連のField定義
	public MCPanel RsltGiPanel = null;
	public MCScrollPane RsltGiScrollPane = null;
	public MCTable2<mcframe.clientMSBF.MSBFP0130.RsltGiR> RsltGiTable = null;
	// [RsltGi]ブロックの項目のField定義
	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_itm_mfg_inst_no = null;
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_mfg_act_no = null;
	/**
	 * Inventory transfer result No. 在庫振替実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_stk_xfr_act_no = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_trd_ptn_typ = null;
	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_trd_ptn_typ_nm = null;
	/**
	 * GR/GI type 受払区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_io_act_typ = null;
	/**
	 * GR/GI type name 受払区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_io_act_typ_nm = null;
	/**
	 * Slip No. 伝票ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_slip_no = null;
	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_io_schd_typ = null;
	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_io_schd_typ_nm = null;
	/**
	 * GR/GI schedule status type 受払予定状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_io_schd_sts_typ = null;
	/**
	 * GR/GI schedule status type 受払予定状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_io_schd_sts_typ_nm = null;
	/**
	 * GR/GI schedule slip No. 受払予定伝票ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_slip_schd_no = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D RsltGi_itm_p_PPanel;
	public MCColumnConfig columnRsltGi_itm_cd;// [RsltGi]の[itm_p.itm_cd]を[columnRsltGi_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_itm_sub1;// [RsltGi]の[itm_p.itm_sub1]を[columnRsltGi_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_itm_sub2;// [RsltGi]の[itm_p.itm_sub2]を[columnRsltGi_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_itm_sub3;// [RsltGi]の[itm_p.itm_sub3]を[columnRsltGi_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_itm_nm;// [RsltGi]の[itm_p.itm_nm]を[columnRsltGi_itm_nm]としてエイリアス定義。
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_sublot_no = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D RsltGi_ver_no_p_PPanel;
	public MCColumnConfig columnRsltGi_ver_no;// [RsltGi]の[ver_no_p.ver_no]を[columnRsltGi_ver_no]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D RsltGi_sno_p_PPanel;
	public MCColumnConfig columnRsltGi_sno1;// [RsltGi]の[sno_p.sno1]を[columnRsltGi_sno1]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_sno2;// [RsltGi]の[sno_p.sno2]を[columnRsltGi_sno2]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_sno3;// [RsltGi]の[sno_p.sno3]を[columnRsltGi_sno3]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_sno4;// [RsltGi]の[sno_p.sno4]を[columnRsltGi_sno4]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltGi_qty_p_PPanel;
	public MCColumnConfig columnRsltGi_base_gi_qty;// [RsltGi]の[qty_p.qty]を[columnRsltGi_base_gi_qty]としてエイリアス定義。
	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_base_dec_place = null;
	/**
	 * Scheduled date 予定日.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_schd_dt = null;
	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_act_dt = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D RsltGi_par_itm_p_PPanel;
	public MCColumnConfig columnRsltGi_par_itm_cd;// [RsltGi]の[par_itm_p.itm_cd]を[columnRsltGi_par_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_par_itm_sub1;// [RsltGi]の[par_itm_p.itm_sub1]を[columnRsltGi_par_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_par_itm_sub2;// [RsltGi]の[par_itm_p.itm_sub2]を[columnRsltGi_par_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_par_itm_sub3;// [RsltGi]の[par_itm_p.itm_sub3]を[columnRsltGi_par_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_par_itm_nm;// [RsltGi]の[par_itm_p.itm_nm]を[columnRsltGi_par_itm_nm]としてエイリアス定義。
	/**
	 * Parent lot No. 親ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_par_lot_no = null;
	/**
	 * Parent sublot No. 親サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_par_sublot_no = null;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D RsltGi_par_sno_p_PPanel;
	public MCColumnConfig columnRsltGi_par_sno1;// [RsltGi]の[par_sno_p.sno1]を[columnRsltGi_par_sno1]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_par_sno2;// [RsltGi]の[par_sno_p.sno2]を[columnRsltGi_par_sno2]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_par_sno3;// [RsltGi]の[par_sno_p.sno3]を[columnRsltGi_par_sno3]としてエイリアス定義。
	public MCColumnConfig columnRsltGi_par_sno4;// [RsltGi]の[par_sno_p.sno4]を[columnRsltGi_par_sno4]としてエイリアス定義。
	/**
	 * Schedule/Result type 予定実績区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_schd_act_typ = null;
	/**
	 * Schedule/result type name 予定実績区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_schd_act_typ_nm = null;
	/**
	 * GI location 出庫場所.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_loc_cd = null;
	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_loc_nm = null;
	/**
	 * Delivery destination 納品先.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_dlv_nm = null;
	/**
	 * Receiving point 配送先.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_tdlv_cd = null;
	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_tdlv_nm = null;
	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_lot_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_sub_char3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltGi_upd_srv_req_no = null;
	// [BtnGi]ブロック関連のField定義
	public MCPanel BtnGiPanel = null;
	// [BtnGi]ブロックの項目のField定義
	/**
	 * Mfg. order progress 製造指図進捗一覧照会.<p>
	 *
	 */
	public MCButton BtnGi_open_MSBCP1070_gi = null;
	/**
	 * GR/GI result 受払実績一覧照会.<p>
	 *
	 */
	public MCButton BtnGi_open_MSBEP0080_gi = null;
	/**
	 * GR/GI schedule 受払予定一覧照会.<p>
	 *
	 */
	public MCButton BtnGi_open_MSBEP0090_gi = null;
	// [LotTraceAprvJudg]ブロック関連のField定義
	public MCPanel LotTraceAprvJudgPanel = null;
	// [LotTraceAprvJudg]ブロックの項目のField定義
	// [RsltAprvJudg]ブロック関連のField定義
	public MCPanel RsltAprvJudgPanel = null;
	public MCScrollPane RsltAprvJudgScrollPane = null;
	public MCTable2<mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR> RsltAprvJudgTable = null;
	// [RsltAprvJudg]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D RsltAprvJudg_itm_p_PPanel;
	public MCColumnConfig columnRsltAprvJudg_itm_cd;// [RsltAprvJudg]の[itm_p.itm_cd]を[columnRsltAprvJudg_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRsltAprvJudg_itm_sub1;// [RsltAprvJudg]の[itm_p.itm_sub1]を[columnRsltAprvJudg_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRsltAprvJudg_itm_sub2;// [RsltAprvJudg]の[itm_p.itm_sub2]を[columnRsltAprvJudg_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRsltAprvJudg_itm_sub3;// [RsltAprvJudg]の[itm_p.itm_sub3]を[columnRsltAprvJudg_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRsltAprvJudg_itm_nm;// [RsltAprvJudg]の[itm_p.itm_nm]を[columnRsltAprvJudg_itm_nm]としてエイリアス定義。
	/**
	 * Notification name 届出名.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_ntfy_nm = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_sublot_no = null;
	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_mfg_aprv_sts_typ = null;
	/**
	 * Mfg. approval status type name 製造承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_mfg_aprv_sts_typ_nm = null;
	/**
	 * Mfg. approval date 製造承認日.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_mfg_aprv_dt = null;
	/**
	 * Output qty. 出来高数量.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_yield_base_unit_qty = null;
	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_yield_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_yield_base_unit_nm = null;
	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_insp_aprv_sts_typ = null;
	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_insp_aprv_sts_typ_nm = null;
	/**
	 * Inspection decision date 検査判定日.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_insp_judg_dt = null;
	/**
	 * Inspection decision qty. 検査判定数量.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_insp_good_qty = null;
	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_insp_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_insp_base_unit_nm = null;
	/**
	 * Inspection decision result type 検査判定結果区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_insp_judg_rslt_typ = null;
	/**
	 * Inspection decision result type name 検査判定結果区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_insp_judg_rslt_typ_nm = null;
	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_plnt_aprv_sts_typ = null;
	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_plnt_aprv_sts_typ_nm = null;
	/**
	 * Factory release approval date 工場出荷承認日.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_plnt_aprv_dt = null;
	/**
	 * Factory release qty. 工場出荷数量.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_plnt_base_unit_qty = null;
	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_plnt_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_plnt_base_unit_nm = null;
	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_mrkt_judg_sts_typ = null;
	/**
	 * Market release decision status type name 市場出荷判定状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_mrkt_judg_sts_typ_nm = null;
	/**
	 * Market shipment decision date 市場出荷判定日.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_mrkt_judg_dt = null;
	/**
	 * Market release qty. 市場出荷数量.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_mrkt_base_unit_qty = null;
	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_mrkt_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRsltAprvJudg_mrkt_base_unit_nm = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, REF};
	
	/** [MS_MSBFL0130_Srch01]のCallerの作成 */
	protected MSBFP_LotTraceSrch_MC.MS_MSBFL0130_Srch01Caller createMS_MSBFL0130_Srch01() {
		MSBFP_LotTraceSrch_MC.MS_MSBFL0130_Srch01Caller<MSBFP_LotTraceSrch, MS_MSBFL0130_Srch01Bridge>
		caller = ((MSBFP_LotTraceSrch_MC)this).new MS_MSBFL0130_Srch01Caller<MSBFP_LotTraceSrch, MS_MSBFL0130_Srch01Bridge>(
					(MSBFP_LotTraceSrch)this, new MS_MSBFL0130_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBFL0130_Srch01]の呼び出し */
	protected void callMS_MSBFL0130_Srch01() {
		MCCaller caller = createMS_MSBFL0130_Srch01();
		caller.exec();
	}
	/** [MS_MSBFL0130_Srch02]のCallerの作成 */
	protected MSBFP_LotTraceSrch_MC.MS_MSBFL0130_Srch02Caller createMS_MSBFL0130_Srch02() {
		MSBFP_LotTraceSrch_MC.MS_MSBFL0130_Srch02Caller<MSBFP_LotTraceSrch, MS_MSBFL0130_Srch02Bridge>
		caller = ((MSBFP_LotTraceSrch_MC)this).new MS_MSBFL0130_Srch02Caller<MSBFP_LotTraceSrch, MS_MSBFL0130_Srch02Bridge>(
					(MSBFP_LotTraceSrch)this, new MS_MSBFL0130_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBFL0130_Srch02]の呼び出し */
	protected void callMS_MSBFL0130_Srch02() {
		MCCaller caller = createMS_MSBFL0130_Srch02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0130.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBF.MSBFP0130.RsltR> aRsltL;
	/** [RsltCnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0130.RsltR aRsltCndR;
	/** [RsltGr]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBF.MSBFP0130.RsltGrR> aRsltGrL;
	/** [RsltGi]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBF.MSBFP0130.RsltGiR> aRsltGiL;
	/** [RsltAprvJudg]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR> aRsltAprvJudgL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBF.MSBFP0130.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBF.MSBFP0130.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBF.MSBFP0130.CndR createCndR() {
		return mcframe.clientMSBF.MSBFP0130.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBF.MSBFP0130.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0130.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBF.MSBFP0130.RsltR createRsltR() {
		return mcframe.clientMSBF.MSBFP0130.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0130.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBF.MSBFP0130.RsltR.class);
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
	 * 項目コピーによってaRsltCndRを設定します。
	 *
	 * aRsltCndRのインスタンスは変更されません。
	 *
	 * @param row RsltCndR
	 */
	public void setRsltCndR(mcframe.clientMSBF.MSBFP0130.RsltR row) {
		if (row != null) {
			MCRow.copyall(getRsltCndR(), row);
		}
	}

	/**
	 * [RsltCnd]ブロックのコンテナaRsltCndRを返します。
	 *
	 * @return RsltCndR
	 */
	public mcframe.clientMSBF.MSBFP0130.RsltR getRsltCndR() {
		return aRsltCndR;
	}

	/**
	 * aRsltCndRを作成します。
	 *
	 * @return RsltCndR
	 */
	public mcframe.clientMSBF.MSBFP0130.RsltR createRsltCndR() {
		return mcframe.clientMSBF.MSBFP0130.RsltR.create();
	}

	/**
	 * コピーによってaRsltGrLを設定します。
	 *
	 * aRsltGrLのインスタンスは変更されません。
	 *
	 * @param dataset RsltGrL
	 */
	public void setRsltGrL(MCList<mcframe.clientMSBF.MSBFP0130.RsltGrR> aList) {
		if (getRsltGrL() != aList) {
			getRsltGrL().setAll(aList);
		}
	}

	/**
	 * [RsltGr]ブロックのコンテナaRsltGrLを返します。
	 *
	 * @return RsltGrL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0130.RsltGrR> getRsltGrL() {
		return aRsltGrL;
	}

	/**
	 * aRsltGrRを作成します。
	 *
	 * @return RsltGrR
	 */
	public mcframe.clientMSBF.MSBFP0130.RsltGrR createRsltGrR() {
		return mcframe.clientMSBF.MSBFP0130.RsltGrR.create();
	}

	/**
	 * aRsltGrLを作成します。
	 *
	 * @return RsltGrL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0130.RsltGrR> createRsltGrL() {
		return MCList.create(mcframe.clientMSBF.MSBFP0130.RsltGrR.class);
	}

	/**
	 * RsltGrTableを初期化します。
	 */
	protected void createRsltGrTable(){
		if(RsltGrTable == null){
			RsltGrTable = beansFactory.createTable2("RsltGr.table");
		}
	}

	/**
	 * コピーによってaRsltGiLを設定します。
	 *
	 * aRsltGiLのインスタンスは変更されません。
	 *
	 * @param dataset RsltGiL
	 */
	public void setRsltGiL(MCList<mcframe.clientMSBF.MSBFP0130.RsltGiR> aList) {
		if (getRsltGiL() != aList) {
			getRsltGiL().setAll(aList);
		}
	}

	/**
	 * [RsltGi]ブロックのコンテナaRsltGiLを返します。
	 *
	 * @return RsltGiL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0130.RsltGiR> getRsltGiL() {
		return aRsltGiL;
	}

	/**
	 * aRsltGiRを作成します。
	 *
	 * @return RsltGiR
	 */
	public mcframe.clientMSBF.MSBFP0130.RsltGiR createRsltGiR() {
		return mcframe.clientMSBF.MSBFP0130.RsltGiR.create();
	}

	/**
	 * aRsltGiLを作成します。
	 *
	 * @return RsltGiL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0130.RsltGiR> createRsltGiL() {
		return MCList.create(mcframe.clientMSBF.MSBFP0130.RsltGiR.class);
	}

	/**
	 * RsltGiTableを初期化します。
	 */
	protected void createRsltGiTable(){
		if(RsltGiTable == null){
			RsltGiTable = beansFactory.createTable2("RsltGi.table");
		}
	}

	/**
	 * コピーによってaRsltAprvJudgLを設定します。
	 *
	 * aRsltAprvJudgLのインスタンスは変更されません。
	 *
	 * @param dataset RsltAprvJudgL
	 */
	public void setRsltAprvJudgL(MCList<mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR> aList) {
		if (getRsltAprvJudgL() != aList) {
			getRsltAprvJudgL().setAll(aList);
		}
	}

	/**
	 * [RsltAprvJudg]ブロックのコンテナaRsltAprvJudgLを返します。
	 *
	 * @return RsltAprvJudgL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR> getRsltAprvJudgL() {
		return aRsltAprvJudgL;
	}

	/**
	 * aRsltAprvJudgRを作成します。
	 *
	 * @return RsltAprvJudgR
	 */
	public mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR createRsltAprvJudgR() {
		return mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.create();
	}

	/**
	 * aRsltAprvJudgLを作成します。
	 *
	 * @return RsltAprvJudgL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR> createRsltAprvJudgL() {
		return MCList.create(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.class);
	}

	/**
	 * RsltAprvJudgTableを初期化します。
	 */
	protected void createRsltAprvJudgTable(){
		if(RsltAprvJudgTable == null){
			RsltAprvJudgTable = beansFactory.createTable2("RsltAprvJudg.table");
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
		if(!MCCollectionUtil.contains(ret, getRsltCndR())) ret.add(getRsltCndR());
		if(!MCCollectionUtil.contains(ret, getRsltGrL())) ret.add(getRsltGrL());
		if(!MCCollectionUtil.contains(ret, getRsltGiL())) ret.add(getRsltGiL());
		if(!MCCollectionUtil.contains(ret, getRsltAprvJudgL())) ret.add(getRsltAprvJudgL());
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
		if(aCnt == getRsltCndR()) return "RsltCnd";
		if(aCnt == getRsltGrL()) return "RsltGr";
		if(aCnt == getRsltGiL()) return "RsltGi";
		if(aCnt == getRsltAprvJudgL()) return "RsltAprvJudg";
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
		if(bId.equals("RsltCnd")) return getRsltCndR();
		if(bId.equals("RsltGr")) return getRsltGrL();
		if(bId.equals("RsltGi")) return getRsltGiL();
		if(bId.equals("RsltAprvJudg")) return getRsltAprvJudgL();
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
		ret.add(LotTypPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(SrchAllPanel);
		ret.add(RsltPanelPanel);
		ret.add(RsltPanel);
		ret.add(BtnLotTracePanel);
		ret.add(RsltBtmTabPanel);
		ret.add(LotTraceGrPanel);
		ret.add(RsltGrPanel);
		ret.add(BtnGrPanel);
		ret.add(LotTraceGiPanel);
		ret.add(RsltGiPanel);
		ret.add(BtnGiPanel);
		ret.add(LotTraceAprvJudgPanel);
		ret.add(RsltAprvJudgPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBFP_LotTraceSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aRsltCndR = createRsltCndR();
		aRsltGrL = createRsltGrL();
		aRsltGiL = createRsltGiL();
		aRsltAprvJudgL = createRsltAprvJudgL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBFP_LotTraceSrch_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aRsltCndR = createRsltCndR();
		aRsltGrL = createRsltGrL();
		createRsltGrTable();
		RsltGrTable.setRowName(name);
		aRsltGiL = createRsltGiL();
		createRsltGiTable();
		RsltGiTable.setRowName(name);
		aRsltAprvJudgL = createRsltAprvJudgL();
		createRsltAprvJudgTable();
		RsltAprvJudgTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBFP_LotTraceSrch_MC.jbCreateTop((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbCreateFold((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbCreateLotTyp((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbCreateCnd((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbCreateCtrl((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbCreateSrchAll((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbCreateRsltPanel((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbCreateRslt((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbCreateBtnLotTrace((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbCreateRsltBtmTab((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbCreateLotTraceGr((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbCreateRsltGr((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbCreateBtnGr((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbCreateLotTraceGi((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbCreateRsltGi((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbCreateBtnGi((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbCreateLotTraceAprvJudg((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbCreateRsltAprvJudg((MSBFP_LotTraceSrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBFP_LotTraceSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBFP_LotTraceSrch p) {
	}

	/**
	 * [LotTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLotTyp(MSBFP_LotTraceSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBFP_LotTraceSrch p) {
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
		p.Cnd_sno_p_PPanel = mcframe.clientMAUB.MAUBP0080.MAUBP_Sno_H.create(p.getCndR().sno_p());
		p.Cnd_sno_p_PPanel.setName("Cnd.sno_p");
		p.Cnd_sno1 = p.Cnd_sno_p_PPanel.Sno_sno1;
		p.Cnd_sno1.addAliasName("Cnd.sno1", p);
		p.Cnd_sno2 = p.Cnd_sno_p_PPanel.Sno_sno2;
		p.Cnd_sno2.addAliasName("Cnd.sno2", p);
		p.Cnd_sno3 = p.Cnd_sno_p_PPanel.Sno_sno3;
		p.Cnd_sno3.addAliasName("Cnd.sno3", p);
		p.Cnd_sno4 = p.Cnd_sno_p_PPanel.Sno_sno4;
		p.Cnd_sno4.addAliasName("Cnd.sno4", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBFP_LotTraceSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [SrchAll]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSrchAll(MSBFP_LotTraceSrch p) {
	}

	/**
	 * [RsltPanel]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRsltPanel(MSBFP_LotTraceSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBFP_LotTraceSrch p) {
		p.Rslt_hrrchy_p_PPanel = mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.create(mcframe.clientMSBF.MSBFP0130.RsltR.$hrrchy_p);
		p.Rslt_hrrchy_p_PPanel.setName("Rslt.hrrchy_p");
		p.columnRslt_extno = p.Rslt_hrrchy_p_PPanel.columnHrrchy_extno;
		p.columnRslt_extno.addAliasName("Rslt.extno", p);
		p.columnRslt_par_extno = p.Rslt_hrrchy_p_PPanel.columnHrrchy_par_extno;
		p.columnRslt_par_extno.addAliasName("Rslt.par_extno", p);
		p.columnRslt_loop_flg = p.Rslt_hrrchy_p_PPanel.columnHrrchy_loop_flg;
		p.columnRslt_loop_flg.addAliasName("Rslt.loop_flg", p);
		p.columnRslt_leaf_str = p.Rslt_hrrchy_p_PPanel.columnHrrchy_leaf_str;
		p.columnRslt_leaf_str.addAliasName("Rslt.leaf_str", p);
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBF.MSBFP0130.RsltR.$itm_p);
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
		p.Rslt_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBF.MSBFP0130.RsltR.$ver_no_p);
		p.Rslt_ver_no_p_PPanel.setName("Rslt.ver_no_p");
		p.columnRslt_ver_no = p.Rslt_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnRslt_ver_no.addAliasName("Rslt.ver_no", p);
		p.Rslt_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBF.MSBFP0130.RsltR.$sno_p);
		p.Rslt_sno_p_PPanel.setName("Rslt.sno_p");
		p.columnRslt_sno1 = p.Rslt_sno_p_PPanel.columnSno_sno1;
		p.columnRslt_sno1.addAliasName("Rslt.sno1", p);
		p.columnRslt_sno2 = p.Rslt_sno_p_PPanel.columnSno_sno2;
		p.columnRslt_sno2.addAliasName("Rslt.sno2", p);
		p.columnRslt_sno3 = p.Rslt_sno_p_PPanel.columnSno_sno3;
		p.columnRslt_sno3.addAliasName("Rslt.sno3", p);
		p.columnRslt_sno4 = p.Rslt_sno_p_PPanel.columnSno_sno4;
		p.columnRslt_sno4.addAliasName("Rslt.sno4", p);
		p.Rslt_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBF.MSBFP0130.RsltR.$par_itm_p);
		p.Rslt_par_itm_p_PPanel.setName("Rslt.par_itm_p");
		p.columnRslt_par_itm_cd = p.Rslt_par_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt_par_itm_cd.addAliasName("Rslt.par_itm_cd", p);
		p.columnRslt_par_itm_sub1 = p.Rslt_par_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_par_itm_sub1.addAliasName("Rslt.par_itm_sub1", p);
		p.columnRslt_par_itm_sub2 = p.Rslt_par_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_par_itm_sub2.addAliasName("Rslt.par_itm_sub2", p);
		p.columnRslt_par_itm_sub3 = p.Rslt_par_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_par_itm_sub3.addAliasName("Rslt.par_itm_sub3", p);
		p.Rslt_par_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBF.MSBFP0130.RsltR.$par_sno_p);
		p.Rslt_par_sno_p_PPanel.setName("Rslt.par_sno_p");
		p.columnRslt_par_sno1 = p.Rslt_par_sno_p_PPanel.columnSno_sno1;
		p.columnRslt_par_sno1.addAliasName("Rslt.par_sno1", p);
		p.columnRslt_par_sno2 = p.Rslt_par_sno_p_PPanel.columnSno_sno2;
		p.columnRslt_par_sno2.addAliasName("Rslt.par_sno2", p);
		p.columnRslt_par_sno3 = p.Rslt_par_sno_p_PPanel.columnSno_sno3;
		p.columnRslt_par_sno3.addAliasName("Rslt.par_sno3", p);
		p.columnRslt_par_sno4 = p.Rslt_par_sno_p_PPanel.columnSno_sno4;
		p.columnRslt_par_sno4.addAliasName("Rslt.par_sno4", p);
	}

	/**
	 * [BtnLotTrace]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtnLotTrace(MSBFP_LotTraceSrch p) {
	}

	/**
	 * [RsltBtmTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRsltBtmTab(MSBFP_LotTraceSrch p) {
	}

	/**
	 * [LotTraceGr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLotTraceGr(MSBFP_LotTraceSrch p) {
	}

	/**
	 * [RsltGr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRsltGr(MSBFP_LotTraceSrch p) {
		p.RsltGr_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBF.MSBFP0130.RsltGrR.$itm_p);
		p.RsltGr_itm_p_PPanel.setName("RsltGr.itm_p");
		p.columnRsltGr_itm_cd = p.RsltGr_itm_p_PPanel.columnItm_itm_cd;
		p.columnRsltGr_itm_cd.addAliasName("RsltGr.itm_cd", p);
		p.columnRsltGr_itm_sub1 = p.RsltGr_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRsltGr_itm_sub1.addAliasName("RsltGr.itm_sub1", p);
		p.columnRsltGr_itm_sub2 = p.RsltGr_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRsltGr_itm_sub2.addAliasName("RsltGr.itm_sub2", p);
		p.columnRsltGr_itm_sub3 = p.RsltGr_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRsltGr_itm_sub3.addAliasName("RsltGr.itm_sub3", p);
		p.columnRsltGr_itm_nm = p.RsltGr_itm_p_PPanel.columnItm_itm_nm;
		p.columnRsltGr_itm_nm.addAliasName("RsltGr.itm_nm", p);
		p.RsltGr_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBF.MSBFP0130.RsltGrR.$ver_no_p);
		p.RsltGr_ver_no_p_PPanel.setName("RsltGr.ver_no_p");
		p.columnRsltGr_ver_no = p.RsltGr_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnRsltGr_ver_no.addAliasName("RsltGr.ver_no", p);
		p.RsltGr_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBF.MSBFP0130.RsltGrR.$sno_p);
		p.RsltGr_sno_p_PPanel.setName("RsltGr.sno_p");
		p.columnRsltGr_sno1 = p.RsltGr_sno_p_PPanel.columnSno_sno1;
		p.columnRsltGr_sno1.addAliasName("RsltGr.sno1", p);
		p.columnRsltGr_sno2 = p.RsltGr_sno_p_PPanel.columnSno_sno2;
		p.columnRsltGr_sno2.addAliasName("RsltGr.sno2", p);
		p.columnRsltGr_sno3 = p.RsltGr_sno_p_PPanel.columnSno_sno3;
		p.columnRsltGr_sno3.addAliasName("RsltGr.sno3", p);
		p.columnRsltGr_sno4 = p.RsltGr_sno_p_PPanel.columnSno_sno4;
		p.columnRsltGr_sno4.addAliasName("RsltGr.sno4", p);
		p.RsltGr_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0130.RsltGrR.$qty_p);
		p.RsltGr_qty_p_PPanel.setName("RsltGr.qty_p");
		p.columnRsltGr_base_gr_qty = p.RsltGr_qty_p_PPanel.columnQty_qty;
		p.columnRsltGr_base_gr_qty.addAliasName("RsltGr.base_gr_qty", p);
	}

	/**
	 * [BtnGr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtnGr(MSBFP_LotTraceSrch p) {
	}

	/**
	 * [LotTraceGi]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLotTraceGi(MSBFP_LotTraceSrch p) {
	}

	/**
	 * [RsltGi]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRsltGi(MSBFP_LotTraceSrch p) {
		p.RsltGi_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBF.MSBFP0130.RsltGiR.$itm_p);
		p.RsltGi_itm_p_PPanel.setName("RsltGi.itm_p");
		p.columnRsltGi_itm_cd = p.RsltGi_itm_p_PPanel.columnItm_itm_cd;
		p.columnRsltGi_itm_cd.addAliasName("RsltGi.itm_cd", p);
		p.columnRsltGi_itm_sub1 = p.RsltGi_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRsltGi_itm_sub1.addAliasName("RsltGi.itm_sub1", p);
		p.columnRsltGi_itm_sub2 = p.RsltGi_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRsltGi_itm_sub2.addAliasName("RsltGi.itm_sub2", p);
		p.columnRsltGi_itm_sub3 = p.RsltGi_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRsltGi_itm_sub3.addAliasName("RsltGi.itm_sub3", p);
		p.columnRsltGi_itm_nm = p.RsltGi_itm_p_PPanel.columnItm_itm_nm;
		p.columnRsltGi_itm_nm.addAliasName("RsltGi.itm_nm", p);
		p.RsltGi_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBF.MSBFP0130.RsltGiR.$ver_no_p);
		p.RsltGi_ver_no_p_PPanel.setName("RsltGi.ver_no_p");
		p.columnRsltGi_ver_no = p.RsltGi_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnRsltGi_ver_no.addAliasName("RsltGi.ver_no", p);
		p.RsltGi_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBF.MSBFP0130.RsltGiR.$sno_p);
		p.RsltGi_sno_p_PPanel.setName("RsltGi.sno_p");
		p.columnRsltGi_sno1 = p.RsltGi_sno_p_PPanel.columnSno_sno1;
		p.columnRsltGi_sno1.addAliasName("RsltGi.sno1", p);
		p.columnRsltGi_sno2 = p.RsltGi_sno_p_PPanel.columnSno_sno2;
		p.columnRsltGi_sno2.addAliasName("RsltGi.sno2", p);
		p.columnRsltGi_sno3 = p.RsltGi_sno_p_PPanel.columnSno_sno3;
		p.columnRsltGi_sno3.addAliasName("RsltGi.sno3", p);
		p.columnRsltGi_sno4 = p.RsltGi_sno_p_PPanel.columnSno_sno4;
		p.columnRsltGi_sno4.addAliasName("RsltGi.sno4", p);
		p.RsltGi_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0130.RsltGiR.$qty_p);
		p.RsltGi_qty_p_PPanel.setName("RsltGi.qty_p");
		p.columnRsltGi_base_gi_qty = p.RsltGi_qty_p_PPanel.columnQty_qty;
		p.columnRsltGi_base_gi_qty.addAliasName("RsltGi.base_gi_qty", p);
		p.RsltGi_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBF.MSBFP0130.RsltGiR.$par_itm_p);
		p.RsltGi_par_itm_p_PPanel.setName("RsltGi.par_itm_p");
		p.columnRsltGi_par_itm_cd = p.RsltGi_par_itm_p_PPanel.columnItm_itm_cd;
		p.columnRsltGi_par_itm_cd.addAliasName("RsltGi.par_itm_cd", p);
		p.columnRsltGi_par_itm_sub1 = p.RsltGi_par_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRsltGi_par_itm_sub1.addAliasName("RsltGi.par_itm_sub1", p);
		p.columnRsltGi_par_itm_sub2 = p.RsltGi_par_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRsltGi_par_itm_sub2.addAliasName("RsltGi.par_itm_sub2", p);
		p.columnRsltGi_par_itm_sub3 = p.RsltGi_par_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRsltGi_par_itm_sub3.addAliasName("RsltGi.par_itm_sub3", p);
		p.columnRsltGi_par_itm_nm = p.RsltGi_par_itm_p_PPanel.columnItm_itm_nm;
		p.columnRsltGi_par_itm_nm.addAliasName("RsltGi.par_itm_nm", p);
		p.RsltGi_par_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMSBF.MSBFP0130.RsltGiR.$par_sno_p);
		p.RsltGi_par_sno_p_PPanel.setName("RsltGi.par_sno_p");
		p.columnRsltGi_par_sno1 = p.RsltGi_par_sno_p_PPanel.columnSno_sno1;
		p.columnRsltGi_par_sno1.addAliasName("RsltGi.par_sno1", p);
		p.columnRsltGi_par_sno2 = p.RsltGi_par_sno_p_PPanel.columnSno_sno2;
		p.columnRsltGi_par_sno2.addAliasName("RsltGi.par_sno2", p);
		p.columnRsltGi_par_sno3 = p.RsltGi_par_sno_p_PPanel.columnSno_sno3;
		p.columnRsltGi_par_sno3.addAliasName("RsltGi.par_sno3", p);
		p.columnRsltGi_par_sno4 = p.RsltGi_par_sno_p_PPanel.columnSno_sno4;
		p.columnRsltGi_par_sno4.addAliasName("RsltGi.par_sno4", p);
	}

	/**
	 * [BtnGi]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtnGi(MSBFP_LotTraceSrch p) {
	}

	/**
	 * [LotTraceAprvJudg]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLotTraceAprvJudg(MSBFP_LotTraceSrch p) {
	}

	/**
	 * [RsltAprvJudg]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRsltAprvJudg(MSBFP_LotTraceSrch p) {
		p.RsltAprvJudg_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.$itm_p);
		p.RsltAprvJudg_itm_p_PPanel.setName("RsltAprvJudg.itm_p");
		p.columnRsltAprvJudg_itm_cd = p.RsltAprvJudg_itm_p_PPanel.columnItm_itm_cd;
		p.columnRsltAprvJudg_itm_cd.addAliasName("RsltAprvJudg.itm_cd", p);
		p.columnRsltAprvJudg_itm_sub1 = p.RsltAprvJudg_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRsltAprvJudg_itm_sub1.addAliasName("RsltAprvJudg.itm_sub1", p);
		p.columnRsltAprvJudg_itm_sub2 = p.RsltAprvJudg_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRsltAprvJudg_itm_sub2.addAliasName("RsltAprvJudg.itm_sub2", p);
		p.columnRsltAprvJudg_itm_sub3 = p.RsltAprvJudg_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRsltAprvJudg_itm_sub3.addAliasName("RsltAprvJudg.itm_sub3", p);
		p.columnRsltAprvJudg_itm_nm = p.RsltAprvJudg_itm_p_PPanel.columnItm_itm_nm;
		p.columnRsltAprvJudg_itm_nm.addAliasName("RsltAprvJudg.itm_nm", p);
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

	
	/** [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_cd_p = createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_itm_p_PPanel.Itm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3","ver_flg");
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
			Cnd_itm_p_PPanel_Itm_itm_sub1_p = createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3","ver_flg");
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
			Cnd_itm_p_PPanel_Itm_itm_sub2_p = createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3","ver_flg");
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
			Cnd_itm_p_PPanel_Itm_itm_sub3_p = createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub3, "itm_sub3", "itm_nm","ver_flg");
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
	public static MSBFP_LotTraceSrch create(){
		MSBFP_LotTraceSrch p = new MSBFP_LotTraceSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBFP_LotTraceSrch create(String name){
		MSBFP_LotTraceSrch p = new MSBFP_LotTraceSrch(name);
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
		MSBFP_LotTraceSrch_MC.jbfInitTop((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbfInitFold((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbfInitLotTyp((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbfInitCnd((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbfInitCtrl((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbfInitSrchAll((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbfInitRsltPanel((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbfInitRslt((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbfInitBtnLotTrace((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbfInitRsltBtmTab((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbfInitLotTraceGr((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbfInitRsltGr((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbfInitBtnGr((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbfInitLotTraceGi((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbfInitRsltGi((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbfInitBtnGi((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbfInitLotTraceAprvJudg((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbfInitRsltAprvJudg((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbInitTop((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbInitFold((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbInitLotTyp((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbInitCnd((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbInitCtrl((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbInitSrchAll((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbInitRsltPanel((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbInitRslt((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbInitBtnLotTrace((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbInitRsltBtmTab((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbInitLotTraceGr((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbInitRsltGr((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbInitBtnGr((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbInitLotTraceGi((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbInitRsltGi((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbInitBtnGi((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbInitLotTraceAprvJudg((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.jbInitRsltAprvJudg((MSBFP_LotTraceSrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldTitledBorder = p.beansFactory.createTitledBorder();
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [LotTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLotTyp(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.LotTypPanel = p.beansFactory.createPanel("LotTyp");
		p.LotTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_dupl_abl_flg = p.beansFactory.createCheckBox("Cnd.dupl_abl_flg");
		p.Cnd_not_mng_flg = p.beansFactory.createCheckBox("Cnd.not_mng_flg");
		p.Cnd_ver_flg = p.beansFactory.createCheckBox("Cnd.ver_flg");
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextComboBox("Cnd.sublot_no");
		p.Cnd_bp_lot_no_Label = p.beansFactory.createLabel("Cnd.bp_lot_no_Label");
		p.Cnd_bp_lot_no = p.beansFactory.createTextField("Cnd.bp_lot_no");
		p.Cnd_bp_lot_no.setLabel(p.Cnd_bp_lot_no_Label);
		p.Cnd_bottom_layer_only_flg = p.beansFactory.createCheckBox("Cnd.bottom_layer_only_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [SrchAll]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSrchAll(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.SrchAllPanel = p.beansFactory.createPanel("SrchAll");
		// ブロックの項目の初期化
		p.SrchAll_srch_all = p.beansFactory.createButton("SrchAll.srch_all", "srch");
	}

	/**
	 * [RsltPanel]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRsltPanel(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.RsltPanelPanel = p.beansFactory.createPanel("RsltPanel");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
		p.columnRslt_bp_lot_no = p.beansFactory.createTableColumn("Rslt.bp_lot_no", MCColumnType.TEXT);
		p.columnRslt_mfg_aprv_sts_typ = p.beansFactory.createTableColumn("Rslt.mfg_aprv_sts_typ", MCColumnType.TEXT);
		p.columnRslt_mfg_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.mfg_aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ = p.beansFactory.createTableColumn("Rslt.stk_insp_typ", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_insp_typ_nm", MCColumnType.TEXT);
		p.columnRslt_quality_typ = p.beansFactory.createTableColumn("Rslt.quality_typ", MCColumnType.TEXT);
		p.columnRslt_quality_typ_nm = p.beansFactory.createTableColumn("Rslt.quality_typ_nm", MCColumnType.TEXT);
		p.columnRslt_lot_rmrks = p.beansFactory.createTableColumn("Rslt.lot_rmrks", MCColumnType.TEXT);
		p.columnRslt_lot_sub_char1 = p.beansFactory.createTableColumn("Rslt.lot_sub_char1", MCColumnType.TEXT);
		p.columnRslt_lot_sub_char2 = p.beansFactory.createTableColumn("Rslt.lot_sub_char2", MCColumnType.TEXT);
		p.columnRslt_lot_sub_char3 = p.beansFactory.createTableColumn("Rslt.lot_sub_char3", MCColumnType.TEXT);
		p.columnRslt_lot_sub_char4 = p.beansFactory.createTableColumn("Rslt.lot_sub_char4", MCColumnType.TEXT);
		p.columnRslt_lot_sub_char5 = p.beansFactory.createTableColumn("Rslt.lot_sub_char5", MCColumnType.TEXT);
		p.columnRslt_lot_sub_num1 = p.beansFactory.createTableColumn("Rslt.lot_sub_num1", MCColumnType.NUMBER);
		p.columnRslt_lot_sub_num2 = p.beansFactory.createTableColumn("Rslt.lot_sub_num2", MCColumnType.NUMBER);
		p.columnRslt_lot_sub_num3 = p.beansFactory.createTableColumn("Rslt.lot_sub_num3", MCColumnType.NUMBER);
		p.columnRslt_lot_sub_num4 = p.beansFactory.createTableColumn("Rslt.lot_sub_num4", MCColumnType.NUMBER);
		p.columnRslt_lot_sub_num5 = p.beansFactory.createTableColumn("Rslt.lot_sub_num5", MCColumnType.NUMBER);
		p.columnRslt_lot_sub_dt1 = p.beansFactory.createTableColumn("Rslt.lot_sub_dt1", MCColumnType.DATE);
		p.columnRslt_lot_sub_dt2 = p.beansFactory.createTableColumn("Rslt.lot_sub_dt2", MCColumnType.DATE);
		p.columnRslt_lot_sub_dt3 = p.beansFactory.createTableColumn("Rslt.lot_sub_dt3", MCColumnType.DATE);
		p.columnRslt_lot_sub_dt4 = p.beansFactory.createTableColumn("Rslt.lot_sub_dt4", MCColumnType.DATE);
		p.columnRslt_lot_sub_dt5 = p.beansFactory.createTableColumn("Rslt.lot_sub_dt5", MCColumnType.DATE);
		p.columnRslt_lot_sub_flg1 = p.beansFactory.createTableColumn("Rslt.lot_sub_flg1", MCColumnType.CHECK);
		p.columnRslt_lot_sub_flg2 = p.beansFactory.createTableColumn("Rslt.lot_sub_flg2", MCColumnType.CHECK);
		p.columnRslt_lot_sub_flg3 = p.beansFactory.createTableColumn("Rslt.lot_sub_flg3", MCColumnType.CHECK);
		p.columnRslt_lot_sub_flg4 = p.beansFactory.createTableColumn("Rslt.lot_sub_flg4", MCColumnType.CHECK);
		p.columnRslt_lot_sub_flg5 = p.beansFactory.createTableColumn("Rslt.lot_sub_flg5", MCColumnType.CHECK);
		p.columnRslt_lot_mng_typ = p.beansFactory.createTableColumn("Rslt.lot_mng_typ", MCColumnType.TEXT);
		p.columnRslt_lot_mng_typ_nm = p.beansFactory.createTableColumn("Rslt.lot_mng_typ_nm", MCColumnType.TEXT);
		p.columnRslt_sublot_mng_typ = p.beansFactory.createTableColumn("Rslt.sublot_mng_typ", MCColumnType.TEXT);
		p.columnRslt_sublot_mng_typ_nm = p.beansFactory.createTableColumn("Rslt.sublot_mng_typ_nm", MCColumnType.TEXT);
		p.columnRslt_par_lot_no = p.beansFactory.createTableColumn("Rslt.par_lot_no", MCColumnType.TEXT);
		p.columnRslt_par_sublot_no = p.beansFactory.createTableColumn("Rslt.par_sublot_no", MCColumnType.TEXT);
		p.columnRslt_stk_mng_typ = p.beansFactory.createTableColumn("Rslt.stk_mng_typ", MCColumnType.TEXT);
		p.columnRslt_stk_mng_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_mng_typ_nm", MCColumnType.TEXT);
	}

	/**
	 * [BtnLotTrace]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtnLotTrace(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.BtnLotTracePanel = p.beansFactory.createPanel("BtnLotTrace");
		// ブロックの項目の初期化
		p.BtnLotTrace_open_MSBFP0120 = p.beansFactory.createButton("BtnLotTrace.open_MSBFP0120", "open");
		p.BtnLotTrace_open_MSBEP0010 = p.beansFactory.createButton("BtnLotTrace.open_MSBEP0010", "open");
		p.BtnLotTrace_open_MSBFP0110 = p.beansFactory.createButton("BtnLotTrace.open_MSBFP0110", "open");
		p.BtnLotTrace_open_MSBFP0060 = p.beansFactory.createButton("BtnLotTrace.open_MSBFP0060", "open");
	}

	/**
	 * [RsltBtmTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRsltBtmTab(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.RsltBtmTabPanel = p.beansFactory.createPanel("RsltBtmTab");
		p.RsltBtmTabTab = p.beansFactory.createTabbedPane("RsltBtmTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [LotTraceGr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLotTraceGr(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.LotTraceGrPanel = p.beansFactory.createPanel("LotTraceGr");
		// ブロックの項目の初期化
	}

	/**
	 * [RsltGr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRsltGr(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.RsltGrPanel = p.beansFactory.createPanel("RsltGr");
		p.RsltGrScrollPane = p.beansFactory.createScrollPane("RsltGr.scroll");
		p.createRsltGrTable();
		// ブロックの項目の初期化
		p.columnRsltGr_itm_mfg_inst_no = p.beansFactory.createTableColumn("RsltGr.itm_mfg_inst_no", MCColumnType.TEXT);
		p.columnRsltGr_stk_xfr_act_no = p.beansFactory.createTableColumn("RsltGr.stk_xfr_act_no", MCColumnType.TEXT);
		p.columnRsltGr_mfg_act_no = p.beansFactory.createTableColumn("RsltGr.mfg_act_no", MCColumnType.TEXT);
		p.columnRsltGr_trd_ptn_typ = p.beansFactory.createTableColumn("RsltGr.trd_ptn_typ", MCColumnType.TEXT);
		p.columnRsltGr_trd_ptn_typ_nm = p.beansFactory.createTableColumn("RsltGr.trd_ptn_typ_nm", MCColumnType.TEXT);
		p.columnRsltGr_io_act_typ = p.beansFactory.createTableColumn("RsltGr.io_act_typ", MCColumnType.TEXT);
		p.columnRsltGr_io_act_typ_nm = p.beansFactory.createTableColumn("RsltGr.io_act_typ_nm", MCColumnType.TEXT);
		p.columnRsltGr_slip_no = p.beansFactory.createTableColumn("RsltGr.slip_no", MCColumnType.TEXT);
		p.columnRsltGr_io_schd_typ = p.beansFactory.createTableColumn("RsltGr.io_schd_typ", MCColumnType.TEXT);
		p.columnRsltGr_io_schd_typ_nm = p.beansFactory.createTableColumn("RsltGr.io_schd_typ_nm", MCColumnType.TEXT);
		p.columnRsltGr_io_schd_sts_typ = p.beansFactory.createTableColumn("RsltGr.io_schd_sts_typ", MCColumnType.TEXT);
		p.columnRsltGr_io_schd_sts_typ_nm = p.beansFactory.createTableColumn("RsltGr.io_schd_sts_typ_nm", MCColumnType.TEXT);
		p.columnRsltGr_slip_schd_no = p.beansFactory.createTableColumn("RsltGr.slip_schd_no", MCColumnType.TEXT);
		p.columnRsltGr_lot_no = p.beansFactory.createTableColumn("RsltGr.lot_no", MCColumnType.TEXT);
		p.columnRsltGr_sublot_no = p.beansFactory.createTableColumn("RsltGr.sublot_no", MCColumnType.TEXT);
		p.columnRsltGr_base_unit_cd = p.beansFactory.createTableColumn("RsltGr.base_unit_cd", MCColumnType.TEXT);
		p.columnRsltGr_base_unit_nm = p.beansFactory.createTableColumn("RsltGr.base_unit_nm", MCColumnType.TEXT);
		p.columnRsltGr_base_dec_place = p.beansFactory.createTableColumn("RsltGr.base_dec_place", MCColumnType.NUMBER);
		p.columnRsltGr_schd_dt = p.beansFactory.createTableColumn("RsltGr.schd_dt", MCColumnType.DATE);
		p.columnRsltGr_act_dt = p.beansFactory.createTableColumn("RsltGr.act_dt", MCColumnType.DATE);
		p.columnRsltGr_mfg_loc_cd = p.beansFactory.createTableColumn("RsltGr.mfg_loc_cd", MCColumnType.TEXT);
		p.columnRsltGr_mfg_loc_nm = p.beansFactory.createTableColumn("RsltGr.mfg_loc_nm", MCColumnType.TEXT);
		p.columnRsltGr_strg_loc_cd = p.beansFactory.createTableColumn("RsltGr.strg_loc_cd", MCColumnType.TEXT);
		p.columnRsltGr_strg_loc_nm = p.beansFactory.createTableColumn("RsltGr.strg_loc_nm", MCColumnType.TEXT);
		p.columnRsltGr_sppl_cd = p.beansFactory.createTableColumn("RsltGr.sppl_cd", MCColumnType.TEXT);
		p.columnRsltGr_sppl_nm = p.beansFactory.createTableColumn("RsltGr.sppl_nm", MCColumnType.TEXT);
		p.columnRsltGr_schd_act_typ = p.beansFactory.createTableColumn("RsltGr.schd_act_typ", MCColumnType.TEXT);
		p.columnRsltGr_schd_act_typ_nm = p.beansFactory.createTableColumn("RsltGr.schd_act_typ_nm", MCColumnType.TEXT);
		p.columnRsltGr_lot_rmrks = p.beansFactory.createTableColumn("RsltGr.lot_rmrks", MCColumnType.TEXT);
		p.columnRsltGr_sub_char1 = p.beansFactory.createTableColumn("RsltGr.sub_char1", MCColumnType.TEXT);
		p.columnRsltGr_sub_char2 = p.beansFactory.createTableColumn("RsltGr.sub_char2", MCColumnType.TEXT);
		p.columnRsltGr_sub_char3 = p.beansFactory.createTableColumn("RsltGr.sub_char3", MCColumnType.TEXT);
		p.columnRsltGr_ins_usr_id = p.beansFactory.createTableColumn("RsltGr.ins_usr_id", MCColumnType.TEXT);
		p.columnRsltGr_ins_usr_nm = p.beansFactory.createTableColumn("RsltGr.ins_usr_nm", MCColumnType.TEXT);
		p.columnRsltGr_ins_func_id = p.beansFactory.createTableColumn("RsltGr.ins_func_id", MCColumnType.TEXT);
		p.columnRsltGr_ins_func_nm = p.beansFactory.createTableColumn("RsltGr.ins_func_nm", MCColumnType.TEXT);
		p.columnRsltGr_ins_ts = p.beansFactory.createTableColumn("RsltGr.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRsltGr_upd_usr_id = p.beansFactory.createTableColumn("RsltGr.upd_usr_id", MCColumnType.TEXT);
		p.columnRsltGr_upd_usr_nm = p.beansFactory.createTableColumn("RsltGr.upd_usr_nm", MCColumnType.TEXT);
		p.columnRsltGr_upd_func_id = p.beansFactory.createTableColumn("RsltGr.upd_func_id", MCColumnType.TEXT);
		p.columnRsltGr_upd_func_nm = p.beansFactory.createTableColumn("RsltGr.upd_func_nm", MCColumnType.TEXT);
		p.columnRsltGr_upd_ts = p.beansFactory.createTableColumn("RsltGr.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRsltGr_upd_srv_req_no = p.beansFactory.createTableColumn("RsltGr.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [BtnGr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtnGr(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.BtnGrPanel = p.beansFactory.createPanel("BtnGr");
		// ブロックの項目の初期化
		p.BtnGr_open_MSBCP1070_gr = p.beansFactory.createButton("BtnGr.open_MSBCP1070_gr", "open");
		p.BtnGr_open_MSBEP0080_gr = p.beansFactory.createButton("BtnGr.open_MSBEP0080_gr", "open");
		p.BtnGr_open_MSBEP0090_gr = p.beansFactory.createButton("BtnGr.open_MSBEP0090_gr", "open");
	}

	/**
	 * [LotTraceGi]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLotTraceGi(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.LotTraceGiPanel = p.beansFactory.createPanel("LotTraceGi");
		// ブロックの項目の初期化
	}

	/**
	 * [RsltGi]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRsltGi(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.RsltGiPanel = p.beansFactory.createPanel("RsltGi");
		p.RsltGiScrollPane = p.beansFactory.createScrollPane("RsltGi.scroll");
		p.createRsltGiTable();
		// ブロックの項目の初期化
		p.columnRsltGi_itm_mfg_inst_no = p.beansFactory.createTableColumn("RsltGi.itm_mfg_inst_no", MCColumnType.TEXT);
		p.columnRsltGi_mfg_act_no = p.beansFactory.createTableColumn("RsltGi.mfg_act_no", MCColumnType.TEXT);
		p.columnRsltGi_stk_xfr_act_no = p.beansFactory.createTableColumn("RsltGi.stk_xfr_act_no", MCColumnType.TEXT);
		p.columnRsltGi_trd_ptn_typ = p.beansFactory.createTableColumn("RsltGi.trd_ptn_typ", MCColumnType.TEXT);
		p.columnRsltGi_trd_ptn_typ_nm = p.beansFactory.createTableColumn("RsltGi.trd_ptn_typ_nm", MCColumnType.TEXT);
		p.columnRsltGi_io_act_typ = p.beansFactory.createTableColumn("RsltGi.io_act_typ", MCColumnType.TEXT);
		p.columnRsltGi_io_act_typ_nm = p.beansFactory.createTableColumn("RsltGi.io_act_typ_nm", MCColumnType.TEXT);
		p.columnRsltGi_slip_no = p.beansFactory.createTableColumn("RsltGi.slip_no", MCColumnType.TEXT);
		p.columnRsltGi_io_schd_typ = p.beansFactory.createTableColumn("RsltGi.io_schd_typ", MCColumnType.TEXT);
		p.columnRsltGi_io_schd_typ_nm = p.beansFactory.createTableColumn("RsltGi.io_schd_typ_nm", MCColumnType.TEXT);
		p.columnRsltGi_io_schd_sts_typ = p.beansFactory.createTableColumn("RsltGi.io_schd_sts_typ", MCColumnType.TEXT);
		p.columnRsltGi_io_schd_sts_typ_nm = p.beansFactory.createTableColumn("RsltGi.io_schd_sts_typ_nm", MCColumnType.TEXT);
		p.columnRsltGi_slip_schd_no = p.beansFactory.createTableColumn("RsltGi.slip_schd_no", MCColumnType.TEXT);
		p.columnRsltGi_lot_no = p.beansFactory.createTableColumn("RsltGi.lot_no", MCColumnType.TEXT);
		p.columnRsltGi_sublot_no = p.beansFactory.createTableColumn("RsltGi.sublot_no", MCColumnType.TEXT);
		p.columnRsltGi_base_unit_cd = p.beansFactory.createTableColumn("RsltGi.base_unit_cd", MCColumnType.TEXT);
		p.columnRsltGi_base_unit_nm = p.beansFactory.createTableColumn("RsltGi.base_unit_nm", MCColumnType.TEXT);
		p.columnRsltGi_base_dec_place = p.beansFactory.createTableColumn("RsltGi.base_dec_place", MCColumnType.NUMBER);
		p.columnRsltGi_schd_dt = p.beansFactory.createTableColumn("RsltGi.schd_dt", MCColumnType.DATE);
		p.columnRsltGi_act_dt = p.beansFactory.createTableColumn("RsltGi.act_dt", MCColumnType.DATE);
		p.columnRsltGi_par_lot_no = p.beansFactory.createTableColumn("RsltGi.par_lot_no", MCColumnType.TEXT);
		p.columnRsltGi_par_sublot_no = p.beansFactory.createTableColumn("RsltGi.par_sublot_no", MCColumnType.TEXT);
		p.columnRsltGi_schd_act_typ = p.beansFactory.createTableColumn("RsltGi.schd_act_typ", MCColumnType.TEXT);
		p.columnRsltGi_schd_act_typ_nm = p.beansFactory.createTableColumn("RsltGi.schd_act_typ_nm", MCColumnType.TEXT);
		p.columnRsltGi_loc_cd = p.beansFactory.createTableColumn("RsltGi.loc_cd", MCColumnType.TEXT);
		p.columnRsltGi_loc_nm = p.beansFactory.createTableColumn("RsltGi.loc_nm", MCColumnType.TEXT);
		p.columnRsltGi_dlv_cd = p.beansFactory.createTableColumn("RsltGi.dlv_cd", MCColumnType.TEXT);
		p.columnRsltGi_dlv_nm = p.beansFactory.createTableColumn("RsltGi.dlv_nm", MCColumnType.TEXT);
		p.columnRsltGi_tdlv_cd = p.beansFactory.createTableColumn("RsltGi.tdlv_cd", MCColumnType.TEXT);
		p.columnRsltGi_tdlv_nm = p.beansFactory.createTableColumn("RsltGi.tdlv_nm", MCColumnType.TEXT);
		p.columnRsltGi_lot_rmrks = p.beansFactory.createTableColumn("RsltGi.lot_rmrks", MCColumnType.TEXT);
		p.columnRsltGi_sub_char1 = p.beansFactory.createTableColumn("RsltGi.sub_char1", MCColumnType.TEXT);
		p.columnRsltGi_sub_char2 = p.beansFactory.createTableColumn("RsltGi.sub_char2", MCColumnType.TEXT);
		p.columnRsltGi_sub_char3 = p.beansFactory.createTableColumn("RsltGi.sub_char3", MCColumnType.TEXT);
		p.columnRsltGi_ins_usr_id = p.beansFactory.createTableColumn("RsltGi.ins_usr_id", MCColumnType.TEXT);
		p.columnRsltGi_ins_usr_nm = p.beansFactory.createTableColumn("RsltGi.ins_usr_nm", MCColumnType.TEXT);
		p.columnRsltGi_ins_func_id = p.beansFactory.createTableColumn("RsltGi.ins_func_id", MCColumnType.TEXT);
		p.columnRsltGi_ins_func_nm = p.beansFactory.createTableColumn("RsltGi.ins_func_nm", MCColumnType.TEXT);
		p.columnRsltGi_ins_ts = p.beansFactory.createTableColumn("RsltGi.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRsltGi_upd_usr_id = p.beansFactory.createTableColumn("RsltGi.upd_usr_id", MCColumnType.TEXT);
		p.columnRsltGi_upd_usr_nm = p.beansFactory.createTableColumn("RsltGi.upd_usr_nm", MCColumnType.TEXT);
		p.columnRsltGi_upd_func_id = p.beansFactory.createTableColumn("RsltGi.upd_func_id", MCColumnType.TEXT);
		p.columnRsltGi_upd_func_nm = p.beansFactory.createTableColumn("RsltGi.upd_func_nm", MCColumnType.TEXT);
		p.columnRsltGi_upd_ts = p.beansFactory.createTableColumn("RsltGi.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRsltGi_upd_srv_req_no = p.beansFactory.createTableColumn("RsltGi.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [BtnGi]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtnGi(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.BtnGiPanel = p.beansFactory.createPanel("BtnGi");
		// ブロックの項目の初期化
		p.BtnGi_open_MSBCP1070_gi = p.beansFactory.createButton("BtnGi.open_MSBCP1070_gi", "open");
		p.BtnGi_open_MSBEP0080_gi = p.beansFactory.createButton("BtnGi.open_MSBEP0080_gi", "open");
		p.BtnGi_open_MSBEP0090_gi = p.beansFactory.createButton("BtnGi.open_MSBEP0090_gi", "open");
	}

	/**
	 * [LotTraceAprvJudg]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLotTraceAprvJudg(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.LotTraceAprvJudgPanel = p.beansFactory.createPanel("LotTraceAprvJudg");
		// ブロックの項目の初期化
	}

	/**
	 * [RsltAprvJudg]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRsltAprvJudg(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.RsltAprvJudgPanel = p.beansFactory.createPanel("RsltAprvJudg");
		p.RsltAprvJudgScrollPane = p.beansFactory.createScrollPane("RsltAprvJudg.scroll");
		p.createRsltAprvJudgTable();
		// ブロックの項目の初期化
		p.columnRsltAprvJudg_ntfy_nm = p.beansFactory.createTableColumn("RsltAprvJudg.ntfy_nm", MCColumnType.TEXT);
		p.columnRsltAprvJudg_lot_no = p.beansFactory.createTableColumn("RsltAprvJudg.lot_no", MCColumnType.TEXT);
		p.columnRsltAprvJudg_sublot_no = p.beansFactory.createTableColumn("RsltAprvJudg.sublot_no", MCColumnType.TEXT);
		p.columnRsltAprvJudg_mfg_aprv_sts_typ = p.beansFactory.createTableColumn("RsltAprvJudg.mfg_aprv_sts_typ", MCColumnType.TEXT);
		p.columnRsltAprvJudg_mfg_aprv_sts_typ_nm = p.beansFactory.createTableColumn("RsltAprvJudg.mfg_aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRsltAprvJudg_mfg_aprv_dt = p.beansFactory.createTableColumn("RsltAprvJudg.mfg_aprv_dt", MCColumnType.DATE);
		p.columnRsltAprvJudg_yield_base_unit_qty = p.beansFactory.createTableColumn("RsltAprvJudg.yield_base_unit_qty", MCColumnType.NUMBER);
		p.columnRsltAprvJudg_yield_base_unit_cd = p.beansFactory.createTableColumn("RsltAprvJudg.yield_base_unit_cd", MCColumnType.TEXT);
		p.columnRsltAprvJudg_yield_base_unit_nm = p.beansFactory.createTableColumn("RsltAprvJudg.yield_base_unit_nm", MCColumnType.TEXT);
		p.columnRsltAprvJudg_insp_aprv_sts_typ = p.beansFactory.createTableColumn("RsltAprvJudg.insp_aprv_sts_typ", MCColumnType.TEXT);
		p.columnRsltAprvJudg_insp_aprv_sts_typ_nm = p.beansFactory.createTableColumn("RsltAprvJudg.insp_aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRsltAprvJudg_insp_judg_dt = p.beansFactory.createTableColumn("RsltAprvJudg.insp_judg_dt", MCColumnType.DATE);
		p.columnRsltAprvJudg_insp_good_qty = p.beansFactory.createTableColumn("RsltAprvJudg.insp_good_qty", MCColumnType.NUMBER);
		p.columnRsltAprvJudg_insp_base_unit_cd = p.beansFactory.createTableColumn("RsltAprvJudg.insp_base_unit_cd", MCColumnType.TEXT);
		p.columnRsltAprvJudg_insp_base_unit_nm = p.beansFactory.createTableColumn("RsltAprvJudg.insp_base_unit_nm", MCColumnType.TEXT);
		p.columnRsltAprvJudg_insp_judg_rslt_typ = p.beansFactory.createTableColumn("RsltAprvJudg.insp_judg_rslt_typ", MCColumnType.TEXT);
		p.columnRsltAprvJudg_insp_judg_rslt_typ_nm = p.beansFactory.createTableColumn("RsltAprvJudg.insp_judg_rslt_typ_nm", MCColumnType.TEXT);
		p.columnRsltAprvJudg_plnt_aprv_sts_typ = p.beansFactory.createTableColumn("RsltAprvJudg.plnt_aprv_sts_typ", MCColumnType.TEXT);
		p.columnRsltAprvJudg_plnt_aprv_sts_typ_nm = p.beansFactory.createTableColumn("RsltAprvJudg.plnt_aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRsltAprvJudg_plnt_aprv_dt = p.beansFactory.createTableColumn("RsltAprvJudg.plnt_aprv_dt", MCColumnType.DATE);
		p.columnRsltAprvJudg_plnt_base_unit_qty = p.beansFactory.createTableColumn("RsltAprvJudg.plnt_base_unit_qty", MCColumnType.NUMBER);
		p.columnRsltAprvJudg_plnt_base_unit_cd = p.beansFactory.createTableColumn("RsltAprvJudg.plnt_base_unit_cd", MCColumnType.TEXT);
		p.columnRsltAprvJudg_plnt_base_unit_nm = p.beansFactory.createTableColumn("RsltAprvJudg.plnt_base_unit_nm", MCColumnType.TEXT);
		p.columnRsltAprvJudg_mrkt_judg_sts_typ = p.beansFactory.createTableColumn("RsltAprvJudg.mrkt_judg_sts_typ", MCColumnType.TEXT);
		p.columnRsltAprvJudg_mrkt_judg_sts_typ_nm = p.beansFactory.createTableColumn("RsltAprvJudg.mrkt_judg_sts_typ_nm", MCColumnType.TEXT);
		p.columnRsltAprvJudg_mrkt_judg_dt = p.beansFactory.createTableColumn("RsltAprvJudg.mrkt_judg_dt", MCColumnType.DATE);
		p.columnRsltAprvJudg_mrkt_base_unit_qty = p.beansFactory.createTableColumn("RsltAprvJudg.mrkt_base_unit_qty", MCColumnType.NUMBER);
		p.columnRsltAprvJudg_mrkt_base_unit_cd = p.beansFactory.createTableColumn("RsltAprvJudg.mrkt_base_unit_cd", MCColumnType.TEXT);
		p.columnRsltAprvJudg_mrkt_base_unit_nm = p.beansFactory.createTableColumn("RsltAprvJudg.mrkt_base_unit_nm", MCColumnType.TEXT);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanelPanel);
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
		p.CtrlPanel.setNextBeans(p.SrchAllPanel);
		p.TopPanel.add(p.SrchAllPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.setBorder(p.FoldTitledBorder);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.LotTypPanel, null);
		p.FoldPanel.setLastBeans(p.LotTypPanel);
		p.LotTypPanel.setNextBeans(p.CndPanel);
		p.FoldPanel.add(p.CndPanel, null);
	}

	/**
	 * [LotTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLotTyp(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.LotTypPanel.setBorder(p.LotTypTitledBorder);
		p.LotTypPanel.setValueCheck(false);
		p.LotTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.LotTypPanel.setLayoutPosition("CN");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("CC");
		// ブロックの項目の初期化
		p.LotTypPanel.add(p.Cnd_dupl_abl_flg);
		p.LotTypPanel.setLastBeans(p.Cnd_dupl_abl_flg);
		p.Cnd_dupl_abl_flg.setNextBeans(p.Cnd_not_mng_flg);
		p.Cnd_dupl_abl_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0130.CndR.dupl_abl_flg_META);
		p.LotTypPanel.add(p.Cnd_not_mng_flg);
		p.Cnd_not_mng_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0130.CndR.not_mng_flg_META);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_ver_no_p_PPanel);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3,p.Cnd_ver_flg);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3,p.Cnd_ver_flg);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3,p.Cnd_ver_flg);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm,p.Cnd_ver_flg);
		p.CndPanel.add(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_ver_flg);
		p.CndPanel.add(p.Cnd_ver_flg);
		p.Cnd_ver_flg.setNextBeans(p.Cnd_lot_no);
		p.Cnd_ver_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0130.CndR.ver_flg_META);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0130.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_bp_lot_no);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0130.CndR.sublot_no_META);
		p.CndPanel.add(p.Cnd_bp_lot_no_Label);
		p.CndPanel.add(p.Cnd_bp_lot_no);
		p.Cnd_bp_lot_no.setNextBeans(p.Cnd_sno_p_PPanel);
		p.Cnd_bp_lot_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0130.CndR.bp_lot_no_META);
		p.CndPanel.add(p.Cnd_sno_p_PPanel);
		p.Cnd_sno_p_PPanel.setNextBeans(p.Cnd_bottom_layer_only_flg);
		p.Cnd_sno_p_PPanel.Sno_sno1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.Sno_sno1, false);
		p.Cnd_sno_p_PPanel.Sno_sno2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.Sno_sno2, false);
		p.Cnd_sno_p_PPanel.Sno_sno3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.Sno_sno3, false);
		p.Cnd_sno_p_PPanel.Sno_sno4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_p_PPanel.Sno_sno4, false);
		p.CndPanel.add(p.Cnd_bottom_layer_only_flg);
		p.Cnd_bottom_layer_only_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0130.CndR.bottom_layer_only_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [SrchAll]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSrchAll(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.SrchAllPanel.setValueCheck(false);
		p.SrchAllPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SrchAllPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
		p.SrchAll_srch_all.setIcon("SEARCH");
		p.SrchAll_srch_all.setFunctionKey(MCFunctionKey.F13);
		p.SrchAllPanel.add(p.SrchAll_srch_all);
		p.SrchAllPanel.setLastBeans(p.SrchAll_srch_all);
	}

	/**
	 * [RsltPanel]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRsltPanel(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanelPanel);
		p.RsltPanelPanel.setNextBeans(p.RsltBtmTabPanel);
		p.RsltPanelPanel.setLayoutPosition("CBCTC+");
		// ブロックの項目の初期化
		p.RsltPanelPanel.add(p.RsltPanel, null);
		p.RsltPanelPanel.setLastBeans(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnLotTracePanel);
		p.RsltPanelPanel.add(p.BtnLotTracePanel, null);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [BtnLotTrace]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtnLotTrace(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.BtnLotTracePanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.BtnLotTrace_open_MSBFP0120.setFunctionKey(MCFunctionKey.F3);
		p.BtnLotTracePanel.add(p.BtnLotTrace_open_MSBFP0120);
		p.BtnLotTracePanel.setLastBeans(p.BtnLotTrace_open_MSBFP0120);
		p.BtnLotTrace_open_MSBFP0120.setNextBeans(p.BtnLotTrace_open_MSBEP0010);
		p.BtnLotTrace_open_MSBEP0010.setFunctionKey(MCFunctionKey.F4);
		p.BtnLotTracePanel.add(p.BtnLotTrace_open_MSBEP0010);
		p.BtnLotTrace_open_MSBEP0010.setNextBeans(p.BtnLotTrace_open_MSBFP0110);
		p.BtnLotTrace_open_MSBFP0110.setFunctionKey(MCFunctionKey.F5);
		p.BtnLotTracePanel.add(p.BtnLotTrace_open_MSBFP0110);
		p.BtnLotTrace_open_MSBFP0110.setNextBeans(p.BtnLotTrace_open_MSBFP0060);
		p.BtnLotTrace_open_MSBFP0060.setFunctionKey(MCFunctionKey.F6);
		p.BtnLotTracePanel.add(p.BtnLotTrace_open_MSBFP0060);
	}

	/**
	 * [RsltBtmTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRsltBtmTab(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltBtmTabPanel);
		p.RsltBtmTabPanel.add(p.RsltBtmTabTab);
		p.RsltBtmTabPanel.setLastBeans(p.RsltBtmTabTab);
		p.RsltBtmTabPanel.setLayoutPosition("CBCBCTC+");
		// ブロックの項目の初期化
		p.RsltBtmTabTab.add(p.LotTraceGrPanel, "RsltBtmTab.rsltLotTraceGr");
		p.RsltBtmTabTab.setLastBeans(p.LotTraceGrPanel);
		p.LotTraceGrPanel.setNextBeans(p.LotTraceGiPanel);
		p.RsltBtmTabTab.add(p.LotTraceGiPanel, "RsltBtmTab.rsltLotTraceGi");
		p.LotTraceGiPanel.setNextBeans(p.LotTraceAprvJudgPanel);
		p.RsltBtmTabTab.add(p.LotTraceAprvJudgPanel, "RsltBtmTab.rsltLotTraceAprvJudg");
	}

	/**
	 * [LotTraceGr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLotTraceGr(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.LotTraceGrPanel.setNextBeans(p.LotTraceGiPanel);
		p.LotTraceGrPanel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.LotTraceGrPanel.add(p.RsltGrPanel, null);
		p.LotTraceGrPanel.setLastBeans(p.RsltGrPanel);
		p.RsltGrPanel.setNextBeans(p.BtnGrPanel);
		p.LotTraceGrPanel.add(p.BtnGrPanel, null);
	}

	/**
	 * [RsltGr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRsltGr(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.RsltGrPanel.add(p.RsltGrScrollPane);
		p.RsltGrPanel.setLastBeans(p.RsltGrTable);
		p.RsltGrScrollPane.setViewportView(p.RsltGrTable);
		p.RsltGrTable.setList(p.getRsltGrL());
		p.RsltGrTable.setStatusColumnVisible(false);
		p.RsltGrPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [BtnGr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtnGr(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.BtnGrPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.BtnGr_open_MSBCP1070_gr.setFunctionKey(MCFunctionKey.F7);
		p.BtnGrPanel.add(p.BtnGr_open_MSBCP1070_gr);
		p.BtnGrPanel.setLastBeans(p.BtnGr_open_MSBCP1070_gr);
		p.BtnGr_open_MSBCP1070_gr.setNextBeans(p.BtnGr_open_MSBEP0080_gr);
		p.BtnGr_open_MSBEP0080_gr.setFunctionKey(MCFunctionKey.F8);
		p.BtnGrPanel.add(p.BtnGr_open_MSBEP0080_gr);
		p.BtnGr_open_MSBEP0080_gr.setNextBeans(p.BtnGr_open_MSBEP0090_gr);
		p.BtnGr_open_MSBEP0090_gr.setFunctionKey(MCFunctionKey.F14);
		p.BtnGrPanel.add(p.BtnGr_open_MSBEP0090_gr);
	}

	/**
	 * [LotTraceGi]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLotTraceGi(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.LotTraceGiPanel.setNextBeans(p.LotTraceAprvJudgPanel);
		p.LotTraceGiPanel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.LotTraceGiPanel.add(p.RsltGiPanel, null);
		p.LotTraceGiPanel.setLastBeans(p.RsltGiPanel);
		p.RsltGiPanel.setNextBeans(p.BtnGiPanel);
		p.LotTraceGiPanel.add(p.BtnGiPanel, null);
	}

	/**
	 * [RsltGi]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRsltGi(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.RsltGiPanel.add(p.RsltGiScrollPane);
		p.RsltGiPanel.setLastBeans(p.RsltGiTable);
		p.RsltGiScrollPane.setViewportView(p.RsltGiTable);
		p.RsltGiTable.setList(p.getRsltGiL());
		p.RsltGiTable.setStatusColumnVisible(false);
		p.RsltGiPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [BtnGi]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtnGi(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.BtnGiPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.BtnGi_open_MSBCP1070_gi.setFunctionKey(MCFunctionKey.F7);
		p.BtnGiPanel.add(p.BtnGi_open_MSBCP1070_gi);
		p.BtnGiPanel.setLastBeans(p.BtnGi_open_MSBCP1070_gi);
		p.BtnGi_open_MSBCP1070_gi.setNextBeans(p.BtnGi_open_MSBEP0080_gi);
		p.BtnGi_open_MSBEP0080_gi.setFunctionKey(MCFunctionKey.F8);
		p.BtnGiPanel.add(p.BtnGi_open_MSBEP0080_gi);
		p.BtnGi_open_MSBEP0080_gi.setNextBeans(p.BtnGi_open_MSBEP0090_gi);
		p.BtnGi_open_MSBEP0090_gi.setFunctionKey(MCFunctionKey.F14);
		p.BtnGiPanel.add(p.BtnGi_open_MSBEP0090_gi);
	}

	/**
	 * [LotTraceAprvJudg]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLotTraceAprvJudg(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.LotTraceAprvJudgPanel.setLayoutPosition("+");
		// ブロックの項目の初期化
		p.LotTraceAprvJudgPanel.add(p.RsltAprvJudgPanel, null);
		p.LotTraceAprvJudgPanel.setLastBeans(p.RsltAprvJudgPanel);
	}

	/**
	 * [RsltAprvJudg]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRsltAprvJudg(MSBFP_LotTraceSrch p) {
		// ブロック関連の初期化
		p.RsltAprvJudgPanel.add(p.RsltAprvJudgScrollPane);
		p.RsltAprvJudgPanel.setLastBeans(p.RsltAprvJudgTable);
		p.RsltAprvJudgScrollPane.setViewportView(p.RsltAprvJudgTable);
		p.RsltAprvJudgTable.setList(p.getRsltAprvJudgL());
		p.RsltAprvJudgTable.setStatusColumnVisible(false);
		p.RsltAprvJudgPanel.setLayoutPosition("C");
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
		MSBFP_LotTraceSrch_MC.mcInitTop((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.mcInitFold((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.mcInitLotTyp((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.mcInitCnd((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.mcInitCtrl((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.mcInitSrchAll((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.mcInitRsltPanel((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.mcInitRslt((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.mcInitBtnLotTrace((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.mcInitRsltBtmTab((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.mcInitLotTraceGr((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.mcInitRsltGr((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.mcInitBtnGr((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.mcInitLotTraceGi((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.mcInitRsltGi((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.mcInitBtnGi((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.mcInitLotTraceAprvJudg((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.mcInitRsltAprvJudg((MSBFP_LotTraceSrch)this);

		// [SRCH]ステータスのモードの設定
		MSBFP_LotTraceSrch_MC.statusInitSRCH_Top((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitSRCH_Fold((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitSRCH_LotTyp((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitSRCH_Cnd((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitSRCH_Ctrl((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitSRCH_SrchAll((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitSRCH_RsltPanel((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitSRCH_Rslt((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitSRCH_BtnLotTrace((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitSRCH_RsltCnd((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitSRCH_RsltBtmTab((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitSRCH_LotTraceGr((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitSRCH_RsltGr((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitSRCH_BtnGr((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitSRCH_LotTraceGi((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitSRCH_RsltGi((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitSRCH_BtnGi((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitSRCH_LotTraceAprvJudg((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitSRCH_RsltAprvJudg((MSBFP_LotTraceSrch)this);

		// [REF]ステータスのモードの設定
		MSBFP_LotTraceSrch_MC.statusInitREF_Top((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitREF_Fold((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitREF_LotTyp((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitREF_Cnd((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitREF_Ctrl((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitREF_SrchAll((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitREF_RsltPanel((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitREF_Rslt((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitREF_BtnLotTrace((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitREF_RsltCnd((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitREF_RsltBtmTab((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitREF_LotTraceGr((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitREF_RsltGr((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitREF_BtnGr((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitREF_LotTraceGi((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitREF_RsltGi((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitREF_BtnGi((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitREF_LotTraceAprvJudg((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.statusInitREF_RsltAprvJudg((MSBFP_LotTraceSrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBFP_LotTraceSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBFP_LotTraceSrch p) {
	}

	/**
	 *  [LotTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLotTyp(MSBFP_LotTraceSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBFP_LotTraceSrch p) {
		p.Cnd_dupl_abl_flg.addAllListener(p);
		p.Cnd_not_mng_flg.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_ver_flg.addAllListener(p);
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_bp_lot_no.setListListener(p);
		p.Cnd_bp_lot_no.addAllListener(p);
		p.Cnd_bottom_layer_only_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBFP_LotTraceSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [SrchAll]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSrchAll(MSBFP_LotTraceSrch p) {
		p.SrchAll_srch_all.addAllListener(p);
		p.SrchAll_srch_all.setAPMethodName("doSrchAll_srch_all");
	}

	/**
	 *  [RsltPanel]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRsltPanel(MSBFP_LotTraceSrch p) {
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBFP_LotTraceSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_lot_no.addAllListener(p);
		p.columnRslt_lot_no.setListListener(p);
		p.columnRslt_sublot_no.addAllListener(p);
		p.columnRslt_sublot_no.setListListener(p);
		p.columnRslt_bp_lot_no.addAllListener(p);
		p.columnRslt_bp_lot_no.setListListener(p);
		p.columnRslt_mfg_aprv_sts_typ.addAllListener(p);
		p.columnRslt_mfg_aprv_sts_typ.setListListener(p);
		p.columnRslt_mfg_aprv_sts_typ_nm.addAllListener(p);
		p.columnRslt_mfg_aprv_sts_typ_nm.setListListener(p);
		p.columnRslt_stk_insp_typ.addAllListener(p);
		p.columnRslt_stk_insp_typ.setListListener(p);
		p.columnRslt_stk_insp_typ_nm.addAllListener(p);
		p.columnRslt_stk_insp_typ_nm.setListListener(p);
		p.columnRslt_quality_typ.addAllListener(p);
		p.columnRslt_quality_typ.setListListener(p);
		p.columnRslt_quality_typ_nm.addAllListener(p);
		p.columnRslt_quality_typ_nm.setListListener(p);
		p.columnRslt_lot_rmrks.addAllListener(p);
		p.columnRslt_lot_rmrks.setListListener(p);
		p.columnRslt_lot_sub_char1.addAllListener(p);
		p.columnRslt_lot_sub_char1.setListListener(p);
		p.columnRslt_lot_sub_char2.addAllListener(p);
		p.columnRslt_lot_sub_char2.setListListener(p);
		p.columnRslt_lot_sub_char3.addAllListener(p);
		p.columnRslt_lot_sub_char3.setListListener(p);
		p.columnRslt_lot_sub_char4.addAllListener(p);
		p.columnRslt_lot_sub_char4.setListListener(p);
		p.columnRslt_lot_sub_char5.addAllListener(p);
		p.columnRslt_lot_sub_char5.setListListener(p);
		p.columnRslt_lot_sub_num1.addAllListener(p);
		p.columnRslt_lot_sub_num1.setListListener(p);
		p.columnRslt_lot_sub_num2.addAllListener(p);
		p.columnRslt_lot_sub_num2.setListListener(p);
		p.columnRslt_lot_sub_num3.addAllListener(p);
		p.columnRslt_lot_sub_num3.setListListener(p);
		p.columnRslt_lot_sub_num4.addAllListener(p);
		p.columnRslt_lot_sub_num4.setListListener(p);
		p.columnRslt_lot_sub_num5.addAllListener(p);
		p.columnRslt_lot_sub_num5.setListListener(p);
		p.columnRslt_lot_sub_dt1.addAllListener(p);
		p.columnRslt_lot_sub_dt1.setListListener(p);
		p.columnRslt_lot_sub_dt2.addAllListener(p);
		p.columnRslt_lot_sub_dt2.setListListener(p);
		p.columnRslt_lot_sub_dt3.addAllListener(p);
		p.columnRslt_lot_sub_dt3.setListListener(p);
		p.columnRslt_lot_sub_dt4.addAllListener(p);
		p.columnRslt_lot_sub_dt4.setListListener(p);
		p.columnRslt_lot_sub_dt5.addAllListener(p);
		p.columnRslt_lot_sub_dt5.setListListener(p);
		p.columnRslt_lot_sub_flg1.addAllListener(p);
		p.columnRslt_lot_sub_flg2.addAllListener(p);
		p.columnRslt_lot_sub_flg3.addAllListener(p);
		p.columnRslt_lot_sub_flg4.addAllListener(p);
		p.columnRslt_lot_sub_flg5.addAllListener(p);
		p.columnRslt_lot_mng_typ.addAllListener(p);
		p.columnRslt_lot_mng_typ.setListListener(p);
		p.columnRslt_lot_mng_typ_nm.addAllListener(p);
		p.columnRslt_lot_mng_typ_nm.setListListener(p);
		p.columnRslt_sublot_mng_typ.addAllListener(p);
		p.columnRslt_sublot_mng_typ.setListListener(p);
		p.columnRslt_sublot_mng_typ_nm.addAllListener(p);
		p.columnRslt_sublot_mng_typ_nm.setListListener(p);
		p.columnRslt_par_lot_no.addAllListener(p);
		p.columnRslt_par_lot_no.setListListener(p);
		p.columnRslt_par_sublot_no.addAllListener(p);
		p.columnRslt_par_sublot_no.setListListener(p);
		p.columnRslt_stk_mng_typ.addAllListener(p);
		p.columnRslt_stk_mng_typ.setListListener(p);
		p.columnRslt_stk_mng_typ_nm.addAllListener(p);
		p.columnRslt_stk_mng_typ_nm.setListListener(p);
	}

	/**
	 *  [BtnLotTrace]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtnLotTrace(MSBFP_LotTraceSrch p) {
		p.BtnLotTrace_open_MSBFP0120.addAllListener(p);
		p.BtnLotTrace_open_MSBFP0120.setAPMethodName("doBtnLotTrace_open_MSBFP0120");
		p.BtnLotTrace_open_MSBEP0010.addAllListener(p);
		p.BtnLotTrace_open_MSBEP0010.setAPMethodName("doBtnLotTrace_open_MSBEP0010");
		p.BtnLotTrace_open_MSBFP0110.addAllListener(p);
		p.BtnLotTrace_open_MSBFP0110.setAPMethodName("doBtnLotTrace_open_MSBFP0110");
		p.BtnLotTrace_open_MSBFP0060.addAllListener(p);
		p.BtnLotTrace_open_MSBFP0060.setAPMethodName("doBtnLotTrace_open_MSBFP0060");
	}

	/**
	 *  [RsltBtmTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRsltBtmTab(MSBFP_LotTraceSrch p) {
		p.RsltBtmTabTab.addAllListener(p);
	}

	/**
	 *  [LotTraceGr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLotTraceGr(MSBFP_LotTraceSrch p) {
	}

	/**
	 *  [RsltGr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRsltGr(MSBFP_LotTraceSrch p) {
		p.RsltGrTable.addAllListener(p);
		p.columnRsltGr_itm_mfg_inst_no.addAllListener(p);
		p.columnRsltGr_itm_mfg_inst_no.setListListener(p);
		p.columnRsltGr_stk_xfr_act_no.addAllListener(p);
		p.columnRsltGr_stk_xfr_act_no.setListListener(p);
		p.columnRsltGr_mfg_act_no.addAllListener(p);
		p.columnRsltGr_mfg_act_no.setListListener(p);
		p.columnRsltGr_trd_ptn_typ.addAllListener(p);
		p.columnRsltGr_trd_ptn_typ.setListListener(p);
		p.columnRsltGr_trd_ptn_typ_nm.addAllListener(p);
		p.columnRsltGr_trd_ptn_typ_nm.setListListener(p);
		p.columnRsltGr_io_act_typ.addAllListener(p);
		p.columnRsltGr_io_act_typ.setListListener(p);
		p.columnRsltGr_io_act_typ_nm.addAllListener(p);
		p.columnRsltGr_io_act_typ_nm.setListListener(p);
		p.columnRsltGr_slip_no.addAllListener(p);
		p.columnRsltGr_slip_no.setListListener(p);
		p.columnRsltGr_io_schd_typ.addAllListener(p);
		p.columnRsltGr_io_schd_typ.setListListener(p);
		p.columnRsltGr_io_schd_typ_nm.addAllListener(p);
		p.columnRsltGr_io_schd_typ_nm.setListListener(p);
		p.columnRsltGr_io_schd_sts_typ.addAllListener(p);
		p.columnRsltGr_io_schd_sts_typ.setListListener(p);
		p.columnRsltGr_io_schd_sts_typ_nm.addAllListener(p);
		p.columnRsltGr_io_schd_sts_typ_nm.setListListener(p);
		p.columnRsltGr_slip_schd_no.addAllListener(p);
		p.columnRsltGr_slip_schd_no.setListListener(p);
		p.columnRsltGr_lot_no.addAllListener(p);
		p.columnRsltGr_lot_no.setListListener(p);
		p.columnRsltGr_sublot_no.addAllListener(p);
		p.columnRsltGr_sublot_no.setListListener(p);
		p.columnRsltGr_base_unit_cd.addAllListener(p);
		p.columnRsltGr_base_unit_cd.setListListener(p);
		p.columnRsltGr_base_unit_nm.addAllListener(p);
		p.columnRsltGr_base_unit_nm.setListListener(p);
		p.columnRsltGr_base_dec_place.addAllListener(p);
		p.columnRsltGr_base_dec_place.setListListener(p);
		p.columnRsltGr_schd_dt.addAllListener(p);
		p.columnRsltGr_schd_dt.setListListener(p);
		p.columnRsltGr_act_dt.addAllListener(p);
		p.columnRsltGr_act_dt.setListListener(p);
		p.columnRsltGr_mfg_loc_cd.addAllListener(p);
		p.columnRsltGr_mfg_loc_cd.setListListener(p);
		p.columnRsltGr_mfg_loc_nm.addAllListener(p);
		p.columnRsltGr_mfg_loc_nm.setListListener(p);
		p.columnRsltGr_strg_loc_cd.addAllListener(p);
		p.columnRsltGr_strg_loc_cd.setListListener(p);
		p.columnRsltGr_strg_loc_nm.addAllListener(p);
		p.columnRsltGr_strg_loc_nm.setListListener(p);
		p.columnRsltGr_sppl_cd.addAllListener(p);
		p.columnRsltGr_sppl_cd.setListListener(p);
		p.columnRsltGr_sppl_nm.addAllListener(p);
		p.columnRsltGr_sppl_nm.setListListener(p);
		p.columnRsltGr_schd_act_typ.addAllListener(p);
		p.columnRsltGr_schd_act_typ.setListListener(p);
		p.columnRsltGr_schd_act_typ_nm.addAllListener(p);
		p.columnRsltGr_schd_act_typ_nm.setListListener(p);
		p.columnRsltGr_lot_rmrks.addAllListener(p);
		p.columnRsltGr_lot_rmrks.setListListener(p);
		p.columnRsltGr_sub_char1.addAllListener(p);
		p.columnRsltGr_sub_char1.setListListener(p);
		p.columnRsltGr_sub_char2.addAllListener(p);
		p.columnRsltGr_sub_char2.setListListener(p);
		p.columnRsltGr_sub_char3.addAllListener(p);
		p.columnRsltGr_sub_char3.setListListener(p);
		p.columnRsltGr_ins_usr_id.addAllListener(p);
		p.columnRsltGr_ins_usr_id.setListListener(p);
		p.columnRsltGr_ins_usr_nm.addAllListener(p);
		p.columnRsltGr_ins_usr_nm.setListListener(p);
		p.columnRsltGr_ins_func_id.addAllListener(p);
		p.columnRsltGr_ins_func_id.setListListener(p);
		p.columnRsltGr_ins_func_nm.addAllListener(p);
		p.columnRsltGr_ins_func_nm.setListListener(p);
		p.columnRsltGr_ins_ts.addAllListener(p);
		p.columnRsltGr_ins_ts.setListListener(p);
		p.columnRsltGr_upd_usr_id.addAllListener(p);
		p.columnRsltGr_upd_usr_id.setListListener(p);
		p.columnRsltGr_upd_usr_nm.addAllListener(p);
		p.columnRsltGr_upd_usr_nm.setListListener(p);
		p.columnRsltGr_upd_func_id.addAllListener(p);
		p.columnRsltGr_upd_func_id.setListListener(p);
		p.columnRsltGr_upd_func_nm.addAllListener(p);
		p.columnRsltGr_upd_func_nm.setListListener(p);
		p.columnRsltGr_upd_ts.addAllListener(p);
		p.columnRsltGr_upd_ts.setListListener(p);
		p.columnRsltGr_upd_srv_req_no.addAllListener(p);
		p.columnRsltGr_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [BtnGr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtnGr(MSBFP_LotTraceSrch p) {
		p.BtnGr_open_MSBCP1070_gr.addAllListener(p);
		p.BtnGr_open_MSBCP1070_gr.setAPMethodName("doBtnGr_open_MSBCP1070_gr");
		p.BtnGr_open_MSBEP0080_gr.addAllListener(p);
		p.BtnGr_open_MSBEP0080_gr.setAPMethodName("doBtnGr_open_MSBEP0080_gr");
		p.BtnGr_open_MSBEP0090_gr.addAllListener(p);
		p.BtnGr_open_MSBEP0090_gr.setAPMethodName("doBtnGr_open_MSBEP0090_gr");
	}

	/**
	 *  [LotTraceGi]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLotTraceGi(MSBFP_LotTraceSrch p) {
	}

	/**
	 *  [RsltGi]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRsltGi(MSBFP_LotTraceSrch p) {
		p.RsltGiTable.addAllListener(p);
		p.columnRsltGi_itm_mfg_inst_no.addAllListener(p);
		p.columnRsltGi_itm_mfg_inst_no.setListListener(p);
		p.columnRsltGi_mfg_act_no.addAllListener(p);
		p.columnRsltGi_mfg_act_no.setListListener(p);
		p.columnRsltGi_stk_xfr_act_no.addAllListener(p);
		p.columnRsltGi_stk_xfr_act_no.setListListener(p);
		p.columnRsltGi_trd_ptn_typ.addAllListener(p);
		p.columnRsltGi_trd_ptn_typ.setListListener(p);
		p.columnRsltGi_trd_ptn_typ_nm.addAllListener(p);
		p.columnRsltGi_trd_ptn_typ_nm.setListListener(p);
		p.columnRsltGi_io_act_typ.addAllListener(p);
		p.columnRsltGi_io_act_typ.setListListener(p);
		p.columnRsltGi_io_act_typ_nm.addAllListener(p);
		p.columnRsltGi_io_act_typ_nm.setListListener(p);
		p.columnRsltGi_slip_no.addAllListener(p);
		p.columnRsltGi_slip_no.setListListener(p);
		p.columnRsltGi_io_schd_typ.addAllListener(p);
		p.columnRsltGi_io_schd_typ.setListListener(p);
		p.columnRsltGi_io_schd_typ_nm.addAllListener(p);
		p.columnRsltGi_io_schd_typ_nm.setListListener(p);
		p.columnRsltGi_io_schd_sts_typ.addAllListener(p);
		p.columnRsltGi_io_schd_sts_typ.setListListener(p);
		p.columnRsltGi_io_schd_sts_typ_nm.addAllListener(p);
		p.columnRsltGi_io_schd_sts_typ_nm.setListListener(p);
		p.columnRsltGi_slip_schd_no.addAllListener(p);
		p.columnRsltGi_slip_schd_no.setListListener(p);
		p.columnRsltGi_lot_no.addAllListener(p);
		p.columnRsltGi_lot_no.setListListener(p);
		p.columnRsltGi_sublot_no.addAllListener(p);
		p.columnRsltGi_sublot_no.setListListener(p);
		p.columnRsltGi_base_unit_cd.addAllListener(p);
		p.columnRsltGi_base_unit_cd.setListListener(p);
		p.columnRsltGi_base_unit_nm.addAllListener(p);
		p.columnRsltGi_base_unit_nm.setListListener(p);
		p.columnRsltGi_base_dec_place.addAllListener(p);
		p.columnRsltGi_base_dec_place.setListListener(p);
		p.columnRsltGi_schd_dt.addAllListener(p);
		p.columnRsltGi_schd_dt.setListListener(p);
		p.columnRsltGi_act_dt.addAllListener(p);
		p.columnRsltGi_act_dt.setListListener(p);
		p.columnRsltGi_par_lot_no.addAllListener(p);
		p.columnRsltGi_par_lot_no.setListListener(p);
		p.columnRsltGi_par_sublot_no.addAllListener(p);
		p.columnRsltGi_par_sublot_no.setListListener(p);
		p.columnRsltGi_schd_act_typ.addAllListener(p);
		p.columnRsltGi_schd_act_typ.setListListener(p);
		p.columnRsltGi_schd_act_typ_nm.addAllListener(p);
		p.columnRsltGi_schd_act_typ_nm.setListListener(p);
		p.columnRsltGi_loc_cd.addAllListener(p);
		p.columnRsltGi_loc_cd.setListListener(p);
		p.columnRsltGi_loc_nm.addAllListener(p);
		p.columnRsltGi_loc_nm.setListListener(p);
		p.columnRsltGi_dlv_cd.addAllListener(p);
		p.columnRsltGi_dlv_cd.setListListener(p);
		p.columnRsltGi_dlv_nm.addAllListener(p);
		p.columnRsltGi_dlv_nm.setListListener(p);
		p.columnRsltGi_tdlv_cd.addAllListener(p);
		p.columnRsltGi_tdlv_cd.setListListener(p);
		p.columnRsltGi_tdlv_nm.addAllListener(p);
		p.columnRsltGi_tdlv_nm.setListListener(p);
		p.columnRsltGi_lot_rmrks.addAllListener(p);
		p.columnRsltGi_lot_rmrks.setListListener(p);
		p.columnRsltGi_sub_char1.addAllListener(p);
		p.columnRsltGi_sub_char1.setListListener(p);
		p.columnRsltGi_sub_char2.addAllListener(p);
		p.columnRsltGi_sub_char2.setListListener(p);
		p.columnRsltGi_sub_char3.addAllListener(p);
		p.columnRsltGi_sub_char3.setListListener(p);
		p.columnRsltGi_ins_usr_id.addAllListener(p);
		p.columnRsltGi_ins_usr_id.setListListener(p);
		p.columnRsltGi_ins_usr_nm.addAllListener(p);
		p.columnRsltGi_ins_usr_nm.setListListener(p);
		p.columnRsltGi_ins_func_id.addAllListener(p);
		p.columnRsltGi_ins_func_id.setListListener(p);
		p.columnRsltGi_ins_func_nm.addAllListener(p);
		p.columnRsltGi_ins_func_nm.setListListener(p);
		p.columnRsltGi_ins_ts.addAllListener(p);
		p.columnRsltGi_ins_ts.setListListener(p);
		p.columnRsltGi_upd_usr_id.addAllListener(p);
		p.columnRsltGi_upd_usr_id.setListListener(p);
		p.columnRsltGi_upd_usr_nm.addAllListener(p);
		p.columnRsltGi_upd_usr_nm.setListListener(p);
		p.columnRsltGi_upd_func_id.addAllListener(p);
		p.columnRsltGi_upd_func_id.setListListener(p);
		p.columnRsltGi_upd_func_nm.addAllListener(p);
		p.columnRsltGi_upd_func_nm.setListListener(p);
		p.columnRsltGi_upd_ts.addAllListener(p);
		p.columnRsltGi_upd_ts.setListListener(p);
		p.columnRsltGi_upd_srv_req_no.addAllListener(p);
		p.columnRsltGi_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [BtnGi]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtnGi(MSBFP_LotTraceSrch p) {
		p.BtnGi_open_MSBCP1070_gi.addAllListener(p);
		p.BtnGi_open_MSBCP1070_gi.setAPMethodName("doBtnGi_open_MSBCP1070_gi");
		p.BtnGi_open_MSBEP0080_gi.addAllListener(p);
		p.BtnGi_open_MSBEP0080_gi.setAPMethodName("doBtnGi_open_MSBEP0080_gi");
		p.BtnGi_open_MSBEP0090_gi.addAllListener(p);
		p.BtnGi_open_MSBEP0090_gi.setAPMethodName("doBtnGi_open_MSBEP0090_gi");
	}

	/**
	 *  [LotTraceAprvJudg]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLotTraceAprvJudg(MSBFP_LotTraceSrch p) {
	}

	/**
	 *  [RsltAprvJudg]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRsltAprvJudg(MSBFP_LotTraceSrch p) {
		p.RsltAprvJudgTable.addAllListener(p);
		p.columnRsltAprvJudg_ntfy_nm.addAllListener(p);
		p.columnRsltAprvJudg_ntfy_nm.setListListener(p);
		p.columnRsltAprvJudg_lot_no.addAllListener(p);
		p.columnRsltAprvJudg_lot_no.setListListener(p);
		p.columnRsltAprvJudg_sublot_no.addAllListener(p);
		p.columnRsltAprvJudg_sublot_no.setListListener(p);
		p.columnRsltAprvJudg_mfg_aprv_sts_typ.addAllListener(p);
		p.columnRsltAprvJudg_mfg_aprv_sts_typ.setListListener(p);
		p.columnRsltAprvJudg_mfg_aprv_sts_typ_nm.addAllListener(p);
		p.columnRsltAprvJudg_mfg_aprv_sts_typ_nm.setListListener(p);
		p.columnRsltAprvJudg_mfg_aprv_dt.addAllListener(p);
		p.columnRsltAprvJudg_mfg_aprv_dt.setListListener(p);
		p.columnRsltAprvJudg_yield_base_unit_qty.addAllListener(p);
		p.columnRsltAprvJudg_yield_base_unit_qty.setListListener(p);
		p.columnRsltAprvJudg_yield_base_unit_cd.addAllListener(p);
		p.columnRsltAprvJudg_yield_base_unit_cd.setListListener(p);
		p.columnRsltAprvJudg_yield_base_unit_nm.addAllListener(p);
		p.columnRsltAprvJudg_yield_base_unit_nm.setListListener(p);
		p.columnRsltAprvJudg_insp_aprv_sts_typ.addAllListener(p);
		p.columnRsltAprvJudg_insp_aprv_sts_typ.setListListener(p);
		p.columnRsltAprvJudg_insp_aprv_sts_typ_nm.addAllListener(p);
		p.columnRsltAprvJudg_insp_aprv_sts_typ_nm.setListListener(p);
		p.columnRsltAprvJudg_insp_judg_dt.addAllListener(p);
		p.columnRsltAprvJudg_insp_judg_dt.setListListener(p);
		p.columnRsltAprvJudg_insp_good_qty.addAllListener(p);
		p.columnRsltAprvJudg_insp_good_qty.setListListener(p);
		p.columnRsltAprvJudg_insp_base_unit_cd.addAllListener(p);
		p.columnRsltAprvJudg_insp_base_unit_cd.setListListener(p);
		p.columnRsltAprvJudg_insp_base_unit_nm.addAllListener(p);
		p.columnRsltAprvJudg_insp_base_unit_nm.setListListener(p);
		p.columnRsltAprvJudg_insp_judg_rslt_typ.addAllListener(p);
		p.columnRsltAprvJudg_insp_judg_rslt_typ.setListListener(p);
		p.columnRsltAprvJudg_insp_judg_rslt_typ_nm.addAllListener(p);
		p.columnRsltAprvJudg_insp_judg_rslt_typ_nm.setListListener(p);
		p.columnRsltAprvJudg_plnt_aprv_sts_typ.addAllListener(p);
		p.columnRsltAprvJudg_plnt_aprv_sts_typ.setListListener(p);
		p.columnRsltAprvJudg_plnt_aprv_sts_typ_nm.addAllListener(p);
		p.columnRsltAprvJudg_plnt_aprv_sts_typ_nm.setListListener(p);
		p.columnRsltAprvJudg_plnt_aprv_dt.addAllListener(p);
		p.columnRsltAprvJudg_plnt_aprv_dt.setListListener(p);
		p.columnRsltAprvJudg_plnt_base_unit_qty.addAllListener(p);
		p.columnRsltAprvJudg_plnt_base_unit_qty.setListListener(p);
		p.columnRsltAprvJudg_plnt_base_unit_cd.addAllListener(p);
		p.columnRsltAprvJudg_plnt_base_unit_cd.setListListener(p);
		p.columnRsltAprvJudg_plnt_base_unit_nm.addAllListener(p);
		p.columnRsltAprvJudg_plnt_base_unit_nm.setListListener(p);
		p.columnRsltAprvJudg_mrkt_judg_sts_typ.addAllListener(p);
		p.columnRsltAprvJudg_mrkt_judg_sts_typ.setListListener(p);
		p.columnRsltAprvJudg_mrkt_judg_sts_typ_nm.addAllListener(p);
		p.columnRsltAprvJudg_mrkt_judg_sts_typ_nm.setListListener(p);
		p.columnRsltAprvJudg_mrkt_judg_dt.addAllListener(p);
		p.columnRsltAprvJudg_mrkt_judg_dt.setListListener(p);
		p.columnRsltAprvJudg_mrkt_base_unit_qty.addAllListener(p);
		p.columnRsltAprvJudg_mrkt_base_unit_qty.setListListener(p);
		p.columnRsltAprvJudg_mrkt_base_unit_cd.addAllListener(p);
		p.columnRsltAprvJudg_mrkt_base_unit_cd.setListListener(p);
		p.columnRsltAprvJudg_mrkt_base_unit_nm.addAllListener(p);
		p.columnRsltAprvJudg_mrkt_base_unit_nm.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBFP_LotTraceSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBFP_LotTraceSrch p){

	}

	/**
	 * [SRCH]ステータスの[LotTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LotTyp(MSBFP_LotTraceSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBFP_LotTraceSrch p){
		p.Cnd_dupl_abl_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_not_mng_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_ver_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_lot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0080.MAUBP_Sno_H.ENABLE_SRCH);
		p.Cnd_bottom_layer_only_flg.putMode(p, SRCH, MCMode.REQUIRED);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBFP_LotTraceSrch p){

	}

	/**
	 * [SRCH]ステータスの[SrchAll]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_SrchAll(MSBFP_LotTraceSrch p){
		p.SrchAll_srch_all.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[RsltPanel]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RsltPanel(MSBFP_LotTraceSrch p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBFP_LotTraceSrch p){
		p.Rslt_hrrchy_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.ENABLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_num1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_num2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_num3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_num4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_num5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_dt1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_dt2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_dt3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_dt4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_dt5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_flg1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_flg2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_flg3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_flg4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_flg5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_par_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_par_lot_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_par_sublot_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_par_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.columnRslt_stk_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_stk_mng_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[BtnLotTrace]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BtnLotTrace(MSBFP_LotTraceSrch p){
		p.BtnLotTrace_open_MSBFP0120.putMode(p, SRCH, MCMode.DISABLE);
		p.BtnLotTrace_open_MSBEP0010.putMode(p, SRCH, MCMode.DISABLE);
		p.BtnLotTrace_open_MSBFP0110.putMode(p, SRCH, MCMode.DISABLE);
		p.BtnLotTrace_open_MSBFP0060.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[RsltCnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RsltCnd(MSBFP_LotTraceSrch p){

	}

	/**
	 * [SRCH]ステータスの[RsltBtmTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RsltBtmTab(MSBFP_LotTraceSrch p){

	}

	/**
	 * [SRCH]ステータスの[LotTraceGr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LotTraceGr(MSBFP_LotTraceSrch p){

	}

	/**
	 * [SRCH]ステータスの[RsltGr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RsltGr(MSBFP_LotTraceSrch p){
		p.columnRsltGr_itm_mfg_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_stk_xfr_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_mfg_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_trd_ptn_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_trd_ptn_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_io_act_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_io_act_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_slip_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltGr_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRsltGr_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltGr_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.RsltGr_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.RsltGr_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGr_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_base_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltGr_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_act_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_mfg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_mfg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_strg_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_strg_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_schd_act_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_schd_act_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_lot_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGr_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[BtnGr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BtnGr(MSBFP_LotTraceSrch p){
		p.BtnGr_open_MSBCP1070_gr.putMode(p, SRCH, MCMode.DISABLE);
		p.BtnGr_open_MSBEP0080_gr.putMode(p, SRCH, MCMode.DISABLE);
		p.BtnGr_open_MSBEP0090_gr.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[LotTraceGi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LotTraceGi(MSBFP_LotTraceSrch p){

	}

	/**
	 * [SRCH]ステータスの[RsltGi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RsltGi(MSBFP_LotTraceSrch p){
		p.columnRsltGi_itm_mfg_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_mfg_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_stk_xfr_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_trd_ptn_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_trd_ptn_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_io_act_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_io_act_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_slip_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltGi_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRsltGi_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltGi_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.RsltGi_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.RsltGi_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGi_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_base_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRsltGi_schd_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_act_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltGi_par_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRsltGi_par_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_par_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.RsltGi_par_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnRsltGi_schd_act_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_schd_act_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_dlv_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_dlv_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_tdlv_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_tdlv_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_lot_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltGi_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[BtnGi]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BtnGi(MSBFP_LotTraceSrch p){
		p.BtnGi_open_MSBCP1070_gi.putMode(p, SRCH, MCMode.DISABLE);
		p.BtnGi_open_MSBEP0080_gi.putMode(p, SRCH, MCMode.DISABLE);
		p.BtnGi_open_MSBEP0090_gi.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[LotTraceAprvJudg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LotTraceAprvJudg(MSBFP_LotTraceSrch p){

	}

	/**
	 * [SRCH]ステータスの[RsltAprvJudg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RsltAprvJudg(MSBFP_LotTraceSrch p){
		p.RsltAprvJudg_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRsltAprvJudg_ntfy_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_mfg_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_mfg_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_mfg_aprv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_yield_base_unit_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_yield_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_yield_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_insp_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_insp_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_insp_judg_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_insp_good_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_insp_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_insp_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_insp_judg_rslt_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_insp_judg_rslt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_plnt_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_plnt_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_plnt_aprv_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_plnt_base_unit_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_plnt_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_plnt_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_mrkt_judg_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_mrkt_judg_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_mrkt_judg_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_mrkt_base_unit_qty.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_mrkt_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_mrkt_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBFP_LotTraceSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBFP_LotTraceSrch p){

	}

	/**
	 * [REF]ステータスの[LotTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF_LotTyp(MSBFP_LotTraceSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBFP_LotTraceSrch p){
		p.Cnd_dupl_abl_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_not_mng_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0080.MAUBP_Sno_H.ENABLE_SRCH);
		p.Cnd_bottom_layer_only_flg.putMode(p, REF, MCMode.REQUIRED);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBFP_LotTraceSrch p){

	}

	/**
	 * [REF]ステータスの[SrchAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_SrchAll(MSBFP_LotTraceSrch p){
		p.SrchAll_srch_all.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[RsltPanel]ブロックのモードの設定
	 */
	protected static void statusInitREF_RsltPanel(MSBFP_LotTraceSrch p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBFP_LotTraceSrch p){
		p.Rslt_hrrchy_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5210.MAUBP_Hrrchy_D.ENABLE);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_num1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_num2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_num3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_num4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_num5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_dt1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_dt2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_dt3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_dt4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_dt5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_flg1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_flg2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_flg3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_flg4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_flg5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_par_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnRslt_par_lot_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_par_sublot_no.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_par_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.INVISIBLE);
		p.columnRslt_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_stk_mng_typ_nm.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[BtnLotTrace]ブロックのモードの設定
	 */
	protected static void statusInitREF_BtnLotTrace(MSBFP_LotTraceSrch p){
		p.BtnLotTrace_open_MSBFP0120.putMode(p, REF, MCMode.ENABLE);
		p.BtnLotTrace_open_MSBEP0010.putMode(p, REF, MCMode.ENABLE);
		p.BtnLotTrace_open_MSBFP0110.putMode(p, REF, MCMode.ENABLE);
		p.BtnLotTrace_open_MSBFP0060.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[RsltCnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_RsltCnd(MSBFP_LotTraceSrch p){

	}

	/**
	 * [REF]ステータスの[RsltBtmTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_RsltBtmTab(MSBFP_LotTraceSrch p){

	}

	/**
	 * [REF]ステータスの[LotTraceGr]ブロックのモードの設定
	 */
	protected static void statusInitREF_LotTraceGr(MSBFP_LotTraceSrch p){

	}

	/**
	 * [REF]ステータスの[RsltGr]ブロックのモードの設定
	 */
	protected static void statusInitREF_RsltGr(MSBFP_LotTraceSrch p){
		p.columnRsltGr_itm_mfg_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_stk_xfr_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_mfg_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_trd_ptn_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_trd_ptn_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_io_act_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_io_act_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_io_schd_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_slip_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.RsltGr_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRsltGr_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.RsltGr_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.RsltGr_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.RsltGr_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGr_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_base_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltGr_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_act_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_mfg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_mfg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_strg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_strg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_schd_act_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_schd_act_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_lot_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGr_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[BtnGr]ブロックのモードの設定
	 */
	protected static void statusInitREF_BtnGr(MSBFP_LotTraceSrch p){
		p.BtnGr_open_MSBCP1070_gr.putMode(p, REF, MCMode.ENABLE);
		p.BtnGr_open_MSBEP0080_gr.putMode(p, REF, MCMode.ENABLE);
		p.BtnGr_open_MSBEP0090_gr.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[LotTraceGi]ブロックのモードの設定
	 */
	protected static void statusInitREF_LotTraceGi(MSBFP_LotTraceSrch p){

	}

	/**
	 * [REF]ステータスの[RsltGi]ブロックのモードの設定
	 */
	protected static void statusInitREF_RsltGi(MSBFP_LotTraceSrch p){
		p.columnRsltGi_itm_mfg_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_mfg_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_stk_xfr_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_trd_ptn_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_trd_ptn_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_io_act_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_io_act_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_io_schd_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_slip_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.RsltGi_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRsltGi_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.RsltGi_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.RsltGi_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.RsltGi_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltGi_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_base_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltGi_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_act_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.RsltGi_par_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRsltGi_par_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_par_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.RsltGi_par_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnRsltGi_schd_act_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_schd_act_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_dlv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_dlv_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_tdlv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_tdlv_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_lot_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltGi_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[BtnGi]ブロックのモードの設定
	 */
	protected static void statusInitREF_BtnGi(MSBFP_LotTraceSrch p){
		p.BtnGi_open_MSBCP1070_gi.putMode(p, REF, MCMode.ENABLE);
		p.BtnGi_open_MSBEP0080_gi.putMode(p, REF, MCMode.ENABLE);
		p.BtnGi_open_MSBEP0090_gi.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[LotTraceAprvJudg]ブロックのモードの設定
	 */
	protected static void statusInitREF_LotTraceAprvJudg(MSBFP_LotTraceSrch p){

	}

	/**
	 * [REF]ステータスの[RsltAprvJudg]ブロックのモードの設定
	 */
	protected static void statusInitREF_RsltAprvJudg(MSBFP_LotTraceSrch p){
		p.RsltAprvJudg_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRsltAprvJudg_ntfy_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_mfg_aprv_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_mfg_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_mfg_aprv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_yield_base_unit_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_yield_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_yield_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_insp_aprv_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_insp_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_insp_judg_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_insp_good_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_insp_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_insp_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_insp_judg_rslt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_insp_judg_rslt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_plnt_aprv_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_plnt_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_plnt_aprv_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_plnt_base_unit_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_plnt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_plnt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_mrkt_judg_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_mrkt_judg_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_mrkt_judg_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_mrkt_base_unit_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_mrkt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltAprvJudg_mrkt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBFP_LotTraceSrch_MC.setTableConfigRslt((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.setTableConfigRsltGr((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.setTableConfigRsltGi((MSBFP_LotTraceSrch)this);
		MSBFP_LotTraceSrch_MC.setTableConfigRsltAprvJudg((MSBFP_LotTraceSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBFP_LotTraceSrch p) {
		p.RsltTable.addTable(p.Rslt_hrrchy_p_PPanel.HrrchyTable);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_lot_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.RsltTable.addTable(p.Rslt_ver_no_p_PPanel.VerNoTable);
		p.columnRslt_bp_lot_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.bp_lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_lot_no);
		p.RsltTable.addTable(p.Rslt_sno_p_PPanel.SnoTable);
		p.columnRslt_mfg_aprv_sts_typ.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.mfg_aprv_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_aprv_sts_typ);
		p.columnRslt_mfg_aprv_sts_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.mfg_aprv_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_aprv_sts_typ_nm);
		p.columnRslt_stk_insp_typ.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.stk_insp_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ);
		p.columnRslt_stk_insp_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.stk_insp_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ_nm);
		p.columnRslt_quality_typ.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.quality_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ);
		p.columnRslt_quality_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.quality_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ_nm);
		p.columnRslt_lot_rmrks.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_rmrks);
		p.columnRslt_lot_sub_char1.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_char1);
		p.columnRslt_lot_sub_char2.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_char2);
		p.columnRslt_lot_sub_char3.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_char3);
		p.columnRslt_lot_sub_char4.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_sub_char4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_char4);
		p.columnRslt_lot_sub_char5.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_sub_char5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_char5);
		p.columnRslt_lot_sub_num1.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_sub_num1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_num1);
		p.columnRslt_lot_sub_num2.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_sub_num2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_num2);
		p.columnRslt_lot_sub_num3.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_sub_num3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_num3);
		p.columnRslt_lot_sub_num4.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_sub_num4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_num4);
		p.columnRslt_lot_sub_num5.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_sub_num5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_num5);
		p.columnRslt_lot_sub_dt1.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_sub_dt1_META);
		p.columnRslt_lot_sub_dt1.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_dt1);
		p.columnRslt_lot_sub_dt2.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_sub_dt2_META);
		p.columnRslt_lot_sub_dt2.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_dt2);
		p.columnRslt_lot_sub_dt3.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_sub_dt3_META);
		p.columnRslt_lot_sub_dt3.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_dt3);
		p.columnRslt_lot_sub_dt4.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_sub_dt4_META);
		p.columnRslt_lot_sub_dt4.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_dt4);
		p.columnRslt_lot_sub_dt5.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_sub_dt5_META);
		p.columnRslt_lot_sub_dt5.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_dt5);
		p.columnRslt_lot_sub_flg1.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_sub_flg1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_flg1);
		p.columnRslt_lot_sub_flg2.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_sub_flg2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_flg2);
		p.columnRslt_lot_sub_flg3.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_sub_flg3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_flg3);
		p.columnRslt_lot_sub_flg4.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_sub_flg4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_flg4);
		p.columnRslt_lot_sub_flg5.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_sub_flg5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_flg5);
		p.columnRslt_lot_mng_typ.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_mng_typ);
		p.columnRslt_lot_mng_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.lot_mng_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_mng_typ_nm);
		p.columnRslt_sublot_mng_typ.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.sublot_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_mng_typ);
		p.columnRslt_sublot_mng_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.sublot_mng_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_mng_typ_nm);
		p.RsltTable.addTable(p.Rslt_par_itm_p_PPanel.ItmTable);
		p.columnRslt_par_lot_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.par_lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_lot_no);
		p.columnRslt_par_sublot_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.par_sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_par_sublot_no);
		p.RsltTable.addTable(p.Rslt_par_sno_p_PPanel.SnoTable);
		p.columnRslt_stk_mng_typ.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.stk_mng_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_mng_typ);
		p.columnRslt_stk_mng_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltR.stk_mng_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_mng_typ_nm);
	}

	/**
	 * [RsltGr]ブロックのTableの設定
	 */
	protected static void setTableConfigRsltGr(MSBFP_LotTraceSrch p) {
		p.columnRsltGr_itm_mfg_inst_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.itm_mfg_inst_no_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_itm_mfg_inst_no);
		p.columnRsltGr_stk_xfr_act_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.stk_xfr_act_no_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_stk_xfr_act_no);
		p.columnRsltGr_mfg_act_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.mfg_act_no_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_mfg_act_no);
		p.columnRsltGr_trd_ptn_typ.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.trd_ptn_typ_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_trd_ptn_typ);
		p.columnRsltGr_trd_ptn_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.trd_ptn_typ_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_trd_ptn_typ_nm);
		p.columnRsltGr_io_act_typ.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.io_act_typ_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_io_act_typ);
		p.columnRsltGr_io_act_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.io_act_typ_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_io_act_typ_nm);
		p.columnRsltGr_slip_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.slip_no_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_slip_no);
		p.columnRsltGr_io_schd_typ.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.io_schd_typ_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_io_schd_typ);
		p.columnRsltGr_io_schd_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.io_schd_typ_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_io_schd_typ_nm);
		p.columnRsltGr_io_schd_sts_typ.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.io_schd_sts_typ_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_io_schd_sts_typ);
		p.columnRsltGr_io_schd_sts_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.io_schd_sts_typ_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_io_schd_sts_typ_nm);
		p.columnRsltGr_slip_schd_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.slip_schd_no_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_slip_schd_no);
		p.RsltGrTable.addTable(p.RsltGr_itm_p_PPanel.ItmTable);
		p.columnRsltGr_lot_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.lot_no_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_lot_no);
		p.columnRsltGr_sublot_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.sublot_no_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_sublot_no);
		p.RsltGrTable.addTable(p.RsltGr_ver_no_p_PPanel.VerNoTable);
		p.RsltGrTable.addTable(p.RsltGr_sno_p_PPanel.SnoTable);
		p.RsltGrTable.addTable(p.RsltGr_qty_p_PPanel.QtyTable);
		p.columnRsltGr_base_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.base_unit_cd_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_base_unit_cd);
		p.columnRsltGr_base_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.base_unit_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_base_unit_nm);
		p.columnRsltGr_base_dec_place.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.base_dec_place_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_base_dec_place);
		p.columnRsltGr_schd_dt.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.schd_dt_META);
		p.columnRsltGr_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_schd_dt);
		p.columnRsltGr_act_dt.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.act_dt_META);
		p.columnRsltGr_act_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_act_dt);
		p.columnRsltGr_mfg_loc_cd.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.mfg_loc_cd_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_mfg_loc_cd);
		p.columnRsltGr_mfg_loc_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.mfg_loc_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_mfg_loc_nm);
		p.columnRsltGr_strg_loc_cd.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.strg_loc_cd_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_strg_loc_cd);
		p.columnRsltGr_strg_loc_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.strg_loc_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_strg_loc_nm);
		p.columnRsltGr_sppl_cd.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.sppl_cd_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_sppl_cd);
		p.columnRsltGr_sppl_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.sppl_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_sppl_nm);
		p.columnRsltGr_schd_act_typ.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.schd_act_typ_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_schd_act_typ);
		p.columnRsltGr_schd_act_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.schd_act_typ_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_schd_act_typ_nm);
		p.columnRsltGr_lot_rmrks.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.lot_rmrks_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_lot_rmrks);
		p.columnRsltGr_sub_char1.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.sub_char1_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_sub_char1);
		p.columnRsltGr_sub_char2.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.sub_char2_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_sub_char2);
		p.columnRsltGr_sub_char3.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.sub_char3_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_sub_char3);
		p.columnRsltGr_ins_usr_id.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.ins_usr_id_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_ins_usr_id);
		p.columnRsltGr_ins_usr_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.ins_usr_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_ins_usr_nm);
		p.columnRsltGr_ins_func_id.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.ins_func_id_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_ins_func_id);
		p.columnRsltGr_ins_func_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.ins_func_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_ins_func_nm);
		p.columnRsltGr_ins_ts.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.ins_ts_META);
		p.columnRsltGr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_ins_ts);
		p.columnRsltGr_upd_usr_id.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.upd_usr_id_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_upd_usr_id);
		p.columnRsltGr_upd_usr_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.upd_usr_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_upd_usr_nm);
		p.columnRsltGr_upd_func_id.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.upd_func_id_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_upd_func_id);
		p.columnRsltGr_upd_func_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.upd_func_nm_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_upd_func_nm);
		p.columnRsltGr_upd_ts.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.upd_ts_META);
		p.columnRsltGr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_upd_ts);
		p.columnRsltGr_upd_srv_req_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGrR.upd_srv_req_no_META);
		p.RsltGrTable.addColumnConfig(p.columnRsltGr_upd_srv_req_no);
	}

	/**
	 * [RsltGi]ブロックのTableの設定
	 */
	protected static void setTableConfigRsltGi(MSBFP_LotTraceSrch p) {
		p.columnRsltGi_itm_mfg_inst_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.itm_mfg_inst_no_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_itm_mfg_inst_no);
		p.columnRsltGi_mfg_act_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.mfg_act_no_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_mfg_act_no);
		p.columnRsltGi_stk_xfr_act_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.stk_xfr_act_no_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_stk_xfr_act_no);
		p.columnRsltGi_trd_ptn_typ.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.trd_ptn_typ_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_trd_ptn_typ);
		p.columnRsltGi_trd_ptn_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.trd_ptn_typ_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_trd_ptn_typ_nm);
		p.columnRsltGi_io_act_typ.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.io_act_typ_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_io_act_typ);
		p.columnRsltGi_io_act_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.io_act_typ_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_io_act_typ_nm);
		p.columnRsltGi_slip_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.slip_no_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_slip_no);
		p.columnRsltGi_io_schd_typ.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.io_schd_typ_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_io_schd_typ);
		p.columnRsltGi_io_schd_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.io_schd_typ_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_io_schd_typ_nm);
		p.columnRsltGi_io_schd_sts_typ.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.io_schd_sts_typ_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_io_schd_sts_typ);
		p.columnRsltGi_io_schd_sts_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.io_schd_sts_typ_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_io_schd_sts_typ_nm);
		p.columnRsltGi_slip_schd_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.slip_schd_no_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_slip_schd_no);
		p.RsltGiTable.addTable(p.RsltGi_itm_p_PPanel.ItmTable);
		p.columnRsltGi_lot_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.lot_no_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_lot_no);
		p.columnRsltGi_sublot_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.sublot_no_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_sublot_no);
		p.RsltGiTable.addTable(p.RsltGi_ver_no_p_PPanel.VerNoTable);
		p.RsltGiTable.addTable(p.RsltGi_sno_p_PPanel.SnoTable);
		p.RsltGiTable.addTable(p.RsltGi_qty_p_PPanel.QtyTable);
		p.columnRsltGi_base_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.base_unit_cd_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_base_unit_cd);
		p.columnRsltGi_base_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.base_unit_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_base_unit_nm);
		p.columnRsltGi_base_dec_place.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.base_dec_place_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_base_dec_place);
		p.columnRsltGi_schd_dt.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.schd_dt_META);
		p.columnRsltGi_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_schd_dt);
		p.columnRsltGi_act_dt.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.act_dt_META);
		p.columnRsltGi_act_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_act_dt);
		p.RsltGiTable.addTable(p.RsltGi_par_itm_p_PPanel.ItmTable);
		p.columnRsltGi_par_lot_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.par_lot_no_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_par_lot_no);
		p.columnRsltGi_par_sublot_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.par_sublot_no_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_par_sublot_no);
		p.RsltGiTable.addTable(p.RsltGi_par_sno_p_PPanel.SnoTable);
		p.columnRsltGi_schd_act_typ.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.schd_act_typ_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_schd_act_typ);
		p.columnRsltGi_schd_act_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.schd_act_typ_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_schd_act_typ_nm);
		p.columnRsltGi_loc_cd.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.loc_cd_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_loc_cd);
		p.columnRsltGi_loc_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.loc_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_loc_nm);
		p.columnRsltGi_dlv_cd.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.dlv_cd_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_dlv_cd);
		p.columnRsltGi_dlv_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.dlv_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_dlv_nm);
		p.columnRsltGi_tdlv_cd.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.tdlv_cd_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_tdlv_cd);
		p.columnRsltGi_tdlv_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.tdlv_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_tdlv_nm);
		p.columnRsltGi_lot_rmrks.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.lot_rmrks_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_lot_rmrks);
		p.columnRsltGi_sub_char1.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.sub_char1_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_sub_char1);
		p.columnRsltGi_sub_char2.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.sub_char2_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_sub_char2);
		p.columnRsltGi_sub_char3.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.sub_char3_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_sub_char3);
		p.columnRsltGi_ins_usr_id.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.ins_usr_id_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_ins_usr_id);
		p.columnRsltGi_ins_usr_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.ins_usr_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_ins_usr_nm);
		p.columnRsltGi_ins_func_id.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.ins_func_id_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_ins_func_id);
		p.columnRsltGi_ins_func_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.ins_func_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_ins_func_nm);
		p.columnRsltGi_ins_ts.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.ins_ts_META);
		p.columnRsltGi_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_ins_ts);
		p.columnRsltGi_upd_usr_id.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.upd_usr_id_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_upd_usr_id);
		p.columnRsltGi_upd_usr_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.upd_usr_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_upd_usr_nm);
		p.columnRsltGi_upd_func_id.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.upd_func_id_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_upd_func_id);
		p.columnRsltGi_upd_func_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.upd_func_nm_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_upd_func_nm);
		p.columnRsltGi_upd_ts.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.upd_ts_META);
		p.columnRsltGi_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_upd_ts);
		p.columnRsltGi_upd_srv_req_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltGiR.upd_srv_req_no_META);
		p.RsltGiTable.addColumnConfig(p.columnRsltGi_upd_srv_req_no);
	}

	/**
	 * [RsltAprvJudg]ブロックのTableの設定
	 */
	protected static void setTableConfigRsltAprvJudg(MSBFP_LotTraceSrch p) {
		p.RsltAprvJudgTable.addTable(p.RsltAprvJudg_itm_p_PPanel.ItmTable);
		p.columnRsltAprvJudg_ntfy_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.ntfy_nm_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_ntfy_nm);
		p.columnRsltAprvJudg_lot_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.lot_no_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_lot_no);
		p.columnRsltAprvJudg_sublot_no.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.sublot_no_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_sublot_no);
		p.columnRsltAprvJudg_mfg_aprv_sts_typ.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.mfg_aprv_sts_typ_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_mfg_aprv_sts_typ);
		p.columnRsltAprvJudg_mfg_aprv_sts_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.mfg_aprv_sts_typ_nm_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_mfg_aprv_sts_typ_nm);
		p.columnRsltAprvJudg_mfg_aprv_dt.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.mfg_aprv_dt_META);
		p.columnRsltAprvJudg_mfg_aprv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_mfg_aprv_dt);
		p.columnRsltAprvJudg_yield_base_unit_qty.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.yield_base_unit_qty_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_yield_base_unit_qty);
		p.columnRsltAprvJudg_yield_base_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.yield_base_unit_cd_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_yield_base_unit_cd);
		p.columnRsltAprvJudg_yield_base_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.yield_base_unit_nm_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_yield_base_unit_nm);
		p.columnRsltAprvJudg_insp_aprv_sts_typ.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.insp_aprv_sts_typ_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_insp_aprv_sts_typ);
		p.columnRsltAprvJudg_insp_aprv_sts_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.insp_aprv_sts_typ_nm_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_insp_aprv_sts_typ_nm);
		p.columnRsltAprvJudg_insp_judg_dt.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.insp_judg_dt_META);
		p.columnRsltAprvJudg_insp_judg_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_insp_judg_dt);
		p.columnRsltAprvJudg_insp_good_qty.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.insp_good_qty_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_insp_good_qty);
		p.columnRsltAprvJudg_insp_base_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.insp_base_unit_cd_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_insp_base_unit_cd);
		p.columnRsltAprvJudg_insp_base_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.insp_base_unit_nm_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_insp_base_unit_nm);
		p.columnRsltAprvJudg_insp_judg_rslt_typ.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.insp_judg_rslt_typ_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_insp_judg_rslt_typ);
		p.columnRsltAprvJudg_insp_judg_rslt_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.insp_judg_rslt_typ_nm_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_insp_judg_rslt_typ_nm);
		p.columnRsltAprvJudg_plnt_aprv_sts_typ.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.plnt_aprv_sts_typ_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_plnt_aprv_sts_typ);
		p.columnRsltAprvJudg_plnt_aprv_sts_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.plnt_aprv_sts_typ_nm_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_plnt_aprv_sts_typ_nm);
		p.columnRsltAprvJudg_plnt_aprv_dt.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.plnt_aprv_dt_META);
		p.columnRsltAprvJudg_plnt_aprv_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_plnt_aprv_dt);
		p.columnRsltAprvJudg_plnt_base_unit_qty.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.plnt_base_unit_qty_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_plnt_base_unit_qty);
		p.columnRsltAprvJudg_plnt_base_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.plnt_base_unit_cd_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_plnt_base_unit_cd);
		p.columnRsltAprvJudg_plnt_base_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.plnt_base_unit_nm_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_plnt_base_unit_nm);
		p.columnRsltAprvJudg_mrkt_judg_sts_typ.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.mrkt_judg_sts_typ_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_mrkt_judg_sts_typ);
		p.columnRsltAprvJudg_mrkt_judg_sts_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.mrkt_judg_sts_typ_nm_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_mrkt_judg_sts_typ_nm);
		p.columnRsltAprvJudg_mrkt_judg_dt.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.mrkt_judg_dt_META);
		p.columnRsltAprvJudg_mrkt_judg_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_mrkt_judg_dt);
		p.columnRsltAprvJudg_mrkt_base_unit_qty.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.mrkt_base_unit_qty_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_mrkt_base_unit_qty);
		p.columnRsltAprvJudg_mrkt_base_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.mrkt_base_unit_cd_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_mrkt_base_unit_cd);
		p.columnRsltAprvJudg_mrkt_base_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.mrkt_base_unit_nm_META);
		p.RsltAprvJudgTable.addColumnConfig(p.columnRsltAprvJudg_mrkt_base_unit_nm);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
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
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
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
		else if (ap == SrchAll_srch_all) doSrchAll_srch_all(info);
		else if (ap == BtnLotTrace_open_MSBFP0120) doBtnLotTrace_open_MSBFP0120(info);
		else if (ap == BtnLotTrace_open_MSBEP0010) doBtnLotTrace_open_MSBEP0010(info);
		else if (ap == BtnLotTrace_open_MSBFP0110) doBtnLotTrace_open_MSBFP0110(info);
		else if (ap == BtnLotTrace_open_MSBFP0060) doBtnLotTrace_open_MSBFP0060(info);
		else if (ap == BtnGr_open_MSBCP1070_gr) doBtnGr_open_MSBCP1070_gr(info);
		else if (ap == BtnGr_open_MSBEP0080_gr) doBtnGr_open_MSBEP0080_gr(info);
		else if (ap == BtnGr_open_MSBEP0090_gr) doBtnGr_open_MSBEP0090_gr(info);
		else if (ap == BtnGi_open_MSBCP1070_gi) doBtnGi_open_MSBCP1070_gi(info);
		else if (ap == BtnGi_open_MSBEP0080_gi) doBtnGi_open_MSBEP0080_gi(info);
		else if (ap == BtnGi_open_MSBEP0090_gi) doBtnGi_open_MSBEP0090_gi(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [SrchAll]パネルの[srch_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doSrchAll_srch_all(MCEventInfo info);

	/**
	 * [BtnLotTrace]パネルの[open_MSBFP0120]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnLotTrace_open_MSBFP0120(MCEventInfo info);

	/**
	 * [BtnLotTrace]パネルの[open_MSBEP0010]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnLotTrace_open_MSBEP0010(MCEventInfo info);

	/**
	 * [BtnLotTrace]パネルの[open_MSBFP0110]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnLotTrace_open_MSBFP0110(MCEventInfo info);

	/**
	 * [BtnLotTrace]パネルの[open_MSBFP0060]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnLotTrace_open_MSBFP0060(MCEventInfo info);

	/**
	 * [BtnGr]パネルの[open_MSBCP1070_gr]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnGr_open_MSBCP1070_gr(MCEventInfo info);

	/**
	 * [BtnGr]パネルの[open_MSBEP0080_gr]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnGr_open_MSBEP0080_gr(MCEventInfo info);

	/**
	 * [BtnGr]パネルの[open_MSBEP0090_gr]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnGr_open_MSBEP0090_gr(MCEventInfo info);

	/**
	 * [BtnGi]パネルの[open_MSBCP1070_gi]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnGi_open_MSBCP1070_gi(MCEventInfo info);

	/**
	 * [BtnGi]パネルの[open_MSBEP0080_gi]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnGi_open_MSBEP0080_gi(MCEventInfo info);

	/**
	 * [BtnGi]パネルの[open_MSBEP0090_gi]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnGi_open_MSBEP0090_gi(MCEventInfo info);

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
		if (vc == RsltBtmTabTab) return doRsltBtmTab_VC(info);
		if (vc == RsltGrTable) return doRsltGr_VC(info);
		if (vc == RsltGiTable) return doRsltGi_VC(info);
		if (vc == RsltAprvJudgTable) return doRsltAprvJudg_VC(info);
		if (vc == Cnd_dupl_abl_flg) return doCnd_dupl_abl_flg_VC(info);
		if (vc == Cnd_not_mng_flg) return doCnd_not_mng_flg_VC(info);
		if (vc == Cnd_ver_flg) return doCnd_ver_flg_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_bp_lot_no) return doCnd_bp_lot_no_VC(info);
		if (vc == Cnd_bottom_layer_only_flg) return doCnd_bottom_layer_only_flg_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
		if (vc == columnRslt_bp_lot_no) return doRslt_bp_lot_no_VC(info);
		if (vc == columnRslt_mfg_aprv_sts_typ) return doRslt_mfg_aprv_sts_typ_VC(info);
		if (vc == columnRslt_mfg_aprv_sts_typ_nm) return doRslt_mfg_aprv_sts_typ_nm_VC(info);
		if (vc == columnRslt_stk_insp_typ) return doRslt_stk_insp_typ_VC(info);
		if (vc == columnRslt_stk_insp_typ_nm) return doRslt_stk_insp_typ_nm_VC(info);
		if (vc == columnRslt_quality_typ) return doRslt_quality_typ_VC(info);
		if (vc == columnRslt_quality_typ_nm) return doRslt_quality_typ_nm_VC(info);
		if (vc == columnRslt_lot_rmrks) return doRslt_lot_rmrks_VC(info);
		if (vc == columnRslt_lot_sub_char1) return doRslt_lot_sub_char1_VC(info);
		if (vc == columnRslt_lot_sub_char2) return doRslt_lot_sub_char2_VC(info);
		if (vc == columnRslt_lot_sub_char3) return doRslt_lot_sub_char3_VC(info);
		if (vc == columnRslt_lot_sub_char4) return doRslt_lot_sub_char4_VC(info);
		if (vc == columnRslt_lot_sub_char5) return doRslt_lot_sub_char5_VC(info);
		if (vc == columnRslt_lot_sub_num1) return doRslt_lot_sub_num1_VC(info);
		if (vc == columnRslt_lot_sub_num2) return doRslt_lot_sub_num2_VC(info);
		if (vc == columnRslt_lot_sub_num3) return doRslt_lot_sub_num3_VC(info);
		if (vc == columnRslt_lot_sub_num4) return doRslt_lot_sub_num4_VC(info);
		if (vc == columnRslt_lot_sub_num5) return doRslt_lot_sub_num5_VC(info);
		if (vc == columnRslt_lot_sub_dt1) return doRslt_lot_sub_dt1_VC(info);
		if (vc == columnRslt_lot_sub_dt2) return doRslt_lot_sub_dt2_VC(info);
		if (vc == columnRslt_lot_sub_dt3) return doRslt_lot_sub_dt3_VC(info);
		if (vc == columnRslt_lot_sub_dt4) return doRslt_lot_sub_dt4_VC(info);
		if (vc == columnRslt_lot_sub_dt5) return doRslt_lot_sub_dt5_VC(info);
		if (vc == columnRslt_lot_sub_flg1) return doRslt_lot_sub_flg1_VC(info);
		if (vc == columnRslt_lot_sub_flg2) return doRslt_lot_sub_flg2_VC(info);
		if (vc == columnRslt_lot_sub_flg3) return doRslt_lot_sub_flg3_VC(info);
		if (vc == columnRslt_lot_sub_flg4) return doRslt_lot_sub_flg4_VC(info);
		if (vc == columnRslt_lot_sub_flg5) return doRslt_lot_sub_flg5_VC(info);
		if (vc == columnRslt_lot_mng_typ) return doRslt_lot_mng_typ_VC(info);
		if (vc == columnRslt_lot_mng_typ_nm) return doRslt_lot_mng_typ_nm_VC(info);
		if (vc == columnRslt_sublot_mng_typ) return doRslt_sublot_mng_typ_VC(info);
		if (vc == columnRslt_sublot_mng_typ_nm) return doRslt_sublot_mng_typ_nm_VC(info);
		if (vc == columnRslt_par_lot_no) return doRslt_par_lot_no_VC(info);
		if (vc == columnRslt_par_sublot_no) return doRslt_par_sublot_no_VC(info);
		if (vc == columnRslt_stk_mng_typ) return doRslt_stk_mng_typ_VC(info);
		if (vc == columnRslt_stk_mng_typ_nm) return doRslt_stk_mng_typ_nm_VC(info);
		if (vc == columnRsltGr_itm_mfg_inst_no) return doRsltGr_itm_mfg_inst_no_VC(info);
		if (vc == columnRsltGr_stk_xfr_act_no) return doRsltGr_stk_xfr_act_no_VC(info);
		if (vc == columnRsltGr_mfg_act_no) return doRsltGr_mfg_act_no_VC(info);
		if (vc == columnRsltGr_trd_ptn_typ) return doRsltGr_trd_ptn_typ_VC(info);
		if (vc == columnRsltGr_trd_ptn_typ_nm) return doRsltGr_trd_ptn_typ_nm_VC(info);
		if (vc == columnRsltGr_io_act_typ) return doRsltGr_io_act_typ_VC(info);
		if (vc == columnRsltGr_io_act_typ_nm) return doRsltGr_io_act_typ_nm_VC(info);
		if (vc == columnRsltGr_slip_no) return doRsltGr_slip_no_VC(info);
		if (vc == columnRsltGr_io_schd_typ) return doRsltGr_io_schd_typ_VC(info);
		if (vc == columnRsltGr_io_schd_typ_nm) return doRsltGr_io_schd_typ_nm_VC(info);
		if (vc == columnRsltGr_io_schd_sts_typ) return doRsltGr_io_schd_sts_typ_VC(info);
		if (vc == columnRsltGr_io_schd_sts_typ_nm) return doRsltGr_io_schd_sts_typ_nm_VC(info);
		if (vc == columnRsltGr_slip_schd_no) return doRsltGr_slip_schd_no_VC(info);
		if (vc == columnRsltGr_lot_no) return doRsltGr_lot_no_VC(info);
		if (vc == columnRsltGr_sublot_no) return doRsltGr_sublot_no_VC(info);
		if (vc == columnRsltGr_base_unit_cd) return doRsltGr_base_unit_cd_VC(info);
		if (vc == columnRsltGr_base_unit_nm) return doRsltGr_base_unit_nm_VC(info);
		if (vc == columnRsltGr_base_dec_place) return doRsltGr_base_dec_place_VC(info);
		if (vc == columnRsltGr_schd_dt) return doRsltGr_schd_dt_VC(info);
		if (vc == columnRsltGr_act_dt) return doRsltGr_act_dt_VC(info);
		if (vc == columnRsltGr_mfg_loc_cd) return doRsltGr_mfg_loc_cd_VC(info);
		if (vc == columnRsltGr_mfg_loc_nm) return doRsltGr_mfg_loc_nm_VC(info);
		if (vc == columnRsltGr_strg_loc_cd) return doRsltGr_strg_loc_cd_VC(info);
		if (vc == columnRsltGr_strg_loc_nm) return doRsltGr_strg_loc_nm_VC(info);
		if (vc == columnRsltGr_sppl_cd) return doRsltGr_sppl_cd_VC(info);
		if (vc == columnRsltGr_sppl_nm) return doRsltGr_sppl_nm_VC(info);
		if (vc == columnRsltGr_schd_act_typ) return doRsltGr_schd_act_typ_VC(info);
		if (vc == columnRsltGr_schd_act_typ_nm) return doRsltGr_schd_act_typ_nm_VC(info);
		if (vc == columnRsltGr_lot_rmrks) return doRsltGr_lot_rmrks_VC(info);
		if (vc == columnRsltGr_sub_char1) return doRsltGr_sub_char1_VC(info);
		if (vc == columnRsltGr_sub_char2) return doRsltGr_sub_char2_VC(info);
		if (vc == columnRsltGr_sub_char3) return doRsltGr_sub_char3_VC(info);
		if (vc == columnRsltGr_ins_usr_id) return doRsltGr_ins_usr_id_VC(info);
		if (vc == columnRsltGr_ins_usr_nm) return doRsltGr_ins_usr_nm_VC(info);
		if (vc == columnRsltGr_ins_func_id) return doRsltGr_ins_func_id_VC(info);
		if (vc == columnRsltGr_ins_func_nm) return doRsltGr_ins_func_nm_VC(info);
		if (vc == columnRsltGr_ins_ts) return doRsltGr_ins_ts_VC(info);
		if (vc == columnRsltGr_upd_usr_id) return doRsltGr_upd_usr_id_VC(info);
		if (vc == columnRsltGr_upd_usr_nm) return doRsltGr_upd_usr_nm_VC(info);
		if (vc == columnRsltGr_upd_func_id) return doRsltGr_upd_func_id_VC(info);
		if (vc == columnRsltGr_upd_func_nm) return doRsltGr_upd_func_nm_VC(info);
		if (vc == columnRsltGr_upd_ts) return doRsltGr_upd_ts_VC(info);
		if (vc == columnRsltGr_upd_srv_req_no) return doRsltGr_upd_srv_req_no_VC(info);
		if (vc == columnRsltGi_itm_mfg_inst_no) return doRsltGi_itm_mfg_inst_no_VC(info);
		if (vc == columnRsltGi_mfg_act_no) return doRsltGi_mfg_act_no_VC(info);
		if (vc == columnRsltGi_stk_xfr_act_no) return doRsltGi_stk_xfr_act_no_VC(info);
		if (vc == columnRsltGi_trd_ptn_typ) return doRsltGi_trd_ptn_typ_VC(info);
		if (vc == columnRsltGi_trd_ptn_typ_nm) return doRsltGi_trd_ptn_typ_nm_VC(info);
		if (vc == columnRsltGi_io_act_typ) return doRsltGi_io_act_typ_VC(info);
		if (vc == columnRsltGi_io_act_typ_nm) return doRsltGi_io_act_typ_nm_VC(info);
		if (vc == columnRsltGi_slip_no) return doRsltGi_slip_no_VC(info);
		if (vc == columnRsltGi_io_schd_typ) return doRsltGi_io_schd_typ_VC(info);
		if (vc == columnRsltGi_io_schd_typ_nm) return doRsltGi_io_schd_typ_nm_VC(info);
		if (vc == columnRsltGi_io_schd_sts_typ) return doRsltGi_io_schd_sts_typ_VC(info);
		if (vc == columnRsltGi_io_schd_sts_typ_nm) return doRsltGi_io_schd_sts_typ_nm_VC(info);
		if (vc == columnRsltGi_slip_schd_no) return doRsltGi_slip_schd_no_VC(info);
		if (vc == columnRsltGi_lot_no) return doRsltGi_lot_no_VC(info);
		if (vc == columnRsltGi_sublot_no) return doRsltGi_sublot_no_VC(info);
		if (vc == columnRsltGi_base_unit_cd) return doRsltGi_base_unit_cd_VC(info);
		if (vc == columnRsltGi_base_unit_nm) return doRsltGi_base_unit_nm_VC(info);
		if (vc == columnRsltGi_base_dec_place) return doRsltGi_base_dec_place_VC(info);
		if (vc == columnRsltGi_schd_dt) return doRsltGi_schd_dt_VC(info);
		if (vc == columnRsltGi_act_dt) return doRsltGi_act_dt_VC(info);
		if (vc == columnRsltGi_par_lot_no) return doRsltGi_par_lot_no_VC(info);
		if (vc == columnRsltGi_par_sublot_no) return doRsltGi_par_sublot_no_VC(info);
		if (vc == columnRsltGi_schd_act_typ) return doRsltGi_schd_act_typ_VC(info);
		if (vc == columnRsltGi_schd_act_typ_nm) return doRsltGi_schd_act_typ_nm_VC(info);
		if (vc == columnRsltGi_loc_cd) return doRsltGi_loc_cd_VC(info);
		if (vc == columnRsltGi_loc_nm) return doRsltGi_loc_nm_VC(info);
		if (vc == columnRsltGi_dlv_cd) return doRsltGi_dlv_cd_VC(info);
		if (vc == columnRsltGi_dlv_nm) return doRsltGi_dlv_nm_VC(info);
		if (vc == columnRsltGi_tdlv_cd) return doRsltGi_tdlv_cd_VC(info);
		if (vc == columnRsltGi_tdlv_nm) return doRsltGi_tdlv_nm_VC(info);
		if (vc == columnRsltGi_lot_rmrks) return doRsltGi_lot_rmrks_VC(info);
		if (vc == columnRsltGi_sub_char1) return doRsltGi_sub_char1_VC(info);
		if (vc == columnRsltGi_sub_char2) return doRsltGi_sub_char2_VC(info);
		if (vc == columnRsltGi_sub_char3) return doRsltGi_sub_char3_VC(info);
		if (vc == columnRsltGi_ins_usr_id) return doRsltGi_ins_usr_id_VC(info);
		if (vc == columnRsltGi_ins_usr_nm) return doRsltGi_ins_usr_nm_VC(info);
		if (vc == columnRsltGi_ins_func_id) return doRsltGi_ins_func_id_VC(info);
		if (vc == columnRsltGi_ins_func_nm) return doRsltGi_ins_func_nm_VC(info);
		if (vc == columnRsltGi_ins_ts) return doRsltGi_ins_ts_VC(info);
		if (vc == columnRsltGi_upd_usr_id) return doRsltGi_upd_usr_id_VC(info);
		if (vc == columnRsltGi_upd_usr_nm) return doRsltGi_upd_usr_nm_VC(info);
		if (vc == columnRsltGi_upd_func_id) return doRsltGi_upd_func_id_VC(info);
		if (vc == columnRsltGi_upd_func_nm) return doRsltGi_upd_func_nm_VC(info);
		if (vc == columnRsltGi_upd_ts) return doRsltGi_upd_ts_VC(info);
		if (vc == columnRsltGi_upd_srv_req_no) return doRsltGi_upd_srv_req_no_VC(info);
		if (vc == columnRsltAprvJudg_ntfy_nm) return doRsltAprvJudg_ntfy_nm_VC(info);
		if (vc == columnRsltAprvJudg_lot_no) return doRsltAprvJudg_lot_no_VC(info);
		if (vc == columnRsltAprvJudg_sublot_no) return doRsltAprvJudg_sublot_no_VC(info);
		if (vc == columnRsltAprvJudg_mfg_aprv_sts_typ) return doRsltAprvJudg_mfg_aprv_sts_typ_VC(info);
		if (vc == columnRsltAprvJudg_mfg_aprv_sts_typ_nm) return doRsltAprvJudg_mfg_aprv_sts_typ_nm_VC(info);
		if (vc == columnRsltAprvJudg_mfg_aprv_dt) return doRsltAprvJudg_mfg_aprv_dt_VC(info);
		if (vc == columnRsltAprvJudg_yield_base_unit_qty) return doRsltAprvJudg_yield_base_unit_qty_VC(info);
		if (vc == columnRsltAprvJudg_yield_base_unit_cd) return doRsltAprvJudg_yield_base_unit_cd_VC(info);
		if (vc == columnRsltAprvJudg_yield_base_unit_nm) return doRsltAprvJudg_yield_base_unit_nm_VC(info);
		if (vc == columnRsltAprvJudg_insp_aprv_sts_typ) return doRsltAprvJudg_insp_aprv_sts_typ_VC(info);
		if (vc == columnRsltAprvJudg_insp_aprv_sts_typ_nm) return doRsltAprvJudg_insp_aprv_sts_typ_nm_VC(info);
		if (vc == columnRsltAprvJudg_insp_judg_dt) return doRsltAprvJudg_insp_judg_dt_VC(info);
		if (vc == columnRsltAprvJudg_insp_good_qty) return doRsltAprvJudg_insp_good_qty_VC(info);
		if (vc == columnRsltAprvJudg_insp_base_unit_cd) return doRsltAprvJudg_insp_base_unit_cd_VC(info);
		if (vc == columnRsltAprvJudg_insp_base_unit_nm) return doRsltAprvJudg_insp_base_unit_nm_VC(info);
		if (vc == columnRsltAprvJudg_insp_judg_rslt_typ) return doRsltAprvJudg_insp_judg_rslt_typ_VC(info);
		if (vc == columnRsltAprvJudg_insp_judg_rslt_typ_nm) return doRsltAprvJudg_insp_judg_rslt_typ_nm_VC(info);
		if (vc == columnRsltAprvJudg_plnt_aprv_sts_typ) return doRsltAprvJudg_plnt_aprv_sts_typ_VC(info);
		if (vc == columnRsltAprvJudg_plnt_aprv_sts_typ_nm) return doRsltAprvJudg_plnt_aprv_sts_typ_nm_VC(info);
		if (vc == columnRsltAprvJudg_plnt_aprv_dt) return doRsltAprvJudg_plnt_aprv_dt_VC(info);
		if (vc == columnRsltAprvJudg_plnt_base_unit_qty) return doRsltAprvJudg_plnt_base_unit_qty_VC(info);
		if (vc == columnRsltAprvJudg_plnt_base_unit_cd) return doRsltAprvJudg_plnt_base_unit_cd_VC(info);
		if (vc == columnRsltAprvJudg_plnt_base_unit_nm) return doRsltAprvJudg_plnt_base_unit_nm_VC(info);
		if (vc == columnRsltAprvJudg_mrkt_judg_sts_typ) return doRsltAprvJudg_mrkt_judg_sts_typ_VC(info);
		if (vc == columnRsltAprvJudg_mrkt_judg_sts_typ_nm) return doRsltAprvJudg_mrkt_judg_sts_typ_nm_VC(info);
		if (vc == columnRsltAprvJudg_mrkt_judg_dt) return doRsltAprvJudg_mrkt_judg_dt_VC(info);
		if (vc == columnRsltAprvJudg_mrkt_base_unit_qty) return doRsltAprvJudg_mrkt_base_unit_qty_VC(info);
		if (vc == columnRsltAprvJudg_mrkt_base_unit_cd) return doRsltAprvJudg_mrkt_base_unit_cd_VC(info);
		if (vc == columnRsltAprvJudg_mrkt_base_unit_nm) return doRsltAprvJudg_mrkt_base_unit_nm_VC(info);
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
	 * [RsltBtmTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltBtmTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dupl_abl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dupl_abl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_mng_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_mng_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ver_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bottom_layer_only_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bottom_layer_only_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[bp_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_aprv_sts_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_char4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_char4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_char5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_char5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_num1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_num1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_num2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_num2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_num3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_num3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_num4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_num4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_num5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_num5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_dt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_dt2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_dt3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_dt4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_dt5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_flg1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_flg1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_flg2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_flg2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_flg3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_flg3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_flg4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_flg4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_sub_flg5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_sub_flg5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sublot_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[par_sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_par_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[itm_mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_itm_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[stk_xfr_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_stk_xfr_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[mfg_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_mfg_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[trd_ptn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_trd_ptn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[io_act_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_io_act_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[io_act_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_io_act_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[io_schd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_io_schd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[io_schd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_io_schd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[io_schd_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_io_schd_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[io_schd_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_io_schd_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[slip_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_slip_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[base_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_base_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[act_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_act_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[strg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_strg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[strg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_strg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[schd_act_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_schd_act_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[schd_act_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_schd_act_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[lot_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_lot_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGr]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGr_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[itm_mfg_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_itm_mfg_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[mfg_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_mfg_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[stk_xfr_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_stk_xfr_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[trd_ptn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_trd_ptn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[io_act_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_io_act_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[io_act_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_io_act_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[io_schd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_io_schd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[io_schd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_io_schd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[io_schd_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_io_schd_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[io_schd_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_io_schd_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[slip_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_slip_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[base_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_base_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[act_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_act_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[par_lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_par_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[par_sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_par_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[schd_act_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_schd_act_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[schd_act_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_schd_act_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[tdlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_tdlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[tdlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_tdlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[lot_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_lot_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltGi]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltGi_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[ntfy_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_ntfy_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[mfg_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_mfg_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[mfg_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_mfg_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[mfg_aprv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_mfg_aprv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[yield_base_unit_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_yield_base_unit_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[yield_base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_yield_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[yield_base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_yield_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_insp_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_insp_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_judg_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_insp_judg_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_good_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_insp_good_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_insp_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_insp_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_judg_rslt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_insp_judg_rslt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_judg_rslt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_insp_judg_rslt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_plnt_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_plnt_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_aprv_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_plnt_aprv_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_base_unit_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_plnt_base_unit_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_plnt_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_plnt_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_judg_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_mrkt_judg_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_judg_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_mrkt_judg_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_judg_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_mrkt_judg_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_base_unit_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_mrkt_base_unit_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_mrkt_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltAprvJudg_mrkt_base_unit_nm_VC(MCEventInfo info){
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
		else if (nc == RsltBtmTabTab) doRsltBtmTab_NC(info);
		else if (nc == RsltGrTable) doRsltGr_NC(info);
		else if (nc == RsltGiTable) doRsltGi_NC(info);
		else if (nc == RsltAprvJudgTable) doRsltAprvJudg_NC(info);
		else if (nc == Cnd_dupl_abl_flg) doCnd_dupl_abl_flg_NC(info);
		else if (nc == Cnd_not_mng_flg) doCnd_not_mng_flg_NC(info);
		else if (nc == Cnd_ver_flg) doCnd_ver_flg_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_bp_lot_no) doCnd_bp_lot_no_NC(info);
		else if (nc == Cnd_bottom_layer_only_flg) doCnd_bottom_layer_only_flg_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
		else if (nc == columnRslt_bp_lot_no) doRslt_bp_lot_no_NC(info);
		else if (nc == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_NC(info);
		else if (nc == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NC(info);
		else if (nc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NC(info);
		else if (nc == columnRslt_quality_typ) doRslt_quality_typ_NC(info);
		else if (nc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NC(info);
		else if (nc == columnRslt_lot_rmrks) doRslt_lot_rmrks_NC(info);
		else if (nc == columnRslt_lot_sub_char1) doRslt_lot_sub_char1_NC(info);
		else if (nc == columnRslt_lot_sub_char2) doRslt_lot_sub_char2_NC(info);
		else if (nc == columnRslt_lot_sub_char3) doRslt_lot_sub_char3_NC(info);
		else if (nc == columnRslt_lot_sub_char4) doRslt_lot_sub_char4_NC(info);
		else if (nc == columnRslt_lot_sub_char5) doRslt_lot_sub_char5_NC(info);
		else if (nc == columnRslt_lot_sub_num1) doRslt_lot_sub_num1_NC(info);
		else if (nc == columnRslt_lot_sub_num2) doRslt_lot_sub_num2_NC(info);
		else if (nc == columnRslt_lot_sub_num3) doRslt_lot_sub_num3_NC(info);
		else if (nc == columnRslt_lot_sub_num4) doRslt_lot_sub_num4_NC(info);
		else if (nc == columnRslt_lot_sub_num5) doRslt_lot_sub_num5_NC(info);
		else if (nc == columnRslt_lot_sub_dt1) doRslt_lot_sub_dt1_NC(info);
		else if (nc == columnRslt_lot_sub_dt2) doRslt_lot_sub_dt2_NC(info);
		else if (nc == columnRslt_lot_sub_dt3) doRslt_lot_sub_dt3_NC(info);
		else if (nc == columnRslt_lot_sub_dt4) doRslt_lot_sub_dt4_NC(info);
		else if (nc == columnRslt_lot_sub_dt5) doRslt_lot_sub_dt5_NC(info);
		else if (nc == columnRslt_lot_sub_flg1) doRslt_lot_sub_flg1_NC(info);
		else if (nc == columnRslt_lot_sub_flg2) doRslt_lot_sub_flg2_NC(info);
		else if (nc == columnRslt_lot_sub_flg3) doRslt_lot_sub_flg3_NC(info);
		else if (nc == columnRslt_lot_sub_flg4) doRslt_lot_sub_flg4_NC(info);
		else if (nc == columnRslt_lot_sub_flg5) doRslt_lot_sub_flg5_NC(info);
		else if (nc == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NC(info);
		else if (nc == columnRslt_lot_mng_typ_nm) doRslt_lot_mng_typ_nm_NC(info);
		else if (nc == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NC(info);
		else if (nc == columnRslt_sublot_mng_typ_nm) doRslt_sublot_mng_typ_nm_NC(info);
		else if (nc == columnRslt_par_lot_no) doRslt_par_lot_no_NC(info);
		else if (nc == columnRslt_par_sublot_no) doRslt_par_sublot_no_NC(info);
		else if (nc == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_NC(info);
		else if (nc == columnRslt_stk_mng_typ_nm) doRslt_stk_mng_typ_nm_NC(info);
		else if (nc == columnRsltGr_itm_mfg_inst_no) doRsltGr_itm_mfg_inst_no_NC(info);
		else if (nc == columnRsltGr_stk_xfr_act_no) doRsltGr_stk_xfr_act_no_NC(info);
		else if (nc == columnRsltGr_mfg_act_no) doRsltGr_mfg_act_no_NC(info);
		else if (nc == columnRsltGr_trd_ptn_typ) doRsltGr_trd_ptn_typ_NC(info);
		else if (nc == columnRsltGr_trd_ptn_typ_nm) doRsltGr_trd_ptn_typ_nm_NC(info);
		else if (nc == columnRsltGr_io_act_typ) doRsltGr_io_act_typ_NC(info);
		else if (nc == columnRsltGr_io_act_typ_nm) doRsltGr_io_act_typ_nm_NC(info);
		else if (nc == columnRsltGr_slip_no) doRsltGr_slip_no_NC(info);
		else if (nc == columnRsltGr_io_schd_typ) doRsltGr_io_schd_typ_NC(info);
		else if (nc == columnRsltGr_io_schd_typ_nm) doRsltGr_io_schd_typ_nm_NC(info);
		else if (nc == columnRsltGr_io_schd_sts_typ) doRsltGr_io_schd_sts_typ_NC(info);
		else if (nc == columnRsltGr_io_schd_sts_typ_nm) doRsltGr_io_schd_sts_typ_nm_NC(info);
		else if (nc == columnRsltGr_slip_schd_no) doRsltGr_slip_schd_no_NC(info);
		else if (nc == columnRsltGr_lot_no) doRsltGr_lot_no_NC(info);
		else if (nc == columnRsltGr_sublot_no) doRsltGr_sublot_no_NC(info);
		else if (nc == columnRsltGr_base_unit_cd) doRsltGr_base_unit_cd_NC(info);
		else if (nc == columnRsltGr_base_unit_nm) doRsltGr_base_unit_nm_NC(info);
		else if (nc == columnRsltGr_base_dec_place) doRsltGr_base_dec_place_NC(info);
		else if (nc == columnRsltGr_schd_dt) doRsltGr_schd_dt_NC(info);
		else if (nc == columnRsltGr_act_dt) doRsltGr_act_dt_NC(info);
		else if (nc == columnRsltGr_mfg_loc_cd) doRsltGr_mfg_loc_cd_NC(info);
		else if (nc == columnRsltGr_mfg_loc_nm) doRsltGr_mfg_loc_nm_NC(info);
		else if (nc == columnRsltGr_strg_loc_cd) doRsltGr_strg_loc_cd_NC(info);
		else if (nc == columnRsltGr_strg_loc_nm) doRsltGr_strg_loc_nm_NC(info);
		else if (nc == columnRsltGr_sppl_cd) doRsltGr_sppl_cd_NC(info);
		else if (nc == columnRsltGr_sppl_nm) doRsltGr_sppl_nm_NC(info);
		else if (nc == columnRsltGr_schd_act_typ) doRsltGr_schd_act_typ_NC(info);
		else if (nc == columnRsltGr_schd_act_typ_nm) doRsltGr_schd_act_typ_nm_NC(info);
		else if (nc == columnRsltGr_lot_rmrks) doRsltGr_lot_rmrks_NC(info);
		else if (nc == columnRsltGr_sub_char1) doRsltGr_sub_char1_NC(info);
		else if (nc == columnRsltGr_sub_char2) doRsltGr_sub_char2_NC(info);
		else if (nc == columnRsltGr_sub_char3) doRsltGr_sub_char3_NC(info);
		else if (nc == columnRsltGr_ins_usr_id) doRsltGr_ins_usr_id_NC(info);
		else if (nc == columnRsltGr_ins_usr_nm) doRsltGr_ins_usr_nm_NC(info);
		else if (nc == columnRsltGr_ins_func_id) doRsltGr_ins_func_id_NC(info);
		else if (nc == columnRsltGr_ins_func_nm) doRsltGr_ins_func_nm_NC(info);
		else if (nc == columnRsltGr_ins_ts) doRsltGr_ins_ts_NC(info);
		else if (nc == columnRsltGr_upd_usr_id) doRsltGr_upd_usr_id_NC(info);
		else if (nc == columnRsltGr_upd_usr_nm) doRsltGr_upd_usr_nm_NC(info);
		else if (nc == columnRsltGr_upd_func_id) doRsltGr_upd_func_id_NC(info);
		else if (nc == columnRsltGr_upd_func_nm) doRsltGr_upd_func_nm_NC(info);
		else if (nc == columnRsltGr_upd_ts) doRsltGr_upd_ts_NC(info);
		else if (nc == columnRsltGr_upd_srv_req_no) doRsltGr_upd_srv_req_no_NC(info);
		else if (nc == columnRsltGi_itm_mfg_inst_no) doRsltGi_itm_mfg_inst_no_NC(info);
		else if (nc == columnRsltGi_mfg_act_no) doRsltGi_mfg_act_no_NC(info);
		else if (nc == columnRsltGi_stk_xfr_act_no) doRsltGi_stk_xfr_act_no_NC(info);
		else if (nc == columnRsltGi_trd_ptn_typ) doRsltGi_trd_ptn_typ_NC(info);
		else if (nc == columnRsltGi_trd_ptn_typ_nm) doRsltGi_trd_ptn_typ_nm_NC(info);
		else if (nc == columnRsltGi_io_act_typ) doRsltGi_io_act_typ_NC(info);
		else if (nc == columnRsltGi_io_act_typ_nm) doRsltGi_io_act_typ_nm_NC(info);
		else if (nc == columnRsltGi_slip_no) doRsltGi_slip_no_NC(info);
		else if (nc == columnRsltGi_io_schd_typ) doRsltGi_io_schd_typ_NC(info);
		else if (nc == columnRsltGi_io_schd_typ_nm) doRsltGi_io_schd_typ_nm_NC(info);
		else if (nc == columnRsltGi_io_schd_sts_typ) doRsltGi_io_schd_sts_typ_NC(info);
		else if (nc == columnRsltGi_io_schd_sts_typ_nm) doRsltGi_io_schd_sts_typ_nm_NC(info);
		else if (nc == columnRsltGi_slip_schd_no) doRsltGi_slip_schd_no_NC(info);
		else if (nc == columnRsltGi_lot_no) doRsltGi_lot_no_NC(info);
		else if (nc == columnRsltGi_sublot_no) doRsltGi_sublot_no_NC(info);
		else if (nc == columnRsltGi_base_unit_cd) doRsltGi_base_unit_cd_NC(info);
		else if (nc == columnRsltGi_base_unit_nm) doRsltGi_base_unit_nm_NC(info);
		else if (nc == columnRsltGi_base_dec_place) doRsltGi_base_dec_place_NC(info);
		else if (nc == columnRsltGi_schd_dt) doRsltGi_schd_dt_NC(info);
		else if (nc == columnRsltGi_act_dt) doRsltGi_act_dt_NC(info);
		else if (nc == columnRsltGi_par_lot_no) doRsltGi_par_lot_no_NC(info);
		else if (nc == columnRsltGi_par_sublot_no) doRsltGi_par_sublot_no_NC(info);
		else if (nc == columnRsltGi_schd_act_typ) doRsltGi_schd_act_typ_NC(info);
		else if (nc == columnRsltGi_schd_act_typ_nm) doRsltGi_schd_act_typ_nm_NC(info);
		else if (nc == columnRsltGi_loc_cd) doRsltGi_loc_cd_NC(info);
		else if (nc == columnRsltGi_loc_nm) doRsltGi_loc_nm_NC(info);
		else if (nc == columnRsltGi_dlv_cd) doRsltGi_dlv_cd_NC(info);
		else if (nc == columnRsltGi_dlv_nm) doRsltGi_dlv_nm_NC(info);
		else if (nc == columnRsltGi_tdlv_cd) doRsltGi_tdlv_cd_NC(info);
		else if (nc == columnRsltGi_tdlv_nm) doRsltGi_tdlv_nm_NC(info);
		else if (nc == columnRsltGi_lot_rmrks) doRsltGi_lot_rmrks_NC(info);
		else if (nc == columnRsltGi_sub_char1) doRsltGi_sub_char1_NC(info);
		else if (nc == columnRsltGi_sub_char2) doRsltGi_sub_char2_NC(info);
		else if (nc == columnRsltGi_sub_char3) doRsltGi_sub_char3_NC(info);
		else if (nc == columnRsltGi_ins_usr_id) doRsltGi_ins_usr_id_NC(info);
		else if (nc == columnRsltGi_ins_usr_nm) doRsltGi_ins_usr_nm_NC(info);
		else if (nc == columnRsltGi_ins_func_id) doRsltGi_ins_func_id_NC(info);
		else if (nc == columnRsltGi_ins_func_nm) doRsltGi_ins_func_nm_NC(info);
		else if (nc == columnRsltGi_ins_ts) doRsltGi_ins_ts_NC(info);
		else if (nc == columnRsltGi_upd_usr_id) doRsltGi_upd_usr_id_NC(info);
		else if (nc == columnRsltGi_upd_usr_nm) doRsltGi_upd_usr_nm_NC(info);
		else if (nc == columnRsltGi_upd_func_id) doRsltGi_upd_func_id_NC(info);
		else if (nc == columnRsltGi_upd_func_nm) doRsltGi_upd_func_nm_NC(info);
		else if (nc == columnRsltGi_upd_ts) doRsltGi_upd_ts_NC(info);
		else if (nc == columnRsltGi_upd_srv_req_no) doRsltGi_upd_srv_req_no_NC(info);
		else if (nc == columnRsltAprvJudg_ntfy_nm) doRsltAprvJudg_ntfy_nm_NC(info);
		else if (nc == columnRsltAprvJudg_lot_no) doRsltAprvJudg_lot_no_NC(info);
		else if (nc == columnRsltAprvJudg_sublot_no) doRsltAprvJudg_sublot_no_NC(info);
		else if (nc == columnRsltAprvJudg_mfg_aprv_sts_typ) doRsltAprvJudg_mfg_aprv_sts_typ_NC(info);
		else if (nc == columnRsltAprvJudg_mfg_aprv_sts_typ_nm) doRsltAprvJudg_mfg_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRsltAprvJudg_mfg_aprv_dt) doRsltAprvJudg_mfg_aprv_dt_NC(info);
		else if (nc == columnRsltAprvJudg_yield_base_unit_qty) doRsltAprvJudg_yield_base_unit_qty_NC(info);
		else if (nc == columnRsltAprvJudg_yield_base_unit_cd) doRsltAprvJudg_yield_base_unit_cd_NC(info);
		else if (nc == columnRsltAprvJudg_yield_base_unit_nm) doRsltAprvJudg_yield_base_unit_nm_NC(info);
		else if (nc == columnRsltAprvJudg_insp_aprv_sts_typ) doRsltAprvJudg_insp_aprv_sts_typ_NC(info);
		else if (nc == columnRsltAprvJudg_insp_aprv_sts_typ_nm) doRsltAprvJudg_insp_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRsltAprvJudg_insp_judg_dt) doRsltAprvJudg_insp_judg_dt_NC(info);
		else if (nc == columnRsltAprvJudg_insp_good_qty) doRsltAprvJudg_insp_good_qty_NC(info);
		else if (nc == columnRsltAprvJudg_insp_base_unit_cd) doRsltAprvJudg_insp_base_unit_cd_NC(info);
		else if (nc == columnRsltAprvJudg_insp_base_unit_nm) doRsltAprvJudg_insp_base_unit_nm_NC(info);
		else if (nc == columnRsltAprvJudg_insp_judg_rslt_typ) doRsltAprvJudg_insp_judg_rslt_typ_NC(info);
		else if (nc == columnRsltAprvJudg_insp_judg_rslt_typ_nm) doRsltAprvJudg_insp_judg_rslt_typ_nm_NC(info);
		else if (nc == columnRsltAprvJudg_plnt_aprv_sts_typ) doRsltAprvJudg_plnt_aprv_sts_typ_NC(info);
		else if (nc == columnRsltAprvJudg_plnt_aprv_sts_typ_nm) doRsltAprvJudg_plnt_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRsltAprvJudg_plnt_aprv_dt) doRsltAprvJudg_plnt_aprv_dt_NC(info);
		else if (nc == columnRsltAprvJudg_plnt_base_unit_qty) doRsltAprvJudg_plnt_base_unit_qty_NC(info);
		else if (nc == columnRsltAprvJudg_plnt_base_unit_cd) doRsltAprvJudg_plnt_base_unit_cd_NC(info);
		else if (nc == columnRsltAprvJudg_plnt_base_unit_nm) doRsltAprvJudg_plnt_base_unit_nm_NC(info);
		else if (nc == columnRsltAprvJudg_mrkt_judg_sts_typ) doRsltAprvJudg_mrkt_judg_sts_typ_NC(info);
		else if (nc == columnRsltAprvJudg_mrkt_judg_sts_typ_nm) doRsltAprvJudg_mrkt_judg_sts_typ_nm_NC(info);
		else if (nc == columnRsltAprvJudg_mrkt_judg_dt) doRsltAprvJudg_mrkt_judg_dt_NC(info);
		else if (nc == columnRsltAprvJudg_mrkt_base_unit_qty) doRsltAprvJudg_mrkt_base_unit_qty_NC(info);
		else if (nc == columnRsltAprvJudg_mrkt_base_unit_cd) doRsltAprvJudg_mrkt_base_unit_cd_NC(info);
		else if (nc == columnRsltAprvJudg_mrkt_base_unit_nm) doRsltAprvJudg_mrkt_base_unit_nm_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [RsltBtmTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltBtmTab_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dupl_abl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dupl_abl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_mng_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_mng_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bottom_layer_only_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bottom_layer_only_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[bp_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_num1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_num1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_num2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_num2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_num3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_num3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_num4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_num4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_num5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_num5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_dt1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_dt2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_dt3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_dt4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_dt5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_flg1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_flg1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_flg2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_flg2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_flg3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_flg3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_flg4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_flg4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_flg5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_flg5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[itm_mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_itm_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_xfr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_xfr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[mfg_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_mfg_act_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_ptn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_ptn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_act_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_act_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_act_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_act_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[slip_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_slip_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[act_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_act_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[strg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_strg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[strg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_strg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[schd_act_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_schd_act_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[schd_act_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_schd_act_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lot_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lot_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[itm_mfg_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_itm_mfg_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[mfg_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_mfg_act_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_xfr_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_xfr_act_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_ptn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_ptn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_act_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_act_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_act_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_act_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[slip_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_slip_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[act_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_act_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[par_lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_par_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[par_sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_par_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[schd_act_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_schd_act_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[schd_act_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_schd_act_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[tdlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_tdlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[tdlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_tdlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lot_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lot_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[ntfy_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_ntfy_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mfg_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mfg_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mfg_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mfg_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mfg_aprv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mfg_aprv_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[yield_base_unit_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_yield_base_unit_qty_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[yield_base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_yield_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[yield_base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_yield_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_judg_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_judg_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_good_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_good_qty_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_judg_rslt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_judg_rslt_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_judg_rslt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_judg_rslt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_aprv_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_aprv_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_base_unit_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_base_unit_qty_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_judg_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_judg_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_judg_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_judg_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_judg_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_judg_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_base_unit_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_base_unit_qty_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_base_unit_nm_NC(MCEventInfo info){
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
		else if (ne == RsltBtmTabTab) doRsltBtmTab_NE(info);
		else if (ne == RsltGrTable) doRsltGr_NE(info);
		else if (ne == RsltGiTable) doRsltGi_NE(info);
		else if (ne == RsltAprvJudgTable) doRsltAprvJudg_NE(info);
		else if (ne == Cnd_dupl_abl_flg) doCnd_dupl_abl_flg_NE(info);
		else if (ne == Cnd_not_mng_flg) doCnd_not_mng_flg_NE(info);
		else if (ne == Cnd_ver_flg) doCnd_ver_flg_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_bp_lot_no) doCnd_bp_lot_no_NE(info);
		else if (ne == Cnd_bottom_layer_only_flg) doCnd_bottom_layer_only_flg_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
		else if (ne == columnRslt_bp_lot_no) doRslt_bp_lot_no_NE(info);
		else if (ne == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_NE(info);
		else if (ne == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NE(info);
		else if (ne == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NE(info);
		else if (ne == columnRslt_quality_typ) doRslt_quality_typ_NE(info);
		else if (ne == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NE(info);
		else if (ne == columnRslt_lot_rmrks) doRslt_lot_rmrks_NE(info);
		else if (ne == columnRslt_lot_sub_char1) doRslt_lot_sub_char1_NE(info);
		else if (ne == columnRslt_lot_sub_char2) doRslt_lot_sub_char2_NE(info);
		else if (ne == columnRslt_lot_sub_char3) doRslt_lot_sub_char3_NE(info);
		else if (ne == columnRslt_lot_sub_char4) doRslt_lot_sub_char4_NE(info);
		else if (ne == columnRslt_lot_sub_char5) doRslt_lot_sub_char5_NE(info);
		else if (ne == columnRslt_lot_sub_num1) doRslt_lot_sub_num1_NE(info);
		else if (ne == columnRslt_lot_sub_num2) doRslt_lot_sub_num2_NE(info);
		else if (ne == columnRslt_lot_sub_num3) doRslt_lot_sub_num3_NE(info);
		else if (ne == columnRslt_lot_sub_num4) doRslt_lot_sub_num4_NE(info);
		else if (ne == columnRslt_lot_sub_num5) doRslt_lot_sub_num5_NE(info);
		else if (ne == columnRslt_lot_sub_dt1) doRslt_lot_sub_dt1_NE(info);
		else if (ne == columnRslt_lot_sub_dt2) doRslt_lot_sub_dt2_NE(info);
		else if (ne == columnRslt_lot_sub_dt3) doRslt_lot_sub_dt3_NE(info);
		else if (ne == columnRslt_lot_sub_dt4) doRslt_lot_sub_dt4_NE(info);
		else if (ne == columnRslt_lot_sub_dt5) doRslt_lot_sub_dt5_NE(info);
		else if (ne == columnRslt_lot_sub_flg1) doRslt_lot_sub_flg1_NE(info);
		else if (ne == columnRslt_lot_sub_flg2) doRslt_lot_sub_flg2_NE(info);
		else if (ne == columnRslt_lot_sub_flg3) doRslt_lot_sub_flg3_NE(info);
		else if (ne == columnRslt_lot_sub_flg4) doRslt_lot_sub_flg4_NE(info);
		else if (ne == columnRslt_lot_sub_flg5) doRslt_lot_sub_flg5_NE(info);
		else if (ne == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NE(info);
		else if (ne == columnRslt_lot_mng_typ_nm) doRslt_lot_mng_typ_nm_NE(info);
		else if (ne == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NE(info);
		else if (ne == columnRslt_sublot_mng_typ_nm) doRslt_sublot_mng_typ_nm_NE(info);
		else if (ne == columnRslt_par_lot_no) doRslt_par_lot_no_NE(info);
		else if (ne == columnRslt_par_sublot_no) doRslt_par_sublot_no_NE(info);
		else if (ne == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_NE(info);
		else if (ne == columnRslt_stk_mng_typ_nm) doRslt_stk_mng_typ_nm_NE(info);
		else if (ne == columnRsltGr_itm_mfg_inst_no) doRsltGr_itm_mfg_inst_no_NE(info);
		else if (ne == columnRsltGr_stk_xfr_act_no) doRsltGr_stk_xfr_act_no_NE(info);
		else if (ne == columnRsltGr_mfg_act_no) doRsltGr_mfg_act_no_NE(info);
		else if (ne == columnRsltGr_trd_ptn_typ) doRsltGr_trd_ptn_typ_NE(info);
		else if (ne == columnRsltGr_trd_ptn_typ_nm) doRsltGr_trd_ptn_typ_nm_NE(info);
		else if (ne == columnRsltGr_io_act_typ) doRsltGr_io_act_typ_NE(info);
		else if (ne == columnRsltGr_io_act_typ_nm) doRsltGr_io_act_typ_nm_NE(info);
		else if (ne == columnRsltGr_slip_no) doRsltGr_slip_no_NE(info);
		else if (ne == columnRsltGr_io_schd_typ) doRsltGr_io_schd_typ_NE(info);
		else if (ne == columnRsltGr_io_schd_typ_nm) doRsltGr_io_schd_typ_nm_NE(info);
		else if (ne == columnRsltGr_io_schd_sts_typ) doRsltGr_io_schd_sts_typ_NE(info);
		else if (ne == columnRsltGr_io_schd_sts_typ_nm) doRsltGr_io_schd_sts_typ_nm_NE(info);
		else if (ne == columnRsltGr_slip_schd_no) doRsltGr_slip_schd_no_NE(info);
		else if (ne == columnRsltGr_lot_no) doRsltGr_lot_no_NE(info);
		else if (ne == columnRsltGr_sublot_no) doRsltGr_sublot_no_NE(info);
		else if (ne == columnRsltGr_base_unit_cd) doRsltGr_base_unit_cd_NE(info);
		else if (ne == columnRsltGr_base_unit_nm) doRsltGr_base_unit_nm_NE(info);
		else if (ne == columnRsltGr_base_dec_place) doRsltGr_base_dec_place_NE(info);
		else if (ne == columnRsltGr_schd_dt) doRsltGr_schd_dt_NE(info);
		else if (ne == columnRsltGr_act_dt) doRsltGr_act_dt_NE(info);
		else if (ne == columnRsltGr_mfg_loc_cd) doRsltGr_mfg_loc_cd_NE(info);
		else if (ne == columnRsltGr_mfg_loc_nm) doRsltGr_mfg_loc_nm_NE(info);
		else if (ne == columnRsltGr_strg_loc_cd) doRsltGr_strg_loc_cd_NE(info);
		else if (ne == columnRsltGr_strg_loc_nm) doRsltGr_strg_loc_nm_NE(info);
		else if (ne == columnRsltGr_sppl_cd) doRsltGr_sppl_cd_NE(info);
		else if (ne == columnRsltGr_sppl_nm) doRsltGr_sppl_nm_NE(info);
		else if (ne == columnRsltGr_schd_act_typ) doRsltGr_schd_act_typ_NE(info);
		else if (ne == columnRsltGr_schd_act_typ_nm) doRsltGr_schd_act_typ_nm_NE(info);
		else if (ne == columnRsltGr_lot_rmrks) doRsltGr_lot_rmrks_NE(info);
		else if (ne == columnRsltGr_sub_char1) doRsltGr_sub_char1_NE(info);
		else if (ne == columnRsltGr_sub_char2) doRsltGr_sub_char2_NE(info);
		else if (ne == columnRsltGr_sub_char3) doRsltGr_sub_char3_NE(info);
		else if (ne == columnRsltGr_ins_usr_id) doRsltGr_ins_usr_id_NE(info);
		else if (ne == columnRsltGr_ins_usr_nm) doRsltGr_ins_usr_nm_NE(info);
		else if (ne == columnRsltGr_ins_func_id) doRsltGr_ins_func_id_NE(info);
		else if (ne == columnRsltGr_ins_func_nm) doRsltGr_ins_func_nm_NE(info);
		else if (ne == columnRsltGr_ins_ts) doRsltGr_ins_ts_NE(info);
		else if (ne == columnRsltGr_upd_usr_id) doRsltGr_upd_usr_id_NE(info);
		else if (ne == columnRsltGr_upd_usr_nm) doRsltGr_upd_usr_nm_NE(info);
		else if (ne == columnRsltGr_upd_func_id) doRsltGr_upd_func_id_NE(info);
		else if (ne == columnRsltGr_upd_func_nm) doRsltGr_upd_func_nm_NE(info);
		else if (ne == columnRsltGr_upd_ts) doRsltGr_upd_ts_NE(info);
		else if (ne == columnRsltGr_upd_srv_req_no) doRsltGr_upd_srv_req_no_NE(info);
		else if (ne == columnRsltGi_itm_mfg_inst_no) doRsltGi_itm_mfg_inst_no_NE(info);
		else if (ne == columnRsltGi_mfg_act_no) doRsltGi_mfg_act_no_NE(info);
		else if (ne == columnRsltGi_stk_xfr_act_no) doRsltGi_stk_xfr_act_no_NE(info);
		else if (ne == columnRsltGi_trd_ptn_typ) doRsltGi_trd_ptn_typ_NE(info);
		else if (ne == columnRsltGi_trd_ptn_typ_nm) doRsltGi_trd_ptn_typ_nm_NE(info);
		else if (ne == columnRsltGi_io_act_typ) doRsltGi_io_act_typ_NE(info);
		else if (ne == columnRsltGi_io_act_typ_nm) doRsltGi_io_act_typ_nm_NE(info);
		else if (ne == columnRsltGi_slip_no) doRsltGi_slip_no_NE(info);
		else if (ne == columnRsltGi_io_schd_typ) doRsltGi_io_schd_typ_NE(info);
		else if (ne == columnRsltGi_io_schd_typ_nm) doRsltGi_io_schd_typ_nm_NE(info);
		else if (ne == columnRsltGi_io_schd_sts_typ) doRsltGi_io_schd_sts_typ_NE(info);
		else if (ne == columnRsltGi_io_schd_sts_typ_nm) doRsltGi_io_schd_sts_typ_nm_NE(info);
		else if (ne == columnRsltGi_slip_schd_no) doRsltGi_slip_schd_no_NE(info);
		else if (ne == columnRsltGi_lot_no) doRsltGi_lot_no_NE(info);
		else if (ne == columnRsltGi_sublot_no) doRsltGi_sublot_no_NE(info);
		else if (ne == columnRsltGi_base_unit_cd) doRsltGi_base_unit_cd_NE(info);
		else if (ne == columnRsltGi_base_unit_nm) doRsltGi_base_unit_nm_NE(info);
		else if (ne == columnRsltGi_base_dec_place) doRsltGi_base_dec_place_NE(info);
		else if (ne == columnRsltGi_schd_dt) doRsltGi_schd_dt_NE(info);
		else if (ne == columnRsltGi_act_dt) doRsltGi_act_dt_NE(info);
		else if (ne == columnRsltGi_par_lot_no) doRsltGi_par_lot_no_NE(info);
		else if (ne == columnRsltGi_par_sublot_no) doRsltGi_par_sublot_no_NE(info);
		else if (ne == columnRsltGi_schd_act_typ) doRsltGi_schd_act_typ_NE(info);
		else if (ne == columnRsltGi_schd_act_typ_nm) doRsltGi_schd_act_typ_nm_NE(info);
		else if (ne == columnRsltGi_loc_cd) doRsltGi_loc_cd_NE(info);
		else if (ne == columnRsltGi_loc_nm) doRsltGi_loc_nm_NE(info);
		else if (ne == columnRsltGi_dlv_cd) doRsltGi_dlv_cd_NE(info);
		else if (ne == columnRsltGi_dlv_nm) doRsltGi_dlv_nm_NE(info);
		else if (ne == columnRsltGi_tdlv_cd) doRsltGi_tdlv_cd_NE(info);
		else if (ne == columnRsltGi_tdlv_nm) doRsltGi_tdlv_nm_NE(info);
		else if (ne == columnRsltGi_lot_rmrks) doRsltGi_lot_rmrks_NE(info);
		else if (ne == columnRsltGi_sub_char1) doRsltGi_sub_char1_NE(info);
		else if (ne == columnRsltGi_sub_char2) doRsltGi_sub_char2_NE(info);
		else if (ne == columnRsltGi_sub_char3) doRsltGi_sub_char3_NE(info);
		else if (ne == columnRsltGi_ins_usr_id) doRsltGi_ins_usr_id_NE(info);
		else if (ne == columnRsltGi_ins_usr_nm) doRsltGi_ins_usr_nm_NE(info);
		else if (ne == columnRsltGi_ins_func_id) doRsltGi_ins_func_id_NE(info);
		else if (ne == columnRsltGi_ins_func_nm) doRsltGi_ins_func_nm_NE(info);
		else if (ne == columnRsltGi_ins_ts) doRsltGi_ins_ts_NE(info);
		else if (ne == columnRsltGi_upd_usr_id) doRsltGi_upd_usr_id_NE(info);
		else if (ne == columnRsltGi_upd_usr_nm) doRsltGi_upd_usr_nm_NE(info);
		else if (ne == columnRsltGi_upd_func_id) doRsltGi_upd_func_id_NE(info);
		else if (ne == columnRsltGi_upd_func_nm) doRsltGi_upd_func_nm_NE(info);
		else if (ne == columnRsltGi_upd_ts) doRsltGi_upd_ts_NE(info);
		else if (ne == columnRsltGi_upd_srv_req_no) doRsltGi_upd_srv_req_no_NE(info);
		else if (ne == columnRsltAprvJudg_ntfy_nm) doRsltAprvJudg_ntfy_nm_NE(info);
		else if (ne == columnRsltAprvJudg_lot_no) doRsltAprvJudg_lot_no_NE(info);
		else if (ne == columnRsltAprvJudg_sublot_no) doRsltAprvJudg_sublot_no_NE(info);
		else if (ne == columnRsltAprvJudg_mfg_aprv_sts_typ) doRsltAprvJudg_mfg_aprv_sts_typ_NE(info);
		else if (ne == columnRsltAprvJudg_mfg_aprv_sts_typ_nm) doRsltAprvJudg_mfg_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRsltAprvJudg_mfg_aprv_dt) doRsltAprvJudg_mfg_aprv_dt_NE(info);
		else if (ne == columnRsltAprvJudg_yield_base_unit_qty) doRsltAprvJudg_yield_base_unit_qty_NE(info);
		else if (ne == columnRsltAprvJudg_yield_base_unit_cd) doRsltAprvJudg_yield_base_unit_cd_NE(info);
		else if (ne == columnRsltAprvJudg_yield_base_unit_nm) doRsltAprvJudg_yield_base_unit_nm_NE(info);
		else if (ne == columnRsltAprvJudg_insp_aprv_sts_typ) doRsltAprvJudg_insp_aprv_sts_typ_NE(info);
		else if (ne == columnRsltAprvJudg_insp_aprv_sts_typ_nm) doRsltAprvJudg_insp_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRsltAprvJudg_insp_judg_dt) doRsltAprvJudg_insp_judg_dt_NE(info);
		else if (ne == columnRsltAprvJudg_insp_good_qty) doRsltAprvJudg_insp_good_qty_NE(info);
		else if (ne == columnRsltAprvJudg_insp_base_unit_cd) doRsltAprvJudg_insp_base_unit_cd_NE(info);
		else if (ne == columnRsltAprvJudg_insp_base_unit_nm) doRsltAprvJudg_insp_base_unit_nm_NE(info);
		else if (ne == columnRsltAprvJudg_insp_judg_rslt_typ) doRsltAprvJudg_insp_judg_rslt_typ_NE(info);
		else if (ne == columnRsltAprvJudg_insp_judg_rslt_typ_nm) doRsltAprvJudg_insp_judg_rslt_typ_nm_NE(info);
		else if (ne == columnRsltAprvJudg_plnt_aprv_sts_typ) doRsltAprvJudg_plnt_aprv_sts_typ_NE(info);
		else if (ne == columnRsltAprvJudg_plnt_aprv_sts_typ_nm) doRsltAprvJudg_plnt_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRsltAprvJudg_plnt_aprv_dt) doRsltAprvJudg_plnt_aprv_dt_NE(info);
		else if (ne == columnRsltAprvJudg_plnt_base_unit_qty) doRsltAprvJudg_plnt_base_unit_qty_NE(info);
		else if (ne == columnRsltAprvJudg_plnt_base_unit_cd) doRsltAprvJudg_plnt_base_unit_cd_NE(info);
		else if (ne == columnRsltAprvJudg_plnt_base_unit_nm) doRsltAprvJudg_plnt_base_unit_nm_NE(info);
		else if (ne == columnRsltAprvJudg_mrkt_judg_sts_typ) doRsltAprvJudg_mrkt_judg_sts_typ_NE(info);
		else if (ne == columnRsltAprvJudg_mrkt_judg_sts_typ_nm) doRsltAprvJudg_mrkt_judg_sts_typ_nm_NE(info);
		else if (ne == columnRsltAprvJudg_mrkt_judg_dt) doRsltAprvJudg_mrkt_judg_dt_NE(info);
		else if (ne == columnRsltAprvJudg_mrkt_base_unit_qty) doRsltAprvJudg_mrkt_base_unit_qty_NE(info);
		else if (ne == columnRsltAprvJudg_mrkt_base_unit_cd) doRsltAprvJudg_mrkt_base_unit_cd_NE(info);
		else if (ne == columnRsltAprvJudg_mrkt_base_unit_nm) doRsltAprvJudg_mrkt_base_unit_nm_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [RsltBtmTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltBtmTab_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dupl_abl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dupl_abl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_mng_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_mng_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bottom_layer_only_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bottom_layer_only_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[bp_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_num1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_num1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_num2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_num2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_num3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_num3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_num4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_num4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_num5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_num5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_dt1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_dt2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_dt3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_dt4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_dt5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_flg1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_flg1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_flg2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_flg2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_flg3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_flg3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_flg4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_flg4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_flg5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_flg5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[itm_mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_itm_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_xfr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_xfr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[mfg_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_mfg_act_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_ptn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_ptn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_act_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_act_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_act_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_act_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[slip_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_slip_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[act_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_act_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[strg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_strg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[strg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_strg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[schd_act_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_schd_act_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[schd_act_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_schd_act_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lot_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lot_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[itm_mfg_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_itm_mfg_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[mfg_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_mfg_act_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_xfr_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_xfr_act_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_ptn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_ptn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_act_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_act_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_act_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_act_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[slip_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_slip_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[act_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_act_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[par_lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_par_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[par_sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_par_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[schd_act_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_schd_act_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[schd_act_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_schd_act_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[tdlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_tdlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[tdlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_tdlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lot_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lot_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[ntfy_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_ntfy_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mfg_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mfg_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mfg_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mfg_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mfg_aprv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mfg_aprv_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[yield_base_unit_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_yield_base_unit_qty_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[yield_base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_yield_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[yield_base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_yield_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_judg_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_judg_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_good_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_good_qty_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_judg_rslt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_judg_rslt_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_judg_rslt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_judg_rslt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_aprv_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_aprv_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_base_unit_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_base_unit_qty_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_judg_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_judg_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_judg_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_judg_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_judg_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_judg_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_base_unit_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_base_unit_qty_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_base_unit_nm_NE(MCEventInfo info){
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
		else if (nx == RsltBtmTabTab) doRsltBtmTab_NX(info);
		else if (nx == RsltGrTable) doRsltGr_NX(info);
		else if (nx == RsltGiTable) doRsltGi_NX(info);
		else if (nx == RsltAprvJudgTable) doRsltAprvJudg_NX(info);
		else if (nx == Cnd_dupl_abl_flg) doCnd_dupl_abl_flg_NX(info);
		else if (nx == Cnd_not_mng_flg) doCnd_not_mng_flg_NX(info);
		else if (nx == Cnd_ver_flg) doCnd_ver_flg_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_bp_lot_no) doCnd_bp_lot_no_NX(info);
		else if (nx == Cnd_bottom_layer_only_flg) doCnd_bottom_layer_only_flg_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
		else if (nx == columnRslt_bp_lot_no) doRslt_bp_lot_no_NX(info);
		else if (nx == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_NX(info);
		else if (nx == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NX(info);
		else if (nx == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NX(info);
		else if (nx == columnRslt_quality_typ) doRslt_quality_typ_NX(info);
		else if (nx == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NX(info);
		else if (nx == columnRslt_lot_rmrks) doRslt_lot_rmrks_NX(info);
		else if (nx == columnRslt_lot_sub_char1) doRslt_lot_sub_char1_NX(info);
		else if (nx == columnRslt_lot_sub_char2) doRslt_lot_sub_char2_NX(info);
		else if (nx == columnRslt_lot_sub_char3) doRslt_lot_sub_char3_NX(info);
		else if (nx == columnRslt_lot_sub_char4) doRslt_lot_sub_char4_NX(info);
		else if (nx == columnRslt_lot_sub_char5) doRslt_lot_sub_char5_NX(info);
		else if (nx == columnRslt_lot_sub_num1) doRslt_lot_sub_num1_NX(info);
		else if (nx == columnRslt_lot_sub_num2) doRslt_lot_sub_num2_NX(info);
		else if (nx == columnRslt_lot_sub_num3) doRslt_lot_sub_num3_NX(info);
		else if (nx == columnRslt_lot_sub_num4) doRslt_lot_sub_num4_NX(info);
		else if (nx == columnRslt_lot_sub_num5) doRslt_lot_sub_num5_NX(info);
		else if (nx == columnRslt_lot_sub_dt1) doRslt_lot_sub_dt1_NX(info);
		else if (nx == columnRslt_lot_sub_dt2) doRslt_lot_sub_dt2_NX(info);
		else if (nx == columnRslt_lot_sub_dt3) doRslt_lot_sub_dt3_NX(info);
		else if (nx == columnRslt_lot_sub_dt4) doRslt_lot_sub_dt4_NX(info);
		else if (nx == columnRslt_lot_sub_dt5) doRslt_lot_sub_dt5_NX(info);
		else if (nx == columnRslt_lot_sub_flg1) doRslt_lot_sub_flg1_NX(info);
		else if (nx == columnRslt_lot_sub_flg2) doRslt_lot_sub_flg2_NX(info);
		else if (nx == columnRslt_lot_sub_flg3) doRslt_lot_sub_flg3_NX(info);
		else if (nx == columnRslt_lot_sub_flg4) doRslt_lot_sub_flg4_NX(info);
		else if (nx == columnRslt_lot_sub_flg5) doRslt_lot_sub_flg5_NX(info);
		else if (nx == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NX(info);
		else if (nx == columnRslt_lot_mng_typ_nm) doRslt_lot_mng_typ_nm_NX(info);
		else if (nx == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NX(info);
		else if (nx == columnRslt_sublot_mng_typ_nm) doRslt_sublot_mng_typ_nm_NX(info);
		else if (nx == columnRslt_par_lot_no) doRslt_par_lot_no_NX(info);
		else if (nx == columnRslt_par_sublot_no) doRslt_par_sublot_no_NX(info);
		else if (nx == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_NX(info);
		else if (nx == columnRslt_stk_mng_typ_nm) doRslt_stk_mng_typ_nm_NX(info);
		else if (nx == columnRsltGr_itm_mfg_inst_no) doRsltGr_itm_mfg_inst_no_NX(info);
		else if (nx == columnRsltGr_stk_xfr_act_no) doRsltGr_stk_xfr_act_no_NX(info);
		else if (nx == columnRsltGr_mfg_act_no) doRsltGr_mfg_act_no_NX(info);
		else if (nx == columnRsltGr_trd_ptn_typ) doRsltGr_trd_ptn_typ_NX(info);
		else if (nx == columnRsltGr_trd_ptn_typ_nm) doRsltGr_trd_ptn_typ_nm_NX(info);
		else if (nx == columnRsltGr_io_act_typ) doRsltGr_io_act_typ_NX(info);
		else if (nx == columnRsltGr_io_act_typ_nm) doRsltGr_io_act_typ_nm_NX(info);
		else if (nx == columnRsltGr_slip_no) doRsltGr_slip_no_NX(info);
		else if (nx == columnRsltGr_io_schd_typ) doRsltGr_io_schd_typ_NX(info);
		else if (nx == columnRsltGr_io_schd_typ_nm) doRsltGr_io_schd_typ_nm_NX(info);
		else if (nx == columnRsltGr_io_schd_sts_typ) doRsltGr_io_schd_sts_typ_NX(info);
		else if (nx == columnRsltGr_io_schd_sts_typ_nm) doRsltGr_io_schd_sts_typ_nm_NX(info);
		else if (nx == columnRsltGr_slip_schd_no) doRsltGr_slip_schd_no_NX(info);
		else if (nx == columnRsltGr_lot_no) doRsltGr_lot_no_NX(info);
		else if (nx == columnRsltGr_sublot_no) doRsltGr_sublot_no_NX(info);
		else if (nx == columnRsltGr_base_unit_cd) doRsltGr_base_unit_cd_NX(info);
		else if (nx == columnRsltGr_base_unit_nm) doRsltGr_base_unit_nm_NX(info);
		else if (nx == columnRsltGr_base_dec_place) doRsltGr_base_dec_place_NX(info);
		else if (nx == columnRsltGr_schd_dt) doRsltGr_schd_dt_NX(info);
		else if (nx == columnRsltGr_act_dt) doRsltGr_act_dt_NX(info);
		else if (nx == columnRsltGr_mfg_loc_cd) doRsltGr_mfg_loc_cd_NX(info);
		else if (nx == columnRsltGr_mfg_loc_nm) doRsltGr_mfg_loc_nm_NX(info);
		else if (nx == columnRsltGr_strg_loc_cd) doRsltGr_strg_loc_cd_NX(info);
		else if (nx == columnRsltGr_strg_loc_nm) doRsltGr_strg_loc_nm_NX(info);
		else if (nx == columnRsltGr_sppl_cd) doRsltGr_sppl_cd_NX(info);
		else if (nx == columnRsltGr_sppl_nm) doRsltGr_sppl_nm_NX(info);
		else if (nx == columnRsltGr_schd_act_typ) doRsltGr_schd_act_typ_NX(info);
		else if (nx == columnRsltGr_schd_act_typ_nm) doRsltGr_schd_act_typ_nm_NX(info);
		else if (nx == columnRsltGr_lot_rmrks) doRsltGr_lot_rmrks_NX(info);
		else if (nx == columnRsltGr_sub_char1) doRsltGr_sub_char1_NX(info);
		else if (nx == columnRsltGr_sub_char2) doRsltGr_sub_char2_NX(info);
		else if (nx == columnRsltGr_sub_char3) doRsltGr_sub_char3_NX(info);
		else if (nx == columnRsltGr_ins_usr_id) doRsltGr_ins_usr_id_NX(info);
		else if (nx == columnRsltGr_ins_usr_nm) doRsltGr_ins_usr_nm_NX(info);
		else if (nx == columnRsltGr_ins_func_id) doRsltGr_ins_func_id_NX(info);
		else if (nx == columnRsltGr_ins_func_nm) doRsltGr_ins_func_nm_NX(info);
		else if (nx == columnRsltGr_ins_ts) doRsltGr_ins_ts_NX(info);
		else if (nx == columnRsltGr_upd_usr_id) doRsltGr_upd_usr_id_NX(info);
		else if (nx == columnRsltGr_upd_usr_nm) doRsltGr_upd_usr_nm_NX(info);
		else if (nx == columnRsltGr_upd_func_id) doRsltGr_upd_func_id_NX(info);
		else if (nx == columnRsltGr_upd_func_nm) doRsltGr_upd_func_nm_NX(info);
		else if (nx == columnRsltGr_upd_ts) doRsltGr_upd_ts_NX(info);
		else if (nx == columnRsltGr_upd_srv_req_no) doRsltGr_upd_srv_req_no_NX(info);
		else if (nx == columnRsltGi_itm_mfg_inst_no) doRsltGi_itm_mfg_inst_no_NX(info);
		else if (nx == columnRsltGi_mfg_act_no) doRsltGi_mfg_act_no_NX(info);
		else if (nx == columnRsltGi_stk_xfr_act_no) doRsltGi_stk_xfr_act_no_NX(info);
		else if (nx == columnRsltGi_trd_ptn_typ) doRsltGi_trd_ptn_typ_NX(info);
		else if (nx == columnRsltGi_trd_ptn_typ_nm) doRsltGi_trd_ptn_typ_nm_NX(info);
		else if (nx == columnRsltGi_io_act_typ) doRsltGi_io_act_typ_NX(info);
		else if (nx == columnRsltGi_io_act_typ_nm) doRsltGi_io_act_typ_nm_NX(info);
		else if (nx == columnRsltGi_slip_no) doRsltGi_slip_no_NX(info);
		else if (nx == columnRsltGi_io_schd_typ) doRsltGi_io_schd_typ_NX(info);
		else if (nx == columnRsltGi_io_schd_typ_nm) doRsltGi_io_schd_typ_nm_NX(info);
		else if (nx == columnRsltGi_io_schd_sts_typ) doRsltGi_io_schd_sts_typ_NX(info);
		else if (nx == columnRsltGi_io_schd_sts_typ_nm) doRsltGi_io_schd_sts_typ_nm_NX(info);
		else if (nx == columnRsltGi_slip_schd_no) doRsltGi_slip_schd_no_NX(info);
		else if (nx == columnRsltGi_lot_no) doRsltGi_lot_no_NX(info);
		else if (nx == columnRsltGi_sublot_no) doRsltGi_sublot_no_NX(info);
		else if (nx == columnRsltGi_base_unit_cd) doRsltGi_base_unit_cd_NX(info);
		else if (nx == columnRsltGi_base_unit_nm) doRsltGi_base_unit_nm_NX(info);
		else if (nx == columnRsltGi_base_dec_place) doRsltGi_base_dec_place_NX(info);
		else if (nx == columnRsltGi_schd_dt) doRsltGi_schd_dt_NX(info);
		else if (nx == columnRsltGi_act_dt) doRsltGi_act_dt_NX(info);
		else if (nx == columnRsltGi_par_lot_no) doRsltGi_par_lot_no_NX(info);
		else if (nx == columnRsltGi_par_sublot_no) doRsltGi_par_sublot_no_NX(info);
		else if (nx == columnRsltGi_schd_act_typ) doRsltGi_schd_act_typ_NX(info);
		else if (nx == columnRsltGi_schd_act_typ_nm) doRsltGi_schd_act_typ_nm_NX(info);
		else if (nx == columnRsltGi_loc_cd) doRsltGi_loc_cd_NX(info);
		else if (nx == columnRsltGi_loc_nm) doRsltGi_loc_nm_NX(info);
		else if (nx == columnRsltGi_dlv_cd) doRsltGi_dlv_cd_NX(info);
		else if (nx == columnRsltGi_dlv_nm) doRsltGi_dlv_nm_NX(info);
		else if (nx == columnRsltGi_tdlv_cd) doRsltGi_tdlv_cd_NX(info);
		else if (nx == columnRsltGi_tdlv_nm) doRsltGi_tdlv_nm_NX(info);
		else if (nx == columnRsltGi_lot_rmrks) doRsltGi_lot_rmrks_NX(info);
		else if (nx == columnRsltGi_sub_char1) doRsltGi_sub_char1_NX(info);
		else if (nx == columnRsltGi_sub_char2) doRsltGi_sub_char2_NX(info);
		else if (nx == columnRsltGi_sub_char3) doRsltGi_sub_char3_NX(info);
		else if (nx == columnRsltGi_ins_usr_id) doRsltGi_ins_usr_id_NX(info);
		else if (nx == columnRsltGi_ins_usr_nm) doRsltGi_ins_usr_nm_NX(info);
		else if (nx == columnRsltGi_ins_func_id) doRsltGi_ins_func_id_NX(info);
		else if (nx == columnRsltGi_ins_func_nm) doRsltGi_ins_func_nm_NX(info);
		else if (nx == columnRsltGi_ins_ts) doRsltGi_ins_ts_NX(info);
		else if (nx == columnRsltGi_upd_usr_id) doRsltGi_upd_usr_id_NX(info);
		else if (nx == columnRsltGi_upd_usr_nm) doRsltGi_upd_usr_nm_NX(info);
		else if (nx == columnRsltGi_upd_func_id) doRsltGi_upd_func_id_NX(info);
		else if (nx == columnRsltGi_upd_func_nm) doRsltGi_upd_func_nm_NX(info);
		else if (nx == columnRsltGi_upd_ts) doRsltGi_upd_ts_NX(info);
		else if (nx == columnRsltGi_upd_srv_req_no) doRsltGi_upd_srv_req_no_NX(info);
		else if (nx == columnRsltAprvJudg_ntfy_nm) doRsltAprvJudg_ntfy_nm_NX(info);
		else if (nx == columnRsltAprvJudg_lot_no) doRsltAprvJudg_lot_no_NX(info);
		else if (nx == columnRsltAprvJudg_sublot_no) doRsltAprvJudg_sublot_no_NX(info);
		else if (nx == columnRsltAprvJudg_mfg_aprv_sts_typ) doRsltAprvJudg_mfg_aprv_sts_typ_NX(info);
		else if (nx == columnRsltAprvJudg_mfg_aprv_sts_typ_nm) doRsltAprvJudg_mfg_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRsltAprvJudg_mfg_aprv_dt) doRsltAprvJudg_mfg_aprv_dt_NX(info);
		else if (nx == columnRsltAprvJudg_yield_base_unit_qty) doRsltAprvJudg_yield_base_unit_qty_NX(info);
		else if (nx == columnRsltAprvJudg_yield_base_unit_cd) doRsltAprvJudg_yield_base_unit_cd_NX(info);
		else if (nx == columnRsltAprvJudg_yield_base_unit_nm) doRsltAprvJudg_yield_base_unit_nm_NX(info);
		else if (nx == columnRsltAprvJudg_insp_aprv_sts_typ) doRsltAprvJudg_insp_aprv_sts_typ_NX(info);
		else if (nx == columnRsltAprvJudg_insp_aprv_sts_typ_nm) doRsltAprvJudg_insp_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRsltAprvJudg_insp_judg_dt) doRsltAprvJudg_insp_judg_dt_NX(info);
		else if (nx == columnRsltAprvJudg_insp_good_qty) doRsltAprvJudg_insp_good_qty_NX(info);
		else if (nx == columnRsltAprvJudg_insp_base_unit_cd) doRsltAprvJudg_insp_base_unit_cd_NX(info);
		else if (nx == columnRsltAprvJudg_insp_base_unit_nm) doRsltAprvJudg_insp_base_unit_nm_NX(info);
		else if (nx == columnRsltAprvJudg_insp_judg_rslt_typ) doRsltAprvJudg_insp_judg_rslt_typ_NX(info);
		else if (nx == columnRsltAprvJudg_insp_judg_rslt_typ_nm) doRsltAprvJudg_insp_judg_rslt_typ_nm_NX(info);
		else if (nx == columnRsltAprvJudg_plnt_aprv_sts_typ) doRsltAprvJudg_plnt_aprv_sts_typ_NX(info);
		else if (nx == columnRsltAprvJudg_plnt_aprv_sts_typ_nm) doRsltAprvJudg_plnt_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRsltAprvJudg_plnt_aprv_dt) doRsltAprvJudg_plnt_aprv_dt_NX(info);
		else if (nx == columnRsltAprvJudg_plnt_base_unit_qty) doRsltAprvJudg_plnt_base_unit_qty_NX(info);
		else if (nx == columnRsltAprvJudg_plnt_base_unit_cd) doRsltAprvJudg_plnt_base_unit_cd_NX(info);
		else if (nx == columnRsltAprvJudg_plnt_base_unit_nm) doRsltAprvJudg_plnt_base_unit_nm_NX(info);
		else if (nx == columnRsltAprvJudg_mrkt_judg_sts_typ) doRsltAprvJudg_mrkt_judg_sts_typ_NX(info);
		else if (nx == columnRsltAprvJudg_mrkt_judg_sts_typ_nm) doRsltAprvJudg_mrkt_judg_sts_typ_nm_NX(info);
		else if (nx == columnRsltAprvJudg_mrkt_judg_dt) doRsltAprvJudg_mrkt_judg_dt_NX(info);
		else if (nx == columnRsltAprvJudg_mrkt_base_unit_qty) doRsltAprvJudg_mrkt_base_unit_qty_NX(info);
		else if (nx == columnRsltAprvJudg_mrkt_base_unit_cd) doRsltAprvJudg_mrkt_base_unit_cd_NX(info);
		else if (nx == columnRsltAprvJudg_mrkt_base_unit_nm) doRsltAprvJudg_mrkt_base_unit_nm_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [RsltBtmTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltBtmTab_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dupl_abl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dupl_abl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_mng_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_mng_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bottom_layer_only_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bottom_layer_only_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[bp_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_num1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_num1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_num2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_num2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_num3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_num3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_num4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_num4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_num5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_num5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_dt1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_dt2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_dt3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_dt4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_dt5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_flg1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_flg1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_flg2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_flg2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_flg3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_flg3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_flg4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_flg4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_flg5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_flg5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[itm_mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_itm_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_xfr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_xfr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[mfg_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_mfg_act_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_ptn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_ptn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_act_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_act_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_act_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_act_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[slip_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_slip_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[act_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_act_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[strg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_strg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[strg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_strg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[schd_act_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_schd_act_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[schd_act_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_schd_act_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lot_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lot_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[itm_mfg_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_itm_mfg_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[mfg_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_mfg_act_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_xfr_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_xfr_act_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_ptn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_ptn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_act_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_act_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_act_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_act_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[slip_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_slip_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[act_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_act_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[par_lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_par_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[par_sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_par_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[schd_act_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_schd_act_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[schd_act_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_schd_act_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[tdlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_tdlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[tdlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_tdlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lot_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lot_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[ntfy_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_ntfy_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mfg_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mfg_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mfg_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mfg_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mfg_aprv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mfg_aprv_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[yield_base_unit_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_yield_base_unit_qty_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[yield_base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_yield_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[yield_base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_yield_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_judg_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_judg_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_good_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_good_qty_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_judg_rslt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_judg_rslt_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_judg_rslt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_judg_rslt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_aprv_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_aprv_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_base_unit_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_base_unit_qty_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_judg_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_judg_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_judg_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_judg_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_judg_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_judg_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_base_unit_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_base_unit_qty_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_bp_lot_no) doCnd_bp_lot_no_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
		else if (lc == columnRslt_bp_lot_no) doRslt_bp_lot_no_LC(info);
		else if (lc == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_LC(info);
		else if (lc == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_LC(info);
		else if (lc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_LC(info);
		else if (lc == columnRslt_quality_typ) doRslt_quality_typ_LC(info);
		else if (lc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_LC(info);
		else if (lc == columnRslt_lot_rmrks) doRslt_lot_rmrks_LC(info);
		else if (lc == columnRslt_lot_sub_char1) doRslt_lot_sub_char1_LC(info);
		else if (lc == columnRslt_lot_sub_char2) doRslt_lot_sub_char2_LC(info);
		else if (lc == columnRslt_lot_sub_char3) doRslt_lot_sub_char3_LC(info);
		else if (lc == columnRslt_lot_sub_char4) doRslt_lot_sub_char4_LC(info);
		else if (lc == columnRslt_lot_sub_char5) doRslt_lot_sub_char5_LC(info);
		else if (lc == columnRslt_lot_sub_num1) doRslt_lot_sub_num1_LC(info);
		else if (lc == columnRslt_lot_sub_num2) doRslt_lot_sub_num2_LC(info);
		else if (lc == columnRslt_lot_sub_num3) doRslt_lot_sub_num3_LC(info);
		else if (lc == columnRslt_lot_sub_num4) doRslt_lot_sub_num4_LC(info);
		else if (lc == columnRslt_lot_sub_num5) doRslt_lot_sub_num5_LC(info);
		else if (lc == columnRslt_lot_sub_dt1) doRslt_lot_sub_dt1_LC(info);
		else if (lc == columnRslt_lot_sub_dt2) doRslt_lot_sub_dt2_LC(info);
		else if (lc == columnRslt_lot_sub_dt3) doRslt_lot_sub_dt3_LC(info);
		else if (lc == columnRslt_lot_sub_dt4) doRslt_lot_sub_dt4_LC(info);
		else if (lc == columnRslt_lot_sub_dt5) doRslt_lot_sub_dt5_LC(info);
		else if (lc == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_LC(info);
		else if (lc == columnRslt_lot_mng_typ_nm) doRslt_lot_mng_typ_nm_LC(info);
		else if (lc == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_LC(info);
		else if (lc == columnRslt_sublot_mng_typ_nm) doRslt_sublot_mng_typ_nm_LC(info);
		else if (lc == columnRslt_par_lot_no) doRslt_par_lot_no_LC(info);
		else if (lc == columnRslt_par_sublot_no) doRslt_par_sublot_no_LC(info);
		else if (lc == columnRslt_stk_mng_typ) doRslt_stk_mng_typ_LC(info);
		else if (lc == columnRslt_stk_mng_typ_nm) doRslt_stk_mng_typ_nm_LC(info);
		else if (lc == columnRsltGr_itm_mfg_inst_no) doRsltGr_itm_mfg_inst_no_LC(info);
		else if (lc == columnRsltGr_stk_xfr_act_no) doRsltGr_stk_xfr_act_no_LC(info);
		else if (lc == columnRsltGr_mfg_act_no) doRsltGr_mfg_act_no_LC(info);
		else if (lc == columnRsltGr_trd_ptn_typ) doRsltGr_trd_ptn_typ_LC(info);
		else if (lc == columnRsltGr_trd_ptn_typ_nm) doRsltGr_trd_ptn_typ_nm_LC(info);
		else if (lc == columnRsltGr_io_act_typ) doRsltGr_io_act_typ_LC(info);
		else if (lc == columnRsltGr_io_act_typ_nm) doRsltGr_io_act_typ_nm_LC(info);
		else if (lc == columnRsltGr_slip_no) doRsltGr_slip_no_LC(info);
		else if (lc == columnRsltGr_io_schd_typ) doRsltGr_io_schd_typ_LC(info);
		else if (lc == columnRsltGr_io_schd_typ_nm) doRsltGr_io_schd_typ_nm_LC(info);
		else if (lc == columnRsltGr_io_schd_sts_typ) doRsltGr_io_schd_sts_typ_LC(info);
		else if (lc == columnRsltGr_io_schd_sts_typ_nm) doRsltGr_io_schd_sts_typ_nm_LC(info);
		else if (lc == columnRsltGr_slip_schd_no) doRsltGr_slip_schd_no_LC(info);
		else if (lc == columnRsltGr_lot_no) doRsltGr_lot_no_LC(info);
		else if (lc == columnRsltGr_sublot_no) doRsltGr_sublot_no_LC(info);
		else if (lc == columnRsltGr_base_unit_cd) doRsltGr_base_unit_cd_LC(info);
		else if (lc == columnRsltGr_base_unit_nm) doRsltGr_base_unit_nm_LC(info);
		else if (lc == columnRsltGr_base_dec_place) doRsltGr_base_dec_place_LC(info);
		else if (lc == columnRsltGr_schd_dt) doRsltGr_schd_dt_LC(info);
		else if (lc == columnRsltGr_act_dt) doRsltGr_act_dt_LC(info);
		else if (lc == columnRsltGr_mfg_loc_cd) doRsltGr_mfg_loc_cd_LC(info);
		else if (lc == columnRsltGr_mfg_loc_nm) doRsltGr_mfg_loc_nm_LC(info);
		else if (lc == columnRsltGr_strg_loc_cd) doRsltGr_strg_loc_cd_LC(info);
		else if (lc == columnRsltGr_strg_loc_nm) doRsltGr_strg_loc_nm_LC(info);
		else if (lc == columnRsltGr_sppl_cd) doRsltGr_sppl_cd_LC(info);
		else if (lc == columnRsltGr_sppl_nm) doRsltGr_sppl_nm_LC(info);
		else if (lc == columnRsltGr_schd_act_typ) doRsltGr_schd_act_typ_LC(info);
		else if (lc == columnRsltGr_schd_act_typ_nm) doRsltGr_schd_act_typ_nm_LC(info);
		else if (lc == columnRsltGr_lot_rmrks) doRsltGr_lot_rmrks_LC(info);
		else if (lc == columnRsltGr_sub_char1) doRsltGr_sub_char1_LC(info);
		else if (lc == columnRsltGr_sub_char2) doRsltGr_sub_char2_LC(info);
		else if (lc == columnRsltGr_sub_char3) doRsltGr_sub_char3_LC(info);
		else if (lc == columnRsltGr_ins_usr_id) doRsltGr_ins_usr_id_LC(info);
		else if (lc == columnRsltGr_ins_usr_nm) doRsltGr_ins_usr_nm_LC(info);
		else if (lc == columnRsltGr_ins_func_id) doRsltGr_ins_func_id_LC(info);
		else if (lc == columnRsltGr_ins_func_nm) doRsltGr_ins_func_nm_LC(info);
		else if (lc == columnRsltGr_ins_ts) doRsltGr_ins_ts_LC(info);
		else if (lc == columnRsltGr_upd_usr_id) doRsltGr_upd_usr_id_LC(info);
		else if (lc == columnRsltGr_upd_usr_nm) doRsltGr_upd_usr_nm_LC(info);
		else if (lc == columnRsltGr_upd_func_id) doRsltGr_upd_func_id_LC(info);
		else if (lc == columnRsltGr_upd_func_nm) doRsltGr_upd_func_nm_LC(info);
		else if (lc == columnRsltGr_upd_ts) doRsltGr_upd_ts_LC(info);
		else if (lc == columnRsltGr_upd_srv_req_no) doRsltGr_upd_srv_req_no_LC(info);
		else if (lc == columnRsltGi_itm_mfg_inst_no) doRsltGi_itm_mfg_inst_no_LC(info);
		else if (lc == columnRsltGi_mfg_act_no) doRsltGi_mfg_act_no_LC(info);
		else if (lc == columnRsltGi_stk_xfr_act_no) doRsltGi_stk_xfr_act_no_LC(info);
		else if (lc == columnRsltGi_trd_ptn_typ) doRsltGi_trd_ptn_typ_LC(info);
		else if (lc == columnRsltGi_trd_ptn_typ_nm) doRsltGi_trd_ptn_typ_nm_LC(info);
		else if (lc == columnRsltGi_io_act_typ) doRsltGi_io_act_typ_LC(info);
		else if (lc == columnRsltGi_io_act_typ_nm) doRsltGi_io_act_typ_nm_LC(info);
		else if (lc == columnRsltGi_slip_no) doRsltGi_slip_no_LC(info);
		else if (lc == columnRsltGi_io_schd_typ) doRsltGi_io_schd_typ_LC(info);
		else if (lc == columnRsltGi_io_schd_typ_nm) doRsltGi_io_schd_typ_nm_LC(info);
		else if (lc == columnRsltGi_io_schd_sts_typ) doRsltGi_io_schd_sts_typ_LC(info);
		else if (lc == columnRsltGi_io_schd_sts_typ_nm) doRsltGi_io_schd_sts_typ_nm_LC(info);
		else if (lc == columnRsltGi_slip_schd_no) doRsltGi_slip_schd_no_LC(info);
		else if (lc == columnRsltGi_lot_no) doRsltGi_lot_no_LC(info);
		else if (lc == columnRsltGi_sublot_no) doRsltGi_sublot_no_LC(info);
		else if (lc == columnRsltGi_base_unit_cd) doRsltGi_base_unit_cd_LC(info);
		else if (lc == columnRsltGi_base_unit_nm) doRsltGi_base_unit_nm_LC(info);
		else if (lc == columnRsltGi_base_dec_place) doRsltGi_base_dec_place_LC(info);
		else if (lc == columnRsltGi_schd_dt) doRsltGi_schd_dt_LC(info);
		else if (lc == columnRsltGi_act_dt) doRsltGi_act_dt_LC(info);
		else if (lc == columnRsltGi_par_lot_no) doRsltGi_par_lot_no_LC(info);
		else if (lc == columnRsltGi_par_sublot_no) doRsltGi_par_sublot_no_LC(info);
		else if (lc == columnRsltGi_schd_act_typ) doRsltGi_schd_act_typ_LC(info);
		else if (lc == columnRsltGi_schd_act_typ_nm) doRsltGi_schd_act_typ_nm_LC(info);
		else if (lc == columnRsltGi_loc_cd) doRsltGi_loc_cd_LC(info);
		else if (lc == columnRsltGi_loc_nm) doRsltGi_loc_nm_LC(info);
		else if (lc == columnRsltGi_dlv_cd) doRsltGi_dlv_cd_LC(info);
		else if (lc == columnRsltGi_dlv_nm) doRsltGi_dlv_nm_LC(info);
		else if (lc == columnRsltGi_tdlv_cd) doRsltGi_tdlv_cd_LC(info);
		else if (lc == columnRsltGi_tdlv_nm) doRsltGi_tdlv_nm_LC(info);
		else if (lc == columnRsltGi_lot_rmrks) doRsltGi_lot_rmrks_LC(info);
		else if (lc == columnRsltGi_sub_char1) doRsltGi_sub_char1_LC(info);
		else if (lc == columnRsltGi_sub_char2) doRsltGi_sub_char2_LC(info);
		else if (lc == columnRsltGi_sub_char3) doRsltGi_sub_char3_LC(info);
		else if (lc == columnRsltGi_ins_usr_id) doRsltGi_ins_usr_id_LC(info);
		else if (lc == columnRsltGi_ins_usr_nm) doRsltGi_ins_usr_nm_LC(info);
		else if (lc == columnRsltGi_ins_func_id) doRsltGi_ins_func_id_LC(info);
		else if (lc == columnRsltGi_ins_func_nm) doRsltGi_ins_func_nm_LC(info);
		else if (lc == columnRsltGi_ins_ts) doRsltGi_ins_ts_LC(info);
		else if (lc == columnRsltGi_upd_usr_id) doRsltGi_upd_usr_id_LC(info);
		else if (lc == columnRsltGi_upd_usr_nm) doRsltGi_upd_usr_nm_LC(info);
		else if (lc == columnRsltGi_upd_func_id) doRsltGi_upd_func_id_LC(info);
		else if (lc == columnRsltGi_upd_func_nm) doRsltGi_upd_func_nm_LC(info);
		else if (lc == columnRsltGi_upd_ts) doRsltGi_upd_ts_LC(info);
		else if (lc == columnRsltGi_upd_srv_req_no) doRsltGi_upd_srv_req_no_LC(info);
		else if (lc == columnRsltAprvJudg_ntfy_nm) doRsltAprvJudg_ntfy_nm_LC(info);
		else if (lc == columnRsltAprvJudg_lot_no) doRsltAprvJudg_lot_no_LC(info);
		else if (lc == columnRsltAprvJudg_sublot_no) doRsltAprvJudg_sublot_no_LC(info);
		else if (lc == columnRsltAprvJudg_mfg_aprv_sts_typ) doRsltAprvJudg_mfg_aprv_sts_typ_LC(info);
		else if (lc == columnRsltAprvJudg_mfg_aprv_sts_typ_nm) doRsltAprvJudg_mfg_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRsltAprvJudg_mfg_aprv_dt) doRsltAprvJudg_mfg_aprv_dt_LC(info);
		else if (lc == columnRsltAprvJudg_yield_base_unit_qty) doRsltAprvJudg_yield_base_unit_qty_LC(info);
		else if (lc == columnRsltAprvJudg_yield_base_unit_cd) doRsltAprvJudg_yield_base_unit_cd_LC(info);
		else if (lc == columnRsltAprvJudg_yield_base_unit_nm) doRsltAprvJudg_yield_base_unit_nm_LC(info);
		else if (lc == columnRsltAprvJudg_insp_aprv_sts_typ) doRsltAprvJudg_insp_aprv_sts_typ_LC(info);
		else if (lc == columnRsltAprvJudg_insp_aprv_sts_typ_nm) doRsltAprvJudg_insp_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRsltAprvJudg_insp_judg_dt) doRsltAprvJudg_insp_judg_dt_LC(info);
		else if (lc == columnRsltAprvJudg_insp_good_qty) doRsltAprvJudg_insp_good_qty_LC(info);
		else if (lc == columnRsltAprvJudg_insp_base_unit_cd) doRsltAprvJudg_insp_base_unit_cd_LC(info);
		else if (lc == columnRsltAprvJudg_insp_base_unit_nm) doRsltAprvJudg_insp_base_unit_nm_LC(info);
		else if (lc == columnRsltAprvJudg_insp_judg_rslt_typ) doRsltAprvJudg_insp_judg_rslt_typ_LC(info);
		else if (lc == columnRsltAprvJudg_insp_judg_rslt_typ_nm) doRsltAprvJudg_insp_judg_rslt_typ_nm_LC(info);
		else if (lc == columnRsltAprvJudg_plnt_aprv_sts_typ) doRsltAprvJudg_plnt_aprv_sts_typ_LC(info);
		else if (lc == columnRsltAprvJudg_plnt_aprv_sts_typ_nm) doRsltAprvJudg_plnt_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRsltAprvJudg_plnt_aprv_dt) doRsltAprvJudg_plnt_aprv_dt_LC(info);
		else if (lc == columnRsltAprvJudg_plnt_base_unit_qty) doRsltAprvJudg_plnt_base_unit_qty_LC(info);
		else if (lc == columnRsltAprvJudg_plnt_base_unit_cd) doRsltAprvJudg_plnt_base_unit_cd_LC(info);
		else if (lc == columnRsltAprvJudg_plnt_base_unit_nm) doRsltAprvJudg_plnt_base_unit_nm_LC(info);
		else if (lc == columnRsltAprvJudg_mrkt_judg_sts_typ) doRsltAprvJudg_mrkt_judg_sts_typ_LC(info);
		else if (lc == columnRsltAprvJudg_mrkt_judg_sts_typ_nm) doRsltAprvJudg_mrkt_judg_sts_typ_nm_LC(info);
		else if (lc == columnRsltAprvJudg_mrkt_judg_dt) doRsltAprvJudg_mrkt_judg_dt_LC(info);
		else if (lc == columnRsltAprvJudg_mrkt_base_unit_qty) doRsltAprvJudg_mrkt_base_unit_qty_LC(info);
		else if (lc == columnRsltAprvJudg_mrkt_base_unit_cd) doRsltAprvJudg_mrkt_base_unit_cd_LC(info);
		else if (lc == columnRsltAprvJudg_mrkt_base_unit_nm) doRsltAprvJudg_mrkt_base_unit_nm_LC(info);
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
	 * [Cnd]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_lot_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[bp_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_aprv_sts_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_char5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_char5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_num1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_num1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_num2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_num2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_num3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_num3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_num4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_num4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_num5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_num5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_dt1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_dt2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_dt3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_dt4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_sub_dt5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_sub_dt5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[par_sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_par_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[itm_mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_itm_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[stk_xfr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_stk_xfr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[mfg_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_mfg_act_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[trd_ptn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_trd_ptn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_act_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_act_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_act_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_act_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[io_schd_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_io_schd_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[slip_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_slip_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[base_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_base_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[act_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_act_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[strg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_strg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[strg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_strg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[schd_act_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_schd_act_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[schd_act_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_schd_act_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[lot_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_lot_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [RsltGr]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGr_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[itm_mfg_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_itm_mfg_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[mfg_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_mfg_act_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[stk_xfr_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_stk_xfr_act_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[trd_ptn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_trd_ptn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_act_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_act_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_act_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_act_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[io_schd_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_io_schd_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[slip_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_slip_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[base_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_base_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[act_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_act_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[par_lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_par_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[par_sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_par_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[schd_act_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_schd_act_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[schd_act_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_schd_act_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[tdlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_tdlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[tdlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_tdlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[lot_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_lot_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [RsltGi]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltGi_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[ntfy_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_ntfy_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mfg_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mfg_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mfg_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mfg_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mfg_aprv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mfg_aprv_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[yield_base_unit_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_yield_base_unit_qty_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[yield_base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_yield_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[yield_base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_yield_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_judg_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_judg_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_good_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_good_qty_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_judg_rslt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_judg_rslt_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[insp_judg_rslt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_insp_judg_rslt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_aprv_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_aprv_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_base_unit_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_base_unit_qty_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[plnt_base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_plnt_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_judg_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_judg_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_judg_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_judg_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_judg_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_judg_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_base_unit_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_base_unit_qty_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltAprvJudg]パネルの[mrkt_base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltAprvJudg_mrkt_base_unit_nm_LC(MCEventInfo info){
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
		if (id.equals("MS.MSBFL0130.Srch01")) {
			return new MS_MSBFL0130_Srch01Bridge();
		}
		if (id.equals("MS.MSBFL0130.Srch02")) {
			return new MS_MSBFL0130_Srch02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBFL0130_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0130_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0130_Srch01;

		/** コンストラクタ */
		protected MS_MSBFL0130_Srch01Bridge() {
			p_MS_MSBFL0130_Srch01 = new MCParam(PDef.MS_MSBFL0130_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0130_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0130.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0130.RsltR.class));

			p_MS_MSBFL0130_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0130_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0130_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0130_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0130_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0130.CndR up0() {
			return (mcframe.clientMSBF.MSBFP0130.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0130.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0130.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0130_Srch01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0130.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0130_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0130.RsltR>)p_MS_MSBFL0130_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0130_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0130_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0130_Srch02;

		/** コンストラクタ */
		protected MS_MSBFL0130_Srch02Bridge() {
			p_MS_MSBFL0130_Srch02 = new MCParam(PDef.MS_MSBFL0130_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0130_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0130.RsltR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0130.RsltGrR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0130.RsltGiR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.class));

			p_MS_MSBFL0130_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0130_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0130_Srch02.addUpBlock(getRsltCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0130_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0130_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0130.RsltR up0() {
			return (mcframe.clientMSBF.MSBFP0130.RsltR)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0130.RsltGrR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0130.RsltGrR>)down(0);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0130.RsltGiR> down1() {
			return (MCList<mcframe.clientMSBF.MSBFP0130.RsltGiR>)down(1);
		}
		protected MCList<mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR> down2() {
			return (MCList<mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0130_Srch02.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0130.RsltGrR.class));
			p_MS_MSBFL0130_Srch02.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0130.RsltGiR.class));
			p_MS_MSBFL0130_Srch02.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0130_Srch02;
		}

		protected void show() {
			setRsltGrL((MCList<mcframe.clientMSBF.MSBFP0130.RsltGrR>)p_MS_MSBFL0130_Srch02.getContainerParam().getDownBlock(0));
			setRsltGiL((MCList<mcframe.clientMSBF.MSBFP0130.RsltGiR>)p_MS_MSBFL0130_Srch02.getContainerParam().getDownBlock(1));
			setRsltAprvJudgL((MCList<mcframe.clientMSBF.MSBFP0130.RsltAprvJudgR>)p_MS_MSBFL0130_Srch02.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getRsltGrL().clear();
			getRsltGiL().clear();
			getRsltAprvJudgL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltGrL());
			result.add(getRsltGiL());
			result.add(getRsltAprvJudgL());
			return result;
		}
	}
}