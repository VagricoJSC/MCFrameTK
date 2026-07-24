package mcframe.clientMABS.MABSP0030;

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
import mcframe.clientMABS.MABSP0030.MABSP_BomLst_MC.MA_MABSL0030_Srch01Caller;
import mcframe.clientMABS.MABSP0030.MABSP_BomLst_MC.MA_MABSL0030_Upd01Caller;
import mcframe.clientMABS.MABSP0030.MABSP_BomLst_MC.MA_MABSL0030_Del01Caller;

/**
 * 画面"MABSP_BomLst"パネルクラスです。<p>
 *
 * ＢＯＭマスタの検索、更新、削除を一括で行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSP_BomLst_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SUBMODULE_ID = "MABS";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABSP0030";

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
	// [CndTab]ブロック関連のField定義
	public MCPanel CndTabPanel = null;
	public MCTabbedPane CndTabTab = null;
	// [CndTab]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;CHNG,Change,5;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;CHNG,切り替える,5;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_CHNG = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * Common 共通.<p>
	 *
	 */
	public MCCheckBox Cnd_cmn_flg = null;
	/**
	 * WG ＷＧ.<p>
	 *
	 */
	public MCCheckBox Cnd_wg_flg = null;
	public mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H Cnd_dt_PPanel;
	public MCDateField Cnd_st_dt_fr;	// [Cnd]の[dt.st_dt_fr]を[Cnd_st_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_st_dt_to;	// [Cnd]の[dt.st_dt_to]を[Cnd_st_dt_to]としてエイリアス定義。
	public MCDateField Cnd_end_dt_fr;	// [Cnd]の[dt.end_dt_fr]を[Cnd_end_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_end_dt_to;	// [Cnd]の[dt.end_dt_to]を[Cnd_end_dt_to]としてエイリアス定義。
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
	public MCLabel Cnd_chng_no_Label = null;
	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_chng_no = null;
	public MCLabel Cnd_ext_sys_no_bom_Label = null;
	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ext_sys_no_bom = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_par_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_par_itm_typ;	// [Cnd]の[par_itm_typ_p.itm_typ]を[Cnd_par_itm_typ]としてエイリアス定義。
	public MCTextField Cnd_par_itm_typ_nm;	// [Cnd]の[par_itm_typ_p.itm_typ_nm]を[Cnd_par_itm_typ_nm]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_typ_d_cd;	// [Cnd]の[par_itm_typ_p.itm_typ_d_cd]を[Cnd_par_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_par_itm_typ_d_nm;	// [Cnd]の[par_itm_typ_p.itm_typ_d_nm]を[Cnd_par_itm_typ_d_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_par_itm_p_PPanel;
	public MCTextField Cnd_par_itm_cd;	// [Cnd]の[par_itm_p.itm_cd]を[Cnd_par_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub1;	// [Cnd]の[par_itm_p.itm_sub1]を[Cnd_par_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub2;	// [Cnd]の[par_itm_p.itm_sub2]を[Cnd_par_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub3;	// [Cnd]の[par_itm_p.itm_sub3]を[Cnd_par_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_par_itm_nm;	// [Cnd]の[par_itm_p.itm_nm]を[Cnd_par_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_chd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_chd_itm_typ;	// [Cnd]の[chd_itm_typ_p.itm_typ]を[Cnd_chd_itm_typ]としてエイリアス定義。
	public MCTextField Cnd_chd_itm_typ_nm;	// [Cnd]の[chd_itm_typ_p.itm_typ_nm]を[Cnd_chd_itm_typ_nm]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_typ_d_cd;	// [Cnd]の[chd_itm_typ_p.itm_typ_d_cd]を[Cnd_chd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_chd_itm_typ_d_nm;	// [Cnd]の[chd_itm_typ_p.itm_typ_d_nm]を[Cnd_chd_itm_typ_d_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_chd_itm_p_PPanel;
	public MCTextField Cnd_chd_itm_cd;	// [Cnd]の[chd_itm_p.itm_cd]を[Cnd_chd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_sub1;	// [Cnd]の[chd_itm_p.itm_sub1]を[Cnd_chd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_sub2;	// [Cnd]の[chd_itm_p.itm_sub2]を[Cnd_chd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_chd_itm_sub3;	// [Cnd]の[chd_itm_p.itm_sub3]を[Cnd_chd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_chd_itm_nm;	// [Cnd]の[chd_itm_p.itm_nm]を[Cnd_chd_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H Cnd_ver_no_p_PPanel;
	public MCTextComboBox Cnd_ver_no;	// [Cnd]の[ver_no_p.ver_no]を[Cnd_ver_no]としてエイリアス定義。
	public MCLabel Cnd_alt_grp_cd_Label = null;
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_alt_grp_cd = null;
	public MCLabel Cnd_oper_cd_Label = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCTextField Cnd_oper_nm = null;
	public MCLabel Cnd_bom_ptn_Label = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCTextField Cnd_bom_ptn = null;
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
	public MCLabel Cnd_par_itm_grp_cd1_Label = null;
	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd1 = null;
	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm1 = null;
	public MCLabel Cnd_par_itm_grp_cd2_Label = null;
	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd2 = null;
	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm2 = null;
	public MCLabel Cnd_par_itm_grp_cd3_Label = null;
	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd3 = null;
	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm3 = null;
	public MCLabel Cnd_par_itm_grp_cd4_Label = null;
	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd4 = null;
	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm4 = null;
	public MCLabel Cnd_par_itm_grp_cd5_Label = null;
	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd5 = null;
	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm5 = null;
	public MCLabel Cnd_par_itm_grp_cd6_Label = null;
	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd6 = null;
	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm6 = null;
	public MCLabel Cnd_par_itm_grp_cd7_Label = null;
	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd7 = null;
	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm7 = null;
	public MCLabel Cnd_par_itm_grp_cd8_Label = null;
	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd8 = null;
	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm8 = null;
	public MCLabel Cnd_par_itm_grp_cd9_Label = null;
	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd9 = null;
	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm9 = null;
	public MCLabel Cnd_par_itm_grp_cd10_Label = null;
	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_par_itm_grp_cd10 = null;
	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_par_itm_grp_nm10 = null;
	public MCLabel Cnd_chd_itm_grp_cd1_Label = null;
	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_chd_itm_grp_cd1 = null;
	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public MCTextField Cnd_chd_itm_grp_nm1 = null;
	public MCLabel Cnd_chd_itm_grp_cd2_Label = null;
	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_chd_itm_grp_cd2 = null;
	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public MCTextField Cnd_chd_itm_grp_nm2 = null;
	public MCLabel Cnd_chd_itm_grp_cd3_Label = null;
	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_chd_itm_grp_cd3 = null;
	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public MCTextField Cnd_chd_itm_grp_nm3 = null;
	public MCLabel Cnd_chd_itm_grp_cd4_Label = null;
	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_chd_itm_grp_cd4 = null;
	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public MCTextField Cnd_chd_itm_grp_nm4 = null;
	public MCLabel Cnd_chd_itm_grp_cd5_Label = null;
	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_chd_itm_grp_cd5 = null;
	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public MCTextField Cnd_chd_itm_grp_nm5 = null;
	public MCLabel Cnd_chd_itm_grp_cd6_Label = null;
	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_chd_itm_grp_cd6 = null;
	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public MCTextField Cnd_chd_itm_grp_nm6 = null;
	public MCLabel Cnd_chd_itm_grp_cd7_Label = null;
	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_chd_itm_grp_cd7 = null;
	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public MCTextField Cnd_chd_itm_grp_nm7 = null;
	public MCLabel Cnd_chd_itm_grp_cd8_Label = null;
	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_chd_itm_grp_cd8 = null;
	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public MCTextField Cnd_chd_itm_grp_nm8 = null;
	public MCLabel Cnd_chd_itm_grp_cd9_Label = null;
	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_chd_itm_grp_cd9 = null;
	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public MCTextField Cnd_chd_itm_grp_nm9 = null;
	public MCLabel Cnd_chd_itm_grp_cd10_Label = null;
	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_chd_itm_grp_cd10 = null;
	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_chd_itm_grp_nm10 = null;
	public MCLabel Cnd_bom_chng_typ_Label = null;
	/**
	 * BOM switching type ＢＯＭ切替区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_bom_chng_typ = null;
	/**
	 * BOM switching type name ＢＯＭ切替区分名.<p>
	 *
	 */
	public MCTextField Cnd_bom_chng_typ_nm = null;
	public MCLabel Cnd_chng_st_dt_Label = null;
	/**
	 * Change start date 切替開始日.<p>
	 *
	 */
	public MCDateField Cnd_chng_st_dt = null;
	public MCLabel Cnd_chng_end_dt_Label = null;
	/**
	 * End date after change 切替後終了日.<p>
	 *
	 */
	public MCDateField Cnd_chng_end_dt = null;
	public MCLabel Cnd_chng_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_chng_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_chng_wg_nm = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_old_itm_p_PPanel;
	public MCTextField Cnd_old_itm_cd;	// [Cnd]の[old_itm_p.itm_cd]を[Cnd_old_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_old_itm_sub1;	// [Cnd]の[old_itm_p.itm_sub1]を[Cnd_old_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_old_itm_sub2;	// [Cnd]の[old_itm_p.itm_sub2]を[Cnd_old_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_old_itm_sub3;	// [Cnd]の[old_itm_p.itm_sub3]を[Cnd_old_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_old_itm_nm;	// [Cnd]の[old_itm_p.itm_nm]を[Cnd_old_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H Cnd_old_ver_no_p_PPanel;
	public MCTextComboBox Cnd_old_ver_no;	// [Cnd]の[old_ver_no_p.ver_no]を[Cnd_old_ver_no]としてエイリアス定義。
	public MCLabel Cnd_old_alt_itm_ratio_Label = null;
	/**
	 * Old alternative item ratio 旧代替品目比率.<p>
	 *
	 */
	public MCNumberField Cnd_old_alt_itm_ratio = null;
	public MCLabel Cnd_old_alt_alloc_prio_Label = null;
	/**
	 * Old allocation priority 旧引当優先順.<p>
	 *
	 */
	public MCNumberField Cnd_old_alt_alloc_prio = null;
	public MCLabel Cnd_old_stk_mng_typ_Label = null;
	/**
	 * Old inventory management type 旧在庫管理区分.<p>
	 *
	 */
	public MCTextField Cnd_old_stk_mng_typ = null;
	/**
	 * Old inventory management type name 旧在庫管理区分名.<p>
	 *
	 */
	public MCTextField Cnd_old_stk_mng_typ_nm = null;
	public MCLabel Cnd_old_asset_mng_typ_Label = null;
	/**
	 * Old asset management type 旧資産管理区分.<p>
	 *
	 */
	public MCTextField Cnd_old_asset_mng_typ = null;
	/**
	 * Old asset management type name 旧資産管理区分名.<p>
	 *
	 */
	public MCTextField Cnd_old_asset_mng_typ_nm = null;
	public MCLabel Cnd_old_alt_grp_cd_Label = null;
	/**
	 * Old alternative group cd. 旧代替グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_old_alt_grp_cd = null;
	/**
	 * Old alternative group name 旧代替グループ名.<p>
	 *
	 */
	public MCTextField Cnd_old_alt_grp_nm = null;
	public MCLabel Cnd_old_alt_itm_typ_Label = null;
	/**
	 * Old alternative item selection type 旧代替品目選択区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_old_alt_itm_typ = null;
	/**
	 * Old alternative item selection type name 旧代替品目選択区分名.<p>
	 *
	 */
	public MCTextField Cnd_old_alt_itm_typ_nm = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_new_itm_p_PPanel;
	public MCTextField Cnd_new_itm_cd;	// [Cnd]の[new_itm_p.itm_cd]を[Cnd_new_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_new_itm_sub1;	// [Cnd]の[new_itm_p.itm_sub1]を[Cnd_new_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_new_itm_sub2;	// [Cnd]の[new_itm_p.itm_sub2]を[Cnd_new_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_new_itm_sub3;	// [Cnd]の[new_itm_p.itm_sub3]を[Cnd_new_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_new_itm_nm;	// [Cnd]の[new_itm_p.itm_nm]を[Cnd_new_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H Cnd_new_ver_no_p_PPanel;
	public MCTextComboBox Cnd_new_ver_no;	// [Cnd]の[new_ver_no_p.ver_no]を[Cnd_new_ver_no]としてエイリアス定義。
	public MCLabel Cnd_new_alt_itm_ratio_Label = null;
	/**
	 * New alternative item ratio 新代替品目比率.<p>
	 *
	 */
	public MCNumberField Cnd_new_alt_itm_ratio = null;
	public MCLabel Cnd_new_alt_alloc_prio_Label = null;
	/**
	 * New allocation priority 新引当優先順.<p>
	 *
	 */
	public MCNumberField Cnd_new_alt_alloc_prio = null;
	public MCLabel Cnd_new_stk_mng_typ_Label = null;
	/**
	 * New inventory management type 新在庫管理区分.<p>
	 *
	 */
	public MCTextField Cnd_new_stk_mng_typ = null;
	/**
	 * New inventory management type name 新在庫管理区分名.<p>
	 *
	 */
	public MCTextField Cnd_new_stk_mng_typ_nm = null;
	public MCLabel Cnd_new_asset_mng_typ_Label = null;
	/**
	 * New asset management type 新資産管理区分.<p>
	 *
	 */
	public MCTextField Cnd_new_asset_mng_typ = null;
	/**
	 * New asset management type name 新資産管理区分名.<p>
	 *
	 */
	public MCTextField Cnd_new_asset_mng_typ_nm = null;
	public MCLabel Cnd_new_alt_grp_cd_Label = null;
	/**
	 * New alternative group cd. 新代替グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_new_alt_grp_cd = null;
	/**
	 * New alternative group name 新代替グループ名.<p>
	 *
	 */
	public MCTextField Cnd_new_alt_grp_nm = null;
	public MCLabel Cnd_new_alt_itm_typ_Label = null;
	/**
	 * New alternative item selection type 新代替品目選択区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_new_alt_itm_typ = null;
	/**
	 * New alternative item selection type name 新代替品目選択区分名.<p>
	 *
	 */
	public MCTextField Cnd_new_alt_itm_typ_nm = null;
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [Tab4]ブロック関連のField定義
	public MCPanel Tab4Panel = null;
	// [Tab4]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [RPnl]ブロック関連のField定義
	public MCPanel RPnlPanel = null;
	// [RPnl]ブロックの項目のField定義
	/**
	 * Search (Common) 検索する（共通）.<p>
	 *
	 */
	public MCButton RPnl_srch_cmn = null;
	/**
	 * Search (WG) 検索する（ＷＧ）.<p>
	 *
	 */
	public MCButton RPnl_srch_wg = null;
	// [BulkSet]ブロック関連のField定義
	public MCPanel BulkSetPanel = null;
	// [BulkSet]ブロックの項目のField定義
	public MCLabel BulkSet_st_dt_Label = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDateField BulkSet_st_dt = null;
	public MCLabel BulkSet_end_dt_Label = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDateField BulkSet_end_dt = null;
	/**
	 * Applied date update 適用日反映.<p>
	 *
	 */
	public MCButton BulkSet_upd_dt = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0030.DtlR> DtlTable = null;
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
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_par_itm_p_PPanel;
	public MCColumnConfig columnDtl_par_itm_cd;// [Dtl]の[par_itm_p.itm_cd]を[columnDtl_par_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_sub1;// [Dtl]の[par_itm_p.itm_sub1]を[columnDtl_par_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_sub2;// [Dtl]の[par_itm_p.itm_sub2]を[columnDtl_par_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_sub3;// [Dtl]の[par_itm_p.itm_sub3]を[columnDtl_par_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_nm;// [Dtl]の[par_itm_p.itm_nm]を[columnDtl_par_itm_nm]としてエイリアス定義。
	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_itm_typ = null;
	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_itm_typ_nm = null;
	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_itm_typ_d_cd = null;
	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_itm_typ_d_nm = null;
	/**
	 * SEIBAN No. 1 management type (Parent) 手配ＮＯ１管理区分（親）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type (Parent) 手配ＮＯ２管理区分（親）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type (Parent) 手配ＮＯ３管理区分（親）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type (Parent) 手配ＮＯ４管理区分（親）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_sno4_mng_typ = null;
	/**
	 * BOM pattern (Parent) 構成パタン（親）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_def_bom_ptn = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bom_ptn = null;
	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_cd = null;
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_nm = null;
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_seq = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_disp_seq = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_chd_itm_p_PPanel;
	public MCColumnConfig columnDtl_chd_itm_cd;// [Dtl]の[chd_itm_p.itm_cd]を[columnDtl_chd_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_sub1;// [Dtl]の[chd_itm_p.itm_sub1]を[columnDtl_chd_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_sub2;// [Dtl]の[chd_itm_p.itm_sub2]を[columnDtl_chd_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_sub3;// [Dtl]の[chd_itm_p.itm_sub3]を[columnDtl_chd_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_nm;// [Dtl]の[chd_itm_p.itm_nm]を[columnDtl_chd_itm_nm]としてエイリアス定義。
	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_itm_typ = null;
	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_itm_typ_nm = null;
	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_itm_typ_d_cd = null;
	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_itm_typ_d_nm = null;
	/**
	 * Inventory management type (Child) 在庫管理区分（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_stk_mng_typ = null;
	/**
	 * Asset management type (Child) 資産管理区分（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_asset_mng_typ = null;
	/**
	 * Number of decimal places (Parent) 小数部有効桁数（親）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_dec_place = null;
	/**
	 * Number of decimal places (Child) 小数部有効桁数（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_dec_place = null;
	/**
	 * Lot No. management type (Child) ロット管理区分（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_mng_typ = null;
	/**
	 * Sublot management type (Child) サブロット管理区分（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_mng_typ = null;
	/**
	 * SEIBAN No. 1 management type (Child) 手配ＮＯ１管理区分（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type (Child) 手配ＮＯ２管理区分（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type (Child) 手配ＮＯ３管理区分（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type (Child) 手配ＮＯ４管理区分（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_sno4_mng_typ = null;
	/**
	 * BOM pattern (Child) 構成パタン（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_def_bom_ptn = null;
	/**
	 * For version control (Child) 版管理対象（子）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ver_flg = null;
	/**
	 * By-product 副産品.<p>
	 *
	 */
	public MCColumnConfig columnDtl_byprod_flg = null;
	/**
	 * Phantom 架空.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ph_flg = null;
	/**
	 * Phantom BOM pattern 架空構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ph_bom_ptn = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Dtl_ver_no_p_PPanel;
	public MCColumnConfig columnDtl_ver_no;// [Dtl]の[ver_no_p.ver_no]を[columnDtl_ver_no]としてエイリアス定義。
	/**
	 * Alternative item 代替品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alt_itm_flg = null;
	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alt_grp_cd = null;
	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alt_grp_nm = null;
	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alt_itm_typ = null;
	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alt_itm_typ_nm = null;
	/**
	 * Alternative item ratio 代替品目比率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alt_itm_ratio = null;
	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alt_alloc_prio = null;
	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno_typ1 = null;
	/**
	 * SEIBAN No. 1 type name 手配ＮＯ１区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno_typ_nm1 = null;
	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno_typ2 = null;
	/**
	 * SEIBAN No. 2 type name 手配ＮＯ２区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno_typ_nm2 = null;
	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno_typ3 = null;
	/**
	 * SEIBAN No. 3 type name 手配ＮＯ３区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno_typ_nm3 = null;
	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno_typ4 = null;
	/**
	 * SEIBAN No. 4 type name 手配ＮＯ４区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno_typ_nm4 = null;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Dtl_min_sno_p_PPanel;
	public MCColumnConfig columnDtl_min_sno1;// [Dtl]の[min_sno_p.sno1]を[columnDtl_min_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_min_sno2;// [Dtl]の[min_sno_p.sno2]を[columnDtl_min_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_min_sno3;// [Dtl]の[min_sno_p.sno3]を[columnDtl_min_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_min_sno4;// [Dtl]の[min_sno_p.sno4]を[columnDtl_min_sno4]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Dtl_max_sno_p_PPanel;
	public MCColumnConfig columnDtl_max_sno1;// [Dtl]の[max_sno_p.sno1]を[columnDtl_max_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_max_sno2;// [Dtl]の[max_sno_p.sno2]を[columnDtl_max_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_max_sno3;// [Dtl]の[max_sno_p.sno3]を[columnDtl_max_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_max_sno4;// [Dtl]の[max_sno_p.sno4]を[columnDtl_max_sno4]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Dtl_dt_p_PPanel;
	public MCColumnConfig columnDtl_st_dt;// [Dtl]の[dt_p.st_dt]を[columnDtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_end_dt;// [Dtl]の[dt_p.end_dt]を[columnDtl_end_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_qty1_p_PPanel;
	public MCColumnConfig columnDtl_par_inst_qty;// [Dtl]の[qty1_p.qty]を[columnDtl_par_inst_qty]としてエイリアス定義。
	/**
	 * Parent base unit cd. 親基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_base_unit_cd = null;
	/**
	 * Parent base unit name 親基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_par_base_unit_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_qty3_p_PPanel;
	public MCColumnConfig columnDtl_chd_inpt_qty;// [Dtl]の[qty3_p.qty]を[columnDtl_chd_inpt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_qty2_p_PPanel;
	public MCColumnConfig columnDtl_chd_rqmt_qty;// [Dtl]の[qty2_p.qty]を[columnDtl_chd_rqmt_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_qty4_p_PPanel;
	public MCColumnConfig columnDtl_fxd_chd_rqmt_qty;// [Dtl]の[qty4_p.qty]を[columnDtl_fxd_chd_rqmt_qty]としてエイリアス定義。
	/**
	 * Child base unit cd. 子基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_base_unit_cd = null;
	/**
	 * Child base unit name 子基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_base_unit_nm = null;
	/**
	 * Input offset type 投入オフセット区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_offst_typ = null;
	/**
	 * Input offset type name 投入オフセット区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_offst_typ_nm = null;
	/**
	 * Input offset 投入オフセット.<p>
	 *
	 */
	public MCColumnConfig columnDtl_in_offst = null;
	/**
	 * Backflush type バックフラッシュ区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bkf_typ = null;
	/**
	 * Backflush type name バックフラッシュ区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bkf_typ_nm = null;
	/**
	 * Require lot 指図時ロット指定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inst_lot_fix_flg = null;
	/**
	 * Lot mixed ロット混在.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_mix_flg = null;
	/**
	 * Sublots mixed サブロット混在.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_mix_flg = null;
	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alloc_ctl_typ = null;
	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alloc_ctl_typ_nm = null;
	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_main_itm_flg = null;
	/**
	 * For yield calculation 収率計算用.<p>
	 *
	 */
	public MCColumnConfig columnDtl_yield_calc_flg = null;
	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inpt_ctl_typ = null;
	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inpt_ctl_typ_nm = null;
	/**
	 * Change No. 変更ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chng_no = null;
	/**
	 * External system No. 外部システムＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_no_bom = null;
	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_not_cost_flg = null;
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
	 * BOM key ＢＯＭキー.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bom_key = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_ts = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * BOM master entry ＢＯＭマスタ登録.<p>
	 *
	 */
	public MCButton Btn_open_MABSP0020 = null;
	/**
	 * BOM list (Explosion) ＢＯＭ一覧照会（展開）.<p>
	 *
	 */
	public MCButton Btn_open_MABSP0040 = null;
	/**
	 * Alternative item master entry 代替品目マスタ登録.<p>
	 *
	 */
	public MCButton Btn_open_MABSP0080 = null;
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
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [CHNG]モードを表す定数 */
	public static final String CHNG = "CHNG";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX, DEL, REF, CHNG};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABSL0030_Srch01]のCallerの作成 */
	protected MABSP_BomLst_MC.MA_MABSL0030_Srch01Caller createMA_MABSL0030_Srch01() {
		MABSP_BomLst_MC.MA_MABSL0030_Srch01Caller<MABSP_BomLst, MA_MABSL0030_Srch01Bridge>
		caller = ((MABSP_BomLst_MC)this).new MA_MABSL0030_Srch01Caller<MABSP_BomLst, MA_MABSL0030_Srch01Bridge>(
					(MABSP_BomLst)this, new MA_MABSL0030_Srch01Bridge());
		return caller;
	}
	/** [MA_MABSL0030_Srch01]の呼び出し */
	protected void callMA_MABSL0030_Srch01() {
		MCCaller caller = createMA_MABSL0030_Srch01();
		caller.exec();
	}
	/** [MA_MABSL0030_Upd01]のCallerの作成 */
	protected MABSP_BomLst_MC.MA_MABSL0030_Upd01Caller createMA_MABSL0030_Upd01() {
		MABSP_BomLst_MC.MA_MABSL0030_Upd01Caller<MABSP_BomLst, MA_MABSL0030_Upd01Bridge>
		caller = ((MABSP_BomLst_MC)this).new MA_MABSL0030_Upd01Caller<MABSP_BomLst, MA_MABSL0030_Upd01Bridge>(
					(MABSP_BomLst)this, new MA_MABSL0030_Upd01Bridge());
		return caller;
	}
	/** [MA_MABSL0030_Upd01]の呼び出し */
	protected void callMA_MABSL0030_Upd01() {
		MCCaller caller = createMA_MABSL0030_Upd01();
		caller.exec();
	}
	/** [MA_MABSL0030_Del01]のCallerの作成 */
	protected MABSP_BomLst_MC.MA_MABSL0030_Del01Caller createMA_MABSL0030_Del01() {
		MABSP_BomLst_MC.MA_MABSL0030_Del01Caller<MABSP_BomLst, MA_MABSL0030_Del01Bridge>
		caller = ((MABSP_BomLst_MC)this).new MA_MABSL0030_Del01Caller<MABSP_BomLst, MA_MABSL0030_Del01Bridge>(
					(MABSP_BomLst)this, new MA_MABSL0030_Del01Bridge());
		return caller;
	}
	/** [MA_MABSL0030_Del01]の呼び出し */
	protected void callMA_MABSL0030_Del01() {
		MCCaller caller = createMA_MABSL0030_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP0030.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP0030.BulkSetR aBulkSetR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0030.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABS.MABSP0030.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP0030.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP0030.CndR createCndR() {
		return mcframe.clientMABS.MABSP0030.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMABS.MABSP0030.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABS.MABSP0030.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABS.MABSP0030.BulkSetR createBulkSetR() {
		return mcframe.clientMABS.MABSP0030.BulkSetR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABS.MABSP0030.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0030.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABS.MABSP0030.DtlR createDtlR() {
		return mcframe.clientMABS.MABSP0030.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0030.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0030.DtlR.class);
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
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getBulkSetR())) ret.add(getBulkSetR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
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
		if(aCnt == getBulkSetR()) return "BulkSet";
		if(aCnt == getDtlL()) return "Dtl";
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
		if(bId.equals("BulkSet")) return getBulkSetR();
		if(bId.equals("Dtl")) return getDtlL();
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
		ret.add(CndTabPanel);
		ret.add(CndPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(Tab4Panel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(BulkSetPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_BomLst_MC_A() {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABSP_BomLst_MC_A(String name) {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABSP_BomLst_MC.jbCreateScreenOpe((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbCreateRegTarget((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbCreateTop((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbCreateFold((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbCreateCndTab((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbCreateCnd((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbCreateTab1((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbCreateTab2((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbCreateTab3((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbCreateTab4((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbCreateCtrl((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbCreateRPnl((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbCreateBulkSet((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbCreateDtl((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbCreateBtn((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbCreateEastBtn((MABSP_BomLst)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABSP_BomLst p) {
	}

	/**
	 * [RegTarget]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRegTarget(MABSP_BomLst p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABSP_BomLst p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABSP_BomLst p) {
	}

	/**
	 * [CndTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCndTab(MABSP_BomLst p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABSP_BomLst p) {
		p.Cnd_dt_PPanel = mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.create(p.getCndR().dt());
		p.Cnd_dt_PPanel.setName("Cnd.dt");
		p.Cnd_st_dt_fr = p.Cnd_dt_PPanel.StEndDt_st_dt_fr;
		p.Cnd_st_dt_fr.addAliasName("Cnd.st_dt_fr", p);
		p.Cnd_st_dt_to = p.Cnd_dt_PPanel.StEndDt_st_dt_to;
		p.Cnd_st_dt_to.addAliasName("Cnd.st_dt_to", p);
		p.Cnd_end_dt_fr = p.Cnd_dt_PPanel.StEndDt_end_dt_fr;
		p.Cnd_end_dt_fr.addAliasName("Cnd.end_dt_fr", p);
		p.Cnd_end_dt_to = p.Cnd_dt_PPanel.StEndDt_end_dt_to;
		p.Cnd_end_dt_to.addAliasName("Cnd.end_dt_to", p);
		p.Cnd_par_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().par_itm_typ_p());
		p.Cnd_par_itm_typ_p_PPanel.setName("Cnd.par_itm_typ_p");
		p.Cnd_par_itm_typ = p.Cnd_par_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_par_itm_typ.addAliasName("Cnd.par_itm_typ", p);
		p.Cnd_par_itm_typ_nm = p.Cnd_par_itm_typ_p_PPanel.ItmTyp_itm_typ_nm;
		p.Cnd_par_itm_typ_nm.addAliasName("Cnd.par_itm_typ_nm", p);
		p.Cnd_par_itm_typ_d_cd = p.Cnd_par_itm_typ_p_PPanel.ItmTyp_itm_typ_d_cd;
		p.Cnd_par_itm_typ_d_cd.addAliasName("Cnd.par_itm_typ_d_cd", p);
		p.Cnd_par_itm_typ_d_nm = p.Cnd_par_itm_typ_p_PPanel.ItmTyp_itm_typ_d_nm;
		p.Cnd_par_itm_typ_d_nm.addAliasName("Cnd.par_itm_typ_d_nm", p);
		p.Cnd_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().par_itm_p());
		p.Cnd_par_itm_p_PPanel.setName("Cnd.par_itm_p");
		p.Cnd_par_itm_cd = p.Cnd_par_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_par_itm_cd.addAliasName("Cnd.par_itm_cd", p);
		p.Cnd_par_itm_sub1 = p.Cnd_par_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_par_itm_sub1.addAliasName("Cnd.par_itm_sub1", p);
		p.Cnd_par_itm_sub2 = p.Cnd_par_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_par_itm_sub2.addAliasName("Cnd.par_itm_sub2", p);
		p.Cnd_par_itm_sub3 = p.Cnd_par_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_par_itm_sub3.addAliasName("Cnd.par_itm_sub3", p);
		p.Cnd_par_itm_nm = p.Cnd_par_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_par_itm_nm.addAliasName("Cnd.par_itm_nm", p);
		p.Cnd_chd_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().chd_itm_typ_p());
		p.Cnd_chd_itm_typ_p_PPanel.setName("Cnd.chd_itm_typ_p");
		p.Cnd_chd_itm_typ = p.Cnd_chd_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_chd_itm_typ.addAliasName("Cnd.chd_itm_typ", p);
		p.Cnd_chd_itm_typ_nm = p.Cnd_chd_itm_typ_p_PPanel.ItmTyp_itm_typ_nm;
		p.Cnd_chd_itm_typ_nm.addAliasName("Cnd.chd_itm_typ_nm", p);
		p.Cnd_chd_itm_typ_d_cd = p.Cnd_chd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_cd;
		p.Cnd_chd_itm_typ_d_cd.addAliasName("Cnd.chd_itm_typ_d_cd", p);
		p.Cnd_chd_itm_typ_d_nm = p.Cnd_chd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_nm;
		p.Cnd_chd_itm_typ_d_nm.addAliasName("Cnd.chd_itm_typ_d_nm", p);
		p.Cnd_chd_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().chd_itm_p());
		p.Cnd_chd_itm_p_PPanel.setName("Cnd.chd_itm_p");
		p.Cnd_chd_itm_cd = p.Cnd_chd_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_chd_itm_cd.addAliasName("Cnd.chd_itm_cd", p);
		p.Cnd_chd_itm_sub1 = p.Cnd_chd_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_chd_itm_sub1.addAliasName("Cnd.chd_itm_sub1", p);
		p.Cnd_chd_itm_sub2 = p.Cnd_chd_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_chd_itm_sub2.addAliasName("Cnd.chd_itm_sub2", p);
		p.Cnd_chd_itm_sub3 = p.Cnd_chd_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_chd_itm_sub3.addAliasName("Cnd.chd_itm_sub3", p);
		p.Cnd_chd_itm_nm = p.Cnd_chd_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_chd_itm_nm.addAliasName("Cnd.chd_itm_nm", p);
		p.Cnd_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.create(p.getCndR().ver_no_p());
		p.Cnd_ver_no_p_PPanel.setName("Cnd.ver_no_p");
		p.Cnd_ver_no = p.Cnd_ver_no_p_PPanel.VerNo_ver_no;
		p.Cnd_ver_no.addAliasName("Cnd.ver_no", p);
		p.Cnd_old_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().old_itm_p());
		p.Cnd_old_itm_p_PPanel.setName("Cnd.old_itm_p");
		p.Cnd_old_itm_cd = p.Cnd_old_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_old_itm_cd.addAliasName("Cnd.old_itm_cd", p);
		p.Cnd_old_itm_sub1 = p.Cnd_old_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_old_itm_sub1.addAliasName("Cnd.old_itm_sub1", p);
		p.Cnd_old_itm_sub2 = p.Cnd_old_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_old_itm_sub2.addAliasName("Cnd.old_itm_sub2", p);
		p.Cnd_old_itm_sub3 = p.Cnd_old_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_old_itm_sub3.addAliasName("Cnd.old_itm_sub3", p);
		p.Cnd_old_itm_nm = p.Cnd_old_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_old_itm_nm.addAliasName("Cnd.old_itm_nm", p);
		p.Cnd_old_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.create(p.getCndR().old_ver_no_p());
		p.Cnd_old_ver_no_p_PPanel.setName("Cnd.old_ver_no_p");
		p.Cnd_old_ver_no = p.Cnd_old_ver_no_p_PPanel.VerNo_ver_no;
		p.Cnd_old_ver_no.addAliasName("Cnd.old_ver_no", p);
		p.Cnd_new_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().new_itm_p());
		p.Cnd_new_itm_p_PPanel.setName("Cnd.new_itm_p");
		p.Cnd_new_itm_cd = p.Cnd_new_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_new_itm_cd.addAliasName("Cnd.new_itm_cd", p);
		p.Cnd_new_itm_sub1 = p.Cnd_new_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_new_itm_sub1.addAliasName("Cnd.new_itm_sub1", p);
		p.Cnd_new_itm_sub2 = p.Cnd_new_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_new_itm_sub2.addAliasName("Cnd.new_itm_sub2", p);
		p.Cnd_new_itm_sub3 = p.Cnd_new_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_new_itm_sub3.addAliasName("Cnd.new_itm_sub3", p);
		p.Cnd_new_itm_nm = p.Cnd_new_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_new_itm_nm.addAliasName("Cnd.new_itm_nm", p);
		p.Cnd_new_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.create(p.getCndR().new_ver_no_p());
		p.Cnd_new_ver_no_p_PPanel.setName("Cnd.new_ver_no_p");
		p.Cnd_new_ver_no = p.Cnd_new_ver_no_p_PPanel.VerNo_ver_no;
		p.Cnd_new_ver_no.addAliasName("Cnd.new_ver_no", p);
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MABSP_BomLst p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MABSP_BomLst p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MABSP_BomLst p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MABSP_BomLst p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABSP_BomLst p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MABSP_BomLst p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MABSP_BomLst p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABSP_BomLst p) {
		p.Dtl_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0030.DtlR.$par_itm_p);
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
		p.Dtl_chd_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0030.DtlR.$chd_itm_p);
		p.Dtl_chd_itm_p_PPanel.setName("Dtl.chd_itm_p");
		p.columnDtl_chd_itm_cd = p.Dtl_chd_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_chd_itm_cd.addAliasName("Dtl.chd_itm_cd", p);
		p.columnDtl_chd_itm_sub1 = p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_chd_itm_sub1.addAliasName("Dtl.chd_itm_sub1", p);
		p.columnDtl_chd_itm_sub2 = p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_chd_itm_sub2.addAliasName("Dtl.chd_itm_sub2", p);
		p.columnDtl_chd_itm_sub3 = p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_chd_itm_sub3.addAliasName("Dtl.chd_itm_sub3", p);
		p.columnDtl_chd_itm_nm = p.Dtl_chd_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_chd_itm_nm.addAliasName("Dtl.chd_itm_nm", p);
		p.Dtl_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMABS.MABSP0030.DtlR.$ver_no_p);
		p.Dtl_ver_no_p_PPanel.setName("Dtl.ver_no_p");
		p.columnDtl_ver_no = p.Dtl_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnDtl_ver_no.addAliasName("Dtl.ver_no", p);
		p.Dtl_min_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMABS.MABSP0030.DtlR.$min_sno_p);
		p.Dtl_min_sno_p_PPanel.setName("Dtl.min_sno_p");
		p.columnDtl_min_sno1 = p.Dtl_min_sno_p_PPanel.columnSno_sno1;
		p.columnDtl_min_sno1.addAliasName("Dtl.min_sno1", p);
		p.columnDtl_min_sno2 = p.Dtl_min_sno_p_PPanel.columnSno_sno2;
		p.columnDtl_min_sno2.addAliasName("Dtl.min_sno2", p);
		p.columnDtl_min_sno3 = p.Dtl_min_sno_p_PPanel.columnSno_sno3;
		p.columnDtl_min_sno3.addAliasName("Dtl.min_sno3", p);
		p.columnDtl_min_sno4 = p.Dtl_min_sno_p_PPanel.columnSno_sno4;
		p.columnDtl_min_sno4.addAliasName("Dtl.min_sno4", p);
		p.Dtl_max_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMABS.MABSP0030.DtlR.$max_sno_p);
		p.Dtl_max_sno_p_PPanel.setName("Dtl.max_sno_p");
		p.columnDtl_max_sno1 = p.Dtl_max_sno_p_PPanel.columnSno_sno1;
		p.columnDtl_max_sno1.addAliasName("Dtl.max_sno1", p);
		p.columnDtl_max_sno2 = p.Dtl_max_sno_p_PPanel.columnSno_sno2;
		p.columnDtl_max_sno2.addAliasName("Dtl.max_sno2", p);
		p.columnDtl_max_sno3 = p.Dtl_max_sno_p_PPanel.columnSno_sno3;
		p.columnDtl_max_sno3.addAliasName("Dtl.max_sno3", p);
		p.columnDtl_max_sno4 = p.Dtl_max_sno_p_PPanel.columnSno_sno4;
		p.columnDtl_max_sno4.addAliasName("Dtl.max_sno4", p);
		p.Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP0030.DtlR.$dt_p);
		p.Dtl_dt_p_PPanel.setName("Dtl.dt_p");
		p.columnDtl_st_dt = p.Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnDtl_st_dt.addAliasName("Dtl.st_dt", p);
		p.columnDtl_end_dt = p.Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnDtl_end_dt.addAliasName("Dtl.end_dt", p);
		p.Dtl_qty1_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0030.DtlR.$qty1_p);
		p.Dtl_qty1_p_PPanel.setName("Dtl.qty1_p");
		p.columnDtl_par_inst_qty = p.Dtl_qty1_p_PPanel.columnQty_qty;
		p.columnDtl_par_inst_qty.addAliasName("Dtl.par_inst_qty", p);
		p.Dtl_qty3_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0030.DtlR.$qty3_p);
		p.Dtl_qty3_p_PPanel.setName("Dtl.qty3_p");
		p.columnDtl_chd_inpt_qty = p.Dtl_qty3_p_PPanel.columnQty_qty;
		p.columnDtl_chd_inpt_qty.addAliasName("Dtl.chd_inpt_qty", p);
		p.Dtl_qty2_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0030.DtlR.$qty2_p);
		p.Dtl_qty2_p_PPanel.setName("Dtl.qty2_p");
		p.columnDtl_chd_rqmt_qty = p.Dtl_qty2_p_PPanel.columnQty_qty;
		p.columnDtl_chd_rqmt_qty.addAliasName("Dtl.chd_rqmt_qty", p);
		p.Dtl_qty4_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0030.DtlR.$qty4_p);
		p.Dtl_qty4_p_PPanel.setName("Dtl.qty4_p");
		p.columnDtl_fxd_chd_rqmt_qty = p.Dtl_qty4_p_PPanel.columnQty_qty;
		p.columnDtl_fxd_chd_rqmt_qty.addAliasName("Dtl.fxd_chd_rqmt_qty", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABSP_BomLst p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABSP_BomLst p) {
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
	
	
	/** [Cnd_oper_cd_ListPutter]の定義 */
	private MCListPutter Cnd_oper_cd_p = null;

	/**
	 * [Cnd_oper_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_oper_cd_ListPutter() {
		if (Cnd_oper_cd_p == null) {
			Cnd_oper_cd_p = createCnd_oper_cd_ListPutter(Cnd_oper_cd, "oper_cd", "oper_nm");

		}
		return Cnd_oper_cd_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd1_p = null;

	/**
	 * [Cnd_par_itm_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd1_ListPutter() {
		if (Cnd_par_itm_grp_cd1_p == null) {
			Cnd_par_itm_grp_cd1_p = createCnd_par_itm_grp_cd1_ListPutter(Cnd_par_itm_grp_cd1, "par_itm_grp_cd1", "par_itm_grp_nm1");

		}
		return Cnd_par_itm_grp_cd1_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd2_p = null;

	/**
	 * [Cnd_par_itm_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd2_ListPutter() {
		if (Cnd_par_itm_grp_cd2_p == null) {
			Cnd_par_itm_grp_cd2_p = createCnd_par_itm_grp_cd2_ListPutter(Cnd_par_itm_grp_cd2, "par_itm_grp_cd2", "par_itm_grp_nm2");

		}
		return Cnd_par_itm_grp_cd2_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd3_p = null;

	/**
	 * [Cnd_par_itm_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd3_ListPutter() {
		if (Cnd_par_itm_grp_cd3_p == null) {
			Cnd_par_itm_grp_cd3_p = createCnd_par_itm_grp_cd3_ListPutter(Cnd_par_itm_grp_cd3, "par_itm_grp_cd3", "par_itm_grp_nm3");

		}
		return Cnd_par_itm_grp_cd3_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd4_p = null;

	/**
	 * [Cnd_par_itm_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd4_ListPutter() {
		if (Cnd_par_itm_grp_cd4_p == null) {
			Cnd_par_itm_grp_cd4_p = createCnd_par_itm_grp_cd4_ListPutter(Cnd_par_itm_grp_cd4, "par_itm_grp_cd4", "par_itm_grp_nm4");

		}
		return Cnd_par_itm_grp_cd4_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd5_p = null;

	/**
	 * [Cnd_par_itm_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd5_ListPutter() {
		if (Cnd_par_itm_grp_cd5_p == null) {
			Cnd_par_itm_grp_cd5_p = createCnd_par_itm_grp_cd5_ListPutter(Cnd_par_itm_grp_cd5, "par_itm_grp_cd5", "par_itm_grp_nm5");

		}
		return Cnd_par_itm_grp_cd5_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd6_p = null;

	/**
	 * [Cnd_par_itm_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd6_ListPutter() {
		if (Cnd_par_itm_grp_cd6_p == null) {
			Cnd_par_itm_grp_cd6_p = createCnd_par_itm_grp_cd6_ListPutter(Cnd_par_itm_grp_cd6, "par_itm_grp_cd6", "par_itm_grp_nm6");

		}
		return Cnd_par_itm_grp_cd6_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd7_p = null;

	/**
	 * [Cnd_par_itm_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd7_ListPutter() {
		if (Cnd_par_itm_grp_cd7_p == null) {
			Cnd_par_itm_grp_cd7_p = createCnd_par_itm_grp_cd7_ListPutter(Cnd_par_itm_grp_cd7, "par_itm_grp_cd7", "par_itm_grp_nm7");

		}
		return Cnd_par_itm_grp_cd7_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd8_p = null;

	/**
	 * [Cnd_par_itm_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd8_ListPutter() {
		if (Cnd_par_itm_grp_cd8_p == null) {
			Cnd_par_itm_grp_cd8_p = createCnd_par_itm_grp_cd8_ListPutter(Cnd_par_itm_grp_cd8, "par_itm_grp_cd8", "par_itm_grp_nm8");

		}
		return Cnd_par_itm_grp_cd8_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd9_p = null;

	/**
	 * [Cnd_par_itm_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd9_ListPutter() {
		if (Cnd_par_itm_grp_cd9_p == null) {
			Cnd_par_itm_grp_cd9_p = createCnd_par_itm_grp_cd9_ListPutter(Cnd_par_itm_grp_cd9, "par_itm_grp_cd9", "par_itm_grp_nm9");

		}
		return Cnd_par_itm_grp_cd9_p;
	}
	
	
	/** [Cnd_par_itm_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_grp_cd10_p = null;

	/**
	 * [Cnd_par_itm_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_grp_cd10_ListPutter() {
		if (Cnd_par_itm_grp_cd10_p == null) {
			Cnd_par_itm_grp_cd10_p = createCnd_par_itm_grp_cd10_ListPutter(Cnd_par_itm_grp_cd10, "par_itm_grp_cd10", "par_itm_grp_nm10");

		}
		return Cnd_par_itm_grp_cd10_p;
	}
	
	
	/** [Cnd_chd_itm_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_grp_cd1_p = null;

	/**
	 * [Cnd_chd_itm_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_grp_cd1_ListPutter() {
		if (Cnd_chd_itm_grp_cd1_p == null) {
			Cnd_chd_itm_grp_cd1_p = createCnd_chd_itm_grp_cd1_ListPutter(Cnd_chd_itm_grp_cd1, "chd_itm_grp_cd1", "chd_itm_grp_nm1");

		}
		return Cnd_chd_itm_grp_cd1_p;
	}
	
	
	/** [Cnd_chd_itm_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_grp_cd2_p = null;

	/**
	 * [Cnd_chd_itm_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_grp_cd2_ListPutter() {
		if (Cnd_chd_itm_grp_cd2_p == null) {
			Cnd_chd_itm_grp_cd2_p = createCnd_chd_itm_grp_cd2_ListPutter(Cnd_chd_itm_grp_cd2, "chd_itm_grp_cd2", "chd_itm_grp_nm2");

		}
		return Cnd_chd_itm_grp_cd2_p;
	}
	
	
	/** [Cnd_chd_itm_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_grp_cd3_p = null;

	/**
	 * [Cnd_chd_itm_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_grp_cd3_ListPutter() {
		if (Cnd_chd_itm_grp_cd3_p == null) {
			Cnd_chd_itm_grp_cd3_p = createCnd_chd_itm_grp_cd3_ListPutter(Cnd_chd_itm_grp_cd3, "chd_itm_grp_cd3", "chd_itm_grp_nm3");

		}
		return Cnd_chd_itm_grp_cd3_p;
	}
	
	
	/** [Cnd_chd_itm_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_grp_cd4_p = null;

	/**
	 * [Cnd_chd_itm_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_grp_cd4_ListPutter() {
		if (Cnd_chd_itm_grp_cd4_p == null) {
			Cnd_chd_itm_grp_cd4_p = createCnd_chd_itm_grp_cd4_ListPutter(Cnd_chd_itm_grp_cd4, "chd_itm_grp_cd4", "chd_itm_grp_nm4");

		}
		return Cnd_chd_itm_grp_cd4_p;
	}
	
	
	/** [Cnd_chd_itm_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_grp_cd5_p = null;

	/**
	 * [Cnd_chd_itm_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_grp_cd5_ListPutter() {
		if (Cnd_chd_itm_grp_cd5_p == null) {
			Cnd_chd_itm_grp_cd5_p = createCnd_chd_itm_grp_cd5_ListPutter(Cnd_chd_itm_grp_cd5, "chd_itm_grp_cd5", "chd_itm_grp_nm5");

		}
		return Cnd_chd_itm_grp_cd5_p;
	}
	
	
	/** [Cnd_chd_itm_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_grp_cd6_p = null;

	/**
	 * [Cnd_chd_itm_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_grp_cd6_ListPutter() {
		if (Cnd_chd_itm_grp_cd6_p == null) {
			Cnd_chd_itm_grp_cd6_p = createCnd_chd_itm_grp_cd6_ListPutter(Cnd_chd_itm_grp_cd6, "chd_itm_grp_cd6", "chd_itm_grp_nm6");

		}
		return Cnd_chd_itm_grp_cd6_p;
	}
	
	
	/** [Cnd_chd_itm_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_grp_cd7_p = null;

	/**
	 * [Cnd_chd_itm_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_grp_cd7_ListPutter() {
		if (Cnd_chd_itm_grp_cd7_p == null) {
			Cnd_chd_itm_grp_cd7_p = createCnd_chd_itm_grp_cd7_ListPutter(Cnd_chd_itm_grp_cd7, "chd_itm_grp_cd7", "chd_itm_grp_nm7");

		}
		return Cnd_chd_itm_grp_cd7_p;
	}
	
	
	/** [Cnd_chd_itm_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_grp_cd8_p = null;

	/**
	 * [Cnd_chd_itm_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_grp_cd8_ListPutter() {
		if (Cnd_chd_itm_grp_cd8_p == null) {
			Cnd_chd_itm_grp_cd8_p = createCnd_chd_itm_grp_cd8_ListPutter(Cnd_chd_itm_grp_cd8, "chd_itm_grp_cd8", "chd_itm_grp_nm8");

		}
		return Cnd_chd_itm_grp_cd8_p;
	}
	
	
	/** [Cnd_chd_itm_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_grp_cd9_p = null;

	/**
	 * [Cnd_chd_itm_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_grp_cd9_ListPutter() {
		if (Cnd_chd_itm_grp_cd9_p == null) {
			Cnd_chd_itm_grp_cd9_p = createCnd_chd_itm_grp_cd9_ListPutter(Cnd_chd_itm_grp_cd9, "chd_itm_grp_cd9", "chd_itm_grp_nm9");

		}
		return Cnd_chd_itm_grp_cd9_p;
	}
	
	
	/** [Cnd_chd_itm_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_grp_cd10_p = null;

	/**
	 * [Cnd_chd_itm_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_grp_cd10_ListPutter() {
		if (Cnd_chd_itm_grp_cd10_p == null) {
			Cnd_chd_itm_grp_cd10_p = createCnd_chd_itm_grp_cd10_ListPutter(Cnd_chd_itm_grp_cd10, "chd_itm_grp_cd10", "chd_itm_grp_nm10");

		}
		return Cnd_chd_itm_grp_cd10_p;
	}
	
	
	/** [Cnd_bom_chng_typ_ListPutter]の定義 */
	private MCListPutter Cnd_bom_chng_typ_p = null;

	/**
	 * [Cnd_bom_chng_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bom_chng_typ_ListPutter() {
		if (Cnd_bom_chng_typ_p == null) {
			Cnd_bom_chng_typ_p = createCnd_bom_chng_typ_ListPutter(Cnd_bom_chng_typ, "bom_chng_typ", "bom_chng_typ_nm");

		}
		return Cnd_bom_chng_typ_p;
	}
	
	
	/** [Cnd_chng_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_chng_wg_cd_p = null;

	/**
	 * [Cnd_chng_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chng_wg_cd_ListPutter() {
		if (Cnd_chng_wg_cd_p == null) {
			Cnd_chng_wg_cd_p = createCnd_chng_wg_cd_ListPutter(Cnd_chng_wg_cd, "chng_wg_cd", "chng_wg_nm");

		}
		return Cnd_chng_wg_cd_p;
	}
	
	
	/** [Cnd_old_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_old_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_old_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_old_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_old_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_old_itm_p_PPanel_Itm_itm_cd_p = createCnd_old_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_old_itm_p_PPanel.Itm_itm_cd, "old_itm_cd", "old_itm_nm","old_itm_sub1","old_itm_sub2","old_itm_sub3","old_stk_mng_typ","old_stk_mng_typ_nm","old_asset_mng_typ","old_asset_mng_typ_nm");
		}
		return Cnd_old_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_old_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_old_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_old_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_old_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_old_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_old_itm_p_PPanel_Itm_itm_sub1_p = createCnd_old_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_old_itm_p_PPanel.Itm_itm_sub1, "old_itm_sub1", "old_itm_nm","old_itm_sub2","old_itm_sub3","old_stk_mng_typ","old_stk_mng_typ_nm","old_asset_mng_typ","old_asset_mng_typ_nm");
		}
		return Cnd_old_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_old_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_old_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_old_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_old_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_old_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_old_itm_p_PPanel_Itm_itm_sub2_p = createCnd_old_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_old_itm_p_PPanel.Itm_itm_sub2, "old_itm_sub2", "old_itm_nm","old_itm_sub3","old_stk_mng_typ","old_stk_mng_typ_nm","old_asset_mng_typ","old_asset_mng_typ_nm");
		}
		return Cnd_old_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_old_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_old_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_old_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_old_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_old_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_old_itm_p_PPanel_Itm_itm_sub3_p = createCnd_old_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_old_itm_p_PPanel.Itm_itm_sub3, "old_itm_sub3", "old_itm_nm","old_stk_mng_typ","old_stk_mng_typ_nm","old_asset_mng_typ","old_asset_mng_typ_nm");
		}
		return Cnd_old_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [Cnd_old_alt_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_old_alt_grp_cd_p = null;

	/**
	 * [Cnd_old_alt_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_old_alt_grp_cd_ListPutter() {
		if (Cnd_old_alt_grp_cd_p == null) {
			Cnd_old_alt_grp_cd_p = createCnd_old_alt_grp_cd_ListPutter(Cnd_old_alt_grp_cd, "old_alt_grp_cd", "old_alt_grp_nm","old_alt_itm_typ");

		}
		return Cnd_old_alt_grp_cd_p;
	}
	
	
	/** [Cnd_old_alt_itm_typ_ListPutter]の定義 */
	private MCListPutter Cnd_old_alt_itm_typ_p = null;

	/**
	 * [Cnd_old_alt_itm_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_old_alt_itm_typ_ListPutter() {
		if (Cnd_old_alt_itm_typ_p == null) {
			Cnd_old_alt_itm_typ_p = createCnd_old_alt_itm_typ_ListPutter(Cnd_old_alt_itm_typ, "old_alt_itm_typ", "old_alt_itm_typ_nm");

		}
		return Cnd_old_alt_itm_typ_p;
	}
	
	
	/** [Cnd_new_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_new_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_new_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_new_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_new_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_new_itm_p_PPanel_Itm_itm_cd_p = createCnd_new_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_new_itm_p_PPanel.Itm_itm_cd, "new_itm_cd", "new_itm_nm","new_itm_sub1","new_itm_sub2","new_itm_sub3","new_stk_mng_typ","new_stk_mng_typ_nm","new_asset_mng_typ","new_asset_mng_typ_nm");
		}
		return Cnd_new_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_new_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_new_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_new_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_new_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_new_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_new_itm_p_PPanel_Itm_itm_sub1_p = createCnd_new_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_new_itm_p_PPanel.Itm_itm_sub1, "new_itm_sub1", "new_itm_nm","new_itm_sub2","new_itm_sub3","new_stk_mng_typ","new_stk_mng_typ_nm","new_asset_mng_typ","new_asset_mng_typ_nm");
		}
		return Cnd_new_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_new_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_new_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_new_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_new_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_new_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_new_itm_p_PPanel_Itm_itm_sub2_p = createCnd_new_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_new_itm_p_PPanel.Itm_itm_sub2, "new_itm_sub2", "new_itm_nm","new_itm_sub3","new_stk_mng_typ","new_stk_mng_typ_nm","new_asset_mng_typ","new_asset_mng_typ_nm");
		}
		return Cnd_new_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_new_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_new_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_new_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_new_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_new_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_new_itm_p_PPanel_Itm_itm_sub3_p = createCnd_new_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_new_itm_p_PPanel.Itm_itm_sub3, "new_itm_sub3", "new_itm_nm","new_stk_mng_typ","new_stk_mng_typ_nm","new_asset_mng_typ","new_asset_mng_typ_nm");
		}
		return Cnd_new_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [Cnd_new_alt_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_new_alt_grp_cd_p = null;

	/**
	 * [Cnd_new_alt_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_new_alt_grp_cd_ListPutter() {
		if (Cnd_new_alt_grp_cd_p == null) {
			Cnd_new_alt_grp_cd_p = createCnd_new_alt_grp_cd_ListPutter(Cnd_new_alt_grp_cd, "new_alt_grp_cd", "new_alt_grp_nm","new_alt_itm_typ");

		}
		return Cnd_new_alt_grp_cd_p;
	}
	
	
	/** [Cnd_new_alt_itm_typ_ListPutter]の定義 */
	private MCListPutter Cnd_new_alt_itm_typ_p = null;

	/**
	 * [Cnd_new_alt_itm_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_new_alt_itm_typ_ListPutter() {
		if (Cnd_new_alt_itm_typ_p == null) {
			Cnd_new_alt_itm_typ_p = createCnd_new_alt_itm_typ_ListPutter(Cnd_new_alt_itm_typ, "new_alt_itm_typ", "new_alt_itm_typ_nm");

		}
		return Cnd_new_alt_itm_typ_p;
	}
	
	
	/** [Dtl_wg_cd_ListPutter]の定義 */
	private MCListPutter Dtl_wg_cd_p = null;

	/**
	 * [Dtl_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_wg_cd_ListPutter() {
		if (Dtl_wg_cd_p == null) {
			Dtl_wg_cd_p = createDtl_wg_cd_ListPutter(columnDtl_wg_cd, "wg_cd", "wg_nm");

		}
		return Dtl_wg_cd_p;
	}
	
	
	/** [Dtl_par_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_par_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl_par_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_par_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl_par_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl_par_itm_p_PPanel_columnItm_itm_cd_p = createDtl_par_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_par_itm_p_PPanel.columnItm_itm_cd, "par_itm_cd", "par_itm_nm","par_itm_sub1","par_itm_sub2","par_itm_sub3","bom_ptn","par_base_unit_cd","par_dec_place","par_itm_typ","par_itm_typ_nm","par_itm_typ_d_cd","par_itm_typ_d_nm","par_sno1_mng_typ","par_sno2_mng_typ","par_sno3_mng_typ","par_sno4_mng_typ","par_def_bom_ptn","par_base_unit_nm");
		}
		return Dtl_par_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [Dtl_par_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Dtl_par_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [Dtl_par_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_par_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (Dtl_par_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			Dtl_par_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_par_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_par_itm_p_PPanel.columnItm_itm_sub1, "par_itm_sub1", "par_itm_nm","par_itm_sub2","par_itm_sub3","bom_ptn","par_base_unit_cd","par_dec_place","par_itm_typ","par_itm_typ_nm","par_itm_typ_d_cd","par_itm_typ_d_nm","par_sno1_mng_typ","par_sno2_mng_typ","par_sno3_mng_typ","par_sno4_mng_typ","par_def_bom_ptn","par_base_unit_nm");
		}
		return Dtl_par_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [Dtl_par_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Dtl_par_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [Dtl_par_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_par_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (Dtl_par_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			Dtl_par_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_par_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_par_itm_p_PPanel.columnItm_itm_sub2, "par_itm_sub2", "par_itm_nm","par_itm_sub3","bom_ptn","par_base_unit_cd","par_dec_place","par_itm_typ","par_itm_typ_nm","par_itm_typ_d_cd","par_itm_typ_d_nm","par_sno1_mng_typ","par_sno2_mng_typ","par_sno3_mng_typ","par_sno4_mng_typ","par_def_bom_ptn","par_base_unit_nm");
		}
		return Dtl_par_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [Dtl_par_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Dtl_par_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [Dtl_par_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_par_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (Dtl_par_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			Dtl_par_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_par_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_par_itm_p_PPanel.columnItm_itm_sub3, "par_itm_sub3", "par_itm_nm","bom_ptn","par_base_unit_cd","par_dec_place","par_itm_typ","par_itm_typ_nm","par_itm_typ_d_cd","par_itm_typ_d_nm","par_sno1_mng_typ","par_sno2_mng_typ","par_sno3_mng_typ","par_sno4_mng_typ","par_def_bom_ptn","par_base_unit_nm");
		}
		return Dtl_par_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Dtl_oper_cd_ListPutter]の定義 */
	private MCListPutter Dtl_oper_cd_p = null;

	/**
	 * [Dtl_oper_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_oper_cd_ListPutter() {
		if (Dtl_oper_cd_p == null) {
			Dtl_oper_cd_p = createDtl_oper_cd_ListPutter(columnDtl_oper_cd, "oper_cd", "oper_nm");

		}
		return Dtl_oper_cd_p;
	}
	
	
	/** [Dtl_chd_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_chd_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_chd_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl_chd_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl_chd_itm_p_PPanel_columnItm_itm_cd_p = createDtl_chd_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_chd_itm_p_PPanel.columnItm_itm_cd, "chd_itm_cd", "chd_itm_nm","chd_itm_sub1","chd_itm_sub2","chd_itm_sub3","chd_base_unit_cd","chd_itm_typ","chd_itm_typ_nm","chd_itm_typ_d_cd","chd_itm_typ_d_nm","chd_stk_mng_typ","chd_asset_mng_typ","chd_dec_place","lot_mng_typ","sublot_mng_typ","ver_flg","chd_sno1_mng_typ","chd_sno2_mng_typ","chd_sno3_mng_typ","chd_sno4_mng_typ","chd_def_bom_ptn","chd_base_unit_nm");
		}
		return Dtl_chd_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [Dtl_chd_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Dtl_chd_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_chd_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (Dtl_chd_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			Dtl_chd_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_chd_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_chd_itm_p_PPanel.columnItm_itm_sub1, "chd_itm_sub1", "chd_itm_nm","chd_itm_sub2","chd_itm_sub3","chd_base_unit_cd","chd_itm_typ","chd_itm_typ_nm","chd_itm_typ_d_cd","chd_itm_typ_d_nm","chd_stk_mng_typ","chd_asset_mng_typ","chd_dec_place","lot_mng_typ","sublot_mng_typ","ver_flg","chd_sno1_mng_typ","chd_sno2_mng_typ","chd_sno3_mng_typ","chd_sno4_mng_typ","chd_def_bom_ptn","chd_base_unit_nm");
		}
		return Dtl_chd_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [Dtl_chd_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Dtl_chd_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_chd_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (Dtl_chd_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			Dtl_chd_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_chd_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_chd_itm_p_PPanel.columnItm_itm_sub2, "chd_itm_sub2", "chd_itm_nm","chd_itm_sub3","chd_base_unit_cd","chd_itm_typ","chd_itm_typ_nm","chd_itm_typ_d_cd","chd_itm_typ_d_nm","chd_stk_mng_typ","chd_asset_mng_typ","chd_dec_place","lot_mng_typ","sublot_mng_typ","ver_flg","chd_sno1_mng_typ","chd_sno2_mng_typ","chd_sno3_mng_typ","chd_sno4_mng_typ","chd_def_bom_ptn","chd_base_unit_nm");
		}
		return Dtl_chd_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [Dtl_chd_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Dtl_chd_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_chd_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (Dtl_chd_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			Dtl_chd_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_chd_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_chd_itm_p_PPanel.columnItm_itm_sub3, "chd_itm_sub3", "chd_itm_nm","chd_base_unit_cd","chd_itm_typ","chd_itm_typ_nm","chd_itm_typ_d_cd","chd_itm_typ_d_nm","chd_stk_mng_typ","chd_asset_mng_typ","chd_dec_place","lot_mng_typ","sublot_mng_typ","ver_flg","chd_sno1_mng_typ","chd_sno2_mng_typ","chd_sno3_mng_typ","chd_sno4_mng_typ","chd_def_bom_ptn","chd_base_unit_nm");
		}
		return Dtl_chd_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Dtl_chd_itm_typ_d_cd_ListPutter]の定義 */
	private MCListPutter Dtl_chd_itm_typ_d_cd_p = null;

	/**
	 * [Dtl_chd_itm_typ_d_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_chd_itm_typ_d_cd_ListPutter() {
		if (Dtl_chd_itm_typ_d_cd_p == null) {
			Dtl_chd_itm_typ_d_cd_p = createDtl_chd_itm_typ_d_cd_ListPutter(columnDtl_chd_itm_typ_d_cd, "chd_itm_typ_d_cd", "sno_typ1","sno_typ2","sno_typ3","sno_typ4","inst_lot_fix_flg","lot_mix_flg","sublot_mix_flg","alloc_ctl_typ","inpt_ctl_typ","bkf_typ","main_itm_flg","byprod_flg","not_cost_flg");

		}
		return Dtl_chd_itm_typ_d_cd_p;
	}
	
	
	/** [Dtl_alt_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_alt_grp_cd_p = null;

	/**
	 * [Dtl_alt_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_alt_grp_cd_ListPutter() {
		if (Dtl_alt_grp_cd_p == null) {
			Dtl_alt_grp_cd_p = createDtl_alt_grp_cd_ListPutter(columnDtl_alt_grp_cd, "alt_grp_cd", "alt_grp_nm","alt_itm_typ");

		}
		return Dtl_alt_grp_cd_p;
	}
	
	
	/** [Dtl_alt_itm_typ_ListPutter]の定義 */
	private MCListPutter Dtl_alt_itm_typ_p = null;

	/**
	 * [Dtl_alt_itm_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_alt_itm_typ_ListPutter() {
		if (Dtl_alt_itm_typ_p == null) {
			Dtl_alt_itm_typ_p = createDtl_alt_itm_typ_ListPutter(columnDtl_alt_itm_typ, "alt_itm_typ", "alt_itm_typ_nm");

		}
		return Dtl_alt_itm_typ_p;
	}
	
	
	/** [Dtl_sno_typ1_ListPutter]の定義 */
	private MCListPutter Dtl_sno_typ1_p = null;

	/**
	 * [Dtl_sno_typ1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno_typ1_ListPutter() {
		if (Dtl_sno_typ1_p == null) {
			Dtl_sno_typ1_p = createDtl_sno_typ1_ListPutter(columnDtl_sno_typ1, "sno_typ1", "sno_typ_nm1");

		}
		return Dtl_sno_typ1_p;
	}
	
	
	/** [Dtl_sno_typ2_ListPutter]の定義 */
	private MCListPutter Dtl_sno_typ2_p = null;

	/**
	 * [Dtl_sno_typ2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno_typ2_ListPutter() {
		if (Dtl_sno_typ2_p == null) {
			Dtl_sno_typ2_p = createDtl_sno_typ2_ListPutter(columnDtl_sno_typ2, "sno_typ2", "sno_typ_nm2");

		}
		return Dtl_sno_typ2_p;
	}
	
	
	/** [Dtl_sno_typ3_ListPutter]の定義 */
	private MCListPutter Dtl_sno_typ3_p = null;

	/**
	 * [Dtl_sno_typ3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno_typ3_ListPutter() {
		if (Dtl_sno_typ3_p == null) {
			Dtl_sno_typ3_p = createDtl_sno_typ3_ListPutter(columnDtl_sno_typ3, "sno_typ3", "sno_typ_nm3");

		}
		return Dtl_sno_typ3_p;
	}
	
	
	/** [Dtl_sno_typ4_ListPutter]の定義 */
	private MCListPutter Dtl_sno_typ4_p = null;

	/**
	 * [Dtl_sno_typ4_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sno_typ4_ListPutter() {
		if (Dtl_sno_typ4_p == null) {
			Dtl_sno_typ4_p = createDtl_sno_typ4_ListPutter(columnDtl_sno_typ4, "sno_typ4", "sno_typ_nm4");

		}
		return Dtl_sno_typ4_p;
	}
	
	
	/** [Dtl_in_offst_typ_ListPutter]の定義 */
	private MCListPutter Dtl_in_offst_typ_p = null;

	/**
	 * [Dtl_in_offst_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_in_offst_typ_ListPutter() {
		if (Dtl_in_offst_typ_p == null) {
			Dtl_in_offst_typ_p = createDtl_in_offst_typ_ListPutter(columnDtl_in_offst_typ, "in_offst_typ", "in_offst_typ_nm");

		}
		return Dtl_in_offst_typ_p;
	}
	
	
	/** [Dtl_bkf_typ_ListPutter]の定義 */
	private MCListPutter Dtl_bkf_typ_p = null;

	/**
	 * [Dtl_bkf_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bkf_typ_ListPutter() {
		if (Dtl_bkf_typ_p == null) {
			Dtl_bkf_typ_p = createDtl_bkf_typ_ListPutter(columnDtl_bkf_typ, "bkf_typ", "bkf_typ_nm");

		}
		return Dtl_bkf_typ_p;
	}
	
	
	/** [Dtl_alloc_ctl_typ_ListPutter]の定義 */
	private MCListPutter Dtl_alloc_ctl_typ_p = null;

	/**
	 * [Dtl_alloc_ctl_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_alloc_ctl_typ_ListPutter() {
		if (Dtl_alloc_ctl_typ_p == null) {
			Dtl_alloc_ctl_typ_p = createDtl_alloc_ctl_typ_ListPutter(columnDtl_alloc_ctl_typ, "alloc_ctl_typ", "alloc_ctl_typ_nm");

		}
		return Dtl_alloc_ctl_typ_p;
	}
	
	
	/** [Dtl_inpt_ctl_typ_ListPutter]の定義 */
	private MCListPutter Dtl_inpt_ctl_typ_p = null;

	/**
	 * [Dtl_inpt_ctl_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_inpt_ctl_typ_ListPutter() {
		if (Dtl_inpt_ctl_typ_p == null) {
			Dtl_inpt_ctl_typ_p = createDtl_inpt_ctl_typ_ListPutter(columnDtl_inpt_ctl_typ, "inpt_ctl_typ", "inpt_ctl_typ_nm");

		}
		return Dtl_inpt_ctl_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_BomLst create(){
		MABSP_BomLst p = new MABSP_BomLst();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_BomLst create(String name){
		MABSP_BomLst p = new MABSP_BomLst(name);
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
		MABSP_BomLst_MC.jbfInitScreenOpe((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbfInitRegTarget((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbfInitTop((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbfInitFold((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbfInitCndTab((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbfInitCnd((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbfInitTab1((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbfInitTab2((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbfInitTab3((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbfInitTab4((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbfInitCtrl((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbfInitRPnl((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbfInitBulkSet((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbfInitDtl((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbfInitBtn((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbfInitEastBtn((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbInitScreenOpe((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbInitRegTarget((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbInitTop((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbInitFold((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbInitCndTab((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbInitCnd((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbInitTab1((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbInitTab2((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbInitTab3((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbInitTab4((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbInitCtrl((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbInitRPnl((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbInitBulkSet((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbInitDtl((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbInitBtn((MABSP_BomLst)this);
		MABSP_BomLst_MC.jbInitEastBtn((MABSP_BomLst)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [RegTarget]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRegTarget(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.RegTargetPanel = p.beansFactory.createPanel("RegTarget");
		p.RegTargetTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCndTab(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.CndTabPanel = p.beansFactory.createPanel("CndTab");
		p.CndTabTab = p.beansFactory.createTabbedPane("CndTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_CHNG = p.beansFactory.createRadioButton("Cnd.ope_CHNG");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_cmn_flg = p.beansFactory.createCheckBox("Cnd.cmn_flg");
		p.Cnd_wg_flg = p.beansFactory.createCheckBox("Cnd.wg_flg");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_chng_no_Label = p.beansFactory.createLabel("Cnd.chng_no_Label");
		p.Cnd_chng_no = p.beansFactory.createTextField("Cnd.chng_no");
		p.Cnd_chng_no.setLabel(p.Cnd_chng_no_Label);
		p.Cnd_ext_sys_no_bom_Label = p.beansFactory.createLabel("Cnd.ext_sys_no_bom_Label");
		p.Cnd_ext_sys_no_bom = p.beansFactory.createTextField("Cnd.ext_sys_no_bom");
		p.Cnd_ext_sys_no_bom.setLabel(p.Cnd_ext_sys_no_bom_Label);
		p.Cnd_alt_grp_cd_Label = p.beansFactory.createLabel("Cnd.alt_grp_cd_Label");
		p.Cnd_alt_grp_cd = p.beansFactory.createTextField("Cnd.alt_grp_cd");
		p.Cnd_alt_grp_cd.setLabel(p.Cnd_alt_grp_cd_Label);
		p.Cnd_oper_cd_Label = p.beansFactory.createLabel("Cnd.oper_cd_Label");
		p.Cnd_oper_cd = p.beansFactory.createTextComboBox("Cnd.oper_cd");
		p.Cnd_oper_cd.setLabel(p.Cnd_oper_cd_Label);
		p.Cnd_oper_nm = p.beansFactory.createTextField("Cnd.oper_nm");
		p.Cnd_bom_ptn_Label = p.beansFactory.createLabel("Cnd.bom_ptn_Label");
		p.Cnd_bom_ptn = p.beansFactory.createTextField("Cnd.bom_ptn");
		p.Cnd_bom_ptn.setLabel(p.Cnd_bom_ptn_Label);
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
		p.Cnd_par_itm_grp_cd1_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd1_Label");
		p.Cnd_par_itm_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd1");
		p.Cnd_par_itm_grp_cd1.setLabel(p.Cnd_par_itm_grp_cd1_Label);
		p.Cnd_par_itm_grp_nm1 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm1");
		p.Cnd_par_itm_grp_cd2_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd2_Label");
		p.Cnd_par_itm_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd2");
		p.Cnd_par_itm_grp_cd2.setLabel(p.Cnd_par_itm_grp_cd2_Label);
		p.Cnd_par_itm_grp_nm2 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm2");
		p.Cnd_par_itm_grp_cd3_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd3_Label");
		p.Cnd_par_itm_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd3");
		p.Cnd_par_itm_grp_cd3.setLabel(p.Cnd_par_itm_grp_cd3_Label);
		p.Cnd_par_itm_grp_nm3 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm3");
		p.Cnd_par_itm_grp_cd4_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd4_Label");
		p.Cnd_par_itm_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd4");
		p.Cnd_par_itm_grp_cd4.setLabel(p.Cnd_par_itm_grp_cd4_Label);
		p.Cnd_par_itm_grp_nm4 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm4");
		p.Cnd_par_itm_grp_cd5_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd5_Label");
		p.Cnd_par_itm_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd5");
		p.Cnd_par_itm_grp_cd5.setLabel(p.Cnd_par_itm_grp_cd5_Label);
		p.Cnd_par_itm_grp_nm5 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm5");
		p.Cnd_par_itm_grp_cd6_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd6_Label");
		p.Cnd_par_itm_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd6");
		p.Cnd_par_itm_grp_cd6.setLabel(p.Cnd_par_itm_grp_cd6_Label);
		p.Cnd_par_itm_grp_nm6 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm6");
		p.Cnd_par_itm_grp_cd7_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd7_Label");
		p.Cnd_par_itm_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd7");
		p.Cnd_par_itm_grp_cd7.setLabel(p.Cnd_par_itm_grp_cd7_Label);
		p.Cnd_par_itm_grp_nm7 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm7");
		p.Cnd_par_itm_grp_cd8_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd8_Label");
		p.Cnd_par_itm_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd8");
		p.Cnd_par_itm_grp_cd8.setLabel(p.Cnd_par_itm_grp_cd8_Label);
		p.Cnd_par_itm_grp_nm8 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm8");
		p.Cnd_par_itm_grp_cd9_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd9_Label");
		p.Cnd_par_itm_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd9");
		p.Cnd_par_itm_grp_cd9.setLabel(p.Cnd_par_itm_grp_cd9_Label);
		p.Cnd_par_itm_grp_nm9 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm9");
		p.Cnd_par_itm_grp_cd10_Label = p.beansFactory.createLabel("Cnd.par_itm_grp_cd10_Label");
		p.Cnd_par_itm_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.par_itm_grp_cd10");
		p.Cnd_par_itm_grp_cd10.setLabel(p.Cnd_par_itm_grp_cd10_Label);
		p.Cnd_par_itm_grp_nm10 = p.beansFactory.createTextField("Cnd.par_itm_grp_nm10");
		p.Cnd_chd_itm_grp_cd1_Label = p.beansFactory.createLabel("Cnd.chd_itm_grp_cd1_Label");
		p.Cnd_chd_itm_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.chd_itm_grp_cd1");
		p.Cnd_chd_itm_grp_cd1.setLabel(p.Cnd_chd_itm_grp_cd1_Label);
		p.Cnd_chd_itm_grp_nm1 = p.beansFactory.createTextField("Cnd.chd_itm_grp_nm1");
		p.Cnd_chd_itm_grp_cd2_Label = p.beansFactory.createLabel("Cnd.chd_itm_grp_cd2_Label");
		p.Cnd_chd_itm_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.chd_itm_grp_cd2");
		p.Cnd_chd_itm_grp_cd2.setLabel(p.Cnd_chd_itm_grp_cd2_Label);
		p.Cnd_chd_itm_grp_nm2 = p.beansFactory.createTextField("Cnd.chd_itm_grp_nm2");
		p.Cnd_chd_itm_grp_cd3_Label = p.beansFactory.createLabel("Cnd.chd_itm_grp_cd3_Label");
		p.Cnd_chd_itm_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.chd_itm_grp_cd3");
		p.Cnd_chd_itm_grp_cd3.setLabel(p.Cnd_chd_itm_grp_cd3_Label);
		p.Cnd_chd_itm_grp_nm3 = p.beansFactory.createTextField("Cnd.chd_itm_grp_nm3");
		p.Cnd_chd_itm_grp_cd4_Label = p.beansFactory.createLabel("Cnd.chd_itm_grp_cd4_Label");
		p.Cnd_chd_itm_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.chd_itm_grp_cd4");
		p.Cnd_chd_itm_grp_cd4.setLabel(p.Cnd_chd_itm_grp_cd4_Label);
		p.Cnd_chd_itm_grp_nm4 = p.beansFactory.createTextField("Cnd.chd_itm_grp_nm4");
		p.Cnd_chd_itm_grp_cd5_Label = p.beansFactory.createLabel("Cnd.chd_itm_grp_cd5_Label");
		p.Cnd_chd_itm_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.chd_itm_grp_cd5");
		p.Cnd_chd_itm_grp_cd5.setLabel(p.Cnd_chd_itm_grp_cd5_Label);
		p.Cnd_chd_itm_grp_nm5 = p.beansFactory.createTextField("Cnd.chd_itm_grp_nm5");
		p.Cnd_chd_itm_grp_cd6_Label = p.beansFactory.createLabel("Cnd.chd_itm_grp_cd6_Label");
		p.Cnd_chd_itm_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.chd_itm_grp_cd6");
		p.Cnd_chd_itm_grp_cd6.setLabel(p.Cnd_chd_itm_grp_cd6_Label);
		p.Cnd_chd_itm_grp_nm6 = p.beansFactory.createTextField("Cnd.chd_itm_grp_nm6");
		p.Cnd_chd_itm_grp_cd7_Label = p.beansFactory.createLabel("Cnd.chd_itm_grp_cd7_Label");
		p.Cnd_chd_itm_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.chd_itm_grp_cd7");
		p.Cnd_chd_itm_grp_cd7.setLabel(p.Cnd_chd_itm_grp_cd7_Label);
		p.Cnd_chd_itm_grp_nm7 = p.beansFactory.createTextField("Cnd.chd_itm_grp_nm7");
		p.Cnd_chd_itm_grp_cd8_Label = p.beansFactory.createLabel("Cnd.chd_itm_grp_cd8_Label");
		p.Cnd_chd_itm_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.chd_itm_grp_cd8");
		p.Cnd_chd_itm_grp_cd8.setLabel(p.Cnd_chd_itm_grp_cd8_Label);
		p.Cnd_chd_itm_grp_nm8 = p.beansFactory.createTextField("Cnd.chd_itm_grp_nm8");
		p.Cnd_chd_itm_grp_cd9_Label = p.beansFactory.createLabel("Cnd.chd_itm_grp_cd9_Label");
		p.Cnd_chd_itm_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.chd_itm_grp_cd9");
		p.Cnd_chd_itm_grp_cd9.setLabel(p.Cnd_chd_itm_grp_cd9_Label);
		p.Cnd_chd_itm_grp_nm9 = p.beansFactory.createTextField("Cnd.chd_itm_grp_nm9");
		p.Cnd_chd_itm_grp_cd10_Label = p.beansFactory.createLabel("Cnd.chd_itm_grp_cd10_Label");
		p.Cnd_chd_itm_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.chd_itm_grp_cd10");
		p.Cnd_chd_itm_grp_cd10.setLabel(p.Cnd_chd_itm_grp_cd10_Label);
		p.Cnd_chd_itm_grp_nm10 = p.beansFactory.createTextField("Cnd.chd_itm_grp_nm10");
		p.Cnd_bom_chng_typ_Label = p.beansFactory.createLabel("Cnd.bom_chng_typ_Label");
		p.Cnd_bom_chng_typ = p.beansFactory.createTextComboBox("Cnd.bom_chng_typ");
		p.Cnd_bom_chng_typ.setLabel(p.Cnd_bom_chng_typ_Label);
		p.Cnd_bom_chng_typ_nm = p.beansFactory.createTextField("Cnd.bom_chng_typ_nm");
		p.Cnd_chng_st_dt_Label = p.beansFactory.createLabel("Cnd.chng_st_dt_Label");
		p.Cnd_chng_st_dt = p.beansFactory.createDateField("Cnd.chng_st_dt");
		p.Cnd_chng_st_dt.setLabel(p.Cnd_chng_st_dt_Label);
		p.Cnd_chng_end_dt_Label = p.beansFactory.createLabel("Cnd.chng_end_dt_Label");
		p.Cnd_chng_end_dt = p.beansFactory.createDateField("Cnd.chng_end_dt");
		p.Cnd_chng_end_dt.setLabel(p.Cnd_chng_end_dt_Label);
		p.Cnd_chng_wg_cd_Label = p.beansFactory.createLabel("Cnd.chng_wg_cd_Label");
		p.Cnd_chng_wg_cd = p.beansFactory.createTextComboBox("Cnd.chng_wg_cd");
		p.Cnd_chng_wg_cd.setLabel(p.Cnd_chng_wg_cd_Label);
		p.Cnd_chng_wg_nm = p.beansFactory.createTextField("Cnd.chng_wg_nm");
		p.Cnd_old_alt_itm_ratio_Label = p.beansFactory.createLabel("Cnd.old_alt_itm_ratio_Label");
		p.Cnd_old_alt_itm_ratio = p.beansFactory.createNumberField("Cnd.old_alt_itm_ratio");
		p.Cnd_old_alt_itm_ratio.setLabel(p.Cnd_old_alt_itm_ratio_Label);
		p.Cnd_old_alt_alloc_prio_Label = p.beansFactory.createLabel("Cnd.old_alt_alloc_prio_Label");
		p.Cnd_old_alt_alloc_prio = p.beansFactory.createNumberField("Cnd.old_alt_alloc_prio");
		p.Cnd_old_alt_alloc_prio.setLabel(p.Cnd_old_alt_alloc_prio_Label);
		p.Cnd_old_stk_mng_typ_Label = p.beansFactory.createLabel("Cnd.old_stk_mng_typ_Label");
		p.Cnd_old_stk_mng_typ = p.beansFactory.createTextField("Cnd.old_stk_mng_typ");
		p.Cnd_old_stk_mng_typ.setLabel(p.Cnd_old_stk_mng_typ_Label);
		p.Cnd_old_stk_mng_typ_nm = p.beansFactory.createTextField("Cnd.old_stk_mng_typ_nm");
		p.Cnd_old_asset_mng_typ_Label = p.beansFactory.createLabel("Cnd.old_asset_mng_typ_Label");
		p.Cnd_old_asset_mng_typ = p.beansFactory.createTextField("Cnd.old_asset_mng_typ");
		p.Cnd_old_asset_mng_typ.setLabel(p.Cnd_old_asset_mng_typ_Label);
		p.Cnd_old_asset_mng_typ_nm = p.beansFactory.createTextField("Cnd.old_asset_mng_typ_nm");
		p.Cnd_old_alt_grp_cd_Label = p.beansFactory.createLabel("Cnd.old_alt_grp_cd_Label");
		p.Cnd_old_alt_grp_cd = p.beansFactory.createTextComboBox("Cnd.old_alt_grp_cd");
		p.Cnd_old_alt_grp_cd.setLabel(p.Cnd_old_alt_grp_cd_Label);
		p.Cnd_old_alt_grp_nm = p.beansFactory.createTextField("Cnd.old_alt_grp_nm");
		p.Cnd_old_alt_itm_typ_Label = p.beansFactory.createLabel("Cnd.old_alt_itm_typ_Label");
		p.Cnd_old_alt_itm_typ = p.beansFactory.createTextComboBox("Cnd.old_alt_itm_typ");
		p.Cnd_old_alt_itm_typ.setLabel(p.Cnd_old_alt_itm_typ_Label);
		p.Cnd_old_alt_itm_typ_nm = p.beansFactory.createTextField("Cnd.old_alt_itm_typ_nm");
		p.Cnd_new_alt_itm_ratio_Label = p.beansFactory.createLabel("Cnd.new_alt_itm_ratio_Label");
		p.Cnd_new_alt_itm_ratio = p.beansFactory.createNumberField("Cnd.new_alt_itm_ratio");
		p.Cnd_new_alt_itm_ratio.setLabel(p.Cnd_new_alt_itm_ratio_Label);
		p.Cnd_new_alt_alloc_prio_Label = p.beansFactory.createLabel("Cnd.new_alt_alloc_prio_Label");
		p.Cnd_new_alt_alloc_prio = p.beansFactory.createNumberField("Cnd.new_alt_alloc_prio");
		p.Cnd_new_alt_alloc_prio.setLabel(p.Cnd_new_alt_alloc_prio_Label);
		p.Cnd_new_stk_mng_typ_Label = p.beansFactory.createLabel("Cnd.new_stk_mng_typ_Label");
		p.Cnd_new_stk_mng_typ = p.beansFactory.createTextField("Cnd.new_stk_mng_typ");
		p.Cnd_new_stk_mng_typ.setLabel(p.Cnd_new_stk_mng_typ_Label);
		p.Cnd_new_stk_mng_typ_nm = p.beansFactory.createTextField("Cnd.new_stk_mng_typ_nm");
		p.Cnd_new_asset_mng_typ_Label = p.beansFactory.createLabel("Cnd.new_asset_mng_typ_Label");
		p.Cnd_new_asset_mng_typ = p.beansFactory.createTextField("Cnd.new_asset_mng_typ");
		p.Cnd_new_asset_mng_typ.setLabel(p.Cnd_new_asset_mng_typ_Label);
		p.Cnd_new_asset_mng_typ_nm = p.beansFactory.createTextField("Cnd.new_asset_mng_typ_nm");
		p.Cnd_new_alt_grp_cd_Label = p.beansFactory.createLabel("Cnd.new_alt_grp_cd_Label");
		p.Cnd_new_alt_grp_cd = p.beansFactory.createTextComboBox("Cnd.new_alt_grp_cd");
		p.Cnd_new_alt_grp_cd.setLabel(p.Cnd_new_alt_grp_cd_Label);
		p.Cnd_new_alt_grp_nm = p.beansFactory.createTextField("Cnd.new_alt_grp_nm");
		p.Cnd_new_alt_itm_typ_Label = p.beansFactory.createLabel("Cnd.new_alt_itm_typ_Label");
		p.Cnd_new_alt_itm_typ = p.beansFactory.createTextComboBox("Cnd.new_alt_itm_typ");
		p.Cnd_new_alt_itm_typ.setLabel(p.Cnd_new_alt_itm_typ_Label);
		p.Cnd_new_alt_itm_typ_nm = p.beansFactory.createTextField("Cnd.new_alt_itm_typ_nm");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_srch_cmn = p.beansFactory.createButton("RPnl.srch_cmn");
		p.RPnl_srch_wg = p.beansFactory.createButton("RPnl.srch_wg");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_st_dt_Label = p.beansFactory.createLabel("BulkSet.st_dt_Label");
		p.BulkSet_st_dt = p.beansFactory.createDateField("BulkSet.st_dt");
		p.BulkSet_st_dt.setLabel(p.BulkSet_st_dt_Label);
		p.BulkSet_end_dt_Label = p.beansFactory.createLabel("BulkSet.end_dt_Label");
		p.BulkSet_end_dt = p.beansFactory.createDateField("BulkSet.end_dt");
		p.BulkSet_end_dt.setLabel(p.BulkSet_end_dt_Label);
		p.BulkSet_upd_dt = p.beansFactory.createButton("BulkSet.upd_dt");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_wg_nm = p.beansFactory.createTableColumn("Dtl.wg_nm", MCColumnType.TEXT);
		p.columnDtl_par_itm_typ = p.beansFactory.createTableColumn("Dtl.par_itm_typ", MCColumnType.TEXT);
		p.columnDtl_par_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.par_itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_par_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.par_itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDtl_par_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.par_itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_par_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.par_sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl_par_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.par_sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl_par_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.par_sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl_par_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.par_sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl_par_def_bom_ptn = p.beansFactory.createTableColumn("Dtl.par_def_bom_ptn", MCColumnType.TEXT);
		p.columnDtl_bom_ptn = p.beansFactory.createTableColumn("Dtl.bom_ptn", MCColumnType.TEXT);
		p.columnDtl_oper_cd = p.beansFactory.createTableColumn("Dtl.oper_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_oper_nm = p.beansFactory.createTableColumn("Dtl.oper_nm", MCColumnType.TEXT);
		p.columnDtl_oper_seq = p.beansFactory.createTableColumn("Dtl.oper_seq", MCColumnType.NUMBER);
		p.columnDtl_disp_seq = p.beansFactory.createTableColumn("Dtl.disp_seq", MCColumnType.NUMBER);
		p.columnDtl_chd_itm_typ = p.beansFactory.createTableColumn("Dtl.chd_itm_typ", MCColumnType.TEXT);
		p.columnDtl_chd_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.chd_itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_chd_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.chd_itm_typ_d_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_chd_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.chd_itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_chd_stk_mng_typ = p.beansFactory.createTableColumn("Dtl.chd_stk_mng_typ", MCColumnType.TEXT);
		p.columnDtl_chd_asset_mng_typ = p.beansFactory.createTableColumn("Dtl.chd_asset_mng_typ", MCColumnType.TEXT);
		p.columnDtl_par_dec_place = p.beansFactory.createTableColumn("Dtl.par_dec_place", MCColumnType.NUMBER);
		p.columnDtl_chd_dec_place = p.beansFactory.createTableColumn("Dtl.chd_dec_place", MCColumnType.NUMBER);
		p.columnDtl_lot_mng_typ = p.beansFactory.createTableColumn("Dtl.lot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sublot_mng_typ = p.beansFactory.createTableColumn("Dtl.sublot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_chd_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.chd_sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl_chd_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.chd_sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl_chd_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.chd_sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl_chd_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.chd_sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl_chd_def_bom_ptn = p.beansFactory.createTableColumn("Dtl.chd_def_bom_ptn", MCColumnType.TEXT);
		p.columnDtl_ver_flg = p.beansFactory.createTableColumn("Dtl.ver_flg", MCColumnType.CHECK);
		p.columnDtl_byprod_flg = p.beansFactory.createTableColumn("Dtl.byprod_flg", MCColumnType.CHECK);
		p.columnDtl_ph_flg = p.beansFactory.createTableColumn("Dtl.ph_flg", MCColumnType.CHECK);
		p.columnDtl_ph_bom_ptn = p.beansFactory.createTableColumn("Dtl.ph_bom_ptn", MCColumnType.TEXT);
		p.columnDtl_alt_itm_flg = p.beansFactory.createTableColumn("Dtl.alt_itm_flg", MCColumnType.CHECK);
		p.columnDtl_alt_grp_cd = p.beansFactory.createTableColumn("Dtl.alt_grp_cd", MCColumnType.TEXT_COMBO_FREE);
		p.columnDtl_alt_grp_nm = p.beansFactory.createTableColumn("Dtl.alt_grp_nm", MCColumnType.TEXT);
		p.columnDtl_alt_itm_typ = p.beansFactory.createTableColumn("Dtl.alt_itm_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_alt_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.alt_itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_alt_itm_ratio = p.beansFactory.createTableColumn("Dtl.alt_itm_ratio", MCColumnType.NUMBER);
		p.columnDtl_alt_alloc_prio = p.beansFactory.createTableColumn("Dtl.alt_alloc_prio", MCColumnType.NUMBER);
		p.columnDtl_sno_typ1 = p.beansFactory.createTableColumn("Dtl.sno_typ1", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno_typ_nm1 = p.beansFactory.createTableColumn("Dtl.sno_typ_nm1", MCColumnType.TEXT);
		p.columnDtl_sno_typ2 = p.beansFactory.createTableColumn("Dtl.sno_typ2", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno_typ_nm2 = p.beansFactory.createTableColumn("Dtl.sno_typ_nm2", MCColumnType.TEXT);
		p.columnDtl_sno_typ3 = p.beansFactory.createTableColumn("Dtl.sno_typ3", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno_typ_nm3 = p.beansFactory.createTableColumn("Dtl.sno_typ_nm3", MCColumnType.TEXT);
		p.columnDtl_sno_typ4 = p.beansFactory.createTableColumn("Dtl.sno_typ4", MCColumnType.TEXT_COMBO);
		p.columnDtl_sno_typ_nm4 = p.beansFactory.createTableColumn("Dtl.sno_typ_nm4", MCColumnType.TEXT);
		p.columnDtl_par_base_unit_cd = p.beansFactory.createTableColumn("Dtl.par_base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_par_base_unit_nm = p.beansFactory.createTableColumn("Dtl.par_base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_chd_base_unit_cd = p.beansFactory.createTableColumn("Dtl.chd_base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_chd_base_unit_nm = p.beansFactory.createTableColumn("Dtl.chd_base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_in_offst_typ = p.beansFactory.createTableColumn("Dtl.in_offst_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_in_offst_typ_nm = p.beansFactory.createTableColumn("Dtl.in_offst_typ_nm", MCColumnType.TEXT);
		p.columnDtl_in_offst = p.beansFactory.createTableColumn("Dtl.in_offst", MCColumnType.NUMBER);
		p.columnDtl_bkf_typ = p.beansFactory.createTableColumn("Dtl.bkf_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_bkf_typ_nm = p.beansFactory.createTableColumn("Dtl.bkf_typ_nm", MCColumnType.TEXT);
		p.columnDtl_inst_lot_fix_flg = p.beansFactory.createTableColumn("Dtl.inst_lot_fix_flg", MCColumnType.CHECK);
		p.columnDtl_lot_mix_flg = p.beansFactory.createTableColumn("Dtl.lot_mix_flg", MCColumnType.CHECK);
		p.columnDtl_sublot_mix_flg = p.beansFactory.createTableColumn("Dtl.sublot_mix_flg", MCColumnType.CHECK);
		p.columnDtl_alloc_ctl_typ = p.beansFactory.createTableColumn("Dtl.alloc_ctl_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_alloc_ctl_typ_nm = p.beansFactory.createTableColumn("Dtl.alloc_ctl_typ_nm", MCColumnType.TEXT);
		p.columnDtl_main_itm_flg = p.beansFactory.createTableColumn("Dtl.main_itm_flg", MCColumnType.CHECK);
		p.columnDtl_yield_calc_flg = p.beansFactory.createTableColumn("Dtl.yield_calc_flg", MCColumnType.CHECK);
		p.columnDtl_inpt_ctl_typ = p.beansFactory.createTableColumn("Dtl.inpt_ctl_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_inpt_ctl_typ_nm = p.beansFactory.createTableColumn("Dtl.inpt_ctl_typ_nm", MCColumnType.TEXT);
		p.columnDtl_chng_no = p.beansFactory.createTableColumn("Dtl.chng_no", MCColumnType.TEXT);
		p.columnDtl_ext_sys_no_bom = p.beansFactory.createTableColumn("Dtl.ext_sys_no_bom", MCColumnType.TEXT);
		p.columnDtl_not_cost_flg = p.beansFactory.createTableColumn("Dtl.not_cost_flg", MCColumnType.CHECK);
		p.columnDtl_memo1 = p.beansFactory.createTableColumn("Dtl.memo1", MCColumnType.TEXT);
		p.columnDtl_memo2 = p.beansFactory.createTableColumn("Dtl.memo2", MCColumnType.TEXT);
		p.columnDtl_memo3 = p.beansFactory.createTableColumn("Dtl.memo3", MCColumnType.TEXT);
		p.columnDtl_bom_key = p.beansFactory.createTableColumn("Dtl.bom_key", MCColumnType.TEXT);
		p.columnDtl_ins_usr_id = p.beansFactory.createTableColumn("Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_ts = p.beansFactory.createTableColumn("Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_ins_func_id = p.beansFactory.createTableColumn("Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm = p.beansFactory.createTableColumn("Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_cntr = p.beansFactory.createTableColumn("Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_upd_usr_id = p.beansFactory.createTableColumn("Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_upd_ts = p.beansFactory.createTableColumn("Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_func_id = p.beansFactory.createTableColumn("Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm = p.beansFactory.createTableColumn("Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtl_del_usr_id = p.beansFactory.createTableColumn("Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnDtl_del_usr_nm = p.beansFactory.createTableColumn("Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnDtl_del_ts = p.beansFactory.createTableColumn("Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MABSP0020 = p.beansFactory.createButton("Btn.open_MABSP0020", "open");
		p.Btn_open_MABSP0040 = p.beansFactory.createButton("Btn.open_MABSP0040", "open");
		p.Btn_open_MABSP0080 = p.beansFactory.createButton("Btn.open_MABSP0080", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd_cmn = p.beansFactory.createButton("Btn.upd_cmn", "upd");
		p.Btn_upd_wg = p.beansFactory.createButton("Btn.upd_wg", "upd");
		p.Btn_del_cmn = p.beansFactory.createButton("Btn.del_cmn", "del");
		p.Btn_del_wg = p.beansFactory.createButton("Btn.del_wg", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABSP_BomLst p) {
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
	protected static void jbInitRegTarget(MABSP_BomLst p) {
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
	protected static void jbInitTop(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.CndPanel);
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
	protected static void jbInitFold(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndTabPanel, null);
		p.FoldPanel.setLastBeans(p.CndTabPanel);
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCndTab(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.CndTabPanel.add(p.CndTabTab);
		p.CndTabPanel.setLastBeans(p.CndTabTab);
		p.CndTabPanel.setValueCheck(false);
		p.CndTabPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndTabPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.CndTabTab.add(p.Tab1Panel, "CndTab.tab1");
		p.CndTabTab.setLastBeans(p.Tab1Panel);
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.CndTabTab.add(p.Tab2Panel, "CndTab.tab2");
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.CndTabTab.add(p.Tab3Panel, "CndTab.tab3");
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		p.CndTabTab.add(p.Tab4Panel, "CndTab.tab4");
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.RPnlPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
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
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_CHNG);
		p.Cnd_ope_CHNG.setActionCommand("5");
		p.Cnd_ope_Group.add(p.Cnd_ope_CHNG);
		p.ScreenOpePanel.add(p.Cnd_ope_CHNG);
		p.Cnd_ope_CHNG.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.ope_META);
		p.RegTargetPanel.add(p.Cnd_cmn_flg);
		p.RegTargetPanel.setLastBeans(p.Cnd_cmn_flg);
		p.Cnd_cmn_flg.setNextBeans(p.Cnd_wg_flg);
		p.Cnd_cmn_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.cmn_flg_META);
		p.RegTargetPanel.add(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.wg_flg_META);
		p.Tab1Panel.add(p.Cnd_dt_PPanel);
		p.Tab1Panel.setLastBeans(p.Cnd_dt_PPanel);
		p.Cnd_dt_PPanel.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.Tab1Panel.add(p.Cnd_wg_cd_Label);
		p.Tab1Panel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.wg_cd_META);
		p.Tab1Panel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_chng_no);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Tab1Panel.add(p.Cnd_chng_no_Label);
		p.Tab1Panel.add(p.Cnd_chng_no);
		p.Cnd_chng_no.setNextBeans(p.Cnd_ext_sys_no_bom);
		p.Cnd_chng_no.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chng_no_META);
		p.setPluralValueEnable(p.Cnd_chng_no, true);
		p.Tab1Panel.add(p.Cnd_ext_sys_no_bom_Label);
		p.Tab1Panel.add(p.Cnd_ext_sys_no_bom);
		p.Cnd_ext_sys_no_bom.setNextBeans(p.Cnd_par_itm_typ_p_PPanel);
		p.Cnd_ext_sys_no_bom.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.ext_sys_no_bom_META);
		p.setPluralValueEnable(p.Cnd_ext_sys_no_bom, true);
		p.Tab1Panel.add(p.Cnd_par_itm_typ_p_PPanel);
		p.Cnd_par_itm_typ_p_PPanel.setNextBeans(p.Cnd_par_itm_p_PPanel);
		p.Tab1Panel.add(p.Cnd_par_itm_p_PPanel);
		p.Cnd_par_itm_p_PPanel.setNextBeans(p.Cnd_chd_itm_typ_p_PPanel);
		p.Tab1Panel.add(p.Cnd_chd_itm_typ_p_PPanel);
		p.Cnd_chd_itm_typ_p_PPanel.setNextBeans(p.Cnd_chd_itm_p_PPanel);
		p.Tab1Panel.add(p.Cnd_chd_itm_p_PPanel);
		p.Cnd_chd_itm_p_PPanel.setNextBeans(p.Cnd_ver_no_p_PPanel);
		p.Tab1Panel.add(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_alt_grp_cd);
		p.Tab1Panel.add(p.Cnd_alt_grp_cd_Label);
		p.Tab1Panel.add(p.Cnd_alt_grp_cd);
		p.Cnd_alt_grp_cd.setNextBeans(p.Cnd_oper_cd);
		p.Cnd_alt_grp_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.alt_grp_cd_META);
		p.setPluralValueEnable(p.Cnd_alt_grp_cd, true);
		p.Cnd_oper_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_oper_cd, true);
		p.Cnd_oper_cd.setLinkBeans(p.Cnd_oper_nm);
		p.Tab1Panel.add(p.Cnd_oper_cd_Label);
		p.Tab1Panel.add(p.Cnd_oper_cd);
		p.Cnd_oper_cd.setNextBeans(p.Cnd_oper_nm);
		p.Cnd_oper_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.oper_cd_META);
		p.Tab1Panel.add(p.Cnd_oper_nm);
		p.Cnd_oper_nm.setNextBeans(p.Cnd_bom_ptn);
		p.Cnd_oper_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.oper_nm_META);
		p.setPluralValueEnable(p.Cnd_oper_nm, true);
		p.Tab1Panel.add(p.Cnd_bom_ptn_Label);
		p.Tab1Panel.add(p.Cnd_bom_ptn);
		p.Cnd_bom_ptn.setNextBeans(p.Cnd_memo1);
		p.Cnd_bom_ptn.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.bom_ptn_META);
		p.setPluralValueEnable(p.Cnd_bom_ptn, true);
		p.Tab1Panel.add(p.Cnd_memo1_Label);
		p.Tab1Panel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.Tab1Panel.add(p.Cnd_memo2_Label);
		p.Tab1Panel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.Tab1Panel.add(p.Cnd_memo3_Label);
		p.Tab1Panel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.Tab1Panel.add(p.Cnd_del_flg_lab);
		p.Tab1Panel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.off_del_flg_META);
		p.Tab1Panel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.on_del_flg_META);
		p.Cnd_par_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd1, true);
		p.Cnd_par_itm_grp_cd1.setLinkBeans(p.Cnd_par_itm_grp_nm1);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd1_Label);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd1);
		p.Tab2Panel.setLastBeans(p.Cnd_par_itm_grp_cd1);
		p.Cnd_par_itm_grp_cd1.setNextBeans(p.Cnd_par_itm_grp_nm1);
		p.Cnd_par_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.par_itm_grp_cd1_META);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_nm1);
		p.Cnd_par_itm_grp_nm1.setNextBeans(p.Cnd_par_itm_grp_cd2);
		p.Cnd_par_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.par_itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm1, true);
		p.Cnd_par_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd2, true);
		p.Cnd_par_itm_grp_cd2.setLinkBeans(p.Cnd_par_itm_grp_nm2);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd2_Label);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd2);
		p.Cnd_par_itm_grp_cd2.setNextBeans(p.Cnd_par_itm_grp_nm2);
		p.Cnd_par_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.par_itm_grp_cd2_META);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_nm2);
		p.Cnd_par_itm_grp_nm2.setNextBeans(p.Cnd_par_itm_grp_cd3);
		p.Cnd_par_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.par_itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm2, true);
		p.Cnd_par_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd3, true);
		p.Cnd_par_itm_grp_cd3.setLinkBeans(p.Cnd_par_itm_grp_nm3);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd3_Label);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd3);
		p.Cnd_par_itm_grp_cd3.setNextBeans(p.Cnd_par_itm_grp_nm3);
		p.Cnd_par_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.par_itm_grp_cd3_META);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_nm3);
		p.Cnd_par_itm_grp_nm3.setNextBeans(p.Cnd_par_itm_grp_cd4);
		p.Cnd_par_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.par_itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm3, true);
		p.Cnd_par_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd4, true);
		p.Cnd_par_itm_grp_cd4.setLinkBeans(p.Cnd_par_itm_grp_nm4);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd4_Label);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd4);
		p.Cnd_par_itm_grp_cd4.setNextBeans(p.Cnd_par_itm_grp_nm4);
		p.Cnd_par_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.par_itm_grp_cd4_META);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_nm4);
		p.Cnd_par_itm_grp_nm4.setNextBeans(p.Cnd_par_itm_grp_cd5);
		p.Cnd_par_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.par_itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm4, true);
		p.Cnd_par_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd5, true);
		p.Cnd_par_itm_grp_cd5.setLinkBeans(p.Cnd_par_itm_grp_nm5);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd5_Label);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd5);
		p.Cnd_par_itm_grp_cd5.setNextBeans(p.Cnd_par_itm_grp_nm5);
		p.Cnd_par_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.par_itm_grp_cd5_META);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_nm5);
		p.Cnd_par_itm_grp_nm5.setNextBeans(p.Cnd_par_itm_grp_cd6);
		p.Cnd_par_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.par_itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm5, true);
		p.Cnd_par_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd6, true);
		p.Cnd_par_itm_grp_cd6.setLinkBeans(p.Cnd_par_itm_grp_nm6);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd6_Label);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd6);
		p.Cnd_par_itm_grp_cd6.setNextBeans(p.Cnd_par_itm_grp_nm6);
		p.Cnd_par_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.par_itm_grp_cd6_META);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_nm6);
		p.Cnd_par_itm_grp_nm6.setNextBeans(p.Cnd_par_itm_grp_cd7);
		p.Cnd_par_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.par_itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm6, true);
		p.Cnd_par_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd7, true);
		p.Cnd_par_itm_grp_cd7.setLinkBeans(p.Cnd_par_itm_grp_nm7);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd7_Label);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd7);
		p.Cnd_par_itm_grp_cd7.setNextBeans(p.Cnd_par_itm_grp_nm7);
		p.Cnd_par_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.par_itm_grp_cd7_META);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_nm7);
		p.Cnd_par_itm_grp_nm7.setNextBeans(p.Cnd_par_itm_grp_cd8);
		p.Cnd_par_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.par_itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm7, true);
		p.Cnd_par_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd8, true);
		p.Cnd_par_itm_grp_cd8.setLinkBeans(p.Cnd_par_itm_grp_nm8);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd8_Label);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd8);
		p.Cnd_par_itm_grp_cd8.setNextBeans(p.Cnd_par_itm_grp_nm8);
		p.Cnd_par_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.par_itm_grp_cd8_META);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_nm8);
		p.Cnd_par_itm_grp_nm8.setNextBeans(p.Cnd_par_itm_grp_cd9);
		p.Cnd_par_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.par_itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm8, true);
		p.Cnd_par_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd9, true);
		p.Cnd_par_itm_grp_cd9.setLinkBeans(p.Cnd_par_itm_grp_nm9);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd9_Label);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd9);
		p.Cnd_par_itm_grp_cd9.setNextBeans(p.Cnd_par_itm_grp_nm9);
		p.Cnd_par_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.par_itm_grp_cd9_META);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_nm9);
		p.Cnd_par_itm_grp_nm9.setNextBeans(p.Cnd_par_itm_grp_cd10);
		p.Cnd_par_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.par_itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm9, true);
		p.Cnd_par_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd10, true);
		p.Cnd_par_itm_grp_cd10.setLinkBeans(p.Cnd_par_itm_grp_nm10);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd10_Label);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd10);
		p.Cnd_par_itm_grp_cd10.setNextBeans(p.Cnd_par_itm_grp_nm10);
		p.Cnd_par_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.par_itm_grp_cd10_META);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_nm10);
		p.Cnd_par_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.par_itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm10, true);
		p.Cnd_chd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_cd1, true);
		p.Cnd_chd_itm_grp_cd1.setLinkBeans(p.Cnd_chd_itm_grp_nm1);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd1_Label);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd1);
		p.Tab3Panel.setLastBeans(p.Cnd_chd_itm_grp_cd1);
		p.Cnd_chd_itm_grp_cd1.setNextBeans(p.Cnd_chd_itm_grp_nm1);
		p.Cnd_chd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chd_itm_grp_cd1_META);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_nm1);
		p.Cnd_chd_itm_grp_nm1.setNextBeans(p.Cnd_chd_itm_grp_cd2);
		p.Cnd_chd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chd_itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_nm1, true);
		p.Cnd_chd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_cd2, true);
		p.Cnd_chd_itm_grp_cd2.setLinkBeans(p.Cnd_chd_itm_grp_nm2);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd2_Label);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd2);
		p.Cnd_chd_itm_grp_cd2.setNextBeans(p.Cnd_chd_itm_grp_nm2);
		p.Cnd_chd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chd_itm_grp_cd2_META);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_nm2);
		p.Cnd_chd_itm_grp_nm2.setNextBeans(p.Cnd_chd_itm_grp_cd3);
		p.Cnd_chd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chd_itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_nm2, true);
		p.Cnd_chd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_cd3, true);
		p.Cnd_chd_itm_grp_cd3.setLinkBeans(p.Cnd_chd_itm_grp_nm3);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd3_Label);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd3);
		p.Cnd_chd_itm_grp_cd3.setNextBeans(p.Cnd_chd_itm_grp_nm3);
		p.Cnd_chd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chd_itm_grp_cd3_META);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_nm3);
		p.Cnd_chd_itm_grp_nm3.setNextBeans(p.Cnd_chd_itm_grp_cd4);
		p.Cnd_chd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chd_itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_nm3, true);
		p.Cnd_chd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_cd4, true);
		p.Cnd_chd_itm_grp_cd4.setLinkBeans(p.Cnd_chd_itm_grp_nm4);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd4_Label);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd4);
		p.Cnd_chd_itm_grp_cd4.setNextBeans(p.Cnd_chd_itm_grp_nm4);
		p.Cnd_chd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chd_itm_grp_cd4_META);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_nm4);
		p.Cnd_chd_itm_grp_nm4.setNextBeans(p.Cnd_chd_itm_grp_cd5);
		p.Cnd_chd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chd_itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_nm4, true);
		p.Cnd_chd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_cd5, true);
		p.Cnd_chd_itm_grp_cd5.setLinkBeans(p.Cnd_chd_itm_grp_nm5);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd5_Label);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd5);
		p.Cnd_chd_itm_grp_cd5.setNextBeans(p.Cnd_chd_itm_grp_nm5);
		p.Cnd_chd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chd_itm_grp_cd5_META);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_nm5);
		p.Cnd_chd_itm_grp_nm5.setNextBeans(p.Cnd_chd_itm_grp_cd6);
		p.Cnd_chd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chd_itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_nm5, true);
		p.Cnd_chd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_cd6, true);
		p.Cnd_chd_itm_grp_cd6.setLinkBeans(p.Cnd_chd_itm_grp_nm6);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd6_Label);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd6);
		p.Cnd_chd_itm_grp_cd6.setNextBeans(p.Cnd_chd_itm_grp_nm6);
		p.Cnd_chd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chd_itm_grp_cd6_META);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_nm6);
		p.Cnd_chd_itm_grp_nm6.setNextBeans(p.Cnd_chd_itm_grp_cd7);
		p.Cnd_chd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chd_itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_nm6, true);
		p.Cnd_chd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_cd7, true);
		p.Cnd_chd_itm_grp_cd7.setLinkBeans(p.Cnd_chd_itm_grp_nm7);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd7_Label);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd7);
		p.Cnd_chd_itm_grp_cd7.setNextBeans(p.Cnd_chd_itm_grp_nm7);
		p.Cnd_chd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chd_itm_grp_cd7_META);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_nm7);
		p.Cnd_chd_itm_grp_nm7.setNextBeans(p.Cnd_chd_itm_grp_cd8);
		p.Cnd_chd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chd_itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_nm7, true);
		p.Cnd_chd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_cd8, true);
		p.Cnd_chd_itm_grp_cd8.setLinkBeans(p.Cnd_chd_itm_grp_nm8);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd8_Label);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd8);
		p.Cnd_chd_itm_grp_cd8.setNextBeans(p.Cnd_chd_itm_grp_nm8);
		p.Cnd_chd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chd_itm_grp_cd8_META);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_nm8);
		p.Cnd_chd_itm_grp_nm8.setNextBeans(p.Cnd_chd_itm_grp_cd9);
		p.Cnd_chd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chd_itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_nm8, true);
		p.Cnd_chd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_cd9, true);
		p.Cnd_chd_itm_grp_cd9.setLinkBeans(p.Cnd_chd_itm_grp_nm9);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd9_Label);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd9);
		p.Cnd_chd_itm_grp_cd9.setNextBeans(p.Cnd_chd_itm_grp_nm9);
		p.Cnd_chd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chd_itm_grp_cd9_META);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_nm9);
		p.Cnd_chd_itm_grp_nm9.setNextBeans(p.Cnd_chd_itm_grp_cd10);
		p.Cnd_chd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chd_itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_nm9, true);
		p.Cnd_chd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_cd10, true);
		p.Cnd_chd_itm_grp_cd10.setLinkBeans(p.Cnd_chd_itm_grp_nm10);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd10_Label);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd10);
		p.Cnd_chd_itm_grp_cd10.setNextBeans(p.Cnd_chd_itm_grp_nm10);
		p.Cnd_chd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chd_itm_grp_cd10_META);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_nm10);
		p.Cnd_chd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chd_itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_nm10, true);
		p.Cnd_bom_chng_typ.setListType(MCListType.STRICT);
		p.Cnd_bom_chng_typ.setLinkBeans(p.Cnd_bom_chng_typ_nm);
		p.Tab4Panel.add(p.Cnd_bom_chng_typ_Label);
		p.Tab4Panel.add(p.Cnd_bom_chng_typ);
		p.Tab4Panel.setLastBeans(p.Cnd_bom_chng_typ);
		p.Cnd_bom_chng_typ.setNextBeans(p.Cnd_bom_chng_typ_nm);
		p.Cnd_bom_chng_typ.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.bom_chng_typ_META);
		p.Tab4Panel.add(p.Cnd_bom_chng_typ_nm);
		p.Cnd_bom_chng_typ_nm.setNextBeans(p.Cnd_chng_st_dt);
		p.Cnd_bom_chng_typ_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.bom_chng_typ_nm_META);
		p.Tab4Panel.add(p.Cnd_chng_st_dt_Label);
		p.Tab4Panel.add(p.Cnd_chng_st_dt);
		p.Cnd_chng_st_dt.setNextBeans(p.Cnd_chng_end_dt);
		p.Cnd_chng_st_dt.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chng_st_dt_META);
		p.Cnd_chng_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Tab4Panel.add(p.Cnd_chng_end_dt_Label);
		p.Tab4Panel.add(p.Cnd_chng_end_dt);
		p.Cnd_chng_end_dt.setNextBeans(p.Cnd_chng_wg_cd);
		p.Cnd_chng_end_dt.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chng_end_dt_META);
		p.Cnd_chng_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_chng_wg_cd.setListType(MCListType.STRICT);
		p.Cnd_chng_wg_cd.setLinkBeans(p.Cnd_chng_wg_nm);
		p.Tab4Panel.add(p.Cnd_chng_wg_cd_Label);
		p.Tab4Panel.add(p.Cnd_chng_wg_cd);
		p.Cnd_chng_wg_cd.setNextBeans(p.Cnd_chng_wg_nm);
		p.Cnd_chng_wg_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chng_wg_cd_META);
		p.Tab4Panel.add(p.Cnd_chng_wg_nm);
		p.Cnd_chng_wg_nm.setNextBeans(p.Cnd_old_itm_p_PPanel);
		p.Cnd_chng_wg_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.chng_wg_nm_META);
		p.Tab4Panel.add(p.Cnd_old_itm_p_PPanel);
		p.Cnd_old_itm_p_PPanel.setNextBeans(p.Cnd_old_ver_no_p_PPanel);
		p.Cnd_old_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_old_itm_nm,p.Cnd_old_itm_sub1,p.Cnd_old_itm_sub2,p.Cnd_old_itm_sub3,p.Cnd_old_stk_mng_typ,p.Cnd_old_stk_mng_typ_nm,p.Cnd_old_asset_mng_typ,p.Cnd_old_asset_mng_typ_nm);
		p.Cnd_old_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_old_itm_nm,p.Cnd_old_itm_sub2,p.Cnd_old_itm_sub3,p.Cnd_old_stk_mng_typ,p.Cnd_old_stk_mng_typ_nm,p.Cnd_old_asset_mng_typ,p.Cnd_old_asset_mng_typ_nm);
		p.Cnd_old_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_old_itm_nm,p.Cnd_old_itm_sub3,p.Cnd_old_stk_mng_typ,p.Cnd_old_stk_mng_typ_nm,p.Cnd_old_asset_mng_typ,p.Cnd_old_asset_mng_typ_nm);
		p.Cnd_old_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_old_itm_nm,p.Cnd_old_stk_mng_typ,p.Cnd_old_stk_mng_typ_nm,p.Cnd_old_asset_mng_typ,p.Cnd_old_asset_mng_typ_nm);
		p.Tab4Panel.add(p.Cnd_old_ver_no_p_PPanel);
		p.Cnd_old_ver_no_p_PPanel.setNextBeans(p.Cnd_old_alt_itm_ratio);
		p.Tab4Panel.add(p.Cnd_old_alt_itm_ratio_Label);
		p.Tab4Panel.add(p.Cnd_old_alt_itm_ratio);
		p.Cnd_old_alt_itm_ratio.setNextBeans(p.Cnd_old_alt_alloc_prio);
		p.Cnd_old_alt_itm_ratio.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.old_alt_itm_ratio_META);
		p.Tab4Panel.add(p.Cnd_old_alt_alloc_prio_Label);
		p.Tab4Panel.add(p.Cnd_old_alt_alloc_prio);
		p.Cnd_old_alt_alloc_prio.setNextBeans(p.Cnd_old_stk_mng_typ);
		p.Cnd_old_alt_alloc_prio.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.old_alt_alloc_prio_META);
		p.Tab4Panel.add(p.Cnd_old_stk_mng_typ_Label);
		p.Tab4Panel.add(p.Cnd_old_stk_mng_typ);
		p.Cnd_old_stk_mng_typ.setNextBeans(p.Cnd_old_stk_mng_typ_nm);
		p.Cnd_old_stk_mng_typ.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.old_stk_mng_typ_META);
		p.Tab4Panel.add(p.Cnd_old_stk_mng_typ_nm);
		p.Cnd_old_stk_mng_typ_nm.setNextBeans(p.Cnd_old_asset_mng_typ);
		p.Cnd_old_stk_mng_typ_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.old_stk_mng_typ_nm_META);
		p.Tab4Panel.add(p.Cnd_old_asset_mng_typ_Label);
		p.Tab4Panel.add(p.Cnd_old_asset_mng_typ);
		p.Cnd_old_asset_mng_typ.setNextBeans(p.Cnd_old_asset_mng_typ_nm);
		p.Cnd_old_asset_mng_typ.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.old_asset_mng_typ_META);
		p.Tab4Panel.add(p.Cnd_old_asset_mng_typ_nm);
		p.Cnd_old_asset_mng_typ_nm.setNextBeans(p.Cnd_old_alt_grp_cd);
		p.Cnd_old_asset_mng_typ_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.old_asset_mng_typ_nm_META);
		p.Cnd_old_alt_grp_cd.setListType(MCListType.STRICT);
		p.Cnd_old_alt_grp_cd.setLinkBeans(p.Cnd_old_alt_grp_nm,p.Cnd_old_alt_itm_typ);
		p.Tab4Panel.add(p.Cnd_old_alt_grp_cd_Label);
		p.Tab4Panel.add(p.Cnd_old_alt_grp_cd);
		p.Cnd_old_alt_grp_cd.setNextBeans(p.Cnd_old_alt_grp_nm);
		p.Cnd_old_alt_grp_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.old_alt_grp_cd_META);
		p.Tab4Panel.add(p.Cnd_old_alt_grp_nm);
		p.Cnd_old_alt_grp_nm.setNextBeans(p.Cnd_old_alt_itm_typ);
		p.Cnd_old_alt_grp_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.old_alt_grp_nm_META);
		p.Cnd_old_alt_itm_typ.setListType(MCListType.STRICT);
		p.Cnd_old_alt_itm_typ.setLinkBeans(p.Cnd_old_alt_itm_typ_nm);
		p.Tab4Panel.add(p.Cnd_old_alt_itm_typ_Label);
		p.Tab4Panel.add(p.Cnd_old_alt_itm_typ);
		p.Cnd_old_alt_itm_typ.setNextBeans(p.Cnd_old_alt_itm_typ_nm);
		p.Cnd_old_alt_itm_typ.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.old_alt_itm_typ_META);
		p.Tab4Panel.add(p.Cnd_old_alt_itm_typ_nm);
		p.Cnd_old_alt_itm_typ_nm.setNextBeans(p.Cnd_new_itm_p_PPanel);
		p.Cnd_old_alt_itm_typ_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.old_alt_itm_typ_nm_META);
		p.Tab4Panel.add(p.Cnd_new_itm_p_PPanel);
		p.Cnd_new_itm_p_PPanel.setNextBeans(p.Cnd_new_ver_no_p_PPanel);
		p.Cnd_new_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_new_itm_nm,p.Cnd_new_itm_sub1,p.Cnd_new_itm_sub2,p.Cnd_new_itm_sub3,p.Cnd_new_stk_mng_typ,p.Cnd_new_stk_mng_typ_nm,p.Cnd_new_asset_mng_typ,p.Cnd_new_asset_mng_typ_nm);
		p.Cnd_new_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_new_itm_nm,p.Cnd_new_itm_sub2,p.Cnd_new_itm_sub3,p.Cnd_new_stk_mng_typ,p.Cnd_new_stk_mng_typ_nm,p.Cnd_new_asset_mng_typ,p.Cnd_new_asset_mng_typ_nm);
		p.Cnd_new_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_new_itm_nm,p.Cnd_new_itm_sub3,p.Cnd_new_stk_mng_typ,p.Cnd_new_stk_mng_typ_nm,p.Cnd_new_asset_mng_typ,p.Cnd_new_asset_mng_typ_nm);
		p.Cnd_new_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_new_itm_nm,p.Cnd_new_stk_mng_typ,p.Cnd_new_stk_mng_typ_nm,p.Cnd_new_asset_mng_typ,p.Cnd_new_asset_mng_typ_nm);
		p.Tab4Panel.add(p.Cnd_new_ver_no_p_PPanel);
		p.Cnd_new_ver_no_p_PPanel.setNextBeans(p.Cnd_new_alt_itm_ratio);
		p.Tab4Panel.add(p.Cnd_new_alt_itm_ratio_Label);
		p.Tab4Panel.add(p.Cnd_new_alt_itm_ratio);
		p.Cnd_new_alt_itm_ratio.setNextBeans(p.Cnd_new_alt_alloc_prio);
		p.Cnd_new_alt_itm_ratio.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.new_alt_itm_ratio_META);
		p.Tab4Panel.add(p.Cnd_new_alt_alloc_prio_Label);
		p.Tab4Panel.add(p.Cnd_new_alt_alloc_prio);
		p.Cnd_new_alt_alloc_prio.setNextBeans(p.Cnd_new_stk_mng_typ);
		p.Cnd_new_alt_alloc_prio.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.new_alt_alloc_prio_META);
		p.Tab4Panel.add(p.Cnd_new_stk_mng_typ_Label);
		p.Tab4Panel.add(p.Cnd_new_stk_mng_typ);
		p.Cnd_new_stk_mng_typ.setNextBeans(p.Cnd_new_stk_mng_typ_nm);
		p.Cnd_new_stk_mng_typ.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.new_stk_mng_typ_META);
		p.Tab4Panel.add(p.Cnd_new_stk_mng_typ_nm);
		p.Cnd_new_stk_mng_typ_nm.setNextBeans(p.Cnd_new_asset_mng_typ);
		p.Cnd_new_stk_mng_typ_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.new_stk_mng_typ_nm_META);
		p.Tab4Panel.add(p.Cnd_new_asset_mng_typ_Label);
		p.Tab4Panel.add(p.Cnd_new_asset_mng_typ);
		p.Cnd_new_asset_mng_typ.setNextBeans(p.Cnd_new_asset_mng_typ_nm);
		p.Cnd_new_asset_mng_typ.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.new_asset_mng_typ_META);
		p.Tab4Panel.add(p.Cnd_new_asset_mng_typ_nm);
		p.Cnd_new_asset_mng_typ_nm.setNextBeans(p.Cnd_new_alt_grp_cd);
		p.Cnd_new_asset_mng_typ_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.new_asset_mng_typ_nm_META);
		p.Cnd_new_alt_grp_cd.setListType(MCListType.FREE);
		p.Cnd_new_alt_grp_cd.setLinkBeans(p.Cnd_new_alt_grp_nm,p.Cnd_new_alt_itm_typ);
		p.Tab4Panel.add(p.Cnd_new_alt_grp_cd_Label);
		p.Tab4Panel.add(p.Cnd_new_alt_grp_cd);
		p.Cnd_new_alt_grp_cd.setNextBeans(p.Cnd_new_alt_grp_nm);
		p.Cnd_new_alt_grp_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.new_alt_grp_cd_META);
		p.Tab4Panel.add(p.Cnd_new_alt_grp_nm);
		p.Cnd_new_alt_grp_nm.setNextBeans(p.Cnd_new_alt_itm_typ);
		p.Cnd_new_alt_grp_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.new_alt_grp_nm_META);
		p.Cnd_new_alt_itm_typ.setListType(MCListType.STRICT);
		p.Cnd_new_alt_itm_typ.setLinkBeans(p.Cnd_new_alt_itm_typ_nm);
		p.Tab4Panel.add(p.Cnd_new_alt_itm_typ_Label);
		p.Tab4Panel.add(p.Cnd_new_alt_itm_typ);
		p.Cnd_new_alt_itm_typ.setNextBeans(p.Cnd_new_alt_itm_typ_nm);
		p.Cnd_new_alt_itm_typ.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.new_alt_itm_typ_META);
		p.Tab4Panel.add(p.Cnd_new_alt_itm_typ_nm);
		p.Cnd_new_alt_itm_typ_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0030.CndR.new_alt_itm_typ_nm_META);
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab4(MABSP_BomLst p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRPnl(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.add(p.RPnlPanel);
		p.RPnlPanel.setNextBeans(p.BulkSetPanel);
		p.RPnlPanel.setValueCheck(false);
		p.RPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RPnlPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
		p.RPnl_srch_cmn.setIcon("SEARCH");
		p.RPnl_srch_cmn.setFunctionKey(MCFunctionKey.F1);
		p.RPnlPanel.add(p.RPnl_srch_cmn);
		p.RPnlPanel.setLastBeans(p.RPnl_srch_cmn);
		p.RPnl_srch_cmn.setNextBeans(p.RPnl_srch_wg);
		p.RPnl_srch_wg.setIcon("SEARCH");
		p.RPnl_srch_wg.setFunctionKey(MCFunctionKey.F1);
		p.RPnlPanel.add(p.RPnl_srch_wg);
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBulkSet(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.DtlPanel);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_st_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_st_dt);
		p.BulkSetPanel.setLastBeans(p.BulkSet_st_dt);
		p.BulkSet_st_dt.setNextBeans(p.BulkSet_end_dt);
		p.BulkSet_st_dt.setRow(p.getBulkSetR(), mcframe.clientMABS.MABSP0030.BulkSetR.st_dt_META);
		p.BulkSet_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_end_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_end_dt);
		p.BulkSet_end_dt.setNextBeans(p.BulkSet_upd_dt);
		p.BulkSet_end_dt.setRow(p.getBulkSetR(), mcframe.clientMABS.MABSP0030.BulkSetR.end_dt_META);
		p.BulkSet_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSet_upd_dt.setFunctionKey(MCFunctionKey.F7);
		p.BulkSetPanel.add(p.BulkSet_upd_dt);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABSP_BomLst p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MABSP0020.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MABSP0020);
		p.BtnPanel.setLastBeans(p.Btn_open_MABSP0020);
		p.Btn_open_MABSP0020.setNextBeans(p.Btn_open_MABSP0040);
		p.Btn_open_MABSP0040.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MABSP0040);
		p.Btn_open_MABSP0040.setNextBeans(p.Btn_open_MABSP0080);
		p.Btn_open_MABSP0080.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_open_MABSP0080);
		p.Btn_open_MABSP0080.setNextBeans(p.Btn_select_all);
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
		p.Btn_rcopy.setNextBeans(p.Btn_upd_cmn);
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
	protected static void jbInitEastBtn(MABSP_BomLst p) {
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
		MABSP_BomLst_MC.mcInitScreenOpe((MABSP_BomLst)this);
		MABSP_BomLst_MC.mcInitRegTarget((MABSP_BomLst)this);
		MABSP_BomLst_MC.mcInitTop((MABSP_BomLst)this);
		MABSP_BomLst_MC.mcInitFold((MABSP_BomLst)this);
		MABSP_BomLst_MC.mcInitCndTab((MABSP_BomLst)this);
		MABSP_BomLst_MC.mcInitCnd((MABSP_BomLst)this);
		MABSP_BomLst_MC.mcInitTab1((MABSP_BomLst)this);
		MABSP_BomLst_MC.mcInitTab2((MABSP_BomLst)this);
		MABSP_BomLst_MC.mcInitTab3((MABSP_BomLst)this);
		MABSP_BomLst_MC.mcInitTab4((MABSP_BomLst)this);
		MABSP_BomLst_MC.mcInitCtrl((MABSP_BomLst)this);
		MABSP_BomLst_MC.mcInitRPnl((MABSP_BomLst)this);
		MABSP_BomLst_MC.mcInitBulkSet((MABSP_BomLst)this);
		MABSP_BomLst_MC.mcInitDtl((MABSP_BomLst)this);
		MABSP_BomLst_MC.mcInitBtn((MABSP_BomLst)this);
		MABSP_BomLst_MC.mcInitEastBtn((MABSP_BomLst)this);

		// [UPD]ステータスのモードの設定
		MABSP_BomLst_MC.statusInitUPD_ScreenOpe((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitUPD_RegTarget((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitUPD_Top((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitUPD_Fold((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitUPD_CndTab((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitUPD_Cnd((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitUPD_Tab1((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitUPD_Tab2((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitUPD_Tab3((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitUPD_Tab4((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitUPD_Ctrl((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitUPD_RPnl((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitUPD_BulkSet((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitUPD_Dtl((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitUPD_Btn((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitUPD_EastBtn((MABSP_BomLst)this);

		// [FIX]ステータスのモードの設定
		MABSP_BomLst_MC.statusInitFIX_ScreenOpe((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitFIX_RegTarget((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitFIX_Top((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitFIX_Fold((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitFIX_CndTab((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitFIX_Cnd((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitFIX_Tab1((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitFIX_Tab2((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitFIX_Tab3((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitFIX_Tab4((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitFIX_Ctrl((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitFIX_RPnl((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitFIX_BulkSet((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitFIX_Dtl((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitFIX_Btn((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitFIX_EastBtn((MABSP_BomLst)this);

		// [DEL]ステータスのモードの設定
		MABSP_BomLst_MC.statusInitDEL_ScreenOpe((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitDEL_RegTarget((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitDEL_Top((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitDEL_Fold((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitDEL_CndTab((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitDEL_Cnd((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitDEL_Tab1((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitDEL_Tab2((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitDEL_Tab3((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitDEL_Tab4((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitDEL_Ctrl((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitDEL_RPnl((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitDEL_BulkSet((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitDEL_Dtl((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitDEL_Btn((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitDEL_EastBtn((MABSP_BomLst)this);

		// [REF]ステータスのモードの設定
		MABSP_BomLst_MC.statusInitREF_ScreenOpe((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitREF_RegTarget((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitREF_Top((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitREF_Fold((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitREF_CndTab((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitREF_Cnd((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitREF_Tab1((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitREF_Tab2((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitREF_Tab3((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitREF_Tab4((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitREF_Ctrl((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitREF_RPnl((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitREF_BulkSet((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitREF_Dtl((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitREF_Btn((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitREF_EastBtn((MABSP_BomLst)this);

		// [CHNG]ステータスのモードの設定
		MABSP_BomLst_MC.statusInitCHNG_ScreenOpe((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitCHNG_RegTarget((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitCHNG_Top((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitCHNG_Fold((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitCHNG_CndTab((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitCHNG_Cnd((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitCHNG_Tab1((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitCHNG_Tab2((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitCHNG_Tab3((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitCHNG_Tab4((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitCHNG_Ctrl((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitCHNG_RPnl((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitCHNG_BulkSet((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitCHNG_Dtl((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitCHNG_Btn((MABSP_BomLst)this);
		MABSP_BomLst_MC.statusInitCHNG_EastBtn((MABSP_BomLst)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABSP_BomLst p) {
	}

	/**
	 *  [RegTarget]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRegTarget(MABSP_BomLst p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABSP_BomLst p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABSP_BomLst p) {
	}

	/**
	 *  [CndTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCndTab(MABSP_BomLst p) {
		p.CndTabTab.addAllListener(p);
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABSP_BomLst p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_CHNG.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_cmn_flg.addAllListener(p);
		p.Cnd_wg_flg.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_chng_no.setListListener(p);
		p.Cnd_chng_no.addAllListener(p);
		p.Cnd_ext_sys_no_bom.setListListener(p);
		p.Cnd_ext_sys_no_bom.addAllListener(p);
		p.Cnd_alt_grp_cd.setListListener(p);
		p.Cnd_alt_grp_cd.addAllListener(p);
		p.Cnd_oper_cd.setListListener(p);
		p.Cnd_oper_cd.addAllListener(p);
		p.Cnd_oper_nm.setListListener(p);
		p.Cnd_oper_nm.addAllListener(p);
		p.Cnd_bom_ptn.setListListener(p);
		p.Cnd_bom_ptn.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
		p.Cnd_par_itm_grp_cd1.setListListener(p);
		p.Cnd_par_itm_grp_cd1.addAllListener(p);
		p.Cnd_par_itm_grp_nm1.setListListener(p);
		p.Cnd_par_itm_grp_nm1.addAllListener(p);
		p.Cnd_par_itm_grp_cd2.setListListener(p);
		p.Cnd_par_itm_grp_cd2.addAllListener(p);
		p.Cnd_par_itm_grp_nm2.setListListener(p);
		p.Cnd_par_itm_grp_nm2.addAllListener(p);
		p.Cnd_par_itm_grp_cd3.setListListener(p);
		p.Cnd_par_itm_grp_cd3.addAllListener(p);
		p.Cnd_par_itm_grp_nm3.setListListener(p);
		p.Cnd_par_itm_grp_nm3.addAllListener(p);
		p.Cnd_par_itm_grp_cd4.setListListener(p);
		p.Cnd_par_itm_grp_cd4.addAllListener(p);
		p.Cnd_par_itm_grp_nm4.setListListener(p);
		p.Cnd_par_itm_grp_nm4.addAllListener(p);
		p.Cnd_par_itm_grp_cd5.setListListener(p);
		p.Cnd_par_itm_grp_cd5.addAllListener(p);
		p.Cnd_par_itm_grp_nm5.setListListener(p);
		p.Cnd_par_itm_grp_nm5.addAllListener(p);
		p.Cnd_par_itm_grp_cd6.setListListener(p);
		p.Cnd_par_itm_grp_cd6.addAllListener(p);
		p.Cnd_par_itm_grp_nm6.setListListener(p);
		p.Cnd_par_itm_grp_nm6.addAllListener(p);
		p.Cnd_par_itm_grp_cd7.setListListener(p);
		p.Cnd_par_itm_grp_cd7.addAllListener(p);
		p.Cnd_par_itm_grp_nm7.setListListener(p);
		p.Cnd_par_itm_grp_nm7.addAllListener(p);
		p.Cnd_par_itm_grp_cd8.setListListener(p);
		p.Cnd_par_itm_grp_cd8.addAllListener(p);
		p.Cnd_par_itm_grp_nm8.setListListener(p);
		p.Cnd_par_itm_grp_nm8.addAllListener(p);
		p.Cnd_par_itm_grp_cd9.setListListener(p);
		p.Cnd_par_itm_grp_cd9.addAllListener(p);
		p.Cnd_par_itm_grp_nm9.setListListener(p);
		p.Cnd_par_itm_grp_nm9.addAllListener(p);
		p.Cnd_par_itm_grp_cd10.setListListener(p);
		p.Cnd_par_itm_grp_cd10.addAllListener(p);
		p.Cnd_par_itm_grp_nm10.setListListener(p);
		p.Cnd_par_itm_grp_nm10.addAllListener(p);
		p.Cnd_chd_itm_grp_cd1.setListListener(p);
		p.Cnd_chd_itm_grp_cd1.addAllListener(p);
		p.Cnd_chd_itm_grp_nm1.setListListener(p);
		p.Cnd_chd_itm_grp_nm1.addAllListener(p);
		p.Cnd_chd_itm_grp_cd2.setListListener(p);
		p.Cnd_chd_itm_grp_cd2.addAllListener(p);
		p.Cnd_chd_itm_grp_nm2.setListListener(p);
		p.Cnd_chd_itm_grp_nm2.addAllListener(p);
		p.Cnd_chd_itm_grp_cd3.setListListener(p);
		p.Cnd_chd_itm_grp_cd3.addAllListener(p);
		p.Cnd_chd_itm_grp_nm3.setListListener(p);
		p.Cnd_chd_itm_grp_nm3.addAllListener(p);
		p.Cnd_chd_itm_grp_cd4.setListListener(p);
		p.Cnd_chd_itm_grp_cd4.addAllListener(p);
		p.Cnd_chd_itm_grp_nm4.setListListener(p);
		p.Cnd_chd_itm_grp_nm4.addAllListener(p);
		p.Cnd_chd_itm_grp_cd5.setListListener(p);
		p.Cnd_chd_itm_grp_cd5.addAllListener(p);
		p.Cnd_chd_itm_grp_nm5.setListListener(p);
		p.Cnd_chd_itm_grp_nm5.addAllListener(p);
		p.Cnd_chd_itm_grp_cd6.setListListener(p);
		p.Cnd_chd_itm_grp_cd6.addAllListener(p);
		p.Cnd_chd_itm_grp_nm6.setListListener(p);
		p.Cnd_chd_itm_grp_nm6.addAllListener(p);
		p.Cnd_chd_itm_grp_cd7.setListListener(p);
		p.Cnd_chd_itm_grp_cd7.addAllListener(p);
		p.Cnd_chd_itm_grp_nm7.setListListener(p);
		p.Cnd_chd_itm_grp_nm7.addAllListener(p);
		p.Cnd_chd_itm_grp_cd8.setListListener(p);
		p.Cnd_chd_itm_grp_cd8.addAllListener(p);
		p.Cnd_chd_itm_grp_nm8.setListListener(p);
		p.Cnd_chd_itm_grp_nm8.addAllListener(p);
		p.Cnd_chd_itm_grp_cd9.setListListener(p);
		p.Cnd_chd_itm_grp_cd9.addAllListener(p);
		p.Cnd_chd_itm_grp_nm9.setListListener(p);
		p.Cnd_chd_itm_grp_nm9.addAllListener(p);
		p.Cnd_chd_itm_grp_cd10.setListListener(p);
		p.Cnd_chd_itm_grp_cd10.addAllListener(p);
		p.Cnd_chd_itm_grp_nm10.setListListener(p);
		p.Cnd_chd_itm_grp_nm10.addAllListener(p);
		p.Cnd_bom_chng_typ.setListListener(p);
		p.Cnd_bom_chng_typ.addAllListener(p);
		p.Cnd_bom_chng_typ_nm.setListListener(p);
		p.Cnd_bom_chng_typ_nm.addAllListener(p);
		p.Cnd_chng_st_dt.setListListener(p);
		p.Cnd_chng_st_dt.addAllListener(p);
		p.Cnd_chng_end_dt.setListListener(p);
		p.Cnd_chng_end_dt.addAllListener(p);
		p.Cnd_chng_wg_cd.setListListener(p);
		p.Cnd_chng_wg_cd.addAllListener(p);
		p.Cnd_chng_wg_nm.setListListener(p);
		p.Cnd_chng_wg_nm.addAllListener(p);
		p.Cnd_old_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_old_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_old_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_old_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_old_ver_no_p_PPanel.VerNo_ver_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_old_alt_itm_ratio.setListListener(p);
		p.Cnd_old_alt_itm_ratio.addAllListener(p);
		p.Cnd_old_alt_alloc_prio.setListListener(p);
		p.Cnd_old_alt_alloc_prio.addAllListener(p);
		p.Cnd_old_stk_mng_typ.setListListener(p);
		p.Cnd_old_stk_mng_typ.addAllListener(p);
		p.Cnd_old_stk_mng_typ_nm.setListListener(p);
		p.Cnd_old_stk_mng_typ_nm.addAllListener(p);
		p.Cnd_old_asset_mng_typ.setListListener(p);
		p.Cnd_old_asset_mng_typ.addAllListener(p);
		p.Cnd_old_asset_mng_typ_nm.setListListener(p);
		p.Cnd_old_asset_mng_typ_nm.addAllListener(p);
		p.Cnd_old_alt_grp_cd.setListListener(p);
		p.Cnd_old_alt_grp_cd.addAllListener(p);
		p.Cnd_old_alt_grp_nm.setListListener(p);
		p.Cnd_old_alt_grp_nm.addAllListener(p);
		p.Cnd_old_alt_itm_typ.setListListener(p);
		p.Cnd_old_alt_itm_typ.addAllListener(p);
		p.Cnd_old_alt_itm_typ_nm.setListListener(p);
		p.Cnd_old_alt_itm_typ_nm.addAllListener(p);
		p.Cnd_new_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_new_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_new_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_new_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_new_ver_no_p_PPanel.VerNo_ver_no.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_new_alt_itm_ratio.setListListener(p);
		p.Cnd_new_alt_itm_ratio.addAllListener(p);
		p.Cnd_new_alt_alloc_prio.setListListener(p);
		p.Cnd_new_alt_alloc_prio.addAllListener(p);
		p.Cnd_new_stk_mng_typ.setListListener(p);
		p.Cnd_new_stk_mng_typ.addAllListener(p);
		p.Cnd_new_stk_mng_typ_nm.setListListener(p);
		p.Cnd_new_stk_mng_typ_nm.addAllListener(p);
		p.Cnd_new_asset_mng_typ.setListListener(p);
		p.Cnd_new_asset_mng_typ.addAllListener(p);
		p.Cnd_new_asset_mng_typ_nm.setListListener(p);
		p.Cnd_new_asset_mng_typ_nm.addAllListener(p);
		p.Cnd_new_alt_grp_cd.setListListener(p);
		p.Cnd_new_alt_grp_cd.addAllListener(p);
		p.Cnd_new_alt_grp_nm.setListListener(p);
		p.Cnd_new_alt_grp_nm.addAllListener(p);
		p.Cnd_new_alt_itm_typ.setListListener(p);
		p.Cnd_new_alt_itm_typ.addAllListener(p);
		p.Cnd_new_alt_itm_typ_nm.setListListener(p);
		p.Cnd_new_alt_itm_typ_nm.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MABSP_BomLst p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MABSP_BomLst p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MABSP_BomLst p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MABSP_BomLst p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABSP_BomLst p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MABSP_BomLst p) {
		p.RPnl_srch_cmn.addAllListener(p);
		p.RPnl_srch_cmn.setAPMethodName("doRPnl_srch_cmn");
		p.RPnl_srch_wg.addAllListener(p);
		p.RPnl_srch_wg.setAPMethodName("doRPnl_srch_wg");
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MABSP_BomLst p) {
		p.BulkSet_st_dt.setListListener(p);
		p.BulkSet_st_dt.addAllListener(p);
		p.BulkSet_end_dt.setListListener(p);
		p.BulkSet_end_dt.addAllListener(p);
		p.BulkSet_upd_dt.addAllListener(p);
		p.BulkSet_upd_dt.setAPMethodName("doBulkSet_upd_dt");
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABSP_BomLst p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_wg_nm.addAllListener(p);
		p.columnDtl_wg_nm.setListListener(p);
		p.Dtl_par_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_par_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_par_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_par_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_par_itm_typ.addAllListener(p);
		p.columnDtl_par_itm_typ.setListListener(p);
		p.columnDtl_par_itm_typ_nm.addAllListener(p);
		p.columnDtl_par_itm_typ_nm.setListListener(p);
		p.columnDtl_par_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_par_itm_typ_d_cd.setListListener(p);
		p.columnDtl_par_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_par_itm_typ_d_nm.setListListener(p);
		p.columnDtl_par_sno1_mng_typ.addAllListener(p);
		p.columnDtl_par_sno1_mng_typ.setListListener(p);
		p.columnDtl_par_sno2_mng_typ.addAllListener(p);
		p.columnDtl_par_sno2_mng_typ.setListListener(p);
		p.columnDtl_par_sno3_mng_typ.addAllListener(p);
		p.columnDtl_par_sno3_mng_typ.setListListener(p);
		p.columnDtl_par_sno4_mng_typ.addAllListener(p);
		p.columnDtl_par_sno4_mng_typ.setListListener(p);
		p.columnDtl_par_def_bom_ptn.addAllListener(p);
		p.columnDtl_par_def_bom_ptn.setListListener(p);
		p.columnDtl_bom_ptn.addAllListener(p);
		p.columnDtl_bom_ptn.setListListener(p);
		p.columnDtl_oper_cd.addAllListener(p);
		p.columnDtl_oper_cd.setListListener(p);
		p.columnDtl_oper_nm.addAllListener(p);
		p.columnDtl_oper_nm.setListListener(p);
		p.columnDtl_oper_seq.addAllListener(p);
		p.columnDtl_oper_seq.setListListener(p);
		p.columnDtl_disp_seq.addAllListener(p);
		p.columnDtl_disp_seq.setListListener(p);
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_chd_itm_typ.addAllListener(p);
		p.columnDtl_chd_itm_typ.setListListener(p);
		p.columnDtl_chd_itm_typ_nm.addAllListener(p);
		p.columnDtl_chd_itm_typ_nm.setListListener(p);
		p.columnDtl_chd_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_chd_itm_typ_d_cd.setListListener(p);
		p.columnDtl_chd_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_chd_itm_typ_d_nm.setListListener(p);
		p.columnDtl_chd_stk_mng_typ.addAllListener(p);
		p.columnDtl_chd_stk_mng_typ.setListListener(p);
		p.columnDtl_chd_asset_mng_typ.addAllListener(p);
		p.columnDtl_chd_asset_mng_typ.setListListener(p);
		p.columnDtl_par_dec_place.addAllListener(p);
		p.columnDtl_par_dec_place.setListListener(p);
		p.columnDtl_chd_dec_place.addAllListener(p);
		p.columnDtl_chd_dec_place.setListListener(p);
		p.columnDtl_lot_mng_typ.addAllListener(p);
		p.columnDtl_lot_mng_typ.setListListener(p);
		p.columnDtl_sublot_mng_typ.addAllListener(p);
		p.columnDtl_sublot_mng_typ.setListListener(p);
		p.columnDtl_chd_sno1_mng_typ.addAllListener(p);
		p.columnDtl_chd_sno1_mng_typ.setListListener(p);
		p.columnDtl_chd_sno2_mng_typ.addAllListener(p);
		p.columnDtl_chd_sno2_mng_typ.setListListener(p);
		p.columnDtl_chd_sno3_mng_typ.addAllListener(p);
		p.columnDtl_chd_sno3_mng_typ.setListListener(p);
		p.columnDtl_chd_sno4_mng_typ.addAllListener(p);
		p.columnDtl_chd_sno4_mng_typ.setListListener(p);
		p.columnDtl_chd_def_bom_ptn.addAllListener(p);
		p.columnDtl_chd_def_bom_ptn.setListListener(p);
		p.columnDtl_ver_flg.addAllListener(p);
		p.columnDtl_byprod_flg.addAllListener(p);
		p.columnDtl_ph_flg.addAllListener(p);
		p.columnDtl_ph_bom_ptn.addAllListener(p);
		p.columnDtl_ph_bom_ptn.setListListener(p);
		p.Dtl_ver_no_p_PPanel.columnVerNo_ver_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_alt_itm_flg.addAllListener(p);
		p.columnDtl_alt_grp_cd.addAllListener(p);
		p.columnDtl_alt_grp_cd.setListListener(p);
		p.columnDtl_alt_grp_nm.addAllListener(p);
		p.columnDtl_alt_grp_nm.setListListener(p);
		p.columnDtl_alt_itm_typ.addAllListener(p);
		p.columnDtl_alt_itm_typ.setListListener(p);
		p.columnDtl_alt_itm_typ_nm.addAllListener(p);
		p.columnDtl_alt_itm_typ_nm.setListListener(p);
		p.columnDtl_alt_itm_ratio.addAllListener(p);
		p.columnDtl_alt_itm_ratio.setListListener(p);
		p.columnDtl_alt_alloc_prio.addAllListener(p);
		p.columnDtl_alt_alloc_prio.setListListener(p);
		p.columnDtl_sno_typ1.addAllListener(p);
		p.columnDtl_sno_typ1.setListListener(p);
		p.columnDtl_sno_typ_nm1.addAllListener(p);
		p.columnDtl_sno_typ_nm1.setListListener(p);
		p.columnDtl_sno_typ2.addAllListener(p);
		p.columnDtl_sno_typ2.setListListener(p);
		p.columnDtl_sno_typ_nm2.addAllListener(p);
		p.columnDtl_sno_typ_nm2.setListListener(p);
		p.columnDtl_sno_typ3.addAllListener(p);
		p.columnDtl_sno_typ3.setListListener(p);
		p.columnDtl_sno_typ_nm3.addAllListener(p);
		p.columnDtl_sno_typ_nm3.setListListener(p);
		p.columnDtl_sno_typ4.addAllListener(p);
		p.columnDtl_sno_typ4.setListListener(p);
		p.columnDtl_sno_typ_nm4.addAllListener(p);
		p.columnDtl_sno_typ_nm4.setListListener(p);
		p.columnDtl_par_base_unit_cd.addAllListener(p);
		p.columnDtl_par_base_unit_cd.setListListener(p);
		p.columnDtl_par_base_unit_nm.addAllListener(p);
		p.columnDtl_par_base_unit_nm.setListListener(p);
		p.columnDtl_chd_base_unit_cd.addAllListener(p);
		p.columnDtl_chd_base_unit_cd.setListListener(p);
		p.columnDtl_chd_base_unit_nm.addAllListener(p);
		p.columnDtl_chd_base_unit_nm.setListListener(p);
		p.columnDtl_in_offst_typ.addAllListener(p);
		p.columnDtl_in_offst_typ.setListListener(p);
		p.columnDtl_in_offst_typ_nm.addAllListener(p);
		p.columnDtl_in_offst_typ_nm.setListListener(p);
		p.columnDtl_in_offst.addAllListener(p);
		p.columnDtl_in_offst.setListListener(p);
		p.columnDtl_bkf_typ.addAllListener(p);
		p.columnDtl_bkf_typ.setListListener(p);
		p.columnDtl_bkf_typ_nm.addAllListener(p);
		p.columnDtl_bkf_typ_nm.setListListener(p);
		p.columnDtl_inst_lot_fix_flg.addAllListener(p);
		p.columnDtl_lot_mix_flg.addAllListener(p);
		p.columnDtl_sublot_mix_flg.addAllListener(p);
		p.columnDtl_alloc_ctl_typ.addAllListener(p);
		p.columnDtl_alloc_ctl_typ.setListListener(p);
		p.columnDtl_alloc_ctl_typ_nm.addAllListener(p);
		p.columnDtl_alloc_ctl_typ_nm.setListListener(p);
		p.columnDtl_main_itm_flg.addAllListener(p);
		p.columnDtl_yield_calc_flg.addAllListener(p);
		p.columnDtl_inpt_ctl_typ.addAllListener(p);
		p.columnDtl_inpt_ctl_typ.setListListener(p);
		p.columnDtl_inpt_ctl_typ_nm.addAllListener(p);
		p.columnDtl_inpt_ctl_typ_nm.setListListener(p);
		p.columnDtl_chng_no.addAllListener(p);
		p.columnDtl_chng_no.setListListener(p);
		p.columnDtl_ext_sys_no_bom.addAllListener(p);
		p.columnDtl_ext_sys_no_bom.setListListener(p);
		p.columnDtl_not_cost_flg.addAllListener(p);
		p.columnDtl_memo1.addAllListener(p);
		p.columnDtl_memo1.setListListener(p);
		p.columnDtl_memo2.addAllListener(p);
		p.columnDtl_memo2.setListListener(p);
		p.columnDtl_memo3.addAllListener(p);
		p.columnDtl_memo3.setListListener(p);
		p.columnDtl_bom_key.addAllListener(p);
		p.columnDtl_bom_key.setListListener(p);
		p.columnDtl_ins_usr_id.addAllListener(p);
		p.columnDtl_ins_usr_id.setListListener(p);
		p.columnDtl_ins_usr_nm.addAllListener(p);
		p.columnDtl_ins_usr_nm.setListListener(p);
		p.columnDtl_ins_ts.addAllListener(p);
		p.columnDtl_ins_ts.setListListener(p);
		p.columnDtl_ins_func_id.addAllListener(p);
		p.columnDtl_ins_func_id.setListListener(p);
		p.columnDtl_ins_func_nm.addAllListener(p);
		p.columnDtl_ins_func_nm.setListListener(p);
		p.columnDtl_upd_cntr.addAllListener(p);
		p.columnDtl_upd_cntr.setListListener(p);
		p.columnDtl_upd_usr_id.addAllListener(p);
		p.columnDtl_upd_usr_id.setListListener(p);
		p.columnDtl_upd_usr_nm.addAllListener(p);
		p.columnDtl_upd_usr_nm.setListListener(p);
		p.columnDtl_upd_ts.addAllListener(p);
		p.columnDtl_upd_ts.setListListener(p);
		p.columnDtl_upd_func_id.addAllListener(p);
		p.columnDtl_upd_func_id.setListListener(p);
		p.columnDtl_upd_func_nm.addAllListener(p);
		p.columnDtl_upd_func_nm.setListListener(p);
		p.columnDtl_upd_srv_req_no.addAllListener(p);
		p.columnDtl_upd_srv_req_no.setListListener(p);
		p.columnDtl_del_usr_id.addAllListener(p);
		p.columnDtl_del_usr_id.setListListener(p);
		p.columnDtl_del_usr_nm.addAllListener(p);
		p.columnDtl_del_usr_nm.setListListener(p);
		p.columnDtl_del_ts.addAllListener(p);
		p.columnDtl_del_ts.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABSP_BomLst p) {
		p.Btn_open_MABSP0020.addAllListener(p);
		p.Btn_open_MABSP0020.setAPMethodName("doBtn_open_MABSP0020");
		p.Btn_open_MABSP0040.addAllListener(p);
		p.Btn_open_MABSP0040.setAPMethodName("doBtn_open_MABSP0040");
		p.Btn_open_MABSP0080.addAllListener(p);
		p.Btn_open_MABSP0080.setAPMethodName("doBtn_open_MABSP0080");
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
	protected static void mcInitEastBtn(MABSP_BomLst p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABSP_BomLst p){

	}

	/**
	 * [UPD]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RegTarget(MABSP_BomLst p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABSP_BomLst p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABSP_BomLst p){

	}

	/**
	 * [UPD]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CndTab(MABSP_BomLst p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABSP_BomLst p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dt_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chng_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ext_sys_no_bom.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_chd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_chd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_alt_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bom_ptn.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bom_chng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_bom_chng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_chng_st_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_chng_end_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_chng_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_chng_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_old_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_old_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_old_alt_itm_ratio.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_old_alt_alloc_prio.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_old_stk_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_old_stk_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_old_asset_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_old_asset_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_old_alt_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_old_alt_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_old_alt_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_old_alt_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_new_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_new_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_new_alt_itm_ratio.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_new_alt_alloc_prio.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_new_stk_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_new_stk_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_new_asset_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_new_asset_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_new_alt_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_new_alt_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_new_alt_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_new_alt_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MABSP_BomLst p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MABSP_BomLst p){

	}

	/**
	 * [UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab3(MABSP_BomLst p){

	}

	/**
	 * [UPD]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab4(MABSP_BomLst p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABSP_BomLst p){

	}

	/**
	 * [UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RPnl(MABSP_BomLst p){
		p.RPnl_srch_cmn.putMode(p, UPD, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MABSP_BomLst p){
		p.BulkSet_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_upd_dt.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABSP_BomLst p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_wg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_par_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_par_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_par_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_par_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_par_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_par_def_bom_ptn.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_oper_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_oper_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_disp_seq.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_chd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_chd_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_chd_stk_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_chd_asset_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_par_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_chd_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_chd_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_chd_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_chd_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_chd_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_chd_def_bom_ptn.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_byprod_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ph_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ph_bom_ptn.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.REQUIRED);
		p.columnDtl_alt_itm_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_alt_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_alt_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_alt_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_ratio.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_alt_alloc_prio.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno_typ1.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno_typ_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno_typ2.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno_typ_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno_typ3.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno_typ_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sno_typ4.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno_typ_nm4.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_min_sno_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.ENABLE);
		p.Dtl_max_sno_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.ENABLE);
		p.Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.Dtl_qty1_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_par_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_par_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_qty3_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Dtl_qty2_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Dtl_qty4_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_chd_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_chd_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_in_offst_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_in_offst_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_in_offst.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bkf_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bkf_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_inst_lot_fix_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_lot_mix_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sublot_mix_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_alloc_ctl_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_alloc_ctl_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_main_itm_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_yield_calc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_inpt_ctl_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_inpt_ctl_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_chng_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ext_sys_no_bom.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_not_cost_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bom_key.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABSP_BomLst p){
		p.Btn_open_MABSP0020.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MABSP0040.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MABSP0080.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_cmn.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_wg.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del_cmn.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABSP_BomLst p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABSP_BomLst p){

	}

	/**
	 * [FIX]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitFIX_RegTarget(MABSP_BomLst p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABSP_BomLst p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABSP_BomLst p){

	}

	/**
	 * [FIX]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_CndTab(MABSP_BomLst p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABSP_BomLst p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_dt_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_chng_no.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ext_sys_no_bom.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_chd_itm_typ_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_chd_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_alt_grp_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bom_ptn.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bom_chng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_bom_chng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_chng_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_chng_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_chng_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_chng_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_old_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_old_ver_no_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_old_alt_itm_ratio.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_old_alt_alloc_prio.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_old_stk_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_old_stk_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_old_asset_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_old_asset_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_old_alt_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_old_alt_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_old_alt_itm_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_old_alt_itm_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_new_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_new_ver_no_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_new_alt_itm_ratio.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_new_alt_alloc_prio.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_new_stk_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_new_stk_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_new_asset_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_new_asset_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_new_alt_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_new_alt_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_new_alt_itm_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_new_alt_itm_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab1(MABSP_BomLst p){

	}

	/**
	 * [FIX]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab2(MABSP_BomLst p){

	}

	/**
	 * [FIX]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab3(MABSP_BomLst p){

	}

	/**
	 * [FIX]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab4(MABSP_BomLst p){

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABSP_BomLst p){

	}

	/**
	 * [FIX]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_RPnl(MABSP_BomLst p){
		p.RPnl_srch_cmn.putMode(p, FIX, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BulkSet(MABSP_BomLst p){
		p.BulkSet_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_upd_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABSP_BomLst p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_par_itm_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_d_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_d_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_par_sno1_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_par_sno2_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_par_sno3_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_par_sno4_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_par_def_bom_ptn.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_chd_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_chd_itm_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_chd_stk_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_chd_asset_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_par_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_chd_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_chd_sno1_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_chd_sno2_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_chd_sno3_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_chd_sno4_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_chd_def_bom_ptn.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_byprod_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ph_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ph_bom_ptn.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_alt_itm_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alt_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alt_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_ratio.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alt_alloc_prio.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno_typ1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno_typ2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno_typ3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno_typ4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm4.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_min_sno_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_max_sno_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.Dtl_qty1_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_par_base_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_par_base_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_qty3_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty2_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty4_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_chd_base_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_chd_base_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_in_offst_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_in_offst_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_in_offst.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bkf_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bkf_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_inst_lot_fix_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lot_mix_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sublot_mix_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alloc_ctl_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alloc_ctl_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_main_itm_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_yield_calc_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_inpt_ctl_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_inpt_ctl_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_chng_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_no_bom.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_not_cost_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bom_key.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABSP_BomLst p){
		p.Btn_open_MABSP0020.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MABSP0040.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MABSP0080.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABSP_BomLst p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABSP_BomLst p){

	}

	/**
	 * [DEL]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RegTarget(MABSP_BomLst p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABSP_BomLst p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABSP_BomLst p){

	}

	/**
	 * [DEL]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_CndTab(MABSP_BomLst p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABSP_BomLst p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_dt_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chng_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ext_sys_no_bom.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_chd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_chd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_alt_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bom_ptn.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bom_chng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_bom_chng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_chng_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_chng_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_chng_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_chng_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_old_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_old_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_old_alt_itm_ratio.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_old_alt_alloc_prio.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_old_stk_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_old_stk_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_old_asset_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_old_asset_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_old_alt_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_old_alt_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_old_alt_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_old_alt_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_new_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_new_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_new_alt_itm_ratio.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_new_alt_alloc_prio.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_new_stk_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_new_stk_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_new_asset_mng_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_new_asset_mng_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_new_alt_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_new_alt_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_new_alt_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_new_alt_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MABSP_BomLst p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MABSP_BomLst p){

	}

	/**
	 * [DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab3(MABSP_BomLst p){

	}

	/**
	 * [DEL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab4(MABSP_BomLst p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABSP_BomLst p){

	}

	/**
	 * [DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RPnl(MABSP_BomLst p){
		p.RPnl_srch_cmn.putMode(p, DEL, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MABSP_BomLst p){
		p.BulkSet_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_upd_dt.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABSP_BomLst p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_par_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_par_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_par_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_par_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_par_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_par_def_bom_ptn.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_chd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_chd_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_chd_stk_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_chd_asset_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_par_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_chd_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_chd_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_chd_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_chd_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_chd_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_chd_def_bom_ptn.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_byprod_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ph_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ph_bom_ptn.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_alt_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alt_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alt_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_ratio.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alt_alloc_prio.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno_typ1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno_typ2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno_typ3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno_typ4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm4.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_min_sno_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_max_sno_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.Dtl_qty1_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_par_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_par_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_qty3_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty2_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty4_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_chd_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_chd_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_in_offst_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_in_offst_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_in_offst.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bkf_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bkf_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inst_lot_fix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lot_mix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sublot_mix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alloc_ctl_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alloc_ctl_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_main_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_yield_calc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inpt_ctl_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inpt_ctl_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_chng_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_no_bom.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_not_cost_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bom_key.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABSP_BomLst p){
		p.Btn_open_MABSP0020.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MABSP0040.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MABSP0080.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_del_wg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABSP_BomLst p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABSP_BomLst p){

	}

	/**
	 * [REF]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitREF_RegTarget(MABSP_BomLst p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABSP_BomLst p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABSP_BomLst p){

	}

	/**
	 * [REF]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_CndTab(MABSP_BomLst p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABSP_BomLst p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_dt_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chng_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ext_sys_no_bom.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_chd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_chd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_alt_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bom_ptn.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bom_chng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_bom_chng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_chng_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_chng_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_chng_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_chng_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_old_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_old_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_old_alt_itm_ratio.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_old_alt_alloc_prio.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_old_stk_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_old_stk_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_old_asset_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_old_asset_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_old_alt_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_old_alt_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_old_alt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_old_alt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_new_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_new_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_new_alt_itm_ratio.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_new_alt_alloc_prio.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_new_stk_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_new_stk_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_new_asset_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_new_asset_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_new_alt_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_new_alt_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_new_alt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_new_alt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MABSP_BomLst p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MABSP_BomLst p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MABSP_BomLst p){

	}

	/**
	 * [REF]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab4(MABSP_BomLst p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABSP_BomLst p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MABSP_BomLst p){
		p.RPnl_srch_cmn.putMode(p, REF, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MABSP_BomLst p){
		p.BulkSet_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_upd_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABSP_BomLst p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_par_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_par_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_par_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_par_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_par_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_par_def_bom_ptn.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_chd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_chd_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_chd_asset_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_par_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_chd_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_chd_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_chd_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_chd_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_chd_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_chd_def_bom_ptn.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_byprod_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ph_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ph_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_alt_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alt_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alt_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_ratio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alt_alloc_prio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno_typ1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno_typ2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno_typ3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno_typ4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno_typ_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_min_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_max_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.Dtl_qty1_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_par_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_par_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_qty3_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty2_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_qty4_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_chd_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_in_offst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_in_offst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_in_offst.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bkf_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bkf_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inst_lot_fix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_mix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sublot_mix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alloc_ctl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alloc_ctl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_main_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_yield_calc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inpt_ctl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inpt_ctl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chng_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_no_bom.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_not_cost_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bom_key.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABSP_BomLst p){
		p.Btn_open_MABSP0020.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MABSP0040.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MABSP0080.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABSP_BomLst p){

	}

	/**
	 * [CHNG]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitCHNG_ScreenOpe(MABSP_BomLst p){

	}

	/**
	 * [CHNG]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitCHNG_RegTarget(MABSP_BomLst p){

	}

	/**
	 * [CHNG]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitCHNG_Top(MABSP_BomLst p){

	}

	/**
	 * [CHNG]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitCHNG_Fold(MABSP_BomLst p){

	}

	/**
	 * [CHNG]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitCHNG_CndTab(MABSP_BomLst p){

	}

	/**
	 * [CHNG]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitCHNG_Cnd(MABSP_BomLst p){
		p.Cnd_ope_Group.putMode(p, CHNG, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_dt_PPanel.putStatus(CHNG, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chng_no.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_ext_sys_no_bom.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(CHNG, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_par_itm_p_PPanel.putStatus(CHNG, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_chd_itm_typ_p_PPanel.putStatus(CHNG, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.READ_ONLY);
		p.Cnd_chd_itm_p_PPanel.putStatus(CHNG, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_ver_no_p_PPanel.putStatus(CHNG, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.READ_ONLY);
		p.Cnd_alt_grp_cd.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_oper_cd.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_oper_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_bom_ptn.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_memo2.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_memo3.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_on_del_flg.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd1.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm1.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd2.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm2.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd3.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm3.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd4.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm4.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd5.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm5.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd6.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm6.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd7.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm7.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd8.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm8.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd9.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm9.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_cd10.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_par_itm_grp_nm10.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_cd1.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_nm1.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_cd2.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_nm2.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_cd3.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_nm3.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_cd4.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_nm4.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_cd5.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_nm5.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_cd6.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_nm6.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_cd7.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_nm7.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_cd8.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_nm8.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_cd9.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_nm9.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_cd10.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chd_itm_grp_nm10.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_bom_chng_typ.putMode(p, CHNG, MCMode.REQUIRED);
		p.Cnd_bom_chng_typ_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_chng_st_dt.putMode(p, CHNG, MCMode.REQUIRED);
		p.Cnd_chng_end_dt.putMode(p, CHNG, MCMode.REQUIRED);
		p.Cnd_chng_wg_cd.putMode(p, CHNG, MCMode.REQUIRED);
		p.Cnd_chng_wg_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_old_itm_p_PPanel.putStatus(CHNG, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE);
		p.Cnd_old_ver_no_p_PPanel.putStatus(CHNG, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE);
		p.Cnd_old_alt_itm_ratio.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_old_alt_alloc_prio.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_old_stk_mng_typ.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_old_stk_mng_typ_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_old_asset_mng_typ.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_old_asset_mng_typ_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_old_alt_grp_cd.putMode(p, CHNG, MCMode.ENABLE);
		p.Cnd_old_alt_grp_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_old_alt_itm_typ.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_old_alt_itm_typ_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_new_itm_p_PPanel.putStatus(CHNG, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE);
		p.Cnd_new_ver_no_p_PPanel.putStatus(CHNG, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE);
		p.Cnd_new_alt_itm_ratio.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_new_alt_alloc_prio.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_new_stk_mng_typ.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_new_stk_mng_typ_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_new_asset_mng_typ.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_new_asset_mng_typ_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_new_alt_grp_cd.putMode(p, CHNG, MCMode.ENABLE);
		p.Cnd_new_alt_grp_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_new_alt_itm_typ.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Cnd_new_alt_itm_typ_nm.putMode(p, CHNG, MCMode.READ_ONLY);

	}

	/**
	 * [CHNG]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitCHNG_Tab1(MABSP_BomLst p){

	}

	/**
	 * [CHNG]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitCHNG_Tab2(MABSP_BomLst p){

	}

	/**
	 * [CHNG]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitCHNG_Tab3(MABSP_BomLst p){

	}

	/**
	 * [CHNG]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitCHNG_Tab4(MABSP_BomLst p){

	}

	/**
	 * [CHNG]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitCHNG_Ctrl(MABSP_BomLst p){

	}

	/**
	 * [CHNG]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitCHNG_RPnl(MABSP_BomLst p){
		p.RPnl_srch_cmn.putMode(p, CHNG, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, CHNG, MCMode.INVISIBLE);

	}

	/**
	 * [CHNG]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitCHNG_BulkSet(MABSP_BomLst p){
		p.BulkSet_st_dt.putMode(p, CHNG, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, CHNG, MCMode.READ_ONLY);
		p.BulkSet_upd_dt.putMode(p, CHNG, MCMode.DISABLE);

	}

	/**
	 * [CHNG]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitCHNG_Dtl(MABSP_BomLst p){
		p.columnDtl_check.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_wg_cd.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_wg_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(CHNG, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_par_itm_typ.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_d_cd.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_d_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_par_sno1_mng_typ.putMode(p, CHNG, MCMode.INVISIBLE);
		p.columnDtl_par_sno2_mng_typ.putMode(p, CHNG, MCMode.INVISIBLE);
		p.columnDtl_par_sno3_mng_typ.putMode(p, CHNG, MCMode.INVISIBLE);
		p.columnDtl_par_sno4_mng_typ.putMode(p, CHNG, MCMode.INVISIBLE);
		p.columnDtl_par_def_bom_ptn.putMode(p, CHNG, MCMode.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_oper_cd.putMode(p, CHNG, MCMode.ENABLE);
		p.columnDtl_oper_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_oper_seq.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_disp_seq.putMode(p, CHNG, MCMode.REQUIRED);
		p.Dtl_chd_itm_p_PPanel.putStatus(CHNG, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_chd_itm_typ.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_chd_stk_mng_typ.putMode(p, CHNG, MCMode.INVISIBLE);
		p.columnDtl_chd_asset_mng_typ.putMode(p, CHNG, MCMode.INVISIBLE);
		p.columnDtl_par_dec_place.putMode(p, CHNG, MCMode.INVISIBLE);
		p.columnDtl_chd_dec_place.putMode(p, CHNG, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, CHNG, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, CHNG, MCMode.INVISIBLE);
		p.columnDtl_chd_sno1_mng_typ.putMode(p, CHNG, MCMode.INVISIBLE);
		p.columnDtl_chd_sno2_mng_typ.putMode(p, CHNG, MCMode.INVISIBLE);
		p.columnDtl_chd_sno3_mng_typ.putMode(p, CHNG, MCMode.INVISIBLE);
		p.columnDtl_chd_sno4_mng_typ.putMode(p, CHNG, MCMode.INVISIBLE);
		p.columnDtl_chd_def_bom_ptn.putMode(p, CHNG, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, CHNG, MCMode.INVISIBLE);
		p.columnDtl_byprod_flg.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_ph_flg.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_ph_bom_ptn.putMode(p, CHNG, MCMode.REQUIRED);
		p.Dtl_ver_no_p_PPanel.putStatus(CHNG, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.REQUIRED);
		p.columnDtl_alt_itm_flg.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_alt_grp_cd.putMode(p, CHNG, MCMode.ENABLE);
		p.columnDtl_alt_grp_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_typ.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_alt_itm_typ_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_alt_itm_ratio.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_alt_alloc_prio.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_sno_typ1.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_sno_typ_nm1.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_sno_typ2.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_sno_typ_nm2.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_sno_typ3.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_sno_typ_nm3.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_sno_typ4.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_sno_typ_nm4.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Dtl_min_sno_p_PPanel.putStatus(CHNG, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.ENABLE);
		p.Dtl_max_sno_p_PPanel.putStatus(CHNG, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.ENABLE);
		p.Dtl_dt_p_PPanel.putStatus(CHNG, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.Dtl_qty1_p_PPanel.putStatus(CHNG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_par_base_unit_cd.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_par_base_unit_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.Dtl_qty3_p_PPanel.putStatus(CHNG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Dtl_qty2_p_PPanel.putStatus(CHNG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Dtl_qty4_p_PPanel.putStatus(CHNG, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_chd_base_unit_cd.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_chd_base_unit_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_in_offst_typ.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_in_offst_typ_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_in_offst.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_bkf_typ.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_bkf_typ_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_inst_lot_fix_flg.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_lot_mix_flg.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_sublot_mix_flg.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_alloc_ctl_typ.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_alloc_ctl_typ_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_main_itm_flg.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_yield_calc_flg.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_inpt_ctl_typ.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_inpt_ctl_typ_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_chng_no.putMode(p, CHNG, MCMode.ENABLE);
		p.columnDtl_ext_sys_no_bom.putMode(p, CHNG, MCMode.ENABLE);
		p.columnDtl_not_cost_flg.putMode(p, CHNG, MCMode.REQUIRED);
		p.columnDtl_memo1.putMode(p, CHNG, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, CHNG, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, CHNG, MCMode.ENABLE);
		p.columnDtl_bom_key.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, CHNG, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, CHNG, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, CHNG, MCMode.READ_ONLY);

	}

	/**
	 * [CHNG]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitCHNG_Btn(MABSP_BomLst p){
		p.Btn_open_MABSP0020.putMode(p, CHNG, MCMode.DISABLE);
		p.Btn_open_MABSP0040.putMode(p, CHNG, MCMode.DISABLE);
		p.Btn_open_MABSP0080.putMode(p, CHNG, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, CHNG, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, CHNG, MCMode.ENABLE);
		p.Btn_radd.putMode(p, CHNG, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, CHNG, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, CHNG, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, CHNG, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, CHNG, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, CHNG, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, CHNG, MCMode.DISABLE);

	}

	/**
	 * [CHNG]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitCHNG_EastBtn(MABSP_BomLst p){

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
		MABSP_BomLst_MC.setTableConfigDtl((MABSP_BomLst)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABSP_BomLst p) {
		p.columnDtl_check.setMeta(mcframe.clientMABS.MABSP0030.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABS.MABSP0030.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMABS.MABSP0030.DtlR.wg_cd_META);
		p.columnDtl_wg_cd.addLinkBeans(p.columnDtl_wg_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_wg_nm.setMeta(mcframe.clientMABS.MABSP0030.DtlR.wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_nm);
		p.DtlTable.addTable(p.Dtl_par_itm_p_PPanel.ItmTable);
		p.Dtl_par_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_par_itm_nm, p.columnDtl_par_itm_sub1, p.columnDtl_par_itm_sub2, p.columnDtl_par_itm_sub3, p.columnDtl_bom_ptn, p.columnDtl_par_base_unit_cd, p.columnDtl_par_dec_place, p.columnDtl_par_itm_typ, p.columnDtl_par_itm_typ_nm, p.columnDtl_par_itm_typ_d_cd, p.columnDtl_par_itm_typ_d_nm, p.columnDtl_par_sno1_mng_typ, p.columnDtl_par_sno2_mng_typ, p.columnDtl_par_sno3_mng_typ, p.columnDtl_par_sno4_mng_typ, p.columnDtl_par_def_bom_ptn, p.columnDtl_par_base_unit_nm);
		p.Dtl_par_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_par_itm_nm, p.columnDtl_par_itm_sub2, p.columnDtl_par_itm_sub3, p.columnDtl_bom_ptn, p.columnDtl_par_base_unit_cd, p.columnDtl_par_dec_place, p.columnDtl_par_itm_typ, p.columnDtl_par_itm_typ_nm, p.columnDtl_par_itm_typ_d_cd, p.columnDtl_par_itm_typ_d_nm, p.columnDtl_par_sno1_mng_typ, p.columnDtl_par_sno2_mng_typ, p.columnDtl_par_sno3_mng_typ, p.columnDtl_par_sno4_mng_typ, p.columnDtl_par_def_bom_ptn, p.columnDtl_par_base_unit_nm);
		p.Dtl_par_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_par_itm_nm, p.columnDtl_par_itm_sub3, p.columnDtl_bom_ptn, p.columnDtl_par_base_unit_cd, p.columnDtl_par_dec_place, p.columnDtl_par_itm_typ, p.columnDtl_par_itm_typ_nm, p.columnDtl_par_itm_typ_d_cd, p.columnDtl_par_itm_typ_d_nm, p.columnDtl_par_sno1_mng_typ, p.columnDtl_par_sno2_mng_typ, p.columnDtl_par_sno3_mng_typ, p.columnDtl_par_sno4_mng_typ, p.columnDtl_par_def_bom_ptn, p.columnDtl_par_base_unit_nm);
		p.Dtl_par_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_par_itm_nm, p.columnDtl_bom_ptn, p.columnDtl_par_base_unit_cd, p.columnDtl_par_dec_place, p.columnDtl_par_itm_typ, p.columnDtl_par_itm_typ_nm, p.columnDtl_par_itm_typ_d_cd, p.columnDtl_par_itm_typ_d_nm, p.columnDtl_par_sno1_mng_typ, p.columnDtl_par_sno2_mng_typ, p.columnDtl_par_sno3_mng_typ, p.columnDtl_par_sno4_mng_typ, p.columnDtl_par_def_bom_ptn, p.columnDtl_par_base_unit_nm);
		p.columnDtl_par_itm_typ.setMeta(mcframe.clientMABS.MABSP0030.DtlR.par_itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_itm_typ);
		p.columnDtl_par_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP0030.DtlR.par_itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_itm_typ_nm);
		p.columnDtl_par_itm_typ_d_cd.setMeta(mcframe.clientMABS.MABSP0030.DtlR.par_itm_typ_d_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_itm_typ_d_cd);
		p.columnDtl_par_itm_typ_d_nm.setMeta(mcframe.clientMABS.MABSP0030.DtlR.par_itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_itm_typ_d_nm);
		p.columnDtl_par_sno1_mng_typ.setMeta(mcframe.clientMABS.MABSP0030.DtlR.par_sno1_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_sno1_mng_typ);
		p.columnDtl_par_sno2_mng_typ.setMeta(mcframe.clientMABS.MABSP0030.DtlR.par_sno2_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_sno2_mng_typ);
		p.columnDtl_par_sno3_mng_typ.setMeta(mcframe.clientMABS.MABSP0030.DtlR.par_sno3_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_sno3_mng_typ);
		p.columnDtl_par_sno4_mng_typ.setMeta(mcframe.clientMABS.MABSP0030.DtlR.par_sno4_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_sno4_mng_typ);
		p.columnDtl_par_def_bom_ptn.setMeta(mcframe.clientMABS.MABSP0030.DtlR.par_def_bom_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_def_bom_ptn);
		p.columnDtl_bom_ptn.setMeta(mcframe.clientMABS.MABSP0030.DtlR.bom_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bom_ptn);
		p.columnDtl_oper_cd.setMeta(mcframe.clientMABS.MABSP0030.DtlR.oper_cd_META);
		p.columnDtl_oper_cd.addLinkBeans(p.columnDtl_oper_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_cd);
		p.columnDtl_oper_nm.setMeta(mcframe.clientMABS.MABSP0030.DtlR.oper_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_nm);
		p.columnDtl_oper_seq.setMeta(mcframe.clientMABS.MABSP0030.DtlR.oper_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_seq);
		p.columnDtl_disp_seq.setMeta(mcframe.clientMABS.MABSP0030.DtlR.disp_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_disp_seq);
		p.DtlTable.addTable(p.Dtl_chd_itm_p_PPanel.ItmTable);
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_chd_itm_nm, p.columnDtl_chd_itm_sub1, p.columnDtl_chd_itm_sub2, p.columnDtl_chd_itm_sub3, p.columnDtl_chd_base_unit_cd, p.columnDtl_chd_itm_typ, p.columnDtl_chd_itm_typ_nm, p.columnDtl_chd_itm_typ_d_cd, p.columnDtl_chd_itm_typ_d_nm, p.columnDtl_chd_stk_mng_typ, p.columnDtl_chd_asset_mng_typ, p.columnDtl_chd_dec_place, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_ver_flg, p.columnDtl_chd_sno1_mng_typ, p.columnDtl_chd_sno2_mng_typ, p.columnDtl_chd_sno3_mng_typ, p.columnDtl_chd_sno4_mng_typ, p.columnDtl_chd_def_bom_ptn, p.columnDtl_chd_base_unit_nm);
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_chd_itm_nm, p.columnDtl_chd_itm_sub2, p.columnDtl_chd_itm_sub3, p.columnDtl_chd_base_unit_cd, p.columnDtl_chd_itm_typ, p.columnDtl_chd_itm_typ_nm, p.columnDtl_chd_itm_typ_d_cd, p.columnDtl_chd_itm_typ_d_nm, p.columnDtl_chd_stk_mng_typ, p.columnDtl_chd_asset_mng_typ, p.columnDtl_chd_dec_place, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_ver_flg, p.columnDtl_chd_sno1_mng_typ, p.columnDtl_chd_sno2_mng_typ, p.columnDtl_chd_sno3_mng_typ, p.columnDtl_chd_sno4_mng_typ, p.columnDtl_chd_def_bom_ptn, p.columnDtl_chd_base_unit_nm);
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_chd_itm_nm, p.columnDtl_chd_itm_sub3, p.columnDtl_chd_base_unit_cd, p.columnDtl_chd_itm_typ, p.columnDtl_chd_itm_typ_nm, p.columnDtl_chd_itm_typ_d_cd, p.columnDtl_chd_itm_typ_d_nm, p.columnDtl_chd_stk_mng_typ, p.columnDtl_chd_asset_mng_typ, p.columnDtl_chd_dec_place, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_ver_flg, p.columnDtl_chd_sno1_mng_typ, p.columnDtl_chd_sno2_mng_typ, p.columnDtl_chd_sno3_mng_typ, p.columnDtl_chd_sno4_mng_typ, p.columnDtl_chd_def_bom_ptn, p.columnDtl_chd_base_unit_nm);
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_chd_itm_nm, p.columnDtl_chd_base_unit_cd, p.columnDtl_chd_itm_typ, p.columnDtl_chd_itm_typ_nm, p.columnDtl_chd_itm_typ_d_cd, p.columnDtl_chd_itm_typ_d_nm, p.columnDtl_chd_stk_mng_typ, p.columnDtl_chd_asset_mng_typ, p.columnDtl_chd_dec_place, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_ver_flg, p.columnDtl_chd_sno1_mng_typ, p.columnDtl_chd_sno2_mng_typ, p.columnDtl_chd_sno3_mng_typ, p.columnDtl_chd_sno4_mng_typ, p.columnDtl_chd_def_bom_ptn, p.columnDtl_chd_base_unit_nm);
		p.columnDtl_chd_itm_typ.setMeta(mcframe.clientMABS.MABSP0030.DtlR.chd_itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_itm_typ);
		p.columnDtl_chd_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP0030.DtlR.chd_itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_itm_typ_nm);
		p.columnDtl_chd_itm_typ_d_cd.setMeta(mcframe.clientMABS.MABSP0030.DtlR.chd_itm_typ_d_cd_META);
		p.columnDtl_chd_itm_typ_d_cd.addLinkBeans(p.columnDtl_sno_typ1,p.columnDtl_sno_typ2,p.columnDtl_sno_typ3,p.columnDtl_sno_typ4,p.columnDtl_inst_lot_fix_flg,p.columnDtl_lot_mix_flg,p.columnDtl_sublot_mix_flg,p.columnDtl_alloc_ctl_typ,p.columnDtl_inpt_ctl_typ,p.columnDtl_bkf_typ,p.columnDtl_main_itm_flg,p.columnDtl_byprod_flg,p.columnDtl_not_cost_flg);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_itm_typ_d_cd);
		p.columnDtl_chd_itm_typ_d_nm.setMeta(mcframe.clientMABS.MABSP0030.DtlR.chd_itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_itm_typ_d_nm);
		p.columnDtl_chd_stk_mng_typ.setMeta(mcframe.clientMABS.MABSP0030.DtlR.chd_stk_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_stk_mng_typ);
		p.columnDtl_chd_asset_mng_typ.setMeta(mcframe.clientMABS.MABSP0030.DtlR.chd_asset_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_asset_mng_typ);
		p.columnDtl_par_dec_place.setMeta(mcframe.clientMABS.MABSP0030.DtlR.par_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_dec_place);
		p.columnDtl_chd_dec_place.setMeta(mcframe.clientMABS.MABSP0030.DtlR.chd_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_dec_place);
		p.columnDtl_lot_mng_typ.setMeta(mcframe.clientMABS.MABSP0030.DtlR.lot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_mng_typ);
		p.columnDtl_sublot_mng_typ.setMeta(mcframe.clientMABS.MABSP0030.DtlR.sublot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_mng_typ);
		p.columnDtl_chd_sno1_mng_typ.setMeta(mcframe.clientMABS.MABSP0030.DtlR.chd_sno1_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_sno1_mng_typ);
		p.columnDtl_chd_sno2_mng_typ.setMeta(mcframe.clientMABS.MABSP0030.DtlR.chd_sno2_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_sno2_mng_typ);
		p.columnDtl_chd_sno3_mng_typ.setMeta(mcframe.clientMABS.MABSP0030.DtlR.chd_sno3_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_sno3_mng_typ);
		p.columnDtl_chd_sno4_mng_typ.setMeta(mcframe.clientMABS.MABSP0030.DtlR.chd_sno4_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_sno4_mng_typ);
		p.columnDtl_chd_def_bom_ptn.setMeta(mcframe.clientMABS.MABSP0030.DtlR.chd_def_bom_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_def_bom_ptn);
		p.columnDtl_ver_flg.setMeta(mcframe.clientMABS.MABSP0030.DtlR.ver_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ver_flg);
		p.columnDtl_byprod_flg.setMeta(mcframe.clientMABS.MABSP0030.DtlR.byprod_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_byprod_flg);
		p.columnDtl_ph_flg.setMeta(mcframe.clientMABS.MABSP0030.DtlR.ph_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ph_flg);
		p.columnDtl_ph_bom_ptn.setMeta(mcframe.clientMABS.MABSP0030.DtlR.ph_bom_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ph_bom_ptn);
		p.DtlTable.addTable(p.Dtl_ver_no_p_PPanel.VerNoTable);
		p.columnDtl_alt_itm_flg.setMeta(mcframe.clientMABS.MABSP0030.DtlR.alt_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_itm_flg);
		p.columnDtl_alt_grp_cd.setMeta(mcframe.clientMABS.MABSP0030.DtlR.alt_grp_cd_META);
		p.columnDtl_alt_grp_cd.addLinkBeans(p.columnDtl_alt_grp_nm,p.columnDtl_alt_itm_typ);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_grp_cd);
		p.columnDtl_alt_grp_nm.setMeta(mcframe.clientMABS.MABSP0030.DtlR.alt_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_grp_nm);
		p.columnDtl_alt_itm_typ.setMeta(mcframe.clientMABS.MABSP0030.DtlR.alt_itm_typ_META);
		p.columnDtl_alt_itm_typ.addLinkBeans(p.columnDtl_alt_itm_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_itm_typ);
		p.columnDtl_alt_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP0030.DtlR.alt_itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_itm_typ_nm);
		p.columnDtl_alt_itm_ratio.setMeta(mcframe.clientMABS.MABSP0030.DtlR.alt_itm_ratio_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_itm_ratio);
		p.columnDtl_alt_alloc_prio.setMeta(mcframe.clientMABS.MABSP0030.DtlR.alt_alloc_prio_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alt_alloc_prio);
		p.columnDtl_sno_typ1.setMeta(mcframe.clientMABS.MABSP0030.DtlR.sno_typ1_META);
		p.columnDtl_sno_typ1.addLinkBeans(p.columnDtl_sno_typ_nm1);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ1);
		p.columnDtl_sno_typ_nm1.setMeta(mcframe.clientMABS.MABSP0030.DtlR.sno_typ_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ_nm1);
		p.columnDtl_sno_typ2.setMeta(mcframe.clientMABS.MABSP0030.DtlR.sno_typ2_META);
		p.columnDtl_sno_typ2.addLinkBeans(p.columnDtl_sno_typ_nm2);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ2);
		p.columnDtl_sno_typ_nm2.setMeta(mcframe.clientMABS.MABSP0030.DtlR.sno_typ_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ_nm2);
		p.columnDtl_sno_typ3.setMeta(mcframe.clientMABS.MABSP0030.DtlR.sno_typ3_META);
		p.columnDtl_sno_typ3.addLinkBeans(p.columnDtl_sno_typ_nm3);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ3);
		p.columnDtl_sno_typ_nm3.setMeta(mcframe.clientMABS.MABSP0030.DtlR.sno_typ_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ_nm3);
		p.columnDtl_sno_typ4.setMeta(mcframe.clientMABS.MABSP0030.DtlR.sno_typ4_META);
		p.columnDtl_sno_typ4.addLinkBeans(p.columnDtl_sno_typ_nm4);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ4);
		p.columnDtl_sno_typ_nm4.setMeta(mcframe.clientMABS.MABSP0030.DtlR.sno_typ_nm4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno_typ_nm4);
		p.DtlTable.addTable(p.Dtl_min_sno_p_PPanel.SnoTable);
		p.DtlTable.addTable(p.Dtl_max_sno_p_PPanel.SnoTable);
		p.DtlTable.addTable(p.Dtl_dt_p_PPanel.DtTable);
		p.DtlTable.addTable(p.Dtl_qty1_p_PPanel.QtyTable);
		p.columnDtl_par_base_unit_cd.setMeta(mcframe.clientMABS.MABSP0030.DtlR.par_base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_base_unit_cd);
		p.columnDtl_par_base_unit_nm.setMeta(mcframe.clientMABS.MABSP0030.DtlR.par_base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_base_unit_nm);
		p.DtlTable.addTable(p.Dtl_qty3_p_PPanel.QtyTable);
		p.Dtl_qty3_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.DtlTable.addTable(p.Dtl_qty2_p_PPanel.QtyTable);
		p.Dtl_qty2_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.DtlTable.addTable(p.Dtl_qty4_p_PPanel.QtyTable);
		p.Dtl_qty4_p_PPanel.columnQty_qty.setMinusEnable(true);
		p.columnDtl_chd_base_unit_cd.setMeta(mcframe.clientMABS.MABSP0030.DtlR.chd_base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_base_unit_cd);
		p.columnDtl_chd_base_unit_nm.setMeta(mcframe.clientMABS.MABSP0030.DtlR.chd_base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_base_unit_nm);
		p.columnDtl_in_offst_typ.setMeta(mcframe.clientMABS.MABSP0030.DtlR.in_offst_typ_META);
		p.columnDtl_in_offst_typ.addLinkBeans(p.columnDtl_in_offst_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_in_offst_typ);
		p.columnDtl_in_offst_typ_nm.setMeta(mcframe.clientMABS.MABSP0030.DtlR.in_offst_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_in_offst_typ_nm);
		p.columnDtl_in_offst.setMeta(mcframe.clientMABS.MABSP0030.DtlR.in_offst_META);
		p.columnDtl_in_offst.setMinusEnable(true);
		p.DtlTable.addColumnConfig(p.columnDtl_in_offst);
		p.columnDtl_bkf_typ.setMeta(mcframe.clientMABS.MABSP0030.DtlR.bkf_typ_META);
		p.columnDtl_bkf_typ.addLinkBeans(p.columnDtl_bkf_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_bkf_typ);
		p.columnDtl_bkf_typ_nm.setMeta(mcframe.clientMABS.MABSP0030.DtlR.bkf_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bkf_typ_nm);
		p.columnDtl_inst_lot_fix_flg.setMeta(mcframe.clientMABS.MABSP0030.DtlR.inst_lot_fix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inst_lot_fix_flg);
		p.columnDtl_lot_mix_flg.setMeta(mcframe.clientMABS.MABSP0030.DtlR.lot_mix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_mix_flg);
		p.columnDtl_sublot_mix_flg.setMeta(mcframe.clientMABS.MABSP0030.DtlR.sublot_mix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_mix_flg);
		p.columnDtl_alloc_ctl_typ.setMeta(mcframe.clientMABS.MABSP0030.DtlR.alloc_ctl_typ_META);
		p.columnDtl_alloc_ctl_typ.addLinkBeans(p.columnDtl_alloc_ctl_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_alloc_ctl_typ);
		p.columnDtl_alloc_ctl_typ_nm.setMeta(mcframe.clientMABS.MABSP0030.DtlR.alloc_ctl_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alloc_ctl_typ_nm);
		p.columnDtl_main_itm_flg.setMeta(mcframe.clientMABS.MABSP0030.DtlR.main_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_main_itm_flg);
		p.columnDtl_yield_calc_flg.setMeta(mcframe.clientMABS.MABSP0030.DtlR.yield_calc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_yield_calc_flg);
		p.columnDtl_inpt_ctl_typ.setMeta(mcframe.clientMABS.MABSP0030.DtlR.inpt_ctl_typ_META);
		p.columnDtl_inpt_ctl_typ.addLinkBeans(p.columnDtl_inpt_ctl_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_inpt_ctl_typ);
		p.columnDtl_inpt_ctl_typ_nm.setMeta(mcframe.clientMABS.MABSP0030.DtlR.inpt_ctl_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inpt_ctl_typ_nm);
		p.columnDtl_chng_no.setMeta(mcframe.clientMABS.MABSP0030.DtlR.chng_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chng_no);
		p.columnDtl_ext_sys_no_bom.setMeta(mcframe.clientMABS.MABSP0030.DtlR.ext_sys_no_bom_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_no_bom);
		p.columnDtl_not_cost_flg.setMeta(mcframe.clientMABS.MABSP0030.DtlR.not_cost_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_not_cost_flg);
		p.columnDtl_memo1.setMeta(mcframe.clientMABS.MABSP0030.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABS.MABSP0030.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABS.MABSP0030.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_bom_key.setMeta(mcframe.clientMABS.MABSP0030.DtlR.bom_key_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bom_key);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0030.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0030.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABS.MABSP0030.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0030.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0030.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP0030.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0030.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0030.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABS.MABSP0030.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0030.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0030.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0030.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP0030.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP0030.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABS.MABSP0030.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_oper_cd.getListConfig().setPutter(getCnd_oper_cd_ListPutter());
		Cnd_par_itm_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd1.getListConfig().setPutter(getCnd_par_itm_grp_cd1_ListPutter());
		Cnd_par_itm_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd2.getListConfig().setPutter(getCnd_par_itm_grp_cd2_ListPutter());
		Cnd_par_itm_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd3.getListConfig().setPutter(getCnd_par_itm_grp_cd3_ListPutter());
		Cnd_par_itm_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd4.getListConfig().setPutter(getCnd_par_itm_grp_cd4_ListPutter());
		Cnd_par_itm_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd5.getListConfig().setPutter(getCnd_par_itm_grp_cd5_ListPutter());
		Cnd_par_itm_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd6.getListConfig().setPutter(getCnd_par_itm_grp_cd6_ListPutter());
		Cnd_par_itm_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd7.getListConfig().setPutter(getCnd_par_itm_grp_cd7_ListPutter());
		Cnd_par_itm_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd8.getListConfig().setPutter(getCnd_par_itm_grp_cd8_ListPutter());
		Cnd_par_itm_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd9.getListConfig().setPutter(getCnd_par_itm_grp_cd9_ListPutter());
		Cnd_par_itm_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_grp_cd10.getListConfig().setPutter(getCnd_par_itm_grp_cd10_ListPutter());
		Cnd_chd_itm_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chd_itm_grp_cd1.getListConfig().setPutter(getCnd_chd_itm_grp_cd1_ListPutter());
		Cnd_chd_itm_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chd_itm_grp_cd2.getListConfig().setPutter(getCnd_chd_itm_grp_cd2_ListPutter());
		Cnd_chd_itm_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chd_itm_grp_cd3.getListConfig().setPutter(getCnd_chd_itm_grp_cd3_ListPutter());
		Cnd_chd_itm_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chd_itm_grp_cd4.getListConfig().setPutter(getCnd_chd_itm_grp_cd4_ListPutter());
		Cnd_chd_itm_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chd_itm_grp_cd5.getListConfig().setPutter(getCnd_chd_itm_grp_cd5_ListPutter());
		Cnd_chd_itm_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chd_itm_grp_cd6.getListConfig().setPutter(getCnd_chd_itm_grp_cd6_ListPutter());
		Cnd_chd_itm_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chd_itm_grp_cd7.getListConfig().setPutter(getCnd_chd_itm_grp_cd7_ListPutter());
		Cnd_chd_itm_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chd_itm_grp_cd8.getListConfig().setPutter(getCnd_chd_itm_grp_cd8_ListPutter());
		Cnd_chd_itm_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chd_itm_grp_cd9.getListConfig().setPutter(getCnd_chd_itm_grp_cd9_ListPutter());
		Cnd_chd_itm_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chd_itm_grp_cd10.getListConfig().setPutter(getCnd_chd_itm_grp_cd10_ListPutter());
		Cnd_bom_chng_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bom_chng_typ.getListConfig().setPutter(getCnd_bom_chng_typ_ListPutter());
		Cnd_chng_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chng_wg_cd.getListConfig().setPutter(getCnd_chng_wg_cd_ListPutter());
		Cnd_old_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_old_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_old_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_old_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_old_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_old_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_old_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_old_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_old_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_old_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_old_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_old_alt_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_old_alt_grp_cd.getListConfig().setPutter(getCnd_old_alt_grp_cd_ListPutter());
		Cnd_old_alt_itm_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_old_alt_itm_typ.getListConfig().setPutter(getCnd_old_alt_itm_typ_ListPutter());
		Cnd_new_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_new_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_new_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_new_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_new_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_new_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_new_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_new_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_new_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_new_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_new_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_new_alt_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_new_alt_grp_cd.getListConfig().setPutter(getCnd_new_alt_grp_cd_ListPutter());
		Cnd_new_alt_itm_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_new_alt_itm_typ.getListConfig().setPutter(getCnd_new_alt_itm_typ_ListPutter());
		columnDtl_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_wg_cd.getListConfig().setPutter(getDtl_wg_cd_ListPutter());
		Dtl_par_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl_par_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl_par_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_par_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl_par_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl_par_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_par_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl_par_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl_par_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_par_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl_par_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnDtl_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_oper_cd.getListConfig().setPutter(getDtl_oper_cd_ListPutter());
		Dtl_chd_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl_chd_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl_chd_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_chd_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl_chd_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl_chd_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_chd_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl_chd_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl_chd_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_chd_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl_chd_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnDtl_chd_itm_typ_d_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_chd_itm_typ_d_cd.getListConfig().setPutter(getDtl_chd_itm_typ_d_cd_ListPutter());
		columnDtl_alt_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_alt_grp_cd.getListConfig().setPutter(getDtl_alt_grp_cd_ListPutter());
		columnDtl_alt_itm_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_alt_itm_typ.getListConfig().setPutter(getDtl_alt_itm_typ_ListPutter());
		columnDtl_sno_typ1.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno_typ1.getListConfig().setPutter(getDtl_sno_typ1_ListPutter());
		columnDtl_sno_typ2.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno_typ2.getListConfig().setPutter(getDtl_sno_typ2_ListPutter());
		columnDtl_sno_typ3.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno_typ3.getListConfig().setPutter(getDtl_sno_typ3_ListPutter());
		columnDtl_sno_typ4.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sno_typ4.getListConfig().setPutter(getDtl_sno_typ4_ListPutter());
		columnDtl_in_offst_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_in_offst_typ.getListConfig().setPutter(getDtl_in_offst_typ_ListPutter());
		columnDtl_bkf_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bkf_typ.getListConfig().setPutter(getDtl_bkf_typ_ListPutter());
		columnDtl_alloc_ctl_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_alloc_ctl_typ.getListConfig().setPutter(getDtl_alloc_ctl_typ_ListPutter());
		columnDtl_inpt_ctl_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_inpt_ctl_typ.getListConfig().setPutter(getDtl_inpt_ctl_typ_ListPutter());
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
	 * この画面を[FIX]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIXStatus() {
		status = FIX;
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
	 * この画面を[CHNG]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setCHNGStatus() {
		status = CHNG;
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
		else if (FIX.equals(status)) {
			setFIXStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (CHNG.equals(status)) {
			setCHNGStatus();
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
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgWg");
		return lp;
	}
	 
	/**
	 * [Cnd_oper_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_oper_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Oper");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_par_itm_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp10");
		return lp;
	}
	 
	/**
	 * [Cnd_chd_itm_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_chd_itm_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_chd_itm_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_chd_itm_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_chd_itm_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_chd_itm_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_chd_itm_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_chd_itm_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_chd_itm_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_chd_itm_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp10");
		return lp;
	}
	 
	/**
	 * [Cnd_bom_chng_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bom_chng_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BomChngTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_chng_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chng_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgWg");
		return lp;
	}
	 
	/**
	 * [Cnd_old_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_old_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_old_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_old_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_old_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_old_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_old_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_old_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Cnd_old_alt_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_old_alt_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AltGrpBom");
		return lp;
	}
	 
	/**
	 * [Cnd_old_alt_itm_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_old_alt_itm_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AltItmTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_new_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_new_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_new_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_new_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_new_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_new_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_new_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_new_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Cnd_new_alt_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_new_alt_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AltGrpBom");
		return lp;
	}
	 
	/**
	 * [Cnd_new_alt_itm_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_new_alt_itm_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AltItmTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgWg");
		return lp;
	}
	 
	/**
	 * [Dtl_par_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_par_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Dtl_par_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_par_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Dtl_par_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_par_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Dtl_par_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_par_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Dtl_oper_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_oper_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Oper");
		return lp;
	}
	 
	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_chd_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_chd_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_chd_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_chd_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Dtl_chd_itm_typ_d_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_chd_itm_typ_d_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmTypD");
		return lp;
	}
	 
	/**
	 * [Dtl_alt_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_alt_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AltGrpBom");
		return lp;
	}
	 
	/**
	 * [Dtl_alt_itm_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_alt_itm_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AltItmTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno_typ1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno_typ1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno_typ2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno_typ2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno_typ3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno_typ3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sno_typ4_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sno_typ4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SnoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_in_offst_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_in_offst_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.OffstTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_bkf_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bkf_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BkfTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_alloc_ctl_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_alloc_ctl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AllocCtlTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_inpt_ctl_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_inpt_ctl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InptCtlTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_oper_cd) return getCnd_oper_cd(row, info);
		if(combo == Cnd_par_itm_grp_cd1) return getCnd_par_itm_grp_cd1(row, info);
		if(combo == Cnd_par_itm_grp_cd2) return getCnd_par_itm_grp_cd2(row, info);
		if(combo == Cnd_par_itm_grp_cd3) return getCnd_par_itm_grp_cd3(row, info);
		if(combo == Cnd_par_itm_grp_cd4) return getCnd_par_itm_grp_cd4(row, info);
		if(combo == Cnd_par_itm_grp_cd5) return getCnd_par_itm_grp_cd5(row, info);
		if(combo == Cnd_par_itm_grp_cd6) return getCnd_par_itm_grp_cd6(row, info);
		if(combo == Cnd_par_itm_grp_cd7) return getCnd_par_itm_grp_cd7(row, info);
		if(combo == Cnd_par_itm_grp_cd8) return getCnd_par_itm_grp_cd8(row, info);
		if(combo == Cnd_par_itm_grp_cd9) return getCnd_par_itm_grp_cd9(row, info);
		if(combo == Cnd_par_itm_grp_cd10) return getCnd_par_itm_grp_cd10(row, info);
		if(combo == Cnd_chd_itm_grp_cd1) return getCnd_chd_itm_grp_cd1(row, info);
		if(combo == Cnd_chd_itm_grp_cd2) return getCnd_chd_itm_grp_cd2(row, info);
		if(combo == Cnd_chd_itm_grp_cd3) return getCnd_chd_itm_grp_cd3(row, info);
		if(combo == Cnd_chd_itm_grp_cd4) return getCnd_chd_itm_grp_cd4(row, info);
		if(combo == Cnd_chd_itm_grp_cd5) return getCnd_chd_itm_grp_cd5(row, info);
		if(combo == Cnd_chd_itm_grp_cd6) return getCnd_chd_itm_grp_cd6(row, info);
		if(combo == Cnd_chd_itm_grp_cd7) return getCnd_chd_itm_grp_cd7(row, info);
		if(combo == Cnd_chd_itm_grp_cd8) return getCnd_chd_itm_grp_cd8(row, info);
		if(combo == Cnd_chd_itm_grp_cd9) return getCnd_chd_itm_grp_cd9(row, info);
		if(combo == Cnd_chd_itm_grp_cd10) return getCnd_chd_itm_grp_cd10(row, info);
		if(combo == Cnd_bom_chng_typ) return getCnd_bom_chng_typ(row, info);
		if(combo == Cnd_chng_wg_cd) return getCnd_chng_wg_cd(row, info);
		if(combo == Cnd_old_itm_p_PPanel.Itm_itm_cd) return getCnd_old_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_old_itm_p_PPanel.Itm_itm_sub1) return getCnd_old_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_old_itm_p_PPanel.Itm_itm_sub2) return getCnd_old_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_old_itm_p_PPanel.Itm_itm_sub3) return getCnd_old_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_old_ver_no_p_PPanel.VerNo_ver_no) return getCnd_old_ver_no_p_PPanel_VerNo_ver_no(row, info);
		if(combo == Cnd_old_alt_grp_cd) return getCnd_old_alt_grp_cd(row, info);
		if(combo == Cnd_old_alt_itm_typ) return getCnd_old_alt_itm_typ(row, info);
		if(combo == Cnd_new_itm_p_PPanel.Itm_itm_cd) return getCnd_new_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_new_itm_p_PPanel.Itm_itm_sub1) return getCnd_new_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_new_itm_p_PPanel.Itm_itm_sub2) return getCnd_new_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_new_itm_p_PPanel.Itm_itm_sub3) return getCnd_new_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_new_ver_no_p_PPanel.VerNo_ver_no) return getCnd_new_ver_no_p_PPanel_VerNo_ver_no(row, info);
		if(combo == Cnd_new_alt_grp_cd) return getCnd_new_alt_grp_cd(row, info);
		if(combo == Cnd_new_alt_itm_typ) return getCnd_new_alt_itm_typ(row, info);
		if(combo == columnDtl_wg_cd) return getDtl_wg_cd(row, info);
		if(combo == Dtl_par_itm_p_PPanel.columnItm_itm_cd) return getDtl_par_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_par_itm_p_PPanel.columnItm_itm_sub1) return getDtl_par_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_par_itm_p_PPanel.columnItm_itm_sub2) return getDtl_par_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_par_itm_p_PPanel.columnItm_itm_sub3) return getDtl_par_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnDtl_oper_cd) return getDtl_oper_cd(row, info);
		if(combo == Dtl_chd_itm_p_PPanel.columnItm_itm_cd) return getDtl_chd_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_chd_itm_p_PPanel.columnItm_itm_sub1) return getDtl_chd_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_chd_itm_p_PPanel.columnItm_itm_sub2) return getDtl_chd_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_chd_itm_p_PPanel.columnItm_itm_sub3) return getDtl_chd_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnDtl_chd_itm_typ_d_cd) return getDtl_chd_itm_typ_d_cd(row, info);
		if(combo == Dtl_ver_no_p_PPanel.columnVerNo_ver_no) return getDtl_ver_no_p_PPanel_columnVerNo_ver_no(row, info);
		if(combo == columnDtl_alt_grp_cd) return getDtl_alt_grp_cd(row, info);
		if(combo == columnDtl_alt_itm_typ) return getDtl_alt_itm_typ(row, info);
		if(combo == columnDtl_sno_typ1) return getDtl_sno_typ1(row, info);
		if(combo == columnDtl_sno_typ2) return getDtl_sno_typ2(row, info);
		if(combo == columnDtl_sno_typ3) return getDtl_sno_typ3(row, info);
		if(combo == columnDtl_sno_typ4) return getDtl_sno_typ4(row, info);
		if(combo == columnDtl_in_offst_typ) return getDtl_in_offst_typ(row, info);
		if(combo == columnDtl_bkf_typ) return getDtl_bkf_typ(row, info);
		if(combo == columnDtl_alloc_ctl_typ) return getDtl_alloc_ctl_typ(row, info);
		if(combo == columnDtl_inpt_ctl_typ) return getDtl_inpt_ctl_typ(row, info);
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
		else if (ap == RPnl_srch_cmn) doRPnl_srch_cmn(info);
		else if (ap == RPnl_srch_wg) doRPnl_srch_wg(info);
		else if (ap == BulkSet_upd_dt) doBulkSet_upd_dt(info);
		else if (ap == Btn_open_MABSP0020) doBtn_open_MABSP0020(info);
		else if (ap == Btn_open_MABSP0040) doBtn_open_MABSP0040(info);
		else if (ap == Btn_open_MABSP0080) doBtn_open_MABSP0080(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd_cmn) doBtn_upd_cmn(info);
		else if (ap == Btn_upd_wg) doBtn_upd_wg(info);
		else if (ap == Btn_del_cmn) doBtn_del_cmn(info);
		else if (ap == Btn_del_wg) doBtn_del_wg(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [RPnl]パネルの[srch_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRPnl_srch_cmn(MCEventInfo info);

	/**
	 * [RPnl]パネルの[srch_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRPnl_srch_wg(MCEventInfo info);

	/**
	 * [BulkSet]パネルの[upd_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBulkSet_upd_dt(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABSP0020]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABSP0020(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABSP0040]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABSP0040(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABSP0080]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABSP0080(MCEventInfo info);

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
		if (vc == CndTabTab) return doCndTab_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_cmn_flg) return doCnd_cmn_flg_VC(info);
		if (vc == Cnd_wg_flg) return doCnd_wg_flg_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_chng_no) return doCnd_chng_no_VC(info);
		if (vc == Cnd_ext_sys_no_bom) return doCnd_ext_sys_no_bom_VC(info);
		if (vc == Cnd_alt_grp_cd) return doCnd_alt_grp_cd_VC(info);
		if (vc == Cnd_oper_cd) return doCnd_oper_cd_VC(info);
		if (vc == Cnd_oper_nm) return doCnd_oper_nm_VC(info);
		if (vc == Cnd_bom_ptn) return doCnd_bom_ptn_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == Cnd_par_itm_grp_cd1) return doCnd_par_itm_grp_cd1_VC(info);
		if (vc == Cnd_par_itm_grp_nm1) return doCnd_par_itm_grp_nm1_VC(info);
		if (vc == Cnd_par_itm_grp_cd2) return doCnd_par_itm_grp_cd2_VC(info);
		if (vc == Cnd_par_itm_grp_nm2) return doCnd_par_itm_grp_nm2_VC(info);
		if (vc == Cnd_par_itm_grp_cd3) return doCnd_par_itm_grp_cd3_VC(info);
		if (vc == Cnd_par_itm_grp_nm3) return doCnd_par_itm_grp_nm3_VC(info);
		if (vc == Cnd_par_itm_grp_cd4) return doCnd_par_itm_grp_cd4_VC(info);
		if (vc == Cnd_par_itm_grp_nm4) return doCnd_par_itm_grp_nm4_VC(info);
		if (vc == Cnd_par_itm_grp_cd5) return doCnd_par_itm_grp_cd5_VC(info);
		if (vc == Cnd_par_itm_grp_nm5) return doCnd_par_itm_grp_nm5_VC(info);
		if (vc == Cnd_par_itm_grp_cd6) return doCnd_par_itm_grp_cd6_VC(info);
		if (vc == Cnd_par_itm_grp_nm6) return doCnd_par_itm_grp_nm6_VC(info);
		if (vc == Cnd_par_itm_grp_cd7) return doCnd_par_itm_grp_cd7_VC(info);
		if (vc == Cnd_par_itm_grp_nm7) return doCnd_par_itm_grp_nm7_VC(info);
		if (vc == Cnd_par_itm_grp_cd8) return doCnd_par_itm_grp_cd8_VC(info);
		if (vc == Cnd_par_itm_grp_nm8) return doCnd_par_itm_grp_nm8_VC(info);
		if (vc == Cnd_par_itm_grp_cd9) return doCnd_par_itm_grp_cd9_VC(info);
		if (vc == Cnd_par_itm_grp_nm9) return doCnd_par_itm_grp_nm9_VC(info);
		if (vc == Cnd_par_itm_grp_cd10) return doCnd_par_itm_grp_cd10_VC(info);
		if (vc == Cnd_par_itm_grp_nm10) return doCnd_par_itm_grp_nm10_VC(info);
		if (vc == Cnd_chd_itm_grp_cd1) return doCnd_chd_itm_grp_cd1_VC(info);
		if (vc == Cnd_chd_itm_grp_nm1) return doCnd_chd_itm_grp_nm1_VC(info);
		if (vc == Cnd_chd_itm_grp_cd2) return doCnd_chd_itm_grp_cd2_VC(info);
		if (vc == Cnd_chd_itm_grp_nm2) return doCnd_chd_itm_grp_nm2_VC(info);
		if (vc == Cnd_chd_itm_grp_cd3) return doCnd_chd_itm_grp_cd3_VC(info);
		if (vc == Cnd_chd_itm_grp_nm3) return doCnd_chd_itm_grp_nm3_VC(info);
		if (vc == Cnd_chd_itm_grp_cd4) return doCnd_chd_itm_grp_cd4_VC(info);
		if (vc == Cnd_chd_itm_grp_nm4) return doCnd_chd_itm_grp_nm4_VC(info);
		if (vc == Cnd_chd_itm_grp_cd5) return doCnd_chd_itm_grp_cd5_VC(info);
		if (vc == Cnd_chd_itm_grp_nm5) return doCnd_chd_itm_grp_nm5_VC(info);
		if (vc == Cnd_chd_itm_grp_cd6) return doCnd_chd_itm_grp_cd6_VC(info);
		if (vc == Cnd_chd_itm_grp_nm6) return doCnd_chd_itm_grp_nm6_VC(info);
		if (vc == Cnd_chd_itm_grp_cd7) return doCnd_chd_itm_grp_cd7_VC(info);
		if (vc == Cnd_chd_itm_grp_nm7) return doCnd_chd_itm_grp_nm7_VC(info);
		if (vc == Cnd_chd_itm_grp_cd8) return doCnd_chd_itm_grp_cd8_VC(info);
		if (vc == Cnd_chd_itm_grp_nm8) return doCnd_chd_itm_grp_nm8_VC(info);
		if (vc == Cnd_chd_itm_grp_cd9) return doCnd_chd_itm_grp_cd9_VC(info);
		if (vc == Cnd_chd_itm_grp_nm9) return doCnd_chd_itm_grp_nm9_VC(info);
		if (vc == Cnd_chd_itm_grp_cd10) return doCnd_chd_itm_grp_cd10_VC(info);
		if (vc == Cnd_chd_itm_grp_nm10) return doCnd_chd_itm_grp_nm10_VC(info);
		if (vc == Cnd_bom_chng_typ) return doCnd_bom_chng_typ_VC(info);
		if (vc == Cnd_bom_chng_typ_nm) return doCnd_bom_chng_typ_nm_VC(info);
		if (vc == Cnd_chng_st_dt) return doCnd_chng_st_dt_VC(info);
		if (vc == Cnd_chng_end_dt) return doCnd_chng_end_dt_VC(info);
		if (vc == Cnd_chng_wg_cd) return doCnd_chng_wg_cd_VC(info);
		if (vc == Cnd_chng_wg_nm) return doCnd_chng_wg_nm_VC(info);
		if (vc == Cnd_old_alt_itm_ratio) return doCnd_old_alt_itm_ratio_VC(info);
		if (vc == Cnd_old_alt_alloc_prio) return doCnd_old_alt_alloc_prio_VC(info);
		if (vc == Cnd_old_stk_mng_typ) return doCnd_old_stk_mng_typ_VC(info);
		if (vc == Cnd_old_stk_mng_typ_nm) return doCnd_old_stk_mng_typ_nm_VC(info);
		if (vc == Cnd_old_asset_mng_typ) return doCnd_old_asset_mng_typ_VC(info);
		if (vc == Cnd_old_asset_mng_typ_nm) return doCnd_old_asset_mng_typ_nm_VC(info);
		if (vc == Cnd_old_alt_grp_cd) return doCnd_old_alt_grp_cd_VC(info);
		if (vc == Cnd_old_alt_grp_nm) return doCnd_old_alt_grp_nm_VC(info);
		if (vc == Cnd_old_alt_itm_typ) return doCnd_old_alt_itm_typ_VC(info);
		if (vc == Cnd_old_alt_itm_typ_nm) return doCnd_old_alt_itm_typ_nm_VC(info);
		if (vc == Cnd_new_alt_itm_ratio) return doCnd_new_alt_itm_ratio_VC(info);
		if (vc == Cnd_new_alt_alloc_prio) return doCnd_new_alt_alloc_prio_VC(info);
		if (vc == Cnd_new_stk_mng_typ) return doCnd_new_stk_mng_typ_VC(info);
		if (vc == Cnd_new_stk_mng_typ_nm) return doCnd_new_stk_mng_typ_nm_VC(info);
		if (vc == Cnd_new_asset_mng_typ) return doCnd_new_asset_mng_typ_VC(info);
		if (vc == Cnd_new_asset_mng_typ_nm) return doCnd_new_asset_mng_typ_nm_VC(info);
		if (vc == Cnd_new_alt_grp_cd) return doCnd_new_alt_grp_cd_VC(info);
		if (vc == Cnd_new_alt_grp_nm) return doCnd_new_alt_grp_nm_VC(info);
		if (vc == Cnd_new_alt_itm_typ) return doCnd_new_alt_itm_typ_VC(info);
		if (vc == Cnd_new_alt_itm_typ_nm) return doCnd_new_alt_itm_typ_nm_VC(info);
		if (vc == BulkSet_st_dt) return doBulkSet_st_dt_VC(info);
		if (vc == BulkSet_end_dt) return doBulkSet_end_dt_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_wg_nm) return doDtl_wg_nm_VC(info);
		if (vc == columnDtl_par_itm_typ) return doDtl_par_itm_typ_VC(info);
		if (vc == columnDtl_par_itm_typ_nm) return doDtl_par_itm_typ_nm_VC(info);
		if (vc == columnDtl_par_itm_typ_d_cd) return doDtl_par_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_par_itm_typ_d_nm) return doDtl_par_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_par_sno1_mng_typ) return doDtl_par_sno1_mng_typ_VC(info);
		if (vc == columnDtl_par_sno2_mng_typ) return doDtl_par_sno2_mng_typ_VC(info);
		if (vc == columnDtl_par_sno3_mng_typ) return doDtl_par_sno3_mng_typ_VC(info);
		if (vc == columnDtl_par_sno4_mng_typ) return doDtl_par_sno4_mng_typ_VC(info);
		if (vc == columnDtl_par_def_bom_ptn) return doDtl_par_def_bom_ptn_VC(info);
		if (vc == columnDtl_bom_ptn) return doDtl_bom_ptn_VC(info);
		if (vc == columnDtl_oper_cd) return doDtl_oper_cd_VC(info);
		if (vc == columnDtl_oper_nm) return doDtl_oper_nm_VC(info);
		if (vc == columnDtl_oper_seq) return doDtl_oper_seq_VC(info);
		if (vc == columnDtl_disp_seq) return doDtl_disp_seq_VC(info);
		if (vc == columnDtl_chd_itm_typ) return doDtl_chd_itm_typ_VC(info);
		if (vc == columnDtl_chd_itm_typ_nm) return doDtl_chd_itm_typ_nm_VC(info);
		if (vc == columnDtl_chd_itm_typ_d_cd) return doDtl_chd_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_chd_itm_typ_d_nm) return doDtl_chd_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_chd_stk_mng_typ) return doDtl_chd_stk_mng_typ_VC(info);
		if (vc == columnDtl_chd_asset_mng_typ) return doDtl_chd_asset_mng_typ_VC(info);
		if (vc == columnDtl_par_dec_place) return doDtl_par_dec_place_VC(info);
		if (vc == columnDtl_chd_dec_place) return doDtl_chd_dec_place_VC(info);
		if (vc == columnDtl_lot_mng_typ) return doDtl_lot_mng_typ_VC(info);
		if (vc == columnDtl_sublot_mng_typ) return doDtl_sublot_mng_typ_VC(info);
		if (vc == columnDtl_chd_sno1_mng_typ) return doDtl_chd_sno1_mng_typ_VC(info);
		if (vc == columnDtl_chd_sno2_mng_typ) return doDtl_chd_sno2_mng_typ_VC(info);
		if (vc == columnDtl_chd_sno3_mng_typ) return doDtl_chd_sno3_mng_typ_VC(info);
		if (vc == columnDtl_chd_sno4_mng_typ) return doDtl_chd_sno4_mng_typ_VC(info);
		if (vc == columnDtl_chd_def_bom_ptn) return doDtl_chd_def_bom_ptn_VC(info);
		if (vc == columnDtl_ver_flg) return doDtl_ver_flg_VC(info);
		if (vc == columnDtl_byprod_flg) return doDtl_byprod_flg_VC(info);
		if (vc == columnDtl_ph_flg) return doDtl_ph_flg_VC(info);
		if (vc == columnDtl_ph_bom_ptn) return doDtl_ph_bom_ptn_VC(info);
		if (vc == columnDtl_alt_itm_flg) return doDtl_alt_itm_flg_VC(info);
		if (vc == columnDtl_alt_grp_cd) return doDtl_alt_grp_cd_VC(info);
		if (vc == columnDtl_alt_grp_nm) return doDtl_alt_grp_nm_VC(info);
		if (vc == columnDtl_alt_itm_typ) return doDtl_alt_itm_typ_VC(info);
		if (vc == columnDtl_alt_itm_typ_nm) return doDtl_alt_itm_typ_nm_VC(info);
		if (vc == columnDtl_alt_itm_ratio) return doDtl_alt_itm_ratio_VC(info);
		if (vc == columnDtl_alt_alloc_prio) return doDtl_alt_alloc_prio_VC(info);
		if (vc == columnDtl_sno_typ1) return doDtl_sno_typ1_VC(info);
		if (vc == columnDtl_sno_typ_nm1) return doDtl_sno_typ_nm1_VC(info);
		if (vc == columnDtl_sno_typ2) return doDtl_sno_typ2_VC(info);
		if (vc == columnDtl_sno_typ_nm2) return doDtl_sno_typ_nm2_VC(info);
		if (vc == columnDtl_sno_typ3) return doDtl_sno_typ3_VC(info);
		if (vc == columnDtl_sno_typ_nm3) return doDtl_sno_typ_nm3_VC(info);
		if (vc == columnDtl_sno_typ4) return doDtl_sno_typ4_VC(info);
		if (vc == columnDtl_sno_typ_nm4) return doDtl_sno_typ_nm4_VC(info);
		if (vc == columnDtl_par_base_unit_cd) return doDtl_par_base_unit_cd_VC(info);
		if (vc == columnDtl_par_base_unit_nm) return doDtl_par_base_unit_nm_VC(info);
		if (vc == columnDtl_chd_base_unit_cd) return doDtl_chd_base_unit_cd_VC(info);
		if (vc == columnDtl_chd_base_unit_nm) return doDtl_chd_base_unit_nm_VC(info);
		if (vc == columnDtl_in_offst_typ) return doDtl_in_offst_typ_VC(info);
		if (vc == columnDtl_in_offst_typ_nm) return doDtl_in_offst_typ_nm_VC(info);
		if (vc == columnDtl_in_offst) return doDtl_in_offst_VC(info);
		if (vc == columnDtl_bkf_typ) return doDtl_bkf_typ_VC(info);
		if (vc == columnDtl_bkf_typ_nm) return doDtl_bkf_typ_nm_VC(info);
		if (vc == columnDtl_inst_lot_fix_flg) return doDtl_inst_lot_fix_flg_VC(info);
		if (vc == columnDtl_lot_mix_flg) return doDtl_lot_mix_flg_VC(info);
		if (vc == columnDtl_sublot_mix_flg) return doDtl_sublot_mix_flg_VC(info);
		if (vc == columnDtl_alloc_ctl_typ) return doDtl_alloc_ctl_typ_VC(info);
		if (vc == columnDtl_alloc_ctl_typ_nm) return doDtl_alloc_ctl_typ_nm_VC(info);
		if (vc == columnDtl_main_itm_flg) return doDtl_main_itm_flg_VC(info);
		if (vc == columnDtl_yield_calc_flg) return doDtl_yield_calc_flg_VC(info);
		if (vc == columnDtl_inpt_ctl_typ) return doDtl_inpt_ctl_typ_VC(info);
		if (vc == columnDtl_inpt_ctl_typ_nm) return doDtl_inpt_ctl_typ_nm_VC(info);
		if (vc == columnDtl_chng_no) return doDtl_chng_no_VC(info);
		if (vc == columnDtl_ext_sys_no_bom) return doDtl_ext_sys_no_bom_VC(info);
		if (vc == columnDtl_not_cost_flg) return doDtl_not_cost_flg_VC(info);
		if (vc == columnDtl_memo1) return doDtl_memo1_VC(info);
		if (vc == columnDtl_memo2) return doDtl_memo2_VC(info);
		if (vc == columnDtl_memo3) return doDtl_memo3_VC(info);
		if (vc == columnDtl_bom_key) return doDtl_bom_key_VC(info);
		if (vc == columnDtl_ins_usr_id) return doDtl_ins_usr_id_VC(info);
		if (vc == columnDtl_ins_usr_nm) return doDtl_ins_usr_nm_VC(info);
		if (vc == columnDtl_ins_ts) return doDtl_ins_ts_VC(info);
		if (vc == columnDtl_ins_func_id) return doDtl_ins_func_id_VC(info);
		if (vc == columnDtl_ins_func_nm) return doDtl_ins_func_nm_VC(info);
		if (vc == columnDtl_upd_cntr) return doDtl_upd_cntr_VC(info);
		if (vc == columnDtl_upd_usr_id) return doDtl_upd_usr_id_VC(info);
		if (vc == columnDtl_upd_usr_nm) return doDtl_upd_usr_nm_VC(info);
		if (vc == columnDtl_upd_ts) return doDtl_upd_ts_VC(info);
		if (vc == columnDtl_upd_func_id) return doDtl_upd_func_id_VC(info);
		if (vc == columnDtl_upd_func_nm) return doDtl_upd_func_nm_VC(info);
		if (vc == columnDtl_upd_srv_req_no) return doDtl_upd_srv_req_no_VC(info);
		if (vc == columnDtl_del_usr_id) return doDtl_del_usr_id_VC(info);
		if (vc == columnDtl_del_usr_nm) return doDtl_del_usr_nm_VC(info);
		if (vc == columnDtl_del_ts) return doDtl_del_ts_VC(info);
		return true;
	}

	/**
	 * [CndTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCndTab_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[chng_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chng_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ext_sys_no_bom]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_sys_no_bom_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[alt_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_alt_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_oper_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[par_itm_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_par_itm_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chd_itm_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bom_chng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bom_chng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bom_chng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bom_chng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chng_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chng_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chng_end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chng_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chng_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chng_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[chng_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_chng_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[old_alt_itm_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_old_alt_itm_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[old_alt_alloc_prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_old_alt_alloc_prio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[old_stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_old_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[old_stk_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_old_stk_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[old_asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_old_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[old_asset_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_old_asset_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[old_alt_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_old_alt_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[old_alt_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_old_alt_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[old_alt_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_old_alt_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[old_alt_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_old_alt_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[new_alt_itm_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_new_alt_itm_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[new_alt_alloc_prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_new_alt_alloc_prio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[new_stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_new_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[new_stk_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_new_stk_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[new_asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_new_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[new_asset_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_new_asset_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[new_alt_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_new_alt_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[new_alt_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_new_alt_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[new_alt_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_new_alt_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[new_alt_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_new_alt_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_end_dt_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_def_bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_def_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_itm_typ_d_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_def_bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_def_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[byprod_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_byprod_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ph_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ph_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ph_bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ph_bom_ptn_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[alt_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alt_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alt_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alt_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alt_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alt_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alt_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alt_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alt_itm_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alt_itm_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alt_alloc_prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alt_alloc_prio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno_typ1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno_typ1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno_typ_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno_typ2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno_typ2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno_typ_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno_typ3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno_typ3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno_typ_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno_typ4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno_typ4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno_typ_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[par_base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_par_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[in_offst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_in_offst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[in_offst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_in_offst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[in_offst]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_in_offst_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bkf_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bkf_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bkf_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bkf_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inst_lot_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inst_lot_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alloc_ctl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alloc_ctl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[main_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_main_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[yield_calc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_yield_calc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inpt_ctl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inpt_ctl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inpt_ctl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inpt_ctl_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ext_sys_no_bom]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_no_bom_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[not_cost_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_not_cost_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_key]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bom_key_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_ts_VC(MCEventInfo info){
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
		if (nc == CndTabTab) doCndTab_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_cmn_flg) doCnd_cmn_flg_NC(info);
		else if (nc == Cnd_wg_flg) doCnd_wg_flg_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_chng_no) doCnd_chng_no_NC(info);
		else if (nc == Cnd_ext_sys_no_bom) doCnd_ext_sys_no_bom_NC(info);
		else if (nc == Cnd_alt_grp_cd) doCnd_alt_grp_cd_NC(info);
		else if (nc == Cnd_oper_cd) doCnd_oper_cd_NC(info);
		else if (nc == Cnd_oper_nm) doCnd_oper_nm_NC(info);
		else if (nc == Cnd_bom_ptn) doCnd_bom_ptn_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == Cnd_par_itm_grp_cd1) doCnd_par_itm_grp_cd1_NC(info);
		else if (nc == Cnd_par_itm_grp_nm1) doCnd_par_itm_grp_nm1_NC(info);
		else if (nc == Cnd_par_itm_grp_cd2) doCnd_par_itm_grp_cd2_NC(info);
		else if (nc == Cnd_par_itm_grp_nm2) doCnd_par_itm_grp_nm2_NC(info);
		else if (nc == Cnd_par_itm_grp_cd3) doCnd_par_itm_grp_cd3_NC(info);
		else if (nc == Cnd_par_itm_grp_nm3) doCnd_par_itm_grp_nm3_NC(info);
		else if (nc == Cnd_par_itm_grp_cd4) doCnd_par_itm_grp_cd4_NC(info);
		else if (nc == Cnd_par_itm_grp_nm4) doCnd_par_itm_grp_nm4_NC(info);
		else if (nc == Cnd_par_itm_grp_cd5) doCnd_par_itm_grp_cd5_NC(info);
		else if (nc == Cnd_par_itm_grp_nm5) doCnd_par_itm_grp_nm5_NC(info);
		else if (nc == Cnd_par_itm_grp_cd6) doCnd_par_itm_grp_cd6_NC(info);
		else if (nc == Cnd_par_itm_grp_nm6) doCnd_par_itm_grp_nm6_NC(info);
		else if (nc == Cnd_par_itm_grp_cd7) doCnd_par_itm_grp_cd7_NC(info);
		else if (nc == Cnd_par_itm_grp_nm7) doCnd_par_itm_grp_nm7_NC(info);
		else if (nc == Cnd_par_itm_grp_cd8) doCnd_par_itm_grp_cd8_NC(info);
		else if (nc == Cnd_par_itm_grp_nm8) doCnd_par_itm_grp_nm8_NC(info);
		else if (nc == Cnd_par_itm_grp_cd9) doCnd_par_itm_grp_cd9_NC(info);
		else if (nc == Cnd_par_itm_grp_nm9) doCnd_par_itm_grp_nm9_NC(info);
		else if (nc == Cnd_par_itm_grp_cd10) doCnd_par_itm_grp_cd10_NC(info);
		else if (nc == Cnd_par_itm_grp_nm10) doCnd_par_itm_grp_nm10_NC(info);
		else if (nc == Cnd_chd_itm_grp_cd1) doCnd_chd_itm_grp_cd1_NC(info);
		else if (nc == Cnd_chd_itm_grp_nm1) doCnd_chd_itm_grp_nm1_NC(info);
		else if (nc == Cnd_chd_itm_grp_cd2) doCnd_chd_itm_grp_cd2_NC(info);
		else if (nc == Cnd_chd_itm_grp_nm2) doCnd_chd_itm_grp_nm2_NC(info);
		else if (nc == Cnd_chd_itm_grp_cd3) doCnd_chd_itm_grp_cd3_NC(info);
		else if (nc == Cnd_chd_itm_grp_nm3) doCnd_chd_itm_grp_nm3_NC(info);
		else if (nc == Cnd_chd_itm_grp_cd4) doCnd_chd_itm_grp_cd4_NC(info);
		else if (nc == Cnd_chd_itm_grp_nm4) doCnd_chd_itm_grp_nm4_NC(info);
		else if (nc == Cnd_chd_itm_grp_cd5) doCnd_chd_itm_grp_cd5_NC(info);
		else if (nc == Cnd_chd_itm_grp_nm5) doCnd_chd_itm_grp_nm5_NC(info);
		else if (nc == Cnd_chd_itm_grp_cd6) doCnd_chd_itm_grp_cd6_NC(info);
		else if (nc == Cnd_chd_itm_grp_nm6) doCnd_chd_itm_grp_nm6_NC(info);
		else if (nc == Cnd_chd_itm_grp_cd7) doCnd_chd_itm_grp_cd7_NC(info);
		else if (nc == Cnd_chd_itm_grp_nm7) doCnd_chd_itm_grp_nm7_NC(info);
		else if (nc == Cnd_chd_itm_grp_cd8) doCnd_chd_itm_grp_cd8_NC(info);
		else if (nc == Cnd_chd_itm_grp_nm8) doCnd_chd_itm_grp_nm8_NC(info);
		else if (nc == Cnd_chd_itm_grp_cd9) doCnd_chd_itm_grp_cd9_NC(info);
		else if (nc == Cnd_chd_itm_grp_nm9) doCnd_chd_itm_grp_nm9_NC(info);
		else if (nc == Cnd_chd_itm_grp_cd10) doCnd_chd_itm_grp_cd10_NC(info);
		else if (nc == Cnd_chd_itm_grp_nm10) doCnd_chd_itm_grp_nm10_NC(info);
		else if (nc == Cnd_bom_chng_typ) doCnd_bom_chng_typ_NC(info);
		else if (nc == Cnd_bom_chng_typ_nm) doCnd_bom_chng_typ_nm_NC(info);
		else if (nc == Cnd_chng_st_dt) doCnd_chng_st_dt_NC(info);
		else if (nc == Cnd_chng_end_dt) doCnd_chng_end_dt_NC(info);
		else if (nc == Cnd_chng_wg_cd) doCnd_chng_wg_cd_NC(info);
		else if (nc == Cnd_chng_wg_nm) doCnd_chng_wg_nm_NC(info);
		else if (nc == Cnd_old_alt_itm_ratio) doCnd_old_alt_itm_ratio_NC(info);
		else if (nc == Cnd_old_alt_alloc_prio) doCnd_old_alt_alloc_prio_NC(info);
		else if (nc == Cnd_old_stk_mng_typ) doCnd_old_stk_mng_typ_NC(info);
		else if (nc == Cnd_old_stk_mng_typ_nm) doCnd_old_stk_mng_typ_nm_NC(info);
		else if (nc == Cnd_old_asset_mng_typ) doCnd_old_asset_mng_typ_NC(info);
		else if (nc == Cnd_old_asset_mng_typ_nm) doCnd_old_asset_mng_typ_nm_NC(info);
		else if (nc == Cnd_old_alt_grp_cd) doCnd_old_alt_grp_cd_NC(info);
		else if (nc == Cnd_old_alt_grp_nm) doCnd_old_alt_grp_nm_NC(info);
		else if (nc == Cnd_old_alt_itm_typ) doCnd_old_alt_itm_typ_NC(info);
		else if (nc == Cnd_old_alt_itm_typ_nm) doCnd_old_alt_itm_typ_nm_NC(info);
		else if (nc == Cnd_new_alt_itm_ratio) doCnd_new_alt_itm_ratio_NC(info);
		else if (nc == Cnd_new_alt_alloc_prio) doCnd_new_alt_alloc_prio_NC(info);
		else if (nc == Cnd_new_stk_mng_typ) doCnd_new_stk_mng_typ_NC(info);
		else if (nc == Cnd_new_stk_mng_typ_nm) doCnd_new_stk_mng_typ_nm_NC(info);
		else if (nc == Cnd_new_asset_mng_typ) doCnd_new_asset_mng_typ_NC(info);
		else if (nc == Cnd_new_asset_mng_typ_nm) doCnd_new_asset_mng_typ_nm_NC(info);
		else if (nc == Cnd_new_alt_grp_cd) doCnd_new_alt_grp_cd_NC(info);
		else if (nc == Cnd_new_alt_grp_nm) doCnd_new_alt_grp_nm_NC(info);
		else if (nc == Cnd_new_alt_itm_typ) doCnd_new_alt_itm_typ_NC(info);
		else if (nc == Cnd_new_alt_itm_typ_nm) doCnd_new_alt_itm_typ_nm_NC(info);
		else if (nc == BulkSet_st_dt) doBulkSet_st_dt_NC(info);
		else if (nc == BulkSet_end_dt) doBulkSet_end_dt_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_wg_nm) doDtl_wg_nm_NC(info);
		else if (nc == columnDtl_par_itm_typ) doDtl_par_itm_typ_NC(info);
		else if (nc == columnDtl_par_itm_typ_nm) doDtl_par_itm_typ_nm_NC(info);
		else if (nc == columnDtl_par_itm_typ_d_cd) doDtl_par_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_par_itm_typ_d_nm) doDtl_par_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_par_sno1_mng_typ) doDtl_par_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_par_sno2_mng_typ) doDtl_par_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_par_sno3_mng_typ) doDtl_par_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_par_sno4_mng_typ) doDtl_par_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_par_def_bom_ptn) doDtl_par_def_bom_ptn_NC(info);
		else if (nc == columnDtl_bom_ptn) doDtl_bom_ptn_NC(info);
		else if (nc == columnDtl_oper_cd) doDtl_oper_cd_NC(info);
		else if (nc == columnDtl_oper_nm) doDtl_oper_nm_NC(info);
		else if (nc == columnDtl_oper_seq) doDtl_oper_seq_NC(info);
		else if (nc == columnDtl_disp_seq) doDtl_disp_seq_NC(info);
		else if (nc == columnDtl_chd_itm_typ) doDtl_chd_itm_typ_NC(info);
		else if (nc == columnDtl_chd_itm_typ_nm) doDtl_chd_itm_typ_nm_NC(info);
		else if (nc == columnDtl_chd_itm_typ_d_cd) doDtl_chd_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_chd_itm_typ_d_nm) doDtl_chd_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_chd_stk_mng_typ) doDtl_chd_stk_mng_typ_NC(info);
		else if (nc == columnDtl_chd_asset_mng_typ) doDtl_chd_asset_mng_typ_NC(info);
		else if (nc == columnDtl_par_dec_place) doDtl_par_dec_place_NC(info);
		else if (nc == columnDtl_chd_dec_place) doDtl_chd_dec_place_NC(info);
		else if (nc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NC(info);
		else if (nc == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NC(info);
		else if (nc == columnDtl_chd_sno1_mng_typ) doDtl_chd_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_chd_sno2_mng_typ) doDtl_chd_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_chd_sno3_mng_typ) doDtl_chd_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_chd_sno4_mng_typ) doDtl_chd_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_chd_def_bom_ptn) doDtl_chd_def_bom_ptn_NC(info);
		else if (nc == columnDtl_ver_flg) doDtl_ver_flg_NC(info);
		else if (nc == columnDtl_byprod_flg) doDtl_byprod_flg_NC(info);
		else if (nc == columnDtl_ph_flg) doDtl_ph_flg_NC(info);
		else if (nc == columnDtl_ph_bom_ptn) doDtl_ph_bom_ptn_NC(info);
		else if (nc == columnDtl_alt_itm_flg) doDtl_alt_itm_flg_NC(info);
		else if (nc == columnDtl_alt_grp_cd) doDtl_alt_grp_cd_NC(info);
		else if (nc == columnDtl_alt_grp_nm) doDtl_alt_grp_nm_NC(info);
		else if (nc == columnDtl_alt_itm_typ) doDtl_alt_itm_typ_NC(info);
		else if (nc == columnDtl_alt_itm_typ_nm) doDtl_alt_itm_typ_nm_NC(info);
		else if (nc == columnDtl_alt_itm_ratio) doDtl_alt_itm_ratio_NC(info);
		else if (nc == columnDtl_alt_alloc_prio) doDtl_alt_alloc_prio_NC(info);
		else if (nc == columnDtl_sno_typ1) doDtl_sno_typ1_NC(info);
		else if (nc == columnDtl_sno_typ_nm1) doDtl_sno_typ_nm1_NC(info);
		else if (nc == columnDtl_sno_typ2) doDtl_sno_typ2_NC(info);
		else if (nc == columnDtl_sno_typ_nm2) doDtl_sno_typ_nm2_NC(info);
		else if (nc == columnDtl_sno_typ3) doDtl_sno_typ3_NC(info);
		else if (nc == columnDtl_sno_typ_nm3) doDtl_sno_typ_nm3_NC(info);
		else if (nc == columnDtl_sno_typ4) doDtl_sno_typ4_NC(info);
		else if (nc == columnDtl_sno_typ_nm4) doDtl_sno_typ_nm4_NC(info);
		else if (nc == columnDtl_par_base_unit_cd) doDtl_par_base_unit_cd_NC(info);
		else if (nc == columnDtl_par_base_unit_nm) doDtl_par_base_unit_nm_NC(info);
		else if (nc == columnDtl_chd_base_unit_cd) doDtl_chd_base_unit_cd_NC(info);
		else if (nc == columnDtl_chd_base_unit_nm) doDtl_chd_base_unit_nm_NC(info);
		else if (nc == columnDtl_in_offst_typ) doDtl_in_offst_typ_NC(info);
		else if (nc == columnDtl_in_offst_typ_nm) doDtl_in_offst_typ_nm_NC(info);
		else if (nc == columnDtl_in_offst) doDtl_in_offst_NC(info);
		else if (nc == columnDtl_bkf_typ) doDtl_bkf_typ_NC(info);
		else if (nc == columnDtl_bkf_typ_nm) doDtl_bkf_typ_nm_NC(info);
		else if (nc == columnDtl_inst_lot_fix_flg) doDtl_inst_lot_fix_flg_NC(info);
		else if (nc == columnDtl_lot_mix_flg) doDtl_lot_mix_flg_NC(info);
		else if (nc == columnDtl_sublot_mix_flg) doDtl_sublot_mix_flg_NC(info);
		else if (nc == columnDtl_alloc_ctl_typ) doDtl_alloc_ctl_typ_NC(info);
		else if (nc == columnDtl_alloc_ctl_typ_nm) doDtl_alloc_ctl_typ_nm_NC(info);
		else if (nc == columnDtl_main_itm_flg) doDtl_main_itm_flg_NC(info);
		else if (nc == columnDtl_yield_calc_flg) doDtl_yield_calc_flg_NC(info);
		else if (nc == columnDtl_inpt_ctl_typ) doDtl_inpt_ctl_typ_NC(info);
		else if (nc == columnDtl_inpt_ctl_typ_nm) doDtl_inpt_ctl_typ_nm_NC(info);
		else if (nc == columnDtl_chng_no) doDtl_chng_no_NC(info);
		else if (nc == columnDtl_ext_sys_no_bom) doDtl_ext_sys_no_bom_NC(info);
		else if (nc == columnDtl_not_cost_flg) doDtl_not_cost_flg_NC(info);
		else if (nc == columnDtl_memo1) doDtl_memo1_NC(info);
		else if (nc == columnDtl_memo2) doDtl_memo2_NC(info);
		else if (nc == columnDtl_memo3) doDtl_memo3_NC(info);
		else if (nc == columnDtl_bom_key) doDtl_bom_key_NC(info);
		else if (nc == columnDtl_ins_usr_id) doDtl_ins_usr_id_NC(info);
		else if (nc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NC(info);
		else if (nc == columnDtl_ins_ts) doDtl_ins_ts_NC(info);
		else if (nc == columnDtl_ins_func_id) doDtl_ins_func_id_NC(info);
		else if (nc == columnDtl_ins_func_nm) doDtl_ins_func_nm_NC(info);
		else if (nc == columnDtl_upd_cntr) doDtl_upd_cntr_NC(info);
		else if (nc == columnDtl_upd_usr_id) doDtl_upd_usr_id_NC(info);
		else if (nc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NC(info);
		else if (nc == columnDtl_upd_ts) doDtl_upd_ts_NC(info);
		else if (nc == columnDtl_upd_func_id) doDtl_upd_func_id_NC(info);
		else if (nc == columnDtl_upd_func_nm) doDtl_upd_func_nm_NC(info);
		else if (nc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NC(info);
		else if (nc == columnDtl_del_usr_id) doDtl_del_usr_id_NC(info);
		else if (nc == columnDtl_del_usr_nm) doDtl_del_usr_nm_NC(info);
		else if (nc == columnDtl_del_ts) doDtl_del_ts_NC(info);
	}

	/**
	 * [CndTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCndTab_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[chng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_no_bom]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_no_bom_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[par_itm_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_chng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_chng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_chng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_chng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chng_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chng_end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chng_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chng_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_itm_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_itm_ratio_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_alloc_prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_alloc_prio_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_stk_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_stk_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_asset_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_asset_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_itm_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_itm_ratio_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_alloc_prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_alloc_prio_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_stk_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_stk_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_asset_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_asset_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_end_dt_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_def_bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_def_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_def_bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_def_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[byprod_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_byprod_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ph_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ph_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ph_bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ph_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_ratio_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_alloc_prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_alloc_prio_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bkf_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bkf_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bkf_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bkf_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_lot_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_lot_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[main_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_main_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_calc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_calc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_ctl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_ctl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_ctl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_ctl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chng_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chng_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_bom]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_no_bom_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_cost_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_cost_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_key]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_key_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == CndTabTab) doCndTab_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_cmn_flg) doCnd_cmn_flg_NE(info);
		else if (ne == Cnd_wg_flg) doCnd_wg_flg_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_chng_no) doCnd_chng_no_NE(info);
		else if (ne == Cnd_ext_sys_no_bom) doCnd_ext_sys_no_bom_NE(info);
		else if (ne == Cnd_alt_grp_cd) doCnd_alt_grp_cd_NE(info);
		else if (ne == Cnd_oper_cd) doCnd_oper_cd_NE(info);
		else if (ne == Cnd_oper_nm) doCnd_oper_nm_NE(info);
		else if (ne == Cnd_bom_ptn) doCnd_bom_ptn_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == Cnd_par_itm_grp_cd1) doCnd_par_itm_grp_cd1_NE(info);
		else if (ne == Cnd_par_itm_grp_nm1) doCnd_par_itm_grp_nm1_NE(info);
		else if (ne == Cnd_par_itm_grp_cd2) doCnd_par_itm_grp_cd2_NE(info);
		else if (ne == Cnd_par_itm_grp_nm2) doCnd_par_itm_grp_nm2_NE(info);
		else if (ne == Cnd_par_itm_grp_cd3) doCnd_par_itm_grp_cd3_NE(info);
		else if (ne == Cnd_par_itm_grp_nm3) doCnd_par_itm_grp_nm3_NE(info);
		else if (ne == Cnd_par_itm_grp_cd4) doCnd_par_itm_grp_cd4_NE(info);
		else if (ne == Cnd_par_itm_grp_nm4) doCnd_par_itm_grp_nm4_NE(info);
		else if (ne == Cnd_par_itm_grp_cd5) doCnd_par_itm_grp_cd5_NE(info);
		else if (ne == Cnd_par_itm_grp_nm5) doCnd_par_itm_grp_nm5_NE(info);
		else if (ne == Cnd_par_itm_grp_cd6) doCnd_par_itm_grp_cd6_NE(info);
		else if (ne == Cnd_par_itm_grp_nm6) doCnd_par_itm_grp_nm6_NE(info);
		else if (ne == Cnd_par_itm_grp_cd7) doCnd_par_itm_grp_cd7_NE(info);
		else if (ne == Cnd_par_itm_grp_nm7) doCnd_par_itm_grp_nm7_NE(info);
		else if (ne == Cnd_par_itm_grp_cd8) doCnd_par_itm_grp_cd8_NE(info);
		else if (ne == Cnd_par_itm_grp_nm8) doCnd_par_itm_grp_nm8_NE(info);
		else if (ne == Cnd_par_itm_grp_cd9) doCnd_par_itm_grp_cd9_NE(info);
		else if (ne == Cnd_par_itm_grp_nm9) doCnd_par_itm_grp_nm9_NE(info);
		else if (ne == Cnd_par_itm_grp_cd10) doCnd_par_itm_grp_cd10_NE(info);
		else if (ne == Cnd_par_itm_grp_nm10) doCnd_par_itm_grp_nm10_NE(info);
		else if (ne == Cnd_chd_itm_grp_cd1) doCnd_chd_itm_grp_cd1_NE(info);
		else if (ne == Cnd_chd_itm_grp_nm1) doCnd_chd_itm_grp_nm1_NE(info);
		else if (ne == Cnd_chd_itm_grp_cd2) doCnd_chd_itm_grp_cd2_NE(info);
		else if (ne == Cnd_chd_itm_grp_nm2) doCnd_chd_itm_grp_nm2_NE(info);
		else if (ne == Cnd_chd_itm_grp_cd3) doCnd_chd_itm_grp_cd3_NE(info);
		else if (ne == Cnd_chd_itm_grp_nm3) doCnd_chd_itm_grp_nm3_NE(info);
		else if (ne == Cnd_chd_itm_grp_cd4) doCnd_chd_itm_grp_cd4_NE(info);
		else if (ne == Cnd_chd_itm_grp_nm4) doCnd_chd_itm_grp_nm4_NE(info);
		else if (ne == Cnd_chd_itm_grp_cd5) doCnd_chd_itm_grp_cd5_NE(info);
		else if (ne == Cnd_chd_itm_grp_nm5) doCnd_chd_itm_grp_nm5_NE(info);
		else if (ne == Cnd_chd_itm_grp_cd6) doCnd_chd_itm_grp_cd6_NE(info);
		else if (ne == Cnd_chd_itm_grp_nm6) doCnd_chd_itm_grp_nm6_NE(info);
		else if (ne == Cnd_chd_itm_grp_cd7) doCnd_chd_itm_grp_cd7_NE(info);
		else if (ne == Cnd_chd_itm_grp_nm7) doCnd_chd_itm_grp_nm7_NE(info);
		else if (ne == Cnd_chd_itm_grp_cd8) doCnd_chd_itm_grp_cd8_NE(info);
		else if (ne == Cnd_chd_itm_grp_nm8) doCnd_chd_itm_grp_nm8_NE(info);
		else if (ne == Cnd_chd_itm_grp_cd9) doCnd_chd_itm_grp_cd9_NE(info);
		else if (ne == Cnd_chd_itm_grp_nm9) doCnd_chd_itm_grp_nm9_NE(info);
		else if (ne == Cnd_chd_itm_grp_cd10) doCnd_chd_itm_grp_cd10_NE(info);
		else if (ne == Cnd_chd_itm_grp_nm10) doCnd_chd_itm_grp_nm10_NE(info);
		else if (ne == Cnd_bom_chng_typ) doCnd_bom_chng_typ_NE(info);
		else if (ne == Cnd_bom_chng_typ_nm) doCnd_bom_chng_typ_nm_NE(info);
		else if (ne == Cnd_chng_st_dt) doCnd_chng_st_dt_NE(info);
		else if (ne == Cnd_chng_end_dt) doCnd_chng_end_dt_NE(info);
		else if (ne == Cnd_chng_wg_cd) doCnd_chng_wg_cd_NE(info);
		else if (ne == Cnd_chng_wg_nm) doCnd_chng_wg_nm_NE(info);
		else if (ne == Cnd_old_alt_itm_ratio) doCnd_old_alt_itm_ratio_NE(info);
		else if (ne == Cnd_old_alt_alloc_prio) doCnd_old_alt_alloc_prio_NE(info);
		else if (ne == Cnd_old_stk_mng_typ) doCnd_old_stk_mng_typ_NE(info);
		else if (ne == Cnd_old_stk_mng_typ_nm) doCnd_old_stk_mng_typ_nm_NE(info);
		else if (ne == Cnd_old_asset_mng_typ) doCnd_old_asset_mng_typ_NE(info);
		else if (ne == Cnd_old_asset_mng_typ_nm) doCnd_old_asset_mng_typ_nm_NE(info);
		else if (ne == Cnd_old_alt_grp_cd) doCnd_old_alt_grp_cd_NE(info);
		else if (ne == Cnd_old_alt_grp_nm) doCnd_old_alt_grp_nm_NE(info);
		else if (ne == Cnd_old_alt_itm_typ) doCnd_old_alt_itm_typ_NE(info);
		else if (ne == Cnd_old_alt_itm_typ_nm) doCnd_old_alt_itm_typ_nm_NE(info);
		else if (ne == Cnd_new_alt_itm_ratio) doCnd_new_alt_itm_ratio_NE(info);
		else if (ne == Cnd_new_alt_alloc_prio) doCnd_new_alt_alloc_prio_NE(info);
		else if (ne == Cnd_new_stk_mng_typ) doCnd_new_stk_mng_typ_NE(info);
		else if (ne == Cnd_new_stk_mng_typ_nm) doCnd_new_stk_mng_typ_nm_NE(info);
		else if (ne == Cnd_new_asset_mng_typ) doCnd_new_asset_mng_typ_NE(info);
		else if (ne == Cnd_new_asset_mng_typ_nm) doCnd_new_asset_mng_typ_nm_NE(info);
		else if (ne == Cnd_new_alt_grp_cd) doCnd_new_alt_grp_cd_NE(info);
		else if (ne == Cnd_new_alt_grp_nm) doCnd_new_alt_grp_nm_NE(info);
		else if (ne == Cnd_new_alt_itm_typ) doCnd_new_alt_itm_typ_NE(info);
		else if (ne == Cnd_new_alt_itm_typ_nm) doCnd_new_alt_itm_typ_nm_NE(info);
		else if (ne == BulkSet_st_dt) doBulkSet_st_dt_NE(info);
		else if (ne == BulkSet_end_dt) doBulkSet_end_dt_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_wg_nm) doDtl_wg_nm_NE(info);
		else if (ne == columnDtl_par_itm_typ) doDtl_par_itm_typ_NE(info);
		else if (ne == columnDtl_par_itm_typ_nm) doDtl_par_itm_typ_nm_NE(info);
		else if (ne == columnDtl_par_itm_typ_d_cd) doDtl_par_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_par_itm_typ_d_nm) doDtl_par_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_par_sno1_mng_typ) doDtl_par_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_par_sno2_mng_typ) doDtl_par_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_par_sno3_mng_typ) doDtl_par_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_par_sno4_mng_typ) doDtl_par_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_par_def_bom_ptn) doDtl_par_def_bom_ptn_NE(info);
		else if (ne == columnDtl_bom_ptn) doDtl_bom_ptn_NE(info);
		else if (ne == columnDtl_oper_cd) doDtl_oper_cd_NE(info);
		else if (ne == columnDtl_oper_nm) doDtl_oper_nm_NE(info);
		else if (ne == columnDtl_oper_seq) doDtl_oper_seq_NE(info);
		else if (ne == columnDtl_disp_seq) doDtl_disp_seq_NE(info);
		else if (ne == columnDtl_chd_itm_typ) doDtl_chd_itm_typ_NE(info);
		else if (ne == columnDtl_chd_itm_typ_nm) doDtl_chd_itm_typ_nm_NE(info);
		else if (ne == columnDtl_chd_itm_typ_d_cd) doDtl_chd_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_chd_itm_typ_d_nm) doDtl_chd_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_chd_stk_mng_typ) doDtl_chd_stk_mng_typ_NE(info);
		else if (ne == columnDtl_chd_asset_mng_typ) doDtl_chd_asset_mng_typ_NE(info);
		else if (ne == columnDtl_par_dec_place) doDtl_par_dec_place_NE(info);
		else if (ne == columnDtl_chd_dec_place) doDtl_chd_dec_place_NE(info);
		else if (ne == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NE(info);
		else if (ne == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NE(info);
		else if (ne == columnDtl_chd_sno1_mng_typ) doDtl_chd_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_chd_sno2_mng_typ) doDtl_chd_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_chd_sno3_mng_typ) doDtl_chd_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_chd_sno4_mng_typ) doDtl_chd_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_chd_def_bom_ptn) doDtl_chd_def_bom_ptn_NE(info);
		else if (ne == columnDtl_ver_flg) doDtl_ver_flg_NE(info);
		else if (ne == columnDtl_byprod_flg) doDtl_byprod_flg_NE(info);
		else if (ne == columnDtl_ph_flg) doDtl_ph_flg_NE(info);
		else if (ne == columnDtl_ph_bom_ptn) doDtl_ph_bom_ptn_NE(info);
		else if (ne == columnDtl_alt_itm_flg) doDtl_alt_itm_flg_NE(info);
		else if (ne == columnDtl_alt_grp_cd) doDtl_alt_grp_cd_NE(info);
		else if (ne == columnDtl_alt_grp_nm) doDtl_alt_grp_nm_NE(info);
		else if (ne == columnDtl_alt_itm_typ) doDtl_alt_itm_typ_NE(info);
		else if (ne == columnDtl_alt_itm_typ_nm) doDtl_alt_itm_typ_nm_NE(info);
		else if (ne == columnDtl_alt_itm_ratio) doDtl_alt_itm_ratio_NE(info);
		else if (ne == columnDtl_alt_alloc_prio) doDtl_alt_alloc_prio_NE(info);
		else if (ne == columnDtl_sno_typ1) doDtl_sno_typ1_NE(info);
		else if (ne == columnDtl_sno_typ_nm1) doDtl_sno_typ_nm1_NE(info);
		else if (ne == columnDtl_sno_typ2) doDtl_sno_typ2_NE(info);
		else if (ne == columnDtl_sno_typ_nm2) doDtl_sno_typ_nm2_NE(info);
		else if (ne == columnDtl_sno_typ3) doDtl_sno_typ3_NE(info);
		else if (ne == columnDtl_sno_typ_nm3) doDtl_sno_typ_nm3_NE(info);
		else if (ne == columnDtl_sno_typ4) doDtl_sno_typ4_NE(info);
		else if (ne == columnDtl_sno_typ_nm4) doDtl_sno_typ_nm4_NE(info);
		else if (ne == columnDtl_par_base_unit_cd) doDtl_par_base_unit_cd_NE(info);
		else if (ne == columnDtl_par_base_unit_nm) doDtl_par_base_unit_nm_NE(info);
		else if (ne == columnDtl_chd_base_unit_cd) doDtl_chd_base_unit_cd_NE(info);
		else if (ne == columnDtl_chd_base_unit_nm) doDtl_chd_base_unit_nm_NE(info);
		else if (ne == columnDtl_in_offst_typ) doDtl_in_offst_typ_NE(info);
		else if (ne == columnDtl_in_offst_typ_nm) doDtl_in_offst_typ_nm_NE(info);
		else if (ne == columnDtl_in_offst) doDtl_in_offst_NE(info);
		else if (ne == columnDtl_bkf_typ) doDtl_bkf_typ_NE(info);
		else if (ne == columnDtl_bkf_typ_nm) doDtl_bkf_typ_nm_NE(info);
		else if (ne == columnDtl_inst_lot_fix_flg) doDtl_inst_lot_fix_flg_NE(info);
		else if (ne == columnDtl_lot_mix_flg) doDtl_lot_mix_flg_NE(info);
		else if (ne == columnDtl_sublot_mix_flg) doDtl_sublot_mix_flg_NE(info);
		else if (ne == columnDtl_alloc_ctl_typ) doDtl_alloc_ctl_typ_NE(info);
		else if (ne == columnDtl_alloc_ctl_typ_nm) doDtl_alloc_ctl_typ_nm_NE(info);
		else if (ne == columnDtl_main_itm_flg) doDtl_main_itm_flg_NE(info);
		else if (ne == columnDtl_yield_calc_flg) doDtl_yield_calc_flg_NE(info);
		else if (ne == columnDtl_inpt_ctl_typ) doDtl_inpt_ctl_typ_NE(info);
		else if (ne == columnDtl_inpt_ctl_typ_nm) doDtl_inpt_ctl_typ_nm_NE(info);
		else if (ne == columnDtl_chng_no) doDtl_chng_no_NE(info);
		else if (ne == columnDtl_ext_sys_no_bom) doDtl_ext_sys_no_bom_NE(info);
		else if (ne == columnDtl_not_cost_flg) doDtl_not_cost_flg_NE(info);
		else if (ne == columnDtl_memo1) doDtl_memo1_NE(info);
		else if (ne == columnDtl_memo2) doDtl_memo2_NE(info);
		else if (ne == columnDtl_memo3) doDtl_memo3_NE(info);
		else if (ne == columnDtl_bom_key) doDtl_bom_key_NE(info);
		else if (ne == columnDtl_ins_usr_id) doDtl_ins_usr_id_NE(info);
		else if (ne == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NE(info);
		else if (ne == columnDtl_ins_ts) doDtl_ins_ts_NE(info);
		else if (ne == columnDtl_ins_func_id) doDtl_ins_func_id_NE(info);
		else if (ne == columnDtl_ins_func_nm) doDtl_ins_func_nm_NE(info);
		else if (ne == columnDtl_upd_cntr) doDtl_upd_cntr_NE(info);
		else if (ne == columnDtl_upd_usr_id) doDtl_upd_usr_id_NE(info);
		else if (ne == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NE(info);
		else if (ne == columnDtl_upd_ts) doDtl_upd_ts_NE(info);
		else if (ne == columnDtl_upd_func_id) doDtl_upd_func_id_NE(info);
		else if (ne == columnDtl_upd_func_nm) doDtl_upd_func_nm_NE(info);
		else if (ne == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NE(info);
		else if (ne == columnDtl_del_usr_id) doDtl_del_usr_id_NE(info);
		else if (ne == columnDtl_del_usr_nm) doDtl_del_usr_nm_NE(info);
		else if (ne == columnDtl_del_ts) doDtl_del_ts_NE(info);
	}

	/**
	 * [CndTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCndTab_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[chng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_no_bom]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_no_bom_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[par_itm_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_chng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_chng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_chng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_chng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chng_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chng_end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chng_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chng_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_itm_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_itm_ratio_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_alloc_prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_alloc_prio_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_stk_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_stk_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_asset_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_asset_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_itm_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_itm_ratio_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_alloc_prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_alloc_prio_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_stk_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_stk_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_asset_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_asset_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_end_dt_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_def_bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_def_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_def_bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_def_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[byprod_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_byprod_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ph_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ph_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ph_bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ph_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_ratio_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_alloc_prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_alloc_prio_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bkf_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bkf_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bkf_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bkf_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_lot_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_lot_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[main_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_main_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_calc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_calc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_ctl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_ctl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_ctl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_ctl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chng_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chng_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_bom]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_no_bom_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_cost_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_cost_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_key]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_key_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == CndTabTab) doCndTab_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_cmn_flg) doCnd_cmn_flg_NX(info);
		else if (nx == Cnd_wg_flg) doCnd_wg_flg_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_chng_no) doCnd_chng_no_NX(info);
		else if (nx == Cnd_ext_sys_no_bom) doCnd_ext_sys_no_bom_NX(info);
		else if (nx == Cnd_alt_grp_cd) doCnd_alt_grp_cd_NX(info);
		else if (nx == Cnd_oper_cd) doCnd_oper_cd_NX(info);
		else if (nx == Cnd_oper_nm) doCnd_oper_nm_NX(info);
		else if (nx == Cnd_bom_ptn) doCnd_bom_ptn_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == Cnd_par_itm_grp_cd1) doCnd_par_itm_grp_cd1_NX(info);
		else if (nx == Cnd_par_itm_grp_nm1) doCnd_par_itm_grp_nm1_NX(info);
		else if (nx == Cnd_par_itm_grp_cd2) doCnd_par_itm_grp_cd2_NX(info);
		else if (nx == Cnd_par_itm_grp_nm2) doCnd_par_itm_grp_nm2_NX(info);
		else if (nx == Cnd_par_itm_grp_cd3) doCnd_par_itm_grp_cd3_NX(info);
		else if (nx == Cnd_par_itm_grp_nm3) doCnd_par_itm_grp_nm3_NX(info);
		else if (nx == Cnd_par_itm_grp_cd4) doCnd_par_itm_grp_cd4_NX(info);
		else if (nx == Cnd_par_itm_grp_nm4) doCnd_par_itm_grp_nm4_NX(info);
		else if (nx == Cnd_par_itm_grp_cd5) doCnd_par_itm_grp_cd5_NX(info);
		else if (nx == Cnd_par_itm_grp_nm5) doCnd_par_itm_grp_nm5_NX(info);
		else if (nx == Cnd_par_itm_grp_cd6) doCnd_par_itm_grp_cd6_NX(info);
		else if (nx == Cnd_par_itm_grp_nm6) doCnd_par_itm_grp_nm6_NX(info);
		else if (nx == Cnd_par_itm_grp_cd7) doCnd_par_itm_grp_cd7_NX(info);
		else if (nx == Cnd_par_itm_grp_nm7) doCnd_par_itm_grp_nm7_NX(info);
		else if (nx == Cnd_par_itm_grp_cd8) doCnd_par_itm_grp_cd8_NX(info);
		else if (nx == Cnd_par_itm_grp_nm8) doCnd_par_itm_grp_nm8_NX(info);
		else if (nx == Cnd_par_itm_grp_cd9) doCnd_par_itm_grp_cd9_NX(info);
		else if (nx == Cnd_par_itm_grp_nm9) doCnd_par_itm_grp_nm9_NX(info);
		else if (nx == Cnd_par_itm_grp_cd10) doCnd_par_itm_grp_cd10_NX(info);
		else if (nx == Cnd_par_itm_grp_nm10) doCnd_par_itm_grp_nm10_NX(info);
		else if (nx == Cnd_chd_itm_grp_cd1) doCnd_chd_itm_grp_cd1_NX(info);
		else if (nx == Cnd_chd_itm_grp_nm1) doCnd_chd_itm_grp_nm1_NX(info);
		else if (nx == Cnd_chd_itm_grp_cd2) doCnd_chd_itm_grp_cd2_NX(info);
		else if (nx == Cnd_chd_itm_grp_nm2) doCnd_chd_itm_grp_nm2_NX(info);
		else if (nx == Cnd_chd_itm_grp_cd3) doCnd_chd_itm_grp_cd3_NX(info);
		else if (nx == Cnd_chd_itm_grp_nm3) doCnd_chd_itm_grp_nm3_NX(info);
		else if (nx == Cnd_chd_itm_grp_cd4) doCnd_chd_itm_grp_cd4_NX(info);
		else if (nx == Cnd_chd_itm_grp_nm4) doCnd_chd_itm_grp_nm4_NX(info);
		else if (nx == Cnd_chd_itm_grp_cd5) doCnd_chd_itm_grp_cd5_NX(info);
		else if (nx == Cnd_chd_itm_grp_nm5) doCnd_chd_itm_grp_nm5_NX(info);
		else if (nx == Cnd_chd_itm_grp_cd6) doCnd_chd_itm_grp_cd6_NX(info);
		else if (nx == Cnd_chd_itm_grp_nm6) doCnd_chd_itm_grp_nm6_NX(info);
		else if (nx == Cnd_chd_itm_grp_cd7) doCnd_chd_itm_grp_cd7_NX(info);
		else if (nx == Cnd_chd_itm_grp_nm7) doCnd_chd_itm_grp_nm7_NX(info);
		else if (nx == Cnd_chd_itm_grp_cd8) doCnd_chd_itm_grp_cd8_NX(info);
		else if (nx == Cnd_chd_itm_grp_nm8) doCnd_chd_itm_grp_nm8_NX(info);
		else if (nx == Cnd_chd_itm_grp_cd9) doCnd_chd_itm_grp_cd9_NX(info);
		else if (nx == Cnd_chd_itm_grp_nm9) doCnd_chd_itm_grp_nm9_NX(info);
		else if (nx == Cnd_chd_itm_grp_cd10) doCnd_chd_itm_grp_cd10_NX(info);
		else if (nx == Cnd_chd_itm_grp_nm10) doCnd_chd_itm_grp_nm10_NX(info);
		else if (nx == Cnd_bom_chng_typ) doCnd_bom_chng_typ_NX(info);
		else if (nx == Cnd_bom_chng_typ_nm) doCnd_bom_chng_typ_nm_NX(info);
		else if (nx == Cnd_chng_st_dt) doCnd_chng_st_dt_NX(info);
		else if (nx == Cnd_chng_end_dt) doCnd_chng_end_dt_NX(info);
		else if (nx == Cnd_chng_wg_cd) doCnd_chng_wg_cd_NX(info);
		else if (nx == Cnd_chng_wg_nm) doCnd_chng_wg_nm_NX(info);
		else if (nx == Cnd_old_alt_itm_ratio) doCnd_old_alt_itm_ratio_NX(info);
		else if (nx == Cnd_old_alt_alloc_prio) doCnd_old_alt_alloc_prio_NX(info);
		else if (nx == Cnd_old_stk_mng_typ) doCnd_old_stk_mng_typ_NX(info);
		else if (nx == Cnd_old_stk_mng_typ_nm) doCnd_old_stk_mng_typ_nm_NX(info);
		else if (nx == Cnd_old_asset_mng_typ) doCnd_old_asset_mng_typ_NX(info);
		else if (nx == Cnd_old_asset_mng_typ_nm) doCnd_old_asset_mng_typ_nm_NX(info);
		else if (nx == Cnd_old_alt_grp_cd) doCnd_old_alt_grp_cd_NX(info);
		else if (nx == Cnd_old_alt_grp_nm) doCnd_old_alt_grp_nm_NX(info);
		else if (nx == Cnd_old_alt_itm_typ) doCnd_old_alt_itm_typ_NX(info);
		else if (nx == Cnd_old_alt_itm_typ_nm) doCnd_old_alt_itm_typ_nm_NX(info);
		else if (nx == Cnd_new_alt_itm_ratio) doCnd_new_alt_itm_ratio_NX(info);
		else if (nx == Cnd_new_alt_alloc_prio) doCnd_new_alt_alloc_prio_NX(info);
		else if (nx == Cnd_new_stk_mng_typ) doCnd_new_stk_mng_typ_NX(info);
		else if (nx == Cnd_new_stk_mng_typ_nm) doCnd_new_stk_mng_typ_nm_NX(info);
		else if (nx == Cnd_new_asset_mng_typ) doCnd_new_asset_mng_typ_NX(info);
		else if (nx == Cnd_new_asset_mng_typ_nm) doCnd_new_asset_mng_typ_nm_NX(info);
		else if (nx == Cnd_new_alt_grp_cd) doCnd_new_alt_grp_cd_NX(info);
		else if (nx == Cnd_new_alt_grp_nm) doCnd_new_alt_grp_nm_NX(info);
		else if (nx == Cnd_new_alt_itm_typ) doCnd_new_alt_itm_typ_NX(info);
		else if (nx == Cnd_new_alt_itm_typ_nm) doCnd_new_alt_itm_typ_nm_NX(info);
		else if (nx == BulkSet_st_dt) doBulkSet_st_dt_NX(info);
		else if (nx == BulkSet_end_dt) doBulkSet_end_dt_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_wg_nm) doDtl_wg_nm_NX(info);
		else if (nx == columnDtl_par_itm_typ) doDtl_par_itm_typ_NX(info);
		else if (nx == columnDtl_par_itm_typ_nm) doDtl_par_itm_typ_nm_NX(info);
		else if (nx == columnDtl_par_itm_typ_d_cd) doDtl_par_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_par_itm_typ_d_nm) doDtl_par_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_par_sno1_mng_typ) doDtl_par_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_par_sno2_mng_typ) doDtl_par_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_par_sno3_mng_typ) doDtl_par_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_par_sno4_mng_typ) doDtl_par_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_par_def_bom_ptn) doDtl_par_def_bom_ptn_NX(info);
		else if (nx == columnDtl_bom_ptn) doDtl_bom_ptn_NX(info);
		else if (nx == columnDtl_oper_cd) doDtl_oper_cd_NX(info);
		else if (nx == columnDtl_oper_nm) doDtl_oper_nm_NX(info);
		else if (nx == columnDtl_oper_seq) doDtl_oper_seq_NX(info);
		else if (nx == columnDtl_disp_seq) doDtl_disp_seq_NX(info);
		else if (nx == columnDtl_chd_itm_typ) doDtl_chd_itm_typ_NX(info);
		else if (nx == columnDtl_chd_itm_typ_nm) doDtl_chd_itm_typ_nm_NX(info);
		else if (nx == columnDtl_chd_itm_typ_d_cd) doDtl_chd_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_chd_itm_typ_d_nm) doDtl_chd_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_chd_stk_mng_typ) doDtl_chd_stk_mng_typ_NX(info);
		else if (nx == columnDtl_chd_asset_mng_typ) doDtl_chd_asset_mng_typ_NX(info);
		else if (nx == columnDtl_par_dec_place) doDtl_par_dec_place_NX(info);
		else if (nx == columnDtl_chd_dec_place) doDtl_chd_dec_place_NX(info);
		else if (nx == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NX(info);
		else if (nx == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NX(info);
		else if (nx == columnDtl_chd_sno1_mng_typ) doDtl_chd_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_chd_sno2_mng_typ) doDtl_chd_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_chd_sno3_mng_typ) doDtl_chd_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_chd_sno4_mng_typ) doDtl_chd_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_chd_def_bom_ptn) doDtl_chd_def_bom_ptn_NX(info);
		else if (nx == columnDtl_ver_flg) doDtl_ver_flg_NX(info);
		else if (nx == columnDtl_byprod_flg) doDtl_byprod_flg_NX(info);
		else if (nx == columnDtl_ph_flg) doDtl_ph_flg_NX(info);
		else if (nx == columnDtl_ph_bom_ptn) doDtl_ph_bom_ptn_NX(info);
		else if (nx == columnDtl_alt_itm_flg) doDtl_alt_itm_flg_NX(info);
		else if (nx == columnDtl_alt_grp_cd) doDtl_alt_grp_cd_NX(info);
		else if (nx == columnDtl_alt_grp_nm) doDtl_alt_grp_nm_NX(info);
		else if (nx == columnDtl_alt_itm_typ) doDtl_alt_itm_typ_NX(info);
		else if (nx == columnDtl_alt_itm_typ_nm) doDtl_alt_itm_typ_nm_NX(info);
		else if (nx == columnDtl_alt_itm_ratio) doDtl_alt_itm_ratio_NX(info);
		else if (nx == columnDtl_alt_alloc_prio) doDtl_alt_alloc_prio_NX(info);
		else if (nx == columnDtl_sno_typ1) doDtl_sno_typ1_NX(info);
		else if (nx == columnDtl_sno_typ_nm1) doDtl_sno_typ_nm1_NX(info);
		else if (nx == columnDtl_sno_typ2) doDtl_sno_typ2_NX(info);
		else if (nx == columnDtl_sno_typ_nm2) doDtl_sno_typ_nm2_NX(info);
		else if (nx == columnDtl_sno_typ3) doDtl_sno_typ3_NX(info);
		else if (nx == columnDtl_sno_typ_nm3) doDtl_sno_typ_nm3_NX(info);
		else if (nx == columnDtl_sno_typ4) doDtl_sno_typ4_NX(info);
		else if (nx == columnDtl_sno_typ_nm4) doDtl_sno_typ_nm4_NX(info);
		else if (nx == columnDtl_par_base_unit_cd) doDtl_par_base_unit_cd_NX(info);
		else if (nx == columnDtl_par_base_unit_nm) doDtl_par_base_unit_nm_NX(info);
		else if (nx == columnDtl_chd_base_unit_cd) doDtl_chd_base_unit_cd_NX(info);
		else if (nx == columnDtl_chd_base_unit_nm) doDtl_chd_base_unit_nm_NX(info);
		else if (nx == columnDtl_in_offst_typ) doDtl_in_offst_typ_NX(info);
		else if (nx == columnDtl_in_offst_typ_nm) doDtl_in_offst_typ_nm_NX(info);
		else if (nx == columnDtl_in_offst) doDtl_in_offst_NX(info);
		else if (nx == columnDtl_bkf_typ) doDtl_bkf_typ_NX(info);
		else if (nx == columnDtl_bkf_typ_nm) doDtl_bkf_typ_nm_NX(info);
		else if (nx == columnDtl_inst_lot_fix_flg) doDtl_inst_lot_fix_flg_NX(info);
		else if (nx == columnDtl_lot_mix_flg) doDtl_lot_mix_flg_NX(info);
		else if (nx == columnDtl_sublot_mix_flg) doDtl_sublot_mix_flg_NX(info);
		else if (nx == columnDtl_alloc_ctl_typ) doDtl_alloc_ctl_typ_NX(info);
		else if (nx == columnDtl_alloc_ctl_typ_nm) doDtl_alloc_ctl_typ_nm_NX(info);
		else if (nx == columnDtl_main_itm_flg) doDtl_main_itm_flg_NX(info);
		else if (nx == columnDtl_yield_calc_flg) doDtl_yield_calc_flg_NX(info);
		else if (nx == columnDtl_inpt_ctl_typ) doDtl_inpt_ctl_typ_NX(info);
		else if (nx == columnDtl_inpt_ctl_typ_nm) doDtl_inpt_ctl_typ_nm_NX(info);
		else if (nx == columnDtl_chng_no) doDtl_chng_no_NX(info);
		else if (nx == columnDtl_ext_sys_no_bom) doDtl_ext_sys_no_bom_NX(info);
		else if (nx == columnDtl_not_cost_flg) doDtl_not_cost_flg_NX(info);
		else if (nx == columnDtl_memo1) doDtl_memo1_NX(info);
		else if (nx == columnDtl_memo2) doDtl_memo2_NX(info);
		else if (nx == columnDtl_memo3) doDtl_memo3_NX(info);
		else if (nx == columnDtl_bom_key) doDtl_bom_key_NX(info);
		else if (nx == columnDtl_ins_usr_id) doDtl_ins_usr_id_NX(info);
		else if (nx == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NX(info);
		else if (nx == columnDtl_ins_ts) doDtl_ins_ts_NX(info);
		else if (nx == columnDtl_ins_func_id) doDtl_ins_func_id_NX(info);
		else if (nx == columnDtl_ins_func_nm) doDtl_ins_func_nm_NX(info);
		else if (nx == columnDtl_upd_cntr) doDtl_upd_cntr_NX(info);
		else if (nx == columnDtl_upd_usr_id) doDtl_upd_usr_id_NX(info);
		else if (nx == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NX(info);
		else if (nx == columnDtl_upd_ts) doDtl_upd_ts_NX(info);
		else if (nx == columnDtl_upd_func_id) doDtl_upd_func_id_NX(info);
		else if (nx == columnDtl_upd_func_nm) doDtl_upd_func_nm_NX(info);
		else if (nx == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NX(info);
		else if (nx == columnDtl_del_usr_id) doDtl_del_usr_id_NX(info);
		else if (nx == columnDtl_del_usr_nm) doDtl_del_usr_nm_NX(info);
		else if (nx == columnDtl_del_ts) doDtl_del_ts_NX(info);
	}

	/**
	 * [CndTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCndTab_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[chng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_no_bom]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_no_bom_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[par_itm_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_chng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_chng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_chng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_chng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chng_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chng_end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chng_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chng_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_itm_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_itm_ratio_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_alloc_prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_alloc_prio_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_stk_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_stk_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_asset_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_asset_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_itm_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_itm_ratio_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_alloc_prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_alloc_prio_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_stk_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_stk_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_asset_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_asset_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_end_dt_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_def_bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_def_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_def_bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_def_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[byprod_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_byprod_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ph_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ph_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ph_bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ph_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_ratio_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_alloc_prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_alloc_prio_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bkf_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bkf_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bkf_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bkf_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_lot_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_lot_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[main_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_main_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[yield_calc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_yield_calc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_ctl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_ctl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_ctl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_ctl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chng_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chng_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_bom]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_no_bom_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_cost_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_cost_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_key]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_key_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_chng_no) doCnd_chng_no_LC(info);
		else if (lc == Cnd_ext_sys_no_bom) doCnd_ext_sys_no_bom_LC(info);
		else if (lc == Cnd_alt_grp_cd) doCnd_alt_grp_cd_LC(info);
		else if (lc == Cnd_oper_cd) doCnd_oper_cd_LC(info);
		else if (lc == Cnd_oper_nm) doCnd_oper_nm_LC(info);
		else if (lc == Cnd_bom_ptn) doCnd_bom_ptn_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == Cnd_par_itm_grp_cd1) doCnd_par_itm_grp_cd1_LC(info);
		else if (lc == Cnd_par_itm_grp_nm1) doCnd_par_itm_grp_nm1_LC(info);
		else if (lc == Cnd_par_itm_grp_cd2) doCnd_par_itm_grp_cd2_LC(info);
		else if (lc == Cnd_par_itm_grp_nm2) doCnd_par_itm_grp_nm2_LC(info);
		else if (lc == Cnd_par_itm_grp_cd3) doCnd_par_itm_grp_cd3_LC(info);
		else if (lc == Cnd_par_itm_grp_nm3) doCnd_par_itm_grp_nm3_LC(info);
		else if (lc == Cnd_par_itm_grp_cd4) doCnd_par_itm_grp_cd4_LC(info);
		else if (lc == Cnd_par_itm_grp_nm4) doCnd_par_itm_grp_nm4_LC(info);
		else if (lc == Cnd_par_itm_grp_cd5) doCnd_par_itm_grp_cd5_LC(info);
		else if (lc == Cnd_par_itm_grp_nm5) doCnd_par_itm_grp_nm5_LC(info);
		else if (lc == Cnd_par_itm_grp_cd6) doCnd_par_itm_grp_cd6_LC(info);
		else if (lc == Cnd_par_itm_grp_nm6) doCnd_par_itm_grp_nm6_LC(info);
		else if (lc == Cnd_par_itm_grp_cd7) doCnd_par_itm_grp_cd7_LC(info);
		else if (lc == Cnd_par_itm_grp_nm7) doCnd_par_itm_grp_nm7_LC(info);
		else if (lc == Cnd_par_itm_grp_cd8) doCnd_par_itm_grp_cd8_LC(info);
		else if (lc == Cnd_par_itm_grp_nm8) doCnd_par_itm_grp_nm8_LC(info);
		else if (lc == Cnd_par_itm_grp_cd9) doCnd_par_itm_grp_cd9_LC(info);
		else if (lc == Cnd_par_itm_grp_nm9) doCnd_par_itm_grp_nm9_LC(info);
		else if (lc == Cnd_par_itm_grp_cd10) doCnd_par_itm_grp_cd10_LC(info);
		else if (lc == Cnd_par_itm_grp_nm10) doCnd_par_itm_grp_nm10_LC(info);
		else if (lc == Cnd_chd_itm_grp_cd1) doCnd_chd_itm_grp_cd1_LC(info);
		else if (lc == Cnd_chd_itm_grp_nm1) doCnd_chd_itm_grp_nm1_LC(info);
		else if (lc == Cnd_chd_itm_grp_cd2) doCnd_chd_itm_grp_cd2_LC(info);
		else if (lc == Cnd_chd_itm_grp_nm2) doCnd_chd_itm_grp_nm2_LC(info);
		else if (lc == Cnd_chd_itm_grp_cd3) doCnd_chd_itm_grp_cd3_LC(info);
		else if (lc == Cnd_chd_itm_grp_nm3) doCnd_chd_itm_grp_nm3_LC(info);
		else if (lc == Cnd_chd_itm_grp_cd4) doCnd_chd_itm_grp_cd4_LC(info);
		else if (lc == Cnd_chd_itm_grp_nm4) doCnd_chd_itm_grp_nm4_LC(info);
		else if (lc == Cnd_chd_itm_grp_cd5) doCnd_chd_itm_grp_cd5_LC(info);
		else if (lc == Cnd_chd_itm_grp_nm5) doCnd_chd_itm_grp_nm5_LC(info);
		else if (lc == Cnd_chd_itm_grp_cd6) doCnd_chd_itm_grp_cd6_LC(info);
		else if (lc == Cnd_chd_itm_grp_nm6) doCnd_chd_itm_grp_nm6_LC(info);
		else if (lc == Cnd_chd_itm_grp_cd7) doCnd_chd_itm_grp_cd7_LC(info);
		else if (lc == Cnd_chd_itm_grp_nm7) doCnd_chd_itm_grp_nm7_LC(info);
		else if (lc == Cnd_chd_itm_grp_cd8) doCnd_chd_itm_grp_cd8_LC(info);
		else if (lc == Cnd_chd_itm_grp_nm8) doCnd_chd_itm_grp_nm8_LC(info);
		else if (lc == Cnd_chd_itm_grp_cd9) doCnd_chd_itm_grp_cd9_LC(info);
		else if (lc == Cnd_chd_itm_grp_nm9) doCnd_chd_itm_grp_nm9_LC(info);
		else if (lc == Cnd_chd_itm_grp_cd10) doCnd_chd_itm_grp_cd10_LC(info);
		else if (lc == Cnd_chd_itm_grp_nm10) doCnd_chd_itm_grp_nm10_LC(info);
		else if (lc == Cnd_bom_chng_typ) doCnd_bom_chng_typ_LC(info);
		else if (lc == Cnd_bom_chng_typ_nm) doCnd_bom_chng_typ_nm_LC(info);
		else if (lc == Cnd_chng_st_dt) doCnd_chng_st_dt_LC(info);
		else if (lc == Cnd_chng_end_dt) doCnd_chng_end_dt_LC(info);
		else if (lc == Cnd_chng_wg_cd) doCnd_chng_wg_cd_LC(info);
		else if (lc == Cnd_chng_wg_nm) doCnd_chng_wg_nm_LC(info);
		else if (lc == Cnd_old_alt_itm_ratio) doCnd_old_alt_itm_ratio_LC(info);
		else if (lc == Cnd_old_alt_alloc_prio) doCnd_old_alt_alloc_prio_LC(info);
		else if (lc == Cnd_old_stk_mng_typ) doCnd_old_stk_mng_typ_LC(info);
		else if (lc == Cnd_old_stk_mng_typ_nm) doCnd_old_stk_mng_typ_nm_LC(info);
		else if (lc == Cnd_old_asset_mng_typ) doCnd_old_asset_mng_typ_LC(info);
		else if (lc == Cnd_old_asset_mng_typ_nm) doCnd_old_asset_mng_typ_nm_LC(info);
		else if (lc == Cnd_old_alt_grp_cd) doCnd_old_alt_grp_cd_LC(info);
		else if (lc == Cnd_old_alt_grp_nm) doCnd_old_alt_grp_nm_LC(info);
		else if (lc == Cnd_old_alt_itm_typ) doCnd_old_alt_itm_typ_LC(info);
		else if (lc == Cnd_old_alt_itm_typ_nm) doCnd_old_alt_itm_typ_nm_LC(info);
		else if (lc == Cnd_new_alt_itm_ratio) doCnd_new_alt_itm_ratio_LC(info);
		else if (lc == Cnd_new_alt_alloc_prio) doCnd_new_alt_alloc_prio_LC(info);
		else if (lc == Cnd_new_stk_mng_typ) doCnd_new_stk_mng_typ_LC(info);
		else if (lc == Cnd_new_stk_mng_typ_nm) doCnd_new_stk_mng_typ_nm_LC(info);
		else if (lc == Cnd_new_asset_mng_typ) doCnd_new_asset_mng_typ_LC(info);
		else if (lc == Cnd_new_asset_mng_typ_nm) doCnd_new_asset_mng_typ_nm_LC(info);
		else if (lc == Cnd_new_alt_grp_cd) doCnd_new_alt_grp_cd_LC(info);
		else if (lc == Cnd_new_alt_grp_nm) doCnd_new_alt_grp_nm_LC(info);
		else if (lc == Cnd_new_alt_itm_typ) doCnd_new_alt_itm_typ_LC(info);
		else if (lc == Cnd_new_alt_itm_typ_nm) doCnd_new_alt_itm_typ_nm_LC(info);
		else if (lc == BulkSet_st_dt) doBulkSet_st_dt_LC(info);
		else if (lc == BulkSet_end_dt) doBulkSet_end_dt_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_wg_nm) doDtl_wg_nm_LC(info);
		else if (lc == columnDtl_par_itm_typ) doDtl_par_itm_typ_LC(info);
		else if (lc == columnDtl_par_itm_typ_nm) doDtl_par_itm_typ_nm_LC(info);
		else if (lc == columnDtl_par_itm_typ_d_cd) doDtl_par_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_par_itm_typ_d_nm) doDtl_par_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_par_sno1_mng_typ) doDtl_par_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_par_sno2_mng_typ) doDtl_par_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_par_sno3_mng_typ) doDtl_par_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_par_sno4_mng_typ) doDtl_par_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_par_def_bom_ptn) doDtl_par_def_bom_ptn_LC(info);
		else if (lc == columnDtl_bom_ptn) doDtl_bom_ptn_LC(info);
		else if (lc == columnDtl_oper_cd) doDtl_oper_cd_LC(info);
		else if (lc == columnDtl_oper_nm) doDtl_oper_nm_LC(info);
		else if (lc == columnDtl_oper_seq) doDtl_oper_seq_LC(info);
		else if (lc == columnDtl_disp_seq) doDtl_disp_seq_LC(info);
		else if (lc == columnDtl_chd_itm_typ) doDtl_chd_itm_typ_LC(info);
		else if (lc == columnDtl_chd_itm_typ_nm) doDtl_chd_itm_typ_nm_LC(info);
		else if (lc == columnDtl_chd_itm_typ_d_cd) doDtl_chd_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_chd_itm_typ_d_nm) doDtl_chd_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_chd_stk_mng_typ) doDtl_chd_stk_mng_typ_LC(info);
		else if (lc == columnDtl_chd_asset_mng_typ) doDtl_chd_asset_mng_typ_LC(info);
		else if (lc == columnDtl_par_dec_place) doDtl_par_dec_place_LC(info);
		else if (lc == columnDtl_chd_dec_place) doDtl_chd_dec_place_LC(info);
		else if (lc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_LC(info);
		else if (lc == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_LC(info);
		else if (lc == columnDtl_chd_sno1_mng_typ) doDtl_chd_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_chd_sno2_mng_typ) doDtl_chd_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_chd_sno3_mng_typ) doDtl_chd_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_chd_sno4_mng_typ) doDtl_chd_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_chd_def_bom_ptn) doDtl_chd_def_bom_ptn_LC(info);
		else if (lc == columnDtl_ph_bom_ptn) doDtl_ph_bom_ptn_LC(info);
		else if (lc == columnDtl_alt_grp_cd) doDtl_alt_grp_cd_LC(info);
		else if (lc == columnDtl_alt_grp_nm) doDtl_alt_grp_nm_LC(info);
		else if (lc == columnDtl_alt_itm_typ) doDtl_alt_itm_typ_LC(info);
		else if (lc == columnDtl_alt_itm_typ_nm) doDtl_alt_itm_typ_nm_LC(info);
		else if (lc == columnDtl_alt_itm_ratio) doDtl_alt_itm_ratio_LC(info);
		else if (lc == columnDtl_alt_alloc_prio) doDtl_alt_alloc_prio_LC(info);
		else if (lc == columnDtl_sno_typ1) doDtl_sno_typ1_LC(info);
		else if (lc == columnDtl_sno_typ_nm1) doDtl_sno_typ_nm1_LC(info);
		else if (lc == columnDtl_sno_typ2) doDtl_sno_typ2_LC(info);
		else if (lc == columnDtl_sno_typ_nm2) doDtl_sno_typ_nm2_LC(info);
		else if (lc == columnDtl_sno_typ3) doDtl_sno_typ3_LC(info);
		else if (lc == columnDtl_sno_typ_nm3) doDtl_sno_typ_nm3_LC(info);
		else if (lc == columnDtl_sno_typ4) doDtl_sno_typ4_LC(info);
		else if (lc == columnDtl_sno_typ_nm4) doDtl_sno_typ_nm4_LC(info);
		else if (lc == columnDtl_par_base_unit_cd) doDtl_par_base_unit_cd_LC(info);
		else if (lc == columnDtl_par_base_unit_nm) doDtl_par_base_unit_nm_LC(info);
		else if (lc == columnDtl_chd_base_unit_cd) doDtl_chd_base_unit_cd_LC(info);
		else if (lc == columnDtl_chd_base_unit_nm) doDtl_chd_base_unit_nm_LC(info);
		else if (lc == columnDtl_in_offst_typ) doDtl_in_offst_typ_LC(info);
		else if (lc == columnDtl_in_offst_typ_nm) doDtl_in_offst_typ_nm_LC(info);
		else if (lc == columnDtl_in_offst) doDtl_in_offst_LC(info);
		else if (lc == columnDtl_bkf_typ) doDtl_bkf_typ_LC(info);
		else if (lc == columnDtl_bkf_typ_nm) doDtl_bkf_typ_nm_LC(info);
		else if (lc == columnDtl_alloc_ctl_typ) doDtl_alloc_ctl_typ_LC(info);
		else if (lc == columnDtl_alloc_ctl_typ_nm) doDtl_alloc_ctl_typ_nm_LC(info);
		else if (lc == columnDtl_inpt_ctl_typ) doDtl_inpt_ctl_typ_LC(info);
		else if (lc == columnDtl_inpt_ctl_typ_nm) doDtl_inpt_ctl_typ_nm_LC(info);
		else if (lc == columnDtl_chng_no) doDtl_chng_no_LC(info);
		else if (lc == columnDtl_ext_sys_no_bom) doDtl_ext_sys_no_bom_LC(info);
		else if (lc == columnDtl_memo1) doDtl_memo1_LC(info);
		else if (lc == columnDtl_memo2) doDtl_memo2_LC(info);
		else if (lc == columnDtl_memo3) doDtl_memo3_LC(info);
		else if (lc == columnDtl_bom_key) doDtl_bom_key_LC(info);
		else if (lc == columnDtl_ins_usr_id) doDtl_ins_usr_id_LC(info);
		else if (lc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_LC(info);
		else if (lc == columnDtl_ins_ts) doDtl_ins_ts_LC(info);
		else if (lc == columnDtl_ins_func_id) doDtl_ins_func_id_LC(info);
		else if (lc == columnDtl_ins_func_nm) doDtl_ins_func_nm_LC(info);
		else if (lc == columnDtl_upd_cntr) doDtl_upd_cntr_LC(info);
		else if (lc == columnDtl_upd_usr_id) doDtl_upd_usr_id_LC(info);
		else if (lc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_LC(info);
		else if (lc == columnDtl_upd_ts) doDtl_upd_ts_LC(info);
		else if (lc == columnDtl_upd_func_id) doDtl_upd_func_id_LC(info);
		else if (lc == columnDtl_upd_func_nm) doDtl_upd_func_nm_LC(info);
		else if (lc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_LC(info);
		else if (lc == columnDtl_del_usr_id) doDtl_del_usr_id_LC(info);
		else if (lc == columnDtl_del_usr_nm) doDtl_del_usr_nm_LC(info);
		else if (lc == columnDtl_del_ts) doDtl_del_ts_LC(info);
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
	 * [Cnd]パネルの[chng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_no_bom]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_no_bom_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[alt_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_alt_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[par_itm_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[par_itm_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_par_itm_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chd_itm_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chd_itm_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_chng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_chng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_chng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_chng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chng_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chng_end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chng_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[chng_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_chng_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_itm_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_itm_ratio_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_alloc_prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_alloc_prio_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_stk_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_stk_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_asset_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_asset_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[old_alt_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_old_alt_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_itm_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_itm_ratio_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_alloc_prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_alloc_prio_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_stk_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_stk_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_asset_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_asset_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_alt_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_alt_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_def_bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_def_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_def_bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_def_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ph_bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ph_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_itm_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_itm_ratio_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alt_alloc_prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alt_alloc_prio_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno_typ_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno_typ_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[par_base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_par_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[in_offst]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_in_offst_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bkf_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bkf_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bkf_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bkf_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alloc_ctl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alloc_ctl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_ctl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_ctl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_ctl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_ctl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chng_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chng_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_no_bom]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_no_bom_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_key]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_key_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_oper_cd]の作成メソッド
	 */
	public MCList getCnd_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_par_itm_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_chd_itm_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_chd_itm_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_chd_itm_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_chd_itm_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_chd_itm_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_chd_itm_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_chd_itm_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_chd_itm_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_chd_itm_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_chd_itm_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bom_chng_typ]の作成メソッド
	 */
	public MCList getCnd_bom_chng_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBomChngTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chng_wg_cd]の作成メソッド
	 */
	public MCList getCnd_chng_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_old_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_old_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_old_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_old_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_old_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_old_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_old_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_old_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_old_ver_no_p_PPanel_VerNo_ver_no]の作成メソッド
	 */
	public MCList getCnd_old_ver_no_p_PPanel_VerNo_ver_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmVer(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_old_alt_grp_cd]の作成メソッド
	 */
	public MCList getCnd_old_alt_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAltGrpBom(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_old_alt_itm_typ]の作成メソッド
	 */
	public MCList getCnd_old_alt_itm_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAltItmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_new_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_new_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_new_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_new_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_new_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_new_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_new_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_new_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_new_ver_no_p_PPanel_VerNo_ver_no]の作成メソッド
	 */
	public MCList getCnd_new_ver_no_p_PPanel_VerNo_ver_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmVer(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_new_alt_grp_cd]の作成メソッド
	 */
	public MCList getCnd_new_alt_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAltGrpBom(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_new_alt_itm_typ]の作成メソッド
	 */
	public MCList getCnd_new_alt_itm_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAltItmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_wg_cd]の作成メソッド
	 */
	public MCList getDtl_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_par_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtl_par_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_par_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtl_par_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_par_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtl_par_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_par_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtl_par_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_oper_cd]の作成メソッド
	 */
	public MCList getDtl_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_chd_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtl_chd_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_chd_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtl_chd_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_chd_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtl_chd_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_chd_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtl_chd_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_chd_itm_typ_d_cd]の作成メソッド
	 */
	public MCList getDtl_chd_itm_typ_d_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmTypD(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_ver_no_p_PPanel_columnVerNo_ver_no]の作成メソッド
	 */
	public MCList getDtl_ver_no_p_PPanel_columnVerNo_ver_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmVer(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_alt_grp_cd]の作成メソッド
	 */
	public MCList getDtl_alt_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAltGrpBom(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_alt_itm_typ]の作成メソッド
	 */
	public MCList getDtl_alt_itm_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAltItmTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno_typ1]の作成メソッド
	 */
	public MCList getDtl_sno_typ1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno_typ2]の作成メソッド
	 */
	public MCList getDtl_sno_typ2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno_typ3]の作成メソッド
	 */
	public MCList getDtl_sno_typ3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sno_typ4]の作成メソッド
	 */
	public MCList getDtl_sno_typ4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSnoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_in_offst_typ]の作成メソッド
	 */
	public MCList getDtl_in_offst_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOffstTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bkf_typ]の作成メソッド
	 */
	public MCList getDtl_bkf_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBkfTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_alloc_ctl_typ]の作成メソッド
	 */
	public MCList getDtl_alloc_ctl_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAllocCtlTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_inpt_ctl_typ]の作成メソッド
	 */
	public MCList getDtl_inpt_ctl_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInptCtlTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABSL0030.Srch01")) {
			return new MA_MABSL0030_Srch01Bridge();
		}
		if (id.equals("MA.MABSL0030.Upd01")) {
			return new MA_MABSL0030_Upd01Bridge();
		}
		if (id.equals("MA.MABSL0030.Del01")) {
			return new MA_MABSL0030_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABSL0030_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0030_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0030_Srch01;

		/** コンストラクタ */
		protected MA_MABSL0030_Srch01Bridge() {
			p_MA_MABSL0030_Srch01 = new MCParam(PDef.MA_MABSL0030_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0030_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABS.MABSP0030.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0030.DtlR.class));

			p_MA_MABSL0030_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0030_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0030_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0030_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0030_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABS.MABSP0030.CndR up0() {
			return (mcframe.clientMABS.MABSP0030.CndR)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP0030.DtlR> down0() {
			return (MCList<mcframe.clientMABS.MABSP0030.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABSL0030_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0030.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL0030_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABS.MABSP0030.DtlR>)p_MA_MABSL0030_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABSL0030_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0030_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0030_Upd01;

		/** コンストラクタ */
		protected MA_MABSL0030_Upd01Bridge() {
			p_MA_MABSL0030_Upd01 = new MCParam(PDef.MA_MABSL0030_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0030_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0030.DtlR.class));
			// Down

			p_MA_MABSL0030_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0030_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0030_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0030_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0030_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0030.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0030.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL0030_Upd01;
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
	 * [MA_MABSL0030_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0030_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0030_Del01;

		/** コンストラクタ */
		protected MA_MABSL0030_Del01Bridge() {
			p_MA_MABSL0030_Del01 = new MCParam(PDef.MA_MABSL0030_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0030_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0030.DtlR.class));
			// Down

			p_MA_MABSL0030_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0030_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0030_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0030_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0030_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0030.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0030.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL0030_Del01;
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