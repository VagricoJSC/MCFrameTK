package mcframe.clientMABC.MABCP0420;

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
import mcframe.clientMABC.MABCP0420.MABCP_BpSubReg_MC.MA_MABCL0420_Srch01Caller;
import mcframe.clientMABC.MABCP0420.MABCP_BpSubReg_MC.MA_MABCL0420_Sprt01Caller;
import mcframe.clientMABC.MABCP0420.MABCP_BpSubReg_MC.MA_MABCL0420_Upd01Caller;
import mcframe.clientMABC.MABCP0420.MABCP_BpSubReg_MC.MA_MABCL0420_Del01Caller;

/**
 * 画面"MABCP_BpSubReg"パネルクラスです。<p>
 *
 * 取引先補助マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_BpSubReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABCP0420";

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
	// [Mst]ブロック関連のField定義
	public MCPanel MstPanel = null;
	// [Mst]ブロックの項目のField定義
	public MCLabel Mst_mst_set_typ_nm_Label = null;
	/**
	 * Management 管理.<p>
	 *
	 */
	public MCTextField Mst_mst_set_typ_nm = null;
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
	/**
	 * Customer 得意先.<p>
	 *
	 */
	public MCCheckBox Cnd_cst_flg = null;
	/**
	 * AR customer 売掛先.<p>
	 *
	 */
	public MCCheckBox Cnd_acst_flg = null;
	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public MCCheckBox Cnd_bcst_flg = null;
	/**
	 * Payer 入金先.<p>
	 *
	 */
	public MCCheckBox Cnd_rcst_flg = null;
	/**
	 * Delivery destination 納品先.<p>
	 *
	 */
	public MCCheckBox Cnd_dlv_flg = null;
	/**
	 * Distribution channel 仕向先.<p>
	 *
	 */
	public MCCheckBox Cnd_dest_flg = null;
	/**
	 * Credit managed BP 与信管理先.<p>
	 *
	 */
	public MCCheckBox Cnd_cred_flg = null;
	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public MCCheckBox Cnd_sppl_flg = null;
	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public MCCheckBox Cnd_asppl_flg = null;
	/**
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public MCCheckBox Cnd_bsppl_flg = null;
	/**
	 * Payee 支払先.<p>
	 *
	 */
	public MCCheckBox Cnd_psppl_flg = null;
	/**
	 * Maker メーカ.<p>
	 *
	 */
	public MCCheckBox Cnd_maker_flg = null;
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Cnd_cnd_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Cnd_cnd_deselect_all = null;
	public MCLabel Cnd_bp_cd_Label = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCTextField Cnd_bp_nm = null;
	/**
	 * Enter from reference 参照登録.<p>
	 *
	 */
	public MCCheckBox Cnd_ref_ins_flg = null;
	public MCLabel Cnd_new_st_dt_Label = null;
	/**
	 * New application start date 新適用開始日.<p>
	 *
	 */
	public MCDateField Cnd_new_st_dt = null;
	public MCLabel Cnd_dpt_cd_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_nm = null;
	public MCLabel Cnd_vmi_purc_dpt_cd_Label = null;
	/**
	 * VMI purchasing dept. cd. ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_vmi_purc_dpt_cd = null;
	/**
	 * VMI purchasing dept. name ＶＭＩ購買部門名.<p>
	 *
	 */
	public MCTextField Cnd_vmi_purc_dpt_nm = null;
	public MCLabel Cnd_ar_dpt_cd_Label = null;
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ar_dpt_cd = null;
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public MCTextField Cnd_ar_dpt_nm = null;
	public MCLabel Cnd_bcst_dpt_cd_Label = null;
	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bcst_dpt_cd = null;
	/**
	 * Billing customer dept. in charge name 請求先担当部門名.<p>
	 *
	 */
	public MCTextField Cnd_bcst_dpt_nm = null;
	public MCLabel Cnd_ap_dpt_cd_Label = null;
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCTextField Cnd_ap_dpt_nm = null;
	public MCLabel Cnd_bsppl_dpt_cd_Label = null;
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_dpt_cd = null;
	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_dpt_nm = null;
	public MCLabel Cnd_pay_dpt_cd_Label = null;
	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_pay_dpt_cd = null;
	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public MCTextField Cnd_pay_dpt_nm = null;
	public MCLabel Cnd_sls_tax_cd_Label = null;
	/**
	 * Sales tax cd. 売上税ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_sls_tax_cd = null;
	/**
	 * Sales tax name 売上税名.<p>
	 *
	 */
	public MCTextField Cnd_sls_tax_nm = null;
	public MCLabel Cnd_purc_tax_cd_Label = null;
	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_purc_tax_cd = null;
	/**
	 * Purchase tax type name 仕入税名.<p>
	 *
	 */
	public MCTextField Cnd_purc_tax_nm = null;
	public MCLabel Cnd_prov_tax_cd_Label = null;
	/**
	 * Supply tax cd. 支給税ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_prov_tax_cd = null;
	/**
	 * Supply tax name 支給税名.<p>
	 *
	 */
	public MCTextField Cnd_prov_tax_nm = null;
	/**
	 * Taxation only 課税のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_tax_abl_only_flg = null;
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
	public MCLabel Cnd_memo4_Label = null;
	/**
	 * Memo 4 メモ４.<p>
	 *
	 */
	public MCTextField Cnd_memo4 = null;
	public MCLabel Cnd_memo5_Label = null;
	/**
	 * Memo 5 メモ５.<p>
	 *
	 */
	public MCTextField Cnd_memo5 = null;
	public MCLabel Cnd_memo6_Label = null;
	/**
	 * Memo 6 メモ６.<p>
	 *
	 */
	public MCTextField Cnd_memo6 = null;
	public MCLabel Cnd_memo7_Label = null;
	/**
	 * Memo 7 メモ７.<p>
	 *
	 */
	public MCTextField Cnd_memo7 = null;
	public MCLabel Cnd_memo8_Label = null;
	/**
	 * Memo 8 メモ８.<p>
	 *
	 */
	public MCTextField Cnd_memo8 = null;
	public MCLabel Cnd_memo9_Label = null;
	/**
	 * Memo 9 メモ９.<p>
	 *
	 */
	public MCTextField Cnd_memo9 = null;
	public MCLabel Cnd_memo10_Label = null;
	/**
	 * Memo 10 メモ１０.<p>
	 *
	 */
	public MCTextField Cnd_memo10 = null;
	public MCLabel Cnd_memo11_Label = null;
	/**
	 * Memo 11 メモ１１.<p>
	 *
	 */
	public MCTextField Cnd_memo11 = null;
	public MCLabel Cnd_memo12_Label = null;
	/**
	 * Memo 12 メモ１２.<p>
	 *
	 */
	public MCTextField Cnd_memo12 = null;
	public MCLabel Cnd_memo13_Label = null;
	/**
	 * Memo 13 メモ１３.<p>
	 *
	 */
	public MCTextField Cnd_memo13 = null;
	public MCLabel Cnd_memo14_Label = null;
	/**
	 * Memo 14 メモ１４.<p>
	 *
	 */
	public MCTextField Cnd_memo14 = null;
	public MCLabel Cnd_memo15_Label = null;
	/**
	 * Memo 15 メモ１５.<p>
	 *
	 */
	public MCTextField Cnd_memo15 = null;
	public MCLabel Cnd_memo16_Label = null;
	/**
	 * Memo 16 メモ１６.<p>
	 *
	 */
	public MCTextField Cnd_memo16 = null;
	public MCLabel Cnd_memo17_Label = null;
	/**
	 * Memo 17 メモ１７.<p>
	 *
	 */
	public MCTextField Cnd_memo17 = null;
	public MCLabel Cnd_memo18_Label = null;
	/**
	 * Memo 18 メモ１８.<p>
	 *
	 */
	public MCTextField Cnd_memo18 = null;
	public MCLabel Cnd_memo19_Label = null;
	/**
	 * Memo 19 メモ１９.<p>
	 *
	 */
	public MCTextField Cnd_memo19 = null;
	public MCLabel Cnd_memo20_Label = null;
	/**
	 * Memo 20 メモ２０.<p>
	 *
	 */
	public MCTextField Cnd_memo20 = null;
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
	public MCLabel Cnd_bp_grp_cd1_Label = null;
	/**
	 * BP classification cd. 1 取引先分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd1 = null;
	/**
	 * BP classification name 1 取引先分類名１.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm1 = null;
	public MCLabel Cnd_bp_grp_cd2_Label = null;
	/**
	 * BP classification cd. 2 取引先分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd2 = null;
	/**
	 * BP classification name 2 取引先分類名２.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm2 = null;
	public MCLabel Cnd_bp_grp_cd3_Label = null;
	/**
	 * BP classification cd. 3 取引先分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd3 = null;
	/**
	 * BP classification name 3 取引先分類名３.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm3 = null;
	public MCLabel Cnd_bp_grp_cd4_Label = null;
	/**
	 * BP classification cd. 4 取引先分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd4 = null;
	/**
	 * BP classification name 4 取引先分類名４.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm4 = null;
	public MCLabel Cnd_bp_grp_cd5_Label = null;
	/**
	 * BP classification cd. 5 取引先分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd5 = null;
	/**
	 * BP classification name 5 取引先分類名５.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm5 = null;
	public MCLabel Cnd_bp_grp_cd6_Label = null;
	/**
	 * BP classification cd. 6 取引先分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd6 = null;
	/**
	 * BP classification name 6 取引先分類名６.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm6 = null;
	public MCLabel Cnd_bp_grp_cd7_Label = null;
	/**
	 * BP classification cd. 7 取引先分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd7 = null;
	/**
	 * BP classification name 7 取引先分類名７.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm7 = null;
	public MCLabel Cnd_bp_grp_cd8_Label = null;
	/**
	 * BP classification cd. 8 取引先分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd8 = null;
	/**
	 * BP classification name 8 取引先分類名８.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm8 = null;
	public MCLabel Cnd_bp_grp_cd9_Label = null;
	/**
	 * BP classification cd. 9 取引先分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd9 = null;
	/**
	 * BP classification name 9 取引先分類名９.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm9 = null;
	public MCLabel Cnd_bp_grp_cd10_Label = null;
	/**
	 * BP classification cd. 10 取引先分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_bp_grp_cd10 = null;
	/**
	 * BP classification name 10 取引先分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_bp_grp_nm10 = null;
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
	public MCButton BulkSet_upd_dt = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0420.DtlR> DtlTable = null;
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
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_nm = null;
	/**
	 * Customer 得意先.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_flg = null;
	/**
	 * AR customer 売掛先.<p>
	 *
	 */
	public MCColumnConfig columnDtl_acst_flg = null;
	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bcst_flg = null;
	/**
	 * Payer 入金先.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rcst_flg = null;
	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_flg = null;
	/**
	 * AP supplier 買掛先.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asppl_flg = null;
	/**
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bsppl_flg = null;
	/**
	 * Payee 支払先.<p>
	 *
	 */
	public MCColumnConfig columnDtl_psppl_flg = null;
	/**
	 * Credit managed BP 与信管理先.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cred_flg = null;
	/**
	 * Delivery destination 納品先.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_flg = null;
	/**
	 * Maker メーカ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_maker_flg = null;
	/**
	 * Distribution channel 仕向先.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_flg = null;
	/**
	 * AR dept. type 債権部門区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_dpt_typ = null;
	/**
	 * Billing dept. type 請求部門区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_dpt_typ = null;
	/**
	 * Chargeable supplier 有償支給先.<p>
	 *
	 */
	public MCColumnConfig columnDtl_onr_prsppl_flg = null;
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public MCColumnConfig columnDtl_repurc_obli_flg = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Dtl_dt_p_PPanel;
	public MCColumnConfig columnDtl_st_dt_key;// [Dtl]の[dt_p.st_dt_key]を[columnDtl_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnDtl_st_dt;// [Dtl]の[dt_p.st_dt]を[columnDtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_end_dt;// [Dtl]の[dt_p.end_dt]を[columnDtl_end_dt]としてエイリアス定義。
	/**
	 * Zip code 郵便番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl_zip_cd = null;
	/**
	 * Address 1 住所１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_addr1 = null;
	/**
	 * Address 2 住所２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_addr2 = null;
	/**
	 * Address 3 住所３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_addr3 = null;
	/**
	 * Address 4 住所４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_addr4 = null;
	/**
	 * TEL ＴＥＬ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tel = null;
	/**
	 * FAX ＦＡＸ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_fax = null;
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_dpt_cd = null;
	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ar_dpt_nm = null;
	/**
	 * Customer dept. 得意先部署.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_cntct_dpt = null;
	/**
	 * Customer PIC 得意先担当者.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_cntct_psn = null;
	/**
	 * Form of address for Customer PIC 得意先担当者敬称.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_cntct_psn_title = null;
	/**
	 * Sales tax cd. 売上税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_tax_cd = null;
	/**
	 * Sales tax name 売上税名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_tax_nm = null;
	/**
	 * Sales analysis cd. 1 販売分析ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_anly_cd1 = null;
	/**
	 * Sales analysis name 1 販売分析名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_anly_nm1 = null;
	/**
	 * Sales analysis cd. 2 販売分析ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_anly_cd2 = null;
	/**
	 * Sales analysis name 2 販売分析名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_anly_nm2 = null;
	/**
	 * Sales analysis cd. 3 販売分析ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_anly_cd3 = null;
	/**
	 * Sales analysis name 3 販売分析名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_anly_nm3 = null;
	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bcst_dpt_cd = null;
	/**
	 * Billing customer dept. in charge name 請求先担当部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bcst_dpt_nm = null;
	/**
	 * Invoice send-to zip code 請求書送付郵便番号.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_zip_cd = null;
	/**
	 * Invoice send-to address 1 請求書送付住所１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_addr1 = null;
	/**
	 * Invoice send-to address 2 請求書送付住所２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_addr2 = null;
	/**
	 * Invoice send-to address 3 請求書送付住所３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_addr3 = null;
	/**
	 * Invoice send-to address 4 請求書送付住所４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_addr4 = null;
	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_tel = null;
	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_bcst_nm = null;
	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_bcst_dpt = null;
	/**
	 * Invoice send-to PIC 請求書送付担当者.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_bcst_psn = null;
	/**
	 * Invoice send-to PIC honorific 請求書送付担当者敬称.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bill_bcst_psn_title = null;
	/**
	 * VMI purchasing dept. cd. ＶＭＩ購買部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_vmi_purc_dpt_cd = null;
	/**
	 * VMI purchasing dept. name ＶＭＩ購買部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_vmi_purc_dpt_nm = null;
	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_cntct_dpt = null;
	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_cntct_psn = null;
	/**
	 * Supplier PIC form of address 発注先担当者敬称.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_cntct_psn_title = null;
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
	/**
	 * Supply tax cd. 支給税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_tax_cd = null;
	/**
	 * Supply tax name 支給税名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prov_tax_nm = null;
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ap_dpt_nm = null;
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bsppl_dpt_cd = null;
	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bsppl_dpt_nm = null;
	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_dpt_cd = null;
	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pay_dpt_nm = null;
	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_cntct_dpt = null;
	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_cntct_psn = null;
	/**
	 * Delivery destination PIC honorific 納品先担当者敬称.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_cntct_psn_title = null;
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
	 * Memo 4 メモ４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo4 = null;
	/**
	 * Memo 5 メモ５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo5 = null;
	/**
	 * Memo 6 メモ６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo6 = null;
	/**
	 * Memo 7 メモ７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo7 = null;
	/**
	 * Memo 8 メモ８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo8 = null;
	/**
	 * Memo 9 メモ９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo9 = null;
	/**
	 * Memo 10 メモ１０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo10 = null;
	/**
	 * Memo 11 メモ１１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo11 = null;
	/**
	 * Memo 12 メモ１２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo12 = null;
	/**
	 * Memo 13 メモ１３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo13 = null;
	/**
	 * Memo 14 メモ１４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo14 = null;
	/**
	 * Memo 15 メモ１５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo15 = null;
	/**
	 * Memo 16 メモ１６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo16 = null;
	/**
	 * Memo 17 メモ１７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo17 = null;
	/**
	 * Memo 18 メモ１８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo18 = null;
	/**
	 * Memo 19 メモ１９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo19 = null;
	/**
	 * Memo 20 メモ２０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo20 = null;
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
	
	/** [MA_MABCL0420_Srch01]のCallerの作成 */
	protected MABCP_BpSubReg_MC.MA_MABCL0420_Srch01Caller createMA_MABCL0420_Srch01() {
		MABCP_BpSubReg_MC.MA_MABCL0420_Srch01Caller<MABCP_BpSubReg, MA_MABCL0420_Srch01Bridge>
		caller = ((MABCP_BpSubReg_MC)this).new MA_MABCL0420_Srch01Caller<MABCP_BpSubReg, MA_MABCL0420_Srch01Bridge>(
					(MABCP_BpSubReg)this, new MA_MABCL0420_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0420_Srch01]の呼び出し */
	protected void callMA_MABCL0420_Srch01() {
		MCCaller caller = createMA_MABCL0420_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0420_Sprt01]のCallerの作成 */
	protected MABCP_BpSubReg_MC.MA_MABCL0420_Sprt01Caller createMA_MABCL0420_Sprt01() {
		MABCP_BpSubReg_MC.MA_MABCL0420_Sprt01Caller<MABCP_BpSubReg, MA_MABCL0420_Sprt01Bridge>
		caller = ((MABCP_BpSubReg_MC)this).new MA_MABCL0420_Sprt01Caller<MABCP_BpSubReg, MA_MABCL0420_Sprt01Bridge>(
					(MABCP_BpSubReg)this, new MA_MABCL0420_Sprt01Bridge());
		return caller;
	}
	/** [MA_MABCL0420_Sprt01]の呼び出し */
	protected void callMA_MABCL0420_Sprt01() {
		MCCaller caller = createMA_MABCL0420_Sprt01();
		caller.exec();
	}
	/** [MA_MABCL0420_Upd01]のCallerの作成 */
	protected MABCP_BpSubReg_MC.MA_MABCL0420_Upd01Caller createMA_MABCL0420_Upd01() {
		MABCP_BpSubReg_MC.MA_MABCL0420_Upd01Caller<MABCP_BpSubReg, MA_MABCL0420_Upd01Bridge>
		caller = ((MABCP_BpSubReg_MC)this).new MA_MABCL0420_Upd01Caller<MABCP_BpSubReg, MA_MABCL0420_Upd01Bridge>(
					(MABCP_BpSubReg)this, new MA_MABCL0420_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0420_Upd01]の呼び出し */
	protected void callMA_MABCL0420_Upd01() {
		MCCaller caller = createMA_MABCL0420_Upd01();
		caller.exec();
	}
	/** [MA_MABCL0420_Del01]のCallerの作成 */
	protected MABCP_BpSubReg_MC.MA_MABCL0420_Del01Caller createMA_MABCL0420_Del01() {
		MABCP_BpSubReg_MC.MA_MABCL0420_Del01Caller<MABCP_BpSubReg, MA_MABCL0420_Del01Bridge>
		caller = ((MABCP_BpSubReg_MC)this).new MA_MABCL0420_Del01Caller<MABCP_BpSubReg, MA_MABCL0420_Del01Bridge>(
					(MABCP_BpSubReg)this, new MA_MABCL0420_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL0420_Del01]の呼び出し */
	protected void callMA_MABCL0420_Del01() {
		MCCaller caller = createMA_MABCL0420_Del01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0420.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0420.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0420.BulkSetR aBulkSetR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0420.DtlR> aDtlL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP0420.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0420.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0420.MstR createMstR() {
		return mcframe.clientMABC.MABCP0420.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0420.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0420.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0420.CndR createCndR() {
		return mcframe.clientMABC.MABCP0420.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMABC.MABCP0420.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABC.MABCP0420.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABC.MABCP0420.BulkSetR createBulkSetR() {
		return mcframe.clientMABC.MABCP0420.BulkSetR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP0420.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0420.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP0420.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP0420.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0420.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0420.DtlR.class);
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
		if(!MCCollectionUtil.contains(ret, getMstR())) ret.add(getMstR());
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
		if(aCnt == getMstR()) return "Mst";
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
		if(bId.equals("Mst")) return getMstR();
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
		ret.add(MstPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CndPanel);
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
	public MABCP_BpSubReg_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_BpSubReg_MC_A(String name) {
		aMstR = createMstR();
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
		MABCP_BpSubReg_MC.jbCreateScreenOpe((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbCreateMst((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbCreateTop((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbCreateFold((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbCreateTab1((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbCreateTab2((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbCreateCnd((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbCreateCtrl((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbCreateBulkSet((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbCreateDtl((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbCreateBtn((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbCreateEastBtn((MABCP_BpSubReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_BpSubReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_BpSubReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_BpSubReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_BpSubReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MABCP_BpSubReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MABCP_BpSubReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_BpSubReg p) {
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
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_BpSubReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MABCP_BpSubReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_BpSubReg p) {
		p.Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABC.MABCP0420.DtlR.$dt_p);
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
	protected static void jbCreateBtn(MABCP_BpSubReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_BpSubReg p) {
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

	
	/** [Cnd_bp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bp_cd_p = null;

	/**
	 * [Cnd_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_cd_ListPutter() {
		if (Cnd_bp_cd_p == null) {
			Cnd_bp_cd_p = createCnd_bp_cd_ListPutter(Cnd_bp_cd, "bp_cd", "bp_nm");

		}
		return Cnd_bp_cd_p;
	}
	
	
	/** [Cnd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dpt_cd_p = null;

	/**
	 * [Cnd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dpt_cd_ListPutter() {
		if (Cnd_dpt_cd_p == null) {
			Cnd_dpt_cd_p = createCnd_dpt_cd_ListPutter(Cnd_dpt_cd, "dpt_cd", "dpt_nm");

		}
		return Cnd_dpt_cd_p;
	}
	
	
	/** [Cnd_vmi_purc_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_vmi_purc_dpt_cd_p = null;

	/**
	 * [Cnd_vmi_purc_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_vmi_purc_dpt_cd_ListPutter() {
		if (Cnd_vmi_purc_dpt_cd_p == null) {
			Cnd_vmi_purc_dpt_cd_p = createCnd_vmi_purc_dpt_cd_ListPutter(Cnd_vmi_purc_dpt_cd, "vmi_purc_dpt_cd", "vmi_purc_dpt_nm");

		}
		return Cnd_vmi_purc_dpt_cd_p;
	}
	
	
	/** [Cnd_ar_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ar_dpt_cd_p = null;

	/**
	 * [Cnd_ar_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ar_dpt_cd_ListPutter() {
		if (Cnd_ar_dpt_cd_p == null) {
			Cnd_ar_dpt_cd_p = createCnd_ar_dpt_cd_ListPutter(Cnd_ar_dpt_cd, "ar_dpt_cd", "ar_dpt_nm");

		}
		return Cnd_ar_dpt_cd_p;
	}
	
	
	/** [Cnd_bcst_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bcst_dpt_cd_p = null;

	/**
	 * [Cnd_bcst_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bcst_dpt_cd_ListPutter() {
		if (Cnd_bcst_dpt_cd_p == null) {
			Cnd_bcst_dpt_cd_p = createCnd_bcst_dpt_cd_ListPutter(Cnd_bcst_dpt_cd, "bcst_dpt_cd", "bcst_dpt_nm");

		}
		return Cnd_bcst_dpt_cd_p;
	}
	
	
	/** [Cnd_ap_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ap_dpt_cd_p = null;

	/**
	 * [Cnd_ap_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ap_dpt_cd_ListPutter() {
		if (Cnd_ap_dpt_cd_p == null) {
			Cnd_ap_dpt_cd_p = createCnd_ap_dpt_cd_ListPutter(Cnd_ap_dpt_cd, "ap_dpt_cd", "ap_dpt_nm");

		}
		return Cnd_ap_dpt_cd_p;
	}
	
	
	/** [Cnd_bsppl_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bsppl_dpt_cd_p = null;

	/**
	 * [Cnd_bsppl_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bsppl_dpt_cd_ListPutter() {
		if (Cnd_bsppl_dpt_cd_p == null) {
			Cnd_bsppl_dpt_cd_p = createCnd_bsppl_dpt_cd_ListPutter(Cnd_bsppl_dpt_cd, "bsppl_dpt_cd", "bsppl_dpt_nm");

		}
		return Cnd_bsppl_dpt_cd_p;
	}
	
	
	/** [Cnd_pay_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pay_dpt_cd_p = null;

	/**
	 * [Cnd_pay_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pay_dpt_cd_ListPutter() {
		if (Cnd_pay_dpt_cd_p == null) {
			Cnd_pay_dpt_cd_p = createCnd_pay_dpt_cd_ListPutter(Cnd_pay_dpt_cd, "pay_dpt_cd", "pay_dpt_nm");

		}
		return Cnd_pay_dpt_cd_p;
	}
	
	
	/** [Cnd_sls_tax_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sls_tax_cd_p = null;

	/**
	 * [Cnd_sls_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sls_tax_cd_ListPutter() {
		if (Cnd_sls_tax_cd_p == null) {
			Cnd_sls_tax_cd_p = createCnd_sls_tax_cd_ListPutter(Cnd_sls_tax_cd, "sls_tax_cd", "sls_tax_nm");

		}
		return Cnd_sls_tax_cd_p;
	}
	
	
	/** [Cnd_purc_tax_cd_ListPutter]の定義 */
	private MCListPutter Cnd_purc_tax_cd_p = null;

	/**
	 * [Cnd_purc_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_purc_tax_cd_ListPutter() {
		if (Cnd_purc_tax_cd_p == null) {
			Cnd_purc_tax_cd_p = createCnd_purc_tax_cd_ListPutter(Cnd_purc_tax_cd, "purc_tax_cd", "purc_tax_nm");

		}
		return Cnd_purc_tax_cd_p;
	}
	
	
	/** [Cnd_prov_tax_cd_ListPutter]の定義 */
	private MCListPutter Cnd_prov_tax_cd_p = null;

	/**
	 * [Cnd_prov_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_prov_tax_cd_ListPutter() {
		if (Cnd_prov_tax_cd_p == null) {
			Cnd_prov_tax_cd_p = createCnd_prov_tax_cd_ListPutter(Cnd_prov_tax_cd, "prov_tax_cd", "prov_tax_nm");

		}
		return Cnd_prov_tax_cd_p;
	}
	
	
	/** [Cnd_bp_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd1_p = null;

	/**
	 * [Cnd_bp_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd1_ListPutter() {
		if (Cnd_bp_grp_cd1_p == null) {
			Cnd_bp_grp_cd1_p = createCnd_bp_grp_cd1_ListPutter(Cnd_bp_grp_cd1, "bp_grp_cd1", "bp_grp_nm1");

		}
		return Cnd_bp_grp_cd1_p;
	}
	
	
	/** [Cnd_bp_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd2_p = null;

	/**
	 * [Cnd_bp_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd2_ListPutter() {
		if (Cnd_bp_grp_cd2_p == null) {
			Cnd_bp_grp_cd2_p = createCnd_bp_grp_cd2_ListPutter(Cnd_bp_grp_cd2, "bp_grp_cd2", "bp_grp_nm2");

		}
		return Cnd_bp_grp_cd2_p;
	}
	
	
	/** [Cnd_bp_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd3_p = null;

	/**
	 * [Cnd_bp_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd3_ListPutter() {
		if (Cnd_bp_grp_cd3_p == null) {
			Cnd_bp_grp_cd3_p = createCnd_bp_grp_cd3_ListPutter(Cnd_bp_grp_cd3, "bp_grp_cd3", "bp_grp_nm3");

		}
		return Cnd_bp_grp_cd3_p;
	}
	
	
	/** [Cnd_bp_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd4_p = null;

	/**
	 * [Cnd_bp_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd4_ListPutter() {
		if (Cnd_bp_grp_cd4_p == null) {
			Cnd_bp_grp_cd4_p = createCnd_bp_grp_cd4_ListPutter(Cnd_bp_grp_cd4, "bp_grp_cd4", "bp_grp_nm4");

		}
		return Cnd_bp_grp_cd4_p;
	}
	
	
	/** [Cnd_bp_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd5_p = null;

	/**
	 * [Cnd_bp_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd5_ListPutter() {
		if (Cnd_bp_grp_cd5_p == null) {
			Cnd_bp_grp_cd5_p = createCnd_bp_grp_cd5_ListPutter(Cnd_bp_grp_cd5, "bp_grp_cd5", "bp_grp_nm5");

		}
		return Cnd_bp_grp_cd5_p;
	}
	
	
	/** [Cnd_bp_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd6_p = null;

	/**
	 * [Cnd_bp_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd6_ListPutter() {
		if (Cnd_bp_grp_cd6_p == null) {
			Cnd_bp_grp_cd6_p = createCnd_bp_grp_cd6_ListPutter(Cnd_bp_grp_cd6, "bp_grp_cd6", "bp_grp_nm6");

		}
		return Cnd_bp_grp_cd6_p;
	}
	
	
	/** [Cnd_bp_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd7_p = null;

	/**
	 * [Cnd_bp_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd7_ListPutter() {
		if (Cnd_bp_grp_cd7_p == null) {
			Cnd_bp_grp_cd7_p = createCnd_bp_grp_cd7_ListPutter(Cnd_bp_grp_cd7, "bp_grp_cd7", "bp_grp_nm7");

		}
		return Cnd_bp_grp_cd7_p;
	}
	
	
	/** [Cnd_bp_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd8_p = null;

	/**
	 * [Cnd_bp_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd8_ListPutter() {
		if (Cnd_bp_grp_cd8_p == null) {
			Cnd_bp_grp_cd8_p = createCnd_bp_grp_cd8_ListPutter(Cnd_bp_grp_cd8, "bp_grp_cd8", "bp_grp_nm8");

		}
		return Cnd_bp_grp_cd8_p;
	}
	
	
	/** [Cnd_bp_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd9_p = null;

	/**
	 * [Cnd_bp_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd9_ListPutter() {
		if (Cnd_bp_grp_cd9_p == null) {
			Cnd_bp_grp_cd9_p = createCnd_bp_grp_cd9_ListPutter(Cnd_bp_grp_cd9, "bp_grp_cd9", "bp_grp_nm9");

		}
		return Cnd_bp_grp_cd9_p;
	}
	
	
	/** [Cnd_bp_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_bp_grp_cd10_p = null;

	/**
	 * [Cnd_bp_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_grp_cd10_ListPutter() {
		if (Cnd_bp_grp_cd10_p == null) {
			Cnd_bp_grp_cd10_p = createCnd_bp_grp_cd10_ListPutter(Cnd_bp_grp_cd10, "bp_grp_cd10", "bp_grp_nm10");

		}
		return Cnd_bp_grp_cd10_p;
	}
	
	
	/** [Dtl_bp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_bp_cd_p = null;

	/**
	 * [Dtl_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bp_cd_ListPutter() {
		if (Dtl_bp_cd_p == null) {
			Dtl_bp_cd_p = createDtl_bp_cd_ListPutter(columnDtl_bp_cd, "bp_cd", "bp_nm","cst_flg","acst_flg","bcst_flg","rcst_flg","dlv_flg","dest_flg","cred_flg","sppl_flg","asppl_flg","bsppl_flg","psppl_flg","maker_flg","ar_dpt_typ","bill_dpt_typ","onr_prsppl_flg","repurc_obli_flg");

		}
		return Dtl_bp_cd_p;
	}
	
	
	/** [Dtl_ar_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ar_dpt_cd_p = null;

	/**
	 * [Dtl_ar_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ar_dpt_cd_ListPutter() {
		if (Dtl_ar_dpt_cd_p == null) {
			Dtl_ar_dpt_cd_p = createDtl_ar_dpt_cd_ListPutter(columnDtl_ar_dpt_cd, "ar_dpt_cd", "ar_dpt_nm");

		}
		return Dtl_ar_dpt_cd_p;
	}
	
	
	/** [Dtl_sls_tax_cd_ListPutter]の定義 */
	private MCListPutter Dtl_sls_tax_cd_p = null;

	/**
	 * [Dtl_sls_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sls_tax_cd_ListPutter() {
		if (Dtl_sls_tax_cd_p == null) {
			Dtl_sls_tax_cd_p = createDtl_sls_tax_cd_ListPutter(columnDtl_sls_tax_cd, "sls_tax_cd", "sls_tax_nm");

		}
		return Dtl_sls_tax_cd_p;
	}
	
	
	/** [Dtl_sls_anly_cd1_ListPutter]の定義 */
	private MCListPutter Dtl_sls_anly_cd1_p = null;

	/**
	 * [Dtl_sls_anly_cd1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sls_anly_cd1_ListPutter() {
		if (Dtl_sls_anly_cd1_p == null) {
			Dtl_sls_anly_cd1_p = createDtl_sls_anly_cd1_ListPutter(columnDtl_sls_anly_cd1, "sls_anly_cd1", "sls_anly_nm1");

		}
		return Dtl_sls_anly_cd1_p;
	}
	
	
	/** [Dtl_sls_anly_cd2_ListPutter]の定義 */
	private MCListPutter Dtl_sls_anly_cd2_p = null;

	/**
	 * [Dtl_sls_anly_cd2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sls_anly_cd2_ListPutter() {
		if (Dtl_sls_anly_cd2_p == null) {
			Dtl_sls_anly_cd2_p = createDtl_sls_anly_cd2_ListPutter(columnDtl_sls_anly_cd2, "sls_anly_cd2", "sls_anly_nm2");

		}
		return Dtl_sls_anly_cd2_p;
	}
	
	
	/** [Dtl_sls_anly_cd3_ListPutter]の定義 */
	private MCListPutter Dtl_sls_anly_cd3_p = null;

	/**
	 * [Dtl_sls_anly_cd3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sls_anly_cd3_ListPutter() {
		if (Dtl_sls_anly_cd3_p == null) {
			Dtl_sls_anly_cd3_p = createDtl_sls_anly_cd3_ListPutter(columnDtl_sls_anly_cd3, "sls_anly_cd3", "sls_anly_nm3");

		}
		return Dtl_sls_anly_cd3_p;
	}
	
	
	/** [Dtl_bcst_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_bcst_dpt_cd_p = null;

	/**
	 * [Dtl_bcst_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bcst_dpt_cd_ListPutter() {
		if (Dtl_bcst_dpt_cd_p == null) {
			Dtl_bcst_dpt_cd_p = createDtl_bcst_dpt_cd_ListPutter(columnDtl_bcst_dpt_cd, "bcst_dpt_cd", "bcst_dpt_nm");

		}
		return Dtl_bcst_dpt_cd_p;
	}
	
	
	/** [Dtl_vmi_purc_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_vmi_purc_dpt_cd_p = null;

	/**
	 * [Dtl_vmi_purc_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_vmi_purc_dpt_cd_ListPutter() {
		if (Dtl_vmi_purc_dpt_cd_p == null) {
			Dtl_vmi_purc_dpt_cd_p = createDtl_vmi_purc_dpt_cd_ListPutter(columnDtl_vmi_purc_dpt_cd, "vmi_purc_dpt_cd", "vmi_purc_dpt_nm");

		}
		return Dtl_vmi_purc_dpt_cd_p;
	}
	
	
	/** [Dtl_purc_tax_cd_ListPutter]の定義 */
	private MCListPutter Dtl_purc_tax_cd_p = null;

	/**
	 * [Dtl_purc_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_purc_tax_cd_ListPutter() {
		if (Dtl_purc_tax_cd_p == null) {
			Dtl_purc_tax_cd_p = createDtl_purc_tax_cd_ListPutter(columnDtl_purc_tax_cd, "purc_tax_cd", "purc_tax_nm");

		}
		return Dtl_purc_tax_cd_p;
	}
	
	
	/** [Dtl_prov_tax_cd_ListPutter]の定義 */
	private MCListPutter Dtl_prov_tax_cd_p = null;

	/**
	 * [Dtl_prov_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_prov_tax_cd_ListPutter() {
		if (Dtl_prov_tax_cd_p == null) {
			Dtl_prov_tax_cd_p = createDtl_prov_tax_cd_ListPutter(columnDtl_prov_tax_cd, "prov_tax_cd", "prov_tax_nm");

		}
		return Dtl_prov_tax_cd_p;
	}
	
	
	/** [Dtl_ap_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ap_dpt_cd_p = null;

	/**
	 * [Dtl_ap_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ap_dpt_cd_ListPutter() {
		if (Dtl_ap_dpt_cd_p == null) {
			Dtl_ap_dpt_cd_p = createDtl_ap_dpt_cd_ListPutter(columnDtl_ap_dpt_cd, "ap_dpt_cd", "ap_dpt_nm");

		}
		return Dtl_ap_dpt_cd_p;
	}
	
	
	/** [Dtl_bsppl_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_bsppl_dpt_cd_p = null;

	/**
	 * [Dtl_bsppl_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bsppl_dpt_cd_ListPutter() {
		if (Dtl_bsppl_dpt_cd_p == null) {
			Dtl_bsppl_dpt_cd_p = createDtl_bsppl_dpt_cd_ListPutter(columnDtl_bsppl_dpt_cd, "bsppl_dpt_cd", "bsppl_dpt_nm");

		}
		return Dtl_bsppl_dpt_cd_p;
	}
	
	
	/** [Dtl_pay_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_pay_dpt_cd_p = null;

	/**
	 * [Dtl_pay_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_pay_dpt_cd_ListPutter() {
		if (Dtl_pay_dpt_cd_p == null) {
			Dtl_pay_dpt_cd_p = createDtl_pay_dpt_cd_ListPutter(columnDtl_pay_dpt_cd, "pay_dpt_cd", "pay_dpt_nm");

		}
		return Dtl_pay_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_BpSubReg create(){
		MABCP_BpSubReg p = new MABCP_BpSubReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_BpSubReg create(String name){
		MABCP_BpSubReg p = new MABCP_BpSubReg(name);
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
		MABCP_BpSubReg_MC.jbfInitScreenOpe((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbfInitMst((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbfInitTop((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbfInitFold((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbfInitTab1((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbfInitTab2((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbfInitCnd((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbfInitCtrl((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbfInitBulkSet((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbfInitDtl((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbfInitBtn((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbfInitEastBtn((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbInitScreenOpe((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbInitMst((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbInitTop((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbInitFold((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbInitTab1((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbInitTab2((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbInitCnd((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbInitCtrl((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbInitBulkSet((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbInitDtl((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbInitBtn((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.jbInitEastBtn((MABCP_BpSubReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_BpSubReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_BpSubReg p) {
		// ブロック関連の初期化
		p.MstPanel = p.beansFactory.createPanel("Mst");
		// ブロックの項目の初期化
		p.Mst_mst_set_typ_nm_Label = p.beansFactory.createLabel("Mst.mst_set_typ_nm_Label");
		p.Mst_mst_set_typ_nm = p.beansFactory.createTextField("Mst.mst_set_typ_nm");
		p.Mst_mst_set_typ_nm.setLabel(p.Mst_mst_set_typ_nm_Label);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABCP_BpSubReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_BpSubReg p) {
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
	protected static void jbfInitTab1(MABCP_BpSubReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MABCP_BpSubReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_BpSubReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_cst_flg = p.beansFactory.createCheckBox("Cnd.cst_flg");
		p.Cnd_acst_flg = p.beansFactory.createCheckBox("Cnd.acst_flg");
		p.Cnd_bcst_flg = p.beansFactory.createCheckBox("Cnd.bcst_flg");
		p.Cnd_rcst_flg = p.beansFactory.createCheckBox("Cnd.rcst_flg");
		p.Cnd_dlv_flg = p.beansFactory.createCheckBox("Cnd.dlv_flg");
		p.Cnd_dest_flg = p.beansFactory.createCheckBox("Cnd.dest_flg");
		p.Cnd_cred_flg = p.beansFactory.createCheckBox("Cnd.cred_flg");
		p.Cnd_sppl_flg = p.beansFactory.createCheckBox("Cnd.sppl_flg");
		p.Cnd_asppl_flg = p.beansFactory.createCheckBox("Cnd.asppl_flg");
		p.Cnd_bsppl_flg = p.beansFactory.createCheckBox("Cnd.bsppl_flg");
		p.Cnd_psppl_flg = p.beansFactory.createCheckBox("Cnd.psppl_flg");
		p.Cnd_maker_flg = p.beansFactory.createCheckBox("Cnd.maker_flg");
		p.Cnd_cnd_select_all = p.beansFactory.createButton("Cnd.cnd_select_all", "no_border");
		p.Cnd_cnd_deselect_all = p.beansFactory.createButton("Cnd.cnd_deselect_all", "no_border");
		p.Cnd_bp_cd_Label = p.beansFactory.createLabel("Cnd.bp_cd_Label");
		p.Cnd_bp_cd = p.beansFactory.createTextField("Cnd.bp_cd");
		p.Cnd_bp_cd.setLabel(p.Cnd_bp_cd_Label);
		p.Cnd_bp_nm = p.beansFactory.createTextField("Cnd.bp_nm");
		p.Cnd_ref_ins_flg = p.beansFactory.createCheckBox("Cnd.ref_ins_flg");
		p.Cnd_new_st_dt_Label = p.beansFactory.createLabel("Cnd.new_st_dt_Label");
		p.Cnd_new_st_dt = p.beansFactory.createDateField("Cnd.new_st_dt");
		p.Cnd_new_st_dt.setLabel(p.Cnd_new_st_dt_Label);
		p.Cnd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.dpt_cd_Label");
		p.Cnd_dpt_cd = p.beansFactory.createTextField("Cnd.dpt_cd");
		p.Cnd_dpt_cd.setLabel(p.Cnd_dpt_cd_Label);
		p.Cnd_dpt_nm = p.beansFactory.createTextField("Cnd.dpt_nm");
		p.Cnd_vmi_purc_dpt_cd_Label = p.beansFactory.createLabel("Cnd.vmi_purc_dpt_cd_Label");
		p.Cnd_vmi_purc_dpt_cd = p.beansFactory.createTextField("Cnd.vmi_purc_dpt_cd");
		p.Cnd_vmi_purc_dpt_cd.setLabel(p.Cnd_vmi_purc_dpt_cd_Label);
		p.Cnd_vmi_purc_dpt_nm = p.beansFactory.createTextField("Cnd.vmi_purc_dpt_nm");
		p.Cnd_ar_dpt_cd_Label = p.beansFactory.createLabel("Cnd.ar_dpt_cd_Label");
		p.Cnd_ar_dpt_cd = p.beansFactory.createTextField("Cnd.ar_dpt_cd");
		p.Cnd_ar_dpt_cd.setLabel(p.Cnd_ar_dpt_cd_Label);
		p.Cnd_ar_dpt_nm = p.beansFactory.createTextField("Cnd.ar_dpt_nm");
		p.Cnd_bcst_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bcst_dpt_cd_Label");
		p.Cnd_bcst_dpt_cd = p.beansFactory.createTextField("Cnd.bcst_dpt_cd");
		p.Cnd_bcst_dpt_cd.setLabel(p.Cnd_bcst_dpt_cd_Label);
		p.Cnd_bcst_dpt_nm = p.beansFactory.createTextField("Cnd.bcst_dpt_nm");
		p.Cnd_ap_dpt_cd_Label = p.beansFactory.createLabel("Cnd.ap_dpt_cd_Label");
		p.Cnd_ap_dpt_cd = p.beansFactory.createTextField("Cnd.ap_dpt_cd");
		p.Cnd_ap_dpt_cd.setLabel(p.Cnd_ap_dpt_cd_Label);
		p.Cnd_ap_dpt_nm = p.beansFactory.createTextField("Cnd.ap_dpt_nm");
		p.Cnd_bsppl_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bsppl_dpt_cd_Label");
		p.Cnd_bsppl_dpt_cd = p.beansFactory.createTextField("Cnd.bsppl_dpt_cd");
		p.Cnd_bsppl_dpt_cd.setLabel(p.Cnd_bsppl_dpt_cd_Label);
		p.Cnd_bsppl_dpt_nm = p.beansFactory.createTextField("Cnd.bsppl_dpt_nm");
		p.Cnd_pay_dpt_cd_Label = p.beansFactory.createLabel("Cnd.pay_dpt_cd_Label");
		p.Cnd_pay_dpt_cd = p.beansFactory.createTextField("Cnd.pay_dpt_cd");
		p.Cnd_pay_dpt_cd.setLabel(p.Cnd_pay_dpt_cd_Label);
		p.Cnd_pay_dpt_nm = p.beansFactory.createTextField("Cnd.pay_dpt_nm");
		p.Cnd_sls_tax_cd_Label = p.beansFactory.createLabel("Cnd.sls_tax_cd_Label");
		p.Cnd_sls_tax_cd = p.beansFactory.createTextComboBox("Cnd.sls_tax_cd");
		p.Cnd_sls_tax_cd.setLabel(p.Cnd_sls_tax_cd_Label);
		p.Cnd_sls_tax_nm = p.beansFactory.createTextField("Cnd.sls_tax_nm");
		p.Cnd_purc_tax_cd_Label = p.beansFactory.createLabel("Cnd.purc_tax_cd_Label");
		p.Cnd_purc_tax_cd = p.beansFactory.createTextComboBox("Cnd.purc_tax_cd");
		p.Cnd_purc_tax_cd.setLabel(p.Cnd_purc_tax_cd_Label);
		p.Cnd_purc_tax_nm = p.beansFactory.createTextField("Cnd.purc_tax_nm");
		p.Cnd_prov_tax_cd_Label = p.beansFactory.createLabel("Cnd.prov_tax_cd_Label");
		p.Cnd_prov_tax_cd = p.beansFactory.createTextComboBox("Cnd.prov_tax_cd");
		p.Cnd_prov_tax_cd.setLabel(p.Cnd_prov_tax_cd_Label);
		p.Cnd_prov_tax_nm = p.beansFactory.createTextField("Cnd.prov_tax_nm");
		p.Cnd_tax_abl_only_flg = p.beansFactory.createCheckBox("Cnd.tax_abl_only_flg");
		p.Cnd_memo1_Label = p.beansFactory.createLabel("Cnd.memo1_Label");
		p.Cnd_memo1 = p.beansFactory.createTextField("Cnd.memo1");
		p.Cnd_memo1.setLabel(p.Cnd_memo1_Label);
		p.Cnd_memo2_Label = p.beansFactory.createLabel("Cnd.memo2_Label");
		p.Cnd_memo2 = p.beansFactory.createTextField("Cnd.memo2");
		p.Cnd_memo2.setLabel(p.Cnd_memo2_Label);
		p.Cnd_memo3_Label = p.beansFactory.createLabel("Cnd.memo3_Label");
		p.Cnd_memo3 = p.beansFactory.createTextField("Cnd.memo3");
		p.Cnd_memo3.setLabel(p.Cnd_memo3_Label);
		p.Cnd_memo4_Label = p.beansFactory.createLabel("Cnd.memo4_Label");
		p.Cnd_memo4 = p.beansFactory.createTextField("Cnd.memo4");
		p.Cnd_memo4.setLabel(p.Cnd_memo4_Label);
		p.Cnd_memo5_Label = p.beansFactory.createLabel("Cnd.memo5_Label");
		p.Cnd_memo5 = p.beansFactory.createTextField("Cnd.memo5");
		p.Cnd_memo5.setLabel(p.Cnd_memo5_Label);
		p.Cnd_memo6_Label = p.beansFactory.createLabel("Cnd.memo6_Label");
		p.Cnd_memo6 = p.beansFactory.createTextField("Cnd.memo6");
		p.Cnd_memo6.setLabel(p.Cnd_memo6_Label);
		p.Cnd_memo7_Label = p.beansFactory.createLabel("Cnd.memo7_Label");
		p.Cnd_memo7 = p.beansFactory.createTextField("Cnd.memo7");
		p.Cnd_memo7.setLabel(p.Cnd_memo7_Label);
		p.Cnd_memo8_Label = p.beansFactory.createLabel("Cnd.memo8_Label");
		p.Cnd_memo8 = p.beansFactory.createTextField("Cnd.memo8");
		p.Cnd_memo8.setLabel(p.Cnd_memo8_Label);
		p.Cnd_memo9_Label = p.beansFactory.createLabel("Cnd.memo9_Label");
		p.Cnd_memo9 = p.beansFactory.createTextField("Cnd.memo9");
		p.Cnd_memo9.setLabel(p.Cnd_memo9_Label);
		p.Cnd_memo10_Label = p.beansFactory.createLabel("Cnd.memo10_Label");
		p.Cnd_memo10 = p.beansFactory.createTextField("Cnd.memo10");
		p.Cnd_memo10.setLabel(p.Cnd_memo10_Label);
		p.Cnd_memo11_Label = p.beansFactory.createLabel("Cnd.memo11_Label");
		p.Cnd_memo11 = p.beansFactory.createTextField("Cnd.memo11");
		p.Cnd_memo11.setLabel(p.Cnd_memo11_Label);
		p.Cnd_memo12_Label = p.beansFactory.createLabel("Cnd.memo12_Label");
		p.Cnd_memo12 = p.beansFactory.createTextField("Cnd.memo12");
		p.Cnd_memo12.setLabel(p.Cnd_memo12_Label);
		p.Cnd_memo13_Label = p.beansFactory.createLabel("Cnd.memo13_Label");
		p.Cnd_memo13 = p.beansFactory.createTextField("Cnd.memo13");
		p.Cnd_memo13.setLabel(p.Cnd_memo13_Label);
		p.Cnd_memo14_Label = p.beansFactory.createLabel("Cnd.memo14_Label");
		p.Cnd_memo14 = p.beansFactory.createTextField("Cnd.memo14");
		p.Cnd_memo14.setLabel(p.Cnd_memo14_Label);
		p.Cnd_memo15_Label = p.beansFactory.createLabel("Cnd.memo15_Label");
		p.Cnd_memo15 = p.beansFactory.createTextField("Cnd.memo15");
		p.Cnd_memo15.setLabel(p.Cnd_memo15_Label);
		p.Cnd_memo16_Label = p.beansFactory.createLabel("Cnd.memo16_Label");
		p.Cnd_memo16 = p.beansFactory.createTextField("Cnd.memo16");
		p.Cnd_memo16.setLabel(p.Cnd_memo16_Label);
		p.Cnd_memo17_Label = p.beansFactory.createLabel("Cnd.memo17_Label");
		p.Cnd_memo17 = p.beansFactory.createTextField("Cnd.memo17");
		p.Cnd_memo17.setLabel(p.Cnd_memo17_Label);
		p.Cnd_memo18_Label = p.beansFactory.createLabel("Cnd.memo18_Label");
		p.Cnd_memo18 = p.beansFactory.createTextField("Cnd.memo18");
		p.Cnd_memo18.setLabel(p.Cnd_memo18_Label);
		p.Cnd_memo19_Label = p.beansFactory.createLabel("Cnd.memo19_Label");
		p.Cnd_memo19 = p.beansFactory.createTextField("Cnd.memo19");
		p.Cnd_memo19.setLabel(p.Cnd_memo19_Label);
		p.Cnd_memo20_Label = p.beansFactory.createLabel("Cnd.memo20_Label");
		p.Cnd_memo20 = p.beansFactory.createTextField("Cnd.memo20");
		p.Cnd_memo20.setLabel(p.Cnd_memo20_Label);
		p.Cnd_del_flg_lab = p.beansFactory.createLabel("Cnd.del_flg_lab");
		p.Cnd_off_del_flg = p.beansFactory.createCheckBox("Cnd.off_del_flg");
		p.Cnd_on_del_flg = p.beansFactory.createCheckBox("Cnd.on_del_flg");
		p.Cnd_bp_grp_cd1_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd1_Label");
		p.Cnd_bp_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd1");
		p.Cnd_bp_grp_cd1.setLabel(p.Cnd_bp_grp_cd1_Label);
		p.Cnd_bp_grp_nm1 = p.beansFactory.createTextField("Cnd.bp_grp_nm1");
		p.Cnd_bp_grp_cd2_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd2_Label");
		p.Cnd_bp_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd2");
		p.Cnd_bp_grp_cd2.setLabel(p.Cnd_bp_grp_cd2_Label);
		p.Cnd_bp_grp_nm2 = p.beansFactory.createTextField("Cnd.bp_grp_nm2");
		p.Cnd_bp_grp_cd3_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd3_Label");
		p.Cnd_bp_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd3");
		p.Cnd_bp_grp_cd3.setLabel(p.Cnd_bp_grp_cd3_Label);
		p.Cnd_bp_grp_nm3 = p.beansFactory.createTextField("Cnd.bp_grp_nm3");
		p.Cnd_bp_grp_cd4_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd4_Label");
		p.Cnd_bp_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd4");
		p.Cnd_bp_grp_cd4.setLabel(p.Cnd_bp_grp_cd4_Label);
		p.Cnd_bp_grp_nm4 = p.beansFactory.createTextField("Cnd.bp_grp_nm4");
		p.Cnd_bp_grp_cd5_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd5_Label");
		p.Cnd_bp_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd5");
		p.Cnd_bp_grp_cd5.setLabel(p.Cnd_bp_grp_cd5_Label);
		p.Cnd_bp_grp_nm5 = p.beansFactory.createTextField("Cnd.bp_grp_nm5");
		p.Cnd_bp_grp_cd6_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd6_Label");
		p.Cnd_bp_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd6");
		p.Cnd_bp_grp_cd6.setLabel(p.Cnd_bp_grp_cd6_Label);
		p.Cnd_bp_grp_nm6 = p.beansFactory.createTextField("Cnd.bp_grp_nm6");
		p.Cnd_bp_grp_cd7_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd7_Label");
		p.Cnd_bp_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd7");
		p.Cnd_bp_grp_cd7.setLabel(p.Cnd_bp_grp_cd7_Label);
		p.Cnd_bp_grp_nm7 = p.beansFactory.createTextField("Cnd.bp_grp_nm7");
		p.Cnd_bp_grp_cd8_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd8_Label");
		p.Cnd_bp_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd8");
		p.Cnd_bp_grp_cd8.setLabel(p.Cnd_bp_grp_cd8_Label);
		p.Cnd_bp_grp_nm8 = p.beansFactory.createTextField("Cnd.bp_grp_nm8");
		p.Cnd_bp_grp_cd9_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd9_Label");
		p.Cnd_bp_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd9");
		p.Cnd_bp_grp_cd9.setLabel(p.Cnd_bp_grp_cd9_Label);
		p.Cnd_bp_grp_nm9 = p.beansFactory.createTextField("Cnd.bp_grp_nm9");
		p.Cnd_bp_grp_cd10_Label = p.beansFactory.createLabel("Cnd.bp_grp_cd10_Label");
		p.Cnd_bp_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.bp_grp_cd10");
		p.Cnd_bp_grp_cd10.setLabel(p.Cnd_bp_grp_cd10_Label);
		p.Cnd_bp_grp_nm10 = p.beansFactory.createTextField("Cnd.bp_grp_nm10");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABCP_BpSubReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MABCP_BpSubReg p) {
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
	protected static void jbfInitDtl(MABCP_BpSubReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_bp_cd = p.beansFactory.createTableColumn("Dtl.bp_cd", MCColumnType.TEXT);
		p.columnDtl_bp_nm = p.beansFactory.createTableColumn("Dtl.bp_nm", MCColumnType.TEXT);
		p.columnDtl_cst_flg = p.beansFactory.createTableColumn("Dtl.cst_flg", MCColumnType.CHECK);
		p.columnDtl_acst_flg = p.beansFactory.createTableColumn("Dtl.acst_flg", MCColumnType.CHECK);
		p.columnDtl_bcst_flg = p.beansFactory.createTableColumn("Dtl.bcst_flg", MCColumnType.CHECK);
		p.columnDtl_rcst_flg = p.beansFactory.createTableColumn("Dtl.rcst_flg", MCColumnType.CHECK);
		p.columnDtl_sppl_flg = p.beansFactory.createTableColumn("Dtl.sppl_flg", MCColumnType.CHECK);
		p.columnDtl_asppl_flg = p.beansFactory.createTableColumn("Dtl.asppl_flg", MCColumnType.CHECK);
		p.columnDtl_bsppl_flg = p.beansFactory.createTableColumn("Dtl.bsppl_flg", MCColumnType.CHECK);
		p.columnDtl_psppl_flg = p.beansFactory.createTableColumn("Dtl.psppl_flg", MCColumnType.CHECK);
		p.columnDtl_cred_flg = p.beansFactory.createTableColumn("Dtl.cred_flg", MCColumnType.CHECK);
		p.columnDtl_dlv_flg = p.beansFactory.createTableColumn("Dtl.dlv_flg", MCColumnType.CHECK);
		p.columnDtl_maker_flg = p.beansFactory.createTableColumn("Dtl.maker_flg", MCColumnType.CHECK);
		p.columnDtl_dest_flg = p.beansFactory.createTableColumn("Dtl.dest_flg", MCColumnType.CHECK);
		p.columnDtl_ar_dpt_typ = p.beansFactory.createTableColumn("Dtl.ar_dpt_typ", MCColumnType.TEXT);
		p.columnDtl_bill_dpt_typ = p.beansFactory.createTableColumn("Dtl.bill_dpt_typ", MCColumnType.TEXT);
		p.columnDtl_onr_prsppl_flg = p.beansFactory.createTableColumn("Dtl.onr_prsppl_flg", MCColumnType.CHECK);
		p.columnDtl_repurc_obli_flg = p.beansFactory.createTableColumn("Dtl.repurc_obli_flg", MCColumnType.CHECK);
		p.columnDtl_zip_cd = p.beansFactory.createTableColumn("Dtl.zip_cd", MCColumnType.TEXT);
		p.columnDtl_addr1 = p.beansFactory.createTableColumn("Dtl.addr1", MCColumnType.TEXT);
		p.columnDtl_addr2 = p.beansFactory.createTableColumn("Dtl.addr2", MCColumnType.TEXT);
		p.columnDtl_addr3 = p.beansFactory.createTableColumn("Dtl.addr3", MCColumnType.TEXT);
		p.columnDtl_addr4 = p.beansFactory.createTableColumn("Dtl.addr4", MCColumnType.TEXT);
		p.columnDtl_tel = p.beansFactory.createTableColumn("Dtl.tel", MCColumnType.TEXT);
		p.columnDtl_fax = p.beansFactory.createTableColumn("Dtl.fax", MCColumnType.TEXT);
		p.columnDtl_ar_dpt_cd = p.beansFactory.createTableColumn("Dtl.ar_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ar_dpt_nm = p.beansFactory.createTableColumn("Dtl.ar_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_cst_cntct_dpt = p.beansFactory.createTableColumn("Dtl.cst_cntct_dpt", MCColumnType.TEXT);
		p.columnDtl_cst_cntct_psn = p.beansFactory.createTableColumn("Dtl.cst_cntct_psn", MCColumnType.TEXT);
		p.columnDtl_cst_cntct_psn_title = p.beansFactory.createTableColumn("Dtl.cst_cntct_psn_title", MCColumnType.TEXT);
		p.columnDtl_sls_tax_cd = p.beansFactory.createTableColumn("Dtl.sls_tax_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_sls_tax_nm = p.beansFactory.createTableColumn("Dtl.sls_tax_nm", MCColumnType.TEXT);
		p.columnDtl_sls_anly_cd1 = p.beansFactory.createTableColumn("Dtl.sls_anly_cd1", MCColumnType.TEXT_COMBO);
		p.columnDtl_sls_anly_nm1 = p.beansFactory.createTableColumn("Dtl.sls_anly_nm1", MCColumnType.TEXT);
		p.columnDtl_sls_anly_cd2 = p.beansFactory.createTableColumn("Dtl.sls_anly_cd2", MCColumnType.TEXT_COMBO);
		p.columnDtl_sls_anly_nm2 = p.beansFactory.createTableColumn("Dtl.sls_anly_nm2", MCColumnType.TEXT);
		p.columnDtl_sls_anly_cd3 = p.beansFactory.createTableColumn("Dtl.sls_anly_cd3", MCColumnType.TEXT_COMBO);
		p.columnDtl_sls_anly_nm3 = p.beansFactory.createTableColumn("Dtl.sls_anly_nm3", MCColumnType.TEXT);
		p.columnDtl_bcst_dpt_cd = p.beansFactory.createTableColumn("Dtl.bcst_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_bcst_dpt_nm = p.beansFactory.createTableColumn("Dtl.bcst_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_bill_zip_cd = p.beansFactory.createTableColumn("Dtl.bill_zip_cd", MCColumnType.TEXT);
		p.columnDtl_bill_addr1 = p.beansFactory.createTableColumn("Dtl.bill_addr1", MCColumnType.TEXT);
		p.columnDtl_bill_addr2 = p.beansFactory.createTableColumn("Dtl.bill_addr2", MCColumnType.TEXT);
		p.columnDtl_bill_addr3 = p.beansFactory.createTableColumn("Dtl.bill_addr3", MCColumnType.TEXT);
		p.columnDtl_bill_addr4 = p.beansFactory.createTableColumn("Dtl.bill_addr4", MCColumnType.TEXT);
		p.columnDtl_bill_tel = p.beansFactory.createTableColumn("Dtl.bill_tel", MCColumnType.TEXT);
		p.columnDtl_bill_bcst_nm = p.beansFactory.createTableColumn("Dtl.bill_bcst_nm", MCColumnType.TEXT);
		p.columnDtl_bill_bcst_dpt = p.beansFactory.createTableColumn("Dtl.bill_bcst_dpt", MCColumnType.TEXT);
		p.columnDtl_bill_bcst_psn = p.beansFactory.createTableColumn("Dtl.bill_bcst_psn", MCColumnType.TEXT);
		p.columnDtl_bill_bcst_psn_title = p.beansFactory.createTableColumn("Dtl.bill_bcst_psn_title", MCColumnType.TEXT);
		p.columnDtl_vmi_purc_dpt_cd = p.beansFactory.createTableColumn("Dtl.vmi_purc_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_vmi_purc_dpt_nm = p.beansFactory.createTableColumn("Dtl.vmi_purc_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_sppl_cntct_dpt = p.beansFactory.createTableColumn("Dtl.sppl_cntct_dpt", MCColumnType.TEXT);
		p.columnDtl_sppl_cntct_psn = p.beansFactory.createTableColumn("Dtl.sppl_cntct_psn", MCColumnType.TEXT);
		p.columnDtl_sppl_cntct_psn_title = p.beansFactory.createTableColumn("Dtl.sppl_cntct_psn_title", MCColumnType.TEXT);
		p.columnDtl_purc_tax_cd = p.beansFactory.createTableColumn("Dtl.purc_tax_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_purc_tax_nm = p.beansFactory.createTableColumn("Dtl.purc_tax_nm", MCColumnType.TEXT);
		p.columnDtl_prov_tax_cd = p.beansFactory.createTableColumn("Dtl.prov_tax_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_prov_tax_nm = p.beansFactory.createTableColumn("Dtl.prov_tax_nm", MCColumnType.TEXT);
		p.columnDtl_ap_dpt_cd = p.beansFactory.createTableColumn("Dtl.ap_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ap_dpt_nm = p.beansFactory.createTableColumn("Dtl.ap_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_bsppl_dpt_cd = p.beansFactory.createTableColumn("Dtl.bsppl_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_bsppl_dpt_nm = p.beansFactory.createTableColumn("Dtl.bsppl_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_pay_dpt_cd = p.beansFactory.createTableColumn("Dtl.pay_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_pay_dpt_nm = p.beansFactory.createTableColumn("Dtl.pay_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_dlv_cntct_dpt = p.beansFactory.createTableColumn("Dtl.dlv_cntct_dpt", MCColumnType.TEXT);
		p.columnDtl_dlv_cntct_psn = p.beansFactory.createTableColumn("Dtl.dlv_cntct_psn", MCColumnType.TEXT);
		p.columnDtl_dlv_cntct_psn_title = p.beansFactory.createTableColumn("Dtl.dlv_cntct_psn_title", MCColumnType.TEXT);
		p.columnDtl_memo1 = p.beansFactory.createTableColumn("Dtl.memo1", MCColumnType.TEXT);
		p.columnDtl_memo2 = p.beansFactory.createTableColumn("Dtl.memo2", MCColumnType.TEXT);
		p.columnDtl_memo3 = p.beansFactory.createTableColumn("Dtl.memo3", MCColumnType.TEXT);
		p.columnDtl_memo4 = p.beansFactory.createTableColumn("Dtl.memo4", MCColumnType.TEXT);
		p.columnDtl_memo5 = p.beansFactory.createTableColumn("Dtl.memo5", MCColumnType.TEXT);
		p.columnDtl_memo6 = p.beansFactory.createTableColumn("Dtl.memo6", MCColumnType.TEXT);
		p.columnDtl_memo7 = p.beansFactory.createTableColumn("Dtl.memo7", MCColumnType.TEXT);
		p.columnDtl_memo8 = p.beansFactory.createTableColumn("Dtl.memo8", MCColumnType.TEXT);
		p.columnDtl_memo9 = p.beansFactory.createTableColumn("Dtl.memo9", MCColumnType.TEXT);
		p.columnDtl_memo10 = p.beansFactory.createTableColumn("Dtl.memo10", MCColumnType.TEXT);
		p.columnDtl_memo11 = p.beansFactory.createTableColumn("Dtl.memo11", MCColumnType.TEXT);
		p.columnDtl_memo12 = p.beansFactory.createTableColumn("Dtl.memo12", MCColumnType.TEXT);
		p.columnDtl_memo13 = p.beansFactory.createTableColumn("Dtl.memo13", MCColumnType.TEXT);
		p.columnDtl_memo14 = p.beansFactory.createTableColumn("Dtl.memo14", MCColumnType.TEXT);
		p.columnDtl_memo15 = p.beansFactory.createTableColumn("Dtl.memo15", MCColumnType.TEXT);
		p.columnDtl_memo16 = p.beansFactory.createTableColumn("Dtl.memo16", MCColumnType.TEXT);
		p.columnDtl_memo17 = p.beansFactory.createTableColumn("Dtl.memo17", MCColumnType.TEXT);
		p.columnDtl_memo18 = p.beansFactory.createTableColumn("Dtl.memo18", MCColumnType.TEXT);
		p.columnDtl_memo19 = p.beansFactory.createTableColumn("Dtl.memo19", MCColumnType.TEXT);
		p.columnDtl_memo20 = p.beansFactory.createTableColumn("Dtl.memo20", MCColumnType.TEXT);
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
	protected static void jbfInitBtn(MABCP_BpSubReg p) {
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
	protected static void jbfInitEastBtn(MABCP_BpSubReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_BpSubReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.MstPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMst(MABCP_BpSubReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.TopPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP0420.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_BpSubReg p) {
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
	protected static void jbInitFold(MABCP_BpSubReg p) {
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
	protected static void jbInitTab1(MABCP_BpSubReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MABCP_BpSubReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_BpSubReg p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.BulkSetPanel);
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
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.ope_META);
		p.Tab1Panel.add(p.Cnd_dt_p_PPanel);
		p.Tab1Panel.setLastBeans(p.Cnd_dt_p_PPanel);
		p.Cnd_dt_p_PPanel.setNextBeans(p.Cnd_cst_flg);
		p.Tab1Panel.add(p.Cnd_cst_flg);
		p.Cnd_cst_flg.setNextBeans(p.Cnd_acst_flg);
		p.Cnd_cst_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.cst_flg_META);
		p.Tab1Panel.add(p.Cnd_acst_flg);
		p.Cnd_acst_flg.setNextBeans(p.Cnd_bcst_flg);
		p.Cnd_acst_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.acst_flg_META);
		p.Tab1Panel.add(p.Cnd_bcst_flg);
		p.Cnd_bcst_flg.setNextBeans(p.Cnd_rcst_flg);
		p.Cnd_bcst_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bcst_flg_META);
		p.Tab1Panel.add(p.Cnd_rcst_flg);
		p.Cnd_rcst_flg.setNextBeans(p.Cnd_dlv_flg);
		p.Cnd_rcst_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.rcst_flg_META);
		p.Tab1Panel.add(p.Cnd_dlv_flg);
		p.Cnd_dlv_flg.setNextBeans(p.Cnd_dest_flg);
		p.Cnd_dlv_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.dlv_flg_META);
		p.Tab1Panel.add(p.Cnd_dest_flg);
		p.Cnd_dest_flg.setNextBeans(p.Cnd_cred_flg);
		p.Cnd_dest_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.dest_flg_META);
		p.Tab1Panel.add(p.Cnd_cred_flg);
		p.Cnd_cred_flg.setNextBeans(p.Cnd_sppl_flg);
		p.Cnd_cred_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.cred_flg_META);
		p.Tab1Panel.add(p.Cnd_sppl_flg);
		p.Cnd_sppl_flg.setNextBeans(p.Cnd_asppl_flg);
		p.Cnd_sppl_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.sppl_flg_META);
		p.Tab1Panel.add(p.Cnd_asppl_flg);
		p.Cnd_asppl_flg.setNextBeans(p.Cnd_bsppl_flg);
		p.Cnd_asppl_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.asppl_flg_META);
		p.Tab1Panel.add(p.Cnd_bsppl_flg);
		p.Cnd_bsppl_flg.setNextBeans(p.Cnd_psppl_flg);
		p.Cnd_bsppl_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bsppl_flg_META);
		p.Tab1Panel.add(p.Cnd_psppl_flg);
		p.Cnd_psppl_flg.setNextBeans(p.Cnd_maker_flg);
		p.Cnd_psppl_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.psppl_flg_META);
		p.Tab1Panel.add(p.Cnd_maker_flg);
		p.Cnd_maker_flg.setNextBeans(p.Cnd_cnd_select_all);
		p.Cnd_maker_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.maker_flg_META);
		p.Cnd_cnd_select_all.setIcon("SELECT_ALL");
		p.Tab1Panel.add(p.Cnd_cnd_select_all);
		p.Cnd_cnd_select_all.setNextBeans(p.Cnd_cnd_deselect_all);
		p.Cnd_cnd_deselect_all.setIcon("DESELECT_ALL");
		p.Tab1Panel.add(p.Cnd_cnd_deselect_all);
		p.Cnd_cnd_deselect_all.setNextBeans(p.Cnd_bp_cd);
		p.Tab1Panel.add(p.Cnd_bp_cd_Label);
		p.Tab1Panel.add(p.Cnd_bp_cd);
		p.Cnd_bp_cd.setNextBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_cd_META);
		p.Cnd_bp_cd.addLinkBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_cd, true);
		p.Tab1Panel.add(p.Cnd_bp_nm);
		p.Cnd_bp_nm.setNextBeans(p.Cnd_ref_ins_flg);
		p.Cnd_bp_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_nm_META);
		p.setPluralValueEnable(p.Cnd_bp_nm, true);
		p.Tab1Panel.add(p.Cnd_ref_ins_flg);
		p.Cnd_ref_ins_flg.setNextBeans(p.Cnd_new_st_dt);
		p.Cnd_ref_ins_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.ref_ins_flg_META);
		p.Tab1Panel.add(p.Cnd_new_st_dt_Label);
		p.Tab1Panel.add(p.Cnd_new_st_dt);
		p.Cnd_new_st_dt.setNextBeans(p.Cnd_dpt_cd);
		p.Cnd_new_st_dt.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.new_st_dt_META);
		p.Cnd_new_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Tab1Panel.add(p.Cnd_dpt_cd_Label);
		p.Tab1Panel.add(p.Cnd_dpt_cd);
		p.Cnd_dpt_cd.setNextBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.dpt_cd_META);
		p.Cnd_dpt_cd.addLinkBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_cd, true);
		p.Tab1Panel.add(p.Cnd_dpt_nm);
		p.Cnd_dpt_nm.setNextBeans(p.Cnd_vmi_purc_dpt_cd);
		p.Cnd_dpt_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm, true);
		p.Tab1Panel.add(p.Cnd_vmi_purc_dpt_cd_Label);
		p.Tab1Panel.add(p.Cnd_vmi_purc_dpt_cd);
		p.Cnd_vmi_purc_dpt_cd.setNextBeans(p.Cnd_vmi_purc_dpt_nm);
		p.Cnd_vmi_purc_dpt_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.vmi_purc_dpt_cd_META);
		p.Cnd_vmi_purc_dpt_cd.addLinkBeans(p.Cnd_vmi_purc_dpt_nm);
		p.Cnd_vmi_purc_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_vmi_purc_dpt_cd, true);
		p.Tab1Panel.add(p.Cnd_vmi_purc_dpt_nm);
		p.Cnd_vmi_purc_dpt_nm.setNextBeans(p.Cnd_ar_dpt_cd);
		p.Cnd_vmi_purc_dpt_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.vmi_purc_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_vmi_purc_dpt_nm, true);
		p.Tab1Panel.add(p.Cnd_ar_dpt_cd_Label);
		p.Tab1Panel.add(p.Cnd_ar_dpt_cd);
		p.Cnd_ar_dpt_cd.setNextBeans(p.Cnd_ar_dpt_nm);
		p.Cnd_ar_dpt_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.ar_dpt_cd_META);
		p.Cnd_ar_dpt_cd.addLinkBeans(p.Cnd_ar_dpt_nm);
		p.Cnd_ar_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ar_dpt_cd, true);
		p.Tab1Panel.add(p.Cnd_ar_dpt_nm);
		p.Cnd_ar_dpt_nm.setNextBeans(p.Cnd_bcst_dpt_cd);
		p.Cnd_ar_dpt_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.ar_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_ar_dpt_nm, true);
		p.Tab1Panel.add(p.Cnd_bcst_dpt_cd_Label);
		p.Tab1Panel.add(p.Cnd_bcst_dpt_cd);
		p.Cnd_bcst_dpt_cd.setNextBeans(p.Cnd_bcst_dpt_nm);
		p.Cnd_bcst_dpt_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bcst_dpt_cd_META);
		p.Cnd_bcst_dpt_cd.addLinkBeans(p.Cnd_bcst_dpt_nm);
		p.Cnd_bcst_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bcst_dpt_cd, true);
		p.Tab1Panel.add(p.Cnd_bcst_dpt_nm);
		p.Cnd_bcst_dpt_nm.setNextBeans(p.Cnd_ap_dpt_cd);
		p.Cnd_bcst_dpt_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bcst_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_bcst_dpt_nm, true);
		p.Tab1Panel.add(p.Cnd_ap_dpt_cd_Label);
		p.Tab1Panel.add(p.Cnd_ap_dpt_cd);
		p.Cnd_ap_dpt_cd.setNextBeans(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.ap_dpt_cd_META);
		p.Cnd_ap_dpt_cd.addLinkBeans(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ap_dpt_cd, true);
		p.Tab1Panel.add(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_nm.setNextBeans(p.Cnd_bsppl_dpt_cd);
		p.Cnd_ap_dpt_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.ap_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_ap_dpt_nm, true);
		p.Tab1Panel.add(p.Cnd_bsppl_dpt_cd_Label);
		p.Tab1Panel.add(p.Cnd_bsppl_dpt_cd);
		p.Cnd_bsppl_dpt_cd.setNextBeans(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bsppl_dpt_cd_META);
		p.Cnd_bsppl_dpt_cd.addLinkBeans(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bsppl_dpt_cd, true);
		p.Tab1Panel.add(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_nm.setNextBeans(p.Cnd_pay_dpt_cd);
		p.Cnd_bsppl_dpt_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bsppl_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_bsppl_dpt_nm, true);
		p.Tab1Panel.add(p.Cnd_pay_dpt_cd_Label);
		p.Tab1Panel.add(p.Cnd_pay_dpt_cd);
		p.Cnd_pay_dpt_cd.setNextBeans(p.Cnd_pay_dpt_nm);
		p.Cnd_pay_dpt_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.pay_dpt_cd_META);
		p.Cnd_pay_dpt_cd.addLinkBeans(p.Cnd_pay_dpt_nm);
		p.Cnd_pay_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pay_dpt_cd, true);
		p.Tab1Panel.add(p.Cnd_pay_dpt_nm);
		p.Cnd_pay_dpt_nm.setNextBeans(p.Cnd_sls_tax_cd);
		p.Cnd_pay_dpt_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.pay_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_pay_dpt_nm, true);
		p.Cnd_sls_tax_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_tax_cd, true);
		p.Cnd_sls_tax_cd.setLinkBeans(p.Cnd_sls_tax_nm);
		p.Tab1Panel.add(p.Cnd_sls_tax_cd_Label);
		p.Tab1Panel.add(p.Cnd_sls_tax_cd);
		p.Cnd_sls_tax_cd.setNextBeans(p.Cnd_sls_tax_nm);
		p.Cnd_sls_tax_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.sls_tax_cd_META);
		p.Tab1Panel.add(p.Cnd_sls_tax_nm);
		p.Cnd_sls_tax_nm.setNextBeans(p.Cnd_purc_tax_cd);
		p.Cnd_sls_tax_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.sls_tax_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_tax_nm, true);
		p.Cnd_purc_tax_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_purc_tax_cd, true);
		p.Cnd_purc_tax_cd.setLinkBeans(p.Cnd_purc_tax_nm);
		p.Tab1Panel.add(p.Cnd_purc_tax_cd_Label);
		p.Tab1Panel.add(p.Cnd_purc_tax_cd);
		p.Cnd_purc_tax_cd.setNextBeans(p.Cnd_purc_tax_nm);
		p.Cnd_purc_tax_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.purc_tax_cd_META);
		p.Tab1Panel.add(p.Cnd_purc_tax_nm);
		p.Cnd_purc_tax_nm.setNextBeans(p.Cnd_prov_tax_cd);
		p.Cnd_purc_tax_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.purc_tax_nm_META);
		p.setPluralValueEnable(p.Cnd_purc_tax_nm, true);
		p.Cnd_prov_tax_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_prov_tax_cd, true);
		p.Cnd_prov_tax_cd.setLinkBeans(p.Cnd_prov_tax_nm);
		p.Tab1Panel.add(p.Cnd_prov_tax_cd_Label);
		p.Tab1Panel.add(p.Cnd_prov_tax_cd);
		p.Cnd_prov_tax_cd.setNextBeans(p.Cnd_prov_tax_nm);
		p.Cnd_prov_tax_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.prov_tax_cd_META);
		p.Tab1Panel.add(p.Cnd_prov_tax_nm);
		p.Cnd_prov_tax_nm.setNextBeans(p.Cnd_tax_abl_only_flg);
		p.Cnd_prov_tax_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.prov_tax_nm_META);
		p.setPluralValueEnable(p.Cnd_prov_tax_nm, true);
		p.Tab1Panel.add(p.Cnd_tax_abl_only_flg);
		p.Cnd_tax_abl_only_flg.setNextBeans(p.Cnd_memo1);
		p.Cnd_tax_abl_only_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.tax_abl_only_flg_META);
		p.Tab1Panel.add(p.Cnd_memo1_Label);
		p.Tab1Panel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.Tab1Panel.add(p.Cnd_memo2_Label);
		p.Tab1Panel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.Tab1Panel.add(p.Cnd_memo3_Label);
		p.Tab1Panel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_memo4);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.Tab1Panel.add(p.Cnd_memo4_Label);
		p.Tab1Panel.add(p.Cnd_memo4);
		p.Cnd_memo4.setNextBeans(p.Cnd_memo5);
		p.Cnd_memo4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.memo4_META);
		p.setPluralValueEnable(p.Cnd_memo4, true);
		p.Tab1Panel.add(p.Cnd_memo5_Label);
		p.Tab1Panel.add(p.Cnd_memo5);
		p.Cnd_memo5.setNextBeans(p.Cnd_memo6);
		p.Cnd_memo5.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.memo5_META);
		p.setPluralValueEnable(p.Cnd_memo5, true);
		p.Tab1Panel.add(p.Cnd_memo6_Label);
		p.Tab1Panel.add(p.Cnd_memo6);
		p.Cnd_memo6.setNextBeans(p.Cnd_memo7);
		p.Cnd_memo6.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.memo6_META);
		p.setPluralValueEnable(p.Cnd_memo6, true);
		p.Tab1Panel.add(p.Cnd_memo7_Label);
		p.Tab1Panel.add(p.Cnd_memo7);
		p.Cnd_memo7.setNextBeans(p.Cnd_memo8);
		p.Cnd_memo7.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.memo7_META);
		p.setPluralValueEnable(p.Cnd_memo7, true);
		p.Tab1Panel.add(p.Cnd_memo8_Label);
		p.Tab1Panel.add(p.Cnd_memo8);
		p.Cnd_memo8.setNextBeans(p.Cnd_memo9);
		p.Cnd_memo8.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.memo8_META);
		p.setPluralValueEnable(p.Cnd_memo8, true);
		p.Tab1Panel.add(p.Cnd_memo9_Label);
		p.Tab1Panel.add(p.Cnd_memo9);
		p.Cnd_memo9.setNextBeans(p.Cnd_memo10);
		p.Cnd_memo9.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.memo9_META);
		p.setPluralValueEnable(p.Cnd_memo9, true);
		p.Tab1Panel.add(p.Cnd_memo10_Label);
		p.Tab1Panel.add(p.Cnd_memo10);
		p.Cnd_memo10.setNextBeans(p.Cnd_memo11);
		p.Cnd_memo10.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.memo10_META);
		p.setPluralValueEnable(p.Cnd_memo10, true);
		p.Tab1Panel.add(p.Cnd_memo11_Label);
		p.Tab1Panel.add(p.Cnd_memo11);
		p.Cnd_memo11.setNextBeans(p.Cnd_memo12);
		p.Cnd_memo11.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.memo11_META);
		p.setPluralValueEnable(p.Cnd_memo11, true);
		p.Tab1Panel.add(p.Cnd_memo12_Label);
		p.Tab1Panel.add(p.Cnd_memo12);
		p.Cnd_memo12.setNextBeans(p.Cnd_memo13);
		p.Cnd_memo12.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.memo12_META);
		p.setPluralValueEnable(p.Cnd_memo12, true);
		p.Tab1Panel.add(p.Cnd_memo13_Label);
		p.Tab1Panel.add(p.Cnd_memo13);
		p.Cnd_memo13.setNextBeans(p.Cnd_memo14);
		p.Cnd_memo13.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.memo13_META);
		p.setPluralValueEnable(p.Cnd_memo13, true);
		p.Tab1Panel.add(p.Cnd_memo14_Label);
		p.Tab1Panel.add(p.Cnd_memo14);
		p.Cnd_memo14.setNextBeans(p.Cnd_memo15);
		p.Cnd_memo14.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.memo14_META);
		p.setPluralValueEnable(p.Cnd_memo14, true);
		p.Tab1Panel.add(p.Cnd_memo15_Label);
		p.Tab1Panel.add(p.Cnd_memo15);
		p.Cnd_memo15.setNextBeans(p.Cnd_memo16);
		p.Cnd_memo15.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.memo15_META);
		p.setPluralValueEnable(p.Cnd_memo15, true);
		p.Tab1Panel.add(p.Cnd_memo16_Label);
		p.Tab1Panel.add(p.Cnd_memo16);
		p.Cnd_memo16.setNextBeans(p.Cnd_memo17);
		p.Cnd_memo16.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.memo16_META);
		p.setPluralValueEnable(p.Cnd_memo16, true);
		p.Tab1Panel.add(p.Cnd_memo17_Label);
		p.Tab1Panel.add(p.Cnd_memo17);
		p.Cnd_memo17.setNextBeans(p.Cnd_memo18);
		p.Cnd_memo17.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.memo17_META);
		p.setPluralValueEnable(p.Cnd_memo17, true);
		p.Tab1Panel.add(p.Cnd_memo18_Label);
		p.Tab1Panel.add(p.Cnd_memo18);
		p.Cnd_memo18.setNextBeans(p.Cnd_memo19);
		p.Cnd_memo18.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.memo18_META);
		p.setPluralValueEnable(p.Cnd_memo18, true);
		p.Tab1Panel.add(p.Cnd_memo19_Label);
		p.Tab1Panel.add(p.Cnd_memo19);
		p.Cnd_memo19.setNextBeans(p.Cnd_memo20);
		p.Cnd_memo19.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.memo19_META);
		p.setPluralValueEnable(p.Cnd_memo19, true);
		p.Tab1Panel.add(p.Cnd_memo20_Label);
		p.Tab1Panel.add(p.Cnd_memo20);
		p.Cnd_memo20.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo20.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.memo20_META);
		p.setPluralValueEnable(p.Cnd_memo20, true);
		p.Tab1Panel.add(p.Cnd_del_flg_lab);
		p.Tab1Panel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.off_del_flg_META);
		p.Tab1Panel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.on_del_flg_META);
		p.Cnd_bp_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd1, true);
		p.Cnd_bp_grp_cd1.setLinkBeans(p.Cnd_bp_grp_nm1);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd1_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd1);
		p.Tab2Panel.setLastBeans(p.Cnd_bp_grp_cd1);
		p.Cnd_bp_grp_cd1.setNextBeans(p.Cnd_bp_grp_nm1);
		p.Cnd_bp_grp_cd1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_grp_cd1_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm1);
		p.Cnd_bp_grp_nm1.setNextBeans(p.Cnd_bp_grp_cd2);
		p.Cnd_bp_grp_nm1.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm1, true);
		p.Cnd_bp_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd2, true);
		p.Cnd_bp_grp_cd2.setLinkBeans(p.Cnd_bp_grp_nm2);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd2_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd2);
		p.Cnd_bp_grp_cd2.setNextBeans(p.Cnd_bp_grp_nm2);
		p.Cnd_bp_grp_cd2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_grp_cd2_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm2);
		p.Cnd_bp_grp_nm2.setNextBeans(p.Cnd_bp_grp_cd3);
		p.Cnd_bp_grp_nm2.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm2, true);
		p.Cnd_bp_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd3, true);
		p.Cnd_bp_grp_cd3.setLinkBeans(p.Cnd_bp_grp_nm3);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd3_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd3);
		p.Cnd_bp_grp_cd3.setNextBeans(p.Cnd_bp_grp_nm3);
		p.Cnd_bp_grp_cd3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_grp_cd3_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm3);
		p.Cnd_bp_grp_nm3.setNextBeans(p.Cnd_bp_grp_cd4);
		p.Cnd_bp_grp_nm3.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm3, true);
		p.Cnd_bp_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd4, true);
		p.Cnd_bp_grp_cd4.setLinkBeans(p.Cnd_bp_grp_nm4);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd4_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd4);
		p.Cnd_bp_grp_cd4.setNextBeans(p.Cnd_bp_grp_nm4);
		p.Cnd_bp_grp_cd4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_grp_cd4_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm4);
		p.Cnd_bp_grp_nm4.setNextBeans(p.Cnd_bp_grp_cd5);
		p.Cnd_bp_grp_nm4.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm4, true);
		p.Cnd_bp_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd5, true);
		p.Cnd_bp_grp_cd5.setLinkBeans(p.Cnd_bp_grp_nm5);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd5_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd5);
		p.Cnd_bp_grp_cd5.setNextBeans(p.Cnd_bp_grp_nm5);
		p.Cnd_bp_grp_cd5.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_grp_cd5_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm5);
		p.Cnd_bp_grp_nm5.setNextBeans(p.Cnd_bp_grp_cd6);
		p.Cnd_bp_grp_nm5.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm5, true);
		p.Cnd_bp_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd6, true);
		p.Cnd_bp_grp_cd6.setLinkBeans(p.Cnd_bp_grp_nm6);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd6_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd6);
		p.Cnd_bp_grp_cd6.setNextBeans(p.Cnd_bp_grp_nm6);
		p.Cnd_bp_grp_cd6.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_grp_cd6_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm6);
		p.Cnd_bp_grp_nm6.setNextBeans(p.Cnd_bp_grp_cd7);
		p.Cnd_bp_grp_nm6.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm6, true);
		p.Cnd_bp_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd7, true);
		p.Cnd_bp_grp_cd7.setLinkBeans(p.Cnd_bp_grp_nm7);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd7_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd7);
		p.Cnd_bp_grp_cd7.setNextBeans(p.Cnd_bp_grp_nm7);
		p.Cnd_bp_grp_cd7.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_grp_cd7_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm7);
		p.Cnd_bp_grp_nm7.setNextBeans(p.Cnd_bp_grp_cd8);
		p.Cnd_bp_grp_nm7.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm7, true);
		p.Cnd_bp_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd8, true);
		p.Cnd_bp_grp_cd8.setLinkBeans(p.Cnd_bp_grp_nm8);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd8_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd8);
		p.Cnd_bp_grp_cd8.setNextBeans(p.Cnd_bp_grp_nm8);
		p.Cnd_bp_grp_cd8.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_grp_cd8_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm8);
		p.Cnd_bp_grp_nm8.setNextBeans(p.Cnd_bp_grp_cd9);
		p.Cnd_bp_grp_nm8.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm8, true);
		p.Cnd_bp_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd9, true);
		p.Cnd_bp_grp_cd9.setLinkBeans(p.Cnd_bp_grp_nm9);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd9_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd9);
		p.Cnd_bp_grp_cd9.setNextBeans(p.Cnd_bp_grp_nm9);
		p.Cnd_bp_grp_cd9.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_grp_cd9_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm9);
		p.Cnd_bp_grp_nm9.setNextBeans(p.Cnd_bp_grp_cd10);
		p.Cnd_bp_grp_nm9.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm9, true);
		p.Cnd_bp_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_grp_cd10, true);
		p.Cnd_bp_grp_cd10.setLinkBeans(p.Cnd_bp_grp_nm10);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd10_Label);
		p.Tab2Panel.add(p.Cnd_bp_grp_cd10);
		p.Cnd_bp_grp_cd10.setNextBeans(p.Cnd_bp_grp_nm10);
		p.Cnd_bp_grp_cd10.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_grp_cd10_META);
		p.Tab2Panel.add(p.Cnd_bp_grp_nm10);
		p.Cnd_bp_grp_nm10.setRow(p.getCndR(), mcframe.clientMABC.MABCP0420.CndR.bp_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_bp_grp_nm10, true);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_BpSubReg p) {
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
	protected static void jbInitBulkSet(MABCP_BpSubReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.DtlPanel);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_st_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_st_dt);
		p.BulkSetPanel.setLastBeans(p.BulkSet_st_dt);
		p.BulkSet_st_dt.setNextBeans(p.BulkSet_end_dt);
		p.BulkSet_st_dt.setRow(p.getBulkSetR(), mcframe.clientMABC.MABCP0420.BulkSetR.st_dt_META);
		p.BulkSet_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_end_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_end_dt);
		p.BulkSet_end_dt.setNextBeans(p.BulkSet_upd_dt);
		p.BulkSet_end_dt.setRow(p.getBulkSetR(), mcframe.clientMABC.MABCP0420.BulkSetR.end_dt_META);
		p.BulkSet_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSet_upd_dt.setFunctionKey(MCFunctionKey.F7);
		p.BulkSetPanel.add(p.BulkSet_upd_dt);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_BpSubReg p) {
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
	protected static void jbInitBtn(MABCP_BpSubReg p) {
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
	protected static void jbInitEastBtn(MABCP_BpSubReg p) {
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
		MABCP_BpSubReg_MC.mcInitScreenOpe((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.mcInitMst((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.mcInitTop((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.mcInitFold((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.mcInitTab1((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.mcInitTab2((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.mcInitCnd((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.mcInitCtrl((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.mcInitBulkSet((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.mcInitDtl((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.mcInitBtn((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.mcInitEastBtn((MABCP_BpSubReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_BpSubReg_MC.statusInitUPD_ScreenOpe((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitUPD_Mst((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitUPD_Top((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitUPD_Fold((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitUPD_Tab1((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitUPD_Tab2((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitUPD_Cnd((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitUPD_Ctrl((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitUPD_BulkSet((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitUPD_Dtl((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitUPD_Btn((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitUPD_EastBtn((MABCP_BpSubReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_BpSubReg_MC.statusInitFIX_ScreenOpe((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitFIX_Mst((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitFIX_Top((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitFIX_Fold((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitFIX_Tab1((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitFIX_Tab2((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitFIX_Cnd((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitFIX_Ctrl((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitFIX_BulkSet((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitFIX_Dtl((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitFIX_Btn((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitFIX_EastBtn((MABCP_BpSubReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_BpSubReg_MC.statusInitDEL_ScreenOpe((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitDEL_Mst((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitDEL_Top((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitDEL_Fold((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitDEL_Tab1((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitDEL_Tab2((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitDEL_Cnd((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitDEL_Ctrl((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitDEL_BulkSet((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitDEL_Dtl((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitDEL_Btn((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitDEL_EastBtn((MABCP_BpSubReg)this);

		// [REF]ステータスのモードの設定
		MABCP_BpSubReg_MC.statusInitREF_ScreenOpe((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitREF_Mst((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitREF_Top((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitREF_Fold((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitREF_Tab1((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitREF_Tab2((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitREF_Cnd((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitREF_Ctrl((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitREF_BulkSet((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitREF_Dtl((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitREF_Btn((MABCP_BpSubReg)this);
		MABCP_BpSubReg_MC.statusInitREF_EastBtn((MABCP_BpSubReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_BpSubReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_BpSubReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_BpSubReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_BpSubReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MABCP_BpSubReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MABCP_BpSubReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_BpSubReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_cst_flg.addAllListener(p);
		p.Cnd_acst_flg.addAllListener(p);
		p.Cnd_bcst_flg.addAllListener(p);
		p.Cnd_rcst_flg.addAllListener(p);
		p.Cnd_dlv_flg.addAllListener(p);
		p.Cnd_dest_flg.addAllListener(p);
		p.Cnd_cred_flg.addAllListener(p);
		p.Cnd_sppl_flg.addAllListener(p);
		p.Cnd_asppl_flg.addAllListener(p);
		p.Cnd_bsppl_flg.addAllListener(p);
		p.Cnd_psppl_flg.addAllListener(p);
		p.Cnd_maker_flg.addAllListener(p);
		p.Cnd_cnd_select_all.addAllListener(p);
		p.Cnd_cnd_select_all.setAPMethodName("doCnd_cnd_select_all");
		p.Cnd_cnd_deselect_all.addAllListener(p);
		p.Cnd_cnd_deselect_all.setAPMethodName("doCnd_cnd_deselect_all");
		p.Cnd_bp_cd.setListListener(p);
		p.Cnd_bp_cd.addAllListener(p);
		p.Cnd_bp_nm.setListListener(p);
		p.Cnd_bp_nm.addAllListener(p);
		p.Cnd_ref_ins_flg.addAllListener(p);
		p.Cnd_new_st_dt.setListListener(p);
		p.Cnd_new_st_dt.addAllListener(p);
		p.Cnd_dpt_cd.setListListener(p);
		p.Cnd_dpt_cd.addAllListener(p);
		p.Cnd_dpt_nm.setListListener(p);
		p.Cnd_dpt_nm.addAllListener(p);
		p.Cnd_vmi_purc_dpt_cd.setListListener(p);
		p.Cnd_vmi_purc_dpt_cd.addAllListener(p);
		p.Cnd_vmi_purc_dpt_nm.setListListener(p);
		p.Cnd_vmi_purc_dpt_nm.addAllListener(p);
		p.Cnd_ar_dpt_cd.setListListener(p);
		p.Cnd_ar_dpt_cd.addAllListener(p);
		p.Cnd_ar_dpt_nm.setListListener(p);
		p.Cnd_ar_dpt_nm.addAllListener(p);
		p.Cnd_bcst_dpt_cd.setListListener(p);
		p.Cnd_bcst_dpt_cd.addAllListener(p);
		p.Cnd_bcst_dpt_nm.setListListener(p);
		p.Cnd_bcst_dpt_nm.addAllListener(p);
		p.Cnd_ap_dpt_cd.setListListener(p);
		p.Cnd_ap_dpt_cd.addAllListener(p);
		p.Cnd_ap_dpt_nm.setListListener(p);
		p.Cnd_ap_dpt_nm.addAllListener(p);
		p.Cnd_bsppl_dpt_cd.setListListener(p);
		p.Cnd_bsppl_dpt_cd.addAllListener(p);
		p.Cnd_bsppl_dpt_nm.setListListener(p);
		p.Cnd_bsppl_dpt_nm.addAllListener(p);
		p.Cnd_pay_dpt_cd.setListListener(p);
		p.Cnd_pay_dpt_cd.addAllListener(p);
		p.Cnd_pay_dpt_nm.setListListener(p);
		p.Cnd_pay_dpt_nm.addAllListener(p);
		p.Cnd_sls_tax_cd.setListListener(p);
		p.Cnd_sls_tax_cd.addAllListener(p);
		p.Cnd_sls_tax_nm.setListListener(p);
		p.Cnd_sls_tax_nm.addAllListener(p);
		p.Cnd_purc_tax_cd.setListListener(p);
		p.Cnd_purc_tax_cd.addAllListener(p);
		p.Cnd_purc_tax_nm.setListListener(p);
		p.Cnd_purc_tax_nm.addAllListener(p);
		p.Cnd_prov_tax_cd.setListListener(p);
		p.Cnd_prov_tax_cd.addAllListener(p);
		p.Cnd_prov_tax_nm.setListListener(p);
		p.Cnd_prov_tax_nm.addAllListener(p);
		p.Cnd_tax_abl_only_flg.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
		p.Cnd_memo4.setListListener(p);
		p.Cnd_memo4.addAllListener(p);
		p.Cnd_memo5.setListListener(p);
		p.Cnd_memo5.addAllListener(p);
		p.Cnd_memo6.setListListener(p);
		p.Cnd_memo6.addAllListener(p);
		p.Cnd_memo7.setListListener(p);
		p.Cnd_memo7.addAllListener(p);
		p.Cnd_memo8.setListListener(p);
		p.Cnd_memo8.addAllListener(p);
		p.Cnd_memo9.setListListener(p);
		p.Cnd_memo9.addAllListener(p);
		p.Cnd_memo10.setListListener(p);
		p.Cnd_memo10.addAllListener(p);
		p.Cnd_memo11.setListListener(p);
		p.Cnd_memo11.addAllListener(p);
		p.Cnd_memo12.setListListener(p);
		p.Cnd_memo12.addAllListener(p);
		p.Cnd_memo13.setListListener(p);
		p.Cnd_memo13.addAllListener(p);
		p.Cnd_memo14.setListListener(p);
		p.Cnd_memo14.addAllListener(p);
		p.Cnd_memo15.setListListener(p);
		p.Cnd_memo15.addAllListener(p);
		p.Cnd_memo16.setListListener(p);
		p.Cnd_memo16.addAllListener(p);
		p.Cnd_memo17.setListListener(p);
		p.Cnd_memo17.addAllListener(p);
		p.Cnd_memo18.setListListener(p);
		p.Cnd_memo18.addAllListener(p);
		p.Cnd_memo19.setListListener(p);
		p.Cnd_memo19.addAllListener(p);
		p.Cnd_memo20.setListListener(p);
		p.Cnd_memo20.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
		p.Cnd_bp_grp_cd1.setListListener(p);
		p.Cnd_bp_grp_cd1.addAllListener(p);
		p.Cnd_bp_grp_nm1.setListListener(p);
		p.Cnd_bp_grp_nm1.addAllListener(p);
		p.Cnd_bp_grp_cd2.setListListener(p);
		p.Cnd_bp_grp_cd2.addAllListener(p);
		p.Cnd_bp_grp_nm2.setListListener(p);
		p.Cnd_bp_grp_nm2.addAllListener(p);
		p.Cnd_bp_grp_cd3.setListListener(p);
		p.Cnd_bp_grp_cd3.addAllListener(p);
		p.Cnd_bp_grp_nm3.setListListener(p);
		p.Cnd_bp_grp_nm3.addAllListener(p);
		p.Cnd_bp_grp_cd4.setListListener(p);
		p.Cnd_bp_grp_cd4.addAllListener(p);
		p.Cnd_bp_grp_nm4.setListListener(p);
		p.Cnd_bp_grp_nm4.addAllListener(p);
		p.Cnd_bp_grp_cd5.setListListener(p);
		p.Cnd_bp_grp_cd5.addAllListener(p);
		p.Cnd_bp_grp_nm5.setListListener(p);
		p.Cnd_bp_grp_nm5.addAllListener(p);
		p.Cnd_bp_grp_cd6.setListListener(p);
		p.Cnd_bp_grp_cd6.addAllListener(p);
		p.Cnd_bp_grp_nm6.setListListener(p);
		p.Cnd_bp_grp_nm6.addAllListener(p);
		p.Cnd_bp_grp_cd7.setListListener(p);
		p.Cnd_bp_grp_cd7.addAllListener(p);
		p.Cnd_bp_grp_nm7.setListListener(p);
		p.Cnd_bp_grp_nm7.addAllListener(p);
		p.Cnd_bp_grp_cd8.setListListener(p);
		p.Cnd_bp_grp_cd8.addAllListener(p);
		p.Cnd_bp_grp_nm8.setListListener(p);
		p.Cnd_bp_grp_nm8.addAllListener(p);
		p.Cnd_bp_grp_cd9.setListListener(p);
		p.Cnd_bp_grp_cd9.addAllListener(p);
		p.Cnd_bp_grp_nm9.setListListener(p);
		p.Cnd_bp_grp_nm9.addAllListener(p);
		p.Cnd_bp_grp_cd10.setListListener(p);
		p.Cnd_bp_grp_cd10.addAllListener(p);
		p.Cnd_bp_grp_nm10.setListListener(p);
		p.Cnd_bp_grp_nm10.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABCP_BpSubReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MABCP_BpSubReg p) {
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
	protected static void mcInitDtl(MABCP_BpSubReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_bp_cd.addAllListener(p);
		p.columnDtl_bp_cd.setListListener(p);
		p.columnDtl_bp_nm.addAllListener(p);
		p.columnDtl_bp_nm.setListListener(p);
		p.columnDtl_cst_flg.addAllListener(p);
		p.columnDtl_acst_flg.addAllListener(p);
		p.columnDtl_bcst_flg.addAllListener(p);
		p.columnDtl_rcst_flg.addAllListener(p);
		p.columnDtl_sppl_flg.addAllListener(p);
		p.columnDtl_asppl_flg.addAllListener(p);
		p.columnDtl_bsppl_flg.addAllListener(p);
		p.columnDtl_psppl_flg.addAllListener(p);
		p.columnDtl_cred_flg.addAllListener(p);
		p.columnDtl_dlv_flg.addAllListener(p);
		p.columnDtl_maker_flg.addAllListener(p);
		p.columnDtl_dest_flg.addAllListener(p);
		p.columnDtl_ar_dpt_typ.addAllListener(p);
		p.columnDtl_ar_dpt_typ.setListListener(p);
		p.columnDtl_bill_dpt_typ.addAllListener(p);
		p.columnDtl_bill_dpt_typ.setListListener(p);
		p.columnDtl_onr_prsppl_flg.addAllListener(p);
		p.columnDtl_repurc_obli_flg.addAllListener(p);
		p.columnDtl_zip_cd.addAllListener(p);
		p.columnDtl_zip_cd.setListListener(p);
		p.columnDtl_addr1.addAllListener(p);
		p.columnDtl_addr1.setListListener(p);
		p.columnDtl_addr2.addAllListener(p);
		p.columnDtl_addr2.setListListener(p);
		p.columnDtl_addr3.addAllListener(p);
		p.columnDtl_addr3.setListListener(p);
		p.columnDtl_addr4.addAllListener(p);
		p.columnDtl_addr4.setListListener(p);
		p.columnDtl_tel.addAllListener(p);
		p.columnDtl_tel.setListListener(p);
		p.columnDtl_fax.addAllListener(p);
		p.columnDtl_fax.setListListener(p);
		p.columnDtl_ar_dpt_cd.addAllListener(p);
		p.columnDtl_ar_dpt_cd.setListListener(p);
		p.columnDtl_ar_dpt_nm.addAllListener(p);
		p.columnDtl_ar_dpt_nm.setListListener(p);
		p.columnDtl_cst_cntct_dpt.addAllListener(p);
		p.columnDtl_cst_cntct_dpt.setListListener(p);
		p.columnDtl_cst_cntct_psn.addAllListener(p);
		p.columnDtl_cst_cntct_psn.setListListener(p);
		p.columnDtl_cst_cntct_psn_title.addAllListener(p);
		p.columnDtl_cst_cntct_psn_title.setListListener(p);
		p.columnDtl_sls_tax_cd.addAllListener(p);
		p.columnDtl_sls_tax_cd.setListListener(p);
		p.columnDtl_sls_tax_nm.addAllListener(p);
		p.columnDtl_sls_tax_nm.setListListener(p);
		p.columnDtl_sls_anly_cd1.addAllListener(p);
		p.columnDtl_sls_anly_cd1.setListListener(p);
		p.columnDtl_sls_anly_nm1.addAllListener(p);
		p.columnDtl_sls_anly_nm1.setListListener(p);
		p.columnDtl_sls_anly_cd2.addAllListener(p);
		p.columnDtl_sls_anly_cd2.setListListener(p);
		p.columnDtl_sls_anly_nm2.addAllListener(p);
		p.columnDtl_sls_anly_nm2.setListListener(p);
		p.columnDtl_sls_anly_cd3.addAllListener(p);
		p.columnDtl_sls_anly_cd3.setListListener(p);
		p.columnDtl_sls_anly_nm3.addAllListener(p);
		p.columnDtl_sls_anly_nm3.setListListener(p);
		p.columnDtl_bcst_dpt_cd.addAllListener(p);
		p.columnDtl_bcst_dpt_cd.setListListener(p);
		p.columnDtl_bcst_dpt_nm.addAllListener(p);
		p.columnDtl_bcst_dpt_nm.setListListener(p);
		p.columnDtl_bill_zip_cd.addAllListener(p);
		p.columnDtl_bill_zip_cd.setListListener(p);
		p.columnDtl_bill_addr1.addAllListener(p);
		p.columnDtl_bill_addr1.setListListener(p);
		p.columnDtl_bill_addr2.addAllListener(p);
		p.columnDtl_bill_addr2.setListListener(p);
		p.columnDtl_bill_addr3.addAllListener(p);
		p.columnDtl_bill_addr3.setListListener(p);
		p.columnDtl_bill_addr4.addAllListener(p);
		p.columnDtl_bill_addr4.setListListener(p);
		p.columnDtl_bill_tel.addAllListener(p);
		p.columnDtl_bill_tel.setListListener(p);
		p.columnDtl_bill_bcst_nm.addAllListener(p);
		p.columnDtl_bill_bcst_nm.setListListener(p);
		p.columnDtl_bill_bcst_dpt.addAllListener(p);
		p.columnDtl_bill_bcst_dpt.setListListener(p);
		p.columnDtl_bill_bcst_psn.addAllListener(p);
		p.columnDtl_bill_bcst_psn.setListListener(p);
		p.columnDtl_bill_bcst_psn_title.addAllListener(p);
		p.columnDtl_bill_bcst_psn_title.setListListener(p);
		p.columnDtl_vmi_purc_dpt_cd.addAllListener(p);
		p.columnDtl_vmi_purc_dpt_cd.setListListener(p);
		p.columnDtl_vmi_purc_dpt_nm.addAllListener(p);
		p.columnDtl_vmi_purc_dpt_nm.setListListener(p);
		p.columnDtl_sppl_cntct_dpt.addAllListener(p);
		p.columnDtl_sppl_cntct_dpt.setListListener(p);
		p.columnDtl_sppl_cntct_psn.addAllListener(p);
		p.columnDtl_sppl_cntct_psn.setListListener(p);
		p.columnDtl_sppl_cntct_psn_title.addAllListener(p);
		p.columnDtl_sppl_cntct_psn_title.setListListener(p);
		p.columnDtl_purc_tax_cd.addAllListener(p);
		p.columnDtl_purc_tax_cd.setListListener(p);
		p.columnDtl_purc_tax_nm.addAllListener(p);
		p.columnDtl_purc_tax_nm.setListListener(p);
		p.columnDtl_prov_tax_cd.addAllListener(p);
		p.columnDtl_prov_tax_cd.setListListener(p);
		p.columnDtl_prov_tax_nm.addAllListener(p);
		p.columnDtl_prov_tax_nm.setListListener(p);
		p.columnDtl_ap_dpt_cd.addAllListener(p);
		p.columnDtl_ap_dpt_cd.setListListener(p);
		p.columnDtl_ap_dpt_nm.addAllListener(p);
		p.columnDtl_ap_dpt_nm.setListListener(p);
		p.columnDtl_bsppl_dpt_cd.addAllListener(p);
		p.columnDtl_bsppl_dpt_cd.setListListener(p);
		p.columnDtl_bsppl_dpt_nm.addAllListener(p);
		p.columnDtl_bsppl_dpt_nm.setListListener(p);
		p.columnDtl_pay_dpt_cd.addAllListener(p);
		p.columnDtl_pay_dpt_cd.setListListener(p);
		p.columnDtl_pay_dpt_nm.addAllListener(p);
		p.columnDtl_pay_dpt_nm.setListListener(p);
		p.columnDtl_dlv_cntct_dpt.addAllListener(p);
		p.columnDtl_dlv_cntct_dpt.setListListener(p);
		p.columnDtl_dlv_cntct_psn.addAllListener(p);
		p.columnDtl_dlv_cntct_psn.setListListener(p);
		p.columnDtl_dlv_cntct_psn_title.addAllListener(p);
		p.columnDtl_dlv_cntct_psn_title.setListListener(p);
		p.columnDtl_memo1.addAllListener(p);
		p.columnDtl_memo1.setListListener(p);
		p.columnDtl_memo2.addAllListener(p);
		p.columnDtl_memo2.setListListener(p);
		p.columnDtl_memo3.addAllListener(p);
		p.columnDtl_memo3.setListListener(p);
		p.columnDtl_memo4.addAllListener(p);
		p.columnDtl_memo4.setListListener(p);
		p.columnDtl_memo5.addAllListener(p);
		p.columnDtl_memo5.setListListener(p);
		p.columnDtl_memo6.addAllListener(p);
		p.columnDtl_memo6.setListListener(p);
		p.columnDtl_memo7.addAllListener(p);
		p.columnDtl_memo7.setListListener(p);
		p.columnDtl_memo8.addAllListener(p);
		p.columnDtl_memo8.setListListener(p);
		p.columnDtl_memo9.addAllListener(p);
		p.columnDtl_memo9.setListListener(p);
		p.columnDtl_memo10.addAllListener(p);
		p.columnDtl_memo10.setListListener(p);
		p.columnDtl_memo11.addAllListener(p);
		p.columnDtl_memo11.setListListener(p);
		p.columnDtl_memo12.addAllListener(p);
		p.columnDtl_memo12.setListListener(p);
		p.columnDtl_memo13.addAllListener(p);
		p.columnDtl_memo13.setListListener(p);
		p.columnDtl_memo14.addAllListener(p);
		p.columnDtl_memo14.setListListener(p);
		p.columnDtl_memo15.addAllListener(p);
		p.columnDtl_memo15.setListListener(p);
		p.columnDtl_memo16.addAllListener(p);
		p.columnDtl_memo16.setListListener(p);
		p.columnDtl_memo17.addAllListener(p);
		p.columnDtl_memo17.setListListener(p);
		p.columnDtl_memo18.addAllListener(p);
		p.columnDtl_memo18.setListListener(p);
		p.columnDtl_memo19.addAllListener(p);
		p.columnDtl_memo19.setListListener(p);
		p.columnDtl_memo20.addAllListener(p);
		p.columnDtl_memo20.setListListener(p);
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
	protected static void mcInitBtn(MABCP_BpSubReg p) {
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
	protected static void mcInitEastBtn(MABCP_BpSubReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_BpSubReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABCP_BpSubReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_BpSubReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_BpSubReg p){

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MABCP_BpSubReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MABCP_BpSubReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_BpSubReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_cst_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_acst_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bcst_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_rcst_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dest_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cred_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sppl_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_asppl_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bsppl_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_psppl_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_maker_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cnd_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cnd_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ref_ins_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_new_st_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_vmi_purc_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_vmi_purc_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ar_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ar_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bcst_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bcst_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_pay_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_pay_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_tax_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_tax_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_tax_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_purc_tax_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prov_tax_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_prov_tax_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_tax_abl_only_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo11.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo12.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo13.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo14.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo15.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo16.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo17.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo18.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo19.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo20.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_bp_grp_nm10.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_BpSubReg p){

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MABCP_BpSubReg p){
		p.BulkSet_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_upd_dt.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABCP_BpSubReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_acst_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bcst_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rcst_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sppl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_asppl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bsppl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_psppl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cred_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_maker_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bill_dpt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_onr_prsppl_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_repurc_obli_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnDtl_zip_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_addr1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_addr2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_addr3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_addr4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_tel.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_fax.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ar_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ar_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cst_cntct_dpt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cst_cntct_psn.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cst_cntct_psn_title.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sls_tax_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sls_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sls_anly_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sls_anly_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sls_anly_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sls_anly_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sls_anly_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sls_anly_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bcst_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bcst_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bill_zip_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bill_addr1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bill_addr2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bill_addr3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bill_addr4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bill_tel.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bill_bcst_nm.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bill_bcst_dpt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bill_bcst_psn.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bill_bcst_psn_title.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_vmi_purc_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_vmi_purc_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sppl_cntct_dpt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sppl_cntct_psn.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sppl_cntct_psn_title.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_purc_tax_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_purc_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prov_tax_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_prov_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ap_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bsppl_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pay_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_pay_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_cntct_dpt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dlv_cntct_psn.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dlv_cntct_psn_title.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo5.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo6.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo7.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo8.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo9.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo10.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo11.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo12.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo13.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo14.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo15.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo16.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo17.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo18.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo19.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo20.putMode(p, UPD, MCMode.ENABLE);
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
	protected static void statusInitUPD_Btn(MABCP_BpSubReg p){
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
	protected static void statusInitUPD_EastBtn(MABCP_BpSubReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_BpSubReg p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABCP_BpSubReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_BpSubReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_BpSubReg p){

	}

	/**
	 * [FIX]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab1(MABCP_BpSubReg p){

	}

	/**
	 * [FIX]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab2(MABCP_BpSubReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_BpSubReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_cst_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_acst_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bcst_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_rcst_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dest_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cred_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sppl_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_asppl_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bsppl_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_psppl_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_maker_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cnd_select_all.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cnd_deselect_all.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ref_ins_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_new_st_dt.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_dpt_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_vmi_purc_dpt_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_vmi_purc_dpt_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ar_dpt_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ar_dpt_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bcst_dpt_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bcst_dpt_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_pay_dpt_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_pay_dpt_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sls_tax_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sls_tax_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_purc_tax_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_purc_tax_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_prov_tax_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_prov_tax_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_tax_abl_only_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo11.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo12.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo13.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo14.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo15.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo16.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo17.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo18.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo19.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo20.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_cd10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_bp_grp_nm10.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABCP_BpSubReg p){

	}

	/**
	 * [FIX]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BulkSet(MABCP_BpSubReg p){
		p.BulkSet_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_upd_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABCP_BpSubReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cst_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_acst_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bcst_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_rcst_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sppl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_asppl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bsppl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_psppl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cred_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dlv_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_maker_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dest_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_bill_dpt_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_onr_prsppl_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_repurc_obli_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_zip_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_addr1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_addr2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_addr3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_addr4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_tel.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_fax.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cst_cntct_dpt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cst_cntct_psn.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cst_cntct_psn_title.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_tax_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_tax_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_anly_cd1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_anly_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_anly_cd2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_anly_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_anly_cd3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_anly_nm3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bcst_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bcst_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bill_zip_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bill_addr1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bill_addr2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bill_addr3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bill_addr4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bill_tel.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bill_bcst_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bill_bcst_dpt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bill_bcst_psn.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bill_bcst_psn_title.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_vmi_purc_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_vmi_purc_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sppl_cntct_dpt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sppl_cntct_psn.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sppl_cntct_psn_title.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_prov_tax_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_prov_tax_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_pay_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_pay_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dlv_cntct_dpt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dlv_cntct_psn.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dlv_cntct_psn_title.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo6.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo7.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo8.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo9.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo10.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo11.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo12.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo13.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo14.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo15.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo16.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo17.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo18.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo19.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo20.putMode(p, FIX, MCMode.READ_ONLY);
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
	protected static void statusInitFIX_Btn(MABCP_BpSubReg p){
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
	protected static void statusInitFIX_EastBtn(MABCP_BpSubReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_BpSubReg p){

	}

	/**
	 * [DEL]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mst(MABCP_BpSubReg p){
		p.Mst_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABCP_BpSubReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABCP_BpSubReg p){

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MABCP_BpSubReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MABCP_BpSubReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_BpSubReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_cst_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_acst_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bcst_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_rcst_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dest_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cred_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sppl_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_asppl_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bsppl_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_psppl_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_maker_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cnd_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cnd_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ref_ins_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_new_st_dt.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_vmi_purc_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_vmi_purc_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ar_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ar_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bcst_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bcst_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_pay_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_pay_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_tax_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_tax_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_purc_tax_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_purc_tax_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_prov_tax_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_prov_tax_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_tax_abl_only_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo11.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo12.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo13.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo14.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo15.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo16.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo17.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo18.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo19.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo20.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_cd10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_bp_grp_nm10.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABCP_BpSubReg p){

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MABCP_BpSubReg p){
		p.BulkSet_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_upd_dt.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABCP_BpSubReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_acst_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bcst_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rcst_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_asppl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bsppl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_psppl_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cred_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_maker_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bill_dpt_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_onr_prsppl_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_repurc_obli_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_zip_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_addr1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_addr2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_addr3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_addr4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_tel.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_fax.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_cntct_dpt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_cntct_psn.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_cntct_psn_title.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_tax_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_tax_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_anly_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_anly_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_anly_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_anly_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_anly_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_anly_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bcst_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bcst_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bill_zip_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bill_addr1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bill_addr2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bill_addr3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bill_addr4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bill_tel.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bill_bcst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bill_bcst_dpt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bill_bcst_psn.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bill_bcst_psn_title.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_vmi_purc_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_vmi_purc_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_cntct_dpt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_cntct_psn.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sppl_cntct_psn_title.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prov_tax_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prov_tax_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pay_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pay_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_cntct_dpt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_cntct_psn.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_cntct_psn_title.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo11.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo12.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo13.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo14.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo15.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo16.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo17.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo18.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo19.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo20.putMode(p, DEL, MCMode.READ_ONLY);
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
	protected static void statusInitDEL_Btn(MABCP_BpSubReg p){
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
	protected static void statusInitDEL_EastBtn(MABCP_BpSubReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_BpSubReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_BpSubReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_BpSubReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_BpSubReg p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MABCP_BpSubReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MABCP_BpSubReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_BpSubReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_cst_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_acst_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bcst_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rcst_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cred_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asppl_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bsppl_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_psppl_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cnd_select_all.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cnd_deselect_all.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ref_ins_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_new_st_dt.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_vmi_purc_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_vmi_purc_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ar_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ar_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bcst_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bcst_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_pay_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_pay_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_tax_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_tax_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_purc_tax_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_purc_tax_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prov_tax_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_prov_tax_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_tax_abl_only_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo11.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo12.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo13.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo14.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo15.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo16.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo17.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo18.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo19.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo20.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bp_grp_nm10.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_BpSubReg p){

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MABCP_BpSubReg p){
		p.BulkSet_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_upd_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_BpSubReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_acst_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bcst_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rcst_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asppl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bsppl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_psppl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cred_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_maker_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bill_dpt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_onr_prsppl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_repurc_obli_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_zip_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_addr1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_addr2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_addr3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_addr4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_tel.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_fax.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ar_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_cntct_dpt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_cntct_psn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_cntct_psn_title.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_anly_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_anly_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_anly_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_anly_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_anly_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_anly_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bcst_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bcst_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bill_zip_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bill_addr1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bill_addr2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bill_addr3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bill_addr4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bill_tel.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bill_bcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bill_bcst_dpt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bill_bcst_psn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bill_bcst_psn_title.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_vmi_purc_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_vmi_purc_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_cntct_dpt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_cntct_psn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sppl_cntct_psn_title.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prov_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ap_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bsppl_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pay_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pay_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_cntct_dpt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_cntct_psn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_cntct_psn_title.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo11.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo12.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo13.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo14.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo15.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo16.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo17.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo18.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo19.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo20.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_Btn(MABCP_BpSubReg p){
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
	protected static void statusInitREF_EastBtn(MABCP_BpSubReg p){

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
		MABCP_BpSubReg_MC.setTableConfigDtl((MABCP_BpSubReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_BpSubReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABC.MABCP0420.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABC.MABCP0420.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_bp_cd.setMeta(mcframe.clientMABC.MABCP0420.DtlR.bp_cd_META);
		p.columnDtl_bp_cd.setListType(MCListType.STRICT);
		p.columnDtl_bp_cd.addLinkBeans(p.columnDtl_bp_nm,p.columnDtl_cst_flg,p.columnDtl_acst_flg,p.columnDtl_bcst_flg,p.columnDtl_rcst_flg,p.columnDtl_dlv_flg,p.columnDtl_dest_flg,p.columnDtl_cred_flg,p.columnDtl_sppl_flg,p.columnDtl_asppl_flg,p.columnDtl_bsppl_flg,p.columnDtl_psppl_flg,p.columnDtl_maker_flg,p.columnDtl_ar_dpt_typ,p.columnDtl_bill_dpt_typ,p.columnDtl_onr_prsppl_flg,p.columnDtl_repurc_obli_flg);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_cd);
		p.columnDtl_bp_nm.setMeta(mcframe.clientMABC.MABCP0420.DtlR.bp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_nm);
		p.columnDtl_cst_flg.setMeta(mcframe.clientMABC.MABCP0420.DtlR.cst_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_flg);
		p.columnDtl_acst_flg.setMeta(mcframe.clientMABC.MABCP0420.DtlR.acst_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_acst_flg);
		p.columnDtl_bcst_flg.setMeta(mcframe.clientMABC.MABCP0420.DtlR.bcst_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bcst_flg);
		p.columnDtl_rcst_flg.setMeta(mcframe.clientMABC.MABCP0420.DtlR.rcst_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rcst_flg);
		p.columnDtl_sppl_flg.setMeta(mcframe.clientMABC.MABCP0420.DtlR.sppl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_flg);
		p.columnDtl_asppl_flg.setMeta(mcframe.clientMABC.MABCP0420.DtlR.asppl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asppl_flg);
		p.columnDtl_bsppl_flg.setMeta(mcframe.clientMABC.MABCP0420.DtlR.bsppl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bsppl_flg);
		p.columnDtl_psppl_flg.setMeta(mcframe.clientMABC.MABCP0420.DtlR.psppl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_psppl_flg);
		p.columnDtl_cred_flg.setMeta(mcframe.clientMABC.MABCP0420.DtlR.cred_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cred_flg);
		p.columnDtl_dlv_flg.setMeta(mcframe.clientMABC.MABCP0420.DtlR.dlv_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_flg);
		p.columnDtl_maker_flg.setMeta(mcframe.clientMABC.MABCP0420.DtlR.maker_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_maker_flg);
		p.columnDtl_dest_flg.setMeta(mcframe.clientMABC.MABCP0420.DtlR.dest_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_flg);
		p.columnDtl_ar_dpt_typ.setMeta(mcframe.clientMABC.MABCP0420.DtlR.ar_dpt_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_dpt_typ);
		p.columnDtl_bill_dpt_typ.setMeta(mcframe.clientMABC.MABCP0420.DtlR.bill_dpt_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_dpt_typ);
		p.columnDtl_onr_prsppl_flg.setMeta(mcframe.clientMABC.MABCP0420.DtlR.onr_prsppl_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_onr_prsppl_flg);
		p.columnDtl_repurc_obli_flg.setMeta(mcframe.clientMABC.MABCP0420.DtlR.repurc_obli_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_repurc_obli_flg);
		p.DtlTable.addTable(p.Dtl_dt_p_PPanel.DtTable);
		p.columnDtl_zip_cd.setMeta(mcframe.clientMABC.MABCP0420.DtlR.zip_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_zip_cd);
		p.columnDtl_addr1.setMeta(mcframe.clientMABC.MABCP0420.DtlR.addr1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_addr1);
		p.columnDtl_addr2.setMeta(mcframe.clientMABC.MABCP0420.DtlR.addr2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_addr2);
		p.columnDtl_addr3.setMeta(mcframe.clientMABC.MABCP0420.DtlR.addr3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_addr3);
		p.columnDtl_addr4.setMeta(mcframe.clientMABC.MABCP0420.DtlR.addr4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_addr4);
		p.columnDtl_tel.setMeta(mcframe.clientMABC.MABCP0420.DtlR.tel_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tel);
		p.columnDtl_fax.setMeta(mcframe.clientMABC.MABCP0420.DtlR.fax_META);
		p.DtlTable.addColumnConfig(p.columnDtl_fax);
		p.columnDtl_ar_dpt_cd.setMeta(mcframe.clientMABC.MABCP0420.DtlR.ar_dpt_cd_META);
		p.columnDtl_ar_dpt_cd.addLinkBeans(p.columnDtl_ar_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_dpt_cd);
		p.columnDtl_ar_dpt_nm.setMeta(mcframe.clientMABC.MABCP0420.DtlR.ar_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ar_dpt_nm);
		p.columnDtl_cst_cntct_dpt.setMeta(mcframe.clientMABC.MABCP0420.DtlR.cst_cntct_dpt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_cntct_dpt);
		p.columnDtl_cst_cntct_psn.setMeta(mcframe.clientMABC.MABCP0420.DtlR.cst_cntct_psn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_cntct_psn);
		p.columnDtl_cst_cntct_psn_title.setMeta(mcframe.clientMABC.MABCP0420.DtlR.cst_cntct_psn_title_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_cntct_psn_title);
		p.columnDtl_sls_tax_cd.setMeta(mcframe.clientMABC.MABCP0420.DtlR.sls_tax_cd_META);
		p.columnDtl_sls_tax_cd.addLinkBeans(p.columnDtl_sls_tax_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_tax_cd);
		p.columnDtl_sls_tax_nm.setMeta(mcframe.clientMABC.MABCP0420.DtlR.sls_tax_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_tax_nm);
		p.columnDtl_sls_anly_cd1.setMeta(mcframe.clientMABC.MABCP0420.DtlR.sls_anly_cd1_META);
		p.columnDtl_sls_anly_cd1.addLinkBeans(p.columnDtl_sls_anly_nm1);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_anly_cd1);
		p.columnDtl_sls_anly_nm1.setMeta(mcframe.clientMABC.MABCP0420.DtlR.sls_anly_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_anly_nm1);
		p.columnDtl_sls_anly_cd2.setMeta(mcframe.clientMABC.MABCP0420.DtlR.sls_anly_cd2_META);
		p.columnDtl_sls_anly_cd2.addLinkBeans(p.columnDtl_sls_anly_nm2);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_anly_cd2);
		p.columnDtl_sls_anly_nm2.setMeta(mcframe.clientMABC.MABCP0420.DtlR.sls_anly_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_anly_nm2);
		p.columnDtl_sls_anly_cd3.setMeta(mcframe.clientMABC.MABCP0420.DtlR.sls_anly_cd3_META);
		p.columnDtl_sls_anly_cd3.addLinkBeans(p.columnDtl_sls_anly_nm3);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_anly_cd3);
		p.columnDtl_sls_anly_nm3.setMeta(mcframe.clientMABC.MABCP0420.DtlR.sls_anly_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_anly_nm3);
		p.columnDtl_bcst_dpt_cd.setMeta(mcframe.clientMABC.MABCP0420.DtlR.bcst_dpt_cd_META);
		p.columnDtl_bcst_dpt_cd.addLinkBeans(p.columnDtl_bcst_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_bcst_dpt_cd);
		p.columnDtl_bcst_dpt_nm.setMeta(mcframe.clientMABC.MABCP0420.DtlR.bcst_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bcst_dpt_nm);
		p.columnDtl_bill_zip_cd.setMeta(mcframe.clientMABC.MABCP0420.DtlR.bill_zip_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_zip_cd);
		p.columnDtl_bill_addr1.setMeta(mcframe.clientMABC.MABCP0420.DtlR.bill_addr1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_addr1);
		p.columnDtl_bill_addr2.setMeta(mcframe.clientMABC.MABCP0420.DtlR.bill_addr2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_addr2);
		p.columnDtl_bill_addr3.setMeta(mcframe.clientMABC.MABCP0420.DtlR.bill_addr3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_addr3);
		p.columnDtl_bill_addr4.setMeta(mcframe.clientMABC.MABCP0420.DtlR.bill_addr4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_addr4);
		p.columnDtl_bill_tel.setMeta(mcframe.clientMABC.MABCP0420.DtlR.bill_tel_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_tel);
		p.columnDtl_bill_bcst_nm.setMeta(mcframe.clientMABC.MABCP0420.DtlR.bill_bcst_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_bcst_nm);
		p.columnDtl_bill_bcst_dpt.setMeta(mcframe.clientMABC.MABCP0420.DtlR.bill_bcst_dpt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_bcst_dpt);
		p.columnDtl_bill_bcst_psn.setMeta(mcframe.clientMABC.MABCP0420.DtlR.bill_bcst_psn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_bcst_psn);
		p.columnDtl_bill_bcst_psn_title.setMeta(mcframe.clientMABC.MABCP0420.DtlR.bill_bcst_psn_title_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bill_bcst_psn_title);
		p.columnDtl_vmi_purc_dpt_cd.setMeta(mcframe.clientMABC.MABCP0420.DtlR.vmi_purc_dpt_cd_META);
		p.columnDtl_vmi_purc_dpt_cd.addLinkBeans(p.columnDtl_vmi_purc_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_vmi_purc_dpt_cd);
		p.columnDtl_vmi_purc_dpt_nm.setMeta(mcframe.clientMABC.MABCP0420.DtlR.vmi_purc_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_vmi_purc_dpt_nm);
		p.columnDtl_sppl_cntct_dpt.setMeta(mcframe.clientMABC.MABCP0420.DtlR.sppl_cntct_dpt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_cntct_dpt);
		p.columnDtl_sppl_cntct_psn.setMeta(mcframe.clientMABC.MABCP0420.DtlR.sppl_cntct_psn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_cntct_psn);
		p.columnDtl_sppl_cntct_psn_title.setMeta(mcframe.clientMABC.MABCP0420.DtlR.sppl_cntct_psn_title_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_cntct_psn_title);
		p.columnDtl_purc_tax_cd.setMeta(mcframe.clientMABC.MABCP0420.DtlR.purc_tax_cd_META);
		p.columnDtl_purc_tax_cd.addLinkBeans(p.columnDtl_purc_tax_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_tax_cd);
		p.columnDtl_purc_tax_nm.setMeta(mcframe.clientMABC.MABCP0420.DtlR.purc_tax_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_tax_nm);
		p.columnDtl_prov_tax_cd.setMeta(mcframe.clientMABC.MABCP0420.DtlR.prov_tax_cd_META);
		p.columnDtl_prov_tax_cd.addLinkBeans(p.columnDtl_prov_tax_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_tax_cd);
		p.columnDtl_prov_tax_nm.setMeta(mcframe.clientMABC.MABCP0420.DtlR.prov_tax_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prov_tax_nm);
		p.columnDtl_ap_dpt_cd.setMeta(mcframe.clientMABC.MABCP0420.DtlR.ap_dpt_cd_META);
		p.columnDtl_ap_dpt_cd.addLinkBeans(p.columnDtl_ap_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_dpt_cd);
		p.columnDtl_ap_dpt_nm.setMeta(mcframe.clientMABC.MABCP0420.DtlR.ap_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ap_dpt_nm);
		p.columnDtl_bsppl_dpt_cd.setMeta(mcframe.clientMABC.MABCP0420.DtlR.bsppl_dpt_cd_META);
		p.columnDtl_bsppl_dpt_cd.addLinkBeans(p.columnDtl_bsppl_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_bsppl_dpt_cd);
		p.columnDtl_bsppl_dpt_nm.setMeta(mcframe.clientMABC.MABCP0420.DtlR.bsppl_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bsppl_dpt_nm);
		p.columnDtl_pay_dpt_cd.setMeta(mcframe.clientMABC.MABCP0420.DtlR.pay_dpt_cd_META);
		p.columnDtl_pay_dpt_cd.addLinkBeans(p.columnDtl_pay_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_dpt_cd);
		p.columnDtl_pay_dpt_nm.setMeta(mcframe.clientMABC.MABCP0420.DtlR.pay_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pay_dpt_nm);
		p.columnDtl_dlv_cntct_dpt.setMeta(mcframe.clientMABC.MABCP0420.DtlR.dlv_cntct_dpt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_cntct_dpt);
		p.columnDtl_dlv_cntct_psn.setMeta(mcframe.clientMABC.MABCP0420.DtlR.dlv_cntct_psn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_cntct_psn);
		p.columnDtl_dlv_cntct_psn_title.setMeta(mcframe.clientMABC.MABCP0420.DtlR.dlv_cntct_psn_title_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_cntct_psn_title);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP0420.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP0420.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP0420.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_memo4.setMeta(mcframe.clientMABC.MABCP0420.DtlR.memo4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo4);
		p.columnDtl_memo5.setMeta(mcframe.clientMABC.MABCP0420.DtlR.memo5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo5);
		p.columnDtl_memo6.setMeta(mcframe.clientMABC.MABCP0420.DtlR.memo6_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo6);
		p.columnDtl_memo7.setMeta(mcframe.clientMABC.MABCP0420.DtlR.memo7_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo7);
		p.columnDtl_memo8.setMeta(mcframe.clientMABC.MABCP0420.DtlR.memo8_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo8);
		p.columnDtl_memo9.setMeta(mcframe.clientMABC.MABCP0420.DtlR.memo9_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo9);
		p.columnDtl_memo10.setMeta(mcframe.clientMABC.MABCP0420.DtlR.memo10_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo10);
		p.columnDtl_memo11.setMeta(mcframe.clientMABC.MABCP0420.DtlR.memo11_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo11);
		p.columnDtl_memo12.setMeta(mcframe.clientMABC.MABCP0420.DtlR.memo12_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo12);
		p.columnDtl_memo13.setMeta(mcframe.clientMABC.MABCP0420.DtlR.memo13_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo13);
		p.columnDtl_memo14.setMeta(mcframe.clientMABC.MABCP0420.DtlR.memo14_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo14);
		p.columnDtl_memo15.setMeta(mcframe.clientMABC.MABCP0420.DtlR.memo15_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo15);
		p.columnDtl_memo16.setMeta(mcframe.clientMABC.MABCP0420.DtlR.memo16_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo16);
		p.columnDtl_memo17.setMeta(mcframe.clientMABC.MABCP0420.DtlR.memo17_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo17);
		p.columnDtl_memo18.setMeta(mcframe.clientMABC.MABCP0420.DtlR.memo18_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo18);
		p.columnDtl_memo19.setMeta(mcframe.clientMABC.MABCP0420.DtlR.memo19_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo19);
		p.columnDtl_memo20.setMeta(mcframe.clientMABC.MABCP0420.DtlR.memo20_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo20);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0420.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0420.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0420.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0420.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0420.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0420.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0420.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0420.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0420.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0420.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0420.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0420.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0420.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0420.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABC.MABCP0420.DtlR.del_ts_META);
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
		Cnd_bp_cd.getListConfig().setPutter(getCnd_bp_cd_ListPutter());
		Cnd_dpt_cd.getListConfig().setPutter(getCnd_dpt_cd_ListPutter());
		Cnd_vmi_purc_dpt_cd.getListConfig().setPutter(getCnd_vmi_purc_dpt_cd_ListPutter());
		Cnd_ar_dpt_cd.getListConfig().setPutter(getCnd_ar_dpt_cd_ListPutter());
		Cnd_bcst_dpt_cd.getListConfig().setPutter(getCnd_bcst_dpt_cd_ListPutter());
		Cnd_ap_dpt_cd.getListConfig().setPutter(getCnd_ap_dpt_cd_ListPutter());
		Cnd_bsppl_dpt_cd.getListConfig().setPutter(getCnd_bsppl_dpt_cd_ListPutter());
		Cnd_pay_dpt_cd.getListConfig().setPutter(getCnd_pay_dpt_cd_ListPutter());
		Cnd_sls_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sls_tax_cd.getListConfig().setPutter(getCnd_sls_tax_cd_ListPutter());
		Cnd_purc_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_purc_tax_cd.getListConfig().setPutter(getCnd_purc_tax_cd_ListPutter());
		Cnd_prov_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_prov_tax_cd.getListConfig().setPutter(getCnd_prov_tax_cd_ListPutter());
		Cnd_bp_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd1.getListConfig().setPutter(getCnd_bp_grp_cd1_ListPutter());
		Cnd_bp_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd2.getListConfig().setPutter(getCnd_bp_grp_cd2_ListPutter());
		Cnd_bp_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd3.getListConfig().setPutter(getCnd_bp_grp_cd3_ListPutter());
		Cnd_bp_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd4.getListConfig().setPutter(getCnd_bp_grp_cd4_ListPutter());
		Cnd_bp_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd5.getListConfig().setPutter(getCnd_bp_grp_cd5_ListPutter());
		Cnd_bp_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd6.getListConfig().setPutter(getCnd_bp_grp_cd6_ListPutter());
		Cnd_bp_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd7.getListConfig().setPutter(getCnd_bp_grp_cd7_ListPutter());
		Cnd_bp_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd8.getListConfig().setPutter(getCnd_bp_grp_cd8_ListPutter());
		Cnd_bp_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd9.getListConfig().setPutter(getCnd_bp_grp_cd9_ListPutter());
		Cnd_bp_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bp_grp_cd10.getListConfig().setPutter(getCnd_bp_grp_cd10_ListPutter());
		columnDtl_bp_cd.getListConfig().setPutter(getDtl_bp_cd_ListPutter());
		columnDtl_ar_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ar_dpt_cd.getListConfig().setPutter(getDtl_ar_dpt_cd_ListPutter());
		columnDtl_sls_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sls_tax_cd.getListConfig().setPutter(getDtl_sls_tax_cd_ListPutter());
		columnDtl_sls_anly_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sls_anly_cd1.getListConfig().setPutter(getDtl_sls_anly_cd1_ListPutter());
		columnDtl_sls_anly_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sls_anly_cd2.getListConfig().setPutter(getDtl_sls_anly_cd2_ListPutter());
		columnDtl_sls_anly_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sls_anly_cd3.getListConfig().setPutter(getDtl_sls_anly_cd3_ListPutter());
		columnDtl_bcst_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bcst_dpt_cd.getListConfig().setPutter(getDtl_bcst_dpt_cd_ListPutter());
		columnDtl_vmi_purc_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_vmi_purc_dpt_cd.getListConfig().setPutter(getDtl_vmi_purc_dpt_cd_ListPutter());
		columnDtl_purc_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_purc_tax_cd.getListConfig().setPutter(getDtl_purc_tax_cd_ListPutter());
		columnDtl_prov_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_prov_tax_cd.getListConfig().setPutter(getDtl_prov_tax_cd_ListPutter());
		columnDtl_ap_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ap_dpt_cd.getListConfig().setPutter(getDtl_ap_dpt_cd_ListPutter());
		columnDtl_bsppl_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bsppl_dpt_cd.getListConfig().setPutter(getDtl_bsppl_dpt_cd_ListPutter());
		columnDtl_pay_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_pay_dpt_cd.getListConfig().setPutter(getDtl_pay_dpt_cd_ListPutter());
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
	 * [Cnd_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_vmi_purc_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_vmi_purc_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_ar_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ar_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_bcst_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bcst_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_ap_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ap_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_bsppl_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bsppl_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_pay_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pay_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_sls_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sls_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsTax");
		return lp;
	}
	 
	/**
	 * [Cnd_purc_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_purc_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcTax");
		return lp;
	}
	 
	/**
	 * [Cnd_prov_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_prov_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProvTax");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_bp_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp10");
		return lp;
	}
	 
	/**
	 * [Dtl_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl_ar_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ar_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_sls_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sls_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsTax");
		return lp;
	}
	 
	/**
	 * [Dtl_sls_anly_cd1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sls_anly_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsAnly1");
		return lp;
	}
	 
	/**
	 * [Dtl_sls_anly_cd2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sls_anly_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsAnly2");
		return lp;
	}
	 
	/**
	 * [Dtl_sls_anly_cd3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sls_anly_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsAnly3");
		return lp;
	}
	 
	/**
	 * [Dtl_bcst_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bcst_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_vmi_purc_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_vmi_purc_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_purc_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_purc_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcTax");
		return lp;
	}
	 
	/**
	 * [Dtl_prov_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_prov_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ProvTax");
		return lp;
	}
	 
	/**
	 * [Dtl_ap_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ap_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_bsppl_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bsppl_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Dtl_pay_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_pay_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_bp_cd) return getCnd_bp_cd(row, info);
		if(combo == Cnd_dpt_cd) return getCnd_dpt_cd(row, info);
		if(combo == Cnd_vmi_purc_dpt_cd) return getCnd_vmi_purc_dpt_cd(row, info);
		if(combo == Cnd_ar_dpt_cd) return getCnd_ar_dpt_cd(row, info);
		if(combo == Cnd_bcst_dpt_cd) return getCnd_bcst_dpt_cd(row, info);
		if(combo == Cnd_ap_dpt_cd) return getCnd_ap_dpt_cd(row, info);
		if(combo == Cnd_bsppl_dpt_cd) return getCnd_bsppl_dpt_cd(row, info);
		if(combo == Cnd_pay_dpt_cd) return getCnd_pay_dpt_cd(row, info);
		if(combo == Cnd_sls_tax_cd) return getCnd_sls_tax_cd(row, info);
		if(combo == Cnd_purc_tax_cd) return getCnd_purc_tax_cd(row, info);
		if(combo == Cnd_prov_tax_cd) return getCnd_prov_tax_cd(row, info);
		if(combo == Cnd_bp_grp_cd1) return getCnd_bp_grp_cd1(row, info);
		if(combo == Cnd_bp_grp_cd2) return getCnd_bp_grp_cd2(row, info);
		if(combo == Cnd_bp_grp_cd3) return getCnd_bp_grp_cd3(row, info);
		if(combo == Cnd_bp_grp_cd4) return getCnd_bp_grp_cd4(row, info);
		if(combo == Cnd_bp_grp_cd5) return getCnd_bp_grp_cd5(row, info);
		if(combo == Cnd_bp_grp_cd6) return getCnd_bp_grp_cd6(row, info);
		if(combo == Cnd_bp_grp_cd7) return getCnd_bp_grp_cd7(row, info);
		if(combo == Cnd_bp_grp_cd8) return getCnd_bp_grp_cd8(row, info);
		if(combo == Cnd_bp_grp_cd9) return getCnd_bp_grp_cd9(row, info);
		if(combo == Cnd_bp_grp_cd10) return getCnd_bp_grp_cd10(row, info);
		if(combo == columnDtl_bp_cd) return getDtl_bp_cd(row, info);
		if(combo == columnDtl_ar_dpt_cd) return getDtl_ar_dpt_cd(row, info);
		if(combo == columnDtl_sls_tax_cd) return getDtl_sls_tax_cd(row, info);
		if(combo == columnDtl_sls_anly_cd1) return getDtl_sls_anly_cd1(row, info);
		if(combo == columnDtl_sls_anly_cd2) return getDtl_sls_anly_cd2(row, info);
		if(combo == columnDtl_sls_anly_cd3) return getDtl_sls_anly_cd3(row, info);
		if(combo == columnDtl_bcst_dpt_cd) return getDtl_bcst_dpt_cd(row, info);
		if(combo == columnDtl_vmi_purc_dpt_cd) return getDtl_vmi_purc_dpt_cd(row, info);
		if(combo == columnDtl_purc_tax_cd) return getDtl_purc_tax_cd(row, info);
		if(combo == columnDtl_prov_tax_cd) return getDtl_prov_tax_cd(row, info);
		if(combo == columnDtl_ap_dpt_cd) return getDtl_ap_dpt_cd(row, info);
		if(combo == columnDtl_bsppl_dpt_cd) return getDtl_bsppl_dpt_cd(row, info);
		if(combo == columnDtl_pay_dpt_cd) return getDtl_pay_dpt_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_cnd_select_all) doCnd_cnd_select_all(info);
		else if (ap == Cnd_cnd_deselect_all) doCnd_cnd_deselect_all(info);
		else if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == BulkSet_upd_dt) doBulkSet_upd_dt(info);
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
	 * [Cnd]パネルの[cnd_select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_cnd_select_all(MCEventInfo info);

	/**
	 * [Cnd]パネルの[cnd_deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_cnd_deselect_all(MCEventInfo info);

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [BulkSet]パネルの[upd_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBulkSet_upd_dt(MCEventInfo info);

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
		if (vc == FoldTab) return doFold_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_cst_flg) return doCnd_cst_flg_VC(info);
		if (vc == Cnd_acst_flg) return doCnd_acst_flg_VC(info);
		if (vc == Cnd_bcst_flg) return doCnd_bcst_flg_VC(info);
		if (vc == Cnd_rcst_flg) return doCnd_rcst_flg_VC(info);
		if (vc == Cnd_dlv_flg) return doCnd_dlv_flg_VC(info);
		if (vc == Cnd_dest_flg) return doCnd_dest_flg_VC(info);
		if (vc == Cnd_cred_flg) return doCnd_cred_flg_VC(info);
		if (vc == Cnd_sppl_flg) return doCnd_sppl_flg_VC(info);
		if (vc == Cnd_asppl_flg) return doCnd_asppl_flg_VC(info);
		if (vc == Cnd_bsppl_flg) return doCnd_bsppl_flg_VC(info);
		if (vc == Cnd_psppl_flg) return doCnd_psppl_flg_VC(info);
		if (vc == Cnd_maker_flg) return doCnd_maker_flg_VC(info);
		if (vc == Cnd_bp_cd) return doCnd_bp_cd_VC(info);
		if (vc == Cnd_bp_nm) return doCnd_bp_nm_VC(info);
		if (vc == Cnd_ref_ins_flg) return doCnd_ref_ins_flg_VC(info);
		if (vc == Cnd_new_st_dt) return doCnd_new_st_dt_VC(info);
		if (vc == Cnd_dpt_cd) return doCnd_dpt_cd_VC(info);
		if (vc == Cnd_dpt_nm) return doCnd_dpt_nm_VC(info);
		if (vc == Cnd_vmi_purc_dpt_cd) return doCnd_vmi_purc_dpt_cd_VC(info);
		if (vc == Cnd_vmi_purc_dpt_nm) return doCnd_vmi_purc_dpt_nm_VC(info);
		if (vc == Cnd_ar_dpt_cd) return doCnd_ar_dpt_cd_VC(info);
		if (vc == Cnd_ar_dpt_nm) return doCnd_ar_dpt_nm_VC(info);
		if (vc == Cnd_bcst_dpt_cd) return doCnd_bcst_dpt_cd_VC(info);
		if (vc == Cnd_bcst_dpt_nm) return doCnd_bcst_dpt_nm_VC(info);
		if (vc == Cnd_ap_dpt_cd) return doCnd_ap_dpt_cd_VC(info);
		if (vc == Cnd_ap_dpt_nm) return doCnd_ap_dpt_nm_VC(info);
		if (vc == Cnd_bsppl_dpt_cd) return doCnd_bsppl_dpt_cd_VC(info);
		if (vc == Cnd_bsppl_dpt_nm) return doCnd_bsppl_dpt_nm_VC(info);
		if (vc == Cnd_pay_dpt_cd) return doCnd_pay_dpt_cd_VC(info);
		if (vc == Cnd_pay_dpt_nm) return doCnd_pay_dpt_nm_VC(info);
		if (vc == Cnd_sls_tax_cd) return doCnd_sls_tax_cd_VC(info);
		if (vc == Cnd_sls_tax_nm) return doCnd_sls_tax_nm_VC(info);
		if (vc == Cnd_purc_tax_cd) return doCnd_purc_tax_cd_VC(info);
		if (vc == Cnd_purc_tax_nm) return doCnd_purc_tax_nm_VC(info);
		if (vc == Cnd_prov_tax_cd) return doCnd_prov_tax_cd_VC(info);
		if (vc == Cnd_prov_tax_nm) return doCnd_prov_tax_nm_VC(info);
		if (vc == Cnd_tax_abl_only_flg) return doCnd_tax_abl_only_flg_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_memo4) return doCnd_memo4_VC(info);
		if (vc == Cnd_memo5) return doCnd_memo5_VC(info);
		if (vc == Cnd_memo6) return doCnd_memo6_VC(info);
		if (vc == Cnd_memo7) return doCnd_memo7_VC(info);
		if (vc == Cnd_memo8) return doCnd_memo8_VC(info);
		if (vc == Cnd_memo9) return doCnd_memo9_VC(info);
		if (vc == Cnd_memo10) return doCnd_memo10_VC(info);
		if (vc == Cnd_memo11) return doCnd_memo11_VC(info);
		if (vc == Cnd_memo12) return doCnd_memo12_VC(info);
		if (vc == Cnd_memo13) return doCnd_memo13_VC(info);
		if (vc == Cnd_memo14) return doCnd_memo14_VC(info);
		if (vc == Cnd_memo15) return doCnd_memo15_VC(info);
		if (vc == Cnd_memo16) return doCnd_memo16_VC(info);
		if (vc == Cnd_memo17) return doCnd_memo17_VC(info);
		if (vc == Cnd_memo18) return doCnd_memo18_VC(info);
		if (vc == Cnd_memo19) return doCnd_memo19_VC(info);
		if (vc == Cnd_memo20) return doCnd_memo20_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == Cnd_bp_grp_cd1) return doCnd_bp_grp_cd1_VC(info);
		if (vc == Cnd_bp_grp_nm1) return doCnd_bp_grp_nm1_VC(info);
		if (vc == Cnd_bp_grp_cd2) return doCnd_bp_grp_cd2_VC(info);
		if (vc == Cnd_bp_grp_nm2) return doCnd_bp_grp_nm2_VC(info);
		if (vc == Cnd_bp_grp_cd3) return doCnd_bp_grp_cd3_VC(info);
		if (vc == Cnd_bp_grp_nm3) return doCnd_bp_grp_nm3_VC(info);
		if (vc == Cnd_bp_grp_cd4) return doCnd_bp_grp_cd4_VC(info);
		if (vc == Cnd_bp_grp_nm4) return doCnd_bp_grp_nm4_VC(info);
		if (vc == Cnd_bp_grp_cd5) return doCnd_bp_grp_cd5_VC(info);
		if (vc == Cnd_bp_grp_nm5) return doCnd_bp_grp_nm5_VC(info);
		if (vc == Cnd_bp_grp_cd6) return doCnd_bp_grp_cd6_VC(info);
		if (vc == Cnd_bp_grp_nm6) return doCnd_bp_grp_nm6_VC(info);
		if (vc == Cnd_bp_grp_cd7) return doCnd_bp_grp_cd7_VC(info);
		if (vc == Cnd_bp_grp_nm7) return doCnd_bp_grp_nm7_VC(info);
		if (vc == Cnd_bp_grp_cd8) return doCnd_bp_grp_cd8_VC(info);
		if (vc == Cnd_bp_grp_nm8) return doCnd_bp_grp_nm8_VC(info);
		if (vc == Cnd_bp_grp_cd9) return doCnd_bp_grp_cd9_VC(info);
		if (vc == Cnd_bp_grp_nm9) return doCnd_bp_grp_nm9_VC(info);
		if (vc == Cnd_bp_grp_cd10) return doCnd_bp_grp_cd10_VC(info);
		if (vc == Cnd_bp_grp_nm10) return doCnd_bp_grp_nm10_VC(info);
		if (vc == BulkSet_st_dt) return doBulkSet_st_dt_VC(info);
		if (vc == BulkSet_end_dt) return doBulkSet_end_dt_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_bp_cd) return doDtl_bp_cd_VC(info);
		if (vc == columnDtl_bp_nm) return doDtl_bp_nm_VC(info);
		if (vc == columnDtl_cst_flg) return doDtl_cst_flg_VC(info);
		if (vc == columnDtl_acst_flg) return doDtl_acst_flg_VC(info);
		if (vc == columnDtl_bcst_flg) return doDtl_bcst_flg_VC(info);
		if (vc == columnDtl_rcst_flg) return doDtl_rcst_flg_VC(info);
		if (vc == columnDtl_sppl_flg) return doDtl_sppl_flg_VC(info);
		if (vc == columnDtl_asppl_flg) return doDtl_asppl_flg_VC(info);
		if (vc == columnDtl_bsppl_flg) return doDtl_bsppl_flg_VC(info);
		if (vc == columnDtl_psppl_flg) return doDtl_psppl_flg_VC(info);
		if (vc == columnDtl_cred_flg) return doDtl_cred_flg_VC(info);
		if (vc == columnDtl_dlv_flg) return doDtl_dlv_flg_VC(info);
		if (vc == columnDtl_maker_flg) return doDtl_maker_flg_VC(info);
		if (vc == columnDtl_dest_flg) return doDtl_dest_flg_VC(info);
		if (vc == columnDtl_ar_dpt_typ) return doDtl_ar_dpt_typ_VC(info);
		if (vc == columnDtl_bill_dpt_typ) return doDtl_bill_dpt_typ_VC(info);
		if (vc == columnDtl_onr_prsppl_flg) return doDtl_onr_prsppl_flg_VC(info);
		if (vc == columnDtl_repurc_obli_flg) return doDtl_repurc_obli_flg_VC(info);
		if (vc == columnDtl_zip_cd) return doDtl_zip_cd_VC(info);
		if (vc == columnDtl_addr1) return doDtl_addr1_VC(info);
		if (vc == columnDtl_addr2) return doDtl_addr2_VC(info);
		if (vc == columnDtl_addr3) return doDtl_addr3_VC(info);
		if (vc == columnDtl_addr4) return doDtl_addr4_VC(info);
		if (vc == columnDtl_tel) return doDtl_tel_VC(info);
		if (vc == columnDtl_fax) return doDtl_fax_VC(info);
		if (vc == columnDtl_ar_dpt_cd) return doDtl_ar_dpt_cd_VC(info);
		if (vc == columnDtl_ar_dpt_nm) return doDtl_ar_dpt_nm_VC(info);
		if (vc == columnDtl_cst_cntct_dpt) return doDtl_cst_cntct_dpt_VC(info);
		if (vc == columnDtl_cst_cntct_psn) return doDtl_cst_cntct_psn_VC(info);
		if (vc == columnDtl_cst_cntct_psn_title) return doDtl_cst_cntct_psn_title_VC(info);
		if (vc == columnDtl_sls_tax_cd) return doDtl_sls_tax_cd_VC(info);
		if (vc == columnDtl_sls_tax_nm) return doDtl_sls_tax_nm_VC(info);
		if (vc == columnDtl_sls_anly_cd1) return doDtl_sls_anly_cd1_VC(info);
		if (vc == columnDtl_sls_anly_nm1) return doDtl_sls_anly_nm1_VC(info);
		if (vc == columnDtl_sls_anly_cd2) return doDtl_sls_anly_cd2_VC(info);
		if (vc == columnDtl_sls_anly_nm2) return doDtl_sls_anly_nm2_VC(info);
		if (vc == columnDtl_sls_anly_cd3) return doDtl_sls_anly_cd3_VC(info);
		if (vc == columnDtl_sls_anly_nm3) return doDtl_sls_anly_nm3_VC(info);
		if (vc == columnDtl_bcst_dpt_cd) return doDtl_bcst_dpt_cd_VC(info);
		if (vc == columnDtl_bcst_dpt_nm) return doDtl_bcst_dpt_nm_VC(info);
		if (vc == columnDtl_bill_zip_cd) return doDtl_bill_zip_cd_VC(info);
		if (vc == columnDtl_bill_addr1) return doDtl_bill_addr1_VC(info);
		if (vc == columnDtl_bill_addr2) return doDtl_bill_addr2_VC(info);
		if (vc == columnDtl_bill_addr3) return doDtl_bill_addr3_VC(info);
		if (vc == columnDtl_bill_addr4) return doDtl_bill_addr4_VC(info);
		if (vc == columnDtl_bill_tel) return doDtl_bill_tel_VC(info);
		if (vc == columnDtl_bill_bcst_nm) return doDtl_bill_bcst_nm_VC(info);
		if (vc == columnDtl_bill_bcst_dpt) return doDtl_bill_bcst_dpt_VC(info);
		if (vc == columnDtl_bill_bcst_psn) return doDtl_bill_bcst_psn_VC(info);
		if (vc == columnDtl_bill_bcst_psn_title) return doDtl_bill_bcst_psn_title_VC(info);
		if (vc == columnDtl_vmi_purc_dpt_cd) return doDtl_vmi_purc_dpt_cd_VC(info);
		if (vc == columnDtl_vmi_purc_dpt_nm) return doDtl_vmi_purc_dpt_nm_VC(info);
		if (vc == columnDtl_sppl_cntct_dpt) return doDtl_sppl_cntct_dpt_VC(info);
		if (vc == columnDtl_sppl_cntct_psn) return doDtl_sppl_cntct_psn_VC(info);
		if (vc == columnDtl_sppl_cntct_psn_title) return doDtl_sppl_cntct_psn_title_VC(info);
		if (vc == columnDtl_purc_tax_cd) return doDtl_purc_tax_cd_VC(info);
		if (vc == columnDtl_purc_tax_nm) return doDtl_purc_tax_nm_VC(info);
		if (vc == columnDtl_prov_tax_cd) return doDtl_prov_tax_cd_VC(info);
		if (vc == columnDtl_prov_tax_nm) return doDtl_prov_tax_nm_VC(info);
		if (vc == columnDtl_ap_dpt_cd) return doDtl_ap_dpt_cd_VC(info);
		if (vc == columnDtl_ap_dpt_nm) return doDtl_ap_dpt_nm_VC(info);
		if (vc == columnDtl_bsppl_dpt_cd) return doDtl_bsppl_dpt_cd_VC(info);
		if (vc == columnDtl_bsppl_dpt_nm) return doDtl_bsppl_dpt_nm_VC(info);
		if (vc == columnDtl_pay_dpt_cd) return doDtl_pay_dpt_cd_VC(info);
		if (vc == columnDtl_pay_dpt_nm) return doDtl_pay_dpt_nm_VC(info);
		if (vc == columnDtl_dlv_cntct_dpt) return doDtl_dlv_cntct_dpt_VC(info);
		if (vc == columnDtl_dlv_cntct_psn) return doDtl_dlv_cntct_psn_VC(info);
		if (vc == columnDtl_dlv_cntct_psn_title) return doDtl_dlv_cntct_psn_title_VC(info);
		if (vc == columnDtl_memo1) return doDtl_memo1_VC(info);
		if (vc == columnDtl_memo2) return doDtl_memo2_VC(info);
		if (vc == columnDtl_memo3) return doDtl_memo3_VC(info);
		if (vc == columnDtl_memo4) return doDtl_memo4_VC(info);
		if (vc == columnDtl_memo5) return doDtl_memo5_VC(info);
		if (vc == columnDtl_memo6) return doDtl_memo6_VC(info);
		if (vc == columnDtl_memo7) return doDtl_memo7_VC(info);
		if (vc == columnDtl_memo8) return doDtl_memo8_VC(info);
		if (vc == columnDtl_memo9) return doDtl_memo9_VC(info);
		if (vc == columnDtl_memo10) return doDtl_memo10_VC(info);
		if (vc == columnDtl_memo11) return doDtl_memo11_VC(info);
		if (vc == columnDtl_memo12) return doDtl_memo12_VC(info);
		if (vc == columnDtl_memo13) return doDtl_memo13_VC(info);
		if (vc == columnDtl_memo14) return doDtl_memo14_VC(info);
		if (vc == columnDtl_memo15) return doDtl_memo15_VC(info);
		if (vc == columnDtl_memo16) return doDtl_memo16_VC(info);
		if (vc == columnDtl_memo17) return doDtl_memo17_VC(info);
		if (vc == columnDtl_memo18) return doDtl_memo18_VC(info);
		if (vc == columnDtl_memo19) return doDtl_memo19_VC(info);
		if (vc == columnDtl_memo20) return doDtl_memo20_VC(info);
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
	 * [Mst]パネルの[mst_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMst_mst_set_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[acst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_acst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bcst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bcst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rcst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rcst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cred_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cred_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[psppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_psppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ref_ins_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ref_ins_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[new_st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_new_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[vmi_purc_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_vmi_purc_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[vmi_purc_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_vmi_purc_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ar_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ar_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bcst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bcst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bcst_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bcst_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ap_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pay_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prov_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[prov_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_prov_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tax_abl_only_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tax_abl_only_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[memo4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo20_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_grp_nm10_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[acst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_acst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bcst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bcst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rcst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rcst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bsppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bsppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[psppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_psppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cred_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cred_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[maker_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_maker_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_dpt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_dpt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_dpt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_dpt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[onr_prsppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_onr_prsppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[repurc_obli_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_repurc_obli_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[fax]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_fax_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ar_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_cntct_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_cntct_dpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_cntct_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_cntct_psn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_cntct_psn_title]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_cntct_psn_title_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_anly_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_anly_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_anly_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_anly_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_anly_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_anly_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_anly_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_anly_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_anly_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_anly_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_anly_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_anly_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bcst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bcst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bcst_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bcst_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_bcst_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_bcst_dpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_bcst_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_bcst_psn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bill_bcst_psn_title]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bill_bcst_psn_title_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[vmi_purc_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_vmi_purc_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[vmi_purc_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_vmi_purc_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_cntct_dpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_cntct_psn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_psn_title]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_cntct_psn_title_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[prov_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prov_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prov_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ap_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bsppl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bsppl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bsppl_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bsppl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pay_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pay_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_cntct_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_cntct_dpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_cntct_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_cntct_psn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_cntct_psn_title]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_cntct_psn_title_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[memo4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo11]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo11_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo12]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo12_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo13]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo13_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo14]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo14_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo15]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo15_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo16]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo16_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo17]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo17_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo18]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo18_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo19]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo19_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo20]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo20_VC(MCEventInfo info){
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
		if (nc == FoldTab) doFold_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_cst_flg) doCnd_cst_flg_NC(info);
		else if (nc == Cnd_acst_flg) doCnd_acst_flg_NC(info);
		else if (nc == Cnd_bcst_flg) doCnd_bcst_flg_NC(info);
		else if (nc == Cnd_rcst_flg) doCnd_rcst_flg_NC(info);
		else if (nc == Cnd_dlv_flg) doCnd_dlv_flg_NC(info);
		else if (nc == Cnd_dest_flg) doCnd_dest_flg_NC(info);
		else if (nc == Cnd_cred_flg) doCnd_cred_flg_NC(info);
		else if (nc == Cnd_sppl_flg) doCnd_sppl_flg_NC(info);
		else if (nc == Cnd_asppl_flg) doCnd_asppl_flg_NC(info);
		else if (nc == Cnd_bsppl_flg) doCnd_bsppl_flg_NC(info);
		else if (nc == Cnd_psppl_flg) doCnd_psppl_flg_NC(info);
		else if (nc == Cnd_maker_flg) doCnd_maker_flg_NC(info);
		else if (nc == Cnd_bp_cd) doCnd_bp_cd_NC(info);
		else if (nc == Cnd_bp_nm) doCnd_bp_nm_NC(info);
		else if (nc == Cnd_ref_ins_flg) doCnd_ref_ins_flg_NC(info);
		else if (nc == Cnd_new_st_dt) doCnd_new_st_dt_NC(info);
		else if (nc == Cnd_dpt_cd) doCnd_dpt_cd_NC(info);
		else if (nc == Cnd_dpt_nm) doCnd_dpt_nm_NC(info);
		else if (nc == Cnd_vmi_purc_dpt_cd) doCnd_vmi_purc_dpt_cd_NC(info);
		else if (nc == Cnd_vmi_purc_dpt_nm) doCnd_vmi_purc_dpt_nm_NC(info);
		else if (nc == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_NC(info);
		else if (nc == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_NC(info);
		else if (nc == Cnd_bcst_dpt_cd) doCnd_bcst_dpt_cd_NC(info);
		else if (nc == Cnd_bcst_dpt_nm) doCnd_bcst_dpt_nm_NC(info);
		else if (nc == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NC(info);
		else if (nc == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NC(info);
		else if (nc == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NC(info);
		else if (nc == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NC(info);
		else if (nc == Cnd_pay_dpt_cd) doCnd_pay_dpt_cd_NC(info);
		else if (nc == Cnd_pay_dpt_nm) doCnd_pay_dpt_nm_NC(info);
		else if (nc == Cnd_sls_tax_cd) doCnd_sls_tax_cd_NC(info);
		else if (nc == Cnd_sls_tax_nm) doCnd_sls_tax_nm_NC(info);
		else if (nc == Cnd_purc_tax_cd) doCnd_purc_tax_cd_NC(info);
		else if (nc == Cnd_purc_tax_nm) doCnd_purc_tax_nm_NC(info);
		else if (nc == Cnd_prov_tax_cd) doCnd_prov_tax_cd_NC(info);
		else if (nc == Cnd_prov_tax_nm) doCnd_prov_tax_nm_NC(info);
		else if (nc == Cnd_tax_abl_only_flg) doCnd_tax_abl_only_flg_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_memo4) doCnd_memo4_NC(info);
		else if (nc == Cnd_memo5) doCnd_memo5_NC(info);
		else if (nc == Cnd_memo6) doCnd_memo6_NC(info);
		else if (nc == Cnd_memo7) doCnd_memo7_NC(info);
		else if (nc == Cnd_memo8) doCnd_memo8_NC(info);
		else if (nc == Cnd_memo9) doCnd_memo9_NC(info);
		else if (nc == Cnd_memo10) doCnd_memo10_NC(info);
		else if (nc == Cnd_memo11) doCnd_memo11_NC(info);
		else if (nc == Cnd_memo12) doCnd_memo12_NC(info);
		else if (nc == Cnd_memo13) doCnd_memo13_NC(info);
		else if (nc == Cnd_memo14) doCnd_memo14_NC(info);
		else if (nc == Cnd_memo15) doCnd_memo15_NC(info);
		else if (nc == Cnd_memo16) doCnd_memo16_NC(info);
		else if (nc == Cnd_memo17) doCnd_memo17_NC(info);
		else if (nc == Cnd_memo18) doCnd_memo18_NC(info);
		else if (nc == Cnd_memo19) doCnd_memo19_NC(info);
		else if (nc == Cnd_memo20) doCnd_memo20_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == Cnd_bp_grp_cd1) doCnd_bp_grp_cd1_NC(info);
		else if (nc == Cnd_bp_grp_nm1) doCnd_bp_grp_nm1_NC(info);
		else if (nc == Cnd_bp_grp_cd2) doCnd_bp_grp_cd2_NC(info);
		else if (nc == Cnd_bp_grp_nm2) doCnd_bp_grp_nm2_NC(info);
		else if (nc == Cnd_bp_grp_cd3) doCnd_bp_grp_cd3_NC(info);
		else if (nc == Cnd_bp_grp_nm3) doCnd_bp_grp_nm3_NC(info);
		else if (nc == Cnd_bp_grp_cd4) doCnd_bp_grp_cd4_NC(info);
		else if (nc == Cnd_bp_grp_nm4) doCnd_bp_grp_nm4_NC(info);
		else if (nc == Cnd_bp_grp_cd5) doCnd_bp_grp_cd5_NC(info);
		else if (nc == Cnd_bp_grp_nm5) doCnd_bp_grp_nm5_NC(info);
		else if (nc == Cnd_bp_grp_cd6) doCnd_bp_grp_cd6_NC(info);
		else if (nc == Cnd_bp_grp_nm6) doCnd_bp_grp_nm6_NC(info);
		else if (nc == Cnd_bp_grp_cd7) doCnd_bp_grp_cd7_NC(info);
		else if (nc == Cnd_bp_grp_nm7) doCnd_bp_grp_nm7_NC(info);
		else if (nc == Cnd_bp_grp_cd8) doCnd_bp_grp_cd8_NC(info);
		else if (nc == Cnd_bp_grp_nm8) doCnd_bp_grp_nm8_NC(info);
		else if (nc == Cnd_bp_grp_cd9) doCnd_bp_grp_cd9_NC(info);
		else if (nc == Cnd_bp_grp_nm9) doCnd_bp_grp_nm9_NC(info);
		else if (nc == Cnd_bp_grp_cd10) doCnd_bp_grp_cd10_NC(info);
		else if (nc == Cnd_bp_grp_nm10) doCnd_bp_grp_nm10_NC(info);
		else if (nc == BulkSet_st_dt) doBulkSet_st_dt_NC(info);
		else if (nc == BulkSet_end_dt) doBulkSet_end_dt_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_bp_cd) doDtl_bp_cd_NC(info);
		else if (nc == columnDtl_bp_nm) doDtl_bp_nm_NC(info);
		else if (nc == columnDtl_cst_flg) doDtl_cst_flg_NC(info);
		else if (nc == columnDtl_acst_flg) doDtl_acst_flg_NC(info);
		else if (nc == columnDtl_bcst_flg) doDtl_bcst_flg_NC(info);
		else if (nc == columnDtl_rcst_flg) doDtl_rcst_flg_NC(info);
		else if (nc == columnDtl_sppl_flg) doDtl_sppl_flg_NC(info);
		else if (nc == columnDtl_asppl_flg) doDtl_asppl_flg_NC(info);
		else if (nc == columnDtl_bsppl_flg) doDtl_bsppl_flg_NC(info);
		else if (nc == columnDtl_psppl_flg) doDtl_psppl_flg_NC(info);
		else if (nc == columnDtl_cred_flg) doDtl_cred_flg_NC(info);
		else if (nc == columnDtl_dlv_flg) doDtl_dlv_flg_NC(info);
		else if (nc == columnDtl_maker_flg) doDtl_maker_flg_NC(info);
		else if (nc == columnDtl_dest_flg) doDtl_dest_flg_NC(info);
		else if (nc == columnDtl_ar_dpt_typ) doDtl_ar_dpt_typ_NC(info);
		else if (nc == columnDtl_bill_dpt_typ) doDtl_bill_dpt_typ_NC(info);
		else if (nc == columnDtl_onr_prsppl_flg) doDtl_onr_prsppl_flg_NC(info);
		else if (nc == columnDtl_repurc_obli_flg) doDtl_repurc_obli_flg_NC(info);
		else if (nc == columnDtl_zip_cd) doDtl_zip_cd_NC(info);
		else if (nc == columnDtl_addr1) doDtl_addr1_NC(info);
		else if (nc == columnDtl_addr2) doDtl_addr2_NC(info);
		else if (nc == columnDtl_addr3) doDtl_addr3_NC(info);
		else if (nc == columnDtl_addr4) doDtl_addr4_NC(info);
		else if (nc == columnDtl_tel) doDtl_tel_NC(info);
		else if (nc == columnDtl_fax) doDtl_fax_NC(info);
		else if (nc == columnDtl_ar_dpt_cd) doDtl_ar_dpt_cd_NC(info);
		else if (nc == columnDtl_ar_dpt_nm) doDtl_ar_dpt_nm_NC(info);
		else if (nc == columnDtl_cst_cntct_dpt) doDtl_cst_cntct_dpt_NC(info);
		else if (nc == columnDtl_cst_cntct_psn) doDtl_cst_cntct_psn_NC(info);
		else if (nc == columnDtl_cst_cntct_psn_title) doDtl_cst_cntct_psn_title_NC(info);
		else if (nc == columnDtl_sls_tax_cd) doDtl_sls_tax_cd_NC(info);
		else if (nc == columnDtl_sls_tax_nm) doDtl_sls_tax_nm_NC(info);
		else if (nc == columnDtl_sls_anly_cd1) doDtl_sls_anly_cd1_NC(info);
		else if (nc == columnDtl_sls_anly_nm1) doDtl_sls_anly_nm1_NC(info);
		else if (nc == columnDtl_sls_anly_cd2) doDtl_sls_anly_cd2_NC(info);
		else if (nc == columnDtl_sls_anly_nm2) doDtl_sls_anly_nm2_NC(info);
		else if (nc == columnDtl_sls_anly_cd3) doDtl_sls_anly_cd3_NC(info);
		else if (nc == columnDtl_sls_anly_nm3) doDtl_sls_anly_nm3_NC(info);
		else if (nc == columnDtl_bcst_dpt_cd) doDtl_bcst_dpt_cd_NC(info);
		else if (nc == columnDtl_bcst_dpt_nm) doDtl_bcst_dpt_nm_NC(info);
		else if (nc == columnDtl_bill_zip_cd) doDtl_bill_zip_cd_NC(info);
		else if (nc == columnDtl_bill_addr1) doDtl_bill_addr1_NC(info);
		else if (nc == columnDtl_bill_addr2) doDtl_bill_addr2_NC(info);
		else if (nc == columnDtl_bill_addr3) doDtl_bill_addr3_NC(info);
		else if (nc == columnDtl_bill_addr4) doDtl_bill_addr4_NC(info);
		else if (nc == columnDtl_bill_tel) doDtl_bill_tel_NC(info);
		else if (nc == columnDtl_bill_bcst_nm) doDtl_bill_bcst_nm_NC(info);
		else if (nc == columnDtl_bill_bcst_dpt) doDtl_bill_bcst_dpt_NC(info);
		else if (nc == columnDtl_bill_bcst_psn) doDtl_bill_bcst_psn_NC(info);
		else if (nc == columnDtl_bill_bcst_psn_title) doDtl_bill_bcst_psn_title_NC(info);
		else if (nc == columnDtl_vmi_purc_dpt_cd) doDtl_vmi_purc_dpt_cd_NC(info);
		else if (nc == columnDtl_vmi_purc_dpt_nm) doDtl_vmi_purc_dpt_nm_NC(info);
		else if (nc == columnDtl_sppl_cntct_dpt) doDtl_sppl_cntct_dpt_NC(info);
		else if (nc == columnDtl_sppl_cntct_psn) doDtl_sppl_cntct_psn_NC(info);
		else if (nc == columnDtl_sppl_cntct_psn_title) doDtl_sppl_cntct_psn_title_NC(info);
		else if (nc == columnDtl_purc_tax_cd) doDtl_purc_tax_cd_NC(info);
		else if (nc == columnDtl_purc_tax_nm) doDtl_purc_tax_nm_NC(info);
		else if (nc == columnDtl_prov_tax_cd) doDtl_prov_tax_cd_NC(info);
		else if (nc == columnDtl_prov_tax_nm) doDtl_prov_tax_nm_NC(info);
		else if (nc == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_NC(info);
		else if (nc == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_NC(info);
		else if (nc == columnDtl_bsppl_dpt_cd) doDtl_bsppl_dpt_cd_NC(info);
		else if (nc == columnDtl_bsppl_dpt_nm) doDtl_bsppl_dpt_nm_NC(info);
		else if (nc == columnDtl_pay_dpt_cd) doDtl_pay_dpt_cd_NC(info);
		else if (nc == columnDtl_pay_dpt_nm) doDtl_pay_dpt_nm_NC(info);
		else if (nc == columnDtl_dlv_cntct_dpt) doDtl_dlv_cntct_dpt_NC(info);
		else if (nc == columnDtl_dlv_cntct_psn) doDtl_dlv_cntct_psn_NC(info);
		else if (nc == columnDtl_dlv_cntct_psn_title) doDtl_dlv_cntct_psn_title_NC(info);
		else if (nc == columnDtl_memo1) doDtl_memo1_NC(info);
		else if (nc == columnDtl_memo2) doDtl_memo2_NC(info);
		else if (nc == columnDtl_memo3) doDtl_memo3_NC(info);
		else if (nc == columnDtl_memo4) doDtl_memo4_NC(info);
		else if (nc == columnDtl_memo5) doDtl_memo5_NC(info);
		else if (nc == columnDtl_memo6) doDtl_memo6_NC(info);
		else if (nc == columnDtl_memo7) doDtl_memo7_NC(info);
		else if (nc == columnDtl_memo8) doDtl_memo8_NC(info);
		else if (nc == columnDtl_memo9) doDtl_memo9_NC(info);
		else if (nc == columnDtl_memo10) doDtl_memo10_NC(info);
		else if (nc == columnDtl_memo11) doDtl_memo11_NC(info);
		else if (nc == columnDtl_memo12) doDtl_memo12_NC(info);
		else if (nc == columnDtl_memo13) doDtl_memo13_NC(info);
		else if (nc == columnDtl_memo14) doDtl_memo14_NC(info);
		else if (nc == columnDtl_memo15) doDtl_memo15_NC(info);
		else if (nc == columnDtl_memo16) doDtl_memo16_NC(info);
		else if (nc == columnDtl_memo17) doDtl_memo17_NC(info);
		else if (nc == columnDtl_memo18) doDtl_memo18_NC(info);
		else if (nc == columnDtl_memo19) doDtl_memo19_NC(info);
		else if (nc == columnDtl_memo20) doDtl_memo20_NC(info);
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
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ref_ins_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ref_ins_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vmi_purc_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vmi_purc_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vmi_purc_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vmi_purc_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_abl_only_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_abl_only_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[memo4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo11_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo12_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo13_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo14_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo15_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo16_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo17_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo18_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo19_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo20_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm10_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[psppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_psppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cred_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cred_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_dpt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_dpt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[onr_prsppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_onr_prsppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[repurc_obli_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_repurc_obli_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fax]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fax_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cntct_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cntct_dpt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cntct_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cntct_psn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cntct_psn_title]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cntct_psn_title_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_addr1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_addr2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_addr3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_addr4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_tel_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_bcst_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_bcst_dpt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_bcst_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_bcst_psn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_bcst_psn_title]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_bcst_psn_title_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[vmi_purc_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_vmi_purc_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[vmi_purc_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_vmi_purc_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cntct_dpt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cntct_psn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_psn_title]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cntct_psn_title_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[prov_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cntct_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cntct_dpt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cntct_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cntct_psn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cntct_psn_title]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cntct_psn_title_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[memo4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo11]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo11_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo12]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo12_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo13]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo13_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo14]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo14_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo15]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo15_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo16]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo16_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo17]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo17_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo18]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo18_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo19]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo19_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo20]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo20_NC(MCEventInfo info){
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
		if (ne == FoldTab) doFold_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_cst_flg) doCnd_cst_flg_NE(info);
		else if (ne == Cnd_acst_flg) doCnd_acst_flg_NE(info);
		else if (ne == Cnd_bcst_flg) doCnd_bcst_flg_NE(info);
		else if (ne == Cnd_rcst_flg) doCnd_rcst_flg_NE(info);
		else if (ne == Cnd_dlv_flg) doCnd_dlv_flg_NE(info);
		else if (ne == Cnd_dest_flg) doCnd_dest_flg_NE(info);
		else if (ne == Cnd_cred_flg) doCnd_cred_flg_NE(info);
		else if (ne == Cnd_sppl_flg) doCnd_sppl_flg_NE(info);
		else if (ne == Cnd_asppl_flg) doCnd_asppl_flg_NE(info);
		else if (ne == Cnd_bsppl_flg) doCnd_bsppl_flg_NE(info);
		else if (ne == Cnd_psppl_flg) doCnd_psppl_flg_NE(info);
		else if (ne == Cnd_maker_flg) doCnd_maker_flg_NE(info);
		else if (ne == Cnd_bp_cd) doCnd_bp_cd_NE(info);
		else if (ne == Cnd_bp_nm) doCnd_bp_nm_NE(info);
		else if (ne == Cnd_ref_ins_flg) doCnd_ref_ins_flg_NE(info);
		else if (ne == Cnd_new_st_dt) doCnd_new_st_dt_NE(info);
		else if (ne == Cnd_dpt_cd) doCnd_dpt_cd_NE(info);
		else if (ne == Cnd_dpt_nm) doCnd_dpt_nm_NE(info);
		else if (ne == Cnd_vmi_purc_dpt_cd) doCnd_vmi_purc_dpt_cd_NE(info);
		else if (ne == Cnd_vmi_purc_dpt_nm) doCnd_vmi_purc_dpt_nm_NE(info);
		else if (ne == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_NE(info);
		else if (ne == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_NE(info);
		else if (ne == Cnd_bcst_dpt_cd) doCnd_bcst_dpt_cd_NE(info);
		else if (ne == Cnd_bcst_dpt_nm) doCnd_bcst_dpt_nm_NE(info);
		else if (ne == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NE(info);
		else if (ne == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NE(info);
		else if (ne == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NE(info);
		else if (ne == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NE(info);
		else if (ne == Cnd_pay_dpt_cd) doCnd_pay_dpt_cd_NE(info);
		else if (ne == Cnd_pay_dpt_nm) doCnd_pay_dpt_nm_NE(info);
		else if (ne == Cnd_sls_tax_cd) doCnd_sls_tax_cd_NE(info);
		else if (ne == Cnd_sls_tax_nm) doCnd_sls_tax_nm_NE(info);
		else if (ne == Cnd_purc_tax_cd) doCnd_purc_tax_cd_NE(info);
		else if (ne == Cnd_purc_tax_nm) doCnd_purc_tax_nm_NE(info);
		else if (ne == Cnd_prov_tax_cd) doCnd_prov_tax_cd_NE(info);
		else if (ne == Cnd_prov_tax_nm) doCnd_prov_tax_nm_NE(info);
		else if (ne == Cnd_tax_abl_only_flg) doCnd_tax_abl_only_flg_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_memo4) doCnd_memo4_NE(info);
		else if (ne == Cnd_memo5) doCnd_memo5_NE(info);
		else if (ne == Cnd_memo6) doCnd_memo6_NE(info);
		else if (ne == Cnd_memo7) doCnd_memo7_NE(info);
		else if (ne == Cnd_memo8) doCnd_memo8_NE(info);
		else if (ne == Cnd_memo9) doCnd_memo9_NE(info);
		else if (ne == Cnd_memo10) doCnd_memo10_NE(info);
		else if (ne == Cnd_memo11) doCnd_memo11_NE(info);
		else if (ne == Cnd_memo12) doCnd_memo12_NE(info);
		else if (ne == Cnd_memo13) doCnd_memo13_NE(info);
		else if (ne == Cnd_memo14) doCnd_memo14_NE(info);
		else if (ne == Cnd_memo15) doCnd_memo15_NE(info);
		else if (ne == Cnd_memo16) doCnd_memo16_NE(info);
		else if (ne == Cnd_memo17) doCnd_memo17_NE(info);
		else if (ne == Cnd_memo18) doCnd_memo18_NE(info);
		else if (ne == Cnd_memo19) doCnd_memo19_NE(info);
		else if (ne == Cnd_memo20) doCnd_memo20_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == Cnd_bp_grp_cd1) doCnd_bp_grp_cd1_NE(info);
		else if (ne == Cnd_bp_grp_nm1) doCnd_bp_grp_nm1_NE(info);
		else if (ne == Cnd_bp_grp_cd2) doCnd_bp_grp_cd2_NE(info);
		else if (ne == Cnd_bp_grp_nm2) doCnd_bp_grp_nm2_NE(info);
		else if (ne == Cnd_bp_grp_cd3) doCnd_bp_grp_cd3_NE(info);
		else if (ne == Cnd_bp_grp_nm3) doCnd_bp_grp_nm3_NE(info);
		else if (ne == Cnd_bp_grp_cd4) doCnd_bp_grp_cd4_NE(info);
		else if (ne == Cnd_bp_grp_nm4) doCnd_bp_grp_nm4_NE(info);
		else if (ne == Cnd_bp_grp_cd5) doCnd_bp_grp_cd5_NE(info);
		else if (ne == Cnd_bp_grp_nm5) doCnd_bp_grp_nm5_NE(info);
		else if (ne == Cnd_bp_grp_cd6) doCnd_bp_grp_cd6_NE(info);
		else if (ne == Cnd_bp_grp_nm6) doCnd_bp_grp_nm6_NE(info);
		else if (ne == Cnd_bp_grp_cd7) doCnd_bp_grp_cd7_NE(info);
		else if (ne == Cnd_bp_grp_nm7) doCnd_bp_grp_nm7_NE(info);
		else if (ne == Cnd_bp_grp_cd8) doCnd_bp_grp_cd8_NE(info);
		else if (ne == Cnd_bp_grp_nm8) doCnd_bp_grp_nm8_NE(info);
		else if (ne == Cnd_bp_grp_cd9) doCnd_bp_grp_cd9_NE(info);
		else if (ne == Cnd_bp_grp_nm9) doCnd_bp_grp_nm9_NE(info);
		else if (ne == Cnd_bp_grp_cd10) doCnd_bp_grp_cd10_NE(info);
		else if (ne == Cnd_bp_grp_nm10) doCnd_bp_grp_nm10_NE(info);
		else if (ne == BulkSet_st_dt) doBulkSet_st_dt_NE(info);
		else if (ne == BulkSet_end_dt) doBulkSet_end_dt_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_bp_cd) doDtl_bp_cd_NE(info);
		else if (ne == columnDtl_bp_nm) doDtl_bp_nm_NE(info);
		else if (ne == columnDtl_cst_flg) doDtl_cst_flg_NE(info);
		else if (ne == columnDtl_acst_flg) doDtl_acst_flg_NE(info);
		else if (ne == columnDtl_bcst_flg) doDtl_bcst_flg_NE(info);
		else if (ne == columnDtl_rcst_flg) doDtl_rcst_flg_NE(info);
		else if (ne == columnDtl_sppl_flg) doDtl_sppl_flg_NE(info);
		else if (ne == columnDtl_asppl_flg) doDtl_asppl_flg_NE(info);
		else if (ne == columnDtl_bsppl_flg) doDtl_bsppl_flg_NE(info);
		else if (ne == columnDtl_psppl_flg) doDtl_psppl_flg_NE(info);
		else if (ne == columnDtl_cred_flg) doDtl_cred_flg_NE(info);
		else if (ne == columnDtl_dlv_flg) doDtl_dlv_flg_NE(info);
		else if (ne == columnDtl_maker_flg) doDtl_maker_flg_NE(info);
		else if (ne == columnDtl_dest_flg) doDtl_dest_flg_NE(info);
		else if (ne == columnDtl_ar_dpt_typ) doDtl_ar_dpt_typ_NE(info);
		else if (ne == columnDtl_bill_dpt_typ) doDtl_bill_dpt_typ_NE(info);
		else if (ne == columnDtl_onr_prsppl_flg) doDtl_onr_prsppl_flg_NE(info);
		else if (ne == columnDtl_repurc_obli_flg) doDtl_repurc_obli_flg_NE(info);
		else if (ne == columnDtl_zip_cd) doDtl_zip_cd_NE(info);
		else if (ne == columnDtl_addr1) doDtl_addr1_NE(info);
		else if (ne == columnDtl_addr2) doDtl_addr2_NE(info);
		else if (ne == columnDtl_addr3) doDtl_addr3_NE(info);
		else if (ne == columnDtl_addr4) doDtl_addr4_NE(info);
		else if (ne == columnDtl_tel) doDtl_tel_NE(info);
		else if (ne == columnDtl_fax) doDtl_fax_NE(info);
		else if (ne == columnDtl_ar_dpt_cd) doDtl_ar_dpt_cd_NE(info);
		else if (ne == columnDtl_ar_dpt_nm) doDtl_ar_dpt_nm_NE(info);
		else if (ne == columnDtl_cst_cntct_dpt) doDtl_cst_cntct_dpt_NE(info);
		else if (ne == columnDtl_cst_cntct_psn) doDtl_cst_cntct_psn_NE(info);
		else if (ne == columnDtl_cst_cntct_psn_title) doDtl_cst_cntct_psn_title_NE(info);
		else if (ne == columnDtl_sls_tax_cd) doDtl_sls_tax_cd_NE(info);
		else if (ne == columnDtl_sls_tax_nm) doDtl_sls_tax_nm_NE(info);
		else if (ne == columnDtl_sls_anly_cd1) doDtl_sls_anly_cd1_NE(info);
		else if (ne == columnDtl_sls_anly_nm1) doDtl_sls_anly_nm1_NE(info);
		else if (ne == columnDtl_sls_anly_cd2) doDtl_sls_anly_cd2_NE(info);
		else if (ne == columnDtl_sls_anly_nm2) doDtl_sls_anly_nm2_NE(info);
		else if (ne == columnDtl_sls_anly_cd3) doDtl_sls_anly_cd3_NE(info);
		else if (ne == columnDtl_sls_anly_nm3) doDtl_sls_anly_nm3_NE(info);
		else if (ne == columnDtl_bcst_dpt_cd) doDtl_bcst_dpt_cd_NE(info);
		else if (ne == columnDtl_bcst_dpt_nm) doDtl_bcst_dpt_nm_NE(info);
		else if (ne == columnDtl_bill_zip_cd) doDtl_bill_zip_cd_NE(info);
		else if (ne == columnDtl_bill_addr1) doDtl_bill_addr1_NE(info);
		else if (ne == columnDtl_bill_addr2) doDtl_bill_addr2_NE(info);
		else if (ne == columnDtl_bill_addr3) doDtl_bill_addr3_NE(info);
		else if (ne == columnDtl_bill_addr4) doDtl_bill_addr4_NE(info);
		else if (ne == columnDtl_bill_tel) doDtl_bill_tel_NE(info);
		else if (ne == columnDtl_bill_bcst_nm) doDtl_bill_bcst_nm_NE(info);
		else if (ne == columnDtl_bill_bcst_dpt) doDtl_bill_bcst_dpt_NE(info);
		else if (ne == columnDtl_bill_bcst_psn) doDtl_bill_bcst_psn_NE(info);
		else if (ne == columnDtl_bill_bcst_psn_title) doDtl_bill_bcst_psn_title_NE(info);
		else if (ne == columnDtl_vmi_purc_dpt_cd) doDtl_vmi_purc_dpt_cd_NE(info);
		else if (ne == columnDtl_vmi_purc_dpt_nm) doDtl_vmi_purc_dpt_nm_NE(info);
		else if (ne == columnDtl_sppl_cntct_dpt) doDtl_sppl_cntct_dpt_NE(info);
		else if (ne == columnDtl_sppl_cntct_psn) doDtl_sppl_cntct_psn_NE(info);
		else if (ne == columnDtl_sppl_cntct_psn_title) doDtl_sppl_cntct_psn_title_NE(info);
		else if (ne == columnDtl_purc_tax_cd) doDtl_purc_tax_cd_NE(info);
		else if (ne == columnDtl_purc_tax_nm) doDtl_purc_tax_nm_NE(info);
		else if (ne == columnDtl_prov_tax_cd) doDtl_prov_tax_cd_NE(info);
		else if (ne == columnDtl_prov_tax_nm) doDtl_prov_tax_nm_NE(info);
		else if (ne == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_NE(info);
		else if (ne == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_NE(info);
		else if (ne == columnDtl_bsppl_dpt_cd) doDtl_bsppl_dpt_cd_NE(info);
		else if (ne == columnDtl_bsppl_dpt_nm) doDtl_bsppl_dpt_nm_NE(info);
		else if (ne == columnDtl_pay_dpt_cd) doDtl_pay_dpt_cd_NE(info);
		else if (ne == columnDtl_pay_dpt_nm) doDtl_pay_dpt_nm_NE(info);
		else if (ne == columnDtl_dlv_cntct_dpt) doDtl_dlv_cntct_dpt_NE(info);
		else if (ne == columnDtl_dlv_cntct_psn) doDtl_dlv_cntct_psn_NE(info);
		else if (ne == columnDtl_dlv_cntct_psn_title) doDtl_dlv_cntct_psn_title_NE(info);
		else if (ne == columnDtl_memo1) doDtl_memo1_NE(info);
		else if (ne == columnDtl_memo2) doDtl_memo2_NE(info);
		else if (ne == columnDtl_memo3) doDtl_memo3_NE(info);
		else if (ne == columnDtl_memo4) doDtl_memo4_NE(info);
		else if (ne == columnDtl_memo5) doDtl_memo5_NE(info);
		else if (ne == columnDtl_memo6) doDtl_memo6_NE(info);
		else if (ne == columnDtl_memo7) doDtl_memo7_NE(info);
		else if (ne == columnDtl_memo8) doDtl_memo8_NE(info);
		else if (ne == columnDtl_memo9) doDtl_memo9_NE(info);
		else if (ne == columnDtl_memo10) doDtl_memo10_NE(info);
		else if (ne == columnDtl_memo11) doDtl_memo11_NE(info);
		else if (ne == columnDtl_memo12) doDtl_memo12_NE(info);
		else if (ne == columnDtl_memo13) doDtl_memo13_NE(info);
		else if (ne == columnDtl_memo14) doDtl_memo14_NE(info);
		else if (ne == columnDtl_memo15) doDtl_memo15_NE(info);
		else if (ne == columnDtl_memo16) doDtl_memo16_NE(info);
		else if (ne == columnDtl_memo17) doDtl_memo17_NE(info);
		else if (ne == columnDtl_memo18) doDtl_memo18_NE(info);
		else if (ne == columnDtl_memo19) doDtl_memo19_NE(info);
		else if (ne == columnDtl_memo20) doDtl_memo20_NE(info);
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
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ref_ins_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ref_ins_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vmi_purc_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vmi_purc_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vmi_purc_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vmi_purc_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_abl_only_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_abl_only_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[memo4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo11_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo12_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo13_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo14_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo15_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo16_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo17_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo18_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo19_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo20_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm10_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[psppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_psppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cred_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cred_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_dpt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_dpt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[onr_prsppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_onr_prsppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[repurc_obli_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_repurc_obli_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fax]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fax_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cntct_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cntct_dpt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cntct_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cntct_psn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cntct_psn_title]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cntct_psn_title_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_addr1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_addr2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_addr3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_addr4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_tel_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_bcst_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_bcst_dpt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_bcst_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_bcst_psn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_bcst_psn_title]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_bcst_psn_title_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[vmi_purc_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_vmi_purc_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[vmi_purc_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_vmi_purc_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cntct_dpt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cntct_psn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_psn_title]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cntct_psn_title_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[prov_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cntct_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cntct_dpt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cntct_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cntct_psn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cntct_psn_title]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cntct_psn_title_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[memo4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo11]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo11_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo12]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo12_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo13]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo13_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo14]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo14_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo15]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo15_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo16]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo16_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo17]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo17_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo18]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo18_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo19]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo19_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo20]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo20_NE(MCEventInfo info){
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
		if (nx == FoldTab) doFold_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_cst_flg) doCnd_cst_flg_NX(info);
		else if (nx == Cnd_acst_flg) doCnd_acst_flg_NX(info);
		else if (nx == Cnd_bcst_flg) doCnd_bcst_flg_NX(info);
		else if (nx == Cnd_rcst_flg) doCnd_rcst_flg_NX(info);
		else if (nx == Cnd_dlv_flg) doCnd_dlv_flg_NX(info);
		else if (nx == Cnd_dest_flg) doCnd_dest_flg_NX(info);
		else if (nx == Cnd_cred_flg) doCnd_cred_flg_NX(info);
		else if (nx == Cnd_sppl_flg) doCnd_sppl_flg_NX(info);
		else if (nx == Cnd_asppl_flg) doCnd_asppl_flg_NX(info);
		else if (nx == Cnd_bsppl_flg) doCnd_bsppl_flg_NX(info);
		else if (nx == Cnd_psppl_flg) doCnd_psppl_flg_NX(info);
		else if (nx == Cnd_maker_flg) doCnd_maker_flg_NX(info);
		else if (nx == Cnd_bp_cd) doCnd_bp_cd_NX(info);
		else if (nx == Cnd_bp_nm) doCnd_bp_nm_NX(info);
		else if (nx == Cnd_ref_ins_flg) doCnd_ref_ins_flg_NX(info);
		else if (nx == Cnd_new_st_dt) doCnd_new_st_dt_NX(info);
		else if (nx == Cnd_dpt_cd) doCnd_dpt_cd_NX(info);
		else if (nx == Cnd_dpt_nm) doCnd_dpt_nm_NX(info);
		else if (nx == Cnd_vmi_purc_dpt_cd) doCnd_vmi_purc_dpt_cd_NX(info);
		else if (nx == Cnd_vmi_purc_dpt_nm) doCnd_vmi_purc_dpt_nm_NX(info);
		else if (nx == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_NX(info);
		else if (nx == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_NX(info);
		else if (nx == Cnd_bcst_dpt_cd) doCnd_bcst_dpt_cd_NX(info);
		else if (nx == Cnd_bcst_dpt_nm) doCnd_bcst_dpt_nm_NX(info);
		else if (nx == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NX(info);
		else if (nx == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NX(info);
		else if (nx == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NX(info);
		else if (nx == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NX(info);
		else if (nx == Cnd_pay_dpt_cd) doCnd_pay_dpt_cd_NX(info);
		else if (nx == Cnd_pay_dpt_nm) doCnd_pay_dpt_nm_NX(info);
		else if (nx == Cnd_sls_tax_cd) doCnd_sls_tax_cd_NX(info);
		else if (nx == Cnd_sls_tax_nm) doCnd_sls_tax_nm_NX(info);
		else if (nx == Cnd_purc_tax_cd) doCnd_purc_tax_cd_NX(info);
		else if (nx == Cnd_purc_tax_nm) doCnd_purc_tax_nm_NX(info);
		else if (nx == Cnd_prov_tax_cd) doCnd_prov_tax_cd_NX(info);
		else if (nx == Cnd_prov_tax_nm) doCnd_prov_tax_nm_NX(info);
		else if (nx == Cnd_tax_abl_only_flg) doCnd_tax_abl_only_flg_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_memo4) doCnd_memo4_NX(info);
		else if (nx == Cnd_memo5) doCnd_memo5_NX(info);
		else if (nx == Cnd_memo6) doCnd_memo6_NX(info);
		else if (nx == Cnd_memo7) doCnd_memo7_NX(info);
		else if (nx == Cnd_memo8) doCnd_memo8_NX(info);
		else if (nx == Cnd_memo9) doCnd_memo9_NX(info);
		else if (nx == Cnd_memo10) doCnd_memo10_NX(info);
		else if (nx == Cnd_memo11) doCnd_memo11_NX(info);
		else if (nx == Cnd_memo12) doCnd_memo12_NX(info);
		else if (nx == Cnd_memo13) doCnd_memo13_NX(info);
		else if (nx == Cnd_memo14) doCnd_memo14_NX(info);
		else if (nx == Cnd_memo15) doCnd_memo15_NX(info);
		else if (nx == Cnd_memo16) doCnd_memo16_NX(info);
		else if (nx == Cnd_memo17) doCnd_memo17_NX(info);
		else if (nx == Cnd_memo18) doCnd_memo18_NX(info);
		else if (nx == Cnd_memo19) doCnd_memo19_NX(info);
		else if (nx == Cnd_memo20) doCnd_memo20_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == Cnd_bp_grp_cd1) doCnd_bp_grp_cd1_NX(info);
		else if (nx == Cnd_bp_grp_nm1) doCnd_bp_grp_nm1_NX(info);
		else if (nx == Cnd_bp_grp_cd2) doCnd_bp_grp_cd2_NX(info);
		else if (nx == Cnd_bp_grp_nm2) doCnd_bp_grp_nm2_NX(info);
		else if (nx == Cnd_bp_grp_cd3) doCnd_bp_grp_cd3_NX(info);
		else if (nx == Cnd_bp_grp_nm3) doCnd_bp_grp_nm3_NX(info);
		else if (nx == Cnd_bp_grp_cd4) doCnd_bp_grp_cd4_NX(info);
		else if (nx == Cnd_bp_grp_nm4) doCnd_bp_grp_nm4_NX(info);
		else if (nx == Cnd_bp_grp_cd5) doCnd_bp_grp_cd5_NX(info);
		else if (nx == Cnd_bp_grp_nm5) doCnd_bp_grp_nm5_NX(info);
		else if (nx == Cnd_bp_grp_cd6) doCnd_bp_grp_cd6_NX(info);
		else if (nx == Cnd_bp_grp_nm6) doCnd_bp_grp_nm6_NX(info);
		else if (nx == Cnd_bp_grp_cd7) doCnd_bp_grp_cd7_NX(info);
		else if (nx == Cnd_bp_grp_nm7) doCnd_bp_grp_nm7_NX(info);
		else if (nx == Cnd_bp_grp_cd8) doCnd_bp_grp_cd8_NX(info);
		else if (nx == Cnd_bp_grp_nm8) doCnd_bp_grp_nm8_NX(info);
		else if (nx == Cnd_bp_grp_cd9) doCnd_bp_grp_cd9_NX(info);
		else if (nx == Cnd_bp_grp_nm9) doCnd_bp_grp_nm9_NX(info);
		else if (nx == Cnd_bp_grp_cd10) doCnd_bp_grp_cd10_NX(info);
		else if (nx == Cnd_bp_grp_nm10) doCnd_bp_grp_nm10_NX(info);
		else if (nx == BulkSet_st_dt) doBulkSet_st_dt_NX(info);
		else if (nx == BulkSet_end_dt) doBulkSet_end_dt_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_bp_cd) doDtl_bp_cd_NX(info);
		else if (nx == columnDtl_bp_nm) doDtl_bp_nm_NX(info);
		else if (nx == columnDtl_cst_flg) doDtl_cst_flg_NX(info);
		else if (nx == columnDtl_acst_flg) doDtl_acst_flg_NX(info);
		else if (nx == columnDtl_bcst_flg) doDtl_bcst_flg_NX(info);
		else if (nx == columnDtl_rcst_flg) doDtl_rcst_flg_NX(info);
		else if (nx == columnDtl_sppl_flg) doDtl_sppl_flg_NX(info);
		else if (nx == columnDtl_asppl_flg) doDtl_asppl_flg_NX(info);
		else if (nx == columnDtl_bsppl_flg) doDtl_bsppl_flg_NX(info);
		else if (nx == columnDtl_psppl_flg) doDtl_psppl_flg_NX(info);
		else if (nx == columnDtl_cred_flg) doDtl_cred_flg_NX(info);
		else if (nx == columnDtl_dlv_flg) doDtl_dlv_flg_NX(info);
		else if (nx == columnDtl_maker_flg) doDtl_maker_flg_NX(info);
		else if (nx == columnDtl_dest_flg) doDtl_dest_flg_NX(info);
		else if (nx == columnDtl_ar_dpt_typ) doDtl_ar_dpt_typ_NX(info);
		else if (nx == columnDtl_bill_dpt_typ) doDtl_bill_dpt_typ_NX(info);
		else if (nx == columnDtl_onr_prsppl_flg) doDtl_onr_prsppl_flg_NX(info);
		else if (nx == columnDtl_repurc_obli_flg) doDtl_repurc_obli_flg_NX(info);
		else if (nx == columnDtl_zip_cd) doDtl_zip_cd_NX(info);
		else if (nx == columnDtl_addr1) doDtl_addr1_NX(info);
		else if (nx == columnDtl_addr2) doDtl_addr2_NX(info);
		else if (nx == columnDtl_addr3) doDtl_addr3_NX(info);
		else if (nx == columnDtl_addr4) doDtl_addr4_NX(info);
		else if (nx == columnDtl_tel) doDtl_tel_NX(info);
		else if (nx == columnDtl_fax) doDtl_fax_NX(info);
		else if (nx == columnDtl_ar_dpt_cd) doDtl_ar_dpt_cd_NX(info);
		else if (nx == columnDtl_ar_dpt_nm) doDtl_ar_dpt_nm_NX(info);
		else if (nx == columnDtl_cst_cntct_dpt) doDtl_cst_cntct_dpt_NX(info);
		else if (nx == columnDtl_cst_cntct_psn) doDtl_cst_cntct_psn_NX(info);
		else if (nx == columnDtl_cst_cntct_psn_title) doDtl_cst_cntct_psn_title_NX(info);
		else if (nx == columnDtl_sls_tax_cd) doDtl_sls_tax_cd_NX(info);
		else if (nx == columnDtl_sls_tax_nm) doDtl_sls_tax_nm_NX(info);
		else if (nx == columnDtl_sls_anly_cd1) doDtl_sls_anly_cd1_NX(info);
		else if (nx == columnDtl_sls_anly_nm1) doDtl_sls_anly_nm1_NX(info);
		else if (nx == columnDtl_sls_anly_cd2) doDtl_sls_anly_cd2_NX(info);
		else if (nx == columnDtl_sls_anly_nm2) doDtl_sls_anly_nm2_NX(info);
		else if (nx == columnDtl_sls_anly_cd3) doDtl_sls_anly_cd3_NX(info);
		else if (nx == columnDtl_sls_anly_nm3) doDtl_sls_anly_nm3_NX(info);
		else if (nx == columnDtl_bcst_dpt_cd) doDtl_bcst_dpt_cd_NX(info);
		else if (nx == columnDtl_bcst_dpt_nm) doDtl_bcst_dpt_nm_NX(info);
		else if (nx == columnDtl_bill_zip_cd) doDtl_bill_zip_cd_NX(info);
		else if (nx == columnDtl_bill_addr1) doDtl_bill_addr1_NX(info);
		else if (nx == columnDtl_bill_addr2) doDtl_bill_addr2_NX(info);
		else if (nx == columnDtl_bill_addr3) doDtl_bill_addr3_NX(info);
		else if (nx == columnDtl_bill_addr4) doDtl_bill_addr4_NX(info);
		else if (nx == columnDtl_bill_tel) doDtl_bill_tel_NX(info);
		else if (nx == columnDtl_bill_bcst_nm) doDtl_bill_bcst_nm_NX(info);
		else if (nx == columnDtl_bill_bcst_dpt) doDtl_bill_bcst_dpt_NX(info);
		else if (nx == columnDtl_bill_bcst_psn) doDtl_bill_bcst_psn_NX(info);
		else if (nx == columnDtl_bill_bcst_psn_title) doDtl_bill_bcst_psn_title_NX(info);
		else if (nx == columnDtl_vmi_purc_dpt_cd) doDtl_vmi_purc_dpt_cd_NX(info);
		else if (nx == columnDtl_vmi_purc_dpt_nm) doDtl_vmi_purc_dpt_nm_NX(info);
		else if (nx == columnDtl_sppl_cntct_dpt) doDtl_sppl_cntct_dpt_NX(info);
		else if (nx == columnDtl_sppl_cntct_psn) doDtl_sppl_cntct_psn_NX(info);
		else if (nx == columnDtl_sppl_cntct_psn_title) doDtl_sppl_cntct_psn_title_NX(info);
		else if (nx == columnDtl_purc_tax_cd) doDtl_purc_tax_cd_NX(info);
		else if (nx == columnDtl_purc_tax_nm) doDtl_purc_tax_nm_NX(info);
		else if (nx == columnDtl_prov_tax_cd) doDtl_prov_tax_cd_NX(info);
		else if (nx == columnDtl_prov_tax_nm) doDtl_prov_tax_nm_NX(info);
		else if (nx == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_NX(info);
		else if (nx == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_NX(info);
		else if (nx == columnDtl_bsppl_dpt_cd) doDtl_bsppl_dpt_cd_NX(info);
		else if (nx == columnDtl_bsppl_dpt_nm) doDtl_bsppl_dpt_nm_NX(info);
		else if (nx == columnDtl_pay_dpt_cd) doDtl_pay_dpt_cd_NX(info);
		else if (nx == columnDtl_pay_dpt_nm) doDtl_pay_dpt_nm_NX(info);
		else if (nx == columnDtl_dlv_cntct_dpt) doDtl_dlv_cntct_dpt_NX(info);
		else if (nx == columnDtl_dlv_cntct_psn) doDtl_dlv_cntct_psn_NX(info);
		else if (nx == columnDtl_dlv_cntct_psn_title) doDtl_dlv_cntct_psn_title_NX(info);
		else if (nx == columnDtl_memo1) doDtl_memo1_NX(info);
		else if (nx == columnDtl_memo2) doDtl_memo2_NX(info);
		else if (nx == columnDtl_memo3) doDtl_memo3_NX(info);
		else if (nx == columnDtl_memo4) doDtl_memo4_NX(info);
		else if (nx == columnDtl_memo5) doDtl_memo5_NX(info);
		else if (nx == columnDtl_memo6) doDtl_memo6_NX(info);
		else if (nx == columnDtl_memo7) doDtl_memo7_NX(info);
		else if (nx == columnDtl_memo8) doDtl_memo8_NX(info);
		else if (nx == columnDtl_memo9) doDtl_memo9_NX(info);
		else if (nx == columnDtl_memo10) doDtl_memo10_NX(info);
		else if (nx == columnDtl_memo11) doDtl_memo11_NX(info);
		else if (nx == columnDtl_memo12) doDtl_memo12_NX(info);
		else if (nx == columnDtl_memo13) doDtl_memo13_NX(info);
		else if (nx == columnDtl_memo14) doDtl_memo14_NX(info);
		else if (nx == columnDtl_memo15) doDtl_memo15_NX(info);
		else if (nx == columnDtl_memo16) doDtl_memo16_NX(info);
		else if (nx == columnDtl_memo17) doDtl_memo17_NX(info);
		else if (nx == columnDtl_memo18) doDtl_memo18_NX(info);
		else if (nx == columnDtl_memo19) doDtl_memo19_NX(info);
		else if (nx == columnDtl_memo20) doDtl_memo20_NX(info);
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
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[acst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_acst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rcst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rcst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cred_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cred_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ref_ins_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ref_ins_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vmi_purc_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vmi_purc_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vmi_purc_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vmi_purc_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tax_abl_only_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tax_abl_only_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[memo4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo11_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo12_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo13_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo14_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo15_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo16_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo17_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo18_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo19_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo20_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[bp_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm10_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rcst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rcst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[psppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_psppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cred_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cred_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[maker_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_maker_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_dpt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_dpt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[onr_prsppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_onr_prsppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[repurc_obli_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_repurc_obli_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fax]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fax_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cntct_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cntct_dpt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cntct_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cntct_psn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cntct_psn_title]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cntct_psn_title_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_addr1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_addr2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_addr3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_addr4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_tel_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_bcst_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_bcst_dpt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_bcst_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_bcst_psn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_bcst_psn_title]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_bcst_psn_title_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[vmi_purc_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_vmi_purc_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[vmi_purc_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_vmi_purc_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cntct_dpt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cntct_psn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_psn_title]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cntct_psn_title_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[prov_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cntct_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cntct_dpt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cntct_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cntct_psn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cntct_psn_title]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cntct_psn_title_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[memo4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo11]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo11_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo12]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo12_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo13]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo13_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo14]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo14_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo15]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo15_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo16]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo16_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo17]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo17_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo18]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo18_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo19]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo19_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo20]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo20_NX(MCEventInfo info){
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
		if (lc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_LC(info);
		else if (lc == Cnd_bp_cd) doCnd_bp_cd_LC(info);
		else if (lc == Cnd_bp_nm) doCnd_bp_nm_LC(info);
		else if (lc == Cnd_new_st_dt) doCnd_new_st_dt_LC(info);
		else if (lc == Cnd_dpt_cd) doCnd_dpt_cd_LC(info);
		else if (lc == Cnd_dpt_nm) doCnd_dpt_nm_LC(info);
		else if (lc == Cnd_vmi_purc_dpt_cd) doCnd_vmi_purc_dpt_cd_LC(info);
		else if (lc == Cnd_vmi_purc_dpt_nm) doCnd_vmi_purc_dpt_nm_LC(info);
		else if (lc == Cnd_ar_dpt_cd) doCnd_ar_dpt_cd_LC(info);
		else if (lc == Cnd_ar_dpt_nm) doCnd_ar_dpt_nm_LC(info);
		else if (lc == Cnd_bcst_dpt_cd) doCnd_bcst_dpt_cd_LC(info);
		else if (lc == Cnd_bcst_dpt_nm) doCnd_bcst_dpt_nm_LC(info);
		else if (lc == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_LC(info);
		else if (lc == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_LC(info);
		else if (lc == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_LC(info);
		else if (lc == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_LC(info);
		else if (lc == Cnd_pay_dpt_cd) doCnd_pay_dpt_cd_LC(info);
		else if (lc == Cnd_pay_dpt_nm) doCnd_pay_dpt_nm_LC(info);
		else if (lc == Cnd_sls_tax_cd) doCnd_sls_tax_cd_LC(info);
		else if (lc == Cnd_sls_tax_nm) doCnd_sls_tax_nm_LC(info);
		else if (lc == Cnd_purc_tax_cd) doCnd_purc_tax_cd_LC(info);
		else if (lc == Cnd_purc_tax_nm) doCnd_purc_tax_nm_LC(info);
		else if (lc == Cnd_prov_tax_cd) doCnd_prov_tax_cd_LC(info);
		else if (lc == Cnd_prov_tax_nm) doCnd_prov_tax_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == Cnd_memo4) doCnd_memo4_LC(info);
		else if (lc == Cnd_memo5) doCnd_memo5_LC(info);
		else if (lc == Cnd_memo6) doCnd_memo6_LC(info);
		else if (lc == Cnd_memo7) doCnd_memo7_LC(info);
		else if (lc == Cnd_memo8) doCnd_memo8_LC(info);
		else if (lc == Cnd_memo9) doCnd_memo9_LC(info);
		else if (lc == Cnd_memo10) doCnd_memo10_LC(info);
		else if (lc == Cnd_memo11) doCnd_memo11_LC(info);
		else if (lc == Cnd_memo12) doCnd_memo12_LC(info);
		else if (lc == Cnd_memo13) doCnd_memo13_LC(info);
		else if (lc == Cnd_memo14) doCnd_memo14_LC(info);
		else if (lc == Cnd_memo15) doCnd_memo15_LC(info);
		else if (lc == Cnd_memo16) doCnd_memo16_LC(info);
		else if (lc == Cnd_memo17) doCnd_memo17_LC(info);
		else if (lc == Cnd_memo18) doCnd_memo18_LC(info);
		else if (lc == Cnd_memo19) doCnd_memo19_LC(info);
		else if (lc == Cnd_memo20) doCnd_memo20_LC(info);
		else if (lc == Cnd_bp_grp_cd1) doCnd_bp_grp_cd1_LC(info);
		else if (lc == Cnd_bp_grp_nm1) doCnd_bp_grp_nm1_LC(info);
		else if (lc == Cnd_bp_grp_cd2) doCnd_bp_grp_cd2_LC(info);
		else if (lc == Cnd_bp_grp_nm2) doCnd_bp_grp_nm2_LC(info);
		else if (lc == Cnd_bp_grp_cd3) doCnd_bp_grp_cd3_LC(info);
		else if (lc == Cnd_bp_grp_nm3) doCnd_bp_grp_nm3_LC(info);
		else if (lc == Cnd_bp_grp_cd4) doCnd_bp_grp_cd4_LC(info);
		else if (lc == Cnd_bp_grp_nm4) doCnd_bp_grp_nm4_LC(info);
		else if (lc == Cnd_bp_grp_cd5) doCnd_bp_grp_cd5_LC(info);
		else if (lc == Cnd_bp_grp_nm5) doCnd_bp_grp_nm5_LC(info);
		else if (lc == Cnd_bp_grp_cd6) doCnd_bp_grp_cd6_LC(info);
		else if (lc == Cnd_bp_grp_nm6) doCnd_bp_grp_nm6_LC(info);
		else if (lc == Cnd_bp_grp_cd7) doCnd_bp_grp_cd7_LC(info);
		else if (lc == Cnd_bp_grp_nm7) doCnd_bp_grp_nm7_LC(info);
		else if (lc == Cnd_bp_grp_cd8) doCnd_bp_grp_cd8_LC(info);
		else if (lc == Cnd_bp_grp_nm8) doCnd_bp_grp_nm8_LC(info);
		else if (lc == Cnd_bp_grp_cd9) doCnd_bp_grp_cd9_LC(info);
		else if (lc == Cnd_bp_grp_nm9) doCnd_bp_grp_nm9_LC(info);
		else if (lc == Cnd_bp_grp_cd10) doCnd_bp_grp_cd10_LC(info);
		else if (lc == Cnd_bp_grp_nm10) doCnd_bp_grp_nm10_LC(info);
		else if (lc == BulkSet_st_dt) doBulkSet_st_dt_LC(info);
		else if (lc == BulkSet_end_dt) doBulkSet_end_dt_LC(info);
		else if (lc == columnDtl_bp_cd) doDtl_bp_cd_LC(info);
		else if (lc == columnDtl_bp_nm) doDtl_bp_nm_LC(info);
		else if (lc == columnDtl_ar_dpt_typ) doDtl_ar_dpt_typ_LC(info);
		else if (lc == columnDtl_bill_dpt_typ) doDtl_bill_dpt_typ_LC(info);
		else if (lc == columnDtl_zip_cd) doDtl_zip_cd_LC(info);
		else if (lc == columnDtl_addr1) doDtl_addr1_LC(info);
		else if (lc == columnDtl_addr2) doDtl_addr2_LC(info);
		else if (lc == columnDtl_addr3) doDtl_addr3_LC(info);
		else if (lc == columnDtl_addr4) doDtl_addr4_LC(info);
		else if (lc == columnDtl_tel) doDtl_tel_LC(info);
		else if (lc == columnDtl_fax) doDtl_fax_LC(info);
		else if (lc == columnDtl_ar_dpt_cd) doDtl_ar_dpt_cd_LC(info);
		else if (lc == columnDtl_ar_dpt_nm) doDtl_ar_dpt_nm_LC(info);
		else if (lc == columnDtl_cst_cntct_dpt) doDtl_cst_cntct_dpt_LC(info);
		else if (lc == columnDtl_cst_cntct_psn) doDtl_cst_cntct_psn_LC(info);
		else if (lc == columnDtl_cst_cntct_psn_title) doDtl_cst_cntct_psn_title_LC(info);
		else if (lc == columnDtl_sls_tax_cd) doDtl_sls_tax_cd_LC(info);
		else if (lc == columnDtl_sls_tax_nm) doDtl_sls_tax_nm_LC(info);
		else if (lc == columnDtl_sls_anly_cd1) doDtl_sls_anly_cd1_LC(info);
		else if (lc == columnDtl_sls_anly_nm1) doDtl_sls_anly_nm1_LC(info);
		else if (lc == columnDtl_sls_anly_cd2) doDtl_sls_anly_cd2_LC(info);
		else if (lc == columnDtl_sls_anly_nm2) doDtl_sls_anly_nm2_LC(info);
		else if (lc == columnDtl_sls_anly_cd3) doDtl_sls_anly_cd3_LC(info);
		else if (lc == columnDtl_sls_anly_nm3) doDtl_sls_anly_nm3_LC(info);
		else if (lc == columnDtl_bcst_dpt_cd) doDtl_bcst_dpt_cd_LC(info);
		else if (lc == columnDtl_bcst_dpt_nm) doDtl_bcst_dpt_nm_LC(info);
		else if (lc == columnDtl_bill_zip_cd) doDtl_bill_zip_cd_LC(info);
		else if (lc == columnDtl_bill_addr1) doDtl_bill_addr1_LC(info);
		else if (lc == columnDtl_bill_addr2) doDtl_bill_addr2_LC(info);
		else if (lc == columnDtl_bill_addr3) doDtl_bill_addr3_LC(info);
		else if (lc == columnDtl_bill_addr4) doDtl_bill_addr4_LC(info);
		else if (lc == columnDtl_bill_tel) doDtl_bill_tel_LC(info);
		else if (lc == columnDtl_bill_bcst_nm) doDtl_bill_bcst_nm_LC(info);
		else if (lc == columnDtl_bill_bcst_dpt) doDtl_bill_bcst_dpt_LC(info);
		else if (lc == columnDtl_bill_bcst_psn) doDtl_bill_bcst_psn_LC(info);
		else if (lc == columnDtl_bill_bcst_psn_title) doDtl_bill_bcst_psn_title_LC(info);
		else if (lc == columnDtl_vmi_purc_dpt_cd) doDtl_vmi_purc_dpt_cd_LC(info);
		else if (lc == columnDtl_vmi_purc_dpt_nm) doDtl_vmi_purc_dpt_nm_LC(info);
		else if (lc == columnDtl_sppl_cntct_dpt) doDtl_sppl_cntct_dpt_LC(info);
		else if (lc == columnDtl_sppl_cntct_psn) doDtl_sppl_cntct_psn_LC(info);
		else if (lc == columnDtl_sppl_cntct_psn_title) doDtl_sppl_cntct_psn_title_LC(info);
		else if (lc == columnDtl_purc_tax_cd) doDtl_purc_tax_cd_LC(info);
		else if (lc == columnDtl_purc_tax_nm) doDtl_purc_tax_nm_LC(info);
		else if (lc == columnDtl_prov_tax_cd) doDtl_prov_tax_cd_LC(info);
		else if (lc == columnDtl_prov_tax_nm) doDtl_prov_tax_nm_LC(info);
		else if (lc == columnDtl_ap_dpt_cd) doDtl_ap_dpt_cd_LC(info);
		else if (lc == columnDtl_ap_dpt_nm) doDtl_ap_dpt_nm_LC(info);
		else if (lc == columnDtl_bsppl_dpt_cd) doDtl_bsppl_dpt_cd_LC(info);
		else if (lc == columnDtl_bsppl_dpt_nm) doDtl_bsppl_dpt_nm_LC(info);
		else if (lc == columnDtl_pay_dpt_cd) doDtl_pay_dpt_cd_LC(info);
		else if (lc == columnDtl_pay_dpt_nm) doDtl_pay_dpt_nm_LC(info);
		else if (lc == columnDtl_dlv_cntct_dpt) doDtl_dlv_cntct_dpt_LC(info);
		else if (lc == columnDtl_dlv_cntct_psn) doDtl_dlv_cntct_psn_LC(info);
		else if (lc == columnDtl_dlv_cntct_psn_title) doDtl_dlv_cntct_psn_title_LC(info);
		else if (lc == columnDtl_memo1) doDtl_memo1_LC(info);
		else if (lc == columnDtl_memo2) doDtl_memo2_LC(info);
		else if (lc == columnDtl_memo3) doDtl_memo3_LC(info);
		else if (lc == columnDtl_memo4) doDtl_memo4_LC(info);
		else if (lc == columnDtl_memo5) doDtl_memo5_LC(info);
		else if (lc == columnDtl_memo6) doDtl_memo6_LC(info);
		else if (lc == columnDtl_memo7) doDtl_memo7_LC(info);
		else if (lc == columnDtl_memo8) doDtl_memo8_LC(info);
		else if (lc == columnDtl_memo9) doDtl_memo9_LC(info);
		else if (lc == columnDtl_memo10) doDtl_memo10_LC(info);
		else if (lc == columnDtl_memo11) doDtl_memo11_LC(info);
		else if (lc == columnDtl_memo12) doDtl_memo12_LC(info);
		else if (lc == columnDtl_memo13) doDtl_memo13_LC(info);
		else if (lc == columnDtl_memo14) doDtl_memo14_LC(info);
		else if (lc == columnDtl_memo15) doDtl_memo15_LC(info);
		else if (lc == columnDtl_memo16) doDtl_memo16_LC(info);
		else if (lc == columnDtl_memo17) doDtl_memo17_LC(info);
		else if (lc == columnDtl_memo18) doDtl_memo18_LC(info);
		else if (lc == columnDtl_memo19) doDtl_memo19_LC(info);
		else if (lc == columnDtl_memo20) doDtl_memo20_LC(info);
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
	 * [Mst]パネルの[mst_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[new_st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_new_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vmi_purc_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vmi_purc_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[vmi_purc_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_vmi_purc_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ar_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ar_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bcst_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bcst_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ap_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pay_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pay_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[prov_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_prov_tax_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[memo4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo11_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo12_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo13_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo14_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo15_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo16_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo17_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo18_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo19_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo20_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_grp_nm10_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_dpt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_dpt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_addr4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tel_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[fax]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_fax_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ar_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ar_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cntct_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cntct_dpt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cntct_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cntct_psn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cntct_psn_title]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cntct_psn_title_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_anly_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_anly_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bcst_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bcst_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_addr1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_addr2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_addr3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_addr4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_tel_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_bcst_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_bcst_dpt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_bcst_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_bcst_psn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bill_bcst_psn_title]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bill_bcst_psn_title_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[vmi_purc_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_vmi_purc_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[vmi_purc_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_vmi_purc_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cntct_dpt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cntct_psn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cntct_psn_title]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cntct_psn_title_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[prov_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prov_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prov_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ap_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bsppl_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bsppl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pay_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pay_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cntct_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cntct_dpt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cntct_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cntct_psn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_cntct_psn_title]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cntct_psn_title_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[memo4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo11]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo11_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo12]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo12_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo13]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo13_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo14]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo14_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo15]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo15_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo16]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo16_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo17]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo17_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo18]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo18_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo19]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo19_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo20]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo20_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_bp_cd]の作成メソッド
	 */
	public MCList getCnd_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_vmi_purc_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_vmi_purc_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ar_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_ar_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bcst_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_bcst_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ap_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_ap_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bsppl_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_bsppl_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pay_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_pay_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sls_tax_cd]の作成メソッド
	 */
	public MCList getCnd_sls_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_purc_tax_cd]の作成メソッド
	 */
	public MCList getCnd_purc_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_prov_tax_cd]の作成メソッド
	 */
	public MCList getCnd_prov_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProvTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_bp_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bp_cd]の作成メソッド
	 */
	public MCList getDtl_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ar_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_ar_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sls_tax_cd]の作成メソッド
	 */
	public MCList getDtl_sls_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sls_anly_cd1]の作成メソッド
	 */
	public MCList getDtl_sls_anly_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsAnly1(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sls_anly_cd2]の作成メソッド
	 */
	public MCList getDtl_sls_anly_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsAnly2(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sls_anly_cd3]の作成メソッド
	 */
	public MCList getDtl_sls_anly_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsAnly3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bcst_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_bcst_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_vmi_purc_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_vmi_purc_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_purc_tax_cd]の作成メソッド
	 */
	public MCList getDtl_purc_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_prov_tax_cd]の作成メソッド
	 */
	public MCList getDtl_prov_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getProvTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ap_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_ap_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bsppl_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_bsppl_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_pay_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_pay_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0420.Srch01")) {
			return new MA_MABCL0420_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0420.Sprt01")) {
			return new MA_MABCL0420_Sprt01Bridge();
		}
		if (id.equals("MA.MABCL0420.Upd01")) {
			return new MA_MABCL0420_Upd01Bridge();
		}
		if (id.equals("MA.MABCL0420.Del01")) {
			return new MA_MABCL0420_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0420_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0420_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0420_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0420_Srch01Bridge() {
			p_MA_MABCL0420_Srch01 = new MCParam(PDef.MA_MABCL0420_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0420_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0420.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0420.DtlR.class));

			p_MA_MABCL0420_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0420_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0420_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0420_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0420_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0420.CndR up0() {
			return (mcframe.clientMABC.MABCP0420.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0420.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0420.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL0420_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0420.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0420_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0420.DtlR>)p_MA_MABCL0420_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABCL0420_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0420_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0420_Sprt01;

		/** コンストラクタ */
		protected MA_MABCL0420_Sprt01Bridge() {
			p_MA_MABCL0420_Sprt01 = new MCParam(PDef.MA_MABCL0420_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0420_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0420.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0420.DtlR.class));

			p_MA_MABCL0420_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0420_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0420_Sprt01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0420_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0420_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0420.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0420.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0420.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0420.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL0420_Sprt01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0420.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0420_Sprt01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP0420.DtlR>)p_MA_MABCL0420_Sprt01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABCL0420_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0420_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0420_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0420_Upd01Bridge() {
			p_MA_MABCL0420_Upd01 = new MCParam(PDef.MA_MABCL0420_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0420_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0420.DtlR.class));
			// Down

			p_MA_MABCL0420_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0420_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0420_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0420_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0420_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0420.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0420.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0420_Upd01;
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
	 * [MA_MABCL0420_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0420_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0420_Del01;

		/** コンストラクタ */
		protected MA_MABCL0420_Del01Bridge() {
			p_MA_MABCL0420_Del01 = new MCParam(PDef.MA_MABCL0420_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0420_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0420.DtlR.class));
			// Down

			p_MA_MABCL0420_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0420_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0420_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0420_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0420_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0420.DtlR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0420.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0420_Del01;
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