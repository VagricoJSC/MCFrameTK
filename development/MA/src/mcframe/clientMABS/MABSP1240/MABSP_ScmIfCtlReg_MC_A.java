package mcframe.clientMABS.MABSP1240;

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
import mcframe.clientMABS.MABSP1240.MABSP_ScmIfCtlReg_MC.MA_MABSL1240_Srch01Caller;
import mcframe.clientMABS.MABSP1240.MABSP_ScmIfCtlReg_MC.MA_MABSL1240_Sprt01Caller;
import mcframe.clientMABS.MABSP1240.MABSP_ScmIfCtlReg_MC.MA_MABSL1240_Upd01Caller;
import mcframe.clientMABS.MABSP1240.MABSP_ScmIfCtlReg_MC.MA_MABSL1240_Del01Caller;

/**
 * 画面"MABSP_ScmIfCtlReg"パネルクラスです。<p>
 *
 * ＳＣＭ ＩＦ制御マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSP_ScmIfCtlReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABSP1240";

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
	public mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H Cnd_dt_p_PPanel;
	public MCDateField Cnd_st_dt_fr;	// [Cnd]の[dt_p.st_dt_fr]を[Cnd_st_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_st_dt_to;	// [Cnd]の[dt_p.st_dt_to]を[Cnd_st_dt_to]としてエイリアス定義。
	public MCDateField Cnd_end_dt_fr;	// [Cnd]の[dt_p.end_dt_fr]を[Cnd_end_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_end_dt_to;	// [Cnd]の[dt_p.end_dt_to]を[Cnd_end_dt_to]としてエイリアス定義。
	public MCLabel Cnd_if_proc_typ_Label = null;
	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_if_proc_typ = null;
	/**
	 * IF process type name ＩＦ処理区分名.<p>
	 *
	 */
	public MCTextField Cnd_if_proc_typ_nm = null;
	public MCLabel Cnd_loc_cd_Label = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCTextField Cnd_loc_nm = null;
	public MCLabel Cnd_lg_grp_cd_Label = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCTextField Cnd_lg_grp_nm = null;
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
	public MCLabel Cnd_wk_cost_cd_Label = null;
	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wk_cost_cd = null;
	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public MCTextField Cnd_wk_cost_nm = null;
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
	public MCLabel Cnd_gr_loc_cd_Label = null;
	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_gr_loc_cd = null;
	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public MCTextField Cnd_gr_loc_nm = null;
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
	public MCTable2<mcframe.clientMABS.MABSP1240.DtlR> DtlTable = null;
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
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_if_proc_typ = null;
	/**
	 * IF process type name ＩＦ処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_if_proc_typ_nm = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_nm = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lg_grp_nm = null;
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
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wk_cost_cd = null;
	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wk_cost_nm = null;
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
	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gr_loc_cd = null;
	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gr_loc_nm = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Dtl_dt_p_PPanel;
	public MCColumnConfig columnDtl_st_dt_key;// [Dtl]の[dt_p.st_dt_key]を[columnDtl_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnDtl_st_dt;// [Dtl]の[dt_p.st_dt]を[columnDtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_end_dt;// [Dtl]の[dt_p.end_dt]を[columnDtl_end_dt]としてエイリアス定義。
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_nm = null;
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
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Correct overlapping period 重複期間補正.<p>
	 *
	 */
	public MCButton Btn_correct_dup_dt = null;
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
	
	/** [MA_MABSL1240_Srch01]のCallerの作成 */
	protected MABSP_ScmIfCtlReg_MC.MA_MABSL1240_Srch01Caller createMA_MABSL1240_Srch01() {
		MABSP_ScmIfCtlReg_MC.MA_MABSL1240_Srch01Caller<MABSP_ScmIfCtlReg, MA_MABSL1240_Srch01Bridge>
		caller = ((MABSP_ScmIfCtlReg_MC)this).new MA_MABSL1240_Srch01Caller<MABSP_ScmIfCtlReg, MA_MABSL1240_Srch01Bridge>(
					(MABSP_ScmIfCtlReg)this, new MA_MABSL1240_Srch01Bridge());
		return caller;
	}
	/** [MA_MABSL1240_Srch01]の呼び出し */
	protected void callMA_MABSL1240_Srch01() {
		MCCaller caller = createMA_MABSL1240_Srch01();
		caller.exec();
	}
	/** [MA_MABSL1240_Sprt01]のCallerの作成 */
	protected MABSP_ScmIfCtlReg_MC.MA_MABSL1240_Sprt01Caller createMA_MABSL1240_Sprt01() {
		MABSP_ScmIfCtlReg_MC.MA_MABSL1240_Sprt01Caller<MABSP_ScmIfCtlReg, MA_MABSL1240_Sprt01Bridge>
		caller = ((MABSP_ScmIfCtlReg_MC)this).new MA_MABSL1240_Sprt01Caller<MABSP_ScmIfCtlReg, MA_MABSL1240_Sprt01Bridge>(
					(MABSP_ScmIfCtlReg)this, new MA_MABSL1240_Sprt01Bridge());
		return caller;
	}
	/** [MA_MABSL1240_Sprt01]の呼び出し */
	protected void callMA_MABSL1240_Sprt01() {
		MCCaller caller = createMA_MABSL1240_Sprt01();
		caller.exec();
	}
	/** [MA_MABSL1240_Upd01]のCallerの作成 */
	protected MABSP_ScmIfCtlReg_MC.MA_MABSL1240_Upd01Caller createMA_MABSL1240_Upd01() {
		MABSP_ScmIfCtlReg_MC.MA_MABSL1240_Upd01Caller<MABSP_ScmIfCtlReg, MA_MABSL1240_Upd01Bridge>
		caller = ((MABSP_ScmIfCtlReg_MC)this).new MA_MABSL1240_Upd01Caller<MABSP_ScmIfCtlReg, MA_MABSL1240_Upd01Bridge>(
					(MABSP_ScmIfCtlReg)this, new MA_MABSL1240_Upd01Bridge());
		return caller;
	}
	/** [MA_MABSL1240_Upd01]の呼び出し */
	protected void callMA_MABSL1240_Upd01() {
		MCCaller caller = createMA_MABSL1240_Upd01();
		caller.exec();
	}
	/** [MA_MABSL1240_Del01]のCallerの作成 */
	protected MABSP_ScmIfCtlReg_MC.MA_MABSL1240_Del01Caller createMA_MABSL1240_Del01() {
		MABSP_ScmIfCtlReg_MC.MA_MABSL1240_Del01Caller<MABSP_ScmIfCtlReg, MA_MABSL1240_Del01Bridge>
		caller = ((MABSP_ScmIfCtlReg_MC)this).new MA_MABSL1240_Del01Caller<MABSP_ScmIfCtlReg, MA_MABSL1240_Del01Bridge>(
					(MABSP_ScmIfCtlReg)this, new MA_MABSL1240_Del01Bridge());
		return caller;
	}
	/** [MA_MABSL1240_Del01]の呼び出し */
	protected void callMA_MABSL1240_Del01() {
		MCCaller caller = createMA_MABSL1240_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP1240.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP1240.BulkSetR aBulkSetR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1240.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABS.MABSP1240.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP1240.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP1240.CndR createCndR() {
		return mcframe.clientMABS.MABSP1240.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMABS.MABSP1240.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABS.MABSP1240.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABS.MABSP1240.BulkSetR createBulkSetR() {
		return mcframe.clientMABS.MABSP1240.BulkSetR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABS.MABSP1240.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1240.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABS.MABSP1240.DtlR createDtlR() {
		return mcframe.clientMABS.MABSP1240.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1240.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABS.MABSP1240.DtlR.class);
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndTabPanel);
		ret.add(CndPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(CtrlPanel);
		ret.add(BulkSetPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_ScmIfCtlReg_MC_A() {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABSP_ScmIfCtlReg_MC_A(String name) {
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
		MABSP_ScmIfCtlReg_MC.jbCreateScreenOpe((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbCreateTop((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbCreateFold((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbCreateCndTab((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbCreateCnd((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbCreateTab1((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbCreateTab2((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbCreateTab3((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbCreateCtrl((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbCreateBulkSet((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbCreateDtl((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbCreateBtn((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbCreateEastBtn((MABSP_ScmIfCtlReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABSP_ScmIfCtlReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABSP_ScmIfCtlReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABSP_ScmIfCtlReg p) {
	}

	/**
	 * [CndTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCndTab(MABSP_ScmIfCtlReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABSP_ScmIfCtlReg p) {
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
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MABSP_ScmIfCtlReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MABSP_ScmIfCtlReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MABSP_ScmIfCtlReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABSP_ScmIfCtlReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MABSP_ScmIfCtlReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABSP_ScmIfCtlReg p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP1240.DtlR.$itm_p);
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
		p.Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP1240.DtlR.$dt_p);
		p.Dtl_dt_p_PPanel.setName("Dtl.dt_p");
		p.columnDtl_st_dt_key = p.Dtl_dt_p_PPanel.columnDt_st_dt_key;
		p.columnDtl_st_dt_key.addAliasName("Dtl.st_dt_key", p);
		p.columnDtl_st_dt = p.Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnDtl_st_dt.addAliasName("Dtl.st_dt", p);
		p.columnDtl_end_dt = p.Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnDtl_end_dt.addAliasName("Dtl.end_dt", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABSP_ScmIfCtlReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABSP_ScmIfCtlReg p) {
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

	
	/** [Cnd_if_proc_typ_ListPutter]の定義 */
	private MCListPutter Cnd_if_proc_typ_p = null;

	/**
	 * [Cnd_if_proc_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_if_proc_typ_ListPutter() {
		if (Cnd_if_proc_typ_p == null) {
			Cnd_if_proc_typ_p = createCnd_if_proc_typ_ListPutter(Cnd_if_proc_typ, "if_proc_typ", "if_proc_typ_nm");

		}
		return Cnd_if_proc_typ_p;
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
	
	
	/** [Cnd_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_lg_grp_cd_p = null;

	/**
	 * [Cnd_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_lg_grp_cd_ListPutter() {
		if (Cnd_lg_grp_cd_p == null) {
			Cnd_lg_grp_cd_p = createCnd_lg_grp_cd_ListPutter(Cnd_lg_grp_cd, "lg_grp_cd", "lg_grp_nm");

		}
		return Cnd_lg_grp_cd_p;
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
	
	
	/** [Cnd_wk_cost_cd_ListPutter]の定義 */
	private MCListPutter Cnd_wk_cost_cd_p = null;

	/**
	 * [Cnd_wk_cost_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wk_cost_cd_ListPutter() {
		if (Cnd_wk_cost_cd_p == null) {
			Cnd_wk_cost_cd_p = createCnd_wk_cost_cd_ListPutter(Cnd_wk_cost_cd, "wk_cost_cd", "wk_cost_nm");

		}
		return Cnd_wk_cost_cd_p;
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
	
	
	/** [Cnd_gr_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gr_loc_cd_p = null;

	/**
	 * [Cnd_gr_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gr_loc_cd_ListPutter() {
		if (Cnd_gr_loc_cd_p == null) {
			Cnd_gr_loc_cd_p = createCnd_gr_loc_cd_ListPutter(Cnd_gr_loc_cd, "gr_loc_cd", "gr_loc_nm");

		}
		return Cnd_gr_loc_cd_p;
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
	
	
	/** [Dtl_if_proc_typ_ListPutter]の定義 */
	private MCListPutter Dtl_if_proc_typ_p = null;

	/**
	 * [Dtl_if_proc_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_if_proc_typ_ListPutter() {
		if (Dtl_if_proc_typ_p == null) {
			Dtl_if_proc_typ_p = createDtl_if_proc_typ_ListPutter(columnDtl_if_proc_typ, "if_proc_typ", "if_proc_typ_nm");

		}
		return Dtl_if_proc_typ_p;
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
	
	
	/** [Dtl_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_lg_grp_cd_p = null;

	/**
	 * [Dtl_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_lg_grp_cd_ListPutter() {
		if (Dtl_lg_grp_cd_p == null) {
			Dtl_lg_grp_cd_p = createDtl_lg_grp_cd_ListPutter(columnDtl_lg_grp_cd, "lg_grp_cd", "lg_grp_nm");

		}
		return Dtl_lg_grp_cd_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_cd_p = createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_sub1","itm_sub2","itm_sub3","itm_nm","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_sub2","itm_sub3","itm_nm","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_sub3","itm_nm","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","itm_typ","itm_typ_nm","itm_typ_d_cd","itm_typ_d_nm");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub3_p;
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
	
	
	/** [Dtl_wk_cost_cd_ListPutter]の定義 */
	private MCListPutter Dtl_wk_cost_cd_p = null;

	/**
	 * [Dtl_wk_cost_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_wk_cost_cd_ListPutter() {
		if (Dtl_wk_cost_cd_p == null) {
			Dtl_wk_cost_cd_p = createDtl_wk_cost_cd_ListPutter(columnDtl_wk_cost_cd, "wk_cost_cd", "wk_cost_nm");

		}
		return Dtl_wk_cost_cd_p;
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
	
	
	/** [Dtl_gr_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl_gr_loc_cd_p = null;

	/**
	 * [Dtl_gr_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_gr_loc_cd_ListPutter() {
		if (Dtl_gr_loc_cd_p == null) {
			Dtl_gr_loc_cd_p = createDtl_gr_loc_cd_ListPutter(columnDtl_gr_loc_cd, "gr_loc_cd", "gr_loc_nm");

		}
		return Dtl_gr_loc_cd_p;
	}
	
	
	/** [Dtl_ext_sys_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ext_sys_cd_p = null;

	/**
	 * [Dtl_ext_sys_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ext_sys_cd_ListPutter() {
		if (Dtl_ext_sys_cd_p == null) {
			Dtl_ext_sys_cd_p = createDtl_ext_sys_cd_ListPutter(columnDtl_ext_sys_cd, "ext_sys_cd", "ext_sys_nm");

		}
		return Dtl_ext_sys_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_ScmIfCtlReg create(){
		MABSP_ScmIfCtlReg p = new MABSP_ScmIfCtlReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_ScmIfCtlReg create(String name){
		MABSP_ScmIfCtlReg p = new MABSP_ScmIfCtlReg(name);
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
		MABSP_ScmIfCtlReg_MC.jbfInitScreenOpe((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbfInitTop((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbfInitFold((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbfInitCndTab((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbfInitCnd((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbfInitTab1((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbfInitTab2((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbfInitTab3((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbfInitCtrl((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbfInitBulkSet((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbfInitDtl((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbfInitBtn((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbfInitEastBtn((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbInitScreenOpe((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbInitTop((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbInitFold((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbInitCndTab((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbInitCnd((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbInitTab1((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbInitTab2((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbInitTab3((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbInitCtrl((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbInitBulkSet((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbInitDtl((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbInitBtn((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.jbInitEastBtn((MABSP_ScmIfCtlReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABSP_ScmIfCtlReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABSP_ScmIfCtlReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABSP_ScmIfCtlReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCndTab(MABSP_ScmIfCtlReg p) {
		// ブロック関連の初期化
		p.CndTabPanel = p.beansFactory.createPanel("CndTab");
		p.CndTabTab = p.beansFactory.createTabbedPane("CndTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABSP_ScmIfCtlReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_if_proc_typ_Label = p.beansFactory.createLabel("Cnd.if_proc_typ_Label");
		p.Cnd_if_proc_typ = p.beansFactory.createTextComboBox("Cnd.if_proc_typ");
		p.Cnd_if_proc_typ.setLabel(p.Cnd_if_proc_typ_Label);
		p.Cnd_if_proc_typ_nm = p.beansFactory.createTextField("Cnd.if_proc_typ_nm");
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextField("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
		p.Cnd_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.lg_grp_cd_Label");
		p.Cnd_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.lg_grp_cd");
		p.Cnd_lg_grp_cd.setLabel(p.Cnd_lg_grp_cd_Label);
		p.Cnd_lg_grp_nm = p.beansFactory.createTextField("Cnd.lg_grp_nm");
		p.Cnd_oper_cd_Label = p.beansFactory.createLabel("Cnd.oper_cd_Label");
		p.Cnd_oper_cd = p.beansFactory.createTextComboBox("Cnd.oper_cd");
		p.Cnd_oper_cd.setLabel(p.Cnd_oper_cd_Label);
		p.Cnd_oper_nm = p.beansFactory.createTextField("Cnd.oper_nm");
		p.Cnd_wk_cost_cd_Label = p.beansFactory.createLabel("Cnd.wk_cost_cd_Label");
		p.Cnd_wk_cost_cd = p.beansFactory.createTextComboBox("Cnd.wk_cost_cd");
		p.Cnd_wk_cost_cd.setLabel(p.Cnd_wk_cost_cd_Label);
		p.Cnd_wk_cost_nm = p.beansFactory.createTextField("Cnd.wk_cost_nm");
		p.Cnd_dlv_cd_Label = p.beansFactory.createLabel("Cnd.dlv_cd_Label");
		p.Cnd_dlv_cd = p.beansFactory.createTextField("Cnd.dlv_cd");
		p.Cnd_dlv_cd.setLabel(p.Cnd_dlv_cd_Label);
		p.Cnd_dlv_nm = p.beansFactory.createTextField("Cnd.dlv_nm");
		p.Cnd_gr_loc_cd_Label = p.beansFactory.createLabel("Cnd.gr_loc_cd_Label");
		p.Cnd_gr_loc_cd = p.beansFactory.createTextField("Cnd.gr_loc_cd");
		p.Cnd_gr_loc_cd.setLabel(p.Cnd_gr_loc_cd_Label);
		p.Cnd_gr_loc_nm = p.beansFactory.createTextField("Cnd.gr_loc_nm");
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
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MABSP_ScmIfCtlReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MABSP_ScmIfCtlReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MABSP_ScmIfCtlReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABSP_ScmIfCtlReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MABSP_ScmIfCtlReg p) {
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
	protected static void jbfInitDtl(MABSP_ScmIfCtlReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_if_proc_typ = p.beansFactory.createTableColumn("Dtl.if_proc_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_if_proc_typ_nm = p.beansFactory.createTableColumn("Dtl.if_proc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_loc_cd = p.beansFactory.createTableColumn("Dtl.loc_cd", MCColumnType.TEXT);
		p.columnDtl_loc_nm = p.beansFactory.createTableColumn("Dtl.loc_nm", MCColumnType.TEXT);
		p.columnDtl_lg_grp_cd = p.beansFactory.createTableColumn("Dtl.lg_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_lg_grp_nm = p.beansFactory.createTableColumn("Dtl.lg_grp_nm", MCColumnType.TEXT);
		p.columnDtl_itm_typ = p.beansFactory.createTableColumn("Dtl.itm_typ", MCColumnType.TEXT);
		p.columnDtl_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDtl_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_oper_cd = p.beansFactory.createTableColumn("Dtl.oper_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_oper_nm = p.beansFactory.createTableColumn("Dtl.oper_nm", MCColumnType.TEXT);
		p.columnDtl_wk_cost_cd = p.beansFactory.createTableColumn("Dtl.wk_cost_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_wk_cost_nm = p.beansFactory.createTableColumn("Dtl.wk_cost_nm", MCColumnType.TEXT);
		p.columnDtl_dlv_cd = p.beansFactory.createTableColumn("Dtl.dlv_cd", MCColumnType.TEXT);
		p.columnDtl_dlv_nm = p.beansFactory.createTableColumn("Dtl.dlv_nm", MCColumnType.TEXT);
		p.columnDtl_gr_loc_cd = p.beansFactory.createTableColumn("Dtl.gr_loc_cd", MCColumnType.TEXT);
		p.columnDtl_gr_loc_nm = p.beansFactory.createTableColumn("Dtl.gr_loc_nm", MCColumnType.TEXT);
		p.columnDtl_ext_sys_cd = p.beansFactory.createTableColumn("Dtl.ext_sys_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ext_sys_nm = p.beansFactory.createTableColumn("Dtl.ext_sys_nm", MCColumnType.TEXT);
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
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABSP_ScmIfCtlReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_correct_dup_dt = p.beansFactory.createButton("Btn.correct_dup_dt");
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
	protected static void jbfInitEastBtn(MABSP_ScmIfCtlReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABSP_ScmIfCtlReg p) {
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
	protected static void jbInitTop(MABSP_ScmIfCtlReg p) {
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
	protected static void jbInitFold(MABSP_ScmIfCtlReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndTabPanel, null);
		p.FoldPanel.setLastBeans(p.CndTabPanel);
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCndTab(MABSP_ScmIfCtlReg p) {
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
	protected static void jbInitCnd(MABSP_ScmIfCtlReg p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.BulkSetPanel);
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.ope_META);
		p.Tab1Panel.add(p.Cnd_dt_p_PPanel);
		p.Tab1Panel.setLastBeans(p.Cnd_dt_p_PPanel);
		p.Cnd_dt_p_PPanel.setNextBeans(p.Cnd_if_proc_typ);
		p.Cnd_if_proc_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_if_proc_typ, true);
		p.Cnd_if_proc_typ.setLinkBeans(p.Cnd_if_proc_typ_nm);
		p.Tab1Panel.add(p.Cnd_if_proc_typ_Label);
		p.Tab1Panel.add(p.Cnd_if_proc_typ);
		p.Cnd_if_proc_typ.setNextBeans(p.Cnd_if_proc_typ_nm);
		p.Cnd_if_proc_typ.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.if_proc_typ_META);
		p.Tab1Panel.add(p.Cnd_if_proc_typ_nm);
		p.Cnd_if_proc_typ_nm.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_if_proc_typ_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.if_proc_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_if_proc_typ_nm, true);
		p.Tab1Panel.add(p.Cnd_loc_cd_Label);
		p.Tab1Panel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.Tab1Panel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_lg_grp_cd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.Cnd_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lg_grp_cd, true);
		p.Cnd_lg_grp_cd.setLinkBeans(p.Cnd_lg_grp_nm);
		p.Tab1Panel.add(p.Cnd_lg_grp_cd_Label);
		p.Tab1Panel.add(p.Cnd_lg_grp_cd);
		p.Cnd_lg_grp_cd.setNextBeans(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.lg_grp_cd_META);
		p.Tab1Panel.add(p.Cnd_lg_grp_nm);
		p.Cnd_lg_grp_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_lg_grp_nm, true);
		p.Tab1Panel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Tab1Panel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_oper_cd);
		p.Cnd_oper_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_oper_cd, true);
		p.Cnd_oper_cd.setLinkBeans(p.Cnd_oper_nm);
		p.Tab1Panel.add(p.Cnd_oper_cd_Label);
		p.Tab1Panel.add(p.Cnd_oper_cd);
		p.Cnd_oper_cd.setNextBeans(p.Cnd_oper_nm);
		p.Cnd_oper_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.oper_cd_META);
		p.Tab1Panel.add(p.Cnd_oper_nm);
		p.Cnd_oper_nm.setNextBeans(p.Cnd_wk_cost_cd);
		p.Cnd_oper_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.oper_nm_META);
		p.setPluralValueEnable(p.Cnd_oper_nm, true);
		p.Cnd_wk_cost_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wk_cost_cd, true);
		p.Cnd_wk_cost_cd.setLinkBeans(p.Cnd_wk_cost_nm);
		p.Tab1Panel.add(p.Cnd_wk_cost_cd_Label);
		p.Tab1Panel.add(p.Cnd_wk_cost_cd);
		p.Cnd_wk_cost_cd.setNextBeans(p.Cnd_wk_cost_nm);
		p.Cnd_wk_cost_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.wk_cost_cd_META);
		p.Tab1Panel.add(p.Cnd_wk_cost_nm);
		p.Cnd_wk_cost_nm.setNextBeans(p.Cnd_dlv_cd);
		p.Cnd_wk_cost_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.wk_cost_nm_META);
		p.setPluralValueEnable(p.Cnd_wk_cost_nm, true);
		p.Tab1Panel.add(p.Cnd_dlv_cd_Label);
		p.Tab1Panel.add(p.Cnd_dlv_cd);
		p.Cnd_dlv_cd.setNextBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_cd_META);
		p.Cnd_dlv_cd.addLinkBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_cd, true);
		p.Tab1Panel.add(p.Cnd_dlv_nm);
		p.Cnd_dlv_nm.setNextBeans(p.Cnd_gr_loc_cd);
		p.Cnd_dlv_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_nm, true);
		p.Tab1Panel.add(p.Cnd_gr_loc_cd_Label);
		p.Tab1Panel.add(p.Cnd_gr_loc_cd);
		p.Cnd_gr_loc_cd.setNextBeans(p.Cnd_gr_loc_nm);
		p.Cnd_gr_loc_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.gr_loc_cd_META);
		p.Cnd_gr_loc_cd.addLinkBeans(p.Cnd_gr_loc_nm);
		p.Cnd_gr_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gr_loc_cd, true);
		p.Tab1Panel.add(p.Cnd_gr_loc_nm);
		p.Cnd_gr_loc_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_gr_loc_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.gr_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_gr_loc_nm, true);
		p.Tab1Panel.add(p.Cnd_memo1_Label);
		p.Tab1Panel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.Tab1Panel.add(p.Cnd_memo2_Label);
		p.Tab1Panel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.Tab1Panel.add(p.Cnd_memo3_Label);
		p.Tab1Panel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.Tab1Panel.add(p.Cnd_del_flg_lab);
		p.Tab1Panel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.off_del_flg_META);
		p.Tab1Panel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.on_del_flg_META);
		p.Cnd_itm_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd1, true);
		p.Cnd_itm_grp_cd1.setLinkBeans(p.Cnd_itm_grp_nm1);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd1_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd1);
		p.Tab2Panel.setLastBeans(p.Cnd_itm_grp_cd1);
		p.Cnd_itm_grp_cd1.setNextBeans(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_cd1.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.itm_grp_cd1_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm1);
		p.Cnd_itm_grp_nm1.setNextBeans(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_nm1.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.itm_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm1, true);
		p.Cnd_itm_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd2, true);
		p.Cnd_itm_grp_cd2.setLinkBeans(p.Cnd_itm_grp_nm2);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd2_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd2);
		p.Cnd_itm_grp_cd2.setNextBeans(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_cd2.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.itm_grp_cd2_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm2);
		p.Cnd_itm_grp_nm2.setNextBeans(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_nm2.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.itm_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm2, true);
		p.Cnd_itm_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd3, true);
		p.Cnd_itm_grp_cd3.setLinkBeans(p.Cnd_itm_grp_nm3);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd3_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd3);
		p.Cnd_itm_grp_cd3.setNextBeans(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_cd3.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.itm_grp_cd3_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm3);
		p.Cnd_itm_grp_nm3.setNextBeans(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_nm3.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.itm_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm3, true);
		p.Cnd_itm_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd4, true);
		p.Cnd_itm_grp_cd4.setLinkBeans(p.Cnd_itm_grp_nm4);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd4_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd4);
		p.Cnd_itm_grp_cd4.setNextBeans(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_cd4.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.itm_grp_cd4_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm4);
		p.Cnd_itm_grp_nm4.setNextBeans(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_nm4.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.itm_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm4, true);
		p.Cnd_itm_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd5, true);
		p.Cnd_itm_grp_cd5.setLinkBeans(p.Cnd_itm_grp_nm5);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd5_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd5);
		p.Cnd_itm_grp_cd5.setNextBeans(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_cd5.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.itm_grp_cd5_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm5);
		p.Cnd_itm_grp_nm5.setNextBeans(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_nm5.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.itm_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm5, true);
		p.Cnd_itm_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd6, true);
		p.Cnd_itm_grp_cd6.setLinkBeans(p.Cnd_itm_grp_nm6);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd6_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd6);
		p.Cnd_itm_grp_cd6.setNextBeans(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_cd6.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.itm_grp_cd6_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm6);
		p.Cnd_itm_grp_nm6.setNextBeans(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_nm6.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.itm_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm6, true);
		p.Cnd_itm_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd7, true);
		p.Cnd_itm_grp_cd7.setLinkBeans(p.Cnd_itm_grp_nm7);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd7_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd7);
		p.Cnd_itm_grp_cd7.setNextBeans(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_cd7.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.itm_grp_cd7_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm7);
		p.Cnd_itm_grp_nm7.setNextBeans(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_nm7.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.itm_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm7, true);
		p.Cnd_itm_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd8, true);
		p.Cnd_itm_grp_cd8.setLinkBeans(p.Cnd_itm_grp_nm8);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd8_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd8);
		p.Cnd_itm_grp_cd8.setNextBeans(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_cd8.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.itm_grp_cd8_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm8);
		p.Cnd_itm_grp_nm8.setNextBeans(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_nm8.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.itm_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm8, true);
		p.Cnd_itm_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd9, true);
		p.Cnd_itm_grp_cd9.setLinkBeans(p.Cnd_itm_grp_nm9);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd9_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd9);
		p.Cnd_itm_grp_cd9.setNextBeans(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_cd9.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.itm_grp_cd9_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm9);
		p.Cnd_itm_grp_nm9.setNextBeans(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_nm9.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.itm_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm9, true);
		p.Cnd_itm_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_grp_cd10, true);
		p.Cnd_itm_grp_cd10.setLinkBeans(p.Cnd_itm_grp_nm10);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd10_Label);
		p.Tab2Panel.add(p.Cnd_itm_grp_cd10);
		p.Cnd_itm_grp_cd10.setNextBeans(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_cd10.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.itm_grp_cd10_META);
		p.Tab2Panel.add(p.Cnd_itm_grp_nm10);
		p.Cnd_itm_grp_nm10.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.itm_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_itm_grp_nm10, true);
		p.Cnd_dlv_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd1, true);
		p.Cnd_dlv_grp_cd1.setLinkBeans(p.Cnd_dlv_grp_nm1);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd1_Label);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd1);
		p.Tab3Panel.setLastBeans(p.Cnd_dlv_grp_cd1);
		p.Cnd_dlv_grp_cd1.setNextBeans(p.Cnd_dlv_grp_nm1);
		p.Cnd_dlv_grp_cd1.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_grp_cd1_META);
		p.Tab3Panel.add(p.Cnd_dlv_grp_nm1);
		p.Cnd_dlv_grp_nm1.setNextBeans(p.Cnd_dlv_grp_cd2);
		p.Cnd_dlv_grp_nm1.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm1, true);
		p.Cnd_dlv_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd2, true);
		p.Cnd_dlv_grp_cd2.setLinkBeans(p.Cnd_dlv_grp_nm2);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd2_Label);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd2);
		p.Cnd_dlv_grp_cd2.setNextBeans(p.Cnd_dlv_grp_nm2);
		p.Cnd_dlv_grp_cd2.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_grp_cd2_META);
		p.Tab3Panel.add(p.Cnd_dlv_grp_nm2);
		p.Cnd_dlv_grp_nm2.setNextBeans(p.Cnd_dlv_grp_cd3);
		p.Cnd_dlv_grp_nm2.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm2, true);
		p.Cnd_dlv_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd3, true);
		p.Cnd_dlv_grp_cd3.setLinkBeans(p.Cnd_dlv_grp_nm3);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd3_Label);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd3);
		p.Cnd_dlv_grp_cd3.setNextBeans(p.Cnd_dlv_grp_nm3);
		p.Cnd_dlv_grp_cd3.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_grp_cd3_META);
		p.Tab3Panel.add(p.Cnd_dlv_grp_nm3);
		p.Cnd_dlv_grp_nm3.setNextBeans(p.Cnd_dlv_grp_cd4);
		p.Cnd_dlv_grp_nm3.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm3, true);
		p.Cnd_dlv_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd4, true);
		p.Cnd_dlv_grp_cd4.setLinkBeans(p.Cnd_dlv_grp_nm4);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd4_Label);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd4);
		p.Cnd_dlv_grp_cd4.setNextBeans(p.Cnd_dlv_grp_nm4);
		p.Cnd_dlv_grp_cd4.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_grp_cd4_META);
		p.Tab3Panel.add(p.Cnd_dlv_grp_nm4);
		p.Cnd_dlv_grp_nm4.setNextBeans(p.Cnd_dlv_grp_cd5);
		p.Cnd_dlv_grp_nm4.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm4, true);
		p.Cnd_dlv_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd5, true);
		p.Cnd_dlv_grp_cd5.setLinkBeans(p.Cnd_dlv_grp_nm5);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd5_Label);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd5);
		p.Cnd_dlv_grp_cd5.setNextBeans(p.Cnd_dlv_grp_nm5);
		p.Cnd_dlv_grp_cd5.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_grp_cd5_META);
		p.Tab3Panel.add(p.Cnd_dlv_grp_nm5);
		p.Cnd_dlv_grp_nm5.setNextBeans(p.Cnd_dlv_grp_cd6);
		p.Cnd_dlv_grp_nm5.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm5, true);
		p.Cnd_dlv_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd6, true);
		p.Cnd_dlv_grp_cd6.setLinkBeans(p.Cnd_dlv_grp_nm6);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd6_Label);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd6);
		p.Cnd_dlv_grp_cd6.setNextBeans(p.Cnd_dlv_grp_nm6);
		p.Cnd_dlv_grp_cd6.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_grp_cd6_META);
		p.Tab3Panel.add(p.Cnd_dlv_grp_nm6);
		p.Cnd_dlv_grp_nm6.setNextBeans(p.Cnd_dlv_grp_cd7);
		p.Cnd_dlv_grp_nm6.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm6, true);
		p.Cnd_dlv_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd7, true);
		p.Cnd_dlv_grp_cd7.setLinkBeans(p.Cnd_dlv_grp_nm7);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd7_Label);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd7);
		p.Cnd_dlv_grp_cd7.setNextBeans(p.Cnd_dlv_grp_nm7);
		p.Cnd_dlv_grp_cd7.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_grp_cd7_META);
		p.Tab3Panel.add(p.Cnd_dlv_grp_nm7);
		p.Cnd_dlv_grp_nm7.setNextBeans(p.Cnd_dlv_grp_cd8);
		p.Cnd_dlv_grp_nm7.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm7, true);
		p.Cnd_dlv_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd8, true);
		p.Cnd_dlv_grp_cd8.setLinkBeans(p.Cnd_dlv_grp_nm8);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd8_Label);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd8);
		p.Cnd_dlv_grp_cd8.setNextBeans(p.Cnd_dlv_grp_nm8);
		p.Cnd_dlv_grp_cd8.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_grp_cd8_META);
		p.Tab3Panel.add(p.Cnd_dlv_grp_nm8);
		p.Cnd_dlv_grp_nm8.setNextBeans(p.Cnd_dlv_grp_cd9);
		p.Cnd_dlv_grp_nm8.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm8, true);
		p.Cnd_dlv_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd9, true);
		p.Cnd_dlv_grp_cd9.setLinkBeans(p.Cnd_dlv_grp_nm9);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd9_Label);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd9);
		p.Cnd_dlv_grp_cd9.setNextBeans(p.Cnd_dlv_grp_nm9);
		p.Cnd_dlv_grp_cd9.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_grp_cd9_META);
		p.Tab3Panel.add(p.Cnd_dlv_grp_nm9);
		p.Cnd_dlv_grp_nm9.setNextBeans(p.Cnd_dlv_grp_cd10);
		p.Cnd_dlv_grp_nm9.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm9, true);
		p.Cnd_dlv_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd10, true);
		p.Cnd_dlv_grp_cd10.setLinkBeans(p.Cnd_dlv_grp_nm10);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd10_Label);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd10);
		p.Cnd_dlv_grp_cd10.setNextBeans(p.Cnd_dlv_grp_nm10);
		p.Cnd_dlv_grp_cd10.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_grp_cd10_META);
		p.Tab3Panel.add(p.Cnd_dlv_grp_nm10);
		p.Cnd_dlv_grp_nm10.setRow(p.getCndR(), mcframe.clientMABS.MABSP1240.CndR.dlv_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm10, true);
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MABSP_ScmIfCtlReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MABSP_ScmIfCtlReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MABSP_ScmIfCtlReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABSP_ScmIfCtlReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBulkSet(MABSP_ScmIfCtlReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.DtlPanel);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_st_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_st_dt);
		p.BulkSetPanel.setLastBeans(p.BulkSet_st_dt);
		p.BulkSet_st_dt.setNextBeans(p.BulkSet_end_dt);
		p.BulkSet_st_dt.setRow(p.getBulkSetR(), mcframe.clientMABS.MABSP1240.BulkSetR.st_dt_META);
		p.BulkSet_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_end_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_end_dt);
		p.BulkSet_end_dt.setNextBeans(p.BulkSet_set_dt);
		p.BulkSet_end_dt.setRow(p.getBulkSetR(), mcframe.clientMABS.MABSP1240.BulkSetR.end_dt_META);
		p.BulkSet_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSet_set_dt.setFunctionKey(MCFunctionKey.F7);
		p.BulkSetPanel.add(p.BulkSet_set_dt);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABSP_ScmIfCtlReg p) {
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
	protected static void jbInitBtn(MABSP_ScmIfCtlReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_correct_dup_dt.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_correct_dup_dt);
		p.BtnPanel.setLastBeans(p.Btn_correct_dup_dt);
		p.Btn_correct_dup_dt.setNextBeans(p.Btn_select_all);
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
	protected static void jbInitEastBtn(MABSP_ScmIfCtlReg p) {
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
		MABSP_ScmIfCtlReg_MC.mcInitScreenOpe((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.mcInitTop((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.mcInitFold((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.mcInitCndTab((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.mcInitCnd((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.mcInitTab1((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.mcInitTab2((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.mcInitTab3((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.mcInitCtrl((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.mcInitBulkSet((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.mcInitDtl((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.mcInitBtn((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.mcInitEastBtn((MABSP_ScmIfCtlReg)this);

		// [UPD]ステータスのモードの設定
		MABSP_ScmIfCtlReg_MC.statusInitUPD_ScreenOpe((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitUPD_Top((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitUPD_Fold((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitUPD_CndTab((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitUPD_Cnd((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitUPD_Tab1((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitUPD_Tab2((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitUPD_Tab3((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitUPD_Ctrl((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitUPD_BulkSet((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitUPD_Dtl((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitUPD_Btn((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitUPD_EastBtn((MABSP_ScmIfCtlReg)this);

		// [FIX]ステータスのモードの設定
		MABSP_ScmIfCtlReg_MC.statusInitFIX_ScreenOpe((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitFIX_Top((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitFIX_Fold((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitFIX_CndTab((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitFIX_Cnd((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitFIX_Tab1((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitFIX_Tab2((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitFIX_Tab3((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitFIX_Ctrl((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitFIX_BulkSet((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitFIX_Dtl((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitFIX_Btn((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitFIX_EastBtn((MABSP_ScmIfCtlReg)this);

		// [DEL]ステータスのモードの設定
		MABSP_ScmIfCtlReg_MC.statusInitDEL_ScreenOpe((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitDEL_Top((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitDEL_Fold((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitDEL_CndTab((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitDEL_Cnd((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitDEL_Tab1((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitDEL_Tab2((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitDEL_Tab3((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitDEL_Ctrl((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitDEL_BulkSet((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitDEL_Dtl((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitDEL_Btn((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitDEL_EastBtn((MABSP_ScmIfCtlReg)this);

		// [REF]ステータスのモードの設定
		MABSP_ScmIfCtlReg_MC.statusInitREF_ScreenOpe((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitREF_Top((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitREF_Fold((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitREF_CndTab((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitREF_Cnd((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitREF_Tab1((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitREF_Tab2((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitREF_Tab3((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitREF_Ctrl((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitREF_BulkSet((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitREF_Dtl((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitREF_Btn((MABSP_ScmIfCtlReg)this);
		MABSP_ScmIfCtlReg_MC.statusInitREF_EastBtn((MABSP_ScmIfCtlReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABSP_ScmIfCtlReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABSP_ScmIfCtlReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABSP_ScmIfCtlReg p) {
	}

	/**
	 *  [CndTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCndTab(MABSP_ScmIfCtlReg p) {
		p.CndTabTab.addAllListener(p);
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABSP_ScmIfCtlReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_if_proc_typ.setListListener(p);
		p.Cnd_if_proc_typ.addAllListener(p);
		p.Cnd_if_proc_typ_nm.setListListener(p);
		p.Cnd_if_proc_typ_nm.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_lg_grp_cd.setListListener(p);
		p.Cnd_lg_grp_cd.addAllListener(p);
		p.Cnd_lg_grp_nm.setListListener(p);
		p.Cnd_lg_grp_nm.addAllListener(p);
		p.Cnd_oper_cd.setListListener(p);
		p.Cnd_oper_cd.addAllListener(p);
		p.Cnd_oper_nm.setListListener(p);
		p.Cnd_oper_nm.addAllListener(p);
		p.Cnd_wk_cost_cd.setListListener(p);
		p.Cnd_wk_cost_cd.addAllListener(p);
		p.Cnd_wk_cost_nm.setListListener(p);
		p.Cnd_wk_cost_nm.addAllListener(p);
		p.Cnd_dlv_cd.setListListener(p);
		p.Cnd_dlv_cd.addAllListener(p);
		p.Cnd_dlv_nm.setListListener(p);
		p.Cnd_dlv_nm.addAllListener(p);
		p.Cnd_gr_loc_cd.setListListener(p);
		p.Cnd_gr_loc_cd.addAllListener(p);
		p.Cnd_gr_loc_nm.setListListener(p);
		p.Cnd_gr_loc_nm.addAllListener(p);
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
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MABSP_ScmIfCtlReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MABSP_ScmIfCtlReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MABSP_ScmIfCtlReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABSP_ScmIfCtlReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MABSP_ScmIfCtlReg p) {
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
	protected static void mcInitDtl(MABSP_ScmIfCtlReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_if_proc_typ.addAllListener(p);
		p.columnDtl_if_proc_typ.setListListener(p);
		p.columnDtl_if_proc_typ_nm.addAllListener(p);
		p.columnDtl_if_proc_typ_nm.setListListener(p);
		p.columnDtl_loc_cd.addAllListener(p);
		p.columnDtl_loc_cd.setListListener(p);
		p.columnDtl_loc_nm.addAllListener(p);
		p.columnDtl_loc_nm.setListListener(p);
		p.columnDtl_lg_grp_cd.addAllListener(p);
		p.columnDtl_lg_grp_cd.setListListener(p);
		p.columnDtl_lg_grp_nm.addAllListener(p);
		p.columnDtl_lg_grp_nm.setListListener(p);
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
		p.columnDtl_oper_cd.addAllListener(p);
		p.columnDtl_oper_cd.setListListener(p);
		p.columnDtl_oper_nm.addAllListener(p);
		p.columnDtl_oper_nm.setListListener(p);
		p.columnDtl_wk_cost_cd.addAllListener(p);
		p.columnDtl_wk_cost_cd.setListListener(p);
		p.columnDtl_wk_cost_nm.addAllListener(p);
		p.columnDtl_wk_cost_nm.setListListener(p);
		p.columnDtl_dlv_cd.addAllListener(p);
		p.columnDtl_dlv_cd.setListListener(p);
		p.columnDtl_dlv_nm.addAllListener(p);
		p.columnDtl_dlv_nm.setListListener(p);
		p.columnDtl_gr_loc_cd.addAllListener(p);
		p.columnDtl_gr_loc_cd.setListListener(p);
		p.columnDtl_gr_loc_nm.addAllListener(p);
		p.columnDtl_gr_loc_nm.setListListener(p);
		p.columnDtl_ext_sys_cd.addAllListener(p);
		p.columnDtl_ext_sys_cd.setListListener(p);
		p.columnDtl_ext_sys_nm.addAllListener(p);
		p.columnDtl_ext_sys_nm.setListListener(p);
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
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABSP_ScmIfCtlReg p) {
		p.Btn_correct_dup_dt.addAllListener(p);
		p.Btn_correct_dup_dt.setAPMethodName("doBtn_correct_dup_dt");
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
	protected static void mcInitEastBtn(MABSP_ScmIfCtlReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [UPD]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CndTab(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABSP_ScmIfCtlReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_if_proc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_if_proc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_oper_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wk_cost_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wk_cost_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_gr_loc_nm.putMode(p, UPD, MCMode.ENABLE);
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

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab3(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MABSP_ScmIfCtlReg p){
		p.BulkSet_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_set_dt.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABSP_ScmIfCtlReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_if_proc_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_if_proc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_lg_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.ENABLE);
		p.columnDtl_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_oper_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wk_cost_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_wk_cost_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dlv_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_gr_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_gr_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnDtl_ext_sys_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ext_sys_nm.putMode(p, UPD, MCMode.READ_ONLY);
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
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABSP_ScmIfCtlReg p){
		p.Btn_correct_dup_dt.putMode(p, UPD, MCMode.ENABLE);
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
	protected static void statusInitUPD_EastBtn(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [FIX]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_CndTab(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABSP_ScmIfCtlReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_if_proc_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_if_proc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_oper_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_wk_cost_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_wk_cost_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_gr_loc_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_gr_loc_nm.putMode(p, FIX, MCMode.ENABLE);
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

	}

	/**
	 * [FIX]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab1(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [FIX]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab2(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [FIX]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab3(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [FIX]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BulkSet(MABSP_ScmIfCtlReg p){
		p.BulkSet_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABSP_ScmIfCtlReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_if_proc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_if_proc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lg_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lg_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wk_cost_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wk_cost_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_gr_loc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_gr_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, FIX, MCMode.READ_ONLY);
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
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABSP_ScmIfCtlReg p){
		p.Btn_correct_dup_dt.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [DEL]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_CndTab(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABSP_ScmIfCtlReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_if_proc_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_if_proc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_oper_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wk_cost_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wk_cost_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_loc_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_gr_loc_nm.putMode(p, DEL, MCMode.ENABLE);
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

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab3(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MABSP_ScmIfCtlReg p){
		p.BulkSet_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABSP_ScmIfCtlReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_if_proc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_if_proc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lg_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lg_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wk_cost_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wk_cost_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gr_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gr_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, DEL, MCMode.READ_ONLY);
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
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABSP_ScmIfCtlReg p){
		p.Btn_correct_dup_dt.putMode(p, DEL, MCMode.DISABLE);
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
	protected static void statusInitDEL_EastBtn(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [REF]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_CndTab(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABSP_ScmIfCtlReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_if_proc_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_if_proc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lg_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_lg_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_oper_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_oper_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wk_cost_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wk_cost_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gr_loc_nm.putMode(p, REF, MCMode.ENABLE);
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

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABSP_ScmIfCtlReg p){

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MABSP_ScmIfCtlReg p){
		p.BulkSet_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABSP_ScmIfCtlReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_if_proc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_if_proc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wk_cost_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wk_cost_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gr_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gr_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);
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
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABSP_ScmIfCtlReg p){
		p.Btn_correct_dup_dt.putMode(p, REF, MCMode.DISABLE);
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
	protected static void statusInitREF_EastBtn(MABSP_ScmIfCtlReg p){

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
		MABSP_ScmIfCtlReg_MC.setTableConfigDtl((MABSP_ScmIfCtlReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABSP_ScmIfCtlReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABS.MABSP1240.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABS.MABSP1240.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_if_proc_typ.setMeta(mcframe.clientMABS.MABSP1240.DtlR.if_proc_typ_META);
		p.columnDtl_if_proc_typ.addLinkBeans(p.columnDtl_if_proc_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_if_proc_typ);
		p.columnDtl_if_proc_typ_nm.setMeta(mcframe.clientMABS.MABSP1240.DtlR.if_proc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_if_proc_typ_nm);
		p.columnDtl_loc_cd.setMeta(mcframe.clientMABS.MABSP1240.DtlR.loc_cd_META);
		p.columnDtl_loc_cd.setListType(MCListType.STRICT);
		p.columnDtl_loc_cd.addLinkBeans(p.columnDtl_loc_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_cd);
		p.columnDtl_loc_nm.setMeta(mcframe.clientMABS.MABSP1240.DtlR.loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_nm);
		p.columnDtl_lg_grp_cd.setMeta(mcframe.clientMABS.MABSP1240.DtlR.lg_grp_cd_META);
		p.columnDtl_lg_grp_cd.addLinkBeans(p.columnDtl_lg_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_lg_grp_cd);
		p.columnDtl_lg_grp_nm.setMeta(mcframe.clientMABS.MABSP1240.DtlR.lg_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lg_grp_nm);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_itm_sub1, p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_itm_typ, p.columnDtl_itm_typ_nm, p.columnDtl_itm_typ_d_cd, p.columnDtl_itm_typ_d_nm);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_itm_typ, p.columnDtl_itm_typ_nm, p.columnDtl_itm_typ_d_cd, p.columnDtl_itm_typ_d_nm);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_itm_typ, p.columnDtl_itm_typ_nm, p.columnDtl_itm_typ_d_cd, p.columnDtl_itm_typ_d_nm);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_itm_typ, p.columnDtl_itm_typ_nm, p.columnDtl_itm_typ_d_cd, p.columnDtl_itm_typ_d_nm);
		p.columnDtl_itm_typ.setMeta(mcframe.clientMABS.MABSP1240.DtlR.itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ);
		p.columnDtl_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP1240.DtlR.itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_nm);
		p.columnDtl_itm_typ_d_cd.setMeta(mcframe.clientMABS.MABSP1240.DtlR.itm_typ_d_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_cd);
		p.columnDtl_itm_typ_d_nm.setMeta(mcframe.clientMABS.MABSP1240.DtlR.itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_typ_d_nm);
		p.columnDtl_oper_cd.setMeta(mcframe.clientMABS.MABSP1240.DtlR.oper_cd_META);
		p.columnDtl_oper_cd.addLinkBeans(p.columnDtl_oper_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_cd);
		p.columnDtl_oper_nm.setMeta(mcframe.clientMABS.MABSP1240.DtlR.oper_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_nm);
		p.columnDtl_wk_cost_cd.setMeta(mcframe.clientMABS.MABSP1240.DtlR.wk_cost_cd_META);
		p.columnDtl_wk_cost_cd.addLinkBeans(p.columnDtl_wk_cost_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_wk_cost_cd);
		p.columnDtl_wk_cost_nm.setMeta(mcframe.clientMABS.MABSP1240.DtlR.wk_cost_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wk_cost_nm);
		p.columnDtl_dlv_cd.setMeta(mcframe.clientMABS.MABSP1240.DtlR.dlv_cd_META);
		p.columnDtl_dlv_cd.setListType(MCListType.STRICT);
		p.columnDtl_dlv_cd.addLinkBeans(p.columnDtl_dlv_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_cd);
		p.columnDtl_dlv_nm.setMeta(mcframe.clientMABS.MABSP1240.DtlR.dlv_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_nm);
		p.columnDtl_gr_loc_cd.setMeta(mcframe.clientMABS.MABSP1240.DtlR.gr_loc_cd_META);
		p.columnDtl_gr_loc_cd.setListType(MCListType.STRICT);
		p.columnDtl_gr_loc_cd.addLinkBeans(p.columnDtl_gr_loc_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_gr_loc_cd);
		p.columnDtl_gr_loc_nm.setMeta(mcframe.clientMABS.MABSP1240.DtlR.gr_loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gr_loc_nm);
		p.DtlTable.addTable(p.Dtl_dt_p_PPanel.DtTable);
		p.columnDtl_ext_sys_cd.setMeta(mcframe.clientMABS.MABSP1240.DtlR.ext_sys_cd_META);
		p.columnDtl_ext_sys_cd.addLinkBeans(p.columnDtl_ext_sys_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_cd);
		p.columnDtl_ext_sys_nm.setMeta(mcframe.clientMABS.MABSP1240.DtlR.ext_sys_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_nm);
		p.columnDtl_memo1.setMeta(mcframe.clientMABS.MABSP1240.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABS.MABSP1240.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABS.MABSP1240.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP1240.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP1240.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABS.MABSP1240.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP1240.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP1240.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP1240.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP1240.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP1240.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABS.MABSP1240.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP1240.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP1240.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP1240.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP1240.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP1240.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABS.MABSP1240.DtlR.del_ts_META);
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
		Cnd_if_proc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_if_proc_typ.getListConfig().setPutter(getCnd_if_proc_typ_ListPutter());
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_lg_grp_cd.getListConfig().setPutter(getCnd_lg_grp_cd_ListPutter());
		Cnd_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_oper_cd.getListConfig().setPutter(getCnd_oper_cd_ListPutter());
		Cnd_wk_cost_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wk_cost_cd.getListConfig().setPutter(getCnd_wk_cost_cd_ListPutter());
		Cnd_dlv_cd.getListConfig().setPutter(getCnd_dlv_cd_ListPutter());
		Cnd_gr_loc_cd.getListConfig().setPutter(getCnd_gr_loc_cd_ListPutter());
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
		columnDtl_if_proc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_if_proc_typ.getListConfig().setPutter(getDtl_if_proc_typ_ListPutter());
		columnDtl_loc_cd.getListConfig().setPutter(getDtl_loc_cd_ListPutter());
		columnDtl_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_lg_grp_cd.getListConfig().setPutter(getDtl_lg_grp_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnDtl_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_oper_cd.getListConfig().setPutter(getDtl_oper_cd_ListPutter());
		columnDtl_wk_cost_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_wk_cost_cd.getListConfig().setPutter(getDtl_wk_cost_cd_ListPutter());
		columnDtl_dlv_cd.getListConfig().setPutter(getDtl_dlv_cd_ListPutter());
		columnDtl_gr_loc_cd.getListConfig().setPutter(getDtl_gr_loc_cd_ListPutter());
		columnDtl_ext_sys_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ext_sys_cd.getListConfig().setPutter(getDtl_ext_sys_cd_ListPutter());
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
	 * [Cnd_if_proc_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_if_proc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IfProcTyp");
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
	 * [Cnd_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrpForLoc");
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
	 * [Cnd_wk_cost_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wk_cost_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.WkCost");
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
	 * [Cnd_gr_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gr_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
	 * [Dtl_if_proc_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_if_proc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IfProcTyp");
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
	 * [Dtl_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrpForLoc");
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
	 * [Dtl_oper_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_oper_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Oper");
		return lp;
	}
	 
	/**
	 * [Dtl_wk_cost_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_wk_cost_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.WkCost");
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
	 * [Dtl_gr_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_gr_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Dtl_ext_sys_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ext_sys_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExtSysScm");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_if_proc_typ) return getCnd_if_proc_typ(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_lg_grp_cd) return getCnd_lg_grp_cd(row, info);
		if(combo == Cnd_oper_cd) return getCnd_oper_cd(row, info);
		if(combo == Cnd_wk_cost_cd) return getCnd_wk_cost_cd(row, info);
		if(combo == Cnd_dlv_cd) return getCnd_dlv_cd(row, info);
		if(combo == Cnd_gr_loc_cd) return getCnd_gr_loc_cd(row, info);
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
		if(combo == columnDtl_if_proc_typ) return getDtl_if_proc_typ(row, info);
		if(combo == columnDtl_loc_cd) return getDtl_loc_cd(row, info);
		if(combo == columnDtl_lg_grp_cd) return getDtl_lg_grp_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_cd) return getDtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub1) return getDtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub2) return getDtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub3) return getDtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnDtl_oper_cd) return getDtl_oper_cd(row, info);
		if(combo == columnDtl_wk_cost_cd) return getDtl_wk_cost_cd(row, info);
		if(combo == columnDtl_dlv_cd) return getDtl_dlv_cd(row, info);
		if(combo == columnDtl_gr_loc_cd) return getDtl_gr_loc_cd(row, info);
		if(combo == columnDtl_ext_sys_cd) return getDtl_ext_sys_cd(row, info);
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
		else if (ap == BulkSet_set_dt) doBulkSet_set_dt(info);
		else if (ap == Btn_correct_dup_dt) doBtn_correct_dup_dt(info);
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
	 * [BulkSet]パネルの[set_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBulkSet_set_dt(MCEventInfo info);

	/**
	 * [Btn]パネルの[correct_dup_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_correct_dup_dt(MCEventInfo info);

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
		if (vc == CndTabTab) return doCndTab_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_if_proc_typ) return doCnd_if_proc_typ_VC(info);
		if (vc == Cnd_if_proc_typ_nm) return doCnd_if_proc_typ_nm_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_lg_grp_cd) return doCnd_lg_grp_cd_VC(info);
		if (vc == Cnd_lg_grp_nm) return doCnd_lg_grp_nm_VC(info);
		if (vc == Cnd_oper_cd) return doCnd_oper_cd_VC(info);
		if (vc == Cnd_oper_nm) return doCnd_oper_nm_VC(info);
		if (vc == Cnd_wk_cost_cd) return doCnd_wk_cost_cd_VC(info);
		if (vc == Cnd_wk_cost_nm) return doCnd_wk_cost_nm_VC(info);
		if (vc == Cnd_dlv_cd) return doCnd_dlv_cd_VC(info);
		if (vc == Cnd_dlv_nm) return doCnd_dlv_nm_VC(info);
		if (vc == Cnd_gr_loc_cd) return doCnd_gr_loc_cd_VC(info);
		if (vc == Cnd_gr_loc_nm) return doCnd_gr_loc_nm_VC(info);
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
		if (vc == BulkSet_st_dt) return doBulkSet_st_dt_VC(info);
		if (vc == BulkSet_end_dt) return doBulkSet_end_dt_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_if_proc_typ) return doDtl_if_proc_typ_VC(info);
		if (vc == columnDtl_if_proc_typ_nm) return doDtl_if_proc_typ_nm_VC(info);
		if (vc == columnDtl_loc_cd) return doDtl_loc_cd_VC(info);
		if (vc == columnDtl_loc_nm) return doDtl_loc_nm_VC(info);
		if (vc == columnDtl_lg_grp_cd) return doDtl_lg_grp_cd_VC(info);
		if (vc == columnDtl_lg_grp_nm) return doDtl_lg_grp_nm_VC(info);
		if (vc == columnDtl_itm_typ) return doDtl_itm_typ_VC(info);
		if (vc == columnDtl_itm_typ_nm) return doDtl_itm_typ_nm_VC(info);
		if (vc == columnDtl_itm_typ_d_cd) return doDtl_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_itm_typ_d_nm) return doDtl_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_oper_cd) return doDtl_oper_cd_VC(info);
		if (vc == columnDtl_oper_nm) return doDtl_oper_nm_VC(info);
		if (vc == columnDtl_wk_cost_cd) return doDtl_wk_cost_cd_VC(info);
		if (vc == columnDtl_wk_cost_nm) return doDtl_wk_cost_nm_VC(info);
		if (vc == columnDtl_dlv_cd) return doDtl_dlv_cd_VC(info);
		if (vc == columnDtl_dlv_nm) return doDtl_dlv_nm_VC(info);
		if (vc == columnDtl_gr_loc_cd) return doDtl_gr_loc_cd_VC(info);
		if (vc == columnDtl_gr_loc_nm) return doDtl_gr_loc_nm_VC(info);
		if (vc == columnDtl_ext_sys_cd) return doDtl_ext_sys_cd_VC(info);
		if (vc == columnDtl_ext_sys_nm) return doDtl_ext_sys_nm_VC(info);
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
	 * [Cnd]パネルの[if_proc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_if_proc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[if_proc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_if_proc_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lg_grp_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[wk_cost_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wk_cost_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wk_cost_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wk_cost_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[gr_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gr_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gr_loc_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[if_proc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_if_proc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[if_proc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_if_proc_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lg_grp_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[wk_cost_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wk_cost_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wk_cost_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wk_cost_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[gr_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gr_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gr_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gr_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_nm_VC(MCEventInfo info){
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
		else if (nc == Cnd_if_proc_typ) doCnd_if_proc_typ_NC(info);
		else if (nc == Cnd_if_proc_typ_nm) doCnd_if_proc_typ_nm_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NC(info);
		else if (nc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NC(info);
		else if (nc == Cnd_oper_cd) doCnd_oper_cd_NC(info);
		else if (nc == Cnd_oper_nm) doCnd_oper_nm_NC(info);
		else if (nc == Cnd_wk_cost_cd) doCnd_wk_cost_cd_NC(info);
		else if (nc == Cnd_wk_cost_nm) doCnd_wk_cost_nm_NC(info);
		else if (nc == Cnd_dlv_cd) doCnd_dlv_cd_NC(info);
		else if (nc == Cnd_dlv_nm) doCnd_dlv_nm_NC(info);
		else if (nc == Cnd_gr_loc_cd) doCnd_gr_loc_cd_NC(info);
		else if (nc == Cnd_gr_loc_nm) doCnd_gr_loc_nm_NC(info);
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
		else if (nc == BulkSet_st_dt) doBulkSet_st_dt_NC(info);
		else if (nc == BulkSet_end_dt) doBulkSet_end_dt_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_if_proc_typ) doDtl_if_proc_typ_NC(info);
		else if (nc == columnDtl_if_proc_typ_nm) doDtl_if_proc_typ_nm_NC(info);
		else if (nc == columnDtl_loc_cd) doDtl_loc_cd_NC(info);
		else if (nc == columnDtl_loc_nm) doDtl_loc_nm_NC(info);
		else if (nc == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_NC(info);
		else if (nc == columnDtl_lg_grp_nm) doDtl_lg_grp_nm_NC(info);
		else if (nc == columnDtl_itm_typ) doDtl_itm_typ_NC(info);
		else if (nc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NC(info);
		else if (nc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_oper_cd) doDtl_oper_cd_NC(info);
		else if (nc == columnDtl_oper_nm) doDtl_oper_nm_NC(info);
		else if (nc == columnDtl_wk_cost_cd) doDtl_wk_cost_cd_NC(info);
		else if (nc == columnDtl_wk_cost_nm) doDtl_wk_cost_nm_NC(info);
		else if (nc == columnDtl_dlv_cd) doDtl_dlv_cd_NC(info);
		else if (nc == columnDtl_dlv_nm) doDtl_dlv_nm_NC(info);
		else if (nc == columnDtl_gr_loc_cd) doDtl_gr_loc_cd_NC(info);
		else if (nc == columnDtl_gr_loc_nm) doDtl_gr_loc_nm_NC(info);
		else if (nc == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NC(info);
		else if (nc == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NC(info);
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
	 * [Cnd]パネルの[if_proc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_if_proc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[if_proc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_if_proc_typ_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[wk_cost_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_cost_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[gr_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[if_proc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_proc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_proc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_proc_typ_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[wk_cost_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wk_cost_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wk_cost_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wk_cost_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[gr_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gr_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gr_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gr_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_NC(MCEventInfo info){
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
		else if (ne == Cnd_if_proc_typ) doCnd_if_proc_typ_NE(info);
		else if (ne == Cnd_if_proc_typ_nm) doCnd_if_proc_typ_nm_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NE(info);
		else if (ne == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NE(info);
		else if (ne == Cnd_oper_cd) doCnd_oper_cd_NE(info);
		else if (ne == Cnd_oper_nm) doCnd_oper_nm_NE(info);
		else if (ne == Cnd_wk_cost_cd) doCnd_wk_cost_cd_NE(info);
		else if (ne == Cnd_wk_cost_nm) doCnd_wk_cost_nm_NE(info);
		else if (ne == Cnd_dlv_cd) doCnd_dlv_cd_NE(info);
		else if (ne == Cnd_dlv_nm) doCnd_dlv_nm_NE(info);
		else if (ne == Cnd_gr_loc_cd) doCnd_gr_loc_cd_NE(info);
		else if (ne == Cnd_gr_loc_nm) doCnd_gr_loc_nm_NE(info);
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
		else if (ne == BulkSet_st_dt) doBulkSet_st_dt_NE(info);
		else if (ne == BulkSet_end_dt) doBulkSet_end_dt_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_if_proc_typ) doDtl_if_proc_typ_NE(info);
		else if (ne == columnDtl_if_proc_typ_nm) doDtl_if_proc_typ_nm_NE(info);
		else if (ne == columnDtl_loc_cd) doDtl_loc_cd_NE(info);
		else if (ne == columnDtl_loc_nm) doDtl_loc_nm_NE(info);
		else if (ne == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_NE(info);
		else if (ne == columnDtl_lg_grp_nm) doDtl_lg_grp_nm_NE(info);
		else if (ne == columnDtl_itm_typ) doDtl_itm_typ_NE(info);
		else if (ne == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NE(info);
		else if (ne == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_oper_cd) doDtl_oper_cd_NE(info);
		else if (ne == columnDtl_oper_nm) doDtl_oper_nm_NE(info);
		else if (ne == columnDtl_wk_cost_cd) doDtl_wk_cost_cd_NE(info);
		else if (ne == columnDtl_wk_cost_nm) doDtl_wk_cost_nm_NE(info);
		else if (ne == columnDtl_dlv_cd) doDtl_dlv_cd_NE(info);
		else if (ne == columnDtl_dlv_nm) doDtl_dlv_nm_NE(info);
		else if (ne == columnDtl_gr_loc_cd) doDtl_gr_loc_cd_NE(info);
		else if (ne == columnDtl_gr_loc_nm) doDtl_gr_loc_nm_NE(info);
		else if (ne == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NE(info);
		else if (ne == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NE(info);
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
	 * [Cnd]パネルの[if_proc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_if_proc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[if_proc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_if_proc_typ_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[wk_cost_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_cost_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[gr_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[if_proc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_proc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_proc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_proc_typ_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[wk_cost_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wk_cost_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wk_cost_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wk_cost_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[gr_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gr_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gr_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gr_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_NE(MCEventInfo info){
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
		else if (nx == Cnd_if_proc_typ) doCnd_if_proc_typ_NX(info);
		else if (nx == Cnd_if_proc_typ_nm) doCnd_if_proc_typ_nm_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_lg_grp_cd) doCnd_lg_grp_cd_NX(info);
		else if (nx == Cnd_lg_grp_nm) doCnd_lg_grp_nm_NX(info);
		else if (nx == Cnd_oper_cd) doCnd_oper_cd_NX(info);
		else if (nx == Cnd_oper_nm) doCnd_oper_nm_NX(info);
		else if (nx == Cnd_wk_cost_cd) doCnd_wk_cost_cd_NX(info);
		else if (nx == Cnd_wk_cost_nm) doCnd_wk_cost_nm_NX(info);
		else if (nx == Cnd_dlv_cd) doCnd_dlv_cd_NX(info);
		else if (nx == Cnd_dlv_nm) doCnd_dlv_nm_NX(info);
		else if (nx == Cnd_gr_loc_cd) doCnd_gr_loc_cd_NX(info);
		else if (nx == Cnd_gr_loc_nm) doCnd_gr_loc_nm_NX(info);
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
		else if (nx == BulkSet_st_dt) doBulkSet_st_dt_NX(info);
		else if (nx == BulkSet_end_dt) doBulkSet_end_dt_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_if_proc_typ) doDtl_if_proc_typ_NX(info);
		else if (nx == columnDtl_if_proc_typ_nm) doDtl_if_proc_typ_nm_NX(info);
		else if (nx == columnDtl_loc_cd) doDtl_loc_cd_NX(info);
		else if (nx == columnDtl_loc_nm) doDtl_loc_nm_NX(info);
		else if (nx == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_NX(info);
		else if (nx == columnDtl_lg_grp_nm) doDtl_lg_grp_nm_NX(info);
		else if (nx == columnDtl_itm_typ) doDtl_itm_typ_NX(info);
		else if (nx == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_NX(info);
		else if (nx == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_oper_cd) doDtl_oper_cd_NX(info);
		else if (nx == columnDtl_oper_nm) doDtl_oper_nm_NX(info);
		else if (nx == columnDtl_wk_cost_cd) doDtl_wk_cost_cd_NX(info);
		else if (nx == columnDtl_wk_cost_nm) doDtl_wk_cost_nm_NX(info);
		else if (nx == columnDtl_dlv_cd) doDtl_dlv_cd_NX(info);
		else if (nx == columnDtl_dlv_nm) doDtl_dlv_nm_NX(info);
		else if (nx == columnDtl_gr_loc_cd) doDtl_gr_loc_cd_NX(info);
		else if (nx == columnDtl_gr_loc_nm) doDtl_gr_loc_nm_NX(info);
		else if (nx == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NX(info);
		else if (nx == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NX(info);
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
	 * [Cnd]パネルの[if_proc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_if_proc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[if_proc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_if_proc_typ_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[wk_cost_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_cost_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[gr_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[if_proc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_proc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_proc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_proc_typ_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[wk_cost_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wk_cost_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wk_cost_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wk_cost_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[gr_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gr_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gr_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gr_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_NX(MCEventInfo info){
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
		if (lc == Cnd_if_proc_typ) doCnd_if_proc_typ_LC(info);
		else if (lc == Cnd_if_proc_typ_nm) doCnd_if_proc_typ_nm_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_lg_grp_cd) doCnd_lg_grp_cd_LC(info);
		else if (lc == Cnd_lg_grp_nm) doCnd_lg_grp_nm_LC(info);
		else if (lc == Cnd_oper_cd) doCnd_oper_cd_LC(info);
		else if (lc == Cnd_oper_nm) doCnd_oper_nm_LC(info);
		else if (lc == Cnd_wk_cost_cd) doCnd_wk_cost_cd_LC(info);
		else if (lc == Cnd_wk_cost_nm) doCnd_wk_cost_nm_LC(info);
		else if (lc == Cnd_dlv_cd) doCnd_dlv_cd_LC(info);
		else if (lc == Cnd_dlv_nm) doCnd_dlv_nm_LC(info);
		else if (lc == Cnd_gr_loc_cd) doCnd_gr_loc_cd_LC(info);
		else if (lc == Cnd_gr_loc_nm) doCnd_gr_loc_nm_LC(info);
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
		else if (lc == BulkSet_st_dt) doBulkSet_st_dt_LC(info);
		else if (lc == BulkSet_end_dt) doBulkSet_end_dt_LC(info);
		else if (lc == columnDtl_if_proc_typ) doDtl_if_proc_typ_LC(info);
		else if (lc == columnDtl_if_proc_typ_nm) doDtl_if_proc_typ_nm_LC(info);
		else if (lc == columnDtl_loc_cd) doDtl_loc_cd_LC(info);
		else if (lc == columnDtl_loc_nm) doDtl_loc_nm_LC(info);
		else if (lc == columnDtl_lg_grp_cd) doDtl_lg_grp_cd_LC(info);
		else if (lc == columnDtl_lg_grp_nm) doDtl_lg_grp_nm_LC(info);
		else if (lc == columnDtl_itm_typ) doDtl_itm_typ_LC(info);
		else if (lc == columnDtl_itm_typ_nm) doDtl_itm_typ_nm_LC(info);
		else if (lc == columnDtl_itm_typ_d_cd) doDtl_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_itm_typ_d_nm) doDtl_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_oper_cd) doDtl_oper_cd_LC(info);
		else if (lc == columnDtl_oper_nm) doDtl_oper_nm_LC(info);
		else if (lc == columnDtl_wk_cost_cd) doDtl_wk_cost_cd_LC(info);
		else if (lc == columnDtl_wk_cost_nm) doDtl_wk_cost_nm_LC(info);
		else if (lc == columnDtl_dlv_cd) doDtl_dlv_cd_LC(info);
		else if (lc == columnDtl_dlv_nm) doDtl_dlv_nm_LC(info);
		else if (lc == columnDtl_gr_loc_cd) doDtl_gr_loc_cd_LC(info);
		else if (lc == columnDtl_gr_loc_nm) doDtl_gr_loc_nm_LC(info);
		else if (lc == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_LC(info);
		else if (lc == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_LC(info);
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
	 * [Cnd]パネルの[if_proc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_if_proc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[if_proc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_if_proc_typ_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lg_grp_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[wk_cost_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wk_cost_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wk_cost_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[gr_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gr_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gr_loc_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[if_proc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_proc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[if_proc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_if_proc_typ_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lg_grp_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[wk_cost_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wk_cost_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wk_cost_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wk_cost_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[gr_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gr_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gr_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gr_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_if_proc_typ]の作成メソッド
	 */
	public MCList getCnd_if_proc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIfProcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_cd]の作成メソッド
	 */
	public MCList getCnd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrpForLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_oper_cd]の作成メソッド
	 */
	public MCList getCnd_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wk_cost_cd]の作成メソッド
	 */
	public MCList getCnd_wk_cost_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWkCost(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_cd]の作成メソッド
	 */
	public MCList getCnd_dlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gr_loc_cd]の作成メソッド
	 */
	public MCList getCnd_gr_loc_cd(MCRow row, MCEventInfo info){
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
	 * コンボ／リストのリスト[columnDtl_if_proc_typ]の作成メソッド
	 */
	public MCList getDtl_if_proc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIfProcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_loc_cd]の作成メソッド
	 */
	public MCList getDtl_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_lg_grp_cd]の作成メソッド
	 */
	public MCList getDtl_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrpForLoc(row, info);
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
	 * コンボ／リストのリスト[columnDtl_oper_cd]の作成メソッド
	 */
	public MCList getDtl_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_wk_cost_cd]の作成メソッド
	 */
	public MCList getDtl_wk_cost_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWkCost(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dlv_cd]の作成メソッド
	 */
	public MCList getDtl_dlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_gr_loc_cd]の作成メソッド
	 */
	public MCList getDtl_gr_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ext_sys_cd]の作成メソッド
	 */
	public MCList getDtl_ext_sys_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExtSysScm(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABSL1240.Srch01")) {
			return new MA_MABSL1240_Srch01Bridge();
		}
		if (id.equals("MA.MABSL1240.Sprt01")) {
			return new MA_MABSL1240_Sprt01Bridge();
		}
		if (id.equals("MA.MABSL1240.Upd01")) {
			return new MA_MABSL1240_Upd01Bridge();
		}
		if (id.equals("MA.MABSL1240.Del01")) {
			return new MA_MABSL1240_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABSL1240_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1240_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL1240_Srch01;

		/** コンストラクタ */
		protected MA_MABSL1240_Srch01Bridge() {
			p_MA_MABSL1240_Srch01 = new MCParam(PDef.MA_MABSL1240_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL1240_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABS.MABSP1240.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1240.DtlR.class));

			p_MA_MABSL1240_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL1240_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL1240_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL1240_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL1240_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABS.MABSP1240.CndR up0() {
			return (mcframe.clientMABS.MABSP1240.CndR)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP1240.DtlR> down0() {
			return (MCList<mcframe.clientMABS.MABSP1240.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABSL1240_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1240.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL1240_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABS.MABSP1240.DtlR>)p_MA_MABSL1240_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABSL1240_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1240_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL1240_Sprt01;

		/** コンストラクタ */
		protected MA_MABSL1240_Sprt01Bridge() {
			p_MA_MABSL1240_Sprt01 = new MCParam(PDef.MA_MABSL1240_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL1240_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1240.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1240.DtlR.class));

			p_MA_MABSL1240_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL1240_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL1240_Sprt01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL1240_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL1240_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP1240.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP1240.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP1240.DtlR> down0() {
			return (MCList<mcframe.clientMABS.MABSP1240.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABSL1240_Sprt01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1240.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL1240_Sprt01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABS.MABSP1240.DtlR>)p_MA_MABSL1240_Sprt01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABSL1240_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1240_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL1240_Upd01;

		/** コンストラクタ */
		protected MA_MABSL1240_Upd01Bridge() {
			p_MA_MABSL1240_Upd01 = new MCParam(PDef.MA_MABSL1240_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL1240_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1240.DtlR.class));
			// Down

			p_MA_MABSL1240_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL1240_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL1240_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL1240_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL1240_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP1240.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP1240.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL1240_Upd01;
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
	 * [MA_MABSL1240_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1240_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL1240_Del01;

		/** コンストラクタ */
		protected MA_MABSL1240_Del01Bridge() {
			p_MA_MABSL1240_Del01 = new MCParam(PDef.MA_MABSL1240_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL1240_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1240.DtlR.class));
			// Down

			p_MA_MABSL1240_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL1240_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL1240_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL1240_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL1240_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP1240.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP1240.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL1240_Del01;
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