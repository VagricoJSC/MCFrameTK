package mcframe.clientMABS.MABSP0140;

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
import mcframe.clientMABS.MABSP0140.MABSP_ProcUpriReg_MC.MA_MABSL0140_Srch01Caller;
import mcframe.clientMABS.MABSP0140.MABSP_ProcUpriReg_MC.MA_MABSL0140_Sprt01Caller;
import mcframe.clientMABS.MABSP0140.MABSP_ProcUpriReg_MC.MA_MABSL0140_Upd01Caller;
import mcframe.clientMABS.MABSP0140.MABSP_ProcUpriReg_MC.MA_MABSL0140_Del01Caller;
import mcframe.clientMABS.MABSP0140.MABSP_ProcUpriReg_MC.MA_MABSL0140_Aprv_Srch01Caller;
import mcframe.clientMABS.MABSP0140.MABSP_ProcUpriReg_MC.MA_MABSL0140_Aprv_Upd01Caller;
import mcframe.clientMABS.MABSP0140.MABSP_ProcUpriReg_MC.MA_MABSL0140_Aprv_Del01Caller;

/**
 * 画面"MABSP_ProcUpriReg"パネルクラスです。<p>
 *
 * 加工単価マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSP_ProcUpriReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABSP0140";

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
	// [Tab5]ブロック関連のField定義
	public MCPanel Tab5Panel = null;
	// [Tab5]ブロックの項目のField定義
	// [Tab6]ブロック関連のField定義
	public MCPanel Tab6Panel = null;
	// [Tab6]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3;APL,Apply,5;MOD_APL,Modify (Apply),6;DEL_APL,Delete (Apply),7;REF_APL,View (Apply),8 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3;APL,申請する,5;MOD_APL,訂正する（申請）,6;DEL_APL,削除する（申請）,7;REF_APL,参照する（申請）,8.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_APL = null;
	public MCRadioButton Cnd_ope_MOD_APL = null;
	public MCRadioButton Cnd_ope_DEL_APL = null;
	public MCRadioButton Cnd_ope_REF_APL = null;
	/**
	 * Common 共通.<p>
	 *
	 */
	public MCCheckBox Cnd_cmn_flg = null;
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public MCCheckBox Cnd_wg_flg = null;
	public mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H Cnd_dt_PPanel;
	public MCDateField Cnd_base_dt;	// [Cnd]の[dt.dt]を[Cnd_base_dt]としてエイリアス定義。
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
	public MCLabel Cnd_unit_cd_Label = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCTextField Cnd_unit_nm = null;
	public MCLabel Cnd_cur_cd_Label = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCTextField Cnd_cur_nm = null;
	public MCLabel Cnd_proc_upri_typ_Label = null;
	/**
	 * Subcontracting unit price type 加工単価区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_proc_upri_typ = null;
	/**
	 * Subcontracting unit price type name 加工単価区分名.<p>
	 *
	 */
	public MCTextField Cnd_proc_upri_typ_nm = null;
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCLabel Cnd_interim_flg_lab = null;
	/**
	 * Temporary unit price. Off 仮単価.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_off_interim_flg = null;
	/**
	 * Temporary unit price: on 仮単価.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_on_interim_flg = null;
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
	public MCLabel Cnd_maker_cd_Label = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCTextField Cnd_maker_nm = null;
	public MCLabel Cnd_sppl_cntry_cd_Label = null;
	/**
	 * Country cd. (Clearing destination) 国ＣＤ（発注先）.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_cntry_cd = null;
	/**
	 * Country name (Supplier) 国名（発注先）.<p>
	 *
	 */
	public MCTextField Cnd_sppl_cntry_nm = null;
	/**
	 * Foreign 国外.<p>
	 *
	 */
	public MCCheckBox Cnd_sppl_foreign_flg = null;
	public MCLabel Cnd_sppl_area_cd_Label = null;
	/**
	 * Region cd. (Supplier) 地域ＣＤ（発注先）.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_area_cd = null;
	/**
	 * Region name (Supplier) 地域名（発注先）.<p>
	 *
	 */
	public MCTextField Cnd_sppl_area_nm = null;
	public MCLabel Cnd_dlv_cd_Label = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCTextField Cnd_dlv_nm = null;
	public MCLabel Cnd_loc_cd_Label = null;
	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_loc_cd = null;
	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public MCTextField Cnd_loc_nm = null;
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
	public MCLabel Cnd_sppl_grp_cd1_Label = null;
	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd1 = null;
	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm1 = null;
	public MCLabel Cnd_sppl_grp_cd2_Label = null;
	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd2 = null;
	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm2 = null;
	public MCLabel Cnd_sppl_grp_cd3_Label = null;
	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd3 = null;
	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm3 = null;
	public MCLabel Cnd_sppl_grp_cd4_Label = null;
	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd4 = null;
	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm4 = null;
	public MCLabel Cnd_sppl_grp_cd5_Label = null;
	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd5 = null;
	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm5 = null;
	public MCLabel Cnd_sppl_grp_cd6_Label = null;
	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd6 = null;
	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm6 = null;
	public MCLabel Cnd_sppl_grp_cd7_Label = null;
	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd7 = null;
	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm7 = null;
	public MCLabel Cnd_sppl_grp_cd8_Label = null;
	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd8 = null;
	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm8 = null;
	public MCLabel Cnd_sppl_grp_cd9_Label = null;
	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd9 = null;
	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm9 = null;
	public MCLabel Cnd_sppl_grp_cd10_Label = null;
	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_sppl_grp_cd10 = null;
	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_sppl_grp_nm10 = null;
	public MCLabel Cnd_maker_grp_cd1_Label = null;
	/**
	 * Maker classification cd. 1 メーカ分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_maker_grp_cd1 = null;
	/**
	 * Maker classification name 1 メーカ分類名１.<p>
	 *
	 */
	public MCTextField Cnd_maker_grp_nm1 = null;
	public MCLabel Cnd_maker_grp_cd2_Label = null;
	/**
	 * Maker classification cd. 2 メーカ分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_maker_grp_cd2 = null;
	/**
	 * Maker classification name 2 メーカ分類名２.<p>
	 *
	 */
	public MCTextField Cnd_maker_grp_nm2 = null;
	public MCLabel Cnd_maker_grp_cd3_Label = null;
	/**
	 * Maker classification cd. 3 メーカ分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_maker_grp_cd3 = null;
	/**
	 * Maker classification name 3 メーカ分類名３.<p>
	 *
	 */
	public MCTextField Cnd_maker_grp_nm3 = null;
	public MCLabel Cnd_maker_grp_cd4_Label = null;
	/**
	 * Maker classification cd. 4 メーカ分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_maker_grp_cd4 = null;
	/**
	 * Maker classification name 4 メーカ分類名４.<p>
	 *
	 */
	public MCTextField Cnd_maker_grp_nm4 = null;
	public MCLabel Cnd_maker_grp_cd5_Label = null;
	/**
	 * Maker classification cd. 5 メーカ分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_maker_grp_cd5 = null;
	/**
	 * Maker classification name 5 メーカ分類名５.<p>
	 *
	 */
	public MCTextField Cnd_maker_grp_nm5 = null;
	public MCLabel Cnd_maker_grp_cd6_Label = null;
	/**
	 * Maker classification cd. 6 メーカ分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_maker_grp_cd6 = null;
	/**
	 * Maker classification name 6 メーカ分類名６.<p>
	 *
	 */
	public MCTextField Cnd_maker_grp_nm6 = null;
	public MCLabel Cnd_maker_grp_cd7_Label = null;
	/**
	 * Maker classification cd. 7 メーカ分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_maker_grp_cd7 = null;
	/**
	 * Maker classification name 7 メーカ分類名７.<p>
	 *
	 */
	public MCTextField Cnd_maker_grp_nm7 = null;
	public MCLabel Cnd_maker_grp_cd8_Label = null;
	/**
	 * Maker classification cd. 8 メーカ分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_maker_grp_cd8 = null;
	/**
	 * Maker classification name 8 メーカ分類名８.<p>
	 *
	 */
	public MCTextField Cnd_maker_grp_nm8 = null;
	public MCLabel Cnd_maker_grp_cd9_Label = null;
	/**
	 * Maker classification cd. 9 メーカ分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_maker_grp_cd9 = null;
	/**
	 * Maker classification name 9 メーカ分類名９.<p>
	 *
	 */
	public MCTextField Cnd_maker_grp_nm9 = null;
	public MCLabel Cnd_maker_grp_cd10_Label = null;
	/**
	 * Maker classification cd. 10 メーカ分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_maker_grp_cd10 = null;
	/**
	 * Maker classification name 10 メーカ分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_maker_grp_nm10 = null;
	public MCLabel Cnd_dlv_grp_cd1_Label = null;
	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd1 = null;
	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm1 = null;
	public MCLabel Cnd_dlv_grp_cd2_Label = null;
	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd2 = null;
	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm2 = null;
	public MCLabel Cnd_dlv_grp_cd3_Label = null;
	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd3 = null;
	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm3 = null;
	public MCLabel Cnd_dlv_grp_cd4_Label = null;
	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd4 = null;
	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm4 = null;
	public MCLabel Cnd_dlv_grp_cd5_Label = null;
	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd5 = null;
	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm5 = null;
	public MCLabel Cnd_dlv_grp_cd6_Label = null;
	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd6 = null;
	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm6 = null;
	public MCLabel Cnd_dlv_grp_cd7_Label = null;
	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd7 = null;
	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm7 = null;
	public MCLabel Cnd_dlv_grp_cd8_Label = null;
	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd8 = null;
	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm8 = null;
	public MCLabel Cnd_dlv_grp_cd9_Label = null;
	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd9 = null;
	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm9 = null;
	public MCLabel Cnd_dlv_grp_cd10_Label = null;
	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd10 = null;
	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm10 = null;
	public MCLabel Cnd_apl_no_Label = null;
	/**
	 * Application No. 申請ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_apl_no = null;
	public MCLabel Cnd_aprv_no_Label = null;
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_aprv_no = null;
	public MCLabel Cnd_apl_dt_fr_Label = null;
	/**
	 * Application date FROM 申請日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_apl_dt_fr = null;
	public MCLabel Cnd_apl_dt_to_Label = null;
	/**
	 * Application date TO 申請日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_apl_dt_to = null;
	public MCLabel Cnd_apl_usr_cd_Label = null;
	/**
	 * Applicant cd. 申請者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_apl_usr_cd = null;
	/**
	 * Applicant name 申請者名.<p>
	 *
	 */
	public MCTextField Cnd_apl_usr_nm = null;
	public MCLabel Cnd_apl_dpt_cd_Label = null;
	/**
	 * Application dept. cd. 申請部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_apl_dpt_cd = null;
	/**
	 * Application dept. name 申請部門名.<p>
	 *
	 */
	public MCTextField Cnd_apl_dpt_nm = null;
	public MCLabel Cnd_aprv_sts_typ_Label = null;
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_aprv_sts_typ = null;
	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public MCTextField Cnd_aprv_sts_typ_nm = null;
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
	// [Bottom]ブロック関連のField定義
	public MCPanel BottomPanel = null;
	// [Bottom]ブロックの項目のField定義
	// [BulkSet]ブロック関連のField定義
	public MCPanel BulkSetPanel = null;
	// [BulkSet]ブロックの項目のField定義
	public MCLabel BulkSet_rev_rate_Label = null;
	/**
	 * Rev. rate (%) 改定率（％）.<p>
	 *
	 */
	public MCNumberField BulkSet_rev_rate = null;
	public MCLabel BulkSet_rnd_typ_Label = null;
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public MCTextComboBox BulkSet_rnd_typ = null;
	/**
	 * Rounding type name 端数処理区分名.<p>
	 *
	 */
	public MCTextField BulkSet_rnd_typ_nm = null;
	public MCLabel BulkSet_rev_date_Label = null;
	/**
	 * Rev. date 改定日.<p>
	 *
	 */
	public MCDateField BulkSet_rev_date = null;
	/**
	 * Unit price rev. 単価改定.<p>
	 *
	 */
	public MCButton BulkSet_rev_upri = null;
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
	public MCButton BulkSet_set_dt = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0140.DtlR> DtlTable = null;
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
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
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
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_maker_nm = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_unit_cd = null;
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_qty_p_PPanel;
	public MCColumnConfig columnDtl_lot_qty;// [Dtl]の[qty_p.qty]を[columnDtl_lot_qty]としてエイリアス定義。
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cur_nm = null;
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upri_dec_place = null;
	/**
	 * Subcontracting unit price type 加工単価区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_proc_upri_typ = null;
	/**
	 * Subcontracting unit price type name 加工単価区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_proc_upri_typ_nm = null;
	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_cd = null;
	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_nm = null;
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
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Dtl_dt_p_PPanel;
	public MCColumnConfig columnDtl_st_dt_key;// [Dtl]の[dt_p.st_dt_key]を[columnDtl_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnDtl_st_dt;// [Dtl]の[dt_p.st_dt]を[columnDtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_end_dt;// [Dtl]の[dt_p.end_dt]を[columnDtl_end_dt]としてエイリアス定義。
	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_outsrc_upri_typ = null;
	/**
	 * Subcontracting unit price type name 外注単価区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_outsrc_upri_typ_nm = null;
	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_tax_cd = null;
	/**
	 * Purchase tax type name 仕入税名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_tax_nm = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_upri1_p_PPanel;
	public MCColumnConfig columnDtl_upri;// [Dtl]の[upri1_p.upri]を[columnDtl_upri]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_upri2_p_PPanel;
	public MCColumnConfig columnDtl_upri_bf;// [Dtl]の[upri2_p.upri]を[columnDtl_upri_bf]としてエイリアス定義。
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_interim_flg = null;
	/**
	 * Standard man-hour 標準工数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_wk_cost = null;
	/**
	 * Standard man-hour unit price 標準工数単価.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_wk_cost_upri = null;
	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_not_cost_flg = null;
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_upri3_p_PPanel;
	public MCColumnConfig columnDtl_sub_upri1;// [Dtl]の[upri3_p.upri]を[columnDtl_sub_upri1]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_upri4_p_PPanel;
	public MCColumnConfig columnDtl_sub_upri2;// [Dtl]の[upri4_p.upri]を[columnDtl_sub_upri2]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D Dtl_upri5_p_PPanel;
	public MCColumnConfig columnDtl_sub_upri3;// [Dtl]の[upri5_p.upri]を[columnDtl_sub_upri3]としてエイリアス定義。
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
	 * Application No. 申請ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_apl_no = null;
	/**
	 * Application start date before update 更新前適用開始日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_st_dt_bf = null;
	/**
	 * Application date 申請日.<p>
	 *
	 */
	public MCColumnConfig columnDtl_apl_dt = null;
	/**
	 * Applicant cd. 申請者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_apl_usr_cd = null;
	/**
	 * Applicant name 申請者名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_apl_usr_nm = null;
	/**
	 * Application dept. cd. 申請部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_apl_dpt_cd = null;
	/**
	 * Application dept. name 申請部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_apl_dpt_nm = null;
	/**
	 * Applied 反映済.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ref_flg = null;
	/**
	 * Application memo 申請メモ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mst_apl_memo = null;
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_no = null;
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_sts_typ = null;
	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_aprv_sts_typ_nm = null;
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
	// [Dtl2]ブロック関連のField定義
	public MCPanel Dtl2Panel = null;
	public MCTitledBorder Dtl2TitledBorder = null;
	// [Dtl2]ブロックの項目のField定義
	public MCLabel Dtl2_apl_dt_Label = null;
	/**
	 * Application date 申請日.<p>
	 *
	 */
	public MCDateField Dtl2_apl_dt = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H Dtl2_usr_dpt_p_PPanel;
	public MCTextField Dtl2_apl_usr_cd;	// [Dtl2]の[usr_dpt_p.usr_cd]を[Dtl2_apl_usr_cd]としてエイリアス定義。
	public MCTextField Dtl2_apl_usr_nm;	// [Dtl2]の[usr_dpt_p.usr_nm]を[Dtl2_apl_usr_nm]としてエイリアス定義。
	public MCTextComboBox Dtl2_apl_dpt_cd;	// [Dtl2]の[usr_dpt_p.dpt_cd]を[Dtl2_apl_dpt_cd]としてエイリアス定義。
	public MCTextField Dtl2_apl_dpt_nm;	// [Dtl2]の[usr_dpt_p.dpt_nm]を[Dtl2_apl_dpt_nm]としてエイリアス定義。
	public MCLabel Dtl2_apl_no_Label = null;
	/**
	 * Application No. 申請ＮＯ.<p>
	 *
	 */
	public MCTextField Dtl2_apl_no = null;
	public MCLabel Dtl2_aprv_no_Label = null;
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public MCTextField Dtl2_aprv_no = null;
	public MCLabel Dtl2_mst_apl_memo_Label = null;
	/**
	 * Application memo 申請メモ.<p>
	 *
	 */
	public MCTextField Dtl2_mst_apl_memo = null;
	// [DtlBtn]ブロック関連のField定義
	public MCPanel DtlBtnPanel = null;
	// [DtlBtn]ブロックの項目のField定義
	/**
	 * Correct overlapping period 重複期間補正.<p>
	 *
	 */
	public MCButton DtlBtn_correct_dup_dt = null;
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
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton DtlBtn_rcopy = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton DtlBtn_upd_cmn = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton DtlBtn_upd_wg = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton DtlBtn_upd_apl_cmn = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton DtlBtn_upd_apl_wg = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton DtlBtn_del_cmn = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton DtlBtn_del_wg = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton DtlBtn_del_apl_cmn = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton DtlBtn_del_apl_wg = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [UPD_APL]モードを表す定数 */
	public static final String UPD_APL = "UPD_APL";
	/** [UPD_MOD_APL]モードを表す定数 */
	public static final String UPD_MOD_APL = "UPD_MOD_APL";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";
	/** [FIX_APL]モードを表す定数 */
	public static final String FIX_APL = "FIX_APL";
	/** [FIX_MOD_APL]モードを表す定数 */
	public static final String FIX_MOD_APL = "FIX_MOD_APL";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [DEL_APL]モードを表す定数 */
	public static final String DEL_APL = "DEL_APL";
	/** [REF_APL]モードを表す定数 */
	public static final String REF_APL = "REF_APL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, UPD_APL, UPD_MOD_APL, FIX, FIX_APL, FIX_MOD_APL, DEL, DEL_APL, REF_APL, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABSL0140_Srch01]のCallerの作成 */
	protected MABSP_ProcUpriReg_MC.MA_MABSL0140_Srch01Caller createMA_MABSL0140_Srch01() {
		MABSP_ProcUpriReg_MC.MA_MABSL0140_Srch01Caller<MABSP_ProcUpriReg, MA_MABSL0140_Srch01Bridge>
		caller = ((MABSP_ProcUpriReg_MC)this).new MA_MABSL0140_Srch01Caller<MABSP_ProcUpriReg, MA_MABSL0140_Srch01Bridge>(
					(MABSP_ProcUpriReg)this, new MA_MABSL0140_Srch01Bridge());
		return caller;
	}
	/** [MA_MABSL0140_Srch01]の呼び出し */
	protected void callMA_MABSL0140_Srch01() {
		MCCaller caller = createMA_MABSL0140_Srch01();
		caller.exec();
	}
	/** [MA_MABSL0140_Sprt01]のCallerの作成 */
	protected MABSP_ProcUpriReg_MC.MA_MABSL0140_Sprt01Caller createMA_MABSL0140_Sprt01() {
		MABSP_ProcUpriReg_MC.MA_MABSL0140_Sprt01Caller<MABSP_ProcUpriReg, MA_MABSL0140_Sprt01Bridge>
		caller = ((MABSP_ProcUpriReg_MC)this).new MA_MABSL0140_Sprt01Caller<MABSP_ProcUpriReg, MA_MABSL0140_Sprt01Bridge>(
					(MABSP_ProcUpriReg)this, new MA_MABSL0140_Sprt01Bridge());
		return caller;
	}
	/** [MA_MABSL0140_Sprt01]の呼び出し */
	protected void callMA_MABSL0140_Sprt01() {
		MCCaller caller = createMA_MABSL0140_Sprt01();
		caller.exec();
	}
	/** [MA_MABSL0140_Upd01]のCallerの作成 */
	protected MABSP_ProcUpriReg_MC.MA_MABSL0140_Upd01Caller createMA_MABSL0140_Upd01() {
		MABSP_ProcUpriReg_MC.MA_MABSL0140_Upd01Caller<MABSP_ProcUpriReg, MA_MABSL0140_Upd01Bridge>
		caller = ((MABSP_ProcUpriReg_MC)this).new MA_MABSL0140_Upd01Caller<MABSP_ProcUpriReg, MA_MABSL0140_Upd01Bridge>(
					(MABSP_ProcUpriReg)this, new MA_MABSL0140_Upd01Bridge());
		return caller;
	}
	/** [MA_MABSL0140_Upd01]の呼び出し */
	protected void callMA_MABSL0140_Upd01() {
		MCCaller caller = createMA_MABSL0140_Upd01();
		caller.exec();
	}
	/** [MA_MABSL0140_Del01]のCallerの作成 */
	protected MABSP_ProcUpriReg_MC.MA_MABSL0140_Del01Caller createMA_MABSL0140_Del01() {
		MABSP_ProcUpriReg_MC.MA_MABSL0140_Del01Caller<MABSP_ProcUpriReg, MA_MABSL0140_Del01Bridge>
		caller = ((MABSP_ProcUpriReg_MC)this).new MA_MABSL0140_Del01Caller<MABSP_ProcUpriReg, MA_MABSL0140_Del01Bridge>(
					(MABSP_ProcUpriReg)this, new MA_MABSL0140_Del01Bridge());
		return caller;
	}
	/** [MA_MABSL0140_Del01]の呼び出し */
	protected void callMA_MABSL0140_Del01() {
		MCCaller caller = createMA_MABSL0140_Del01();
		caller.exec();
	}
	/** [MA_MABSL0140_Aprv_Srch01]のCallerの作成 */
	protected MABSP_ProcUpriReg_MC.MA_MABSL0140_Aprv_Srch01Caller createMA_MABSL0140_Aprv_Srch01() {
		MABSP_ProcUpriReg_MC.MA_MABSL0140_Aprv_Srch01Caller<MABSP_ProcUpriReg, MA_MABSL0140_Aprv_Srch01Bridge>
		caller = ((MABSP_ProcUpriReg_MC)this).new MA_MABSL0140_Aprv_Srch01Caller<MABSP_ProcUpriReg, MA_MABSL0140_Aprv_Srch01Bridge>(
					(MABSP_ProcUpriReg)this, new MA_MABSL0140_Aprv_Srch01Bridge());
		return caller;
	}
	/** [MA_MABSL0140_Aprv_Srch01]の呼び出し */
	protected void callMA_MABSL0140_Aprv_Srch01() {
		MCCaller caller = createMA_MABSL0140_Aprv_Srch01();
		caller.exec();
	}
	/** [MA_MABSL0140_Aprv_Upd01]のCallerの作成 */
	protected MABSP_ProcUpriReg_MC.MA_MABSL0140_Aprv_Upd01Caller createMA_MABSL0140_Aprv_Upd01() {
		MABSP_ProcUpriReg_MC.MA_MABSL0140_Aprv_Upd01Caller<MABSP_ProcUpriReg, MA_MABSL0140_Aprv_Upd01Bridge>
		caller = ((MABSP_ProcUpriReg_MC)this).new MA_MABSL0140_Aprv_Upd01Caller<MABSP_ProcUpriReg, MA_MABSL0140_Aprv_Upd01Bridge>(
					(MABSP_ProcUpriReg)this, new MA_MABSL0140_Aprv_Upd01Bridge());
		return caller;
	}
	/** [MA_MABSL0140_Aprv_Upd01]の呼び出し */
	protected void callMA_MABSL0140_Aprv_Upd01() {
		MCCaller caller = createMA_MABSL0140_Aprv_Upd01();
		caller.exec();
	}
	/** [MA_MABSL0140_Aprv_Del01]のCallerの作成 */
	protected MABSP_ProcUpriReg_MC.MA_MABSL0140_Aprv_Del01Caller createMA_MABSL0140_Aprv_Del01() {
		MABSP_ProcUpriReg_MC.MA_MABSL0140_Aprv_Del01Caller<MABSP_ProcUpriReg, MA_MABSL0140_Aprv_Del01Bridge>
		caller = ((MABSP_ProcUpriReg_MC)this).new MA_MABSL0140_Aprv_Del01Caller<MABSP_ProcUpriReg, MA_MABSL0140_Aprv_Del01Bridge>(
					(MABSP_ProcUpriReg)this, new MA_MABSL0140_Aprv_Del01Bridge());
		return caller;
	}
	/** [MA_MABSL0140_Aprv_Del01]の呼び出し */
	protected void callMA_MABSL0140_Aprv_Del01() {
		MCCaller caller = createMA_MABSL0140_Aprv_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP0140.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP0140.BulkSetR aBulkSetR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0140.DtlR> aDtlL;
	/** [Dtl2]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP0140.Dtl2R aDtl2R;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABS.MABSP0140.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP0140.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP0140.CndR createCndR() {
		return mcframe.clientMABS.MABSP0140.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMABS.MABSP0140.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABS.MABSP0140.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABS.MABSP0140.BulkSetR createBulkSetR() {
		return mcframe.clientMABS.MABSP0140.BulkSetR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABS.MABSP0140.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0140.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABS.MABSP0140.DtlR createDtlR() {
		return mcframe.clientMABS.MABSP0140.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0140.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0140.DtlR.class);
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
	 * 項目コピーによってaDtl2Rを設定します。
	 *
	 * aDtl2Rのインスタンスは変更されません。
	 *
	 * @param row Dtl2R
	 */
	public void setDtl2R(mcframe.clientMABS.MABSP0140.Dtl2R row) {
		if (row != null) {
			MCRow.copyall(getDtl2R(), row);
		}
	}

	/**
	 * [Dtl2]ブロックのコンテナaDtl2Rを返します。
	 *
	 * @return Dtl2R
	 */
	public mcframe.clientMABS.MABSP0140.Dtl2R getDtl2R() {
		return aDtl2R;
	}

	/**
	 * aDtl2Rを作成します。
	 *
	 * @return Dtl2R
	 */
	public mcframe.clientMABS.MABSP0140.Dtl2R createDtl2R() {
		return mcframe.clientMABS.MABSP0140.Dtl2R.create();
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
		if(!MCCollectionUtil.contains(ret, getDtl2R())) ret.add(getDtl2R());
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
		if(aCnt == getDtl2R()) return "Dtl2";
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
		if(bId.equals("Dtl2")) return getDtl2R();
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
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(Tab4Panel);
		ret.add(Tab5Panel);
		ret.add(Tab6Panel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(BottomPanel);
		ret.add(BulkSetPanel);
		ret.add(DtlPanel);
		ret.add(Dtl2Panel);
		ret.add(DtlBtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_ProcUpriReg_MC_A() {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();
		aDtl2R = createDtl2R();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABSP_ProcUpriReg_MC_A(String name) {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aDtl2R = createDtl2R();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABSP_ProcUpriReg_MC.jbCreateScreenOpe((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbCreateRegTarget((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbCreateTop((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbCreateFold((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbCreateCndTab((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbCreateTab1((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbCreateTab2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbCreateTab3((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbCreateTab4((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbCreateTab5((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbCreateTab6((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbCreateCnd((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbCreateCtrl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbCreateRPnl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbCreateBottom((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbCreateBulkSet((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbCreateDtl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbCreateDtl2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbCreateDtlBtn((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbCreateEastBtn((MABSP_ProcUpriReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABSP_ProcUpriReg p) {
	}

	/**
	 * [RegTarget]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRegTarget(MABSP_ProcUpriReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABSP_ProcUpriReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABSP_ProcUpriReg p) {
	}

	/**
	 * [CndTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCndTab(MABSP_ProcUpriReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MABSP_ProcUpriReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MABSP_ProcUpriReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MABSP_ProcUpriReg p) {
	}

	/**
	 * [Tab4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab4(MABSP_ProcUpriReg p) {
	}

	/**
	 * [Tab5]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab5(MABSP_ProcUpriReg p) {
	}

	/**
	 * [Tab6]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab6(MABSP_ProcUpriReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABSP_ProcUpriReg p) {
		p.Cnd_dt_PPanel = mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.create(p.getCndR().dt());
		p.Cnd_dt_PPanel.setName("Cnd.dt");
		p.Cnd_base_dt = p.Cnd_dt_PPanel.StEndDt_dt;
		p.Cnd_base_dt.addAliasName("Cnd.base_dt", p);
		p.Cnd_st_dt_fr = p.Cnd_dt_PPanel.StEndDt_st_dt_fr;
		p.Cnd_st_dt_fr.addAliasName("Cnd.st_dt_fr", p);
		p.Cnd_st_dt_to = p.Cnd_dt_PPanel.StEndDt_st_dt_to;
		p.Cnd_st_dt_to.addAliasName("Cnd.st_dt_to", p);
		p.Cnd_end_dt_fr = p.Cnd_dt_PPanel.StEndDt_end_dt_fr;
		p.Cnd_end_dt_fr.addAliasName("Cnd.end_dt_fr", p);
		p.Cnd_end_dt_to = p.Cnd_dt_PPanel.StEndDt_end_dt_to;
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
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABSP_ProcUpriReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MABSP_ProcUpriReg p) {
	}

	/**
	 * [Bottom]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBottom(MABSP_ProcUpriReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MABSP_ProcUpriReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABSP_ProcUpriReg p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0140.DtlR.$itm_p);
		p.Dtl_itm_p_PPanel.setName("Dtl.itm_p");
		p.columnDtl_itm_cd = p.Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_itm_cd.addAliasName("Dtl.itm_cd", p);
		p.columnDtl_itm_sub1 = p.Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_itm_sub1.addAliasName("Dtl.itm_sub1", p);
		p.columnDtl_itm_sub2 = p.Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_itm_sub2.addAliasName("Dtl.itm_sub2", p);
		p.columnDtl_itm_sub3 = p.Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_itm_sub3.addAliasName("Dtl.itm_sub3", p);
		p.columnDtl_itm_nm = p.Dtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_itm_nm.addAliasName("Dtl.itm_nm", p);
		p.Dtl_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0140.DtlR.$qty_p);
		p.Dtl_qty_p_PPanel.setName("Dtl.qty_p");
		p.columnDtl_lot_qty = p.Dtl_qty_p_PPanel.columnQty_qty;
		p.columnDtl_lot_qty.addAliasName("Dtl.lot_qty", p);
		p.Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP0140.DtlR.$dt_p);
		p.Dtl_dt_p_PPanel.setName("Dtl.dt_p");
		p.columnDtl_st_dt_key = p.Dtl_dt_p_PPanel.columnDt_st_dt_key;
		p.columnDtl_st_dt_key.addAliasName("Dtl.st_dt_key", p);
		p.columnDtl_st_dt = p.Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnDtl_st_dt.addAliasName("Dtl.st_dt", p);
		p.columnDtl_end_dt = p.Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnDtl_end_dt.addAliasName("Dtl.end_dt", p);
		p.Dtl_upri1_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMABS.MABSP0140.DtlR.$upri1_p);
		p.Dtl_upri1_p_PPanel.setName("Dtl.upri1_p");
		p.columnDtl_upri = p.Dtl_upri1_p_PPanel.columnUpri_upri;
		p.columnDtl_upri.addAliasName("Dtl.upri", p);
		p.Dtl_upri2_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMABS.MABSP0140.DtlR.$upri2_p);
		p.Dtl_upri2_p_PPanel.setName("Dtl.upri2_p");
		p.columnDtl_upri_bf = p.Dtl_upri2_p_PPanel.columnUpri_upri;
		p.columnDtl_upri_bf.addAliasName("Dtl.upri_bf", p);
		p.Dtl_upri3_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMABS.MABSP0140.DtlR.$upri3_p);
		p.Dtl_upri3_p_PPanel.setName("Dtl.upri3_p");
		p.columnDtl_sub_upri1 = p.Dtl_upri3_p_PPanel.columnUpri_upri;
		p.columnDtl_sub_upri1.addAliasName("Dtl.sub_upri1", p);
		p.Dtl_upri4_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMABS.MABSP0140.DtlR.$upri4_p);
		p.Dtl_upri4_p_PPanel.setName("Dtl.upri4_p");
		p.columnDtl_sub_upri2 = p.Dtl_upri4_p_PPanel.columnUpri_upri;
		p.columnDtl_sub_upri2.addAliasName("Dtl.sub_upri2", p);
		p.Dtl_upri5_p_PPanel = mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.create(mcframe.clientMABS.MABSP0140.DtlR.$upri5_p);
		p.Dtl_upri5_p_PPanel.setName("Dtl.upri5_p");
		p.columnDtl_sub_upri3 = p.Dtl_upri5_p_PPanel.columnUpri_upri;
		p.columnDtl_sub_upri3.addAliasName("Dtl.sub_upri3", p);
	}

	/**
	 * [Dtl2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl2(MABSP_ProcUpriReg p) {
		p.Dtl2_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getDtl2R().usr_dpt_p());
		p.Dtl2_usr_dpt_p_PPanel.setName("Dtl2.usr_dpt_p");
		p.Dtl2_apl_usr_cd = p.Dtl2_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.Dtl2_apl_usr_cd.addAliasName("Dtl2.apl_usr_cd", p);
		p.Dtl2_apl_usr_nm = p.Dtl2_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.Dtl2_apl_usr_nm.addAliasName("Dtl2.apl_usr_nm", p);
		p.Dtl2_apl_dpt_cd = p.Dtl2_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.Dtl2_apl_dpt_cd.addAliasName("Dtl2.apl_dpt_cd", p);
		p.Dtl2_apl_dpt_nm = p.Dtl2_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.Dtl2_apl_dpt_nm.addAliasName("Dtl2.apl_dpt_nm", p);
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABSP_ProcUpriReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABSP_ProcUpriReg p) {
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
	
	
	/** [Cnd_unit_cd_ListPutter]の定義 */
	private MCListPutter Cnd_unit_cd_p = null;

	/**
	 * [Cnd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_unit_cd_ListPutter() {
		if (Cnd_unit_cd_p == null) {
			Cnd_unit_cd_p = createCnd_unit_cd_ListPutter(Cnd_unit_cd, "unit_cd", "unit_nm");

		}
		return Cnd_unit_cd_p;
	}
	
	
	/** [Cnd_cur_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cur_cd_p = null;

	/**
	 * [Cnd_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cur_cd_ListPutter() {
		if (Cnd_cur_cd_p == null) {
			Cnd_cur_cd_p = createCnd_cur_cd_ListPutter(Cnd_cur_cd, "cur_cd", "cur_nm");

		}
		return Cnd_cur_cd_p;
	}
	
	
	/** [Cnd_proc_upri_typ_ListPutter]の定義 */
	private MCListPutter Cnd_proc_upri_typ_p = null;

	/**
	 * [Cnd_proc_upri_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_proc_upri_typ_ListPutter() {
		if (Cnd_proc_upri_typ_p == null) {
			Cnd_proc_upri_typ_p = createCnd_proc_upri_typ_ListPutter(Cnd_proc_upri_typ, "proc_upri_typ", "proc_upri_typ_nm");

		}
		return Cnd_proc_upri_typ_p;
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
	
	
	/** [Cnd_maker_cd_ListPutter]の定義 */
	private MCListPutter Cnd_maker_cd_p = null;

	/**
	 * [Cnd_maker_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_maker_cd_ListPutter() {
		if (Cnd_maker_cd_p == null) {
			Cnd_maker_cd_p = createCnd_maker_cd_ListPutter(Cnd_maker_cd, "maker_cd", "maker_nm");

		}
		return Cnd_maker_cd_p;
	}
	
	
	/** [Cnd_sppl_cntry_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_cntry_cd_p = null;

	/**
	 * [Cnd_sppl_cntry_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_cntry_cd_ListPutter() {
		if (Cnd_sppl_cntry_cd_p == null) {
			Cnd_sppl_cntry_cd_p = createCnd_sppl_cntry_cd_ListPutter(Cnd_sppl_cntry_cd, "sppl_cntry_cd", "sppl_cntry_nm");

		}
		return Cnd_sppl_cntry_cd_p;
	}
	
	
	/** [Cnd_sppl_area_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_area_cd_p = null;

	/**
	 * [Cnd_sppl_area_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_area_cd_ListPutter() {
		if (Cnd_sppl_area_cd_p == null) {
			Cnd_sppl_area_cd_p = createCnd_sppl_area_cd_ListPutter(Cnd_sppl_area_cd, "sppl_area_cd", "sppl_area_nm");

		}
		return Cnd_sppl_area_cd_p;
	}
	
	
	/** [Cnd_dlv_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_cd_p = null;

	/**
	 * [Cnd_dlv_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_cd_ListPutter() {
		if (Cnd_dlv_cd_p == null) {
			Cnd_dlv_cd_p = createCnd_dlv_cd_ListPutter(Cnd_dlv_cd, "dlv_cd", "dlv_nm");

		}
		return Cnd_dlv_cd_p;
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
	
	
	/** [Cnd_sppl_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd1_p = null;

	/**
	 * [Cnd_sppl_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd1_ListPutter() {
		if (Cnd_sppl_grp_cd1_p == null) {
			Cnd_sppl_grp_cd1_p = createCnd_sppl_grp_cd1_ListPutter(Cnd_sppl_grp_cd1, "sppl_grp_cd1", "sppl_grp_nm1");

		}
		return Cnd_sppl_grp_cd1_p;
	}
	
	
	/** [Cnd_sppl_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd2_p = null;

	/**
	 * [Cnd_sppl_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd2_ListPutter() {
		if (Cnd_sppl_grp_cd2_p == null) {
			Cnd_sppl_grp_cd2_p = createCnd_sppl_grp_cd2_ListPutter(Cnd_sppl_grp_cd2, "sppl_grp_cd2", "sppl_grp_nm2");

		}
		return Cnd_sppl_grp_cd2_p;
	}
	
	
	/** [Cnd_sppl_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd3_p = null;

	/**
	 * [Cnd_sppl_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd3_ListPutter() {
		if (Cnd_sppl_grp_cd3_p == null) {
			Cnd_sppl_grp_cd3_p = createCnd_sppl_grp_cd3_ListPutter(Cnd_sppl_grp_cd3, "sppl_grp_cd3", "sppl_grp_nm3");

		}
		return Cnd_sppl_grp_cd3_p;
	}
	
	
	/** [Cnd_sppl_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd4_p = null;

	/**
	 * [Cnd_sppl_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd4_ListPutter() {
		if (Cnd_sppl_grp_cd4_p == null) {
			Cnd_sppl_grp_cd4_p = createCnd_sppl_grp_cd4_ListPutter(Cnd_sppl_grp_cd4, "sppl_grp_cd4", "sppl_grp_nm4");

		}
		return Cnd_sppl_grp_cd4_p;
	}
	
	
	/** [Cnd_sppl_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd5_p = null;

	/**
	 * [Cnd_sppl_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd5_ListPutter() {
		if (Cnd_sppl_grp_cd5_p == null) {
			Cnd_sppl_grp_cd5_p = createCnd_sppl_grp_cd5_ListPutter(Cnd_sppl_grp_cd5, "sppl_grp_cd5", "sppl_grp_nm5");

		}
		return Cnd_sppl_grp_cd5_p;
	}
	
	
	/** [Cnd_sppl_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd6_p = null;

	/**
	 * [Cnd_sppl_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd6_ListPutter() {
		if (Cnd_sppl_grp_cd6_p == null) {
			Cnd_sppl_grp_cd6_p = createCnd_sppl_grp_cd6_ListPutter(Cnd_sppl_grp_cd6, "sppl_grp_cd6", "sppl_grp_nm6");

		}
		return Cnd_sppl_grp_cd6_p;
	}
	
	
	/** [Cnd_sppl_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd7_p = null;

	/**
	 * [Cnd_sppl_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd7_ListPutter() {
		if (Cnd_sppl_grp_cd7_p == null) {
			Cnd_sppl_grp_cd7_p = createCnd_sppl_grp_cd7_ListPutter(Cnd_sppl_grp_cd7, "sppl_grp_cd7", "sppl_grp_nm7");

		}
		return Cnd_sppl_grp_cd7_p;
	}
	
	
	/** [Cnd_sppl_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd8_p = null;

	/**
	 * [Cnd_sppl_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd8_ListPutter() {
		if (Cnd_sppl_grp_cd8_p == null) {
			Cnd_sppl_grp_cd8_p = createCnd_sppl_grp_cd8_ListPutter(Cnd_sppl_grp_cd8, "sppl_grp_cd8", "sppl_grp_nm8");

		}
		return Cnd_sppl_grp_cd8_p;
	}
	
	
	/** [Cnd_sppl_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd9_p = null;

	/**
	 * [Cnd_sppl_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd9_ListPutter() {
		if (Cnd_sppl_grp_cd9_p == null) {
			Cnd_sppl_grp_cd9_p = createCnd_sppl_grp_cd9_ListPutter(Cnd_sppl_grp_cd9, "sppl_grp_cd9", "sppl_grp_nm9");

		}
		return Cnd_sppl_grp_cd9_p;
	}
	
	
	/** [Cnd_sppl_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_grp_cd10_p = null;

	/**
	 * [Cnd_sppl_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_grp_cd10_ListPutter() {
		if (Cnd_sppl_grp_cd10_p == null) {
			Cnd_sppl_grp_cd10_p = createCnd_sppl_grp_cd10_ListPutter(Cnd_sppl_grp_cd10, "sppl_grp_cd10", "sppl_grp_nm10");

		}
		return Cnd_sppl_grp_cd10_p;
	}
	
	
	/** [Cnd_maker_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_maker_grp_cd1_p = null;

	/**
	 * [Cnd_maker_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_maker_grp_cd1_ListPutter() {
		if (Cnd_maker_grp_cd1_p == null) {
			Cnd_maker_grp_cd1_p = createCnd_maker_grp_cd1_ListPutter(Cnd_maker_grp_cd1, "maker_grp_cd1", "maker_grp_nm1");

		}
		return Cnd_maker_grp_cd1_p;
	}
	
	
	/** [Cnd_maker_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_maker_grp_cd2_p = null;

	/**
	 * [Cnd_maker_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_maker_grp_cd2_ListPutter() {
		if (Cnd_maker_grp_cd2_p == null) {
			Cnd_maker_grp_cd2_p = createCnd_maker_grp_cd2_ListPutter(Cnd_maker_grp_cd2, "maker_grp_cd2", "maker_grp_nm2");

		}
		return Cnd_maker_grp_cd2_p;
	}
	
	
	/** [Cnd_maker_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_maker_grp_cd3_p = null;

	/**
	 * [Cnd_maker_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_maker_grp_cd3_ListPutter() {
		if (Cnd_maker_grp_cd3_p == null) {
			Cnd_maker_grp_cd3_p = createCnd_maker_grp_cd3_ListPutter(Cnd_maker_grp_cd3, "maker_grp_cd3", "maker_grp_nm3");

		}
		return Cnd_maker_grp_cd3_p;
	}
	
	
	/** [Cnd_maker_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_maker_grp_cd4_p = null;

	/**
	 * [Cnd_maker_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_maker_grp_cd4_ListPutter() {
		if (Cnd_maker_grp_cd4_p == null) {
			Cnd_maker_grp_cd4_p = createCnd_maker_grp_cd4_ListPutter(Cnd_maker_grp_cd4, "maker_grp_cd4", "maker_grp_nm4");

		}
		return Cnd_maker_grp_cd4_p;
	}
	
	
	/** [Cnd_maker_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_maker_grp_cd5_p = null;

	/**
	 * [Cnd_maker_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_maker_grp_cd5_ListPutter() {
		if (Cnd_maker_grp_cd5_p == null) {
			Cnd_maker_grp_cd5_p = createCnd_maker_grp_cd5_ListPutter(Cnd_maker_grp_cd5, "maker_grp_cd5", "maker_grp_nm5");

		}
		return Cnd_maker_grp_cd5_p;
	}
	
	
	/** [Cnd_maker_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_maker_grp_cd6_p = null;

	/**
	 * [Cnd_maker_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_maker_grp_cd6_ListPutter() {
		if (Cnd_maker_grp_cd6_p == null) {
			Cnd_maker_grp_cd6_p = createCnd_maker_grp_cd6_ListPutter(Cnd_maker_grp_cd6, "maker_grp_cd6", "maker_grp_nm6");

		}
		return Cnd_maker_grp_cd6_p;
	}
	
	
	/** [Cnd_maker_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_maker_grp_cd7_p = null;

	/**
	 * [Cnd_maker_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_maker_grp_cd7_ListPutter() {
		if (Cnd_maker_grp_cd7_p == null) {
			Cnd_maker_grp_cd7_p = createCnd_maker_grp_cd7_ListPutter(Cnd_maker_grp_cd7, "maker_grp_cd7", "maker_grp_nm7");

		}
		return Cnd_maker_grp_cd7_p;
	}
	
	
	/** [Cnd_maker_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_maker_grp_cd8_p = null;

	/**
	 * [Cnd_maker_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_maker_grp_cd8_ListPutter() {
		if (Cnd_maker_grp_cd8_p == null) {
			Cnd_maker_grp_cd8_p = createCnd_maker_grp_cd8_ListPutter(Cnd_maker_grp_cd8, "maker_grp_cd8", "maker_grp_nm8");

		}
		return Cnd_maker_grp_cd8_p;
	}
	
	
	/** [Cnd_maker_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_maker_grp_cd9_p = null;

	/**
	 * [Cnd_maker_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_maker_grp_cd9_ListPutter() {
		if (Cnd_maker_grp_cd9_p == null) {
			Cnd_maker_grp_cd9_p = createCnd_maker_grp_cd9_ListPutter(Cnd_maker_grp_cd9, "maker_grp_cd9", "maker_grp_nm9");

		}
		return Cnd_maker_grp_cd9_p;
	}
	
	
	/** [Cnd_maker_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_maker_grp_cd10_p = null;

	/**
	 * [Cnd_maker_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_maker_grp_cd10_ListPutter() {
		if (Cnd_maker_grp_cd10_p == null) {
			Cnd_maker_grp_cd10_p = createCnd_maker_grp_cd10_ListPutter(Cnd_maker_grp_cd10, "maker_grp_cd10", "maker_grp_nm10");

		}
		return Cnd_maker_grp_cd10_p;
	}
	
	
	/** [Cnd_dlv_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd1_p = null;

	/**
	 * [Cnd_dlv_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd1_ListPutter() {
		if (Cnd_dlv_grp_cd1_p == null) {
			Cnd_dlv_grp_cd1_p = createCnd_dlv_grp_cd1_ListPutter(Cnd_dlv_grp_cd1, "dlv_grp_cd1", "dlv_grp_nm1");

		}
		return Cnd_dlv_grp_cd1_p;
	}
	
	
	/** [Cnd_dlv_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd2_p = null;

	/**
	 * [Cnd_dlv_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd2_ListPutter() {
		if (Cnd_dlv_grp_cd2_p == null) {
			Cnd_dlv_grp_cd2_p = createCnd_dlv_grp_cd2_ListPutter(Cnd_dlv_grp_cd2, "dlv_grp_cd2", "dlv_grp_nm2");

		}
		return Cnd_dlv_grp_cd2_p;
	}
	
	
	/** [Cnd_dlv_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd3_p = null;

	/**
	 * [Cnd_dlv_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd3_ListPutter() {
		if (Cnd_dlv_grp_cd3_p == null) {
			Cnd_dlv_grp_cd3_p = createCnd_dlv_grp_cd3_ListPutter(Cnd_dlv_grp_cd3, "dlv_grp_cd3", "dlv_grp_nm3");

		}
		return Cnd_dlv_grp_cd3_p;
	}
	
	
	/** [Cnd_dlv_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd4_p = null;

	/**
	 * [Cnd_dlv_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd4_ListPutter() {
		if (Cnd_dlv_grp_cd4_p == null) {
			Cnd_dlv_grp_cd4_p = createCnd_dlv_grp_cd4_ListPutter(Cnd_dlv_grp_cd4, "dlv_grp_cd4", "dlv_grp_nm4");

		}
		return Cnd_dlv_grp_cd4_p;
	}
	
	
	/** [Cnd_dlv_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd5_p = null;

	/**
	 * [Cnd_dlv_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd5_ListPutter() {
		if (Cnd_dlv_grp_cd5_p == null) {
			Cnd_dlv_grp_cd5_p = createCnd_dlv_grp_cd5_ListPutter(Cnd_dlv_grp_cd5, "dlv_grp_cd5", "dlv_grp_nm5");

		}
		return Cnd_dlv_grp_cd5_p;
	}
	
	
	/** [Cnd_dlv_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd6_p = null;

	/**
	 * [Cnd_dlv_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd6_ListPutter() {
		if (Cnd_dlv_grp_cd6_p == null) {
			Cnd_dlv_grp_cd6_p = createCnd_dlv_grp_cd6_ListPutter(Cnd_dlv_grp_cd6, "dlv_grp_cd6", "dlv_grp_nm6");

		}
		return Cnd_dlv_grp_cd6_p;
	}
	
	
	/** [Cnd_dlv_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd7_p = null;

	/**
	 * [Cnd_dlv_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd7_ListPutter() {
		if (Cnd_dlv_grp_cd7_p == null) {
			Cnd_dlv_grp_cd7_p = createCnd_dlv_grp_cd7_ListPutter(Cnd_dlv_grp_cd7, "dlv_grp_cd7", "dlv_grp_nm7");

		}
		return Cnd_dlv_grp_cd7_p;
	}
	
	
	/** [Cnd_dlv_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd8_p = null;

	/**
	 * [Cnd_dlv_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd8_ListPutter() {
		if (Cnd_dlv_grp_cd8_p == null) {
			Cnd_dlv_grp_cd8_p = createCnd_dlv_grp_cd8_ListPutter(Cnd_dlv_grp_cd8, "dlv_grp_cd8", "dlv_grp_nm8");

		}
		return Cnd_dlv_grp_cd8_p;
	}
	
	
	/** [Cnd_dlv_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd9_p = null;

	/**
	 * [Cnd_dlv_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd9_ListPutter() {
		if (Cnd_dlv_grp_cd9_p == null) {
			Cnd_dlv_grp_cd9_p = createCnd_dlv_grp_cd9_ListPutter(Cnd_dlv_grp_cd9, "dlv_grp_cd9", "dlv_grp_nm9");

		}
		return Cnd_dlv_grp_cd9_p;
	}
	
	
	/** [Cnd_dlv_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd10_p = null;

	/**
	 * [Cnd_dlv_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd10_ListPutter() {
		if (Cnd_dlv_grp_cd10_p == null) {
			Cnd_dlv_grp_cd10_p = createCnd_dlv_grp_cd10_ListPutter(Cnd_dlv_grp_cd10, "dlv_grp_cd10", "dlv_grp_nm10");

		}
		return Cnd_dlv_grp_cd10_p;
	}
	
	
	/** [Cnd_apl_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_apl_usr_cd_p = null;

	/**
	 * [Cnd_apl_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_apl_usr_cd_ListPutter() {
		if (Cnd_apl_usr_cd_p == null) {
			Cnd_apl_usr_cd_p = createCnd_apl_usr_cd_ListPutter(Cnd_apl_usr_cd, "apl_usr_cd", "apl_usr_nm");

		}
		return Cnd_apl_usr_cd_p;
	}
	
	
	/** [Cnd_apl_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_apl_dpt_cd_p = null;

	/**
	 * [Cnd_apl_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_apl_dpt_cd_ListPutter() {
		if (Cnd_apl_dpt_cd_p == null) {
			Cnd_apl_dpt_cd_p = createCnd_apl_dpt_cd_ListPutter(Cnd_apl_dpt_cd, "apl_dpt_cd", "apl_dpt_nm");

		}
		return Cnd_apl_dpt_cd_p;
	}
	
	
	/** [Cnd_aprv_sts_typ_ListPutter]の定義 */
	private MCListPutter Cnd_aprv_sts_typ_p = null;

	/**
	 * [Cnd_aprv_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_aprv_sts_typ_ListPutter() {
		if (Cnd_aprv_sts_typ_p == null) {
			Cnd_aprv_sts_typ_p = createCnd_aprv_sts_typ_ListPutter(Cnd_aprv_sts_typ, "aprv_sts_typ", "aprv_sts_typ_nm");

		}
		return Cnd_aprv_sts_typ_p;
	}
	
	
	/** [BulkSet_rnd_typ_ListPutter]の定義 */
	private MCListPutter BulkSet_rnd_typ_p = null;

	/**
	 * [BulkSet_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getBulkSet_rnd_typ_ListPutter() {
		if (BulkSet_rnd_typ_p == null) {
			BulkSet_rnd_typ_p = createBulkSet_rnd_typ_ListPutter(BulkSet_rnd_typ, "rnd_typ", "rnd_typ_nm");

		}
		return BulkSet_rnd_typ_p;
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
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_cd_p = createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_sub1","itm_sub2","itm_sub3","itm_nm","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm","unit_cd");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_sub2","itm_sub3","itm_nm","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm","unit_cd");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_sub3","itm_nm","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm","unit_cd");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm","unit_cd");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Dtl_sppl_cd_ListPutter]の定義 */
	private MCListPutter Dtl_sppl_cd_p = null;

	/**
	 * [Dtl_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sppl_cd_ListPutter() {
		if (Dtl_sppl_cd_p == null) {
			Dtl_sppl_cd_p = createDtl_sppl_cd_ListPutter(columnDtl_sppl_cd, "sppl_cd", "sppl_nm","cur_cd","outsrc_upri_typ");

		}
		return Dtl_sppl_cd_p;
	}
	
	
	/** [Dtl_maker_cd_ListPutter]の定義 */
	private MCListPutter Dtl_maker_cd_p = null;

	/**
	 * [Dtl_maker_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_maker_cd_ListPutter() {
		if (Dtl_maker_cd_p == null) {
			Dtl_maker_cd_p = createDtl_maker_cd_ListPutter(columnDtl_maker_cd, "maker_cd", "maker_nm");

		}
		return Dtl_maker_cd_p;
	}
	
	
	/** [Dtl_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_unit_cd_p = null;

	/**
	 * [Dtl_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_unit_cd_ListPutter() {
		if (Dtl_unit_cd_p == null) {
			Dtl_unit_cd_p = createDtl_unit_cd_ListPutter(columnDtl_unit_cd, "unit_cd", "unit_nm","dec_place");

		}
		return Dtl_unit_cd_p;
	}
	
	
	/** [Dtl_cur_cd_ListPutter]の定義 */
	private MCListPutter Dtl_cur_cd_p = null;

	/**
	 * [Dtl_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cur_cd_ListPutter() {
		if (Dtl_cur_cd_p == null) {
			Dtl_cur_cd_p = createDtl_cur_cd_ListPutter(columnDtl_cur_cd, "cur_cd", "cur_nm","upri_dec_place");

		}
		return Dtl_cur_cd_p;
	}
	
	
	/** [Dtl_proc_upri_typ_ListPutter]の定義 */
	private MCListPutter Dtl_proc_upri_typ_p = null;

	/**
	 * [Dtl_proc_upri_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_proc_upri_typ_ListPutter() {
		if (Dtl_proc_upri_typ_p == null) {
			Dtl_proc_upri_typ_p = createDtl_proc_upri_typ_ListPutter(columnDtl_proc_upri_typ, "proc_upri_typ", "proc_upri_typ_nm");

		}
		return Dtl_proc_upri_typ_p;
	}
	
	
	/** [Dtl_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl_loc_cd_p = null;

	/**
	 * [Dtl_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_loc_cd_ListPutter() {
		if (Dtl_loc_cd_p == null) {
			Dtl_loc_cd_p = createDtl_loc_cd_ListPutter(columnDtl_loc_cd, "loc_cd", "loc_nm");

		}
		return Dtl_loc_cd_p;
	}
	
	
	/** [Dtl_dlv_cd_ListPutter]の定義 */
	private MCListPutter Dtl_dlv_cd_p = null;

	/**
	 * [Dtl_dlv_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dlv_cd_ListPutter() {
		if (Dtl_dlv_cd_p == null) {
			Dtl_dlv_cd_p = createDtl_dlv_cd_ListPutter(columnDtl_dlv_cd, "dlv_cd", "dlv_nm");

		}
		return Dtl_dlv_cd_p;
	}
	
	
	/** [Dtl_outsrc_upri_typ_ListPutter]の定義 */
	private MCListPutter Dtl_outsrc_upri_typ_p = null;

	/**
	 * [Dtl_outsrc_upri_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_outsrc_upri_typ_ListPutter() {
		if (Dtl_outsrc_upri_typ_p == null) {
			Dtl_outsrc_upri_typ_p = createDtl_outsrc_upri_typ_ListPutter(columnDtl_outsrc_upri_typ, "outsrc_upri_typ", "outsrc_upri_typ_nm");

		}
		return Dtl_outsrc_upri_typ_p;
	}
	
	
	/** [Dtl2_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl2_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [Dtl2_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl2_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (Dtl2_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			Dtl2_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createDtl2_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(Dtl2_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "apl_dpt_cd", "apl_dpt_nm");
		}
		return Dtl2_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_ProcUpriReg create(){
		MABSP_ProcUpriReg p = new MABSP_ProcUpriReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_ProcUpriReg create(String name){
		MABSP_ProcUpriReg p = new MABSP_ProcUpriReg(name);
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
		MABSP_ProcUpriReg_MC.jbfInitScreenOpe((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbfInitRegTarget((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbfInitTop((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbfInitFold((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbfInitCndTab((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbfInitTab1((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbfInitTab2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbfInitTab3((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbfInitTab4((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbfInitTab5((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbfInitTab6((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbfInitCnd((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbfInitCtrl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbfInitRPnl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbfInitBottom((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbfInitBulkSet((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbfInitDtl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbfInitDtl2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbfInitDtlBtn((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbfInitEastBtn((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbInitScreenOpe((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbInitRegTarget((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbInitTop((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbInitFold((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbInitCndTab((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbInitTab1((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbInitTab2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbInitTab3((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbInitTab4((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbInitTab5((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbInitTab6((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbInitCnd((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbInitCtrl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbInitRPnl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbInitBottom((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbInitBulkSet((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbInitDtl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbInitDtl2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbInitDtlBtn((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.jbInitEastBtn((MABSP_ProcUpriReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [RegTarget]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRegTarget(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.RegTargetPanel = p.beansFactory.createPanel("RegTarget");
		p.RegTargetTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCndTab(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.CndTabPanel = p.beansFactory.createPanel("CndTab");
		p.CndTabTab = p.beansFactory.createTabbedPane("CndTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab4(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.Tab4Panel = p.beansFactory.createPanel("Tab4");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab5]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab5(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.Tab5Panel = p.beansFactory.createPanel("Tab5");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab6]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab6(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.Tab6Panel = p.beansFactory.createPanel("Tab6");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_APL = p.beansFactory.createRadioButton("Cnd.ope_APL");
		p.Cnd_ope_MOD_APL = p.beansFactory.createRadioButton("Cnd.ope_MOD_APL");
		p.Cnd_ope_DEL_APL = p.beansFactory.createRadioButton("Cnd.ope_DEL_APL");
		p.Cnd_ope_REF_APL = p.beansFactory.createRadioButton("Cnd.ope_REF_APL");
		p.Cnd_cmn_flg = p.beansFactory.createCheckBox("Cnd.cmn_flg");
		p.Cnd_wg_flg = p.beansFactory.createCheckBox("Cnd.wg_flg");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_unit_cd_Label = p.beansFactory.createLabel("Cnd.unit_cd_Label");
		p.Cnd_unit_cd = p.beansFactory.createTextComboBox("Cnd.unit_cd");
		p.Cnd_unit_cd.setLabel(p.Cnd_unit_cd_Label);
		p.Cnd_unit_nm = p.beansFactory.createTextField("Cnd.unit_nm");
		p.Cnd_cur_cd_Label = p.beansFactory.createLabel("Cnd.cur_cd_Label");
		p.Cnd_cur_cd = p.beansFactory.createTextComboBox("Cnd.cur_cd");
		p.Cnd_cur_cd.setLabel(p.Cnd_cur_cd_Label);
		p.Cnd_cur_nm = p.beansFactory.createTextField("Cnd.cur_nm");
		p.Cnd_proc_upri_typ_Label = p.beansFactory.createLabel("Cnd.proc_upri_typ_Label");
		p.Cnd_proc_upri_typ = p.beansFactory.createTextComboBox("Cnd.proc_upri_typ");
		p.Cnd_proc_upri_typ.setLabel(p.Cnd_proc_upri_typ_Label);
		p.Cnd_proc_upri_typ_nm = p.beansFactory.createTextField("Cnd.proc_upri_typ_nm");
		p.Cnd_interim_flg_lab = p.beansFactory.createLabel("Cnd.interim_flg_lab");
		p.Cnd_off_interim_flg = p.beansFactory.createCheckBox("Cnd.off_interim_flg");
		p.Cnd_on_interim_flg = p.beansFactory.createCheckBox("Cnd.on_interim_flg");
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_maker_cd_Label = p.beansFactory.createLabel("Cnd.maker_cd_Label");
		p.Cnd_maker_cd = p.beansFactory.createTextField("Cnd.maker_cd");
		p.Cnd_maker_cd.setLabel(p.Cnd_maker_cd_Label);
		p.Cnd_maker_nm = p.beansFactory.createTextField("Cnd.maker_nm");
		p.Cnd_sppl_cntry_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cntry_cd_Label");
		p.Cnd_sppl_cntry_cd = p.beansFactory.createTextComboBox("Cnd.sppl_cntry_cd");
		p.Cnd_sppl_cntry_cd.setLabel(p.Cnd_sppl_cntry_cd_Label);
		p.Cnd_sppl_cntry_nm = p.beansFactory.createTextField("Cnd.sppl_cntry_nm");
		p.Cnd_sppl_foreign_flg = p.beansFactory.createCheckBox("Cnd.sppl_foreign_flg");
		p.Cnd_sppl_area_cd_Label = p.beansFactory.createLabel("Cnd.sppl_area_cd_Label");
		p.Cnd_sppl_area_cd = p.beansFactory.createTextComboBox("Cnd.sppl_area_cd");
		p.Cnd_sppl_area_cd.setLabel(p.Cnd_sppl_area_cd_Label);
		p.Cnd_sppl_area_nm = p.beansFactory.createTextField("Cnd.sppl_area_nm");
		p.Cnd_dlv_cd_Label = p.beansFactory.createLabel("Cnd.dlv_cd_Label");
		p.Cnd_dlv_cd = p.beansFactory.createTextField("Cnd.dlv_cd");
		p.Cnd_dlv_cd.setLabel(p.Cnd_dlv_cd_Label);
		p.Cnd_dlv_nm = p.beansFactory.createTextField("Cnd.dlv_nm");
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextField("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
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
		p.Cnd_sppl_grp_cd1_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd1_Label");
		p.Cnd_sppl_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd1");
		p.Cnd_sppl_grp_cd1.setLabel(p.Cnd_sppl_grp_cd1_Label);
		p.Cnd_sppl_grp_nm1 = p.beansFactory.createTextField("Cnd.sppl_grp_nm1");
		p.Cnd_sppl_grp_cd2_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd2_Label");
		p.Cnd_sppl_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd2");
		p.Cnd_sppl_grp_cd2.setLabel(p.Cnd_sppl_grp_cd2_Label);
		p.Cnd_sppl_grp_nm2 = p.beansFactory.createTextField("Cnd.sppl_grp_nm2");
		p.Cnd_sppl_grp_cd3_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd3_Label");
		p.Cnd_sppl_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd3");
		p.Cnd_sppl_grp_cd3.setLabel(p.Cnd_sppl_grp_cd3_Label);
		p.Cnd_sppl_grp_nm3 = p.beansFactory.createTextField("Cnd.sppl_grp_nm3");
		p.Cnd_sppl_grp_cd4_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd4_Label");
		p.Cnd_sppl_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd4");
		p.Cnd_sppl_grp_cd4.setLabel(p.Cnd_sppl_grp_cd4_Label);
		p.Cnd_sppl_grp_nm4 = p.beansFactory.createTextField("Cnd.sppl_grp_nm4");
		p.Cnd_sppl_grp_cd5_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd5_Label");
		p.Cnd_sppl_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd5");
		p.Cnd_sppl_grp_cd5.setLabel(p.Cnd_sppl_grp_cd5_Label);
		p.Cnd_sppl_grp_nm5 = p.beansFactory.createTextField("Cnd.sppl_grp_nm5");
		p.Cnd_sppl_grp_cd6_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd6_Label");
		p.Cnd_sppl_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd6");
		p.Cnd_sppl_grp_cd6.setLabel(p.Cnd_sppl_grp_cd6_Label);
		p.Cnd_sppl_grp_nm6 = p.beansFactory.createTextField("Cnd.sppl_grp_nm6");
		p.Cnd_sppl_grp_cd7_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd7_Label");
		p.Cnd_sppl_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd7");
		p.Cnd_sppl_grp_cd7.setLabel(p.Cnd_sppl_grp_cd7_Label);
		p.Cnd_sppl_grp_nm7 = p.beansFactory.createTextField("Cnd.sppl_grp_nm7");
		p.Cnd_sppl_grp_cd8_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd8_Label");
		p.Cnd_sppl_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd8");
		p.Cnd_sppl_grp_cd8.setLabel(p.Cnd_sppl_grp_cd8_Label);
		p.Cnd_sppl_grp_nm8 = p.beansFactory.createTextField("Cnd.sppl_grp_nm8");
		p.Cnd_sppl_grp_cd9_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd9_Label");
		p.Cnd_sppl_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd9");
		p.Cnd_sppl_grp_cd9.setLabel(p.Cnd_sppl_grp_cd9_Label);
		p.Cnd_sppl_grp_nm9 = p.beansFactory.createTextField("Cnd.sppl_grp_nm9");
		p.Cnd_sppl_grp_cd10_Label = p.beansFactory.createLabel("Cnd.sppl_grp_cd10_Label");
		p.Cnd_sppl_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.sppl_grp_cd10");
		p.Cnd_sppl_grp_cd10.setLabel(p.Cnd_sppl_grp_cd10_Label);
		p.Cnd_sppl_grp_nm10 = p.beansFactory.createTextField("Cnd.sppl_grp_nm10");
		p.Cnd_maker_grp_cd1_Label = p.beansFactory.createLabel("Cnd.maker_grp_cd1_Label");
		p.Cnd_maker_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.maker_grp_cd1");
		p.Cnd_maker_grp_cd1.setLabel(p.Cnd_maker_grp_cd1_Label);
		p.Cnd_maker_grp_nm1 = p.beansFactory.createTextField("Cnd.maker_grp_nm1");
		p.Cnd_maker_grp_cd2_Label = p.beansFactory.createLabel("Cnd.maker_grp_cd2_Label");
		p.Cnd_maker_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.maker_grp_cd2");
		p.Cnd_maker_grp_cd2.setLabel(p.Cnd_maker_grp_cd2_Label);
		p.Cnd_maker_grp_nm2 = p.beansFactory.createTextField("Cnd.maker_grp_nm2");
		p.Cnd_maker_grp_cd3_Label = p.beansFactory.createLabel("Cnd.maker_grp_cd3_Label");
		p.Cnd_maker_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.maker_grp_cd3");
		p.Cnd_maker_grp_cd3.setLabel(p.Cnd_maker_grp_cd3_Label);
		p.Cnd_maker_grp_nm3 = p.beansFactory.createTextField("Cnd.maker_grp_nm3");
		p.Cnd_maker_grp_cd4_Label = p.beansFactory.createLabel("Cnd.maker_grp_cd4_Label");
		p.Cnd_maker_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.maker_grp_cd4");
		p.Cnd_maker_grp_cd4.setLabel(p.Cnd_maker_grp_cd4_Label);
		p.Cnd_maker_grp_nm4 = p.beansFactory.createTextField("Cnd.maker_grp_nm4");
		p.Cnd_maker_grp_cd5_Label = p.beansFactory.createLabel("Cnd.maker_grp_cd5_Label");
		p.Cnd_maker_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.maker_grp_cd5");
		p.Cnd_maker_grp_cd5.setLabel(p.Cnd_maker_grp_cd5_Label);
		p.Cnd_maker_grp_nm5 = p.beansFactory.createTextField("Cnd.maker_grp_nm5");
		p.Cnd_maker_grp_cd6_Label = p.beansFactory.createLabel("Cnd.maker_grp_cd6_Label");
		p.Cnd_maker_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.maker_grp_cd6");
		p.Cnd_maker_grp_cd6.setLabel(p.Cnd_maker_grp_cd6_Label);
		p.Cnd_maker_grp_nm6 = p.beansFactory.createTextField("Cnd.maker_grp_nm6");
		p.Cnd_maker_grp_cd7_Label = p.beansFactory.createLabel("Cnd.maker_grp_cd7_Label");
		p.Cnd_maker_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.maker_grp_cd7");
		p.Cnd_maker_grp_cd7.setLabel(p.Cnd_maker_grp_cd7_Label);
		p.Cnd_maker_grp_nm7 = p.beansFactory.createTextField("Cnd.maker_grp_nm7");
		p.Cnd_maker_grp_cd8_Label = p.beansFactory.createLabel("Cnd.maker_grp_cd8_Label");
		p.Cnd_maker_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.maker_grp_cd8");
		p.Cnd_maker_grp_cd8.setLabel(p.Cnd_maker_grp_cd8_Label);
		p.Cnd_maker_grp_nm8 = p.beansFactory.createTextField("Cnd.maker_grp_nm8");
		p.Cnd_maker_grp_cd9_Label = p.beansFactory.createLabel("Cnd.maker_grp_cd9_Label");
		p.Cnd_maker_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.maker_grp_cd9");
		p.Cnd_maker_grp_cd9.setLabel(p.Cnd_maker_grp_cd9_Label);
		p.Cnd_maker_grp_nm9 = p.beansFactory.createTextField("Cnd.maker_grp_nm9");
		p.Cnd_maker_grp_cd10_Label = p.beansFactory.createLabel("Cnd.maker_grp_cd10_Label");
		p.Cnd_maker_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.maker_grp_cd10");
		p.Cnd_maker_grp_cd10.setLabel(p.Cnd_maker_grp_cd10_Label);
		p.Cnd_maker_grp_nm10 = p.beansFactory.createTextField("Cnd.maker_grp_nm10");
		p.Cnd_dlv_grp_cd1_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd1_Label");
		p.Cnd_dlv_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd1");
		p.Cnd_dlv_grp_cd1.setLabel(p.Cnd_dlv_grp_cd1_Label);
		p.Cnd_dlv_grp_nm1 = p.beansFactory.createTextField("Cnd.dlv_grp_nm1");
		p.Cnd_dlv_grp_cd2_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd2_Label");
		p.Cnd_dlv_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd2");
		p.Cnd_dlv_grp_cd2.setLabel(p.Cnd_dlv_grp_cd2_Label);
		p.Cnd_dlv_grp_nm2 = p.beansFactory.createTextField("Cnd.dlv_grp_nm2");
		p.Cnd_dlv_grp_cd3_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd3_Label");
		p.Cnd_dlv_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd3");
		p.Cnd_dlv_grp_cd3.setLabel(p.Cnd_dlv_grp_cd3_Label);
		p.Cnd_dlv_grp_nm3 = p.beansFactory.createTextField("Cnd.dlv_grp_nm3");
		p.Cnd_dlv_grp_cd4_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd4_Label");
		p.Cnd_dlv_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd4");
		p.Cnd_dlv_grp_cd4.setLabel(p.Cnd_dlv_grp_cd4_Label);
		p.Cnd_dlv_grp_nm4 = p.beansFactory.createTextField("Cnd.dlv_grp_nm4");
		p.Cnd_dlv_grp_cd5_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd5_Label");
		p.Cnd_dlv_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd5");
		p.Cnd_dlv_grp_cd5.setLabel(p.Cnd_dlv_grp_cd5_Label);
		p.Cnd_dlv_grp_nm5 = p.beansFactory.createTextField("Cnd.dlv_grp_nm5");
		p.Cnd_dlv_grp_cd6_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd6_Label");
		p.Cnd_dlv_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd6");
		p.Cnd_dlv_grp_cd6.setLabel(p.Cnd_dlv_grp_cd6_Label);
		p.Cnd_dlv_grp_nm6 = p.beansFactory.createTextField("Cnd.dlv_grp_nm6");
		p.Cnd_dlv_grp_cd7_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd7_Label");
		p.Cnd_dlv_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd7");
		p.Cnd_dlv_grp_cd7.setLabel(p.Cnd_dlv_grp_cd7_Label);
		p.Cnd_dlv_grp_nm7 = p.beansFactory.createTextField("Cnd.dlv_grp_nm7");
		p.Cnd_dlv_grp_cd8_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd8_Label");
		p.Cnd_dlv_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd8");
		p.Cnd_dlv_grp_cd8.setLabel(p.Cnd_dlv_grp_cd8_Label);
		p.Cnd_dlv_grp_nm8 = p.beansFactory.createTextField("Cnd.dlv_grp_nm8");
		p.Cnd_dlv_grp_cd9_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd9_Label");
		p.Cnd_dlv_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd9");
		p.Cnd_dlv_grp_cd9.setLabel(p.Cnd_dlv_grp_cd9_Label);
		p.Cnd_dlv_grp_nm9 = p.beansFactory.createTextField("Cnd.dlv_grp_nm9");
		p.Cnd_dlv_grp_cd10_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd10_Label");
		p.Cnd_dlv_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd10");
		p.Cnd_dlv_grp_cd10.setLabel(p.Cnd_dlv_grp_cd10_Label);
		p.Cnd_dlv_grp_nm10 = p.beansFactory.createTextField("Cnd.dlv_grp_nm10");
		p.Cnd_apl_no_Label = p.beansFactory.createLabel("Cnd.apl_no_Label");
		p.Cnd_apl_no = p.beansFactory.createTextField("Cnd.apl_no");
		p.Cnd_apl_no.setLabel(p.Cnd_apl_no_Label);
		p.Cnd_aprv_no_Label = p.beansFactory.createLabel("Cnd.aprv_no_Label");
		p.Cnd_aprv_no = p.beansFactory.createTextField("Cnd.aprv_no");
		p.Cnd_aprv_no.setLabel(p.Cnd_aprv_no_Label);
		p.Cnd_apl_dt_fr_Label = p.beansFactory.createLabel("Cnd.apl_dt_fr_Label");
		p.Cnd_apl_dt_fr = p.beansFactory.createDateField("Cnd.apl_dt_fr");
		p.Cnd_apl_dt_fr.setLabel(p.Cnd_apl_dt_fr_Label);
		p.Cnd_apl_dt_to_Label = p.beansFactory.createLabel("Cnd.apl_dt_to_Label");
		p.Cnd_apl_dt_to = p.beansFactory.createDateField("Cnd.apl_dt_to");
		p.Cnd_apl_dt_to.setLabel(p.Cnd_apl_dt_to_Label);
		p.Cnd_apl_usr_cd_Label = p.beansFactory.createLabel("Cnd.apl_usr_cd_Label");
		p.Cnd_apl_usr_cd = p.beansFactory.createTextField("Cnd.apl_usr_cd");
		p.Cnd_apl_usr_cd.setLabel(p.Cnd_apl_usr_cd_Label);
		p.Cnd_apl_usr_nm = p.beansFactory.createTextField("Cnd.apl_usr_nm");
		p.Cnd_apl_dpt_cd_Label = p.beansFactory.createLabel("Cnd.apl_dpt_cd_Label");
		p.Cnd_apl_dpt_cd = p.beansFactory.createTextField("Cnd.apl_dpt_cd");
		p.Cnd_apl_dpt_cd.setLabel(p.Cnd_apl_dpt_cd_Label);
		p.Cnd_apl_dpt_nm = p.beansFactory.createTextField("Cnd.apl_dpt_nm");
		p.Cnd_aprv_sts_typ_Label = p.beansFactory.createLabel("Cnd.aprv_sts_typ_Label");
		p.Cnd_aprv_sts_typ = p.beansFactory.createTextComboBox("Cnd.aprv_sts_typ");
		p.Cnd_aprv_sts_typ.setLabel(p.Cnd_aprv_sts_typ_Label);
		p.Cnd_aprv_sts_typ_nm = p.beansFactory.createTextField("Cnd.aprv_sts_typ_nm");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_srch_cmn = p.beansFactory.createButton("RPnl.srch_cmn");
		p.RPnl_srch_wg = p.beansFactory.createButton("RPnl.srch_wg");
	}

	/**
	 * [Bottom]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBottom(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.BottomPanel = p.beansFactory.createPanel("Bottom");
		// ブロックの項目の初期化
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_rev_rate_Label = p.beansFactory.createLabel("BulkSet.rev_rate_Label");
		p.BulkSet_rev_rate = p.beansFactory.createNumberField("BulkSet.rev_rate");
		p.BulkSet_rev_rate.setLabel(p.BulkSet_rev_rate_Label);
		p.BulkSet_rnd_typ_Label = p.beansFactory.createLabel("BulkSet.rnd_typ_Label");
		p.BulkSet_rnd_typ = p.beansFactory.createTextComboBox("BulkSet.rnd_typ");
		p.BulkSet_rnd_typ.setLabel(p.BulkSet_rnd_typ_Label);
		p.BulkSet_rnd_typ_nm = p.beansFactory.createTextField("BulkSet.rnd_typ_nm");
		p.BulkSet_rev_date_Label = p.beansFactory.createLabel("BulkSet.rev_date_Label");
		p.BulkSet_rev_date = p.beansFactory.createDateField("BulkSet.rev_date");
		p.BulkSet_rev_date.setLabel(p.BulkSet_rev_date_Label);
		p.BulkSet_rev_upri = p.beansFactory.createButton("BulkSet.rev_upri");
		p.BulkSet_st_dt_Label = p.beansFactory.createLabel("BulkSet.st_dt_Label");
		p.BulkSet_st_dt = p.beansFactory.createDateField("BulkSet.st_dt");
		p.BulkSet_st_dt.setLabel(p.BulkSet_st_dt_Label);
		p.BulkSet_end_dt_Label = p.beansFactory.createLabel("BulkSet.end_dt_Label");
		p.BulkSet_end_dt = p.beansFactory.createDateField("BulkSet.end_dt");
		p.BulkSet_end_dt.setLabel(p.BulkSet_end_dt_Label);
		p.BulkSet_set_dt = p.beansFactory.createButton("BulkSet.set_dt");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_wg_nm = p.beansFactory.createTableColumn("Dtl.wg_nm", MCColumnType.TEXT);
		p.columnDtl_itm_typ = p.beansFactory.createTableColumn("Dtl.itm_typ", MCColumnType.TEXT);
		p.columnDtl_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_sppl_cd = p.beansFactory.createTableColumn("Dtl.sppl_cd", MCColumnType.TEXT);
		p.columnDtl_sppl_nm = p.beansFactory.createTableColumn("Dtl.sppl_nm", MCColumnType.TEXT);
		p.columnDtl_maker_cd = p.beansFactory.createTableColumn("Dtl.maker_cd", MCColumnType.TEXT);
		p.columnDtl_maker_nm = p.beansFactory.createTableColumn("Dtl.maker_nm", MCColumnType.TEXT);
		p.columnDtl_unit_cd = p.beansFactory.createTableColumn("Dtl.unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_unit_nm = p.beansFactory.createTableColumn("Dtl.unit_nm", MCColumnType.TEXT);
		p.columnDtl_dec_place = p.beansFactory.createTableColumn("Dtl.dec_place", MCColumnType.NUMBER);
		p.columnDtl_cur_cd = p.beansFactory.createTableColumn("Dtl.cur_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_cur_nm = p.beansFactory.createTableColumn("Dtl.cur_nm", MCColumnType.TEXT);
		p.columnDtl_upri_dec_place = p.beansFactory.createTableColumn("Dtl.upri_dec_place", MCColumnType.NUMBER);
		p.columnDtl_proc_upri_typ = p.beansFactory.createTableColumn("Dtl.proc_upri_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_proc_upri_typ_nm = p.beansFactory.createTableColumn("Dtl.proc_upri_typ_nm", MCColumnType.TEXT);
		p.columnDtl_loc_cd = p.beansFactory.createTableColumn("Dtl.loc_cd", MCColumnType.TEXT);
		p.columnDtl_loc_nm = p.beansFactory.createTableColumn("Dtl.loc_nm", MCColumnType.TEXT);
		p.columnDtl_dlv_cd = p.beansFactory.createTableColumn("Dtl.dlv_cd", MCColumnType.TEXT);
		p.columnDtl_dlv_nm = p.beansFactory.createTableColumn("Dtl.dlv_nm", MCColumnType.TEXT);
		p.columnDtl_outsrc_upri_typ = p.beansFactory.createTableColumn("Dtl.outsrc_upri_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_outsrc_upri_typ_nm = p.beansFactory.createTableColumn("Dtl.outsrc_upri_typ_nm", MCColumnType.TEXT);
		p.columnDtl_purc_tax_cd = p.beansFactory.createTableColumn("Dtl.purc_tax_cd", MCColumnType.TEXT);
		p.columnDtl_purc_tax_nm = p.beansFactory.createTableColumn("Dtl.purc_tax_nm", MCColumnType.TEXT);
		p.columnDtl_interim_flg = p.beansFactory.createTableColumn("Dtl.interim_flg", MCColumnType.CHECK);
		p.columnDtl_std_wk_cost = p.beansFactory.createTableColumn("Dtl.std_wk_cost", MCColumnType.NUMBER);
		p.columnDtl_std_wk_cost_upri = p.beansFactory.createTableColumn("Dtl.std_wk_cost_upri", MCColumnType.NUMBER);
		p.columnDtl_not_cost_flg = p.beansFactory.createTableColumn("Dtl.not_cost_flg", MCColumnType.CHECK);
		p.columnDtl_memo1 = p.beansFactory.createTableColumn("Dtl.memo1", MCColumnType.TEXT);
		p.columnDtl_memo2 = p.beansFactory.createTableColumn("Dtl.memo2", MCColumnType.TEXT);
		p.columnDtl_memo3 = p.beansFactory.createTableColumn("Dtl.memo3", MCColumnType.TEXT);
		p.columnDtl_apl_no = p.beansFactory.createTableColumn("Dtl.apl_no", MCColumnType.TEXT);
		p.columnDtl_st_dt_bf = p.beansFactory.createTableColumn("Dtl.st_dt_bf", MCColumnType.DATE);
		p.columnDtl_apl_dt = p.beansFactory.createTableColumn("Dtl.apl_dt", MCColumnType.DATE);
		p.columnDtl_apl_usr_cd = p.beansFactory.createTableColumn("Dtl.apl_usr_cd", MCColumnType.TEXT);
		p.columnDtl_apl_usr_nm = p.beansFactory.createTableColumn("Dtl.apl_usr_nm", MCColumnType.TEXT);
		p.columnDtl_apl_dpt_cd = p.beansFactory.createTableColumn("Dtl.apl_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_apl_dpt_nm = p.beansFactory.createTableColumn("Dtl.apl_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_ref_flg = p.beansFactory.createTableColumn("Dtl.ref_flg", MCColumnType.CHECK);
		p.columnDtl_mst_apl_memo = p.beansFactory.createTableColumn("Dtl.mst_apl_memo", MCColumnType.TEXT);
		p.columnDtl_aprv_no = p.beansFactory.createTableColumn("Dtl.aprv_no", MCColumnType.TEXT);
		p.columnDtl_aprv_sts_typ = p.beansFactory.createTableColumn("Dtl.aprv_sts_typ", MCColumnType.TEXT);
		p.columnDtl_aprv_sts_typ_nm = p.beansFactory.createTableColumn("Dtl.aprv_sts_typ_nm", MCColumnType.TEXT);
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
	 * [Dtl2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl2(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.Dtl2Panel = p.beansFactory.createPanel("Dtl2");
		p.Dtl2TitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Dtl2_apl_dt_Label = p.beansFactory.createLabel("Dtl2.apl_dt_Label");
		p.Dtl2_apl_dt = p.beansFactory.createDateField("Dtl2.apl_dt");
		p.Dtl2_apl_dt.setLabel(p.Dtl2_apl_dt_Label);
		p.Dtl2_apl_no_Label = p.beansFactory.createLabel("Dtl2.apl_no_Label");
		p.Dtl2_apl_no = p.beansFactory.createTextField("Dtl2.apl_no");
		p.Dtl2_apl_no.setLabel(p.Dtl2_apl_no_Label);
		p.Dtl2_aprv_no_Label = p.beansFactory.createLabel("Dtl2.aprv_no_Label");
		p.Dtl2_aprv_no = p.beansFactory.createTextField("Dtl2.aprv_no");
		p.Dtl2_aprv_no.setLabel(p.Dtl2_aprv_no_Label);
		p.Dtl2_mst_apl_memo_Label = p.beansFactory.createLabel("Dtl2.mst_apl_memo_Label");
		p.Dtl2_mst_apl_memo = p.beansFactory.createTextField("Dtl2.mst_apl_memo");
		p.Dtl2_mst_apl_memo.setLabel(p.Dtl2_mst_apl_memo_Label);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_correct_dup_dt = p.beansFactory.createButton("DtlBtn.correct_dup_dt");
		p.DtlBtn_select_all = p.beansFactory.createButton("DtlBtn.select_all", "no_border");
		p.DtlBtn_deselect_all = p.beansFactory.createButton("DtlBtn.deselect_all", "no_border");
		p.DtlBtn_radd = p.beansFactory.createButton("DtlBtn.radd", "no_border");
		p.DtlBtn_rdel = p.beansFactory.createButton("DtlBtn.rdel", "no_border");
		p.DtlBtn_rcopy = p.beansFactory.createButton("DtlBtn.rcopy", "no_border");
		p.DtlBtn_upd_cmn = p.beansFactory.createButton("DtlBtn.upd_cmn", "upd");
		p.DtlBtn_upd_wg = p.beansFactory.createButton("DtlBtn.upd_wg", "upd");
		p.DtlBtn_upd_apl_cmn = p.beansFactory.createButton("DtlBtn.upd_apl_cmn", "upd");
		p.DtlBtn_upd_apl_wg = p.beansFactory.createButton("DtlBtn.upd_apl_wg", "upd");
		p.DtlBtn_del_cmn = p.beansFactory.createButton("DtlBtn.del_cmn", "del");
		p.DtlBtn_del_wg = p.beansFactory.createButton("DtlBtn.del_wg", "del");
		p.DtlBtn_del_apl_cmn = p.beansFactory.createButton("DtlBtn.del_apl_cmn", "del");
		p.DtlBtn_del_apl_wg = p.beansFactory.createButton("DtlBtn.del_apl_wg", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABSP_ProcUpriReg p) {
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
	protected static void jbInitRegTarget(MABSP_ProcUpriReg p) {
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
	protected static void jbInitTop(MABSP_ProcUpriReg p) {
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
	protected static void jbInitFold(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndTabPanel, null);
		p.FoldPanel.setLastBeans(p.CndTabPanel);
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCndTab(MABSP_ProcUpriReg p) {
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
		p.Tab4Panel.setNextBeans(p.Tab5Panel);
		p.CndTabTab.add(p.Tab5Panel, "CndTab.tab5");
		p.Tab5Panel.setNextBeans(p.Tab6Panel);
		p.CndTabTab.add(p.Tab6Panel, "CndTab.tab6");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.Tab3Panel.setNextBeans(p.Tab4Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Tab4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab4(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.Tab4Panel.setNextBeans(p.Tab5Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Tab5]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab5(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.Tab5Panel.setNextBeans(p.Tab6Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Tab6]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab6(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABSP_ProcUpriReg p) {
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
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_APL);
		p.Cnd_ope_APL.setActionCommand("5");
		p.Cnd_ope_Group.add(p.Cnd_ope_APL);
		p.ScreenOpePanel.add(p.Cnd_ope_APL);
		p.Cnd_ope_APL.setNextBeans(p.Cnd_ope_MOD_APL);
		p.Cnd_ope_MOD_APL.setActionCommand("6");
		p.Cnd_ope_Group.add(p.Cnd_ope_MOD_APL);
		p.ScreenOpePanel.add(p.Cnd_ope_MOD_APL);
		p.Cnd_ope_MOD_APL.setNextBeans(p.Cnd_ope_DEL_APL);
		p.Cnd_ope_DEL_APL.setActionCommand("7");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL_APL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL_APL);
		p.Cnd_ope_DEL_APL.setNextBeans(p.Cnd_ope_REF_APL);
		p.Cnd_ope_REF_APL.setActionCommand("8");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF_APL);
		p.ScreenOpePanel.add(p.Cnd_ope_REF_APL);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.ope_META);
		p.RegTargetPanel.add(p.Cnd_cmn_flg);
		p.RegTargetPanel.setLastBeans(p.Cnd_cmn_flg);
		p.Cnd_cmn_flg.setNextBeans(p.Cnd_wg_flg);
		p.Cnd_cmn_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.cmn_flg_META);
		p.RegTargetPanel.add(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.wg_flg_META);
		p.Tab1Panel.add(p.Cnd_dt_PPanel);
		p.Tab1Panel.setLastBeans(p.Cnd_dt_PPanel);
		p.Cnd_dt_PPanel.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.Tab1Panel.add(p.Cnd_wg_cd_Label);
		p.Tab1Panel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.wg_cd_META);
		p.Tab1Panel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Tab1Panel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Tab1Panel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_unit_cd);
		p.Cnd_unit_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_unit_cd, true);
		p.Cnd_unit_cd.setLinkBeans(p.Cnd_unit_nm);
		p.Tab1Panel.add(p.Cnd_unit_cd_Label);
		p.Tab1Panel.add(p.Cnd_unit_cd);
		p.Cnd_unit_cd.setNextBeans(p.Cnd_unit_nm);
		p.Cnd_unit_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.unit_cd_META);
		p.Tab1Panel.add(p.Cnd_unit_nm);
		p.Cnd_unit_nm.setNextBeans(p.Cnd_cur_cd);
		p.Cnd_unit_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.unit_nm_META);
		p.setPluralValueEnable(p.Cnd_unit_nm, true);
		p.Cnd_cur_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cur_cd, true);
		p.Cnd_cur_cd.setLinkBeans(p.Cnd_cur_nm);
		p.Tab1Panel.add(p.Cnd_cur_cd_Label);
		p.Tab1Panel.add(p.Cnd_cur_cd);
		p.Cnd_cur_cd.setNextBeans(p.Cnd_cur_nm);
		p.Cnd_cur_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.cur_cd_META);
		p.Tab1Panel.add(p.Cnd_cur_nm);
		p.Cnd_cur_nm.setNextBeans(p.Cnd_proc_upri_typ);
		p.Cnd_cur_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.cur_nm_META);
		p.setPluralValueEnable(p.Cnd_cur_nm, true);
		p.Cnd_proc_upri_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_proc_upri_typ, true);
		p.Cnd_proc_upri_typ.setLinkBeans(p.Cnd_proc_upri_typ_nm);
		p.Tab1Panel.add(p.Cnd_proc_upri_typ_Label);
		p.Tab1Panel.add(p.Cnd_proc_upri_typ);
		p.Cnd_proc_upri_typ.setNextBeans(p.Cnd_proc_upri_typ_nm);
		p.Cnd_proc_upri_typ.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.proc_upri_typ_META);
		p.Tab1Panel.add(p.Cnd_proc_upri_typ_nm);
		p.Cnd_proc_upri_typ_nm.setNextBeans(p.Cnd_off_interim_flg);
		p.Cnd_proc_upri_typ_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.proc_upri_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_proc_upri_typ_nm, true);
		p.Tab1Panel.add(p.Cnd_interim_flg_lab);
		p.Tab1Panel.add(p.Cnd_off_interim_flg);
		p.Cnd_off_interim_flg.setNextBeans(p.Cnd_on_interim_flg);
		p.Cnd_off_interim_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.off_interim_flg_META);
		p.Tab1Panel.add(p.Cnd_on_interim_flg);
		p.Cnd_on_interim_flg.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_on_interim_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.on_interim_flg_META);
		p.Tab1Panel.add(p.Cnd_sppl_cd_Label);
		p.Tab1Panel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.Tab1Panel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_maker_cd);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
		p.Tab1Panel.add(p.Cnd_maker_cd_Label);
		p.Tab1Panel.add(p.Cnd_maker_cd);
		p.Cnd_maker_cd.setNextBeans(p.Cnd_maker_nm);
		p.Cnd_maker_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_cd_META);
		p.Cnd_maker_cd.addLinkBeans(p.Cnd_maker_nm);
		p.Cnd_maker_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_maker_cd, true);
		p.Tab1Panel.add(p.Cnd_maker_nm);
		p.Cnd_maker_nm.setNextBeans(p.Cnd_sppl_cntry_cd);
		p.Cnd_maker_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_nm_META);
		p.setPluralValueEnable(p.Cnd_maker_nm, true);
		p.Cnd_sppl_cntry_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cntry_cd, true);
		p.Cnd_sppl_cntry_cd.setLinkBeans(p.Cnd_sppl_cntry_nm);
		p.Tab1Panel.add(p.Cnd_sppl_cntry_cd_Label);
		p.Tab1Panel.add(p.Cnd_sppl_cntry_cd);
		p.Cnd_sppl_cntry_cd.setNextBeans(p.Cnd_sppl_cntry_nm);
		p.Cnd_sppl_cntry_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_cntry_cd_META);
		p.Tab1Panel.add(p.Cnd_sppl_cntry_nm);
		p.Cnd_sppl_cntry_nm.setNextBeans(p.Cnd_sppl_foreign_flg);
		p.Cnd_sppl_cntry_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_cntry_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_cntry_nm, true);
		p.Tab1Panel.add(p.Cnd_sppl_foreign_flg);
		p.Cnd_sppl_foreign_flg.setNextBeans(p.Cnd_sppl_area_cd);
		p.Cnd_sppl_foreign_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_foreign_flg_META);
		p.Cnd_sppl_area_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_area_cd, true);
		p.Cnd_sppl_area_cd.setLinkBeans(p.Cnd_sppl_area_nm);
		p.Tab1Panel.add(p.Cnd_sppl_area_cd_Label);
		p.Tab1Panel.add(p.Cnd_sppl_area_cd);
		p.Cnd_sppl_area_cd.setNextBeans(p.Cnd_sppl_area_nm);
		p.Cnd_sppl_area_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_area_cd_META);
		p.Tab1Panel.add(p.Cnd_sppl_area_nm);
		p.Cnd_sppl_area_nm.setNextBeans(p.Cnd_dlv_cd);
		p.Cnd_sppl_area_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_area_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_area_nm, true);
		p.Tab1Panel.add(p.Cnd_dlv_cd_Label);
		p.Tab1Panel.add(p.Cnd_dlv_cd);
		p.Cnd_dlv_cd.setNextBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_cd_META);
		p.Cnd_dlv_cd.addLinkBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_cd, true);
		p.Tab1Panel.add(p.Cnd_dlv_nm);
		p.Cnd_dlv_nm.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_dlv_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_nm, true);
		p.Tab1Panel.add(p.Cnd_loc_cd_Label);
		p.Tab1Panel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.Tab1Panel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Tab1Panel.add(p.Cnd_memo1_Label);
		p.Tab1Panel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.Tab1Panel.add(p.Cnd_memo2_Label);
		p.Tab1Panel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.Tab1Panel.add(p.Cnd_memo3_Label);
		p.Tab1Panel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.Tab1Panel.add(p.Cnd_del_flg_lab);
		p.Tab1Panel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.off_del_flg_META);
		p.Tab1Panel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.on_del_flg_META);
		p.Cnd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd1, true);
		p.Cnd_itm_grp_cd1.setLinkBeans(p.Cnd_itm_grp_nm1);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd1_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd1);
		p.Tab2Panel.setLastBeans(p.Cnd_itm_grp_cd1);
		p.Cnd_itm_grp_cd1.setNextBeans(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.itm_grp_cd1_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_nm1.setNextBeans(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm1, true);
		p.Cnd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd2, true);
		p.Cnd_itm_grp_cd2.setLinkBeans(p.Cnd_itm_grp_nm2);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd2_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_cd2.setNextBeans(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.itm_grp_cd2_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_nm2.setNextBeans(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm2, true);
		p.Cnd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd3, true);
		p.Cnd_itm_grp_cd3.setLinkBeans(p.Cnd_itm_grp_nm3);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd3_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_cd3.setNextBeans(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.itm_grp_cd3_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_nm3.setNextBeans(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm3, true);
		p.Cnd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd4, true);
		p.Cnd_itm_grp_cd4.setLinkBeans(p.Cnd_itm_grp_nm4);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd4_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_cd4.setNextBeans(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.itm_grp_cd4_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_nm4.setNextBeans(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm4, true);
		p.Cnd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd5, true);
		p.Cnd_itm_grp_cd5.setLinkBeans(p.Cnd_itm_grp_nm5);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd5_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_cd5.setNextBeans(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.itm_grp_cd5_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_nm5.setNextBeans(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm5, true);
		p.Cnd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd6, true);
		p.Cnd_itm_grp_cd6.setLinkBeans(p.Cnd_itm_grp_nm6);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd6_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_cd6.setNextBeans(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.itm_grp_cd6_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_nm6.setNextBeans(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm6, true);
		p.Cnd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd7, true);
		p.Cnd_itm_grp_cd7.setLinkBeans(p.Cnd_itm_grp_nm7);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd7_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_cd7.setNextBeans(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.itm_grp_cd7_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_nm7.setNextBeans(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm7, true);
		p.Cnd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd8, true);
		p.Cnd_itm_grp_cd8.setLinkBeans(p.Cnd_itm_grp_nm8);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd8_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_cd8.setNextBeans(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.itm_grp_cd8_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_nm8.setNextBeans(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm8, true);
		p.Cnd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd9, true);
		p.Cnd_itm_grp_cd9.setLinkBeans(p.Cnd_itm_grp_nm9);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd9_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_cd9.setNextBeans(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.itm_grp_cd9_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_nm9.setNextBeans(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm9, true);
		p.Cnd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd10, true);
		p.Cnd_itm_grp_cd10.setLinkBeans(p.Cnd_itm_grp_nm10);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd10_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_cd10.setNextBeans(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.itm_grp_cd10_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm10, true);
		p.Cnd_sppl_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd1, true);
		p.Cnd_sppl_grp_cd1.setLinkBeans(p.Cnd_sppl_grp_nm1);
		p.Tab3Panel.add(p.Cnd_sppl_grp_cd1_Label);
		p.Tab3Panel.add(p.Cnd_sppl_grp_cd1);
		p.Tab3Panel.setLastBeans(p.Cnd_sppl_grp_cd1);
		p.Cnd_sppl_grp_cd1.setNextBeans(p.Cnd_sppl_grp_nm1);
		p.Cnd_sppl_grp_cd1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_grp_cd1_META);
		p.Tab3Panel.add(p.Cnd_sppl_grp_nm1);
		p.Cnd_sppl_grp_nm1.setNextBeans(p.Cnd_sppl_grp_cd2);
		p.Cnd_sppl_grp_nm1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm1, true);
		p.Cnd_sppl_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd2, true);
		p.Cnd_sppl_grp_cd2.setLinkBeans(p.Cnd_sppl_grp_nm2);
		p.Tab3Panel.add(p.Cnd_sppl_grp_cd2_Label);
		p.Tab3Panel.add(p.Cnd_sppl_grp_cd2);
		p.Cnd_sppl_grp_cd2.setNextBeans(p.Cnd_sppl_grp_nm2);
		p.Cnd_sppl_grp_cd2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_grp_cd2_META);
		p.Tab3Panel.add(p.Cnd_sppl_grp_nm2);
		p.Cnd_sppl_grp_nm2.setNextBeans(p.Cnd_sppl_grp_cd3);
		p.Cnd_sppl_grp_nm2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm2, true);
		p.Cnd_sppl_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd3, true);
		p.Cnd_sppl_grp_cd3.setLinkBeans(p.Cnd_sppl_grp_nm3);
		p.Tab3Panel.add(p.Cnd_sppl_grp_cd3_Label);
		p.Tab3Panel.add(p.Cnd_sppl_grp_cd3);
		p.Cnd_sppl_grp_cd3.setNextBeans(p.Cnd_sppl_grp_nm3);
		p.Cnd_sppl_grp_cd3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_grp_cd3_META);
		p.Tab3Panel.add(p.Cnd_sppl_grp_nm3);
		p.Cnd_sppl_grp_nm3.setNextBeans(p.Cnd_sppl_grp_cd4);
		p.Cnd_sppl_grp_nm3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm3, true);
		p.Cnd_sppl_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd4, true);
		p.Cnd_sppl_grp_cd4.setLinkBeans(p.Cnd_sppl_grp_nm4);
		p.Tab3Panel.add(p.Cnd_sppl_grp_cd4_Label);
		p.Tab3Panel.add(p.Cnd_sppl_grp_cd4);
		p.Cnd_sppl_grp_cd4.setNextBeans(p.Cnd_sppl_grp_nm4);
		p.Cnd_sppl_grp_cd4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_grp_cd4_META);
		p.Tab3Panel.add(p.Cnd_sppl_grp_nm4);
		p.Cnd_sppl_grp_nm4.setNextBeans(p.Cnd_sppl_grp_cd5);
		p.Cnd_sppl_grp_nm4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm4, true);
		p.Cnd_sppl_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd5, true);
		p.Cnd_sppl_grp_cd5.setLinkBeans(p.Cnd_sppl_grp_nm5);
		p.Tab3Panel.add(p.Cnd_sppl_grp_cd5_Label);
		p.Tab3Panel.add(p.Cnd_sppl_grp_cd5);
		p.Cnd_sppl_grp_cd5.setNextBeans(p.Cnd_sppl_grp_nm5);
		p.Cnd_sppl_grp_cd5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_grp_cd5_META);
		p.Tab3Panel.add(p.Cnd_sppl_grp_nm5);
		p.Cnd_sppl_grp_nm5.setNextBeans(p.Cnd_sppl_grp_cd6);
		p.Cnd_sppl_grp_nm5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm5, true);
		p.Cnd_sppl_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd6, true);
		p.Cnd_sppl_grp_cd6.setLinkBeans(p.Cnd_sppl_grp_nm6);
		p.Tab3Panel.add(p.Cnd_sppl_grp_cd6_Label);
		p.Tab3Panel.add(p.Cnd_sppl_grp_cd6);
		p.Cnd_sppl_grp_cd6.setNextBeans(p.Cnd_sppl_grp_nm6);
		p.Cnd_sppl_grp_cd6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_grp_cd6_META);
		p.Tab3Panel.add(p.Cnd_sppl_grp_nm6);
		p.Cnd_sppl_grp_nm6.setNextBeans(p.Cnd_sppl_grp_cd7);
		p.Cnd_sppl_grp_nm6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm6, true);
		p.Cnd_sppl_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd7, true);
		p.Cnd_sppl_grp_cd7.setLinkBeans(p.Cnd_sppl_grp_nm7);
		p.Tab3Panel.add(p.Cnd_sppl_grp_cd7_Label);
		p.Tab3Panel.add(p.Cnd_sppl_grp_cd7);
		p.Cnd_sppl_grp_cd7.setNextBeans(p.Cnd_sppl_grp_nm7);
		p.Cnd_sppl_grp_cd7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_grp_cd7_META);
		p.Tab3Panel.add(p.Cnd_sppl_grp_nm7);
		p.Cnd_sppl_grp_nm7.setNextBeans(p.Cnd_sppl_grp_cd8);
		p.Cnd_sppl_grp_nm7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm7, true);
		p.Cnd_sppl_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd8, true);
		p.Cnd_sppl_grp_cd8.setLinkBeans(p.Cnd_sppl_grp_nm8);
		p.Tab3Panel.add(p.Cnd_sppl_grp_cd8_Label);
		p.Tab3Panel.add(p.Cnd_sppl_grp_cd8);
		p.Cnd_sppl_grp_cd8.setNextBeans(p.Cnd_sppl_grp_nm8);
		p.Cnd_sppl_grp_cd8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_grp_cd8_META);
		p.Tab3Panel.add(p.Cnd_sppl_grp_nm8);
		p.Cnd_sppl_grp_nm8.setNextBeans(p.Cnd_sppl_grp_cd9);
		p.Cnd_sppl_grp_nm8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm8, true);
		p.Cnd_sppl_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd9, true);
		p.Cnd_sppl_grp_cd9.setLinkBeans(p.Cnd_sppl_grp_nm9);
		p.Tab3Panel.add(p.Cnd_sppl_grp_cd9_Label);
		p.Tab3Panel.add(p.Cnd_sppl_grp_cd9);
		p.Cnd_sppl_grp_cd9.setNextBeans(p.Cnd_sppl_grp_nm9);
		p.Cnd_sppl_grp_cd9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_grp_cd9_META);
		p.Tab3Panel.add(p.Cnd_sppl_grp_nm9);
		p.Cnd_sppl_grp_nm9.setNextBeans(p.Cnd_sppl_grp_cd10);
		p.Cnd_sppl_grp_nm9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm9, true);
		p.Cnd_sppl_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_grp_cd10, true);
		p.Cnd_sppl_grp_cd10.setLinkBeans(p.Cnd_sppl_grp_nm10);
		p.Tab3Panel.add(p.Cnd_sppl_grp_cd10_Label);
		p.Tab3Panel.add(p.Cnd_sppl_grp_cd10);
		p.Cnd_sppl_grp_cd10.setNextBeans(p.Cnd_sppl_grp_nm10);
		p.Cnd_sppl_grp_cd10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_grp_cd10_META);
		p.Tab3Panel.add(p.Cnd_sppl_grp_nm10);
		p.Cnd_sppl_grp_nm10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.sppl_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_sppl_grp_nm10, true);
		p.Cnd_maker_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_maker_grp_cd1, true);
		p.Cnd_maker_grp_cd1.setLinkBeans(p.Cnd_maker_grp_nm1);
		p.Tab4Panel.add(p.Cnd_maker_grp_cd1_Label);
		p.Tab4Panel.add(p.Cnd_maker_grp_cd1);
		p.Tab4Panel.setLastBeans(p.Cnd_maker_grp_cd1);
		p.Cnd_maker_grp_cd1.setNextBeans(p.Cnd_maker_grp_nm1);
		p.Cnd_maker_grp_cd1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_grp_cd1_META);
		p.Tab4Panel.add(p.Cnd_maker_grp_nm1);
		p.Cnd_maker_grp_nm1.setNextBeans(p.Cnd_maker_grp_cd2);
		p.Cnd_maker_grp_nm1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_maker_grp_nm1, true);
		p.Cnd_maker_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_maker_grp_cd2, true);
		p.Cnd_maker_grp_cd2.setLinkBeans(p.Cnd_maker_grp_nm2);
		p.Tab4Panel.add(p.Cnd_maker_grp_cd2_Label);
		p.Tab4Panel.add(p.Cnd_maker_grp_cd2);
		p.Cnd_maker_grp_cd2.setNextBeans(p.Cnd_maker_grp_nm2);
		p.Cnd_maker_grp_cd2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_grp_cd2_META);
		p.Tab4Panel.add(p.Cnd_maker_grp_nm2);
		p.Cnd_maker_grp_nm2.setNextBeans(p.Cnd_maker_grp_cd3);
		p.Cnd_maker_grp_nm2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_maker_grp_nm2, true);
		p.Cnd_maker_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_maker_grp_cd3, true);
		p.Cnd_maker_grp_cd3.setLinkBeans(p.Cnd_maker_grp_nm3);
		p.Tab4Panel.add(p.Cnd_maker_grp_cd3_Label);
		p.Tab4Panel.add(p.Cnd_maker_grp_cd3);
		p.Cnd_maker_grp_cd3.setNextBeans(p.Cnd_maker_grp_nm3);
		p.Cnd_maker_grp_cd3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_grp_cd3_META);
		p.Tab4Panel.add(p.Cnd_maker_grp_nm3);
		p.Cnd_maker_grp_nm3.setNextBeans(p.Cnd_maker_grp_cd4);
		p.Cnd_maker_grp_nm3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_maker_grp_nm3, true);
		p.Cnd_maker_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_maker_grp_cd4, true);
		p.Cnd_maker_grp_cd4.setLinkBeans(p.Cnd_maker_grp_nm4);
		p.Tab4Panel.add(p.Cnd_maker_grp_cd4_Label);
		p.Tab4Panel.add(p.Cnd_maker_grp_cd4);
		p.Cnd_maker_grp_cd4.setNextBeans(p.Cnd_maker_grp_nm4);
		p.Cnd_maker_grp_cd4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_grp_cd4_META);
		p.Tab4Panel.add(p.Cnd_maker_grp_nm4);
		p.Cnd_maker_grp_nm4.setNextBeans(p.Cnd_maker_grp_cd5);
		p.Cnd_maker_grp_nm4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_maker_grp_nm4, true);
		p.Cnd_maker_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_maker_grp_cd5, true);
		p.Cnd_maker_grp_cd5.setLinkBeans(p.Cnd_maker_grp_nm5);
		p.Tab4Panel.add(p.Cnd_maker_grp_cd5_Label);
		p.Tab4Panel.add(p.Cnd_maker_grp_cd5);
		p.Cnd_maker_grp_cd5.setNextBeans(p.Cnd_maker_grp_nm5);
		p.Cnd_maker_grp_cd5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_grp_cd5_META);
		p.Tab4Panel.add(p.Cnd_maker_grp_nm5);
		p.Cnd_maker_grp_nm5.setNextBeans(p.Cnd_maker_grp_cd6);
		p.Cnd_maker_grp_nm5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_maker_grp_nm5, true);
		p.Cnd_maker_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_maker_grp_cd6, true);
		p.Cnd_maker_grp_cd6.setLinkBeans(p.Cnd_maker_grp_nm6);
		p.Tab4Panel.add(p.Cnd_maker_grp_cd6_Label);
		p.Tab4Panel.add(p.Cnd_maker_grp_cd6);
		p.Cnd_maker_grp_cd6.setNextBeans(p.Cnd_maker_grp_nm6);
		p.Cnd_maker_grp_cd6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_grp_cd6_META);
		p.Tab4Panel.add(p.Cnd_maker_grp_nm6);
		p.Cnd_maker_grp_nm6.setNextBeans(p.Cnd_maker_grp_cd7);
		p.Cnd_maker_grp_nm6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_maker_grp_nm6, true);
		p.Cnd_maker_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_maker_grp_cd7, true);
		p.Cnd_maker_grp_cd7.setLinkBeans(p.Cnd_maker_grp_nm7);
		p.Tab4Panel.add(p.Cnd_maker_grp_cd7_Label);
		p.Tab4Panel.add(p.Cnd_maker_grp_cd7);
		p.Cnd_maker_grp_cd7.setNextBeans(p.Cnd_maker_grp_nm7);
		p.Cnd_maker_grp_cd7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_grp_cd7_META);
		p.Tab4Panel.add(p.Cnd_maker_grp_nm7);
		p.Cnd_maker_grp_nm7.setNextBeans(p.Cnd_maker_grp_cd8);
		p.Cnd_maker_grp_nm7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_maker_grp_nm7, true);
		p.Cnd_maker_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_maker_grp_cd8, true);
		p.Cnd_maker_grp_cd8.setLinkBeans(p.Cnd_maker_grp_nm8);
		p.Tab4Panel.add(p.Cnd_maker_grp_cd8_Label);
		p.Tab4Panel.add(p.Cnd_maker_grp_cd8);
		p.Cnd_maker_grp_cd8.setNextBeans(p.Cnd_maker_grp_nm8);
		p.Cnd_maker_grp_cd8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_grp_cd8_META);
		p.Tab4Panel.add(p.Cnd_maker_grp_nm8);
		p.Cnd_maker_grp_nm8.setNextBeans(p.Cnd_maker_grp_cd9);
		p.Cnd_maker_grp_nm8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_maker_grp_nm8, true);
		p.Cnd_maker_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_maker_grp_cd9, true);
		p.Cnd_maker_grp_cd9.setLinkBeans(p.Cnd_maker_grp_nm9);
		p.Tab4Panel.add(p.Cnd_maker_grp_cd9_Label);
		p.Tab4Panel.add(p.Cnd_maker_grp_cd9);
		p.Cnd_maker_grp_cd9.setNextBeans(p.Cnd_maker_grp_nm9);
		p.Cnd_maker_grp_cd9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_grp_cd9_META);
		p.Tab4Panel.add(p.Cnd_maker_grp_nm9);
		p.Cnd_maker_grp_nm9.setNextBeans(p.Cnd_maker_grp_cd10);
		p.Cnd_maker_grp_nm9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_maker_grp_nm9, true);
		p.Cnd_maker_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_maker_grp_cd10, true);
		p.Cnd_maker_grp_cd10.setLinkBeans(p.Cnd_maker_grp_nm10);
		p.Tab4Panel.add(p.Cnd_maker_grp_cd10_Label);
		p.Tab4Panel.add(p.Cnd_maker_grp_cd10);
		p.Cnd_maker_grp_cd10.setNextBeans(p.Cnd_maker_grp_nm10);
		p.Cnd_maker_grp_cd10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_grp_cd10_META);
		p.Tab4Panel.add(p.Cnd_maker_grp_nm10);
		p.Cnd_maker_grp_nm10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.maker_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_maker_grp_nm10, true);
		p.Cnd_dlv_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd1, true);
		p.Cnd_dlv_grp_cd1.setLinkBeans(p.Cnd_dlv_grp_nm1);
		p.Tab5Panel.add(p.Cnd_dlv_grp_cd1_Label);
		p.Tab5Panel.add(p.Cnd_dlv_grp_cd1);
		p.Tab5Panel.setLastBeans(p.Cnd_dlv_grp_cd1);
		p.Cnd_dlv_grp_cd1.setNextBeans(p.Cnd_dlv_grp_nm1);
		p.Cnd_dlv_grp_cd1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_grp_cd1_META);
		p.Tab5Panel.add(p.Cnd_dlv_grp_nm1);
		p.Cnd_dlv_grp_nm1.setNextBeans(p.Cnd_dlv_grp_cd2);
		p.Cnd_dlv_grp_nm1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm1, true);
		p.Cnd_dlv_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd2, true);
		p.Cnd_dlv_grp_cd2.setLinkBeans(p.Cnd_dlv_grp_nm2);
		p.Tab5Panel.add(p.Cnd_dlv_grp_cd2_Label);
		p.Tab5Panel.add(p.Cnd_dlv_grp_cd2);
		p.Cnd_dlv_grp_cd2.setNextBeans(p.Cnd_dlv_grp_nm2);
		p.Cnd_dlv_grp_cd2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_grp_cd2_META);
		p.Tab5Panel.add(p.Cnd_dlv_grp_nm2);
		p.Cnd_dlv_grp_nm2.setNextBeans(p.Cnd_dlv_grp_cd3);
		p.Cnd_dlv_grp_nm2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm2, true);
		p.Cnd_dlv_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd3, true);
		p.Cnd_dlv_grp_cd3.setLinkBeans(p.Cnd_dlv_grp_nm3);
		p.Tab5Panel.add(p.Cnd_dlv_grp_cd3_Label);
		p.Tab5Panel.add(p.Cnd_dlv_grp_cd3);
		p.Cnd_dlv_grp_cd3.setNextBeans(p.Cnd_dlv_grp_nm3);
		p.Cnd_dlv_grp_cd3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_grp_cd3_META);
		p.Tab5Panel.add(p.Cnd_dlv_grp_nm3);
		p.Cnd_dlv_grp_nm3.setNextBeans(p.Cnd_dlv_grp_cd4);
		p.Cnd_dlv_grp_nm3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm3, true);
		p.Cnd_dlv_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd4, true);
		p.Cnd_dlv_grp_cd4.setLinkBeans(p.Cnd_dlv_grp_nm4);
		p.Tab5Panel.add(p.Cnd_dlv_grp_cd4_Label);
		p.Tab5Panel.add(p.Cnd_dlv_grp_cd4);
		p.Cnd_dlv_grp_cd4.setNextBeans(p.Cnd_dlv_grp_nm4);
		p.Cnd_dlv_grp_cd4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_grp_cd4_META);
		p.Tab5Panel.add(p.Cnd_dlv_grp_nm4);
		p.Cnd_dlv_grp_nm4.setNextBeans(p.Cnd_dlv_grp_cd5);
		p.Cnd_dlv_grp_nm4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm4, true);
		p.Cnd_dlv_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd5, true);
		p.Cnd_dlv_grp_cd5.setLinkBeans(p.Cnd_dlv_grp_nm5);
		p.Tab5Panel.add(p.Cnd_dlv_grp_cd5_Label);
		p.Tab5Panel.add(p.Cnd_dlv_grp_cd5);
		p.Cnd_dlv_grp_cd5.setNextBeans(p.Cnd_dlv_grp_nm5);
		p.Cnd_dlv_grp_cd5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_grp_cd5_META);
		p.Tab5Panel.add(p.Cnd_dlv_grp_nm5);
		p.Cnd_dlv_grp_nm5.setNextBeans(p.Cnd_dlv_grp_cd6);
		p.Cnd_dlv_grp_nm5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm5, true);
		p.Cnd_dlv_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd6, true);
		p.Cnd_dlv_grp_cd6.setLinkBeans(p.Cnd_dlv_grp_nm6);
		p.Tab5Panel.add(p.Cnd_dlv_grp_cd6_Label);
		p.Tab5Panel.add(p.Cnd_dlv_grp_cd6);
		p.Cnd_dlv_grp_cd6.setNextBeans(p.Cnd_dlv_grp_nm6);
		p.Cnd_dlv_grp_cd6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_grp_cd6_META);
		p.Tab5Panel.add(p.Cnd_dlv_grp_nm6);
		p.Cnd_dlv_grp_nm6.setNextBeans(p.Cnd_dlv_grp_cd7);
		p.Cnd_dlv_grp_nm6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm6, true);
		p.Cnd_dlv_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd7, true);
		p.Cnd_dlv_grp_cd7.setLinkBeans(p.Cnd_dlv_grp_nm7);
		p.Tab5Panel.add(p.Cnd_dlv_grp_cd7_Label);
		p.Tab5Panel.add(p.Cnd_dlv_grp_cd7);
		p.Cnd_dlv_grp_cd7.setNextBeans(p.Cnd_dlv_grp_nm7);
		p.Cnd_dlv_grp_cd7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_grp_cd7_META);
		p.Tab5Panel.add(p.Cnd_dlv_grp_nm7);
		p.Cnd_dlv_grp_nm7.setNextBeans(p.Cnd_dlv_grp_cd8);
		p.Cnd_dlv_grp_nm7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm7, true);
		p.Cnd_dlv_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd8, true);
		p.Cnd_dlv_grp_cd8.setLinkBeans(p.Cnd_dlv_grp_nm8);
		p.Tab5Panel.add(p.Cnd_dlv_grp_cd8_Label);
		p.Tab5Panel.add(p.Cnd_dlv_grp_cd8);
		p.Cnd_dlv_grp_cd8.setNextBeans(p.Cnd_dlv_grp_nm8);
		p.Cnd_dlv_grp_cd8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_grp_cd8_META);
		p.Tab5Panel.add(p.Cnd_dlv_grp_nm8);
		p.Cnd_dlv_grp_nm8.setNextBeans(p.Cnd_dlv_grp_cd9);
		p.Cnd_dlv_grp_nm8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm8, true);
		p.Cnd_dlv_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd9, true);
		p.Cnd_dlv_grp_cd9.setLinkBeans(p.Cnd_dlv_grp_nm9);
		p.Tab5Panel.add(p.Cnd_dlv_grp_cd9_Label);
		p.Tab5Panel.add(p.Cnd_dlv_grp_cd9);
		p.Cnd_dlv_grp_cd9.setNextBeans(p.Cnd_dlv_grp_nm9);
		p.Cnd_dlv_grp_cd9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_grp_cd9_META);
		p.Tab5Panel.add(p.Cnd_dlv_grp_nm9);
		p.Cnd_dlv_grp_nm9.setNextBeans(p.Cnd_dlv_grp_cd10);
		p.Cnd_dlv_grp_nm9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm9, true);
		p.Cnd_dlv_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd10, true);
		p.Cnd_dlv_grp_cd10.setLinkBeans(p.Cnd_dlv_grp_nm10);
		p.Tab5Panel.add(p.Cnd_dlv_grp_cd10_Label);
		p.Tab5Panel.add(p.Cnd_dlv_grp_cd10);
		p.Cnd_dlv_grp_cd10.setNextBeans(p.Cnd_dlv_grp_nm10);
		p.Cnd_dlv_grp_cd10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_grp_cd10_META);
		p.Tab5Panel.add(p.Cnd_dlv_grp_nm10);
		p.Cnd_dlv_grp_nm10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.dlv_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm10, true);
		p.Tab6Panel.add(p.Cnd_apl_no_Label);
		p.Tab6Panel.add(p.Cnd_apl_no);
		p.Tab6Panel.setLastBeans(p.Cnd_apl_no);
		p.Cnd_apl_no.setNextBeans(p.Cnd_aprv_no);
		p.Cnd_apl_no.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.apl_no_META);
		p.setPluralValueEnable(p.Cnd_apl_no, true);
		p.Tab6Panel.add(p.Cnd_aprv_no_Label);
		p.Tab6Panel.add(p.Cnd_aprv_no);
		p.Cnd_aprv_no.setNextBeans(p.Cnd_apl_dt_fr);
		p.Cnd_aprv_no.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.aprv_no_META);
		p.setPluralValueEnable(p.Cnd_aprv_no, true);
		p.Tab6Panel.add(p.Cnd_apl_dt_fr_Label);
		p.Tab6Panel.add(p.Cnd_apl_dt_fr);
		p.Cnd_apl_dt_fr.setNextBeans(p.Cnd_apl_dt_to);
		p.Cnd_apl_dt_fr.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.apl_dt_fr_META);
		p.Cnd_apl_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Tab6Panel.add(p.Cnd_apl_dt_to_Label);
		p.Tab6Panel.add(p.Cnd_apl_dt_to);
		p.Cnd_apl_dt_to.setNextBeans(p.Cnd_apl_usr_cd);
		p.Cnd_apl_dt_to.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.apl_dt_to_META);
		p.Cnd_apl_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Tab6Panel.add(p.Cnd_apl_usr_cd_Label);
		p.Tab6Panel.add(p.Cnd_apl_usr_cd);
		p.Cnd_apl_usr_cd.setNextBeans(p.Cnd_apl_usr_nm);
		p.Cnd_apl_usr_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.apl_usr_cd_META);
		p.Cnd_apl_usr_cd.addLinkBeans(p.Cnd_apl_usr_nm);
		p.Cnd_apl_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_apl_usr_cd, true);
		p.Tab6Panel.add(p.Cnd_apl_usr_nm);
		p.Cnd_apl_usr_nm.setNextBeans(p.Cnd_apl_dpt_cd);
		p.Cnd_apl_usr_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.apl_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_apl_usr_nm, true);
		p.Tab6Panel.add(p.Cnd_apl_dpt_cd_Label);
		p.Tab6Panel.add(p.Cnd_apl_dpt_cd);
		p.Cnd_apl_dpt_cd.setNextBeans(p.Cnd_apl_dpt_nm);
		p.Cnd_apl_dpt_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.apl_dpt_cd_META);
		p.Cnd_apl_dpt_cd.addLinkBeans(p.Cnd_apl_dpt_nm);
		p.Cnd_apl_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_apl_dpt_cd, true);
		p.Tab6Panel.add(p.Cnd_apl_dpt_nm);
		p.Cnd_apl_dpt_nm.setNextBeans(p.Cnd_aprv_sts_typ);
		p.Cnd_apl_dpt_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.apl_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_apl_dpt_nm, true);
		p.Cnd_aprv_sts_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_aprv_sts_typ, true);
		p.Cnd_aprv_sts_typ.setLinkBeans(p.Cnd_aprv_sts_typ_nm);
		p.Tab6Panel.add(p.Cnd_aprv_sts_typ_Label);
		p.Tab6Panel.add(p.Cnd_aprv_sts_typ);
		p.Cnd_aprv_sts_typ.setNextBeans(p.Cnd_aprv_sts_typ_nm);
		p.Cnd_aprv_sts_typ.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.aprv_sts_typ_META);
		p.Tab6Panel.add(p.Cnd_aprv_sts_typ_nm);
		p.Cnd_aprv_sts_typ_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0140.CndR.aprv_sts_typ_nm_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABSP_ProcUpriReg p) {
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
	protected static void jbInitRPnl(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.add(p.RPnlPanel);
		p.RPnlPanel.setNextBeans(p.BottomPanel);
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
	 * [Bottom]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBottom(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.add(p.BottomPanel);
		p.BottomPanel.setNextBeans(p.DtlBtnPanel);
		p.BottomPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.BottomPanel.add(p.BulkSetPanel, null);
		p.BottomPanel.setLastBeans(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.DtlPanel);
		p.BottomPanel.add(p.DtlPanel, null);
		p.DtlPanel.setNextBeans(p.Dtl2Panel);
		p.BottomPanel.add(p.Dtl2Panel, null);
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBulkSet(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_rev_rate_Label);
		p.BulkSetPanel.add(p.BulkSet_rev_rate);
		p.BulkSetPanel.setLastBeans(p.BulkSet_rev_rate);
		p.BulkSet_rev_rate.setNextBeans(p.BulkSet_rnd_typ);
		p.BulkSet_rev_rate.setRow(p.getBulkSetR(), mcframe.clientMABS.MABSP0140.BulkSetR.rev_rate_META);
		p.BulkSet_rnd_typ.setListType(MCListType.STRICT);
		p.BulkSet_rnd_typ.setLinkBeans(p.BulkSet_rnd_typ_nm);
		p.BulkSetPanel.add(p.BulkSet_rnd_typ_Label);
		p.BulkSetPanel.add(p.BulkSet_rnd_typ);
		p.BulkSet_rnd_typ.setNextBeans(p.BulkSet_rnd_typ_nm);
		p.BulkSet_rnd_typ.setRow(p.getBulkSetR(), mcframe.clientMABS.MABSP0140.BulkSetR.rnd_typ_META);
		p.BulkSetPanel.add(p.BulkSet_rnd_typ_nm);
		p.BulkSet_rnd_typ_nm.setNextBeans(p.BulkSet_rev_date);
		p.BulkSet_rnd_typ_nm.setRow(p.getBulkSetR(), mcframe.clientMABS.MABSP0140.BulkSetR.rnd_typ_nm_META);
		p.BulkSetPanel.add(p.BulkSet_rev_date_Label);
		p.BulkSetPanel.add(p.BulkSet_rev_date);
		p.BulkSet_rev_date.setNextBeans(p.BulkSet_rev_upri);
		p.BulkSet_rev_date.setRow(p.getBulkSetR(), mcframe.clientMABS.MABSP0140.BulkSetR.rev_date_META);
		p.BulkSet_rev_date.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSet_rev_upri.setFunctionKey(MCFunctionKey.F4);
		p.BulkSetPanel.add(p.BulkSet_rev_upri);
		p.BulkSet_rev_upri.setNextBeans(p.BulkSet_st_dt);
		p.BulkSetPanel.add(p.BulkSet_st_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_st_dt);
		p.BulkSet_st_dt.setNextBeans(p.BulkSet_end_dt);
		p.BulkSet_st_dt.setRow(p.getBulkSetR(), mcframe.clientMABS.MABSP0140.BulkSetR.st_dt_META);
		p.BulkSet_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_end_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_end_dt);
		p.BulkSet_end_dt.setNextBeans(p.BulkSet_set_dt);
		p.BulkSet_end_dt.setRow(p.getBulkSetR(), mcframe.clientMABS.MABSP0140.BulkSetR.end_dt_META);
		p.BulkSet_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSet_set_dt.setFunctionKey(MCFunctionKey.F7);
		p.BulkSetPanel.add(p.BulkSet_set_dt);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CTC");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl2(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.Dtl2Panel.setBorder(p.Dtl2TitledBorder);
		p.Dtl2Panel.setValueCheck(false);
		p.Dtl2Panel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
		p.Dtl2Panel.add(p.Dtl2_apl_dt_Label);
		p.Dtl2Panel.add(p.Dtl2_apl_dt);
		p.Dtl2Panel.setLastBeans(p.Dtl2_apl_dt);
		p.Dtl2_apl_dt.setNextBeans(p.Dtl2_usr_dpt_p_PPanel);
		p.Dtl2_apl_dt.setRow(p.getDtl2R(), mcframe.clientMABS.MABSP0140.Dtl2R.apl_dt_META);
		p.Dtl2_apl_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Dtl2Panel.add(p.Dtl2_usr_dpt_p_PPanel);
		p.Dtl2_usr_dpt_p_PPanel.setNextBeans(p.Dtl2_apl_no);
		p.Dtl2_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Dtl2_apl_dpt_nm);
		p.Dtl2Panel.add(p.Dtl2_apl_no_Label);
		p.Dtl2Panel.add(p.Dtl2_apl_no);
		p.Dtl2_apl_no.setNextBeans(p.Dtl2_aprv_no);
		p.Dtl2_apl_no.setRow(p.getDtl2R(), mcframe.clientMABS.MABSP0140.Dtl2R.apl_no_META);
		p.Dtl2Panel.add(p.Dtl2_aprv_no_Label);
		p.Dtl2Panel.add(p.Dtl2_aprv_no);
		p.Dtl2_aprv_no.setNextBeans(p.Dtl2_mst_apl_memo);
		p.Dtl2_aprv_no.setRow(p.getDtl2R(), mcframe.clientMABS.MABSP0140.Dtl2R.aprv_no_META);
		p.Dtl2Panel.add(p.Dtl2_mst_apl_memo_Label);
		p.Dtl2Panel.add(p.Dtl2_mst_apl_memo);
		p.Dtl2_mst_apl_memo.setRow(p.getDtl2R(), mcframe.clientMABS.MABSP0140.Dtl2R.mst_apl_memo_META);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MABSP_ProcUpriReg p) {
		// ブロック関連の初期化
		p.add(p.DtlBtnPanel);
		p.DtlBtnPanel.setNextBeans(p.EastBtnPanel);
		p.DtlBtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.DtlBtn_correct_dup_dt.setFunctionKey(MCFunctionKey.F8);
		p.DtlBtnPanel.add(p.DtlBtn_correct_dup_dt);
		p.DtlBtnPanel.setLastBeans(p.DtlBtn_correct_dup_dt);
		p.DtlBtn_correct_dup_dt.setNextBeans(p.DtlBtn_select_all);
		p.DtlBtn_select_all.setIcon("SELECT_ALL");
		p.DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.DtlBtnPanel.add(p.DtlBtn_select_all);
		p.DtlBtn_select_all.setNextBeans(p.DtlBtn_deselect_all);
		p.DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.DtlBtnPanel.add(p.DtlBtn_deselect_all);
		p.DtlBtn_deselect_all.setNextBeans(p.DtlBtn_radd);
		p.DtlBtn_radd.setIcon("INSERT_RECORD");
		p.DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.DtlBtnPanel.add(p.DtlBtn_radd);
		p.DtlBtn_radd.setNextBeans(p.DtlBtn_rdel);
		p.DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.DtlBtnPanel.add(p.DtlBtn_rdel);
		p.DtlBtn_rdel.setNextBeans(p.DtlBtn_rcopy);
		p.DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.DtlBtnPanel.add(p.DtlBtn_rcopy);
		p.DtlBtn_rcopy.setNextBeans(p.DtlBtn_upd_cmn);
		p.DtlBtn_upd_cmn.setIcon("REGISTER");
		p.DtlBtn_upd_cmn.setFunctionKey(MCFunctionKey.F9);
		p.DtlBtnPanel.add(p.DtlBtn_upd_cmn);
		p.DtlBtn_upd_cmn.setNextBeans(p.DtlBtn_upd_wg);
		p.DtlBtn_upd_wg.setIcon("REGISTER");
		p.DtlBtn_upd_wg.setFunctionKey(MCFunctionKey.F9);
		p.DtlBtnPanel.add(p.DtlBtn_upd_wg);
		p.DtlBtn_upd_wg.setNextBeans(p.DtlBtn_upd_apl_cmn);
		p.DtlBtn_upd_apl_cmn.setIcon("REGISTER");
		p.DtlBtn_upd_apl_cmn.setFunctionKey(MCFunctionKey.F9);
		p.DtlBtnPanel.add(p.DtlBtn_upd_apl_cmn);
		p.DtlBtn_upd_apl_cmn.setNextBeans(p.DtlBtn_upd_apl_wg);
		p.DtlBtn_upd_apl_wg.setIcon("REGISTER");
		p.DtlBtn_upd_apl_wg.setFunctionKey(MCFunctionKey.F9);
		p.DtlBtnPanel.add(p.DtlBtn_upd_apl_wg);
		p.DtlBtn_del_cmn.setIcon("DELETE");
		p.DtlBtn_del_cmn.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.DtlBtn_del_cmn);
		p.EastBtnPanel.add(p.DtlBtn_del_cmn);
		p.DtlBtn_del_cmn.setNextBeans(p.DtlBtn_del_wg);
		p.DtlBtn_del_wg.setIcon("DELETE");
		p.DtlBtn_del_wg.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.DtlBtn_del_wg);
		p.DtlBtn_del_wg.setNextBeans(p.DtlBtn_del_apl_cmn);
		p.DtlBtn_del_apl_cmn.setIcon("DELETE");
		p.DtlBtn_del_apl_cmn.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.DtlBtn_del_apl_cmn);
		p.DtlBtn_del_apl_cmn.setNextBeans(p.DtlBtn_del_apl_wg);
		p.DtlBtn_del_apl_wg.setIcon("DELETE");
		p.DtlBtn_del_apl_wg.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.DtlBtn_del_apl_wg);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABSP_ProcUpriReg p) {
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
		MABSP_ProcUpriReg_MC.mcInitScreenOpe((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.mcInitRegTarget((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.mcInitTop((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.mcInitFold((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.mcInitCndTab((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.mcInitTab1((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.mcInitTab2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.mcInitTab3((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.mcInitTab4((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.mcInitTab5((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.mcInitTab6((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.mcInitCnd((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.mcInitCtrl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.mcInitRPnl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.mcInitBottom((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.mcInitBulkSet((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.mcInitDtl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.mcInitDtl2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.mcInitDtlBtn((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.mcInitEastBtn((MABSP_ProcUpriReg)this);

		// [UPD]ステータスのモードの設定
		MABSP_ProcUpriReg_MC.statusInitUPD_ScreenOpe((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD_RegTarget((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD_Top((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD_Fold((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD_CndTab((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD_Tab1((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD_Tab2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD_Tab3((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD_Tab4((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD_Tab5((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD_Tab6((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD_Cnd((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD_Ctrl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD_RPnl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD_Bottom((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD_BulkSet((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD_Dtl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD_Dtl2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD_DtlBtn((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD_EastBtn((MABSP_ProcUpriReg)this);

		// [UPD_APL]ステータスのモードの設定
		MABSP_ProcUpriReg_MC.statusInitUPD__APL_ScreenOpe((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__APL_RegTarget((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__APL_Top((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__APL_Fold((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__APL_CndTab((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__APL_Tab1((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__APL_Tab2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__APL_Tab3((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__APL_Tab4((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__APL_Tab5((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__APL_Tab6((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__APL_Cnd((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__APL_Ctrl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__APL_RPnl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__APL_Bottom((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__APL_BulkSet((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__APL_Dtl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__APL_Dtl2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__APL_DtlBtn((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__APL_EastBtn((MABSP_ProcUpriReg)this);

		// [UPD_MOD_APL]ステータスのモードの設定
		MABSP_ProcUpriReg_MC.statusInitUPD__MOD__APL_ScreenOpe((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__MOD__APL_RegTarget((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__MOD__APL_Top((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__MOD__APL_Fold((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__MOD__APL_CndTab((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__MOD__APL_Tab1((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__MOD__APL_Tab2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__MOD__APL_Tab3((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__MOD__APL_Tab4((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__MOD__APL_Tab5((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__MOD__APL_Tab6((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__MOD__APL_Cnd((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__MOD__APL_Ctrl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__MOD__APL_RPnl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__MOD__APL_Bottom((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__MOD__APL_BulkSet((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__MOD__APL_Dtl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__MOD__APL_Dtl2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__MOD__APL_DtlBtn((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitUPD__MOD__APL_EastBtn((MABSP_ProcUpriReg)this);

		// [FIX]ステータスのモードの設定
		MABSP_ProcUpriReg_MC.statusInitFIX_ScreenOpe((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX_RegTarget((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX_Top((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX_Fold((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX_CndTab((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX_Tab1((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX_Tab2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX_Tab3((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX_Tab4((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX_Tab5((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX_Tab6((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX_Cnd((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX_Ctrl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX_RPnl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX_Bottom((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX_BulkSet((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX_Dtl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX_Dtl2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX_DtlBtn((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX_EastBtn((MABSP_ProcUpriReg)this);

		// [FIX_APL]ステータスのモードの設定
		MABSP_ProcUpriReg_MC.statusInitFIX__APL_ScreenOpe((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__APL_RegTarget((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__APL_Top((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__APL_Fold((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__APL_CndTab((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__APL_Tab1((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__APL_Tab2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__APL_Tab3((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__APL_Tab4((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__APL_Tab5((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__APL_Tab6((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__APL_Cnd((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__APL_Ctrl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__APL_RPnl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__APL_Bottom((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__APL_BulkSet((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__APL_Dtl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__APL_Dtl2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__APL_DtlBtn((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__APL_EastBtn((MABSP_ProcUpriReg)this);

		// [FIX_MOD_APL]ステータスのモードの設定
		MABSP_ProcUpriReg_MC.statusInitFIX__MOD__APL_ScreenOpe((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__MOD__APL_RegTarget((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__MOD__APL_Top((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__MOD__APL_Fold((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__MOD__APL_CndTab((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__MOD__APL_Tab1((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__MOD__APL_Tab2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__MOD__APL_Tab3((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__MOD__APL_Tab4((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__MOD__APL_Tab5((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__MOD__APL_Tab6((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__MOD__APL_Cnd((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__MOD__APL_Ctrl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__MOD__APL_RPnl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__MOD__APL_Bottom((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__MOD__APL_BulkSet((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__MOD__APL_Dtl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__MOD__APL_Dtl2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__MOD__APL_DtlBtn((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitFIX__MOD__APL_EastBtn((MABSP_ProcUpriReg)this);

		// [DEL]ステータスのモードの設定
		MABSP_ProcUpriReg_MC.statusInitDEL_ScreenOpe((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL_RegTarget((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL_Top((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL_Fold((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL_CndTab((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL_Tab1((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL_Tab2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL_Tab3((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL_Tab4((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL_Tab5((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL_Tab6((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL_Cnd((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL_Ctrl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL_RPnl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL_Bottom((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL_BulkSet((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL_Dtl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL_Dtl2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL_DtlBtn((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL_EastBtn((MABSP_ProcUpriReg)this);

		// [DEL_APL]ステータスのモードの設定
		MABSP_ProcUpriReg_MC.statusInitDEL__APL_ScreenOpe((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL__APL_RegTarget((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL__APL_Top((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL__APL_Fold((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL__APL_CndTab((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL__APL_Tab1((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL__APL_Tab2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL__APL_Tab3((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL__APL_Tab4((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL__APL_Tab5((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL__APL_Tab6((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL__APL_Cnd((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL__APL_Ctrl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL__APL_RPnl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL__APL_Bottom((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL__APL_BulkSet((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL__APL_Dtl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL__APL_Dtl2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL__APL_DtlBtn((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitDEL__APL_EastBtn((MABSP_ProcUpriReg)this);

		// [REF_APL]ステータスのモードの設定
		MABSP_ProcUpriReg_MC.statusInitREF__APL_ScreenOpe((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF__APL_RegTarget((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF__APL_Top((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF__APL_Fold((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF__APL_CndTab((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF__APL_Tab1((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF__APL_Tab2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF__APL_Tab3((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF__APL_Tab4((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF__APL_Tab5((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF__APL_Tab6((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF__APL_Cnd((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF__APL_Ctrl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF__APL_RPnl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF__APL_Bottom((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF__APL_BulkSet((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF__APL_Dtl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF__APL_Dtl2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF__APL_DtlBtn((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF__APL_EastBtn((MABSP_ProcUpriReg)this);

		// [REF]ステータスのモードの設定
		MABSP_ProcUpriReg_MC.statusInitREF_ScreenOpe((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF_RegTarget((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF_Top((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF_Fold((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF_CndTab((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF_Tab1((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF_Tab2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF_Tab3((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF_Tab4((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF_Tab5((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF_Tab6((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF_Cnd((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF_Ctrl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF_RPnl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF_Bottom((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF_BulkSet((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF_Dtl((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF_Dtl2((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF_DtlBtn((MABSP_ProcUpriReg)this);
		MABSP_ProcUpriReg_MC.statusInitREF_EastBtn((MABSP_ProcUpriReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABSP_ProcUpriReg p) {
	}

	/**
	 *  [RegTarget]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRegTarget(MABSP_ProcUpriReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABSP_ProcUpriReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABSP_ProcUpriReg p) {
	}

	/**
	 *  [CndTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCndTab(MABSP_ProcUpriReg p) {
		p.CndTabTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MABSP_ProcUpriReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MABSP_ProcUpriReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MABSP_ProcUpriReg p) {
	}

	/**
	 *  [Tab4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab4(MABSP_ProcUpriReg p) {
	}

	/**
	 *  [Tab5]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab5(MABSP_ProcUpriReg p) {
	}

	/**
	 *  [Tab6]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab6(MABSP_ProcUpriReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABSP_ProcUpriReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_APL.addAllListener(p);
		p.Cnd_ope_MOD_APL.addAllListener(p);
		p.Cnd_ope_DEL_APL.addAllListener(p);
		p.Cnd_ope_REF_APL.addAllListener(p);
		p.Cnd_cmn_flg.addAllListener(p);
		p.Cnd_wg_flg.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_unit_cd.setListListener(p);
		p.Cnd_unit_cd.addAllListener(p);
		p.Cnd_unit_nm.setListListener(p);
		p.Cnd_unit_nm.addAllListener(p);
		p.Cnd_cur_cd.setListListener(p);
		p.Cnd_cur_cd.addAllListener(p);
		p.Cnd_cur_nm.setListListener(p);
		p.Cnd_cur_nm.addAllListener(p);
		p.Cnd_proc_upri_typ.setListListener(p);
		p.Cnd_proc_upri_typ.addAllListener(p);
		p.Cnd_proc_upri_typ_nm.setListListener(p);
		p.Cnd_proc_upri_typ_nm.addAllListener(p);
		p.Cnd_off_interim_flg.addAllListener(p);
		p.Cnd_on_interim_flg.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_maker_cd.setListListener(p);
		p.Cnd_maker_cd.addAllListener(p);
		p.Cnd_maker_nm.setListListener(p);
		p.Cnd_maker_nm.addAllListener(p);
		p.Cnd_sppl_cntry_cd.setListListener(p);
		p.Cnd_sppl_cntry_cd.addAllListener(p);
		p.Cnd_sppl_cntry_nm.setListListener(p);
		p.Cnd_sppl_cntry_nm.addAllListener(p);
		p.Cnd_sppl_foreign_flg.addAllListener(p);
		p.Cnd_sppl_area_cd.setListListener(p);
		p.Cnd_sppl_area_cd.addAllListener(p);
		p.Cnd_sppl_area_nm.setListListener(p);
		p.Cnd_sppl_area_nm.addAllListener(p);
		p.Cnd_dlv_cd.setListListener(p);
		p.Cnd_dlv_cd.addAllListener(p);
		p.Cnd_dlv_nm.setListListener(p);
		p.Cnd_dlv_nm.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
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
		p.Cnd_sppl_grp_cd1.setListListener(p);
		p.Cnd_sppl_grp_cd1.addAllListener(p);
		p.Cnd_sppl_grp_nm1.setListListener(p);
		p.Cnd_sppl_grp_nm1.addAllListener(p);
		p.Cnd_sppl_grp_cd2.setListListener(p);
		p.Cnd_sppl_grp_cd2.addAllListener(p);
		p.Cnd_sppl_grp_nm2.setListListener(p);
		p.Cnd_sppl_grp_nm2.addAllListener(p);
		p.Cnd_sppl_grp_cd3.setListListener(p);
		p.Cnd_sppl_grp_cd3.addAllListener(p);
		p.Cnd_sppl_grp_nm3.setListListener(p);
		p.Cnd_sppl_grp_nm3.addAllListener(p);
		p.Cnd_sppl_grp_cd4.setListListener(p);
		p.Cnd_sppl_grp_cd4.addAllListener(p);
		p.Cnd_sppl_grp_nm4.setListListener(p);
		p.Cnd_sppl_grp_nm4.addAllListener(p);
		p.Cnd_sppl_grp_cd5.setListListener(p);
		p.Cnd_sppl_grp_cd5.addAllListener(p);
		p.Cnd_sppl_grp_nm5.setListListener(p);
		p.Cnd_sppl_grp_nm5.addAllListener(p);
		p.Cnd_sppl_grp_cd6.setListListener(p);
		p.Cnd_sppl_grp_cd6.addAllListener(p);
		p.Cnd_sppl_grp_nm6.setListListener(p);
		p.Cnd_sppl_grp_nm6.addAllListener(p);
		p.Cnd_sppl_grp_cd7.setListListener(p);
		p.Cnd_sppl_grp_cd7.addAllListener(p);
		p.Cnd_sppl_grp_nm7.setListListener(p);
		p.Cnd_sppl_grp_nm7.addAllListener(p);
		p.Cnd_sppl_grp_cd8.setListListener(p);
		p.Cnd_sppl_grp_cd8.addAllListener(p);
		p.Cnd_sppl_grp_nm8.setListListener(p);
		p.Cnd_sppl_grp_nm8.addAllListener(p);
		p.Cnd_sppl_grp_cd9.setListListener(p);
		p.Cnd_sppl_grp_cd9.addAllListener(p);
		p.Cnd_sppl_grp_nm9.setListListener(p);
		p.Cnd_sppl_grp_nm9.addAllListener(p);
		p.Cnd_sppl_grp_cd10.setListListener(p);
		p.Cnd_sppl_grp_cd10.addAllListener(p);
		p.Cnd_sppl_grp_nm10.setListListener(p);
		p.Cnd_sppl_grp_nm10.addAllListener(p);
		p.Cnd_maker_grp_cd1.setListListener(p);
		p.Cnd_maker_grp_cd1.addAllListener(p);
		p.Cnd_maker_grp_nm1.setListListener(p);
		p.Cnd_maker_grp_nm1.addAllListener(p);
		p.Cnd_maker_grp_cd2.setListListener(p);
		p.Cnd_maker_grp_cd2.addAllListener(p);
		p.Cnd_maker_grp_nm2.setListListener(p);
		p.Cnd_maker_grp_nm2.addAllListener(p);
		p.Cnd_maker_grp_cd3.setListListener(p);
		p.Cnd_maker_grp_cd3.addAllListener(p);
		p.Cnd_maker_grp_nm3.setListListener(p);
		p.Cnd_maker_grp_nm3.addAllListener(p);
		p.Cnd_maker_grp_cd4.setListListener(p);
		p.Cnd_maker_grp_cd4.addAllListener(p);
		p.Cnd_maker_grp_nm4.setListListener(p);
		p.Cnd_maker_grp_nm4.addAllListener(p);
		p.Cnd_maker_grp_cd5.setListListener(p);
		p.Cnd_maker_grp_cd5.addAllListener(p);
		p.Cnd_maker_grp_nm5.setListListener(p);
		p.Cnd_maker_grp_nm5.addAllListener(p);
		p.Cnd_maker_grp_cd6.setListListener(p);
		p.Cnd_maker_grp_cd6.addAllListener(p);
		p.Cnd_maker_grp_nm6.setListListener(p);
		p.Cnd_maker_grp_nm6.addAllListener(p);
		p.Cnd_maker_grp_cd7.setListListener(p);
		p.Cnd_maker_grp_cd7.addAllListener(p);
		p.Cnd_maker_grp_nm7.setListListener(p);
		p.Cnd_maker_grp_nm7.addAllListener(p);
		p.Cnd_maker_grp_cd8.setListListener(p);
		p.Cnd_maker_grp_cd8.addAllListener(p);
		p.Cnd_maker_grp_nm8.setListListener(p);
		p.Cnd_maker_grp_nm8.addAllListener(p);
		p.Cnd_maker_grp_cd9.setListListener(p);
		p.Cnd_maker_grp_cd9.addAllListener(p);
		p.Cnd_maker_grp_nm9.setListListener(p);
		p.Cnd_maker_grp_nm9.addAllListener(p);
		p.Cnd_maker_grp_cd10.setListListener(p);
		p.Cnd_maker_grp_cd10.addAllListener(p);
		p.Cnd_maker_grp_nm10.setListListener(p);
		p.Cnd_maker_grp_nm10.addAllListener(p);
		p.Cnd_dlv_grp_cd1.setListListener(p);
		p.Cnd_dlv_grp_cd1.addAllListener(p);
		p.Cnd_dlv_grp_nm1.setListListener(p);
		p.Cnd_dlv_grp_nm1.addAllListener(p);
		p.Cnd_dlv_grp_cd2.setListListener(p);
		p.Cnd_dlv_grp_cd2.addAllListener(p);
		p.Cnd_dlv_grp_nm2.setListListener(p);
		p.Cnd_dlv_grp_nm2.addAllListener(p);
		p.Cnd_dlv_grp_cd3.setListListener(p);
		p.Cnd_dlv_grp_cd3.addAllListener(p);
		p.Cnd_dlv_grp_nm3.setListListener(p);
		p.Cnd_dlv_grp_nm3.addAllListener(p);
		p.Cnd_dlv_grp_cd4.setListListener(p);
		p.Cnd_dlv_grp_cd4.addAllListener(p);
		p.Cnd_dlv_grp_nm4.setListListener(p);
		p.Cnd_dlv_grp_nm4.addAllListener(p);
		p.Cnd_dlv_grp_cd5.setListListener(p);
		p.Cnd_dlv_grp_cd5.addAllListener(p);
		p.Cnd_dlv_grp_nm5.setListListener(p);
		p.Cnd_dlv_grp_nm5.addAllListener(p);
		p.Cnd_dlv_grp_cd6.setListListener(p);
		p.Cnd_dlv_grp_cd6.addAllListener(p);
		p.Cnd_dlv_grp_nm6.setListListener(p);
		p.Cnd_dlv_grp_nm6.addAllListener(p);
		p.Cnd_dlv_grp_cd7.setListListener(p);
		p.Cnd_dlv_grp_cd7.addAllListener(p);
		p.Cnd_dlv_grp_nm7.setListListener(p);
		p.Cnd_dlv_grp_nm7.addAllListener(p);
		p.Cnd_dlv_grp_cd8.setListListener(p);
		p.Cnd_dlv_grp_cd8.addAllListener(p);
		p.Cnd_dlv_grp_nm8.setListListener(p);
		p.Cnd_dlv_grp_nm8.addAllListener(p);
		p.Cnd_dlv_grp_cd9.setListListener(p);
		p.Cnd_dlv_grp_cd9.addAllListener(p);
		p.Cnd_dlv_grp_nm9.setListListener(p);
		p.Cnd_dlv_grp_nm9.addAllListener(p);
		p.Cnd_dlv_grp_cd10.setListListener(p);
		p.Cnd_dlv_grp_cd10.addAllListener(p);
		p.Cnd_dlv_grp_nm10.setListListener(p);
		p.Cnd_dlv_grp_nm10.addAllListener(p);
		p.Cnd_apl_no.setListListener(p);
		p.Cnd_apl_no.addAllListener(p);
		p.Cnd_aprv_no.setListListener(p);
		p.Cnd_aprv_no.addAllListener(p);
		p.Cnd_apl_dt_fr.setListListener(p);
		p.Cnd_apl_dt_fr.addAllListener(p);
		p.Cnd_apl_dt_to.setListListener(p);
		p.Cnd_apl_dt_to.addAllListener(p);
		p.Cnd_apl_usr_cd.setListListener(p);
		p.Cnd_apl_usr_cd.addAllListener(p);
		p.Cnd_apl_usr_nm.setListListener(p);
		p.Cnd_apl_usr_nm.addAllListener(p);
		p.Cnd_apl_dpt_cd.setListListener(p);
		p.Cnd_apl_dpt_cd.addAllListener(p);
		p.Cnd_apl_dpt_nm.setListListener(p);
		p.Cnd_apl_dpt_nm.addAllListener(p);
		p.Cnd_aprv_sts_typ.setListListener(p);
		p.Cnd_aprv_sts_typ.addAllListener(p);
		p.Cnd_aprv_sts_typ_nm.setListListener(p);
		p.Cnd_aprv_sts_typ_nm.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABSP_ProcUpriReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MABSP_ProcUpriReg p) {
		p.RPnl_srch_cmn.addAllListener(p);
		p.RPnl_srch_cmn.setAPMethodName("doRPnl_srch_cmn");
		p.RPnl_srch_wg.addAllListener(p);
		p.RPnl_srch_wg.setAPMethodName("doRPnl_srch_wg");
	}

	/**
	 *  [Bottom]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBottom(MABSP_ProcUpriReg p) {
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MABSP_ProcUpriReg p) {
		p.BulkSet_rev_rate.setListListener(p);
		p.BulkSet_rev_rate.addAllListener(p);
		p.BulkSet_rnd_typ.setListListener(p);
		p.BulkSet_rnd_typ.addAllListener(p);
		p.BulkSet_rnd_typ_nm.setListListener(p);
		p.BulkSet_rnd_typ_nm.addAllListener(p);
		p.BulkSet_rev_date.setListListener(p);
		p.BulkSet_rev_date.addAllListener(p);
		p.BulkSet_rev_upri.addAllListener(p);
		p.BulkSet_rev_upri.setAPMethodName("doBulkSet_rev_upri");
		p.BulkSet_st_dt.setListListener(p);
		p.BulkSet_st_dt.addAllListener(p);
		p.BulkSet_end_dt.setListListener(p);
		p.BulkSet_end_dt.addAllListener(p);
		p.BulkSet_set_dt.addAllListener(p);
		p.BulkSet_set_dt.setAPMethodName("doBulkSet_set_dt");
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABSP_ProcUpriReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_wg_nm.addAllListener(p);
		p.columnDtl_wg_nm.setListListener(p);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_itm_typ.addAllListener(p);
		p.columnDtl_itm_typ.setListListener(p);
		p.columnDtl_itm_typ_nm.addAllListener(p);
		p.columnDtl_itm_typ_nm.setListListener(p);
		p.columnDtl_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_itm_typ_d_cd.setListListener(p);
		p.columnDtl_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_itm_typ_d_nm.setListListener(p);
		p.columnDtl_sppl_cd.addAllListener(p);
		p.columnDtl_sppl_cd.setListListener(p);
		p.columnDtl_sppl_nm.addAllListener(p);
		p.columnDtl_sppl_nm.setListListener(p);
		p.columnDtl_maker_cd.addAllListener(p);
		p.columnDtl_maker_cd.setListListener(p);
		p.columnDtl_maker_nm.addAllListener(p);
		p.columnDtl_maker_nm.setListListener(p);
		p.columnDtl_unit_cd.addAllListener(p);
		p.columnDtl_unit_cd.setListListener(p);
		p.columnDtl_unit_nm.addAllListener(p);
		p.columnDtl_unit_nm.setListListener(p);
		p.columnDtl_dec_place.addAllListener(p);
		p.columnDtl_dec_place.setListListener(p);
		p.columnDtl_cur_cd.addAllListener(p);
		p.columnDtl_cur_cd.setListListener(p);
		p.columnDtl_cur_nm.addAllListener(p);
		p.columnDtl_cur_nm.setListListener(p);
		p.columnDtl_upri_dec_place.addAllListener(p);
		p.columnDtl_upri_dec_place.setListListener(p);
		p.columnDtl_proc_upri_typ.addAllListener(p);
		p.columnDtl_proc_upri_typ.setListListener(p);
		p.columnDtl_proc_upri_typ_nm.addAllListener(p);
		p.columnDtl_proc_upri_typ_nm.setListListener(p);
		p.columnDtl_loc_cd.addAllListener(p);
		p.columnDtl_loc_cd.setListListener(p);
		p.columnDtl_loc_nm.addAllListener(p);
		p.columnDtl_loc_nm.setListListener(p);
		p.columnDtl_dlv_cd.addAllListener(p);
		p.columnDtl_dlv_cd.setListListener(p);
		p.columnDtl_dlv_nm.addAllListener(p);
		p.columnDtl_dlv_nm.setListListener(p);
		p.columnDtl_outsrc_upri_typ.addAllListener(p);
		p.columnDtl_outsrc_upri_typ.setListListener(p);
		p.columnDtl_outsrc_upri_typ_nm.addAllListener(p);
		p.columnDtl_outsrc_upri_typ_nm.setListListener(p);
		p.columnDtl_purc_tax_cd.addAllListener(p);
		p.columnDtl_purc_tax_cd.setListListener(p);
		p.columnDtl_purc_tax_nm.addAllListener(p);
		p.columnDtl_purc_tax_nm.setListListener(p);
		p.columnDtl_interim_flg.addAllListener(p);
		p.columnDtl_std_wk_cost.addAllListener(p);
		p.columnDtl_std_wk_cost.setListListener(p);
		p.columnDtl_std_wk_cost_upri.addAllListener(p);
		p.columnDtl_std_wk_cost_upri.setListListener(p);
		p.columnDtl_not_cost_flg.addAllListener(p);
		p.columnDtl_memo1.addAllListener(p);
		p.columnDtl_memo1.setListListener(p);
		p.columnDtl_memo2.addAllListener(p);
		p.columnDtl_memo2.setListListener(p);
		p.columnDtl_memo3.addAllListener(p);
		p.columnDtl_memo3.setListListener(p);
		p.columnDtl_apl_no.addAllListener(p);
		p.columnDtl_apl_no.setListListener(p);
		p.columnDtl_st_dt_bf.addAllListener(p);
		p.columnDtl_st_dt_bf.setListListener(p);
		p.columnDtl_apl_dt.addAllListener(p);
		p.columnDtl_apl_dt.setListListener(p);
		p.columnDtl_apl_usr_cd.addAllListener(p);
		p.columnDtl_apl_usr_cd.setListListener(p);
		p.columnDtl_apl_usr_nm.addAllListener(p);
		p.columnDtl_apl_usr_nm.setListListener(p);
		p.columnDtl_apl_dpt_cd.addAllListener(p);
		p.columnDtl_apl_dpt_cd.setListListener(p);
		p.columnDtl_apl_dpt_nm.addAllListener(p);
		p.columnDtl_apl_dpt_nm.setListListener(p);
		p.columnDtl_ref_flg.addAllListener(p);
		p.columnDtl_mst_apl_memo.addAllListener(p);
		p.columnDtl_mst_apl_memo.setListListener(p);
		p.columnDtl_aprv_no.addAllListener(p);
		p.columnDtl_aprv_no.setListListener(p);
		p.columnDtl_aprv_sts_typ.addAllListener(p);
		p.columnDtl_aprv_sts_typ.setListListener(p);
		p.columnDtl_aprv_sts_typ_nm.addAllListener(p);
		p.columnDtl_aprv_sts_typ_nm.setListListener(p);
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
	 *  [Dtl2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl2(MABSP_ProcUpriReg p) {
		p.Dtl2_apl_dt.setListListener(p);
		p.Dtl2_apl_dt.addAllListener(p);
		p.Dtl2_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Dtl2_apl_no.setListListener(p);
		p.Dtl2_apl_no.addAllListener(p);
		p.Dtl2_aprv_no.setListListener(p);
		p.Dtl2_aprv_no.addAllListener(p);
		p.Dtl2_mst_apl_memo.setListListener(p);
		p.Dtl2_mst_apl_memo.addAllListener(p);
	}

	/**
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABSP_ProcUpriReg p) {
		p.DtlBtn_correct_dup_dt.addAllListener(p);
		p.DtlBtn_correct_dup_dt.setAPMethodName("doDtlBtn_correct_dup_dt");
		p.DtlBtn_select_all.addAllListener(p);
		p.DtlBtn_select_all.setAPMethodName("doDtlBtn_select_all");
		p.DtlBtn_deselect_all.addAllListener(p);
		p.DtlBtn_deselect_all.setAPMethodName("doDtlBtn_deselect_all");
		p.DtlBtn_radd.addAllListener(p);
		p.DtlBtn_radd.setAPMethodName("doDtlBtn_radd");
		p.DtlBtn_rdel.addAllListener(p);
		p.DtlBtn_rdel.setAPMethodName("doDtlBtn_rdel");
		p.DtlBtn_rcopy.addAllListener(p);
		p.DtlBtn_rcopy.setAPMethodName("doDtlBtn_rcopy");
		p.DtlBtn_upd_cmn.addAllListener(p);
		p.DtlBtn_upd_cmn.setAPMethodName("doDtlBtn_upd_cmn");
		p.DtlBtn_upd_wg.addAllListener(p);
		p.DtlBtn_upd_wg.setAPMethodName("doDtlBtn_upd_wg");
		p.DtlBtn_upd_apl_cmn.addAllListener(p);
		p.DtlBtn_upd_apl_cmn.setAPMethodName("doDtlBtn_upd_apl_cmn");
		p.DtlBtn_upd_apl_wg.addAllListener(p);
		p.DtlBtn_upd_apl_wg.setAPMethodName("doDtlBtn_upd_apl_wg");
		p.DtlBtn_del_cmn.addAllListener(p);
		p.DtlBtn_del_cmn.setAPMethodName("doDtlBtn_del_cmn");
		p.DtlBtn_del_wg.addAllListener(p);
		p.DtlBtn_del_wg.setAPMethodName("doDtlBtn_del_wg");
		p.DtlBtn_del_apl_cmn.addAllListener(p);
		p.DtlBtn_del_apl_cmn.setAPMethodName("doDtlBtn_del_apl_cmn");
		p.DtlBtn_del_apl_wg.addAllListener(p);
		p.DtlBtn_del_apl_wg.setAPMethodName("doDtlBtn_del_apl_wg");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABSP_ProcUpriReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RegTarget(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CndTab(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab3(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab4(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab5(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab6(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABSP_ProcUpriReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dt_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_unit_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_unit_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_proc_upri_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_proc_upri_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_off_interim_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_interim_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_cntry_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_cntry_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_foreign_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_area_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_area_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);
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
		p.Cnd_sppl_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_grp_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_grp_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_grp_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_grp_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_grp_nm5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_grp_nm6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_grp_nm7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_grp_nm8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_grp_nm9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_grp_nm10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_apl_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_aprv_no.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_apl_dt_fr.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_apl_dt_to.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_apl_usr_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_apl_usr_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_apl_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_apl_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RPnl(MABSP_ProcUpriReg p){
		p.RPnl_srch_cmn.putMode(p, UPD, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Bottom]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Bottom(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MABSP_ProcUpriReg p){
		p.BulkSet_rev_rate.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_rnd_typ.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_rnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.BulkSet_rev_date.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_rev_upri.putMode(p, UPD, MCMode.DISABLE);
		p.BulkSet_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_set_dt.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABSP_ProcUpriReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_wg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_maker_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_maker_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_cur_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upri_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dlv_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnDtl_outsrc_upri_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_upri1_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.REQUIRED);
		p.Dtl_upri2_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.columnDtl_interim_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_std_wk_cost.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_std_wk_cost_upri.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_not_cost_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_upri3_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_upri4_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_upri5_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.columnDtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_apl_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_st_dt_bf.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_apl_dt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_apl_usr_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_apl_usr_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_apl_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_apl_dpt_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ref_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_mst_apl_memo.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_aprv_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_aprv_sts_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_aprv_sts_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
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
	 * [UPD]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl2(MABSP_ProcUpriReg p){
		p.Dtl2_apl_dt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl2_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Dtl2_apl_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl2_aprv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl2_mst_apl_memo.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtn(MABSP_ProcUpriReg p){
		p.DtlBtn_correct_dup_dt.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_upd_cmn.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_upd_wg.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_upd_apl_cmn.putMode(p, UPD, MCMode.INVISIBLE);
		p.DtlBtn_upd_apl_wg.putMode(p, UPD, MCMode.INVISIBLE);
		p.DtlBtn_del_cmn.putMode(p, UPD, MCMode.DISABLE);
		p.DtlBtn_del_wg.putMode(p, UPD, MCMode.DISABLE);
		p.DtlBtn_del_apl_cmn.putMode(p, UPD, MCMode.INVISIBLE);
		p.DtlBtn_del_apl_wg.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_APL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APL_ScreenOpe(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_APL]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APL_RegTarget(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_APL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APL_Top(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_APL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APL_Fold(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_APL]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APL_CndTab(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_APL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APL_Tab1(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_APL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APL_Tab2(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_APL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APL_Tab3(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_APL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APL_Tab4(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_APL]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APL_Tab5(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_APL]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APL_Tab6(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_APL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APL_Cnd(MABSP_ProcUpriReg p){
		p.Cnd_ope_Group.putMode(p, UPD_APL, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.Cnd_dt_PPanel.putStatus(UPD_APL, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_APL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD_APL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_unit_cd.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_unit_nm.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_proc_upri_typ.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.Cnd_proc_upri_typ_nm.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.Cnd_off_interim_flg.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_on_interim_flg.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_cntry_cd.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_cntry_nm.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_foreign_flg.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_area_cd.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_area_nm.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd1.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm1.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd2.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm2.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd3.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm3.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd4.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm4.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd5.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm5.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd6.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm6.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd7.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm7.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd8.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm8.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd9.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm9.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd10.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm10.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd1.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm1.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd2.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm2.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd3.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm3.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd4.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm4.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd5.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm5.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd6.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm6.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd7.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm7.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd8.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm8.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd9.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm9.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd10.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm10.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_apl_no.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_aprv_no.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_apl_dt_fr.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_apl_dt_to.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_apl_usr_cd.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_apl_usr_nm.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_apl_dpt_cd.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_apl_dpt_nm.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ.putMode(p, UPD_APL, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ_nm.putMode(p, UPD_APL, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_APL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APL_Ctrl(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_APL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APL_RPnl(MABSP_ProcUpriReg p){
		p.RPnl_srch_cmn.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, UPD_APL, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_APL]ステータスの[Bottom]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APL_Bottom(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_APL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APL_BulkSet(MABSP_ProcUpriReg p){
		p.BulkSet_rev_rate.putMode(p, UPD_APL, MCMode.ENABLE);
		p.BulkSet_rnd_typ.putMode(p, UPD_APL, MCMode.ENABLE);
		p.BulkSet_rnd_typ_nm.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.BulkSet_rev_date.putMode(p, UPD_APL, MCMode.ENABLE);
		p.BulkSet_rev_upri.putMode(p, UPD_APL, MCMode.DISABLE);
		p.BulkSet_st_dt.putMode(p, UPD_APL, MCMode.ENABLE);
		p.BulkSet_end_dt.putMode(p, UPD_APL, MCMode.ENABLE);
		p.BulkSet_set_dt.putMode(p, UPD_APL, MCMode.DISABLE);

	}

	/**
	 * [UPD_APL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APL_Dtl(MABSP_ProcUpriReg p){
		p.columnDtl_check.putMode(p, UPD_APL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD_APL, MCMode.REQUIRED);
		p.columnDtl_wg_cd.putMode(p, UPD_APL, MCMode.REQUIRED);
		p.columnDtl_wg_nm.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD_APL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_itm_typ.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, UPD_APL, MCMode.REQUIRED);
		p.columnDtl_sppl_nm.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_maker_cd.putMode(p, UPD_APL, MCMode.ENABLE);
		p.columnDtl_maker_nm.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_unit_cd.putMode(p, UPD_APL, MCMode.REQUIRED);
		p.columnDtl_unit_nm.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_dec_place.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.Dtl_qty_p_PPanel.putStatus(UPD_APL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_cur_cd.putMode(p, UPD_APL, MCMode.REQUIRED);
		p.columnDtl_cur_nm.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_upri_dec_place.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_typ.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_typ_nm.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, UPD_APL, MCMode.ENABLE);
		p.columnDtl_loc_nm.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, UPD_APL, MCMode.ENABLE);
		p.columnDtl_dlv_nm.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(UPD_APL, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnDtl_outsrc_upri_typ.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ_nm.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_cd.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_nm.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.Dtl_upri1_p_PPanel.putStatus(UPD_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.REQUIRED);
		p.Dtl_upri2_p_PPanel.putStatus(UPD_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.columnDtl_interim_flg.putMode(p, UPD_APL, MCMode.REQUIRED);
		p.columnDtl_std_wk_cost.putMode(p, UPD_APL, MCMode.ENABLE);
		p.columnDtl_std_wk_cost_upri.putMode(p, UPD_APL, MCMode.ENABLE);
		p.columnDtl_not_cost_flg.putMode(p, UPD_APL, MCMode.REQUIRED);
		p.Dtl_upri3_p_PPanel.putStatus(UPD_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_upri4_p_PPanel.putStatus(UPD_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_upri5_p_PPanel.putStatus(UPD_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.columnDtl_memo1.putMode(p, UPD_APL, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD_APL, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD_APL, MCMode.ENABLE);
		p.columnDtl_apl_no.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.columnDtl_st_dt_bf.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.columnDtl_apl_dt.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.columnDtl_apl_usr_cd.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.columnDtl_apl_usr_nm.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.columnDtl_apl_dpt_cd.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.columnDtl_apl_dpt_nm.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.columnDtl_ref_flg.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.columnDtl_mst_apl_memo.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.columnDtl_aprv_no.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.columnDtl_aprv_sts_typ.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.columnDtl_aprv_sts_typ_nm.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, UPD_APL, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_APL]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APL_Dtl2(MABSP_ProcUpriReg p){
		p.Dtl2_apl_dt.putMode(p, UPD_APL, MCMode.REQUIRED);
		p.Dtl2_usr_dpt_p_PPanel.putStatus(UPD_APL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.REQUIRED);
		p.Dtl2_apl_no.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.Dtl2_aprv_no.putMode(p, UPD_APL, MCMode.READ_ONLY);
		p.Dtl2_mst_apl_memo.putMode(p, UPD_APL, MCMode.ENABLE);

	}

	/**
	 * [UPD_APL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APL_DtlBtn(MABSP_ProcUpriReg p){
		p.DtlBtn_correct_dup_dt.putMode(p, UPD_APL, MCMode.ENABLE);
		p.DtlBtn_select_all.putMode(p, UPD_APL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD_APL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD_APL, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD_APL, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD_APL, MCMode.ENABLE);
		p.DtlBtn_upd_cmn.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.DtlBtn_upd_wg.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.DtlBtn_upd_apl_cmn.putMode(p, UPD_APL, MCMode.ENABLE);
		p.DtlBtn_upd_apl_wg.putMode(p, UPD_APL, MCMode.ENABLE);
		p.DtlBtn_del_cmn.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.DtlBtn_del_wg.putMode(p, UPD_APL, MCMode.INVISIBLE);
		p.DtlBtn_del_apl_cmn.putMode(p, UPD_APL, MCMode.DISABLE);
		p.DtlBtn_del_apl_wg.putMode(p, UPD_APL, MCMode.DISABLE);

	}

	/**
	 * [UPD_APL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__APL_EastBtn(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_MOD_APL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD__APL_ScreenOpe(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_MOD_APL]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD__APL_RegTarget(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_MOD_APL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD__APL_Top(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_MOD_APL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD__APL_Fold(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_MOD_APL]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD__APL_CndTab(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_MOD_APL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD__APL_Tab1(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_MOD_APL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD__APL_Tab2(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_MOD_APL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD__APL_Tab3(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_MOD_APL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD__APL_Tab4(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_MOD_APL]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD__APL_Tab5(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_MOD_APL]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD__APL_Tab6(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_MOD_APL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD__APL_Cnd(MABSP_ProcUpriReg p){
		p.Cnd_ope_Group.putMode(p, UPD_MOD_APL, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.Cnd_dt_PPanel.putStatus(UPD_MOD_APL, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_MOD_APL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD_MOD_APL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_unit_cd.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_unit_nm.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_proc_upri_typ.putMode(p, UPD_MOD_APL, MCMode.INVISIBLE);
		p.Cnd_proc_upri_typ_nm.putMode(p, UPD_MOD_APL, MCMode.INVISIBLE);
		p.Cnd_off_interim_flg.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_on_interim_flg.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_cntry_cd.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_cntry_nm.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_foreign_flg.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_area_cd.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_area_nm.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd1.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm1.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd2.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm2.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd3.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm3.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd4.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm4.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd5.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm5.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd6.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm6.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd7.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm7.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd8.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm8.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd9.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm9.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd10.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm10.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd1.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm1.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd2.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm2.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd3.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm3.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd4.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm4.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd5.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm5.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd6.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm6.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd7.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm7.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd8.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm8.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd9.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm9.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd10.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm10.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_apl_no.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_aprv_no.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_apl_dt_fr.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_apl_dt_to.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_apl_usr_cd.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_apl_usr_nm.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_apl_dpt_cd.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_apl_dpt_nm.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_MOD_APL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD__APL_Ctrl(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_MOD_APL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD__APL_RPnl(MABSP_ProcUpriReg p){
		p.RPnl_srch_cmn.putMode(p, UPD_MOD_APL, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, UPD_MOD_APL, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_MOD_APL]ステータスの[Bottom]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD__APL_Bottom(MABSP_ProcUpriReg p){

	}

	/**
	 * [UPD_MOD_APL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD__APL_BulkSet(MABSP_ProcUpriReg p){
		p.BulkSet_rev_rate.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.BulkSet_rnd_typ.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.BulkSet_rnd_typ_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.BulkSet_rev_date.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.BulkSet_rev_upri.putMode(p, UPD_MOD_APL, MCMode.DISABLE);
		p.BulkSet_st_dt.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.BulkSet_end_dt.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.BulkSet_set_dt.putMode(p, UPD_MOD_APL, MCMode.DISABLE);

	}

	/**
	 * [UPD_MOD_APL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD__APL_Dtl(MABSP_ProcUpriReg p){
		p.columnDtl_check.putMode(p, UPD_MOD_APL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD_MOD_APL, MCMode.REQUIRED);
		p.columnDtl_wg_cd.putMode(p, UPD_MOD_APL, MCMode.REQUIRED);
		p.columnDtl_wg_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD_MOD_APL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_itm_typ.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, UPD_MOD_APL, MCMode.REQUIRED);
		p.columnDtl_sppl_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_maker_cd.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.columnDtl_maker_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_unit_cd.putMode(p, UPD_MOD_APL, MCMode.REQUIRED);
		p.columnDtl_unit_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_dec_place.putMode(p, UPD_MOD_APL, MCMode.INVISIBLE);
		p.Dtl_qty_p_PPanel.putStatus(UPD_MOD_APL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_cur_cd.putMode(p, UPD_MOD_APL, MCMode.REQUIRED);
		p.columnDtl_cur_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_upri_dec_place.putMode(p, UPD_MOD_APL, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_typ.putMode(p, UPD_MOD_APL, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_typ_nm.putMode(p, UPD_MOD_APL, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.columnDtl_loc_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.columnDtl_dlv_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(UPD_MOD_APL, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnDtl_outsrc_upri_typ.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_cd.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.Dtl_upri1_p_PPanel.putStatus(UPD_MOD_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.REQUIRED);
		p.Dtl_upri2_p_PPanel.putStatus(UPD_MOD_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.columnDtl_interim_flg.putMode(p, UPD_MOD_APL, MCMode.REQUIRED);
		p.columnDtl_std_wk_cost.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.columnDtl_std_wk_cost_upri.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.columnDtl_not_cost_flg.putMode(p, UPD_MOD_APL, MCMode.REQUIRED);
		p.Dtl_upri3_p_PPanel.putStatus(UPD_MOD_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_upri4_p_PPanel.putStatus(UPD_MOD_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.Dtl_upri5_p_PPanel.putStatus(UPD_MOD_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.ENABLE);
		p.columnDtl_memo1.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.columnDtl_apl_no.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_st_dt_bf.putMode(p, UPD_MOD_APL, MCMode.INVISIBLE);
		p.columnDtl_apl_dt.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_apl_usr_cd.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_apl_usr_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_apl_dpt_cd.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_apl_dpt_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_ref_flg.putMode(p, UPD_MOD_APL, MCMode.INVISIBLE);
		p.columnDtl_mst_apl_memo.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_aprv_no.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, UPD_MOD_APL, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_MOD_APL]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD__APL_Dtl2(MABSP_ProcUpriReg p){
		p.Dtl2_apl_dt.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.Dtl2_usr_dpt_p_PPanel.putStatus(UPD_MOD_APL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Dtl2_apl_no.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.Dtl2_aprv_no.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);
		p.Dtl2_mst_apl_memo.putMode(p, UPD_MOD_APL, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_MOD_APL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD__APL_DtlBtn(MABSP_ProcUpriReg p){
		p.DtlBtn_correct_dup_dt.putMode(p, UPD_MOD_APL, MCMode.DISABLE);
		p.DtlBtn_select_all.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD_MOD_APL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, UPD_MOD_APL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, UPD_MOD_APL, MCMode.DISABLE);
		p.DtlBtn_upd_cmn.putMode(p, UPD_MOD_APL, MCMode.INVISIBLE);
		p.DtlBtn_upd_wg.putMode(p, UPD_MOD_APL, MCMode.INVISIBLE);
		p.DtlBtn_upd_apl_cmn.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.DtlBtn_upd_apl_wg.putMode(p, UPD_MOD_APL, MCMode.ENABLE);
		p.DtlBtn_del_cmn.putMode(p, UPD_MOD_APL, MCMode.INVISIBLE);
		p.DtlBtn_del_wg.putMode(p, UPD_MOD_APL, MCMode.INVISIBLE);
		p.DtlBtn_del_apl_cmn.putMode(p, UPD_MOD_APL, MCMode.DISABLE);
		p.DtlBtn_del_apl_wg.putMode(p, UPD_MOD_APL, MCMode.DISABLE);

	}

	/**
	 * [UPD_MOD_APL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD__APL_EastBtn(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitFIX_RegTarget(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_CndTab(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab1(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab2(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab3(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab4(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab5(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab6(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABSP_ProcUpriReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_dt_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_unit_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_unit_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_proc_upri_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.Cnd_proc_upri_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.Cnd_off_interim_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_interim_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_cntry_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_cntry_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_foreign_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_area_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_area_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_grp_cd1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_grp_nm1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_grp_cd2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_grp_nm2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_grp_cd3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_grp_nm3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_grp_cd4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_grp_nm4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_grp_cd5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_grp_nm5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_grp_cd6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_grp_nm6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_grp_cd7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_grp_nm7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_grp_cd8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_grp_nm8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_grp_cd9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_grp_nm9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_grp_cd10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_grp_nm10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_apl_no.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_aprv_no.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_apl_dt_fr.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_apl_dt_to.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_apl_usr_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_apl_usr_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_apl_dpt_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_apl_dpt_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_RPnl(MABSP_ProcUpriReg p){
		p.RPnl_srch_cmn.putMode(p, FIX, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[Bottom]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Bottom(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BulkSet(MABSP_ProcUpriReg p){
		p.BulkSet_rev_rate.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_rnd_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_rnd_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_rev_date.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_rev_upri.putMode(p, FIX, MCMode.DISABLE);
		p.BulkSet_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABSP_ProcUpriReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_maker_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.Dtl_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cur_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cur_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upri_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_upri1_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_upri2_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_interim_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_std_wk_cost.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_std_wk_cost_upri.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_not_cost_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_upri3_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_upri4_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_upri5_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_apl_no.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_st_dt_bf.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_apl_dt.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_apl_usr_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_apl_usr_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_apl_dpt_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_apl_dpt_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_ref_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_mst_apl_memo.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_aprv_no.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_aprv_sts_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_aprv_sts_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
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
	 * [FIX]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl2(MABSP_ProcUpriReg p){
		p.Dtl2_apl_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl2_usr_dpt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Dtl2_apl_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl2_aprv_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl2_mst_apl_memo.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlBtn(MABSP_ProcUpriReg p){
		p.DtlBtn_correct_dup_dt.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_upd_cmn.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_upd_wg.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_upd_apl_cmn.putMode(p, FIX, MCMode.INVISIBLE);
		p.DtlBtn_upd_apl_wg.putMode(p, FIX, MCMode.INVISIBLE);
		p.DtlBtn_del_cmn.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_del_wg.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_del_apl_cmn.putMode(p, FIX, MCMode.INVISIBLE);
		p.DtlBtn_del_apl_wg.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_APL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__APL_ScreenOpe(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_APL]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitFIX__APL_RegTarget(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_APL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__APL_Top(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_APL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__APL_Fold(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_APL]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__APL_CndTab(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_APL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__APL_Tab1(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_APL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__APL_Tab2(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_APL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__APL_Tab3(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_APL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitFIX__APL_Tab4(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_APL]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitFIX__APL_Tab5(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_APL]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitFIX__APL_Tab6(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_APL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__APL_Cnd(MABSP_ProcUpriReg p){
		p.Cnd_ope_Group.putMode(p, FIX_APL, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.Cnd_dt_PPanel.putStatus(FIX_APL, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_APL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_APL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_unit_cd.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_unit_nm.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_proc_upri_typ.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.Cnd_proc_upri_typ_nm.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.Cnd_off_interim_flg.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_on_interim_flg.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_cntry_cd.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_cntry_nm.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_foreign_flg.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_area_cd.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_area_nm.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd1.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm1.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd2.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm2.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd3.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm3.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd4.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm4.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd5.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm5.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd6.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm6.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd7.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm7.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd8.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm8.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd9.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm9.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd10.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm10.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd1.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm1.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd2.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm2.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd3.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm3.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd4.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm4.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd5.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm5.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd6.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm6.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd7.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm7.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd8.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm8.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd9.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm9.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd10.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm10.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_apl_no.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_aprv_no.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_apl_dt_fr.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_apl_dt_to.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_apl_usr_cd.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_apl_usr_nm.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_apl_dpt_cd.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_apl_dpt_nm.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ.putMode(p, FIX_APL, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ_nm.putMode(p, FIX_APL, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_APL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__APL_Ctrl(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_APL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__APL_RPnl(MABSP_ProcUpriReg p){
		p.RPnl_srch_cmn.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, FIX_APL, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_APL]ステータスの[Bottom]ブロックのモードの設定
	 */
	protected static void statusInitFIX__APL_Bottom(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_APL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__APL_BulkSet(MABSP_ProcUpriReg p){
		p.BulkSet_rev_rate.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.BulkSet_rnd_typ.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.BulkSet_rnd_typ_nm.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.BulkSet_rev_date.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.BulkSet_rev_upri.putMode(p, FIX_APL, MCMode.DISABLE);
		p.BulkSet_st_dt.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, FIX_APL, MCMode.DISABLE);

	}

	/**
	 * [FIX_APL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__APL_Dtl(MABSP_ProcUpriReg p){
		p.columnDtl_check.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_APL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_maker_cd.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_unit_cd.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_unit_nm.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_dec_place.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.Dtl_qty_p_PPanel.putStatus(FIX_APL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cur_cd.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_cur_nm.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_upri_dec_place.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_typ.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_typ_nm.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(FIX_APL, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ_nm.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_cd.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_nm.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.Dtl_upri1_p_PPanel.putStatus(FIX_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_upri2_p_PPanel.putStatus(FIX_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_interim_flg.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_std_wk_cost.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_std_wk_cost_upri.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_not_cost_flg.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.Dtl_upri3_p_PPanel.putStatus(FIX_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_upri4_p_PPanel.putStatus(FIX_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_upri5_p_PPanel.putStatus(FIX_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_apl_no.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.columnDtl_st_dt_bf.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.columnDtl_apl_dt.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.columnDtl_apl_usr_cd.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.columnDtl_apl_usr_nm.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.columnDtl_apl_dpt_cd.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.columnDtl_apl_dpt_nm.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.columnDtl_ref_flg.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.columnDtl_mst_apl_memo.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.columnDtl_aprv_no.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.columnDtl_aprv_sts_typ.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.columnDtl_aprv_sts_typ_nm.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.columnDtl_ins_usr_id.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX_APL, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_APL]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__APL_Dtl2(MABSP_ProcUpriReg p){
		p.Dtl2_apl_dt.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.Dtl2_usr_dpt_p_PPanel.putStatus(FIX_APL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Dtl2_apl_no.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.Dtl2_aprv_no.putMode(p, FIX_APL, MCMode.READ_ONLY);
		p.Dtl2_mst_apl_memo.putMode(p, FIX_APL, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_APL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__APL_DtlBtn(MABSP_ProcUpriReg p){
		p.DtlBtn_correct_dup_dt.putMode(p, FIX_APL, MCMode.DISABLE);
		p.DtlBtn_select_all.putMode(p, FIX_APL, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX_APL, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX_APL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX_APL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX_APL, MCMode.DISABLE);
		p.DtlBtn_upd_cmn.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.DtlBtn_upd_wg.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.DtlBtn_upd_apl_cmn.putMode(p, FIX_APL, MCMode.DISABLE);
		p.DtlBtn_upd_apl_wg.putMode(p, FIX_APL, MCMode.DISABLE);
		p.DtlBtn_del_cmn.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.DtlBtn_del_wg.putMode(p, FIX_APL, MCMode.INVISIBLE);
		p.DtlBtn_del_apl_cmn.putMode(p, FIX_APL, MCMode.DISABLE);
		p.DtlBtn_del_apl_wg.putMode(p, FIX_APL, MCMode.DISABLE);

	}

	/**
	 * [FIX_APL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__APL_EastBtn(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_MOD_APL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MOD__APL_ScreenOpe(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_MOD_APL]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MOD__APL_RegTarget(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_MOD_APL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MOD__APL_Top(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_MOD_APL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MOD__APL_Fold(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_MOD_APL]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MOD__APL_CndTab(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_MOD_APL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MOD__APL_Tab1(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_MOD_APL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MOD__APL_Tab2(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_MOD_APL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MOD__APL_Tab3(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_MOD_APL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MOD__APL_Tab4(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_MOD_APL]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MOD__APL_Tab5(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_MOD_APL]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MOD__APL_Tab6(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_MOD_APL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MOD__APL_Cnd(MABSP_ProcUpriReg p){
		p.Cnd_ope_Group.putMode(p, FIX_MOD_APL, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.Cnd_dt_PPanel.putStatus(FIX_MOD_APL, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_MOD_APL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX_MOD_APL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_unit_cd.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_unit_nm.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_proc_upri_typ.putMode(p, FIX_MOD_APL, MCMode.INVISIBLE);
		p.Cnd_proc_upri_typ_nm.putMode(p, FIX_MOD_APL, MCMode.INVISIBLE);
		p.Cnd_off_interim_flg.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_on_interim_flg.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_cntry_cd.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_cntry_nm.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_foreign_flg.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_area_cd.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_area_nm.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd1.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm1.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd2.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm2.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd3.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm3.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd4.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm4.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd5.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm5.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd6.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm6.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd7.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm7.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd8.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm8.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd9.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm9.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd10.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm10.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd1.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm1.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd2.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm2.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd3.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm3.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd4.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm4.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd5.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm5.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd6.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm6.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd7.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm7.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd8.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm8.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd9.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm9.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd10.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm10.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_apl_no.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_aprv_no.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_apl_dt_fr.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_apl_dt_to.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_apl_usr_cd.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_apl_usr_nm.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_apl_dpt_cd.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_apl_dpt_nm.putMode(p, FIX_MOD_APL, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.Cnd_aprv_sts_typ_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_MOD_APL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MOD__APL_Ctrl(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_MOD_APL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MOD__APL_RPnl(MABSP_ProcUpriReg p){
		p.RPnl_srch_cmn.putMode(p, FIX_MOD_APL, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, FIX_MOD_APL, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_MOD_APL]ステータスの[Bottom]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MOD__APL_Bottom(MABSP_ProcUpriReg p){

	}

	/**
	 * [FIX_MOD_APL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MOD__APL_BulkSet(MABSP_ProcUpriReg p){
		p.BulkSet_rev_rate.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.BulkSet_rnd_typ.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.BulkSet_rnd_typ_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.BulkSet_rev_date.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.BulkSet_rev_upri.putMode(p, FIX_MOD_APL, MCMode.DISABLE);
		p.BulkSet_st_dt.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, FIX_MOD_APL, MCMode.DISABLE);

	}

	/**
	 * [FIX_MOD_APL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MOD__APL_Dtl(MABSP_ProcUpriReg p){
		p.columnDtl_check.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_MOD_APL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_maker_cd.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_unit_cd.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_unit_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_dec_place.putMode(p, FIX_MOD_APL, MCMode.INVISIBLE);
		p.Dtl_qty_p_PPanel.putStatus(FIX_MOD_APL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cur_cd.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_cur_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_upri_dec_place.putMode(p, FIX_MOD_APL, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_typ.putMode(p, FIX_MOD_APL, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_typ_nm.putMode(p, FIX_MOD_APL, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(FIX_MOD_APL, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_cd.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.Dtl_upri1_p_PPanel.putStatus(FIX_MOD_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_upri2_p_PPanel.putStatus(FIX_MOD_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_interim_flg.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_std_wk_cost.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_std_wk_cost_upri.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_not_cost_flg.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.Dtl_upri3_p_PPanel.putStatus(FIX_MOD_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_upri4_p_PPanel.putStatus(FIX_MOD_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_upri5_p_PPanel.putStatus(FIX_MOD_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_apl_no.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_st_dt_bf.putMode(p, FIX_MOD_APL, MCMode.INVISIBLE);
		p.columnDtl_apl_dt.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_apl_usr_cd.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_apl_usr_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_apl_dpt_cd.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_apl_dpt_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_ref_flg.putMode(p, FIX_MOD_APL, MCMode.INVISIBLE);
		p.columnDtl_mst_apl_memo.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_aprv_no.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX_MOD_APL, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_MOD_APL]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MOD__APL_Dtl2(MABSP_ProcUpriReg p){
		p.Dtl2_apl_dt.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.Dtl2_usr_dpt_p_PPanel.putStatus(FIX_MOD_APL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Dtl2_apl_no.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.Dtl2_aprv_no.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);
		p.Dtl2_mst_apl_memo.putMode(p, FIX_MOD_APL, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_MOD_APL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MOD__APL_DtlBtn(MABSP_ProcUpriReg p){
		p.DtlBtn_correct_dup_dt.putMode(p, FIX_MOD_APL, MCMode.DISABLE);
		p.DtlBtn_select_all.putMode(p, FIX_MOD_APL, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX_MOD_APL, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX_MOD_APL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX_MOD_APL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX_MOD_APL, MCMode.DISABLE);
		p.DtlBtn_upd_cmn.putMode(p, FIX_MOD_APL, MCMode.INVISIBLE);
		p.DtlBtn_upd_wg.putMode(p, FIX_MOD_APL, MCMode.INVISIBLE);
		p.DtlBtn_upd_apl_cmn.putMode(p, FIX_MOD_APL, MCMode.DISABLE);
		p.DtlBtn_upd_apl_wg.putMode(p, FIX_MOD_APL, MCMode.DISABLE);
		p.DtlBtn_del_cmn.putMode(p, FIX_MOD_APL, MCMode.INVISIBLE);
		p.DtlBtn_del_wg.putMode(p, FIX_MOD_APL, MCMode.INVISIBLE);
		p.DtlBtn_del_apl_cmn.putMode(p, FIX_MOD_APL, MCMode.DISABLE);
		p.DtlBtn_del_apl_wg.putMode(p, FIX_MOD_APL, MCMode.DISABLE);

	}

	/**
	 * [FIX_MOD_APL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__MOD__APL_EastBtn(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RegTarget(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_CndTab(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab3(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab4(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab5(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab6(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABSP_ProcUpriReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_dt_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_unit_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_unit_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_proc_upri_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_proc_upri_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_off_interim_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_interim_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_cntry_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_cntry_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_foreign_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_area_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_area_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);
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
		p.Cnd_sppl_grp_cd1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_apl_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_aprv_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_apl_dt_fr.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_apl_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_apl_usr_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_apl_usr_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_apl_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_apl_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RPnl(MABSP_ProcUpriReg p){
		p.RPnl_srch_cmn.putMode(p, DEL, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Bottom]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Bottom(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MABSP_ProcUpriReg p){
		p.BulkSet_rev_rate.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_rnd_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_rnd_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_rev_date.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_rev_upri.putMode(p, DEL, MCMode.DISABLE);
		p.BulkSet_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABSP_ProcUpriReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_maker_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upri_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_upri1_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_upri2_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_interim_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_std_wk_cost.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_std_wk_cost_upri.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_not_cost_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_upri3_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_upri4_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_upri5_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_apl_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_st_dt_bf.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_apl_dt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_apl_usr_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_apl_usr_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_apl_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_apl_dpt_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ref_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_mst_apl_memo.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_aprv_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_aprv_sts_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_aprv_sts_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
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
	 * [DEL]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl2(MABSP_ProcUpriReg p){
		p.Dtl2_apl_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Dtl2_apl_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_aprv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl2_mst_apl_memo.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtn(MABSP_ProcUpriReg p){
		p.DtlBtn_correct_dup_dt.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_upd_cmn.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_upd_wg.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_upd_apl_cmn.putMode(p, DEL, MCMode.INVISIBLE);
		p.DtlBtn_upd_apl_wg.putMode(p, DEL, MCMode.INVISIBLE);
		p.DtlBtn_del_cmn.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_del_wg.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_del_apl_cmn.putMode(p, DEL, MCMode.INVISIBLE);
		p.DtlBtn_del_apl_wg.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL_APL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APL_ScreenOpe(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL_APL]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APL_RegTarget(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL_APL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APL_Top(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL_APL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APL_Fold(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL_APL]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APL_CndTab(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL_APL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APL_Tab1(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL_APL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APL_Tab2(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL_APL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APL_Tab3(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL_APL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APL_Tab4(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL_APL]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APL_Tab5(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL_APL]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APL_Tab6(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL_APL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APL_Cnd(MABSP_ProcUpriReg p){
		p.Cnd_ope_Group.putMode(p, DEL_APL, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.Cnd_dt_PPanel.putStatus(DEL_APL, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL_APL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL_APL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_unit_cd.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_unit_nm.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_proc_upri_typ.putMode(p, DEL_APL, MCMode.INVISIBLE);
		p.Cnd_proc_upri_typ_nm.putMode(p, DEL_APL, MCMode.INVISIBLE);
		p.Cnd_off_interim_flg.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_on_interim_flg.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_cntry_cd.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_cntry_nm.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_foreign_flg.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_area_cd.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_area_nm.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd1.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm1.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd2.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm2.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd3.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm3.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd4.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm4.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd5.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm5.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd6.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm6.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd7.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm7.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd8.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm8.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd9.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm9.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd10.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm10.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd1.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm1.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd2.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm2.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd3.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm3.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd4.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm4.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd5.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm5.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd6.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm6.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd7.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm7.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd8.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm8.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd9.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm9.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd10.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm10.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_apl_no.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_aprv_no.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_apl_dt_fr.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_apl_dt_to.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_apl_usr_cd.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_apl_usr_nm.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_apl_dpt_cd.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_apl_dpt_nm.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ.putMode(p, DEL_APL, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_APL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APL_Ctrl(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL_APL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APL_RPnl(MABSP_ProcUpriReg p){
		p.RPnl_srch_cmn.putMode(p, DEL_APL, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, DEL_APL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_APL]ステータスの[Bottom]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APL_Bottom(MABSP_ProcUpriReg p){

	}

	/**
	 * [DEL_APL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APL_BulkSet(MABSP_ProcUpriReg p){
		p.BulkSet_rev_rate.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.BulkSet_rnd_typ.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.BulkSet_rnd_typ_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.BulkSet_rev_date.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.BulkSet_rev_upri.putMode(p, DEL_APL, MCMode.DISABLE);
		p.BulkSet_st_dt.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, DEL_APL, MCMode.DISABLE);

	}

	/**
	 * [DEL_APL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APL_Dtl(MABSP_ProcUpriReg p){
		p.columnDtl_check.putMode(p, DEL_APL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(DEL_APL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_maker_cd.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_unit_cd.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_unit_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_dec_place.putMode(p, DEL_APL, MCMode.INVISIBLE);
		p.Dtl_qty_p_PPanel.putStatus(DEL_APL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cur_cd.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_cur_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_upri_dec_place.putMode(p, DEL_APL, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_typ.putMode(p, DEL_APL, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_typ_nm.putMode(p, DEL_APL, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(DEL_APL, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_cd.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.Dtl_upri1_p_PPanel.putStatus(DEL_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_upri2_p_PPanel.putStatus(DEL_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_interim_flg.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_std_wk_cost.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_std_wk_cost_upri.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_not_cost_flg.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.Dtl_upri3_p_PPanel.putStatus(DEL_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_upri4_p_PPanel.putStatus(DEL_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_upri5_p_PPanel.putStatus(DEL_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_memo1.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_apl_no.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_st_dt_bf.putMode(p, DEL_APL, MCMode.INVISIBLE);
		p.columnDtl_apl_dt.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_apl_usr_cd.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_apl_usr_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_apl_dpt_cd.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_apl_dpt_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_ref_flg.putMode(p, DEL_APL, MCMode.INVISIBLE);
		p.columnDtl_mst_apl_memo.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_aprv_no.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, DEL_APL, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, DEL_APL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_APL]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APL_Dtl2(MABSP_ProcUpriReg p){
		p.Dtl2_apl_dt.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.Dtl2_usr_dpt_p_PPanel.putStatus(DEL_APL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Dtl2_apl_no.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.Dtl2_aprv_no.putMode(p, DEL_APL, MCMode.READ_ONLY);
		p.Dtl2_mst_apl_memo.putMode(p, DEL_APL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL_APL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APL_DtlBtn(MABSP_ProcUpriReg p){
		p.DtlBtn_correct_dup_dt.putMode(p, DEL_APL, MCMode.DISABLE);
		p.DtlBtn_select_all.putMode(p, DEL_APL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL_APL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL_APL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL_APL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL_APL, MCMode.DISABLE);
		p.DtlBtn_upd_cmn.putMode(p, DEL_APL, MCMode.INVISIBLE);
		p.DtlBtn_upd_wg.putMode(p, DEL_APL, MCMode.INVISIBLE);
		p.DtlBtn_upd_apl_cmn.putMode(p, DEL_APL, MCMode.DISABLE);
		p.DtlBtn_upd_apl_wg.putMode(p, DEL_APL, MCMode.DISABLE);
		p.DtlBtn_del_cmn.putMode(p, DEL_APL, MCMode.INVISIBLE);
		p.DtlBtn_del_wg.putMode(p, DEL_APL, MCMode.INVISIBLE);
		p.DtlBtn_del_apl_cmn.putMode(p, DEL_APL, MCMode.ENABLE);
		p.DtlBtn_del_apl_wg.putMode(p, DEL_APL, MCMode.ENABLE);

	}

	/**
	 * [DEL_APL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__APL_EastBtn(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF_APL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__APL_ScreenOpe(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF_APL]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitREF__APL_RegTarget(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF_APL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF__APL_Top(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF_APL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF__APL_Fold(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF_APL]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitREF__APL_CndTab(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF_APL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF__APL_Tab1(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF_APL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF__APL_Tab2(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF_APL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF__APL_Tab3(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF_APL]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF__APL_Tab4(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF_APL]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitREF__APL_Tab5(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF_APL]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitREF__APL_Tab6(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF_APL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__APL_Cnd(MABSP_ProcUpriReg p){
		p.Cnd_ope_Group.putMode(p, REF_APL, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.Cnd_dt_PPanel.putStatus(REF_APL, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF_APL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF_APL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_unit_cd.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_unit_nm.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_proc_upri_typ.putMode(p, REF_APL, MCMode.INVISIBLE);
		p.Cnd_proc_upri_typ_nm.putMode(p, REF_APL, MCMode.INVISIBLE);
		p.Cnd_off_interim_flg.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_on_interim_flg.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_cntry_cd.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_cntry_nm.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_foreign_flg.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_area_cd.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_area_nm.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd1.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm1.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd2.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm2.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd3.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm3.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd4.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm4.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd5.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm5.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd6.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm6.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd7.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm7.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd8.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm8.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd9.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm9.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_cd10.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_itm_grp_nm10.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd1.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd1.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm1.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd2.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm2.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd3.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm3.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd4.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm4.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd5.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm5.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd6.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm6.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd7.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm7.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd8.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm8.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd9.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm9.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_cd10.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_maker_grp_nm10.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd1.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm1.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd2.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm2.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd3.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm3.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd4.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm4.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd5.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm5.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd6.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm6.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd7.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm7.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd8.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm8.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd9.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm9.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd10.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm10.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_apl_no.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_aprv_no.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_apl_dt_fr.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_apl_dt_to.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_apl_usr_cd.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_apl_usr_nm.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_apl_dpt_cd.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_apl_dpt_nm.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ.putMode(p, REF_APL, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ_nm.putMode(p, REF_APL, MCMode.READ_ONLY);

	}

	/**
	 * [REF_APL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF__APL_Ctrl(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF_APL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF__APL_RPnl(MABSP_ProcUpriReg p){
		p.RPnl_srch_cmn.putMode(p, REF_APL, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, REF_APL, MCMode.INVISIBLE);

	}

	/**
	 * [REF_APL]ステータスの[Bottom]ブロックのモードの設定
	 */
	protected static void statusInitREF__APL_Bottom(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF_APL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF__APL_BulkSet(MABSP_ProcUpriReg p){
		p.BulkSet_rev_rate.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.BulkSet_rnd_typ.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.BulkSet_rnd_typ_nm.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.BulkSet_rev_date.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.BulkSet_rev_upri.putMode(p, REF_APL, MCMode.DISABLE);
		p.BulkSet_st_dt.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, REF_APL, MCMode.DISABLE);

	}

	/**
	 * [REF_APL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__APL_Dtl(MABSP_ProcUpriReg p){
		p.columnDtl_check.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF_APL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_maker_cd.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_unit_cd.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_unit_nm.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_dec_place.putMode(p, REF_APL, MCMode.INVISIBLE);
		p.Dtl_qty_p_PPanel.putStatus(REF_APL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cur_cd.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_cur_nm.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_upri_dec_place.putMode(p, REF_APL, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_typ.putMode(p, REF_APL, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_typ_nm.putMode(p, REF_APL, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(REF_APL, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ_nm.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_cd.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_nm.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.Dtl_upri1_p_PPanel.putStatus(REF_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_upri2_p_PPanel.putStatus(REF_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_interim_flg.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_std_wk_cost.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_std_wk_cost_upri.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_not_cost_flg.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.Dtl_upri3_p_PPanel.putStatus(REF_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_upri4_p_PPanel.putStatus(REF_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_upri5_p_PPanel.putStatus(REF_APL, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_memo1.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_apl_no.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_st_dt_bf.putMode(p, REF_APL, MCMode.INVISIBLE);
		p.columnDtl_apl_dt.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_apl_usr_cd.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_apl_usr_nm.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_apl_dpt_cd.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_apl_dpt_nm.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_ref_flg.putMode(p, REF_APL, MCMode.INVISIBLE);
		p.columnDtl_mst_apl_memo.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_aprv_no.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_aprv_sts_typ_nm.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, REF_APL, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, REF_APL, MCMode.READ_ONLY);

	}

	/**
	 * [REF_APL]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitREF__APL_Dtl2(MABSP_ProcUpriReg p){
		p.Dtl2_apl_dt.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.Dtl2_usr_dpt_p_PPanel.putStatus(REF_APL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Dtl2_apl_no.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.Dtl2_aprv_no.putMode(p, REF_APL, MCMode.READ_ONLY);
		p.Dtl2_mst_apl_memo.putMode(p, REF_APL, MCMode.READ_ONLY);

	}

	/**
	 * [REF_APL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__APL_DtlBtn(MABSP_ProcUpriReg p){
		p.DtlBtn_correct_dup_dt.putMode(p, REF_APL, MCMode.DISABLE);
		p.DtlBtn_select_all.putMode(p, REF_APL, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF_APL, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF_APL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF_APL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF_APL, MCMode.DISABLE);
		p.DtlBtn_upd_cmn.putMode(p, REF_APL, MCMode.INVISIBLE);
		p.DtlBtn_upd_wg.putMode(p, REF_APL, MCMode.INVISIBLE);
		p.DtlBtn_upd_apl_cmn.putMode(p, REF_APL, MCMode.DISABLE);
		p.DtlBtn_upd_apl_wg.putMode(p, REF_APL, MCMode.DISABLE);
		p.DtlBtn_del_cmn.putMode(p, REF_APL, MCMode.INVISIBLE);
		p.DtlBtn_del_wg.putMode(p, REF_APL, MCMode.INVISIBLE);
		p.DtlBtn_del_apl_cmn.putMode(p, REF_APL, MCMode.DISABLE);
		p.DtlBtn_del_apl_wg.putMode(p, REF_APL, MCMode.DISABLE);

	}

	/**
	 * [REF_APL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__APL_EastBtn(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitREF_RegTarget(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_CndTab(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF]ステータスの[Tab4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab4(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF]ステータスの[Tab5]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab5(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF]ステータスの[Tab6]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab6(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABSP_ProcUpriReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_dt_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_unit_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_unit_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cur_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cur_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_proc_upri_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_proc_upri_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_off_interim_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_interim_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_cntry_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_cntry_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_foreign_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_area_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_area_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);
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
		p.Cnd_sppl_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_grp_nm10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_grp_nm10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_apl_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_aprv_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_apl_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_apl_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_apl_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_apl_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_apl_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_apl_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_aprv_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MABSP_ProcUpriReg p){
		p.RPnl_srch_cmn.putMode(p, REF, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Bottom]ブロックのモードの設定
	 */
	protected static void statusInitREF_Bottom(MABSP_ProcUpriReg p){

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MABSP_ProcUpriReg p){
		p.BulkSet_rev_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_rev_date.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_rev_upri.putMode(p, REF, MCMode.DISABLE);
		p.BulkSet_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABSP_ProcUpriReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upri_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_proc_upri_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_outsrc_upri_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_outsrc_upri_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_upri1_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_upri2_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_interim_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_std_wk_cost.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_std_wk_cost_upri.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_not_cost_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_upri3_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_upri4_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.Dtl_upri5_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5060.MAUBP_Upri_D.READ_ONLY);
		p.columnDtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_apl_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_st_dt_bf.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_apl_dt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_apl_usr_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_apl_usr_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_apl_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_apl_dpt_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ref_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_mst_apl_memo.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_aprv_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_aprv_sts_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_aprv_sts_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
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
	 * [REF]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl2(MABSP_ProcUpriReg p){
		p.Dtl2_apl_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Dtl2_apl_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_aprv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl2_mst_apl_memo.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtn(MABSP_ProcUpriReg p){
		p.DtlBtn_correct_dup_dt.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_upd_cmn.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_upd_wg.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_upd_apl_cmn.putMode(p, REF, MCMode.INVISIBLE);
		p.DtlBtn_upd_apl_wg.putMode(p, REF, MCMode.INVISIBLE);
		p.DtlBtn_del_cmn.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_del_wg.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_del_apl_cmn.putMode(p, REF, MCMode.INVISIBLE);
		p.DtlBtn_del_apl_wg.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABSP_ProcUpriReg p){

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
		MABSP_ProcUpriReg_MC.setTableConfigDtl((MABSP_ProcUpriReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABSP_ProcUpriReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABS.MABSP0140.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABS.MABSP0140.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMABS.MABSP0140.DtlR.wg_cd_META);
		p.columnDtl_wg_cd.addLinkBeans(p.columnDtl_wg_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_wg_nm.setMeta(mcframe.clientMABS.MABSP0140.DtlR.wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_nm);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_itm_sub1, p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_itm_typ, p.columnDtl_itm_typ_nm, p.columnDtl_itm_typ_d_cd, p.columnDtl_itm_typ_d_nm, p.columnDtl_unit_cd);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_itm_typ, p.columnDtl_itm_typ_nm, p.columnDtl_itm_typ_d_cd, p.columnDtl_itm_typ_d_nm, p.columnDtl_unit_cd);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_itm_typ, p.columnDtl_itm_typ_nm, p.columnDtl_itm_typ_d_cd, p.columnDtl_itm_typ_d_nm, p.columnDtl_unit_cd);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_itm_typ, p.columnDtl_itm_typ_nm, p.columnDtl_itm_typ_d_cd, p.columnDtl_itm_typ_d_nm, p.columnDtl_unit_cd);
		p.columnDtl_itm_typ.setMeta(mcframe.clientMABS.MABSP0140.DtlR.itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ);
		p.columnDtl_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP0140.DtlR.itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_nm);
		p.columnDtl_itm_typ_d_cd.setMeta(mcframe.clientMABS.MABSP0140.DtlR.itm_typ_d_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_cd);
		p.columnDtl_itm_typ_d_nm.setMeta(mcframe.clientMABS.MABSP0140.DtlR.itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_nm);
		p.columnDtl_sppl_cd.setMeta(mcframe.clientMABS.MABSP0140.DtlR.sppl_cd_META);
		p.columnDtl_sppl_cd.setListType(MCListType.STRICT);
		p.columnDtl_sppl_cd.addLinkBeans(p.columnDtl_sppl_nm,p.columnDtl_cur_cd,p.columnDtl_outsrc_upri_typ);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_cd);
		p.columnDtl_sppl_nm.setMeta(mcframe.clientMABS.MABSP0140.DtlR.sppl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_nm);
		p.columnDtl_maker_cd.setMeta(mcframe.clientMABS.MABSP0140.DtlR.maker_cd_META);
		p.columnDtl_maker_cd.setListType(MCListType.STRICT);
		p.columnDtl_maker_cd.addLinkBeans(p.columnDtl_maker_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_maker_cd);
		p.columnDtl_maker_nm.setMeta(mcframe.clientMABS.MABSP0140.DtlR.maker_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_maker_nm);
		p.columnDtl_unit_cd.setMeta(mcframe.clientMABS.MABSP0140.DtlR.unit_cd_META);
		p.columnDtl_unit_cd.addLinkBeans(p.columnDtl_unit_nm,p.columnDtl_dec_place);
		p.DtlTable.addColumnConfig(p.columnDtl_unit_cd);
		p.columnDtl_unit_nm.setMeta(mcframe.clientMABS.MABSP0140.DtlR.unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_unit_nm);
		p.columnDtl_dec_place.setMeta(mcframe.clientMABS.MABSP0140.DtlR.dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dec_place);
		p.DtlTable.addTable(p.Dtl_qty_p_PPanel.QtyTable);
		p.columnDtl_cur_cd.setMeta(mcframe.clientMABS.MABSP0140.DtlR.cur_cd_META);
		p.columnDtl_cur_cd.addLinkBeans(p.columnDtl_cur_nm,p.columnDtl_upri_dec_place);
		p.DtlTable.addColumnConfig(p.columnDtl_cur_cd);
		p.columnDtl_cur_nm.setMeta(mcframe.clientMABS.MABSP0140.DtlR.cur_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cur_nm);
		p.columnDtl_upri_dec_place.setMeta(mcframe.clientMABS.MABSP0140.DtlR.upri_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upri_dec_place);
		p.columnDtl_proc_upri_typ.setMeta(mcframe.clientMABS.MABSP0140.DtlR.proc_upri_typ_META);
		p.columnDtl_proc_upri_typ.addLinkBeans(p.columnDtl_proc_upri_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_proc_upri_typ);
		p.columnDtl_proc_upri_typ_nm.setMeta(mcframe.clientMABS.MABSP0140.DtlR.proc_upri_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_proc_upri_typ_nm);
		p.columnDtl_loc_cd.setMeta(mcframe.clientMABS.MABSP0140.DtlR.loc_cd_META);
		p.columnDtl_loc_cd.setListType(MCListType.STRICT);
		p.columnDtl_loc_cd.addLinkBeans(p.columnDtl_loc_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_cd);
		p.columnDtl_loc_nm.setMeta(mcframe.clientMABS.MABSP0140.DtlR.loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_nm);
		p.columnDtl_dlv_cd.setMeta(mcframe.clientMABS.MABSP0140.DtlR.dlv_cd_META);
		p.columnDtl_dlv_cd.setListType(MCListType.STRICT);
		p.columnDtl_dlv_cd.addLinkBeans(p.columnDtl_dlv_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_cd);
		p.columnDtl_dlv_nm.setMeta(mcframe.clientMABS.MABSP0140.DtlR.dlv_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_nm);
		p.DtlTable.addTable(p.Dtl_dt_p_PPanel.DtTable);
		p.columnDtl_outsrc_upri_typ.setMeta(mcframe.clientMABS.MABSP0140.DtlR.outsrc_upri_typ_META);
		p.columnDtl_outsrc_upri_typ.addLinkBeans(p.columnDtl_outsrc_upri_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_outsrc_upri_typ);
		p.columnDtl_outsrc_upri_typ_nm.setMeta(mcframe.clientMABS.MABSP0140.DtlR.outsrc_upri_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_outsrc_upri_typ_nm);
		p.columnDtl_purc_tax_cd.setMeta(mcframe.clientMABS.MABSP0140.DtlR.purc_tax_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_tax_cd);
		p.columnDtl_purc_tax_nm.setMeta(mcframe.clientMABS.MABSP0140.DtlR.purc_tax_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_tax_nm);
		p.DtlTable.addTable(p.Dtl_upri1_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_upri2_p_PPanel.UpriTable);
		p.columnDtl_interim_flg.setMeta(mcframe.clientMABS.MABSP0140.DtlR.interim_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_interim_flg);
		p.columnDtl_std_wk_cost.setMeta(mcframe.clientMABS.MABSP0140.DtlR.std_wk_cost_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_wk_cost);
		p.columnDtl_std_wk_cost_upri.setMeta(mcframe.clientMABS.MABSP0140.DtlR.std_wk_cost_upri_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_wk_cost_upri);
		p.columnDtl_not_cost_flg.setMeta(mcframe.clientMABS.MABSP0140.DtlR.not_cost_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_not_cost_flg);
		p.DtlTable.addTable(p.Dtl_upri3_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_upri4_p_PPanel.UpriTable);
		p.DtlTable.addTable(p.Dtl_upri5_p_PPanel.UpriTable);
		p.columnDtl_memo1.setMeta(mcframe.clientMABS.MABSP0140.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABS.MABSP0140.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABS.MABSP0140.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_apl_no.setMeta(mcframe.clientMABS.MABSP0140.DtlR.apl_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_apl_no);
		p.columnDtl_st_dt_bf.setMeta(mcframe.clientMABS.MABSP0140.DtlR.st_dt_bf_META);
		p.columnDtl_st_dt_bf.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_st_dt_bf);
		p.columnDtl_apl_dt.setMeta(mcframe.clientMABS.MABSP0140.DtlR.apl_dt_META);
		p.columnDtl_apl_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_apl_dt);
		p.columnDtl_apl_usr_cd.setMeta(mcframe.clientMABS.MABSP0140.DtlR.apl_usr_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_apl_usr_cd);
		p.columnDtl_apl_usr_nm.setMeta(mcframe.clientMABS.MABSP0140.DtlR.apl_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_apl_usr_nm);
		p.columnDtl_apl_dpt_cd.setMeta(mcframe.clientMABS.MABSP0140.DtlR.apl_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_apl_dpt_cd);
		p.columnDtl_apl_dpt_nm.setMeta(mcframe.clientMABS.MABSP0140.DtlR.apl_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_apl_dpt_nm);
		p.columnDtl_ref_flg.setMeta(mcframe.clientMABS.MABSP0140.DtlR.ref_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ref_flg);
		p.columnDtl_mst_apl_memo.setMeta(mcframe.clientMABS.MABSP0140.DtlR.mst_apl_memo_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mst_apl_memo);
		p.columnDtl_aprv_no.setMeta(mcframe.clientMABS.MABSP0140.DtlR.aprv_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_no);
		p.columnDtl_aprv_sts_typ.setMeta(mcframe.clientMABS.MABSP0140.DtlR.aprv_sts_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_sts_typ);
		p.columnDtl_aprv_sts_typ_nm.setMeta(mcframe.clientMABS.MABSP0140.DtlR.aprv_sts_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_aprv_sts_typ_nm);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0140.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0140.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABS.MABSP0140.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0140.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0140.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP0140.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0140.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0140.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABS.MABSP0140.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0140.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0140.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0140.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP0140.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP0140.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABS.MABSP0140.DtlR.del_ts_META);
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
		Cnd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_unit_cd.getListConfig().setPutter(getCnd_unit_cd_ListPutter());
		Cnd_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cur_cd.getListConfig().setPutter(getCnd_cur_cd_ListPutter());
		Cnd_proc_upri_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_proc_upri_typ.getListConfig().setPutter(getCnd_proc_upri_typ_ListPutter());
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_maker_cd.getListConfig().setPutter(getCnd_maker_cd_ListPutter());
		Cnd_sppl_cntry_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_cntry_cd.getListConfig().setPutter(getCnd_sppl_cntry_cd_ListPutter());
		Cnd_sppl_area_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_area_cd.getListConfig().setPutter(getCnd_sppl_area_cd_ListPutter());
		Cnd_dlv_cd.getListConfig().setPutter(getCnd_dlv_cd_ListPutter());
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
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
		Cnd_sppl_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd1.getListConfig().setPutter(getCnd_sppl_grp_cd1_ListPutter());
		Cnd_sppl_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd2.getListConfig().setPutter(getCnd_sppl_grp_cd2_ListPutter());
		Cnd_sppl_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd3.getListConfig().setPutter(getCnd_sppl_grp_cd3_ListPutter());
		Cnd_sppl_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd4.getListConfig().setPutter(getCnd_sppl_grp_cd4_ListPutter());
		Cnd_sppl_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd5.getListConfig().setPutter(getCnd_sppl_grp_cd5_ListPutter());
		Cnd_sppl_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd6.getListConfig().setPutter(getCnd_sppl_grp_cd6_ListPutter());
		Cnd_sppl_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd7.getListConfig().setPutter(getCnd_sppl_grp_cd7_ListPutter());
		Cnd_sppl_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd8.getListConfig().setPutter(getCnd_sppl_grp_cd8_ListPutter());
		Cnd_sppl_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd9.getListConfig().setPutter(getCnd_sppl_grp_cd9_ListPutter());
		Cnd_sppl_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sppl_grp_cd10.getListConfig().setPutter(getCnd_sppl_grp_cd10_ListPutter());
		Cnd_maker_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_maker_grp_cd1.getListConfig().setPutter(getCnd_maker_grp_cd1_ListPutter());
		Cnd_maker_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_maker_grp_cd2.getListConfig().setPutter(getCnd_maker_grp_cd2_ListPutter());
		Cnd_maker_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_maker_grp_cd3.getListConfig().setPutter(getCnd_maker_grp_cd3_ListPutter());
		Cnd_maker_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_maker_grp_cd4.getListConfig().setPutter(getCnd_maker_grp_cd4_ListPutter());
		Cnd_maker_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_maker_grp_cd5.getListConfig().setPutter(getCnd_maker_grp_cd5_ListPutter());
		Cnd_maker_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_maker_grp_cd6.getListConfig().setPutter(getCnd_maker_grp_cd6_ListPutter());
		Cnd_maker_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_maker_grp_cd7.getListConfig().setPutter(getCnd_maker_grp_cd7_ListPutter());
		Cnd_maker_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_maker_grp_cd8.getListConfig().setPutter(getCnd_maker_grp_cd8_ListPutter());
		Cnd_maker_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_maker_grp_cd9.getListConfig().setPutter(getCnd_maker_grp_cd9_ListPutter());
		Cnd_maker_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_maker_grp_cd10.getListConfig().setPutter(getCnd_maker_grp_cd10_ListPutter());
		Cnd_dlv_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd1.getListConfig().setPutter(getCnd_dlv_grp_cd1_ListPutter());
		Cnd_dlv_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd2.getListConfig().setPutter(getCnd_dlv_grp_cd2_ListPutter());
		Cnd_dlv_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd3.getListConfig().setPutter(getCnd_dlv_grp_cd3_ListPutter());
		Cnd_dlv_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd4.getListConfig().setPutter(getCnd_dlv_grp_cd4_ListPutter());
		Cnd_dlv_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd5.getListConfig().setPutter(getCnd_dlv_grp_cd5_ListPutter());
		Cnd_dlv_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd6.getListConfig().setPutter(getCnd_dlv_grp_cd6_ListPutter());
		Cnd_dlv_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd7.getListConfig().setPutter(getCnd_dlv_grp_cd7_ListPutter());
		Cnd_dlv_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd8.getListConfig().setPutter(getCnd_dlv_grp_cd8_ListPutter());
		Cnd_dlv_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd9.getListConfig().setPutter(getCnd_dlv_grp_cd9_ListPutter());
		Cnd_dlv_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd10.getListConfig().setPutter(getCnd_dlv_grp_cd10_ListPutter());
		Cnd_apl_usr_cd.getListConfig().setPutter(getCnd_apl_usr_cd_ListPutter());
		Cnd_apl_dpt_cd.getListConfig().setPutter(getCnd_apl_dpt_cd_ListPutter());
		Cnd_aprv_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_aprv_sts_typ.getListConfig().setPutter(getCnd_aprv_sts_typ_ListPutter());
		BulkSet_rnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		BulkSet_rnd_typ.getListConfig().setPutter(getBulkSet_rnd_typ_ListPutter());
		columnDtl_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_wg_cd.getListConfig().setPutter(getDtl_wg_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnDtl_sppl_cd.getListConfig().setPutter(getDtl_sppl_cd_ListPutter());
		columnDtl_maker_cd.getListConfig().setPutter(getDtl_maker_cd_ListPutter());
		columnDtl_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_unit_cd.getListConfig().setPutter(getDtl_unit_cd_ListPutter());
		columnDtl_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_cur_cd.getListConfig().setPutter(getDtl_cur_cd_ListPutter());
		columnDtl_proc_upri_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_proc_upri_typ.getListConfig().setPutter(getDtl_proc_upri_typ_ListPutter());
		columnDtl_loc_cd.getListConfig().setPutter(getDtl_loc_cd_ListPutter());
		columnDtl_dlv_cd.getListConfig().setPutter(getDtl_dlv_cd_ListPutter());
		columnDtl_outsrc_upri_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_outsrc_upri_typ.getListConfig().setPutter(getDtl_outsrc_upri_typ_ListPutter());
		Dtl2_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl2_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getDtl2_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
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
	 * この画面を[UPD_APL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_APLStatus() {
		status = UPD_APL;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_MOD_APL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_MOD_APLStatus() {
		status = UPD_MOD_APL;
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
	 * この画面を[FIX_APL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_APLStatus() {
		status = FIX_APL;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_MOD_APL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_MOD_APLStatus() {
		status = FIX_MOD_APL;
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
	 * この画面を[DEL_APL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_APLStatus() {
		status = DEL_APL;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_APL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_APLStatus() {
		status = REF_APL;
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
		else if (UPD_APL.equals(status)) {
			setUPD_APLStatus();
		}
		else if (UPD_MOD_APL.equals(status)) {
			setUPD_MOD_APLStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
		}
		else if (FIX_APL.equals(status)) {
			setFIX_APLStatus();
		}
		else if (FIX_MOD_APL.equals(status)) {
			setFIX_MOD_APLStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (DEL_APL.equals(status)) {
			setDEL_APLStatus();
		}
		else if (REF_APL.equals(status)) {
			setREF_APLStatus();
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
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgWg");
		return lp;
	}
	 
	/**
	 * [Cnd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Unit");
		return lp;
	}
	 
	/**
	 * [Cnd_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Cnd_proc_upri_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_proc_upri_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProcUpriTyp");
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
	 * [Cnd_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_cntry_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_cntry_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cntry");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_area_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_area_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Area");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
	 * [Cnd_sppl_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp10");
		return lp;
	}
	 
	/**
	 * [Cnd_maker_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_maker_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_maker_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_maker_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_maker_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_maker_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_maker_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_maker_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_maker_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_maker_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_maker_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_maker_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_maker_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_maker_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_maker_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_maker_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_maker_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_maker_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_maker_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_maker_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp10");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp10");
		return lp;
	}
	 
	/**
	 * [Cnd_apl_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_apl_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_apl_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_apl_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_aprv_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_aprv_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AprvStsTyp");
		return lp;
	}
	 
	/**
	 * [BulkSet_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createBulkSet_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RndTyp");
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
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Dtl_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 
	/**
	 * [Dtl_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Dtl_proc_upri_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_proc_upri_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProcUpriTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Dtl_dlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl_outsrc_upri_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_outsrc_upri_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.OutsrcUpriTyp");
		return lp;
	}
	 
	/**
	 * [Dtl2_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl2_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}


	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_unit_cd) return getCnd_unit_cd(row, info);
		if(combo == Cnd_cur_cd) return getCnd_cur_cd(row, info);
		if(combo == Cnd_proc_upri_typ) return getCnd_proc_upri_typ(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_maker_cd) return getCnd_maker_cd(row, info);
		if(combo == Cnd_sppl_cntry_cd) return getCnd_sppl_cntry_cd(row, info);
		if(combo == Cnd_sppl_area_cd) return getCnd_sppl_area_cd(row, info);
		if(combo == Cnd_dlv_cd) return getCnd_dlv_cd(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
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
		if(combo == Cnd_sppl_grp_cd1) return getCnd_sppl_grp_cd1(row, info);
		if(combo == Cnd_sppl_grp_cd2) return getCnd_sppl_grp_cd2(row, info);
		if(combo == Cnd_sppl_grp_cd3) return getCnd_sppl_grp_cd3(row, info);
		if(combo == Cnd_sppl_grp_cd4) return getCnd_sppl_grp_cd4(row, info);
		if(combo == Cnd_sppl_grp_cd5) return getCnd_sppl_grp_cd5(row, info);
		if(combo == Cnd_sppl_grp_cd6) return getCnd_sppl_grp_cd6(row, info);
		if(combo == Cnd_sppl_grp_cd7) return getCnd_sppl_grp_cd7(row, info);
		if(combo == Cnd_sppl_grp_cd8) return getCnd_sppl_grp_cd8(row, info);
		if(combo == Cnd_sppl_grp_cd9) return getCnd_sppl_grp_cd9(row, info);
		if(combo == Cnd_sppl_grp_cd10) return getCnd_sppl_grp_cd10(row, info);
		if(combo == Cnd_maker_grp_cd1) return getCnd_maker_grp_cd1(row, info);
		if(combo == Cnd_maker_grp_cd2) return getCnd_maker_grp_cd2(row, info);
		if(combo == Cnd_maker_grp_cd3) return getCnd_maker_grp_cd3(row, info);
		if(combo == Cnd_maker_grp_cd4) return getCnd_maker_grp_cd4(row, info);
		if(combo == Cnd_maker_grp_cd5) return getCnd_maker_grp_cd5(row, info);
		if(combo == Cnd_maker_grp_cd6) return getCnd_maker_grp_cd6(row, info);
		if(combo == Cnd_maker_grp_cd7) return getCnd_maker_grp_cd7(row, info);
		if(combo == Cnd_maker_grp_cd8) return getCnd_maker_grp_cd8(row, info);
		if(combo == Cnd_maker_grp_cd9) return getCnd_maker_grp_cd9(row, info);
		if(combo == Cnd_maker_grp_cd10) return getCnd_maker_grp_cd10(row, info);
		if(combo == Cnd_dlv_grp_cd1) return getCnd_dlv_grp_cd1(row, info);
		if(combo == Cnd_dlv_grp_cd2) return getCnd_dlv_grp_cd2(row, info);
		if(combo == Cnd_dlv_grp_cd3) return getCnd_dlv_grp_cd3(row, info);
		if(combo == Cnd_dlv_grp_cd4) return getCnd_dlv_grp_cd4(row, info);
		if(combo == Cnd_dlv_grp_cd5) return getCnd_dlv_grp_cd5(row, info);
		if(combo == Cnd_dlv_grp_cd6) return getCnd_dlv_grp_cd6(row, info);
		if(combo == Cnd_dlv_grp_cd7) return getCnd_dlv_grp_cd7(row, info);
		if(combo == Cnd_dlv_grp_cd8) return getCnd_dlv_grp_cd8(row, info);
		if(combo == Cnd_dlv_grp_cd9) return getCnd_dlv_grp_cd9(row, info);
		if(combo == Cnd_dlv_grp_cd10) return getCnd_dlv_grp_cd10(row, info);
		if(combo == Cnd_apl_usr_cd) return getCnd_apl_usr_cd(row, info);
		if(combo == Cnd_apl_dpt_cd) return getCnd_apl_dpt_cd(row, info);
		if(combo == Cnd_aprv_sts_typ) return getCnd_aprv_sts_typ(row, info);
		if(combo == BulkSet_rnd_typ) return getBulkSet_rnd_typ(row, info);
		if(combo == columnDtl_wg_cd) return getDtl_wg_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_cd) return getDtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub1) return getDtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub2) return getDtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub3) return getDtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnDtl_sppl_cd) return getDtl_sppl_cd(row, info);
		if(combo == columnDtl_maker_cd) return getDtl_maker_cd(row, info);
		if(combo == columnDtl_unit_cd) return getDtl_unit_cd(row, info);
		if(combo == columnDtl_cur_cd) return getDtl_cur_cd(row, info);
		if(combo == columnDtl_proc_upri_typ) return getDtl_proc_upri_typ(row, info);
		if(combo == columnDtl_loc_cd) return getDtl_loc_cd(row, info);
		if(combo == columnDtl_dlv_cd) return getDtl_dlv_cd(row, info);
		if(combo == columnDtl_outsrc_upri_typ) return getDtl_outsrc_upri_typ(row, info);
		if(combo == Dtl2_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getDtl2_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
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
		else if (ap == BulkSet_rev_upri) doBulkSet_rev_upri(info);
		else if (ap == BulkSet_set_dt) doBulkSet_set_dt(info);
		else if (ap == DtlBtn_correct_dup_dt) doDtlBtn_correct_dup_dt(info);
		else if (ap == DtlBtn_select_all) doDtlBtn_select_all(info);
		else if (ap == DtlBtn_deselect_all) doDtlBtn_deselect_all(info);
		else if (ap == DtlBtn_radd) doDtlBtn_radd(info);
		else if (ap == DtlBtn_rdel) doDtlBtn_rdel(info);
		else if (ap == DtlBtn_rcopy) doDtlBtn_rcopy(info);
		else if (ap == DtlBtn_upd_cmn) doDtlBtn_upd_cmn(info);
		else if (ap == DtlBtn_upd_wg) doDtlBtn_upd_wg(info);
		else if (ap == DtlBtn_upd_apl_cmn) doDtlBtn_upd_apl_cmn(info);
		else if (ap == DtlBtn_upd_apl_wg) doDtlBtn_upd_apl_wg(info);
		else if (ap == DtlBtn_del_cmn) doDtlBtn_del_cmn(info);
		else if (ap == DtlBtn_del_wg) doDtlBtn_del_wg(info);
		else if (ap == DtlBtn_del_apl_cmn) doDtlBtn_del_apl_cmn(info);
		else if (ap == DtlBtn_del_apl_wg) doDtlBtn_del_apl_wg(info);
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
	 * [BulkSet]パネルの[rev_upri]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBulkSet_rev_upri(MCEventInfo info);

	/**
	 * [BulkSet]パネルの[set_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBulkSet_set_dt(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[correct_dup_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_correct_dup_dt(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_select_all(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_radd(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_rdel(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_rcopy(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[upd_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_upd_cmn(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[upd_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_upd_wg(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[upd_apl_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_upd_apl_cmn(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[upd_apl_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_upd_apl_wg(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[del_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_del_cmn(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[del_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_del_wg(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[del_apl_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_del_apl_cmn(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[del_apl_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_del_apl_wg(MCEventInfo info);

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
		if (vc == Cnd_unit_cd) return doCnd_unit_cd_VC(info);
		if (vc == Cnd_unit_nm) return doCnd_unit_nm_VC(info);
		if (vc == Cnd_cur_cd) return doCnd_cur_cd_VC(info);
		if (vc == Cnd_cur_nm) return doCnd_cur_nm_VC(info);
		if (vc == Cnd_proc_upri_typ) return doCnd_proc_upri_typ_VC(info);
		if (vc == Cnd_proc_upri_typ_nm) return doCnd_proc_upri_typ_nm_VC(info);
		if (vc == Cnd_off_interim_flg) return doCnd_off_interim_flg_VC(info);
		if (vc == Cnd_on_interim_flg) return doCnd_on_interim_flg_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_maker_cd) return doCnd_maker_cd_VC(info);
		if (vc == Cnd_maker_nm) return doCnd_maker_nm_VC(info);
		if (vc == Cnd_sppl_cntry_cd) return doCnd_sppl_cntry_cd_VC(info);
		if (vc == Cnd_sppl_cntry_nm) return doCnd_sppl_cntry_nm_VC(info);
		if (vc == Cnd_sppl_foreign_flg) return doCnd_sppl_foreign_flg_VC(info);
		if (vc == Cnd_sppl_area_cd) return doCnd_sppl_area_cd_VC(info);
		if (vc == Cnd_sppl_area_nm) return doCnd_sppl_area_nm_VC(info);
		if (vc == Cnd_dlv_cd) return doCnd_dlv_cd_VC(info);
		if (vc == Cnd_dlv_nm) return doCnd_dlv_nm_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
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
		if (vc == Cnd_sppl_grp_cd1) return doCnd_sppl_grp_cd1_VC(info);
		if (vc == Cnd_sppl_grp_nm1) return doCnd_sppl_grp_nm1_VC(info);
		if (vc == Cnd_sppl_grp_cd2) return doCnd_sppl_grp_cd2_VC(info);
		if (vc == Cnd_sppl_grp_nm2) return doCnd_sppl_grp_nm2_VC(info);
		if (vc == Cnd_sppl_grp_cd3) return doCnd_sppl_grp_cd3_VC(info);
		if (vc == Cnd_sppl_grp_nm3) return doCnd_sppl_grp_nm3_VC(info);
		if (vc == Cnd_sppl_grp_cd4) return doCnd_sppl_grp_cd4_VC(info);
		if (vc == Cnd_sppl_grp_nm4) return doCnd_sppl_grp_nm4_VC(info);
		if (vc == Cnd_sppl_grp_cd5) return doCnd_sppl_grp_cd5_VC(info);
		if (vc == Cnd_sppl_grp_nm5) return doCnd_sppl_grp_nm5_VC(info);
		if (vc == Cnd_sppl_grp_cd6) return doCnd_sppl_grp_cd6_VC(info);
		if (vc == Cnd_sppl_grp_nm6) return doCnd_sppl_grp_nm6_VC(info);
		if (vc == Cnd_sppl_grp_cd7) return doCnd_sppl_grp_cd7_VC(info);
		if (vc == Cnd_sppl_grp_nm7) return doCnd_sppl_grp_nm7_VC(info);
		if (vc == Cnd_sppl_grp_cd8) return doCnd_sppl_grp_cd8_VC(info);
		if (vc == Cnd_sppl_grp_nm8) return doCnd_sppl_grp_nm8_VC(info);
		if (vc == Cnd_sppl_grp_cd9) return doCnd_sppl_grp_cd9_VC(info);
		if (vc == Cnd_sppl_grp_nm9) return doCnd_sppl_grp_nm9_VC(info);
		if (vc == Cnd_sppl_grp_cd10) return doCnd_sppl_grp_cd10_VC(info);
		if (vc == Cnd_sppl_grp_nm10) return doCnd_sppl_grp_nm10_VC(info);
		if (vc == Cnd_maker_grp_cd1) return doCnd_maker_grp_cd1_VC(info);
		if (vc == Cnd_maker_grp_nm1) return doCnd_maker_grp_nm1_VC(info);
		if (vc == Cnd_maker_grp_cd2) return doCnd_maker_grp_cd2_VC(info);
		if (vc == Cnd_maker_grp_nm2) return doCnd_maker_grp_nm2_VC(info);
		if (vc == Cnd_maker_grp_cd3) return doCnd_maker_grp_cd3_VC(info);
		if (vc == Cnd_maker_grp_nm3) return doCnd_maker_grp_nm3_VC(info);
		if (vc == Cnd_maker_grp_cd4) return doCnd_maker_grp_cd4_VC(info);
		if (vc == Cnd_maker_grp_nm4) return doCnd_maker_grp_nm4_VC(info);
		if (vc == Cnd_maker_grp_cd5) return doCnd_maker_grp_cd5_VC(info);
		if (vc == Cnd_maker_grp_nm5) return doCnd_maker_grp_nm5_VC(info);
		if (vc == Cnd_maker_grp_cd6) return doCnd_maker_grp_cd6_VC(info);
		if (vc == Cnd_maker_grp_nm6) return doCnd_maker_grp_nm6_VC(info);
		if (vc == Cnd_maker_grp_cd7) return doCnd_maker_grp_cd7_VC(info);
		if (vc == Cnd_maker_grp_nm7) return doCnd_maker_grp_nm7_VC(info);
		if (vc == Cnd_maker_grp_cd8) return doCnd_maker_grp_cd8_VC(info);
		if (vc == Cnd_maker_grp_nm8) return doCnd_maker_grp_nm8_VC(info);
		if (vc == Cnd_maker_grp_cd9) return doCnd_maker_grp_cd9_VC(info);
		if (vc == Cnd_maker_grp_nm9) return doCnd_maker_grp_nm9_VC(info);
		if (vc == Cnd_maker_grp_cd10) return doCnd_maker_grp_cd10_VC(info);
		if (vc == Cnd_maker_grp_nm10) return doCnd_maker_grp_nm10_VC(info);
		if (vc == Cnd_dlv_grp_cd1) return doCnd_dlv_grp_cd1_VC(info);
		if (vc == Cnd_dlv_grp_nm1) return doCnd_dlv_grp_nm1_VC(info);
		if (vc == Cnd_dlv_grp_cd2) return doCnd_dlv_grp_cd2_VC(info);
		if (vc == Cnd_dlv_grp_nm2) return doCnd_dlv_grp_nm2_VC(info);
		if (vc == Cnd_dlv_grp_cd3) return doCnd_dlv_grp_cd3_VC(info);
		if (vc == Cnd_dlv_grp_nm3) return doCnd_dlv_grp_nm3_VC(info);
		if (vc == Cnd_dlv_grp_cd4) return doCnd_dlv_grp_cd4_VC(info);
		if (vc == Cnd_dlv_grp_nm4) return doCnd_dlv_grp_nm4_VC(info);
		if (vc == Cnd_dlv_grp_cd5) return doCnd_dlv_grp_cd5_VC(info);
		if (vc == Cnd_dlv_grp_nm5) return doCnd_dlv_grp_nm5_VC(info);
		if (vc == Cnd_dlv_grp_cd6) return doCnd_dlv_grp_cd6_VC(info);
		if (vc == Cnd_dlv_grp_nm6) return doCnd_dlv_grp_nm6_VC(info);
		if (vc == Cnd_dlv_grp_cd7) return doCnd_dlv_grp_cd7_VC(info);
		if (vc == Cnd_dlv_grp_nm7) return doCnd_dlv_grp_nm7_VC(info);
		if (vc == Cnd_dlv_grp_cd8) return doCnd_dlv_grp_cd8_VC(info);
		if (vc == Cnd_dlv_grp_nm8) return doCnd_dlv_grp_nm8_VC(info);
		if (vc == Cnd_dlv_grp_cd9) return doCnd_dlv_grp_cd9_VC(info);
		if (vc == Cnd_dlv_grp_nm9) return doCnd_dlv_grp_nm9_VC(info);
		if (vc == Cnd_dlv_grp_cd10) return doCnd_dlv_grp_cd10_VC(info);
		if (vc == Cnd_dlv_grp_nm10) return doCnd_dlv_grp_nm10_VC(info);
		if (vc == Cnd_apl_no) return doCnd_apl_no_VC(info);
		if (vc == Cnd_aprv_no) return doCnd_aprv_no_VC(info);
		if (vc == Cnd_apl_dt_fr) return doCnd_apl_dt_fr_VC(info);
		if (vc == Cnd_apl_dt_to) return doCnd_apl_dt_to_VC(info);
		if (vc == Cnd_apl_usr_cd) return doCnd_apl_usr_cd_VC(info);
		if (vc == Cnd_apl_usr_nm) return doCnd_apl_usr_nm_VC(info);
		if (vc == Cnd_apl_dpt_cd) return doCnd_apl_dpt_cd_VC(info);
		if (vc == Cnd_apl_dpt_nm) return doCnd_apl_dpt_nm_VC(info);
		if (vc == Cnd_aprv_sts_typ) return doCnd_aprv_sts_typ_VC(info);
		if (vc == Cnd_aprv_sts_typ_nm) return doCnd_aprv_sts_typ_nm_VC(info);
		if (vc == BulkSet_rev_rate) return doBulkSet_rev_rate_VC(info);
		if (vc == BulkSet_rnd_typ) return doBulkSet_rnd_typ_VC(info);
		if (vc == BulkSet_rnd_typ_nm) return doBulkSet_rnd_typ_nm_VC(info);
		if (vc == BulkSet_rev_date) return doBulkSet_rev_date_VC(info);
		if (vc == BulkSet_st_dt) return doBulkSet_st_dt_VC(info);
		if (vc == BulkSet_end_dt) return doBulkSet_end_dt_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_wg_nm) return doDtl_wg_nm_VC(info);
		if (vc == columnDtl_itm_typ) return doDtl_itm_typ_VC(info);
		if (vc == columnDtl_itm_typ_nm) return doDtl_itm_typ_nm_VC(info);
		if (vc == columnDtl_itm_typ_d_cd) return doDtl_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_itm_typ_d_nm) return doDtl_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_sppl_cd) return doDtl_sppl_cd_VC(info);
		if (vc == columnDtl_sppl_nm) return doDtl_sppl_nm_VC(info);
		if (vc == columnDtl_maker_cd) return doDtl_maker_cd_VC(info);
		if (vc == columnDtl_maker_nm) return doDtl_maker_nm_VC(info);
		if (vc == columnDtl_unit_cd) return doDtl_unit_cd_VC(info);
		if (vc == columnDtl_unit_nm) return doDtl_unit_nm_VC(info);
		if (vc == columnDtl_dec_place) return doDtl_dec_place_VC(info);
		if (vc == columnDtl_cur_cd) return doDtl_cur_cd_VC(info);
		if (vc == columnDtl_cur_nm) return doDtl_cur_nm_VC(info);
		if (vc == columnDtl_upri_dec_place) return doDtl_upri_dec_place_VC(info);
		if (vc == columnDtl_proc_upri_typ) return doDtl_proc_upri_typ_VC(info);
		if (vc == columnDtl_proc_upri_typ_nm) return doDtl_proc_upri_typ_nm_VC(info);
		if (vc == columnDtl_loc_cd) return doDtl_loc_cd_VC(info);
		if (vc == columnDtl_loc_nm) return doDtl_loc_nm_VC(info);
		if (vc == columnDtl_dlv_cd) return doDtl_dlv_cd_VC(info);
		if (vc == columnDtl_dlv_nm) return doDtl_dlv_nm_VC(info);
		if (vc == columnDtl_outsrc_upri_typ) return doDtl_outsrc_upri_typ_VC(info);
		if (vc == columnDtl_outsrc_upri_typ_nm) return doDtl_outsrc_upri_typ_nm_VC(info);
		if (vc == columnDtl_purc_tax_cd) return doDtl_purc_tax_cd_VC(info);
		if (vc == columnDtl_purc_tax_nm) return doDtl_purc_tax_nm_VC(info);
		if (vc == columnDtl_interim_flg) return doDtl_interim_flg_VC(info);
		if (vc == columnDtl_std_wk_cost) return doDtl_std_wk_cost_VC(info);
		if (vc == columnDtl_std_wk_cost_upri) return doDtl_std_wk_cost_upri_VC(info);
		if (vc == columnDtl_not_cost_flg) return doDtl_not_cost_flg_VC(info);
		if (vc == columnDtl_memo1) return doDtl_memo1_VC(info);
		if (vc == columnDtl_memo2) return doDtl_memo2_VC(info);
		if (vc == columnDtl_memo3) return doDtl_memo3_VC(info);
		if (vc == columnDtl_apl_no) return doDtl_apl_no_VC(info);
		if (vc == columnDtl_st_dt_bf) return doDtl_st_dt_bf_VC(info);
		if (vc == columnDtl_apl_dt) return doDtl_apl_dt_VC(info);
		if (vc == columnDtl_apl_usr_cd) return doDtl_apl_usr_cd_VC(info);
		if (vc == columnDtl_apl_usr_nm) return doDtl_apl_usr_nm_VC(info);
		if (vc == columnDtl_apl_dpt_cd) return doDtl_apl_dpt_cd_VC(info);
		if (vc == columnDtl_apl_dpt_nm) return doDtl_apl_dpt_nm_VC(info);
		if (vc == columnDtl_ref_flg) return doDtl_ref_flg_VC(info);
		if (vc == columnDtl_mst_apl_memo) return doDtl_mst_apl_memo_VC(info);
		if (vc == columnDtl_aprv_no) return doDtl_aprv_no_VC(info);
		if (vc == columnDtl_aprv_sts_typ) return doDtl_aprv_sts_typ_VC(info);
		if (vc == columnDtl_aprv_sts_typ_nm) return doDtl_aprv_sts_typ_nm_VC(info);
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
		if (vc == Dtl2_apl_dt) return doDtl2_apl_dt_VC(info);
		if (vc == Dtl2_apl_no) return doDtl2_apl_no_VC(info);
		if (vc == Dtl2_aprv_no) return doDtl2_aprv_no_VC(info);
		if (vc == Dtl2_mst_apl_memo) return doDtl2_mst_apl_memo_VC(info);
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
	 * [Cnd]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[proc_upri_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_proc_upri_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[proc_upri_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_proc_upri_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[off_interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_off_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[on_interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_on_interim_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_cntry_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_cntry_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_cntry_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_cntry_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_foreign_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_foreign_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_area_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_area_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_area_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_area_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[apl_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_apl_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[apl_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_apl_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[apl_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_apl_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[apl_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_apl_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[apl_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_apl_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[apl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_apl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[apl_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_apl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_aprv_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[rev_rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_rev_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[rev_date]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_rev_date_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upri_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upri_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[proc_upri_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_proc_upri_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[proc_upri_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_proc_upri_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[outsrc_upri_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_outsrc_upri_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_outsrc_upri_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[interim_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_interim_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_wk_cost]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_wk_cost_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_wk_cost_upri]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_wk_cost_upri_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[apl_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_apl_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[st_dt_bf]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_st_dt_bf_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[apl_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_apl_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[apl_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_apl_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[apl_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_apl_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[apl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_apl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[apl_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_apl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ref_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ref_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mst_apl_memo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mst_apl_memo_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_aprv_sts_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl2]パネルの[apl_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_apl_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[apl_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_apl_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[aprv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_aprv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl2]パネルの[mst_apl_memo]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl2_mst_apl_memo_VC(MCEventInfo info){
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
		else if (nc == Cnd_unit_cd) doCnd_unit_cd_NC(info);
		else if (nc == Cnd_unit_nm) doCnd_unit_nm_NC(info);
		else if (nc == Cnd_cur_cd) doCnd_cur_cd_NC(info);
		else if (nc == Cnd_cur_nm) doCnd_cur_nm_NC(info);
		else if (nc == Cnd_proc_upri_typ) doCnd_proc_upri_typ_NC(info);
		else if (nc == Cnd_proc_upri_typ_nm) doCnd_proc_upri_typ_nm_NC(info);
		else if (nc == Cnd_off_interim_flg) doCnd_off_interim_flg_NC(info);
		else if (nc == Cnd_on_interim_flg) doCnd_on_interim_flg_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_maker_cd) doCnd_maker_cd_NC(info);
		else if (nc == Cnd_maker_nm) doCnd_maker_nm_NC(info);
		else if (nc == Cnd_sppl_cntry_cd) doCnd_sppl_cntry_cd_NC(info);
		else if (nc == Cnd_sppl_cntry_nm) doCnd_sppl_cntry_nm_NC(info);
		else if (nc == Cnd_sppl_foreign_flg) doCnd_sppl_foreign_flg_NC(info);
		else if (nc == Cnd_sppl_area_cd) doCnd_sppl_area_cd_NC(info);
		else if (nc == Cnd_sppl_area_nm) doCnd_sppl_area_nm_NC(info);
		else if (nc == Cnd_dlv_cd) doCnd_dlv_cd_NC(info);
		else if (nc == Cnd_dlv_nm) doCnd_dlv_nm_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
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
		else if (nc == Cnd_sppl_grp_cd1) doCnd_sppl_grp_cd1_NC(info);
		else if (nc == Cnd_sppl_grp_nm1) doCnd_sppl_grp_nm1_NC(info);
		else if (nc == Cnd_sppl_grp_cd2) doCnd_sppl_grp_cd2_NC(info);
		else if (nc == Cnd_sppl_grp_nm2) doCnd_sppl_grp_nm2_NC(info);
		else if (nc == Cnd_sppl_grp_cd3) doCnd_sppl_grp_cd3_NC(info);
		else if (nc == Cnd_sppl_grp_nm3) doCnd_sppl_grp_nm3_NC(info);
		else if (nc == Cnd_sppl_grp_cd4) doCnd_sppl_grp_cd4_NC(info);
		else if (nc == Cnd_sppl_grp_nm4) doCnd_sppl_grp_nm4_NC(info);
		else if (nc == Cnd_sppl_grp_cd5) doCnd_sppl_grp_cd5_NC(info);
		else if (nc == Cnd_sppl_grp_nm5) doCnd_sppl_grp_nm5_NC(info);
		else if (nc == Cnd_sppl_grp_cd6) doCnd_sppl_grp_cd6_NC(info);
		else if (nc == Cnd_sppl_grp_nm6) doCnd_sppl_grp_nm6_NC(info);
		else if (nc == Cnd_sppl_grp_cd7) doCnd_sppl_grp_cd7_NC(info);
		else if (nc == Cnd_sppl_grp_nm7) doCnd_sppl_grp_nm7_NC(info);
		else if (nc == Cnd_sppl_grp_cd8) doCnd_sppl_grp_cd8_NC(info);
		else if (nc == Cnd_sppl_grp_nm8) doCnd_sppl_grp_nm8_NC(info);
		else if (nc == Cnd_sppl_grp_cd9) doCnd_sppl_grp_cd9_NC(info);
		else if (nc == Cnd_sppl_grp_nm9) doCnd_sppl_grp_nm9_NC(info);
		else if (nc == Cnd_sppl_grp_cd10) doCnd_sppl_grp_cd10_NC(info);
		else if (nc == Cnd_sppl_grp_nm10) doCnd_sppl_grp_nm10_NC(info);
		else if (nc == Cnd_maker_grp_cd1) doCnd_maker_grp_cd1_NC(info);
		else if (nc == Cnd_maker_grp_nm1) doCnd_maker_grp_nm1_NC(info);
		else if (nc == Cnd_maker_grp_cd2) doCnd_maker_grp_cd2_NC(info);
		else if (nc == Cnd_maker_grp_nm2) doCnd_maker_grp_nm2_NC(info);
		else if (nc == Cnd_maker_grp_cd3) doCnd_maker_grp_cd3_NC(info);
		else if (nc == Cnd_maker_grp_nm3) doCnd_maker_grp_nm3_NC(info);
		else if (nc == Cnd_maker_grp_cd4) doCnd_maker_grp_cd4_NC(info);
		else if (nc == Cnd_maker_grp_nm4) doCnd_maker_grp_nm4_NC(info);
		else if (nc == Cnd_maker_grp_cd5) doCnd_maker_grp_cd5_NC(info);
		else if (nc == Cnd_maker_grp_nm5) doCnd_maker_grp_nm5_NC(info);
		else if (nc == Cnd_maker_grp_cd6) doCnd_maker_grp_cd6_NC(info);
		else if (nc == Cnd_maker_grp_nm6) doCnd_maker_grp_nm6_NC(info);
		else if (nc == Cnd_maker_grp_cd7) doCnd_maker_grp_cd7_NC(info);
		else if (nc == Cnd_maker_grp_nm7) doCnd_maker_grp_nm7_NC(info);
		else if (nc == Cnd_maker_grp_cd8) doCnd_maker_grp_cd8_NC(info);
		else if (nc == Cnd_maker_grp_nm8) doCnd_maker_grp_nm8_NC(info);
		else if (nc == Cnd_maker_grp_cd9) doCnd_maker_grp_cd9_NC(info);
		else if (nc == Cnd_maker_grp_nm9) doCnd_maker_grp_nm9_NC(info);
		else if (nc == Cnd_maker_grp_cd10) doCnd_maker_grp_cd10_NC(info);
		else if (nc == Cnd_maker_grp_nm10) doCnd_maker_grp_nm10_NC(info);
		else if (nc == Cnd_dlv_grp_cd1) doCnd_dlv_grp_cd1_NC(info);
		else if (nc == Cnd_dlv_grp_nm1) doCnd_dlv_grp_nm1_NC(info);
		else if (nc == Cnd_dlv_grp_cd2) doCnd_dlv_grp_cd2_NC(info);
		else if (nc == Cnd_dlv_grp_nm2) doCnd_dlv_grp_nm2_NC(info);
		else if (nc == Cnd_dlv_grp_cd3) doCnd_dlv_grp_cd3_NC(info);
		else if (nc == Cnd_dlv_grp_nm3) doCnd_dlv_grp_nm3_NC(info);
		else if (nc == Cnd_dlv_grp_cd4) doCnd_dlv_grp_cd4_NC(info);
		else if (nc == Cnd_dlv_grp_nm4) doCnd_dlv_grp_nm4_NC(info);
		else if (nc == Cnd_dlv_grp_cd5) doCnd_dlv_grp_cd5_NC(info);
		else if (nc == Cnd_dlv_grp_nm5) doCnd_dlv_grp_nm5_NC(info);
		else if (nc == Cnd_dlv_grp_cd6) doCnd_dlv_grp_cd6_NC(info);
		else if (nc == Cnd_dlv_grp_nm6) doCnd_dlv_grp_nm6_NC(info);
		else if (nc == Cnd_dlv_grp_cd7) doCnd_dlv_grp_cd7_NC(info);
		else if (nc == Cnd_dlv_grp_nm7) doCnd_dlv_grp_nm7_NC(info);
		else if (nc == Cnd_dlv_grp_cd8) doCnd_dlv_grp_cd8_NC(info);
		else if (nc == Cnd_dlv_grp_nm8) doCnd_dlv_grp_nm8_NC(info);
		else if (nc == Cnd_dlv_grp_cd9) doCnd_dlv_grp_cd9_NC(info);
		else if (nc == Cnd_dlv_grp_nm9) doCnd_dlv_grp_nm9_NC(info);
		else if (nc == Cnd_dlv_grp_cd10) doCnd_dlv_grp_cd10_NC(info);
		else if (nc == Cnd_dlv_grp_nm10) doCnd_dlv_grp_nm10_NC(info);
		else if (nc == Cnd_apl_no) doCnd_apl_no_NC(info);
		else if (nc == Cnd_aprv_no) doCnd_aprv_no_NC(info);
		else if (nc == Cnd_apl_dt_fr) doCnd_apl_dt_fr_NC(info);
		else if (nc == Cnd_apl_dt_to) doCnd_apl_dt_to_NC(info);
		else if (nc == Cnd_apl_usr_cd) doCnd_apl_usr_cd_NC(info);
		else if (nc == Cnd_apl_usr_nm) doCnd_apl_usr_nm_NC(info);
		else if (nc == Cnd_apl_dpt_cd) doCnd_apl_dpt_cd_NC(info);
		else if (nc == Cnd_apl_dpt_nm) doCnd_apl_dpt_nm_NC(info);
		else if (nc == Cnd_aprv_sts_typ) doCnd_aprv_sts_typ_NC(info);
		else if (nc == Cnd_aprv_sts_typ_nm) doCnd_aprv_sts_typ_nm_NC(info);
		else if (nc == BulkSet_rev_rate) doBulkSet_rev_rate_NC(info);
		else if (nc == BulkSet_rnd_typ) doBulkSet_rnd_typ_NC(info);
		else if (nc == BulkSet_rnd_typ_nm) doBulkSet_rnd_typ_nm_NC(info);
		else if (nc == BulkSet_rev_date) doBulkSet_rev_date_NC(info);
		else if (nc == BulkSet_st_dt) doBulkSet_st_dt_NC(info);
		else if (nc == BulkSet_end_dt) doBulkSet_end_dt_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_wg_nm) doDtl_wg_nm_NC(info);
		else if (nc == columnDtl_itm_typ) doDtl_itm_typ_NC(info);
		else if (nc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NC(info);
		else if (nc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_sppl_cd) doDtl_sppl_cd_NC(info);
		else if (nc == columnDtl_sppl_nm) doDtl_sppl_nm_NC(info);
		else if (nc == columnDtl_maker_cd) doDtl_maker_cd_NC(info);
		else if (nc == columnDtl_maker_nm) doDtl_maker_nm_NC(info);
		else if (nc == columnDtl_unit_cd) doDtl_unit_cd_NC(info);
		else if (nc == columnDtl_unit_nm) doDtl_unit_nm_NC(info);
		else if (nc == columnDtl_dec_place) doDtl_dec_place_NC(info);
		else if (nc == columnDtl_cur_cd) doDtl_cur_cd_NC(info);
		else if (nc == columnDtl_cur_nm) doDtl_cur_nm_NC(info);
		else if (nc == columnDtl_upri_dec_place) doDtl_upri_dec_place_NC(info);
		else if (nc == columnDtl_proc_upri_typ) doDtl_proc_upri_typ_NC(info);
		else if (nc == columnDtl_proc_upri_typ_nm) doDtl_proc_upri_typ_nm_NC(info);
		else if (nc == columnDtl_loc_cd) doDtl_loc_cd_NC(info);
		else if (nc == columnDtl_loc_nm) doDtl_loc_nm_NC(info);
		else if (nc == columnDtl_dlv_cd) doDtl_dlv_cd_NC(info);
		else if (nc == columnDtl_dlv_nm) doDtl_dlv_nm_NC(info);
		else if (nc == columnDtl_outsrc_upri_typ) doDtl_outsrc_upri_typ_NC(info);
		else if (nc == columnDtl_outsrc_upri_typ_nm) doDtl_outsrc_upri_typ_nm_NC(info);
		else if (nc == columnDtl_purc_tax_cd) doDtl_purc_tax_cd_NC(info);
		else if (nc == columnDtl_purc_tax_nm) doDtl_purc_tax_nm_NC(info);
		else if (nc == columnDtl_interim_flg) doDtl_interim_flg_NC(info);
		else if (nc == columnDtl_std_wk_cost) doDtl_std_wk_cost_NC(info);
		else if (nc == columnDtl_std_wk_cost_upri) doDtl_std_wk_cost_upri_NC(info);
		else if (nc == columnDtl_not_cost_flg) doDtl_not_cost_flg_NC(info);
		else if (nc == columnDtl_memo1) doDtl_memo1_NC(info);
		else if (nc == columnDtl_memo2) doDtl_memo2_NC(info);
		else if (nc == columnDtl_memo3) doDtl_memo3_NC(info);
		else if (nc == columnDtl_apl_no) doDtl_apl_no_NC(info);
		else if (nc == columnDtl_st_dt_bf) doDtl_st_dt_bf_NC(info);
		else if (nc == columnDtl_apl_dt) doDtl_apl_dt_NC(info);
		else if (nc == columnDtl_apl_usr_cd) doDtl_apl_usr_cd_NC(info);
		else if (nc == columnDtl_apl_usr_nm) doDtl_apl_usr_nm_NC(info);
		else if (nc == columnDtl_apl_dpt_cd) doDtl_apl_dpt_cd_NC(info);
		else if (nc == columnDtl_apl_dpt_nm) doDtl_apl_dpt_nm_NC(info);
		else if (nc == columnDtl_ref_flg) doDtl_ref_flg_NC(info);
		else if (nc == columnDtl_mst_apl_memo) doDtl_mst_apl_memo_NC(info);
		else if (nc == columnDtl_aprv_no) doDtl_aprv_no_NC(info);
		else if (nc == columnDtl_aprv_sts_typ) doDtl_aprv_sts_typ_NC(info);
		else if (nc == columnDtl_aprv_sts_typ_nm) doDtl_aprv_sts_typ_nm_NC(info);
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
		else if (nc == Dtl2_apl_dt) doDtl2_apl_dt_NC(info);
		else if (nc == Dtl2_apl_no) doDtl2_apl_no_NC(info);
		else if (nc == Dtl2_aprv_no) doDtl2_aprv_no_NC(info);
		else if (nc == Dtl2_mst_apl_memo) doDtl2_mst_apl_memo_NC(info);
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
	 * [Cnd]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_upri_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_upri_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_upri_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_upri_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_interim_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cntry_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cntry_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cntry_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cntry_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_foreign_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_foreign_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_area_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_area_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_area_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_area_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rev_rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rev_rate_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rev_date]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rev_date_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upri_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upri_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_typ_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[outsrc_upri_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[interim_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_interim_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_wk_cost]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_wk_cost_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_wk_cost_upri]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_wk_cost_upri_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[apl_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_dt_bf]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_dt_bf_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[apl_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[apl_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[apl_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[apl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[apl_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_apl_memo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_apl_memo_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_nm_NC(MCEventInfo info){
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
	 * [Dtl2]パネルの[apl_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_apl_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[apl_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_apl_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[mst_apl_memo]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_mst_apl_memo_NC(MCEventInfo info){
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
		else if (ne == Cnd_unit_cd) doCnd_unit_cd_NE(info);
		else if (ne == Cnd_unit_nm) doCnd_unit_nm_NE(info);
		else if (ne == Cnd_cur_cd) doCnd_cur_cd_NE(info);
		else if (ne == Cnd_cur_nm) doCnd_cur_nm_NE(info);
		else if (ne == Cnd_proc_upri_typ) doCnd_proc_upri_typ_NE(info);
		else if (ne == Cnd_proc_upri_typ_nm) doCnd_proc_upri_typ_nm_NE(info);
		else if (ne == Cnd_off_interim_flg) doCnd_off_interim_flg_NE(info);
		else if (ne == Cnd_on_interim_flg) doCnd_on_interim_flg_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_maker_cd) doCnd_maker_cd_NE(info);
		else if (ne == Cnd_maker_nm) doCnd_maker_nm_NE(info);
		else if (ne == Cnd_sppl_cntry_cd) doCnd_sppl_cntry_cd_NE(info);
		else if (ne == Cnd_sppl_cntry_nm) doCnd_sppl_cntry_nm_NE(info);
		else if (ne == Cnd_sppl_foreign_flg) doCnd_sppl_foreign_flg_NE(info);
		else if (ne == Cnd_sppl_area_cd) doCnd_sppl_area_cd_NE(info);
		else if (ne == Cnd_sppl_area_nm) doCnd_sppl_area_nm_NE(info);
		else if (ne == Cnd_dlv_cd) doCnd_dlv_cd_NE(info);
		else if (ne == Cnd_dlv_nm) doCnd_dlv_nm_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
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
		else if (ne == Cnd_sppl_grp_cd1) doCnd_sppl_grp_cd1_NE(info);
		else if (ne == Cnd_sppl_grp_nm1) doCnd_sppl_grp_nm1_NE(info);
		else if (ne == Cnd_sppl_grp_cd2) doCnd_sppl_grp_cd2_NE(info);
		else if (ne == Cnd_sppl_grp_nm2) doCnd_sppl_grp_nm2_NE(info);
		else if (ne == Cnd_sppl_grp_cd3) doCnd_sppl_grp_cd3_NE(info);
		else if (ne == Cnd_sppl_grp_nm3) doCnd_sppl_grp_nm3_NE(info);
		else if (ne == Cnd_sppl_grp_cd4) doCnd_sppl_grp_cd4_NE(info);
		else if (ne == Cnd_sppl_grp_nm4) doCnd_sppl_grp_nm4_NE(info);
		else if (ne == Cnd_sppl_grp_cd5) doCnd_sppl_grp_cd5_NE(info);
		else if (ne == Cnd_sppl_grp_nm5) doCnd_sppl_grp_nm5_NE(info);
		else if (ne == Cnd_sppl_grp_cd6) doCnd_sppl_grp_cd6_NE(info);
		else if (ne == Cnd_sppl_grp_nm6) doCnd_sppl_grp_nm6_NE(info);
		else if (ne == Cnd_sppl_grp_cd7) doCnd_sppl_grp_cd7_NE(info);
		else if (ne == Cnd_sppl_grp_nm7) doCnd_sppl_grp_nm7_NE(info);
		else if (ne == Cnd_sppl_grp_cd8) doCnd_sppl_grp_cd8_NE(info);
		else if (ne == Cnd_sppl_grp_nm8) doCnd_sppl_grp_nm8_NE(info);
		else if (ne == Cnd_sppl_grp_cd9) doCnd_sppl_grp_cd9_NE(info);
		else if (ne == Cnd_sppl_grp_nm9) doCnd_sppl_grp_nm9_NE(info);
		else if (ne == Cnd_sppl_grp_cd10) doCnd_sppl_grp_cd10_NE(info);
		else if (ne == Cnd_sppl_grp_nm10) doCnd_sppl_grp_nm10_NE(info);
		else if (ne == Cnd_maker_grp_cd1) doCnd_maker_grp_cd1_NE(info);
		else if (ne == Cnd_maker_grp_nm1) doCnd_maker_grp_nm1_NE(info);
		else if (ne == Cnd_maker_grp_cd2) doCnd_maker_grp_cd2_NE(info);
		else if (ne == Cnd_maker_grp_nm2) doCnd_maker_grp_nm2_NE(info);
		else if (ne == Cnd_maker_grp_cd3) doCnd_maker_grp_cd3_NE(info);
		else if (ne == Cnd_maker_grp_nm3) doCnd_maker_grp_nm3_NE(info);
		else if (ne == Cnd_maker_grp_cd4) doCnd_maker_grp_cd4_NE(info);
		else if (ne == Cnd_maker_grp_nm4) doCnd_maker_grp_nm4_NE(info);
		else if (ne == Cnd_maker_grp_cd5) doCnd_maker_grp_cd5_NE(info);
		else if (ne == Cnd_maker_grp_nm5) doCnd_maker_grp_nm5_NE(info);
		else if (ne == Cnd_maker_grp_cd6) doCnd_maker_grp_cd6_NE(info);
		else if (ne == Cnd_maker_grp_nm6) doCnd_maker_grp_nm6_NE(info);
		else if (ne == Cnd_maker_grp_cd7) doCnd_maker_grp_cd7_NE(info);
		else if (ne == Cnd_maker_grp_nm7) doCnd_maker_grp_nm7_NE(info);
		else if (ne == Cnd_maker_grp_cd8) doCnd_maker_grp_cd8_NE(info);
		else if (ne == Cnd_maker_grp_nm8) doCnd_maker_grp_nm8_NE(info);
		else if (ne == Cnd_maker_grp_cd9) doCnd_maker_grp_cd9_NE(info);
		else if (ne == Cnd_maker_grp_nm9) doCnd_maker_grp_nm9_NE(info);
		else if (ne == Cnd_maker_grp_cd10) doCnd_maker_grp_cd10_NE(info);
		else if (ne == Cnd_maker_grp_nm10) doCnd_maker_grp_nm10_NE(info);
		else if (ne == Cnd_dlv_grp_cd1) doCnd_dlv_grp_cd1_NE(info);
		else if (ne == Cnd_dlv_grp_nm1) doCnd_dlv_grp_nm1_NE(info);
		else if (ne == Cnd_dlv_grp_cd2) doCnd_dlv_grp_cd2_NE(info);
		else if (ne == Cnd_dlv_grp_nm2) doCnd_dlv_grp_nm2_NE(info);
		else if (ne == Cnd_dlv_grp_cd3) doCnd_dlv_grp_cd3_NE(info);
		else if (ne == Cnd_dlv_grp_nm3) doCnd_dlv_grp_nm3_NE(info);
		else if (ne == Cnd_dlv_grp_cd4) doCnd_dlv_grp_cd4_NE(info);
		else if (ne == Cnd_dlv_grp_nm4) doCnd_dlv_grp_nm4_NE(info);
		else if (ne == Cnd_dlv_grp_cd5) doCnd_dlv_grp_cd5_NE(info);
		else if (ne == Cnd_dlv_grp_nm5) doCnd_dlv_grp_nm5_NE(info);
		else if (ne == Cnd_dlv_grp_cd6) doCnd_dlv_grp_cd6_NE(info);
		else if (ne == Cnd_dlv_grp_nm6) doCnd_dlv_grp_nm6_NE(info);
		else if (ne == Cnd_dlv_grp_cd7) doCnd_dlv_grp_cd7_NE(info);
		else if (ne == Cnd_dlv_grp_nm7) doCnd_dlv_grp_nm7_NE(info);
		else if (ne == Cnd_dlv_grp_cd8) doCnd_dlv_grp_cd8_NE(info);
		else if (ne == Cnd_dlv_grp_nm8) doCnd_dlv_grp_nm8_NE(info);
		else if (ne == Cnd_dlv_grp_cd9) doCnd_dlv_grp_cd9_NE(info);
		else if (ne == Cnd_dlv_grp_nm9) doCnd_dlv_grp_nm9_NE(info);
		else if (ne == Cnd_dlv_grp_cd10) doCnd_dlv_grp_cd10_NE(info);
		else if (ne == Cnd_dlv_grp_nm10) doCnd_dlv_grp_nm10_NE(info);
		else if (ne == Cnd_apl_no) doCnd_apl_no_NE(info);
		else if (ne == Cnd_aprv_no) doCnd_aprv_no_NE(info);
		else if (ne == Cnd_apl_dt_fr) doCnd_apl_dt_fr_NE(info);
		else if (ne == Cnd_apl_dt_to) doCnd_apl_dt_to_NE(info);
		else if (ne == Cnd_apl_usr_cd) doCnd_apl_usr_cd_NE(info);
		else if (ne == Cnd_apl_usr_nm) doCnd_apl_usr_nm_NE(info);
		else if (ne == Cnd_apl_dpt_cd) doCnd_apl_dpt_cd_NE(info);
		else if (ne == Cnd_apl_dpt_nm) doCnd_apl_dpt_nm_NE(info);
		else if (ne == Cnd_aprv_sts_typ) doCnd_aprv_sts_typ_NE(info);
		else if (ne == Cnd_aprv_sts_typ_nm) doCnd_aprv_sts_typ_nm_NE(info);
		else if (ne == BulkSet_rev_rate) doBulkSet_rev_rate_NE(info);
		else if (ne == BulkSet_rnd_typ) doBulkSet_rnd_typ_NE(info);
		else if (ne == BulkSet_rnd_typ_nm) doBulkSet_rnd_typ_nm_NE(info);
		else if (ne == BulkSet_rev_date) doBulkSet_rev_date_NE(info);
		else if (ne == BulkSet_st_dt) doBulkSet_st_dt_NE(info);
		else if (ne == BulkSet_end_dt) doBulkSet_end_dt_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_wg_nm) doDtl_wg_nm_NE(info);
		else if (ne == columnDtl_itm_typ) doDtl_itm_typ_NE(info);
		else if (ne == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NE(info);
		else if (ne == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_sppl_cd) doDtl_sppl_cd_NE(info);
		else if (ne == columnDtl_sppl_nm) doDtl_sppl_nm_NE(info);
		else if (ne == columnDtl_maker_cd) doDtl_maker_cd_NE(info);
		else if (ne == columnDtl_maker_nm) doDtl_maker_nm_NE(info);
		else if (ne == columnDtl_unit_cd) doDtl_unit_cd_NE(info);
		else if (ne == columnDtl_unit_nm) doDtl_unit_nm_NE(info);
		else if (ne == columnDtl_dec_place) doDtl_dec_place_NE(info);
		else if (ne == columnDtl_cur_cd) doDtl_cur_cd_NE(info);
		else if (ne == columnDtl_cur_nm) doDtl_cur_nm_NE(info);
		else if (ne == columnDtl_upri_dec_place) doDtl_upri_dec_place_NE(info);
		else if (ne == columnDtl_proc_upri_typ) doDtl_proc_upri_typ_NE(info);
		else if (ne == columnDtl_proc_upri_typ_nm) doDtl_proc_upri_typ_nm_NE(info);
		else if (ne == columnDtl_loc_cd) doDtl_loc_cd_NE(info);
		else if (ne == columnDtl_loc_nm) doDtl_loc_nm_NE(info);
		else if (ne == columnDtl_dlv_cd) doDtl_dlv_cd_NE(info);
		else if (ne == columnDtl_dlv_nm) doDtl_dlv_nm_NE(info);
		else if (ne == columnDtl_outsrc_upri_typ) doDtl_outsrc_upri_typ_NE(info);
		else if (ne == columnDtl_outsrc_upri_typ_nm) doDtl_outsrc_upri_typ_nm_NE(info);
		else if (ne == columnDtl_purc_tax_cd) doDtl_purc_tax_cd_NE(info);
		else if (ne == columnDtl_purc_tax_nm) doDtl_purc_tax_nm_NE(info);
		else if (ne == columnDtl_interim_flg) doDtl_interim_flg_NE(info);
		else if (ne == columnDtl_std_wk_cost) doDtl_std_wk_cost_NE(info);
		else if (ne == columnDtl_std_wk_cost_upri) doDtl_std_wk_cost_upri_NE(info);
		else if (ne == columnDtl_not_cost_flg) doDtl_not_cost_flg_NE(info);
		else if (ne == columnDtl_memo1) doDtl_memo1_NE(info);
		else if (ne == columnDtl_memo2) doDtl_memo2_NE(info);
		else if (ne == columnDtl_memo3) doDtl_memo3_NE(info);
		else if (ne == columnDtl_apl_no) doDtl_apl_no_NE(info);
		else if (ne == columnDtl_st_dt_bf) doDtl_st_dt_bf_NE(info);
		else if (ne == columnDtl_apl_dt) doDtl_apl_dt_NE(info);
		else if (ne == columnDtl_apl_usr_cd) doDtl_apl_usr_cd_NE(info);
		else if (ne == columnDtl_apl_usr_nm) doDtl_apl_usr_nm_NE(info);
		else if (ne == columnDtl_apl_dpt_cd) doDtl_apl_dpt_cd_NE(info);
		else if (ne == columnDtl_apl_dpt_nm) doDtl_apl_dpt_nm_NE(info);
		else if (ne == columnDtl_ref_flg) doDtl_ref_flg_NE(info);
		else if (ne == columnDtl_mst_apl_memo) doDtl_mst_apl_memo_NE(info);
		else if (ne == columnDtl_aprv_no) doDtl_aprv_no_NE(info);
		else if (ne == columnDtl_aprv_sts_typ) doDtl_aprv_sts_typ_NE(info);
		else if (ne == columnDtl_aprv_sts_typ_nm) doDtl_aprv_sts_typ_nm_NE(info);
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
		else if (ne == Dtl2_apl_dt) doDtl2_apl_dt_NE(info);
		else if (ne == Dtl2_apl_no) doDtl2_apl_no_NE(info);
		else if (ne == Dtl2_aprv_no) doDtl2_aprv_no_NE(info);
		else if (ne == Dtl2_mst_apl_memo) doDtl2_mst_apl_memo_NE(info);
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
	 * [Cnd]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_upri_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_upri_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_upri_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_upri_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_interim_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cntry_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cntry_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cntry_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cntry_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_foreign_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_foreign_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_area_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_area_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_area_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_area_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rev_rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rev_rate_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rev_date]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rev_date_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upri_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upri_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_typ_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[outsrc_upri_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[interim_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_interim_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_wk_cost]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_wk_cost_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_wk_cost_upri]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_wk_cost_upri_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[apl_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_dt_bf]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_dt_bf_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[apl_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[apl_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[apl_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[apl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[apl_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_apl_memo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_apl_memo_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_nm_NE(MCEventInfo info){
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
	 * [Dtl2]パネルの[apl_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_apl_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[apl_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_apl_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[mst_apl_memo]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_mst_apl_memo_NE(MCEventInfo info){
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
		else if (nx == Cnd_unit_cd) doCnd_unit_cd_NX(info);
		else if (nx == Cnd_unit_nm) doCnd_unit_nm_NX(info);
		else if (nx == Cnd_cur_cd) doCnd_cur_cd_NX(info);
		else if (nx == Cnd_cur_nm) doCnd_cur_nm_NX(info);
		else if (nx == Cnd_proc_upri_typ) doCnd_proc_upri_typ_NX(info);
		else if (nx == Cnd_proc_upri_typ_nm) doCnd_proc_upri_typ_nm_NX(info);
		else if (nx == Cnd_off_interim_flg) doCnd_off_interim_flg_NX(info);
		else if (nx == Cnd_on_interim_flg) doCnd_on_interim_flg_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_maker_cd) doCnd_maker_cd_NX(info);
		else if (nx == Cnd_maker_nm) doCnd_maker_nm_NX(info);
		else if (nx == Cnd_sppl_cntry_cd) doCnd_sppl_cntry_cd_NX(info);
		else if (nx == Cnd_sppl_cntry_nm) doCnd_sppl_cntry_nm_NX(info);
		else if (nx == Cnd_sppl_foreign_flg) doCnd_sppl_foreign_flg_NX(info);
		else if (nx == Cnd_sppl_area_cd) doCnd_sppl_area_cd_NX(info);
		else if (nx == Cnd_sppl_area_nm) doCnd_sppl_area_nm_NX(info);
		else if (nx == Cnd_dlv_cd) doCnd_dlv_cd_NX(info);
		else if (nx == Cnd_dlv_nm) doCnd_dlv_nm_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
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
		else if (nx == Cnd_sppl_grp_cd1) doCnd_sppl_grp_cd1_NX(info);
		else if (nx == Cnd_sppl_grp_nm1) doCnd_sppl_grp_nm1_NX(info);
		else if (nx == Cnd_sppl_grp_cd2) doCnd_sppl_grp_cd2_NX(info);
		else if (nx == Cnd_sppl_grp_nm2) doCnd_sppl_grp_nm2_NX(info);
		else if (nx == Cnd_sppl_grp_cd3) doCnd_sppl_grp_cd3_NX(info);
		else if (nx == Cnd_sppl_grp_nm3) doCnd_sppl_grp_nm3_NX(info);
		else if (nx == Cnd_sppl_grp_cd4) doCnd_sppl_grp_cd4_NX(info);
		else if (nx == Cnd_sppl_grp_nm4) doCnd_sppl_grp_nm4_NX(info);
		else if (nx == Cnd_sppl_grp_cd5) doCnd_sppl_grp_cd5_NX(info);
		else if (nx == Cnd_sppl_grp_nm5) doCnd_sppl_grp_nm5_NX(info);
		else if (nx == Cnd_sppl_grp_cd6) doCnd_sppl_grp_cd6_NX(info);
		else if (nx == Cnd_sppl_grp_nm6) doCnd_sppl_grp_nm6_NX(info);
		else if (nx == Cnd_sppl_grp_cd7) doCnd_sppl_grp_cd7_NX(info);
		else if (nx == Cnd_sppl_grp_nm7) doCnd_sppl_grp_nm7_NX(info);
		else if (nx == Cnd_sppl_grp_cd8) doCnd_sppl_grp_cd8_NX(info);
		else if (nx == Cnd_sppl_grp_nm8) doCnd_sppl_grp_nm8_NX(info);
		else if (nx == Cnd_sppl_grp_cd9) doCnd_sppl_grp_cd9_NX(info);
		else if (nx == Cnd_sppl_grp_nm9) doCnd_sppl_grp_nm9_NX(info);
		else if (nx == Cnd_sppl_grp_cd10) doCnd_sppl_grp_cd10_NX(info);
		else if (nx == Cnd_sppl_grp_nm10) doCnd_sppl_grp_nm10_NX(info);
		else if (nx == Cnd_maker_grp_cd1) doCnd_maker_grp_cd1_NX(info);
		else if (nx == Cnd_maker_grp_nm1) doCnd_maker_grp_nm1_NX(info);
		else if (nx == Cnd_maker_grp_cd2) doCnd_maker_grp_cd2_NX(info);
		else if (nx == Cnd_maker_grp_nm2) doCnd_maker_grp_nm2_NX(info);
		else if (nx == Cnd_maker_grp_cd3) doCnd_maker_grp_cd3_NX(info);
		else if (nx == Cnd_maker_grp_nm3) doCnd_maker_grp_nm3_NX(info);
		else if (nx == Cnd_maker_grp_cd4) doCnd_maker_grp_cd4_NX(info);
		else if (nx == Cnd_maker_grp_nm4) doCnd_maker_grp_nm4_NX(info);
		else if (nx == Cnd_maker_grp_cd5) doCnd_maker_grp_cd5_NX(info);
		else if (nx == Cnd_maker_grp_nm5) doCnd_maker_grp_nm5_NX(info);
		else if (nx == Cnd_maker_grp_cd6) doCnd_maker_grp_cd6_NX(info);
		else if (nx == Cnd_maker_grp_nm6) doCnd_maker_grp_nm6_NX(info);
		else if (nx == Cnd_maker_grp_cd7) doCnd_maker_grp_cd7_NX(info);
		else if (nx == Cnd_maker_grp_nm7) doCnd_maker_grp_nm7_NX(info);
		else if (nx == Cnd_maker_grp_cd8) doCnd_maker_grp_cd8_NX(info);
		else if (nx == Cnd_maker_grp_nm8) doCnd_maker_grp_nm8_NX(info);
		else if (nx == Cnd_maker_grp_cd9) doCnd_maker_grp_cd9_NX(info);
		else if (nx == Cnd_maker_grp_nm9) doCnd_maker_grp_nm9_NX(info);
		else if (nx == Cnd_maker_grp_cd10) doCnd_maker_grp_cd10_NX(info);
		else if (nx == Cnd_maker_grp_nm10) doCnd_maker_grp_nm10_NX(info);
		else if (nx == Cnd_dlv_grp_cd1) doCnd_dlv_grp_cd1_NX(info);
		else if (nx == Cnd_dlv_grp_nm1) doCnd_dlv_grp_nm1_NX(info);
		else if (nx == Cnd_dlv_grp_cd2) doCnd_dlv_grp_cd2_NX(info);
		else if (nx == Cnd_dlv_grp_nm2) doCnd_dlv_grp_nm2_NX(info);
		else if (nx == Cnd_dlv_grp_cd3) doCnd_dlv_grp_cd3_NX(info);
		else if (nx == Cnd_dlv_grp_nm3) doCnd_dlv_grp_nm3_NX(info);
		else if (nx == Cnd_dlv_grp_cd4) doCnd_dlv_grp_cd4_NX(info);
		else if (nx == Cnd_dlv_grp_nm4) doCnd_dlv_grp_nm4_NX(info);
		else if (nx == Cnd_dlv_grp_cd5) doCnd_dlv_grp_cd5_NX(info);
		else if (nx == Cnd_dlv_grp_nm5) doCnd_dlv_grp_nm5_NX(info);
		else if (nx == Cnd_dlv_grp_cd6) doCnd_dlv_grp_cd6_NX(info);
		else if (nx == Cnd_dlv_grp_nm6) doCnd_dlv_grp_nm6_NX(info);
		else if (nx == Cnd_dlv_grp_cd7) doCnd_dlv_grp_cd7_NX(info);
		else if (nx == Cnd_dlv_grp_nm7) doCnd_dlv_grp_nm7_NX(info);
		else if (nx == Cnd_dlv_grp_cd8) doCnd_dlv_grp_cd8_NX(info);
		else if (nx == Cnd_dlv_grp_nm8) doCnd_dlv_grp_nm8_NX(info);
		else if (nx == Cnd_dlv_grp_cd9) doCnd_dlv_grp_cd9_NX(info);
		else if (nx == Cnd_dlv_grp_nm9) doCnd_dlv_grp_nm9_NX(info);
		else if (nx == Cnd_dlv_grp_cd10) doCnd_dlv_grp_cd10_NX(info);
		else if (nx == Cnd_dlv_grp_nm10) doCnd_dlv_grp_nm10_NX(info);
		else if (nx == Cnd_apl_no) doCnd_apl_no_NX(info);
		else if (nx == Cnd_aprv_no) doCnd_aprv_no_NX(info);
		else if (nx == Cnd_apl_dt_fr) doCnd_apl_dt_fr_NX(info);
		else if (nx == Cnd_apl_dt_to) doCnd_apl_dt_to_NX(info);
		else if (nx == Cnd_apl_usr_cd) doCnd_apl_usr_cd_NX(info);
		else if (nx == Cnd_apl_usr_nm) doCnd_apl_usr_nm_NX(info);
		else if (nx == Cnd_apl_dpt_cd) doCnd_apl_dpt_cd_NX(info);
		else if (nx == Cnd_apl_dpt_nm) doCnd_apl_dpt_nm_NX(info);
		else if (nx == Cnd_aprv_sts_typ) doCnd_aprv_sts_typ_NX(info);
		else if (nx == Cnd_aprv_sts_typ_nm) doCnd_aprv_sts_typ_nm_NX(info);
		else if (nx == BulkSet_rev_rate) doBulkSet_rev_rate_NX(info);
		else if (nx == BulkSet_rnd_typ) doBulkSet_rnd_typ_NX(info);
		else if (nx == BulkSet_rnd_typ_nm) doBulkSet_rnd_typ_nm_NX(info);
		else if (nx == BulkSet_rev_date) doBulkSet_rev_date_NX(info);
		else if (nx == BulkSet_st_dt) doBulkSet_st_dt_NX(info);
		else if (nx == BulkSet_end_dt) doBulkSet_end_dt_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_wg_nm) doDtl_wg_nm_NX(info);
		else if (nx == columnDtl_itm_typ) doDtl_itm_typ_NX(info);
		else if (nx == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NX(info);
		else if (nx == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_sppl_cd) doDtl_sppl_cd_NX(info);
		else if (nx == columnDtl_sppl_nm) doDtl_sppl_nm_NX(info);
		else if (nx == columnDtl_maker_cd) doDtl_maker_cd_NX(info);
		else if (nx == columnDtl_maker_nm) doDtl_maker_nm_NX(info);
		else if (nx == columnDtl_unit_cd) doDtl_unit_cd_NX(info);
		else if (nx == columnDtl_unit_nm) doDtl_unit_nm_NX(info);
		else if (nx == columnDtl_dec_place) doDtl_dec_place_NX(info);
		else if (nx == columnDtl_cur_cd) doDtl_cur_cd_NX(info);
		else if (nx == columnDtl_cur_nm) doDtl_cur_nm_NX(info);
		else if (nx == columnDtl_upri_dec_place) doDtl_upri_dec_place_NX(info);
		else if (nx == columnDtl_proc_upri_typ) doDtl_proc_upri_typ_NX(info);
		else if (nx == columnDtl_proc_upri_typ_nm) doDtl_proc_upri_typ_nm_NX(info);
		else if (nx == columnDtl_loc_cd) doDtl_loc_cd_NX(info);
		else if (nx == columnDtl_loc_nm) doDtl_loc_nm_NX(info);
		else if (nx == columnDtl_dlv_cd) doDtl_dlv_cd_NX(info);
		else if (nx == columnDtl_dlv_nm) doDtl_dlv_nm_NX(info);
		else if (nx == columnDtl_outsrc_upri_typ) doDtl_outsrc_upri_typ_NX(info);
		else if (nx == columnDtl_outsrc_upri_typ_nm) doDtl_outsrc_upri_typ_nm_NX(info);
		else if (nx == columnDtl_purc_tax_cd) doDtl_purc_tax_cd_NX(info);
		else if (nx == columnDtl_purc_tax_nm) doDtl_purc_tax_nm_NX(info);
		else if (nx == columnDtl_interim_flg) doDtl_interim_flg_NX(info);
		else if (nx == columnDtl_std_wk_cost) doDtl_std_wk_cost_NX(info);
		else if (nx == columnDtl_std_wk_cost_upri) doDtl_std_wk_cost_upri_NX(info);
		else if (nx == columnDtl_not_cost_flg) doDtl_not_cost_flg_NX(info);
		else if (nx == columnDtl_memo1) doDtl_memo1_NX(info);
		else if (nx == columnDtl_memo2) doDtl_memo2_NX(info);
		else if (nx == columnDtl_memo3) doDtl_memo3_NX(info);
		else if (nx == columnDtl_apl_no) doDtl_apl_no_NX(info);
		else if (nx == columnDtl_st_dt_bf) doDtl_st_dt_bf_NX(info);
		else if (nx == columnDtl_apl_dt) doDtl_apl_dt_NX(info);
		else if (nx == columnDtl_apl_usr_cd) doDtl_apl_usr_cd_NX(info);
		else if (nx == columnDtl_apl_usr_nm) doDtl_apl_usr_nm_NX(info);
		else if (nx == columnDtl_apl_dpt_cd) doDtl_apl_dpt_cd_NX(info);
		else if (nx == columnDtl_apl_dpt_nm) doDtl_apl_dpt_nm_NX(info);
		else if (nx == columnDtl_ref_flg) doDtl_ref_flg_NX(info);
		else if (nx == columnDtl_mst_apl_memo) doDtl_mst_apl_memo_NX(info);
		else if (nx == columnDtl_aprv_no) doDtl_aprv_no_NX(info);
		else if (nx == columnDtl_aprv_sts_typ) doDtl_aprv_sts_typ_NX(info);
		else if (nx == columnDtl_aprv_sts_typ_nm) doDtl_aprv_sts_typ_nm_NX(info);
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
		else if (nx == Dtl2_apl_dt) doDtl2_apl_dt_NX(info);
		else if (nx == Dtl2_apl_no) doDtl2_apl_no_NX(info);
		else if (nx == Dtl2_aprv_no) doDtl2_aprv_no_NX(info);
		else if (nx == Dtl2_mst_apl_memo) doDtl2_mst_apl_memo_NX(info);
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
	 * [Cnd]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_upri_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_upri_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_upri_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_upri_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_interim_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cntry_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cntry_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cntry_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cntry_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_foreign_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_foreign_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_area_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_area_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_area_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_area_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rev_rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rev_rate_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rev_date]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rev_date_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upri_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upri_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_typ_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[outsrc_upri_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[interim_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_interim_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_wk_cost]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_wk_cost_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_wk_cost_upri]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_wk_cost_upri_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[apl_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_dt_bf]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_dt_bf_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[apl_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[apl_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[apl_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[apl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[apl_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ref_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ref_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_apl_memo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_apl_memo_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_nm_NX(MCEventInfo info){
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
	 * [Dtl2]パネルの[apl_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_apl_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[apl_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_apl_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[mst_apl_memo]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_mst_apl_memo_NX(MCEventInfo info){
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
		else if (lc == Cnd_unit_cd) doCnd_unit_cd_LC(info);
		else if (lc == Cnd_unit_nm) doCnd_unit_nm_LC(info);
		else if (lc == Cnd_cur_cd) doCnd_cur_cd_LC(info);
		else if (lc == Cnd_cur_nm) doCnd_cur_nm_LC(info);
		else if (lc == Cnd_proc_upri_typ) doCnd_proc_upri_typ_LC(info);
		else if (lc == Cnd_proc_upri_typ_nm) doCnd_proc_upri_typ_nm_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_maker_cd) doCnd_maker_cd_LC(info);
		else if (lc == Cnd_maker_nm) doCnd_maker_nm_LC(info);
		else if (lc == Cnd_sppl_cntry_cd) doCnd_sppl_cntry_cd_LC(info);
		else if (lc == Cnd_sppl_cntry_nm) doCnd_sppl_cntry_nm_LC(info);
		else if (lc == Cnd_sppl_area_cd) doCnd_sppl_area_cd_LC(info);
		else if (lc == Cnd_sppl_area_nm) doCnd_sppl_area_nm_LC(info);
		else if (lc == Cnd_dlv_cd) doCnd_dlv_cd_LC(info);
		else if (lc == Cnd_dlv_nm) doCnd_dlv_nm_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
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
		else if (lc == Cnd_sppl_grp_cd1) doCnd_sppl_grp_cd1_LC(info);
		else if (lc == Cnd_sppl_grp_nm1) doCnd_sppl_grp_nm1_LC(info);
		else if (lc == Cnd_sppl_grp_cd2) doCnd_sppl_grp_cd2_LC(info);
		else if (lc == Cnd_sppl_grp_nm2) doCnd_sppl_grp_nm2_LC(info);
		else if (lc == Cnd_sppl_grp_cd3) doCnd_sppl_grp_cd3_LC(info);
		else if (lc == Cnd_sppl_grp_nm3) doCnd_sppl_grp_nm3_LC(info);
		else if (lc == Cnd_sppl_grp_cd4) doCnd_sppl_grp_cd4_LC(info);
		else if (lc == Cnd_sppl_grp_nm4) doCnd_sppl_grp_nm4_LC(info);
		else if (lc == Cnd_sppl_grp_cd5) doCnd_sppl_grp_cd5_LC(info);
		else if (lc == Cnd_sppl_grp_nm5) doCnd_sppl_grp_nm5_LC(info);
		else if (lc == Cnd_sppl_grp_cd6) doCnd_sppl_grp_cd6_LC(info);
		else if (lc == Cnd_sppl_grp_nm6) doCnd_sppl_grp_nm6_LC(info);
		else if (lc == Cnd_sppl_grp_cd7) doCnd_sppl_grp_cd7_LC(info);
		else if (lc == Cnd_sppl_grp_nm7) doCnd_sppl_grp_nm7_LC(info);
		else if (lc == Cnd_sppl_grp_cd8) doCnd_sppl_grp_cd8_LC(info);
		else if (lc == Cnd_sppl_grp_nm8) doCnd_sppl_grp_nm8_LC(info);
		else if (lc == Cnd_sppl_grp_cd9) doCnd_sppl_grp_cd9_LC(info);
		else if (lc == Cnd_sppl_grp_nm9) doCnd_sppl_grp_nm9_LC(info);
		else if (lc == Cnd_sppl_grp_cd10) doCnd_sppl_grp_cd10_LC(info);
		else if (lc == Cnd_sppl_grp_nm10) doCnd_sppl_grp_nm10_LC(info);
		else if (lc == Cnd_maker_grp_cd1) doCnd_maker_grp_cd1_LC(info);
		else if (lc == Cnd_maker_grp_nm1) doCnd_maker_grp_nm1_LC(info);
		else if (lc == Cnd_maker_grp_cd2) doCnd_maker_grp_cd2_LC(info);
		else if (lc == Cnd_maker_grp_nm2) doCnd_maker_grp_nm2_LC(info);
		else if (lc == Cnd_maker_grp_cd3) doCnd_maker_grp_cd3_LC(info);
		else if (lc == Cnd_maker_grp_nm3) doCnd_maker_grp_nm3_LC(info);
		else if (lc == Cnd_maker_grp_cd4) doCnd_maker_grp_cd4_LC(info);
		else if (lc == Cnd_maker_grp_nm4) doCnd_maker_grp_nm4_LC(info);
		else if (lc == Cnd_maker_grp_cd5) doCnd_maker_grp_cd5_LC(info);
		else if (lc == Cnd_maker_grp_nm5) doCnd_maker_grp_nm5_LC(info);
		else if (lc == Cnd_maker_grp_cd6) doCnd_maker_grp_cd6_LC(info);
		else if (lc == Cnd_maker_grp_nm6) doCnd_maker_grp_nm6_LC(info);
		else if (lc == Cnd_maker_grp_cd7) doCnd_maker_grp_cd7_LC(info);
		else if (lc == Cnd_maker_grp_nm7) doCnd_maker_grp_nm7_LC(info);
		else if (lc == Cnd_maker_grp_cd8) doCnd_maker_grp_cd8_LC(info);
		else if (lc == Cnd_maker_grp_nm8) doCnd_maker_grp_nm8_LC(info);
		else if (lc == Cnd_maker_grp_cd9) doCnd_maker_grp_cd9_LC(info);
		else if (lc == Cnd_maker_grp_nm9) doCnd_maker_grp_nm9_LC(info);
		else if (lc == Cnd_maker_grp_cd10) doCnd_maker_grp_cd10_LC(info);
		else if (lc == Cnd_maker_grp_nm10) doCnd_maker_grp_nm10_LC(info);
		else if (lc == Cnd_dlv_grp_cd1) doCnd_dlv_grp_cd1_LC(info);
		else if (lc == Cnd_dlv_grp_nm1) doCnd_dlv_grp_nm1_LC(info);
		else if (lc == Cnd_dlv_grp_cd2) doCnd_dlv_grp_cd2_LC(info);
		else if (lc == Cnd_dlv_grp_nm2) doCnd_dlv_grp_nm2_LC(info);
		else if (lc == Cnd_dlv_grp_cd3) doCnd_dlv_grp_cd3_LC(info);
		else if (lc == Cnd_dlv_grp_nm3) doCnd_dlv_grp_nm3_LC(info);
		else if (lc == Cnd_dlv_grp_cd4) doCnd_dlv_grp_cd4_LC(info);
		else if (lc == Cnd_dlv_grp_nm4) doCnd_dlv_grp_nm4_LC(info);
		else if (lc == Cnd_dlv_grp_cd5) doCnd_dlv_grp_cd5_LC(info);
		else if (lc == Cnd_dlv_grp_nm5) doCnd_dlv_grp_nm5_LC(info);
		else if (lc == Cnd_dlv_grp_cd6) doCnd_dlv_grp_cd6_LC(info);
		else if (lc == Cnd_dlv_grp_nm6) doCnd_dlv_grp_nm6_LC(info);
		else if (lc == Cnd_dlv_grp_cd7) doCnd_dlv_grp_cd7_LC(info);
		else if (lc == Cnd_dlv_grp_nm7) doCnd_dlv_grp_nm7_LC(info);
		else if (lc == Cnd_dlv_grp_cd8) doCnd_dlv_grp_cd8_LC(info);
		else if (lc == Cnd_dlv_grp_nm8) doCnd_dlv_grp_nm8_LC(info);
		else if (lc == Cnd_dlv_grp_cd9) doCnd_dlv_grp_cd9_LC(info);
		else if (lc == Cnd_dlv_grp_nm9) doCnd_dlv_grp_nm9_LC(info);
		else if (lc == Cnd_dlv_grp_cd10) doCnd_dlv_grp_cd10_LC(info);
		else if (lc == Cnd_dlv_grp_nm10) doCnd_dlv_grp_nm10_LC(info);
		else if (lc == Cnd_apl_no) doCnd_apl_no_LC(info);
		else if (lc == Cnd_aprv_no) doCnd_aprv_no_LC(info);
		else if (lc == Cnd_apl_dt_fr) doCnd_apl_dt_fr_LC(info);
		else if (lc == Cnd_apl_dt_to) doCnd_apl_dt_to_LC(info);
		else if (lc == Cnd_apl_usr_cd) doCnd_apl_usr_cd_LC(info);
		else if (lc == Cnd_apl_usr_nm) doCnd_apl_usr_nm_LC(info);
		else if (lc == Cnd_apl_dpt_cd) doCnd_apl_dpt_cd_LC(info);
		else if (lc == Cnd_apl_dpt_nm) doCnd_apl_dpt_nm_LC(info);
		else if (lc == Cnd_aprv_sts_typ) doCnd_aprv_sts_typ_LC(info);
		else if (lc == Cnd_aprv_sts_typ_nm) doCnd_aprv_sts_typ_nm_LC(info);
		else if (lc == BulkSet_rev_rate) doBulkSet_rev_rate_LC(info);
		else if (lc == BulkSet_rnd_typ) doBulkSet_rnd_typ_LC(info);
		else if (lc == BulkSet_rnd_typ_nm) doBulkSet_rnd_typ_nm_LC(info);
		else if (lc == BulkSet_rev_date) doBulkSet_rev_date_LC(info);
		else if (lc == BulkSet_st_dt) doBulkSet_st_dt_LC(info);
		else if (lc == BulkSet_end_dt) doBulkSet_end_dt_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_wg_nm) doDtl_wg_nm_LC(info);
		else if (lc == columnDtl_itm_typ) doDtl_itm_typ_LC(info);
		else if (lc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_LC(info);
		else if (lc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_sppl_cd) doDtl_sppl_cd_LC(info);
		else if (lc == columnDtl_sppl_nm) doDtl_sppl_nm_LC(info);
		else if (lc == columnDtl_maker_cd) doDtl_maker_cd_LC(info);
		else if (lc == columnDtl_maker_nm) doDtl_maker_nm_LC(info);
		else if (lc == columnDtl_unit_cd) doDtl_unit_cd_LC(info);
		else if (lc == columnDtl_unit_nm) doDtl_unit_nm_LC(info);
		else if (lc == columnDtl_dec_place) doDtl_dec_place_LC(info);
		else if (lc == columnDtl_cur_cd) doDtl_cur_cd_LC(info);
		else if (lc == columnDtl_cur_nm) doDtl_cur_nm_LC(info);
		else if (lc == columnDtl_upri_dec_place) doDtl_upri_dec_place_LC(info);
		else if (lc == columnDtl_proc_upri_typ) doDtl_proc_upri_typ_LC(info);
		else if (lc == columnDtl_proc_upri_typ_nm) doDtl_proc_upri_typ_nm_LC(info);
		else if (lc == columnDtl_loc_cd) doDtl_loc_cd_LC(info);
		else if (lc == columnDtl_loc_nm) doDtl_loc_nm_LC(info);
		else if (lc == columnDtl_dlv_cd) doDtl_dlv_cd_LC(info);
		else if (lc == columnDtl_dlv_nm) doDtl_dlv_nm_LC(info);
		else if (lc == columnDtl_outsrc_upri_typ) doDtl_outsrc_upri_typ_LC(info);
		else if (lc == columnDtl_outsrc_upri_typ_nm) doDtl_outsrc_upri_typ_nm_LC(info);
		else if (lc == columnDtl_purc_tax_cd) doDtl_purc_tax_cd_LC(info);
		else if (lc == columnDtl_purc_tax_nm) doDtl_purc_tax_nm_LC(info);
		else if (lc == columnDtl_std_wk_cost) doDtl_std_wk_cost_LC(info);
		else if (lc == columnDtl_std_wk_cost_upri) doDtl_std_wk_cost_upri_LC(info);
		else if (lc == columnDtl_memo1) doDtl_memo1_LC(info);
		else if (lc == columnDtl_memo2) doDtl_memo2_LC(info);
		else if (lc == columnDtl_memo3) doDtl_memo3_LC(info);
		else if (lc == columnDtl_apl_no) doDtl_apl_no_LC(info);
		else if (lc == columnDtl_st_dt_bf) doDtl_st_dt_bf_LC(info);
		else if (lc == columnDtl_apl_dt) doDtl_apl_dt_LC(info);
		else if (lc == columnDtl_apl_usr_cd) doDtl_apl_usr_cd_LC(info);
		else if (lc == columnDtl_apl_usr_nm) doDtl_apl_usr_nm_LC(info);
		else if (lc == columnDtl_apl_dpt_cd) doDtl_apl_dpt_cd_LC(info);
		else if (lc == columnDtl_apl_dpt_nm) doDtl_apl_dpt_nm_LC(info);
		else if (lc == columnDtl_mst_apl_memo) doDtl_mst_apl_memo_LC(info);
		else if (lc == columnDtl_aprv_no) doDtl_aprv_no_LC(info);
		else if (lc == columnDtl_aprv_sts_typ) doDtl_aprv_sts_typ_LC(info);
		else if (lc == columnDtl_aprv_sts_typ_nm) doDtl_aprv_sts_typ_nm_LC(info);
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
		else if (lc == Dtl2_apl_dt) doDtl2_apl_dt_LC(info);
		else if (lc == Dtl2_apl_no) doDtl2_apl_no_LC(info);
		else if (lc == Dtl2_aprv_no) doDtl2_aprv_no_LC(info);
		else if (lc == Dtl2_mst_apl_memo) doDtl2_mst_apl_memo_LC(info);
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
	 * [Cnd]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_upri_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_upri_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[proc_upri_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_proc_upri_typ_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cntry_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cntry_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cntry_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cntry_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_area_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_area_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_area_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_area_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[sppl_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[apl_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_apl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_aprv_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rev_rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rev_rate_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[rev_date]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_rev_date_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upri_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upri_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[proc_upri_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_proc_upri_typ_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[outsrc_upri_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[outsrc_upri_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_outsrc_upri_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_wk_cost]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_wk_cost_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_wk_cost_upri]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_wk_cost_upri_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[apl_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[st_dt_bf]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_st_dt_bf_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[apl_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[apl_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[apl_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[apl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[apl_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_apl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mst_apl_memo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mst_apl_memo_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[aprv_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_aprv_sts_typ_nm_LC(MCEventInfo info){
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
	 * [Dtl2]パネルの[apl_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_apl_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[apl_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_apl_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[aprv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_aprv_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl2]パネルの[mst_apl_memo]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl2_mst_apl_memo_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_unit_cd]の作成メソッド
	 */
	public MCList getCnd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cur_cd]の作成メソッド
	 */
	public MCList getCnd_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_proc_upri_typ]の作成メソッド
	 */
	public MCList getCnd_proc_upri_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProcUpriTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_maker_cd]の作成メソッド
	 */
	public MCList getCnd_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cntry_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cntry_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCntry(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_area_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_area_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArea(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_cd]の作成メソッド
	 */
	public MCList getCnd_dlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_cd]の作成メソッド
	 */
	public MCList getCnd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
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
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_sppl_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_maker_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_maker_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_maker_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_maker_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_maker_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_maker_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_maker_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_maker_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_maker_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_maker_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_maker_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_maker_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_maker_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_maker_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_maker_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_maker_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_maker_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_maker_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_maker_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_maker_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_apl_usr_cd]の作成メソッド
	 */
	public MCList getCnd_apl_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_apl_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_apl_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_aprv_sts_typ]の作成メソッド
	 */
	public MCList getCnd_aprv_sts_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAprvStsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[BulkSet_rnd_typ]の作成メソッド
	 */
	public MCList getBulkSet_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_wg_cd]の作成メソッド
	 */
	public MCList getDtl_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sppl_cd]の作成メソッド
	 */
	public MCList getDtl_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_maker_cd]の作成メソッド
	 */
	public MCList getDtl_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_unit_cd]の作成メソッド
	 */
	public MCList getDtl_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_cur_cd]の作成メソッド
	 */
	public MCList getDtl_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_proc_upri_typ]の作成メソッド
	 */
	public MCList getDtl_proc_upri_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProcUpriTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_loc_cd]の作成メソッド
	 */
	public MCList getDtl_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dlv_cd]の作成メソッド
	 */
	public MCList getDtl_dlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_outsrc_upri_typ]の作成メソッド
	 */
	public MCList getDtl_outsrc_upri_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOutsrcUpriTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl2_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getDtl2_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABSL0140.Srch01")) {
			return new MA_MABSL0140_Srch01Bridge();
		}
		if (id.equals("MA.MABSL0140.Sprt01")) {
			return new MA_MABSL0140_Sprt01Bridge();
		}
		if (id.equals("MA.MABSL0140.Upd01")) {
			return new MA_MABSL0140_Upd01Bridge();
		}
		if (id.equals("MA.MABSL0140.Del01")) {
			return new MA_MABSL0140_Del01Bridge();
		}
		if (id.equals("MA.MABSL0140.Aprv_Srch01")) {
			return new MA_MABSL0140_Aprv_Srch01Bridge();
		}
		if (id.equals("MA.MABSL0140.Aprv_Upd01")) {
			return new MA_MABSL0140_Aprv_Upd01Bridge();
		}
		if (id.equals("MA.MABSL0140.Aprv_Del01")) {
			return new MA_MABSL0140_Aprv_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABSL0140_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0140_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0140_Srch01;

		/** コンストラクタ */
		protected MA_MABSL0140_Srch01Bridge() {
			p_MA_MABSL0140_Srch01 = new MCParam(PDef.MA_MABSL0140_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0140_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABS.MABSP0140.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0140.DtlR.class));

			p_MA_MABSL0140_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0140_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0140_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0140_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0140_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABS.MABSP0140.CndR up0() {
			return (mcframe.clientMABS.MABSP0140.CndR)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP0140.DtlR> down0() {
			return (MCList<mcframe.clientMABS.MABSP0140.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABSL0140_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0140.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL0140_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABS.MABSP0140.DtlR>)p_MA_MABSL0140_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABSL0140_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0140_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0140_Sprt01;

		/** コンストラクタ */
		protected MA_MABSL0140_Sprt01Bridge() {
			p_MA_MABSL0140_Sprt01 = new MCParam(PDef.MA_MABSL0140_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0140_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0140.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0140.DtlR.class));

			p_MA_MABSL0140_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0140_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0140_Sprt01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0140_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0140_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0140.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0140.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP0140.DtlR> down0() {
			return (MCList<mcframe.clientMABS.MABSP0140.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABSL0140_Sprt01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0140.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL0140_Sprt01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABS.MABSP0140.DtlR>)p_MA_MABSL0140_Sprt01.getContainerParam().getDownBlock(0));
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
	/**
	 * [MA_MABSL0140_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0140_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0140_Upd01;

		/** コンストラクタ */
		protected MA_MABSL0140_Upd01Bridge() {
			p_MA_MABSL0140_Upd01 = new MCParam(PDef.MA_MABSL0140_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0140_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0140.DtlR.class));
			// Down

			p_MA_MABSL0140_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0140_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0140_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0140_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0140_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0140.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0140.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL0140_Upd01;
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
	 * [MA_MABSL0140_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0140_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0140_Del01;

		/** コンストラクタ */
		protected MA_MABSL0140_Del01Bridge() {
			p_MA_MABSL0140_Del01 = new MCParam(PDef.MA_MABSL0140_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0140_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0140.DtlR.class));
			// Down

			p_MA_MABSL0140_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0140_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0140_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0140_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0140_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0140.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0140.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL0140_Del01;
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
	 * [MA_MABSL0140_Aprv_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0140_Aprv_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0140_Aprv_Srch01;

		/** コンストラクタ */
		protected MA_MABSL0140_Aprv_Srch01Bridge() {
			p_MA_MABSL0140_Aprv_Srch01 = new MCParam(PDef.MA_MABSL0140_Aprv_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0140_Aprv_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABS.MABSP0140.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0140.DtlR.class));

			p_MA_MABSL0140_Aprv_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0140_Aprv_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0140_Aprv_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0140_Aprv_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0140_Aprv_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABS.MABSP0140.CndR up0() {
			return (mcframe.clientMABS.MABSP0140.CndR)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP0140.DtlR> down0() {
			return (MCList<mcframe.clientMABS.MABSP0140.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABSL0140_Aprv_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0140.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL0140_Aprv_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABS.MABSP0140.DtlR>)p_MA_MABSL0140_Aprv_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABSL0140_Aprv_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0140_Aprv_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0140_Aprv_Upd01;

		/** コンストラクタ */
		protected MA_MABSL0140_Aprv_Upd01Bridge() {
			p_MA_MABSL0140_Aprv_Upd01 = new MCParam(PDef.MA_MABSL0140_Aprv_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0140_Aprv_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0140.DtlR.class));
			param.addUpBlock(mcframe.clientMABS.MABSP0140.Dtl2R.create());
			// Down
			param.addDownBlock(mcframe.clientMABS.MABSP0140.Dtl2R.create());

			p_MA_MABSL0140_Aprv_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0140_Aprv_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0140_Aprv_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABSL0140_Aprv_Upd01.addUpBlock(getDtl2R());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0140_Aprv_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0140_Aprv_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0140.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0140.DtlR>)up(0);
		}
		protected mcframe.clientMABS.MABSP0140.Dtl2R up1() {
			return (mcframe.clientMABS.MABSP0140.Dtl2R)up(1);
		}

		protected mcframe.clientMABS.MABSP0140.Dtl2R down0() {
			return (mcframe.clientMABS.MABSP0140.Dtl2R)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABSL0140_Aprv_Upd01.addDownBlock(mcframe.clientMABS.MABSP0140.Dtl2R.create());
		}
		protected MCParam param() {
			return p_MA_MABSL0140_Aprv_Upd01;
		}

		protected void show() {
			setDtl2R((mcframe.clientMABS.MABSP0140.Dtl2R)p_MA_MABSL0140_Aprv_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtl2R().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getDtl2R());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtl2R());
			return result;
		}
	}
	/**
	 * [MA_MABSL0140_Aprv_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0140_Aprv_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0140_Aprv_Del01;

		/** コンストラクタ */
		protected MA_MABSL0140_Aprv_Del01Bridge() {
			p_MA_MABSL0140_Aprv_Del01 = new MCParam(PDef.MA_MABSL0140_Aprv_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0140_Aprv_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0140.DtlR.class));
			// Down

			p_MA_MABSL0140_Aprv_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0140_Aprv_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0140_Aprv_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0140_Aprv_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0140_Aprv_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0140.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0140.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL0140_Aprv_Del01;
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