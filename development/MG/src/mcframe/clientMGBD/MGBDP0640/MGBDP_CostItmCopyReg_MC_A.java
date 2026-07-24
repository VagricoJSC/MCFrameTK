package mcframe.clientMGBD.MGBDP0640;

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
import mcframe.clientMGBD.MGBDP0640.MGBDP_CostItmCopyReg_MC.MG_MGBDL0640_Srch01Caller;
import mcframe.clientMGBD.MGBDP0640.MGBDP_CostItmCopyReg_MC.MG_MGBDL0640_Srch02Caller;
import mcframe.clientMGBD.MGBDP0640.MGBDP_CostItmCopyReg_MC.MG_MGBDL0640_Ins01Caller;
import mcframe.clientMGBD.MGBDP0640.MGBDP_CostItmCopyReg_MC.MG_MGBDL0640_Del01Caller;

/**
 * 画面"MGBDP_CostItmCopyReg"パネルクラスです。<p>
 *
 * 原価品目系情報の検索、コピー登録、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MGBDP_CostItmCopyReg_MC_A extends mcframe.clientMGUD.MGUDP0010.MGUDP_PanelBase{
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
	public static final String SCREEN_ID = "MGBDP0640";

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
	 * UPD,Create,0;REF_UPD,Create (with reference),9;DEL,Delete (Administrator),1;REF,View,3 UPD,登録する,0;REF_UPD,登録する（参照登録）,9;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_REF_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
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
	public mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H Cnd_term_p_PPanel;
	public MCDateComboBox Cnd_term;	// [Cnd]の[term_p.term]を[Cnd_term]としてエイリアス定義。
	public MCDateField Cnd_term_end_ym;	// [Cnd]の[term_p.term_end_ym]を[Cnd_term_end_ym]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_nm;	// [Cnd]の[itm_typ_p.itm_typ_nm]を[Cnd_itm_typ_nm]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	public MCLabel Cnd_itm_jnl_cd_Label = null;
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCTextField Cnd_itm_jnl_nm = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	/**
	 * Release リリース.<p>
	 *
	 */
	public MCLabel Cnd_release_flg_lab = null;
	/**
	 * Release. Off リリース.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_release_flg_off = null;
	/**
	 * Release. On リリース.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_release_flg_on = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCLabel Cnd_del_flg_lab = null;
	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_del_flg_off = null;
	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_del_flg_on = null;
	public MCLabel Cnd_itm_grp_cd1_Label = null;
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd1 = null;
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm1 = null;
	public MCLabel Cnd_itm_grp_cd2_Label = null;
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd2 = null;
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm2 = null;
	public MCLabel Cnd_itm_grp_cd3_Label = null;
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd3 = null;
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm3 = null;
	public MCLabel Cnd_itm_grp_cd4_Label = null;
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd4 = null;
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm4 = null;
	public MCLabel Cnd_itm_grp_cd5_Label = null;
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd5 = null;
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm5 = null;
	public MCLabel Cnd_itm_grp_cd6_Label = null;
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd6 = null;
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm6 = null;
	public MCLabel Cnd_itm_grp_cd7_Label = null;
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd7 = null;
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm7 = null;
	public MCLabel Cnd_itm_grp_cd8_Label = null;
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd8 = null;
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm8 = null;
	public MCLabel Cnd_itm_grp_cd9_Label = null;
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd9 = null;
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm9 = null;
	public MCLabel Cnd_itm_grp_cd10_Label = null;
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_grp_cd10 = null;
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_itm_grp_nm10 = null;
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Tgt]ブロック関連のField定義
	public MCPanel TgtPanel = null;
	// [Tgt]ブロックの項目のField定義
	// [TgtHdr]ブロック関連のField定義
	public MCPanel TgtHdrPanel = null;
	// [TgtHdr]ブロックの項目のField定義
	public MCLabel TgtHdr_calc_ctg_cd_Label = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextField TgtHdr_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCTextField TgtHdr_calc_ctg_nm = null;
	public mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H TgtHdr_term_p_PPanel;
	public MCDateComboBox TgtHdr_term;	// [TgtHdr]の[term_p.term]を[TgtHdr_term]としてエイリアス定義。
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMGBD.MGBDP0640.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	public mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D Dtl_term_p_PPanel;
	public MCColumnConfig columnDtl_term;// [Dtl]の[term_p.term]を[columnDtl_term]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_src_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[src_itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[src_itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[src_itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[src_itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[src_itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
	/**
	 * Standard Item name 標準品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_itm_nm = null;
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_typ_d_nm = null;
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_jnl_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_dest_itm_p_PPanel;
	public MCColumnConfig columnDtl_dest_itm_cd;// [Dtl]の[dest_itm_p.itm_cd]を[columnDtl_dest_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dest_itm_sub1;// [Dtl]の[dest_itm_p.itm_sub1]を[columnDtl_dest_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_dest_itm_sub2;// [Dtl]の[dest_itm_p.itm_sub2]を[columnDtl_dest_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_dest_itm_sub3;// [Dtl]の[dest_itm_p.itm_sub3]を[columnDtl_dest_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_dest_itm_nm;// [Dtl]の[dest_itm_p.itm_nm]を[columnDtl_dest_itm_nm]としてエイリアス定義。
	/**
	 * Item master 品目マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mam_itm_ = null;
	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mgt_itm = null;
	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mgt_itm_dtl = null;
	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mgt_itm_oper = null;
	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mgt_bom = null;
	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mgt_itm_wk = null;
	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mgt_itm_purc = null;
	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mgt_itm_proc = null;
	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mgt_itm_prov = null;
	/**
	 * Cost sales unit price 原価販売単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mgt_itm_sls = null;
	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mgt_itm_fix = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Dtl_rts_msg_p_PPanel;
	public MCColumnConfig columnDtl_rtn_sts_typ;// [Dtl]の[rts_msg_p.rtn_sts_typ]を[columnDtl_rtn_sts_typ]としてエイリアス定義。
	public MCColumnConfig columnDtl_rtn_sts_typ_nm;// [Dtl]の[rts_msg_p.rtn_sts_typ_nm]を[columnDtl_rtn_sts_typ_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_msg_id;// [Dtl]の[rts_msg_p.msg_id]を[columnDtl_msg_id]としてエイリアス定義。
	public MCColumnConfig columnDtl_msg;// [Dtl]の[rts_msg_p.msg]を[columnDtl_msg]としてエイリアス定義。
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
	// [CopyTgt]ブロック関連のField定義
	public MCPanel CopyTgtPanel = null;
	public MCTitledBorder CopyTgtTitledBorder = null;
	// [CopyTgt]ブロックの項目のField定義
	/**
	 * Item 品目.<p>
	 *
	 */
	public MCCheckBox CopyTgt_copy_mam_itm_ = null;
	/**
	 * Item master entry 品目マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABCP0310 = null;
	/**
	 * Cost item info. 原価品目情報.<p>
	 *
	 */
	public MCCheckBox CopyTgt_copy_mgt_itm = null;
	/**
	 * Cost item info. entry 原価品目情報登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MGBDP0500 = null;
	/**
	 * Cost item details 原価品目詳細.<p>
	 *
	 */
	public MCCheckBox CopyTgt_copy_mgt_itm_dtl = null;
	/**
	 * Cost item details entry 原価品目詳細登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MGBDP0510 = null;
	/**
	 * Cost item operation 原価品目工程.<p>
	 *
	 */
	public MCCheckBox CopyTgt_copy_mgt_itm_oper = null;
	/**
	 * Cost item operation entry 原価品目工程登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MGBDP0560 = null;
	/**
	 * Cost BOM 原価ＢＯＭ.<p>
	 *
	 */
	public MCCheckBox CopyTgt_copy_mgt_bom = null;
	/**
	 * Cost BOM list entry 原価ＢＯＭ一覧登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MGBDP0530 = null;
	/**
	 * Cost item man-hour 原価品目工数.<p>
	 *
	 */
	public MCCheckBox CopyTgt_copy_mgt_itm_wk = null;
	/**
	 * Cost item man-hour entry 原価品目工数登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MGBDP0580 = null;
	/**
	 * Cost purchase unit price 原価購買単価.<p>
	 *
	 */
	public MCCheckBox CopyTgt_copy_mgt_itm_purc = null;
	/**
	 * Cost item purchase unit price entry 原価品目購買単価登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MGBDP0600 = null;
	/**
	 * Cost subcontracting unit price 原価加工単価.<p>
	 *
	 */
	public MCCheckBox CopyTgt_copy_mgt_itm_proc = null;
	/**
	 * Cost item subcontracting unit price entry 原価品目加工単価登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MGBDP0660 = null;
	/**
	 * Cost supply unit price 原価支給単価.<p>
	 *
	 */
	public MCCheckBox CopyTgt_copy_mgt_itm_prov = null;
	/**
	 * Cost item supply unit price entry 原価品目支給単価登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MGBDP0610 = null;
	/**
	 * Cost sales unit price 原価販売単価.<p>
	 *
	 */
	public MCCheckBox CopyTgt_copy_mgt_itm_sls = null;
	/**
	 * Cost item sales unit price info. 原価品目販売単価登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MGBDP0590 = null;
	/**
	 * Cost item limit unit price 原価品目指値.<p>
	 *
	 */
	public MCCheckBox CopyTgt_copy_mgt_itm_fix = null;
	/**
	 * Cost item limit unit price entry 原価品目指値登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MGBDP0620 = null;
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
	public static final String[] statusArray = new String[]{SRCH, UPD, DEL, REF};
	
	/** [MG_MGBDL0640_Srch01]のCallerの作成 */
	protected MGBDP_CostItmCopyReg_MC.MG_MGBDL0640_Srch01Caller createMG_MGBDL0640_Srch01() {
		MGBDP_CostItmCopyReg_MC.MG_MGBDL0640_Srch01Caller<MGBDP_CostItmCopyReg, MG_MGBDL0640_Srch01Bridge>
		caller = ((MGBDP_CostItmCopyReg_MC)this).new MG_MGBDL0640_Srch01Caller<MGBDP_CostItmCopyReg, MG_MGBDL0640_Srch01Bridge>(
					(MGBDP_CostItmCopyReg)this, new MG_MGBDL0640_Srch01Bridge());
		return caller;
	}
	/** [MG_MGBDL0640_Srch01]の呼び出し */
	protected void callMG_MGBDL0640_Srch01() {
		MCCaller caller = createMG_MGBDL0640_Srch01();
		caller.exec();
	}
	/** [MG_MGBDL0640_Srch02]のCallerの作成 */
	protected MGBDP_CostItmCopyReg_MC.MG_MGBDL0640_Srch02Caller createMG_MGBDL0640_Srch02() {
		MGBDP_CostItmCopyReg_MC.MG_MGBDL0640_Srch02Caller<MGBDP_CostItmCopyReg, MG_MGBDL0640_Srch02Bridge>
		caller = ((MGBDP_CostItmCopyReg_MC)this).new MG_MGBDL0640_Srch02Caller<MGBDP_CostItmCopyReg, MG_MGBDL0640_Srch02Bridge>(
					(MGBDP_CostItmCopyReg)this, new MG_MGBDL0640_Srch02Bridge());
		return caller;
	}
	/** [MG_MGBDL0640_Srch02]の呼び出し */
	protected void callMG_MGBDL0640_Srch02() {
		MCCaller caller = createMG_MGBDL0640_Srch02();
		caller.exec();
	}
	/** [MG_MGBDL0640_Ins01]のCallerの作成 */
	protected MGBDP_CostItmCopyReg_MC.MG_MGBDL0640_Ins01Caller createMG_MGBDL0640_Ins01() {
		MGBDP_CostItmCopyReg_MC.MG_MGBDL0640_Ins01Caller<MGBDP_CostItmCopyReg, MG_MGBDL0640_Ins01Bridge>
		caller = ((MGBDP_CostItmCopyReg_MC)this).new MG_MGBDL0640_Ins01Caller<MGBDP_CostItmCopyReg, MG_MGBDL0640_Ins01Bridge>(
					(MGBDP_CostItmCopyReg)this, new MG_MGBDL0640_Ins01Bridge());
		return caller;
	}
	/** [MG_MGBDL0640_Ins01]の呼び出し */
	protected void callMG_MGBDL0640_Ins01() {
		MCCaller caller = createMG_MGBDL0640_Ins01();
		caller.exec();
	}
	/** [MG_MGBDL0640_Del01]のCallerの作成 */
	protected MGBDP_CostItmCopyReg_MC.MG_MGBDL0640_Del01Caller createMG_MGBDL0640_Del01() {
		MGBDP_CostItmCopyReg_MC.MG_MGBDL0640_Del01Caller<MGBDP_CostItmCopyReg, MG_MGBDL0640_Del01Bridge>
		caller = ((MGBDP_CostItmCopyReg_MC)this).new MG_MGBDL0640_Del01Caller<MGBDP_CostItmCopyReg, MG_MGBDL0640_Del01Bridge>(
					(MGBDP_CostItmCopyReg)this, new MG_MGBDL0640_Del01Bridge());
		return caller;
	}
	/** [MG_MGBDL0640_Del01]の呼び出し */
	protected void callMG_MGBDL0640_Del01() {
		MCCaller caller = createMG_MGBDL0640_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0640.CndR aCndR;
	/** [TgtHdr]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0640.TgtHdrR aTgtHdrR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMGBD.MGBDP0640.DtlR> aDtlL;
	/** [CopyTgt]ブロックのコンテナField定義 */
	private final mcframe.clientMGBD.MGBDP0640.DtlR aCopyTgtR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMGBD.MGBDP0640.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0640.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMGBD.MGBDP0640.CndR createCndR() {
		return mcframe.clientMGBD.MGBDP0640.CndR.create();
	}

	/**
	 * 項目コピーによってaTgtHdrRを設定します。
	 *
	 * aTgtHdrRのインスタンスは変更されません。
	 *
	 * @param row TgtHdrR
	 */
	public void setTgtHdrR(mcframe.clientMGBD.MGBDP0640.TgtHdrR row) {
		if (row != null) {
			MCRow.copyall(getTgtHdrR(), row);
		}
	}

	/**
	 * [TgtHdr]ブロックのコンテナaTgtHdrRを返します。
	 *
	 * @return TgtHdrR
	 */
	public mcframe.clientMGBD.MGBDP0640.TgtHdrR getTgtHdrR() {
		return aTgtHdrR;
	}

	/**
	 * aTgtHdrRを作成します。
	 *
	 * @return TgtHdrR
	 */
	public mcframe.clientMGBD.MGBDP0640.TgtHdrR createTgtHdrR() {
		return mcframe.clientMGBD.MGBDP0640.TgtHdrR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMGBD.MGBDP0640.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0640.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMGBD.MGBDP0640.DtlR createDtlR() {
		return mcframe.clientMGBD.MGBDP0640.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMGBD.MGBDP0640.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMGBD.MGBDP0640.DtlR.class);
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
	 * 項目コピーによってaCopyTgtRを設定します。
	 *
	 * aCopyTgtRのインスタンスは変更されません。
	 *
	 * @param row CopyTgtR
	 */
	public void setCopyTgtR(mcframe.clientMGBD.MGBDP0640.DtlR row) {
		if (row != null) {
			MCRow.copyall(getCopyTgtR(), row);
		}
	}

	/**
	 * [CopyTgt]ブロックのコンテナaCopyTgtRを返します。
	 *
	 * @return CopyTgtR
	 */
	public mcframe.clientMGBD.MGBDP0640.DtlR getCopyTgtR() {
		return aCopyTgtR;
	}

	/**
	 * aCopyTgtRを作成します。
	 *
	 * @return CopyTgtR
	 */
	public mcframe.clientMGBD.MGBDP0640.DtlR createCopyTgtR() {
		return mcframe.clientMGBD.MGBDP0640.DtlR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getTgtHdrR())) ret.add(getTgtHdrR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getCopyTgtR())) ret.add(getCopyTgtR());
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
		if(aCnt == getTgtHdrR()) return "TgtHdr";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getCopyTgtR()) return "CopyTgt";
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
		if(bId.equals("TgtHdr")) return getTgtHdrR();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("CopyTgt")) return getCopyTgtR();
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
		ret.add(TgtPanel);
		ret.add(TgtHdrPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(CopyTgtPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MGBDP_CostItmCopyReg_MC_A() {
		aCndR = createCndR();
		aTgtHdrR = createTgtHdrR();
		aDtlL = createDtlL();
		aCopyTgtR = createCopyTgtR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MGBDP_CostItmCopyReg_MC_A(String name) {
		aCndR = createCndR();
		aTgtHdrR = createTgtHdrR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aCopyTgtR = createCopyTgtR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MGBDP_CostItmCopyReg_MC.jbCreateScreenOpe((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbCreateTop((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbCreateFold((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbCreateTab1((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbCreateTab2((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbCreateCnd((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbCreateCnd2((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbCreateCtrl((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbCreateTgt((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbCreateTgtHdr((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbCreateDtl((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbCreateDtlBtn((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbCreateCopyTgt((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbCreateBtn((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbCreateEastBtn((MGBDP_CostItmCopyReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MGBDP_CostItmCopyReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MGBDP_CostItmCopyReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MGBDP_CostItmCopyReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MGBDP_CostItmCopyReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MGBDP_CostItmCopyReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MGBDP_CostItmCopyReg p) {
		p.Cnd_term_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getCndR().term_p());
		p.Cnd_term_p_PPanel.setName("Cnd.term_p");
		p.Cnd_term = p.Cnd_term_p_PPanel.Term_term;
		p.Cnd_term.addAliasName("Cnd.term", p);
		p.Cnd_term_end_ym = p.Cnd_term_p_PPanel.Term_term_end_ym;
		p.Cnd_term_end_ym.addAliasName("Cnd.term_end_ym", p);
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
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MGBDP_CostItmCopyReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MGBDP_CostItmCopyReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Tgt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTgt(MGBDP_CostItmCopyReg p) {
	}

	/**
	 * [TgtHdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTgtHdr(MGBDP_CostItmCopyReg p) {
		p.TgtHdr_term_p_PPanel = mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.create(p.getTgtHdrR().term_p());
		p.TgtHdr_term_p_PPanel.setName("TgtHdr.term_p");
		p.TgtHdr_term = p.TgtHdr_term_p_PPanel.Term_term;
		p.TgtHdr_term.addAliasName("TgtHdr.term", p);
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MGBDP_CostItmCopyReg p) {
		p.Dtl_term_p_PPanel = mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.create(mcframe.clientMGBD.MGBDP0640.DtlR.$term_p);
		p.Dtl_term_p_PPanel.setName("Dtl.term_p");
		p.columnDtl_term = p.Dtl_term_p_PPanel.columnTerm_term;
		p.columnDtl_term.addAliasName("Dtl.term", p);
		p.Dtl_src_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBD.MGBDP0640.DtlR.$src_itm_p);
		p.Dtl_src_itm_p_PPanel.setName("Dtl.src_itm_p");
		p.columnDtl_itm_cd = p.Dtl_src_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_itm_cd.addAliasName("Dtl.itm_cd", p);
		p.columnDtl_itm_sub1 = p.Dtl_src_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_itm_sub1.addAliasName("Dtl.itm_sub1", p);
		p.columnDtl_itm_sub2 = p.Dtl_src_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_itm_sub2.addAliasName("Dtl.itm_sub2", p);
		p.columnDtl_itm_sub3 = p.Dtl_src_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_itm_sub3.addAliasName("Dtl.itm_sub3", p);
		p.columnDtl_itm_nm = p.Dtl_src_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_itm_nm.addAliasName("Dtl.itm_nm", p);
		p.Dtl_dest_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMGBD.MGBDP0640.DtlR.$dest_itm_p);
		p.Dtl_dest_itm_p_PPanel.setName("Dtl.dest_itm_p");
		p.columnDtl_dest_itm_cd = p.Dtl_dest_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_dest_itm_cd.addAliasName("Dtl.dest_itm_cd", p);
		p.columnDtl_dest_itm_sub1 = p.Dtl_dest_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_dest_itm_sub1.addAliasName("Dtl.dest_itm_sub1", p);
		p.columnDtl_dest_itm_sub2 = p.Dtl_dest_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_dest_itm_sub2.addAliasName("Dtl.dest_itm_sub2", p);
		p.columnDtl_dest_itm_sub3 = p.Dtl_dest_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_dest_itm_sub3.addAliasName("Dtl.dest_itm_sub3", p);
		p.columnDtl_dest_itm_nm = p.Dtl_dest_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_dest_itm_nm.addAliasName("Dtl.dest_itm_nm", p);
		p.Dtl_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMGBD.MGBDP0640.DtlR.$rts_msg_p);
		p.Dtl_rts_msg_p_PPanel.setName("Dtl.rts_msg_p");
		p.columnDtl_rtn_sts_typ = p.Dtl_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnDtl_rtn_sts_typ.addAliasName("Dtl.rtn_sts_typ", p);
		p.columnDtl_rtn_sts_typ_nm = p.Dtl_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ_nm;
		p.columnDtl_rtn_sts_typ_nm.addAliasName("Dtl.rtn_sts_typ_nm", p);
		p.columnDtl_msg_id = p.Dtl_rts_msg_p_PPanel.columnRtnMsg_msg_id;
		p.columnDtl_msg_id.addAliasName("Dtl.msg_id", p);
		p.columnDtl_msg = p.Dtl_rts_msg_p_PPanel.columnRtnMsg_msg;
		p.columnDtl_msg.addAliasName("Dtl.msg", p);
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MGBDP_CostItmCopyReg p) {
	}

	/**
	 * [CopyTgt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCopyTgt(MGBDP_CostItmCopyReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MGBDP_CostItmCopyReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MGBDP_CostItmCopyReg p) {
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
	
	
	/** [Cnd_itm_jnl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_jnl_cd_p = null;

	/**
	 * [Cnd_itm_jnl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_jnl_cd_ListPutter() {
		if (Cnd_itm_jnl_cd_p == null) {
			Cnd_itm_jnl_cd_p = createCnd_itm_jnl_cd_ListPutter(Cnd_itm_jnl_cd, "itm_jnl_cd", "itm_jnl_nm");

		}
		return Cnd_itm_jnl_cd_p;
	}
	
	
	/** [Cnd_itm_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd1_p = null;

	/**
	 * [Cnd_itm_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd1_ListPutter() {
		if (Cnd_itm_grp_cd1_p == null) {
			Cnd_itm_grp_cd1_p = createCnd_itm_grp_cd1_ListPutter(Cnd_itm_grp_cd1, "itm_grp_cd1", "itm_grp_nm1");

		}
		return Cnd_itm_grp_cd1_p;
	}
	
	
	/** [Cnd_itm_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd2_p = null;

	/**
	 * [Cnd_itm_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd2_ListPutter() {
		if (Cnd_itm_grp_cd2_p == null) {
			Cnd_itm_grp_cd2_p = createCnd_itm_grp_cd2_ListPutter(Cnd_itm_grp_cd2, "itm_grp_cd2", "itm_grp_nm2");

		}
		return Cnd_itm_grp_cd2_p;
	}
	
	
	/** [Cnd_itm_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd3_p = null;

	/**
	 * [Cnd_itm_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd3_ListPutter() {
		if (Cnd_itm_grp_cd3_p == null) {
			Cnd_itm_grp_cd3_p = createCnd_itm_grp_cd3_ListPutter(Cnd_itm_grp_cd3, "itm_grp_cd3", "itm_grp_nm3");

		}
		return Cnd_itm_grp_cd3_p;
	}
	
	
	/** [Cnd_itm_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd4_p = null;

	/**
	 * [Cnd_itm_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd4_ListPutter() {
		if (Cnd_itm_grp_cd4_p == null) {
			Cnd_itm_grp_cd4_p = createCnd_itm_grp_cd4_ListPutter(Cnd_itm_grp_cd4, "itm_grp_cd4", "itm_grp_nm4");

		}
		return Cnd_itm_grp_cd4_p;
	}
	
	
	/** [Cnd_itm_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd5_p = null;

	/**
	 * [Cnd_itm_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd5_ListPutter() {
		if (Cnd_itm_grp_cd5_p == null) {
			Cnd_itm_grp_cd5_p = createCnd_itm_grp_cd5_ListPutter(Cnd_itm_grp_cd5, "itm_grp_cd5", "itm_grp_nm5");

		}
		return Cnd_itm_grp_cd5_p;
	}
	
	
	/** [Cnd_itm_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd6_p = null;

	/**
	 * [Cnd_itm_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd6_ListPutter() {
		if (Cnd_itm_grp_cd6_p == null) {
			Cnd_itm_grp_cd6_p = createCnd_itm_grp_cd6_ListPutter(Cnd_itm_grp_cd6, "itm_grp_cd6", "itm_grp_nm6");

		}
		return Cnd_itm_grp_cd6_p;
	}
	
	
	/** [Cnd_itm_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd7_p = null;

	/**
	 * [Cnd_itm_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd7_ListPutter() {
		if (Cnd_itm_grp_cd7_p == null) {
			Cnd_itm_grp_cd7_p = createCnd_itm_grp_cd7_ListPutter(Cnd_itm_grp_cd7, "itm_grp_cd7", "itm_grp_nm7");

		}
		return Cnd_itm_grp_cd7_p;
	}
	
	
	/** [Cnd_itm_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd8_p = null;

	/**
	 * [Cnd_itm_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd8_ListPutter() {
		if (Cnd_itm_grp_cd8_p == null) {
			Cnd_itm_grp_cd8_p = createCnd_itm_grp_cd8_ListPutter(Cnd_itm_grp_cd8, "itm_grp_cd8", "itm_grp_nm8");

		}
		return Cnd_itm_grp_cd8_p;
	}
	
	
	/** [Cnd_itm_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd9_p = null;

	/**
	 * [Cnd_itm_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd9_ListPutter() {
		if (Cnd_itm_grp_cd9_p == null) {
			Cnd_itm_grp_cd9_p = createCnd_itm_grp_cd9_ListPutter(Cnd_itm_grp_cd9, "itm_grp_cd9", "itm_grp_nm9");

		}
		return Cnd_itm_grp_cd9_p;
	}
	
	
	/** [Cnd_itm_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_itm_grp_cd10_p = null;

	/**
	 * [Cnd_itm_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_grp_cd10_ListPutter() {
		if (Cnd_itm_grp_cd10_p == null) {
			Cnd_itm_grp_cd10_p = createCnd_itm_grp_cd10_ListPutter(Cnd_itm_grp_cd10, "itm_grp_cd10", "itm_grp_nm10");

		}
		return Cnd_itm_grp_cd10_p;
	}
	
	
	/** [TgtHdr_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter TgtHdr_calc_ctg_cd_p = null;

	/**
	 * [TgtHdr_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getTgtHdr_calc_ctg_cd_ListPutter() {
		if (TgtHdr_calc_ctg_cd_p == null) {
			TgtHdr_calc_ctg_cd_p = createTgtHdr_calc_ctg_cd_ListPutter(TgtHdr_calc_ctg_cd, "calc_ctg_cd", "calc_ctg_nm");

		}
		return TgtHdr_calc_ctg_cd_p;
	}
	
	
	/** [Dtl_itm_typ_ListPutter]の定義 */
	private MCListPutter Dtl_itm_typ_p = null;

	/**
	 * [Dtl_itm_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_typ_ListPutter() {
		if (Dtl_itm_typ_p == null) {
			Dtl_itm_typ_p = createDtl_itm_typ_ListPutter(columnDtl_itm_typ, "itm_typ");

		}
		return Dtl_itm_typ_p;
	}
	
	
	/** [Dtl_itm_typ_d_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_typ_d_cd_p = null;

	/**
	 * [Dtl_itm_typ_d_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_typ_d_cd_ListPutter() {
		if (Dtl_itm_typ_d_cd_p == null) {
			Dtl_itm_typ_d_cd_p = createDtl_itm_typ_d_cd_ListPutter(columnDtl_itm_typ_d_cd, "itm_typ_d_cd");

		}
		return Dtl_itm_typ_d_cd_p;
	}
	
	
	/** [Dtl_itm_jnl_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_jnl_cd_p = null;

	/**
	 * [Dtl_itm_jnl_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_jnl_cd_ListPutter() {
		if (Dtl_itm_jnl_cd_p == null) {
			Dtl_itm_jnl_cd_p = createDtl_itm_jnl_cd_ListPutter(columnDtl_itm_jnl_cd, "itm_jnl_cd");

		}
		return Dtl_itm_jnl_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_CostItmCopyReg create(){
		MGBDP_CostItmCopyReg p = new MGBDP_CostItmCopyReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MGBDP_CostItmCopyReg create(String name){
		MGBDP_CostItmCopyReg p = new MGBDP_CostItmCopyReg(name);
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
		MGBDP_CostItmCopyReg_MC.jbfInitScreenOpe((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbfInitTop((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbfInitFold((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbfInitTab1((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbfInitTab2((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbfInitCnd((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbfInitCnd2((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbfInitCtrl((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbfInitTgt((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbfInitTgtHdr((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbfInitDtl((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbfInitDtlBtn((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbfInitCopyTgt((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbfInitBtn((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbfInitEastBtn((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbInitScreenOpe((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbInitTop((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbInitFold((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbInitTab1((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbInitTab2((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbInitCnd((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbInitCnd2((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbInitCtrl((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbInitTgt((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbInitTgtHdr((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbInitDtl((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbInitDtlBtn((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbInitCopyTgt((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbInitBtn((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.jbInitEastBtn((MGBDP_CostItmCopyReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MGBDP_CostItmCopyReg p) {
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
	protected static void jbfInitTab1(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_REF_UPD = p.beansFactory.createRadioButton("Cnd.ope_REF_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.calc_ctg_cd_Label");
		p.Cnd_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.calc_ctg_cd");
		p.Cnd_calc_ctg_cd.setLabel(p.Cnd_calc_ctg_cd_Label);
		p.Cnd_calc_ctg_nm = p.beansFactory.createTextField("Cnd.calc_ctg_nm");
		p.Cnd_itm_jnl_cd_Label = p.beansFactory.createLabel("Cnd.itm_jnl_cd_Label");
		p.Cnd_itm_jnl_cd = p.beansFactory.createTextComboBox("Cnd.itm_jnl_cd");
		p.Cnd_itm_jnl_cd.setLabel(p.Cnd_itm_jnl_cd_Label);
		p.Cnd_itm_jnl_nm = p.beansFactory.createTextField("Cnd.itm_jnl_nm");
		p.Cnd_release_flg_lab = p.beansFactory.createLabel("Cnd.release_flg_lab");
		p.Cnd_release_flg_off = p.beansFactory.createCheckBox("Cnd.release_flg_off");
		p.Cnd_release_flg_on = p.beansFactory.createCheckBox("Cnd.release_flg_on");
		p.Cnd_del_flg_lab = p.beansFactory.createLabel("Cnd.del_flg_lab");
		p.Cnd_del_flg_off = p.beansFactory.createCheckBox("Cnd.del_flg_off");
		p.Cnd_del_flg_on = p.beansFactory.createCheckBox("Cnd.del_flg_on");
		p.Cnd_itm_grp_cd1_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd1_Label");
		p.Cnd_itm_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd1");
		p.Cnd_itm_grp_cd1.setLabel(p.Cnd_itm_grp_cd1_Label);
		p.Cnd_itm_grp_nm1 = p.beansFactory.createTextField("Cnd.itm_grp_nm1");
		p.Cnd_itm_grp_cd2_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd2_Label");
		p.Cnd_itm_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd2");
		p.Cnd_itm_grp_cd2.setLabel(p.Cnd_itm_grp_cd2_Label);
		p.Cnd_itm_grp_nm2 = p.beansFactory.createTextField("Cnd.itm_grp_nm2");
		p.Cnd_itm_grp_cd3_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd3_Label");
		p.Cnd_itm_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd3");
		p.Cnd_itm_grp_cd3.setLabel(p.Cnd_itm_grp_cd3_Label);
		p.Cnd_itm_grp_nm3 = p.beansFactory.createTextField("Cnd.itm_grp_nm3");
		p.Cnd_itm_grp_cd4_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd4_Label");
		p.Cnd_itm_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd4");
		p.Cnd_itm_grp_cd4.setLabel(p.Cnd_itm_grp_cd4_Label);
		p.Cnd_itm_grp_nm4 = p.beansFactory.createTextField("Cnd.itm_grp_nm4");
		p.Cnd_itm_grp_cd5_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd5_Label");
		p.Cnd_itm_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd5");
		p.Cnd_itm_grp_cd5.setLabel(p.Cnd_itm_grp_cd5_Label);
		p.Cnd_itm_grp_nm5 = p.beansFactory.createTextField("Cnd.itm_grp_nm5");
		p.Cnd_itm_grp_cd6_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd6_Label");
		p.Cnd_itm_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd6");
		p.Cnd_itm_grp_cd6.setLabel(p.Cnd_itm_grp_cd6_Label);
		p.Cnd_itm_grp_nm6 = p.beansFactory.createTextField("Cnd.itm_grp_nm6");
		p.Cnd_itm_grp_cd7_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd7_Label");
		p.Cnd_itm_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd7");
		p.Cnd_itm_grp_cd7.setLabel(p.Cnd_itm_grp_cd7_Label);
		p.Cnd_itm_grp_nm7 = p.beansFactory.createTextField("Cnd.itm_grp_nm7");
		p.Cnd_itm_grp_cd8_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd8_Label");
		p.Cnd_itm_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd8");
		p.Cnd_itm_grp_cd8.setLabel(p.Cnd_itm_grp_cd8_Label);
		p.Cnd_itm_grp_nm8 = p.beansFactory.createTextField("Cnd.itm_grp_nm8");
		p.Cnd_itm_grp_cd9_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd9_Label");
		p.Cnd_itm_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd9");
		p.Cnd_itm_grp_cd9.setLabel(p.Cnd_itm_grp_cd9_Label);
		p.Cnd_itm_grp_nm9 = p.beansFactory.createTextField("Cnd.itm_grp_nm9");
		p.Cnd_itm_grp_cd10_Label = p.beansFactory.createLabel("Cnd.itm_grp_cd10_Label");
		p.Cnd_itm_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.itm_grp_cd10");
		p.Cnd_itm_grp_cd10.setLabel(p.Cnd_itm_grp_cd10_Label);
		p.Cnd_itm_grp_nm10 = p.beansFactory.createTextField("Cnd.itm_grp_nm10");
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Tgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTgt(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.TgtPanel = p.beansFactory.createPanel("Tgt");
		// ブロックの項目の初期化
	}

	/**
	 * [TgtHdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTgtHdr(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.TgtHdrPanel = p.beansFactory.createPanel("TgtHdr");
		// ブロックの項目の初期化
		p.TgtHdr_calc_ctg_cd_Label = p.beansFactory.createLabel("TgtHdr.calc_ctg_cd_Label");
		p.TgtHdr_calc_ctg_cd = p.beansFactory.createTextField("TgtHdr.calc_ctg_cd");
		p.TgtHdr_calc_ctg_cd.setLabel(p.TgtHdr_calc_ctg_cd_Label);
		p.TgtHdr_calc_ctg_nm = p.beansFactory.createTextField("TgtHdr.calc_ctg_nm");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_base_itm_nm = p.beansFactory.createTableColumn("Dtl.base_itm_nm", MCColumnType.TEXT);
		p.columnDtl_itm_typ = p.beansFactory.createTableColumn("Dtl.itm_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.itm_typ_d_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_itm_jnl_cd = p.beansFactory.createTableColumn("Dtl.itm_jnl_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_jnl_nm = p.beansFactory.createTableColumn("Dtl.itm_jnl_nm", MCColumnType.TEXT);
		p.columnDtl_mam_itm_ = p.beansFactory.createTableColumn("Dtl.mam_itm_", MCColumnType.NUMBER);
		p.columnDtl_mgt_itm = p.beansFactory.createTableColumn("Dtl.mgt_itm", MCColumnType.NUMBER);
		p.columnDtl_mgt_itm_dtl = p.beansFactory.createTableColumn("Dtl.mgt_itm_dtl", MCColumnType.NUMBER);
		p.columnDtl_mgt_itm_oper = p.beansFactory.createTableColumn("Dtl.mgt_itm_oper", MCColumnType.NUMBER);
		p.columnDtl_mgt_bom = p.beansFactory.createTableColumn("Dtl.mgt_bom", MCColumnType.NUMBER);
		p.columnDtl_mgt_itm_wk = p.beansFactory.createTableColumn("Dtl.mgt_itm_wk", MCColumnType.NUMBER);
		p.columnDtl_mgt_itm_purc = p.beansFactory.createTableColumn("Dtl.mgt_itm_purc", MCColumnType.NUMBER);
		p.columnDtl_mgt_itm_proc = p.beansFactory.createTableColumn("Dtl.mgt_itm_proc", MCColumnType.NUMBER);
		p.columnDtl_mgt_itm_prov = p.beansFactory.createTableColumn("Dtl.mgt_itm_prov", MCColumnType.NUMBER);
		p.columnDtl_mgt_itm_sls = p.beansFactory.createTableColumn("Dtl.mgt_itm_sls", MCColumnType.NUMBER);
		p.columnDtl_mgt_itm_fix = p.beansFactory.createTableColumn("Dtl.mgt_itm_fix", MCColumnType.NUMBER);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_select_all = p.beansFactory.createButton("DtlBtn.select_all", "no_border");
		p.DtlBtn_deselect_all = p.beansFactory.createButton("DtlBtn.deselect_all", "no_border");
	}

	/**
	 * [CopyTgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCopyTgt(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.CopyTgtPanel = p.beansFactory.createPanel("CopyTgt");
		p.CopyTgtTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.CopyTgt_copy_mam_itm_ = p.beansFactory.createCheckBox("CopyTgt.copy_mam_itm_");
		p.CopyTgt_open_MABCP0310 = p.beansFactory.createButton("CopyTgt.open_MABCP0310", "open");
		p.CopyTgt_copy_mgt_itm = p.beansFactory.createCheckBox("CopyTgt.copy_mgt_itm");
		p.CopyTgt_open_MGBDP0500 = p.beansFactory.createButton("CopyTgt.open_MGBDP0500", "open");
		p.CopyTgt_copy_mgt_itm_dtl = p.beansFactory.createCheckBox("CopyTgt.copy_mgt_itm_dtl");
		p.CopyTgt_open_MGBDP0510 = p.beansFactory.createButton("CopyTgt.open_MGBDP0510", "open");
		p.CopyTgt_copy_mgt_itm_oper = p.beansFactory.createCheckBox("CopyTgt.copy_mgt_itm_oper");
		p.CopyTgt_open_MGBDP0560 = p.beansFactory.createButton("CopyTgt.open_MGBDP0560", "open");
		p.CopyTgt_copy_mgt_bom = p.beansFactory.createCheckBox("CopyTgt.copy_mgt_bom");
		p.CopyTgt_open_MGBDP0530 = p.beansFactory.createButton("CopyTgt.open_MGBDP0530", "open");
		p.CopyTgt_copy_mgt_itm_wk = p.beansFactory.createCheckBox("CopyTgt.copy_mgt_itm_wk");
		p.CopyTgt_open_MGBDP0580 = p.beansFactory.createButton("CopyTgt.open_MGBDP0580", "open");
		p.CopyTgt_copy_mgt_itm_purc = p.beansFactory.createCheckBox("CopyTgt.copy_mgt_itm_purc");
		p.CopyTgt_open_MGBDP0600 = p.beansFactory.createButton("CopyTgt.open_MGBDP0600", "open");
		p.CopyTgt_copy_mgt_itm_proc = p.beansFactory.createCheckBox("CopyTgt.copy_mgt_itm_proc");
		p.CopyTgt_open_MGBDP0660 = p.beansFactory.createButton("CopyTgt.open_MGBDP0660", "open");
		p.CopyTgt_copy_mgt_itm_prov = p.beansFactory.createCheckBox("CopyTgt.copy_mgt_itm_prov");
		p.CopyTgt_open_MGBDP0610 = p.beansFactory.createButton("CopyTgt.open_MGBDP0610", "open");
		p.CopyTgt_copy_mgt_itm_sls = p.beansFactory.createCheckBox("CopyTgt.copy_mgt_itm_sls");
		p.CopyTgt_open_MGBDP0590 = p.beansFactory.createButton("CopyTgt.open_MGBDP0590", "open");
		p.CopyTgt_copy_mgt_itm_fix = p.beansFactory.createCheckBox("CopyTgt.copy_mgt_itm_fix");
		p.CopyTgt_open_MGBDP0620 = p.beansFactory.createButton("CopyTgt.open_MGBDP0620", "open");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MGBDP_CostItmCopyReg p) {
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
	protected static void jbInitTop(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.TgtPanel);
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
	protected static void jbInitFold(MGBDP_CostItmCopyReg p) {
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
	protected static void jbInitTab1(MGBDP_CostItmCopyReg p) {
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
	protected static void jbInitTab2(MGBDP_CostItmCopyReg p) {
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
	protected static void jbInitCnd(MGBDP_CostItmCopyReg p) {
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
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_REF_UPD);
		p.Cnd_ope_REF_UPD.setActionCommand("9");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_REF_UPD);
		p.Cnd_ope_REF_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.ope_META);
		p.Cnd_calc_ctg_cd.setListType(MCListType.STRICT);
		p.Cnd_calc_ctg_cd.setLinkBeans(p.Cnd_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_calc_ctg_cd);
		p.CndPanel.setLastBeans(p.Cnd_calc_ctg_cd);
		p.Cnd_calc_ctg_cd.setNextBeans(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_nm.setNextBeans(p.Cnd_term_p_PPanel);
		p.Cnd_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.calc_ctg_nm_META);
		p.CndPanel.add(p.Cnd_term_p_PPanel);
		p.Cnd_term_p_PPanel.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_jnl_cd, true);
		p.Cnd_itm_jnl_cd.setLinkBeans(p.Cnd_itm_jnl_nm);
		p.CndPanel.add(p.Cnd_itm_jnl_cd_Label);
		p.CndPanel.add(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setNextBeans(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_cd.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_jnl_cd_META);
		p.CndPanel.add(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_jnl_nm.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_jnl_nm_META);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_release_flg_off);
		p.CndPanel.add(p.Cnd_release_flg_lab);
		p.CndPanel.add(p.Cnd_release_flg_off);
		p.Cnd_release_flg_off.setNextBeans(p.Cnd_release_flg_on);
		p.Cnd_release_flg_off.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.release_flg_off_META);
		p.CndPanel.add(p.Cnd_release_flg_on);
		p.Cnd_release_flg_on.setNextBeans(p.Cnd_del_flg_off);
		p.Cnd_release_flg_on.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.release_flg_on_META);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_del_flg_off);
		p.Cnd_del_flg_off.setNextBeans(p.Cnd_del_flg_on);
		p.Cnd_del_flg_off.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.del_flg_off_META);
		p.CndPanel.add(p.Cnd_del_flg_on);
		p.Cnd_del_flg_on.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.del_flg_on_META);
		p.Cnd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd1, true);
		p.Cnd_itm_grp_cd1.setLinkBeans(p.Cnd_itm_grp_nm1);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_cd1);
		p.Cnd_itm_grp_cd1.setNextBeans(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_grp_cd1_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_nm1.setNextBeans(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm1, true);
		p.Cnd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd2, true);
		p.Cnd_itm_grp_cd2.setLinkBeans(p.Cnd_itm_grp_nm2);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_cd2.setNextBeans(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_grp_cd2_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_nm2.setNextBeans(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm2, true);
		p.Cnd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd3, true);
		p.Cnd_itm_grp_cd3.setLinkBeans(p.Cnd_itm_grp_nm3);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_cd3.setNextBeans(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_grp_cd3_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_nm3.setNextBeans(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm3, true);
		p.Cnd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd4, true);
		p.Cnd_itm_grp_cd4.setLinkBeans(p.Cnd_itm_grp_nm4);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_cd4.setNextBeans(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_grp_cd4_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_nm4.setNextBeans(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm4, true);
		p.Cnd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd5, true);
		p.Cnd_itm_grp_cd5.setLinkBeans(p.Cnd_itm_grp_nm5);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_cd5.setNextBeans(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_grp_cd5_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_nm5.setNextBeans(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm5, true);
		p.Cnd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd6, true);
		p.Cnd_itm_grp_cd6.setLinkBeans(p.Cnd_itm_grp_nm6);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_cd6.setNextBeans(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_grp_cd6_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_nm6.setNextBeans(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm6, true);
		p.Cnd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd7, true);
		p.Cnd_itm_grp_cd7.setLinkBeans(p.Cnd_itm_grp_nm7);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_cd7.setNextBeans(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_grp_cd7_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_nm7.setNextBeans(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm7, true);
		p.Cnd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd8, true);
		p.Cnd_itm_grp_cd8.setLinkBeans(p.Cnd_itm_grp_nm8);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_cd8.setNextBeans(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_grp_cd8_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_nm8.setNextBeans(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm8, true);
		p.Cnd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd9, true);
		p.Cnd_itm_grp_cd9.setLinkBeans(p.Cnd_itm_grp_nm9);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_cd9.setNextBeans(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_grp_cd9_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_nm9.setNextBeans(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm9, true);
		p.Cnd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd10, true);
		p.Cnd_itm_grp_cd10.setLinkBeans(p.Cnd_itm_grp_nm10);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_cd10.setNextBeans(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_grp_cd10_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMGBD.MGBDP0640.CndR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm10, true);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Tgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTgt(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.add(p.TgtPanel);
		p.TgtPanel.setNextBeans(p.DtlBtnPanel);
		p.TgtPanel.setLayoutPosition("CBC+");
		// ブロックの項目の初期化
		p.TgtPanel.add(p.TgtHdrPanel, null);
		p.TgtPanel.setLastBeans(p.TgtHdrPanel);
		p.TgtHdrPanel.setNextBeans(p.DtlPanel);
		p.TgtPanel.add(p.DtlPanel, null);
	}

	/**
	 * [TgtHdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTgtHdr(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.TgtHdrPanel.setValueCheck(false);
		p.TgtHdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.TgtHdrPanel.add(p.TgtHdr_calc_ctg_cd_Label);
		p.TgtHdrPanel.add(p.TgtHdr_calc_ctg_cd);
		p.TgtHdrPanel.setLastBeans(p.TgtHdr_calc_ctg_cd);
		p.TgtHdr_calc_ctg_cd.setNextBeans(p.TgtHdr_calc_ctg_nm);
		p.TgtHdr_calc_ctg_cd.setRow(p.getTgtHdrR(), mcframe.clientMGBD.MGBDP0640.TgtHdrR.calc_ctg_cd_META);
		p.TgtHdr_calc_ctg_cd.addLinkBeans(p.TgtHdr_calc_ctg_nm);
		p.TgtHdr_calc_ctg_cd.setListType(MCListType.FREE);
		p.TgtHdrPanel.add(p.TgtHdr_calc_ctg_nm);
		p.TgtHdr_calc_ctg_nm.setNextBeans(p.TgtHdr_term_p_PPanel);
		p.TgtHdr_calc_ctg_nm.setRow(p.getTgtHdrR(), mcframe.clientMGBD.MGBDP0640.TgtHdrR.calc_ctg_nm_META);
		p.TgtHdrPanel.add(p.TgtHdr_term_p_PPanel);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlTable.setStatusColumnVisible(false);
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.add(p.DtlBtnPanel);
		p.DtlBtnPanel.setNextBeans(p.CopyTgtPanel);
		p.DtlBtnPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.DtlBtn_select_all.setIcon("SELECT_ALL");
		p.DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.DtlBtnPanel.add(p.DtlBtn_select_all);
		p.DtlBtnPanel.setLastBeans(p.DtlBtn_select_all);
		p.DtlBtn_select_all.setNextBeans(p.DtlBtn_deselect_all);
		p.DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.DtlBtnPanel.add(p.DtlBtn_deselect_all);
	}

	/**
	 * [CopyTgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCopyTgt(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.CopyTgtPanel.setBorder(p.CopyTgtTitledBorder);
		p.add(p.CopyTgtPanel);
		p.CopyTgtPanel.setNextBeans(p.BtnPanel);
		p.CopyTgtPanel.setValueCheck(false);
		p.CopyTgtPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CopyTgtPanel.add(p.CopyTgt_copy_mam_itm_);
		p.CopyTgtPanel.setLastBeans(p.CopyTgt_copy_mam_itm_);
		p.CopyTgt_copy_mam_itm_.setNextBeans(p.CopyTgt_open_MABCP0310);
		p.CopyTgt_copy_mam_itm_.setRow(p.getCopyTgtR(), mcframe.clientMGBD.MGBDP0640.DtlR.copy_mam_itm__META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABCP0310);
		p.CopyTgt_open_MABCP0310.setNextBeans(p.CopyTgt_copy_mgt_itm);
		p.CopyTgtPanel.add(p.CopyTgt_copy_mgt_itm);
		p.CopyTgt_copy_mgt_itm.setNextBeans(p.CopyTgt_open_MGBDP0500);
		p.CopyTgt_copy_mgt_itm.setRow(p.getCopyTgtR(), mcframe.clientMGBD.MGBDP0640.DtlR.copy_mgt_itm_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MGBDP0500);
		p.CopyTgt_open_MGBDP0500.setNextBeans(p.CopyTgt_copy_mgt_itm_dtl);
		p.CopyTgtPanel.add(p.CopyTgt_copy_mgt_itm_dtl);
		p.CopyTgt_copy_mgt_itm_dtl.setNextBeans(p.CopyTgt_open_MGBDP0510);
		p.CopyTgt_copy_mgt_itm_dtl.setRow(p.getCopyTgtR(), mcframe.clientMGBD.MGBDP0640.DtlR.copy_mgt_itm_dtl_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MGBDP0510);
		p.CopyTgt_open_MGBDP0510.setNextBeans(p.CopyTgt_copy_mgt_itm_oper);
		p.CopyTgtPanel.add(p.CopyTgt_copy_mgt_itm_oper);
		p.CopyTgt_copy_mgt_itm_oper.setNextBeans(p.CopyTgt_open_MGBDP0560);
		p.CopyTgt_copy_mgt_itm_oper.setRow(p.getCopyTgtR(), mcframe.clientMGBD.MGBDP0640.DtlR.copy_mgt_itm_oper_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MGBDP0560);
		p.CopyTgt_open_MGBDP0560.setNextBeans(p.CopyTgt_copy_mgt_bom);
		p.CopyTgtPanel.add(p.CopyTgt_copy_mgt_bom);
		p.CopyTgt_copy_mgt_bom.setNextBeans(p.CopyTgt_open_MGBDP0530);
		p.CopyTgt_copy_mgt_bom.setRow(p.getCopyTgtR(), mcframe.clientMGBD.MGBDP0640.DtlR.copy_mgt_bom_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MGBDP0530);
		p.CopyTgt_open_MGBDP0530.setNextBeans(p.CopyTgt_copy_mgt_itm_wk);
		p.CopyTgtPanel.add(p.CopyTgt_copy_mgt_itm_wk);
		p.CopyTgt_copy_mgt_itm_wk.setNextBeans(p.CopyTgt_open_MGBDP0580);
		p.CopyTgt_copy_mgt_itm_wk.setRow(p.getCopyTgtR(), mcframe.clientMGBD.MGBDP0640.DtlR.copy_mgt_itm_wk_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MGBDP0580);
		p.CopyTgt_open_MGBDP0580.setNextBeans(p.CopyTgt_copy_mgt_itm_purc);
		p.CopyTgtPanel.add(p.CopyTgt_copy_mgt_itm_purc);
		p.CopyTgt_copy_mgt_itm_purc.setNextBeans(p.CopyTgt_open_MGBDP0600);
		p.CopyTgt_copy_mgt_itm_purc.setRow(p.getCopyTgtR(), mcframe.clientMGBD.MGBDP0640.DtlR.copy_mgt_itm_purc_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MGBDP0600);
		p.CopyTgt_open_MGBDP0600.setNextBeans(p.CopyTgt_copy_mgt_itm_proc);
		p.CopyTgtPanel.add(p.CopyTgt_copy_mgt_itm_proc);
		p.CopyTgt_copy_mgt_itm_proc.setNextBeans(p.CopyTgt_open_MGBDP0660);
		p.CopyTgt_copy_mgt_itm_proc.setRow(p.getCopyTgtR(), mcframe.clientMGBD.MGBDP0640.DtlR.copy_mgt_itm_proc_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MGBDP0660);
		p.CopyTgt_open_MGBDP0660.setNextBeans(p.CopyTgt_copy_mgt_itm_prov);
		p.CopyTgtPanel.add(p.CopyTgt_copy_mgt_itm_prov);
		p.CopyTgt_copy_mgt_itm_prov.setNextBeans(p.CopyTgt_open_MGBDP0610);
		p.CopyTgt_copy_mgt_itm_prov.setRow(p.getCopyTgtR(), mcframe.clientMGBD.MGBDP0640.DtlR.copy_mgt_itm_prov_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MGBDP0610);
		p.CopyTgt_open_MGBDP0610.setNextBeans(p.CopyTgt_copy_mgt_itm_sls);
		p.CopyTgtPanel.add(p.CopyTgt_copy_mgt_itm_sls);
		p.CopyTgt_copy_mgt_itm_sls.setNextBeans(p.CopyTgt_open_MGBDP0590);
		p.CopyTgt_copy_mgt_itm_sls.setRow(p.getCopyTgtR(), mcframe.clientMGBD.MGBDP0640.DtlR.copy_mgt_itm_sls_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MGBDP0590);
		p.CopyTgt_open_MGBDP0590.setNextBeans(p.CopyTgt_copy_mgt_itm_fix);
		p.CopyTgtPanel.add(p.CopyTgt_copy_mgt_itm_fix);
		p.CopyTgt_copy_mgt_itm_fix.setNextBeans(p.CopyTgt_open_MGBDP0620);
		p.CopyTgt_copy_mgt_itm_fix.setRow(p.getCopyTgtR(), mcframe.clientMGBD.MGBDP0640.DtlR.copy_mgt_itm_fix_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MGBDP0620);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SSW");
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
	protected static void jbInitEastBtn(MGBDP_CostItmCopyReg p) {
		// ブロック関連の初期化
		p.add(p.EastBtnPanel);
		p.EastBtnPanel.setLayoutPosition("SSE");
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
		MGBDP_CostItmCopyReg_MC.mcInitScreenOpe((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.mcInitTop((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.mcInitFold((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.mcInitTab1((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.mcInitTab2((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.mcInitCnd((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.mcInitCnd2((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.mcInitCtrl((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.mcInitTgt((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.mcInitTgtHdr((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.mcInitDtl((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.mcInitDtlBtn((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.mcInitCopyTgt((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.mcInitBtn((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.mcInitEastBtn((MGBDP_CostItmCopyReg)this);

		// [SRCH]ステータスのモードの設定
		MGBDP_CostItmCopyReg_MC.statusInitSRCH_ScreenOpe((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitSRCH_Top((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitSRCH_Fold((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitSRCH_Tab1((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitSRCH_Tab2((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitSRCH_Cnd((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitSRCH_Cnd2((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitSRCH_Ctrl((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitSRCH_Tgt((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitSRCH_TgtHdr((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitSRCH_Dtl((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitSRCH_DtlBtn((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitSRCH_CopyTgt((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitSRCH_Btn((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitSRCH_EastBtn((MGBDP_CostItmCopyReg)this);

		// [UPD]ステータスのモードの設定
		MGBDP_CostItmCopyReg_MC.statusInitUPD_ScreenOpe((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitUPD_Top((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitUPD_Fold((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitUPD_Tab1((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitUPD_Tab2((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitUPD_Cnd((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitUPD_Cnd2((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitUPD_Ctrl((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitUPD_Tgt((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitUPD_TgtHdr((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitUPD_Dtl((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitUPD_DtlBtn((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitUPD_CopyTgt((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitUPD_Btn((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitUPD_EastBtn((MGBDP_CostItmCopyReg)this);

		// [DEL]ステータスのモードの設定
		MGBDP_CostItmCopyReg_MC.statusInitDEL_ScreenOpe((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitDEL_Top((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitDEL_Fold((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitDEL_Tab1((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitDEL_Tab2((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitDEL_Cnd((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitDEL_Cnd2((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitDEL_Ctrl((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitDEL_Tgt((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitDEL_TgtHdr((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitDEL_Dtl((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitDEL_DtlBtn((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitDEL_CopyTgt((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitDEL_Btn((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitDEL_EastBtn((MGBDP_CostItmCopyReg)this);

		// [REF]ステータスのモードの設定
		MGBDP_CostItmCopyReg_MC.statusInitREF_ScreenOpe((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitREF_Top((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitREF_Fold((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitREF_Tab1((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitREF_Tab2((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitREF_Cnd((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitREF_Cnd2((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitREF_Ctrl((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitREF_Tgt((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitREF_TgtHdr((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitREF_Dtl((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitREF_DtlBtn((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitREF_CopyTgt((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitREF_Btn((MGBDP_CostItmCopyReg)this);
		MGBDP_CostItmCopyReg_MC.statusInitREF_EastBtn((MGBDP_CostItmCopyReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MGBDP_CostItmCopyReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MGBDP_CostItmCopyReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MGBDP_CostItmCopyReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MGBDP_CostItmCopyReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MGBDP_CostItmCopyReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MGBDP_CostItmCopyReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_REF_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_calc_ctg_cd.setListListener(p);
		p.Cnd_calc_ctg_cd.addAllListener(p);
		p.Cnd_calc_ctg_nm.setListListener(p);
		p.Cnd_calc_ctg_nm.addAllListener(p);
		p.Cnd_itm_jnl_cd.setListListener(p);
		p.Cnd_itm_jnl_cd.addAllListener(p);
		p.Cnd_itm_jnl_nm.setListListener(p);
		p.Cnd_itm_jnl_nm.addAllListener(p);
		p.Cnd_release_flg_off.addAllListener(p);
		p.Cnd_release_flg_on.addAllListener(p);
		p.Cnd_del_flg_off.addAllListener(p);
		p.Cnd_del_flg_on.addAllListener(p);
		p.Cnd_itm_grp_cd1.setListListener(p);
		p.Cnd_itm_grp_cd1.addAllListener(p);
		p.Cnd_itm_grp_nm1.setListListener(p);
		p.Cnd_itm_grp_nm1.addAllListener(p);
		p.Cnd_itm_grp_cd2.setListListener(p);
		p.Cnd_itm_grp_cd2.addAllListener(p);
		p.Cnd_itm_grp_nm2.setListListener(p);
		p.Cnd_itm_grp_nm2.addAllListener(p);
		p.Cnd_itm_grp_cd3.setListListener(p);
		p.Cnd_itm_grp_cd3.addAllListener(p);
		p.Cnd_itm_grp_nm3.setListListener(p);
		p.Cnd_itm_grp_nm3.addAllListener(p);
		p.Cnd_itm_grp_cd4.setListListener(p);
		p.Cnd_itm_grp_cd4.addAllListener(p);
		p.Cnd_itm_grp_nm4.setListListener(p);
		p.Cnd_itm_grp_nm4.addAllListener(p);
		p.Cnd_itm_grp_cd5.setListListener(p);
		p.Cnd_itm_grp_cd5.addAllListener(p);
		p.Cnd_itm_grp_nm5.setListListener(p);
		p.Cnd_itm_grp_nm5.addAllListener(p);
		p.Cnd_itm_grp_cd6.setListListener(p);
		p.Cnd_itm_grp_cd6.addAllListener(p);
		p.Cnd_itm_grp_nm6.setListListener(p);
		p.Cnd_itm_grp_nm6.addAllListener(p);
		p.Cnd_itm_grp_cd7.setListListener(p);
		p.Cnd_itm_grp_cd7.addAllListener(p);
		p.Cnd_itm_grp_nm7.setListListener(p);
		p.Cnd_itm_grp_nm7.addAllListener(p);
		p.Cnd_itm_grp_cd8.setListListener(p);
		p.Cnd_itm_grp_cd8.addAllListener(p);
		p.Cnd_itm_grp_nm8.setListListener(p);
		p.Cnd_itm_grp_nm8.addAllListener(p);
		p.Cnd_itm_grp_cd9.setListListener(p);
		p.Cnd_itm_grp_cd9.addAllListener(p);
		p.Cnd_itm_grp_nm9.setListListener(p);
		p.Cnd_itm_grp_nm9.addAllListener(p);
		p.Cnd_itm_grp_cd10.setListListener(p);
		p.Cnd_itm_grp_cd10.addAllListener(p);
		p.Cnd_itm_grp_nm10.setListListener(p);
		p.Cnd_itm_grp_nm10.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MGBDP_CostItmCopyReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MGBDP_CostItmCopyReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Tgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTgt(MGBDP_CostItmCopyReg p) {
	}

	/**
	 *  [TgtHdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTgtHdr(MGBDP_CostItmCopyReg p) {
		p.TgtHdr_calc_ctg_cd.setListListener(p);
		p.TgtHdr_calc_ctg_cd.addAllListener(p);
		p.TgtHdr_calc_ctg_nm.setListListener(p);
		p.TgtHdr_calc_ctg_nm.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MGBDP_CostItmCopyReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_base_itm_nm.addAllListener(p);
		p.columnDtl_base_itm_nm.setListListener(p);
		p.columnDtl_itm_typ.addAllListener(p);
		p.columnDtl_itm_typ.setListListener(p);
		p.columnDtl_itm_typ_nm.addAllListener(p);
		p.columnDtl_itm_typ_nm.setListListener(p);
		p.columnDtl_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_itm_typ_d_cd.setListListener(p);
		p.columnDtl_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_itm_typ_d_nm.setListListener(p);
		p.columnDtl_itm_jnl_cd.addAllListener(p);
		p.columnDtl_itm_jnl_cd.setListListener(p);
		p.columnDtl_itm_jnl_nm.addAllListener(p);
		p.columnDtl_itm_jnl_nm.setListListener(p);
		p.columnDtl_mam_itm_.addAllListener(p);
		p.columnDtl_mam_itm_.setListListener(p);
		p.columnDtl_mgt_itm.addAllListener(p);
		p.columnDtl_mgt_itm.setListListener(p);
		p.columnDtl_mgt_itm_dtl.addAllListener(p);
		p.columnDtl_mgt_itm_dtl.setListListener(p);
		p.columnDtl_mgt_itm_oper.addAllListener(p);
		p.columnDtl_mgt_itm_oper.setListListener(p);
		p.columnDtl_mgt_bom.addAllListener(p);
		p.columnDtl_mgt_bom.setListListener(p);
		p.columnDtl_mgt_itm_wk.addAllListener(p);
		p.columnDtl_mgt_itm_wk.setListListener(p);
		p.columnDtl_mgt_itm_purc.addAllListener(p);
		p.columnDtl_mgt_itm_purc.setListListener(p);
		p.columnDtl_mgt_itm_proc.addAllListener(p);
		p.columnDtl_mgt_itm_proc.setListListener(p);
		p.columnDtl_mgt_itm_prov.addAllListener(p);
		p.columnDtl_mgt_itm_prov.setListListener(p);
		p.columnDtl_mgt_itm_sls.addAllListener(p);
		p.columnDtl_mgt_itm_sls.setListListener(p);
		p.columnDtl_mgt_itm_fix.addAllListener(p);
		p.columnDtl_mgt_itm_fix.setListListener(p);
	}

	/**
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MGBDP_CostItmCopyReg p) {
		p.DtlBtn_select_all.addAllListener(p);
		p.DtlBtn_select_all.setAPMethodName("doDtlBtn_select_all");
		p.DtlBtn_deselect_all.addAllListener(p);
		p.DtlBtn_deselect_all.setAPMethodName("doDtlBtn_deselect_all");
	}

	/**
	 *  [CopyTgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCopyTgt(MGBDP_CostItmCopyReg p) {
		p.CopyTgt_copy_mam_itm_.addAllListener(p);
		p.CopyTgt_open_MABCP0310.addAllListener(p);
		p.CopyTgt_open_MABCP0310.setAPMethodName("doCopyTgt_open_MABCP0310");
		p.CopyTgt_copy_mgt_itm.addAllListener(p);
		p.CopyTgt_open_MGBDP0500.addAllListener(p);
		p.CopyTgt_open_MGBDP0500.setAPMethodName("doCopyTgt_open_MGBDP0500");
		p.CopyTgt_copy_mgt_itm_dtl.addAllListener(p);
		p.CopyTgt_open_MGBDP0510.addAllListener(p);
		p.CopyTgt_open_MGBDP0510.setAPMethodName("doCopyTgt_open_MGBDP0510");
		p.CopyTgt_copy_mgt_itm_oper.addAllListener(p);
		p.CopyTgt_open_MGBDP0560.addAllListener(p);
		p.CopyTgt_open_MGBDP0560.setAPMethodName("doCopyTgt_open_MGBDP0560");
		p.CopyTgt_copy_mgt_bom.addAllListener(p);
		p.CopyTgt_open_MGBDP0530.addAllListener(p);
		p.CopyTgt_open_MGBDP0530.setAPMethodName("doCopyTgt_open_MGBDP0530");
		p.CopyTgt_copy_mgt_itm_wk.addAllListener(p);
		p.CopyTgt_open_MGBDP0580.addAllListener(p);
		p.CopyTgt_open_MGBDP0580.setAPMethodName("doCopyTgt_open_MGBDP0580");
		p.CopyTgt_copy_mgt_itm_purc.addAllListener(p);
		p.CopyTgt_open_MGBDP0600.addAllListener(p);
		p.CopyTgt_open_MGBDP0600.setAPMethodName("doCopyTgt_open_MGBDP0600");
		p.CopyTgt_copy_mgt_itm_proc.addAllListener(p);
		p.CopyTgt_open_MGBDP0660.addAllListener(p);
		p.CopyTgt_open_MGBDP0660.setAPMethodName("doCopyTgt_open_MGBDP0660");
		p.CopyTgt_copy_mgt_itm_prov.addAllListener(p);
		p.CopyTgt_open_MGBDP0610.addAllListener(p);
		p.CopyTgt_open_MGBDP0610.setAPMethodName("doCopyTgt_open_MGBDP0610");
		p.CopyTgt_copy_mgt_itm_sls.addAllListener(p);
		p.CopyTgt_open_MGBDP0590.addAllListener(p);
		p.CopyTgt_open_MGBDP0590.setAPMethodName("doCopyTgt_open_MGBDP0590");
		p.CopyTgt_copy_mgt_itm_fix.addAllListener(p);
		p.CopyTgt_open_MGBDP0620.addAllListener(p);
		p.CopyTgt_open_MGBDP0620.setAPMethodName("doCopyTgt_open_MGBDP0620");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MGBDP_CostItmCopyReg p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MGBDP_CostItmCopyReg p) {
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MGBDP_CostItmCopyReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_release_flg_off.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_release_flg_on.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_del_flg_off.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_del_flg_on.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_itm_grp_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd2(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [SRCH]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tgt(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [SRCH]ステータスの[TgtHdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_TgtHdr(MGBDP_CostItmCopyReg p){
		p.TgtHdr_calc_ctg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.TgtHdr_calc_ctg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.TgtHdr_term_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MGBDP_CostItmCopyReg p){
		p.columnDtl_check.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_term_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.INVISIBLE);
		p.Dtl_src_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_base_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_dest_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_mam_itm_.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_dtl.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_oper.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mgt_bom.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_wk.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_purc.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_proc.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_prov.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_sls.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_fix.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlBtn(MGBDP_CostItmCopyReg p){
		p.DtlBtn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[CopyTgt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_CopyTgt(MGBDP_CostItmCopyReg p){
		p.CopyTgt_copy_mam_itm_.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0310.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CopyTgt_copy_mgt_itm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0500.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CopyTgt_copy_mgt_itm_dtl.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0510.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CopyTgt_copy_mgt_itm_oper.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0560.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CopyTgt_copy_mgt_bom.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0530.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CopyTgt_copy_mgt_itm_wk.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0580.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CopyTgt_copy_mgt_itm_purc.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0600.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CopyTgt_copy_mgt_itm_proc.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0660.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CopyTgt_copy_mgt_itm_prov.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0610.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CopyTgt_copy_mgt_itm_sls.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0590.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CopyTgt_copy_mgt_itm_fix.putMode(p, SRCH, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0620.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MGBDP_CostItmCopyReg p){
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MGBDP_CostItmCopyReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_release_flg_off.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_release_flg_on.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_del_flg_off.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_del_flg_on.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_itm_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd2(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [UPD]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tgt(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [UPD]ステータスの[TgtHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_TgtHdr(MGBDP_CostItmCopyReg p){
		p.TgtHdr_calc_ctg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.TgtHdr_calc_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.TgtHdr_term_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MGBDP_CostItmCopyReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_term_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.INVISIBLE);
		p.Dtl_src_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_base_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_dest_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_mam_itm_.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_dtl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_oper.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mgt_bom.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_wk.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_purc.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_proc.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_prov.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_sls.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_fix.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtn(MGBDP_CostItmCopyReg p){
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[CopyTgt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CopyTgt(MGBDP_CostItmCopyReg p){
		p.CopyTgt_copy_mam_itm_.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0310.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_open_MGBDP0500.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_dtl.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_open_MGBDP0510.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_oper.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_open_MGBDP0560.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_bom.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_open_MGBDP0530.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_wk.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_open_MGBDP0580.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_purc.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_open_MGBDP0600.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_proc.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_open_MGBDP0660.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_prov.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_open_MGBDP0610.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_sls.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_open_MGBDP0590.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_fix.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_open_MGBDP0620.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MGBDP_CostItmCopyReg p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MGBDP_CostItmCopyReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_release_flg_off.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_release_flg_on.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_del_flg_off.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_del_flg_on.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_itm_grp_cd1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd2(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [DEL]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tgt(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [DEL]ステータスの[TgtHdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_TgtHdr(MGBDP_CostItmCopyReg p){
		p.TgtHdr_calc_ctg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.TgtHdr_calc_ctg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.TgtHdr_term_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MGBDP_CostItmCopyReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.Dtl_term_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.INVISIBLE);
		p.Dtl_src_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_base_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_dest_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl_mam_itm_.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_dtl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_oper.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mgt_bom.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_wk.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_purc.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_proc.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_prov.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_sls.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_fix.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtn(MGBDP_CostItmCopyReg p){
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[CopyTgt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_CopyTgt(MGBDP_CostItmCopyReg p){
		p.CopyTgt_copy_mam_itm_.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0310.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0500.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_dtl.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0510.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_oper.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0560.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_bom.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0530.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_wk.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0580.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_purc.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0600.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_proc.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0660.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_prov.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0610.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_sls.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0590.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_fix.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0620.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MGBDP_CostItmCopyReg p){
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MGBDP_CostItmCopyReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.REQUIRED);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_release_flg_off.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_release_flg_on.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_del_flg_off.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_del_flg_on.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_itm_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [REF]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tgt(MGBDP_CostItmCopyReg p){

	}

	/**
	 * [REF]ステータスの[TgtHdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_TgtHdr(MGBDP_CostItmCopyReg p){
		p.TgtHdr_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.TgtHdr_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.TgtHdr_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0230.MAUBP_Term_H.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MGBDP_CostItmCopyReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_term_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5160.MAUBP_Term_D.INVISIBLE);
		p.Dtl_src_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_base_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_dest_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_mam_itm_.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_dtl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_oper.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mgt_bom.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_wk.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_purc.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_proc.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_prov.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_sls.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mgt_itm_fix.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtn(MGBDP_CostItmCopyReg p){
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[CopyTgt]ブロックのモードの設定
	 */
	protected static void statusInitREF_CopyTgt(MGBDP_CostItmCopyReg p){
		p.CopyTgt_copy_mam_itm_.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0310.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0500.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_dtl.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0510.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_oper.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0560.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_bom.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0530.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_wk.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0580.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_purc.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0600.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_proc.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0660.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_prov.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0610.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_sls.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0590.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_copy_mgt_itm_fix.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MGBDP0620.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MGBDP_CostItmCopyReg p){
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MGBDP_CostItmCopyReg p){

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
		MGBDP_CostItmCopyReg_MC.setTableConfigDtl((MGBDP_CostItmCopyReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MGBDP_CostItmCopyReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMGBD.MGBDP0640.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.DtlTable.addTable(p.Dtl_term_p_PPanel.TermTable);
		p.DtlTable.addTable(p.Dtl_src_itm_p_PPanel.ItmTable);
		p.columnDtl_base_itm_nm.setMeta(mcframe.clientMGBD.MGBDP0640.DtlR.base_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_itm_nm);
		p.columnDtl_itm_typ.setMeta(mcframe.clientMGBD.MGBDP0640.DtlR.itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ);
		p.columnDtl_itm_typ_nm.setMeta(mcframe.clientMGBD.MGBDP0640.DtlR.itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_nm);
		p.columnDtl_itm_typ_d_cd.setMeta(mcframe.clientMGBD.MGBDP0640.DtlR.itm_typ_d_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_cd);
		p.columnDtl_itm_typ_d_nm.setMeta(mcframe.clientMGBD.MGBDP0640.DtlR.itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_nm);
		p.columnDtl_itm_jnl_cd.setMeta(mcframe.clientMGBD.MGBDP0640.DtlR.itm_jnl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_jnl_cd);
		p.columnDtl_itm_jnl_nm.setMeta(mcframe.clientMGBD.MGBDP0640.DtlR.itm_jnl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_jnl_nm);
		p.DtlTable.addTable(p.Dtl_dest_itm_p_PPanel.ItmTable);
		p.columnDtl_mam_itm_.setMeta(mcframe.clientMGBD.MGBDP0640.DtlR.mam_itm__META);
		p.DtlTable.addColumnConfig(p.columnDtl_mam_itm_);
		p.columnDtl_mgt_itm.setMeta(mcframe.clientMGBD.MGBDP0640.DtlR.mgt_itm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mgt_itm);
		p.columnDtl_mgt_itm_dtl.setMeta(mcframe.clientMGBD.MGBDP0640.DtlR.mgt_itm_dtl_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mgt_itm_dtl);
		p.columnDtl_mgt_itm_oper.setMeta(mcframe.clientMGBD.MGBDP0640.DtlR.mgt_itm_oper_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mgt_itm_oper);
		p.columnDtl_mgt_bom.setMeta(mcframe.clientMGBD.MGBDP0640.DtlR.mgt_bom_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mgt_bom);
		p.columnDtl_mgt_itm_wk.setMeta(mcframe.clientMGBD.MGBDP0640.DtlR.mgt_itm_wk_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mgt_itm_wk);
		p.columnDtl_mgt_itm_purc.setMeta(mcframe.clientMGBD.MGBDP0640.DtlR.mgt_itm_purc_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mgt_itm_purc);
		p.columnDtl_mgt_itm_proc.setMeta(mcframe.clientMGBD.MGBDP0640.DtlR.mgt_itm_proc_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mgt_itm_proc);
		p.columnDtl_mgt_itm_prov.setMeta(mcframe.clientMGBD.MGBDP0640.DtlR.mgt_itm_prov_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mgt_itm_prov);
		p.columnDtl_mgt_itm_sls.setMeta(mcframe.clientMGBD.MGBDP0640.DtlR.mgt_itm_sls_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mgt_itm_sls);
		p.columnDtl_mgt_itm_fix.setMeta(mcframe.clientMGBD.MGBDP0640.DtlR.mgt_itm_fix_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mgt_itm_fix);
		p.DtlTable.addTable(p.Dtl_rts_msg_p_PPanel.RtnMsgTable);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_ctg_cd.getListConfig().setPutter(getCnd_calc_ctg_cd_ListPutter());
		Cnd_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_jnl_cd.getListConfig().setPutter(getCnd_itm_jnl_cd_ListPutter());
		Cnd_itm_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd1.getListConfig().setPutter(getCnd_itm_grp_cd1_ListPutter());
		Cnd_itm_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd2.getListConfig().setPutter(getCnd_itm_grp_cd2_ListPutter());
		Cnd_itm_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd3.getListConfig().setPutter(getCnd_itm_grp_cd3_ListPutter());
		Cnd_itm_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd4.getListConfig().setPutter(getCnd_itm_grp_cd4_ListPutter());
		Cnd_itm_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd5.getListConfig().setPutter(getCnd_itm_grp_cd5_ListPutter());
		Cnd_itm_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd6.getListConfig().setPutter(getCnd_itm_grp_cd6_ListPutter());
		Cnd_itm_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd7.getListConfig().setPutter(getCnd_itm_grp_cd7_ListPutter());
		Cnd_itm_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd8.getListConfig().setPutter(getCnd_itm_grp_cd8_ListPutter());
		Cnd_itm_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd9.getListConfig().setPutter(getCnd_itm_grp_cd9_ListPutter());
		Cnd_itm_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_grp_cd10.getListConfig().setPutter(getCnd_itm_grp_cd10_ListPutter());
		TgtHdr_calc_ctg_cd.getListConfig().setPutter(getTgtHdr_calc_ctg_cd_ListPutter());
		columnDtl_itm_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_typ.getListConfig().setPutter(getDtl_itm_typ_ListPutter());
		columnDtl_itm_typ_d_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_typ_d_cd.getListConfig().setPutter(getDtl_itm_typ_d_cd_ListPutter());
		columnDtl_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_jnl_cd.getListConfig().setPutter(getDtl_itm_jnl_cd_ListPutter());
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
		if (SRCH.equals(status)) {
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
	 * [Cnd_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_jnl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_jnl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmJnl");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp10");
		return lp;
	}
	 
	/**
	 * [TgtHdr_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createTgtHdr_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_typ_d_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_typ_d_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_jnl_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_jnl_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_calc_ctg_cd) return getCnd_calc_ctg_cd(row, info);
		if(combo == Cnd_itm_jnl_cd) return getCnd_itm_jnl_cd(row, info);
		if(combo == Cnd_itm_grp_cd1) return getCnd_itm_grp_cd1(row, info);
		if(combo == Cnd_itm_grp_cd2) return getCnd_itm_grp_cd2(row, info);
		if(combo == Cnd_itm_grp_cd3) return getCnd_itm_grp_cd3(row, info);
		if(combo == Cnd_itm_grp_cd4) return getCnd_itm_grp_cd4(row, info);
		if(combo == Cnd_itm_grp_cd5) return getCnd_itm_grp_cd5(row, info);
		if(combo == Cnd_itm_grp_cd6) return getCnd_itm_grp_cd6(row, info);
		if(combo == Cnd_itm_grp_cd7) return getCnd_itm_grp_cd7(row, info);
		if(combo == Cnd_itm_grp_cd8) return getCnd_itm_grp_cd8(row, info);
		if(combo == Cnd_itm_grp_cd9) return getCnd_itm_grp_cd9(row, info);
		if(combo == Cnd_itm_grp_cd10) return getCnd_itm_grp_cd10(row, info);
		if(combo == TgtHdr_calc_ctg_cd) return getTgtHdr_calc_ctg_cd(row, info);
		if(combo == columnDtl_itm_typ) return getDtl_itm_typ(row, info);
		if(combo == columnDtl_itm_typ_d_cd) return getDtl_itm_typ_d_cd(row, info);
		if(combo == columnDtl_itm_jnl_cd) return getDtl_itm_jnl_cd(row, info);
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
		else if (ap == CopyTgt_open_MABCP0310) doCopyTgt_open_MABCP0310(info);
		else if (ap == CopyTgt_open_MGBDP0500) doCopyTgt_open_MGBDP0500(info);
		else if (ap == CopyTgt_open_MGBDP0510) doCopyTgt_open_MGBDP0510(info);
		else if (ap == CopyTgt_open_MGBDP0560) doCopyTgt_open_MGBDP0560(info);
		else if (ap == CopyTgt_open_MGBDP0530) doCopyTgt_open_MGBDP0530(info);
		else if (ap == CopyTgt_open_MGBDP0580) doCopyTgt_open_MGBDP0580(info);
		else if (ap == CopyTgt_open_MGBDP0600) doCopyTgt_open_MGBDP0600(info);
		else if (ap == CopyTgt_open_MGBDP0660) doCopyTgt_open_MGBDP0660(info);
		else if (ap == CopyTgt_open_MGBDP0610) doCopyTgt_open_MGBDP0610(info);
		else if (ap == CopyTgt_open_MGBDP0590) doCopyTgt_open_MGBDP0590(info);
		else if (ap == CopyTgt_open_MGBDP0620) doCopyTgt_open_MGBDP0620(info);
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
	 * [CopyTgt]パネルの[open_MABCP0310]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABCP0310(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MGBDP0500]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MGBDP0500(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MGBDP0510]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MGBDP0510(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MGBDP0560]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MGBDP0560(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MGBDP0530]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MGBDP0530(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MGBDP0580]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MGBDP0580(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MGBDP0600]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MGBDP0600(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MGBDP0660]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MGBDP0660(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MGBDP0610]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MGBDP0610(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MGBDP0590]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MGBDP0590(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MGBDP0620]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MGBDP0620(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_calc_ctg_cd) return doCnd_calc_ctg_cd_VC(info);
		if (vc == Cnd_calc_ctg_nm) return doCnd_calc_ctg_nm_VC(info);
		if (vc == Cnd_itm_jnl_cd) return doCnd_itm_jnl_cd_VC(info);
		if (vc == Cnd_itm_jnl_nm) return doCnd_itm_jnl_nm_VC(info);
		if (vc == Cnd_release_flg_off) return doCnd_release_flg_off_VC(info);
		if (vc == Cnd_release_flg_on) return doCnd_release_flg_on_VC(info);
		if (vc == Cnd_del_flg_off) return doCnd_del_flg_off_VC(info);
		if (vc == Cnd_del_flg_on) return doCnd_del_flg_on_VC(info);
		if (vc == Cnd_itm_grp_cd1) return doCnd_itm_grp_cd1_VC(info);
		if (vc == Cnd_itm_grp_nm1) return doCnd_itm_grp_nm1_VC(info);
		if (vc == Cnd_itm_grp_cd2) return doCnd_itm_grp_cd2_VC(info);
		if (vc == Cnd_itm_grp_nm2) return doCnd_itm_grp_nm2_VC(info);
		if (vc == Cnd_itm_grp_cd3) return doCnd_itm_grp_cd3_VC(info);
		if (vc == Cnd_itm_grp_nm3) return doCnd_itm_grp_nm3_VC(info);
		if (vc == Cnd_itm_grp_cd4) return doCnd_itm_grp_cd4_VC(info);
		if (vc == Cnd_itm_grp_nm4) return doCnd_itm_grp_nm4_VC(info);
		if (vc == Cnd_itm_grp_cd5) return doCnd_itm_grp_cd5_VC(info);
		if (vc == Cnd_itm_grp_nm5) return doCnd_itm_grp_nm5_VC(info);
		if (vc == Cnd_itm_grp_cd6) return doCnd_itm_grp_cd6_VC(info);
		if (vc == Cnd_itm_grp_nm6) return doCnd_itm_grp_nm6_VC(info);
		if (vc == Cnd_itm_grp_cd7) return doCnd_itm_grp_cd7_VC(info);
		if (vc == Cnd_itm_grp_nm7) return doCnd_itm_grp_nm7_VC(info);
		if (vc == Cnd_itm_grp_cd8) return doCnd_itm_grp_cd8_VC(info);
		if (vc == Cnd_itm_grp_nm8) return doCnd_itm_grp_nm8_VC(info);
		if (vc == Cnd_itm_grp_cd9) return doCnd_itm_grp_cd9_VC(info);
		if (vc == Cnd_itm_grp_nm9) return doCnd_itm_grp_nm9_VC(info);
		if (vc == Cnd_itm_grp_cd10) return doCnd_itm_grp_cd10_VC(info);
		if (vc == Cnd_itm_grp_nm10) return doCnd_itm_grp_nm10_VC(info);
		if (vc == TgtHdr_calc_ctg_cd) return doTgtHdr_calc_ctg_cd_VC(info);
		if (vc == TgtHdr_calc_ctg_nm) return doTgtHdr_calc_ctg_nm_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_base_itm_nm) return doDtl_base_itm_nm_VC(info);
		if (vc == columnDtl_itm_typ) return doDtl_itm_typ_VC(info);
		if (vc == columnDtl_itm_typ_nm) return doDtl_itm_typ_nm_VC(info);
		if (vc == columnDtl_itm_typ_d_cd) return doDtl_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_itm_typ_d_nm) return doDtl_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_itm_jnl_cd) return doDtl_itm_jnl_cd_VC(info);
		if (vc == columnDtl_itm_jnl_nm) return doDtl_itm_jnl_nm_VC(info);
		if (vc == columnDtl_mam_itm_) return doDtl_mam_itm__VC(info);
		if (vc == columnDtl_mgt_itm) return doDtl_mgt_itm_VC(info);
		if (vc == columnDtl_mgt_itm_dtl) return doDtl_mgt_itm_dtl_VC(info);
		if (vc == columnDtl_mgt_itm_oper) return doDtl_mgt_itm_oper_VC(info);
		if (vc == columnDtl_mgt_bom) return doDtl_mgt_bom_VC(info);
		if (vc == columnDtl_mgt_itm_wk) return doDtl_mgt_itm_wk_VC(info);
		if (vc == columnDtl_mgt_itm_purc) return doDtl_mgt_itm_purc_VC(info);
		if (vc == columnDtl_mgt_itm_proc) return doDtl_mgt_itm_proc_VC(info);
		if (vc == columnDtl_mgt_itm_prov) return doDtl_mgt_itm_prov_VC(info);
		if (vc == columnDtl_mgt_itm_sls) return doDtl_mgt_itm_sls_VC(info);
		if (vc == columnDtl_mgt_itm_fix) return doDtl_mgt_itm_fix_VC(info);
		if (vc == CopyTgt_copy_mam_itm_) return doCopyTgt_copy_mam_itm__VC(info);
		if (vc == CopyTgt_copy_mgt_itm) return doCopyTgt_copy_mgt_itm_VC(info);
		if (vc == CopyTgt_copy_mgt_itm_dtl) return doCopyTgt_copy_mgt_itm_dtl_VC(info);
		if (vc == CopyTgt_copy_mgt_itm_oper) return doCopyTgt_copy_mgt_itm_oper_VC(info);
		if (vc == CopyTgt_copy_mgt_bom) return doCopyTgt_copy_mgt_bom_VC(info);
		if (vc == CopyTgt_copy_mgt_itm_wk) return doCopyTgt_copy_mgt_itm_wk_VC(info);
		if (vc == CopyTgt_copy_mgt_itm_purc) return doCopyTgt_copy_mgt_itm_purc_VC(info);
		if (vc == CopyTgt_copy_mgt_itm_proc) return doCopyTgt_copy_mgt_itm_proc_VC(info);
		if (vc == CopyTgt_copy_mgt_itm_prov) return doCopyTgt_copy_mgt_itm_prov_VC(info);
		if (vc == CopyTgt_copy_mgt_itm_sls) return doCopyTgt_copy_mgt_itm_sls_VC(info);
		if (vc == CopyTgt_copy_mgt_itm_fix) return doCopyTgt_copy_mgt_itm_fix_VC(info);
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
	 * [Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[release_flg_off]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_release_flg_off_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[release_flg_on]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_release_flg_on_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[del_flg_off]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_del_flg_off_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[del_flg_on]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_del_flg_on_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TgtHdr]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgtHdr_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [TgtHdr]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgtHdr_calc_ctg_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[base_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mam_itm_]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mam_itm__VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mgt_itm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mgt_itm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mgt_itm_dtl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mgt_itm_dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mgt_itm_oper]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mgt_itm_oper_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mgt_bom]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mgt_bom_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mgt_itm_wk]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mgt_itm_wk_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mgt_itm_purc]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mgt_itm_purc_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mgt_itm_proc]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mgt_itm_proc_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mgt_itm_prov]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mgt_itm_prov_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mgt_itm_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mgt_itm_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mgt_itm_fix]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mgt_itm_fix_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[copy_mam_itm_]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_copy_mam_itm__VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_copy_mgt_itm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_dtl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_copy_mgt_itm_dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_oper]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_copy_mgt_itm_oper_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_bom]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_copy_mgt_bom_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_wk]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_copy_mgt_itm_wk_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_purc]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_copy_mgt_itm_purc_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_proc]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_copy_mgt_itm_proc_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_prov]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_copy_mgt_itm_prov_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_sls]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_copy_mgt_itm_sls_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_fix]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_copy_mgt_itm_fix_VC(MCEventInfo info){
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
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NC(info);
		else if (nc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NC(info);
		else if (nc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NC(info);
		else if (nc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NC(info);
		else if (nc == Cnd_release_flg_off) doCnd_release_flg_off_NC(info);
		else if (nc == Cnd_release_flg_on) doCnd_release_flg_on_NC(info);
		else if (nc == Cnd_del_flg_off) doCnd_del_flg_off_NC(info);
		else if (nc == Cnd_del_flg_on) doCnd_del_flg_on_NC(info);
		else if (nc == Cnd_itm_grp_cd1) doCnd_itm_grp_cd1_NC(info);
		else if (nc == Cnd_itm_grp_nm1) doCnd_itm_grp_nm1_NC(info);
		else if (nc == Cnd_itm_grp_cd2) doCnd_itm_grp_cd2_NC(info);
		else if (nc == Cnd_itm_grp_nm2) doCnd_itm_grp_nm2_NC(info);
		else if (nc == Cnd_itm_grp_cd3) doCnd_itm_grp_cd3_NC(info);
		else if (nc == Cnd_itm_grp_nm3) doCnd_itm_grp_nm3_NC(info);
		else if (nc == Cnd_itm_grp_cd4) doCnd_itm_grp_cd4_NC(info);
		else if (nc == Cnd_itm_grp_nm4) doCnd_itm_grp_nm4_NC(info);
		else if (nc == Cnd_itm_grp_cd5) doCnd_itm_grp_cd5_NC(info);
		else if (nc == Cnd_itm_grp_nm5) doCnd_itm_grp_nm5_NC(info);
		else if (nc == Cnd_itm_grp_cd6) doCnd_itm_grp_cd6_NC(info);
		else if (nc == Cnd_itm_grp_nm6) doCnd_itm_grp_nm6_NC(info);
		else if (nc == Cnd_itm_grp_cd7) doCnd_itm_grp_cd7_NC(info);
		else if (nc == Cnd_itm_grp_nm7) doCnd_itm_grp_nm7_NC(info);
		else if (nc == Cnd_itm_grp_cd8) doCnd_itm_grp_cd8_NC(info);
		else if (nc == Cnd_itm_grp_nm8) doCnd_itm_grp_nm8_NC(info);
		else if (nc == Cnd_itm_grp_cd9) doCnd_itm_grp_cd9_NC(info);
		else if (nc == Cnd_itm_grp_nm9) doCnd_itm_grp_nm9_NC(info);
		else if (nc == Cnd_itm_grp_cd10) doCnd_itm_grp_cd10_NC(info);
		else if (nc == Cnd_itm_grp_nm10) doCnd_itm_grp_nm10_NC(info);
		else if (nc == TgtHdr_calc_ctg_cd) doTgtHdr_calc_ctg_cd_NC(info);
		else if (nc == TgtHdr_calc_ctg_nm) doTgtHdr_calc_ctg_nm_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_base_itm_nm) doDtl_base_itm_nm_NC(info);
		else if (nc == columnDtl_itm_typ) doDtl_itm_typ_NC(info);
		else if (nc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NC(info);
		else if (nc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_NC(info);
		else if (nc == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_NC(info);
		else if (nc == columnDtl_mam_itm_) doDtl_mam_itm__NC(info);
		else if (nc == columnDtl_mgt_itm) doDtl_mgt_itm_NC(info);
		else if (nc == columnDtl_mgt_itm_dtl) doDtl_mgt_itm_dtl_NC(info);
		else if (nc == columnDtl_mgt_itm_oper) doDtl_mgt_itm_oper_NC(info);
		else if (nc == columnDtl_mgt_bom) doDtl_mgt_bom_NC(info);
		else if (nc == columnDtl_mgt_itm_wk) doDtl_mgt_itm_wk_NC(info);
		else if (nc == columnDtl_mgt_itm_purc) doDtl_mgt_itm_purc_NC(info);
		else if (nc == columnDtl_mgt_itm_proc) doDtl_mgt_itm_proc_NC(info);
		else if (nc == columnDtl_mgt_itm_prov) doDtl_mgt_itm_prov_NC(info);
		else if (nc == columnDtl_mgt_itm_sls) doDtl_mgt_itm_sls_NC(info);
		else if (nc == columnDtl_mgt_itm_fix) doDtl_mgt_itm_fix_NC(info);
		else if (nc == CopyTgt_copy_mam_itm_) doCopyTgt_copy_mam_itm__NC(info);
		else if (nc == CopyTgt_copy_mgt_itm) doCopyTgt_copy_mgt_itm_NC(info);
		else if (nc == CopyTgt_copy_mgt_itm_dtl) doCopyTgt_copy_mgt_itm_dtl_NC(info);
		else if (nc == CopyTgt_copy_mgt_itm_oper) doCopyTgt_copy_mgt_itm_oper_NC(info);
		else if (nc == CopyTgt_copy_mgt_bom) doCopyTgt_copy_mgt_bom_NC(info);
		else if (nc == CopyTgt_copy_mgt_itm_wk) doCopyTgt_copy_mgt_itm_wk_NC(info);
		else if (nc == CopyTgt_copy_mgt_itm_purc) doCopyTgt_copy_mgt_itm_purc_NC(info);
		else if (nc == CopyTgt_copy_mgt_itm_proc) doCopyTgt_copy_mgt_itm_proc_NC(info);
		else if (nc == CopyTgt_copy_mgt_itm_prov) doCopyTgt_copy_mgt_itm_prov_NC(info);
		else if (nc == CopyTgt_copy_mgt_itm_sls) doCopyTgt_copy_mgt_itm_sls_NC(info);
		else if (nc == CopyTgt_copy_mgt_itm_fix) doCopyTgt_copy_mgt_itm_fix_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[release_flg_off]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_release_flg_off_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[release_flg_on]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_release_flg_on_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[del_flg_off]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_del_flg_off_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[del_flg_on]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_del_flg_on_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [TgtHdr]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtHdr_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [TgtHdr]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtHdr_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mam_itm_]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mam_itm__NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_dtl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_dtl_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_oper]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_oper_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_bom]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_bom_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_wk]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_wk_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_purc]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_purc_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_proc]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_proc_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_prov]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_prov_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_sls_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_fix]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_fix_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mam_itm_]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mam_itm__NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_dtl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_dtl_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_oper]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_oper_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_bom]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_bom_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_wk]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_wk_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_purc]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_purc_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_proc]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_proc_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_prov]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_prov_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_sls]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_sls_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_fix]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_fix_NC(MCEventInfo info){
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
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NE(info);
		else if (ne == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NE(info);
		else if (ne == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NE(info);
		else if (ne == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NE(info);
		else if (ne == Cnd_release_flg_off) doCnd_release_flg_off_NE(info);
		else if (ne == Cnd_release_flg_on) doCnd_release_flg_on_NE(info);
		else if (ne == Cnd_del_flg_off) doCnd_del_flg_off_NE(info);
		else if (ne == Cnd_del_flg_on) doCnd_del_flg_on_NE(info);
		else if (ne == Cnd_itm_grp_cd1) doCnd_itm_grp_cd1_NE(info);
		else if (ne == Cnd_itm_grp_nm1) doCnd_itm_grp_nm1_NE(info);
		else if (ne == Cnd_itm_grp_cd2) doCnd_itm_grp_cd2_NE(info);
		else if (ne == Cnd_itm_grp_nm2) doCnd_itm_grp_nm2_NE(info);
		else if (ne == Cnd_itm_grp_cd3) doCnd_itm_grp_cd3_NE(info);
		else if (ne == Cnd_itm_grp_nm3) doCnd_itm_grp_nm3_NE(info);
		else if (ne == Cnd_itm_grp_cd4) doCnd_itm_grp_cd4_NE(info);
		else if (ne == Cnd_itm_grp_nm4) doCnd_itm_grp_nm4_NE(info);
		else if (ne == Cnd_itm_grp_cd5) doCnd_itm_grp_cd5_NE(info);
		else if (ne == Cnd_itm_grp_nm5) doCnd_itm_grp_nm5_NE(info);
		else if (ne == Cnd_itm_grp_cd6) doCnd_itm_grp_cd6_NE(info);
		else if (ne == Cnd_itm_grp_nm6) doCnd_itm_grp_nm6_NE(info);
		else if (ne == Cnd_itm_grp_cd7) doCnd_itm_grp_cd7_NE(info);
		else if (ne == Cnd_itm_grp_nm7) doCnd_itm_grp_nm7_NE(info);
		else if (ne == Cnd_itm_grp_cd8) doCnd_itm_grp_cd8_NE(info);
		else if (ne == Cnd_itm_grp_nm8) doCnd_itm_grp_nm8_NE(info);
		else if (ne == Cnd_itm_grp_cd9) doCnd_itm_grp_cd9_NE(info);
		else if (ne == Cnd_itm_grp_nm9) doCnd_itm_grp_nm9_NE(info);
		else if (ne == Cnd_itm_grp_cd10) doCnd_itm_grp_cd10_NE(info);
		else if (ne == Cnd_itm_grp_nm10) doCnd_itm_grp_nm10_NE(info);
		else if (ne == TgtHdr_calc_ctg_cd) doTgtHdr_calc_ctg_cd_NE(info);
		else if (ne == TgtHdr_calc_ctg_nm) doTgtHdr_calc_ctg_nm_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_base_itm_nm) doDtl_base_itm_nm_NE(info);
		else if (ne == columnDtl_itm_typ) doDtl_itm_typ_NE(info);
		else if (ne == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NE(info);
		else if (ne == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_NE(info);
		else if (ne == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_NE(info);
		else if (ne == columnDtl_mam_itm_) doDtl_mam_itm__NE(info);
		else if (ne == columnDtl_mgt_itm) doDtl_mgt_itm_NE(info);
		else if (ne == columnDtl_mgt_itm_dtl) doDtl_mgt_itm_dtl_NE(info);
		else if (ne == columnDtl_mgt_itm_oper) doDtl_mgt_itm_oper_NE(info);
		else if (ne == columnDtl_mgt_bom) doDtl_mgt_bom_NE(info);
		else if (ne == columnDtl_mgt_itm_wk) doDtl_mgt_itm_wk_NE(info);
		else if (ne == columnDtl_mgt_itm_purc) doDtl_mgt_itm_purc_NE(info);
		else if (ne == columnDtl_mgt_itm_proc) doDtl_mgt_itm_proc_NE(info);
		else if (ne == columnDtl_mgt_itm_prov) doDtl_mgt_itm_prov_NE(info);
		else if (ne == columnDtl_mgt_itm_sls) doDtl_mgt_itm_sls_NE(info);
		else if (ne == columnDtl_mgt_itm_fix) doDtl_mgt_itm_fix_NE(info);
		else if (ne == CopyTgt_copy_mam_itm_) doCopyTgt_copy_mam_itm__NE(info);
		else if (ne == CopyTgt_copy_mgt_itm) doCopyTgt_copy_mgt_itm_NE(info);
		else if (ne == CopyTgt_copy_mgt_itm_dtl) doCopyTgt_copy_mgt_itm_dtl_NE(info);
		else if (ne == CopyTgt_copy_mgt_itm_oper) doCopyTgt_copy_mgt_itm_oper_NE(info);
		else if (ne == CopyTgt_copy_mgt_bom) doCopyTgt_copy_mgt_bom_NE(info);
		else if (ne == CopyTgt_copy_mgt_itm_wk) doCopyTgt_copy_mgt_itm_wk_NE(info);
		else if (ne == CopyTgt_copy_mgt_itm_purc) doCopyTgt_copy_mgt_itm_purc_NE(info);
		else if (ne == CopyTgt_copy_mgt_itm_proc) doCopyTgt_copy_mgt_itm_proc_NE(info);
		else if (ne == CopyTgt_copy_mgt_itm_prov) doCopyTgt_copy_mgt_itm_prov_NE(info);
		else if (ne == CopyTgt_copy_mgt_itm_sls) doCopyTgt_copy_mgt_itm_sls_NE(info);
		else if (ne == CopyTgt_copy_mgt_itm_fix) doCopyTgt_copy_mgt_itm_fix_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[release_flg_off]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_release_flg_off_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[release_flg_on]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_release_flg_on_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[del_flg_off]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_del_flg_off_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[del_flg_on]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_del_flg_on_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [TgtHdr]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtHdr_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [TgtHdr]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtHdr_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mam_itm_]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mam_itm__NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_dtl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_dtl_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_oper]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_oper_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_bom]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_bom_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_wk]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_wk_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_purc]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_purc_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_proc]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_proc_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_prov]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_prov_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_sls_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_fix]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_fix_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mam_itm_]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mam_itm__NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_dtl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_dtl_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_oper]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_oper_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_bom]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_bom_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_wk]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_wk_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_purc]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_purc_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_proc]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_proc_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_prov]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_prov_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_sls]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_sls_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_fix]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_fix_NE(MCEventInfo info){
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
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NX(info);
		else if (nx == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NX(info);
		else if (nx == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NX(info);
		else if (nx == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NX(info);
		else if (nx == Cnd_release_flg_off) doCnd_release_flg_off_NX(info);
		else if (nx == Cnd_release_flg_on) doCnd_release_flg_on_NX(info);
		else if (nx == Cnd_del_flg_off) doCnd_del_flg_off_NX(info);
		else if (nx == Cnd_del_flg_on) doCnd_del_flg_on_NX(info);
		else if (nx == Cnd_itm_grp_cd1) doCnd_itm_grp_cd1_NX(info);
		else if (nx == Cnd_itm_grp_nm1) doCnd_itm_grp_nm1_NX(info);
		else if (nx == Cnd_itm_grp_cd2) doCnd_itm_grp_cd2_NX(info);
		else if (nx == Cnd_itm_grp_nm2) doCnd_itm_grp_nm2_NX(info);
		else if (nx == Cnd_itm_grp_cd3) doCnd_itm_grp_cd3_NX(info);
		else if (nx == Cnd_itm_grp_nm3) doCnd_itm_grp_nm3_NX(info);
		else if (nx == Cnd_itm_grp_cd4) doCnd_itm_grp_cd4_NX(info);
		else if (nx == Cnd_itm_grp_nm4) doCnd_itm_grp_nm4_NX(info);
		else if (nx == Cnd_itm_grp_cd5) doCnd_itm_grp_cd5_NX(info);
		else if (nx == Cnd_itm_grp_nm5) doCnd_itm_grp_nm5_NX(info);
		else if (nx == Cnd_itm_grp_cd6) doCnd_itm_grp_cd6_NX(info);
		else if (nx == Cnd_itm_grp_nm6) doCnd_itm_grp_nm6_NX(info);
		else if (nx == Cnd_itm_grp_cd7) doCnd_itm_grp_cd7_NX(info);
		else if (nx == Cnd_itm_grp_nm7) doCnd_itm_grp_nm7_NX(info);
		else if (nx == Cnd_itm_grp_cd8) doCnd_itm_grp_cd8_NX(info);
		else if (nx == Cnd_itm_grp_nm8) doCnd_itm_grp_nm8_NX(info);
		else if (nx == Cnd_itm_grp_cd9) doCnd_itm_grp_cd9_NX(info);
		else if (nx == Cnd_itm_grp_nm9) doCnd_itm_grp_nm9_NX(info);
		else if (nx == Cnd_itm_grp_cd10) doCnd_itm_grp_cd10_NX(info);
		else if (nx == Cnd_itm_grp_nm10) doCnd_itm_grp_nm10_NX(info);
		else if (nx == TgtHdr_calc_ctg_cd) doTgtHdr_calc_ctg_cd_NX(info);
		else if (nx == TgtHdr_calc_ctg_nm) doTgtHdr_calc_ctg_nm_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_base_itm_nm) doDtl_base_itm_nm_NX(info);
		else if (nx == columnDtl_itm_typ) doDtl_itm_typ_NX(info);
		else if (nx == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NX(info);
		else if (nx == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_NX(info);
		else if (nx == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_NX(info);
		else if (nx == columnDtl_mam_itm_) doDtl_mam_itm__NX(info);
		else if (nx == columnDtl_mgt_itm) doDtl_mgt_itm_NX(info);
		else if (nx == columnDtl_mgt_itm_dtl) doDtl_mgt_itm_dtl_NX(info);
		else if (nx == columnDtl_mgt_itm_oper) doDtl_mgt_itm_oper_NX(info);
		else if (nx == columnDtl_mgt_bom) doDtl_mgt_bom_NX(info);
		else if (nx == columnDtl_mgt_itm_wk) doDtl_mgt_itm_wk_NX(info);
		else if (nx == columnDtl_mgt_itm_purc) doDtl_mgt_itm_purc_NX(info);
		else if (nx == columnDtl_mgt_itm_proc) doDtl_mgt_itm_proc_NX(info);
		else if (nx == columnDtl_mgt_itm_prov) doDtl_mgt_itm_prov_NX(info);
		else if (nx == columnDtl_mgt_itm_sls) doDtl_mgt_itm_sls_NX(info);
		else if (nx == columnDtl_mgt_itm_fix) doDtl_mgt_itm_fix_NX(info);
		else if (nx == CopyTgt_copy_mam_itm_) doCopyTgt_copy_mam_itm__NX(info);
		else if (nx == CopyTgt_copy_mgt_itm) doCopyTgt_copy_mgt_itm_NX(info);
		else if (nx == CopyTgt_copy_mgt_itm_dtl) doCopyTgt_copy_mgt_itm_dtl_NX(info);
		else if (nx == CopyTgt_copy_mgt_itm_oper) doCopyTgt_copy_mgt_itm_oper_NX(info);
		else if (nx == CopyTgt_copy_mgt_bom) doCopyTgt_copy_mgt_bom_NX(info);
		else if (nx == CopyTgt_copy_mgt_itm_wk) doCopyTgt_copy_mgt_itm_wk_NX(info);
		else if (nx == CopyTgt_copy_mgt_itm_purc) doCopyTgt_copy_mgt_itm_purc_NX(info);
		else if (nx == CopyTgt_copy_mgt_itm_proc) doCopyTgt_copy_mgt_itm_proc_NX(info);
		else if (nx == CopyTgt_copy_mgt_itm_prov) doCopyTgt_copy_mgt_itm_prov_NX(info);
		else if (nx == CopyTgt_copy_mgt_itm_sls) doCopyTgt_copy_mgt_itm_sls_NX(info);
		else if (nx == CopyTgt_copy_mgt_itm_fix) doCopyTgt_copy_mgt_itm_fix_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[release_flg_off]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_release_flg_off_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[release_flg_on]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_release_flg_on_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[del_flg_off]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_del_flg_off_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[del_flg_on]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_del_flg_on_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [TgtHdr]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtHdr_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [TgtHdr]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtHdr_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mam_itm_]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mam_itm__NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_dtl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_dtl_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_oper]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_oper_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_bom]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_bom_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_wk]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_wk_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_purc]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_purc_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_proc]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_proc_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_prov]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_prov_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_sls_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_fix]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_fix_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mam_itm_]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mam_itm__NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_dtl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_dtl_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_oper]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_oper_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_bom]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_bom_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_wk]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_wk_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_purc]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_purc_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_proc]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_proc_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_prov]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_prov_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_sls]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_sls_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[copy_mgt_itm_fix]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_copy_mgt_itm_fix_NX(MCEventInfo info){
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
		else if (lc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_LC(info);
		else if (lc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_LC(info);
		else if (lc == Cnd_itm_grp_cd1) doCnd_itm_grp_cd1_LC(info);
		else if (lc == Cnd_itm_grp_nm1) doCnd_itm_grp_nm1_LC(info);
		else if (lc == Cnd_itm_grp_cd2) doCnd_itm_grp_cd2_LC(info);
		else if (lc == Cnd_itm_grp_nm2) doCnd_itm_grp_nm2_LC(info);
		else if (lc == Cnd_itm_grp_cd3) doCnd_itm_grp_cd3_LC(info);
		else if (lc == Cnd_itm_grp_nm3) doCnd_itm_grp_nm3_LC(info);
		else if (lc == Cnd_itm_grp_cd4) doCnd_itm_grp_cd4_LC(info);
		else if (lc == Cnd_itm_grp_nm4) doCnd_itm_grp_nm4_LC(info);
		else if (lc == Cnd_itm_grp_cd5) doCnd_itm_grp_cd5_LC(info);
		else if (lc == Cnd_itm_grp_nm5) doCnd_itm_grp_nm5_LC(info);
		else if (lc == Cnd_itm_grp_cd6) doCnd_itm_grp_cd6_LC(info);
		else if (lc == Cnd_itm_grp_nm6) doCnd_itm_grp_nm6_LC(info);
		else if (lc == Cnd_itm_grp_cd7) doCnd_itm_grp_cd7_LC(info);
		else if (lc == Cnd_itm_grp_nm7) doCnd_itm_grp_nm7_LC(info);
		else if (lc == Cnd_itm_grp_cd8) doCnd_itm_grp_cd8_LC(info);
		else if (lc == Cnd_itm_grp_nm8) doCnd_itm_grp_nm8_LC(info);
		else if (lc == Cnd_itm_grp_cd9) doCnd_itm_grp_cd9_LC(info);
		else if (lc == Cnd_itm_grp_nm9) doCnd_itm_grp_nm9_LC(info);
		else if (lc == Cnd_itm_grp_cd10) doCnd_itm_grp_cd10_LC(info);
		else if (lc == Cnd_itm_grp_nm10) doCnd_itm_grp_nm10_LC(info);
		else if (lc == TgtHdr_calc_ctg_cd) doTgtHdr_calc_ctg_cd_LC(info);
		else if (lc == TgtHdr_calc_ctg_nm) doTgtHdr_calc_ctg_nm_LC(info);
		else if (lc == columnDtl_base_itm_nm) doDtl_base_itm_nm_LC(info);
		else if (lc == columnDtl_itm_typ) doDtl_itm_typ_LC(info);
		else if (lc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_LC(info);
		else if (lc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_LC(info);
		else if (lc == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_LC(info);
		else if (lc == columnDtl_mam_itm_) doDtl_mam_itm__LC(info);
		else if (lc == columnDtl_mgt_itm) doDtl_mgt_itm_LC(info);
		else if (lc == columnDtl_mgt_itm_dtl) doDtl_mgt_itm_dtl_LC(info);
		else if (lc == columnDtl_mgt_itm_oper) doDtl_mgt_itm_oper_LC(info);
		else if (lc == columnDtl_mgt_bom) doDtl_mgt_bom_LC(info);
		else if (lc == columnDtl_mgt_itm_wk) doDtl_mgt_itm_wk_LC(info);
		else if (lc == columnDtl_mgt_itm_purc) doDtl_mgt_itm_purc_LC(info);
		else if (lc == columnDtl_mgt_itm_proc) doDtl_mgt_itm_proc_LC(info);
		else if (lc == columnDtl_mgt_itm_prov) doDtl_mgt_itm_prov_LC(info);
		else if (lc == columnDtl_mgt_itm_sls) doDtl_mgt_itm_sls_LC(info);
		else if (lc == columnDtl_mgt_itm_fix) doDtl_mgt_itm_fix_LC(info);
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
	 * [Cnd]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [TgtHdr]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtHdr_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [TgtHdr]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgtHdr_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mam_itm_]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mam_itm__LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_dtl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_dtl_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_oper]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_oper_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_bom]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_bom_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_wk]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_wk_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_purc]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_purc_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_proc]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_proc_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_prov]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_prov_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_sls]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_sls_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mgt_itm_fix]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mgt_itm_fix_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_jnl_cd]の作成メソッド
	 */
	public MCList getCnd_itm_jnl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmJnl(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_itm_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[TgtHdr_calc_ctg_cd]の作成メソッド
	 */
	public MCList getTgtHdr_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_typ]の作成メソッド
	 */
	public MCList getDtl_itm_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_typ_d_cd]の作成メソッド
	 */
	public MCList getDtl_itm_typ_d_cd(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_jnl_cd]の作成メソッド
	 */
	public MCList getDtl_itm_jnl_cd(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MG.MGBDL0640.Srch01")) {
			return new MG_MGBDL0640_Srch01Bridge();
		}
		if (id.equals("MG.MGBDL0640.Srch02")) {
			return new MG_MGBDL0640_Srch02Bridge();
		}
		if (id.equals("MG.MGBDL0640.Ins01")) {
			return new MG_MGBDL0640_Ins01Bridge();
		}
		if (id.equals("MG.MGBDL0640.Del01")) {
			return new MG_MGBDL0640_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MG_MGBDL0640_Srch01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0640_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0640_Srch01;

		/** コンストラクタ */
		protected MG_MGBDL0640_Srch01Bridge() {
			p_MG_MGBDL0640_Srch01 = new MCParam(PDef.MG_MGBDL0640_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0640_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0640.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0640.DtlR.class));

			p_MG_MGBDL0640_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0640_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0640_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0640_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0640_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0640.CndR up0() {
			return (mcframe.clientMGBD.MGBDP0640.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0640.DtlR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0640.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0640_Srch01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0640.DtlR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0640_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMGBD.MGBDP0640.DtlR>)p_MG_MGBDL0640_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MG_MGBDL0640_Srch02]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0640_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0640_Srch02;

		/** コンストラクタ */
		protected MG_MGBDL0640_Srch02Bridge() {
			p_MG_MGBDL0640_Srch02 = new MCParam(PDef.MG_MGBDL0640_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0640_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMGBD.MGBDP0640.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0640.DtlR.class));

			p_MG_MGBDL0640_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0640_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0640_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0640_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0640_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMGBD.MGBDP0640.CndR up0() {
			return (mcframe.clientMGBD.MGBDP0640.CndR)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0640.DtlR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0640.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0640_Srch02.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0640.DtlR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0640_Srch02;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMGBD.MGBDP0640.DtlR>)p_MG_MGBDL0640_Srch02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MG_MGBDL0640_Ins01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0640_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0640_Ins01;

		/** コンストラクタ */
		protected MG_MGBDL0640_Ins01Bridge() {
			p_MG_MGBDL0640_Ins01 = new MCParam(PDef.MG_MGBDL0640_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0640_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0640.DtlR.class));
			// Down

			p_MG_MGBDL0640_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0640_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0640_Ins01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0640_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0640_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBD.MGBDP0640.DtlR> up0() {
			return (MCList<mcframe.clientMGBD.MGBDP0640.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MG_MGBDL0640_Ins01;
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
	/**
	 * [MG_MGBDL0640_Del01]の定型処理のInnerClass
	 */
	protected class MG_MGBDL0640_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MG_MGBDL0640_Del01;

		/** コンストラクタ */
		protected MG_MGBDL0640_Del01Bridge() {
			p_MG_MGBDL0640_Del01 = new MCParam(PDef.MG_MGBDL0640_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MG_MGBDL0640_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMGBD.MGBDP0640.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0640.DtlR.class));

			p_MG_MGBDL0640_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MG_MGBDL0640_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MG_MGBDL0640_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MG_MGBDL0640_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MG_MGBDL0640_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMGBD.MGBDP0640.DtlR> up0() {
			return (MCList<mcframe.clientMGBD.MGBDP0640.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMGBD.MGBDP0640.DtlR> down0() {
			return (MCList<mcframe.clientMGBD.MGBDP0640.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MG_MGBDL0640_Del01.addDownBlock(MCList.create(mcframe.clientMGBD.MGBDP0640.DtlR.class));
		}
		protected MCParam param() {
			return p_MG_MGBDL0640_Del01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMGBD.MGBDP0640.DtlR>)p_MG_MGBDL0640_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
}