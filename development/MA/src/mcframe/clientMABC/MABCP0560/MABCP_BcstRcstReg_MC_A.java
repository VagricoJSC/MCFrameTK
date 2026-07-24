package mcframe.clientMABC.MABCP0560;

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
import mcframe.clientMABC.MABCP0560.MABCP_BcstRcstReg_MC.MA_MABCL0560_Srch01Caller;
import mcframe.clientMABC.MABCP0560.MABCP_BcstRcstReg_MC.MA_MABCL0560_Upd01Caller;

/**
 * 画面"MABCP_BcstRcstReg"パネルクラスです。<p>
 *
 * 請求先・入金先関連の検索、更新を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_BcstRcstReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABCP0560";

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
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,0;REF,View,3 UPD,登録・訂正する,0;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_REF = null;
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
	// [Tbl]ブロック関連のField定義
	public MCPanel TblPanel = null;
	// [Tbl]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	public MCTitledBorder HdrTitledBorder = null;
	// [Hdr]ブロックの項目のField定義
	public MCLabel Hdr_bp_cd_Label = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCTextField Hdr_bp_nm = null;
	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public MCCheckBox Hdr_bcst_flg = null;
	/**
	 * Payer 入金先.<p>
	 *
	 */
	public MCCheckBox Hdr_rcst_flg = null;
	public MCLabel Hdr_rcst_cd_Label = null;
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_rcst_cd = null;
	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public MCTextField Hdr_rcst_nm = null;
	public MCLabel Hdr_ar_cred_cd_Label = null;
	/**
	 * AR credit managed BP cd. 債権与信管理先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_ar_cred_cd = null;
	/**
	 * AR credit managed BP name 債権与信管理先名.<p>
	 *
	 */
	public MCTextField Hdr_ar_cred_nm = null;
	public MCLabel Hdr_bill_dpt_typ_Label = null;
	/**
	 * Billing dept. type 請求部門区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_bill_dpt_typ = null;
	/**
	 * Billing dept. type name 請求部門区分名.<p>
	 *
	 */
	public MCTextField Hdr_bill_dpt_typ_nm = null;
	public MCLabel Hdr_bcst_dpt_cd_Label = null;
	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_bcst_dpt_cd = null;
	/**
	 * Billing customer dept. in charge name 請求先担当部門名.<p>
	 *
	 */
	public MCTextField Hdr_bcst_dpt_nm = null;
	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_check_bcst_dpt_cd = null;
	public MCLabel Hdr_bill_cl_typ_Label = null;
	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_bill_cl_typ = null;
	/**
	 * Billing closing type name 請求締処理区分名.<p>
	 *
	 */
	public MCTextField Hdr_bill_cl_typ_nm = null;
	public MCLabel Hdr_bill_cl_day1_Label = null;
	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public MCNumberField Hdr_bill_cl_day1 = null;
	public MCLabel Hdr_bill_cl_day2_Label = null;
	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public MCNumberField Hdr_bill_cl_day2 = null;
	public MCLabel Hdr_bill_cl_day3_Label = null;
	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public MCNumberField Hdr_bill_cl_day3 = null;
	public MCLabel Hdr_bill_cl_day4_Label = null;
	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public MCNumberField Hdr_bill_cl_day4 = null;
	public MCLabel Hdr_bill_cl_day5_Label = null;
	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public MCNumberField Hdr_bill_cl_day5 = null;
	/**
	 * Billing tax calculation 請求税計算.<p>
	 *
	 */
	public MCCheckBox Hdr_tax_on_bill_flg = null;
	public MCLabel Hdr_bill_tax_rnd_typ_Label = null;
	/**
	 * Billing tax rounding type 請求税額端数処理区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_bill_tax_rnd_typ = null;
	/**
	 * Billing tax rounding type 請求税額端数処理区分名.<p>
	 *
	 */
	public MCTextField Hdr_bill_tax_rnd_typ_nm = null;
	public MCLabel Hdr_bill_cl_delay_days_Label = null;
	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public MCNumberField Hdr_bill_cl_delay_days = null;
	public MCLabel Hdr_bill_cl_ba_typ_Label = null;
	/**
	 * Billing closing before/after type 請求締前後区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_bill_cl_ba_typ = null;
	/**
	 * Before/after billing closing type name 請求締前後区分名.<p>
	 *
	 */
	public MCTextField Hdr_bill_cl_ba_typ_nm = null;
	public MCLabel Hdr_bill_cal_cd_Label = null;
	/**
	 * Billing customer calendar cd. 請求先カレンダＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_bill_cal_cd = null;
	/**
	 * Billing customer calendar name 請求先カレンダ名.<p>
	 *
	 */
	public MCTextField Hdr_bill_cal_nm = null;
	public MCLabel Hdr_rcv_ba_typ_Label = null;
	/**
	 * Payment receipt schedule before/after type 入金予定前後区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_rcv_ba_typ = null;
	/**
	 * Payment receipt schedule before/after type name 入金予定前後区分名.<p>
	 *
	 */
	public MCTextField Hdr_rcv_ba_typ_nm = null;
	/**
	 * Details auto-reconciliation 自動明細消込.<p>
	 *
	 */
	public MCCheckBox Hdr_auto_line_appl_flg = null;
	/**
	 * Sales temporary unit price closing 売上仮単価締.<p>
	 *
	 */
	public MCCheckBox Hdr_sls_interim_cl_flg = null;
	public MCLabel Hdr_ar_setoff_grp_cd_Label = null;
	/**
	 * AR offset group cd. 債権相殺グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_ar_setoff_grp_cd = null;
	/**
	 * AR offset group name 債権相殺グループ名.<p>
	 *
	 */
	public MCTextField Hdr_ar_setoff_grp_nm = null;
	public MCLabel Hdr_bcst_prnt_typ_Label = null;
	/**
	 * Report issue type (Billing customer) 帳票発行区分（請求先）.<p>
	 *
	 */
	public MCTextComboBox Hdr_bcst_prnt_typ = null;
	/**
	 * Report issue type name (Billing customer) 帳票発行区分名（請求先）.<p>
	 *
	 */
	public MCTextField Hdr_bcst_prnt_typ_nm = null;
	public MCLabel Hdr_bill_zip_cd_Label = null;
	/**
	 * Invoice send-to zip code 請求書送付郵便番号.<p>
	 *
	 */
	public MCTextField Hdr_bill_zip_cd = null;
	public MCLabel Hdr_bill_addr1_Label = null;
	/**
	 * Invoice send-to address 1 請求書送付住所１.<p>
	 *
	 */
	public MCTextField Hdr_bill_addr1 = null;
	public MCLabel Hdr_bill_addr2_Label = null;
	/**
	 * Invoice send-to address 2 請求書送付住所２.<p>
	 *
	 */
	public MCTextField Hdr_bill_addr2 = null;
	public MCLabel Hdr_bill_addr3_Label = null;
	/**
	 * Invoice send-to address 3 請求書送付住所３.<p>
	 *
	 */
	public MCTextField Hdr_bill_addr3 = null;
	public MCLabel Hdr_bill_addr4_Label = null;
	/**
	 * Invoice send-to address 4 請求書送付住所４.<p>
	 *
	 */
	public MCTextField Hdr_bill_addr4 = null;
	public MCLabel Hdr_bill_tel_Label = null;
	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public MCTextField Hdr_bill_tel = null;
	public MCLabel Hdr_bill_bcst_nm_Label = null;
	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public MCTextField Hdr_bill_bcst_nm = null;
	public MCLabel Hdr_bill_bcst_dpt_Label = null;
	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public MCTextField Hdr_bill_bcst_dpt = null;
	public MCLabel Hdr_bill_bcst_psn_Label = null;
	/**
	 * Invoice send-to PIC 請求書送付担当者.<p>
	 *
	 */
	public MCTextField Hdr_bill_bcst_psn = null;
	public MCLabel Hdr_bill_bcst_psn_title_Label = null;
	/**
	 * Invoice send-to PIC honorific 請求書送付担当者敬称.<p>
	 *
	 */
	public MCTextField Hdr_bill_bcst_psn_title = null;
	public MCLabel Hdr_bill_prnt_typ_Label = null;
	/**
	 * Invoice issue type 請求書発行区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_bill_prnt_typ = null;
	/**
	 * Invoice issue type name 請求書発行区分名.<p>
	 *
	 */
	public MCTextField Hdr_bill_prnt_typ_nm = null;
	public MCLabel Hdr_sls_dtl_outp_typ_Label = null;
	/**
	 * Sales details output type 売上明細書出力区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_sls_dtl_outp_typ = null;
	/**
	 * Sales details output type name 売上明細書出力区分名.<p>
	 *
	 */
	public MCTextField Hdr_sls_dtl_outp_typ_nm = null;
	/**
	 * Output invoice details 請求書明細出力.<p>
	 *
	 */
	public MCCheckBox Hdr_bill_dtl_outp_flg = null;
	/**
	 * Display balance of previous month on invoice 請求書前月残高表示.<p>
	 *
	 */
	public MCCheckBox Hdr_bfw_bal_disp_flg = null;
	/**
	 * Display advance received on invoice 請求書前受金表示.<p>
	 *
	 */
	public MCCheckBox Hdr_bill_dtl_adv_flg = null;
	/**
	 * Display payment receipt schedule in invoice 請求書入金予定表示.<p>
	 *
	 */
	public MCCheckBox Hdr_bill_dtl_rcv_flg = null;
	public MCLabel Hdr_bill_dtl_subttl_typ_Label = null;
	/**
	 * Invoice details subtotal type 請求書明細小計区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_bill_dtl_subttl_typ = null;
	/**
	 * Invoice details subtotal type name 請求書明細小計区分名.<p>
	 *
	 */
	public MCTextField Hdr_bill_dtl_subttl_typ_nm = null;
	public MCLabel Hdr_bill_dtl_brk_typ_Label = null;
	/**
	 * Invoice details page break type 請求書明細改頁区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_bill_dtl_brk_typ = null;
	/**
	 * Invoice details page break type name 請求書明細改頁区分名.<p>
	 *
	 */
	public MCTextField Hdr_bill_dtl_brk_typ_nm = null;
	public MCLabel Hdr_bill_dtl_sort_typ_Label = null;
	/**
	 * Invoice details sorting order type 請求書明細並順区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_bill_dtl_sort_typ = null;
	/**
	 * Invoice details sort order type name 請求書明細並順区分名.<p>
	 *
	 */
	public MCTextField Hdr_bill_dtl_sort_typ_nm = null;
	public MCLabel Hdr_bill_can_slip_typ_Label = null;
	/**
	 * Invoice cancel slip display type 請求書取消伝票表示区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_bill_can_slip_typ = null;
	/**
	 * Invoice cancel slip display type name 請求書取消伝票表示区分名.<p>
	 *
	 */
	public MCTextField Hdr_bill_can_slip_typ_nm = null;
	/**
	 * For auto-reconciliation 入金自動消込対象.<p>
	 *
	 */
	public MCCheckBox Hdr_rcv_auto_appl_tgt_flg = null;
	/**
	 * Match amount 金額考慮.<p>
	 *
	 */
	public MCCheckBox Hdr_rcv_amt_match_flg = null;
	/**
	 * Include payment option 金種考慮.<p>
	 *
	 */
	public MCCheckBox Hdr_ar_sttl_typ_match_flg = null;
	/**
	 * Fee calculation 手数料計算.<p>
	 *
	 */
	public MCCheckBox Hdr_calc_com_paid_flg = null;
	public MCLabel Hdr_auto_appl_delay_days_Label = null;
	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public MCNumberField Hdr_auto_appl_delay_days = null;
	public MCLabel Hdr_xfr_psn_Label = null;
	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public MCTextField Hdr_xfr_psn = null;
	public MCLabel Hdr_rcst_prnt_typ_Label = null;
	/**
	 * Report issue type (Payer) 帳票発行区分（入金先）.<p>
	 *
	 */
	public MCTextComboBox Hdr_rcst_prnt_typ = null;
	/**
	 * Report issue type name (Payer) 帳票発行区分名（入金先）.<p>
	 *
	 */
	public MCTextField Hdr_rcst_prnt_typ_nm = null;
	// [DtlTab]ブロック関連のField定義
	public MCPanel DtlTabPanel = null;
	public MCTabbedPane DtlTabTab = null;
	// [DtlTab]ブロックの項目のField定義
	// [Wrk1Hdr]ブロック関連のField定義
	public MCPanel Wrk1HdrPanel = null;
	// [Wrk1Hdr]ブロックの項目のField定義
	// [Wrk2Hdr]ブロック関連のField定義
	public MCPanel Wrk2HdrPanel = null;
	// [Wrk2Hdr]ブロックの項目のField定義
	// [Wrk3Hdr]ブロック関連のField定義
	public MCPanel Wrk3HdrPanel = null;
	// [Wrk3Hdr]ブロックの項目のField定義
	// [Wrk4]ブロック関連のField定義
	public MCPanel Wrk4Panel = null;
	// [Wrk4]ブロックの項目のField定義
	// [Wrk4Hdr]ブロック関連のField定義
	public MCPanel Wrk4HdrPanel = null;
	// [Wrk4Hdr]ブロックの項目のField定義
	public MCLabel Wrk4Hdr_bill_cl_day1_Label = null;
	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public MCNumberField Wrk4Hdr_bill_cl_day1 = null;
	public MCLabel Wrk4Hdr_bill_cl_day2_Label = null;
	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public MCNumberField Wrk4Hdr_bill_cl_day2 = null;
	public MCLabel Wrk4Hdr_bill_cl_day3_Label = null;
	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public MCNumberField Wrk4Hdr_bill_cl_day3 = null;
	public MCLabel Wrk4Hdr_bill_cl_day4_Label = null;
	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public MCNumberField Wrk4Hdr_bill_cl_day4 = null;
	public MCLabel Wrk4Hdr_bill_cl_day5_Label = null;
	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public MCNumberField Wrk4Hdr_bill_cl_day5 = null;
	// [Wrk4Dtl]ブロック関連のField定義
	public MCPanel Wrk4DtlPanel = null;
	public MCScrollPane Wrk4DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0560.Wrk4DtlR> Wrk4DtlTable = null;
	// [Wrk4Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_del_flg = null;
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_bcst_cd = null;
	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_bill_cl_day1 = null;
	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_bill_cl_day2 = null;
	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_bill_cl_day3 = null;
	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_bill_cl_day4 = null;
	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_bill_cl_day5 = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_cur_nm = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_amt_dec_place = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Wrk4Dtl_amt_p_PPanel;
	public MCColumnConfig columnWrk4Dtl_min_amt;// [Wrk4Dtl]の[amt_p.amt]を[columnWrk4Dtl_min_amt]としてエイリアス定義。
	/**
	 * Settlement method cd. 決済方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_sttl_cd = null;
	/**
	 * Settlement method name 決済方法名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_sttl_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_wg_nm = null;
	/**
	 * Ratio 比率.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_rate = null;
	/**
	 * Site type サイト区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_crryovr_mons_typ = null;
	/**
	 * Site type name サイト区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_crryovr_mons_typ_nm = null;
	/**
	 * Account receivable turnover period 1 入金サイト１.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_rcv_crryovr_mons1 = null;
	/**
	 * Scheduled payment receipt date 1 入金予定日１.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_rcv_day1 = null;
	/**
	 * Account receivable turnover period 2 入金サイト２.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_rcv_crryovr_mons2 = null;
	/**
	 * Scheduled payment receipt date 2 入金予定日２.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_rcv_day2 = null;
	/**
	 * Account receivable turnover period 3 入金サイト３.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_rcv_crryovr_mons3 = null;
	/**
	 * Scheduled payment receipt date 3 入金予定日３.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_rcv_day3 = null;
	/**
	 * Account receivable turnover period 4 入金サイト４.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_rcv_crryovr_mons4 = null;
	/**
	 * Scheduled payment receipt date 4 入金予定日４.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_rcv_day4 = null;
	/**
	 * Account receivable turnover period 5 入金サイト５.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_rcv_crryovr_mons5 = null;
	/**
	 * Scheduled payment receipt date 5 入金予定日５.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_rcv_day5 = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_del_ts = null;
	// [Wrk4DtlBtn]ブロック関連のField定義
	public MCPanel Wrk4DtlBtnPanel = null;
	// [Wrk4DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Wrk4DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Wrk4DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Wrk4DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Wrk4DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Wrk4DtlBtn_rcopy = null;
	// [Wrk7]ブロック関連のField定義
	public MCPanel Wrk7Panel = null;
	// [Wrk7]ブロックの項目のField定義
	// [Wrk7Hdr]ブロック関連のField定義
	public MCPanel Wrk7HdrPanel = null;
	// [Wrk7Hdr]ブロックの項目のField定義
	public MCLabel Wrk7Hdr_st_dt_Label = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDateField Wrk7Hdr_st_dt = null;
	public MCLabel Wrk7Hdr_end_dt_Label = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDateField Wrk7Hdr_end_dt = null;
	/**
	 * Applied date update 適用日反映.<p>
	 *
	 */
	public MCButton Wrk7Hdr_set_dt = null;
	// [Wrk7Dtl]ブロック関連のField定義
	public MCPanel Wrk7DtlPanel = null;
	public MCScrollPane Wrk7DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0560.Wrk7DtlR> Wrk7DtlTable = null;
	// [Wrk7Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_del_flg = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_bp_cd = null;
	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_if_proc_typ = null;
	/**
	 * IF process type name ＩＦ処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_if_proc_typ_nm = null;
	/**
	 * Not for chargeable supply 有償支給対象外.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_not_onr_prov_flg = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Wrk7Dtl_dt_p_PPanel;
	public MCColumnConfig columnWrk7Dtl_st_dt_key;// [Wrk7Dtl]の[dt_p.st_dt_key]を[columnWrk7Dtl_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnWrk7Dtl_st_dt;// [Wrk7Dtl]の[dt_p.st_dt]を[columnWrk7Dtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnWrk7Dtl_end_dt;// [Wrk7Dtl]の[dt_p.end_dt]を[columnWrk7Dtl_end_dt]としてエイリアス定義。
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_ext_sys_nm = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_del_ts = null;
	// [Wrk7DtlBtn]ブロック関連のField定義
	public MCPanel Wrk7DtlBtnPanel = null;
	// [Wrk7DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Wrk7DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Wrk7DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Wrk7DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Wrk7DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Wrk7DtlBtn_rcopy = null;
	// [Wrk5]ブロック関連のField定義
	public MCPanel Wrk5Panel = null;
	// [Wrk5]ブロックの項目のField定義
	// [Wrk5Dtl]ブロック関連のField定義
	public MCPanel Wrk5DtlPanel = null;
	public MCScrollPane Wrk5DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0560.Wrk5DtlR> Wrk5DtlTable = null;
	// [Wrk5Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_del_flg = null;
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_rcst_cd = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_cur_nm = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_amt_dec_place = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Wrk5Dtl_min_amt_p_PPanel;
	public MCColumnConfig columnWrk5Dtl_min_amt;// [Wrk5Dtl]の[min_amt_p.amt]を[columnWrk5Dtl_min_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Wrk5Dtl_max_amt_p_PPanel;
	public MCColumnConfig columnWrk5Dtl_max_amt;// [Wrk5Dtl]の[max_amt_p.amt]を[columnWrk5Dtl_max_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Wrk5Dtl_com_paid_p_PPanel;
	public MCColumnConfig columnWrk5Dtl_com_paid;// [Wrk5Dtl]の[com_paid_p.amt]を[columnWrk5Dtl_com_paid]としてエイリアス定義。
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_del_ts = null;
	// [Wrk5DtlBtn]ブロック関連のField定義
	public MCPanel Wrk5DtlBtnPanel = null;
	// [Wrk5DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Wrk5DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Wrk5DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Wrk5DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Wrk5DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Wrk5DtlBtn_rcopy = null;
	// [Wrk6]ブロック関連のField定義
	public MCPanel Wrk6Panel = null;
	// [Wrk6]ブロックの項目のField定義
	// [Wrk6Hdr]ブロック関連のField定義
	public MCPanel Wrk6HdrPanel = null;
	// [Wrk6Hdr]ブロックの項目のField定義
	public MCLabel Wrk6Hdr_st_dt_Label = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDateField Wrk6Hdr_st_dt = null;
	public MCLabel Wrk6Hdr_end_dt_Label = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDateField Wrk6Hdr_end_dt = null;
	/**
	 * Applied date update 適用日反映.<p>
	 *
	 */
	public MCButton Wrk6Hdr_set_dt = null;
	// [Wrk6Dtl]ブロック関連のField定義
	public MCPanel Wrk6DtlPanel = null;
	public MCScrollPane Wrk6DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0560.Wrk6DtlR> Wrk6DtlTable = null;
	// [Wrk6Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_del_flg = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_bp_cd = null;
	/**
	 * Without BP 取引先無し.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_bp_cd_null_flg = null;
	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_if_proc_typ = null;
	/**
	 * IF process type name ＩＦ処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_if_proc_typ_nm = null;
	/**
	 * AR settlement type 債権決済区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_ar_sttl_typ = null;
	/**
	 * AR settlement type name 債権決済区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_ar_sttl_typ_nm = null;
	/**
	 * Bank cd. 銀行ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_bank_cd = null;
	/**
	 * Bank name 銀行名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_bank_nm = null;
	/**
	 * Bank account cd. 口座ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_bank_ac_cd = null;
	/**
	 * Bank account name 口座名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_bank_ac_nm = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Wrk6Dtl_dt_p_PPanel;
	public MCColumnConfig columnWrk6Dtl_st_dt_key;// [Wrk6Dtl]の[dt_p.st_dt_key]を[columnWrk6Dtl_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnWrk6Dtl_st_dt;// [Wrk6Dtl]の[dt_p.st_dt]を[columnWrk6Dtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnWrk6Dtl_end_dt;// [Wrk6Dtl]の[dt_p.end_dt]を[columnWrk6Dtl_end_dt]としてエイリアス定義。
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_del_ts = null;
	// [Wrk6DtlBtn]ブロック関連のField定義
	public MCPanel Wrk6DtlBtnPanel = null;
	// [Wrk6DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Wrk6DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Wrk6DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Wrk6DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Wrk6DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Wrk6DtlBtn_rcopy = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * BP master entry 取引先マスタ登録.<p>
	 *
	 */
	public MCButton Btn_open_MABCP0510 = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	// [HdrAll]ブロック関連のField定義
	public MCPanel HdrAllPanel = null;
	public MCScrollPane HdrAllScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0560.HdrAllR> HdrAllTable = null;
	// [HdrAll]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_check = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bp_nm = null;
	/**
	 * Billing customer 請求先.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bcst_flg = null;
	/**
	 * Payer 入金先.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_rcst_flg = null;
	/**
	 * Payer cd. 入金先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_rcst_cd = null;
	/**
	 * Payer name 入金先名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_rcst_nm = null;
	/**
	 * AR credit managed BP cd. 債権与信管理先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_ar_cred_cd = null;
	/**
	 * AR credit managed BP name 債権与信管理先名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_ar_cred_nm = null;
	/**
	 * Billing dept. type 請求部門区分.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_dpt_typ = null;
	/**
	 * Billing dept. type name 請求部門区分名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_dpt_typ_nm = null;
	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bcst_dpt_cd = null;
	/**
	 * Billing customer dept. in charge name 請求先担当部門名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bcst_dpt_nm = null;
	/**
	 * Billing customer dept. in charge cd. 請求先担当部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_check_bcst_dpt_cd = null;
	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_cl_typ = null;
	/**
	 * Billing closing type name 請求締処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_cl_typ_nm = null;
	/**
	 * Billing closing day 1 請求締日１.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_cl_day1 = null;
	/**
	 * Billing closing day 2 請求締日２.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_cl_day2 = null;
	/**
	 * Billing closing day 3 請求締日３.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_cl_day3 = null;
	/**
	 * Billing closing day 4 請求締日４.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_cl_day4 = null;
	/**
	 * Billing closing day 5 請求締日５.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_cl_day5 = null;
	/**
	 * Billing tax calculation 請求税計算.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_tax_on_bill_flg = null;
	/**
	 * Billing tax rounding type 請求税額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_tax_rnd_typ = null;
	/**
	 * Billing tax rounding type 請求税額端数処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_tax_rnd_typ_nm = null;
	/**
	 * Delayed days (Billing closing day) 請求締遅延日数.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_cl_delay_days = null;
	/**
	 * Billing closing before/after type 請求締前後区分.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_cl_ba_typ = null;
	/**
	 * Before/after billing closing type name 請求締前後区分名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_cl_ba_typ_nm = null;
	/**
	 * Billing customer calendar cd. 請求先カレンダＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_cal_cd = null;
	/**
	 * Billing customer calendar name 請求先カレンダ名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_cal_nm = null;
	/**
	 * Payment receipt schedule before/after type 入金予定前後区分.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_rcv_ba_typ = null;
	/**
	 * Payment receipt schedule before/after type name 入金予定前後区分名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_rcv_ba_typ_nm = null;
	/**
	 * Details auto-reconciliation 自動明細消込.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_auto_line_appl_flg = null;
	/**
	 * Sales temporary unit price closing 売上仮単価締.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_sls_interim_cl_flg = null;
	/**
	 * AR offset group cd. 債権相殺グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_ar_setoff_grp_cd = null;
	/**
	 * AR offset group name 債権相殺グループ名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_ar_setoff_grp_nm = null;
	/**
	 * Report issue type (Billing customer) 帳票発行区分（請求先）.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bcst_prnt_typ = null;
	/**
	 * Report issue type name (Billing customer) 帳票発行区分名（請求先）.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bcst_prnt_typ_nm = null;
	/**
	 * Invoice send-to zip code 請求書送付郵便番号.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_zip_cd = null;
	/**
	 * Invoice send-to address 1 請求書送付住所１.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_addr1 = null;
	/**
	 * Invoice send-to address 2 請求書送付住所２.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_addr2 = null;
	/**
	 * Invoice send-to address 3 請求書送付住所３.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_addr3 = null;
	/**
	 * Invoice send-to address 4 請求書送付住所４.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_addr4 = null;
	/**
	 * Invoice send-to TEL 請求書送付ＴＥＬ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_tel = null;
	/**
	 * Invoice destination 請求書宛先.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_bcst_nm = null;
	/**
	 * Invoice send-to dept. 請求書送付部署.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_bcst_dpt = null;
	/**
	 * Invoice send-to PIC 請求書送付担当者.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_bcst_psn = null;
	/**
	 * Invoice send-to PIC honorific 請求書送付担当者敬称.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_bcst_psn_title = null;
	/**
	 * Invoice issue type 請求書発行区分.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_prnt_typ = null;
	/**
	 * Invoice issue type name 請求書発行区分名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_prnt_typ_nm = null;
	/**
	 * Sales details output type 売上明細書出力区分.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_sls_dtl_outp_typ = null;
	/**
	 * Sales details output type name 売上明細書出力区分名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_sls_dtl_outp_typ_nm = null;
	/**
	 * Output invoice details 請求書明細出力.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_dtl_outp_flg = null;
	/**
	 * Display balance of previous month on invoice 請求書前月残高表示.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bfw_bal_disp_flg = null;
	/**
	 * Display advance received on invoice 請求書前受金表示.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_dtl_adv_flg = null;
	/**
	 * Display payment receipt schedule in invoice 請求書入金予定表示.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_dtl_rcv_flg = null;
	/**
	 * Invoice details subtotal type 請求書明細小計区分.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_dtl_subttl_typ = null;
	/**
	 * Invoice details subtotal type name 請求書明細小計区分名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_dtl_subttl_typ_nm = null;
	/**
	 * Invoice details page break type 請求書明細改頁区分.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_dtl_brk_typ = null;
	/**
	 * Invoice details page break type name 請求書明細改頁区分名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_dtl_brk_typ_nm = null;
	/**
	 * Invoice details sorting order type 請求書明細並順区分.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_dtl_sort_typ = null;
	/**
	 * Invoice details sort order type name 請求書明細並順区分名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_dtl_sort_typ_nm = null;
	/**
	 * Invoice cancel slip display type 請求書取消伝票表示区分.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_can_slip_typ = null;
	/**
	 * Invoice cancel slip display type name 請求書取消伝票表示区分名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bill_can_slip_typ_nm = null;
	/**
	 * For auto-reconciliation 入金自動消込対象.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_rcv_auto_appl_tgt_flg = null;
	/**
	 * Match amount 金額考慮.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_rcv_amt_match_flg = null;
	/**
	 * Include payment option 金種考慮.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_ar_sttl_typ_match_flg = null;
	/**
	 * Fee calculation 手数料計算.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_calc_com_paid_flg = null;
	/**
	 * Delayed days (Auto-reconciliation base date) 自動消込基準日遅延日数.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_auto_appl_delay_days = null;
	/**
	 * Payment person name 振込人名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_xfr_psn = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_del_ts = null;
	/**
	 * Report issue type (Payer) 帳票発行区分（入金先）.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_rcst_prnt_typ = null;
	/**
	 * Report issue type name (Payer) 帳票発行区分名（入金先）.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_rcst_prnt_typ_nm = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, UPD, FIX, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABCL0560_Srch01]のCallerの作成 */
	protected MABCP_BcstRcstReg_MC.MA_MABCL0560_Srch01Caller createMA_MABCL0560_Srch01() {
		MABCP_BcstRcstReg_MC.MA_MABCL0560_Srch01Caller<MABCP_BcstRcstReg, MA_MABCL0560_Srch01Bridge>
		caller = ((MABCP_BcstRcstReg_MC)this).new MA_MABCL0560_Srch01Caller<MABCP_BcstRcstReg, MA_MABCL0560_Srch01Bridge>(
					(MABCP_BcstRcstReg)this, new MA_MABCL0560_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0560_Srch01]の呼び出し */
	protected void callMA_MABCL0560_Srch01() {
		MCCaller caller = createMA_MABCL0560_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0560_Upd01]のCallerの作成 */
	protected MABCP_BcstRcstReg_MC.MA_MABCL0560_Upd01Caller createMA_MABCL0560_Upd01() {
		MABCP_BcstRcstReg_MC.MA_MABCL0560_Upd01Caller<MABCP_BcstRcstReg, MA_MABCL0560_Upd01Bridge>
		caller = ((MABCP_BcstRcstReg_MC)this).new MA_MABCL0560_Upd01Caller<MABCP_BcstRcstReg, MA_MABCL0560_Upd01Bridge>(
					(MABCP_BcstRcstReg)this, new MA_MABCL0560_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0560_Upd01]の呼び出し */
	protected void callMA_MABCL0560_Upd01() {
		MCCaller caller = createMA_MABCL0560_Upd01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0560.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0560.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0560.HdrR aHdrR;
	/** [Wrk4Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0560.Wrk4HdrR aWrk4HdrR;
	/** [Wrk4Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0560.Wrk4DtlR> aWrk4DtlL;
	/** [Wrk7Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0560.Wrk7HdrR aWrk7HdrR;
	/** [Wrk7Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0560.Wrk7DtlR> aWrk7DtlL;
	/** [Wrk5Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0560.Wrk5DtlR> aWrk5DtlL;
	/** [Wrk6Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0560.Wrk6HdrR aWrk6HdrR;
	/** [Wrk6Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0560.Wrk6DtlR> aWrk6DtlL;
	/** [HdrAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0560.HdrAllR> aHdrAllL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP0560.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0560.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0560.MstR createMstR() {
		return mcframe.clientMABC.MABCP0560.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0560.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0560.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0560.CndR createCndR() {
		return mcframe.clientMABC.MABCP0560.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMABC.MABCP0560.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABC.MABCP0560.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABC.MABCP0560.HdrR createHdrR() {
		return mcframe.clientMABC.MABCP0560.HdrR.create();
	}

	/**
	 * 項目コピーによってaWrk4HdrRを設定します。
	 *
	 * aWrk4HdrRのインスタンスは変更されません。
	 *
	 * @param row Wrk4HdrR
	 */
	public void setWrk4HdrR(mcframe.clientMABC.MABCP0560.Wrk4HdrR row) {
		if (row != null) {
			MCRow.copyall(getWrk4HdrR(), row);
		}
	}

	/**
	 * [Wrk4Hdr]ブロックのコンテナaWrk4HdrRを返します。
	 *
	 * @return Wrk4HdrR
	 */
	public mcframe.clientMABC.MABCP0560.Wrk4HdrR getWrk4HdrR() {
		return aWrk4HdrR;
	}

	/**
	 * aWrk4HdrRを作成します。
	 *
	 * @return Wrk4HdrR
	 */
	public mcframe.clientMABC.MABCP0560.Wrk4HdrR createWrk4HdrR() {
		return mcframe.clientMABC.MABCP0560.Wrk4HdrR.create();
	}

	/**
	 * コピーによってaWrk4DtlLを設定します。
	 *
	 * aWrk4DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk4DtlL
	 */
	public void setWrk4DtlL(MCList<mcframe.clientMABC.MABCP0560.Wrk4DtlR> aList) {
		if (getWrk4DtlL() != aList) {
			getWrk4DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk4Dtl]ブロックのコンテナaWrk4DtlLを返します。
	 *
	 * @return Wrk4DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0560.Wrk4DtlR> getWrk4DtlL() {
		return aWrk4DtlL;
	}

	/**
	 * aWrk4DtlRを作成します。
	 *
	 * @return Wrk4DtlR
	 */
	public mcframe.clientMABC.MABCP0560.Wrk4DtlR createWrk4DtlR() {
		return mcframe.clientMABC.MABCP0560.Wrk4DtlR.create();
	}

	/**
	 * aWrk4DtlLを作成します。
	 *
	 * @return Wrk4DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0560.Wrk4DtlR> createWrk4DtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0560.Wrk4DtlR.class);
	}

	/**
	 * Wrk4DtlTableを初期化します。
	 */
	protected void createWrk4DtlTable(){
		if(Wrk4DtlTable == null){
			Wrk4DtlTable = beansFactory.createTable2("Wrk4Dtl.table");
		}
	}

	/**
	 * 項目コピーによってaWrk7HdrRを設定します。
	 *
	 * aWrk7HdrRのインスタンスは変更されません。
	 *
	 * @param row Wrk7HdrR
	 */
	public void setWrk7HdrR(mcframe.clientMABC.MABCP0560.Wrk7HdrR row) {
		if (row != null) {
			MCRow.copyall(getWrk7HdrR(), row);
		}
	}

	/**
	 * [Wrk7Hdr]ブロックのコンテナaWrk7HdrRを返します。
	 *
	 * @return Wrk7HdrR
	 */
	public mcframe.clientMABC.MABCP0560.Wrk7HdrR getWrk7HdrR() {
		return aWrk7HdrR;
	}

	/**
	 * aWrk7HdrRを作成します。
	 *
	 * @return Wrk7HdrR
	 */
	public mcframe.clientMABC.MABCP0560.Wrk7HdrR createWrk7HdrR() {
		return mcframe.clientMABC.MABCP0560.Wrk7HdrR.create();
	}

	/**
	 * コピーによってaWrk7DtlLを設定します。
	 *
	 * aWrk7DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk7DtlL
	 */
	public void setWrk7DtlL(MCList<mcframe.clientMABC.MABCP0560.Wrk7DtlR> aList) {
		if (getWrk7DtlL() != aList) {
			getWrk7DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk7Dtl]ブロックのコンテナaWrk7DtlLを返します。
	 *
	 * @return Wrk7DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0560.Wrk7DtlR> getWrk7DtlL() {
		return aWrk7DtlL;
	}

	/**
	 * aWrk7DtlRを作成します。
	 *
	 * @return Wrk7DtlR
	 */
	public mcframe.clientMABC.MABCP0560.Wrk7DtlR createWrk7DtlR() {
		return mcframe.clientMABC.MABCP0560.Wrk7DtlR.create();
	}

	/**
	 * aWrk7DtlLを作成します。
	 *
	 * @return Wrk7DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0560.Wrk7DtlR> createWrk7DtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0560.Wrk7DtlR.class);
	}

	/**
	 * Wrk7DtlTableを初期化します。
	 */
	protected void createWrk7DtlTable(){
		if(Wrk7DtlTable == null){
			Wrk7DtlTable = beansFactory.createTable2("Wrk7Dtl.table");
		}
	}

	/**
	 * コピーによってaWrk5DtlLを設定します。
	 *
	 * aWrk5DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk5DtlL
	 */
	public void setWrk5DtlL(MCList<mcframe.clientMABC.MABCP0560.Wrk5DtlR> aList) {
		if (getWrk5DtlL() != aList) {
			getWrk5DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk5Dtl]ブロックのコンテナaWrk5DtlLを返します。
	 *
	 * @return Wrk5DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0560.Wrk5DtlR> getWrk5DtlL() {
		return aWrk5DtlL;
	}

	/**
	 * aWrk5DtlRを作成します。
	 *
	 * @return Wrk5DtlR
	 */
	public mcframe.clientMABC.MABCP0560.Wrk5DtlR createWrk5DtlR() {
		return mcframe.clientMABC.MABCP0560.Wrk5DtlR.create();
	}

	/**
	 * aWrk5DtlLを作成します。
	 *
	 * @return Wrk5DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0560.Wrk5DtlR> createWrk5DtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0560.Wrk5DtlR.class);
	}

	/**
	 * Wrk5DtlTableを初期化します。
	 */
	protected void createWrk5DtlTable(){
		if(Wrk5DtlTable == null){
			Wrk5DtlTable = beansFactory.createTable2("Wrk5Dtl.table");
		}
	}

	/**
	 * 項目コピーによってaWrk6HdrRを設定します。
	 *
	 * aWrk6HdrRのインスタンスは変更されません。
	 *
	 * @param row Wrk6HdrR
	 */
	public void setWrk6HdrR(mcframe.clientMABC.MABCP0560.Wrk6HdrR row) {
		if (row != null) {
			MCRow.copyall(getWrk6HdrR(), row);
		}
	}

	/**
	 * [Wrk6Hdr]ブロックのコンテナaWrk6HdrRを返します。
	 *
	 * @return Wrk6HdrR
	 */
	public mcframe.clientMABC.MABCP0560.Wrk6HdrR getWrk6HdrR() {
		return aWrk6HdrR;
	}

	/**
	 * aWrk6HdrRを作成します。
	 *
	 * @return Wrk6HdrR
	 */
	public mcframe.clientMABC.MABCP0560.Wrk6HdrR createWrk6HdrR() {
		return mcframe.clientMABC.MABCP0560.Wrk6HdrR.create();
	}

	/**
	 * コピーによってaWrk6DtlLを設定します。
	 *
	 * aWrk6DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk6DtlL
	 */
	public void setWrk6DtlL(MCList<mcframe.clientMABC.MABCP0560.Wrk6DtlR> aList) {
		if (getWrk6DtlL() != aList) {
			getWrk6DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk6Dtl]ブロックのコンテナaWrk6DtlLを返します。
	 *
	 * @return Wrk6DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0560.Wrk6DtlR> getWrk6DtlL() {
		return aWrk6DtlL;
	}

	/**
	 * aWrk6DtlRを作成します。
	 *
	 * @return Wrk6DtlR
	 */
	public mcframe.clientMABC.MABCP0560.Wrk6DtlR createWrk6DtlR() {
		return mcframe.clientMABC.MABCP0560.Wrk6DtlR.create();
	}

	/**
	 * aWrk6DtlLを作成します。
	 *
	 * @return Wrk6DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0560.Wrk6DtlR> createWrk6DtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0560.Wrk6DtlR.class);
	}

	/**
	 * Wrk6DtlTableを初期化します。
	 */
	protected void createWrk6DtlTable(){
		if(Wrk6DtlTable == null){
			Wrk6DtlTable = beansFactory.createTable2("Wrk6Dtl.table");
		}
	}

	/**
	 * コピーによってaHdrAllLを設定します。
	 *
	 * aHdrAllLのインスタンスは変更されません。
	 *
	 * @param dataset HdrAllL
	 */
	public void setHdrAllL(MCList<mcframe.clientMABC.MABCP0560.HdrAllR> aList) {
		if (getHdrAllL() != aList) {
			getHdrAllL().setAll(aList);
		}
	}

	/**
	 * [HdrAll]ブロックのコンテナaHdrAllLを返します。
	 *
	 * @return HdrAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0560.HdrAllR> getHdrAllL() {
		return aHdrAllL;
	}

	/**
	 * aHdrAllRを作成します。
	 *
	 * @return HdrAllR
	 */
	public mcframe.clientMABC.MABCP0560.HdrAllR createHdrAllR() {
		return mcframe.clientMABC.MABCP0560.HdrAllR.create();
	}

	/**
	 * aHdrAllLを作成します。
	 *
	 * @return HdrAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0560.HdrAllR> createHdrAllL() {
		return MCList.create(mcframe.clientMABC.MABCP0560.HdrAllR.class);
	}

	/**
	 * HdrAllTableを初期化します。
	 */
	protected void createHdrAllTable(){
		if(HdrAllTable == null){
			HdrAllTable = beansFactory.createTable2("HdrAll.table");
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
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getWrk4HdrR())) ret.add(getWrk4HdrR());
		if(!MCCollectionUtil.contains(ret, getWrk4DtlL())) ret.add(getWrk4DtlL());
		if(!MCCollectionUtil.contains(ret, getWrk7HdrR())) ret.add(getWrk7HdrR());
		if(!MCCollectionUtil.contains(ret, getWrk7DtlL())) ret.add(getWrk7DtlL());
		if(!MCCollectionUtil.contains(ret, getWrk5DtlL())) ret.add(getWrk5DtlL());
		if(!MCCollectionUtil.contains(ret, getWrk6HdrR())) ret.add(getWrk6HdrR());
		if(!MCCollectionUtil.contains(ret, getWrk6DtlL())) ret.add(getWrk6DtlL());
		if(!MCCollectionUtil.contains(ret, getHdrAllL())) ret.add(getHdrAllL());
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
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getWrk4HdrR()) return "Wrk4Hdr";
		if(aCnt == getWrk4DtlL()) return "Wrk4Dtl";
		if(aCnt == getWrk7HdrR()) return "Wrk7Hdr";
		if(aCnt == getWrk7DtlL()) return "Wrk7Dtl";
		if(aCnt == getWrk5DtlL()) return "Wrk5Dtl";
		if(aCnt == getWrk6HdrR()) return "Wrk6Hdr";
		if(aCnt == getWrk6DtlL()) return "Wrk6Dtl";
		if(aCnt == getHdrAllL()) return "HdrAll";
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
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("Wrk4Hdr")) return getWrk4HdrR();
		if(bId.equals("Wrk4Dtl")) return getWrk4DtlL();
		if(bId.equals("Wrk7Hdr")) return getWrk7HdrR();
		if(bId.equals("Wrk7Dtl")) return getWrk7DtlL();
		if(bId.equals("Wrk5Dtl")) return getWrk5DtlL();
		if(bId.equals("Wrk6Hdr")) return getWrk6HdrR();
		if(bId.equals("Wrk6Dtl")) return getWrk6DtlL();
		if(bId.equals("HdrAll")) return getHdrAllL();
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
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(TblPanel);
		ret.add(HdrPanel);
		ret.add(DtlTabPanel);
		ret.add(Wrk1HdrPanel);
		ret.add(Wrk2HdrPanel);
		ret.add(Wrk3HdrPanel);
		ret.add(Wrk4Panel);
		ret.add(Wrk4HdrPanel);
		ret.add(Wrk4DtlPanel);
		ret.add(Wrk4DtlBtnPanel);
		ret.add(Wrk7Panel);
		ret.add(Wrk7HdrPanel);
		ret.add(Wrk7DtlPanel);
		ret.add(Wrk7DtlBtnPanel);
		ret.add(Wrk5Panel);
		ret.add(Wrk5DtlPanel);
		ret.add(Wrk5DtlBtnPanel);
		ret.add(Wrk6Panel);
		ret.add(Wrk6HdrPanel);
		ret.add(Wrk6DtlPanel);
		ret.add(Wrk6DtlBtnPanel);
		ret.add(BtnPanel);
		ret.add(HdrAllPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_BcstRcstReg_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aHdrR = createHdrR();
		aWrk4HdrR = createWrk4HdrR();
		aWrk4DtlL = createWrk4DtlL();
		aWrk7HdrR = createWrk7HdrR();
		aWrk7DtlL = createWrk7DtlL();
		aWrk5DtlL = createWrk5DtlL();
		aWrk6HdrR = createWrk6HdrR();
		aWrk6DtlL = createWrk6DtlL();
		aHdrAllL = createHdrAllL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_BcstRcstReg_MC_A(String name) {
		aMstR = createMstR();
		aCndR = createCndR();
		aHdrR = createHdrR();
		aWrk4HdrR = createWrk4HdrR();
		aWrk4DtlL = createWrk4DtlL();
		createWrk4DtlTable();
		Wrk4DtlTable.setRowName(name);
		aWrk7HdrR = createWrk7HdrR();
		aWrk7DtlL = createWrk7DtlL();
		createWrk7DtlTable();
		Wrk7DtlTable.setRowName(name);
		aWrk5DtlL = createWrk5DtlL();
		createWrk5DtlTable();
		Wrk5DtlTable.setRowName(name);
		aWrk6HdrR = createWrk6HdrR();
		aWrk6DtlL = createWrk6DtlL();
		createWrk6DtlTable();
		Wrk6DtlTable.setRowName(name);
		aHdrAllL = createHdrAllL();
		createHdrAllTable();
		HdrAllTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_BcstRcstReg_MC.jbCreateScreenOpe((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateMst((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateTop((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateFold((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateCnd((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateCtrl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateTbl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateHdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateDtlTab((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateWrk1Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateWrk2Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateWrk3Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateWrk4((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateWrk4Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateWrk4Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateWrk4DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateWrk7((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateWrk7Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateWrk7Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateWrk7DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateWrk5((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateWrk5Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateWrk5DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateWrk6((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateWrk6Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateWrk6Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateWrk6DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbCreateHdrAll((MABCP_BcstRcstReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_BcstRcstReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_BcstRcstReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_BcstRcstReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_BcstRcstReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_BcstRcstReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_BcstRcstReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Tbl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTbl(MABCP_BcstRcstReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MABCP_BcstRcstReg p) {
	}

	/**
	 * [DtlTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlTab(MABCP_BcstRcstReg p) {
	}

	/**
	 * [Wrk1Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk1Hdr(MABCP_BcstRcstReg p) {
	}

	/**
	 * [Wrk2Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk2Hdr(MABCP_BcstRcstReg p) {
	}

	/**
	 * [Wrk3Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk3Hdr(MABCP_BcstRcstReg p) {
	}

	/**
	 * [Wrk4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk4(MABCP_BcstRcstReg p) {
	}

	/**
	 * [Wrk4Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk4Hdr(MABCP_BcstRcstReg p) {
	}

	/**
	 * [Wrk4Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk4Dtl(MABCP_BcstRcstReg p) {
		p.Wrk4Dtl_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMABC.MABCP0560.Wrk4DtlR.$amt_p);
		p.Wrk4Dtl_amt_p_PPanel.setName("Wrk4Dtl.amt_p");
		p.columnWrk4Dtl_min_amt = p.Wrk4Dtl_amt_p_PPanel.columnAmt_amt;
		p.columnWrk4Dtl_min_amt.addAliasName("Wrk4Dtl.min_amt", p);
	}

	/**
	 * [Wrk4DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk4DtlBtn(MABCP_BcstRcstReg p) {
	}

	/**
	 * [Wrk7]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk7(MABCP_BcstRcstReg p) {
	}

	/**
	 * [Wrk7Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk7Hdr(MABCP_BcstRcstReg p) {
	}

	/**
	 * [Wrk7Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk7Dtl(MABCP_BcstRcstReg p) {
		p.Wrk7Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABC.MABCP0560.Wrk7DtlR.$dt_p);
		p.Wrk7Dtl_dt_p_PPanel.setName("Wrk7Dtl.dt_p");
		p.columnWrk7Dtl_st_dt_key = p.Wrk7Dtl_dt_p_PPanel.columnDt_st_dt_key;
		p.columnWrk7Dtl_st_dt_key.addAliasName("Wrk7Dtl.st_dt_key", p);
		p.columnWrk7Dtl_st_dt = p.Wrk7Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnWrk7Dtl_st_dt.addAliasName("Wrk7Dtl.st_dt", p);
		p.columnWrk7Dtl_end_dt = p.Wrk7Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnWrk7Dtl_end_dt.addAliasName("Wrk7Dtl.end_dt", p);
	}

	/**
	 * [Wrk7DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk7DtlBtn(MABCP_BcstRcstReg p) {
	}

	/**
	 * [Wrk5]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk5(MABCP_BcstRcstReg p) {
	}

	/**
	 * [Wrk5Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk5Dtl(MABCP_BcstRcstReg p) {
		p.Wrk5Dtl_min_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMABC.MABCP0560.Wrk5DtlR.$min_amt_p);
		p.Wrk5Dtl_min_amt_p_PPanel.setName("Wrk5Dtl.min_amt_p");
		p.columnWrk5Dtl_min_amt = p.Wrk5Dtl_min_amt_p_PPanel.columnAmt_amt;
		p.columnWrk5Dtl_min_amt.addAliasName("Wrk5Dtl.min_amt", p);
		p.Wrk5Dtl_max_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMABC.MABCP0560.Wrk5DtlR.$max_amt_p);
		p.Wrk5Dtl_max_amt_p_PPanel.setName("Wrk5Dtl.max_amt_p");
		p.columnWrk5Dtl_max_amt = p.Wrk5Dtl_max_amt_p_PPanel.columnAmt_amt;
		p.columnWrk5Dtl_max_amt.addAliasName("Wrk5Dtl.max_amt", p);
		p.Wrk5Dtl_com_paid_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMABC.MABCP0560.Wrk5DtlR.$com_paid_p);
		p.Wrk5Dtl_com_paid_p_PPanel.setName("Wrk5Dtl.com_paid_p");
		p.columnWrk5Dtl_com_paid = p.Wrk5Dtl_com_paid_p_PPanel.columnAmt_amt;
		p.columnWrk5Dtl_com_paid.addAliasName("Wrk5Dtl.com_paid", p);
	}

	/**
	 * [Wrk5DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk5DtlBtn(MABCP_BcstRcstReg p) {
	}

	/**
	 * [Wrk6]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk6(MABCP_BcstRcstReg p) {
	}

	/**
	 * [Wrk6Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk6Hdr(MABCP_BcstRcstReg p) {
	}

	/**
	 * [Wrk6Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk6Dtl(MABCP_BcstRcstReg p) {
		p.Wrk6Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABC.MABCP0560.Wrk6DtlR.$dt_p);
		p.Wrk6Dtl_dt_p_PPanel.setName("Wrk6Dtl.dt_p");
		p.columnWrk6Dtl_st_dt_key = p.Wrk6Dtl_dt_p_PPanel.columnDt_st_dt_key;
		p.columnWrk6Dtl_st_dt_key.addAliasName("Wrk6Dtl.st_dt_key", p);
		p.columnWrk6Dtl_st_dt = p.Wrk6Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnWrk6Dtl_st_dt.addAliasName("Wrk6Dtl.st_dt", p);
		p.columnWrk6Dtl_end_dt = p.Wrk6Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnWrk6Dtl_end_dt.addAliasName("Wrk6Dtl.end_dt", p);
	}

	/**
	 * [Wrk6DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk6DtlBtn(MABCP_BcstRcstReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_BcstRcstReg p) {
	}

	/**
	 * [HdrAll]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrAll(MABCP_BcstRcstReg p) {
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
	
	
	/** [Hdr_rcst_cd_ListPutter]の定義 */
	private MCListPutter Hdr_rcst_cd_p = null;

	/**
	 * [Hdr_rcst_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_rcst_cd_ListPutter() {
		if (Hdr_rcst_cd_p == null) {
			Hdr_rcst_cd_p = createHdr_rcst_cd_ListPutter(Hdr_rcst_cd, "rcst_cd", "rcst_nm");

		}
		return Hdr_rcst_cd_p;
	}
	
	
	/** [Hdr_ar_cred_cd_ListPutter]の定義 */
	private MCListPutter Hdr_ar_cred_cd_p = null;

	/**
	 * [Hdr_ar_cred_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_ar_cred_cd_ListPutter() {
		if (Hdr_ar_cred_cd_p == null) {
			Hdr_ar_cred_cd_p = createHdr_ar_cred_cd_ListPutter(Hdr_ar_cred_cd, "ar_cred_cd", "ar_cred_nm");

		}
		return Hdr_ar_cred_cd_p;
	}
	
	
	/** [Hdr_bill_dpt_typ_ListPutter]の定義 */
	private MCListPutter Hdr_bill_dpt_typ_p = null;

	/**
	 * [Hdr_bill_dpt_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_bill_dpt_typ_ListPutter() {
		if (Hdr_bill_dpt_typ_p == null) {
			Hdr_bill_dpt_typ_p = createHdr_bill_dpt_typ_ListPutter(Hdr_bill_dpt_typ, "bill_dpt_typ", "bill_dpt_typ_nm");

		}
		return Hdr_bill_dpt_typ_p;
	}
	
	
	/** [Hdr_bcst_dpt_cd_ListPutter]の定義 */
	private MCListPutter Hdr_bcst_dpt_cd_p = null;

	/**
	 * [Hdr_bcst_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_bcst_dpt_cd_ListPutter() {
		if (Hdr_bcst_dpt_cd_p == null) {
			Hdr_bcst_dpt_cd_p = createHdr_bcst_dpt_cd_ListPutter(Hdr_bcst_dpt_cd, "bcst_dpt_cd", "bcst_dpt_nm");

		}
		return Hdr_bcst_dpt_cd_p;
	}
	
	
	/** [Hdr_bill_cl_typ_ListPutter]の定義 */
	private MCListPutter Hdr_bill_cl_typ_p = null;

	/**
	 * [Hdr_bill_cl_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_bill_cl_typ_ListPutter() {
		if (Hdr_bill_cl_typ_p == null) {
			Hdr_bill_cl_typ_p = createHdr_bill_cl_typ_ListPutter(Hdr_bill_cl_typ, "bill_cl_typ", "bill_cl_typ_nm");

		}
		return Hdr_bill_cl_typ_p;
	}
	
	
	/** [Hdr_bill_tax_rnd_typ_ListPutter]の定義 */
	private MCListPutter Hdr_bill_tax_rnd_typ_p = null;

	/**
	 * [Hdr_bill_tax_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_bill_tax_rnd_typ_ListPutter() {
		if (Hdr_bill_tax_rnd_typ_p == null) {
			Hdr_bill_tax_rnd_typ_p = createHdr_bill_tax_rnd_typ_ListPutter(Hdr_bill_tax_rnd_typ, "bill_tax_rnd_typ", "bill_tax_rnd_typ_nm");

		}
		return Hdr_bill_tax_rnd_typ_p;
	}
	
	
	/** [Hdr_bill_cl_ba_typ_ListPutter]の定義 */
	private MCListPutter Hdr_bill_cl_ba_typ_p = null;

	/**
	 * [Hdr_bill_cl_ba_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_bill_cl_ba_typ_ListPutter() {
		if (Hdr_bill_cl_ba_typ_p == null) {
			Hdr_bill_cl_ba_typ_p = createHdr_bill_cl_ba_typ_ListPutter(Hdr_bill_cl_ba_typ, "bill_cl_ba_typ", "bill_cl_ba_typ_nm");

		}
		return Hdr_bill_cl_ba_typ_p;
	}
	
	
	/** [Hdr_bill_cal_cd_ListPutter]の定義 */
	private MCListPutter Hdr_bill_cal_cd_p = null;

	/**
	 * [Hdr_bill_cal_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_bill_cal_cd_ListPutter() {
		if (Hdr_bill_cal_cd_p == null) {
			Hdr_bill_cal_cd_p = createHdr_bill_cal_cd_ListPutter(Hdr_bill_cal_cd, "bill_cal_cd", "bill_cal_nm");

		}
		return Hdr_bill_cal_cd_p;
	}
	
	
	/** [Hdr_rcv_ba_typ_ListPutter]の定義 */
	private MCListPutter Hdr_rcv_ba_typ_p = null;

	/**
	 * [Hdr_rcv_ba_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_rcv_ba_typ_ListPutter() {
		if (Hdr_rcv_ba_typ_p == null) {
			Hdr_rcv_ba_typ_p = createHdr_rcv_ba_typ_ListPutter(Hdr_rcv_ba_typ, "rcv_ba_typ", "rcv_ba_typ_nm");

		}
		return Hdr_rcv_ba_typ_p;
	}
	
	
	/** [Hdr_ar_setoff_grp_cd_ListPutter]の定義 */
	private MCListPutter Hdr_ar_setoff_grp_cd_p = null;

	/**
	 * [Hdr_ar_setoff_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_ar_setoff_grp_cd_ListPutter() {
		if (Hdr_ar_setoff_grp_cd_p == null) {
			Hdr_ar_setoff_grp_cd_p = createHdr_ar_setoff_grp_cd_ListPutter(Hdr_ar_setoff_grp_cd, "ar_setoff_grp_cd", "ar_setoff_grp_nm");

		}
		return Hdr_ar_setoff_grp_cd_p;
	}
	
	
	/** [Hdr_bcst_prnt_typ_ListPutter]の定義 */
	private MCListPutter Hdr_bcst_prnt_typ_p = null;

	/**
	 * [Hdr_bcst_prnt_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_bcst_prnt_typ_ListPutter() {
		if (Hdr_bcst_prnt_typ_p == null) {
			Hdr_bcst_prnt_typ_p = createHdr_bcst_prnt_typ_ListPutter(Hdr_bcst_prnt_typ, "bcst_prnt_typ", "bcst_prnt_typ_nm");

		}
		return Hdr_bcst_prnt_typ_p;
	}
	
	
	/** [Hdr_bill_prnt_typ_ListPutter]の定義 */
	private MCListPutter Hdr_bill_prnt_typ_p = null;

	/**
	 * [Hdr_bill_prnt_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_bill_prnt_typ_ListPutter() {
		if (Hdr_bill_prnt_typ_p == null) {
			Hdr_bill_prnt_typ_p = createHdr_bill_prnt_typ_ListPutter(Hdr_bill_prnt_typ, "bill_prnt_typ", "bill_prnt_typ_nm");

		}
		return Hdr_bill_prnt_typ_p;
	}
	
	
	/** [Hdr_sls_dtl_outp_typ_ListPutter]の定義 */
	private MCListPutter Hdr_sls_dtl_outp_typ_p = null;

	/**
	 * [Hdr_sls_dtl_outp_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_sls_dtl_outp_typ_ListPutter() {
		if (Hdr_sls_dtl_outp_typ_p == null) {
			Hdr_sls_dtl_outp_typ_p = createHdr_sls_dtl_outp_typ_ListPutter(Hdr_sls_dtl_outp_typ, "sls_dtl_outp_typ", "sls_dtl_outp_typ_nm");

		}
		return Hdr_sls_dtl_outp_typ_p;
	}
	
	
	/** [Hdr_bill_dtl_subttl_typ_ListPutter]の定義 */
	private MCListPutter Hdr_bill_dtl_subttl_typ_p = null;

	/**
	 * [Hdr_bill_dtl_subttl_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_bill_dtl_subttl_typ_ListPutter() {
		if (Hdr_bill_dtl_subttl_typ_p == null) {
			Hdr_bill_dtl_subttl_typ_p = createHdr_bill_dtl_subttl_typ_ListPutter(Hdr_bill_dtl_subttl_typ, "bill_dtl_subttl_typ", "bill_dtl_subttl_typ_nm");

		}
		return Hdr_bill_dtl_subttl_typ_p;
	}
	
	
	/** [Hdr_bill_dtl_brk_typ_ListPutter]の定義 */
	private MCListPutter Hdr_bill_dtl_brk_typ_p = null;

	/**
	 * [Hdr_bill_dtl_brk_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_bill_dtl_brk_typ_ListPutter() {
		if (Hdr_bill_dtl_brk_typ_p == null) {
			Hdr_bill_dtl_brk_typ_p = createHdr_bill_dtl_brk_typ_ListPutter(Hdr_bill_dtl_brk_typ, "bill_dtl_brk_typ", "bill_dtl_brk_typ_nm");

		}
		return Hdr_bill_dtl_brk_typ_p;
	}
	
	
	/** [Hdr_bill_dtl_sort_typ_ListPutter]の定義 */
	private MCListPutter Hdr_bill_dtl_sort_typ_p = null;

	/**
	 * [Hdr_bill_dtl_sort_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_bill_dtl_sort_typ_ListPutter() {
		if (Hdr_bill_dtl_sort_typ_p == null) {
			Hdr_bill_dtl_sort_typ_p = createHdr_bill_dtl_sort_typ_ListPutter(Hdr_bill_dtl_sort_typ, "bill_dtl_sort_typ", "bill_dtl_sort_typ_nm");

		}
		return Hdr_bill_dtl_sort_typ_p;
	}
	
	
	/** [Hdr_bill_can_slip_typ_ListPutter]の定義 */
	private MCListPutter Hdr_bill_can_slip_typ_p = null;

	/**
	 * [Hdr_bill_can_slip_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_bill_can_slip_typ_ListPutter() {
		if (Hdr_bill_can_slip_typ_p == null) {
			Hdr_bill_can_slip_typ_p = createHdr_bill_can_slip_typ_ListPutter(Hdr_bill_can_slip_typ, "bill_can_slip_typ", "bill_can_slip_typ_nm");

		}
		return Hdr_bill_can_slip_typ_p;
	}
	
	
	/** [Hdr_rcst_prnt_typ_ListPutter]の定義 */
	private MCListPutter Hdr_rcst_prnt_typ_p = null;

	/**
	 * [Hdr_rcst_prnt_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_rcst_prnt_typ_ListPutter() {
		if (Hdr_rcst_prnt_typ_p == null) {
			Hdr_rcst_prnt_typ_p = createHdr_rcst_prnt_typ_ListPutter(Hdr_rcst_prnt_typ, "rcst_prnt_typ", "rcst_prnt_typ_nm");

		}
		return Hdr_rcst_prnt_typ_p;
	}
	
	
	/** [Wrk4Dtl_cur_cd_ListPutter]の定義 */
	private MCListPutter Wrk4Dtl_cur_cd_p = null;

	/**
	 * [Wrk4Dtl_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk4Dtl_cur_cd_ListPutter() {
		if (Wrk4Dtl_cur_cd_p == null) {
			Wrk4Dtl_cur_cd_p = createWrk4Dtl_cur_cd_ListPutter(columnWrk4Dtl_cur_cd, "cur_cd", "cur_nm","amt_dec_place");

		}
		return Wrk4Dtl_cur_cd_p;
	}
	
	
	/** [Wrk4Dtl_sttl_cd_ListPutter]の定義 */
	private MCListPutter Wrk4Dtl_sttl_cd_p = null;

	/**
	 * [Wrk4Dtl_sttl_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk4Dtl_sttl_cd_ListPutter() {
		if (Wrk4Dtl_sttl_cd_p == null) {
			Wrk4Dtl_sttl_cd_p = createWrk4Dtl_sttl_cd_ListPutter(columnWrk4Dtl_sttl_cd, "sttl_cd", "sttl_nm");

		}
		return Wrk4Dtl_sttl_cd_p;
	}
	
	
	/** [Wrk4Dtl_wg_cd_ListPutter]の定義 */
	private MCListPutter Wrk4Dtl_wg_cd_p = null;

	/**
	 * [Wrk4Dtl_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk4Dtl_wg_cd_ListPutter() {
		if (Wrk4Dtl_wg_cd_p == null) {
			Wrk4Dtl_wg_cd_p = createWrk4Dtl_wg_cd_ListPutter(columnWrk4Dtl_wg_cd, "wg_cd", "wg_nm");

		}
		return Wrk4Dtl_wg_cd_p;
	}
	
	
	/** [Wrk4Dtl_crryovr_mons_typ_ListPutter]の定義 */
	private MCListPutter Wrk4Dtl_crryovr_mons_typ_p = null;

	/**
	 * [Wrk4Dtl_crryovr_mons_typ_ListPutter]の取得
	 */
	protected MCListPutter getWrk4Dtl_crryovr_mons_typ_ListPutter() {
		if (Wrk4Dtl_crryovr_mons_typ_p == null) {
			Wrk4Dtl_crryovr_mons_typ_p = createWrk4Dtl_crryovr_mons_typ_ListPutter(columnWrk4Dtl_crryovr_mons_typ, "crryovr_mons_typ", "crryovr_mons_typ_nm");

		}
		return Wrk4Dtl_crryovr_mons_typ_p;
	}
	
	
	/** [Wrk7Dtl_if_proc_typ_ListPutter]の定義 */
	private MCListPutter Wrk7Dtl_if_proc_typ_p = null;

	/**
	 * [Wrk7Dtl_if_proc_typ_ListPutter]の取得
	 */
	protected MCListPutter getWrk7Dtl_if_proc_typ_ListPutter() {
		if (Wrk7Dtl_if_proc_typ_p == null) {
			Wrk7Dtl_if_proc_typ_p = createWrk7Dtl_if_proc_typ_ListPutter(columnWrk7Dtl_if_proc_typ, "if_proc_typ", "if_proc_typ_nm");

		}
		return Wrk7Dtl_if_proc_typ_p;
	}
	
	
	/** [Wrk7Dtl_ext_sys_cd_ListPutter]の定義 */
	private MCListPutter Wrk7Dtl_ext_sys_cd_p = null;

	/**
	 * [Wrk7Dtl_ext_sys_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk7Dtl_ext_sys_cd_ListPutter() {
		if (Wrk7Dtl_ext_sys_cd_p == null) {
			Wrk7Dtl_ext_sys_cd_p = createWrk7Dtl_ext_sys_cd_ListPutter(columnWrk7Dtl_ext_sys_cd, "ext_sys_cd", "ext_sys_nm");

		}
		return Wrk7Dtl_ext_sys_cd_p;
	}
	
	
	/** [Wrk5Dtl_cur_cd_ListPutter]の定義 */
	private MCListPutter Wrk5Dtl_cur_cd_p = null;

	/**
	 * [Wrk5Dtl_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk5Dtl_cur_cd_ListPutter() {
		if (Wrk5Dtl_cur_cd_p == null) {
			Wrk5Dtl_cur_cd_p = createWrk5Dtl_cur_cd_ListPutter(columnWrk5Dtl_cur_cd, "cur_cd", "cur_nm","amt_dec_place");

		}
		return Wrk5Dtl_cur_cd_p;
	}
	
	
	/** [Wrk6Dtl_if_proc_typ_ListPutter]の定義 */
	private MCListPutter Wrk6Dtl_if_proc_typ_p = null;

	/**
	 * [Wrk6Dtl_if_proc_typ_ListPutter]の取得
	 */
	protected MCListPutter getWrk6Dtl_if_proc_typ_ListPutter() {
		if (Wrk6Dtl_if_proc_typ_p == null) {
			Wrk6Dtl_if_proc_typ_p = createWrk6Dtl_if_proc_typ_ListPutter(columnWrk6Dtl_if_proc_typ, "if_proc_typ", "if_proc_typ_nm");

		}
		return Wrk6Dtl_if_proc_typ_p;
	}
	
	
	/** [Wrk6Dtl_ar_sttl_typ_ListPutter]の定義 */
	private MCListPutter Wrk6Dtl_ar_sttl_typ_p = null;

	/**
	 * [Wrk6Dtl_ar_sttl_typ_ListPutter]の取得
	 */
	protected MCListPutter getWrk6Dtl_ar_sttl_typ_ListPutter() {
		if (Wrk6Dtl_ar_sttl_typ_p == null) {
			Wrk6Dtl_ar_sttl_typ_p = createWrk6Dtl_ar_sttl_typ_ListPutter(columnWrk6Dtl_ar_sttl_typ, "ar_sttl_typ", "ar_sttl_typ_nm");

		}
		return Wrk6Dtl_ar_sttl_typ_p;
	}
	
	
	/** [Wrk6Dtl_bank_cd_ListPutter]の定義 */
	private MCListPutter Wrk6Dtl_bank_cd_p = null;

	/**
	 * [Wrk6Dtl_bank_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk6Dtl_bank_cd_ListPutter() {
		if (Wrk6Dtl_bank_cd_p == null) {
			Wrk6Dtl_bank_cd_p = createWrk6Dtl_bank_cd_ListPutter(columnWrk6Dtl_bank_cd, "bank_cd", "bank_nm");

		}
		return Wrk6Dtl_bank_cd_p;
	}
	
	
	/** [Wrk6Dtl_bank_ac_cd_ListPutter]の定義 */
	private MCListPutter Wrk6Dtl_bank_ac_cd_p = null;

	/**
	 * [Wrk6Dtl_bank_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk6Dtl_bank_ac_cd_ListPutter() {
		if (Wrk6Dtl_bank_ac_cd_p == null) {
			Wrk6Dtl_bank_ac_cd_p = createWrk6Dtl_bank_ac_cd_ListPutter(columnWrk6Dtl_bank_ac_cd, "bank_ac_cd", "bank_ac_nm");

		}
		return Wrk6Dtl_bank_ac_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_BcstRcstReg create(){
		MABCP_BcstRcstReg p = new MABCP_BcstRcstReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_BcstRcstReg create(String name){
		MABCP_BcstRcstReg p = new MABCP_BcstRcstReg(name);
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
		MABCP_BcstRcstReg_MC.jbfInitScreenOpe((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitMst((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitTop((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitFold((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitCnd((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitCtrl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitTbl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitHdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitDtlTab((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitWrk1Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitWrk2Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitWrk3Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitWrk4((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitWrk4Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitWrk4Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitWrk4DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitWrk7((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitWrk7Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitWrk7Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitWrk7DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitWrk5((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitWrk5Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitWrk5DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitWrk6((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitWrk6Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitWrk6Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitWrk6DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbfInitHdrAll((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitScreenOpe((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitMst((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitTop((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitFold((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitCnd((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitCtrl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitTbl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitHdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitDtlTab((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitWrk1Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitWrk2Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitWrk3Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitWrk4((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitWrk4Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitWrk4Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitWrk4DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitWrk7((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitWrk7Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitWrk7Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitWrk7DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitWrk5((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitWrk5Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitWrk5DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitWrk6((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitWrk6Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitWrk6Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitWrk6DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.jbInitHdrAll((MABCP_BcstRcstReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_BcstRcstReg p) {
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
	protected static void jbfInitTop(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_bp_cd_Label = p.beansFactory.createLabel("Cnd.bp_cd_Label");
		p.Cnd_bp_cd = p.beansFactory.createTextField("Cnd.bp_cd");
		p.Cnd_bp_cd.setLabel(p.Cnd_bp_cd_Label);
		p.Cnd_bp_nm = p.beansFactory.createTextField("Cnd.bp_nm");
		p.Cnd_del_flg_lab = p.beansFactory.createLabel("Cnd.del_flg_lab");
		p.Cnd_off_del_flg = p.beansFactory.createCheckBox("Cnd.off_del_flg");
		p.Cnd_on_del_flg = p.beansFactory.createCheckBox("Cnd.on_del_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Tbl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTbl(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.TblPanel = p.beansFactory.createPanel("Tbl");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		p.HdrTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Hdr_bp_cd_Label = p.beansFactory.createLabel("Hdr.bp_cd_Label");
		p.Hdr_bp_cd = p.beansFactory.createTextField("Hdr.bp_cd");
		p.Hdr_bp_cd.setLabel(p.Hdr_bp_cd_Label);
		p.Hdr_bp_nm = p.beansFactory.createTextField("Hdr.bp_nm");
		p.Hdr_bcst_flg = p.beansFactory.createCheckBox("Hdr.bcst_flg");
		p.Hdr_rcst_flg = p.beansFactory.createCheckBox("Hdr.rcst_flg");
		p.Hdr_rcst_cd_Label = p.beansFactory.createLabel("Hdr.rcst_cd_Label");
		p.Hdr_rcst_cd = p.beansFactory.createTextField("Hdr.rcst_cd");
		p.Hdr_rcst_cd.setLabel(p.Hdr_rcst_cd_Label);
		p.Hdr_rcst_nm = p.beansFactory.createTextField("Hdr.rcst_nm");
		p.Hdr_ar_cred_cd_Label = p.beansFactory.createLabel("Hdr.ar_cred_cd_Label");
		p.Hdr_ar_cred_cd = p.beansFactory.createTextField("Hdr.ar_cred_cd");
		p.Hdr_ar_cred_cd.setLabel(p.Hdr_ar_cred_cd_Label);
		p.Hdr_ar_cred_nm = p.beansFactory.createTextField("Hdr.ar_cred_nm");
		p.Hdr_bill_dpt_typ_Label = p.beansFactory.createLabel("Hdr.bill_dpt_typ_Label");
		p.Hdr_bill_dpt_typ = p.beansFactory.createTextComboBox("Hdr.bill_dpt_typ");
		p.Hdr_bill_dpt_typ.setLabel(p.Hdr_bill_dpt_typ_Label);
		p.Hdr_bill_dpt_typ_nm = p.beansFactory.createTextField("Hdr.bill_dpt_typ_nm");
		p.Hdr_bcst_dpt_cd_Label = p.beansFactory.createLabel("Hdr.bcst_dpt_cd_Label");
		p.Hdr_bcst_dpt_cd = p.beansFactory.createTextComboBox("Hdr.bcst_dpt_cd");
		p.Hdr_bcst_dpt_cd.setLabel(p.Hdr_bcst_dpt_cd_Label);
		p.Hdr_bcst_dpt_nm = p.beansFactory.createTextField("Hdr.bcst_dpt_nm");
		p.Hdr_check_bcst_dpt_cd = p.beansFactory.createTextField("Hdr.check_bcst_dpt_cd");
		p.Hdr_bill_cl_typ_Label = p.beansFactory.createLabel("Hdr.bill_cl_typ_Label");
		p.Hdr_bill_cl_typ = p.beansFactory.createTextComboBox("Hdr.bill_cl_typ");
		p.Hdr_bill_cl_typ.setLabel(p.Hdr_bill_cl_typ_Label);
		p.Hdr_bill_cl_typ_nm = p.beansFactory.createTextField("Hdr.bill_cl_typ_nm");
		p.Hdr_bill_cl_day1_Label = p.beansFactory.createLabel("Hdr.bill_cl_day1_Label");
		p.Hdr_bill_cl_day1 = p.beansFactory.createNumberField("Hdr.bill_cl_day1");
		p.Hdr_bill_cl_day1.setLabel(p.Hdr_bill_cl_day1_Label);
		p.Hdr_bill_cl_day2_Label = p.beansFactory.createLabel("Hdr.bill_cl_day2_Label");
		p.Hdr_bill_cl_day2 = p.beansFactory.createNumberField("Hdr.bill_cl_day2");
		p.Hdr_bill_cl_day2.setLabel(p.Hdr_bill_cl_day2_Label);
		p.Hdr_bill_cl_day3_Label = p.beansFactory.createLabel("Hdr.bill_cl_day3_Label");
		p.Hdr_bill_cl_day3 = p.beansFactory.createNumberField("Hdr.bill_cl_day3");
		p.Hdr_bill_cl_day3.setLabel(p.Hdr_bill_cl_day3_Label);
		p.Hdr_bill_cl_day4_Label = p.beansFactory.createLabel("Hdr.bill_cl_day4_Label");
		p.Hdr_bill_cl_day4 = p.beansFactory.createNumberField("Hdr.bill_cl_day4");
		p.Hdr_bill_cl_day4.setLabel(p.Hdr_bill_cl_day4_Label);
		p.Hdr_bill_cl_day5_Label = p.beansFactory.createLabel("Hdr.bill_cl_day5_Label");
		p.Hdr_bill_cl_day5 = p.beansFactory.createNumberField("Hdr.bill_cl_day5");
		p.Hdr_bill_cl_day5.setLabel(p.Hdr_bill_cl_day5_Label);
		p.Hdr_tax_on_bill_flg = p.beansFactory.createCheckBox("Hdr.tax_on_bill_flg");
		p.Hdr_bill_tax_rnd_typ_Label = p.beansFactory.createLabel("Hdr.bill_tax_rnd_typ_Label");
		p.Hdr_bill_tax_rnd_typ = p.beansFactory.createTextComboBox("Hdr.bill_tax_rnd_typ");
		p.Hdr_bill_tax_rnd_typ.setLabel(p.Hdr_bill_tax_rnd_typ_Label);
		p.Hdr_bill_tax_rnd_typ_nm = p.beansFactory.createTextField("Hdr.bill_tax_rnd_typ_nm");
		p.Hdr_bill_cl_delay_days_Label = p.beansFactory.createLabel("Hdr.bill_cl_delay_days_Label");
		p.Hdr_bill_cl_delay_days = p.beansFactory.createNumberField("Hdr.bill_cl_delay_days");
		p.Hdr_bill_cl_delay_days.setLabel(p.Hdr_bill_cl_delay_days_Label);
		p.Hdr_bill_cl_ba_typ_Label = p.beansFactory.createLabel("Hdr.bill_cl_ba_typ_Label");
		p.Hdr_bill_cl_ba_typ = p.beansFactory.createTextComboBox("Hdr.bill_cl_ba_typ");
		p.Hdr_bill_cl_ba_typ.setLabel(p.Hdr_bill_cl_ba_typ_Label);
		p.Hdr_bill_cl_ba_typ_nm = p.beansFactory.createTextField("Hdr.bill_cl_ba_typ_nm");
		p.Hdr_bill_cal_cd_Label = p.beansFactory.createLabel("Hdr.bill_cal_cd_Label");
		p.Hdr_bill_cal_cd = p.beansFactory.createTextComboBox("Hdr.bill_cal_cd");
		p.Hdr_bill_cal_cd.setLabel(p.Hdr_bill_cal_cd_Label);
		p.Hdr_bill_cal_nm = p.beansFactory.createTextField("Hdr.bill_cal_nm");
		p.Hdr_rcv_ba_typ_Label = p.beansFactory.createLabel("Hdr.rcv_ba_typ_Label");
		p.Hdr_rcv_ba_typ = p.beansFactory.createTextComboBox("Hdr.rcv_ba_typ");
		p.Hdr_rcv_ba_typ.setLabel(p.Hdr_rcv_ba_typ_Label);
		p.Hdr_rcv_ba_typ_nm = p.beansFactory.createTextField("Hdr.rcv_ba_typ_nm");
		p.Hdr_auto_line_appl_flg = p.beansFactory.createCheckBox("Hdr.auto_line_appl_flg");
		p.Hdr_sls_interim_cl_flg = p.beansFactory.createCheckBox("Hdr.sls_interim_cl_flg");
		p.Hdr_ar_setoff_grp_cd_Label = p.beansFactory.createLabel("Hdr.ar_setoff_grp_cd_Label");
		p.Hdr_ar_setoff_grp_cd = p.beansFactory.createTextComboBox("Hdr.ar_setoff_grp_cd");
		p.Hdr_ar_setoff_grp_cd.setLabel(p.Hdr_ar_setoff_grp_cd_Label);
		p.Hdr_ar_setoff_grp_nm = p.beansFactory.createTextField("Hdr.ar_setoff_grp_nm");
		p.Hdr_bcst_prnt_typ_Label = p.beansFactory.createLabel("Hdr.bcst_prnt_typ_Label");
		p.Hdr_bcst_prnt_typ = p.beansFactory.createTextComboBox("Hdr.bcst_prnt_typ");
		p.Hdr_bcst_prnt_typ.setLabel(p.Hdr_bcst_prnt_typ_Label);
		p.Hdr_bcst_prnt_typ_nm = p.beansFactory.createTextField("Hdr.bcst_prnt_typ_nm");
		p.Hdr_bill_zip_cd_Label = p.beansFactory.createLabel("Hdr.bill_zip_cd_Label");
		p.Hdr_bill_zip_cd = p.beansFactory.createTextField("Hdr.bill_zip_cd");
		p.Hdr_bill_zip_cd.setLabel(p.Hdr_bill_zip_cd_Label);
		p.Hdr_bill_addr1_Label = p.beansFactory.createLabel("Hdr.bill_addr1_Label");
		p.Hdr_bill_addr1 = p.beansFactory.createTextField("Hdr.bill_addr1");
		p.Hdr_bill_addr1.setLabel(p.Hdr_bill_addr1_Label);
		p.Hdr_bill_addr2_Label = p.beansFactory.createLabel("Hdr.bill_addr2_Label");
		p.Hdr_bill_addr2 = p.beansFactory.createTextField("Hdr.bill_addr2");
		p.Hdr_bill_addr2.setLabel(p.Hdr_bill_addr2_Label);
		p.Hdr_bill_addr3_Label = p.beansFactory.createLabel("Hdr.bill_addr3_Label");
		p.Hdr_bill_addr3 = p.beansFactory.createTextField("Hdr.bill_addr3");
		p.Hdr_bill_addr3.setLabel(p.Hdr_bill_addr3_Label);
		p.Hdr_bill_addr4_Label = p.beansFactory.createLabel("Hdr.bill_addr4_Label");
		p.Hdr_bill_addr4 = p.beansFactory.createTextField("Hdr.bill_addr4");
		p.Hdr_bill_addr4.setLabel(p.Hdr_bill_addr4_Label);
		p.Hdr_bill_tel_Label = p.beansFactory.createLabel("Hdr.bill_tel_Label");
		p.Hdr_bill_tel = p.beansFactory.createTextField("Hdr.bill_tel");
		p.Hdr_bill_tel.setLabel(p.Hdr_bill_tel_Label);
		p.Hdr_bill_bcst_nm_Label = p.beansFactory.createLabel("Hdr.bill_bcst_nm_Label");
		p.Hdr_bill_bcst_nm = p.beansFactory.createTextField("Hdr.bill_bcst_nm");
		p.Hdr_bill_bcst_nm.setLabel(p.Hdr_bill_bcst_nm_Label);
		p.Hdr_bill_bcst_dpt_Label = p.beansFactory.createLabel("Hdr.bill_bcst_dpt_Label");
		p.Hdr_bill_bcst_dpt = p.beansFactory.createTextField("Hdr.bill_bcst_dpt");
		p.Hdr_bill_bcst_dpt.setLabel(p.Hdr_bill_bcst_dpt_Label);
		p.Hdr_bill_bcst_psn_Label = p.beansFactory.createLabel("Hdr.bill_bcst_psn_Label");
		p.Hdr_bill_bcst_psn = p.beansFactory.createTextField("Hdr.bill_bcst_psn");
		p.Hdr_bill_bcst_psn.setLabel(p.Hdr_bill_bcst_psn_Label);
		p.Hdr_bill_bcst_psn_title_Label = p.beansFactory.createLabel("Hdr.bill_bcst_psn_title_Label");
		p.Hdr_bill_bcst_psn_title = p.beansFactory.createTextField("Hdr.bill_bcst_psn_title");
		p.Hdr_bill_bcst_psn_title.setLabel(p.Hdr_bill_bcst_psn_title_Label);
		p.Hdr_bill_prnt_typ_Label = p.beansFactory.createLabel("Hdr.bill_prnt_typ_Label");
		p.Hdr_bill_prnt_typ = p.beansFactory.createTextComboBox("Hdr.bill_prnt_typ");
		p.Hdr_bill_prnt_typ.setLabel(p.Hdr_bill_prnt_typ_Label);
		p.Hdr_bill_prnt_typ_nm = p.beansFactory.createTextField("Hdr.bill_prnt_typ_nm");
		p.Hdr_sls_dtl_outp_typ_Label = p.beansFactory.createLabel("Hdr.sls_dtl_outp_typ_Label");
		p.Hdr_sls_dtl_outp_typ = p.beansFactory.createTextComboBox("Hdr.sls_dtl_outp_typ");
		p.Hdr_sls_dtl_outp_typ.setLabel(p.Hdr_sls_dtl_outp_typ_Label);
		p.Hdr_sls_dtl_outp_typ_nm = p.beansFactory.createTextField("Hdr.sls_dtl_outp_typ_nm");
		p.Hdr_bill_dtl_outp_flg = p.beansFactory.createCheckBox("Hdr.bill_dtl_outp_flg");
		p.Hdr_bfw_bal_disp_flg = p.beansFactory.createCheckBox("Hdr.bfw_bal_disp_flg");
		p.Hdr_bill_dtl_adv_flg = p.beansFactory.createCheckBox("Hdr.bill_dtl_adv_flg");
		p.Hdr_bill_dtl_rcv_flg = p.beansFactory.createCheckBox("Hdr.bill_dtl_rcv_flg");
		p.Hdr_bill_dtl_subttl_typ_Label = p.beansFactory.createLabel("Hdr.bill_dtl_subttl_typ_Label");
		p.Hdr_bill_dtl_subttl_typ = p.beansFactory.createTextComboBox("Hdr.bill_dtl_subttl_typ");
		p.Hdr_bill_dtl_subttl_typ.setLabel(p.Hdr_bill_dtl_subttl_typ_Label);
		p.Hdr_bill_dtl_subttl_typ_nm = p.beansFactory.createTextField("Hdr.bill_dtl_subttl_typ_nm");
		p.Hdr_bill_dtl_brk_typ_Label = p.beansFactory.createLabel("Hdr.bill_dtl_brk_typ_Label");
		p.Hdr_bill_dtl_brk_typ = p.beansFactory.createTextComboBox("Hdr.bill_dtl_brk_typ");
		p.Hdr_bill_dtl_brk_typ.setLabel(p.Hdr_bill_dtl_brk_typ_Label);
		p.Hdr_bill_dtl_brk_typ_nm = p.beansFactory.createTextField("Hdr.bill_dtl_brk_typ_nm");
		p.Hdr_bill_dtl_sort_typ_Label = p.beansFactory.createLabel("Hdr.bill_dtl_sort_typ_Label");
		p.Hdr_bill_dtl_sort_typ = p.beansFactory.createTextComboBox("Hdr.bill_dtl_sort_typ");
		p.Hdr_bill_dtl_sort_typ.setLabel(p.Hdr_bill_dtl_sort_typ_Label);
		p.Hdr_bill_dtl_sort_typ_nm = p.beansFactory.createTextField("Hdr.bill_dtl_sort_typ_nm");
		p.Hdr_bill_can_slip_typ_Label = p.beansFactory.createLabel("Hdr.bill_can_slip_typ_Label");
		p.Hdr_bill_can_slip_typ = p.beansFactory.createTextComboBox("Hdr.bill_can_slip_typ");
		p.Hdr_bill_can_slip_typ.setLabel(p.Hdr_bill_can_slip_typ_Label);
		p.Hdr_bill_can_slip_typ_nm = p.beansFactory.createTextField("Hdr.bill_can_slip_typ_nm");
		p.Hdr_rcv_auto_appl_tgt_flg = p.beansFactory.createCheckBox("Hdr.rcv_auto_appl_tgt_flg");
		p.Hdr_rcv_amt_match_flg = p.beansFactory.createCheckBox("Hdr.rcv_amt_match_flg");
		p.Hdr_ar_sttl_typ_match_flg = p.beansFactory.createCheckBox("Hdr.ar_sttl_typ_match_flg");
		p.Hdr_calc_com_paid_flg = p.beansFactory.createCheckBox("Hdr.calc_com_paid_flg");
		p.Hdr_auto_appl_delay_days_Label = p.beansFactory.createLabel("Hdr.auto_appl_delay_days_Label");
		p.Hdr_auto_appl_delay_days = p.beansFactory.createNumberField("Hdr.auto_appl_delay_days");
		p.Hdr_auto_appl_delay_days.setLabel(p.Hdr_auto_appl_delay_days_Label);
		p.Hdr_xfr_psn_Label = p.beansFactory.createLabel("Hdr.xfr_psn_Label");
		p.Hdr_xfr_psn = p.beansFactory.createTextField("Hdr.xfr_psn");
		p.Hdr_xfr_psn.setLabel(p.Hdr_xfr_psn_Label);
		p.Hdr_rcst_prnt_typ_Label = p.beansFactory.createLabel("Hdr.rcst_prnt_typ_Label");
		p.Hdr_rcst_prnt_typ = p.beansFactory.createTextComboBox("Hdr.rcst_prnt_typ");
		p.Hdr_rcst_prnt_typ.setLabel(p.Hdr_rcst_prnt_typ_Label);
		p.Hdr_rcst_prnt_typ_nm = p.beansFactory.createTextField("Hdr.rcst_prnt_typ_nm");
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlTab(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.DtlTabPanel = p.beansFactory.createPanel("DtlTab");
		p.DtlTabTab = p.beansFactory.createTabbedPane("DtlTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk1Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk1Hdr(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk1HdrPanel = p.beansFactory.createPanel("Wrk1Hdr");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk2Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk2Hdr(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk2HdrPanel = p.beansFactory.createPanel("Wrk2Hdr");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk3Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk3Hdr(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk3HdrPanel = p.beansFactory.createPanel("Wrk3Hdr");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk4(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk4Panel = p.beansFactory.createPanel("Wrk4");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk4Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk4Hdr(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk4HdrPanel = p.beansFactory.createPanel("Wrk4Hdr");
		// ブロックの項目の初期化
		p.Wrk4Hdr_bill_cl_day1_Label = p.beansFactory.createLabel("Wrk4Hdr.bill_cl_day1_Label");
		p.Wrk4Hdr_bill_cl_day1 = p.beansFactory.createNumberField("Wrk4Hdr.bill_cl_day1");
		p.Wrk4Hdr_bill_cl_day1.setLabel(p.Wrk4Hdr_bill_cl_day1_Label);
		p.Wrk4Hdr_bill_cl_day2_Label = p.beansFactory.createLabel("Wrk4Hdr.bill_cl_day2_Label");
		p.Wrk4Hdr_bill_cl_day2 = p.beansFactory.createNumberField("Wrk4Hdr.bill_cl_day2");
		p.Wrk4Hdr_bill_cl_day2.setLabel(p.Wrk4Hdr_bill_cl_day2_Label);
		p.Wrk4Hdr_bill_cl_day3_Label = p.beansFactory.createLabel("Wrk4Hdr.bill_cl_day3_Label");
		p.Wrk4Hdr_bill_cl_day3 = p.beansFactory.createNumberField("Wrk4Hdr.bill_cl_day3");
		p.Wrk4Hdr_bill_cl_day3.setLabel(p.Wrk4Hdr_bill_cl_day3_Label);
		p.Wrk4Hdr_bill_cl_day4_Label = p.beansFactory.createLabel("Wrk4Hdr.bill_cl_day4_Label");
		p.Wrk4Hdr_bill_cl_day4 = p.beansFactory.createNumberField("Wrk4Hdr.bill_cl_day4");
		p.Wrk4Hdr_bill_cl_day4.setLabel(p.Wrk4Hdr_bill_cl_day4_Label);
		p.Wrk4Hdr_bill_cl_day5_Label = p.beansFactory.createLabel("Wrk4Hdr.bill_cl_day5_Label");
		p.Wrk4Hdr_bill_cl_day5 = p.beansFactory.createNumberField("Wrk4Hdr.bill_cl_day5");
		p.Wrk4Hdr_bill_cl_day5.setLabel(p.Wrk4Hdr_bill_cl_day5_Label);
	}

	/**
	 * [Wrk4Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk4Dtl(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk4DtlPanel = p.beansFactory.createPanel("Wrk4Dtl");
		p.Wrk4DtlScrollPane = p.beansFactory.createScrollPane("Wrk4Dtl.scroll");
		p.createWrk4DtlTable();
		// ブロックの項目の初期化
		p.columnWrk4Dtl_check = p.beansFactory.createTableColumn("Wrk4Dtl.check", MCColumnType.CHECK);
		p.columnWrk4Dtl_del_flg = p.beansFactory.createTableColumn("Wrk4Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk4Dtl_bcst_cd = p.beansFactory.createTableColumn("Wrk4Dtl.bcst_cd", MCColumnType.TEXT);
		p.columnWrk4Dtl_bill_cl_day1 = p.beansFactory.createTableColumn("Wrk4Dtl.bill_cl_day1", MCColumnType.NUMBER);
		p.columnWrk4Dtl_bill_cl_day2 = p.beansFactory.createTableColumn("Wrk4Dtl.bill_cl_day2", MCColumnType.NUMBER);
		p.columnWrk4Dtl_bill_cl_day3 = p.beansFactory.createTableColumn("Wrk4Dtl.bill_cl_day3", MCColumnType.NUMBER);
		p.columnWrk4Dtl_bill_cl_day4 = p.beansFactory.createTableColumn("Wrk4Dtl.bill_cl_day4", MCColumnType.NUMBER);
		p.columnWrk4Dtl_bill_cl_day5 = p.beansFactory.createTableColumn("Wrk4Dtl.bill_cl_day5", MCColumnType.NUMBER);
		p.columnWrk4Dtl_cur_cd = p.beansFactory.createTableColumn("Wrk4Dtl.cur_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk4Dtl_cur_nm = p.beansFactory.createTableColumn("Wrk4Dtl.cur_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_amt_dec_place = p.beansFactory.createTableColumn("Wrk4Dtl.amt_dec_place", MCColumnType.NUMBER);
		p.columnWrk4Dtl_sttl_cd = p.beansFactory.createTableColumn("Wrk4Dtl.sttl_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk4Dtl_sttl_nm = p.beansFactory.createTableColumn("Wrk4Dtl.sttl_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_wg_cd = p.beansFactory.createTableColumn("Wrk4Dtl.wg_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk4Dtl_wg_nm = p.beansFactory.createTableColumn("Wrk4Dtl.wg_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_rate = p.beansFactory.createTableColumn("Wrk4Dtl.rate", MCColumnType.NUMBER);
		p.columnWrk4Dtl_crryovr_mons_typ = p.beansFactory.createTableColumn("Wrk4Dtl.crryovr_mons_typ", MCColumnType.TEXT_COMBO);
		p.columnWrk4Dtl_crryovr_mons_typ_nm = p.beansFactory.createTableColumn("Wrk4Dtl.crryovr_mons_typ_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_rcv_crryovr_mons1 = p.beansFactory.createTableColumn("Wrk4Dtl.rcv_crryovr_mons1", MCColumnType.NUMBER);
		p.columnWrk4Dtl_rcv_day1 = p.beansFactory.createTableColumn("Wrk4Dtl.rcv_day1", MCColumnType.NUMBER);
		p.columnWrk4Dtl_rcv_crryovr_mons2 = p.beansFactory.createTableColumn("Wrk4Dtl.rcv_crryovr_mons2", MCColumnType.NUMBER);
		p.columnWrk4Dtl_rcv_day2 = p.beansFactory.createTableColumn("Wrk4Dtl.rcv_day2", MCColumnType.NUMBER);
		p.columnWrk4Dtl_rcv_crryovr_mons3 = p.beansFactory.createTableColumn("Wrk4Dtl.rcv_crryovr_mons3", MCColumnType.NUMBER);
		p.columnWrk4Dtl_rcv_day3 = p.beansFactory.createTableColumn("Wrk4Dtl.rcv_day3", MCColumnType.NUMBER);
		p.columnWrk4Dtl_rcv_crryovr_mons4 = p.beansFactory.createTableColumn("Wrk4Dtl.rcv_crryovr_mons4", MCColumnType.NUMBER);
		p.columnWrk4Dtl_rcv_day4 = p.beansFactory.createTableColumn("Wrk4Dtl.rcv_day4", MCColumnType.NUMBER);
		p.columnWrk4Dtl_rcv_crryovr_mons5 = p.beansFactory.createTableColumn("Wrk4Dtl.rcv_crryovr_mons5", MCColumnType.NUMBER);
		p.columnWrk4Dtl_rcv_day5 = p.beansFactory.createTableColumn("Wrk4Dtl.rcv_day5", MCColumnType.NUMBER);
		p.columnWrk4Dtl_memo1 = p.beansFactory.createTableColumn("Wrk4Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk4Dtl_memo2 = p.beansFactory.createTableColumn("Wrk4Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk4Dtl_memo3 = p.beansFactory.createTableColumn("Wrk4Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk4Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk4Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk4Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk4Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk4Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk4Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk4Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk4Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk4Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk4Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk4Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk4Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk4Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk4Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk4Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk4Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk4Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk4Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk4Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk4Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk4Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk4Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk4Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk4Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_del_ts = p.beansFactory.createTableColumn("Wrk4Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk4DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk4DtlBtn(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk4DtlBtnPanel = p.beansFactory.createPanel("Wrk4DtlBtn");
		// ブロックの項目の初期化
		p.Wrk4DtlBtn_select_all = p.beansFactory.createButton("Wrk4DtlBtn.select_all", "no_border");
		p.Wrk4DtlBtn_deselect_all = p.beansFactory.createButton("Wrk4DtlBtn.deselect_all", "no_border");
		p.Wrk4DtlBtn_radd = p.beansFactory.createButton("Wrk4DtlBtn.radd", "no_border");
		p.Wrk4DtlBtn_rdel = p.beansFactory.createButton("Wrk4DtlBtn.rdel", "no_border");
		p.Wrk4DtlBtn_rcopy = p.beansFactory.createButton("Wrk4DtlBtn.rcopy", "no_border");
	}

	/**
	 * [Wrk7]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk7(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk7Panel = p.beansFactory.createPanel("Wrk7");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk7Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk7Hdr(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk7HdrPanel = p.beansFactory.createPanel("Wrk7Hdr");
		// ブロックの項目の初期化
		p.Wrk7Hdr_st_dt_Label = p.beansFactory.createLabel("Wrk7Hdr.st_dt_Label");
		p.Wrk7Hdr_st_dt = p.beansFactory.createDateField("Wrk7Hdr.st_dt");
		p.Wrk7Hdr_st_dt.setLabel(p.Wrk7Hdr_st_dt_Label);
		p.Wrk7Hdr_end_dt_Label = p.beansFactory.createLabel("Wrk7Hdr.end_dt_Label");
		p.Wrk7Hdr_end_dt = p.beansFactory.createDateField("Wrk7Hdr.end_dt");
		p.Wrk7Hdr_end_dt.setLabel(p.Wrk7Hdr_end_dt_Label);
		p.Wrk7Hdr_set_dt = p.beansFactory.createButton("Wrk7Hdr.set_dt");
	}

	/**
	 * [Wrk7Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk7Dtl(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk7DtlPanel = p.beansFactory.createPanel("Wrk7Dtl");
		p.Wrk7DtlScrollPane = p.beansFactory.createScrollPane("Wrk7Dtl.scroll");
		p.createWrk7DtlTable();
		// ブロックの項目の初期化
		p.columnWrk7Dtl_check = p.beansFactory.createTableColumn("Wrk7Dtl.check", MCColumnType.CHECK);
		p.columnWrk7Dtl_del_flg = p.beansFactory.createTableColumn("Wrk7Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk7Dtl_bp_cd = p.beansFactory.createTableColumn("Wrk7Dtl.bp_cd", MCColumnType.TEXT);
		p.columnWrk7Dtl_if_proc_typ = p.beansFactory.createTableColumn("Wrk7Dtl.if_proc_typ", MCColumnType.TEXT_COMBO);
		p.columnWrk7Dtl_if_proc_typ_nm = p.beansFactory.createTableColumn("Wrk7Dtl.if_proc_typ_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_not_onr_prov_flg = p.beansFactory.createTableColumn("Wrk7Dtl.not_onr_prov_flg", MCColumnType.CHECK);
		p.columnWrk7Dtl_ext_sys_cd = p.beansFactory.createTableColumn("Wrk7Dtl.ext_sys_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk7Dtl_ext_sys_nm = p.beansFactory.createTableColumn("Wrk7Dtl.ext_sys_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_memo1 = p.beansFactory.createTableColumn("Wrk7Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk7Dtl_memo2 = p.beansFactory.createTableColumn("Wrk7Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk7Dtl_memo3 = p.beansFactory.createTableColumn("Wrk7Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk7Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk7Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk7Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk7Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk7Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk7Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk7Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk7Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk7Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk7Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk7Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk7Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk7Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk7Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk7Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk7Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk7Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk7Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk7Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk7Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk7Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk7Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk7Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk7Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_del_ts = p.beansFactory.createTableColumn("Wrk7Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk7DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk7DtlBtn(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk7DtlBtnPanel = p.beansFactory.createPanel("Wrk7DtlBtn");
		// ブロックの項目の初期化
		p.Wrk7DtlBtn_select_all = p.beansFactory.createButton("Wrk7DtlBtn.select_all", "no_border");
		p.Wrk7DtlBtn_deselect_all = p.beansFactory.createButton("Wrk7DtlBtn.deselect_all", "no_border");
		p.Wrk7DtlBtn_radd = p.beansFactory.createButton("Wrk7DtlBtn.radd", "no_border");
		p.Wrk7DtlBtn_rdel = p.beansFactory.createButton("Wrk7DtlBtn.rdel", "no_border");
		p.Wrk7DtlBtn_rcopy = p.beansFactory.createButton("Wrk7DtlBtn.rcopy", "no_border");
	}

	/**
	 * [Wrk5]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk5(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk5Panel = p.beansFactory.createPanel("Wrk5");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk5Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk5Dtl(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk5DtlPanel = p.beansFactory.createPanel("Wrk5Dtl");
		p.Wrk5DtlScrollPane = p.beansFactory.createScrollPane("Wrk5Dtl.scroll");
		p.createWrk5DtlTable();
		// ブロックの項目の初期化
		p.columnWrk5Dtl_check = p.beansFactory.createTableColumn("Wrk5Dtl.check", MCColumnType.CHECK);
		p.columnWrk5Dtl_del_flg = p.beansFactory.createTableColumn("Wrk5Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk5Dtl_rcst_cd = p.beansFactory.createTableColumn("Wrk5Dtl.rcst_cd", MCColumnType.TEXT);
		p.columnWrk5Dtl_cur_cd = p.beansFactory.createTableColumn("Wrk5Dtl.cur_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk5Dtl_cur_nm = p.beansFactory.createTableColumn("Wrk5Dtl.cur_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_amt_dec_place = p.beansFactory.createTableColumn("Wrk5Dtl.amt_dec_place", MCColumnType.NUMBER);
		p.columnWrk5Dtl_memo1 = p.beansFactory.createTableColumn("Wrk5Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk5Dtl_memo2 = p.beansFactory.createTableColumn("Wrk5Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk5Dtl_memo3 = p.beansFactory.createTableColumn("Wrk5Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk5Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk5Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk5Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk5Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk5Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk5Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk5Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk5Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk5Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk5Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk5Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk5Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk5Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk5Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk5Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk5Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk5Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk5Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk5Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk5Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk5Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk5Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk5Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk5Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_del_ts = p.beansFactory.createTableColumn("Wrk5Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk5DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk5DtlBtn(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk5DtlBtnPanel = p.beansFactory.createPanel("Wrk5DtlBtn");
		// ブロックの項目の初期化
		p.Wrk5DtlBtn_select_all = p.beansFactory.createButton("Wrk5DtlBtn.select_all", "no_border");
		p.Wrk5DtlBtn_deselect_all = p.beansFactory.createButton("Wrk5DtlBtn.deselect_all", "no_border");
		p.Wrk5DtlBtn_radd = p.beansFactory.createButton("Wrk5DtlBtn.radd", "no_border");
		p.Wrk5DtlBtn_rdel = p.beansFactory.createButton("Wrk5DtlBtn.rdel", "no_border");
		p.Wrk5DtlBtn_rcopy = p.beansFactory.createButton("Wrk5DtlBtn.rcopy", "no_border");
	}

	/**
	 * [Wrk6]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk6(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk6Panel = p.beansFactory.createPanel("Wrk6");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk6Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk6Hdr(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk6HdrPanel = p.beansFactory.createPanel("Wrk6Hdr");
		// ブロックの項目の初期化
		p.Wrk6Hdr_st_dt_Label = p.beansFactory.createLabel("Wrk6Hdr.st_dt_Label");
		p.Wrk6Hdr_st_dt = p.beansFactory.createDateField("Wrk6Hdr.st_dt");
		p.Wrk6Hdr_st_dt.setLabel(p.Wrk6Hdr_st_dt_Label);
		p.Wrk6Hdr_end_dt_Label = p.beansFactory.createLabel("Wrk6Hdr.end_dt_Label");
		p.Wrk6Hdr_end_dt = p.beansFactory.createDateField("Wrk6Hdr.end_dt");
		p.Wrk6Hdr_end_dt.setLabel(p.Wrk6Hdr_end_dt_Label);
		p.Wrk6Hdr_set_dt = p.beansFactory.createButton("Wrk6Hdr.set_dt");
	}

	/**
	 * [Wrk6Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk6Dtl(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk6DtlPanel = p.beansFactory.createPanel("Wrk6Dtl");
		p.Wrk6DtlScrollPane = p.beansFactory.createScrollPane("Wrk6Dtl.scroll");
		p.createWrk6DtlTable();
		// ブロックの項目の初期化
		p.columnWrk6Dtl_check = p.beansFactory.createTableColumn("Wrk6Dtl.check", MCColumnType.CHECK);
		p.columnWrk6Dtl_del_flg = p.beansFactory.createTableColumn("Wrk6Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk6Dtl_bp_cd = p.beansFactory.createTableColumn("Wrk6Dtl.bp_cd", MCColumnType.TEXT);
		p.columnWrk6Dtl_bp_cd_null_flg = p.beansFactory.createTableColumn("Wrk6Dtl.bp_cd_null_flg", MCColumnType.CHECK);
		p.columnWrk6Dtl_if_proc_typ = p.beansFactory.createTableColumn("Wrk6Dtl.if_proc_typ", MCColumnType.TEXT_COMBO);
		p.columnWrk6Dtl_if_proc_typ_nm = p.beansFactory.createTableColumn("Wrk6Dtl.if_proc_typ_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_ar_sttl_typ = p.beansFactory.createTableColumn("Wrk6Dtl.ar_sttl_typ", MCColumnType.TEXT_COMBO);
		p.columnWrk6Dtl_ar_sttl_typ_nm = p.beansFactory.createTableColumn("Wrk6Dtl.ar_sttl_typ_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_bank_cd = p.beansFactory.createTableColumn("Wrk6Dtl.bank_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk6Dtl_bank_nm = p.beansFactory.createTableColumn("Wrk6Dtl.bank_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_bank_ac_cd = p.beansFactory.createTableColumn("Wrk6Dtl.bank_ac_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk6Dtl_bank_ac_nm = p.beansFactory.createTableColumn("Wrk6Dtl.bank_ac_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_memo1 = p.beansFactory.createTableColumn("Wrk6Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk6Dtl_memo2 = p.beansFactory.createTableColumn("Wrk6Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk6Dtl_memo3 = p.beansFactory.createTableColumn("Wrk6Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk6Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk6Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk6Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk6Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk6Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk6Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk6Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk6Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk6Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk6Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk6Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk6Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk6Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk6Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk6Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk6Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk6Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk6Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk6Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk6Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk6Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk6Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk6Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk6Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_del_ts = p.beansFactory.createTableColumn("Wrk6Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk6DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk6DtlBtn(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk6DtlBtnPanel = p.beansFactory.createPanel("Wrk6DtlBtn");
		// ブロックの項目の初期化
		p.Wrk6DtlBtn_select_all = p.beansFactory.createButton("Wrk6DtlBtn.select_all", "no_border");
		p.Wrk6DtlBtn_deselect_all = p.beansFactory.createButton("Wrk6DtlBtn.deselect_all", "no_border");
		p.Wrk6DtlBtn_radd = p.beansFactory.createButton("Wrk6DtlBtn.radd", "no_border");
		p.Wrk6DtlBtn_rdel = p.beansFactory.createButton("Wrk6DtlBtn.rdel", "no_border");
		p.Wrk6DtlBtn_rcopy = p.beansFactory.createButton("Wrk6DtlBtn.rcopy", "no_border");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MABCP0510 = p.beansFactory.createButton("Btn.open_MABCP0510", "open");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [HdrAll]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrAll(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.HdrAllPanel = p.beansFactory.createPanel("HdrAll");
		p.HdrAllScrollPane = p.beansFactory.createScrollPane("HdrAll.scroll");
		p.createHdrAllTable();
		// ブロックの項目の初期化
		p.columnHdrAll_check = p.beansFactory.createTableColumn("HdrAll.check", MCColumnType.CHECK);
		p.columnHdrAll_bp_cd = p.beansFactory.createTableColumn("HdrAll.bp_cd", MCColumnType.TEXT);
		p.columnHdrAll_bp_nm = p.beansFactory.createTableColumn("HdrAll.bp_nm", MCColumnType.TEXT);
		p.columnHdrAll_bcst_flg = p.beansFactory.createTableColumn("HdrAll.bcst_flg", MCColumnType.CHECK);
		p.columnHdrAll_rcst_flg = p.beansFactory.createTableColumn("HdrAll.rcst_flg", MCColumnType.CHECK);
		p.columnHdrAll_rcst_cd = p.beansFactory.createTableColumn("HdrAll.rcst_cd", MCColumnType.TEXT);
		p.columnHdrAll_rcst_nm = p.beansFactory.createTableColumn("HdrAll.rcst_nm", MCColumnType.TEXT);
		p.columnHdrAll_ar_cred_cd = p.beansFactory.createTableColumn("HdrAll.ar_cred_cd", MCColumnType.TEXT);
		p.columnHdrAll_ar_cred_nm = p.beansFactory.createTableColumn("HdrAll.ar_cred_nm", MCColumnType.TEXT);
		p.columnHdrAll_bill_dpt_typ = p.beansFactory.createTableColumn("HdrAll.bill_dpt_typ", MCColumnType.TEXT);
		p.columnHdrAll_bill_dpt_typ_nm = p.beansFactory.createTableColumn("HdrAll.bill_dpt_typ_nm", MCColumnType.TEXT);
		p.columnHdrAll_bcst_dpt_cd = p.beansFactory.createTableColumn("HdrAll.bcst_dpt_cd", MCColumnType.TEXT);
		p.columnHdrAll_bcst_dpt_nm = p.beansFactory.createTableColumn("HdrAll.bcst_dpt_nm", MCColumnType.TEXT);
		p.columnHdrAll_check_bcst_dpt_cd = p.beansFactory.createTableColumn("HdrAll.check_bcst_dpt_cd", MCColumnType.TEXT);
		p.columnHdrAll_bill_cl_typ = p.beansFactory.createTableColumn("HdrAll.bill_cl_typ", MCColumnType.TEXT);
		p.columnHdrAll_bill_cl_typ_nm = p.beansFactory.createTableColumn("HdrAll.bill_cl_typ_nm", MCColumnType.TEXT);
		p.columnHdrAll_bill_cl_day1 = p.beansFactory.createTableColumn("HdrAll.bill_cl_day1", MCColumnType.NUMBER);
		p.columnHdrAll_bill_cl_day2 = p.beansFactory.createTableColumn("HdrAll.bill_cl_day2", MCColumnType.NUMBER);
		p.columnHdrAll_bill_cl_day3 = p.beansFactory.createTableColumn("HdrAll.bill_cl_day3", MCColumnType.NUMBER);
		p.columnHdrAll_bill_cl_day4 = p.beansFactory.createTableColumn("HdrAll.bill_cl_day4", MCColumnType.NUMBER);
		p.columnHdrAll_bill_cl_day5 = p.beansFactory.createTableColumn("HdrAll.bill_cl_day5", MCColumnType.NUMBER);
		p.columnHdrAll_tax_on_bill_flg = p.beansFactory.createTableColumn("HdrAll.tax_on_bill_flg", MCColumnType.CHECK);
		p.columnHdrAll_bill_tax_rnd_typ = p.beansFactory.createTableColumn("HdrAll.bill_tax_rnd_typ", MCColumnType.TEXT);
		p.columnHdrAll_bill_tax_rnd_typ_nm = p.beansFactory.createTableColumn("HdrAll.bill_tax_rnd_typ_nm", MCColumnType.TEXT);
		p.columnHdrAll_bill_cl_delay_days = p.beansFactory.createTableColumn("HdrAll.bill_cl_delay_days", MCColumnType.NUMBER);
		p.columnHdrAll_bill_cl_ba_typ = p.beansFactory.createTableColumn("HdrAll.bill_cl_ba_typ", MCColumnType.TEXT);
		p.columnHdrAll_bill_cl_ba_typ_nm = p.beansFactory.createTableColumn("HdrAll.bill_cl_ba_typ_nm", MCColumnType.TEXT);
		p.columnHdrAll_bill_cal_cd = p.beansFactory.createTableColumn("HdrAll.bill_cal_cd", MCColumnType.TEXT);
		p.columnHdrAll_bill_cal_nm = p.beansFactory.createTableColumn("HdrAll.bill_cal_nm", MCColumnType.TEXT);
		p.columnHdrAll_rcv_ba_typ = p.beansFactory.createTableColumn("HdrAll.rcv_ba_typ", MCColumnType.TEXT);
		p.columnHdrAll_rcv_ba_typ_nm = p.beansFactory.createTableColumn("HdrAll.rcv_ba_typ_nm", MCColumnType.TEXT);
		p.columnHdrAll_auto_line_appl_flg = p.beansFactory.createTableColumn("HdrAll.auto_line_appl_flg", MCColumnType.CHECK);
		p.columnHdrAll_sls_interim_cl_flg = p.beansFactory.createTableColumn("HdrAll.sls_interim_cl_flg", MCColumnType.CHECK);
		p.columnHdrAll_ar_setoff_grp_cd = p.beansFactory.createTableColumn("HdrAll.ar_setoff_grp_cd", MCColumnType.TEXT);
		p.columnHdrAll_ar_setoff_grp_nm = p.beansFactory.createTableColumn("HdrAll.ar_setoff_grp_nm", MCColumnType.TEXT);
		p.columnHdrAll_bcst_prnt_typ = p.beansFactory.createTableColumn("HdrAll.bcst_prnt_typ", MCColumnType.TEXT);
		p.columnHdrAll_bcst_prnt_typ_nm = p.beansFactory.createTableColumn("HdrAll.bcst_prnt_typ_nm", MCColumnType.TEXT);
		p.columnHdrAll_bill_zip_cd = p.beansFactory.createTableColumn("HdrAll.bill_zip_cd", MCColumnType.TEXT);
		p.columnHdrAll_bill_addr1 = p.beansFactory.createTableColumn("HdrAll.bill_addr1", MCColumnType.TEXT);
		p.columnHdrAll_bill_addr2 = p.beansFactory.createTableColumn("HdrAll.bill_addr2", MCColumnType.TEXT);
		p.columnHdrAll_bill_addr3 = p.beansFactory.createTableColumn("HdrAll.bill_addr3", MCColumnType.TEXT);
		p.columnHdrAll_bill_addr4 = p.beansFactory.createTableColumn("HdrAll.bill_addr4", MCColumnType.TEXT);
		p.columnHdrAll_bill_tel = p.beansFactory.createTableColumn("HdrAll.bill_tel", MCColumnType.TEXT);
		p.columnHdrAll_bill_bcst_nm = p.beansFactory.createTableColumn("HdrAll.bill_bcst_nm", MCColumnType.TEXT);
		p.columnHdrAll_bill_bcst_dpt = p.beansFactory.createTableColumn("HdrAll.bill_bcst_dpt", MCColumnType.TEXT);
		p.columnHdrAll_bill_bcst_psn = p.beansFactory.createTableColumn("HdrAll.bill_bcst_psn", MCColumnType.TEXT);
		p.columnHdrAll_bill_bcst_psn_title = p.beansFactory.createTableColumn("HdrAll.bill_bcst_psn_title", MCColumnType.TEXT);
		p.columnHdrAll_bill_prnt_typ = p.beansFactory.createTableColumn("HdrAll.bill_prnt_typ", MCColumnType.TEXT);
		p.columnHdrAll_bill_prnt_typ_nm = p.beansFactory.createTableColumn("HdrAll.bill_prnt_typ_nm", MCColumnType.TEXT);
		p.columnHdrAll_sls_dtl_outp_typ = p.beansFactory.createTableColumn("HdrAll.sls_dtl_outp_typ", MCColumnType.TEXT);
		p.columnHdrAll_sls_dtl_outp_typ_nm = p.beansFactory.createTableColumn("HdrAll.sls_dtl_outp_typ_nm", MCColumnType.TEXT);
		p.columnHdrAll_bill_dtl_outp_flg = p.beansFactory.createTableColumn("HdrAll.bill_dtl_outp_flg", MCColumnType.CHECK);
		p.columnHdrAll_bfw_bal_disp_flg = p.beansFactory.createTableColumn("HdrAll.bfw_bal_disp_flg", MCColumnType.CHECK);
		p.columnHdrAll_bill_dtl_adv_flg = p.beansFactory.createTableColumn("HdrAll.bill_dtl_adv_flg", MCColumnType.CHECK);
		p.columnHdrAll_bill_dtl_rcv_flg = p.beansFactory.createTableColumn("HdrAll.bill_dtl_rcv_flg", MCColumnType.CHECK);
		p.columnHdrAll_bill_dtl_subttl_typ = p.beansFactory.createTableColumn("HdrAll.bill_dtl_subttl_typ", MCColumnType.TEXT);
		p.columnHdrAll_bill_dtl_subttl_typ_nm = p.beansFactory.createTableColumn("HdrAll.bill_dtl_subttl_typ_nm", MCColumnType.TEXT);
		p.columnHdrAll_bill_dtl_brk_typ = p.beansFactory.createTableColumn("HdrAll.bill_dtl_brk_typ", MCColumnType.TEXT);
		p.columnHdrAll_bill_dtl_brk_typ_nm = p.beansFactory.createTableColumn("HdrAll.bill_dtl_brk_typ_nm", MCColumnType.TEXT);
		p.columnHdrAll_bill_dtl_sort_typ = p.beansFactory.createTableColumn("HdrAll.bill_dtl_sort_typ", MCColumnType.TEXT);
		p.columnHdrAll_bill_dtl_sort_typ_nm = p.beansFactory.createTableColumn("HdrAll.bill_dtl_sort_typ_nm", MCColumnType.TEXT);
		p.columnHdrAll_bill_can_slip_typ = p.beansFactory.createTableColumn("HdrAll.bill_can_slip_typ", MCColumnType.TEXT);
		p.columnHdrAll_bill_can_slip_typ_nm = p.beansFactory.createTableColumn("HdrAll.bill_can_slip_typ_nm", MCColumnType.TEXT);
		p.columnHdrAll_rcv_auto_appl_tgt_flg = p.beansFactory.createTableColumn("HdrAll.rcv_auto_appl_tgt_flg", MCColumnType.CHECK);
		p.columnHdrAll_rcv_amt_match_flg = p.beansFactory.createTableColumn("HdrAll.rcv_amt_match_flg", MCColumnType.CHECK);
		p.columnHdrAll_ar_sttl_typ_match_flg = p.beansFactory.createTableColumn("HdrAll.ar_sttl_typ_match_flg", MCColumnType.CHECK);
		p.columnHdrAll_calc_com_paid_flg = p.beansFactory.createTableColumn("HdrAll.calc_com_paid_flg", MCColumnType.CHECK);
		p.columnHdrAll_auto_appl_delay_days = p.beansFactory.createTableColumn("HdrAll.auto_appl_delay_days", MCColumnType.NUMBER);
		p.columnHdrAll_xfr_psn = p.beansFactory.createTableColumn("HdrAll.xfr_psn", MCColumnType.TEXT);
		p.columnHdrAll_ins_usr_id = p.beansFactory.createTableColumn("HdrAll.ins_usr_id", MCColumnType.TEXT);
		p.columnHdrAll_ins_usr_nm = p.beansFactory.createTableColumn("HdrAll.ins_usr_nm", MCColumnType.TEXT);
		p.columnHdrAll_ins_ts = p.beansFactory.createTableColumn("HdrAll.ins_ts", MCColumnType.TIMESTAMP);
		p.columnHdrAll_ins_func_id = p.beansFactory.createTableColumn("HdrAll.ins_func_id", MCColumnType.TEXT);
		p.columnHdrAll_ins_func_nm = p.beansFactory.createTableColumn("HdrAll.ins_func_nm", MCColumnType.TEXT);
		p.columnHdrAll_upd_cntr = p.beansFactory.createTableColumn("HdrAll.upd_cntr", MCColumnType.NUMBER);
		p.columnHdrAll_upd_usr_id = p.beansFactory.createTableColumn("HdrAll.upd_usr_id", MCColumnType.TEXT);
		p.columnHdrAll_upd_usr_nm = p.beansFactory.createTableColumn("HdrAll.upd_usr_nm", MCColumnType.TEXT);
		p.columnHdrAll_upd_ts = p.beansFactory.createTableColumn("HdrAll.upd_ts", MCColumnType.TIMESTAMP);
		p.columnHdrAll_upd_func_id = p.beansFactory.createTableColumn("HdrAll.upd_func_id", MCColumnType.TEXT);
		p.columnHdrAll_upd_func_nm = p.beansFactory.createTableColumn("HdrAll.upd_func_nm", MCColumnType.TEXT);
		p.columnHdrAll_upd_srv_req_no = p.beansFactory.createTableColumn("HdrAll.upd_srv_req_no", MCColumnType.TEXT);
		p.columnHdrAll_del_usr_id = p.beansFactory.createTableColumn("HdrAll.del_usr_id", MCColumnType.TEXT);
		p.columnHdrAll_del_usr_nm = p.beansFactory.createTableColumn("HdrAll.del_usr_nm", MCColumnType.TEXT);
		p.columnHdrAll_del_ts = p.beansFactory.createTableColumn("HdrAll.del_ts", MCColumnType.TIMESTAMP);
		p.columnHdrAll_rcst_prnt_typ = p.beansFactory.createTableColumn("HdrAll.rcst_prnt_typ", MCColumnType.TEXT);
		p.columnHdrAll_rcst_prnt_typ_nm = p.beansFactory.createTableColumn("HdrAll.rcst_prnt_typ_nm", MCColumnType.TEXT);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_BcstRcstReg p) {
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
	protected static void jbInitMst(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.TopPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP0560.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.TblPanel);
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
	protected static void jbInitFold(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0560.CndR.ope_META);
		p.CndPanel.add(p.Cnd_bp_cd_Label);
		p.CndPanel.add(p.Cnd_bp_cd);
		p.CndPanel.setLastBeans(p.Cnd_bp_cd);
		p.Cnd_bp_cd.setNextBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0560.CndR.bp_cd_META);
		p.Cnd_bp_cd.addLinkBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setListType(MCListType.STRICT);
		p.CndPanel.add(p.Cnd_bp_nm);
		p.Cnd_bp_nm.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_bp_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0560.CndR.bp_nm_META);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0560.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0560.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Tbl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTbl(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.add(p.TblPanel);
		p.TblPanel.setNextBeans(p.BtnPanel);
		p.TblPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.TblPanel.add(p.HdrPanel, null);
		p.TblPanel.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.DtlTabPanel);
		p.TblPanel.add(p.DtlTabPanel, null);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setBorder(p.HdrTitledBorder);
		p.HdrPanel.setValueCheck(false);
		p.HdrPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_bp_cd_Label);
		p.HdrPanel.add(p.Hdr_bp_cd);
		p.HdrPanel.setLastBeans(p.Hdr_bp_cd);
		p.Hdr_bp_cd.setNextBeans(p.Hdr_bp_nm);
		p.Hdr_bp_cd.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bp_cd_META);
		p.HdrPanel.add(p.Hdr_bp_nm);
		p.Hdr_bp_nm.setNextBeans(p.Hdr_bcst_flg);
		p.Hdr_bp_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bp_nm_META);
		p.HdrPanel.add(p.Hdr_bcst_flg);
		p.Hdr_bcst_flg.setNextBeans(p.Hdr_rcst_flg);
		p.Hdr_bcst_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bcst_flg_META);
		p.HdrPanel.add(p.Hdr_rcst_flg);
		p.Hdr_rcst_flg.setNextBeans(p.Hdr_check_bcst_dpt_cd);
		p.Hdr_rcst_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.rcst_flg_META);
		p.Wrk1HdrPanel.add(p.Hdr_rcst_cd_Label);
		p.Wrk1HdrPanel.add(p.Hdr_rcst_cd);
		p.Wrk1HdrPanel.setLastBeans(p.Hdr_rcst_cd);
		p.Hdr_rcst_cd.setNextBeans(p.Hdr_rcst_nm);
		p.Hdr_rcst_cd.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.rcst_cd_META);
		p.Hdr_rcst_cd.addLinkBeans(p.Hdr_rcst_nm);
		p.Hdr_rcst_cd.setListType(MCListType.STRICT);
		p.Wrk1HdrPanel.add(p.Hdr_rcst_nm);
		p.Hdr_rcst_nm.setNextBeans(p.Hdr_ar_cred_cd);
		p.Hdr_rcst_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.rcst_nm_META);
		p.Wrk1HdrPanel.add(p.Hdr_ar_cred_cd_Label);
		p.Wrk1HdrPanel.add(p.Hdr_ar_cred_cd);
		p.Hdr_ar_cred_cd.setNextBeans(p.Hdr_ar_cred_nm);
		p.Hdr_ar_cred_cd.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.ar_cred_cd_META);
		p.Hdr_ar_cred_cd.addLinkBeans(p.Hdr_ar_cred_nm);
		p.Hdr_ar_cred_cd.setListType(MCListType.STRICT);
		p.Wrk1HdrPanel.add(p.Hdr_ar_cred_nm);
		p.Hdr_ar_cred_nm.setNextBeans(p.Hdr_bill_dpt_typ);
		p.Hdr_ar_cred_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.ar_cred_nm_META);
		p.Hdr_bill_dpt_typ.setListType(MCListType.STRICT);
		p.Hdr_bill_dpt_typ.setLinkBeans(p.Hdr_bill_dpt_typ_nm);
		p.Wrk1HdrPanel.add(p.Hdr_bill_dpt_typ_Label);
		p.Wrk1HdrPanel.add(p.Hdr_bill_dpt_typ);
		p.Hdr_bill_dpt_typ.setNextBeans(p.Hdr_bill_dpt_typ_nm);
		p.Hdr_bill_dpt_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_dpt_typ_META);
		p.Wrk1HdrPanel.add(p.Hdr_bill_dpt_typ_nm);
		p.Hdr_bill_dpt_typ_nm.setNextBeans(p.Hdr_bcst_dpt_cd);
		p.Hdr_bill_dpt_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_dpt_typ_nm_META);
		p.Hdr_bcst_dpt_cd.setListType(MCListType.STRICT);
		p.Hdr_bcst_dpt_cd.setLinkBeans(p.Hdr_bcst_dpt_nm);
		p.Wrk1HdrPanel.add(p.Hdr_bcst_dpt_cd_Label);
		p.Wrk1HdrPanel.add(p.Hdr_bcst_dpt_cd);
		p.Hdr_bcst_dpt_cd.setNextBeans(p.Hdr_bcst_dpt_nm);
		p.Hdr_bcst_dpt_cd.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bcst_dpt_cd_META);
		p.Wrk1HdrPanel.add(p.Hdr_bcst_dpt_nm);
		p.Hdr_bcst_dpt_nm.setNextBeans(p.Hdr_bill_cl_typ);
		p.Hdr_bcst_dpt_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bcst_dpt_nm_META);
		p.HdrPanel.add(p.Hdr_check_bcst_dpt_cd);
		p.Hdr_check_bcst_dpt_cd.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.check_bcst_dpt_cd_META);
		p.Hdr_bill_cl_typ.setListType(MCListType.STRICT);
		p.Hdr_bill_cl_typ.setLinkBeans(p.Hdr_bill_cl_typ_nm);
		p.Wrk1HdrPanel.add(p.Hdr_bill_cl_typ_Label);
		p.Wrk1HdrPanel.add(p.Hdr_bill_cl_typ);
		p.Hdr_bill_cl_typ.setNextBeans(p.Hdr_bill_cl_typ_nm);
		p.Hdr_bill_cl_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_cl_typ_META);
		p.Wrk1HdrPanel.add(p.Hdr_bill_cl_typ_nm);
		p.Hdr_bill_cl_typ_nm.setNextBeans(p.Hdr_bill_cl_day1);
		p.Hdr_bill_cl_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_cl_typ_nm_META);
		p.Wrk1HdrPanel.add(p.Hdr_bill_cl_day1_Label);
		p.Wrk1HdrPanel.add(p.Hdr_bill_cl_day1);
		p.Hdr_bill_cl_day1.setNextBeans(p.Hdr_bill_cl_day2);
		p.Hdr_bill_cl_day1.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_cl_day1_META);
		p.Wrk1HdrPanel.add(p.Hdr_bill_cl_day2_Label);
		p.Wrk1HdrPanel.add(p.Hdr_bill_cl_day2);
		p.Hdr_bill_cl_day2.setNextBeans(p.Hdr_bill_cl_day3);
		p.Hdr_bill_cl_day2.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_cl_day2_META);
		p.Wrk1HdrPanel.add(p.Hdr_bill_cl_day3_Label);
		p.Wrk1HdrPanel.add(p.Hdr_bill_cl_day3);
		p.Hdr_bill_cl_day3.setNextBeans(p.Hdr_bill_cl_day4);
		p.Hdr_bill_cl_day3.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_cl_day3_META);
		p.Wrk1HdrPanel.add(p.Hdr_bill_cl_day4_Label);
		p.Wrk1HdrPanel.add(p.Hdr_bill_cl_day4);
		p.Hdr_bill_cl_day4.setNextBeans(p.Hdr_bill_cl_day5);
		p.Hdr_bill_cl_day4.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_cl_day4_META);
		p.Wrk1HdrPanel.add(p.Hdr_bill_cl_day5_Label);
		p.Wrk1HdrPanel.add(p.Hdr_bill_cl_day5);
		p.Hdr_bill_cl_day5.setNextBeans(p.Hdr_tax_on_bill_flg);
		p.Hdr_bill_cl_day5.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_cl_day5_META);
		p.Wrk1HdrPanel.add(p.Hdr_tax_on_bill_flg);
		p.Hdr_tax_on_bill_flg.setNextBeans(p.Hdr_bill_tax_rnd_typ);
		p.Hdr_tax_on_bill_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.tax_on_bill_flg_META);
		p.Hdr_bill_tax_rnd_typ.setListType(MCListType.STRICT);
		p.Hdr_bill_tax_rnd_typ.setLinkBeans(p.Hdr_bill_tax_rnd_typ_nm);
		p.Wrk1HdrPanel.add(p.Hdr_bill_tax_rnd_typ_Label);
		p.Wrk1HdrPanel.add(p.Hdr_bill_tax_rnd_typ);
		p.Hdr_bill_tax_rnd_typ.setNextBeans(p.Hdr_bill_tax_rnd_typ_nm);
		p.Hdr_bill_tax_rnd_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_tax_rnd_typ_META);
		p.Wrk1HdrPanel.add(p.Hdr_bill_tax_rnd_typ_nm);
		p.Hdr_bill_tax_rnd_typ_nm.setNextBeans(p.Hdr_bill_cl_delay_days);
		p.Hdr_bill_tax_rnd_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_tax_rnd_typ_nm_META);
		p.Wrk1HdrPanel.add(p.Hdr_bill_cl_delay_days_Label);
		p.Wrk1HdrPanel.add(p.Hdr_bill_cl_delay_days);
		p.Hdr_bill_cl_delay_days.setNextBeans(p.Hdr_bill_cl_ba_typ);
		p.Hdr_bill_cl_delay_days.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_cl_delay_days_META);
		p.Hdr_bill_cl_ba_typ.setListType(MCListType.STRICT);
		p.Hdr_bill_cl_ba_typ.setLinkBeans(p.Hdr_bill_cl_ba_typ_nm);
		p.Wrk1HdrPanel.add(p.Hdr_bill_cl_ba_typ_Label);
		p.Wrk1HdrPanel.add(p.Hdr_bill_cl_ba_typ);
		p.Hdr_bill_cl_ba_typ.setNextBeans(p.Hdr_bill_cl_ba_typ_nm);
		p.Hdr_bill_cl_ba_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_cl_ba_typ_META);
		p.Wrk1HdrPanel.add(p.Hdr_bill_cl_ba_typ_nm);
		p.Hdr_bill_cl_ba_typ_nm.setNextBeans(p.Hdr_bill_cal_cd);
		p.Hdr_bill_cl_ba_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_cl_ba_typ_nm_META);
		p.Hdr_bill_cal_cd.setListType(MCListType.STRICT);
		p.Hdr_bill_cal_cd.setLinkBeans(p.Hdr_bill_cal_nm);
		p.Wrk1HdrPanel.add(p.Hdr_bill_cal_cd_Label);
		p.Wrk1HdrPanel.add(p.Hdr_bill_cal_cd);
		p.Hdr_bill_cal_cd.setNextBeans(p.Hdr_bill_cal_nm);
		p.Hdr_bill_cal_cd.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_cal_cd_META);
		p.Wrk1HdrPanel.add(p.Hdr_bill_cal_nm);
		p.Hdr_bill_cal_nm.setNextBeans(p.Hdr_rcv_ba_typ);
		p.Hdr_bill_cal_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_cal_nm_META);
		p.Hdr_rcv_ba_typ.setListType(MCListType.STRICT);
		p.Hdr_rcv_ba_typ.setLinkBeans(p.Hdr_rcv_ba_typ_nm);
		p.Wrk1HdrPanel.add(p.Hdr_rcv_ba_typ_Label);
		p.Wrk1HdrPanel.add(p.Hdr_rcv_ba_typ);
		p.Hdr_rcv_ba_typ.setNextBeans(p.Hdr_rcv_ba_typ_nm);
		p.Hdr_rcv_ba_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.rcv_ba_typ_META);
		p.Wrk1HdrPanel.add(p.Hdr_rcv_ba_typ_nm);
		p.Hdr_rcv_ba_typ_nm.setNextBeans(p.Hdr_auto_line_appl_flg);
		p.Hdr_rcv_ba_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.rcv_ba_typ_nm_META);
		p.Wrk1HdrPanel.add(p.Hdr_auto_line_appl_flg);
		p.Hdr_auto_line_appl_flg.setNextBeans(p.Hdr_sls_interim_cl_flg);
		p.Hdr_auto_line_appl_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.auto_line_appl_flg_META);
		p.Wrk1HdrPanel.add(p.Hdr_sls_interim_cl_flg);
		p.Hdr_sls_interim_cl_flg.setNextBeans(p.Hdr_ar_setoff_grp_cd);
		p.Hdr_sls_interim_cl_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.sls_interim_cl_flg_META);
		p.Hdr_ar_setoff_grp_cd.setListType(MCListType.STRICT);
		p.Hdr_ar_setoff_grp_cd.setLinkBeans(p.Hdr_ar_setoff_grp_nm);
		p.Wrk1HdrPanel.add(p.Hdr_ar_setoff_grp_cd_Label);
		p.Wrk1HdrPanel.add(p.Hdr_ar_setoff_grp_cd);
		p.Hdr_ar_setoff_grp_cd.setNextBeans(p.Hdr_ar_setoff_grp_nm);
		p.Hdr_ar_setoff_grp_cd.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.ar_setoff_grp_cd_META);
		p.Wrk1HdrPanel.add(p.Hdr_ar_setoff_grp_nm);
		p.Hdr_ar_setoff_grp_nm.setNextBeans(p.Hdr_bcst_prnt_typ);
		p.Hdr_ar_setoff_grp_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.ar_setoff_grp_nm_META);
		p.Hdr_bcst_prnt_typ.setListType(MCListType.STRICT);
		p.Hdr_bcst_prnt_typ.setLinkBeans(p.Hdr_bcst_prnt_typ_nm);
		p.Wrk1HdrPanel.add(p.Hdr_bcst_prnt_typ_Label);
		p.Wrk1HdrPanel.add(p.Hdr_bcst_prnt_typ);
		p.Hdr_bcst_prnt_typ.setNextBeans(p.Hdr_bcst_prnt_typ_nm);
		p.Hdr_bcst_prnt_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bcst_prnt_typ_META);
		p.Wrk1HdrPanel.add(p.Hdr_bcst_prnt_typ_nm);
		p.Hdr_bcst_prnt_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bcst_prnt_typ_nm_META);
		p.Wrk2HdrPanel.add(p.Hdr_bill_zip_cd_Label);
		p.Wrk2HdrPanel.add(p.Hdr_bill_zip_cd);
		p.Wrk2HdrPanel.setLastBeans(p.Hdr_bill_zip_cd);
		p.Hdr_bill_zip_cd.setNextBeans(p.Hdr_bill_addr1);
		p.Hdr_bill_zip_cd.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_zip_cd_META);
		p.Wrk2HdrPanel.add(p.Hdr_bill_addr1_Label);
		p.Wrk2HdrPanel.add(p.Hdr_bill_addr1);
		p.Hdr_bill_addr1.setNextBeans(p.Hdr_bill_addr2);
		p.Hdr_bill_addr1.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_addr1_META);
		p.Wrk2HdrPanel.add(p.Hdr_bill_addr2_Label);
		p.Wrk2HdrPanel.add(p.Hdr_bill_addr2);
		p.Hdr_bill_addr2.setNextBeans(p.Hdr_bill_addr3);
		p.Hdr_bill_addr2.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_addr2_META);
		p.Wrk2HdrPanel.add(p.Hdr_bill_addr3_Label);
		p.Wrk2HdrPanel.add(p.Hdr_bill_addr3);
		p.Hdr_bill_addr3.setNextBeans(p.Hdr_bill_addr4);
		p.Hdr_bill_addr3.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_addr3_META);
		p.Wrk2HdrPanel.add(p.Hdr_bill_addr4_Label);
		p.Wrk2HdrPanel.add(p.Hdr_bill_addr4);
		p.Hdr_bill_addr4.setNextBeans(p.Hdr_bill_tel);
		p.Hdr_bill_addr4.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_addr4_META);
		p.Wrk2HdrPanel.add(p.Hdr_bill_tel_Label);
		p.Wrk2HdrPanel.add(p.Hdr_bill_tel);
		p.Hdr_bill_tel.setNextBeans(p.Hdr_bill_bcst_nm);
		p.Hdr_bill_tel.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_tel_META);
		p.Wrk2HdrPanel.add(p.Hdr_bill_bcst_nm_Label);
		p.Wrk2HdrPanel.add(p.Hdr_bill_bcst_nm);
		p.Hdr_bill_bcst_nm.setNextBeans(p.Hdr_bill_bcst_dpt);
		p.Hdr_bill_bcst_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_bcst_nm_META);
		p.Wrk2HdrPanel.add(p.Hdr_bill_bcst_dpt_Label);
		p.Wrk2HdrPanel.add(p.Hdr_bill_bcst_dpt);
		p.Hdr_bill_bcst_dpt.setNextBeans(p.Hdr_bill_bcst_psn);
		p.Hdr_bill_bcst_dpt.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_bcst_dpt_META);
		p.Wrk2HdrPanel.add(p.Hdr_bill_bcst_psn_Label);
		p.Wrk2HdrPanel.add(p.Hdr_bill_bcst_psn);
		p.Hdr_bill_bcst_psn.setNextBeans(p.Hdr_bill_bcst_psn_title);
		p.Hdr_bill_bcst_psn.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_bcst_psn_META);
		p.Wrk2HdrPanel.add(p.Hdr_bill_bcst_psn_title_Label);
		p.Wrk2HdrPanel.add(p.Hdr_bill_bcst_psn_title);
		p.Hdr_bill_bcst_psn_title.setNextBeans(p.Hdr_bill_prnt_typ);
		p.Hdr_bill_bcst_psn_title.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_bcst_psn_title_META);
		p.Hdr_bill_prnt_typ.setListType(MCListType.STRICT);
		p.Hdr_bill_prnt_typ.setLinkBeans(p.Hdr_bill_prnt_typ_nm);
		p.Wrk2HdrPanel.add(p.Hdr_bill_prnt_typ_Label);
		p.Wrk2HdrPanel.add(p.Hdr_bill_prnt_typ);
		p.Hdr_bill_prnt_typ.setNextBeans(p.Hdr_bill_prnt_typ_nm);
		p.Hdr_bill_prnt_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_prnt_typ_META);
		p.Wrk2HdrPanel.add(p.Hdr_bill_prnt_typ_nm);
		p.Hdr_bill_prnt_typ_nm.setNextBeans(p.Hdr_sls_dtl_outp_typ);
		p.Hdr_bill_prnt_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_prnt_typ_nm_META);
		p.Hdr_sls_dtl_outp_typ.setListType(MCListType.STRICT);
		p.Hdr_sls_dtl_outp_typ.setLinkBeans(p.Hdr_sls_dtl_outp_typ_nm);
		p.Wrk2HdrPanel.add(p.Hdr_sls_dtl_outp_typ_Label);
		p.Wrk2HdrPanel.add(p.Hdr_sls_dtl_outp_typ);
		p.Hdr_sls_dtl_outp_typ.setNextBeans(p.Hdr_sls_dtl_outp_typ_nm);
		p.Hdr_sls_dtl_outp_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.sls_dtl_outp_typ_META);
		p.Wrk2HdrPanel.add(p.Hdr_sls_dtl_outp_typ_nm);
		p.Hdr_sls_dtl_outp_typ_nm.setNextBeans(p.Hdr_bill_dtl_outp_flg);
		p.Hdr_sls_dtl_outp_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.sls_dtl_outp_typ_nm_META);
		p.Wrk2HdrPanel.add(p.Hdr_bill_dtl_outp_flg);
		p.Hdr_bill_dtl_outp_flg.setNextBeans(p.Hdr_bfw_bal_disp_flg);
		p.Hdr_bill_dtl_outp_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_dtl_outp_flg_META);
		p.Wrk2HdrPanel.add(p.Hdr_bfw_bal_disp_flg);
		p.Hdr_bfw_bal_disp_flg.setNextBeans(p.Hdr_bill_dtl_adv_flg);
		p.Hdr_bfw_bal_disp_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bfw_bal_disp_flg_META);
		p.Wrk2HdrPanel.add(p.Hdr_bill_dtl_adv_flg);
		p.Hdr_bill_dtl_adv_flg.setNextBeans(p.Hdr_bill_dtl_rcv_flg);
		p.Hdr_bill_dtl_adv_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_dtl_adv_flg_META);
		p.Wrk2HdrPanel.add(p.Hdr_bill_dtl_rcv_flg);
		p.Hdr_bill_dtl_rcv_flg.setNextBeans(p.Hdr_bill_dtl_subttl_typ);
		p.Hdr_bill_dtl_rcv_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_dtl_rcv_flg_META);
		p.Hdr_bill_dtl_subttl_typ.setListType(MCListType.STRICT);
		p.Hdr_bill_dtl_subttl_typ.setLinkBeans(p.Hdr_bill_dtl_subttl_typ_nm);
		p.Wrk2HdrPanel.add(p.Hdr_bill_dtl_subttl_typ_Label);
		p.Wrk2HdrPanel.add(p.Hdr_bill_dtl_subttl_typ);
		p.Hdr_bill_dtl_subttl_typ.setNextBeans(p.Hdr_bill_dtl_subttl_typ_nm);
		p.Hdr_bill_dtl_subttl_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_dtl_subttl_typ_META);
		p.Wrk2HdrPanel.add(p.Hdr_bill_dtl_subttl_typ_nm);
		p.Hdr_bill_dtl_subttl_typ_nm.setNextBeans(p.Hdr_bill_dtl_brk_typ);
		p.Hdr_bill_dtl_subttl_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_dtl_subttl_typ_nm_META);
		p.Hdr_bill_dtl_brk_typ.setListType(MCListType.STRICT);
		p.Hdr_bill_dtl_brk_typ.setLinkBeans(p.Hdr_bill_dtl_brk_typ_nm);
		p.Wrk2HdrPanel.add(p.Hdr_bill_dtl_brk_typ_Label);
		p.Wrk2HdrPanel.add(p.Hdr_bill_dtl_brk_typ);
		p.Hdr_bill_dtl_brk_typ.setNextBeans(p.Hdr_bill_dtl_brk_typ_nm);
		p.Hdr_bill_dtl_brk_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_dtl_brk_typ_META);
		p.Wrk2HdrPanel.add(p.Hdr_bill_dtl_brk_typ_nm);
		p.Hdr_bill_dtl_brk_typ_nm.setNextBeans(p.Hdr_bill_dtl_sort_typ);
		p.Hdr_bill_dtl_brk_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_dtl_brk_typ_nm_META);
		p.Hdr_bill_dtl_sort_typ.setListType(MCListType.STRICT);
		p.Hdr_bill_dtl_sort_typ.setLinkBeans(p.Hdr_bill_dtl_sort_typ_nm);
		p.Wrk2HdrPanel.add(p.Hdr_bill_dtl_sort_typ_Label);
		p.Wrk2HdrPanel.add(p.Hdr_bill_dtl_sort_typ);
		p.Hdr_bill_dtl_sort_typ.setNextBeans(p.Hdr_bill_dtl_sort_typ_nm);
		p.Hdr_bill_dtl_sort_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_dtl_sort_typ_META);
		p.Wrk2HdrPanel.add(p.Hdr_bill_dtl_sort_typ_nm);
		p.Hdr_bill_dtl_sort_typ_nm.setNextBeans(p.Hdr_bill_can_slip_typ);
		p.Hdr_bill_dtl_sort_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_dtl_sort_typ_nm_META);
		p.Hdr_bill_can_slip_typ.setListType(MCListType.STRICT);
		p.Hdr_bill_can_slip_typ.setLinkBeans(p.Hdr_bill_can_slip_typ_nm);
		p.Wrk2HdrPanel.add(p.Hdr_bill_can_slip_typ_Label);
		p.Wrk2HdrPanel.add(p.Hdr_bill_can_slip_typ);
		p.Hdr_bill_can_slip_typ.setNextBeans(p.Hdr_bill_can_slip_typ_nm);
		p.Hdr_bill_can_slip_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_can_slip_typ_META);
		p.Wrk2HdrPanel.add(p.Hdr_bill_can_slip_typ_nm);
		p.Hdr_bill_can_slip_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.bill_can_slip_typ_nm_META);
		p.Wrk3HdrPanel.add(p.Hdr_rcv_auto_appl_tgt_flg);
		p.Wrk3HdrPanel.setLastBeans(p.Hdr_rcv_auto_appl_tgt_flg);
		p.Hdr_rcv_auto_appl_tgt_flg.setNextBeans(p.Hdr_rcv_amt_match_flg);
		p.Hdr_rcv_auto_appl_tgt_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.rcv_auto_appl_tgt_flg_META);
		p.Wrk3HdrPanel.add(p.Hdr_rcv_amt_match_flg);
		p.Hdr_rcv_amt_match_flg.setNextBeans(p.Hdr_ar_sttl_typ_match_flg);
		p.Hdr_rcv_amt_match_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.rcv_amt_match_flg_META);
		p.Wrk3HdrPanel.add(p.Hdr_ar_sttl_typ_match_flg);
		p.Hdr_ar_sttl_typ_match_flg.setNextBeans(p.Hdr_calc_com_paid_flg);
		p.Hdr_ar_sttl_typ_match_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.ar_sttl_typ_match_flg_META);
		p.Wrk3HdrPanel.add(p.Hdr_calc_com_paid_flg);
		p.Hdr_calc_com_paid_flg.setNextBeans(p.Hdr_auto_appl_delay_days);
		p.Hdr_calc_com_paid_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.calc_com_paid_flg_META);
		p.Wrk3HdrPanel.add(p.Hdr_auto_appl_delay_days_Label);
		p.Wrk3HdrPanel.add(p.Hdr_auto_appl_delay_days);
		p.Hdr_auto_appl_delay_days.setNextBeans(p.Hdr_xfr_psn);
		p.Hdr_auto_appl_delay_days.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.auto_appl_delay_days_META);
		p.Wrk3HdrPanel.add(p.Hdr_xfr_psn_Label);
		p.Wrk3HdrPanel.add(p.Hdr_xfr_psn);
		p.Hdr_xfr_psn.setNextBeans(p.Hdr_rcst_prnt_typ);
		p.Hdr_xfr_psn.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.xfr_psn_META);
		p.Hdr_rcst_prnt_typ.setListType(MCListType.STRICT);
		p.Hdr_rcst_prnt_typ.setLinkBeans(p.Hdr_rcst_prnt_typ_nm);
		p.Wrk3HdrPanel.add(p.Hdr_rcst_prnt_typ_Label);
		p.Wrk3HdrPanel.add(p.Hdr_rcst_prnt_typ);
		p.Hdr_rcst_prnt_typ.setNextBeans(p.Hdr_rcst_prnt_typ_nm);
		p.Hdr_rcst_prnt_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.rcst_prnt_typ_META);
		p.Wrk3HdrPanel.add(p.Hdr_rcst_prnt_typ_nm);
		p.Hdr_rcst_prnt_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0560.HdrR.rcst_prnt_typ_nm_META);
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlTab(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.DtlTabPanel.add(p.DtlTabTab);
		p.DtlTabPanel.setLastBeans(p.DtlTabTab);
		p.DtlTabPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.DtlTabTab.add(p.Wrk1HdrPanel, "DtlTab.tab1");
		p.DtlTabTab.setLastBeans(p.Wrk1HdrPanel);
		p.Wrk1HdrPanel.setNextBeans(p.Wrk2HdrPanel);
		p.DtlTabTab.add(p.Wrk2HdrPanel, "DtlTab.tab2");
		p.Wrk2HdrPanel.setNextBeans(p.Wrk3HdrPanel);
		p.DtlTabTab.add(p.Wrk3HdrPanel, "DtlTab.tab3");
		p.Wrk3HdrPanel.setNextBeans(p.Wrk4Panel);
		p.DtlTabTab.add(p.Wrk4Panel, "DtlTab.tab4");
		p.Wrk4Panel.setNextBeans(p.Wrk7Panel);
		p.DtlTabTab.add(p.Wrk7Panel, "DtlTab.tab7");
		p.Wrk7Panel.setNextBeans(p.Wrk5Panel);
		p.DtlTabTab.add(p.Wrk5Panel, "DtlTab.tab5");
		p.Wrk5Panel.setNextBeans(p.Wrk6Panel);
		p.DtlTabTab.add(p.Wrk6Panel, "DtlTab.tab6");
	}

	/**
	 * [Wrk1Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk1Hdr(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk1HdrPanel.setNextBeans(p.Wrk2HdrPanel);
		p.Wrk1HdrPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk2Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk2Hdr(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk2HdrPanel.setNextBeans(p.Wrk3HdrPanel);
		p.Wrk2HdrPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk3Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk3Hdr(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk3HdrPanel.setNextBeans(p.Wrk4Panel);
		p.Wrk3HdrPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk4(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk4Panel.setNextBeans(p.Wrk7Panel);
		p.Wrk4Panel.setLayoutPosition("CTC+");
		// ブロックの項目の初期化
		p.Wrk4Panel.add(p.Wrk4HdrPanel, null);
		p.Wrk4Panel.setLastBeans(p.Wrk4HdrPanel);
		p.Wrk4HdrPanel.setNextBeans(p.Wrk4DtlPanel);
		p.Wrk4Panel.add(p.Wrk4DtlPanel, null);
		p.Wrk4DtlPanel.setNextBeans(p.Wrk4DtlBtnPanel);
		p.Wrk4Panel.add(p.Wrk4DtlBtnPanel, null);
	}

	/**
	 * [Wrk4Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk4Hdr(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk4HdrPanel.setValueCheck(false);
		p.Wrk4HdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Wrk4HdrPanel.add(p.Wrk4Hdr_bill_cl_day1_Label);
		p.Wrk4HdrPanel.add(p.Wrk4Hdr_bill_cl_day1);
		p.Wrk4HdrPanel.setLastBeans(p.Wrk4Hdr_bill_cl_day1);
		p.Wrk4Hdr_bill_cl_day1.setNextBeans(p.Wrk4Hdr_bill_cl_day2);
		p.Wrk4Hdr_bill_cl_day1.setRow(p.getWrk4HdrR(), mcframe.clientMABC.MABCP0560.Wrk4HdrR.bill_cl_day1_META);
		p.Wrk4HdrPanel.add(p.Wrk4Hdr_bill_cl_day2_Label);
		p.Wrk4HdrPanel.add(p.Wrk4Hdr_bill_cl_day2);
		p.Wrk4Hdr_bill_cl_day2.setNextBeans(p.Wrk4Hdr_bill_cl_day3);
		p.Wrk4Hdr_bill_cl_day2.setRow(p.getWrk4HdrR(), mcframe.clientMABC.MABCP0560.Wrk4HdrR.bill_cl_day2_META);
		p.Wrk4HdrPanel.add(p.Wrk4Hdr_bill_cl_day3_Label);
		p.Wrk4HdrPanel.add(p.Wrk4Hdr_bill_cl_day3);
		p.Wrk4Hdr_bill_cl_day3.setNextBeans(p.Wrk4Hdr_bill_cl_day4);
		p.Wrk4Hdr_bill_cl_day3.setRow(p.getWrk4HdrR(), mcframe.clientMABC.MABCP0560.Wrk4HdrR.bill_cl_day3_META);
		p.Wrk4HdrPanel.add(p.Wrk4Hdr_bill_cl_day4_Label);
		p.Wrk4HdrPanel.add(p.Wrk4Hdr_bill_cl_day4);
		p.Wrk4Hdr_bill_cl_day4.setNextBeans(p.Wrk4Hdr_bill_cl_day5);
		p.Wrk4Hdr_bill_cl_day4.setRow(p.getWrk4HdrR(), mcframe.clientMABC.MABCP0560.Wrk4HdrR.bill_cl_day4_META);
		p.Wrk4HdrPanel.add(p.Wrk4Hdr_bill_cl_day5_Label);
		p.Wrk4HdrPanel.add(p.Wrk4Hdr_bill_cl_day5);
		p.Wrk4Hdr_bill_cl_day5.setRow(p.getWrk4HdrR(), mcframe.clientMABC.MABCP0560.Wrk4HdrR.bill_cl_day5_META);
	}

	/**
	 * [Wrk4Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk4Dtl(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk4DtlPanel.add(p.Wrk4DtlScrollPane);
		p.Wrk4DtlPanel.setLastBeans(p.Wrk4DtlTable);
		p.Wrk4DtlScrollPane.setViewportView(p.Wrk4DtlTable);
		p.Wrk4DtlTable.setList(p.getWrk4DtlL());
		p.Wrk4DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk4DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk4DtlBtn(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk4DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Wrk4DtlBtn_select_all.setIcon("SELECT_ALL");
		p.Wrk4DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Wrk4DtlBtnPanel.add(p.Wrk4DtlBtn_select_all);
		p.Wrk4DtlBtnPanel.setLastBeans(p.Wrk4DtlBtn_select_all);
		p.Wrk4DtlBtn_select_all.setNextBeans(p.Wrk4DtlBtn_deselect_all);
		p.Wrk4DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.Wrk4DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Wrk4DtlBtnPanel.add(p.Wrk4DtlBtn_deselect_all);
		p.Wrk4DtlBtn_deselect_all.setNextBeans(p.Wrk4DtlBtn_radd);
		p.Wrk4DtlBtn_radd.setIcon("INSERT_RECORD");
		p.Wrk4DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.Wrk4DtlBtnPanel.add(p.Wrk4DtlBtn_radd);
		p.Wrk4DtlBtn_radd.setNextBeans(p.Wrk4DtlBtn_rdel);
		p.Wrk4DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.Wrk4DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.Wrk4DtlBtnPanel.add(p.Wrk4DtlBtn_rdel);
		p.Wrk4DtlBtn_rdel.setNextBeans(p.Wrk4DtlBtn_rcopy);
		p.Wrk4DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.Wrk4DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.Wrk4DtlBtnPanel.add(p.Wrk4DtlBtn_rcopy);
	}

	/**
	 * [Wrk7]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk7(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk7Panel.setNextBeans(p.Wrk5Panel);
		p.Wrk7Panel.setLayoutPosition("CTC+");
		// ブロックの項目の初期化
		p.Wrk7Panel.add(p.Wrk7HdrPanel, null);
		p.Wrk7Panel.setLastBeans(p.Wrk7HdrPanel);
		p.Wrk7HdrPanel.setNextBeans(p.Wrk7DtlPanel);
		p.Wrk7Panel.add(p.Wrk7DtlPanel, null);
		p.Wrk7DtlPanel.setNextBeans(p.Wrk7DtlBtnPanel);
		p.Wrk7Panel.add(p.Wrk7DtlBtnPanel, null);
	}

	/**
	 * [Wrk7Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk7Hdr(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk7HdrPanel.setValueCheck(false);
		p.Wrk7HdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Wrk7HdrPanel.add(p.Wrk7Hdr_st_dt_Label);
		p.Wrk7HdrPanel.add(p.Wrk7Hdr_st_dt);
		p.Wrk7HdrPanel.setLastBeans(p.Wrk7Hdr_st_dt);
		p.Wrk7Hdr_st_dt.setNextBeans(p.Wrk7Hdr_end_dt);
		p.Wrk7Hdr_st_dt.setRow(p.getWrk7HdrR(), mcframe.clientMABC.MABCP0560.Wrk7HdrR.st_dt_META);
		p.Wrk7Hdr_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk7HdrPanel.add(p.Wrk7Hdr_end_dt_Label);
		p.Wrk7HdrPanel.add(p.Wrk7Hdr_end_dt);
		p.Wrk7Hdr_end_dt.setNextBeans(p.Wrk7Hdr_set_dt);
		p.Wrk7Hdr_end_dt.setRow(p.getWrk7HdrR(), mcframe.clientMABC.MABCP0560.Wrk7HdrR.end_dt_META);
		p.Wrk7Hdr_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk7Hdr_set_dt.setFunctionKey(MCFunctionKey.F7);
		p.Wrk7HdrPanel.add(p.Wrk7Hdr_set_dt);
	}

	/**
	 * [Wrk7Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk7Dtl(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk7DtlPanel.add(p.Wrk7DtlScrollPane);
		p.Wrk7DtlPanel.setLastBeans(p.Wrk7DtlTable);
		p.Wrk7DtlScrollPane.setViewportView(p.Wrk7DtlTable);
		p.Wrk7DtlTable.setList(p.getWrk7DtlL());
		p.Wrk7DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk7DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk7DtlBtn(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk7DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Wrk7DtlBtn_select_all.setIcon("SELECT_ALL");
		p.Wrk7DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Wrk7DtlBtnPanel.add(p.Wrk7DtlBtn_select_all);
		p.Wrk7DtlBtnPanel.setLastBeans(p.Wrk7DtlBtn_select_all);
		p.Wrk7DtlBtn_select_all.setNextBeans(p.Wrk7DtlBtn_deselect_all);
		p.Wrk7DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.Wrk7DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Wrk7DtlBtnPanel.add(p.Wrk7DtlBtn_deselect_all);
		p.Wrk7DtlBtn_deselect_all.setNextBeans(p.Wrk7DtlBtn_radd);
		p.Wrk7DtlBtn_radd.setIcon("INSERT_RECORD");
		p.Wrk7DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.Wrk7DtlBtnPanel.add(p.Wrk7DtlBtn_radd);
		p.Wrk7DtlBtn_radd.setNextBeans(p.Wrk7DtlBtn_rdel);
		p.Wrk7DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.Wrk7DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.Wrk7DtlBtnPanel.add(p.Wrk7DtlBtn_rdel);
		p.Wrk7DtlBtn_rdel.setNextBeans(p.Wrk7DtlBtn_rcopy);
		p.Wrk7DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.Wrk7DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.Wrk7DtlBtnPanel.add(p.Wrk7DtlBtn_rcopy);
	}

	/**
	 * [Wrk5]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk5(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk5Panel.setNextBeans(p.Wrk6Panel);
		p.Wrk5Panel.setLayoutPosition("CTC+");
		// ブロックの項目の初期化
		p.Wrk5Panel.add(p.Wrk5DtlPanel, null);
		p.Wrk5Panel.setLastBeans(p.Wrk5DtlPanel);
		p.Wrk5DtlPanel.setNextBeans(p.Wrk5DtlBtnPanel);
		p.Wrk5Panel.add(p.Wrk5DtlBtnPanel, null);
	}

	/**
	 * [Wrk5Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk5Dtl(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk5DtlPanel.add(p.Wrk5DtlScrollPane);
		p.Wrk5DtlPanel.setLastBeans(p.Wrk5DtlTable);
		p.Wrk5DtlScrollPane.setViewportView(p.Wrk5DtlTable);
		p.Wrk5DtlTable.setList(p.getWrk5DtlL());
		p.Wrk5DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk5DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk5DtlBtn(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk5DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Wrk5DtlBtn_select_all.setIcon("SELECT_ALL");
		p.Wrk5DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Wrk5DtlBtnPanel.add(p.Wrk5DtlBtn_select_all);
		p.Wrk5DtlBtnPanel.setLastBeans(p.Wrk5DtlBtn_select_all);
		p.Wrk5DtlBtn_select_all.setNextBeans(p.Wrk5DtlBtn_deselect_all);
		p.Wrk5DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.Wrk5DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Wrk5DtlBtnPanel.add(p.Wrk5DtlBtn_deselect_all);
		p.Wrk5DtlBtn_deselect_all.setNextBeans(p.Wrk5DtlBtn_radd);
		p.Wrk5DtlBtn_radd.setIcon("INSERT_RECORD");
		p.Wrk5DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.Wrk5DtlBtnPanel.add(p.Wrk5DtlBtn_radd);
		p.Wrk5DtlBtn_radd.setNextBeans(p.Wrk5DtlBtn_rdel);
		p.Wrk5DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.Wrk5DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.Wrk5DtlBtnPanel.add(p.Wrk5DtlBtn_rdel);
		p.Wrk5DtlBtn_rdel.setNextBeans(p.Wrk5DtlBtn_rcopy);
		p.Wrk5DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.Wrk5DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.Wrk5DtlBtnPanel.add(p.Wrk5DtlBtn_rcopy);
	}

	/**
	 * [Wrk6]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk6(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk6Panel.setLayoutPosition("CTC+");
		// ブロックの項目の初期化
		p.Wrk6Panel.add(p.Wrk6HdrPanel, null);
		p.Wrk6Panel.setLastBeans(p.Wrk6HdrPanel);
		p.Wrk6HdrPanel.setNextBeans(p.Wrk6DtlPanel);
		p.Wrk6Panel.add(p.Wrk6DtlPanel, null);
		p.Wrk6DtlPanel.setNextBeans(p.Wrk6DtlBtnPanel);
		p.Wrk6Panel.add(p.Wrk6DtlBtnPanel, null);
	}

	/**
	 * [Wrk6Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk6Hdr(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk6HdrPanel.setValueCheck(false);
		p.Wrk6HdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Wrk6HdrPanel.add(p.Wrk6Hdr_st_dt_Label);
		p.Wrk6HdrPanel.add(p.Wrk6Hdr_st_dt);
		p.Wrk6HdrPanel.setLastBeans(p.Wrk6Hdr_st_dt);
		p.Wrk6Hdr_st_dt.setNextBeans(p.Wrk6Hdr_end_dt);
		p.Wrk6Hdr_st_dt.setRow(p.getWrk6HdrR(), mcframe.clientMABC.MABCP0560.Wrk6HdrR.st_dt_META);
		p.Wrk6Hdr_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk6HdrPanel.add(p.Wrk6Hdr_end_dt_Label);
		p.Wrk6HdrPanel.add(p.Wrk6Hdr_end_dt);
		p.Wrk6Hdr_end_dt.setNextBeans(p.Wrk6Hdr_set_dt);
		p.Wrk6Hdr_end_dt.setRow(p.getWrk6HdrR(), mcframe.clientMABC.MABCP0560.Wrk6HdrR.end_dt_META);
		p.Wrk6Hdr_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk6HdrPanel.add(p.Wrk6Hdr_set_dt);
	}

	/**
	 * [Wrk6Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk6Dtl(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk6DtlPanel.add(p.Wrk6DtlScrollPane);
		p.Wrk6DtlPanel.setLastBeans(p.Wrk6DtlTable);
		p.Wrk6DtlScrollPane.setViewportView(p.Wrk6DtlTable);
		p.Wrk6DtlTable.setList(p.getWrk6DtlL());
		p.Wrk6DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk6DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk6DtlBtn(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.Wrk6DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Wrk6DtlBtn_select_all.setIcon("SELECT_ALL");
		p.Wrk6DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Wrk6DtlBtnPanel.add(p.Wrk6DtlBtn_select_all);
		p.Wrk6DtlBtnPanel.setLastBeans(p.Wrk6DtlBtn_select_all);
		p.Wrk6DtlBtn_select_all.setNextBeans(p.Wrk6DtlBtn_deselect_all);
		p.Wrk6DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.Wrk6DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Wrk6DtlBtnPanel.add(p.Wrk6DtlBtn_deselect_all);
		p.Wrk6DtlBtn_deselect_all.setNextBeans(p.Wrk6DtlBtn_radd);
		p.Wrk6DtlBtn_radd.setIcon("INSERT_RECORD");
		p.Wrk6DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.Wrk6DtlBtnPanel.add(p.Wrk6DtlBtn_radd);
		p.Wrk6DtlBtn_radd.setNextBeans(p.Wrk6DtlBtn_rdel);
		p.Wrk6DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.Wrk6DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.Wrk6DtlBtnPanel.add(p.Wrk6DtlBtn_rdel);
		p.Wrk6DtlBtn_rdel.setNextBeans(p.Wrk6DtlBtn_rcopy);
		p.Wrk6DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.Wrk6DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.Wrk6DtlBtnPanel.add(p.Wrk6DtlBtn_rcopy);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.HdrAllPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MABCP0510.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MABCP0510);
		p.BtnPanel.setLastBeans(p.Btn_open_MABCP0510);
		p.Btn_open_MABCP0510.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
	}

	/**
	 * [HdrAll]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrAll(MABCP_BcstRcstReg p) {
		// ブロック関連の初期化
		p.add(p.HdrAllPanel);
		p.HdrAllPanel.add(p.HdrAllScrollPane);
		p.HdrAllPanel.setLastBeans(p.HdrAllTable);
		p.HdrAllScrollPane.setViewportView(p.HdrAllTable);
		p.HdrAllTable.setList(p.getHdrAllL());
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
		MABCP_BcstRcstReg_MC.mcInitScreenOpe((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitMst((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitTop((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitFold((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitCnd((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitCtrl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitTbl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitHdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitDtlTab((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitWrk1Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitWrk2Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitWrk3Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitWrk4((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitWrk4Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitWrk4Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitWrk4DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitWrk7((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitWrk7Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitWrk7Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitWrk7DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitWrk5((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitWrk5Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitWrk5DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitWrk6((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitWrk6Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitWrk6Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitWrk6DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.mcInitHdrAll((MABCP_BcstRcstReg)this);

		// [SRCH]ステータスのモードの設定
		MABCP_BcstRcstReg_MC.statusInitSRCH_ScreenOpe((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Mst((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Top((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Fold((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Cnd((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Ctrl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Tbl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_DtlTab((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Wrk1Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Wrk2Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Wrk3Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Wrk4((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Wrk4Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Wrk4Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Wrk4DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Wrk7((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Wrk7Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Wrk7Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Wrk7DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Wrk5((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Wrk5Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Wrk5DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Wrk6((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Wrk6Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Wrk6Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Wrk6DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_Btn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitSRCH_HdrAll((MABCP_BcstRcstReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_BcstRcstReg_MC.statusInitUPD_ScreenOpe((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Mst((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Top((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Fold((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Cnd((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Ctrl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Tbl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_DtlTab((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Wrk1Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Wrk2Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Wrk3Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Wrk4((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Wrk4Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Wrk4Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Wrk4DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Wrk7((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Wrk7Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Wrk7Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Wrk7DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Wrk5((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Wrk5Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Wrk5DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Wrk6((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Wrk6Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Wrk6Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Wrk6DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_Btn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitUPD_HdrAll((MABCP_BcstRcstReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_BcstRcstReg_MC.statusInitFIX_ScreenOpe((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Mst((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Top((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Fold((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Cnd((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Ctrl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Tbl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_DtlTab((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Wrk1Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Wrk2Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Wrk3Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Wrk4((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Wrk4Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Wrk4Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Wrk4DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Wrk7((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Wrk7Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Wrk7Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Wrk7DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Wrk5((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Wrk5Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Wrk5DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Wrk6((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Wrk6Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Wrk6Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Wrk6DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_Btn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitFIX_HdrAll((MABCP_BcstRcstReg)this);

		// [REF]ステータスのモードの設定
		MABCP_BcstRcstReg_MC.statusInitREF_ScreenOpe((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Mst((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Top((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Fold((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Cnd((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Ctrl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Tbl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_DtlTab((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Wrk1Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Wrk2Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Wrk3Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Wrk4((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Wrk4Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Wrk4Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Wrk4DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Wrk7((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Wrk7Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Wrk7Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Wrk7DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Wrk5((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Wrk5Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Wrk5DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Wrk6((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Wrk6Hdr((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Wrk6Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Wrk6DtlBtn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_Btn((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.statusInitREF_HdrAll((MABCP_BcstRcstReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_BcstRcstReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_BcstRcstReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_BcstRcstReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_BcstRcstReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_BcstRcstReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_bp_cd.setListListener(p);
		p.Cnd_bp_cd.addAllListener(p);
		p.Cnd_bp_nm.setListListener(p);
		p.Cnd_bp_nm.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABCP_BcstRcstReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Tbl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTbl(MABCP_BcstRcstReg p) {
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MABCP_BcstRcstReg p) {
		p.Hdr_bp_cd.setListListener(p);
		p.Hdr_bp_cd.addAllListener(p);
		p.Hdr_bp_nm.setListListener(p);
		p.Hdr_bp_nm.addAllListener(p);
		p.Hdr_bcst_flg.addAllListener(p);
		p.Hdr_rcst_flg.addAllListener(p);
		p.Hdr_rcst_cd.setListListener(p);
		p.Hdr_rcst_cd.addAllListener(p);
		p.Hdr_rcst_nm.setListListener(p);
		p.Hdr_rcst_nm.addAllListener(p);
		p.Hdr_ar_cred_cd.setListListener(p);
		p.Hdr_ar_cred_cd.addAllListener(p);
		p.Hdr_ar_cred_nm.setListListener(p);
		p.Hdr_ar_cred_nm.addAllListener(p);
		p.Hdr_bill_dpt_typ.setListListener(p);
		p.Hdr_bill_dpt_typ.addAllListener(p);
		p.Hdr_bill_dpt_typ_nm.setListListener(p);
		p.Hdr_bill_dpt_typ_nm.addAllListener(p);
		p.Hdr_bcst_dpt_cd.setListListener(p);
		p.Hdr_bcst_dpt_cd.addAllListener(p);
		p.Hdr_bcst_dpt_nm.setListListener(p);
		p.Hdr_bcst_dpt_nm.addAllListener(p);
		p.Hdr_check_bcst_dpt_cd.setListListener(p);
		p.Hdr_check_bcst_dpt_cd.addAllListener(p);
		p.Hdr_bill_cl_typ.setListListener(p);
		p.Hdr_bill_cl_typ.addAllListener(p);
		p.Hdr_bill_cl_typ_nm.setListListener(p);
		p.Hdr_bill_cl_typ_nm.addAllListener(p);
		p.Hdr_bill_cl_day1.setListListener(p);
		p.Hdr_bill_cl_day1.addAllListener(p);
		p.Hdr_bill_cl_day2.setListListener(p);
		p.Hdr_bill_cl_day2.addAllListener(p);
		p.Hdr_bill_cl_day3.setListListener(p);
		p.Hdr_bill_cl_day3.addAllListener(p);
		p.Hdr_bill_cl_day4.setListListener(p);
		p.Hdr_bill_cl_day4.addAllListener(p);
		p.Hdr_bill_cl_day5.setListListener(p);
		p.Hdr_bill_cl_day5.addAllListener(p);
		p.Hdr_tax_on_bill_flg.addAllListener(p);
		p.Hdr_bill_tax_rnd_typ.setListListener(p);
		p.Hdr_bill_tax_rnd_typ.addAllListener(p);
		p.Hdr_bill_tax_rnd_typ_nm.setListListener(p);
		p.Hdr_bill_tax_rnd_typ_nm.addAllListener(p);
		p.Hdr_bill_cl_delay_days.setListListener(p);
		p.Hdr_bill_cl_delay_days.addAllListener(p);
		p.Hdr_bill_cl_ba_typ.setListListener(p);
		p.Hdr_bill_cl_ba_typ.addAllListener(p);
		p.Hdr_bill_cl_ba_typ_nm.setListListener(p);
		p.Hdr_bill_cl_ba_typ_nm.addAllListener(p);
		p.Hdr_bill_cal_cd.setListListener(p);
		p.Hdr_bill_cal_cd.addAllListener(p);
		p.Hdr_bill_cal_nm.setListListener(p);
		p.Hdr_bill_cal_nm.addAllListener(p);
		p.Hdr_rcv_ba_typ.setListListener(p);
		p.Hdr_rcv_ba_typ.addAllListener(p);
		p.Hdr_rcv_ba_typ_nm.setListListener(p);
		p.Hdr_rcv_ba_typ_nm.addAllListener(p);
		p.Hdr_auto_line_appl_flg.addAllListener(p);
		p.Hdr_sls_interim_cl_flg.addAllListener(p);
		p.Hdr_ar_setoff_grp_cd.setListListener(p);
		p.Hdr_ar_setoff_grp_cd.addAllListener(p);
		p.Hdr_ar_setoff_grp_nm.setListListener(p);
		p.Hdr_ar_setoff_grp_nm.addAllListener(p);
		p.Hdr_bcst_prnt_typ.setListListener(p);
		p.Hdr_bcst_prnt_typ.addAllListener(p);
		p.Hdr_bcst_prnt_typ_nm.setListListener(p);
		p.Hdr_bcst_prnt_typ_nm.addAllListener(p);
		p.Hdr_bill_zip_cd.setListListener(p);
		p.Hdr_bill_zip_cd.addAllListener(p);
		p.Hdr_bill_addr1.setListListener(p);
		p.Hdr_bill_addr1.addAllListener(p);
		p.Hdr_bill_addr2.setListListener(p);
		p.Hdr_bill_addr2.addAllListener(p);
		p.Hdr_bill_addr3.setListListener(p);
		p.Hdr_bill_addr3.addAllListener(p);
		p.Hdr_bill_addr4.setListListener(p);
		p.Hdr_bill_addr4.addAllListener(p);
		p.Hdr_bill_tel.setListListener(p);
		p.Hdr_bill_tel.addAllListener(p);
		p.Hdr_bill_bcst_nm.setListListener(p);
		p.Hdr_bill_bcst_nm.addAllListener(p);
		p.Hdr_bill_bcst_dpt.setListListener(p);
		p.Hdr_bill_bcst_dpt.addAllListener(p);
		p.Hdr_bill_bcst_psn.setListListener(p);
		p.Hdr_bill_bcst_psn.addAllListener(p);
		p.Hdr_bill_bcst_psn_title.setListListener(p);
		p.Hdr_bill_bcst_psn_title.addAllListener(p);
		p.Hdr_bill_prnt_typ.setListListener(p);
		p.Hdr_bill_prnt_typ.addAllListener(p);
		p.Hdr_bill_prnt_typ_nm.setListListener(p);
		p.Hdr_bill_prnt_typ_nm.addAllListener(p);
		p.Hdr_sls_dtl_outp_typ.setListListener(p);
		p.Hdr_sls_dtl_outp_typ.addAllListener(p);
		p.Hdr_sls_dtl_outp_typ_nm.setListListener(p);
		p.Hdr_sls_dtl_outp_typ_nm.addAllListener(p);
		p.Hdr_bill_dtl_outp_flg.addAllListener(p);
		p.Hdr_bfw_bal_disp_flg.addAllListener(p);
		p.Hdr_bill_dtl_adv_flg.addAllListener(p);
		p.Hdr_bill_dtl_rcv_flg.addAllListener(p);
		p.Hdr_bill_dtl_subttl_typ.setListListener(p);
		p.Hdr_bill_dtl_subttl_typ.addAllListener(p);
		p.Hdr_bill_dtl_subttl_typ_nm.setListListener(p);
		p.Hdr_bill_dtl_subttl_typ_nm.addAllListener(p);
		p.Hdr_bill_dtl_brk_typ.setListListener(p);
		p.Hdr_bill_dtl_brk_typ.addAllListener(p);
		p.Hdr_bill_dtl_brk_typ_nm.setListListener(p);
		p.Hdr_bill_dtl_brk_typ_nm.addAllListener(p);
		p.Hdr_bill_dtl_sort_typ.setListListener(p);
		p.Hdr_bill_dtl_sort_typ.addAllListener(p);
		p.Hdr_bill_dtl_sort_typ_nm.setListListener(p);
		p.Hdr_bill_dtl_sort_typ_nm.addAllListener(p);
		p.Hdr_bill_can_slip_typ.setListListener(p);
		p.Hdr_bill_can_slip_typ.addAllListener(p);
		p.Hdr_bill_can_slip_typ_nm.setListListener(p);
		p.Hdr_bill_can_slip_typ_nm.addAllListener(p);
		p.Hdr_rcv_auto_appl_tgt_flg.addAllListener(p);
		p.Hdr_rcv_amt_match_flg.addAllListener(p);
		p.Hdr_ar_sttl_typ_match_flg.addAllListener(p);
		p.Hdr_calc_com_paid_flg.addAllListener(p);
		p.Hdr_auto_appl_delay_days.setListListener(p);
		p.Hdr_auto_appl_delay_days.addAllListener(p);
		p.Hdr_xfr_psn.setListListener(p);
		p.Hdr_xfr_psn.addAllListener(p);
		p.Hdr_rcst_prnt_typ.setListListener(p);
		p.Hdr_rcst_prnt_typ.addAllListener(p);
		p.Hdr_rcst_prnt_typ_nm.setListListener(p);
		p.Hdr_rcst_prnt_typ_nm.addAllListener(p);
	}

	/**
	 *  [DtlTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlTab(MABCP_BcstRcstReg p) {
		p.DtlTabTab.addAllListener(p);
	}

	/**
	 *  [Wrk1Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk1Hdr(MABCP_BcstRcstReg p) {
	}

	/**
	 *  [Wrk2Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk2Hdr(MABCP_BcstRcstReg p) {
	}

	/**
	 *  [Wrk3Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk3Hdr(MABCP_BcstRcstReg p) {
	}

	/**
	 *  [Wrk4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk4(MABCP_BcstRcstReg p) {
	}

	/**
	 *  [Wrk4Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk4Hdr(MABCP_BcstRcstReg p) {
		p.Wrk4Hdr_bill_cl_day1.setListListener(p);
		p.Wrk4Hdr_bill_cl_day1.addAllListener(p);
		p.Wrk4Hdr_bill_cl_day2.setListListener(p);
		p.Wrk4Hdr_bill_cl_day2.addAllListener(p);
		p.Wrk4Hdr_bill_cl_day3.setListListener(p);
		p.Wrk4Hdr_bill_cl_day3.addAllListener(p);
		p.Wrk4Hdr_bill_cl_day4.setListListener(p);
		p.Wrk4Hdr_bill_cl_day4.addAllListener(p);
		p.Wrk4Hdr_bill_cl_day5.setListListener(p);
		p.Wrk4Hdr_bill_cl_day5.addAllListener(p);
	}

	/**
	 *  [Wrk4Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk4Dtl(MABCP_BcstRcstReg p) {
		p.Wrk4DtlTable.addAllListener(p);
		p.columnWrk4Dtl_check.addAllListener(p);
		p.columnWrk4Dtl_del_flg.addAllListener(p);
		p.columnWrk4Dtl_bcst_cd.addAllListener(p);
		p.columnWrk4Dtl_bcst_cd.setListListener(p);
		p.columnWrk4Dtl_bill_cl_day1.addAllListener(p);
		p.columnWrk4Dtl_bill_cl_day1.setListListener(p);
		p.columnWrk4Dtl_bill_cl_day2.addAllListener(p);
		p.columnWrk4Dtl_bill_cl_day2.setListListener(p);
		p.columnWrk4Dtl_bill_cl_day3.addAllListener(p);
		p.columnWrk4Dtl_bill_cl_day3.setListListener(p);
		p.columnWrk4Dtl_bill_cl_day4.addAllListener(p);
		p.columnWrk4Dtl_bill_cl_day4.setListListener(p);
		p.columnWrk4Dtl_bill_cl_day5.addAllListener(p);
		p.columnWrk4Dtl_bill_cl_day5.setListListener(p);
		p.columnWrk4Dtl_cur_cd.addAllListener(p);
		p.columnWrk4Dtl_cur_cd.setListListener(p);
		p.columnWrk4Dtl_cur_nm.addAllListener(p);
		p.columnWrk4Dtl_cur_nm.setListListener(p);
		p.columnWrk4Dtl_amt_dec_place.addAllListener(p);
		p.columnWrk4Dtl_amt_dec_place.setListListener(p);
		p.columnWrk4Dtl_sttl_cd.addAllListener(p);
		p.columnWrk4Dtl_sttl_cd.setListListener(p);
		p.columnWrk4Dtl_sttl_nm.addAllListener(p);
		p.columnWrk4Dtl_sttl_nm.setListListener(p);
		p.columnWrk4Dtl_wg_cd.addAllListener(p);
		p.columnWrk4Dtl_wg_cd.setListListener(p);
		p.columnWrk4Dtl_wg_nm.addAllListener(p);
		p.columnWrk4Dtl_wg_nm.setListListener(p);
		p.columnWrk4Dtl_rate.addAllListener(p);
		p.columnWrk4Dtl_rate.setListListener(p);
		p.columnWrk4Dtl_crryovr_mons_typ.addAllListener(p);
		p.columnWrk4Dtl_crryovr_mons_typ.setListListener(p);
		p.columnWrk4Dtl_crryovr_mons_typ_nm.addAllListener(p);
		p.columnWrk4Dtl_crryovr_mons_typ_nm.setListListener(p);
		p.columnWrk4Dtl_rcv_crryovr_mons1.addAllListener(p);
		p.columnWrk4Dtl_rcv_crryovr_mons1.setListListener(p);
		p.columnWrk4Dtl_rcv_day1.addAllListener(p);
		p.columnWrk4Dtl_rcv_day1.setListListener(p);
		p.columnWrk4Dtl_rcv_crryovr_mons2.addAllListener(p);
		p.columnWrk4Dtl_rcv_crryovr_mons2.setListListener(p);
		p.columnWrk4Dtl_rcv_day2.addAllListener(p);
		p.columnWrk4Dtl_rcv_day2.setListListener(p);
		p.columnWrk4Dtl_rcv_crryovr_mons3.addAllListener(p);
		p.columnWrk4Dtl_rcv_crryovr_mons3.setListListener(p);
		p.columnWrk4Dtl_rcv_day3.addAllListener(p);
		p.columnWrk4Dtl_rcv_day3.setListListener(p);
		p.columnWrk4Dtl_rcv_crryovr_mons4.addAllListener(p);
		p.columnWrk4Dtl_rcv_crryovr_mons4.setListListener(p);
		p.columnWrk4Dtl_rcv_day4.addAllListener(p);
		p.columnWrk4Dtl_rcv_day4.setListListener(p);
		p.columnWrk4Dtl_rcv_crryovr_mons5.addAllListener(p);
		p.columnWrk4Dtl_rcv_crryovr_mons5.setListListener(p);
		p.columnWrk4Dtl_rcv_day5.addAllListener(p);
		p.columnWrk4Dtl_rcv_day5.setListListener(p);
		p.columnWrk4Dtl_memo1.addAllListener(p);
		p.columnWrk4Dtl_memo1.setListListener(p);
		p.columnWrk4Dtl_memo2.addAllListener(p);
		p.columnWrk4Dtl_memo2.setListListener(p);
		p.columnWrk4Dtl_memo3.addAllListener(p);
		p.columnWrk4Dtl_memo3.setListListener(p);
		p.columnWrk4Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk4Dtl_ins_usr_id.setListListener(p);
		p.columnWrk4Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk4Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk4Dtl_ins_ts.addAllListener(p);
		p.columnWrk4Dtl_ins_ts.setListListener(p);
		p.columnWrk4Dtl_ins_func_id.addAllListener(p);
		p.columnWrk4Dtl_ins_func_id.setListListener(p);
		p.columnWrk4Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk4Dtl_ins_func_nm.setListListener(p);
		p.columnWrk4Dtl_upd_cntr.addAllListener(p);
		p.columnWrk4Dtl_upd_cntr.setListListener(p);
		p.columnWrk4Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk4Dtl_upd_usr_id.setListListener(p);
		p.columnWrk4Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk4Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk4Dtl_upd_ts.addAllListener(p);
		p.columnWrk4Dtl_upd_ts.setListListener(p);
		p.columnWrk4Dtl_upd_func_id.addAllListener(p);
		p.columnWrk4Dtl_upd_func_id.setListListener(p);
		p.columnWrk4Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk4Dtl_upd_func_nm.setListListener(p);
		p.columnWrk4Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk4Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk4Dtl_del_usr_id.addAllListener(p);
		p.columnWrk4Dtl_del_usr_id.setListListener(p);
		p.columnWrk4Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk4Dtl_del_usr_nm.setListListener(p);
		p.columnWrk4Dtl_del_ts.addAllListener(p);
		p.columnWrk4Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk4DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk4DtlBtn(MABCP_BcstRcstReg p) {
		p.Wrk4DtlBtn_select_all.addAllListener(p);
		p.Wrk4DtlBtn_select_all.setAPMethodName("doWrk4DtlBtn_select_all");
		p.Wrk4DtlBtn_deselect_all.addAllListener(p);
		p.Wrk4DtlBtn_deselect_all.setAPMethodName("doWrk4DtlBtn_deselect_all");
		p.Wrk4DtlBtn_radd.addAllListener(p);
		p.Wrk4DtlBtn_radd.setAPMethodName("doWrk4DtlBtn_radd");
		p.Wrk4DtlBtn_rdel.addAllListener(p);
		p.Wrk4DtlBtn_rdel.setAPMethodName("doWrk4DtlBtn_rdel");
		p.Wrk4DtlBtn_rcopy.addAllListener(p);
		p.Wrk4DtlBtn_rcopy.setAPMethodName("doWrk4DtlBtn_rcopy");
	}

	/**
	 *  [Wrk7]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk7(MABCP_BcstRcstReg p) {
	}

	/**
	 *  [Wrk7Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk7Hdr(MABCP_BcstRcstReg p) {
		p.Wrk7Hdr_st_dt.setListListener(p);
		p.Wrk7Hdr_st_dt.addAllListener(p);
		p.Wrk7Hdr_end_dt.setListListener(p);
		p.Wrk7Hdr_end_dt.addAllListener(p);
		p.Wrk7Hdr_set_dt.addAllListener(p);
		p.Wrk7Hdr_set_dt.setAPMethodName("doWrk7Hdr_set_dt");
	}

	/**
	 *  [Wrk7Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk7Dtl(MABCP_BcstRcstReg p) {
		p.Wrk7DtlTable.addAllListener(p);
		p.columnWrk7Dtl_check.addAllListener(p);
		p.columnWrk7Dtl_del_flg.addAllListener(p);
		p.columnWrk7Dtl_bp_cd.addAllListener(p);
		p.columnWrk7Dtl_bp_cd.setListListener(p);
		p.columnWrk7Dtl_if_proc_typ.addAllListener(p);
		p.columnWrk7Dtl_if_proc_typ.setListListener(p);
		p.columnWrk7Dtl_if_proc_typ_nm.addAllListener(p);
		p.columnWrk7Dtl_if_proc_typ_nm.setListListener(p);
		p.columnWrk7Dtl_not_onr_prov_flg.addAllListener(p);
		p.columnWrk7Dtl_ext_sys_cd.addAllListener(p);
		p.columnWrk7Dtl_ext_sys_cd.setListListener(p);
		p.columnWrk7Dtl_ext_sys_nm.addAllListener(p);
		p.columnWrk7Dtl_ext_sys_nm.setListListener(p);
		p.columnWrk7Dtl_memo1.addAllListener(p);
		p.columnWrk7Dtl_memo1.setListListener(p);
		p.columnWrk7Dtl_memo2.addAllListener(p);
		p.columnWrk7Dtl_memo2.setListListener(p);
		p.columnWrk7Dtl_memo3.addAllListener(p);
		p.columnWrk7Dtl_memo3.setListListener(p);
		p.columnWrk7Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk7Dtl_ins_usr_id.setListListener(p);
		p.columnWrk7Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk7Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk7Dtl_ins_ts.addAllListener(p);
		p.columnWrk7Dtl_ins_ts.setListListener(p);
		p.columnWrk7Dtl_ins_func_id.addAllListener(p);
		p.columnWrk7Dtl_ins_func_id.setListListener(p);
		p.columnWrk7Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk7Dtl_ins_func_nm.setListListener(p);
		p.columnWrk7Dtl_upd_cntr.addAllListener(p);
		p.columnWrk7Dtl_upd_cntr.setListListener(p);
		p.columnWrk7Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk7Dtl_upd_usr_id.setListListener(p);
		p.columnWrk7Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk7Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk7Dtl_upd_ts.addAllListener(p);
		p.columnWrk7Dtl_upd_ts.setListListener(p);
		p.columnWrk7Dtl_upd_func_id.addAllListener(p);
		p.columnWrk7Dtl_upd_func_id.setListListener(p);
		p.columnWrk7Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk7Dtl_upd_func_nm.setListListener(p);
		p.columnWrk7Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk7Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk7Dtl_del_usr_id.addAllListener(p);
		p.columnWrk7Dtl_del_usr_id.setListListener(p);
		p.columnWrk7Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk7Dtl_del_usr_nm.setListListener(p);
		p.columnWrk7Dtl_del_ts.addAllListener(p);
		p.columnWrk7Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk7DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk7DtlBtn(MABCP_BcstRcstReg p) {
		p.Wrk7DtlBtn_select_all.addAllListener(p);
		p.Wrk7DtlBtn_select_all.setAPMethodName("doWrk7DtlBtn_select_all");
		p.Wrk7DtlBtn_deselect_all.addAllListener(p);
		p.Wrk7DtlBtn_deselect_all.setAPMethodName("doWrk7DtlBtn_deselect_all");
		p.Wrk7DtlBtn_radd.addAllListener(p);
		p.Wrk7DtlBtn_radd.setAPMethodName("doWrk7DtlBtn_radd");
		p.Wrk7DtlBtn_rdel.addAllListener(p);
		p.Wrk7DtlBtn_rdel.setAPMethodName("doWrk7DtlBtn_rdel");
		p.Wrk7DtlBtn_rcopy.addAllListener(p);
		p.Wrk7DtlBtn_rcopy.setAPMethodName("doWrk7DtlBtn_rcopy");
	}

	/**
	 *  [Wrk5]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk5(MABCP_BcstRcstReg p) {
	}

	/**
	 *  [Wrk5Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk5Dtl(MABCP_BcstRcstReg p) {
		p.Wrk5DtlTable.addAllListener(p);
		p.columnWrk5Dtl_check.addAllListener(p);
		p.columnWrk5Dtl_del_flg.addAllListener(p);
		p.columnWrk5Dtl_rcst_cd.addAllListener(p);
		p.columnWrk5Dtl_rcst_cd.setListListener(p);
		p.columnWrk5Dtl_cur_cd.addAllListener(p);
		p.columnWrk5Dtl_cur_cd.setListListener(p);
		p.columnWrk5Dtl_cur_nm.addAllListener(p);
		p.columnWrk5Dtl_cur_nm.setListListener(p);
		p.columnWrk5Dtl_amt_dec_place.addAllListener(p);
		p.columnWrk5Dtl_amt_dec_place.setListListener(p);
		p.columnWrk5Dtl_memo1.addAllListener(p);
		p.columnWrk5Dtl_memo1.setListListener(p);
		p.columnWrk5Dtl_memo2.addAllListener(p);
		p.columnWrk5Dtl_memo2.setListListener(p);
		p.columnWrk5Dtl_memo3.addAllListener(p);
		p.columnWrk5Dtl_memo3.setListListener(p);
		p.columnWrk5Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk5Dtl_ins_usr_id.setListListener(p);
		p.columnWrk5Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk5Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk5Dtl_ins_ts.addAllListener(p);
		p.columnWrk5Dtl_ins_ts.setListListener(p);
		p.columnWrk5Dtl_ins_func_id.addAllListener(p);
		p.columnWrk5Dtl_ins_func_id.setListListener(p);
		p.columnWrk5Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk5Dtl_ins_func_nm.setListListener(p);
		p.columnWrk5Dtl_upd_cntr.addAllListener(p);
		p.columnWrk5Dtl_upd_cntr.setListListener(p);
		p.columnWrk5Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk5Dtl_upd_usr_id.setListListener(p);
		p.columnWrk5Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk5Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk5Dtl_upd_ts.addAllListener(p);
		p.columnWrk5Dtl_upd_ts.setListListener(p);
		p.columnWrk5Dtl_upd_func_id.addAllListener(p);
		p.columnWrk5Dtl_upd_func_id.setListListener(p);
		p.columnWrk5Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk5Dtl_upd_func_nm.setListListener(p);
		p.columnWrk5Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk5Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk5Dtl_del_usr_id.addAllListener(p);
		p.columnWrk5Dtl_del_usr_id.setListListener(p);
		p.columnWrk5Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk5Dtl_del_usr_nm.setListListener(p);
		p.columnWrk5Dtl_del_ts.addAllListener(p);
		p.columnWrk5Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk5DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk5DtlBtn(MABCP_BcstRcstReg p) {
		p.Wrk5DtlBtn_select_all.addAllListener(p);
		p.Wrk5DtlBtn_select_all.setAPMethodName("doWrk5DtlBtn_select_all");
		p.Wrk5DtlBtn_deselect_all.addAllListener(p);
		p.Wrk5DtlBtn_deselect_all.setAPMethodName("doWrk5DtlBtn_deselect_all");
		p.Wrk5DtlBtn_radd.addAllListener(p);
		p.Wrk5DtlBtn_radd.setAPMethodName("doWrk5DtlBtn_radd");
		p.Wrk5DtlBtn_rdel.addAllListener(p);
		p.Wrk5DtlBtn_rdel.setAPMethodName("doWrk5DtlBtn_rdel");
		p.Wrk5DtlBtn_rcopy.addAllListener(p);
		p.Wrk5DtlBtn_rcopy.setAPMethodName("doWrk5DtlBtn_rcopy");
	}

	/**
	 *  [Wrk6]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk6(MABCP_BcstRcstReg p) {
	}

	/**
	 *  [Wrk6Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk6Hdr(MABCP_BcstRcstReg p) {
		p.Wrk6Hdr_st_dt.setListListener(p);
		p.Wrk6Hdr_st_dt.addAllListener(p);
		p.Wrk6Hdr_end_dt.setListListener(p);
		p.Wrk6Hdr_end_dt.addAllListener(p);
		p.Wrk6Hdr_set_dt.addAllListener(p);
		p.Wrk6Hdr_set_dt.setAPMethodName("doWrk6Hdr_set_dt");
	}

	/**
	 *  [Wrk6Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk6Dtl(MABCP_BcstRcstReg p) {
		p.Wrk6DtlTable.addAllListener(p);
		p.columnWrk6Dtl_check.addAllListener(p);
		p.columnWrk6Dtl_del_flg.addAllListener(p);
		p.columnWrk6Dtl_bp_cd.addAllListener(p);
		p.columnWrk6Dtl_bp_cd.setListListener(p);
		p.columnWrk6Dtl_bp_cd_null_flg.addAllListener(p);
		p.columnWrk6Dtl_if_proc_typ.addAllListener(p);
		p.columnWrk6Dtl_if_proc_typ.setListListener(p);
		p.columnWrk6Dtl_if_proc_typ_nm.addAllListener(p);
		p.columnWrk6Dtl_if_proc_typ_nm.setListListener(p);
		p.columnWrk6Dtl_ar_sttl_typ.addAllListener(p);
		p.columnWrk6Dtl_ar_sttl_typ.setListListener(p);
		p.columnWrk6Dtl_ar_sttl_typ_nm.addAllListener(p);
		p.columnWrk6Dtl_ar_sttl_typ_nm.setListListener(p);
		p.columnWrk6Dtl_bank_cd.addAllListener(p);
		p.columnWrk6Dtl_bank_cd.setListListener(p);
		p.columnWrk6Dtl_bank_nm.addAllListener(p);
		p.columnWrk6Dtl_bank_nm.setListListener(p);
		p.columnWrk6Dtl_bank_ac_cd.addAllListener(p);
		p.columnWrk6Dtl_bank_ac_cd.setListListener(p);
		p.columnWrk6Dtl_bank_ac_nm.addAllListener(p);
		p.columnWrk6Dtl_bank_ac_nm.setListListener(p);
		p.columnWrk6Dtl_memo1.addAllListener(p);
		p.columnWrk6Dtl_memo1.setListListener(p);
		p.columnWrk6Dtl_memo2.addAllListener(p);
		p.columnWrk6Dtl_memo2.setListListener(p);
		p.columnWrk6Dtl_memo3.addAllListener(p);
		p.columnWrk6Dtl_memo3.setListListener(p);
		p.columnWrk6Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk6Dtl_ins_usr_id.setListListener(p);
		p.columnWrk6Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk6Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk6Dtl_ins_ts.addAllListener(p);
		p.columnWrk6Dtl_ins_ts.setListListener(p);
		p.columnWrk6Dtl_ins_func_id.addAllListener(p);
		p.columnWrk6Dtl_ins_func_id.setListListener(p);
		p.columnWrk6Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk6Dtl_ins_func_nm.setListListener(p);
		p.columnWrk6Dtl_upd_cntr.addAllListener(p);
		p.columnWrk6Dtl_upd_cntr.setListListener(p);
		p.columnWrk6Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk6Dtl_upd_usr_id.setListListener(p);
		p.columnWrk6Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk6Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk6Dtl_upd_ts.addAllListener(p);
		p.columnWrk6Dtl_upd_ts.setListListener(p);
		p.columnWrk6Dtl_upd_func_id.addAllListener(p);
		p.columnWrk6Dtl_upd_func_id.setListListener(p);
		p.columnWrk6Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk6Dtl_upd_func_nm.setListListener(p);
		p.columnWrk6Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk6Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk6Dtl_del_usr_id.addAllListener(p);
		p.columnWrk6Dtl_del_usr_id.setListListener(p);
		p.columnWrk6Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk6Dtl_del_usr_nm.setListListener(p);
		p.columnWrk6Dtl_del_ts.addAllListener(p);
		p.columnWrk6Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk6DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk6DtlBtn(MABCP_BcstRcstReg p) {
		p.Wrk6DtlBtn_select_all.addAllListener(p);
		p.Wrk6DtlBtn_select_all.setAPMethodName("doWrk6DtlBtn_select_all");
		p.Wrk6DtlBtn_deselect_all.addAllListener(p);
		p.Wrk6DtlBtn_deselect_all.setAPMethodName("doWrk6DtlBtn_deselect_all");
		p.Wrk6DtlBtn_radd.addAllListener(p);
		p.Wrk6DtlBtn_radd.setAPMethodName("doWrk6DtlBtn_radd");
		p.Wrk6DtlBtn_rdel.addAllListener(p);
		p.Wrk6DtlBtn_rdel.setAPMethodName("doWrk6DtlBtn_rdel");
		p.Wrk6DtlBtn_rcopy.addAllListener(p);
		p.Wrk6DtlBtn_rcopy.setAPMethodName("doWrk6DtlBtn_rcopy");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABCP_BcstRcstReg p) {
		p.Btn_open_MABCP0510.addAllListener(p);
		p.Btn_open_MABCP0510.setAPMethodName("doBtn_open_MABCP0510");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 *  [HdrAll]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrAll(MABCP_BcstRcstReg p) {
		p.HdrAllTable.addAllListener(p);
		p.columnHdrAll_check.addAllListener(p);
		p.columnHdrAll_bp_cd.addAllListener(p);
		p.columnHdrAll_bp_cd.setListListener(p);
		p.columnHdrAll_bp_nm.addAllListener(p);
		p.columnHdrAll_bp_nm.setListListener(p);
		p.columnHdrAll_bcst_flg.addAllListener(p);
		p.columnHdrAll_rcst_flg.addAllListener(p);
		p.columnHdrAll_rcst_cd.addAllListener(p);
		p.columnHdrAll_rcst_cd.setListListener(p);
		p.columnHdrAll_rcst_nm.addAllListener(p);
		p.columnHdrAll_rcst_nm.setListListener(p);
		p.columnHdrAll_ar_cred_cd.addAllListener(p);
		p.columnHdrAll_ar_cred_cd.setListListener(p);
		p.columnHdrAll_ar_cred_nm.addAllListener(p);
		p.columnHdrAll_ar_cred_nm.setListListener(p);
		p.columnHdrAll_bill_dpt_typ.addAllListener(p);
		p.columnHdrAll_bill_dpt_typ.setListListener(p);
		p.columnHdrAll_bill_dpt_typ_nm.addAllListener(p);
		p.columnHdrAll_bill_dpt_typ_nm.setListListener(p);
		p.columnHdrAll_bcst_dpt_cd.addAllListener(p);
		p.columnHdrAll_bcst_dpt_cd.setListListener(p);
		p.columnHdrAll_bcst_dpt_nm.addAllListener(p);
		p.columnHdrAll_bcst_dpt_nm.setListListener(p);
		p.columnHdrAll_check_bcst_dpt_cd.addAllListener(p);
		p.columnHdrAll_check_bcst_dpt_cd.setListListener(p);
		p.columnHdrAll_bill_cl_typ.addAllListener(p);
		p.columnHdrAll_bill_cl_typ.setListListener(p);
		p.columnHdrAll_bill_cl_typ_nm.addAllListener(p);
		p.columnHdrAll_bill_cl_typ_nm.setListListener(p);
		p.columnHdrAll_bill_cl_day1.addAllListener(p);
		p.columnHdrAll_bill_cl_day1.setListListener(p);
		p.columnHdrAll_bill_cl_day2.addAllListener(p);
		p.columnHdrAll_bill_cl_day2.setListListener(p);
		p.columnHdrAll_bill_cl_day3.addAllListener(p);
		p.columnHdrAll_bill_cl_day3.setListListener(p);
		p.columnHdrAll_bill_cl_day4.addAllListener(p);
		p.columnHdrAll_bill_cl_day4.setListListener(p);
		p.columnHdrAll_bill_cl_day5.addAllListener(p);
		p.columnHdrAll_bill_cl_day5.setListListener(p);
		p.columnHdrAll_tax_on_bill_flg.addAllListener(p);
		p.columnHdrAll_bill_tax_rnd_typ.addAllListener(p);
		p.columnHdrAll_bill_tax_rnd_typ.setListListener(p);
		p.columnHdrAll_bill_tax_rnd_typ_nm.addAllListener(p);
		p.columnHdrAll_bill_tax_rnd_typ_nm.setListListener(p);
		p.columnHdrAll_bill_cl_delay_days.addAllListener(p);
		p.columnHdrAll_bill_cl_delay_days.setListListener(p);
		p.columnHdrAll_bill_cl_ba_typ.addAllListener(p);
		p.columnHdrAll_bill_cl_ba_typ.setListListener(p);
		p.columnHdrAll_bill_cl_ba_typ_nm.addAllListener(p);
		p.columnHdrAll_bill_cl_ba_typ_nm.setListListener(p);
		p.columnHdrAll_bill_cal_cd.addAllListener(p);
		p.columnHdrAll_bill_cal_cd.setListListener(p);
		p.columnHdrAll_bill_cal_nm.addAllListener(p);
		p.columnHdrAll_bill_cal_nm.setListListener(p);
		p.columnHdrAll_rcv_ba_typ.addAllListener(p);
		p.columnHdrAll_rcv_ba_typ.setListListener(p);
		p.columnHdrAll_rcv_ba_typ_nm.addAllListener(p);
		p.columnHdrAll_rcv_ba_typ_nm.setListListener(p);
		p.columnHdrAll_auto_line_appl_flg.addAllListener(p);
		p.columnHdrAll_sls_interim_cl_flg.addAllListener(p);
		p.columnHdrAll_ar_setoff_grp_cd.addAllListener(p);
		p.columnHdrAll_ar_setoff_grp_cd.setListListener(p);
		p.columnHdrAll_ar_setoff_grp_nm.addAllListener(p);
		p.columnHdrAll_ar_setoff_grp_nm.setListListener(p);
		p.columnHdrAll_bcst_prnt_typ.addAllListener(p);
		p.columnHdrAll_bcst_prnt_typ.setListListener(p);
		p.columnHdrAll_bcst_prnt_typ_nm.addAllListener(p);
		p.columnHdrAll_bcst_prnt_typ_nm.setListListener(p);
		p.columnHdrAll_bill_zip_cd.addAllListener(p);
		p.columnHdrAll_bill_zip_cd.setListListener(p);
		p.columnHdrAll_bill_addr1.addAllListener(p);
		p.columnHdrAll_bill_addr1.setListListener(p);
		p.columnHdrAll_bill_addr2.addAllListener(p);
		p.columnHdrAll_bill_addr2.setListListener(p);
		p.columnHdrAll_bill_addr3.addAllListener(p);
		p.columnHdrAll_bill_addr3.setListListener(p);
		p.columnHdrAll_bill_addr4.addAllListener(p);
		p.columnHdrAll_bill_addr4.setListListener(p);
		p.columnHdrAll_bill_tel.addAllListener(p);
		p.columnHdrAll_bill_tel.setListListener(p);
		p.columnHdrAll_bill_bcst_nm.addAllListener(p);
		p.columnHdrAll_bill_bcst_nm.setListListener(p);
		p.columnHdrAll_bill_bcst_dpt.addAllListener(p);
		p.columnHdrAll_bill_bcst_dpt.setListListener(p);
		p.columnHdrAll_bill_bcst_psn.addAllListener(p);
		p.columnHdrAll_bill_bcst_psn.setListListener(p);
		p.columnHdrAll_bill_bcst_psn_title.addAllListener(p);
		p.columnHdrAll_bill_bcst_psn_title.setListListener(p);
		p.columnHdrAll_bill_prnt_typ.addAllListener(p);
		p.columnHdrAll_bill_prnt_typ.setListListener(p);
		p.columnHdrAll_bill_prnt_typ_nm.addAllListener(p);
		p.columnHdrAll_bill_prnt_typ_nm.setListListener(p);
		p.columnHdrAll_sls_dtl_outp_typ.addAllListener(p);
		p.columnHdrAll_sls_dtl_outp_typ.setListListener(p);
		p.columnHdrAll_sls_dtl_outp_typ_nm.addAllListener(p);
		p.columnHdrAll_sls_dtl_outp_typ_nm.setListListener(p);
		p.columnHdrAll_bill_dtl_outp_flg.addAllListener(p);
		p.columnHdrAll_bfw_bal_disp_flg.addAllListener(p);
		p.columnHdrAll_bill_dtl_adv_flg.addAllListener(p);
		p.columnHdrAll_bill_dtl_rcv_flg.addAllListener(p);
		p.columnHdrAll_bill_dtl_subttl_typ.addAllListener(p);
		p.columnHdrAll_bill_dtl_subttl_typ.setListListener(p);
		p.columnHdrAll_bill_dtl_subttl_typ_nm.addAllListener(p);
		p.columnHdrAll_bill_dtl_subttl_typ_nm.setListListener(p);
		p.columnHdrAll_bill_dtl_brk_typ.addAllListener(p);
		p.columnHdrAll_bill_dtl_brk_typ.setListListener(p);
		p.columnHdrAll_bill_dtl_brk_typ_nm.addAllListener(p);
		p.columnHdrAll_bill_dtl_brk_typ_nm.setListListener(p);
		p.columnHdrAll_bill_dtl_sort_typ.addAllListener(p);
		p.columnHdrAll_bill_dtl_sort_typ.setListListener(p);
		p.columnHdrAll_bill_dtl_sort_typ_nm.addAllListener(p);
		p.columnHdrAll_bill_dtl_sort_typ_nm.setListListener(p);
		p.columnHdrAll_bill_can_slip_typ.addAllListener(p);
		p.columnHdrAll_bill_can_slip_typ.setListListener(p);
		p.columnHdrAll_bill_can_slip_typ_nm.addAllListener(p);
		p.columnHdrAll_bill_can_slip_typ_nm.setListListener(p);
		p.columnHdrAll_rcv_auto_appl_tgt_flg.addAllListener(p);
		p.columnHdrAll_rcv_amt_match_flg.addAllListener(p);
		p.columnHdrAll_ar_sttl_typ_match_flg.addAllListener(p);
		p.columnHdrAll_calc_com_paid_flg.addAllListener(p);
		p.columnHdrAll_auto_appl_delay_days.addAllListener(p);
		p.columnHdrAll_auto_appl_delay_days.setListListener(p);
		p.columnHdrAll_xfr_psn.addAllListener(p);
		p.columnHdrAll_xfr_psn.setListListener(p);
		p.columnHdrAll_ins_usr_id.addAllListener(p);
		p.columnHdrAll_ins_usr_id.setListListener(p);
		p.columnHdrAll_ins_usr_nm.addAllListener(p);
		p.columnHdrAll_ins_usr_nm.setListListener(p);
		p.columnHdrAll_ins_ts.addAllListener(p);
		p.columnHdrAll_ins_ts.setListListener(p);
		p.columnHdrAll_ins_func_id.addAllListener(p);
		p.columnHdrAll_ins_func_id.setListListener(p);
		p.columnHdrAll_ins_func_nm.addAllListener(p);
		p.columnHdrAll_ins_func_nm.setListListener(p);
		p.columnHdrAll_upd_cntr.addAllListener(p);
		p.columnHdrAll_upd_cntr.setListListener(p);
		p.columnHdrAll_upd_usr_id.addAllListener(p);
		p.columnHdrAll_upd_usr_id.setListListener(p);
		p.columnHdrAll_upd_usr_nm.addAllListener(p);
		p.columnHdrAll_upd_usr_nm.setListListener(p);
		p.columnHdrAll_upd_ts.addAllListener(p);
		p.columnHdrAll_upd_ts.setListListener(p);
		p.columnHdrAll_upd_func_id.addAllListener(p);
		p.columnHdrAll_upd_func_id.setListListener(p);
		p.columnHdrAll_upd_func_nm.addAllListener(p);
		p.columnHdrAll_upd_func_nm.setListListener(p);
		p.columnHdrAll_upd_srv_req_no.addAllListener(p);
		p.columnHdrAll_upd_srv_req_no.setListListener(p);
		p.columnHdrAll_del_usr_id.addAllListener(p);
		p.columnHdrAll_del_usr_id.setListListener(p);
		p.columnHdrAll_del_usr_nm.addAllListener(p);
		p.columnHdrAll_del_usr_nm.setListListener(p);
		p.columnHdrAll_del_ts.addAllListener(p);
		p.columnHdrAll_del_ts.setListListener(p);
		p.columnHdrAll_rcst_prnt_typ.addAllListener(p);
		p.columnHdrAll_rcst_prnt_typ.setListListener(p);
		p.columnHdrAll_rcst_prnt_typ_nm.addAllListener(p);
		p.columnHdrAll_rcst_prnt_typ_nm.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MABCP_BcstRcstReg p){

	}

	/**
	 * [SRCH]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Mst(MABCP_BcstRcstReg p){
		p.Mst_mst_set_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MABCP_BcstRcstReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MABCP_BcstRcstReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MABCP_BcstRcstReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bp_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MABCP_BcstRcstReg p){

	}

	/**
	 * [SRCH]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tbl(MABCP_BcstRcstReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MABCP_BcstRcstReg p){
		p.Hdr_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bcst_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcst_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ar_cred_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ar_cred_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bcst_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bcst_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_check_bcst_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_bill_cl_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_cl_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tax_on_bill_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_tax_rnd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_tax_rnd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_cl_delay_days.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_cl_ba_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_cl_ba_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_cal_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_cal_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcv_ba_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcv_ba_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_auto_line_appl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_interim_cl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ar_setoff_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ar_setoff_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bcst_prnt_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bcst_prnt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_zip_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_addr1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_addr2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_addr3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_addr4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_tel.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_bcst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_bcst_dpt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_bcst_psn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_bcst_psn_title.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_prnt_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_prnt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_dtl_outp_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sls_dtl_outp_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_outp_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bfw_bal_disp_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_adv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_rcv_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_subttl_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_subttl_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_brk_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_brk_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_sort_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_sort_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_can_slip_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bill_can_slip_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcv_auto_appl_tgt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcv_amt_match_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ar_sttl_typ_match_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_calc_com_paid_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_auto_appl_delay_days.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_xfr_psn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcst_prnt_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_rcst_prnt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlTab(MABCP_BcstRcstReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk1Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk1Hdr(MABCP_BcstRcstReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk2Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk2Hdr(MABCP_BcstRcstReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk3Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk3Hdr(MABCP_BcstRcstReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk4(MABCP_BcstRcstReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk4Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk4Hdr(MABCP_BcstRcstReg p){
		p.Wrk4Hdr_bill_cl_day1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk4Hdr_bill_cl_day2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk4Hdr_bill_cl_day3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk4Hdr_bill_cl_day4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk4Hdr_bill_cl_day5.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk4Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk4Dtl(MABCP_BcstRcstReg p){
		p.columnWrk4Dtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_bcst_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk4Dtl_bill_cl_day1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk4Dtl_bill_cl_day2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk4Dtl_bill_cl_day3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk4Dtl_bill_cl_day4.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk4Dtl_bill_cl_day5.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk4Dtl_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Wrk4Dtl_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Wrk4Dtl_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_sttl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_sttl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_crryovr_mons_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_crryovr_mons_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_crryovr_mons1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_day1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_crryovr_mons2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_day2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_crryovr_mons3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_day3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_crryovr_mons4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_day4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_crryovr_mons5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_day5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk4Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk4DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk4DtlBtn(MABCP_BcstRcstReg p){
		p.Wrk4DtlBtn_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Wrk4DtlBtn_deselect_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Wrk4DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk4DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk4DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk7]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk7(MABCP_BcstRcstReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk7Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk7Hdr(MABCP_BcstRcstReg p){
		p.Wrk7Hdr_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk7Hdr_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk7Hdr_set_dt.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk7Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk7Dtl(MABCP_BcstRcstReg p){
		p.columnWrk7Dtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_bp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk7Dtl_if_proc_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_if_proc_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_not_onr_prov_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk7Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk7Dtl_ext_sys_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ext_sys_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk7Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk7DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk7DtlBtn(MABCP_BcstRcstReg p){
		p.Wrk7DtlBtn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk7DtlBtn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk7DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk7DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk7DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk5(MABCP_BcstRcstReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk5Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk5Dtl(MABCP_BcstRcstReg p){
		p.columnWrk5Dtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_rcst_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk5Dtl_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Wrk5Dtl_min_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Wrk5Dtl_max_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Wrk5Dtl_com_paid_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnWrk5Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk5Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk5DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk5DtlBtn(MABCP_BcstRcstReg p){
		p.Wrk5DtlBtn_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Wrk5DtlBtn_deselect_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Wrk5DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk5DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk5DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk6]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk6(MABCP_BcstRcstReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk6Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk6Hdr(MABCP_BcstRcstReg p){
		p.Wrk6Hdr_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk6Hdr_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk6Hdr_set_dt.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk6Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk6Dtl(MABCP_BcstRcstReg p){
		p.columnWrk6Dtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_bp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk6Dtl_bp_cd_null_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk6Dtl_if_proc_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_if_proc_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ar_sttl_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ar_sttl_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_bank_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_bank_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_bank_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_bank_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk6Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk6Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk6Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk6DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk6DtlBtn(MABCP_BcstRcstReg p){
		p.Wrk6DtlBtn_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Wrk6DtlBtn_deselect_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Wrk6DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk6DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk6DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MABCP_BcstRcstReg p){
		p.Btn_open_MABCP0510.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrAll(MABCP_BcstRcstReg p){
		p.columnHdrAll_check.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bcst_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_rcst_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_rcst_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_rcst_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_ar_cred_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_ar_cred_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dpt_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dpt_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bcst_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bcst_dpt_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_check_bcst_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_day1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_day2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_day3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_day4.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_day5.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_tax_on_bill_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_tax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_tax_rnd_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_delay_days.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_ba_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_ba_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cal_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cal_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_rcv_ba_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_rcv_ba_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_auto_line_appl_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_sls_interim_cl_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_ar_setoff_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_ar_setoff_grp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bcst_prnt_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bcst_prnt_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_zip_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_addr1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_addr2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_addr3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_addr4.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_tel.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_bcst_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_bcst_dpt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_bcst_psn.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_bcst_psn_title.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_prnt_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_prnt_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_sls_dtl_outp_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_sls_dtl_outp_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_outp_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bfw_bal_disp_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_adv_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_rcv_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_subttl_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_subttl_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_brk_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_brk_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_sort_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_sort_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_can_slip_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bill_can_slip_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_rcv_auto_appl_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_rcv_amt_match_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_ar_sttl_typ_match_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_calc_com_paid_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_auto_appl_delay_days.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_xfr_psn.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_ins_usr_id.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_ins_usr_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_ins_ts.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_ins_func_id.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_ins_func_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_upd_usr_id.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_upd_usr_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_upd_ts.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_upd_func_id.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_upd_func_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_upd_srv_req_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_del_usr_id.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_del_usr_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_del_ts.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_rcst_prnt_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_rcst_prnt_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_BcstRcstReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABCP_BcstRcstReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_BcstRcstReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_BcstRcstReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_BcstRcstReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_bp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_BcstRcstReg p){

	}

	/**
	 * [UPD]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tbl(MABCP_BcstRcstReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MABCP_BcstRcstReg p){
		p.Hdr_bp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bcst_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rcst_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rcst_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_rcst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ar_cred_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_ar_cred_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_bill_dpt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bcst_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_bcst_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_check_bcst_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_bill_cl_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_bill_cl_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day1.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_bill_cl_day2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_bill_cl_day3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_bill_cl_day4.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_bill_cl_day5.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_tax_on_bill_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_bill_tax_rnd_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_bill_tax_rnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bill_cl_delay_days.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_bill_cl_ba_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_bill_cl_ba_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bill_cal_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_bill_cal_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rcv_ba_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_rcv_ba_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_auto_line_appl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_sls_interim_cl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_ar_setoff_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_ar_setoff_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bcst_prnt_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_bcst_prnt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bill_zip_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_bill_addr1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_bill_addr2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_bill_addr3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_bill_addr4.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_bill_tel.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_bill_bcst_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_bill_bcst_dpt.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_bill_bcst_psn.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_bill_bcst_psn_title.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_bill_prnt_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_bill_prnt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sls_dtl_outp_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_sls_dtl_outp_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_outp_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_bfw_bal_disp_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_bill_dtl_adv_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_bill_dtl_rcv_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_bill_dtl_subttl_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_bill_dtl_subttl_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_brk_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_bill_dtl_brk_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_sort_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_bill_dtl_sort_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bill_can_slip_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_bill_can_slip_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_rcv_auto_appl_tgt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_rcv_amt_match_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_ar_sttl_typ_match_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_calc_com_paid_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_auto_appl_delay_days.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_xfr_psn.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_rcst_prnt_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_rcst_prnt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlTab(MABCP_BcstRcstReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk1Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk1Hdr(MABCP_BcstRcstReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk2Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk2Hdr(MABCP_BcstRcstReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk3Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk3Hdr(MABCP_BcstRcstReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk4]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk4(MABCP_BcstRcstReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk4Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk4Hdr(MABCP_BcstRcstReg p){
		p.Wrk4Hdr_bill_cl_day1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Wrk4Hdr_bill_cl_day2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Wrk4Hdr_bill_cl_day3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Wrk4Hdr_bill_cl_day4.putMode(p, UPD, MCMode.READ_ONLY);
		p.Wrk4Hdr_bill_cl_day5.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Wrk4Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk4Dtl(MABCP_BcstRcstReg p){
		p.columnWrk4Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk4Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk4Dtl_bcst_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk4Dtl_bill_cl_day1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk4Dtl_bill_cl_day2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk4Dtl_bill_cl_day3.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk4Dtl_bill_cl_day4.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk4Dtl_bill_cl_day5.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk4Dtl_cur_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk4Dtl_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Wrk4Dtl_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Wrk4Dtl_amt_p_PPanel.columnAmt_amt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk4Dtl_sttl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk4Dtl_sttl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk4Dtl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rate.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk4Dtl_crryovr_mons_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk4Dtl_crryovr_mons_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_crryovr_mons1.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk4Dtl_rcv_day1.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk4Dtl_rcv_crryovr_mons2.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk4Dtl_rcv_day2.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk4Dtl_rcv_crryovr_mons3.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk4Dtl_rcv_day3.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk4Dtl_rcv_crryovr_mons4.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk4Dtl_rcv_day4.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk4Dtl_rcv_crryovr_mons5.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk4Dtl_rcv_day5.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk4Dtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk4Dtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk4Dtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk4Dtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk4Dtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Wrk4DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk4DtlBtn(MABCP_BcstRcstReg p){
		p.Wrk4DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk4DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk4DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk4DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk4DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk7]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk7(MABCP_BcstRcstReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk7Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk7Hdr(MABCP_BcstRcstReg p){
		p.Wrk7Hdr_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk7Hdr_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk7Hdr_set_dt.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk7Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk7Dtl(MABCP_BcstRcstReg p){
		p.columnWrk7Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk7Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk7Dtl_bp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk7Dtl_if_proc_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk7Dtl_if_proc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_not_onr_prov_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk7Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnWrk7Dtl_ext_sys_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk7Dtl_ext_sys_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk7Dtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk7Dtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk7Dtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk7Dtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Wrk7DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk7DtlBtn(MABCP_BcstRcstReg p){
		p.Wrk7DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk7DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk7DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk7DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk7DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk5]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk5(MABCP_BcstRcstReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk5Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk5Dtl(MABCP_BcstRcstReg p){
		p.columnWrk5Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk5Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk5Dtl_rcst_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk5Dtl_cur_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk5Dtl_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Wrk5Dtl_min_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.ENABLE);
		p.Wrk5Dtl_max_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.ENABLE);
		p.Wrk5Dtl_com_paid_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.columnWrk5Dtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk5Dtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk5Dtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk5Dtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk5Dtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Wrk5DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk5DtlBtn(MABCP_BcstRcstReg p){
		p.Wrk5DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk5DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk5DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk5DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk5DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk6]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk6(MABCP_BcstRcstReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk6Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk6Hdr(MABCP_BcstRcstReg p){
		p.Wrk6Hdr_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk6Hdr_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk6Hdr_set_dt.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk6Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk6Dtl(MABCP_BcstRcstReg p){
		p.columnWrk6Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk6Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk6Dtl_bp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk6Dtl_bp_cd_null_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk6Dtl_if_proc_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk6Dtl_if_proc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ar_sttl_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk6Dtl_ar_sttl_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_bank_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk6Dtl_bank_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_bank_ac_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk6Dtl_bank_ac_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Wrk6Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnWrk6Dtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk6Dtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk6Dtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk6Dtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk6Dtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Wrk6DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk6DtlBtn(MABCP_BcstRcstReg p){
		p.Wrk6DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk6DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk6DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk6DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk6DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABCP_BcstRcstReg p){
		p.Btn_open_MABCP0510.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrAll(MABCP_BcstRcstReg p){
		p.columnHdrAll_check.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bcst_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_rcst_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_rcst_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_rcst_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_ar_cred_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_ar_cred_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dpt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dpt_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bcst_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bcst_dpt_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_check_bcst_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_day1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_day2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_day3.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_day4.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_day5.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_tax_on_bill_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_tax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_tax_rnd_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_delay_days.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_ba_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_ba_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cal_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cal_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_rcv_ba_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_rcv_ba_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_auto_line_appl_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_sls_interim_cl_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_ar_setoff_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_ar_setoff_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bcst_prnt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bcst_prnt_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_zip_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_addr1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_addr2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_addr3.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_addr4.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_tel.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_bcst_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_bcst_dpt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_bcst_psn.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_bcst_psn_title.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_prnt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_prnt_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_sls_dtl_outp_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_sls_dtl_outp_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_outp_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bfw_bal_disp_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_adv_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_rcv_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_subttl_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_subttl_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_brk_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_brk_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_sort_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_sort_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_can_slip_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bill_can_slip_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_rcv_auto_appl_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_rcv_amt_match_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_ar_sttl_typ_match_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_calc_com_paid_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_auto_appl_delay_days.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_xfr_psn.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_ins_usr_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_ins_usr_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_ins_ts.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_ins_func_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_ins_func_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_upd_usr_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_upd_usr_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_upd_ts.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_upd_func_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_upd_func_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_upd_srv_req_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_del_usr_id.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_del_usr_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_del_ts.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_rcst_prnt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_rcst_prnt_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_BcstRcstReg p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABCP_BcstRcstReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_BcstRcstReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_BcstRcstReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_BcstRcstReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_bp_cd.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_bp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABCP_BcstRcstReg p){

	}

	/**
	 * [FIX]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tbl(MABCP_BcstRcstReg p){

	}

	/**
	 * [FIX]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Hdr(MABCP_BcstRcstReg p){
		p.Hdr_bp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bcst_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_rcst_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_rcst_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_rcst_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_ar_cred_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_ar_cred_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bcst_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bcst_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_check_bcst_dpt_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_bill_cl_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_cl_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day2.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day3.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day4.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day5.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_tax_on_bill_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_tax_rnd_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_tax_rnd_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_cl_delay_days.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_cl_ba_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_cl_ba_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_cal_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_cal_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_rcv_ba_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_rcv_ba_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_auto_line_appl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_sls_interim_cl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_ar_setoff_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_ar_setoff_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bcst_prnt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bcst_prnt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_zip_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_addr1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_addr2.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_addr3.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_addr4.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_tel.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_bcst_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_bcst_dpt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_bcst_psn.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_bcst_psn_title.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_prnt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_prnt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_sls_dtl_outp_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_sls_dtl_outp_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_outp_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bfw_bal_disp_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_adv_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_rcv_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_subttl_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_subttl_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_brk_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_brk_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_sort_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_sort_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_can_slip_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bill_can_slip_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_rcv_auto_appl_tgt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_rcv_amt_match_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_ar_sttl_typ_match_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_calc_com_paid_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_auto_appl_delay_days.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_xfr_psn.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_rcst_prnt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_rcst_prnt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlTab(MABCP_BcstRcstReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk1Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk1Hdr(MABCP_BcstRcstReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk2Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk2Hdr(MABCP_BcstRcstReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk3Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk3Hdr(MABCP_BcstRcstReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk4]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk4(MABCP_BcstRcstReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk4Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk4Hdr(MABCP_BcstRcstReg p){
		p.Wrk4Hdr_bill_cl_day1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk4Hdr_bill_cl_day2.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk4Hdr_bill_cl_day3.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk4Hdr_bill_cl_day4.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk4Hdr_bill_cl_day5.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Wrk4Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk4Dtl(MABCP_BcstRcstReg p){
		p.columnWrk4Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_bcst_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk4Dtl_bill_cl_day1.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk4Dtl_bill_cl_day2.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk4Dtl_bill_cl_day3.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk4Dtl_bill_cl_day4.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk4Dtl_bill_cl_day5.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk4Dtl_cur_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_cur_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_amt_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.Wrk4Dtl_amt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Wrk4Dtl_amt_p_PPanel.columnAmt_amt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_sttl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_sttl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rate.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_crryovr_mons_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_crryovr_mons_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_crryovr_mons1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_day1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_crryovr_mons2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_day2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_crryovr_mons3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_day3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_crryovr_mons4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_day4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_crryovr_mons5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_day5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk4Dtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Wrk4DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk4DtlBtn(MABCP_BcstRcstReg p){
		p.Wrk4DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk4DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk4DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk4DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk4DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk7]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk7(MABCP_BcstRcstReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk7Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk7Hdr(MABCP_BcstRcstReg p){
		p.Wrk7Hdr_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk7Hdr_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk7Hdr_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk7Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk7Dtl(MABCP_BcstRcstReg p){
		p.columnWrk7Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_bp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk7Dtl_if_proc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_if_proc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_not_onr_prov_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk7Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk7Dtl_ext_sys_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ext_sys_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk7Dtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Wrk7DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk7DtlBtn(MABCP_BcstRcstReg p){
		p.Wrk7DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk7DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk7DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk7DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk7DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk5]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk5(MABCP_BcstRcstReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk5Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk5Dtl(MABCP_BcstRcstReg p){
		p.columnWrk5Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_rcst_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk5Dtl_cur_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_cur_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_amt_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.Wrk5Dtl_min_amt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Wrk5Dtl_max_amt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Wrk5Dtl_com_paid_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnWrk5Dtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk5Dtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Wrk5DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk5DtlBtn(MABCP_BcstRcstReg p){
		p.Wrk5DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk5DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk5DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk5DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk5DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk6]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk6(MABCP_BcstRcstReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk6Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk6Hdr(MABCP_BcstRcstReg p){
		p.Wrk6Hdr_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk6Hdr_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk6Hdr_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk6Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk6Dtl(MABCP_BcstRcstReg p){
		p.columnWrk6Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_bp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk6Dtl_bp_cd_null_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk6Dtl_if_proc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_if_proc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ar_sttl_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ar_sttl_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_bank_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_bank_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_bank_ac_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_bank_ac_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk6Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk6Dtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk6Dtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Wrk6DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk6DtlBtn(MABCP_BcstRcstReg p){
		p.Wrk6DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk6DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk6DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk6DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk6DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABCP_BcstRcstReg p){
		p.Btn_open_MABCP0510.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_HdrAll(MABCP_BcstRcstReg p){
		p.columnHdrAll_check.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bp_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bcst_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_rcst_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_rcst_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_rcst_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_ar_cred_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_ar_cred_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dpt_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dpt_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bcst_dpt_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bcst_dpt_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_check_bcst_dpt_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_day1.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_day2.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_day3.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_day4.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_day5.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_tax_on_bill_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_tax_rnd_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_tax_rnd_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_delay_days.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_ba_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_ba_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cal_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cal_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_rcv_ba_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_rcv_ba_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_auto_line_appl_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_sls_interim_cl_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_ar_setoff_grp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_ar_setoff_grp_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bcst_prnt_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bcst_prnt_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_zip_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_addr1.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_addr2.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_addr3.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_addr4.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_tel.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_bcst_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_bcst_dpt.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_bcst_psn.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_bcst_psn_title.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_prnt_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_prnt_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_sls_dtl_outp_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_sls_dtl_outp_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_outp_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bfw_bal_disp_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_adv_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_rcv_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_subttl_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_subttl_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_brk_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_brk_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_sort_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_sort_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_can_slip_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bill_can_slip_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_rcv_auto_appl_tgt_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_rcv_amt_match_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_ar_sttl_typ_match_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_calc_com_paid_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_auto_appl_delay_days.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_xfr_psn.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_ins_usr_id.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_ins_usr_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_ins_ts.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_ins_func_id.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_ins_func_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_upd_usr_id.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_upd_usr_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_upd_ts.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_upd_func_id.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_upd_func_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_upd_srv_req_no.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_del_usr_id.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_del_usr_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_del_ts.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_rcst_prnt_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_rcst_prnt_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_BcstRcstReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_BcstRcstReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_BcstRcstReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_BcstRcstReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_BcstRcstReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_bp_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_BcstRcstReg p){

	}

	/**
	 * [REF]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tbl(MABCP_BcstRcstReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MABCP_BcstRcstReg p){
		p.Hdr_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bcst_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcst_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ar_cred_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ar_cred_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_dpt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bcst_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bcst_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_check_bcst_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_bill_cl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_cl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day4.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_cl_day5.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tax_on_bill_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_tax_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_tax_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_cl_delay_days.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_cl_ba_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_cl_ba_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_cal_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_cal_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcv_ba_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcv_ba_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_auto_line_appl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sls_interim_cl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ar_setoff_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ar_setoff_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bcst_prnt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bcst_prnt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_zip_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_addr1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_addr2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_addr3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_addr4.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_tel.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_bcst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_bcst_dpt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_bcst_psn.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_bcst_psn_title.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_prnt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_prnt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sls_dtl_outp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sls_dtl_outp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_outp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bfw_bal_disp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_adv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_rcv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_subttl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_subttl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_brk_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_brk_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_sort_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_dtl_sort_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_can_slip_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bill_can_slip_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcv_auto_appl_tgt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcv_amt_match_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ar_sttl_typ_match_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_calc_com_paid_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_auto_appl_delay_days.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_xfr_psn.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcst_prnt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rcst_prnt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlTab(MABCP_BcstRcstReg p){

	}

	/**
	 * [REF]ステータスの[Wrk1Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk1Hdr(MABCP_BcstRcstReg p){

	}

	/**
	 * [REF]ステータスの[Wrk2Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk2Hdr(MABCP_BcstRcstReg p){

	}

	/**
	 * [REF]ステータスの[Wrk3Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk3Hdr(MABCP_BcstRcstReg p){

	}

	/**
	 * [REF]ステータスの[Wrk4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk4(MABCP_BcstRcstReg p){

	}

	/**
	 * [REF]ステータスの[Wrk4Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk4Hdr(MABCP_BcstRcstReg p){
		p.Wrk4Hdr_bill_cl_day1.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk4Hdr_bill_cl_day2.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk4Hdr_bill_cl_day3.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk4Hdr_bill_cl_day4.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk4Hdr_bill_cl_day5.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk4Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk4Dtl(MABCP_BcstRcstReg p){
		p.columnWrk4Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_bcst_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk4Dtl_bill_cl_day1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk4Dtl_bill_cl_day2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk4Dtl_bill_cl_day3.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk4Dtl_bill_cl_day4.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk4Dtl_bill_cl_day5.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk4Dtl_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Wrk4Dtl_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Wrk4Dtl_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_sttl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_sttl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_crryovr_mons_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_crryovr_mons_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_crryovr_mons1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_day1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_crryovr_mons2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_day2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_crryovr_mons3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_day3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_crryovr_mons4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_day4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_crryovr_mons5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_rcv_day5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk4Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk4DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk4DtlBtn(MABCP_BcstRcstReg p){
		p.Wrk4DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk4DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk4DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk4DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk4DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk7]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk7(MABCP_BcstRcstReg p){

	}

	/**
	 * [REF]ステータスの[Wrk7Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk7Hdr(MABCP_BcstRcstReg p){
		p.Wrk7Hdr_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk7Hdr_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk7Hdr_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk7Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk7Dtl(MABCP_BcstRcstReg p){
		p.columnWrk7Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_bp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk7Dtl_if_proc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_if_proc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_not_onr_prov_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk7Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk7Dtl_ext_sys_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk7Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk7DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk7DtlBtn(MABCP_BcstRcstReg p){
		p.Wrk7DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk7DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk7DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk7DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk7DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk5]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk5(MABCP_BcstRcstReg p){

	}

	/**
	 * [REF]ステータスの[Wrk5Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk5Dtl(MABCP_BcstRcstReg p){
		p.columnWrk5Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_rcst_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk5Dtl_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Wrk5Dtl_min_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Wrk5Dtl_max_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Wrk5Dtl_com_paid_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnWrk5Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk5Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk5DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk5DtlBtn(MABCP_BcstRcstReg p){
		p.Wrk5DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk5DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk5DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk5DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk5DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk6]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk6(MABCP_BcstRcstReg p){

	}

	/**
	 * [REF]ステータスの[Wrk6Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk6Hdr(MABCP_BcstRcstReg p){
		p.Wrk6Hdr_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk6Hdr_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk6Hdr_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk6Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk6Dtl(MABCP_BcstRcstReg p){
		p.columnWrk6Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_bp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk6Dtl_bp_cd_null_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk6Dtl_if_proc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_if_proc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ar_sttl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ar_sttl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_bank_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_bank_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk6Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk6Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk6Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk6DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk6DtlBtn(MABCP_BcstRcstReg p){
		p.Wrk6DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk6DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk6DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk6DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk6DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABCP_BcstRcstReg p){
		p.Btn_open_MABCP0510.putMode(p, REF, MCMode.ENABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrAll(MABCP_BcstRcstReg p){
		p.columnHdrAll_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bcst_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_rcst_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_rcst_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_rcst_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_ar_cred_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_ar_cred_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dpt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dpt_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bcst_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bcst_dpt_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_check_bcst_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_day1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_day2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_day3.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_day4.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_day5.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_tax_on_bill_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_tax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_tax_rnd_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_delay_days.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_ba_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cl_ba_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cal_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_cal_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_rcv_ba_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_rcv_ba_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_auto_line_appl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_sls_interim_cl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_ar_setoff_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_ar_setoff_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bcst_prnt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bcst_prnt_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_zip_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_addr1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_addr2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_addr3.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_addr4.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_tel.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_bcst_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_bcst_dpt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_bcst_psn.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_bcst_psn_title.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_prnt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_prnt_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_sls_dtl_outp_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_sls_dtl_outp_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_outp_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bfw_bal_disp_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_adv_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_rcv_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_subttl_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_subttl_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_brk_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_brk_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_sort_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_dtl_sort_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_can_slip_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bill_can_slip_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_rcv_auto_appl_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_rcv_amt_match_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_ar_sttl_typ_match_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_calc_com_paid_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_auto_appl_delay_days.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_xfr_psn.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_ins_usr_id.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_ins_usr_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_ins_ts.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_ins_func_id.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_ins_func_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_upd_usr_id.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_upd_usr_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_upd_ts.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_upd_func_id.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_upd_func_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_upd_srv_req_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_del_usr_id.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_del_usr_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_del_ts.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_rcst_prnt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_rcst_prnt_typ_nm.putMode(p, REF, MCMode.INVISIBLE);

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
		MABCP_BcstRcstReg_MC.setTableConfigWrk4Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.setTableConfigWrk7Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.setTableConfigWrk5Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.setTableConfigWrk6Dtl((MABCP_BcstRcstReg)this);
		MABCP_BcstRcstReg_MC.setTableConfigHdrAll((MABCP_BcstRcstReg)this);
	}

	/**
	 * [Wrk4Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk4Dtl(MABCP_BcstRcstReg p) {
		p.columnWrk4Dtl_check.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.check_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_check);
		p.columnWrk4Dtl_del_flg.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.del_flg_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_del_flg);
		p.columnWrk4Dtl_bcst_cd.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.bcst_cd_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_bcst_cd);
		p.columnWrk4Dtl_bill_cl_day1.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.bill_cl_day1_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_bill_cl_day1);
		p.columnWrk4Dtl_bill_cl_day2.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.bill_cl_day2_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_bill_cl_day2);
		p.columnWrk4Dtl_bill_cl_day3.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.bill_cl_day3_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_bill_cl_day3);
		p.columnWrk4Dtl_bill_cl_day4.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.bill_cl_day4_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_bill_cl_day4);
		p.columnWrk4Dtl_bill_cl_day5.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.bill_cl_day5_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_bill_cl_day5);
		p.columnWrk4Dtl_cur_cd.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.cur_cd_META);
		p.columnWrk4Dtl_cur_cd.addLinkBeans(p.columnWrk4Dtl_cur_nm,p.columnWrk4Dtl_amt_dec_place);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_cur_cd);
		p.columnWrk4Dtl_cur_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.cur_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_cur_nm);
		p.columnWrk4Dtl_amt_dec_place.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.amt_dec_place_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_amt_dec_place);
		p.Wrk4DtlTable.addTable(p.Wrk4Dtl_amt_p_PPanel.AmtTable);
		p.columnWrk4Dtl_sttl_cd.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.sttl_cd_META);
		p.columnWrk4Dtl_sttl_cd.addLinkBeans(p.columnWrk4Dtl_sttl_nm);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_sttl_cd);
		p.columnWrk4Dtl_sttl_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.sttl_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_sttl_nm);
		p.columnWrk4Dtl_wg_cd.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.wg_cd_META);
		p.columnWrk4Dtl_wg_cd.addLinkBeans(p.columnWrk4Dtl_wg_nm);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_wg_cd);
		p.columnWrk4Dtl_wg_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.wg_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_wg_nm);
		p.columnWrk4Dtl_rate.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.rate_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_rate);
		p.columnWrk4Dtl_crryovr_mons_typ.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.crryovr_mons_typ_META);
		p.columnWrk4Dtl_crryovr_mons_typ.addLinkBeans(p.columnWrk4Dtl_crryovr_mons_typ_nm);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_crryovr_mons_typ);
		p.columnWrk4Dtl_crryovr_mons_typ_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.crryovr_mons_typ_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_crryovr_mons_typ_nm);
		p.columnWrk4Dtl_rcv_crryovr_mons1.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.rcv_crryovr_mons1_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_rcv_crryovr_mons1);
		p.columnWrk4Dtl_rcv_day1.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.rcv_day1_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_rcv_day1);
		p.columnWrk4Dtl_rcv_crryovr_mons2.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.rcv_crryovr_mons2_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_rcv_crryovr_mons2);
		p.columnWrk4Dtl_rcv_day2.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.rcv_day2_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_rcv_day2);
		p.columnWrk4Dtl_rcv_crryovr_mons3.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.rcv_crryovr_mons3_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_rcv_crryovr_mons3);
		p.columnWrk4Dtl_rcv_day3.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.rcv_day3_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_rcv_day3);
		p.columnWrk4Dtl_rcv_crryovr_mons4.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.rcv_crryovr_mons4_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_rcv_crryovr_mons4);
		p.columnWrk4Dtl_rcv_day4.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.rcv_day4_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_rcv_day4);
		p.columnWrk4Dtl_rcv_crryovr_mons5.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.rcv_crryovr_mons5_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_rcv_crryovr_mons5);
		p.columnWrk4Dtl_rcv_day5.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.rcv_day5_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_rcv_day5);
		p.columnWrk4Dtl_memo1.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.memo1_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_memo1);
		p.columnWrk4Dtl_memo2.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.memo2_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_memo2);
		p.columnWrk4Dtl_memo3.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.memo3_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_memo3);
		p.columnWrk4Dtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.ins_usr_id_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_ins_usr_id);
		p.columnWrk4Dtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.ins_usr_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_ins_usr_nm);
		p.columnWrk4Dtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.ins_ts_META);
		p.columnWrk4Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_ins_ts);
		p.columnWrk4Dtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.ins_func_id_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_ins_func_id);
		p.columnWrk4Dtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.ins_func_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_ins_func_nm);
		p.columnWrk4Dtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.upd_cntr_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_cntr);
		p.columnWrk4Dtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.upd_usr_id_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_usr_id);
		p.columnWrk4Dtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.upd_usr_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_usr_nm);
		p.columnWrk4Dtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.upd_ts_META);
		p.columnWrk4Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_ts);
		p.columnWrk4Dtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.upd_func_id_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_func_id);
		p.columnWrk4Dtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.upd_func_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_func_nm);
		p.columnWrk4Dtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.upd_srv_req_no_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_srv_req_no);
		p.columnWrk4Dtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.del_usr_id_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_del_usr_id);
		p.columnWrk4Dtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.del_usr_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_del_usr_nm);
		p.columnWrk4Dtl_del_ts.setMeta(mcframe.clientMABC.MABCP0560.Wrk4DtlR.del_ts_META);
		p.columnWrk4Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk4DtlTable.setUnscrollColumn(p.columnWrk4Dtl_del_flg);
	}

	/**
	 * [Wrk7Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk7Dtl(MABCP_BcstRcstReg p) {
		p.columnWrk7Dtl_check.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.check_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_check);
		p.columnWrk7Dtl_del_flg.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.del_flg_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_del_flg);
		p.columnWrk7Dtl_bp_cd.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.bp_cd_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_bp_cd);
		p.columnWrk7Dtl_if_proc_typ.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.if_proc_typ_META);
		p.columnWrk7Dtl_if_proc_typ.addLinkBeans(p.columnWrk7Dtl_if_proc_typ_nm);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_if_proc_typ);
		p.columnWrk7Dtl_if_proc_typ_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.if_proc_typ_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_if_proc_typ_nm);
		p.columnWrk7Dtl_not_onr_prov_flg.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.not_onr_prov_flg_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_not_onr_prov_flg);
		p.Wrk7DtlTable.addTable(p.Wrk7Dtl_dt_p_PPanel.DtTable);
		p.columnWrk7Dtl_ext_sys_cd.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.ext_sys_cd_META);
		p.columnWrk7Dtl_ext_sys_cd.addLinkBeans(p.columnWrk7Dtl_ext_sys_nm);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_ext_sys_cd);
		p.columnWrk7Dtl_ext_sys_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.ext_sys_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_ext_sys_nm);
		p.columnWrk7Dtl_memo1.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.memo1_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_memo1);
		p.columnWrk7Dtl_memo2.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.memo2_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_memo2);
		p.columnWrk7Dtl_memo3.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.memo3_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_memo3);
		p.columnWrk7Dtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.ins_usr_id_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_ins_usr_id);
		p.columnWrk7Dtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.ins_usr_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_ins_usr_nm);
		p.columnWrk7Dtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.ins_ts_META);
		p.columnWrk7Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_ins_ts);
		p.columnWrk7Dtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.ins_func_id_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_ins_func_id);
		p.columnWrk7Dtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.ins_func_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_ins_func_nm);
		p.columnWrk7Dtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.upd_cntr_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_upd_cntr);
		p.columnWrk7Dtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.upd_usr_id_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_upd_usr_id);
		p.columnWrk7Dtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.upd_usr_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_upd_usr_nm);
		p.columnWrk7Dtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.upd_ts_META);
		p.columnWrk7Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_upd_ts);
		p.columnWrk7Dtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.upd_func_id_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_upd_func_id);
		p.columnWrk7Dtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.upd_func_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_upd_func_nm);
		p.columnWrk7Dtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.upd_srv_req_no_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_upd_srv_req_no);
		p.columnWrk7Dtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.del_usr_id_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_del_usr_id);
		p.columnWrk7Dtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.del_usr_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_del_usr_nm);
		p.columnWrk7Dtl_del_ts.setMeta(mcframe.clientMABC.MABCP0560.Wrk7DtlR.del_ts_META);
		p.columnWrk7Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk7DtlTable.setUnscrollColumn(p.columnWrk7Dtl_del_flg);
	}

	/**
	 * [Wrk5Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk5Dtl(MABCP_BcstRcstReg p) {
		p.columnWrk5Dtl_check.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.check_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_check);
		p.columnWrk5Dtl_del_flg.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.del_flg_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_del_flg);
		p.columnWrk5Dtl_rcst_cd.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.rcst_cd_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_rcst_cd);
		p.columnWrk5Dtl_cur_cd.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.cur_cd_META);
		p.columnWrk5Dtl_cur_cd.addLinkBeans(p.columnWrk5Dtl_cur_nm,p.columnWrk5Dtl_amt_dec_place);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_cur_cd);
		p.columnWrk5Dtl_cur_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.cur_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_cur_nm);
		p.columnWrk5Dtl_amt_dec_place.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.amt_dec_place_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_amt_dec_place);
		p.Wrk5DtlTable.addTable(p.Wrk5Dtl_min_amt_p_PPanel.AmtTable);
		p.Wrk5DtlTable.addTable(p.Wrk5Dtl_max_amt_p_PPanel.AmtTable);
		p.Wrk5DtlTable.addTable(p.Wrk5Dtl_com_paid_p_PPanel.AmtTable);
		p.columnWrk5Dtl_memo1.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.memo1_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_memo1);
		p.columnWrk5Dtl_memo2.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.memo2_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_memo2);
		p.columnWrk5Dtl_memo3.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.memo3_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_memo3);
		p.columnWrk5Dtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.ins_usr_id_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ins_usr_id);
		p.columnWrk5Dtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.ins_usr_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ins_usr_nm);
		p.columnWrk5Dtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.ins_ts_META);
		p.columnWrk5Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ins_ts);
		p.columnWrk5Dtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.ins_func_id_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ins_func_id);
		p.columnWrk5Dtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.ins_func_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ins_func_nm);
		p.columnWrk5Dtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.upd_cntr_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_cntr);
		p.columnWrk5Dtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.upd_usr_id_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_usr_id);
		p.columnWrk5Dtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.upd_usr_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_usr_nm);
		p.columnWrk5Dtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.upd_ts_META);
		p.columnWrk5Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_ts);
		p.columnWrk5Dtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.upd_func_id_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_func_id);
		p.columnWrk5Dtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.upd_func_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_func_nm);
		p.columnWrk5Dtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.upd_srv_req_no_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_srv_req_no);
		p.columnWrk5Dtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.del_usr_id_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_del_usr_id);
		p.columnWrk5Dtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.del_usr_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_del_usr_nm);
		p.columnWrk5Dtl_del_ts.setMeta(mcframe.clientMABC.MABCP0560.Wrk5DtlR.del_ts_META);
		p.columnWrk5Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk5DtlTable.setUnscrollColumn(p.columnWrk5Dtl_del_flg);
	}

	/**
	 * [Wrk6Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk6Dtl(MABCP_BcstRcstReg p) {
		p.columnWrk6Dtl_check.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.check_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_check);
		p.columnWrk6Dtl_del_flg.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.del_flg_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_del_flg);
		p.columnWrk6Dtl_bp_cd.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.bp_cd_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_bp_cd);
		p.columnWrk6Dtl_bp_cd_null_flg.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.bp_cd_null_flg_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_bp_cd_null_flg);
		p.columnWrk6Dtl_if_proc_typ.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.if_proc_typ_META);
		p.columnWrk6Dtl_if_proc_typ.addLinkBeans(p.columnWrk6Dtl_if_proc_typ_nm);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_if_proc_typ);
		p.columnWrk6Dtl_if_proc_typ_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.if_proc_typ_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_if_proc_typ_nm);
		p.columnWrk6Dtl_ar_sttl_typ.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.ar_sttl_typ_META);
		p.columnWrk6Dtl_ar_sttl_typ.addLinkBeans(p.columnWrk6Dtl_ar_sttl_typ_nm);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_ar_sttl_typ);
		p.columnWrk6Dtl_ar_sttl_typ_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.ar_sttl_typ_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_ar_sttl_typ_nm);
		p.columnWrk6Dtl_bank_cd.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.bank_cd_META);
		p.columnWrk6Dtl_bank_cd.addLinkBeans(p.columnWrk6Dtl_bank_nm);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_bank_cd);
		p.columnWrk6Dtl_bank_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.bank_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_bank_nm);
		p.columnWrk6Dtl_bank_ac_cd.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.bank_ac_cd_META);
		p.columnWrk6Dtl_bank_ac_cd.addLinkBeans(p.columnWrk6Dtl_bank_ac_nm);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_bank_ac_cd);
		p.columnWrk6Dtl_bank_ac_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.bank_ac_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_bank_ac_nm);
		p.Wrk6DtlTable.addTable(p.Wrk6Dtl_dt_p_PPanel.DtTable);
		p.columnWrk6Dtl_memo1.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.memo1_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_memo1);
		p.columnWrk6Dtl_memo2.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.memo2_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_memo2);
		p.columnWrk6Dtl_memo3.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.memo3_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_memo3);
		p.columnWrk6Dtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.ins_usr_id_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_ins_usr_id);
		p.columnWrk6Dtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.ins_usr_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_ins_usr_nm);
		p.columnWrk6Dtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.ins_ts_META);
		p.columnWrk6Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_ins_ts);
		p.columnWrk6Dtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.ins_func_id_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_ins_func_id);
		p.columnWrk6Dtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.ins_func_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_ins_func_nm);
		p.columnWrk6Dtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.upd_cntr_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_upd_cntr);
		p.columnWrk6Dtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.upd_usr_id_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_upd_usr_id);
		p.columnWrk6Dtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.upd_usr_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_upd_usr_nm);
		p.columnWrk6Dtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.upd_ts_META);
		p.columnWrk6Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_upd_ts);
		p.columnWrk6Dtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.upd_func_id_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_upd_func_id);
		p.columnWrk6Dtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.upd_func_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_upd_func_nm);
		p.columnWrk6Dtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.upd_srv_req_no_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_upd_srv_req_no);
		p.columnWrk6Dtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.del_usr_id_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_del_usr_id);
		p.columnWrk6Dtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.del_usr_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_del_usr_nm);
		p.columnWrk6Dtl_del_ts.setMeta(mcframe.clientMABC.MABCP0560.Wrk6DtlR.del_ts_META);
		p.columnWrk6Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk6DtlTable.setUnscrollColumn(p.columnWrk6Dtl_del_flg);
	}

	/**
	 * [HdrAll]ブロックのTableの設定
	 */
	protected static void setTableConfigHdrAll(MABCP_BcstRcstReg p) {
		p.columnHdrAll_check.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.check_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_check);
		p.columnHdrAll_bp_cd.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bp_cd_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bp_cd);
		p.columnHdrAll_bp_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bp_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bp_nm);
		p.columnHdrAll_bcst_flg.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bcst_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bcst_flg);
		p.columnHdrAll_rcst_flg.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.rcst_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_rcst_flg);
		p.columnHdrAll_rcst_cd.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.rcst_cd_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_rcst_cd);
		p.columnHdrAll_rcst_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.rcst_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_rcst_nm);
		p.columnHdrAll_ar_cred_cd.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.ar_cred_cd_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_ar_cred_cd);
		p.columnHdrAll_ar_cred_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.ar_cred_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_ar_cred_nm);
		p.columnHdrAll_bill_dpt_typ.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_dpt_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_dpt_typ);
		p.columnHdrAll_bill_dpt_typ_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_dpt_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_dpt_typ_nm);
		p.columnHdrAll_bcst_dpt_cd.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bcst_dpt_cd_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bcst_dpt_cd);
		p.columnHdrAll_bcst_dpt_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bcst_dpt_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bcst_dpt_nm);
		p.columnHdrAll_check_bcst_dpt_cd.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.check_bcst_dpt_cd_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_check_bcst_dpt_cd);
		p.columnHdrAll_bill_cl_typ.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_cl_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_cl_typ);
		p.columnHdrAll_bill_cl_typ_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_cl_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_cl_typ_nm);
		p.columnHdrAll_bill_cl_day1.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_cl_day1_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_cl_day1);
		p.columnHdrAll_bill_cl_day2.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_cl_day2_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_cl_day2);
		p.columnHdrAll_bill_cl_day3.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_cl_day3_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_cl_day3);
		p.columnHdrAll_bill_cl_day4.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_cl_day4_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_cl_day4);
		p.columnHdrAll_bill_cl_day5.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_cl_day5_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_cl_day5);
		p.columnHdrAll_tax_on_bill_flg.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.tax_on_bill_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_tax_on_bill_flg);
		p.columnHdrAll_bill_tax_rnd_typ.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_tax_rnd_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_tax_rnd_typ);
		p.columnHdrAll_bill_tax_rnd_typ_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_tax_rnd_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_tax_rnd_typ_nm);
		p.columnHdrAll_bill_cl_delay_days.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_cl_delay_days_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_cl_delay_days);
		p.columnHdrAll_bill_cl_ba_typ.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_cl_ba_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_cl_ba_typ);
		p.columnHdrAll_bill_cl_ba_typ_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_cl_ba_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_cl_ba_typ_nm);
		p.columnHdrAll_bill_cal_cd.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_cal_cd_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_cal_cd);
		p.columnHdrAll_bill_cal_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_cal_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_cal_nm);
		p.columnHdrAll_rcv_ba_typ.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.rcv_ba_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_rcv_ba_typ);
		p.columnHdrAll_rcv_ba_typ_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.rcv_ba_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_rcv_ba_typ_nm);
		p.columnHdrAll_auto_line_appl_flg.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.auto_line_appl_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_auto_line_appl_flg);
		p.columnHdrAll_sls_interim_cl_flg.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.sls_interim_cl_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_sls_interim_cl_flg);
		p.columnHdrAll_ar_setoff_grp_cd.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.ar_setoff_grp_cd_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_ar_setoff_grp_cd);
		p.columnHdrAll_ar_setoff_grp_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.ar_setoff_grp_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_ar_setoff_grp_nm);
		p.columnHdrAll_bcst_prnt_typ.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bcst_prnt_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bcst_prnt_typ);
		p.columnHdrAll_bcst_prnt_typ_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bcst_prnt_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bcst_prnt_typ_nm);
		p.columnHdrAll_bill_zip_cd.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_zip_cd_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_zip_cd);
		p.columnHdrAll_bill_addr1.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_addr1_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_addr1);
		p.columnHdrAll_bill_addr2.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_addr2_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_addr2);
		p.columnHdrAll_bill_addr3.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_addr3_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_addr3);
		p.columnHdrAll_bill_addr4.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_addr4_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_addr4);
		p.columnHdrAll_bill_tel.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_tel_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_tel);
		p.columnHdrAll_bill_bcst_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_bcst_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_bcst_nm);
		p.columnHdrAll_bill_bcst_dpt.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_bcst_dpt_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_bcst_dpt);
		p.columnHdrAll_bill_bcst_psn.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_bcst_psn_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_bcst_psn);
		p.columnHdrAll_bill_bcst_psn_title.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_bcst_psn_title_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_bcst_psn_title);
		p.columnHdrAll_bill_prnt_typ.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_prnt_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_prnt_typ);
		p.columnHdrAll_bill_prnt_typ_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_prnt_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_prnt_typ_nm);
		p.columnHdrAll_sls_dtl_outp_typ.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.sls_dtl_outp_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_sls_dtl_outp_typ);
		p.columnHdrAll_sls_dtl_outp_typ_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.sls_dtl_outp_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_sls_dtl_outp_typ_nm);
		p.columnHdrAll_bill_dtl_outp_flg.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_dtl_outp_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_dtl_outp_flg);
		p.columnHdrAll_bfw_bal_disp_flg.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bfw_bal_disp_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bfw_bal_disp_flg);
		p.columnHdrAll_bill_dtl_adv_flg.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_dtl_adv_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_dtl_adv_flg);
		p.columnHdrAll_bill_dtl_rcv_flg.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_dtl_rcv_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_dtl_rcv_flg);
		p.columnHdrAll_bill_dtl_subttl_typ.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_dtl_subttl_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_dtl_subttl_typ);
		p.columnHdrAll_bill_dtl_subttl_typ_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_dtl_subttl_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_dtl_subttl_typ_nm);
		p.columnHdrAll_bill_dtl_brk_typ.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_dtl_brk_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_dtl_brk_typ);
		p.columnHdrAll_bill_dtl_brk_typ_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_dtl_brk_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_dtl_brk_typ_nm);
		p.columnHdrAll_bill_dtl_sort_typ.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_dtl_sort_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_dtl_sort_typ);
		p.columnHdrAll_bill_dtl_sort_typ_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_dtl_sort_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_dtl_sort_typ_nm);
		p.columnHdrAll_bill_can_slip_typ.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_can_slip_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_can_slip_typ);
		p.columnHdrAll_bill_can_slip_typ_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.bill_can_slip_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bill_can_slip_typ_nm);
		p.columnHdrAll_rcv_auto_appl_tgt_flg.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.rcv_auto_appl_tgt_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_rcv_auto_appl_tgt_flg);
		p.columnHdrAll_rcv_amt_match_flg.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.rcv_amt_match_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_rcv_amt_match_flg);
		p.columnHdrAll_ar_sttl_typ_match_flg.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.ar_sttl_typ_match_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_ar_sttl_typ_match_flg);
		p.columnHdrAll_calc_com_paid_flg.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.calc_com_paid_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_calc_com_paid_flg);
		p.columnHdrAll_auto_appl_delay_days.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.auto_appl_delay_days_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_auto_appl_delay_days);
		p.columnHdrAll_xfr_psn.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.xfr_psn_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_xfr_psn);
		p.columnHdrAll_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.ins_usr_id_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_ins_usr_id);
		p.columnHdrAll_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.ins_usr_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_ins_usr_nm);
		p.columnHdrAll_ins_ts.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.ins_ts_META);
		p.columnHdrAll_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_ins_ts);
		p.columnHdrAll_ins_func_id.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.ins_func_id_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_ins_func_id);
		p.columnHdrAll_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.ins_func_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_ins_func_nm);
		p.columnHdrAll_upd_cntr.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.upd_cntr_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_upd_cntr);
		p.columnHdrAll_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.upd_usr_id_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_upd_usr_id);
		p.columnHdrAll_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.upd_usr_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_upd_usr_nm);
		p.columnHdrAll_upd_ts.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.upd_ts_META);
		p.columnHdrAll_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_upd_ts);
		p.columnHdrAll_upd_func_id.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.upd_func_id_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_upd_func_id);
		p.columnHdrAll_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.upd_func_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_upd_func_nm);
		p.columnHdrAll_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.upd_srv_req_no_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_upd_srv_req_no);
		p.columnHdrAll_del_usr_id.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.del_usr_id_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_del_usr_id);
		p.columnHdrAll_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.del_usr_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_del_usr_nm);
		p.columnHdrAll_del_ts.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.del_ts_META);
		p.columnHdrAll_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_del_ts);
		p.columnHdrAll_rcst_prnt_typ.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.rcst_prnt_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_rcst_prnt_typ);
		p.columnHdrAll_rcst_prnt_typ_nm.setMeta(mcframe.clientMABC.MABCP0560.HdrAllR.rcst_prnt_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_rcst_prnt_typ_nm);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_bp_cd.getListConfig().setPutter(getCnd_bp_cd_ListPutter());
		Hdr_rcst_cd.getListConfig().setPutter(getHdr_rcst_cd_ListPutter());
		Hdr_ar_cred_cd.getListConfig().setPutter(getHdr_ar_cred_cd_ListPutter());
		Hdr_bill_dpt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_bill_dpt_typ.getListConfig().setPutter(getHdr_bill_dpt_typ_ListPutter());
		Hdr_bcst_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_bcst_dpt_cd.getListConfig().setPutter(getHdr_bcst_dpt_cd_ListPutter());
		Hdr_bill_cl_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_bill_cl_typ.getListConfig().setPutter(getHdr_bill_cl_typ_ListPutter());
		Hdr_bill_tax_rnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_bill_tax_rnd_typ.getListConfig().setPutter(getHdr_bill_tax_rnd_typ_ListPutter());
		Hdr_bill_cl_ba_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_bill_cl_ba_typ.getListConfig().setPutter(getHdr_bill_cl_ba_typ_ListPutter());
		Hdr_bill_cal_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_bill_cal_cd.getListConfig().setPutter(getHdr_bill_cal_cd_ListPutter());
		Hdr_rcv_ba_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_rcv_ba_typ.getListConfig().setPutter(getHdr_rcv_ba_typ_ListPutter());
		Hdr_ar_setoff_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_ar_setoff_grp_cd.getListConfig().setPutter(getHdr_ar_setoff_grp_cd_ListPutter());
		Hdr_bcst_prnt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_bcst_prnt_typ.getListConfig().setPutter(getHdr_bcst_prnt_typ_ListPutter());
		Hdr_bill_prnt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_bill_prnt_typ.getListConfig().setPutter(getHdr_bill_prnt_typ_ListPutter());
		Hdr_sls_dtl_outp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_sls_dtl_outp_typ.getListConfig().setPutter(getHdr_sls_dtl_outp_typ_ListPutter());
		Hdr_bill_dtl_subttl_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_bill_dtl_subttl_typ.getListConfig().setPutter(getHdr_bill_dtl_subttl_typ_ListPutter());
		Hdr_bill_dtl_brk_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_bill_dtl_brk_typ.getListConfig().setPutter(getHdr_bill_dtl_brk_typ_ListPutter());
		Hdr_bill_dtl_sort_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_bill_dtl_sort_typ.getListConfig().setPutter(getHdr_bill_dtl_sort_typ_ListPutter());
		Hdr_bill_can_slip_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_bill_can_slip_typ.getListConfig().setPutter(getHdr_bill_can_slip_typ_ListPutter());
		Hdr_rcst_prnt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_rcst_prnt_typ.getListConfig().setPutter(getHdr_rcst_prnt_typ_ListPutter());
		columnWrk4Dtl_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk4Dtl_cur_cd.getListConfig().setPutter(getWrk4Dtl_cur_cd_ListPutter());
		columnWrk4Dtl_sttl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk4Dtl_sttl_cd.getListConfig().setPutter(getWrk4Dtl_sttl_cd_ListPutter());
		columnWrk4Dtl_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk4Dtl_wg_cd.getListConfig().setPutter(getWrk4Dtl_wg_cd_ListPutter());
		columnWrk4Dtl_crryovr_mons_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk4Dtl_crryovr_mons_typ.getListConfig().setPutter(getWrk4Dtl_crryovr_mons_typ_ListPutter());
		columnWrk7Dtl_if_proc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk7Dtl_if_proc_typ.getListConfig().setPutter(getWrk7Dtl_if_proc_typ_ListPutter());
		columnWrk7Dtl_ext_sys_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk7Dtl_ext_sys_cd.getListConfig().setPutter(getWrk7Dtl_ext_sys_cd_ListPutter());
		columnWrk5Dtl_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk5Dtl_cur_cd.getListConfig().setPutter(getWrk5Dtl_cur_cd_ListPutter());
		columnWrk6Dtl_if_proc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk6Dtl_if_proc_typ.getListConfig().setPutter(getWrk6Dtl_if_proc_typ_ListPutter());
		columnWrk6Dtl_ar_sttl_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk6Dtl_ar_sttl_typ.getListConfig().setPutter(getWrk6Dtl_ar_sttl_typ_ListPutter());
		columnWrk6Dtl_bank_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk6Dtl_bank_cd.getListConfig().setPutter(getWrk6Dtl_bank_cd_ListPutter());
		columnWrk6Dtl_bank_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk6Dtl_bank_ac_cd.getListConfig().setPutter(getWrk6Dtl_bank_ac_cd_ListPutter());
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
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
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
	 * [Hdr_rcst_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_rcst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Hdr_ar_cred_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_ar_cred_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Hdr_bill_dpt_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_bill_dpt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BillDptTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_bcst_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_bcst_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Hdr_bill_cl_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_bill_cl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BillClTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_bill_tax_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_bill_tax_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RndTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_bill_cl_ba_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_bill_cl_ba_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BaTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_bill_cal_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_bill_cal_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalBase");
		return lp;
	}
	 
	/**
	 * [Hdr_rcv_ba_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_rcv_ba_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BaTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_ar_setoff_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_ar_setoff_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SetoffGrp");
		return lp;
	}
	 
	/**
	 * [Hdr_bcst_prnt_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_bcst_prnt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PrntTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_bill_prnt_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_bill_prnt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BillPrntTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_sls_dtl_outp_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_sls_dtl_outp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsDtlOutpTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_bill_dtl_subttl_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_bill_dtl_subttl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BillDtlSubttlTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_bill_dtl_brk_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_bill_dtl_brk_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BillDtlBrkTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_bill_dtl_sort_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_bill_dtl_sort_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BillDtlSortTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_bill_can_slip_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_bill_can_slip_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BillCanSlipTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_rcst_prnt_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_rcst_prnt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PrntTyp");
		return lp;
	}
	 
	/**
	 * [Wrk4Dtl_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk4Dtl_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Wrk4Dtl_sttl_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk4Dtl_sttl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ArSttlNotRcvSchd");
		return lp;
	}
	 
	/**
	 * [Wrk4Dtl_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk4Dtl_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ArWg");
		return lp;
	}
	 
	/**
	 * [Wrk4Dtl_crryovr_mons_typ_ListPutter]の作成
	 */
	protected MCListPutter createWrk4Dtl_crryovr_mons_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CrryovrMonsTyp");
		return lp;
	}
	 
	/**
	 * [Wrk7Dtl_if_proc_typ_ListPutter]の作成
	 */
	protected MCListPutter createWrk7Dtl_if_proc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IfProcTyp");
		return lp;
	}
	 
	/**
	 * [Wrk7Dtl_ext_sys_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk7Dtl_ext_sys_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExtSysEdi");
		return lp;
	}
	 
	/**
	 * [Wrk5Dtl_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk5Dtl_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Wrk6Dtl_if_proc_typ_ListPutter]の作成
	 */
	protected MCListPutter createWrk6Dtl_if_proc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IfProcTyp");
		return lp;
	}
	 
	/**
	 * [Wrk6Dtl_ar_sttl_typ_ListPutter]の作成
	 */
	protected MCListPutter createWrk6Dtl_ar_sttl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ArSttlTyp");
		return lp;
	}
	 
	/**
	 * [Wrk6Dtl_bank_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk6Dtl_bank_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bank");
		return lp;
	}
	 
	/**
	 * [Wrk6Dtl_bank_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk6Dtl_bank_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IntBankAc");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_bp_cd) return getCnd_bp_cd(row, info);
		if(combo == Hdr_rcst_cd) return getHdr_rcst_cd(row, info);
		if(combo == Hdr_ar_cred_cd) return getHdr_ar_cred_cd(row, info);
		if(combo == Hdr_bill_dpt_typ) return getHdr_bill_dpt_typ(row, info);
		if(combo == Hdr_bcst_dpt_cd) return getHdr_bcst_dpt_cd(row, info);
		if(combo == Hdr_bill_cl_typ) return getHdr_bill_cl_typ(row, info);
		if(combo == Hdr_bill_tax_rnd_typ) return getHdr_bill_tax_rnd_typ(row, info);
		if(combo == Hdr_bill_cl_ba_typ) return getHdr_bill_cl_ba_typ(row, info);
		if(combo == Hdr_bill_cal_cd) return getHdr_bill_cal_cd(row, info);
		if(combo == Hdr_rcv_ba_typ) return getHdr_rcv_ba_typ(row, info);
		if(combo == Hdr_ar_setoff_grp_cd) return getHdr_ar_setoff_grp_cd(row, info);
		if(combo == Hdr_bcst_prnt_typ) return getHdr_bcst_prnt_typ(row, info);
		if(combo == Hdr_bill_prnt_typ) return getHdr_bill_prnt_typ(row, info);
		if(combo == Hdr_sls_dtl_outp_typ) return getHdr_sls_dtl_outp_typ(row, info);
		if(combo == Hdr_bill_dtl_subttl_typ) return getHdr_bill_dtl_subttl_typ(row, info);
		if(combo == Hdr_bill_dtl_brk_typ) return getHdr_bill_dtl_brk_typ(row, info);
		if(combo == Hdr_bill_dtl_sort_typ) return getHdr_bill_dtl_sort_typ(row, info);
		if(combo == Hdr_bill_can_slip_typ) return getHdr_bill_can_slip_typ(row, info);
		if(combo == Hdr_rcst_prnt_typ) return getHdr_rcst_prnt_typ(row, info);
		if(combo == columnWrk4Dtl_cur_cd) return getWrk4Dtl_cur_cd(row, info);
		if(combo == columnWrk4Dtl_sttl_cd) return getWrk4Dtl_sttl_cd(row, info);
		if(combo == columnWrk4Dtl_wg_cd) return getWrk4Dtl_wg_cd(row, info);
		if(combo == columnWrk4Dtl_crryovr_mons_typ) return getWrk4Dtl_crryovr_mons_typ(row, info);
		if(combo == columnWrk7Dtl_if_proc_typ) return getWrk7Dtl_if_proc_typ(row, info);
		if(combo == columnWrk7Dtl_ext_sys_cd) return getWrk7Dtl_ext_sys_cd(row, info);
		if(combo == columnWrk5Dtl_cur_cd) return getWrk5Dtl_cur_cd(row, info);
		if(combo == columnWrk6Dtl_if_proc_typ) return getWrk6Dtl_if_proc_typ(row, info);
		if(combo == columnWrk6Dtl_ar_sttl_typ) return getWrk6Dtl_ar_sttl_typ(row, info);
		if(combo == columnWrk6Dtl_bank_cd) return getWrk6Dtl_bank_cd(row, info);
		if(combo == columnWrk6Dtl_bank_ac_cd) return getWrk6Dtl_bank_ac_cd(row, info);
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
		else if (ap == Wrk4DtlBtn_select_all) doWrk4DtlBtn_select_all(info);
		else if (ap == Wrk4DtlBtn_deselect_all) doWrk4DtlBtn_deselect_all(info);
		else if (ap == Wrk4DtlBtn_radd) doWrk4DtlBtn_radd(info);
		else if (ap == Wrk4DtlBtn_rdel) doWrk4DtlBtn_rdel(info);
		else if (ap == Wrk4DtlBtn_rcopy) doWrk4DtlBtn_rcopy(info);
		else if (ap == Wrk7Hdr_set_dt) doWrk7Hdr_set_dt(info);
		else if (ap == Wrk7DtlBtn_select_all) doWrk7DtlBtn_select_all(info);
		else if (ap == Wrk7DtlBtn_deselect_all) doWrk7DtlBtn_deselect_all(info);
		else if (ap == Wrk7DtlBtn_radd) doWrk7DtlBtn_radd(info);
		else if (ap == Wrk7DtlBtn_rdel) doWrk7DtlBtn_rdel(info);
		else if (ap == Wrk7DtlBtn_rcopy) doWrk7DtlBtn_rcopy(info);
		else if (ap == Wrk5DtlBtn_select_all) doWrk5DtlBtn_select_all(info);
		else if (ap == Wrk5DtlBtn_deselect_all) doWrk5DtlBtn_deselect_all(info);
		else if (ap == Wrk5DtlBtn_radd) doWrk5DtlBtn_radd(info);
		else if (ap == Wrk5DtlBtn_rdel) doWrk5DtlBtn_rdel(info);
		else if (ap == Wrk5DtlBtn_rcopy) doWrk5DtlBtn_rcopy(info);
		else if (ap == Wrk6Hdr_set_dt) doWrk6Hdr_set_dt(info);
		else if (ap == Wrk6DtlBtn_select_all) doWrk6DtlBtn_select_all(info);
		else if (ap == Wrk6DtlBtn_deselect_all) doWrk6DtlBtn_deselect_all(info);
		else if (ap == Wrk6DtlBtn_radd) doWrk6DtlBtn_radd(info);
		else if (ap == Wrk6DtlBtn_rdel) doWrk6DtlBtn_rdel(info);
		else if (ap == Wrk6DtlBtn_rcopy) doWrk6DtlBtn_rcopy(info);
		else if (ap == Btn_open_MABCP0510) doBtn_open_MABCP0510(info);
		else if (ap == Btn_upd) doBtn_upd(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Wrk4DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk4DtlBtn_select_all(MCEventInfo info);

	/**
	 * [Wrk4DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk4DtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [Wrk4DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk4DtlBtn_radd(MCEventInfo info);

	/**
	 * [Wrk4DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk4DtlBtn_rdel(MCEventInfo info);

	/**
	 * [Wrk4DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk4DtlBtn_rcopy(MCEventInfo info);

	/**
	 * [Wrk7Hdr]パネルの[set_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk7Hdr_set_dt(MCEventInfo info);

	/**
	 * [Wrk7DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk7DtlBtn_select_all(MCEventInfo info);

	/**
	 * [Wrk7DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk7DtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [Wrk7DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk7DtlBtn_radd(MCEventInfo info);

	/**
	 * [Wrk7DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk7DtlBtn_rdel(MCEventInfo info);

	/**
	 * [Wrk7DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk7DtlBtn_rcopy(MCEventInfo info);

	/**
	 * [Wrk5DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk5DtlBtn_select_all(MCEventInfo info);

	/**
	 * [Wrk5DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk5DtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [Wrk5DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk5DtlBtn_radd(MCEventInfo info);

	/**
	 * [Wrk5DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk5DtlBtn_rdel(MCEventInfo info);

	/**
	 * [Wrk5DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk5DtlBtn_rcopy(MCEventInfo info);

	/**
	 * [Wrk6Hdr]パネルの[set_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk6Hdr_set_dt(MCEventInfo info);

	/**
	 * [Wrk6DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk6DtlBtn_select_all(MCEventInfo info);

	/**
	 * [Wrk6DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk6DtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [Wrk6DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk6DtlBtn_radd(MCEventInfo info);

	/**
	 * [Wrk6DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk6DtlBtn_rdel(MCEventInfo info);

	/**
	 * [Wrk6DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk6DtlBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABCP0510]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABCP0510(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

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
		if (vc == DtlTabTab) return doDtlTab_VC(info);
		if (vc == Wrk4DtlTable) return doWrk4Dtl_VC(info);
		if (vc == Wrk7DtlTable) return doWrk7Dtl_VC(info);
		if (vc == Wrk5DtlTable) return doWrk5Dtl_VC(info);
		if (vc == Wrk6DtlTable) return doWrk6Dtl_VC(info);
		if (vc == HdrAllTable) return doHdrAll_VC(info);
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_bp_cd) return doCnd_bp_cd_VC(info);
		if (vc == Cnd_bp_nm) return doCnd_bp_nm_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == Hdr_bp_cd) return doHdr_bp_cd_VC(info);
		if (vc == Hdr_bp_nm) return doHdr_bp_nm_VC(info);
		if (vc == Hdr_bcst_flg) return doHdr_bcst_flg_VC(info);
		if (vc == Hdr_rcst_flg) return doHdr_rcst_flg_VC(info);
		if (vc == Hdr_rcst_cd) return doHdr_rcst_cd_VC(info);
		if (vc == Hdr_rcst_nm) return doHdr_rcst_nm_VC(info);
		if (vc == Hdr_ar_cred_cd) return doHdr_ar_cred_cd_VC(info);
		if (vc == Hdr_ar_cred_nm) return doHdr_ar_cred_nm_VC(info);
		if (vc == Hdr_bill_dpt_typ) return doHdr_bill_dpt_typ_VC(info);
		if (vc == Hdr_bill_dpt_typ_nm) return doHdr_bill_dpt_typ_nm_VC(info);
		if (vc == Hdr_bcst_dpt_cd) return doHdr_bcst_dpt_cd_VC(info);
		if (vc == Hdr_bcst_dpt_nm) return doHdr_bcst_dpt_nm_VC(info);
		if (vc == Hdr_check_bcst_dpt_cd) return doHdr_check_bcst_dpt_cd_VC(info);
		if (vc == Hdr_bill_cl_typ) return doHdr_bill_cl_typ_VC(info);
		if (vc == Hdr_bill_cl_typ_nm) return doHdr_bill_cl_typ_nm_VC(info);
		if (vc == Hdr_bill_cl_day1) return doHdr_bill_cl_day1_VC(info);
		if (vc == Hdr_bill_cl_day2) return doHdr_bill_cl_day2_VC(info);
		if (vc == Hdr_bill_cl_day3) return doHdr_bill_cl_day3_VC(info);
		if (vc == Hdr_bill_cl_day4) return doHdr_bill_cl_day4_VC(info);
		if (vc == Hdr_bill_cl_day5) return doHdr_bill_cl_day5_VC(info);
		if (vc == Hdr_tax_on_bill_flg) return doHdr_tax_on_bill_flg_VC(info);
		if (vc == Hdr_bill_tax_rnd_typ) return doHdr_bill_tax_rnd_typ_VC(info);
		if (vc == Hdr_bill_tax_rnd_typ_nm) return doHdr_bill_tax_rnd_typ_nm_VC(info);
		if (vc == Hdr_bill_cl_delay_days) return doHdr_bill_cl_delay_days_VC(info);
		if (vc == Hdr_bill_cl_ba_typ) return doHdr_bill_cl_ba_typ_VC(info);
		if (vc == Hdr_bill_cl_ba_typ_nm) return doHdr_bill_cl_ba_typ_nm_VC(info);
		if (vc == Hdr_bill_cal_cd) return doHdr_bill_cal_cd_VC(info);
		if (vc == Hdr_bill_cal_nm) return doHdr_bill_cal_nm_VC(info);
		if (vc == Hdr_rcv_ba_typ) return doHdr_rcv_ba_typ_VC(info);
		if (vc == Hdr_rcv_ba_typ_nm) return doHdr_rcv_ba_typ_nm_VC(info);
		if (vc == Hdr_auto_line_appl_flg) return doHdr_auto_line_appl_flg_VC(info);
		if (vc == Hdr_sls_interim_cl_flg) return doHdr_sls_interim_cl_flg_VC(info);
		if (vc == Hdr_ar_setoff_grp_cd) return doHdr_ar_setoff_grp_cd_VC(info);
		if (vc == Hdr_ar_setoff_grp_nm) return doHdr_ar_setoff_grp_nm_VC(info);
		if (vc == Hdr_bcst_prnt_typ) return doHdr_bcst_prnt_typ_VC(info);
		if (vc == Hdr_bcst_prnt_typ_nm) return doHdr_bcst_prnt_typ_nm_VC(info);
		if (vc == Hdr_bill_zip_cd) return doHdr_bill_zip_cd_VC(info);
		if (vc == Hdr_bill_addr1) return doHdr_bill_addr1_VC(info);
		if (vc == Hdr_bill_addr2) return doHdr_bill_addr2_VC(info);
		if (vc == Hdr_bill_addr3) return doHdr_bill_addr3_VC(info);
		if (vc == Hdr_bill_addr4) return doHdr_bill_addr4_VC(info);
		if (vc == Hdr_bill_tel) return doHdr_bill_tel_VC(info);
		if (vc == Hdr_bill_bcst_nm) return doHdr_bill_bcst_nm_VC(info);
		if (vc == Hdr_bill_bcst_dpt) return doHdr_bill_bcst_dpt_VC(info);
		if (vc == Hdr_bill_bcst_psn) return doHdr_bill_bcst_psn_VC(info);
		if (vc == Hdr_bill_bcst_psn_title) return doHdr_bill_bcst_psn_title_VC(info);
		if (vc == Hdr_bill_prnt_typ) return doHdr_bill_prnt_typ_VC(info);
		if (vc == Hdr_bill_prnt_typ_nm) return doHdr_bill_prnt_typ_nm_VC(info);
		if (vc == Hdr_sls_dtl_outp_typ) return doHdr_sls_dtl_outp_typ_VC(info);
		if (vc == Hdr_sls_dtl_outp_typ_nm) return doHdr_sls_dtl_outp_typ_nm_VC(info);
		if (vc == Hdr_bill_dtl_outp_flg) return doHdr_bill_dtl_outp_flg_VC(info);
		if (vc == Hdr_bfw_bal_disp_flg) return doHdr_bfw_bal_disp_flg_VC(info);
		if (vc == Hdr_bill_dtl_adv_flg) return doHdr_bill_dtl_adv_flg_VC(info);
		if (vc == Hdr_bill_dtl_rcv_flg) return doHdr_bill_dtl_rcv_flg_VC(info);
		if (vc == Hdr_bill_dtl_subttl_typ) return doHdr_bill_dtl_subttl_typ_VC(info);
		if (vc == Hdr_bill_dtl_subttl_typ_nm) return doHdr_bill_dtl_subttl_typ_nm_VC(info);
		if (vc == Hdr_bill_dtl_brk_typ) return doHdr_bill_dtl_brk_typ_VC(info);
		if (vc == Hdr_bill_dtl_brk_typ_nm) return doHdr_bill_dtl_brk_typ_nm_VC(info);
		if (vc == Hdr_bill_dtl_sort_typ) return doHdr_bill_dtl_sort_typ_VC(info);
		if (vc == Hdr_bill_dtl_sort_typ_nm) return doHdr_bill_dtl_sort_typ_nm_VC(info);
		if (vc == Hdr_bill_can_slip_typ) return doHdr_bill_can_slip_typ_VC(info);
		if (vc == Hdr_bill_can_slip_typ_nm) return doHdr_bill_can_slip_typ_nm_VC(info);
		if (vc == Hdr_rcv_auto_appl_tgt_flg) return doHdr_rcv_auto_appl_tgt_flg_VC(info);
		if (vc == Hdr_rcv_amt_match_flg) return doHdr_rcv_amt_match_flg_VC(info);
		if (vc == Hdr_ar_sttl_typ_match_flg) return doHdr_ar_sttl_typ_match_flg_VC(info);
		if (vc == Hdr_calc_com_paid_flg) return doHdr_calc_com_paid_flg_VC(info);
		if (vc == Hdr_auto_appl_delay_days) return doHdr_auto_appl_delay_days_VC(info);
		if (vc == Hdr_xfr_psn) return doHdr_xfr_psn_VC(info);
		if (vc == Hdr_rcst_prnt_typ) return doHdr_rcst_prnt_typ_VC(info);
		if (vc == Hdr_rcst_prnt_typ_nm) return doHdr_rcst_prnt_typ_nm_VC(info);
		if (vc == Wrk4Hdr_bill_cl_day1) return doWrk4Hdr_bill_cl_day1_VC(info);
		if (vc == Wrk4Hdr_bill_cl_day2) return doWrk4Hdr_bill_cl_day2_VC(info);
		if (vc == Wrk4Hdr_bill_cl_day3) return doWrk4Hdr_bill_cl_day3_VC(info);
		if (vc == Wrk4Hdr_bill_cl_day4) return doWrk4Hdr_bill_cl_day4_VC(info);
		if (vc == Wrk4Hdr_bill_cl_day5) return doWrk4Hdr_bill_cl_day5_VC(info);
		if (vc == columnWrk4Dtl_check) return doWrk4Dtl_check_VC(info);
		if (vc == columnWrk4Dtl_del_flg) return doWrk4Dtl_del_flg_VC(info);
		if (vc == columnWrk4Dtl_bcst_cd) return doWrk4Dtl_bcst_cd_VC(info);
		if (vc == columnWrk4Dtl_bill_cl_day1) return doWrk4Dtl_bill_cl_day1_VC(info);
		if (vc == columnWrk4Dtl_bill_cl_day2) return doWrk4Dtl_bill_cl_day2_VC(info);
		if (vc == columnWrk4Dtl_bill_cl_day3) return doWrk4Dtl_bill_cl_day3_VC(info);
		if (vc == columnWrk4Dtl_bill_cl_day4) return doWrk4Dtl_bill_cl_day4_VC(info);
		if (vc == columnWrk4Dtl_bill_cl_day5) return doWrk4Dtl_bill_cl_day5_VC(info);
		if (vc == columnWrk4Dtl_cur_cd) return doWrk4Dtl_cur_cd_VC(info);
		if (vc == columnWrk4Dtl_cur_nm) return doWrk4Dtl_cur_nm_VC(info);
		if (vc == columnWrk4Dtl_amt_dec_place) return doWrk4Dtl_amt_dec_place_VC(info);
		if (vc == columnWrk4Dtl_sttl_cd) return doWrk4Dtl_sttl_cd_VC(info);
		if (vc == columnWrk4Dtl_sttl_nm) return doWrk4Dtl_sttl_nm_VC(info);
		if (vc == columnWrk4Dtl_wg_cd) return doWrk4Dtl_wg_cd_VC(info);
		if (vc == columnWrk4Dtl_wg_nm) return doWrk4Dtl_wg_nm_VC(info);
		if (vc == columnWrk4Dtl_rate) return doWrk4Dtl_rate_VC(info);
		if (vc == columnWrk4Dtl_crryovr_mons_typ) return doWrk4Dtl_crryovr_mons_typ_VC(info);
		if (vc == columnWrk4Dtl_crryovr_mons_typ_nm) return doWrk4Dtl_crryovr_mons_typ_nm_VC(info);
		if (vc == columnWrk4Dtl_rcv_crryovr_mons1) return doWrk4Dtl_rcv_crryovr_mons1_VC(info);
		if (vc == columnWrk4Dtl_rcv_day1) return doWrk4Dtl_rcv_day1_VC(info);
		if (vc == columnWrk4Dtl_rcv_crryovr_mons2) return doWrk4Dtl_rcv_crryovr_mons2_VC(info);
		if (vc == columnWrk4Dtl_rcv_day2) return doWrk4Dtl_rcv_day2_VC(info);
		if (vc == columnWrk4Dtl_rcv_crryovr_mons3) return doWrk4Dtl_rcv_crryovr_mons3_VC(info);
		if (vc == columnWrk4Dtl_rcv_day3) return doWrk4Dtl_rcv_day3_VC(info);
		if (vc == columnWrk4Dtl_rcv_crryovr_mons4) return doWrk4Dtl_rcv_crryovr_mons4_VC(info);
		if (vc == columnWrk4Dtl_rcv_day4) return doWrk4Dtl_rcv_day4_VC(info);
		if (vc == columnWrk4Dtl_rcv_crryovr_mons5) return doWrk4Dtl_rcv_crryovr_mons5_VC(info);
		if (vc == columnWrk4Dtl_rcv_day5) return doWrk4Dtl_rcv_day5_VC(info);
		if (vc == columnWrk4Dtl_memo1) return doWrk4Dtl_memo1_VC(info);
		if (vc == columnWrk4Dtl_memo2) return doWrk4Dtl_memo2_VC(info);
		if (vc == columnWrk4Dtl_memo3) return doWrk4Dtl_memo3_VC(info);
		if (vc == columnWrk4Dtl_ins_usr_id) return doWrk4Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk4Dtl_ins_usr_nm) return doWrk4Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk4Dtl_ins_ts) return doWrk4Dtl_ins_ts_VC(info);
		if (vc == columnWrk4Dtl_ins_func_id) return doWrk4Dtl_ins_func_id_VC(info);
		if (vc == columnWrk4Dtl_ins_func_nm) return doWrk4Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk4Dtl_upd_cntr) return doWrk4Dtl_upd_cntr_VC(info);
		if (vc == columnWrk4Dtl_upd_usr_id) return doWrk4Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk4Dtl_upd_usr_nm) return doWrk4Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk4Dtl_upd_ts) return doWrk4Dtl_upd_ts_VC(info);
		if (vc == columnWrk4Dtl_upd_func_id) return doWrk4Dtl_upd_func_id_VC(info);
		if (vc == columnWrk4Dtl_upd_func_nm) return doWrk4Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk4Dtl_upd_srv_req_no) return doWrk4Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk4Dtl_del_usr_id) return doWrk4Dtl_del_usr_id_VC(info);
		if (vc == columnWrk4Dtl_del_usr_nm) return doWrk4Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk4Dtl_del_ts) return doWrk4Dtl_del_ts_VC(info);
		if (vc == Wrk7Hdr_st_dt) return doWrk7Hdr_st_dt_VC(info);
		if (vc == Wrk7Hdr_end_dt) return doWrk7Hdr_end_dt_VC(info);
		if (vc == columnWrk7Dtl_check) return doWrk7Dtl_check_VC(info);
		if (vc == columnWrk7Dtl_del_flg) return doWrk7Dtl_del_flg_VC(info);
		if (vc == columnWrk7Dtl_bp_cd) return doWrk7Dtl_bp_cd_VC(info);
		if (vc == columnWrk7Dtl_if_proc_typ) return doWrk7Dtl_if_proc_typ_VC(info);
		if (vc == columnWrk7Dtl_if_proc_typ_nm) return doWrk7Dtl_if_proc_typ_nm_VC(info);
		if (vc == columnWrk7Dtl_not_onr_prov_flg) return doWrk7Dtl_not_onr_prov_flg_VC(info);
		if (vc == columnWrk7Dtl_ext_sys_cd) return doWrk7Dtl_ext_sys_cd_VC(info);
		if (vc == columnWrk7Dtl_ext_sys_nm) return doWrk7Dtl_ext_sys_nm_VC(info);
		if (vc == columnWrk7Dtl_memo1) return doWrk7Dtl_memo1_VC(info);
		if (vc == columnWrk7Dtl_memo2) return doWrk7Dtl_memo2_VC(info);
		if (vc == columnWrk7Dtl_memo3) return doWrk7Dtl_memo3_VC(info);
		if (vc == columnWrk7Dtl_ins_usr_id) return doWrk7Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk7Dtl_ins_usr_nm) return doWrk7Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk7Dtl_ins_ts) return doWrk7Dtl_ins_ts_VC(info);
		if (vc == columnWrk7Dtl_ins_func_id) return doWrk7Dtl_ins_func_id_VC(info);
		if (vc == columnWrk7Dtl_ins_func_nm) return doWrk7Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk7Dtl_upd_cntr) return doWrk7Dtl_upd_cntr_VC(info);
		if (vc == columnWrk7Dtl_upd_usr_id) return doWrk7Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk7Dtl_upd_usr_nm) return doWrk7Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk7Dtl_upd_ts) return doWrk7Dtl_upd_ts_VC(info);
		if (vc == columnWrk7Dtl_upd_func_id) return doWrk7Dtl_upd_func_id_VC(info);
		if (vc == columnWrk7Dtl_upd_func_nm) return doWrk7Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk7Dtl_upd_srv_req_no) return doWrk7Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk7Dtl_del_usr_id) return doWrk7Dtl_del_usr_id_VC(info);
		if (vc == columnWrk7Dtl_del_usr_nm) return doWrk7Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk7Dtl_del_ts) return doWrk7Dtl_del_ts_VC(info);
		if (vc == columnWrk5Dtl_check) return doWrk5Dtl_check_VC(info);
		if (vc == columnWrk5Dtl_del_flg) return doWrk5Dtl_del_flg_VC(info);
		if (vc == columnWrk5Dtl_rcst_cd) return doWrk5Dtl_rcst_cd_VC(info);
		if (vc == columnWrk5Dtl_cur_cd) return doWrk5Dtl_cur_cd_VC(info);
		if (vc == columnWrk5Dtl_cur_nm) return doWrk5Dtl_cur_nm_VC(info);
		if (vc == columnWrk5Dtl_amt_dec_place) return doWrk5Dtl_amt_dec_place_VC(info);
		if (vc == columnWrk5Dtl_memo1) return doWrk5Dtl_memo1_VC(info);
		if (vc == columnWrk5Dtl_memo2) return doWrk5Dtl_memo2_VC(info);
		if (vc == columnWrk5Dtl_memo3) return doWrk5Dtl_memo3_VC(info);
		if (vc == columnWrk5Dtl_ins_usr_id) return doWrk5Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk5Dtl_ins_usr_nm) return doWrk5Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk5Dtl_ins_ts) return doWrk5Dtl_ins_ts_VC(info);
		if (vc == columnWrk5Dtl_ins_func_id) return doWrk5Dtl_ins_func_id_VC(info);
		if (vc == columnWrk5Dtl_ins_func_nm) return doWrk5Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk5Dtl_upd_cntr) return doWrk5Dtl_upd_cntr_VC(info);
		if (vc == columnWrk5Dtl_upd_usr_id) return doWrk5Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk5Dtl_upd_usr_nm) return doWrk5Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk5Dtl_upd_ts) return doWrk5Dtl_upd_ts_VC(info);
		if (vc == columnWrk5Dtl_upd_func_id) return doWrk5Dtl_upd_func_id_VC(info);
		if (vc == columnWrk5Dtl_upd_func_nm) return doWrk5Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk5Dtl_upd_srv_req_no) return doWrk5Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk5Dtl_del_usr_id) return doWrk5Dtl_del_usr_id_VC(info);
		if (vc == columnWrk5Dtl_del_usr_nm) return doWrk5Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk5Dtl_del_ts) return doWrk5Dtl_del_ts_VC(info);
		if (vc == Wrk6Hdr_st_dt) return doWrk6Hdr_st_dt_VC(info);
		if (vc == Wrk6Hdr_end_dt) return doWrk6Hdr_end_dt_VC(info);
		if (vc == columnWrk6Dtl_check) return doWrk6Dtl_check_VC(info);
		if (vc == columnWrk6Dtl_del_flg) return doWrk6Dtl_del_flg_VC(info);
		if (vc == columnWrk6Dtl_bp_cd) return doWrk6Dtl_bp_cd_VC(info);
		if (vc == columnWrk6Dtl_bp_cd_null_flg) return doWrk6Dtl_bp_cd_null_flg_VC(info);
		if (vc == columnWrk6Dtl_if_proc_typ) return doWrk6Dtl_if_proc_typ_VC(info);
		if (vc == columnWrk6Dtl_if_proc_typ_nm) return doWrk6Dtl_if_proc_typ_nm_VC(info);
		if (vc == columnWrk6Dtl_ar_sttl_typ) return doWrk6Dtl_ar_sttl_typ_VC(info);
		if (vc == columnWrk6Dtl_ar_sttl_typ_nm) return doWrk6Dtl_ar_sttl_typ_nm_VC(info);
		if (vc == columnWrk6Dtl_bank_cd) return doWrk6Dtl_bank_cd_VC(info);
		if (vc == columnWrk6Dtl_bank_nm) return doWrk6Dtl_bank_nm_VC(info);
		if (vc == columnWrk6Dtl_bank_ac_cd) return doWrk6Dtl_bank_ac_cd_VC(info);
		if (vc == columnWrk6Dtl_bank_ac_nm) return doWrk6Dtl_bank_ac_nm_VC(info);
		if (vc == columnWrk6Dtl_memo1) return doWrk6Dtl_memo1_VC(info);
		if (vc == columnWrk6Dtl_memo2) return doWrk6Dtl_memo2_VC(info);
		if (vc == columnWrk6Dtl_memo3) return doWrk6Dtl_memo3_VC(info);
		if (vc == columnWrk6Dtl_ins_usr_id) return doWrk6Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk6Dtl_ins_usr_nm) return doWrk6Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk6Dtl_ins_ts) return doWrk6Dtl_ins_ts_VC(info);
		if (vc == columnWrk6Dtl_ins_func_id) return doWrk6Dtl_ins_func_id_VC(info);
		if (vc == columnWrk6Dtl_ins_func_nm) return doWrk6Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk6Dtl_upd_cntr) return doWrk6Dtl_upd_cntr_VC(info);
		if (vc == columnWrk6Dtl_upd_usr_id) return doWrk6Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk6Dtl_upd_usr_nm) return doWrk6Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk6Dtl_upd_ts) return doWrk6Dtl_upd_ts_VC(info);
		if (vc == columnWrk6Dtl_upd_func_id) return doWrk6Dtl_upd_func_id_VC(info);
		if (vc == columnWrk6Dtl_upd_func_nm) return doWrk6Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk6Dtl_upd_srv_req_no) return doWrk6Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk6Dtl_del_usr_id) return doWrk6Dtl_del_usr_id_VC(info);
		if (vc == columnWrk6Dtl_del_usr_nm) return doWrk6Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk6Dtl_del_ts) return doWrk6Dtl_del_ts_VC(info);
		if (vc == columnHdrAll_check) return doHdrAll_check_VC(info);
		if (vc == columnHdrAll_bp_cd) return doHdrAll_bp_cd_VC(info);
		if (vc == columnHdrAll_bp_nm) return doHdrAll_bp_nm_VC(info);
		if (vc == columnHdrAll_bcst_flg) return doHdrAll_bcst_flg_VC(info);
		if (vc == columnHdrAll_rcst_flg) return doHdrAll_rcst_flg_VC(info);
		if (vc == columnHdrAll_rcst_cd) return doHdrAll_rcst_cd_VC(info);
		if (vc == columnHdrAll_rcst_nm) return doHdrAll_rcst_nm_VC(info);
		if (vc == columnHdrAll_ar_cred_cd) return doHdrAll_ar_cred_cd_VC(info);
		if (vc == columnHdrAll_ar_cred_nm) return doHdrAll_ar_cred_nm_VC(info);
		if (vc == columnHdrAll_bill_dpt_typ) return doHdrAll_bill_dpt_typ_VC(info);
		if (vc == columnHdrAll_bill_dpt_typ_nm) return doHdrAll_bill_dpt_typ_nm_VC(info);
		if (vc == columnHdrAll_bcst_dpt_cd) return doHdrAll_bcst_dpt_cd_VC(info);
		if (vc == columnHdrAll_bcst_dpt_nm) return doHdrAll_bcst_dpt_nm_VC(info);
		if (vc == columnHdrAll_check_bcst_dpt_cd) return doHdrAll_check_bcst_dpt_cd_VC(info);
		if (vc == columnHdrAll_bill_cl_typ) return doHdrAll_bill_cl_typ_VC(info);
		if (vc == columnHdrAll_bill_cl_typ_nm) return doHdrAll_bill_cl_typ_nm_VC(info);
		if (vc == columnHdrAll_bill_cl_day1) return doHdrAll_bill_cl_day1_VC(info);
		if (vc == columnHdrAll_bill_cl_day2) return doHdrAll_bill_cl_day2_VC(info);
		if (vc == columnHdrAll_bill_cl_day3) return doHdrAll_bill_cl_day3_VC(info);
		if (vc == columnHdrAll_bill_cl_day4) return doHdrAll_bill_cl_day4_VC(info);
		if (vc == columnHdrAll_bill_cl_day5) return doHdrAll_bill_cl_day5_VC(info);
		if (vc == columnHdrAll_tax_on_bill_flg) return doHdrAll_tax_on_bill_flg_VC(info);
		if (vc == columnHdrAll_bill_tax_rnd_typ) return doHdrAll_bill_tax_rnd_typ_VC(info);
		if (vc == columnHdrAll_bill_tax_rnd_typ_nm) return doHdrAll_bill_tax_rnd_typ_nm_VC(info);
		if (vc == columnHdrAll_bill_cl_delay_days) return doHdrAll_bill_cl_delay_days_VC(info);
		if (vc == columnHdrAll_bill_cl_ba_typ) return doHdrAll_bill_cl_ba_typ_VC(info);
		if (vc == columnHdrAll_bill_cl_ba_typ_nm) return doHdrAll_bill_cl_ba_typ_nm_VC(info);
		if (vc == columnHdrAll_bill_cal_cd) return doHdrAll_bill_cal_cd_VC(info);
		if (vc == columnHdrAll_bill_cal_nm) return doHdrAll_bill_cal_nm_VC(info);
		if (vc == columnHdrAll_rcv_ba_typ) return doHdrAll_rcv_ba_typ_VC(info);
		if (vc == columnHdrAll_rcv_ba_typ_nm) return doHdrAll_rcv_ba_typ_nm_VC(info);
		if (vc == columnHdrAll_auto_line_appl_flg) return doHdrAll_auto_line_appl_flg_VC(info);
		if (vc == columnHdrAll_sls_interim_cl_flg) return doHdrAll_sls_interim_cl_flg_VC(info);
		if (vc == columnHdrAll_ar_setoff_grp_cd) return doHdrAll_ar_setoff_grp_cd_VC(info);
		if (vc == columnHdrAll_ar_setoff_grp_nm) return doHdrAll_ar_setoff_grp_nm_VC(info);
		if (vc == columnHdrAll_bcst_prnt_typ) return doHdrAll_bcst_prnt_typ_VC(info);
		if (vc == columnHdrAll_bcst_prnt_typ_nm) return doHdrAll_bcst_prnt_typ_nm_VC(info);
		if (vc == columnHdrAll_bill_zip_cd) return doHdrAll_bill_zip_cd_VC(info);
		if (vc == columnHdrAll_bill_addr1) return doHdrAll_bill_addr1_VC(info);
		if (vc == columnHdrAll_bill_addr2) return doHdrAll_bill_addr2_VC(info);
		if (vc == columnHdrAll_bill_addr3) return doHdrAll_bill_addr3_VC(info);
		if (vc == columnHdrAll_bill_addr4) return doHdrAll_bill_addr4_VC(info);
		if (vc == columnHdrAll_bill_tel) return doHdrAll_bill_tel_VC(info);
		if (vc == columnHdrAll_bill_bcst_nm) return doHdrAll_bill_bcst_nm_VC(info);
		if (vc == columnHdrAll_bill_bcst_dpt) return doHdrAll_bill_bcst_dpt_VC(info);
		if (vc == columnHdrAll_bill_bcst_psn) return doHdrAll_bill_bcst_psn_VC(info);
		if (vc == columnHdrAll_bill_bcst_psn_title) return doHdrAll_bill_bcst_psn_title_VC(info);
		if (vc == columnHdrAll_bill_prnt_typ) return doHdrAll_bill_prnt_typ_VC(info);
		if (vc == columnHdrAll_bill_prnt_typ_nm) return doHdrAll_bill_prnt_typ_nm_VC(info);
		if (vc == columnHdrAll_sls_dtl_outp_typ) return doHdrAll_sls_dtl_outp_typ_VC(info);
		if (vc == columnHdrAll_sls_dtl_outp_typ_nm) return doHdrAll_sls_dtl_outp_typ_nm_VC(info);
		if (vc == columnHdrAll_bill_dtl_outp_flg) return doHdrAll_bill_dtl_outp_flg_VC(info);
		if (vc == columnHdrAll_bfw_bal_disp_flg) return doHdrAll_bfw_bal_disp_flg_VC(info);
		if (vc == columnHdrAll_bill_dtl_adv_flg) return doHdrAll_bill_dtl_adv_flg_VC(info);
		if (vc == columnHdrAll_bill_dtl_rcv_flg) return doHdrAll_bill_dtl_rcv_flg_VC(info);
		if (vc == columnHdrAll_bill_dtl_subttl_typ) return doHdrAll_bill_dtl_subttl_typ_VC(info);
		if (vc == columnHdrAll_bill_dtl_subttl_typ_nm) return doHdrAll_bill_dtl_subttl_typ_nm_VC(info);
		if (vc == columnHdrAll_bill_dtl_brk_typ) return doHdrAll_bill_dtl_brk_typ_VC(info);
		if (vc == columnHdrAll_bill_dtl_brk_typ_nm) return doHdrAll_bill_dtl_brk_typ_nm_VC(info);
		if (vc == columnHdrAll_bill_dtl_sort_typ) return doHdrAll_bill_dtl_sort_typ_VC(info);
		if (vc == columnHdrAll_bill_dtl_sort_typ_nm) return doHdrAll_bill_dtl_sort_typ_nm_VC(info);
		if (vc == columnHdrAll_bill_can_slip_typ) return doHdrAll_bill_can_slip_typ_VC(info);
		if (vc == columnHdrAll_bill_can_slip_typ_nm) return doHdrAll_bill_can_slip_typ_nm_VC(info);
		if (vc == columnHdrAll_rcv_auto_appl_tgt_flg) return doHdrAll_rcv_auto_appl_tgt_flg_VC(info);
		if (vc == columnHdrAll_rcv_amt_match_flg) return doHdrAll_rcv_amt_match_flg_VC(info);
		if (vc == columnHdrAll_ar_sttl_typ_match_flg) return doHdrAll_ar_sttl_typ_match_flg_VC(info);
		if (vc == columnHdrAll_calc_com_paid_flg) return doHdrAll_calc_com_paid_flg_VC(info);
		if (vc == columnHdrAll_auto_appl_delay_days) return doHdrAll_auto_appl_delay_days_VC(info);
		if (vc == columnHdrAll_xfr_psn) return doHdrAll_xfr_psn_VC(info);
		if (vc == columnHdrAll_ins_usr_id) return doHdrAll_ins_usr_id_VC(info);
		if (vc == columnHdrAll_ins_usr_nm) return doHdrAll_ins_usr_nm_VC(info);
		if (vc == columnHdrAll_ins_ts) return doHdrAll_ins_ts_VC(info);
		if (vc == columnHdrAll_ins_func_id) return doHdrAll_ins_func_id_VC(info);
		if (vc == columnHdrAll_ins_func_nm) return doHdrAll_ins_func_nm_VC(info);
		if (vc == columnHdrAll_upd_cntr) return doHdrAll_upd_cntr_VC(info);
		if (vc == columnHdrAll_upd_usr_id) return doHdrAll_upd_usr_id_VC(info);
		if (vc == columnHdrAll_upd_usr_nm) return doHdrAll_upd_usr_nm_VC(info);
		if (vc == columnHdrAll_upd_ts) return doHdrAll_upd_ts_VC(info);
		if (vc == columnHdrAll_upd_func_id) return doHdrAll_upd_func_id_VC(info);
		if (vc == columnHdrAll_upd_func_nm) return doHdrAll_upd_func_nm_VC(info);
		if (vc == columnHdrAll_upd_srv_req_no) return doHdrAll_upd_srv_req_no_VC(info);
		if (vc == columnHdrAll_del_usr_id) return doHdrAll_del_usr_id_VC(info);
		if (vc == columnHdrAll_del_usr_nm) return doHdrAll_del_usr_nm_VC(info);
		if (vc == columnHdrAll_del_ts) return doHdrAll_del_ts_VC(info);
		if (vc == columnHdrAll_rcst_prnt_typ) return doHdrAll_rcst_prnt_typ_VC(info);
		if (vc == columnHdrAll_rcst_prnt_typ_nm) return doHdrAll_rcst_prnt_typ_nm_VC(info);
		return true;
	}

	/**
	 * [DtlTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bcst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bcst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ar_cred_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ar_cred_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ar_cred_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ar_cred_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_dpt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_dpt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_dpt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_dpt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bcst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bcst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bcst_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bcst_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[check_bcst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_check_bcst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_cl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_cl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_cl_day1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_cl_day1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_cl_day2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_cl_day2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_cl_day3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_cl_day3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_cl_day4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_cl_day4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_cl_day5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_cl_day5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[tax_on_bill_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_tax_on_bill_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_tax_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_tax_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_cl_delay_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_cl_delay_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_cl_ba_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_cl_ba_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_cl_ba_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_cl_ba_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcv_ba_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcv_ba_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcv_ba_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcv_ba_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[auto_line_appl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_auto_line_appl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sls_interim_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sls_interim_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ar_setoff_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ar_setoff_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ar_setoff_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ar_setoff_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bcst_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bcst_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bcst_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bcst_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_bcst_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_bcst_dpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_bcst_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_bcst_psn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_bcst_psn_title]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_bcst_psn_title_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sls_dtl_outp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sls_dtl_outp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sls_dtl_outp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sls_dtl_outp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_dtl_outp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_dtl_outp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bfw_bal_disp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bfw_bal_disp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_dtl_adv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_dtl_adv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_dtl_rcv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_dtl_rcv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_dtl_subttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_dtl_subttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_dtl_subttl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_dtl_subttl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_dtl_brk_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_dtl_brk_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_dtl_brk_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_dtl_brk_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_dtl_sort_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_dtl_sort_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_dtl_sort_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_dtl_sort_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_can_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_can_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bill_can_slip_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bill_can_slip_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcv_auto_appl_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcv_auto_appl_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcv_amt_match_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcv_amt_match_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ar_sttl_typ_match_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ar_sttl_typ_match_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[calc_com_paid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_calc_com_paid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[auto_appl_delay_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_auto_appl_delay_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[xfr_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_xfr_psn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcst_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcst_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rcst_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rcst_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Hdr_bill_cl_day1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Hdr_bill_cl_day2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Hdr_bill_cl_day3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Hdr_bill_cl_day4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Hdr_bill_cl_day5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[bcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_bcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_bill_cl_day1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_bill_cl_day2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_bill_cl_day3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_bill_cl_day4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_bill_cl_day5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[crryovr_mons_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_crryovr_mons_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[crryovr_mons_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_crryovr_mons_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_rcv_crryovr_mons1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_rcv_day1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_rcv_crryovr_mons2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_rcv_day2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_rcv_crryovr_mons3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_rcv_day3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_rcv_crryovr_mons4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_rcv_day4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_rcv_crryovr_mons5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_rcv_day5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Hdr]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Hdr_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Hdr]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Hdr_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[if_proc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_if_proc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[if_proc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_if_proc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[not_onr_prov_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_not_onr_prov_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[rcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_rcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Hdr]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Hdr_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Hdr]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Hdr_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[bp_cd_null_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_bp_cd_null_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[if_proc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_if_proc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[if_proc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_if_proc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[ar_sttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_ar_sttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[ar_sttl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_ar_sttl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[bank_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_bank_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[bank_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_bank_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[bank_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_bank_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bcst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bcst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[rcst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_rcst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[rcst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_rcst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[rcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_rcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[ar_cred_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_ar_cred_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[ar_cred_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_ar_cred_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_dpt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_dpt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_dpt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_dpt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bcst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bcst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bcst_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bcst_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[check_bcst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_check_bcst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_cl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_cl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_cl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_cl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_cl_day1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_cl_day2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_cl_day3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_cl_day4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_cl_day5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[tax_on_bill_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_tax_on_bill_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_tax_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_tax_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_cl_delay_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_cl_delay_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_cl_ba_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_cl_ba_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_cl_ba_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_cl_ba_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_cal_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_cal_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_cal_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_cal_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[rcv_ba_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_rcv_ba_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[rcv_ba_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_rcv_ba_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[auto_line_appl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_auto_line_appl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[sls_interim_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_sls_interim_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[ar_setoff_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_ar_setoff_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[ar_setoff_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_ar_setoff_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bcst_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bcst_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bcst_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bcst_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_bcst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_bcst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_bcst_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_bcst_dpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_bcst_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_bcst_psn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_bcst_psn_title]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_bcst_psn_title_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[sls_dtl_outp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_sls_dtl_outp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[sls_dtl_outp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_sls_dtl_outp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_outp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_dtl_outp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bfw_bal_disp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bfw_bal_disp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_adv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_dtl_adv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_rcv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_dtl_rcv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_subttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_dtl_subttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_subttl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_dtl_subttl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_brk_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_dtl_brk_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_brk_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_dtl_brk_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_sort_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_dtl_sort_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_sort_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_dtl_sort_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_can_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_can_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bill_can_slip_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bill_can_slip_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[rcv_auto_appl_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_rcv_auto_appl_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[rcv_amt_match_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_rcv_amt_match_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[ar_sttl_typ_match_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_ar_sttl_typ_match_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[calc_com_paid_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_calc_com_paid_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[auto_appl_delay_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_auto_appl_delay_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[xfr_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_xfr_psn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[rcst_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_rcst_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[rcst_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_rcst_prnt_typ_nm_VC(MCEventInfo info){
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
		if (nc == DtlTabTab) doDtlTab_NC(info);
		else if (nc == Wrk4DtlTable) doWrk4Dtl_NC(info);
		else if (nc == Wrk7DtlTable) doWrk7Dtl_NC(info);
		else if (nc == Wrk5DtlTable) doWrk5Dtl_NC(info);
		else if (nc == Wrk6DtlTable) doWrk6Dtl_NC(info);
		else if (nc == HdrAllTable) doHdrAll_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_bp_cd) doCnd_bp_cd_NC(info);
		else if (nc == Cnd_bp_nm) doCnd_bp_nm_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == Hdr_bp_cd) doHdr_bp_cd_NC(info);
		else if (nc == Hdr_bp_nm) doHdr_bp_nm_NC(info);
		else if (nc == Hdr_bcst_flg) doHdr_bcst_flg_NC(info);
		else if (nc == Hdr_rcst_flg) doHdr_rcst_flg_NC(info);
		else if (nc == Hdr_rcst_cd) doHdr_rcst_cd_NC(info);
		else if (nc == Hdr_rcst_nm) doHdr_rcst_nm_NC(info);
		else if (nc == Hdr_ar_cred_cd) doHdr_ar_cred_cd_NC(info);
		else if (nc == Hdr_ar_cred_nm) doHdr_ar_cred_nm_NC(info);
		else if (nc == Hdr_bill_dpt_typ) doHdr_bill_dpt_typ_NC(info);
		else if (nc == Hdr_bill_dpt_typ_nm) doHdr_bill_dpt_typ_nm_NC(info);
		else if (nc == Hdr_bcst_dpt_cd) doHdr_bcst_dpt_cd_NC(info);
		else if (nc == Hdr_bcst_dpt_nm) doHdr_bcst_dpt_nm_NC(info);
		else if (nc == Hdr_check_bcst_dpt_cd) doHdr_check_bcst_dpt_cd_NC(info);
		else if (nc == Hdr_bill_cl_typ) doHdr_bill_cl_typ_NC(info);
		else if (nc == Hdr_bill_cl_typ_nm) doHdr_bill_cl_typ_nm_NC(info);
		else if (nc == Hdr_bill_cl_day1) doHdr_bill_cl_day1_NC(info);
		else if (nc == Hdr_bill_cl_day2) doHdr_bill_cl_day2_NC(info);
		else if (nc == Hdr_bill_cl_day3) doHdr_bill_cl_day3_NC(info);
		else if (nc == Hdr_bill_cl_day4) doHdr_bill_cl_day4_NC(info);
		else if (nc == Hdr_bill_cl_day5) doHdr_bill_cl_day5_NC(info);
		else if (nc == Hdr_tax_on_bill_flg) doHdr_tax_on_bill_flg_NC(info);
		else if (nc == Hdr_bill_tax_rnd_typ) doHdr_bill_tax_rnd_typ_NC(info);
		else if (nc == Hdr_bill_tax_rnd_typ_nm) doHdr_bill_tax_rnd_typ_nm_NC(info);
		else if (nc == Hdr_bill_cl_delay_days) doHdr_bill_cl_delay_days_NC(info);
		else if (nc == Hdr_bill_cl_ba_typ) doHdr_bill_cl_ba_typ_NC(info);
		else if (nc == Hdr_bill_cl_ba_typ_nm) doHdr_bill_cl_ba_typ_nm_NC(info);
		else if (nc == Hdr_bill_cal_cd) doHdr_bill_cal_cd_NC(info);
		else if (nc == Hdr_bill_cal_nm) doHdr_bill_cal_nm_NC(info);
		else if (nc == Hdr_rcv_ba_typ) doHdr_rcv_ba_typ_NC(info);
		else if (nc == Hdr_rcv_ba_typ_nm) doHdr_rcv_ba_typ_nm_NC(info);
		else if (nc == Hdr_auto_line_appl_flg) doHdr_auto_line_appl_flg_NC(info);
		else if (nc == Hdr_sls_interim_cl_flg) doHdr_sls_interim_cl_flg_NC(info);
		else if (nc == Hdr_ar_setoff_grp_cd) doHdr_ar_setoff_grp_cd_NC(info);
		else if (nc == Hdr_ar_setoff_grp_nm) doHdr_ar_setoff_grp_nm_NC(info);
		else if (nc == Hdr_bcst_prnt_typ) doHdr_bcst_prnt_typ_NC(info);
		else if (nc == Hdr_bcst_prnt_typ_nm) doHdr_bcst_prnt_typ_nm_NC(info);
		else if (nc == Hdr_bill_zip_cd) doHdr_bill_zip_cd_NC(info);
		else if (nc == Hdr_bill_addr1) doHdr_bill_addr1_NC(info);
		else if (nc == Hdr_bill_addr2) doHdr_bill_addr2_NC(info);
		else if (nc == Hdr_bill_addr3) doHdr_bill_addr3_NC(info);
		else if (nc == Hdr_bill_addr4) doHdr_bill_addr4_NC(info);
		else if (nc == Hdr_bill_tel) doHdr_bill_tel_NC(info);
		else if (nc == Hdr_bill_bcst_nm) doHdr_bill_bcst_nm_NC(info);
		else if (nc == Hdr_bill_bcst_dpt) doHdr_bill_bcst_dpt_NC(info);
		else if (nc == Hdr_bill_bcst_psn) doHdr_bill_bcst_psn_NC(info);
		else if (nc == Hdr_bill_bcst_psn_title) doHdr_bill_bcst_psn_title_NC(info);
		else if (nc == Hdr_bill_prnt_typ) doHdr_bill_prnt_typ_NC(info);
		else if (nc == Hdr_bill_prnt_typ_nm) doHdr_bill_prnt_typ_nm_NC(info);
		else if (nc == Hdr_sls_dtl_outp_typ) doHdr_sls_dtl_outp_typ_NC(info);
		else if (nc == Hdr_sls_dtl_outp_typ_nm) doHdr_sls_dtl_outp_typ_nm_NC(info);
		else if (nc == Hdr_bill_dtl_outp_flg) doHdr_bill_dtl_outp_flg_NC(info);
		else if (nc == Hdr_bfw_bal_disp_flg) doHdr_bfw_bal_disp_flg_NC(info);
		else if (nc == Hdr_bill_dtl_adv_flg) doHdr_bill_dtl_adv_flg_NC(info);
		else if (nc == Hdr_bill_dtl_rcv_flg) doHdr_bill_dtl_rcv_flg_NC(info);
		else if (nc == Hdr_bill_dtl_subttl_typ) doHdr_bill_dtl_subttl_typ_NC(info);
		else if (nc == Hdr_bill_dtl_subttl_typ_nm) doHdr_bill_dtl_subttl_typ_nm_NC(info);
		else if (nc == Hdr_bill_dtl_brk_typ) doHdr_bill_dtl_brk_typ_NC(info);
		else if (nc == Hdr_bill_dtl_brk_typ_nm) doHdr_bill_dtl_brk_typ_nm_NC(info);
		else if (nc == Hdr_bill_dtl_sort_typ) doHdr_bill_dtl_sort_typ_NC(info);
		else if (nc == Hdr_bill_dtl_sort_typ_nm) doHdr_bill_dtl_sort_typ_nm_NC(info);
		else if (nc == Hdr_bill_can_slip_typ) doHdr_bill_can_slip_typ_NC(info);
		else if (nc == Hdr_bill_can_slip_typ_nm) doHdr_bill_can_slip_typ_nm_NC(info);
		else if (nc == Hdr_rcv_auto_appl_tgt_flg) doHdr_rcv_auto_appl_tgt_flg_NC(info);
		else if (nc == Hdr_rcv_amt_match_flg) doHdr_rcv_amt_match_flg_NC(info);
		else if (nc == Hdr_ar_sttl_typ_match_flg) doHdr_ar_sttl_typ_match_flg_NC(info);
		else if (nc == Hdr_calc_com_paid_flg) doHdr_calc_com_paid_flg_NC(info);
		else if (nc == Hdr_auto_appl_delay_days) doHdr_auto_appl_delay_days_NC(info);
		else if (nc == Hdr_xfr_psn) doHdr_xfr_psn_NC(info);
		else if (nc == Hdr_rcst_prnt_typ) doHdr_rcst_prnt_typ_NC(info);
		else if (nc == Hdr_rcst_prnt_typ_nm) doHdr_rcst_prnt_typ_nm_NC(info);
		else if (nc == Wrk4Hdr_bill_cl_day1) doWrk4Hdr_bill_cl_day1_NC(info);
		else if (nc == Wrk4Hdr_bill_cl_day2) doWrk4Hdr_bill_cl_day2_NC(info);
		else if (nc == Wrk4Hdr_bill_cl_day3) doWrk4Hdr_bill_cl_day3_NC(info);
		else if (nc == Wrk4Hdr_bill_cl_day4) doWrk4Hdr_bill_cl_day4_NC(info);
		else if (nc == Wrk4Hdr_bill_cl_day5) doWrk4Hdr_bill_cl_day5_NC(info);
		else if (nc == columnWrk4Dtl_check) doWrk4Dtl_check_NC(info);
		else if (nc == columnWrk4Dtl_del_flg) doWrk4Dtl_del_flg_NC(info);
		else if (nc == columnWrk4Dtl_bcst_cd) doWrk4Dtl_bcst_cd_NC(info);
		else if (nc == columnWrk4Dtl_bill_cl_day1) doWrk4Dtl_bill_cl_day1_NC(info);
		else if (nc == columnWrk4Dtl_bill_cl_day2) doWrk4Dtl_bill_cl_day2_NC(info);
		else if (nc == columnWrk4Dtl_bill_cl_day3) doWrk4Dtl_bill_cl_day3_NC(info);
		else if (nc == columnWrk4Dtl_bill_cl_day4) doWrk4Dtl_bill_cl_day4_NC(info);
		else if (nc == columnWrk4Dtl_bill_cl_day5) doWrk4Dtl_bill_cl_day5_NC(info);
		else if (nc == columnWrk4Dtl_cur_cd) doWrk4Dtl_cur_cd_NC(info);
		else if (nc == columnWrk4Dtl_cur_nm) doWrk4Dtl_cur_nm_NC(info);
		else if (nc == columnWrk4Dtl_amt_dec_place) doWrk4Dtl_amt_dec_place_NC(info);
		else if (nc == columnWrk4Dtl_sttl_cd) doWrk4Dtl_sttl_cd_NC(info);
		else if (nc == columnWrk4Dtl_sttl_nm) doWrk4Dtl_sttl_nm_NC(info);
		else if (nc == columnWrk4Dtl_wg_cd) doWrk4Dtl_wg_cd_NC(info);
		else if (nc == columnWrk4Dtl_wg_nm) doWrk4Dtl_wg_nm_NC(info);
		else if (nc == columnWrk4Dtl_rate) doWrk4Dtl_rate_NC(info);
		else if (nc == columnWrk4Dtl_crryovr_mons_typ) doWrk4Dtl_crryovr_mons_typ_NC(info);
		else if (nc == columnWrk4Dtl_crryovr_mons_typ_nm) doWrk4Dtl_crryovr_mons_typ_nm_NC(info);
		else if (nc == columnWrk4Dtl_rcv_crryovr_mons1) doWrk4Dtl_rcv_crryovr_mons1_NC(info);
		else if (nc == columnWrk4Dtl_rcv_day1) doWrk4Dtl_rcv_day1_NC(info);
		else if (nc == columnWrk4Dtl_rcv_crryovr_mons2) doWrk4Dtl_rcv_crryovr_mons2_NC(info);
		else if (nc == columnWrk4Dtl_rcv_day2) doWrk4Dtl_rcv_day2_NC(info);
		else if (nc == columnWrk4Dtl_rcv_crryovr_mons3) doWrk4Dtl_rcv_crryovr_mons3_NC(info);
		else if (nc == columnWrk4Dtl_rcv_day3) doWrk4Dtl_rcv_day3_NC(info);
		else if (nc == columnWrk4Dtl_rcv_crryovr_mons4) doWrk4Dtl_rcv_crryovr_mons4_NC(info);
		else if (nc == columnWrk4Dtl_rcv_day4) doWrk4Dtl_rcv_day4_NC(info);
		else if (nc == columnWrk4Dtl_rcv_crryovr_mons5) doWrk4Dtl_rcv_crryovr_mons5_NC(info);
		else if (nc == columnWrk4Dtl_rcv_day5) doWrk4Dtl_rcv_day5_NC(info);
		else if (nc == columnWrk4Dtl_memo1) doWrk4Dtl_memo1_NC(info);
		else if (nc == columnWrk4Dtl_memo2) doWrk4Dtl_memo2_NC(info);
		else if (nc == columnWrk4Dtl_memo3) doWrk4Dtl_memo3_NC(info);
		else if (nc == columnWrk4Dtl_ins_usr_id) doWrk4Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk4Dtl_ins_usr_nm) doWrk4Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk4Dtl_ins_ts) doWrk4Dtl_ins_ts_NC(info);
		else if (nc == columnWrk4Dtl_ins_func_id) doWrk4Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk4Dtl_ins_func_nm) doWrk4Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk4Dtl_upd_cntr) doWrk4Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk4Dtl_upd_usr_id) doWrk4Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk4Dtl_upd_usr_nm) doWrk4Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk4Dtl_upd_ts) doWrk4Dtl_upd_ts_NC(info);
		else if (nc == columnWrk4Dtl_upd_func_id) doWrk4Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk4Dtl_upd_func_nm) doWrk4Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk4Dtl_upd_srv_req_no) doWrk4Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk4Dtl_del_usr_id) doWrk4Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk4Dtl_del_usr_nm) doWrk4Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk4Dtl_del_ts) doWrk4Dtl_del_ts_NC(info);
		else if (nc == Wrk7Hdr_st_dt) doWrk7Hdr_st_dt_NC(info);
		else if (nc == Wrk7Hdr_end_dt) doWrk7Hdr_end_dt_NC(info);
		else if (nc == columnWrk7Dtl_check) doWrk7Dtl_check_NC(info);
		else if (nc == columnWrk7Dtl_del_flg) doWrk7Dtl_del_flg_NC(info);
		else if (nc == columnWrk7Dtl_bp_cd) doWrk7Dtl_bp_cd_NC(info);
		else if (nc == columnWrk7Dtl_if_proc_typ) doWrk7Dtl_if_proc_typ_NC(info);
		else if (nc == columnWrk7Dtl_if_proc_typ_nm) doWrk7Dtl_if_proc_typ_nm_NC(info);
		else if (nc == columnWrk7Dtl_not_onr_prov_flg) doWrk7Dtl_not_onr_prov_flg_NC(info);
		else if (nc == columnWrk7Dtl_ext_sys_cd) doWrk7Dtl_ext_sys_cd_NC(info);
		else if (nc == columnWrk7Dtl_ext_sys_nm) doWrk7Dtl_ext_sys_nm_NC(info);
		else if (nc == columnWrk7Dtl_memo1) doWrk7Dtl_memo1_NC(info);
		else if (nc == columnWrk7Dtl_memo2) doWrk7Dtl_memo2_NC(info);
		else if (nc == columnWrk7Dtl_memo3) doWrk7Dtl_memo3_NC(info);
		else if (nc == columnWrk7Dtl_ins_usr_id) doWrk7Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk7Dtl_ins_usr_nm) doWrk7Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk7Dtl_ins_ts) doWrk7Dtl_ins_ts_NC(info);
		else if (nc == columnWrk7Dtl_ins_func_id) doWrk7Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk7Dtl_ins_func_nm) doWrk7Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk7Dtl_upd_cntr) doWrk7Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk7Dtl_upd_usr_id) doWrk7Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk7Dtl_upd_usr_nm) doWrk7Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk7Dtl_upd_ts) doWrk7Dtl_upd_ts_NC(info);
		else if (nc == columnWrk7Dtl_upd_func_id) doWrk7Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk7Dtl_upd_func_nm) doWrk7Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk7Dtl_upd_srv_req_no) doWrk7Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk7Dtl_del_usr_id) doWrk7Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk7Dtl_del_usr_nm) doWrk7Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk7Dtl_del_ts) doWrk7Dtl_del_ts_NC(info);
		else if (nc == columnWrk5Dtl_check) doWrk5Dtl_check_NC(info);
		else if (nc == columnWrk5Dtl_del_flg) doWrk5Dtl_del_flg_NC(info);
		else if (nc == columnWrk5Dtl_rcst_cd) doWrk5Dtl_rcst_cd_NC(info);
		else if (nc == columnWrk5Dtl_cur_cd) doWrk5Dtl_cur_cd_NC(info);
		else if (nc == columnWrk5Dtl_cur_nm) doWrk5Dtl_cur_nm_NC(info);
		else if (nc == columnWrk5Dtl_amt_dec_place) doWrk5Dtl_amt_dec_place_NC(info);
		else if (nc == columnWrk5Dtl_memo1) doWrk5Dtl_memo1_NC(info);
		else if (nc == columnWrk5Dtl_memo2) doWrk5Dtl_memo2_NC(info);
		else if (nc == columnWrk5Dtl_memo3) doWrk5Dtl_memo3_NC(info);
		else if (nc == columnWrk5Dtl_ins_usr_id) doWrk5Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk5Dtl_ins_usr_nm) doWrk5Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk5Dtl_ins_ts) doWrk5Dtl_ins_ts_NC(info);
		else if (nc == columnWrk5Dtl_ins_func_id) doWrk5Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk5Dtl_ins_func_nm) doWrk5Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk5Dtl_upd_cntr) doWrk5Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk5Dtl_upd_usr_id) doWrk5Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk5Dtl_upd_usr_nm) doWrk5Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk5Dtl_upd_ts) doWrk5Dtl_upd_ts_NC(info);
		else if (nc == columnWrk5Dtl_upd_func_id) doWrk5Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk5Dtl_upd_func_nm) doWrk5Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk5Dtl_upd_srv_req_no) doWrk5Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk5Dtl_del_usr_id) doWrk5Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk5Dtl_del_usr_nm) doWrk5Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk5Dtl_del_ts) doWrk5Dtl_del_ts_NC(info);
		else if (nc == Wrk6Hdr_st_dt) doWrk6Hdr_st_dt_NC(info);
		else if (nc == Wrk6Hdr_end_dt) doWrk6Hdr_end_dt_NC(info);
		else if (nc == columnWrk6Dtl_check) doWrk6Dtl_check_NC(info);
		else if (nc == columnWrk6Dtl_del_flg) doWrk6Dtl_del_flg_NC(info);
		else if (nc == columnWrk6Dtl_bp_cd) doWrk6Dtl_bp_cd_NC(info);
		else if (nc == columnWrk6Dtl_bp_cd_null_flg) doWrk6Dtl_bp_cd_null_flg_NC(info);
		else if (nc == columnWrk6Dtl_if_proc_typ) doWrk6Dtl_if_proc_typ_NC(info);
		else if (nc == columnWrk6Dtl_if_proc_typ_nm) doWrk6Dtl_if_proc_typ_nm_NC(info);
		else if (nc == columnWrk6Dtl_ar_sttl_typ) doWrk6Dtl_ar_sttl_typ_NC(info);
		else if (nc == columnWrk6Dtl_ar_sttl_typ_nm) doWrk6Dtl_ar_sttl_typ_nm_NC(info);
		else if (nc == columnWrk6Dtl_bank_cd) doWrk6Dtl_bank_cd_NC(info);
		else if (nc == columnWrk6Dtl_bank_nm) doWrk6Dtl_bank_nm_NC(info);
		else if (nc == columnWrk6Dtl_bank_ac_cd) doWrk6Dtl_bank_ac_cd_NC(info);
		else if (nc == columnWrk6Dtl_bank_ac_nm) doWrk6Dtl_bank_ac_nm_NC(info);
		else if (nc == columnWrk6Dtl_memo1) doWrk6Dtl_memo1_NC(info);
		else if (nc == columnWrk6Dtl_memo2) doWrk6Dtl_memo2_NC(info);
		else if (nc == columnWrk6Dtl_memo3) doWrk6Dtl_memo3_NC(info);
		else if (nc == columnWrk6Dtl_ins_usr_id) doWrk6Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk6Dtl_ins_usr_nm) doWrk6Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk6Dtl_ins_ts) doWrk6Dtl_ins_ts_NC(info);
		else if (nc == columnWrk6Dtl_ins_func_id) doWrk6Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk6Dtl_ins_func_nm) doWrk6Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk6Dtl_upd_cntr) doWrk6Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk6Dtl_upd_usr_id) doWrk6Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk6Dtl_upd_usr_nm) doWrk6Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk6Dtl_upd_ts) doWrk6Dtl_upd_ts_NC(info);
		else if (nc == columnWrk6Dtl_upd_func_id) doWrk6Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk6Dtl_upd_func_nm) doWrk6Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk6Dtl_upd_srv_req_no) doWrk6Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk6Dtl_del_usr_id) doWrk6Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk6Dtl_del_usr_nm) doWrk6Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk6Dtl_del_ts) doWrk6Dtl_del_ts_NC(info);
		else if (nc == columnHdrAll_check) doHdrAll_check_NC(info);
		else if (nc == columnHdrAll_bp_cd) doHdrAll_bp_cd_NC(info);
		else if (nc == columnHdrAll_bp_nm) doHdrAll_bp_nm_NC(info);
		else if (nc == columnHdrAll_bcst_flg) doHdrAll_bcst_flg_NC(info);
		else if (nc == columnHdrAll_rcst_flg) doHdrAll_rcst_flg_NC(info);
		else if (nc == columnHdrAll_rcst_cd) doHdrAll_rcst_cd_NC(info);
		else if (nc == columnHdrAll_rcst_nm) doHdrAll_rcst_nm_NC(info);
		else if (nc == columnHdrAll_ar_cred_cd) doHdrAll_ar_cred_cd_NC(info);
		else if (nc == columnHdrAll_ar_cred_nm) doHdrAll_ar_cred_nm_NC(info);
		else if (nc == columnHdrAll_bill_dpt_typ) doHdrAll_bill_dpt_typ_NC(info);
		else if (nc == columnHdrAll_bill_dpt_typ_nm) doHdrAll_bill_dpt_typ_nm_NC(info);
		else if (nc == columnHdrAll_bcst_dpt_cd) doHdrAll_bcst_dpt_cd_NC(info);
		else if (nc == columnHdrAll_bcst_dpt_nm) doHdrAll_bcst_dpt_nm_NC(info);
		else if (nc == columnHdrAll_check_bcst_dpt_cd) doHdrAll_check_bcst_dpt_cd_NC(info);
		else if (nc == columnHdrAll_bill_cl_typ) doHdrAll_bill_cl_typ_NC(info);
		else if (nc == columnHdrAll_bill_cl_typ_nm) doHdrAll_bill_cl_typ_nm_NC(info);
		else if (nc == columnHdrAll_bill_cl_day1) doHdrAll_bill_cl_day1_NC(info);
		else if (nc == columnHdrAll_bill_cl_day2) doHdrAll_bill_cl_day2_NC(info);
		else if (nc == columnHdrAll_bill_cl_day3) doHdrAll_bill_cl_day3_NC(info);
		else if (nc == columnHdrAll_bill_cl_day4) doHdrAll_bill_cl_day4_NC(info);
		else if (nc == columnHdrAll_bill_cl_day5) doHdrAll_bill_cl_day5_NC(info);
		else if (nc == columnHdrAll_tax_on_bill_flg) doHdrAll_tax_on_bill_flg_NC(info);
		else if (nc == columnHdrAll_bill_tax_rnd_typ) doHdrAll_bill_tax_rnd_typ_NC(info);
		else if (nc == columnHdrAll_bill_tax_rnd_typ_nm) doHdrAll_bill_tax_rnd_typ_nm_NC(info);
		else if (nc == columnHdrAll_bill_cl_delay_days) doHdrAll_bill_cl_delay_days_NC(info);
		else if (nc == columnHdrAll_bill_cl_ba_typ) doHdrAll_bill_cl_ba_typ_NC(info);
		else if (nc == columnHdrAll_bill_cl_ba_typ_nm) doHdrAll_bill_cl_ba_typ_nm_NC(info);
		else if (nc == columnHdrAll_bill_cal_cd) doHdrAll_bill_cal_cd_NC(info);
		else if (nc == columnHdrAll_bill_cal_nm) doHdrAll_bill_cal_nm_NC(info);
		else if (nc == columnHdrAll_rcv_ba_typ) doHdrAll_rcv_ba_typ_NC(info);
		else if (nc == columnHdrAll_rcv_ba_typ_nm) doHdrAll_rcv_ba_typ_nm_NC(info);
		else if (nc == columnHdrAll_auto_line_appl_flg) doHdrAll_auto_line_appl_flg_NC(info);
		else if (nc == columnHdrAll_sls_interim_cl_flg) doHdrAll_sls_interim_cl_flg_NC(info);
		else if (nc == columnHdrAll_ar_setoff_grp_cd) doHdrAll_ar_setoff_grp_cd_NC(info);
		else if (nc == columnHdrAll_ar_setoff_grp_nm) doHdrAll_ar_setoff_grp_nm_NC(info);
		else if (nc == columnHdrAll_bcst_prnt_typ) doHdrAll_bcst_prnt_typ_NC(info);
		else if (nc == columnHdrAll_bcst_prnt_typ_nm) doHdrAll_bcst_prnt_typ_nm_NC(info);
		else if (nc == columnHdrAll_bill_zip_cd) doHdrAll_bill_zip_cd_NC(info);
		else if (nc == columnHdrAll_bill_addr1) doHdrAll_bill_addr1_NC(info);
		else if (nc == columnHdrAll_bill_addr2) doHdrAll_bill_addr2_NC(info);
		else if (nc == columnHdrAll_bill_addr3) doHdrAll_bill_addr3_NC(info);
		else if (nc == columnHdrAll_bill_addr4) doHdrAll_bill_addr4_NC(info);
		else if (nc == columnHdrAll_bill_tel) doHdrAll_bill_tel_NC(info);
		else if (nc == columnHdrAll_bill_bcst_nm) doHdrAll_bill_bcst_nm_NC(info);
		else if (nc == columnHdrAll_bill_bcst_dpt) doHdrAll_bill_bcst_dpt_NC(info);
		else if (nc == columnHdrAll_bill_bcst_psn) doHdrAll_bill_bcst_psn_NC(info);
		else if (nc == columnHdrAll_bill_bcst_psn_title) doHdrAll_bill_bcst_psn_title_NC(info);
		else if (nc == columnHdrAll_bill_prnt_typ) doHdrAll_bill_prnt_typ_NC(info);
		else if (nc == columnHdrAll_bill_prnt_typ_nm) doHdrAll_bill_prnt_typ_nm_NC(info);
		else if (nc == columnHdrAll_sls_dtl_outp_typ) doHdrAll_sls_dtl_outp_typ_NC(info);
		else if (nc == columnHdrAll_sls_dtl_outp_typ_nm) doHdrAll_sls_dtl_outp_typ_nm_NC(info);
		else if (nc == columnHdrAll_bill_dtl_outp_flg) doHdrAll_bill_dtl_outp_flg_NC(info);
		else if (nc == columnHdrAll_bfw_bal_disp_flg) doHdrAll_bfw_bal_disp_flg_NC(info);
		else if (nc == columnHdrAll_bill_dtl_adv_flg) doHdrAll_bill_dtl_adv_flg_NC(info);
		else if (nc == columnHdrAll_bill_dtl_rcv_flg) doHdrAll_bill_dtl_rcv_flg_NC(info);
		else if (nc == columnHdrAll_bill_dtl_subttl_typ) doHdrAll_bill_dtl_subttl_typ_NC(info);
		else if (nc == columnHdrAll_bill_dtl_subttl_typ_nm) doHdrAll_bill_dtl_subttl_typ_nm_NC(info);
		else if (nc == columnHdrAll_bill_dtl_brk_typ) doHdrAll_bill_dtl_brk_typ_NC(info);
		else if (nc == columnHdrAll_bill_dtl_brk_typ_nm) doHdrAll_bill_dtl_brk_typ_nm_NC(info);
		else if (nc == columnHdrAll_bill_dtl_sort_typ) doHdrAll_bill_dtl_sort_typ_NC(info);
		else if (nc == columnHdrAll_bill_dtl_sort_typ_nm) doHdrAll_bill_dtl_sort_typ_nm_NC(info);
		else if (nc == columnHdrAll_bill_can_slip_typ) doHdrAll_bill_can_slip_typ_NC(info);
		else if (nc == columnHdrAll_bill_can_slip_typ_nm) doHdrAll_bill_can_slip_typ_nm_NC(info);
		else if (nc == columnHdrAll_rcv_auto_appl_tgt_flg) doHdrAll_rcv_auto_appl_tgt_flg_NC(info);
		else if (nc == columnHdrAll_rcv_amt_match_flg) doHdrAll_rcv_amt_match_flg_NC(info);
		else if (nc == columnHdrAll_ar_sttl_typ_match_flg) doHdrAll_ar_sttl_typ_match_flg_NC(info);
		else if (nc == columnHdrAll_calc_com_paid_flg) doHdrAll_calc_com_paid_flg_NC(info);
		else if (nc == columnHdrAll_auto_appl_delay_days) doHdrAll_auto_appl_delay_days_NC(info);
		else if (nc == columnHdrAll_xfr_psn) doHdrAll_xfr_psn_NC(info);
		else if (nc == columnHdrAll_ins_usr_id) doHdrAll_ins_usr_id_NC(info);
		else if (nc == columnHdrAll_ins_usr_nm) doHdrAll_ins_usr_nm_NC(info);
		else if (nc == columnHdrAll_ins_ts) doHdrAll_ins_ts_NC(info);
		else if (nc == columnHdrAll_ins_func_id) doHdrAll_ins_func_id_NC(info);
		else if (nc == columnHdrAll_ins_func_nm) doHdrAll_ins_func_nm_NC(info);
		else if (nc == columnHdrAll_upd_cntr) doHdrAll_upd_cntr_NC(info);
		else if (nc == columnHdrAll_upd_usr_id) doHdrAll_upd_usr_id_NC(info);
		else if (nc == columnHdrAll_upd_usr_nm) doHdrAll_upd_usr_nm_NC(info);
		else if (nc == columnHdrAll_upd_ts) doHdrAll_upd_ts_NC(info);
		else if (nc == columnHdrAll_upd_func_id) doHdrAll_upd_func_id_NC(info);
		else if (nc == columnHdrAll_upd_func_nm) doHdrAll_upd_func_nm_NC(info);
		else if (nc == columnHdrAll_upd_srv_req_no) doHdrAll_upd_srv_req_no_NC(info);
		else if (nc == columnHdrAll_del_usr_id) doHdrAll_del_usr_id_NC(info);
		else if (nc == columnHdrAll_del_usr_nm) doHdrAll_del_usr_nm_NC(info);
		else if (nc == columnHdrAll_del_ts) doHdrAll_del_ts_NC(info);
		else if (nc == columnHdrAll_rcst_prnt_typ) doHdrAll_rcst_prnt_typ_NC(info);
		else if (nc == columnHdrAll_rcst_prnt_typ_nm) doHdrAll_rcst_prnt_typ_nm_NC(info);
	}

	/**
	 * [DtlTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_cred_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_cred_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_cred_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_cred_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[check_bcst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_check_bcst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day4_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day5_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tax_on_bill_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tax_on_bill_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_tax_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_tax_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_delay_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_delay_days_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_ba_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_ba_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_ba_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_ba_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_ba_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_ba_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_ba_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_ba_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_line_appl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_line_appl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_interim_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_interim_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_setoff_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_setoff_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_setoff_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_setoff_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_addr1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_addr2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_addr3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_addr4_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_tel_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_bcst_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_bcst_dpt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_bcst_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_bcst_psn_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_bcst_psn_title]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_bcst_psn_title_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_dtl_outp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_dtl_outp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_dtl_outp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_dtl_outp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_outp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_outp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bfw_bal_disp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bfw_bal_disp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_adv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_adv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_rcv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_rcv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_subttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_subttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_subttl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_subttl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_brk_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_brk_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_brk_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_brk_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_sort_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_sort_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_sort_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_sort_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_can_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_can_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_can_slip_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_can_slip_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_auto_appl_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_auto_appl_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_amt_match_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_amt_match_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_sttl_typ_match_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_sttl_typ_match_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_com_paid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_com_paid_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_appl_delay_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_appl_delay_days_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xfr_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xfr_psn_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Hdr_bill_cl_day1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Hdr_bill_cl_day2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Hdr_bill_cl_day3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Hdr_bill_cl_day4_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Hdr_bill_cl_day5_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bill_cl_day1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bill_cl_day2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bill_cl_day3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bill_cl_day4_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bill_cl_day5_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rate_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[crryovr_mons_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_crryovr_mons_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[crryovr_mons_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_crryovr_mons_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_crryovr_mons1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_day1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_crryovr_mons2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_day2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_crryovr_mons3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_day3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_crryovr_mons4_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_day4_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_crryovr_mons5_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_day5_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Hdr]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Hdr_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Hdr]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Hdr_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[if_proc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_if_proc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[if_proc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_if_proc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[not_onr_prov_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_not_onr_prov_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[rcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_rcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Hdr]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Hdr_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Hdr]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Hdr_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bp_cd_null_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bp_cd_null_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[if_proc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_if_proc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[if_proc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_if_proc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ar_sttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ar_sttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ar_sttl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ar_sttl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bank_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bank_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bank_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bank_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bank_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bank_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_check_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bcst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bcst_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcst_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcst_cd_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ar_cred_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ar_cred_cd_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ar_cred_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ar_cred_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dpt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dpt_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dpt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dpt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bcst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bcst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bcst_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bcst_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[check_bcst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_check_bcst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_day1_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_day2_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_day3_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_day4_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_day5_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[tax_on_bill_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_tax_on_bill_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_tax_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_tax_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_delay_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_delay_days_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_ba_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_ba_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_ba_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_ba_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cal_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cal_cd_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cal_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cal_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcv_ba_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcv_ba_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcv_ba_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcv_ba_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[auto_line_appl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_auto_line_appl_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[sls_interim_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_sls_interim_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ar_setoff_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ar_setoff_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ar_setoff_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ar_setoff_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bcst_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bcst_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bcst_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bcst_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_addr1_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_addr2_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_addr3_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_addr4_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_tel_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_bcst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_bcst_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_bcst_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_bcst_dpt_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_bcst_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_bcst_psn_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_bcst_psn_title]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_bcst_psn_title_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[sls_dtl_outp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_sls_dtl_outp_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[sls_dtl_outp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_sls_dtl_outp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_outp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_outp_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bfw_bal_disp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bfw_bal_disp_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_adv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_adv_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_rcv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_rcv_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_subttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_subttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_subttl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_subttl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_brk_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_brk_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_brk_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_brk_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_sort_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_sort_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_sort_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_sort_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_can_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_can_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_can_slip_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_can_slip_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcv_auto_appl_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcv_auto_appl_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcv_amt_match_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcv_amt_match_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ar_sttl_typ_match_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ar_sttl_typ_match_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[calc_com_paid_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_calc_com_paid_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[auto_appl_delay_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_auto_appl_delay_days_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[xfr_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_xfr_psn_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcst_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcst_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcst_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcst_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DtlTabTab) doDtlTab_NE(info);
		else if (ne == Wrk4DtlTable) doWrk4Dtl_NE(info);
		else if (ne == Wrk7DtlTable) doWrk7Dtl_NE(info);
		else if (ne == Wrk5DtlTable) doWrk5Dtl_NE(info);
		else if (ne == Wrk6DtlTable) doWrk6Dtl_NE(info);
		else if (ne == HdrAllTable) doHdrAll_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_bp_cd) doCnd_bp_cd_NE(info);
		else if (ne == Cnd_bp_nm) doCnd_bp_nm_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == Hdr_bp_cd) doHdr_bp_cd_NE(info);
		else if (ne == Hdr_bp_nm) doHdr_bp_nm_NE(info);
		else if (ne == Hdr_bcst_flg) doHdr_bcst_flg_NE(info);
		else if (ne == Hdr_rcst_flg) doHdr_rcst_flg_NE(info);
		else if (ne == Hdr_rcst_cd) doHdr_rcst_cd_NE(info);
		else if (ne == Hdr_rcst_nm) doHdr_rcst_nm_NE(info);
		else if (ne == Hdr_ar_cred_cd) doHdr_ar_cred_cd_NE(info);
		else if (ne == Hdr_ar_cred_nm) doHdr_ar_cred_nm_NE(info);
		else if (ne == Hdr_bill_dpt_typ) doHdr_bill_dpt_typ_NE(info);
		else if (ne == Hdr_bill_dpt_typ_nm) doHdr_bill_dpt_typ_nm_NE(info);
		else if (ne == Hdr_bcst_dpt_cd) doHdr_bcst_dpt_cd_NE(info);
		else if (ne == Hdr_bcst_dpt_nm) doHdr_bcst_dpt_nm_NE(info);
		else if (ne == Hdr_check_bcst_dpt_cd) doHdr_check_bcst_dpt_cd_NE(info);
		else if (ne == Hdr_bill_cl_typ) doHdr_bill_cl_typ_NE(info);
		else if (ne == Hdr_bill_cl_typ_nm) doHdr_bill_cl_typ_nm_NE(info);
		else if (ne == Hdr_bill_cl_day1) doHdr_bill_cl_day1_NE(info);
		else if (ne == Hdr_bill_cl_day2) doHdr_bill_cl_day2_NE(info);
		else if (ne == Hdr_bill_cl_day3) doHdr_bill_cl_day3_NE(info);
		else if (ne == Hdr_bill_cl_day4) doHdr_bill_cl_day4_NE(info);
		else if (ne == Hdr_bill_cl_day5) doHdr_bill_cl_day5_NE(info);
		else if (ne == Hdr_tax_on_bill_flg) doHdr_tax_on_bill_flg_NE(info);
		else if (ne == Hdr_bill_tax_rnd_typ) doHdr_bill_tax_rnd_typ_NE(info);
		else if (ne == Hdr_bill_tax_rnd_typ_nm) doHdr_bill_tax_rnd_typ_nm_NE(info);
		else if (ne == Hdr_bill_cl_delay_days) doHdr_bill_cl_delay_days_NE(info);
		else if (ne == Hdr_bill_cl_ba_typ) doHdr_bill_cl_ba_typ_NE(info);
		else if (ne == Hdr_bill_cl_ba_typ_nm) doHdr_bill_cl_ba_typ_nm_NE(info);
		else if (ne == Hdr_bill_cal_cd) doHdr_bill_cal_cd_NE(info);
		else if (ne == Hdr_bill_cal_nm) doHdr_bill_cal_nm_NE(info);
		else if (ne == Hdr_rcv_ba_typ) doHdr_rcv_ba_typ_NE(info);
		else if (ne == Hdr_rcv_ba_typ_nm) doHdr_rcv_ba_typ_nm_NE(info);
		else if (ne == Hdr_auto_line_appl_flg) doHdr_auto_line_appl_flg_NE(info);
		else if (ne == Hdr_sls_interim_cl_flg) doHdr_sls_interim_cl_flg_NE(info);
		else if (ne == Hdr_ar_setoff_grp_cd) doHdr_ar_setoff_grp_cd_NE(info);
		else if (ne == Hdr_ar_setoff_grp_nm) doHdr_ar_setoff_grp_nm_NE(info);
		else if (ne == Hdr_bcst_prnt_typ) doHdr_bcst_prnt_typ_NE(info);
		else if (ne == Hdr_bcst_prnt_typ_nm) doHdr_bcst_prnt_typ_nm_NE(info);
		else if (ne == Hdr_bill_zip_cd) doHdr_bill_zip_cd_NE(info);
		else if (ne == Hdr_bill_addr1) doHdr_bill_addr1_NE(info);
		else if (ne == Hdr_bill_addr2) doHdr_bill_addr2_NE(info);
		else if (ne == Hdr_bill_addr3) doHdr_bill_addr3_NE(info);
		else if (ne == Hdr_bill_addr4) doHdr_bill_addr4_NE(info);
		else if (ne == Hdr_bill_tel) doHdr_bill_tel_NE(info);
		else if (ne == Hdr_bill_bcst_nm) doHdr_bill_bcst_nm_NE(info);
		else if (ne == Hdr_bill_bcst_dpt) doHdr_bill_bcst_dpt_NE(info);
		else if (ne == Hdr_bill_bcst_psn) doHdr_bill_bcst_psn_NE(info);
		else if (ne == Hdr_bill_bcst_psn_title) doHdr_bill_bcst_psn_title_NE(info);
		else if (ne == Hdr_bill_prnt_typ) doHdr_bill_prnt_typ_NE(info);
		else if (ne == Hdr_bill_prnt_typ_nm) doHdr_bill_prnt_typ_nm_NE(info);
		else if (ne == Hdr_sls_dtl_outp_typ) doHdr_sls_dtl_outp_typ_NE(info);
		else if (ne == Hdr_sls_dtl_outp_typ_nm) doHdr_sls_dtl_outp_typ_nm_NE(info);
		else if (ne == Hdr_bill_dtl_outp_flg) doHdr_bill_dtl_outp_flg_NE(info);
		else if (ne == Hdr_bfw_bal_disp_flg) doHdr_bfw_bal_disp_flg_NE(info);
		else if (ne == Hdr_bill_dtl_adv_flg) doHdr_bill_dtl_adv_flg_NE(info);
		else if (ne == Hdr_bill_dtl_rcv_flg) doHdr_bill_dtl_rcv_flg_NE(info);
		else if (ne == Hdr_bill_dtl_subttl_typ) doHdr_bill_dtl_subttl_typ_NE(info);
		else if (ne == Hdr_bill_dtl_subttl_typ_nm) doHdr_bill_dtl_subttl_typ_nm_NE(info);
		else if (ne == Hdr_bill_dtl_brk_typ) doHdr_bill_dtl_brk_typ_NE(info);
		else if (ne == Hdr_bill_dtl_brk_typ_nm) doHdr_bill_dtl_brk_typ_nm_NE(info);
		else if (ne == Hdr_bill_dtl_sort_typ) doHdr_bill_dtl_sort_typ_NE(info);
		else if (ne == Hdr_bill_dtl_sort_typ_nm) doHdr_bill_dtl_sort_typ_nm_NE(info);
		else if (ne == Hdr_bill_can_slip_typ) doHdr_bill_can_slip_typ_NE(info);
		else if (ne == Hdr_bill_can_slip_typ_nm) doHdr_bill_can_slip_typ_nm_NE(info);
		else if (ne == Hdr_rcv_auto_appl_tgt_flg) doHdr_rcv_auto_appl_tgt_flg_NE(info);
		else if (ne == Hdr_rcv_amt_match_flg) doHdr_rcv_amt_match_flg_NE(info);
		else if (ne == Hdr_ar_sttl_typ_match_flg) doHdr_ar_sttl_typ_match_flg_NE(info);
		else if (ne == Hdr_calc_com_paid_flg) doHdr_calc_com_paid_flg_NE(info);
		else if (ne == Hdr_auto_appl_delay_days) doHdr_auto_appl_delay_days_NE(info);
		else if (ne == Hdr_xfr_psn) doHdr_xfr_psn_NE(info);
		else if (ne == Hdr_rcst_prnt_typ) doHdr_rcst_prnt_typ_NE(info);
		else if (ne == Hdr_rcst_prnt_typ_nm) doHdr_rcst_prnt_typ_nm_NE(info);
		else if (ne == Wrk4Hdr_bill_cl_day1) doWrk4Hdr_bill_cl_day1_NE(info);
		else if (ne == Wrk4Hdr_bill_cl_day2) doWrk4Hdr_bill_cl_day2_NE(info);
		else if (ne == Wrk4Hdr_bill_cl_day3) doWrk4Hdr_bill_cl_day3_NE(info);
		else if (ne == Wrk4Hdr_bill_cl_day4) doWrk4Hdr_bill_cl_day4_NE(info);
		else if (ne == Wrk4Hdr_bill_cl_day5) doWrk4Hdr_bill_cl_day5_NE(info);
		else if (ne == columnWrk4Dtl_check) doWrk4Dtl_check_NE(info);
		else if (ne == columnWrk4Dtl_del_flg) doWrk4Dtl_del_flg_NE(info);
		else if (ne == columnWrk4Dtl_bcst_cd) doWrk4Dtl_bcst_cd_NE(info);
		else if (ne == columnWrk4Dtl_bill_cl_day1) doWrk4Dtl_bill_cl_day1_NE(info);
		else if (ne == columnWrk4Dtl_bill_cl_day2) doWrk4Dtl_bill_cl_day2_NE(info);
		else if (ne == columnWrk4Dtl_bill_cl_day3) doWrk4Dtl_bill_cl_day3_NE(info);
		else if (ne == columnWrk4Dtl_bill_cl_day4) doWrk4Dtl_bill_cl_day4_NE(info);
		else if (ne == columnWrk4Dtl_bill_cl_day5) doWrk4Dtl_bill_cl_day5_NE(info);
		else if (ne == columnWrk4Dtl_cur_cd) doWrk4Dtl_cur_cd_NE(info);
		else if (ne == columnWrk4Dtl_cur_nm) doWrk4Dtl_cur_nm_NE(info);
		else if (ne == columnWrk4Dtl_amt_dec_place) doWrk4Dtl_amt_dec_place_NE(info);
		else if (ne == columnWrk4Dtl_sttl_cd) doWrk4Dtl_sttl_cd_NE(info);
		else if (ne == columnWrk4Dtl_sttl_nm) doWrk4Dtl_sttl_nm_NE(info);
		else if (ne == columnWrk4Dtl_wg_cd) doWrk4Dtl_wg_cd_NE(info);
		else if (ne == columnWrk4Dtl_wg_nm) doWrk4Dtl_wg_nm_NE(info);
		else if (ne == columnWrk4Dtl_rate) doWrk4Dtl_rate_NE(info);
		else if (ne == columnWrk4Dtl_crryovr_mons_typ) doWrk4Dtl_crryovr_mons_typ_NE(info);
		else if (ne == columnWrk4Dtl_crryovr_mons_typ_nm) doWrk4Dtl_crryovr_mons_typ_nm_NE(info);
		else if (ne == columnWrk4Dtl_rcv_crryovr_mons1) doWrk4Dtl_rcv_crryovr_mons1_NE(info);
		else if (ne == columnWrk4Dtl_rcv_day1) doWrk4Dtl_rcv_day1_NE(info);
		else if (ne == columnWrk4Dtl_rcv_crryovr_mons2) doWrk4Dtl_rcv_crryovr_mons2_NE(info);
		else if (ne == columnWrk4Dtl_rcv_day2) doWrk4Dtl_rcv_day2_NE(info);
		else if (ne == columnWrk4Dtl_rcv_crryovr_mons3) doWrk4Dtl_rcv_crryovr_mons3_NE(info);
		else if (ne == columnWrk4Dtl_rcv_day3) doWrk4Dtl_rcv_day3_NE(info);
		else if (ne == columnWrk4Dtl_rcv_crryovr_mons4) doWrk4Dtl_rcv_crryovr_mons4_NE(info);
		else if (ne == columnWrk4Dtl_rcv_day4) doWrk4Dtl_rcv_day4_NE(info);
		else if (ne == columnWrk4Dtl_rcv_crryovr_mons5) doWrk4Dtl_rcv_crryovr_mons5_NE(info);
		else if (ne == columnWrk4Dtl_rcv_day5) doWrk4Dtl_rcv_day5_NE(info);
		else if (ne == columnWrk4Dtl_memo1) doWrk4Dtl_memo1_NE(info);
		else if (ne == columnWrk4Dtl_memo2) doWrk4Dtl_memo2_NE(info);
		else if (ne == columnWrk4Dtl_memo3) doWrk4Dtl_memo3_NE(info);
		else if (ne == columnWrk4Dtl_ins_usr_id) doWrk4Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk4Dtl_ins_usr_nm) doWrk4Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk4Dtl_ins_ts) doWrk4Dtl_ins_ts_NE(info);
		else if (ne == columnWrk4Dtl_ins_func_id) doWrk4Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk4Dtl_ins_func_nm) doWrk4Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk4Dtl_upd_cntr) doWrk4Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk4Dtl_upd_usr_id) doWrk4Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk4Dtl_upd_usr_nm) doWrk4Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk4Dtl_upd_ts) doWrk4Dtl_upd_ts_NE(info);
		else if (ne == columnWrk4Dtl_upd_func_id) doWrk4Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk4Dtl_upd_func_nm) doWrk4Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk4Dtl_upd_srv_req_no) doWrk4Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk4Dtl_del_usr_id) doWrk4Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk4Dtl_del_usr_nm) doWrk4Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk4Dtl_del_ts) doWrk4Dtl_del_ts_NE(info);
		else if (ne == Wrk7Hdr_st_dt) doWrk7Hdr_st_dt_NE(info);
		else if (ne == Wrk7Hdr_end_dt) doWrk7Hdr_end_dt_NE(info);
		else if (ne == columnWrk7Dtl_check) doWrk7Dtl_check_NE(info);
		else if (ne == columnWrk7Dtl_del_flg) doWrk7Dtl_del_flg_NE(info);
		else if (ne == columnWrk7Dtl_bp_cd) doWrk7Dtl_bp_cd_NE(info);
		else if (ne == columnWrk7Dtl_if_proc_typ) doWrk7Dtl_if_proc_typ_NE(info);
		else if (ne == columnWrk7Dtl_if_proc_typ_nm) doWrk7Dtl_if_proc_typ_nm_NE(info);
		else if (ne == columnWrk7Dtl_not_onr_prov_flg) doWrk7Dtl_not_onr_prov_flg_NE(info);
		else if (ne == columnWrk7Dtl_ext_sys_cd) doWrk7Dtl_ext_sys_cd_NE(info);
		else if (ne == columnWrk7Dtl_ext_sys_nm) doWrk7Dtl_ext_sys_nm_NE(info);
		else if (ne == columnWrk7Dtl_memo1) doWrk7Dtl_memo1_NE(info);
		else if (ne == columnWrk7Dtl_memo2) doWrk7Dtl_memo2_NE(info);
		else if (ne == columnWrk7Dtl_memo3) doWrk7Dtl_memo3_NE(info);
		else if (ne == columnWrk7Dtl_ins_usr_id) doWrk7Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk7Dtl_ins_usr_nm) doWrk7Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk7Dtl_ins_ts) doWrk7Dtl_ins_ts_NE(info);
		else if (ne == columnWrk7Dtl_ins_func_id) doWrk7Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk7Dtl_ins_func_nm) doWrk7Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk7Dtl_upd_cntr) doWrk7Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk7Dtl_upd_usr_id) doWrk7Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk7Dtl_upd_usr_nm) doWrk7Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk7Dtl_upd_ts) doWrk7Dtl_upd_ts_NE(info);
		else if (ne == columnWrk7Dtl_upd_func_id) doWrk7Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk7Dtl_upd_func_nm) doWrk7Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk7Dtl_upd_srv_req_no) doWrk7Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk7Dtl_del_usr_id) doWrk7Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk7Dtl_del_usr_nm) doWrk7Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk7Dtl_del_ts) doWrk7Dtl_del_ts_NE(info);
		else if (ne == columnWrk5Dtl_check) doWrk5Dtl_check_NE(info);
		else if (ne == columnWrk5Dtl_del_flg) doWrk5Dtl_del_flg_NE(info);
		else if (ne == columnWrk5Dtl_rcst_cd) doWrk5Dtl_rcst_cd_NE(info);
		else if (ne == columnWrk5Dtl_cur_cd) doWrk5Dtl_cur_cd_NE(info);
		else if (ne == columnWrk5Dtl_cur_nm) doWrk5Dtl_cur_nm_NE(info);
		else if (ne == columnWrk5Dtl_amt_dec_place) doWrk5Dtl_amt_dec_place_NE(info);
		else if (ne == columnWrk5Dtl_memo1) doWrk5Dtl_memo1_NE(info);
		else if (ne == columnWrk5Dtl_memo2) doWrk5Dtl_memo2_NE(info);
		else if (ne == columnWrk5Dtl_memo3) doWrk5Dtl_memo3_NE(info);
		else if (ne == columnWrk5Dtl_ins_usr_id) doWrk5Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk5Dtl_ins_usr_nm) doWrk5Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk5Dtl_ins_ts) doWrk5Dtl_ins_ts_NE(info);
		else if (ne == columnWrk5Dtl_ins_func_id) doWrk5Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk5Dtl_ins_func_nm) doWrk5Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk5Dtl_upd_cntr) doWrk5Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk5Dtl_upd_usr_id) doWrk5Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk5Dtl_upd_usr_nm) doWrk5Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk5Dtl_upd_ts) doWrk5Dtl_upd_ts_NE(info);
		else if (ne == columnWrk5Dtl_upd_func_id) doWrk5Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk5Dtl_upd_func_nm) doWrk5Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk5Dtl_upd_srv_req_no) doWrk5Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk5Dtl_del_usr_id) doWrk5Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk5Dtl_del_usr_nm) doWrk5Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk5Dtl_del_ts) doWrk5Dtl_del_ts_NE(info);
		else if (ne == Wrk6Hdr_st_dt) doWrk6Hdr_st_dt_NE(info);
		else if (ne == Wrk6Hdr_end_dt) doWrk6Hdr_end_dt_NE(info);
		else if (ne == columnWrk6Dtl_check) doWrk6Dtl_check_NE(info);
		else if (ne == columnWrk6Dtl_del_flg) doWrk6Dtl_del_flg_NE(info);
		else if (ne == columnWrk6Dtl_bp_cd) doWrk6Dtl_bp_cd_NE(info);
		else if (ne == columnWrk6Dtl_bp_cd_null_flg) doWrk6Dtl_bp_cd_null_flg_NE(info);
		else if (ne == columnWrk6Dtl_if_proc_typ) doWrk6Dtl_if_proc_typ_NE(info);
		else if (ne == columnWrk6Dtl_if_proc_typ_nm) doWrk6Dtl_if_proc_typ_nm_NE(info);
		else if (ne == columnWrk6Dtl_ar_sttl_typ) doWrk6Dtl_ar_sttl_typ_NE(info);
		else if (ne == columnWrk6Dtl_ar_sttl_typ_nm) doWrk6Dtl_ar_sttl_typ_nm_NE(info);
		else if (ne == columnWrk6Dtl_bank_cd) doWrk6Dtl_bank_cd_NE(info);
		else if (ne == columnWrk6Dtl_bank_nm) doWrk6Dtl_bank_nm_NE(info);
		else if (ne == columnWrk6Dtl_bank_ac_cd) doWrk6Dtl_bank_ac_cd_NE(info);
		else if (ne == columnWrk6Dtl_bank_ac_nm) doWrk6Dtl_bank_ac_nm_NE(info);
		else if (ne == columnWrk6Dtl_memo1) doWrk6Dtl_memo1_NE(info);
		else if (ne == columnWrk6Dtl_memo2) doWrk6Dtl_memo2_NE(info);
		else if (ne == columnWrk6Dtl_memo3) doWrk6Dtl_memo3_NE(info);
		else if (ne == columnWrk6Dtl_ins_usr_id) doWrk6Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk6Dtl_ins_usr_nm) doWrk6Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk6Dtl_ins_ts) doWrk6Dtl_ins_ts_NE(info);
		else if (ne == columnWrk6Dtl_ins_func_id) doWrk6Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk6Dtl_ins_func_nm) doWrk6Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk6Dtl_upd_cntr) doWrk6Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk6Dtl_upd_usr_id) doWrk6Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk6Dtl_upd_usr_nm) doWrk6Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk6Dtl_upd_ts) doWrk6Dtl_upd_ts_NE(info);
		else if (ne == columnWrk6Dtl_upd_func_id) doWrk6Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk6Dtl_upd_func_nm) doWrk6Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk6Dtl_upd_srv_req_no) doWrk6Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk6Dtl_del_usr_id) doWrk6Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk6Dtl_del_usr_nm) doWrk6Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk6Dtl_del_ts) doWrk6Dtl_del_ts_NE(info);
		else if (ne == columnHdrAll_check) doHdrAll_check_NE(info);
		else if (ne == columnHdrAll_bp_cd) doHdrAll_bp_cd_NE(info);
		else if (ne == columnHdrAll_bp_nm) doHdrAll_bp_nm_NE(info);
		else if (ne == columnHdrAll_bcst_flg) doHdrAll_bcst_flg_NE(info);
		else if (ne == columnHdrAll_rcst_flg) doHdrAll_rcst_flg_NE(info);
		else if (ne == columnHdrAll_rcst_cd) doHdrAll_rcst_cd_NE(info);
		else if (ne == columnHdrAll_rcst_nm) doHdrAll_rcst_nm_NE(info);
		else if (ne == columnHdrAll_ar_cred_cd) doHdrAll_ar_cred_cd_NE(info);
		else if (ne == columnHdrAll_ar_cred_nm) doHdrAll_ar_cred_nm_NE(info);
		else if (ne == columnHdrAll_bill_dpt_typ) doHdrAll_bill_dpt_typ_NE(info);
		else if (ne == columnHdrAll_bill_dpt_typ_nm) doHdrAll_bill_dpt_typ_nm_NE(info);
		else if (ne == columnHdrAll_bcst_dpt_cd) doHdrAll_bcst_dpt_cd_NE(info);
		else if (ne == columnHdrAll_bcst_dpt_nm) doHdrAll_bcst_dpt_nm_NE(info);
		else if (ne == columnHdrAll_check_bcst_dpt_cd) doHdrAll_check_bcst_dpt_cd_NE(info);
		else if (ne == columnHdrAll_bill_cl_typ) doHdrAll_bill_cl_typ_NE(info);
		else if (ne == columnHdrAll_bill_cl_typ_nm) doHdrAll_bill_cl_typ_nm_NE(info);
		else if (ne == columnHdrAll_bill_cl_day1) doHdrAll_bill_cl_day1_NE(info);
		else if (ne == columnHdrAll_bill_cl_day2) doHdrAll_bill_cl_day2_NE(info);
		else if (ne == columnHdrAll_bill_cl_day3) doHdrAll_bill_cl_day3_NE(info);
		else if (ne == columnHdrAll_bill_cl_day4) doHdrAll_bill_cl_day4_NE(info);
		else if (ne == columnHdrAll_bill_cl_day5) doHdrAll_bill_cl_day5_NE(info);
		else if (ne == columnHdrAll_tax_on_bill_flg) doHdrAll_tax_on_bill_flg_NE(info);
		else if (ne == columnHdrAll_bill_tax_rnd_typ) doHdrAll_bill_tax_rnd_typ_NE(info);
		else if (ne == columnHdrAll_bill_tax_rnd_typ_nm) doHdrAll_bill_tax_rnd_typ_nm_NE(info);
		else if (ne == columnHdrAll_bill_cl_delay_days) doHdrAll_bill_cl_delay_days_NE(info);
		else if (ne == columnHdrAll_bill_cl_ba_typ) doHdrAll_bill_cl_ba_typ_NE(info);
		else if (ne == columnHdrAll_bill_cl_ba_typ_nm) doHdrAll_bill_cl_ba_typ_nm_NE(info);
		else if (ne == columnHdrAll_bill_cal_cd) doHdrAll_bill_cal_cd_NE(info);
		else if (ne == columnHdrAll_bill_cal_nm) doHdrAll_bill_cal_nm_NE(info);
		else if (ne == columnHdrAll_rcv_ba_typ) doHdrAll_rcv_ba_typ_NE(info);
		else if (ne == columnHdrAll_rcv_ba_typ_nm) doHdrAll_rcv_ba_typ_nm_NE(info);
		else if (ne == columnHdrAll_auto_line_appl_flg) doHdrAll_auto_line_appl_flg_NE(info);
		else if (ne == columnHdrAll_sls_interim_cl_flg) doHdrAll_sls_interim_cl_flg_NE(info);
		else if (ne == columnHdrAll_ar_setoff_grp_cd) doHdrAll_ar_setoff_grp_cd_NE(info);
		else if (ne == columnHdrAll_ar_setoff_grp_nm) doHdrAll_ar_setoff_grp_nm_NE(info);
		else if (ne == columnHdrAll_bcst_prnt_typ) doHdrAll_bcst_prnt_typ_NE(info);
		else if (ne == columnHdrAll_bcst_prnt_typ_nm) doHdrAll_bcst_prnt_typ_nm_NE(info);
		else if (ne == columnHdrAll_bill_zip_cd) doHdrAll_bill_zip_cd_NE(info);
		else if (ne == columnHdrAll_bill_addr1) doHdrAll_bill_addr1_NE(info);
		else if (ne == columnHdrAll_bill_addr2) doHdrAll_bill_addr2_NE(info);
		else if (ne == columnHdrAll_bill_addr3) doHdrAll_bill_addr3_NE(info);
		else if (ne == columnHdrAll_bill_addr4) doHdrAll_bill_addr4_NE(info);
		else if (ne == columnHdrAll_bill_tel) doHdrAll_bill_tel_NE(info);
		else if (ne == columnHdrAll_bill_bcst_nm) doHdrAll_bill_bcst_nm_NE(info);
		else if (ne == columnHdrAll_bill_bcst_dpt) doHdrAll_bill_bcst_dpt_NE(info);
		else if (ne == columnHdrAll_bill_bcst_psn) doHdrAll_bill_bcst_psn_NE(info);
		else if (ne == columnHdrAll_bill_bcst_psn_title) doHdrAll_bill_bcst_psn_title_NE(info);
		else if (ne == columnHdrAll_bill_prnt_typ) doHdrAll_bill_prnt_typ_NE(info);
		else if (ne == columnHdrAll_bill_prnt_typ_nm) doHdrAll_bill_prnt_typ_nm_NE(info);
		else if (ne == columnHdrAll_sls_dtl_outp_typ) doHdrAll_sls_dtl_outp_typ_NE(info);
		else if (ne == columnHdrAll_sls_dtl_outp_typ_nm) doHdrAll_sls_dtl_outp_typ_nm_NE(info);
		else if (ne == columnHdrAll_bill_dtl_outp_flg) doHdrAll_bill_dtl_outp_flg_NE(info);
		else if (ne == columnHdrAll_bfw_bal_disp_flg) doHdrAll_bfw_bal_disp_flg_NE(info);
		else if (ne == columnHdrAll_bill_dtl_adv_flg) doHdrAll_bill_dtl_adv_flg_NE(info);
		else if (ne == columnHdrAll_bill_dtl_rcv_flg) doHdrAll_bill_dtl_rcv_flg_NE(info);
		else if (ne == columnHdrAll_bill_dtl_subttl_typ) doHdrAll_bill_dtl_subttl_typ_NE(info);
		else if (ne == columnHdrAll_bill_dtl_subttl_typ_nm) doHdrAll_bill_dtl_subttl_typ_nm_NE(info);
		else if (ne == columnHdrAll_bill_dtl_brk_typ) doHdrAll_bill_dtl_brk_typ_NE(info);
		else if (ne == columnHdrAll_bill_dtl_brk_typ_nm) doHdrAll_bill_dtl_brk_typ_nm_NE(info);
		else if (ne == columnHdrAll_bill_dtl_sort_typ) doHdrAll_bill_dtl_sort_typ_NE(info);
		else if (ne == columnHdrAll_bill_dtl_sort_typ_nm) doHdrAll_bill_dtl_sort_typ_nm_NE(info);
		else if (ne == columnHdrAll_bill_can_slip_typ) doHdrAll_bill_can_slip_typ_NE(info);
		else if (ne == columnHdrAll_bill_can_slip_typ_nm) doHdrAll_bill_can_slip_typ_nm_NE(info);
		else if (ne == columnHdrAll_rcv_auto_appl_tgt_flg) doHdrAll_rcv_auto_appl_tgt_flg_NE(info);
		else if (ne == columnHdrAll_rcv_amt_match_flg) doHdrAll_rcv_amt_match_flg_NE(info);
		else if (ne == columnHdrAll_ar_sttl_typ_match_flg) doHdrAll_ar_sttl_typ_match_flg_NE(info);
		else if (ne == columnHdrAll_calc_com_paid_flg) doHdrAll_calc_com_paid_flg_NE(info);
		else if (ne == columnHdrAll_auto_appl_delay_days) doHdrAll_auto_appl_delay_days_NE(info);
		else if (ne == columnHdrAll_xfr_psn) doHdrAll_xfr_psn_NE(info);
		else if (ne == columnHdrAll_ins_usr_id) doHdrAll_ins_usr_id_NE(info);
		else if (ne == columnHdrAll_ins_usr_nm) doHdrAll_ins_usr_nm_NE(info);
		else if (ne == columnHdrAll_ins_ts) doHdrAll_ins_ts_NE(info);
		else if (ne == columnHdrAll_ins_func_id) doHdrAll_ins_func_id_NE(info);
		else if (ne == columnHdrAll_ins_func_nm) doHdrAll_ins_func_nm_NE(info);
		else if (ne == columnHdrAll_upd_cntr) doHdrAll_upd_cntr_NE(info);
		else if (ne == columnHdrAll_upd_usr_id) doHdrAll_upd_usr_id_NE(info);
		else if (ne == columnHdrAll_upd_usr_nm) doHdrAll_upd_usr_nm_NE(info);
		else if (ne == columnHdrAll_upd_ts) doHdrAll_upd_ts_NE(info);
		else if (ne == columnHdrAll_upd_func_id) doHdrAll_upd_func_id_NE(info);
		else if (ne == columnHdrAll_upd_func_nm) doHdrAll_upd_func_nm_NE(info);
		else if (ne == columnHdrAll_upd_srv_req_no) doHdrAll_upd_srv_req_no_NE(info);
		else if (ne == columnHdrAll_del_usr_id) doHdrAll_del_usr_id_NE(info);
		else if (ne == columnHdrAll_del_usr_nm) doHdrAll_del_usr_nm_NE(info);
		else if (ne == columnHdrAll_del_ts) doHdrAll_del_ts_NE(info);
		else if (ne == columnHdrAll_rcst_prnt_typ) doHdrAll_rcst_prnt_typ_NE(info);
		else if (ne == columnHdrAll_rcst_prnt_typ_nm) doHdrAll_rcst_prnt_typ_nm_NE(info);
	}

	/**
	 * [DtlTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_cred_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_cred_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_cred_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_cred_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[check_bcst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_check_bcst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day4_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day5_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tax_on_bill_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tax_on_bill_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_tax_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_tax_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_delay_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_delay_days_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_ba_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_ba_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_ba_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_ba_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_ba_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_ba_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_ba_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_ba_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_line_appl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_line_appl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_interim_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_interim_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_setoff_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_setoff_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_setoff_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_setoff_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_addr1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_addr2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_addr3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_addr4_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_tel_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_bcst_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_bcst_dpt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_bcst_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_bcst_psn_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_bcst_psn_title]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_bcst_psn_title_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_dtl_outp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_dtl_outp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_dtl_outp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_dtl_outp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_outp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_outp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bfw_bal_disp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bfw_bal_disp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_adv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_adv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_rcv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_rcv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_subttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_subttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_subttl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_subttl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_brk_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_brk_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_brk_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_brk_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_sort_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_sort_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_sort_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_sort_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_can_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_can_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_can_slip_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_can_slip_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_auto_appl_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_auto_appl_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_amt_match_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_amt_match_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_sttl_typ_match_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_sttl_typ_match_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_com_paid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_com_paid_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_appl_delay_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_appl_delay_days_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xfr_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xfr_psn_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Hdr_bill_cl_day1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Hdr_bill_cl_day2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Hdr_bill_cl_day3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Hdr_bill_cl_day4_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Hdr_bill_cl_day5_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bill_cl_day1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bill_cl_day2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bill_cl_day3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bill_cl_day4_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bill_cl_day5_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rate_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[crryovr_mons_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_crryovr_mons_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[crryovr_mons_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_crryovr_mons_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_crryovr_mons1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_day1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_crryovr_mons2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_day2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_crryovr_mons3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_day3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_crryovr_mons4_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_day4_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_crryovr_mons5_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_day5_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Hdr]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Hdr_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Hdr]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Hdr_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[if_proc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_if_proc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[if_proc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_if_proc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[not_onr_prov_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_not_onr_prov_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[rcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_rcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Hdr]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Hdr_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Hdr]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Hdr_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bp_cd_null_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bp_cd_null_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[if_proc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_if_proc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[if_proc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_if_proc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ar_sttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ar_sttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ar_sttl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ar_sttl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bank_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bank_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bank_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bank_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bank_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bank_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_check_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bcst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bcst_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcst_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcst_cd_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ar_cred_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ar_cred_cd_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ar_cred_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ar_cred_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dpt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dpt_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dpt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dpt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bcst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bcst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bcst_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bcst_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[check_bcst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_check_bcst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_day1_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_day2_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_day3_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_day4_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_day5_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[tax_on_bill_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_tax_on_bill_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_tax_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_tax_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_delay_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_delay_days_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_ba_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_ba_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_ba_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_ba_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cal_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cal_cd_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cal_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cal_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcv_ba_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcv_ba_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcv_ba_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcv_ba_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[auto_line_appl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_auto_line_appl_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[sls_interim_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_sls_interim_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ar_setoff_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ar_setoff_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ar_setoff_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ar_setoff_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bcst_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bcst_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bcst_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bcst_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_addr1_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_addr2_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_addr3_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_addr4_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_tel_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_bcst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_bcst_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_bcst_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_bcst_dpt_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_bcst_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_bcst_psn_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_bcst_psn_title]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_bcst_psn_title_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[sls_dtl_outp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_sls_dtl_outp_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[sls_dtl_outp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_sls_dtl_outp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_outp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_outp_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bfw_bal_disp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bfw_bal_disp_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_adv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_adv_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_rcv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_rcv_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_subttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_subttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_subttl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_subttl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_brk_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_brk_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_brk_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_brk_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_sort_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_sort_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_sort_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_sort_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_can_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_can_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_can_slip_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_can_slip_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcv_auto_appl_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcv_auto_appl_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcv_amt_match_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcv_amt_match_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ar_sttl_typ_match_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ar_sttl_typ_match_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[calc_com_paid_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_calc_com_paid_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[auto_appl_delay_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_auto_appl_delay_days_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[xfr_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_xfr_psn_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcst_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcst_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcst_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcst_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DtlTabTab) doDtlTab_NX(info);
		else if (nx == Wrk4DtlTable) doWrk4Dtl_NX(info);
		else if (nx == Wrk7DtlTable) doWrk7Dtl_NX(info);
		else if (nx == Wrk5DtlTable) doWrk5Dtl_NX(info);
		else if (nx == Wrk6DtlTable) doWrk6Dtl_NX(info);
		else if (nx == HdrAllTable) doHdrAll_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_bp_cd) doCnd_bp_cd_NX(info);
		else if (nx == Cnd_bp_nm) doCnd_bp_nm_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == Hdr_bp_cd) doHdr_bp_cd_NX(info);
		else if (nx == Hdr_bp_nm) doHdr_bp_nm_NX(info);
		else if (nx == Hdr_bcst_flg) doHdr_bcst_flg_NX(info);
		else if (nx == Hdr_rcst_flg) doHdr_rcst_flg_NX(info);
		else if (nx == Hdr_rcst_cd) doHdr_rcst_cd_NX(info);
		else if (nx == Hdr_rcst_nm) doHdr_rcst_nm_NX(info);
		else if (nx == Hdr_ar_cred_cd) doHdr_ar_cred_cd_NX(info);
		else if (nx == Hdr_ar_cred_nm) doHdr_ar_cred_nm_NX(info);
		else if (nx == Hdr_bill_dpt_typ) doHdr_bill_dpt_typ_NX(info);
		else if (nx == Hdr_bill_dpt_typ_nm) doHdr_bill_dpt_typ_nm_NX(info);
		else if (nx == Hdr_bcst_dpt_cd) doHdr_bcst_dpt_cd_NX(info);
		else if (nx == Hdr_bcst_dpt_nm) doHdr_bcst_dpt_nm_NX(info);
		else if (nx == Hdr_check_bcst_dpt_cd) doHdr_check_bcst_dpt_cd_NX(info);
		else if (nx == Hdr_bill_cl_typ) doHdr_bill_cl_typ_NX(info);
		else if (nx == Hdr_bill_cl_typ_nm) doHdr_bill_cl_typ_nm_NX(info);
		else if (nx == Hdr_bill_cl_day1) doHdr_bill_cl_day1_NX(info);
		else if (nx == Hdr_bill_cl_day2) doHdr_bill_cl_day2_NX(info);
		else if (nx == Hdr_bill_cl_day3) doHdr_bill_cl_day3_NX(info);
		else if (nx == Hdr_bill_cl_day4) doHdr_bill_cl_day4_NX(info);
		else if (nx == Hdr_bill_cl_day5) doHdr_bill_cl_day5_NX(info);
		else if (nx == Hdr_tax_on_bill_flg) doHdr_tax_on_bill_flg_NX(info);
		else if (nx == Hdr_bill_tax_rnd_typ) doHdr_bill_tax_rnd_typ_NX(info);
		else if (nx == Hdr_bill_tax_rnd_typ_nm) doHdr_bill_tax_rnd_typ_nm_NX(info);
		else if (nx == Hdr_bill_cl_delay_days) doHdr_bill_cl_delay_days_NX(info);
		else if (nx == Hdr_bill_cl_ba_typ) doHdr_bill_cl_ba_typ_NX(info);
		else if (nx == Hdr_bill_cl_ba_typ_nm) doHdr_bill_cl_ba_typ_nm_NX(info);
		else if (nx == Hdr_bill_cal_cd) doHdr_bill_cal_cd_NX(info);
		else if (nx == Hdr_bill_cal_nm) doHdr_bill_cal_nm_NX(info);
		else if (nx == Hdr_rcv_ba_typ) doHdr_rcv_ba_typ_NX(info);
		else if (nx == Hdr_rcv_ba_typ_nm) doHdr_rcv_ba_typ_nm_NX(info);
		else if (nx == Hdr_auto_line_appl_flg) doHdr_auto_line_appl_flg_NX(info);
		else if (nx == Hdr_sls_interim_cl_flg) doHdr_sls_interim_cl_flg_NX(info);
		else if (nx == Hdr_ar_setoff_grp_cd) doHdr_ar_setoff_grp_cd_NX(info);
		else if (nx == Hdr_ar_setoff_grp_nm) doHdr_ar_setoff_grp_nm_NX(info);
		else if (nx == Hdr_bcst_prnt_typ) doHdr_bcst_prnt_typ_NX(info);
		else if (nx == Hdr_bcst_prnt_typ_nm) doHdr_bcst_prnt_typ_nm_NX(info);
		else if (nx == Hdr_bill_zip_cd) doHdr_bill_zip_cd_NX(info);
		else if (nx == Hdr_bill_addr1) doHdr_bill_addr1_NX(info);
		else if (nx == Hdr_bill_addr2) doHdr_bill_addr2_NX(info);
		else if (nx == Hdr_bill_addr3) doHdr_bill_addr3_NX(info);
		else if (nx == Hdr_bill_addr4) doHdr_bill_addr4_NX(info);
		else if (nx == Hdr_bill_tel) doHdr_bill_tel_NX(info);
		else if (nx == Hdr_bill_bcst_nm) doHdr_bill_bcst_nm_NX(info);
		else if (nx == Hdr_bill_bcst_dpt) doHdr_bill_bcst_dpt_NX(info);
		else if (nx == Hdr_bill_bcst_psn) doHdr_bill_bcst_psn_NX(info);
		else if (nx == Hdr_bill_bcst_psn_title) doHdr_bill_bcst_psn_title_NX(info);
		else if (nx == Hdr_bill_prnt_typ) doHdr_bill_prnt_typ_NX(info);
		else if (nx == Hdr_bill_prnt_typ_nm) doHdr_bill_prnt_typ_nm_NX(info);
		else if (nx == Hdr_sls_dtl_outp_typ) doHdr_sls_dtl_outp_typ_NX(info);
		else if (nx == Hdr_sls_dtl_outp_typ_nm) doHdr_sls_dtl_outp_typ_nm_NX(info);
		else if (nx == Hdr_bill_dtl_outp_flg) doHdr_bill_dtl_outp_flg_NX(info);
		else if (nx == Hdr_bfw_bal_disp_flg) doHdr_bfw_bal_disp_flg_NX(info);
		else if (nx == Hdr_bill_dtl_adv_flg) doHdr_bill_dtl_adv_flg_NX(info);
		else if (nx == Hdr_bill_dtl_rcv_flg) doHdr_bill_dtl_rcv_flg_NX(info);
		else if (nx == Hdr_bill_dtl_subttl_typ) doHdr_bill_dtl_subttl_typ_NX(info);
		else if (nx == Hdr_bill_dtl_subttl_typ_nm) doHdr_bill_dtl_subttl_typ_nm_NX(info);
		else if (nx == Hdr_bill_dtl_brk_typ) doHdr_bill_dtl_brk_typ_NX(info);
		else if (nx == Hdr_bill_dtl_brk_typ_nm) doHdr_bill_dtl_brk_typ_nm_NX(info);
		else if (nx == Hdr_bill_dtl_sort_typ) doHdr_bill_dtl_sort_typ_NX(info);
		else if (nx == Hdr_bill_dtl_sort_typ_nm) doHdr_bill_dtl_sort_typ_nm_NX(info);
		else if (nx == Hdr_bill_can_slip_typ) doHdr_bill_can_slip_typ_NX(info);
		else if (nx == Hdr_bill_can_slip_typ_nm) doHdr_bill_can_slip_typ_nm_NX(info);
		else if (nx == Hdr_rcv_auto_appl_tgt_flg) doHdr_rcv_auto_appl_tgt_flg_NX(info);
		else if (nx == Hdr_rcv_amt_match_flg) doHdr_rcv_amt_match_flg_NX(info);
		else if (nx == Hdr_ar_sttl_typ_match_flg) doHdr_ar_sttl_typ_match_flg_NX(info);
		else if (nx == Hdr_calc_com_paid_flg) doHdr_calc_com_paid_flg_NX(info);
		else if (nx == Hdr_auto_appl_delay_days) doHdr_auto_appl_delay_days_NX(info);
		else if (nx == Hdr_xfr_psn) doHdr_xfr_psn_NX(info);
		else if (nx == Hdr_rcst_prnt_typ) doHdr_rcst_prnt_typ_NX(info);
		else if (nx == Hdr_rcst_prnt_typ_nm) doHdr_rcst_prnt_typ_nm_NX(info);
		else if (nx == Wrk4Hdr_bill_cl_day1) doWrk4Hdr_bill_cl_day1_NX(info);
		else if (nx == Wrk4Hdr_bill_cl_day2) doWrk4Hdr_bill_cl_day2_NX(info);
		else if (nx == Wrk4Hdr_bill_cl_day3) doWrk4Hdr_bill_cl_day3_NX(info);
		else if (nx == Wrk4Hdr_bill_cl_day4) doWrk4Hdr_bill_cl_day4_NX(info);
		else if (nx == Wrk4Hdr_bill_cl_day5) doWrk4Hdr_bill_cl_day5_NX(info);
		else if (nx == columnWrk4Dtl_check) doWrk4Dtl_check_NX(info);
		else if (nx == columnWrk4Dtl_del_flg) doWrk4Dtl_del_flg_NX(info);
		else if (nx == columnWrk4Dtl_bcst_cd) doWrk4Dtl_bcst_cd_NX(info);
		else if (nx == columnWrk4Dtl_bill_cl_day1) doWrk4Dtl_bill_cl_day1_NX(info);
		else if (nx == columnWrk4Dtl_bill_cl_day2) doWrk4Dtl_bill_cl_day2_NX(info);
		else if (nx == columnWrk4Dtl_bill_cl_day3) doWrk4Dtl_bill_cl_day3_NX(info);
		else if (nx == columnWrk4Dtl_bill_cl_day4) doWrk4Dtl_bill_cl_day4_NX(info);
		else if (nx == columnWrk4Dtl_bill_cl_day5) doWrk4Dtl_bill_cl_day5_NX(info);
		else if (nx == columnWrk4Dtl_cur_cd) doWrk4Dtl_cur_cd_NX(info);
		else if (nx == columnWrk4Dtl_cur_nm) doWrk4Dtl_cur_nm_NX(info);
		else if (nx == columnWrk4Dtl_amt_dec_place) doWrk4Dtl_amt_dec_place_NX(info);
		else if (nx == columnWrk4Dtl_sttl_cd) doWrk4Dtl_sttl_cd_NX(info);
		else if (nx == columnWrk4Dtl_sttl_nm) doWrk4Dtl_sttl_nm_NX(info);
		else if (nx == columnWrk4Dtl_wg_cd) doWrk4Dtl_wg_cd_NX(info);
		else if (nx == columnWrk4Dtl_wg_nm) doWrk4Dtl_wg_nm_NX(info);
		else if (nx == columnWrk4Dtl_rate) doWrk4Dtl_rate_NX(info);
		else if (nx == columnWrk4Dtl_crryovr_mons_typ) doWrk4Dtl_crryovr_mons_typ_NX(info);
		else if (nx == columnWrk4Dtl_crryovr_mons_typ_nm) doWrk4Dtl_crryovr_mons_typ_nm_NX(info);
		else if (nx == columnWrk4Dtl_rcv_crryovr_mons1) doWrk4Dtl_rcv_crryovr_mons1_NX(info);
		else if (nx == columnWrk4Dtl_rcv_day1) doWrk4Dtl_rcv_day1_NX(info);
		else if (nx == columnWrk4Dtl_rcv_crryovr_mons2) doWrk4Dtl_rcv_crryovr_mons2_NX(info);
		else if (nx == columnWrk4Dtl_rcv_day2) doWrk4Dtl_rcv_day2_NX(info);
		else if (nx == columnWrk4Dtl_rcv_crryovr_mons3) doWrk4Dtl_rcv_crryovr_mons3_NX(info);
		else if (nx == columnWrk4Dtl_rcv_day3) doWrk4Dtl_rcv_day3_NX(info);
		else if (nx == columnWrk4Dtl_rcv_crryovr_mons4) doWrk4Dtl_rcv_crryovr_mons4_NX(info);
		else if (nx == columnWrk4Dtl_rcv_day4) doWrk4Dtl_rcv_day4_NX(info);
		else if (nx == columnWrk4Dtl_rcv_crryovr_mons5) doWrk4Dtl_rcv_crryovr_mons5_NX(info);
		else if (nx == columnWrk4Dtl_rcv_day5) doWrk4Dtl_rcv_day5_NX(info);
		else if (nx == columnWrk4Dtl_memo1) doWrk4Dtl_memo1_NX(info);
		else if (nx == columnWrk4Dtl_memo2) doWrk4Dtl_memo2_NX(info);
		else if (nx == columnWrk4Dtl_memo3) doWrk4Dtl_memo3_NX(info);
		else if (nx == columnWrk4Dtl_ins_usr_id) doWrk4Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk4Dtl_ins_usr_nm) doWrk4Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk4Dtl_ins_ts) doWrk4Dtl_ins_ts_NX(info);
		else if (nx == columnWrk4Dtl_ins_func_id) doWrk4Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk4Dtl_ins_func_nm) doWrk4Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk4Dtl_upd_cntr) doWrk4Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk4Dtl_upd_usr_id) doWrk4Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk4Dtl_upd_usr_nm) doWrk4Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk4Dtl_upd_ts) doWrk4Dtl_upd_ts_NX(info);
		else if (nx == columnWrk4Dtl_upd_func_id) doWrk4Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk4Dtl_upd_func_nm) doWrk4Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk4Dtl_upd_srv_req_no) doWrk4Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk4Dtl_del_usr_id) doWrk4Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk4Dtl_del_usr_nm) doWrk4Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk4Dtl_del_ts) doWrk4Dtl_del_ts_NX(info);
		else if (nx == Wrk7Hdr_st_dt) doWrk7Hdr_st_dt_NX(info);
		else if (nx == Wrk7Hdr_end_dt) doWrk7Hdr_end_dt_NX(info);
		else if (nx == columnWrk7Dtl_check) doWrk7Dtl_check_NX(info);
		else if (nx == columnWrk7Dtl_del_flg) doWrk7Dtl_del_flg_NX(info);
		else if (nx == columnWrk7Dtl_bp_cd) doWrk7Dtl_bp_cd_NX(info);
		else if (nx == columnWrk7Dtl_if_proc_typ) doWrk7Dtl_if_proc_typ_NX(info);
		else if (nx == columnWrk7Dtl_if_proc_typ_nm) doWrk7Dtl_if_proc_typ_nm_NX(info);
		else if (nx == columnWrk7Dtl_not_onr_prov_flg) doWrk7Dtl_not_onr_prov_flg_NX(info);
		else if (nx == columnWrk7Dtl_ext_sys_cd) doWrk7Dtl_ext_sys_cd_NX(info);
		else if (nx == columnWrk7Dtl_ext_sys_nm) doWrk7Dtl_ext_sys_nm_NX(info);
		else if (nx == columnWrk7Dtl_memo1) doWrk7Dtl_memo1_NX(info);
		else if (nx == columnWrk7Dtl_memo2) doWrk7Dtl_memo2_NX(info);
		else if (nx == columnWrk7Dtl_memo3) doWrk7Dtl_memo3_NX(info);
		else if (nx == columnWrk7Dtl_ins_usr_id) doWrk7Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk7Dtl_ins_usr_nm) doWrk7Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk7Dtl_ins_ts) doWrk7Dtl_ins_ts_NX(info);
		else if (nx == columnWrk7Dtl_ins_func_id) doWrk7Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk7Dtl_ins_func_nm) doWrk7Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk7Dtl_upd_cntr) doWrk7Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk7Dtl_upd_usr_id) doWrk7Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk7Dtl_upd_usr_nm) doWrk7Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk7Dtl_upd_ts) doWrk7Dtl_upd_ts_NX(info);
		else if (nx == columnWrk7Dtl_upd_func_id) doWrk7Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk7Dtl_upd_func_nm) doWrk7Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk7Dtl_upd_srv_req_no) doWrk7Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk7Dtl_del_usr_id) doWrk7Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk7Dtl_del_usr_nm) doWrk7Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk7Dtl_del_ts) doWrk7Dtl_del_ts_NX(info);
		else if (nx == columnWrk5Dtl_check) doWrk5Dtl_check_NX(info);
		else if (nx == columnWrk5Dtl_del_flg) doWrk5Dtl_del_flg_NX(info);
		else if (nx == columnWrk5Dtl_rcst_cd) doWrk5Dtl_rcst_cd_NX(info);
		else if (nx == columnWrk5Dtl_cur_cd) doWrk5Dtl_cur_cd_NX(info);
		else if (nx == columnWrk5Dtl_cur_nm) doWrk5Dtl_cur_nm_NX(info);
		else if (nx == columnWrk5Dtl_amt_dec_place) doWrk5Dtl_amt_dec_place_NX(info);
		else if (nx == columnWrk5Dtl_memo1) doWrk5Dtl_memo1_NX(info);
		else if (nx == columnWrk5Dtl_memo2) doWrk5Dtl_memo2_NX(info);
		else if (nx == columnWrk5Dtl_memo3) doWrk5Dtl_memo3_NX(info);
		else if (nx == columnWrk5Dtl_ins_usr_id) doWrk5Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk5Dtl_ins_usr_nm) doWrk5Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk5Dtl_ins_ts) doWrk5Dtl_ins_ts_NX(info);
		else if (nx == columnWrk5Dtl_ins_func_id) doWrk5Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk5Dtl_ins_func_nm) doWrk5Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk5Dtl_upd_cntr) doWrk5Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk5Dtl_upd_usr_id) doWrk5Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk5Dtl_upd_usr_nm) doWrk5Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk5Dtl_upd_ts) doWrk5Dtl_upd_ts_NX(info);
		else if (nx == columnWrk5Dtl_upd_func_id) doWrk5Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk5Dtl_upd_func_nm) doWrk5Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk5Dtl_upd_srv_req_no) doWrk5Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk5Dtl_del_usr_id) doWrk5Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk5Dtl_del_usr_nm) doWrk5Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk5Dtl_del_ts) doWrk5Dtl_del_ts_NX(info);
		else if (nx == Wrk6Hdr_st_dt) doWrk6Hdr_st_dt_NX(info);
		else if (nx == Wrk6Hdr_end_dt) doWrk6Hdr_end_dt_NX(info);
		else if (nx == columnWrk6Dtl_check) doWrk6Dtl_check_NX(info);
		else if (nx == columnWrk6Dtl_del_flg) doWrk6Dtl_del_flg_NX(info);
		else if (nx == columnWrk6Dtl_bp_cd) doWrk6Dtl_bp_cd_NX(info);
		else if (nx == columnWrk6Dtl_bp_cd_null_flg) doWrk6Dtl_bp_cd_null_flg_NX(info);
		else if (nx == columnWrk6Dtl_if_proc_typ) doWrk6Dtl_if_proc_typ_NX(info);
		else if (nx == columnWrk6Dtl_if_proc_typ_nm) doWrk6Dtl_if_proc_typ_nm_NX(info);
		else if (nx == columnWrk6Dtl_ar_sttl_typ) doWrk6Dtl_ar_sttl_typ_NX(info);
		else if (nx == columnWrk6Dtl_ar_sttl_typ_nm) doWrk6Dtl_ar_sttl_typ_nm_NX(info);
		else if (nx == columnWrk6Dtl_bank_cd) doWrk6Dtl_bank_cd_NX(info);
		else if (nx == columnWrk6Dtl_bank_nm) doWrk6Dtl_bank_nm_NX(info);
		else if (nx == columnWrk6Dtl_bank_ac_cd) doWrk6Dtl_bank_ac_cd_NX(info);
		else if (nx == columnWrk6Dtl_bank_ac_nm) doWrk6Dtl_bank_ac_nm_NX(info);
		else if (nx == columnWrk6Dtl_memo1) doWrk6Dtl_memo1_NX(info);
		else if (nx == columnWrk6Dtl_memo2) doWrk6Dtl_memo2_NX(info);
		else if (nx == columnWrk6Dtl_memo3) doWrk6Dtl_memo3_NX(info);
		else if (nx == columnWrk6Dtl_ins_usr_id) doWrk6Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk6Dtl_ins_usr_nm) doWrk6Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk6Dtl_ins_ts) doWrk6Dtl_ins_ts_NX(info);
		else if (nx == columnWrk6Dtl_ins_func_id) doWrk6Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk6Dtl_ins_func_nm) doWrk6Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk6Dtl_upd_cntr) doWrk6Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk6Dtl_upd_usr_id) doWrk6Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk6Dtl_upd_usr_nm) doWrk6Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk6Dtl_upd_ts) doWrk6Dtl_upd_ts_NX(info);
		else if (nx == columnWrk6Dtl_upd_func_id) doWrk6Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk6Dtl_upd_func_nm) doWrk6Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk6Dtl_upd_srv_req_no) doWrk6Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk6Dtl_del_usr_id) doWrk6Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk6Dtl_del_usr_nm) doWrk6Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk6Dtl_del_ts) doWrk6Dtl_del_ts_NX(info);
		else if (nx == columnHdrAll_check) doHdrAll_check_NX(info);
		else if (nx == columnHdrAll_bp_cd) doHdrAll_bp_cd_NX(info);
		else if (nx == columnHdrAll_bp_nm) doHdrAll_bp_nm_NX(info);
		else if (nx == columnHdrAll_bcst_flg) doHdrAll_bcst_flg_NX(info);
		else if (nx == columnHdrAll_rcst_flg) doHdrAll_rcst_flg_NX(info);
		else if (nx == columnHdrAll_rcst_cd) doHdrAll_rcst_cd_NX(info);
		else if (nx == columnHdrAll_rcst_nm) doHdrAll_rcst_nm_NX(info);
		else if (nx == columnHdrAll_ar_cred_cd) doHdrAll_ar_cred_cd_NX(info);
		else if (nx == columnHdrAll_ar_cred_nm) doHdrAll_ar_cred_nm_NX(info);
		else if (nx == columnHdrAll_bill_dpt_typ) doHdrAll_bill_dpt_typ_NX(info);
		else if (nx == columnHdrAll_bill_dpt_typ_nm) doHdrAll_bill_dpt_typ_nm_NX(info);
		else if (nx == columnHdrAll_bcst_dpt_cd) doHdrAll_bcst_dpt_cd_NX(info);
		else if (nx == columnHdrAll_bcst_dpt_nm) doHdrAll_bcst_dpt_nm_NX(info);
		else if (nx == columnHdrAll_check_bcst_dpt_cd) doHdrAll_check_bcst_dpt_cd_NX(info);
		else if (nx == columnHdrAll_bill_cl_typ) doHdrAll_bill_cl_typ_NX(info);
		else if (nx == columnHdrAll_bill_cl_typ_nm) doHdrAll_bill_cl_typ_nm_NX(info);
		else if (nx == columnHdrAll_bill_cl_day1) doHdrAll_bill_cl_day1_NX(info);
		else if (nx == columnHdrAll_bill_cl_day2) doHdrAll_bill_cl_day2_NX(info);
		else if (nx == columnHdrAll_bill_cl_day3) doHdrAll_bill_cl_day3_NX(info);
		else if (nx == columnHdrAll_bill_cl_day4) doHdrAll_bill_cl_day4_NX(info);
		else if (nx == columnHdrAll_bill_cl_day5) doHdrAll_bill_cl_day5_NX(info);
		else if (nx == columnHdrAll_tax_on_bill_flg) doHdrAll_tax_on_bill_flg_NX(info);
		else if (nx == columnHdrAll_bill_tax_rnd_typ) doHdrAll_bill_tax_rnd_typ_NX(info);
		else if (nx == columnHdrAll_bill_tax_rnd_typ_nm) doHdrAll_bill_tax_rnd_typ_nm_NX(info);
		else if (nx == columnHdrAll_bill_cl_delay_days) doHdrAll_bill_cl_delay_days_NX(info);
		else if (nx == columnHdrAll_bill_cl_ba_typ) doHdrAll_bill_cl_ba_typ_NX(info);
		else if (nx == columnHdrAll_bill_cl_ba_typ_nm) doHdrAll_bill_cl_ba_typ_nm_NX(info);
		else if (nx == columnHdrAll_bill_cal_cd) doHdrAll_bill_cal_cd_NX(info);
		else if (nx == columnHdrAll_bill_cal_nm) doHdrAll_bill_cal_nm_NX(info);
		else if (nx == columnHdrAll_rcv_ba_typ) doHdrAll_rcv_ba_typ_NX(info);
		else if (nx == columnHdrAll_rcv_ba_typ_nm) doHdrAll_rcv_ba_typ_nm_NX(info);
		else if (nx == columnHdrAll_auto_line_appl_flg) doHdrAll_auto_line_appl_flg_NX(info);
		else if (nx == columnHdrAll_sls_interim_cl_flg) doHdrAll_sls_interim_cl_flg_NX(info);
		else if (nx == columnHdrAll_ar_setoff_grp_cd) doHdrAll_ar_setoff_grp_cd_NX(info);
		else if (nx == columnHdrAll_ar_setoff_grp_nm) doHdrAll_ar_setoff_grp_nm_NX(info);
		else if (nx == columnHdrAll_bcst_prnt_typ) doHdrAll_bcst_prnt_typ_NX(info);
		else if (nx == columnHdrAll_bcst_prnt_typ_nm) doHdrAll_bcst_prnt_typ_nm_NX(info);
		else if (nx == columnHdrAll_bill_zip_cd) doHdrAll_bill_zip_cd_NX(info);
		else if (nx == columnHdrAll_bill_addr1) doHdrAll_bill_addr1_NX(info);
		else if (nx == columnHdrAll_bill_addr2) doHdrAll_bill_addr2_NX(info);
		else if (nx == columnHdrAll_bill_addr3) doHdrAll_bill_addr3_NX(info);
		else if (nx == columnHdrAll_bill_addr4) doHdrAll_bill_addr4_NX(info);
		else if (nx == columnHdrAll_bill_tel) doHdrAll_bill_tel_NX(info);
		else if (nx == columnHdrAll_bill_bcst_nm) doHdrAll_bill_bcst_nm_NX(info);
		else if (nx == columnHdrAll_bill_bcst_dpt) doHdrAll_bill_bcst_dpt_NX(info);
		else if (nx == columnHdrAll_bill_bcst_psn) doHdrAll_bill_bcst_psn_NX(info);
		else if (nx == columnHdrAll_bill_bcst_psn_title) doHdrAll_bill_bcst_psn_title_NX(info);
		else if (nx == columnHdrAll_bill_prnt_typ) doHdrAll_bill_prnt_typ_NX(info);
		else if (nx == columnHdrAll_bill_prnt_typ_nm) doHdrAll_bill_prnt_typ_nm_NX(info);
		else if (nx == columnHdrAll_sls_dtl_outp_typ) doHdrAll_sls_dtl_outp_typ_NX(info);
		else if (nx == columnHdrAll_sls_dtl_outp_typ_nm) doHdrAll_sls_dtl_outp_typ_nm_NX(info);
		else if (nx == columnHdrAll_bill_dtl_outp_flg) doHdrAll_bill_dtl_outp_flg_NX(info);
		else if (nx == columnHdrAll_bfw_bal_disp_flg) doHdrAll_bfw_bal_disp_flg_NX(info);
		else if (nx == columnHdrAll_bill_dtl_adv_flg) doHdrAll_bill_dtl_adv_flg_NX(info);
		else if (nx == columnHdrAll_bill_dtl_rcv_flg) doHdrAll_bill_dtl_rcv_flg_NX(info);
		else if (nx == columnHdrAll_bill_dtl_subttl_typ) doHdrAll_bill_dtl_subttl_typ_NX(info);
		else if (nx == columnHdrAll_bill_dtl_subttl_typ_nm) doHdrAll_bill_dtl_subttl_typ_nm_NX(info);
		else if (nx == columnHdrAll_bill_dtl_brk_typ) doHdrAll_bill_dtl_brk_typ_NX(info);
		else if (nx == columnHdrAll_bill_dtl_brk_typ_nm) doHdrAll_bill_dtl_brk_typ_nm_NX(info);
		else if (nx == columnHdrAll_bill_dtl_sort_typ) doHdrAll_bill_dtl_sort_typ_NX(info);
		else if (nx == columnHdrAll_bill_dtl_sort_typ_nm) doHdrAll_bill_dtl_sort_typ_nm_NX(info);
		else if (nx == columnHdrAll_bill_can_slip_typ) doHdrAll_bill_can_slip_typ_NX(info);
		else if (nx == columnHdrAll_bill_can_slip_typ_nm) doHdrAll_bill_can_slip_typ_nm_NX(info);
		else if (nx == columnHdrAll_rcv_auto_appl_tgt_flg) doHdrAll_rcv_auto_appl_tgt_flg_NX(info);
		else if (nx == columnHdrAll_rcv_amt_match_flg) doHdrAll_rcv_amt_match_flg_NX(info);
		else if (nx == columnHdrAll_ar_sttl_typ_match_flg) doHdrAll_ar_sttl_typ_match_flg_NX(info);
		else if (nx == columnHdrAll_calc_com_paid_flg) doHdrAll_calc_com_paid_flg_NX(info);
		else if (nx == columnHdrAll_auto_appl_delay_days) doHdrAll_auto_appl_delay_days_NX(info);
		else if (nx == columnHdrAll_xfr_psn) doHdrAll_xfr_psn_NX(info);
		else if (nx == columnHdrAll_ins_usr_id) doHdrAll_ins_usr_id_NX(info);
		else if (nx == columnHdrAll_ins_usr_nm) doHdrAll_ins_usr_nm_NX(info);
		else if (nx == columnHdrAll_ins_ts) doHdrAll_ins_ts_NX(info);
		else if (nx == columnHdrAll_ins_func_id) doHdrAll_ins_func_id_NX(info);
		else if (nx == columnHdrAll_ins_func_nm) doHdrAll_ins_func_nm_NX(info);
		else if (nx == columnHdrAll_upd_cntr) doHdrAll_upd_cntr_NX(info);
		else if (nx == columnHdrAll_upd_usr_id) doHdrAll_upd_usr_id_NX(info);
		else if (nx == columnHdrAll_upd_usr_nm) doHdrAll_upd_usr_nm_NX(info);
		else if (nx == columnHdrAll_upd_ts) doHdrAll_upd_ts_NX(info);
		else if (nx == columnHdrAll_upd_func_id) doHdrAll_upd_func_id_NX(info);
		else if (nx == columnHdrAll_upd_func_nm) doHdrAll_upd_func_nm_NX(info);
		else if (nx == columnHdrAll_upd_srv_req_no) doHdrAll_upd_srv_req_no_NX(info);
		else if (nx == columnHdrAll_del_usr_id) doHdrAll_del_usr_id_NX(info);
		else if (nx == columnHdrAll_del_usr_nm) doHdrAll_del_usr_nm_NX(info);
		else if (nx == columnHdrAll_del_ts) doHdrAll_del_ts_NX(info);
		else if (nx == columnHdrAll_rcst_prnt_typ) doHdrAll_rcst_prnt_typ_NX(info);
		else if (nx == columnHdrAll_rcst_prnt_typ_nm) doHdrAll_rcst_prnt_typ_nm_NX(info);
	}

	/**
	 * [DtlTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_cred_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_cred_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_cred_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_cred_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[check_bcst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_check_bcst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day4_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day5_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tax_on_bill_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tax_on_bill_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_tax_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_tax_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_delay_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_delay_days_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_ba_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_ba_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_ba_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_ba_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_ba_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_ba_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_ba_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_ba_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_line_appl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_line_appl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_interim_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_interim_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_setoff_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_setoff_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_setoff_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_setoff_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_addr1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_addr2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_addr3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_addr4_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_tel_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_bcst_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_bcst_dpt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_bcst_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_bcst_psn_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_bcst_psn_title]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_bcst_psn_title_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_dtl_outp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_dtl_outp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_dtl_outp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_dtl_outp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_outp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_outp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bfw_bal_disp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bfw_bal_disp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_adv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_adv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_rcv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_rcv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_subttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_subttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_subttl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_subttl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_brk_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_brk_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_brk_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_brk_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_sort_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_sort_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_sort_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_sort_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_can_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_can_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_can_slip_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_can_slip_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_auto_appl_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_auto_appl_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_amt_match_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_amt_match_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_sttl_typ_match_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_sttl_typ_match_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[calc_com_paid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_calc_com_paid_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_appl_delay_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_appl_delay_days_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xfr_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xfr_psn_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Hdr_bill_cl_day1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Hdr_bill_cl_day2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Hdr_bill_cl_day3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Hdr_bill_cl_day4_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Hdr_bill_cl_day5_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bill_cl_day1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bill_cl_day2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bill_cl_day3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bill_cl_day4_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bill_cl_day5_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rate_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[crryovr_mons_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_crryovr_mons_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[crryovr_mons_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_crryovr_mons_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_crryovr_mons1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_day1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_crryovr_mons2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_day2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_crryovr_mons3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_day3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_crryovr_mons4_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_day4_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_crryovr_mons5_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_day5_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Hdr]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Hdr_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Hdr]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Hdr_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[if_proc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_if_proc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[if_proc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_if_proc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[not_onr_prov_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_not_onr_prov_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[rcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_rcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Hdr]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Hdr_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Hdr]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Hdr_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bp_cd_null_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bp_cd_null_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[if_proc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_if_proc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[if_proc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_if_proc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ar_sttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ar_sttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ar_sttl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ar_sttl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bank_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bank_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bank_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bank_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bank_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bank_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_check_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bcst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bcst_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcst_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcst_cd_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ar_cred_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ar_cred_cd_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ar_cred_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ar_cred_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dpt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dpt_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dpt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dpt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bcst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bcst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bcst_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bcst_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[check_bcst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_check_bcst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_day1_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_day2_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_day3_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_day4_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_day5_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[tax_on_bill_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_tax_on_bill_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_tax_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_tax_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_delay_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_delay_days_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_ba_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_ba_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_ba_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_ba_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cal_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cal_cd_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cal_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cal_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcv_ba_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcv_ba_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcv_ba_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcv_ba_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[auto_line_appl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_auto_line_appl_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[sls_interim_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_sls_interim_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ar_setoff_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ar_setoff_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ar_setoff_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ar_setoff_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bcst_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bcst_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bcst_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bcst_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_addr1_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_addr2_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_addr3_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_addr4_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_tel_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_bcst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_bcst_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_bcst_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_bcst_dpt_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_bcst_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_bcst_psn_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_bcst_psn_title]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_bcst_psn_title_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[sls_dtl_outp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_sls_dtl_outp_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[sls_dtl_outp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_sls_dtl_outp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_outp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_outp_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bfw_bal_disp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bfw_bal_disp_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_adv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_adv_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_rcv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_rcv_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_subttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_subttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_subttl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_subttl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_brk_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_brk_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_brk_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_brk_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_sort_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_sort_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_sort_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_sort_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_can_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_can_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_can_slip_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_can_slip_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcv_auto_appl_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcv_auto_appl_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcv_amt_match_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcv_amt_match_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ar_sttl_typ_match_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ar_sttl_typ_match_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[calc_com_paid_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_calc_com_paid_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[auto_appl_delay_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_auto_appl_delay_days_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[xfr_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_xfr_psn_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcst_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcst_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcst_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcst_prnt_typ_nm_NX(MCEventInfo info){
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
		else if (lc == Hdr_bp_cd) doHdr_bp_cd_LC(info);
		else if (lc == Hdr_bp_nm) doHdr_bp_nm_LC(info);
		else if (lc == Hdr_rcst_cd) doHdr_rcst_cd_LC(info);
		else if (lc == Hdr_rcst_nm) doHdr_rcst_nm_LC(info);
		else if (lc == Hdr_ar_cred_cd) doHdr_ar_cred_cd_LC(info);
		else if (lc == Hdr_ar_cred_nm) doHdr_ar_cred_nm_LC(info);
		else if (lc == Hdr_bill_dpt_typ) doHdr_bill_dpt_typ_LC(info);
		else if (lc == Hdr_bill_dpt_typ_nm) doHdr_bill_dpt_typ_nm_LC(info);
		else if (lc == Hdr_bcst_dpt_cd) doHdr_bcst_dpt_cd_LC(info);
		else if (lc == Hdr_bcst_dpt_nm) doHdr_bcst_dpt_nm_LC(info);
		else if (lc == Hdr_check_bcst_dpt_cd) doHdr_check_bcst_dpt_cd_LC(info);
		else if (lc == Hdr_bill_cl_typ) doHdr_bill_cl_typ_LC(info);
		else if (lc == Hdr_bill_cl_typ_nm) doHdr_bill_cl_typ_nm_LC(info);
		else if (lc == Hdr_bill_cl_day1) doHdr_bill_cl_day1_LC(info);
		else if (lc == Hdr_bill_cl_day2) doHdr_bill_cl_day2_LC(info);
		else if (lc == Hdr_bill_cl_day3) doHdr_bill_cl_day3_LC(info);
		else if (lc == Hdr_bill_cl_day4) doHdr_bill_cl_day4_LC(info);
		else if (lc == Hdr_bill_cl_day5) doHdr_bill_cl_day5_LC(info);
		else if (lc == Hdr_bill_tax_rnd_typ) doHdr_bill_tax_rnd_typ_LC(info);
		else if (lc == Hdr_bill_tax_rnd_typ_nm) doHdr_bill_tax_rnd_typ_nm_LC(info);
		else if (lc == Hdr_bill_cl_delay_days) doHdr_bill_cl_delay_days_LC(info);
		else if (lc == Hdr_bill_cl_ba_typ) doHdr_bill_cl_ba_typ_LC(info);
		else if (lc == Hdr_bill_cl_ba_typ_nm) doHdr_bill_cl_ba_typ_nm_LC(info);
		else if (lc == Hdr_bill_cal_cd) doHdr_bill_cal_cd_LC(info);
		else if (lc == Hdr_bill_cal_nm) doHdr_bill_cal_nm_LC(info);
		else if (lc == Hdr_rcv_ba_typ) doHdr_rcv_ba_typ_LC(info);
		else if (lc == Hdr_rcv_ba_typ_nm) doHdr_rcv_ba_typ_nm_LC(info);
		else if (lc == Hdr_ar_setoff_grp_cd) doHdr_ar_setoff_grp_cd_LC(info);
		else if (lc == Hdr_ar_setoff_grp_nm) doHdr_ar_setoff_grp_nm_LC(info);
		else if (lc == Hdr_bcst_prnt_typ) doHdr_bcst_prnt_typ_LC(info);
		else if (lc == Hdr_bcst_prnt_typ_nm) doHdr_bcst_prnt_typ_nm_LC(info);
		else if (lc == Hdr_bill_zip_cd) doHdr_bill_zip_cd_LC(info);
		else if (lc == Hdr_bill_addr1) doHdr_bill_addr1_LC(info);
		else if (lc == Hdr_bill_addr2) doHdr_bill_addr2_LC(info);
		else if (lc == Hdr_bill_addr3) doHdr_bill_addr3_LC(info);
		else if (lc == Hdr_bill_addr4) doHdr_bill_addr4_LC(info);
		else if (lc == Hdr_bill_tel) doHdr_bill_tel_LC(info);
		else if (lc == Hdr_bill_bcst_nm) doHdr_bill_bcst_nm_LC(info);
		else if (lc == Hdr_bill_bcst_dpt) doHdr_bill_bcst_dpt_LC(info);
		else if (lc == Hdr_bill_bcst_psn) doHdr_bill_bcst_psn_LC(info);
		else if (lc == Hdr_bill_bcst_psn_title) doHdr_bill_bcst_psn_title_LC(info);
		else if (lc == Hdr_bill_prnt_typ) doHdr_bill_prnt_typ_LC(info);
		else if (lc == Hdr_bill_prnt_typ_nm) doHdr_bill_prnt_typ_nm_LC(info);
		else if (lc == Hdr_sls_dtl_outp_typ) doHdr_sls_dtl_outp_typ_LC(info);
		else if (lc == Hdr_sls_dtl_outp_typ_nm) doHdr_sls_dtl_outp_typ_nm_LC(info);
		else if (lc == Hdr_bill_dtl_subttl_typ) doHdr_bill_dtl_subttl_typ_LC(info);
		else if (lc == Hdr_bill_dtl_subttl_typ_nm) doHdr_bill_dtl_subttl_typ_nm_LC(info);
		else if (lc == Hdr_bill_dtl_brk_typ) doHdr_bill_dtl_brk_typ_LC(info);
		else if (lc == Hdr_bill_dtl_brk_typ_nm) doHdr_bill_dtl_brk_typ_nm_LC(info);
		else if (lc == Hdr_bill_dtl_sort_typ) doHdr_bill_dtl_sort_typ_LC(info);
		else if (lc == Hdr_bill_dtl_sort_typ_nm) doHdr_bill_dtl_sort_typ_nm_LC(info);
		else if (lc == Hdr_bill_can_slip_typ) doHdr_bill_can_slip_typ_LC(info);
		else if (lc == Hdr_bill_can_slip_typ_nm) doHdr_bill_can_slip_typ_nm_LC(info);
		else if (lc == Hdr_auto_appl_delay_days) doHdr_auto_appl_delay_days_LC(info);
		else if (lc == Hdr_xfr_psn) doHdr_xfr_psn_LC(info);
		else if (lc == Hdr_rcst_prnt_typ) doHdr_rcst_prnt_typ_LC(info);
		else if (lc == Hdr_rcst_prnt_typ_nm) doHdr_rcst_prnt_typ_nm_LC(info);
		else if (lc == Wrk4Hdr_bill_cl_day1) doWrk4Hdr_bill_cl_day1_LC(info);
		else if (lc == Wrk4Hdr_bill_cl_day2) doWrk4Hdr_bill_cl_day2_LC(info);
		else if (lc == Wrk4Hdr_bill_cl_day3) doWrk4Hdr_bill_cl_day3_LC(info);
		else if (lc == Wrk4Hdr_bill_cl_day4) doWrk4Hdr_bill_cl_day4_LC(info);
		else if (lc == Wrk4Hdr_bill_cl_day5) doWrk4Hdr_bill_cl_day5_LC(info);
		else if (lc == columnWrk4Dtl_bcst_cd) doWrk4Dtl_bcst_cd_LC(info);
		else if (lc == columnWrk4Dtl_bill_cl_day1) doWrk4Dtl_bill_cl_day1_LC(info);
		else if (lc == columnWrk4Dtl_bill_cl_day2) doWrk4Dtl_bill_cl_day2_LC(info);
		else if (lc == columnWrk4Dtl_bill_cl_day3) doWrk4Dtl_bill_cl_day3_LC(info);
		else if (lc == columnWrk4Dtl_bill_cl_day4) doWrk4Dtl_bill_cl_day4_LC(info);
		else if (lc == columnWrk4Dtl_bill_cl_day5) doWrk4Dtl_bill_cl_day5_LC(info);
		else if (lc == columnWrk4Dtl_cur_cd) doWrk4Dtl_cur_cd_LC(info);
		else if (lc == columnWrk4Dtl_cur_nm) doWrk4Dtl_cur_nm_LC(info);
		else if (lc == columnWrk4Dtl_amt_dec_place) doWrk4Dtl_amt_dec_place_LC(info);
		else if (lc == columnWrk4Dtl_sttl_cd) doWrk4Dtl_sttl_cd_LC(info);
		else if (lc == columnWrk4Dtl_sttl_nm) doWrk4Dtl_sttl_nm_LC(info);
		else if (lc == columnWrk4Dtl_wg_cd) doWrk4Dtl_wg_cd_LC(info);
		else if (lc == columnWrk4Dtl_wg_nm) doWrk4Dtl_wg_nm_LC(info);
		else if (lc == columnWrk4Dtl_rate) doWrk4Dtl_rate_LC(info);
		else if (lc == columnWrk4Dtl_crryovr_mons_typ) doWrk4Dtl_crryovr_mons_typ_LC(info);
		else if (lc == columnWrk4Dtl_crryovr_mons_typ_nm) doWrk4Dtl_crryovr_mons_typ_nm_LC(info);
		else if (lc == columnWrk4Dtl_rcv_crryovr_mons1) doWrk4Dtl_rcv_crryovr_mons1_LC(info);
		else if (lc == columnWrk4Dtl_rcv_day1) doWrk4Dtl_rcv_day1_LC(info);
		else if (lc == columnWrk4Dtl_rcv_crryovr_mons2) doWrk4Dtl_rcv_crryovr_mons2_LC(info);
		else if (lc == columnWrk4Dtl_rcv_day2) doWrk4Dtl_rcv_day2_LC(info);
		else if (lc == columnWrk4Dtl_rcv_crryovr_mons3) doWrk4Dtl_rcv_crryovr_mons3_LC(info);
		else if (lc == columnWrk4Dtl_rcv_day3) doWrk4Dtl_rcv_day3_LC(info);
		else if (lc == columnWrk4Dtl_rcv_crryovr_mons4) doWrk4Dtl_rcv_crryovr_mons4_LC(info);
		else if (lc == columnWrk4Dtl_rcv_day4) doWrk4Dtl_rcv_day4_LC(info);
		else if (lc == columnWrk4Dtl_rcv_crryovr_mons5) doWrk4Dtl_rcv_crryovr_mons5_LC(info);
		else if (lc == columnWrk4Dtl_rcv_day5) doWrk4Dtl_rcv_day5_LC(info);
		else if (lc == columnWrk4Dtl_memo1) doWrk4Dtl_memo1_LC(info);
		else if (lc == columnWrk4Dtl_memo2) doWrk4Dtl_memo2_LC(info);
		else if (lc == columnWrk4Dtl_memo3) doWrk4Dtl_memo3_LC(info);
		else if (lc == columnWrk4Dtl_ins_usr_id) doWrk4Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk4Dtl_ins_usr_nm) doWrk4Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk4Dtl_ins_ts) doWrk4Dtl_ins_ts_LC(info);
		else if (lc == columnWrk4Dtl_ins_func_id) doWrk4Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk4Dtl_ins_func_nm) doWrk4Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk4Dtl_upd_cntr) doWrk4Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk4Dtl_upd_usr_id) doWrk4Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk4Dtl_upd_usr_nm) doWrk4Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk4Dtl_upd_ts) doWrk4Dtl_upd_ts_LC(info);
		else if (lc == columnWrk4Dtl_upd_func_id) doWrk4Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk4Dtl_upd_func_nm) doWrk4Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk4Dtl_upd_srv_req_no) doWrk4Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk4Dtl_del_usr_id) doWrk4Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk4Dtl_del_usr_nm) doWrk4Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk4Dtl_del_ts) doWrk4Dtl_del_ts_LC(info);
		else if (lc == Wrk7Hdr_st_dt) doWrk7Hdr_st_dt_LC(info);
		else if (lc == Wrk7Hdr_end_dt) doWrk7Hdr_end_dt_LC(info);
		else if (lc == columnWrk7Dtl_bp_cd) doWrk7Dtl_bp_cd_LC(info);
		else if (lc == columnWrk7Dtl_if_proc_typ) doWrk7Dtl_if_proc_typ_LC(info);
		else if (lc == columnWrk7Dtl_if_proc_typ_nm) doWrk7Dtl_if_proc_typ_nm_LC(info);
		else if (lc == columnWrk7Dtl_ext_sys_cd) doWrk7Dtl_ext_sys_cd_LC(info);
		else if (lc == columnWrk7Dtl_ext_sys_nm) doWrk7Dtl_ext_sys_nm_LC(info);
		else if (lc == columnWrk7Dtl_memo1) doWrk7Dtl_memo1_LC(info);
		else if (lc == columnWrk7Dtl_memo2) doWrk7Dtl_memo2_LC(info);
		else if (lc == columnWrk7Dtl_memo3) doWrk7Dtl_memo3_LC(info);
		else if (lc == columnWrk7Dtl_ins_usr_id) doWrk7Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk7Dtl_ins_usr_nm) doWrk7Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk7Dtl_ins_ts) doWrk7Dtl_ins_ts_LC(info);
		else if (lc == columnWrk7Dtl_ins_func_id) doWrk7Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk7Dtl_ins_func_nm) doWrk7Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk7Dtl_upd_cntr) doWrk7Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk7Dtl_upd_usr_id) doWrk7Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk7Dtl_upd_usr_nm) doWrk7Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk7Dtl_upd_ts) doWrk7Dtl_upd_ts_LC(info);
		else if (lc == columnWrk7Dtl_upd_func_id) doWrk7Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk7Dtl_upd_func_nm) doWrk7Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk7Dtl_upd_srv_req_no) doWrk7Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk7Dtl_del_usr_id) doWrk7Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk7Dtl_del_usr_nm) doWrk7Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk7Dtl_del_ts) doWrk7Dtl_del_ts_LC(info);
		else if (lc == columnWrk5Dtl_rcst_cd) doWrk5Dtl_rcst_cd_LC(info);
		else if (lc == columnWrk5Dtl_cur_cd) doWrk5Dtl_cur_cd_LC(info);
		else if (lc == columnWrk5Dtl_cur_nm) doWrk5Dtl_cur_nm_LC(info);
		else if (lc == columnWrk5Dtl_amt_dec_place) doWrk5Dtl_amt_dec_place_LC(info);
		else if (lc == columnWrk5Dtl_memo1) doWrk5Dtl_memo1_LC(info);
		else if (lc == columnWrk5Dtl_memo2) doWrk5Dtl_memo2_LC(info);
		else if (lc == columnWrk5Dtl_memo3) doWrk5Dtl_memo3_LC(info);
		else if (lc == columnWrk5Dtl_ins_usr_id) doWrk5Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk5Dtl_ins_usr_nm) doWrk5Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk5Dtl_ins_ts) doWrk5Dtl_ins_ts_LC(info);
		else if (lc == columnWrk5Dtl_ins_func_id) doWrk5Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk5Dtl_ins_func_nm) doWrk5Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk5Dtl_upd_cntr) doWrk5Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk5Dtl_upd_usr_id) doWrk5Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk5Dtl_upd_usr_nm) doWrk5Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk5Dtl_upd_ts) doWrk5Dtl_upd_ts_LC(info);
		else if (lc == columnWrk5Dtl_upd_func_id) doWrk5Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk5Dtl_upd_func_nm) doWrk5Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk5Dtl_upd_srv_req_no) doWrk5Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk5Dtl_del_usr_id) doWrk5Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk5Dtl_del_usr_nm) doWrk5Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk5Dtl_del_ts) doWrk5Dtl_del_ts_LC(info);
		else if (lc == Wrk6Hdr_st_dt) doWrk6Hdr_st_dt_LC(info);
		else if (lc == Wrk6Hdr_end_dt) doWrk6Hdr_end_dt_LC(info);
		else if (lc == columnWrk6Dtl_bp_cd) doWrk6Dtl_bp_cd_LC(info);
		else if (lc == columnWrk6Dtl_if_proc_typ) doWrk6Dtl_if_proc_typ_LC(info);
		else if (lc == columnWrk6Dtl_if_proc_typ_nm) doWrk6Dtl_if_proc_typ_nm_LC(info);
		else if (lc == columnWrk6Dtl_ar_sttl_typ) doWrk6Dtl_ar_sttl_typ_LC(info);
		else if (lc == columnWrk6Dtl_ar_sttl_typ_nm) doWrk6Dtl_ar_sttl_typ_nm_LC(info);
		else if (lc == columnWrk6Dtl_bank_cd) doWrk6Dtl_bank_cd_LC(info);
		else if (lc == columnWrk6Dtl_bank_nm) doWrk6Dtl_bank_nm_LC(info);
		else if (lc == columnWrk6Dtl_bank_ac_cd) doWrk6Dtl_bank_ac_cd_LC(info);
		else if (lc == columnWrk6Dtl_bank_ac_nm) doWrk6Dtl_bank_ac_nm_LC(info);
		else if (lc == columnWrk6Dtl_memo1) doWrk6Dtl_memo1_LC(info);
		else if (lc == columnWrk6Dtl_memo2) doWrk6Dtl_memo2_LC(info);
		else if (lc == columnWrk6Dtl_memo3) doWrk6Dtl_memo3_LC(info);
		else if (lc == columnWrk6Dtl_ins_usr_id) doWrk6Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk6Dtl_ins_usr_nm) doWrk6Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk6Dtl_ins_ts) doWrk6Dtl_ins_ts_LC(info);
		else if (lc == columnWrk6Dtl_ins_func_id) doWrk6Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk6Dtl_ins_func_nm) doWrk6Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk6Dtl_upd_cntr) doWrk6Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk6Dtl_upd_usr_id) doWrk6Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk6Dtl_upd_usr_nm) doWrk6Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk6Dtl_upd_ts) doWrk6Dtl_upd_ts_LC(info);
		else if (lc == columnWrk6Dtl_upd_func_id) doWrk6Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk6Dtl_upd_func_nm) doWrk6Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk6Dtl_upd_srv_req_no) doWrk6Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk6Dtl_del_usr_id) doWrk6Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk6Dtl_del_usr_nm) doWrk6Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk6Dtl_del_ts) doWrk6Dtl_del_ts_LC(info);
		else if (lc == columnHdrAll_bp_cd) doHdrAll_bp_cd_LC(info);
		else if (lc == columnHdrAll_bp_nm) doHdrAll_bp_nm_LC(info);
		else if (lc == columnHdrAll_rcst_cd) doHdrAll_rcst_cd_LC(info);
		else if (lc == columnHdrAll_rcst_nm) doHdrAll_rcst_nm_LC(info);
		else if (lc == columnHdrAll_ar_cred_cd) doHdrAll_ar_cred_cd_LC(info);
		else if (lc == columnHdrAll_ar_cred_nm) doHdrAll_ar_cred_nm_LC(info);
		else if (lc == columnHdrAll_bill_dpt_typ) doHdrAll_bill_dpt_typ_LC(info);
		else if (lc == columnHdrAll_bill_dpt_typ_nm) doHdrAll_bill_dpt_typ_nm_LC(info);
		else if (lc == columnHdrAll_bcst_dpt_cd) doHdrAll_bcst_dpt_cd_LC(info);
		else if (lc == columnHdrAll_bcst_dpt_nm) doHdrAll_bcst_dpt_nm_LC(info);
		else if (lc == columnHdrAll_check_bcst_dpt_cd) doHdrAll_check_bcst_dpt_cd_LC(info);
		else if (lc == columnHdrAll_bill_cl_typ) doHdrAll_bill_cl_typ_LC(info);
		else if (lc == columnHdrAll_bill_cl_typ_nm) doHdrAll_bill_cl_typ_nm_LC(info);
		else if (lc == columnHdrAll_bill_cl_day1) doHdrAll_bill_cl_day1_LC(info);
		else if (lc == columnHdrAll_bill_cl_day2) doHdrAll_bill_cl_day2_LC(info);
		else if (lc == columnHdrAll_bill_cl_day3) doHdrAll_bill_cl_day3_LC(info);
		else if (lc == columnHdrAll_bill_cl_day4) doHdrAll_bill_cl_day4_LC(info);
		else if (lc == columnHdrAll_bill_cl_day5) doHdrAll_bill_cl_day5_LC(info);
		else if (lc == columnHdrAll_bill_tax_rnd_typ) doHdrAll_bill_tax_rnd_typ_LC(info);
		else if (lc == columnHdrAll_bill_tax_rnd_typ_nm) doHdrAll_bill_tax_rnd_typ_nm_LC(info);
		else if (lc == columnHdrAll_bill_cl_delay_days) doHdrAll_bill_cl_delay_days_LC(info);
		else if (lc == columnHdrAll_bill_cl_ba_typ) doHdrAll_bill_cl_ba_typ_LC(info);
		else if (lc == columnHdrAll_bill_cl_ba_typ_nm) doHdrAll_bill_cl_ba_typ_nm_LC(info);
		else if (lc == columnHdrAll_bill_cal_cd) doHdrAll_bill_cal_cd_LC(info);
		else if (lc == columnHdrAll_bill_cal_nm) doHdrAll_bill_cal_nm_LC(info);
		else if (lc == columnHdrAll_rcv_ba_typ) doHdrAll_rcv_ba_typ_LC(info);
		else if (lc == columnHdrAll_rcv_ba_typ_nm) doHdrAll_rcv_ba_typ_nm_LC(info);
		else if (lc == columnHdrAll_ar_setoff_grp_cd) doHdrAll_ar_setoff_grp_cd_LC(info);
		else if (lc == columnHdrAll_ar_setoff_grp_nm) doHdrAll_ar_setoff_grp_nm_LC(info);
		else if (lc == columnHdrAll_bcst_prnt_typ) doHdrAll_bcst_prnt_typ_LC(info);
		else if (lc == columnHdrAll_bcst_prnt_typ_nm) doHdrAll_bcst_prnt_typ_nm_LC(info);
		else if (lc == columnHdrAll_bill_zip_cd) doHdrAll_bill_zip_cd_LC(info);
		else if (lc == columnHdrAll_bill_addr1) doHdrAll_bill_addr1_LC(info);
		else if (lc == columnHdrAll_bill_addr2) doHdrAll_bill_addr2_LC(info);
		else if (lc == columnHdrAll_bill_addr3) doHdrAll_bill_addr3_LC(info);
		else if (lc == columnHdrAll_bill_addr4) doHdrAll_bill_addr4_LC(info);
		else if (lc == columnHdrAll_bill_tel) doHdrAll_bill_tel_LC(info);
		else if (lc == columnHdrAll_bill_bcst_nm) doHdrAll_bill_bcst_nm_LC(info);
		else if (lc == columnHdrAll_bill_bcst_dpt) doHdrAll_bill_bcst_dpt_LC(info);
		else if (lc == columnHdrAll_bill_bcst_psn) doHdrAll_bill_bcst_psn_LC(info);
		else if (lc == columnHdrAll_bill_bcst_psn_title) doHdrAll_bill_bcst_psn_title_LC(info);
		else if (lc == columnHdrAll_bill_prnt_typ) doHdrAll_bill_prnt_typ_LC(info);
		else if (lc == columnHdrAll_bill_prnt_typ_nm) doHdrAll_bill_prnt_typ_nm_LC(info);
		else if (lc == columnHdrAll_sls_dtl_outp_typ) doHdrAll_sls_dtl_outp_typ_LC(info);
		else if (lc == columnHdrAll_sls_dtl_outp_typ_nm) doHdrAll_sls_dtl_outp_typ_nm_LC(info);
		else if (lc == columnHdrAll_bill_dtl_subttl_typ) doHdrAll_bill_dtl_subttl_typ_LC(info);
		else if (lc == columnHdrAll_bill_dtl_subttl_typ_nm) doHdrAll_bill_dtl_subttl_typ_nm_LC(info);
		else if (lc == columnHdrAll_bill_dtl_brk_typ) doHdrAll_bill_dtl_brk_typ_LC(info);
		else if (lc == columnHdrAll_bill_dtl_brk_typ_nm) doHdrAll_bill_dtl_brk_typ_nm_LC(info);
		else if (lc == columnHdrAll_bill_dtl_sort_typ) doHdrAll_bill_dtl_sort_typ_LC(info);
		else if (lc == columnHdrAll_bill_dtl_sort_typ_nm) doHdrAll_bill_dtl_sort_typ_nm_LC(info);
		else if (lc == columnHdrAll_bill_can_slip_typ) doHdrAll_bill_can_slip_typ_LC(info);
		else if (lc == columnHdrAll_bill_can_slip_typ_nm) doHdrAll_bill_can_slip_typ_nm_LC(info);
		else if (lc == columnHdrAll_auto_appl_delay_days) doHdrAll_auto_appl_delay_days_LC(info);
		else if (lc == columnHdrAll_xfr_psn) doHdrAll_xfr_psn_LC(info);
		else if (lc == columnHdrAll_ins_usr_id) doHdrAll_ins_usr_id_LC(info);
		else if (lc == columnHdrAll_ins_usr_nm) doHdrAll_ins_usr_nm_LC(info);
		else if (lc == columnHdrAll_ins_ts) doHdrAll_ins_ts_LC(info);
		else if (lc == columnHdrAll_ins_func_id) doHdrAll_ins_func_id_LC(info);
		else if (lc == columnHdrAll_ins_func_nm) doHdrAll_ins_func_nm_LC(info);
		else if (lc == columnHdrAll_upd_cntr) doHdrAll_upd_cntr_LC(info);
		else if (lc == columnHdrAll_upd_usr_id) doHdrAll_upd_usr_id_LC(info);
		else if (lc == columnHdrAll_upd_usr_nm) doHdrAll_upd_usr_nm_LC(info);
		else if (lc == columnHdrAll_upd_ts) doHdrAll_upd_ts_LC(info);
		else if (lc == columnHdrAll_upd_func_id) doHdrAll_upd_func_id_LC(info);
		else if (lc == columnHdrAll_upd_func_nm) doHdrAll_upd_func_nm_LC(info);
		else if (lc == columnHdrAll_upd_srv_req_no) doHdrAll_upd_srv_req_no_LC(info);
		else if (lc == columnHdrAll_del_usr_id) doHdrAll_del_usr_id_LC(info);
		else if (lc == columnHdrAll_del_usr_nm) doHdrAll_del_usr_nm_LC(info);
		else if (lc == columnHdrAll_del_ts) doHdrAll_del_ts_LC(info);
		else if (lc == columnHdrAll_rcst_prnt_typ) doHdrAll_rcst_prnt_typ_LC(info);
		else if (lc == columnHdrAll_rcst_prnt_typ_nm) doHdrAll_rcst_prnt_typ_nm_LC(info);
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
	 * [Hdr]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_cred_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_cred_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_cred_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_cred_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dpt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dpt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[check_bcst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_check_bcst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day4_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_day5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_day5_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_tax_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_tax_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_delay_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_delay_days_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_ba_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_ba_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cl_ba_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cl_ba_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_ba_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_ba_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcv_ba_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcv_ba_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_setoff_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_setoff_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ar_setoff_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ar_setoff_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bcst_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bcst_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_addr1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_addr2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_addr3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_addr4_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_tel_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_bcst_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_bcst_dpt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_bcst_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_bcst_psn_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_bcst_psn_title]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_bcst_psn_title_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_dtl_outp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_dtl_outp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sls_dtl_outp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sls_dtl_outp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_subttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_subttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_subttl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_subttl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_brk_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_brk_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_brk_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_brk_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_sort_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_sort_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_dtl_sort_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_dtl_sort_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_can_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_can_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bill_can_slip_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bill_can_slip_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[auto_appl_delay_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_auto_appl_delay_days_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[xfr_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_xfr_psn_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rcst_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rcst_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Hdr_bill_cl_day1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Hdr_bill_cl_day2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Hdr_bill_cl_day3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Hdr_bill_cl_day4_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Hdr]パネルの[bill_cl_day5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Hdr_bill_cl_day5_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bill_cl_day1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bill_cl_day2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bill_cl_day3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bill_cl_day4_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[bill_cl_day5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_bill_cl_day5_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rate_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[crryovr_mons_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_crryovr_mons_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[crryovr_mons_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_crryovr_mons_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_crryovr_mons1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_day1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_crryovr_mons2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_day2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_crryovr_mons3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_day3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_crryovr_mons4_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_day4_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_crryovr_mons5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_crryovr_mons5_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[rcv_day5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_rcv_day5_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Hdr]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Hdr_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Hdr]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Hdr_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[if_proc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_if_proc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[if_proc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_if_proc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[rcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_rcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Hdr]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Hdr_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Hdr]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Hdr_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[if_proc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_if_proc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[if_proc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_if_proc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ar_sttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ar_sttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ar_sttl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ar_sttl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bank_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bank_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bank_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bank_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[bank_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_bank_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcst_cd_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ar_cred_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ar_cred_cd_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ar_cred_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ar_cred_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dpt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dpt_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dpt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dpt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bcst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bcst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bcst_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bcst_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[check_bcst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_check_bcst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_day1_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_day2_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_day3_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_day4_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_day5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_day5_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_tax_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_tax_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_delay_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_delay_days_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_ba_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_ba_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cl_ba_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cl_ba_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cal_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cal_cd_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_cal_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_cal_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcv_ba_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcv_ba_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcv_ba_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcv_ba_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ar_setoff_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ar_setoff_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ar_setoff_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ar_setoff_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bcst_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bcst_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bcst_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bcst_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_addr1_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_addr2_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_addr3_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_addr4_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_tel_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_bcst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_bcst_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_bcst_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_bcst_dpt_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_bcst_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_bcst_psn_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_bcst_psn_title]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_bcst_psn_title_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[sls_dtl_outp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_sls_dtl_outp_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[sls_dtl_outp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_sls_dtl_outp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_subttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_subttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_subttl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_subttl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_brk_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_brk_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_brk_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_brk_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_sort_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_sort_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_dtl_sort_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_dtl_sort_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_can_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_can_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bill_can_slip_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bill_can_slip_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[auto_appl_delay_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_auto_appl_delay_days_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[xfr_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_xfr_psn_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcst_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcst_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[rcst_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_rcst_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_cd]の作成メソッド
	 */
	public MCList getCnd_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_rcst_cd]の作成メソッド
	 */
	public MCList getHdr_rcst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_ar_cred_cd]の作成メソッド
	 */
	public MCList getHdr_ar_cred_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_bill_dpt_typ]の作成メソッド
	 */
	public MCList getHdr_bill_dpt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBillDptTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_bcst_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_bcst_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_bill_cl_typ]の作成メソッド
	 */
	public MCList getHdr_bill_cl_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBillClTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_bill_tax_rnd_typ]の作成メソッド
	 */
	public MCList getHdr_bill_tax_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_bill_cl_ba_typ]の作成メソッド
	 */
	public MCList getHdr_bill_cl_ba_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBaTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_bill_cal_cd]の作成メソッド
	 */
	public MCList getHdr_bill_cal_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalBase(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_rcv_ba_typ]の作成メソッド
	 */
	public MCList getHdr_rcv_ba_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBaTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_ar_setoff_grp_cd]の作成メソッド
	 */
	public MCList getHdr_ar_setoff_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSetoffGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_bcst_prnt_typ]の作成メソッド
	 */
	public MCList getHdr_bcst_prnt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPrntTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_bill_prnt_typ]の作成メソッド
	 */
	public MCList getHdr_bill_prnt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBillPrntTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_sls_dtl_outp_typ]の作成メソッド
	 */
	public MCList getHdr_sls_dtl_outp_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsDtlOutpTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_bill_dtl_subttl_typ]の作成メソッド
	 */
	public MCList getHdr_bill_dtl_subttl_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBillDtlSubttlTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_bill_dtl_brk_typ]の作成メソッド
	 */
	public MCList getHdr_bill_dtl_brk_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBillDtlBrkTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_bill_dtl_sort_typ]の作成メソッド
	 */
	public MCList getHdr_bill_dtl_sort_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBillDtlSortTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_bill_can_slip_typ]の作成メソッド
	 */
	public MCList getHdr_bill_can_slip_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBillCanSlipTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_rcst_prnt_typ]の作成メソッド
	 */
	public MCList getHdr_rcst_prnt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPrntTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk4Dtl_cur_cd]の作成メソッド
	 */
	public MCList getWrk4Dtl_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk4Dtl_sttl_cd]の作成メソッド
	 */
	public MCList getWrk4Dtl_sttl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArSttlNotRcvSchd(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk4Dtl_wg_cd]の作成メソッド
	 */
	public MCList getWrk4Dtl_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk4Dtl_crryovr_mons_typ]の作成メソッド
	 */
	public MCList getWrk4Dtl_crryovr_mons_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCrryovrMonsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk7Dtl_if_proc_typ]の作成メソッド
	 */
	public MCList getWrk7Dtl_if_proc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIfProcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk7Dtl_ext_sys_cd]の作成メソッド
	 */
	public MCList getWrk7Dtl_ext_sys_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExtSysEdi(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk5Dtl_cur_cd]の作成メソッド
	 */
	public MCList getWrk5Dtl_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk6Dtl_if_proc_typ]の作成メソッド
	 */
	public MCList getWrk6Dtl_if_proc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIfProcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk6Dtl_ar_sttl_typ]の作成メソッド
	 */
	public MCList getWrk6Dtl_ar_sttl_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getArSttlTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk6Dtl_bank_cd]の作成メソッド
	 */
	public MCList getWrk6Dtl_bank_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBank(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk6Dtl_bank_ac_cd]の作成メソッド
	 */
	public MCList getWrk6Dtl_bank_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIntBankAc(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0560.Srch01")) {
			return new MA_MABCL0560_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0560.Upd01")) {
			return new MA_MABCL0560_Upd01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0560_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0560_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0560_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0560_Srch01Bridge() {
			p_MA_MABCL0560_Srch01 = new MCParam(PDef.MA_MABCL0560_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0560_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0560.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0560.HdrAllR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0560.Wrk4DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0560.Wrk5DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0560.Wrk6DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0560.Wrk7DtlR.class));

			p_MA_MABCL0560_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0560_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0560_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0560_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0560_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0560.CndR up0() {
			return (mcframe.clientMABC.MABCP0560.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0560.HdrAllR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0560.HdrAllR>)down(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0560.Wrk4DtlR> down1() {
			return (MCList<mcframe.clientMABC.MABCP0560.Wrk4DtlR>)down(1);
		}
		protected MCList<mcframe.clientMABC.MABCP0560.Wrk5DtlR> down2() {
			return (MCList<mcframe.clientMABC.MABCP0560.Wrk5DtlR>)down(2);
		}
		protected MCList<mcframe.clientMABC.MABCP0560.Wrk6DtlR> down3() {
			return (MCList<mcframe.clientMABC.MABCP0560.Wrk6DtlR>)down(3);
		}
		protected MCList<mcframe.clientMABC.MABCP0560.Wrk7DtlR> down4() {
			return (MCList<mcframe.clientMABC.MABCP0560.Wrk7DtlR>)down(4);
		}

		protected void setupDownParam() {
			p_MA_MABCL0560_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0560.HdrAllR.class));
			p_MA_MABCL0560_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0560.Wrk4DtlR.class));
			p_MA_MABCL0560_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0560.Wrk5DtlR.class));
			p_MA_MABCL0560_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0560.Wrk6DtlR.class));
			p_MA_MABCL0560_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0560.Wrk7DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0560_Srch01;
		}

		protected void show() {
			setHdrAllL((MCList<mcframe.clientMABC.MABCP0560.HdrAllR>)p_MA_MABCL0560_Srch01.getContainerParam().getDownBlock(0));
			setWrk4DtlL((MCList<mcframe.clientMABC.MABCP0560.Wrk4DtlR>)p_MA_MABCL0560_Srch01.getContainerParam().getDownBlock(1));
			setWrk5DtlL((MCList<mcframe.clientMABC.MABCP0560.Wrk5DtlR>)p_MA_MABCL0560_Srch01.getContainerParam().getDownBlock(2));
			setWrk6DtlL((MCList<mcframe.clientMABC.MABCP0560.Wrk6DtlR>)p_MA_MABCL0560_Srch01.getContainerParam().getDownBlock(3));
			setWrk7DtlL((MCList<mcframe.clientMABC.MABCP0560.Wrk7DtlR>)p_MA_MABCL0560_Srch01.getContainerParam().getDownBlock(4));
		}

		protected void clear() {
			getHdrAllL().clear();
			getWrk4DtlL().clear();
			getWrk5DtlL().clear();
			getWrk6DtlL().clear();
			getWrk7DtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrAllL());
			result.add(getWrk4DtlL());
			result.add(getWrk5DtlL());
			result.add(getWrk6DtlL());
			result.add(getWrk7DtlL());
			return result;
		}
	}
	/**
	 * [MA_MABCL0560_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0560_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0560_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0560_Upd01Bridge() {
			p_MA_MABCL0560_Upd01 = new MCParam(PDef.MA_MABCL0560_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0560_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0560.HdrAllR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0560.Wrk4DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0560.Wrk5DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0560.Wrk6DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0560.Wrk7DtlR.class));
			// Down

			p_MA_MABCL0560_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0560_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0560_Upd01.addUpBlock(getHdrAllL().shallowClone());
			p_MA_MABCL0560_Upd01.addUpBlock(getWrk4DtlL().shallowClone());
			p_MA_MABCL0560_Upd01.addUpBlock(getWrk5DtlL().shallowClone());
			p_MA_MABCL0560_Upd01.addUpBlock(getWrk6DtlL().shallowClone());
			p_MA_MABCL0560_Upd01.addUpBlock(getWrk7DtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0560_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0560_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0560.HdrAllR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0560.HdrAllR>)up(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0560.Wrk4DtlR> up1() {
			return (MCList<mcframe.clientMABC.MABCP0560.Wrk4DtlR>)up(1);
		}
		protected MCList<mcframe.clientMABC.MABCP0560.Wrk5DtlR> up2() {
			return (MCList<mcframe.clientMABC.MABCP0560.Wrk5DtlR>)up(2);
		}
		protected MCList<mcframe.clientMABC.MABCP0560.Wrk6DtlR> up3() {
			return (MCList<mcframe.clientMABC.MABCP0560.Wrk6DtlR>)up(3);
		}
		protected MCList<mcframe.clientMABC.MABCP0560.Wrk7DtlR> up4() {
			return (MCList<mcframe.clientMABC.MABCP0560.Wrk7DtlR>)up(4);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0560_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrAllL());
			result.add(getWrk4DtlL());
			result.add(getWrk5DtlL());
			result.add(getWrk6DtlL());
			result.add(getWrk7DtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}