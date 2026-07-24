package mcframe.clientMABS.MABSP0010;

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
import mcframe.clientMABS.MABSP0010.MABSP_ItmDtlReg_MC.MA_MABSL0010_Srch01Caller;
import mcframe.clientMABS.MABSP0010.MABSP_ItmDtlReg_MC.MA_MABSL0010_Sprt01Caller;
import mcframe.clientMABS.MABSP0010.MABSP_ItmDtlReg_MC.MA_MABSL0010_Upd01Caller;
import mcframe.clientMABS.MABSP0010.MABSP_ItmDtlReg_MC.MA_MABSL0010_Del01Caller;

/**
 * 画面"MABSP_ItmDtlReg"パネルクラスです。<p>
 *
 * 品目詳細マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSP_ItmDtlReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABSP0010";

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
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
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
	public MCLabel Cnd_rqst_loc_wg_cd_Label = null;
	/**
	 * Requested location WG cd. 依頼先場所ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_rqst_loc_wg_cd = null;
	/**
	 * Requested location WG name 依頼先場所ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_rqst_loc_wg_nm = null;
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
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
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
	 * Search (WG) 検索する（ワーキンググループ）.<p>
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
	public MCButton BulkSet_set_dt = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0010.DtlR> DtlTable = null;
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
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_mng_typ = null;
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asset_mng_typ = null;
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_unit_cd = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dec_place = null;
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_mng_typ = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl_def_bom_ptn = null;
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_mng_typ = null;
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
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_loc_nm = null;
	/**
	 * Factory/Distribution warehouse cd. 工場･物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場･物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_site_nm = null;
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
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqst_loc_cd = null;
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqst_loc_nm = null;
	/**
	 * Requested location WG cd. 依頼先場所ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqst_loc_wg_cd = null;
	/**
	 * Requested location WG name 依頼先場所ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqst_loc_wg_nm = null;
	/**
	 * Subcontractor master cd. (Location master) 外注先ＣＤ（場所マスタ）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_sppl_cd = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bom_ptn = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Dtl_dt_p_PPanel;
	public MCColumnConfig columnDtl_st_dt_key;// [Dtl]の[dt_p.st_dt_key]を[columnDtl_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnDtl_st_dt;// [Dtl]の[dt_p.st_dt]を[columnDtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_end_dt;// [Dtl]の[dt_p.end_dt]を[columnDtl_end_dt]としてエイリアス定義。
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_ptn = null;
	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mfg_lt = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_mfg_lt_qty_p_PPanel;
	public MCColumnConfig columnDtl_mfg_lt_add_qty;// [Dtl]の[mfg_lt_qty_p.qty]を[columnDtl_mfg_lt_add_qty]としてエイリアス定義。
	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_lt = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_purc_lt_qty_p_PPanel;
	public MCColumnConfig columnDtl_purc_lt_add_qty;// [Dtl]の[purc_lt_qty_p.qty]を[columnDtl_purc_lt_add_qty]としてエイリアス定義。
	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_basis_typ = null;
	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_basis_typ_nm = null;
	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_accpt_insp_lt = null;
	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_buf_lt = null;
	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ord_fix_pd = null;
	/**
	 * Aggregation (by day of week) type 曜日まとめ区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sz_day_week_typ = null;
	/**
	 * Aggregation (by day of week) type name 曜日まとめ区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sz_day_week_typ_nm = null;
	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sz_week = null;
	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_sz_pd = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_min_lot_qty_p_PPanel;
	public MCColumnConfig columnDtl_min_lot_qty;// [Dtl]の[min_lot_qty_p.qty]を[columnDtl_min_lot_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_batch_lot_qty_p_PPanel;
	public MCColumnConfig columnDtl_batch_lot_qty;// [Dtl]の[batch_lot_qty_p.qty]を[columnDtl_batch_lot_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_max_lot_qty_p_PPanel;
	public MCColumnConfig columnDtl_max_lot_qty;// [Dtl]の[max_lot_qty_p.qty]を[columnDtl_max_lot_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_nm = null;
	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_max_order = null;
	/**
	 * Priority 優先順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prio = null;
	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_order_ratio = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_yield_schd_qty_p_PPanel;
	public MCColumnConfig columnDtl_yield_schd_qty;// [Dtl]の[yield_schd_qty_p.qty]を[columnDtl_yield_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_mfg_inst_qty_p_PPanel;
	public MCColumnConfig columnDtl_mfg_inst_qty;// [Dtl]の[mfg_inst_qty_p.qty]を[columnDtl_mfg_inst_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_fxd_rqmt_qty_p_PPanel;
	public MCColumnConfig columnDtl_fxd_rqmt_qty;// [Dtl]の[fxd_rqmt_qty_p.qty]を[columnDtl_fxd_rqmt_qty]としてエイリアス定義。
	/**
	 * Lot numbering timing type ロット発番タイミング区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_issue_typ = null;
	/**
	 * Lot numbering timing type name ロット発番タイミング区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_issue_typ_nm = null;
	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bkf_flg = null;
	/**
	 * Rack/Line storage 棚・ライン格納.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ln_stk_flg = null;
	/**
	 * For long LT 先行手配対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pre_po_tgt_flg = null;
	/**
	 * Issue record sheet at mfg. order 製造指図時記録書発行.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inst_rec_issue_flg = null;
	/**
	 * Not for mfg. approval 製造承認対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_no_mfg_aprv_flg = null;
	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_lower_yield = null;
	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_std_yield = null;
	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_upper_yield = null;
	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_id_typ = null;
	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_id_typ_nm = null;
	/**
	 * Purchase request destination WG cd. 購買依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqst_wg_cd = null;
	/**
	 * Purchase requested WG name 購買依頼先ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rqst_wg_nm = null;
	/**
	 * PO batch 発注バッチ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_po_batch_flg = null;
	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsrc_cd1 = null;
	/**
	 * Resource name 1 資源名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsrc_nm1 = null;
	/**
	 * Resource unit name 1 資源単位名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsrc_unit_nm1 = null;
	/**
	 * Resource standard value 1 資源標準値１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsrc_std_qty1 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_qty1_p_PPanel;
	public MCColumnConfig columnDtl_rsrc_unit_qty1;// [Dtl]の[qty1_p.qty]を[columnDtl_rsrc_unit_qty1]としてエイリアス定義。
	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsrc_cd2 = null;
	/**
	 * Resource name 2 資源名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsrc_nm2 = null;
	/**
	 * Resource unit name 2 資源単位名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsrc_unit_nm2 = null;
	/**
	 * Resource standard value 2 資源標準値２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsrc_std_qty2 = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_qty2_p_PPanel;
	public MCColumnConfig columnDtl_rsrc_unit_qty2;// [Dtl]の[qty2_p.qty]を[columnDtl_rsrc_unit_qty2]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Dtl_sno_p_PPanel;
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
	/**
	 * Not for MRP ＭＲＰ対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_not_mrp_flg = null;
	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cost_ratio = null;
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
	// [DtlBtn]ブロック関連のField定義
	public MCPanel DtlBtnPanel = null;
	// [DtlBtn]ブロックの項目のField定義
	/**
	 * Mfg. item entry 製造品登録.<p>
	 *
	 */
	public MCButton DtlBtn_open_MABSP1100 = null;
	/**
	 * Purchasing item entry 購買品登録.<p>
	 *
	 */
	public MCButton DtlBtn_open_MABSP1110 = null;
	/**
	 * Inspection item entry 検査品登録.<p>
	 *
	 */
	public MCButton DtlBtn_open_MABSP1130 = null;
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
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton DtlBtn_del_cmn = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton DtlBtn_del_wg = null;
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

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX, DEL, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABSL0010_Srch01]のCallerの作成 */
	protected MABSP_ItmDtlReg_MC.MA_MABSL0010_Srch01Caller createMA_MABSL0010_Srch01() {
		MABSP_ItmDtlReg_MC.MA_MABSL0010_Srch01Caller<MABSP_ItmDtlReg, MA_MABSL0010_Srch01Bridge>
		caller = ((MABSP_ItmDtlReg_MC)this).new MA_MABSL0010_Srch01Caller<MABSP_ItmDtlReg, MA_MABSL0010_Srch01Bridge>(
					(MABSP_ItmDtlReg)this, new MA_MABSL0010_Srch01Bridge());
		return caller;
	}
	/** [MA_MABSL0010_Srch01]の呼び出し */
	protected void callMA_MABSL0010_Srch01() {
		MCCaller caller = createMA_MABSL0010_Srch01();
		caller.exec();
	}
	/** [MA_MABSL0010_Sprt01]のCallerの作成 */
	protected MABSP_ItmDtlReg_MC.MA_MABSL0010_Sprt01Caller createMA_MABSL0010_Sprt01() {
		MABSP_ItmDtlReg_MC.MA_MABSL0010_Sprt01Caller<MABSP_ItmDtlReg, MA_MABSL0010_Sprt01Bridge>
		caller = ((MABSP_ItmDtlReg_MC)this).new MA_MABSL0010_Sprt01Caller<MABSP_ItmDtlReg, MA_MABSL0010_Sprt01Bridge>(
					(MABSP_ItmDtlReg)this, new MA_MABSL0010_Sprt01Bridge());
		return caller;
	}
	/** [MA_MABSL0010_Sprt01]の呼び出し */
	protected void callMA_MABSL0010_Sprt01() {
		MCCaller caller = createMA_MABSL0010_Sprt01();
		caller.exec();
	}
	/** [MA_MABSL0010_Upd01]のCallerの作成 */
	protected MABSP_ItmDtlReg_MC.MA_MABSL0010_Upd01Caller createMA_MABSL0010_Upd01() {
		MABSP_ItmDtlReg_MC.MA_MABSL0010_Upd01Caller<MABSP_ItmDtlReg, MA_MABSL0010_Upd01Bridge>
		caller = ((MABSP_ItmDtlReg_MC)this).new MA_MABSL0010_Upd01Caller<MABSP_ItmDtlReg, MA_MABSL0010_Upd01Bridge>(
					(MABSP_ItmDtlReg)this, new MA_MABSL0010_Upd01Bridge());
		return caller;
	}
	/** [MA_MABSL0010_Upd01]の呼び出し */
	protected void callMA_MABSL0010_Upd01() {
		MCCaller caller = createMA_MABSL0010_Upd01();
		caller.exec();
	}
	/** [MA_MABSL0010_Del01]のCallerの作成 */
	protected MABSP_ItmDtlReg_MC.MA_MABSL0010_Del01Caller createMA_MABSL0010_Del01() {
		MABSP_ItmDtlReg_MC.MA_MABSL0010_Del01Caller<MABSP_ItmDtlReg, MA_MABSL0010_Del01Bridge>
		caller = ((MABSP_ItmDtlReg_MC)this).new MA_MABSL0010_Del01Caller<MABSP_ItmDtlReg, MA_MABSL0010_Del01Bridge>(
					(MABSP_ItmDtlReg)this, new MA_MABSL0010_Del01Bridge());
		return caller;
	}
	/** [MA_MABSL0010_Del01]の呼び出し */
	protected void callMA_MABSL0010_Del01() {
		MCCaller caller = createMA_MABSL0010_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP0010.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP0010.BulkSetR aBulkSetR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0010.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABS.MABSP0010.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP0010.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP0010.CndR createCndR() {
		return mcframe.clientMABS.MABSP0010.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMABS.MABSP0010.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABS.MABSP0010.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABS.MABSP0010.BulkSetR createBulkSetR() {
		return mcframe.clientMABS.MABSP0010.BulkSetR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABS.MABSP0010.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0010.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABS.MABSP0010.DtlR createDtlR() {
		return mcframe.clientMABS.MABSP0010.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0010.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0010.DtlR.class);
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
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(BulkSetPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_ItmDtlReg_MC_A() {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABSP_ItmDtlReg_MC_A(String name) {
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
		MABSP_ItmDtlReg_MC.jbCreateScreenOpe((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbCreateRegTarget((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbCreateTop((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbCreateFold((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbCreateCndTab((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbCreateCnd((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbCreateTab1((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbCreateTab2((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbCreateCtrl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbCreateRPnl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbCreateBulkSet((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbCreateDtl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbCreateDtlBtn((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbCreateEastBtn((MABSP_ItmDtlReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABSP_ItmDtlReg p) {
	}

	/**
	 * [RegTarget]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRegTarget(MABSP_ItmDtlReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABSP_ItmDtlReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABSP_ItmDtlReg p) {
	}

	/**
	 * [CndTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCndTab(MABSP_ItmDtlReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABSP_ItmDtlReg p) {
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
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MABSP_ItmDtlReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MABSP_ItmDtlReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABSP_ItmDtlReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MABSP_ItmDtlReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MABSP_ItmDtlReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABSP_ItmDtlReg p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0010.DtlR.$itm_p);
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
		p.Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP0010.DtlR.$dt_p);
		p.Dtl_dt_p_PPanel.setName("Dtl.dt_p");
		p.columnDtl_st_dt_key = p.Dtl_dt_p_PPanel.columnDt_st_dt_key;
		p.columnDtl_st_dt_key.addAliasName("Dtl.st_dt_key", p);
		p.columnDtl_st_dt = p.Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnDtl_st_dt.addAliasName("Dtl.st_dt", p);
		p.columnDtl_end_dt = p.Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnDtl_end_dt.addAliasName("Dtl.end_dt", p);
		p.Dtl_mfg_lt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0010.DtlR.$mfg_lt_qty_p);
		p.Dtl_mfg_lt_qty_p_PPanel.setName("Dtl.mfg_lt_qty_p");
		p.columnDtl_mfg_lt_add_qty = p.Dtl_mfg_lt_qty_p_PPanel.columnQty_qty;
		p.columnDtl_mfg_lt_add_qty.addAliasName("Dtl.mfg_lt_add_qty", p);
		p.Dtl_purc_lt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0010.DtlR.$purc_lt_qty_p);
		p.Dtl_purc_lt_qty_p_PPanel.setName("Dtl.purc_lt_qty_p");
		p.columnDtl_purc_lt_add_qty = p.Dtl_purc_lt_qty_p_PPanel.columnQty_qty;
		p.columnDtl_purc_lt_add_qty.addAliasName("Dtl.purc_lt_add_qty", p);
		p.Dtl_min_lot_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0010.DtlR.$min_lot_qty_p);
		p.Dtl_min_lot_qty_p_PPanel.setName("Dtl.min_lot_qty_p");
		p.columnDtl_min_lot_qty = p.Dtl_min_lot_qty_p_PPanel.columnQty_qty;
		p.columnDtl_min_lot_qty.addAliasName("Dtl.min_lot_qty", p);
		p.Dtl_batch_lot_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0010.DtlR.$batch_lot_qty_p);
		p.Dtl_batch_lot_qty_p_PPanel.setName("Dtl.batch_lot_qty_p");
		p.columnDtl_batch_lot_qty = p.Dtl_batch_lot_qty_p_PPanel.columnQty_qty;
		p.columnDtl_batch_lot_qty.addAliasName("Dtl.batch_lot_qty", p);
		p.Dtl_max_lot_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0010.DtlR.$max_lot_qty_p);
		p.Dtl_max_lot_qty_p_PPanel.setName("Dtl.max_lot_qty_p");
		p.columnDtl_max_lot_qty = p.Dtl_max_lot_qty_p_PPanel.columnQty_qty;
		p.columnDtl_max_lot_qty.addAliasName("Dtl.max_lot_qty", p);
		p.Dtl_yield_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0010.DtlR.$yield_schd_qty_p);
		p.Dtl_yield_schd_qty_p_PPanel.setName("Dtl.yield_schd_qty_p");
		p.columnDtl_yield_schd_qty = p.Dtl_yield_schd_qty_p_PPanel.columnQty_qty;
		p.columnDtl_yield_schd_qty.addAliasName("Dtl.yield_schd_qty", p);
		p.Dtl_mfg_inst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0010.DtlR.$mfg_inst_qty_p);
		p.Dtl_mfg_inst_qty_p_PPanel.setName("Dtl.mfg_inst_qty_p");
		p.columnDtl_mfg_inst_qty = p.Dtl_mfg_inst_qty_p_PPanel.columnQty_qty;
		p.columnDtl_mfg_inst_qty.addAliasName("Dtl.mfg_inst_qty", p);
		p.Dtl_fxd_rqmt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0010.DtlR.$fxd_rqmt_qty_p);
		p.Dtl_fxd_rqmt_qty_p_PPanel.setName("Dtl.fxd_rqmt_qty_p");
		p.columnDtl_fxd_rqmt_qty = p.Dtl_fxd_rqmt_qty_p_PPanel.columnQty_qty;
		p.columnDtl_fxd_rqmt_qty.addAliasName("Dtl.fxd_rqmt_qty", p);
		p.Dtl_qty1_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0010.DtlR.$qty1_p);
		p.Dtl_qty1_p_PPanel.setName("Dtl.qty1_p");
		p.columnDtl_rsrc_unit_qty1 = p.Dtl_qty1_p_PPanel.columnQty_qty;
		p.columnDtl_rsrc_unit_qty1.addAliasName("Dtl.rsrc_unit_qty1", p);
		p.Dtl_qty2_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP0010.DtlR.$qty2_p);
		p.Dtl_qty2_p_PPanel.setName("Dtl.qty2_p");
		p.columnDtl_rsrc_unit_qty2 = p.Dtl_qty2_p_PPanel.columnQty_qty;
		p.columnDtl_rsrc_unit_qty2.addAliasName("Dtl.rsrc_unit_qty2", p);
		p.Dtl_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMABS.MABSP0010.DtlR.$sno_p);
		p.Dtl_sno_p_PPanel.setName("Dtl.sno_p");
		p.columnDtl_sno1 = p.Dtl_sno_p_PPanel.columnSno_sno1;
		p.columnDtl_sno1.addAliasName("Dtl.sno1", p);
		p.columnDtl_sno2 = p.Dtl_sno_p_PPanel.columnSno_sno2;
		p.columnDtl_sno2.addAliasName("Dtl.sno2", p);
		p.columnDtl_sno3 = p.Dtl_sno_p_PPanel.columnSno_sno3;
		p.columnDtl_sno3.addAliasName("Dtl.sno3", p);
		p.columnDtl_sno4 = p.Dtl_sno_p_PPanel.columnSno_sno4;
		p.columnDtl_sno4.addAliasName("Dtl.sno4", p);
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABSP_ItmDtlReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABSP_ItmDtlReg p) {
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
	
	
	/** [Cnd_rqst_loc_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rqst_loc_wg_cd_p = null;

	/**
	 * [Cnd_rqst_loc_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqst_loc_wg_cd_ListPutter() {
		if (Cnd_rqst_loc_wg_cd_p == null) {
			Cnd_rqst_loc_wg_cd_p = createCnd_rqst_loc_wg_cd_ListPutter(Cnd_rqst_loc_wg_cd, "rqst_loc_wg_cd", "rqst_loc_wg_nm");

		}
		return Cnd_rqst_loc_wg_cd_p;
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
			Dtl_itm_p_PPanel_columnItm_itm_cd_p = createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_nm","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm","itm_sub1","itm_sub2","itm_sub3","stk_mng_typ","asset_mng_typ","unit_cd","dec_place","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","def_bom_ptn","lot_mng_typ","base_unit_cd","base_unit_nm");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_nm","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm","itm_sub2","itm_sub3","stk_mng_typ","asset_mng_typ","unit_cd","dec_place","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","def_bom_ptn","lot_mng_typ","base_unit_cd","base_unit_nm");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_nm","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm","itm_sub3","stk_mng_typ","asset_mng_typ","unit_cd","dec_place","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","def_bom_ptn","lot_mng_typ","base_unit_cd","base_unit_nm");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm","stk_mng_typ","asset_mng_typ","unit_cd","dec_place","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","def_bom_ptn","lot_mng_typ","base_unit_cd","base_unit_nm");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Dtl_mfg_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl_mfg_loc_cd_p = null;

	/**
	 * [Dtl_mfg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_mfg_loc_cd_ListPutter() {
		if (Dtl_mfg_loc_cd_p == null) {
			Dtl_mfg_loc_cd_p = createDtl_mfg_loc_cd_ListPutter(columnDtl_mfg_loc_cd, "mfg_loc_cd", "mfg_loc_nm","loc_sppl_cd","rsrc_cd1","rsrc_cd2","site_cd","site_nm");

		}
		return Dtl_mfg_loc_cd_p;
	}
	
	
	/** [Dtl_sppl_cd_ListPutter]の定義 */
	private MCListPutter Dtl_sppl_cd_p = null;

	/**
	 * [Dtl_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sppl_cd_ListPutter() {
		if (Dtl_sppl_cd_p == null) {
			Dtl_sppl_cd_p = createDtl_sppl_cd_ListPutter(columnDtl_sppl_cd, "sppl_cd", "sppl_nm");

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
	
	
	/** [Dtl_rqst_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl_rqst_loc_cd_p = null;

	/**
	 * [Dtl_rqst_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_rqst_loc_cd_ListPutter() {
		if (Dtl_rqst_loc_cd_p == null) {
			Dtl_rqst_loc_cd_p = createDtl_rqst_loc_cd_ListPutter(columnDtl_rqst_loc_cd, "rqst_loc_cd", "rqst_loc_nm","rqst_loc_wg_cd","rqst_loc_wg_nm");

		}
		return Dtl_rqst_loc_cd_p;
	}
	
	
	/** [Dtl_bom_ptn_ListPutter]の定義 */
	private MCListPutter Dtl_bom_ptn_p = null;

	/**
	 * [Dtl_bom_ptn_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bom_ptn_ListPutter() {
		if (Dtl_bom_ptn_p == null) {
			Dtl_bom_ptn_p = createDtl_bom_ptn_ListPutter(columnDtl_bom_ptn, "bom_ptn");

		}
		return Dtl_bom_ptn_p;
	}
	
	
	/** [Dtl_oper_ptn_ListPutter]の定義 */
	private MCListPutter Dtl_oper_ptn_p = null;

	/**
	 * [Dtl_oper_ptn_ListPutter]の取得
	 */
	protected MCListPutter getDtl_oper_ptn_ListPutter() {
		if (Dtl_oper_ptn_p == null) {
			Dtl_oper_ptn_p = createDtl_oper_ptn_ListPutter(columnDtl_oper_ptn, "oper_ptn");

		}
		return Dtl_oper_ptn_p;
	}
	
	
	/** [Dtl_purc_basis_typ_ListPutter]の定義 */
	private MCListPutter Dtl_purc_basis_typ_p = null;

	/**
	 * [Dtl_purc_basis_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_purc_basis_typ_ListPutter() {
		if (Dtl_purc_basis_typ_p == null) {
			Dtl_purc_basis_typ_p = createDtl_purc_basis_typ_ListPutter(columnDtl_purc_basis_typ, "purc_basis_typ", "purc_basis_typ_nm");

		}
		return Dtl_purc_basis_typ_p;
	}
	
	
	/** [Dtl_sz_day_week_typ_ListPutter]の定義 */
	private MCListPutter Dtl_sz_day_week_typ_p = null;

	/**
	 * [Dtl_sz_day_week_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sz_day_week_typ_ListPutter() {
		if (Dtl_sz_day_week_typ_p == null) {
			Dtl_sz_day_week_typ_p = createDtl_sz_day_week_typ_ListPutter(columnDtl_sz_day_week_typ, "sz_day_week_typ", "sz_day_week_typ_nm");

		}
		return Dtl_sz_day_week_typ_p;
	}
	
	
	/** [Dtl_lot_issue_typ_ListPutter]の定義 */
	private MCListPutter Dtl_lot_issue_typ_p = null;

	/**
	 * [Dtl_lot_issue_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_lot_issue_typ_ListPutter() {
		if (Dtl_lot_issue_typ_p == null) {
			Dtl_lot_issue_typ_p = createDtl_lot_issue_typ_ListPutter(columnDtl_lot_issue_typ, "lot_issue_typ", "lot_issue_typ_nm");

		}
		return Dtl_lot_issue_typ_p;
	}
	
	
	/** [Dtl_purc_id_typ_ListPutter]の定義 */
	private MCListPutter Dtl_purc_id_typ_p = null;

	/**
	 * [Dtl_purc_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_purc_id_typ_ListPutter() {
		if (Dtl_purc_id_typ_p == null) {
			Dtl_purc_id_typ_p = createDtl_purc_id_typ_ListPutter(columnDtl_purc_id_typ, "purc_id_typ", "purc_id_typ_nm");

		}
		return Dtl_purc_id_typ_p;
	}
	
	
	/** [Dtl_rqst_wg_cd_ListPutter]の定義 */
	private MCListPutter Dtl_rqst_wg_cd_p = null;

	/**
	 * [Dtl_rqst_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_rqst_wg_cd_ListPutter() {
		if (Dtl_rqst_wg_cd_p == null) {
			Dtl_rqst_wg_cd_p = createDtl_rqst_wg_cd_ListPutter(columnDtl_rqst_wg_cd, "rqst_wg_cd", "rqst_wg_nm");

		}
		return Dtl_rqst_wg_cd_p;
	}
	
	
	/** [Dtl_rsrc_cd1_ListPutter]の定義 */
	private MCListPutter Dtl_rsrc_cd1_p = null;

	/**
	 * [Dtl_rsrc_cd1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_rsrc_cd1_ListPutter() {
		if (Dtl_rsrc_cd1_p == null) {
			Dtl_rsrc_cd1_p = createDtl_rsrc_cd1_ListPutter(columnDtl_rsrc_cd1, "rsrc_cd1", "rsrc_nm1","rsrc_unit_nm1");

		}
		return Dtl_rsrc_cd1_p;
	}
	
	
	/** [Dtl_rsrc_cd2_ListPutter]の定義 */
	private MCListPutter Dtl_rsrc_cd2_p = null;

	/**
	 * [Dtl_rsrc_cd2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_rsrc_cd2_ListPutter() {
		if (Dtl_rsrc_cd2_p == null) {
			Dtl_rsrc_cd2_p = createDtl_rsrc_cd2_ListPutter(columnDtl_rsrc_cd2, "rsrc_cd2", "rsrc_nm2","rsrc_unit_nm2");

		}
		return Dtl_rsrc_cd2_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_ItmDtlReg create(){
		MABSP_ItmDtlReg p = new MABSP_ItmDtlReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_ItmDtlReg create(String name){
		MABSP_ItmDtlReg p = new MABSP_ItmDtlReg(name);
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
		MABSP_ItmDtlReg_MC.jbfInitScreenOpe((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbfInitRegTarget((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbfInitTop((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbfInitFold((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbfInitCndTab((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbfInitCnd((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbfInitTab1((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbfInitTab2((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbfInitCtrl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbfInitRPnl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbfInitBulkSet((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbfInitDtl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbfInitDtlBtn((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbfInitEastBtn((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbInitScreenOpe((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbInitRegTarget((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbInitTop((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbInitFold((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbInitCndTab((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbInitCnd((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbInitTab1((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbInitTab2((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbInitCtrl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbInitRPnl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbInitBulkSet((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbInitDtl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbInitDtlBtn((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.jbInitEastBtn((MABSP_ItmDtlReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABSP_ItmDtlReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [RegTarget]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRegTarget(MABSP_ItmDtlReg p) {
		// ブロック関連の初期化
		p.RegTargetPanel = p.beansFactory.createPanel("RegTarget");
		p.RegTargetTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABSP_ItmDtlReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABSP_ItmDtlReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCndTab(MABSP_ItmDtlReg p) {
		// ブロック関連の初期化
		p.CndTabPanel = p.beansFactory.createPanel("CndTab");
		p.CndTabTab = p.beansFactory.createTabbedPane("CndTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABSP_ItmDtlReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_cmn_flg = p.beansFactory.createCheckBox("Cnd.cmn_flg");
		p.Cnd_wg_flg = p.beansFactory.createCheckBox("Cnd.wg_flg");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_site_cd_Label = p.beansFactory.createLabel("Cnd.site_cd_Label");
		p.Cnd_site_cd = p.beansFactory.createTextComboBox("Cnd.site_cd");
		p.Cnd_site_cd.setLabel(p.Cnd_site_cd_Label);
		p.Cnd_site_nm = p.beansFactory.createTextField("Cnd.site_nm");
		p.Cnd_mfg_loc_cd_Label = p.beansFactory.createLabel("Cnd.mfg_loc_cd_Label");
		p.Cnd_mfg_loc_cd = p.beansFactory.createTextField("Cnd.mfg_loc_cd");
		p.Cnd_mfg_loc_cd.setLabel(p.Cnd_mfg_loc_cd_Label);
		p.Cnd_mfg_loc_nm = p.beansFactory.createTextField("Cnd.mfg_loc_nm");
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_maker_cd_Label = p.beansFactory.createLabel("Cnd.maker_cd_Label");
		p.Cnd_maker_cd = p.beansFactory.createTextField("Cnd.maker_cd");
		p.Cnd_maker_cd.setLabel(p.Cnd_maker_cd_Label);
		p.Cnd_maker_nm = p.beansFactory.createTextField("Cnd.maker_nm");
		p.Cnd_rqst_loc_cd_Label = p.beansFactory.createLabel("Cnd.rqst_loc_cd_Label");
		p.Cnd_rqst_loc_cd = p.beansFactory.createTextField("Cnd.rqst_loc_cd");
		p.Cnd_rqst_loc_cd.setLabel(p.Cnd_rqst_loc_cd_Label);
		p.Cnd_rqst_loc_nm = p.beansFactory.createTextField("Cnd.rqst_loc_nm");
		p.Cnd_rqst_loc_wg_cd_Label = p.beansFactory.createLabel("Cnd.rqst_loc_wg_cd_Label");
		p.Cnd_rqst_loc_wg_cd = p.beansFactory.createTextComboBox("Cnd.rqst_loc_wg_cd");
		p.Cnd_rqst_loc_wg_cd.setLabel(p.Cnd_rqst_loc_wg_cd_Label);
		p.Cnd_rqst_loc_wg_nm = p.beansFactory.createTextField("Cnd.rqst_loc_wg_nm");
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
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MABSP_ItmDtlReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MABSP_ItmDtlReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABSP_ItmDtlReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MABSP_ItmDtlReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_srch_cmn = p.beansFactory.createButton("RPnl.srch_cmn");
		p.RPnl_srch_wg = p.beansFactory.createButton("RPnl.srch_wg");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MABSP_ItmDtlReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
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
	protected static void jbfInitDtl(MABSP_ItmDtlReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_wg_nm = p.beansFactory.createTableColumn("Dtl.wg_nm", MCColumnType.TEXT);
		p.columnDtl_stk_mng_typ = p.beansFactory.createTableColumn("Dtl.stk_mng_typ", MCColumnType.TEXT);
		p.columnDtl_asset_mng_typ = p.beansFactory.createTableColumn("Dtl.asset_mng_typ", MCColumnType.TEXT);
		p.columnDtl_unit_cd = p.beansFactory.createTableColumn("Dtl.unit_cd", MCColumnType.TEXT);
		p.columnDtl_dec_place = p.beansFactory.createTableColumn("Dtl.dec_place", MCColumnType.NUMBER);
		p.columnDtl_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl_def_bom_ptn = p.beansFactory.createTableColumn("Dtl.def_bom_ptn", MCColumnType.TEXT);
		p.columnDtl_lot_mng_typ = p.beansFactory.createTableColumn("Dtl.lot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_itm_typ = p.beansFactory.createTableColumn("Dtl.itm_typ", MCColumnType.TEXT);
		p.columnDtl_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_mfg_loc_cd = p.beansFactory.createTableColumn("Dtl.mfg_loc_cd", MCColumnType.TEXT);
		p.columnDtl_mfg_loc_nm = p.beansFactory.createTableColumn("Dtl.mfg_loc_nm", MCColumnType.TEXT);
		p.columnDtl_site_cd = p.beansFactory.createTableColumn("Dtl.site_cd", MCColumnType.TEXT);
		p.columnDtl_site_nm = p.beansFactory.createTableColumn("Dtl.site_nm", MCColumnType.TEXT);
		p.columnDtl_sppl_cd = p.beansFactory.createTableColumn("Dtl.sppl_cd", MCColumnType.TEXT);
		p.columnDtl_sppl_nm = p.beansFactory.createTableColumn("Dtl.sppl_nm", MCColumnType.TEXT);
		p.columnDtl_maker_cd = p.beansFactory.createTableColumn("Dtl.maker_cd", MCColumnType.TEXT);
		p.columnDtl_maker_nm = p.beansFactory.createTableColumn("Dtl.maker_nm", MCColumnType.TEXT);
		p.columnDtl_rqst_loc_cd = p.beansFactory.createTableColumn("Dtl.rqst_loc_cd", MCColumnType.TEXT);
		p.columnDtl_rqst_loc_nm = p.beansFactory.createTableColumn("Dtl.rqst_loc_nm", MCColumnType.TEXT);
		p.columnDtl_rqst_loc_wg_cd = p.beansFactory.createTableColumn("Dtl.rqst_loc_wg_cd", MCColumnType.TEXT);
		p.columnDtl_rqst_loc_wg_nm = p.beansFactory.createTableColumn("Dtl.rqst_loc_wg_nm", MCColumnType.TEXT);
		p.columnDtl_loc_sppl_cd = p.beansFactory.createTableColumn("Dtl.loc_sppl_cd", MCColumnType.TEXT);
		p.columnDtl_bom_ptn = p.beansFactory.createTableColumn("Dtl.bom_ptn", MCColumnType.TEXT_COMBO_FREE);
		p.columnDtl_oper_ptn = p.beansFactory.createTableColumn("Dtl.oper_ptn", MCColumnType.TEXT_COMBO_FREE);
		p.columnDtl_mfg_lt = p.beansFactory.createTableColumn("Dtl.mfg_lt", MCColumnType.NUMBER);
		p.columnDtl_purc_lt = p.beansFactory.createTableColumn("Dtl.purc_lt", MCColumnType.NUMBER);
		p.columnDtl_purc_basis_typ = p.beansFactory.createTableColumn("Dtl.purc_basis_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_purc_basis_typ_nm = p.beansFactory.createTableColumn("Dtl.purc_basis_typ_nm", MCColumnType.TEXT);
		p.columnDtl_accpt_insp_lt = p.beansFactory.createTableColumn("Dtl.accpt_insp_lt", MCColumnType.NUMBER);
		p.columnDtl_buf_lt = p.beansFactory.createTableColumn("Dtl.buf_lt", MCColumnType.NUMBER);
		p.columnDtl_ord_fix_pd = p.beansFactory.createTableColumn("Dtl.ord_fix_pd", MCColumnType.NUMBER);
		p.columnDtl_sz_day_week_typ = p.beansFactory.createTableColumn("Dtl.sz_day_week_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_sz_day_week_typ_nm = p.beansFactory.createTableColumn("Dtl.sz_day_week_typ_nm", MCColumnType.TEXT);
		p.columnDtl_sz_week = p.beansFactory.createTableColumn("Dtl.sz_week", MCColumnType.NUMBER);
		p.columnDtl_lot_sz_pd = p.beansFactory.createTableColumn("Dtl.lot_sz_pd", MCColumnType.NUMBER);
		p.columnDtl_base_unit_cd = p.beansFactory.createTableColumn("Dtl.base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_base_unit_nm = p.beansFactory.createTableColumn("Dtl.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_max_order = p.beansFactory.createTableColumn("Dtl.max_order", MCColumnType.NUMBER);
		p.columnDtl_prio = p.beansFactory.createTableColumn("Dtl.prio", MCColumnType.NUMBER);
		p.columnDtl_order_ratio = p.beansFactory.createTableColumn("Dtl.order_ratio", MCColumnType.NUMBER);
		p.columnDtl_lot_issue_typ = p.beansFactory.createTableColumn("Dtl.lot_issue_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_lot_issue_typ_nm = p.beansFactory.createTableColumn("Dtl.lot_issue_typ_nm", MCColumnType.TEXT);
		p.columnDtl_bkf_flg = p.beansFactory.createTableColumn("Dtl.bkf_flg", MCColumnType.CHECK);
		p.columnDtl_ln_stk_flg = p.beansFactory.createTableColumn("Dtl.ln_stk_flg", MCColumnType.CHECK);
		p.columnDtl_pre_po_tgt_flg = p.beansFactory.createTableColumn("Dtl.pre_po_tgt_flg", MCColumnType.CHECK);
		p.columnDtl_inst_rec_issue_flg = p.beansFactory.createTableColumn("Dtl.inst_rec_issue_flg", MCColumnType.CHECK);
		p.columnDtl_no_mfg_aprv_flg = p.beansFactory.createTableColumn("Dtl.no_mfg_aprv_flg", MCColumnType.CHECK);
		p.columnDtl_itm_lower_yield = p.beansFactory.createTableColumn("Dtl.itm_lower_yield", MCColumnType.NUMBER);
		p.columnDtl_itm_std_yield = p.beansFactory.createTableColumn("Dtl.itm_std_yield", MCColumnType.NUMBER);
		p.columnDtl_itm_upper_yield = p.beansFactory.createTableColumn("Dtl.itm_upper_yield", MCColumnType.NUMBER);
		p.columnDtl_purc_id_typ = p.beansFactory.createTableColumn("Dtl.purc_id_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_purc_id_typ_nm = p.beansFactory.createTableColumn("Dtl.purc_id_typ_nm", MCColumnType.TEXT);
		p.columnDtl_rqst_wg_cd = p.beansFactory.createTableColumn("Dtl.rqst_wg_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_rqst_wg_nm = p.beansFactory.createTableColumn("Dtl.rqst_wg_nm", MCColumnType.TEXT);
		p.columnDtl_po_batch_flg = p.beansFactory.createTableColumn("Dtl.po_batch_flg", MCColumnType.CHECK);
		p.columnDtl_rsrc_cd1 = p.beansFactory.createTableColumn("Dtl.rsrc_cd1", MCColumnType.TEXT_COMBO_FREE);
		p.columnDtl_rsrc_nm1 = p.beansFactory.createTableColumn("Dtl.rsrc_nm1", MCColumnType.TEXT);
		p.columnDtl_rsrc_unit_nm1 = p.beansFactory.createTableColumn("Dtl.rsrc_unit_nm1", MCColumnType.TEXT);
		p.columnDtl_rsrc_std_qty1 = p.beansFactory.createTableColumn("Dtl.rsrc_std_qty1", MCColumnType.NUMBER);
		p.columnDtl_rsrc_cd2 = p.beansFactory.createTableColumn("Dtl.rsrc_cd2", MCColumnType.TEXT_COMBO_FREE);
		p.columnDtl_rsrc_nm2 = p.beansFactory.createTableColumn("Dtl.rsrc_nm2", MCColumnType.TEXT);
		p.columnDtl_rsrc_unit_nm2 = p.beansFactory.createTableColumn("Dtl.rsrc_unit_nm2", MCColumnType.TEXT);
		p.columnDtl_rsrc_std_qty2 = p.beansFactory.createTableColumn("Dtl.rsrc_std_qty2", MCColumnType.NUMBER);
		p.columnDtl_not_mrp_flg = p.beansFactory.createTableColumn("Dtl.not_mrp_flg", MCColumnType.CHECK);
		p.columnDtl_cost_ratio = p.beansFactory.createTableColumn("Dtl.cost_ratio", MCColumnType.NUMBER);
		p.columnDtl_memo1 = p.beansFactory.createTableColumn("Dtl.memo1", MCColumnType.TEXT);
		p.columnDtl_memo2 = p.beansFactory.createTableColumn("Dtl.memo2", MCColumnType.TEXT);
		p.columnDtl_memo3 = p.beansFactory.createTableColumn("Dtl.memo3", MCColumnType.TEXT);
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
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABSP_ItmDtlReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_open_MABSP1100 = p.beansFactory.createButton("DtlBtn.open_MABSP1100", "open");
		p.DtlBtn_open_MABSP1110 = p.beansFactory.createButton("DtlBtn.open_MABSP1110", "open");
		p.DtlBtn_open_MABSP1130 = p.beansFactory.createButton("DtlBtn.open_MABSP1130", "open");
		p.DtlBtn_correct_dup_dt = p.beansFactory.createButton("DtlBtn.correct_dup_dt");
		p.DtlBtn_select_all = p.beansFactory.createButton("DtlBtn.select_all", "no_border");
		p.DtlBtn_deselect_all = p.beansFactory.createButton("DtlBtn.deselect_all", "no_border");
		p.DtlBtn_radd = p.beansFactory.createButton("DtlBtn.radd", "no_border");
		p.DtlBtn_rdel = p.beansFactory.createButton("DtlBtn.rdel", "no_border");
		p.DtlBtn_rcopy = p.beansFactory.createButton("DtlBtn.rcopy", "no_border");
		p.DtlBtn_upd_cmn = p.beansFactory.createButton("DtlBtn.upd_cmn", "upd");
		p.DtlBtn_upd_wg = p.beansFactory.createButton("DtlBtn.upd_wg", "upd");
		p.DtlBtn_del_cmn = p.beansFactory.createButton("DtlBtn.del_cmn", "del");
		p.DtlBtn_del_wg = p.beansFactory.createButton("DtlBtn.del_wg", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABSP_ItmDtlReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABSP_ItmDtlReg p) {
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
	protected static void jbInitRegTarget(MABSP_ItmDtlReg p) {
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
	protected static void jbInitTop(MABSP_ItmDtlReg p) {
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
	protected static void jbInitFold(MABSP_ItmDtlReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndTabPanel, null);
		p.FoldPanel.setLastBeans(p.CndTabPanel);
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCndTab(MABSP_ItmDtlReg p) {
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
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABSP_ItmDtlReg p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.ope_META);
		p.RegTargetPanel.add(p.Cnd_cmn_flg);
		p.RegTargetPanel.setLastBeans(p.Cnd_cmn_flg);
		p.Cnd_cmn_flg.setNextBeans(p.Cnd_wg_flg);
		p.Cnd_cmn_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.cmn_flg_META);
		p.RegTargetPanel.add(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.wg_flg_META);
		p.Tab1Panel.add(p.Cnd_dt_PPanel);
		p.Tab1Panel.setLastBeans(p.Cnd_dt_PPanel);
		p.Cnd_dt_PPanel.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.Tab1Panel.add(p.Cnd_wg_cd_Label);
		p.Tab1Panel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.wg_cd_META);
		p.Tab1Panel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Tab1Panel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Tab1Panel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_site_cd);
		p.Cnd_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_site_cd, true);
		p.Cnd_site_cd.setLinkBeans(p.Cnd_site_nm);
		p.Tab1Panel.add(p.Cnd_site_cd_Label);
		p.Tab1Panel.add(p.Cnd_site_cd);
		p.Cnd_site_cd.setNextBeans(p.Cnd_site_nm);
		p.Cnd_site_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.site_cd_META);
		p.Tab1Panel.add(p.Cnd_site_nm);
		p.Cnd_site_nm.setNextBeans(p.Cnd_mfg_loc_cd);
		p.Cnd_site_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.site_nm_META);
		p.setPluralValueEnable(p.Cnd_site_nm, true);
		p.Tab1Panel.add(p.Cnd_mfg_loc_cd_Label);
		p.Tab1Panel.add(p.Cnd_mfg_loc_cd);
		p.Cnd_mfg_loc_cd.setNextBeans(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.mfg_loc_cd_META);
		p.Cnd_mfg_loc_cd.addLinkBeans(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_loc_cd, true);
		p.Tab1Panel.add(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_nm.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_mfg_loc_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.mfg_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_mfg_loc_nm, true);
		p.Tab1Panel.add(p.Cnd_sppl_cd_Label);
		p.Tab1Panel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.Tab1Panel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_maker_cd);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
		p.Tab1Panel.add(p.Cnd_maker_cd_Label);
		p.Tab1Panel.add(p.Cnd_maker_cd);
		p.Cnd_maker_cd.setNextBeans(p.Cnd_maker_nm);
		p.Cnd_maker_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.maker_cd_META);
		p.Cnd_maker_cd.addLinkBeans(p.Cnd_maker_nm);
		p.Cnd_maker_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_maker_cd, true);
		p.Tab1Panel.add(p.Cnd_maker_nm);
		p.Cnd_maker_nm.setNextBeans(p.Cnd_rqst_loc_cd);
		p.Cnd_maker_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.maker_nm_META);
		p.setPluralValueEnable(p.Cnd_maker_nm, true);
		p.Tab1Panel.add(p.Cnd_rqst_loc_cd_Label);
		p.Tab1Panel.add(p.Cnd_rqst_loc_cd);
		p.Cnd_rqst_loc_cd.setNextBeans(p.Cnd_rqst_loc_nm);
		p.Cnd_rqst_loc_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.rqst_loc_cd_META);
		p.Cnd_rqst_loc_cd.addLinkBeans(p.Cnd_rqst_loc_nm);
		p.Cnd_rqst_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_loc_cd, true);
		p.Tab1Panel.add(p.Cnd_rqst_loc_nm);
		p.Cnd_rqst_loc_nm.setNextBeans(p.Cnd_rqst_loc_wg_cd);
		p.Cnd_rqst_loc_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.rqst_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_loc_nm, true);
		p.Cnd_rqst_loc_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_loc_wg_cd, true);
		p.Cnd_rqst_loc_wg_cd.setLinkBeans(p.Cnd_rqst_loc_wg_nm);
		p.Tab1Panel.add(p.Cnd_rqst_loc_wg_cd_Label);
		p.Tab1Panel.add(p.Cnd_rqst_loc_wg_cd);
		p.Cnd_rqst_loc_wg_cd.setNextBeans(p.Cnd_rqst_loc_wg_nm);
		p.Cnd_rqst_loc_wg_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.rqst_loc_wg_cd_META);
		p.Tab1Panel.add(p.Cnd_rqst_loc_wg_nm);
		p.Cnd_rqst_loc_wg_nm.setNextBeans(p.Cnd_bom_ptn);
		p.Cnd_rqst_loc_wg_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.rqst_loc_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_loc_wg_nm, true);
		p.Tab1Panel.add(p.Cnd_bom_ptn_Label);
		p.Tab1Panel.add(p.Cnd_bom_ptn);
		p.Cnd_bom_ptn.setNextBeans(p.Cnd_memo1);
		p.Cnd_bom_ptn.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.bom_ptn_META);
		p.setPluralValueEnable(p.Cnd_bom_ptn, true);
		p.Tab1Panel.add(p.Cnd_memo1_Label);
		p.Tab1Panel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.Tab1Panel.add(p.Cnd_memo2_Label);
		p.Tab1Panel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.Tab1Panel.add(p.Cnd_memo3_Label);
		p.Tab1Panel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.Tab1Panel.add(p.Cnd_del_flg_lab);
		p.Tab1Panel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.off_del_flg_META);
		p.Tab1Panel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.on_del_flg_META);
		p.Cnd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd1, true);
		p.Cnd_itm_grp_cd1.setLinkBeans(p.Cnd_itm_grp_nm1);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd1_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd1);
		p.Tab2Panel.setLastBeans(p.Cnd_itm_grp_cd1);
		p.Cnd_itm_grp_cd1.setNextBeans(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.itm_grp_cd1_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_nm1.setNextBeans(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm1, true);
		p.Cnd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd2, true);
		p.Cnd_itm_grp_cd2.setLinkBeans(p.Cnd_itm_grp_nm2);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd2_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_cd2.setNextBeans(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.itm_grp_cd2_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_nm2.setNextBeans(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm2, true);
		p.Cnd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd3, true);
		p.Cnd_itm_grp_cd3.setLinkBeans(p.Cnd_itm_grp_nm3);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd3_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_cd3.setNextBeans(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.itm_grp_cd3_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_nm3.setNextBeans(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm3, true);
		p.Cnd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd4, true);
		p.Cnd_itm_grp_cd4.setLinkBeans(p.Cnd_itm_grp_nm4);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd4_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_cd4.setNextBeans(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.itm_grp_cd4_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_nm4.setNextBeans(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm4, true);
		p.Cnd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd5, true);
		p.Cnd_itm_grp_cd5.setLinkBeans(p.Cnd_itm_grp_nm5);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd5_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_cd5.setNextBeans(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.itm_grp_cd5_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_nm5.setNextBeans(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm5, true);
		p.Cnd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd6, true);
		p.Cnd_itm_grp_cd6.setLinkBeans(p.Cnd_itm_grp_nm6);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd6_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_cd6.setNextBeans(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.itm_grp_cd6_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_nm6.setNextBeans(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm6, true);
		p.Cnd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd7, true);
		p.Cnd_itm_grp_cd7.setLinkBeans(p.Cnd_itm_grp_nm7);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd7_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_cd7.setNextBeans(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.itm_grp_cd7_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_nm7.setNextBeans(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm7, true);
		p.Cnd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd8, true);
		p.Cnd_itm_grp_cd8.setLinkBeans(p.Cnd_itm_grp_nm8);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd8_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_cd8.setNextBeans(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.itm_grp_cd8_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_nm8.setNextBeans(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm8, true);
		p.Cnd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd9, true);
		p.Cnd_itm_grp_cd9.setLinkBeans(p.Cnd_itm_grp_nm9);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd9_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_cd9.setNextBeans(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.itm_grp_cd9_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_nm9.setNextBeans(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm9, true);
		p.Cnd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd10, true);
		p.Cnd_itm_grp_cd10.setLinkBeans(p.Cnd_itm_grp_nm10);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd10_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_cd10.setNextBeans(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.itm_grp_cd10_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0010.CndR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm10, true);
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MABSP_ItmDtlReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MABSP_ItmDtlReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABSP_ItmDtlReg p) {
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
	protected static void jbInitRPnl(MABSP_ItmDtlReg p) {
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
	protected static void jbInitBulkSet(MABSP_ItmDtlReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.DtlPanel);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_st_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_st_dt);
		p.BulkSetPanel.setLastBeans(p.BulkSet_st_dt);
		p.BulkSet_st_dt.setNextBeans(p.BulkSet_end_dt);
		p.BulkSet_st_dt.setRow(p.getBulkSetR(), mcframe.clientMABS.MABSP0010.BulkSetR.st_dt_META);
		p.BulkSet_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_end_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_end_dt);
		p.BulkSet_end_dt.setNextBeans(p.BulkSet_set_dt);
		p.BulkSet_end_dt.setRow(p.getBulkSetR(), mcframe.clientMABS.MABSP0010.BulkSetR.end_dt_META);
		p.BulkSet_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSet_set_dt.setFunctionKey(MCFunctionKey.F7);
		p.BulkSetPanel.add(p.BulkSet_set_dt);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABSP_ItmDtlReg p) {
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
	protected static void jbInitDtlBtn(MABSP_ItmDtlReg p) {
		// ブロック関連の初期化
		p.add(p.DtlBtnPanel);
		p.DtlBtnPanel.setNextBeans(p.EastBtnPanel);
		p.DtlBtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.DtlBtn_open_MABSP1100.setFunctionKey(MCFunctionKey.F3);
		p.DtlBtnPanel.add(p.DtlBtn_open_MABSP1100);
		p.DtlBtnPanel.setLastBeans(p.DtlBtn_open_MABSP1100);
		p.DtlBtn_open_MABSP1100.setNextBeans(p.DtlBtn_open_MABSP1110);
		p.DtlBtn_open_MABSP1110.setFunctionKey(MCFunctionKey.F4);
		p.DtlBtnPanel.add(p.DtlBtn_open_MABSP1110);
		p.DtlBtn_open_MABSP1110.setNextBeans(p.DtlBtn_open_MABSP1130);
		p.DtlBtn_open_MABSP1130.setFunctionKey(MCFunctionKey.F15);
		p.DtlBtnPanel.add(p.DtlBtn_open_MABSP1130);
		p.DtlBtn_open_MABSP1130.setNextBeans(p.DtlBtn_correct_dup_dt);
		p.DtlBtn_correct_dup_dt.setFunctionKey(MCFunctionKey.F8);
		p.DtlBtnPanel.add(p.DtlBtn_correct_dup_dt);
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
		p.DtlBtn_del_cmn.setIcon("DELETE");
		p.DtlBtn_del_cmn.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.DtlBtn_del_cmn);
		p.EastBtnPanel.add(p.DtlBtn_del_cmn);
		p.DtlBtn_del_cmn.setNextBeans(p.DtlBtn_del_wg);
		p.DtlBtn_del_wg.setIcon("DELETE");
		p.DtlBtn_del_wg.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.DtlBtn_del_wg);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABSP_ItmDtlReg p) {
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
		MABSP_ItmDtlReg_MC.mcInitScreenOpe((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.mcInitRegTarget((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.mcInitTop((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.mcInitFold((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.mcInitCndTab((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.mcInitCnd((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.mcInitTab1((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.mcInitTab2((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.mcInitCtrl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.mcInitRPnl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.mcInitBulkSet((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.mcInitDtl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.mcInitDtlBtn((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.mcInitEastBtn((MABSP_ItmDtlReg)this);

		// [UPD]ステータスのモードの設定
		MABSP_ItmDtlReg_MC.statusInitUPD_ScreenOpe((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitUPD_RegTarget((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitUPD_Top((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitUPD_Fold((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitUPD_CndTab((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitUPD_Cnd((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitUPD_Tab1((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitUPD_Tab2((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitUPD_Ctrl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitUPD_RPnl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitUPD_BulkSet((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitUPD_Dtl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitUPD_DtlBtn((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitUPD_EastBtn((MABSP_ItmDtlReg)this);

		// [FIX]ステータスのモードの設定
		MABSP_ItmDtlReg_MC.statusInitFIX_ScreenOpe((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitFIX_RegTarget((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitFIX_Top((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitFIX_Fold((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitFIX_CndTab((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitFIX_Cnd((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitFIX_Tab1((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitFIX_Tab2((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitFIX_Ctrl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitFIX_RPnl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitFIX_BulkSet((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitFIX_Dtl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitFIX_DtlBtn((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitFIX_EastBtn((MABSP_ItmDtlReg)this);

		// [DEL]ステータスのモードの設定
		MABSP_ItmDtlReg_MC.statusInitDEL_ScreenOpe((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitDEL_RegTarget((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitDEL_Top((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitDEL_Fold((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitDEL_CndTab((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitDEL_Cnd((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitDEL_Tab1((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitDEL_Tab2((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitDEL_Ctrl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitDEL_RPnl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitDEL_BulkSet((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitDEL_Dtl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitDEL_DtlBtn((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitDEL_EastBtn((MABSP_ItmDtlReg)this);

		// [REF]ステータスのモードの設定
		MABSP_ItmDtlReg_MC.statusInitREF_ScreenOpe((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitREF_RegTarget((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitREF_Top((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitREF_Fold((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitREF_CndTab((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitREF_Cnd((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitREF_Tab1((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitREF_Tab2((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitREF_Ctrl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitREF_RPnl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitREF_BulkSet((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitREF_Dtl((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitREF_DtlBtn((MABSP_ItmDtlReg)this);
		MABSP_ItmDtlReg_MC.statusInitREF_EastBtn((MABSP_ItmDtlReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABSP_ItmDtlReg p) {
	}

	/**
	 *  [RegTarget]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRegTarget(MABSP_ItmDtlReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABSP_ItmDtlReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABSP_ItmDtlReg p) {
	}

	/**
	 *  [CndTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCndTab(MABSP_ItmDtlReg p) {
		p.CndTabTab.addAllListener(p);
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABSP_ItmDtlReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_cmn_flg.addAllListener(p);
		p.Cnd_wg_flg.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_site_cd.setListListener(p);
		p.Cnd_site_cd.addAllListener(p);
		p.Cnd_site_nm.setListListener(p);
		p.Cnd_site_nm.addAllListener(p);
		p.Cnd_mfg_loc_cd.setListListener(p);
		p.Cnd_mfg_loc_cd.addAllListener(p);
		p.Cnd_mfg_loc_nm.setListListener(p);
		p.Cnd_mfg_loc_nm.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_maker_cd.setListListener(p);
		p.Cnd_maker_cd.addAllListener(p);
		p.Cnd_maker_nm.setListListener(p);
		p.Cnd_maker_nm.addAllListener(p);
		p.Cnd_rqst_loc_cd.setListListener(p);
		p.Cnd_rqst_loc_cd.addAllListener(p);
		p.Cnd_rqst_loc_nm.setListListener(p);
		p.Cnd_rqst_loc_nm.addAllListener(p);
		p.Cnd_rqst_loc_wg_cd.setListListener(p);
		p.Cnd_rqst_loc_wg_cd.addAllListener(p);
		p.Cnd_rqst_loc_wg_nm.setListListener(p);
		p.Cnd_rqst_loc_wg_nm.addAllListener(p);
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
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MABSP_ItmDtlReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MABSP_ItmDtlReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABSP_ItmDtlReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MABSP_ItmDtlReg p) {
		p.RPnl_srch_cmn.addAllListener(p);
		p.RPnl_srch_cmn.setAPMethodName("doRPnl_srch_cmn");
		p.RPnl_srch_wg.addAllListener(p);
		p.RPnl_srch_wg.setAPMethodName("doRPnl_srch_wg");
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MABSP_ItmDtlReg p) {
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
	protected static void mcInitDtl(MABSP_ItmDtlReg p) {
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
		p.columnDtl_stk_mng_typ.addAllListener(p);
		p.columnDtl_stk_mng_typ.setListListener(p);
		p.columnDtl_asset_mng_typ.addAllListener(p);
		p.columnDtl_asset_mng_typ.setListListener(p);
		p.columnDtl_unit_cd.addAllListener(p);
		p.columnDtl_unit_cd.setListListener(p);
		p.columnDtl_dec_place.addAllListener(p);
		p.columnDtl_dec_place.setListListener(p);
		p.columnDtl_sno1_mng_typ.addAllListener(p);
		p.columnDtl_sno1_mng_typ.setListListener(p);
		p.columnDtl_sno2_mng_typ.addAllListener(p);
		p.columnDtl_sno2_mng_typ.setListListener(p);
		p.columnDtl_sno3_mng_typ.addAllListener(p);
		p.columnDtl_sno3_mng_typ.setListListener(p);
		p.columnDtl_sno4_mng_typ.addAllListener(p);
		p.columnDtl_sno4_mng_typ.setListListener(p);
		p.columnDtl_def_bom_ptn.addAllListener(p);
		p.columnDtl_def_bom_ptn.setListListener(p);
		p.columnDtl_lot_mng_typ.addAllListener(p);
		p.columnDtl_lot_mng_typ.setListListener(p);
		p.columnDtl_itm_typ.addAllListener(p);
		p.columnDtl_itm_typ.setListListener(p);
		p.columnDtl_itm_typ_nm.addAllListener(p);
		p.columnDtl_itm_typ_nm.setListListener(p);
		p.columnDtl_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_itm_typ_d_cd.setListListener(p);
		p.columnDtl_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_itm_typ_d_nm.setListListener(p);
		p.columnDtl_mfg_loc_cd.addAllListener(p);
		p.columnDtl_mfg_loc_cd.setListListener(p);
		p.columnDtl_mfg_loc_nm.addAllListener(p);
		p.columnDtl_mfg_loc_nm.setListListener(p);
		p.columnDtl_site_cd.addAllListener(p);
		p.columnDtl_site_cd.setListListener(p);
		p.columnDtl_site_nm.addAllListener(p);
		p.columnDtl_site_nm.setListListener(p);
		p.columnDtl_sppl_cd.addAllListener(p);
		p.columnDtl_sppl_cd.setListListener(p);
		p.columnDtl_sppl_nm.addAllListener(p);
		p.columnDtl_sppl_nm.setListListener(p);
		p.columnDtl_maker_cd.addAllListener(p);
		p.columnDtl_maker_cd.setListListener(p);
		p.columnDtl_maker_nm.addAllListener(p);
		p.columnDtl_maker_nm.setListListener(p);
		p.columnDtl_rqst_loc_cd.addAllListener(p);
		p.columnDtl_rqst_loc_cd.setListListener(p);
		p.columnDtl_rqst_loc_nm.addAllListener(p);
		p.columnDtl_rqst_loc_nm.setListListener(p);
		p.columnDtl_rqst_loc_wg_cd.addAllListener(p);
		p.columnDtl_rqst_loc_wg_cd.setListListener(p);
		p.columnDtl_rqst_loc_wg_nm.addAllListener(p);
		p.columnDtl_rqst_loc_wg_nm.setListListener(p);
		p.columnDtl_loc_sppl_cd.addAllListener(p);
		p.columnDtl_loc_sppl_cd.setListListener(p);
		p.columnDtl_bom_ptn.addAllListener(p);
		p.columnDtl_bom_ptn.setListListener(p);
		p.columnDtl_oper_ptn.addAllListener(p);
		p.columnDtl_oper_ptn.setListListener(p);
		p.columnDtl_mfg_lt.addAllListener(p);
		p.columnDtl_mfg_lt.setListListener(p);
		p.columnDtl_purc_lt.addAllListener(p);
		p.columnDtl_purc_lt.setListListener(p);
		p.columnDtl_purc_basis_typ.addAllListener(p);
		p.columnDtl_purc_basis_typ.setListListener(p);
		p.columnDtl_purc_basis_typ_nm.addAllListener(p);
		p.columnDtl_purc_basis_typ_nm.setListListener(p);
		p.columnDtl_accpt_insp_lt.addAllListener(p);
		p.columnDtl_accpt_insp_lt.setListListener(p);
		p.columnDtl_buf_lt.addAllListener(p);
		p.columnDtl_buf_lt.setListListener(p);
		p.columnDtl_ord_fix_pd.addAllListener(p);
		p.columnDtl_ord_fix_pd.setListListener(p);
		p.columnDtl_sz_day_week_typ.addAllListener(p);
		p.columnDtl_sz_day_week_typ.setListListener(p);
		p.columnDtl_sz_day_week_typ_nm.addAllListener(p);
		p.columnDtl_sz_day_week_typ_nm.setListListener(p);
		p.columnDtl_sz_week.addAllListener(p);
		p.columnDtl_sz_week.setListListener(p);
		p.columnDtl_lot_sz_pd.addAllListener(p);
		p.columnDtl_lot_sz_pd.setListListener(p);
		p.columnDtl_base_unit_cd.addAllListener(p);
		p.columnDtl_base_unit_cd.setListListener(p);
		p.columnDtl_base_unit_nm.addAllListener(p);
		p.columnDtl_base_unit_nm.setListListener(p);
		p.columnDtl_max_order.addAllListener(p);
		p.columnDtl_max_order.setListListener(p);
		p.columnDtl_prio.addAllListener(p);
		p.columnDtl_prio.setListListener(p);
		p.columnDtl_order_ratio.addAllListener(p);
		p.columnDtl_order_ratio.setListListener(p);
		p.columnDtl_lot_issue_typ.addAllListener(p);
		p.columnDtl_lot_issue_typ.setListListener(p);
		p.columnDtl_lot_issue_typ_nm.addAllListener(p);
		p.columnDtl_lot_issue_typ_nm.setListListener(p);
		p.columnDtl_bkf_flg.addAllListener(p);
		p.columnDtl_ln_stk_flg.addAllListener(p);
		p.columnDtl_pre_po_tgt_flg.addAllListener(p);
		p.columnDtl_inst_rec_issue_flg.addAllListener(p);
		p.columnDtl_no_mfg_aprv_flg.addAllListener(p);
		p.columnDtl_itm_lower_yield.addAllListener(p);
		p.columnDtl_itm_lower_yield.setListListener(p);
		p.columnDtl_itm_std_yield.addAllListener(p);
		p.columnDtl_itm_std_yield.setListListener(p);
		p.columnDtl_itm_upper_yield.addAllListener(p);
		p.columnDtl_itm_upper_yield.setListListener(p);
		p.columnDtl_purc_id_typ.addAllListener(p);
		p.columnDtl_purc_id_typ.setListListener(p);
		p.columnDtl_purc_id_typ_nm.addAllListener(p);
		p.columnDtl_purc_id_typ_nm.setListListener(p);
		p.columnDtl_rqst_wg_cd.addAllListener(p);
		p.columnDtl_rqst_wg_cd.setListListener(p);
		p.columnDtl_rqst_wg_nm.addAllListener(p);
		p.columnDtl_rqst_wg_nm.setListListener(p);
		p.columnDtl_po_batch_flg.addAllListener(p);
		p.columnDtl_rsrc_cd1.addAllListener(p);
		p.columnDtl_rsrc_cd1.setListListener(p);
		p.columnDtl_rsrc_nm1.addAllListener(p);
		p.columnDtl_rsrc_nm1.setListListener(p);
		p.columnDtl_rsrc_unit_nm1.addAllListener(p);
		p.columnDtl_rsrc_unit_nm1.setListListener(p);
		p.columnDtl_rsrc_std_qty1.addAllListener(p);
		p.columnDtl_rsrc_std_qty1.setListListener(p);
		p.columnDtl_rsrc_cd2.addAllListener(p);
		p.columnDtl_rsrc_cd2.setListListener(p);
		p.columnDtl_rsrc_nm2.addAllListener(p);
		p.columnDtl_rsrc_nm2.setListListener(p);
		p.columnDtl_rsrc_unit_nm2.addAllListener(p);
		p.columnDtl_rsrc_unit_nm2.setListListener(p);
		p.columnDtl_rsrc_std_qty2.addAllListener(p);
		p.columnDtl_rsrc_std_qty2.setListListener(p);
		p.columnDtl_not_mrp_flg.addAllListener(p);
		p.columnDtl_cost_ratio.addAllListener(p);
		p.columnDtl_cost_ratio.setListListener(p);
		p.columnDtl_memo1.addAllListener(p);
		p.columnDtl_memo1.setListListener(p);
		p.columnDtl_memo2.addAllListener(p);
		p.columnDtl_memo2.setListListener(p);
		p.columnDtl_memo3.addAllListener(p);
		p.columnDtl_memo3.setListListener(p);
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
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABSP_ItmDtlReg p) {
		p.DtlBtn_open_MABSP1100.addAllListener(p);
		p.DtlBtn_open_MABSP1100.setAPMethodName("doDtlBtn_open_MABSP1100");
		p.DtlBtn_open_MABSP1110.addAllListener(p);
		p.DtlBtn_open_MABSP1110.setAPMethodName("doDtlBtn_open_MABSP1110");
		p.DtlBtn_open_MABSP1130.addAllListener(p);
		p.DtlBtn_open_MABSP1130.setAPMethodName("doDtlBtn_open_MABSP1130");
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
		p.DtlBtn_del_cmn.addAllListener(p);
		p.DtlBtn_del_cmn.setAPMethodName("doDtlBtn_del_cmn");
		p.DtlBtn_del_wg.addAllListener(p);
		p.DtlBtn_del_wg.setAPMethodName("doDtlBtn_del_wg");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABSP_ItmDtlReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABSP_ItmDtlReg p){

	}

	/**
	 * [UPD]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RegTarget(MABSP_ItmDtlReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABSP_ItmDtlReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABSP_ItmDtlReg p){

	}

	/**
	 * [UPD]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CndTab(MABSP_ItmDtlReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABSP_ItmDtlReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_dt_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_site_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_loc_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rqst_loc_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bom_ptn.putMode(p, UPD, MCMode.ENABLE);
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

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MABSP_ItmDtlReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MABSP_ItmDtlReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABSP_ItmDtlReg p){

	}

	/**
	 * [UPD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RPnl(MABSP_ItmDtlReg p){
		p.RPnl_srch_cmn.putMode(p, UPD, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MABSP_ItmDtlReg p){
		p.BulkSet_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_set_dt.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABSP_ItmDtlReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_wg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_stk_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_unit_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_def_bom_ptn.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_mfg_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_maker_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_maker_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rqst_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_rqst_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rqst_loc_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rqst_loc_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_loc_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnDtl_oper_ptn.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_mfg_lt.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_mfg_lt_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnDtl_purc_lt.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_purc_lt_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnDtl_purc_basis_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_purc_basis_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_accpt_insp_lt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_buf_lt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ord_fix_pd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sz_day_week_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sz_day_week_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sz_week.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_lot_sz_pd.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_min_lot_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Dtl_batch_lot_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Dtl_max_lot_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_max_order.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_prio.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_order_ratio.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_yield_schd_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Dtl_mfg_inst_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Dtl_fxd_rqmt_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnDtl_lot_issue_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_lot_issue_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bkf_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ln_stk_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_pre_po_tgt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_inst_rec_issue_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_no_mfg_aprv_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_itm_lower_yield.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itm_std_yield.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itm_upper_yield.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_purc_id_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_purc_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rqst_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_rqst_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_po_batch_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_rsrc_cd1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rsrc_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rsrc_unit_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rsrc_std_qty1.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_qty1_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnDtl_rsrc_cd2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rsrc_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rsrc_unit_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rsrc_std_qty2.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_qty2_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.Dtl_sno_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.ENABLE);
		p.columnDtl_not_mrp_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_cost_ratio.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD, MCMode.ENABLE);
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
	 * [UPD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtn(MABSP_ItmDtlReg p){
		p.DtlBtn_open_MABSP1100.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1110.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1130.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_correct_dup_dt.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_upd_cmn.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_upd_wg.putMode(p, UPD, MCMode.ENABLE);
		p.DtlBtn_del_cmn.putMode(p, UPD, MCMode.DISABLE);
		p.DtlBtn_del_wg.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABSP_ItmDtlReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABSP_ItmDtlReg p){

	}

	/**
	 * [FIX]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitFIX_RegTarget(MABSP_ItmDtlReg p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABSP_ItmDtlReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABSP_ItmDtlReg p){

	}

	/**
	 * [FIX]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_CndTab(MABSP_ItmDtlReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABSP_ItmDtlReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_dt_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_site_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_rqst_loc_wg_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_rqst_loc_wg_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bom_ptn.putMode(p, FIX, MCMode.ENABLE);
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

	}

	/**
	 * [FIX]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab1(MABSP_ItmDtlReg p){

	}

	/**
	 * [FIX]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab2(MABSP_ItmDtlReg p){

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABSP_ItmDtlReg p){

	}

	/**
	 * [FIX]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_RPnl(MABSP_ItmDtlReg p){
		p.RPnl_srch_cmn.putMode(p, FIX, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BulkSet(MABSP_ItmDtlReg p){
		p.BulkSet_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABSP_ItmDtlReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_unit_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_def_bom_ptn.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_itm_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_maker_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rqst_loc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rqst_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rqst_loc_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rqst_loc_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_loc_sppl_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_oper_ptn.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_mfg_lt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_mfg_lt_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_purc_lt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_purc_lt_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_purc_basis_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_basis_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_accpt_insp_lt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_buf_lt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ord_fix_pd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sz_day_week_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sz_day_week_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sz_week.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lot_sz_pd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_min_lot_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_batch_lot_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_max_lot_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_max_order.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_prio.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_order_ratio.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_yield_schd_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_mfg_inst_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_fxd_rqmt_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_lot_issue_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lot_issue_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bkf_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ln_stk_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_pre_po_tgt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_inst_rec_issue_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_no_mfg_aprv_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_lower_yield.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_std_yield.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_upper_yield.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_id_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_id_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rqst_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rqst_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_po_batch_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rsrc_cd1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rsrc_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rsrc_unit_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rsrc_std_qty1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_qty1_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_rsrc_cd2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rsrc_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rsrc_unit_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rsrc_std_qty2.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_qty2_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnDtl_not_mrp_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cost_ratio.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
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
	 * [FIX]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlBtn(MABSP_ItmDtlReg p){
		p.DtlBtn_open_MABSP1100.putMode(p, FIX, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1110.putMode(p, FIX, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1130.putMode(p, FIX, MCMode.ENABLE);
		p.DtlBtn_correct_dup_dt.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_upd_cmn.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_upd_wg.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_del_cmn.putMode(p, FIX, MCMode.DISABLE);
		p.DtlBtn_del_wg.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABSP_ItmDtlReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABSP_ItmDtlReg p){

	}

	/**
	 * [DEL]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RegTarget(MABSP_ItmDtlReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABSP_ItmDtlReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABSP_ItmDtlReg p){

	}

	/**
	 * [DEL]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_CndTab(MABSP_ItmDtlReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABSP_ItmDtlReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_dt_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_site_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_loc_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rqst_loc_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bom_ptn.putMode(p, DEL, MCMode.ENABLE);
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

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MABSP_ItmDtlReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MABSP_ItmDtlReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABSP_ItmDtlReg p){

	}

	/**
	 * [DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RPnl(MABSP_ItmDtlReg p){
		p.RPnl_srch_cmn.putMode(p, DEL, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MABSP_ItmDtlReg p){
		p.BulkSet_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABSP_ItmDtlReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_unit_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_def_bom_ptn.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_maker_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rqst_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rqst_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rqst_loc_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rqst_loc_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_oper_ptn.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_mfg_lt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_mfg_lt_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_purc_lt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_purc_lt_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_purc_basis_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_basis_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_accpt_insp_lt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_buf_lt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ord_fix_pd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sz_day_week_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sz_day_week_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sz_week.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lot_sz_pd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_min_lot_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_batch_lot_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_max_lot_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_max_order.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prio.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_order_ratio.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_yield_schd_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_mfg_inst_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_fxd_rqmt_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_lot_issue_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lot_issue_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bkf_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ln_stk_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pre_po_tgt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inst_rec_issue_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_no_mfg_aprv_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_lower_yield.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_std_yield.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_upper_yield.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rqst_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rqst_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_po_batch_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rsrc_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rsrc_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rsrc_unit_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rsrc_std_qty1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_qty1_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_rsrc_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rsrc_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rsrc_unit_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rsrc_std_qty2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_qty2_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnDtl_not_mrp_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cost_ratio.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
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
	 * [DEL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtn(MABSP_ItmDtlReg p){
		p.DtlBtn_open_MABSP1100.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1110.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1130.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_correct_dup_dt.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_upd_cmn.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_upd_wg.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_del_cmn.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_del_wg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABSP_ItmDtlReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABSP_ItmDtlReg p){

	}

	/**
	 * [REF]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitREF_RegTarget(MABSP_ItmDtlReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABSP_ItmDtlReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABSP_ItmDtlReg p){

	}

	/**
	 * [REF]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_CndTab(MABSP_ItmDtlReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABSP_ItmDtlReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_dt_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_loc_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_loc_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bom_ptn.putMode(p, REF, MCMode.ENABLE);
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

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MABSP_ItmDtlReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MABSP_ItmDtlReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABSP_ItmDtlReg p){

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MABSP_ItmDtlReg p){
		p.RPnl_srch_cmn.putMode(p, REF, MCMode.INVISIBLE);
		p.RPnl_srch_wg.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MABSP_ItmDtlReg p){
		p.BulkSet_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABSP_ItmDtlReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_asset_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_unit_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_def_bom_ptn.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_loc_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_loc_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_oper_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mfg_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_mfg_lt_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_purc_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_purc_lt_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_purc_basis_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_basis_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_accpt_insp_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_buf_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ord_fix_pd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sz_day_week_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sz_day_week_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sz_week.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_sz_pd.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_min_lot_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_batch_lot_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_max_lot_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_max_order.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_order_ratio.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_yield_schd_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_mfg_inst_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_fxd_rqmt_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_lot_issue_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_issue_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bkf_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ln_stk_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pre_po_tgt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inst_rec_issue_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_no_mfg_aprv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_lower_yield.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_std_yield.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_upper_yield.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rqst_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_po_batch_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rsrc_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rsrc_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rsrc_unit_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rsrc_std_qty1.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_qty1_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_rsrc_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rsrc_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rsrc_unit_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rsrc_std_qty2.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_qty2_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnDtl_not_mrp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cost_ratio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
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
	 * [REF]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtn(MABSP_ItmDtlReg p){
		p.DtlBtn_open_MABSP1100.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1110.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_open_MABSP1130.putMode(p, REF, MCMode.ENABLE);
		p.DtlBtn_correct_dup_dt.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_upd_cmn.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_upd_wg.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_del_cmn.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_del_wg.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABSP_ItmDtlReg p){

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
		MABSP_ItmDtlReg_MC.setTableConfigDtl((MABSP_ItmDtlReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABSP_ItmDtlReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABS.MABSP0010.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABS.MABSP0010.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMABS.MABSP0010.DtlR.wg_cd_META);
		p.columnDtl_wg_cd.addLinkBeans(p.columnDtl_wg_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_wg_nm.setMeta(mcframe.clientMABS.MABSP0010.DtlR.wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_nm);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_itm_typ, p.columnDtl_itm_typ_nm, p.columnDtl_itm_typ_d_cd, p.columnDtl_itm_typ_d_nm, p.columnDtl_itm_sub1, p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_stk_mng_typ, p.columnDtl_asset_mng_typ, p.columnDtl_unit_cd, p.columnDtl_dec_place, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_def_bom_ptn, p.columnDtl_lot_mng_typ, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_itm_typ, p.columnDtl_itm_typ_nm, p.columnDtl_itm_typ_d_cd, p.columnDtl_itm_typ_d_nm, p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_stk_mng_typ, p.columnDtl_asset_mng_typ, p.columnDtl_unit_cd, p.columnDtl_dec_place, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_def_bom_ptn, p.columnDtl_lot_mng_typ, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_itm_typ, p.columnDtl_itm_typ_nm, p.columnDtl_itm_typ_d_cd, p.columnDtl_itm_typ_d_nm, p.columnDtl_itm_sub3, p.columnDtl_stk_mng_typ, p.columnDtl_asset_mng_typ, p.columnDtl_unit_cd, p.columnDtl_dec_place, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_def_bom_ptn, p.columnDtl_lot_mng_typ, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_itm_typ, p.columnDtl_itm_typ_nm, p.columnDtl_itm_typ_d_cd, p.columnDtl_itm_typ_d_nm, p.columnDtl_stk_mng_typ, p.columnDtl_asset_mng_typ, p.columnDtl_unit_cd, p.columnDtl_dec_place, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_def_bom_ptn, p.columnDtl_lot_mng_typ, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm);
		p.columnDtl_stk_mng_typ.setMeta(mcframe.clientMABS.MABSP0010.DtlR.stk_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_mng_typ);
		p.columnDtl_asset_mng_typ.setMeta(mcframe.clientMABS.MABSP0010.DtlR.asset_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asset_mng_typ);
		p.columnDtl_unit_cd.setMeta(mcframe.clientMABS.MABSP0010.DtlR.unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_unit_cd);
		p.columnDtl_dec_place.setMeta(mcframe.clientMABS.MABSP0010.DtlR.dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dec_place);
		p.columnDtl_sno1_mng_typ.setMeta(mcframe.clientMABS.MABSP0010.DtlR.sno1_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_mng_typ);
		p.columnDtl_sno2_mng_typ.setMeta(mcframe.clientMABS.MABSP0010.DtlR.sno2_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_mng_typ);
		p.columnDtl_sno3_mng_typ.setMeta(mcframe.clientMABS.MABSP0010.DtlR.sno3_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_mng_typ);
		p.columnDtl_sno4_mng_typ.setMeta(mcframe.clientMABS.MABSP0010.DtlR.sno4_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_mng_typ);
		p.columnDtl_def_bom_ptn.setMeta(mcframe.clientMABS.MABSP0010.DtlR.def_bom_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_def_bom_ptn);
		p.columnDtl_lot_mng_typ.setMeta(mcframe.clientMABS.MABSP0010.DtlR.lot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_mng_typ);
		p.columnDtl_itm_typ.setMeta(mcframe.clientMABS.MABSP0010.DtlR.itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ);
		p.columnDtl_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP0010.DtlR.itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_nm);
		p.columnDtl_itm_typ_d_cd.setMeta(mcframe.clientMABS.MABSP0010.DtlR.itm_typ_d_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_cd);
		p.columnDtl_itm_typ_d_nm.setMeta(mcframe.clientMABS.MABSP0010.DtlR.itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_nm);
		p.columnDtl_mfg_loc_cd.setMeta(mcframe.clientMABS.MABSP0010.DtlR.mfg_loc_cd_META);
		p.columnDtl_mfg_loc_cd.setListType(MCListType.STRICT);
		p.columnDtl_mfg_loc_cd.addLinkBeans(p.columnDtl_mfg_loc_nm,p.columnDtl_loc_sppl_cd,p.columnDtl_rsrc_cd1,p.columnDtl_rsrc_cd2,p.columnDtl_site_cd,p.columnDtl_site_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_loc_cd);
		p.columnDtl_mfg_loc_nm.setMeta(mcframe.clientMABS.MABSP0010.DtlR.mfg_loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_loc_nm);
		p.columnDtl_site_cd.setMeta(mcframe.clientMABS.MABSP0010.DtlR.site_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_site_cd);
		p.columnDtl_site_nm.setMeta(mcframe.clientMABS.MABSP0010.DtlR.site_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_site_nm);
		p.columnDtl_sppl_cd.setMeta(mcframe.clientMABS.MABSP0010.DtlR.sppl_cd_META);
		p.columnDtl_sppl_cd.setListType(MCListType.STRICT);
		p.columnDtl_sppl_cd.addLinkBeans(p.columnDtl_sppl_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_cd);
		p.columnDtl_sppl_nm.setMeta(mcframe.clientMABS.MABSP0010.DtlR.sppl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_nm);
		p.columnDtl_maker_cd.setMeta(mcframe.clientMABS.MABSP0010.DtlR.maker_cd_META);
		p.columnDtl_maker_cd.setListType(MCListType.STRICT);
		p.columnDtl_maker_cd.addLinkBeans(p.columnDtl_maker_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_maker_cd);
		p.columnDtl_maker_nm.setMeta(mcframe.clientMABS.MABSP0010.DtlR.maker_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_maker_nm);
		p.columnDtl_rqst_loc_cd.setMeta(mcframe.clientMABS.MABSP0010.DtlR.rqst_loc_cd_META);
		p.columnDtl_rqst_loc_cd.setListType(MCListType.STRICT);
		p.columnDtl_rqst_loc_cd.addLinkBeans(p.columnDtl_rqst_loc_nm,p.columnDtl_rqst_loc_wg_cd,p.columnDtl_rqst_loc_wg_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_rqst_loc_cd);
		p.columnDtl_rqst_loc_nm.setMeta(mcframe.clientMABS.MABSP0010.DtlR.rqst_loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rqst_loc_nm);
		p.columnDtl_rqst_loc_wg_cd.setMeta(mcframe.clientMABS.MABSP0010.DtlR.rqst_loc_wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rqst_loc_wg_cd);
		p.columnDtl_rqst_loc_wg_nm.setMeta(mcframe.clientMABS.MABSP0010.DtlR.rqst_loc_wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rqst_loc_wg_nm);
		p.columnDtl_loc_sppl_cd.setMeta(mcframe.clientMABS.MABSP0010.DtlR.loc_sppl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_sppl_cd);
		p.columnDtl_bom_ptn.setMeta(mcframe.clientMABS.MABSP0010.DtlR.bom_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bom_ptn);
		p.DtlTable.addTable(p.Dtl_dt_p_PPanel.DtTable);
		p.columnDtl_oper_ptn.setMeta(mcframe.clientMABS.MABSP0010.DtlR.oper_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_ptn);
		p.columnDtl_mfg_lt.setMeta(mcframe.clientMABS.MABSP0010.DtlR.mfg_lt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mfg_lt);
		p.DtlTable.addTable(p.Dtl_mfg_lt_qty_p_PPanel.QtyTable);
		p.columnDtl_purc_lt.setMeta(mcframe.clientMABS.MABSP0010.DtlR.purc_lt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_lt);
		p.DtlTable.addTable(p.Dtl_purc_lt_qty_p_PPanel.QtyTable);
		p.columnDtl_purc_basis_typ.setMeta(mcframe.clientMABS.MABSP0010.DtlR.purc_basis_typ_META);
		p.columnDtl_purc_basis_typ.addLinkBeans(p.columnDtl_purc_basis_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_basis_typ);
		p.columnDtl_purc_basis_typ_nm.setMeta(mcframe.clientMABS.MABSP0010.DtlR.purc_basis_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_basis_typ_nm);
		p.columnDtl_accpt_insp_lt.setMeta(mcframe.clientMABS.MABSP0010.DtlR.accpt_insp_lt_META);
		p.columnDtl_accpt_insp_lt.setMinusEnable(true);
		p.DtlTable.addColumnConfig(p.columnDtl_accpt_insp_lt);
		p.columnDtl_buf_lt.setMeta(mcframe.clientMABS.MABSP0010.DtlR.buf_lt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_buf_lt);
		p.columnDtl_ord_fix_pd.setMeta(mcframe.clientMABS.MABSP0010.DtlR.ord_fix_pd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ord_fix_pd);
		p.columnDtl_sz_day_week_typ.setMeta(mcframe.clientMABS.MABSP0010.DtlR.sz_day_week_typ_META);
		p.columnDtl_sz_day_week_typ.addLinkBeans(p.columnDtl_sz_day_week_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sz_day_week_typ);
		p.columnDtl_sz_day_week_typ_nm.setMeta(mcframe.clientMABS.MABSP0010.DtlR.sz_day_week_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sz_day_week_typ_nm);
		p.columnDtl_sz_week.setMeta(mcframe.clientMABS.MABSP0010.DtlR.sz_week_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sz_week);
		p.columnDtl_lot_sz_pd.setMeta(mcframe.clientMABS.MABSP0010.DtlR.lot_sz_pd_META);
		p.columnDtl_lot_sz_pd.setMinusEnable(true);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_sz_pd);
		p.DtlTable.addTable(p.Dtl_min_lot_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_batch_lot_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_max_lot_qty_p_PPanel.QtyTable);
		p.columnDtl_base_unit_cd.setMeta(mcframe.clientMABS.MABSP0010.DtlR.base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_cd);
		p.columnDtl_base_unit_nm.setMeta(mcframe.clientMABS.MABSP0010.DtlR.base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_nm);
		p.columnDtl_max_order.setMeta(mcframe.clientMABS.MABSP0010.DtlR.max_order_META);
		p.DtlTable.addColumnConfig(p.columnDtl_max_order);
		p.columnDtl_prio.setMeta(mcframe.clientMABS.MABSP0010.DtlR.prio_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prio);
		p.columnDtl_order_ratio.setMeta(mcframe.clientMABS.MABSP0010.DtlR.order_ratio_META);
		p.DtlTable.addColumnConfig(p.columnDtl_order_ratio);
		p.DtlTable.addTable(p.Dtl_yield_schd_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_mfg_inst_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_fxd_rqmt_qty_p_PPanel.QtyTable);
		p.columnDtl_lot_issue_typ.setMeta(mcframe.clientMABS.MABSP0010.DtlR.lot_issue_typ_META);
		p.columnDtl_lot_issue_typ.addLinkBeans(p.columnDtl_lot_issue_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_issue_typ);
		p.columnDtl_lot_issue_typ_nm.setMeta(mcframe.clientMABS.MABSP0010.DtlR.lot_issue_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_issue_typ_nm);
		p.columnDtl_bkf_flg.setMeta(mcframe.clientMABS.MABSP0010.DtlR.bkf_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bkf_flg);
		p.columnDtl_ln_stk_flg.setMeta(mcframe.clientMABS.MABSP0010.DtlR.ln_stk_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ln_stk_flg);
		p.columnDtl_pre_po_tgt_flg.setMeta(mcframe.clientMABS.MABSP0010.DtlR.pre_po_tgt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pre_po_tgt_flg);
		p.columnDtl_inst_rec_issue_flg.setMeta(mcframe.clientMABS.MABSP0010.DtlR.inst_rec_issue_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inst_rec_issue_flg);
		p.columnDtl_no_mfg_aprv_flg.setMeta(mcframe.clientMABS.MABSP0010.DtlR.no_mfg_aprv_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_no_mfg_aprv_flg);
		p.columnDtl_itm_lower_yield.setMeta(mcframe.clientMABS.MABSP0010.DtlR.itm_lower_yield_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_lower_yield);
		p.columnDtl_itm_std_yield.setMeta(mcframe.clientMABS.MABSP0010.DtlR.itm_std_yield_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_std_yield);
		p.columnDtl_itm_upper_yield.setMeta(mcframe.clientMABS.MABSP0010.DtlR.itm_upper_yield_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_upper_yield);
		p.columnDtl_purc_id_typ.setMeta(mcframe.clientMABS.MABSP0010.DtlR.purc_id_typ_META);
		p.columnDtl_purc_id_typ.addLinkBeans(p.columnDtl_purc_id_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_id_typ);
		p.columnDtl_purc_id_typ_nm.setMeta(mcframe.clientMABS.MABSP0010.DtlR.purc_id_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_id_typ_nm);
		p.columnDtl_rqst_wg_cd.setMeta(mcframe.clientMABS.MABSP0010.DtlR.rqst_wg_cd_META);
		p.columnDtl_rqst_wg_cd.addLinkBeans(p.columnDtl_rqst_wg_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_rqst_wg_cd);
		p.columnDtl_rqst_wg_nm.setMeta(mcframe.clientMABS.MABSP0010.DtlR.rqst_wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rqst_wg_nm);
		p.columnDtl_po_batch_flg.setMeta(mcframe.clientMABS.MABSP0010.DtlR.po_batch_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_po_batch_flg);
		p.columnDtl_rsrc_cd1.setMeta(mcframe.clientMABS.MABSP0010.DtlR.rsrc_cd1_META);
		p.columnDtl_rsrc_cd1.addLinkBeans(p.columnDtl_rsrc_nm1,p.columnDtl_rsrc_unit_nm1);
		p.DtlTable.addColumnConfig(p.columnDtl_rsrc_cd1);
		p.columnDtl_rsrc_nm1.setMeta(mcframe.clientMABS.MABSP0010.DtlR.rsrc_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rsrc_nm1);
		p.columnDtl_rsrc_unit_nm1.setMeta(mcframe.clientMABS.MABSP0010.DtlR.rsrc_unit_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rsrc_unit_nm1);
		p.columnDtl_rsrc_std_qty1.setMeta(mcframe.clientMABS.MABSP0010.DtlR.rsrc_std_qty1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rsrc_std_qty1);
		p.DtlTable.addTable(p.Dtl_qty1_p_PPanel.QtyTable);
		p.columnDtl_rsrc_cd2.setMeta(mcframe.clientMABS.MABSP0010.DtlR.rsrc_cd2_META);
		p.columnDtl_rsrc_cd2.addLinkBeans(p.columnDtl_rsrc_nm2,p.columnDtl_rsrc_unit_nm2);
		p.DtlTable.addColumnConfig(p.columnDtl_rsrc_cd2);
		p.columnDtl_rsrc_nm2.setMeta(mcframe.clientMABS.MABSP0010.DtlR.rsrc_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rsrc_nm2);
		p.columnDtl_rsrc_unit_nm2.setMeta(mcframe.clientMABS.MABSP0010.DtlR.rsrc_unit_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rsrc_unit_nm2);
		p.columnDtl_rsrc_std_qty2.setMeta(mcframe.clientMABS.MABSP0010.DtlR.rsrc_std_qty2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rsrc_std_qty2);
		p.DtlTable.addTable(p.Dtl_qty2_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_sno_p_PPanel.SnoTable);
		p.columnDtl_not_mrp_flg.setMeta(mcframe.clientMABS.MABSP0010.DtlR.not_mrp_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_not_mrp_flg);
		p.columnDtl_cost_ratio.setMeta(mcframe.clientMABS.MABSP0010.DtlR.cost_ratio_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cost_ratio);
		p.columnDtl_memo1.setMeta(mcframe.clientMABS.MABSP0010.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABS.MABSP0010.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABS.MABSP0010.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0010.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0010.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABS.MABSP0010.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0010.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0010.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP0010.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0010.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0010.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABS.MABSP0010.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0010.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0010.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0010.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP0010.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP0010.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABS.MABSP0010.DtlR.del_ts_META);
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
		Cnd_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_site_cd.getListConfig().setPutter(getCnd_site_cd_ListPutter());
		Cnd_mfg_loc_cd.getListConfig().setPutter(getCnd_mfg_loc_cd_ListPutter());
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_maker_cd.getListConfig().setPutter(getCnd_maker_cd_ListPutter());
		Cnd_rqst_loc_cd.getListConfig().setPutter(getCnd_rqst_loc_cd_ListPutter());
		Cnd_rqst_loc_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rqst_loc_wg_cd.getListConfig().setPutter(getCnd_rqst_loc_wg_cd_ListPutter());
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
		columnDtl_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_wg_cd.getListConfig().setPutter(getDtl_wg_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnDtl_mfg_loc_cd.getListConfig().setPutter(getDtl_mfg_loc_cd_ListPutter());
		columnDtl_sppl_cd.getListConfig().setPutter(getDtl_sppl_cd_ListPutter());
		columnDtl_maker_cd.getListConfig().setPutter(getDtl_maker_cd_ListPutter());
		columnDtl_rqst_loc_cd.getListConfig().setPutter(getDtl_rqst_loc_cd_ListPutter());
		columnDtl_bom_ptn.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bom_ptn.getListConfig().setPutter(getDtl_bom_ptn_ListPutter());
		columnDtl_oper_ptn.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_oper_ptn.getListConfig().setPutter(getDtl_oper_ptn_ListPutter());
		columnDtl_purc_basis_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_purc_basis_typ.getListConfig().setPutter(getDtl_purc_basis_typ_ListPutter());
		columnDtl_sz_day_week_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sz_day_week_typ.getListConfig().setPutter(getDtl_sz_day_week_typ_ListPutter());
		columnDtl_lot_issue_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_lot_issue_typ.getListConfig().setPutter(getDtl_lot_issue_typ_ListPutter());
		columnDtl_purc_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_purc_id_typ.getListConfig().setPutter(getDtl_purc_id_typ_ListPutter());
		columnDtl_rqst_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_rqst_wg_cd.getListConfig().setPutter(getDtl_rqst_wg_cd_ListPutter());
		columnDtl_rsrc_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_rsrc_cd1.getListConfig().setPutter(getDtl_rsrc_cd1_ListPutter());
		columnDtl_rsrc_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_rsrc_cd2.getListConfig().setPutter(getDtl_rsrc_cd2_ListPutter());
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
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgOrSlsWg");
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
	 * [Cnd_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
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
	 * [Cnd_rqst_loc_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqst_loc_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgWg");
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
	 * [Dtl_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgOrSlsWg");
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
	 * [Dtl_mfg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_mfg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
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
	 * [Dtl_rqst_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_rqst_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Dtl_bom_ptn_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bom_ptn_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BomPtn");
		return lp;
	}
	 
	/**
	 * [Dtl_oper_ptn_ListPutter]の作成
	 */
	protected MCListPutter createDtl_oper_ptn_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmOper");
		return lp;
	}
	 
	/**
	 * [Dtl_purc_basis_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_purc_basis_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcBasisTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_sz_day_week_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sz_day_week_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DayWeekTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_lot_issue_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_lot_issue_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LotIssueTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_purc_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_purc_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcIdTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_rqst_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_rqst_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcWg");
		return lp;
	}
	 
	/**
	 * [Dtl_rsrc_cd1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_rsrc_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Rsrc");
		return lp;
	}
	 
	/**
	 * [Dtl_rsrc_cd2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_rsrc_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Rsrc");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_site_cd) return getCnd_site_cd(row, info);
		if(combo == Cnd_mfg_loc_cd) return getCnd_mfg_loc_cd(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_maker_cd) return getCnd_maker_cd(row, info);
		if(combo == Cnd_rqst_loc_cd) return getCnd_rqst_loc_cd(row, info);
		if(combo == Cnd_rqst_loc_wg_cd) return getCnd_rqst_loc_wg_cd(row, info);
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
		if(combo == columnDtl_wg_cd) return getDtl_wg_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_cd) return getDtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub1) return getDtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub2) return getDtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub3) return getDtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnDtl_mfg_loc_cd) return getDtl_mfg_loc_cd(row, info);
		if(combo == columnDtl_sppl_cd) return getDtl_sppl_cd(row, info);
		if(combo == columnDtl_maker_cd) return getDtl_maker_cd(row, info);
		if(combo == columnDtl_rqst_loc_cd) return getDtl_rqst_loc_cd(row, info);
		if(combo == columnDtl_bom_ptn) return getDtl_bom_ptn(row, info);
		if(combo == columnDtl_oper_ptn) return getDtl_oper_ptn(row, info);
		if(combo == columnDtl_purc_basis_typ) return getDtl_purc_basis_typ(row, info);
		if(combo == columnDtl_sz_day_week_typ) return getDtl_sz_day_week_typ(row, info);
		if(combo == columnDtl_lot_issue_typ) return getDtl_lot_issue_typ(row, info);
		if(combo == columnDtl_purc_id_typ) return getDtl_purc_id_typ(row, info);
		if(combo == columnDtl_rqst_wg_cd) return getDtl_rqst_wg_cd(row, info);
		if(combo == columnDtl_rsrc_cd1) return getDtl_rsrc_cd1(row, info);
		if(combo == columnDtl_rsrc_cd2) return getDtl_rsrc_cd2(row, info);
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
		else if (ap == BulkSet_set_dt) doBulkSet_set_dt(info);
		else if (ap == DtlBtn_open_MABSP1100) doDtlBtn_open_MABSP1100(info);
		else if (ap == DtlBtn_open_MABSP1110) doDtlBtn_open_MABSP1110(info);
		else if (ap == DtlBtn_open_MABSP1130) doDtlBtn_open_MABSP1130(info);
		else if (ap == DtlBtn_correct_dup_dt) doDtlBtn_correct_dup_dt(info);
		else if (ap == DtlBtn_select_all) doDtlBtn_select_all(info);
		else if (ap == DtlBtn_deselect_all) doDtlBtn_deselect_all(info);
		else if (ap == DtlBtn_radd) doDtlBtn_radd(info);
		else if (ap == DtlBtn_rdel) doDtlBtn_rdel(info);
		else if (ap == DtlBtn_rcopy) doDtlBtn_rcopy(info);
		else if (ap == DtlBtn_upd_cmn) doDtlBtn_upd_cmn(info);
		else if (ap == DtlBtn_upd_wg) doDtlBtn_upd_wg(info);
		else if (ap == DtlBtn_del_cmn) doDtlBtn_del_cmn(info);
		else if (ap == DtlBtn_del_wg) doDtlBtn_del_wg(info);
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
	 * [BulkSet]パネルの[set_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBulkSet_set_dt(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[open_MABSP1100]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_open_MABSP1100(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[open_MABSP1110]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_open_MABSP1110(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[open_MABSP1130]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_open_MABSP1130(MCEventInfo info);

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
	 * [DtlBtn]パネルの[del_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_del_cmn(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[del_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_del_wg(MCEventInfo info);

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
		if (vc == Cnd_site_cd) return doCnd_site_cd_VC(info);
		if (vc == Cnd_site_nm) return doCnd_site_nm_VC(info);
		if (vc == Cnd_mfg_loc_cd) return doCnd_mfg_loc_cd_VC(info);
		if (vc == Cnd_mfg_loc_nm) return doCnd_mfg_loc_nm_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_maker_cd) return doCnd_maker_cd_VC(info);
		if (vc == Cnd_maker_nm) return doCnd_maker_nm_VC(info);
		if (vc == Cnd_rqst_loc_cd) return doCnd_rqst_loc_cd_VC(info);
		if (vc == Cnd_rqst_loc_nm) return doCnd_rqst_loc_nm_VC(info);
		if (vc == Cnd_rqst_loc_wg_cd) return doCnd_rqst_loc_wg_cd_VC(info);
		if (vc == Cnd_rqst_loc_wg_nm) return doCnd_rqst_loc_wg_nm_VC(info);
		if (vc == Cnd_bom_ptn) return doCnd_bom_ptn_VC(info);
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
		if (vc == BulkSet_st_dt) return doBulkSet_st_dt_VC(info);
		if (vc == BulkSet_end_dt) return doBulkSet_end_dt_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_wg_nm) return doDtl_wg_nm_VC(info);
		if (vc == columnDtl_stk_mng_typ) return doDtl_stk_mng_typ_VC(info);
		if (vc == columnDtl_asset_mng_typ) return doDtl_asset_mng_typ_VC(info);
		if (vc == columnDtl_unit_cd) return doDtl_unit_cd_VC(info);
		if (vc == columnDtl_dec_place) return doDtl_dec_place_VC(info);
		if (vc == columnDtl_sno1_mng_typ) return doDtl_sno1_mng_typ_VC(info);
		if (vc == columnDtl_sno2_mng_typ) return doDtl_sno2_mng_typ_VC(info);
		if (vc == columnDtl_sno3_mng_typ) return doDtl_sno3_mng_typ_VC(info);
		if (vc == columnDtl_sno4_mng_typ) return doDtl_sno4_mng_typ_VC(info);
		if (vc == columnDtl_def_bom_ptn) return doDtl_def_bom_ptn_VC(info);
		if (vc == columnDtl_lot_mng_typ) return doDtl_lot_mng_typ_VC(info);
		if (vc == columnDtl_itm_typ) return doDtl_itm_typ_VC(info);
		if (vc == columnDtl_itm_typ_nm) return doDtl_itm_typ_nm_VC(info);
		if (vc == columnDtl_itm_typ_d_cd) return doDtl_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_itm_typ_d_nm) return doDtl_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_mfg_loc_cd) return doDtl_mfg_loc_cd_VC(info);
		if (vc == columnDtl_mfg_loc_nm) return doDtl_mfg_loc_nm_VC(info);
		if (vc == columnDtl_site_cd) return doDtl_site_cd_VC(info);
		if (vc == columnDtl_site_nm) return doDtl_site_nm_VC(info);
		if (vc == columnDtl_sppl_cd) return doDtl_sppl_cd_VC(info);
		if (vc == columnDtl_sppl_nm) return doDtl_sppl_nm_VC(info);
		if (vc == columnDtl_maker_cd) return doDtl_maker_cd_VC(info);
		if (vc == columnDtl_maker_nm) return doDtl_maker_nm_VC(info);
		if (vc == columnDtl_rqst_loc_cd) return doDtl_rqst_loc_cd_VC(info);
		if (vc == columnDtl_rqst_loc_nm) return doDtl_rqst_loc_nm_VC(info);
		if (vc == columnDtl_rqst_loc_wg_cd) return doDtl_rqst_loc_wg_cd_VC(info);
		if (vc == columnDtl_rqst_loc_wg_nm) return doDtl_rqst_loc_wg_nm_VC(info);
		if (vc == columnDtl_loc_sppl_cd) return doDtl_loc_sppl_cd_VC(info);
		if (vc == columnDtl_bom_ptn) return doDtl_bom_ptn_VC(info);
		if (vc == columnDtl_oper_ptn) return doDtl_oper_ptn_VC(info);
		if (vc == columnDtl_mfg_lt) return doDtl_mfg_lt_VC(info);
		if (vc == columnDtl_purc_lt) return doDtl_purc_lt_VC(info);
		if (vc == columnDtl_purc_basis_typ) return doDtl_purc_basis_typ_VC(info);
		if (vc == columnDtl_purc_basis_typ_nm) return doDtl_purc_basis_typ_nm_VC(info);
		if (vc == columnDtl_accpt_insp_lt) return doDtl_accpt_insp_lt_VC(info);
		if (vc == columnDtl_buf_lt) return doDtl_buf_lt_VC(info);
		if (vc == columnDtl_ord_fix_pd) return doDtl_ord_fix_pd_VC(info);
		if (vc == columnDtl_sz_day_week_typ) return doDtl_sz_day_week_typ_VC(info);
		if (vc == columnDtl_sz_day_week_typ_nm) return doDtl_sz_day_week_typ_nm_VC(info);
		if (vc == columnDtl_sz_week) return doDtl_sz_week_VC(info);
		if (vc == columnDtl_lot_sz_pd) return doDtl_lot_sz_pd_VC(info);
		if (vc == columnDtl_base_unit_cd) return doDtl_base_unit_cd_VC(info);
		if (vc == columnDtl_base_unit_nm) return doDtl_base_unit_nm_VC(info);
		if (vc == columnDtl_max_order) return doDtl_max_order_VC(info);
		if (vc == columnDtl_prio) return doDtl_prio_VC(info);
		if (vc == columnDtl_order_ratio) return doDtl_order_ratio_VC(info);
		if (vc == columnDtl_lot_issue_typ) return doDtl_lot_issue_typ_VC(info);
		if (vc == columnDtl_lot_issue_typ_nm) return doDtl_lot_issue_typ_nm_VC(info);
		if (vc == columnDtl_bkf_flg) return doDtl_bkf_flg_VC(info);
		if (vc == columnDtl_ln_stk_flg) return doDtl_ln_stk_flg_VC(info);
		if (vc == columnDtl_pre_po_tgt_flg) return doDtl_pre_po_tgt_flg_VC(info);
		if (vc == columnDtl_inst_rec_issue_flg) return doDtl_inst_rec_issue_flg_VC(info);
		if (vc == columnDtl_no_mfg_aprv_flg) return doDtl_no_mfg_aprv_flg_VC(info);
		if (vc == columnDtl_itm_lower_yield) return doDtl_itm_lower_yield_VC(info);
		if (vc == columnDtl_itm_std_yield) return doDtl_itm_std_yield_VC(info);
		if (vc == columnDtl_itm_upper_yield) return doDtl_itm_upper_yield_VC(info);
		if (vc == columnDtl_purc_id_typ) return doDtl_purc_id_typ_VC(info);
		if (vc == columnDtl_purc_id_typ_nm) return doDtl_purc_id_typ_nm_VC(info);
		if (vc == columnDtl_rqst_wg_cd) return doDtl_rqst_wg_cd_VC(info);
		if (vc == columnDtl_rqst_wg_nm) return doDtl_rqst_wg_nm_VC(info);
		if (vc == columnDtl_po_batch_flg) return doDtl_po_batch_flg_VC(info);
		if (vc == columnDtl_rsrc_cd1) return doDtl_rsrc_cd1_VC(info);
		if (vc == columnDtl_rsrc_nm1) return doDtl_rsrc_nm1_VC(info);
		if (vc == columnDtl_rsrc_unit_nm1) return doDtl_rsrc_unit_nm1_VC(info);
		if (vc == columnDtl_rsrc_std_qty1) return doDtl_rsrc_std_qty1_VC(info);
		if (vc == columnDtl_rsrc_cd2) return doDtl_rsrc_cd2_VC(info);
		if (vc == columnDtl_rsrc_nm2) return doDtl_rsrc_nm2_VC(info);
		if (vc == columnDtl_rsrc_unit_nm2) return doDtl_rsrc_unit_nm2_VC(info);
		if (vc == columnDtl_rsrc_std_qty2) return doDtl_rsrc_std_qty2_VC(info);
		if (vc == columnDtl_not_mrp_flg) return doDtl_not_mrp_flg_VC(info);
		if (vc == columnDtl_cost_ratio) return doDtl_cost_ratio_VC(info);
		if (vc == columnDtl_memo1) return doDtl_memo1_VC(info);
		if (vc == columnDtl_memo2) return doDtl_memo2_VC(info);
		if (vc == columnDtl_memo3) return doDtl_memo3_VC(info);
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
	 * [Cnd]パネルの[rqst_loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_loc_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_loc_wg_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asset_mng_typ_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[def_bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_def_bom_ptn_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_site_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[rqst_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqst_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqst_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqst_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqst_loc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqst_loc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqst_loc_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqst_loc_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_sppl_cd_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[oper_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mfg_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mfg_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_basis_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_basis_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[accpt_insp_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_accpt_insp_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[buf_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_buf_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ord_fix_pd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ord_fix_pd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sz_day_week_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sz_day_week_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sz_day_week_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sz_day_week_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sz_week]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sz_week_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_sz_pd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_sz_pd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[max_order]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_max_order_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[order_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_order_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_issue_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_issue_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_issue_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_issue_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bkf_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bkf_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ln_stk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ln_stk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pre_po_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pre_po_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inst_rec_issue_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inst_rec_issue_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[no_mfg_aprv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_no_mfg_aprv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_lower_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_lower_yield_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_std_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_std_yield_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_upper_yield]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_upper_yield_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqst_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqst_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rqst_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rqst_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[po_batch_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_po_batch_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsrc_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsrc_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsrc_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsrc_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsrc_unit_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsrc_unit_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsrc_std_qty1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsrc_std_qty1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsrc_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsrc_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsrc_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsrc_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsrc_unit_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsrc_unit_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsrc_std_qty2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsrc_std_qty2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[not_mrp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_not_mrp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cost_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cost_ratio_VC(MCEventInfo info){
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
		else if (nc == Cnd_site_cd) doCnd_site_cd_NC(info);
		else if (nc == Cnd_site_nm) doCnd_site_nm_NC(info);
		else if (nc == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NC(info);
		else if (nc == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_maker_cd) doCnd_maker_cd_NC(info);
		else if (nc == Cnd_maker_nm) doCnd_maker_nm_NC(info);
		else if (nc == Cnd_rqst_loc_cd) doCnd_rqst_loc_cd_NC(info);
		else if (nc == Cnd_rqst_loc_nm) doCnd_rqst_loc_nm_NC(info);
		else if (nc == Cnd_rqst_loc_wg_cd) doCnd_rqst_loc_wg_cd_NC(info);
		else if (nc == Cnd_rqst_loc_wg_nm) doCnd_rqst_loc_wg_nm_NC(info);
		else if (nc == Cnd_bom_ptn) doCnd_bom_ptn_NC(info);
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
		else if (nc == BulkSet_st_dt) doBulkSet_st_dt_NC(info);
		else if (nc == BulkSet_end_dt) doBulkSet_end_dt_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_wg_nm) doDtl_wg_nm_NC(info);
		else if (nc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NC(info);
		else if (nc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NC(info);
		else if (nc == columnDtl_unit_cd) doDtl_unit_cd_NC(info);
		else if (nc == columnDtl_dec_place) doDtl_dec_place_NC(info);
		else if (nc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_def_bom_ptn) doDtl_def_bom_ptn_NC(info);
		else if (nc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NC(info);
		else if (nc == columnDtl_itm_typ) doDtl_itm_typ_NC(info);
		else if (nc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NC(info);
		else if (nc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_mfg_loc_cd) doDtl_mfg_loc_cd_NC(info);
		else if (nc == columnDtl_mfg_loc_nm) doDtl_mfg_loc_nm_NC(info);
		else if (nc == columnDtl_site_cd) doDtl_site_cd_NC(info);
		else if (nc == columnDtl_site_nm) doDtl_site_nm_NC(info);
		else if (nc == columnDtl_sppl_cd) doDtl_sppl_cd_NC(info);
		else if (nc == columnDtl_sppl_nm) doDtl_sppl_nm_NC(info);
		else if (nc == columnDtl_maker_cd) doDtl_maker_cd_NC(info);
		else if (nc == columnDtl_maker_nm) doDtl_maker_nm_NC(info);
		else if (nc == columnDtl_rqst_loc_cd) doDtl_rqst_loc_cd_NC(info);
		else if (nc == columnDtl_rqst_loc_nm) doDtl_rqst_loc_nm_NC(info);
		else if (nc == columnDtl_rqst_loc_wg_cd) doDtl_rqst_loc_wg_cd_NC(info);
		else if (nc == columnDtl_rqst_loc_wg_nm) doDtl_rqst_loc_wg_nm_NC(info);
		else if (nc == columnDtl_loc_sppl_cd) doDtl_loc_sppl_cd_NC(info);
		else if (nc == columnDtl_bom_ptn) doDtl_bom_ptn_NC(info);
		else if (nc == columnDtl_oper_ptn) doDtl_oper_ptn_NC(info);
		else if (nc == columnDtl_mfg_lt) doDtl_mfg_lt_NC(info);
		else if (nc == columnDtl_purc_lt) doDtl_purc_lt_NC(info);
		else if (nc == columnDtl_purc_basis_typ) doDtl_purc_basis_typ_NC(info);
		else if (nc == columnDtl_purc_basis_typ_nm) doDtl_purc_basis_typ_nm_NC(info);
		else if (nc == columnDtl_accpt_insp_lt) doDtl_accpt_insp_lt_NC(info);
		else if (nc == columnDtl_buf_lt) doDtl_buf_lt_NC(info);
		else if (nc == columnDtl_ord_fix_pd) doDtl_ord_fix_pd_NC(info);
		else if (nc == columnDtl_sz_day_week_typ) doDtl_sz_day_week_typ_NC(info);
		else if (nc == columnDtl_sz_day_week_typ_nm) doDtl_sz_day_week_typ_nm_NC(info);
		else if (nc == columnDtl_sz_week) doDtl_sz_week_NC(info);
		else if (nc == columnDtl_lot_sz_pd) doDtl_lot_sz_pd_NC(info);
		else if (nc == columnDtl_base_unit_cd) doDtl_base_unit_cd_NC(info);
		else if (nc == columnDtl_base_unit_nm) doDtl_base_unit_nm_NC(info);
		else if (nc == columnDtl_max_order) doDtl_max_order_NC(info);
		else if (nc == columnDtl_prio) doDtl_prio_NC(info);
		else if (nc == columnDtl_order_ratio) doDtl_order_ratio_NC(info);
		else if (nc == columnDtl_lot_issue_typ) doDtl_lot_issue_typ_NC(info);
		else if (nc == columnDtl_lot_issue_typ_nm) doDtl_lot_issue_typ_nm_NC(info);
		else if (nc == columnDtl_bkf_flg) doDtl_bkf_flg_NC(info);
		else if (nc == columnDtl_ln_stk_flg) doDtl_ln_stk_flg_NC(info);
		else if (nc == columnDtl_pre_po_tgt_flg) doDtl_pre_po_tgt_flg_NC(info);
		else if (nc == columnDtl_inst_rec_issue_flg) doDtl_inst_rec_issue_flg_NC(info);
		else if (nc == columnDtl_no_mfg_aprv_flg) doDtl_no_mfg_aprv_flg_NC(info);
		else if (nc == columnDtl_itm_lower_yield) doDtl_itm_lower_yield_NC(info);
		else if (nc == columnDtl_itm_std_yield) doDtl_itm_std_yield_NC(info);
		else if (nc == columnDtl_itm_upper_yield) doDtl_itm_upper_yield_NC(info);
		else if (nc == columnDtl_purc_id_typ) doDtl_purc_id_typ_NC(info);
		else if (nc == columnDtl_purc_id_typ_nm) doDtl_purc_id_typ_nm_NC(info);
		else if (nc == columnDtl_rqst_wg_cd) doDtl_rqst_wg_cd_NC(info);
		else if (nc == columnDtl_rqst_wg_nm) doDtl_rqst_wg_nm_NC(info);
		else if (nc == columnDtl_po_batch_flg) doDtl_po_batch_flg_NC(info);
		else if (nc == columnDtl_rsrc_cd1) doDtl_rsrc_cd1_NC(info);
		else if (nc == columnDtl_rsrc_nm1) doDtl_rsrc_nm1_NC(info);
		else if (nc == columnDtl_rsrc_unit_nm1) doDtl_rsrc_unit_nm1_NC(info);
		else if (nc == columnDtl_rsrc_std_qty1) doDtl_rsrc_std_qty1_NC(info);
		else if (nc == columnDtl_rsrc_cd2) doDtl_rsrc_cd2_NC(info);
		else if (nc == columnDtl_rsrc_nm2) doDtl_rsrc_nm2_NC(info);
		else if (nc == columnDtl_rsrc_unit_nm2) doDtl_rsrc_unit_nm2_NC(info);
		else if (nc == columnDtl_rsrc_std_qty2) doDtl_rsrc_std_qty2_NC(info);
		else if (nc == columnDtl_not_mrp_flg) doDtl_not_mrp_flg_NC(info);
		else if (nc == columnDtl_cost_ratio) doDtl_cost_ratio_NC(info);
		else if (nc == columnDtl_memo1) doDtl_memo1_NC(info);
		else if (nc == columnDtl_memo2) doDtl_memo2_NC(info);
		else if (nc == columnDtl_memo3) doDtl_memo3_NC(info);
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
	 * [Cnd]パネルの[rqst_loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_wg_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[rqst_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_loc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_loc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_loc_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_loc_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_lt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_lt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_basis_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_basis_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[accpt_insp_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_accpt_insp_lt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[buf_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_buf_lt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ord_fix_pd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ord_fix_pd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sz_day_week_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sz_day_week_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sz_day_week_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sz_day_week_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sz_week]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sz_week_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_sz_pd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_sz_pd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[max_order]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_max_order_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prio_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[order_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_order_ratio_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_issue_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_issue_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_issue_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_issue_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bkf_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bkf_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ln_stk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ln_stk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_po_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_po_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_rec_issue_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_rec_issue_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[no_mfg_aprv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_no_mfg_aprv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_lower_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_lower_yield_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_std_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_std_yield_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_upper_yield]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_upper_yield_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_batch_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_batch_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_unit_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_unit_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_std_qty1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_std_qty1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_unit_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_unit_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_std_qty2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_std_qty2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_mrp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_mrp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_ratio_NC(MCEventInfo info){
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
		else if (ne == Cnd_site_cd) doCnd_site_cd_NE(info);
		else if (ne == Cnd_site_nm) doCnd_site_nm_NE(info);
		else if (ne == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NE(info);
		else if (ne == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_maker_cd) doCnd_maker_cd_NE(info);
		else if (ne == Cnd_maker_nm) doCnd_maker_nm_NE(info);
		else if (ne == Cnd_rqst_loc_cd) doCnd_rqst_loc_cd_NE(info);
		else if (ne == Cnd_rqst_loc_nm) doCnd_rqst_loc_nm_NE(info);
		else if (ne == Cnd_rqst_loc_wg_cd) doCnd_rqst_loc_wg_cd_NE(info);
		else if (ne == Cnd_rqst_loc_wg_nm) doCnd_rqst_loc_wg_nm_NE(info);
		else if (ne == Cnd_bom_ptn) doCnd_bom_ptn_NE(info);
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
		else if (ne == BulkSet_st_dt) doBulkSet_st_dt_NE(info);
		else if (ne == BulkSet_end_dt) doBulkSet_end_dt_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_wg_nm) doDtl_wg_nm_NE(info);
		else if (ne == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NE(info);
		else if (ne == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NE(info);
		else if (ne == columnDtl_unit_cd) doDtl_unit_cd_NE(info);
		else if (ne == columnDtl_dec_place) doDtl_dec_place_NE(info);
		else if (ne == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_def_bom_ptn) doDtl_def_bom_ptn_NE(info);
		else if (ne == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NE(info);
		else if (ne == columnDtl_itm_typ) doDtl_itm_typ_NE(info);
		else if (ne == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NE(info);
		else if (ne == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_mfg_loc_cd) doDtl_mfg_loc_cd_NE(info);
		else if (ne == columnDtl_mfg_loc_nm) doDtl_mfg_loc_nm_NE(info);
		else if (ne == columnDtl_site_cd) doDtl_site_cd_NE(info);
		else if (ne == columnDtl_site_nm) doDtl_site_nm_NE(info);
		else if (ne == columnDtl_sppl_cd) doDtl_sppl_cd_NE(info);
		else if (ne == columnDtl_sppl_nm) doDtl_sppl_nm_NE(info);
		else if (ne == columnDtl_maker_cd) doDtl_maker_cd_NE(info);
		else if (ne == columnDtl_maker_nm) doDtl_maker_nm_NE(info);
		else if (ne == columnDtl_rqst_loc_cd) doDtl_rqst_loc_cd_NE(info);
		else if (ne == columnDtl_rqst_loc_nm) doDtl_rqst_loc_nm_NE(info);
		else if (ne == columnDtl_rqst_loc_wg_cd) doDtl_rqst_loc_wg_cd_NE(info);
		else if (ne == columnDtl_rqst_loc_wg_nm) doDtl_rqst_loc_wg_nm_NE(info);
		else if (ne == columnDtl_loc_sppl_cd) doDtl_loc_sppl_cd_NE(info);
		else if (ne == columnDtl_bom_ptn) doDtl_bom_ptn_NE(info);
		else if (ne == columnDtl_oper_ptn) doDtl_oper_ptn_NE(info);
		else if (ne == columnDtl_mfg_lt) doDtl_mfg_lt_NE(info);
		else if (ne == columnDtl_purc_lt) doDtl_purc_lt_NE(info);
		else if (ne == columnDtl_purc_basis_typ) doDtl_purc_basis_typ_NE(info);
		else if (ne == columnDtl_purc_basis_typ_nm) doDtl_purc_basis_typ_nm_NE(info);
		else if (ne == columnDtl_accpt_insp_lt) doDtl_accpt_insp_lt_NE(info);
		else if (ne == columnDtl_buf_lt) doDtl_buf_lt_NE(info);
		else if (ne == columnDtl_ord_fix_pd) doDtl_ord_fix_pd_NE(info);
		else if (ne == columnDtl_sz_day_week_typ) doDtl_sz_day_week_typ_NE(info);
		else if (ne == columnDtl_sz_day_week_typ_nm) doDtl_sz_day_week_typ_nm_NE(info);
		else if (ne == columnDtl_sz_week) doDtl_sz_week_NE(info);
		else if (ne == columnDtl_lot_sz_pd) doDtl_lot_sz_pd_NE(info);
		else if (ne == columnDtl_base_unit_cd) doDtl_base_unit_cd_NE(info);
		else if (ne == columnDtl_base_unit_nm) doDtl_base_unit_nm_NE(info);
		else if (ne == columnDtl_max_order) doDtl_max_order_NE(info);
		else if (ne == columnDtl_prio) doDtl_prio_NE(info);
		else if (ne == columnDtl_order_ratio) doDtl_order_ratio_NE(info);
		else if (ne == columnDtl_lot_issue_typ) doDtl_lot_issue_typ_NE(info);
		else if (ne == columnDtl_lot_issue_typ_nm) doDtl_lot_issue_typ_nm_NE(info);
		else if (ne == columnDtl_bkf_flg) doDtl_bkf_flg_NE(info);
		else if (ne == columnDtl_ln_stk_flg) doDtl_ln_stk_flg_NE(info);
		else if (ne == columnDtl_pre_po_tgt_flg) doDtl_pre_po_tgt_flg_NE(info);
		else if (ne == columnDtl_inst_rec_issue_flg) doDtl_inst_rec_issue_flg_NE(info);
		else if (ne == columnDtl_no_mfg_aprv_flg) doDtl_no_mfg_aprv_flg_NE(info);
		else if (ne == columnDtl_itm_lower_yield) doDtl_itm_lower_yield_NE(info);
		else if (ne == columnDtl_itm_std_yield) doDtl_itm_std_yield_NE(info);
		else if (ne == columnDtl_itm_upper_yield) doDtl_itm_upper_yield_NE(info);
		else if (ne == columnDtl_purc_id_typ) doDtl_purc_id_typ_NE(info);
		else if (ne == columnDtl_purc_id_typ_nm) doDtl_purc_id_typ_nm_NE(info);
		else if (ne == columnDtl_rqst_wg_cd) doDtl_rqst_wg_cd_NE(info);
		else if (ne == columnDtl_rqst_wg_nm) doDtl_rqst_wg_nm_NE(info);
		else if (ne == columnDtl_po_batch_flg) doDtl_po_batch_flg_NE(info);
		else if (ne == columnDtl_rsrc_cd1) doDtl_rsrc_cd1_NE(info);
		else if (ne == columnDtl_rsrc_nm1) doDtl_rsrc_nm1_NE(info);
		else if (ne == columnDtl_rsrc_unit_nm1) doDtl_rsrc_unit_nm1_NE(info);
		else if (ne == columnDtl_rsrc_std_qty1) doDtl_rsrc_std_qty1_NE(info);
		else if (ne == columnDtl_rsrc_cd2) doDtl_rsrc_cd2_NE(info);
		else if (ne == columnDtl_rsrc_nm2) doDtl_rsrc_nm2_NE(info);
		else if (ne == columnDtl_rsrc_unit_nm2) doDtl_rsrc_unit_nm2_NE(info);
		else if (ne == columnDtl_rsrc_std_qty2) doDtl_rsrc_std_qty2_NE(info);
		else if (ne == columnDtl_not_mrp_flg) doDtl_not_mrp_flg_NE(info);
		else if (ne == columnDtl_cost_ratio) doDtl_cost_ratio_NE(info);
		else if (ne == columnDtl_memo1) doDtl_memo1_NE(info);
		else if (ne == columnDtl_memo2) doDtl_memo2_NE(info);
		else if (ne == columnDtl_memo3) doDtl_memo3_NE(info);
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
	 * [Cnd]パネルの[rqst_loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_wg_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[rqst_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_loc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_loc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_loc_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_loc_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_lt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_lt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_basis_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_basis_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[accpt_insp_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_accpt_insp_lt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[buf_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_buf_lt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ord_fix_pd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ord_fix_pd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sz_day_week_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sz_day_week_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sz_day_week_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sz_day_week_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sz_week]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sz_week_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_sz_pd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_sz_pd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[max_order]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_max_order_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prio_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[order_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_order_ratio_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_issue_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_issue_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_issue_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_issue_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bkf_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bkf_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ln_stk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ln_stk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_po_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_po_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_rec_issue_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_rec_issue_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[no_mfg_aprv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_no_mfg_aprv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_lower_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_lower_yield_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_std_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_std_yield_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_upper_yield]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_upper_yield_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_batch_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_batch_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_unit_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_unit_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_std_qty1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_std_qty1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_unit_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_unit_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_std_qty2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_std_qty2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_mrp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_mrp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_ratio_NE(MCEventInfo info){
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
		else if (nx == Cnd_site_cd) doCnd_site_cd_NX(info);
		else if (nx == Cnd_site_nm) doCnd_site_nm_NX(info);
		else if (nx == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NX(info);
		else if (nx == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_maker_cd) doCnd_maker_cd_NX(info);
		else if (nx == Cnd_maker_nm) doCnd_maker_nm_NX(info);
		else if (nx == Cnd_rqst_loc_cd) doCnd_rqst_loc_cd_NX(info);
		else if (nx == Cnd_rqst_loc_nm) doCnd_rqst_loc_nm_NX(info);
		else if (nx == Cnd_rqst_loc_wg_cd) doCnd_rqst_loc_wg_cd_NX(info);
		else if (nx == Cnd_rqst_loc_wg_nm) doCnd_rqst_loc_wg_nm_NX(info);
		else if (nx == Cnd_bom_ptn) doCnd_bom_ptn_NX(info);
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
		else if (nx == BulkSet_st_dt) doBulkSet_st_dt_NX(info);
		else if (nx == BulkSet_end_dt) doBulkSet_end_dt_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_wg_nm) doDtl_wg_nm_NX(info);
		else if (nx == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NX(info);
		else if (nx == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_NX(info);
		else if (nx == columnDtl_unit_cd) doDtl_unit_cd_NX(info);
		else if (nx == columnDtl_dec_place) doDtl_dec_place_NX(info);
		else if (nx == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_def_bom_ptn) doDtl_def_bom_ptn_NX(info);
		else if (nx == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NX(info);
		else if (nx == columnDtl_itm_typ) doDtl_itm_typ_NX(info);
		else if (nx == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NX(info);
		else if (nx == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_mfg_loc_cd) doDtl_mfg_loc_cd_NX(info);
		else if (nx == columnDtl_mfg_loc_nm) doDtl_mfg_loc_nm_NX(info);
		else if (nx == columnDtl_site_cd) doDtl_site_cd_NX(info);
		else if (nx == columnDtl_site_nm) doDtl_site_nm_NX(info);
		else if (nx == columnDtl_sppl_cd) doDtl_sppl_cd_NX(info);
		else if (nx == columnDtl_sppl_nm) doDtl_sppl_nm_NX(info);
		else if (nx == columnDtl_maker_cd) doDtl_maker_cd_NX(info);
		else if (nx == columnDtl_maker_nm) doDtl_maker_nm_NX(info);
		else if (nx == columnDtl_rqst_loc_cd) doDtl_rqst_loc_cd_NX(info);
		else if (nx == columnDtl_rqst_loc_nm) doDtl_rqst_loc_nm_NX(info);
		else if (nx == columnDtl_rqst_loc_wg_cd) doDtl_rqst_loc_wg_cd_NX(info);
		else if (nx == columnDtl_rqst_loc_wg_nm) doDtl_rqst_loc_wg_nm_NX(info);
		else if (nx == columnDtl_loc_sppl_cd) doDtl_loc_sppl_cd_NX(info);
		else if (nx == columnDtl_bom_ptn) doDtl_bom_ptn_NX(info);
		else if (nx == columnDtl_oper_ptn) doDtl_oper_ptn_NX(info);
		else if (nx == columnDtl_mfg_lt) doDtl_mfg_lt_NX(info);
		else if (nx == columnDtl_purc_lt) doDtl_purc_lt_NX(info);
		else if (nx == columnDtl_purc_basis_typ) doDtl_purc_basis_typ_NX(info);
		else if (nx == columnDtl_purc_basis_typ_nm) doDtl_purc_basis_typ_nm_NX(info);
		else if (nx == columnDtl_accpt_insp_lt) doDtl_accpt_insp_lt_NX(info);
		else if (nx == columnDtl_buf_lt) doDtl_buf_lt_NX(info);
		else if (nx == columnDtl_ord_fix_pd) doDtl_ord_fix_pd_NX(info);
		else if (nx == columnDtl_sz_day_week_typ) doDtl_sz_day_week_typ_NX(info);
		else if (nx == columnDtl_sz_day_week_typ_nm) doDtl_sz_day_week_typ_nm_NX(info);
		else if (nx == columnDtl_sz_week) doDtl_sz_week_NX(info);
		else if (nx == columnDtl_lot_sz_pd) doDtl_lot_sz_pd_NX(info);
		else if (nx == columnDtl_base_unit_cd) doDtl_base_unit_cd_NX(info);
		else if (nx == columnDtl_base_unit_nm) doDtl_base_unit_nm_NX(info);
		else if (nx == columnDtl_max_order) doDtl_max_order_NX(info);
		else if (nx == columnDtl_prio) doDtl_prio_NX(info);
		else if (nx == columnDtl_order_ratio) doDtl_order_ratio_NX(info);
		else if (nx == columnDtl_lot_issue_typ) doDtl_lot_issue_typ_NX(info);
		else if (nx == columnDtl_lot_issue_typ_nm) doDtl_lot_issue_typ_nm_NX(info);
		else if (nx == columnDtl_bkf_flg) doDtl_bkf_flg_NX(info);
		else if (nx == columnDtl_ln_stk_flg) doDtl_ln_stk_flg_NX(info);
		else if (nx == columnDtl_pre_po_tgt_flg) doDtl_pre_po_tgt_flg_NX(info);
		else if (nx == columnDtl_inst_rec_issue_flg) doDtl_inst_rec_issue_flg_NX(info);
		else if (nx == columnDtl_no_mfg_aprv_flg) doDtl_no_mfg_aprv_flg_NX(info);
		else if (nx == columnDtl_itm_lower_yield) doDtl_itm_lower_yield_NX(info);
		else if (nx == columnDtl_itm_std_yield) doDtl_itm_std_yield_NX(info);
		else if (nx == columnDtl_itm_upper_yield) doDtl_itm_upper_yield_NX(info);
		else if (nx == columnDtl_purc_id_typ) doDtl_purc_id_typ_NX(info);
		else if (nx == columnDtl_purc_id_typ_nm) doDtl_purc_id_typ_nm_NX(info);
		else if (nx == columnDtl_rqst_wg_cd) doDtl_rqst_wg_cd_NX(info);
		else if (nx == columnDtl_rqst_wg_nm) doDtl_rqst_wg_nm_NX(info);
		else if (nx == columnDtl_po_batch_flg) doDtl_po_batch_flg_NX(info);
		else if (nx == columnDtl_rsrc_cd1) doDtl_rsrc_cd1_NX(info);
		else if (nx == columnDtl_rsrc_nm1) doDtl_rsrc_nm1_NX(info);
		else if (nx == columnDtl_rsrc_unit_nm1) doDtl_rsrc_unit_nm1_NX(info);
		else if (nx == columnDtl_rsrc_std_qty1) doDtl_rsrc_std_qty1_NX(info);
		else if (nx == columnDtl_rsrc_cd2) doDtl_rsrc_cd2_NX(info);
		else if (nx == columnDtl_rsrc_nm2) doDtl_rsrc_nm2_NX(info);
		else if (nx == columnDtl_rsrc_unit_nm2) doDtl_rsrc_unit_nm2_NX(info);
		else if (nx == columnDtl_rsrc_std_qty2) doDtl_rsrc_std_qty2_NX(info);
		else if (nx == columnDtl_not_mrp_flg) doDtl_not_mrp_flg_NX(info);
		else if (nx == columnDtl_cost_ratio) doDtl_cost_ratio_NX(info);
		else if (nx == columnDtl_memo1) doDtl_memo1_NX(info);
		else if (nx == columnDtl_memo2) doDtl_memo2_NX(info);
		else if (nx == columnDtl_memo3) doDtl_memo3_NX(info);
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
	 * [Cnd]パネルの[rqst_loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_wg_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[rqst_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_loc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_loc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_loc_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_loc_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_lt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_lt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_basis_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_basis_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[accpt_insp_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_accpt_insp_lt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[buf_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_buf_lt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ord_fix_pd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ord_fix_pd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sz_day_week_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sz_day_week_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sz_day_week_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sz_day_week_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sz_week]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sz_week_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_sz_pd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_sz_pd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[max_order]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_max_order_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prio_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[order_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_order_ratio_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_issue_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_issue_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_issue_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_issue_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bkf_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bkf_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ln_stk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ln_stk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pre_po_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pre_po_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inst_rec_issue_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inst_rec_issue_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[no_mfg_aprv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_no_mfg_aprv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_lower_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_lower_yield_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_std_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_std_yield_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_upper_yield]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_upper_yield_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[po_batch_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_po_batch_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_unit_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_unit_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_std_qty1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_std_qty1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_unit_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_unit_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_std_qty2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_std_qty2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_mrp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_mrp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_ratio_NX(MCEventInfo info){
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
		else if (lc == Cnd_site_cd) doCnd_site_cd_LC(info);
		else if (lc == Cnd_site_nm) doCnd_site_nm_LC(info);
		else if (lc == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_LC(info);
		else if (lc == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_maker_cd) doCnd_maker_cd_LC(info);
		else if (lc == Cnd_maker_nm) doCnd_maker_nm_LC(info);
		else if (lc == Cnd_rqst_loc_cd) doCnd_rqst_loc_cd_LC(info);
		else if (lc == Cnd_rqst_loc_nm) doCnd_rqst_loc_nm_LC(info);
		else if (lc == Cnd_rqst_loc_wg_cd) doCnd_rqst_loc_wg_cd_LC(info);
		else if (lc == Cnd_rqst_loc_wg_nm) doCnd_rqst_loc_wg_nm_LC(info);
		else if (lc == Cnd_bom_ptn) doCnd_bom_ptn_LC(info);
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
		else if (lc == BulkSet_st_dt) doBulkSet_st_dt_LC(info);
		else if (lc == BulkSet_end_dt) doBulkSet_end_dt_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_wg_nm) doDtl_wg_nm_LC(info);
		else if (lc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_LC(info);
		else if (lc == columnDtl_asset_mng_typ) doDtl_asset_mng_typ_LC(info);
		else if (lc == columnDtl_unit_cd) doDtl_unit_cd_LC(info);
		else if (lc == columnDtl_dec_place) doDtl_dec_place_LC(info);
		else if (lc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_def_bom_ptn) doDtl_def_bom_ptn_LC(info);
		else if (lc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_LC(info);
		else if (lc == columnDtl_itm_typ) doDtl_itm_typ_LC(info);
		else if (lc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_LC(info);
		else if (lc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_mfg_loc_cd) doDtl_mfg_loc_cd_LC(info);
		else if (lc == columnDtl_mfg_loc_nm) doDtl_mfg_loc_nm_LC(info);
		else if (lc == columnDtl_site_cd) doDtl_site_cd_LC(info);
		else if (lc == columnDtl_site_nm) doDtl_site_nm_LC(info);
		else if (lc == columnDtl_sppl_cd) doDtl_sppl_cd_LC(info);
		else if (lc == columnDtl_sppl_nm) doDtl_sppl_nm_LC(info);
		else if (lc == columnDtl_maker_cd) doDtl_maker_cd_LC(info);
		else if (lc == columnDtl_maker_nm) doDtl_maker_nm_LC(info);
		else if (lc == columnDtl_rqst_loc_cd) doDtl_rqst_loc_cd_LC(info);
		else if (lc == columnDtl_rqst_loc_nm) doDtl_rqst_loc_nm_LC(info);
		else if (lc == columnDtl_rqst_loc_wg_cd) doDtl_rqst_loc_wg_cd_LC(info);
		else if (lc == columnDtl_rqst_loc_wg_nm) doDtl_rqst_loc_wg_nm_LC(info);
		else if (lc == columnDtl_loc_sppl_cd) doDtl_loc_sppl_cd_LC(info);
		else if (lc == columnDtl_bom_ptn) doDtl_bom_ptn_LC(info);
		else if (lc == columnDtl_oper_ptn) doDtl_oper_ptn_LC(info);
		else if (lc == columnDtl_mfg_lt) doDtl_mfg_lt_LC(info);
		else if (lc == columnDtl_purc_lt) doDtl_purc_lt_LC(info);
		else if (lc == columnDtl_purc_basis_typ) doDtl_purc_basis_typ_LC(info);
		else if (lc == columnDtl_purc_basis_typ_nm) doDtl_purc_basis_typ_nm_LC(info);
		else if (lc == columnDtl_accpt_insp_lt) doDtl_accpt_insp_lt_LC(info);
		else if (lc == columnDtl_buf_lt) doDtl_buf_lt_LC(info);
		else if (lc == columnDtl_ord_fix_pd) doDtl_ord_fix_pd_LC(info);
		else if (lc == columnDtl_sz_day_week_typ) doDtl_sz_day_week_typ_LC(info);
		else if (lc == columnDtl_sz_day_week_typ_nm) doDtl_sz_day_week_typ_nm_LC(info);
		else if (lc == columnDtl_sz_week) doDtl_sz_week_LC(info);
		else if (lc == columnDtl_lot_sz_pd) doDtl_lot_sz_pd_LC(info);
		else if (lc == columnDtl_base_unit_cd) doDtl_base_unit_cd_LC(info);
		else if (lc == columnDtl_base_unit_nm) doDtl_base_unit_nm_LC(info);
		else if (lc == columnDtl_max_order) doDtl_max_order_LC(info);
		else if (lc == columnDtl_prio) doDtl_prio_LC(info);
		else if (lc == columnDtl_order_ratio) doDtl_order_ratio_LC(info);
		else if (lc == columnDtl_lot_issue_typ) doDtl_lot_issue_typ_LC(info);
		else if (lc == columnDtl_lot_issue_typ_nm) doDtl_lot_issue_typ_nm_LC(info);
		else if (lc == columnDtl_itm_lower_yield) doDtl_itm_lower_yield_LC(info);
		else if (lc == columnDtl_itm_std_yield) doDtl_itm_std_yield_LC(info);
		else if (lc == columnDtl_itm_upper_yield) doDtl_itm_upper_yield_LC(info);
		else if (lc == columnDtl_purc_id_typ) doDtl_purc_id_typ_LC(info);
		else if (lc == columnDtl_purc_id_typ_nm) doDtl_purc_id_typ_nm_LC(info);
		else if (lc == columnDtl_rqst_wg_cd) doDtl_rqst_wg_cd_LC(info);
		else if (lc == columnDtl_rqst_wg_nm) doDtl_rqst_wg_nm_LC(info);
		else if (lc == columnDtl_rsrc_cd1) doDtl_rsrc_cd1_LC(info);
		else if (lc == columnDtl_rsrc_nm1) doDtl_rsrc_nm1_LC(info);
		else if (lc == columnDtl_rsrc_unit_nm1) doDtl_rsrc_unit_nm1_LC(info);
		else if (lc == columnDtl_rsrc_std_qty1) doDtl_rsrc_std_qty1_LC(info);
		else if (lc == columnDtl_rsrc_cd2) doDtl_rsrc_cd2_LC(info);
		else if (lc == columnDtl_rsrc_nm2) doDtl_rsrc_nm2_LC(info);
		else if (lc == columnDtl_rsrc_unit_nm2) doDtl_rsrc_unit_nm2_LC(info);
		else if (lc == columnDtl_rsrc_std_qty2) doDtl_rsrc_std_qty2_LC(info);
		else if (lc == columnDtl_cost_ratio) doDtl_cost_ratio_LC(info);
		else if (lc == columnDtl_memo1) doDtl_memo1_LC(info);
		else if (lc == columnDtl_memo2) doDtl_memo2_LC(info);
		else if (lc == columnDtl_memo3) doDtl_memo3_LC(info);
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
	 * [Cnd]パネルの[rqst_loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_wg_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[def_bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_def_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_site_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[rqst_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_loc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_loc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_loc_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_loc_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mfg_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mfg_lt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_lt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_basis_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_basis_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[accpt_insp_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_accpt_insp_lt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[buf_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_buf_lt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ord_fix_pd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ord_fix_pd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sz_day_week_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sz_day_week_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sz_day_week_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sz_day_week_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sz_week]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sz_week_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_sz_pd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_sz_pd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[max_order]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_max_order_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prio_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[order_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_order_ratio_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_issue_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_issue_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_issue_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_issue_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_lower_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_lower_yield_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_std_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_std_yield_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_upper_yield]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_upper_yield_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rqst_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rqst_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_unit_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_unit_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_std_qty1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_std_qty1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_unit_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_unit_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsrc_std_qty2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsrc_std_qty2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_ratio_LC(MCEventInfo info){
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
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgOrSlsWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_site_cd]の作成メソッド
	 */
	public MCList getCnd_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
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
	 * コンボ／リストのリスト[Cnd_maker_cd]の作成メソッド
	 */
	public MCList getCnd_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_loc_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_loc_wg_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_loc_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
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
	 * コンボ／リストのリスト[columnDtl_wg_cd]の作成メソッド
	 */
	public MCList getDtl_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgOrSlsWg(row, info);
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
	 * コンボ／リストのリスト[columnDtl_mfg_loc_cd]の作成メソッド
	 */
	public MCList getDtl_mfg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
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
	 * コンボ／リストのリスト[columnDtl_rqst_loc_cd]の作成メソッド
	 */
	public MCList getDtl_rqst_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bom_ptn]の作成メソッド
	 */
	public MCList getDtl_bom_ptn(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBomPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_oper_ptn]の作成メソッド
	 */
	public MCList getDtl_oper_ptn(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmOper(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_purc_basis_typ]の作成メソッド
	 */
	public MCList getDtl_purc_basis_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcBasisTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sz_day_week_typ]の作成メソッド
	 */
	public MCList getDtl_sz_day_week_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDayWeekTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_lot_issue_typ]の作成メソッド
	 */
	public MCList getDtl_lot_issue_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLotIssueTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_purc_id_typ]の作成メソッド
	 */
	public MCList getDtl_purc_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_rqst_wg_cd]の作成メソッド
	 */
	public MCList getDtl_rqst_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_rsrc_cd1]の作成メソッド
	 */
	public MCList getDtl_rsrc_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRsrc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_rsrc_cd2]の作成メソッド
	 */
	public MCList getDtl_rsrc_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRsrc(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABSL0010.Srch01")) {
			return new MA_MABSL0010_Srch01Bridge();
		}
		if (id.equals("MA.MABSL0010.Sprt01")) {
			return new MA_MABSL0010_Sprt01Bridge();
		}
		if (id.equals("MA.MABSL0010.Upd01")) {
			return new MA_MABSL0010_Upd01Bridge();
		}
		if (id.equals("MA.MABSL0010.Del01")) {
			return new MA_MABSL0010_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABSL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0010_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0010_Srch01;

		/** コンストラクタ */
		protected MA_MABSL0010_Srch01Bridge() {
			p_MA_MABSL0010_Srch01 = new MCParam(PDef.MA_MABSL0010_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0010_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABS.MABSP0010.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0010.DtlR.class));

			p_MA_MABSL0010_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0010_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0010_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0010_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0010_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABS.MABSP0010.CndR up0() {
			return (mcframe.clientMABS.MABSP0010.CndR)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP0010.DtlR> down0() {
			return (MCList<mcframe.clientMABS.MABSP0010.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABSL0010_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0010.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL0010_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABS.MABSP0010.DtlR>)p_MA_MABSL0010_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABSL0010_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0010_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0010_Sprt01;

		/** コンストラクタ */
		protected MA_MABSL0010_Sprt01Bridge() {
			p_MA_MABSL0010_Sprt01 = new MCParam(PDef.MA_MABSL0010_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0010_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0010.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0010.DtlR.class));

			p_MA_MABSL0010_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0010_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0010_Sprt01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0010_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0010_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0010.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0010.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP0010.DtlR> down0() {
			return (MCList<mcframe.clientMABS.MABSP0010.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABSL0010_Sprt01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0010.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL0010_Sprt01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABS.MABSP0010.DtlR>)p_MA_MABSL0010_Sprt01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABSL0010_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0010_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0010_Upd01;

		/** コンストラクタ */
		protected MA_MABSL0010_Upd01Bridge() {
			p_MA_MABSL0010_Upd01 = new MCParam(PDef.MA_MABSL0010_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0010_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0010.DtlR.class));
			// Down

			p_MA_MABSL0010_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0010_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0010_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0010_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0010_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0010.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0010.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL0010_Upd01;
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
	 * [MA_MABSL0010_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0010_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0010_Del01;

		/** コンストラクタ */
		protected MA_MABSL0010_Del01Bridge() {
			p_MA_MABSL0010_Del01 = new MCParam(PDef.MA_MABSL0010_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0010_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0010.DtlR.class));
			// Down

			p_MA_MABSL0010_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0010_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0010_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0010_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0010_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0010.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0010.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL0010_Del01;
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