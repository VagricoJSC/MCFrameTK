package mcframe.clientMABS.MABSP0200;

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
import mcframe.clientMABS.MABSP0200.MABSP_LotInhLst_MC.MA_MABSL0200_Srch01Caller;

/**
 * 画面"MABSP_LotInhLst"パネルクラスです。<p>
 *
 * ロット継承機能に関する情報を検索します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSP_LotInhLst_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABSP0200";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
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
	 * Common 共通.<p>
	 *
	 */
	public MCCheckBox Cnd_cmn_flg = null;
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public MCCheckBox Cnd_wg_flg = null;
	/**
	 * Search (Common) 検索する（共通）.<p>
	 *
	 */
	public MCButton Cnd_srch_cmn = null;
	/**
	 * Search (WG) 検索する（ワーキンググループ）.<p>
	 *
	 */
	public MCButton Cnd_srch_wg = null;
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
	public MCLabel Cnd_lot_inh_col_typ_Label = null;
	/**
	 * Copy column type 継承項目区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_lot_inh_col_typ = null;
	/**
	 * Copy column type name 継承項目区分名.<p>
	 *
	 */
	public MCTextField Cnd_lot_inh_col_typ_nm = null;
	public MCLabel Cnd_bom_ptn_Label = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCTextComboBox Cnd_bom_ptn = null;
	public MCLabel Cnd_dest_memo1_Label = null;
	/**
	 * Memo 1 (Copy-to) メモ１（継承先）.<p>
	 *
	 */
	public MCTextField Cnd_dest_memo1 = null;
	public MCLabel Cnd_dest_memo2_Label = null;
	/**
	 * Memo 2 (Copy-to) メモ２（継承先）.<p>
	 *
	 */
	public MCTextField Cnd_dest_memo2 = null;
	public MCLabel Cnd_dest_memo3_Label = null;
	/**
	 * Memo 3 (Copy-to) メモ３（継承先）.<p>
	 *
	 */
	public MCTextField Cnd_dest_memo3 = null;
	public MCLabel Cnd_src_memo1_Label = null;
	/**
	 * Memo 1 (Copy-from) メモ１（継承元）.<p>
	 *
	 */
	public MCTextField Cnd_src_memo1 = null;
	public MCLabel Cnd_src_memo2_Label = null;
	/**
	 * Memo 2 (Copy-from) メモ２（継承元）.<p>
	 *
	 */
	public MCTextField Cnd_src_memo2 = null;
	public MCLabel Cnd_src_memo3_Label = null;
	/**
	 * Memo 3 (Copy-from) メモ３（継承元）.<p>
	 *
	 */
	public MCTextField Cnd_src_memo3 = null;
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
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0200.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
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
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bom_ptn = null;
	/**
	 * Copy column type 継承項目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_inh_col_typ = null;
	/**
	 * Copy column type name 継承項目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_inh_col_typ_nm = null;
	/**
	 * Copy method type 継承方法区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_inh_typ = null;
	/**
	 * Copy method type name 継承方法区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_inh_typ_nm = null;
	/**
	 * Additional join column type 追加結合項目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_add_concat_col = null;
	/**
	 * Additional join column type name 追加結合項目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_add_concat_col_nm = null;
	/**
	 * Error when number of digits exceeded 桁数超過時エラー.<p>
	 *
	 */
	public MCColumnConfig columnDtl_overflow_err_flg = null;
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
	 * Priority 優先順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prio = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Dtl_dt_p_PPanel;
	public MCColumnConfig columnDtl_st_dt;// [Dtl]の[dt_p.st_dt]を[columnDtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_end_dt;// [Dtl]の[dt_p.end_dt]を[columnDtl_end_dt]としてエイリアス定義。
	/**
	 * Memo 1 (Copy-to) メモ１（継承先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_memo1 = null;
	/**
	 * Memo 2 (Copy-to) メモ２（継承先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_memo2 = null;
	/**
	 * Memo 3 (Copy-to) メモ３（継承先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_memo3 = null;
	/**
	 * Memo 1 (Copy-from) メモ１（継承元）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_memo1 = null;
	/**
	 * Memo 2 (Copy-from) メモ２（継承元）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_memo2 = null;
	/**
	 * Memo 3 (Copy-from) メモ３（継承元）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_memo3 = null;
	/**
	 * Entry user ID (Copy-to) 登録ユーザＩＤ（継承先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_ins_usr_id = null;
	/**
	 * Entry user name (Copy-to) 登録ユーザ名（継承先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_ins_usr_nm = null;
	/**
	 * Entry date and time (Copy-to) 登録日時（継承先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_ins_ts = null;
	/**
	 * Entry function ID (Copy-to) 登録機能ＩＤ（継承先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_ins_func_id = null;
	/**
	 * Entry function name (Copy-to) 登録機能名（継承先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_ins_func_nm = null;
	/**
	 * Update counter (Copy-to) 更新カウンタ（継承先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_upd_cntr = null;
	/**
	 * Update user ID (Copy-to) 更新ユーザＩＤ（継承先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_upd_usr_id = null;
	/**
	 * Update user name (Copy-to) 更新ユーザ名（継承先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_upd_usr_nm = null;
	/**
	 * Update date and time (Copy-to) 更新日時（継承先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_upd_ts = null;
	/**
	 * Update function ID (Copy-to) 更新機能ＩＤ（継承先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_upd_func_id = null;
	/**
	 * Update function name (Copy-to) 更新機能名（継承先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_upd_func_nm = null;
	/**
	 * Update request No. (Copy-to) 更新リクエストＮＯ（継承先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_upd_srv_req_no = null;
	/**
	 * Logical delete user ID (Copy-to) 論理削除ユーザＩＤ（継承先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_del_usr_id = null;
	/**
	 * Logical delete user name (Copy-to) 論理削除ユーザ名（継承先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_del_usr_nm = null;
	/**
	 * Logical delete date and time (Copy-to) 論理削除日時（継承先）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_del_ts = null;
	/**
	 * Entry user ID (Copy-from) 登録ユーザＩＤ（継承元）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_ins_usr_id = null;
	/**
	 * Entry user name (Copy-from) 登録ユーザ名（継承元）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_ins_usr_nm = null;
	/**
	 * Entry date and time (Copy-from) 登録日時（継承元）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_ins_ts = null;
	/**
	 * Entry function ID (Copy-from) 登録機能ＩＤ（継承元）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_ins_func_id = null;
	/**
	 * Entry function name (Copy-from) 登録機能名（継承元）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_ins_func_nm = null;
	/**
	 * Update counter (Copy-from) 更新カウンタ（継承元）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_upd_cntr = null;
	/**
	 * Update user ID (Copy-from) 更新ユーザＩＤ（継承元）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_upd_usr_id = null;
	/**
	 * Update user name (Copy-from) 更新ユーザ名（継承元）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_upd_usr_nm = null;
	/**
	 * Update date and time (Copy-from) 更新日時（継承元）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_upd_ts = null;
	/**
	 * Update function ID (Copy-from) 更新機能ＩＤ（継承元）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_upd_func_id = null;
	/**
	 * Update function name (Copy-from) 更新機能名（継承元）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_upd_func_nm = null;
	/**
	 * Update request No. (Copy-from) 更新リクエストＮＯ（継承元）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_upd_srv_req_no = null;
	/**
	 * Logical delete user ID (Copy-from) 論理削除ユーザＩＤ（継承元）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_del_usr_id = null;
	/**
	 * Logical delete user name (Copy-from) 論理削除ユーザ名（継承元）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_del_usr_nm = null;
	/**
	 * Logical delete date and time (Copy-from) 論理削除日時（継承元）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_src_del_ts = null;
	// [DtlBtn]ブロック関連のField定義
	public MCPanel DtlBtnPanel = null;
	// [DtlBtn]ブロックの項目のField定義
	/**
	 * Lot copy ロット継承.<p>
	 *
	 */
	public MCButton DtlBtn_open_MABSP0210 = null;
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

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABSL0200_Srch01]のCallerの作成 */
	protected MABSP_LotInhLst_MC.MA_MABSL0200_Srch01Caller createMA_MABSL0200_Srch01() {
		MABSP_LotInhLst_MC.MA_MABSL0200_Srch01Caller<MABSP_LotInhLst, MA_MABSL0200_Srch01Bridge>
		caller = ((MABSP_LotInhLst_MC)this).new MA_MABSL0200_Srch01Caller<MABSP_LotInhLst, MA_MABSL0200_Srch01Bridge>(
					(MABSP_LotInhLst)this, new MA_MABSL0200_Srch01Bridge());
		return caller;
	}
	/** [MA_MABSL0200_Srch01]の呼び出し */
	protected void callMA_MABSL0200_Srch01() {
		MCCaller caller = createMA_MABSL0200_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP0200.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0200.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABS.MABSP0200.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP0200.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP0200.CndR createCndR() {
		return mcframe.clientMABS.MABSP0200.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABS.MABSP0200.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0200.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABS.MABSP0200.DtlR createDtlR() {
		return mcframe.clientMABS.MABSP0200.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0200.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0200.DtlR.class);
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
		ret.add(RegTargetPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndTabPanel);
		ret.add(CndPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(CtrlPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_LotInhLst_MC_A() {
		aCndR = createCndR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABSP_LotInhLst_MC_A(String name) {
		aCndR = createCndR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABSP_LotInhLst_MC.jbCreateRegTarget((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbCreateTop((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbCreateFold((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbCreateCndTab((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbCreateCnd((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbCreateTab1((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbCreateTab2((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbCreateTab3((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbCreateCtrl((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbCreateDtl((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbCreateDtlBtn((MABSP_LotInhLst)this);
	}

	/**
	 * [RegTarget]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRegTarget(MABSP_LotInhLst p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABSP_LotInhLst p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABSP_LotInhLst p) {
	}

	/**
	 * [CndTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCndTab(MABSP_LotInhLst p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABSP_LotInhLst p) {
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
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MABSP_LotInhLst p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MABSP_LotInhLst p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MABSP_LotInhLst p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABSP_LotInhLst p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABSP_LotInhLst p) {
		p.Dtl_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0200.DtlR.$par_itm_p);
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
		p.Dtl_chd_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0200.DtlR.$chd_itm_p);
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
		p.Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP0200.DtlR.$dt_p);
		p.Dtl_dt_p_PPanel.setName("Dtl.dt_p");
		p.columnDtl_st_dt = p.Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnDtl_st_dt.addAliasName("Dtl.st_dt", p);
		p.columnDtl_end_dt = p.Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnDtl_end_dt.addAliasName("Dtl.end_dt", p);
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABSP_LotInhLst p) {
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
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_cd_p = createCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_cd, "par_itm_cd", "par_itm_nm","par_itm_sub1","par_itm_sub2","par_itm_sub3");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_sub1_p = createCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_sub1, "par_itm_sub1", "par_itm_nm","par_itm_sub2","par_itm_sub3");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_sub2_p = createCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_sub2, "par_itm_sub2", "par_itm_nm","par_itm_sub3");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_sub3_p = createCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_sub3, "par_itm_sub3", "par_itm_nm");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [Cnd_chd_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_chd_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_chd_itm_p_PPanel_Itm_itm_cd_p = createCnd_chd_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_chd_itm_p_PPanel.Itm_itm_cd, "chd_itm_cd", "chd_itm_nm","chd_itm_sub1","chd_itm_sub2","chd_itm_sub3");
		}
		return Cnd_chd_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_chd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_chd_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_chd_itm_p_PPanel_Itm_itm_sub1_p = createCnd_chd_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_chd_itm_p_PPanel.Itm_itm_sub1, "chd_itm_sub1", "chd_itm_nm","chd_itm_sub2","chd_itm_sub3");
		}
		return Cnd_chd_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_chd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_chd_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_chd_itm_p_PPanel_Itm_itm_sub2_p = createCnd_chd_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_chd_itm_p_PPanel.Itm_itm_sub2, "chd_itm_sub2", "chd_itm_nm","chd_itm_sub3");
		}
		return Cnd_chd_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_chd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_chd_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_chd_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_chd_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_chd_itm_p_PPanel_Itm_itm_sub3_p = createCnd_chd_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_chd_itm_p_PPanel.Itm_itm_sub3, "chd_itm_sub3", "chd_itm_nm");
		}
		return Cnd_chd_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [Cnd_lot_inh_col_typ_ListPutter]の定義 */
	private MCListPutter Cnd_lot_inh_col_typ_p = null;

	/**
	 * [Cnd_lot_inh_col_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_lot_inh_col_typ_ListPutter() {
		if (Cnd_lot_inh_col_typ_p == null) {
			Cnd_lot_inh_col_typ_p = createCnd_lot_inh_col_typ_ListPutter(Cnd_lot_inh_col_typ, "lot_inh_col_typ", "lot_inh_col_typ_nm");

		}
		return Cnd_lot_inh_col_typ_p;
	}
	
	
	/** [Cnd_bom_ptn_ListPutter]の定義 */
	private MCListPutter Cnd_bom_ptn_p = null;

	/**
	 * [Cnd_bom_ptn_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bom_ptn_ListPutter() {
		if (Cnd_bom_ptn_p == null) {
			Cnd_bom_ptn_p = createCnd_bom_ptn_ListPutter(Cnd_bom_ptn, "bom_ptn");

		}
		return Cnd_bom_ptn_p;
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_LotInhLst create(){
		MABSP_LotInhLst p = new MABSP_LotInhLst();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_LotInhLst create(String name){
		MABSP_LotInhLst p = new MABSP_LotInhLst(name);
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
		MABSP_LotInhLst_MC.jbfInitRegTarget((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbfInitTop((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbfInitFold((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbfInitCndTab((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbfInitCnd((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbfInitTab1((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbfInitTab2((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbfInitTab3((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbfInitCtrl((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbfInitDtl((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbfInitDtlBtn((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbInitRegTarget((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbInitTop((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbInitFold((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbInitCndTab((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbInitCnd((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbInitTab1((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbInitTab2((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbInitTab3((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbInitCtrl((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbInitDtl((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.jbInitDtlBtn((MABSP_LotInhLst)this);
	}

	/**
	 * [RegTarget]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRegTarget(MABSP_LotInhLst p) {
		// ブロック関連の初期化
		p.RegTargetPanel = p.beansFactory.createPanel("RegTarget");
		p.RegTargetTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABSP_LotInhLst p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABSP_LotInhLst p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCndTab(MABSP_LotInhLst p) {
		// ブロック関連の初期化
		p.CndTabPanel = p.beansFactory.createPanel("CndTab");
		p.CndTabTab = p.beansFactory.createTabbedPane("CndTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABSP_LotInhLst p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_cmn_flg = p.beansFactory.createCheckBox("Cnd.cmn_flg");
		p.Cnd_wg_flg = p.beansFactory.createCheckBox("Cnd.wg_flg");
		p.Cnd_srch_cmn = p.beansFactory.createButton("Cnd.srch_cmn");
		p.Cnd_srch_wg = p.beansFactory.createButton("Cnd.srch_wg");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_lot_inh_col_typ_Label = p.beansFactory.createLabel("Cnd.lot_inh_col_typ_Label");
		p.Cnd_lot_inh_col_typ = p.beansFactory.createTextComboBox("Cnd.lot_inh_col_typ");
		p.Cnd_lot_inh_col_typ.setLabel(p.Cnd_lot_inh_col_typ_Label);
		p.Cnd_lot_inh_col_typ_nm = p.beansFactory.createTextField("Cnd.lot_inh_col_typ_nm");
		p.Cnd_bom_ptn_Label = p.beansFactory.createLabel("Cnd.bom_ptn_Label");
		p.Cnd_bom_ptn = p.beansFactory.createTextComboBox("Cnd.bom_ptn");
		p.Cnd_bom_ptn.setLabel(p.Cnd_bom_ptn_Label);
		p.Cnd_dest_memo1_Label = p.beansFactory.createLabel("Cnd.dest_memo1_Label");
		p.Cnd_dest_memo1 = p.beansFactory.createTextField("Cnd.dest_memo1");
		p.Cnd_dest_memo1.setLabel(p.Cnd_dest_memo1_Label);
		p.Cnd_dest_memo2_Label = p.beansFactory.createLabel("Cnd.dest_memo2_Label");
		p.Cnd_dest_memo2 = p.beansFactory.createTextField("Cnd.dest_memo2");
		p.Cnd_dest_memo2.setLabel(p.Cnd_dest_memo2_Label);
		p.Cnd_dest_memo3_Label = p.beansFactory.createLabel("Cnd.dest_memo3_Label");
		p.Cnd_dest_memo3 = p.beansFactory.createTextField("Cnd.dest_memo3");
		p.Cnd_dest_memo3.setLabel(p.Cnd_dest_memo3_Label);
		p.Cnd_src_memo1_Label = p.beansFactory.createLabel("Cnd.src_memo1_Label");
		p.Cnd_src_memo1 = p.beansFactory.createTextField("Cnd.src_memo1");
		p.Cnd_src_memo1.setLabel(p.Cnd_src_memo1_Label);
		p.Cnd_src_memo2_Label = p.beansFactory.createLabel("Cnd.src_memo2_Label");
		p.Cnd_src_memo2 = p.beansFactory.createTextField("Cnd.src_memo2");
		p.Cnd_src_memo2.setLabel(p.Cnd_src_memo2_Label);
		p.Cnd_src_memo3_Label = p.beansFactory.createLabel("Cnd.src_memo3_Label");
		p.Cnd_src_memo3 = p.beansFactory.createTextField("Cnd.src_memo3");
		p.Cnd_src_memo3.setLabel(p.Cnd_src_memo3_Label);
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
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MABSP_LotInhLst p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MABSP_LotInhLst p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MABSP_LotInhLst p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABSP_LotInhLst p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABSP_LotInhLst p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT);
		p.columnDtl_wg_nm = p.beansFactory.createTableColumn("Dtl.wg_nm", MCColumnType.TEXT);
		p.columnDtl_par_itm_typ = p.beansFactory.createTableColumn("Dtl.par_itm_typ", MCColumnType.TEXT);
		p.columnDtl_par_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.par_itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_par_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.par_itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDtl_par_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.par_itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_bom_ptn = p.beansFactory.createTableColumn("Dtl.bom_ptn", MCColumnType.TEXT);
		p.columnDtl_lot_inh_col_typ = p.beansFactory.createTableColumn("Dtl.lot_inh_col_typ", MCColumnType.TEXT);
		p.columnDtl_lot_inh_col_typ_nm = p.beansFactory.createTableColumn("Dtl.lot_inh_col_typ_nm", MCColumnType.TEXT);
		p.columnDtl_lot_inh_typ = p.beansFactory.createTableColumn("Dtl.lot_inh_typ", MCColumnType.TEXT);
		p.columnDtl_lot_inh_typ_nm = p.beansFactory.createTableColumn("Dtl.lot_inh_typ_nm", MCColumnType.TEXT);
		p.columnDtl_add_concat_col = p.beansFactory.createTableColumn("Dtl.add_concat_col", MCColumnType.TEXT);
		p.columnDtl_add_concat_col_nm = p.beansFactory.createTableColumn("Dtl.add_concat_col_nm", MCColumnType.TEXT);
		p.columnDtl_overflow_err_flg = p.beansFactory.createTableColumn("Dtl.overflow_err_flg", MCColumnType.CHECK);
		p.columnDtl_chd_itm_typ = p.beansFactory.createTableColumn("Dtl.chd_itm_typ", MCColumnType.TEXT);
		p.columnDtl_chd_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.chd_itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_chd_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.chd_itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDtl_chd_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.chd_itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_prio = p.beansFactory.createTableColumn("Dtl.prio", MCColumnType.NUMBER);
		p.columnDtl_dest_memo1 = p.beansFactory.createTableColumn("Dtl.dest_memo1", MCColumnType.TEXT);
		p.columnDtl_dest_memo2 = p.beansFactory.createTableColumn("Dtl.dest_memo2", MCColumnType.TEXT);
		p.columnDtl_dest_memo3 = p.beansFactory.createTableColumn("Dtl.dest_memo3", MCColumnType.TEXT);
		p.columnDtl_src_memo1 = p.beansFactory.createTableColumn("Dtl.src_memo1", MCColumnType.TEXT);
		p.columnDtl_src_memo2 = p.beansFactory.createTableColumn("Dtl.src_memo2", MCColumnType.TEXT);
		p.columnDtl_src_memo3 = p.beansFactory.createTableColumn("Dtl.src_memo3", MCColumnType.TEXT);
		p.columnDtl_dest_ins_usr_id = p.beansFactory.createTableColumn("Dtl.dest_ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_dest_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.dest_ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_dest_ins_ts = p.beansFactory.createTableColumn("Dtl.dest_ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_dest_ins_func_id = p.beansFactory.createTableColumn("Dtl.dest_ins_func_id", MCColumnType.TEXT);
		p.columnDtl_dest_ins_func_nm = p.beansFactory.createTableColumn("Dtl.dest_ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_dest_upd_cntr = p.beansFactory.createTableColumn("Dtl.dest_upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_dest_upd_usr_id = p.beansFactory.createTableColumn("Dtl.dest_upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_dest_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.dest_upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_dest_upd_ts = p.beansFactory.createTableColumn("Dtl.dest_upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_dest_upd_func_id = p.beansFactory.createTableColumn("Dtl.dest_upd_func_id", MCColumnType.TEXT);
		p.columnDtl_dest_upd_func_nm = p.beansFactory.createTableColumn("Dtl.dest_upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_dest_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.dest_upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtl_dest_del_usr_id = p.beansFactory.createTableColumn("Dtl.dest_del_usr_id", MCColumnType.TEXT);
		p.columnDtl_dest_del_usr_nm = p.beansFactory.createTableColumn("Dtl.dest_del_usr_nm", MCColumnType.TEXT);
		p.columnDtl_dest_del_ts = p.beansFactory.createTableColumn("Dtl.dest_del_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_src_ins_usr_id = p.beansFactory.createTableColumn("Dtl.src_ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_src_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.src_ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_src_ins_ts = p.beansFactory.createTableColumn("Dtl.src_ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_src_ins_func_id = p.beansFactory.createTableColumn("Dtl.src_ins_func_id", MCColumnType.TEXT);
		p.columnDtl_src_ins_func_nm = p.beansFactory.createTableColumn("Dtl.src_ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_src_upd_cntr = p.beansFactory.createTableColumn("Dtl.src_upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_src_upd_usr_id = p.beansFactory.createTableColumn("Dtl.src_upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_src_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.src_upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_src_upd_ts = p.beansFactory.createTableColumn("Dtl.src_upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_src_upd_func_id = p.beansFactory.createTableColumn("Dtl.src_upd_func_id", MCColumnType.TEXT);
		p.columnDtl_src_upd_func_nm = p.beansFactory.createTableColumn("Dtl.src_upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_src_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.src_upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtl_src_del_usr_id = p.beansFactory.createTableColumn("Dtl.src_del_usr_id", MCColumnType.TEXT);
		p.columnDtl_src_del_usr_nm = p.beansFactory.createTableColumn("Dtl.src_del_usr_nm", MCColumnType.TEXT);
		p.columnDtl_src_del_ts = p.beansFactory.createTableColumn("Dtl.src_del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABSP_LotInhLst p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_open_MABSP0210 = p.beansFactory.createButton("DtlBtn.open_MABSP0210", "open");
	}

	/**
	 * [RegTarget]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRegTarget(MABSP_LotInhLst p) {
		// ブロック関連の初期化
		p.RegTargetPanel.setBorder(p.RegTargetTitledBorder);
		p.add(p.RegTargetPanel);
		p.setLastBeans(p.RegTargetPanel);
		p.RegTargetPanel.setNextBeans(p.TopPanel);
		p.RegTargetPanel.setValueCheck(false);
		p.RegTargetPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RegTargetPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABSP_LotInhLst p) {
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
	protected static void jbInitFold(MABSP_LotInhLst p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndTabPanel, null);
		p.FoldPanel.setLastBeans(p.CndTabPanel);
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCndTab(MABSP_LotInhLst p) {
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
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABSP_LotInhLst p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.DtlPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.RegTargetPanel.add(p.Cnd_cmn_flg);
		p.RegTargetPanel.setLastBeans(p.Cnd_cmn_flg);
		p.Cnd_cmn_flg.setNextBeans(p.Cnd_wg_flg);
		p.Cnd_cmn_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.cmn_flg_META);
		p.RegTargetPanel.add(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.wg_flg_META);
		p.Cnd_srch_cmn.setIcon("SEARCH");
		p.Cnd_srch_cmn.setFunctionKey(MCFunctionKey.F1);
		p.Tab1Panel.setLastBeans(p.Cnd_srch_cmn);
		p.Tab1Panel.add(p.Cnd_srch_cmn);
		p.Cnd_srch_cmn.setNextBeans(p.Cnd_srch_wg);
		p.Cnd_srch_wg.setIcon("SEARCH");
		p.Cnd_srch_wg.setFunctionKey(MCFunctionKey.F1);
		p.Tab1Panel.add(p.Cnd_srch_wg);
		p.Cnd_srch_wg.setNextBeans(p.Cnd_dt_PPanel);
		p.Tab1Panel.add(p.Cnd_dt_PPanel);
		p.Cnd_dt_PPanel.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.Tab1Panel.add(p.Cnd_wg_cd_Label);
		p.Tab1Panel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.wg_cd_META);
		p.Tab1Panel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_par_itm_typ_p_PPanel);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Tab1Panel.add(p.Cnd_par_itm_typ_p_PPanel);
		p.Cnd_par_itm_typ_p_PPanel.setNextBeans(p.Cnd_par_itm_p_PPanel);
		p.Tab1Panel.add(p.Cnd_par_itm_p_PPanel);
		p.Cnd_par_itm_p_PPanel.setNextBeans(p.Cnd_chd_itm_typ_p_PPanel);
		p.Cnd_par_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub1,p.Cnd_par_itm_sub2,p.Cnd_par_itm_sub3);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub2,p.Cnd_par_itm_sub3);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub3);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_par_itm_nm);
		p.Tab1Panel.add(p.Cnd_chd_itm_typ_p_PPanel);
		p.Cnd_chd_itm_typ_p_PPanel.setNextBeans(p.Cnd_chd_itm_p_PPanel);
		p.Tab1Panel.add(p.Cnd_chd_itm_p_PPanel);
		p.Cnd_chd_itm_p_PPanel.setNextBeans(p.Cnd_lot_inh_col_typ);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_chd_itm_nm,p.Cnd_chd_itm_sub1,p.Cnd_chd_itm_sub2,p.Cnd_chd_itm_sub3);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_chd_itm_nm,p.Cnd_chd_itm_sub2,p.Cnd_chd_itm_sub3);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_chd_itm_nm,p.Cnd_chd_itm_sub3);
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_chd_itm_nm);
		p.Cnd_lot_inh_col_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_inh_col_typ, true);
		p.Cnd_lot_inh_col_typ.setLinkBeans(p.Cnd_lot_inh_col_typ_nm);
		p.Tab1Panel.add(p.Cnd_lot_inh_col_typ_Label);
		p.Tab1Panel.add(p.Cnd_lot_inh_col_typ);
		p.Cnd_lot_inh_col_typ.setNextBeans(p.Cnd_lot_inh_col_typ_nm);
		p.Cnd_lot_inh_col_typ.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.lot_inh_col_typ_META);
		p.Tab1Panel.add(p.Cnd_lot_inh_col_typ_nm);
		p.Cnd_lot_inh_col_typ_nm.setNextBeans(p.Cnd_bom_ptn);
		p.Cnd_lot_inh_col_typ_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.lot_inh_col_typ_nm_META);
		p.Cnd_bom_ptn.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bom_ptn, true);
		p.Tab1Panel.add(p.Cnd_bom_ptn_Label);
		p.Tab1Panel.add(p.Cnd_bom_ptn);
		p.Cnd_bom_ptn.setNextBeans(p.Cnd_dest_memo1);
		p.Cnd_bom_ptn.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.bom_ptn_META);
		p.Tab1Panel.add(p.Cnd_dest_memo1_Label);
		p.Tab1Panel.add(p.Cnd_dest_memo1);
		p.Cnd_dest_memo1.setNextBeans(p.Cnd_dest_memo2);
		p.Cnd_dest_memo1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.dest_memo1_META);
		p.setPluralValueEnable(p.Cnd_dest_memo1, true);
		p.Tab1Panel.add(p.Cnd_dest_memo2_Label);
		p.Tab1Panel.add(p.Cnd_dest_memo2);
		p.Cnd_dest_memo2.setNextBeans(p.Cnd_dest_memo3);
		p.Cnd_dest_memo2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.dest_memo2_META);
		p.setPluralValueEnable(p.Cnd_dest_memo2, true);
		p.Tab1Panel.add(p.Cnd_dest_memo3_Label);
		p.Tab1Panel.add(p.Cnd_dest_memo3);
		p.Cnd_dest_memo3.setNextBeans(p.Cnd_src_memo1);
		p.Cnd_dest_memo3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.dest_memo3_META);
		p.setPluralValueEnable(p.Cnd_dest_memo3, true);
		p.Tab1Panel.add(p.Cnd_src_memo1_Label);
		p.Tab1Panel.add(p.Cnd_src_memo1);
		p.Cnd_src_memo1.setNextBeans(p.Cnd_src_memo2);
		p.Cnd_src_memo1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.src_memo1_META);
		p.setPluralValueEnable(p.Cnd_src_memo1, true);
		p.Tab1Panel.add(p.Cnd_src_memo2_Label);
		p.Tab1Panel.add(p.Cnd_src_memo2);
		p.Cnd_src_memo2.setNextBeans(p.Cnd_src_memo3);
		p.Cnd_src_memo2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.src_memo2_META);
		p.setPluralValueEnable(p.Cnd_src_memo2, true);
		p.Tab1Panel.add(p.Cnd_src_memo3_Label);
		p.Tab1Panel.add(p.Cnd_src_memo3);
		p.Cnd_src_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_src_memo3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.src_memo3_META);
		p.setPluralValueEnable(p.Cnd_src_memo3, true);
		p.Tab1Panel.add(p.Cnd_del_flg_lab);
		p.Tab1Panel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.off_del_flg_META);
		p.Tab1Panel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.on_del_flg_META);
		p.Cnd_par_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd1, true);
		p.Cnd_par_itm_grp_cd1.setLinkBeans(p.Cnd_par_itm_grp_nm1);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd1_Label);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd1);
		p.Tab2Panel.setLastBeans(p.Cnd_par_itm_grp_cd1);
		p.Cnd_par_itm_grp_cd1.setNextBeans(p.Cnd_par_itm_grp_nm1);
		p.Cnd_par_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.par_itm_grp_cd1_META);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_nm1);
		p.Cnd_par_itm_grp_nm1.setNextBeans(p.Cnd_par_itm_grp_cd2);
		p.Cnd_par_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.par_itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm1, true);
		p.Cnd_par_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd2, true);
		p.Cnd_par_itm_grp_cd2.setLinkBeans(p.Cnd_par_itm_grp_nm2);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd2_Label);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd2);
		p.Cnd_par_itm_grp_cd2.setNextBeans(p.Cnd_par_itm_grp_nm2);
		p.Cnd_par_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.par_itm_grp_cd2_META);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_nm2);
		p.Cnd_par_itm_grp_nm2.setNextBeans(p.Cnd_par_itm_grp_cd3);
		p.Cnd_par_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.par_itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm2, true);
		p.Cnd_par_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd3, true);
		p.Cnd_par_itm_grp_cd3.setLinkBeans(p.Cnd_par_itm_grp_nm3);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd3_Label);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd3);
		p.Cnd_par_itm_grp_cd3.setNextBeans(p.Cnd_par_itm_grp_nm3);
		p.Cnd_par_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.par_itm_grp_cd3_META);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_nm3);
		p.Cnd_par_itm_grp_nm3.setNextBeans(p.Cnd_par_itm_grp_cd4);
		p.Cnd_par_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.par_itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm3, true);
		p.Cnd_par_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd4, true);
		p.Cnd_par_itm_grp_cd4.setLinkBeans(p.Cnd_par_itm_grp_nm4);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd4_Label);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd4);
		p.Cnd_par_itm_grp_cd4.setNextBeans(p.Cnd_par_itm_grp_nm4);
		p.Cnd_par_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.par_itm_grp_cd4_META);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_nm4);
		p.Cnd_par_itm_grp_nm4.setNextBeans(p.Cnd_par_itm_grp_cd5);
		p.Cnd_par_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.par_itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm4, true);
		p.Cnd_par_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd5, true);
		p.Cnd_par_itm_grp_cd5.setLinkBeans(p.Cnd_par_itm_grp_nm5);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd5_Label);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd5);
		p.Cnd_par_itm_grp_cd5.setNextBeans(p.Cnd_par_itm_grp_nm5);
		p.Cnd_par_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.par_itm_grp_cd5_META);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_nm5);
		p.Cnd_par_itm_grp_nm5.setNextBeans(p.Cnd_par_itm_grp_cd6);
		p.Cnd_par_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.par_itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm5, true);
		p.Cnd_par_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd6, true);
		p.Cnd_par_itm_grp_cd6.setLinkBeans(p.Cnd_par_itm_grp_nm6);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd6_Label);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd6);
		p.Cnd_par_itm_grp_cd6.setNextBeans(p.Cnd_par_itm_grp_nm6);
		p.Cnd_par_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.par_itm_grp_cd6_META);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_nm6);
		p.Cnd_par_itm_grp_nm6.setNextBeans(p.Cnd_par_itm_grp_cd7);
		p.Cnd_par_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.par_itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm6, true);
		p.Cnd_par_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd7, true);
		p.Cnd_par_itm_grp_cd7.setLinkBeans(p.Cnd_par_itm_grp_nm7);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd7_Label);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd7);
		p.Cnd_par_itm_grp_cd7.setNextBeans(p.Cnd_par_itm_grp_nm7);
		p.Cnd_par_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.par_itm_grp_cd7_META);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_nm7);
		p.Cnd_par_itm_grp_nm7.setNextBeans(p.Cnd_par_itm_grp_cd8);
		p.Cnd_par_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.par_itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm7, true);
		p.Cnd_par_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd8, true);
		p.Cnd_par_itm_grp_cd8.setLinkBeans(p.Cnd_par_itm_grp_nm8);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd8_Label);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd8);
		p.Cnd_par_itm_grp_cd8.setNextBeans(p.Cnd_par_itm_grp_nm8);
		p.Cnd_par_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.par_itm_grp_cd8_META);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_nm8);
		p.Cnd_par_itm_grp_nm8.setNextBeans(p.Cnd_par_itm_grp_cd9);
		p.Cnd_par_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.par_itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm8, true);
		p.Cnd_par_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd9, true);
		p.Cnd_par_itm_grp_cd9.setLinkBeans(p.Cnd_par_itm_grp_nm9);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd9_Label);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd9);
		p.Cnd_par_itm_grp_cd9.setNextBeans(p.Cnd_par_itm_grp_nm9);
		p.Cnd_par_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.par_itm_grp_cd9_META);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_nm9);
		p.Cnd_par_itm_grp_nm9.setNextBeans(p.Cnd_par_itm_grp_cd10);
		p.Cnd_par_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.par_itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm9, true);
		p.Cnd_par_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_cd10, true);
		p.Cnd_par_itm_grp_cd10.setLinkBeans(p.Cnd_par_itm_grp_nm10);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd10_Label);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_cd10);
		p.Cnd_par_itm_grp_cd10.setNextBeans(p.Cnd_par_itm_grp_nm10);
		p.Cnd_par_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.par_itm_grp_cd10_META);
		p.Tab2Panel.add(p.Cnd_par_itm_grp_nm10);
		p.Cnd_par_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.par_itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_par_itm_grp_nm10, true);
		p.Cnd_chd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_cd1, true);
		p.Cnd_chd_itm_grp_cd1.setLinkBeans(p.Cnd_chd_itm_grp_nm1);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd1_Label);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd1);
		p.Tab3Panel.setLastBeans(p.Cnd_chd_itm_grp_cd1);
		p.Cnd_chd_itm_grp_cd1.setNextBeans(p.Cnd_chd_itm_grp_nm1);
		p.Cnd_chd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.chd_itm_grp_cd1_META);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_nm1);
		p.Cnd_chd_itm_grp_nm1.setNextBeans(p.Cnd_chd_itm_grp_cd2);
		p.Cnd_chd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.chd_itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_nm1, true);
		p.Cnd_chd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_cd2, true);
		p.Cnd_chd_itm_grp_cd2.setLinkBeans(p.Cnd_chd_itm_grp_nm2);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd2_Label);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd2);
		p.Cnd_chd_itm_grp_cd2.setNextBeans(p.Cnd_chd_itm_grp_nm2);
		p.Cnd_chd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.chd_itm_grp_cd2_META);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_nm2);
		p.Cnd_chd_itm_grp_nm2.setNextBeans(p.Cnd_chd_itm_grp_cd3);
		p.Cnd_chd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.chd_itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_nm2, true);
		p.Cnd_chd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_cd3, true);
		p.Cnd_chd_itm_grp_cd3.setLinkBeans(p.Cnd_chd_itm_grp_nm3);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd3_Label);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd3);
		p.Cnd_chd_itm_grp_cd3.setNextBeans(p.Cnd_chd_itm_grp_nm3);
		p.Cnd_chd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.chd_itm_grp_cd3_META);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_nm3);
		p.Cnd_chd_itm_grp_nm3.setNextBeans(p.Cnd_chd_itm_grp_cd4);
		p.Cnd_chd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.chd_itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_nm3, true);
		p.Cnd_chd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_cd4, true);
		p.Cnd_chd_itm_grp_cd4.setLinkBeans(p.Cnd_chd_itm_grp_nm4);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd4_Label);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd4);
		p.Cnd_chd_itm_grp_cd4.setNextBeans(p.Cnd_chd_itm_grp_nm4);
		p.Cnd_chd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.chd_itm_grp_cd4_META);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_nm4);
		p.Cnd_chd_itm_grp_nm4.setNextBeans(p.Cnd_chd_itm_grp_cd5);
		p.Cnd_chd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.chd_itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_nm4, true);
		p.Cnd_chd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_cd5, true);
		p.Cnd_chd_itm_grp_cd5.setLinkBeans(p.Cnd_chd_itm_grp_nm5);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd5_Label);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd5);
		p.Cnd_chd_itm_grp_cd5.setNextBeans(p.Cnd_chd_itm_grp_nm5);
		p.Cnd_chd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.chd_itm_grp_cd5_META);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_nm5);
		p.Cnd_chd_itm_grp_nm5.setNextBeans(p.Cnd_chd_itm_grp_cd6);
		p.Cnd_chd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.chd_itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_nm5, true);
		p.Cnd_chd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_cd6, true);
		p.Cnd_chd_itm_grp_cd6.setLinkBeans(p.Cnd_chd_itm_grp_nm6);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd6_Label);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd6);
		p.Cnd_chd_itm_grp_cd6.setNextBeans(p.Cnd_chd_itm_grp_nm6);
		p.Cnd_chd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.chd_itm_grp_cd6_META);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_nm6);
		p.Cnd_chd_itm_grp_nm6.setNextBeans(p.Cnd_chd_itm_grp_cd7);
		p.Cnd_chd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.chd_itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_nm6, true);
		p.Cnd_chd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_cd7, true);
		p.Cnd_chd_itm_grp_cd7.setLinkBeans(p.Cnd_chd_itm_grp_nm7);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd7_Label);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd7);
		p.Cnd_chd_itm_grp_cd7.setNextBeans(p.Cnd_chd_itm_grp_nm7);
		p.Cnd_chd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.chd_itm_grp_cd7_META);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_nm7);
		p.Cnd_chd_itm_grp_nm7.setNextBeans(p.Cnd_chd_itm_grp_cd8);
		p.Cnd_chd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.chd_itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_nm7, true);
		p.Cnd_chd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_cd8, true);
		p.Cnd_chd_itm_grp_cd8.setLinkBeans(p.Cnd_chd_itm_grp_nm8);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd8_Label);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd8);
		p.Cnd_chd_itm_grp_cd8.setNextBeans(p.Cnd_chd_itm_grp_nm8);
		p.Cnd_chd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.chd_itm_grp_cd8_META);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_nm8);
		p.Cnd_chd_itm_grp_nm8.setNextBeans(p.Cnd_chd_itm_grp_cd9);
		p.Cnd_chd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.chd_itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_nm8, true);
		p.Cnd_chd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_cd9, true);
		p.Cnd_chd_itm_grp_cd9.setLinkBeans(p.Cnd_chd_itm_grp_nm9);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd9_Label);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd9);
		p.Cnd_chd_itm_grp_cd9.setNextBeans(p.Cnd_chd_itm_grp_nm9);
		p.Cnd_chd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.chd_itm_grp_cd9_META);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_nm9);
		p.Cnd_chd_itm_grp_nm9.setNextBeans(p.Cnd_chd_itm_grp_cd10);
		p.Cnd_chd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.chd_itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_nm9, true);
		p.Cnd_chd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_cd10, true);
		p.Cnd_chd_itm_grp_cd10.setLinkBeans(p.Cnd_chd_itm_grp_nm10);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd10_Label);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_cd10);
		p.Cnd_chd_itm_grp_cd10.setNextBeans(p.Cnd_chd_itm_grp_nm10);
		p.Cnd_chd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.chd_itm_grp_cd10_META);
		p.Tab3Panel.add(p.Cnd_chd_itm_grp_nm10);
		p.Cnd_chd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0200.CndR.chd_itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_chd_itm_grp_nm10, true);
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MABSP_LotInhLst p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MABSP_LotInhLst p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MABSP_LotInhLst p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABSP_LotInhLst p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABSP_LotInhLst p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlTable.setStatusColumnVisible(false);
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MABSP_LotInhLst p) {
		// ブロック関連の初期化
		p.add(p.DtlBtnPanel);
		p.DtlBtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.DtlBtn_open_MABSP0210.setFunctionKey(MCFunctionKey.F3);
		p.DtlBtnPanel.add(p.DtlBtn_open_MABSP0210);
		p.DtlBtnPanel.setLastBeans(p.DtlBtn_open_MABSP0210);
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
		MABSP_LotInhLst_MC.mcInitRegTarget((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.mcInitTop((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.mcInitFold((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.mcInitCndTab((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.mcInitCnd((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.mcInitTab1((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.mcInitTab2((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.mcInitTab3((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.mcInitCtrl((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.mcInitDtl((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.mcInitDtlBtn((MABSP_LotInhLst)this);

		// [SRCH]ステータスのモードの設定
		MABSP_LotInhLst_MC.statusInitSRCH_RegTarget((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.statusInitSRCH_Top((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.statusInitSRCH_Fold((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.statusInitSRCH_CndTab((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.statusInitSRCH_Cnd((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.statusInitSRCH_Tab1((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.statusInitSRCH_Tab2((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.statusInitSRCH_Tab3((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.statusInitSRCH_Ctrl((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.statusInitSRCH_Dtl((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.statusInitSRCH_DtlBtn((MABSP_LotInhLst)this);

		// [REF]ステータスのモードの設定
		MABSP_LotInhLst_MC.statusInitREF_RegTarget((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.statusInitREF_Top((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.statusInitREF_Fold((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.statusInitREF_CndTab((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.statusInitREF_Cnd((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.statusInitREF_Tab1((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.statusInitREF_Tab2((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.statusInitREF_Tab3((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.statusInitREF_Ctrl((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.statusInitREF_Dtl((MABSP_LotInhLst)this);
		MABSP_LotInhLst_MC.statusInitREF_DtlBtn((MABSP_LotInhLst)this);

	}

	/**
	 *  [RegTarget]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRegTarget(MABSP_LotInhLst p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABSP_LotInhLst p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABSP_LotInhLst p) {
	}

	/**
	 *  [CndTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCndTab(MABSP_LotInhLst p) {
		p.CndTabTab.addAllListener(p);
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABSP_LotInhLst p) {
		p.Cnd_cmn_flg.addAllListener(p);
		p.Cnd_wg_flg.addAllListener(p);
		p.Cnd_srch_cmn.addAllListener(p);
		p.Cnd_srch_cmn.setAPMethodName("doCnd_srch_cmn");
		p.Cnd_srch_wg.addAllListener(p);
		p.Cnd_srch_wg.setAPMethodName("doCnd_srch_wg");
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_par_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_chd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_chd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_lot_inh_col_typ.setListListener(p);
		p.Cnd_lot_inh_col_typ.addAllListener(p);
		p.Cnd_lot_inh_col_typ_nm.setListListener(p);
		p.Cnd_lot_inh_col_typ_nm.addAllListener(p);
		p.Cnd_bom_ptn.setListListener(p);
		p.Cnd_bom_ptn.addAllListener(p);
		p.Cnd_dest_memo1.setListListener(p);
		p.Cnd_dest_memo1.addAllListener(p);
		p.Cnd_dest_memo2.setListListener(p);
		p.Cnd_dest_memo2.addAllListener(p);
		p.Cnd_dest_memo3.setListListener(p);
		p.Cnd_dest_memo3.addAllListener(p);
		p.Cnd_src_memo1.setListListener(p);
		p.Cnd_src_memo1.addAllListener(p);
		p.Cnd_src_memo2.setListListener(p);
		p.Cnd_src_memo2.addAllListener(p);
		p.Cnd_src_memo3.setListListener(p);
		p.Cnd_src_memo3.addAllListener(p);
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
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MABSP_LotInhLst p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MABSP_LotInhLst p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MABSP_LotInhLst p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABSP_LotInhLst p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABSP_LotInhLst p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_wg_nm.addAllListener(p);
		p.columnDtl_wg_nm.setListListener(p);
		p.columnDtl_par_itm_typ.addAllListener(p);
		p.columnDtl_par_itm_typ.setListListener(p);
		p.columnDtl_par_itm_typ_nm.addAllListener(p);
		p.columnDtl_par_itm_typ_nm.setListListener(p);
		p.columnDtl_par_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_par_itm_typ_d_cd.setListListener(p);
		p.columnDtl_par_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_par_itm_typ_d_nm.setListListener(p);
		p.columnDtl_bom_ptn.addAllListener(p);
		p.columnDtl_bom_ptn.setListListener(p);
		p.columnDtl_lot_inh_col_typ.addAllListener(p);
		p.columnDtl_lot_inh_col_typ.setListListener(p);
		p.columnDtl_lot_inh_col_typ_nm.addAllListener(p);
		p.columnDtl_lot_inh_col_typ_nm.setListListener(p);
		p.columnDtl_lot_inh_typ.addAllListener(p);
		p.columnDtl_lot_inh_typ.setListListener(p);
		p.columnDtl_lot_inh_typ_nm.addAllListener(p);
		p.columnDtl_lot_inh_typ_nm.setListListener(p);
		p.columnDtl_add_concat_col.addAllListener(p);
		p.columnDtl_add_concat_col.setListListener(p);
		p.columnDtl_add_concat_col_nm.addAllListener(p);
		p.columnDtl_add_concat_col_nm.setListListener(p);
		p.columnDtl_overflow_err_flg.addAllListener(p);
		p.columnDtl_chd_itm_typ.addAllListener(p);
		p.columnDtl_chd_itm_typ.setListListener(p);
		p.columnDtl_chd_itm_typ_nm.addAllListener(p);
		p.columnDtl_chd_itm_typ_nm.setListListener(p);
		p.columnDtl_chd_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_chd_itm_typ_d_cd.setListListener(p);
		p.columnDtl_chd_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_chd_itm_typ_d_nm.setListListener(p);
		p.columnDtl_prio.addAllListener(p);
		p.columnDtl_prio.setListListener(p);
		p.columnDtl_dest_memo1.addAllListener(p);
		p.columnDtl_dest_memo1.setListListener(p);
		p.columnDtl_dest_memo2.addAllListener(p);
		p.columnDtl_dest_memo2.setListListener(p);
		p.columnDtl_dest_memo3.addAllListener(p);
		p.columnDtl_dest_memo3.setListListener(p);
		p.columnDtl_src_memo1.addAllListener(p);
		p.columnDtl_src_memo1.setListListener(p);
		p.columnDtl_src_memo2.addAllListener(p);
		p.columnDtl_src_memo2.setListListener(p);
		p.columnDtl_src_memo3.addAllListener(p);
		p.columnDtl_src_memo3.setListListener(p);
		p.columnDtl_dest_ins_usr_id.addAllListener(p);
		p.columnDtl_dest_ins_usr_id.setListListener(p);
		p.columnDtl_dest_ins_usr_nm.addAllListener(p);
		p.columnDtl_dest_ins_usr_nm.setListListener(p);
		p.columnDtl_dest_ins_ts.addAllListener(p);
		p.columnDtl_dest_ins_ts.setListListener(p);
		p.columnDtl_dest_ins_func_id.addAllListener(p);
		p.columnDtl_dest_ins_func_id.setListListener(p);
		p.columnDtl_dest_ins_func_nm.addAllListener(p);
		p.columnDtl_dest_ins_func_nm.setListListener(p);
		p.columnDtl_dest_upd_cntr.addAllListener(p);
		p.columnDtl_dest_upd_cntr.setListListener(p);
		p.columnDtl_dest_upd_usr_id.addAllListener(p);
		p.columnDtl_dest_upd_usr_id.setListListener(p);
		p.columnDtl_dest_upd_usr_nm.addAllListener(p);
		p.columnDtl_dest_upd_usr_nm.setListListener(p);
		p.columnDtl_dest_upd_ts.addAllListener(p);
		p.columnDtl_dest_upd_ts.setListListener(p);
		p.columnDtl_dest_upd_func_id.addAllListener(p);
		p.columnDtl_dest_upd_func_id.setListListener(p);
		p.columnDtl_dest_upd_func_nm.addAllListener(p);
		p.columnDtl_dest_upd_func_nm.setListListener(p);
		p.columnDtl_dest_upd_srv_req_no.addAllListener(p);
		p.columnDtl_dest_upd_srv_req_no.setListListener(p);
		p.columnDtl_dest_del_usr_id.addAllListener(p);
		p.columnDtl_dest_del_usr_id.setListListener(p);
		p.columnDtl_dest_del_usr_nm.addAllListener(p);
		p.columnDtl_dest_del_usr_nm.setListListener(p);
		p.columnDtl_dest_del_ts.addAllListener(p);
		p.columnDtl_dest_del_ts.setListListener(p);
		p.columnDtl_src_ins_usr_id.addAllListener(p);
		p.columnDtl_src_ins_usr_id.setListListener(p);
		p.columnDtl_src_ins_usr_nm.addAllListener(p);
		p.columnDtl_src_ins_usr_nm.setListListener(p);
		p.columnDtl_src_ins_ts.addAllListener(p);
		p.columnDtl_src_ins_ts.setListListener(p);
		p.columnDtl_src_ins_func_id.addAllListener(p);
		p.columnDtl_src_ins_func_id.setListListener(p);
		p.columnDtl_src_ins_func_nm.addAllListener(p);
		p.columnDtl_src_ins_func_nm.setListListener(p);
		p.columnDtl_src_upd_cntr.addAllListener(p);
		p.columnDtl_src_upd_cntr.setListListener(p);
		p.columnDtl_src_upd_usr_id.addAllListener(p);
		p.columnDtl_src_upd_usr_id.setListListener(p);
		p.columnDtl_src_upd_usr_nm.addAllListener(p);
		p.columnDtl_src_upd_usr_nm.setListListener(p);
		p.columnDtl_src_upd_ts.addAllListener(p);
		p.columnDtl_src_upd_ts.setListListener(p);
		p.columnDtl_src_upd_func_id.addAllListener(p);
		p.columnDtl_src_upd_func_id.setListListener(p);
		p.columnDtl_src_upd_func_nm.addAllListener(p);
		p.columnDtl_src_upd_func_nm.setListListener(p);
		p.columnDtl_src_upd_srv_req_no.addAllListener(p);
		p.columnDtl_src_upd_srv_req_no.setListListener(p);
		p.columnDtl_src_del_usr_id.addAllListener(p);
		p.columnDtl_src_del_usr_id.setListListener(p);
		p.columnDtl_src_del_usr_nm.addAllListener(p);
		p.columnDtl_src_del_usr_nm.setListListener(p);
		p.columnDtl_src_del_ts.addAllListener(p);
		p.columnDtl_src_del_ts.setListListener(p);
	}

	/**
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABSP_LotInhLst p) {
		p.DtlBtn_open_MABSP0210.addAllListener(p);
		p.DtlBtn_open_MABSP0210.setAPMethodName("doDtlBtn_open_MABSP0210");
	}

	/**
	 * [SRCH]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RegTarget(MABSP_LotInhLst p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MABSP_LotInhLst p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MABSP_LotInhLst p){

	}

	/**
	 * [SRCH]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_CndTab(MABSP_LotInhLst p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MABSP_LotInhLst p){
		p.Cnd_cmn_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_dt_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_chd_itm_typ_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_chd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_inh_col_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_lot_inh_col_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_bom_ptn.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_memo1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_memo2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_dest_memo3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_src_memo1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_src_memo2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_src_memo3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_cd10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_par_itm_grp_nm10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm4.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm5.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm6.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm7.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm8.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm9.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_cd10.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_chd_itm_grp_nm10.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab1(MABSP_LotInhLst p){

	}

	/**
	 * [SRCH]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab2(MABSP_LotInhLst p){

	}

	/**
	 * [SRCH]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tab3(MABSP_LotInhLst p){

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MABSP_LotInhLst p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MABSP_LotInhLst p){
		p.columnDtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_par_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_lot_inh_col_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_lot_inh_col_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_lot_inh_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_lot_inh_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_add_concat_col.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_add_concat_col_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_overflow_err_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_chd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_chd_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_dest_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dest_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dest_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_src_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_src_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlBtn(MABSP_LotInhLst p){
		p.DtlBtn_open_MABSP0210.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitREF_RegTarget(MABSP_LotInhLst p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABSP_LotInhLst p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABSP_LotInhLst p){

	}

	/**
	 * [REF]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_CndTab(MABSP_LotInhLst p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABSP_LotInhLst p){
		p.Cnd_cmn_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_dt_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_par_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_chd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_chd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_lot_inh_col_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lot_inh_col_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_bom_ptn.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_src_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_src_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_src_memo3.putMode(p, REF, MCMode.ENABLE);
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

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MABSP_LotInhLst p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MABSP_LotInhLst p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MABSP_LotInhLst p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABSP_LotInhLst p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABSP_LotInhLst p){
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_par_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_par_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_inh_col_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_inh_col_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_inh_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_inh_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_add_concat_col.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_add_concat_col_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_overflow_err_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_chd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_chd_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prio.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_dest_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dest_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_del_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_src_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_src_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtn(MABSP_LotInhLst p){
		p.DtlBtn_open_MABSP0210.putMode(p, REF, MCMode.ENABLE);

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
		MABSP_LotInhLst_MC.setTableConfigDtl((MABSP_LotInhLst)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABSP_LotInhLst p) {
		p.columnDtl_del_flg.setMeta(mcframe.clientMABS.MABSP0200.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMABS.MABSP0200.DtlR.wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_wg_nm.setMeta(mcframe.clientMABS.MABSP0200.DtlR.wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_nm);
		p.DtlTable.addTable(p.Dtl_par_itm_p_PPanel.ItmTable);
		p.columnDtl_par_itm_typ.setMeta(mcframe.clientMABS.MABSP0200.DtlR.par_itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_itm_typ);
		p.columnDtl_par_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP0200.DtlR.par_itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_itm_typ_nm);
		p.columnDtl_par_itm_typ_d_cd.setMeta(mcframe.clientMABS.MABSP0200.DtlR.par_itm_typ_d_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_itm_typ_d_cd);
		p.columnDtl_par_itm_typ_d_nm.setMeta(mcframe.clientMABS.MABSP0200.DtlR.par_itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_par_itm_typ_d_nm);
		p.columnDtl_bom_ptn.setMeta(mcframe.clientMABS.MABSP0200.DtlR.bom_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bom_ptn);
		p.columnDtl_lot_inh_col_typ.setMeta(mcframe.clientMABS.MABSP0200.DtlR.lot_inh_col_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_inh_col_typ);
		p.columnDtl_lot_inh_col_typ_nm.setMeta(mcframe.clientMABS.MABSP0200.DtlR.lot_inh_col_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_inh_col_typ_nm);
		p.columnDtl_lot_inh_typ.setMeta(mcframe.clientMABS.MABSP0200.DtlR.lot_inh_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_inh_typ);
		p.columnDtl_lot_inh_typ_nm.setMeta(mcframe.clientMABS.MABSP0200.DtlR.lot_inh_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_inh_typ_nm);
		p.columnDtl_add_concat_col.setMeta(mcframe.clientMABS.MABSP0200.DtlR.add_concat_col_META);
		p.DtlTable.addColumnConfig(p.columnDtl_add_concat_col);
		p.columnDtl_add_concat_col_nm.setMeta(mcframe.clientMABS.MABSP0200.DtlR.add_concat_col_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_add_concat_col_nm);
		p.columnDtl_overflow_err_flg.setMeta(mcframe.clientMABS.MABSP0200.DtlR.overflow_err_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_overflow_err_flg);
		p.DtlTable.addTable(p.Dtl_chd_itm_p_PPanel.ItmTable);
		p.columnDtl_chd_itm_typ.setMeta(mcframe.clientMABS.MABSP0200.DtlR.chd_itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_itm_typ);
		p.columnDtl_chd_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP0200.DtlR.chd_itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_itm_typ_nm);
		p.columnDtl_chd_itm_typ_d_cd.setMeta(mcframe.clientMABS.MABSP0200.DtlR.chd_itm_typ_d_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_itm_typ_d_cd);
		p.columnDtl_chd_itm_typ_d_nm.setMeta(mcframe.clientMABS.MABSP0200.DtlR.chd_itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_itm_typ_d_nm);
		p.columnDtl_prio.setMeta(mcframe.clientMABS.MABSP0200.DtlR.prio_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prio);
		p.DtlTable.addTable(p.Dtl_dt_p_PPanel.DtTable);
		p.columnDtl_dest_memo1.setMeta(mcframe.clientMABS.MABSP0200.DtlR.dest_memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_memo1);
		p.columnDtl_dest_memo2.setMeta(mcframe.clientMABS.MABSP0200.DtlR.dest_memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_memo2);
		p.columnDtl_dest_memo3.setMeta(mcframe.clientMABS.MABSP0200.DtlR.dest_memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_memo3);
		p.columnDtl_src_memo1.setMeta(mcframe.clientMABS.MABSP0200.DtlR.src_memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_memo1);
		p.columnDtl_src_memo2.setMeta(mcframe.clientMABS.MABSP0200.DtlR.src_memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_memo2);
		p.columnDtl_src_memo3.setMeta(mcframe.clientMABS.MABSP0200.DtlR.src_memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_memo3);
		p.columnDtl_dest_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0200.DtlR.dest_ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_ins_usr_id);
		p.columnDtl_dest_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0200.DtlR.dest_ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_ins_usr_nm);
		p.columnDtl_dest_ins_ts.setMeta(mcframe.clientMABS.MABSP0200.DtlR.dest_ins_ts_META);
		p.columnDtl_dest_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_ins_ts);
		p.columnDtl_dest_ins_func_id.setMeta(mcframe.clientMABS.MABSP0200.DtlR.dest_ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_ins_func_id);
		p.columnDtl_dest_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0200.DtlR.dest_ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_ins_func_nm);
		p.columnDtl_dest_upd_cntr.setMeta(mcframe.clientMABS.MABSP0200.DtlR.dest_upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_upd_cntr);
		p.columnDtl_dest_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0200.DtlR.dest_upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_upd_usr_id);
		p.columnDtl_dest_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0200.DtlR.dest_upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_upd_usr_nm);
		p.columnDtl_dest_upd_ts.setMeta(mcframe.clientMABS.MABSP0200.DtlR.dest_upd_ts_META);
		p.columnDtl_dest_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_upd_ts);
		p.columnDtl_dest_upd_func_id.setMeta(mcframe.clientMABS.MABSP0200.DtlR.dest_upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_upd_func_id);
		p.columnDtl_dest_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0200.DtlR.dest_upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_upd_func_nm);
		p.columnDtl_dest_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0200.DtlR.dest_upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_upd_srv_req_no);
		p.columnDtl_dest_del_usr_id.setMeta(mcframe.clientMABS.MABSP0200.DtlR.dest_del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_del_usr_id);
		p.columnDtl_dest_del_usr_nm.setMeta(mcframe.clientMABS.MABSP0200.DtlR.dest_del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_del_usr_nm);
		p.columnDtl_dest_del_ts.setMeta(mcframe.clientMABS.MABSP0200.DtlR.dest_del_ts_META);
		p.columnDtl_dest_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_del_ts);
		p.columnDtl_src_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0200.DtlR.src_ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_ins_usr_id);
		p.columnDtl_src_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0200.DtlR.src_ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_ins_usr_nm);
		p.columnDtl_src_ins_ts.setMeta(mcframe.clientMABS.MABSP0200.DtlR.src_ins_ts_META);
		p.columnDtl_src_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_src_ins_ts);
		p.columnDtl_src_ins_func_id.setMeta(mcframe.clientMABS.MABSP0200.DtlR.src_ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_ins_func_id);
		p.columnDtl_src_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0200.DtlR.src_ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_ins_func_nm);
		p.columnDtl_src_upd_cntr.setMeta(mcframe.clientMABS.MABSP0200.DtlR.src_upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_upd_cntr);
		p.columnDtl_src_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0200.DtlR.src_upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_upd_usr_id);
		p.columnDtl_src_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0200.DtlR.src_upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_upd_usr_nm);
		p.columnDtl_src_upd_ts.setMeta(mcframe.clientMABS.MABSP0200.DtlR.src_upd_ts_META);
		p.columnDtl_src_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_src_upd_ts);
		p.columnDtl_src_upd_func_id.setMeta(mcframe.clientMABS.MABSP0200.DtlR.src_upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_upd_func_id);
		p.columnDtl_src_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0200.DtlR.src_upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_upd_func_nm);
		p.columnDtl_src_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0200.DtlR.src_upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_upd_srv_req_no);
		p.columnDtl_src_del_usr_id.setMeta(mcframe.clientMABS.MABSP0200.DtlR.src_del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_del_usr_id);
		p.columnDtl_src_del_usr_nm.setMeta(mcframe.clientMABS.MABSP0200.DtlR.src_del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_src_del_usr_nm);
		p.columnDtl_src_del_ts.setMeta(mcframe.clientMABS.MABSP0200.DtlR.src_del_ts_META);
		p.columnDtl_src_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_src_del_ts);
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
		Cnd_par_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_chd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_chd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_chd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_chd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_chd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_chd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_chd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_chd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_chd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_lot_inh_col_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_lot_inh_col_typ.getListConfig().setPutter(getCnd_lot_inh_col_typ_ListPutter());
		Cnd_bom_ptn.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bom_ptn.getListConfig().setPutter(getCnd_bom_ptn_ListPutter());
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
	 * [Cnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_chd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_chd_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Cnd_lot_inh_col_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_lot_inh_col_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LotInhColTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_bom_ptn_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bom_ptn_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BomPtn");
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_cd) return getCnd_par_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub1) return getCnd_par_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub2) return getCnd_par_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub3) return getCnd_par_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_chd_itm_p_PPanel.Itm_itm_cd) return getCnd_chd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_chd_itm_p_PPanel.Itm_itm_sub1) return getCnd_chd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_chd_itm_p_PPanel.Itm_itm_sub2) return getCnd_chd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_chd_itm_p_PPanel.Itm_itm_sub3) return getCnd_chd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_lot_inh_col_typ) return getCnd_lot_inh_col_typ(row, info);
		if(combo == Cnd_bom_ptn) return getCnd_bom_ptn(row, info);
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
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch_cmn) doCnd_srch_cmn(info);
		else if (ap == Cnd_srch_wg) doCnd_srch_wg(info);
		else if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == DtlBtn_open_MABSP0210) doDtlBtn_open_MABSP0210(info);
	}

	/**
	 * [Cnd]パネルの[srch_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_cmn(MCEventInfo info);

	/**
	 * [Cnd]パネルの[srch_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_wg(MCEventInfo info);

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[open_MABSP0210]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_open_MABSP0210(MCEventInfo info);

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
		if (vc == Cnd_cmn_flg) return doCnd_cmn_flg_VC(info);
		if (vc == Cnd_wg_flg) return doCnd_wg_flg_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_lot_inh_col_typ) return doCnd_lot_inh_col_typ_VC(info);
		if (vc == Cnd_lot_inh_col_typ_nm) return doCnd_lot_inh_col_typ_nm_VC(info);
		if (vc == Cnd_bom_ptn) return doCnd_bom_ptn_VC(info);
		if (vc == Cnd_dest_memo1) return doCnd_dest_memo1_VC(info);
		if (vc == Cnd_dest_memo2) return doCnd_dest_memo2_VC(info);
		if (vc == Cnd_dest_memo3) return doCnd_dest_memo3_VC(info);
		if (vc == Cnd_src_memo1) return doCnd_src_memo1_VC(info);
		if (vc == Cnd_src_memo2) return doCnd_src_memo2_VC(info);
		if (vc == Cnd_src_memo3) return doCnd_src_memo3_VC(info);
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
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_wg_nm) return doDtl_wg_nm_VC(info);
		if (vc == columnDtl_par_itm_typ) return doDtl_par_itm_typ_VC(info);
		if (vc == columnDtl_par_itm_typ_nm) return doDtl_par_itm_typ_nm_VC(info);
		if (vc == columnDtl_par_itm_typ_d_cd) return doDtl_par_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_par_itm_typ_d_nm) return doDtl_par_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_bom_ptn) return doDtl_bom_ptn_VC(info);
		if (vc == columnDtl_lot_inh_col_typ) return doDtl_lot_inh_col_typ_VC(info);
		if (vc == columnDtl_lot_inh_col_typ_nm) return doDtl_lot_inh_col_typ_nm_VC(info);
		if (vc == columnDtl_lot_inh_typ) return doDtl_lot_inh_typ_VC(info);
		if (vc == columnDtl_lot_inh_typ_nm) return doDtl_lot_inh_typ_nm_VC(info);
		if (vc == columnDtl_add_concat_col) return doDtl_add_concat_col_VC(info);
		if (vc == columnDtl_add_concat_col_nm) return doDtl_add_concat_col_nm_VC(info);
		if (vc == columnDtl_overflow_err_flg) return doDtl_overflow_err_flg_VC(info);
		if (vc == columnDtl_chd_itm_typ) return doDtl_chd_itm_typ_VC(info);
		if (vc == columnDtl_chd_itm_typ_nm) return doDtl_chd_itm_typ_nm_VC(info);
		if (vc == columnDtl_chd_itm_typ_d_cd) return doDtl_chd_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_chd_itm_typ_d_nm) return doDtl_chd_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_prio) return doDtl_prio_VC(info);
		if (vc == columnDtl_dest_memo1) return doDtl_dest_memo1_VC(info);
		if (vc == columnDtl_dest_memo2) return doDtl_dest_memo2_VC(info);
		if (vc == columnDtl_dest_memo3) return doDtl_dest_memo3_VC(info);
		if (vc == columnDtl_src_memo1) return doDtl_src_memo1_VC(info);
		if (vc == columnDtl_src_memo2) return doDtl_src_memo2_VC(info);
		if (vc == columnDtl_src_memo3) return doDtl_src_memo3_VC(info);
		if (vc == columnDtl_dest_ins_usr_id) return doDtl_dest_ins_usr_id_VC(info);
		if (vc == columnDtl_dest_ins_usr_nm) return doDtl_dest_ins_usr_nm_VC(info);
		if (vc == columnDtl_dest_ins_ts) return doDtl_dest_ins_ts_VC(info);
		if (vc == columnDtl_dest_ins_func_id) return doDtl_dest_ins_func_id_VC(info);
		if (vc == columnDtl_dest_ins_func_nm) return doDtl_dest_ins_func_nm_VC(info);
		if (vc == columnDtl_dest_upd_cntr) return doDtl_dest_upd_cntr_VC(info);
		if (vc == columnDtl_dest_upd_usr_id) return doDtl_dest_upd_usr_id_VC(info);
		if (vc == columnDtl_dest_upd_usr_nm) return doDtl_dest_upd_usr_nm_VC(info);
		if (vc == columnDtl_dest_upd_ts) return doDtl_dest_upd_ts_VC(info);
		if (vc == columnDtl_dest_upd_func_id) return doDtl_dest_upd_func_id_VC(info);
		if (vc == columnDtl_dest_upd_func_nm) return doDtl_dest_upd_func_nm_VC(info);
		if (vc == columnDtl_dest_upd_srv_req_no) return doDtl_dest_upd_srv_req_no_VC(info);
		if (vc == columnDtl_dest_del_usr_id) return doDtl_dest_del_usr_id_VC(info);
		if (vc == columnDtl_dest_del_usr_nm) return doDtl_dest_del_usr_nm_VC(info);
		if (vc == columnDtl_dest_del_ts) return doDtl_dest_del_ts_VC(info);
		if (vc == columnDtl_src_ins_usr_id) return doDtl_src_ins_usr_id_VC(info);
		if (vc == columnDtl_src_ins_usr_nm) return doDtl_src_ins_usr_nm_VC(info);
		if (vc == columnDtl_src_ins_ts) return doDtl_src_ins_ts_VC(info);
		if (vc == columnDtl_src_ins_func_id) return doDtl_src_ins_func_id_VC(info);
		if (vc == columnDtl_src_ins_func_nm) return doDtl_src_ins_func_nm_VC(info);
		if (vc == columnDtl_src_upd_cntr) return doDtl_src_upd_cntr_VC(info);
		if (vc == columnDtl_src_upd_usr_id) return doDtl_src_upd_usr_id_VC(info);
		if (vc == columnDtl_src_upd_usr_nm) return doDtl_src_upd_usr_nm_VC(info);
		if (vc == columnDtl_src_upd_ts) return doDtl_src_upd_ts_VC(info);
		if (vc == columnDtl_src_upd_func_id) return doDtl_src_upd_func_id_VC(info);
		if (vc == columnDtl_src_upd_func_nm) return doDtl_src_upd_func_nm_VC(info);
		if (vc == columnDtl_src_upd_srv_req_no) return doDtl_src_upd_srv_req_no_VC(info);
		if (vc == columnDtl_src_del_usr_id) return doDtl_src_del_usr_id_VC(info);
		if (vc == columnDtl_src_del_usr_nm) return doDtl_src_del_usr_nm_VC(info);
		if (vc == columnDtl_src_del_ts) return doDtl_src_del_ts_VC(info);
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
	 * [Cnd]パネルの[lot_inh_col_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_inh_col_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_inh_col_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_inh_col_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[dest_memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[src_memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_src_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[src_memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_src_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[src_memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_src_memo3_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_inh_col_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_inh_col_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_inh_col_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_inh_col_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_inh_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_inh_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_inh_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_inh_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[add_concat_col]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_add_concat_col_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[add_concat_col_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_add_concat_col_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[overflow_err_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_overflow_err_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[src_del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_src_del_ts_VC(MCEventInfo info){
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
		else if (nc == Cnd_cmn_flg) doCnd_cmn_flg_NC(info);
		else if (nc == Cnd_wg_flg) doCnd_wg_flg_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_lot_inh_col_typ) doCnd_lot_inh_col_typ_NC(info);
		else if (nc == Cnd_lot_inh_col_typ_nm) doCnd_lot_inh_col_typ_nm_NC(info);
		else if (nc == Cnd_bom_ptn) doCnd_bom_ptn_NC(info);
		else if (nc == Cnd_dest_memo1) doCnd_dest_memo1_NC(info);
		else if (nc == Cnd_dest_memo2) doCnd_dest_memo2_NC(info);
		else if (nc == Cnd_dest_memo3) doCnd_dest_memo3_NC(info);
		else if (nc == Cnd_src_memo1) doCnd_src_memo1_NC(info);
		else if (nc == Cnd_src_memo2) doCnd_src_memo2_NC(info);
		else if (nc == Cnd_src_memo3) doCnd_src_memo3_NC(info);
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
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_wg_nm) doDtl_wg_nm_NC(info);
		else if (nc == columnDtl_par_itm_typ) doDtl_par_itm_typ_NC(info);
		else if (nc == columnDtl_par_itm_typ_nm) doDtl_par_itm_typ_nm_NC(info);
		else if (nc == columnDtl_par_itm_typ_d_cd) doDtl_par_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_par_itm_typ_d_nm) doDtl_par_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_bom_ptn) doDtl_bom_ptn_NC(info);
		else if (nc == columnDtl_lot_inh_col_typ) doDtl_lot_inh_col_typ_NC(info);
		else if (nc == columnDtl_lot_inh_col_typ_nm) doDtl_lot_inh_col_typ_nm_NC(info);
		else if (nc == columnDtl_lot_inh_typ) doDtl_lot_inh_typ_NC(info);
		else if (nc == columnDtl_lot_inh_typ_nm) doDtl_lot_inh_typ_nm_NC(info);
		else if (nc == columnDtl_add_concat_col) doDtl_add_concat_col_NC(info);
		else if (nc == columnDtl_add_concat_col_nm) doDtl_add_concat_col_nm_NC(info);
		else if (nc == columnDtl_overflow_err_flg) doDtl_overflow_err_flg_NC(info);
		else if (nc == columnDtl_chd_itm_typ) doDtl_chd_itm_typ_NC(info);
		else if (nc == columnDtl_chd_itm_typ_nm) doDtl_chd_itm_typ_nm_NC(info);
		else if (nc == columnDtl_chd_itm_typ_d_cd) doDtl_chd_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_chd_itm_typ_d_nm) doDtl_chd_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_prio) doDtl_prio_NC(info);
		else if (nc == columnDtl_dest_memo1) doDtl_dest_memo1_NC(info);
		else if (nc == columnDtl_dest_memo2) doDtl_dest_memo2_NC(info);
		else if (nc == columnDtl_dest_memo3) doDtl_dest_memo3_NC(info);
		else if (nc == columnDtl_src_memo1) doDtl_src_memo1_NC(info);
		else if (nc == columnDtl_src_memo2) doDtl_src_memo2_NC(info);
		else if (nc == columnDtl_src_memo3) doDtl_src_memo3_NC(info);
		else if (nc == columnDtl_dest_ins_usr_id) doDtl_dest_ins_usr_id_NC(info);
		else if (nc == columnDtl_dest_ins_usr_nm) doDtl_dest_ins_usr_nm_NC(info);
		else if (nc == columnDtl_dest_ins_ts) doDtl_dest_ins_ts_NC(info);
		else if (nc == columnDtl_dest_ins_func_id) doDtl_dest_ins_func_id_NC(info);
		else if (nc == columnDtl_dest_ins_func_nm) doDtl_dest_ins_func_nm_NC(info);
		else if (nc == columnDtl_dest_upd_cntr) doDtl_dest_upd_cntr_NC(info);
		else if (nc == columnDtl_dest_upd_usr_id) doDtl_dest_upd_usr_id_NC(info);
		else if (nc == columnDtl_dest_upd_usr_nm) doDtl_dest_upd_usr_nm_NC(info);
		else if (nc == columnDtl_dest_upd_ts) doDtl_dest_upd_ts_NC(info);
		else if (nc == columnDtl_dest_upd_func_id) doDtl_dest_upd_func_id_NC(info);
		else if (nc == columnDtl_dest_upd_func_nm) doDtl_dest_upd_func_nm_NC(info);
		else if (nc == columnDtl_dest_upd_srv_req_no) doDtl_dest_upd_srv_req_no_NC(info);
		else if (nc == columnDtl_dest_del_usr_id) doDtl_dest_del_usr_id_NC(info);
		else if (nc == columnDtl_dest_del_usr_nm) doDtl_dest_del_usr_nm_NC(info);
		else if (nc == columnDtl_dest_del_ts) doDtl_dest_del_ts_NC(info);
		else if (nc == columnDtl_src_ins_usr_id) doDtl_src_ins_usr_id_NC(info);
		else if (nc == columnDtl_src_ins_usr_nm) doDtl_src_ins_usr_nm_NC(info);
		else if (nc == columnDtl_src_ins_ts) doDtl_src_ins_ts_NC(info);
		else if (nc == columnDtl_src_ins_func_id) doDtl_src_ins_func_id_NC(info);
		else if (nc == columnDtl_src_ins_func_nm) doDtl_src_ins_func_nm_NC(info);
		else if (nc == columnDtl_src_upd_cntr) doDtl_src_upd_cntr_NC(info);
		else if (nc == columnDtl_src_upd_usr_id) doDtl_src_upd_usr_id_NC(info);
		else if (nc == columnDtl_src_upd_usr_nm) doDtl_src_upd_usr_nm_NC(info);
		else if (nc == columnDtl_src_upd_ts) doDtl_src_upd_ts_NC(info);
		else if (nc == columnDtl_src_upd_func_id) doDtl_src_upd_func_id_NC(info);
		else if (nc == columnDtl_src_upd_func_nm) doDtl_src_upd_func_nm_NC(info);
		else if (nc == columnDtl_src_upd_srv_req_no) doDtl_src_upd_srv_req_no_NC(info);
		else if (nc == columnDtl_src_del_usr_id) doDtl_src_del_usr_id_NC(info);
		else if (nc == columnDtl_src_del_usr_nm) doDtl_src_del_usr_nm_NC(info);
		else if (nc == columnDtl_src_del_ts) doDtl_src_del_ts_NC(info);
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
	 * [Cnd]パネルの[lot_inh_col_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_inh_col_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_inh_col_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_inh_col_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_memo3_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_col_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_col_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_col_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_col_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_concat_col]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_concat_col_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_concat_col_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_concat_col_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[overflow_err_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_overflow_err_flg_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prio_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_del_ts_NC(MCEventInfo info){
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
		else if (ne == Cnd_cmn_flg) doCnd_cmn_flg_NE(info);
		else if (ne == Cnd_wg_flg) doCnd_wg_flg_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_lot_inh_col_typ) doCnd_lot_inh_col_typ_NE(info);
		else if (ne == Cnd_lot_inh_col_typ_nm) doCnd_lot_inh_col_typ_nm_NE(info);
		else if (ne == Cnd_bom_ptn) doCnd_bom_ptn_NE(info);
		else if (ne == Cnd_dest_memo1) doCnd_dest_memo1_NE(info);
		else if (ne == Cnd_dest_memo2) doCnd_dest_memo2_NE(info);
		else if (ne == Cnd_dest_memo3) doCnd_dest_memo3_NE(info);
		else if (ne == Cnd_src_memo1) doCnd_src_memo1_NE(info);
		else if (ne == Cnd_src_memo2) doCnd_src_memo2_NE(info);
		else if (ne == Cnd_src_memo3) doCnd_src_memo3_NE(info);
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
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_wg_nm) doDtl_wg_nm_NE(info);
		else if (ne == columnDtl_par_itm_typ) doDtl_par_itm_typ_NE(info);
		else if (ne == columnDtl_par_itm_typ_nm) doDtl_par_itm_typ_nm_NE(info);
		else if (ne == columnDtl_par_itm_typ_d_cd) doDtl_par_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_par_itm_typ_d_nm) doDtl_par_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_bom_ptn) doDtl_bom_ptn_NE(info);
		else if (ne == columnDtl_lot_inh_col_typ) doDtl_lot_inh_col_typ_NE(info);
		else if (ne == columnDtl_lot_inh_col_typ_nm) doDtl_lot_inh_col_typ_nm_NE(info);
		else if (ne == columnDtl_lot_inh_typ) doDtl_lot_inh_typ_NE(info);
		else if (ne == columnDtl_lot_inh_typ_nm) doDtl_lot_inh_typ_nm_NE(info);
		else if (ne == columnDtl_add_concat_col) doDtl_add_concat_col_NE(info);
		else if (ne == columnDtl_add_concat_col_nm) doDtl_add_concat_col_nm_NE(info);
		else if (ne == columnDtl_overflow_err_flg) doDtl_overflow_err_flg_NE(info);
		else if (ne == columnDtl_chd_itm_typ) doDtl_chd_itm_typ_NE(info);
		else if (ne == columnDtl_chd_itm_typ_nm) doDtl_chd_itm_typ_nm_NE(info);
		else if (ne == columnDtl_chd_itm_typ_d_cd) doDtl_chd_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_chd_itm_typ_d_nm) doDtl_chd_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_prio) doDtl_prio_NE(info);
		else if (ne == columnDtl_dest_memo1) doDtl_dest_memo1_NE(info);
		else if (ne == columnDtl_dest_memo2) doDtl_dest_memo2_NE(info);
		else if (ne == columnDtl_dest_memo3) doDtl_dest_memo3_NE(info);
		else if (ne == columnDtl_src_memo1) doDtl_src_memo1_NE(info);
		else if (ne == columnDtl_src_memo2) doDtl_src_memo2_NE(info);
		else if (ne == columnDtl_src_memo3) doDtl_src_memo3_NE(info);
		else if (ne == columnDtl_dest_ins_usr_id) doDtl_dest_ins_usr_id_NE(info);
		else if (ne == columnDtl_dest_ins_usr_nm) doDtl_dest_ins_usr_nm_NE(info);
		else if (ne == columnDtl_dest_ins_ts) doDtl_dest_ins_ts_NE(info);
		else if (ne == columnDtl_dest_ins_func_id) doDtl_dest_ins_func_id_NE(info);
		else if (ne == columnDtl_dest_ins_func_nm) doDtl_dest_ins_func_nm_NE(info);
		else if (ne == columnDtl_dest_upd_cntr) doDtl_dest_upd_cntr_NE(info);
		else if (ne == columnDtl_dest_upd_usr_id) doDtl_dest_upd_usr_id_NE(info);
		else if (ne == columnDtl_dest_upd_usr_nm) doDtl_dest_upd_usr_nm_NE(info);
		else if (ne == columnDtl_dest_upd_ts) doDtl_dest_upd_ts_NE(info);
		else if (ne == columnDtl_dest_upd_func_id) doDtl_dest_upd_func_id_NE(info);
		else if (ne == columnDtl_dest_upd_func_nm) doDtl_dest_upd_func_nm_NE(info);
		else if (ne == columnDtl_dest_upd_srv_req_no) doDtl_dest_upd_srv_req_no_NE(info);
		else if (ne == columnDtl_dest_del_usr_id) doDtl_dest_del_usr_id_NE(info);
		else if (ne == columnDtl_dest_del_usr_nm) doDtl_dest_del_usr_nm_NE(info);
		else if (ne == columnDtl_dest_del_ts) doDtl_dest_del_ts_NE(info);
		else if (ne == columnDtl_src_ins_usr_id) doDtl_src_ins_usr_id_NE(info);
		else if (ne == columnDtl_src_ins_usr_nm) doDtl_src_ins_usr_nm_NE(info);
		else if (ne == columnDtl_src_ins_ts) doDtl_src_ins_ts_NE(info);
		else if (ne == columnDtl_src_ins_func_id) doDtl_src_ins_func_id_NE(info);
		else if (ne == columnDtl_src_ins_func_nm) doDtl_src_ins_func_nm_NE(info);
		else if (ne == columnDtl_src_upd_cntr) doDtl_src_upd_cntr_NE(info);
		else if (ne == columnDtl_src_upd_usr_id) doDtl_src_upd_usr_id_NE(info);
		else if (ne == columnDtl_src_upd_usr_nm) doDtl_src_upd_usr_nm_NE(info);
		else if (ne == columnDtl_src_upd_ts) doDtl_src_upd_ts_NE(info);
		else if (ne == columnDtl_src_upd_func_id) doDtl_src_upd_func_id_NE(info);
		else if (ne == columnDtl_src_upd_func_nm) doDtl_src_upd_func_nm_NE(info);
		else if (ne == columnDtl_src_upd_srv_req_no) doDtl_src_upd_srv_req_no_NE(info);
		else if (ne == columnDtl_src_del_usr_id) doDtl_src_del_usr_id_NE(info);
		else if (ne == columnDtl_src_del_usr_nm) doDtl_src_del_usr_nm_NE(info);
		else if (ne == columnDtl_src_del_ts) doDtl_src_del_ts_NE(info);
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
	 * [Cnd]パネルの[lot_inh_col_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_inh_col_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_inh_col_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_inh_col_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_memo3_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_col_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_col_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_col_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_col_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_concat_col]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_concat_col_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_concat_col_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_concat_col_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[overflow_err_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_overflow_err_flg_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prio_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_del_ts_NE(MCEventInfo info){
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
		else if (nx == Cnd_cmn_flg) doCnd_cmn_flg_NX(info);
		else if (nx == Cnd_wg_flg) doCnd_wg_flg_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_lot_inh_col_typ) doCnd_lot_inh_col_typ_NX(info);
		else if (nx == Cnd_lot_inh_col_typ_nm) doCnd_lot_inh_col_typ_nm_NX(info);
		else if (nx == Cnd_bom_ptn) doCnd_bom_ptn_NX(info);
		else if (nx == Cnd_dest_memo1) doCnd_dest_memo1_NX(info);
		else if (nx == Cnd_dest_memo2) doCnd_dest_memo2_NX(info);
		else if (nx == Cnd_dest_memo3) doCnd_dest_memo3_NX(info);
		else if (nx == Cnd_src_memo1) doCnd_src_memo1_NX(info);
		else if (nx == Cnd_src_memo2) doCnd_src_memo2_NX(info);
		else if (nx == Cnd_src_memo3) doCnd_src_memo3_NX(info);
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
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_wg_nm) doDtl_wg_nm_NX(info);
		else if (nx == columnDtl_par_itm_typ) doDtl_par_itm_typ_NX(info);
		else if (nx == columnDtl_par_itm_typ_nm) doDtl_par_itm_typ_nm_NX(info);
		else if (nx == columnDtl_par_itm_typ_d_cd) doDtl_par_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_par_itm_typ_d_nm) doDtl_par_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_bom_ptn) doDtl_bom_ptn_NX(info);
		else if (nx == columnDtl_lot_inh_col_typ) doDtl_lot_inh_col_typ_NX(info);
		else if (nx == columnDtl_lot_inh_col_typ_nm) doDtl_lot_inh_col_typ_nm_NX(info);
		else if (nx == columnDtl_lot_inh_typ) doDtl_lot_inh_typ_NX(info);
		else if (nx == columnDtl_lot_inh_typ_nm) doDtl_lot_inh_typ_nm_NX(info);
		else if (nx == columnDtl_add_concat_col) doDtl_add_concat_col_NX(info);
		else if (nx == columnDtl_add_concat_col_nm) doDtl_add_concat_col_nm_NX(info);
		else if (nx == columnDtl_overflow_err_flg) doDtl_overflow_err_flg_NX(info);
		else if (nx == columnDtl_chd_itm_typ) doDtl_chd_itm_typ_NX(info);
		else if (nx == columnDtl_chd_itm_typ_nm) doDtl_chd_itm_typ_nm_NX(info);
		else if (nx == columnDtl_chd_itm_typ_d_cd) doDtl_chd_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_chd_itm_typ_d_nm) doDtl_chd_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_prio) doDtl_prio_NX(info);
		else if (nx == columnDtl_dest_memo1) doDtl_dest_memo1_NX(info);
		else if (nx == columnDtl_dest_memo2) doDtl_dest_memo2_NX(info);
		else if (nx == columnDtl_dest_memo3) doDtl_dest_memo3_NX(info);
		else if (nx == columnDtl_src_memo1) doDtl_src_memo1_NX(info);
		else if (nx == columnDtl_src_memo2) doDtl_src_memo2_NX(info);
		else if (nx == columnDtl_src_memo3) doDtl_src_memo3_NX(info);
		else if (nx == columnDtl_dest_ins_usr_id) doDtl_dest_ins_usr_id_NX(info);
		else if (nx == columnDtl_dest_ins_usr_nm) doDtl_dest_ins_usr_nm_NX(info);
		else if (nx == columnDtl_dest_ins_ts) doDtl_dest_ins_ts_NX(info);
		else if (nx == columnDtl_dest_ins_func_id) doDtl_dest_ins_func_id_NX(info);
		else if (nx == columnDtl_dest_ins_func_nm) doDtl_dest_ins_func_nm_NX(info);
		else if (nx == columnDtl_dest_upd_cntr) doDtl_dest_upd_cntr_NX(info);
		else if (nx == columnDtl_dest_upd_usr_id) doDtl_dest_upd_usr_id_NX(info);
		else if (nx == columnDtl_dest_upd_usr_nm) doDtl_dest_upd_usr_nm_NX(info);
		else if (nx == columnDtl_dest_upd_ts) doDtl_dest_upd_ts_NX(info);
		else if (nx == columnDtl_dest_upd_func_id) doDtl_dest_upd_func_id_NX(info);
		else if (nx == columnDtl_dest_upd_func_nm) doDtl_dest_upd_func_nm_NX(info);
		else if (nx == columnDtl_dest_upd_srv_req_no) doDtl_dest_upd_srv_req_no_NX(info);
		else if (nx == columnDtl_dest_del_usr_id) doDtl_dest_del_usr_id_NX(info);
		else if (nx == columnDtl_dest_del_usr_nm) doDtl_dest_del_usr_nm_NX(info);
		else if (nx == columnDtl_dest_del_ts) doDtl_dest_del_ts_NX(info);
		else if (nx == columnDtl_src_ins_usr_id) doDtl_src_ins_usr_id_NX(info);
		else if (nx == columnDtl_src_ins_usr_nm) doDtl_src_ins_usr_nm_NX(info);
		else if (nx == columnDtl_src_ins_ts) doDtl_src_ins_ts_NX(info);
		else if (nx == columnDtl_src_ins_func_id) doDtl_src_ins_func_id_NX(info);
		else if (nx == columnDtl_src_ins_func_nm) doDtl_src_ins_func_nm_NX(info);
		else if (nx == columnDtl_src_upd_cntr) doDtl_src_upd_cntr_NX(info);
		else if (nx == columnDtl_src_upd_usr_id) doDtl_src_upd_usr_id_NX(info);
		else if (nx == columnDtl_src_upd_usr_nm) doDtl_src_upd_usr_nm_NX(info);
		else if (nx == columnDtl_src_upd_ts) doDtl_src_upd_ts_NX(info);
		else if (nx == columnDtl_src_upd_func_id) doDtl_src_upd_func_id_NX(info);
		else if (nx == columnDtl_src_upd_func_nm) doDtl_src_upd_func_nm_NX(info);
		else if (nx == columnDtl_src_upd_srv_req_no) doDtl_src_upd_srv_req_no_NX(info);
		else if (nx == columnDtl_src_del_usr_id) doDtl_src_del_usr_id_NX(info);
		else if (nx == columnDtl_src_del_usr_nm) doDtl_src_del_usr_nm_NX(info);
		else if (nx == columnDtl_src_del_ts) doDtl_src_del_ts_NX(info);
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
	 * [Cnd]パネルの[lot_inh_col_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_inh_col_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_inh_col_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_inh_col_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_memo3_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_col_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_col_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_col_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_col_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_concat_col]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_concat_col_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_concat_col_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_concat_col_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[overflow_err_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_overflow_err_flg_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prio_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_del_ts_NX(MCEventInfo info){
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
		else if (lc == Cnd_lot_inh_col_typ) doCnd_lot_inh_col_typ_LC(info);
		else if (lc == Cnd_lot_inh_col_typ_nm) doCnd_lot_inh_col_typ_nm_LC(info);
		else if (lc == Cnd_bom_ptn) doCnd_bom_ptn_LC(info);
		else if (lc == Cnd_dest_memo1) doCnd_dest_memo1_LC(info);
		else if (lc == Cnd_dest_memo2) doCnd_dest_memo2_LC(info);
		else if (lc == Cnd_dest_memo3) doCnd_dest_memo3_LC(info);
		else if (lc == Cnd_src_memo1) doCnd_src_memo1_LC(info);
		else if (lc == Cnd_src_memo2) doCnd_src_memo2_LC(info);
		else if (lc == Cnd_src_memo3) doCnd_src_memo3_LC(info);
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
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_wg_nm) doDtl_wg_nm_LC(info);
		else if (lc == columnDtl_par_itm_typ) doDtl_par_itm_typ_LC(info);
		else if (lc == columnDtl_par_itm_typ_nm) doDtl_par_itm_typ_nm_LC(info);
		else if (lc == columnDtl_par_itm_typ_d_cd) doDtl_par_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_par_itm_typ_d_nm) doDtl_par_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_bom_ptn) doDtl_bom_ptn_LC(info);
		else if (lc == columnDtl_lot_inh_col_typ) doDtl_lot_inh_col_typ_LC(info);
		else if (lc == columnDtl_lot_inh_col_typ_nm) doDtl_lot_inh_col_typ_nm_LC(info);
		else if (lc == columnDtl_lot_inh_typ) doDtl_lot_inh_typ_LC(info);
		else if (lc == columnDtl_lot_inh_typ_nm) doDtl_lot_inh_typ_nm_LC(info);
		else if (lc == columnDtl_add_concat_col) doDtl_add_concat_col_LC(info);
		else if (lc == columnDtl_add_concat_col_nm) doDtl_add_concat_col_nm_LC(info);
		else if (lc == columnDtl_chd_itm_typ) doDtl_chd_itm_typ_LC(info);
		else if (lc == columnDtl_chd_itm_typ_nm) doDtl_chd_itm_typ_nm_LC(info);
		else if (lc == columnDtl_chd_itm_typ_d_cd) doDtl_chd_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_chd_itm_typ_d_nm) doDtl_chd_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_prio) doDtl_prio_LC(info);
		else if (lc == columnDtl_dest_memo1) doDtl_dest_memo1_LC(info);
		else if (lc == columnDtl_dest_memo2) doDtl_dest_memo2_LC(info);
		else if (lc == columnDtl_dest_memo3) doDtl_dest_memo3_LC(info);
		else if (lc == columnDtl_src_memo1) doDtl_src_memo1_LC(info);
		else if (lc == columnDtl_src_memo2) doDtl_src_memo2_LC(info);
		else if (lc == columnDtl_src_memo3) doDtl_src_memo3_LC(info);
		else if (lc == columnDtl_dest_ins_usr_id) doDtl_dest_ins_usr_id_LC(info);
		else if (lc == columnDtl_dest_ins_usr_nm) doDtl_dest_ins_usr_nm_LC(info);
		else if (lc == columnDtl_dest_ins_ts) doDtl_dest_ins_ts_LC(info);
		else if (lc == columnDtl_dest_ins_func_id) doDtl_dest_ins_func_id_LC(info);
		else if (lc == columnDtl_dest_ins_func_nm) doDtl_dest_ins_func_nm_LC(info);
		else if (lc == columnDtl_dest_upd_cntr) doDtl_dest_upd_cntr_LC(info);
		else if (lc == columnDtl_dest_upd_usr_id) doDtl_dest_upd_usr_id_LC(info);
		else if (lc == columnDtl_dest_upd_usr_nm) doDtl_dest_upd_usr_nm_LC(info);
		else if (lc == columnDtl_dest_upd_ts) doDtl_dest_upd_ts_LC(info);
		else if (lc == columnDtl_dest_upd_func_id) doDtl_dest_upd_func_id_LC(info);
		else if (lc == columnDtl_dest_upd_func_nm) doDtl_dest_upd_func_nm_LC(info);
		else if (lc == columnDtl_dest_upd_srv_req_no) doDtl_dest_upd_srv_req_no_LC(info);
		else if (lc == columnDtl_dest_del_usr_id) doDtl_dest_del_usr_id_LC(info);
		else if (lc == columnDtl_dest_del_usr_nm) doDtl_dest_del_usr_nm_LC(info);
		else if (lc == columnDtl_dest_del_ts) doDtl_dest_del_ts_LC(info);
		else if (lc == columnDtl_src_ins_usr_id) doDtl_src_ins_usr_id_LC(info);
		else if (lc == columnDtl_src_ins_usr_nm) doDtl_src_ins_usr_nm_LC(info);
		else if (lc == columnDtl_src_ins_ts) doDtl_src_ins_ts_LC(info);
		else if (lc == columnDtl_src_ins_func_id) doDtl_src_ins_func_id_LC(info);
		else if (lc == columnDtl_src_ins_func_nm) doDtl_src_ins_func_nm_LC(info);
		else if (lc == columnDtl_src_upd_cntr) doDtl_src_upd_cntr_LC(info);
		else if (lc == columnDtl_src_upd_usr_id) doDtl_src_upd_usr_id_LC(info);
		else if (lc == columnDtl_src_upd_usr_nm) doDtl_src_upd_usr_nm_LC(info);
		else if (lc == columnDtl_src_upd_ts) doDtl_src_upd_ts_LC(info);
		else if (lc == columnDtl_src_upd_func_id) doDtl_src_upd_func_id_LC(info);
		else if (lc == columnDtl_src_upd_func_nm) doDtl_src_upd_func_nm_LC(info);
		else if (lc == columnDtl_src_upd_srv_req_no) doDtl_src_upd_srv_req_no_LC(info);
		else if (lc == columnDtl_src_del_usr_id) doDtl_src_del_usr_id_LC(info);
		else if (lc == columnDtl_src_del_usr_nm) doDtl_src_del_usr_nm_LC(info);
		else if (lc == columnDtl_src_del_ts) doDtl_src_del_ts_LC(info);
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
	 * [Cnd]パネルの[lot_inh_col_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_inh_col_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_inh_col_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_inh_col_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[src_memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_src_memo3_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_col_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_col_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_col_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_col_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_concat_col]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_concat_col_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[add_concat_col_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_add_concat_col_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prio_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[src_del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_src_del_ts_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_chd_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_chd_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_chd_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_chd_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_chd_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_lot_inh_col_typ]の作成メソッド
	 */
	public MCList getCnd_lot_inh_col_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLotInhColTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bom_ptn]の作成メソッド
	 */
	public MCList getCnd_bom_ptn(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBomPtn(row, info);
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

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABSL0200.Srch01")) {
			return new MA_MABSL0200_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABSL0200_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0200_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0200_Srch01;

		/** コンストラクタ */
		protected MA_MABSL0200_Srch01Bridge() {
			p_MA_MABSL0200_Srch01 = new MCParam(PDef.MA_MABSL0200_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0200_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABS.MABSP0200.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0200.DtlR.class));

			p_MA_MABSL0200_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0200_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0200_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0200_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0200_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABS.MABSP0200.CndR up0() {
			return (mcframe.clientMABS.MABSP0200.CndR)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP0200.DtlR> down0() {
			return (MCList<mcframe.clientMABS.MABSP0200.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABSL0200_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0200.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL0200_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABS.MABSP0200.DtlR>)p_MA_MABSL0200_Srch01.getContainerParam().getDownBlock(0));
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
}