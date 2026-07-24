package mcframe.clientMABC.MABCP0870;

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
import mcframe.clientMABC.MABCP0870.MABCP_ItmCopyReg_MC.MA_MABCL0870_Srch01Caller;
import mcframe.clientMABC.MABCP0870.MABCP_ItmCopyReg_MC.MA_MABCL0870_Srch02Caller;
import mcframe.clientMABC.MABCP0870.MABCP_ItmCopyReg_MC.MA_MABCL0870_Upd01Caller;
import mcframe.clientMABC.MABCP0870.MABCP_ItmCopyReg_MC.MA_MABCL0870_Del01Caller;

/**
 * 画面"MABCP_ItmCopyReg"パネルクラスです。<p>
 *
 * 品目系マスタの検索、コピー登録、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_ItmCopyReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABCP0870";

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
	 * UPD,Create (New),0;REF_UPD,Create (with reference),9;DEL,Delete (Administrator),1;REF,View,3 UPD,登録する（新規）,0;REF_UPD,登録する（参照登録）,9;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_REF_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H Cnd_dt_p_PPanel;
	public MCDateField Cnd_st_dt_fr;	// [Cnd]の[dt_p.st_dt_fr]を[Cnd_st_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_st_dt_to;	// [Cnd]の[dt_p.st_dt_to]を[Cnd_st_dt_to]としてエイリアス定義。
	public MCDateField Cnd_end_dt_fr;	// [Cnd]の[dt_p.end_dt_fr]を[Cnd_end_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_end_dt_to;	// [Cnd]の[dt_p.end_dt_to]を[Cnd_end_dt_to]としてエイリアス定義。
	public MCLabel Cnd_chng_no_Label = null;
	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_chng_no = null;
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
	public MCLabel Cnd_memo1_c_Label = null;
	/**
	 * Memo 1 (Common) メモ１（共通）.<p>
	 *
	 */
	public MCTextField Cnd_memo1_c = null;
	public MCLabel Cnd_memo2_c_Label = null;
	/**
	 * Memo 2 (Common) メモ２（共通）.<p>
	 *
	 */
	public MCTextField Cnd_memo2_c = null;
	public MCLabel Cnd_memo3_c_Label = null;
	/**
	 * Memo 3 (Common) メモ３（共通）.<p>
	 *
	 */
	public MCTextField Cnd_memo3_c = null;
	public MCLabel Cnd_memo1_Label = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCTextField Cnd_memo1 = null;
	public MCLabel Cnd_memo2_Label = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCTextField Cnd_memo2 = null;
	public MCLabel Cnd_memo3_Label = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCTextField Cnd_memo3 = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCLabel Cnd_del_flg_lab = null;
	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_off_del_flg = null;
	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_on_del_flg = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_ref_itm_p_PPanel;
	public MCTextField Cnd_ref_itm_cd;	// [Cnd]の[ref_itm_p.itm_cd]を[Cnd_ref_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_ref_itm_sub1;	// [Cnd]の[ref_itm_p.itm_sub1]を[Cnd_ref_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_ref_itm_sub2;	// [Cnd]の[ref_itm_p.itm_sub2]を[Cnd_ref_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_ref_itm_sub3;	// [Cnd]の[ref_itm_p.itm_sub3]を[Cnd_ref_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_ref_itm_nm;	// [Cnd]の[ref_itm_p.itm_nm]を[Cnd_ref_itm_nm]としてエイリアス定義。
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
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0870.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_src_itm_p_PPanel;
	public MCColumnConfig columnDtl_src_itm_cd;// [Dtl]の[src_itm_p.itm_cd]を[columnDtl_src_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_src_itm_sub1;// [Dtl]の[src_itm_p.itm_sub1]を[columnDtl_src_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_src_itm_sub2;// [Dtl]の[src_itm_p.itm_sub2]を[columnDtl_src_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_src_itm_sub3;// [Dtl]の[src_itm_p.itm_sub3]を[columnDtl_src_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_src_itm_nm;// [Dtl]の[src_itm_p.itm_nm]を[columnDtl_src_itm_nm]としてエイリアス定義。
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
	 * Item cd. (Copy to) 品目ＣＤ（コピー先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_itm_cd = null;
	/**
	 * Branch No. 1 (Copy-to) 枝番１（コピー先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_itm_sub1 = null;
	/**
	 * Branch No. 2 (Copy-to) 枝番２（コピー先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_itm_sub2 = null;
	/**
	 * Branch No. 3 (Copy-to) 枝番３（コピー先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_itm_sub3 = null;
	/**
	 * Item name (Copy to) 品名（コピー先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_itm_nm = null;
	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chng_no = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo3 = null;
	/**
	 * Item master 品目マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_cnt = null;
	/**
	 * Item auxiliary master 品目補助マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_sub_cnt = null;
	/**
	 * Item unit master 品目単位マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_unit_cnt = null;
	/**
	 * Item prohibit master 品目禁止マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_stop_cnt = null;
	/**
	 * Standard unit cost master 標準単価マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stdcost_cnt = null;
	/**
	 * Item storage master 品目格納先マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_strg_cnt = null;
	/**
	 * Item master (Distribution group) 品目マスタ（物流グループ）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_lg_grp_cnt = null;
	/**
	 * Item rack/line master 品目棚・ラインマスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_str_ln_cnt = null;
	/**
	 * Mfg. allocation control master 製造引当制御マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alloc_ctl_cnt = null;
	/**
	 * Inventory replenishment master 在庫補充マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_rpl_cnt = null;
	/**
	 * Item master (WG) 品目マスタ（ＷＧ）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_wg_cnt = null;
	/**
	 * Item details master 品目詳細マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_dtl_cnt = null;
	/**
	 * Item operation master 品目工程マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_oper_cnt = null;
	/**
	 * BOM master (Parent) ＢＯＭマスタ（親）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bom_par_cnt = null;
	/**
	 * Operation man-hour master 工程工数マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_wk_cost_cnt = null;
	/**
	 * Item inspection pattern master 品目検査パタンマスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_insp_ptn_cnt = null;
	/**
	 * Item inspection master 品目品管マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_insp_cnt = null;
	/**
	 * Item inspection specific master 品目検査規格マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_insp_spec_cnt = null;
	/**
	 * Item master (Factory/Distribution warehouse) 品目マスタ（工場・物流倉庫）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_site_cnt = null;
	/**
	 * MPS item master ＭＰＳ品目マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mps_itm_cnt = null;
	/**
	 * Sales plan item configuration master 販売計画品目構成マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_spln_itm_conf_cnt = null;
	/**
	 * Direct delivery LT master 仕入直送ＬＴマスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_ddlv_lt_cnt = null;
	/**
	 * BP item master 取引先品目マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_itm_cnt = null;
	/**
	 * Assortment master (Representative item) 品揃マスタ（代表品目）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_set_itm_main_cnt = null;
	/**
	 * Cost item category structure master 原価品群構成マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ctg_config_cnt = null;
	/**
	 * Version master 版マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_ver_cnt = null;
	/**
	 * Allocation coefficient structure master 配賦係数構成マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_coef_config_cnt = null;
	/**
	 * Cost element allocation master 費目配賦マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_expns_cnt = null;
	/**
	 * Input allocation master 投入配賦マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_inpt_cnt = null;
	/**
	 * Not costing item master 原価対象外品目マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cost_itm_out_cnt = null;
	/**
	 * Expenses allocation transfer master 経費配賦振替マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xpns_purc_alc_cnt = null;
	/**
	 * Item additional info. master 品目付加情報マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_cnt = null;
	/**
	 * Item procurement disapproval master 品目手配不許可マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_not_fix_cnt = null;
	/**
	 * Miscellaneous item master 諸口品マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sundry_itm_cnt = null;
	/**
	 * Alternative item master 代替品目マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alt_itm_cnt = null;
	/**
	 * BOM master (Child) ＢＯＭマスタ（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bom_chd_cnt = null;
	/**
	 * Subcontracting unit price master 加工単価マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_proc_upri_cnt = null;
	/**
	 * Supply unit price master 支給単価マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_upri_cnt = null;
	/**
	 * Purchase unit price master 購買単価マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_upri_cnt = null;
	/**
	 * Standard sales unit price master 標準販売単価マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_sls_upri_cnt = null;
	/**
	 * Item sales unit price master 品目販売単価マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_sls_upri_cnt = null;
	/**
	 * Customer sales unit price master 得意先販売単価マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_sls_upri_cnt = null;
	/**
	 * Assortment master (Assortment item) 品揃マスタ（品揃品目）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_set_itm_set_cnt = null;
	/**
	 * Auto-journal pattern master 自動仕訳パタンマスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jnl_ptn_cnt = null;
	/**
	 * Lot copy master (Parent) ロット継承マスタ（親）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_inh_dest_cnt = null;
	/**
	 * Item specification master 品目仕様マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_spec_cnt = null;
	/**
	 * Item specification detail master 品目仕様項目マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_spec_desc_cnt = null;
	/**
	 * Item configuration master (Main item) 品目構成マスタ（主品目）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_comp_core_cnt = null;
	/**
	 * Lot copy master (Child) ロット継承マスタ（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_inh_src_cnt = null;
	/**
	 * IF code conversion master ＩＦコード変換マスタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_if_x_cnt = null;
	/**
	 * Item structure master (Component) 品目構成マスタ（構成品目）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_comp_comp_cnt = null;
	/**
	 * Item 品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_flg = null;
	/**
	 * Item auxiliary 品目補助.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_sub_flg = null;
	/**
	 * Item unit 品目単位.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_unit_flg = null;
	/**
	 * Item prohibit 品目禁止.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_stop_flg = null;
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stdcost_flg = null;
	/**
	 * Item storage 品目格納先.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_strg_flg = null;
	/**
	 * Item (Distribution group) 品目（物流グループ）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_lg_grp_flg = null;
	/**
	 * Item rack/line 品目棚・ライン.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_str_ln_flg = null;
	/**
	 * Mfg. allocation control 製造引当制御.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alloc_ctl_flg = null;
	/**
	 * Inventory replenishment 在庫補充.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_rpl_flg = null;
	/**
	 * Item (WG) 品目（ＷＧ）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_wg_flg = null;
	/**
	 * Item details 品目詳細.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_dtl_flg = null;
	/**
	 * Item operation 品目工程.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_oper_flg = null;
	/**
	 * BOM (Parent) ＢＯＭ（親）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bom_par_flg = null;
	/**
	 * Operation man-hour 工程工数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_wk_cost_flg = null;
	/**
	 * Item inspection pattern 品目検査パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_insp_ptn_flg = null;
	/**
	 * Item inspection 品目品管.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_insp_flg = null;
	/**
	 * Item inspection specific 品目検査規格.<p>
	 *
	 */
	public MCColumnConfig columnDtl_insp_spec_flg = null;
	/**
	 * Item (Factory/Distribution warehouse) 品目（工場・物流倉庫）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_site_flg = null;
	/**
	 * MPS item ＭＰＳ品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mps_itm_flg = null;
	/**
	 * Sales plan item configuration 販売計画品目構成.<p>
	 *
	 */
	public MCColumnConfig columnDtl_spln_itm_conf_flg = null;
	/**
	 * Direct delivery LT 仕入直送ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_ddlv_lt_flg = null;
	/**
	 * BP item 取引先品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_itm_flg = null;
	/**
	 * Assortment (Representative item) 品揃（代表品目）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_set_itm_main_flg = null;
	/**
	 * Cost item category structure 原価品群構成.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ctg_config_flg = null;
	/**
	 * Version 版.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_ver_flg = null;
	/**
	 * Allocation coefficient structure 配賦係数構成.<p>
	 *
	 */
	public MCColumnConfig columnDtl_coef_config_flg = null;
	/**
	 * Cost element allocation 費目配賦.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_expns_flg = null;
	/**
	 * Input allocation 投入配賦.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_inpt_flg = null;
	/**
	 * Not costing item 原価対象外品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cost_itm_out_flg = null;
	/**
	 * Expenses allocation transfer 経費配賦振替.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xpns_purc_alc_flg = null;
	/**
	 * Item additional info. 品目付加情報.<p>
	 *
	 */
	public MCColumnConfig columnDtl_attach_info_flg = null;
	/**
	 * Item procurement disapproval 品目手配不許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_not_fix_flg = null;
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sundry_itm_flg = null;
	/**
	 * Alternative item 代替品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alt_itm_flg = null;
	/**
	 * BOM (Child) ＢＯＭ（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bom_chd_flg = null;
	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_proc_upri_flg = null;
	/**
	 * Supply unit price 支給単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_upri_flg = null;
	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_upri_flg = null;
	/**
	 * Standard sales unit price 標準販売単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_sls_upri_flg = null;
	/**
	 * Item sales unit price 品目販売単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_sls_upri_flg = null;
	/**
	 * Customer sales unit price 得意先販売単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_sls_upri_flg = null;
	/**
	 * Assortment (Assortment item) 品揃（品揃品目）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_set_itm_set_flg = null;
	/**
	 * Auto-journal pattern 自動仕訳パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jnl_ptn_flg = null;
	/**
	 * Lot copy (To) ロット継承先.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_inh_dest_flg = null;
	/**
	 * Item specification 品目仕様.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_spec_flg = null;
	/**
	 * Item specification detail 品目仕様項目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_spec_desc_flg = null;
	/**
	 * Item structure (Main item) 品目構成（主品目）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_comp_core_flg = null;
	/**
	 * Lot copy (From) ロット継承元.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_inh_src_flg = null;
	/**
	 * IF code conversion ＩＦコード変換.<p>
	 *
	 */
	public MCColumnConfig columnDtl_if_x_flg = null;
	/**
	 * Item structure (Component) 品目構成（構成品目）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_comp_comp_flg = null;
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
	// [Tgt]ブロック関連のField定義
	public MCPanel TgtPanel = null;
	public MCTabbedPane TgtTab = null;
	// [Tgt]ブロックの項目のField定義
	// [CopyTgt]ブロック関連のField定義
	public MCPanel CopyTgtPanel = null;
	// [CopyTgt]ブロックの項目のField定義
	/**
	 * Item 品目.<p>
	 *
	 */
	public MCCheckBox CopyTgt_itm_flg = null;
	/**
	 * Item master entry 品目マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABCP0310 = null;
	/**
	 * Item auxiliary 品目補助.<p>
	 *
	 */
	public MCCheckBox CopyTgt_itm_sub_flg = null;
	/**
	 * Item auxiliary master entry 品目補助マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABCP0320 = null;
	/**
	 * Item unit 品目単位.<p>
	 *
	 */
	public MCCheckBox CopyTgt_itm_unit_flg = null;
	/**
	 * Item unit master entry 品目単位マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABCP0330 = null;
	/**
	 * Item prohibit 品目禁止.<p>
	 *
	 */
	public MCCheckBox CopyTgt_itm_stop_flg = null;
	/**
	 * Item prohibit master entry 品目禁止マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABCP0360 = null;
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCCheckBox CopyTgt_stdcost_flg = null;
	/**
	 * Standard unit cost master entry 標準単価マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABCP0860 = null;
	/**
	 * Item storage 品目格納先.<p>
	 *
	 */
	public MCCheckBox CopyTgt_itm_strg_flg = null;
	/**
	 * Item storage master entry 品目格納先マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0150 = null;
	/**
	 * Item (Distribution group) 品目（物流グループ）.<p>
	 *
	 */
	public MCCheckBox CopyTgt_itm_lg_grp_flg = null;
	/**
	 * Item master (Distribution group) 品目マスタ（物流グループ）.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0360 = null;
	/**
	 * Item rack/line 品目棚・ライン.<p>
	 *
	 */
	public MCCheckBox CopyTgt_itm_str_ln_flg = null;
	/**
	 * Item rack/line master 品目棚・ラインマスタ.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0370 = null;
	/**
	 * Mfg. allocation control 製造引当制御.<p>
	 *
	 */
	public MCCheckBox CopyTgt_alloc_ctl_flg = null;
	/**
	 * Mfg. allocation control master entry 製造引当制御マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0780 = null;
	/**
	 * Inventory replenishment 在庫補充.<p>
	 *
	 */
	public MCCheckBox CopyTgt_stk_rpl_flg = null;
	/**
	 * Inventory replenishment master entry 在庫補充マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0800 = null;
	/**
	 * Item (WG) 品目（ＷＧ）.<p>
	 *
	 */
	public MCCheckBox CopyTgt_itm_wg_flg = null;
	/**
	 * Item master (WG) entry 品目マスタ（ＷＧ）登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0340 = null;
	/**
	 * Item details 品目詳細.<p>
	 *
	 */
	public MCCheckBox CopyTgt_itm_dtl_flg = null;
	/**
	 * Item details master entry 品目詳細マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0010 = null;
	/**
	 * Item operation 品目工程.<p>
	 *
	 */
	public MCCheckBox CopyTgt_itm_oper_flg = null;
	/**
	 * Item operation master entry 品目工程マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0090 = null;
	/**
	 * BOM (Parent) ＢＯＭ（親）.<p>
	 *
	 */
	public MCCheckBox CopyTgt_bom_par_flg = null;
	/**
	 * BOM list entry ＢＯＭ一覧登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0030_par = null;
	/**
	 * Operation man-hour 工程工数.<p>
	 *
	 */
	public MCCheckBox CopyTgt_oper_wk_cost_flg = null;
	/**
	 * Operation man-hour master entry 工程工数マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0110 = null;
	/**
	 * Item inspection pattern 品目検査パタン.<p>
	 *
	 */
	public MCCheckBox CopyTgt_itm_insp_ptn_flg = null;
	/**
	 * Item inspection pattern master entry 品目検査パタンマスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0170 = null;
	/**
	 * Item inspection 品目品管.<p>
	 *
	 */
	public MCCheckBox CopyTgt_itm_insp_flg = null;
	/**
	 * Item inspection master entry 品目品管マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0190 = null;
	/**
	 * Item inspection specific 品目検査規格.<p>
	 *
	 */
	public MCCheckBox CopyTgt_insp_spec_flg = null;
	/**
	 * Item inspection specific master entry 品目検査規格マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0180 = null;
	/**
	 * Item (Factory/Distribution warehouse) 品目（工場・物流倉庫）.<p>
	 *
	 */
	public MCCheckBox CopyTgt_itm_site_flg = null;
	/**
	 * Item master (Factory/Distribution warehouse) entry 品目マスタ（工場・物流倉庫）登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0350 = null;
	/**
	 * MPS item ＭＰＳ品目.<p>
	 *
	 */
	public MCCheckBox CopyTgt_mps_itm_flg = null;
	/**
	 * MPS item master entry ＭＰＳ品目マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0850 = null;
	/**
	 * Sales plan item configuration 販売計画品目構成.<p>
	 *
	 */
	public MCCheckBox CopyTgt_spln_itm_conf_flg = null;
	/**
	 * Sales plan item configuration master entry 販売計画品目構成マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0830 = null;
	/**
	 * Direct delivery LT 仕入直送ＬＴ.<p>
	 *
	 */
	public MCCheckBox CopyTgt_purc_ddlv_lt_flg = null;
	/**
	 * Direct delivery LT master entry 仕入直送ＬＴマスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0530 = null;
	/**
	 * BP item 取引先品目.<p>
	 *
	 */
	public MCCheckBox CopyTgt_bp_itm_flg = null;
	/**
	 * BP item master entry 取引先品目マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0640 = null;
	/**
	 * Assortment (Representative item) 品揃（代表品目）.<p>
	 *
	 */
	public MCCheckBox CopyTgt_set_itm_main_flg = null;
	/**
	 * Assortment master entry 品揃マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP1060_main = null;
	/**
	 * Cost item category structure 原価品群構成.<p>
	 *
	 */
	public MCCheckBox CopyTgt_ctg_config_flg = null;
	/**
	 * Cost item category structure master entry 原価品群構成マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABCP2080 = null;
	/**
	 * Version 版.<p>
	 *
	 */
	public MCCheckBox CopyTgt_itm_ver_flg = null;
	/**
	 * Version master entry 版マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0770 = null;
	/**
	 * Allocation coefficient structure 配賦係数構成.<p>
	 *
	 */
	public MCCheckBox CopyTgt_coef_config_flg = null;
	/**
	 * Allocation coefficient structure master 配賦係数構成マスタ.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABGP0250 = null;
	/**
	 * Input allocation 投入配賦.<p>
	 *
	 */
	public MCCheckBox CopyTgt_alc_inpt_flg = null;
	/**
	 * Input allocation master 投入配賦マスタ.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABGP0310 = null;
	/**
	 * Not costing item 原価対象外品目.<p>
	 *
	 */
	public MCCheckBox CopyTgt_cost_itm_out_flg = null;
	/**
	 * Not costing item master 原価対象外品目マスタ.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABGP0610 = null;
	/**
	 * Expenses allocation transfer 経費配賦振替.<p>
	 *
	 */
	public MCCheckBox CopyTgt_xpns_purc_alc_flg = null;
	/**
	 * Expenses allocation transfer master 経費配賦振替マスタ.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABGP0630 = null;
	/**
	 * Lot copy (Parent) ロット継承（親）.<p>
	 *
	 */
	public MCCheckBox CopyTgt_lot_inh_dest_flg = null;
	/**
	 * Lot copy master ロット継承マスタ一覧照会.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0210_dest = null;
	/**
	 * Item specification 品目仕様.<p>
	 *
	 */
	public MCCheckBox CopyTgt_itm_spec_flg = null;
	/**
	 * Item specification master entry 品目仕様マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0280 = null;
	/**
	 * Item specification detail 品目仕様項目.<p>
	 *
	 */
	public MCCheckBox CopyTgt_itm_spec_desc_flg = null;
	/**
	 * Item specification detail master entry 品目仕様項目マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0310 = null;
	/**
	 * Item structure (Main item) 品目構成（主品目）.<p>
	 *
	 */
	public MCCheckBox CopyTgt_itm_comp_core_flg = null;
	/**
	 * Item configuration master entry 品目構成マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0290_core = null;
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton CopyTgt_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton CopyTgt_deselect_all = null;
	/**
	 * Item additional info. 品目付加情報.<p>
	 *
	 */
	public MCCheckBox CopyTgt_attach_info_flg = null;
	/**
	 * Item additional info. master entry 品目付加情報マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABCP0840 = null;
	/**
	 * Item procurement disapproval 品目手配不許可.<p>
	 *
	 */
	public MCCheckBox CopyTgt_itm_not_fix_flg = null;
	/**
	 * Item procurement disapproval master entry 品目手配不許可マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0320 = null;
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCCheckBox CopyTgt_sundry_itm_flg = null;
	/**
	 * Miscellaneous item master entry 諸口品マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABCP0880 = null;
	/**
	 * Alternative item 代替品目.<p>
	 *
	 */
	public MCCheckBox CopyTgt_alt_itm_flg = null;
	/**
	 * Alternative item master entry 代替品目マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0080 = null;
	/**
	 * BOM (Child) ＢＯＭ（子）.<p>
	 *
	 */
	public MCCheckBox CopyTgt_bom_chd_flg = null;
	/**
	 * BOM list entry ＢＯＭ一覧登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0030 = null;
	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public MCCheckBox CopyTgt_proc_upri_flg = null;
	/**
	 * Subcontracting unit price master entry 加工単価マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0140 = null;
	/**
	 * Supply unit price 支給単価.<p>
	 *
	 */
	public MCCheckBox CopyTgt_prov_upri_flg = null;
	/**
	 * Supply unit price master entry 支給単価マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0130 = null;
	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public MCCheckBox CopyTgt_purc_upri_flg = null;
	/**
	 * Purchase unit price master entry 購買単価マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0120 = null;
	/**
	 * Standard sales unit price 標準販売単価.<p>
	 *
	 */
	public MCCheckBox CopyTgt_std_sls_upri_flg = null;
	/**
	 * Standard sales unit price master entry 標準販売単価マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0250 = null;
	/**
	 * Item sales unit price 品目販売単価.<p>
	 *
	 */
	public MCCheckBox CopyTgt_itm_sls_upri_flg = null;
	/**
	 * Item sales unit price master entry 品目販売単価マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0240 = null;
	/**
	 * Customer sales unit price 得意先販売単価.<p>
	 *
	 */
	public MCCheckBox CopyTgt_cst_sls_upri_flg = null;
	/**
	 * Customer sales unit price master entry 得意先販売単価マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0220 = null;
	/**
	 * Assortment (Assortment item) 品揃（品揃品目）.<p>
	 *
	 */
	public MCCheckBox CopyTgt_set_itm_set_flg = null;
	/**
	 * Assortment master entry 品揃マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP1060_set = null;
	/**
	 * Cost element allocation 費目配賦.<p>
	 *
	 */
	public MCCheckBox CopyTgt_alc_expns_flg = null;
	/**
	 * Cost element allocation master 費目配賦マスタ.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABGP0300 = null;
	/**
	 * Auto-journal pattern 自動仕訳パタン.<p>
	 *
	 */
	public MCCheckBox CopyTgt_jnl_ptn_flg = null;
	/**
	 * Auto-journal pattern master 自動仕訳パタンマスタ一覧照会.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABCP1090 = null;
	/**
	 * Lot copy (Child) ロット継承（子）.<p>
	 *
	 */
	public MCCheckBox CopyTgt_lot_inh_src_flg = null;
	/**
	 * Lot copy master ロット継承マスタ一覧照会.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0210_src = null;
	/**
	 * IF code conversion ＩＦコード変換.<p>
	 *
	 */
	public MCCheckBox CopyTgt_if_x_flg = null;
	/**
	 * IF code conversion master entry ＩＦコード変換マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABCP1520 = null;
	/**
	 * Item structure (Component) 品目構成（構成品目）.<p>
	 *
	 */
	public MCCheckBox CopyTgt_itm_comp_comp_flg = null;
	/**
	 * Item configuration master entry 品目構成マスタ登録.<p>
	 *
	 */
	public MCButton CopyTgt_open_MABSP0290_comp = null;
	// [NoCopyTgt]ブロック関連のField定義
	public MCPanel NoCopyTgtPanel = null;
	// [NoCopyTgt]ブロックの項目のField定義
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Exclude logically deleted data 論理削除がオンは除く.<p>
	 *
	 */
	public MCCheckBox Btn_ex_on_del_flg = null;
	public MCLabel Btn_ex_past_end_dt_Label = null;
	/**
	 * Exclude data with past application end dates 過去の適用終了日は除く.<p>
	 *
	 */
	public MCDateField Btn_ex_past_end_dt = null;
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
	/** [REF_UPD]モードを表す定数 */
	public static final String REF_UPD = "REF_UPD";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, REF_UPD, DEL, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABCL0870_Srch01]のCallerの作成 */
	protected MABCP_ItmCopyReg_MC.MA_MABCL0870_Srch01Caller createMA_MABCL0870_Srch01() {
		MABCP_ItmCopyReg_MC.MA_MABCL0870_Srch01Caller<MABCP_ItmCopyReg, MA_MABCL0870_Srch01Bridge>
		caller = ((MABCP_ItmCopyReg_MC)this).new MA_MABCL0870_Srch01Caller<MABCP_ItmCopyReg, MA_MABCL0870_Srch01Bridge>(
					(MABCP_ItmCopyReg)this, new MA_MABCL0870_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0870_Srch01]の呼び出し */
	protected void callMA_MABCL0870_Srch01() {
		MCCaller caller = createMA_MABCL0870_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0870_Srch02]のCallerの作成 */
	protected MABCP_ItmCopyReg_MC.MA_MABCL0870_Srch02Caller createMA_MABCL0870_Srch02() {
		MABCP_ItmCopyReg_MC.MA_MABCL0870_Srch02Caller<MABCP_ItmCopyReg, MA_MABCL0870_Srch02Bridge>
		caller = ((MABCP_ItmCopyReg_MC)this).new MA_MABCL0870_Srch02Caller<MABCP_ItmCopyReg, MA_MABCL0870_Srch02Bridge>(
					(MABCP_ItmCopyReg)this, new MA_MABCL0870_Srch02Bridge());
		return caller;
	}
	/** [MA_MABCL0870_Srch02]の呼び出し */
	protected void callMA_MABCL0870_Srch02() {
		MCCaller caller = createMA_MABCL0870_Srch02();
		caller.exec();
	}
	/** [MA_MABCL0870_Upd01]のCallerの作成 */
	protected MABCP_ItmCopyReg_MC.MA_MABCL0870_Upd01Caller createMA_MABCL0870_Upd01() {
		MABCP_ItmCopyReg_MC.MA_MABCL0870_Upd01Caller<MABCP_ItmCopyReg, MA_MABCL0870_Upd01Bridge>
		caller = ((MABCP_ItmCopyReg_MC)this).new MA_MABCL0870_Upd01Caller<MABCP_ItmCopyReg, MA_MABCL0870_Upd01Bridge>(
					(MABCP_ItmCopyReg)this, new MA_MABCL0870_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0870_Upd01]の呼び出し */
	protected void callMA_MABCL0870_Upd01() {
		MCCaller caller = createMA_MABCL0870_Upd01();
		caller.exec();
	}
	/** [MA_MABCL0870_Del01]のCallerの作成 */
	protected MABCP_ItmCopyReg_MC.MA_MABCL0870_Del01Caller createMA_MABCL0870_Del01() {
		MABCP_ItmCopyReg_MC.MA_MABCL0870_Del01Caller<MABCP_ItmCopyReg, MA_MABCL0870_Del01Bridge>
		caller = ((MABCP_ItmCopyReg_MC)this).new MA_MABCL0870_Del01Caller<MABCP_ItmCopyReg, MA_MABCL0870_Del01Bridge>(
					(MABCP_ItmCopyReg)this, new MA_MABCL0870_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL0870_Del01]の呼び出し */
	protected void callMA_MABCL0870_Del01() {
		MCCaller caller = createMA_MABCL0870_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0870.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0870.DtlR> aDtlL;
	/** [CopyTgt]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0870.CopyTgtR aCopyTgtR;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0870.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0870.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0870.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0870.CndR createCndR() {
		return mcframe.clientMABC.MABCP0870.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0870.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0870.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0870.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0870.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0870.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0870.DtlR.class);
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
	public void setCopyTgtR(mcframe.clientMABC.MABCP0870.CopyTgtR row) {
		if (row != null) {
			MCRow.copyall(getCopyTgtR(), row);
		}
	}

	/**
	 * [CopyTgt]ブロックのコンテナaCopyTgtRを返します。
	 *
	 * @return CopyTgtR
	 */
	public mcframe.clientMABC.MABCP0870.CopyTgtR getCopyTgtR() {
		return aCopyTgtR;
	}

	/**
	 * aCopyTgtRを作成します。
	 *
	 * @return CopyTgtR
	 */
	public mcframe.clientMABC.MABCP0870.CopyTgtR createCopyTgtR() {
		return mcframe.clientMABC.MABCP0870.CopyTgtR.create();
	}

	/**
	 * 項目コピーによってaBtnRを設定します。
	 *
	 * aBtnRのインスタンスは変更されません。
	 *
	 * @param row BtnR
	 */
	public void setBtnR(mcframe.clientMABC.MABCP0870.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMABC.MABCP0870.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMABC.MABCP0870.BtnR createBtnR() {
		return mcframe.clientMABC.MABCP0870.BtnR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getCopyTgtR())) ret.add(getCopyTgtR());
		if(!MCCollectionUtil.contains(ret, getBtnR())) ret.add(getBtnR());
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
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getCopyTgtR()) return "CopyTgt";
		if(aCnt == getBtnR()) return "Btn";
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
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("CopyTgt")) return getCopyTgtR();
		if(bId.equals("Btn")) return getBtnR();
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
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(TgtPanel);
		ret.add(CopyTgtPanel);
		ret.add(NoCopyTgtPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_ItmCopyReg_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();
		aCopyTgtR = createCopyTgtR();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_ItmCopyReg_MC_A(String name) {
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aCopyTgtR = createCopyTgtR();
		aBtnR = createBtnR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_ItmCopyReg_MC.jbCreateScreenOpe((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbCreateTop((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbCreateFold((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbCreateTab1((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbCreateTab2((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbCreateCnd((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbCreateCnd2((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbCreateCtrl((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbCreateDtl((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbCreateDtlBtn((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbCreateTgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbCreateCopyTgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbCreateNoCopyTgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbCreateBtn((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbCreateEastBtn((MABCP_ItmCopyReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_ItmCopyReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_ItmCopyReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_ItmCopyReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MABCP_ItmCopyReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MABCP_ItmCopyReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_ItmCopyReg p) {
		p.Cnd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.create(p.getCndR().dt_p());
		p.Cnd_dt_p_PPanel.setName("Cnd.dt_p");
		p.Cnd_st_dt_fr = p.Cnd_dt_p_PPanel.StEndDt_st_dt_fr;
		p.Cnd_st_dt_fr.addAliasName("Cnd.st_dt_fr", p);
		p.Cnd_st_dt_to = p.Cnd_dt_p_PPanel.StEndDt_st_dt_to;
		p.Cnd_st_dt_to.addAliasName("Cnd.st_dt_to", p);
		p.Cnd_end_dt_fr = p.Cnd_dt_p_PPanel.StEndDt_end_dt_fr;
		p.Cnd_end_dt_fr.addAliasName("Cnd.end_dt_fr", p);
		p.Cnd_end_dt_to = p.Cnd_dt_p_PPanel.StEndDt_end_dt_to;
		p.Cnd_end_dt_to.addAliasName("Cnd.end_dt_to", p);
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
		p.Cnd_ref_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().ref_itm_p());
		p.Cnd_ref_itm_p_PPanel.setName("Cnd.ref_itm_p");
		p.Cnd_ref_itm_cd = p.Cnd_ref_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_ref_itm_cd.addAliasName("Cnd.ref_itm_cd", p);
		p.Cnd_ref_itm_sub1 = p.Cnd_ref_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_ref_itm_sub1.addAliasName("Cnd.ref_itm_sub1", p);
		p.Cnd_ref_itm_sub2 = p.Cnd_ref_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_ref_itm_sub2.addAliasName("Cnd.ref_itm_sub2", p);
		p.Cnd_ref_itm_sub3 = p.Cnd_ref_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_ref_itm_sub3.addAliasName("Cnd.ref_itm_sub3", p);
		p.Cnd_ref_itm_nm = p.Cnd_ref_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_ref_itm_nm.addAliasName("Cnd.ref_itm_nm", p);
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MABCP_ItmCopyReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_ItmCopyReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_ItmCopyReg p) {
		p.Dtl_src_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABC.MABCP0870.DtlR.$src_itm_p);
		p.Dtl_src_itm_p_PPanel.setName("Dtl.src_itm_p");
		p.columnDtl_src_itm_cd = p.Dtl_src_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_src_itm_cd.addAliasName("Dtl.src_itm_cd", p);
		p.columnDtl_src_itm_sub1 = p.Dtl_src_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_src_itm_sub1.addAliasName("Dtl.src_itm_sub1", p);
		p.columnDtl_src_itm_sub2 = p.Dtl_src_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_src_itm_sub2.addAliasName("Dtl.src_itm_sub2", p);
		p.columnDtl_src_itm_sub3 = p.Dtl_src_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_src_itm_sub3.addAliasName("Dtl.src_itm_sub3", p);
		p.columnDtl_src_itm_nm = p.Dtl_src_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_src_itm_nm.addAliasName("Dtl.src_itm_nm", p);
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABCP_ItmCopyReg p) {
	}

	/**
	 * [Tgt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTgt(MABCP_ItmCopyReg p) {
	}

	/**
	 * [CopyTgt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCopyTgt(MABCP_ItmCopyReg p) {
	}

	/**
	 * [NoCopyTgt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateNoCopyTgt(MABCP_ItmCopyReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_ItmCopyReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_ItmCopyReg p) {
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_ItmCopyReg create(){
		MABCP_ItmCopyReg p = new MABCP_ItmCopyReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_ItmCopyReg create(String name){
		MABCP_ItmCopyReg p = new MABCP_ItmCopyReg(name);
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
		MABCP_ItmCopyReg_MC.jbfInitScreenOpe((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbfInitTop((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbfInitFold((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbfInitTab1((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbfInitTab2((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbfInitCnd((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbfInitCnd2((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbfInitCtrl((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbfInitDtl((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbfInitDtlBtn((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbfInitTgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbfInitCopyTgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbfInitNoCopyTgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbfInitBtn((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbfInitEastBtn((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbInitScreenOpe((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbInitTop((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbInitFold((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbInitTab1((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbInitTab2((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbInitCnd((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbInitCnd2((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbInitCtrl((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbInitDtl((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbInitDtlBtn((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbInitTgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbInitCopyTgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbInitNoCopyTgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbInitBtn((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.jbInitEastBtn((MABCP_ItmCopyReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_ItmCopyReg p) {
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
	protected static void jbfInitTab1(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_REF_UPD = p.beansFactory.createRadioButton("Cnd.ope_REF_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_chng_no_Label = p.beansFactory.createLabel("Cnd.chng_no_Label");
		p.Cnd_chng_no = p.beansFactory.createTextField("Cnd.chng_no");
		p.Cnd_chng_no.setLabel(p.Cnd_chng_no_Label);
		p.Cnd_release_flg_lab = p.beansFactory.createLabel("Cnd.release_flg_lab");
		p.Cnd_release_flg_off = p.beansFactory.createCheckBox("Cnd.release_flg_off");
		p.Cnd_release_flg_on = p.beansFactory.createCheckBox("Cnd.release_flg_on");
		p.Cnd_memo1_c_Label = p.beansFactory.createLabel("Cnd.memo1_c_Label");
		p.Cnd_memo1_c = p.beansFactory.createTextField("Cnd.memo1_c");
		p.Cnd_memo1_c.setLabel(p.Cnd_memo1_c_Label);
		p.Cnd_memo2_c_Label = p.beansFactory.createLabel("Cnd.memo2_c_Label");
		p.Cnd_memo2_c = p.beansFactory.createTextField("Cnd.memo2_c");
		p.Cnd_memo2_c.setLabel(p.Cnd_memo2_c_Label);
		p.Cnd_memo3_c_Label = p.beansFactory.createLabel("Cnd.memo3_c_Label");
		p.Cnd_memo3_c = p.beansFactory.createTextField("Cnd.memo3_c");
		p.Cnd_memo3_c.setLabel(p.Cnd_memo3_c_Label);
		p.Cnd_memo1_Label = p.beansFactory.createLabel("Cnd.memo1_Label");
		p.Cnd_memo1 = p.beansFactory.createTextField("Cnd.memo1");
		p.Cnd_memo1.setLabel(p.Cnd_memo1_Label);
		p.Cnd_memo2_Label = p.beansFactory.createLabel("Cnd.memo2_Label");
		p.Cnd_memo2 = p.beansFactory.createTextField("Cnd.memo2");
		p.Cnd_memo2.setLabel(p.Cnd_memo2_Label);
		p.Cnd_memo3_Label = p.beansFactory.createLabel("Cnd.memo3_Label");
		p.Cnd_memo3 = p.beansFactory.createTextField("Cnd.memo3");
		p.Cnd_memo3.setLabel(p.Cnd_memo3_Label);
		p.Cnd_del_flg_lab = p.beansFactory.createLabel("Cnd.del_flg_lab");
		p.Cnd_off_del_flg = p.beansFactory.createCheckBox("Cnd.off_del_flg");
		p.Cnd_on_del_flg = p.beansFactory.createCheckBox("Cnd.on_del_flg");
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
	protected static void jbfInitCnd2(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_base_itm_nm = p.beansFactory.createTableColumn("Dtl.base_itm_nm", MCColumnType.TEXT);
		p.columnDtl_itm_typ = p.beansFactory.createTableColumn("Dtl.itm_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.itm_typ_d_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_dest_itm_cd = p.beansFactory.createTableColumn("Dtl.dest_itm_cd", MCColumnType.TEXT);
		p.columnDtl_dest_itm_sub1 = p.beansFactory.createTableColumn("Dtl.dest_itm_sub1", MCColumnType.TEXT);
		p.columnDtl_dest_itm_sub2 = p.beansFactory.createTableColumn("Dtl.dest_itm_sub2", MCColumnType.TEXT);
		p.columnDtl_dest_itm_sub3 = p.beansFactory.createTableColumn("Dtl.dest_itm_sub3", MCColumnType.TEXT);
		p.columnDtl_dest_itm_nm = p.beansFactory.createTableColumn("Dtl.dest_itm_nm", MCColumnType.TEXT);
		p.columnDtl_chng_no = p.beansFactory.createTableColumn("Dtl.chng_no", MCColumnType.TEXT);
		p.columnDtl_memo1 = p.beansFactory.createTableColumn("Dtl.memo1", MCColumnType.TEXT);
		p.columnDtl_memo2 = p.beansFactory.createTableColumn("Dtl.memo2", MCColumnType.TEXT);
		p.columnDtl_memo3 = p.beansFactory.createTableColumn("Dtl.memo3", MCColumnType.TEXT);
		p.columnDtl_itm_cnt = p.beansFactory.createTableColumn("Dtl.itm_cnt", MCColumnType.NUMBER);
		p.columnDtl_itm_sub_cnt = p.beansFactory.createTableColumn("Dtl.itm_sub_cnt", MCColumnType.NUMBER);
		p.columnDtl_itm_unit_cnt = p.beansFactory.createTableColumn("Dtl.itm_unit_cnt", MCColumnType.NUMBER);
		p.columnDtl_itm_stop_cnt = p.beansFactory.createTableColumn("Dtl.itm_stop_cnt", MCColumnType.NUMBER);
		p.columnDtl_stdcost_cnt = p.beansFactory.createTableColumn("Dtl.stdcost_cnt", MCColumnType.NUMBER);
		p.columnDtl_itm_strg_cnt = p.beansFactory.createTableColumn("Dtl.itm_strg_cnt", MCColumnType.NUMBER);
		p.columnDtl_itm_lg_grp_cnt = p.beansFactory.createTableColumn("Dtl.itm_lg_grp_cnt", MCColumnType.NUMBER);
		p.columnDtl_itm_str_ln_cnt = p.beansFactory.createTableColumn("Dtl.itm_str_ln_cnt", MCColumnType.NUMBER);
		p.columnDtl_alloc_ctl_cnt = p.beansFactory.createTableColumn("Dtl.alloc_ctl_cnt", MCColumnType.NUMBER);
		p.columnDtl_stk_rpl_cnt = p.beansFactory.createTableColumn("Dtl.stk_rpl_cnt", MCColumnType.NUMBER);
		p.columnDtl_itm_wg_cnt = p.beansFactory.createTableColumn("Dtl.itm_wg_cnt", MCColumnType.NUMBER);
		p.columnDtl_itm_dtl_cnt = p.beansFactory.createTableColumn("Dtl.itm_dtl_cnt", MCColumnType.NUMBER);
		p.columnDtl_itm_oper_cnt = p.beansFactory.createTableColumn("Dtl.itm_oper_cnt", MCColumnType.NUMBER);
		p.columnDtl_bom_par_cnt = p.beansFactory.createTableColumn("Dtl.bom_par_cnt", MCColumnType.NUMBER);
		p.columnDtl_oper_wk_cost_cnt = p.beansFactory.createTableColumn("Dtl.oper_wk_cost_cnt", MCColumnType.NUMBER);
		p.columnDtl_itm_insp_ptn_cnt = p.beansFactory.createTableColumn("Dtl.itm_insp_ptn_cnt", MCColumnType.NUMBER);
		p.columnDtl_itm_insp_cnt = p.beansFactory.createTableColumn("Dtl.itm_insp_cnt", MCColumnType.NUMBER);
		p.columnDtl_insp_spec_cnt = p.beansFactory.createTableColumn("Dtl.insp_spec_cnt", MCColumnType.NUMBER);
		p.columnDtl_itm_site_cnt = p.beansFactory.createTableColumn("Dtl.itm_site_cnt", MCColumnType.NUMBER);
		p.columnDtl_mps_itm_cnt = p.beansFactory.createTableColumn("Dtl.mps_itm_cnt", MCColumnType.NUMBER);
		p.columnDtl_spln_itm_conf_cnt = p.beansFactory.createTableColumn("Dtl.spln_itm_conf_cnt", MCColumnType.NUMBER);
		p.columnDtl_purc_ddlv_lt_cnt = p.beansFactory.createTableColumn("Dtl.purc_ddlv_lt_cnt", MCColumnType.NUMBER);
		p.columnDtl_bp_itm_cnt = p.beansFactory.createTableColumn("Dtl.bp_itm_cnt", MCColumnType.NUMBER);
		p.columnDtl_set_itm_main_cnt = p.beansFactory.createTableColumn("Dtl.set_itm_main_cnt", MCColumnType.NUMBER);
		p.columnDtl_ctg_config_cnt = p.beansFactory.createTableColumn("Dtl.ctg_config_cnt", MCColumnType.NUMBER);
		p.columnDtl_itm_ver_cnt = p.beansFactory.createTableColumn("Dtl.itm_ver_cnt", MCColumnType.NUMBER);
		p.columnDtl_coef_config_cnt = p.beansFactory.createTableColumn("Dtl.coef_config_cnt", MCColumnType.NUMBER);
		p.columnDtl_alc_expns_cnt = p.beansFactory.createTableColumn("Dtl.alc_expns_cnt", MCColumnType.NUMBER);
		p.columnDtl_alc_inpt_cnt = p.beansFactory.createTableColumn("Dtl.alc_inpt_cnt", MCColumnType.NUMBER);
		p.columnDtl_cost_itm_out_cnt = p.beansFactory.createTableColumn("Dtl.cost_itm_out_cnt", MCColumnType.NUMBER);
		p.columnDtl_xpns_purc_alc_cnt = p.beansFactory.createTableColumn("Dtl.xpns_purc_alc_cnt", MCColumnType.NUMBER);
		p.columnDtl_attach_info_cnt = p.beansFactory.createTableColumn("Dtl.attach_info_cnt", MCColumnType.NUMBER);
		p.columnDtl_itm_not_fix_cnt = p.beansFactory.createTableColumn("Dtl.itm_not_fix_cnt", MCColumnType.NUMBER);
		p.columnDtl_sundry_itm_cnt = p.beansFactory.createTableColumn("Dtl.sundry_itm_cnt", MCColumnType.NUMBER);
		p.columnDtl_alt_itm_cnt = p.beansFactory.createTableColumn("Dtl.alt_itm_cnt", MCColumnType.NUMBER);
		p.columnDtl_bom_chd_cnt = p.beansFactory.createTableColumn("Dtl.bom_chd_cnt", MCColumnType.NUMBER);
		p.columnDtl_proc_upri_cnt = p.beansFactory.createTableColumn("Dtl.proc_upri_cnt", MCColumnType.NUMBER);
		p.columnDtl_prov_upri_cnt = p.beansFactory.createTableColumn("Dtl.prov_upri_cnt", MCColumnType.NUMBER);
		p.columnDtl_purc_upri_cnt = p.beansFactory.createTableColumn("Dtl.purc_upri_cnt", MCColumnType.NUMBER);
		p.columnDtl_std_sls_upri_cnt = p.beansFactory.createTableColumn("Dtl.std_sls_upri_cnt", MCColumnType.NUMBER);
		p.columnDtl_itm_sls_upri_cnt = p.beansFactory.createTableColumn("Dtl.itm_sls_upri_cnt", MCColumnType.NUMBER);
		p.columnDtl_cst_sls_upri_cnt = p.beansFactory.createTableColumn("Dtl.cst_sls_upri_cnt", MCColumnType.NUMBER);
		p.columnDtl_set_itm_set_cnt = p.beansFactory.createTableColumn("Dtl.set_itm_set_cnt", MCColumnType.NUMBER);
		p.columnDtl_jnl_ptn_cnt = p.beansFactory.createTableColumn("Dtl.jnl_ptn_cnt", MCColumnType.NUMBER);
		p.columnDtl_lot_inh_dest_cnt = p.beansFactory.createTableColumn("Dtl.lot_inh_dest_cnt", MCColumnType.NUMBER);
		p.columnDtl_itm_spec_cnt = p.beansFactory.createTableColumn("Dtl.itm_spec_cnt", MCColumnType.NUMBER);
		p.columnDtl_itm_spec_desc_cnt = p.beansFactory.createTableColumn("Dtl.itm_spec_desc_cnt", MCColumnType.NUMBER);
		p.columnDtl_itm_comp_core_cnt = p.beansFactory.createTableColumn("Dtl.itm_comp_core_cnt", MCColumnType.NUMBER);
		p.columnDtl_lot_inh_src_cnt = p.beansFactory.createTableColumn("Dtl.lot_inh_src_cnt", MCColumnType.NUMBER);
		p.columnDtl_if_x_cnt = p.beansFactory.createTableColumn("Dtl.if_x_cnt", MCColumnType.NUMBER);
		p.columnDtl_itm_comp_comp_cnt = p.beansFactory.createTableColumn("Dtl.itm_comp_comp_cnt", MCColumnType.NUMBER);
		p.columnDtl_itm_flg = p.beansFactory.createTableColumn("Dtl.itm_flg", MCColumnType.CHECK);
		p.columnDtl_itm_sub_flg = p.beansFactory.createTableColumn("Dtl.itm_sub_flg", MCColumnType.CHECK);
		p.columnDtl_itm_unit_flg = p.beansFactory.createTableColumn("Dtl.itm_unit_flg", MCColumnType.CHECK);
		p.columnDtl_itm_stop_flg = p.beansFactory.createTableColumn("Dtl.itm_stop_flg", MCColumnType.CHECK);
		p.columnDtl_stdcost_flg = p.beansFactory.createTableColumn("Dtl.stdcost_flg", MCColumnType.CHECK);
		p.columnDtl_itm_strg_flg = p.beansFactory.createTableColumn("Dtl.itm_strg_flg", MCColumnType.CHECK);
		p.columnDtl_itm_lg_grp_flg = p.beansFactory.createTableColumn("Dtl.itm_lg_grp_flg", MCColumnType.CHECK);
		p.columnDtl_itm_str_ln_flg = p.beansFactory.createTableColumn("Dtl.itm_str_ln_flg", MCColumnType.CHECK);
		p.columnDtl_alloc_ctl_flg = p.beansFactory.createTableColumn("Dtl.alloc_ctl_flg", MCColumnType.CHECK);
		p.columnDtl_stk_rpl_flg = p.beansFactory.createTableColumn("Dtl.stk_rpl_flg", MCColumnType.CHECK);
		p.columnDtl_itm_wg_flg = p.beansFactory.createTableColumn("Dtl.itm_wg_flg", MCColumnType.CHECK);
		p.columnDtl_itm_dtl_flg = p.beansFactory.createTableColumn("Dtl.itm_dtl_flg", MCColumnType.CHECK);
		p.columnDtl_itm_oper_flg = p.beansFactory.createTableColumn("Dtl.itm_oper_flg", MCColumnType.CHECK);
		p.columnDtl_bom_par_flg = p.beansFactory.createTableColumn("Dtl.bom_par_flg", MCColumnType.CHECK);
		p.columnDtl_oper_wk_cost_flg = p.beansFactory.createTableColumn("Dtl.oper_wk_cost_flg", MCColumnType.CHECK);
		p.columnDtl_itm_insp_ptn_flg = p.beansFactory.createTableColumn("Dtl.itm_insp_ptn_flg", MCColumnType.CHECK);
		p.columnDtl_itm_insp_flg = p.beansFactory.createTableColumn("Dtl.itm_insp_flg", MCColumnType.CHECK);
		p.columnDtl_insp_spec_flg = p.beansFactory.createTableColumn("Dtl.insp_spec_flg", MCColumnType.CHECK);
		p.columnDtl_itm_site_flg = p.beansFactory.createTableColumn("Dtl.itm_site_flg", MCColumnType.CHECK);
		p.columnDtl_mps_itm_flg = p.beansFactory.createTableColumn("Dtl.mps_itm_flg", MCColumnType.CHECK);
		p.columnDtl_spln_itm_conf_flg = p.beansFactory.createTableColumn("Dtl.spln_itm_conf_flg", MCColumnType.CHECK);
		p.columnDtl_purc_ddlv_lt_flg = p.beansFactory.createTableColumn("Dtl.purc_ddlv_lt_flg", MCColumnType.CHECK);
		p.columnDtl_bp_itm_flg = p.beansFactory.createTableColumn("Dtl.bp_itm_flg", MCColumnType.CHECK);
		p.columnDtl_set_itm_main_flg = p.beansFactory.createTableColumn("Dtl.set_itm_main_flg", MCColumnType.CHECK);
		p.columnDtl_ctg_config_flg = p.beansFactory.createTableColumn("Dtl.ctg_config_flg", MCColumnType.CHECK);
		p.columnDtl_itm_ver_flg = p.beansFactory.createTableColumn("Dtl.itm_ver_flg", MCColumnType.CHECK);
		p.columnDtl_coef_config_flg = p.beansFactory.createTableColumn("Dtl.coef_config_flg", MCColumnType.CHECK);
		p.columnDtl_alc_expns_flg = p.beansFactory.createTableColumn("Dtl.alc_expns_flg", MCColumnType.CHECK);
		p.columnDtl_alc_inpt_flg = p.beansFactory.createTableColumn("Dtl.alc_inpt_flg", MCColumnType.CHECK);
		p.columnDtl_cost_itm_out_flg = p.beansFactory.createTableColumn("Dtl.cost_itm_out_flg", MCColumnType.CHECK);
		p.columnDtl_xpns_purc_alc_flg = p.beansFactory.createTableColumn("Dtl.xpns_purc_alc_flg", MCColumnType.CHECK);
		p.columnDtl_attach_info_flg = p.beansFactory.createTableColumn("Dtl.attach_info_flg", MCColumnType.CHECK);
		p.columnDtl_itm_not_fix_flg = p.beansFactory.createTableColumn("Dtl.itm_not_fix_flg", MCColumnType.CHECK);
		p.columnDtl_sundry_itm_flg = p.beansFactory.createTableColumn("Dtl.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtl_alt_itm_flg = p.beansFactory.createTableColumn("Dtl.alt_itm_flg", MCColumnType.CHECK);
		p.columnDtl_bom_chd_flg = p.beansFactory.createTableColumn("Dtl.bom_chd_flg", MCColumnType.CHECK);
		p.columnDtl_proc_upri_flg = p.beansFactory.createTableColumn("Dtl.proc_upri_flg", MCColumnType.CHECK);
		p.columnDtl_prov_upri_flg = p.beansFactory.createTableColumn("Dtl.prov_upri_flg", MCColumnType.CHECK);
		p.columnDtl_purc_upri_flg = p.beansFactory.createTableColumn("Dtl.purc_upri_flg", MCColumnType.CHECK);
		p.columnDtl_std_sls_upri_flg = p.beansFactory.createTableColumn("Dtl.std_sls_upri_flg", MCColumnType.CHECK);
		p.columnDtl_itm_sls_upri_flg = p.beansFactory.createTableColumn("Dtl.itm_sls_upri_flg", MCColumnType.CHECK);
		p.columnDtl_cst_sls_upri_flg = p.beansFactory.createTableColumn("Dtl.cst_sls_upri_flg", MCColumnType.CHECK);
		p.columnDtl_set_itm_set_flg = p.beansFactory.createTableColumn("Dtl.set_itm_set_flg", MCColumnType.CHECK);
		p.columnDtl_jnl_ptn_flg = p.beansFactory.createTableColumn("Dtl.jnl_ptn_flg", MCColumnType.CHECK);
		p.columnDtl_lot_inh_dest_flg = p.beansFactory.createTableColumn("Dtl.lot_inh_dest_flg", MCColumnType.CHECK);
		p.columnDtl_itm_spec_flg = p.beansFactory.createTableColumn("Dtl.itm_spec_flg", MCColumnType.CHECK);
		p.columnDtl_itm_spec_desc_flg = p.beansFactory.createTableColumn("Dtl.itm_spec_desc_flg", MCColumnType.CHECK);
		p.columnDtl_itm_comp_core_flg = p.beansFactory.createTableColumn("Dtl.itm_comp_core_flg", MCColumnType.CHECK);
		p.columnDtl_lot_inh_src_flg = p.beansFactory.createTableColumn("Dtl.lot_inh_src_flg", MCColumnType.CHECK);
		p.columnDtl_if_x_flg = p.beansFactory.createTableColumn("Dtl.if_x_flg", MCColumnType.CHECK);
		p.columnDtl_itm_comp_comp_flg = p.beansFactory.createTableColumn("Dtl.itm_comp_comp_flg", MCColumnType.CHECK);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_select_all = p.beansFactory.createButton("DtlBtn.select_all", "no_border");
		p.DtlBtn_deselect_all = p.beansFactory.createButton("DtlBtn.deselect_all", "no_border");
	}

	/**
	 * [Tgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTgt(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.TgtPanel = p.beansFactory.createPanel("Tgt");
		p.TgtTab = p.beansFactory.createTabbedPane("Tgt.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [CopyTgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCopyTgt(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.CopyTgtPanel = p.beansFactory.createPanel("CopyTgt");
		// ブロックの項目の初期化
		p.CopyTgt_itm_flg = p.beansFactory.createCheckBox("CopyTgt.itm_flg");
		p.CopyTgt_open_MABCP0310 = p.beansFactory.createButton("CopyTgt.open_MABCP0310", "open");
		p.CopyTgt_itm_sub_flg = p.beansFactory.createCheckBox("CopyTgt.itm_sub_flg");
		p.CopyTgt_open_MABCP0320 = p.beansFactory.createButton("CopyTgt.open_MABCP0320", "open");
		p.CopyTgt_itm_unit_flg = p.beansFactory.createCheckBox("CopyTgt.itm_unit_flg");
		p.CopyTgt_open_MABCP0330 = p.beansFactory.createButton("CopyTgt.open_MABCP0330", "open");
		p.CopyTgt_itm_stop_flg = p.beansFactory.createCheckBox("CopyTgt.itm_stop_flg");
		p.CopyTgt_open_MABCP0360 = p.beansFactory.createButton("CopyTgt.open_MABCP0360", "open");
		p.CopyTgt_stdcost_flg = p.beansFactory.createCheckBox("CopyTgt.stdcost_flg");
		p.CopyTgt_open_MABCP0860 = p.beansFactory.createButton("CopyTgt.open_MABCP0860", "open");
		p.CopyTgt_itm_strg_flg = p.beansFactory.createCheckBox("CopyTgt.itm_strg_flg");
		p.CopyTgt_open_MABSP0150 = p.beansFactory.createButton("CopyTgt.open_MABSP0150", "open");
		p.CopyTgt_itm_lg_grp_flg = p.beansFactory.createCheckBox("CopyTgt.itm_lg_grp_flg");
		p.CopyTgt_open_MABSP0360 = p.beansFactory.createButton("CopyTgt.open_MABSP0360", "open");
		p.CopyTgt_itm_str_ln_flg = p.beansFactory.createCheckBox("CopyTgt.itm_str_ln_flg");
		p.CopyTgt_open_MABSP0370 = p.beansFactory.createButton("CopyTgt.open_MABSP0370", "open");
		p.CopyTgt_alloc_ctl_flg = p.beansFactory.createCheckBox("CopyTgt.alloc_ctl_flg");
		p.CopyTgt_open_MABSP0780 = p.beansFactory.createButton("CopyTgt.open_MABSP0780", "open");
		p.CopyTgt_stk_rpl_flg = p.beansFactory.createCheckBox("CopyTgt.stk_rpl_flg");
		p.CopyTgt_open_MABSP0800 = p.beansFactory.createButton("CopyTgt.open_MABSP0800", "open");
		p.CopyTgt_itm_wg_flg = p.beansFactory.createCheckBox("CopyTgt.itm_wg_flg");
		p.CopyTgt_open_MABSP0340 = p.beansFactory.createButton("CopyTgt.open_MABSP0340", "open");
		p.CopyTgt_itm_dtl_flg = p.beansFactory.createCheckBox("CopyTgt.itm_dtl_flg");
		p.CopyTgt_open_MABSP0010 = p.beansFactory.createButton("CopyTgt.open_MABSP0010", "open");
		p.CopyTgt_itm_oper_flg = p.beansFactory.createCheckBox("CopyTgt.itm_oper_flg");
		p.CopyTgt_open_MABSP0090 = p.beansFactory.createButton("CopyTgt.open_MABSP0090", "open");
		p.CopyTgt_bom_par_flg = p.beansFactory.createCheckBox("CopyTgt.bom_par_flg");
		p.CopyTgt_open_MABSP0030_par = p.beansFactory.createButton("CopyTgt.open_MABSP0030_par", "open");
		p.CopyTgt_oper_wk_cost_flg = p.beansFactory.createCheckBox("CopyTgt.oper_wk_cost_flg");
		p.CopyTgt_open_MABSP0110 = p.beansFactory.createButton("CopyTgt.open_MABSP0110", "open");
		p.CopyTgt_itm_insp_ptn_flg = p.beansFactory.createCheckBox("CopyTgt.itm_insp_ptn_flg");
		p.CopyTgt_open_MABSP0170 = p.beansFactory.createButton("CopyTgt.open_MABSP0170", "open");
		p.CopyTgt_itm_insp_flg = p.beansFactory.createCheckBox("CopyTgt.itm_insp_flg");
		p.CopyTgt_open_MABSP0190 = p.beansFactory.createButton("CopyTgt.open_MABSP0190", "open");
		p.CopyTgt_insp_spec_flg = p.beansFactory.createCheckBox("CopyTgt.insp_spec_flg");
		p.CopyTgt_open_MABSP0180 = p.beansFactory.createButton("CopyTgt.open_MABSP0180", "open");
		p.CopyTgt_itm_site_flg = p.beansFactory.createCheckBox("CopyTgt.itm_site_flg");
		p.CopyTgt_open_MABSP0350 = p.beansFactory.createButton("CopyTgt.open_MABSP0350", "open");
		p.CopyTgt_mps_itm_flg = p.beansFactory.createCheckBox("CopyTgt.mps_itm_flg");
		p.CopyTgt_open_MABSP0850 = p.beansFactory.createButton("CopyTgt.open_MABSP0850", "open");
		p.CopyTgt_spln_itm_conf_flg = p.beansFactory.createCheckBox("CopyTgt.spln_itm_conf_flg");
		p.CopyTgt_open_MABSP0830 = p.beansFactory.createButton("CopyTgt.open_MABSP0830", "open");
		p.CopyTgt_purc_ddlv_lt_flg = p.beansFactory.createCheckBox("CopyTgt.purc_ddlv_lt_flg");
		p.CopyTgt_open_MABSP0530 = p.beansFactory.createButton("CopyTgt.open_MABSP0530", "open");
		p.CopyTgt_bp_itm_flg = p.beansFactory.createCheckBox("CopyTgt.bp_itm_flg");
		p.CopyTgt_open_MABSP0640 = p.beansFactory.createButton("CopyTgt.open_MABSP0640", "open");
		p.CopyTgt_set_itm_main_flg = p.beansFactory.createCheckBox("CopyTgt.set_itm_main_flg");
		p.CopyTgt_open_MABSP1060_main = p.beansFactory.createButton("CopyTgt.open_MABSP1060_main", "open");
		p.CopyTgt_ctg_config_flg = p.beansFactory.createCheckBox("CopyTgt.ctg_config_flg");
		p.CopyTgt_open_MABCP2080 = p.beansFactory.createButton("CopyTgt.open_MABCP2080", "open");
		p.CopyTgt_itm_ver_flg = p.beansFactory.createCheckBox("CopyTgt.itm_ver_flg");
		p.CopyTgt_open_MABSP0770 = p.beansFactory.createButton("CopyTgt.open_MABSP0770", "open");
		p.CopyTgt_coef_config_flg = p.beansFactory.createCheckBox("CopyTgt.coef_config_flg");
		p.CopyTgt_open_MABGP0250 = p.beansFactory.createButton("CopyTgt.open_MABGP0250", "open");
		p.CopyTgt_alc_inpt_flg = p.beansFactory.createCheckBox("CopyTgt.alc_inpt_flg");
		p.CopyTgt_open_MABGP0310 = p.beansFactory.createButton("CopyTgt.open_MABGP0310", "open");
		p.CopyTgt_cost_itm_out_flg = p.beansFactory.createCheckBox("CopyTgt.cost_itm_out_flg");
		p.CopyTgt_open_MABGP0610 = p.beansFactory.createButton("CopyTgt.open_MABGP0610", "open");
		p.CopyTgt_xpns_purc_alc_flg = p.beansFactory.createCheckBox("CopyTgt.xpns_purc_alc_flg");
		p.CopyTgt_open_MABGP0630 = p.beansFactory.createButton("CopyTgt.open_MABGP0630", "open");
		p.CopyTgt_lot_inh_dest_flg = p.beansFactory.createCheckBox("CopyTgt.lot_inh_dest_flg");
		p.CopyTgt_open_MABSP0210_dest = p.beansFactory.createButton("CopyTgt.open_MABSP0210_dest", "open");
		p.CopyTgt_itm_spec_flg = p.beansFactory.createCheckBox("CopyTgt.itm_spec_flg");
		p.CopyTgt_open_MABSP0280 = p.beansFactory.createButton("CopyTgt.open_MABSP0280", "open");
		p.CopyTgt_itm_spec_desc_flg = p.beansFactory.createCheckBox("CopyTgt.itm_spec_desc_flg");
		p.CopyTgt_open_MABSP0310 = p.beansFactory.createButton("CopyTgt.open_MABSP0310", "open");
		p.CopyTgt_itm_comp_core_flg = p.beansFactory.createCheckBox("CopyTgt.itm_comp_core_flg");
		p.CopyTgt_open_MABSP0290_core = p.beansFactory.createButton("CopyTgt.open_MABSP0290_core", "open");
		p.CopyTgt_select_all = p.beansFactory.createButton("CopyTgt.select_all", "no_border");
		p.CopyTgt_deselect_all = p.beansFactory.createButton("CopyTgt.deselect_all", "no_border");
		p.CopyTgt_attach_info_flg = p.beansFactory.createCheckBox("CopyTgt.attach_info_flg");
		p.CopyTgt_open_MABCP0840 = p.beansFactory.createButton("CopyTgt.open_MABCP0840", "open");
		p.CopyTgt_itm_not_fix_flg = p.beansFactory.createCheckBox("CopyTgt.itm_not_fix_flg");
		p.CopyTgt_open_MABSP0320 = p.beansFactory.createButton("CopyTgt.open_MABSP0320", "open");
		p.CopyTgt_sundry_itm_flg = p.beansFactory.createCheckBox("CopyTgt.sundry_itm_flg");
		p.CopyTgt_open_MABCP0880 = p.beansFactory.createButton("CopyTgt.open_MABCP0880", "open");
		p.CopyTgt_alt_itm_flg = p.beansFactory.createCheckBox("CopyTgt.alt_itm_flg");
		p.CopyTgt_open_MABSP0080 = p.beansFactory.createButton("CopyTgt.open_MABSP0080", "open");
		p.CopyTgt_bom_chd_flg = p.beansFactory.createCheckBox("CopyTgt.bom_chd_flg");
		p.CopyTgt_open_MABSP0030 = p.beansFactory.createButton("CopyTgt.open_MABSP0030", "open");
		p.CopyTgt_proc_upri_flg = p.beansFactory.createCheckBox("CopyTgt.proc_upri_flg");
		p.CopyTgt_open_MABSP0140 = p.beansFactory.createButton("CopyTgt.open_MABSP0140", "open");
		p.CopyTgt_prov_upri_flg = p.beansFactory.createCheckBox("CopyTgt.prov_upri_flg");
		p.CopyTgt_open_MABSP0130 = p.beansFactory.createButton("CopyTgt.open_MABSP0130", "open");
		p.CopyTgt_purc_upri_flg = p.beansFactory.createCheckBox("CopyTgt.purc_upri_flg");
		p.CopyTgt_open_MABSP0120 = p.beansFactory.createButton("CopyTgt.open_MABSP0120", "open");
		p.CopyTgt_std_sls_upri_flg = p.beansFactory.createCheckBox("CopyTgt.std_sls_upri_flg");
		p.CopyTgt_open_MABSP0250 = p.beansFactory.createButton("CopyTgt.open_MABSP0250", "open");
		p.CopyTgt_itm_sls_upri_flg = p.beansFactory.createCheckBox("CopyTgt.itm_sls_upri_flg");
		p.CopyTgt_open_MABSP0240 = p.beansFactory.createButton("CopyTgt.open_MABSP0240", "open");
		p.CopyTgt_cst_sls_upri_flg = p.beansFactory.createCheckBox("CopyTgt.cst_sls_upri_flg");
		p.CopyTgt_open_MABSP0220 = p.beansFactory.createButton("CopyTgt.open_MABSP0220", "open");
		p.CopyTgt_set_itm_set_flg = p.beansFactory.createCheckBox("CopyTgt.set_itm_set_flg");
		p.CopyTgt_open_MABSP1060_set = p.beansFactory.createButton("CopyTgt.open_MABSP1060_set", "open");
		p.CopyTgt_alc_expns_flg = p.beansFactory.createCheckBox("CopyTgt.alc_expns_flg");
		p.CopyTgt_open_MABGP0300 = p.beansFactory.createButton("CopyTgt.open_MABGP0300", "open");
		p.CopyTgt_jnl_ptn_flg = p.beansFactory.createCheckBox("CopyTgt.jnl_ptn_flg");
		p.CopyTgt_open_MABCP1090 = p.beansFactory.createButton("CopyTgt.open_MABCP1090", "open");
		p.CopyTgt_lot_inh_src_flg = p.beansFactory.createCheckBox("CopyTgt.lot_inh_src_flg");
		p.CopyTgt_open_MABSP0210_src = p.beansFactory.createButton("CopyTgt.open_MABSP0210_src", "open");
		p.CopyTgt_if_x_flg = p.beansFactory.createCheckBox("CopyTgt.if_x_flg");
		p.CopyTgt_open_MABCP1520 = p.beansFactory.createButton("CopyTgt.open_MABCP1520", "open");
		p.CopyTgt_itm_comp_comp_flg = p.beansFactory.createCheckBox("CopyTgt.itm_comp_comp_flg");
		p.CopyTgt_open_MABSP0290_comp = p.beansFactory.createButton("CopyTgt.open_MABSP0290_comp", "open");
	}

	/**
	 * [NoCopyTgt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitNoCopyTgt(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.NoCopyTgtPanel = p.beansFactory.createPanel("NoCopyTgt");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_ex_on_del_flg = p.beansFactory.createCheckBox("Btn.ex_on_del_flg");
		p.Btn_ex_past_end_dt_Label = p.beansFactory.createLabel("Btn.ex_past_end_dt_Label");
		p.Btn_ex_past_end_dt = p.beansFactory.createDateField("Btn.ex_past_end_dt");
		p.Btn_ex_past_end_dt.setLabel(p.Btn_ex_past_end_dt_Label);
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_ItmCopyReg p) {
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
	protected static void jbInitTop(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.DtlPanel);
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
	protected static void jbInitFold(MABCP_ItmCopyReg p) {
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
	protected static void jbInitTab1(MABCP_ItmCopyReg p) {
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
	protected static void jbInitTab2(MABCP_ItmCopyReg p) {
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
	protected static void jbInitCnd(MABCP_ItmCopyReg p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.ope_META);
		p.CndPanel.add(p.Cnd_dt_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_dt_p_PPanel);
		p.Cnd_dt_p_PPanel.setNextBeans(p.Cnd_chng_no);
		p.CndPanel.add(p.Cnd_chng_no_Label);
		p.CndPanel.add(p.Cnd_chng_no);
		p.Cnd_chng_no.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_chng_no.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.chng_no_META);
		p.setPluralValueEnable(p.Cnd_chng_no, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_release_flg_off);
		p.CndPanel.add(p.Cnd_release_flg_lab);
		p.CndPanel.add(p.Cnd_release_flg_off);
		p.Cnd_release_flg_off.setNextBeans(p.Cnd_release_flg_on);
		p.Cnd_release_flg_off.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.release_flg_off_META);
		p.CndPanel.add(p.Cnd_release_flg_on);
		p.Cnd_release_flg_on.setNextBeans(p.Cnd_memo1_c);
		p.Cnd_release_flg_on.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.release_flg_on_META);
		p.CndPanel.add(p.Cnd_memo1_c_Label);
		p.CndPanel.add(p.Cnd_memo1_c);
		p.Cnd_memo1_c.setNextBeans(p.Cnd_memo2_c);
		p.Cnd_memo1_c.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.memo1_c_META);
		p.setPluralValueEnable(p.Cnd_memo1_c, true);
		p.CndPanel.add(p.Cnd_memo2_c_Label);
		p.CndPanel.add(p.Cnd_memo2_c);
		p.Cnd_memo2_c.setNextBeans(p.Cnd_memo3_c);
		p.Cnd_memo2_c.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.memo2_c_META);
		p.setPluralValueEnable(p.Cnd_memo2_c, true);
		p.CndPanel.add(p.Cnd_memo3_c_Label);
		p.CndPanel.add(p.Cnd_memo3_c);
		p.Cnd_memo3_c.setNextBeans(p.Cnd_memo1);
		p.Cnd_memo3_c.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.memo3_c_META);
		p.setPluralValueEnable(p.Cnd_memo3_c, true);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setNextBeans(p.Cnd_ref_itm_p_PPanel);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.on_del_flg_META);
		p.CndPanel.add(p.Cnd_ref_itm_p_PPanel);
		p.Cnd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd1, true);
		p.Cnd_itm_grp_cd1.setLinkBeans(p.Cnd_itm_grp_nm1);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd1);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_cd1);
		p.Cnd_itm_grp_cd1.setNextBeans(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.itm_grp_cd1_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_nm1.setNextBeans(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm1, true);
		p.Cnd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd2, true);
		p.Cnd_itm_grp_cd2.setLinkBeans(p.Cnd_itm_grp_nm2);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_cd2.setNextBeans(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.itm_grp_cd2_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_nm2.setNextBeans(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm2, true);
		p.Cnd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd3, true);
		p.Cnd_itm_grp_cd3.setLinkBeans(p.Cnd_itm_grp_nm3);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_cd3.setNextBeans(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.itm_grp_cd3_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_nm3.setNextBeans(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm3, true);
		p.Cnd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd4, true);
		p.Cnd_itm_grp_cd4.setLinkBeans(p.Cnd_itm_grp_nm4);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_cd4.setNextBeans(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.itm_grp_cd4_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_nm4.setNextBeans(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm4, true);
		p.Cnd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd5, true);
		p.Cnd_itm_grp_cd5.setLinkBeans(p.Cnd_itm_grp_nm5);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_cd5.setNextBeans(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.itm_grp_cd5_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_nm5.setNextBeans(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm5, true);
		p.Cnd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd6, true);
		p.Cnd_itm_grp_cd6.setLinkBeans(p.Cnd_itm_grp_nm6);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_cd6.setNextBeans(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.itm_grp_cd6_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_nm6.setNextBeans(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm6, true);
		p.Cnd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd7, true);
		p.Cnd_itm_grp_cd7.setLinkBeans(p.Cnd_itm_grp_nm7);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_cd7.setNextBeans(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.itm_grp_cd7_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_nm7.setNextBeans(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm7, true);
		p.Cnd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd8, true);
		p.Cnd_itm_grp_cd8.setLinkBeans(p.Cnd_itm_grp_nm8);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_cd8.setNextBeans(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.itm_grp_cd8_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_nm8.setNextBeans(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm8, true);
		p.Cnd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd9, true);
		p.Cnd_itm_grp_cd9.setLinkBeans(p.Cnd_itm_grp_nm9);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_cd9.setNextBeans(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.itm_grp_cd9_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_nm9.setNextBeans(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm9, true);
		p.Cnd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd10, true);
		p.Cnd_itm_grp_cd10.setLinkBeans(p.Cnd_itm_grp_nm10);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10_Label);
		p.Cnd2Panel.add(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_cd10.setNextBeans(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.itm_grp_cd10_META);
		p.Cnd2Panel.add(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMABC.MABCP0870.CndR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm10, true);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.add(p.DtlBtnPanel);
		p.DtlBtnPanel.setNextBeans(p.TgtPanel);
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
	 * [Tgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTgt(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.add(p.TgtPanel);
		p.TgtPanel.setNextBeans(p.BtnPanel);
		p.TgtPanel.add(p.TgtTab);
		p.TgtPanel.setLastBeans(p.TgtTab);
		p.TgtPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.TgtTab.add(p.CopyTgtPanel, "Tgt.tab1");
		p.TgtTab.setLastBeans(p.CopyTgtPanel);
		p.CopyTgtPanel.setNextBeans(p.NoCopyTgtPanel);
		p.TgtTab.add(p.NoCopyTgtPanel, "Tgt.tab2");
	}

	/**
	 * [CopyTgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCopyTgt(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.CopyTgtPanel.setNextBeans(p.NoCopyTgtPanel);
		p.CopyTgtPanel.setValueCheck(false);
		p.CopyTgtPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CopyTgtPanel.add(p.CopyTgt_itm_flg);
		p.CopyTgtPanel.setLastBeans(p.CopyTgt_itm_flg);
		p.CopyTgt_itm_flg.setNextBeans(p.CopyTgt_open_MABCP0310);
		p.CopyTgt_itm_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.itm_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABCP0310);
		p.CopyTgt_open_MABCP0310.setNextBeans(p.CopyTgt_itm_sub_flg);
		p.CopyTgtPanel.add(p.CopyTgt_itm_sub_flg);
		p.CopyTgt_itm_sub_flg.setNextBeans(p.CopyTgt_open_MABCP0320);
		p.CopyTgt_itm_sub_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.itm_sub_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABCP0320);
		p.CopyTgt_open_MABCP0320.setNextBeans(p.CopyTgt_itm_unit_flg);
		p.CopyTgtPanel.add(p.CopyTgt_itm_unit_flg);
		p.CopyTgt_itm_unit_flg.setNextBeans(p.CopyTgt_open_MABCP0330);
		p.CopyTgt_itm_unit_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.itm_unit_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABCP0330);
		p.CopyTgt_open_MABCP0330.setNextBeans(p.CopyTgt_itm_stop_flg);
		p.CopyTgtPanel.add(p.CopyTgt_itm_stop_flg);
		p.CopyTgt_itm_stop_flg.setNextBeans(p.CopyTgt_open_MABCP0360);
		p.CopyTgt_itm_stop_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.itm_stop_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABCP0360);
		p.CopyTgt_open_MABCP0360.setNextBeans(p.CopyTgt_stdcost_flg);
		p.CopyTgtPanel.add(p.CopyTgt_stdcost_flg);
		p.CopyTgt_stdcost_flg.setNextBeans(p.CopyTgt_open_MABCP0860);
		p.CopyTgt_stdcost_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.stdcost_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABCP0860);
		p.CopyTgt_open_MABCP0860.setNextBeans(p.CopyTgt_itm_strg_flg);
		p.CopyTgtPanel.add(p.CopyTgt_itm_strg_flg);
		p.CopyTgt_itm_strg_flg.setNextBeans(p.CopyTgt_open_MABSP0150);
		p.CopyTgt_itm_strg_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.itm_strg_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0150);
		p.CopyTgt_open_MABSP0150.setNextBeans(p.CopyTgt_itm_lg_grp_flg);
		p.CopyTgtPanel.add(p.CopyTgt_itm_lg_grp_flg);
		p.CopyTgt_itm_lg_grp_flg.setNextBeans(p.CopyTgt_open_MABSP0360);
		p.CopyTgt_itm_lg_grp_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.itm_lg_grp_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0360);
		p.CopyTgt_open_MABSP0360.setNextBeans(p.CopyTgt_itm_str_ln_flg);
		p.CopyTgtPanel.add(p.CopyTgt_itm_str_ln_flg);
		p.CopyTgt_itm_str_ln_flg.setNextBeans(p.CopyTgt_open_MABSP0370);
		p.CopyTgt_itm_str_ln_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.itm_str_ln_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0370);
		p.CopyTgt_open_MABSP0370.setNextBeans(p.CopyTgt_alloc_ctl_flg);
		p.CopyTgtPanel.add(p.CopyTgt_alloc_ctl_flg);
		p.CopyTgt_alloc_ctl_flg.setNextBeans(p.CopyTgt_open_MABSP0780);
		p.CopyTgt_alloc_ctl_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.alloc_ctl_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0780);
		p.CopyTgt_open_MABSP0780.setNextBeans(p.CopyTgt_stk_rpl_flg);
		p.CopyTgtPanel.add(p.CopyTgt_stk_rpl_flg);
		p.CopyTgt_stk_rpl_flg.setNextBeans(p.CopyTgt_open_MABSP0800);
		p.CopyTgt_stk_rpl_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.stk_rpl_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0800);
		p.CopyTgt_open_MABSP0800.setNextBeans(p.CopyTgt_itm_wg_flg);
		p.CopyTgtPanel.add(p.CopyTgt_itm_wg_flg);
		p.CopyTgt_itm_wg_flg.setNextBeans(p.CopyTgt_open_MABSP0340);
		p.CopyTgt_itm_wg_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.itm_wg_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0340);
		p.CopyTgt_open_MABSP0340.setNextBeans(p.CopyTgt_itm_dtl_flg);
		p.CopyTgtPanel.add(p.CopyTgt_itm_dtl_flg);
		p.CopyTgt_itm_dtl_flg.setNextBeans(p.CopyTgt_open_MABSP0010);
		p.CopyTgt_itm_dtl_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.itm_dtl_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0010);
		p.CopyTgt_open_MABSP0010.setNextBeans(p.CopyTgt_itm_oper_flg);
		p.CopyTgtPanel.add(p.CopyTgt_itm_oper_flg);
		p.CopyTgt_itm_oper_flg.setNextBeans(p.CopyTgt_open_MABSP0090);
		p.CopyTgt_itm_oper_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.itm_oper_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0090);
		p.CopyTgt_open_MABSP0090.setNextBeans(p.CopyTgt_bom_par_flg);
		p.CopyTgtPanel.add(p.CopyTgt_bom_par_flg);
		p.CopyTgt_bom_par_flg.setNextBeans(p.CopyTgt_open_MABSP0030_par);
		p.CopyTgt_bom_par_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.bom_par_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0030_par);
		p.CopyTgt_open_MABSP0030_par.setNextBeans(p.CopyTgt_oper_wk_cost_flg);
		p.CopyTgtPanel.add(p.CopyTgt_oper_wk_cost_flg);
		p.CopyTgt_oper_wk_cost_flg.setNextBeans(p.CopyTgt_open_MABSP0110);
		p.CopyTgt_oper_wk_cost_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.oper_wk_cost_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0110);
		p.CopyTgt_open_MABSP0110.setNextBeans(p.CopyTgt_itm_insp_ptn_flg);
		p.CopyTgtPanel.add(p.CopyTgt_itm_insp_ptn_flg);
		p.CopyTgt_itm_insp_ptn_flg.setNextBeans(p.CopyTgt_open_MABSP0170);
		p.CopyTgt_itm_insp_ptn_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.itm_insp_ptn_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0170);
		p.CopyTgt_open_MABSP0170.setNextBeans(p.CopyTgt_itm_insp_flg);
		p.CopyTgtPanel.add(p.CopyTgt_itm_insp_flg);
		p.CopyTgt_itm_insp_flg.setNextBeans(p.CopyTgt_open_MABSP0190);
		p.CopyTgt_itm_insp_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.itm_insp_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0190);
		p.CopyTgt_open_MABSP0190.setNextBeans(p.CopyTgt_insp_spec_flg);
		p.CopyTgtPanel.add(p.CopyTgt_insp_spec_flg);
		p.CopyTgt_insp_spec_flg.setNextBeans(p.CopyTgt_open_MABSP0180);
		p.CopyTgt_insp_spec_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.insp_spec_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0180);
		p.CopyTgt_open_MABSP0180.setNextBeans(p.CopyTgt_itm_site_flg);
		p.CopyTgtPanel.add(p.CopyTgt_itm_site_flg);
		p.CopyTgt_itm_site_flg.setNextBeans(p.CopyTgt_open_MABSP0350);
		p.CopyTgt_itm_site_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.itm_site_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0350);
		p.CopyTgt_open_MABSP0350.setNextBeans(p.CopyTgt_mps_itm_flg);
		p.CopyTgtPanel.add(p.CopyTgt_mps_itm_flg);
		p.CopyTgt_mps_itm_flg.setNextBeans(p.CopyTgt_open_MABSP0850);
		p.CopyTgt_mps_itm_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.mps_itm_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0850);
		p.CopyTgt_open_MABSP0850.setNextBeans(p.CopyTgt_spln_itm_conf_flg);
		p.CopyTgtPanel.add(p.CopyTgt_spln_itm_conf_flg);
		p.CopyTgt_spln_itm_conf_flg.setNextBeans(p.CopyTgt_open_MABSP0830);
		p.CopyTgt_spln_itm_conf_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.spln_itm_conf_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0830);
		p.CopyTgt_open_MABSP0830.setNextBeans(p.CopyTgt_purc_ddlv_lt_flg);
		p.CopyTgtPanel.add(p.CopyTgt_purc_ddlv_lt_flg);
		p.CopyTgt_purc_ddlv_lt_flg.setNextBeans(p.CopyTgt_open_MABSP0530);
		p.CopyTgt_purc_ddlv_lt_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.purc_ddlv_lt_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0530);
		p.CopyTgt_open_MABSP0530.setNextBeans(p.CopyTgt_bp_itm_flg);
		p.CopyTgtPanel.add(p.CopyTgt_bp_itm_flg);
		p.CopyTgt_bp_itm_flg.setNextBeans(p.CopyTgt_open_MABSP0640);
		p.CopyTgt_bp_itm_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.bp_itm_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0640);
		p.CopyTgt_open_MABSP0640.setNextBeans(p.CopyTgt_set_itm_main_flg);
		p.CopyTgtPanel.add(p.CopyTgt_set_itm_main_flg);
		p.CopyTgt_set_itm_main_flg.setNextBeans(p.CopyTgt_open_MABSP1060_main);
		p.CopyTgt_set_itm_main_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.set_itm_main_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP1060_main);
		p.CopyTgt_open_MABSP1060_main.setNextBeans(p.CopyTgt_ctg_config_flg);
		p.CopyTgtPanel.add(p.CopyTgt_ctg_config_flg);
		p.CopyTgt_ctg_config_flg.setNextBeans(p.CopyTgt_open_MABCP2080);
		p.CopyTgt_ctg_config_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.ctg_config_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABCP2080);
		p.CopyTgt_open_MABCP2080.setNextBeans(p.CopyTgt_itm_ver_flg);
		p.CopyTgtPanel.add(p.CopyTgt_itm_ver_flg);
		p.CopyTgt_itm_ver_flg.setNextBeans(p.CopyTgt_open_MABSP0770);
		p.CopyTgt_itm_ver_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.itm_ver_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0770);
		p.CopyTgt_open_MABSP0770.setNextBeans(p.CopyTgt_coef_config_flg);
		p.CopyTgtPanel.add(p.CopyTgt_coef_config_flg);
		p.CopyTgt_coef_config_flg.setNextBeans(p.CopyTgt_open_MABGP0250);
		p.CopyTgt_coef_config_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.coef_config_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABGP0250);
		p.CopyTgt_open_MABGP0250.setNextBeans(p.CopyTgt_alc_inpt_flg);
		p.CopyTgtPanel.add(p.CopyTgt_alc_inpt_flg);
		p.CopyTgt_alc_inpt_flg.setNextBeans(p.CopyTgt_open_MABGP0310);
		p.CopyTgt_alc_inpt_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.alc_inpt_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABGP0310);
		p.CopyTgt_open_MABGP0310.setNextBeans(p.CopyTgt_cost_itm_out_flg);
		p.CopyTgtPanel.add(p.CopyTgt_cost_itm_out_flg);
		p.CopyTgt_cost_itm_out_flg.setNextBeans(p.CopyTgt_open_MABGP0610);
		p.CopyTgt_cost_itm_out_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.cost_itm_out_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABGP0610);
		p.CopyTgt_open_MABGP0610.setNextBeans(p.CopyTgt_xpns_purc_alc_flg);
		p.CopyTgtPanel.add(p.CopyTgt_xpns_purc_alc_flg);
		p.CopyTgt_xpns_purc_alc_flg.setNextBeans(p.CopyTgt_open_MABGP0630);
		p.CopyTgt_xpns_purc_alc_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.xpns_purc_alc_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABGP0630);
		p.CopyTgt_open_MABGP0630.setNextBeans(p.CopyTgt_lot_inh_dest_flg);
		p.CopyTgtPanel.add(p.CopyTgt_lot_inh_dest_flg);
		p.CopyTgt_lot_inh_dest_flg.setNextBeans(p.CopyTgt_open_MABSP0210_dest);
		p.CopyTgt_lot_inh_dest_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.lot_inh_dest_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0210_dest);
		p.CopyTgt_open_MABSP0210_dest.setNextBeans(p.CopyTgt_itm_spec_flg);
		p.CopyTgtPanel.add(p.CopyTgt_itm_spec_flg);
		p.CopyTgt_itm_spec_flg.setNextBeans(p.CopyTgt_open_MABSP0280);
		p.CopyTgt_itm_spec_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.itm_spec_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0280);
		p.CopyTgt_open_MABSP0280.setNextBeans(p.CopyTgt_itm_spec_desc_flg);
		p.CopyTgtPanel.add(p.CopyTgt_itm_spec_desc_flg);
		p.CopyTgt_itm_spec_desc_flg.setNextBeans(p.CopyTgt_open_MABSP0310);
		p.CopyTgt_itm_spec_desc_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.itm_spec_desc_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0310);
		p.CopyTgt_open_MABSP0310.setNextBeans(p.CopyTgt_itm_comp_core_flg);
		p.CopyTgtPanel.add(p.CopyTgt_itm_comp_core_flg);
		p.CopyTgt_itm_comp_core_flg.setNextBeans(p.CopyTgt_open_MABSP0290_core);
		p.CopyTgt_itm_comp_core_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.itm_comp_core_flg_META);
		p.CopyTgtPanel.add(p.CopyTgt_open_MABSP0290_core);
		p.CopyTgt_open_MABSP0290_core.setNextBeans(p.CopyTgt_select_all);
		p.CopyTgt_select_all.setIcon("SELECT_ALL");
		p.CopyTgtPanel.add(p.CopyTgt_select_all);
		p.CopyTgt_select_all.setNextBeans(p.CopyTgt_deselect_all);
		p.CopyTgt_deselect_all.setIcon("DESELECT_ALL");
		p.CopyTgtPanel.add(p.CopyTgt_deselect_all);
		p.NoCopyTgtPanel.add(p.CopyTgt_attach_info_flg);
		p.NoCopyTgtPanel.setLastBeans(p.CopyTgt_attach_info_flg);
		p.CopyTgt_attach_info_flg.setNextBeans(p.CopyTgt_open_MABCP0840);
		p.CopyTgt_attach_info_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.attach_info_flg_META);
		p.NoCopyTgtPanel.add(p.CopyTgt_open_MABCP0840);
		p.CopyTgt_open_MABCP0840.setNextBeans(p.CopyTgt_itm_not_fix_flg);
		p.NoCopyTgtPanel.add(p.CopyTgt_itm_not_fix_flg);
		p.CopyTgt_itm_not_fix_flg.setNextBeans(p.CopyTgt_open_MABSP0320);
		p.CopyTgt_itm_not_fix_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.itm_not_fix_flg_META);
		p.NoCopyTgtPanel.add(p.CopyTgt_open_MABSP0320);
		p.CopyTgt_open_MABSP0320.setNextBeans(p.CopyTgt_sundry_itm_flg);
		p.NoCopyTgtPanel.add(p.CopyTgt_sundry_itm_flg);
		p.CopyTgt_sundry_itm_flg.setNextBeans(p.CopyTgt_open_MABCP0880);
		p.CopyTgt_sundry_itm_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.sundry_itm_flg_META);
		p.NoCopyTgtPanel.add(p.CopyTgt_open_MABCP0880);
		p.CopyTgt_open_MABCP0880.setNextBeans(p.CopyTgt_alt_itm_flg);
		p.NoCopyTgtPanel.add(p.CopyTgt_alt_itm_flg);
		p.CopyTgt_alt_itm_flg.setNextBeans(p.CopyTgt_open_MABSP0080);
		p.CopyTgt_alt_itm_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.alt_itm_flg_META);
		p.NoCopyTgtPanel.add(p.CopyTgt_open_MABSP0080);
		p.CopyTgt_open_MABSP0080.setNextBeans(p.CopyTgt_bom_chd_flg);
		p.NoCopyTgtPanel.add(p.CopyTgt_bom_chd_flg);
		p.CopyTgt_bom_chd_flg.setNextBeans(p.CopyTgt_open_MABSP0030);
		p.CopyTgt_bom_chd_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.bom_chd_flg_META);
		p.NoCopyTgtPanel.add(p.CopyTgt_open_MABSP0030);
		p.CopyTgt_open_MABSP0030.setNextBeans(p.CopyTgt_proc_upri_flg);
		p.NoCopyTgtPanel.add(p.CopyTgt_proc_upri_flg);
		p.CopyTgt_proc_upri_flg.setNextBeans(p.CopyTgt_open_MABSP0140);
		p.CopyTgt_proc_upri_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.proc_upri_flg_META);
		p.NoCopyTgtPanel.add(p.CopyTgt_open_MABSP0140);
		p.CopyTgt_open_MABSP0140.setNextBeans(p.CopyTgt_prov_upri_flg);
		p.NoCopyTgtPanel.add(p.CopyTgt_prov_upri_flg);
		p.CopyTgt_prov_upri_flg.setNextBeans(p.CopyTgt_open_MABSP0130);
		p.CopyTgt_prov_upri_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.prov_upri_flg_META);
		p.NoCopyTgtPanel.add(p.CopyTgt_open_MABSP0130);
		p.CopyTgt_open_MABSP0130.setNextBeans(p.CopyTgt_purc_upri_flg);
		p.NoCopyTgtPanel.add(p.CopyTgt_purc_upri_flg);
		p.CopyTgt_purc_upri_flg.setNextBeans(p.CopyTgt_open_MABSP0120);
		p.CopyTgt_purc_upri_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.purc_upri_flg_META);
		p.NoCopyTgtPanel.add(p.CopyTgt_open_MABSP0120);
		p.CopyTgt_open_MABSP0120.setNextBeans(p.CopyTgt_std_sls_upri_flg);
		p.NoCopyTgtPanel.add(p.CopyTgt_std_sls_upri_flg);
		p.CopyTgt_std_sls_upri_flg.setNextBeans(p.CopyTgt_open_MABSP0250);
		p.CopyTgt_std_sls_upri_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.std_sls_upri_flg_META);
		p.NoCopyTgtPanel.add(p.CopyTgt_open_MABSP0250);
		p.CopyTgt_open_MABSP0250.setNextBeans(p.CopyTgt_itm_sls_upri_flg);
		p.NoCopyTgtPanel.add(p.CopyTgt_itm_sls_upri_flg);
		p.CopyTgt_itm_sls_upri_flg.setNextBeans(p.CopyTgt_open_MABSP0240);
		p.CopyTgt_itm_sls_upri_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.itm_sls_upri_flg_META);
		p.NoCopyTgtPanel.add(p.CopyTgt_open_MABSP0240);
		p.CopyTgt_open_MABSP0240.setNextBeans(p.CopyTgt_cst_sls_upri_flg);
		p.NoCopyTgtPanel.add(p.CopyTgt_cst_sls_upri_flg);
		p.CopyTgt_cst_sls_upri_flg.setNextBeans(p.CopyTgt_open_MABSP0220);
		p.CopyTgt_cst_sls_upri_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.cst_sls_upri_flg_META);
		p.NoCopyTgtPanel.add(p.CopyTgt_open_MABSP0220);
		p.CopyTgt_open_MABSP0220.setNextBeans(p.CopyTgt_set_itm_set_flg);
		p.NoCopyTgtPanel.add(p.CopyTgt_set_itm_set_flg);
		p.CopyTgt_set_itm_set_flg.setNextBeans(p.CopyTgt_open_MABSP1060_set);
		p.CopyTgt_set_itm_set_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.set_itm_set_flg_META);
		p.NoCopyTgtPanel.add(p.CopyTgt_open_MABSP1060_set);
		p.CopyTgt_open_MABSP1060_set.setNextBeans(p.CopyTgt_alc_expns_flg);
		p.NoCopyTgtPanel.add(p.CopyTgt_alc_expns_flg);
		p.CopyTgt_alc_expns_flg.setNextBeans(p.CopyTgt_open_MABGP0300);
		p.CopyTgt_alc_expns_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.alc_expns_flg_META);
		p.NoCopyTgtPanel.add(p.CopyTgt_open_MABGP0300);
		p.CopyTgt_open_MABGP0300.setNextBeans(p.CopyTgt_jnl_ptn_flg);
		p.NoCopyTgtPanel.add(p.CopyTgt_jnl_ptn_flg);
		p.CopyTgt_jnl_ptn_flg.setNextBeans(p.CopyTgt_open_MABCP1090);
		p.CopyTgt_jnl_ptn_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.jnl_ptn_flg_META);
		p.NoCopyTgtPanel.add(p.CopyTgt_open_MABCP1090);
		p.CopyTgt_open_MABCP1090.setNextBeans(p.CopyTgt_lot_inh_src_flg);
		p.NoCopyTgtPanel.add(p.CopyTgt_lot_inh_src_flg);
		p.CopyTgt_lot_inh_src_flg.setNextBeans(p.CopyTgt_open_MABSP0210_src);
		p.CopyTgt_lot_inh_src_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.lot_inh_src_flg_META);
		p.NoCopyTgtPanel.add(p.CopyTgt_open_MABSP0210_src);
		p.CopyTgt_open_MABSP0210_src.setNextBeans(p.CopyTgt_if_x_flg);
		p.NoCopyTgtPanel.add(p.CopyTgt_if_x_flg);
		p.CopyTgt_if_x_flg.setNextBeans(p.CopyTgt_open_MABCP1520);
		p.CopyTgt_if_x_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.if_x_flg_META);
		p.NoCopyTgtPanel.add(p.CopyTgt_open_MABCP1520);
		p.CopyTgt_open_MABCP1520.setNextBeans(p.CopyTgt_itm_comp_comp_flg);
		p.NoCopyTgtPanel.add(p.CopyTgt_itm_comp_comp_flg);
		p.CopyTgt_itm_comp_comp_flg.setNextBeans(p.CopyTgt_open_MABSP0290_comp);
		p.CopyTgt_itm_comp_comp_flg.setRow(p.getCopyTgtR(), mcframe.clientMABC.MABCP0870.CopyTgtR.itm_comp_comp_flg_META);
		p.NoCopyTgtPanel.add(p.CopyTgt_open_MABSP0290_comp);
	}

	/**
	 * [NoCopyTgt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitNoCopyTgt(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.NoCopyTgtPanel.setValueCheck(false);
		p.NoCopyTgtPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABCP_ItmCopyReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SSW");
		// ブロックの項目の初期化
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.BtnPanel.setLastBeans(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_ex_on_del_flg);
		p.BtnPanel.add(p.Btn_ex_on_del_flg);
		p.Btn_ex_on_del_flg.setNextBeans(p.Btn_ex_past_end_dt);
		p.Btn_ex_on_del_flg.setRow(p.getBtnR(), mcframe.clientMABC.MABCP0870.BtnR.ex_on_del_flg_META);
		p.BtnPanel.add(p.Btn_ex_past_end_dt_Label);
		p.BtnPanel.add(p.Btn_ex_past_end_dt);
		p.Btn_ex_past_end_dt.setRow(p.getBtnR(), mcframe.clientMABC.MABCP0870.BtnR.ex_past_end_dt_META);
		p.Btn_ex_past_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABCP_ItmCopyReg p) {
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
		MABCP_ItmCopyReg_MC.mcInitScreenOpe((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.mcInitTop((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.mcInitFold((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.mcInitTab1((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.mcInitTab2((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.mcInitCnd((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.mcInitCnd2((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.mcInitCtrl((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.mcInitDtl((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.mcInitDtlBtn((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.mcInitTgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.mcInitCopyTgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.mcInitNoCopyTgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.mcInitBtn((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.mcInitEastBtn((MABCP_ItmCopyReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_ItmCopyReg_MC.statusInitUPD_ScreenOpe((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitUPD_Top((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitUPD_Fold((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitUPD_Tab1((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitUPD_Tab2((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitUPD_Cnd((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitUPD_Cnd2((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitUPD_Ctrl((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitUPD_Dtl((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitUPD_DtlBtn((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitUPD_Tgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitUPD_CopyTgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitUPD_NoCopyTgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitUPD_Btn((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitUPD_EastBtn((MABCP_ItmCopyReg)this);

		// [REF_UPD]ステータスのモードの設定
		MABCP_ItmCopyReg_MC.statusInitREF__UPD_ScreenOpe((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF__UPD_Top((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF__UPD_Fold((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF__UPD_Tab1((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF__UPD_Tab2((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF__UPD_Cnd((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF__UPD_Cnd2((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF__UPD_Ctrl((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF__UPD_Dtl((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF__UPD_DtlBtn((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF__UPD_Tgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF__UPD_CopyTgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF__UPD_NoCopyTgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF__UPD_Btn((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF__UPD_EastBtn((MABCP_ItmCopyReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_ItmCopyReg_MC.statusInitDEL_ScreenOpe((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitDEL_Top((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitDEL_Fold((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitDEL_Tab1((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitDEL_Tab2((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitDEL_Cnd((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitDEL_Cnd2((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitDEL_Ctrl((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitDEL_Dtl((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitDEL_DtlBtn((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitDEL_Tgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitDEL_CopyTgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitDEL_NoCopyTgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitDEL_Btn((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitDEL_EastBtn((MABCP_ItmCopyReg)this);

		// [REF]ステータスのモードの設定
		MABCP_ItmCopyReg_MC.statusInitREF_ScreenOpe((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF_Top((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF_Fold((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF_Tab1((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF_Tab2((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF_Cnd((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF_Cnd2((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF_Ctrl((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF_Dtl((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF_DtlBtn((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF_Tgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF_CopyTgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF_NoCopyTgt((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF_Btn((MABCP_ItmCopyReg)this);
		MABCP_ItmCopyReg_MC.statusInitREF_EastBtn((MABCP_ItmCopyReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_ItmCopyReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_ItmCopyReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_ItmCopyReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MABCP_ItmCopyReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MABCP_ItmCopyReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_ItmCopyReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_REF_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_chng_no.setListListener(p);
		p.Cnd_chng_no.addAllListener(p);
		p.Cnd_release_flg_off.addAllListener(p);
		p.Cnd_release_flg_on.addAllListener(p);
		p.Cnd_memo1_c.setListListener(p);
		p.Cnd_memo1_c.addAllListener(p);
		p.Cnd_memo2_c.setListListener(p);
		p.Cnd_memo2_c.addAllListener(p);
		p.Cnd_memo3_c.setListListener(p);
		p.Cnd_memo3_c.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
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
	protected static void mcInitCnd2(MABCP_ItmCopyReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABCP_ItmCopyReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_ItmCopyReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
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
		p.columnDtl_dest_itm_cd.addAllListener(p);
		p.columnDtl_dest_itm_cd.setListListener(p);
		p.columnDtl_dest_itm_sub1.addAllListener(p);
		p.columnDtl_dest_itm_sub1.setListListener(p);
		p.columnDtl_dest_itm_sub2.addAllListener(p);
		p.columnDtl_dest_itm_sub2.setListListener(p);
		p.columnDtl_dest_itm_sub3.addAllListener(p);
		p.columnDtl_dest_itm_sub3.setListListener(p);
		p.columnDtl_dest_itm_nm.addAllListener(p);
		p.columnDtl_dest_itm_nm.setListListener(p);
		p.columnDtl_chng_no.addAllListener(p);
		p.columnDtl_chng_no.setListListener(p);
		p.columnDtl_memo1.addAllListener(p);
		p.columnDtl_memo1.setListListener(p);
		p.columnDtl_memo2.addAllListener(p);
		p.columnDtl_memo2.setListListener(p);
		p.columnDtl_memo3.addAllListener(p);
		p.columnDtl_memo3.setListListener(p);
		p.columnDtl_itm_cnt.addAllListener(p);
		p.columnDtl_itm_cnt.setListListener(p);
		p.columnDtl_itm_sub_cnt.addAllListener(p);
		p.columnDtl_itm_sub_cnt.setListListener(p);
		p.columnDtl_itm_unit_cnt.addAllListener(p);
		p.columnDtl_itm_unit_cnt.setListListener(p);
		p.columnDtl_itm_stop_cnt.addAllListener(p);
		p.columnDtl_itm_stop_cnt.setListListener(p);
		p.columnDtl_stdcost_cnt.addAllListener(p);
		p.columnDtl_stdcost_cnt.setListListener(p);
		p.columnDtl_itm_strg_cnt.addAllListener(p);
		p.columnDtl_itm_strg_cnt.setListListener(p);
		p.columnDtl_itm_lg_grp_cnt.addAllListener(p);
		p.columnDtl_itm_lg_grp_cnt.setListListener(p);
		p.columnDtl_itm_str_ln_cnt.addAllListener(p);
		p.columnDtl_itm_str_ln_cnt.setListListener(p);
		p.columnDtl_alloc_ctl_cnt.addAllListener(p);
		p.columnDtl_alloc_ctl_cnt.setListListener(p);
		p.columnDtl_stk_rpl_cnt.addAllListener(p);
		p.columnDtl_stk_rpl_cnt.setListListener(p);
		p.columnDtl_itm_wg_cnt.addAllListener(p);
		p.columnDtl_itm_wg_cnt.setListListener(p);
		p.columnDtl_itm_dtl_cnt.addAllListener(p);
		p.columnDtl_itm_dtl_cnt.setListListener(p);
		p.columnDtl_itm_oper_cnt.addAllListener(p);
		p.columnDtl_itm_oper_cnt.setListListener(p);
		p.columnDtl_bom_par_cnt.addAllListener(p);
		p.columnDtl_bom_par_cnt.setListListener(p);
		p.columnDtl_oper_wk_cost_cnt.addAllListener(p);
		p.columnDtl_oper_wk_cost_cnt.setListListener(p);
		p.columnDtl_itm_insp_ptn_cnt.addAllListener(p);
		p.columnDtl_itm_insp_ptn_cnt.setListListener(p);
		p.columnDtl_itm_insp_cnt.addAllListener(p);
		p.columnDtl_itm_insp_cnt.setListListener(p);
		p.columnDtl_insp_spec_cnt.addAllListener(p);
		p.columnDtl_insp_spec_cnt.setListListener(p);
		p.columnDtl_itm_site_cnt.addAllListener(p);
		p.columnDtl_itm_site_cnt.setListListener(p);
		p.columnDtl_mps_itm_cnt.addAllListener(p);
		p.columnDtl_mps_itm_cnt.setListListener(p);
		p.columnDtl_spln_itm_conf_cnt.addAllListener(p);
		p.columnDtl_spln_itm_conf_cnt.setListListener(p);
		p.columnDtl_purc_ddlv_lt_cnt.addAllListener(p);
		p.columnDtl_purc_ddlv_lt_cnt.setListListener(p);
		p.columnDtl_bp_itm_cnt.addAllListener(p);
		p.columnDtl_bp_itm_cnt.setListListener(p);
		p.columnDtl_set_itm_main_cnt.addAllListener(p);
		p.columnDtl_set_itm_main_cnt.setListListener(p);
		p.columnDtl_ctg_config_cnt.addAllListener(p);
		p.columnDtl_ctg_config_cnt.setListListener(p);
		p.columnDtl_itm_ver_cnt.addAllListener(p);
		p.columnDtl_itm_ver_cnt.setListListener(p);
		p.columnDtl_coef_config_cnt.addAllListener(p);
		p.columnDtl_coef_config_cnt.setListListener(p);
		p.columnDtl_alc_expns_cnt.addAllListener(p);
		p.columnDtl_alc_expns_cnt.setListListener(p);
		p.columnDtl_alc_inpt_cnt.addAllListener(p);
		p.columnDtl_alc_inpt_cnt.setListListener(p);
		p.columnDtl_cost_itm_out_cnt.addAllListener(p);
		p.columnDtl_cost_itm_out_cnt.setListListener(p);
		p.columnDtl_xpns_purc_alc_cnt.addAllListener(p);
		p.columnDtl_xpns_purc_alc_cnt.setListListener(p);
		p.columnDtl_attach_info_cnt.addAllListener(p);
		p.columnDtl_attach_info_cnt.setListListener(p);
		p.columnDtl_itm_not_fix_cnt.addAllListener(p);
		p.columnDtl_itm_not_fix_cnt.setListListener(p);
		p.columnDtl_sundry_itm_cnt.addAllListener(p);
		p.columnDtl_sundry_itm_cnt.setListListener(p);
		p.columnDtl_alt_itm_cnt.addAllListener(p);
		p.columnDtl_alt_itm_cnt.setListListener(p);
		p.columnDtl_bom_chd_cnt.addAllListener(p);
		p.columnDtl_bom_chd_cnt.setListListener(p);
		p.columnDtl_proc_upri_cnt.addAllListener(p);
		p.columnDtl_proc_upri_cnt.setListListener(p);
		p.columnDtl_prov_upri_cnt.addAllListener(p);
		p.columnDtl_prov_upri_cnt.setListListener(p);
		p.columnDtl_purc_upri_cnt.addAllListener(p);
		p.columnDtl_purc_upri_cnt.setListListener(p);
		p.columnDtl_std_sls_upri_cnt.addAllListener(p);
		p.columnDtl_std_sls_upri_cnt.setListListener(p);
		p.columnDtl_itm_sls_upri_cnt.addAllListener(p);
		p.columnDtl_itm_sls_upri_cnt.setListListener(p);
		p.columnDtl_cst_sls_upri_cnt.addAllListener(p);
		p.columnDtl_cst_sls_upri_cnt.setListListener(p);
		p.columnDtl_set_itm_set_cnt.addAllListener(p);
		p.columnDtl_set_itm_set_cnt.setListListener(p);
		p.columnDtl_jnl_ptn_cnt.addAllListener(p);
		p.columnDtl_jnl_ptn_cnt.setListListener(p);
		p.columnDtl_lot_inh_dest_cnt.addAllListener(p);
		p.columnDtl_lot_inh_dest_cnt.setListListener(p);
		p.columnDtl_itm_spec_cnt.addAllListener(p);
		p.columnDtl_itm_spec_cnt.setListListener(p);
		p.columnDtl_itm_spec_desc_cnt.addAllListener(p);
		p.columnDtl_itm_spec_desc_cnt.setListListener(p);
		p.columnDtl_itm_comp_core_cnt.addAllListener(p);
		p.columnDtl_itm_comp_core_cnt.setListListener(p);
		p.columnDtl_lot_inh_src_cnt.addAllListener(p);
		p.columnDtl_lot_inh_src_cnt.setListListener(p);
		p.columnDtl_if_x_cnt.addAllListener(p);
		p.columnDtl_if_x_cnt.setListListener(p);
		p.columnDtl_itm_comp_comp_cnt.addAllListener(p);
		p.columnDtl_itm_comp_comp_cnt.setListListener(p);
		p.columnDtl_itm_flg.addAllListener(p);
		p.columnDtl_itm_sub_flg.addAllListener(p);
		p.columnDtl_itm_unit_flg.addAllListener(p);
		p.columnDtl_itm_stop_flg.addAllListener(p);
		p.columnDtl_stdcost_flg.addAllListener(p);
		p.columnDtl_itm_strg_flg.addAllListener(p);
		p.columnDtl_itm_lg_grp_flg.addAllListener(p);
		p.columnDtl_itm_str_ln_flg.addAllListener(p);
		p.columnDtl_alloc_ctl_flg.addAllListener(p);
		p.columnDtl_stk_rpl_flg.addAllListener(p);
		p.columnDtl_itm_wg_flg.addAllListener(p);
		p.columnDtl_itm_dtl_flg.addAllListener(p);
		p.columnDtl_itm_oper_flg.addAllListener(p);
		p.columnDtl_bom_par_flg.addAllListener(p);
		p.columnDtl_oper_wk_cost_flg.addAllListener(p);
		p.columnDtl_itm_insp_ptn_flg.addAllListener(p);
		p.columnDtl_itm_insp_flg.addAllListener(p);
		p.columnDtl_insp_spec_flg.addAllListener(p);
		p.columnDtl_itm_site_flg.addAllListener(p);
		p.columnDtl_mps_itm_flg.addAllListener(p);
		p.columnDtl_spln_itm_conf_flg.addAllListener(p);
		p.columnDtl_purc_ddlv_lt_flg.addAllListener(p);
		p.columnDtl_bp_itm_flg.addAllListener(p);
		p.columnDtl_set_itm_main_flg.addAllListener(p);
		p.columnDtl_ctg_config_flg.addAllListener(p);
		p.columnDtl_itm_ver_flg.addAllListener(p);
		p.columnDtl_coef_config_flg.addAllListener(p);
		p.columnDtl_alc_expns_flg.addAllListener(p);
		p.columnDtl_alc_inpt_flg.addAllListener(p);
		p.columnDtl_cost_itm_out_flg.addAllListener(p);
		p.columnDtl_xpns_purc_alc_flg.addAllListener(p);
		p.columnDtl_attach_info_flg.addAllListener(p);
		p.columnDtl_itm_not_fix_flg.addAllListener(p);
		p.columnDtl_sundry_itm_flg.addAllListener(p);
		p.columnDtl_alt_itm_flg.addAllListener(p);
		p.columnDtl_bom_chd_flg.addAllListener(p);
		p.columnDtl_proc_upri_flg.addAllListener(p);
		p.columnDtl_prov_upri_flg.addAllListener(p);
		p.columnDtl_purc_upri_flg.addAllListener(p);
		p.columnDtl_std_sls_upri_flg.addAllListener(p);
		p.columnDtl_itm_sls_upri_flg.addAllListener(p);
		p.columnDtl_cst_sls_upri_flg.addAllListener(p);
		p.columnDtl_set_itm_set_flg.addAllListener(p);
		p.columnDtl_jnl_ptn_flg.addAllListener(p);
		p.columnDtl_lot_inh_dest_flg.addAllListener(p);
		p.columnDtl_itm_spec_flg.addAllListener(p);
		p.columnDtl_itm_spec_desc_flg.addAllListener(p);
		p.columnDtl_itm_comp_core_flg.addAllListener(p);
		p.columnDtl_lot_inh_src_flg.addAllListener(p);
		p.columnDtl_if_x_flg.addAllListener(p);
		p.columnDtl_itm_comp_comp_flg.addAllListener(p);
	}

	/**
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABCP_ItmCopyReg p) {
		p.DtlBtn_select_all.addAllListener(p);
		p.DtlBtn_select_all.setAPMethodName("doDtlBtn_select_all");
		p.DtlBtn_deselect_all.addAllListener(p);
		p.DtlBtn_deselect_all.setAPMethodName("doDtlBtn_deselect_all");
	}

	/**
	 *  [Tgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTgt(MABCP_ItmCopyReg p) {
		p.TgtTab.addAllListener(p);
	}

	/**
	 *  [CopyTgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCopyTgt(MABCP_ItmCopyReg p) {
		p.CopyTgt_itm_flg.addAllListener(p);
		p.CopyTgt_open_MABCP0310.addAllListener(p);
		p.CopyTgt_open_MABCP0310.setAPMethodName("doCopyTgt_open_MABCP0310");
		p.CopyTgt_itm_sub_flg.addAllListener(p);
		p.CopyTgt_open_MABCP0320.addAllListener(p);
		p.CopyTgt_open_MABCP0320.setAPMethodName("doCopyTgt_open_MABCP0320");
		p.CopyTgt_itm_unit_flg.addAllListener(p);
		p.CopyTgt_open_MABCP0330.addAllListener(p);
		p.CopyTgt_open_MABCP0330.setAPMethodName("doCopyTgt_open_MABCP0330");
		p.CopyTgt_itm_stop_flg.addAllListener(p);
		p.CopyTgt_open_MABCP0360.addAllListener(p);
		p.CopyTgt_open_MABCP0360.setAPMethodName("doCopyTgt_open_MABCP0360");
		p.CopyTgt_stdcost_flg.addAllListener(p);
		p.CopyTgt_open_MABCP0860.addAllListener(p);
		p.CopyTgt_open_MABCP0860.setAPMethodName("doCopyTgt_open_MABCP0860");
		p.CopyTgt_itm_strg_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0150.addAllListener(p);
		p.CopyTgt_open_MABSP0150.setAPMethodName("doCopyTgt_open_MABSP0150");
		p.CopyTgt_itm_lg_grp_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0360.addAllListener(p);
		p.CopyTgt_open_MABSP0360.setAPMethodName("doCopyTgt_open_MABSP0360");
		p.CopyTgt_itm_str_ln_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0370.addAllListener(p);
		p.CopyTgt_open_MABSP0370.setAPMethodName("doCopyTgt_open_MABSP0370");
		p.CopyTgt_alloc_ctl_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0780.addAllListener(p);
		p.CopyTgt_open_MABSP0780.setAPMethodName("doCopyTgt_open_MABSP0780");
		p.CopyTgt_stk_rpl_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0800.addAllListener(p);
		p.CopyTgt_open_MABSP0800.setAPMethodName("doCopyTgt_open_MABSP0800");
		p.CopyTgt_itm_wg_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0340.addAllListener(p);
		p.CopyTgt_open_MABSP0340.setAPMethodName("doCopyTgt_open_MABSP0340");
		p.CopyTgt_itm_dtl_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0010.addAllListener(p);
		p.CopyTgt_open_MABSP0010.setAPMethodName("doCopyTgt_open_MABSP0010");
		p.CopyTgt_itm_oper_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0090.addAllListener(p);
		p.CopyTgt_open_MABSP0090.setAPMethodName("doCopyTgt_open_MABSP0090");
		p.CopyTgt_bom_par_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0030_par.addAllListener(p);
		p.CopyTgt_open_MABSP0030_par.setAPMethodName("doCopyTgt_open_MABSP0030_par");
		p.CopyTgt_oper_wk_cost_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0110.addAllListener(p);
		p.CopyTgt_open_MABSP0110.setAPMethodName("doCopyTgt_open_MABSP0110");
		p.CopyTgt_itm_insp_ptn_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0170.addAllListener(p);
		p.CopyTgt_open_MABSP0170.setAPMethodName("doCopyTgt_open_MABSP0170");
		p.CopyTgt_itm_insp_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0190.addAllListener(p);
		p.CopyTgt_open_MABSP0190.setAPMethodName("doCopyTgt_open_MABSP0190");
		p.CopyTgt_insp_spec_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0180.addAllListener(p);
		p.CopyTgt_open_MABSP0180.setAPMethodName("doCopyTgt_open_MABSP0180");
		p.CopyTgt_itm_site_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0350.addAllListener(p);
		p.CopyTgt_open_MABSP0350.setAPMethodName("doCopyTgt_open_MABSP0350");
		p.CopyTgt_mps_itm_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0850.addAllListener(p);
		p.CopyTgt_open_MABSP0850.setAPMethodName("doCopyTgt_open_MABSP0850");
		p.CopyTgt_spln_itm_conf_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0830.addAllListener(p);
		p.CopyTgt_open_MABSP0830.setAPMethodName("doCopyTgt_open_MABSP0830");
		p.CopyTgt_purc_ddlv_lt_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0530.addAllListener(p);
		p.CopyTgt_open_MABSP0530.setAPMethodName("doCopyTgt_open_MABSP0530");
		p.CopyTgt_bp_itm_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0640.addAllListener(p);
		p.CopyTgt_open_MABSP0640.setAPMethodName("doCopyTgt_open_MABSP0640");
		p.CopyTgt_set_itm_main_flg.addAllListener(p);
		p.CopyTgt_open_MABSP1060_main.addAllListener(p);
		p.CopyTgt_open_MABSP1060_main.setAPMethodName("doCopyTgt_open_MABSP1060_main");
		p.CopyTgt_ctg_config_flg.addAllListener(p);
		p.CopyTgt_open_MABCP2080.addAllListener(p);
		p.CopyTgt_open_MABCP2080.setAPMethodName("doCopyTgt_open_MABCP2080");
		p.CopyTgt_itm_ver_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0770.addAllListener(p);
		p.CopyTgt_open_MABSP0770.setAPMethodName("doCopyTgt_open_MABSP0770");
		p.CopyTgt_coef_config_flg.addAllListener(p);
		p.CopyTgt_open_MABGP0250.addAllListener(p);
		p.CopyTgt_open_MABGP0250.setAPMethodName("doCopyTgt_open_MABGP0250");
		p.CopyTgt_alc_inpt_flg.addAllListener(p);
		p.CopyTgt_open_MABGP0310.addAllListener(p);
		p.CopyTgt_open_MABGP0310.setAPMethodName("doCopyTgt_open_MABGP0310");
		p.CopyTgt_cost_itm_out_flg.addAllListener(p);
		p.CopyTgt_open_MABGP0610.addAllListener(p);
		p.CopyTgt_open_MABGP0610.setAPMethodName("doCopyTgt_open_MABGP0610");
		p.CopyTgt_xpns_purc_alc_flg.addAllListener(p);
		p.CopyTgt_open_MABGP0630.addAllListener(p);
		p.CopyTgt_open_MABGP0630.setAPMethodName("doCopyTgt_open_MABGP0630");
		p.CopyTgt_lot_inh_dest_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0210_dest.addAllListener(p);
		p.CopyTgt_open_MABSP0210_dest.setAPMethodName("doCopyTgt_open_MABSP0210_dest");
		p.CopyTgt_itm_spec_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0280.addAllListener(p);
		p.CopyTgt_open_MABSP0280.setAPMethodName("doCopyTgt_open_MABSP0280");
		p.CopyTgt_itm_spec_desc_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0310.addAllListener(p);
		p.CopyTgt_open_MABSP0310.setAPMethodName("doCopyTgt_open_MABSP0310");
		p.CopyTgt_itm_comp_core_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0290_core.addAllListener(p);
		p.CopyTgt_open_MABSP0290_core.setAPMethodName("doCopyTgt_open_MABSP0290_core");
		p.CopyTgt_select_all.addAllListener(p);
		p.CopyTgt_select_all.setAPMethodName("doCopyTgt_select_all");
		p.CopyTgt_deselect_all.addAllListener(p);
		p.CopyTgt_deselect_all.setAPMethodName("doCopyTgt_deselect_all");
		p.CopyTgt_attach_info_flg.addAllListener(p);
		p.CopyTgt_open_MABCP0840.addAllListener(p);
		p.CopyTgt_open_MABCP0840.setAPMethodName("doCopyTgt_open_MABCP0840");
		p.CopyTgt_itm_not_fix_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0320.addAllListener(p);
		p.CopyTgt_open_MABSP0320.setAPMethodName("doCopyTgt_open_MABSP0320");
		p.CopyTgt_sundry_itm_flg.addAllListener(p);
		p.CopyTgt_open_MABCP0880.addAllListener(p);
		p.CopyTgt_open_MABCP0880.setAPMethodName("doCopyTgt_open_MABCP0880");
		p.CopyTgt_alt_itm_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0080.addAllListener(p);
		p.CopyTgt_open_MABSP0080.setAPMethodName("doCopyTgt_open_MABSP0080");
		p.CopyTgt_bom_chd_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0030.addAllListener(p);
		p.CopyTgt_open_MABSP0030.setAPMethodName("doCopyTgt_open_MABSP0030");
		p.CopyTgt_proc_upri_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0140.addAllListener(p);
		p.CopyTgt_open_MABSP0140.setAPMethodName("doCopyTgt_open_MABSP0140");
		p.CopyTgt_prov_upri_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0130.addAllListener(p);
		p.CopyTgt_open_MABSP0130.setAPMethodName("doCopyTgt_open_MABSP0130");
		p.CopyTgt_purc_upri_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0120.addAllListener(p);
		p.CopyTgt_open_MABSP0120.setAPMethodName("doCopyTgt_open_MABSP0120");
		p.CopyTgt_std_sls_upri_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0250.addAllListener(p);
		p.CopyTgt_open_MABSP0250.setAPMethodName("doCopyTgt_open_MABSP0250");
		p.CopyTgt_itm_sls_upri_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0240.addAllListener(p);
		p.CopyTgt_open_MABSP0240.setAPMethodName("doCopyTgt_open_MABSP0240");
		p.CopyTgt_cst_sls_upri_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0220.addAllListener(p);
		p.CopyTgt_open_MABSP0220.setAPMethodName("doCopyTgt_open_MABSP0220");
		p.CopyTgt_set_itm_set_flg.addAllListener(p);
		p.CopyTgt_open_MABSP1060_set.addAllListener(p);
		p.CopyTgt_open_MABSP1060_set.setAPMethodName("doCopyTgt_open_MABSP1060_set");
		p.CopyTgt_alc_expns_flg.addAllListener(p);
		p.CopyTgt_open_MABGP0300.addAllListener(p);
		p.CopyTgt_open_MABGP0300.setAPMethodName("doCopyTgt_open_MABGP0300");
		p.CopyTgt_jnl_ptn_flg.addAllListener(p);
		p.CopyTgt_open_MABCP1090.addAllListener(p);
		p.CopyTgt_open_MABCP1090.setAPMethodName("doCopyTgt_open_MABCP1090");
		p.CopyTgt_lot_inh_src_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0210_src.addAllListener(p);
		p.CopyTgt_open_MABSP0210_src.setAPMethodName("doCopyTgt_open_MABSP0210_src");
		p.CopyTgt_if_x_flg.addAllListener(p);
		p.CopyTgt_open_MABCP1520.addAllListener(p);
		p.CopyTgt_open_MABCP1520.setAPMethodName("doCopyTgt_open_MABCP1520");
		p.CopyTgt_itm_comp_comp_flg.addAllListener(p);
		p.CopyTgt_open_MABSP0290_comp.addAllListener(p);
		p.CopyTgt_open_MABSP0290_comp.setAPMethodName("doCopyTgt_open_MABSP0290_comp");
	}

	/**
	 *  [NoCopyTgt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitNoCopyTgt(MABCP_ItmCopyReg p) {
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABCP_ItmCopyReg p) {
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_ex_on_del_flg.addAllListener(p);
		p.Btn_ex_past_end_dt.setListListener(p);
		p.Btn_ex_past_end_dt.addAllListener(p);
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABCP_ItmCopyReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_ItmCopyReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_ItmCopyReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_ItmCopyReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MABCP_ItmCopyReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MABCP_ItmCopyReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_ItmCopyReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_chng_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_release_flg_off.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_release_flg_on.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_memo1_c.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2_c.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3_c.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ref_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
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
	protected static void statusInitUPD_Cnd2(MABCP_ItmCopyReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_ItmCopyReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_ItmCopyReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_src_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_base_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_itm_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_dest_itm_sub1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dest_itm_sub2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dest_itm_sub3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dest_itm_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_chng_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itm_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_sub_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_unit_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_stop_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_stdcost_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_strg_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_lg_grp_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_str_ln_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alloc_ctl_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_stk_rpl_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_wg_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_dtl_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_oper_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bom_par_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_oper_wk_cost_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_insp_ptn_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_insp_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_insp_spec_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_site_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mps_itm_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_spln_itm_conf_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_lt_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bp_itm_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_set_itm_main_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ctg_config_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_ver_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_coef_config_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alc_expns_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alc_inpt_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cost_itm_out_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_alc_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_attach_info_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_not_fix_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bom_chd_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_proc_upri_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_upri_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_std_sls_upri_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_sls_upri_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_sls_upri_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_set_itm_set_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_jnl_ptn_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_lot_inh_dest_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_spec_cnt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_spec_desc_cnt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_comp_core_cnt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lot_inh_src_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_if_x_cnt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_comp_comp_cnt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_sub_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_unit_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_stop_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stdcost_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_strg_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_lg_grp_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_str_ln_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_alloc_ctl_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_rpl_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_wg_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_dtl_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_oper_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bom_par_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_oper_wk_cost_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_insp_ptn_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_insp_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_insp_spec_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_site_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_mps_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_spln_itm_conf_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_ddlv_lt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bp_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_set_itm_main_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ctg_config_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_coef_config_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_alc_expns_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_alc_inpt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cost_itm_out_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_xpns_purc_alc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_attach_info_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_not_fix_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_alt_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bom_chd_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_prov_upri_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_std_sls_upri_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_sls_upri_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cst_sls_upri_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_set_itm_set_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_jnl_ptn_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lot_inh_dest_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_spec_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_spec_desc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_comp_core_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lot_inh_src_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_if_x_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_comp_comp_flg.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtn(MABCP_ItmCopyReg p){
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tgt(MABCP_ItmCopyReg p){

	}

	/**
	 * [UPD]ステータスの[CopyTgt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CopyTgt(MABCP_ItmCopyReg p){
		p.CopyTgt_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0310.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_itm_sub_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0320.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_itm_unit_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0330.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_itm_stop_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0360.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_stdcost_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0860.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_itm_strg_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0150.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_itm_lg_grp_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0360.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_itm_str_ln_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0370.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_alloc_ctl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0780.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_stk_rpl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0800.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_itm_wg_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0340.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_itm_dtl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0010.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_itm_oper_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0090.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_bom_par_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0030_par.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_oper_wk_cost_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0110.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_itm_insp_ptn_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0170.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_itm_insp_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0190.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_insp_spec_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0180.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_itm_site_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0350.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_mps_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0850.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_spln_itm_conf_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0830.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_purc_ddlv_lt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0530.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_bp_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0640.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_set_itm_main_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP1060_main.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_ctg_config_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP2080.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_itm_ver_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0770.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_coef_config_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABGP0250.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_alc_inpt_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABGP0310.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_cost_itm_out_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABGP0610.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_xpns_purc_alc_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABGP0630.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_lot_inh_dest_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0210_dest.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_itm_spec_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.CopyTgt_open_MABSP0280.putMode(p, UPD, MCMode.INVISIBLE);
		p.CopyTgt_itm_spec_desc_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.CopyTgt_open_MABSP0310.putMode(p, UPD, MCMode.INVISIBLE);
		p.CopyTgt_itm_comp_core_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.CopyTgt_open_MABSP0290_core.putMode(p, UPD, MCMode.INVISIBLE);
		p.CopyTgt_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_attach_info_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0840.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_itm_not_fix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0320.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_sundry_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0880.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_alt_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0080.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_bom_chd_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0030.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_proc_upri_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0140.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_prov_upri_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0130.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_purc_upri_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0120.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_std_sls_upri_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0250.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_itm_sls_upri_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0240.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_cst_sls_upri_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0220.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_set_itm_set_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP1060_set.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_alc_expns_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABGP0300.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_jnl_ptn_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP1090.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_lot_inh_src_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0210_src.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_if_x_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP1520.putMode(p, UPD, MCMode.ENABLE);
		p.CopyTgt_itm_comp_comp_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.CopyTgt_open_MABSP0290_comp.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[NoCopyTgt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_NoCopyTgt(MABCP_ItmCopyReg p){

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABCP_ItmCopyReg p){
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_ex_on_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_ex_past_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABCP_ItmCopyReg p){

	}

	/**
	 * [REF_UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__UPD_ScreenOpe(MABCP_ItmCopyReg p){

	}

	/**
	 * [REF_UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__UPD_Top(MABCP_ItmCopyReg p){

	}

	/**
	 * [REF_UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__UPD_Fold(MABCP_ItmCopyReg p){

	}

	/**
	 * [REF_UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__UPD_Tab1(MABCP_ItmCopyReg p){

	}

	/**
	 * [REF_UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__UPD_Tab2(MABCP_ItmCopyReg p){

	}

	/**
	 * [REF_UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__UPD_Cnd(MABCP_ItmCopyReg p){
		p.Cnd_ope_Group.putMode(p, REF_UPD, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(REF_UPD, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_chng_no.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_release_flg_off.putMode(p, REF_UPD, MCMode.REQUIRED);
		p.Cnd_release_flg_on.putMode(p, REF_UPD, MCMode.REQUIRED);
		p.Cnd_memo1_c.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_memo2_c.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_memo3_c.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF_UPD, MCMode.REQUIRED);
		p.Cnd_on_del_flg.putMode(p, REF_UPD, MCMode.REQUIRED);
		p.Cnd_ref_itm_p_PPanel.putStatus(REF_UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_itm_grp_cd1.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, REF_UPD, MCMode.ENABLE);

	}

	/**
	 * [REF_UPD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF__UPD_Cnd2(MABCP_ItmCopyReg p){

	}

	/**
	 * [REF_UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__UPD_Ctrl(MABCP_ItmCopyReg p){

	}

	/**
	 * [REF_UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__UPD_Dtl(MABCP_ItmCopyReg p){
		p.columnDtl_check.putMode(p, REF_UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.Dtl_src_itm_p_PPanel.putStatus(REF_UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_base_itm_nm.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_itm_cd.putMode(p, REF_UPD, MCMode.REQUIRED);
		p.columnDtl_dest_itm_sub1.putMode(p, REF_UPD, MCMode.ENABLE);
		p.columnDtl_dest_itm_sub2.putMode(p, REF_UPD, MCMode.ENABLE);
		p.columnDtl_dest_itm_sub3.putMode(p, REF_UPD, MCMode.ENABLE);
		p.columnDtl_dest_itm_nm.putMode(p, REF_UPD, MCMode.REQUIRED);
		p.columnDtl_chng_no.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, REF_UPD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, REF_UPD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, REF_UPD, MCMode.ENABLE);
		p.columnDtl_itm_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_sub_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_unit_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_stop_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_stdcost_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_strg_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_lg_grp_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_str_ln_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_alloc_ctl_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_stk_rpl_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_wg_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_dtl_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_oper_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_bom_par_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_oper_wk_cost_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_insp_ptn_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_insp_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_insp_spec_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_site_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_mps_itm_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_spln_itm_conf_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_lt_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_bp_itm_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_set_itm_main_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_ctg_config_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_ver_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_coef_config_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_alc_expns_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_alc_inpt_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_cost_itm_out_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_alc_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_attach_info_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_not_fix_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_bom_chd_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_proc_upri_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_upri_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_std_sls_upri_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_sls_upri_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_sls_upri_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_set_itm_set_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_jnl_ptn_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_lot_inh_dest_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_spec_cnt.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_spec_desc_cnt.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_comp_core_cnt.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_lot_inh_src_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_if_x_cnt.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_comp_comp_cnt.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_sub_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_unit_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_stop_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_stdcost_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_strg_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_lg_grp_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_str_ln_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_alloc_ctl_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_stk_rpl_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_wg_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_dtl_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_oper_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_bom_par_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_oper_wk_cost_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_insp_ptn_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_insp_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_insp_spec_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_site_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_mps_itm_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_spln_itm_conf_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_ddlv_lt_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_bp_itm_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_set_itm_main_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_ctg_config_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_ver_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_coef_config_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_alc_expns_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_alc_inpt_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_cost_itm_out_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_xpns_purc_alc_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_attach_info_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_not_fix_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_alt_itm_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_bom_chd_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_prov_upri_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_std_sls_upri_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_sls_upri_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_cst_sls_upri_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_set_itm_set_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_jnl_ptn_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_lot_inh_dest_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_spec_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_spec_desc_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_comp_core_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_lot_inh_src_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_if_x_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_comp_comp_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [REF_UPD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__UPD_DtlBtn(MABCP_ItmCopyReg p){
		p.DtlBtn_select_all.putMode(p, REF_UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, REF_UPD, MCMode.ENABLE);

	}

	/**
	 * [REF_UPD]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitREF__UPD_Tgt(MABCP_ItmCopyReg p){

	}

	/**
	 * [REF_UPD]ステータスの[CopyTgt]ブロックのモードの設定
	 */
	protected static void statusInitREF__UPD_CopyTgt(MABCP_ItmCopyReg p){
		p.CopyTgt_itm_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0310.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_itm_sub_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0320.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_itm_unit_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0330.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_itm_stop_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0360.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_stdcost_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0860.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_itm_strg_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0150.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_itm_lg_grp_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0360.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_itm_str_ln_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0370.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_alloc_ctl_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0780.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_stk_rpl_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0800.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_itm_wg_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0340.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_itm_dtl_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0010.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_itm_oper_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0090.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_bom_par_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0030_par.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_oper_wk_cost_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0110.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_itm_insp_ptn_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0170.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_itm_insp_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0190.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_insp_spec_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0180.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_itm_site_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0350.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_mps_itm_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0850.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_spln_itm_conf_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0830.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_purc_ddlv_lt_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0530.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_bp_itm_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0640.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_set_itm_main_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP1060_main.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_ctg_config_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP2080.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_itm_ver_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0770.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_coef_config_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABGP0250.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_alc_inpt_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABGP0310.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_cost_itm_out_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABGP0610.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_xpns_purc_alc_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABGP0630.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_lot_inh_dest_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0210_dest.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_itm_spec_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.CopyTgt_open_MABSP0280.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.CopyTgt_itm_spec_desc_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.CopyTgt_open_MABSP0310.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.CopyTgt_itm_comp_core_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.CopyTgt_open_MABSP0290_core.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.CopyTgt_select_all.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_deselect_all.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_attach_info_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0840.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_itm_not_fix_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0320.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_sundry_itm_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0880.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_alt_itm_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0080.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_bom_chd_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0030.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_proc_upri_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0140.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_prov_upri_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0130.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_purc_upri_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0120.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_std_sls_upri_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0250.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_itm_sls_upri_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0240.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_cst_sls_upri_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0220.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_set_itm_set_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP1060_set.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_alc_expns_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABGP0300.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_jnl_ptn_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP1090.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_lot_inh_src_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0210_src.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_if_x_flg.putMode(p, REF_UPD, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP1520.putMode(p, REF_UPD, MCMode.ENABLE);
		p.CopyTgt_itm_comp_comp_flg.putMode(p, REF_UPD, MCMode.INVISIBLE);
		p.CopyTgt_open_MABSP0290_comp.putMode(p, REF_UPD, MCMode.INVISIBLE);

	}

	/**
	 * [REF_UPD]ステータスの[NoCopyTgt]ブロックのモードの設定
	 */
	protected static void statusInitREF__UPD_NoCopyTgt(MABCP_ItmCopyReg p){

	}

	/**
	 * [REF_UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__UPD_Btn(MABCP_ItmCopyReg p){
		p.Btn_upd.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Btn_ex_on_del_flg.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Btn_ex_past_end_dt.putMode(p, REF_UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, REF_UPD, MCMode.DISABLE);

	}

	/**
	 * [REF_UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__UPD_EastBtn(MABCP_ItmCopyReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_ItmCopyReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABCP_ItmCopyReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABCP_ItmCopyReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MABCP_ItmCopyReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MABCP_ItmCopyReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_ItmCopyReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_chng_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_release_flg_off.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_release_flg_on.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_memo1_c.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2_c.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3_c.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_ref_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
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
	protected static void statusInitDEL_Cnd2(MABCP_ItmCopyReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABCP_ItmCopyReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_ItmCopyReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_src_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_base_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_itm_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dest_itm_sub1.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dest_itm_sub2.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dest_itm_sub3.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dest_itm_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_chng_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_memo2.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_memo3.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_sub_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_unit_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_stop_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stdcost_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_strg_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_lg_grp_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_str_ln_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alloc_ctl_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_rpl_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_wg_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_dtl_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_oper_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bom_par_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_wk_cost_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_insp_ptn_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_insp_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_insp_spec_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_site_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mps_itm_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_spln_itm_conf_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_lt_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_itm_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_set_itm_main_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ctg_config_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_ver_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_coef_config_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_expns_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_inpt_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cost_itm_out_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_alc_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_attach_info_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_not_fix_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bom_chd_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_proc_upri_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prov_upri_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_std_sls_upri_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_sls_upri_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_sls_upri_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_set_itm_set_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_jnl_ptn_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lot_inh_dest_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_spec_cnt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_spec_desc_cnt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_comp_core_cnt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lot_inh_src_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_if_x_cnt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_comp_comp_cnt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_sub_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_unit_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_stop_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_stdcost_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_strg_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_lg_grp_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_str_ln_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_alloc_ctl_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_stk_rpl_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_wg_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_dtl_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_oper_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bom_par_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_oper_wk_cost_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_insp_ptn_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_insp_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_insp_spec_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_site_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_mps_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_spln_itm_conf_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_ddlv_lt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bp_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_set_itm_main_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ctg_config_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_coef_config_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_alc_expns_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_alc_inpt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cost_itm_out_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_xpns_purc_alc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_attach_info_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_not_fix_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_alt_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bom_chd_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_prov_upri_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_std_sls_upri_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_sls_upri_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cst_sls_upri_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_set_itm_set_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_jnl_ptn_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lot_inh_dest_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_spec_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_spec_desc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_comp_core_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lot_inh_src_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_if_x_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_comp_comp_flg.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtn(MABCP_ItmCopyReg p){
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tgt(MABCP_ItmCopyReg p){

	}

	/**
	 * [DEL]ステータスの[CopyTgt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_CopyTgt(MABCP_ItmCopyReg p){
		p.CopyTgt_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0310.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_itm_sub_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0320.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_itm_unit_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0330.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_itm_stop_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0360.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_stdcost_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0860.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_itm_strg_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0150.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_itm_lg_grp_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0360.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_itm_str_ln_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0370.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_alloc_ctl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0780.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_stk_rpl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0800.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_itm_wg_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0340.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_itm_dtl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0010.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_itm_oper_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0090.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_bom_par_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0030_par.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_oper_wk_cost_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0110.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_itm_insp_ptn_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0170.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_itm_insp_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0190.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_insp_spec_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0180.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_itm_site_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0350.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_mps_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0850.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_spln_itm_conf_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0830.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_purc_ddlv_lt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0530.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_bp_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0640.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_set_itm_main_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP1060_main.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_ctg_config_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP2080.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_itm_ver_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0770.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_coef_config_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABGP0250.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_alc_inpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABGP0310.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_cost_itm_out_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABGP0610.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_xpns_purc_alc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABGP0630.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_lot_inh_dest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0210_dest.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_itm_spec_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.CopyTgt_open_MABSP0280.putMode(p, DEL, MCMode.INVISIBLE);
		p.CopyTgt_itm_spec_desc_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.CopyTgt_open_MABSP0310.putMode(p, DEL, MCMode.INVISIBLE);
		p.CopyTgt_itm_comp_core_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.CopyTgt_open_MABSP0290_core.putMode(p, DEL, MCMode.INVISIBLE);
		p.CopyTgt_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.CopyTgt_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.CopyTgt_attach_info_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0840.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_itm_not_fix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0320.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_sundry_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0880.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_alt_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0080.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_bom_chd_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0030.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_proc_upri_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0140.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_prov_upri_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0130.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_purc_upri_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0120.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_std_sls_upri_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0250.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_itm_sls_upri_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0240.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_cst_sls_upri_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0220.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_set_itm_set_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP1060_set.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_alc_expns_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABGP0300.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_jnl_ptn_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP1090.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_lot_inh_src_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0210_src.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_if_x_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP1520.putMode(p, DEL, MCMode.ENABLE);
		p.CopyTgt_itm_comp_comp_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.CopyTgt_open_MABSP0290_comp.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[NoCopyTgt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_NoCopyTgt(MABCP_ItmCopyReg p){

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABCP_ItmCopyReg p){
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ex_on_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Btn_ex_past_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABCP_ItmCopyReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_ItmCopyReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_ItmCopyReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_ItmCopyReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MABCP_ItmCopyReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MABCP_ItmCopyReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_ItmCopyReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_chng_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_release_flg_off.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_release_flg_on.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_memo1_c.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2_c.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3_c.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ref_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
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
	protected static void statusInitREF_Cnd2(MABCP_ItmCopyReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_ItmCopyReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_ItmCopyReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_src_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_base_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_itm_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dest_itm_sub1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dest_itm_sub2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dest_itm_sub3.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dest_itm_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_chng_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_memo2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_memo3.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_sub_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_unit_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_stop_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stdcost_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_strg_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_lg_grp_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_str_ln_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alloc_ctl_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_rpl_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_wg_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_dtl_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_oper_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bom_par_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_wk_cost_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_insp_ptn_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_insp_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_insp_spec_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_site_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mps_itm_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_spln_itm_conf_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_ddlv_lt_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_itm_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_set_itm_main_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ctg_config_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_ver_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_coef_config_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_expns_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_inpt_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cost_itm_out_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_xpns_purc_alc_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_attach_info_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_not_fix_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sundry_itm_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bom_chd_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_proc_upri_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_upri_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_upri_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_std_sls_upri_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_sls_upri_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_sls_upri_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_set_itm_set_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_jnl_ptn_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_inh_dest_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_spec_cnt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_spec_desc_cnt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_comp_core_cnt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lot_inh_src_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_if_x_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_comp_comp_cnt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_sub_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_unit_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_stop_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stdcost_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_strg_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_lg_grp_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_str_ln_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_alloc_ctl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_stk_rpl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_wg_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_dtl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_oper_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bom_par_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_oper_wk_cost_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_insp_ptn_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_insp_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_insp_spec_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_site_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_mps_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_spln_itm_conf_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_ddlv_lt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bp_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_set_itm_main_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ctg_config_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_coef_config_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_alc_expns_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_alc_inpt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cost_itm_out_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_xpns_purc_alc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_attach_info_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_not_fix_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_alt_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bom_chd_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_prov_upri_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_purc_upri_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_std_sls_upri_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_sls_upri_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cst_sls_upri_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_set_itm_set_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_jnl_ptn_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lot_inh_dest_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_spec_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_spec_desc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_comp_core_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lot_inh_src_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_if_x_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_comp_comp_flg.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtn(MABCP_ItmCopyReg p){
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Tgt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tgt(MABCP_ItmCopyReg p){

	}

	/**
	 * [REF]ステータスの[CopyTgt]ブロックのモードの設定
	 */
	protected static void statusInitREF_CopyTgt(MABCP_ItmCopyReg p){
		p.CopyTgt_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0310.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_itm_sub_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0320.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_itm_unit_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0330.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_itm_stop_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0360.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_stdcost_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0860.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_itm_strg_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0150.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_itm_lg_grp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0360.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_itm_str_ln_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0370.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_alloc_ctl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0780.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_stk_rpl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0800.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_itm_wg_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0340.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_itm_dtl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0010.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_itm_oper_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0090.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_bom_par_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0030_par.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_oper_wk_cost_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0110.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_itm_insp_ptn_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0170.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_itm_insp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0190.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_insp_spec_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0180.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_itm_site_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0350.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_mps_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0850.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_spln_itm_conf_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0830.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_purc_ddlv_lt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0530.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_bp_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0640.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_set_itm_main_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP1060_main.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_ctg_config_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP2080.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_itm_ver_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0770.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_coef_config_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABGP0250.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_alc_inpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABGP0310.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_cost_itm_out_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABGP0610.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_xpns_purc_alc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABGP0630.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_lot_inh_dest_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0210_dest.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_itm_spec_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.CopyTgt_open_MABSP0280.putMode(p, REF, MCMode.INVISIBLE);
		p.CopyTgt_itm_spec_desc_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.CopyTgt_open_MABSP0310.putMode(p, REF, MCMode.INVISIBLE);
		p.CopyTgt_itm_comp_core_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.CopyTgt_open_MABSP0290_core.putMode(p, REF, MCMode.INVISIBLE);
		p.CopyTgt_select_all.putMode(p, REF, MCMode.DISABLE);
		p.CopyTgt_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.CopyTgt_attach_info_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0840.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_itm_not_fix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0320.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_sundry_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP0880.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_alt_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0080.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_bom_chd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0030.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_proc_upri_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0140.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_prov_upri_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0130.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_purc_upri_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0120.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_std_sls_upri_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0250.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_itm_sls_upri_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0240.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_cst_sls_upri_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0220.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_set_itm_set_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP1060_set.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_alc_expns_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABGP0300.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_jnl_ptn_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP1090.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_lot_inh_src_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABSP0210_src.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_if_x_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.CopyTgt_open_MABCP1520.putMode(p, REF, MCMode.ENABLE);
		p.CopyTgt_itm_comp_comp_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.CopyTgt_open_MABSP0290_comp.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[NoCopyTgt]ブロックのモードの設定
	 */
	protected static void statusInitREF_NoCopyTgt(MABCP_ItmCopyReg p){

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABCP_ItmCopyReg p){
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_ex_on_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_ex_past_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABCP_ItmCopyReg p){

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
		MABCP_ItmCopyReg_MC.setTableConfigDtl((MABCP_ItmCopyReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_ItmCopyReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP0870.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.DtlTable.addTable(p.Dtl_src_itm_p_PPanel.ItmTable);
		p.columnDtl_base_itm_nm.setMeta(mcframe.clientMABC.MABCP0870.DtlR.base_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_itm_nm);
		p.columnDtl_itm_typ.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ);
		p.columnDtl_itm_typ_nm.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_nm);
		p.columnDtl_itm_typ_d_cd.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_typ_d_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_cd);
		p.columnDtl_itm_typ_d_nm.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_nm);
		p.columnDtl_dest_itm_cd.setMeta(mcframe.clientMABC.MABCP0870.DtlR.dest_itm_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_itm_cd);
		p.columnDtl_dest_itm_sub1.setMeta(mcframe.clientMABC.MABCP0870.DtlR.dest_itm_sub1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_itm_sub1);
		p.columnDtl_dest_itm_sub2.setMeta(mcframe.clientMABC.MABCP0870.DtlR.dest_itm_sub2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_itm_sub2);
		p.columnDtl_dest_itm_sub3.setMeta(mcframe.clientMABC.MABCP0870.DtlR.dest_itm_sub3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_itm_sub3);
		p.columnDtl_dest_itm_nm.setMeta(mcframe.clientMABC.MABCP0870.DtlR.dest_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_itm_nm);
		p.columnDtl_chng_no.setMeta(mcframe.clientMABC.MABCP0870.DtlR.chng_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chng_no);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP0870.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP0870.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP0870.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_itm_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_cnt);
		p.columnDtl_itm_sub_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_sub_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_sub_cnt);
		p.columnDtl_itm_unit_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_unit_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_unit_cnt);
		p.columnDtl_itm_stop_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_stop_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_stop_cnt);
		p.columnDtl_stdcost_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.stdcost_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stdcost_cnt);
		p.columnDtl_itm_strg_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_strg_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_strg_cnt);
		p.columnDtl_itm_lg_grp_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_lg_grp_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_lg_grp_cnt);
		p.columnDtl_itm_str_ln_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_str_ln_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_str_ln_cnt);
		p.columnDtl_alloc_ctl_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.alloc_ctl_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alloc_ctl_cnt);
		p.columnDtl_stk_rpl_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.stk_rpl_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_rpl_cnt);
		p.columnDtl_itm_wg_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_wg_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_wg_cnt);
		p.columnDtl_itm_dtl_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_dtl_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_dtl_cnt);
		p.columnDtl_itm_oper_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_oper_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_oper_cnt);
		p.columnDtl_bom_par_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.bom_par_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bom_par_cnt);
		p.columnDtl_oper_wk_cost_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.oper_wk_cost_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_wk_cost_cnt);
		p.columnDtl_itm_insp_ptn_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_insp_ptn_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_insp_ptn_cnt);
		p.columnDtl_itm_insp_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_insp_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_insp_cnt);
		p.columnDtl_insp_spec_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.insp_spec_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_insp_spec_cnt);
		p.columnDtl_itm_site_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_site_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_site_cnt);
		p.columnDtl_mps_itm_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.mps_itm_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mps_itm_cnt);
		p.columnDtl_spln_itm_conf_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.spln_itm_conf_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_spln_itm_conf_cnt);
		p.columnDtl_purc_ddlv_lt_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.purc_ddlv_lt_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_ddlv_lt_cnt);
		p.columnDtl_bp_itm_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.bp_itm_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_itm_cnt);
		p.columnDtl_set_itm_main_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.set_itm_main_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_set_itm_main_cnt);
		p.columnDtl_ctg_config_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.ctg_config_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ctg_config_cnt);
		p.columnDtl_itm_ver_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_ver_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_ver_cnt);
		p.columnDtl_coef_config_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.coef_config_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_coef_config_cnt);
		p.columnDtl_alc_expns_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.alc_expns_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_expns_cnt);
		p.columnDtl_alc_inpt_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.alc_inpt_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_inpt_cnt);
		p.columnDtl_cost_itm_out_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.cost_itm_out_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cost_itm_out_cnt);
		p.columnDtl_xpns_purc_alc_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.xpns_purc_alc_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xpns_purc_alc_cnt);
		p.columnDtl_attach_info_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.attach_info_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_cnt);
		p.columnDtl_itm_not_fix_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_not_fix_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_not_fix_cnt);
		p.columnDtl_sundry_itm_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.sundry_itm_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sundry_itm_cnt);
		p.columnDtl_alt_itm_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.alt_itm_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_itm_cnt);
		p.columnDtl_bom_chd_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.bom_chd_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bom_chd_cnt);
		p.columnDtl_proc_upri_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.proc_upri_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_proc_upri_cnt);
		p.columnDtl_prov_upri_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.prov_upri_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_upri_cnt);
		p.columnDtl_purc_upri_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.purc_upri_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_upri_cnt);
		p.columnDtl_std_sls_upri_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.std_sls_upri_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_sls_upri_cnt);
		p.columnDtl_itm_sls_upri_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_sls_upri_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_sls_upri_cnt);
		p.columnDtl_cst_sls_upri_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.cst_sls_upri_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_sls_upri_cnt);
		p.columnDtl_set_itm_set_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.set_itm_set_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_set_itm_set_cnt);
		p.columnDtl_jnl_ptn_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.jnl_ptn_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_jnl_ptn_cnt);
		p.columnDtl_lot_inh_dest_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.lot_inh_dest_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_inh_dest_cnt);
		p.columnDtl_itm_spec_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_spec_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_spec_cnt);
		p.columnDtl_itm_spec_desc_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_spec_desc_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_spec_desc_cnt);
		p.columnDtl_itm_comp_core_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_comp_core_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_comp_core_cnt);
		p.columnDtl_lot_inh_src_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.lot_inh_src_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_inh_src_cnt);
		p.columnDtl_if_x_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.if_x_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_if_x_cnt);
		p.columnDtl_itm_comp_comp_cnt.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_comp_comp_cnt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_comp_comp_cnt);
		p.columnDtl_itm_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_flg);
		p.columnDtl_itm_sub_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_sub_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_sub_flg);
		p.columnDtl_itm_unit_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_unit_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_unit_flg);
		p.columnDtl_itm_stop_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_stop_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_stop_flg);
		p.columnDtl_stdcost_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.stdcost_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stdcost_flg);
		p.columnDtl_itm_strg_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_strg_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_strg_flg);
		p.columnDtl_itm_lg_grp_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_lg_grp_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_lg_grp_flg);
		p.columnDtl_itm_str_ln_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_str_ln_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_str_ln_flg);
		p.columnDtl_alloc_ctl_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.alloc_ctl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alloc_ctl_flg);
		p.columnDtl_stk_rpl_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.stk_rpl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_rpl_flg);
		p.columnDtl_itm_wg_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_wg_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_wg_flg);
		p.columnDtl_itm_dtl_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_dtl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_dtl_flg);
		p.columnDtl_itm_oper_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_oper_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_oper_flg);
		p.columnDtl_bom_par_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.bom_par_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bom_par_flg);
		p.columnDtl_oper_wk_cost_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.oper_wk_cost_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_wk_cost_flg);
		p.columnDtl_itm_insp_ptn_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_insp_ptn_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_insp_ptn_flg);
		p.columnDtl_itm_insp_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_insp_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_insp_flg);
		p.columnDtl_insp_spec_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.insp_spec_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_insp_spec_flg);
		p.columnDtl_itm_site_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_site_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_site_flg);
		p.columnDtl_mps_itm_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.mps_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mps_itm_flg);
		p.columnDtl_spln_itm_conf_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.spln_itm_conf_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_spln_itm_conf_flg);
		p.columnDtl_purc_ddlv_lt_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.purc_ddlv_lt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_ddlv_lt_flg);
		p.columnDtl_bp_itm_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.bp_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_itm_flg);
		p.columnDtl_set_itm_main_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.set_itm_main_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_set_itm_main_flg);
		p.columnDtl_ctg_config_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.ctg_config_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ctg_config_flg);
		p.columnDtl_itm_ver_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_ver_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_ver_flg);
		p.columnDtl_coef_config_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.coef_config_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_coef_config_flg);
		p.columnDtl_alc_expns_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.alc_expns_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_expns_flg);
		p.columnDtl_alc_inpt_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.alc_inpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_inpt_flg);
		p.columnDtl_cost_itm_out_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.cost_itm_out_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cost_itm_out_flg);
		p.columnDtl_xpns_purc_alc_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.xpns_purc_alc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xpns_purc_alc_flg);
		p.columnDtl_attach_info_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.attach_info_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_attach_info_flg);
		p.columnDtl_itm_not_fix_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_not_fix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_not_fix_flg);
		p.columnDtl_sundry_itm_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.sundry_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sundry_itm_flg);
		p.columnDtl_alt_itm_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.alt_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_itm_flg);
		p.columnDtl_bom_chd_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.bom_chd_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bom_chd_flg);
		p.columnDtl_proc_upri_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.proc_upri_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_proc_upri_flg);
		p.columnDtl_prov_upri_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.prov_upri_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_upri_flg);
		p.columnDtl_purc_upri_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.purc_upri_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_upri_flg);
		p.columnDtl_std_sls_upri_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.std_sls_upri_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_sls_upri_flg);
		p.columnDtl_itm_sls_upri_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_sls_upri_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_sls_upri_flg);
		p.columnDtl_cst_sls_upri_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.cst_sls_upri_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_sls_upri_flg);
		p.columnDtl_set_itm_set_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.set_itm_set_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_set_itm_set_flg);
		p.columnDtl_jnl_ptn_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.jnl_ptn_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_jnl_ptn_flg);
		p.columnDtl_lot_inh_dest_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.lot_inh_dest_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_inh_dest_flg);
		p.columnDtl_itm_spec_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_spec_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_spec_flg);
		p.columnDtl_itm_spec_desc_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_spec_desc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_spec_desc_flg);
		p.columnDtl_itm_comp_core_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_comp_core_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_comp_core_flg);
		p.columnDtl_lot_inh_src_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.lot_inh_src_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_inh_src_flg);
		p.columnDtl_if_x_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.if_x_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_if_x_flg);
		p.columnDtl_itm_comp_comp_flg.setMeta(mcframe.clientMABC.MABCP0870.DtlR.itm_comp_comp_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_comp_comp_flg);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
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
		columnDtl_itm_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_typ.getListConfig().setPutter(getDtl_itm_typ_ListPutter());
		columnDtl_itm_typ_d_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_typ_d_cd.getListConfig().setPutter(getDtl_itm_typ_d_cd_ListPutter());
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
	 * この画面を[REF_UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_UPDStatus() {
		status = REF_UPD;
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
		else if (REF_UPD.equals(status)) {
			setREF_UPDStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * この画面のステータスを返します。
	 *
	 * @return ステータス
	 */
	public String getStatus() {
		return status;
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
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
		if(combo == columnDtl_itm_typ) return getDtl_itm_typ(row, info);
		if(combo == columnDtl_itm_typ_d_cd) return getDtl_itm_typ_d_cd(row, info);
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
		else if (ap == CopyTgt_open_MABCP0320) doCopyTgt_open_MABCP0320(info);
		else if (ap == CopyTgt_open_MABCP0330) doCopyTgt_open_MABCP0330(info);
		else if (ap == CopyTgt_open_MABCP0360) doCopyTgt_open_MABCP0360(info);
		else if (ap == CopyTgt_open_MABCP0860) doCopyTgt_open_MABCP0860(info);
		else if (ap == CopyTgt_open_MABSP0150) doCopyTgt_open_MABSP0150(info);
		else if (ap == CopyTgt_open_MABSP0360) doCopyTgt_open_MABSP0360(info);
		else if (ap == CopyTgt_open_MABSP0370) doCopyTgt_open_MABSP0370(info);
		else if (ap == CopyTgt_open_MABSP0780) doCopyTgt_open_MABSP0780(info);
		else if (ap == CopyTgt_open_MABSP0800) doCopyTgt_open_MABSP0800(info);
		else if (ap == CopyTgt_open_MABSP0340) doCopyTgt_open_MABSP0340(info);
		else if (ap == CopyTgt_open_MABSP0010) doCopyTgt_open_MABSP0010(info);
		else if (ap == CopyTgt_open_MABSP0090) doCopyTgt_open_MABSP0090(info);
		else if (ap == CopyTgt_open_MABSP0030_par) doCopyTgt_open_MABSP0030_par(info);
		else if (ap == CopyTgt_open_MABSP0110) doCopyTgt_open_MABSP0110(info);
		else if (ap == CopyTgt_open_MABSP0170) doCopyTgt_open_MABSP0170(info);
		else if (ap == CopyTgt_open_MABSP0190) doCopyTgt_open_MABSP0190(info);
		else if (ap == CopyTgt_open_MABSP0180) doCopyTgt_open_MABSP0180(info);
		else if (ap == CopyTgt_open_MABSP0350) doCopyTgt_open_MABSP0350(info);
		else if (ap == CopyTgt_open_MABSP0850) doCopyTgt_open_MABSP0850(info);
		else if (ap == CopyTgt_open_MABSP0830) doCopyTgt_open_MABSP0830(info);
		else if (ap == CopyTgt_open_MABSP0530) doCopyTgt_open_MABSP0530(info);
		else if (ap == CopyTgt_open_MABSP0640) doCopyTgt_open_MABSP0640(info);
		else if (ap == CopyTgt_open_MABSP1060_main) doCopyTgt_open_MABSP1060_main(info);
		else if (ap == CopyTgt_open_MABCP2080) doCopyTgt_open_MABCP2080(info);
		else if (ap == CopyTgt_open_MABSP0770) doCopyTgt_open_MABSP0770(info);
		else if (ap == CopyTgt_open_MABGP0250) doCopyTgt_open_MABGP0250(info);
		else if (ap == CopyTgt_open_MABGP0310) doCopyTgt_open_MABGP0310(info);
		else if (ap == CopyTgt_open_MABGP0610) doCopyTgt_open_MABGP0610(info);
		else if (ap == CopyTgt_open_MABGP0630) doCopyTgt_open_MABGP0630(info);
		else if (ap == CopyTgt_open_MABSP0210_dest) doCopyTgt_open_MABSP0210_dest(info);
		else if (ap == CopyTgt_open_MABSP0280) doCopyTgt_open_MABSP0280(info);
		else if (ap == CopyTgt_open_MABSP0310) doCopyTgt_open_MABSP0310(info);
		else if (ap == CopyTgt_open_MABSP0290_core) doCopyTgt_open_MABSP0290_core(info);
		else if (ap == CopyTgt_select_all) doCopyTgt_select_all(info);
		else if (ap == CopyTgt_deselect_all) doCopyTgt_deselect_all(info);
		else if (ap == CopyTgt_open_MABCP0840) doCopyTgt_open_MABCP0840(info);
		else if (ap == CopyTgt_open_MABSP0320) doCopyTgt_open_MABSP0320(info);
		else if (ap == CopyTgt_open_MABCP0880) doCopyTgt_open_MABCP0880(info);
		else if (ap == CopyTgt_open_MABSP0080) doCopyTgt_open_MABSP0080(info);
		else if (ap == CopyTgt_open_MABSP0030) doCopyTgt_open_MABSP0030(info);
		else if (ap == CopyTgt_open_MABSP0140) doCopyTgt_open_MABSP0140(info);
		else if (ap == CopyTgt_open_MABSP0130) doCopyTgt_open_MABSP0130(info);
		else if (ap == CopyTgt_open_MABSP0120) doCopyTgt_open_MABSP0120(info);
		else if (ap == CopyTgt_open_MABSP0250) doCopyTgt_open_MABSP0250(info);
		else if (ap == CopyTgt_open_MABSP0240) doCopyTgt_open_MABSP0240(info);
		else if (ap == CopyTgt_open_MABSP0220) doCopyTgt_open_MABSP0220(info);
		else if (ap == CopyTgt_open_MABSP1060_set) doCopyTgt_open_MABSP1060_set(info);
		else if (ap == CopyTgt_open_MABGP0300) doCopyTgt_open_MABGP0300(info);
		else if (ap == CopyTgt_open_MABCP1090) doCopyTgt_open_MABCP1090(info);
		else if (ap == CopyTgt_open_MABSP0210_src) doCopyTgt_open_MABSP0210_src(info);
		else if (ap == CopyTgt_open_MABCP1520) doCopyTgt_open_MABCP1520(info);
		else if (ap == CopyTgt_open_MABSP0290_comp) doCopyTgt_open_MABSP0290_comp(info);
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
	 * [CopyTgt]パネルの[open_MABCP0320]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABCP0320(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABCP0330]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABCP0330(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABCP0360]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABCP0360(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABCP0860]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABCP0860(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0150]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0150(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0360]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0360(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0370]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0370(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0780]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0780(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0800]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0800(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0340]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0340(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0010]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0010(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0090]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0090(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0030_par]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0030_par(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0110]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0110(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0170]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0170(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0190]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0190(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0180]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0180(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0350]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0350(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0850]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0850(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0830]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0830(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0530]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0530(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0640]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0640(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP1060_main]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP1060_main(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABCP2080]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABCP2080(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0770]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0770(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABGP0250]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABGP0250(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABGP0310]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABGP0310(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABGP0610]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABGP0610(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABGP0630]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABGP0630(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0210_dest]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0210_dest(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0280]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0280(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0310]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0310(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0290_core]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0290_core(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_select_all(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_deselect_all(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABCP0840]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABCP0840(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0320]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0320(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABCP0880]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABCP0880(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0080]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0080(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0030]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0030(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0140]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0140(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0130]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0130(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0120]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0120(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0250]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0250(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0240]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0240(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0220]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0220(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP1060_set]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP1060_set(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABGP0300]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABGP0300(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABCP1090]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABCP1090(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0210_src]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0210_src(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABCP1520]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABCP1520(MCEventInfo info);

	/**
	 * [CopyTgt]パネルの[open_MABSP0290_comp]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCopyTgt_open_MABSP0290_comp(MCEventInfo info);

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
		if (vc == TgtTab) return doTgt_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_chng_no) return doCnd_chng_no_VC(info);
		if (vc == Cnd_release_flg_off) return doCnd_release_flg_off_VC(info);
		if (vc == Cnd_release_flg_on) return doCnd_release_flg_on_VC(info);
		if (vc == Cnd_memo1_c) return doCnd_memo1_c_VC(info);
		if (vc == Cnd_memo2_c) return doCnd_memo2_c_VC(info);
		if (vc == Cnd_memo3_c) return doCnd_memo3_c_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
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
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_base_itm_nm) return doDtl_base_itm_nm_VC(info);
		if (vc == columnDtl_itm_typ) return doDtl_itm_typ_VC(info);
		if (vc == columnDtl_itm_typ_nm) return doDtl_itm_typ_nm_VC(info);
		if (vc == columnDtl_itm_typ_d_cd) return doDtl_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_itm_typ_d_nm) return doDtl_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_dest_itm_cd) return doDtl_dest_itm_cd_VC(info);
		if (vc == columnDtl_dest_itm_sub1) return doDtl_dest_itm_sub1_VC(info);
		if (vc == columnDtl_dest_itm_sub2) return doDtl_dest_itm_sub2_VC(info);
		if (vc == columnDtl_dest_itm_sub3) return doDtl_dest_itm_sub3_VC(info);
		if (vc == columnDtl_dest_itm_nm) return doDtl_dest_itm_nm_VC(info);
		if (vc == columnDtl_chng_no) return doDtl_chng_no_VC(info);
		if (vc == columnDtl_memo1) return doDtl_memo1_VC(info);
		if (vc == columnDtl_memo2) return doDtl_memo2_VC(info);
		if (vc == columnDtl_memo3) return doDtl_memo3_VC(info);
		if (vc == columnDtl_itm_cnt) return doDtl_itm_cnt_VC(info);
		if (vc == columnDtl_itm_sub_cnt) return doDtl_itm_sub_cnt_VC(info);
		if (vc == columnDtl_itm_unit_cnt) return doDtl_itm_unit_cnt_VC(info);
		if (vc == columnDtl_itm_stop_cnt) return doDtl_itm_stop_cnt_VC(info);
		if (vc == columnDtl_stdcost_cnt) return doDtl_stdcost_cnt_VC(info);
		if (vc == columnDtl_itm_strg_cnt) return doDtl_itm_strg_cnt_VC(info);
		if (vc == columnDtl_itm_lg_grp_cnt) return doDtl_itm_lg_grp_cnt_VC(info);
		if (vc == columnDtl_itm_str_ln_cnt) return doDtl_itm_str_ln_cnt_VC(info);
		if (vc == columnDtl_alloc_ctl_cnt) return doDtl_alloc_ctl_cnt_VC(info);
		if (vc == columnDtl_stk_rpl_cnt) return doDtl_stk_rpl_cnt_VC(info);
		if (vc == columnDtl_itm_wg_cnt) return doDtl_itm_wg_cnt_VC(info);
		if (vc == columnDtl_itm_dtl_cnt) return doDtl_itm_dtl_cnt_VC(info);
		if (vc == columnDtl_itm_oper_cnt) return doDtl_itm_oper_cnt_VC(info);
		if (vc == columnDtl_bom_par_cnt) return doDtl_bom_par_cnt_VC(info);
		if (vc == columnDtl_oper_wk_cost_cnt) return doDtl_oper_wk_cost_cnt_VC(info);
		if (vc == columnDtl_itm_insp_ptn_cnt) return doDtl_itm_insp_ptn_cnt_VC(info);
		if (vc == columnDtl_itm_insp_cnt) return doDtl_itm_insp_cnt_VC(info);
		if (vc == columnDtl_insp_spec_cnt) return doDtl_insp_spec_cnt_VC(info);
		if (vc == columnDtl_itm_site_cnt) return doDtl_itm_site_cnt_VC(info);
		if (vc == columnDtl_mps_itm_cnt) return doDtl_mps_itm_cnt_VC(info);
		if (vc == columnDtl_spln_itm_conf_cnt) return doDtl_spln_itm_conf_cnt_VC(info);
		if (vc == columnDtl_purc_ddlv_lt_cnt) return doDtl_purc_ddlv_lt_cnt_VC(info);
		if (vc == columnDtl_bp_itm_cnt) return doDtl_bp_itm_cnt_VC(info);
		if (vc == columnDtl_set_itm_main_cnt) return doDtl_set_itm_main_cnt_VC(info);
		if (vc == columnDtl_ctg_config_cnt) return doDtl_ctg_config_cnt_VC(info);
		if (vc == columnDtl_itm_ver_cnt) return doDtl_itm_ver_cnt_VC(info);
		if (vc == columnDtl_coef_config_cnt) return doDtl_coef_config_cnt_VC(info);
		if (vc == columnDtl_alc_expns_cnt) return doDtl_alc_expns_cnt_VC(info);
		if (vc == columnDtl_alc_inpt_cnt) return doDtl_alc_inpt_cnt_VC(info);
		if (vc == columnDtl_cost_itm_out_cnt) return doDtl_cost_itm_out_cnt_VC(info);
		if (vc == columnDtl_xpns_purc_alc_cnt) return doDtl_xpns_purc_alc_cnt_VC(info);
		if (vc == columnDtl_attach_info_cnt) return doDtl_attach_info_cnt_VC(info);
		if (vc == columnDtl_itm_not_fix_cnt) return doDtl_itm_not_fix_cnt_VC(info);
		if (vc == columnDtl_sundry_itm_cnt) return doDtl_sundry_itm_cnt_VC(info);
		if (vc == columnDtl_alt_itm_cnt) return doDtl_alt_itm_cnt_VC(info);
		if (vc == columnDtl_bom_chd_cnt) return doDtl_bom_chd_cnt_VC(info);
		if (vc == columnDtl_proc_upri_cnt) return doDtl_proc_upri_cnt_VC(info);
		if (vc == columnDtl_prov_upri_cnt) return doDtl_prov_upri_cnt_VC(info);
		if (vc == columnDtl_purc_upri_cnt) return doDtl_purc_upri_cnt_VC(info);
		if (vc == columnDtl_std_sls_upri_cnt) return doDtl_std_sls_upri_cnt_VC(info);
		if (vc == columnDtl_itm_sls_upri_cnt) return doDtl_itm_sls_upri_cnt_VC(info);
		if (vc == columnDtl_cst_sls_upri_cnt) return doDtl_cst_sls_upri_cnt_VC(info);
		if (vc == columnDtl_set_itm_set_cnt) return doDtl_set_itm_set_cnt_VC(info);
		if (vc == columnDtl_jnl_ptn_cnt) return doDtl_jnl_ptn_cnt_VC(info);
		if (vc == columnDtl_lot_inh_dest_cnt) return doDtl_lot_inh_dest_cnt_VC(info);
		if (vc == columnDtl_itm_spec_cnt) return doDtl_itm_spec_cnt_VC(info);
		if (vc == columnDtl_itm_spec_desc_cnt) return doDtl_itm_spec_desc_cnt_VC(info);
		if (vc == columnDtl_itm_comp_core_cnt) return doDtl_itm_comp_core_cnt_VC(info);
		if (vc == columnDtl_lot_inh_src_cnt) return doDtl_lot_inh_src_cnt_VC(info);
		if (vc == columnDtl_if_x_cnt) return doDtl_if_x_cnt_VC(info);
		if (vc == columnDtl_itm_comp_comp_cnt) return doDtl_itm_comp_comp_cnt_VC(info);
		if (vc == columnDtl_itm_flg) return doDtl_itm_flg_VC(info);
		if (vc == columnDtl_itm_sub_flg) return doDtl_itm_sub_flg_VC(info);
		if (vc == columnDtl_itm_unit_flg) return doDtl_itm_unit_flg_VC(info);
		if (vc == columnDtl_itm_stop_flg) return doDtl_itm_stop_flg_VC(info);
		if (vc == columnDtl_stdcost_flg) return doDtl_stdcost_flg_VC(info);
		if (vc == columnDtl_itm_strg_flg) return doDtl_itm_strg_flg_VC(info);
		if (vc == columnDtl_itm_lg_grp_flg) return doDtl_itm_lg_grp_flg_VC(info);
		if (vc == columnDtl_itm_str_ln_flg) return doDtl_itm_str_ln_flg_VC(info);
		if (vc == columnDtl_alloc_ctl_flg) return doDtl_alloc_ctl_flg_VC(info);
		if (vc == columnDtl_stk_rpl_flg) return doDtl_stk_rpl_flg_VC(info);
		if (vc == columnDtl_itm_wg_flg) return doDtl_itm_wg_flg_VC(info);
		if (vc == columnDtl_itm_dtl_flg) return doDtl_itm_dtl_flg_VC(info);
		if (vc == columnDtl_itm_oper_flg) return doDtl_itm_oper_flg_VC(info);
		if (vc == columnDtl_bom_par_flg) return doDtl_bom_par_flg_VC(info);
		if (vc == columnDtl_oper_wk_cost_flg) return doDtl_oper_wk_cost_flg_VC(info);
		if (vc == columnDtl_itm_insp_ptn_flg) return doDtl_itm_insp_ptn_flg_VC(info);
		if (vc == columnDtl_itm_insp_flg) return doDtl_itm_insp_flg_VC(info);
		if (vc == columnDtl_insp_spec_flg) return doDtl_insp_spec_flg_VC(info);
		if (vc == columnDtl_itm_site_flg) return doDtl_itm_site_flg_VC(info);
		if (vc == columnDtl_mps_itm_flg) return doDtl_mps_itm_flg_VC(info);
		if (vc == columnDtl_spln_itm_conf_flg) return doDtl_spln_itm_conf_flg_VC(info);
		if (vc == columnDtl_purc_ddlv_lt_flg) return doDtl_purc_ddlv_lt_flg_VC(info);
		if (vc == columnDtl_bp_itm_flg) return doDtl_bp_itm_flg_VC(info);
		if (vc == columnDtl_set_itm_main_flg) return doDtl_set_itm_main_flg_VC(info);
		if (vc == columnDtl_ctg_config_flg) return doDtl_ctg_config_flg_VC(info);
		if (vc == columnDtl_itm_ver_flg) return doDtl_itm_ver_flg_VC(info);
		if (vc == columnDtl_coef_config_flg) return doDtl_coef_config_flg_VC(info);
		if (vc == columnDtl_alc_expns_flg) return doDtl_alc_expns_flg_VC(info);
		if (vc == columnDtl_alc_inpt_flg) return doDtl_alc_inpt_flg_VC(info);
		if (vc == columnDtl_cost_itm_out_flg) return doDtl_cost_itm_out_flg_VC(info);
		if (vc == columnDtl_xpns_purc_alc_flg) return doDtl_xpns_purc_alc_flg_VC(info);
		if (vc == columnDtl_attach_info_flg) return doDtl_attach_info_flg_VC(info);
		if (vc == columnDtl_itm_not_fix_flg) return doDtl_itm_not_fix_flg_VC(info);
		if (vc == columnDtl_sundry_itm_flg) return doDtl_sundry_itm_flg_VC(info);
		if (vc == columnDtl_alt_itm_flg) return doDtl_alt_itm_flg_VC(info);
		if (vc == columnDtl_bom_chd_flg) return doDtl_bom_chd_flg_VC(info);
		if (vc == columnDtl_proc_upri_flg) return doDtl_proc_upri_flg_VC(info);
		if (vc == columnDtl_prov_upri_flg) return doDtl_prov_upri_flg_VC(info);
		if (vc == columnDtl_purc_upri_flg) return doDtl_purc_upri_flg_VC(info);
		if (vc == columnDtl_std_sls_upri_flg) return doDtl_std_sls_upri_flg_VC(info);
		if (vc == columnDtl_itm_sls_upri_flg) return doDtl_itm_sls_upri_flg_VC(info);
		if (vc == columnDtl_cst_sls_upri_flg) return doDtl_cst_sls_upri_flg_VC(info);
		if (vc == columnDtl_set_itm_set_flg) return doDtl_set_itm_set_flg_VC(info);
		if (vc == columnDtl_jnl_ptn_flg) return doDtl_jnl_ptn_flg_VC(info);
		if (vc == columnDtl_lot_inh_dest_flg) return doDtl_lot_inh_dest_flg_VC(info);
		if (vc == columnDtl_itm_spec_flg) return doDtl_itm_spec_flg_VC(info);
		if (vc == columnDtl_itm_spec_desc_flg) return doDtl_itm_spec_desc_flg_VC(info);
		if (vc == columnDtl_itm_comp_core_flg) return doDtl_itm_comp_core_flg_VC(info);
		if (vc == columnDtl_lot_inh_src_flg) return doDtl_lot_inh_src_flg_VC(info);
		if (vc == columnDtl_if_x_flg) return doDtl_if_x_flg_VC(info);
		if (vc == columnDtl_itm_comp_comp_flg) return doDtl_itm_comp_comp_flg_VC(info);
		if (vc == CopyTgt_itm_flg) return doCopyTgt_itm_flg_VC(info);
		if (vc == CopyTgt_itm_sub_flg) return doCopyTgt_itm_sub_flg_VC(info);
		if (vc == CopyTgt_itm_unit_flg) return doCopyTgt_itm_unit_flg_VC(info);
		if (vc == CopyTgt_itm_stop_flg) return doCopyTgt_itm_stop_flg_VC(info);
		if (vc == CopyTgt_stdcost_flg) return doCopyTgt_stdcost_flg_VC(info);
		if (vc == CopyTgt_itm_strg_flg) return doCopyTgt_itm_strg_flg_VC(info);
		if (vc == CopyTgt_itm_lg_grp_flg) return doCopyTgt_itm_lg_grp_flg_VC(info);
		if (vc == CopyTgt_itm_str_ln_flg) return doCopyTgt_itm_str_ln_flg_VC(info);
		if (vc == CopyTgt_alloc_ctl_flg) return doCopyTgt_alloc_ctl_flg_VC(info);
		if (vc == CopyTgt_stk_rpl_flg) return doCopyTgt_stk_rpl_flg_VC(info);
		if (vc == CopyTgt_itm_wg_flg) return doCopyTgt_itm_wg_flg_VC(info);
		if (vc == CopyTgt_itm_dtl_flg) return doCopyTgt_itm_dtl_flg_VC(info);
		if (vc == CopyTgt_itm_oper_flg) return doCopyTgt_itm_oper_flg_VC(info);
		if (vc == CopyTgt_bom_par_flg) return doCopyTgt_bom_par_flg_VC(info);
		if (vc == CopyTgt_oper_wk_cost_flg) return doCopyTgt_oper_wk_cost_flg_VC(info);
		if (vc == CopyTgt_itm_insp_ptn_flg) return doCopyTgt_itm_insp_ptn_flg_VC(info);
		if (vc == CopyTgt_itm_insp_flg) return doCopyTgt_itm_insp_flg_VC(info);
		if (vc == CopyTgt_insp_spec_flg) return doCopyTgt_insp_spec_flg_VC(info);
		if (vc == CopyTgt_itm_site_flg) return doCopyTgt_itm_site_flg_VC(info);
		if (vc == CopyTgt_mps_itm_flg) return doCopyTgt_mps_itm_flg_VC(info);
		if (vc == CopyTgt_spln_itm_conf_flg) return doCopyTgt_spln_itm_conf_flg_VC(info);
		if (vc == CopyTgt_purc_ddlv_lt_flg) return doCopyTgt_purc_ddlv_lt_flg_VC(info);
		if (vc == CopyTgt_bp_itm_flg) return doCopyTgt_bp_itm_flg_VC(info);
		if (vc == CopyTgt_set_itm_main_flg) return doCopyTgt_set_itm_main_flg_VC(info);
		if (vc == CopyTgt_ctg_config_flg) return doCopyTgt_ctg_config_flg_VC(info);
		if (vc == CopyTgt_itm_ver_flg) return doCopyTgt_itm_ver_flg_VC(info);
		if (vc == CopyTgt_coef_config_flg) return doCopyTgt_coef_config_flg_VC(info);
		if (vc == CopyTgt_alc_inpt_flg) return doCopyTgt_alc_inpt_flg_VC(info);
		if (vc == CopyTgt_cost_itm_out_flg) return doCopyTgt_cost_itm_out_flg_VC(info);
		if (vc == CopyTgt_xpns_purc_alc_flg) return doCopyTgt_xpns_purc_alc_flg_VC(info);
		if (vc == CopyTgt_lot_inh_dest_flg) return doCopyTgt_lot_inh_dest_flg_VC(info);
		if (vc == CopyTgt_itm_spec_flg) return doCopyTgt_itm_spec_flg_VC(info);
		if (vc == CopyTgt_itm_spec_desc_flg) return doCopyTgt_itm_spec_desc_flg_VC(info);
		if (vc == CopyTgt_itm_comp_core_flg) return doCopyTgt_itm_comp_core_flg_VC(info);
		if (vc == CopyTgt_attach_info_flg) return doCopyTgt_attach_info_flg_VC(info);
		if (vc == CopyTgt_itm_not_fix_flg) return doCopyTgt_itm_not_fix_flg_VC(info);
		if (vc == CopyTgt_sundry_itm_flg) return doCopyTgt_sundry_itm_flg_VC(info);
		if (vc == CopyTgt_alt_itm_flg) return doCopyTgt_alt_itm_flg_VC(info);
		if (vc == CopyTgt_bom_chd_flg) return doCopyTgt_bom_chd_flg_VC(info);
		if (vc == CopyTgt_proc_upri_flg) return doCopyTgt_proc_upri_flg_VC(info);
		if (vc == CopyTgt_prov_upri_flg) return doCopyTgt_prov_upri_flg_VC(info);
		if (vc == CopyTgt_purc_upri_flg) return doCopyTgt_purc_upri_flg_VC(info);
		if (vc == CopyTgt_std_sls_upri_flg) return doCopyTgt_std_sls_upri_flg_VC(info);
		if (vc == CopyTgt_itm_sls_upri_flg) return doCopyTgt_itm_sls_upri_flg_VC(info);
		if (vc == CopyTgt_cst_sls_upri_flg) return doCopyTgt_cst_sls_upri_flg_VC(info);
		if (vc == CopyTgt_set_itm_set_flg) return doCopyTgt_set_itm_set_flg_VC(info);
		if (vc == CopyTgt_alc_expns_flg) return doCopyTgt_alc_expns_flg_VC(info);
		if (vc == CopyTgt_jnl_ptn_flg) return doCopyTgt_jnl_ptn_flg_VC(info);
		if (vc == CopyTgt_lot_inh_src_flg) return doCopyTgt_lot_inh_src_flg_VC(info);
		if (vc == CopyTgt_if_x_flg) return doCopyTgt_if_x_flg_VC(info);
		if (vc == CopyTgt_itm_comp_comp_flg) return doCopyTgt_itm_comp_comp_flg_VC(info);
		if (vc == Btn_ex_on_del_flg) return doBtn_ex_on_del_flg_VC(info);
		if (vc == Btn_ex_past_end_dt) return doBtn_ex_past_end_dt_VC(info);
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
	 * [Tgt]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTgt_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[chng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chng_no_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[memo1_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo1_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo2_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo2_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo3_c]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo3_c_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_off_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_on_del_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[dest_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_itm_sub1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_itm_sub1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_itm_sub2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_itm_sub2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_itm_sub3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_itm_sub3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_sub_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_sub_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_unit_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_unit_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_stop_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_stop_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stdcost_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stdcost_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_strg_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_strg_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_lg_grp_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_lg_grp_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_str_ln_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_str_ln_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alloc_ctl_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_rpl_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_rpl_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_wg_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_wg_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_dtl_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_dtl_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_oper_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_oper_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bom_par_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bom_par_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_wk_cost_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_wk_cost_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_insp_ptn_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_insp_ptn_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_insp_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_insp_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[insp_spec_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_insp_spec_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_site_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_site_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mps_itm_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mps_itm_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[spln_itm_conf_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_spln_itm_conf_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_lt_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_ddlv_lt_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_itm_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_itm_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[set_itm_main_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_set_itm_main_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ctg_config_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ctg_config_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_ver_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_ver_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[coef_config_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_coef_config_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_expns_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_expns_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_inpt_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_inpt_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cost_itm_out_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cost_itm_out_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xpns_purc_alc_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xpns_purc_alc_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_not_fix_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_not_fix_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sundry_itm_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sundry_itm_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alt_itm_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alt_itm_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bom_chd_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bom_chd_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[proc_upri_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_proc_upri_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_upri_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_upri_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_upri_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_upri_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_sls_upri_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_sls_upri_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_sls_upri_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_sls_upri_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_sls_upri_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_sls_upri_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[set_itm_set_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_set_itm_set_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jnl_ptn_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_inh_dest_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_inh_dest_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_spec_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_spec_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_spec_desc_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_spec_desc_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_comp_core_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_comp_core_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_inh_src_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_inh_src_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[if_x_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_if_x_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_comp_comp_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_comp_comp_cnt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_sub_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_sub_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_unit_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_unit_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_stop_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_stop_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stdcost_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stdcost_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_strg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_strg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_lg_grp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_lg_grp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_str_ln_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_str_ln_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alloc_ctl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_rpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_rpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_wg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_wg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_dtl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_dtl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_oper_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_oper_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bom_par_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bom_par_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_wk_cost_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_wk_cost_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_insp_ptn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_insp_ptn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_insp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_insp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[insp_spec_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_insp_spec_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_site_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_site_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mps_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mps_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[spln_itm_conf_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_spln_itm_conf_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_lt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_ddlv_lt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[set_itm_main_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_set_itm_main_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ctg_config_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ctg_config_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[coef_config_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_coef_config_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_expns_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_expns_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_inpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cost_itm_out_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cost_itm_out_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xpns_purc_alc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xpns_purc_alc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[attach_info_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_attach_info_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_not_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_not_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alt_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alt_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bom_chd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bom_chd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[proc_upri_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_proc_upri_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_upri_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_upri_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_upri_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_upri_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_sls_upri_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_sls_upri_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_sls_upri_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_sls_upri_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_sls_upri_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_sls_upri_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[set_itm_set_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_set_itm_set_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jnl_ptn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_inh_dest_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_inh_dest_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_spec_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_spec_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_spec_desc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_spec_desc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_comp_core_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_comp_core_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_inh_src_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_inh_src_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[if_x_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_if_x_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_comp_comp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_comp_comp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[itm_sub_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_itm_sub_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[itm_unit_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_itm_unit_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[itm_stop_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_itm_stop_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[stdcost_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_stdcost_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[itm_strg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_itm_strg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[itm_lg_grp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_itm_lg_grp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[itm_str_ln_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_itm_str_ln_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[alloc_ctl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_alloc_ctl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[stk_rpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_stk_rpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[itm_wg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_itm_wg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[itm_dtl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_itm_dtl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[itm_oper_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_itm_oper_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[bom_par_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_bom_par_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[oper_wk_cost_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_oper_wk_cost_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[itm_insp_ptn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_itm_insp_ptn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[itm_insp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_itm_insp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[insp_spec_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_insp_spec_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[itm_site_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_itm_site_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[mps_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_mps_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[spln_itm_conf_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_spln_itm_conf_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[purc_ddlv_lt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_purc_ddlv_lt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[bp_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_bp_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[set_itm_main_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_set_itm_main_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[ctg_config_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_ctg_config_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[itm_ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_itm_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[coef_config_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_coef_config_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[alc_inpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_alc_inpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[cost_itm_out_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_cost_itm_out_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[xpns_purc_alc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_xpns_purc_alc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[lot_inh_dest_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_lot_inh_dest_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[itm_spec_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_itm_spec_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[itm_spec_desc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_itm_spec_desc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[itm_comp_core_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_itm_comp_core_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[attach_info_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_attach_info_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[itm_not_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_itm_not_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[alt_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_alt_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[bom_chd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_bom_chd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[proc_upri_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_proc_upri_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[prov_upri_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_prov_upri_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[purc_upri_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_purc_upri_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[std_sls_upri_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_std_sls_upri_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[itm_sls_upri_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_itm_sls_upri_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[cst_sls_upri_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_cst_sls_upri_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[set_itm_set_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_set_itm_set_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[alc_expns_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_alc_expns_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[jnl_ptn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_jnl_ptn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[lot_inh_src_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_lot_inh_src_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[if_x_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_if_x_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [CopyTgt]パネルの[itm_comp_comp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCopyTgt_itm_comp_comp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[ex_on_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_ex_on_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[ex_past_end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_ex_past_end_dt_VC(MCEventInfo info){
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
		else if (nc == TgtTab) doTgt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_chng_no) doCnd_chng_no_NC(info);
		else if (nc == Cnd_release_flg_off) doCnd_release_flg_off_NC(info);
		else if (nc == Cnd_release_flg_on) doCnd_release_flg_on_NC(info);
		else if (nc == Cnd_memo1_c) doCnd_memo1_c_NC(info);
		else if (nc == Cnd_memo2_c) doCnd_memo2_c_NC(info);
		else if (nc == Cnd_memo3_c) doCnd_memo3_c_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
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
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_base_itm_nm) doDtl_base_itm_nm_NC(info);
		else if (nc == columnDtl_itm_typ) doDtl_itm_typ_NC(info);
		else if (nc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NC(info);
		else if (nc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_dest_itm_cd) doDtl_dest_itm_cd_NC(info);
		else if (nc == columnDtl_dest_itm_sub1) doDtl_dest_itm_sub1_NC(info);
		else if (nc == columnDtl_dest_itm_sub2) doDtl_dest_itm_sub2_NC(info);
		else if (nc == columnDtl_dest_itm_sub3) doDtl_dest_itm_sub3_NC(info);
		else if (nc == columnDtl_dest_itm_nm) doDtl_dest_itm_nm_NC(info);
		else if (nc == columnDtl_chng_no) doDtl_chng_no_NC(info);
		else if (nc == columnDtl_memo1) doDtl_memo1_NC(info);
		else if (nc == columnDtl_memo2) doDtl_memo2_NC(info);
		else if (nc == columnDtl_memo3) doDtl_memo3_NC(info);
		else if (nc == columnDtl_itm_cnt) doDtl_itm_cnt_NC(info);
		else if (nc == columnDtl_itm_sub_cnt) doDtl_itm_sub_cnt_NC(info);
		else if (nc == columnDtl_itm_unit_cnt) doDtl_itm_unit_cnt_NC(info);
		else if (nc == columnDtl_itm_stop_cnt) doDtl_itm_stop_cnt_NC(info);
		else if (nc == columnDtl_stdcost_cnt) doDtl_stdcost_cnt_NC(info);
		else if (nc == columnDtl_itm_strg_cnt) doDtl_itm_strg_cnt_NC(info);
		else if (nc == columnDtl_itm_lg_grp_cnt) doDtl_itm_lg_grp_cnt_NC(info);
		else if (nc == columnDtl_itm_str_ln_cnt) doDtl_itm_str_ln_cnt_NC(info);
		else if (nc == columnDtl_alloc_ctl_cnt) doDtl_alloc_ctl_cnt_NC(info);
		else if (nc == columnDtl_stk_rpl_cnt) doDtl_stk_rpl_cnt_NC(info);
		else if (nc == columnDtl_itm_wg_cnt) doDtl_itm_wg_cnt_NC(info);
		else if (nc == columnDtl_itm_dtl_cnt) doDtl_itm_dtl_cnt_NC(info);
		else if (nc == columnDtl_itm_oper_cnt) doDtl_itm_oper_cnt_NC(info);
		else if (nc == columnDtl_bom_par_cnt) doDtl_bom_par_cnt_NC(info);
		else if (nc == columnDtl_oper_wk_cost_cnt) doDtl_oper_wk_cost_cnt_NC(info);
		else if (nc == columnDtl_itm_insp_ptn_cnt) doDtl_itm_insp_ptn_cnt_NC(info);
		else if (nc == columnDtl_itm_insp_cnt) doDtl_itm_insp_cnt_NC(info);
		else if (nc == columnDtl_insp_spec_cnt) doDtl_insp_spec_cnt_NC(info);
		else if (nc == columnDtl_itm_site_cnt) doDtl_itm_site_cnt_NC(info);
		else if (nc == columnDtl_mps_itm_cnt) doDtl_mps_itm_cnt_NC(info);
		else if (nc == columnDtl_spln_itm_conf_cnt) doDtl_spln_itm_conf_cnt_NC(info);
		else if (nc == columnDtl_purc_ddlv_lt_cnt) doDtl_purc_ddlv_lt_cnt_NC(info);
		else if (nc == columnDtl_bp_itm_cnt) doDtl_bp_itm_cnt_NC(info);
		else if (nc == columnDtl_set_itm_main_cnt) doDtl_set_itm_main_cnt_NC(info);
		else if (nc == columnDtl_ctg_config_cnt) doDtl_ctg_config_cnt_NC(info);
		else if (nc == columnDtl_itm_ver_cnt) doDtl_itm_ver_cnt_NC(info);
		else if (nc == columnDtl_coef_config_cnt) doDtl_coef_config_cnt_NC(info);
		else if (nc == columnDtl_alc_expns_cnt) doDtl_alc_expns_cnt_NC(info);
		else if (nc == columnDtl_alc_inpt_cnt) doDtl_alc_inpt_cnt_NC(info);
		else if (nc == columnDtl_cost_itm_out_cnt) doDtl_cost_itm_out_cnt_NC(info);
		else if (nc == columnDtl_xpns_purc_alc_cnt) doDtl_xpns_purc_alc_cnt_NC(info);
		else if (nc == columnDtl_attach_info_cnt) doDtl_attach_info_cnt_NC(info);
		else if (nc == columnDtl_itm_not_fix_cnt) doDtl_itm_not_fix_cnt_NC(info);
		else if (nc == columnDtl_sundry_itm_cnt) doDtl_sundry_itm_cnt_NC(info);
		else if (nc == columnDtl_alt_itm_cnt) doDtl_alt_itm_cnt_NC(info);
		else if (nc == columnDtl_bom_chd_cnt) doDtl_bom_chd_cnt_NC(info);
		else if (nc == columnDtl_proc_upri_cnt) doDtl_proc_upri_cnt_NC(info);
		else if (nc == columnDtl_prov_upri_cnt) doDtl_prov_upri_cnt_NC(info);
		else if (nc == columnDtl_purc_upri_cnt) doDtl_purc_upri_cnt_NC(info);
		else if (nc == columnDtl_std_sls_upri_cnt) doDtl_std_sls_upri_cnt_NC(info);
		else if (nc == columnDtl_itm_sls_upri_cnt) doDtl_itm_sls_upri_cnt_NC(info);
		else if (nc == columnDtl_cst_sls_upri_cnt) doDtl_cst_sls_upri_cnt_NC(info);
		else if (nc == columnDtl_set_itm_set_cnt) doDtl_set_itm_set_cnt_NC(info);
		else if (nc == columnDtl_jnl_ptn_cnt) doDtl_jnl_ptn_cnt_NC(info);
		else if (nc == columnDtl_lot_inh_dest_cnt) doDtl_lot_inh_dest_cnt_NC(info);
		else if (nc == columnDtl_itm_spec_cnt) doDtl_itm_spec_cnt_NC(info);
		else if (nc == columnDtl_itm_spec_desc_cnt) doDtl_itm_spec_desc_cnt_NC(info);
		else if (nc == columnDtl_itm_comp_core_cnt) doDtl_itm_comp_core_cnt_NC(info);
		else if (nc == columnDtl_lot_inh_src_cnt) doDtl_lot_inh_src_cnt_NC(info);
		else if (nc == columnDtl_if_x_cnt) doDtl_if_x_cnt_NC(info);
		else if (nc == columnDtl_itm_comp_comp_cnt) doDtl_itm_comp_comp_cnt_NC(info);
		else if (nc == columnDtl_itm_flg) doDtl_itm_flg_NC(info);
		else if (nc == columnDtl_itm_sub_flg) doDtl_itm_sub_flg_NC(info);
		else if (nc == columnDtl_itm_unit_flg) doDtl_itm_unit_flg_NC(info);
		else if (nc == columnDtl_itm_stop_flg) doDtl_itm_stop_flg_NC(info);
		else if (nc == columnDtl_stdcost_flg) doDtl_stdcost_flg_NC(info);
		else if (nc == columnDtl_itm_strg_flg) doDtl_itm_strg_flg_NC(info);
		else if (nc == columnDtl_itm_lg_grp_flg) doDtl_itm_lg_grp_flg_NC(info);
		else if (nc == columnDtl_itm_str_ln_flg) doDtl_itm_str_ln_flg_NC(info);
		else if (nc == columnDtl_alloc_ctl_flg) doDtl_alloc_ctl_flg_NC(info);
		else if (nc == columnDtl_stk_rpl_flg) doDtl_stk_rpl_flg_NC(info);
		else if (nc == columnDtl_itm_wg_flg) doDtl_itm_wg_flg_NC(info);
		else if (nc == columnDtl_itm_dtl_flg) doDtl_itm_dtl_flg_NC(info);
		else if (nc == columnDtl_itm_oper_flg) doDtl_itm_oper_flg_NC(info);
		else if (nc == columnDtl_bom_par_flg) doDtl_bom_par_flg_NC(info);
		else if (nc == columnDtl_oper_wk_cost_flg) doDtl_oper_wk_cost_flg_NC(info);
		else if (nc == columnDtl_itm_insp_ptn_flg) doDtl_itm_insp_ptn_flg_NC(info);
		else if (nc == columnDtl_itm_insp_flg) doDtl_itm_insp_flg_NC(info);
		else if (nc == columnDtl_insp_spec_flg) doDtl_insp_spec_flg_NC(info);
		else if (nc == columnDtl_itm_site_flg) doDtl_itm_site_flg_NC(info);
		else if (nc == columnDtl_mps_itm_flg) doDtl_mps_itm_flg_NC(info);
		else if (nc == columnDtl_spln_itm_conf_flg) doDtl_spln_itm_conf_flg_NC(info);
		else if (nc == columnDtl_purc_ddlv_lt_flg) doDtl_purc_ddlv_lt_flg_NC(info);
		else if (nc == columnDtl_bp_itm_flg) doDtl_bp_itm_flg_NC(info);
		else if (nc == columnDtl_set_itm_main_flg) doDtl_set_itm_main_flg_NC(info);
		else if (nc == columnDtl_ctg_config_flg) doDtl_ctg_config_flg_NC(info);
		else if (nc == columnDtl_itm_ver_flg) doDtl_itm_ver_flg_NC(info);
		else if (nc == columnDtl_coef_config_flg) doDtl_coef_config_flg_NC(info);
		else if (nc == columnDtl_alc_expns_flg) doDtl_alc_expns_flg_NC(info);
		else if (nc == columnDtl_alc_inpt_flg) doDtl_alc_inpt_flg_NC(info);
		else if (nc == columnDtl_cost_itm_out_flg) doDtl_cost_itm_out_flg_NC(info);
		else if (nc == columnDtl_xpns_purc_alc_flg) doDtl_xpns_purc_alc_flg_NC(info);
		else if (nc == columnDtl_attach_info_flg) doDtl_attach_info_flg_NC(info);
		else if (nc == columnDtl_itm_not_fix_flg) doDtl_itm_not_fix_flg_NC(info);
		else if (nc == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NC(info);
		else if (nc == columnDtl_alt_itm_flg) doDtl_alt_itm_flg_NC(info);
		else if (nc == columnDtl_bom_chd_flg) doDtl_bom_chd_flg_NC(info);
		else if (nc == columnDtl_proc_upri_flg) doDtl_proc_upri_flg_NC(info);
		else if (nc == columnDtl_prov_upri_flg) doDtl_prov_upri_flg_NC(info);
		else if (nc == columnDtl_purc_upri_flg) doDtl_purc_upri_flg_NC(info);
		else if (nc == columnDtl_std_sls_upri_flg) doDtl_std_sls_upri_flg_NC(info);
		else if (nc == columnDtl_itm_sls_upri_flg) doDtl_itm_sls_upri_flg_NC(info);
		else if (nc == columnDtl_cst_sls_upri_flg) doDtl_cst_sls_upri_flg_NC(info);
		else if (nc == columnDtl_set_itm_set_flg) doDtl_set_itm_set_flg_NC(info);
		else if (nc == columnDtl_jnl_ptn_flg) doDtl_jnl_ptn_flg_NC(info);
		else if (nc == columnDtl_lot_inh_dest_flg) doDtl_lot_inh_dest_flg_NC(info);
		else if (nc == columnDtl_itm_spec_flg) doDtl_itm_spec_flg_NC(info);
		else if (nc == columnDtl_itm_spec_desc_flg) doDtl_itm_spec_desc_flg_NC(info);
		else if (nc == columnDtl_itm_comp_core_flg) doDtl_itm_comp_core_flg_NC(info);
		else if (nc == columnDtl_lot_inh_src_flg) doDtl_lot_inh_src_flg_NC(info);
		else if (nc == columnDtl_if_x_flg) doDtl_if_x_flg_NC(info);
		else if (nc == columnDtl_itm_comp_comp_flg) doDtl_itm_comp_comp_flg_NC(info);
		else if (nc == CopyTgt_itm_flg) doCopyTgt_itm_flg_NC(info);
		else if (nc == CopyTgt_itm_sub_flg) doCopyTgt_itm_sub_flg_NC(info);
		else if (nc == CopyTgt_itm_unit_flg) doCopyTgt_itm_unit_flg_NC(info);
		else if (nc == CopyTgt_itm_stop_flg) doCopyTgt_itm_stop_flg_NC(info);
		else if (nc == CopyTgt_stdcost_flg) doCopyTgt_stdcost_flg_NC(info);
		else if (nc == CopyTgt_itm_strg_flg) doCopyTgt_itm_strg_flg_NC(info);
		else if (nc == CopyTgt_itm_lg_grp_flg) doCopyTgt_itm_lg_grp_flg_NC(info);
		else if (nc == CopyTgt_itm_str_ln_flg) doCopyTgt_itm_str_ln_flg_NC(info);
		else if (nc == CopyTgt_alloc_ctl_flg) doCopyTgt_alloc_ctl_flg_NC(info);
		else if (nc == CopyTgt_stk_rpl_flg) doCopyTgt_stk_rpl_flg_NC(info);
		else if (nc == CopyTgt_itm_wg_flg) doCopyTgt_itm_wg_flg_NC(info);
		else if (nc == CopyTgt_itm_dtl_flg) doCopyTgt_itm_dtl_flg_NC(info);
		else if (nc == CopyTgt_itm_oper_flg) doCopyTgt_itm_oper_flg_NC(info);
		else if (nc == CopyTgt_bom_par_flg) doCopyTgt_bom_par_flg_NC(info);
		else if (nc == CopyTgt_oper_wk_cost_flg) doCopyTgt_oper_wk_cost_flg_NC(info);
		else if (nc == CopyTgt_itm_insp_ptn_flg) doCopyTgt_itm_insp_ptn_flg_NC(info);
		else if (nc == CopyTgt_itm_insp_flg) doCopyTgt_itm_insp_flg_NC(info);
		else if (nc == CopyTgt_insp_spec_flg) doCopyTgt_insp_spec_flg_NC(info);
		else if (nc == CopyTgt_itm_site_flg) doCopyTgt_itm_site_flg_NC(info);
		else if (nc == CopyTgt_mps_itm_flg) doCopyTgt_mps_itm_flg_NC(info);
		else if (nc == CopyTgt_spln_itm_conf_flg) doCopyTgt_spln_itm_conf_flg_NC(info);
		else if (nc == CopyTgt_purc_ddlv_lt_flg) doCopyTgt_purc_ddlv_lt_flg_NC(info);
		else if (nc == CopyTgt_bp_itm_flg) doCopyTgt_bp_itm_flg_NC(info);
		else if (nc == CopyTgt_set_itm_main_flg) doCopyTgt_set_itm_main_flg_NC(info);
		else if (nc == CopyTgt_ctg_config_flg) doCopyTgt_ctg_config_flg_NC(info);
		else if (nc == CopyTgt_itm_ver_flg) doCopyTgt_itm_ver_flg_NC(info);
		else if (nc == CopyTgt_coef_config_flg) doCopyTgt_coef_config_flg_NC(info);
		else if (nc == CopyTgt_alc_inpt_flg) doCopyTgt_alc_inpt_flg_NC(info);
		else if (nc == CopyTgt_cost_itm_out_flg) doCopyTgt_cost_itm_out_flg_NC(info);
		else if (nc == CopyTgt_xpns_purc_alc_flg) doCopyTgt_xpns_purc_alc_flg_NC(info);
		else if (nc == CopyTgt_lot_inh_dest_flg) doCopyTgt_lot_inh_dest_flg_NC(info);
		else if (nc == CopyTgt_itm_spec_flg) doCopyTgt_itm_spec_flg_NC(info);
		else if (nc == CopyTgt_itm_spec_desc_flg) doCopyTgt_itm_spec_desc_flg_NC(info);
		else if (nc == CopyTgt_itm_comp_core_flg) doCopyTgt_itm_comp_core_flg_NC(info);
		else if (nc == CopyTgt_attach_info_flg) doCopyTgt_attach_info_flg_NC(info);
		else if (nc == CopyTgt_itm_not_fix_flg) doCopyTgt_itm_not_fix_flg_NC(info);
		else if (nc == CopyTgt_sundry_itm_flg) doCopyTgt_sundry_itm_flg_NC(info);
		else if (nc == CopyTgt_alt_itm_flg) doCopyTgt_alt_itm_flg_NC(info);
		else if (nc == CopyTgt_bom_chd_flg) doCopyTgt_bom_chd_flg_NC(info);
		else if (nc == CopyTgt_proc_upri_flg) doCopyTgt_proc_upri_flg_NC(info);
		else if (nc == CopyTgt_prov_upri_flg) doCopyTgt_prov_upri_flg_NC(info);
		else if (nc == CopyTgt_purc_upri_flg) doCopyTgt_purc_upri_flg_NC(info);
		else if (nc == CopyTgt_std_sls_upri_flg) doCopyTgt_std_sls_upri_flg_NC(info);
		else if (nc == CopyTgt_itm_sls_upri_flg) doCopyTgt_itm_sls_upri_flg_NC(info);
		else if (nc == CopyTgt_cst_sls_upri_flg) doCopyTgt_cst_sls_upri_flg_NC(info);
		else if (nc == CopyTgt_set_itm_set_flg) doCopyTgt_set_itm_set_flg_NC(info);
		else if (nc == CopyTgt_alc_expns_flg) doCopyTgt_alc_expns_flg_NC(info);
		else if (nc == CopyTgt_jnl_ptn_flg) doCopyTgt_jnl_ptn_flg_NC(info);
		else if (nc == CopyTgt_lot_inh_src_flg) doCopyTgt_lot_inh_src_flg_NC(info);
		else if (nc == CopyTgt_if_x_flg) doCopyTgt_if_x_flg_NC(info);
		else if (nc == CopyTgt_itm_comp_comp_flg) doCopyTgt_itm_comp_comp_flg_NC(info);
		else if (nc == Btn_ex_on_del_flg) doBtn_ex_on_del_flg_NC(info);
		else if (nc == Btn_ex_past_end_dt) doBtn_ex_past_end_dt_NC(info);
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
	 * [Tgt]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_no_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[memo1_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_c_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_c_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3_c]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_c_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[dest_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_itm_sub1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_itm_sub1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_itm_sub2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_itm_sub2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_itm_sub3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_itm_sub3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chng_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_unit_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_unit_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_stop_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_stop_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stdcost_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stdcost_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_strg_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_strg_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_lg_grp_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_lg_grp_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_str_ln_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_str_ln_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_rpl_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_rpl_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_wg_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_wg_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_dtl_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_dtl_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_oper_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_oper_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_par_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_par_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_wk_cost_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_wk_cost_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_insp_ptn_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_insp_ptn_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_insp_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_insp_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_spec_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_spec_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_site_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_site_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mps_itm_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mps_itm_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spln_itm_conf_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spln_itm_conf_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_lt_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_lt_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_itm_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_itm_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_itm_main_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_main_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_config_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_config_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_ver_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_ver_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[coef_config_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_coef_config_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_expns_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_expns_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_inpt_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_inpt_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_itm_out_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_itm_out_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xpns_purc_alc_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xpns_purc_alc_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_not_fix_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_not_fix_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_chd_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_chd_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_upri_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_upri_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_sls_upri_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_sls_upri_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sls_upri_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sls_upri_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_sls_upri_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_sls_upri_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_itm_set_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_set_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_dest_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_dest_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_desc_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_desc_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_comp_core_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_comp_core_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_src_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_src_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_x_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_x_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_comp_comp_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_comp_comp_cnt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_unit_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_unit_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_stop_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_stop_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stdcost_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stdcost_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_strg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_strg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_lg_grp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_lg_grp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_str_ln_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_str_ln_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_rpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_rpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_wg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_wg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_dtl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_dtl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_oper_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_oper_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_par_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_par_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_wk_cost_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_wk_cost_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_insp_ptn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_insp_ptn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_insp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_insp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_spec_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_spec_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_site_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_site_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mps_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mps_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spln_itm_conf_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spln_itm_conf_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_lt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_lt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_itm_main_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_main_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_config_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_config_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[coef_config_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_coef_config_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_expns_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_expns_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_itm_out_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_itm_out_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xpns_purc_alc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xpns_purc_alc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_not_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_not_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_chd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_chd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_upri_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_upri_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_sls_upri_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_sls_upri_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sls_upri_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sls_upri_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_sls_upri_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_sls_upri_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_itm_set_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_set_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_dest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_dest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_desc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_desc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_comp_core_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_comp_core_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_src_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_src_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_x_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_x_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_comp_comp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_comp_comp_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_sub_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_sub_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_unit_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_unit_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_stop_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_stop_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[stdcost_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_stdcost_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_strg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_strg_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_lg_grp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_lg_grp_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_str_ln_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_str_ln_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[alloc_ctl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_alloc_ctl_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[stk_rpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_stk_rpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_wg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_wg_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_dtl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_dtl_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_oper_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_oper_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[bom_par_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_bom_par_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[oper_wk_cost_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_oper_wk_cost_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_insp_ptn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_insp_ptn_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_insp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_insp_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[insp_spec_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_insp_spec_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_site_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_site_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[mps_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_mps_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[spln_itm_conf_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_spln_itm_conf_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[purc_ddlv_lt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_purc_ddlv_lt_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[bp_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_bp_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[set_itm_main_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_set_itm_main_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[ctg_config_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_ctg_config_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[coef_config_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_coef_config_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[alc_inpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_alc_inpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[cost_itm_out_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_cost_itm_out_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[xpns_purc_alc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_xpns_purc_alc_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[lot_inh_dest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_lot_inh_dest_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_spec_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_spec_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_spec_desc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_spec_desc_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_comp_core_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_comp_core_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[attach_info_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_attach_info_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_not_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_not_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[alt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_alt_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[bom_chd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_bom_chd_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[proc_upri_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_proc_upri_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[prov_upri_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_prov_upri_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[purc_upri_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_purc_upri_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[std_sls_upri_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_std_sls_upri_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_sls_upri_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_sls_upri_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[cst_sls_upri_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_cst_sls_upri_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[set_itm_set_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_set_itm_set_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[alc_expns_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_alc_expns_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[jnl_ptn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_jnl_ptn_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[lot_inh_src_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_lot_inh_src_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[if_x_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_if_x_flg_NC(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_comp_comp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_comp_comp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[ex_on_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_ex_on_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[ex_past_end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_ex_past_end_dt_NC(MCEventInfo info){
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
		else if (ne == TgtTab) doTgt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_chng_no) doCnd_chng_no_NE(info);
		else if (ne == Cnd_release_flg_off) doCnd_release_flg_off_NE(info);
		else if (ne == Cnd_release_flg_on) doCnd_release_flg_on_NE(info);
		else if (ne == Cnd_memo1_c) doCnd_memo1_c_NE(info);
		else if (ne == Cnd_memo2_c) doCnd_memo2_c_NE(info);
		else if (ne == Cnd_memo3_c) doCnd_memo3_c_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
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
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_base_itm_nm) doDtl_base_itm_nm_NE(info);
		else if (ne == columnDtl_itm_typ) doDtl_itm_typ_NE(info);
		else if (ne == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NE(info);
		else if (ne == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_dest_itm_cd) doDtl_dest_itm_cd_NE(info);
		else if (ne == columnDtl_dest_itm_sub1) doDtl_dest_itm_sub1_NE(info);
		else if (ne == columnDtl_dest_itm_sub2) doDtl_dest_itm_sub2_NE(info);
		else if (ne == columnDtl_dest_itm_sub3) doDtl_dest_itm_sub3_NE(info);
		else if (ne == columnDtl_dest_itm_nm) doDtl_dest_itm_nm_NE(info);
		else if (ne == columnDtl_chng_no) doDtl_chng_no_NE(info);
		else if (ne == columnDtl_memo1) doDtl_memo1_NE(info);
		else if (ne == columnDtl_memo2) doDtl_memo2_NE(info);
		else if (ne == columnDtl_memo3) doDtl_memo3_NE(info);
		else if (ne == columnDtl_itm_cnt) doDtl_itm_cnt_NE(info);
		else if (ne == columnDtl_itm_sub_cnt) doDtl_itm_sub_cnt_NE(info);
		else if (ne == columnDtl_itm_unit_cnt) doDtl_itm_unit_cnt_NE(info);
		else if (ne == columnDtl_itm_stop_cnt) doDtl_itm_stop_cnt_NE(info);
		else if (ne == columnDtl_stdcost_cnt) doDtl_stdcost_cnt_NE(info);
		else if (ne == columnDtl_itm_strg_cnt) doDtl_itm_strg_cnt_NE(info);
		else if (ne == columnDtl_itm_lg_grp_cnt) doDtl_itm_lg_grp_cnt_NE(info);
		else if (ne == columnDtl_itm_str_ln_cnt) doDtl_itm_str_ln_cnt_NE(info);
		else if (ne == columnDtl_alloc_ctl_cnt) doDtl_alloc_ctl_cnt_NE(info);
		else if (ne == columnDtl_stk_rpl_cnt) doDtl_stk_rpl_cnt_NE(info);
		else if (ne == columnDtl_itm_wg_cnt) doDtl_itm_wg_cnt_NE(info);
		else if (ne == columnDtl_itm_dtl_cnt) doDtl_itm_dtl_cnt_NE(info);
		else if (ne == columnDtl_itm_oper_cnt) doDtl_itm_oper_cnt_NE(info);
		else if (ne == columnDtl_bom_par_cnt) doDtl_bom_par_cnt_NE(info);
		else if (ne == columnDtl_oper_wk_cost_cnt) doDtl_oper_wk_cost_cnt_NE(info);
		else if (ne == columnDtl_itm_insp_ptn_cnt) doDtl_itm_insp_ptn_cnt_NE(info);
		else if (ne == columnDtl_itm_insp_cnt) doDtl_itm_insp_cnt_NE(info);
		else if (ne == columnDtl_insp_spec_cnt) doDtl_insp_spec_cnt_NE(info);
		else if (ne == columnDtl_itm_site_cnt) doDtl_itm_site_cnt_NE(info);
		else if (ne == columnDtl_mps_itm_cnt) doDtl_mps_itm_cnt_NE(info);
		else if (ne == columnDtl_spln_itm_conf_cnt) doDtl_spln_itm_conf_cnt_NE(info);
		else if (ne == columnDtl_purc_ddlv_lt_cnt) doDtl_purc_ddlv_lt_cnt_NE(info);
		else if (ne == columnDtl_bp_itm_cnt) doDtl_bp_itm_cnt_NE(info);
		else if (ne == columnDtl_set_itm_main_cnt) doDtl_set_itm_main_cnt_NE(info);
		else if (ne == columnDtl_ctg_config_cnt) doDtl_ctg_config_cnt_NE(info);
		else if (ne == columnDtl_itm_ver_cnt) doDtl_itm_ver_cnt_NE(info);
		else if (ne == columnDtl_coef_config_cnt) doDtl_coef_config_cnt_NE(info);
		else if (ne == columnDtl_alc_expns_cnt) doDtl_alc_expns_cnt_NE(info);
		else if (ne == columnDtl_alc_inpt_cnt) doDtl_alc_inpt_cnt_NE(info);
		else if (ne == columnDtl_cost_itm_out_cnt) doDtl_cost_itm_out_cnt_NE(info);
		else if (ne == columnDtl_xpns_purc_alc_cnt) doDtl_xpns_purc_alc_cnt_NE(info);
		else if (ne == columnDtl_attach_info_cnt) doDtl_attach_info_cnt_NE(info);
		else if (ne == columnDtl_itm_not_fix_cnt) doDtl_itm_not_fix_cnt_NE(info);
		else if (ne == columnDtl_sundry_itm_cnt) doDtl_sundry_itm_cnt_NE(info);
		else if (ne == columnDtl_alt_itm_cnt) doDtl_alt_itm_cnt_NE(info);
		else if (ne == columnDtl_bom_chd_cnt) doDtl_bom_chd_cnt_NE(info);
		else if (ne == columnDtl_proc_upri_cnt) doDtl_proc_upri_cnt_NE(info);
		else if (ne == columnDtl_prov_upri_cnt) doDtl_prov_upri_cnt_NE(info);
		else if (ne == columnDtl_purc_upri_cnt) doDtl_purc_upri_cnt_NE(info);
		else if (ne == columnDtl_std_sls_upri_cnt) doDtl_std_sls_upri_cnt_NE(info);
		else if (ne == columnDtl_itm_sls_upri_cnt) doDtl_itm_sls_upri_cnt_NE(info);
		else if (ne == columnDtl_cst_sls_upri_cnt) doDtl_cst_sls_upri_cnt_NE(info);
		else if (ne == columnDtl_set_itm_set_cnt) doDtl_set_itm_set_cnt_NE(info);
		else if (ne == columnDtl_jnl_ptn_cnt) doDtl_jnl_ptn_cnt_NE(info);
		else if (ne == columnDtl_lot_inh_dest_cnt) doDtl_lot_inh_dest_cnt_NE(info);
		else if (ne == columnDtl_itm_spec_cnt) doDtl_itm_spec_cnt_NE(info);
		else if (ne == columnDtl_itm_spec_desc_cnt) doDtl_itm_spec_desc_cnt_NE(info);
		else if (ne == columnDtl_itm_comp_core_cnt) doDtl_itm_comp_core_cnt_NE(info);
		else if (ne == columnDtl_lot_inh_src_cnt) doDtl_lot_inh_src_cnt_NE(info);
		else if (ne == columnDtl_if_x_cnt) doDtl_if_x_cnt_NE(info);
		else if (ne == columnDtl_itm_comp_comp_cnt) doDtl_itm_comp_comp_cnt_NE(info);
		else if (ne == columnDtl_itm_flg) doDtl_itm_flg_NE(info);
		else if (ne == columnDtl_itm_sub_flg) doDtl_itm_sub_flg_NE(info);
		else if (ne == columnDtl_itm_unit_flg) doDtl_itm_unit_flg_NE(info);
		else if (ne == columnDtl_itm_stop_flg) doDtl_itm_stop_flg_NE(info);
		else if (ne == columnDtl_stdcost_flg) doDtl_stdcost_flg_NE(info);
		else if (ne == columnDtl_itm_strg_flg) doDtl_itm_strg_flg_NE(info);
		else if (ne == columnDtl_itm_lg_grp_flg) doDtl_itm_lg_grp_flg_NE(info);
		else if (ne == columnDtl_itm_str_ln_flg) doDtl_itm_str_ln_flg_NE(info);
		else if (ne == columnDtl_alloc_ctl_flg) doDtl_alloc_ctl_flg_NE(info);
		else if (ne == columnDtl_stk_rpl_flg) doDtl_stk_rpl_flg_NE(info);
		else if (ne == columnDtl_itm_wg_flg) doDtl_itm_wg_flg_NE(info);
		else if (ne == columnDtl_itm_dtl_flg) doDtl_itm_dtl_flg_NE(info);
		else if (ne == columnDtl_itm_oper_flg) doDtl_itm_oper_flg_NE(info);
		else if (ne == columnDtl_bom_par_flg) doDtl_bom_par_flg_NE(info);
		else if (ne == columnDtl_oper_wk_cost_flg) doDtl_oper_wk_cost_flg_NE(info);
		else if (ne == columnDtl_itm_insp_ptn_flg) doDtl_itm_insp_ptn_flg_NE(info);
		else if (ne == columnDtl_itm_insp_flg) doDtl_itm_insp_flg_NE(info);
		else if (ne == columnDtl_insp_spec_flg) doDtl_insp_spec_flg_NE(info);
		else if (ne == columnDtl_itm_site_flg) doDtl_itm_site_flg_NE(info);
		else if (ne == columnDtl_mps_itm_flg) doDtl_mps_itm_flg_NE(info);
		else if (ne == columnDtl_spln_itm_conf_flg) doDtl_spln_itm_conf_flg_NE(info);
		else if (ne == columnDtl_purc_ddlv_lt_flg) doDtl_purc_ddlv_lt_flg_NE(info);
		else if (ne == columnDtl_bp_itm_flg) doDtl_bp_itm_flg_NE(info);
		else if (ne == columnDtl_set_itm_main_flg) doDtl_set_itm_main_flg_NE(info);
		else if (ne == columnDtl_ctg_config_flg) doDtl_ctg_config_flg_NE(info);
		else if (ne == columnDtl_itm_ver_flg) doDtl_itm_ver_flg_NE(info);
		else if (ne == columnDtl_coef_config_flg) doDtl_coef_config_flg_NE(info);
		else if (ne == columnDtl_alc_expns_flg) doDtl_alc_expns_flg_NE(info);
		else if (ne == columnDtl_alc_inpt_flg) doDtl_alc_inpt_flg_NE(info);
		else if (ne == columnDtl_cost_itm_out_flg) doDtl_cost_itm_out_flg_NE(info);
		else if (ne == columnDtl_xpns_purc_alc_flg) doDtl_xpns_purc_alc_flg_NE(info);
		else if (ne == columnDtl_attach_info_flg) doDtl_attach_info_flg_NE(info);
		else if (ne == columnDtl_itm_not_fix_flg) doDtl_itm_not_fix_flg_NE(info);
		else if (ne == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NE(info);
		else if (ne == columnDtl_alt_itm_flg) doDtl_alt_itm_flg_NE(info);
		else if (ne == columnDtl_bom_chd_flg) doDtl_bom_chd_flg_NE(info);
		else if (ne == columnDtl_proc_upri_flg) doDtl_proc_upri_flg_NE(info);
		else if (ne == columnDtl_prov_upri_flg) doDtl_prov_upri_flg_NE(info);
		else if (ne == columnDtl_purc_upri_flg) doDtl_purc_upri_flg_NE(info);
		else if (ne == columnDtl_std_sls_upri_flg) doDtl_std_sls_upri_flg_NE(info);
		else if (ne == columnDtl_itm_sls_upri_flg) doDtl_itm_sls_upri_flg_NE(info);
		else if (ne == columnDtl_cst_sls_upri_flg) doDtl_cst_sls_upri_flg_NE(info);
		else if (ne == columnDtl_set_itm_set_flg) doDtl_set_itm_set_flg_NE(info);
		else if (ne == columnDtl_jnl_ptn_flg) doDtl_jnl_ptn_flg_NE(info);
		else if (ne == columnDtl_lot_inh_dest_flg) doDtl_lot_inh_dest_flg_NE(info);
		else if (ne == columnDtl_itm_spec_flg) doDtl_itm_spec_flg_NE(info);
		else if (ne == columnDtl_itm_spec_desc_flg) doDtl_itm_spec_desc_flg_NE(info);
		else if (ne == columnDtl_itm_comp_core_flg) doDtl_itm_comp_core_flg_NE(info);
		else if (ne == columnDtl_lot_inh_src_flg) doDtl_lot_inh_src_flg_NE(info);
		else if (ne == columnDtl_if_x_flg) doDtl_if_x_flg_NE(info);
		else if (ne == columnDtl_itm_comp_comp_flg) doDtl_itm_comp_comp_flg_NE(info);
		else if (ne == CopyTgt_itm_flg) doCopyTgt_itm_flg_NE(info);
		else if (ne == CopyTgt_itm_sub_flg) doCopyTgt_itm_sub_flg_NE(info);
		else if (ne == CopyTgt_itm_unit_flg) doCopyTgt_itm_unit_flg_NE(info);
		else if (ne == CopyTgt_itm_stop_flg) doCopyTgt_itm_stop_flg_NE(info);
		else if (ne == CopyTgt_stdcost_flg) doCopyTgt_stdcost_flg_NE(info);
		else if (ne == CopyTgt_itm_strg_flg) doCopyTgt_itm_strg_flg_NE(info);
		else if (ne == CopyTgt_itm_lg_grp_flg) doCopyTgt_itm_lg_grp_flg_NE(info);
		else if (ne == CopyTgt_itm_str_ln_flg) doCopyTgt_itm_str_ln_flg_NE(info);
		else if (ne == CopyTgt_alloc_ctl_flg) doCopyTgt_alloc_ctl_flg_NE(info);
		else if (ne == CopyTgt_stk_rpl_flg) doCopyTgt_stk_rpl_flg_NE(info);
		else if (ne == CopyTgt_itm_wg_flg) doCopyTgt_itm_wg_flg_NE(info);
		else if (ne == CopyTgt_itm_dtl_flg) doCopyTgt_itm_dtl_flg_NE(info);
		else if (ne == CopyTgt_itm_oper_flg) doCopyTgt_itm_oper_flg_NE(info);
		else if (ne == CopyTgt_bom_par_flg) doCopyTgt_bom_par_flg_NE(info);
		else if (ne == CopyTgt_oper_wk_cost_flg) doCopyTgt_oper_wk_cost_flg_NE(info);
		else if (ne == CopyTgt_itm_insp_ptn_flg) doCopyTgt_itm_insp_ptn_flg_NE(info);
		else if (ne == CopyTgt_itm_insp_flg) doCopyTgt_itm_insp_flg_NE(info);
		else if (ne == CopyTgt_insp_spec_flg) doCopyTgt_insp_spec_flg_NE(info);
		else if (ne == CopyTgt_itm_site_flg) doCopyTgt_itm_site_flg_NE(info);
		else if (ne == CopyTgt_mps_itm_flg) doCopyTgt_mps_itm_flg_NE(info);
		else if (ne == CopyTgt_spln_itm_conf_flg) doCopyTgt_spln_itm_conf_flg_NE(info);
		else if (ne == CopyTgt_purc_ddlv_lt_flg) doCopyTgt_purc_ddlv_lt_flg_NE(info);
		else if (ne == CopyTgt_bp_itm_flg) doCopyTgt_bp_itm_flg_NE(info);
		else if (ne == CopyTgt_set_itm_main_flg) doCopyTgt_set_itm_main_flg_NE(info);
		else if (ne == CopyTgt_ctg_config_flg) doCopyTgt_ctg_config_flg_NE(info);
		else if (ne == CopyTgt_itm_ver_flg) doCopyTgt_itm_ver_flg_NE(info);
		else if (ne == CopyTgt_coef_config_flg) doCopyTgt_coef_config_flg_NE(info);
		else if (ne == CopyTgt_alc_inpt_flg) doCopyTgt_alc_inpt_flg_NE(info);
		else if (ne == CopyTgt_cost_itm_out_flg) doCopyTgt_cost_itm_out_flg_NE(info);
		else if (ne == CopyTgt_xpns_purc_alc_flg) doCopyTgt_xpns_purc_alc_flg_NE(info);
		else if (ne == CopyTgt_lot_inh_dest_flg) doCopyTgt_lot_inh_dest_flg_NE(info);
		else if (ne == CopyTgt_itm_spec_flg) doCopyTgt_itm_spec_flg_NE(info);
		else if (ne == CopyTgt_itm_spec_desc_flg) doCopyTgt_itm_spec_desc_flg_NE(info);
		else if (ne == CopyTgt_itm_comp_core_flg) doCopyTgt_itm_comp_core_flg_NE(info);
		else if (ne == CopyTgt_attach_info_flg) doCopyTgt_attach_info_flg_NE(info);
		else if (ne == CopyTgt_itm_not_fix_flg) doCopyTgt_itm_not_fix_flg_NE(info);
		else if (ne == CopyTgt_sundry_itm_flg) doCopyTgt_sundry_itm_flg_NE(info);
		else if (ne == CopyTgt_alt_itm_flg) doCopyTgt_alt_itm_flg_NE(info);
		else if (ne == CopyTgt_bom_chd_flg) doCopyTgt_bom_chd_flg_NE(info);
		else if (ne == CopyTgt_proc_upri_flg) doCopyTgt_proc_upri_flg_NE(info);
		else if (ne == CopyTgt_prov_upri_flg) doCopyTgt_prov_upri_flg_NE(info);
		else if (ne == CopyTgt_purc_upri_flg) doCopyTgt_purc_upri_flg_NE(info);
		else if (ne == CopyTgt_std_sls_upri_flg) doCopyTgt_std_sls_upri_flg_NE(info);
		else if (ne == CopyTgt_itm_sls_upri_flg) doCopyTgt_itm_sls_upri_flg_NE(info);
		else if (ne == CopyTgt_cst_sls_upri_flg) doCopyTgt_cst_sls_upri_flg_NE(info);
		else if (ne == CopyTgt_set_itm_set_flg) doCopyTgt_set_itm_set_flg_NE(info);
		else if (ne == CopyTgt_alc_expns_flg) doCopyTgt_alc_expns_flg_NE(info);
		else if (ne == CopyTgt_jnl_ptn_flg) doCopyTgt_jnl_ptn_flg_NE(info);
		else if (ne == CopyTgt_lot_inh_src_flg) doCopyTgt_lot_inh_src_flg_NE(info);
		else if (ne == CopyTgt_if_x_flg) doCopyTgt_if_x_flg_NE(info);
		else if (ne == CopyTgt_itm_comp_comp_flg) doCopyTgt_itm_comp_comp_flg_NE(info);
		else if (ne == Btn_ex_on_del_flg) doBtn_ex_on_del_flg_NE(info);
		else if (ne == Btn_ex_past_end_dt) doBtn_ex_past_end_dt_NE(info);
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
	 * [Tgt]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_no_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[memo1_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_c_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_c_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3_c]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_c_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[dest_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_itm_sub1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_itm_sub1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_itm_sub2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_itm_sub2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_itm_sub3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_itm_sub3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chng_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_unit_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_unit_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_stop_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_stop_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stdcost_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stdcost_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_strg_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_strg_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_lg_grp_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_lg_grp_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_str_ln_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_str_ln_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_rpl_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_rpl_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_wg_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_wg_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_dtl_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_dtl_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_oper_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_oper_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_par_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_par_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_wk_cost_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_wk_cost_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_insp_ptn_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_insp_ptn_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_insp_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_insp_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_spec_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_spec_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_site_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_site_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mps_itm_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mps_itm_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spln_itm_conf_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spln_itm_conf_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_lt_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_lt_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_itm_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_itm_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_itm_main_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_main_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_config_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_config_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_ver_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_ver_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[coef_config_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_coef_config_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_expns_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_expns_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_inpt_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_inpt_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_itm_out_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_itm_out_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xpns_purc_alc_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xpns_purc_alc_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_not_fix_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_not_fix_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_chd_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_chd_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_upri_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_upri_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_sls_upri_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_sls_upri_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sls_upri_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sls_upri_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_sls_upri_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_sls_upri_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_itm_set_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_set_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_dest_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_dest_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_desc_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_desc_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_comp_core_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_comp_core_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_src_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_src_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_x_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_x_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_comp_comp_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_comp_comp_cnt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_unit_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_unit_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_stop_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_stop_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stdcost_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stdcost_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_strg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_strg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_lg_grp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_lg_grp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_str_ln_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_str_ln_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_rpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_rpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_wg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_wg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_dtl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_dtl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_oper_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_oper_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_par_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_par_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_wk_cost_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_wk_cost_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_insp_ptn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_insp_ptn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_insp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_insp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_spec_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_spec_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_site_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_site_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mps_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mps_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spln_itm_conf_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spln_itm_conf_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_lt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_lt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_itm_main_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_main_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_config_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_config_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[coef_config_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_coef_config_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_expns_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_expns_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_itm_out_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_itm_out_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xpns_purc_alc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xpns_purc_alc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_not_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_not_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_chd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_chd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_upri_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_upri_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_sls_upri_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_sls_upri_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sls_upri_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sls_upri_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_sls_upri_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_sls_upri_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_itm_set_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_set_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_dest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_dest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_desc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_desc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_comp_core_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_comp_core_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_src_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_src_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_x_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_x_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_comp_comp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_comp_comp_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_sub_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_sub_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_unit_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_unit_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_stop_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_stop_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[stdcost_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_stdcost_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_strg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_strg_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_lg_grp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_lg_grp_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_str_ln_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_str_ln_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[alloc_ctl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_alloc_ctl_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[stk_rpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_stk_rpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_wg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_wg_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_dtl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_dtl_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_oper_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_oper_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[bom_par_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_bom_par_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[oper_wk_cost_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_oper_wk_cost_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_insp_ptn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_insp_ptn_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_insp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_insp_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[insp_spec_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_insp_spec_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_site_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_site_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[mps_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_mps_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[spln_itm_conf_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_spln_itm_conf_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[purc_ddlv_lt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_purc_ddlv_lt_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[bp_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_bp_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[set_itm_main_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_set_itm_main_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[ctg_config_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_ctg_config_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[coef_config_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_coef_config_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[alc_inpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_alc_inpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[cost_itm_out_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_cost_itm_out_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[xpns_purc_alc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_xpns_purc_alc_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[lot_inh_dest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_lot_inh_dest_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_spec_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_spec_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_spec_desc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_spec_desc_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_comp_core_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_comp_core_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[attach_info_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_attach_info_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_not_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_not_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[alt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_alt_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[bom_chd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_bom_chd_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[proc_upri_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_proc_upri_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[prov_upri_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_prov_upri_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[purc_upri_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_purc_upri_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[std_sls_upri_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_std_sls_upri_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_sls_upri_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_sls_upri_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[cst_sls_upri_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_cst_sls_upri_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[set_itm_set_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_set_itm_set_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[alc_expns_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_alc_expns_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[jnl_ptn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_jnl_ptn_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[lot_inh_src_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_lot_inh_src_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[if_x_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_if_x_flg_NE(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_comp_comp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_comp_comp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[ex_on_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_ex_on_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[ex_past_end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_ex_past_end_dt_NE(MCEventInfo info){
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
		else if (nx == TgtTab) doTgt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_chng_no) doCnd_chng_no_NX(info);
		else if (nx == Cnd_release_flg_off) doCnd_release_flg_off_NX(info);
		else if (nx == Cnd_release_flg_on) doCnd_release_flg_on_NX(info);
		else if (nx == Cnd_memo1_c) doCnd_memo1_c_NX(info);
		else if (nx == Cnd_memo2_c) doCnd_memo2_c_NX(info);
		else if (nx == Cnd_memo3_c) doCnd_memo3_c_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
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
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_base_itm_nm) doDtl_base_itm_nm_NX(info);
		else if (nx == columnDtl_itm_typ) doDtl_itm_typ_NX(info);
		else if (nx == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NX(info);
		else if (nx == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_dest_itm_cd) doDtl_dest_itm_cd_NX(info);
		else if (nx == columnDtl_dest_itm_sub1) doDtl_dest_itm_sub1_NX(info);
		else if (nx == columnDtl_dest_itm_sub2) doDtl_dest_itm_sub2_NX(info);
		else if (nx == columnDtl_dest_itm_sub3) doDtl_dest_itm_sub3_NX(info);
		else if (nx == columnDtl_dest_itm_nm) doDtl_dest_itm_nm_NX(info);
		else if (nx == columnDtl_chng_no) doDtl_chng_no_NX(info);
		else if (nx == columnDtl_memo1) doDtl_memo1_NX(info);
		else if (nx == columnDtl_memo2) doDtl_memo2_NX(info);
		else if (nx == columnDtl_memo3) doDtl_memo3_NX(info);
		else if (nx == columnDtl_itm_cnt) doDtl_itm_cnt_NX(info);
		else if (nx == columnDtl_itm_sub_cnt) doDtl_itm_sub_cnt_NX(info);
		else if (nx == columnDtl_itm_unit_cnt) doDtl_itm_unit_cnt_NX(info);
		else if (nx == columnDtl_itm_stop_cnt) doDtl_itm_stop_cnt_NX(info);
		else if (nx == columnDtl_stdcost_cnt) doDtl_stdcost_cnt_NX(info);
		else if (nx == columnDtl_itm_strg_cnt) doDtl_itm_strg_cnt_NX(info);
		else if (nx == columnDtl_itm_lg_grp_cnt) doDtl_itm_lg_grp_cnt_NX(info);
		else if (nx == columnDtl_itm_str_ln_cnt) doDtl_itm_str_ln_cnt_NX(info);
		else if (nx == columnDtl_alloc_ctl_cnt) doDtl_alloc_ctl_cnt_NX(info);
		else if (nx == columnDtl_stk_rpl_cnt) doDtl_stk_rpl_cnt_NX(info);
		else if (nx == columnDtl_itm_wg_cnt) doDtl_itm_wg_cnt_NX(info);
		else if (nx == columnDtl_itm_dtl_cnt) doDtl_itm_dtl_cnt_NX(info);
		else if (nx == columnDtl_itm_oper_cnt) doDtl_itm_oper_cnt_NX(info);
		else if (nx == columnDtl_bom_par_cnt) doDtl_bom_par_cnt_NX(info);
		else if (nx == columnDtl_oper_wk_cost_cnt) doDtl_oper_wk_cost_cnt_NX(info);
		else if (nx == columnDtl_itm_insp_ptn_cnt) doDtl_itm_insp_ptn_cnt_NX(info);
		else if (nx == columnDtl_itm_insp_cnt) doDtl_itm_insp_cnt_NX(info);
		else if (nx == columnDtl_insp_spec_cnt) doDtl_insp_spec_cnt_NX(info);
		else if (nx == columnDtl_itm_site_cnt) doDtl_itm_site_cnt_NX(info);
		else if (nx == columnDtl_mps_itm_cnt) doDtl_mps_itm_cnt_NX(info);
		else if (nx == columnDtl_spln_itm_conf_cnt) doDtl_spln_itm_conf_cnt_NX(info);
		else if (nx == columnDtl_purc_ddlv_lt_cnt) doDtl_purc_ddlv_lt_cnt_NX(info);
		else if (nx == columnDtl_bp_itm_cnt) doDtl_bp_itm_cnt_NX(info);
		else if (nx == columnDtl_set_itm_main_cnt) doDtl_set_itm_main_cnt_NX(info);
		else if (nx == columnDtl_ctg_config_cnt) doDtl_ctg_config_cnt_NX(info);
		else if (nx == columnDtl_itm_ver_cnt) doDtl_itm_ver_cnt_NX(info);
		else if (nx == columnDtl_coef_config_cnt) doDtl_coef_config_cnt_NX(info);
		else if (nx == columnDtl_alc_expns_cnt) doDtl_alc_expns_cnt_NX(info);
		else if (nx == columnDtl_alc_inpt_cnt) doDtl_alc_inpt_cnt_NX(info);
		else if (nx == columnDtl_cost_itm_out_cnt) doDtl_cost_itm_out_cnt_NX(info);
		else if (nx == columnDtl_xpns_purc_alc_cnt) doDtl_xpns_purc_alc_cnt_NX(info);
		else if (nx == columnDtl_attach_info_cnt) doDtl_attach_info_cnt_NX(info);
		else if (nx == columnDtl_itm_not_fix_cnt) doDtl_itm_not_fix_cnt_NX(info);
		else if (nx == columnDtl_sundry_itm_cnt) doDtl_sundry_itm_cnt_NX(info);
		else if (nx == columnDtl_alt_itm_cnt) doDtl_alt_itm_cnt_NX(info);
		else if (nx == columnDtl_bom_chd_cnt) doDtl_bom_chd_cnt_NX(info);
		else if (nx == columnDtl_proc_upri_cnt) doDtl_proc_upri_cnt_NX(info);
		else if (nx == columnDtl_prov_upri_cnt) doDtl_prov_upri_cnt_NX(info);
		else if (nx == columnDtl_purc_upri_cnt) doDtl_purc_upri_cnt_NX(info);
		else if (nx == columnDtl_std_sls_upri_cnt) doDtl_std_sls_upri_cnt_NX(info);
		else if (nx == columnDtl_itm_sls_upri_cnt) doDtl_itm_sls_upri_cnt_NX(info);
		else if (nx == columnDtl_cst_sls_upri_cnt) doDtl_cst_sls_upri_cnt_NX(info);
		else if (nx == columnDtl_set_itm_set_cnt) doDtl_set_itm_set_cnt_NX(info);
		else if (nx == columnDtl_jnl_ptn_cnt) doDtl_jnl_ptn_cnt_NX(info);
		else if (nx == columnDtl_lot_inh_dest_cnt) doDtl_lot_inh_dest_cnt_NX(info);
		else if (nx == columnDtl_itm_spec_cnt) doDtl_itm_spec_cnt_NX(info);
		else if (nx == columnDtl_itm_spec_desc_cnt) doDtl_itm_spec_desc_cnt_NX(info);
		else if (nx == columnDtl_itm_comp_core_cnt) doDtl_itm_comp_core_cnt_NX(info);
		else if (nx == columnDtl_lot_inh_src_cnt) doDtl_lot_inh_src_cnt_NX(info);
		else if (nx == columnDtl_if_x_cnt) doDtl_if_x_cnt_NX(info);
		else if (nx == columnDtl_itm_comp_comp_cnt) doDtl_itm_comp_comp_cnt_NX(info);
		else if (nx == columnDtl_itm_flg) doDtl_itm_flg_NX(info);
		else if (nx == columnDtl_itm_sub_flg) doDtl_itm_sub_flg_NX(info);
		else if (nx == columnDtl_itm_unit_flg) doDtl_itm_unit_flg_NX(info);
		else if (nx == columnDtl_itm_stop_flg) doDtl_itm_stop_flg_NX(info);
		else if (nx == columnDtl_stdcost_flg) doDtl_stdcost_flg_NX(info);
		else if (nx == columnDtl_itm_strg_flg) doDtl_itm_strg_flg_NX(info);
		else if (nx == columnDtl_itm_lg_grp_flg) doDtl_itm_lg_grp_flg_NX(info);
		else if (nx == columnDtl_itm_str_ln_flg) doDtl_itm_str_ln_flg_NX(info);
		else if (nx == columnDtl_alloc_ctl_flg) doDtl_alloc_ctl_flg_NX(info);
		else if (nx == columnDtl_stk_rpl_flg) doDtl_stk_rpl_flg_NX(info);
		else if (nx == columnDtl_itm_wg_flg) doDtl_itm_wg_flg_NX(info);
		else if (nx == columnDtl_itm_dtl_flg) doDtl_itm_dtl_flg_NX(info);
		else if (nx == columnDtl_itm_oper_flg) doDtl_itm_oper_flg_NX(info);
		else if (nx == columnDtl_bom_par_flg) doDtl_bom_par_flg_NX(info);
		else if (nx == columnDtl_oper_wk_cost_flg) doDtl_oper_wk_cost_flg_NX(info);
		else if (nx == columnDtl_itm_insp_ptn_flg) doDtl_itm_insp_ptn_flg_NX(info);
		else if (nx == columnDtl_itm_insp_flg) doDtl_itm_insp_flg_NX(info);
		else if (nx == columnDtl_insp_spec_flg) doDtl_insp_spec_flg_NX(info);
		else if (nx == columnDtl_itm_site_flg) doDtl_itm_site_flg_NX(info);
		else if (nx == columnDtl_mps_itm_flg) doDtl_mps_itm_flg_NX(info);
		else if (nx == columnDtl_spln_itm_conf_flg) doDtl_spln_itm_conf_flg_NX(info);
		else if (nx == columnDtl_purc_ddlv_lt_flg) doDtl_purc_ddlv_lt_flg_NX(info);
		else if (nx == columnDtl_bp_itm_flg) doDtl_bp_itm_flg_NX(info);
		else if (nx == columnDtl_set_itm_main_flg) doDtl_set_itm_main_flg_NX(info);
		else if (nx == columnDtl_ctg_config_flg) doDtl_ctg_config_flg_NX(info);
		else if (nx == columnDtl_itm_ver_flg) doDtl_itm_ver_flg_NX(info);
		else if (nx == columnDtl_coef_config_flg) doDtl_coef_config_flg_NX(info);
		else if (nx == columnDtl_alc_expns_flg) doDtl_alc_expns_flg_NX(info);
		else if (nx == columnDtl_alc_inpt_flg) doDtl_alc_inpt_flg_NX(info);
		else if (nx == columnDtl_cost_itm_out_flg) doDtl_cost_itm_out_flg_NX(info);
		else if (nx == columnDtl_xpns_purc_alc_flg) doDtl_xpns_purc_alc_flg_NX(info);
		else if (nx == columnDtl_attach_info_flg) doDtl_attach_info_flg_NX(info);
		else if (nx == columnDtl_itm_not_fix_flg) doDtl_itm_not_fix_flg_NX(info);
		else if (nx == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NX(info);
		else if (nx == columnDtl_alt_itm_flg) doDtl_alt_itm_flg_NX(info);
		else if (nx == columnDtl_bom_chd_flg) doDtl_bom_chd_flg_NX(info);
		else if (nx == columnDtl_proc_upri_flg) doDtl_proc_upri_flg_NX(info);
		else if (nx == columnDtl_prov_upri_flg) doDtl_prov_upri_flg_NX(info);
		else if (nx == columnDtl_purc_upri_flg) doDtl_purc_upri_flg_NX(info);
		else if (nx == columnDtl_std_sls_upri_flg) doDtl_std_sls_upri_flg_NX(info);
		else if (nx == columnDtl_itm_sls_upri_flg) doDtl_itm_sls_upri_flg_NX(info);
		else if (nx == columnDtl_cst_sls_upri_flg) doDtl_cst_sls_upri_flg_NX(info);
		else if (nx == columnDtl_set_itm_set_flg) doDtl_set_itm_set_flg_NX(info);
		else if (nx == columnDtl_jnl_ptn_flg) doDtl_jnl_ptn_flg_NX(info);
		else if (nx == columnDtl_lot_inh_dest_flg) doDtl_lot_inh_dest_flg_NX(info);
		else if (nx == columnDtl_itm_spec_flg) doDtl_itm_spec_flg_NX(info);
		else if (nx == columnDtl_itm_spec_desc_flg) doDtl_itm_spec_desc_flg_NX(info);
		else if (nx == columnDtl_itm_comp_core_flg) doDtl_itm_comp_core_flg_NX(info);
		else if (nx == columnDtl_lot_inh_src_flg) doDtl_lot_inh_src_flg_NX(info);
		else if (nx == columnDtl_if_x_flg) doDtl_if_x_flg_NX(info);
		else if (nx == columnDtl_itm_comp_comp_flg) doDtl_itm_comp_comp_flg_NX(info);
		else if (nx == CopyTgt_itm_flg) doCopyTgt_itm_flg_NX(info);
		else if (nx == CopyTgt_itm_sub_flg) doCopyTgt_itm_sub_flg_NX(info);
		else if (nx == CopyTgt_itm_unit_flg) doCopyTgt_itm_unit_flg_NX(info);
		else if (nx == CopyTgt_itm_stop_flg) doCopyTgt_itm_stop_flg_NX(info);
		else if (nx == CopyTgt_stdcost_flg) doCopyTgt_stdcost_flg_NX(info);
		else if (nx == CopyTgt_itm_strg_flg) doCopyTgt_itm_strg_flg_NX(info);
		else if (nx == CopyTgt_itm_lg_grp_flg) doCopyTgt_itm_lg_grp_flg_NX(info);
		else if (nx == CopyTgt_itm_str_ln_flg) doCopyTgt_itm_str_ln_flg_NX(info);
		else if (nx == CopyTgt_alloc_ctl_flg) doCopyTgt_alloc_ctl_flg_NX(info);
		else if (nx == CopyTgt_stk_rpl_flg) doCopyTgt_stk_rpl_flg_NX(info);
		else if (nx == CopyTgt_itm_wg_flg) doCopyTgt_itm_wg_flg_NX(info);
		else if (nx == CopyTgt_itm_dtl_flg) doCopyTgt_itm_dtl_flg_NX(info);
		else if (nx == CopyTgt_itm_oper_flg) doCopyTgt_itm_oper_flg_NX(info);
		else if (nx == CopyTgt_bom_par_flg) doCopyTgt_bom_par_flg_NX(info);
		else if (nx == CopyTgt_oper_wk_cost_flg) doCopyTgt_oper_wk_cost_flg_NX(info);
		else if (nx == CopyTgt_itm_insp_ptn_flg) doCopyTgt_itm_insp_ptn_flg_NX(info);
		else if (nx == CopyTgt_itm_insp_flg) doCopyTgt_itm_insp_flg_NX(info);
		else if (nx == CopyTgt_insp_spec_flg) doCopyTgt_insp_spec_flg_NX(info);
		else if (nx == CopyTgt_itm_site_flg) doCopyTgt_itm_site_flg_NX(info);
		else if (nx == CopyTgt_mps_itm_flg) doCopyTgt_mps_itm_flg_NX(info);
		else if (nx == CopyTgt_spln_itm_conf_flg) doCopyTgt_spln_itm_conf_flg_NX(info);
		else if (nx == CopyTgt_purc_ddlv_lt_flg) doCopyTgt_purc_ddlv_lt_flg_NX(info);
		else if (nx == CopyTgt_bp_itm_flg) doCopyTgt_bp_itm_flg_NX(info);
		else if (nx == CopyTgt_set_itm_main_flg) doCopyTgt_set_itm_main_flg_NX(info);
		else if (nx == CopyTgt_ctg_config_flg) doCopyTgt_ctg_config_flg_NX(info);
		else if (nx == CopyTgt_itm_ver_flg) doCopyTgt_itm_ver_flg_NX(info);
		else if (nx == CopyTgt_coef_config_flg) doCopyTgt_coef_config_flg_NX(info);
		else if (nx == CopyTgt_alc_inpt_flg) doCopyTgt_alc_inpt_flg_NX(info);
		else if (nx == CopyTgt_cost_itm_out_flg) doCopyTgt_cost_itm_out_flg_NX(info);
		else if (nx == CopyTgt_xpns_purc_alc_flg) doCopyTgt_xpns_purc_alc_flg_NX(info);
		else if (nx == CopyTgt_lot_inh_dest_flg) doCopyTgt_lot_inh_dest_flg_NX(info);
		else if (nx == CopyTgt_itm_spec_flg) doCopyTgt_itm_spec_flg_NX(info);
		else if (nx == CopyTgt_itm_spec_desc_flg) doCopyTgt_itm_spec_desc_flg_NX(info);
		else if (nx == CopyTgt_itm_comp_core_flg) doCopyTgt_itm_comp_core_flg_NX(info);
		else if (nx == CopyTgt_attach_info_flg) doCopyTgt_attach_info_flg_NX(info);
		else if (nx == CopyTgt_itm_not_fix_flg) doCopyTgt_itm_not_fix_flg_NX(info);
		else if (nx == CopyTgt_sundry_itm_flg) doCopyTgt_sundry_itm_flg_NX(info);
		else if (nx == CopyTgt_alt_itm_flg) doCopyTgt_alt_itm_flg_NX(info);
		else if (nx == CopyTgt_bom_chd_flg) doCopyTgt_bom_chd_flg_NX(info);
		else if (nx == CopyTgt_proc_upri_flg) doCopyTgt_proc_upri_flg_NX(info);
		else if (nx == CopyTgt_prov_upri_flg) doCopyTgt_prov_upri_flg_NX(info);
		else if (nx == CopyTgt_purc_upri_flg) doCopyTgt_purc_upri_flg_NX(info);
		else if (nx == CopyTgt_std_sls_upri_flg) doCopyTgt_std_sls_upri_flg_NX(info);
		else if (nx == CopyTgt_itm_sls_upri_flg) doCopyTgt_itm_sls_upri_flg_NX(info);
		else if (nx == CopyTgt_cst_sls_upri_flg) doCopyTgt_cst_sls_upri_flg_NX(info);
		else if (nx == CopyTgt_set_itm_set_flg) doCopyTgt_set_itm_set_flg_NX(info);
		else if (nx == CopyTgt_alc_expns_flg) doCopyTgt_alc_expns_flg_NX(info);
		else if (nx == CopyTgt_jnl_ptn_flg) doCopyTgt_jnl_ptn_flg_NX(info);
		else if (nx == CopyTgt_lot_inh_src_flg) doCopyTgt_lot_inh_src_flg_NX(info);
		else if (nx == CopyTgt_if_x_flg) doCopyTgt_if_x_flg_NX(info);
		else if (nx == CopyTgt_itm_comp_comp_flg) doCopyTgt_itm_comp_comp_flg_NX(info);
		else if (nx == Btn_ex_on_del_flg) doBtn_ex_on_del_flg_NX(info);
		else if (nx == Btn_ex_past_end_dt) doBtn_ex_past_end_dt_NX(info);
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
	 * [Tgt]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTgt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_no_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[memo1_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_c_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_c_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3_c]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_c_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[dest_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_itm_sub1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_itm_sub1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_itm_sub2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_itm_sub2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_itm_sub3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_itm_sub3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chng_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_unit_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_unit_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_stop_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_stop_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stdcost_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stdcost_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_strg_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_strg_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_lg_grp_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_lg_grp_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_str_ln_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_str_ln_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_rpl_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_rpl_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_wg_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_wg_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_dtl_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_dtl_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_oper_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_oper_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_par_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_par_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_wk_cost_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_wk_cost_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_insp_ptn_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_insp_ptn_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_insp_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_insp_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_spec_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_spec_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_site_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_site_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mps_itm_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mps_itm_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spln_itm_conf_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spln_itm_conf_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_lt_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_lt_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_itm_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_itm_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_itm_main_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_main_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_config_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_config_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_ver_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_ver_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[coef_config_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_coef_config_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_expns_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_expns_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_inpt_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_inpt_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_itm_out_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_itm_out_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xpns_purc_alc_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xpns_purc_alc_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_not_fix_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_not_fix_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_chd_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_chd_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_upri_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_upri_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_sls_upri_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_sls_upri_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sls_upri_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sls_upri_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_sls_upri_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_sls_upri_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_itm_set_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_set_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_dest_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_dest_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_desc_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_desc_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_comp_core_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_comp_core_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_src_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_src_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_x_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_x_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_comp_comp_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_comp_comp_cnt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_unit_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_unit_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_stop_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_stop_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stdcost_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stdcost_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_strg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_strg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_lg_grp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_lg_grp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_str_ln_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_str_ln_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_rpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_rpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_wg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_wg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_dtl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_dtl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_oper_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_oper_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_par_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_par_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_wk_cost_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_wk_cost_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_insp_ptn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_insp_ptn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_insp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_insp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_spec_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_spec_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_site_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_site_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mps_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mps_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spln_itm_conf_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spln_itm_conf_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_lt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_lt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_itm_main_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_main_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_config_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_config_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[coef_config_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_coef_config_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_expns_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_expns_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_itm_out_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_itm_out_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xpns_purc_alc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xpns_purc_alc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_not_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_not_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_chd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_chd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_upri_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_upri_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_sls_upri_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_sls_upri_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sls_upri_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sls_upri_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_sls_upri_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_sls_upri_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_itm_set_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_set_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_dest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_dest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_desc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_desc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_comp_core_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_comp_core_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_src_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_src_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_x_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_x_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_comp_comp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_comp_comp_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_sub_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_sub_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_unit_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_unit_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_stop_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_stop_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[stdcost_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_stdcost_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_strg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_strg_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_lg_grp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_lg_grp_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_str_ln_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_str_ln_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[alloc_ctl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_alloc_ctl_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[stk_rpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_stk_rpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_wg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_wg_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_dtl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_dtl_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_oper_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_oper_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[bom_par_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_bom_par_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[oper_wk_cost_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_oper_wk_cost_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_insp_ptn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_insp_ptn_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_insp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_insp_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[insp_spec_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_insp_spec_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_site_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_site_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[mps_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_mps_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[spln_itm_conf_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_spln_itm_conf_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[purc_ddlv_lt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_purc_ddlv_lt_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[bp_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_bp_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[set_itm_main_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_set_itm_main_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[ctg_config_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_ctg_config_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[coef_config_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_coef_config_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[alc_inpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_alc_inpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[cost_itm_out_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_cost_itm_out_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[xpns_purc_alc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_xpns_purc_alc_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[lot_inh_dest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_lot_inh_dest_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_spec_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_spec_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_spec_desc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_spec_desc_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_comp_core_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_comp_core_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[attach_info_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_attach_info_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_not_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_not_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[alt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_alt_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[bom_chd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_bom_chd_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[proc_upri_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_proc_upri_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[prov_upri_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_prov_upri_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[purc_upri_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_purc_upri_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[std_sls_upri_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_std_sls_upri_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_sls_upri_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_sls_upri_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[cst_sls_upri_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_cst_sls_upri_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[set_itm_set_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_set_itm_set_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[alc_expns_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_alc_expns_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[jnl_ptn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_jnl_ptn_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[lot_inh_src_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_lot_inh_src_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[if_x_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_if_x_flg_NX(MCEventInfo info){
	}

	/**
	 * [CopyTgt]パネルの[itm_comp_comp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCopyTgt_itm_comp_comp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[ex_on_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_ex_on_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[ex_past_end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_ex_past_end_dt_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_chng_no) doCnd_chng_no_LC(info);
		else if (lc == Cnd_memo1_c) doCnd_memo1_c_LC(info);
		else if (lc == Cnd_memo2_c) doCnd_memo2_c_LC(info);
		else if (lc == Cnd_memo3_c) doCnd_memo3_c_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
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
		else if (lc == columnDtl_base_itm_nm) doDtl_base_itm_nm_LC(info);
		else if (lc == columnDtl_itm_typ) doDtl_itm_typ_LC(info);
		else if (lc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_LC(info);
		else if (lc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_dest_itm_cd) doDtl_dest_itm_cd_LC(info);
		else if (lc == columnDtl_dest_itm_sub1) doDtl_dest_itm_sub1_LC(info);
		else if (lc == columnDtl_dest_itm_sub2) doDtl_dest_itm_sub2_LC(info);
		else if (lc == columnDtl_dest_itm_sub3) doDtl_dest_itm_sub3_LC(info);
		else if (lc == columnDtl_dest_itm_nm) doDtl_dest_itm_nm_LC(info);
		else if (lc == columnDtl_chng_no) doDtl_chng_no_LC(info);
		else if (lc == columnDtl_memo1) doDtl_memo1_LC(info);
		else if (lc == columnDtl_memo2) doDtl_memo2_LC(info);
		else if (lc == columnDtl_memo3) doDtl_memo3_LC(info);
		else if (lc == columnDtl_itm_cnt) doDtl_itm_cnt_LC(info);
		else if (lc == columnDtl_itm_sub_cnt) doDtl_itm_sub_cnt_LC(info);
		else if (lc == columnDtl_itm_unit_cnt) doDtl_itm_unit_cnt_LC(info);
		else if (lc == columnDtl_itm_stop_cnt) doDtl_itm_stop_cnt_LC(info);
		else if (lc == columnDtl_stdcost_cnt) doDtl_stdcost_cnt_LC(info);
		else if (lc == columnDtl_itm_strg_cnt) doDtl_itm_strg_cnt_LC(info);
		else if (lc == columnDtl_itm_lg_grp_cnt) doDtl_itm_lg_grp_cnt_LC(info);
		else if (lc == columnDtl_itm_str_ln_cnt) doDtl_itm_str_ln_cnt_LC(info);
		else if (lc == columnDtl_alloc_ctl_cnt) doDtl_alloc_ctl_cnt_LC(info);
		else if (lc == columnDtl_stk_rpl_cnt) doDtl_stk_rpl_cnt_LC(info);
		else if (lc == columnDtl_itm_wg_cnt) doDtl_itm_wg_cnt_LC(info);
		else if (lc == columnDtl_itm_dtl_cnt) doDtl_itm_dtl_cnt_LC(info);
		else if (lc == columnDtl_itm_oper_cnt) doDtl_itm_oper_cnt_LC(info);
		else if (lc == columnDtl_bom_par_cnt) doDtl_bom_par_cnt_LC(info);
		else if (lc == columnDtl_oper_wk_cost_cnt) doDtl_oper_wk_cost_cnt_LC(info);
		else if (lc == columnDtl_itm_insp_ptn_cnt) doDtl_itm_insp_ptn_cnt_LC(info);
		else if (lc == columnDtl_itm_insp_cnt) doDtl_itm_insp_cnt_LC(info);
		else if (lc == columnDtl_insp_spec_cnt) doDtl_insp_spec_cnt_LC(info);
		else if (lc == columnDtl_itm_site_cnt) doDtl_itm_site_cnt_LC(info);
		else if (lc == columnDtl_mps_itm_cnt) doDtl_mps_itm_cnt_LC(info);
		else if (lc == columnDtl_spln_itm_conf_cnt) doDtl_spln_itm_conf_cnt_LC(info);
		else if (lc == columnDtl_purc_ddlv_lt_cnt) doDtl_purc_ddlv_lt_cnt_LC(info);
		else if (lc == columnDtl_bp_itm_cnt) doDtl_bp_itm_cnt_LC(info);
		else if (lc == columnDtl_set_itm_main_cnt) doDtl_set_itm_main_cnt_LC(info);
		else if (lc == columnDtl_ctg_config_cnt) doDtl_ctg_config_cnt_LC(info);
		else if (lc == columnDtl_itm_ver_cnt) doDtl_itm_ver_cnt_LC(info);
		else if (lc == columnDtl_coef_config_cnt) doDtl_coef_config_cnt_LC(info);
		else if (lc == columnDtl_alc_expns_cnt) doDtl_alc_expns_cnt_LC(info);
		else if (lc == columnDtl_alc_inpt_cnt) doDtl_alc_inpt_cnt_LC(info);
		else if (lc == columnDtl_cost_itm_out_cnt) doDtl_cost_itm_out_cnt_LC(info);
		else if (lc == columnDtl_xpns_purc_alc_cnt) doDtl_xpns_purc_alc_cnt_LC(info);
		else if (lc == columnDtl_attach_info_cnt) doDtl_attach_info_cnt_LC(info);
		else if (lc == columnDtl_itm_not_fix_cnt) doDtl_itm_not_fix_cnt_LC(info);
		else if (lc == columnDtl_sundry_itm_cnt) doDtl_sundry_itm_cnt_LC(info);
		else if (lc == columnDtl_alt_itm_cnt) doDtl_alt_itm_cnt_LC(info);
		else if (lc == columnDtl_bom_chd_cnt) doDtl_bom_chd_cnt_LC(info);
		else if (lc == columnDtl_proc_upri_cnt) doDtl_proc_upri_cnt_LC(info);
		else if (lc == columnDtl_prov_upri_cnt) doDtl_prov_upri_cnt_LC(info);
		else if (lc == columnDtl_purc_upri_cnt) doDtl_purc_upri_cnt_LC(info);
		else if (lc == columnDtl_std_sls_upri_cnt) doDtl_std_sls_upri_cnt_LC(info);
		else if (lc == columnDtl_itm_sls_upri_cnt) doDtl_itm_sls_upri_cnt_LC(info);
		else if (lc == columnDtl_cst_sls_upri_cnt) doDtl_cst_sls_upri_cnt_LC(info);
		else if (lc == columnDtl_set_itm_set_cnt) doDtl_set_itm_set_cnt_LC(info);
		else if (lc == columnDtl_jnl_ptn_cnt) doDtl_jnl_ptn_cnt_LC(info);
		else if (lc == columnDtl_lot_inh_dest_cnt) doDtl_lot_inh_dest_cnt_LC(info);
		else if (lc == columnDtl_itm_spec_cnt) doDtl_itm_spec_cnt_LC(info);
		else if (lc == columnDtl_itm_spec_desc_cnt) doDtl_itm_spec_desc_cnt_LC(info);
		else if (lc == columnDtl_itm_comp_core_cnt) doDtl_itm_comp_core_cnt_LC(info);
		else if (lc == columnDtl_lot_inh_src_cnt) doDtl_lot_inh_src_cnt_LC(info);
		else if (lc == columnDtl_if_x_cnt) doDtl_if_x_cnt_LC(info);
		else if (lc == columnDtl_itm_comp_comp_cnt) doDtl_itm_comp_comp_cnt_LC(info);
		else if (lc == Btn_ex_past_end_dt) doBtn_ex_past_end_dt_LC(info);
	}

	/**
	 * [Cnd]パネルの[chng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_c_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_c_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3_c]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_c_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[dest_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_itm_sub1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_itm_sub1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_itm_sub2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_itm_sub2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_itm_sub3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_itm_sub3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chng_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sub_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sub_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_unit_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_unit_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_stop_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_stop_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stdcost_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stdcost_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_strg_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_strg_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_lg_grp_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_lg_grp_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_str_ln_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_str_ln_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_rpl_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_rpl_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_wg_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_wg_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_dtl_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_dtl_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_oper_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_oper_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_par_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_par_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_wk_cost_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_wk_cost_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_insp_ptn_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_insp_ptn_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_insp_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_insp_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[insp_spec_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_insp_spec_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_site_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_site_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mps_itm_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mps_itm_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[spln_itm_conf_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_spln_itm_conf_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_ddlv_lt_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_ddlv_lt_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_itm_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_itm_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_itm_main_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_main_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_config_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_config_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_ver_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_ver_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[coef_config_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_coef_config_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_expns_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_expns_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_inpt_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_inpt_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_itm_out_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_itm_out_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xpns_purc_alc_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xpns_purc_alc_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[attach_info_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_attach_info_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_not_fix_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_not_fix_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_chd_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_chd_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_upri_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_upri_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_upri_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_upri_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_sls_upri_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_sls_upri_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_sls_upri_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_sls_upri_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_sls_upri_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_sls_upri_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_itm_set_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_set_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_dest_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_dest_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_spec_desc_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_spec_desc_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_comp_core_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_comp_core_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_src_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_src_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_x_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_x_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_comp_comp_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_comp_comp_cnt_LC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[ex_past_end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_ex_past_end_dt_LC(MCEventInfo info){
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

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0870.Srch01")) {
			return new MA_MABCL0870_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0870.Srch02")) {
			return new MA_MABCL0870_Srch02Bridge();
		}
		if (id.equals("MA.MABCL0870.Upd01")) {
			return new MA_MABCL0870_Upd01Bridge();
		}
		if (id.equals("MA.MABCL0870.Del01")) {
			return new MA_MABCL0870_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0870_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0870_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0870_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0870_Srch01Bridge() {
			p_MA_MABCL0870_Srch01 = new MCParam(PDef.MA_MABCL0870_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0870_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0870.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0870.DtlR.class));

			p_MA_MABCL0870_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0870_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0870_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0870_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0870_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0870.CndR up0() {
			return (mcframe.clientMABC.MABCP0870.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0870.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0870.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL0870_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0870.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0870_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0870.DtlR>)p_MA_MABCL0870_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABCL0870_Srch02]の定型処理のInnerClass
	 */
	protected class MA_MABCL0870_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0870_Srch02;

		/** コンストラクタ */
		protected MA_MABCL0870_Srch02Bridge() {
			p_MA_MABCL0870_Srch02 = new MCParam(PDef.MA_MABCL0870_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0870_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0870.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0870.DtlR.class));

			p_MA_MABCL0870_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0870_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0870_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0870_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0870_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0870.CndR up0() {
			return (mcframe.clientMABC.MABCP0870.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0870.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0870.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL0870_Srch02.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0870.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0870_Srch02;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0870.DtlR>)p_MA_MABCL0870_Srch02.getContainerParam().getDownBlock(0));
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
	 * [MA_MABCL0870_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0870_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0870_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0870_Upd01Bridge() {
			p_MA_MABCL0870_Upd01 = new MCParam(PDef.MA_MABCL0870_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0870_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0870.DtlR.class));
			param.addUpBlock(mcframe.clientMABC.MABCP0870.BtnR.create());
			// Down

			p_MA_MABCL0870_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0870_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0870_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABCL0870_Upd01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0870_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0870_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0870.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0870.DtlR>)up(0);
		}
		protected mcframe.clientMABC.MABCP0870.BtnR up1() {
			return (mcframe.clientMABC.MABCP0870.BtnR)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0870_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getBtnR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MA_MABCL0870_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0870_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0870_Del01;

		/** コンストラクタ */
		protected MA_MABCL0870_Del01Bridge() {
			p_MA_MABCL0870_Del01 = new MCParam(PDef.MA_MABCL0870_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0870_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0870.DtlR.class));
			// Down

			p_MA_MABCL0870_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0870_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0870_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0870_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0870_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0870.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0870.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0870_Del01;
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
}