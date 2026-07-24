package mcframe.clientMABC.MABCP1090;

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
import mcframe.clientMABC.MABCP1090.MABCP_JnlPtnSrch_MC.MA_MABCL1090_Srch01Caller;

/**
 * 画面"MABCP_JnlPtnSrch"パネルクラスです。<p>
 *
 * 自動仕訳パタンマスタの検索を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_JnlPtnSrch_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABCP1090";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [Space]ブロック関連のField定義
	public MCPanel SpacePanel = null;
	// [Space]ブロックの項目のField定義
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
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
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
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
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
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Wrk]ブロック関連のField定義
	public MCPanel WrkPanel = null;
	// [Wrk]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP1090.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_flg = null;
	/**
	 * Journal pattern cd. 仕訳パタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jnl_ptn_cd = null;
	/**
	 * Journal pattern name 仕訳パタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jnl_ptn_nm = null;
	/**
	 * Sequence number 連番.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jnl_seq = null;
	/**
	 * Debit journal dept. type 借方仕訳部門区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_dpt_typ = null;
	/**
	 * Debit journal dept. type name 借方仕訳部門区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_dpt_typ_nm = null;
	/**
	 * Debit Accounting dept. cd. 借方会計部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_dpt_cd = null;
	/**
	 * Debit Accounting dept. name 借方会計部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_dpt_nm = null;
	/**
	 * Debit pattern type 借方パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_ptn_typ = null;
	/**
	 * Debit pattern type name 借方パタン区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_ptn_typ_nm = null;
	/**
	 * Debit journal group cd. 借方仕訳グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_grp_cd = null;
	/**
	 * Debit journal group name 借方仕訳グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_grp_nm = null;
	/**
	 * Credit journal dept. type 貸方仕訳部門区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_dpt_typ = null;
	/**
	 * Credit journal dept. type name 貸方仕訳部門区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_dpt_typ_nm = null;
	/**
	 * Credit accounting dept. cd. 貸方会計部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_dpt_cd = null;
	/**
	 * Credit accounting dept. name 貸方会計部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_dpt_nm = null;
	/**
	 * Credit pattern type 貸方パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_ptn_typ = null;
	/**
	 * Credit pattern type name 貸方パタン区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_ptn_typ_nm = null;
	/**
	 * Credit journal group cd. 貸方仕訳グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_grp_cd = null;
	/**
	 * Credit journal group name 貸方仕訳グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_grp_nm = null;
	/**
	 * Debit account cd. 借方勘定科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_ac_cd = null;
	/**
	 * Debit account name 借方勘定科目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_ac_nm = null;
	/**
	 * Debit subsidiary account cd. 借方補助勘定科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_sub_ac_cd = null;
	/**
	 * Debit subsidiary account name 借方補助勘定科目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_sub_ac_nm = null;
	/**
	 * Credit account cd. 貸方勘定科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_ac_cd = null;
	/**
	 * Credit account name 貸方勘定科目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_ac_nm = null;
	/**
	 * Credit subsidiary account cd. 貸方補助勘定科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_sub_ac_cd = null;
	/**
	 * Credit subsidiary account name 貸方補助勘定科目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_sub_ac_nm = null;
	/**
	 * Debit tax cd. 借方税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_ac_tax_cd = null;
	/**
	 * Debit tax name 借方税名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_ac_tax_nm = null;
	/**
	 * Credit tax cd. 貸方税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_ac_tax_cd = null;
	/**
	 * Credit tax name 貸方税名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_ac_tax_nm = null;
	/**
	 * Debit BP type 借方取引先区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_bp_typ = null;
	/**
	 * Debit BP type name 借方取引先区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_bp_typ_nm = null;
	/**
	 * Debit BP cd. 借方取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_bp_cd = null;
	/**
	 * Debit BP name 借方取引先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_bp_nm = null;
	/**
	 * Credit BP type 貸方取引先区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_bp_typ = null;
	/**
	 * Credit BP type name 貸方取引先区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_bp_typ_nm = null;
	/**
	 * Credit company cd. 貸方取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_bp_cd = null;
	/**
	 * Credit BP name 貸方取引先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_bp_nm = null;
	/**
	 * Debit item type 借方品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_itm_typ = null;
	/**
	 * Debit item type name 借方品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_itm_typ_nm = null;
	/**
	 * Credit item type 貸方品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_itm_typ = null;
	/**
	 * Credit item type name 貸方品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_itm_typ_nm = null;
	/**
	 * Debit transfer destination aggregation 借方振替先集計.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_trd_sml_flg = null;
	/**
	 * Credit transfer destination aggregation 貸方振替先集計.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_trd_sml_flg = null;
	/**
	 * Minus マイナス.<p>
	 *
	 */
	public MCColumnConfig columnDtl_minus_flg = null;
	/**
	 * Debit amount type 借方金額区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_amt_typ = null;
	/**
	 * Debit amount type name 借方金額区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_amt_typ_nm = null;
	/**
	 * Credit amount type 貸方金額区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_amt_typ = null;
	/**
	 * Credit amount type name 貸方金額区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_amt_typ_nm = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
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
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_rsn_cd = null;
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_rsn_nm = null;
	/**
	 * Purchase type 購買区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_typ = null;
	/**
	 * Purchase type name 購買区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_purc_typ_nm = null;
	/**
	 * Amount unfirm type 金額未確定区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_un_fix_typ = null;
	/**
	 * Amount unfirm type name 金額未確定区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_un_fix_typ_nm = null;
	/**
	 * Foreign transaction type 国外取引区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_foreign_typ = null;
	/**
	 * Foreign transaction type name 国外取引区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_foreign_typ_nm = null;
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cur_nm = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asst_typ = null;
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asst_typ_nm = null;
	/**
	 * Inventory conforming type 在庫良品区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_quality_typ = null;
	/**
	 * Inventory conforming type name 在庫良品区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_quality_typ_nm = null;
	/**
	 * Inventory location type 在庫場所区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inv_loc_typ = null;
	/**
	 * Inventory location type name 在庫場所区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inv_loc_typ_nm = null;
	/**
	 * Amount sign type 金額符号区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_amt_sign_typ = null;
	/**
	 * Amount sign type name 金額符号区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_amt_sign_typ_nm = null;
	/**
	 * Journal key column 1 仕訳キー項目１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jnl_key1 = null;
	/**
	 * Journal key column 2 仕訳キー項目２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jnl_key2 = null;
	/**
	 * Journal key column 3 仕訳キー項目３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jnl_key3 = null;
	/**
	 * Journal key column 4 仕訳キー項目４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jnl_key4 = null;
	/**
	 * Journal key column 5 仕訳キー項目５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jnl_key5 = null;
	/**
	 * Journal key column 6 仕訳キー項目６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jnl_key6 = null;
	/**
	 * Journal key column 7 仕訳キー項目７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jnl_key7 = null;
	/**
	 * Journal key column 8 仕訳キー項目８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jnl_key8 = null;
	/**
	 * Journal key column 9 仕訳キー項目９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jnl_key9 = null;
	/**
	 * Journal key column 10 仕訳キー項目１０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_jnl_key10 = null;
	/**
	 * Carry-over journal 繰越仕訳.<p>
	 *
	 */
	public MCColumnConfig columnDtl_carry_flg = null;
	/**
	 * Debit abstract type 借方摘要区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_abs_typ = null;
	/**
	 * Debit abstract type name 借方摘要区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_abs_typ_nm = null;
	/**
	 * Debit summary 借方摘要.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dr_abstract = null;
	/**
	 * Credit abstract type 貸方摘要区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_abs_typ = null;
	/**
	 * Credit abstract type name 貸方摘要区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_abs_typ_nm = null;
	/**
	 * Credit summary 貸方摘要.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cr_abstract = null;
	/**
	 * Not for Jan. １月対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon01_invalid_flg = null;
	/**
	 * Not for Feb. ２月対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon02_invalid_flg = null;
	/**
	 * Not for Mar. ３月対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon03_invalid_flg = null;
	/**
	 * Not for Apr. ４月対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon04_invalid_flg = null;
	/**
	 * Not for May ５月対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon05_invalid_flg = null;
	/**
	 * Not for Jun. ６月対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon06_invalid_flg = null;
	/**
	 * Not for July ７月対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon07_invalid_flg = null;
	/**
	 * Not for Aug. ８月対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon08_invalid_flg = null;
	/**
	 * Not for Sep. ９月対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon09_invalid_flg = null;
	/**
	 * Not for Oct. １０月対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon10_invalid_flg = null;
	/**
	 * Not for Nov. １１月対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon11_invalid_flg = null;
	/**
	 * Not for Dec. １２月対象外.<p>
	 *
	 */
	public MCColumnConfig columnDtl_mon12_invalid_flg = null;
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
	 * Auto-journal pattern master entry 自動仕訳パタンマスタ登録.<p>
	 *
	 */
	public MCButton Btn_open_MABCP1060 = null;
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
	
	/** [MA_MABCL1090_Srch01]のCallerの作成 */
	protected MABCP_JnlPtnSrch_MC.MA_MABCL1090_Srch01Caller createMA_MABCL1090_Srch01() {
		MABCP_JnlPtnSrch_MC.MA_MABCL1090_Srch01Caller<MABCP_JnlPtnSrch, MA_MABCL1090_Srch01Bridge>
		caller = ((MABCP_JnlPtnSrch_MC)this).new MA_MABCL1090_Srch01Caller<MABCP_JnlPtnSrch, MA_MABCL1090_Srch01Bridge>(
					(MABCP_JnlPtnSrch)this, new MA_MABCL1090_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL1090_Srch01]の呼び出し */
	protected void callMA_MABCL1090_Srch01() {
		MCCaller caller = createMA_MABCL1090_Srch01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP1090.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP1090.CndR aCndR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP1090.DtlR> aDtlL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP1090.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP1090.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP1090.MstR createMstR() {
		return mcframe.clientMABC.MABCP1090.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP1090.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP1090.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP1090.CndR createCndR() {
		return mcframe.clientMABC.MABCP1090.CndR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABC.MABCP1090.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP1090.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABC.MABCP1090.DtlR createDtlR() {
		return mcframe.clientMABC.MABCP1090.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP1090.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABC.MABCP1090.DtlR.class);
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
		ret.add(SpacePanel);
		ret.add(MstPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(WrkPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_JnlPtnSrch_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_JnlPtnSrch_MC_A(String name) {
		aMstR = createMstR();
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
		MABCP_JnlPtnSrch_MC.jbCreateSpace((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbCreateMst((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbCreateTop((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbCreateFold((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbCreateCnd((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbCreateCtrl((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbCreateWrk((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbCreateDtl((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbCreateBtn((MABCP_JnlPtnSrch)this);
	}

	/**
	 * [Space]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSpace(MABCP_JnlPtnSrch p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_JnlPtnSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_JnlPtnSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_JnlPtnSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_JnlPtnSrch p) {
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
	protected static void jbCreateCtrl(MABCP_JnlPtnSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Wrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk(MABCP_JnlPtnSrch p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABCP_JnlPtnSrch p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABC.MABCP1090.DtlR.$itm_p);
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
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_JnlPtnSrch p) {
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
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_JnlPtnSrch create(){
		MABCP_JnlPtnSrch p = new MABCP_JnlPtnSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_JnlPtnSrch create(String name){
		MABCP_JnlPtnSrch p = new MABCP_JnlPtnSrch(name);
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
		MABCP_JnlPtnSrch_MC.jbfInitSpace((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbfInitMst((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbfInitTop((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbfInitFold((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbfInitCnd((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbfInitCtrl((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbfInitWrk((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbfInitDtl((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbfInitBtn((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbInitSpace((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbInitMst((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbInitTop((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbInitFold((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbInitCnd((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbInitCtrl((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbInitWrk((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbInitDtl((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.jbInitBtn((MABCP_JnlPtnSrch)this);
	}

	/**
	 * [Space]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSpace(MABCP_JnlPtnSrch p) {
		// ブロック関連の初期化
		p.SpacePanel = p.beansFactory.createPanel("Space");
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_JnlPtnSrch p) {
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
	protected static void jbfInitTop(MABCP_JnlPtnSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_JnlPtnSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_JnlPtnSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_jnl_ptn_cd_Label = p.beansFactory.createLabel("Cnd.jnl_ptn_cd_Label");
		p.Cnd_jnl_ptn_cd = p.beansFactory.createTextComboBox("Cnd.jnl_ptn_cd");
		p.Cnd_jnl_ptn_cd.setLabel(p.Cnd_jnl_ptn_cd_Label);
		p.Cnd_jnl_ptn_nm = p.beansFactory.createTextField("Cnd.jnl_ptn_nm");
		p.Cnd_jnl_seq_Label = p.beansFactory.createLabel("Cnd.jnl_seq_Label");
		p.Cnd_jnl_seq = p.beansFactory.createNumberComboBox("Cnd.jnl_seq");
		p.Cnd_jnl_seq.setLabel(p.Cnd_jnl_seq_Label);
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
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABCP_JnlPtnSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk(MABCP_JnlPtnSrch p) {
		// ブロック関連の初期化
		p.WrkPanel = p.beansFactory.createPanel("Wrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABCP_JnlPtnSrch p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_jnl_ptn_cd = p.beansFactory.createTableColumn("Dtl.jnl_ptn_cd", MCColumnType.TEXT);
		p.columnDtl_jnl_ptn_nm = p.beansFactory.createTableColumn("Dtl.jnl_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_jnl_seq = p.beansFactory.createTableColumn("Dtl.jnl_seq", MCColumnType.NUMBER);
		p.columnDtl_dr_dpt_typ = p.beansFactory.createTableColumn("Dtl.dr_dpt_typ", MCColumnType.TEXT);
		p.columnDtl_dr_dpt_typ_nm = p.beansFactory.createTableColumn("Dtl.dr_dpt_typ_nm", MCColumnType.TEXT);
		p.columnDtl_dr_dpt_cd = p.beansFactory.createTableColumn("Dtl.dr_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_dr_dpt_nm = p.beansFactory.createTableColumn("Dtl.dr_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_dr_ptn_typ = p.beansFactory.createTableColumn("Dtl.dr_ptn_typ", MCColumnType.TEXT);
		p.columnDtl_dr_ptn_typ_nm = p.beansFactory.createTableColumn("Dtl.dr_ptn_typ_nm", MCColumnType.TEXT);
		p.columnDtl_dr_grp_cd = p.beansFactory.createTableColumn("Dtl.dr_grp_cd", MCColumnType.TEXT);
		p.columnDtl_dr_grp_nm = p.beansFactory.createTableColumn("Dtl.dr_grp_nm", MCColumnType.TEXT);
		p.columnDtl_cr_dpt_typ = p.beansFactory.createTableColumn("Dtl.cr_dpt_typ", MCColumnType.TEXT);
		p.columnDtl_cr_dpt_typ_nm = p.beansFactory.createTableColumn("Dtl.cr_dpt_typ_nm", MCColumnType.TEXT);
		p.columnDtl_cr_dpt_cd = p.beansFactory.createTableColumn("Dtl.cr_dpt_cd", MCColumnType.TEXT);
		p.columnDtl_cr_dpt_nm = p.beansFactory.createTableColumn("Dtl.cr_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_cr_ptn_typ = p.beansFactory.createTableColumn("Dtl.cr_ptn_typ", MCColumnType.TEXT);
		p.columnDtl_cr_ptn_typ_nm = p.beansFactory.createTableColumn("Dtl.cr_ptn_typ_nm", MCColumnType.TEXT);
		p.columnDtl_cr_grp_cd = p.beansFactory.createTableColumn("Dtl.cr_grp_cd", MCColumnType.TEXT);
		p.columnDtl_cr_grp_nm = p.beansFactory.createTableColumn("Dtl.cr_grp_nm", MCColumnType.TEXT);
		p.columnDtl_dr_ac_cd = p.beansFactory.createTableColumn("Dtl.dr_ac_cd", MCColumnType.TEXT);
		p.columnDtl_dr_ac_nm = p.beansFactory.createTableColumn("Dtl.dr_ac_nm", MCColumnType.TEXT);
		p.columnDtl_dr_sub_ac_cd = p.beansFactory.createTableColumn("Dtl.dr_sub_ac_cd", MCColumnType.TEXT);
		p.columnDtl_dr_sub_ac_nm = p.beansFactory.createTableColumn("Dtl.dr_sub_ac_nm", MCColumnType.TEXT);
		p.columnDtl_cr_ac_cd = p.beansFactory.createTableColumn("Dtl.cr_ac_cd", MCColumnType.TEXT);
		p.columnDtl_cr_ac_nm = p.beansFactory.createTableColumn("Dtl.cr_ac_nm", MCColumnType.TEXT);
		p.columnDtl_cr_sub_ac_cd = p.beansFactory.createTableColumn("Dtl.cr_sub_ac_cd", MCColumnType.TEXT);
		p.columnDtl_cr_sub_ac_nm = p.beansFactory.createTableColumn("Dtl.cr_sub_ac_nm", MCColumnType.TEXT);
		p.columnDtl_dr_ac_tax_cd = p.beansFactory.createTableColumn("Dtl.dr_ac_tax_cd", MCColumnType.TEXT);
		p.columnDtl_dr_ac_tax_nm = p.beansFactory.createTableColumn("Dtl.dr_ac_tax_nm", MCColumnType.TEXT);
		p.columnDtl_cr_ac_tax_cd = p.beansFactory.createTableColumn("Dtl.cr_ac_tax_cd", MCColumnType.TEXT);
		p.columnDtl_cr_ac_tax_nm = p.beansFactory.createTableColumn("Dtl.cr_ac_tax_nm", MCColumnType.TEXT);
		p.columnDtl_dr_bp_typ = p.beansFactory.createTableColumn("Dtl.dr_bp_typ", MCColumnType.TEXT);
		p.columnDtl_dr_bp_typ_nm = p.beansFactory.createTableColumn("Dtl.dr_bp_typ_nm", MCColumnType.TEXT);
		p.columnDtl_dr_bp_cd = p.beansFactory.createTableColumn("Dtl.dr_bp_cd", MCColumnType.TEXT);
		p.columnDtl_dr_bp_nm = p.beansFactory.createTableColumn("Dtl.dr_bp_nm", MCColumnType.TEXT);
		p.columnDtl_cr_bp_typ = p.beansFactory.createTableColumn("Dtl.cr_bp_typ", MCColumnType.TEXT);
		p.columnDtl_cr_bp_typ_nm = p.beansFactory.createTableColumn("Dtl.cr_bp_typ_nm", MCColumnType.TEXT);
		p.columnDtl_cr_bp_cd = p.beansFactory.createTableColumn("Dtl.cr_bp_cd", MCColumnType.TEXT);
		p.columnDtl_cr_bp_nm = p.beansFactory.createTableColumn("Dtl.cr_bp_nm", MCColumnType.TEXT);
		p.columnDtl_dr_itm_typ = p.beansFactory.createTableColumn("Dtl.dr_itm_typ", MCColumnType.TEXT);
		p.columnDtl_dr_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.dr_itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_cr_itm_typ = p.beansFactory.createTableColumn("Dtl.cr_itm_typ", MCColumnType.TEXT);
		p.columnDtl_cr_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.cr_itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_dr_trd_sml_flg = p.beansFactory.createTableColumn("Dtl.dr_trd_sml_flg", MCColumnType.CHECK);
		p.columnDtl_cr_trd_sml_flg = p.beansFactory.createTableColumn("Dtl.cr_trd_sml_flg", MCColumnType.CHECK);
		p.columnDtl_minus_flg = p.beansFactory.createTableColumn("Dtl.minus_flg", MCColumnType.CHECK);
		p.columnDtl_dr_amt_typ = p.beansFactory.createTableColumn("Dtl.dr_amt_typ", MCColumnType.TEXT);
		p.columnDtl_dr_amt_typ_nm = p.beansFactory.createTableColumn("Dtl.dr_amt_typ_nm", MCColumnType.TEXT);
		p.columnDtl_cr_amt_typ = p.beansFactory.createTableColumn("Dtl.cr_amt_typ", MCColumnType.TEXT);
		p.columnDtl_cr_amt_typ_nm = p.beansFactory.createTableColumn("Dtl.cr_amt_typ_nm", MCColumnType.TEXT);
		p.columnDtl_itm_jnl_cd = p.beansFactory.createTableColumn("Dtl.itm_jnl_cd", MCColumnType.TEXT);
		p.columnDtl_itm_jnl_nm = p.beansFactory.createTableColumn("Dtl.itm_jnl_nm", MCColumnType.TEXT);
		p.columnDtl_ac_rsn_cd = p.beansFactory.createTableColumn("Dtl.ac_rsn_cd", MCColumnType.TEXT);
		p.columnDtl_ac_rsn_nm = p.beansFactory.createTableColumn("Dtl.ac_rsn_nm", MCColumnType.TEXT);
		p.columnDtl_purc_typ = p.beansFactory.createTableColumn("Dtl.purc_typ", MCColumnType.TEXT);
		p.columnDtl_purc_typ_nm = p.beansFactory.createTableColumn("Dtl.purc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_un_fix_typ = p.beansFactory.createTableColumn("Dtl.un_fix_typ", MCColumnType.TEXT);
		p.columnDtl_un_fix_typ_nm = p.beansFactory.createTableColumn("Dtl.un_fix_typ_nm", MCColumnType.TEXT);
		p.columnDtl_foreign_typ = p.beansFactory.createTableColumn("Dtl.foreign_typ", MCColumnType.TEXT);
		p.columnDtl_foreign_typ_nm = p.beansFactory.createTableColumn("Dtl.foreign_typ_nm", MCColumnType.TEXT);
		p.columnDtl_cur_cd = p.beansFactory.createTableColumn("Dtl.cur_cd", MCColumnType.TEXT);
		p.columnDtl_cur_nm = p.beansFactory.createTableColumn("Dtl.cur_nm", MCColumnType.TEXT);
		p.columnDtl_asst_typ = p.beansFactory.createTableColumn("Dtl.asst_typ", MCColumnType.TEXT);
		p.columnDtl_asst_typ_nm = p.beansFactory.createTableColumn("Dtl.asst_typ_nm", MCColumnType.TEXT);
		p.columnDtl_quality_typ = p.beansFactory.createTableColumn("Dtl.quality_typ", MCColumnType.TEXT);
		p.columnDtl_quality_typ_nm = p.beansFactory.createTableColumn("Dtl.quality_typ_nm", MCColumnType.TEXT);
		p.columnDtl_inv_loc_typ = p.beansFactory.createTableColumn("Dtl.inv_loc_typ", MCColumnType.TEXT);
		p.columnDtl_inv_loc_typ_nm = p.beansFactory.createTableColumn("Dtl.inv_loc_typ_nm", MCColumnType.TEXT);
		p.columnDtl_amt_sign_typ = p.beansFactory.createTableColumn("Dtl.amt_sign_typ", MCColumnType.TEXT);
		p.columnDtl_amt_sign_typ_nm = p.beansFactory.createTableColumn("Dtl.amt_sign_typ_nm", MCColumnType.TEXT);
		p.columnDtl_jnl_key1 = p.beansFactory.createTableColumn("Dtl.jnl_key1", MCColumnType.TEXT);
		p.columnDtl_jnl_key2 = p.beansFactory.createTableColumn("Dtl.jnl_key2", MCColumnType.TEXT);
		p.columnDtl_jnl_key3 = p.beansFactory.createTableColumn("Dtl.jnl_key3", MCColumnType.TEXT);
		p.columnDtl_jnl_key4 = p.beansFactory.createTableColumn("Dtl.jnl_key4", MCColumnType.TEXT);
		p.columnDtl_jnl_key5 = p.beansFactory.createTableColumn("Dtl.jnl_key5", MCColumnType.TEXT);
		p.columnDtl_jnl_key6 = p.beansFactory.createTableColumn("Dtl.jnl_key6", MCColumnType.TEXT);
		p.columnDtl_jnl_key7 = p.beansFactory.createTableColumn("Dtl.jnl_key7", MCColumnType.TEXT);
		p.columnDtl_jnl_key8 = p.beansFactory.createTableColumn("Dtl.jnl_key8", MCColumnType.TEXT);
		p.columnDtl_jnl_key9 = p.beansFactory.createTableColumn("Dtl.jnl_key9", MCColumnType.TEXT);
		p.columnDtl_jnl_key10 = p.beansFactory.createTableColumn("Dtl.jnl_key10", MCColumnType.TEXT);
		p.columnDtl_carry_flg = p.beansFactory.createTableColumn("Dtl.carry_flg", MCColumnType.CHECK);
		p.columnDtl_dr_abs_typ = p.beansFactory.createTableColumn("Dtl.dr_abs_typ", MCColumnType.TEXT);
		p.columnDtl_dr_abs_typ_nm = p.beansFactory.createTableColumn("Dtl.dr_abs_typ_nm", MCColumnType.TEXT);
		p.columnDtl_dr_abstract = p.beansFactory.createTableColumn("Dtl.dr_abstract", MCColumnType.TEXT);
		p.columnDtl_cr_abs_typ = p.beansFactory.createTableColumn("Dtl.cr_abs_typ", MCColumnType.TEXT);
		p.columnDtl_cr_abs_typ_nm = p.beansFactory.createTableColumn("Dtl.cr_abs_typ_nm", MCColumnType.TEXT);
		p.columnDtl_cr_abstract = p.beansFactory.createTableColumn("Dtl.cr_abstract", MCColumnType.TEXT);
		p.columnDtl_mon01_invalid_flg = p.beansFactory.createTableColumn("Dtl.mon01_invalid_flg", MCColumnType.CHECK);
		p.columnDtl_mon02_invalid_flg = p.beansFactory.createTableColumn("Dtl.mon02_invalid_flg", MCColumnType.CHECK);
		p.columnDtl_mon03_invalid_flg = p.beansFactory.createTableColumn("Dtl.mon03_invalid_flg", MCColumnType.CHECK);
		p.columnDtl_mon04_invalid_flg = p.beansFactory.createTableColumn("Dtl.mon04_invalid_flg", MCColumnType.CHECK);
		p.columnDtl_mon05_invalid_flg = p.beansFactory.createTableColumn("Dtl.mon05_invalid_flg", MCColumnType.CHECK);
		p.columnDtl_mon06_invalid_flg = p.beansFactory.createTableColumn("Dtl.mon06_invalid_flg", MCColumnType.CHECK);
		p.columnDtl_mon07_invalid_flg = p.beansFactory.createTableColumn("Dtl.mon07_invalid_flg", MCColumnType.CHECK);
		p.columnDtl_mon08_invalid_flg = p.beansFactory.createTableColumn("Dtl.mon08_invalid_flg", MCColumnType.CHECK);
		p.columnDtl_mon09_invalid_flg = p.beansFactory.createTableColumn("Dtl.mon09_invalid_flg", MCColumnType.CHECK);
		p.columnDtl_mon10_invalid_flg = p.beansFactory.createTableColumn("Dtl.mon10_invalid_flg", MCColumnType.CHECK);
		p.columnDtl_mon11_invalid_flg = p.beansFactory.createTableColumn("Dtl.mon11_invalid_flg", MCColumnType.CHECK);
		p.columnDtl_mon12_invalid_flg = p.beansFactory.createTableColumn("Dtl.mon12_invalid_flg", MCColumnType.CHECK);
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
	protected static void jbfInitBtn(MABCP_JnlPtnSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MABCP1060 = p.beansFactory.createButton("Btn.open_MABCP1060", "open");
	}

	/**
	 * [Space]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSpace(MABCP_JnlPtnSrch p) {
		// ブロック関連の初期化
		p.add(p.SpacePanel);
		p.setLastBeans(p.SpacePanel);
		p.SpacePanel.setNextBeans(p.MstPanel);
		p.SpacePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMst(MABCP_JnlPtnSrch p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.TopPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP1090.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_JnlPtnSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.WrkPanel);
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
	protected static void jbInitFold(MABCP_JnlPtnSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_JnlPtnSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.Cnd_jnl_ptn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_jnl_ptn_cd, true);
		p.Cnd_jnl_ptn_cd.setLinkBeans(p.Cnd_jnl_ptn_nm);
		p.CndPanel.add(p.Cnd_jnl_ptn_cd_Label);
		p.CndPanel.add(p.Cnd_jnl_ptn_cd);
		p.CndPanel.setLastBeans(p.Cnd_jnl_ptn_cd);
		p.Cnd_jnl_ptn_cd.setNextBeans(p.Cnd_jnl_ptn_nm);
		p.Cnd_jnl_ptn_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP1090.CndR.jnl_ptn_cd_META);
		p.CndPanel.add(p.Cnd_jnl_ptn_nm);
		p.Cnd_jnl_ptn_nm.setNextBeans(p.Cnd_jnl_seq);
		p.Cnd_jnl_ptn_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP1090.CndR.jnl_ptn_nm_META);
		p.setPluralValueEnable(p.Cnd_jnl_ptn_nm, true);
		p.Cnd_jnl_seq.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_jnl_seq_Label);
		p.CndPanel.add(p.Cnd_jnl_seq);
		p.Cnd_jnl_seq.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_jnl_seq.setRow(p.getCndR(), mcframe.clientMABC.MABCP1090.CndR.jnl_seq_META);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_memo1);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABC.MABCP1090.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABC.MABCP1090.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABC.MABCP1090.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP1090.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP1090.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_JnlPtnSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk(MABCP_JnlPtnSrch p) {
		// ブロック関連の初期化
		p.add(p.WrkPanel);
		p.WrkPanel.setNextBeans(p.BtnPanel);
		p.WrkPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.WrkPanel.add(p.DtlPanel, null);
		p.WrkPanel.setLastBeans(p.DtlPanel);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABCP_JnlPtnSrch p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABCP_JnlPtnSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MABCP1060.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MABCP1060);
		p.BtnPanel.setLastBeans(p.Btn_open_MABCP1060);
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
		MABCP_JnlPtnSrch_MC.mcInitSpace((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.mcInitMst((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.mcInitTop((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.mcInitFold((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.mcInitCnd((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.mcInitCtrl((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.mcInitWrk((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.mcInitDtl((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.mcInitBtn((MABCP_JnlPtnSrch)this);

		// [SRCH]ステータスのモードの設定
		MABCP_JnlPtnSrch_MC.statusInitSRCH_Space((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.statusInitSRCH_Mst((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.statusInitSRCH_Top((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.statusInitSRCH_Fold((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.statusInitSRCH_Cnd((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.statusInitSRCH_Ctrl((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.statusInitSRCH_Wrk((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.statusInitSRCH_Dtl((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.statusInitSRCH_Btn((MABCP_JnlPtnSrch)this);

		// [REF]ステータスのモードの設定
		MABCP_JnlPtnSrch_MC.statusInitREF_Space((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.statusInitREF_Mst((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.statusInitREF_Top((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.statusInitREF_Fold((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.statusInitREF_Cnd((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.statusInitREF_Ctrl((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.statusInitREF_Wrk((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.statusInitREF_Dtl((MABCP_JnlPtnSrch)this);
		MABCP_JnlPtnSrch_MC.statusInitREF_Btn((MABCP_JnlPtnSrch)this);

	}

	/**
	 *  [Space]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSpace(MABCP_JnlPtnSrch p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_JnlPtnSrch p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_JnlPtnSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_JnlPtnSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_JnlPtnSrch p) {
		p.Cnd_jnl_ptn_cd.setListListener(p);
		p.Cnd_jnl_ptn_cd.addAllListener(p);
		p.Cnd_jnl_ptn_nm.setListListener(p);
		p.Cnd_jnl_ptn_nm.addAllListener(p);
		p.Cnd_jnl_seq.setListListener(p);
		p.Cnd_jnl_seq.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABCP_JnlPtnSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Wrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk(MABCP_JnlPtnSrch p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABCP_JnlPtnSrch p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_jnl_ptn_cd.addAllListener(p);
		p.columnDtl_jnl_ptn_cd.setListListener(p);
		p.columnDtl_jnl_ptn_nm.addAllListener(p);
		p.columnDtl_jnl_ptn_nm.setListListener(p);
		p.columnDtl_jnl_seq.addAllListener(p);
		p.columnDtl_jnl_seq.setListListener(p);
		p.columnDtl_dr_dpt_typ.addAllListener(p);
		p.columnDtl_dr_dpt_typ.setListListener(p);
		p.columnDtl_dr_dpt_typ_nm.addAllListener(p);
		p.columnDtl_dr_dpt_typ_nm.setListListener(p);
		p.columnDtl_dr_dpt_cd.addAllListener(p);
		p.columnDtl_dr_dpt_cd.setListListener(p);
		p.columnDtl_dr_dpt_nm.addAllListener(p);
		p.columnDtl_dr_dpt_nm.setListListener(p);
		p.columnDtl_dr_ptn_typ.addAllListener(p);
		p.columnDtl_dr_ptn_typ.setListListener(p);
		p.columnDtl_dr_ptn_typ_nm.addAllListener(p);
		p.columnDtl_dr_ptn_typ_nm.setListListener(p);
		p.columnDtl_dr_grp_cd.addAllListener(p);
		p.columnDtl_dr_grp_cd.setListListener(p);
		p.columnDtl_dr_grp_nm.addAllListener(p);
		p.columnDtl_dr_grp_nm.setListListener(p);
		p.columnDtl_cr_dpt_typ.addAllListener(p);
		p.columnDtl_cr_dpt_typ.setListListener(p);
		p.columnDtl_cr_dpt_typ_nm.addAllListener(p);
		p.columnDtl_cr_dpt_typ_nm.setListListener(p);
		p.columnDtl_cr_dpt_cd.addAllListener(p);
		p.columnDtl_cr_dpt_cd.setListListener(p);
		p.columnDtl_cr_dpt_nm.addAllListener(p);
		p.columnDtl_cr_dpt_nm.setListListener(p);
		p.columnDtl_cr_ptn_typ.addAllListener(p);
		p.columnDtl_cr_ptn_typ.setListListener(p);
		p.columnDtl_cr_ptn_typ_nm.addAllListener(p);
		p.columnDtl_cr_ptn_typ_nm.setListListener(p);
		p.columnDtl_cr_grp_cd.addAllListener(p);
		p.columnDtl_cr_grp_cd.setListListener(p);
		p.columnDtl_cr_grp_nm.addAllListener(p);
		p.columnDtl_cr_grp_nm.setListListener(p);
		p.columnDtl_dr_ac_cd.addAllListener(p);
		p.columnDtl_dr_ac_cd.setListListener(p);
		p.columnDtl_dr_ac_nm.addAllListener(p);
		p.columnDtl_dr_ac_nm.setListListener(p);
		p.columnDtl_dr_sub_ac_cd.addAllListener(p);
		p.columnDtl_dr_sub_ac_cd.setListListener(p);
		p.columnDtl_dr_sub_ac_nm.addAllListener(p);
		p.columnDtl_dr_sub_ac_nm.setListListener(p);
		p.columnDtl_cr_ac_cd.addAllListener(p);
		p.columnDtl_cr_ac_cd.setListListener(p);
		p.columnDtl_cr_ac_nm.addAllListener(p);
		p.columnDtl_cr_ac_nm.setListListener(p);
		p.columnDtl_cr_sub_ac_cd.addAllListener(p);
		p.columnDtl_cr_sub_ac_cd.setListListener(p);
		p.columnDtl_cr_sub_ac_nm.addAllListener(p);
		p.columnDtl_cr_sub_ac_nm.setListListener(p);
		p.columnDtl_dr_ac_tax_cd.addAllListener(p);
		p.columnDtl_dr_ac_tax_cd.setListListener(p);
		p.columnDtl_dr_ac_tax_nm.addAllListener(p);
		p.columnDtl_dr_ac_tax_nm.setListListener(p);
		p.columnDtl_cr_ac_tax_cd.addAllListener(p);
		p.columnDtl_cr_ac_tax_cd.setListListener(p);
		p.columnDtl_cr_ac_tax_nm.addAllListener(p);
		p.columnDtl_cr_ac_tax_nm.setListListener(p);
		p.columnDtl_dr_bp_typ.addAllListener(p);
		p.columnDtl_dr_bp_typ.setListListener(p);
		p.columnDtl_dr_bp_typ_nm.addAllListener(p);
		p.columnDtl_dr_bp_typ_nm.setListListener(p);
		p.columnDtl_dr_bp_cd.addAllListener(p);
		p.columnDtl_dr_bp_cd.setListListener(p);
		p.columnDtl_dr_bp_nm.addAllListener(p);
		p.columnDtl_dr_bp_nm.setListListener(p);
		p.columnDtl_cr_bp_typ.addAllListener(p);
		p.columnDtl_cr_bp_typ.setListListener(p);
		p.columnDtl_cr_bp_typ_nm.addAllListener(p);
		p.columnDtl_cr_bp_typ_nm.setListListener(p);
		p.columnDtl_cr_bp_cd.addAllListener(p);
		p.columnDtl_cr_bp_cd.setListListener(p);
		p.columnDtl_cr_bp_nm.addAllListener(p);
		p.columnDtl_cr_bp_nm.setListListener(p);
		p.columnDtl_dr_itm_typ.addAllListener(p);
		p.columnDtl_dr_itm_typ.setListListener(p);
		p.columnDtl_dr_itm_typ_nm.addAllListener(p);
		p.columnDtl_dr_itm_typ_nm.setListListener(p);
		p.columnDtl_cr_itm_typ.addAllListener(p);
		p.columnDtl_cr_itm_typ.setListListener(p);
		p.columnDtl_cr_itm_typ_nm.addAllListener(p);
		p.columnDtl_cr_itm_typ_nm.setListListener(p);
		p.columnDtl_dr_trd_sml_flg.addAllListener(p);
		p.columnDtl_cr_trd_sml_flg.addAllListener(p);
		p.columnDtl_minus_flg.addAllListener(p);
		p.columnDtl_dr_amt_typ.addAllListener(p);
		p.columnDtl_dr_amt_typ.setListListener(p);
		p.columnDtl_dr_amt_typ_nm.addAllListener(p);
		p.columnDtl_dr_amt_typ_nm.setListListener(p);
		p.columnDtl_cr_amt_typ.addAllListener(p);
		p.columnDtl_cr_amt_typ.setListListener(p);
		p.columnDtl_cr_amt_typ_nm.addAllListener(p);
		p.columnDtl_cr_amt_typ_nm.setListListener(p);
		p.columnDtl_itm_jnl_cd.addAllListener(p);
		p.columnDtl_itm_jnl_cd.setListListener(p);
		p.columnDtl_itm_jnl_nm.addAllListener(p);
		p.columnDtl_itm_jnl_nm.setListListener(p);
		p.columnDtl_ac_rsn_cd.addAllListener(p);
		p.columnDtl_ac_rsn_cd.setListListener(p);
		p.columnDtl_ac_rsn_nm.addAllListener(p);
		p.columnDtl_ac_rsn_nm.setListListener(p);
		p.columnDtl_purc_typ.addAllListener(p);
		p.columnDtl_purc_typ.setListListener(p);
		p.columnDtl_purc_typ_nm.addAllListener(p);
		p.columnDtl_purc_typ_nm.setListListener(p);
		p.columnDtl_un_fix_typ.addAllListener(p);
		p.columnDtl_un_fix_typ.setListListener(p);
		p.columnDtl_un_fix_typ_nm.addAllListener(p);
		p.columnDtl_un_fix_typ_nm.setListListener(p);
		p.columnDtl_foreign_typ.addAllListener(p);
		p.columnDtl_foreign_typ.setListListener(p);
		p.columnDtl_foreign_typ_nm.addAllListener(p);
		p.columnDtl_foreign_typ_nm.setListListener(p);
		p.columnDtl_cur_cd.addAllListener(p);
		p.columnDtl_cur_cd.setListListener(p);
		p.columnDtl_cur_nm.addAllListener(p);
		p.columnDtl_cur_nm.setListListener(p);
		p.columnDtl_asst_typ.addAllListener(p);
		p.columnDtl_asst_typ.setListListener(p);
		p.columnDtl_asst_typ_nm.addAllListener(p);
		p.columnDtl_asst_typ_nm.setListListener(p);
		p.columnDtl_quality_typ.addAllListener(p);
		p.columnDtl_quality_typ.setListListener(p);
		p.columnDtl_quality_typ_nm.addAllListener(p);
		p.columnDtl_quality_typ_nm.setListListener(p);
		p.columnDtl_inv_loc_typ.addAllListener(p);
		p.columnDtl_inv_loc_typ.setListListener(p);
		p.columnDtl_inv_loc_typ_nm.addAllListener(p);
		p.columnDtl_inv_loc_typ_nm.setListListener(p);
		p.columnDtl_amt_sign_typ.addAllListener(p);
		p.columnDtl_amt_sign_typ.setListListener(p);
		p.columnDtl_amt_sign_typ_nm.addAllListener(p);
		p.columnDtl_amt_sign_typ_nm.setListListener(p);
		p.columnDtl_jnl_key1.addAllListener(p);
		p.columnDtl_jnl_key1.setListListener(p);
		p.columnDtl_jnl_key2.addAllListener(p);
		p.columnDtl_jnl_key2.setListListener(p);
		p.columnDtl_jnl_key3.addAllListener(p);
		p.columnDtl_jnl_key3.setListListener(p);
		p.columnDtl_jnl_key4.addAllListener(p);
		p.columnDtl_jnl_key4.setListListener(p);
		p.columnDtl_jnl_key5.addAllListener(p);
		p.columnDtl_jnl_key5.setListListener(p);
		p.columnDtl_jnl_key6.addAllListener(p);
		p.columnDtl_jnl_key6.setListListener(p);
		p.columnDtl_jnl_key7.addAllListener(p);
		p.columnDtl_jnl_key7.setListListener(p);
		p.columnDtl_jnl_key8.addAllListener(p);
		p.columnDtl_jnl_key8.setListListener(p);
		p.columnDtl_jnl_key9.addAllListener(p);
		p.columnDtl_jnl_key9.setListListener(p);
		p.columnDtl_jnl_key10.addAllListener(p);
		p.columnDtl_jnl_key10.setListListener(p);
		p.columnDtl_carry_flg.addAllListener(p);
		p.columnDtl_dr_abs_typ.addAllListener(p);
		p.columnDtl_dr_abs_typ.setListListener(p);
		p.columnDtl_dr_abs_typ_nm.addAllListener(p);
		p.columnDtl_dr_abs_typ_nm.setListListener(p);
		p.columnDtl_dr_abstract.addAllListener(p);
		p.columnDtl_dr_abstract.setListListener(p);
		p.columnDtl_cr_abs_typ.addAllListener(p);
		p.columnDtl_cr_abs_typ.setListListener(p);
		p.columnDtl_cr_abs_typ_nm.addAllListener(p);
		p.columnDtl_cr_abs_typ_nm.setListListener(p);
		p.columnDtl_cr_abstract.addAllListener(p);
		p.columnDtl_cr_abstract.setListListener(p);
		p.columnDtl_mon01_invalid_flg.addAllListener(p);
		p.columnDtl_mon02_invalid_flg.addAllListener(p);
		p.columnDtl_mon03_invalid_flg.addAllListener(p);
		p.columnDtl_mon04_invalid_flg.addAllListener(p);
		p.columnDtl_mon05_invalid_flg.addAllListener(p);
		p.columnDtl_mon06_invalid_flg.addAllListener(p);
		p.columnDtl_mon07_invalid_flg.addAllListener(p);
		p.columnDtl_mon08_invalid_flg.addAllListener(p);
		p.columnDtl_mon09_invalid_flg.addAllListener(p);
		p.columnDtl_mon10_invalid_flg.addAllListener(p);
		p.columnDtl_mon11_invalid_flg.addAllListener(p);
		p.columnDtl_mon12_invalid_flg.addAllListener(p);
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
	protected static void mcInitBtn(MABCP_JnlPtnSrch p) {
		p.Btn_open_MABCP1060.addAllListener(p);
		p.Btn_open_MABCP1060.setAPMethodName("doBtn_open_MABCP1060");
	}

	/**
	 * [SRCH]ステータスの[Space]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Space(MABCP_JnlPtnSrch p){

	}

	/**
	 * [SRCH]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Mst(MABCP_JnlPtnSrch p){
		p.Mst_mst_set_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MABCP_JnlPtnSrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MABCP_JnlPtnSrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MABCP_JnlPtnSrch p){
		p.Cnd_jnl_ptn_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_jnl_ptn_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_jnl_seq.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_memo1.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MABCP_JnlPtnSrch p){

	}

	/**
	 * [SRCH]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk(MABCP_JnlPtnSrch p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MABCP_JnlPtnSrch p){
		p.columnDtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_jnl_ptn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_jnl_ptn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_jnl_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_dpt_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_dpt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_ptn_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_ptn_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_dpt_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_dpt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_ptn_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_ptn_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_sub_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_sub_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_sub_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_sub_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_ac_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_ac_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_ac_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_ac_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_bp_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_bp_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_bp_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_bp_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_trd_sml_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_trd_sml_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_minus_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_amt_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_amt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_amt_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_amt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_purc_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_un_fix_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_un_fix_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_foreign_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_foreign_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_asst_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_asst_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_inv_loc_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_inv_loc_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_amt_sign_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_amt_sign_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_jnl_key1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_jnl_key2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_jnl_key3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_jnl_key4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_jnl_key5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_jnl_key6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_jnl_key7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_jnl_key8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_jnl_key9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_jnl_key10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_carry_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_abs_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_abs_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dr_abstract.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_abs_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_abs_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cr_abstract.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mon01_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mon02_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mon03_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mon04_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mon05_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mon06_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mon07_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mon08_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mon09_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mon10_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mon11_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_mon12_invalid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MABCP_JnlPtnSrch p){
		p.Btn_open_MABCP1060.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Space]ブロックのモードの設定
	 */
	protected static void statusInitREF_Space(MABCP_JnlPtnSrch p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_JnlPtnSrch p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_JnlPtnSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_JnlPtnSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_JnlPtnSrch p){
		p.Cnd_jnl_ptn_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_jnl_ptn_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_jnl_seq.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_JnlPtnSrch p){

	}

	/**
	 * [REF]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk(MABCP_JnlPtnSrch p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABCP_JnlPtnSrch p){
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_jnl_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_jnl_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_jnl_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_dpt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_dpt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_ptn_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_ptn_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_dpt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_dpt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_ptn_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_ptn_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_sub_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_sub_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_sub_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_sub_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_ac_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_ac_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_ac_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_ac_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_bp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_bp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_bp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_bp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_trd_sml_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_trd_sml_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_minus_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_amt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_amt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_amt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_amt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_purc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_un_fix_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_un_fix_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_foreign_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_foreign_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inv_loc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inv_loc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_amt_sign_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_amt_sign_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_jnl_key1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_jnl_key2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_jnl_key3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_jnl_key4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_jnl_key5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_jnl_key6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_jnl_key7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_jnl_key8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_jnl_key9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_jnl_key10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_carry_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_abs_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_abs_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dr_abstract.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_abs_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_abs_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cr_abstract.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mon01_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mon02_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mon03_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mon04_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mon05_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mon06_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mon07_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mon08_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mon09_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mon10_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mon11_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_mon12_invalid_flg.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_Btn(MABCP_JnlPtnSrch p){
		p.Btn_open_MABCP1060.putMode(p, REF, MCMode.ENABLE);

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
		MABCP_JnlPtnSrch_MC.setTableConfigDtl((MABCP_JnlPtnSrch)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABCP_JnlPtnSrch p) {
		p.columnDtl_del_flg.setMeta(mcframe.clientMABC.MABCP1090.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_jnl_ptn_cd.setMeta(mcframe.clientMABC.MABCP1090.DtlR.jnl_ptn_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_jnl_ptn_cd);
		p.columnDtl_jnl_ptn_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.jnl_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_jnl_ptn_nm);
		p.columnDtl_jnl_seq.setMeta(mcframe.clientMABC.MABCP1090.DtlR.jnl_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_jnl_seq);
		p.columnDtl_dr_dpt_typ.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_dpt_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_dpt_typ);
		p.columnDtl_dr_dpt_typ_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_dpt_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_dpt_typ_nm);
		p.columnDtl_dr_dpt_cd.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_dpt_cd);
		p.columnDtl_dr_dpt_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_dpt_nm);
		p.columnDtl_dr_ptn_typ.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_ptn_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_ptn_typ);
		p.columnDtl_dr_ptn_typ_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_ptn_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_ptn_typ_nm);
		p.columnDtl_dr_grp_cd.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_grp_cd);
		p.columnDtl_dr_grp_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_grp_nm);
		p.columnDtl_cr_dpt_typ.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_dpt_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_dpt_typ);
		p.columnDtl_cr_dpt_typ_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_dpt_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_dpt_typ_nm);
		p.columnDtl_cr_dpt_cd.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_dpt_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_dpt_cd);
		p.columnDtl_cr_dpt_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_dpt_nm);
		p.columnDtl_cr_ptn_typ.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_ptn_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_ptn_typ);
		p.columnDtl_cr_ptn_typ_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_ptn_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_ptn_typ_nm);
		p.columnDtl_cr_grp_cd.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_grp_cd);
		p.columnDtl_cr_grp_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_grp_nm);
		p.columnDtl_dr_ac_cd.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_ac_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_ac_cd);
		p.columnDtl_dr_ac_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_ac_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_ac_nm);
		p.columnDtl_dr_sub_ac_cd.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_sub_ac_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_sub_ac_cd);
		p.columnDtl_dr_sub_ac_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_sub_ac_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_sub_ac_nm);
		p.columnDtl_cr_ac_cd.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_ac_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_ac_cd);
		p.columnDtl_cr_ac_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_ac_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_ac_nm);
		p.columnDtl_cr_sub_ac_cd.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_sub_ac_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_sub_ac_cd);
		p.columnDtl_cr_sub_ac_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_sub_ac_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_sub_ac_nm);
		p.columnDtl_dr_ac_tax_cd.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_ac_tax_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_ac_tax_cd);
		p.columnDtl_dr_ac_tax_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_ac_tax_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_ac_tax_nm);
		p.columnDtl_cr_ac_tax_cd.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_ac_tax_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_ac_tax_cd);
		p.columnDtl_cr_ac_tax_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_ac_tax_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_ac_tax_nm);
		p.columnDtl_dr_bp_typ.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_bp_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_bp_typ);
		p.columnDtl_dr_bp_typ_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_bp_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_bp_typ_nm);
		p.columnDtl_dr_bp_cd.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_bp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_bp_cd);
		p.columnDtl_dr_bp_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_bp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_bp_nm);
		p.columnDtl_cr_bp_typ.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_bp_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_bp_typ);
		p.columnDtl_cr_bp_typ_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_bp_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_bp_typ_nm);
		p.columnDtl_cr_bp_cd.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_bp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_bp_cd);
		p.columnDtl_cr_bp_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_bp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_bp_nm);
		p.columnDtl_dr_itm_typ.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_itm_typ);
		p.columnDtl_dr_itm_typ_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_itm_typ_nm);
		p.columnDtl_cr_itm_typ.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_itm_typ);
		p.columnDtl_cr_itm_typ_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_itm_typ_nm);
		p.columnDtl_dr_trd_sml_flg.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_trd_sml_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_trd_sml_flg);
		p.columnDtl_cr_trd_sml_flg.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_trd_sml_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_trd_sml_flg);
		p.columnDtl_minus_flg.setMeta(mcframe.clientMABC.MABCP1090.DtlR.minus_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_minus_flg);
		p.columnDtl_dr_amt_typ.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_amt_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_amt_typ);
		p.columnDtl_dr_amt_typ_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_amt_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_amt_typ_nm);
		p.columnDtl_cr_amt_typ.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_amt_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_amt_typ);
		p.columnDtl_cr_amt_typ_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_amt_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_amt_typ_nm);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.columnDtl_itm_jnl_cd.setMeta(mcframe.clientMABC.MABCP1090.DtlR.itm_jnl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_jnl_cd);
		p.columnDtl_itm_jnl_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.itm_jnl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_jnl_nm);
		p.columnDtl_ac_rsn_cd.setMeta(mcframe.clientMABC.MABCP1090.DtlR.ac_rsn_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_rsn_cd);
		p.columnDtl_ac_rsn_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.ac_rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_rsn_nm);
		p.columnDtl_purc_typ.setMeta(mcframe.clientMABC.MABCP1090.DtlR.purc_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_typ);
		p.columnDtl_purc_typ_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.purc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_purc_typ_nm);
		p.columnDtl_un_fix_typ.setMeta(mcframe.clientMABC.MABCP1090.DtlR.un_fix_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_un_fix_typ);
		p.columnDtl_un_fix_typ_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.un_fix_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_un_fix_typ_nm);
		p.columnDtl_foreign_typ.setMeta(mcframe.clientMABC.MABCP1090.DtlR.foreign_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_foreign_typ);
		p.columnDtl_foreign_typ_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.foreign_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_foreign_typ_nm);
		p.columnDtl_cur_cd.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cur_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cur_cd);
		p.columnDtl_cur_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cur_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cur_nm);
		p.columnDtl_asst_typ.setMeta(mcframe.clientMABC.MABCP1090.DtlR.asst_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asst_typ);
		p.columnDtl_asst_typ_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.asst_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asst_typ_nm);
		p.columnDtl_quality_typ.setMeta(mcframe.clientMABC.MABCP1090.DtlR.quality_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_quality_typ);
		p.columnDtl_quality_typ_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.quality_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_quality_typ_nm);
		p.columnDtl_inv_loc_typ.setMeta(mcframe.clientMABC.MABCP1090.DtlR.inv_loc_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inv_loc_typ);
		p.columnDtl_inv_loc_typ_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.inv_loc_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inv_loc_typ_nm);
		p.columnDtl_amt_sign_typ.setMeta(mcframe.clientMABC.MABCP1090.DtlR.amt_sign_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_amt_sign_typ);
		p.columnDtl_amt_sign_typ_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.amt_sign_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_amt_sign_typ_nm);
		p.columnDtl_jnl_key1.setMeta(mcframe.clientMABC.MABCP1090.DtlR.jnl_key1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_jnl_key1);
		p.columnDtl_jnl_key2.setMeta(mcframe.clientMABC.MABCP1090.DtlR.jnl_key2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_jnl_key2);
		p.columnDtl_jnl_key3.setMeta(mcframe.clientMABC.MABCP1090.DtlR.jnl_key3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_jnl_key3);
		p.columnDtl_jnl_key4.setMeta(mcframe.clientMABC.MABCP1090.DtlR.jnl_key4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_jnl_key4);
		p.columnDtl_jnl_key5.setMeta(mcframe.clientMABC.MABCP1090.DtlR.jnl_key5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_jnl_key5);
		p.columnDtl_jnl_key6.setMeta(mcframe.clientMABC.MABCP1090.DtlR.jnl_key6_META);
		p.DtlTable.addColumnConfig(p.columnDtl_jnl_key6);
		p.columnDtl_jnl_key7.setMeta(mcframe.clientMABC.MABCP1090.DtlR.jnl_key7_META);
		p.DtlTable.addColumnConfig(p.columnDtl_jnl_key7);
		p.columnDtl_jnl_key8.setMeta(mcframe.clientMABC.MABCP1090.DtlR.jnl_key8_META);
		p.DtlTable.addColumnConfig(p.columnDtl_jnl_key8);
		p.columnDtl_jnl_key9.setMeta(mcframe.clientMABC.MABCP1090.DtlR.jnl_key9_META);
		p.DtlTable.addColumnConfig(p.columnDtl_jnl_key9);
		p.columnDtl_jnl_key10.setMeta(mcframe.clientMABC.MABCP1090.DtlR.jnl_key10_META);
		p.DtlTable.addColumnConfig(p.columnDtl_jnl_key10);
		p.columnDtl_carry_flg.setMeta(mcframe.clientMABC.MABCP1090.DtlR.carry_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_carry_flg);
		p.columnDtl_dr_abs_typ.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_abs_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_abs_typ);
		p.columnDtl_dr_abs_typ_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_abs_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_abs_typ_nm);
		p.columnDtl_dr_abstract.setMeta(mcframe.clientMABC.MABCP1090.DtlR.dr_abstract_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dr_abstract);
		p.columnDtl_cr_abs_typ.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_abs_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_abs_typ);
		p.columnDtl_cr_abs_typ_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_abs_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_abs_typ_nm);
		p.columnDtl_cr_abstract.setMeta(mcframe.clientMABC.MABCP1090.DtlR.cr_abstract_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cr_abstract);
		p.columnDtl_mon01_invalid_flg.setMeta(mcframe.clientMABC.MABCP1090.DtlR.mon01_invalid_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon01_invalid_flg);
		p.columnDtl_mon02_invalid_flg.setMeta(mcframe.clientMABC.MABCP1090.DtlR.mon02_invalid_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon02_invalid_flg);
		p.columnDtl_mon03_invalid_flg.setMeta(mcframe.clientMABC.MABCP1090.DtlR.mon03_invalid_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon03_invalid_flg);
		p.columnDtl_mon04_invalid_flg.setMeta(mcframe.clientMABC.MABCP1090.DtlR.mon04_invalid_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon04_invalid_flg);
		p.columnDtl_mon05_invalid_flg.setMeta(mcframe.clientMABC.MABCP1090.DtlR.mon05_invalid_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon05_invalid_flg);
		p.columnDtl_mon06_invalid_flg.setMeta(mcframe.clientMABC.MABCP1090.DtlR.mon06_invalid_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon06_invalid_flg);
		p.columnDtl_mon07_invalid_flg.setMeta(mcframe.clientMABC.MABCP1090.DtlR.mon07_invalid_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon07_invalid_flg);
		p.columnDtl_mon08_invalid_flg.setMeta(mcframe.clientMABC.MABCP1090.DtlR.mon08_invalid_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon08_invalid_flg);
		p.columnDtl_mon09_invalid_flg.setMeta(mcframe.clientMABC.MABCP1090.DtlR.mon09_invalid_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon09_invalid_flg);
		p.columnDtl_mon10_invalid_flg.setMeta(mcframe.clientMABC.MABCP1090.DtlR.mon10_invalid_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon10_invalid_flg);
		p.columnDtl_mon11_invalid_flg.setMeta(mcframe.clientMABC.MABCP1090.DtlR.mon11_invalid_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon11_invalid_flg);
		p.columnDtl_mon12_invalid_flg.setMeta(mcframe.clientMABC.MABCP1090.DtlR.mon12_invalid_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_mon12_invalid_flg);
		p.columnDtl_memo1.setMeta(mcframe.clientMABC.MABCP1090.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABC.MABCP1090.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABC.MABCP1090.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP1090.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABC.MABCP1090.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP1090.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP1090.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP1090.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABC.MABCP1090.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP1090.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP1090.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP1090.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP1090.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABC.MABCP1090.DtlR.del_ts_META);
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
		Cnd_jnl_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_jnl_ptn_cd.getListConfig().setPutter(getCnd_jnl_ptn_cd_ListPutter());
		Cnd_jnl_seq.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_jnl_seq.getListConfig().setPutter(getCnd_jnl_seq_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
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
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_jnl_ptn_cd) return getCnd_jnl_ptn_cd(row, info);
		if(combo == Cnd_jnl_seq) return getCnd_jnl_seq(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
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
		else if (ap == Btn_open_MABCP1060) doBtn_open_MABCP1060(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABCP1060]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABCP1060(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_jnl_ptn_cd) return doCnd_jnl_ptn_cd_VC(info);
		if (vc == Cnd_jnl_ptn_nm) return doCnd_jnl_ptn_nm_VC(info);
		if (vc == Cnd_jnl_seq) return doCnd_jnl_seq_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_jnl_ptn_cd) return doDtl_jnl_ptn_cd_VC(info);
		if (vc == columnDtl_jnl_ptn_nm) return doDtl_jnl_ptn_nm_VC(info);
		if (vc == columnDtl_jnl_seq) return doDtl_jnl_seq_VC(info);
		if (vc == columnDtl_dr_dpt_typ) return doDtl_dr_dpt_typ_VC(info);
		if (vc == columnDtl_dr_dpt_typ_nm) return doDtl_dr_dpt_typ_nm_VC(info);
		if (vc == columnDtl_dr_dpt_cd) return doDtl_dr_dpt_cd_VC(info);
		if (vc == columnDtl_dr_dpt_nm) return doDtl_dr_dpt_nm_VC(info);
		if (vc == columnDtl_dr_ptn_typ) return doDtl_dr_ptn_typ_VC(info);
		if (vc == columnDtl_dr_ptn_typ_nm) return doDtl_dr_ptn_typ_nm_VC(info);
		if (vc == columnDtl_dr_grp_cd) return doDtl_dr_grp_cd_VC(info);
		if (vc == columnDtl_dr_grp_nm) return doDtl_dr_grp_nm_VC(info);
		if (vc == columnDtl_cr_dpt_typ) return doDtl_cr_dpt_typ_VC(info);
		if (vc == columnDtl_cr_dpt_typ_nm) return doDtl_cr_dpt_typ_nm_VC(info);
		if (vc == columnDtl_cr_dpt_cd) return doDtl_cr_dpt_cd_VC(info);
		if (vc == columnDtl_cr_dpt_nm) return doDtl_cr_dpt_nm_VC(info);
		if (vc == columnDtl_cr_ptn_typ) return doDtl_cr_ptn_typ_VC(info);
		if (vc == columnDtl_cr_ptn_typ_nm) return doDtl_cr_ptn_typ_nm_VC(info);
		if (vc == columnDtl_cr_grp_cd) return doDtl_cr_grp_cd_VC(info);
		if (vc == columnDtl_cr_grp_nm) return doDtl_cr_grp_nm_VC(info);
		if (vc == columnDtl_dr_ac_cd) return doDtl_dr_ac_cd_VC(info);
		if (vc == columnDtl_dr_ac_nm) return doDtl_dr_ac_nm_VC(info);
		if (vc == columnDtl_dr_sub_ac_cd) return doDtl_dr_sub_ac_cd_VC(info);
		if (vc == columnDtl_dr_sub_ac_nm) return doDtl_dr_sub_ac_nm_VC(info);
		if (vc == columnDtl_cr_ac_cd) return doDtl_cr_ac_cd_VC(info);
		if (vc == columnDtl_cr_ac_nm) return doDtl_cr_ac_nm_VC(info);
		if (vc == columnDtl_cr_sub_ac_cd) return doDtl_cr_sub_ac_cd_VC(info);
		if (vc == columnDtl_cr_sub_ac_nm) return doDtl_cr_sub_ac_nm_VC(info);
		if (vc == columnDtl_dr_ac_tax_cd) return doDtl_dr_ac_tax_cd_VC(info);
		if (vc == columnDtl_dr_ac_tax_nm) return doDtl_dr_ac_tax_nm_VC(info);
		if (vc == columnDtl_cr_ac_tax_cd) return doDtl_cr_ac_tax_cd_VC(info);
		if (vc == columnDtl_cr_ac_tax_nm) return doDtl_cr_ac_tax_nm_VC(info);
		if (vc == columnDtl_dr_bp_typ) return doDtl_dr_bp_typ_VC(info);
		if (vc == columnDtl_dr_bp_typ_nm) return doDtl_dr_bp_typ_nm_VC(info);
		if (vc == columnDtl_dr_bp_cd) return doDtl_dr_bp_cd_VC(info);
		if (vc == columnDtl_dr_bp_nm) return doDtl_dr_bp_nm_VC(info);
		if (vc == columnDtl_cr_bp_typ) return doDtl_cr_bp_typ_VC(info);
		if (vc == columnDtl_cr_bp_typ_nm) return doDtl_cr_bp_typ_nm_VC(info);
		if (vc == columnDtl_cr_bp_cd) return doDtl_cr_bp_cd_VC(info);
		if (vc == columnDtl_cr_bp_nm) return doDtl_cr_bp_nm_VC(info);
		if (vc == columnDtl_dr_itm_typ) return doDtl_dr_itm_typ_VC(info);
		if (vc == columnDtl_dr_itm_typ_nm) return doDtl_dr_itm_typ_nm_VC(info);
		if (vc == columnDtl_cr_itm_typ) return doDtl_cr_itm_typ_VC(info);
		if (vc == columnDtl_cr_itm_typ_nm) return doDtl_cr_itm_typ_nm_VC(info);
		if (vc == columnDtl_dr_trd_sml_flg) return doDtl_dr_trd_sml_flg_VC(info);
		if (vc == columnDtl_cr_trd_sml_flg) return doDtl_cr_trd_sml_flg_VC(info);
		if (vc == columnDtl_minus_flg) return doDtl_minus_flg_VC(info);
		if (vc == columnDtl_dr_amt_typ) return doDtl_dr_amt_typ_VC(info);
		if (vc == columnDtl_dr_amt_typ_nm) return doDtl_dr_amt_typ_nm_VC(info);
		if (vc == columnDtl_cr_amt_typ) return doDtl_cr_amt_typ_VC(info);
		if (vc == columnDtl_cr_amt_typ_nm) return doDtl_cr_amt_typ_nm_VC(info);
		if (vc == columnDtl_itm_jnl_cd) return doDtl_itm_jnl_cd_VC(info);
		if (vc == columnDtl_itm_jnl_nm) return doDtl_itm_jnl_nm_VC(info);
		if (vc == columnDtl_ac_rsn_cd) return doDtl_ac_rsn_cd_VC(info);
		if (vc == columnDtl_ac_rsn_nm) return doDtl_ac_rsn_nm_VC(info);
		if (vc == columnDtl_purc_typ) return doDtl_purc_typ_VC(info);
		if (vc == columnDtl_purc_typ_nm) return doDtl_purc_typ_nm_VC(info);
		if (vc == columnDtl_un_fix_typ) return doDtl_un_fix_typ_VC(info);
		if (vc == columnDtl_un_fix_typ_nm) return doDtl_un_fix_typ_nm_VC(info);
		if (vc == columnDtl_foreign_typ) return doDtl_foreign_typ_VC(info);
		if (vc == columnDtl_foreign_typ_nm) return doDtl_foreign_typ_nm_VC(info);
		if (vc == columnDtl_cur_cd) return doDtl_cur_cd_VC(info);
		if (vc == columnDtl_cur_nm) return doDtl_cur_nm_VC(info);
		if (vc == columnDtl_asst_typ) return doDtl_asst_typ_VC(info);
		if (vc == columnDtl_asst_typ_nm) return doDtl_asst_typ_nm_VC(info);
		if (vc == columnDtl_quality_typ) return doDtl_quality_typ_VC(info);
		if (vc == columnDtl_quality_typ_nm) return doDtl_quality_typ_nm_VC(info);
		if (vc == columnDtl_inv_loc_typ) return doDtl_inv_loc_typ_VC(info);
		if (vc == columnDtl_inv_loc_typ_nm) return doDtl_inv_loc_typ_nm_VC(info);
		if (vc == columnDtl_amt_sign_typ) return doDtl_amt_sign_typ_VC(info);
		if (vc == columnDtl_amt_sign_typ_nm) return doDtl_amt_sign_typ_nm_VC(info);
		if (vc == columnDtl_jnl_key1) return doDtl_jnl_key1_VC(info);
		if (vc == columnDtl_jnl_key2) return doDtl_jnl_key2_VC(info);
		if (vc == columnDtl_jnl_key3) return doDtl_jnl_key3_VC(info);
		if (vc == columnDtl_jnl_key4) return doDtl_jnl_key4_VC(info);
		if (vc == columnDtl_jnl_key5) return doDtl_jnl_key5_VC(info);
		if (vc == columnDtl_jnl_key6) return doDtl_jnl_key6_VC(info);
		if (vc == columnDtl_jnl_key7) return doDtl_jnl_key7_VC(info);
		if (vc == columnDtl_jnl_key8) return doDtl_jnl_key8_VC(info);
		if (vc == columnDtl_jnl_key9) return doDtl_jnl_key9_VC(info);
		if (vc == columnDtl_jnl_key10) return doDtl_jnl_key10_VC(info);
		if (vc == columnDtl_carry_flg) return doDtl_carry_flg_VC(info);
		if (vc == columnDtl_dr_abs_typ) return doDtl_dr_abs_typ_VC(info);
		if (vc == columnDtl_dr_abs_typ_nm) return doDtl_dr_abs_typ_nm_VC(info);
		if (vc == columnDtl_dr_abstract) return doDtl_dr_abstract_VC(info);
		if (vc == columnDtl_cr_abs_typ) return doDtl_cr_abs_typ_VC(info);
		if (vc == columnDtl_cr_abs_typ_nm) return doDtl_cr_abs_typ_nm_VC(info);
		if (vc == columnDtl_cr_abstract) return doDtl_cr_abstract_VC(info);
		if (vc == columnDtl_mon01_invalid_flg) return doDtl_mon01_invalid_flg_VC(info);
		if (vc == columnDtl_mon02_invalid_flg) return doDtl_mon02_invalid_flg_VC(info);
		if (vc == columnDtl_mon03_invalid_flg) return doDtl_mon03_invalid_flg_VC(info);
		if (vc == columnDtl_mon04_invalid_flg) return doDtl_mon04_invalid_flg_VC(info);
		if (vc == columnDtl_mon05_invalid_flg) return doDtl_mon05_invalid_flg_VC(info);
		if (vc == columnDtl_mon06_invalid_flg) return doDtl_mon06_invalid_flg_VC(info);
		if (vc == columnDtl_mon07_invalid_flg) return doDtl_mon07_invalid_flg_VC(info);
		if (vc == columnDtl_mon08_invalid_flg) return doDtl_mon08_invalid_flg_VC(info);
		if (vc == columnDtl_mon09_invalid_flg) return doDtl_mon09_invalid_flg_VC(info);
		if (vc == columnDtl_mon10_invalid_flg) return doDtl_mon10_invalid_flg_VC(info);
		if (vc == columnDtl_mon11_invalid_flg) return doDtl_mon11_invalid_flg_VC(info);
		if (vc == columnDtl_mon12_invalid_flg) return doDtl_mon12_invalid_flg_VC(info);
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
	 * [Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jnl_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jnl_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jnl_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jnl_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_dpt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_dpt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_dpt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_dpt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_ptn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_ptn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_dpt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_dpt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_dpt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_dpt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_ptn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_ptn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_sub_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_sub_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_sub_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_sub_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_sub_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_sub_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_sub_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_sub_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_ac_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_ac_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_ac_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_ac_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_ac_tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_ac_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_ac_tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_ac_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_bp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_bp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_bp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_bp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_bp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_bp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_bp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_bp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_trd_sml_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_trd_sml_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_trd_sml_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_trd_sml_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[minus_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_minus_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_amt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_amt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_amt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_amt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_amt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_amt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_amt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_amt_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[ac_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[purc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_purc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[un_fix_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_un_fix_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[un_fix_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_un_fix_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[foreign_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_foreign_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[foreign_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_foreign_typ_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[asst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inv_loc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inv_loc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inv_loc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inv_loc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[amt_sign_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_amt_sign_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[amt_sign_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_amt_sign_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jnl_key1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jnl_key1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jnl_key2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jnl_key2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jnl_key3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jnl_key3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jnl_key4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jnl_key4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jnl_key5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jnl_key5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jnl_key6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jnl_key6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jnl_key7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jnl_key7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jnl_key8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jnl_key8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jnl_key9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jnl_key9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[jnl_key10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_jnl_key10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[carry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_carry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_abs_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_abs_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_abs_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_abs_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dr_abstract]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dr_abstract_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_abs_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_abs_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_abs_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_abs_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cr_abstract]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cr_abstract_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon01_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon01_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon02_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon02_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon03_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon03_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon04_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon04_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon05_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon05_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon06_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon06_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon07_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon07_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon08_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon08_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon09_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon09_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon10_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon10_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon11_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon11_invalid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[mon12_invalid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_mon12_invalid_flg_VC(MCEventInfo info){
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
		if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_jnl_ptn_cd) doCnd_jnl_ptn_cd_NC(info);
		else if (nc == Cnd_jnl_ptn_nm) doCnd_jnl_ptn_nm_NC(info);
		else if (nc == Cnd_jnl_seq) doCnd_jnl_seq_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_jnl_ptn_cd) doDtl_jnl_ptn_cd_NC(info);
		else if (nc == columnDtl_jnl_ptn_nm) doDtl_jnl_ptn_nm_NC(info);
		else if (nc == columnDtl_jnl_seq) doDtl_jnl_seq_NC(info);
		else if (nc == columnDtl_dr_dpt_typ) doDtl_dr_dpt_typ_NC(info);
		else if (nc == columnDtl_dr_dpt_typ_nm) doDtl_dr_dpt_typ_nm_NC(info);
		else if (nc == columnDtl_dr_dpt_cd) doDtl_dr_dpt_cd_NC(info);
		else if (nc == columnDtl_dr_dpt_nm) doDtl_dr_dpt_nm_NC(info);
		else if (nc == columnDtl_dr_ptn_typ) doDtl_dr_ptn_typ_NC(info);
		else if (nc == columnDtl_dr_ptn_typ_nm) doDtl_dr_ptn_typ_nm_NC(info);
		else if (nc == columnDtl_dr_grp_cd) doDtl_dr_grp_cd_NC(info);
		else if (nc == columnDtl_dr_grp_nm) doDtl_dr_grp_nm_NC(info);
		else if (nc == columnDtl_cr_dpt_typ) doDtl_cr_dpt_typ_NC(info);
		else if (nc == columnDtl_cr_dpt_typ_nm) doDtl_cr_dpt_typ_nm_NC(info);
		else if (nc == columnDtl_cr_dpt_cd) doDtl_cr_dpt_cd_NC(info);
		else if (nc == columnDtl_cr_dpt_nm) doDtl_cr_dpt_nm_NC(info);
		else if (nc == columnDtl_cr_ptn_typ) doDtl_cr_ptn_typ_NC(info);
		else if (nc == columnDtl_cr_ptn_typ_nm) doDtl_cr_ptn_typ_nm_NC(info);
		else if (nc == columnDtl_cr_grp_cd) doDtl_cr_grp_cd_NC(info);
		else if (nc == columnDtl_cr_grp_nm) doDtl_cr_grp_nm_NC(info);
		else if (nc == columnDtl_dr_ac_cd) doDtl_dr_ac_cd_NC(info);
		else if (nc == columnDtl_dr_ac_nm) doDtl_dr_ac_nm_NC(info);
		else if (nc == columnDtl_dr_sub_ac_cd) doDtl_dr_sub_ac_cd_NC(info);
		else if (nc == columnDtl_dr_sub_ac_nm) doDtl_dr_sub_ac_nm_NC(info);
		else if (nc == columnDtl_cr_ac_cd) doDtl_cr_ac_cd_NC(info);
		else if (nc == columnDtl_cr_ac_nm) doDtl_cr_ac_nm_NC(info);
		else if (nc == columnDtl_cr_sub_ac_cd) doDtl_cr_sub_ac_cd_NC(info);
		else if (nc == columnDtl_cr_sub_ac_nm) doDtl_cr_sub_ac_nm_NC(info);
		else if (nc == columnDtl_dr_ac_tax_cd) doDtl_dr_ac_tax_cd_NC(info);
		else if (nc == columnDtl_dr_ac_tax_nm) doDtl_dr_ac_tax_nm_NC(info);
		else if (nc == columnDtl_cr_ac_tax_cd) doDtl_cr_ac_tax_cd_NC(info);
		else if (nc == columnDtl_cr_ac_tax_nm) doDtl_cr_ac_tax_nm_NC(info);
		else if (nc == columnDtl_dr_bp_typ) doDtl_dr_bp_typ_NC(info);
		else if (nc == columnDtl_dr_bp_typ_nm) doDtl_dr_bp_typ_nm_NC(info);
		else if (nc == columnDtl_dr_bp_cd) doDtl_dr_bp_cd_NC(info);
		else if (nc == columnDtl_dr_bp_nm) doDtl_dr_bp_nm_NC(info);
		else if (nc == columnDtl_cr_bp_typ) doDtl_cr_bp_typ_NC(info);
		else if (nc == columnDtl_cr_bp_typ_nm) doDtl_cr_bp_typ_nm_NC(info);
		else if (nc == columnDtl_cr_bp_cd) doDtl_cr_bp_cd_NC(info);
		else if (nc == columnDtl_cr_bp_nm) doDtl_cr_bp_nm_NC(info);
		else if (nc == columnDtl_dr_itm_typ) doDtl_dr_itm_typ_NC(info);
		else if (nc == columnDtl_dr_itm_typ_nm) doDtl_dr_itm_typ_nm_NC(info);
		else if (nc == columnDtl_cr_itm_typ) doDtl_cr_itm_typ_NC(info);
		else if (nc == columnDtl_cr_itm_typ_nm) doDtl_cr_itm_typ_nm_NC(info);
		else if (nc == columnDtl_dr_trd_sml_flg) doDtl_dr_trd_sml_flg_NC(info);
		else if (nc == columnDtl_cr_trd_sml_flg) doDtl_cr_trd_sml_flg_NC(info);
		else if (nc == columnDtl_minus_flg) doDtl_minus_flg_NC(info);
		else if (nc == columnDtl_dr_amt_typ) doDtl_dr_amt_typ_NC(info);
		else if (nc == columnDtl_dr_amt_typ_nm) doDtl_dr_amt_typ_nm_NC(info);
		else if (nc == columnDtl_cr_amt_typ) doDtl_cr_amt_typ_NC(info);
		else if (nc == columnDtl_cr_amt_typ_nm) doDtl_cr_amt_typ_nm_NC(info);
		else if (nc == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_NC(info);
		else if (nc == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_NC(info);
		else if (nc == columnDtl_ac_rsn_cd) doDtl_ac_rsn_cd_NC(info);
		else if (nc == columnDtl_ac_rsn_nm) doDtl_ac_rsn_nm_NC(info);
		else if (nc == columnDtl_purc_typ) doDtl_purc_typ_NC(info);
		else if (nc == columnDtl_purc_typ_nm) doDtl_purc_typ_nm_NC(info);
		else if (nc == columnDtl_un_fix_typ) doDtl_un_fix_typ_NC(info);
		else if (nc == columnDtl_un_fix_typ_nm) doDtl_un_fix_typ_nm_NC(info);
		else if (nc == columnDtl_foreign_typ) doDtl_foreign_typ_NC(info);
		else if (nc == columnDtl_foreign_typ_nm) doDtl_foreign_typ_nm_NC(info);
		else if (nc == columnDtl_cur_cd) doDtl_cur_cd_NC(info);
		else if (nc == columnDtl_cur_nm) doDtl_cur_nm_NC(info);
		else if (nc == columnDtl_asst_typ) doDtl_asst_typ_NC(info);
		else if (nc == columnDtl_asst_typ_nm) doDtl_asst_typ_nm_NC(info);
		else if (nc == columnDtl_quality_typ) doDtl_quality_typ_NC(info);
		else if (nc == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_NC(info);
		else if (nc == columnDtl_inv_loc_typ) doDtl_inv_loc_typ_NC(info);
		else if (nc == columnDtl_inv_loc_typ_nm) doDtl_inv_loc_typ_nm_NC(info);
		else if (nc == columnDtl_amt_sign_typ) doDtl_amt_sign_typ_NC(info);
		else if (nc == columnDtl_amt_sign_typ_nm) doDtl_amt_sign_typ_nm_NC(info);
		else if (nc == columnDtl_jnl_key1) doDtl_jnl_key1_NC(info);
		else if (nc == columnDtl_jnl_key2) doDtl_jnl_key2_NC(info);
		else if (nc == columnDtl_jnl_key3) doDtl_jnl_key3_NC(info);
		else if (nc == columnDtl_jnl_key4) doDtl_jnl_key4_NC(info);
		else if (nc == columnDtl_jnl_key5) doDtl_jnl_key5_NC(info);
		else if (nc == columnDtl_jnl_key6) doDtl_jnl_key6_NC(info);
		else if (nc == columnDtl_jnl_key7) doDtl_jnl_key7_NC(info);
		else if (nc == columnDtl_jnl_key8) doDtl_jnl_key8_NC(info);
		else if (nc == columnDtl_jnl_key9) doDtl_jnl_key9_NC(info);
		else if (nc == columnDtl_jnl_key10) doDtl_jnl_key10_NC(info);
		else if (nc == columnDtl_carry_flg) doDtl_carry_flg_NC(info);
		else if (nc == columnDtl_dr_abs_typ) doDtl_dr_abs_typ_NC(info);
		else if (nc == columnDtl_dr_abs_typ_nm) doDtl_dr_abs_typ_nm_NC(info);
		else if (nc == columnDtl_dr_abstract) doDtl_dr_abstract_NC(info);
		else if (nc == columnDtl_cr_abs_typ) doDtl_cr_abs_typ_NC(info);
		else if (nc == columnDtl_cr_abs_typ_nm) doDtl_cr_abs_typ_nm_NC(info);
		else if (nc == columnDtl_cr_abstract) doDtl_cr_abstract_NC(info);
		else if (nc == columnDtl_mon01_invalid_flg) doDtl_mon01_invalid_flg_NC(info);
		else if (nc == columnDtl_mon02_invalid_flg) doDtl_mon02_invalid_flg_NC(info);
		else if (nc == columnDtl_mon03_invalid_flg) doDtl_mon03_invalid_flg_NC(info);
		else if (nc == columnDtl_mon04_invalid_flg) doDtl_mon04_invalid_flg_NC(info);
		else if (nc == columnDtl_mon05_invalid_flg) doDtl_mon05_invalid_flg_NC(info);
		else if (nc == columnDtl_mon06_invalid_flg) doDtl_mon06_invalid_flg_NC(info);
		else if (nc == columnDtl_mon07_invalid_flg) doDtl_mon07_invalid_flg_NC(info);
		else if (nc == columnDtl_mon08_invalid_flg) doDtl_mon08_invalid_flg_NC(info);
		else if (nc == columnDtl_mon09_invalid_flg) doDtl_mon09_invalid_flg_NC(info);
		else if (nc == columnDtl_mon10_invalid_flg) doDtl_mon10_invalid_flg_NC(info);
		else if (nc == columnDtl_mon11_invalid_flg) doDtl_mon11_invalid_flg_NC(info);
		else if (nc == columnDtl_mon12_invalid_flg) doDtl_mon12_invalid_flg_NC(info);
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
	 * [Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_dpt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_dpt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_dpt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_dpt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ptn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ptn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_dpt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_dpt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_dpt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_dpt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ptn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ptn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_sub_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_sub_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_sub_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_sub_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_sub_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_sub_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_sub_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_sub_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ac_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ac_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ac_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ac_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ac_tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ac_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ac_tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ac_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_bp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_bp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_bp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_bp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_bp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_bp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_bp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_bp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_trd_sml_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_trd_sml_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_trd_sml_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_trd_sml_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[minus_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_minus_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_amt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_amt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_amt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_amt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_amt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_amt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_amt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_amt_typ_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[ac_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[un_fix_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_un_fix_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[un_fix_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_un_fix_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[foreign_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_foreign_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[foreign_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_foreign_typ_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[asst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inv_loc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inv_loc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inv_loc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inv_loc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_sign_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_sign_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_sign_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_sign_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[carry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_carry_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_abs_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_abs_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_abs_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_abs_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_abstract]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_abstract_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_abs_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_abs_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_abs_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_abs_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_abstract]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_abstract_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon01_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon01_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon02_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon02_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon03_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon03_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon04_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon04_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon05_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon05_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon06_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon06_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon07_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon07_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon08_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon08_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon09_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon09_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon10_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon10_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon11_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon11_invalid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon12_invalid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon12_invalid_flg_NC(MCEventInfo info){
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
		if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_jnl_ptn_cd) doCnd_jnl_ptn_cd_NE(info);
		else if (ne == Cnd_jnl_ptn_nm) doCnd_jnl_ptn_nm_NE(info);
		else if (ne == Cnd_jnl_seq) doCnd_jnl_seq_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_jnl_ptn_cd) doDtl_jnl_ptn_cd_NE(info);
		else if (ne == columnDtl_jnl_ptn_nm) doDtl_jnl_ptn_nm_NE(info);
		else if (ne == columnDtl_jnl_seq) doDtl_jnl_seq_NE(info);
		else if (ne == columnDtl_dr_dpt_typ) doDtl_dr_dpt_typ_NE(info);
		else if (ne == columnDtl_dr_dpt_typ_nm) doDtl_dr_dpt_typ_nm_NE(info);
		else if (ne == columnDtl_dr_dpt_cd) doDtl_dr_dpt_cd_NE(info);
		else if (ne == columnDtl_dr_dpt_nm) doDtl_dr_dpt_nm_NE(info);
		else if (ne == columnDtl_dr_ptn_typ) doDtl_dr_ptn_typ_NE(info);
		else if (ne == columnDtl_dr_ptn_typ_nm) doDtl_dr_ptn_typ_nm_NE(info);
		else if (ne == columnDtl_dr_grp_cd) doDtl_dr_grp_cd_NE(info);
		else if (ne == columnDtl_dr_grp_nm) doDtl_dr_grp_nm_NE(info);
		else if (ne == columnDtl_cr_dpt_typ) doDtl_cr_dpt_typ_NE(info);
		else if (ne == columnDtl_cr_dpt_typ_nm) doDtl_cr_dpt_typ_nm_NE(info);
		else if (ne == columnDtl_cr_dpt_cd) doDtl_cr_dpt_cd_NE(info);
		else if (ne == columnDtl_cr_dpt_nm) doDtl_cr_dpt_nm_NE(info);
		else if (ne == columnDtl_cr_ptn_typ) doDtl_cr_ptn_typ_NE(info);
		else if (ne == columnDtl_cr_ptn_typ_nm) doDtl_cr_ptn_typ_nm_NE(info);
		else if (ne == columnDtl_cr_grp_cd) doDtl_cr_grp_cd_NE(info);
		else if (ne == columnDtl_cr_grp_nm) doDtl_cr_grp_nm_NE(info);
		else if (ne == columnDtl_dr_ac_cd) doDtl_dr_ac_cd_NE(info);
		else if (ne == columnDtl_dr_ac_nm) doDtl_dr_ac_nm_NE(info);
		else if (ne == columnDtl_dr_sub_ac_cd) doDtl_dr_sub_ac_cd_NE(info);
		else if (ne == columnDtl_dr_sub_ac_nm) doDtl_dr_sub_ac_nm_NE(info);
		else if (ne == columnDtl_cr_ac_cd) doDtl_cr_ac_cd_NE(info);
		else if (ne == columnDtl_cr_ac_nm) doDtl_cr_ac_nm_NE(info);
		else if (ne == columnDtl_cr_sub_ac_cd) doDtl_cr_sub_ac_cd_NE(info);
		else if (ne == columnDtl_cr_sub_ac_nm) doDtl_cr_sub_ac_nm_NE(info);
		else if (ne == columnDtl_dr_ac_tax_cd) doDtl_dr_ac_tax_cd_NE(info);
		else if (ne == columnDtl_dr_ac_tax_nm) doDtl_dr_ac_tax_nm_NE(info);
		else if (ne == columnDtl_cr_ac_tax_cd) doDtl_cr_ac_tax_cd_NE(info);
		else if (ne == columnDtl_cr_ac_tax_nm) doDtl_cr_ac_tax_nm_NE(info);
		else if (ne == columnDtl_dr_bp_typ) doDtl_dr_bp_typ_NE(info);
		else if (ne == columnDtl_dr_bp_typ_nm) doDtl_dr_bp_typ_nm_NE(info);
		else if (ne == columnDtl_dr_bp_cd) doDtl_dr_bp_cd_NE(info);
		else if (ne == columnDtl_dr_bp_nm) doDtl_dr_bp_nm_NE(info);
		else if (ne == columnDtl_cr_bp_typ) doDtl_cr_bp_typ_NE(info);
		else if (ne == columnDtl_cr_bp_typ_nm) doDtl_cr_bp_typ_nm_NE(info);
		else if (ne == columnDtl_cr_bp_cd) doDtl_cr_bp_cd_NE(info);
		else if (ne == columnDtl_cr_bp_nm) doDtl_cr_bp_nm_NE(info);
		else if (ne == columnDtl_dr_itm_typ) doDtl_dr_itm_typ_NE(info);
		else if (ne == columnDtl_dr_itm_typ_nm) doDtl_dr_itm_typ_nm_NE(info);
		else if (ne == columnDtl_cr_itm_typ) doDtl_cr_itm_typ_NE(info);
		else if (ne == columnDtl_cr_itm_typ_nm) doDtl_cr_itm_typ_nm_NE(info);
		else if (ne == columnDtl_dr_trd_sml_flg) doDtl_dr_trd_sml_flg_NE(info);
		else if (ne == columnDtl_cr_trd_sml_flg) doDtl_cr_trd_sml_flg_NE(info);
		else if (ne == columnDtl_minus_flg) doDtl_minus_flg_NE(info);
		else if (ne == columnDtl_dr_amt_typ) doDtl_dr_amt_typ_NE(info);
		else if (ne == columnDtl_dr_amt_typ_nm) doDtl_dr_amt_typ_nm_NE(info);
		else if (ne == columnDtl_cr_amt_typ) doDtl_cr_amt_typ_NE(info);
		else if (ne == columnDtl_cr_amt_typ_nm) doDtl_cr_amt_typ_nm_NE(info);
		else if (ne == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_NE(info);
		else if (ne == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_NE(info);
		else if (ne == columnDtl_ac_rsn_cd) doDtl_ac_rsn_cd_NE(info);
		else if (ne == columnDtl_ac_rsn_nm) doDtl_ac_rsn_nm_NE(info);
		else if (ne == columnDtl_purc_typ) doDtl_purc_typ_NE(info);
		else if (ne == columnDtl_purc_typ_nm) doDtl_purc_typ_nm_NE(info);
		else if (ne == columnDtl_un_fix_typ) doDtl_un_fix_typ_NE(info);
		else if (ne == columnDtl_un_fix_typ_nm) doDtl_un_fix_typ_nm_NE(info);
		else if (ne == columnDtl_foreign_typ) doDtl_foreign_typ_NE(info);
		else if (ne == columnDtl_foreign_typ_nm) doDtl_foreign_typ_nm_NE(info);
		else if (ne == columnDtl_cur_cd) doDtl_cur_cd_NE(info);
		else if (ne == columnDtl_cur_nm) doDtl_cur_nm_NE(info);
		else if (ne == columnDtl_asst_typ) doDtl_asst_typ_NE(info);
		else if (ne == columnDtl_asst_typ_nm) doDtl_asst_typ_nm_NE(info);
		else if (ne == columnDtl_quality_typ) doDtl_quality_typ_NE(info);
		else if (ne == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_NE(info);
		else if (ne == columnDtl_inv_loc_typ) doDtl_inv_loc_typ_NE(info);
		else if (ne == columnDtl_inv_loc_typ_nm) doDtl_inv_loc_typ_nm_NE(info);
		else if (ne == columnDtl_amt_sign_typ) doDtl_amt_sign_typ_NE(info);
		else if (ne == columnDtl_amt_sign_typ_nm) doDtl_amt_sign_typ_nm_NE(info);
		else if (ne == columnDtl_jnl_key1) doDtl_jnl_key1_NE(info);
		else if (ne == columnDtl_jnl_key2) doDtl_jnl_key2_NE(info);
		else if (ne == columnDtl_jnl_key3) doDtl_jnl_key3_NE(info);
		else if (ne == columnDtl_jnl_key4) doDtl_jnl_key4_NE(info);
		else if (ne == columnDtl_jnl_key5) doDtl_jnl_key5_NE(info);
		else if (ne == columnDtl_jnl_key6) doDtl_jnl_key6_NE(info);
		else if (ne == columnDtl_jnl_key7) doDtl_jnl_key7_NE(info);
		else if (ne == columnDtl_jnl_key8) doDtl_jnl_key8_NE(info);
		else if (ne == columnDtl_jnl_key9) doDtl_jnl_key9_NE(info);
		else if (ne == columnDtl_jnl_key10) doDtl_jnl_key10_NE(info);
		else if (ne == columnDtl_carry_flg) doDtl_carry_flg_NE(info);
		else if (ne == columnDtl_dr_abs_typ) doDtl_dr_abs_typ_NE(info);
		else if (ne == columnDtl_dr_abs_typ_nm) doDtl_dr_abs_typ_nm_NE(info);
		else if (ne == columnDtl_dr_abstract) doDtl_dr_abstract_NE(info);
		else if (ne == columnDtl_cr_abs_typ) doDtl_cr_abs_typ_NE(info);
		else if (ne == columnDtl_cr_abs_typ_nm) doDtl_cr_abs_typ_nm_NE(info);
		else if (ne == columnDtl_cr_abstract) doDtl_cr_abstract_NE(info);
		else if (ne == columnDtl_mon01_invalid_flg) doDtl_mon01_invalid_flg_NE(info);
		else if (ne == columnDtl_mon02_invalid_flg) doDtl_mon02_invalid_flg_NE(info);
		else if (ne == columnDtl_mon03_invalid_flg) doDtl_mon03_invalid_flg_NE(info);
		else if (ne == columnDtl_mon04_invalid_flg) doDtl_mon04_invalid_flg_NE(info);
		else if (ne == columnDtl_mon05_invalid_flg) doDtl_mon05_invalid_flg_NE(info);
		else if (ne == columnDtl_mon06_invalid_flg) doDtl_mon06_invalid_flg_NE(info);
		else if (ne == columnDtl_mon07_invalid_flg) doDtl_mon07_invalid_flg_NE(info);
		else if (ne == columnDtl_mon08_invalid_flg) doDtl_mon08_invalid_flg_NE(info);
		else if (ne == columnDtl_mon09_invalid_flg) doDtl_mon09_invalid_flg_NE(info);
		else if (ne == columnDtl_mon10_invalid_flg) doDtl_mon10_invalid_flg_NE(info);
		else if (ne == columnDtl_mon11_invalid_flg) doDtl_mon11_invalid_flg_NE(info);
		else if (ne == columnDtl_mon12_invalid_flg) doDtl_mon12_invalid_flg_NE(info);
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
	 * [Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_dpt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_dpt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_dpt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_dpt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ptn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ptn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_dpt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_dpt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_dpt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_dpt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ptn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ptn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_sub_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_sub_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_sub_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_sub_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_sub_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_sub_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_sub_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_sub_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ac_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ac_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ac_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ac_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ac_tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ac_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ac_tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ac_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_bp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_bp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_bp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_bp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_bp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_bp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_bp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_bp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_trd_sml_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_trd_sml_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_trd_sml_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_trd_sml_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[minus_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_minus_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_amt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_amt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_amt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_amt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_amt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_amt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_amt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_amt_typ_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[ac_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[un_fix_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_un_fix_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[un_fix_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_un_fix_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[foreign_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_foreign_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[foreign_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_foreign_typ_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[asst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inv_loc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inv_loc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inv_loc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inv_loc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_sign_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_sign_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_sign_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_sign_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[carry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_carry_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_abs_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_abs_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_abs_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_abs_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_abstract]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_abstract_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_abs_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_abs_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_abs_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_abs_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_abstract]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_abstract_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon01_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon01_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon02_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon02_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon03_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon03_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon04_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon04_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon05_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon05_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon06_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon06_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon07_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon07_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon08_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon08_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon09_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon09_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon10_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon10_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon11_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon11_invalid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon12_invalid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon12_invalid_flg_NE(MCEventInfo info){
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
		if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_jnl_ptn_cd) doCnd_jnl_ptn_cd_NX(info);
		else if (nx == Cnd_jnl_ptn_nm) doCnd_jnl_ptn_nm_NX(info);
		else if (nx == Cnd_jnl_seq) doCnd_jnl_seq_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_jnl_ptn_cd) doDtl_jnl_ptn_cd_NX(info);
		else if (nx == columnDtl_jnl_ptn_nm) doDtl_jnl_ptn_nm_NX(info);
		else if (nx == columnDtl_jnl_seq) doDtl_jnl_seq_NX(info);
		else if (nx == columnDtl_dr_dpt_typ) doDtl_dr_dpt_typ_NX(info);
		else if (nx == columnDtl_dr_dpt_typ_nm) doDtl_dr_dpt_typ_nm_NX(info);
		else if (nx == columnDtl_dr_dpt_cd) doDtl_dr_dpt_cd_NX(info);
		else if (nx == columnDtl_dr_dpt_nm) doDtl_dr_dpt_nm_NX(info);
		else if (nx == columnDtl_dr_ptn_typ) doDtl_dr_ptn_typ_NX(info);
		else if (nx == columnDtl_dr_ptn_typ_nm) doDtl_dr_ptn_typ_nm_NX(info);
		else if (nx == columnDtl_dr_grp_cd) doDtl_dr_grp_cd_NX(info);
		else if (nx == columnDtl_dr_grp_nm) doDtl_dr_grp_nm_NX(info);
		else if (nx == columnDtl_cr_dpt_typ) doDtl_cr_dpt_typ_NX(info);
		else if (nx == columnDtl_cr_dpt_typ_nm) doDtl_cr_dpt_typ_nm_NX(info);
		else if (nx == columnDtl_cr_dpt_cd) doDtl_cr_dpt_cd_NX(info);
		else if (nx == columnDtl_cr_dpt_nm) doDtl_cr_dpt_nm_NX(info);
		else if (nx == columnDtl_cr_ptn_typ) doDtl_cr_ptn_typ_NX(info);
		else if (nx == columnDtl_cr_ptn_typ_nm) doDtl_cr_ptn_typ_nm_NX(info);
		else if (nx == columnDtl_cr_grp_cd) doDtl_cr_grp_cd_NX(info);
		else if (nx == columnDtl_cr_grp_nm) doDtl_cr_grp_nm_NX(info);
		else if (nx == columnDtl_dr_ac_cd) doDtl_dr_ac_cd_NX(info);
		else if (nx == columnDtl_dr_ac_nm) doDtl_dr_ac_nm_NX(info);
		else if (nx == columnDtl_dr_sub_ac_cd) doDtl_dr_sub_ac_cd_NX(info);
		else if (nx == columnDtl_dr_sub_ac_nm) doDtl_dr_sub_ac_nm_NX(info);
		else if (nx == columnDtl_cr_ac_cd) doDtl_cr_ac_cd_NX(info);
		else if (nx == columnDtl_cr_ac_nm) doDtl_cr_ac_nm_NX(info);
		else if (nx == columnDtl_cr_sub_ac_cd) doDtl_cr_sub_ac_cd_NX(info);
		else if (nx == columnDtl_cr_sub_ac_nm) doDtl_cr_sub_ac_nm_NX(info);
		else if (nx == columnDtl_dr_ac_tax_cd) doDtl_dr_ac_tax_cd_NX(info);
		else if (nx == columnDtl_dr_ac_tax_nm) doDtl_dr_ac_tax_nm_NX(info);
		else if (nx == columnDtl_cr_ac_tax_cd) doDtl_cr_ac_tax_cd_NX(info);
		else if (nx == columnDtl_cr_ac_tax_nm) doDtl_cr_ac_tax_nm_NX(info);
		else if (nx == columnDtl_dr_bp_typ) doDtl_dr_bp_typ_NX(info);
		else if (nx == columnDtl_dr_bp_typ_nm) doDtl_dr_bp_typ_nm_NX(info);
		else if (nx == columnDtl_dr_bp_cd) doDtl_dr_bp_cd_NX(info);
		else if (nx == columnDtl_dr_bp_nm) doDtl_dr_bp_nm_NX(info);
		else if (nx == columnDtl_cr_bp_typ) doDtl_cr_bp_typ_NX(info);
		else if (nx == columnDtl_cr_bp_typ_nm) doDtl_cr_bp_typ_nm_NX(info);
		else if (nx == columnDtl_cr_bp_cd) doDtl_cr_bp_cd_NX(info);
		else if (nx == columnDtl_cr_bp_nm) doDtl_cr_bp_nm_NX(info);
		else if (nx == columnDtl_dr_itm_typ) doDtl_dr_itm_typ_NX(info);
		else if (nx == columnDtl_dr_itm_typ_nm) doDtl_dr_itm_typ_nm_NX(info);
		else if (nx == columnDtl_cr_itm_typ) doDtl_cr_itm_typ_NX(info);
		else if (nx == columnDtl_cr_itm_typ_nm) doDtl_cr_itm_typ_nm_NX(info);
		else if (nx == columnDtl_dr_trd_sml_flg) doDtl_dr_trd_sml_flg_NX(info);
		else if (nx == columnDtl_cr_trd_sml_flg) doDtl_cr_trd_sml_flg_NX(info);
		else if (nx == columnDtl_minus_flg) doDtl_minus_flg_NX(info);
		else if (nx == columnDtl_dr_amt_typ) doDtl_dr_amt_typ_NX(info);
		else if (nx == columnDtl_dr_amt_typ_nm) doDtl_dr_amt_typ_nm_NX(info);
		else if (nx == columnDtl_cr_amt_typ) doDtl_cr_amt_typ_NX(info);
		else if (nx == columnDtl_cr_amt_typ_nm) doDtl_cr_amt_typ_nm_NX(info);
		else if (nx == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_NX(info);
		else if (nx == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_NX(info);
		else if (nx == columnDtl_ac_rsn_cd) doDtl_ac_rsn_cd_NX(info);
		else if (nx == columnDtl_ac_rsn_nm) doDtl_ac_rsn_nm_NX(info);
		else if (nx == columnDtl_purc_typ) doDtl_purc_typ_NX(info);
		else if (nx == columnDtl_purc_typ_nm) doDtl_purc_typ_nm_NX(info);
		else if (nx == columnDtl_un_fix_typ) doDtl_un_fix_typ_NX(info);
		else if (nx == columnDtl_un_fix_typ_nm) doDtl_un_fix_typ_nm_NX(info);
		else if (nx == columnDtl_foreign_typ) doDtl_foreign_typ_NX(info);
		else if (nx == columnDtl_foreign_typ_nm) doDtl_foreign_typ_nm_NX(info);
		else if (nx == columnDtl_cur_cd) doDtl_cur_cd_NX(info);
		else if (nx == columnDtl_cur_nm) doDtl_cur_nm_NX(info);
		else if (nx == columnDtl_asst_typ) doDtl_asst_typ_NX(info);
		else if (nx == columnDtl_asst_typ_nm) doDtl_asst_typ_nm_NX(info);
		else if (nx == columnDtl_quality_typ) doDtl_quality_typ_NX(info);
		else if (nx == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_NX(info);
		else if (nx == columnDtl_inv_loc_typ) doDtl_inv_loc_typ_NX(info);
		else if (nx == columnDtl_inv_loc_typ_nm) doDtl_inv_loc_typ_nm_NX(info);
		else if (nx == columnDtl_amt_sign_typ) doDtl_amt_sign_typ_NX(info);
		else if (nx == columnDtl_amt_sign_typ_nm) doDtl_amt_sign_typ_nm_NX(info);
		else if (nx == columnDtl_jnl_key1) doDtl_jnl_key1_NX(info);
		else if (nx == columnDtl_jnl_key2) doDtl_jnl_key2_NX(info);
		else if (nx == columnDtl_jnl_key3) doDtl_jnl_key3_NX(info);
		else if (nx == columnDtl_jnl_key4) doDtl_jnl_key4_NX(info);
		else if (nx == columnDtl_jnl_key5) doDtl_jnl_key5_NX(info);
		else if (nx == columnDtl_jnl_key6) doDtl_jnl_key6_NX(info);
		else if (nx == columnDtl_jnl_key7) doDtl_jnl_key7_NX(info);
		else if (nx == columnDtl_jnl_key8) doDtl_jnl_key8_NX(info);
		else if (nx == columnDtl_jnl_key9) doDtl_jnl_key9_NX(info);
		else if (nx == columnDtl_jnl_key10) doDtl_jnl_key10_NX(info);
		else if (nx == columnDtl_carry_flg) doDtl_carry_flg_NX(info);
		else if (nx == columnDtl_dr_abs_typ) doDtl_dr_abs_typ_NX(info);
		else if (nx == columnDtl_dr_abs_typ_nm) doDtl_dr_abs_typ_nm_NX(info);
		else if (nx == columnDtl_dr_abstract) doDtl_dr_abstract_NX(info);
		else if (nx == columnDtl_cr_abs_typ) doDtl_cr_abs_typ_NX(info);
		else if (nx == columnDtl_cr_abs_typ_nm) doDtl_cr_abs_typ_nm_NX(info);
		else if (nx == columnDtl_cr_abstract) doDtl_cr_abstract_NX(info);
		else if (nx == columnDtl_mon01_invalid_flg) doDtl_mon01_invalid_flg_NX(info);
		else if (nx == columnDtl_mon02_invalid_flg) doDtl_mon02_invalid_flg_NX(info);
		else if (nx == columnDtl_mon03_invalid_flg) doDtl_mon03_invalid_flg_NX(info);
		else if (nx == columnDtl_mon04_invalid_flg) doDtl_mon04_invalid_flg_NX(info);
		else if (nx == columnDtl_mon05_invalid_flg) doDtl_mon05_invalid_flg_NX(info);
		else if (nx == columnDtl_mon06_invalid_flg) doDtl_mon06_invalid_flg_NX(info);
		else if (nx == columnDtl_mon07_invalid_flg) doDtl_mon07_invalid_flg_NX(info);
		else if (nx == columnDtl_mon08_invalid_flg) doDtl_mon08_invalid_flg_NX(info);
		else if (nx == columnDtl_mon09_invalid_flg) doDtl_mon09_invalid_flg_NX(info);
		else if (nx == columnDtl_mon10_invalid_flg) doDtl_mon10_invalid_flg_NX(info);
		else if (nx == columnDtl_mon11_invalid_flg) doDtl_mon11_invalid_flg_NX(info);
		else if (nx == columnDtl_mon12_invalid_flg) doDtl_mon12_invalid_flg_NX(info);
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
	 * [Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_dpt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_dpt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_dpt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_dpt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ptn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ptn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_dpt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_dpt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_dpt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_dpt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ptn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ptn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_sub_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_sub_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_sub_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_sub_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_sub_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_sub_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_sub_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_sub_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ac_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ac_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ac_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ac_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ac_tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ac_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ac_tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ac_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_bp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_bp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_bp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_bp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_bp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_bp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_bp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_bp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_trd_sml_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_trd_sml_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_trd_sml_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_trd_sml_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[minus_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_minus_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_amt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_amt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_amt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_amt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_amt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_amt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_amt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_amt_typ_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[ac_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[un_fix_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_un_fix_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[un_fix_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_un_fix_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[foreign_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_foreign_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[foreign_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_foreign_typ_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[asst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inv_loc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inv_loc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inv_loc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inv_loc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_sign_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_sign_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_sign_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_sign_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[carry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_carry_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_abs_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_abs_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_abs_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_abs_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_abstract]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_abstract_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_abs_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_abs_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_abs_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_abs_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_abstract]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_abstract_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon01_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon01_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon02_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon02_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon03_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon03_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon04_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon04_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon05_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon05_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon06_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon06_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon07_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon07_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon08_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon08_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon09_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon09_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon10_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon10_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon11_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon11_invalid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[mon12_invalid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_mon12_invalid_flg_NX(MCEventInfo info){
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
		if (lc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_LC(info);
		else if (lc == Cnd_jnl_ptn_cd) doCnd_jnl_ptn_cd_LC(info);
		else if (lc == Cnd_jnl_ptn_nm) doCnd_jnl_ptn_nm_LC(info);
		else if (lc == Cnd_jnl_seq) doCnd_jnl_seq_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == columnDtl_jnl_ptn_cd) doDtl_jnl_ptn_cd_LC(info);
		else if (lc == columnDtl_jnl_ptn_nm) doDtl_jnl_ptn_nm_LC(info);
		else if (lc == columnDtl_jnl_seq) doDtl_jnl_seq_LC(info);
		else if (lc == columnDtl_dr_dpt_typ) doDtl_dr_dpt_typ_LC(info);
		else if (lc == columnDtl_dr_dpt_typ_nm) doDtl_dr_dpt_typ_nm_LC(info);
		else if (lc == columnDtl_dr_dpt_cd) doDtl_dr_dpt_cd_LC(info);
		else if (lc == columnDtl_dr_dpt_nm) doDtl_dr_dpt_nm_LC(info);
		else if (lc == columnDtl_dr_ptn_typ) doDtl_dr_ptn_typ_LC(info);
		else if (lc == columnDtl_dr_ptn_typ_nm) doDtl_dr_ptn_typ_nm_LC(info);
		else if (lc == columnDtl_dr_grp_cd) doDtl_dr_grp_cd_LC(info);
		else if (lc == columnDtl_dr_grp_nm) doDtl_dr_grp_nm_LC(info);
		else if (lc == columnDtl_cr_dpt_typ) doDtl_cr_dpt_typ_LC(info);
		else if (lc == columnDtl_cr_dpt_typ_nm) doDtl_cr_dpt_typ_nm_LC(info);
		else if (lc == columnDtl_cr_dpt_cd) doDtl_cr_dpt_cd_LC(info);
		else if (lc == columnDtl_cr_dpt_nm) doDtl_cr_dpt_nm_LC(info);
		else if (lc == columnDtl_cr_ptn_typ) doDtl_cr_ptn_typ_LC(info);
		else if (lc == columnDtl_cr_ptn_typ_nm) doDtl_cr_ptn_typ_nm_LC(info);
		else if (lc == columnDtl_cr_grp_cd) doDtl_cr_grp_cd_LC(info);
		else if (lc == columnDtl_cr_grp_nm) doDtl_cr_grp_nm_LC(info);
		else if (lc == columnDtl_dr_ac_cd) doDtl_dr_ac_cd_LC(info);
		else if (lc == columnDtl_dr_ac_nm) doDtl_dr_ac_nm_LC(info);
		else if (lc == columnDtl_dr_sub_ac_cd) doDtl_dr_sub_ac_cd_LC(info);
		else if (lc == columnDtl_dr_sub_ac_nm) doDtl_dr_sub_ac_nm_LC(info);
		else if (lc == columnDtl_cr_ac_cd) doDtl_cr_ac_cd_LC(info);
		else if (lc == columnDtl_cr_ac_nm) doDtl_cr_ac_nm_LC(info);
		else if (lc == columnDtl_cr_sub_ac_cd) doDtl_cr_sub_ac_cd_LC(info);
		else if (lc == columnDtl_cr_sub_ac_nm) doDtl_cr_sub_ac_nm_LC(info);
		else if (lc == columnDtl_dr_ac_tax_cd) doDtl_dr_ac_tax_cd_LC(info);
		else if (lc == columnDtl_dr_ac_tax_nm) doDtl_dr_ac_tax_nm_LC(info);
		else if (lc == columnDtl_cr_ac_tax_cd) doDtl_cr_ac_tax_cd_LC(info);
		else if (lc == columnDtl_cr_ac_tax_nm) doDtl_cr_ac_tax_nm_LC(info);
		else if (lc == columnDtl_dr_bp_typ) doDtl_dr_bp_typ_LC(info);
		else if (lc == columnDtl_dr_bp_typ_nm) doDtl_dr_bp_typ_nm_LC(info);
		else if (lc == columnDtl_dr_bp_cd) doDtl_dr_bp_cd_LC(info);
		else if (lc == columnDtl_dr_bp_nm) doDtl_dr_bp_nm_LC(info);
		else if (lc == columnDtl_cr_bp_typ) doDtl_cr_bp_typ_LC(info);
		else if (lc == columnDtl_cr_bp_typ_nm) doDtl_cr_bp_typ_nm_LC(info);
		else if (lc == columnDtl_cr_bp_cd) doDtl_cr_bp_cd_LC(info);
		else if (lc == columnDtl_cr_bp_nm) doDtl_cr_bp_nm_LC(info);
		else if (lc == columnDtl_dr_itm_typ) doDtl_dr_itm_typ_LC(info);
		else if (lc == columnDtl_dr_itm_typ_nm) doDtl_dr_itm_typ_nm_LC(info);
		else if (lc == columnDtl_cr_itm_typ) doDtl_cr_itm_typ_LC(info);
		else if (lc == columnDtl_cr_itm_typ_nm) doDtl_cr_itm_typ_nm_LC(info);
		else if (lc == columnDtl_dr_amt_typ) doDtl_dr_amt_typ_LC(info);
		else if (lc == columnDtl_dr_amt_typ_nm) doDtl_dr_amt_typ_nm_LC(info);
		else if (lc == columnDtl_cr_amt_typ) doDtl_cr_amt_typ_LC(info);
		else if (lc == columnDtl_cr_amt_typ_nm) doDtl_cr_amt_typ_nm_LC(info);
		else if (lc == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_LC(info);
		else if (lc == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_LC(info);
		else if (lc == columnDtl_ac_rsn_cd) doDtl_ac_rsn_cd_LC(info);
		else if (lc == columnDtl_ac_rsn_nm) doDtl_ac_rsn_nm_LC(info);
		else if (lc == columnDtl_purc_typ) doDtl_purc_typ_LC(info);
		else if (lc == columnDtl_purc_typ_nm) doDtl_purc_typ_nm_LC(info);
		else if (lc == columnDtl_un_fix_typ) doDtl_un_fix_typ_LC(info);
		else if (lc == columnDtl_un_fix_typ_nm) doDtl_un_fix_typ_nm_LC(info);
		else if (lc == columnDtl_foreign_typ) doDtl_foreign_typ_LC(info);
		else if (lc == columnDtl_foreign_typ_nm) doDtl_foreign_typ_nm_LC(info);
		else if (lc == columnDtl_cur_cd) doDtl_cur_cd_LC(info);
		else if (lc == columnDtl_cur_nm) doDtl_cur_nm_LC(info);
		else if (lc == columnDtl_asst_typ) doDtl_asst_typ_LC(info);
		else if (lc == columnDtl_asst_typ_nm) doDtl_asst_typ_nm_LC(info);
		else if (lc == columnDtl_quality_typ) doDtl_quality_typ_LC(info);
		else if (lc == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_LC(info);
		else if (lc == columnDtl_inv_loc_typ) doDtl_inv_loc_typ_LC(info);
		else if (lc == columnDtl_inv_loc_typ_nm) doDtl_inv_loc_typ_nm_LC(info);
		else if (lc == columnDtl_amt_sign_typ) doDtl_amt_sign_typ_LC(info);
		else if (lc == columnDtl_amt_sign_typ_nm) doDtl_amt_sign_typ_nm_LC(info);
		else if (lc == columnDtl_jnl_key1) doDtl_jnl_key1_LC(info);
		else if (lc == columnDtl_jnl_key2) doDtl_jnl_key2_LC(info);
		else if (lc == columnDtl_jnl_key3) doDtl_jnl_key3_LC(info);
		else if (lc == columnDtl_jnl_key4) doDtl_jnl_key4_LC(info);
		else if (lc == columnDtl_jnl_key5) doDtl_jnl_key5_LC(info);
		else if (lc == columnDtl_jnl_key6) doDtl_jnl_key6_LC(info);
		else if (lc == columnDtl_jnl_key7) doDtl_jnl_key7_LC(info);
		else if (lc == columnDtl_jnl_key8) doDtl_jnl_key8_LC(info);
		else if (lc == columnDtl_jnl_key9) doDtl_jnl_key9_LC(info);
		else if (lc == columnDtl_jnl_key10) doDtl_jnl_key10_LC(info);
		else if (lc == columnDtl_dr_abs_typ) doDtl_dr_abs_typ_LC(info);
		else if (lc == columnDtl_dr_abs_typ_nm) doDtl_dr_abs_typ_nm_LC(info);
		else if (lc == columnDtl_dr_abstract) doDtl_dr_abstract_LC(info);
		else if (lc == columnDtl_cr_abs_typ) doDtl_cr_abs_typ_LC(info);
		else if (lc == columnDtl_cr_abs_typ_nm) doDtl_cr_abs_typ_nm_LC(info);
		else if (lc == columnDtl_cr_abstract) doDtl_cr_abstract_LC(info);
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
	 * [Dtl]パネルの[jnl_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_dpt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_dpt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_dpt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_dpt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ptn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ptn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_dpt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_dpt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_dpt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_dpt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ptn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ptn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_sub_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_sub_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_sub_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_sub_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_sub_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_sub_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_sub_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_sub_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ac_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ac_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_ac_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_ac_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ac_tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ac_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_ac_tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_ac_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_bp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_bp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_bp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_bp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_bp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_bp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_bp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_bp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_amt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_amt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_amt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_amt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_amt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_amt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_amt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_amt_typ_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[ac_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[purc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_purc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[un_fix_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_un_fix_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[un_fix_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_un_fix_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[foreign_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_foreign_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[foreign_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_foreign_typ_nm_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[asst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inv_loc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inv_loc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inv_loc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inv_loc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_sign_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_sign_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[amt_sign_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_amt_sign_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[jnl_key10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_jnl_key10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_abs_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_abs_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_abs_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_abs_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dr_abstract]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dr_abstract_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_abs_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_abs_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_abs_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_abs_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cr_abstract]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cr_abstract_LC(MCEventInfo info){
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

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL1090.Srch01")) {
			return new MA_MABCL1090_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL1090_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL1090_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL1090_Srch01;

		/** コンストラクタ */
		protected MA_MABCL1090_Srch01Bridge() {
			p_MA_MABCL1090_Srch01 = new MCParam(PDef.MA_MABCL1090_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL1090_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP1090.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1090.DtlR.class));

			p_MA_MABCL1090_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL1090_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL1090_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL1090_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL1090_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP1090.CndR up0() {
			return (mcframe.clientMABC.MABCP1090.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP1090.DtlR> down0() {
			return (MCList<mcframe.clientMABC.MABCP1090.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABCL1090_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP1090.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL1090_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABC.MABCP1090.DtlR>)p_MA_MABCL1090_Srch01.getContainerParam().getDownBlock(0));
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