package mcframe.clientMBBB.MBBBP0060;

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
import mcframe.clientMBBB.MBBBP0060.MBBBP_AcPaySrch_MC.MB_MBBBL0060_Srch01Caller;

/**
 * 画面"MBBBP_AcPaySrch"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MBBBP_AcPaySrch_MC_A extends mcframe.clientMAUD.MAUDP0010.MAUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MB";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MBBB";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MBBBP0060";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
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
	public MCLabel Cnd_ac_ym_fr_Label = null;
	/**
	 * Recording month FROM 計上年月ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_ac_ym_fr = null;
	public MCLabel Cnd_ac_ym_to_Label = null;
	/**
	 * Recording month TO 計上年月ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_ac_ym_to = null;
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
	public MCLabel Cnd_ac_slip_typ_Label = null;
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ac_slip_typ = null;
	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public MCTextField Cnd_ac_slip_typ_nm = null;
	public MCLabel Cnd_ac_rsn_cd_Label = null;
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ac_rsn_cd = null;
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public MCTextField Cnd_ac_rsn_nm = null;
	public MCLabel Cnd_pay_dpt_cd_Label = null;
	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_pay_dpt_cd = null;
	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public MCTextField Cnd_pay_dpt_nm = null;
	public MCLabel Cnd_bsppl_dpt_cd_Label = null;
	/**
	 * Scheduled payee dept. cd. 支払予定管理先部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_bsppl_dpt_cd = null;
	/**
	 * Scheduled payee dept. name 支払予定管理先部門名.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_dpt_nm = null;
	public MCLabel Cnd_ap_dpt_cd_Label = null;
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCTextField Cnd_ap_dpt_nm = null;
	public MCLabel Cnd_so_dpt_cd_Label = null;
	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_so_dpt_cd = null;
	/**
	 * Offset dept. name 相殺部門名.<p>
	 *
	 */
	public MCTextField Cnd_so_dpt_nm = null;
	public MCLabel Cnd_psppl_cd_Label = null;
	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_psppl_cd = null;
	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public MCTextField Cnd_psppl_nm = null;
	public MCLabel Cnd_bsppl_cd_Label = null;
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_cd = null;
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public MCTextField Cnd_bsppl_nm = null;
	public MCLabel Cnd_asppl_cd_Label = null;
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_asppl_cd = null;
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public MCTextField Cnd_asppl_nm = null;
	public MCLabel Cnd_setoff_cd_Label = null;
	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_setoff_cd = null;
	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public MCTextField Cnd_setoff_nm = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMBBB.MBBBP0060.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_data_no = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_nm = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_ym = null;
	/**
	 * Payment result No. 支払実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_act_no = null;
	/**
	 * Payment result sequence No. 支払実績連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_act_seq = null;
	/**
	 * Payment result revision number 支払実績改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_act_rev = null;
	/**
	 * Payment result details No. 支払実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_act_d_no = null;
	/**
	 * Payment result details sequence number 支払実績明細連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_act_d_seq = null;
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_dt = null;
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public MCColumnConfig columnRslt_can_flg = null;
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_slip_typ = null;
	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_slip_typ_nm = null;
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_rsn_cd = null;
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_rsn_nm = null;
	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_dpt_cd = null;
	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_dpt_nm = null;
	/**
	 * Scheduled payee dept. cd. 支払予定管理先部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_dpt_cd = null;
	/**
	 * Scheduled payee dept. name 支払予定管理先部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_dpt_nm = null;
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_dpt_cd = null;
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ap_dpt_nm = null;
	/**
	 * Offset dept. cd. 相殺部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_so_dpt_cd = null;
	/**
	 * Offset dept. name 相殺部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_so_dpt_nm = null;
	/**
	 * Spare dept. cd. 1 予備部門ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dpt_cd1 = null;
	/**
	 * Spare dept. name 1 予備部門名１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dpt_nm1 = null;
	/**
	 * Spare dept. cd. 2 予備部門ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dpt_cd2 = null;
	/**
	 * Spare dept. name 2 予備部門名２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dpt_nm2 = null;
	/**
	 * Spare dept. cd. 3 予備部門ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dpt_cd3 = null;
	/**
	 * Spare dept. name 3 予備部門名３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dpt_nm3 = null;
	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_psppl_cd = null;
	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_psppl_nm = null;
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_cd = null;
	/**
	 * Scheduled payee name 支払予定管理先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bsppl_nm = null;
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asppl_cd = null;
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asppl_nm = null;
	/**
	 * Offset destination cd. 相殺先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_setoff_cd = null;
	/**
	 * Offset destination name 相殺先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mst_setoff_nm = null;
	/**
	 * Optional offset destination name 任意相殺先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_setoff_nm = null;
	/**
	 * Foreign transaction 国外取引.<p>
	 *
	 */
	public MCColumnConfig columnRslt_foreign_flg = null;
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_cd = null;
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_nm = null;
	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_amt = null;
	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_tax_amt = null;
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_nm = null;
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_amt = null;
	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_tax_amt = null;
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_cd = null;
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_nm = null;
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate_cd = null;
	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate_nm = null;
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate = null;
	/**
	 * Counterpart invoice No. 相手先請求書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rcv_bill_no = null;
	/**
	 * Payment collation No. 支払照合ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_chk_no = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_nm = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_iv_no = null;
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wrk_no = null;
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bank_ac_cd = null;
	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bank_ac_nm = null;
	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_bank_ac_cd = null;
	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pay_bank_ac_nm = null;
	/**
	 * Note number 手形番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_note_no = null;
	/**
	 * Journal key column 1 仕訳キー項目１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_key1 = null;
	/**
	 * Journal key column 2 仕訳キー項目２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_key2 = null;
	/**
	 * Journal key column 3 仕訳キー項目３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_key3 = null;
	/**
	 * Journal key column 4 仕訳キー項目４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_key4 = null;
	/**
	 * Journal key column 5 仕訳キー項目５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_key5 = null;
	/**
	 * Journal key column 6 仕訳キー項目６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_key6 = null;
	/**
	 * Journal key column 7 仕訳キー項目７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_key7 = null;
	/**
	 * Journal key column 8 仕訳キー項目８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_key8 = null;
	/**
	 * Journal key column 9 仕訳キー項目９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_key9 = null;
	/**
	 * Journal key column 10 仕訳キー項目１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_key10 = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_rmrks = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_d_rmrks = null;
	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char1 = null;
	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char2 = null;
	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char3 = null;
	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char4 = null;
	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char5 = null;
	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char6 = null;
	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char7 = null;
	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char8 = null;
	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char9 = null;
	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char10 = null;
	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_num1 = null;
	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_num2 = null;
	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_num3 = null;
	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dt1 = null;
	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dt2 = null;
	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_dt3 = null;
	/**
	 * Number of journalizing 仕訳実行回数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_jnl_fin_cnt = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_srv_req_no = null;
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
	
	/** [MB_MBBBL0060_Srch01]のCallerの作成 */
	protected MBBBP_AcPaySrch_MC.MB_MBBBL0060_Srch01Caller createMB_MBBBL0060_Srch01() {
		MBBBP_AcPaySrch_MC.MB_MBBBL0060_Srch01Caller<MBBBP_AcPaySrch, MB_MBBBL0060_Srch01Bridge>
		caller = ((MBBBP_AcPaySrch_MC)this).new MB_MBBBL0060_Srch01Caller<MBBBP_AcPaySrch, MB_MBBBL0060_Srch01Bridge>(
					(MBBBP_AcPaySrch)this, new MB_MBBBL0060_Srch01Bridge());
		return caller;
	}
	/** [MB_MBBBL0060_Srch01]の呼び出し */
	protected void callMB_MBBBL0060_Srch01() {
		MCCaller caller = createMB_MBBBL0060_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMBBB.MBBBP0060.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMBBB.MBBBP0060.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMBBB.MBBBP0060.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBB.MBBBP0060.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMBBB.MBBBP0060.CndR createCndR() {
		return mcframe.clientMBBB.MBBBP0060.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMBBB.MBBBP0060.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBB.MBBBP0060.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMBBB.MBBBP0060.RsltR createRsltR() {
		return mcframe.clientMBBB.MBBBP0060.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMBBB.MBBBP0060.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMBBB.MBBBP0060.RsltR.class);
	}

	/**
	 * RsltTableを初期化します。
	 */
	protected void createRsltTable(){
		if(RsltTable == null){
			RsltTable = beansFactory.createTable2("Rslt.table");
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
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
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
		if(aCnt == getRsltL()) return "Rslt";
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
		if(bId.equals("Rslt")) return getRsltL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MBBBP_AcPaySrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MBBBP_AcPaySrch_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MBBBP_AcPaySrch_MC.jbCreateTop((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.jbCreateFold((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.jbCreateCnd((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.jbCreateCtrl((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.jbCreateRslt((MBBBP_AcPaySrch)this);
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MBBBP_AcPaySrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MBBBP_AcPaySrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MBBBP_AcPaySrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MBBBP_AcPaySrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MBBBP_AcPaySrch p) {
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
	
	
	/** [Cnd_ac_slip_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ac_slip_typ_p = null;

	/**
	 * [Cnd_ac_slip_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ac_slip_typ_ListPutter() {
		if (Cnd_ac_slip_typ_p == null) {
			Cnd_ac_slip_typ_p = createCnd_ac_slip_typ_ListPutter(Cnd_ac_slip_typ, "ac_slip_typ", "ac_slip_typ_nm");

		}
		return Cnd_ac_slip_typ_p;
	}
	
	
	/** [Cnd_ac_rsn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ac_rsn_cd_p = null;

	/**
	 * [Cnd_ac_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ac_rsn_cd_ListPutter() {
		if (Cnd_ac_rsn_cd_p == null) {
			Cnd_ac_rsn_cd_p = createCnd_ac_rsn_cd_ListPutter(Cnd_ac_rsn_cd, "ac_rsn_cd", "ac_rsn_nm");

		}
		return Cnd_ac_rsn_cd_p;
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
	
	
	/** [Cnd_so_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_so_dpt_cd_p = null;

	/**
	 * [Cnd_so_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_so_dpt_cd_ListPutter() {
		if (Cnd_so_dpt_cd_p == null) {
			Cnd_so_dpt_cd_p = createCnd_so_dpt_cd_ListPutter(Cnd_so_dpt_cd, "so_dpt_cd", "so_dpt_nm");

		}
		return Cnd_so_dpt_cd_p;
	}
	
	
	/** [Cnd_psppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_psppl_cd_p = null;

	/**
	 * [Cnd_psppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_psppl_cd_ListPutter() {
		if (Cnd_psppl_cd_p == null) {
			Cnd_psppl_cd_p = createCnd_psppl_cd_ListPutter(Cnd_psppl_cd, "psppl_cd", "psppl_nm");

		}
		return Cnd_psppl_cd_p;
	}
	
	
	/** [Cnd_bsppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bsppl_cd_p = null;

	/**
	 * [Cnd_bsppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bsppl_cd_ListPutter() {
		if (Cnd_bsppl_cd_p == null) {
			Cnd_bsppl_cd_p = createCnd_bsppl_cd_ListPutter(Cnd_bsppl_cd, "bsppl_cd", "bsppl_nm");

		}
		return Cnd_bsppl_cd_p;
	}
	
	
	/** [Cnd_asppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_asppl_cd_p = null;

	/**
	 * [Cnd_asppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_asppl_cd_ListPutter() {
		if (Cnd_asppl_cd_p == null) {
			Cnd_asppl_cd_p = createCnd_asppl_cd_ListPutter(Cnd_asppl_cd, "asppl_cd", "asppl_nm");

		}
		return Cnd_asppl_cd_p;
	}
	
	
	/** [Cnd_setoff_cd_ListPutter]の定義 */
	private MCListPutter Cnd_setoff_cd_p = null;

	/**
	 * [Cnd_setoff_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_setoff_cd_ListPutter() {
		if (Cnd_setoff_cd_p == null) {
			Cnd_setoff_cd_p = createCnd_setoff_cd_ListPutter(Cnd_setoff_cd, "setoff_cd", "setoff_nm");

		}
		return Cnd_setoff_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBBP_AcPaySrch create(){
		MBBBP_AcPaySrch p = new MBBBP_AcPaySrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MBBBP_AcPaySrch create(String name){
		MBBBP_AcPaySrch p = new MBBBP_AcPaySrch(name);
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
		MBBBP_AcPaySrch_MC.jbfInitTop((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.jbfInitFold((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.jbfInitCnd((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.jbfInitCtrl((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.jbfInitRslt((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.jbInitTop((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.jbInitFold((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.jbInitCnd((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.jbInitCtrl((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.jbInitRslt((MBBBP_AcPaySrch)this);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MBBBP_AcPaySrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MBBBP_AcPaySrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MBBBP_AcPaySrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ac_ym_fr_Label = p.beansFactory.createLabel("Cnd.ac_ym_fr_Label");
		p.Cnd_ac_ym_fr = p.beansFactory.createDateField("Cnd.ac_ym_fr");
		p.Cnd_ac_ym_fr.setLabel(p.Cnd_ac_ym_fr_Label);
		p.Cnd_ac_ym_to_Label = p.beansFactory.createLabel("Cnd.ac_ym_to_Label");
		p.Cnd_ac_ym_to = p.beansFactory.createDateField("Cnd.ac_ym_to");
		p.Cnd_ac_ym_to.setLabel(p.Cnd_ac_ym_to_Label);
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_ac_slip_typ_Label = p.beansFactory.createLabel("Cnd.ac_slip_typ_Label");
		p.Cnd_ac_slip_typ = p.beansFactory.createTextComboBox("Cnd.ac_slip_typ");
		p.Cnd_ac_slip_typ.setLabel(p.Cnd_ac_slip_typ_Label);
		p.Cnd_ac_slip_typ_nm = p.beansFactory.createTextField("Cnd.ac_slip_typ_nm");
		p.Cnd_ac_rsn_cd_Label = p.beansFactory.createLabel("Cnd.ac_rsn_cd_Label");
		p.Cnd_ac_rsn_cd = p.beansFactory.createTextComboBox("Cnd.ac_rsn_cd");
		p.Cnd_ac_rsn_cd.setLabel(p.Cnd_ac_rsn_cd_Label);
		p.Cnd_ac_rsn_nm = p.beansFactory.createTextField("Cnd.ac_rsn_nm");
		p.Cnd_pay_dpt_cd_Label = p.beansFactory.createLabel("Cnd.pay_dpt_cd_Label");
		p.Cnd_pay_dpt_cd = p.beansFactory.createTextComboBox("Cnd.pay_dpt_cd");
		p.Cnd_pay_dpt_cd.setLabel(p.Cnd_pay_dpt_cd_Label);
		p.Cnd_pay_dpt_nm = p.beansFactory.createTextField("Cnd.pay_dpt_nm");
		p.Cnd_bsppl_dpt_cd_Label = p.beansFactory.createLabel("Cnd.bsppl_dpt_cd_Label");
		p.Cnd_bsppl_dpt_cd = p.beansFactory.createTextComboBox("Cnd.bsppl_dpt_cd");
		p.Cnd_bsppl_dpt_cd.setLabel(p.Cnd_bsppl_dpt_cd_Label);
		p.Cnd_bsppl_dpt_nm = p.beansFactory.createTextField("Cnd.bsppl_dpt_nm");
		p.Cnd_ap_dpt_cd_Label = p.beansFactory.createLabel("Cnd.ap_dpt_cd_Label");
		p.Cnd_ap_dpt_cd = p.beansFactory.createTextComboBox("Cnd.ap_dpt_cd");
		p.Cnd_ap_dpt_cd.setLabel(p.Cnd_ap_dpt_cd_Label);
		p.Cnd_ap_dpt_nm = p.beansFactory.createTextField("Cnd.ap_dpt_nm");
		p.Cnd_so_dpt_cd_Label = p.beansFactory.createLabel("Cnd.so_dpt_cd_Label");
		p.Cnd_so_dpt_cd = p.beansFactory.createTextComboBox("Cnd.so_dpt_cd");
		p.Cnd_so_dpt_cd.setLabel(p.Cnd_so_dpt_cd_Label);
		p.Cnd_so_dpt_nm = p.beansFactory.createTextField("Cnd.so_dpt_nm");
		p.Cnd_psppl_cd_Label = p.beansFactory.createLabel("Cnd.psppl_cd_Label");
		p.Cnd_psppl_cd = p.beansFactory.createTextField("Cnd.psppl_cd");
		p.Cnd_psppl_cd.setLabel(p.Cnd_psppl_cd_Label);
		p.Cnd_psppl_nm = p.beansFactory.createTextField("Cnd.psppl_nm");
		p.Cnd_bsppl_cd_Label = p.beansFactory.createLabel("Cnd.bsppl_cd_Label");
		p.Cnd_bsppl_cd = p.beansFactory.createTextField("Cnd.bsppl_cd");
		p.Cnd_bsppl_cd.setLabel(p.Cnd_bsppl_cd_Label);
		p.Cnd_bsppl_nm = p.beansFactory.createTextField("Cnd.bsppl_nm");
		p.Cnd_asppl_cd_Label = p.beansFactory.createLabel("Cnd.asppl_cd_Label");
		p.Cnd_asppl_cd = p.beansFactory.createTextField("Cnd.asppl_cd");
		p.Cnd_asppl_cd.setLabel(p.Cnd_asppl_cd_Label);
		p.Cnd_asppl_nm = p.beansFactory.createTextField("Cnd.asppl_nm");
		p.Cnd_setoff_cd_Label = p.beansFactory.createLabel("Cnd.setoff_cd_Label");
		p.Cnd_setoff_cd = p.beansFactory.createTextField("Cnd.setoff_cd");
		p.Cnd_setoff_cd.setLabel(p.Cnd_setoff_cd_Label);
		p.Cnd_setoff_nm = p.beansFactory.createTextField("Cnd.setoff_nm");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MBBBP_AcPaySrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MBBBP_AcPaySrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_data_no = p.beansFactory.createTableColumn("Rslt.data_no", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_ac_ym = p.beansFactory.createTableColumn("Rslt.ac_ym", MCColumnType.DATE);
		p.columnRslt_pay_act_no = p.beansFactory.createTableColumn("Rslt.pay_act_no", MCColumnType.TEXT);
		p.columnRslt_pay_act_seq = p.beansFactory.createTableColumn("Rslt.pay_act_seq", MCColumnType.NUMBER);
		p.columnRslt_pay_act_rev = p.beansFactory.createTableColumn("Rslt.pay_act_rev", MCColumnType.NUMBER);
		p.columnRslt_pay_act_d_no = p.beansFactory.createTableColumn("Rslt.pay_act_d_no", MCColumnType.TEXT);
		p.columnRslt_pay_act_d_seq = p.beansFactory.createTableColumn("Rslt.pay_act_d_seq", MCColumnType.NUMBER);
		p.columnRslt_ac_dt = p.beansFactory.createTableColumn("Rslt.ac_dt", MCColumnType.DATE);
		p.columnRslt_can_flg = p.beansFactory.createTableColumn("Rslt.can_flg", MCColumnType.CHECK);
		p.columnRslt_ac_slip_typ = p.beansFactory.createTableColumn("Rslt.ac_slip_typ", MCColumnType.TEXT);
		p.columnRslt_ac_slip_typ_nm = p.beansFactory.createTableColumn("Rslt.ac_slip_typ_nm", MCColumnType.TEXT);
		p.columnRslt_ac_rsn_cd = p.beansFactory.createTableColumn("Rslt.ac_rsn_cd", MCColumnType.TEXT);
		p.columnRslt_ac_rsn_nm = p.beansFactory.createTableColumn("Rslt.ac_rsn_nm", MCColumnType.TEXT);
		p.columnRslt_pay_dpt_cd = p.beansFactory.createTableColumn("Rslt.pay_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_pay_dpt_nm = p.beansFactory.createTableColumn("Rslt.pay_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_bsppl_dpt_cd = p.beansFactory.createTableColumn("Rslt.bsppl_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_bsppl_dpt_nm = p.beansFactory.createTableColumn("Rslt.bsppl_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_ap_dpt_cd = p.beansFactory.createTableColumn("Rslt.ap_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_ap_dpt_nm = p.beansFactory.createTableColumn("Rslt.ap_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_so_dpt_cd = p.beansFactory.createTableColumn("Rslt.so_dpt_cd", MCColumnType.TEXT);
		p.columnRslt_so_dpt_nm = p.beansFactory.createTableColumn("Rslt.so_dpt_nm", MCColumnType.TEXT);
		p.columnRslt_sub_dpt_cd1 = p.beansFactory.createTableColumn("Rslt.sub_dpt_cd1", MCColumnType.TEXT);
		p.columnRslt_sub_dpt_nm1 = p.beansFactory.createTableColumn("Rslt.sub_dpt_nm1", MCColumnType.TEXT);
		p.columnRslt_sub_dpt_cd2 = p.beansFactory.createTableColumn("Rslt.sub_dpt_cd2", MCColumnType.TEXT);
		p.columnRslt_sub_dpt_nm2 = p.beansFactory.createTableColumn("Rslt.sub_dpt_nm2", MCColumnType.TEXT);
		p.columnRslt_sub_dpt_cd3 = p.beansFactory.createTableColumn("Rslt.sub_dpt_cd3", MCColumnType.TEXT);
		p.columnRslt_sub_dpt_nm3 = p.beansFactory.createTableColumn("Rslt.sub_dpt_nm3", MCColumnType.TEXT);
		p.columnRslt_psppl_cd = p.beansFactory.createTableColumn("Rslt.psppl_cd", MCColumnType.TEXT);
		p.columnRslt_psppl_nm = p.beansFactory.createTableColumn("Rslt.psppl_nm", MCColumnType.TEXT);
		p.columnRslt_bsppl_cd = p.beansFactory.createTableColumn("Rslt.bsppl_cd", MCColumnType.TEXT);
		p.columnRslt_bsppl_nm = p.beansFactory.createTableColumn("Rslt.bsppl_nm", MCColumnType.TEXT);
		p.columnRslt_asppl_cd = p.beansFactory.createTableColumn("Rslt.asppl_cd", MCColumnType.TEXT);
		p.columnRslt_asppl_nm = p.beansFactory.createTableColumn("Rslt.asppl_nm", MCColumnType.TEXT);
		p.columnRslt_setoff_cd = p.beansFactory.createTableColumn("Rslt.setoff_cd", MCColumnType.TEXT);
		p.columnRslt_mst_setoff_nm = p.beansFactory.createTableColumn("Rslt.mst_setoff_nm", MCColumnType.TEXT);
		p.columnRslt_setoff_nm = p.beansFactory.createTableColumn("Rslt.setoff_nm", MCColumnType.TEXT);
		p.columnRslt_foreign_flg = p.beansFactory.createTableColumn("Rslt.foreign_flg", MCColumnType.CHECK);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_nm = p.beansFactory.createTableColumn("Rslt.base_cur_nm", MCColumnType.TEXT);
		p.columnRslt_base_cur_amt = p.beansFactory.createTableColumn("Rslt.base_cur_amt", MCColumnType.NUMBER);
		p.columnRslt_base_cur_tax_amt = p.beansFactory.createTableColumn("Rslt.base_cur_tax_amt", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cur_amt = p.beansFactory.createTableColumn("Rslt.trd_cur_amt", MCColumnType.NUMBER);
		p.columnRslt_trd_cur_tax_amt = p.beansFactory.createTableColumn("Rslt.trd_cur_tax_amt", MCColumnType.NUMBER);
		p.columnRslt_tax_cd = p.beansFactory.createTableColumn("Rslt.tax_cd", MCColumnType.TEXT);
		p.columnRslt_tax_nm = p.beansFactory.createTableColumn("Rslt.tax_nm", MCColumnType.TEXT);
		p.columnRslt_xrate_cd = p.beansFactory.createTableColumn("Rslt.xrate_cd", MCColumnType.TEXT);
		p.columnRslt_xrate_nm = p.beansFactory.createTableColumn("Rslt.xrate_nm", MCColumnType.TEXT);
		p.columnRslt_xrate = p.beansFactory.createTableColumn("Rslt.xrate", MCColumnType.NUMBER);
		p.columnRslt_rcv_bill_no = p.beansFactory.createTableColumn("Rslt.rcv_bill_no", MCColumnType.TEXT);
		p.columnRslt_pay_chk_no = p.beansFactory.createTableColumn("Rslt.pay_chk_no", MCColumnType.TEXT);
		p.columnRslt_usr_cd = p.beansFactory.createTableColumn("Rslt.usr_cd", MCColumnType.TEXT);
		p.columnRslt_usr_nm = p.beansFactory.createTableColumn("Rslt.usr_nm", MCColumnType.TEXT);
		p.columnRslt_iv_no = p.beansFactory.createTableColumn("Rslt.iv_no", MCColumnType.TEXT);
		p.columnRslt_wrk_no = p.beansFactory.createTableColumn("Rslt.wrk_no", MCColumnType.TEXT);
		p.columnRslt_bank_ac_cd = p.beansFactory.createTableColumn("Rslt.bank_ac_cd", MCColumnType.TEXT);
		p.columnRslt_bank_ac_nm = p.beansFactory.createTableColumn("Rslt.bank_ac_nm", MCColumnType.TEXT);
		p.columnRslt_pay_bank_ac_cd = p.beansFactory.createTableColumn("Rslt.pay_bank_ac_cd", MCColumnType.TEXT);
		p.columnRslt_pay_bank_ac_nm = p.beansFactory.createTableColumn("Rslt.pay_bank_ac_nm", MCColumnType.TEXT);
		p.columnRslt_note_no = p.beansFactory.createTableColumn("Rslt.note_no", MCColumnType.TEXT);
		p.columnRslt_jnl_key1 = p.beansFactory.createTableColumn("Rslt.jnl_key1", MCColumnType.TEXT);
		p.columnRslt_jnl_key2 = p.beansFactory.createTableColumn("Rslt.jnl_key2", MCColumnType.TEXT);
		p.columnRslt_jnl_key3 = p.beansFactory.createTableColumn("Rslt.jnl_key3", MCColumnType.TEXT);
		p.columnRslt_jnl_key4 = p.beansFactory.createTableColumn("Rslt.jnl_key4", MCColumnType.TEXT);
		p.columnRslt_jnl_key5 = p.beansFactory.createTableColumn("Rslt.jnl_key5", MCColumnType.TEXT);
		p.columnRslt_jnl_key6 = p.beansFactory.createTableColumn("Rslt.jnl_key6", MCColumnType.TEXT);
		p.columnRslt_jnl_key7 = p.beansFactory.createTableColumn("Rslt.jnl_key7", MCColumnType.TEXT);
		p.columnRslt_jnl_key8 = p.beansFactory.createTableColumn("Rslt.jnl_key8", MCColumnType.TEXT);
		p.columnRslt_jnl_key9 = p.beansFactory.createTableColumn("Rslt.jnl_key9", MCColumnType.TEXT);
		p.columnRslt_jnl_key10 = p.beansFactory.createTableColumn("Rslt.jnl_key10", MCColumnType.TEXT);
		p.columnRslt_trd_rmrks = p.beansFactory.createTableColumn("Rslt.trd_rmrks", MCColumnType.TEXT);
		p.columnRslt_trd_d_rmrks = p.beansFactory.createTableColumn("Rslt.trd_d_rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_sub_char4 = p.beansFactory.createTableColumn("Rslt.sub_char4", MCColumnType.TEXT);
		p.columnRslt_sub_char5 = p.beansFactory.createTableColumn("Rslt.sub_char5", MCColumnType.TEXT);
		p.columnRslt_sub_char6 = p.beansFactory.createTableColumn("Rslt.sub_char6", MCColumnType.TEXT);
		p.columnRslt_sub_char7 = p.beansFactory.createTableColumn("Rslt.sub_char7", MCColumnType.TEXT);
		p.columnRslt_sub_char8 = p.beansFactory.createTableColumn("Rslt.sub_char8", MCColumnType.TEXT);
		p.columnRslt_sub_char9 = p.beansFactory.createTableColumn("Rslt.sub_char9", MCColumnType.TEXT);
		p.columnRslt_sub_char10 = p.beansFactory.createTableColumn("Rslt.sub_char10", MCColumnType.TEXT);
		p.columnRslt_sub_num1 = p.beansFactory.createTableColumn("Rslt.sub_num1", MCColumnType.NUMBER);
		p.columnRslt_sub_num2 = p.beansFactory.createTableColumn("Rslt.sub_num2", MCColumnType.NUMBER);
		p.columnRslt_sub_num3 = p.beansFactory.createTableColumn("Rslt.sub_num3", MCColumnType.NUMBER);
		p.columnRslt_sub_dt1 = p.beansFactory.createTableColumn("Rslt.sub_dt1", MCColumnType.DATE);
		p.columnRslt_sub_dt2 = p.beansFactory.createTableColumn("Rslt.sub_dt2", MCColumnType.DATE);
		p.columnRslt_sub_dt3 = p.beansFactory.createTableColumn("Rslt.sub_dt3", MCColumnType.DATE);
		p.columnRslt_jnl_fin_cnt = p.beansFactory.createTableColumn("Rslt.jnl_fin_cnt", MCColumnType.NUMBER);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MBBBP_AcPaySrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.setLastBeans(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
		p.TopPanel.setValueCheck(false);
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
	protected static void jbInitFold(MBBBP_AcPaySrch p) {
		// ブロック関連の初期化
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MBBBP_AcPaySrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_ac_ym_fr_Label);
		p.CndPanel.add(p.Cnd_ac_ym_fr);
		p.CndPanel.setLastBeans(p.Cnd_ac_ym_fr);
		p.Cnd_ac_ym_fr.setNextBeans(p.Cnd_ac_ym_to);
		p.Cnd_ac_ym_fr.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.ac_ym_fr_META);
		p.Cnd_ac_ym_fr.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.CndPanel.add(p.Cnd_ac_ym_to_Label);
		p.CndPanel.add(p.Cnd_ac_ym_to);
		p.Cnd_ac_ym_to.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_ac_ym_to.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.ac_ym_to_META);
		p.Cnd_ac_ym_to.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_ac_slip_typ);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_ac_slip_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_slip_typ, true);
		p.Cnd_ac_slip_typ.setLinkBeans(p.Cnd_ac_slip_typ_nm);
		p.CndPanel.add(p.Cnd_ac_slip_typ_Label);
		p.CndPanel.add(p.Cnd_ac_slip_typ);
		p.Cnd_ac_slip_typ.setNextBeans(p.Cnd_ac_slip_typ_nm);
		p.Cnd_ac_slip_typ.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.ac_slip_typ_META);
		p.CndPanel.add(p.Cnd_ac_slip_typ_nm);
		p.Cnd_ac_slip_typ_nm.setNextBeans(p.Cnd_ac_rsn_cd);
		p.Cnd_ac_slip_typ_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.ac_slip_typ_nm_META);
		p.Cnd_ac_rsn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_rsn_cd, true);
		p.Cnd_ac_rsn_cd.setLinkBeans(p.Cnd_ac_rsn_nm);
		p.CndPanel.add(p.Cnd_ac_rsn_cd_Label);
		p.CndPanel.add(p.Cnd_ac_rsn_cd);
		p.Cnd_ac_rsn_cd.setNextBeans(p.Cnd_ac_rsn_nm);
		p.Cnd_ac_rsn_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.ac_rsn_cd_META);
		p.CndPanel.add(p.Cnd_ac_rsn_nm);
		p.Cnd_ac_rsn_nm.setNextBeans(p.Cnd_pay_dpt_cd);
		p.Cnd_ac_rsn_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.ac_rsn_nm_META);
		p.setPluralValueEnable(p.Cnd_ac_rsn_nm, true);
		p.Cnd_pay_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pay_dpt_cd, true);
		p.Cnd_pay_dpt_cd.setLinkBeans(p.Cnd_pay_dpt_nm);
		p.CndPanel.add(p.Cnd_pay_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_pay_dpt_cd);
		p.Cnd_pay_dpt_cd.setNextBeans(p.Cnd_pay_dpt_nm);
		p.Cnd_pay_dpt_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.pay_dpt_cd_META);
		p.CndPanel.add(p.Cnd_pay_dpt_nm);
		p.Cnd_pay_dpt_nm.setNextBeans(p.Cnd_bsppl_dpt_cd);
		p.Cnd_pay_dpt_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.pay_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_pay_dpt_nm, true);
		p.Cnd_bsppl_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bsppl_dpt_cd, true);
		p.Cnd_bsppl_dpt_cd.setLinkBeans(p.Cnd_bsppl_dpt_nm);
		p.CndPanel.add(p.Cnd_bsppl_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_bsppl_dpt_cd);
		p.Cnd_bsppl_dpt_cd.setNextBeans(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.bsppl_dpt_cd_META);
		p.CndPanel.add(p.Cnd_bsppl_dpt_nm);
		p.Cnd_bsppl_dpt_nm.setNextBeans(p.Cnd_ap_dpt_cd);
		p.Cnd_bsppl_dpt_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.bsppl_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_bsppl_dpt_nm, true);
		p.Cnd_ap_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ap_dpt_cd, true);
		p.Cnd_ap_dpt_cd.setLinkBeans(p.Cnd_ap_dpt_nm);
		p.CndPanel.add(p.Cnd_ap_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_ap_dpt_cd);
		p.Cnd_ap_dpt_cd.setNextBeans(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.ap_dpt_cd_META);
		p.CndPanel.add(p.Cnd_ap_dpt_nm);
		p.Cnd_ap_dpt_nm.setNextBeans(p.Cnd_so_dpt_cd);
		p.Cnd_ap_dpt_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.ap_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_ap_dpt_nm, true);
		p.Cnd_so_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_so_dpt_cd, true);
		p.Cnd_so_dpt_cd.setLinkBeans(p.Cnd_so_dpt_nm);
		p.CndPanel.add(p.Cnd_so_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_so_dpt_cd);
		p.Cnd_so_dpt_cd.setNextBeans(p.Cnd_so_dpt_nm);
		p.Cnd_so_dpt_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.so_dpt_cd_META);
		p.CndPanel.add(p.Cnd_so_dpt_nm);
		p.Cnd_so_dpt_nm.setNextBeans(p.Cnd_psppl_cd);
		p.Cnd_so_dpt_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.so_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_so_dpt_nm, true);
		p.CndPanel.add(p.Cnd_psppl_cd_Label);
		p.CndPanel.add(p.Cnd_psppl_cd);
		p.Cnd_psppl_cd.setNextBeans(p.Cnd_psppl_nm);
		p.Cnd_psppl_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.psppl_cd_META);
		p.Cnd_psppl_cd.addLinkBeans(p.Cnd_psppl_nm);
		p.Cnd_psppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_psppl_cd, true);
		p.CndPanel.add(p.Cnd_psppl_nm);
		p.Cnd_psppl_nm.setNextBeans(p.Cnd_bsppl_cd);
		p.Cnd_psppl_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.psppl_nm_META);
		p.setPluralValueEnable(p.Cnd_psppl_nm, true);
		p.CndPanel.add(p.Cnd_bsppl_cd_Label);
		p.CndPanel.add(p.Cnd_bsppl_cd);
		p.Cnd_bsppl_cd.setNextBeans(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.bsppl_cd_META);
		p.Cnd_bsppl_cd.addLinkBeans(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bsppl_cd, true);
		p.CndPanel.add(p.Cnd_bsppl_nm);
		p.Cnd_bsppl_nm.setNextBeans(p.Cnd_asppl_cd);
		p.Cnd_bsppl_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.bsppl_nm_META);
		p.setPluralValueEnable(p.Cnd_bsppl_nm, true);
		p.CndPanel.add(p.Cnd_asppl_cd_Label);
		p.CndPanel.add(p.Cnd_asppl_cd);
		p.Cnd_asppl_cd.setNextBeans(p.Cnd_asppl_nm);
		p.Cnd_asppl_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.asppl_cd_META);
		p.Cnd_asppl_cd.addLinkBeans(p.Cnd_asppl_nm);
		p.Cnd_asppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_asppl_cd, true);
		p.CndPanel.add(p.Cnd_asppl_nm);
		p.Cnd_asppl_nm.setNextBeans(p.Cnd_setoff_cd);
		p.Cnd_asppl_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.asppl_nm_META);
		p.setPluralValueEnable(p.Cnd_asppl_nm, true);
		p.CndPanel.add(p.Cnd_setoff_cd_Label);
		p.CndPanel.add(p.Cnd_setoff_cd);
		p.Cnd_setoff_cd.setNextBeans(p.Cnd_setoff_nm);
		p.Cnd_setoff_cd.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.setoff_cd_META);
		p.Cnd_setoff_cd.addLinkBeans(p.Cnd_setoff_nm);
		p.Cnd_setoff_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_setoff_cd, true);
		p.CndPanel.add(p.Cnd_setoff_nm);
		p.Cnd_setoff_nm.setRow(p.getCndR(), mcframe.clientMBBB.MBBBP0060.CndR.setoff_nm_META);
		p.setPluralValueEnable(p.Cnd_setoff_nm, true);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MBBBP_AcPaySrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MBBBP_AcPaySrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("CBC");
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
		MBBBP_AcPaySrch_MC.mcInitTop((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.mcInitFold((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.mcInitCnd((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.mcInitCtrl((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.mcInitRslt((MBBBP_AcPaySrch)this);

		// [SRCH]ステータスのモードの設定
		MBBBP_AcPaySrch_MC.statusInitSRCH_Top((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.statusInitSRCH_Fold((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.statusInitSRCH_Cnd((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.statusInitSRCH_Ctrl((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.statusInitSRCH_Rslt((MBBBP_AcPaySrch)this);

		// [REF]ステータスのモードの設定
		MBBBP_AcPaySrch_MC.statusInitREF_Top((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.statusInitREF_Fold((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.statusInitREF_Cnd((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.statusInitREF_Ctrl((MBBBP_AcPaySrch)this);
		MBBBP_AcPaySrch_MC.statusInitREF_Rslt((MBBBP_AcPaySrch)this);

	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MBBBP_AcPaySrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MBBBP_AcPaySrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MBBBP_AcPaySrch p) {
		p.Cnd_ac_ym_fr.setListListener(p);
		p.Cnd_ac_ym_fr.addAllListener(p);
		p.Cnd_ac_ym_to.setListListener(p);
		p.Cnd_ac_ym_to.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_ac_slip_typ.setListListener(p);
		p.Cnd_ac_slip_typ.addAllListener(p);
		p.Cnd_ac_slip_typ_nm.setListListener(p);
		p.Cnd_ac_slip_typ_nm.addAllListener(p);
		p.Cnd_ac_rsn_cd.setListListener(p);
		p.Cnd_ac_rsn_cd.addAllListener(p);
		p.Cnd_ac_rsn_nm.setListListener(p);
		p.Cnd_ac_rsn_nm.addAllListener(p);
		p.Cnd_pay_dpt_cd.setListListener(p);
		p.Cnd_pay_dpt_cd.addAllListener(p);
		p.Cnd_pay_dpt_nm.setListListener(p);
		p.Cnd_pay_dpt_nm.addAllListener(p);
		p.Cnd_bsppl_dpt_cd.setListListener(p);
		p.Cnd_bsppl_dpt_cd.addAllListener(p);
		p.Cnd_bsppl_dpt_nm.setListListener(p);
		p.Cnd_bsppl_dpt_nm.addAllListener(p);
		p.Cnd_ap_dpt_cd.setListListener(p);
		p.Cnd_ap_dpt_cd.addAllListener(p);
		p.Cnd_ap_dpt_nm.setListListener(p);
		p.Cnd_ap_dpt_nm.addAllListener(p);
		p.Cnd_so_dpt_cd.setListListener(p);
		p.Cnd_so_dpt_cd.addAllListener(p);
		p.Cnd_so_dpt_nm.setListListener(p);
		p.Cnd_so_dpt_nm.addAllListener(p);
		p.Cnd_psppl_cd.setListListener(p);
		p.Cnd_psppl_cd.addAllListener(p);
		p.Cnd_psppl_nm.setListListener(p);
		p.Cnd_psppl_nm.addAllListener(p);
		p.Cnd_bsppl_cd.setListListener(p);
		p.Cnd_bsppl_cd.addAllListener(p);
		p.Cnd_bsppl_nm.setListListener(p);
		p.Cnd_bsppl_nm.addAllListener(p);
		p.Cnd_asppl_cd.setListListener(p);
		p.Cnd_asppl_cd.addAllListener(p);
		p.Cnd_asppl_nm.setListListener(p);
		p.Cnd_asppl_nm.addAllListener(p);
		p.Cnd_setoff_cd.setListListener(p);
		p.Cnd_setoff_cd.addAllListener(p);
		p.Cnd_setoff_nm.setListListener(p);
		p.Cnd_setoff_nm.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MBBBP_AcPaySrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MBBBP_AcPaySrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_data_no.addAllListener(p);
		p.columnRslt_data_no.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_ac_ym.addAllListener(p);
		p.columnRslt_ac_ym.setListListener(p);
		p.columnRslt_pay_act_no.addAllListener(p);
		p.columnRslt_pay_act_no.setListListener(p);
		p.columnRslt_pay_act_seq.addAllListener(p);
		p.columnRslt_pay_act_seq.setListListener(p);
		p.columnRslt_pay_act_rev.addAllListener(p);
		p.columnRslt_pay_act_rev.setListListener(p);
		p.columnRslt_pay_act_d_no.addAllListener(p);
		p.columnRslt_pay_act_d_no.setListListener(p);
		p.columnRslt_pay_act_d_seq.addAllListener(p);
		p.columnRslt_pay_act_d_seq.setListListener(p);
		p.columnRslt_ac_dt.addAllListener(p);
		p.columnRslt_ac_dt.setListListener(p);
		p.columnRslt_can_flg.addAllListener(p);
		p.columnRslt_ac_slip_typ.addAllListener(p);
		p.columnRslt_ac_slip_typ.setListListener(p);
		p.columnRslt_ac_slip_typ_nm.addAllListener(p);
		p.columnRslt_ac_slip_typ_nm.setListListener(p);
		p.columnRslt_ac_rsn_cd.addAllListener(p);
		p.columnRslt_ac_rsn_cd.setListListener(p);
		p.columnRslt_ac_rsn_nm.addAllListener(p);
		p.columnRslt_ac_rsn_nm.setListListener(p);
		p.columnRslt_pay_dpt_cd.addAllListener(p);
		p.columnRslt_pay_dpt_cd.setListListener(p);
		p.columnRslt_pay_dpt_nm.addAllListener(p);
		p.columnRslt_pay_dpt_nm.setListListener(p);
		p.columnRslt_bsppl_dpt_cd.addAllListener(p);
		p.columnRslt_bsppl_dpt_cd.setListListener(p);
		p.columnRslt_bsppl_dpt_nm.addAllListener(p);
		p.columnRslt_bsppl_dpt_nm.setListListener(p);
		p.columnRslt_ap_dpt_cd.addAllListener(p);
		p.columnRslt_ap_dpt_cd.setListListener(p);
		p.columnRslt_ap_dpt_nm.addAllListener(p);
		p.columnRslt_ap_dpt_nm.setListListener(p);
		p.columnRslt_so_dpt_cd.addAllListener(p);
		p.columnRslt_so_dpt_cd.setListListener(p);
		p.columnRslt_so_dpt_nm.addAllListener(p);
		p.columnRslt_so_dpt_nm.setListListener(p);
		p.columnRslt_sub_dpt_cd1.addAllListener(p);
		p.columnRslt_sub_dpt_cd1.setListListener(p);
		p.columnRslt_sub_dpt_nm1.addAllListener(p);
		p.columnRslt_sub_dpt_nm1.setListListener(p);
		p.columnRslt_sub_dpt_cd2.addAllListener(p);
		p.columnRslt_sub_dpt_cd2.setListListener(p);
		p.columnRslt_sub_dpt_nm2.addAllListener(p);
		p.columnRslt_sub_dpt_nm2.setListListener(p);
		p.columnRslt_sub_dpt_cd3.addAllListener(p);
		p.columnRslt_sub_dpt_cd3.setListListener(p);
		p.columnRslt_sub_dpt_nm3.addAllListener(p);
		p.columnRslt_sub_dpt_nm3.setListListener(p);
		p.columnRslt_psppl_cd.addAllListener(p);
		p.columnRslt_psppl_cd.setListListener(p);
		p.columnRslt_psppl_nm.addAllListener(p);
		p.columnRslt_psppl_nm.setListListener(p);
		p.columnRslt_bsppl_cd.addAllListener(p);
		p.columnRslt_bsppl_cd.setListListener(p);
		p.columnRslt_bsppl_nm.addAllListener(p);
		p.columnRslt_bsppl_nm.setListListener(p);
		p.columnRslt_asppl_cd.addAllListener(p);
		p.columnRslt_asppl_cd.setListListener(p);
		p.columnRslt_asppl_nm.addAllListener(p);
		p.columnRslt_asppl_nm.setListListener(p);
		p.columnRslt_setoff_cd.addAllListener(p);
		p.columnRslt_setoff_cd.setListListener(p);
		p.columnRslt_mst_setoff_nm.addAllListener(p);
		p.columnRslt_mst_setoff_nm.setListListener(p);
		p.columnRslt_setoff_nm.addAllListener(p);
		p.columnRslt_setoff_nm.setListListener(p);
		p.columnRslt_foreign_flg.addAllListener(p);
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_base_cur_nm.addAllListener(p);
		p.columnRslt_base_cur_nm.setListListener(p);
		p.columnRslt_base_cur_amt.addAllListener(p);
		p.columnRslt_base_cur_amt.setListListener(p);
		p.columnRslt_base_cur_tax_amt.addAllListener(p);
		p.columnRslt_base_cur_tax_amt.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_trd_cur_amt.addAllListener(p);
		p.columnRslt_trd_cur_amt.setListListener(p);
		p.columnRslt_trd_cur_tax_amt.addAllListener(p);
		p.columnRslt_trd_cur_tax_amt.setListListener(p);
		p.columnRslt_tax_cd.addAllListener(p);
		p.columnRslt_tax_cd.setListListener(p);
		p.columnRslt_tax_nm.addAllListener(p);
		p.columnRslt_tax_nm.setListListener(p);
		p.columnRslt_xrate_cd.addAllListener(p);
		p.columnRslt_xrate_cd.setListListener(p);
		p.columnRslt_xrate_nm.addAllListener(p);
		p.columnRslt_xrate_nm.setListListener(p);
		p.columnRslt_xrate.addAllListener(p);
		p.columnRslt_xrate.setListListener(p);
		p.columnRslt_rcv_bill_no.addAllListener(p);
		p.columnRslt_rcv_bill_no.setListListener(p);
		p.columnRslt_pay_chk_no.addAllListener(p);
		p.columnRslt_pay_chk_no.setListListener(p);
		p.columnRslt_usr_cd.addAllListener(p);
		p.columnRslt_usr_cd.setListListener(p);
		p.columnRslt_usr_nm.addAllListener(p);
		p.columnRslt_usr_nm.setListListener(p);
		p.columnRslt_iv_no.addAllListener(p);
		p.columnRslt_iv_no.setListListener(p);
		p.columnRslt_wrk_no.addAllListener(p);
		p.columnRslt_wrk_no.setListListener(p);
		p.columnRslt_bank_ac_cd.addAllListener(p);
		p.columnRslt_bank_ac_cd.setListListener(p);
		p.columnRslt_bank_ac_nm.addAllListener(p);
		p.columnRslt_bank_ac_nm.setListListener(p);
		p.columnRslt_pay_bank_ac_cd.addAllListener(p);
		p.columnRslt_pay_bank_ac_cd.setListListener(p);
		p.columnRslt_pay_bank_ac_nm.addAllListener(p);
		p.columnRslt_pay_bank_ac_nm.setListListener(p);
		p.columnRslt_note_no.addAllListener(p);
		p.columnRslt_note_no.setListListener(p);
		p.columnRslt_jnl_key1.addAllListener(p);
		p.columnRslt_jnl_key1.setListListener(p);
		p.columnRslt_jnl_key2.addAllListener(p);
		p.columnRslt_jnl_key2.setListListener(p);
		p.columnRslt_jnl_key3.addAllListener(p);
		p.columnRslt_jnl_key3.setListListener(p);
		p.columnRslt_jnl_key4.addAllListener(p);
		p.columnRslt_jnl_key4.setListListener(p);
		p.columnRslt_jnl_key5.addAllListener(p);
		p.columnRslt_jnl_key5.setListListener(p);
		p.columnRslt_jnl_key6.addAllListener(p);
		p.columnRslt_jnl_key6.setListListener(p);
		p.columnRslt_jnl_key7.addAllListener(p);
		p.columnRslt_jnl_key7.setListListener(p);
		p.columnRslt_jnl_key8.addAllListener(p);
		p.columnRslt_jnl_key8.setListListener(p);
		p.columnRslt_jnl_key9.addAllListener(p);
		p.columnRslt_jnl_key9.setListListener(p);
		p.columnRslt_jnl_key10.addAllListener(p);
		p.columnRslt_jnl_key10.setListListener(p);
		p.columnRslt_trd_rmrks.addAllListener(p);
		p.columnRslt_trd_rmrks.setListListener(p);
		p.columnRslt_trd_d_rmrks.addAllListener(p);
		p.columnRslt_trd_d_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_sub_char4.addAllListener(p);
		p.columnRslt_sub_char4.setListListener(p);
		p.columnRslt_sub_char5.addAllListener(p);
		p.columnRslt_sub_char5.setListListener(p);
		p.columnRslt_sub_char6.addAllListener(p);
		p.columnRslt_sub_char6.setListListener(p);
		p.columnRslt_sub_char7.addAllListener(p);
		p.columnRslt_sub_char7.setListListener(p);
		p.columnRslt_sub_char8.addAllListener(p);
		p.columnRslt_sub_char8.setListListener(p);
		p.columnRslt_sub_char9.addAllListener(p);
		p.columnRslt_sub_char9.setListListener(p);
		p.columnRslt_sub_char10.addAllListener(p);
		p.columnRslt_sub_char10.setListListener(p);
		p.columnRslt_sub_num1.addAllListener(p);
		p.columnRslt_sub_num1.setListListener(p);
		p.columnRslt_sub_num2.addAllListener(p);
		p.columnRslt_sub_num2.setListListener(p);
		p.columnRslt_sub_num3.addAllListener(p);
		p.columnRslt_sub_num3.setListListener(p);
		p.columnRslt_sub_dt1.addAllListener(p);
		p.columnRslt_sub_dt1.setListListener(p);
		p.columnRslt_sub_dt2.addAllListener(p);
		p.columnRslt_sub_dt2.setListListener(p);
		p.columnRslt_sub_dt3.addAllListener(p);
		p.columnRslt_sub_dt3.setListListener(p);
		p.columnRslt_jnl_fin_cnt.addAllListener(p);
		p.columnRslt_jnl_fin_cnt.setListListener(p);
		p.columnRslt_ins_usr_id.addAllListener(p);
		p.columnRslt_ins_usr_id.setListListener(p);
		p.columnRslt_ins_usr_nm.addAllListener(p);
		p.columnRslt_ins_usr_nm.setListListener(p);
		p.columnRslt_ins_ts.addAllListener(p);
		p.columnRslt_ins_ts.setListListener(p);
		p.columnRslt_ins_func_id.addAllListener(p);
		p.columnRslt_ins_func_id.setListListener(p);
		p.columnRslt_ins_func_nm.addAllListener(p);
		p.columnRslt_ins_func_nm.setListListener(p);
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
		p.columnRslt_upd_usr_id.addAllListener(p);
		p.columnRslt_upd_usr_id.setListListener(p);
		p.columnRslt_upd_usr_nm.addAllListener(p);
		p.columnRslt_upd_usr_nm.setListListener(p);
		p.columnRslt_upd_ts.addAllListener(p);
		p.columnRslt_upd_ts.setListListener(p);
		p.columnRslt_upd_func_id.addAllListener(p);
		p.columnRslt_upd_func_id.setListListener(p);
		p.columnRslt_upd_func_nm.addAllListener(p);
		p.columnRslt_upd_func_nm.setListListener(p);
		p.columnRslt_upd_srv_req_no.addAllListener(p);
		p.columnRslt_upd_srv_req_no.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MBBBP_AcPaySrch p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MBBBP_AcPaySrch p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MBBBP_AcPaySrch p){
		p.Cnd_ac_ym_fr.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_slip_typ.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_slip_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_ac_rsn_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ac_rsn_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pay_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_pay_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_so_dpt_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_so_dpt_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_psppl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asppl_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_asppl_nm.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_setoff_cd.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_setoff_nm.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MBBBP_AcPaySrch p){

	}

	/**
	 * [SRCH]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Rslt(MBBBP_AcPaySrch p){
		p.columnRslt_data_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_act_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_act_d_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ac_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_cd1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_nm1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_cd2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_nm2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_cd3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_nm3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_psppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_setoff_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_mst_setoff_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_setoff_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_foreign_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_base_cur_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_tax_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_xrate_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_rcv_bill_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_wrk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_key1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_key2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_key3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_key4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_key5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_key6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_key7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_key8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_key9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_key10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char6.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char7.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char8.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char9.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_char10.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_num1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_num2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_num3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dt1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dt2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_sub_dt3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_jnl_fin_cnt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MBBBP_AcPaySrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MBBBP_AcPaySrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MBBBP_AcPaySrch p){
		p.Cnd_ac_ym_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_ym_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_slip_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_slip_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_ac_rsn_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_rsn_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_pay_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_pay_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bsppl_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ap_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ap_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_so_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_so_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_psppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_psppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bsppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_bsppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_asppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_setoff_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_setoff_nm.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MBBBP_AcPaySrch p){

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MBBBP_AcPaySrch p){
		p.columnRslt_data_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_act_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_act_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_act_d_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_slip_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ac_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bsppl_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ap_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_so_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dpt_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_psppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_psppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bsppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bsppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_asppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_asppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_setoff_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mst_setoff_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_setoff_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_foreign_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_cur_tax_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_tax_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_tax_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_xrate_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_xrate_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_xrate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rcv_bill_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_chk_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wrk_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_pay_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_note_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_key1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_key2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_key3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_key4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_key5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_key6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_key7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_key8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_key9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_key10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_trd_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_num1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_num2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_num3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dt1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dt2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_dt3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_jnl_fin_cnt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

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
		MBBBP_AcPaySrch_MC.setTableConfigRslt((MBBBP_AcPaySrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MBBBP_AcPaySrch p) {
		p.columnRslt_data_no.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.data_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_data_no);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_ac_ym.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.ac_ym_META);
		p.columnRslt_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_ym);
		p.columnRslt_pay_act_no.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.pay_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_act_no);
		p.columnRslt_pay_act_seq.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.pay_act_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_act_seq);
		p.columnRslt_pay_act_rev.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.pay_act_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_act_rev);
		p.columnRslt_pay_act_d_no.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.pay_act_d_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_act_d_no);
		p.columnRslt_pay_act_d_seq.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.pay_act_d_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_act_d_seq);
		p.columnRslt_ac_dt.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.ac_dt_META);
		p.columnRslt_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_dt);
		p.columnRslt_can_flg.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.can_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_can_flg);
		p.columnRslt_ac_slip_typ.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.ac_slip_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_slip_typ);
		p.columnRslt_ac_slip_typ_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.ac_slip_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_slip_typ_nm);
		p.columnRslt_ac_rsn_cd.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.ac_rsn_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_rsn_cd);
		p.columnRslt_ac_rsn_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.ac_rsn_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_rsn_nm);
		p.columnRslt_pay_dpt_cd.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.pay_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_dpt_cd);
		p.columnRslt_pay_dpt_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.pay_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_dpt_nm);
		p.columnRslt_bsppl_dpt_cd.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.bsppl_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_dpt_cd);
		p.columnRslt_bsppl_dpt_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.bsppl_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_dpt_nm);
		p.columnRslt_ap_dpt_cd.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.ap_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_dpt_cd);
		p.columnRslt_ap_dpt_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.ap_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ap_dpt_nm);
		p.columnRslt_so_dpt_cd.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.so_dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_so_dpt_cd);
		p.columnRslt_so_dpt_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.so_dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_so_dpt_nm);
		p.columnRslt_sub_dpt_cd1.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_dpt_cd1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dpt_cd1);
		p.columnRslt_sub_dpt_nm1.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_dpt_nm1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dpt_nm1);
		p.columnRslt_sub_dpt_cd2.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_dpt_cd2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dpt_cd2);
		p.columnRslt_sub_dpt_nm2.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_dpt_nm2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dpt_nm2);
		p.columnRslt_sub_dpt_cd3.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_dpt_cd3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dpt_cd3);
		p.columnRslt_sub_dpt_nm3.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_dpt_nm3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dpt_nm3);
		p.columnRslt_psppl_cd.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.psppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_psppl_cd);
		p.columnRslt_psppl_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.psppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_psppl_nm);
		p.columnRslt_bsppl_cd.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.bsppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_cd);
		p.columnRslt_bsppl_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.bsppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bsppl_nm);
		p.columnRslt_asppl_cd.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.asppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asppl_cd);
		p.columnRslt_asppl_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.asppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asppl_nm);
		p.columnRslt_setoff_cd.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.setoff_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_setoff_cd);
		p.columnRslt_mst_setoff_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.mst_setoff_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mst_setoff_nm);
		p.columnRslt_setoff_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.setoff_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_setoff_nm);
		p.columnRslt_foreign_flg.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.foreign_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_foreign_flg);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.base_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_nm);
		p.columnRslt_base_cur_amt.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.base_cur_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_amt);
		p.columnRslt_base_cur_tax_amt.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.base_cur_tax_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_tax_amt);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_trd_cur_amt.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.trd_cur_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_amt);
		p.columnRslt_trd_cur_tax_amt.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.trd_cur_tax_amt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_tax_amt);
		p.columnRslt_tax_cd.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.tax_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_cd);
		p.columnRslt_tax_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.tax_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_nm);
		p.columnRslt_xrate_cd.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.xrate_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_cd);
		p.columnRslt_xrate_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.xrate_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate_nm);
		p.columnRslt_xrate.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate);
		p.columnRslt_rcv_bill_no.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.rcv_bill_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rcv_bill_no);
		p.columnRslt_pay_chk_no.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.pay_chk_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_chk_no);
		p.columnRslt_usr_cd.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_cd);
		p.columnRslt_usr_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_nm);
		p.columnRslt_iv_no.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.iv_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_iv_no);
		p.columnRslt_wrk_no.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.wrk_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wrk_no);
		p.columnRslt_bank_ac_cd.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.bank_ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_cd);
		p.columnRslt_bank_ac_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.bank_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bank_ac_nm);
		p.columnRslt_pay_bank_ac_cd.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.pay_bank_ac_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_bank_ac_cd);
		p.columnRslt_pay_bank_ac_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.pay_bank_ac_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pay_bank_ac_nm);
		p.columnRslt_note_no.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.note_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_note_no);
		p.columnRslt_jnl_key1.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.jnl_key1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_key1);
		p.columnRslt_jnl_key2.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.jnl_key2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_key2);
		p.columnRslt_jnl_key3.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.jnl_key3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_key3);
		p.columnRslt_jnl_key4.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.jnl_key4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_key4);
		p.columnRslt_jnl_key5.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.jnl_key5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_key5);
		p.columnRslt_jnl_key6.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.jnl_key6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_key6);
		p.columnRslt_jnl_key7.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.jnl_key7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_key7);
		p.columnRslt_jnl_key8.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.jnl_key8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_key8);
		p.columnRslt_jnl_key9.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.jnl_key9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_key9);
		p.columnRslt_jnl_key10.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.jnl_key10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_key10);
		p.columnRslt_trd_rmrks.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.trd_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_rmrks);
		p.columnRslt_trd_d_rmrks.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.trd_d_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_d_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_sub_char4.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_char4_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char4);
		p.columnRslt_sub_char5.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_char5_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char5);
		p.columnRslt_sub_char6.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_char6_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char6);
		p.columnRslt_sub_char7.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_char7_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char7);
		p.columnRslt_sub_char8.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_char8_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char8);
		p.columnRslt_sub_char9.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_char9_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char9);
		p.columnRslt_sub_char10.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_char10_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char10);
		p.columnRslt_sub_num1.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_num1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_num1);
		p.columnRslt_sub_num2.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_num2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_num2);
		p.columnRslt_sub_num3.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_num3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_num3);
		p.columnRslt_sub_dt1.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_dt1_META);
		p.columnRslt_sub_dt1.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dt1);
		p.columnRslt_sub_dt2.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_dt2_META);
		p.columnRslt_sub_dt2.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dt2);
		p.columnRslt_sub_dt3.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.sub_dt3_META);
		p.columnRslt_sub_dt3.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_dt3);
		p.columnRslt_jnl_fin_cnt.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.jnl_fin_cnt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_jnl_fin_cnt);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMBBB.MBBBP0060.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_ac_slip_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_slip_typ.getListConfig().setPutter(getCnd_ac_slip_typ_ListPutter());
		Cnd_ac_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_rsn_cd.getListConfig().setPutter(getCnd_ac_rsn_cd_ListPutter());
		Cnd_pay_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_pay_dpt_cd.getListConfig().setPutter(getCnd_pay_dpt_cd_ListPutter());
		Cnd_bsppl_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bsppl_dpt_cd.getListConfig().setPutter(getCnd_bsppl_dpt_cd_ListPutter());
		Cnd_ap_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ap_dpt_cd.getListConfig().setPutter(getCnd_ap_dpt_cd_ListPutter());
		Cnd_so_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_so_dpt_cd.getListConfig().setPutter(getCnd_so_dpt_cd_ListPutter());
		Cnd_psppl_cd.getListConfig().setPutter(getCnd_psppl_cd_ListPutter());
		Cnd_bsppl_cd.getListConfig().setPutter(getCnd_bsppl_cd_ListPutter());
		Cnd_asppl_cd.getListConfig().setPutter(getCnd_asppl_cd_ListPutter());
		Cnd_setoff_cd.getListConfig().setPutter(getCnd_setoff_cd_ListPutter());
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
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Cnd_ac_slip_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ac_slip_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcSlipTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_ac_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ac_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcRsn");
		return lp;
	}
	 
	/**
	 * [Cnd_pay_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pay_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcDpt");
		return lp;
	}
	 
	/**
	 * [Cnd_bsppl_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bsppl_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcDpt");
		return lp;
	}
	 
	/**
	 * [Cnd_ap_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ap_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcDpt");
		return lp;
	}
	 
	/**
	 * [Cnd_so_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_so_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcDpt");
		return lp;
	}
	 
	/**
	 * [Cnd_psppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_psppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_bsppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bsppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_asppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_asppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_setoff_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_setoff_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_ac_slip_typ) return getCnd_ac_slip_typ(row, info);
		if(combo == Cnd_ac_rsn_cd) return getCnd_ac_rsn_cd(row, info);
		if(combo == Cnd_pay_dpt_cd) return getCnd_pay_dpt_cd(row, info);
		if(combo == Cnd_bsppl_dpt_cd) return getCnd_bsppl_dpt_cd(row, info);
		if(combo == Cnd_ap_dpt_cd) return getCnd_ap_dpt_cd(row, info);
		if(combo == Cnd_so_dpt_cd) return getCnd_so_dpt_cd(row, info);
		if(combo == Cnd_psppl_cd) return getCnd_psppl_cd(row, info);
		if(combo == Cnd_bsppl_cd) return getCnd_bsppl_cd(row, info);
		if(combo == Cnd_asppl_cd) return getCnd_asppl_cd(row, info);
		if(combo == Cnd_setoff_cd) return getCnd_setoff_cd(row, info);
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
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

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
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_ac_ym_fr) return doCnd_ac_ym_fr_VC(info);
		if (vc == Cnd_ac_ym_to) return doCnd_ac_ym_to_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_ac_slip_typ) return doCnd_ac_slip_typ_VC(info);
		if (vc == Cnd_ac_slip_typ_nm) return doCnd_ac_slip_typ_nm_VC(info);
		if (vc == Cnd_ac_rsn_cd) return doCnd_ac_rsn_cd_VC(info);
		if (vc == Cnd_ac_rsn_nm) return doCnd_ac_rsn_nm_VC(info);
		if (vc == Cnd_pay_dpt_cd) return doCnd_pay_dpt_cd_VC(info);
		if (vc == Cnd_pay_dpt_nm) return doCnd_pay_dpt_nm_VC(info);
		if (vc == Cnd_bsppl_dpt_cd) return doCnd_bsppl_dpt_cd_VC(info);
		if (vc == Cnd_bsppl_dpt_nm) return doCnd_bsppl_dpt_nm_VC(info);
		if (vc == Cnd_ap_dpt_cd) return doCnd_ap_dpt_cd_VC(info);
		if (vc == Cnd_ap_dpt_nm) return doCnd_ap_dpt_nm_VC(info);
		if (vc == Cnd_so_dpt_cd) return doCnd_so_dpt_cd_VC(info);
		if (vc == Cnd_so_dpt_nm) return doCnd_so_dpt_nm_VC(info);
		if (vc == Cnd_psppl_cd) return doCnd_psppl_cd_VC(info);
		if (vc == Cnd_psppl_nm) return doCnd_psppl_nm_VC(info);
		if (vc == Cnd_bsppl_cd) return doCnd_bsppl_cd_VC(info);
		if (vc == Cnd_bsppl_nm) return doCnd_bsppl_nm_VC(info);
		if (vc == Cnd_asppl_cd) return doCnd_asppl_cd_VC(info);
		if (vc == Cnd_asppl_nm) return doCnd_asppl_nm_VC(info);
		if (vc == Cnd_setoff_cd) return doCnd_setoff_cd_VC(info);
		if (vc == Cnd_setoff_nm) return doCnd_setoff_nm_VC(info);
		if (vc == columnRslt_data_no) return doRslt_data_no_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_ac_ym) return doRslt_ac_ym_VC(info);
		if (vc == columnRslt_pay_act_no) return doRslt_pay_act_no_VC(info);
		if (vc == columnRslt_pay_act_seq) return doRslt_pay_act_seq_VC(info);
		if (vc == columnRslt_pay_act_rev) return doRslt_pay_act_rev_VC(info);
		if (vc == columnRslt_pay_act_d_no) return doRslt_pay_act_d_no_VC(info);
		if (vc == columnRslt_pay_act_d_seq) return doRslt_pay_act_d_seq_VC(info);
		if (vc == columnRslt_ac_dt) return doRslt_ac_dt_VC(info);
		if (vc == columnRslt_can_flg) return doRslt_can_flg_VC(info);
		if (vc == columnRslt_ac_slip_typ) return doRslt_ac_slip_typ_VC(info);
		if (vc == columnRslt_ac_slip_typ_nm) return doRslt_ac_slip_typ_nm_VC(info);
		if (vc == columnRslt_ac_rsn_cd) return doRslt_ac_rsn_cd_VC(info);
		if (vc == columnRslt_ac_rsn_nm) return doRslt_ac_rsn_nm_VC(info);
		if (vc == columnRslt_pay_dpt_cd) return doRslt_pay_dpt_cd_VC(info);
		if (vc == columnRslt_pay_dpt_nm) return doRslt_pay_dpt_nm_VC(info);
		if (vc == columnRslt_bsppl_dpt_cd) return doRslt_bsppl_dpt_cd_VC(info);
		if (vc == columnRslt_bsppl_dpt_nm) return doRslt_bsppl_dpt_nm_VC(info);
		if (vc == columnRslt_ap_dpt_cd) return doRslt_ap_dpt_cd_VC(info);
		if (vc == columnRslt_ap_dpt_nm) return doRslt_ap_dpt_nm_VC(info);
		if (vc == columnRslt_so_dpt_cd) return doRslt_so_dpt_cd_VC(info);
		if (vc == columnRslt_so_dpt_nm) return doRslt_so_dpt_nm_VC(info);
		if (vc == columnRslt_sub_dpt_cd1) return doRslt_sub_dpt_cd1_VC(info);
		if (vc == columnRslt_sub_dpt_nm1) return doRslt_sub_dpt_nm1_VC(info);
		if (vc == columnRslt_sub_dpt_cd2) return doRslt_sub_dpt_cd2_VC(info);
		if (vc == columnRslt_sub_dpt_nm2) return doRslt_sub_dpt_nm2_VC(info);
		if (vc == columnRslt_sub_dpt_cd3) return doRslt_sub_dpt_cd3_VC(info);
		if (vc == columnRslt_sub_dpt_nm3) return doRslt_sub_dpt_nm3_VC(info);
		if (vc == columnRslt_psppl_cd) return doRslt_psppl_cd_VC(info);
		if (vc == columnRslt_psppl_nm) return doRslt_psppl_nm_VC(info);
		if (vc == columnRslt_bsppl_cd) return doRslt_bsppl_cd_VC(info);
		if (vc == columnRslt_bsppl_nm) return doRslt_bsppl_nm_VC(info);
		if (vc == columnRslt_asppl_cd) return doRslt_asppl_cd_VC(info);
		if (vc == columnRslt_asppl_nm) return doRslt_asppl_nm_VC(info);
		if (vc == columnRslt_setoff_cd) return doRslt_setoff_cd_VC(info);
		if (vc == columnRslt_mst_setoff_nm) return doRslt_mst_setoff_nm_VC(info);
		if (vc == columnRslt_setoff_nm) return doRslt_setoff_nm_VC(info);
		if (vc == columnRslt_foreign_flg) return doRslt_foreign_flg_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_nm) return doRslt_base_cur_nm_VC(info);
		if (vc == columnRslt_base_cur_amt) return doRslt_base_cur_amt_VC(info);
		if (vc == columnRslt_base_cur_tax_amt) return doRslt_base_cur_tax_amt_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_trd_cur_amt) return doRslt_trd_cur_amt_VC(info);
		if (vc == columnRslt_trd_cur_tax_amt) return doRslt_trd_cur_tax_amt_VC(info);
		if (vc == columnRslt_tax_cd) return doRslt_tax_cd_VC(info);
		if (vc == columnRslt_tax_nm) return doRslt_tax_nm_VC(info);
		if (vc == columnRslt_xrate_cd) return doRslt_xrate_cd_VC(info);
		if (vc == columnRslt_xrate_nm) return doRslt_xrate_nm_VC(info);
		if (vc == columnRslt_xrate) return doRslt_xrate_VC(info);
		if (vc == columnRslt_rcv_bill_no) return doRslt_rcv_bill_no_VC(info);
		if (vc == columnRslt_pay_chk_no) return doRslt_pay_chk_no_VC(info);
		if (vc == columnRslt_usr_cd) return doRslt_usr_cd_VC(info);
		if (vc == columnRslt_usr_nm) return doRslt_usr_nm_VC(info);
		if (vc == columnRslt_iv_no) return doRslt_iv_no_VC(info);
		if (vc == columnRslt_wrk_no) return doRslt_wrk_no_VC(info);
		if (vc == columnRslt_bank_ac_cd) return doRslt_bank_ac_cd_VC(info);
		if (vc == columnRslt_bank_ac_nm) return doRslt_bank_ac_nm_VC(info);
		if (vc == columnRslt_pay_bank_ac_cd) return doRslt_pay_bank_ac_cd_VC(info);
		if (vc == columnRslt_pay_bank_ac_nm) return doRslt_pay_bank_ac_nm_VC(info);
		if (vc == columnRslt_note_no) return doRslt_note_no_VC(info);
		if (vc == columnRslt_jnl_key1) return doRslt_jnl_key1_VC(info);
		if (vc == columnRslt_jnl_key2) return doRslt_jnl_key2_VC(info);
		if (vc == columnRslt_jnl_key3) return doRslt_jnl_key3_VC(info);
		if (vc == columnRslt_jnl_key4) return doRslt_jnl_key4_VC(info);
		if (vc == columnRslt_jnl_key5) return doRslt_jnl_key5_VC(info);
		if (vc == columnRslt_jnl_key6) return doRslt_jnl_key6_VC(info);
		if (vc == columnRslt_jnl_key7) return doRslt_jnl_key7_VC(info);
		if (vc == columnRslt_jnl_key8) return doRslt_jnl_key8_VC(info);
		if (vc == columnRslt_jnl_key9) return doRslt_jnl_key9_VC(info);
		if (vc == columnRslt_jnl_key10) return doRslt_jnl_key10_VC(info);
		if (vc == columnRslt_trd_rmrks) return doRslt_trd_rmrks_VC(info);
		if (vc == columnRslt_trd_d_rmrks) return doRslt_trd_d_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_sub_char4) return doRslt_sub_char4_VC(info);
		if (vc == columnRslt_sub_char5) return doRslt_sub_char5_VC(info);
		if (vc == columnRslt_sub_char6) return doRslt_sub_char6_VC(info);
		if (vc == columnRslt_sub_char7) return doRslt_sub_char7_VC(info);
		if (vc == columnRslt_sub_char8) return doRslt_sub_char8_VC(info);
		if (vc == columnRslt_sub_char9) return doRslt_sub_char9_VC(info);
		if (vc == columnRslt_sub_char10) return doRslt_sub_char10_VC(info);
		if (vc == columnRslt_sub_num1) return doRslt_sub_num1_VC(info);
		if (vc == columnRslt_sub_num2) return doRslt_sub_num2_VC(info);
		if (vc == columnRslt_sub_num3) return doRslt_sub_num3_VC(info);
		if (vc == columnRslt_sub_dt1) return doRslt_sub_dt1_VC(info);
		if (vc == columnRslt_sub_dt2) return doRslt_sub_dt2_VC(info);
		if (vc == columnRslt_sub_dt3) return doRslt_sub_dt3_VC(info);
		if (vc == columnRslt_jnl_fin_cnt) return doRslt_jnl_fin_cnt_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
		return true;
	}

	/**
	 * [Rslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_ym_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_ym_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_slip_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_rsn_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[so_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_so_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[so_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_so_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[psppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_psppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[psppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_psppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_asppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[setoff_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_setoff_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[setoff_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_setoff_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[data_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_data_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_act_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_act_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_act_d_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_act_d_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_slip_typ_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ap_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ap_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[so_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_so_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[so_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_so_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dpt_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dpt_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dpt_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dpt_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dpt_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dpt_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[psppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_psppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[psppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_psppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[setoff_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_setoff_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mst_setoff_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mst_setoff_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[setoff_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_setoff_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_foreign_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_tax_amt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_tax_amt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xrate_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rcv_bill_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rcv_bill_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_chk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wrk_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wrk_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bank_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bank_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pay_bank_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[note_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_note_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_num1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_num1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_num2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_num2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_num3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_num3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dt1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dt1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dt2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dt2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_dt3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_dt3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[jnl_fin_cnt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_jnl_fin_cnt_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_ts_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_cntr_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_ts_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_srv_req_no_VC(MCEventInfo info){
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
		if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NC(info);
		else if (nc == Cnd_ac_ym_to) doCnd_ac_ym_to_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_ac_slip_typ) doCnd_ac_slip_typ_NC(info);
		else if (nc == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_NC(info);
		else if (nc == Cnd_ac_rsn_cd) doCnd_ac_rsn_cd_NC(info);
		else if (nc == Cnd_ac_rsn_nm) doCnd_ac_rsn_nm_NC(info);
		else if (nc == Cnd_pay_dpt_cd) doCnd_pay_dpt_cd_NC(info);
		else if (nc == Cnd_pay_dpt_nm) doCnd_pay_dpt_nm_NC(info);
		else if (nc == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NC(info);
		else if (nc == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NC(info);
		else if (nc == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NC(info);
		else if (nc == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NC(info);
		else if (nc == Cnd_so_dpt_cd) doCnd_so_dpt_cd_NC(info);
		else if (nc == Cnd_so_dpt_nm) doCnd_so_dpt_nm_NC(info);
		else if (nc == Cnd_psppl_cd) doCnd_psppl_cd_NC(info);
		else if (nc == Cnd_psppl_nm) doCnd_psppl_nm_NC(info);
		else if (nc == Cnd_bsppl_cd) doCnd_bsppl_cd_NC(info);
		else if (nc == Cnd_bsppl_nm) doCnd_bsppl_nm_NC(info);
		else if (nc == Cnd_asppl_cd) doCnd_asppl_cd_NC(info);
		else if (nc == Cnd_asppl_nm) doCnd_asppl_nm_NC(info);
		else if (nc == Cnd_setoff_cd) doCnd_setoff_cd_NC(info);
		else if (nc == Cnd_setoff_nm) doCnd_setoff_nm_NC(info);
		else if (nc == columnRslt_data_no) doRslt_data_no_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_ac_ym) doRslt_ac_ym_NC(info);
		else if (nc == columnRslt_pay_act_no) doRslt_pay_act_no_NC(info);
		else if (nc == columnRslt_pay_act_seq) doRslt_pay_act_seq_NC(info);
		else if (nc == columnRslt_pay_act_rev) doRslt_pay_act_rev_NC(info);
		else if (nc == columnRslt_pay_act_d_no) doRslt_pay_act_d_no_NC(info);
		else if (nc == columnRslt_pay_act_d_seq) doRslt_pay_act_d_seq_NC(info);
		else if (nc == columnRslt_ac_dt) doRslt_ac_dt_NC(info);
		else if (nc == columnRslt_can_flg) doRslt_can_flg_NC(info);
		else if (nc == columnRslt_ac_slip_typ) doRslt_ac_slip_typ_NC(info);
		else if (nc == columnRslt_ac_slip_typ_nm) doRslt_ac_slip_typ_nm_NC(info);
		else if (nc == columnRslt_ac_rsn_cd) doRslt_ac_rsn_cd_NC(info);
		else if (nc == columnRslt_ac_rsn_nm) doRslt_ac_rsn_nm_NC(info);
		else if (nc == columnRslt_pay_dpt_cd) doRslt_pay_dpt_cd_NC(info);
		else if (nc == columnRslt_pay_dpt_nm) doRslt_pay_dpt_nm_NC(info);
		else if (nc == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_NC(info);
		else if (nc == columnRslt_bsppl_dpt_nm) doRslt_bsppl_dpt_nm_NC(info);
		else if (nc == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NC(info);
		else if (nc == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NC(info);
		else if (nc == columnRslt_so_dpt_cd) doRslt_so_dpt_cd_NC(info);
		else if (nc == columnRslt_so_dpt_nm) doRslt_so_dpt_nm_NC(info);
		else if (nc == columnRslt_sub_dpt_cd1) doRslt_sub_dpt_cd1_NC(info);
		else if (nc == columnRslt_sub_dpt_nm1) doRslt_sub_dpt_nm1_NC(info);
		else if (nc == columnRslt_sub_dpt_cd2) doRslt_sub_dpt_cd2_NC(info);
		else if (nc == columnRslt_sub_dpt_nm2) doRslt_sub_dpt_nm2_NC(info);
		else if (nc == columnRslt_sub_dpt_cd3) doRslt_sub_dpt_cd3_NC(info);
		else if (nc == columnRslt_sub_dpt_nm3) doRslt_sub_dpt_nm3_NC(info);
		else if (nc == columnRslt_psppl_cd) doRslt_psppl_cd_NC(info);
		else if (nc == columnRslt_psppl_nm) doRslt_psppl_nm_NC(info);
		else if (nc == columnRslt_bsppl_cd) doRslt_bsppl_cd_NC(info);
		else if (nc == columnRslt_bsppl_nm) doRslt_bsppl_nm_NC(info);
		else if (nc == columnRslt_asppl_cd) doRslt_asppl_cd_NC(info);
		else if (nc == columnRslt_asppl_nm) doRslt_asppl_nm_NC(info);
		else if (nc == columnRslt_setoff_cd) doRslt_setoff_cd_NC(info);
		else if (nc == columnRslt_mst_setoff_nm) doRslt_mst_setoff_nm_NC(info);
		else if (nc == columnRslt_setoff_nm) doRslt_setoff_nm_NC(info);
		else if (nc == columnRslt_foreign_flg) doRslt_foreign_flg_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_nm) doRslt_base_cur_nm_NC(info);
		else if (nc == columnRslt_base_cur_amt) doRslt_base_cur_amt_NC(info);
		else if (nc == columnRslt_base_cur_tax_amt) doRslt_base_cur_tax_amt_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_trd_cur_amt) doRslt_trd_cur_amt_NC(info);
		else if (nc == columnRslt_trd_cur_tax_amt) doRslt_trd_cur_tax_amt_NC(info);
		else if (nc == columnRslt_tax_cd) doRslt_tax_cd_NC(info);
		else if (nc == columnRslt_tax_nm) doRslt_tax_nm_NC(info);
		else if (nc == columnRslt_xrate_cd) doRslt_xrate_cd_NC(info);
		else if (nc == columnRslt_xrate_nm) doRslt_xrate_nm_NC(info);
		else if (nc == columnRslt_xrate) doRslt_xrate_NC(info);
		else if (nc == columnRslt_rcv_bill_no) doRslt_rcv_bill_no_NC(info);
		else if (nc == columnRslt_pay_chk_no) doRslt_pay_chk_no_NC(info);
		else if (nc == columnRslt_usr_cd) doRslt_usr_cd_NC(info);
		else if (nc == columnRslt_usr_nm) doRslt_usr_nm_NC(info);
		else if (nc == columnRslt_iv_no) doRslt_iv_no_NC(info);
		else if (nc == columnRslt_wrk_no) doRslt_wrk_no_NC(info);
		else if (nc == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NC(info);
		else if (nc == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NC(info);
		else if (nc == columnRslt_pay_bank_ac_cd) doRslt_pay_bank_ac_cd_NC(info);
		else if (nc == columnRslt_pay_bank_ac_nm) doRslt_pay_bank_ac_nm_NC(info);
		else if (nc == columnRslt_note_no) doRslt_note_no_NC(info);
		else if (nc == columnRslt_jnl_key1) doRslt_jnl_key1_NC(info);
		else if (nc == columnRslt_jnl_key2) doRslt_jnl_key2_NC(info);
		else if (nc == columnRslt_jnl_key3) doRslt_jnl_key3_NC(info);
		else if (nc == columnRslt_jnl_key4) doRslt_jnl_key4_NC(info);
		else if (nc == columnRslt_jnl_key5) doRslt_jnl_key5_NC(info);
		else if (nc == columnRslt_jnl_key6) doRslt_jnl_key6_NC(info);
		else if (nc == columnRslt_jnl_key7) doRslt_jnl_key7_NC(info);
		else if (nc == columnRslt_jnl_key8) doRslt_jnl_key8_NC(info);
		else if (nc == columnRslt_jnl_key9) doRslt_jnl_key9_NC(info);
		else if (nc == columnRslt_jnl_key10) doRslt_jnl_key10_NC(info);
		else if (nc == columnRslt_trd_rmrks) doRslt_trd_rmrks_NC(info);
		else if (nc == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_sub_char4) doRslt_sub_char4_NC(info);
		else if (nc == columnRslt_sub_char5) doRslt_sub_char5_NC(info);
		else if (nc == columnRslt_sub_char6) doRslt_sub_char6_NC(info);
		else if (nc == columnRslt_sub_char7) doRslt_sub_char7_NC(info);
		else if (nc == columnRslt_sub_char8) doRslt_sub_char8_NC(info);
		else if (nc == columnRslt_sub_char9) doRslt_sub_char9_NC(info);
		else if (nc == columnRslt_sub_char10) doRslt_sub_char10_NC(info);
		else if (nc == columnRslt_sub_num1) doRslt_sub_num1_NC(info);
		else if (nc == columnRslt_sub_num2) doRslt_sub_num2_NC(info);
		else if (nc == columnRslt_sub_num3) doRslt_sub_num3_NC(info);
		else if (nc == columnRslt_sub_dt1) doRslt_sub_dt1_NC(info);
		else if (nc == columnRslt_sub_dt2) doRslt_sub_dt2_NC(info);
		else if (nc == columnRslt_sub_dt3) doRslt_sub_dt3_NC(info);
		else if (nc == columnRslt_jnl_fin_cnt) doRslt_jnl_fin_cnt_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[so_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_so_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[so_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_so_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[setoff_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_setoff_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[setoff_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_setoff_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_d_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_d_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[so_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_so_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[so_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_so_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[setoff_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_setoff_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mst_setoff_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mst_setoff_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[setoff_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_setoff_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_tax_amt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_tax_amt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_bill_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_bill_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char4_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char5_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char6_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char7_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char8_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char9_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char10_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_fin_cnt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_fin_cnt_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NE(info);
		else if (ne == Cnd_ac_ym_to) doCnd_ac_ym_to_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_ac_slip_typ) doCnd_ac_slip_typ_NE(info);
		else if (ne == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_NE(info);
		else if (ne == Cnd_ac_rsn_cd) doCnd_ac_rsn_cd_NE(info);
		else if (ne == Cnd_ac_rsn_nm) doCnd_ac_rsn_nm_NE(info);
		else if (ne == Cnd_pay_dpt_cd) doCnd_pay_dpt_cd_NE(info);
		else if (ne == Cnd_pay_dpt_nm) doCnd_pay_dpt_nm_NE(info);
		else if (ne == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NE(info);
		else if (ne == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NE(info);
		else if (ne == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NE(info);
		else if (ne == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NE(info);
		else if (ne == Cnd_so_dpt_cd) doCnd_so_dpt_cd_NE(info);
		else if (ne == Cnd_so_dpt_nm) doCnd_so_dpt_nm_NE(info);
		else if (ne == Cnd_psppl_cd) doCnd_psppl_cd_NE(info);
		else if (ne == Cnd_psppl_nm) doCnd_psppl_nm_NE(info);
		else if (ne == Cnd_bsppl_cd) doCnd_bsppl_cd_NE(info);
		else if (ne == Cnd_bsppl_nm) doCnd_bsppl_nm_NE(info);
		else if (ne == Cnd_asppl_cd) doCnd_asppl_cd_NE(info);
		else if (ne == Cnd_asppl_nm) doCnd_asppl_nm_NE(info);
		else if (ne == Cnd_setoff_cd) doCnd_setoff_cd_NE(info);
		else if (ne == Cnd_setoff_nm) doCnd_setoff_nm_NE(info);
		else if (ne == columnRslt_data_no) doRslt_data_no_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_ac_ym) doRslt_ac_ym_NE(info);
		else if (ne == columnRslt_pay_act_no) doRslt_pay_act_no_NE(info);
		else if (ne == columnRslt_pay_act_seq) doRslt_pay_act_seq_NE(info);
		else if (ne == columnRslt_pay_act_rev) doRslt_pay_act_rev_NE(info);
		else if (ne == columnRslt_pay_act_d_no) doRslt_pay_act_d_no_NE(info);
		else if (ne == columnRslt_pay_act_d_seq) doRslt_pay_act_d_seq_NE(info);
		else if (ne == columnRslt_ac_dt) doRslt_ac_dt_NE(info);
		else if (ne == columnRslt_can_flg) doRslt_can_flg_NE(info);
		else if (ne == columnRslt_ac_slip_typ) doRslt_ac_slip_typ_NE(info);
		else if (ne == columnRslt_ac_slip_typ_nm) doRslt_ac_slip_typ_nm_NE(info);
		else if (ne == columnRslt_ac_rsn_cd) doRslt_ac_rsn_cd_NE(info);
		else if (ne == columnRslt_ac_rsn_nm) doRslt_ac_rsn_nm_NE(info);
		else if (ne == columnRslt_pay_dpt_cd) doRslt_pay_dpt_cd_NE(info);
		else if (ne == columnRslt_pay_dpt_nm) doRslt_pay_dpt_nm_NE(info);
		else if (ne == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_NE(info);
		else if (ne == columnRslt_bsppl_dpt_nm) doRslt_bsppl_dpt_nm_NE(info);
		else if (ne == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NE(info);
		else if (ne == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NE(info);
		else if (ne == columnRslt_so_dpt_cd) doRslt_so_dpt_cd_NE(info);
		else if (ne == columnRslt_so_dpt_nm) doRslt_so_dpt_nm_NE(info);
		else if (ne == columnRslt_sub_dpt_cd1) doRslt_sub_dpt_cd1_NE(info);
		else if (ne == columnRslt_sub_dpt_nm1) doRslt_sub_dpt_nm1_NE(info);
		else if (ne == columnRslt_sub_dpt_cd2) doRslt_sub_dpt_cd2_NE(info);
		else if (ne == columnRslt_sub_dpt_nm2) doRslt_sub_dpt_nm2_NE(info);
		else if (ne == columnRslt_sub_dpt_cd3) doRslt_sub_dpt_cd3_NE(info);
		else if (ne == columnRslt_sub_dpt_nm3) doRslt_sub_dpt_nm3_NE(info);
		else if (ne == columnRslt_psppl_cd) doRslt_psppl_cd_NE(info);
		else if (ne == columnRslt_psppl_nm) doRslt_psppl_nm_NE(info);
		else if (ne == columnRslt_bsppl_cd) doRslt_bsppl_cd_NE(info);
		else if (ne == columnRslt_bsppl_nm) doRslt_bsppl_nm_NE(info);
		else if (ne == columnRslt_asppl_cd) doRslt_asppl_cd_NE(info);
		else if (ne == columnRslt_asppl_nm) doRslt_asppl_nm_NE(info);
		else if (ne == columnRslt_setoff_cd) doRslt_setoff_cd_NE(info);
		else if (ne == columnRslt_mst_setoff_nm) doRslt_mst_setoff_nm_NE(info);
		else if (ne == columnRslt_setoff_nm) doRslt_setoff_nm_NE(info);
		else if (ne == columnRslt_foreign_flg) doRslt_foreign_flg_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_nm) doRslt_base_cur_nm_NE(info);
		else if (ne == columnRslt_base_cur_amt) doRslt_base_cur_amt_NE(info);
		else if (ne == columnRslt_base_cur_tax_amt) doRslt_base_cur_tax_amt_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_trd_cur_amt) doRslt_trd_cur_amt_NE(info);
		else if (ne == columnRslt_trd_cur_tax_amt) doRslt_trd_cur_tax_amt_NE(info);
		else if (ne == columnRslt_tax_cd) doRslt_tax_cd_NE(info);
		else if (ne == columnRslt_tax_nm) doRslt_tax_nm_NE(info);
		else if (ne == columnRslt_xrate_cd) doRslt_xrate_cd_NE(info);
		else if (ne == columnRslt_xrate_nm) doRslt_xrate_nm_NE(info);
		else if (ne == columnRslt_xrate) doRslt_xrate_NE(info);
		else if (ne == columnRslt_rcv_bill_no) doRslt_rcv_bill_no_NE(info);
		else if (ne == columnRslt_pay_chk_no) doRslt_pay_chk_no_NE(info);
		else if (ne == columnRslt_usr_cd) doRslt_usr_cd_NE(info);
		else if (ne == columnRslt_usr_nm) doRslt_usr_nm_NE(info);
		else if (ne == columnRslt_iv_no) doRslt_iv_no_NE(info);
		else if (ne == columnRslt_wrk_no) doRslt_wrk_no_NE(info);
		else if (ne == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NE(info);
		else if (ne == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NE(info);
		else if (ne == columnRslt_pay_bank_ac_cd) doRslt_pay_bank_ac_cd_NE(info);
		else if (ne == columnRslt_pay_bank_ac_nm) doRslt_pay_bank_ac_nm_NE(info);
		else if (ne == columnRslt_note_no) doRslt_note_no_NE(info);
		else if (ne == columnRslt_jnl_key1) doRslt_jnl_key1_NE(info);
		else if (ne == columnRslt_jnl_key2) doRslt_jnl_key2_NE(info);
		else if (ne == columnRslt_jnl_key3) doRslt_jnl_key3_NE(info);
		else if (ne == columnRslt_jnl_key4) doRslt_jnl_key4_NE(info);
		else if (ne == columnRslt_jnl_key5) doRslt_jnl_key5_NE(info);
		else if (ne == columnRslt_jnl_key6) doRslt_jnl_key6_NE(info);
		else if (ne == columnRslt_jnl_key7) doRslt_jnl_key7_NE(info);
		else if (ne == columnRslt_jnl_key8) doRslt_jnl_key8_NE(info);
		else if (ne == columnRslt_jnl_key9) doRslt_jnl_key9_NE(info);
		else if (ne == columnRslt_jnl_key10) doRslt_jnl_key10_NE(info);
		else if (ne == columnRslt_trd_rmrks) doRslt_trd_rmrks_NE(info);
		else if (ne == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_sub_char4) doRslt_sub_char4_NE(info);
		else if (ne == columnRslt_sub_char5) doRslt_sub_char5_NE(info);
		else if (ne == columnRslt_sub_char6) doRslt_sub_char6_NE(info);
		else if (ne == columnRslt_sub_char7) doRslt_sub_char7_NE(info);
		else if (ne == columnRslt_sub_char8) doRslt_sub_char8_NE(info);
		else if (ne == columnRslt_sub_char9) doRslt_sub_char9_NE(info);
		else if (ne == columnRslt_sub_char10) doRslt_sub_char10_NE(info);
		else if (ne == columnRslt_sub_num1) doRslt_sub_num1_NE(info);
		else if (ne == columnRslt_sub_num2) doRslt_sub_num2_NE(info);
		else if (ne == columnRslt_sub_num3) doRslt_sub_num3_NE(info);
		else if (ne == columnRslt_sub_dt1) doRslt_sub_dt1_NE(info);
		else if (ne == columnRslt_sub_dt2) doRslt_sub_dt2_NE(info);
		else if (ne == columnRslt_sub_dt3) doRslt_sub_dt3_NE(info);
		else if (ne == columnRslt_jnl_fin_cnt) doRslt_jnl_fin_cnt_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[so_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_so_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[so_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_so_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[setoff_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_setoff_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[setoff_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_setoff_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_d_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_d_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[so_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_so_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[so_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_so_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[setoff_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_setoff_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mst_setoff_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mst_setoff_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[setoff_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_setoff_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_tax_amt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_tax_amt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_bill_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_bill_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char4_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char5_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char6_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char7_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char8_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char9_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char10_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_fin_cnt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_fin_cnt_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_ac_ym_fr) doCnd_ac_ym_fr_NX(info);
		else if (nx == Cnd_ac_ym_to) doCnd_ac_ym_to_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_ac_slip_typ) doCnd_ac_slip_typ_NX(info);
		else if (nx == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_NX(info);
		else if (nx == Cnd_ac_rsn_cd) doCnd_ac_rsn_cd_NX(info);
		else if (nx == Cnd_ac_rsn_nm) doCnd_ac_rsn_nm_NX(info);
		else if (nx == Cnd_pay_dpt_cd) doCnd_pay_dpt_cd_NX(info);
		else if (nx == Cnd_pay_dpt_nm) doCnd_pay_dpt_nm_NX(info);
		else if (nx == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_NX(info);
		else if (nx == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_NX(info);
		else if (nx == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_NX(info);
		else if (nx == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_NX(info);
		else if (nx == Cnd_so_dpt_cd) doCnd_so_dpt_cd_NX(info);
		else if (nx == Cnd_so_dpt_nm) doCnd_so_dpt_nm_NX(info);
		else if (nx == Cnd_psppl_cd) doCnd_psppl_cd_NX(info);
		else if (nx == Cnd_psppl_nm) doCnd_psppl_nm_NX(info);
		else if (nx == Cnd_bsppl_cd) doCnd_bsppl_cd_NX(info);
		else if (nx == Cnd_bsppl_nm) doCnd_bsppl_nm_NX(info);
		else if (nx == Cnd_asppl_cd) doCnd_asppl_cd_NX(info);
		else if (nx == Cnd_asppl_nm) doCnd_asppl_nm_NX(info);
		else if (nx == Cnd_setoff_cd) doCnd_setoff_cd_NX(info);
		else if (nx == Cnd_setoff_nm) doCnd_setoff_nm_NX(info);
		else if (nx == columnRslt_data_no) doRslt_data_no_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_ac_ym) doRslt_ac_ym_NX(info);
		else if (nx == columnRslt_pay_act_no) doRslt_pay_act_no_NX(info);
		else if (nx == columnRslt_pay_act_seq) doRslt_pay_act_seq_NX(info);
		else if (nx == columnRslt_pay_act_rev) doRslt_pay_act_rev_NX(info);
		else if (nx == columnRslt_pay_act_d_no) doRslt_pay_act_d_no_NX(info);
		else if (nx == columnRslt_pay_act_d_seq) doRslt_pay_act_d_seq_NX(info);
		else if (nx == columnRslt_ac_dt) doRslt_ac_dt_NX(info);
		else if (nx == columnRslt_can_flg) doRslt_can_flg_NX(info);
		else if (nx == columnRslt_ac_slip_typ) doRslt_ac_slip_typ_NX(info);
		else if (nx == columnRslt_ac_slip_typ_nm) doRslt_ac_slip_typ_nm_NX(info);
		else if (nx == columnRslt_ac_rsn_cd) doRslt_ac_rsn_cd_NX(info);
		else if (nx == columnRslt_ac_rsn_nm) doRslt_ac_rsn_nm_NX(info);
		else if (nx == columnRslt_pay_dpt_cd) doRslt_pay_dpt_cd_NX(info);
		else if (nx == columnRslt_pay_dpt_nm) doRslt_pay_dpt_nm_NX(info);
		else if (nx == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_NX(info);
		else if (nx == columnRslt_bsppl_dpt_nm) doRslt_bsppl_dpt_nm_NX(info);
		else if (nx == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_NX(info);
		else if (nx == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_NX(info);
		else if (nx == columnRslt_so_dpt_cd) doRslt_so_dpt_cd_NX(info);
		else if (nx == columnRslt_so_dpt_nm) doRslt_so_dpt_nm_NX(info);
		else if (nx == columnRslt_sub_dpt_cd1) doRslt_sub_dpt_cd1_NX(info);
		else if (nx == columnRslt_sub_dpt_nm1) doRslt_sub_dpt_nm1_NX(info);
		else if (nx == columnRslt_sub_dpt_cd2) doRslt_sub_dpt_cd2_NX(info);
		else if (nx == columnRslt_sub_dpt_nm2) doRslt_sub_dpt_nm2_NX(info);
		else if (nx == columnRslt_sub_dpt_cd3) doRslt_sub_dpt_cd3_NX(info);
		else if (nx == columnRslt_sub_dpt_nm3) doRslt_sub_dpt_nm3_NX(info);
		else if (nx == columnRslt_psppl_cd) doRslt_psppl_cd_NX(info);
		else if (nx == columnRslt_psppl_nm) doRslt_psppl_nm_NX(info);
		else if (nx == columnRslt_bsppl_cd) doRslt_bsppl_cd_NX(info);
		else if (nx == columnRslt_bsppl_nm) doRslt_bsppl_nm_NX(info);
		else if (nx == columnRslt_asppl_cd) doRslt_asppl_cd_NX(info);
		else if (nx == columnRslt_asppl_nm) doRslt_asppl_nm_NX(info);
		else if (nx == columnRslt_setoff_cd) doRslt_setoff_cd_NX(info);
		else if (nx == columnRslt_mst_setoff_nm) doRslt_mst_setoff_nm_NX(info);
		else if (nx == columnRslt_setoff_nm) doRslt_setoff_nm_NX(info);
		else if (nx == columnRslt_foreign_flg) doRslt_foreign_flg_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_nm) doRslt_base_cur_nm_NX(info);
		else if (nx == columnRslt_base_cur_amt) doRslt_base_cur_amt_NX(info);
		else if (nx == columnRslt_base_cur_tax_amt) doRslt_base_cur_tax_amt_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_trd_cur_amt) doRslt_trd_cur_amt_NX(info);
		else if (nx == columnRslt_trd_cur_tax_amt) doRslt_trd_cur_tax_amt_NX(info);
		else if (nx == columnRslt_tax_cd) doRslt_tax_cd_NX(info);
		else if (nx == columnRslt_tax_nm) doRslt_tax_nm_NX(info);
		else if (nx == columnRslt_xrate_cd) doRslt_xrate_cd_NX(info);
		else if (nx == columnRslt_xrate_nm) doRslt_xrate_nm_NX(info);
		else if (nx == columnRslt_xrate) doRslt_xrate_NX(info);
		else if (nx == columnRslt_rcv_bill_no) doRslt_rcv_bill_no_NX(info);
		else if (nx == columnRslt_pay_chk_no) doRslt_pay_chk_no_NX(info);
		else if (nx == columnRslt_usr_cd) doRslt_usr_cd_NX(info);
		else if (nx == columnRslt_usr_nm) doRslt_usr_nm_NX(info);
		else if (nx == columnRslt_iv_no) doRslt_iv_no_NX(info);
		else if (nx == columnRslt_wrk_no) doRslt_wrk_no_NX(info);
		else if (nx == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_NX(info);
		else if (nx == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_NX(info);
		else if (nx == columnRslt_pay_bank_ac_cd) doRslt_pay_bank_ac_cd_NX(info);
		else if (nx == columnRslt_pay_bank_ac_nm) doRslt_pay_bank_ac_nm_NX(info);
		else if (nx == columnRslt_note_no) doRslt_note_no_NX(info);
		else if (nx == columnRslt_jnl_key1) doRslt_jnl_key1_NX(info);
		else if (nx == columnRslt_jnl_key2) doRslt_jnl_key2_NX(info);
		else if (nx == columnRslt_jnl_key3) doRslt_jnl_key3_NX(info);
		else if (nx == columnRslt_jnl_key4) doRslt_jnl_key4_NX(info);
		else if (nx == columnRslt_jnl_key5) doRslt_jnl_key5_NX(info);
		else if (nx == columnRslt_jnl_key6) doRslt_jnl_key6_NX(info);
		else if (nx == columnRslt_jnl_key7) doRslt_jnl_key7_NX(info);
		else if (nx == columnRslt_jnl_key8) doRslt_jnl_key8_NX(info);
		else if (nx == columnRslt_jnl_key9) doRslt_jnl_key9_NX(info);
		else if (nx == columnRslt_jnl_key10) doRslt_jnl_key10_NX(info);
		else if (nx == columnRslt_trd_rmrks) doRslt_trd_rmrks_NX(info);
		else if (nx == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_sub_char4) doRslt_sub_char4_NX(info);
		else if (nx == columnRslt_sub_char5) doRslt_sub_char5_NX(info);
		else if (nx == columnRslt_sub_char6) doRslt_sub_char6_NX(info);
		else if (nx == columnRslt_sub_char7) doRslt_sub_char7_NX(info);
		else if (nx == columnRslt_sub_char8) doRslt_sub_char8_NX(info);
		else if (nx == columnRslt_sub_char9) doRslt_sub_char9_NX(info);
		else if (nx == columnRslt_sub_char10) doRslt_sub_char10_NX(info);
		else if (nx == columnRslt_sub_num1) doRslt_sub_num1_NX(info);
		else if (nx == columnRslt_sub_num2) doRslt_sub_num2_NX(info);
		else if (nx == columnRslt_sub_num3) doRslt_sub_num3_NX(info);
		else if (nx == columnRslt_sub_dt1) doRslt_sub_dt1_NX(info);
		else if (nx == columnRslt_sub_dt2) doRslt_sub_dt2_NX(info);
		else if (nx == columnRslt_sub_dt3) doRslt_sub_dt3_NX(info);
		else if (nx == columnRslt_jnl_fin_cnt) doRslt_jnl_fin_cnt_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[so_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_so_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[so_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_so_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[setoff_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_setoff_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[setoff_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_setoff_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_d_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_d_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[so_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_so_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[so_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_so_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[setoff_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_setoff_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mst_setoff_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mst_setoff_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[setoff_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_setoff_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[foreign_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_foreign_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_tax_amt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_tax_amt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_bill_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_bill_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char4_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char5_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char6_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char7_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char8_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char9_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char10_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_fin_cnt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_fin_cnt_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_ac_ym_fr) doCnd_ac_ym_fr_LC(info);
		else if (lc == Cnd_ac_ym_to) doCnd_ac_ym_to_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_ac_slip_typ) doCnd_ac_slip_typ_LC(info);
		else if (lc == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_LC(info);
		else if (lc == Cnd_ac_rsn_cd) doCnd_ac_rsn_cd_LC(info);
		else if (lc == Cnd_ac_rsn_nm) doCnd_ac_rsn_nm_LC(info);
		else if (lc == Cnd_pay_dpt_cd) doCnd_pay_dpt_cd_LC(info);
		else if (lc == Cnd_pay_dpt_nm) doCnd_pay_dpt_nm_LC(info);
		else if (lc == Cnd_bsppl_dpt_cd) doCnd_bsppl_dpt_cd_LC(info);
		else if (lc == Cnd_bsppl_dpt_nm) doCnd_bsppl_dpt_nm_LC(info);
		else if (lc == Cnd_ap_dpt_cd) doCnd_ap_dpt_cd_LC(info);
		else if (lc == Cnd_ap_dpt_nm) doCnd_ap_dpt_nm_LC(info);
		else if (lc == Cnd_so_dpt_cd) doCnd_so_dpt_cd_LC(info);
		else if (lc == Cnd_so_dpt_nm) doCnd_so_dpt_nm_LC(info);
		else if (lc == Cnd_psppl_cd) doCnd_psppl_cd_LC(info);
		else if (lc == Cnd_psppl_nm) doCnd_psppl_nm_LC(info);
		else if (lc == Cnd_bsppl_cd) doCnd_bsppl_cd_LC(info);
		else if (lc == Cnd_bsppl_nm) doCnd_bsppl_nm_LC(info);
		else if (lc == Cnd_asppl_cd) doCnd_asppl_cd_LC(info);
		else if (lc == Cnd_asppl_nm) doCnd_asppl_nm_LC(info);
		else if (lc == Cnd_setoff_cd) doCnd_setoff_cd_LC(info);
		else if (lc == Cnd_setoff_nm) doCnd_setoff_nm_LC(info);
		else if (lc == columnRslt_data_no) doRslt_data_no_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_ac_ym) doRslt_ac_ym_LC(info);
		else if (lc == columnRslt_pay_act_no) doRslt_pay_act_no_LC(info);
		else if (lc == columnRslt_pay_act_seq) doRslt_pay_act_seq_LC(info);
		else if (lc == columnRslt_pay_act_rev) doRslt_pay_act_rev_LC(info);
		else if (lc == columnRslt_pay_act_d_no) doRslt_pay_act_d_no_LC(info);
		else if (lc == columnRslt_pay_act_d_seq) doRslt_pay_act_d_seq_LC(info);
		else if (lc == columnRslt_ac_dt) doRslt_ac_dt_LC(info);
		else if (lc == columnRslt_ac_slip_typ) doRslt_ac_slip_typ_LC(info);
		else if (lc == columnRslt_ac_slip_typ_nm) doRslt_ac_slip_typ_nm_LC(info);
		else if (lc == columnRslt_ac_rsn_cd) doRslt_ac_rsn_cd_LC(info);
		else if (lc == columnRslt_ac_rsn_nm) doRslt_ac_rsn_nm_LC(info);
		else if (lc == columnRslt_pay_dpt_cd) doRslt_pay_dpt_cd_LC(info);
		else if (lc == columnRslt_pay_dpt_nm) doRslt_pay_dpt_nm_LC(info);
		else if (lc == columnRslt_bsppl_dpt_cd) doRslt_bsppl_dpt_cd_LC(info);
		else if (lc == columnRslt_bsppl_dpt_nm) doRslt_bsppl_dpt_nm_LC(info);
		else if (lc == columnRslt_ap_dpt_cd) doRslt_ap_dpt_cd_LC(info);
		else if (lc == columnRslt_ap_dpt_nm) doRslt_ap_dpt_nm_LC(info);
		else if (lc == columnRslt_so_dpt_cd) doRslt_so_dpt_cd_LC(info);
		else if (lc == columnRslt_so_dpt_nm) doRslt_so_dpt_nm_LC(info);
		else if (lc == columnRslt_sub_dpt_cd1) doRslt_sub_dpt_cd1_LC(info);
		else if (lc == columnRslt_sub_dpt_nm1) doRslt_sub_dpt_nm1_LC(info);
		else if (lc == columnRslt_sub_dpt_cd2) doRslt_sub_dpt_cd2_LC(info);
		else if (lc == columnRslt_sub_dpt_nm2) doRslt_sub_dpt_nm2_LC(info);
		else if (lc == columnRslt_sub_dpt_cd3) doRslt_sub_dpt_cd3_LC(info);
		else if (lc == columnRslt_sub_dpt_nm3) doRslt_sub_dpt_nm3_LC(info);
		else if (lc == columnRslt_psppl_cd) doRslt_psppl_cd_LC(info);
		else if (lc == columnRslt_psppl_nm) doRslt_psppl_nm_LC(info);
		else if (lc == columnRslt_bsppl_cd) doRslt_bsppl_cd_LC(info);
		else if (lc == columnRslt_bsppl_nm) doRslt_bsppl_nm_LC(info);
		else if (lc == columnRslt_asppl_cd) doRslt_asppl_cd_LC(info);
		else if (lc == columnRslt_asppl_nm) doRslt_asppl_nm_LC(info);
		else if (lc == columnRslt_setoff_cd) doRslt_setoff_cd_LC(info);
		else if (lc == columnRslt_mst_setoff_nm) doRslt_mst_setoff_nm_LC(info);
		else if (lc == columnRslt_setoff_nm) doRslt_setoff_nm_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_nm) doRslt_base_cur_nm_LC(info);
		else if (lc == columnRslt_base_cur_amt) doRslt_base_cur_amt_LC(info);
		else if (lc == columnRslt_base_cur_tax_amt) doRslt_base_cur_tax_amt_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_trd_cur_amt) doRslt_trd_cur_amt_LC(info);
		else if (lc == columnRslt_trd_cur_tax_amt) doRslt_trd_cur_tax_amt_LC(info);
		else if (lc == columnRslt_tax_cd) doRslt_tax_cd_LC(info);
		else if (lc == columnRslt_tax_nm) doRslt_tax_nm_LC(info);
		else if (lc == columnRslt_xrate_cd) doRslt_xrate_cd_LC(info);
		else if (lc == columnRslt_xrate_nm) doRslt_xrate_nm_LC(info);
		else if (lc == columnRslt_xrate) doRslt_xrate_LC(info);
		else if (lc == columnRslt_rcv_bill_no) doRslt_rcv_bill_no_LC(info);
		else if (lc == columnRslt_pay_chk_no) doRslt_pay_chk_no_LC(info);
		else if (lc == columnRslt_usr_cd) doRslt_usr_cd_LC(info);
		else if (lc == columnRslt_usr_nm) doRslt_usr_nm_LC(info);
		else if (lc == columnRslt_iv_no) doRslt_iv_no_LC(info);
		else if (lc == columnRslt_wrk_no) doRslt_wrk_no_LC(info);
		else if (lc == columnRslt_bank_ac_cd) doRslt_bank_ac_cd_LC(info);
		else if (lc == columnRslt_bank_ac_nm) doRslt_bank_ac_nm_LC(info);
		else if (lc == columnRslt_pay_bank_ac_cd) doRslt_pay_bank_ac_cd_LC(info);
		else if (lc == columnRslt_pay_bank_ac_nm) doRslt_pay_bank_ac_nm_LC(info);
		else if (lc == columnRslt_note_no) doRslt_note_no_LC(info);
		else if (lc == columnRslt_jnl_key1) doRslt_jnl_key1_LC(info);
		else if (lc == columnRslt_jnl_key2) doRslt_jnl_key2_LC(info);
		else if (lc == columnRslt_jnl_key3) doRslt_jnl_key3_LC(info);
		else if (lc == columnRslt_jnl_key4) doRslt_jnl_key4_LC(info);
		else if (lc == columnRslt_jnl_key5) doRslt_jnl_key5_LC(info);
		else if (lc == columnRslt_jnl_key6) doRslt_jnl_key6_LC(info);
		else if (lc == columnRslt_jnl_key7) doRslt_jnl_key7_LC(info);
		else if (lc == columnRslt_jnl_key8) doRslt_jnl_key8_LC(info);
		else if (lc == columnRslt_jnl_key9) doRslt_jnl_key9_LC(info);
		else if (lc == columnRslt_jnl_key10) doRslt_jnl_key10_LC(info);
		else if (lc == columnRslt_trd_rmrks) doRslt_trd_rmrks_LC(info);
		else if (lc == columnRslt_trd_d_rmrks) doRslt_trd_d_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_sub_char4) doRslt_sub_char4_LC(info);
		else if (lc == columnRslt_sub_char5) doRslt_sub_char5_LC(info);
		else if (lc == columnRslt_sub_char6) doRslt_sub_char6_LC(info);
		else if (lc == columnRslt_sub_char7) doRslt_sub_char7_LC(info);
		else if (lc == columnRslt_sub_char8) doRslt_sub_char8_LC(info);
		else if (lc == columnRslt_sub_char9) doRslt_sub_char9_LC(info);
		else if (lc == columnRslt_sub_char10) doRslt_sub_char10_LC(info);
		else if (lc == columnRslt_sub_num1) doRslt_sub_num1_LC(info);
		else if (lc == columnRslt_sub_num2) doRslt_sub_num2_LC(info);
		else if (lc == columnRslt_sub_num3) doRslt_sub_num3_LC(info);
		else if (lc == columnRslt_sub_dt1) doRslt_sub_dt1_LC(info);
		else if (lc == columnRslt_sub_dt2) doRslt_sub_dt2_LC(info);
		else if (lc == columnRslt_sub_dt3) doRslt_sub_dt3_LC(info);
		else if (lc == columnRslt_jnl_fin_cnt) doRslt_jnl_fin_cnt_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[ac_ym_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_ym_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_ym_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[so_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_so_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[so_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_so_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[psppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_psppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_asppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[setoff_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_setoff_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[setoff_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_setoff_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[data_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_data_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_act_d_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_act_d_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_slip_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_slip_typ_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[pay_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ap_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ap_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[so_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_so_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[so_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_so_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dpt_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dpt_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[psppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_psppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[setoff_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_setoff_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mst_setoff_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mst_setoff_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[setoff_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_setoff_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_tax_amt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_tax_amt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rcv_bill_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rcv_bill_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_chk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_chk_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wrk_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wrk_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bank_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bank_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pay_bank_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pay_bank_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[note_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_note_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char4_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char5_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char6_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char7_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char8_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char9_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char10_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_num3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_num3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_dt3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_dt3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[jnl_fin_cnt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_jnl_fin_cnt_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ac_slip_typ]の作成メソッド
	 */
	public MCList getCnd_ac_slip_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcSlipTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ac_rsn_cd]の作成メソッド
	 */
	public MCList getCnd_ac_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pay_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_pay_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bsppl_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_bsppl_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ap_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_ap_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_so_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_so_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_psppl_cd]の作成メソッド
	 */
	public MCList getCnd_psppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bsppl_cd]の作成メソッド
	 */
	public MCList getCnd_bsppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_asppl_cd]の作成メソッド
	 */
	public MCList getCnd_asppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_setoff_cd]の作成メソッド
	 */
	public MCList getCnd_setoff_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MB.MBBBL0060.Srch01")) {
			return new MB_MBBBL0060_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MB_MBBBL0060_Srch01]の定型処理のInnerClass
	 */
	protected class MB_MBBBL0060_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MB_MBBBL0060_Srch01;

		/** コンストラクタ */
		protected MB_MBBBL0060_Srch01Bridge() {
			p_MB_MBBBL0060_Srch01 = new MCParam(PDef.MB_MBBBL0060_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MB_MBBBL0060_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMBBB.MBBBP0060.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMBBB.MBBBP0060.RsltR.class));

			p_MB_MBBBL0060_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MB_MBBBL0060_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MB_MBBBL0060_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MB_MBBBL0060_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MB_MBBBL0060_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMBBB.MBBBP0060.CndR up0() {
			return (mcframe.clientMBBB.MBBBP0060.CndR)up(0);
		}

		protected MCList<mcframe.clientMBBB.MBBBP0060.RsltR> down0() {
			return (MCList<mcframe.clientMBBB.MBBBP0060.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MB_MBBBL0060_Srch01.addDownBlock(MCList.create(mcframe.clientMBBB.MBBBP0060.RsltR.class));
		}
		protected MCParam param() {
			return p_MB_MBBBL0060_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMBBB.MBBBP0060.RsltR>)p_MB_MBBBL0060_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}