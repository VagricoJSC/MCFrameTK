package mcframe.clientMABC.MABCP1060;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
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
import mcframe.clientMABC.MABCP1060.MABCP_JnlPatternReg_MC.MA_MABCL1060_Srch01Caller;
import mcframe.clientMABC.MABCP1060.MABCP_JnlPatternReg_MC.MA_MABCL1060_Upd01Caller;
import mcframe.clientMABC.MABCP1060.MABCP_JnlPatternReg_MC.MA_MABCL1060_Del01Caller;

/**
 * 画面"MABCP_JnlPatternReg"パネルクラスです。<p>
 *
 * 自動仕訳パタンマスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_JnlPatternReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABCP1060";

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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create,0;MOD,Modify,4;DEL,Delete (Administrator),1;REF,View,3 UPD,登録する,0;MOD,訂正する,4;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_MOD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_jnl_ptn_cd_Label = null;
	/**
	 * Journal pattern cd. 仕訳パタンＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_jnl_ptn_cd = null;
	/**
	 * Journal pattern name 仕訳パタン名.<p>
	 *
	 */
	public MCTextField Cnd_jnl_ptn_nm = null;
	public MCLabel Cnd_jnl_seq_Label = null;
	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public MCNumberComboBox Cnd_jnl_seq = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [Base]ブロック関連のField定義
	public MCPanel BasePanel = null;
	public MCTitledBorder BaseTitledBorder = null;
	// [Base]ブロックの項目のField定義
	// [BaseHdr]ブロック関連のField定義
	public MCPanel BaseHdrPanel = null;
	// [BaseHdr]ブロックの項目のField定義
	// [BaseTab]ブロック関連のField定義
	public MCPanel BaseTabPanel = null;
	public MCTabbedPane BaseTabTab = null;
	// [BaseTab]ブロックの項目のField定義
	// [Base1]ブロック関連のField定義
	public MCPanel Base1Panel = null;
	// [Base1]ブロックの項目のField定義
	// [Base11]ブロック関連のField定義
	public MCPanel Base11Panel = null;
	public MCTitledBorder Base11TitledBorder = null;
	// [Base11]ブロックの項目のField定義
	// [Base12]ブロック関連のField定義
	public MCPanel Base12Panel = null;
	public MCTitledBorder Base12TitledBorder = null;
	// [Base12]ブロックの項目のField定義
	// [Base13]ブロック関連のField定義
	public MCPanel Base13Panel = null;
	// [Base13]ブロックの項目のField定義
	// [Base2]ブロック関連のField定義
	public MCPanel Base2Panel = null;
	// [Base2]ブロックの項目のField定義
	// [Base3]ブロック関連のField定義
	public MCPanel Base3Panel = null;
	// [Base3]ブロックの項目のField定義
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCCheckBox Rslt_check = null;
	public MCLabel Rslt_jnl_ptn_cd_Label = null;
	/**
	 * Journal pattern cd. 仕訳パタンＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rslt_jnl_ptn_cd = null;
	/**
	 * Journal pattern name 仕訳パタン名.<p>
	 *
	 */
	public MCTextField Rslt_jnl_ptn_nm = null;
	public MCLabel Rslt_jnl_seq_Label = null;
	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public MCNumberField Rslt_jnl_seq = null;
	public MCLabel Rslt_memo1_Label = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCTextField Rslt_memo1 = null;
	public MCLabel Rslt_memo2_Label = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCTextField Rslt_memo2 = null;
	public MCLabel Rslt_memo3_Label = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCTextField Rslt_memo3 = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCCheckBox Rslt_del_flg = null;
	public MCLabel Rslt_dr_dpt_typ_Label = null;
	/**
	 * Journal dept. type 仕訳部門区分.<p>
	 *
	 */
	public MCTextComboBox Rslt_dr_dpt_typ = null;
	/**
	 * Journal dept. type name 仕訳部門区分名.<p>
	 *
	 */
	public MCTextField Rslt_dr_dpt_typ_nm = null;
	/**
	 * Transfer destination aggregation 振替先集計.<p>
	 *
	 */
	public MCCheckBox Rslt_dr_trd_sml_flg = null;
	public MCLabel Rslt_dr_dpt_cd_Label = null;
	/**
	 * Accounting dept. cd. 会計部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rslt_dr_dpt_cd = null;
	/**
	 * Accounting dept. name 会計部門名.<p>
	 *
	 */
	public MCTextField Rslt_dr_dpt_nm = null;
	public MCLabel Rslt_dr_ptn_typ_Label = null;
	/**
	 * Pattern type パタン区分.<p>
	 *
	 */
	public MCTextComboBox Rslt_dr_ptn_typ = null;
	/**
	 * Pattern type name パタン区分名.<p>
	 *
	 */
	public MCTextField Rslt_dr_ptn_typ_nm = null;
	public MCLabel Rslt_dr_grp_cd_Label = null;
	/**
	 * Journal group cd. 仕訳グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rslt_dr_grp_cd = null;
	/**
	 * Journal group name 仕訳グループ名.<p>
	 *
	 */
	public MCTextField Rslt_dr_grp_nm = null;
	public MCLabel Rslt_dr_ac_cd_Label = null;
	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public MCTextField Rslt_dr_ac_cd = null;
	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public MCTextField Rslt_dr_ac_nm = null;
	public MCLabel Rslt_dr_sub_ac_cd_Label = null;
	/**
	 * Subsidiary account cd. 補助勘定科目ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rslt_dr_sub_ac_cd = null;
	/**
	 * Subsidiary account name 補助勘定科目名.<p>
	 *
	 */
	public MCTextField Rslt_dr_sub_ac_nm = null;
	public MCLabel Rslt_dr_bp_typ_Label = null;
	/**
	 * BP type 取引先区分.<p>
	 *
	 */
	public MCTextComboBox Rslt_dr_bp_typ = null;
	/**
	 * BP type name 取引先区分名.<p>
	 *
	 */
	public MCTextField Rslt_dr_bp_typ_nm = null;
	public MCLabel Rslt_dr_bp_cd_Label = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCTextField Rslt_dr_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCTextField Rslt_dr_bp_nm = null;
	public MCLabel Rslt_dr_ac_tax_cd_Label = null;
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rslt_dr_ac_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCTextField Rslt_dr_ac_tax_nm = null;
	public MCLabel Rslt_dr_itm_typ_Label = null;
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCTextComboBox Rslt_dr_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCTextField Rslt_dr_itm_typ_nm = null;
	public MCLabel Rslt_dr_amt_typ_Label = null;
	/**
	 * Amount type 金額区分.<p>
	 *
	 */
	public MCTextComboBox Rslt_dr_amt_typ = null;
	/**
	 * Amount type name 金額区分名.<p>
	 *
	 */
	public MCTextField Rslt_dr_amt_typ_nm = null;
	public MCLabel Rslt_dr_abs_typ_Label = null;
	/**
	 * Abstract type 摘要区分.<p>
	 *
	 */
	public MCTextComboBox Rslt_dr_abs_typ = null;
	/**
	 * Abstract type name 摘要区分名.<p>
	 *
	 */
	public MCTextField Rslt_dr_abs_typ_nm = null;
	public MCLabel Rslt_dr_abstract_Label = null;
	/**
	 * Abstract 摘要.<p>
	 *
	 */
	public MCTextField Rslt_dr_abstract = null;
	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public MCCheckBox Rslt_dr_sub_flg = null;
	/**
	 * BP used 取引先使用.<p>
	 *
	 */
	public MCCheckBox Rslt_dr_bp_flg = null;
	public MCLabel Rslt_cr_dpt_typ_Label = null;
	/**
	 * Journal dept. type 仕訳部門区分.<p>
	 *
	 */
	public MCTextComboBox Rslt_cr_dpt_typ = null;
	/**
	 * Journal dept. type name 仕訳部門区分名.<p>
	 *
	 */
	public MCTextField Rslt_cr_dpt_typ_nm = null;
	/**
	 * Transfer destination aggregation 振替先集計.<p>
	 *
	 */
	public MCCheckBox Rslt_cr_trd_sml_flg = null;
	public MCLabel Rslt_cr_dpt_cd_Label = null;
	/**
	 * Accounting dept. cd. 会計部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rslt_cr_dpt_cd = null;
	/**
	 * Accounting dept. name 会計部門名.<p>
	 *
	 */
	public MCTextField Rslt_cr_dpt_nm = null;
	public MCLabel Rslt_cr_ptn_typ_Label = null;
	/**
	 * Pattern type パタン区分.<p>
	 *
	 */
	public MCTextComboBox Rslt_cr_ptn_typ = null;
	/**
	 * Pattern type name パタン区分名.<p>
	 *
	 */
	public MCTextField Rslt_cr_ptn_typ_nm = null;
	public MCLabel Rslt_cr_grp_cd_Label = null;
	/**
	 * Journal group cd. 仕訳グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rslt_cr_grp_cd = null;
	/**
	 * Journal group name 仕訳グループ名.<p>
	 *
	 */
	public MCTextField Rslt_cr_grp_nm = null;
	public MCLabel Rslt_cr_ac_cd_Label = null;
	/**
	 * Account cd. 勘定科目ＣＤ.<p>
	 *
	 */
	public MCTextField Rslt_cr_ac_cd = null;
	/**
	 * Account name 勘定科目名.<p>
	 *
	 */
	public MCTextField Rslt_cr_ac_nm = null;
	public MCLabel Rslt_cr_sub_ac_cd_Label = null;
	/**
	 * Subsidiary account cd. 補助勘定科目ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rslt_cr_sub_ac_cd = null;
	/**
	 * Subsidiary account name 補助勘定科目名.<p>
	 *
	 */
	public MCTextField Rslt_cr_sub_ac_nm = null;
	public MCLabel Rslt_cr_bp_typ_Label = null;
	/**
	 * BP type 取引先区分.<p>
	 *
	 */
	public MCTextComboBox Rslt_cr_bp_typ = null;
	/**
	 * BP type name 取引先区分名.<p>
	 *
	 */
	public MCTextField Rslt_cr_bp_typ_nm = null;
	public MCLabel Rslt_cr_bp_cd_Label = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCTextField Rslt_cr_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCTextField Rslt_cr_bp_nm = null;
	public MCLabel Rslt_cr_ac_tax_cd_Label = null;
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rslt_cr_ac_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCTextField Rslt_cr_ac_tax_nm = null;
	public MCLabel Rslt_cr_itm_typ_Label = null;
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCTextComboBox Rslt_cr_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCTextField Rslt_cr_itm_typ_nm = null;
	public MCLabel Rslt_cr_amt_typ_Label = null;
	/**
	 * Amount type 金額区分.<p>
	 *
	 */
	public MCTextComboBox Rslt_cr_amt_typ = null;
	/**
	 * Amount type name 金額区分名.<p>
	 *
	 */
	public MCTextField Rslt_cr_amt_typ_nm = null;
	public MCLabel Rslt_cr_abs_typ_Label = null;
	/**
	 * Abstract type 摘要区分.<p>
	 *
	 */
	public MCTextComboBox Rslt_cr_abs_typ = null;
	/**
	 * Abstract type name 摘要区分名.<p>
	 *
	 */
	public MCTextField Rslt_cr_abs_typ_nm = null;
	public MCLabel Rslt_cr_abstract_Label = null;
	/**
	 * Abstract 摘要.<p>
	 *
	 */
	public MCTextField Rslt_cr_abstract = null;
	/**
	 * Use subsidiary account 補助科目使用.<p>
	 *
	 */
	public MCCheckBox Rslt_cr_sub_flg = null;
	/**
	 * BP used 取引先使用.<p>
	 *
	 */
	public MCCheckBox Rslt_cr_bp_flg = null;
	/**
	 * Minus マイナス.<p>
	 *
	 */
	public MCCheckBox Rslt_minus_flg = null;
	/**
	 * Carry-over journal 繰越仕訳.<p>
	 *
	 */
	public MCCheckBox Rslt_carry_flg = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Rslt_itm_p_PPanel;
	public MCTextField Rslt_itm_cd;	// [Rslt]の[itm_p.itm_cd]を[Rslt_itm_cd]としてエイリアス定義。
	public MCTextComboBox Rslt_itm_sub1;	// [Rslt]の[itm_p.itm_sub1]を[Rslt_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Rslt_itm_sub2;	// [Rslt]の[itm_p.itm_sub2]を[Rslt_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Rslt_itm_sub3;	// [Rslt]の[itm_p.itm_sub3]を[Rslt_itm_sub3]としてエイリアス定義。
	public MCTextField Rslt_itm_nm;	// [Rslt]の[itm_p.itm_nm]を[Rslt_itm_nm]としてエイリアス定義。
	public MCLabel Rslt_itm_jnl_cd_Label = null;
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rslt_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCTextField Rslt_itm_jnl_nm = null;
	public MCLabel Rslt_ac_rsn_cd_Label = null;
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rslt_ac_rsn_cd = null;
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public MCTextField Rslt_ac_rsn_nm = null;
	public MCLabel Rslt_purc_typ_Label = null;
	/**
	 * Purchase type 購買区分.<p>
	 *
	 */
	public MCTextComboBox Rslt_purc_typ = null;
	/**
	 * Purchase type name 購買区分名.<p>
	 *
	 */
	public MCTextField Rslt_purc_typ_nm = null;
	public MCLabel Rslt_un_fix_typ_Label = null;
	/**
	 * Amount unfirm type 金額未確定区分.<p>
	 *
	 */
	public MCTextComboBox Rslt_un_fix_typ = null;
	/**
	 * Amount unfirm type name 金額未確定区分名.<p>
	 *
	 */
	public MCTextField Rslt_un_fix_typ_nm = null;
	public MCLabel Rslt_foreign_typ_Label = null;
	/**
	 * Foreign transaction type 国外取引区分.<p>
	 *
	 */
	public MCTextComboBox Rslt_foreign_typ = null;
	/**
	 * Foreign transaction type name 国外取引区分名.<p>
	 *
	 */
	public MCTextField Rslt_foreign_typ_nm = null;
	public MCLabel Rslt_cur_cd_Label = null;
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Rslt_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCTextField Rslt_cur_nm = null;
	public MCLabel Rslt_asst_typ_Label = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCTextComboBox Rslt_asst_typ = null;
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public MCTextField Rslt_asst_typ_nm = null;
	public MCLabel Rslt_quality_typ_Label = null;
	/**
	 * Inventory conforming type 在庫良品区分.<p>
	 *
	 */
	public MCTextComboBox Rslt_quality_typ = null;
	/**
	 * Inventory conforming type name 在庫良品区分名.<p>
	 *
	 */
	public MCTextField Rslt_quality_typ_nm = null;
	public MCLabel Rslt_inv_loc_typ_Label = null;
	/**
	 * Inventory location type 在庫場所区分.<p>
	 *
	 */
	public MCTextComboBox Rslt_inv_loc_typ = null;
	/**
	 * Inventory location type name 在庫場所区分名.<p>
	 *
	 */
	public MCTextField Rslt_inv_loc_typ_nm = null;
	public MCLabel Rslt_amt_sign_typ_Label = null;
	/**
	 * Amount sign type 金額符号区分.<p>
	 *
	 */
	public MCTextComboBox Rslt_amt_sign_typ = null;
	/**
	 * Amount sign type name 金額符号区分名.<p>
	 *
	 */
	public MCTextField Rslt_amt_sign_typ_nm = null;
	public MCLabel Rslt_jnl_key1_Label = null;
	/**
	 * Journal key column 1 仕訳キー項目１.<p>
	 *
	 */
	public MCTextField Rslt_jnl_key1 = null;
	public MCLabel Rslt_jnl_key2_Label = null;
	/**
	 * Journal key column 2 仕訳キー項目２.<p>
	 *
	 */
	public MCTextField Rslt_jnl_key2 = null;
	public MCLabel Rslt_jnl_key3_Label = null;
	/**
	 * Journal key column 3 仕訳キー項目３.<p>
	 *
	 */
	public MCTextField Rslt_jnl_key3 = null;
	public MCLabel Rslt_jnl_key4_Label = null;
	/**
	 * Journal key column 4 仕訳キー項目４.<p>
	 *
	 */
	public MCTextField Rslt_jnl_key4 = null;
	public MCLabel Rslt_jnl_key5_Label = null;
	/**
	 * Journal key column 5 仕訳キー項目５.<p>
	 *
	 */
	public MCTextField Rslt_jnl_key5 = null;
	public MCLabel Rslt_jnl_key6_Label = null;
	/**
	 * Journal key column 6 仕訳キー項目６.<p>
	 *
	 */
	public MCTextField Rslt_jnl_key6 = null;
	public MCLabel Rslt_jnl_key7_Label = null;
	/**
	 * Journal key column 7 仕訳キー項目７.<p>
	 *
	 */
	public MCTextField Rslt_jnl_key7 = null;
	public MCLabel Rslt_jnl_key8_Label = null;
	/**
	 * Journal key column 8 仕訳キー項目８.<p>
	 *
	 */
	public MCTextField Rslt_jnl_key8 = null;
	public MCLabel Rslt_jnl_key9_Label = null;
	/**
	 * Journal key column 9 仕訳キー項目９.<p>
	 *
	 */
	public MCTextField Rslt_jnl_key9 = null;
	public MCLabel Rslt_jnl_key10_Label = null;
	/**
	 * Journal key column 10 仕訳キー項目１０.<p>
	 *
	 */
	public MCTextField Rslt_jnl_key10 = null;
	/**
	 * Not for Jan. １月対象外.<p>
	 *
	 */
	public MCCheckBox Rslt_mon01_invalid_flg = null;
	/**
	 * Not for Feb. ２月対象外.<p>
	 *
	 */
	public MCCheckBox Rslt_mon02_invalid_flg = null;
	/**
	 * Not for Mar. ３月対象外.<p>
	 *
	 */
	public MCCheckBox Rslt_mon03_invalid_flg = null;
	/**
	 * Not for Apr. ４月対象外.<p>
	 *
	 */
	public MCCheckBox Rslt_mon04_invalid_flg = null;
	/**
	 * Not for May ５月対象外.<p>
	 *
	 */
	public MCCheckBox Rslt_mon05_invalid_flg = null;
	/**
	 * Not for Jun. ６月対象外.<p>
	 *
	 */
	public MCCheckBox Rslt_mon06_invalid_flg = null;
	/**
	 * Not for July ７月対象外.<p>
	 *
	 */
	public MCCheckBox Rslt_mon07_invalid_flg = null;
	/**
	 * Not for Aug. ８月対象外.<p>
	 *
	 */
	public MCCheckBox Rslt_mon08_invalid_flg = null;
	/**
	 * Not for Sep. ９月対象外.<p>
	 *
	 */
	public MCCheckBox Rslt_mon09_invalid_flg = null;
	/**
	 * Not for Oct. １０月対象外.<p>
	 *
	 */
	public MCCheckBox Rslt_mon10_invalid_flg = null;
	/**
	 * Not for Nov. １１月対象外.<p>
	 *
	 */
	public MCCheckBox Rslt_mon11_invalid_flg = null;
	/**
	 * Not for Dec. １２月対象外.<p>
	 *
	 */
	public MCCheckBox Rslt_mon12_invalid_flg = null;
	public MCLabel Rslt_ins_usr_id_Label = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Rslt_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCTextField Rslt_ins_usr_nm = null;
	public MCLabel Rslt_ins_func_id_Label = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCTextField Rslt_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCTextField Rslt_ins_func_nm = null;
	public MCLabel Rslt_upd_usr_id_Label = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Rslt_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCTextField Rslt_upd_usr_nm = null;
	public MCLabel Rslt_upd_func_id_Label = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCTextField Rslt_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCTextField Rslt_upd_func_nm = null;
	public MCLabel Rslt_ins_ts_Label = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestampField Rslt_ins_ts = null;
	public MCLabel Rslt_upd_ts_Label = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestampField Rslt_upd_ts = null;
	public MCLabel Rslt_upd_srv_req_no_Label = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCTextField Rslt_upd_srv_req_no = null;
	public MCLabel Rslt_upd_cntr_Label = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumberField Rslt_upd_cntr = null;
	public MCLabel Rslt_del_usr_id_Label = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Rslt_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCTextField Rslt_del_usr_nm = null;
	public MCLabel Rslt_del_ts_Label = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestampField Rslt_del_ts = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Debit/credit 借方／貸方.<p>
	 *
	 */
	public MCButtonGroup Btn_dr_typ_Group = null;
	public MCRadioButton Btn_dr_typ_DR = null;
	public MCRadioButton Btn_dr_typ_CR = null;
	/**
	 * Accounting reason account setting master entry 会計理由科目設定マスタ登録.<p>
	 *
	 */
	public MCButton Btn_open_MABCP1110 = null;
	/**
	 * Item journal account setting master entry 品目仕訳科目設定マスタ登録.<p>
	 *
	 */
	public MCButton Btn_open_MABCP1120 = null;
	/**
	 * Bank account type setting master entry 口座科目設定マスタ登録.<p>
	 *
	 */
	public MCButton Btn_open_MABCP1130 = null;
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
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [MOD]モードを表す定数 */
	public static final String MOD = "MOD";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, SRCH, MOD, DEL, REF, FIX_U, FIX};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABCL1060_Srch01]のCallerの作成 */
	protected MABCP_JnlPatternReg_MC.MA_MABCL1060_Srch01Caller createMA_MABCL1060_Srch01() {
		MABCP_JnlPatternReg_MC.MA_MABCL1060_Srch01Caller<MABCP_JnlPatternReg, MA_MABCL1060_Srch01Bridge>
		caller = ((MABCP_JnlPatternReg_MC)this).new MA_MABCL1060_Srch01Caller<MABCP_JnlPatternReg, MA_MABCL1060_Srch01Bridge>(
					(MABCP_JnlPatternReg)this, new MA_MABCL1060_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL1060_Srch01]の呼び出し */
	protected void callMA_MABCL1060_Srch01() {
		MCCaller caller = createMA_MABCL1060_Srch01();
		caller.exec();
	}
	/** [MA_MABCL1060_Upd01]のCallerの作成 */
	protected MABCP_JnlPatternReg_MC.MA_MABCL1060_Upd01Caller createMA_MABCL1060_Upd01() {
		MABCP_JnlPatternReg_MC.MA_MABCL1060_Upd01Caller<MABCP_JnlPatternReg, MA_MABCL1060_Upd01Bridge>
		caller = ((MABCP_JnlPatternReg_MC)this).new MA_MABCL1060_Upd01Caller<MABCP_JnlPatternReg, MA_MABCL1060_Upd01Bridge>(
					(MABCP_JnlPatternReg)this, new MA_MABCL1060_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL1060_Upd01]の呼び出し */
	protected void callMA_MABCL1060_Upd01() {
		MCCaller caller = createMA_MABCL1060_Upd01();
		caller.exec();
	}
	/** [MA_MABCL1060_Del01]のCallerの作成 */
	protected MABCP_JnlPatternReg_MC.MA_MABCL1060_Del01Caller createMA_MABCL1060_Del01() {
		MABCP_JnlPatternReg_MC.MA_MABCL1060_Del01Caller<MABCP_JnlPatternReg, MA_MABCL1060_Del01Bridge>
		caller = ((MABCP_JnlPatternReg_MC)this).new MA_MABCL1060_Del01Caller<MABCP_JnlPatternReg, MA_MABCL1060_Del01Bridge>(
					(MABCP_JnlPatternReg)this, new MA_MABCL1060_Del01Bridge());
		return caller;
	}
	/** [MA_MABCL1060_Del01]の呼び出し */
	protected void callMA_MABCL1060_Del01() {
		MCCaller caller = createMA_MABCL1060_Del01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP1060.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP1060.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP1060.RsltR aRsltR;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP1060.BtnR aBtnR;
	/** [RsltAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP1060.RsltR> aRsltAllL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP1060.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP1060.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP1060.MstR createMstR() {
		return mcframe.clientMABC.MABCP1060.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP1060.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP1060.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP1060.CndR createCndR() {
		return mcframe.clientMABC.MABCP1060.CndR.create();
	}

	/**
	 * 項目コピーによってaRsltRを設定します。
	 *
	 * aRsltRのインスタンスは変更されません。
	 *
	 * @param row RsltR
	 */
	public void setRsltR(mcframe.clientMABC.MABCP1060.RsltR row) {
		if (row != null) {
			MCRow.copyall(getRsltR(), row);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltRを返します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMABC.MABCP1060.RsltR getRsltR() {
		return aRsltR;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMABC.MABCP1060.RsltR createRsltR() {
		return mcframe.clientMABC.MABCP1060.RsltR.create();
	}

	/**
	 * 項目コピーによってaBtnRを設定します。
	 *
	 * aBtnRのインスタンスは変更されません。
	 *
	 * @param row BtnR
	 */
	public void setBtnR(mcframe.clientMABC.MABCP1060.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMABC.MABCP1060.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMABC.MABCP1060.BtnR createBtnR() {
		return mcframe.clientMABC.MABCP1060.BtnR.create();
	}

	/**
	 * コピーによってaRsltAllLを設定します。
	 *
	 * aRsltAllLのインスタンスは変更されません。
	 *
	 * @param dataset RsltAllL
	 */
	public void setRsltAllL(MCList<mcframe.clientMABC.MABCP1060.RsltR> aList) {
		if (getRsltAllL() != aList) {
			getRsltAllL().setAll(aList);
		}
	}

	/**
	 * [RsltAll]ブロックのコンテナaRsltAllLを返します。
	 *
	 * @return RsltAllL
	 */
	public MCList<mcframe.clientMABC.MABCP1060.RsltR> getRsltAllL() {
		return aRsltAllL;
	}

	/**
	 * aRsltAllRを作成します。
	 *
	 * @return RsltAllR
	 */
	public mcframe.clientMABC.MABCP1060.RsltR createRsltAllR() {
		return mcframe.clientMABC.MABCP1060.RsltR.create();
	}

	/**
	 * aRsltAllLを作成します。
	 *
	 * @return RsltAllL
	 */
	public MCList<mcframe.clientMABC.MABCP1060.RsltR> createRsltAllL() {
		return MCList.create(mcframe.clientMABC.MABCP1060.RsltR.class);
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
		if(!MCCollectionUtil.contains(ret, getRsltR())) ret.add(getRsltR());
		if(!MCCollectionUtil.contains(ret, getBtnR())) ret.add(getBtnR());
		if(!MCCollectionUtil.contains(ret, getRsltAllL())) ret.add(getRsltAllL());
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
		if(aCnt == getRsltR()) return "Rslt";
		if(aCnt == getBtnR()) return "Btn";
		if(aCnt == getRsltAllL()) return "RsltAll";
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
		if(bId.equals("Rslt")) return getRsltR();
		if(bId.equals("Btn")) return getBtnR();
		if(bId.equals("RsltAll")) return getRsltAllL();
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
		ret.add(CndPanel);
		ret.add(BasePanel);
		ret.add(BaseHdrPanel);
		ret.add(BaseTabPanel);
		ret.add(Base1Panel);
		ret.add(Base11Panel);
		ret.add(Base12Panel);
		ret.add(Base13Panel);
		ret.add(Base2Panel);
		ret.add(Base3Panel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_JnlPatternReg_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aRsltR = createRsltR();
		aBtnR = createBtnR();
		aRsltAllL = createRsltAllL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_JnlPatternReg_MC_A(String name) {
		aMstR = createMstR();
		aCndR = createCndR();
		aRsltR = createRsltR();
		aBtnR = createBtnR();
		aRsltAllL = createRsltAllL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_JnlPatternReg_MC.jbCreateScreenOpe((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbCreateMst((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbCreateCnd((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbCreateBase((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbCreateBaseHdr((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbCreateBaseTab((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbCreateBase1((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbCreateBase11((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbCreateBase12((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbCreateBase13((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbCreateBase2((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbCreateBase3((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbCreateRslt((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbCreateBtn((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbCreateEastBtn((MABCP_JnlPatternReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_JnlPatternReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_JnlPatternReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_JnlPatternReg p) {
	}

	/**
	 * [Base]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBase(MABCP_JnlPatternReg p) {
	}

	/**
	 * [BaseHdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBaseHdr(MABCP_JnlPatternReg p) {
	}

	/**
	 * [BaseTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBaseTab(MABCP_JnlPatternReg p) {
	}

	/**
	 * [Base1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBase1(MABCP_JnlPatternReg p) {
	}

	/**
	 * [Base11]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBase11(MABCP_JnlPatternReg p) {
	}

	/**
	 * [Base12]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBase12(MABCP_JnlPatternReg p) {
	}

	/**
	 * [Base13]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBase13(MABCP_JnlPatternReg p) {
	}

	/**
	 * [Base2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBase2(MABCP_JnlPatternReg p) {
	}

	/**
	 * [Base3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBase3(MABCP_JnlPatternReg p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MABCP_JnlPatternReg p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getRsltR().itm_p());
		p.Rslt_itm_p_PPanel.setName("Rslt.itm_p");
		p.Rslt_itm_cd = p.Rslt_itm_p_PPanel.Itm_itm_cd;
		p.Rslt_itm_cd.addAliasName("Rslt.itm_cd", p);
		p.Rslt_itm_sub1 = p.Rslt_itm_p_PPanel.Itm_itm_sub1;
		p.Rslt_itm_sub1.addAliasName("Rslt.itm_sub1", p);
		p.Rslt_itm_sub2 = p.Rslt_itm_p_PPanel.Itm_itm_sub2;
		p.Rslt_itm_sub2.addAliasName("Rslt.itm_sub2", p);
		p.Rslt_itm_sub3 = p.Rslt_itm_p_PPanel.Itm_itm_sub3;
		p.Rslt_itm_sub3.addAliasName("Rslt.itm_sub3", p);
		p.Rslt_itm_nm = p.Rslt_itm_p_PPanel.Itm_itm_nm;
		p.Rslt_itm_nm.addAliasName("Rslt.itm_nm", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_JnlPatternReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABCP_JnlPatternReg p) {
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

	
	/** [Cnd_jnl_ptn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_jnl_ptn_cd_p = null;

	/**
	 * [Cnd_jnl_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_jnl_ptn_cd_ListPutter() {
		if (Cnd_jnl_ptn_cd_p == null) {
			Cnd_jnl_ptn_cd_p = createCnd_jnl_ptn_cd_ListPutter(Cnd_jnl_ptn_cd, "jnl_ptn_cd", "jnl_ptn_nm");

		}
		return Cnd_jnl_ptn_cd_p;
	}
	
	
	/** [Cnd_jnl_seq_ListPutter]の定義 */
	private MCListPutter Cnd_jnl_seq_p = null;

	/**
	 * [Cnd_jnl_seq_ListPutter]の取得
	 */
	protected MCListPutter getCnd_jnl_seq_ListPutter() {
		if (Cnd_jnl_seq_p == null) {
			Cnd_jnl_seq_p = createCnd_jnl_seq_ListPutter(Cnd_jnl_seq, "jnl_seq");

		}
		return Cnd_jnl_seq_p;
	}
	
	
	/** [Rslt_jnl_ptn_cd_ListPutter]の定義 */
	private MCListPutter Rslt_jnl_ptn_cd_p = null;

	/**
	 * [Rslt_jnl_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_jnl_ptn_cd_ListPutter() {
		if (Rslt_jnl_ptn_cd_p == null) {
			Rslt_jnl_ptn_cd_p = createRslt_jnl_ptn_cd_ListPutter(Rslt_jnl_ptn_cd, "jnl_ptn_cd", "jnl_ptn_nm");

		}
		return Rslt_jnl_ptn_cd_p;
	}
	
	
	/** [Rslt_dr_dpt_typ_ListPutter]の定義 */
	private MCListPutter Rslt_dr_dpt_typ_p = null;

	/**
	 * [Rslt_dr_dpt_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dr_dpt_typ_ListPutter() {
		if (Rslt_dr_dpt_typ_p == null) {
			Rslt_dr_dpt_typ_p = createRslt_dr_dpt_typ_ListPutter(Rslt_dr_dpt_typ, "dr_dpt_typ", "dr_dpt_typ_nm");

		}
		return Rslt_dr_dpt_typ_p;
	}
	
	
	/** [Rslt_dr_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_dr_dpt_cd_p = null;

	/**
	 * [Rslt_dr_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dr_dpt_cd_ListPutter() {
		if (Rslt_dr_dpt_cd_p == null) {
			Rslt_dr_dpt_cd_p = createRslt_dr_dpt_cd_ListPutter(Rslt_dr_dpt_cd, "dr_dpt_cd", "dr_dpt_nm");

		}
		return Rslt_dr_dpt_cd_p;
	}
	
	
	/** [Rslt_dr_ptn_typ_ListPutter]の定義 */
	private MCListPutter Rslt_dr_ptn_typ_p = null;

	/**
	 * [Rslt_dr_ptn_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dr_ptn_typ_ListPutter() {
		if (Rslt_dr_ptn_typ_p == null) {
			Rslt_dr_ptn_typ_p = createRslt_dr_ptn_typ_ListPutter(Rslt_dr_ptn_typ, "dr_ptn_typ", "dr_ptn_typ_nm");

		}
		return Rslt_dr_ptn_typ_p;
	}
	
	
	/** [Rslt_dr_grp_cd_ListPutter]の定義 */
	private MCListPutter Rslt_dr_grp_cd_p = null;

	/**
	 * [Rslt_dr_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dr_grp_cd_ListPutter() {
		if (Rslt_dr_grp_cd_p == null) {
			Rslt_dr_grp_cd_p = createRslt_dr_grp_cd_ListPutter(Rslt_dr_grp_cd, "dr_grp_cd", "dr_grp_nm");

		}
		return Rslt_dr_grp_cd_p;
	}
	
	
	/** [Rslt_dr_ac_cd_ListPutter]の定義 */
	private MCListPutter Rslt_dr_ac_cd_p = null;

	/**
	 * [Rslt_dr_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dr_ac_cd_ListPutter() {
		if (Rslt_dr_ac_cd_p == null) {
			Rslt_dr_ac_cd_p = createRslt_dr_ac_cd_ListPutter(Rslt_dr_ac_cd, "dr_ac_cd", "dr_ac_nm","dr_sub_flg","dr_bp_flg");

		}
		return Rslt_dr_ac_cd_p;
	}
	
	
	/** [Rslt_dr_sub_ac_cd_ListPutter]の定義 */
	private MCListPutter Rslt_dr_sub_ac_cd_p = null;

	/**
	 * [Rslt_dr_sub_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dr_sub_ac_cd_ListPutter() {
		if (Rslt_dr_sub_ac_cd_p == null) {
			Rslt_dr_sub_ac_cd_p = createRslt_dr_sub_ac_cd_ListPutter(Rslt_dr_sub_ac_cd, "dr_sub_ac_cd", "dr_sub_ac_nm");

		}
		return Rslt_dr_sub_ac_cd_p;
	}
	
	
	/** [Rslt_dr_bp_typ_ListPutter]の定義 */
	private MCListPutter Rslt_dr_bp_typ_p = null;

	/**
	 * [Rslt_dr_bp_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dr_bp_typ_ListPutter() {
		if (Rslt_dr_bp_typ_p == null) {
			Rslt_dr_bp_typ_p = createRslt_dr_bp_typ_ListPutter(Rslt_dr_bp_typ, "dr_bp_typ", "dr_bp_typ_nm");

		}
		return Rslt_dr_bp_typ_p;
	}
	
	
	/** [Rslt_dr_bp_cd_ListPutter]の定義 */
	private MCListPutter Rslt_dr_bp_cd_p = null;

	/**
	 * [Rslt_dr_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dr_bp_cd_ListPutter() {
		if (Rslt_dr_bp_cd_p == null) {
			Rslt_dr_bp_cd_p = createRslt_dr_bp_cd_ListPutter(Rslt_dr_bp_cd, "dr_bp_cd", "dr_bp_nm");

		}
		return Rslt_dr_bp_cd_p;
	}
	
	
	/** [Rslt_dr_ac_tax_cd_ListPutter]の定義 */
	private MCListPutter Rslt_dr_ac_tax_cd_p = null;

	/**
	 * [Rslt_dr_ac_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dr_ac_tax_cd_ListPutter() {
		if (Rslt_dr_ac_tax_cd_p == null) {
			Rslt_dr_ac_tax_cd_p = createRslt_dr_ac_tax_cd_ListPutter(Rslt_dr_ac_tax_cd, "dr_ac_tax_cd", "dr_ac_tax_nm");

		}
		return Rslt_dr_ac_tax_cd_p;
	}
	
	
	/** [Rslt_dr_itm_typ_ListPutter]の定義 */
	private MCListPutter Rslt_dr_itm_typ_p = null;

	/**
	 * [Rslt_dr_itm_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dr_itm_typ_ListPutter() {
		if (Rslt_dr_itm_typ_p == null) {
			Rslt_dr_itm_typ_p = createRslt_dr_itm_typ_ListPutter(Rslt_dr_itm_typ, "dr_itm_typ", "dr_itm_typ_nm");

		}
		return Rslt_dr_itm_typ_p;
	}
	
	
	/** [Rslt_dr_amt_typ_ListPutter]の定義 */
	private MCListPutter Rslt_dr_amt_typ_p = null;

	/**
	 * [Rslt_dr_amt_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dr_amt_typ_ListPutter() {
		if (Rslt_dr_amt_typ_p == null) {
			Rslt_dr_amt_typ_p = createRslt_dr_amt_typ_ListPutter(Rslt_dr_amt_typ, "dr_amt_typ", "dr_amt_typ_nm");

		}
		return Rslt_dr_amt_typ_p;
	}
	
	
	/** [Rslt_dr_abs_typ_ListPutter]の定義 */
	private MCListPutter Rslt_dr_abs_typ_p = null;

	/**
	 * [Rslt_dr_abs_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_dr_abs_typ_ListPutter() {
		if (Rslt_dr_abs_typ_p == null) {
			Rslt_dr_abs_typ_p = createRslt_dr_abs_typ_ListPutter(Rslt_dr_abs_typ, "dr_abs_typ", "dr_abs_typ_nm");

		}
		return Rslt_dr_abs_typ_p;
	}
	
	
	/** [Rslt_cr_dpt_typ_ListPutter]の定義 */
	private MCListPutter Rslt_cr_dpt_typ_p = null;

	/**
	 * [Rslt_cr_dpt_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_cr_dpt_typ_ListPutter() {
		if (Rslt_cr_dpt_typ_p == null) {
			Rslt_cr_dpt_typ_p = createRslt_cr_dpt_typ_ListPutter(Rslt_cr_dpt_typ, "cr_dpt_typ", "cr_dpt_typ_nm");

		}
		return Rslt_cr_dpt_typ_p;
	}
	
	
	/** [Rslt_cr_dpt_cd_ListPutter]の定義 */
	private MCListPutter Rslt_cr_dpt_cd_p = null;

	/**
	 * [Rslt_cr_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_cr_dpt_cd_ListPutter() {
		if (Rslt_cr_dpt_cd_p == null) {
			Rslt_cr_dpt_cd_p = createRslt_cr_dpt_cd_ListPutter(Rslt_cr_dpt_cd, "cr_dpt_cd", "cr_dpt_nm");

		}
		return Rslt_cr_dpt_cd_p;
	}
	
	
	/** [Rslt_cr_ptn_typ_ListPutter]の定義 */
	private MCListPutter Rslt_cr_ptn_typ_p = null;

	/**
	 * [Rslt_cr_ptn_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_cr_ptn_typ_ListPutter() {
		if (Rslt_cr_ptn_typ_p == null) {
			Rslt_cr_ptn_typ_p = createRslt_cr_ptn_typ_ListPutter(Rslt_cr_ptn_typ, "cr_ptn_typ", "cr_ptn_typ_nm");

		}
		return Rslt_cr_ptn_typ_p;
	}
	
	
	/** [Rslt_cr_grp_cd_ListPutter]の定義 */
	private MCListPutter Rslt_cr_grp_cd_p = null;

	/**
	 * [Rslt_cr_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_cr_grp_cd_ListPutter() {
		if (Rslt_cr_grp_cd_p == null) {
			Rslt_cr_grp_cd_p = createRslt_cr_grp_cd_ListPutter(Rslt_cr_grp_cd, "cr_grp_cd", "cr_grp_nm");

		}
		return Rslt_cr_grp_cd_p;
	}
	
	
	/** [Rslt_cr_ac_cd_ListPutter]の定義 */
	private MCListPutter Rslt_cr_ac_cd_p = null;

	/**
	 * [Rslt_cr_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_cr_ac_cd_ListPutter() {
		if (Rslt_cr_ac_cd_p == null) {
			Rslt_cr_ac_cd_p = createRslt_cr_ac_cd_ListPutter(Rslt_cr_ac_cd, "cr_ac_cd", "cr_ac_nm","cr_sub_flg","cr_bp_flg");

		}
		return Rslt_cr_ac_cd_p;
	}
	
	
	/** [Rslt_cr_sub_ac_cd_ListPutter]の定義 */
	private MCListPutter Rslt_cr_sub_ac_cd_p = null;

	/**
	 * [Rslt_cr_sub_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_cr_sub_ac_cd_ListPutter() {
		if (Rslt_cr_sub_ac_cd_p == null) {
			Rslt_cr_sub_ac_cd_p = createRslt_cr_sub_ac_cd_ListPutter(Rslt_cr_sub_ac_cd, "cr_sub_ac_cd", "cr_sub_ac_nm");

		}
		return Rslt_cr_sub_ac_cd_p;
	}
	
	
	/** [Rslt_cr_bp_typ_ListPutter]の定義 */
	private MCListPutter Rslt_cr_bp_typ_p = null;

	/**
	 * [Rslt_cr_bp_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_cr_bp_typ_ListPutter() {
		if (Rslt_cr_bp_typ_p == null) {
			Rslt_cr_bp_typ_p = createRslt_cr_bp_typ_ListPutter(Rslt_cr_bp_typ, "cr_bp_typ", "cr_bp_typ_nm");

		}
		return Rslt_cr_bp_typ_p;
	}
	
	
	/** [Rslt_cr_bp_cd_ListPutter]の定義 */
	private MCListPutter Rslt_cr_bp_cd_p = null;

	/**
	 * [Rslt_cr_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_cr_bp_cd_ListPutter() {
		if (Rslt_cr_bp_cd_p == null) {
			Rslt_cr_bp_cd_p = createRslt_cr_bp_cd_ListPutter(Rslt_cr_bp_cd, "cr_bp_cd", "cr_bp_nm");

		}
		return Rslt_cr_bp_cd_p;
	}
	
	
	/** [Rslt_cr_ac_tax_cd_ListPutter]の定義 */
	private MCListPutter Rslt_cr_ac_tax_cd_p = null;

	/**
	 * [Rslt_cr_ac_tax_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_cr_ac_tax_cd_ListPutter() {
		if (Rslt_cr_ac_tax_cd_p == null) {
			Rslt_cr_ac_tax_cd_p = createRslt_cr_ac_tax_cd_ListPutter(Rslt_cr_ac_tax_cd, "cr_ac_tax_cd", "cr_ac_tax_nm");

		}
		return Rslt_cr_ac_tax_cd_p;
	}
	
	
	/** [Rslt_cr_itm_typ_ListPutter]の定義 */
	private MCListPutter Rslt_cr_itm_typ_p = null;

	/**
	 * [Rslt_cr_itm_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_cr_itm_typ_ListPutter() {
		if (Rslt_cr_itm_typ_p == null) {
			Rslt_cr_itm_typ_p = createRslt_cr_itm_typ_ListPutter(Rslt_cr_itm_typ, "cr_itm_typ", "cr_itm_typ_nm");

		}
		return Rslt_cr_itm_typ_p;
	}
	
	
	/** [Rslt_cr_amt_typ_ListPutter]の定義 */
	private MCListPutter Rslt_cr_amt_typ_p = null;

	/**
	 * [Rslt_cr_amt_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_cr_amt_typ_ListPutter() {
		if (Rslt_cr_amt_typ_p == null) {
			Rslt_cr_amt_typ_p = createRslt_cr_amt_typ_ListPutter(Rslt_cr_amt_typ, "cr_amt_typ", "cr_amt_typ_nm");

		}
		return Rslt_cr_amt_typ_p;
	}
	
	
	/** [Rslt_cr_abs_typ_ListPutter]の定義 */
	private MCListPutter Rslt_cr_abs_typ_p = null;

	/**
	 * [Rslt_cr_abs_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_cr_abs_typ_ListPutter() {
		if (Rslt_cr_abs_typ_p == null) {
			Rslt_cr_abs_typ_p = createRslt_cr_abs_typ_ListPutter(Rslt_cr_abs_typ, "cr_abs_typ", "cr_abs_typ_nm");

		}
		return Rslt_cr_abs_typ_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Rslt_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Rslt_itm_p_PPanel_Itm_itm_cd_p == null) {
			Rslt_itm_p_PPanel_Itm_itm_cd_p = createRslt_itm_p_PPanel_Itm_itm_cd_ListPutter(Rslt_itm_p_PPanel.Itm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3");
		}
		return Rslt_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Rslt_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Rslt_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Rslt_itm_p_PPanel_Itm_itm_sub1_p = createRslt_itm_p_PPanel_Itm_itm_sub1_ListPutter(Rslt_itm_p_PPanel.Itm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3");
		}
		return Rslt_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Rslt_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Rslt_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Rslt_itm_p_PPanel_Itm_itm_sub2_p = createRslt_itm_p_PPanel_Itm_itm_sub2_ListPutter(Rslt_itm_p_PPanel.Itm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3");
		}
		return Rslt_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Rslt_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Rslt_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Rslt_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Rslt_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Rslt_itm_p_PPanel_Itm_itm_sub3_p = createRslt_itm_p_PPanel_Itm_itm_sub3_ListPutter(Rslt_itm_p_PPanel.Itm_itm_sub3, "itm_sub3", "itm_nm");
		}
		return Rslt_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [Rslt_itm_jnl_cd_ListPutter]の定義 */
	private MCListPutter Rslt_itm_jnl_cd_p = null;

	/**
	 * [Rslt_itm_jnl_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_itm_jnl_cd_ListPutter() {
		if (Rslt_itm_jnl_cd_p == null) {
			Rslt_itm_jnl_cd_p = createRslt_itm_jnl_cd_ListPutter(Rslt_itm_jnl_cd, "itm_jnl_cd", "itm_jnl_nm");

		}
		return Rslt_itm_jnl_cd_p;
	}
	
	
	/** [Rslt_ac_rsn_cd_ListPutter]の定義 */
	private MCListPutter Rslt_ac_rsn_cd_p = null;

	/**
	 * [Rslt_ac_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_ac_rsn_cd_ListPutter() {
		if (Rslt_ac_rsn_cd_p == null) {
			Rslt_ac_rsn_cd_p = createRslt_ac_rsn_cd_ListPutter(Rslt_ac_rsn_cd, "ac_rsn_cd", "ac_rsn_nm");

		}
		return Rslt_ac_rsn_cd_p;
	}
	
	
	/** [Rslt_purc_typ_ListPutter]の定義 */
	private MCListPutter Rslt_purc_typ_p = null;

	/**
	 * [Rslt_purc_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_purc_typ_ListPutter() {
		if (Rslt_purc_typ_p == null) {
			Rslt_purc_typ_p = createRslt_purc_typ_ListPutter(Rslt_purc_typ, "purc_typ", "purc_typ_nm");

		}
		return Rslt_purc_typ_p;
	}
	
	
	/** [Rslt_un_fix_typ_ListPutter]の定義 */
	private MCListPutter Rslt_un_fix_typ_p = null;

	/**
	 * [Rslt_un_fix_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_un_fix_typ_ListPutter() {
		if (Rslt_un_fix_typ_p == null) {
			Rslt_un_fix_typ_p = createRslt_un_fix_typ_ListPutter(Rslt_un_fix_typ, "un_fix_typ", "un_fix_typ_nm");

		}
		return Rslt_un_fix_typ_p;
	}
	
	
	/** [Rslt_foreign_typ_ListPutter]の定義 */
	private MCListPutter Rslt_foreign_typ_p = null;

	/**
	 * [Rslt_foreign_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_foreign_typ_ListPutter() {
		if (Rslt_foreign_typ_p == null) {
			Rslt_foreign_typ_p = createRslt_foreign_typ_ListPutter(Rslt_foreign_typ, "foreign_typ", "foreign_typ_nm");

		}
		return Rslt_foreign_typ_p;
	}
	
	
	/** [Rslt_cur_cd_ListPutter]の定義 */
	private MCListPutter Rslt_cur_cd_p = null;

	/**
	 * [Rslt_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getRslt_cur_cd_ListPutter() {
		if (Rslt_cur_cd_p == null) {
			Rslt_cur_cd_p = createRslt_cur_cd_ListPutter(Rslt_cur_cd, "cur_cd", "cur_nm");

		}
		return Rslt_cur_cd_p;
	}
	
	
	/** [Rslt_asst_typ_ListPutter]の定義 */
	private MCListPutter Rslt_asst_typ_p = null;

	/**
	 * [Rslt_asst_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_asst_typ_ListPutter() {
		if (Rslt_asst_typ_p == null) {
			Rslt_asst_typ_p = createRslt_asst_typ_ListPutter(Rslt_asst_typ, "asst_typ", "asst_typ_nm");

		}
		return Rslt_asst_typ_p;
	}
	
	
	/** [Rslt_quality_typ_ListPutter]の定義 */
	private MCListPutter Rslt_quality_typ_p = null;

	/**
	 * [Rslt_quality_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_quality_typ_ListPutter() {
		if (Rslt_quality_typ_p == null) {
			Rslt_quality_typ_p = createRslt_quality_typ_ListPutter(Rslt_quality_typ, "quality_typ", "quality_typ_nm");

		}
		return Rslt_quality_typ_p;
	}
	
	
	/** [Rslt_inv_loc_typ_ListPutter]の定義 */
	private MCListPutter Rslt_inv_loc_typ_p = null;

	/**
	 * [Rslt_inv_loc_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_inv_loc_typ_ListPutter() {
		if (Rslt_inv_loc_typ_p == null) {
			Rslt_inv_loc_typ_p = createRslt_inv_loc_typ_ListPutter(Rslt_inv_loc_typ, "inv_loc_typ", "inv_loc_typ_nm");

		}
		return Rslt_inv_loc_typ_p;
	}
	
	
	/** [Rslt_amt_sign_typ_ListPutter]の定義 */
	private MCListPutter Rslt_amt_sign_typ_p = null;

	/**
	 * [Rslt_amt_sign_typ_ListPutter]の取得
	 */
	protected MCListPutter getRslt_amt_sign_typ_ListPutter() {
		if (Rslt_amt_sign_typ_p == null) {
			Rslt_amt_sign_typ_p = createRslt_amt_sign_typ_ListPutter(Rslt_amt_sign_typ, "amt_sign_typ", "amt_sign_typ_nm");

		}
		return Rslt_amt_sign_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_JnlPatternReg create(){
		MABCP_JnlPatternReg p = new MABCP_JnlPatternReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_JnlPatternReg create(String name){
		MABCP_JnlPatternReg p = new MABCP_JnlPatternReg(name);
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
		MABCP_JnlPatternReg_MC.jbfInitScreenOpe((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbfInitMst((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbfInitCnd((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbfInitBase((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbfInitBaseHdr((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbfInitBaseTab((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbfInitBase1((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbfInitBase11((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbfInitBase12((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbfInitBase13((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbfInitBase2((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbfInitBase3((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbfInitRslt((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbfInitBtn((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbfInitEastBtn((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbInitScreenOpe((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbInitMst((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbInitCnd((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbInitBase((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbInitBaseHdr((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbInitBaseTab((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbInitBase1((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbInitBase11((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbInitBase12((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbInitBase13((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbInitBase2((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbInitBase3((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbInitRslt((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbInitBtn((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.jbInitEastBtn((MABCP_JnlPatternReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.MstPanel = p.beansFactory.createPanel("Mst");
		// ブロックの項目の初期化
		p.Mst_mst_set_typ_nm_Label = p.beansFactory.createLabel("Mst.mst_set_typ_nm_Label");
		p.Mst_mst_set_typ_nm = p.beansFactory.createTextField("Mst.mst_set_typ_nm");
		p.Mst_mst_set_typ_nm.setLabel(p.Mst_mst_set_typ_nm_Label);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_MOD = p.beansFactory.createRadioButton("Cnd.ope_MOD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_jnl_ptn_cd_Label = p.beansFactory.createLabel("Cnd.jnl_ptn_cd_Label");
		p.Cnd_jnl_ptn_cd = p.beansFactory.createTextComboBox("Cnd.jnl_ptn_cd");
		p.Cnd_jnl_ptn_cd.setLabel(p.Cnd_jnl_ptn_cd_Label);
		p.Cnd_jnl_ptn_nm = p.beansFactory.createTextField("Cnd.jnl_ptn_nm");
		p.Cnd_jnl_seq_Label = p.beansFactory.createLabel("Cnd.jnl_seq_Label");
		p.Cnd_jnl_seq = p.beansFactory.createNumberComboBox("Cnd.jnl_seq");
		p.Cnd_jnl_seq.setLabel(p.Cnd_jnl_seq_Label);
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [Base]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBase(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.BasePanel = p.beansFactory.createPanel("Base");
		p.BaseTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [BaseHdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBaseHdr(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.BaseHdrPanel = p.beansFactory.createPanel("BaseHdr");
		// ブロックの項目の初期化
	}

	/**
	 * [BaseTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBaseTab(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.BaseTabPanel = p.beansFactory.createPanel("BaseTab");
		p.BaseTabTab = p.beansFactory.createTabbedPane("BaseTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Base1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBase1(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.Base1Panel = p.beansFactory.createPanel("Base1");
		// ブロックの項目の初期化
	}

	/**
	 * [Base11]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBase11(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.Base11Panel = p.beansFactory.createPanel("Base11");
		p.Base11TitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Base12]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBase12(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.Base12Panel = p.beansFactory.createPanel("Base12");
		p.Base12TitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Base13]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBase13(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.Base13Panel = p.beansFactory.createPanel("Base13");
		// ブロックの項目の初期化
	}

	/**
	 * [Base2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBase2(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.Base2Panel = p.beansFactory.createPanel("Base2");
		// ブロックの項目の初期化
	}

	/**
	 * [Base3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBase3(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.Base3Panel = p.beansFactory.createPanel("Base3");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		// ブロックの項目の初期化
		p.Rslt_check = p.beansFactory.createCheckBox("Rslt.check");
		p.Rslt_jnl_ptn_cd_Label = p.beansFactory.createLabel("Rslt.jnl_ptn_cd_Label");
		p.Rslt_jnl_ptn_cd = p.beansFactory.createTextComboBox("Rslt.jnl_ptn_cd");
		p.Rslt_jnl_ptn_cd.setLabel(p.Rslt_jnl_ptn_cd_Label);
		p.Rslt_jnl_ptn_nm = p.beansFactory.createTextField("Rslt.jnl_ptn_nm");
		p.Rslt_jnl_seq_Label = p.beansFactory.createLabel("Rslt.jnl_seq_Label");
		p.Rslt_jnl_seq = p.beansFactory.createNumberField("Rslt.jnl_seq");
		p.Rslt_jnl_seq.setLabel(p.Rslt_jnl_seq_Label);
		p.Rslt_memo1_Label = p.beansFactory.createLabel("Rslt.memo1_Label");
		p.Rslt_memo1 = p.beansFactory.createTextField("Rslt.memo1");
		p.Rslt_memo1.setLabel(p.Rslt_memo1_Label);
		p.Rslt_memo2_Label = p.beansFactory.createLabel("Rslt.memo2_Label");
		p.Rslt_memo2 = p.beansFactory.createTextField("Rslt.memo2");
		p.Rslt_memo2.setLabel(p.Rslt_memo2_Label);
		p.Rslt_memo3_Label = p.beansFactory.createLabel("Rslt.memo3_Label");
		p.Rslt_memo3 = p.beansFactory.createTextField("Rslt.memo3");
		p.Rslt_memo3.setLabel(p.Rslt_memo3_Label);
		p.Rslt_del_flg = p.beansFactory.createCheckBox("Rslt.del_flg");
		p.Rslt_dr_dpt_typ_Label = p.beansFactory.createLabel("Rslt.dr_dpt_typ_Label");
		p.Rslt_dr_dpt_typ = p.beansFactory.createTextComboBox("Rslt.dr_dpt_typ");
		p.Rslt_dr_dpt_typ.setLabel(p.Rslt_dr_dpt_typ_Label);
		p.Rslt_dr_dpt_typ_nm = p.beansFactory.createTextField("Rslt.dr_dpt_typ_nm");
		p.Rslt_dr_trd_sml_flg = p.beansFactory.createCheckBox("Rslt.dr_trd_sml_flg");
		p.Rslt_dr_dpt_cd_Label = p.beansFactory.createLabel("Rslt.dr_dpt_cd_Label");
		p.Rslt_dr_dpt_cd = p.beansFactory.createTextComboBox("Rslt.dr_dpt_cd");
		p.Rslt_dr_dpt_cd.setLabel(p.Rslt_dr_dpt_cd_Label);
		p.Rslt_dr_dpt_nm = p.beansFactory.createTextField("Rslt.dr_dpt_nm");
		p.Rslt_dr_ptn_typ_Label = p.beansFactory.createLabel("Rslt.dr_ptn_typ_Label");
		p.Rslt_dr_ptn_typ = p.beansFactory.createTextComboBox("Rslt.dr_ptn_typ");
		p.Rslt_dr_ptn_typ.setLabel(p.Rslt_dr_ptn_typ_Label);
		p.Rslt_dr_ptn_typ_nm = p.beansFactory.createTextField("Rslt.dr_ptn_typ_nm");
		p.Rslt_dr_grp_cd_Label = p.beansFactory.createLabel("Rslt.dr_grp_cd_Label");
		p.Rslt_dr_grp_cd = p.beansFactory.createTextComboBox("Rslt.dr_grp_cd");
		p.Rslt_dr_grp_cd.setLabel(p.Rslt_dr_grp_cd_Label);
		p.Rslt_dr_grp_nm = p.beansFactory.createTextField("Rslt.dr_grp_nm");
		p.Rslt_dr_ac_cd_Label = p.beansFactory.createLabel("Rslt.dr_ac_cd_Label");
		p.Rslt_dr_ac_cd = p.beansFactory.createTextField("Rslt.dr_ac_cd");
		p.Rslt_dr_ac_cd.setLabel(p.Rslt_dr_ac_cd_Label);
		p.Rslt_dr_ac_nm = p.beansFactory.createTextField("Rslt.dr_ac_nm");
		p.Rslt_dr_sub_ac_cd_Label = p.beansFactory.createLabel("Rslt.dr_sub_ac_cd_Label");
		p.Rslt_dr_sub_ac_cd = p.beansFactory.createTextComboBox("Rslt.dr_sub_ac_cd");
		p.Rslt_dr_sub_ac_cd.setLabel(p.Rslt_dr_sub_ac_cd_Label);
		p.Rslt_dr_sub_ac_nm = p.beansFactory.createTextField("Rslt.dr_sub_ac_nm");
		p.Rslt_dr_bp_typ_Label = p.beansFactory.createLabel("Rslt.dr_bp_typ_Label");
		p.Rslt_dr_bp_typ = p.beansFactory.createTextComboBox("Rslt.dr_bp_typ");
		p.Rslt_dr_bp_typ.setLabel(p.Rslt_dr_bp_typ_Label);
		p.Rslt_dr_bp_typ_nm = p.beansFactory.createTextField("Rslt.dr_bp_typ_nm");
		p.Rslt_dr_bp_cd_Label = p.beansFactory.createLabel("Rslt.dr_bp_cd_Label");
		p.Rslt_dr_bp_cd = p.beansFactory.createTextField("Rslt.dr_bp_cd");
		p.Rslt_dr_bp_cd.setLabel(p.Rslt_dr_bp_cd_Label);
		p.Rslt_dr_bp_nm = p.beansFactory.createTextField("Rslt.dr_bp_nm");
		p.Rslt_dr_ac_tax_cd_Label = p.beansFactory.createLabel("Rslt.dr_ac_tax_cd_Label");
		p.Rslt_dr_ac_tax_cd = p.beansFactory.createTextComboBox("Rslt.dr_ac_tax_cd");
		p.Rslt_dr_ac_tax_cd.setLabel(p.Rslt_dr_ac_tax_cd_Label);
		p.Rslt_dr_ac_tax_nm = p.beansFactory.createTextField("Rslt.dr_ac_tax_nm");
		p.Rslt_dr_itm_typ_Label = p.beansFactory.createLabel("Rslt.dr_itm_typ_Label");
		p.Rslt_dr_itm_typ = p.beansFactory.createTextComboBox("Rslt.dr_itm_typ");
		p.Rslt_dr_itm_typ.setLabel(p.Rslt_dr_itm_typ_Label);
		p.Rslt_dr_itm_typ_nm = p.beansFactory.createTextField("Rslt.dr_itm_typ_nm");
		p.Rslt_dr_amt_typ_Label = p.beansFactory.createLabel("Rslt.dr_amt_typ_Label");
		p.Rslt_dr_amt_typ = p.beansFactory.createTextComboBox("Rslt.dr_amt_typ");
		p.Rslt_dr_amt_typ.setLabel(p.Rslt_dr_amt_typ_Label);
		p.Rslt_dr_amt_typ_nm = p.beansFactory.createTextField("Rslt.dr_amt_typ_nm");
		p.Rslt_dr_abs_typ_Label = p.beansFactory.createLabel("Rslt.dr_abs_typ_Label");
		p.Rslt_dr_abs_typ = p.beansFactory.createTextComboBox("Rslt.dr_abs_typ");
		p.Rslt_dr_abs_typ.setLabel(p.Rslt_dr_abs_typ_Label);
		p.Rslt_dr_abs_typ_nm = p.beansFactory.createTextField("Rslt.dr_abs_typ_nm");
		p.Rslt_dr_abstract_Label = p.beansFactory.createLabel("Rslt.dr_abstract_Label");
		p.Rslt_dr_abstract = p.beansFactory.createTextField("Rslt.dr_abstract");
		p.Rslt_dr_abstract.setLabel(p.Rslt_dr_abstract_Label);
		p.Rslt_dr_sub_flg = p.beansFactory.createCheckBox("Rslt.dr_sub_flg");
		p.Rslt_dr_bp_flg = p.beansFactory.createCheckBox("Rslt.dr_bp_flg");
		p.Rslt_cr_dpt_typ_Label = p.beansFactory.createLabel("Rslt.cr_dpt_typ_Label");
		p.Rslt_cr_dpt_typ = p.beansFactory.createTextComboBox("Rslt.cr_dpt_typ");
		p.Rslt_cr_dpt_typ.setLabel(p.Rslt_cr_dpt_typ_Label);
		p.Rslt_cr_dpt_typ_nm = p.beansFactory.createTextField("Rslt.cr_dpt_typ_nm");
		p.Rslt_cr_trd_sml_flg = p.beansFactory.createCheckBox("Rslt.cr_trd_sml_flg");
		p.Rslt_cr_dpt_cd_Label = p.beansFactory.createLabel("Rslt.cr_dpt_cd_Label");
		p.Rslt_cr_dpt_cd = p.beansFactory.createTextComboBox("Rslt.cr_dpt_cd");
		p.Rslt_cr_dpt_cd.setLabel(p.Rslt_cr_dpt_cd_Label);
		p.Rslt_cr_dpt_nm = p.beansFactory.createTextField("Rslt.cr_dpt_nm");
		p.Rslt_cr_ptn_typ_Label = p.beansFactory.createLabel("Rslt.cr_ptn_typ_Label");
		p.Rslt_cr_ptn_typ = p.beansFactory.createTextComboBox("Rslt.cr_ptn_typ");
		p.Rslt_cr_ptn_typ.setLabel(p.Rslt_cr_ptn_typ_Label);
		p.Rslt_cr_ptn_typ_nm = p.beansFactory.createTextField("Rslt.cr_ptn_typ_nm");
		p.Rslt_cr_grp_cd_Label = p.beansFactory.createLabel("Rslt.cr_grp_cd_Label");
		p.Rslt_cr_grp_cd = p.beansFactory.createTextComboBox("Rslt.cr_grp_cd");
		p.Rslt_cr_grp_cd.setLabel(p.Rslt_cr_grp_cd_Label);
		p.Rslt_cr_grp_nm = p.beansFactory.createTextField("Rslt.cr_grp_nm");
		p.Rslt_cr_ac_cd_Label = p.beansFactory.createLabel("Rslt.cr_ac_cd_Label");
		p.Rslt_cr_ac_cd = p.beansFactory.createTextField("Rslt.cr_ac_cd");
		p.Rslt_cr_ac_cd.setLabel(p.Rslt_cr_ac_cd_Label);
		p.Rslt_cr_ac_nm = p.beansFactory.createTextField("Rslt.cr_ac_nm");
		p.Rslt_cr_sub_ac_cd_Label = p.beansFactory.createLabel("Rslt.cr_sub_ac_cd_Label");
		p.Rslt_cr_sub_ac_cd = p.beansFactory.createTextComboBox("Rslt.cr_sub_ac_cd");
		p.Rslt_cr_sub_ac_cd.setLabel(p.Rslt_cr_sub_ac_cd_Label);
		p.Rslt_cr_sub_ac_nm = p.beansFactory.createTextField("Rslt.cr_sub_ac_nm");
		p.Rslt_cr_bp_typ_Label = p.beansFactory.createLabel("Rslt.cr_bp_typ_Label");
		p.Rslt_cr_bp_typ = p.beansFactory.createTextComboBox("Rslt.cr_bp_typ");
		p.Rslt_cr_bp_typ.setLabel(p.Rslt_cr_bp_typ_Label);
		p.Rslt_cr_bp_typ_nm = p.beansFactory.createTextField("Rslt.cr_bp_typ_nm");
		p.Rslt_cr_bp_cd_Label = p.beansFactory.createLabel("Rslt.cr_bp_cd_Label");
		p.Rslt_cr_bp_cd = p.beansFactory.createTextField("Rslt.cr_bp_cd");
		p.Rslt_cr_bp_cd.setLabel(p.Rslt_cr_bp_cd_Label);
		p.Rslt_cr_bp_nm = p.beansFactory.createTextField("Rslt.cr_bp_nm");
		p.Rslt_cr_ac_tax_cd_Label = p.beansFactory.createLabel("Rslt.cr_ac_tax_cd_Label");
		p.Rslt_cr_ac_tax_cd = p.beansFactory.createTextComboBox("Rslt.cr_ac_tax_cd");
		p.Rslt_cr_ac_tax_cd.setLabel(p.Rslt_cr_ac_tax_cd_Label);
		p.Rslt_cr_ac_tax_nm = p.beansFactory.createTextField("Rslt.cr_ac_tax_nm");
		p.Rslt_cr_itm_typ_Label = p.beansFactory.createLabel("Rslt.cr_itm_typ_Label");
		p.Rslt_cr_itm_typ = p.beansFactory.createTextComboBox("Rslt.cr_itm_typ");
		p.Rslt_cr_itm_typ.setLabel(p.Rslt_cr_itm_typ_Label);
		p.Rslt_cr_itm_typ_nm = p.beansFactory.createTextField("Rslt.cr_itm_typ_nm");
		p.Rslt_cr_amt_typ_Label = p.beansFactory.createLabel("Rslt.cr_amt_typ_Label");
		p.Rslt_cr_amt_typ = p.beansFactory.createTextComboBox("Rslt.cr_amt_typ");
		p.Rslt_cr_amt_typ.setLabel(p.Rslt_cr_amt_typ_Label);
		p.Rslt_cr_amt_typ_nm = p.beansFactory.createTextField("Rslt.cr_amt_typ_nm");
		p.Rslt_cr_abs_typ_Label = p.beansFactory.createLabel("Rslt.cr_abs_typ_Label");
		p.Rslt_cr_abs_typ = p.beansFactory.createTextComboBox("Rslt.cr_abs_typ");
		p.Rslt_cr_abs_typ.setLabel(p.Rslt_cr_abs_typ_Label);
		p.Rslt_cr_abs_typ_nm = p.beansFactory.createTextField("Rslt.cr_abs_typ_nm");
		p.Rslt_cr_abstract_Label = p.beansFactory.createLabel("Rslt.cr_abstract_Label");
		p.Rslt_cr_abstract = p.beansFactory.createTextField("Rslt.cr_abstract");
		p.Rslt_cr_abstract.setLabel(p.Rslt_cr_abstract_Label);
		p.Rslt_cr_sub_flg = p.beansFactory.createCheckBox("Rslt.cr_sub_flg");
		p.Rslt_cr_bp_flg = p.beansFactory.createCheckBox("Rslt.cr_bp_flg");
		p.Rslt_minus_flg = p.beansFactory.createCheckBox("Rslt.minus_flg");
		p.Rslt_carry_flg = p.beansFactory.createCheckBox("Rslt.carry_flg");
		p.Rslt_itm_jnl_cd_Label = p.beansFactory.createLabel("Rslt.itm_jnl_cd_Label");
		p.Rslt_itm_jnl_cd = p.beansFactory.createTextComboBox("Rslt.itm_jnl_cd");
		p.Rslt_itm_jnl_cd.setLabel(p.Rslt_itm_jnl_cd_Label);
		p.Rslt_itm_jnl_nm = p.beansFactory.createTextField("Rslt.itm_jnl_nm");
		p.Rslt_ac_rsn_cd_Label = p.beansFactory.createLabel("Rslt.ac_rsn_cd_Label");
		p.Rslt_ac_rsn_cd = p.beansFactory.createTextComboBox("Rslt.ac_rsn_cd");
		p.Rslt_ac_rsn_cd.setLabel(p.Rslt_ac_rsn_cd_Label);
		p.Rslt_ac_rsn_nm = p.beansFactory.createTextField("Rslt.ac_rsn_nm");
		p.Rslt_purc_typ_Label = p.beansFactory.createLabel("Rslt.purc_typ_Label");
		p.Rslt_purc_typ = p.beansFactory.createTextComboBox("Rslt.purc_typ");
		p.Rslt_purc_typ.setLabel(p.Rslt_purc_typ_Label);
		p.Rslt_purc_typ_nm = p.beansFactory.createTextField("Rslt.purc_typ_nm");
		p.Rslt_un_fix_typ_Label = p.beansFactory.createLabel("Rslt.un_fix_typ_Label");
		p.Rslt_un_fix_typ = p.beansFactory.createTextComboBox("Rslt.un_fix_typ");
		p.Rslt_un_fix_typ.setLabel(p.Rslt_un_fix_typ_Label);
		p.Rslt_un_fix_typ_nm = p.beansFactory.createTextField("Rslt.un_fix_typ_nm");
		p.Rslt_foreign_typ_Label = p.beansFactory.createLabel("Rslt.foreign_typ_Label");
		p.Rslt_foreign_typ = p.beansFactory.createTextComboBox("Rslt.foreign_typ");
		p.Rslt_foreign_typ.setLabel(p.Rslt_foreign_typ_Label);
		p.Rslt_foreign_typ_nm = p.beansFactory.createTextField("Rslt.foreign_typ_nm");
		p.Rslt_cur_cd_Label = p.beansFactory.createLabel("Rslt.cur_cd_Label");
		p.Rslt_cur_cd = p.beansFactory.createTextComboBox("Rslt.cur_cd");
		p.Rslt_cur_cd.setLabel(p.Rslt_cur_cd_Label);
		p.Rslt_cur_nm = p.beansFactory.createTextField("Rslt.cur_nm");
		p.Rslt_asst_typ_Label = p.beansFactory.createLabel("Rslt.asst_typ_Label");
		p.Rslt_asst_typ = p.beansFactory.createTextComboBox("Rslt.asst_typ");
		p.Rslt_asst_typ.setLabel(p.Rslt_asst_typ_Label);
		p.Rslt_asst_typ_nm = p.beansFactory.createTextField("Rslt.asst_typ_nm");
		p.Rslt_quality_typ_Label = p.beansFactory.createLabel("Rslt.quality_typ_Label");
		p.Rslt_quality_typ = p.beansFactory.createTextComboBox("Rslt.quality_typ");
		p.Rslt_quality_typ.setLabel(p.Rslt_quality_typ_Label);
		p.Rslt_quality_typ_nm = p.beansFactory.createTextField("Rslt.quality_typ_nm");
		p.Rslt_inv_loc_typ_Label = p.beansFactory.createLabel("Rslt.inv_loc_typ_Label");
		p.Rslt_inv_loc_typ = p.beansFactory.createTextComboBox("Rslt.inv_loc_typ");
		p.Rslt_inv_loc_typ.setLabel(p.Rslt_inv_loc_typ_Label);
		p.Rslt_inv_loc_typ_nm = p.beansFactory.createTextField("Rslt.inv_loc_typ_nm");
		p.Rslt_amt_sign_typ_Label = p.beansFactory.createLabel("Rslt.amt_sign_typ_Label");
		p.Rslt_amt_sign_typ = p.beansFactory.createTextComboBox("Rslt.amt_sign_typ");
		p.Rslt_amt_sign_typ.setLabel(p.Rslt_amt_sign_typ_Label);
		p.Rslt_amt_sign_typ_nm = p.beansFactory.createTextField("Rslt.amt_sign_typ_nm");
		p.Rslt_jnl_key1_Label = p.beansFactory.createLabel("Rslt.jnl_key1_Label");
		p.Rslt_jnl_key1 = p.beansFactory.createTextField("Rslt.jnl_key1");
		p.Rslt_jnl_key1.setLabel(p.Rslt_jnl_key1_Label);
		p.Rslt_jnl_key2_Label = p.beansFactory.createLabel("Rslt.jnl_key2_Label");
		p.Rslt_jnl_key2 = p.beansFactory.createTextField("Rslt.jnl_key2");
		p.Rslt_jnl_key2.setLabel(p.Rslt_jnl_key2_Label);
		p.Rslt_jnl_key3_Label = p.beansFactory.createLabel("Rslt.jnl_key3_Label");
		p.Rslt_jnl_key3 = p.beansFactory.createTextField("Rslt.jnl_key3");
		p.Rslt_jnl_key3.setLabel(p.Rslt_jnl_key3_Label);
		p.Rslt_jnl_key4_Label = p.beansFactory.createLabel("Rslt.jnl_key4_Label");
		p.Rslt_jnl_key4 = p.beansFactory.createTextField("Rslt.jnl_key4");
		p.Rslt_jnl_key4.setLabel(p.Rslt_jnl_key4_Label);
		p.Rslt_jnl_key5_Label = p.beansFactory.createLabel("Rslt.jnl_key5_Label");
		p.Rslt_jnl_key5 = p.beansFactory.createTextField("Rslt.jnl_key5");
		p.Rslt_jnl_key5.setLabel(p.Rslt_jnl_key5_Label);
		p.Rslt_jnl_key6_Label = p.beansFactory.createLabel("Rslt.jnl_key6_Label");
		p.Rslt_jnl_key6 = p.beansFactory.createTextField("Rslt.jnl_key6");
		p.Rslt_jnl_key6.setLabel(p.Rslt_jnl_key6_Label);
		p.Rslt_jnl_key7_Label = p.beansFactory.createLabel("Rslt.jnl_key7_Label");
		p.Rslt_jnl_key7 = p.beansFactory.createTextField("Rslt.jnl_key7");
		p.Rslt_jnl_key7.setLabel(p.Rslt_jnl_key7_Label);
		p.Rslt_jnl_key8_Label = p.beansFactory.createLabel("Rslt.jnl_key8_Label");
		p.Rslt_jnl_key8 = p.beansFactory.createTextField("Rslt.jnl_key8");
		p.Rslt_jnl_key8.setLabel(p.Rslt_jnl_key8_Label);
		p.Rslt_jnl_key9_Label = p.beansFactory.createLabel("Rslt.jnl_key9_Label");
		p.Rslt_jnl_key9 = p.beansFactory.createTextField("Rslt.jnl_key9");
		p.Rslt_jnl_key9.setLabel(p.Rslt_jnl_key9_Label);
		p.Rslt_jnl_key10_Label = p.beansFactory.createLabel("Rslt.jnl_key10_Label");
		p.Rslt_jnl_key10 = p.beansFactory.createTextField("Rslt.jnl_key10");
		p.Rslt_jnl_key10.setLabel(p.Rslt_jnl_key10_Label);
		p.Rslt_mon01_invalid_flg = p.beansFactory.createCheckBox("Rslt.mon01_invalid_flg");
		p.Rslt_mon02_invalid_flg = p.beansFactory.createCheckBox("Rslt.mon02_invalid_flg");
		p.Rslt_mon03_invalid_flg = p.beansFactory.createCheckBox("Rslt.mon03_invalid_flg");
		p.Rslt_mon04_invalid_flg = p.beansFactory.createCheckBox("Rslt.mon04_invalid_flg");
		p.Rslt_mon05_invalid_flg = p.beansFactory.createCheckBox("Rslt.mon05_invalid_flg");
		p.Rslt_mon06_invalid_flg = p.beansFactory.createCheckBox("Rslt.mon06_invalid_flg");
		p.Rslt_mon07_invalid_flg = p.beansFactory.createCheckBox("Rslt.mon07_invalid_flg");
		p.Rslt_mon08_invalid_flg = p.beansFactory.createCheckBox("Rslt.mon08_invalid_flg");
		p.Rslt_mon09_invalid_flg = p.beansFactory.createCheckBox("Rslt.mon09_invalid_flg");
		p.Rslt_mon10_invalid_flg = p.beansFactory.createCheckBox("Rslt.mon10_invalid_flg");
		p.Rslt_mon11_invalid_flg = p.beansFactory.createCheckBox("Rslt.mon11_invalid_flg");
		p.Rslt_mon12_invalid_flg = p.beansFactory.createCheckBox("Rslt.mon12_invalid_flg");
		p.Rslt_ins_usr_id_Label = p.beansFactory.createLabel("Rslt.ins_usr_id_Label");
		p.Rslt_ins_usr_id = p.beansFactory.createTextField("Rslt.ins_usr_id");
		p.Rslt_ins_usr_id.setLabel(p.Rslt_ins_usr_id_Label);
		p.Rslt_ins_usr_nm = p.beansFactory.createTextField("Rslt.ins_usr_nm");
		p.Rslt_ins_func_id_Label = p.beansFactory.createLabel("Rslt.ins_func_id_Label");
		p.Rslt_ins_func_id = p.beansFactory.createTextField("Rslt.ins_func_id");
		p.Rslt_ins_func_id.setLabel(p.Rslt_ins_func_id_Label);
		p.Rslt_ins_func_nm = p.beansFactory.createTextField("Rslt.ins_func_nm");
		p.Rslt_upd_usr_id_Label = p.beansFactory.createLabel("Rslt.upd_usr_id_Label");
		p.Rslt_upd_usr_id = p.beansFactory.createTextField("Rslt.upd_usr_id");
		p.Rslt_upd_usr_id.setLabel(p.Rslt_upd_usr_id_Label);
		p.Rslt_upd_usr_nm = p.beansFactory.createTextField("Rslt.upd_usr_nm");
		p.Rslt_upd_func_id_Label = p.beansFactory.createLabel("Rslt.upd_func_id_Label");
		p.Rslt_upd_func_id = p.beansFactory.createTextField("Rslt.upd_func_id");
		p.Rslt_upd_func_id.setLabel(p.Rslt_upd_func_id_Label);
		p.Rslt_upd_func_nm = p.beansFactory.createTextField("Rslt.upd_func_nm");
		p.Rslt_ins_ts_Label = p.beansFactory.createLabel("Rslt.ins_ts_Label");
		p.Rslt_ins_ts = p.beansFactory.createTimestampField("Rslt.ins_ts");
		p.Rslt_ins_ts.setLabel(p.Rslt_ins_ts_Label);
		p.Rslt_upd_ts_Label = p.beansFactory.createLabel("Rslt.upd_ts_Label");
		p.Rslt_upd_ts = p.beansFactory.createTimestampField("Rslt.upd_ts");
		p.Rslt_upd_ts.setLabel(p.Rslt_upd_ts_Label);
		p.Rslt_upd_srv_req_no_Label = p.beansFactory.createLabel("Rslt.upd_srv_req_no_Label");
		p.Rslt_upd_srv_req_no = p.beansFactory.createTextField("Rslt.upd_srv_req_no");
		p.Rslt_upd_srv_req_no.setLabel(p.Rslt_upd_srv_req_no_Label);
		p.Rslt_upd_cntr_Label = p.beansFactory.createLabel("Rslt.upd_cntr_Label");
		p.Rslt_upd_cntr = p.beansFactory.createNumberField("Rslt.upd_cntr");
		p.Rslt_upd_cntr.setLabel(p.Rslt_upd_cntr_Label);
		p.Rslt_del_usr_id_Label = p.beansFactory.createLabel("Rslt.del_usr_id_Label");
		p.Rslt_del_usr_id = p.beansFactory.createTextField("Rslt.del_usr_id");
		p.Rslt_del_usr_id.setLabel(p.Rslt_del_usr_id_Label);
		p.Rslt_del_usr_nm = p.beansFactory.createTextField("Rslt.del_usr_nm");
		p.Rslt_del_ts_Label = p.beansFactory.createLabel("Rslt.del_ts_Label");
		p.Rslt_del_ts = p.beansFactory.createTimestampField("Rslt.del_ts");
		p.Rslt_del_ts.setLabel(p.Rslt_del_ts_Label);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_dr_typ_Group = p.beansFactory.createButtonGroup("Btn.dr_typ");
		p.Btn_dr_typ_DR = p.beansFactory.createRadioButton("Btn.dr_typ_DR");
		p.Btn_dr_typ_CR = p.beansFactory.createRadioButton("Btn.dr_typ_CR");
		p.Btn_open_MABCP1110 = p.beansFactory.createButton("Btn.open_MABCP1110", "open");
		p.Btn_open_MABCP1120 = p.beansFactory.createButton("Btn.open_MABCP1120", "open");
		p.Btn_open_MABCP1130 = p.beansFactory.createButton("Btn.open_MABCP1130", "open");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_JnlPatternReg p) {
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
	protected static void jbInitMst(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.CndPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP1060.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.BasePanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_MOD);
		p.Cnd_ope_MOD.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_MOD);
		p.ScreenOpePanel.add(p.Cnd_ope_MOD);
		p.Cnd_ope_MOD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP1060.CndR.ope_META);
		p.Cnd_jnl_ptn_cd.setListType(MCListType.STRICT);
		p.Cnd_jnl_ptn_cd.setLinkBeans(p.Cnd_jnl_ptn_nm);
		p.CndPanel.add(p.Cnd_jnl_ptn_cd_Label);
		p.CndPanel.add(p.Cnd_jnl_ptn_cd);
		p.CndPanel.setLastBeans(p.Cnd_jnl_ptn_cd);
		p.Cnd_jnl_ptn_cd.setNextBeans(p.Cnd_jnl_ptn_nm);
		p.Cnd_jnl_ptn_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP1060.CndR.jnl_ptn_cd_META);
		p.CndPanel.add(p.Cnd_jnl_ptn_nm);
		p.Cnd_jnl_ptn_nm.setNextBeans(p.Cnd_jnl_seq);
		p.Cnd_jnl_ptn_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP1060.CndR.jnl_ptn_nm_META);
		p.Cnd_jnl_seq.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_jnl_seq_Label);
		p.CndPanel.add(p.Cnd_jnl_seq);
		p.Cnd_jnl_seq.setNextBeans(p.Cnd_srch);
		p.Cnd_jnl_seq.setRow(p.getCndR(), mcframe.clientMABC.MABCP1060.CndR.jnl_seq_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [Base]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBase(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.BasePanel.setBorder(p.BaseTitledBorder);
		p.add(p.BasePanel);
		p.BasePanel.setNextBeans(p.RsltPanel);
		p.BasePanel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.BasePanel.add(p.BaseHdrPanel, null);
		p.BasePanel.setLastBeans(p.BaseHdrPanel);
		p.BaseHdrPanel.setNextBeans(p.BaseTabPanel);
		p.BasePanel.add(p.BaseTabPanel, null);
	}

	/**
	 * [BaseHdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBaseHdr(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.BaseHdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
	}

	/**
	 * [BaseTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBaseTab(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.BaseTabPanel.add(p.BaseTabTab);
		p.BaseTabPanel.setLastBeans(p.BaseTabTab);
		p.BaseTabPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.BaseTabTab.add(p.Base1Panel, "BaseTab.base1");
		p.BaseTabTab.setLastBeans(p.Base1Panel);
		p.Base1Panel.setNextBeans(p.Base2Panel);
		p.BaseTabTab.add(p.Base2Panel, "BaseTab.base2");
		p.Base2Panel.setNextBeans(p.Base3Panel);
		p.BaseTabTab.add(p.Base3Panel, "BaseTab.base3");
	}

	/**
	 * [Base1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBase1(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.Base1Panel.setNextBeans(p.Base2Panel);
		p.Base1Panel.setLayoutPosition("N+");
		// ブロックの項目の初期化
		p.Base1Panel.add(p.Base11Panel, null);
		p.Base1Panel.setLastBeans(p.Base11Panel);
		p.Base11Panel.setNextBeans(p.Base12Panel);
		p.Base1Panel.add(p.Base12Panel, null);
		p.Base12Panel.setNextBeans(p.Base13Panel);
		p.Base1Panel.add(p.Base13Panel, null);
	}

	/**
	 * [Base11]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBase11(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.Base11Panel.setBorder(p.Base11TitledBorder);
		p.Base11Panel.setLayoutPosition("CLW");
		// ブロックの項目の初期化
	}

	/**
	 * [Base12]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBase12(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.Base12Panel.setBorder(p.Base12TitledBorder);
		p.Base12Panel.setLayoutPosition("CRE");
		// ブロックの項目の初期化
	}

	/**
	 * [Base13]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBase13(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.Base13Panel.setLayoutPosition("S");
		// ブロックの項目の初期化
	}

	/**
	 * [Base2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBase2(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.Base2Panel.setNextBeans(p.Base3Panel);
		p.Base2Panel.setLayoutPosition("S");
		// ブロックの項目の初期化
	}

	/**
	 * [Base3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBase3(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.Base3Panel.setLayoutPosition("S");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		// ブロックの項目の初期化
		p.RsltPanel.add(p.Rslt_check);
		p.RsltPanel.setLastBeans(p.Rslt_check);
		p.Rslt_check.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.check_META);
		p.Rslt_jnl_ptn_cd.setListType(MCListType.STRICT);
		p.Rslt_jnl_ptn_cd.setLinkBeans(p.Rslt_jnl_ptn_nm);
		p.BaseHdrPanel.add(p.Rslt_jnl_ptn_cd_Label);
		p.BaseHdrPanel.add(p.Rslt_jnl_ptn_cd);
		p.BaseHdrPanel.setLastBeans(p.Rslt_jnl_ptn_cd);
		p.Rslt_jnl_ptn_cd.setNextBeans(p.Rslt_jnl_ptn_nm);
		p.Rslt_jnl_ptn_cd.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.jnl_ptn_cd_META);
		p.BaseHdrPanel.add(p.Rslt_jnl_ptn_nm);
		p.Rslt_jnl_ptn_nm.setNextBeans(p.Rslt_jnl_seq);
		p.Rslt_jnl_ptn_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.jnl_ptn_nm_META);
		p.BaseHdrPanel.add(p.Rslt_jnl_seq_Label);
		p.BaseHdrPanel.add(p.Rslt_jnl_seq);
		p.Rslt_jnl_seq.setNextBeans(p.Rslt_memo1);
		p.Rslt_jnl_seq.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.jnl_seq_META);
		p.BaseHdrPanel.add(p.Rslt_memo1_Label);
		p.BaseHdrPanel.add(p.Rslt_memo1);
		p.Rslt_memo1.setNextBeans(p.Rslt_memo2);
		p.Rslt_memo1.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.memo1_META);
		p.BaseHdrPanel.add(p.Rslt_memo2_Label);
		p.BaseHdrPanel.add(p.Rslt_memo2);
		p.Rslt_memo2.setNextBeans(p.Rslt_memo3);
		p.Rslt_memo2.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.memo2_META);
		p.BaseHdrPanel.add(p.Rslt_memo3_Label);
		p.BaseHdrPanel.add(p.Rslt_memo3);
		p.Rslt_memo3.setNextBeans(p.Rslt_del_flg);
		p.Rslt_memo3.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.memo3_META);
		p.BaseHdrPanel.add(p.Rslt_del_flg);
		p.Rslt_del_flg.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.del_flg_META);
		p.Rslt_dr_dpt_typ.setListType(MCListType.STRICT);
		p.Rslt_dr_dpt_typ.setLinkBeans(p.Rslt_dr_dpt_typ_nm);
		p.Base11Panel.add(p.Rslt_dr_dpt_typ_Label);
		p.Base11Panel.add(p.Rslt_dr_dpt_typ);
		p.Base11Panel.setLastBeans(p.Rslt_dr_dpt_typ);
		p.Rslt_dr_dpt_typ.setNextBeans(p.Rslt_dr_dpt_typ_nm);
		p.Rslt_dr_dpt_typ.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_dpt_typ_META);
		p.Base11Panel.add(p.Rslt_dr_dpt_typ_nm);
		p.Rslt_dr_dpt_typ_nm.setNextBeans(p.Rslt_dr_trd_sml_flg);
		p.Rslt_dr_dpt_typ_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_dpt_typ_nm_META);
		p.Base11Panel.add(p.Rslt_dr_trd_sml_flg);
		p.Rslt_dr_trd_sml_flg.setNextBeans(p.Rslt_dr_dpt_cd);
		p.Rslt_dr_trd_sml_flg.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_trd_sml_flg_META);
		p.Rslt_dr_dpt_cd.setListType(MCListType.STRICT);
		p.Rslt_dr_dpt_cd.setLinkBeans(p.Rslt_dr_dpt_nm);
		p.Base11Panel.add(p.Rslt_dr_dpt_cd_Label);
		p.Base11Panel.add(p.Rslt_dr_dpt_cd);
		p.Rslt_dr_dpt_cd.setNextBeans(p.Rslt_dr_dpt_nm);
		p.Rslt_dr_dpt_cd.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_dpt_cd_META);
		p.Base11Panel.add(p.Rslt_dr_dpt_nm);
		p.Rslt_dr_dpt_nm.setNextBeans(p.Rslt_dr_ptn_typ);
		p.Rslt_dr_dpt_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_dpt_nm_META);
		p.Rslt_dr_ptn_typ.setListType(MCListType.STRICT);
		p.Rslt_dr_ptn_typ.setLinkBeans(p.Rslt_dr_ptn_typ_nm);
		p.Base11Panel.add(p.Rslt_dr_ptn_typ_Label);
		p.Base11Panel.add(p.Rslt_dr_ptn_typ);
		p.Rslt_dr_ptn_typ.setNextBeans(p.Rslt_dr_ptn_typ_nm);
		p.Rslt_dr_ptn_typ.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_ptn_typ_META);
		p.Base11Panel.add(p.Rslt_dr_ptn_typ_nm);
		p.Rslt_dr_ptn_typ_nm.setNextBeans(p.Rslt_dr_grp_cd);
		p.Rslt_dr_ptn_typ_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_ptn_typ_nm_META);
		p.Rslt_dr_grp_cd.setListType(MCListType.STRICT);
		p.Rslt_dr_grp_cd.setLinkBeans(p.Rslt_dr_grp_nm);
		p.Base11Panel.add(p.Rslt_dr_grp_cd_Label);
		p.Base11Panel.add(p.Rslt_dr_grp_cd);
		p.Rslt_dr_grp_cd.setNextBeans(p.Rslt_dr_grp_nm);
		p.Rslt_dr_grp_cd.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_grp_cd_META);
		p.Base11Panel.add(p.Rslt_dr_grp_nm);
		p.Rslt_dr_grp_nm.setNextBeans(p.Rslt_dr_ac_cd);
		p.Rslt_dr_grp_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_grp_nm_META);
		p.Base11Panel.add(p.Rslt_dr_ac_cd_Label);
		p.Base11Panel.add(p.Rslt_dr_ac_cd);
		p.Rslt_dr_ac_cd.setNextBeans(p.Rslt_dr_ac_nm);
		p.Rslt_dr_ac_cd.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_ac_cd_META);
		p.Rslt_dr_ac_cd.addLinkBeans(p.Rslt_dr_ac_nm,p.Rslt_dr_sub_flg,p.Rslt_dr_bp_flg);
		p.Rslt_dr_ac_cd.setListType(MCListType.STRICT);
		p.Base11Panel.add(p.Rslt_dr_ac_nm);
		p.Rslt_dr_ac_nm.setNextBeans(p.Rslt_dr_sub_ac_cd);
		p.Rslt_dr_ac_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_ac_nm_META);
		p.Rslt_dr_sub_ac_cd.setListType(MCListType.STRICT);
		p.Rslt_dr_sub_ac_cd.setLinkBeans(p.Rslt_dr_sub_ac_nm);
		p.Base11Panel.add(p.Rslt_dr_sub_ac_cd_Label);
		p.Base11Panel.add(p.Rslt_dr_sub_ac_cd);
		p.Rslt_dr_sub_ac_cd.setNextBeans(p.Rslt_dr_sub_ac_nm);
		p.Rslt_dr_sub_ac_cd.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_sub_ac_cd_META);
		p.Base11Panel.add(p.Rslt_dr_sub_ac_nm);
		p.Rslt_dr_sub_ac_nm.setNextBeans(p.Rslt_dr_bp_typ);
		p.Rslt_dr_sub_ac_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_sub_ac_nm_META);
		p.Rslt_dr_bp_typ.setListType(MCListType.STRICT);
		p.Rslt_dr_bp_typ.setLinkBeans(p.Rslt_dr_bp_typ_nm);
		p.Base11Panel.add(p.Rslt_dr_bp_typ_Label);
		p.Base11Panel.add(p.Rslt_dr_bp_typ);
		p.Rslt_dr_bp_typ.setNextBeans(p.Rslt_dr_bp_typ_nm);
		p.Rslt_dr_bp_typ.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_bp_typ_META);
		p.Base11Panel.add(p.Rslt_dr_bp_typ_nm);
		p.Rslt_dr_bp_typ_nm.setNextBeans(p.Rslt_dr_bp_cd);
		p.Rslt_dr_bp_typ_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_bp_typ_nm_META);
		p.Base11Panel.add(p.Rslt_dr_bp_cd_Label);
		p.Base11Panel.add(p.Rslt_dr_bp_cd);
		p.Rslt_dr_bp_cd.setNextBeans(p.Rslt_dr_bp_nm);
		p.Rslt_dr_bp_cd.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_bp_cd_META);
		p.Rslt_dr_bp_cd.addLinkBeans(p.Rslt_dr_bp_nm);
		p.Rslt_dr_bp_cd.setListType(MCListType.STRICT);
		p.Base11Panel.add(p.Rslt_dr_bp_nm);
		p.Rslt_dr_bp_nm.setNextBeans(p.Rslt_dr_ac_tax_cd);
		p.Rslt_dr_bp_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_bp_nm_META);
		p.Rslt_dr_ac_tax_cd.setListType(MCListType.STRICT);
		p.Rslt_dr_ac_tax_cd.setLinkBeans(p.Rslt_dr_ac_tax_nm);
		p.Base11Panel.add(p.Rslt_dr_ac_tax_cd_Label);
		p.Base11Panel.add(p.Rslt_dr_ac_tax_cd);
		p.Rslt_dr_ac_tax_cd.setNextBeans(p.Rslt_dr_ac_tax_nm);
		p.Rslt_dr_ac_tax_cd.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_ac_tax_cd_META);
		p.Base11Panel.add(p.Rslt_dr_ac_tax_nm);
		p.Rslt_dr_ac_tax_nm.setNextBeans(p.Rslt_dr_itm_typ);
		p.Rslt_dr_ac_tax_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_ac_tax_nm_META);
		p.Rslt_dr_itm_typ.setListType(MCListType.STRICT);
		p.Rslt_dr_itm_typ.setLinkBeans(p.Rslt_dr_itm_typ_nm);
		p.Base11Panel.add(p.Rslt_dr_itm_typ_Label);
		p.Base11Panel.add(p.Rslt_dr_itm_typ);
		p.Rslt_dr_itm_typ.setNextBeans(p.Rslt_dr_itm_typ_nm);
		p.Rslt_dr_itm_typ.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_itm_typ_META);
		p.Base11Panel.add(p.Rslt_dr_itm_typ_nm);
		p.Rslt_dr_itm_typ_nm.setNextBeans(p.Rslt_dr_amt_typ);
		p.Rslt_dr_itm_typ_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_itm_typ_nm_META);
		p.Rslt_dr_amt_typ.setListType(MCListType.STRICT);
		p.Rslt_dr_amt_typ.setLinkBeans(p.Rslt_dr_amt_typ_nm);
		p.Base11Panel.add(p.Rslt_dr_amt_typ_Label);
		p.Base11Panel.add(p.Rslt_dr_amt_typ);
		p.Rslt_dr_amt_typ.setNextBeans(p.Rslt_dr_amt_typ_nm);
		p.Rslt_dr_amt_typ.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_amt_typ_META);
		p.Base11Panel.add(p.Rslt_dr_amt_typ_nm);
		p.Rslt_dr_amt_typ_nm.setNextBeans(p.Rslt_dr_abs_typ);
		p.Rslt_dr_amt_typ_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_amt_typ_nm_META);
		p.Rslt_dr_abs_typ.setListType(MCListType.STRICT);
		p.Rslt_dr_abs_typ.setLinkBeans(p.Rslt_dr_abs_typ_nm);
		p.Base11Panel.add(p.Rslt_dr_abs_typ_Label);
		p.Base11Panel.add(p.Rslt_dr_abs_typ);
		p.Rslt_dr_abs_typ.setNextBeans(p.Rslt_dr_abs_typ_nm);
		p.Rslt_dr_abs_typ.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_abs_typ_META);
		p.Base11Panel.add(p.Rslt_dr_abs_typ_nm);
		p.Rslt_dr_abs_typ_nm.setNextBeans(p.Rslt_dr_abstract);
		p.Rslt_dr_abs_typ_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_abs_typ_nm_META);
		p.Base11Panel.add(p.Rslt_dr_abstract_Label);
		p.Base11Panel.add(p.Rslt_dr_abstract);
		p.Rslt_dr_abstract.setNextBeans(p.Rslt_dr_sub_flg);
		p.Rslt_dr_abstract.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_abstract_META);
		p.Base11Panel.add(p.Rslt_dr_sub_flg);
		p.Rslt_dr_sub_flg.setNextBeans(p.Rslt_dr_bp_flg);
		p.Rslt_dr_sub_flg.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_sub_flg_META);
		p.Base11Panel.add(p.Rslt_dr_bp_flg);
		p.Rslt_dr_bp_flg.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.dr_bp_flg_META);
		p.Rslt_cr_dpt_typ.setListType(MCListType.STRICT);
		p.Rslt_cr_dpt_typ.setLinkBeans(p.Rslt_cr_dpt_typ_nm);
		p.Base12Panel.add(p.Rslt_cr_dpt_typ_Label);
		p.Base12Panel.add(p.Rslt_cr_dpt_typ);
		p.Base12Panel.setLastBeans(p.Rslt_cr_dpt_typ);
		p.Rslt_cr_dpt_typ.setNextBeans(p.Rslt_cr_dpt_typ_nm);
		p.Rslt_cr_dpt_typ.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_dpt_typ_META);
		p.Base12Panel.add(p.Rslt_cr_dpt_typ_nm);
		p.Rslt_cr_dpt_typ_nm.setNextBeans(p.Rslt_cr_trd_sml_flg);
		p.Rslt_cr_dpt_typ_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_dpt_typ_nm_META);
		p.Base12Panel.add(p.Rslt_cr_trd_sml_flg);
		p.Rslt_cr_trd_sml_flg.setNextBeans(p.Rslt_cr_dpt_cd);
		p.Rslt_cr_trd_sml_flg.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_trd_sml_flg_META);
		p.Rslt_cr_dpt_cd.setListType(MCListType.STRICT);
		p.Rslt_cr_dpt_cd.setLinkBeans(p.Rslt_cr_dpt_nm);
		p.Base12Panel.add(p.Rslt_cr_dpt_cd_Label);
		p.Base12Panel.add(p.Rslt_cr_dpt_cd);
		p.Rslt_cr_dpt_cd.setNextBeans(p.Rslt_cr_dpt_nm);
		p.Rslt_cr_dpt_cd.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_dpt_cd_META);
		p.Base12Panel.add(p.Rslt_cr_dpt_nm);
		p.Rslt_cr_dpt_nm.setNextBeans(p.Rslt_cr_ptn_typ);
		p.Rslt_cr_dpt_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_dpt_nm_META);
		p.Rslt_cr_ptn_typ.setListType(MCListType.STRICT);
		p.Rslt_cr_ptn_typ.setLinkBeans(p.Rslt_cr_ptn_typ_nm);
		p.Base12Panel.add(p.Rslt_cr_ptn_typ_Label);
		p.Base12Panel.add(p.Rslt_cr_ptn_typ);
		p.Rslt_cr_ptn_typ.setNextBeans(p.Rslt_cr_ptn_typ_nm);
		p.Rslt_cr_ptn_typ.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_ptn_typ_META);
		p.Base12Panel.add(p.Rslt_cr_ptn_typ_nm);
		p.Rslt_cr_ptn_typ_nm.setNextBeans(p.Rslt_cr_grp_cd);
		p.Rslt_cr_ptn_typ_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_ptn_typ_nm_META);
		p.Rslt_cr_grp_cd.setListType(MCListType.STRICT);
		p.Rslt_cr_grp_cd.setLinkBeans(p.Rslt_cr_grp_nm);
		p.Base12Panel.add(p.Rslt_cr_grp_cd_Label);
		p.Base12Panel.add(p.Rslt_cr_grp_cd);
		p.Rslt_cr_grp_cd.setNextBeans(p.Rslt_cr_grp_nm);
		p.Rslt_cr_grp_cd.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_grp_cd_META);
		p.Base12Panel.add(p.Rslt_cr_grp_nm);
		p.Rslt_cr_grp_nm.setNextBeans(p.Rslt_cr_ac_cd);
		p.Rslt_cr_grp_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_grp_nm_META);
		p.Base12Panel.add(p.Rslt_cr_ac_cd_Label);
		p.Base12Panel.add(p.Rslt_cr_ac_cd);
		p.Rslt_cr_ac_cd.setNextBeans(p.Rslt_cr_ac_nm);
		p.Rslt_cr_ac_cd.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_ac_cd_META);
		p.Rslt_cr_ac_cd.addLinkBeans(p.Rslt_cr_ac_nm,p.Rslt_cr_sub_flg,p.Rslt_cr_bp_flg);
		p.Rslt_cr_ac_cd.setListType(MCListType.STRICT);
		p.Base12Panel.add(p.Rslt_cr_ac_nm);
		p.Rslt_cr_ac_nm.setNextBeans(p.Rslt_cr_sub_ac_cd);
		p.Rslt_cr_ac_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_ac_nm_META);
		p.Rslt_cr_sub_ac_cd.setListType(MCListType.STRICT);
		p.Rslt_cr_sub_ac_cd.setLinkBeans(p.Rslt_cr_sub_ac_nm);
		p.Base12Panel.add(p.Rslt_cr_sub_ac_cd_Label);
		p.Base12Panel.add(p.Rslt_cr_sub_ac_cd);
		p.Rslt_cr_sub_ac_cd.setNextBeans(p.Rslt_cr_sub_ac_nm);
		p.Rslt_cr_sub_ac_cd.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_sub_ac_cd_META);
		p.Base12Panel.add(p.Rslt_cr_sub_ac_nm);
		p.Rslt_cr_sub_ac_nm.setNextBeans(p.Rslt_cr_bp_typ);
		p.Rslt_cr_sub_ac_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_sub_ac_nm_META);
		p.Rslt_cr_bp_typ.setListType(MCListType.STRICT);
		p.Rslt_cr_bp_typ.setLinkBeans(p.Rslt_cr_bp_typ_nm);
		p.Base12Panel.add(p.Rslt_cr_bp_typ_Label);
		p.Base12Panel.add(p.Rslt_cr_bp_typ);
		p.Rslt_cr_bp_typ.setNextBeans(p.Rslt_cr_bp_typ_nm);
		p.Rslt_cr_bp_typ.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_bp_typ_META);
		p.Base12Panel.add(p.Rslt_cr_bp_typ_nm);
		p.Rslt_cr_bp_typ_nm.setNextBeans(p.Rslt_cr_bp_cd);
		p.Rslt_cr_bp_typ_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_bp_typ_nm_META);
		p.Base12Panel.add(p.Rslt_cr_bp_cd_Label);
		p.Base12Panel.add(p.Rslt_cr_bp_cd);
		p.Rslt_cr_bp_cd.setNextBeans(p.Rslt_cr_bp_nm);
		p.Rslt_cr_bp_cd.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_bp_cd_META);
		p.Rslt_cr_bp_cd.addLinkBeans(p.Rslt_cr_bp_nm);
		p.Rslt_cr_bp_cd.setListType(MCListType.STRICT);
		p.Base12Panel.add(p.Rslt_cr_bp_nm);
		p.Rslt_cr_bp_nm.setNextBeans(p.Rslt_cr_ac_tax_cd);
		p.Rslt_cr_bp_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_bp_nm_META);
		p.Rslt_cr_ac_tax_cd.setListType(MCListType.STRICT);
		p.Rslt_cr_ac_tax_cd.setLinkBeans(p.Rslt_cr_ac_tax_nm);
		p.Base12Panel.add(p.Rslt_cr_ac_tax_cd_Label);
		p.Base12Panel.add(p.Rslt_cr_ac_tax_cd);
		p.Rslt_cr_ac_tax_cd.setNextBeans(p.Rslt_cr_ac_tax_nm);
		p.Rslt_cr_ac_tax_cd.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_ac_tax_cd_META);
		p.Base12Panel.add(p.Rslt_cr_ac_tax_nm);
		p.Rslt_cr_ac_tax_nm.setNextBeans(p.Rslt_cr_itm_typ);
		p.Rslt_cr_ac_tax_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_ac_tax_nm_META);
		p.Rslt_cr_itm_typ.setListType(MCListType.STRICT);
		p.Rslt_cr_itm_typ.setLinkBeans(p.Rslt_cr_itm_typ_nm);
		p.Base12Panel.add(p.Rslt_cr_itm_typ_Label);
		p.Base12Panel.add(p.Rslt_cr_itm_typ);
		p.Rslt_cr_itm_typ.setNextBeans(p.Rslt_cr_itm_typ_nm);
		p.Rslt_cr_itm_typ.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_itm_typ_META);
		p.Base12Panel.add(p.Rslt_cr_itm_typ_nm);
		p.Rslt_cr_itm_typ_nm.setNextBeans(p.Rslt_cr_amt_typ);
		p.Rslt_cr_itm_typ_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_itm_typ_nm_META);
		p.Rslt_cr_amt_typ.setListType(MCListType.STRICT);
		p.Rslt_cr_amt_typ.setLinkBeans(p.Rslt_cr_amt_typ_nm);
		p.Base12Panel.add(p.Rslt_cr_amt_typ_Label);
		p.Base12Panel.add(p.Rslt_cr_amt_typ);
		p.Rslt_cr_amt_typ.setNextBeans(p.Rslt_cr_amt_typ_nm);
		p.Rslt_cr_amt_typ.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_amt_typ_META);
		p.Base12Panel.add(p.Rslt_cr_amt_typ_nm);
		p.Rslt_cr_amt_typ_nm.setNextBeans(p.Rslt_cr_abs_typ);
		p.Rslt_cr_amt_typ_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_amt_typ_nm_META);
		p.Rslt_cr_abs_typ.setListType(MCListType.STRICT);
		p.Rslt_cr_abs_typ.setLinkBeans(p.Rslt_cr_abs_typ_nm);
		p.Base12Panel.add(p.Rslt_cr_abs_typ_Label);
		p.Base12Panel.add(p.Rslt_cr_abs_typ);
		p.Rslt_cr_abs_typ.setNextBeans(p.Rslt_cr_abs_typ_nm);
		p.Rslt_cr_abs_typ.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_abs_typ_META);
		p.Base12Panel.add(p.Rslt_cr_abs_typ_nm);
		p.Rslt_cr_abs_typ_nm.setNextBeans(p.Rslt_cr_abstract);
		p.Rslt_cr_abs_typ_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_abs_typ_nm_META);
		p.Base12Panel.add(p.Rslt_cr_abstract_Label);
		p.Base12Panel.add(p.Rslt_cr_abstract);
		p.Rslt_cr_abstract.setNextBeans(p.Rslt_cr_sub_flg);
		p.Rslt_cr_abstract.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_abstract_META);
		p.Base12Panel.add(p.Rslt_cr_sub_flg);
		p.Rslt_cr_sub_flg.setNextBeans(p.Rslt_cr_bp_flg);
		p.Rslt_cr_sub_flg.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_sub_flg_META);
		p.Base12Panel.add(p.Rslt_cr_bp_flg);
		p.Rslt_cr_bp_flg.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cr_bp_flg_META);
		p.Base13Panel.add(p.Rslt_minus_flg);
		p.Base13Panel.setLastBeans(p.Rslt_minus_flg);
		p.Rslt_minus_flg.setNextBeans(p.Rslt_carry_flg);
		p.Rslt_minus_flg.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.minus_flg_META);
		p.Base13Panel.add(p.Rslt_carry_flg);
		p.Rslt_carry_flg.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.carry_flg_META);
		p.Base2Panel.add(p.Rslt_itm_p_PPanel);
		p.Base2Panel.setLastBeans(p.Rslt_itm_p_PPanel);
		p.Rslt_itm_p_PPanel.setNextBeans(p.Rslt_itm_jnl_cd);
		p.Rslt_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Rslt_itm_nm,p.Rslt_itm_sub1,p.Rslt_itm_sub2,p.Rslt_itm_sub3);
		p.Rslt_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Rslt_itm_nm,p.Rslt_itm_sub2,p.Rslt_itm_sub3);
		p.Rslt_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Rslt_itm_nm,p.Rslt_itm_sub3);
		p.Rslt_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Rslt_itm_nm);
		p.Rslt_itm_jnl_cd.setListType(MCListType.STRICT);
		p.Rslt_itm_jnl_cd.setLinkBeans(p.Rslt_itm_jnl_nm);
		p.Base2Panel.add(p.Rslt_itm_jnl_cd_Label);
		p.Base2Panel.add(p.Rslt_itm_jnl_cd);
		p.Rslt_itm_jnl_cd.setNextBeans(p.Rslt_itm_jnl_nm);
		p.Rslt_itm_jnl_cd.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.itm_jnl_cd_META);
		p.Base2Panel.add(p.Rslt_itm_jnl_nm);
		p.Rslt_itm_jnl_nm.setNextBeans(p.Rslt_ac_rsn_cd);
		p.Rslt_itm_jnl_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.itm_jnl_nm_META);
		p.Rslt_ac_rsn_cd.setListType(MCListType.STRICT);
		p.Rslt_ac_rsn_cd.setLinkBeans(p.Rslt_ac_rsn_nm);
		p.Base2Panel.add(p.Rslt_ac_rsn_cd_Label);
		p.Base2Panel.add(p.Rslt_ac_rsn_cd);
		p.Rslt_ac_rsn_cd.setNextBeans(p.Rslt_ac_rsn_nm);
		p.Rslt_ac_rsn_cd.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.ac_rsn_cd_META);
		p.Base2Panel.add(p.Rslt_ac_rsn_nm);
		p.Rslt_ac_rsn_nm.setNextBeans(p.Rslt_purc_typ);
		p.Rslt_ac_rsn_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.ac_rsn_nm_META);
		p.Rslt_purc_typ.setListType(MCListType.STRICT);
		p.Rslt_purc_typ.setLinkBeans(p.Rslt_purc_typ_nm);
		p.Base2Panel.add(p.Rslt_purc_typ_Label);
		p.Base2Panel.add(p.Rslt_purc_typ);
		p.Rslt_purc_typ.setNextBeans(p.Rslt_purc_typ_nm);
		p.Rslt_purc_typ.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.purc_typ_META);
		p.Base2Panel.add(p.Rslt_purc_typ_nm);
		p.Rslt_purc_typ_nm.setNextBeans(p.Rslt_un_fix_typ);
		p.Rslt_purc_typ_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.purc_typ_nm_META);
		p.Rslt_un_fix_typ.setListType(MCListType.STRICT);
		p.Rslt_un_fix_typ.setLinkBeans(p.Rslt_un_fix_typ_nm);
		p.Base2Panel.add(p.Rslt_un_fix_typ_Label);
		p.Base2Panel.add(p.Rslt_un_fix_typ);
		p.Rslt_un_fix_typ.setNextBeans(p.Rslt_un_fix_typ_nm);
		p.Rslt_un_fix_typ.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.un_fix_typ_META);
		p.Base2Panel.add(p.Rslt_un_fix_typ_nm);
		p.Rslt_un_fix_typ_nm.setNextBeans(p.Rslt_foreign_typ);
		p.Rslt_un_fix_typ_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.un_fix_typ_nm_META);
		p.Rslt_foreign_typ.setListType(MCListType.STRICT);
		p.Rslt_foreign_typ.setLinkBeans(p.Rslt_foreign_typ_nm);
		p.Base2Panel.add(p.Rslt_foreign_typ_Label);
		p.Base2Panel.add(p.Rslt_foreign_typ);
		p.Rslt_foreign_typ.setNextBeans(p.Rslt_foreign_typ_nm);
		p.Rslt_foreign_typ.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.foreign_typ_META);
		p.Base2Panel.add(p.Rslt_foreign_typ_nm);
		p.Rslt_foreign_typ_nm.setNextBeans(p.Rslt_cur_cd);
		p.Rslt_foreign_typ_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.foreign_typ_nm_META);
		p.Rslt_cur_cd.setListType(MCListType.STRICT);
		p.Rslt_cur_cd.setLinkBeans(p.Rslt_cur_nm);
		p.Base2Panel.add(p.Rslt_cur_cd_Label);
		p.Base2Panel.add(p.Rslt_cur_cd);
		p.Rslt_cur_cd.setNextBeans(p.Rslt_cur_nm);
		p.Rslt_cur_cd.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cur_cd_META);
		p.Base2Panel.add(p.Rslt_cur_nm);
		p.Rslt_cur_nm.setNextBeans(p.Rslt_asst_typ);
		p.Rslt_cur_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.cur_nm_META);
		p.Rslt_asst_typ.setListType(MCListType.STRICT);
		p.Rslt_asst_typ.setLinkBeans(p.Rslt_asst_typ_nm);
		p.Base2Panel.add(p.Rslt_asst_typ_Label);
		p.Base2Panel.add(p.Rslt_asst_typ);
		p.Rslt_asst_typ.setNextBeans(p.Rslt_asst_typ_nm);
		p.Rslt_asst_typ.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.asst_typ_META);
		p.Base2Panel.add(p.Rslt_asst_typ_nm);
		p.Rslt_asst_typ_nm.setNextBeans(p.Rslt_quality_typ);
		p.Rslt_asst_typ_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.asst_typ_nm_META);
		p.Rslt_quality_typ.setListType(MCListType.STRICT);
		p.Rslt_quality_typ.setLinkBeans(p.Rslt_quality_typ_nm);
		p.Base2Panel.add(p.Rslt_quality_typ_Label);
		p.Base2Panel.add(p.Rslt_quality_typ);
		p.Rslt_quality_typ.setNextBeans(p.Rslt_quality_typ_nm);
		p.Rslt_quality_typ.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.quality_typ_META);
		p.Base2Panel.add(p.Rslt_quality_typ_nm);
		p.Rslt_quality_typ_nm.setNextBeans(p.Rslt_inv_loc_typ);
		p.Rslt_quality_typ_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.quality_typ_nm_META);
		p.Rslt_inv_loc_typ.setListType(MCListType.STRICT);
		p.Rslt_inv_loc_typ.setLinkBeans(p.Rslt_inv_loc_typ_nm);
		p.Base2Panel.add(p.Rslt_inv_loc_typ_Label);
		p.Base2Panel.add(p.Rslt_inv_loc_typ);
		p.Rslt_inv_loc_typ.setNextBeans(p.Rslt_inv_loc_typ_nm);
		p.Rslt_inv_loc_typ.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.inv_loc_typ_META);
		p.Base2Panel.add(p.Rslt_inv_loc_typ_nm);
		p.Rslt_inv_loc_typ_nm.setNextBeans(p.Rslt_amt_sign_typ);
		p.Rslt_inv_loc_typ_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.inv_loc_typ_nm_META);
		p.Rslt_amt_sign_typ.setListType(MCListType.STRICT);
		p.Rslt_amt_sign_typ.setLinkBeans(p.Rslt_amt_sign_typ_nm);
		p.Base2Panel.add(p.Rslt_amt_sign_typ_Label);
		p.Base2Panel.add(p.Rslt_amt_sign_typ);
		p.Rslt_amt_sign_typ.setNextBeans(p.Rslt_amt_sign_typ_nm);
		p.Rslt_amt_sign_typ.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.amt_sign_typ_META);
		p.Base2Panel.add(p.Rslt_amt_sign_typ_nm);
		p.Rslt_amt_sign_typ_nm.setNextBeans(p.Rslt_jnl_key1);
		p.Rslt_amt_sign_typ_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.amt_sign_typ_nm_META);
		p.Base2Panel.add(p.Rslt_jnl_key1_Label);
		p.Base2Panel.add(p.Rslt_jnl_key1);
		p.Rslt_jnl_key1.setNextBeans(p.Rslt_jnl_key2);
		p.Rslt_jnl_key1.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.jnl_key1_META);
		p.Base2Panel.add(p.Rslt_jnl_key2_Label);
		p.Base2Panel.add(p.Rslt_jnl_key2);
		p.Rslt_jnl_key2.setNextBeans(p.Rslt_jnl_key3);
		p.Rslt_jnl_key2.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.jnl_key2_META);
		p.Base2Panel.add(p.Rslt_jnl_key3_Label);
		p.Base2Panel.add(p.Rslt_jnl_key3);
		p.Rslt_jnl_key3.setNextBeans(p.Rslt_jnl_key4);
		p.Rslt_jnl_key3.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.jnl_key3_META);
		p.Base2Panel.add(p.Rslt_jnl_key4_Label);
		p.Base2Panel.add(p.Rslt_jnl_key4);
		p.Rslt_jnl_key4.setNextBeans(p.Rslt_jnl_key5);
		p.Rslt_jnl_key4.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.jnl_key4_META);
		p.Base2Panel.add(p.Rslt_jnl_key5_Label);
		p.Base2Panel.add(p.Rslt_jnl_key5);
		p.Rslt_jnl_key5.setNextBeans(p.Rslt_jnl_key6);
		p.Rslt_jnl_key5.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.jnl_key5_META);
		p.Base2Panel.add(p.Rslt_jnl_key6_Label);
		p.Base2Panel.add(p.Rslt_jnl_key6);
		p.Rslt_jnl_key6.setNextBeans(p.Rslt_jnl_key7);
		p.Rslt_jnl_key6.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.jnl_key6_META);
		p.Base2Panel.add(p.Rslt_jnl_key7_Label);
		p.Base2Panel.add(p.Rslt_jnl_key7);
		p.Rslt_jnl_key7.setNextBeans(p.Rslt_jnl_key8);
		p.Rslt_jnl_key7.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.jnl_key7_META);
		p.Base2Panel.add(p.Rslt_jnl_key8_Label);
		p.Base2Panel.add(p.Rslt_jnl_key8);
		p.Rslt_jnl_key8.setNextBeans(p.Rslt_jnl_key9);
		p.Rslt_jnl_key8.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.jnl_key8_META);
		p.Base2Panel.add(p.Rslt_jnl_key9_Label);
		p.Base2Panel.add(p.Rslt_jnl_key9);
		p.Rslt_jnl_key9.setNextBeans(p.Rslt_jnl_key10);
		p.Rslt_jnl_key9.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.jnl_key9_META);
		p.Base2Panel.add(p.Rslt_jnl_key10_Label);
		p.Base2Panel.add(p.Rslt_jnl_key10);
		p.Rslt_jnl_key10.setNextBeans(p.Rslt_mon01_invalid_flg);
		p.Rslt_jnl_key10.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.jnl_key10_META);
		p.Base2Panel.add(p.Rslt_mon01_invalid_flg);
		p.Rslt_mon01_invalid_flg.setNextBeans(p.Rslt_mon02_invalid_flg);
		p.Rslt_mon01_invalid_flg.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.mon01_invalid_flg_META);
		p.Base2Panel.add(p.Rslt_mon02_invalid_flg);
		p.Rslt_mon02_invalid_flg.setNextBeans(p.Rslt_mon03_invalid_flg);
		p.Rslt_mon02_invalid_flg.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.mon02_invalid_flg_META);
		p.Base2Panel.add(p.Rslt_mon03_invalid_flg);
		p.Rslt_mon03_invalid_flg.setNextBeans(p.Rslt_mon04_invalid_flg);
		p.Rslt_mon03_invalid_flg.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.mon03_invalid_flg_META);
		p.Base2Panel.add(p.Rslt_mon04_invalid_flg);
		p.Rslt_mon04_invalid_flg.setNextBeans(p.Rslt_mon05_invalid_flg);
		p.Rslt_mon04_invalid_flg.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.mon04_invalid_flg_META);
		p.Base2Panel.add(p.Rslt_mon05_invalid_flg);
		p.Rslt_mon05_invalid_flg.setNextBeans(p.Rslt_mon06_invalid_flg);
		p.Rslt_mon05_invalid_flg.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.mon05_invalid_flg_META);
		p.Base2Panel.add(p.Rslt_mon06_invalid_flg);
		p.Rslt_mon06_invalid_flg.setNextBeans(p.Rslt_mon07_invalid_flg);
		p.Rslt_mon06_invalid_flg.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.mon06_invalid_flg_META);
		p.Base2Panel.add(p.Rslt_mon07_invalid_flg);
		p.Rslt_mon07_invalid_flg.setNextBeans(p.Rslt_mon08_invalid_flg);
		p.Rslt_mon07_invalid_flg.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.mon07_invalid_flg_META);
		p.Base2Panel.add(p.Rslt_mon08_invalid_flg);
		p.Rslt_mon08_invalid_flg.setNextBeans(p.Rslt_mon09_invalid_flg);
		p.Rslt_mon08_invalid_flg.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.mon08_invalid_flg_META);
		p.Base2Panel.add(p.Rslt_mon09_invalid_flg);
		p.Rslt_mon09_invalid_flg.setNextBeans(p.Rslt_mon10_invalid_flg);
		p.Rslt_mon09_invalid_flg.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.mon09_invalid_flg_META);
		p.Base2Panel.add(p.Rslt_mon10_invalid_flg);
		p.Rslt_mon10_invalid_flg.setNextBeans(p.Rslt_mon11_invalid_flg);
		p.Rslt_mon10_invalid_flg.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.mon10_invalid_flg_META);
		p.Base2Panel.add(p.Rslt_mon11_invalid_flg);
		p.Rslt_mon11_invalid_flg.setNextBeans(p.Rslt_mon12_invalid_flg);
		p.Rslt_mon11_invalid_flg.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.mon11_invalid_flg_META);
		p.Base2Panel.add(p.Rslt_mon12_invalid_flg);
		p.Rslt_mon12_invalid_flg.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.mon12_invalid_flg_META);
		p.Base3Panel.add(p.Rslt_ins_usr_id_Label);
		p.Base3Panel.add(p.Rslt_ins_usr_id);
		p.Base3Panel.setLastBeans(p.Rslt_ins_usr_id);
		p.Rslt_ins_usr_id.setNextBeans(p.Rslt_ins_usr_nm);
		p.Rslt_ins_usr_id.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.ins_usr_id_META);
		p.Base3Panel.add(p.Rslt_ins_usr_nm);
		p.Rslt_ins_usr_nm.setNextBeans(p.Rslt_ins_func_id);
		p.Rslt_ins_usr_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.ins_usr_nm_META);
		p.Base3Panel.add(p.Rslt_ins_func_id_Label);
		p.Base3Panel.add(p.Rslt_ins_func_id);
		p.Rslt_ins_func_id.setNextBeans(p.Rslt_ins_func_nm);
		p.Rslt_ins_func_id.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.ins_func_id_META);
		p.Base3Panel.add(p.Rslt_ins_func_nm);
		p.Rslt_ins_func_nm.setNextBeans(p.Rslt_upd_usr_id);
		p.Rslt_ins_func_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.ins_func_nm_META);
		p.Base3Panel.add(p.Rslt_upd_usr_id_Label);
		p.Base3Panel.add(p.Rslt_upd_usr_id);
		p.Rslt_upd_usr_id.setNextBeans(p.Rslt_upd_usr_nm);
		p.Rslt_upd_usr_id.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.upd_usr_id_META);
		p.Base3Panel.add(p.Rslt_upd_usr_nm);
		p.Rslt_upd_usr_nm.setNextBeans(p.Rslt_upd_func_id);
		p.Rslt_upd_usr_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.upd_usr_nm_META);
		p.Base3Panel.add(p.Rslt_upd_func_id_Label);
		p.Base3Panel.add(p.Rslt_upd_func_id);
		p.Rslt_upd_func_id.setNextBeans(p.Rslt_upd_func_nm);
		p.Rslt_upd_func_id.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.upd_func_id_META);
		p.Base3Panel.add(p.Rslt_upd_func_nm);
		p.Rslt_upd_func_nm.setNextBeans(p.Rslt_ins_ts);
		p.Rslt_upd_func_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.upd_func_nm_META);
		p.Base3Panel.add(p.Rslt_ins_ts_Label);
		p.Base3Panel.add(p.Rslt_ins_ts);
		p.Rslt_ins_ts.setNextBeans(p.Rslt_upd_ts);
		p.Rslt_ins_ts.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.ins_ts_META);
		p.Rslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Base3Panel.add(p.Rslt_upd_ts_Label);
		p.Base3Panel.add(p.Rslt_upd_ts);
		p.Rslt_upd_ts.setNextBeans(p.Rslt_upd_srv_req_no);
		p.Rslt_upd_ts.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.upd_ts_META);
		p.Rslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Base3Panel.add(p.Rslt_upd_srv_req_no_Label);
		p.Base3Panel.add(p.Rslt_upd_srv_req_no);
		p.Rslt_upd_srv_req_no.setNextBeans(p.Rslt_upd_cntr);
		p.Rslt_upd_srv_req_no.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.upd_srv_req_no_META);
		p.Base3Panel.add(p.Rslt_upd_cntr_Label);
		p.Base3Panel.add(p.Rslt_upd_cntr);
		p.Rslt_upd_cntr.setNextBeans(p.Rslt_del_usr_id);
		p.Rslt_upd_cntr.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.upd_cntr_META);
		p.Base3Panel.add(p.Rslt_del_usr_id_Label);
		p.Base3Panel.add(p.Rslt_del_usr_id);
		p.Rslt_del_usr_id.setNextBeans(p.Rslt_del_usr_nm);
		p.Rslt_del_usr_id.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.del_usr_id_META);
		p.Base3Panel.add(p.Rslt_del_usr_nm);
		p.Rslt_del_usr_nm.setNextBeans(p.Rslt_del_ts);
		p.Rslt_del_usr_nm.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.del_usr_nm_META);
		p.Base3Panel.add(p.Rslt_del_ts_Label);
		p.Base3Panel.add(p.Rslt_del_ts);
		p.Rslt_del_ts.setRow(p.getRsltR(), mcframe.clientMABC.MABCP1060.RsltR.del_ts_META);
		p.Rslt_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABCP_JnlPatternReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.BtnPanel.setLastBeans(p.Btn_dr_typ_Group);
		p.Btn_dr_typ_Group.setFirstBeans(p.Btn_dr_typ_DR);
		p.Btn_dr_typ_DR.setActionCommand("0");
		p.Btn_dr_typ_Group.add(p.Btn_dr_typ_DR);
		p.BtnPanel.add(p.Btn_dr_typ_DR);
		p.Btn_dr_typ_DR.setNextBeans(p.Btn_dr_typ_CR);
		p.Btn_dr_typ_CR.setActionCommand("1");
		p.Btn_dr_typ_Group.add(p.Btn_dr_typ_CR);
		p.BtnPanel.add(p.Btn_dr_typ_CR);
		p.Btn_dr_typ_Group.setRow(p.getBtnR(), mcframe.clientMABC.MABCP1060.BtnR.dr_typ_META);
		p.Btn_dr_typ_Group.setNextBeans(p.Btn_open_MABCP1110);
		p.Btn_open_MABCP1110.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MABCP1110);
		p.Btn_open_MABCP1110.setNextBeans(p.Btn_open_MABCP1120);
		p.Btn_open_MABCP1120.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MABCP1120);
		p.Btn_open_MABCP1120.setNextBeans(p.Btn_open_MABCP1130);
		p.Btn_open_MABCP1130.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MABCP1130);
		p.Btn_open_MABCP1130.setNextBeans(p.Btn_upd);
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
	protected static void jbInitEastBtn(MABCP_JnlPatternReg p) {
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

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MABCP_JnlPatternReg_MC.mcInitScreenOpe((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.mcInitMst((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.mcInitCnd((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.mcInitBase((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.mcInitBaseHdr((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.mcInitBaseTab((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.mcInitBase1((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.mcInitBase11((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.mcInitBase12((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.mcInitBase13((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.mcInitBase2((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.mcInitBase3((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.mcInitRslt((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.mcInitBtn((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.mcInitEastBtn((MABCP_JnlPatternReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_JnlPatternReg_MC.statusInitUPD_ScreenOpe((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitUPD_Mst((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitUPD_Cnd((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitUPD_Base((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitUPD_BaseHdr((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitUPD_BaseTab((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitUPD_Base1((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitUPD_Base11((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitUPD_Base12((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitUPD_Base13((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitUPD_Base2((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitUPD_Base3((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitUPD_Rslt((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitUPD_Btn((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitUPD_EastBtn((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitUPD_RsltAll((MABCP_JnlPatternReg)this);

		// [SRCH]ステータスのモードの設定
		MABCP_JnlPatternReg_MC.statusInitSRCH_ScreenOpe((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitSRCH_Mst((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitSRCH_Cnd((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitSRCH_Base((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitSRCH_BaseHdr((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitSRCH_BaseTab((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitSRCH_Base1((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitSRCH_Base11((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitSRCH_Base12((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitSRCH_Base13((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitSRCH_Base2((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitSRCH_Base3((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitSRCH_Rslt((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitSRCH_Btn((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitSRCH_EastBtn((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitSRCH_RsltAll((MABCP_JnlPatternReg)this);

		// [MOD]ステータスのモードの設定
		MABCP_JnlPatternReg_MC.statusInitMOD_ScreenOpe((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitMOD_Mst((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitMOD_Cnd((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitMOD_Base((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitMOD_BaseHdr((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitMOD_BaseTab((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitMOD_Base1((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitMOD_Base11((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitMOD_Base12((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitMOD_Base13((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitMOD_Base2((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitMOD_Base3((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitMOD_Rslt((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitMOD_Btn((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitMOD_EastBtn((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitMOD_RsltAll((MABCP_JnlPatternReg)this);

		// [DEL]ステータスのモードの設定
		MABCP_JnlPatternReg_MC.statusInitDEL_ScreenOpe((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitDEL_Mst((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitDEL_Cnd((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitDEL_Base((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitDEL_BaseHdr((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitDEL_BaseTab((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitDEL_Base1((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitDEL_Base11((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitDEL_Base12((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitDEL_Base13((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitDEL_Base2((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitDEL_Base3((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitDEL_Rslt((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitDEL_Btn((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitDEL_EastBtn((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitDEL_RsltAll((MABCP_JnlPatternReg)this);

		// [REF]ステータスのモードの設定
		MABCP_JnlPatternReg_MC.statusInitREF_ScreenOpe((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitREF_Mst((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitREF_Cnd((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitREF_Base((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitREF_BaseHdr((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitREF_BaseTab((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitREF_Base1((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitREF_Base11((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitREF_Base12((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitREF_Base13((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitREF_Base2((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitREF_Base3((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitREF_Rslt((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitREF_Btn((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitREF_EastBtn((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitREF_RsltAll((MABCP_JnlPatternReg)this);

		// [FIX_U]ステータスのモードの設定
		MABCP_JnlPatternReg_MC.statusInitFIX__U_ScreenOpe((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX__U_Mst((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX__U_Cnd((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX__U_Base((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX__U_BaseHdr((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX__U_BaseTab((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX__U_Base1((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX__U_Base11((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX__U_Base12((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX__U_Base13((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX__U_Base2((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX__U_Base3((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX__U_Rslt((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX__U_Btn((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX__U_EastBtn((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX__U_RsltAll((MABCP_JnlPatternReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_JnlPatternReg_MC.statusInitFIX_ScreenOpe((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX_Mst((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX_Cnd((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX_Base((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX_BaseHdr((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX_BaseTab((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX_Base1((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX_Base11((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX_Base12((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX_Base13((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX_Base2((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX_Base3((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX_Rslt((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX_Btn((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX_EastBtn((MABCP_JnlPatternReg)this);
		MABCP_JnlPatternReg_MC.statusInitFIX_RsltAll((MABCP_JnlPatternReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_JnlPatternReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_JnlPatternReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_JnlPatternReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_MOD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_jnl_ptn_cd.setListListener(p);
		p.Cnd_jnl_ptn_cd.addAllListener(p);
		p.Cnd_jnl_ptn_nm.setListListener(p);
		p.Cnd_jnl_ptn_nm.addAllListener(p);
		p.Cnd_jnl_seq.setListListener(p);
		p.Cnd_jnl_seq.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [Base]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBase(MABCP_JnlPatternReg p) {
	}

	/**
	 *  [BaseHdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBaseHdr(MABCP_JnlPatternReg p) {
	}

	/**
	 *  [BaseTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBaseTab(MABCP_JnlPatternReg p) {
		p.BaseTabTab.addAllListener(p);
	}

	/**
	 *  [Base1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBase1(MABCP_JnlPatternReg p) {
	}

	/**
	 *  [Base11]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBase11(MABCP_JnlPatternReg p) {
	}

	/**
	 *  [Base12]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBase12(MABCP_JnlPatternReg p) {
	}

	/**
	 *  [Base13]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBase13(MABCP_JnlPatternReg p) {
	}

	/**
	 *  [Base2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBase2(MABCP_JnlPatternReg p) {
	}

	/**
	 *  [Base3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBase3(MABCP_JnlPatternReg p) {
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MABCP_JnlPatternReg p) {
		p.Rslt_check.addAllListener(p);
		p.Rslt_jnl_ptn_cd.setListListener(p);
		p.Rslt_jnl_ptn_cd.addAllListener(p);
		p.Rslt_jnl_ptn_nm.setListListener(p);
		p.Rslt_jnl_ptn_nm.addAllListener(p);
		p.Rslt_jnl_seq.setListListener(p);
		p.Rslt_jnl_seq.addAllListener(p);
		p.Rslt_memo1.setListListener(p);
		p.Rslt_memo1.addAllListener(p);
		p.Rslt_memo2.setListListener(p);
		p.Rslt_memo2.addAllListener(p);
		p.Rslt_memo3.setListListener(p);
		p.Rslt_memo3.addAllListener(p);
		p.Rslt_del_flg.addAllListener(p);
		p.Rslt_dr_dpt_typ.setListListener(p);
		p.Rslt_dr_dpt_typ.addAllListener(p);
		p.Rslt_dr_dpt_typ_nm.setListListener(p);
		p.Rslt_dr_dpt_typ_nm.addAllListener(p);
		p.Rslt_dr_trd_sml_flg.addAllListener(p);
		p.Rslt_dr_dpt_cd.setListListener(p);
		p.Rslt_dr_dpt_cd.addAllListener(p);
		p.Rslt_dr_dpt_nm.setListListener(p);
		p.Rslt_dr_dpt_nm.addAllListener(p);
		p.Rslt_dr_ptn_typ.setListListener(p);
		p.Rslt_dr_ptn_typ.addAllListener(p);
		p.Rslt_dr_ptn_typ_nm.setListListener(p);
		p.Rslt_dr_ptn_typ_nm.addAllListener(p);
		p.Rslt_dr_grp_cd.setListListener(p);
		p.Rslt_dr_grp_cd.addAllListener(p);
		p.Rslt_dr_grp_nm.setListListener(p);
		p.Rslt_dr_grp_nm.addAllListener(p);
		p.Rslt_dr_ac_cd.setListListener(p);
		p.Rslt_dr_ac_cd.addAllListener(p);
		p.Rslt_dr_ac_nm.setListListener(p);
		p.Rslt_dr_ac_nm.addAllListener(p);
		p.Rslt_dr_sub_ac_cd.setListListener(p);
		p.Rslt_dr_sub_ac_cd.addAllListener(p);
		p.Rslt_dr_sub_ac_nm.setListListener(p);
		p.Rslt_dr_sub_ac_nm.addAllListener(p);
		p.Rslt_dr_bp_typ.setListListener(p);
		p.Rslt_dr_bp_typ.addAllListener(p);
		p.Rslt_dr_bp_typ_nm.setListListener(p);
		p.Rslt_dr_bp_typ_nm.addAllListener(p);
		p.Rslt_dr_bp_cd.setListListener(p);
		p.Rslt_dr_bp_cd.addAllListener(p);
		p.Rslt_dr_bp_nm.setListListener(p);
		p.Rslt_dr_bp_nm.addAllListener(p);
		p.Rslt_dr_ac_tax_cd.setListListener(p);
		p.Rslt_dr_ac_tax_cd.addAllListener(p);
		p.Rslt_dr_ac_tax_nm.setListListener(p);
		p.Rslt_dr_ac_tax_nm.addAllListener(p);
		p.Rslt_dr_itm_typ.setListListener(p);
		p.Rslt_dr_itm_typ.addAllListener(p);
		p.Rslt_dr_itm_typ_nm.setListListener(p);
		p.Rslt_dr_itm_typ_nm.addAllListener(p);
		p.Rslt_dr_amt_typ.setListListener(p);
		p.Rslt_dr_amt_typ.addAllListener(p);
		p.Rslt_dr_amt_typ_nm.setListListener(p);
		p.Rslt_dr_amt_typ_nm.addAllListener(p);
		p.Rslt_dr_abs_typ.setListListener(p);
		p.Rslt_dr_abs_typ.addAllListener(p);
		p.Rslt_dr_abs_typ_nm.setListListener(p);
		p.Rslt_dr_abs_typ_nm.addAllListener(p);
		p.Rslt_dr_abstract.setListListener(p);
		p.Rslt_dr_abstract.addAllListener(p);
		p.Rslt_dr_sub_flg.addAllListener(p);
		p.Rslt_dr_bp_flg.addAllListener(p);
		p.Rslt_cr_dpt_typ.setListListener(p);
		p.Rslt_cr_dpt_typ.addAllListener(p);
		p.Rslt_cr_dpt_typ_nm.setListListener(p);
		p.Rslt_cr_dpt_typ_nm.addAllListener(p);
		p.Rslt_cr_trd_sml_flg.addAllListener(p);
		p.Rslt_cr_dpt_cd.setListListener(p);
		p.Rslt_cr_dpt_cd.addAllListener(p);
		p.Rslt_cr_dpt_nm.setListListener(p);
		p.Rslt_cr_dpt_nm.addAllListener(p);
		p.Rslt_cr_ptn_typ.setListListener(p);
		p.Rslt_cr_ptn_typ.addAllListener(p);
		p.Rslt_cr_ptn_typ_nm.setListListener(p);
		p.Rslt_cr_ptn_typ_nm.addAllListener(p);
		p.Rslt_cr_grp_cd.setListListener(p);
		p.Rslt_cr_grp_cd.addAllListener(p);
		p.Rslt_cr_grp_nm.setListListener(p);
		p.Rslt_cr_grp_nm.addAllListener(p);
		p.Rslt_cr_ac_cd.setListListener(p);
		p.Rslt_cr_ac_cd.addAllListener(p);
		p.Rslt_cr_ac_nm.setListListener(p);
		p.Rslt_cr_ac_nm.addAllListener(p);
		p.Rslt_cr_sub_ac_cd.setListListener(p);
		p.Rslt_cr_sub_ac_cd.addAllListener(p);
		p.Rslt_cr_sub_ac_nm.setListListener(p);
		p.Rslt_cr_sub_ac_nm.addAllListener(p);
		p.Rslt_cr_bp_typ.setListListener(p);
		p.Rslt_cr_bp_typ.addAllListener(p);
		p.Rslt_cr_bp_typ_nm.setListListener(p);
		p.Rslt_cr_bp_typ_nm.addAllListener(p);
		p.Rslt_cr_bp_cd.setListListener(p);
		p.Rslt_cr_bp_cd.addAllListener(p);
		p.Rslt_cr_bp_nm.setListListener(p);
		p.Rslt_cr_bp_nm.addAllListener(p);
		p.Rslt_cr_ac_tax_cd.setListListener(p);
		p.Rslt_cr_ac_tax_cd.addAllListener(p);
		p.Rslt_cr_ac_tax_nm.setListListener(p);
		p.Rslt_cr_ac_tax_nm.addAllListener(p);
		p.Rslt_cr_itm_typ.setListListener(p);
		p.Rslt_cr_itm_typ.addAllListener(p);
		p.Rslt_cr_itm_typ_nm.setListListener(p);
		p.Rslt_cr_itm_typ_nm.addAllListener(p);
		p.Rslt_cr_amt_typ.setListListener(p);
		p.Rslt_cr_amt_typ.addAllListener(p);
		p.Rslt_cr_amt_typ_nm.setListListener(p);
		p.Rslt_cr_amt_typ_nm.addAllListener(p);
		p.Rslt_cr_abs_typ.setListListener(p);
		p.Rslt_cr_abs_typ.addAllListener(p);
		p.Rslt_cr_abs_typ_nm.setListListener(p);
		p.Rslt_cr_abs_typ_nm.addAllListener(p);
		p.Rslt_cr_abstract.setListListener(p);
		p.Rslt_cr_abstract.addAllListener(p);
		p.Rslt_cr_sub_flg.addAllListener(p);
		p.Rslt_cr_bp_flg.addAllListener(p);
		p.Rslt_minus_flg.addAllListener(p);
		p.Rslt_carry_flg.addAllListener(p);
		p.Rslt_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Rslt_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Rslt_itm_jnl_cd.setListListener(p);
		p.Rslt_itm_jnl_cd.addAllListener(p);
		p.Rslt_itm_jnl_nm.setListListener(p);
		p.Rslt_itm_jnl_nm.addAllListener(p);
		p.Rslt_ac_rsn_cd.setListListener(p);
		p.Rslt_ac_rsn_cd.addAllListener(p);
		p.Rslt_ac_rsn_nm.setListListener(p);
		p.Rslt_ac_rsn_nm.addAllListener(p);
		p.Rslt_purc_typ.setListListener(p);
		p.Rslt_purc_typ.addAllListener(p);
		p.Rslt_purc_typ_nm.setListListener(p);
		p.Rslt_purc_typ_nm.addAllListener(p);
		p.Rslt_un_fix_typ.setListListener(p);
		p.Rslt_un_fix_typ.addAllListener(p);
		p.Rslt_un_fix_typ_nm.setListListener(p);
		p.Rslt_un_fix_typ_nm.addAllListener(p);
		p.Rslt_foreign_typ.setListListener(p);
		p.Rslt_foreign_typ.addAllListener(p);
		p.Rslt_foreign_typ_nm.setListListener(p);
		p.Rslt_foreign_typ_nm.addAllListener(p);
		p.Rslt_cur_cd.setListListener(p);
		p.Rslt_cur_cd.addAllListener(p);
		p.Rslt_cur_nm.setListListener(p);
		p.Rslt_cur_nm.addAllListener(p);
		p.Rslt_asst_typ.setListListener(p);
		p.Rslt_asst_typ.addAllListener(p);
		p.Rslt_asst_typ_nm.setListListener(p);
		p.Rslt_asst_typ_nm.addAllListener(p);
		p.Rslt_quality_typ.setListListener(p);
		p.Rslt_quality_typ.addAllListener(p);
		p.Rslt_quality_typ_nm.setListListener(p);
		p.Rslt_quality_typ_nm.addAllListener(p);
		p.Rslt_inv_loc_typ.setListListener(p);
		p.Rslt_inv_loc_typ.addAllListener(p);
		p.Rslt_inv_loc_typ_nm.setListListener(p);
		p.Rslt_inv_loc_typ_nm.addAllListener(p);
		p.Rslt_amt_sign_typ.setListListener(p);
		p.Rslt_amt_sign_typ.addAllListener(p);
		p.Rslt_amt_sign_typ_nm.setListListener(p);
		p.Rslt_amt_sign_typ_nm.addAllListener(p);
		p.Rslt_jnl_key1.setListListener(p);
		p.Rslt_jnl_key1.addAllListener(p);
		p.Rslt_jnl_key2.setListListener(p);
		p.Rslt_jnl_key2.addAllListener(p);
		p.Rslt_jnl_key3.setListListener(p);
		p.Rslt_jnl_key3.addAllListener(p);
		p.Rslt_jnl_key4.setListListener(p);
		p.Rslt_jnl_key4.addAllListener(p);
		p.Rslt_jnl_key5.setListListener(p);
		p.Rslt_jnl_key5.addAllListener(p);
		p.Rslt_jnl_key6.setListListener(p);
		p.Rslt_jnl_key6.addAllListener(p);
		p.Rslt_jnl_key7.setListListener(p);
		p.Rslt_jnl_key7.addAllListener(p);
		p.Rslt_jnl_key8.setListListener(p);
		p.Rslt_jnl_key8.addAllListener(p);
		p.Rslt_jnl_key9.setListListener(p);
		p.Rslt_jnl_key9.addAllListener(p);
		p.Rslt_jnl_key10.setListListener(p);
		p.Rslt_jnl_key10.addAllListener(p);
		p.Rslt_mon01_invalid_flg.addAllListener(p);
		p.Rslt_mon02_invalid_flg.addAllListener(p);
		p.Rslt_mon03_invalid_flg.addAllListener(p);
		p.Rslt_mon04_invalid_flg.addAllListener(p);
		p.Rslt_mon05_invalid_flg.addAllListener(p);
		p.Rslt_mon06_invalid_flg.addAllListener(p);
		p.Rslt_mon07_invalid_flg.addAllListener(p);
		p.Rslt_mon08_invalid_flg.addAllListener(p);
		p.Rslt_mon09_invalid_flg.addAllListener(p);
		p.Rslt_mon10_invalid_flg.addAllListener(p);
		p.Rslt_mon11_invalid_flg.addAllListener(p);
		p.Rslt_mon12_invalid_flg.addAllListener(p);
		p.Rslt_ins_usr_id.setListListener(p);
		p.Rslt_ins_usr_id.addAllListener(p);
		p.Rslt_ins_usr_nm.setListListener(p);
		p.Rslt_ins_usr_nm.addAllListener(p);
		p.Rslt_ins_func_id.setListListener(p);
		p.Rslt_ins_func_id.addAllListener(p);
		p.Rslt_ins_func_nm.setListListener(p);
		p.Rslt_ins_func_nm.addAllListener(p);
		p.Rslt_upd_usr_id.setListListener(p);
		p.Rslt_upd_usr_id.addAllListener(p);
		p.Rslt_upd_usr_nm.setListListener(p);
		p.Rslt_upd_usr_nm.addAllListener(p);
		p.Rslt_upd_func_id.setListListener(p);
		p.Rslt_upd_func_id.addAllListener(p);
		p.Rslt_upd_func_nm.setListListener(p);
		p.Rslt_upd_func_nm.addAllListener(p);
		p.Rslt_ins_ts.setListListener(p);
		p.Rslt_ins_ts.addAllListener(p);
		p.Rslt_upd_ts.setListListener(p);
		p.Rslt_upd_ts.addAllListener(p);
		p.Rslt_upd_srv_req_no.setListListener(p);
		p.Rslt_upd_srv_req_no.addAllListener(p);
		p.Rslt_upd_cntr.setListListener(p);
		p.Rslt_upd_cntr.addAllListener(p);
		p.Rslt_del_usr_id.setListListener(p);
		p.Rslt_del_usr_id.addAllListener(p);
		p.Rslt_del_usr_nm.setListListener(p);
		p.Rslt_del_usr_nm.addAllListener(p);
		p.Rslt_del_ts.setListListener(p);
		p.Rslt_del_ts.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABCP_JnlPatternReg p) {
		p.Btn_dr_typ_Group.addAllListener(p);
		p.Btn_dr_typ_DR.addAllListener(p);
		p.Btn_dr_typ_CR.addAllListener(p);
		p.Btn_open_MABCP1110.addAllListener(p);
		p.Btn_open_MABCP1110.setAPMethodName("doBtn_open_MABCP1110");
		p.Btn_open_MABCP1120.addAllListener(p);
		p.Btn_open_MABCP1120.setAPMethodName("doBtn_open_MABCP1120");
		p.Btn_open_MABCP1130.addAllListener(p);
		p.Btn_open_MABCP1130.setAPMethodName("doBtn_open_MABCP1130");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABCP_JnlPatternReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_JnlPatternReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABCP_JnlPatternReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_JnlPatternReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_jnl_ptn_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_jnl_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_jnl_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Base(MABCP_JnlPatternReg p){

	}

	/**
	 * [UPD]ステータスの[BaseHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BaseHdr(MABCP_JnlPatternReg p){

	}

	/**
	 * [UPD]ステータスの[BaseTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BaseTab(MABCP_JnlPatternReg p){

	}

	/**
	 * [UPD]ステータスの[Base1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Base1(MABCP_JnlPatternReg p){

	}

	/**
	 * [UPD]ステータスの[Base11]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Base11(MABCP_JnlPatternReg p){

	}

	/**
	 * [UPD]ステータスの[Base12]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Base12(MABCP_JnlPatternReg p){

	}

	/**
	 * [UPD]ステータスの[Base13]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Base13(MABCP_JnlPatternReg p){

	}

	/**
	 * [UPD]ステータスの[Base2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Base2(MABCP_JnlPatternReg p){

	}

	/**
	 * [UPD]ステータスの[Base3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Base3(MABCP_JnlPatternReg p){

	}

	/**
	 * [UPD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Rslt(MABCP_JnlPatternReg p){
		p.Rslt_check.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_jnl_ptn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_jnl_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_jnl_seq.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_dr_dpt_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_dr_dpt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_dr_trd_sml_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_dr_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_dr_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_dr_ptn_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_dr_ptn_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_dr_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_dr_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_dr_ac_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_dr_ac_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_dr_sub_ac_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_dr_sub_ac_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_dr_bp_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_dr_bp_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_dr_bp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_dr_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_dr_ac_tax_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_dr_ac_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_dr_itm_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_dr_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_dr_amt_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_dr_amt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_dr_abs_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_dr_abs_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_dr_abstract.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_dr_sub_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_dr_bp_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_cr_dpt_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_cr_dpt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_cr_trd_sml_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_cr_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_cr_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_cr_ptn_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_cr_ptn_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_cr_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_cr_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_cr_ac_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_cr_ac_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_cr_sub_ac_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_cr_sub_ac_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_cr_bp_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_cr_bp_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_cr_bp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_cr_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_cr_ac_tax_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_cr_ac_tax_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_cr_itm_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_cr_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_cr_amt_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_cr_amt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_cr_abs_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_cr_abs_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_cr_abstract.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_cr_sub_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_cr_bp_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_minus_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_carry_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE);
		p.Rslt_itm_jnl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_itm_jnl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_ac_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_ac_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_purc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_purc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_un_fix_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_un_fix_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_foreign_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_foreign_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_cur_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_asst_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_asst_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_quality_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_quality_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_inv_loc_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_inv_loc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_amt_sign_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_amt_sign_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_jnl_key1.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_jnl_key2.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_jnl_key3.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_jnl_key4.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_jnl_key5.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_jnl_key6.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_jnl_key7.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_jnl_key8.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_jnl_key9.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_jnl_key10.putMode(p, UPD, MCMode.ENABLE);
		p.Rslt_mon01_invalid_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_mon02_invalid_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_mon03_invalid_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_mon04_invalid_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_mon05_invalid_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_mon06_invalid_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_mon07_invalid_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_mon08_invalid_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_mon09_invalid_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_mon10_invalid_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_mon11_invalid_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_mon12_invalid_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Rslt_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.Rslt_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Rslt_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABCP_JnlPatternReg p){
		p.Btn_open_MABCP1110.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MABCP1120.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_open_MABCP1130.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABCP_JnlPatternReg p){

	}

	/**
	 * [UPD]ステータスの[RsltAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RsltAll(MABCP_JnlPatternReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MABCP_JnlPatternReg p){

	}

	/**
	 * [SRCH]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Mst(MABCP_JnlPatternReg p){
		p.Mst_mst_set_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MABCP_JnlPatternReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_jnl_ptn_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_jnl_ptn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_jnl_seq.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Base(MABCP_JnlPatternReg p){

	}

	/**
	 * [SRCH]ステータスの[BaseHdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BaseHdr(MABCP_JnlPatternReg p){

	}

	/**
	 * [SRCH]ステータスの[BaseTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BaseTab(MABCP_JnlPatternReg p){

	}

	/**
	 * [SRCH]ステータスの[Base1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Base1(MABCP_JnlPatternReg p){

	}

	/**
	 * [SRCH]ステータスの[Base11]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Base11(MABCP_JnlPatternReg p){

	}

	/**
	 * [SRCH]ステータスの[Base12]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Base12(MABCP_JnlPatternReg p){

	}

	/**
	 * [SRCH]ステータスの[Base13]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Base13(MABCP_JnlPatternReg p){

	}

	/**
	 * [SRCH]ステータスの[Base2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Base2(MABCP_JnlPatternReg p){

	}

	/**
	 * [SRCH]ステータスの[Base3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Base3(MABCP_JnlPatternReg p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MABCP_JnlPatternReg p){
		p.Rslt_check.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_jnl_ptn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_jnl_ptn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_jnl_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_dpt_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_dpt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_trd_sml_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_ptn_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_ptn_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_sub_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_sub_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_bp_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_bp_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_ac_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_ac_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_amt_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_amt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_abs_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_abs_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_abstract.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_dr_sub_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_dr_bp_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_cr_dpt_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_dpt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_trd_sml_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_ptn_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_ptn_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_sub_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_sub_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_bp_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_bp_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_ac_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_ac_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_amt_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_amt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_abs_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_abs_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_abstract.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cr_sub_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_cr_bp_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_minus_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_carry_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Rslt_itm_jnl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_itm_jnl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_ac_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_ac_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_purc_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_purc_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_un_fix_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_un_fix_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_foreign_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_foreign_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_asst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_quality_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_quality_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_inv_loc_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_inv_loc_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_amt_sign_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_amt_sign_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_jnl_key1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_jnl_key2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_jnl_key3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_jnl_key4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_jnl_key5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_jnl_key6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_jnl_key7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_jnl_key8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_jnl_key9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_jnl_key10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_mon01_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_mon02_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_mon03_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_mon04_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_mon05_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_mon06_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_mon07_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_mon08_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_mon09_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_mon10_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_mon11_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_mon12_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Rslt_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Rslt_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MABCP_JnlPatternReg p){
		p.Btn_open_MABCP1110.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MABCP1120.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MABCP1130.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MABCP_JnlPatternReg p){

	}

	/**
	 * [SRCH]ステータスの[RsltAll]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RsltAll(MABCP_JnlPatternReg p){

	}

	/**
	 * [MOD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitMOD_ScreenOpe(MABCP_JnlPatternReg p){

	}

	/**
	 * [MOD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Mst(MABCP_JnlPatternReg p){
		p.Mst_mst_set_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);

	}

	/**
	 * [MOD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Cnd(MABCP_JnlPatternReg p){
		p.Cnd_ope_Group.putMode(p, MOD, MCMode.REQUIRED);
		p.Cnd_jnl_ptn_cd.putMode(p, MOD, MCMode.REQUIRED);
		p.Cnd_jnl_ptn_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Cnd_jnl_seq.putMode(p, MOD, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, MOD, MCMode.ENABLE);

	}

	/**
	 * [MOD]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Base(MABCP_JnlPatternReg p){

	}

	/**
	 * [MOD]ステータスの[BaseHdr]ブロックのモードの設定
	 */
	protected static void statusInitMOD_BaseHdr(MABCP_JnlPatternReg p){

	}

	/**
	 * [MOD]ステータスの[BaseTab]ブロックのモードの設定
	 */
	protected static void statusInitMOD_BaseTab(MABCP_JnlPatternReg p){

	}

	/**
	 * [MOD]ステータスの[Base1]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Base1(MABCP_JnlPatternReg p){

	}

	/**
	 * [MOD]ステータスの[Base11]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Base11(MABCP_JnlPatternReg p){

	}

	/**
	 * [MOD]ステータスの[Base12]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Base12(MABCP_JnlPatternReg p){

	}

	/**
	 * [MOD]ステータスの[Base13]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Base13(MABCP_JnlPatternReg p){

	}

	/**
	 * [MOD]ステータスの[Base2]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Base2(MABCP_JnlPatternReg p){

	}

	/**
	 * [MOD]ステータスの[Base3]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Base3(MABCP_JnlPatternReg p){

	}

	/**
	 * [MOD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Rslt(MABCP_JnlPatternReg p){
		p.Rslt_check.putMode(p, MOD, MCMode.INVISIBLE);
		p.Rslt_jnl_ptn_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_jnl_ptn_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_jnl_seq.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_memo1.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_memo2.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_memo3.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_del_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_dr_dpt_typ.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_dr_dpt_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_dr_trd_sml_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_dr_dpt_cd.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_dr_dpt_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_dr_ptn_typ.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_dr_ptn_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_dr_grp_cd.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_dr_grp_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_dr_ac_cd.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_dr_ac_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_dr_sub_ac_cd.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_dr_sub_ac_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_dr_bp_typ.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_dr_bp_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_dr_bp_cd.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_dr_bp_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_dr_ac_tax_cd.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_dr_ac_tax_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_dr_itm_typ.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_dr_itm_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_dr_amt_typ.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_dr_amt_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_dr_abs_typ.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_dr_abs_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_dr_abstract.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_dr_sub_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.Rslt_dr_bp_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.Rslt_cr_dpt_typ.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_cr_dpt_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_cr_trd_sml_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_cr_dpt_cd.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_cr_dpt_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_cr_ptn_typ.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_cr_ptn_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_cr_grp_cd.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_cr_grp_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_cr_ac_cd.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_cr_ac_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_cr_sub_ac_cd.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_cr_sub_ac_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_cr_bp_typ.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_cr_bp_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_cr_bp_cd.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_cr_bp_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_cr_ac_tax_cd.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_cr_ac_tax_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_cr_itm_typ.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_cr_itm_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_cr_amt_typ.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_cr_amt_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_cr_abs_typ.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_cr_abs_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_cr_abstract.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_cr_sub_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.Rslt_cr_bp_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.Rslt_minus_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_carry_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_itm_p_PPanel.putStatus(MOD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE);
		p.Rslt_itm_jnl_cd.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_itm_jnl_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_ac_rsn_cd.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_ac_rsn_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_purc_typ.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_purc_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_un_fix_typ.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_un_fix_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_foreign_typ.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_foreign_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_cur_cd.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_cur_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_asst_typ.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_asst_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_quality_typ.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_quality_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_inv_loc_typ.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_inv_loc_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_amt_sign_typ.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_amt_sign_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_jnl_key1.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_jnl_key2.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_jnl_key3.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_jnl_key4.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_jnl_key5.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_jnl_key6.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_jnl_key7.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_jnl_key8.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_jnl_key9.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_jnl_key10.putMode(p, MOD, MCMode.ENABLE);
		p.Rslt_mon01_invalid_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_mon02_invalid_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_mon03_invalid_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_mon04_invalid_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_mon05_invalid_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_mon06_invalid_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_mon07_invalid_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_mon08_invalid_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_mon09_invalid_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_mon10_invalid_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_mon11_invalid_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_mon12_invalid_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.Rslt_ins_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_ins_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_ins_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_ins_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_upd_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_upd_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_upd_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_upd_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_ins_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_upd_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_upd_srv_req_no.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_upd_cntr.putMode(p, MOD, MCMode.INVISIBLE);
		p.Rslt_del_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_del_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Rslt_del_ts.putMode(p, MOD, MCMode.READ_ONLY);

	}

	/**
	 * [MOD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Btn(MABCP_JnlPatternReg p){
		p.Btn_open_MABCP1110.putMode(p, MOD, MCMode.ENABLE);
		p.Btn_open_MABCP1120.putMode(p, MOD, MCMode.ENABLE);
		p.Btn_open_MABCP1130.putMode(p, MOD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, MOD, MCMode.ENABLE);
		p.Btn_del.putMode(p, MOD, MCMode.DISABLE);

	}

	/**
	 * [MOD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitMOD_EastBtn(MABCP_JnlPatternReg p){

	}

	/**
	 * [MOD]ステータスの[RsltAll]ブロックのモードの設定
	 */
	protected static void statusInitMOD_RsltAll(MABCP_JnlPatternReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABCP_JnlPatternReg p){

	}

	/**
	 * [DEL]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mst(MABCP_JnlPatternReg p){
		p.Mst_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABCP_JnlPatternReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_jnl_ptn_cd.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_jnl_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_jnl_seq.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Base(MABCP_JnlPatternReg p){

	}

	/**
	 * [DEL]ステータスの[BaseHdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BaseHdr(MABCP_JnlPatternReg p){

	}

	/**
	 * [DEL]ステータスの[BaseTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BaseTab(MABCP_JnlPatternReg p){

	}

	/**
	 * [DEL]ステータスの[Base1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Base1(MABCP_JnlPatternReg p){

	}

	/**
	 * [DEL]ステータスの[Base11]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Base11(MABCP_JnlPatternReg p){

	}

	/**
	 * [DEL]ステータスの[Base12]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Base12(MABCP_JnlPatternReg p){

	}

	/**
	 * [DEL]ステータスの[Base13]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Base13(MABCP_JnlPatternReg p){

	}

	/**
	 * [DEL]ステータスの[Base2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Base2(MABCP_JnlPatternReg p){

	}

	/**
	 * [DEL]ステータスの[Base3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Base3(MABCP_JnlPatternReg p){

	}

	/**
	 * [DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Rslt(MABCP_JnlPatternReg p){
		p.Rslt_check.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_jnl_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_jnl_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_jnl_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_dpt_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_dpt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_trd_sml_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_ptn_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_ptn_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_ac_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_ac_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_sub_ac_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_sub_ac_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_bp_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_bp_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_ac_tax_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_ac_tax_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_amt_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_amt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_abs_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_abs_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_abstract.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_dr_sub_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_dr_bp_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_cr_dpt_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_dpt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_trd_sml_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_ptn_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_ptn_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_ac_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_ac_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_sub_ac_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_sub_ac_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_bp_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_bp_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_ac_tax_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_ac_tax_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_amt_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_amt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_abs_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_abs_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_abstract.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cr_sub_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_cr_bp_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_minus_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_carry_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Rslt_itm_jnl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_itm_jnl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ac_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ac_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_purc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_purc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_un_fix_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_un_fix_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_foreign_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_foreign_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cur_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_cur_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_asst_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_asst_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_quality_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_quality_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_inv_loc_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_inv_loc_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_amt_sign_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_amt_sign_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_jnl_key1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_jnl_key2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_jnl_key3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_jnl_key4.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_jnl_key5.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_jnl_key6.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_jnl_key7.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_jnl_key8.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_jnl_key9.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_jnl_key10.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_mon01_invalid_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_mon02_invalid_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_mon03_invalid_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_mon04_invalid_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_mon05_invalid_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_mon06_invalid_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_mon07_invalid_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_mon08_invalid_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_mon09_invalid_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_mon10_invalid_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_mon11_invalid_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_mon12_invalid_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.Rslt_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Rslt_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABCP_JnlPatternReg p){
		p.Btn_open_MABCP1110.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MABCP1120.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_open_MABCP1130.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABCP_JnlPatternReg p){

	}

	/**
	 * [DEL]ステータスの[RsltAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RsltAll(MABCP_JnlPatternReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_JnlPatternReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_JnlPatternReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_JnlPatternReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_jnl_ptn_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_jnl_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_jnl_seq.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitREF_Base(MABCP_JnlPatternReg p){

	}

	/**
	 * [REF]ステータスの[BaseHdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_BaseHdr(MABCP_JnlPatternReg p){

	}

	/**
	 * [REF]ステータスの[BaseTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_BaseTab(MABCP_JnlPatternReg p){

	}

	/**
	 * [REF]ステータスの[Base1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Base1(MABCP_JnlPatternReg p){

	}

	/**
	 * [REF]ステータスの[Base11]ブロックのモードの設定
	 */
	protected static void statusInitREF_Base11(MABCP_JnlPatternReg p){

	}

	/**
	 * [REF]ステータスの[Base12]ブロックのモードの設定
	 */
	protected static void statusInitREF_Base12(MABCP_JnlPatternReg p){

	}

	/**
	 * [REF]ステータスの[Base13]ブロックのモードの設定
	 */
	protected static void statusInitREF_Base13(MABCP_JnlPatternReg p){

	}

	/**
	 * [REF]ステータスの[Base2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Base2(MABCP_JnlPatternReg p){

	}

	/**
	 * [REF]ステータスの[Base3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Base3(MABCP_JnlPatternReg p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MABCP_JnlPatternReg p){
		p.Rslt_check.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_jnl_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_jnl_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_jnl_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_dpt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_dpt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_trd_sml_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_ptn_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_ptn_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_sub_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_sub_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_bp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_bp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_ac_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_ac_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_amt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_amt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_abs_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_abs_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_abstract.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_dr_sub_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_dr_bp_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_cr_dpt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_dpt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_trd_sml_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_ptn_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_ptn_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_sub_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_sub_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_bp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_bp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_ac_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_ac_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_amt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_amt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_abs_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_abs_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_abstract.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cr_sub_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_cr_bp_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_minus_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_carry_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Rslt_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_ac_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_ac_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_purc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_purc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_un_fix_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_un_fix_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_foreign_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_foreign_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_asst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_quality_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_quality_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_inv_loc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_inv_loc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_amt_sign_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_amt_sign_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_jnl_key1.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_jnl_key2.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_jnl_key3.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_jnl_key4.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_jnl_key5.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_jnl_key6.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_jnl_key7.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_jnl_key8.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_jnl_key9.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_jnl_key10.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_mon01_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_mon02_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_mon03_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_mon04_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_mon05_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_mon06_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_mon07_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_mon08_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_mon09_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_mon10_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_mon11_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_mon12_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABCP_JnlPatternReg p){
		p.Btn_open_MABCP1110.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MABCP1120.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MABCP1130.putMode(p, REF, MCMode.ENABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABCP_JnlPatternReg p){

	}

	/**
	 * [REF]ステータスの[RsltAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_RsltAll(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX_U]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Mst(MABCP_JnlPatternReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MABCP_JnlPatternReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_jnl_ptn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_jnl_ptn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_jnl_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Base(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX_U]ステータスの[BaseHdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BaseHdr(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX_U]ステータスの[BaseTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BaseTab(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX_U]ステータスの[Base1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Base1(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX_U]ステータスの[Base11]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Base11(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX_U]ステータスの[Base12]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Base12(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX_U]ステータスの[Base13]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Base13(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX_U]ステータスの[Base2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Base2(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX_U]ステータスの[Base3]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Base3(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX_U]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Rslt(MABCP_JnlPatternReg p){
		p.Rslt_check.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_jnl_ptn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_jnl_ptn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_jnl_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_memo1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_memo2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_memo3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_del_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_dpt_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_dpt_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_trd_sml_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_ptn_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_ptn_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_ac_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_ac_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_sub_ac_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_sub_ac_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_bp_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_bp_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_bp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_bp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_ac_tax_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_ac_tax_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_itm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_itm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_amt_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_amt_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_abs_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_abs_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_abstract.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_dr_sub_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_dr_bp_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_cr_dpt_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_dpt_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_trd_sml_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_ptn_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_ptn_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_ac_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_ac_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_sub_ac_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_sub_ac_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_bp_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_bp_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_bp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_bp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_ac_tax_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_ac_tax_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_itm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_itm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_amt_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_amt_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_abs_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_abs_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_abstract.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cr_sub_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_cr_bp_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_minus_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_carry_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Rslt_itm_jnl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_itm_jnl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_ac_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_ac_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_purc_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_purc_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_un_fix_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_un_fix_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_foreign_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_foreign_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cur_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_cur_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_asst_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_asst_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_quality_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_quality_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_inv_loc_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_inv_loc_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_amt_sign_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_amt_sign_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_jnl_key1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_jnl_key2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_jnl_key3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_jnl_key4.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_jnl_key5.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_jnl_key6.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_jnl_key7.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_jnl_key8.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_jnl_key9.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_jnl_key10.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_mon01_invalid_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_mon02_invalid_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_mon03_invalid_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_mon04_invalid_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_mon05_invalid_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_mon06_invalid_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_mon07_invalid_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_mon08_invalid_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_mon09_invalid_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_mon10_invalid_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_mon11_invalid_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_mon12_invalid_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Rslt_del_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_del_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Rslt_del_ts.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MABCP_JnlPatternReg p){
		p.Btn_open_MABCP1110.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MABCP1120.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_open_MABCP1130.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX_U]ステータスの[RsltAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RsltAll(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABCP_JnlPatternReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_JnlPatternReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_jnl_ptn_cd.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_jnl_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_jnl_seq.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Base]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Base(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX]ステータスの[BaseHdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BaseHdr(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX]ステータスの[BaseTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BaseTab(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX]ステータスの[Base1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Base1(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX]ステータスの[Base11]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Base11(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX]ステータスの[Base12]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Base12(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX]ステータスの[Base13]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Base13(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX]ステータスの[Base2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Base2(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX]ステータスの[Base3]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Base3(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Rslt(MABCP_JnlPatternReg p){
		p.Rslt_check.putMode(p, FIX, MCMode.INVISIBLE);
		p.Rslt_jnl_ptn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_jnl_ptn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_jnl_seq.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_dpt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_dpt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_trd_sml_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_ptn_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_ptn_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_ac_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_ac_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_sub_ac_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_sub_ac_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_bp_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_bp_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_bp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_bp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_ac_tax_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_ac_tax_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_itm_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_itm_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_amt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_amt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_abs_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_abs_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_abstract.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_dr_sub_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.Rslt_dr_bp_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.Rslt_cr_dpt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_dpt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_trd_sml_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_ptn_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_ptn_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_ac_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_ac_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_sub_ac_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_sub_ac_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_bp_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_bp_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_bp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_bp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_ac_tax_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_ac_tax_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_itm_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_itm_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_amt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_amt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_abs_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_abs_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_abstract.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cr_sub_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.Rslt_cr_bp_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.Rslt_minus_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_carry_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Rslt_itm_jnl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_itm_jnl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_ac_rsn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_ac_rsn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_purc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_purc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_un_fix_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_un_fix_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_foreign_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_foreign_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cur_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_cur_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_asst_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_asst_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_quality_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_quality_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_inv_loc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_inv_loc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_amt_sign_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_amt_sign_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_jnl_key1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_jnl_key2.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_jnl_key3.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_jnl_key4.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_jnl_key5.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_jnl_key6.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_jnl_key7.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_jnl_key8.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_jnl_key9.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_jnl_key10.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_mon01_invalid_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_mon02_invalid_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_mon03_invalid_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_mon04_invalid_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_mon05_invalid_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_mon06_invalid_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_mon07_invalid_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_mon08_invalid_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_mon09_invalid_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_mon10_invalid_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_mon11_invalid_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_mon12_invalid_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.Rslt_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Rslt_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABCP_JnlPatternReg p){
		p.Btn_open_MABCP1110.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MABCP1120.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_open_MABCP1130.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABCP_JnlPatternReg p){

	}

	/**
	 * [FIX]ステータスの[RsltAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_RsltAll(MABCP_JnlPatternReg p){

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
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_jnl_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_jnl_ptn_cd.getListConfig().setPutter(getCnd_jnl_ptn_cd_ListPutter());
		Cnd_jnl_seq.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_jnl_seq.getListConfig().setPutter(getCnd_jnl_seq_ListPutter());
		Rslt_jnl_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_jnl_ptn_cd.getListConfig().setPutter(getRslt_jnl_ptn_cd_ListPutter());
		Rslt_dr_dpt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_dr_dpt_typ.getListConfig().setPutter(getRslt_dr_dpt_typ_ListPutter());
		Rslt_dr_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_dr_dpt_cd.getListConfig().setPutter(getRslt_dr_dpt_cd_ListPutter());
		Rslt_dr_ptn_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_dr_ptn_typ.getListConfig().setPutter(getRslt_dr_ptn_typ_ListPutter());
		Rslt_dr_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_dr_grp_cd.getListConfig().setPutter(getRslt_dr_grp_cd_ListPutter());
		Rslt_dr_ac_cd.getListConfig().setPutter(getRslt_dr_ac_cd_ListPutter());
		Rslt_dr_sub_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_dr_sub_ac_cd.getListConfig().setPutter(getRslt_dr_sub_ac_cd_ListPutter());
		Rslt_dr_bp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_dr_bp_typ.getListConfig().setPutter(getRslt_dr_bp_typ_ListPutter());
		Rslt_dr_bp_cd.getListConfig().setPutter(getRslt_dr_bp_cd_ListPutter());
		Rslt_dr_ac_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_dr_ac_tax_cd.getListConfig().setPutter(getRslt_dr_ac_tax_cd_ListPutter());
		Rslt_dr_itm_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_dr_itm_typ.getListConfig().setPutter(getRslt_dr_itm_typ_ListPutter());
		Rslt_dr_amt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_dr_amt_typ.getListConfig().setPutter(getRslt_dr_amt_typ_ListPutter());
		Rslt_dr_abs_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_dr_abs_typ.getListConfig().setPutter(getRslt_dr_abs_typ_ListPutter());
		Rslt_cr_dpt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_cr_dpt_typ.getListConfig().setPutter(getRslt_cr_dpt_typ_ListPutter());
		Rslt_cr_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_cr_dpt_cd.getListConfig().setPutter(getRslt_cr_dpt_cd_ListPutter());
		Rslt_cr_ptn_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_cr_ptn_typ.getListConfig().setPutter(getRslt_cr_ptn_typ_ListPutter());
		Rslt_cr_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_cr_grp_cd.getListConfig().setPutter(getRslt_cr_grp_cd_ListPutter());
		Rslt_cr_ac_cd.getListConfig().setPutter(getRslt_cr_ac_cd_ListPutter());
		Rslt_cr_sub_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_cr_sub_ac_cd.getListConfig().setPutter(getRslt_cr_sub_ac_cd_ListPutter());
		Rslt_cr_bp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_cr_bp_typ.getListConfig().setPutter(getRslt_cr_bp_typ_ListPutter());
		Rslt_cr_bp_cd.getListConfig().setPutter(getRslt_cr_bp_cd_ListPutter());
		Rslt_cr_ac_tax_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_cr_ac_tax_cd.getListConfig().setPutter(getRslt_cr_ac_tax_cd_ListPutter());
		Rslt_cr_itm_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_cr_itm_typ.getListConfig().setPutter(getRslt_cr_itm_typ_ListPutter());
		Rslt_cr_amt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_cr_amt_typ.getListConfig().setPutter(getRslt_cr_amt_typ_ListPutter());
		Rslt_cr_abs_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_cr_abs_typ.getListConfig().setPutter(getRslt_cr_abs_typ_ListPutter());
		Rslt_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getRslt_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Rslt_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getRslt_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Rslt_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getRslt_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Rslt_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getRslt_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Rslt_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_itm_jnl_cd.getListConfig().setPutter(getRslt_itm_jnl_cd_ListPutter());
		Rslt_ac_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_ac_rsn_cd.getListConfig().setPutter(getRslt_ac_rsn_cd_ListPutter());
		Rslt_purc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_purc_typ.getListConfig().setPutter(getRslt_purc_typ_ListPutter());
		Rslt_un_fix_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_un_fix_typ.getListConfig().setPutter(getRslt_un_fix_typ_ListPutter());
		Rslt_foreign_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_foreign_typ.getListConfig().setPutter(getRslt_foreign_typ_ListPutter());
		Rslt_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_cur_cd.getListConfig().setPutter(getRslt_cur_cd_ListPutter());
		Rslt_asst_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_asst_typ.getListConfig().setPutter(getRslt_asst_typ_ListPutter());
		Rslt_quality_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_quality_typ.getListConfig().setPutter(getRslt_quality_typ_ListPutter());
		Rslt_inv_loc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_inv_loc_typ.getListConfig().setPutter(getRslt_inv_loc_typ_ListPutter());
		Rslt_amt_sign_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Rslt_amt_sign_typ.getListConfig().setPutter(getRslt_amt_sign_typ_ListPutter());
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
	 * この画面を[SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCHStatus() {
		status = SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[MOD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setMODStatus() {
		status = MOD;
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
	 * この画面を[FIX_U]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_UStatus() {
		status = FIX_U;
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (MOD.equals(status)) {
			setMODStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
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
	 * [Cnd_jnl_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_jnl_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.JnlPtnBase");
		return lp;
	}
	 
	/**
	 * [Cnd_jnl_seq_ListPutter]の作成
	 */
	protected MCListPutter createCnd_jnl_seq_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.JnlPtnSeq");
		return lp;
	}
	 
	/**
	 * [Rslt_jnl_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_jnl_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.JnlPtnBase");
		return lp;
	}
	 
	/**
	 * [Rslt_dr_dpt_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dr_dpt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DptTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_dr_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dr_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcDpt");
		return lp;
	}
	 
	/**
	 * [Rslt_dr_ptn_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dr_ptn_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PtnTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_dr_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dr_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.JnlGrp");
		return lp;
	}
	 
	/**
	 * [Rslt_dr_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dr_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Account");
		return lp;
	}
	 
	/**
	 * [Rslt_dr_sub_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dr_sub_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SubAccount");
		return lp;
	}
	 
	/**
	 * [Rslt_dr_bp_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dr_bp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpSetTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_dr_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dr_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Rslt_dr_ac_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dr_ac_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcTax");
		return lp;
	}
	 
	/**
	 * [Rslt_dr_itm_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dr_itm_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSetTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_dr_amt_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dr_amt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AmtTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_dr_abs_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_dr_abs_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AbsTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_cr_dpt_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_cr_dpt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DptTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_cr_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_cr_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcDpt");
		return lp;
	}
	 
	/**
	 * [Rslt_cr_ptn_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_cr_ptn_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PtnTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_cr_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_cr_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.JnlGrp");
		return lp;
	}
	 
	/**
	 * [Rslt_cr_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_cr_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Account");
		return lp;
	}
	 
	/**
	 * [Rslt_cr_sub_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_cr_sub_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SubAccount");
		return lp;
	}
	 
	/**
	 * [Rslt_cr_bp_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_cr_bp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpSetTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_cr_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_cr_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Rslt_cr_ac_tax_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_cr_ac_tax_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcTax");
		return lp;
	}
	 
	/**
	 * [Rslt_cr_itm_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_cr_itm_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSetTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_cr_amt_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_cr_amt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AmtTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_cr_abs_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_cr_abs_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AbsTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Rslt_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Rslt_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Rslt_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Rslt_itm_jnl_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_itm_jnl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmJnl");
		return lp;
	}
	 
	/**
	 * [Rslt_ac_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_ac_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcRsn");
		return lp;
	}
	 
	/**
	 * [Rslt_purc_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_purc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_un_fix_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_un_fix_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.UnFixTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_foreign_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_foreign_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ForeignTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createRslt_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Rslt_asst_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_asst_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AsstTyp");
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
	 * [Rslt_inv_loc_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_inv_loc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InvLocTyp");
		return lp;
	}
	 
	/**
	 * [Rslt_amt_sign_typ_ListPutter]の作成
	 */
	protected MCListPutter createRslt_amt_sign_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AmtSignTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_jnl_ptn_cd) return getCnd_jnl_ptn_cd(row, info);
		if(combo == Cnd_jnl_seq) return getCnd_jnl_seq(row, info);
		if(combo == Rslt_jnl_ptn_cd) return getRslt_jnl_ptn_cd(row, info);
		if(combo == Rslt_dr_dpt_typ) return getRslt_dr_dpt_typ(row, info);
		if(combo == Rslt_dr_dpt_cd) return getRslt_dr_dpt_cd(row, info);
		if(combo == Rslt_dr_ptn_typ) return getRslt_dr_ptn_typ(row, info);
		if(combo == Rslt_dr_grp_cd) return getRslt_dr_grp_cd(row, info);
		if(combo == Rslt_dr_ac_cd) return getRslt_dr_ac_cd(row, info);
		if(combo == Rslt_dr_sub_ac_cd) return getRslt_dr_sub_ac_cd(row, info);
		if(combo == Rslt_dr_bp_typ) return getRslt_dr_bp_typ(row, info);
		if(combo == Rslt_dr_bp_cd) return getRslt_dr_bp_cd(row, info);
		if(combo == Rslt_dr_ac_tax_cd) return getRslt_dr_ac_tax_cd(row, info);
		if(combo == Rslt_dr_itm_typ) return getRslt_dr_itm_typ(row, info);
		if(combo == Rslt_dr_amt_typ) return getRslt_dr_amt_typ(row, info);
		if(combo == Rslt_dr_abs_typ) return getRslt_dr_abs_typ(row, info);
		if(combo == Rslt_cr_dpt_typ) return getRslt_cr_dpt_typ(row, info);
		if(combo == Rslt_cr_dpt_cd) return getRslt_cr_dpt_cd(row, info);
		if(combo == Rslt_cr_ptn_typ) return getRslt_cr_ptn_typ(row, info);
		if(combo == Rslt_cr_grp_cd) return getRslt_cr_grp_cd(row, info);
		if(combo == Rslt_cr_ac_cd) return getRslt_cr_ac_cd(row, info);
		if(combo == Rslt_cr_sub_ac_cd) return getRslt_cr_sub_ac_cd(row, info);
		if(combo == Rslt_cr_bp_typ) return getRslt_cr_bp_typ(row, info);
		if(combo == Rslt_cr_bp_cd) return getRslt_cr_bp_cd(row, info);
		if(combo == Rslt_cr_ac_tax_cd) return getRslt_cr_ac_tax_cd(row, info);
		if(combo == Rslt_cr_itm_typ) return getRslt_cr_itm_typ(row, info);
		if(combo == Rslt_cr_amt_typ) return getRslt_cr_amt_typ(row, info);
		if(combo == Rslt_cr_abs_typ) return getRslt_cr_abs_typ(row, info);
		if(combo == Rslt_itm_p_PPanel.Itm_itm_cd) return getRslt_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Rslt_itm_p_PPanel.Itm_itm_sub1) return getRslt_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Rslt_itm_p_PPanel.Itm_itm_sub2) return getRslt_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Rslt_itm_p_PPanel.Itm_itm_sub3) return getRslt_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Rslt_itm_jnl_cd) return getRslt_itm_jnl_cd(row, info);
		if(combo == Rslt_ac_rsn_cd) return getRslt_ac_rsn_cd(row, info);
		if(combo == Rslt_purc_typ) return getRslt_purc_typ(row, info);
		if(combo == Rslt_un_fix_typ) return getRslt_un_fix_typ(row, info);
		if(combo == Rslt_foreign_typ) return getRslt_foreign_typ(row, info);
		if(combo == Rslt_cur_cd) return getRslt_cur_cd(row, info);
		if(combo == Rslt_asst_typ) return getRslt_asst_typ(row, info);
		if(combo == Rslt_quality_typ) return getRslt_quality_typ(row, info);
		if(combo == Rslt_inv_loc_typ) return getRslt_inv_loc_typ(row, info);
		if(combo == Rslt_amt_sign_typ) return getRslt_amt_sign_typ(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch) doCnd_srch(info);
		else if (ap == Btn_open_MABCP1110) doBtn_open_MABCP1110(info);
		else if (ap == Btn_open_MABCP1120) doBtn_open_MABCP1120(info);
		else if (ap == Btn_open_MABCP1130) doBtn_open_MABCP1130(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABCP1110]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABCP1110(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABCP1120]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABCP1120(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABCP1130]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABCP1130(MCEventInfo info);

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
		if (vc == BaseTabTab) return doBaseTab_VC(info);
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_jnl_ptn_cd) return doCnd_jnl_ptn_cd_VC(info);
		if (vc == Cnd_jnl_ptn_nm) return doCnd_jnl_ptn_nm_VC(info);
		if (vc == Cnd_jnl_seq) return doCnd_jnl_seq_VC(info);
		if (vc == Rslt_check) return doRslt_check_VC(info);
		if (vc == Rslt_jnl_ptn_cd) return doRslt_jnl_ptn_cd_VC(info);
		if (vc == Rslt_jnl_ptn_nm) return doRslt_jnl_ptn_nm_VC(info);
		if (vc == Rslt_jnl_seq) return doRslt_jnl_seq_VC(info);
		if (vc == Rslt_memo1) return doRslt_memo1_VC(info);
		if (vc == Rslt_memo2) return doRslt_memo2_VC(info);
		if (vc == Rslt_memo3) return doRslt_memo3_VC(info);
		if (vc == Rslt_del_flg) return doRslt_del_flg_VC(info);
		if (vc == Rslt_dr_dpt_typ) return doRslt_dr_dpt_typ_VC(info);
		if (vc == Rslt_dr_dpt_typ_nm) return doRslt_dr_dpt_typ_nm_VC(info);
		if (vc == Rslt_dr_trd_sml_flg) return doRslt_dr_trd_sml_flg_VC(info);
		if (vc == Rslt_dr_dpt_cd) return doRslt_dr_dpt_cd_VC(info);
		if (vc == Rslt_dr_dpt_nm) return doRslt_dr_dpt_nm_VC(info);
		if (vc == Rslt_dr_ptn_typ) return doRslt_dr_ptn_typ_VC(info);
		if (vc == Rslt_dr_ptn_typ_nm) return doRslt_dr_ptn_typ_nm_VC(info);
		if (vc == Rslt_dr_grp_cd) return doRslt_dr_grp_cd_VC(info);
		if (vc == Rslt_dr_grp_nm) return doRslt_dr_grp_nm_VC(info);
		if (vc == Rslt_dr_ac_cd) return doRslt_dr_ac_cd_VC(info);
		if (vc == Rslt_dr_ac_nm) return doRslt_dr_ac_nm_VC(info);
		if (vc == Rslt_dr_sub_ac_cd) return doRslt_dr_sub_ac_cd_VC(info);
		if (vc == Rslt_dr_sub_ac_nm) return doRslt_dr_sub_ac_nm_VC(info);
		if (vc == Rslt_dr_bp_typ) return doRslt_dr_bp_typ_VC(info);
		if (vc == Rslt_dr_bp_typ_nm) return doRslt_dr_bp_typ_nm_VC(info);
		if (vc == Rslt_dr_bp_cd) return doRslt_dr_bp_cd_VC(info);
		if (vc == Rslt_dr_bp_nm) return doRslt_dr_bp_nm_VC(info);
		if (vc == Rslt_dr_ac_tax_cd) return doRslt_dr_ac_tax_cd_VC(info);
		if (vc == Rslt_dr_ac_tax_nm) return doRslt_dr_ac_tax_nm_VC(info);
		if (vc == Rslt_dr_itm_typ) return doRslt_dr_itm_typ_VC(info);
		if (vc == Rslt_dr_itm_typ_nm) return doRslt_dr_itm_typ_nm_VC(info);
		if (vc == Rslt_dr_amt_typ) return doRslt_dr_amt_typ_VC(info);
		if (vc == Rslt_dr_amt_typ_nm) return doRslt_dr_amt_typ_nm_VC(info);
		if (vc == Rslt_dr_abs_typ) return doRslt_dr_abs_typ_VC(info);
		if (vc == Rslt_dr_abs_typ_nm) return doRslt_dr_abs_typ_nm_VC(info);
		if (vc == Rslt_dr_abstract) return doRslt_dr_abstract_VC(info);
		if (vc == Rslt_dr_sub_flg) return doRslt_dr_sub_flg_VC(info);
		if (vc == Rslt_dr_bp_flg) return doRslt_dr_bp_flg_VC(info);
		if (vc == Rslt_cr_dpt_typ) return doRslt_cr_dpt_typ_VC(info);
		if (vc == Rslt_cr_dpt_typ_nm) return doRslt_cr_dpt_typ_nm_VC(info);
		if (vc == Rslt_cr_trd_sml_flg) return doRslt_cr_trd_sml_flg_VC(info);
		if (vc == Rslt_cr_dpt_cd) return doRslt_cr_dpt_cd_VC(info);
		if (vc == Rslt_cr_dpt_nm) return doRslt_cr_dpt_nm_VC(info);
		if (vc == Rslt_cr_ptn_typ) return doRslt_cr_ptn_typ_VC(info);
		if (vc == Rslt_cr_ptn_typ_nm) return doRslt_cr_ptn_typ_nm_VC(info);
		if (vc == Rslt_cr_grp_cd) return doRslt_cr_grp_cd_VC(info);
		if (vc == Rslt_cr_grp_nm) return doRslt_cr_grp_nm_VC(info);
		if (vc == Rslt_cr_ac_cd) return doRslt_cr_ac_cd_VC(info);
		if (vc == Rslt_cr_ac_nm) return doRslt_cr_ac_nm_VC(info);
		if (vc == Rslt_cr_sub_ac_cd) return doRslt_cr_sub_ac_cd_VC(info);
		if (vc == Rslt_cr_sub_ac_nm) return doRslt_cr_sub_ac_nm_VC(info);
		if (vc == Rslt_cr_bp_typ) return doRslt_cr_bp_typ_VC(info);
		if (vc == Rslt_cr_bp_typ_nm) return doRslt_cr_bp_typ_nm_VC(info);
		if (vc == Rslt_cr_bp_cd) return doRslt_cr_bp_cd_VC(info);
		if (vc == Rslt_cr_bp_nm) return doRslt_cr_bp_nm_VC(info);
		if (vc == Rslt_cr_ac_tax_cd) return doRslt_cr_ac_tax_cd_VC(info);
		if (vc == Rslt_cr_ac_tax_nm) return doRslt_cr_ac_tax_nm_VC(info);
		if (vc == Rslt_cr_itm_typ) return doRslt_cr_itm_typ_VC(info);
		if (vc == Rslt_cr_itm_typ_nm) return doRslt_cr_itm_typ_nm_VC(info);
		if (vc == Rslt_cr_amt_typ) return doRslt_cr_amt_typ_VC(info);
		if (vc == Rslt_cr_amt_typ_nm) return doRslt_cr_amt_typ_nm_VC(info);
		if (vc == Rslt_cr_abs_typ) return doRslt_cr_abs_typ_VC(info);
		if (vc == Rslt_cr_abs_typ_nm) return doRslt_cr_abs_typ_nm_VC(info);
		if (vc == Rslt_cr_abstract) return doRslt_cr_abstract_VC(info);
		if (vc == Rslt_cr_sub_flg) return doRslt_cr_sub_flg_VC(info);
		if (vc == Rslt_cr_bp_flg) return doRslt_cr_bp_flg_VC(info);
		if (vc == Rslt_minus_flg) return doRslt_minus_flg_VC(info);
		if (vc == Rslt_carry_flg) return doRslt_carry_flg_VC(info);
		if (vc == Rslt_itm_jnl_cd) return doRslt_itm_jnl_cd_VC(info);
		if (vc == Rslt_itm_jnl_nm) return doRslt_itm_jnl_nm_VC(info);
		if (vc == Rslt_ac_rsn_cd) return doRslt_ac_rsn_cd_VC(info);
		if (vc == Rslt_ac_rsn_nm) return doRslt_ac_rsn_nm_VC(info);
		if (vc == Rslt_purc_typ) return doRslt_purc_typ_VC(info);
		if (vc == Rslt_purc_typ_nm) return doRslt_purc_typ_nm_VC(info);
		if (vc == Rslt_un_fix_typ) return doRslt_un_fix_typ_VC(info);
		if (vc == Rslt_un_fix_typ_nm) return doRslt_un_fix_typ_nm_VC(info);
		if (vc == Rslt_foreign_typ) return doRslt_foreign_typ_VC(info);
		if (vc == Rslt_foreign_typ_nm) return doRslt_foreign_typ_nm_VC(info);
		if (vc == Rslt_cur_cd) return doRslt_cur_cd_VC(info);
		if (vc == Rslt_cur_nm) return doRslt_cur_nm_VC(info);
		if (vc == Rslt_asst_typ) return doRslt_asst_typ_VC(info);
		if (vc == Rslt_asst_typ_nm) return doRslt_asst_typ_nm_VC(info);
		if (vc == Rslt_quality_typ) return doRslt_quality_typ_VC(info);
		if (vc == Rslt_quality_typ_nm) return doRslt_quality_typ_nm_VC(info);
		if (vc == Rslt_inv_loc_typ) return doRslt_inv_loc_typ_VC(info);
		if (vc == Rslt_inv_loc_typ_nm) return doRslt_inv_loc_typ_nm_VC(info);
		if (vc == Rslt_amt_sign_typ) return doRslt_amt_sign_typ_VC(info);
		if (vc == Rslt_amt_sign_typ_nm) return doRslt_amt_sign_typ_nm_VC(info);
		if (vc == Rslt_jnl_key1) return doRslt_jnl_key1_VC(info);
		if (vc == Rslt_jnl_key2) return doRslt_jnl_key2_VC(info);
		if (vc == Rslt_jnl_key3) return doRslt_jnl_key3_VC(info);
		if (vc == Rslt_jnl_key4) return doRslt_jnl_key4_VC(info);
		if (vc == Rslt_jnl_key5) return doRslt_jnl_key5_VC(info);
		if (vc == Rslt_jnl_key6) return doRslt_jnl_key6_VC(info);
		if (vc == Rslt_jnl_key7) return doRslt_jnl_key7_VC(info);
		if (vc == Rslt_jnl_key8) return doRslt_jnl_key8_VC(info);
		if (vc == Rslt_jnl_key9) return doRslt_jnl_key9_VC(info);
		if (vc == Rslt_jnl_key10) return doRslt_jnl_key10_VC(info);
		if (vc == Rslt_mon01_invalid_flg) return doRslt_mon01_invalid_flg_VC(info);
		if (vc == Rslt_mon02_invalid_flg) return doRslt_mon02_invalid_flg_VC(info);
		if (vc == Rslt_mon03_invalid_flg) return doRslt_mon03_invalid_flg_VC(info);
		if (vc == Rslt_mon04_invalid_flg) return doRslt_mon04_invalid_flg_VC(info);
		if (vc == Rslt_mon05_invalid_flg) return doRslt_mon05_invalid_flg_VC(info);
		if (vc == Rslt_mon06_invalid_flg) return doRslt_mon06_invalid_flg_VC(info);
		if (vc == Rslt_mon07_invalid_flg) return doRslt_mon07_invalid_flg_VC(info);
		if (vc == Rslt_mon08_invalid_flg) return doRslt_mon08_invalid_flg_VC(info);
		if (vc == Rslt_mon09_invalid_flg) return doRslt_mon09_invalid_flg_VC(info);
		if (vc == Rslt_mon10_invalid_flg) return doRslt_mon10_invalid_flg_VC(info);
		if (vc == Rslt_mon11_invalid_flg) return doRslt_mon11_invalid_flg_VC(info);
		if (vc == Rslt_mon12_invalid_flg) return doRslt_mon12_invalid_flg_VC(info);
		if (vc == Rslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == Rslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == Rslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == Rslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == Rslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == Rslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == Rslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == Rslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == Rslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == Rslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == Rslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
		if (vc == Rslt_upd_cntr) return doRslt_upd_cntr_VC(info);
		if (vc == Rslt_del_usr_id) return doRslt_del_usr_id_VC(info);
		if (vc == Rslt_del_usr_nm) return doRslt_del_usr_nm_VC(info);
		if (vc == Rslt_del_ts) return doRslt_del_ts_VC(info);
		if (vc == Btn_dr_typ_Group) return doBtn_dr_typ_VC(info);
		return true;
	}

	/**
	 * [BaseTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBaseTab_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[jnl_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_jnl_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[jnl_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_jnl_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[jnl_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_jnl_seq_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[jnl_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_dpt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_dpt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_dpt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_dpt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_trd_sml_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_trd_sml_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_ptn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_ptn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_sub_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_sub_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_sub_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_sub_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_bp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_bp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_bp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_bp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_ac_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_ac_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_ac_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_ac_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_amt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_amt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_amt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_amt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_abs_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_abs_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_abs_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_abs_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_abstract]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_abstract_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_sub_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_sub_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dr_bp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dr_bp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_dpt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_dpt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_dpt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_dpt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_trd_sml_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_trd_sml_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_ptn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_ptn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_sub_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_sub_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_sub_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_sub_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_bp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_bp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_bp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_bp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_ac_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_ac_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_ac_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_ac_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_amt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_amt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_amt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_amt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_abs_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_abs_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_abs_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_abs_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_abstract]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_abstract_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_sub_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_sub_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cr_bp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cr_bp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[minus_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_minus_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[carry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_carry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[un_fix_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_un_fix_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[un_fix_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_un_fix_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[foreign_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_foreign_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[foreign_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_foreign_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asst_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[inv_loc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inv_loc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inv_loc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inv_loc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt_sign_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt_sign_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[amt_sign_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_amt_sign_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_key1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_key1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_key2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_key2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_key3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_key3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_key4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_key4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_key5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_key5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_key6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_key6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_key7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_key7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_key8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_key8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_key9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_key9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_key10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_key10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mon01_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mon01_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mon02_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mon02_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mon03_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mon03_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mon04_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mon04_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mon05_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mon05_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mon06_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mon06_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mon07_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mon07_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mon08_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mon08_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mon09_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mon09_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mon10_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mon10_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mon11_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mon11_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mon12_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mon12_invalid_flg_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_ts_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[dr_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_dr_typ_VC(MCEventInfo info){
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
		if (nc == BaseTabTab) doBaseTab_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_jnl_ptn_cd) doCnd_jnl_ptn_cd_NC(info);
		else if (nc == Cnd_jnl_ptn_nm) doCnd_jnl_ptn_nm_NC(info);
		else if (nc == Cnd_jnl_seq) doCnd_jnl_seq_NC(info);
		else if (nc == Rslt_check) doRslt_check_NC(info);
		else if (nc == Rslt_jnl_ptn_cd) doRslt_jnl_ptn_cd_NC(info);
		else if (nc == Rslt_jnl_ptn_nm) doRslt_jnl_ptn_nm_NC(info);
		else if (nc == Rslt_jnl_seq) doRslt_jnl_seq_NC(info);
		else if (nc == Rslt_memo1) doRslt_memo1_NC(info);
		else if (nc == Rslt_memo2) doRslt_memo2_NC(info);
		else if (nc == Rslt_memo3) doRslt_memo3_NC(info);
		else if (nc == Rslt_del_flg) doRslt_del_flg_NC(info);
		else if (nc == Rslt_dr_dpt_typ) doRslt_dr_dpt_typ_NC(info);
		else if (nc == Rslt_dr_dpt_typ_nm) doRslt_dr_dpt_typ_nm_NC(info);
		else if (nc == Rslt_dr_trd_sml_flg) doRslt_dr_trd_sml_flg_NC(info);
		else if (nc == Rslt_dr_dpt_cd) doRslt_dr_dpt_cd_NC(info);
		else if (nc == Rslt_dr_dpt_nm) doRslt_dr_dpt_nm_NC(info);
		else if (nc == Rslt_dr_ptn_typ) doRslt_dr_ptn_typ_NC(info);
		else if (nc == Rslt_dr_ptn_typ_nm) doRslt_dr_ptn_typ_nm_NC(info);
		else if (nc == Rslt_dr_grp_cd) doRslt_dr_grp_cd_NC(info);
		else if (nc == Rslt_dr_grp_nm) doRslt_dr_grp_nm_NC(info);
		else if (nc == Rslt_dr_ac_cd) doRslt_dr_ac_cd_NC(info);
		else if (nc == Rslt_dr_ac_nm) doRslt_dr_ac_nm_NC(info);
		else if (nc == Rslt_dr_sub_ac_cd) doRslt_dr_sub_ac_cd_NC(info);
		else if (nc == Rslt_dr_sub_ac_nm) doRslt_dr_sub_ac_nm_NC(info);
		else if (nc == Rslt_dr_bp_typ) doRslt_dr_bp_typ_NC(info);
		else if (nc == Rslt_dr_bp_typ_nm) doRslt_dr_bp_typ_nm_NC(info);
		else if (nc == Rslt_dr_bp_cd) doRslt_dr_bp_cd_NC(info);
		else if (nc == Rslt_dr_bp_nm) doRslt_dr_bp_nm_NC(info);
		else if (nc == Rslt_dr_ac_tax_cd) doRslt_dr_ac_tax_cd_NC(info);
		else if (nc == Rslt_dr_ac_tax_nm) doRslt_dr_ac_tax_nm_NC(info);
		else if (nc == Rslt_dr_itm_typ) doRslt_dr_itm_typ_NC(info);
		else if (nc == Rslt_dr_itm_typ_nm) doRslt_dr_itm_typ_nm_NC(info);
		else if (nc == Rslt_dr_amt_typ) doRslt_dr_amt_typ_NC(info);
		else if (nc == Rslt_dr_amt_typ_nm) doRslt_dr_amt_typ_nm_NC(info);
		else if (nc == Rslt_dr_abs_typ) doRslt_dr_abs_typ_NC(info);
		else if (nc == Rslt_dr_abs_typ_nm) doRslt_dr_abs_typ_nm_NC(info);
		else if (nc == Rslt_dr_abstract) doRslt_dr_abstract_NC(info);
		else if (nc == Rslt_dr_sub_flg) doRslt_dr_sub_flg_NC(info);
		else if (nc == Rslt_dr_bp_flg) doRslt_dr_bp_flg_NC(info);
		else if (nc == Rslt_cr_dpt_typ) doRslt_cr_dpt_typ_NC(info);
		else if (nc == Rslt_cr_dpt_typ_nm) doRslt_cr_dpt_typ_nm_NC(info);
		else if (nc == Rslt_cr_trd_sml_flg) doRslt_cr_trd_sml_flg_NC(info);
		else if (nc == Rslt_cr_dpt_cd) doRslt_cr_dpt_cd_NC(info);
		else if (nc == Rslt_cr_dpt_nm) doRslt_cr_dpt_nm_NC(info);
		else if (nc == Rslt_cr_ptn_typ) doRslt_cr_ptn_typ_NC(info);
		else if (nc == Rslt_cr_ptn_typ_nm) doRslt_cr_ptn_typ_nm_NC(info);
		else if (nc == Rslt_cr_grp_cd) doRslt_cr_grp_cd_NC(info);
		else if (nc == Rslt_cr_grp_nm) doRslt_cr_grp_nm_NC(info);
		else if (nc == Rslt_cr_ac_cd) doRslt_cr_ac_cd_NC(info);
		else if (nc == Rslt_cr_ac_nm) doRslt_cr_ac_nm_NC(info);
		else if (nc == Rslt_cr_sub_ac_cd) doRslt_cr_sub_ac_cd_NC(info);
		else if (nc == Rslt_cr_sub_ac_nm) doRslt_cr_sub_ac_nm_NC(info);
		else if (nc == Rslt_cr_bp_typ) doRslt_cr_bp_typ_NC(info);
		else if (nc == Rslt_cr_bp_typ_nm) doRslt_cr_bp_typ_nm_NC(info);
		else if (nc == Rslt_cr_bp_cd) doRslt_cr_bp_cd_NC(info);
		else if (nc == Rslt_cr_bp_nm) doRslt_cr_bp_nm_NC(info);
		else if (nc == Rslt_cr_ac_tax_cd) doRslt_cr_ac_tax_cd_NC(info);
		else if (nc == Rslt_cr_ac_tax_nm) doRslt_cr_ac_tax_nm_NC(info);
		else if (nc == Rslt_cr_itm_typ) doRslt_cr_itm_typ_NC(info);
		else if (nc == Rslt_cr_itm_typ_nm) doRslt_cr_itm_typ_nm_NC(info);
		else if (nc == Rslt_cr_amt_typ) doRslt_cr_amt_typ_NC(info);
		else if (nc == Rslt_cr_amt_typ_nm) doRslt_cr_amt_typ_nm_NC(info);
		else if (nc == Rslt_cr_abs_typ) doRslt_cr_abs_typ_NC(info);
		else if (nc == Rslt_cr_abs_typ_nm) doRslt_cr_abs_typ_nm_NC(info);
		else if (nc == Rslt_cr_abstract) doRslt_cr_abstract_NC(info);
		else if (nc == Rslt_cr_sub_flg) doRslt_cr_sub_flg_NC(info);
		else if (nc == Rslt_cr_bp_flg) doRslt_cr_bp_flg_NC(info);
		else if (nc == Rslt_minus_flg) doRslt_minus_flg_NC(info);
		else if (nc == Rslt_carry_flg) doRslt_carry_flg_NC(info);
		else if (nc == Rslt_itm_jnl_cd) doRslt_itm_jnl_cd_NC(info);
		else if (nc == Rslt_itm_jnl_nm) doRslt_itm_jnl_nm_NC(info);
		else if (nc == Rslt_ac_rsn_cd) doRslt_ac_rsn_cd_NC(info);
		else if (nc == Rslt_ac_rsn_nm) doRslt_ac_rsn_nm_NC(info);
		else if (nc == Rslt_purc_typ) doRslt_purc_typ_NC(info);
		else if (nc == Rslt_purc_typ_nm) doRslt_purc_typ_nm_NC(info);
		else if (nc == Rslt_un_fix_typ) doRslt_un_fix_typ_NC(info);
		else if (nc == Rslt_un_fix_typ_nm) doRslt_un_fix_typ_nm_NC(info);
		else if (nc == Rslt_foreign_typ) doRslt_foreign_typ_NC(info);
		else if (nc == Rslt_foreign_typ_nm) doRslt_foreign_typ_nm_NC(info);
		else if (nc == Rslt_cur_cd) doRslt_cur_cd_NC(info);
		else if (nc == Rslt_cur_nm) doRslt_cur_nm_NC(info);
		else if (nc == Rslt_asst_typ) doRslt_asst_typ_NC(info);
		else if (nc == Rslt_asst_typ_nm) doRslt_asst_typ_nm_NC(info);
		else if (nc == Rslt_quality_typ) doRslt_quality_typ_NC(info);
		else if (nc == Rslt_quality_typ_nm) doRslt_quality_typ_nm_NC(info);
		else if (nc == Rslt_inv_loc_typ) doRslt_inv_loc_typ_NC(info);
		else if (nc == Rslt_inv_loc_typ_nm) doRslt_inv_loc_typ_nm_NC(info);
		else if (nc == Rslt_amt_sign_typ) doRslt_amt_sign_typ_NC(info);
		else if (nc == Rslt_amt_sign_typ_nm) doRslt_amt_sign_typ_nm_NC(info);
		else if (nc == Rslt_jnl_key1) doRslt_jnl_key1_NC(info);
		else if (nc == Rslt_jnl_key2) doRslt_jnl_key2_NC(info);
		else if (nc == Rslt_jnl_key3) doRslt_jnl_key3_NC(info);
		else if (nc == Rslt_jnl_key4) doRslt_jnl_key4_NC(info);
		else if (nc == Rslt_jnl_key5) doRslt_jnl_key5_NC(info);
		else if (nc == Rslt_jnl_key6) doRslt_jnl_key6_NC(info);
		else if (nc == Rslt_jnl_key7) doRslt_jnl_key7_NC(info);
		else if (nc == Rslt_jnl_key8) doRslt_jnl_key8_NC(info);
		else if (nc == Rslt_jnl_key9) doRslt_jnl_key9_NC(info);
		else if (nc == Rslt_jnl_key10) doRslt_jnl_key10_NC(info);
		else if (nc == Rslt_mon01_invalid_flg) doRslt_mon01_invalid_flg_NC(info);
		else if (nc == Rslt_mon02_invalid_flg) doRslt_mon02_invalid_flg_NC(info);
		else if (nc == Rslt_mon03_invalid_flg) doRslt_mon03_invalid_flg_NC(info);
		else if (nc == Rslt_mon04_invalid_flg) doRslt_mon04_invalid_flg_NC(info);
		else if (nc == Rslt_mon05_invalid_flg) doRslt_mon05_invalid_flg_NC(info);
		else if (nc == Rslt_mon06_invalid_flg) doRslt_mon06_invalid_flg_NC(info);
		else if (nc == Rslt_mon07_invalid_flg) doRslt_mon07_invalid_flg_NC(info);
		else if (nc == Rslt_mon08_invalid_flg) doRslt_mon08_invalid_flg_NC(info);
		else if (nc == Rslt_mon09_invalid_flg) doRslt_mon09_invalid_flg_NC(info);
		else if (nc == Rslt_mon10_invalid_flg) doRslt_mon10_invalid_flg_NC(info);
		else if (nc == Rslt_mon11_invalid_flg) doRslt_mon11_invalid_flg_NC(info);
		else if (nc == Rslt_mon12_invalid_flg) doRslt_mon12_invalid_flg_NC(info);
		else if (nc == Rslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == Rslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == Rslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == Rslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == Rslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == Rslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == Rslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == Rslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == Rslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == Rslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == Rslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
		else if (nc == Rslt_upd_cntr) doRslt_upd_cntr_NC(info);
		else if (nc == Rslt_del_usr_id) doRslt_del_usr_id_NC(info);
		else if (nc == Rslt_del_usr_nm) doRslt_del_usr_nm_NC(info);
		else if (nc == Rslt_del_ts) doRslt_del_ts_NC(info);
		else if (nc == Btn_dr_typ_Group) doBtn_dr_typ_NC(info);
	}

	/**
	 * [BaseTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBaseTab_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[jnl_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_dpt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_dpt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_dpt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_dpt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_trd_sml_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_trd_sml_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ptn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ptn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_sub_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_sub_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_sub_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_sub_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_bp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_bp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_bp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_bp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ac_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ac_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ac_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ac_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_amt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_amt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_amt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_amt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_abs_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_abs_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_abs_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_abs_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_abstract]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_abstract_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_sub_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_sub_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_bp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_bp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_dpt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_dpt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_dpt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_dpt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_trd_sml_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_trd_sml_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ptn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ptn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_sub_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_sub_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_sub_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_sub_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_bp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_bp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_bp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_bp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ac_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ac_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ac_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ac_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_amt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_amt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_amt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_amt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_abs_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_abs_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_abs_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_abs_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_abstract]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_abstract_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_sub_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_sub_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_bp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_bp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[minus_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_minus_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[carry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_carry_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[un_fix_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_un_fix_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[un_fix_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_un_fix_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[inv_loc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inv_loc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inv_loc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inv_loc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_sign_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_sign_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_sign_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_sign_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon01_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon01_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon02_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon02_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon03_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon03_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon04_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon04_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon05_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon05_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon06_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon06_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon07_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon07_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon08_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon08_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon09_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon09_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon10_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon10_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon11_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon11_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon12_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon12_invalid_flg_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[dr_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_dr_typ_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == BaseTabTab) doBaseTab_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_jnl_ptn_cd) doCnd_jnl_ptn_cd_NE(info);
		else if (ne == Cnd_jnl_ptn_nm) doCnd_jnl_ptn_nm_NE(info);
		else if (ne == Cnd_jnl_seq) doCnd_jnl_seq_NE(info);
		else if (ne == Rslt_check) doRslt_check_NE(info);
		else if (ne == Rslt_jnl_ptn_cd) doRslt_jnl_ptn_cd_NE(info);
		else if (ne == Rslt_jnl_ptn_nm) doRslt_jnl_ptn_nm_NE(info);
		else if (ne == Rslt_jnl_seq) doRslt_jnl_seq_NE(info);
		else if (ne == Rslt_memo1) doRslt_memo1_NE(info);
		else if (ne == Rslt_memo2) doRslt_memo2_NE(info);
		else if (ne == Rslt_memo3) doRslt_memo3_NE(info);
		else if (ne == Rslt_del_flg) doRslt_del_flg_NE(info);
		else if (ne == Rslt_dr_dpt_typ) doRslt_dr_dpt_typ_NE(info);
		else if (ne == Rslt_dr_dpt_typ_nm) doRslt_dr_dpt_typ_nm_NE(info);
		else if (ne == Rslt_dr_trd_sml_flg) doRslt_dr_trd_sml_flg_NE(info);
		else if (ne == Rslt_dr_dpt_cd) doRslt_dr_dpt_cd_NE(info);
		else if (ne == Rslt_dr_dpt_nm) doRslt_dr_dpt_nm_NE(info);
		else if (ne == Rslt_dr_ptn_typ) doRslt_dr_ptn_typ_NE(info);
		else if (ne == Rslt_dr_ptn_typ_nm) doRslt_dr_ptn_typ_nm_NE(info);
		else if (ne == Rslt_dr_grp_cd) doRslt_dr_grp_cd_NE(info);
		else if (ne == Rslt_dr_grp_nm) doRslt_dr_grp_nm_NE(info);
		else if (ne == Rslt_dr_ac_cd) doRslt_dr_ac_cd_NE(info);
		else if (ne == Rslt_dr_ac_nm) doRslt_dr_ac_nm_NE(info);
		else if (ne == Rslt_dr_sub_ac_cd) doRslt_dr_sub_ac_cd_NE(info);
		else if (ne == Rslt_dr_sub_ac_nm) doRslt_dr_sub_ac_nm_NE(info);
		else if (ne == Rslt_dr_bp_typ) doRslt_dr_bp_typ_NE(info);
		else if (ne == Rslt_dr_bp_typ_nm) doRslt_dr_bp_typ_nm_NE(info);
		else if (ne == Rslt_dr_bp_cd) doRslt_dr_bp_cd_NE(info);
		else if (ne == Rslt_dr_bp_nm) doRslt_dr_bp_nm_NE(info);
		else if (ne == Rslt_dr_ac_tax_cd) doRslt_dr_ac_tax_cd_NE(info);
		else if (ne == Rslt_dr_ac_tax_nm) doRslt_dr_ac_tax_nm_NE(info);
		else if (ne == Rslt_dr_itm_typ) doRslt_dr_itm_typ_NE(info);
		else if (ne == Rslt_dr_itm_typ_nm) doRslt_dr_itm_typ_nm_NE(info);
		else if (ne == Rslt_dr_amt_typ) doRslt_dr_amt_typ_NE(info);
		else if (ne == Rslt_dr_amt_typ_nm) doRslt_dr_amt_typ_nm_NE(info);
		else if (ne == Rslt_dr_abs_typ) doRslt_dr_abs_typ_NE(info);
		else if (ne == Rslt_dr_abs_typ_nm) doRslt_dr_abs_typ_nm_NE(info);
		else if (ne == Rslt_dr_abstract) doRslt_dr_abstract_NE(info);
		else if (ne == Rslt_dr_sub_flg) doRslt_dr_sub_flg_NE(info);
		else if (ne == Rslt_dr_bp_flg) doRslt_dr_bp_flg_NE(info);
		else if (ne == Rslt_cr_dpt_typ) doRslt_cr_dpt_typ_NE(info);
		else if (ne == Rslt_cr_dpt_typ_nm) doRslt_cr_dpt_typ_nm_NE(info);
		else if (ne == Rslt_cr_trd_sml_flg) doRslt_cr_trd_sml_flg_NE(info);
		else if (ne == Rslt_cr_dpt_cd) doRslt_cr_dpt_cd_NE(info);
		else if (ne == Rslt_cr_dpt_nm) doRslt_cr_dpt_nm_NE(info);
		else if (ne == Rslt_cr_ptn_typ) doRslt_cr_ptn_typ_NE(info);
		else if (ne == Rslt_cr_ptn_typ_nm) doRslt_cr_ptn_typ_nm_NE(info);
		else if (ne == Rslt_cr_grp_cd) doRslt_cr_grp_cd_NE(info);
		else if (ne == Rslt_cr_grp_nm) doRslt_cr_grp_nm_NE(info);
		else if (ne == Rslt_cr_ac_cd) doRslt_cr_ac_cd_NE(info);
		else if (ne == Rslt_cr_ac_nm) doRslt_cr_ac_nm_NE(info);
		else if (ne == Rslt_cr_sub_ac_cd) doRslt_cr_sub_ac_cd_NE(info);
		else if (ne == Rslt_cr_sub_ac_nm) doRslt_cr_sub_ac_nm_NE(info);
		else if (ne == Rslt_cr_bp_typ) doRslt_cr_bp_typ_NE(info);
		else if (ne == Rslt_cr_bp_typ_nm) doRslt_cr_bp_typ_nm_NE(info);
		else if (ne == Rslt_cr_bp_cd) doRslt_cr_bp_cd_NE(info);
		else if (ne == Rslt_cr_bp_nm) doRslt_cr_bp_nm_NE(info);
		else if (ne == Rslt_cr_ac_tax_cd) doRslt_cr_ac_tax_cd_NE(info);
		else if (ne == Rslt_cr_ac_tax_nm) doRslt_cr_ac_tax_nm_NE(info);
		else if (ne == Rslt_cr_itm_typ) doRslt_cr_itm_typ_NE(info);
		else if (ne == Rslt_cr_itm_typ_nm) doRslt_cr_itm_typ_nm_NE(info);
		else if (ne == Rslt_cr_amt_typ) doRslt_cr_amt_typ_NE(info);
		else if (ne == Rslt_cr_amt_typ_nm) doRslt_cr_amt_typ_nm_NE(info);
		else if (ne == Rslt_cr_abs_typ) doRslt_cr_abs_typ_NE(info);
		else if (ne == Rslt_cr_abs_typ_nm) doRslt_cr_abs_typ_nm_NE(info);
		else if (ne == Rslt_cr_abstract) doRslt_cr_abstract_NE(info);
		else if (ne == Rslt_cr_sub_flg) doRslt_cr_sub_flg_NE(info);
		else if (ne == Rslt_cr_bp_flg) doRslt_cr_bp_flg_NE(info);
		else if (ne == Rslt_minus_flg) doRslt_minus_flg_NE(info);
		else if (ne == Rslt_carry_flg) doRslt_carry_flg_NE(info);
		else if (ne == Rslt_itm_jnl_cd) doRslt_itm_jnl_cd_NE(info);
		else if (ne == Rslt_itm_jnl_nm) doRslt_itm_jnl_nm_NE(info);
		else if (ne == Rslt_ac_rsn_cd) doRslt_ac_rsn_cd_NE(info);
		else if (ne == Rslt_ac_rsn_nm) doRslt_ac_rsn_nm_NE(info);
		else if (ne == Rslt_purc_typ) doRslt_purc_typ_NE(info);
		else if (ne == Rslt_purc_typ_nm) doRslt_purc_typ_nm_NE(info);
		else if (ne == Rslt_un_fix_typ) doRslt_un_fix_typ_NE(info);
		else if (ne == Rslt_un_fix_typ_nm) doRslt_un_fix_typ_nm_NE(info);
		else if (ne == Rslt_foreign_typ) doRslt_foreign_typ_NE(info);
		else if (ne == Rslt_foreign_typ_nm) doRslt_foreign_typ_nm_NE(info);
		else if (ne == Rslt_cur_cd) doRslt_cur_cd_NE(info);
		else if (ne == Rslt_cur_nm) doRslt_cur_nm_NE(info);
		else if (ne == Rslt_asst_typ) doRslt_asst_typ_NE(info);
		else if (ne == Rslt_asst_typ_nm) doRslt_asst_typ_nm_NE(info);
		else if (ne == Rslt_quality_typ) doRslt_quality_typ_NE(info);
		else if (ne == Rslt_quality_typ_nm) doRslt_quality_typ_nm_NE(info);
		else if (ne == Rslt_inv_loc_typ) doRslt_inv_loc_typ_NE(info);
		else if (ne == Rslt_inv_loc_typ_nm) doRslt_inv_loc_typ_nm_NE(info);
		else if (ne == Rslt_amt_sign_typ) doRslt_amt_sign_typ_NE(info);
		else if (ne == Rslt_amt_sign_typ_nm) doRslt_amt_sign_typ_nm_NE(info);
		else if (ne == Rslt_jnl_key1) doRslt_jnl_key1_NE(info);
		else if (ne == Rslt_jnl_key2) doRslt_jnl_key2_NE(info);
		else if (ne == Rslt_jnl_key3) doRslt_jnl_key3_NE(info);
		else if (ne == Rslt_jnl_key4) doRslt_jnl_key4_NE(info);
		else if (ne == Rslt_jnl_key5) doRslt_jnl_key5_NE(info);
		else if (ne == Rslt_jnl_key6) doRslt_jnl_key6_NE(info);
		else if (ne == Rslt_jnl_key7) doRslt_jnl_key7_NE(info);
		else if (ne == Rslt_jnl_key8) doRslt_jnl_key8_NE(info);
		else if (ne == Rslt_jnl_key9) doRslt_jnl_key9_NE(info);
		else if (ne == Rslt_jnl_key10) doRslt_jnl_key10_NE(info);
		else if (ne == Rslt_mon01_invalid_flg) doRslt_mon01_invalid_flg_NE(info);
		else if (ne == Rslt_mon02_invalid_flg) doRslt_mon02_invalid_flg_NE(info);
		else if (ne == Rslt_mon03_invalid_flg) doRslt_mon03_invalid_flg_NE(info);
		else if (ne == Rslt_mon04_invalid_flg) doRslt_mon04_invalid_flg_NE(info);
		else if (ne == Rslt_mon05_invalid_flg) doRslt_mon05_invalid_flg_NE(info);
		else if (ne == Rslt_mon06_invalid_flg) doRslt_mon06_invalid_flg_NE(info);
		else if (ne == Rslt_mon07_invalid_flg) doRslt_mon07_invalid_flg_NE(info);
		else if (ne == Rslt_mon08_invalid_flg) doRslt_mon08_invalid_flg_NE(info);
		else if (ne == Rslt_mon09_invalid_flg) doRslt_mon09_invalid_flg_NE(info);
		else if (ne == Rslt_mon10_invalid_flg) doRslt_mon10_invalid_flg_NE(info);
		else if (ne == Rslt_mon11_invalid_flg) doRslt_mon11_invalid_flg_NE(info);
		else if (ne == Rslt_mon12_invalid_flg) doRslt_mon12_invalid_flg_NE(info);
		else if (ne == Rslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == Rslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == Rslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == Rslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == Rslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == Rslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == Rslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == Rslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == Rslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == Rslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == Rslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
		else if (ne == Rslt_upd_cntr) doRslt_upd_cntr_NE(info);
		else if (ne == Rslt_del_usr_id) doRslt_del_usr_id_NE(info);
		else if (ne == Rslt_del_usr_nm) doRslt_del_usr_nm_NE(info);
		else if (ne == Rslt_del_ts) doRslt_del_ts_NE(info);
		else if (ne == Btn_dr_typ_Group) doBtn_dr_typ_NE(info);
	}

	/**
	 * [BaseTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBaseTab_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[jnl_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_dpt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_dpt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_dpt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_dpt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_trd_sml_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_trd_sml_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ptn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ptn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_sub_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_sub_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_sub_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_sub_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_bp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_bp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_bp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_bp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ac_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ac_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ac_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ac_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_amt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_amt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_amt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_amt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_abs_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_abs_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_abs_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_abs_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_abstract]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_abstract_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_sub_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_sub_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_bp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_bp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_dpt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_dpt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_dpt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_dpt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_trd_sml_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_trd_sml_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ptn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ptn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_sub_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_sub_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_sub_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_sub_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_bp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_bp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_bp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_bp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ac_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ac_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ac_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ac_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_amt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_amt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_amt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_amt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_abs_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_abs_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_abs_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_abs_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_abstract]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_abstract_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_sub_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_sub_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_bp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_bp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[minus_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_minus_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[carry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_carry_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[un_fix_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_un_fix_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[un_fix_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_un_fix_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[inv_loc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inv_loc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inv_loc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inv_loc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_sign_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_sign_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_sign_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_sign_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon01_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon01_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon02_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon02_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon03_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon03_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon04_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon04_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon05_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon05_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon06_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon06_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon07_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon07_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon08_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon08_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon09_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon09_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon10_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon10_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon11_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon11_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon12_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon12_invalid_flg_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[dr_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_dr_typ_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == BaseTabTab) doBaseTab_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_jnl_ptn_cd) doCnd_jnl_ptn_cd_NX(info);
		else if (nx == Cnd_jnl_ptn_nm) doCnd_jnl_ptn_nm_NX(info);
		else if (nx == Cnd_jnl_seq) doCnd_jnl_seq_NX(info);
		else if (nx == Rslt_check) doRslt_check_NX(info);
		else if (nx == Rslt_jnl_ptn_cd) doRslt_jnl_ptn_cd_NX(info);
		else if (nx == Rslt_jnl_ptn_nm) doRslt_jnl_ptn_nm_NX(info);
		else if (nx == Rslt_jnl_seq) doRslt_jnl_seq_NX(info);
		else if (nx == Rslt_memo1) doRslt_memo1_NX(info);
		else if (nx == Rslt_memo2) doRslt_memo2_NX(info);
		else if (nx == Rslt_memo3) doRslt_memo3_NX(info);
		else if (nx == Rslt_del_flg) doRslt_del_flg_NX(info);
		else if (nx == Rslt_dr_dpt_typ) doRslt_dr_dpt_typ_NX(info);
		else if (nx == Rslt_dr_dpt_typ_nm) doRslt_dr_dpt_typ_nm_NX(info);
		else if (nx == Rslt_dr_trd_sml_flg) doRslt_dr_trd_sml_flg_NX(info);
		else if (nx == Rslt_dr_dpt_cd) doRslt_dr_dpt_cd_NX(info);
		else if (nx == Rslt_dr_dpt_nm) doRslt_dr_dpt_nm_NX(info);
		else if (nx == Rslt_dr_ptn_typ) doRslt_dr_ptn_typ_NX(info);
		else if (nx == Rslt_dr_ptn_typ_nm) doRslt_dr_ptn_typ_nm_NX(info);
		else if (nx == Rslt_dr_grp_cd) doRslt_dr_grp_cd_NX(info);
		else if (nx == Rslt_dr_grp_nm) doRslt_dr_grp_nm_NX(info);
		else if (nx == Rslt_dr_ac_cd) doRslt_dr_ac_cd_NX(info);
		else if (nx == Rslt_dr_ac_nm) doRslt_dr_ac_nm_NX(info);
		else if (nx == Rslt_dr_sub_ac_cd) doRslt_dr_sub_ac_cd_NX(info);
		else if (nx == Rslt_dr_sub_ac_nm) doRslt_dr_sub_ac_nm_NX(info);
		else if (nx == Rslt_dr_bp_typ) doRslt_dr_bp_typ_NX(info);
		else if (nx == Rslt_dr_bp_typ_nm) doRslt_dr_bp_typ_nm_NX(info);
		else if (nx == Rslt_dr_bp_cd) doRslt_dr_bp_cd_NX(info);
		else if (nx == Rslt_dr_bp_nm) doRslt_dr_bp_nm_NX(info);
		else if (nx == Rslt_dr_ac_tax_cd) doRslt_dr_ac_tax_cd_NX(info);
		else if (nx == Rslt_dr_ac_tax_nm) doRslt_dr_ac_tax_nm_NX(info);
		else if (nx == Rslt_dr_itm_typ) doRslt_dr_itm_typ_NX(info);
		else if (nx == Rslt_dr_itm_typ_nm) doRslt_dr_itm_typ_nm_NX(info);
		else if (nx == Rslt_dr_amt_typ) doRslt_dr_amt_typ_NX(info);
		else if (nx == Rslt_dr_amt_typ_nm) doRslt_dr_amt_typ_nm_NX(info);
		else if (nx == Rslt_dr_abs_typ) doRslt_dr_abs_typ_NX(info);
		else if (nx == Rslt_dr_abs_typ_nm) doRslt_dr_abs_typ_nm_NX(info);
		else if (nx == Rslt_dr_abstract) doRslt_dr_abstract_NX(info);
		else if (nx == Rslt_dr_sub_flg) doRslt_dr_sub_flg_NX(info);
		else if (nx == Rslt_dr_bp_flg) doRslt_dr_bp_flg_NX(info);
		else if (nx == Rslt_cr_dpt_typ) doRslt_cr_dpt_typ_NX(info);
		else if (nx == Rslt_cr_dpt_typ_nm) doRslt_cr_dpt_typ_nm_NX(info);
		else if (nx == Rslt_cr_trd_sml_flg) doRslt_cr_trd_sml_flg_NX(info);
		else if (nx == Rslt_cr_dpt_cd) doRslt_cr_dpt_cd_NX(info);
		else if (nx == Rslt_cr_dpt_nm) doRslt_cr_dpt_nm_NX(info);
		else if (nx == Rslt_cr_ptn_typ) doRslt_cr_ptn_typ_NX(info);
		else if (nx == Rslt_cr_ptn_typ_nm) doRslt_cr_ptn_typ_nm_NX(info);
		else if (nx == Rslt_cr_grp_cd) doRslt_cr_grp_cd_NX(info);
		else if (nx == Rslt_cr_grp_nm) doRslt_cr_grp_nm_NX(info);
		else if (nx == Rslt_cr_ac_cd) doRslt_cr_ac_cd_NX(info);
		else if (nx == Rslt_cr_ac_nm) doRslt_cr_ac_nm_NX(info);
		else if (nx == Rslt_cr_sub_ac_cd) doRslt_cr_sub_ac_cd_NX(info);
		else if (nx == Rslt_cr_sub_ac_nm) doRslt_cr_sub_ac_nm_NX(info);
		else if (nx == Rslt_cr_bp_typ) doRslt_cr_bp_typ_NX(info);
		else if (nx == Rslt_cr_bp_typ_nm) doRslt_cr_bp_typ_nm_NX(info);
		else if (nx == Rslt_cr_bp_cd) doRslt_cr_bp_cd_NX(info);
		else if (nx == Rslt_cr_bp_nm) doRslt_cr_bp_nm_NX(info);
		else if (nx == Rslt_cr_ac_tax_cd) doRslt_cr_ac_tax_cd_NX(info);
		else if (nx == Rslt_cr_ac_tax_nm) doRslt_cr_ac_tax_nm_NX(info);
		else if (nx == Rslt_cr_itm_typ) doRslt_cr_itm_typ_NX(info);
		else if (nx == Rslt_cr_itm_typ_nm) doRslt_cr_itm_typ_nm_NX(info);
		else if (nx == Rslt_cr_amt_typ) doRslt_cr_amt_typ_NX(info);
		else if (nx == Rslt_cr_amt_typ_nm) doRslt_cr_amt_typ_nm_NX(info);
		else if (nx == Rslt_cr_abs_typ) doRslt_cr_abs_typ_NX(info);
		else if (nx == Rslt_cr_abs_typ_nm) doRslt_cr_abs_typ_nm_NX(info);
		else if (nx == Rslt_cr_abstract) doRslt_cr_abstract_NX(info);
		else if (nx == Rslt_cr_sub_flg) doRslt_cr_sub_flg_NX(info);
		else if (nx == Rslt_cr_bp_flg) doRslt_cr_bp_flg_NX(info);
		else if (nx == Rslt_minus_flg) doRslt_minus_flg_NX(info);
		else if (nx == Rslt_carry_flg) doRslt_carry_flg_NX(info);
		else if (nx == Rslt_itm_jnl_cd) doRslt_itm_jnl_cd_NX(info);
		else if (nx == Rslt_itm_jnl_nm) doRslt_itm_jnl_nm_NX(info);
		else if (nx == Rslt_ac_rsn_cd) doRslt_ac_rsn_cd_NX(info);
		else if (nx == Rslt_ac_rsn_nm) doRslt_ac_rsn_nm_NX(info);
		else if (nx == Rslt_purc_typ) doRslt_purc_typ_NX(info);
		else if (nx == Rslt_purc_typ_nm) doRslt_purc_typ_nm_NX(info);
		else if (nx == Rslt_un_fix_typ) doRslt_un_fix_typ_NX(info);
		else if (nx == Rslt_un_fix_typ_nm) doRslt_un_fix_typ_nm_NX(info);
		else if (nx == Rslt_foreign_typ) doRslt_foreign_typ_NX(info);
		else if (nx == Rslt_foreign_typ_nm) doRslt_foreign_typ_nm_NX(info);
		else if (nx == Rslt_cur_cd) doRslt_cur_cd_NX(info);
		else if (nx == Rslt_cur_nm) doRslt_cur_nm_NX(info);
		else if (nx == Rslt_asst_typ) doRslt_asst_typ_NX(info);
		else if (nx == Rslt_asst_typ_nm) doRslt_asst_typ_nm_NX(info);
		else if (nx == Rslt_quality_typ) doRslt_quality_typ_NX(info);
		else if (nx == Rslt_quality_typ_nm) doRslt_quality_typ_nm_NX(info);
		else if (nx == Rslt_inv_loc_typ) doRslt_inv_loc_typ_NX(info);
		else if (nx == Rslt_inv_loc_typ_nm) doRslt_inv_loc_typ_nm_NX(info);
		else if (nx == Rslt_amt_sign_typ) doRslt_amt_sign_typ_NX(info);
		else if (nx == Rslt_amt_sign_typ_nm) doRslt_amt_sign_typ_nm_NX(info);
		else if (nx == Rslt_jnl_key1) doRslt_jnl_key1_NX(info);
		else if (nx == Rslt_jnl_key2) doRslt_jnl_key2_NX(info);
		else if (nx == Rslt_jnl_key3) doRslt_jnl_key3_NX(info);
		else if (nx == Rslt_jnl_key4) doRslt_jnl_key4_NX(info);
		else if (nx == Rslt_jnl_key5) doRslt_jnl_key5_NX(info);
		else if (nx == Rslt_jnl_key6) doRslt_jnl_key6_NX(info);
		else if (nx == Rslt_jnl_key7) doRslt_jnl_key7_NX(info);
		else if (nx == Rslt_jnl_key8) doRslt_jnl_key8_NX(info);
		else if (nx == Rslt_jnl_key9) doRslt_jnl_key9_NX(info);
		else if (nx == Rslt_jnl_key10) doRslt_jnl_key10_NX(info);
		else if (nx == Rslt_mon01_invalid_flg) doRslt_mon01_invalid_flg_NX(info);
		else if (nx == Rslt_mon02_invalid_flg) doRslt_mon02_invalid_flg_NX(info);
		else if (nx == Rslt_mon03_invalid_flg) doRslt_mon03_invalid_flg_NX(info);
		else if (nx == Rslt_mon04_invalid_flg) doRslt_mon04_invalid_flg_NX(info);
		else if (nx == Rslt_mon05_invalid_flg) doRslt_mon05_invalid_flg_NX(info);
		else if (nx == Rslt_mon06_invalid_flg) doRslt_mon06_invalid_flg_NX(info);
		else if (nx == Rslt_mon07_invalid_flg) doRslt_mon07_invalid_flg_NX(info);
		else if (nx == Rslt_mon08_invalid_flg) doRslt_mon08_invalid_flg_NX(info);
		else if (nx == Rslt_mon09_invalid_flg) doRslt_mon09_invalid_flg_NX(info);
		else if (nx == Rslt_mon10_invalid_flg) doRslt_mon10_invalid_flg_NX(info);
		else if (nx == Rslt_mon11_invalid_flg) doRslt_mon11_invalid_flg_NX(info);
		else if (nx == Rslt_mon12_invalid_flg) doRslt_mon12_invalid_flg_NX(info);
		else if (nx == Rslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == Rslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == Rslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == Rslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == Rslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == Rslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == Rslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == Rslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == Rslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == Rslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == Rslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
		else if (nx == Rslt_upd_cntr) doRslt_upd_cntr_NX(info);
		else if (nx == Rslt_del_usr_id) doRslt_del_usr_id_NX(info);
		else if (nx == Rslt_del_usr_nm) doRslt_del_usr_nm_NX(info);
		else if (nx == Rslt_del_ts) doRslt_del_ts_NX(info);
		else if (nx == Btn_dr_typ_Group) doBtn_dr_typ_NX(info);
	}

	/**
	 * [BaseTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBaseTab_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[jnl_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_dpt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_dpt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_dpt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_dpt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_trd_sml_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_trd_sml_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ptn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ptn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_sub_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_sub_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_sub_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_sub_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_bp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_bp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_bp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_bp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ac_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ac_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ac_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ac_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_amt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_amt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_amt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_amt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_abs_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_abs_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_abs_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_abs_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_abstract]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_abstract_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_sub_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_sub_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_bp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_bp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_dpt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_dpt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_dpt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_dpt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_trd_sml_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_trd_sml_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ptn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ptn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_sub_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_sub_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_sub_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_sub_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_bp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_bp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_bp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_bp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ac_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ac_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ac_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ac_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_amt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_amt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_amt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_amt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_abs_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_abs_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_abs_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_abs_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_abstract]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_abstract_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_sub_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_sub_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_bp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_bp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[minus_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_minus_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[carry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_carry_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[un_fix_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_un_fix_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[un_fix_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_un_fix_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[inv_loc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inv_loc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inv_loc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inv_loc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_sign_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_sign_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_sign_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_sign_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon01_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon01_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon02_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon02_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon03_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon03_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon04_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon04_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon05_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon05_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon06_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon06_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon07_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon07_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon08_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon08_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon09_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon09_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon10_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon10_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon11_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon11_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mon12_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mon12_invalid_flg_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[dr_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_dr_typ_NX(MCEventInfo info){
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
		else if (lc == Cnd_jnl_ptn_cd) doCnd_jnl_ptn_cd_LC(info);
		else if (lc == Cnd_jnl_ptn_nm) doCnd_jnl_ptn_nm_LC(info);
		else if (lc == Cnd_jnl_seq) doCnd_jnl_seq_LC(info);
		else if (lc == Rslt_jnl_ptn_cd) doRslt_jnl_ptn_cd_LC(info);
		else if (lc == Rslt_jnl_ptn_nm) doRslt_jnl_ptn_nm_LC(info);
		else if (lc == Rslt_jnl_seq) doRslt_jnl_seq_LC(info);
		else if (lc == Rslt_memo1) doRslt_memo1_LC(info);
		else if (lc == Rslt_memo2) doRslt_memo2_LC(info);
		else if (lc == Rslt_memo3) doRslt_memo3_LC(info);
		else if (lc == Rslt_dr_dpt_typ) doRslt_dr_dpt_typ_LC(info);
		else if (lc == Rslt_dr_dpt_typ_nm) doRslt_dr_dpt_typ_nm_LC(info);
		else if (lc == Rslt_dr_dpt_cd) doRslt_dr_dpt_cd_LC(info);
		else if (lc == Rslt_dr_dpt_nm) doRslt_dr_dpt_nm_LC(info);
		else if (lc == Rslt_dr_ptn_typ) doRslt_dr_ptn_typ_LC(info);
		else if (lc == Rslt_dr_ptn_typ_nm) doRslt_dr_ptn_typ_nm_LC(info);
		else if (lc == Rslt_dr_grp_cd) doRslt_dr_grp_cd_LC(info);
		else if (lc == Rslt_dr_grp_nm) doRslt_dr_grp_nm_LC(info);
		else if (lc == Rslt_dr_ac_cd) doRslt_dr_ac_cd_LC(info);
		else if (lc == Rslt_dr_ac_nm) doRslt_dr_ac_nm_LC(info);
		else if (lc == Rslt_dr_sub_ac_cd) doRslt_dr_sub_ac_cd_LC(info);
		else if (lc == Rslt_dr_sub_ac_nm) doRslt_dr_sub_ac_nm_LC(info);
		else if (lc == Rslt_dr_bp_typ) doRslt_dr_bp_typ_LC(info);
		else if (lc == Rslt_dr_bp_typ_nm) doRslt_dr_bp_typ_nm_LC(info);
		else if (lc == Rslt_dr_bp_cd) doRslt_dr_bp_cd_LC(info);
		else if (lc == Rslt_dr_bp_nm) doRslt_dr_bp_nm_LC(info);
		else if (lc == Rslt_dr_ac_tax_cd) doRslt_dr_ac_tax_cd_LC(info);
		else if (lc == Rslt_dr_ac_tax_nm) doRslt_dr_ac_tax_nm_LC(info);
		else if (lc == Rslt_dr_itm_typ) doRslt_dr_itm_typ_LC(info);
		else if (lc == Rslt_dr_itm_typ_nm) doRslt_dr_itm_typ_nm_LC(info);
		else if (lc == Rslt_dr_amt_typ) doRslt_dr_amt_typ_LC(info);
		else if (lc == Rslt_dr_amt_typ_nm) doRslt_dr_amt_typ_nm_LC(info);
		else if (lc == Rslt_dr_abs_typ) doRslt_dr_abs_typ_LC(info);
		else if (lc == Rslt_dr_abs_typ_nm) doRslt_dr_abs_typ_nm_LC(info);
		else if (lc == Rslt_dr_abstract) doRslt_dr_abstract_LC(info);
		else if (lc == Rslt_cr_dpt_typ) doRslt_cr_dpt_typ_LC(info);
		else if (lc == Rslt_cr_dpt_typ_nm) doRslt_cr_dpt_typ_nm_LC(info);
		else if (lc == Rslt_cr_dpt_cd) doRslt_cr_dpt_cd_LC(info);
		else if (lc == Rslt_cr_dpt_nm) doRslt_cr_dpt_nm_LC(info);
		else if (lc == Rslt_cr_ptn_typ) doRslt_cr_ptn_typ_LC(info);
		else if (lc == Rslt_cr_ptn_typ_nm) doRslt_cr_ptn_typ_nm_LC(info);
		else if (lc == Rslt_cr_grp_cd) doRslt_cr_grp_cd_LC(info);
		else if (lc == Rslt_cr_grp_nm) doRslt_cr_grp_nm_LC(info);
		else if (lc == Rslt_cr_ac_cd) doRslt_cr_ac_cd_LC(info);
		else if (lc == Rslt_cr_ac_nm) doRslt_cr_ac_nm_LC(info);
		else if (lc == Rslt_cr_sub_ac_cd) doRslt_cr_sub_ac_cd_LC(info);
		else if (lc == Rslt_cr_sub_ac_nm) doRslt_cr_sub_ac_nm_LC(info);
		else if (lc == Rslt_cr_bp_typ) doRslt_cr_bp_typ_LC(info);
		else if (lc == Rslt_cr_bp_typ_nm) doRslt_cr_bp_typ_nm_LC(info);
		else if (lc == Rslt_cr_bp_cd) doRslt_cr_bp_cd_LC(info);
		else if (lc == Rslt_cr_bp_nm) doRslt_cr_bp_nm_LC(info);
		else if (lc == Rslt_cr_ac_tax_cd) doRslt_cr_ac_tax_cd_LC(info);
		else if (lc == Rslt_cr_ac_tax_nm) doRslt_cr_ac_tax_nm_LC(info);
		else if (lc == Rslt_cr_itm_typ) doRslt_cr_itm_typ_LC(info);
		else if (lc == Rslt_cr_itm_typ_nm) doRslt_cr_itm_typ_nm_LC(info);
		else if (lc == Rslt_cr_amt_typ) doRslt_cr_amt_typ_LC(info);
		else if (lc == Rslt_cr_amt_typ_nm) doRslt_cr_amt_typ_nm_LC(info);
		else if (lc == Rslt_cr_abs_typ) doRslt_cr_abs_typ_LC(info);
		else if (lc == Rslt_cr_abs_typ_nm) doRslt_cr_abs_typ_nm_LC(info);
		else if (lc == Rslt_cr_abstract) doRslt_cr_abstract_LC(info);
		else if (lc == Rslt_itm_jnl_cd) doRslt_itm_jnl_cd_LC(info);
		else if (lc == Rslt_itm_jnl_nm) doRslt_itm_jnl_nm_LC(info);
		else if (lc == Rslt_ac_rsn_cd) doRslt_ac_rsn_cd_LC(info);
		else if (lc == Rslt_ac_rsn_nm) doRslt_ac_rsn_nm_LC(info);
		else if (lc == Rslt_purc_typ) doRslt_purc_typ_LC(info);
		else if (lc == Rslt_purc_typ_nm) doRslt_purc_typ_nm_LC(info);
		else if (lc == Rslt_un_fix_typ) doRslt_un_fix_typ_LC(info);
		else if (lc == Rslt_un_fix_typ_nm) doRslt_un_fix_typ_nm_LC(info);
		else if (lc == Rslt_foreign_typ) doRslt_foreign_typ_LC(info);
		else if (lc == Rslt_foreign_typ_nm) doRslt_foreign_typ_nm_LC(info);
		else if (lc == Rslt_cur_cd) doRslt_cur_cd_LC(info);
		else if (lc == Rslt_cur_nm) doRslt_cur_nm_LC(info);
		else if (lc == Rslt_asst_typ) doRslt_asst_typ_LC(info);
		else if (lc == Rslt_asst_typ_nm) doRslt_asst_typ_nm_LC(info);
		else if (lc == Rslt_quality_typ) doRslt_quality_typ_LC(info);
		else if (lc == Rslt_quality_typ_nm) doRslt_quality_typ_nm_LC(info);
		else if (lc == Rslt_inv_loc_typ) doRslt_inv_loc_typ_LC(info);
		else if (lc == Rslt_inv_loc_typ_nm) doRslt_inv_loc_typ_nm_LC(info);
		else if (lc == Rslt_amt_sign_typ) doRslt_amt_sign_typ_LC(info);
		else if (lc == Rslt_amt_sign_typ_nm) doRslt_amt_sign_typ_nm_LC(info);
		else if (lc == Rslt_jnl_key1) doRslt_jnl_key1_LC(info);
		else if (lc == Rslt_jnl_key2) doRslt_jnl_key2_LC(info);
		else if (lc == Rslt_jnl_key3) doRslt_jnl_key3_LC(info);
		else if (lc == Rslt_jnl_key4) doRslt_jnl_key4_LC(info);
		else if (lc == Rslt_jnl_key5) doRslt_jnl_key5_LC(info);
		else if (lc == Rslt_jnl_key6) doRslt_jnl_key6_LC(info);
		else if (lc == Rslt_jnl_key7) doRslt_jnl_key7_LC(info);
		else if (lc == Rslt_jnl_key8) doRslt_jnl_key8_LC(info);
		else if (lc == Rslt_jnl_key9) doRslt_jnl_key9_LC(info);
		else if (lc == Rslt_jnl_key10) doRslt_jnl_key10_LC(info);
		else if (lc == Rslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == Rslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == Rslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == Rslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == Rslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == Rslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == Rslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == Rslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == Rslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == Rslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == Rslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
		else if (lc == Rslt_upd_cntr) doRslt_upd_cntr_LC(info);
		else if (lc == Rslt_del_usr_id) doRslt_del_usr_id_LC(info);
		else if (lc == Rslt_del_usr_nm) doRslt_del_usr_nm_LC(info);
		else if (lc == Rslt_del_ts) doRslt_del_ts_LC(info);
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[jnl_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_jnl_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_dpt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_dpt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_dpt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_dpt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ptn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ptn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_sub_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_sub_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_sub_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_sub_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_bp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_bp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_bp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_bp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ac_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ac_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_ac_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_ac_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_amt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_amt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_amt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_amt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_abs_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_abs_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_abs_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_abs_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dr_abstract]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dr_abstract_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_dpt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_dpt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_dpt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_dpt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ptn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ptn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_sub_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_sub_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_sub_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_sub_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_bp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_bp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_bp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_bp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ac_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ac_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_ac_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_ac_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_amt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_amt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_amt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_amt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_abs_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_abs_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_abs_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_abs_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cr_abstract]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cr_abstract_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[un_fix_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_un_fix_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[un_fix_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_un_fix_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[inv_loc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inv_loc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inv_loc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inv_loc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_sign_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_sign_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[amt_sign_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_amt_sign_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_key10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_key10_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_del_ts_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_jnl_ptn_cd]の作成メソッド
	 */
	public MCList getCnd_jnl_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getJnlPtnBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_jnl_seq]の作成メソッド
	 */
	public MCList getCnd_jnl_seq(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getJnlPtnSeq(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_jnl_ptn_cd]の作成メソッド
	 */
	public MCList getRslt_jnl_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getJnlPtnBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_dr_dpt_typ]の作成メソッド
	 */
	public MCList getRslt_dr_dpt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDptTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_dr_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_dr_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_dr_ptn_typ]の作成メソッド
	 */
	public MCList getRslt_dr_ptn_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPtnTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_dr_grp_cd]の作成メソッド
	 */
	public MCList getRslt_dr_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getJnlGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_dr_ac_cd]の作成メソッド
	 */
	public MCList getRslt_dr_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAccount(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_dr_sub_ac_cd]の作成メソッド
	 */
	public MCList getRslt_dr_sub_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSubAccount(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_dr_bp_typ]の作成メソッド
	 */
	public MCList getRslt_dr_bp_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpSetTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_dr_bp_cd]の作成メソッド
	 */
	public MCList getRslt_dr_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_dr_ac_tax_cd]の作成メソッド
	 */
	public MCList getRslt_dr_ac_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_dr_itm_typ]の作成メソッド
	 */
	public MCList getRslt_dr_itm_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSetTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_dr_amt_typ]の作成メソッド
	 */
	public MCList getRslt_dr_amt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAmtTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_dr_abs_typ]の作成メソッド
	 */
	public MCList getRslt_dr_abs_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAbsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_cr_dpt_typ]の作成メソッド
	 */
	public MCList getRslt_cr_dpt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDptTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_cr_dpt_cd]の作成メソッド
	 */
	public MCList getRslt_cr_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_cr_ptn_typ]の作成メソッド
	 */
	public MCList getRslt_cr_ptn_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPtnTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_cr_grp_cd]の作成メソッド
	 */
	public MCList getRslt_cr_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getJnlGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_cr_ac_cd]の作成メソッド
	 */
	public MCList getRslt_cr_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAccount(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_cr_sub_ac_cd]の作成メソッド
	 */
	public MCList getRslt_cr_sub_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSubAccount(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_cr_bp_typ]の作成メソッド
	 */
	public MCList getRslt_cr_bp_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpSetTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_cr_bp_cd]の作成メソッド
	 */
	public MCList getRslt_cr_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_cr_ac_tax_cd]の作成メソッド
	 */
	public MCList getRslt_cr_ac_tax_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcTax(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_cr_itm_typ]の作成メソッド
	 */
	public MCList getRslt_cr_itm_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSetTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_cr_amt_typ]の作成メソッド
	 */
	public MCList getRslt_cr_amt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAmtTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_cr_abs_typ]の作成メソッド
	 */
	public MCList getRslt_cr_abs_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAbsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getRslt_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_itm_jnl_cd]の作成メソッド
	 */
	public MCList getRslt_itm_jnl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmJnl(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_ac_rsn_cd]の作成メソッド
	 */
	public MCList getRslt_ac_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_purc_typ]の作成メソッド
	 */
	public MCList getRslt_purc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_un_fix_typ]の作成メソッド
	 */
	public MCList getRslt_un_fix_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnFixTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_foreign_typ]の作成メソッド
	 */
	public MCList getRslt_foreign_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getForeignTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_cur_cd]の作成メソッド
	 */
	public MCList getRslt_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_asst_typ]の作成メソッド
	 */
	public MCList getRslt_asst_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAsstTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_quality_typ]の作成メソッド
	 */
	public MCList getRslt_quality_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getQualityTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_inv_loc_typ]の作成メソッド
	 */
	public MCList getRslt_inv_loc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInvLocTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Rslt_amt_sign_typ]の作成メソッド
	 */
	public MCList getRslt_amt_sign_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAmtSignTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL1060.Srch01")) {
			return new MA_MABCL1060_Srch01Bridge();
		}
		if (id.equals("MA.MABCL1060.Upd01")) {
			return new MA_MABCL1060_Upd01Bridge();
		}
		if (id.equals("MA.MABCL1060.Del01")) {
			return new MA_MABCL1060_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL1060_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1060_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL1060_Srch01;

		/** コンストラクタ */
		protected MA_MABCL1060_Srch01Bridge() {
			p_MA_MABCL1060_Srch01 = new MCParam(PDef.MA_MABCL1060_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL1060_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP1060.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1060.RsltR.class));

			p_MA_MABCL1060_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL1060_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL1060_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL1060_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL1060_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP1060.CndR up0() {
			return (mcframe.clientMABC.MABCP1060.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP1060.RsltR> down0() {
			return (MCList<mcframe.clientMABC.MABCP1060.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL1060_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1060.RsltR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL1060_Srch01;
		}

		protected void show() {
			setRsltAllL((MCList<mcframe.clientMABC.MABCP1060.RsltR>)p_MA_MABCL1060_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltAllL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltAllL());
			return result;
		}
	}
	/**
	 * [MA_MABCL1060_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1060_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL1060_Upd01;

		/** コンストラクタ */
		protected MA_MABCL1060_Upd01Bridge() {
			p_MA_MABCL1060_Upd01 = new MCParam(PDef.MA_MABCL1060_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL1060_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP1060.RsltR.class));
			param.addUpBlock(mcframe.clientMABC.MABCP1060.CndR.create());
			// Down

			p_MA_MABCL1060_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL1060_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL1060_Upd01.addUpBlock(getRsltAllL().shallowClone());
			p_MA_MABCL1060_Upd01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL1060_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL1060_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP1060.RsltR> up0() {
			return (MCList<mcframe.clientMABC.MABCP1060.RsltR>)up(0);
		}
		protected mcframe.clientMABC.MABCP1060.CndR up1() {
			return (mcframe.clientMABC.MABCP1060.CndR)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL1060_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltAllL());
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MA_MABCL1060_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1060_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL1060_Del01;

		/** コンストラクタ */
		protected MA_MABCL1060_Del01Bridge() {
			p_MA_MABCL1060_Del01 = new MCParam(PDef.MA_MABCL1060_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL1060_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP1060.RsltR.class));
			// Down

			p_MA_MABCL1060_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL1060_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL1060_Del01.addUpBlock(getRsltAllL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL1060_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL1060_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP1060.RsltR> up0() {
			return (MCList<mcframe.clientMABC.MABCP1060.RsltR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL1060_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltAllL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}