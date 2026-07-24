package mcframe.clientMSBF.MSBFP0110;

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
import mcframe.clientMSBF.MSBFP0110.MSBFP_LotSrch_MC.MS_MSBFL0110_Srch01Caller;
import mcframe.clientMSBF.MSBFP0110.MSBFP_LotSrch_MC.MS_MSBFL0110_Imp01Caller;
import mcframe.clientMSBF.MSBFP0110.MSBFP_LotSrch_MC.MS_MSBFL0110_Upd01Caller;
import mcframe.clientMSBF.MSBFP0110.MSBFP_LotSrch_MC.MS_MSBFL0110_Del01Caller;

/**
 * 画面"MSBFP_LotSrch"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFP_LotSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBFP0110";

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
	 * UPD,Create/Modify;DEL,Delete;REF,View UPD,登録・訂正する;DEL,削除する;REF,参照する.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	/**
	 * Without expiration only 期限未設定のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_unreg_lmt_flg = null;
	/**
	 * Inventory record exists only 在庫レコードありのみ.<p>
	 *
	 */
	public MCCheckBox Cnd_stk_flg = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_ver_no_Label = null;
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ver_no = null;
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
	public MCLabel Cnd_first_gr_dt_fr_Label = null;
	/**
	 * Oldest GR date FROM 最古入庫日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_first_gr_dt_fr = null;
	public MCLabel Cnd_first_gr_dt_to_Label = null;
	/**
	 * Oldest GR date TO 最古入庫日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_first_gr_dt_to = null;
	public MCLabel Cnd_vld_dt_fr_Label = null;
	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_vld_dt_fr = null;
	public MCLabel Cnd_vld_dt_to_Label = null;
	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_vld_dt_to = null;
	public MCLabel Cnd_lmt_dt_fr_Label = null;
	/**
	 * Usage expiration date FROM 使用期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_lmt_dt_fr = null;
	public MCLabel Cnd_lmt_dt_to_Label = null;
	/**
	 * Usage expiration date TO 使用期限ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_lmt_dt_to = null;
	public MCLabel Cnd_lot_mng_typ_Label = null;
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_lot_mng_typ = null;
	/**
	 * Lot management type name ロット管理区分名.<p>
	 *
	 */
	public MCTextField Cnd_lot_mng_typ_nm = null;
	public MCLabel Cnd_sublot_mng_typ_Label = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_sublot_mng_typ = null;
	/**
	 * Sublot management type name サブロット管理区分名.<p>
	 *
	 */
	public MCTextField Cnd_sublot_mng_typ_nm = null;
	public MCLabel Cnd_lot_rmrks_Label = null;
	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public MCTextField Cnd_lot_rmrks = null;
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
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBF.MSBFP0110.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
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
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_seq = null;
	/**
	 * Schedule 予定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_schd_flg = null;
	/**
	 * Save oldest date 最古日保存.<p>
	 *
	 */
	public MCColumnConfig columnRslt_first_gr_dt_save_flg = null;
	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_first_gr_dt = null;
	/**
	 * Standard GR date 基準入庫日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_gr_dt = null;
	/**
	 * Without expiration 期限未設定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_unreg_lmt_flg = null;
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCColumnConfig columnRslt_vld_dt = null;
	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lmt_dt = null;
	public mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D Rslt_act_cont_fctr_p_PPanel;
	public MCColumnConfig columnRslt_act_cont_fctr;// [Rslt]の[act_cont_fctr_p.act_cont_fctr]を[columnRslt_act_cont_fctr]としてエイリアス定義。
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_lot_no = null;
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
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_aprv_sts_typ = null;
	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_aprv_sts_typ_nm = null;
	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_plnt_aprv_sts_typ = null;
	/**
	 * Factory release approval status type 工場出荷承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_plnt_aprv_sts_typ_nm = null;
	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mrkt_judg_sts_typ = null;
	/**
	 * Market release decision status type 市場出荷判定状況区名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mrkt_judg_sts_typ_nm = null;
	/**
	 * Base date type 起算日区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lmt_dt_frm_typ = null;
	/**
	 * Base date type name 起算日区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lmt_dt_frm_typ_nm = null;
	/**
	 * Base date 起算日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lmt_dt_frm = null;
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
	 * Inventory record exists 在庫レコードあり.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_flg = null;
	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sundry_itm_flg = null;
	/**
	 * For active ingredient flg. 有効成分対象ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_flg = null;
	/**
	 * For version control flg. 版管理対象ＦＬＧ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ver_flg = null;
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_mng_typ = null;
	/**
	 * Lot management type name ロット管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_mng_typ_nm = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_mng_typ = null;
	/**
	 * Sublot management type name サブロット管理区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_mng_typ_nm = null;
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
	 * Request No. リクエストＮＯ.<p>
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
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX_U, SRCH, DEL, REF};
	
	/** [MS_MSBFL0110_Srch01]のCallerの作成 */
	protected MSBFP_LotSrch_MC.MS_MSBFL0110_Srch01Caller createMS_MSBFL0110_Srch01() {
		MSBFP_LotSrch_MC.MS_MSBFL0110_Srch01Caller<MSBFP_LotSrch, MS_MSBFL0110_Srch01Bridge>
		caller = ((MSBFP_LotSrch_MC)this).new MS_MSBFL0110_Srch01Caller<MSBFP_LotSrch, MS_MSBFL0110_Srch01Bridge>(
					(MSBFP_LotSrch)this, new MS_MSBFL0110_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBFL0110_Srch01]の呼び出し */
	protected void callMS_MSBFL0110_Srch01() {
		MCCaller caller = createMS_MSBFL0110_Srch01();
		caller.exec();
	}
	/** [MS_MSBFL0110_Imp01]のCallerの作成 */
	protected MSBFP_LotSrch_MC.MS_MSBFL0110_Imp01Caller createMS_MSBFL0110_Imp01() {
		MSBFP_LotSrch_MC.MS_MSBFL0110_Imp01Caller<MSBFP_LotSrch, MS_MSBFL0110_Imp01Bridge>
		caller = ((MSBFP_LotSrch_MC)this).new MS_MSBFL0110_Imp01Caller<MSBFP_LotSrch, MS_MSBFL0110_Imp01Bridge>(
					(MSBFP_LotSrch)this, new MS_MSBFL0110_Imp01Bridge());
		return caller;
	}
	/** [MS_MSBFL0110_Imp01]の呼び出し */
	protected void callMS_MSBFL0110_Imp01() {
		MCCaller caller = createMS_MSBFL0110_Imp01();
		caller.exec();
	}
	/** [MS_MSBFL0110_Upd01]のCallerの作成 */
	protected MSBFP_LotSrch_MC.MS_MSBFL0110_Upd01Caller createMS_MSBFL0110_Upd01() {
		MSBFP_LotSrch_MC.MS_MSBFL0110_Upd01Caller<MSBFP_LotSrch, MS_MSBFL0110_Upd01Bridge>
		caller = ((MSBFP_LotSrch_MC)this).new MS_MSBFL0110_Upd01Caller<MSBFP_LotSrch, MS_MSBFL0110_Upd01Bridge>(
					(MSBFP_LotSrch)this, new MS_MSBFL0110_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBFL0110_Upd01]の呼び出し */
	protected void callMS_MSBFL0110_Upd01() {
		MCCaller caller = createMS_MSBFL0110_Upd01();
		caller.exec();
	}
	/** [MS_MSBFL0110_Del01]のCallerの作成 */
	protected MSBFP_LotSrch_MC.MS_MSBFL0110_Del01Caller createMS_MSBFL0110_Del01() {
		MSBFP_LotSrch_MC.MS_MSBFL0110_Del01Caller<MSBFP_LotSrch, MS_MSBFL0110_Del01Bridge>
		caller = ((MSBFP_LotSrch_MC)this).new MS_MSBFL0110_Del01Caller<MSBFP_LotSrch, MS_MSBFL0110_Del01Bridge>(
					(MSBFP_LotSrch)this, new MS_MSBFL0110_Del01Bridge());
		return caller;
	}
	/** [MS_MSBFL0110_Del01]の呼び出し */
	protected void callMS_MSBFL0110_Del01() {
		MCCaller caller = createMS_MSBFL0110_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0110.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBF.MSBFP0110.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBF.MSBFP0110.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBF.MSBFP0110.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBF.MSBFP0110.CndR createCndR() {
		return mcframe.clientMSBF.MSBFP0110.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBF.MSBFP0110.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0110.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBF.MSBFP0110.RsltR createRsltR() {
		return mcframe.clientMSBF.MSBFP0110.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0110.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBF.MSBFP0110.RsltR.class);
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBFP_LotSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBFP_LotSrch_MC_A(String name) {
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
		MSBFP_LotSrch_MC.jbCreateScreenOpe((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbCreateTop((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbCreateFold((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbCreateTab1((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbCreateTab2((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbCreateCnd((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbCreateCnd2((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbCreateCtrl((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbCreateRslt((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbCreateBtn((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbCreateEastBtn((MSBFP_LotSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBFP_LotSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBFP_LotSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBFP_LotSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBFP_LotSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBFP_LotSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBFP_LotSrch p) {
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
	protected static void jbCreateCnd2(MSBFP_LotSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBFP_LotSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBFP_LotSrch p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBF.MSBFP0110.RsltR.$itm_p);
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
		p.Rslt_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBF.MSBFP0110.RsltR.$ver_no_p);
		p.Rslt_ver_no_p_PPanel.setName("Rslt.ver_no_p");
		p.columnRslt_ver_no = p.Rslt_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnRslt_ver_no.addAliasName("Rslt.ver_no", p);
		p.Rslt_act_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.create(mcframe.clientMSBF.MSBFP0110.RsltR.$act_cont_fctr_p);
		p.Rslt_act_cont_fctr_p_PPanel.setName("Rslt.act_cont_fctr_p");
		p.columnRslt_act_cont_fctr = p.Rslt_act_cont_fctr_p_PPanel.columnActContFctr_act_cont_fctr;
		p.columnRslt_act_cont_fctr.addAliasName("Rslt.act_cont_fctr", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBF.MSBFP0110.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBF.MSBFP0110.RsltR.$itm_grp_p);
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
	protected static void jbCreateBtn(MSBFP_LotSrch p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBFP_LotSrch p) {
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
	
	
	/** [Cnd_lot_mng_typ_ListPutter]の定義 */
	private MCListPutter Cnd_lot_mng_typ_p = null;

	/**
	 * [Cnd_lot_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_lot_mng_typ_ListPutter() {
		if (Cnd_lot_mng_typ_p == null) {
			Cnd_lot_mng_typ_p = createCnd_lot_mng_typ_ListPutter(Cnd_lot_mng_typ, "lot_mng_typ", "lot_mng_typ_nm");

		}
		return Cnd_lot_mng_typ_p;
	}
	
	
	/** [Cnd_sublot_mng_typ_ListPutter]の定義 */
	private MCListPutter Cnd_sublot_mng_typ_p = null;

	/**
	 * [Cnd_sublot_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sublot_mng_typ_ListPutter() {
		if (Cnd_sublot_mng_typ_p == null) {
			Cnd_sublot_mng_typ_p = createCnd_sublot_mng_typ_ListPutter(Cnd_sublot_mng_typ, "sublot_mng_typ", "sublot_mng_typ_nm");

		}
		return Cnd_sublot_mng_typ_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Rslt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Rslt_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Rslt_itm_p_PPanel_columnItm_itm_cd_p = createRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3","sundry_itm_flg","cont_fctr_flg","ver_flg","lot_mng_typ","sublot_mng_typ","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub1_p = createRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3","sundry_itm_flg","cont_fctr_flg","ver_flg","lot_mng_typ","sublot_mng_typ","act_cont_fctr","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub2_p = createRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3","sundry_itm_flg","cont_fctr_flg","ver_flg","lot_mng_typ","sublot_mng_typ","act_cont_fctr","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
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
			Rslt_itm_p_PPanel_columnItm_itm_sub3_p = createRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Rslt_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","sundry_itm_flg","cont_fctr_flg","ver_flg","lot_mng_typ","sublot_mng_typ","act_cont_fctr","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
		}
		return Rslt_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Rslt_mfg_aprv_sts_typ_ListPutter]の定義 */
	private MCListPutter Rslt_mfg_aprv_sts_typ_p = null;

	/**
	 * [Rslt_mfg_aprv_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_mfg_aprv_sts_typ_ListPutter() {
		if (Rslt_mfg_aprv_sts_typ_p == null) {
			Rslt_mfg_aprv_sts_typ_p = createRslt_mfg_aprv_sts_typ_ListPutter(columnRslt_mfg_aprv_sts_typ, "mfg_aprv_sts_typ", "mfg_aprv_sts_typ_nm");

		}
		return Rslt_mfg_aprv_sts_typ_p;
	}
	
	
	/** [Rslt_stk_insp_typ_ListPutter]の定義 */
	private MCListPutter Rslt_stk_insp_typ_p = null;

	/**
	 * [Rslt_stk_insp_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_stk_insp_typ_ListPutter() {
		if (Rslt_stk_insp_typ_p == null) {
			Rslt_stk_insp_typ_p = createRslt_stk_insp_typ_ListPutter(columnRslt_stk_insp_typ, "stk_insp_typ", "stk_insp_typ_nm");

		}
		return Rslt_stk_insp_typ_p;
	}
	
	
	/** [Rslt_quality_typ_ListPutter]の定義 */
	private MCListPutter Rslt_quality_typ_p = null;

	/**
	 * [Rslt_quality_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_quality_typ_ListPutter() {
		if (Rslt_quality_typ_p == null) {
			Rslt_quality_typ_p = createRslt_quality_typ_ListPutter(columnRslt_quality_typ, "quality_typ", "quality_typ_nm");

		}
		return Rslt_quality_typ_p;
	}
	
	
	/** [Rslt_insp_aprv_sts_typ_ListPutter]の定義 */
	private MCListPutter Rslt_insp_aprv_sts_typ_p = null;

	/**
	 * [Rslt_insp_aprv_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_insp_aprv_sts_typ_ListPutter() {
		if (Rslt_insp_aprv_sts_typ_p == null) {
			Rslt_insp_aprv_sts_typ_p = createRslt_insp_aprv_sts_typ_ListPutter(columnRslt_insp_aprv_sts_typ, "insp_aprv_sts_typ", "insp_aprv_sts_typ_nm");

		}
		return Rslt_insp_aprv_sts_typ_p;
	}
	
	
	/** [Rslt_plnt_aprv_sts_typ_ListPutter]の定義 */
	private MCListPutter Rslt_plnt_aprv_sts_typ_p = null;

	/**
	 * [Rslt_plnt_aprv_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_plnt_aprv_sts_typ_ListPutter() {
		if (Rslt_plnt_aprv_sts_typ_p == null) {
			Rslt_plnt_aprv_sts_typ_p = createRslt_plnt_aprv_sts_typ_ListPutter(columnRslt_plnt_aprv_sts_typ, "plnt_aprv_sts_typ", "plnt_aprv_sts_typ_nm");

		}
		return Rslt_plnt_aprv_sts_typ_p;
	}
	
	
	/** [Rslt_mrkt_judg_sts_typ_ListPutter]の定義 */
	private MCListPutter Rslt_mrkt_judg_sts_typ_p = null;

	/**
	 * [Rslt_mrkt_judg_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_mrkt_judg_sts_typ_ListPutter() {
		if (Rslt_mrkt_judg_sts_typ_p == null) {
			Rslt_mrkt_judg_sts_typ_p = createRslt_mrkt_judg_sts_typ_ListPutter(columnRslt_mrkt_judg_sts_typ, "mrkt_judg_sts_typ", "mrkt_judg_sts_typ_nm");

		}
		return Rslt_mrkt_judg_sts_typ_p;
	}
	
	
	/** [Rslt_lmt_dt_frm_typ_ListPutter]の定義 */
	private MCListPutter Rslt_lmt_dt_frm_typ_p = null;

	/**
	 * [Rslt_lmt_dt_frm_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_lmt_dt_frm_typ_ListPutter() {
		if (Rslt_lmt_dt_frm_typ_p == null) {
			Rslt_lmt_dt_frm_typ_p = createRslt_lmt_dt_frm_typ_ListPutter(columnRslt_lmt_dt_frm_typ, "lmt_dt_frm_typ", "lmt_dt_frm_typ_nm");

		}
		return Rslt_lmt_dt_frm_typ_p;
	}
	
	
	/** [Rslt_lot_mng_typ_ListPutter]の定義 */
	private MCListPutter Rslt_lot_mng_typ_p = null;

	/**
	 * [Rslt_lot_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_lot_mng_typ_ListPutter() {
		if (Rslt_lot_mng_typ_p == null) {
			Rslt_lot_mng_typ_p = createRslt_lot_mng_typ_ListPutter(columnRslt_lot_mng_typ, "lot_mng_typ", "lot_mng_typ_nm");

		}
		return Rslt_lot_mng_typ_p;
	}
	
	
	/** [Rslt_sublot_mng_typ_ListPutter]の定義 */
	private MCListPutter Rslt_sublot_mng_typ_p = null;

	/**
	 * [Rslt_sublot_mng_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_sublot_mng_typ_ListPutter() {
		if (Rslt_sublot_mng_typ_p == null) {
			Rslt_sublot_mng_typ_p = createRslt_sublot_mng_typ_ListPutter(columnRslt_sublot_mng_typ, "sublot_mng_typ", "sublot_mng_typ_nm");

		}
		return Rslt_sublot_mng_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBFP_LotSrch create(){
		MSBFP_LotSrch p = new MSBFP_LotSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBFP_LotSrch create(String name){
		MSBFP_LotSrch p = new MSBFP_LotSrch(name);
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
		MSBFP_LotSrch_MC.jbfInitScreenOpe((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbfInitTop((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbfInitFold((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbfInitTab1((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbfInitTab2((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbfInitCnd((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbfInitCnd2((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbfInitCtrl((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbfInitRslt((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbfInitBtn((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbfInitEastBtn((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbInitScreenOpe((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbInitTop((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbInitFold((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbInitTab1((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbInitTab2((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbInitCnd((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbInitCnd2((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbInitCtrl((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbInitRslt((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbInitBtn((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.jbInitEastBtn((MSBFP_LotSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBFP_LotSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBFP_LotSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBFP_LotSrch p) {
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
	protected static void jbfInitTab1(MSBFP_LotSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBFP_LotSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBFP_LotSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_unreg_lmt_flg = p.beansFactory.createCheckBox("Cnd.unreg_lmt_flg");
		p.Cnd_stk_flg = p.beansFactory.createCheckBox("Cnd.stk_flg");
		p.Cnd_ver_no_Label = p.beansFactory.createLabel("Cnd.ver_no_Label");
		p.Cnd_ver_no = p.beansFactory.createTextField("Cnd.ver_no");
		p.Cnd_ver_no.setLabel(p.Cnd_ver_no_Label);
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextComboBox("Cnd.sublot_no");
		p.Cnd_bp_lot_no_Label = p.beansFactory.createLabel("Cnd.bp_lot_no_Label");
		p.Cnd_bp_lot_no = p.beansFactory.createTextField("Cnd.bp_lot_no");
		p.Cnd_bp_lot_no.setLabel(p.Cnd_bp_lot_no_Label);
		p.Cnd_first_gr_dt_fr_Label = p.beansFactory.createLabel("Cnd.first_gr_dt_fr_Label");
		p.Cnd_first_gr_dt_fr = p.beansFactory.createDateField("Cnd.first_gr_dt_fr");
		p.Cnd_first_gr_dt_fr.setLabel(p.Cnd_first_gr_dt_fr_Label);
		p.Cnd_first_gr_dt_to_Label = p.beansFactory.createLabel("Cnd.first_gr_dt_to_Label");
		p.Cnd_first_gr_dt_to = p.beansFactory.createDateField("Cnd.first_gr_dt_to");
		p.Cnd_first_gr_dt_to.setLabel(p.Cnd_first_gr_dt_to_Label);
		p.Cnd_vld_dt_fr_Label = p.beansFactory.createLabel("Cnd.vld_dt_fr_Label");
		p.Cnd_vld_dt_fr = p.beansFactory.createDateField("Cnd.vld_dt_fr");
		p.Cnd_vld_dt_fr.setLabel(p.Cnd_vld_dt_fr_Label);
		p.Cnd_vld_dt_to_Label = p.beansFactory.createLabel("Cnd.vld_dt_to_Label");
		p.Cnd_vld_dt_to = p.beansFactory.createDateField("Cnd.vld_dt_to");
		p.Cnd_vld_dt_to.setLabel(p.Cnd_vld_dt_to_Label);
		p.Cnd_lmt_dt_fr_Label = p.beansFactory.createLabel("Cnd.lmt_dt_fr_Label");
		p.Cnd_lmt_dt_fr = p.beansFactory.createDateField("Cnd.lmt_dt_fr");
		p.Cnd_lmt_dt_fr.setLabel(p.Cnd_lmt_dt_fr_Label);
		p.Cnd_lmt_dt_to_Label = p.beansFactory.createLabel("Cnd.lmt_dt_to_Label");
		p.Cnd_lmt_dt_to = p.beansFactory.createDateField("Cnd.lmt_dt_to");
		p.Cnd_lmt_dt_to.setLabel(p.Cnd_lmt_dt_to_Label);
		p.Cnd_lot_mng_typ_Label = p.beansFactory.createLabel("Cnd.lot_mng_typ_Label");
		p.Cnd_lot_mng_typ = p.beansFactory.createTextComboBox("Cnd.lot_mng_typ");
		p.Cnd_lot_mng_typ.setLabel(p.Cnd_lot_mng_typ_Label);
		p.Cnd_lot_mng_typ_nm = p.beansFactory.createTextField("Cnd.lot_mng_typ_nm");
		p.Cnd_sublot_mng_typ_Label = p.beansFactory.createLabel("Cnd.sublot_mng_typ_Label");
		p.Cnd_sublot_mng_typ = p.beansFactory.createTextComboBox("Cnd.sublot_mng_typ");
		p.Cnd_sublot_mng_typ.setLabel(p.Cnd_sublot_mng_typ_Label);
		p.Cnd_sublot_mng_typ_nm = p.beansFactory.createTextField("Cnd.sublot_mng_typ_nm");
		p.Cnd_lot_rmrks_Label = p.beansFactory.createLabel("Cnd.lot_rmrks_Label");
		p.Cnd_lot_rmrks = p.beansFactory.createTextField("Cnd.lot_rmrks");
		p.Cnd_lot_rmrks.setLabel(p.Cnd_lot_rmrks_Label);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBFP_LotSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBFP_LotSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBFP_LotSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
		p.columnRslt_lot_seq = p.beansFactory.createTableColumn("Rslt.lot_seq", MCColumnType.TEXT);
		p.columnRslt_schd_flg = p.beansFactory.createTableColumn("Rslt.schd_flg", MCColumnType.CHECK);
		p.columnRslt_first_gr_dt_save_flg = p.beansFactory.createTableColumn("Rslt.first_gr_dt_save_flg", MCColumnType.CHECK);
		p.columnRslt_first_gr_dt = p.beansFactory.createTableColumn("Rslt.first_gr_dt", MCColumnType.DATE);
		p.columnRslt_base_gr_dt = p.beansFactory.createTableColumn("Rslt.base_gr_dt", MCColumnType.DATE);
		p.columnRslt_unreg_lmt_flg = p.beansFactory.createTableColumn("Rslt.unreg_lmt_flg", MCColumnType.CHECK);
		p.columnRslt_vld_dt = p.beansFactory.createTableColumn("Rslt.vld_dt", MCColumnType.DATE);
		p.columnRslt_lmt_dt = p.beansFactory.createTableColumn("Rslt.lmt_dt", MCColumnType.DATE);
		p.columnRslt_bp_lot_no = p.beansFactory.createTableColumn("Rslt.bp_lot_no", MCColumnType.TEXT);
		p.columnRslt_mfg_aprv_sts_typ = p.beansFactory.createTableColumn("Rslt.mfg_aprv_sts_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_mfg_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.mfg_aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ = p.beansFactory.createTableColumn("Rslt.stk_insp_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_stk_insp_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_insp_typ_nm", MCColumnType.TEXT);
		p.columnRslt_quality_typ = p.beansFactory.createTableColumn("Rslt.quality_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_quality_typ_nm = p.beansFactory.createTableColumn("Rslt.quality_typ_nm", MCColumnType.TEXT);
		p.columnRslt_insp_aprv_sts_typ = p.beansFactory.createTableColumn("Rslt.insp_aprv_sts_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_insp_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.insp_aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_plnt_aprv_sts_typ = p.beansFactory.createTableColumn("Rslt.plnt_aprv_sts_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_plnt_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.plnt_aprv_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_mrkt_judg_sts_typ = p.beansFactory.createTableColumn("Rslt.mrkt_judg_sts_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_mrkt_judg_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.mrkt_judg_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_lmt_dt_frm_typ = p.beansFactory.createTableColumn("Rslt.lmt_dt_frm_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_lmt_dt_frm_typ_nm = p.beansFactory.createTableColumn("Rslt.lmt_dt_frm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_lmt_dt_frm = p.beansFactory.createTableColumn("Rslt.lmt_dt_frm", MCColumnType.DATE);
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
		p.columnRslt_stk_flg = p.beansFactory.createTableColumn("Rslt.stk_flg", MCColumnType.CHECK);
		p.columnRslt_sundry_itm_flg = p.beansFactory.createTableColumn("Rslt.sundry_itm_flg", MCColumnType.CHECK);
		p.columnRslt_cont_fctr_flg = p.beansFactory.createTableColumn("Rslt.cont_fctr_flg", MCColumnType.CHECK);
		p.columnRslt_ver_flg = p.beansFactory.createTableColumn("Rslt.ver_flg", MCColumnType.CHECK);
		p.columnRslt_lot_mng_typ = p.beansFactory.createTableColumn("Rslt.lot_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_lot_mng_typ_nm = p.beansFactory.createTableColumn("Rslt.lot_mng_typ_nm", MCColumnType.TEXT);
		p.columnRslt_sublot_mng_typ = p.beansFactory.createTableColumn("Rslt.sublot_mng_typ", MCColumnType.TEXT_COMBO);
		p.columnRslt_sublot_mng_typ_nm = p.beansFactory.createTableColumn("Rslt.sublot_mng_typ_nm", MCColumnType.TEXT);
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
	protected static void jbfInitBtn(MSBFP_LotSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP0010 = p.beansFactory.createButton("Btn.open_MSBEP0010", "open");
		p.Btn_open_MSBFP0120 = p.beansFactory.createButton("Btn.open_MSBFP0120", "open");
		p.Btn_open_MSBFP0130 = p.beansFactory.createButton("Btn.open_MSBFP0130", "open");
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
	protected static void jbfInitEastBtn(MSBFP_LotSrch p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBFP_LotSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TopPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NNW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBFP_LotSrch p) {
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
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBFP_LotSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.add(p.FoldTab);
		p.FoldPanel.setLastBeans(p.FoldTab);
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
	protected static void jbInitTab1(MSBFP_LotSrch p) {
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
	protected static void jbInitTab2(MSBFP_LotSrch p) {
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
	protected static void jbInitCnd(MSBFP_LotSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0110.CndR.ope_META);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_unreg_lmt_flg);
		p.CndPanel.add(p.Cnd_unreg_lmt_flg);
		p.Cnd_unreg_lmt_flg.setNextBeans(p.Cnd_stk_flg);
		p.Cnd_unreg_lmt_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0110.CndR.unreg_lmt_flg_META);
		p.CndPanel.add(p.Cnd_stk_flg);
		p.Cnd_stk_flg.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_stk_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0110.CndR.stk_flg_META);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_ver_no);
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
		p.CndPanel.add(p.Cnd_ver_no_Label);
		p.CndPanel.add(p.Cnd_ver_no);
		p.Cnd_ver_no.setNextBeans(p.Cnd_lot_no);
		p.Cnd_ver_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0110.CndR.ver_no_META);
		p.setPluralValueEnable(p.Cnd_ver_no, true);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0110.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_bp_lot_no);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0110.CndR.sublot_no_META);
		p.CndPanel.add(p.Cnd_bp_lot_no_Label);
		p.CndPanel.add(p.Cnd_bp_lot_no);
		p.Cnd_bp_lot_no.setNextBeans(p.Cnd_first_gr_dt_fr);
		p.Cnd_bp_lot_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0110.CndR.bp_lot_no_META);
		p.setPluralValueEnable(p.Cnd_bp_lot_no, true);
		p.CndPanel.add(p.Cnd_first_gr_dt_fr_Label);
		p.CndPanel.add(p.Cnd_first_gr_dt_fr);
		p.Cnd_first_gr_dt_fr.setNextBeans(p.Cnd_first_gr_dt_to);
		p.Cnd_first_gr_dt_fr.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0110.CndR.first_gr_dt_fr_META);
		p.Cnd_first_gr_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_first_gr_dt_to_Label);
		p.CndPanel.add(p.Cnd_first_gr_dt_to);
		p.Cnd_first_gr_dt_to.setNextBeans(p.Cnd_vld_dt_fr);
		p.Cnd_first_gr_dt_to.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0110.CndR.first_gr_dt_to_META);
		p.Cnd_first_gr_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_vld_dt_fr_Label);
		p.CndPanel.add(p.Cnd_vld_dt_fr);
		p.Cnd_vld_dt_fr.setNextBeans(p.Cnd_vld_dt_to);
		p.Cnd_vld_dt_fr.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0110.CndR.vld_dt_fr_META);
		p.Cnd_vld_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_vld_dt_to_Label);
		p.CndPanel.add(p.Cnd_vld_dt_to);
		p.Cnd_vld_dt_to.setNextBeans(p.Cnd_lmt_dt_fr);
		p.Cnd_vld_dt_to.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0110.CndR.vld_dt_to_META);
		p.Cnd_vld_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_lmt_dt_fr_Label);
		p.CndPanel.add(p.Cnd_lmt_dt_fr);
		p.Cnd_lmt_dt_fr.setNextBeans(p.Cnd_lmt_dt_to);
		p.Cnd_lmt_dt_fr.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0110.CndR.lmt_dt_fr_META);
		p.Cnd_lmt_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_lmt_dt_to_Label);
		p.CndPanel.add(p.Cnd_lmt_dt_to);
		p.Cnd_lmt_dt_to.setNextBeans(p.Cnd_lot_mng_typ);
		p.Cnd_lmt_dt_to.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0110.CndR.lmt_dt_to_META);
		p.Cnd_lmt_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_lot_mng_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_mng_typ, true);
		p.Cnd_lot_mng_typ.setLinkBeans(p.Cnd_lot_mng_typ_nm);
		p.CndPanel.add(p.Cnd_lot_mng_typ_Label);
		p.CndPanel.add(p.Cnd_lot_mng_typ);
		p.Cnd_lot_mng_typ.setNextBeans(p.Cnd_lot_mng_typ_nm);
		p.Cnd_lot_mng_typ.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0110.CndR.lot_mng_typ_META);
		p.CndPanel.add(p.Cnd_lot_mng_typ_nm);
		p.Cnd_lot_mng_typ_nm.setNextBeans(p.Cnd_sublot_mng_typ);
		p.Cnd_lot_mng_typ_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0110.CndR.lot_mng_typ_nm_META);
		p.Cnd_sublot_mng_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_mng_typ, true);
		p.Cnd_sublot_mng_typ.setLinkBeans(p.Cnd_sublot_mng_typ_nm);
		p.CndPanel.add(p.Cnd_sublot_mng_typ_Label);
		p.CndPanel.add(p.Cnd_sublot_mng_typ);
		p.Cnd_sublot_mng_typ.setNextBeans(p.Cnd_sublot_mng_typ_nm);
		p.Cnd_sublot_mng_typ.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0110.CndR.sublot_mng_typ_META);
		p.CndPanel.add(p.Cnd_sublot_mng_typ_nm);
		p.Cnd_sublot_mng_typ_nm.setNextBeans(p.Cnd_lot_rmrks);
		p.Cnd_sublot_mng_typ_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0110.CndR.sublot_mng_typ_nm_META);
		p.CndPanel.add(p.Cnd_lot_rmrks_Label);
		p.CndPanel.add(p.Cnd_lot_rmrks);
		p.Cnd_lot_rmrks.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0110.CndR.lot_rmrks_META);
		p.setPluralValueEnable(p.Cnd_lot_rmrks, true);
		p.Cnd2Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBFP_LotSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBFP_LotSrch p) {
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
	protected static void jbInitRslt(MSBFP_LotSrch p) {
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
	protected static void jbInitBtn(MSBFP_LotSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBEP0010.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBEP0010);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBEP0010);
		p.Btn_open_MSBEP0010.setNextBeans(p.Btn_open_MSBFP0120);
		p.Btn_open_MSBFP0120.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBFP0120);
		p.Btn_open_MSBFP0120.setNextBeans(p.Btn_open_MSBFP0130);
		p.Btn_open_MSBFP0130.setFunctionKey(MCFunctionKey.F11);
		p.BtnPanel.add(p.Btn_open_MSBFP0130);
		p.Btn_open_MSBFP0130.setNextBeans(p.Btn_select_all);
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
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBFP_LotSrch p) {
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
		MSBFP_LotSrch_MC.mcInitScreenOpe((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.mcInitTop((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.mcInitFold((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.mcInitTab1((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.mcInitTab2((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.mcInitCnd((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.mcInitCnd2((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.mcInitCtrl((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.mcInitRslt((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.mcInitBtn((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.mcInitEastBtn((MSBFP_LotSrch)this);

		// [UPD]ステータスのモードの設定
		MSBFP_LotSrch_MC.statusInitUPD_ScreenOpe((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitUPD_Top((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitUPD_Fold((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitUPD_Tab1((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitUPD_Tab2((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitUPD_Cnd((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitUPD_Cnd2((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitUPD_Ctrl((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitUPD_Rslt((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitUPD_Btn((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitUPD_EastBtn((MSBFP_LotSrch)this);

		// [FIX_U]ステータスのモードの設定
		MSBFP_LotSrch_MC.statusInitFIX__U_ScreenOpe((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitFIX__U_Top((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitFIX__U_Fold((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitFIX__U_Tab1((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitFIX__U_Tab2((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitFIX__U_Cnd((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitFIX__U_Cnd2((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitFIX__U_Ctrl((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitFIX__U_Rslt((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitFIX__U_Btn((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitFIX__U_EastBtn((MSBFP_LotSrch)this);

		// [SRCH]ステータスのモードの設定
		MSBFP_LotSrch_MC.statusInitSRCH_ScreenOpe((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitSRCH_Top((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitSRCH_Fold((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitSRCH_Tab1((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitSRCH_Tab2((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitSRCH_Cnd((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitSRCH_Cnd2((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitSRCH_Ctrl((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitSRCH_Rslt((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitSRCH_Btn((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitSRCH_EastBtn((MSBFP_LotSrch)this);

		// [DEL]ステータスのモードの設定
		MSBFP_LotSrch_MC.statusInitDEL_ScreenOpe((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitDEL_Top((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitDEL_Fold((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitDEL_Tab1((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitDEL_Tab2((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitDEL_Cnd((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitDEL_Cnd2((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitDEL_Ctrl((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitDEL_Rslt((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitDEL_Btn((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitDEL_EastBtn((MSBFP_LotSrch)this);

		// [REF]ステータスのモードの設定
		MSBFP_LotSrch_MC.statusInitREF_ScreenOpe((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitREF_Top((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitREF_Fold((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitREF_Tab1((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitREF_Tab2((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitREF_Cnd((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitREF_Cnd2((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitREF_Ctrl((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitREF_Rslt((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitREF_Btn((MSBFP_LotSrch)this);
		MSBFP_LotSrch_MC.statusInitREF_EastBtn((MSBFP_LotSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBFP_LotSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBFP_LotSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBFP_LotSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBFP_LotSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBFP_LotSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBFP_LotSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_unreg_lmt_flg.addAllListener(p);
		p.Cnd_stk_flg.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_ver_no.setListListener(p);
		p.Cnd_ver_no.addAllListener(p);
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_bp_lot_no.setListListener(p);
		p.Cnd_bp_lot_no.addAllListener(p);
		p.Cnd_first_gr_dt_fr.setListListener(p);
		p.Cnd_first_gr_dt_fr.addAllListener(p);
		p.Cnd_first_gr_dt_to.setListListener(p);
		p.Cnd_first_gr_dt_to.addAllListener(p);
		p.Cnd_vld_dt_fr.setListListener(p);
		p.Cnd_vld_dt_fr.addAllListener(p);
		p.Cnd_vld_dt_to.setListListener(p);
		p.Cnd_vld_dt_to.addAllListener(p);
		p.Cnd_lmt_dt_fr.setListListener(p);
		p.Cnd_lmt_dt_fr.addAllListener(p);
		p.Cnd_lmt_dt_to.setListListener(p);
		p.Cnd_lmt_dt_to.addAllListener(p);
		p.Cnd_lot_mng_typ.setListListener(p);
		p.Cnd_lot_mng_typ.addAllListener(p);
		p.Cnd_lot_mng_typ_nm.setListListener(p);
		p.Cnd_lot_mng_typ_nm.addAllListener(p);
		p.Cnd_sublot_mng_typ.setListListener(p);
		p.Cnd_sublot_mng_typ.addAllListener(p);
		p.Cnd_sublot_mng_typ_nm.setListListener(p);
		p.Cnd_sublot_mng_typ_nm.addAllListener(p);
		p.Cnd_lot_rmrks.setListListener(p);
		p.Cnd_lot_rmrks.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBFP_LotSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBFP_LotSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBFP_LotSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_lot_no.addAllListener(p);
		p.columnRslt_lot_no.setListListener(p);
		p.columnRslt_sublot_no.addAllListener(p);
		p.columnRslt_sublot_no.setListListener(p);
		p.Rslt_ver_no_p_PPanel.columnVerNo_ver_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRslt_lot_seq.addAllListener(p);
		p.columnRslt_lot_seq.setListListener(p);
		p.columnRslt_schd_flg.addAllListener(p);
		p.columnRslt_first_gr_dt_save_flg.addAllListener(p);
		p.columnRslt_first_gr_dt.addAllListener(p);
		p.columnRslt_first_gr_dt.setListListener(p);
		p.columnRslt_base_gr_dt.addAllListener(p);
		p.columnRslt_base_gr_dt.setListListener(p);
		p.columnRslt_unreg_lmt_flg.addAllListener(p);
		p.columnRslt_vld_dt.addAllListener(p);
		p.columnRslt_vld_dt.setListListener(p);
		p.columnRslt_lmt_dt.addAllListener(p);
		p.columnRslt_lmt_dt.setListListener(p);
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
		p.columnRslt_insp_aprv_sts_typ.addAllListener(p);
		p.columnRslt_insp_aprv_sts_typ.setListListener(p);
		p.columnRslt_insp_aprv_sts_typ_nm.addAllListener(p);
		p.columnRslt_insp_aprv_sts_typ_nm.setListListener(p);
		p.columnRslt_plnt_aprv_sts_typ.addAllListener(p);
		p.columnRslt_plnt_aprv_sts_typ.setListListener(p);
		p.columnRslt_plnt_aprv_sts_typ_nm.addAllListener(p);
		p.columnRslt_plnt_aprv_sts_typ_nm.setListListener(p);
		p.columnRslt_mrkt_judg_sts_typ.addAllListener(p);
		p.columnRslt_mrkt_judg_sts_typ.setListListener(p);
		p.columnRslt_mrkt_judg_sts_typ_nm.addAllListener(p);
		p.columnRslt_mrkt_judg_sts_typ_nm.setListListener(p);
		p.columnRslt_lmt_dt_frm_typ.addAllListener(p);
		p.columnRslt_lmt_dt_frm_typ.setListListener(p);
		p.columnRslt_lmt_dt_frm_typ_nm.addAllListener(p);
		p.columnRslt_lmt_dt_frm_typ_nm.setListListener(p);
		p.columnRslt_lmt_dt_frm.addAllListener(p);
		p.columnRslt_lmt_dt_frm.setListListener(p);
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
		p.columnRslt_stk_flg.addAllListener(p);
		p.columnRslt_sundry_itm_flg.addAllListener(p);
		p.columnRslt_cont_fctr_flg.addAllListener(p);
		p.columnRslt_ver_flg.addAllListener(p);
		p.columnRslt_lot_mng_typ.addAllListener(p);
		p.columnRslt_lot_mng_typ.setListListener(p);
		p.columnRslt_lot_mng_typ_nm.addAllListener(p);
		p.columnRslt_lot_mng_typ_nm.setListListener(p);
		p.columnRslt_sublot_mng_typ.addAllListener(p);
		p.columnRslt_sublot_mng_typ.setListListener(p);
		p.columnRslt_sublot_mng_typ_nm.addAllListener(p);
		p.columnRslt_sublot_mng_typ_nm.setListListener(p);
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
	protected static void mcInitBtn(MSBFP_LotSrch p) {
		p.Btn_open_MSBEP0010.addAllListener(p);
		p.Btn_open_MSBEP0010.setAPMethodName("doBtn_open_MSBEP0010");
		p.Btn_open_MSBFP0120.addAllListener(p);
		p.Btn_open_MSBFP0120.setAPMethodName("doBtn_open_MSBFP0120");
		p.Btn_open_MSBFP0130.addAllListener(p);
		p.Btn_open_MSBFP0130.setAPMethodName("doBtn_open_MSBFP0130");
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
	protected static void mcInitEastBtn(MSBFP_LotSrch p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBFP_LotSrch p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MSBFP_LotSrch p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MSBFP_LotSrch p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MSBFP_LotSrch p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MSBFP_LotSrch p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBFP_LotSrch p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_unreg_lmt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_stk_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ver_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_first_gr_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_first_gr_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_vld_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_lmt_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_lmt_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_lot_mng_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_lot_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_sublot_mng_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sublot_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_lot_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MSBFP_LotSrch p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MSBFP_LotSrch p){

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MSBFP_LotSrch p){
		p.columnRslt_check.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnRslt_lot_no.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_sublot_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.REQUIRED);
		p.columnRslt_lot_seq.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_schd_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_first_gr_dt_save_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_first_gr_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_base_gr_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_unreg_lmt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnRslt_vld_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lmt_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.REQUIRED);
		p.columnRslt_bp_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_stk_insp_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_quality_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_insp_aprv_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lmt_dt_frm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_sub_char4.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_sub_char5.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_sub_num1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_sub_num2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_sub_num3.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_sub_num4.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_sub_num5.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_sub_dt1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_sub_dt2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_sub_dt3.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_sub_dt4.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_sub_dt5.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_sub_flg1.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_sub_flg2.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_sub_flg3.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_sub_flg4.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_lot_sub_flg5.putMode(p, UPD, MCMode.ENABLE);
		p.columnRslt_stk_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnRslt_lot_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
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
	protected static void statusInitUPD_Btn(MSBFP_LotSrch p){
		p.Btn_open_MSBEP0010.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MSBFP0130.putMode(p, UPD, MCMode.ENABLE);
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
	protected static void statusInitUPD_EastBtn(MSBFP_LotSrch p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBFP_LotSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MSBFP_LotSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MSBFP_LotSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab1(MSBFP_LotSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tab2(MSBFP_LotSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBFP_LotSrch p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_unreg_lmt_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_stk_flg.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_ver_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_first_gr_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_first_gr_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_vld_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_lmt_dt_fr.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_lmt_dt_to.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_lot_mng_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_lot_mng_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_sublot_mng_typ.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_sublot_mng_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_lot_rmrks.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [FIX_U]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd2(MSBFP_LotSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MSBFP_LotSrch p){

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MSBFP_LotSrch p){
		p.columnRslt_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_lot_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_schd_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_first_gr_dt_save_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_first_gr_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_base_gr_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_unreg_lmt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char4.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char5.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_num1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_num2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_num3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_num4.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_num5.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_dt1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_dt2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_dt3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_dt4.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_dt5.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_flg1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_flg2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_flg3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_flg4.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_flg5.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_stk_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_lot_mng_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBFP_LotSrch p){
		p.Btn_open_MSBEP0010.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MSBFP0130.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBFP_LotSrch p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBFP_LotSrch p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MSBFP_LotSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MSBFP_LotSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MSBFP_LotSrch p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MSBFP_LotSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBFP_LotSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_unreg_lmt_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_stk_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ver_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_first_gr_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_first_gr_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_vld_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_lmt_dt_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_lmt_dt_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_lot_mng_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_lot_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_sublot_mng_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_sublot_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_lot_rmrks.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MSBFP_LotSrch p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MSBFP_LotSrch p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MSBFP_LotSrch p){
		p.columnRslt_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_lot_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_schd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_first_gr_dt_save_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_first_gr_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_gr_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_unreg_lmt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.columnRslt_stk_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_lot_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
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
	protected static void statusInitSRCH_Btn(MSBFP_LotSrch p){
		p.Btn_open_MSBEP0010.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, SRCH, MCMode.ENABLE);
		p.Btn_open_MSBFP0130.putMode(p, SRCH, MCMode.ENABLE);
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
	protected static void statusInitSRCH_EastBtn(MSBFP_LotSrch p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBFP_LotSrch p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MSBFP_LotSrch p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBFP_LotSrch p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MSBFP_LotSrch p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MSBFP_LotSrch p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBFP_LotSrch p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_unreg_lmt_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_stk_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ver_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_first_gr_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_first_gr_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_vld_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_lmt_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_lmt_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_lot_mng_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_lot_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_sublot_mng_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sublot_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_lot_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd2(MSBFP_LotSrch p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MSBFP_LotSrch p){

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MSBFP_LotSrch p){
		p.columnRslt_check.putMode(p, DEL, MCMode.REQUIRED);
		p.Rslt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_lot_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_schd_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_first_gr_dt_save_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_first_gr_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_base_gr_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_unreg_lmt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_char5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_num1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_num2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_num3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_num4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_num5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_dt1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_dt2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_dt3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_dt4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_dt5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_flg1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_flg2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_flg3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_flg4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_sub_flg5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_stk_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRslt_lot_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
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
	protected static void statusInitDEL_Btn(MSBFP_LotSrch p){
		p.Btn_open_MSBEP0010.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MSBFP0130.putMode(p, DEL, MCMode.ENABLE);
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
	protected static void statusInitDEL_EastBtn(MSBFP_LotSrch p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBFP_LotSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBFP_LotSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBFP_LotSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBFP_LotSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBFP_LotSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBFP_LotSrch p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_unreg_lmt_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_stk_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_p_PPanel.Itm_itm_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ver_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_lot_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_first_gr_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_first_gr_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_vld_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_vld_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lmt_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lmt_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lot_mng_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lot_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_sublot_mng_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sublot_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_lot_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MSBFP_LotSrch p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBFP_LotSrch p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBFP_LotSrch p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnRslt_lot_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_schd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_first_gr_dt_save_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_first_gr_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_gr_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_unreg_lmt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.columnRslt_bp_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_quality_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_plnt_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mrkt_judg_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm.putMode(p, REF, MCMode.READ_ONLY);
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
		p.columnRslt_stk_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sundry_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_lot_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_lot_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sublot_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
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
	protected static void statusInitREF_Btn(MSBFP_LotSrch p){
		p.Btn_open_MSBEP0010.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBFP0120.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBFP0130.putMode(p, REF, MCMode.ENABLE);
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
	protected static void statusInitREF_EastBtn(MSBFP_LotSrch p){

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
		MSBFP_LotSrch_MC.setTableConfigRslt((MSBFP_LotSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBFP_LotSrch p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.Rslt_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub1, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3, p.columnRslt_sundry_itm_flg, p.columnRslt_cont_fctr_flg, p.columnRslt_ver_flg, p.columnRslt_lot_mng_typ, p.columnRslt_sublot_mng_typ, p.columnRslt_itm_typ, p.columnRslt_itm_typ_nm, p.columnRslt_itm_typ_d_cd, p.columnRslt_itm_typ_d_nm);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub2, p.columnRslt_itm_sub3, p.columnRslt_sundry_itm_flg, p.columnRslt_cont_fctr_flg, p.columnRslt_ver_flg, p.columnRslt_lot_mng_typ, p.columnRslt_sublot_mng_typ, p.columnRslt_act_cont_fctr, p.columnRslt_itm_typ, p.columnRslt_itm_typ_nm, p.columnRslt_itm_typ_d_cd, p.columnRslt_itm_typ_d_nm);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_itm_sub3, p.columnRslt_sundry_itm_flg, p.columnRslt_cont_fctr_flg, p.columnRslt_ver_flg, p.columnRslt_lot_mng_typ, p.columnRslt_sublot_mng_typ, p.columnRslt_act_cont_fctr, p.columnRslt_itm_typ, p.columnRslt_itm_typ_nm, p.columnRslt_itm_typ_d_cd, p.columnRslt_itm_typ_d_nm);
		p.Rslt_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnRslt_itm_nm, p.columnRslt_sundry_itm_flg, p.columnRslt_cont_fctr_flg, p.columnRslt_ver_flg, p.columnRslt_lot_mng_typ, p.columnRslt_sublot_mng_typ, p.columnRslt_act_cont_fctr, p.columnRslt_itm_typ, p.columnRslt_itm_typ_nm, p.columnRslt_itm_typ_d_cd, p.columnRslt_itm_typ_d_nm);
		p.columnRslt_lot_no.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.RsltTable.addTable(p.Rslt_ver_no_p_PPanel.VerNoTable);
		p.columnRslt_lot_seq.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_seq);
		p.columnRslt_schd_flg.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.schd_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_schd_flg);
		p.columnRslt_first_gr_dt_save_flg.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.first_gr_dt_save_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_first_gr_dt_save_flg);
		p.columnRslt_first_gr_dt.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.first_gr_dt_META);
		p.columnRslt_first_gr_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_first_gr_dt);
		p.columnRslt_base_gr_dt.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.base_gr_dt_META);
		p.columnRslt_base_gr_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_base_gr_dt);
		p.columnRslt_unreg_lmt_flg.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.unreg_lmt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unreg_lmt_flg);
		p.columnRslt_vld_dt.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.vld_dt_META);
		p.columnRslt_vld_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_vld_dt);
		p.columnRslt_lmt_dt.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lmt_dt_META);
		p.columnRslt_lmt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_lmt_dt);
		p.RsltTable.addTable(p.Rslt_act_cont_fctr_p_PPanel.ActContFctrTable);
		p.columnRslt_bp_lot_no.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.bp_lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_lot_no);
		p.columnRslt_mfg_aprv_sts_typ.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.mfg_aprv_sts_typ_META);
		p.columnRslt_mfg_aprv_sts_typ.addLinkBeans(p.columnRslt_mfg_aprv_sts_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_aprv_sts_typ);
		p.columnRslt_mfg_aprv_sts_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.mfg_aprv_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_aprv_sts_typ_nm);
		p.columnRslt_stk_insp_typ.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.stk_insp_typ_META);
		p.columnRslt_stk_insp_typ.addLinkBeans(p.columnRslt_stk_insp_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ);
		p.columnRslt_stk_insp_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.stk_insp_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ_nm);
		p.columnRslt_quality_typ.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.quality_typ_META);
		p.columnRslt_quality_typ.addLinkBeans(p.columnRslt_quality_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ);
		p.columnRslt_quality_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.quality_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ_nm);
		p.columnRslt_insp_aprv_sts_typ.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.insp_aprv_sts_typ_META);
		p.columnRslt_insp_aprv_sts_typ.addLinkBeans(p.columnRslt_insp_aprv_sts_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_aprv_sts_typ);
		p.columnRslt_insp_aprv_sts_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.insp_aprv_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_aprv_sts_typ_nm);
		p.columnRslt_plnt_aprv_sts_typ.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.plnt_aprv_sts_typ_META);
		p.columnRslt_plnt_aprv_sts_typ.addLinkBeans(p.columnRslt_plnt_aprv_sts_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_plnt_aprv_sts_typ);
		p.columnRslt_plnt_aprv_sts_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.plnt_aprv_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_plnt_aprv_sts_typ_nm);
		p.columnRslt_mrkt_judg_sts_typ.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.mrkt_judg_sts_typ_META);
		p.columnRslt_mrkt_judg_sts_typ.addLinkBeans(p.columnRslt_mrkt_judg_sts_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_mrkt_judg_sts_typ);
		p.columnRslt_mrkt_judg_sts_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.mrkt_judg_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mrkt_judg_sts_typ_nm);
		p.columnRslt_lmt_dt_frm_typ.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lmt_dt_frm_typ_META);
		p.columnRslt_lmt_dt_frm_typ.addLinkBeans(p.columnRslt_lmt_dt_frm_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_lmt_dt_frm_typ);
		p.columnRslt_lmt_dt_frm_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lmt_dt_frm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lmt_dt_frm_typ_nm);
		p.columnRslt_lmt_dt_frm.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lmt_dt_frm_META);
		p.columnRslt_lmt_dt_frm.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_lmt_dt_frm);
		p.columnRslt_lot_rmrks.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_rmrks);
		p.columnRslt_lot_sub_char1.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_char1);
		p.columnRslt_lot_sub_char2.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_char2);
		p.columnRslt_lot_sub_char3.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_char3);
		p.columnRslt_lot_sub_char4.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_sub_char4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_char4);
		p.columnRslt_lot_sub_char5.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_sub_char5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_char5);
		p.columnRslt_lot_sub_num1.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_sub_num1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_num1);
		p.columnRslt_lot_sub_num2.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_sub_num2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_num2);
		p.columnRslt_lot_sub_num3.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_sub_num3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_num3);
		p.columnRslt_lot_sub_num4.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_sub_num4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_num4);
		p.columnRslt_lot_sub_num5.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_sub_num5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_num5);
		p.columnRslt_lot_sub_dt1.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_sub_dt1_META);
		p.columnRslt_lot_sub_dt1.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_dt1);
		p.columnRslt_lot_sub_dt2.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_sub_dt2_META);
		p.columnRslt_lot_sub_dt2.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_dt2);
		p.columnRslt_lot_sub_dt3.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_sub_dt3_META);
		p.columnRslt_lot_sub_dt3.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_dt3);
		p.columnRslt_lot_sub_dt4.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_sub_dt4_META);
		p.columnRslt_lot_sub_dt4.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_dt4);
		p.columnRslt_lot_sub_dt5.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_sub_dt5_META);
		p.columnRslt_lot_sub_dt5.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_dt5);
		p.columnRslt_lot_sub_flg1.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_sub_flg1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_flg1);
		p.columnRslt_lot_sub_flg2.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_sub_flg2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_flg2);
		p.columnRslt_lot_sub_flg3.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_sub_flg3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_flg3);
		p.columnRslt_lot_sub_flg4.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_sub_flg4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_flg4);
		p.columnRslt_lot_sub_flg5.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_sub_flg5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_sub_flg5);
		p.columnRslt_stk_flg.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.stk_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_flg);
		p.columnRslt_sundry_itm_flg.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.sundry_itm_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sundry_itm_flg);
		p.columnRslt_cont_fctr_flg.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.cont_fctr_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_flg);
		p.columnRslt_ver_flg.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.ver_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ver_flg);
		p.columnRslt_lot_mng_typ.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_mng_typ_META);
		p.columnRslt_lot_mng_typ.addLinkBeans(p.columnRslt_lot_mng_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_mng_typ);
		p.columnRslt_lot_mng_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.lot_mng_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_mng_typ_nm);
		p.columnRslt_sublot_mng_typ.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.sublot_mng_typ_META);
		p.columnRslt_sublot_mng_typ.addLinkBeans(p.columnRslt_sublot_mng_typ_nm);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_mng_typ);
		p.columnRslt_sublot_mng_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.sublot_mng_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_mng_typ_nm);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBF.MSBFP0110.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
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
		Cnd_lot_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_lot_mng_typ.getListConfig().setPutter(getCnd_lot_mng_typ_ListPutter());
		Cnd_sublot_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sublot_mng_typ.getListConfig().setPutter(getCnd_sublot_mng_typ_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getRslt_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnRslt_mfg_aprv_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_mfg_aprv_sts_typ.getListConfig().setPutter(getRslt_mfg_aprv_sts_typ_ListPutter());
		columnRslt_stk_insp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_stk_insp_typ.getListConfig().setPutter(getRslt_stk_insp_typ_ListPutter());
		columnRslt_quality_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_quality_typ.getListConfig().setPutter(getRslt_quality_typ_ListPutter());
		columnRslt_insp_aprv_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_insp_aprv_sts_typ.getListConfig().setPutter(getRslt_insp_aprv_sts_typ_ListPutter());
		columnRslt_plnt_aprv_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_plnt_aprv_sts_typ.getListConfig().setPutter(getRslt_plnt_aprv_sts_typ_ListPutter());
		columnRslt_mrkt_judg_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_mrkt_judg_sts_typ.getListConfig().setPutter(getRslt_mrkt_judg_sts_typ_ListPutter());
		columnRslt_lmt_dt_frm_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_lmt_dt_frm_typ.getListConfig().setPutter(getRslt_lmt_dt_frm_typ_ListPutter());
		columnRslt_lot_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_lot_mng_typ.getListConfig().setPutter(getRslt_lot_mng_typ_ListPutter());
		columnRslt_sublot_mng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRslt_sublot_mng_typ.getListConfig().setPutter(getRslt_sublot_mng_typ_ListPutter());
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
	 * この画面を[FIX_U]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_UStatus() {
		status = FIX_U;
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
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
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
	 * [Cnd_lot_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_lot_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LotMngTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_sublot_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sublot_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SublotMngTyp");
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
	 * [Rslt_mfg_aprv_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_mfg_aprv_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.MfgAprvStsTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_stk_insp_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_stk_insp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.StkInspTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_quality_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_quality_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.QualityTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_insp_aprv_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_insp_aprv_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.InspAprvStsTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_plnt_aprv_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_plnt_aprv_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.PlntAprvStsTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_mrkt_judg_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_mrkt_judg_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.MrktJudgStsTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_lmt_dt_frm_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_lmt_dt_frm_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LmtDtFrmTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_lot_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_lot_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LotMngTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_sublot_mng_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_sublot_mng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SublotMngTyp");
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
		if(combo == Cnd_lot_mng_typ) return getCnd_lot_mng_typ(row, info);
		if(combo == Cnd_sublot_mng_typ) return getCnd_sublot_mng_typ(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_cd) return getRslt_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub1) return getRslt_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub2) return getRslt_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Rslt_itm_p_PPanel.columnItm_itm_sub3) return getRslt_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == Rslt_ver_no_p_PPanel.columnVerNo_ver_no) return getRslt_ver_no_p_PPanel_columnVerNo_ver_no(row, info);
		if(combo == columnRslt_mfg_aprv_sts_typ) return getRslt_mfg_aprv_sts_typ(row, info);
		if(combo == columnRslt_stk_insp_typ) return getRslt_stk_insp_typ(row, info);
		if(combo == columnRslt_quality_typ) return getRslt_quality_typ(row, info);
		if(combo == columnRslt_insp_aprv_sts_typ) return getRslt_insp_aprv_sts_typ(row, info);
		if(combo == columnRslt_plnt_aprv_sts_typ) return getRslt_plnt_aprv_sts_typ(row, info);
		if(combo == columnRslt_mrkt_judg_sts_typ) return getRslt_mrkt_judg_sts_typ(row, info);
		if(combo == columnRslt_lmt_dt_frm_typ) return getRslt_lmt_dt_frm_typ(row, info);
		if(combo == columnRslt_lot_mng_typ) return getRslt_lot_mng_typ(row, info);
		if(combo == columnRslt_sublot_mng_typ) return getRslt_sublot_mng_typ(row, info);
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
		else if (ap == Btn_open_MSBFP0120) doBtn_open_MSBFP0120(info);
		else if (ap == Btn_open_MSBFP0130) doBtn_open_MSBFP0130(info);
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
	 * [Btn]パネルの[open_MSBEP0010]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP0010(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBFP0120]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBFP0120(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBFP0130]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBFP0130(MCEventInfo info);

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
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_unreg_lmt_flg) return doCnd_unreg_lmt_flg_VC(info);
		if (vc == Cnd_stk_flg) return doCnd_stk_flg_VC(info);
		if (vc == Cnd_ver_no) return doCnd_ver_no_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_bp_lot_no) return doCnd_bp_lot_no_VC(info);
		if (vc == Cnd_first_gr_dt_fr) return doCnd_first_gr_dt_fr_VC(info);
		if (vc == Cnd_first_gr_dt_to) return doCnd_first_gr_dt_to_VC(info);
		if (vc == Cnd_vld_dt_fr) return doCnd_vld_dt_fr_VC(info);
		if (vc == Cnd_vld_dt_to) return doCnd_vld_dt_to_VC(info);
		if (vc == Cnd_lmt_dt_fr) return doCnd_lmt_dt_fr_VC(info);
		if (vc == Cnd_lmt_dt_to) return doCnd_lmt_dt_to_VC(info);
		if (vc == Cnd_lot_mng_typ) return doCnd_lot_mng_typ_VC(info);
		if (vc == Cnd_lot_mng_typ_nm) return doCnd_lot_mng_typ_nm_VC(info);
		if (vc == Cnd_sublot_mng_typ) return doCnd_sublot_mng_typ_VC(info);
		if (vc == Cnd_sublot_mng_typ_nm) return doCnd_sublot_mng_typ_nm_VC(info);
		if (vc == Cnd_lot_rmrks) return doCnd_lot_rmrks_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
		if (vc == columnRslt_lot_seq) return doRslt_lot_seq_VC(info);
		if (vc == columnRslt_schd_flg) return doRslt_schd_flg_VC(info);
		if (vc == columnRslt_first_gr_dt_save_flg) return doRslt_first_gr_dt_save_flg_VC(info);
		if (vc == columnRslt_first_gr_dt) return doRslt_first_gr_dt_VC(info);
		if (vc == columnRslt_base_gr_dt) return doRslt_base_gr_dt_VC(info);
		if (vc == columnRslt_unreg_lmt_flg) return doRslt_unreg_lmt_flg_VC(info);
		if (vc == columnRslt_vld_dt) return doRslt_vld_dt_VC(info);
		if (vc == columnRslt_lmt_dt) return doRslt_lmt_dt_VC(info);
		if (vc == columnRslt_bp_lot_no) return doRslt_bp_lot_no_VC(info);
		if (vc == columnRslt_mfg_aprv_sts_typ) return doRslt_mfg_aprv_sts_typ_VC(info);
		if (vc == columnRslt_mfg_aprv_sts_typ_nm) return doRslt_mfg_aprv_sts_typ_nm_VC(info);
		if (vc == columnRslt_stk_insp_typ) return doRslt_stk_insp_typ_VC(info);
		if (vc == columnRslt_stk_insp_typ_nm) return doRslt_stk_insp_typ_nm_VC(info);
		if (vc == columnRslt_quality_typ) return doRslt_quality_typ_VC(info);
		if (vc == columnRslt_quality_typ_nm) return doRslt_quality_typ_nm_VC(info);
		if (vc == columnRslt_insp_aprv_sts_typ) return doRslt_insp_aprv_sts_typ_VC(info);
		if (vc == columnRslt_insp_aprv_sts_typ_nm) return doRslt_insp_aprv_sts_typ_nm_VC(info);
		if (vc == columnRslt_plnt_aprv_sts_typ) return doRslt_plnt_aprv_sts_typ_VC(info);
		if (vc == columnRslt_plnt_aprv_sts_typ_nm) return doRslt_plnt_aprv_sts_typ_nm_VC(info);
		if (vc == columnRslt_mrkt_judg_sts_typ) return doRslt_mrkt_judg_sts_typ_VC(info);
		if (vc == columnRslt_mrkt_judg_sts_typ_nm) return doRslt_mrkt_judg_sts_typ_nm_VC(info);
		if (vc == columnRslt_lmt_dt_frm_typ) return doRslt_lmt_dt_frm_typ_VC(info);
		if (vc == columnRslt_lmt_dt_frm_typ_nm) return doRslt_lmt_dt_frm_typ_nm_VC(info);
		if (vc == columnRslt_lmt_dt_frm) return doRslt_lmt_dt_frm_VC(info);
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
		if (vc == columnRslt_stk_flg) return doRslt_stk_flg_VC(info);
		if (vc == columnRslt_sundry_itm_flg) return doRslt_sundry_itm_flg_VC(info);
		if (vc == columnRslt_cont_fctr_flg) return doRslt_cont_fctr_flg_VC(info);
		if (vc == columnRslt_ver_flg) return doRslt_ver_flg_VC(info);
		if (vc == columnRslt_lot_mng_typ) return doRslt_lot_mng_typ_VC(info);
		if (vc == columnRslt_lot_mng_typ_nm) return doRslt_lot_mng_typ_nm_VC(info);
		if (vc == columnRslt_sublot_mng_typ) return doRslt_sublot_mng_typ_VC(info);
		if (vc == columnRslt_sublot_mng_typ_nm) return doRslt_sublot_mng_typ_nm_VC(info);
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
	 * [Cnd]パネルの[unreg_lmt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_unreg_lmt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ver_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ver_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[first_gr_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_first_gr_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_first_gr_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[vld_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_vld_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[vld_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_vld_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lmt_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lmt_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lmt_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lmt_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sublot_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sublot_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[schd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_schd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[first_gr_dt_save_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_first_gr_dt_save_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[first_gr_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_first_gr_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_gr_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_gr_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[unreg_lmt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_unreg_lmt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[vld_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_vld_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lmt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lmt_dt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[insp_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_plnt_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_plnt_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mrkt_judg_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mrkt_judg_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lmt_dt_frm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lmt_dt_frm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lmt_dt_frm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ver_flg_VC(MCEventInfo info){
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
		else if (nc == Cnd_unreg_lmt_flg) doCnd_unreg_lmt_flg_NC(info);
		else if (nc == Cnd_stk_flg) doCnd_stk_flg_NC(info);
		else if (nc == Cnd_ver_no) doCnd_ver_no_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_bp_lot_no) doCnd_bp_lot_no_NC(info);
		else if (nc == Cnd_first_gr_dt_fr) doCnd_first_gr_dt_fr_NC(info);
		else if (nc == Cnd_first_gr_dt_to) doCnd_first_gr_dt_to_NC(info);
		else if (nc == Cnd_vld_dt_fr) doCnd_vld_dt_fr_NC(info);
		else if (nc == Cnd_vld_dt_to) doCnd_vld_dt_to_NC(info);
		else if (nc == Cnd_lmt_dt_fr) doCnd_lmt_dt_fr_NC(info);
		else if (nc == Cnd_lmt_dt_to) doCnd_lmt_dt_to_NC(info);
		else if (nc == Cnd_lot_mng_typ) doCnd_lot_mng_typ_NC(info);
		else if (nc == Cnd_lot_mng_typ_nm) doCnd_lot_mng_typ_nm_NC(info);
		else if (nc == Cnd_sublot_mng_typ) doCnd_sublot_mng_typ_NC(info);
		else if (nc == Cnd_sublot_mng_typ_nm) doCnd_sublot_mng_typ_nm_NC(info);
		else if (nc == Cnd_lot_rmrks) doCnd_lot_rmrks_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
		else if (nc == columnRslt_lot_seq) doRslt_lot_seq_NC(info);
		else if (nc == columnRslt_schd_flg) doRslt_schd_flg_NC(info);
		else if (nc == columnRslt_first_gr_dt_save_flg) doRslt_first_gr_dt_save_flg_NC(info);
		else if (nc == columnRslt_first_gr_dt) doRslt_first_gr_dt_NC(info);
		else if (nc == columnRslt_base_gr_dt) doRslt_base_gr_dt_NC(info);
		else if (nc == columnRslt_unreg_lmt_flg) doRslt_unreg_lmt_flg_NC(info);
		else if (nc == columnRslt_vld_dt) doRslt_vld_dt_NC(info);
		else if (nc == columnRslt_lmt_dt) doRslt_lmt_dt_NC(info);
		else if (nc == columnRslt_bp_lot_no) doRslt_bp_lot_no_NC(info);
		else if (nc == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_NC(info);
		else if (nc == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NC(info);
		else if (nc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NC(info);
		else if (nc == columnRslt_quality_typ) doRslt_quality_typ_NC(info);
		else if (nc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NC(info);
		else if (nc == columnRslt_insp_aprv_sts_typ) doRslt_insp_aprv_sts_typ_NC(info);
		else if (nc == columnRslt_insp_aprv_sts_typ_nm) doRslt_insp_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRslt_plnt_aprv_sts_typ) doRslt_plnt_aprv_sts_typ_NC(info);
		else if (nc == columnRslt_plnt_aprv_sts_typ_nm) doRslt_plnt_aprv_sts_typ_nm_NC(info);
		else if (nc == columnRslt_mrkt_judg_sts_typ) doRslt_mrkt_judg_sts_typ_NC(info);
		else if (nc == columnRslt_mrkt_judg_sts_typ_nm) doRslt_mrkt_judg_sts_typ_nm_NC(info);
		else if (nc == columnRslt_lmt_dt_frm_typ) doRslt_lmt_dt_frm_typ_NC(info);
		else if (nc == columnRslt_lmt_dt_frm_typ_nm) doRslt_lmt_dt_frm_typ_nm_NC(info);
		else if (nc == columnRslt_lmt_dt_frm) doRslt_lmt_dt_frm_NC(info);
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
		else if (nc == columnRslt_stk_flg) doRslt_stk_flg_NC(info);
		else if (nc == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NC(info);
		else if (nc == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NC(info);
		else if (nc == columnRslt_ver_flg) doRslt_ver_flg_NC(info);
		else if (nc == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NC(info);
		else if (nc == columnRslt_lot_mng_typ_nm) doRslt_lot_mng_typ_nm_NC(info);
		else if (nc == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NC(info);
		else if (nc == columnRslt_sublot_mng_typ_nm) doRslt_sublot_mng_typ_nm_NC(info);
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
	 * [Cnd]パネルの[unreg_lmt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unreg_lmt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ver_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[first_gr_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[first_gr_dt_save_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_first_gr_dt_save_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[first_gr_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_first_gr_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_gr_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_gr_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unreg_lmt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unreg_lmt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[insp_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_flg_NC(MCEventInfo info){
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
		else if (ne == Cnd_unreg_lmt_flg) doCnd_unreg_lmt_flg_NE(info);
		else if (ne == Cnd_stk_flg) doCnd_stk_flg_NE(info);
		else if (ne == Cnd_ver_no) doCnd_ver_no_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_bp_lot_no) doCnd_bp_lot_no_NE(info);
		else if (ne == Cnd_first_gr_dt_fr) doCnd_first_gr_dt_fr_NE(info);
		else if (ne == Cnd_first_gr_dt_to) doCnd_first_gr_dt_to_NE(info);
		else if (ne == Cnd_vld_dt_fr) doCnd_vld_dt_fr_NE(info);
		else if (ne == Cnd_vld_dt_to) doCnd_vld_dt_to_NE(info);
		else if (ne == Cnd_lmt_dt_fr) doCnd_lmt_dt_fr_NE(info);
		else if (ne == Cnd_lmt_dt_to) doCnd_lmt_dt_to_NE(info);
		else if (ne == Cnd_lot_mng_typ) doCnd_lot_mng_typ_NE(info);
		else if (ne == Cnd_lot_mng_typ_nm) doCnd_lot_mng_typ_nm_NE(info);
		else if (ne == Cnd_sublot_mng_typ) doCnd_sublot_mng_typ_NE(info);
		else if (ne == Cnd_sublot_mng_typ_nm) doCnd_sublot_mng_typ_nm_NE(info);
		else if (ne == Cnd_lot_rmrks) doCnd_lot_rmrks_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
		else if (ne == columnRslt_lot_seq) doRslt_lot_seq_NE(info);
		else if (ne == columnRslt_schd_flg) doRslt_schd_flg_NE(info);
		else if (ne == columnRslt_first_gr_dt_save_flg) doRslt_first_gr_dt_save_flg_NE(info);
		else if (ne == columnRslt_first_gr_dt) doRslt_first_gr_dt_NE(info);
		else if (ne == columnRslt_base_gr_dt) doRslt_base_gr_dt_NE(info);
		else if (ne == columnRslt_unreg_lmt_flg) doRslt_unreg_lmt_flg_NE(info);
		else if (ne == columnRslt_vld_dt) doRslt_vld_dt_NE(info);
		else if (ne == columnRslt_lmt_dt) doRslt_lmt_dt_NE(info);
		else if (ne == columnRslt_bp_lot_no) doRslt_bp_lot_no_NE(info);
		else if (ne == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_NE(info);
		else if (ne == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NE(info);
		else if (ne == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NE(info);
		else if (ne == columnRslt_quality_typ) doRslt_quality_typ_NE(info);
		else if (ne == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NE(info);
		else if (ne == columnRslt_insp_aprv_sts_typ) doRslt_insp_aprv_sts_typ_NE(info);
		else if (ne == columnRslt_insp_aprv_sts_typ_nm) doRslt_insp_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRslt_plnt_aprv_sts_typ) doRslt_plnt_aprv_sts_typ_NE(info);
		else if (ne == columnRslt_plnt_aprv_sts_typ_nm) doRslt_plnt_aprv_sts_typ_nm_NE(info);
		else if (ne == columnRslt_mrkt_judg_sts_typ) doRslt_mrkt_judg_sts_typ_NE(info);
		else if (ne == columnRslt_mrkt_judg_sts_typ_nm) doRslt_mrkt_judg_sts_typ_nm_NE(info);
		else if (ne == columnRslt_lmt_dt_frm_typ) doRslt_lmt_dt_frm_typ_NE(info);
		else if (ne == columnRslt_lmt_dt_frm_typ_nm) doRslt_lmt_dt_frm_typ_nm_NE(info);
		else if (ne == columnRslt_lmt_dt_frm) doRslt_lmt_dt_frm_NE(info);
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
		else if (ne == columnRslt_stk_flg) doRslt_stk_flg_NE(info);
		else if (ne == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NE(info);
		else if (ne == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NE(info);
		else if (ne == columnRslt_ver_flg) doRslt_ver_flg_NE(info);
		else if (ne == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NE(info);
		else if (ne == columnRslt_lot_mng_typ_nm) doRslt_lot_mng_typ_nm_NE(info);
		else if (ne == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NE(info);
		else if (ne == columnRslt_sublot_mng_typ_nm) doRslt_sublot_mng_typ_nm_NE(info);
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
	 * [Cnd]パネルの[unreg_lmt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unreg_lmt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ver_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[first_gr_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[first_gr_dt_save_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_first_gr_dt_save_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[first_gr_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_first_gr_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_gr_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_gr_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unreg_lmt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unreg_lmt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[insp_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_flg_NE(MCEventInfo info){
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
		else if (nx == Cnd_unreg_lmt_flg) doCnd_unreg_lmt_flg_NX(info);
		else if (nx == Cnd_stk_flg) doCnd_stk_flg_NX(info);
		else if (nx == Cnd_ver_no) doCnd_ver_no_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_bp_lot_no) doCnd_bp_lot_no_NX(info);
		else if (nx == Cnd_first_gr_dt_fr) doCnd_first_gr_dt_fr_NX(info);
		else if (nx == Cnd_first_gr_dt_to) doCnd_first_gr_dt_to_NX(info);
		else if (nx == Cnd_vld_dt_fr) doCnd_vld_dt_fr_NX(info);
		else if (nx == Cnd_vld_dt_to) doCnd_vld_dt_to_NX(info);
		else if (nx == Cnd_lmt_dt_fr) doCnd_lmt_dt_fr_NX(info);
		else if (nx == Cnd_lmt_dt_to) doCnd_lmt_dt_to_NX(info);
		else if (nx == Cnd_lot_mng_typ) doCnd_lot_mng_typ_NX(info);
		else if (nx == Cnd_lot_mng_typ_nm) doCnd_lot_mng_typ_nm_NX(info);
		else if (nx == Cnd_sublot_mng_typ) doCnd_sublot_mng_typ_NX(info);
		else if (nx == Cnd_sublot_mng_typ_nm) doCnd_sublot_mng_typ_nm_NX(info);
		else if (nx == Cnd_lot_rmrks) doCnd_lot_rmrks_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
		else if (nx == columnRslt_lot_seq) doRslt_lot_seq_NX(info);
		else if (nx == columnRslt_schd_flg) doRslt_schd_flg_NX(info);
		else if (nx == columnRslt_first_gr_dt_save_flg) doRslt_first_gr_dt_save_flg_NX(info);
		else if (nx == columnRslt_first_gr_dt) doRslt_first_gr_dt_NX(info);
		else if (nx == columnRslt_base_gr_dt) doRslt_base_gr_dt_NX(info);
		else if (nx == columnRslt_unreg_lmt_flg) doRslt_unreg_lmt_flg_NX(info);
		else if (nx == columnRslt_vld_dt) doRslt_vld_dt_NX(info);
		else if (nx == columnRslt_lmt_dt) doRslt_lmt_dt_NX(info);
		else if (nx == columnRslt_bp_lot_no) doRslt_bp_lot_no_NX(info);
		else if (nx == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_NX(info);
		else if (nx == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NX(info);
		else if (nx == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_NX(info);
		else if (nx == columnRslt_quality_typ) doRslt_quality_typ_NX(info);
		else if (nx == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NX(info);
		else if (nx == columnRslt_insp_aprv_sts_typ) doRslt_insp_aprv_sts_typ_NX(info);
		else if (nx == columnRslt_insp_aprv_sts_typ_nm) doRslt_insp_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRslt_plnt_aprv_sts_typ) doRslt_plnt_aprv_sts_typ_NX(info);
		else if (nx == columnRslt_plnt_aprv_sts_typ_nm) doRslt_plnt_aprv_sts_typ_nm_NX(info);
		else if (nx == columnRslt_mrkt_judg_sts_typ) doRslt_mrkt_judg_sts_typ_NX(info);
		else if (nx == columnRslt_mrkt_judg_sts_typ_nm) doRslt_mrkt_judg_sts_typ_nm_NX(info);
		else if (nx == columnRslt_lmt_dt_frm_typ) doRslt_lmt_dt_frm_typ_NX(info);
		else if (nx == columnRslt_lmt_dt_frm_typ_nm) doRslt_lmt_dt_frm_typ_nm_NX(info);
		else if (nx == columnRslt_lmt_dt_frm) doRslt_lmt_dt_frm_NX(info);
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
		else if (nx == columnRslt_stk_flg) doRslt_stk_flg_NX(info);
		else if (nx == columnRslt_sundry_itm_flg) doRslt_sundry_itm_flg_NX(info);
		else if (nx == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NX(info);
		else if (nx == columnRslt_ver_flg) doRslt_ver_flg_NX(info);
		else if (nx == columnRslt_lot_mng_typ) doRslt_lot_mng_typ_NX(info);
		else if (nx == columnRslt_lot_mng_typ_nm) doRslt_lot_mng_typ_nm_NX(info);
		else if (nx == columnRslt_sublot_mng_typ) doRslt_sublot_mng_typ_NX(info);
		else if (nx == columnRslt_sublot_mng_typ_nm) doRslt_sublot_mng_typ_nm_NX(info);
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
	 * [Cnd]パネルの[unreg_lmt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unreg_lmt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ver_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[first_gr_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[schd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_schd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[first_gr_dt_save_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_first_gr_dt_save_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[first_gr_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_first_gr_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_gr_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_gr_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unreg_lmt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unreg_lmt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[insp_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[stk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_flg_NX(MCEventInfo info){
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
		if (lc == Cnd_ver_no) doCnd_ver_no_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_bp_lot_no) doCnd_bp_lot_no_LC(info);
		else if (lc == Cnd_first_gr_dt_fr) doCnd_first_gr_dt_fr_LC(info);
		else if (lc == Cnd_first_gr_dt_to) doCnd_first_gr_dt_to_LC(info);
		else if (lc == Cnd_vld_dt_fr) doCnd_vld_dt_fr_LC(info);
		else if (lc == Cnd_vld_dt_to) doCnd_vld_dt_to_LC(info);
		else if (lc == Cnd_lmt_dt_fr) doCnd_lmt_dt_fr_LC(info);
		else if (lc == Cnd_lmt_dt_to) doCnd_lmt_dt_to_LC(info);
		else if (lc == Cnd_lot_mng_typ) doCnd_lot_mng_typ_LC(info);
		else if (lc == Cnd_lot_mng_typ_nm) doCnd_lot_mng_typ_nm_LC(info);
		else if (lc == Cnd_sublot_mng_typ) doCnd_sublot_mng_typ_LC(info);
		else if (lc == Cnd_sublot_mng_typ_nm) doCnd_sublot_mng_typ_nm_LC(info);
		else if (lc == Cnd_lot_rmrks) doCnd_lot_rmrks_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
		else if (lc == columnRslt_lot_seq) doRslt_lot_seq_LC(info);
		else if (lc == columnRslt_first_gr_dt) doRslt_first_gr_dt_LC(info);
		else if (lc == columnRslt_base_gr_dt) doRslt_base_gr_dt_LC(info);
		else if (lc == columnRslt_vld_dt) doRslt_vld_dt_LC(info);
		else if (lc == columnRslt_lmt_dt) doRslt_lmt_dt_LC(info);
		else if (lc == columnRslt_bp_lot_no) doRslt_bp_lot_no_LC(info);
		else if (lc == columnRslt_mfg_aprv_sts_typ) doRslt_mfg_aprv_sts_typ_LC(info);
		else if (lc == columnRslt_mfg_aprv_sts_typ_nm) doRslt_mfg_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_LC(info);
		else if (lc == columnRslt_stk_insp_typ_nm) doRslt_stk_insp_typ_nm_LC(info);
		else if (lc == columnRslt_quality_typ) doRslt_quality_typ_LC(info);
		else if (lc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_LC(info);
		else if (lc == columnRslt_insp_aprv_sts_typ) doRslt_insp_aprv_sts_typ_LC(info);
		else if (lc == columnRslt_insp_aprv_sts_typ_nm) doRslt_insp_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRslt_plnt_aprv_sts_typ) doRslt_plnt_aprv_sts_typ_LC(info);
		else if (lc == columnRslt_plnt_aprv_sts_typ_nm) doRslt_plnt_aprv_sts_typ_nm_LC(info);
		else if (lc == columnRslt_mrkt_judg_sts_typ) doRslt_mrkt_judg_sts_typ_LC(info);
		else if (lc == columnRslt_mrkt_judg_sts_typ_nm) doRslt_mrkt_judg_sts_typ_nm_LC(info);
		else if (lc == columnRslt_lmt_dt_frm_typ) doRslt_lmt_dt_frm_typ_LC(info);
		else if (lc == columnRslt_lmt_dt_frm_typ_nm) doRslt_lmt_dt_frm_typ_nm_LC(info);
		else if (lc == columnRslt_lmt_dt_frm) doRslt_lmt_dt_frm_LC(info);
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
	 * [Cnd]パネルの[ver_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_no_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[first_gr_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vld_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vld_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lmt_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lmt_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[first_gr_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_first_gr_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_gr_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_gr_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[insp_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[plnt_aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_plnt_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrkt_judg_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrkt_judg_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_lot_mng_typ]の作成メソッド
	 */
	public MCList getCnd_lot_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLotMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sublot_mng_typ]の作成メソッド
	 */
	public MCList getCnd_sublot_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSublotMngTyp(row, info);
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
	 * コンボ／リストのリスト[Rslt_ver_no_p_PPanel_columnVerNo_ver_no]の作成メソッド
	 */
	public MCList getRslt_ver_no_p_PPanel_columnVerNo_ver_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmVer(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_mfg_aprv_sts_typ]の作成メソッド
	 */
	public MCList getRslt_mfg_aprv_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getMfgAprvStsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_stk_insp_typ]の作成メソッド
	 */
	public MCList getRslt_stk_insp_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getStkInspTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_quality_typ]の作成メソッド
	 */
	public MCList getRslt_quality_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getQualityTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_insp_aprv_sts_typ]の作成メソッド
	 */
	public MCList getRslt_insp_aprv_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getInspAprvStsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_plnt_aprv_sts_typ]の作成メソッド
	 */
	public MCList getRslt_plnt_aprv_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getPlntAprvStsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_mrkt_judg_sts_typ]の作成メソッド
	 */
	public MCList getRslt_mrkt_judg_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getMrktJudgStsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_lmt_dt_frm_typ]の作成メソッド
	 */
	public MCList getRslt_lmt_dt_frm_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLmtDtFrmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_lot_mng_typ]の作成メソッド
	 */
	public MCList getRslt_lot_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLotMngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRslt_sublot_mng_typ]の作成メソッド
	 */
	public MCList getRslt_sublot_mng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSublotMngTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBFL0110.Srch01")) {
			return new MS_MSBFL0110_Srch01Bridge();
		}
		if (id.equals("MS.MSBFL0110.Imp01")) {
			return new MS_MSBFL0110_Imp01Bridge();
		}
		if (id.equals("MS.MSBFL0110.Upd01")) {
			return new MS_MSBFL0110_Upd01Bridge();
		}
		if (id.equals("MS.MSBFL0110.Del01")) {
			return new MS_MSBFL0110_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBFL0110_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0110_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0110_Srch01;

		/** コンストラクタ */
		protected MS_MSBFL0110_Srch01Bridge() {
			p_MS_MSBFL0110_Srch01 = new MCParam(PDef.MS_MSBFL0110_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0110_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0110.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0110.RsltR.class));

			p_MS_MSBFL0110_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0110_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0110_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0110_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0110_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0110.CndR up0() {
			return (mcframe.clientMSBF.MSBFP0110.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0110.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0110.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0110_Srch01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0110.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0110_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0110.RsltR>)p_MS_MSBFL0110_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0110_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0110_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0110_Imp01;

		/** コンストラクタ */
		protected MS_MSBFL0110_Imp01Bridge() {
			p_MS_MSBFL0110_Imp01 = new MCParam(PDef.MS_MSBFL0110_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0110_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0110.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0110.RsltR.class));

			p_MS_MSBFL0110_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0110_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0110_Imp01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0110_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0110_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0110.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0110.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0110.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0110.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0110_Imp01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0110.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0110_Imp01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0110.RsltR>)p_MS_MSBFL0110_Imp01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0110_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0110_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0110_Upd01;

		/** コンストラクタ */
		protected MS_MSBFL0110_Upd01Bridge() {
			p_MS_MSBFL0110_Upd01 = new MCParam(PDef.MS_MSBFL0110_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0110_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0110.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0110.RsltR.class));

			p_MS_MSBFL0110_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0110_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0110_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0110_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0110_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0110.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0110.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0110.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0110.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0110_Upd01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0110.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0110_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0110.RsltR>)p_MS_MSBFL0110_Upd01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0110_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0110_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0110_Del01;

		/** コンストラクタ */
		protected MS_MSBFL0110_Del01Bridge() {
			p_MS_MSBFL0110_Del01 = new MCParam(PDef.MS_MSBFL0110_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0110_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0110.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0110.RsltR.class));

			p_MS_MSBFL0110_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0110_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0110_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0110_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0110_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0110.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0110.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0110.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0110.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0110_Del01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0110.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0110_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0110.RsltR>)p_MS_MSBFL0110_Del01.getContainerParam().getDownBlock(0));
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