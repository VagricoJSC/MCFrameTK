package mcframe.clientMABC.MABCP0580;

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
import mcframe.clientMABC.MABCP0580.MABCP_BspplPspplReg_MC.MA_MABCL0580_Srch01Caller;
import mcframe.clientMABC.MABCP0580.MABCP_BspplPspplReg_MC.MA_MABCL0580_Upd01Caller;

/**
 * 画面"MABCP_BspplPspplReg"パネルクラスです。<p>
 *
 * 支払予定管理先・支払先関連の検索、更新を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCP_BspplPspplReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABCP0580";

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
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public MCCheckBox Hdr_bsppl_flg = null;
	/**
	 * Payee 支払先.<p>
	 *
	 */
	public MCCheckBox Hdr_psppl_flg = null;
	public MCLabel Hdr_psppl_cd_Label = null;
	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_psppl_cd = null;
	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public MCTextField Hdr_psppl_nm = null;
	public MCLabel Hdr_bsppl_dpt_cd_Label = null;
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_bsppl_dpt_cd = null;
	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public MCTextField Hdr_bsppl_dpt_nm = null;
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_check_bsppl_dpt_cd = null;
	public MCLabel Hdr_ap_cred_cd_Label = null;
	/**
	 * AP credit managed BP cd. 債務与信管理先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_ap_cred_cd = null;
	/**
	 * AP credit managed BP name 債務与信管理先名.<p>
	 *
	 */
	public MCTextField Hdr_ap_cred_nm = null;
	/**
	 * Purchase temporary unit price closing 仕入仮単価締.<p>
	 *
	 */
	public MCCheckBox Hdr_purc_interim_cl_flg = null;
	public MCLabel Hdr_pay_bank_ac_cd_Label = null;
	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_pay_bank_ac_cd = null;
	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public MCTextField Hdr_pay_bank_ac_nm = null;
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public MCCheckBox Hdr_pay_spot_flg = null;
	public MCLabel Hdr_psppl_cl_day1_Label = null;
	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public MCNumberField Hdr_psppl_cl_day1 = null;
	public MCLabel Hdr_psppl_cl_day2_Label = null;
	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public MCNumberField Hdr_psppl_cl_day2 = null;
	public MCLabel Hdr_psppl_cl_day3_Label = null;
	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public MCNumberField Hdr_psppl_cl_day3 = null;
	public MCLabel Hdr_psppl_cl_day4_Label = null;
	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public MCNumberField Hdr_psppl_cl_day4 = null;
	public MCLabel Hdr_psppl_cl_day5_Label = null;
	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public MCNumberField Hdr_psppl_cl_day5 = null;
	public MCLabel Hdr_ap_setoff_grp_cd_Label = null;
	/**
	 * AP offset group cd. 債務相殺グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_ap_setoff_grp_cd = null;
	/**
	 * AP offset group name 債務相殺グループ名.<p>
	 *
	 */
	public MCTextField Hdr_ap_setoff_grp_nm = null;
	/**
	 * Payment tax calculation 支払税計算.<p>
	 *
	 */
	public MCCheckBox Hdr_tax_on_pay_flg = null;
	public MCLabel Hdr_pay_tax_rnd_typ_Label = null;
	/**
	 * Payment tax amount rounding type 支払税額端数処理区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_pay_tax_rnd_typ = null;
	/**
	 * Payment tax amount rounding type name 支払税額端数処理区分名.<p>
	 *
	 */
	public MCTextField Hdr_pay_tax_rnd_typ_nm = null;
	public MCLabel Hdr_pay_schd_ba_typ_Label = null;
	/**
	 * Payment schedule before/after type 支払予定前後区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_pay_schd_ba_typ = null;
	/**
	 * Payment schedule before/after type name 支払予定前後区分名.<p>
	 *
	 */
	public MCTextField Hdr_pay_schd_ba_typ_nm = null;
	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public MCCheckBox Hdr_batch_pay_schd_cl_flg = null;
	public MCLabel Hdr_pay_schd_cl_delay_days_Label = null;
	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public MCNumberField Hdr_pay_schd_cl_delay_days = null;
	public MCLabel Hdr_pay_schd_cl_ba_typ_Label = null;
	/**
	 * Payment schedule closing before/after type 支払予定締前後区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_pay_schd_cl_ba_typ = null;
	/**
	 * Payment schedule closing before/after type name 支払予定締前後区分名.<p>
	 *
	 */
	public MCTextField Hdr_pay_schd_cl_ba_typ_nm = null;
	public MCLabel Hdr_bsppl_prnt_typ_Label = null;
	/**
	 * Report issue type (Scheduled payee) 帳票発行区分（支払予定管理先）.<p>
	 *
	 */
	public MCTextComboBox Hdr_bsppl_prnt_typ = null;
	/**
	 * Report issue type name (Scheduled payee) 帳票発行区分名（支払予定管理先）.<p>
	 *
	 */
	public MCTextField Hdr_bsppl_prnt_typ_nm = null;
	/**
	 * Payment notice to be issued 支払通知書発行対象.<p>
	 *
	 */
	public MCCheckBox Hdr_pay_ntc_prnt_flg = null;
	public MCLabel Hdr_pay_ntc_zip_cd_Label = null;
	/**
	 * Payment notice send-to zip code 支払通知書送付郵便番号.<p>
	 *
	 */
	public MCTextField Hdr_pay_ntc_zip_cd = null;
	public MCLabel Hdr_pay_ntc_addr1_Label = null;
	/**
	 * Payment notice send-to address 1 支払通知書送付住所１.<p>
	 *
	 */
	public MCTextField Hdr_pay_ntc_addr1 = null;
	public MCLabel Hdr_pay_ntc_addr2_Label = null;
	/**
	 * Payment notice send-to address 2 支払通知書送付住所２.<p>
	 *
	 */
	public MCTextField Hdr_pay_ntc_addr2 = null;
	public MCLabel Hdr_pay_ntc_addr3_Label = null;
	/**
	 * Payment notice send-to address 3 支払通知書送付住所３.<p>
	 *
	 */
	public MCTextField Hdr_pay_ntc_addr3 = null;
	public MCLabel Hdr_pay_ntc_addr4_Label = null;
	/**
	 * Payment notice send-to address 4 支払通知書送付住所４.<p>
	 *
	 */
	public MCTextField Hdr_pay_ntc_addr4 = null;
	public MCLabel Hdr_pay_ntc_tel_Label = null;
	/**
	 * Payment notice send-to TEL 支払通知書送付ＴＥＬ.<p>
	 *
	 */
	public MCTextField Hdr_pay_ntc_tel = null;
	public MCLabel Hdr_pay_ntc_bsppl_nm_Label = null;
	/**
	 * Payment notice destination 支払通知書宛先.<p>
	 *
	 */
	public MCTextField Hdr_pay_ntc_bsppl_nm = null;
	public MCLabel Hdr_pay_ntc_bsppl_dpt_Label = null;
	/**
	 * Payment notice send-to dept. 支払通知書送付部署.<p>
	 *
	 */
	public MCTextField Hdr_pay_ntc_bsppl_dpt = null;
	public MCLabel Hdr_pay_ntc_bsppl_psn_Label = null;
	/**
	 * Payment notice send-to PIC 支払通知書送付担当者.<p>
	 *
	 */
	public MCTextField Hdr_pay_ntc_bsppl_psn = null;
	public MCLabel Hdr_pay_ntc_bsppl_psn_title_Label = null;
	/**
	 * Payment notice send-to PIC honorific title 支払通知書送付担当者敬称.<p>
	 *
	 */
	public MCTextField Hdr_pay_ntc_bsppl_psn_title = null;
	/**
	 * Output payment notice details 支払通知書明細出力.<p>
	 *
	 */
	public MCCheckBox Hdr_pay_ntc_dtl_outp_flg = null;
	/**
	 * Display balance of previous month on payment notice 支払通知書前月残高表示.<p>
	 *
	 */
	public MCCheckBox Hdr_pay_ntc_bfw_bal_disp_flg = null;
	/**
	 * Display advance payment on payment notice 支払通知書前渡金表示.<p>
	 *
	 */
	public MCCheckBox Hdr_pay_ntc_adv_pay_flg = null;
	/**
	 * Display payment schedule on payment notice 支払通知書支払予定表示.<p>
	 *
	 */
	public MCCheckBox Hdr_pay_ntc_dtl_pay_flg = null;
	public MCLabel Hdr_pay_ntc_dtl_subttl_typ_Label = null;
	/**
	 * Payment notice details subtotal type 支払通知書明細小計区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_pay_ntc_dtl_subttl_typ = null;
	/**
	 * Payment notice details subtotal type name 支払通知書明細小計区分名.<p>
	 *
	 */
	public MCTextField Hdr_pay_ntc_dtl_subttl_typ_nm = null;
	public MCLabel Hdr_pay_ntc_dtl_brk_typ_Label = null;
	/**
	 * Payment notice details page break type 支払通知書明細改頁区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_pay_ntc_dtl_brk_typ = null;
	/**
	 * Payment notice details page break type name 支払通知書明細改頁区分名.<p>
	 *
	 */
	public MCTextField Hdr_pay_ntc_dtl_brk_typ_nm = null;
	public MCLabel Hdr_pay_ntc_dtl_sort_typ_Label = null;
	/**
	 * Payment notice details sorting order type 支払通知書明細並順区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_pay_ntc_dtl_sort_typ = null;
	/**
	 * Payment notice details sorting order type name 支払通知書明細並順区分名.<p>
	 *
	 */
	public MCTextField Hdr_pay_ntc_dtl_sort_typ_nm = null;
	public MCLabel Hdr_pay_ntc_can_slip_typ_Label = null;
	/**
	 * Payment notice cancel slip display type 支払通知書取消伝票表示区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_pay_ntc_can_slip_typ = null;
	/**
	 * Payment notice cancel slip display type name 支払通知書取消伝票表示区分名.<p>
	 *
	 */
	public MCTextField Hdr_pay_ntc_can_slip_typ_nm = null;
	public MCLabel Hdr_psppl_rmrks_Label = null;
	/**
	 * Payee remarks 支払先備考.<p>
	 *
	 */
	public MCTextField Hdr_psppl_rmrks = null;
	public MCLabel Hdr_note_days_Label = null;
	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public MCNumberField Hdr_note_days = null;
	public MCLabel Hdr_pay_dpt_cd_Label = null;
	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_pay_dpt_cd = null;
	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public MCTextField Hdr_pay_dpt_nm = null;
	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_check_pay_dpt_cd = null;
	public MCLabel Hdr_psppl_prnt_typ_Label = null;
	/**
	 * Report issue type (Payee) 帳票発行区分（支払先）.<p>
	 *
	 */
	public MCTextComboBox Hdr_psppl_prnt_typ = null;
	/**
	 * Report issue type name (Payee) 帳票発行区分名（支払先）.<p>
	 *
	 */
	public MCTextField Hdr_psppl_prnt_typ_nm = null;
	// [DtlTab]ブロック関連のField定義
	public MCPanel DtlTabPanel = null;
	public MCTabbedPane DtlTabTab = null;
	// [DtlTab]ブロックの項目のField定義
	// [Wrk1Hdr]ブロック関連のField定義
	public MCPanel Wrk1HdrPanel = null;
	// [Wrk1Hdr]ブロックの項目のField定義
	// [Wrk4Hdr]ブロック関連のField定義
	public MCPanel Wrk4HdrPanel = null;
	// [Wrk4Hdr]ブロックの項目のField定義
	// [Wrk2Hdr]ブロック関連のField定義
	public MCPanel Wrk2HdrPanel = null;
	// [Wrk2Hdr]ブロックの項目のField定義
	// [Wrk3]ブロック関連のField定義
	public MCPanel Wrk3Panel = null;
	// [Wrk3]ブロックの項目のField定義
	// [Wrk3Hdr]ブロック関連のField定義
	public MCPanel Wrk3HdrPanel = null;
	// [Wrk3Hdr]ブロックの項目のField定義
	public MCLabel Wrk3Hdr_psppl_cl_day1_Label = null;
	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public MCNumberField Wrk3Hdr_psppl_cl_day1 = null;
	public MCLabel Wrk3Hdr_psppl_cl_day2_Label = null;
	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public MCNumberField Wrk3Hdr_psppl_cl_day2 = null;
	public MCLabel Wrk3Hdr_psppl_cl_day3_Label = null;
	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public MCNumberField Wrk3Hdr_psppl_cl_day3 = null;
	public MCLabel Wrk3Hdr_psppl_cl_day4_Label = null;
	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public MCNumberField Wrk3Hdr_psppl_cl_day4 = null;
	public MCLabel Wrk3Hdr_psppl_cl_day5_Label = null;
	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public MCNumberField Wrk3Hdr_psppl_cl_day5 = null;
	// [Wrk3Dtl]ブロック関連のField定義
	public MCPanel Wrk3DtlPanel = null;
	public MCScrollPane Wrk3DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0580.Wrk3DtlR> Wrk3DtlTable = null;
	// [Wrk3Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_del_flg = null;
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_bsppl_cd = null;
	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_psppl_cl_day1 = null;
	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_psppl_cl_day2 = null;
	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_psppl_cl_day3 = null;
	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_psppl_cl_day4 = null;
	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_psppl_cl_day5 = null;
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_cur_cd = null;
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_cur_nm = null;
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_amt_dec_place = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Wrk3Dtl_amt_p_PPanel;
	public MCColumnConfig columnWrk3Dtl_min_amt;// [Wrk3Dtl]の[amt_p.amt]を[columnWrk3Dtl_min_amt]としてエイリアス定義。
	/**
	 * Settlement method cd. 決済方法ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_sttl_cd = null;
	/**
	 * Settlement method name 決済方法名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_sttl_nm = null;
	/**
	 * AP settlement type 債務決済区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ap_sttl_typ = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_wg_nm = null;
	/**
	 * Ratio 比率.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_rate = null;
	/**
	 * Site type サイト区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_crryovr_mons_typ = null;
	/**
	 * Site type name サイト区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_crryovr_mons_typ_nm = null;
	/**
	 * Account payable turnover period 1 支払サイト１.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_pay_crryovr_mons1 = null;
	/**
	 * Scheduled payment date 1 支払予定日１.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_pay_day1 = null;
	/**
	 * Account payable turnover period 2 支払サイト２.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_pay_crryovr_mons2 = null;
	/**
	 * Scheduled payment date 2 支払予定日２.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_pay_day2 = null;
	/**
	 * Account payable turnover period 3 支払サイト３.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_pay_crryovr_mons3 = null;
	/**
	 * Scheduled payment date 3 支払予定日３.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_pay_day3 = null;
	/**
	 * Account payable turnover period 4 支払サイト４.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_pay_crryovr_mons4 = null;
	/**
	 * Scheduled payment date 4 支払予定日４.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_pay_day4 = null;
	/**
	 * Account payable turnover period 5 支払サイト５.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_pay_crryovr_mons5 = null;
	/**
	 * Scheduled payment date 5 支払予定日５.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_pay_day5 = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_del_ts = null;
	// [Wrk3DtlBtn]ブロック関連のField定義
	public MCPanel Wrk3DtlBtnPanel = null;
	// [Wrk3DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Wrk3DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Wrk3DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Wrk3DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Wrk3DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Wrk3DtlBtn_rcopy = null;
	// [Wrk5]ブロック関連のField定義
	public MCPanel Wrk5Panel = null;
	// [Wrk5]ブロックの項目のField定義
	// [Wrk5Hdr]ブロック関連のField定義
	public MCPanel Wrk5HdrPanel = null;
	// [Wrk5Hdr]ブロックの項目のField定義
	public MCLabel Wrk5Hdr_st_dt_Label = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDateField Wrk5Hdr_st_dt = null;
	public MCLabel Wrk5Hdr_end_dt_Label = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDateField Wrk5Hdr_end_dt = null;
	/**
	 * Applied date update 適用日反映.<p>
	 *
	 */
	public MCButton Wrk5Hdr_set_dt = null;
	// [Wrk5Dtl]ブロック関連のField定義
	public MCPanel Wrk5DtlPanel = null;
	public MCScrollPane Wrk5DtlScrollPane = null;
	public MCTable2<mcframe.clientMABC.MABCP0580.Wrk5DtlR> Wrk5DtlTable = null;
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
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_bp_cd = null;
	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_if_proc_typ = null;
	/**
	 * IF process type name ＩＦ処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_if_proc_typ_nm = null;
	/**
	 * Not for chargeable supply 有償支給対象外.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_not_onr_prov_flg = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Wrk5Dtl_dt_p_PPanel;
	public MCColumnConfig columnWrk5Dtl_st_dt_key;// [Wrk5Dtl]の[dt_p.st_dt_key]を[columnWrk5Dtl_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_st_dt;// [Wrk5Dtl]の[dt_p.st_dt]を[columnWrk5Dtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_end_dt;// [Wrk5Dtl]の[dt_p.end_dt]を[columnWrk5Dtl_end_dt]としてエイリアス定義。
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ext_sys_nm = null;
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
	public MCTable2<mcframe.clientMABC.MABCP0580.HdrAllR> HdrAllTable = null;
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
	 * Scheduled payee 支払予定管理先.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bsppl_flg = null;
	/**
	 * Payee 支払先.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_psppl_flg = null;
	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_psppl_cd = null;
	/**
	 * Payee name 支払先名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_psppl_nm = null;
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bsppl_dpt_cd = null;
	/**
	 * Name of dept. in charge of scheduled payee 支払予定管理先担当部門名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bsppl_dpt_nm = null;
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_check_bsppl_dpt_cd = null;
	/**
	 * AP credit managed BP cd. 債務与信管理先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_ap_cred_cd = null;
	/**
	 * AP credit managed BP name 債務与信管理先名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_ap_cred_nm = null;
	/**
	 * Purchase temporary unit price closing 仕入仮単価締.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_purc_interim_cl_flg = null;
	/**
	 * Payee account cd. 支払先口座ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_bank_ac_cd = null;
	/**
	 * Payee account name 支払先口座名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_bank_ac_nm = null;
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_spot_flg = null;
	/**
	 * Payment closing date 1 支払締日１.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_psppl_cl_day1 = null;
	/**
	 * Payment closing date 2 支払締日２.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_psppl_cl_day2 = null;
	/**
	 * Payment closing date 3 支払締日３.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_psppl_cl_day3 = null;
	/**
	 * Payment closing date 4 支払締日４.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_psppl_cl_day4 = null;
	/**
	 * Payment closing date 5 支払締日５.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_psppl_cl_day5 = null;
	/**
	 * AP offset group cd. 債務相殺グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_ap_setoff_grp_cd = null;
	/**
	 * AP offset group name 債務相殺グループ名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_ap_setoff_grp_nm = null;
	/**
	 * Payment tax calculation 支払税計算.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_tax_on_pay_flg = null;
	/**
	 * Payment tax amount rounding type 支払税額端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_tax_rnd_typ = null;
	/**
	 * Payment tax amount rounding type name 支払税額端数処理区分名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_tax_rnd_typ_nm = null;
	/**
	 * Payment schedule before/after type 支払予定前後区分.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_schd_ba_typ = null;
	/**
	 * Payment schedule before/after type name 支払予定前後区分名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_schd_ba_typ_nm = null;
	/**
	 * Batch payment schedule closing バッチ支払予定締.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_batch_pay_schd_cl_flg = null;
	/**
	 * Payment schedule closing delay days 支払予定締遅延日数.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_schd_cl_delay_days = null;
	/**
	 * Payment schedule closing before/after type 支払予定締前後区分.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_schd_cl_ba_typ = null;
	/**
	 * Payment schedule closing before/after type name 支払予定締前後区分名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_schd_cl_ba_typ_nm = null;
	/**
	 * Report issue type (Scheduled payee) 帳票発行区分（支払予定管理先）.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bsppl_prnt_typ = null;
	/**
	 * Report issue type name (Scheduled payee) 帳票発行区分名（支払予定管理先）.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_bsppl_prnt_typ_nm = null;
	/**
	 * Payment notice to be issued 支払通知書発行対象.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_prnt_flg = null;
	/**
	 * Payment notice send-to zip code 支払通知書送付郵便番号.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_zip_cd = null;
	/**
	 * Payment notice send-to address 1 支払通知書送付住所１.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_addr1 = null;
	/**
	 * Payment notice send-to address 2 支払通知書送付住所２.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_addr2 = null;
	/**
	 * Payment notice send-to address 3 支払通知書送付住所３.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_addr3 = null;
	/**
	 * Payment notice send-to address 4 支払通知書送付住所４.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_addr4 = null;
	/**
	 * Payment notice send-to TEL 支払通知書送付ＴＥＬ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_tel = null;
	/**
	 * Payment notice destination 支払通知書宛先.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_bsppl_nm = null;
	/**
	 * Payment notice send-to dept. 支払通知書送付部署.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_bsppl_dpt = null;
	/**
	 * Payment notice send-to PIC 支払通知書送付担当者.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_bsppl_psn = null;
	/**
	 * Payment notice send-to PIC honorific title 支払通知書送付担当者敬称.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_bsppl_psn_title = null;
	/**
	 * Output payment notice details 支払通知書明細出力.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_dtl_outp_flg = null;
	/**
	 * Display balance of previous month on payment notice 支払通知書前月残高表示.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_bfw_bal_disp_flg = null;
	/**
	 * Display advance payment on payment notice 支払通知書前渡金表示.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_adv_pay_flg = null;
	/**
	 * Display payment schedule on payment notice 支払通知書支払予定表示.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_dtl_pay_flg = null;
	/**
	 * Payment notice details subtotal type 支払通知書明細小計区分.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_dtl_subttl_typ = null;
	/**
	 * Payment notice details subtotal type name 支払通知書明細小計区分名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_dtl_subttl_typ_nm = null;
	/**
	 * Payment notice details page break type 支払通知書明細改頁区分.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_dtl_brk_typ = null;
	/**
	 * Payment notice details page break type name 支払通知書明細改頁区分名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_dtl_brk_typ_nm = null;
	/**
	 * Payment notice details sorting order type 支払通知書明細並順区分.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_dtl_sort_typ = null;
	/**
	 * Payment notice details sorting order type name 支払通知書明細並順区分名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_dtl_sort_typ_nm = null;
	/**
	 * Payment notice cancel slip display type 支払通知書取消伝票表示区分.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_can_slip_typ = null;
	/**
	 * Payment notice cancel slip display type name 支払通知書取消伝票表示区分名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_ntc_can_slip_typ_nm = null;
	/**
	 * Payee remarks 支払先備考.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_psppl_rmrks = null;
	/**
	 * Note sight upper limit 手形サイト上限.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_note_days = null;
	/**
	 * Payment dept. cd. 支払部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_dpt_cd = null;
	/**
	 * Payment dept. name 支払部門名.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_pay_dpt_nm = null;
	/**
	 * Payment dept. cd. (For check) 支払部門ＣＤ（チェック用）.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_check_pay_dpt_cd = null;
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
	 * Report issue type (Payee) 帳票発行区分（支払先）.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_psppl_prnt_typ = null;
	/**
	 * Report issue type name (Payee) 帳票発行区分名（支払先）.<p>
	 *
	 */
	public MCColumnConfig columnHdrAll_psppl_prnt_typ_nm = null;
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
	
	/** [MA_MABCL0580_Srch01]のCallerの作成 */
	protected MABCP_BspplPspplReg_MC.MA_MABCL0580_Srch01Caller createMA_MABCL0580_Srch01() {
		MABCP_BspplPspplReg_MC.MA_MABCL0580_Srch01Caller<MABCP_BspplPspplReg, MA_MABCL0580_Srch01Bridge>
		caller = ((MABCP_BspplPspplReg_MC)this).new MA_MABCL0580_Srch01Caller<MABCP_BspplPspplReg, MA_MABCL0580_Srch01Bridge>(
					(MABCP_BspplPspplReg)this, new MA_MABCL0580_Srch01Bridge());
		return caller;
	}
	/** [MA_MABCL0580_Srch01]の呼び出し */
	protected void callMA_MABCL0580_Srch01() {
		MCCaller caller = createMA_MABCL0580_Srch01();
		caller.exec();
	}
	/** [MA_MABCL0580_Upd01]のCallerの作成 */
	protected MABCP_BspplPspplReg_MC.MA_MABCL0580_Upd01Caller createMA_MABCL0580_Upd01() {
		MABCP_BspplPspplReg_MC.MA_MABCL0580_Upd01Caller<MABCP_BspplPspplReg, MA_MABCL0580_Upd01Bridge>
		caller = ((MABCP_BspplPspplReg_MC)this).new MA_MABCL0580_Upd01Caller<MABCP_BspplPspplReg, MA_MABCL0580_Upd01Bridge>(
					(MABCP_BspplPspplReg)this, new MA_MABCL0580_Upd01Bridge());
		return caller;
	}
	/** [MA_MABCL0580_Upd01]の呼び出し */
	protected void callMA_MABCL0580_Upd01() {
		MCCaller caller = createMA_MABCL0580_Upd01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0580.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0580.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0580.HdrR aHdrR;
	/** [Wrk3Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0580.Wrk3HdrR aWrk3HdrR;
	/** [Wrk3Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0580.Wrk3DtlR> aWrk3DtlL;
	/** [Wrk5Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABC.MABCP0580.Wrk5HdrR aWrk5HdrR;
	/** [Wrk5Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0580.Wrk5DtlR> aWrk5DtlL;
	/** [HdrAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABC.MABCP0580.HdrAllR> aHdrAllL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABC.MABCP0580.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0580.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABC.MABCP0580.MstR createMstR() {
		return mcframe.clientMABC.MABCP0580.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABC.MABCP0580.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0580.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABC.MABCP0580.CndR createCndR() {
		return mcframe.clientMABC.MABCP0580.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMABC.MABCP0580.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABC.MABCP0580.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABC.MABCP0580.HdrR createHdrR() {
		return mcframe.clientMABC.MABCP0580.HdrR.create();
	}

	/**
	 * 項目コピーによってaWrk3HdrRを設定します。
	 *
	 * aWrk3HdrRのインスタンスは変更されません。
	 *
	 * @param row Wrk3HdrR
	 */
	public void setWrk3HdrR(mcframe.clientMABC.MABCP0580.Wrk3HdrR row) {
		if (row != null) {
			MCRow.copyall(getWrk3HdrR(), row);
		}
	}

	/**
	 * [Wrk3Hdr]ブロックのコンテナaWrk3HdrRを返します。
	 *
	 * @return Wrk3HdrR
	 */
	public mcframe.clientMABC.MABCP0580.Wrk3HdrR getWrk3HdrR() {
		return aWrk3HdrR;
	}

	/**
	 * aWrk3HdrRを作成します。
	 *
	 * @return Wrk3HdrR
	 */
	public mcframe.clientMABC.MABCP0580.Wrk3HdrR createWrk3HdrR() {
		return mcframe.clientMABC.MABCP0580.Wrk3HdrR.create();
	}

	/**
	 * コピーによってaWrk3DtlLを設定します。
	 *
	 * aWrk3DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk3DtlL
	 */
	public void setWrk3DtlL(MCList<mcframe.clientMABC.MABCP0580.Wrk3DtlR> aList) {
		if (getWrk3DtlL() != aList) {
			getWrk3DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk3Dtl]ブロックのコンテナaWrk3DtlLを返します。
	 *
	 * @return Wrk3DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0580.Wrk3DtlR> getWrk3DtlL() {
		return aWrk3DtlL;
	}

	/**
	 * aWrk3DtlRを作成します。
	 *
	 * @return Wrk3DtlR
	 */
	public mcframe.clientMABC.MABCP0580.Wrk3DtlR createWrk3DtlR() {
		return mcframe.clientMABC.MABCP0580.Wrk3DtlR.create();
	}

	/**
	 * aWrk3DtlLを作成します。
	 *
	 * @return Wrk3DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0580.Wrk3DtlR> createWrk3DtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0580.Wrk3DtlR.class);
	}

	/**
	 * Wrk3DtlTableを初期化します。
	 */
	protected void createWrk3DtlTable(){
		if(Wrk3DtlTable == null){
			Wrk3DtlTable = beansFactory.createTable2("Wrk3Dtl.table");
		}
	}

	/**
	 * 項目コピーによってaWrk5HdrRを設定します。
	 *
	 * aWrk5HdrRのインスタンスは変更されません。
	 *
	 * @param row Wrk5HdrR
	 */
	public void setWrk5HdrR(mcframe.clientMABC.MABCP0580.Wrk5HdrR row) {
		if (row != null) {
			MCRow.copyall(getWrk5HdrR(), row);
		}
	}

	/**
	 * [Wrk5Hdr]ブロックのコンテナaWrk5HdrRを返します。
	 *
	 * @return Wrk5HdrR
	 */
	public mcframe.clientMABC.MABCP0580.Wrk5HdrR getWrk5HdrR() {
		return aWrk5HdrR;
	}

	/**
	 * aWrk5HdrRを作成します。
	 *
	 * @return Wrk5HdrR
	 */
	public mcframe.clientMABC.MABCP0580.Wrk5HdrR createWrk5HdrR() {
		return mcframe.clientMABC.MABCP0580.Wrk5HdrR.create();
	}

	/**
	 * コピーによってaWrk5DtlLを設定します。
	 *
	 * aWrk5DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk5DtlL
	 */
	public void setWrk5DtlL(MCList<mcframe.clientMABC.MABCP0580.Wrk5DtlR> aList) {
		if (getWrk5DtlL() != aList) {
			getWrk5DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk5Dtl]ブロックのコンテナaWrk5DtlLを返します。
	 *
	 * @return Wrk5DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0580.Wrk5DtlR> getWrk5DtlL() {
		return aWrk5DtlL;
	}

	/**
	 * aWrk5DtlRを作成します。
	 *
	 * @return Wrk5DtlR
	 */
	public mcframe.clientMABC.MABCP0580.Wrk5DtlR createWrk5DtlR() {
		return mcframe.clientMABC.MABCP0580.Wrk5DtlR.create();
	}

	/**
	 * aWrk5DtlLを作成します。
	 *
	 * @return Wrk5DtlL
	 */
	public MCList<mcframe.clientMABC.MABCP0580.Wrk5DtlR> createWrk5DtlL() {
		return MCList.create(mcframe.clientMABC.MABCP0580.Wrk5DtlR.class);
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
	 * コピーによってaHdrAllLを設定します。
	 *
	 * aHdrAllLのインスタンスは変更されません。
	 *
	 * @param dataset HdrAllL
	 */
	public void setHdrAllL(MCList<mcframe.clientMABC.MABCP0580.HdrAllR> aList) {
		if (getHdrAllL() != aList) {
			getHdrAllL().setAll(aList);
		}
	}

	/**
	 * [HdrAll]ブロックのコンテナaHdrAllLを返します。
	 *
	 * @return HdrAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0580.HdrAllR> getHdrAllL() {
		return aHdrAllL;
	}

	/**
	 * aHdrAllRを作成します。
	 *
	 * @return HdrAllR
	 */
	public mcframe.clientMABC.MABCP0580.HdrAllR createHdrAllR() {
		return mcframe.clientMABC.MABCP0580.HdrAllR.create();
	}

	/**
	 * aHdrAllLを作成します。
	 *
	 * @return HdrAllL
	 */
	public MCList<mcframe.clientMABC.MABCP0580.HdrAllR> createHdrAllL() {
		return MCList.create(mcframe.clientMABC.MABCP0580.HdrAllR.class);
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
		if(!MCCollectionUtil.contains(ret, getWrk3HdrR())) ret.add(getWrk3HdrR());
		if(!MCCollectionUtil.contains(ret, getWrk3DtlL())) ret.add(getWrk3DtlL());
		if(!MCCollectionUtil.contains(ret, getWrk5HdrR())) ret.add(getWrk5HdrR());
		if(!MCCollectionUtil.contains(ret, getWrk5DtlL())) ret.add(getWrk5DtlL());
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
		if(aCnt == getWrk3HdrR()) return "Wrk3Hdr";
		if(aCnt == getWrk3DtlL()) return "Wrk3Dtl";
		if(aCnt == getWrk5HdrR()) return "Wrk5Hdr";
		if(aCnt == getWrk5DtlL()) return "Wrk5Dtl";
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
		if(bId.equals("Wrk3Hdr")) return getWrk3HdrR();
		if(bId.equals("Wrk3Dtl")) return getWrk3DtlL();
		if(bId.equals("Wrk5Hdr")) return getWrk5HdrR();
		if(bId.equals("Wrk5Dtl")) return getWrk5DtlL();
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
		ret.add(Wrk4HdrPanel);
		ret.add(Wrk2HdrPanel);
		ret.add(Wrk3Panel);
		ret.add(Wrk3HdrPanel);
		ret.add(Wrk3DtlPanel);
		ret.add(Wrk3DtlBtnPanel);
		ret.add(Wrk5Panel);
		ret.add(Wrk5HdrPanel);
		ret.add(Wrk5DtlPanel);
		ret.add(Wrk5DtlBtnPanel);
		ret.add(BtnPanel);
		ret.add(HdrAllPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABCP_BspplPspplReg_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aHdrR = createHdrR();
		aWrk3HdrR = createWrk3HdrR();
		aWrk3DtlL = createWrk3DtlL();
		aWrk5HdrR = createWrk5HdrR();
		aWrk5DtlL = createWrk5DtlL();
		aHdrAllL = createHdrAllL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABCP_BspplPspplReg_MC_A(String name) {
		aMstR = createMstR();
		aCndR = createCndR();
		aHdrR = createHdrR();
		aWrk3HdrR = createWrk3HdrR();
		aWrk3DtlL = createWrk3DtlL();
		createWrk3DtlTable();
		Wrk3DtlTable.setRowName(name);
		aWrk5HdrR = createWrk5HdrR();
		aWrk5DtlL = createWrk5DtlL();
		createWrk5DtlTable();
		Wrk5DtlTable.setRowName(name);
		aHdrAllL = createHdrAllL();
		createHdrAllTable();
		HdrAllTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABCP_BspplPspplReg_MC.jbCreateScreenOpe((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbCreateMst((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbCreateTop((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbCreateFold((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbCreateCnd((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbCreateCtrl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbCreateTbl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbCreateHdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbCreateDtlTab((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbCreateWrk1Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbCreateWrk4Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbCreateWrk2Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbCreateWrk3((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbCreateWrk3Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbCreateWrk3Dtl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbCreateWrk3DtlBtn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbCreateWrk5((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbCreateWrk5Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbCreateWrk5Dtl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbCreateWrk5DtlBtn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbCreateBtn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbCreateHdrAll((MABCP_BspplPspplReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABCP_BspplPspplReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABCP_BspplPspplReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABCP_BspplPspplReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABCP_BspplPspplReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABCP_BspplPspplReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABCP_BspplPspplReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Tbl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTbl(MABCP_BspplPspplReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MABCP_BspplPspplReg p) {
	}

	/**
	 * [DtlTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlTab(MABCP_BspplPspplReg p) {
	}

	/**
	 * [Wrk1Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk1Hdr(MABCP_BspplPspplReg p) {
	}

	/**
	 * [Wrk4Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk4Hdr(MABCP_BspplPspplReg p) {
	}

	/**
	 * [Wrk2Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk2Hdr(MABCP_BspplPspplReg p) {
	}

	/**
	 * [Wrk3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk3(MABCP_BspplPspplReg p) {
	}

	/**
	 * [Wrk3Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk3Hdr(MABCP_BspplPspplReg p) {
	}

	/**
	 * [Wrk3Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk3Dtl(MABCP_BspplPspplReg p) {
		p.Wrk3Dtl_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMABC.MABCP0580.Wrk3DtlR.$amt_p);
		p.Wrk3Dtl_amt_p_PPanel.setName("Wrk3Dtl.amt_p");
		p.columnWrk3Dtl_min_amt = p.Wrk3Dtl_amt_p_PPanel.columnAmt_amt;
		p.columnWrk3Dtl_min_amt.addAliasName("Wrk3Dtl.min_amt", p);
	}

	/**
	 * [Wrk3DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk3DtlBtn(MABCP_BspplPspplReg p) {
	}

	/**
	 * [Wrk5]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk5(MABCP_BspplPspplReg p) {
	}

	/**
	 * [Wrk5Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk5Hdr(MABCP_BspplPspplReg p) {
	}

	/**
	 * [Wrk5Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk5Dtl(MABCP_BspplPspplReg p) {
		p.Wrk5Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABC.MABCP0580.Wrk5DtlR.$dt_p);
		p.Wrk5Dtl_dt_p_PPanel.setName("Wrk5Dtl.dt_p");
		p.columnWrk5Dtl_st_dt_key = p.Wrk5Dtl_dt_p_PPanel.columnDt_st_dt_key;
		p.columnWrk5Dtl_st_dt_key.addAliasName("Wrk5Dtl.st_dt_key", p);
		p.columnWrk5Dtl_st_dt = p.Wrk5Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnWrk5Dtl_st_dt.addAliasName("Wrk5Dtl.st_dt", p);
		p.columnWrk5Dtl_end_dt = p.Wrk5Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnWrk5Dtl_end_dt.addAliasName("Wrk5Dtl.end_dt", p);
	}

	/**
	 * [Wrk5DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk5DtlBtn(MABCP_BspplPspplReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABCP_BspplPspplReg p) {
	}

	/**
	 * [HdrAll]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrAll(MABCP_BspplPspplReg p) {
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
	
	
	/** [Hdr_psppl_cd_ListPutter]の定義 */
	private MCListPutter Hdr_psppl_cd_p = null;

	/**
	 * [Hdr_psppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_psppl_cd_ListPutter() {
		if (Hdr_psppl_cd_p == null) {
			Hdr_psppl_cd_p = createHdr_psppl_cd_ListPutter(Hdr_psppl_cd, "psppl_cd", "psppl_nm");

		}
		return Hdr_psppl_cd_p;
	}
	
	
	/** [Hdr_bsppl_dpt_cd_ListPutter]の定義 */
	private MCListPutter Hdr_bsppl_dpt_cd_p = null;

	/**
	 * [Hdr_bsppl_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_bsppl_dpt_cd_ListPutter() {
		if (Hdr_bsppl_dpt_cd_p == null) {
			Hdr_bsppl_dpt_cd_p = createHdr_bsppl_dpt_cd_ListPutter(Hdr_bsppl_dpt_cd, "bsppl_dpt_cd", "bsppl_dpt_nm");

		}
		return Hdr_bsppl_dpt_cd_p;
	}
	
	
	/** [Hdr_ap_cred_cd_ListPutter]の定義 */
	private MCListPutter Hdr_ap_cred_cd_p = null;

	/**
	 * [Hdr_ap_cred_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_ap_cred_cd_ListPutter() {
		if (Hdr_ap_cred_cd_p == null) {
			Hdr_ap_cred_cd_p = createHdr_ap_cred_cd_ListPutter(Hdr_ap_cred_cd, "ap_cred_cd", "ap_cred_nm");

		}
		return Hdr_ap_cred_cd_p;
	}
	
	
	/** [Hdr_pay_bank_ac_cd_ListPutter]の定義 */
	private MCListPutter Hdr_pay_bank_ac_cd_p = null;

	/**
	 * [Hdr_pay_bank_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_pay_bank_ac_cd_ListPutter() {
		if (Hdr_pay_bank_ac_cd_p == null) {
			Hdr_pay_bank_ac_cd_p = createHdr_pay_bank_ac_cd_ListPutter(Hdr_pay_bank_ac_cd, "pay_bank_ac_cd", "pay_bank_ac_nm");

		}
		return Hdr_pay_bank_ac_cd_p;
	}
	
	
	/** [Hdr_ap_setoff_grp_cd_ListPutter]の定義 */
	private MCListPutter Hdr_ap_setoff_grp_cd_p = null;

	/**
	 * [Hdr_ap_setoff_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_ap_setoff_grp_cd_ListPutter() {
		if (Hdr_ap_setoff_grp_cd_p == null) {
			Hdr_ap_setoff_grp_cd_p = createHdr_ap_setoff_grp_cd_ListPutter(Hdr_ap_setoff_grp_cd, "ap_setoff_grp_cd", "ap_setoff_grp_nm");

		}
		return Hdr_ap_setoff_grp_cd_p;
	}
	
	
	/** [Hdr_pay_tax_rnd_typ_ListPutter]の定義 */
	private MCListPutter Hdr_pay_tax_rnd_typ_p = null;

	/**
	 * [Hdr_pay_tax_rnd_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_pay_tax_rnd_typ_ListPutter() {
		if (Hdr_pay_tax_rnd_typ_p == null) {
			Hdr_pay_tax_rnd_typ_p = createHdr_pay_tax_rnd_typ_ListPutter(Hdr_pay_tax_rnd_typ, "pay_tax_rnd_typ", "pay_tax_rnd_typ_nm");

		}
		return Hdr_pay_tax_rnd_typ_p;
	}
	
	
	/** [Hdr_pay_schd_ba_typ_ListPutter]の定義 */
	private MCListPutter Hdr_pay_schd_ba_typ_p = null;

	/**
	 * [Hdr_pay_schd_ba_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_pay_schd_ba_typ_ListPutter() {
		if (Hdr_pay_schd_ba_typ_p == null) {
			Hdr_pay_schd_ba_typ_p = createHdr_pay_schd_ba_typ_ListPutter(Hdr_pay_schd_ba_typ, "pay_schd_ba_typ", "pay_schd_ba_typ_nm");

		}
		return Hdr_pay_schd_ba_typ_p;
	}
	
	
	/** [Hdr_pay_schd_cl_ba_typ_ListPutter]の定義 */
	private MCListPutter Hdr_pay_schd_cl_ba_typ_p = null;

	/**
	 * [Hdr_pay_schd_cl_ba_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_pay_schd_cl_ba_typ_ListPutter() {
		if (Hdr_pay_schd_cl_ba_typ_p == null) {
			Hdr_pay_schd_cl_ba_typ_p = createHdr_pay_schd_cl_ba_typ_ListPutter(Hdr_pay_schd_cl_ba_typ, "pay_schd_cl_ba_typ", "pay_schd_cl_ba_typ_nm");

		}
		return Hdr_pay_schd_cl_ba_typ_p;
	}
	
	
	/** [Hdr_bsppl_prnt_typ_ListPutter]の定義 */
	private MCListPutter Hdr_bsppl_prnt_typ_p = null;

	/**
	 * [Hdr_bsppl_prnt_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_bsppl_prnt_typ_ListPutter() {
		if (Hdr_bsppl_prnt_typ_p == null) {
			Hdr_bsppl_prnt_typ_p = createHdr_bsppl_prnt_typ_ListPutter(Hdr_bsppl_prnt_typ, "bsppl_prnt_typ", "bsppl_prnt_typ_nm");

		}
		return Hdr_bsppl_prnt_typ_p;
	}
	
	
	/** [Hdr_pay_ntc_dtl_subttl_typ_ListPutter]の定義 */
	private MCListPutter Hdr_pay_ntc_dtl_subttl_typ_p = null;

	/**
	 * [Hdr_pay_ntc_dtl_subttl_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_pay_ntc_dtl_subttl_typ_ListPutter() {
		if (Hdr_pay_ntc_dtl_subttl_typ_p == null) {
			Hdr_pay_ntc_dtl_subttl_typ_p = createHdr_pay_ntc_dtl_subttl_typ_ListPutter(Hdr_pay_ntc_dtl_subttl_typ, "pay_ntc_dtl_subttl_typ", "pay_ntc_dtl_subttl_typ_nm");

		}
		return Hdr_pay_ntc_dtl_subttl_typ_p;
	}
	
	
	/** [Hdr_pay_ntc_dtl_brk_typ_ListPutter]の定義 */
	private MCListPutter Hdr_pay_ntc_dtl_brk_typ_p = null;

	/**
	 * [Hdr_pay_ntc_dtl_brk_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_pay_ntc_dtl_brk_typ_ListPutter() {
		if (Hdr_pay_ntc_dtl_brk_typ_p == null) {
			Hdr_pay_ntc_dtl_brk_typ_p = createHdr_pay_ntc_dtl_brk_typ_ListPutter(Hdr_pay_ntc_dtl_brk_typ, "pay_ntc_dtl_brk_typ", "pay_ntc_dtl_brk_typ_nm");

		}
		return Hdr_pay_ntc_dtl_brk_typ_p;
	}
	
	
	/** [Hdr_pay_ntc_dtl_sort_typ_ListPutter]の定義 */
	private MCListPutter Hdr_pay_ntc_dtl_sort_typ_p = null;

	/**
	 * [Hdr_pay_ntc_dtl_sort_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_pay_ntc_dtl_sort_typ_ListPutter() {
		if (Hdr_pay_ntc_dtl_sort_typ_p == null) {
			Hdr_pay_ntc_dtl_sort_typ_p = createHdr_pay_ntc_dtl_sort_typ_ListPutter(Hdr_pay_ntc_dtl_sort_typ, "pay_ntc_dtl_sort_typ", "pay_ntc_dtl_sort_typ_nm");

		}
		return Hdr_pay_ntc_dtl_sort_typ_p;
	}
	
	
	/** [Hdr_pay_ntc_can_slip_typ_ListPutter]の定義 */
	private MCListPutter Hdr_pay_ntc_can_slip_typ_p = null;

	/**
	 * [Hdr_pay_ntc_can_slip_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_pay_ntc_can_slip_typ_ListPutter() {
		if (Hdr_pay_ntc_can_slip_typ_p == null) {
			Hdr_pay_ntc_can_slip_typ_p = createHdr_pay_ntc_can_slip_typ_ListPutter(Hdr_pay_ntc_can_slip_typ, "pay_ntc_can_slip_typ", "pay_ntc_can_slip_typ_nm");

		}
		return Hdr_pay_ntc_can_slip_typ_p;
	}
	
	
	/** [Hdr_pay_dpt_cd_ListPutter]の定義 */
	private MCListPutter Hdr_pay_dpt_cd_p = null;

	/**
	 * [Hdr_pay_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_pay_dpt_cd_ListPutter() {
		if (Hdr_pay_dpt_cd_p == null) {
			Hdr_pay_dpt_cd_p = createHdr_pay_dpt_cd_ListPutter(Hdr_pay_dpt_cd, "pay_dpt_cd", "pay_dpt_nm");

		}
		return Hdr_pay_dpt_cd_p;
	}
	
	
	/** [Hdr_psppl_prnt_typ_ListPutter]の定義 */
	private MCListPutter Hdr_psppl_prnt_typ_p = null;

	/**
	 * [Hdr_psppl_prnt_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_psppl_prnt_typ_ListPutter() {
		if (Hdr_psppl_prnt_typ_p == null) {
			Hdr_psppl_prnt_typ_p = createHdr_psppl_prnt_typ_ListPutter(Hdr_psppl_prnt_typ, "psppl_prnt_typ", "psppl_prnt_typ_nm");

		}
		return Hdr_psppl_prnt_typ_p;
	}
	
	
	/** [Wrk3Dtl_cur_cd_ListPutter]の定義 */
	private MCListPutter Wrk3Dtl_cur_cd_p = null;

	/**
	 * [Wrk3Dtl_cur_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk3Dtl_cur_cd_ListPutter() {
		if (Wrk3Dtl_cur_cd_p == null) {
			Wrk3Dtl_cur_cd_p = createWrk3Dtl_cur_cd_ListPutter(columnWrk3Dtl_cur_cd, "cur_cd", "cur_nm","amt_dec_place");

		}
		return Wrk3Dtl_cur_cd_p;
	}
	
	
	/** [Wrk3Dtl_sttl_cd_ListPutter]の定義 */
	private MCListPutter Wrk3Dtl_sttl_cd_p = null;

	/**
	 * [Wrk3Dtl_sttl_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk3Dtl_sttl_cd_ListPutter() {
		if (Wrk3Dtl_sttl_cd_p == null) {
			Wrk3Dtl_sttl_cd_p = createWrk3Dtl_sttl_cd_ListPutter(columnWrk3Dtl_sttl_cd, "sttl_cd", "sttl_nm","ap_sttl_typ");

		}
		return Wrk3Dtl_sttl_cd_p;
	}
	
	
	/** [Wrk3Dtl_wg_cd_ListPutter]の定義 */
	private MCListPutter Wrk3Dtl_wg_cd_p = null;

	/**
	 * [Wrk3Dtl_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk3Dtl_wg_cd_ListPutter() {
		if (Wrk3Dtl_wg_cd_p == null) {
			Wrk3Dtl_wg_cd_p = createWrk3Dtl_wg_cd_ListPutter(columnWrk3Dtl_wg_cd, "wg_cd", "wg_nm");

		}
		return Wrk3Dtl_wg_cd_p;
	}
	
	
	/** [Wrk3Dtl_crryovr_mons_typ_ListPutter]の定義 */
	private MCListPutter Wrk3Dtl_crryovr_mons_typ_p = null;

	/**
	 * [Wrk3Dtl_crryovr_mons_typ_ListPutter]の取得
	 */
	protected MCListPutter getWrk3Dtl_crryovr_mons_typ_ListPutter() {
		if (Wrk3Dtl_crryovr_mons_typ_p == null) {
			Wrk3Dtl_crryovr_mons_typ_p = createWrk3Dtl_crryovr_mons_typ_ListPutter(columnWrk3Dtl_crryovr_mons_typ, "crryovr_mons_typ", "crryovr_mons_typ_nm");

		}
		return Wrk3Dtl_crryovr_mons_typ_p;
	}
	
	
	/** [Wrk5Dtl_if_proc_typ_ListPutter]の定義 */
	private MCListPutter Wrk5Dtl_if_proc_typ_p = null;

	/**
	 * [Wrk5Dtl_if_proc_typ_ListPutter]の取得
	 */
	protected MCListPutter getWrk5Dtl_if_proc_typ_ListPutter() {
		if (Wrk5Dtl_if_proc_typ_p == null) {
			Wrk5Dtl_if_proc_typ_p = createWrk5Dtl_if_proc_typ_ListPutter(columnWrk5Dtl_if_proc_typ, "if_proc_typ", "if_proc_typ_nm");

		}
		return Wrk5Dtl_if_proc_typ_p;
	}
	
	
	/** [Wrk5Dtl_ext_sys_cd_ListPutter]の定義 */
	private MCListPutter Wrk5Dtl_ext_sys_cd_p = null;

	/**
	 * [Wrk5Dtl_ext_sys_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk5Dtl_ext_sys_cd_ListPutter() {
		if (Wrk5Dtl_ext_sys_cd_p == null) {
			Wrk5Dtl_ext_sys_cd_p = createWrk5Dtl_ext_sys_cd_ListPutter(columnWrk5Dtl_ext_sys_cd, "ext_sys_cd", "ext_sys_nm");

		}
		return Wrk5Dtl_ext_sys_cd_p;
	}
	
	
	/** [HdrAll_pay_ntc_dtl_subttl_typ_ListPutter]の定義 */
	private MCListPutter HdrAll_pay_ntc_dtl_subttl_typ_p = null;

	/**
	 * [HdrAll_pay_ntc_dtl_subttl_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdrAll_pay_ntc_dtl_subttl_typ_ListPutter() {
		if (HdrAll_pay_ntc_dtl_subttl_typ_p == null) {
			HdrAll_pay_ntc_dtl_subttl_typ_p = createHdrAll_pay_ntc_dtl_subttl_typ_ListPutter(columnHdrAll_pay_ntc_dtl_subttl_typ, "pay_ntc_dtl_subttl_typ");

		}
		return HdrAll_pay_ntc_dtl_subttl_typ_p;
	}
	
	
	/** [HdrAll_pay_ntc_dtl_brk_typ_ListPutter]の定義 */
	private MCListPutter HdrAll_pay_ntc_dtl_brk_typ_p = null;

	/**
	 * [HdrAll_pay_ntc_dtl_brk_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdrAll_pay_ntc_dtl_brk_typ_ListPutter() {
		if (HdrAll_pay_ntc_dtl_brk_typ_p == null) {
			HdrAll_pay_ntc_dtl_brk_typ_p = createHdrAll_pay_ntc_dtl_brk_typ_ListPutter(columnHdrAll_pay_ntc_dtl_brk_typ, "pay_ntc_dtl_brk_typ");

		}
		return HdrAll_pay_ntc_dtl_brk_typ_p;
	}
	
	
	/** [HdrAll_pay_ntc_dtl_sort_typ_ListPutter]の定義 */
	private MCListPutter HdrAll_pay_ntc_dtl_sort_typ_p = null;

	/**
	 * [HdrAll_pay_ntc_dtl_sort_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdrAll_pay_ntc_dtl_sort_typ_ListPutter() {
		if (HdrAll_pay_ntc_dtl_sort_typ_p == null) {
			HdrAll_pay_ntc_dtl_sort_typ_p = createHdrAll_pay_ntc_dtl_sort_typ_ListPutter(columnHdrAll_pay_ntc_dtl_sort_typ, "pay_ntc_dtl_sort_typ");

		}
		return HdrAll_pay_ntc_dtl_sort_typ_p;
	}
	
	
	/** [HdrAll_pay_ntc_can_slip_typ_ListPutter]の定義 */
	private MCListPutter HdrAll_pay_ntc_can_slip_typ_p = null;

	/**
	 * [HdrAll_pay_ntc_can_slip_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdrAll_pay_ntc_can_slip_typ_ListPutter() {
		if (HdrAll_pay_ntc_can_slip_typ_p == null) {
			HdrAll_pay_ntc_can_slip_typ_p = createHdrAll_pay_ntc_can_slip_typ_ListPutter(columnHdrAll_pay_ntc_can_slip_typ, "pay_ntc_can_slip_typ");

		}
		return HdrAll_pay_ntc_can_slip_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_BspplPspplReg create(){
		MABCP_BspplPspplReg p = new MABCP_BspplPspplReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABCP_BspplPspplReg create(String name){
		MABCP_BspplPspplReg p = new MABCP_BspplPspplReg(name);
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
		MABCP_BspplPspplReg_MC.jbfInitScreenOpe((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbfInitMst((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbfInitTop((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbfInitFold((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbfInitCnd((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbfInitCtrl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbfInitTbl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbfInitHdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbfInitDtlTab((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbfInitWrk1Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbfInitWrk4Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbfInitWrk2Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbfInitWrk3((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbfInitWrk3Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbfInitWrk3Dtl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbfInitWrk3DtlBtn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbfInitWrk5((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbfInitWrk5Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbfInitWrk5Dtl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbfInitWrk5DtlBtn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbfInitBtn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbfInitHdrAll((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitScreenOpe((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitMst((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitTop((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitFold((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitCnd((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitCtrl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitTbl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitHdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitDtlTab((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitWrk1Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitWrk4Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitWrk2Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitWrk3((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitWrk3Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitWrk3Dtl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitWrk3DtlBtn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitWrk5((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitWrk5Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitWrk5Dtl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitWrk5DtlBtn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitBtn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.jbInitHdrAll((MABCP_BspplPspplReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABCP_BspplPspplReg p) {
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
	protected static void jbfInitTop(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABCP_BspplPspplReg p) {
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
	protected static void jbfInitCtrl(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Tbl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTbl(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.TblPanel = p.beansFactory.createPanel("Tbl");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		p.HdrTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Hdr_bp_cd_Label = p.beansFactory.createLabel("Hdr.bp_cd_Label");
		p.Hdr_bp_cd = p.beansFactory.createTextField("Hdr.bp_cd");
		p.Hdr_bp_cd.setLabel(p.Hdr_bp_cd_Label);
		p.Hdr_bp_nm = p.beansFactory.createTextField("Hdr.bp_nm");
		p.Hdr_bsppl_flg = p.beansFactory.createCheckBox("Hdr.bsppl_flg");
		p.Hdr_psppl_flg = p.beansFactory.createCheckBox("Hdr.psppl_flg");
		p.Hdr_psppl_cd_Label = p.beansFactory.createLabel("Hdr.psppl_cd_Label");
		p.Hdr_psppl_cd = p.beansFactory.createTextField("Hdr.psppl_cd");
		p.Hdr_psppl_cd.setLabel(p.Hdr_psppl_cd_Label);
		p.Hdr_psppl_nm = p.beansFactory.createTextField("Hdr.psppl_nm");
		p.Hdr_bsppl_dpt_cd_Label = p.beansFactory.createLabel("Hdr.bsppl_dpt_cd_Label");
		p.Hdr_bsppl_dpt_cd = p.beansFactory.createTextComboBox("Hdr.bsppl_dpt_cd");
		p.Hdr_bsppl_dpt_cd.setLabel(p.Hdr_bsppl_dpt_cd_Label);
		p.Hdr_bsppl_dpt_nm = p.beansFactory.createTextField("Hdr.bsppl_dpt_nm");
		p.Hdr_check_bsppl_dpt_cd = p.beansFactory.createTextField("Hdr.check_bsppl_dpt_cd");
		p.Hdr_ap_cred_cd_Label = p.beansFactory.createLabel("Hdr.ap_cred_cd_Label");
		p.Hdr_ap_cred_cd = p.beansFactory.createTextField("Hdr.ap_cred_cd");
		p.Hdr_ap_cred_cd.setLabel(p.Hdr_ap_cred_cd_Label);
		p.Hdr_ap_cred_nm = p.beansFactory.createTextField("Hdr.ap_cred_nm");
		p.Hdr_purc_interim_cl_flg = p.beansFactory.createCheckBox("Hdr.purc_interim_cl_flg");
		p.Hdr_pay_bank_ac_cd_Label = p.beansFactory.createLabel("Hdr.pay_bank_ac_cd_Label");
		p.Hdr_pay_bank_ac_cd = p.beansFactory.createTextComboBox("Hdr.pay_bank_ac_cd");
		p.Hdr_pay_bank_ac_cd.setLabel(p.Hdr_pay_bank_ac_cd_Label);
		p.Hdr_pay_bank_ac_nm = p.beansFactory.createTextField("Hdr.pay_bank_ac_nm");
		p.Hdr_pay_spot_flg = p.beansFactory.createCheckBox("Hdr.pay_spot_flg");
		p.Hdr_psppl_cl_day1_Label = p.beansFactory.createLabel("Hdr.psppl_cl_day1_Label");
		p.Hdr_psppl_cl_day1 = p.beansFactory.createNumberField("Hdr.psppl_cl_day1");
		p.Hdr_psppl_cl_day1.setLabel(p.Hdr_psppl_cl_day1_Label);
		p.Hdr_psppl_cl_day2_Label = p.beansFactory.createLabel("Hdr.psppl_cl_day2_Label");
		p.Hdr_psppl_cl_day2 = p.beansFactory.createNumberField("Hdr.psppl_cl_day2");
		p.Hdr_psppl_cl_day2.setLabel(p.Hdr_psppl_cl_day2_Label);
		p.Hdr_psppl_cl_day3_Label = p.beansFactory.createLabel("Hdr.psppl_cl_day3_Label");
		p.Hdr_psppl_cl_day3 = p.beansFactory.createNumberField("Hdr.psppl_cl_day3");
		p.Hdr_psppl_cl_day3.setLabel(p.Hdr_psppl_cl_day3_Label);
		p.Hdr_psppl_cl_day4_Label = p.beansFactory.createLabel("Hdr.psppl_cl_day4_Label");
		p.Hdr_psppl_cl_day4 = p.beansFactory.createNumberField("Hdr.psppl_cl_day4");
		p.Hdr_psppl_cl_day4.setLabel(p.Hdr_psppl_cl_day4_Label);
		p.Hdr_psppl_cl_day5_Label = p.beansFactory.createLabel("Hdr.psppl_cl_day5_Label");
		p.Hdr_psppl_cl_day5 = p.beansFactory.createNumberField("Hdr.psppl_cl_day5");
		p.Hdr_psppl_cl_day5.setLabel(p.Hdr_psppl_cl_day5_Label);
		p.Hdr_ap_setoff_grp_cd_Label = p.beansFactory.createLabel("Hdr.ap_setoff_grp_cd_Label");
		p.Hdr_ap_setoff_grp_cd = p.beansFactory.createTextComboBox("Hdr.ap_setoff_grp_cd");
		p.Hdr_ap_setoff_grp_cd.setLabel(p.Hdr_ap_setoff_grp_cd_Label);
		p.Hdr_ap_setoff_grp_nm = p.beansFactory.createTextField("Hdr.ap_setoff_grp_nm");
		p.Hdr_tax_on_pay_flg = p.beansFactory.createCheckBox("Hdr.tax_on_pay_flg");
		p.Hdr_pay_tax_rnd_typ_Label = p.beansFactory.createLabel("Hdr.pay_tax_rnd_typ_Label");
		p.Hdr_pay_tax_rnd_typ = p.beansFactory.createTextComboBox("Hdr.pay_tax_rnd_typ");
		p.Hdr_pay_tax_rnd_typ.setLabel(p.Hdr_pay_tax_rnd_typ_Label);
		p.Hdr_pay_tax_rnd_typ_nm = p.beansFactory.createTextField("Hdr.pay_tax_rnd_typ_nm");
		p.Hdr_pay_schd_ba_typ_Label = p.beansFactory.createLabel("Hdr.pay_schd_ba_typ_Label");
		p.Hdr_pay_schd_ba_typ = p.beansFactory.createTextComboBox("Hdr.pay_schd_ba_typ");
		p.Hdr_pay_schd_ba_typ.setLabel(p.Hdr_pay_schd_ba_typ_Label);
		p.Hdr_pay_schd_ba_typ_nm = p.beansFactory.createTextField("Hdr.pay_schd_ba_typ_nm");
		p.Hdr_batch_pay_schd_cl_flg = p.beansFactory.createCheckBox("Hdr.batch_pay_schd_cl_flg");
		p.Hdr_pay_schd_cl_delay_days_Label = p.beansFactory.createLabel("Hdr.pay_schd_cl_delay_days_Label");
		p.Hdr_pay_schd_cl_delay_days = p.beansFactory.createNumberField("Hdr.pay_schd_cl_delay_days");
		p.Hdr_pay_schd_cl_delay_days.setLabel(p.Hdr_pay_schd_cl_delay_days_Label);
		p.Hdr_pay_schd_cl_ba_typ_Label = p.beansFactory.createLabel("Hdr.pay_schd_cl_ba_typ_Label");
		p.Hdr_pay_schd_cl_ba_typ = p.beansFactory.createTextComboBox("Hdr.pay_schd_cl_ba_typ");
		p.Hdr_pay_schd_cl_ba_typ.setLabel(p.Hdr_pay_schd_cl_ba_typ_Label);
		p.Hdr_pay_schd_cl_ba_typ_nm = p.beansFactory.createTextField("Hdr.pay_schd_cl_ba_typ_nm");
		p.Hdr_bsppl_prnt_typ_Label = p.beansFactory.createLabel("Hdr.bsppl_prnt_typ_Label");
		p.Hdr_bsppl_prnt_typ = p.beansFactory.createTextComboBox("Hdr.bsppl_prnt_typ");
		p.Hdr_bsppl_prnt_typ.setLabel(p.Hdr_bsppl_prnt_typ_Label);
		p.Hdr_bsppl_prnt_typ_nm = p.beansFactory.createTextField("Hdr.bsppl_prnt_typ_nm");
		p.Hdr_pay_ntc_prnt_flg = p.beansFactory.createCheckBox("Hdr.pay_ntc_prnt_flg");
		p.Hdr_pay_ntc_zip_cd_Label = p.beansFactory.createLabel("Hdr.pay_ntc_zip_cd_Label");
		p.Hdr_pay_ntc_zip_cd = p.beansFactory.createTextField("Hdr.pay_ntc_zip_cd");
		p.Hdr_pay_ntc_zip_cd.setLabel(p.Hdr_pay_ntc_zip_cd_Label);
		p.Hdr_pay_ntc_addr1_Label = p.beansFactory.createLabel("Hdr.pay_ntc_addr1_Label");
		p.Hdr_pay_ntc_addr1 = p.beansFactory.createTextField("Hdr.pay_ntc_addr1");
		p.Hdr_pay_ntc_addr1.setLabel(p.Hdr_pay_ntc_addr1_Label);
		p.Hdr_pay_ntc_addr2_Label = p.beansFactory.createLabel("Hdr.pay_ntc_addr2_Label");
		p.Hdr_pay_ntc_addr2 = p.beansFactory.createTextField("Hdr.pay_ntc_addr2");
		p.Hdr_pay_ntc_addr2.setLabel(p.Hdr_pay_ntc_addr2_Label);
		p.Hdr_pay_ntc_addr3_Label = p.beansFactory.createLabel("Hdr.pay_ntc_addr3_Label");
		p.Hdr_pay_ntc_addr3 = p.beansFactory.createTextField("Hdr.pay_ntc_addr3");
		p.Hdr_pay_ntc_addr3.setLabel(p.Hdr_pay_ntc_addr3_Label);
		p.Hdr_pay_ntc_addr4_Label = p.beansFactory.createLabel("Hdr.pay_ntc_addr4_Label");
		p.Hdr_pay_ntc_addr4 = p.beansFactory.createTextField("Hdr.pay_ntc_addr4");
		p.Hdr_pay_ntc_addr4.setLabel(p.Hdr_pay_ntc_addr4_Label);
		p.Hdr_pay_ntc_tel_Label = p.beansFactory.createLabel("Hdr.pay_ntc_tel_Label");
		p.Hdr_pay_ntc_tel = p.beansFactory.createTextField("Hdr.pay_ntc_tel");
		p.Hdr_pay_ntc_tel.setLabel(p.Hdr_pay_ntc_tel_Label);
		p.Hdr_pay_ntc_bsppl_nm_Label = p.beansFactory.createLabel("Hdr.pay_ntc_bsppl_nm_Label");
		p.Hdr_pay_ntc_bsppl_nm = p.beansFactory.createTextField("Hdr.pay_ntc_bsppl_nm");
		p.Hdr_pay_ntc_bsppl_nm.setLabel(p.Hdr_pay_ntc_bsppl_nm_Label);
		p.Hdr_pay_ntc_bsppl_dpt_Label = p.beansFactory.createLabel("Hdr.pay_ntc_bsppl_dpt_Label");
		p.Hdr_pay_ntc_bsppl_dpt = p.beansFactory.createTextField("Hdr.pay_ntc_bsppl_dpt");
		p.Hdr_pay_ntc_bsppl_dpt.setLabel(p.Hdr_pay_ntc_bsppl_dpt_Label);
		p.Hdr_pay_ntc_bsppl_psn_Label = p.beansFactory.createLabel("Hdr.pay_ntc_bsppl_psn_Label");
		p.Hdr_pay_ntc_bsppl_psn = p.beansFactory.createTextField("Hdr.pay_ntc_bsppl_psn");
		p.Hdr_pay_ntc_bsppl_psn.setLabel(p.Hdr_pay_ntc_bsppl_psn_Label);
		p.Hdr_pay_ntc_bsppl_psn_title_Label = p.beansFactory.createLabel("Hdr.pay_ntc_bsppl_psn_title_Label");
		p.Hdr_pay_ntc_bsppl_psn_title = p.beansFactory.createTextField("Hdr.pay_ntc_bsppl_psn_title");
		p.Hdr_pay_ntc_bsppl_psn_title.setLabel(p.Hdr_pay_ntc_bsppl_psn_title_Label);
		p.Hdr_pay_ntc_dtl_outp_flg = p.beansFactory.createCheckBox("Hdr.pay_ntc_dtl_outp_flg");
		p.Hdr_pay_ntc_bfw_bal_disp_flg = p.beansFactory.createCheckBox("Hdr.pay_ntc_bfw_bal_disp_flg");
		p.Hdr_pay_ntc_adv_pay_flg = p.beansFactory.createCheckBox("Hdr.pay_ntc_adv_pay_flg");
		p.Hdr_pay_ntc_dtl_pay_flg = p.beansFactory.createCheckBox("Hdr.pay_ntc_dtl_pay_flg");
		p.Hdr_pay_ntc_dtl_subttl_typ_Label = p.beansFactory.createLabel("Hdr.pay_ntc_dtl_subttl_typ_Label");
		p.Hdr_pay_ntc_dtl_subttl_typ = p.beansFactory.createTextComboBox("Hdr.pay_ntc_dtl_subttl_typ");
		p.Hdr_pay_ntc_dtl_subttl_typ.setLabel(p.Hdr_pay_ntc_dtl_subttl_typ_Label);
		p.Hdr_pay_ntc_dtl_subttl_typ_nm = p.beansFactory.createTextField("Hdr.pay_ntc_dtl_subttl_typ_nm");
		p.Hdr_pay_ntc_dtl_brk_typ_Label = p.beansFactory.createLabel("Hdr.pay_ntc_dtl_brk_typ_Label");
		p.Hdr_pay_ntc_dtl_brk_typ = p.beansFactory.createTextComboBox("Hdr.pay_ntc_dtl_brk_typ");
		p.Hdr_pay_ntc_dtl_brk_typ.setLabel(p.Hdr_pay_ntc_dtl_brk_typ_Label);
		p.Hdr_pay_ntc_dtl_brk_typ_nm = p.beansFactory.createTextField("Hdr.pay_ntc_dtl_brk_typ_nm");
		p.Hdr_pay_ntc_dtl_sort_typ_Label = p.beansFactory.createLabel("Hdr.pay_ntc_dtl_sort_typ_Label");
		p.Hdr_pay_ntc_dtl_sort_typ = p.beansFactory.createTextComboBox("Hdr.pay_ntc_dtl_sort_typ");
		p.Hdr_pay_ntc_dtl_sort_typ.setLabel(p.Hdr_pay_ntc_dtl_sort_typ_Label);
		p.Hdr_pay_ntc_dtl_sort_typ_nm = p.beansFactory.createTextField("Hdr.pay_ntc_dtl_sort_typ_nm");
		p.Hdr_pay_ntc_can_slip_typ_Label = p.beansFactory.createLabel("Hdr.pay_ntc_can_slip_typ_Label");
		p.Hdr_pay_ntc_can_slip_typ = p.beansFactory.createTextComboBox("Hdr.pay_ntc_can_slip_typ");
		p.Hdr_pay_ntc_can_slip_typ.setLabel(p.Hdr_pay_ntc_can_slip_typ_Label);
		p.Hdr_pay_ntc_can_slip_typ_nm = p.beansFactory.createTextField("Hdr.pay_ntc_can_slip_typ_nm");
		p.Hdr_psppl_rmrks_Label = p.beansFactory.createLabel("Hdr.psppl_rmrks_Label");
		p.Hdr_psppl_rmrks = p.beansFactory.createTextField("Hdr.psppl_rmrks");
		p.Hdr_psppl_rmrks.setLabel(p.Hdr_psppl_rmrks_Label);
		p.Hdr_note_days_Label = p.beansFactory.createLabel("Hdr.note_days_Label");
		p.Hdr_note_days = p.beansFactory.createNumberField("Hdr.note_days");
		p.Hdr_note_days.setLabel(p.Hdr_note_days_Label);
		p.Hdr_pay_dpt_cd_Label = p.beansFactory.createLabel("Hdr.pay_dpt_cd_Label");
		p.Hdr_pay_dpt_cd = p.beansFactory.createTextComboBox("Hdr.pay_dpt_cd");
		p.Hdr_pay_dpt_cd.setLabel(p.Hdr_pay_dpt_cd_Label);
		p.Hdr_pay_dpt_nm = p.beansFactory.createTextField("Hdr.pay_dpt_nm");
		p.Hdr_check_pay_dpt_cd = p.beansFactory.createTextField("Hdr.check_pay_dpt_cd");
		p.Hdr_psppl_prnt_typ_Label = p.beansFactory.createLabel("Hdr.psppl_prnt_typ_Label");
		p.Hdr_psppl_prnt_typ = p.beansFactory.createTextComboBox("Hdr.psppl_prnt_typ");
		p.Hdr_psppl_prnt_typ.setLabel(p.Hdr_psppl_prnt_typ_Label);
		p.Hdr_psppl_prnt_typ_nm = p.beansFactory.createTextField("Hdr.psppl_prnt_typ_nm");
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlTab(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.DtlTabPanel = p.beansFactory.createPanel("DtlTab");
		p.DtlTabTab = p.beansFactory.createTabbedPane("DtlTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk1Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk1Hdr(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.Wrk1HdrPanel = p.beansFactory.createPanel("Wrk1Hdr");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk4Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk4Hdr(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.Wrk4HdrPanel = p.beansFactory.createPanel("Wrk4Hdr");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk2Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk2Hdr(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.Wrk2HdrPanel = p.beansFactory.createPanel("Wrk2Hdr");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk3(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.Wrk3Panel = p.beansFactory.createPanel("Wrk3");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk3Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk3Hdr(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.Wrk3HdrPanel = p.beansFactory.createPanel("Wrk3Hdr");
		// ブロックの項目の初期化
		p.Wrk3Hdr_psppl_cl_day1_Label = p.beansFactory.createLabel("Wrk3Hdr.psppl_cl_day1_Label");
		p.Wrk3Hdr_psppl_cl_day1 = p.beansFactory.createNumberField("Wrk3Hdr.psppl_cl_day1");
		p.Wrk3Hdr_psppl_cl_day1.setLabel(p.Wrk3Hdr_psppl_cl_day1_Label);
		p.Wrk3Hdr_psppl_cl_day2_Label = p.beansFactory.createLabel("Wrk3Hdr.psppl_cl_day2_Label");
		p.Wrk3Hdr_psppl_cl_day2 = p.beansFactory.createNumberField("Wrk3Hdr.psppl_cl_day2");
		p.Wrk3Hdr_psppl_cl_day2.setLabel(p.Wrk3Hdr_psppl_cl_day2_Label);
		p.Wrk3Hdr_psppl_cl_day3_Label = p.beansFactory.createLabel("Wrk3Hdr.psppl_cl_day3_Label");
		p.Wrk3Hdr_psppl_cl_day3 = p.beansFactory.createNumberField("Wrk3Hdr.psppl_cl_day3");
		p.Wrk3Hdr_psppl_cl_day3.setLabel(p.Wrk3Hdr_psppl_cl_day3_Label);
		p.Wrk3Hdr_psppl_cl_day4_Label = p.beansFactory.createLabel("Wrk3Hdr.psppl_cl_day4_Label");
		p.Wrk3Hdr_psppl_cl_day4 = p.beansFactory.createNumberField("Wrk3Hdr.psppl_cl_day4");
		p.Wrk3Hdr_psppl_cl_day4.setLabel(p.Wrk3Hdr_psppl_cl_day4_Label);
		p.Wrk3Hdr_psppl_cl_day5_Label = p.beansFactory.createLabel("Wrk3Hdr.psppl_cl_day5_Label");
		p.Wrk3Hdr_psppl_cl_day5 = p.beansFactory.createNumberField("Wrk3Hdr.psppl_cl_day5");
		p.Wrk3Hdr_psppl_cl_day5.setLabel(p.Wrk3Hdr_psppl_cl_day5_Label);
	}

	/**
	 * [Wrk3Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk3Dtl(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.Wrk3DtlPanel = p.beansFactory.createPanel("Wrk3Dtl");
		p.Wrk3DtlScrollPane = p.beansFactory.createScrollPane("Wrk3Dtl.scroll");
		p.createWrk3DtlTable();
		// ブロックの項目の初期化
		p.columnWrk3Dtl_check = p.beansFactory.createTableColumn("Wrk3Dtl.check", MCColumnType.CHECK);
		p.columnWrk3Dtl_del_flg = p.beansFactory.createTableColumn("Wrk3Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk3Dtl_bsppl_cd = p.beansFactory.createTableColumn("Wrk3Dtl.bsppl_cd", MCColumnType.TEXT);
		p.columnWrk3Dtl_psppl_cl_day1 = p.beansFactory.createTableColumn("Wrk3Dtl.psppl_cl_day1", MCColumnType.NUMBER);
		p.columnWrk3Dtl_psppl_cl_day2 = p.beansFactory.createTableColumn("Wrk3Dtl.psppl_cl_day2", MCColumnType.NUMBER);
		p.columnWrk3Dtl_psppl_cl_day3 = p.beansFactory.createTableColumn("Wrk3Dtl.psppl_cl_day3", MCColumnType.NUMBER);
		p.columnWrk3Dtl_psppl_cl_day4 = p.beansFactory.createTableColumn("Wrk3Dtl.psppl_cl_day4", MCColumnType.NUMBER);
		p.columnWrk3Dtl_psppl_cl_day5 = p.beansFactory.createTableColumn("Wrk3Dtl.psppl_cl_day5", MCColumnType.NUMBER);
		p.columnWrk3Dtl_cur_cd = p.beansFactory.createTableColumn("Wrk3Dtl.cur_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk3Dtl_cur_nm = p.beansFactory.createTableColumn("Wrk3Dtl.cur_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_amt_dec_place = p.beansFactory.createTableColumn("Wrk3Dtl.amt_dec_place", MCColumnType.NUMBER);
		p.columnWrk3Dtl_sttl_cd = p.beansFactory.createTableColumn("Wrk3Dtl.sttl_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk3Dtl_sttl_nm = p.beansFactory.createTableColumn("Wrk3Dtl.sttl_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_ap_sttl_typ = p.beansFactory.createTableColumn("Wrk3Dtl.ap_sttl_typ", MCColumnType.TEXT);
		p.columnWrk3Dtl_wg_cd = p.beansFactory.createTableColumn("Wrk3Dtl.wg_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk3Dtl_wg_nm = p.beansFactory.createTableColumn("Wrk3Dtl.wg_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_rate = p.beansFactory.createTableColumn("Wrk3Dtl.rate", MCColumnType.NUMBER);
		p.columnWrk3Dtl_crryovr_mons_typ = p.beansFactory.createTableColumn("Wrk3Dtl.crryovr_mons_typ", MCColumnType.TEXT_COMBO);
		p.columnWrk3Dtl_crryovr_mons_typ_nm = p.beansFactory.createTableColumn("Wrk3Dtl.crryovr_mons_typ_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_pay_crryovr_mons1 = p.beansFactory.createTableColumn("Wrk3Dtl.pay_crryovr_mons1", MCColumnType.NUMBER);
		p.columnWrk3Dtl_pay_day1 = p.beansFactory.createTableColumn("Wrk3Dtl.pay_day1", MCColumnType.NUMBER);
		p.columnWrk3Dtl_pay_crryovr_mons2 = p.beansFactory.createTableColumn("Wrk3Dtl.pay_crryovr_mons2", MCColumnType.NUMBER);
		p.columnWrk3Dtl_pay_day2 = p.beansFactory.createTableColumn("Wrk3Dtl.pay_day2", MCColumnType.NUMBER);
		p.columnWrk3Dtl_pay_crryovr_mons3 = p.beansFactory.createTableColumn("Wrk3Dtl.pay_crryovr_mons3", MCColumnType.NUMBER);
		p.columnWrk3Dtl_pay_day3 = p.beansFactory.createTableColumn("Wrk3Dtl.pay_day3", MCColumnType.NUMBER);
		p.columnWrk3Dtl_pay_crryovr_mons4 = p.beansFactory.createTableColumn("Wrk3Dtl.pay_crryovr_mons4", MCColumnType.NUMBER);
		p.columnWrk3Dtl_pay_day4 = p.beansFactory.createTableColumn("Wrk3Dtl.pay_day4", MCColumnType.NUMBER);
		p.columnWrk3Dtl_pay_crryovr_mons5 = p.beansFactory.createTableColumn("Wrk3Dtl.pay_crryovr_mons5", MCColumnType.NUMBER);
		p.columnWrk3Dtl_pay_day5 = p.beansFactory.createTableColumn("Wrk3Dtl.pay_day5", MCColumnType.NUMBER);
		p.columnWrk3Dtl_memo1 = p.beansFactory.createTableColumn("Wrk3Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk3Dtl_memo2 = p.beansFactory.createTableColumn("Wrk3Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk3Dtl_memo3 = p.beansFactory.createTableColumn("Wrk3Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk3Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk3Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk3Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk3Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk3Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk3Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk3Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk3Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk3Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk3Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk3Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk3Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk3Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk3Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk3Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk3Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk3Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk3Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk3Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk3Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk3Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk3Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk3Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk3Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_del_ts = p.beansFactory.createTableColumn("Wrk3Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk3DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk3DtlBtn(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.Wrk3DtlBtnPanel = p.beansFactory.createPanel("Wrk3DtlBtn");
		// ブロックの項目の初期化
		p.Wrk3DtlBtn_select_all = p.beansFactory.createButton("Wrk3DtlBtn.select_all", "no_border");
		p.Wrk3DtlBtn_deselect_all = p.beansFactory.createButton("Wrk3DtlBtn.deselect_all", "no_border");
		p.Wrk3DtlBtn_radd = p.beansFactory.createButton("Wrk3DtlBtn.radd", "no_border");
		p.Wrk3DtlBtn_rdel = p.beansFactory.createButton("Wrk3DtlBtn.rdel", "no_border");
		p.Wrk3DtlBtn_rcopy = p.beansFactory.createButton("Wrk3DtlBtn.rcopy", "no_border");
	}

	/**
	 * [Wrk5]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk5(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.Wrk5Panel = p.beansFactory.createPanel("Wrk5");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk5Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk5Hdr(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.Wrk5HdrPanel = p.beansFactory.createPanel("Wrk5Hdr");
		// ブロックの項目の初期化
		p.Wrk5Hdr_st_dt_Label = p.beansFactory.createLabel("Wrk5Hdr.st_dt_Label");
		p.Wrk5Hdr_st_dt = p.beansFactory.createDateField("Wrk5Hdr.st_dt");
		p.Wrk5Hdr_st_dt.setLabel(p.Wrk5Hdr_st_dt_Label);
		p.Wrk5Hdr_end_dt_Label = p.beansFactory.createLabel("Wrk5Hdr.end_dt_Label");
		p.Wrk5Hdr_end_dt = p.beansFactory.createDateField("Wrk5Hdr.end_dt");
		p.Wrk5Hdr_end_dt.setLabel(p.Wrk5Hdr_end_dt_Label);
		p.Wrk5Hdr_set_dt = p.beansFactory.createButton("Wrk5Hdr.set_dt");
	}

	/**
	 * [Wrk5Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk5Dtl(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.Wrk5DtlPanel = p.beansFactory.createPanel("Wrk5Dtl");
		p.Wrk5DtlScrollPane = p.beansFactory.createScrollPane("Wrk5Dtl.scroll");
		p.createWrk5DtlTable();
		// ブロックの項目の初期化
		p.columnWrk5Dtl_check = p.beansFactory.createTableColumn("Wrk5Dtl.check", MCColumnType.CHECK);
		p.columnWrk5Dtl_del_flg = p.beansFactory.createTableColumn("Wrk5Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk5Dtl_bp_cd = p.beansFactory.createTableColumn("Wrk5Dtl.bp_cd", MCColumnType.TEXT);
		p.columnWrk5Dtl_if_proc_typ = p.beansFactory.createTableColumn("Wrk5Dtl.if_proc_typ", MCColumnType.TEXT_COMBO);
		p.columnWrk5Dtl_if_proc_typ_nm = p.beansFactory.createTableColumn("Wrk5Dtl.if_proc_typ_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_not_onr_prov_flg = p.beansFactory.createTableColumn("Wrk5Dtl.not_onr_prov_flg", MCColumnType.CHECK);
		p.columnWrk5Dtl_ext_sys_cd = p.beansFactory.createTableColumn("Wrk5Dtl.ext_sys_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk5Dtl_ext_sys_nm = p.beansFactory.createTableColumn("Wrk5Dtl.ext_sys_nm", MCColumnType.TEXT);
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
	protected static void jbfInitWrk5DtlBtn(MABCP_BspplPspplReg p) {
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
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MABCP0510 = p.beansFactory.createButton("Btn.open_MABCP0510", "open");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
	}

	/**
	 * [HdrAll]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrAll(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.HdrAllPanel = p.beansFactory.createPanel("HdrAll");
		p.HdrAllScrollPane = p.beansFactory.createScrollPane("HdrAll.scroll");
		p.createHdrAllTable();
		// ブロックの項目の初期化
		p.columnHdrAll_check = p.beansFactory.createTableColumn("HdrAll.check", MCColumnType.CHECK);
		p.columnHdrAll_bp_cd = p.beansFactory.createTableColumn("HdrAll.bp_cd", MCColumnType.TEXT);
		p.columnHdrAll_bp_nm = p.beansFactory.createTableColumn("HdrAll.bp_nm", MCColumnType.TEXT);
		p.columnHdrAll_bsppl_flg = p.beansFactory.createTableColumn("HdrAll.bsppl_flg", MCColumnType.CHECK);
		p.columnHdrAll_psppl_flg = p.beansFactory.createTableColumn("HdrAll.psppl_flg", MCColumnType.CHECK);
		p.columnHdrAll_psppl_cd = p.beansFactory.createTableColumn("HdrAll.psppl_cd", MCColumnType.TEXT);
		p.columnHdrAll_psppl_nm = p.beansFactory.createTableColumn("HdrAll.psppl_nm", MCColumnType.TEXT);
		p.columnHdrAll_bsppl_dpt_cd = p.beansFactory.createTableColumn("HdrAll.bsppl_dpt_cd", MCColumnType.TEXT);
		p.columnHdrAll_bsppl_dpt_nm = p.beansFactory.createTableColumn("HdrAll.bsppl_dpt_nm", MCColumnType.TEXT);
		p.columnHdrAll_check_bsppl_dpt_cd = p.beansFactory.createTableColumn("HdrAll.check_bsppl_dpt_cd", MCColumnType.TEXT);
		p.columnHdrAll_ap_cred_cd = p.beansFactory.createTableColumn("HdrAll.ap_cred_cd", MCColumnType.TEXT);
		p.columnHdrAll_ap_cred_nm = p.beansFactory.createTableColumn("HdrAll.ap_cred_nm", MCColumnType.TEXT);
		p.columnHdrAll_purc_interim_cl_flg = p.beansFactory.createTableColumn("HdrAll.purc_interim_cl_flg", MCColumnType.CHECK);
		p.columnHdrAll_pay_bank_ac_cd = p.beansFactory.createTableColumn("HdrAll.pay_bank_ac_cd", MCColumnType.TEXT);
		p.columnHdrAll_pay_bank_ac_nm = p.beansFactory.createTableColumn("HdrAll.pay_bank_ac_nm", MCColumnType.TEXT);
		p.columnHdrAll_pay_spot_flg = p.beansFactory.createTableColumn("HdrAll.pay_spot_flg", MCColumnType.CHECK);
		p.columnHdrAll_psppl_cl_day1 = p.beansFactory.createTableColumn("HdrAll.psppl_cl_day1", MCColumnType.NUMBER);
		p.columnHdrAll_psppl_cl_day2 = p.beansFactory.createTableColumn("HdrAll.psppl_cl_day2", MCColumnType.NUMBER);
		p.columnHdrAll_psppl_cl_day3 = p.beansFactory.createTableColumn("HdrAll.psppl_cl_day3", MCColumnType.NUMBER);
		p.columnHdrAll_psppl_cl_day4 = p.beansFactory.createTableColumn("HdrAll.psppl_cl_day4", MCColumnType.NUMBER);
		p.columnHdrAll_psppl_cl_day5 = p.beansFactory.createTableColumn("HdrAll.psppl_cl_day5", MCColumnType.NUMBER);
		p.columnHdrAll_ap_setoff_grp_cd = p.beansFactory.createTableColumn("HdrAll.ap_setoff_grp_cd", MCColumnType.TEXT);
		p.columnHdrAll_ap_setoff_grp_nm = p.beansFactory.createTableColumn("HdrAll.ap_setoff_grp_nm", MCColumnType.TEXT);
		p.columnHdrAll_tax_on_pay_flg = p.beansFactory.createTableColumn("HdrAll.tax_on_pay_flg", MCColumnType.CHECK);
		p.columnHdrAll_pay_tax_rnd_typ = p.beansFactory.createTableColumn("HdrAll.pay_tax_rnd_typ", MCColumnType.TEXT);
		p.columnHdrAll_pay_tax_rnd_typ_nm = p.beansFactory.createTableColumn("HdrAll.pay_tax_rnd_typ_nm", MCColumnType.TEXT);
		p.columnHdrAll_pay_schd_ba_typ = p.beansFactory.createTableColumn("HdrAll.pay_schd_ba_typ", MCColumnType.TEXT);
		p.columnHdrAll_pay_schd_ba_typ_nm = p.beansFactory.createTableColumn("HdrAll.pay_schd_ba_typ_nm", MCColumnType.TEXT);
		p.columnHdrAll_batch_pay_schd_cl_flg = p.beansFactory.createTableColumn("HdrAll.batch_pay_schd_cl_flg", MCColumnType.CHECK);
		p.columnHdrAll_pay_schd_cl_delay_days = p.beansFactory.createTableColumn("HdrAll.pay_schd_cl_delay_days", MCColumnType.NUMBER);
		p.columnHdrAll_pay_schd_cl_ba_typ = p.beansFactory.createTableColumn("HdrAll.pay_schd_cl_ba_typ", MCColumnType.TEXT);
		p.columnHdrAll_pay_schd_cl_ba_typ_nm = p.beansFactory.createTableColumn("HdrAll.pay_schd_cl_ba_typ_nm", MCColumnType.TEXT);
		p.columnHdrAll_bsppl_prnt_typ = p.beansFactory.createTableColumn("HdrAll.bsppl_prnt_typ", MCColumnType.TEXT);
		p.columnHdrAll_bsppl_prnt_typ_nm = p.beansFactory.createTableColumn("HdrAll.bsppl_prnt_typ_nm", MCColumnType.TEXT);
		p.columnHdrAll_pay_ntc_prnt_flg = p.beansFactory.createTableColumn("HdrAll.pay_ntc_prnt_flg", MCColumnType.CHECK);
		p.columnHdrAll_pay_ntc_zip_cd = p.beansFactory.createTableColumn("HdrAll.pay_ntc_zip_cd", MCColumnType.TEXT);
		p.columnHdrAll_pay_ntc_addr1 = p.beansFactory.createTableColumn("HdrAll.pay_ntc_addr1", MCColumnType.TEXT);
		p.columnHdrAll_pay_ntc_addr2 = p.beansFactory.createTableColumn("HdrAll.pay_ntc_addr2", MCColumnType.TEXT);
		p.columnHdrAll_pay_ntc_addr3 = p.beansFactory.createTableColumn("HdrAll.pay_ntc_addr3", MCColumnType.TEXT);
		p.columnHdrAll_pay_ntc_addr4 = p.beansFactory.createTableColumn("HdrAll.pay_ntc_addr4", MCColumnType.TEXT);
		p.columnHdrAll_pay_ntc_tel = p.beansFactory.createTableColumn("HdrAll.pay_ntc_tel", MCColumnType.TEXT);
		p.columnHdrAll_pay_ntc_bsppl_nm = p.beansFactory.createTableColumn("HdrAll.pay_ntc_bsppl_nm", MCColumnType.TEXT);
		p.columnHdrAll_pay_ntc_bsppl_dpt = p.beansFactory.createTableColumn("HdrAll.pay_ntc_bsppl_dpt", MCColumnType.TEXT);
		p.columnHdrAll_pay_ntc_bsppl_psn = p.beansFactory.createTableColumn("HdrAll.pay_ntc_bsppl_psn", MCColumnType.TEXT);
		p.columnHdrAll_pay_ntc_bsppl_psn_title = p.beansFactory.createTableColumn("HdrAll.pay_ntc_bsppl_psn_title", MCColumnType.TEXT);
		p.columnHdrAll_pay_ntc_dtl_outp_flg = p.beansFactory.createTableColumn("HdrAll.pay_ntc_dtl_outp_flg", MCColumnType.CHECK);
		p.columnHdrAll_pay_ntc_bfw_bal_disp_flg = p.beansFactory.createTableColumn("HdrAll.pay_ntc_bfw_bal_disp_flg", MCColumnType.CHECK);
		p.columnHdrAll_pay_ntc_adv_pay_flg = p.beansFactory.createTableColumn("HdrAll.pay_ntc_adv_pay_flg", MCColumnType.CHECK);
		p.columnHdrAll_pay_ntc_dtl_pay_flg = p.beansFactory.createTableColumn("HdrAll.pay_ntc_dtl_pay_flg", MCColumnType.CHECK);
		p.columnHdrAll_pay_ntc_dtl_subttl_typ = p.beansFactory.createTableColumn("HdrAll.pay_ntc_dtl_subttl_typ", MCColumnType.TEXT_COMBO);
		p.columnHdrAll_pay_ntc_dtl_subttl_typ_nm = p.beansFactory.createTableColumn("HdrAll.pay_ntc_dtl_subttl_typ_nm", MCColumnType.TEXT);
		p.columnHdrAll_pay_ntc_dtl_brk_typ = p.beansFactory.createTableColumn("HdrAll.pay_ntc_dtl_brk_typ", MCColumnType.TEXT_COMBO);
		p.columnHdrAll_pay_ntc_dtl_brk_typ_nm = p.beansFactory.createTableColumn("HdrAll.pay_ntc_dtl_brk_typ_nm", MCColumnType.TEXT);
		p.columnHdrAll_pay_ntc_dtl_sort_typ = p.beansFactory.createTableColumn("HdrAll.pay_ntc_dtl_sort_typ", MCColumnType.TEXT_COMBO);
		p.columnHdrAll_pay_ntc_dtl_sort_typ_nm = p.beansFactory.createTableColumn("HdrAll.pay_ntc_dtl_sort_typ_nm", MCColumnType.TEXT);
		p.columnHdrAll_pay_ntc_can_slip_typ = p.beansFactory.createTableColumn("HdrAll.pay_ntc_can_slip_typ", MCColumnType.TEXT_COMBO);
		p.columnHdrAll_pay_ntc_can_slip_typ_nm = p.beansFactory.createTableColumn("HdrAll.pay_ntc_can_slip_typ_nm", MCColumnType.TEXT);
		p.columnHdrAll_psppl_rmrks = p.beansFactory.createTableColumn("HdrAll.psppl_rmrks", MCColumnType.TEXT);
		p.columnHdrAll_note_days = p.beansFactory.createTableColumn("HdrAll.note_days", MCColumnType.NUMBER);
		p.columnHdrAll_pay_dpt_cd = p.beansFactory.createTableColumn("HdrAll.pay_dpt_cd", MCColumnType.TEXT);
		p.columnHdrAll_pay_dpt_nm = p.beansFactory.createTableColumn("HdrAll.pay_dpt_nm", MCColumnType.TEXT);
		p.columnHdrAll_check_pay_dpt_cd = p.beansFactory.createTableColumn("HdrAll.check_pay_dpt_cd", MCColumnType.TEXT);
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
		p.columnHdrAll_psppl_prnt_typ = p.beansFactory.createTableColumn("HdrAll.psppl_prnt_typ", MCColumnType.TEXT);
		p.columnHdrAll_psppl_prnt_typ_nm = p.beansFactory.createTableColumn("HdrAll.psppl_prnt_typ_nm", MCColumnType.TEXT);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABCP_BspplPspplReg p) {
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
	protected static void jbInitMst(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.TopPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABC.MABCP0580.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABCP_BspplPspplReg p) {
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
	protected static void jbInitFold(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABCP_BspplPspplReg p) {
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABC.MABCP0580.CndR.ope_META);
		p.CndPanel.add(p.Cnd_bp_cd_Label);
		p.CndPanel.add(p.Cnd_bp_cd);
		p.CndPanel.setLastBeans(p.Cnd_bp_cd);
		p.Cnd_bp_cd.setNextBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setRow(p.getCndR(), mcframe.clientMABC.MABCP0580.CndR.bp_cd_META);
		p.Cnd_bp_cd.addLinkBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setListType(MCListType.STRICT);
		p.CndPanel.add(p.Cnd_bp_nm);
		p.Cnd_bp_nm.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_bp_nm.setRow(p.getCndR(), mcframe.clientMABC.MABCP0580.CndR.bp_nm_META);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0580.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABC.MABCP0580.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABCP_BspplPspplReg p) {
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
	protected static void jbInitTbl(MABCP_BspplPspplReg p) {
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
	protected static void jbInitHdr(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setBorder(p.HdrTitledBorder);
		p.HdrPanel.setValueCheck(false);
		p.HdrPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_bp_cd_Label);
		p.HdrPanel.add(p.Hdr_bp_cd);
		p.HdrPanel.setLastBeans(p.Hdr_bp_cd);
		p.Hdr_bp_cd.setNextBeans(p.Hdr_bp_nm);
		p.Hdr_bp_cd.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.bp_cd_META);
		p.HdrPanel.add(p.Hdr_bp_nm);
		p.Hdr_bp_nm.setNextBeans(p.Hdr_bsppl_flg);
		p.Hdr_bp_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.bp_nm_META);
		p.HdrPanel.add(p.Hdr_bsppl_flg);
		p.Hdr_bsppl_flg.setNextBeans(p.Hdr_psppl_flg);
		p.Hdr_bsppl_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.bsppl_flg_META);
		p.HdrPanel.add(p.Hdr_psppl_flg);
		p.Hdr_psppl_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.psppl_flg_META);
		p.Wrk1HdrPanel.add(p.Hdr_psppl_cd_Label);
		p.Wrk1HdrPanel.add(p.Hdr_psppl_cd);
		p.Wrk1HdrPanel.setLastBeans(p.Hdr_psppl_cd);
		p.Hdr_psppl_cd.setNextBeans(p.Hdr_psppl_nm);
		p.Hdr_psppl_cd.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.psppl_cd_META);
		p.Hdr_psppl_cd.addLinkBeans(p.Hdr_psppl_nm);
		p.Hdr_psppl_cd.setListType(MCListType.STRICT);
		p.Wrk1HdrPanel.add(p.Hdr_psppl_nm);
		p.Hdr_psppl_nm.setNextBeans(p.Hdr_bsppl_dpt_cd);
		p.Hdr_psppl_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.psppl_nm_META);
		p.Hdr_bsppl_dpt_cd.setListType(MCListType.STRICT);
		p.Hdr_bsppl_dpt_cd.setLinkBeans(p.Hdr_bsppl_dpt_nm);
		p.Wrk1HdrPanel.add(p.Hdr_bsppl_dpt_cd_Label);
		p.Wrk1HdrPanel.add(p.Hdr_bsppl_dpt_cd);
		p.Hdr_bsppl_dpt_cd.setNextBeans(p.Hdr_bsppl_dpt_nm);
		p.Hdr_bsppl_dpt_cd.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.bsppl_dpt_cd_META);
		p.Wrk1HdrPanel.add(p.Hdr_bsppl_dpt_nm);
		p.Hdr_bsppl_dpt_nm.setNextBeans(p.Hdr_check_bsppl_dpt_cd);
		p.Hdr_bsppl_dpt_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.bsppl_dpt_nm_META);
		p.Wrk1HdrPanel.add(p.Hdr_check_bsppl_dpt_cd);
		p.Hdr_check_bsppl_dpt_cd.setNextBeans(p.Hdr_ap_cred_cd);
		p.Hdr_check_bsppl_dpt_cd.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.check_bsppl_dpt_cd_META);
		p.Wrk1HdrPanel.add(p.Hdr_ap_cred_cd_Label);
		p.Wrk1HdrPanel.add(p.Hdr_ap_cred_cd);
		p.Hdr_ap_cred_cd.setNextBeans(p.Hdr_ap_cred_nm);
		p.Hdr_ap_cred_cd.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.ap_cred_cd_META);
		p.Hdr_ap_cred_cd.addLinkBeans(p.Hdr_ap_cred_nm);
		p.Hdr_ap_cred_cd.setListType(MCListType.STRICT);
		p.Wrk1HdrPanel.add(p.Hdr_ap_cred_nm);
		p.Hdr_ap_cred_nm.setNextBeans(p.Hdr_purc_interim_cl_flg);
		p.Hdr_ap_cred_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.ap_cred_nm_META);
		p.Wrk1HdrPanel.add(p.Hdr_purc_interim_cl_flg);
		p.Hdr_purc_interim_cl_flg.setNextBeans(p.Hdr_pay_bank_ac_cd);
		p.Hdr_purc_interim_cl_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.purc_interim_cl_flg_META);
		p.Hdr_pay_bank_ac_cd.setListType(MCListType.STRICT);
		p.Hdr_pay_bank_ac_cd.setLinkBeans(p.Hdr_pay_bank_ac_nm);
		p.Wrk1HdrPanel.add(p.Hdr_pay_bank_ac_cd_Label);
		p.Wrk1HdrPanel.add(p.Hdr_pay_bank_ac_cd);
		p.Hdr_pay_bank_ac_cd.setNextBeans(p.Hdr_pay_bank_ac_nm);
		p.Hdr_pay_bank_ac_cd.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_bank_ac_cd_META);
		p.Wrk1HdrPanel.add(p.Hdr_pay_bank_ac_nm);
		p.Hdr_pay_bank_ac_nm.setNextBeans(p.Hdr_pay_spot_flg);
		p.Hdr_pay_bank_ac_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_bank_ac_nm_META);
		p.Wrk1HdrPanel.add(p.Hdr_pay_spot_flg);
		p.Hdr_pay_spot_flg.setNextBeans(p.Hdr_psppl_cl_day1);
		p.Hdr_pay_spot_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_spot_flg_META);
		p.Wrk1HdrPanel.add(p.Hdr_psppl_cl_day1_Label);
		p.Wrk1HdrPanel.add(p.Hdr_psppl_cl_day1);
		p.Hdr_psppl_cl_day1.setNextBeans(p.Hdr_psppl_cl_day2);
		p.Hdr_psppl_cl_day1.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.psppl_cl_day1_META);
		p.Wrk1HdrPanel.add(p.Hdr_psppl_cl_day2_Label);
		p.Wrk1HdrPanel.add(p.Hdr_psppl_cl_day2);
		p.Hdr_psppl_cl_day2.setNextBeans(p.Hdr_psppl_cl_day3);
		p.Hdr_psppl_cl_day2.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.psppl_cl_day2_META);
		p.Wrk1HdrPanel.add(p.Hdr_psppl_cl_day3_Label);
		p.Wrk1HdrPanel.add(p.Hdr_psppl_cl_day3);
		p.Hdr_psppl_cl_day3.setNextBeans(p.Hdr_psppl_cl_day4);
		p.Hdr_psppl_cl_day3.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.psppl_cl_day3_META);
		p.Wrk1HdrPanel.add(p.Hdr_psppl_cl_day4_Label);
		p.Wrk1HdrPanel.add(p.Hdr_psppl_cl_day4);
		p.Hdr_psppl_cl_day4.setNextBeans(p.Hdr_psppl_cl_day5);
		p.Hdr_psppl_cl_day4.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.psppl_cl_day4_META);
		p.Wrk1HdrPanel.add(p.Hdr_psppl_cl_day5_Label);
		p.Wrk1HdrPanel.add(p.Hdr_psppl_cl_day5);
		p.Hdr_psppl_cl_day5.setNextBeans(p.Hdr_ap_setoff_grp_cd);
		p.Hdr_psppl_cl_day5.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.psppl_cl_day5_META);
		p.Hdr_ap_setoff_grp_cd.setListType(MCListType.STRICT);
		p.Hdr_ap_setoff_grp_cd.setLinkBeans(p.Hdr_ap_setoff_grp_nm);
		p.Wrk1HdrPanel.add(p.Hdr_ap_setoff_grp_cd_Label);
		p.Wrk1HdrPanel.add(p.Hdr_ap_setoff_grp_cd);
		p.Hdr_ap_setoff_grp_cd.setNextBeans(p.Hdr_ap_setoff_grp_nm);
		p.Hdr_ap_setoff_grp_cd.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.ap_setoff_grp_cd_META);
		p.Wrk1HdrPanel.add(p.Hdr_ap_setoff_grp_nm);
		p.Hdr_ap_setoff_grp_nm.setNextBeans(p.Hdr_tax_on_pay_flg);
		p.Hdr_ap_setoff_grp_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.ap_setoff_grp_nm_META);
		p.Wrk1HdrPanel.add(p.Hdr_tax_on_pay_flg);
		p.Hdr_tax_on_pay_flg.setNextBeans(p.Hdr_pay_tax_rnd_typ);
		p.Hdr_tax_on_pay_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.tax_on_pay_flg_META);
		p.Hdr_pay_tax_rnd_typ.setListType(MCListType.STRICT);
		p.Hdr_pay_tax_rnd_typ.setLinkBeans(p.Hdr_pay_tax_rnd_typ_nm);
		p.Wrk1HdrPanel.add(p.Hdr_pay_tax_rnd_typ_Label);
		p.Wrk1HdrPanel.add(p.Hdr_pay_tax_rnd_typ);
		p.Hdr_pay_tax_rnd_typ.setNextBeans(p.Hdr_pay_tax_rnd_typ_nm);
		p.Hdr_pay_tax_rnd_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_tax_rnd_typ_META);
		p.Wrk1HdrPanel.add(p.Hdr_pay_tax_rnd_typ_nm);
		p.Hdr_pay_tax_rnd_typ_nm.setNextBeans(p.Hdr_pay_schd_ba_typ);
		p.Hdr_pay_tax_rnd_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_tax_rnd_typ_nm_META);
		p.Hdr_pay_schd_ba_typ.setListType(MCListType.STRICT);
		p.Hdr_pay_schd_ba_typ.setLinkBeans(p.Hdr_pay_schd_ba_typ_nm);
		p.Wrk1HdrPanel.add(p.Hdr_pay_schd_ba_typ_Label);
		p.Wrk1HdrPanel.add(p.Hdr_pay_schd_ba_typ);
		p.Hdr_pay_schd_ba_typ.setNextBeans(p.Hdr_pay_schd_ba_typ_nm);
		p.Hdr_pay_schd_ba_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_schd_ba_typ_META);
		p.Wrk1HdrPanel.add(p.Hdr_pay_schd_ba_typ_nm);
		p.Hdr_pay_schd_ba_typ_nm.setNextBeans(p.Hdr_batch_pay_schd_cl_flg);
		p.Hdr_pay_schd_ba_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_schd_ba_typ_nm_META);
		p.Wrk1HdrPanel.add(p.Hdr_batch_pay_schd_cl_flg);
		p.Hdr_batch_pay_schd_cl_flg.setNextBeans(p.Hdr_pay_schd_cl_delay_days);
		p.Hdr_batch_pay_schd_cl_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.batch_pay_schd_cl_flg_META);
		p.Wrk1HdrPanel.add(p.Hdr_pay_schd_cl_delay_days_Label);
		p.Wrk1HdrPanel.add(p.Hdr_pay_schd_cl_delay_days);
		p.Hdr_pay_schd_cl_delay_days.setNextBeans(p.Hdr_pay_schd_cl_ba_typ);
		p.Hdr_pay_schd_cl_delay_days.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_schd_cl_delay_days_META);
		p.Hdr_pay_schd_cl_ba_typ.setListType(MCListType.STRICT);
		p.Hdr_pay_schd_cl_ba_typ.setLinkBeans(p.Hdr_pay_schd_cl_ba_typ_nm);
		p.Wrk1HdrPanel.add(p.Hdr_pay_schd_cl_ba_typ_Label);
		p.Wrk1HdrPanel.add(p.Hdr_pay_schd_cl_ba_typ);
		p.Hdr_pay_schd_cl_ba_typ.setNextBeans(p.Hdr_pay_schd_cl_ba_typ_nm);
		p.Hdr_pay_schd_cl_ba_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_schd_cl_ba_typ_META);
		p.Wrk1HdrPanel.add(p.Hdr_pay_schd_cl_ba_typ_nm);
		p.Hdr_pay_schd_cl_ba_typ_nm.setNextBeans(p.Hdr_bsppl_prnt_typ);
		p.Hdr_pay_schd_cl_ba_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_schd_cl_ba_typ_nm_META);
		p.Hdr_bsppl_prnt_typ.setListType(MCListType.STRICT);
		p.Hdr_bsppl_prnt_typ.setLinkBeans(p.Hdr_bsppl_prnt_typ_nm);
		p.Wrk1HdrPanel.add(p.Hdr_bsppl_prnt_typ_Label);
		p.Wrk1HdrPanel.add(p.Hdr_bsppl_prnt_typ);
		p.Hdr_bsppl_prnt_typ.setNextBeans(p.Hdr_bsppl_prnt_typ_nm);
		p.Hdr_bsppl_prnt_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.bsppl_prnt_typ_META);
		p.Wrk1HdrPanel.add(p.Hdr_bsppl_prnt_typ_nm);
		p.Hdr_bsppl_prnt_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.bsppl_prnt_typ_nm_META);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_prnt_flg);
		p.Wrk4HdrPanel.setLastBeans(p.Hdr_pay_ntc_prnt_flg);
		p.Hdr_pay_ntc_prnt_flg.setNextBeans(p.Hdr_pay_ntc_zip_cd);
		p.Hdr_pay_ntc_prnt_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_prnt_flg_META);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_zip_cd_Label);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_zip_cd);
		p.Hdr_pay_ntc_zip_cd.setNextBeans(p.Hdr_pay_ntc_addr1);
		p.Hdr_pay_ntc_zip_cd.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_zip_cd_META);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_addr1_Label);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_addr1);
		p.Hdr_pay_ntc_addr1.setNextBeans(p.Hdr_pay_ntc_addr2);
		p.Hdr_pay_ntc_addr1.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_addr1_META);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_addr2_Label);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_addr2);
		p.Hdr_pay_ntc_addr2.setNextBeans(p.Hdr_pay_ntc_addr3);
		p.Hdr_pay_ntc_addr2.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_addr2_META);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_addr3_Label);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_addr3);
		p.Hdr_pay_ntc_addr3.setNextBeans(p.Hdr_pay_ntc_addr4);
		p.Hdr_pay_ntc_addr3.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_addr3_META);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_addr4_Label);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_addr4);
		p.Hdr_pay_ntc_addr4.setNextBeans(p.Hdr_pay_ntc_tel);
		p.Hdr_pay_ntc_addr4.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_addr4_META);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_tel_Label);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_tel);
		p.Hdr_pay_ntc_tel.setNextBeans(p.Hdr_pay_ntc_bsppl_nm);
		p.Hdr_pay_ntc_tel.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_tel_META);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_bsppl_nm_Label);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_bsppl_nm);
		p.Hdr_pay_ntc_bsppl_nm.setNextBeans(p.Hdr_pay_ntc_bsppl_dpt);
		p.Hdr_pay_ntc_bsppl_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_bsppl_nm_META);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_bsppl_dpt_Label);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_bsppl_dpt);
		p.Hdr_pay_ntc_bsppl_dpt.setNextBeans(p.Hdr_pay_ntc_bsppl_psn);
		p.Hdr_pay_ntc_bsppl_dpt.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_bsppl_dpt_META);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_bsppl_psn_Label);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_bsppl_psn);
		p.Hdr_pay_ntc_bsppl_psn.setNextBeans(p.Hdr_pay_ntc_bsppl_psn_title);
		p.Hdr_pay_ntc_bsppl_psn.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_bsppl_psn_META);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_bsppl_psn_title_Label);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_bsppl_psn_title);
		p.Hdr_pay_ntc_bsppl_psn_title.setNextBeans(p.Hdr_pay_ntc_dtl_outp_flg);
		p.Hdr_pay_ntc_bsppl_psn_title.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_bsppl_psn_title_META);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_dtl_outp_flg);
		p.Hdr_pay_ntc_dtl_outp_flg.setNextBeans(p.Hdr_pay_ntc_bfw_bal_disp_flg);
		p.Hdr_pay_ntc_dtl_outp_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_dtl_outp_flg_META);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_bfw_bal_disp_flg);
		p.Hdr_pay_ntc_bfw_bal_disp_flg.setNextBeans(p.Hdr_pay_ntc_adv_pay_flg);
		p.Hdr_pay_ntc_bfw_bal_disp_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_bfw_bal_disp_flg_META);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_adv_pay_flg);
		p.Hdr_pay_ntc_adv_pay_flg.setNextBeans(p.Hdr_pay_ntc_dtl_pay_flg);
		p.Hdr_pay_ntc_adv_pay_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_adv_pay_flg_META);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_dtl_pay_flg);
		p.Hdr_pay_ntc_dtl_pay_flg.setNextBeans(p.Hdr_pay_ntc_dtl_subttl_typ);
		p.Hdr_pay_ntc_dtl_pay_flg.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_dtl_pay_flg_META);
		p.Hdr_pay_ntc_dtl_subttl_typ.setListType(MCListType.STRICT);
		p.Hdr_pay_ntc_dtl_subttl_typ.setLinkBeans(p.Hdr_pay_ntc_dtl_subttl_typ_nm);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_dtl_subttl_typ_Label);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_dtl_subttl_typ);
		p.Hdr_pay_ntc_dtl_subttl_typ.setNextBeans(p.Hdr_pay_ntc_dtl_subttl_typ_nm);
		p.Hdr_pay_ntc_dtl_subttl_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_dtl_subttl_typ_META);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_dtl_subttl_typ_nm);
		p.Hdr_pay_ntc_dtl_subttl_typ_nm.setNextBeans(p.Hdr_pay_ntc_dtl_brk_typ);
		p.Hdr_pay_ntc_dtl_subttl_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_dtl_subttl_typ_nm_META);
		p.Hdr_pay_ntc_dtl_brk_typ.setListType(MCListType.STRICT);
		p.Hdr_pay_ntc_dtl_brk_typ.setLinkBeans(p.Hdr_pay_ntc_dtl_brk_typ_nm);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_dtl_brk_typ_Label);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_dtl_brk_typ);
		p.Hdr_pay_ntc_dtl_brk_typ.setNextBeans(p.Hdr_pay_ntc_dtl_brk_typ_nm);
		p.Hdr_pay_ntc_dtl_brk_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_dtl_brk_typ_META);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_dtl_brk_typ_nm);
		p.Hdr_pay_ntc_dtl_brk_typ_nm.setNextBeans(p.Hdr_pay_ntc_dtl_sort_typ);
		p.Hdr_pay_ntc_dtl_brk_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_dtl_brk_typ_nm_META);
		p.Hdr_pay_ntc_dtl_sort_typ.setListType(MCListType.STRICT);
		p.Hdr_pay_ntc_dtl_sort_typ.setLinkBeans(p.Hdr_pay_ntc_dtl_sort_typ_nm);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_dtl_sort_typ_Label);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_dtl_sort_typ);
		p.Hdr_pay_ntc_dtl_sort_typ.setNextBeans(p.Hdr_pay_ntc_dtl_sort_typ_nm);
		p.Hdr_pay_ntc_dtl_sort_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_dtl_sort_typ_META);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_dtl_sort_typ_nm);
		p.Hdr_pay_ntc_dtl_sort_typ_nm.setNextBeans(p.Hdr_pay_ntc_can_slip_typ);
		p.Hdr_pay_ntc_dtl_sort_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_dtl_sort_typ_nm_META);
		p.Hdr_pay_ntc_can_slip_typ.setListType(MCListType.STRICT);
		p.Hdr_pay_ntc_can_slip_typ.setLinkBeans(p.Hdr_pay_ntc_can_slip_typ_nm);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_can_slip_typ_Label);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_can_slip_typ);
		p.Hdr_pay_ntc_can_slip_typ.setNextBeans(p.Hdr_pay_ntc_can_slip_typ_nm);
		p.Hdr_pay_ntc_can_slip_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_can_slip_typ_META);
		p.Wrk4HdrPanel.add(p.Hdr_pay_ntc_can_slip_typ_nm);
		p.Hdr_pay_ntc_can_slip_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_ntc_can_slip_typ_nm_META);
		p.Wrk2HdrPanel.add(p.Hdr_psppl_rmrks_Label);
		p.Wrk2HdrPanel.add(p.Hdr_psppl_rmrks);
		p.Wrk2HdrPanel.setLastBeans(p.Hdr_psppl_rmrks);
		p.Hdr_psppl_rmrks.setNextBeans(p.Hdr_note_days);
		p.Hdr_psppl_rmrks.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.psppl_rmrks_META);
		p.Wrk2HdrPanel.add(p.Hdr_note_days_Label);
		p.Wrk2HdrPanel.add(p.Hdr_note_days);
		p.Hdr_note_days.setNextBeans(p.Hdr_pay_dpt_cd);
		p.Hdr_note_days.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.note_days_META);
		p.Hdr_pay_dpt_cd.setListType(MCListType.STRICT);
		p.Hdr_pay_dpt_cd.setLinkBeans(p.Hdr_pay_dpt_nm);
		p.Wrk2HdrPanel.add(p.Hdr_pay_dpt_cd_Label);
		p.Wrk2HdrPanel.add(p.Hdr_pay_dpt_cd);
		p.Hdr_pay_dpt_cd.setNextBeans(p.Hdr_pay_dpt_nm);
		p.Hdr_pay_dpt_cd.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_dpt_cd_META);
		p.Wrk2HdrPanel.add(p.Hdr_pay_dpt_nm);
		p.Hdr_pay_dpt_nm.setNextBeans(p.Hdr_check_pay_dpt_cd);
		p.Hdr_pay_dpt_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.pay_dpt_nm_META);
		p.Wrk2HdrPanel.add(p.Hdr_check_pay_dpt_cd);
		p.Hdr_check_pay_dpt_cd.setNextBeans(p.Hdr_psppl_prnt_typ);
		p.Hdr_check_pay_dpt_cd.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.check_pay_dpt_cd_META);
		p.Hdr_psppl_prnt_typ.setListType(MCListType.STRICT);
		p.Hdr_psppl_prnt_typ.setLinkBeans(p.Hdr_psppl_prnt_typ_nm);
		p.Wrk2HdrPanel.add(p.Hdr_psppl_prnt_typ_Label);
		p.Wrk2HdrPanel.add(p.Hdr_psppl_prnt_typ);
		p.Hdr_psppl_prnt_typ.setNextBeans(p.Hdr_psppl_prnt_typ_nm);
		p.Hdr_psppl_prnt_typ.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.psppl_prnt_typ_META);
		p.Wrk2HdrPanel.add(p.Hdr_psppl_prnt_typ_nm);
		p.Hdr_psppl_prnt_typ_nm.setRow(p.getHdrR(), mcframe.clientMABC.MABCP0580.HdrR.psppl_prnt_typ_nm_META);
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlTab(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.DtlTabPanel.add(p.DtlTabTab);
		p.DtlTabPanel.setLastBeans(p.DtlTabTab);
		p.DtlTabPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.DtlTabTab.add(p.Wrk1HdrPanel, "DtlTab.tab1");
		p.DtlTabTab.setLastBeans(p.Wrk1HdrPanel);
		p.Wrk1HdrPanel.setNextBeans(p.Wrk4HdrPanel);
		p.DtlTabTab.add(p.Wrk4HdrPanel, "DtlTab.tab4");
		p.Wrk4HdrPanel.setNextBeans(p.Wrk2HdrPanel);
		p.DtlTabTab.add(p.Wrk2HdrPanel, "DtlTab.tab2");
		p.Wrk2HdrPanel.setNextBeans(p.Wrk3Panel);
		p.DtlTabTab.add(p.Wrk3Panel, "DtlTab.tab3");
		p.Wrk3Panel.setNextBeans(p.Wrk5Panel);
		p.DtlTabTab.add(p.Wrk5Panel, "DtlTab.tab5");
	}

	/**
	 * [Wrk1Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk1Hdr(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.Wrk1HdrPanel.setNextBeans(p.Wrk4HdrPanel);
		p.Wrk1HdrPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk4Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk4Hdr(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.Wrk4HdrPanel.setNextBeans(p.Wrk2HdrPanel);
		p.Wrk4HdrPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk2Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk2Hdr(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.Wrk2HdrPanel.setNextBeans(p.Wrk3Panel);
		p.Wrk2HdrPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk3(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.Wrk3Panel.setNextBeans(p.Wrk5Panel);
		p.Wrk3Panel.setLayoutPosition("CTC+");
		// ブロックの項目の初期化
		p.Wrk3Panel.add(p.Wrk3HdrPanel, null);
		p.Wrk3Panel.setLastBeans(p.Wrk3HdrPanel);
		p.Wrk3HdrPanel.setNextBeans(p.Wrk3DtlPanel);
		p.Wrk3Panel.add(p.Wrk3DtlPanel, null);
		p.Wrk3DtlPanel.setNextBeans(p.Wrk3DtlBtnPanel);
		p.Wrk3Panel.add(p.Wrk3DtlBtnPanel, null);
	}

	/**
	 * [Wrk3Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk3Hdr(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.Wrk3HdrPanel.setValueCheck(false);
		p.Wrk3HdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Wrk3HdrPanel.add(p.Wrk3Hdr_psppl_cl_day1_Label);
		p.Wrk3HdrPanel.add(p.Wrk3Hdr_psppl_cl_day1);
		p.Wrk3HdrPanel.setLastBeans(p.Wrk3Hdr_psppl_cl_day1);
		p.Wrk3Hdr_psppl_cl_day1.setNextBeans(p.Wrk3Hdr_psppl_cl_day2);
		p.Wrk3Hdr_psppl_cl_day1.setRow(p.getWrk3HdrR(), mcframe.clientMABC.MABCP0580.Wrk3HdrR.psppl_cl_day1_META);
		p.Wrk3HdrPanel.add(p.Wrk3Hdr_psppl_cl_day2_Label);
		p.Wrk3HdrPanel.add(p.Wrk3Hdr_psppl_cl_day2);
		p.Wrk3Hdr_psppl_cl_day2.setNextBeans(p.Wrk3Hdr_psppl_cl_day3);
		p.Wrk3Hdr_psppl_cl_day2.setRow(p.getWrk3HdrR(), mcframe.clientMABC.MABCP0580.Wrk3HdrR.psppl_cl_day2_META);
		p.Wrk3HdrPanel.add(p.Wrk3Hdr_psppl_cl_day3_Label);
		p.Wrk3HdrPanel.add(p.Wrk3Hdr_psppl_cl_day3);
		p.Wrk3Hdr_psppl_cl_day3.setNextBeans(p.Wrk3Hdr_psppl_cl_day4);
		p.Wrk3Hdr_psppl_cl_day3.setRow(p.getWrk3HdrR(), mcframe.clientMABC.MABCP0580.Wrk3HdrR.psppl_cl_day3_META);
		p.Wrk3HdrPanel.add(p.Wrk3Hdr_psppl_cl_day4_Label);
		p.Wrk3HdrPanel.add(p.Wrk3Hdr_psppl_cl_day4);
		p.Wrk3Hdr_psppl_cl_day4.setNextBeans(p.Wrk3Hdr_psppl_cl_day5);
		p.Wrk3Hdr_psppl_cl_day4.setRow(p.getWrk3HdrR(), mcframe.clientMABC.MABCP0580.Wrk3HdrR.psppl_cl_day4_META);
		p.Wrk3HdrPanel.add(p.Wrk3Hdr_psppl_cl_day5_Label);
		p.Wrk3HdrPanel.add(p.Wrk3Hdr_psppl_cl_day5);
		p.Wrk3Hdr_psppl_cl_day5.setRow(p.getWrk3HdrR(), mcframe.clientMABC.MABCP0580.Wrk3HdrR.psppl_cl_day5_META);
	}

	/**
	 * [Wrk3Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk3Dtl(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.Wrk3DtlPanel.add(p.Wrk3DtlScrollPane);
		p.Wrk3DtlPanel.setLastBeans(p.Wrk3DtlTable);
		p.Wrk3DtlScrollPane.setViewportView(p.Wrk3DtlTable);
		p.Wrk3DtlTable.setList(p.getWrk3DtlL());
		p.Wrk3DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk3DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk3DtlBtn(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.Wrk3DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Wrk3DtlBtn_select_all.setIcon("SELECT_ALL");
		p.Wrk3DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Wrk3DtlBtnPanel.add(p.Wrk3DtlBtn_select_all);
		p.Wrk3DtlBtnPanel.setLastBeans(p.Wrk3DtlBtn_select_all);
		p.Wrk3DtlBtn_select_all.setNextBeans(p.Wrk3DtlBtn_deselect_all);
		p.Wrk3DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.Wrk3DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Wrk3DtlBtnPanel.add(p.Wrk3DtlBtn_deselect_all);
		p.Wrk3DtlBtn_deselect_all.setNextBeans(p.Wrk3DtlBtn_radd);
		p.Wrk3DtlBtn_radd.setIcon("INSERT_RECORD");
		p.Wrk3DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.Wrk3DtlBtnPanel.add(p.Wrk3DtlBtn_radd);
		p.Wrk3DtlBtn_radd.setNextBeans(p.Wrk3DtlBtn_rdel);
		p.Wrk3DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.Wrk3DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.Wrk3DtlBtnPanel.add(p.Wrk3DtlBtn_rdel);
		p.Wrk3DtlBtn_rdel.setNextBeans(p.Wrk3DtlBtn_rcopy);
		p.Wrk3DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.Wrk3DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.Wrk3DtlBtnPanel.add(p.Wrk3DtlBtn_rcopy);
	}

	/**
	 * [Wrk5]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk5(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.Wrk5Panel.setLayoutPosition("CTC+");
		// ブロックの項目の初期化
		p.Wrk5Panel.add(p.Wrk5HdrPanel, null);
		p.Wrk5Panel.setLastBeans(p.Wrk5HdrPanel);
		p.Wrk5HdrPanel.setNextBeans(p.Wrk5DtlPanel);
		p.Wrk5Panel.add(p.Wrk5DtlPanel, null);
		p.Wrk5DtlPanel.setNextBeans(p.Wrk5DtlBtnPanel);
		p.Wrk5Panel.add(p.Wrk5DtlBtnPanel, null);
	}

	/**
	 * [Wrk5Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk5Hdr(MABCP_BspplPspplReg p) {
		// ブロック関連の初期化
		p.Wrk5HdrPanel.setValueCheck(false);
		p.Wrk5HdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Wrk5HdrPanel.add(p.Wrk5Hdr_st_dt_Label);
		p.Wrk5HdrPanel.add(p.Wrk5Hdr_st_dt);
		p.Wrk5HdrPanel.setLastBeans(p.Wrk5Hdr_st_dt);
		p.Wrk5Hdr_st_dt.setNextBeans(p.Wrk5Hdr_end_dt);
		p.Wrk5Hdr_st_dt.setRow(p.getWrk5HdrR(), mcframe.clientMABC.MABCP0580.Wrk5HdrR.st_dt_META);
		p.Wrk5Hdr_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk5HdrPanel.add(p.Wrk5Hdr_end_dt_Label);
		p.Wrk5HdrPanel.add(p.Wrk5Hdr_end_dt);
		p.Wrk5Hdr_end_dt.setNextBeans(p.Wrk5Hdr_set_dt);
		p.Wrk5Hdr_end_dt.setRow(p.getWrk5HdrR(), mcframe.clientMABC.MABCP0580.Wrk5HdrR.end_dt_META);
		p.Wrk5Hdr_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk5Hdr_set_dt.setFunctionKey(MCFunctionKey.F7);
		p.Wrk5HdrPanel.add(p.Wrk5Hdr_set_dt);
	}

	/**
	 * [Wrk5Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk5Dtl(MABCP_BspplPspplReg p) {
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
	protected static void jbInitWrk5DtlBtn(MABCP_BspplPspplReg p) {
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
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABCP_BspplPspplReg p) {
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
	protected static void jbInitHdrAll(MABCP_BspplPspplReg p) {
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
		MABCP_BspplPspplReg_MC.mcInitScreenOpe((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.mcInitMst((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.mcInitTop((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.mcInitFold((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.mcInitCnd((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.mcInitCtrl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.mcInitTbl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.mcInitHdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.mcInitDtlTab((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.mcInitWrk1Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.mcInitWrk4Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.mcInitWrk2Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.mcInitWrk3((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.mcInitWrk3Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.mcInitWrk3Dtl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.mcInitWrk3DtlBtn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.mcInitWrk5((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.mcInitWrk5Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.mcInitWrk5Dtl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.mcInitWrk5DtlBtn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.mcInitBtn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.mcInitHdrAll((MABCP_BspplPspplReg)this);

		// [SRCH]ステータスのモードの設定
		MABCP_BspplPspplReg_MC.statusInitSRCH_ScreenOpe((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitSRCH_Mst((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitSRCH_Top((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitSRCH_Fold((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitSRCH_Cnd((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitSRCH_Ctrl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitSRCH_Tbl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitSRCH_Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitSRCH_DtlTab((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitSRCH_Wrk1Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitSRCH_Wrk4Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitSRCH_Wrk2Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitSRCH_Wrk3((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitSRCH_Wrk3Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitSRCH_Wrk3Dtl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitSRCH_Wrk3DtlBtn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitSRCH_Wrk5((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitSRCH_Wrk5Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitSRCH_Wrk5Dtl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitSRCH_Wrk5DtlBtn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitSRCH_Btn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitSRCH_HdrAll((MABCP_BspplPspplReg)this);

		// [UPD]ステータスのモードの設定
		MABCP_BspplPspplReg_MC.statusInitUPD_ScreenOpe((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitUPD_Mst((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitUPD_Top((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitUPD_Fold((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitUPD_Cnd((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitUPD_Ctrl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitUPD_Tbl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitUPD_Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitUPD_DtlTab((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitUPD_Wrk1Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitUPD_Wrk4Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitUPD_Wrk2Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitUPD_Wrk3((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitUPD_Wrk3Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitUPD_Wrk3Dtl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitUPD_Wrk3DtlBtn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitUPD_Wrk5((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitUPD_Wrk5Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitUPD_Wrk5Dtl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitUPD_Wrk5DtlBtn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitUPD_Btn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitUPD_HdrAll((MABCP_BspplPspplReg)this);

		// [FIX]ステータスのモードの設定
		MABCP_BspplPspplReg_MC.statusInitFIX_ScreenOpe((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitFIX_Mst((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitFIX_Top((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitFIX_Fold((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitFIX_Cnd((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitFIX_Ctrl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitFIX_Tbl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitFIX_Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitFIX_DtlTab((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitFIX_Wrk1Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitFIX_Wrk4Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitFIX_Wrk2Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitFIX_Wrk3((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitFIX_Wrk3Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitFIX_Wrk3Dtl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitFIX_Wrk3DtlBtn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitFIX_Wrk5((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitFIX_Wrk5Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitFIX_Wrk5Dtl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitFIX_Wrk5DtlBtn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitFIX_Btn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitFIX_HdrAll((MABCP_BspplPspplReg)this);

		// [REF]ステータスのモードの設定
		MABCP_BspplPspplReg_MC.statusInitREF_ScreenOpe((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitREF_Mst((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitREF_Top((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitREF_Fold((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitREF_Cnd((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitREF_Ctrl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitREF_Tbl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitREF_Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitREF_DtlTab((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitREF_Wrk1Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitREF_Wrk4Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitREF_Wrk2Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitREF_Wrk3((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitREF_Wrk3Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitREF_Wrk3Dtl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitREF_Wrk3DtlBtn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitREF_Wrk5((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitREF_Wrk5Hdr((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitREF_Wrk5Dtl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitREF_Wrk5DtlBtn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitREF_Btn((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.statusInitREF_HdrAll((MABCP_BspplPspplReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABCP_BspplPspplReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABCP_BspplPspplReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABCP_BspplPspplReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABCP_BspplPspplReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABCP_BspplPspplReg p) {
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
	protected static void mcInitCtrl(MABCP_BspplPspplReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Tbl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTbl(MABCP_BspplPspplReg p) {
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MABCP_BspplPspplReg p) {
		p.Hdr_bp_cd.setListListener(p);
		p.Hdr_bp_cd.addAllListener(p);
		p.Hdr_bp_nm.setListListener(p);
		p.Hdr_bp_nm.addAllListener(p);
		p.Hdr_bsppl_flg.addAllListener(p);
		p.Hdr_psppl_flg.addAllListener(p);
		p.Hdr_psppl_cd.setListListener(p);
		p.Hdr_psppl_cd.addAllListener(p);
		p.Hdr_psppl_nm.setListListener(p);
		p.Hdr_psppl_nm.addAllListener(p);
		p.Hdr_bsppl_dpt_cd.setListListener(p);
		p.Hdr_bsppl_dpt_cd.addAllListener(p);
		p.Hdr_bsppl_dpt_nm.setListListener(p);
		p.Hdr_bsppl_dpt_nm.addAllListener(p);
		p.Hdr_check_bsppl_dpt_cd.setListListener(p);
		p.Hdr_check_bsppl_dpt_cd.addAllListener(p);
		p.Hdr_ap_cred_cd.setListListener(p);
		p.Hdr_ap_cred_cd.addAllListener(p);
		p.Hdr_ap_cred_nm.setListListener(p);
		p.Hdr_ap_cred_nm.addAllListener(p);
		p.Hdr_purc_interim_cl_flg.addAllListener(p);
		p.Hdr_pay_bank_ac_cd.setListListener(p);
		p.Hdr_pay_bank_ac_cd.addAllListener(p);
		p.Hdr_pay_bank_ac_nm.setListListener(p);
		p.Hdr_pay_bank_ac_nm.addAllListener(p);
		p.Hdr_pay_spot_flg.addAllListener(p);
		p.Hdr_psppl_cl_day1.setListListener(p);
		p.Hdr_psppl_cl_day1.addAllListener(p);
		p.Hdr_psppl_cl_day2.setListListener(p);
		p.Hdr_psppl_cl_day2.addAllListener(p);
		p.Hdr_psppl_cl_day3.setListListener(p);
		p.Hdr_psppl_cl_day3.addAllListener(p);
		p.Hdr_psppl_cl_day4.setListListener(p);
		p.Hdr_psppl_cl_day4.addAllListener(p);
		p.Hdr_psppl_cl_day5.setListListener(p);
		p.Hdr_psppl_cl_day5.addAllListener(p);
		p.Hdr_ap_setoff_grp_cd.setListListener(p);
		p.Hdr_ap_setoff_grp_cd.addAllListener(p);
		p.Hdr_ap_setoff_grp_nm.setListListener(p);
		p.Hdr_ap_setoff_grp_nm.addAllListener(p);
		p.Hdr_tax_on_pay_flg.addAllListener(p);
		p.Hdr_pay_tax_rnd_typ.setListListener(p);
		p.Hdr_pay_tax_rnd_typ.addAllListener(p);
		p.Hdr_pay_tax_rnd_typ_nm.setListListener(p);
		p.Hdr_pay_tax_rnd_typ_nm.addAllListener(p);
		p.Hdr_pay_schd_ba_typ.setListListener(p);
		p.Hdr_pay_schd_ba_typ.addAllListener(p);
		p.Hdr_pay_schd_ba_typ_nm.setListListener(p);
		p.Hdr_pay_schd_ba_typ_nm.addAllListener(p);
		p.Hdr_batch_pay_schd_cl_flg.addAllListener(p);
		p.Hdr_pay_schd_cl_delay_days.setListListener(p);
		p.Hdr_pay_schd_cl_delay_days.addAllListener(p);
		p.Hdr_pay_schd_cl_ba_typ.setListListener(p);
		p.Hdr_pay_schd_cl_ba_typ.addAllListener(p);
		p.Hdr_pay_schd_cl_ba_typ_nm.setListListener(p);
		p.Hdr_pay_schd_cl_ba_typ_nm.addAllListener(p);
		p.Hdr_bsppl_prnt_typ.setListListener(p);
		p.Hdr_bsppl_prnt_typ.addAllListener(p);
		p.Hdr_bsppl_prnt_typ_nm.setListListener(p);
		p.Hdr_bsppl_prnt_typ_nm.addAllListener(p);
		p.Hdr_pay_ntc_prnt_flg.addAllListener(p);
		p.Hdr_pay_ntc_zip_cd.setListListener(p);
		p.Hdr_pay_ntc_zip_cd.addAllListener(p);
		p.Hdr_pay_ntc_addr1.setListListener(p);
		p.Hdr_pay_ntc_addr1.addAllListener(p);
		p.Hdr_pay_ntc_addr2.setListListener(p);
		p.Hdr_pay_ntc_addr2.addAllListener(p);
		p.Hdr_pay_ntc_addr3.setListListener(p);
		p.Hdr_pay_ntc_addr3.addAllListener(p);
		p.Hdr_pay_ntc_addr4.setListListener(p);
		p.Hdr_pay_ntc_addr4.addAllListener(p);
		p.Hdr_pay_ntc_tel.setListListener(p);
		p.Hdr_pay_ntc_tel.addAllListener(p);
		p.Hdr_pay_ntc_bsppl_nm.setListListener(p);
		p.Hdr_pay_ntc_bsppl_nm.addAllListener(p);
		p.Hdr_pay_ntc_bsppl_dpt.setListListener(p);
		p.Hdr_pay_ntc_bsppl_dpt.addAllListener(p);
		p.Hdr_pay_ntc_bsppl_psn.setListListener(p);
		p.Hdr_pay_ntc_bsppl_psn.addAllListener(p);
		p.Hdr_pay_ntc_bsppl_psn_title.setListListener(p);
		p.Hdr_pay_ntc_bsppl_psn_title.addAllListener(p);
		p.Hdr_pay_ntc_dtl_outp_flg.addAllListener(p);
		p.Hdr_pay_ntc_bfw_bal_disp_flg.addAllListener(p);
		p.Hdr_pay_ntc_adv_pay_flg.addAllListener(p);
		p.Hdr_pay_ntc_dtl_pay_flg.addAllListener(p);
		p.Hdr_pay_ntc_dtl_subttl_typ.setListListener(p);
		p.Hdr_pay_ntc_dtl_subttl_typ.addAllListener(p);
		p.Hdr_pay_ntc_dtl_subttl_typ_nm.setListListener(p);
		p.Hdr_pay_ntc_dtl_subttl_typ_nm.addAllListener(p);
		p.Hdr_pay_ntc_dtl_brk_typ.setListListener(p);
		p.Hdr_pay_ntc_dtl_brk_typ.addAllListener(p);
		p.Hdr_pay_ntc_dtl_brk_typ_nm.setListListener(p);
		p.Hdr_pay_ntc_dtl_brk_typ_nm.addAllListener(p);
		p.Hdr_pay_ntc_dtl_sort_typ.setListListener(p);
		p.Hdr_pay_ntc_dtl_sort_typ.addAllListener(p);
		p.Hdr_pay_ntc_dtl_sort_typ_nm.setListListener(p);
		p.Hdr_pay_ntc_dtl_sort_typ_nm.addAllListener(p);
		p.Hdr_pay_ntc_can_slip_typ.setListListener(p);
		p.Hdr_pay_ntc_can_slip_typ.addAllListener(p);
		p.Hdr_pay_ntc_can_slip_typ_nm.setListListener(p);
		p.Hdr_pay_ntc_can_slip_typ_nm.addAllListener(p);
		p.Hdr_psppl_rmrks.setListListener(p);
		p.Hdr_psppl_rmrks.addAllListener(p);
		p.Hdr_note_days.setListListener(p);
		p.Hdr_note_days.addAllListener(p);
		p.Hdr_pay_dpt_cd.setListListener(p);
		p.Hdr_pay_dpt_cd.addAllListener(p);
		p.Hdr_pay_dpt_nm.setListListener(p);
		p.Hdr_pay_dpt_nm.addAllListener(p);
		p.Hdr_check_pay_dpt_cd.setListListener(p);
		p.Hdr_check_pay_dpt_cd.addAllListener(p);
		p.Hdr_psppl_prnt_typ.setListListener(p);
		p.Hdr_psppl_prnt_typ.addAllListener(p);
		p.Hdr_psppl_prnt_typ_nm.setListListener(p);
		p.Hdr_psppl_prnt_typ_nm.addAllListener(p);
	}

	/**
	 *  [DtlTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlTab(MABCP_BspplPspplReg p) {
		p.DtlTabTab.addAllListener(p);
	}

	/**
	 *  [Wrk1Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk1Hdr(MABCP_BspplPspplReg p) {
	}

	/**
	 *  [Wrk4Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk4Hdr(MABCP_BspplPspplReg p) {
	}

	/**
	 *  [Wrk2Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk2Hdr(MABCP_BspplPspplReg p) {
	}

	/**
	 *  [Wrk3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk3(MABCP_BspplPspplReg p) {
	}

	/**
	 *  [Wrk3Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk3Hdr(MABCP_BspplPspplReg p) {
		p.Wrk3Hdr_psppl_cl_day1.setListListener(p);
		p.Wrk3Hdr_psppl_cl_day1.addAllListener(p);
		p.Wrk3Hdr_psppl_cl_day2.setListListener(p);
		p.Wrk3Hdr_psppl_cl_day2.addAllListener(p);
		p.Wrk3Hdr_psppl_cl_day3.setListListener(p);
		p.Wrk3Hdr_psppl_cl_day3.addAllListener(p);
		p.Wrk3Hdr_psppl_cl_day4.setListListener(p);
		p.Wrk3Hdr_psppl_cl_day4.addAllListener(p);
		p.Wrk3Hdr_psppl_cl_day5.setListListener(p);
		p.Wrk3Hdr_psppl_cl_day5.addAllListener(p);
	}

	/**
	 *  [Wrk3Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk3Dtl(MABCP_BspplPspplReg p) {
		p.Wrk3DtlTable.addAllListener(p);
		p.columnWrk3Dtl_check.addAllListener(p);
		p.columnWrk3Dtl_del_flg.addAllListener(p);
		p.columnWrk3Dtl_bsppl_cd.addAllListener(p);
		p.columnWrk3Dtl_bsppl_cd.setListListener(p);
		p.columnWrk3Dtl_psppl_cl_day1.addAllListener(p);
		p.columnWrk3Dtl_psppl_cl_day1.setListListener(p);
		p.columnWrk3Dtl_psppl_cl_day2.addAllListener(p);
		p.columnWrk3Dtl_psppl_cl_day2.setListListener(p);
		p.columnWrk3Dtl_psppl_cl_day3.addAllListener(p);
		p.columnWrk3Dtl_psppl_cl_day3.setListListener(p);
		p.columnWrk3Dtl_psppl_cl_day4.addAllListener(p);
		p.columnWrk3Dtl_psppl_cl_day4.setListListener(p);
		p.columnWrk3Dtl_psppl_cl_day5.addAllListener(p);
		p.columnWrk3Dtl_psppl_cl_day5.setListListener(p);
		p.columnWrk3Dtl_cur_cd.addAllListener(p);
		p.columnWrk3Dtl_cur_cd.setListListener(p);
		p.columnWrk3Dtl_cur_nm.addAllListener(p);
		p.columnWrk3Dtl_cur_nm.setListListener(p);
		p.columnWrk3Dtl_amt_dec_place.addAllListener(p);
		p.columnWrk3Dtl_amt_dec_place.setListListener(p);
		p.columnWrk3Dtl_sttl_cd.addAllListener(p);
		p.columnWrk3Dtl_sttl_cd.setListListener(p);
		p.columnWrk3Dtl_sttl_nm.addAllListener(p);
		p.columnWrk3Dtl_sttl_nm.setListListener(p);
		p.columnWrk3Dtl_ap_sttl_typ.addAllListener(p);
		p.columnWrk3Dtl_ap_sttl_typ.setListListener(p);
		p.columnWrk3Dtl_wg_cd.addAllListener(p);
		p.columnWrk3Dtl_wg_cd.setListListener(p);
		p.columnWrk3Dtl_wg_nm.addAllListener(p);
		p.columnWrk3Dtl_wg_nm.setListListener(p);
		p.columnWrk3Dtl_rate.addAllListener(p);
		p.columnWrk3Dtl_rate.setListListener(p);
		p.columnWrk3Dtl_crryovr_mons_typ.addAllListener(p);
		p.columnWrk3Dtl_crryovr_mons_typ.setListListener(p);
		p.columnWrk3Dtl_crryovr_mons_typ_nm.addAllListener(p);
		p.columnWrk3Dtl_crryovr_mons_typ_nm.setListListener(p);
		p.columnWrk3Dtl_pay_crryovr_mons1.addAllListener(p);
		p.columnWrk3Dtl_pay_crryovr_mons1.setListListener(p);
		p.columnWrk3Dtl_pay_day1.addAllListener(p);
		p.columnWrk3Dtl_pay_day1.setListListener(p);
		p.columnWrk3Dtl_pay_crryovr_mons2.addAllListener(p);
		p.columnWrk3Dtl_pay_crryovr_mons2.setListListener(p);
		p.columnWrk3Dtl_pay_day2.addAllListener(p);
		p.columnWrk3Dtl_pay_day2.setListListener(p);
		p.columnWrk3Dtl_pay_crryovr_mons3.addAllListener(p);
		p.columnWrk3Dtl_pay_crryovr_mons3.setListListener(p);
		p.columnWrk3Dtl_pay_day3.addAllListener(p);
		p.columnWrk3Dtl_pay_day3.setListListener(p);
		p.columnWrk3Dtl_pay_crryovr_mons4.addAllListener(p);
		p.columnWrk3Dtl_pay_crryovr_mons4.setListListener(p);
		p.columnWrk3Dtl_pay_day4.addAllListener(p);
		p.columnWrk3Dtl_pay_day4.setListListener(p);
		p.columnWrk3Dtl_pay_crryovr_mons5.addAllListener(p);
		p.columnWrk3Dtl_pay_crryovr_mons5.setListListener(p);
		p.columnWrk3Dtl_pay_day5.addAllListener(p);
		p.columnWrk3Dtl_pay_day5.setListListener(p);
		p.columnWrk3Dtl_memo1.addAllListener(p);
		p.columnWrk3Dtl_memo1.setListListener(p);
		p.columnWrk3Dtl_memo2.addAllListener(p);
		p.columnWrk3Dtl_memo2.setListListener(p);
		p.columnWrk3Dtl_memo3.addAllListener(p);
		p.columnWrk3Dtl_memo3.setListListener(p);
		p.columnWrk3Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk3Dtl_ins_usr_id.setListListener(p);
		p.columnWrk3Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk3Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk3Dtl_ins_ts.addAllListener(p);
		p.columnWrk3Dtl_ins_ts.setListListener(p);
		p.columnWrk3Dtl_ins_func_id.addAllListener(p);
		p.columnWrk3Dtl_ins_func_id.setListListener(p);
		p.columnWrk3Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk3Dtl_ins_func_nm.setListListener(p);
		p.columnWrk3Dtl_upd_cntr.addAllListener(p);
		p.columnWrk3Dtl_upd_cntr.setListListener(p);
		p.columnWrk3Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk3Dtl_upd_usr_id.setListListener(p);
		p.columnWrk3Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk3Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk3Dtl_upd_ts.addAllListener(p);
		p.columnWrk3Dtl_upd_ts.setListListener(p);
		p.columnWrk3Dtl_upd_func_id.addAllListener(p);
		p.columnWrk3Dtl_upd_func_id.setListListener(p);
		p.columnWrk3Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk3Dtl_upd_func_nm.setListListener(p);
		p.columnWrk3Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk3Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk3Dtl_del_usr_id.addAllListener(p);
		p.columnWrk3Dtl_del_usr_id.setListListener(p);
		p.columnWrk3Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk3Dtl_del_usr_nm.setListListener(p);
		p.columnWrk3Dtl_del_ts.addAllListener(p);
		p.columnWrk3Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk3DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk3DtlBtn(MABCP_BspplPspplReg p) {
		p.Wrk3DtlBtn_select_all.addAllListener(p);
		p.Wrk3DtlBtn_select_all.setAPMethodName("doWrk3DtlBtn_select_all");
		p.Wrk3DtlBtn_deselect_all.addAllListener(p);
		p.Wrk3DtlBtn_deselect_all.setAPMethodName("doWrk3DtlBtn_deselect_all");
		p.Wrk3DtlBtn_radd.addAllListener(p);
		p.Wrk3DtlBtn_radd.setAPMethodName("doWrk3DtlBtn_radd");
		p.Wrk3DtlBtn_rdel.addAllListener(p);
		p.Wrk3DtlBtn_rdel.setAPMethodName("doWrk3DtlBtn_rdel");
		p.Wrk3DtlBtn_rcopy.addAllListener(p);
		p.Wrk3DtlBtn_rcopy.setAPMethodName("doWrk3DtlBtn_rcopy");
	}

	/**
	 *  [Wrk5]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk5(MABCP_BspplPspplReg p) {
	}

	/**
	 *  [Wrk5Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk5Hdr(MABCP_BspplPspplReg p) {
		p.Wrk5Hdr_st_dt.setListListener(p);
		p.Wrk5Hdr_st_dt.addAllListener(p);
		p.Wrk5Hdr_end_dt.setListListener(p);
		p.Wrk5Hdr_end_dt.addAllListener(p);
		p.Wrk5Hdr_set_dt.addAllListener(p);
		p.Wrk5Hdr_set_dt.setAPMethodName("doWrk5Hdr_set_dt");
	}

	/**
	 *  [Wrk5Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk5Dtl(MABCP_BspplPspplReg p) {
		p.Wrk5DtlTable.addAllListener(p);
		p.columnWrk5Dtl_check.addAllListener(p);
		p.columnWrk5Dtl_del_flg.addAllListener(p);
		p.columnWrk5Dtl_bp_cd.addAllListener(p);
		p.columnWrk5Dtl_bp_cd.setListListener(p);
		p.columnWrk5Dtl_if_proc_typ.addAllListener(p);
		p.columnWrk5Dtl_if_proc_typ.setListListener(p);
		p.columnWrk5Dtl_if_proc_typ_nm.addAllListener(p);
		p.columnWrk5Dtl_if_proc_typ_nm.setListListener(p);
		p.columnWrk5Dtl_not_onr_prov_flg.addAllListener(p);
		p.columnWrk5Dtl_ext_sys_cd.addAllListener(p);
		p.columnWrk5Dtl_ext_sys_cd.setListListener(p);
		p.columnWrk5Dtl_ext_sys_nm.addAllListener(p);
		p.columnWrk5Dtl_ext_sys_nm.setListListener(p);
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
	protected static void mcInitWrk5DtlBtn(MABCP_BspplPspplReg p) {
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
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABCP_BspplPspplReg p) {
		p.Btn_open_MABCP0510.addAllListener(p);
		p.Btn_open_MABCP0510.setAPMethodName("doBtn_open_MABCP0510");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
	}

	/**
	 *  [HdrAll]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrAll(MABCP_BspplPspplReg p) {
		p.HdrAllTable.addAllListener(p);
		p.columnHdrAll_check.addAllListener(p);
		p.columnHdrAll_bp_cd.addAllListener(p);
		p.columnHdrAll_bp_cd.setListListener(p);
		p.columnHdrAll_bp_nm.addAllListener(p);
		p.columnHdrAll_bp_nm.setListListener(p);
		p.columnHdrAll_bsppl_flg.addAllListener(p);
		p.columnHdrAll_psppl_flg.addAllListener(p);
		p.columnHdrAll_psppl_cd.addAllListener(p);
		p.columnHdrAll_psppl_cd.setListListener(p);
		p.columnHdrAll_psppl_nm.addAllListener(p);
		p.columnHdrAll_psppl_nm.setListListener(p);
		p.columnHdrAll_bsppl_dpt_cd.addAllListener(p);
		p.columnHdrAll_bsppl_dpt_cd.setListListener(p);
		p.columnHdrAll_bsppl_dpt_nm.addAllListener(p);
		p.columnHdrAll_bsppl_dpt_nm.setListListener(p);
		p.columnHdrAll_check_bsppl_dpt_cd.addAllListener(p);
		p.columnHdrAll_check_bsppl_dpt_cd.setListListener(p);
		p.columnHdrAll_ap_cred_cd.addAllListener(p);
		p.columnHdrAll_ap_cred_cd.setListListener(p);
		p.columnHdrAll_ap_cred_nm.addAllListener(p);
		p.columnHdrAll_ap_cred_nm.setListListener(p);
		p.columnHdrAll_purc_interim_cl_flg.addAllListener(p);
		p.columnHdrAll_pay_bank_ac_cd.addAllListener(p);
		p.columnHdrAll_pay_bank_ac_cd.setListListener(p);
		p.columnHdrAll_pay_bank_ac_nm.addAllListener(p);
		p.columnHdrAll_pay_bank_ac_nm.setListListener(p);
		p.columnHdrAll_pay_spot_flg.addAllListener(p);
		p.columnHdrAll_psppl_cl_day1.addAllListener(p);
		p.columnHdrAll_psppl_cl_day1.setListListener(p);
		p.columnHdrAll_psppl_cl_day2.addAllListener(p);
		p.columnHdrAll_psppl_cl_day2.setListListener(p);
		p.columnHdrAll_psppl_cl_day3.addAllListener(p);
		p.columnHdrAll_psppl_cl_day3.setListListener(p);
		p.columnHdrAll_psppl_cl_day4.addAllListener(p);
		p.columnHdrAll_psppl_cl_day4.setListListener(p);
		p.columnHdrAll_psppl_cl_day5.addAllListener(p);
		p.columnHdrAll_psppl_cl_day5.setListListener(p);
		p.columnHdrAll_ap_setoff_grp_cd.addAllListener(p);
		p.columnHdrAll_ap_setoff_grp_cd.setListListener(p);
		p.columnHdrAll_ap_setoff_grp_nm.addAllListener(p);
		p.columnHdrAll_ap_setoff_grp_nm.setListListener(p);
		p.columnHdrAll_tax_on_pay_flg.addAllListener(p);
		p.columnHdrAll_pay_tax_rnd_typ.addAllListener(p);
		p.columnHdrAll_pay_tax_rnd_typ.setListListener(p);
		p.columnHdrAll_pay_tax_rnd_typ_nm.addAllListener(p);
		p.columnHdrAll_pay_tax_rnd_typ_nm.setListListener(p);
		p.columnHdrAll_pay_schd_ba_typ.addAllListener(p);
		p.columnHdrAll_pay_schd_ba_typ.setListListener(p);
		p.columnHdrAll_pay_schd_ba_typ_nm.addAllListener(p);
		p.columnHdrAll_pay_schd_ba_typ_nm.setListListener(p);
		p.columnHdrAll_batch_pay_schd_cl_flg.addAllListener(p);
		p.columnHdrAll_pay_schd_cl_delay_days.addAllListener(p);
		p.columnHdrAll_pay_schd_cl_delay_days.setListListener(p);
		p.columnHdrAll_pay_schd_cl_ba_typ.addAllListener(p);
		p.columnHdrAll_pay_schd_cl_ba_typ.setListListener(p);
		p.columnHdrAll_pay_schd_cl_ba_typ_nm.addAllListener(p);
		p.columnHdrAll_pay_schd_cl_ba_typ_nm.setListListener(p);
		p.columnHdrAll_bsppl_prnt_typ.addAllListener(p);
		p.columnHdrAll_bsppl_prnt_typ.setListListener(p);
		p.columnHdrAll_bsppl_prnt_typ_nm.addAllListener(p);
		p.columnHdrAll_bsppl_prnt_typ_nm.setListListener(p);
		p.columnHdrAll_pay_ntc_prnt_flg.addAllListener(p);
		p.columnHdrAll_pay_ntc_zip_cd.addAllListener(p);
		p.columnHdrAll_pay_ntc_zip_cd.setListListener(p);
		p.columnHdrAll_pay_ntc_addr1.addAllListener(p);
		p.columnHdrAll_pay_ntc_addr1.setListListener(p);
		p.columnHdrAll_pay_ntc_addr2.addAllListener(p);
		p.columnHdrAll_pay_ntc_addr2.setListListener(p);
		p.columnHdrAll_pay_ntc_addr3.addAllListener(p);
		p.columnHdrAll_pay_ntc_addr3.setListListener(p);
		p.columnHdrAll_pay_ntc_addr4.addAllListener(p);
		p.columnHdrAll_pay_ntc_addr4.setListListener(p);
		p.columnHdrAll_pay_ntc_tel.addAllListener(p);
		p.columnHdrAll_pay_ntc_tel.setListListener(p);
		p.columnHdrAll_pay_ntc_bsppl_nm.addAllListener(p);
		p.columnHdrAll_pay_ntc_bsppl_nm.setListListener(p);
		p.columnHdrAll_pay_ntc_bsppl_dpt.addAllListener(p);
		p.columnHdrAll_pay_ntc_bsppl_dpt.setListListener(p);
		p.columnHdrAll_pay_ntc_bsppl_psn.addAllListener(p);
		p.columnHdrAll_pay_ntc_bsppl_psn.setListListener(p);
		p.columnHdrAll_pay_ntc_bsppl_psn_title.addAllListener(p);
		p.columnHdrAll_pay_ntc_bsppl_psn_title.setListListener(p);
		p.columnHdrAll_pay_ntc_dtl_outp_flg.addAllListener(p);
		p.columnHdrAll_pay_ntc_bfw_bal_disp_flg.addAllListener(p);
		p.columnHdrAll_pay_ntc_adv_pay_flg.addAllListener(p);
		p.columnHdrAll_pay_ntc_dtl_pay_flg.addAllListener(p);
		p.columnHdrAll_pay_ntc_dtl_subttl_typ.addAllListener(p);
		p.columnHdrAll_pay_ntc_dtl_subttl_typ.setListListener(p);
		p.columnHdrAll_pay_ntc_dtl_subttl_typ_nm.addAllListener(p);
		p.columnHdrAll_pay_ntc_dtl_subttl_typ_nm.setListListener(p);
		p.columnHdrAll_pay_ntc_dtl_brk_typ.addAllListener(p);
		p.columnHdrAll_pay_ntc_dtl_brk_typ.setListListener(p);
		p.columnHdrAll_pay_ntc_dtl_brk_typ_nm.addAllListener(p);
		p.columnHdrAll_pay_ntc_dtl_brk_typ_nm.setListListener(p);
		p.columnHdrAll_pay_ntc_dtl_sort_typ.addAllListener(p);
		p.columnHdrAll_pay_ntc_dtl_sort_typ.setListListener(p);
		p.columnHdrAll_pay_ntc_dtl_sort_typ_nm.addAllListener(p);
		p.columnHdrAll_pay_ntc_dtl_sort_typ_nm.setListListener(p);
		p.columnHdrAll_pay_ntc_can_slip_typ.addAllListener(p);
		p.columnHdrAll_pay_ntc_can_slip_typ.setListListener(p);
		p.columnHdrAll_pay_ntc_can_slip_typ_nm.addAllListener(p);
		p.columnHdrAll_pay_ntc_can_slip_typ_nm.setListListener(p);
		p.columnHdrAll_psppl_rmrks.addAllListener(p);
		p.columnHdrAll_psppl_rmrks.setListListener(p);
		p.columnHdrAll_note_days.addAllListener(p);
		p.columnHdrAll_note_days.setListListener(p);
		p.columnHdrAll_pay_dpt_cd.addAllListener(p);
		p.columnHdrAll_pay_dpt_cd.setListListener(p);
		p.columnHdrAll_pay_dpt_nm.addAllListener(p);
		p.columnHdrAll_pay_dpt_nm.setListListener(p);
		p.columnHdrAll_check_pay_dpt_cd.addAllListener(p);
		p.columnHdrAll_check_pay_dpt_cd.setListListener(p);
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
		p.columnHdrAll_psppl_prnt_typ.addAllListener(p);
		p.columnHdrAll_psppl_prnt_typ.setListListener(p);
		p.columnHdrAll_psppl_prnt_typ_nm.addAllListener(p);
		p.columnHdrAll_psppl_prnt_typ_nm.setListListener(p);
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MABCP_BspplPspplReg p){

	}

	/**
	 * [SRCH]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Mst(MABCP_BspplPspplReg p){
		p.Mst_mst_set_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MABCP_BspplPspplReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MABCP_BspplPspplReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MABCP_BspplPspplReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bp_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MABCP_BspplPspplReg p){

	}

	/**
	 * [SRCH]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tbl(MABCP_BspplPspplReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MABCP_BspplPspplReg p){
		p.Hdr_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bsppl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_psppl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_psppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_psppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bsppl_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bsppl_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_check_bsppl_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ap_cred_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ap_cred_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_purc_interim_cl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_bank_ac_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_bank_ac_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_spot_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_psppl_cl_day1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_psppl_cl_day2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_psppl_cl_day3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_psppl_cl_day4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_psppl_cl_day5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ap_setoff_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ap_setoff_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_tax_on_pay_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_tax_rnd_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_tax_rnd_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_schd_ba_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_schd_ba_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_batch_pay_schd_cl_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_schd_cl_delay_days.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_schd_cl_ba_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_schd_cl_ba_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bsppl_prnt_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bsppl_prnt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_zip_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_addr1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_addr2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_addr3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_addr4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_tel.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_bsppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_bsppl_dpt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_bsppl_psn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_bsppl_psn_title.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_outp_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_bfw_bal_disp_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_adv_pay_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_pay_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_subttl_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_subttl_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_brk_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_brk_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_sort_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_sort_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_can_slip_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_can_slip_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_psppl_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_note_days.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_pay_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_check_pay_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_psppl_prnt_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_psppl_prnt_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlTab(MABCP_BspplPspplReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk1Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk1Hdr(MABCP_BspplPspplReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk4Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk4Hdr(MABCP_BspplPspplReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk2Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk2Hdr(MABCP_BspplPspplReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk3(MABCP_BspplPspplReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk3Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk3Hdr(MABCP_BspplPspplReg p){
		p.Wrk3Hdr_psppl_cl_day1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk3Hdr_psppl_cl_day2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk3Hdr_psppl_cl_day3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk3Hdr_psppl_cl_day4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk3Hdr_psppl_cl_day5.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk3Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk3Dtl(MABCP_BspplPspplReg p){
		p.columnWrk3Dtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_bsppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk3Dtl_psppl_cl_day1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk3Dtl_psppl_cl_day2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk3Dtl_psppl_cl_day3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk3Dtl_psppl_cl_day4.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk3Dtl_psppl_cl_day5.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk3Dtl_cur_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_cur_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_amt_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Wrk3Dtl_amt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Wrk3Dtl_amt_p_PPanel.columnAmt_amt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_sttl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_sttl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ap_sttl_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk3Dtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_rate.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_crryovr_mons_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_crryovr_mons_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_crryovr_mons1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_day1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_crryovr_mons2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_day2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_crryovr_mons3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_day3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_crryovr_mons4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_day4.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_crryovr_mons5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_day5.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk3Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk3DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk3DtlBtn(MABCP_BspplPspplReg p){
		p.Wrk3DtlBtn_select_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Wrk3DtlBtn_deselect_all.putMode(p, SRCH, MCMode.ENABLE);
		p.Wrk3DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk3DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk3DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk5(MABCP_BspplPspplReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk5Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk5Hdr(MABCP_BspplPspplReg p){
		p.Wrk5Hdr_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk5Hdr_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk5Hdr_set_dt.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk5Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk5Dtl(MABCP_BspplPspplReg p){
		p.columnWrk5Dtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_bp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk5Dtl_if_proc_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_if_proc_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_not_onr_prov_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk5Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk5Dtl_ext_sys_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ext_sys_nm.putMode(p, SRCH, MCMode.READ_ONLY);
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
	protected static void statusInitSRCH_Wrk5DtlBtn(MABCP_BspplPspplReg p){
		p.Wrk5DtlBtn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk5DtlBtn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk5DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk5DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk5DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MABCP_BspplPspplReg p){
		p.Btn_open_MABCP0510.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrAll(MABCP_BspplPspplReg p){
		p.columnHdrAll_check.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bsppl_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bsppl_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bsppl_dpt_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_check_bsppl_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_ap_cred_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_ap_cred_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_purc_interim_cl_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_bank_ac_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_bank_ac_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_spot_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cl_day1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cl_day2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cl_day3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cl_day4.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cl_day5.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_ap_setoff_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_ap_setoff_grp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_tax_on_pay_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_tax_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_tax_rnd_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_schd_ba_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_schd_ba_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_batch_pay_schd_cl_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_schd_cl_delay_days.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_schd_cl_ba_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_schd_cl_ba_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bsppl_prnt_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_bsppl_prnt_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_prnt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_zip_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_addr1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_addr2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_addr3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_addr4.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_tel.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_bsppl_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_bsppl_dpt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_bsppl_psn.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_bsppl_psn_title.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_outp_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_bfw_bal_disp_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_adv_pay_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_pay_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_subttl_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_subttl_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_brk_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_brk_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_sort_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_sort_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_can_slip_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_can_slip_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_rmrks.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_note_days.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_pay_dpt_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_check_pay_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
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
		p.columnHdrAll_psppl_prnt_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_prnt_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABCP_BspplPspplReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABCP_BspplPspplReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABCP_BspplPspplReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABCP_BspplPspplReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABCP_BspplPspplReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_bp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABCP_BspplPspplReg p){

	}

	/**
	 * [UPD]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tbl(MABCP_BspplPspplReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MABCP_BspplPspplReg p){
		p.Hdr_bp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bsppl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_psppl_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_psppl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_psppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bsppl_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_bsppl_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_check_bsppl_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ap_cred_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_ap_cred_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_purc_interim_cl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_pay_bank_ac_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_bank_ac_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_pay_spot_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_psppl_cl_day1.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_psppl_cl_day2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_psppl_cl_day3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_psppl_cl_day4.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_psppl_cl_day5.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_ap_setoff_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_ap_setoff_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_tax_on_pay_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_pay_tax_rnd_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_pay_tax_rnd_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_pay_schd_ba_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_schd_ba_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_batch_pay_schd_cl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_pay_schd_cl_delay_days.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_pay_schd_cl_ba_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_pay_schd_cl_ba_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bsppl_prnt_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_bsppl_prnt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_prnt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_ntc_zip_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_ntc_addr1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_ntc_addr2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_ntc_addr3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_ntc_addr4.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_ntc_tel.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_ntc_bsppl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_ntc_bsppl_dpt.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_ntc_bsppl_psn.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_ntc_bsppl_psn_title.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_ntc_dtl_outp_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_ntc_bfw_bal_disp_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_ntc_adv_pay_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_ntc_dtl_pay_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_ntc_dtl_subttl_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_pay_ntc_dtl_subttl_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_brk_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_pay_ntc_dtl_brk_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_sort_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_pay_ntc_dtl_sort_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_can_slip_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_pay_ntc_can_slip_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_psppl_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_note_days.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_pay_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_check_pay_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_psppl_prnt_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_psppl_prnt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlTab(MABCP_BspplPspplReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk1Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk1Hdr(MABCP_BspplPspplReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk4Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk4Hdr(MABCP_BspplPspplReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk2Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk2Hdr(MABCP_BspplPspplReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk3(MABCP_BspplPspplReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk3Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk3Hdr(MABCP_BspplPspplReg p){
		p.Wrk3Hdr_psppl_cl_day1.putMode(p, UPD, MCMode.READ_ONLY);
		p.Wrk3Hdr_psppl_cl_day2.putMode(p, UPD, MCMode.READ_ONLY);
		p.Wrk3Hdr_psppl_cl_day3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Wrk3Hdr_psppl_cl_day4.putMode(p, UPD, MCMode.READ_ONLY);
		p.Wrk3Hdr_psppl_cl_day5.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Wrk3Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk3Dtl(MABCP_BspplPspplReg p){
		p.columnWrk3Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk3Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk3Dtl_bsppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk3Dtl_psppl_cl_day1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk3Dtl_psppl_cl_day2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk3Dtl_psppl_cl_day3.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk3Dtl_psppl_cl_day4.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk3Dtl_psppl_cl_day5.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk3Dtl_cur_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk3Dtl_cur_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_amt_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Wrk3Dtl_amt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.REQUIRED);
		p.Wrk3Dtl_amt_p_PPanel.columnAmt_amt.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk3Dtl_sttl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk3Dtl_sttl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ap_sttl_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk3Dtl_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk3Dtl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_rate.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk3Dtl_crryovr_mons_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk3Dtl_crryovr_mons_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_crryovr_mons1.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk3Dtl_pay_day1.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk3Dtl_pay_crryovr_mons2.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk3Dtl_pay_day2.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk3Dtl_pay_crryovr_mons3.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk3Dtl_pay_day3.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk3Dtl_pay_crryovr_mons4.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk3Dtl_pay_day4.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk3Dtl_pay_crryovr_mons5.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk3Dtl_pay_day5.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk3Dtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk3Dtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk3Dtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk3Dtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk3Dtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Wrk3DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk3DtlBtn(MABCP_BspplPspplReg p){
		p.Wrk3DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk3DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk3DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk3DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk3DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk5]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk5(MABCP_BspplPspplReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk5Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk5Hdr(MABCP_BspplPspplReg p){
		p.Wrk5Hdr_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk5Hdr_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk5Hdr_set_dt.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk5Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk5Dtl(MABCP_BspplPspplReg p){
		p.columnWrk5Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk5Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk5Dtl_bp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk5Dtl_if_proc_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk5Dtl_if_proc_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_not_onr_prov_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk5Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnWrk5Dtl_ext_sys_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk5Dtl_ext_sys_nm.putMode(p, UPD, MCMode.READ_ONLY);
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
	protected static void statusInitUPD_Wrk5DtlBtn(MABCP_BspplPspplReg p){
		p.Wrk5DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk5DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk5DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk5DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk5DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABCP_BspplPspplReg p){
		p.Btn_open_MABCP0510.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrAll(MABCP_BspplPspplReg p){
		p.columnHdrAll_check.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bsppl_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bsppl_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bsppl_dpt_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_check_bsppl_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_ap_cred_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_ap_cred_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_purc_interim_cl_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_bank_ac_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_bank_ac_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_spot_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cl_day1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cl_day2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cl_day3.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cl_day4.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cl_day5.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_ap_setoff_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_ap_setoff_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_tax_on_pay_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_tax_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_tax_rnd_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_schd_ba_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_schd_ba_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_batch_pay_schd_cl_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_schd_cl_delay_days.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_schd_cl_ba_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_schd_cl_ba_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bsppl_prnt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_bsppl_prnt_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_prnt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_zip_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_addr1.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_addr2.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_addr3.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_addr4.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_tel.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_bsppl_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_bsppl_dpt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_bsppl_psn.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_bsppl_psn_title.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_outp_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_bfw_bal_disp_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_adv_pay_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_pay_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_subttl_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_subttl_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_brk_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_brk_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_sort_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_sort_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_can_slip_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_can_slip_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_rmrks.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_note_days.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_pay_dpt_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_check_pay_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
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
		p.columnHdrAll_psppl_prnt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_prnt_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABCP_BspplPspplReg p){

	}

	/**
	 * [FIX]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Mst(MABCP_BspplPspplReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABCP_BspplPspplReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABCP_BspplPspplReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABCP_BspplPspplReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_bp_cd.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_bp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABCP_BspplPspplReg p){

	}

	/**
	 * [FIX]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tbl(MABCP_BspplPspplReg p){

	}

	/**
	 * [FIX]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Hdr(MABCP_BspplPspplReg p){
		p.Hdr_bp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bsppl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_psppl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_psppl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_psppl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bsppl_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bsppl_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_check_bsppl_dpt_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_ap_cred_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_ap_cred_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_purc_interim_cl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_bank_ac_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_bank_ac_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_spot_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_psppl_cl_day1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_psppl_cl_day2.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_psppl_cl_day3.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_psppl_cl_day4.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_psppl_cl_day5.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_ap_setoff_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_ap_setoff_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_tax_on_pay_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_tax_rnd_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_tax_rnd_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_schd_ba_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_schd_ba_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_batch_pay_schd_cl_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_schd_cl_delay_days.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_schd_cl_ba_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_schd_cl_ba_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bsppl_prnt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bsppl_prnt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_prnt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_zip_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_addr1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_addr2.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_addr3.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_addr4.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_tel.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_bsppl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_bsppl_dpt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_bsppl_psn.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_bsppl_psn_title.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_outp_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_bfw_bal_disp_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_adv_pay_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_pay_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_subttl_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_subttl_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_brk_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_brk_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_sort_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_sort_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_can_slip_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_can_slip_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_psppl_rmrks.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_note_days.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_pay_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_check_pay_dpt_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_psppl_prnt_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_psppl_prnt_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlTab(MABCP_BspplPspplReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk1Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk1Hdr(MABCP_BspplPspplReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk4Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk4Hdr(MABCP_BspplPspplReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk2Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk2Hdr(MABCP_BspplPspplReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk3]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk3(MABCP_BspplPspplReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk3Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk3Hdr(MABCP_BspplPspplReg p){
		p.Wrk3Hdr_psppl_cl_day1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk3Hdr_psppl_cl_day2.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk3Hdr_psppl_cl_day3.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk3Hdr_psppl_cl_day4.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk3Hdr_psppl_cl_day5.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Wrk3Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk3Dtl(MABCP_BspplPspplReg p){
		p.columnWrk3Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_bsppl_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk3Dtl_psppl_cl_day1.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk3Dtl_psppl_cl_day2.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk3Dtl_psppl_cl_day3.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk3Dtl_psppl_cl_day4.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk3Dtl_psppl_cl_day5.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk3Dtl_cur_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_cur_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_amt_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.Wrk3Dtl_amt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Wrk3Dtl_amt_p_PPanel.columnAmt_amt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_sttl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_sttl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ap_sttl_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk3Dtl_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_rate.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_crryovr_mons_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_crryovr_mons_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_crryovr_mons1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_day1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_crryovr_mons2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_day2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_crryovr_mons3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_day3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_crryovr_mons4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_day4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_crryovr_mons5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_day5.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk3Dtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Wrk3DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk3DtlBtn(MABCP_BspplPspplReg p){
		p.Wrk3DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk3DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk3DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk3DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk3DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk5]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk5(MABCP_BspplPspplReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk5Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk5Hdr(MABCP_BspplPspplReg p){
		p.Wrk5Hdr_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk5Hdr_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk5Hdr_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk5Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk5Dtl(MABCP_BspplPspplReg p){
		p.columnWrk5Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_bp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk5Dtl_if_proc_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_if_proc_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_not_onr_prov_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk5Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk5Dtl_ext_sys_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ext_sys_nm.putMode(p, FIX, MCMode.READ_ONLY);
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
	protected static void statusInitFIX_Wrk5DtlBtn(MABCP_BspplPspplReg p){
		p.Wrk5DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk5DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk5DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk5DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk5DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABCP_BspplPspplReg p){
		p.Btn_open_MABCP0510.putMode(p, FIX, MCMode.ENABLE);
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_HdrAll(MABCP_BspplPspplReg p){
		p.columnHdrAll_check.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bp_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bsppl_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bsppl_dpt_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bsppl_dpt_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_check_bsppl_dpt_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_ap_cred_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_ap_cred_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_purc_interim_cl_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_bank_ac_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_bank_ac_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_spot_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cl_day1.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cl_day2.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cl_day3.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cl_day4.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cl_day5.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_ap_setoff_grp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_ap_setoff_grp_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_tax_on_pay_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_tax_rnd_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_tax_rnd_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_schd_ba_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_schd_ba_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_batch_pay_schd_cl_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_schd_cl_delay_days.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_schd_cl_ba_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_schd_cl_ba_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bsppl_prnt_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_bsppl_prnt_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_prnt_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_zip_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_addr1.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_addr2.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_addr3.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_addr4.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_tel.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_bsppl_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_bsppl_dpt.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_bsppl_psn.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_bsppl_psn_title.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_outp_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_bfw_bal_disp_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_adv_pay_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_pay_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_subttl_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_subttl_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_brk_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_brk_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_sort_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_sort_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_can_slip_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_can_slip_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_rmrks.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_note_days.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_dpt_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_pay_dpt_nm.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_check_pay_dpt_cd.putMode(p, FIX, MCMode.INVISIBLE);
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
		p.columnHdrAll_psppl_prnt_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_prnt_typ_nm.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABCP_BspplPspplReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABCP_BspplPspplReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABCP_BspplPspplReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABCP_BspplPspplReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABCP_BspplPspplReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_bp_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABCP_BspplPspplReg p){

	}

	/**
	 * [REF]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tbl(MABCP_BspplPspplReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MABCP_BspplPspplReg p){
		p.Hdr_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bsppl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_psppl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_psppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_psppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bsppl_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bsppl_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_check_bsppl_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ap_cred_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ap_cred_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_purc_interim_cl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_bank_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_bank_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_spot_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_psppl_cl_day1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_psppl_cl_day2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_psppl_cl_day3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_psppl_cl_day4.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_psppl_cl_day5.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ap_setoff_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ap_setoff_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_tax_on_pay_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_tax_rnd_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_tax_rnd_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_schd_ba_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_schd_ba_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_batch_pay_schd_cl_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_schd_cl_delay_days.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_schd_cl_ba_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_schd_cl_ba_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bsppl_prnt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bsppl_prnt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_zip_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_addr1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_addr2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_addr3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_addr4.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_tel.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_bsppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_bsppl_dpt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_bsppl_psn.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_bsppl_psn_title.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_outp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_bfw_bal_disp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_adv_pay_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_pay_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_subttl_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_subttl_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_brk_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_brk_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_sort_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_dtl_sort_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_can_slip_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_ntc_can_slip_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_psppl_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_note_days.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_pay_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_check_pay_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_psppl_prnt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_psppl_prnt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlTab(MABCP_BspplPspplReg p){

	}

	/**
	 * [REF]ステータスの[Wrk1Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk1Hdr(MABCP_BspplPspplReg p){

	}

	/**
	 * [REF]ステータスの[Wrk4Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk4Hdr(MABCP_BspplPspplReg p){

	}

	/**
	 * [REF]ステータスの[Wrk2Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk2Hdr(MABCP_BspplPspplReg p){

	}

	/**
	 * [REF]ステータスの[Wrk3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk3(MABCP_BspplPspplReg p){

	}

	/**
	 * [REF]ステータスの[Wrk3Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk3Hdr(MABCP_BspplPspplReg p){
		p.Wrk3Hdr_psppl_cl_day1.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk3Hdr_psppl_cl_day2.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk3Hdr_psppl_cl_day3.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk3Hdr_psppl_cl_day4.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk3Hdr_psppl_cl_day5.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk3Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk3Dtl(MABCP_BspplPspplReg p){
		p.columnWrk3Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_bsppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk3Dtl_psppl_cl_day1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk3Dtl_psppl_cl_day2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk3Dtl_psppl_cl_day3.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk3Dtl_psppl_cl_day4.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk3Dtl_psppl_cl_day5.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk3Dtl_cur_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_cur_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_amt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Wrk3Dtl_amt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Wrk3Dtl_amt_p_PPanel.columnAmt_amt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_sttl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_sttl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ap_sttl_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk3Dtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_rate.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_crryovr_mons_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_crryovr_mons_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_crryovr_mons1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_day1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_crryovr_mons2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_day2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_crryovr_mons3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_day3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_crryovr_mons4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_day4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_crryovr_mons5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_pay_day5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk3Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk3DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk3DtlBtn(MABCP_BspplPspplReg p){
		p.Wrk3DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk3DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk3DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk3DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk3DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk5]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk5(MABCP_BspplPspplReg p){

	}

	/**
	 * [REF]ステータスの[Wrk5Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk5Hdr(MABCP_BspplPspplReg p){
		p.Wrk5Hdr_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk5Hdr_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk5Hdr_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk5Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk5Dtl(MABCP_BspplPspplReg p){
		p.columnWrk5Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_bp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk5Dtl_if_proc_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_if_proc_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_not_onr_prov_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk5Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk5Dtl_ext_sys_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_Wrk5DtlBtn(MABCP_BspplPspplReg p){
		p.Wrk5DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk5DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk5DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk5DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk5DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABCP_BspplPspplReg p){
		p.Btn_open_MABCP0510.putMode(p, REF, MCMode.ENABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrAll(MABCP_BspplPspplReg p){
		p.columnHdrAll_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bsppl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bsppl_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bsppl_dpt_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_check_bsppl_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_ap_cred_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_ap_cred_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_purc_interim_cl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_bank_ac_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_bank_ac_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_spot_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cl_day1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cl_day2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cl_day3.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cl_day4.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_cl_day5.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_ap_setoff_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_ap_setoff_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_tax_on_pay_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_tax_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_tax_rnd_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_schd_ba_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_schd_ba_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_batch_pay_schd_cl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_schd_cl_delay_days.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_schd_cl_ba_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_schd_cl_ba_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bsppl_prnt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_bsppl_prnt_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_prnt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_zip_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_addr1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_addr2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_addr3.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_addr4.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_tel.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_bsppl_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_bsppl_dpt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_bsppl_psn.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_bsppl_psn_title.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_outp_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_bfw_bal_disp_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_adv_pay_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_pay_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_subttl_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_subttl_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_brk_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_brk_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_sort_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_dtl_sort_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_can_slip_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_ntc_can_slip_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_rmrks.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_note_days.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_pay_dpt_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_check_pay_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
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
		p.columnHdrAll_psppl_prnt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnHdrAll_psppl_prnt_typ_nm.putMode(p, REF, MCMode.INVISIBLE);

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
		MABCP_BspplPspplReg_MC.setTableConfigWrk3Dtl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.setTableConfigWrk5Dtl((MABCP_BspplPspplReg)this);
		MABCP_BspplPspplReg_MC.setTableConfigHdrAll((MABCP_BspplPspplReg)this);
	}

	/**
	 * [Wrk3Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk3Dtl(MABCP_BspplPspplReg p) {
		p.columnWrk3Dtl_check.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.check_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_check);
		p.columnWrk3Dtl_del_flg.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.del_flg_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_del_flg);
		p.columnWrk3Dtl_bsppl_cd.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.bsppl_cd_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_bsppl_cd);
		p.columnWrk3Dtl_psppl_cl_day1.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.psppl_cl_day1_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_psppl_cl_day1);
		p.columnWrk3Dtl_psppl_cl_day2.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.psppl_cl_day2_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_psppl_cl_day2);
		p.columnWrk3Dtl_psppl_cl_day3.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.psppl_cl_day3_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_psppl_cl_day3);
		p.columnWrk3Dtl_psppl_cl_day4.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.psppl_cl_day4_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_psppl_cl_day4);
		p.columnWrk3Dtl_psppl_cl_day5.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.psppl_cl_day5_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_psppl_cl_day5);
		p.columnWrk3Dtl_cur_cd.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.cur_cd_META);
		p.columnWrk3Dtl_cur_cd.addLinkBeans(p.columnWrk3Dtl_cur_nm,p.columnWrk3Dtl_amt_dec_place);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_cur_cd);
		p.columnWrk3Dtl_cur_nm.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.cur_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_cur_nm);
		p.columnWrk3Dtl_amt_dec_place.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.amt_dec_place_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_amt_dec_place);
		p.Wrk3DtlTable.addTable(p.Wrk3Dtl_amt_p_PPanel.AmtTable);
		p.columnWrk3Dtl_sttl_cd.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.sttl_cd_META);
		p.columnWrk3Dtl_sttl_cd.addLinkBeans(p.columnWrk3Dtl_sttl_nm,p.columnWrk3Dtl_ap_sttl_typ);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_sttl_cd);
		p.columnWrk3Dtl_sttl_nm.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.sttl_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_sttl_nm);
		p.columnWrk3Dtl_ap_sttl_typ.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.ap_sttl_typ_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ap_sttl_typ);
		p.columnWrk3Dtl_wg_cd.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.wg_cd_META);
		p.columnWrk3Dtl_wg_cd.addLinkBeans(p.columnWrk3Dtl_wg_nm);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_wg_cd);
		p.columnWrk3Dtl_wg_nm.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.wg_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_wg_nm);
		p.columnWrk3Dtl_rate.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.rate_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_rate);
		p.columnWrk3Dtl_crryovr_mons_typ.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.crryovr_mons_typ_META);
		p.columnWrk3Dtl_crryovr_mons_typ.addLinkBeans(p.columnWrk3Dtl_crryovr_mons_typ_nm);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_crryovr_mons_typ);
		p.columnWrk3Dtl_crryovr_mons_typ_nm.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.crryovr_mons_typ_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_crryovr_mons_typ_nm);
		p.columnWrk3Dtl_pay_crryovr_mons1.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.pay_crryovr_mons1_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_pay_crryovr_mons1);
		p.columnWrk3Dtl_pay_day1.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.pay_day1_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_pay_day1);
		p.columnWrk3Dtl_pay_crryovr_mons2.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.pay_crryovr_mons2_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_pay_crryovr_mons2);
		p.columnWrk3Dtl_pay_day2.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.pay_day2_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_pay_day2);
		p.columnWrk3Dtl_pay_crryovr_mons3.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.pay_crryovr_mons3_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_pay_crryovr_mons3);
		p.columnWrk3Dtl_pay_day3.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.pay_day3_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_pay_day3);
		p.columnWrk3Dtl_pay_crryovr_mons4.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.pay_crryovr_mons4_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_pay_crryovr_mons4);
		p.columnWrk3Dtl_pay_day4.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.pay_day4_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_pay_day4);
		p.columnWrk3Dtl_pay_crryovr_mons5.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.pay_crryovr_mons5_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_pay_crryovr_mons5);
		p.columnWrk3Dtl_pay_day5.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.pay_day5_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_pay_day5);
		p.columnWrk3Dtl_memo1.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.memo1_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_memo1);
		p.columnWrk3Dtl_memo2.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.memo2_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_memo2);
		p.columnWrk3Dtl_memo3.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.memo3_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_memo3);
		p.columnWrk3Dtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.ins_usr_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_usr_id);
		p.columnWrk3Dtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.ins_usr_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_usr_nm);
		p.columnWrk3Dtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.ins_ts_META);
		p.columnWrk3Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_ts);
		p.columnWrk3Dtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.ins_func_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_func_id);
		p.columnWrk3Dtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.ins_func_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_func_nm);
		p.columnWrk3Dtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.upd_cntr_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_cntr);
		p.columnWrk3Dtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.upd_usr_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_usr_id);
		p.columnWrk3Dtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.upd_usr_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_usr_nm);
		p.columnWrk3Dtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.upd_ts_META);
		p.columnWrk3Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_ts);
		p.columnWrk3Dtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.upd_func_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_func_id);
		p.columnWrk3Dtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.upd_func_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_func_nm);
		p.columnWrk3Dtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.upd_srv_req_no_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_srv_req_no);
		p.columnWrk3Dtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.del_usr_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_del_usr_id);
		p.columnWrk3Dtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.del_usr_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_del_usr_nm);
		p.columnWrk3Dtl_del_ts.setMeta(mcframe.clientMABC.MABCP0580.Wrk3DtlR.del_ts_META);
		p.columnWrk3Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk3DtlTable.setUnscrollColumn(p.columnWrk3Dtl_del_flg);
	}

	/**
	 * [Wrk5Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk5Dtl(MABCP_BspplPspplReg p) {
		p.columnWrk5Dtl_check.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.check_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_check);
		p.columnWrk5Dtl_del_flg.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.del_flg_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_del_flg);
		p.columnWrk5Dtl_bp_cd.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.bp_cd_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_bp_cd);
		p.columnWrk5Dtl_if_proc_typ.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.if_proc_typ_META);
		p.columnWrk5Dtl_if_proc_typ.addLinkBeans(p.columnWrk5Dtl_if_proc_typ_nm);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_if_proc_typ);
		p.columnWrk5Dtl_if_proc_typ_nm.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.if_proc_typ_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_if_proc_typ_nm);
		p.columnWrk5Dtl_not_onr_prov_flg.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.not_onr_prov_flg_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_not_onr_prov_flg);
		p.Wrk5DtlTable.addTable(p.Wrk5Dtl_dt_p_PPanel.DtTable);
		p.columnWrk5Dtl_ext_sys_cd.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.ext_sys_cd_META);
		p.columnWrk5Dtl_ext_sys_cd.addLinkBeans(p.columnWrk5Dtl_ext_sys_nm);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ext_sys_cd);
		p.columnWrk5Dtl_ext_sys_nm.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.ext_sys_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ext_sys_nm);
		p.columnWrk5Dtl_memo1.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.memo1_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_memo1);
		p.columnWrk5Dtl_memo2.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.memo2_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_memo2);
		p.columnWrk5Dtl_memo3.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.memo3_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_memo3);
		p.columnWrk5Dtl_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.ins_usr_id_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ins_usr_id);
		p.columnWrk5Dtl_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.ins_usr_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ins_usr_nm);
		p.columnWrk5Dtl_ins_ts.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.ins_ts_META);
		p.columnWrk5Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ins_ts);
		p.columnWrk5Dtl_ins_func_id.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.ins_func_id_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ins_func_id);
		p.columnWrk5Dtl_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.ins_func_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ins_func_nm);
		p.columnWrk5Dtl_upd_cntr.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.upd_cntr_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_cntr);
		p.columnWrk5Dtl_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.upd_usr_id_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_usr_id);
		p.columnWrk5Dtl_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.upd_usr_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_usr_nm);
		p.columnWrk5Dtl_upd_ts.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.upd_ts_META);
		p.columnWrk5Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_ts);
		p.columnWrk5Dtl_upd_func_id.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.upd_func_id_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_func_id);
		p.columnWrk5Dtl_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.upd_func_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_func_nm);
		p.columnWrk5Dtl_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.upd_srv_req_no_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_srv_req_no);
		p.columnWrk5Dtl_del_usr_id.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.del_usr_id_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_del_usr_id);
		p.columnWrk5Dtl_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.del_usr_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_del_usr_nm);
		p.columnWrk5Dtl_del_ts.setMeta(mcframe.clientMABC.MABCP0580.Wrk5DtlR.del_ts_META);
		p.columnWrk5Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk5DtlTable.setUnscrollColumn(p.columnWrk5Dtl_del_flg);
	}

	/**
	 * [HdrAll]ブロックのTableの設定
	 */
	protected static void setTableConfigHdrAll(MABCP_BspplPspplReg p) {
		p.columnHdrAll_check.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.check_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_check);
		p.columnHdrAll_bp_cd.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.bp_cd_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bp_cd);
		p.columnHdrAll_bp_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.bp_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bp_nm);
		p.columnHdrAll_bsppl_flg.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.bsppl_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bsppl_flg);
		p.columnHdrAll_psppl_flg.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.psppl_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_psppl_flg);
		p.columnHdrAll_psppl_cd.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.psppl_cd_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_psppl_cd);
		p.columnHdrAll_psppl_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.psppl_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_psppl_nm);
		p.columnHdrAll_bsppl_dpt_cd.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.bsppl_dpt_cd_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bsppl_dpt_cd);
		p.columnHdrAll_bsppl_dpt_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.bsppl_dpt_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bsppl_dpt_nm);
		p.columnHdrAll_check_bsppl_dpt_cd.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.check_bsppl_dpt_cd_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_check_bsppl_dpt_cd);
		p.columnHdrAll_ap_cred_cd.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.ap_cred_cd_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_ap_cred_cd);
		p.columnHdrAll_ap_cred_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.ap_cred_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_ap_cred_nm);
		p.columnHdrAll_purc_interim_cl_flg.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.purc_interim_cl_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_purc_interim_cl_flg);
		p.columnHdrAll_pay_bank_ac_cd.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_bank_ac_cd_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_bank_ac_cd);
		p.columnHdrAll_pay_bank_ac_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_bank_ac_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_bank_ac_nm);
		p.columnHdrAll_pay_spot_flg.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_spot_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_spot_flg);
		p.columnHdrAll_psppl_cl_day1.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.psppl_cl_day1_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_psppl_cl_day1);
		p.columnHdrAll_psppl_cl_day2.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.psppl_cl_day2_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_psppl_cl_day2);
		p.columnHdrAll_psppl_cl_day3.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.psppl_cl_day3_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_psppl_cl_day3);
		p.columnHdrAll_psppl_cl_day4.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.psppl_cl_day4_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_psppl_cl_day4);
		p.columnHdrAll_psppl_cl_day5.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.psppl_cl_day5_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_psppl_cl_day5);
		p.columnHdrAll_ap_setoff_grp_cd.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.ap_setoff_grp_cd_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_ap_setoff_grp_cd);
		p.columnHdrAll_ap_setoff_grp_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.ap_setoff_grp_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_ap_setoff_grp_nm);
		p.columnHdrAll_tax_on_pay_flg.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.tax_on_pay_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_tax_on_pay_flg);
		p.columnHdrAll_pay_tax_rnd_typ.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_tax_rnd_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_tax_rnd_typ);
		p.columnHdrAll_pay_tax_rnd_typ_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_tax_rnd_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_tax_rnd_typ_nm);
		p.columnHdrAll_pay_schd_ba_typ.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_schd_ba_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_schd_ba_typ);
		p.columnHdrAll_pay_schd_ba_typ_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_schd_ba_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_schd_ba_typ_nm);
		p.columnHdrAll_batch_pay_schd_cl_flg.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.batch_pay_schd_cl_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_batch_pay_schd_cl_flg);
		p.columnHdrAll_pay_schd_cl_delay_days.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_schd_cl_delay_days_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_schd_cl_delay_days);
		p.columnHdrAll_pay_schd_cl_ba_typ.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_schd_cl_ba_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_schd_cl_ba_typ);
		p.columnHdrAll_pay_schd_cl_ba_typ_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_schd_cl_ba_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_schd_cl_ba_typ_nm);
		p.columnHdrAll_bsppl_prnt_typ.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.bsppl_prnt_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bsppl_prnt_typ);
		p.columnHdrAll_bsppl_prnt_typ_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.bsppl_prnt_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_bsppl_prnt_typ_nm);
		p.columnHdrAll_pay_ntc_prnt_flg.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_prnt_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_prnt_flg);
		p.columnHdrAll_pay_ntc_zip_cd.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_zip_cd_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_zip_cd);
		p.columnHdrAll_pay_ntc_addr1.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_addr1_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_addr1);
		p.columnHdrAll_pay_ntc_addr2.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_addr2_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_addr2);
		p.columnHdrAll_pay_ntc_addr3.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_addr3_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_addr3);
		p.columnHdrAll_pay_ntc_addr4.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_addr4_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_addr4);
		p.columnHdrAll_pay_ntc_tel.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_tel_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_tel);
		p.columnHdrAll_pay_ntc_bsppl_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_bsppl_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_bsppl_nm);
		p.columnHdrAll_pay_ntc_bsppl_dpt.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_bsppl_dpt_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_bsppl_dpt);
		p.columnHdrAll_pay_ntc_bsppl_psn.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_bsppl_psn_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_bsppl_psn);
		p.columnHdrAll_pay_ntc_bsppl_psn_title.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_bsppl_psn_title_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_bsppl_psn_title);
		p.columnHdrAll_pay_ntc_dtl_outp_flg.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_dtl_outp_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_dtl_outp_flg);
		p.columnHdrAll_pay_ntc_bfw_bal_disp_flg.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_bfw_bal_disp_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_bfw_bal_disp_flg);
		p.columnHdrAll_pay_ntc_adv_pay_flg.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_adv_pay_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_adv_pay_flg);
		p.columnHdrAll_pay_ntc_dtl_pay_flg.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_dtl_pay_flg_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_dtl_pay_flg);
		p.columnHdrAll_pay_ntc_dtl_subttl_typ.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_dtl_subttl_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_dtl_subttl_typ);
		p.columnHdrAll_pay_ntc_dtl_subttl_typ_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_dtl_subttl_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_dtl_subttl_typ_nm);
		p.columnHdrAll_pay_ntc_dtl_brk_typ.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_dtl_brk_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_dtl_brk_typ);
		p.columnHdrAll_pay_ntc_dtl_brk_typ_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_dtl_brk_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_dtl_brk_typ_nm);
		p.columnHdrAll_pay_ntc_dtl_sort_typ.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_dtl_sort_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_dtl_sort_typ);
		p.columnHdrAll_pay_ntc_dtl_sort_typ_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_dtl_sort_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_dtl_sort_typ_nm);
		p.columnHdrAll_pay_ntc_can_slip_typ.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_can_slip_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_can_slip_typ);
		p.columnHdrAll_pay_ntc_can_slip_typ_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_ntc_can_slip_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_ntc_can_slip_typ_nm);
		p.columnHdrAll_psppl_rmrks.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.psppl_rmrks_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_psppl_rmrks);
		p.columnHdrAll_note_days.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.note_days_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_note_days);
		p.columnHdrAll_pay_dpt_cd.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_dpt_cd_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_dpt_cd);
		p.columnHdrAll_pay_dpt_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.pay_dpt_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_pay_dpt_nm);
		p.columnHdrAll_check_pay_dpt_cd.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.check_pay_dpt_cd_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_check_pay_dpt_cd);
		p.columnHdrAll_ins_usr_id.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.ins_usr_id_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_ins_usr_id);
		p.columnHdrAll_ins_usr_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.ins_usr_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_ins_usr_nm);
		p.columnHdrAll_ins_ts.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.ins_ts_META);
		p.columnHdrAll_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_ins_ts);
		p.columnHdrAll_ins_func_id.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.ins_func_id_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_ins_func_id);
		p.columnHdrAll_ins_func_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.ins_func_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_ins_func_nm);
		p.columnHdrAll_upd_cntr.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.upd_cntr_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_upd_cntr);
		p.columnHdrAll_upd_usr_id.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.upd_usr_id_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_upd_usr_id);
		p.columnHdrAll_upd_usr_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.upd_usr_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_upd_usr_nm);
		p.columnHdrAll_upd_ts.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.upd_ts_META);
		p.columnHdrAll_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_upd_ts);
		p.columnHdrAll_upd_func_id.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.upd_func_id_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_upd_func_id);
		p.columnHdrAll_upd_func_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.upd_func_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_upd_func_nm);
		p.columnHdrAll_upd_srv_req_no.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.upd_srv_req_no_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_upd_srv_req_no);
		p.columnHdrAll_del_usr_id.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.del_usr_id_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_del_usr_id);
		p.columnHdrAll_del_usr_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.del_usr_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_del_usr_nm);
		p.columnHdrAll_del_ts.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.del_ts_META);
		p.columnHdrAll_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_del_ts);
		p.columnHdrAll_psppl_prnt_typ.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.psppl_prnt_typ_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_psppl_prnt_typ);
		p.columnHdrAll_psppl_prnt_typ_nm.setMeta(mcframe.clientMABC.MABCP0580.HdrAllR.psppl_prnt_typ_nm_META);
		p.HdrAllTable.addColumnConfig(p.columnHdrAll_psppl_prnt_typ_nm);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_bp_cd.getListConfig().setPutter(getCnd_bp_cd_ListPutter());
		Hdr_psppl_cd.getListConfig().setPutter(getHdr_psppl_cd_ListPutter());
		Hdr_bsppl_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_bsppl_dpt_cd.getListConfig().setPutter(getHdr_bsppl_dpt_cd_ListPutter());
		Hdr_ap_cred_cd.getListConfig().setPutter(getHdr_ap_cred_cd_ListPutter());
		Hdr_pay_bank_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_pay_bank_ac_cd.getListConfig().setPutter(getHdr_pay_bank_ac_cd_ListPutter());
		Hdr_ap_setoff_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_ap_setoff_grp_cd.getListConfig().setPutter(getHdr_ap_setoff_grp_cd_ListPutter());
		Hdr_pay_tax_rnd_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_pay_tax_rnd_typ.getListConfig().setPutter(getHdr_pay_tax_rnd_typ_ListPutter());
		Hdr_pay_schd_ba_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_pay_schd_ba_typ.getListConfig().setPutter(getHdr_pay_schd_ba_typ_ListPutter());
		Hdr_pay_schd_cl_ba_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_pay_schd_cl_ba_typ.getListConfig().setPutter(getHdr_pay_schd_cl_ba_typ_ListPutter());
		Hdr_bsppl_prnt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_bsppl_prnt_typ.getListConfig().setPutter(getHdr_bsppl_prnt_typ_ListPutter());
		Hdr_pay_ntc_dtl_subttl_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_pay_ntc_dtl_subttl_typ.getListConfig().setPutter(getHdr_pay_ntc_dtl_subttl_typ_ListPutter());
		Hdr_pay_ntc_dtl_brk_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_pay_ntc_dtl_brk_typ.getListConfig().setPutter(getHdr_pay_ntc_dtl_brk_typ_ListPutter());
		Hdr_pay_ntc_dtl_sort_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_pay_ntc_dtl_sort_typ.getListConfig().setPutter(getHdr_pay_ntc_dtl_sort_typ_ListPutter());
		Hdr_pay_ntc_can_slip_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_pay_ntc_can_slip_typ.getListConfig().setPutter(getHdr_pay_ntc_can_slip_typ_ListPutter());
		Hdr_pay_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_pay_dpt_cd.getListConfig().setPutter(getHdr_pay_dpt_cd_ListPutter());
		Hdr_psppl_prnt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_psppl_prnt_typ.getListConfig().setPutter(getHdr_psppl_prnt_typ_ListPutter());
		columnWrk3Dtl_cur_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk3Dtl_cur_cd.getListConfig().setPutter(getWrk3Dtl_cur_cd_ListPutter());
		columnWrk3Dtl_sttl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk3Dtl_sttl_cd.getListConfig().setPutter(getWrk3Dtl_sttl_cd_ListPutter());
		columnWrk3Dtl_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk3Dtl_wg_cd.getListConfig().setPutter(getWrk3Dtl_wg_cd_ListPutter());
		columnWrk3Dtl_crryovr_mons_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk3Dtl_crryovr_mons_typ.getListConfig().setPutter(getWrk3Dtl_crryovr_mons_typ_ListPutter());
		columnWrk5Dtl_if_proc_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk5Dtl_if_proc_typ.getListConfig().setPutter(getWrk5Dtl_if_proc_typ_ListPutter());
		columnWrk5Dtl_ext_sys_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk5Dtl_ext_sys_cd.getListConfig().setPutter(getWrk5Dtl_ext_sys_cd_ListPutter());
		columnHdrAll_pay_ntc_dtl_subttl_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnHdrAll_pay_ntc_dtl_subttl_typ.getListConfig().setPutter(getHdrAll_pay_ntc_dtl_subttl_typ_ListPutter());
		columnHdrAll_pay_ntc_dtl_brk_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnHdrAll_pay_ntc_dtl_brk_typ.getListConfig().setPutter(getHdrAll_pay_ntc_dtl_brk_typ_ListPutter());
		columnHdrAll_pay_ntc_dtl_sort_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnHdrAll_pay_ntc_dtl_sort_typ.getListConfig().setPutter(getHdrAll_pay_ntc_dtl_sort_typ_ListPutter());
		columnHdrAll_pay_ntc_can_slip_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnHdrAll_pay_ntc_can_slip_typ.getListConfig().setPutter(getHdrAll_pay_ntc_can_slip_typ_ListPutter());
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
	 * [Hdr_psppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_psppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Hdr_bsppl_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_bsppl_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Hdr_ap_cred_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_ap_cred_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Hdr_pay_bank_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_pay_bank_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExtBankAc");
		return lp;
	}
	 
	/**
	 * [Hdr_ap_setoff_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_ap_setoff_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SetoffGrp");
		return lp;
	}
	 
	/**
	 * [Hdr_pay_tax_rnd_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_pay_tax_rnd_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RndTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_pay_schd_ba_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_pay_schd_ba_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BaTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_pay_schd_cl_ba_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_pay_schd_cl_ba_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BaTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_bsppl_prnt_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_bsppl_prnt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PrntTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_pay_ntc_dtl_subttl_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_pay_ntc_dtl_subttl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PayNtcDtlSubttlTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_pay_ntc_dtl_brk_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_pay_ntc_dtl_brk_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PayNtcDtlBrkTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_pay_ntc_dtl_sort_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_pay_ntc_dtl_sort_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PayNtcDtlSortTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_pay_ntc_can_slip_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_pay_ntc_can_slip_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PayNtcCanSlipTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_pay_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_pay_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Hdr_psppl_prnt_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_psppl_prnt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PrntTyp");
		return lp;
	}
	 
	/**
	 * [Wrk3Dtl_cur_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk3Dtl_cur_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Cur");
		return lp;
	}
	 
	/**
	 * [Wrk3Dtl_sttl_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk3Dtl_sttl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ApSttlPaySchdCtl");
		return lp;
	}
	 
	/**
	 * [Wrk3Dtl_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk3Dtl_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ApWg");
		return lp;
	}
	 
	/**
	 * [Wrk3Dtl_crryovr_mons_typ_ListPutter]の作成
	 */
	protected MCListPutter createWrk3Dtl_crryovr_mons_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CrryovrMonsTyp");
		return lp;
	}
	 
	/**
	 * [Wrk5Dtl_if_proc_typ_ListPutter]の作成
	 */
	protected MCListPutter createWrk5Dtl_if_proc_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IfProcTyp");
		return lp;
	}
	 
	/**
	 * [Wrk5Dtl_ext_sys_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk5Dtl_ext_sys_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExtSysEdi");
		return lp;
	}
	 
	/**
	 * [HdrAll_pay_ntc_dtl_subttl_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdrAll_pay_ntc_dtl_subttl_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [HdrAll_pay_ntc_dtl_brk_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdrAll_pay_ntc_dtl_brk_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [HdrAll_pay_ntc_dtl_sort_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdrAll_pay_ntc_dtl_sort_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [HdrAll_pay_ntc_can_slip_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdrAll_pay_ntc_can_slip_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_bp_cd) return getCnd_bp_cd(row, info);
		if(combo == Hdr_psppl_cd) return getHdr_psppl_cd(row, info);
		if(combo == Hdr_bsppl_dpt_cd) return getHdr_bsppl_dpt_cd(row, info);
		if(combo == Hdr_ap_cred_cd) return getHdr_ap_cred_cd(row, info);
		if(combo == Hdr_pay_bank_ac_cd) return getHdr_pay_bank_ac_cd(row, info);
		if(combo == Hdr_ap_setoff_grp_cd) return getHdr_ap_setoff_grp_cd(row, info);
		if(combo == Hdr_pay_tax_rnd_typ) return getHdr_pay_tax_rnd_typ(row, info);
		if(combo == Hdr_pay_schd_ba_typ) return getHdr_pay_schd_ba_typ(row, info);
		if(combo == Hdr_pay_schd_cl_ba_typ) return getHdr_pay_schd_cl_ba_typ(row, info);
		if(combo == Hdr_bsppl_prnt_typ) return getHdr_bsppl_prnt_typ(row, info);
		if(combo == Hdr_pay_ntc_dtl_subttl_typ) return getHdr_pay_ntc_dtl_subttl_typ(row, info);
		if(combo == Hdr_pay_ntc_dtl_brk_typ) return getHdr_pay_ntc_dtl_brk_typ(row, info);
		if(combo == Hdr_pay_ntc_dtl_sort_typ) return getHdr_pay_ntc_dtl_sort_typ(row, info);
		if(combo == Hdr_pay_ntc_can_slip_typ) return getHdr_pay_ntc_can_slip_typ(row, info);
		if(combo == Hdr_pay_dpt_cd) return getHdr_pay_dpt_cd(row, info);
		if(combo == Hdr_psppl_prnt_typ) return getHdr_psppl_prnt_typ(row, info);
		if(combo == columnWrk3Dtl_cur_cd) return getWrk3Dtl_cur_cd(row, info);
		if(combo == columnWrk3Dtl_sttl_cd) return getWrk3Dtl_sttl_cd(row, info);
		if(combo == columnWrk3Dtl_wg_cd) return getWrk3Dtl_wg_cd(row, info);
		if(combo == columnWrk3Dtl_crryovr_mons_typ) return getWrk3Dtl_crryovr_mons_typ(row, info);
		if(combo == columnWrk5Dtl_if_proc_typ) return getWrk5Dtl_if_proc_typ(row, info);
		if(combo == columnWrk5Dtl_ext_sys_cd) return getWrk5Dtl_ext_sys_cd(row, info);
		if(combo == columnHdrAll_pay_ntc_dtl_subttl_typ) return getHdrAll_pay_ntc_dtl_subttl_typ(row, info);
		if(combo == columnHdrAll_pay_ntc_dtl_brk_typ) return getHdrAll_pay_ntc_dtl_brk_typ(row, info);
		if(combo == columnHdrAll_pay_ntc_dtl_sort_typ) return getHdrAll_pay_ntc_dtl_sort_typ(row, info);
		if(combo == columnHdrAll_pay_ntc_can_slip_typ) return getHdrAll_pay_ntc_can_slip_typ(row, info);
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
		else if (ap == Wrk3DtlBtn_select_all) doWrk3DtlBtn_select_all(info);
		else if (ap == Wrk3DtlBtn_deselect_all) doWrk3DtlBtn_deselect_all(info);
		else if (ap == Wrk3DtlBtn_radd) doWrk3DtlBtn_radd(info);
		else if (ap == Wrk3DtlBtn_rdel) doWrk3DtlBtn_rdel(info);
		else if (ap == Wrk3DtlBtn_rcopy) doWrk3DtlBtn_rcopy(info);
		else if (ap == Wrk5Hdr_set_dt) doWrk5Hdr_set_dt(info);
		else if (ap == Wrk5DtlBtn_select_all) doWrk5DtlBtn_select_all(info);
		else if (ap == Wrk5DtlBtn_deselect_all) doWrk5DtlBtn_deselect_all(info);
		else if (ap == Wrk5DtlBtn_radd) doWrk5DtlBtn_radd(info);
		else if (ap == Wrk5DtlBtn_rdel) doWrk5DtlBtn_rdel(info);
		else if (ap == Wrk5DtlBtn_rcopy) doWrk5DtlBtn_rcopy(info);
		else if (ap == Btn_open_MABCP0510) doBtn_open_MABCP0510(info);
		else if (ap == Btn_upd) doBtn_upd(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Wrk3DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk3DtlBtn_select_all(MCEventInfo info);

	/**
	 * [Wrk3DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk3DtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [Wrk3DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk3DtlBtn_radd(MCEventInfo info);

	/**
	 * [Wrk3DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk3DtlBtn_rdel(MCEventInfo info);

	/**
	 * [Wrk3DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk3DtlBtn_rcopy(MCEventInfo info);

	/**
	 * [Wrk5Hdr]パネルの[set_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk5Hdr_set_dt(MCEventInfo info);

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
		if (vc == Wrk3DtlTable) return doWrk3Dtl_VC(info);
		if (vc == Wrk5DtlTable) return doWrk5Dtl_VC(info);
		if (vc == HdrAllTable) return doHdrAll_VC(info);
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_bp_cd) return doCnd_bp_cd_VC(info);
		if (vc == Cnd_bp_nm) return doCnd_bp_nm_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == Hdr_bp_cd) return doHdr_bp_cd_VC(info);
		if (vc == Hdr_bp_nm) return doHdr_bp_nm_VC(info);
		if (vc == Hdr_bsppl_flg) return doHdr_bsppl_flg_VC(info);
		if (vc == Hdr_psppl_flg) return doHdr_psppl_flg_VC(info);
		if (vc == Hdr_psppl_cd) return doHdr_psppl_cd_VC(info);
		if (vc == Hdr_psppl_nm) return doHdr_psppl_nm_VC(info);
		if (vc == Hdr_bsppl_dpt_cd) return doHdr_bsppl_dpt_cd_VC(info);
		if (vc == Hdr_bsppl_dpt_nm) return doHdr_bsppl_dpt_nm_VC(info);
		if (vc == Hdr_check_bsppl_dpt_cd) return doHdr_check_bsppl_dpt_cd_VC(info);
		if (vc == Hdr_ap_cred_cd) return doHdr_ap_cred_cd_VC(info);
		if (vc == Hdr_ap_cred_nm) return doHdr_ap_cred_nm_VC(info);
		if (vc == Hdr_purc_interim_cl_flg) return doHdr_purc_interim_cl_flg_VC(info);
		if (vc == Hdr_pay_bank_ac_cd) return doHdr_pay_bank_ac_cd_VC(info);
		if (vc == Hdr_pay_bank_ac_nm) return doHdr_pay_bank_ac_nm_VC(info);
		if (vc == Hdr_pay_spot_flg) return doHdr_pay_spot_flg_VC(info);
		if (vc == Hdr_psppl_cl_day1) return doHdr_psppl_cl_day1_VC(info);
		if (vc == Hdr_psppl_cl_day2) return doHdr_psppl_cl_day2_VC(info);
		if (vc == Hdr_psppl_cl_day3) return doHdr_psppl_cl_day3_VC(info);
		if (vc == Hdr_psppl_cl_day4) return doHdr_psppl_cl_day4_VC(info);
		if (vc == Hdr_psppl_cl_day5) return doHdr_psppl_cl_day5_VC(info);
		if (vc == Hdr_ap_setoff_grp_cd) return doHdr_ap_setoff_grp_cd_VC(info);
		if (vc == Hdr_ap_setoff_grp_nm) return doHdr_ap_setoff_grp_nm_VC(info);
		if (vc == Hdr_tax_on_pay_flg) return doHdr_tax_on_pay_flg_VC(info);
		if (vc == Hdr_pay_tax_rnd_typ) return doHdr_pay_tax_rnd_typ_VC(info);
		if (vc == Hdr_pay_tax_rnd_typ_nm) return doHdr_pay_tax_rnd_typ_nm_VC(info);
		if (vc == Hdr_pay_schd_ba_typ) return doHdr_pay_schd_ba_typ_VC(info);
		if (vc == Hdr_pay_schd_ba_typ_nm) return doHdr_pay_schd_ba_typ_nm_VC(info);
		if (vc == Hdr_batch_pay_schd_cl_flg) return doHdr_batch_pay_schd_cl_flg_VC(info);
		if (vc == Hdr_pay_schd_cl_delay_days) return doHdr_pay_schd_cl_delay_days_VC(info);
		if (vc == Hdr_pay_schd_cl_ba_typ) return doHdr_pay_schd_cl_ba_typ_VC(info);
		if (vc == Hdr_pay_schd_cl_ba_typ_nm) return doHdr_pay_schd_cl_ba_typ_nm_VC(info);
		if (vc == Hdr_bsppl_prnt_typ) return doHdr_bsppl_prnt_typ_VC(info);
		if (vc == Hdr_bsppl_prnt_typ_nm) return doHdr_bsppl_prnt_typ_nm_VC(info);
		if (vc == Hdr_pay_ntc_prnt_flg) return doHdr_pay_ntc_prnt_flg_VC(info);
		if (vc == Hdr_pay_ntc_zip_cd) return doHdr_pay_ntc_zip_cd_VC(info);
		if (vc == Hdr_pay_ntc_addr1) return doHdr_pay_ntc_addr1_VC(info);
		if (vc == Hdr_pay_ntc_addr2) return doHdr_pay_ntc_addr2_VC(info);
		if (vc == Hdr_pay_ntc_addr3) return doHdr_pay_ntc_addr3_VC(info);
		if (vc == Hdr_pay_ntc_addr4) return doHdr_pay_ntc_addr4_VC(info);
		if (vc == Hdr_pay_ntc_tel) return doHdr_pay_ntc_tel_VC(info);
		if (vc == Hdr_pay_ntc_bsppl_nm) return doHdr_pay_ntc_bsppl_nm_VC(info);
		if (vc == Hdr_pay_ntc_bsppl_dpt) return doHdr_pay_ntc_bsppl_dpt_VC(info);
		if (vc == Hdr_pay_ntc_bsppl_psn) return doHdr_pay_ntc_bsppl_psn_VC(info);
		if (vc == Hdr_pay_ntc_bsppl_psn_title) return doHdr_pay_ntc_bsppl_psn_title_VC(info);
		if (vc == Hdr_pay_ntc_dtl_outp_flg) return doHdr_pay_ntc_dtl_outp_flg_VC(info);
		if (vc == Hdr_pay_ntc_bfw_bal_disp_flg) return doHdr_pay_ntc_bfw_bal_disp_flg_VC(info);
		if (vc == Hdr_pay_ntc_adv_pay_flg) return doHdr_pay_ntc_adv_pay_flg_VC(info);
		if (vc == Hdr_pay_ntc_dtl_pay_flg) return doHdr_pay_ntc_dtl_pay_flg_VC(info);
		if (vc == Hdr_pay_ntc_dtl_subttl_typ) return doHdr_pay_ntc_dtl_subttl_typ_VC(info);
		if (vc == Hdr_pay_ntc_dtl_subttl_typ_nm) return doHdr_pay_ntc_dtl_subttl_typ_nm_VC(info);
		if (vc == Hdr_pay_ntc_dtl_brk_typ) return doHdr_pay_ntc_dtl_brk_typ_VC(info);
		if (vc == Hdr_pay_ntc_dtl_brk_typ_nm) return doHdr_pay_ntc_dtl_brk_typ_nm_VC(info);
		if (vc == Hdr_pay_ntc_dtl_sort_typ) return doHdr_pay_ntc_dtl_sort_typ_VC(info);
		if (vc == Hdr_pay_ntc_dtl_sort_typ_nm) return doHdr_pay_ntc_dtl_sort_typ_nm_VC(info);
		if (vc == Hdr_pay_ntc_can_slip_typ) return doHdr_pay_ntc_can_slip_typ_VC(info);
		if (vc == Hdr_pay_ntc_can_slip_typ_nm) return doHdr_pay_ntc_can_slip_typ_nm_VC(info);
		if (vc == Hdr_psppl_rmrks) return doHdr_psppl_rmrks_VC(info);
		if (vc == Hdr_note_days) return doHdr_note_days_VC(info);
		if (vc == Hdr_pay_dpt_cd) return doHdr_pay_dpt_cd_VC(info);
		if (vc == Hdr_pay_dpt_nm) return doHdr_pay_dpt_nm_VC(info);
		if (vc == Hdr_check_pay_dpt_cd) return doHdr_check_pay_dpt_cd_VC(info);
		if (vc == Hdr_psppl_prnt_typ) return doHdr_psppl_prnt_typ_VC(info);
		if (vc == Hdr_psppl_prnt_typ_nm) return doHdr_psppl_prnt_typ_nm_VC(info);
		if (vc == Wrk3Hdr_psppl_cl_day1) return doWrk3Hdr_psppl_cl_day1_VC(info);
		if (vc == Wrk3Hdr_psppl_cl_day2) return doWrk3Hdr_psppl_cl_day2_VC(info);
		if (vc == Wrk3Hdr_psppl_cl_day3) return doWrk3Hdr_psppl_cl_day3_VC(info);
		if (vc == Wrk3Hdr_psppl_cl_day4) return doWrk3Hdr_psppl_cl_day4_VC(info);
		if (vc == Wrk3Hdr_psppl_cl_day5) return doWrk3Hdr_psppl_cl_day5_VC(info);
		if (vc == columnWrk3Dtl_check) return doWrk3Dtl_check_VC(info);
		if (vc == columnWrk3Dtl_del_flg) return doWrk3Dtl_del_flg_VC(info);
		if (vc == columnWrk3Dtl_bsppl_cd) return doWrk3Dtl_bsppl_cd_VC(info);
		if (vc == columnWrk3Dtl_psppl_cl_day1) return doWrk3Dtl_psppl_cl_day1_VC(info);
		if (vc == columnWrk3Dtl_psppl_cl_day2) return doWrk3Dtl_psppl_cl_day2_VC(info);
		if (vc == columnWrk3Dtl_psppl_cl_day3) return doWrk3Dtl_psppl_cl_day3_VC(info);
		if (vc == columnWrk3Dtl_psppl_cl_day4) return doWrk3Dtl_psppl_cl_day4_VC(info);
		if (vc == columnWrk3Dtl_psppl_cl_day5) return doWrk3Dtl_psppl_cl_day5_VC(info);
		if (vc == columnWrk3Dtl_cur_cd) return doWrk3Dtl_cur_cd_VC(info);
		if (vc == columnWrk3Dtl_cur_nm) return doWrk3Dtl_cur_nm_VC(info);
		if (vc == columnWrk3Dtl_amt_dec_place) return doWrk3Dtl_amt_dec_place_VC(info);
		if (vc == columnWrk3Dtl_sttl_cd) return doWrk3Dtl_sttl_cd_VC(info);
		if (vc == columnWrk3Dtl_sttl_nm) return doWrk3Dtl_sttl_nm_VC(info);
		if (vc == columnWrk3Dtl_ap_sttl_typ) return doWrk3Dtl_ap_sttl_typ_VC(info);
		if (vc == columnWrk3Dtl_wg_cd) return doWrk3Dtl_wg_cd_VC(info);
		if (vc == columnWrk3Dtl_wg_nm) return doWrk3Dtl_wg_nm_VC(info);
		if (vc == columnWrk3Dtl_rate) return doWrk3Dtl_rate_VC(info);
		if (vc == columnWrk3Dtl_crryovr_mons_typ) return doWrk3Dtl_crryovr_mons_typ_VC(info);
		if (vc == columnWrk3Dtl_crryovr_mons_typ_nm) return doWrk3Dtl_crryovr_mons_typ_nm_VC(info);
		if (vc == columnWrk3Dtl_pay_crryovr_mons1) return doWrk3Dtl_pay_crryovr_mons1_VC(info);
		if (vc == columnWrk3Dtl_pay_day1) return doWrk3Dtl_pay_day1_VC(info);
		if (vc == columnWrk3Dtl_pay_crryovr_mons2) return doWrk3Dtl_pay_crryovr_mons2_VC(info);
		if (vc == columnWrk3Dtl_pay_day2) return doWrk3Dtl_pay_day2_VC(info);
		if (vc == columnWrk3Dtl_pay_crryovr_mons3) return doWrk3Dtl_pay_crryovr_mons3_VC(info);
		if (vc == columnWrk3Dtl_pay_day3) return doWrk3Dtl_pay_day3_VC(info);
		if (vc == columnWrk3Dtl_pay_crryovr_mons4) return doWrk3Dtl_pay_crryovr_mons4_VC(info);
		if (vc == columnWrk3Dtl_pay_day4) return doWrk3Dtl_pay_day4_VC(info);
		if (vc == columnWrk3Dtl_pay_crryovr_mons5) return doWrk3Dtl_pay_crryovr_mons5_VC(info);
		if (vc == columnWrk3Dtl_pay_day5) return doWrk3Dtl_pay_day5_VC(info);
		if (vc == columnWrk3Dtl_memo1) return doWrk3Dtl_memo1_VC(info);
		if (vc == columnWrk3Dtl_memo2) return doWrk3Dtl_memo2_VC(info);
		if (vc == columnWrk3Dtl_memo3) return doWrk3Dtl_memo3_VC(info);
		if (vc == columnWrk3Dtl_ins_usr_id) return doWrk3Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk3Dtl_ins_usr_nm) return doWrk3Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk3Dtl_ins_ts) return doWrk3Dtl_ins_ts_VC(info);
		if (vc == columnWrk3Dtl_ins_func_id) return doWrk3Dtl_ins_func_id_VC(info);
		if (vc == columnWrk3Dtl_ins_func_nm) return doWrk3Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk3Dtl_upd_cntr) return doWrk3Dtl_upd_cntr_VC(info);
		if (vc == columnWrk3Dtl_upd_usr_id) return doWrk3Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk3Dtl_upd_usr_nm) return doWrk3Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk3Dtl_upd_ts) return doWrk3Dtl_upd_ts_VC(info);
		if (vc == columnWrk3Dtl_upd_func_id) return doWrk3Dtl_upd_func_id_VC(info);
		if (vc == columnWrk3Dtl_upd_func_nm) return doWrk3Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk3Dtl_upd_srv_req_no) return doWrk3Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk3Dtl_del_usr_id) return doWrk3Dtl_del_usr_id_VC(info);
		if (vc == columnWrk3Dtl_del_usr_nm) return doWrk3Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk3Dtl_del_ts) return doWrk3Dtl_del_ts_VC(info);
		if (vc == Wrk5Hdr_st_dt) return doWrk5Hdr_st_dt_VC(info);
		if (vc == Wrk5Hdr_end_dt) return doWrk5Hdr_end_dt_VC(info);
		if (vc == columnWrk5Dtl_check) return doWrk5Dtl_check_VC(info);
		if (vc == columnWrk5Dtl_del_flg) return doWrk5Dtl_del_flg_VC(info);
		if (vc == columnWrk5Dtl_bp_cd) return doWrk5Dtl_bp_cd_VC(info);
		if (vc == columnWrk5Dtl_if_proc_typ) return doWrk5Dtl_if_proc_typ_VC(info);
		if (vc == columnWrk5Dtl_if_proc_typ_nm) return doWrk5Dtl_if_proc_typ_nm_VC(info);
		if (vc == columnWrk5Dtl_not_onr_prov_flg) return doWrk5Dtl_not_onr_prov_flg_VC(info);
		if (vc == columnWrk5Dtl_ext_sys_cd) return doWrk5Dtl_ext_sys_cd_VC(info);
		if (vc == columnWrk5Dtl_ext_sys_nm) return doWrk5Dtl_ext_sys_nm_VC(info);
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
		if (vc == columnHdrAll_check) return doHdrAll_check_VC(info);
		if (vc == columnHdrAll_bp_cd) return doHdrAll_bp_cd_VC(info);
		if (vc == columnHdrAll_bp_nm) return doHdrAll_bp_nm_VC(info);
		if (vc == columnHdrAll_bsppl_flg) return doHdrAll_bsppl_flg_VC(info);
		if (vc == columnHdrAll_psppl_flg) return doHdrAll_psppl_flg_VC(info);
		if (vc == columnHdrAll_psppl_cd) return doHdrAll_psppl_cd_VC(info);
		if (vc == columnHdrAll_psppl_nm) return doHdrAll_psppl_nm_VC(info);
		if (vc == columnHdrAll_bsppl_dpt_cd) return doHdrAll_bsppl_dpt_cd_VC(info);
		if (vc == columnHdrAll_bsppl_dpt_nm) return doHdrAll_bsppl_dpt_nm_VC(info);
		if (vc == columnHdrAll_check_bsppl_dpt_cd) return doHdrAll_check_bsppl_dpt_cd_VC(info);
		if (vc == columnHdrAll_ap_cred_cd) return doHdrAll_ap_cred_cd_VC(info);
		if (vc == columnHdrAll_ap_cred_nm) return doHdrAll_ap_cred_nm_VC(info);
		if (vc == columnHdrAll_purc_interim_cl_flg) return doHdrAll_purc_interim_cl_flg_VC(info);
		if (vc == columnHdrAll_pay_bank_ac_cd) return doHdrAll_pay_bank_ac_cd_VC(info);
		if (vc == columnHdrAll_pay_bank_ac_nm) return doHdrAll_pay_bank_ac_nm_VC(info);
		if (vc == columnHdrAll_pay_spot_flg) return doHdrAll_pay_spot_flg_VC(info);
		if (vc == columnHdrAll_psppl_cl_day1) return doHdrAll_psppl_cl_day1_VC(info);
		if (vc == columnHdrAll_psppl_cl_day2) return doHdrAll_psppl_cl_day2_VC(info);
		if (vc == columnHdrAll_psppl_cl_day3) return doHdrAll_psppl_cl_day3_VC(info);
		if (vc == columnHdrAll_psppl_cl_day4) return doHdrAll_psppl_cl_day4_VC(info);
		if (vc == columnHdrAll_psppl_cl_day5) return doHdrAll_psppl_cl_day5_VC(info);
		if (vc == columnHdrAll_ap_setoff_grp_cd) return doHdrAll_ap_setoff_grp_cd_VC(info);
		if (vc == columnHdrAll_ap_setoff_grp_nm) return doHdrAll_ap_setoff_grp_nm_VC(info);
		if (vc == columnHdrAll_tax_on_pay_flg) return doHdrAll_tax_on_pay_flg_VC(info);
		if (vc == columnHdrAll_pay_tax_rnd_typ) return doHdrAll_pay_tax_rnd_typ_VC(info);
		if (vc == columnHdrAll_pay_tax_rnd_typ_nm) return doHdrAll_pay_tax_rnd_typ_nm_VC(info);
		if (vc == columnHdrAll_pay_schd_ba_typ) return doHdrAll_pay_schd_ba_typ_VC(info);
		if (vc == columnHdrAll_pay_schd_ba_typ_nm) return doHdrAll_pay_schd_ba_typ_nm_VC(info);
		if (vc == columnHdrAll_batch_pay_schd_cl_flg) return doHdrAll_batch_pay_schd_cl_flg_VC(info);
		if (vc == columnHdrAll_pay_schd_cl_delay_days) return doHdrAll_pay_schd_cl_delay_days_VC(info);
		if (vc == columnHdrAll_pay_schd_cl_ba_typ) return doHdrAll_pay_schd_cl_ba_typ_VC(info);
		if (vc == columnHdrAll_pay_schd_cl_ba_typ_nm) return doHdrAll_pay_schd_cl_ba_typ_nm_VC(info);
		if (vc == columnHdrAll_bsppl_prnt_typ) return doHdrAll_bsppl_prnt_typ_VC(info);
		if (vc == columnHdrAll_bsppl_prnt_typ_nm) return doHdrAll_bsppl_prnt_typ_nm_VC(info);
		if (vc == columnHdrAll_pay_ntc_prnt_flg) return doHdrAll_pay_ntc_prnt_flg_VC(info);
		if (vc == columnHdrAll_pay_ntc_zip_cd) return doHdrAll_pay_ntc_zip_cd_VC(info);
		if (vc == columnHdrAll_pay_ntc_addr1) return doHdrAll_pay_ntc_addr1_VC(info);
		if (vc == columnHdrAll_pay_ntc_addr2) return doHdrAll_pay_ntc_addr2_VC(info);
		if (vc == columnHdrAll_pay_ntc_addr3) return doHdrAll_pay_ntc_addr3_VC(info);
		if (vc == columnHdrAll_pay_ntc_addr4) return doHdrAll_pay_ntc_addr4_VC(info);
		if (vc == columnHdrAll_pay_ntc_tel) return doHdrAll_pay_ntc_tel_VC(info);
		if (vc == columnHdrAll_pay_ntc_bsppl_nm) return doHdrAll_pay_ntc_bsppl_nm_VC(info);
		if (vc == columnHdrAll_pay_ntc_bsppl_dpt) return doHdrAll_pay_ntc_bsppl_dpt_VC(info);
		if (vc == columnHdrAll_pay_ntc_bsppl_psn) return doHdrAll_pay_ntc_bsppl_psn_VC(info);
		if (vc == columnHdrAll_pay_ntc_bsppl_psn_title) return doHdrAll_pay_ntc_bsppl_psn_title_VC(info);
		if (vc == columnHdrAll_pay_ntc_dtl_outp_flg) return doHdrAll_pay_ntc_dtl_outp_flg_VC(info);
		if (vc == columnHdrAll_pay_ntc_bfw_bal_disp_flg) return doHdrAll_pay_ntc_bfw_bal_disp_flg_VC(info);
		if (vc == columnHdrAll_pay_ntc_adv_pay_flg) return doHdrAll_pay_ntc_adv_pay_flg_VC(info);
		if (vc == columnHdrAll_pay_ntc_dtl_pay_flg) return doHdrAll_pay_ntc_dtl_pay_flg_VC(info);
		if (vc == columnHdrAll_pay_ntc_dtl_subttl_typ) return doHdrAll_pay_ntc_dtl_subttl_typ_VC(info);
		if (vc == columnHdrAll_pay_ntc_dtl_subttl_typ_nm) return doHdrAll_pay_ntc_dtl_subttl_typ_nm_VC(info);
		if (vc == columnHdrAll_pay_ntc_dtl_brk_typ) return doHdrAll_pay_ntc_dtl_brk_typ_VC(info);
		if (vc == columnHdrAll_pay_ntc_dtl_brk_typ_nm) return doHdrAll_pay_ntc_dtl_brk_typ_nm_VC(info);
		if (vc == columnHdrAll_pay_ntc_dtl_sort_typ) return doHdrAll_pay_ntc_dtl_sort_typ_VC(info);
		if (vc == columnHdrAll_pay_ntc_dtl_sort_typ_nm) return doHdrAll_pay_ntc_dtl_sort_typ_nm_VC(info);
		if (vc == columnHdrAll_pay_ntc_can_slip_typ) return doHdrAll_pay_ntc_can_slip_typ_VC(info);
		if (vc == columnHdrAll_pay_ntc_can_slip_typ_nm) return doHdrAll_pay_ntc_can_slip_typ_nm_VC(info);
		if (vc == columnHdrAll_psppl_rmrks) return doHdrAll_psppl_rmrks_VC(info);
		if (vc == columnHdrAll_note_days) return doHdrAll_note_days_VC(info);
		if (vc == columnHdrAll_pay_dpt_cd) return doHdrAll_pay_dpt_cd_VC(info);
		if (vc == columnHdrAll_pay_dpt_nm) return doHdrAll_pay_dpt_nm_VC(info);
		if (vc == columnHdrAll_check_pay_dpt_cd) return doHdrAll_check_pay_dpt_cd_VC(info);
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
		if (vc == columnHdrAll_psppl_prnt_typ) return doHdrAll_psppl_prnt_typ_VC(info);
		if (vc == columnHdrAll_psppl_prnt_typ_nm) return doHdrAll_psppl_prnt_typ_nm_VC(info);
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
	 * [Wrk3Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[bsppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bsppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[psppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_psppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[psppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_psppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[psppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_psppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bsppl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bsppl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bsppl_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bsppl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[check_bsppl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_check_bsppl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ap_cred_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ap_cred_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ap_cred_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ap_cred_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[purc_interim_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_interim_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_bank_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_bank_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_spot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_spot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_psppl_cl_day1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_psppl_cl_day2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_psppl_cl_day3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_psppl_cl_day4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_psppl_cl_day5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ap_setoff_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ap_setoff_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ap_setoff_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ap_setoff_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[tax_on_pay_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_tax_on_pay_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_tax_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_tax_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_schd_ba_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_schd_ba_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_schd_ba_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_schd_ba_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[batch_pay_schd_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_batch_pay_schd_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_schd_cl_delay_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_schd_cl_delay_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_schd_cl_ba_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_schd_cl_ba_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_schd_cl_ba_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_schd_cl_ba_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bsppl_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bsppl_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bsppl_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bsppl_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_bsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bsppl_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_bsppl_dpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bsppl_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_bsppl_psn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bsppl_psn_title]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_bsppl_psn_title_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_outp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_dtl_outp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bfw_bal_disp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_bfw_bal_disp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_adv_pay_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_adv_pay_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_pay_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_dtl_pay_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_subttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_dtl_subttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_subttl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_dtl_subttl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_brk_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_dtl_brk_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_brk_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_dtl_brk_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_sort_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_dtl_sort_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_sort_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_dtl_sort_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_can_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_can_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_ntc_can_slip_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_ntc_can_slip_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[psppl_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_psppl_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[note_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_note_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[pay_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_pay_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[check_pay_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_check_pay_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[psppl_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_psppl_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[psppl_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_psppl_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Hdr_psppl_cl_day1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Hdr_psppl_cl_day2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Hdr_psppl_cl_day3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Hdr_psppl_cl_day4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Hdr_psppl_cl_day5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[bsppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_bsppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_psppl_cl_day1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_psppl_cl_day2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_psppl_cl_day3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_psppl_cl_day4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_psppl_cl_day5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[sttl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_sttl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[sttl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_sttl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ap_sttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ap_sttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[rate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_rate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[crryovr_mons_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_crryovr_mons_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[crryovr_mons_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_crryovr_mons_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_pay_crryovr_mons1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_pay_day1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_pay_crryovr_mons2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_pay_day2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_pay_crryovr_mons3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_pay_day3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_pay_crryovr_mons4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_pay_day4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_pay_crryovr_mons5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_pay_day5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Hdr]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Hdr_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Hdr]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Hdr_end_dt_VC(MCEventInfo info){
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
	 * [Wrk5Dtl]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[if_proc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_if_proc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[if_proc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_if_proc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[not_onr_prov_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_not_onr_prov_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ext_sys_nm_VC(MCEventInfo info){
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
	 * [HdrAll]パネルの[bsppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bsppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[psppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_psppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[psppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_psppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[psppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_psppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bsppl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bsppl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bsppl_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bsppl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[check_bsppl_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_check_bsppl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[ap_cred_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_ap_cred_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[ap_cred_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_ap_cred_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[purc_interim_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_purc_interim_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_bank_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_bank_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_bank_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_bank_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_spot_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_spot_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_psppl_cl_day1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_psppl_cl_day2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_psppl_cl_day3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_psppl_cl_day4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_psppl_cl_day5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[ap_setoff_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_ap_setoff_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[ap_setoff_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_ap_setoff_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[tax_on_pay_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_tax_on_pay_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_tax_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_tax_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_tax_rnd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_tax_rnd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_schd_ba_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_schd_ba_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_schd_ba_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_schd_ba_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[batch_pay_schd_cl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_batch_pay_schd_cl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_schd_cl_delay_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_schd_cl_delay_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_schd_cl_ba_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_schd_cl_ba_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_schd_cl_ba_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_schd_cl_ba_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bsppl_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bsppl_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[bsppl_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_bsppl_prnt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_zip_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_zip_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_addr1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_addr1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_addr2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_addr2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_addr3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_addr3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_addr4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_addr4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_tel]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_tel_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bsppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_bsppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bsppl_dpt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_bsppl_dpt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bsppl_psn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_bsppl_psn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bsppl_psn_title]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_bsppl_psn_title_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_outp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_dtl_outp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bfw_bal_disp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_bfw_bal_disp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_adv_pay_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_adv_pay_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_pay_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_dtl_pay_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_subttl_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_dtl_subttl_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_subttl_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_dtl_subttl_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_brk_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_dtl_brk_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_brk_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_dtl_brk_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_sort_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_dtl_sort_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_sort_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_dtl_sort_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_can_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_can_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_can_slip_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_ntc_can_slip_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[psppl_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_psppl_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[note_days]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_note_days_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[pay_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_pay_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[check_pay_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_check_pay_dpt_cd_VC(MCEventInfo info){
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
	 * [HdrAll]パネルの[psppl_prnt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_psppl_prnt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [HdrAll]パネルの[psppl_prnt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrAll_psppl_prnt_typ_nm_VC(MCEventInfo info){
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
		else if (nc == Wrk3DtlTable) doWrk3Dtl_NC(info);
		else if (nc == Wrk5DtlTable) doWrk5Dtl_NC(info);
		else if (nc == HdrAllTable) doHdrAll_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_bp_cd) doCnd_bp_cd_NC(info);
		else if (nc == Cnd_bp_nm) doCnd_bp_nm_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == Hdr_bp_cd) doHdr_bp_cd_NC(info);
		else if (nc == Hdr_bp_nm) doHdr_bp_nm_NC(info);
		else if (nc == Hdr_bsppl_flg) doHdr_bsppl_flg_NC(info);
		else if (nc == Hdr_psppl_flg) doHdr_psppl_flg_NC(info);
		else if (nc == Hdr_psppl_cd) doHdr_psppl_cd_NC(info);
		else if (nc == Hdr_psppl_nm) doHdr_psppl_nm_NC(info);
		else if (nc == Hdr_bsppl_dpt_cd) doHdr_bsppl_dpt_cd_NC(info);
		else if (nc == Hdr_bsppl_dpt_nm) doHdr_bsppl_dpt_nm_NC(info);
		else if (nc == Hdr_check_bsppl_dpt_cd) doHdr_check_bsppl_dpt_cd_NC(info);
		else if (nc == Hdr_ap_cred_cd) doHdr_ap_cred_cd_NC(info);
		else if (nc == Hdr_ap_cred_nm) doHdr_ap_cred_nm_NC(info);
		else if (nc == Hdr_purc_interim_cl_flg) doHdr_purc_interim_cl_flg_NC(info);
		else if (nc == Hdr_pay_bank_ac_cd) doHdr_pay_bank_ac_cd_NC(info);
		else if (nc == Hdr_pay_bank_ac_nm) doHdr_pay_bank_ac_nm_NC(info);
		else if (nc == Hdr_pay_spot_flg) doHdr_pay_spot_flg_NC(info);
		else if (nc == Hdr_psppl_cl_day1) doHdr_psppl_cl_day1_NC(info);
		else if (nc == Hdr_psppl_cl_day2) doHdr_psppl_cl_day2_NC(info);
		else if (nc == Hdr_psppl_cl_day3) doHdr_psppl_cl_day3_NC(info);
		else if (nc == Hdr_psppl_cl_day4) doHdr_psppl_cl_day4_NC(info);
		else if (nc == Hdr_psppl_cl_day5) doHdr_psppl_cl_day5_NC(info);
		else if (nc == Hdr_ap_setoff_grp_cd) doHdr_ap_setoff_grp_cd_NC(info);
		else if (nc == Hdr_ap_setoff_grp_nm) doHdr_ap_setoff_grp_nm_NC(info);
		else if (nc == Hdr_tax_on_pay_flg) doHdr_tax_on_pay_flg_NC(info);
		else if (nc == Hdr_pay_tax_rnd_typ) doHdr_pay_tax_rnd_typ_NC(info);
		else if (nc == Hdr_pay_tax_rnd_typ_nm) doHdr_pay_tax_rnd_typ_nm_NC(info);
		else if (nc == Hdr_pay_schd_ba_typ) doHdr_pay_schd_ba_typ_NC(info);
		else if (nc == Hdr_pay_schd_ba_typ_nm) doHdr_pay_schd_ba_typ_nm_NC(info);
		else if (nc == Hdr_batch_pay_schd_cl_flg) doHdr_batch_pay_schd_cl_flg_NC(info);
		else if (nc == Hdr_pay_schd_cl_delay_days) doHdr_pay_schd_cl_delay_days_NC(info);
		else if (nc == Hdr_pay_schd_cl_ba_typ) doHdr_pay_schd_cl_ba_typ_NC(info);
		else if (nc == Hdr_pay_schd_cl_ba_typ_nm) doHdr_pay_schd_cl_ba_typ_nm_NC(info);
		else if (nc == Hdr_bsppl_prnt_typ) doHdr_bsppl_prnt_typ_NC(info);
		else if (nc == Hdr_bsppl_prnt_typ_nm) doHdr_bsppl_prnt_typ_nm_NC(info);
		else if (nc == Hdr_pay_ntc_prnt_flg) doHdr_pay_ntc_prnt_flg_NC(info);
		else if (nc == Hdr_pay_ntc_zip_cd) doHdr_pay_ntc_zip_cd_NC(info);
		else if (nc == Hdr_pay_ntc_addr1) doHdr_pay_ntc_addr1_NC(info);
		else if (nc == Hdr_pay_ntc_addr2) doHdr_pay_ntc_addr2_NC(info);
		else if (nc == Hdr_pay_ntc_addr3) doHdr_pay_ntc_addr3_NC(info);
		else if (nc == Hdr_pay_ntc_addr4) doHdr_pay_ntc_addr4_NC(info);
		else if (nc == Hdr_pay_ntc_tel) doHdr_pay_ntc_tel_NC(info);
		else if (nc == Hdr_pay_ntc_bsppl_nm) doHdr_pay_ntc_bsppl_nm_NC(info);
		else if (nc == Hdr_pay_ntc_bsppl_dpt) doHdr_pay_ntc_bsppl_dpt_NC(info);
		else if (nc == Hdr_pay_ntc_bsppl_psn) doHdr_pay_ntc_bsppl_psn_NC(info);
		else if (nc == Hdr_pay_ntc_bsppl_psn_title) doHdr_pay_ntc_bsppl_psn_title_NC(info);
		else if (nc == Hdr_pay_ntc_dtl_outp_flg) doHdr_pay_ntc_dtl_outp_flg_NC(info);
		else if (nc == Hdr_pay_ntc_bfw_bal_disp_flg) doHdr_pay_ntc_bfw_bal_disp_flg_NC(info);
		else if (nc == Hdr_pay_ntc_adv_pay_flg) doHdr_pay_ntc_adv_pay_flg_NC(info);
		else if (nc == Hdr_pay_ntc_dtl_pay_flg) doHdr_pay_ntc_dtl_pay_flg_NC(info);
		else if (nc == Hdr_pay_ntc_dtl_subttl_typ) doHdr_pay_ntc_dtl_subttl_typ_NC(info);
		else if (nc == Hdr_pay_ntc_dtl_subttl_typ_nm) doHdr_pay_ntc_dtl_subttl_typ_nm_NC(info);
		else if (nc == Hdr_pay_ntc_dtl_brk_typ) doHdr_pay_ntc_dtl_brk_typ_NC(info);
		else if (nc == Hdr_pay_ntc_dtl_brk_typ_nm) doHdr_pay_ntc_dtl_brk_typ_nm_NC(info);
		else if (nc == Hdr_pay_ntc_dtl_sort_typ) doHdr_pay_ntc_dtl_sort_typ_NC(info);
		else if (nc == Hdr_pay_ntc_dtl_sort_typ_nm) doHdr_pay_ntc_dtl_sort_typ_nm_NC(info);
		else if (nc == Hdr_pay_ntc_can_slip_typ) doHdr_pay_ntc_can_slip_typ_NC(info);
		else if (nc == Hdr_pay_ntc_can_slip_typ_nm) doHdr_pay_ntc_can_slip_typ_nm_NC(info);
		else if (nc == Hdr_psppl_rmrks) doHdr_psppl_rmrks_NC(info);
		else if (nc == Hdr_note_days) doHdr_note_days_NC(info);
		else if (nc == Hdr_pay_dpt_cd) doHdr_pay_dpt_cd_NC(info);
		else if (nc == Hdr_pay_dpt_nm) doHdr_pay_dpt_nm_NC(info);
		else if (nc == Hdr_check_pay_dpt_cd) doHdr_check_pay_dpt_cd_NC(info);
		else if (nc == Hdr_psppl_prnt_typ) doHdr_psppl_prnt_typ_NC(info);
		else if (nc == Hdr_psppl_prnt_typ_nm) doHdr_psppl_prnt_typ_nm_NC(info);
		else if (nc == Wrk3Hdr_psppl_cl_day1) doWrk3Hdr_psppl_cl_day1_NC(info);
		else if (nc == Wrk3Hdr_psppl_cl_day2) doWrk3Hdr_psppl_cl_day2_NC(info);
		else if (nc == Wrk3Hdr_psppl_cl_day3) doWrk3Hdr_psppl_cl_day3_NC(info);
		else if (nc == Wrk3Hdr_psppl_cl_day4) doWrk3Hdr_psppl_cl_day4_NC(info);
		else if (nc == Wrk3Hdr_psppl_cl_day5) doWrk3Hdr_psppl_cl_day5_NC(info);
		else if (nc == columnWrk3Dtl_check) doWrk3Dtl_check_NC(info);
		else if (nc == columnWrk3Dtl_del_flg) doWrk3Dtl_del_flg_NC(info);
		else if (nc == columnWrk3Dtl_bsppl_cd) doWrk3Dtl_bsppl_cd_NC(info);
		else if (nc == columnWrk3Dtl_psppl_cl_day1) doWrk3Dtl_psppl_cl_day1_NC(info);
		else if (nc == columnWrk3Dtl_psppl_cl_day2) doWrk3Dtl_psppl_cl_day2_NC(info);
		else if (nc == columnWrk3Dtl_psppl_cl_day3) doWrk3Dtl_psppl_cl_day3_NC(info);
		else if (nc == columnWrk3Dtl_psppl_cl_day4) doWrk3Dtl_psppl_cl_day4_NC(info);
		else if (nc == columnWrk3Dtl_psppl_cl_day5) doWrk3Dtl_psppl_cl_day5_NC(info);
		else if (nc == columnWrk3Dtl_cur_cd) doWrk3Dtl_cur_cd_NC(info);
		else if (nc == columnWrk3Dtl_cur_nm) doWrk3Dtl_cur_nm_NC(info);
		else if (nc == columnWrk3Dtl_amt_dec_place) doWrk3Dtl_amt_dec_place_NC(info);
		else if (nc == columnWrk3Dtl_sttl_cd) doWrk3Dtl_sttl_cd_NC(info);
		else if (nc == columnWrk3Dtl_sttl_nm) doWrk3Dtl_sttl_nm_NC(info);
		else if (nc == columnWrk3Dtl_ap_sttl_typ) doWrk3Dtl_ap_sttl_typ_NC(info);
		else if (nc == columnWrk3Dtl_wg_cd) doWrk3Dtl_wg_cd_NC(info);
		else if (nc == columnWrk3Dtl_wg_nm) doWrk3Dtl_wg_nm_NC(info);
		else if (nc == columnWrk3Dtl_rate) doWrk3Dtl_rate_NC(info);
		else if (nc == columnWrk3Dtl_crryovr_mons_typ) doWrk3Dtl_crryovr_mons_typ_NC(info);
		else if (nc == columnWrk3Dtl_crryovr_mons_typ_nm) doWrk3Dtl_crryovr_mons_typ_nm_NC(info);
		else if (nc == columnWrk3Dtl_pay_crryovr_mons1) doWrk3Dtl_pay_crryovr_mons1_NC(info);
		else if (nc == columnWrk3Dtl_pay_day1) doWrk3Dtl_pay_day1_NC(info);
		else if (nc == columnWrk3Dtl_pay_crryovr_mons2) doWrk3Dtl_pay_crryovr_mons2_NC(info);
		else if (nc == columnWrk3Dtl_pay_day2) doWrk3Dtl_pay_day2_NC(info);
		else if (nc == columnWrk3Dtl_pay_crryovr_mons3) doWrk3Dtl_pay_crryovr_mons3_NC(info);
		else if (nc == columnWrk3Dtl_pay_day3) doWrk3Dtl_pay_day3_NC(info);
		else if (nc == columnWrk3Dtl_pay_crryovr_mons4) doWrk3Dtl_pay_crryovr_mons4_NC(info);
		else if (nc == columnWrk3Dtl_pay_day4) doWrk3Dtl_pay_day4_NC(info);
		else if (nc == columnWrk3Dtl_pay_crryovr_mons5) doWrk3Dtl_pay_crryovr_mons5_NC(info);
		else if (nc == columnWrk3Dtl_pay_day5) doWrk3Dtl_pay_day5_NC(info);
		else if (nc == columnWrk3Dtl_memo1) doWrk3Dtl_memo1_NC(info);
		else if (nc == columnWrk3Dtl_memo2) doWrk3Dtl_memo2_NC(info);
		else if (nc == columnWrk3Dtl_memo3) doWrk3Dtl_memo3_NC(info);
		else if (nc == columnWrk3Dtl_ins_usr_id) doWrk3Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk3Dtl_ins_usr_nm) doWrk3Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk3Dtl_ins_ts) doWrk3Dtl_ins_ts_NC(info);
		else if (nc == columnWrk3Dtl_ins_func_id) doWrk3Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk3Dtl_ins_func_nm) doWrk3Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk3Dtl_upd_cntr) doWrk3Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk3Dtl_upd_usr_id) doWrk3Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk3Dtl_upd_usr_nm) doWrk3Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk3Dtl_upd_ts) doWrk3Dtl_upd_ts_NC(info);
		else if (nc == columnWrk3Dtl_upd_func_id) doWrk3Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk3Dtl_upd_func_nm) doWrk3Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk3Dtl_upd_srv_req_no) doWrk3Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk3Dtl_del_usr_id) doWrk3Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk3Dtl_del_usr_nm) doWrk3Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk3Dtl_del_ts) doWrk3Dtl_del_ts_NC(info);
		else if (nc == Wrk5Hdr_st_dt) doWrk5Hdr_st_dt_NC(info);
		else if (nc == Wrk5Hdr_end_dt) doWrk5Hdr_end_dt_NC(info);
		else if (nc == columnWrk5Dtl_check) doWrk5Dtl_check_NC(info);
		else if (nc == columnWrk5Dtl_del_flg) doWrk5Dtl_del_flg_NC(info);
		else if (nc == columnWrk5Dtl_bp_cd) doWrk5Dtl_bp_cd_NC(info);
		else if (nc == columnWrk5Dtl_if_proc_typ) doWrk5Dtl_if_proc_typ_NC(info);
		else if (nc == columnWrk5Dtl_if_proc_typ_nm) doWrk5Dtl_if_proc_typ_nm_NC(info);
		else if (nc == columnWrk5Dtl_not_onr_prov_flg) doWrk5Dtl_not_onr_prov_flg_NC(info);
		else if (nc == columnWrk5Dtl_ext_sys_cd) doWrk5Dtl_ext_sys_cd_NC(info);
		else if (nc == columnWrk5Dtl_ext_sys_nm) doWrk5Dtl_ext_sys_nm_NC(info);
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
		else if (nc == columnHdrAll_check) doHdrAll_check_NC(info);
		else if (nc == columnHdrAll_bp_cd) doHdrAll_bp_cd_NC(info);
		else if (nc == columnHdrAll_bp_nm) doHdrAll_bp_nm_NC(info);
		else if (nc == columnHdrAll_bsppl_flg) doHdrAll_bsppl_flg_NC(info);
		else if (nc == columnHdrAll_psppl_flg) doHdrAll_psppl_flg_NC(info);
		else if (nc == columnHdrAll_psppl_cd) doHdrAll_psppl_cd_NC(info);
		else if (nc == columnHdrAll_psppl_nm) doHdrAll_psppl_nm_NC(info);
		else if (nc == columnHdrAll_bsppl_dpt_cd) doHdrAll_bsppl_dpt_cd_NC(info);
		else if (nc == columnHdrAll_bsppl_dpt_nm) doHdrAll_bsppl_dpt_nm_NC(info);
		else if (nc == columnHdrAll_check_bsppl_dpt_cd) doHdrAll_check_bsppl_dpt_cd_NC(info);
		else if (nc == columnHdrAll_ap_cred_cd) doHdrAll_ap_cred_cd_NC(info);
		else if (nc == columnHdrAll_ap_cred_nm) doHdrAll_ap_cred_nm_NC(info);
		else if (nc == columnHdrAll_purc_interim_cl_flg) doHdrAll_purc_interim_cl_flg_NC(info);
		else if (nc == columnHdrAll_pay_bank_ac_cd) doHdrAll_pay_bank_ac_cd_NC(info);
		else if (nc == columnHdrAll_pay_bank_ac_nm) doHdrAll_pay_bank_ac_nm_NC(info);
		else if (nc == columnHdrAll_pay_spot_flg) doHdrAll_pay_spot_flg_NC(info);
		else if (nc == columnHdrAll_psppl_cl_day1) doHdrAll_psppl_cl_day1_NC(info);
		else if (nc == columnHdrAll_psppl_cl_day2) doHdrAll_psppl_cl_day2_NC(info);
		else if (nc == columnHdrAll_psppl_cl_day3) doHdrAll_psppl_cl_day3_NC(info);
		else if (nc == columnHdrAll_psppl_cl_day4) doHdrAll_psppl_cl_day4_NC(info);
		else if (nc == columnHdrAll_psppl_cl_day5) doHdrAll_psppl_cl_day5_NC(info);
		else if (nc == columnHdrAll_ap_setoff_grp_cd) doHdrAll_ap_setoff_grp_cd_NC(info);
		else if (nc == columnHdrAll_ap_setoff_grp_nm) doHdrAll_ap_setoff_grp_nm_NC(info);
		else if (nc == columnHdrAll_tax_on_pay_flg) doHdrAll_tax_on_pay_flg_NC(info);
		else if (nc == columnHdrAll_pay_tax_rnd_typ) doHdrAll_pay_tax_rnd_typ_NC(info);
		else if (nc == columnHdrAll_pay_tax_rnd_typ_nm) doHdrAll_pay_tax_rnd_typ_nm_NC(info);
		else if (nc == columnHdrAll_pay_schd_ba_typ) doHdrAll_pay_schd_ba_typ_NC(info);
		else if (nc == columnHdrAll_pay_schd_ba_typ_nm) doHdrAll_pay_schd_ba_typ_nm_NC(info);
		else if (nc == columnHdrAll_batch_pay_schd_cl_flg) doHdrAll_batch_pay_schd_cl_flg_NC(info);
		else if (nc == columnHdrAll_pay_schd_cl_delay_days) doHdrAll_pay_schd_cl_delay_days_NC(info);
		else if (nc == columnHdrAll_pay_schd_cl_ba_typ) doHdrAll_pay_schd_cl_ba_typ_NC(info);
		else if (nc == columnHdrAll_pay_schd_cl_ba_typ_nm) doHdrAll_pay_schd_cl_ba_typ_nm_NC(info);
		else if (nc == columnHdrAll_bsppl_prnt_typ) doHdrAll_bsppl_prnt_typ_NC(info);
		else if (nc == columnHdrAll_bsppl_prnt_typ_nm) doHdrAll_bsppl_prnt_typ_nm_NC(info);
		else if (nc == columnHdrAll_pay_ntc_prnt_flg) doHdrAll_pay_ntc_prnt_flg_NC(info);
		else if (nc == columnHdrAll_pay_ntc_zip_cd) doHdrAll_pay_ntc_zip_cd_NC(info);
		else if (nc == columnHdrAll_pay_ntc_addr1) doHdrAll_pay_ntc_addr1_NC(info);
		else if (nc == columnHdrAll_pay_ntc_addr2) doHdrAll_pay_ntc_addr2_NC(info);
		else if (nc == columnHdrAll_pay_ntc_addr3) doHdrAll_pay_ntc_addr3_NC(info);
		else if (nc == columnHdrAll_pay_ntc_addr4) doHdrAll_pay_ntc_addr4_NC(info);
		else if (nc == columnHdrAll_pay_ntc_tel) doHdrAll_pay_ntc_tel_NC(info);
		else if (nc == columnHdrAll_pay_ntc_bsppl_nm) doHdrAll_pay_ntc_bsppl_nm_NC(info);
		else if (nc == columnHdrAll_pay_ntc_bsppl_dpt) doHdrAll_pay_ntc_bsppl_dpt_NC(info);
		else if (nc == columnHdrAll_pay_ntc_bsppl_psn) doHdrAll_pay_ntc_bsppl_psn_NC(info);
		else if (nc == columnHdrAll_pay_ntc_bsppl_psn_title) doHdrAll_pay_ntc_bsppl_psn_title_NC(info);
		else if (nc == columnHdrAll_pay_ntc_dtl_outp_flg) doHdrAll_pay_ntc_dtl_outp_flg_NC(info);
		else if (nc == columnHdrAll_pay_ntc_bfw_bal_disp_flg) doHdrAll_pay_ntc_bfw_bal_disp_flg_NC(info);
		else if (nc == columnHdrAll_pay_ntc_adv_pay_flg) doHdrAll_pay_ntc_adv_pay_flg_NC(info);
		else if (nc == columnHdrAll_pay_ntc_dtl_pay_flg) doHdrAll_pay_ntc_dtl_pay_flg_NC(info);
		else if (nc == columnHdrAll_pay_ntc_dtl_subttl_typ) doHdrAll_pay_ntc_dtl_subttl_typ_NC(info);
		else if (nc == columnHdrAll_pay_ntc_dtl_subttl_typ_nm) doHdrAll_pay_ntc_dtl_subttl_typ_nm_NC(info);
		else if (nc == columnHdrAll_pay_ntc_dtl_brk_typ) doHdrAll_pay_ntc_dtl_brk_typ_NC(info);
		else if (nc == columnHdrAll_pay_ntc_dtl_brk_typ_nm) doHdrAll_pay_ntc_dtl_brk_typ_nm_NC(info);
		else if (nc == columnHdrAll_pay_ntc_dtl_sort_typ) doHdrAll_pay_ntc_dtl_sort_typ_NC(info);
		else if (nc == columnHdrAll_pay_ntc_dtl_sort_typ_nm) doHdrAll_pay_ntc_dtl_sort_typ_nm_NC(info);
		else if (nc == columnHdrAll_pay_ntc_can_slip_typ) doHdrAll_pay_ntc_can_slip_typ_NC(info);
		else if (nc == columnHdrAll_pay_ntc_can_slip_typ_nm) doHdrAll_pay_ntc_can_slip_typ_nm_NC(info);
		else if (nc == columnHdrAll_psppl_rmrks) doHdrAll_psppl_rmrks_NC(info);
		else if (nc == columnHdrAll_note_days) doHdrAll_note_days_NC(info);
		else if (nc == columnHdrAll_pay_dpt_cd) doHdrAll_pay_dpt_cd_NC(info);
		else if (nc == columnHdrAll_pay_dpt_nm) doHdrAll_pay_dpt_nm_NC(info);
		else if (nc == columnHdrAll_check_pay_dpt_cd) doHdrAll_check_pay_dpt_cd_NC(info);
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
		else if (nc == columnHdrAll_psppl_prnt_typ) doHdrAll_psppl_prnt_typ_NC(info);
		else if (nc == columnHdrAll_psppl_prnt_typ_nm) doHdrAll_psppl_prnt_typ_nm_NC(info);
	}

	/**
	 * [DtlTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[bsppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[check_bsppl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_check_bsppl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_cred_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_cred_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_cred_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_cred_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_interim_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_interim_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_bank_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_bank_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_spot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_spot_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cl_day1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cl_day2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cl_day3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cl_day4_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cl_day5_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_setoff_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_setoff_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_setoff_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_setoff_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tax_on_pay_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tax_on_pay_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_tax_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_tax_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_ba_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_ba_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_ba_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_ba_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[batch_pay_schd_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_batch_pay_schd_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_cl_delay_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_cl_delay_days_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_cl_ba_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_cl_ba_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_cl_ba_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_cl_ba_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_addr1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_addr2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_addr3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_addr4_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_tel_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_bsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bsppl_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_bsppl_dpt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bsppl_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_bsppl_psn_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bsppl_psn_title]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_bsppl_psn_title_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_outp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_outp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bfw_bal_disp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_bfw_bal_disp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_adv_pay_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_adv_pay_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_pay_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_pay_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_subttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_subttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_subttl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_subttl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_brk_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_brk_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_brk_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_brk_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_sort_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_sort_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_sort_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_sort_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_can_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_can_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_can_slip_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_can_slip_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_days_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[check_pay_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_check_pay_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Hdr_psppl_cl_day1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Hdr_psppl_cl_day2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Hdr_psppl_cl_day3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Hdr_psppl_cl_day4_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Hdr_psppl_cl_day5_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[bsppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_bsppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_psppl_cl_day1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_psppl_cl_day2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_psppl_cl_day3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_psppl_cl_day4_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_psppl_cl_day5_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[sttl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_sttl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[sttl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_sttl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ap_sttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ap_sttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[rate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_rate_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[crryovr_mons_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_crryovr_mons_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[crryovr_mons_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_crryovr_mons_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_crryovr_mons1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_day1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_crryovr_mons2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_day2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_crryovr_mons3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_day3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_crryovr_mons4_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_day4_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_crryovr_mons5_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_day5_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Hdr]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Hdr_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Hdr]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Hdr_end_dt_NC(MCEventInfo info){
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
	 * [Wrk5Dtl]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[if_proc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_if_proc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[if_proc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_if_proc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[not_onr_prov_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_not_onr_prov_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ext_sys_nm_NC(MCEventInfo info){
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
	 * [HdrAll]パネルの[bsppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bsppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bsppl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bsppl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bsppl_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bsppl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[check_bsppl_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_check_bsppl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ap_cred_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ap_cred_cd_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ap_cred_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ap_cred_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[purc_interim_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_purc_interim_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_bank_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_bank_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_bank_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_bank_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_spot_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_spot_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cl_day1_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cl_day2_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cl_day3_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cl_day4_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cl_day5_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ap_setoff_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ap_setoff_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ap_setoff_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ap_setoff_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[tax_on_pay_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_tax_on_pay_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_tax_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_tax_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_tax_rnd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_tax_rnd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_schd_ba_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_schd_ba_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_schd_ba_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_schd_ba_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[batch_pay_schd_cl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_batch_pay_schd_cl_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_schd_cl_delay_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_schd_cl_delay_days_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_schd_cl_ba_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_schd_cl_ba_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_schd_cl_ba_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_schd_cl_ba_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bsppl_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bsppl_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bsppl_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bsppl_prnt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_zip_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_zip_cd_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_addr1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_addr1_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_addr2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_addr2_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_addr3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_addr3_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_addr4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_addr4_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_tel]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_tel_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bsppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_bsppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bsppl_dpt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_bsppl_dpt_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bsppl_psn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_bsppl_psn_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bsppl_psn_title]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_bsppl_psn_title_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_outp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_outp_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bfw_bal_disp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_bfw_bal_disp_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_adv_pay_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_adv_pay_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_pay_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_pay_flg_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_subttl_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_subttl_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_subttl_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_subttl_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_brk_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_brk_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_brk_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_brk_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_sort_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_sort_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_sort_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_sort_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_can_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_can_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_can_slip_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_can_slip_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[note_days]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_note_days_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[check_pay_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_check_pay_dpt_cd_NC(MCEventInfo info){
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
	 * [HdrAll]パネルの[psppl_prnt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_prnt_typ_NC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_prnt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_prnt_typ_nm_NC(MCEventInfo info){
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
		else if (ne == Wrk3DtlTable) doWrk3Dtl_NE(info);
		else if (ne == Wrk5DtlTable) doWrk5Dtl_NE(info);
		else if (ne == HdrAllTable) doHdrAll_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_bp_cd) doCnd_bp_cd_NE(info);
		else if (ne == Cnd_bp_nm) doCnd_bp_nm_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == Hdr_bp_cd) doHdr_bp_cd_NE(info);
		else if (ne == Hdr_bp_nm) doHdr_bp_nm_NE(info);
		else if (ne == Hdr_bsppl_flg) doHdr_bsppl_flg_NE(info);
		else if (ne == Hdr_psppl_flg) doHdr_psppl_flg_NE(info);
		else if (ne == Hdr_psppl_cd) doHdr_psppl_cd_NE(info);
		else if (ne == Hdr_psppl_nm) doHdr_psppl_nm_NE(info);
		else if (ne == Hdr_bsppl_dpt_cd) doHdr_bsppl_dpt_cd_NE(info);
		else if (ne == Hdr_bsppl_dpt_nm) doHdr_bsppl_dpt_nm_NE(info);
		else if (ne == Hdr_check_bsppl_dpt_cd) doHdr_check_bsppl_dpt_cd_NE(info);
		else if (ne == Hdr_ap_cred_cd) doHdr_ap_cred_cd_NE(info);
		else if (ne == Hdr_ap_cred_nm) doHdr_ap_cred_nm_NE(info);
		else if (ne == Hdr_purc_interim_cl_flg) doHdr_purc_interim_cl_flg_NE(info);
		else if (ne == Hdr_pay_bank_ac_cd) doHdr_pay_bank_ac_cd_NE(info);
		else if (ne == Hdr_pay_bank_ac_nm) doHdr_pay_bank_ac_nm_NE(info);
		else if (ne == Hdr_pay_spot_flg) doHdr_pay_spot_flg_NE(info);
		else if (ne == Hdr_psppl_cl_day1) doHdr_psppl_cl_day1_NE(info);
		else if (ne == Hdr_psppl_cl_day2) doHdr_psppl_cl_day2_NE(info);
		else if (ne == Hdr_psppl_cl_day3) doHdr_psppl_cl_day3_NE(info);
		else if (ne == Hdr_psppl_cl_day4) doHdr_psppl_cl_day4_NE(info);
		else if (ne == Hdr_psppl_cl_day5) doHdr_psppl_cl_day5_NE(info);
		else if (ne == Hdr_ap_setoff_grp_cd) doHdr_ap_setoff_grp_cd_NE(info);
		else if (ne == Hdr_ap_setoff_grp_nm) doHdr_ap_setoff_grp_nm_NE(info);
		else if (ne == Hdr_tax_on_pay_flg) doHdr_tax_on_pay_flg_NE(info);
		else if (ne == Hdr_pay_tax_rnd_typ) doHdr_pay_tax_rnd_typ_NE(info);
		else if (ne == Hdr_pay_tax_rnd_typ_nm) doHdr_pay_tax_rnd_typ_nm_NE(info);
		else if (ne == Hdr_pay_schd_ba_typ) doHdr_pay_schd_ba_typ_NE(info);
		else if (ne == Hdr_pay_schd_ba_typ_nm) doHdr_pay_schd_ba_typ_nm_NE(info);
		else if (ne == Hdr_batch_pay_schd_cl_flg) doHdr_batch_pay_schd_cl_flg_NE(info);
		else if (ne == Hdr_pay_schd_cl_delay_days) doHdr_pay_schd_cl_delay_days_NE(info);
		else if (ne == Hdr_pay_schd_cl_ba_typ) doHdr_pay_schd_cl_ba_typ_NE(info);
		else if (ne == Hdr_pay_schd_cl_ba_typ_nm) doHdr_pay_schd_cl_ba_typ_nm_NE(info);
		else if (ne == Hdr_bsppl_prnt_typ) doHdr_bsppl_prnt_typ_NE(info);
		else if (ne == Hdr_bsppl_prnt_typ_nm) doHdr_bsppl_prnt_typ_nm_NE(info);
		else if (ne == Hdr_pay_ntc_prnt_flg) doHdr_pay_ntc_prnt_flg_NE(info);
		else if (ne == Hdr_pay_ntc_zip_cd) doHdr_pay_ntc_zip_cd_NE(info);
		else if (ne == Hdr_pay_ntc_addr1) doHdr_pay_ntc_addr1_NE(info);
		else if (ne == Hdr_pay_ntc_addr2) doHdr_pay_ntc_addr2_NE(info);
		else if (ne == Hdr_pay_ntc_addr3) doHdr_pay_ntc_addr3_NE(info);
		else if (ne == Hdr_pay_ntc_addr4) doHdr_pay_ntc_addr4_NE(info);
		else if (ne == Hdr_pay_ntc_tel) doHdr_pay_ntc_tel_NE(info);
		else if (ne == Hdr_pay_ntc_bsppl_nm) doHdr_pay_ntc_bsppl_nm_NE(info);
		else if (ne == Hdr_pay_ntc_bsppl_dpt) doHdr_pay_ntc_bsppl_dpt_NE(info);
		else if (ne == Hdr_pay_ntc_bsppl_psn) doHdr_pay_ntc_bsppl_psn_NE(info);
		else if (ne == Hdr_pay_ntc_bsppl_psn_title) doHdr_pay_ntc_bsppl_psn_title_NE(info);
		else if (ne == Hdr_pay_ntc_dtl_outp_flg) doHdr_pay_ntc_dtl_outp_flg_NE(info);
		else if (ne == Hdr_pay_ntc_bfw_bal_disp_flg) doHdr_pay_ntc_bfw_bal_disp_flg_NE(info);
		else if (ne == Hdr_pay_ntc_adv_pay_flg) doHdr_pay_ntc_adv_pay_flg_NE(info);
		else if (ne == Hdr_pay_ntc_dtl_pay_flg) doHdr_pay_ntc_dtl_pay_flg_NE(info);
		else if (ne == Hdr_pay_ntc_dtl_subttl_typ) doHdr_pay_ntc_dtl_subttl_typ_NE(info);
		else if (ne == Hdr_pay_ntc_dtl_subttl_typ_nm) doHdr_pay_ntc_dtl_subttl_typ_nm_NE(info);
		else if (ne == Hdr_pay_ntc_dtl_brk_typ) doHdr_pay_ntc_dtl_brk_typ_NE(info);
		else if (ne == Hdr_pay_ntc_dtl_brk_typ_nm) doHdr_pay_ntc_dtl_brk_typ_nm_NE(info);
		else if (ne == Hdr_pay_ntc_dtl_sort_typ) doHdr_pay_ntc_dtl_sort_typ_NE(info);
		else if (ne == Hdr_pay_ntc_dtl_sort_typ_nm) doHdr_pay_ntc_dtl_sort_typ_nm_NE(info);
		else if (ne == Hdr_pay_ntc_can_slip_typ) doHdr_pay_ntc_can_slip_typ_NE(info);
		else if (ne == Hdr_pay_ntc_can_slip_typ_nm) doHdr_pay_ntc_can_slip_typ_nm_NE(info);
		else if (ne == Hdr_psppl_rmrks) doHdr_psppl_rmrks_NE(info);
		else if (ne == Hdr_note_days) doHdr_note_days_NE(info);
		else if (ne == Hdr_pay_dpt_cd) doHdr_pay_dpt_cd_NE(info);
		else if (ne == Hdr_pay_dpt_nm) doHdr_pay_dpt_nm_NE(info);
		else if (ne == Hdr_check_pay_dpt_cd) doHdr_check_pay_dpt_cd_NE(info);
		else if (ne == Hdr_psppl_prnt_typ) doHdr_psppl_prnt_typ_NE(info);
		else if (ne == Hdr_psppl_prnt_typ_nm) doHdr_psppl_prnt_typ_nm_NE(info);
		else if (ne == Wrk3Hdr_psppl_cl_day1) doWrk3Hdr_psppl_cl_day1_NE(info);
		else if (ne == Wrk3Hdr_psppl_cl_day2) doWrk3Hdr_psppl_cl_day2_NE(info);
		else if (ne == Wrk3Hdr_psppl_cl_day3) doWrk3Hdr_psppl_cl_day3_NE(info);
		else if (ne == Wrk3Hdr_psppl_cl_day4) doWrk3Hdr_psppl_cl_day4_NE(info);
		else if (ne == Wrk3Hdr_psppl_cl_day5) doWrk3Hdr_psppl_cl_day5_NE(info);
		else if (ne == columnWrk3Dtl_check) doWrk3Dtl_check_NE(info);
		else if (ne == columnWrk3Dtl_del_flg) doWrk3Dtl_del_flg_NE(info);
		else if (ne == columnWrk3Dtl_bsppl_cd) doWrk3Dtl_bsppl_cd_NE(info);
		else if (ne == columnWrk3Dtl_psppl_cl_day1) doWrk3Dtl_psppl_cl_day1_NE(info);
		else if (ne == columnWrk3Dtl_psppl_cl_day2) doWrk3Dtl_psppl_cl_day2_NE(info);
		else if (ne == columnWrk3Dtl_psppl_cl_day3) doWrk3Dtl_psppl_cl_day3_NE(info);
		else if (ne == columnWrk3Dtl_psppl_cl_day4) doWrk3Dtl_psppl_cl_day4_NE(info);
		else if (ne == columnWrk3Dtl_psppl_cl_day5) doWrk3Dtl_psppl_cl_day5_NE(info);
		else if (ne == columnWrk3Dtl_cur_cd) doWrk3Dtl_cur_cd_NE(info);
		else if (ne == columnWrk3Dtl_cur_nm) doWrk3Dtl_cur_nm_NE(info);
		else if (ne == columnWrk3Dtl_amt_dec_place) doWrk3Dtl_amt_dec_place_NE(info);
		else if (ne == columnWrk3Dtl_sttl_cd) doWrk3Dtl_sttl_cd_NE(info);
		else if (ne == columnWrk3Dtl_sttl_nm) doWrk3Dtl_sttl_nm_NE(info);
		else if (ne == columnWrk3Dtl_ap_sttl_typ) doWrk3Dtl_ap_sttl_typ_NE(info);
		else if (ne == columnWrk3Dtl_wg_cd) doWrk3Dtl_wg_cd_NE(info);
		else if (ne == columnWrk3Dtl_wg_nm) doWrk3Dtl_wg_nm_NE(info);
		else if (ne == columnWrk3Dtl_rate) doWrk3Dtl_rate_NE(info);
		else if (ne == columnWrk3Dtl_crryovr_mons_typ) doWrk3Dtl_crryovr_mons_typ_NE(info);
		else if (ne == columnWrk3Dtl_crryovr_mons_typ_nm) doWrk3Dtl_crryovr_mons_typ_nm_NE(info);
		else if (ne == columnWrk3Dtl_pay_crryovr_mons1) doWrk3Dtl_pay_crryovr_mons1_NE(info);
		else if (ne == columnWrk3Dtl_pay_day1) doWrk3Dtl_pay_day1_NE(info);
		else if (ne == columnWrk3Dtl_pay_crryovr_mons2) doWrk3Dtl_pay_crryovr_mons2_NE(info);
		else if (ne == columnWrk3Dtl_pay_day2) doWrk3Dtl_pay_day2_NE(info);
		else if (ne == columnWrk3Dtl_pay_crryovr_mons3) doWrk3Dtl_pay_crryovr_mons3_NE(info);
		else if (ne == columnWrk3Dtl_pay_day3) doWrk3Dtl_pay_day3_NE(info);
		else if (ne == columnWrk3Dtl_pay_crryovr_mons4) doWrk3Dtl_pay_crryovr_mons4_NE(info);
		else if (ne == columnWrk3Dtl_pay_day4) doWrk3Dtl_pay_day4_NE(info);
		else if (ne == columnWrk3Dtl_pay_crryovr_mons5) doWrk3Dtl_pay_crryovr_mons5_NE(info);
		else if (ne == columnWrk3Dtl_pay_day5) doWrk3Dtl_pay_day5_NE(info);
		else if (ne == columnWrk3Dtl_memo1) doWrk3Dtl_memo1_NE(info);
		else if (ne == columnWrk3Dtl_memo2) doWrk3Dtl_memo2_NE(info);
		else if (ne == columnWrk3Dtl_memo3) doWrk3Dtl_memo3_NE(info);
		else if (ne == columnWrk3Dtl_ins_usr_id) doWrk3Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk3Dtl_ins_usr_nm) doWrk3Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk3Dtl_ins_ts) doWrk3Dtl_ins_ts_NE(info);
		else if (ne == columnWrk3Dtl_ins_func_id) doWrk3Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk3Dtl_ins_func_nm) doWrk3Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk3Dtl_upd_cntr) doWrk3Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk3Dtl_upd_usr_id) doWrk3Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk3Dtl_upd_usr_nm) doWrk3Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk3Dtl_upd_ts) doWrk3Dtl_upd_ts_NE(info);
		else if (ne == columnWrk3Dtl_upd_func_id) doWrk3Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk3Dtl_upd_func_nm) doWrk3Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk3Dtl_upd_srv_req_no) doWrk3Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk3Dtl_del_usr_id) doWrk3Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk3Dtl_del_usr_nm) doWrk3Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk3Dtl_del_ts) doWrk3Dtl_del_ts_NE(info);
		else if (ne == Wrk5Hdr_st_dt) doWrk5Hdr_st_dt_NE(info);
		else if (ne == Wrk5Hdr_end_dt) doWrk5Hdr_end_dt_NE(info);
		else if (ne == columnWrk5Dtl_check) doWrk5Dtl_check_NE(info);
		else if (ne == columnWrk5Dtl_del_flg) doWrk5Dtl_del_flg_NE(info);
		else if (ne == columnWrk5Dtl_bp_cd) doWrk5Dtl_bp_cd_NE(info);
		else if (ne == columnWrk5Dtl_if_proc_typ) doWrk5Dtl_if_proc_typ_NE(info);
		else if (ne == columnWrk5Dtl_if_proc_typ_nm) doWrk5Dtl_if_proc_typ_nm_NE(info);
		else if (ne == columnWrk5Dtl_not_onr_prov_flg) doWrk5Dtl_not_onr_prov_flg_NE(info);
		else if (ne == columnWrk5Dtl_ext_sys_cd) doWrk5Dtl_ext_sys_cd_NE(info);
		else if (ne == columnWrk5Dtl_ext_sys_nm) doWrk5Dtl_ext_sys_nm_NE(info);
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
		else if (ne == columnHdrAll_check) doHdrAll_check_NE(info);
		else if (ne == columnHdrAll_bp_cd) doHdrAll_bp_cd_NE(info);
		else if (ne == columnHdrAll_bp_nm) doHdrAll_bp_nm_NE(info);
		else if (ne == columnHdrAll_bsppl_flg) doHdrAll_bsppl_flg_NE(info);
		else if (ne == columnHdrAll_psppl_flg) doHdrAll_psppl_flg_NE(info);
		else if (ne == columnHdrAll_psppl_cd) doHdrAll_psppl_cd_NE(info);
		else if (ne == columnHdrAll_psppl_nm) doHdrAll_psppl_nm_NE(info);
		else if (ne == columnHdrAll_bsppl_dpt_cd) doHdrAll_bsppl_dpt_cd_NE(info);
		else if (ne == columnHdrAll_bsppl_dpt_nm) doHdrAll_bsppl_dpt_nm_NE(info);
		else if (ne == columnHdrAll_check_bsppl_dpt_cd) doHdrAll_check_bsppl_dpt_cd_NE(info);
		else if (ne == columnHdrAll_ap_cred_cd) doHdrAll_ap_cred_cd_NE(info);
		else if (ne == columnHdrAll_ap_cred_nm) doHdrAll_ap_cred_nm_NE(info);
		else if (ne == columnHdrAll_purc_interim_cl_flg) doHdrAll_purc_interim_cl_flg_NE(info);
		else if (ne == columnHdrAll_pay_bank_ac_cd) doHdrAll_pay_bank_ac_cd_NE(info);
		else if (ne == columnHdrAll_pay_bank_ac_nm) doHdrAll_pay_bank_ac_nm_NE(info);
		else if (ne == columnHdrAll_pay_spot_flg) doHdrAll_pay_spot_flg_NE(info);
		else if (ne == columnHdrAll_psppl_cl_day1) doHdrAll_psppl_cl_day1_NE(info);
		else if (ne == columnHdrAll_psppl_cl_day2) doHdrAll_psppl_cl_day2_NE(info);
		else if (ne == columnHdrAll_psppl_cl_day3) doHdrAll_psppl_cl_day3_NE(info);
		else if (ne == columnHdrAll_psppl_cl_day4) doHdrAll_psppl_cl_day4_NE(info);
		else if (ne == columnHdrAll_psppl_cl_day5) doHdrAll_psppl_cl_day5_NE(info);
		else if (ne == columnHdrAll_ap_setoff_grp_cd) doHdrAll_ap_setoff_grp_cd_NE(info);
		else if (ne == columnHdrAll_ap_setoff_grp_nm) doHdrAll_ap_setoff_grp_nm_NE(info);
		else if (ne == columnHdrAll_tax_on_pay_flg) doHdrAll_tax_on_pay_flg_NE(info);
		else if (ne == columnHdrAll_pay_tax_rnd_typ) doHdrAll_pay_tax_rnd_typ_NE(info);
		else if (ne == columnHdrAll_pay_tax_rnd_typ_nm) doHdrAll_pay_tax_rnd_typ_nm_NE(info);
		else if (ne == columnHdrAll_pay_schd_ba_typ) doHdrAll_pay_schd_ba_typ_NE(info);
		else if (ne == columnHdrAll_pay_schd_ba_typ_nm) doHdrAll_pay_schd_ba_typ_nm_NE(info);
		else if (ne == columnHdrAll_batch_pay_schd_cl_flg) doHdrAll_batch_pay_schd_cl_flg_NE(info);
		else if (ne == columnHdrAll_pay_schd_cl_delay_days) doHdrAll_pay_schd_cl_delay_days_NE(info);
		else if (ne == columnHdrAll_pay_schd_cl_ba_typ) doHdrAll_pay_schd_cl_ba_typ_NE(info);
		else if (ne == columnHdrAll_pay_schd_cl_ba_typ_nm) doHdrAll_pay_schd_cl_ba_typ_nm_NE(info);
		else if (ne == columnHdrAll_bsppl_prnt_typ) doHdrAll_bsppl_prnt_typ_NE(info);
		else if (ne == columnHdrAll_bsppl_prnt_typ_nm) doHdrAll_bsppl_prnt_typ_nm_NE(info);
		else if (ne == columnHdrAll_pay_ntc_prnt_flg) doHdrAll_pay_ntc_prnt_flg_NE(info);
		else if (ne == columnHdrAll_pay_ntc_zip_cd) doHdrAll_pay_ntc_zip_cd_NE(info);
		else if (ne == columnHdrAll_pay_ntc_addr1) doHdrAll_pay_ntc_addr1_NE(info);
		else if (ne == columnHdrAll_pay_ntc_addr2) doHdrAll_pay_ntc_addr2_NE(info);
		else if (ne == columnHdrAll_pay_ntc_addr3) doHdrAll_pay_ntc_addr3_NE(info);
		else if (ne == columnHdrAll_pay_ntc_addr4) doHdrAll_pay_ntc_addr4_NE(info);
		else if (ne == columnHdrAll_pay_ntc_tel) doHdrAll_pay_ntc_tel_NE(info);
		else if (ne == columnHdrAll_pay_ntc_bsppl_nm) doHdrAll_pay_ntc_bsppl_nm_NE(info);
		else if (ne == columnHdrAll_pay_ntc_bsppl_dpt) doHdrAll_pay_ntc_bsppl_dpt_NE(info);
		else if (ne == columnHdrAll_pay_ntc_bsppl_psn) doHdrAll_pay_ntc_bsppl_psn_NE(info);
		else if (ne == columnHdrAll_pay_ntc_bsppl_psn_title) doHdrAll_pay_ntc_bsppl_psn_title_NE(info);
		else if (ne == columnHdrAll_pay_ntc_dtl_outp_flg) doHdrAll_pay_ntc_dtl_outp_flg_NE(info);
		else if (ne == columnHdrAll_pay_ntc_bfw_bal_disp_flg) doHdrAll_pay_ntc_bfw_bal_disp_flg_NE(info);
		else if (ne == columnHdrAll_pay_ntc_adv_pay_flg) doHdrAll_pay_ntc_adv_pay_flg_NE(info);
		else if (ne == columnHdrAll_pay_ntc_dtl_pay_flg) doHdrAll_pay_ntc_dtl_pay_flg_NE(info);
		else if (ne == columnHdrAll_pay_ntc_dtl_subttl_typ) doHdrAll_pay_ntc_dtl_subttl_typ_NE(info);
		else if (ne == columnHdrAll_pay_ntc_dtl_subttl_typ_nm) doHdrAll_pay_ntc_dtl_subttl_typ_nm_NE(info);
		else if (ne == columnHdrAll_pay_ntc_dtl_brk_typ) doHdrAll_pay_ntc_dtl_brk_typ_NE(info);
		else if (ne == columnHdrAll_pay_ntc_dtl_brk_typ_nm) doHdrAll_pay_ntc_dtl_brk_typ_nm_NE(info);
		else if (ne == columnHdrAll_pay_ntc_dtl_sort_typ) doHdrAll_pay_ntc_dtl_sort_typ_NE(info);
		else if (ne == columnHdrAll_pay_ntc_dtl_sort_typ_nm) doHdrAll_pay_ntc_dtl_sort_typ_nm_NE(info);
		else if (ne == columnHdrAll_pay_ntc_can_slip_typ) doHdrAll_pay_ntc_can_slip_typ_NE(info);
		else if (ne == columnHdrAll_pay_ntc_can_slip_typ_nm) doHdrAll_pay_ntc_can_slip_typ_nm_NE(info);
		else if (ne == columnHdrAll_psppl_rmrks) doHdrAll_psppl_rmrks_NE(info);
		else if (ne == columnHdrAll_note_days) doHdrAll_note_days_NE(info);
		else if (ne == columnHdrAll_pay_dpt_cd) doHdrAll_pay_dpt_cd_NE(info);
		else if (ne == columnHdrAll_pay_dpt_nm) doHdrAll_pay_dpt_nm_NE(info);
		else if (ne == columnHdrAll_check_pay_dpt_cd) doHdrAll_check_pay_dpt_cd_NE(info);
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
		else if (ne == columnHdrAll_psppl_prnt_typ) doHdrAll_psppl_prnt_typ_NE(info);
		else if (ne == columnHdrAll_psppl_prnt_typ_nm) doHdrAll_psppl_prnt_typ_nm_NE(info);
	}

	/**
	 * [DtlTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[bsppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[check_bsppl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_check_bsppl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_cred_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_cred_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_cred_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_cred_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_interim_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_interim_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_bank_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_bank_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_spot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_spot_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cl_day1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cl_day2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cl_day3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cl_day4_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cl_day5_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_setoff_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_setoff_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_setoff_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_setoff_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tax_on_pay_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tax_on_pay_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_tax_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_tax_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_ba_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_ba_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_ba_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_ba_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[batch_pay_schd_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_batch_pay_schd_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_cl_delay_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_cl_delay_days_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_cl_ba_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_cl_ba_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_cl_ba_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_cl_ba_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_addr1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_addr2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_addr3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_addr4_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_tel_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_bsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bsppl_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_bsppl_dpt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bsppl_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_bsppl_psn_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bsppl_psn_title]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_bsppl_psn_title_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_outp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_outp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bfw_bal_disp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_bfw_bal_disp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_adv_pay_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_adv_pay_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_pay_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_pay_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_subttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_subttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_subttl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_subttl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_brk_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_brk_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_brk_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_brk_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_sort_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_sort_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_sort_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_sort_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_can_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_can_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_can_slip_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_can_slip_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_days_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[check_pay_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_check_pay_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Hdr_psppl_cl_day1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Hdr_psppl_cl_day2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Hdr_psppl_cl_day3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Hdr_psppl_cl_day4_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Hdr_psppl_cl_day5_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[bsppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_bsppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_psppl_cl_day1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_psppl_cl_day2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_psppl_cl_day3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_psppl_cl_day4_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_psppl_cl_day5_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[sttl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_sttl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[sttl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_sttl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ap_sttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ap_sttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[rate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_rate_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[crryovr_mons_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_crryovr_mons_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[crryovr_mons_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_crryovr_mons_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_crryovr_mons1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_day1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_crryovr_mons2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_day2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_crryovr_mons3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_day3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_crryovr_mons4_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_day4_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_crryovr_mons5_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_day5_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Hdr]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Hdr_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Hdr]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Hdr_end_dt_NE(MCEventInfo info){
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
	 * [Wrk5Dtl]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[if_proc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_if_proc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[if_proc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_if_proc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[not_onr_prov_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_not_onr_prov_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ext_sys_nm_NE(MCEventInfo info){
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
	 * [HdrAll]パネルの[bsppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bsppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bsppl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bsppl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bsppl_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bsppl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[check_bsppl_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_check_bsppl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ap_cred_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ap_cred_cd_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ap_cred_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ap_cred_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[purc_interim_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_purc_interim_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_bank_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_bank_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_bank_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_bank_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_spot_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_spot_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cl_day1_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cl_day2_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cl_day3_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cl_day4_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cl_day5_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ap_setoff_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ap_setoff_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ap_setoff_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ap_setoff_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[tax_on_pay_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_tax_on_pay_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_tax_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_tax_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_tax_rnd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_tax_rnd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_schd_ba_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_schd_ba_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_schd_ba_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_schd_ba_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[batch_pay_schd_cl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_batch_pay_schd_cl_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_schd_cl_delay_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_schd_cl_delay_days_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_schd_cl_ba_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_schd_cl_ba_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_schd_cl_ba_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_schd_cl_ba_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bsppl_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bsppl_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bsppl_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bsppl_prnt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_zip_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_zip_cd_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_addr1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_addr1_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_addr2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_addr2_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_addr3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_addr3_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_addr4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_addr4_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_tel]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_tel_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bsppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_bsppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bsppl_dpt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_bsppl_dpt_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bsppl_psn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_bsppl_psn_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bsppl_psn_title]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_bsppl_psn_title_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_outp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_outp_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bfw_bal_disp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_bfw_bal_disp_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_adv_pay_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_adv_pay_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_pay_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_pay_flg_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_subttl_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_subttl_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_subttl_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_subttl_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_brk_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_brk_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_brk_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_brk_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_sort_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_sort_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_sort_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_sort_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_can_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_can_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_can_slip_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_can_slip_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[note_days]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_note_days_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[check_pay_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_check_pay_dpt_cd_NE(MCEventInfo info){
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
	 * [HdrAll]パネルの[psppl_prnt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_prnt_typ_NE(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_prnt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_prnt_typ_nm_NE(MCEventInfo info){
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
		else if (nx == Wrk3DtlTable) doWrk3Dtl_NX(info);
		else if (nx == Wrk5DtlTable) doWrk5Dtl_NX(info);
		else if (nx == HdrAllTable) doHdrAll_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_bp_cd) doCnd_bp_cd_NX(info);
		else if (nx == Cnd_bp_nm) doCnd_bp_nm_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == Hdr_bp_cd) doHdr_bp_cd_NX(info);
		else if (nx == Hdr_bp_nm) doHdr_bp_nm_NX(info);
		else if (nx == Hdr_bsppl_flg) doHdr_bsppl_flg_NX(info);
		else if (nx == Hdr_psppl_flg) doHdr_psppl_flg_NX(info);
		else if (nx == Hdr_psppl_cd) doHdr_psppl_cd_NX(info);
		else if (nx == Hdr_psppl_nm) doHdr_psppl_nm_NX(info);
		else if (nx == Hdr_bsppl_dpt_cd) doHdr_bsppl_dpt_cd_NX(info);
		else if (nx == Hdr_bsppl_dpt_nm) doHdr_bsppl_dpt_nm_NX(info);
		else if (nx == Hdr_check_bsppl_dpt_cd) doHdr_check_bsppl_dpt_cd_NX(info);
		else if (nx == Hdr_ap_cred_cd) doHdr_ap_cred_cd_NX(info);
		else if (nx == Hdr_ap_cred_nm) doHdr_ap_cred_nm_NX(info);
		else if (nx == Hdr_purc_interim_cl_flg) doHdr_purc_interim_cl_flg_NX(info);
		else if (nx == Hdr_pay_bank_ac_cd) doHdr_pay_bank_ac_cd_NX(info);
		else if (nx == Hdr_pay_bank_ac_nm) doHdr_pay_bank_ac_nm_NX(info);
		else if (nx == Hdr_pay_spot_flg) doHdr_pay_spot_flg_NX(info);
		else if (nx == Hdr_psppl_cl_day1) doHdr_psppl_cl_day1_NX(info);
		else if (nx == Hdr_psppl_cl_day2) doHdr_psppl_cl_day2_NX(info);
		else if (nx == Hdr_psppl_cl_day3) doHdr_psppl_cl_day3_NX(info);
		else if (nx == Hdr_psppl_cl_day4) doHdr_psppl_cl_day4_NX(info);
		else if (nx == Hdr_psppl_cl_day5) doHdr_psppl_cl_day5_NX(info);
		else if (nx == Hdr_ap_setoff_grp_cd) doHdr_ap_setoff_grp_cd_NX(info);
		else if (nx == Hdr_ap_setoff_grp_nm) doHdr_ap_setoff_grp_nm_NX(info);
		else if (nx == Hdr_tax_on_pay_flg) doHdr_tax_on_pay_flg_NX(info);
		else if (nx == Hdr_pay_tax_rnd_typ) doHdr_pay_tax_rnd_typ_NX(info);
		else if (nx == Hdr_pay_tax_rnd_typ_nm) doHdr_pay_tax_rnd_typ_nm_NX(info);
		else if (nx == Hdr_pay_schd_ba_typ) doHdr_pay_schd_ba_typ_NX(info);
		else if (nx == Hdr_pay_schd_ba_typ_nm) doHdr_pay_schd_ba_typ_nm_NX(info);
		else if (nx == Hdr_batch_pay_schd_cl_flg) doHdr_batch_pay_schd_cl_flg_NX(info);
		else if (nx == Hdr_pay_schd_cl_delay_days) doHdr_pay_schd_cl_delay_days_NX(info);
		else if (nx == Hdr_pay_schd_cl_ba_typ) doHdr_pay_schd_cl_ba_typ_NX(info);
		else if (nx == Hdr_pay_schd_cl_ba_typ_nm) doHdr_pay_schd_cl_ba_typ_nm_NX(info);
		else if (nx == Hdr_bsppl_prnt_typ) doHdr_bsppl_prnt_typ_NX(info);
		else if (nx == Hdr_bsppl_prnt_typ_nm) doHdr_bsppl_prnt_typ_nm_NX(info);
		else if (nx == Hdr_pay_ntc_prnt_flg) doHdr_pay_ntc_prnt_flg_NX(info);
		else if (nx == Hdr_pay_ntc_zip_cd) doHdr_pay_ntc_zip_cd_NX(info);
		else if (nx == Hdr_pay_ntc_addr1) doHdr_pay_ntc_addr1_NX(info);
		else if (nx == Hdr_pay_ntc_addr2) doHdr_pay_ntc_addr2_NX(info);
		else if (nx == Hdr_pay_ntc_addr3) doHdr_pay_ntc_addr3_NX(info);
		else if (nx == Hdr_pay_ntc_addr4) doHdr_pay_ntc_addr4_NX(info);
		else if (nx == Hdr_pay_ntc_tel) doHdr_pay_ntc_tel_NX(info);
		else if (nx == Hdr_pay_ntc_bsppl_nm) doHdr_pay_ntc_bsppl_nm_NX(info);
		else if (nx == Hdr_pay_ntc_bsppl_dpt) doHdr_pay_ntc_bsppl_dpt_NX(info);
		else if (nx == Hdr_pay_ntc_bsppl_psn) doHdr_pay_ntc_bsppl_psn_NX(info);
		else if (nx == Hdr_pay_ntc_bsppl_psn_title) doHdr_pay_ntc_bsppl_psn_title_NX(info);
		else if (nx == Hdr_pay_ntc_dtl_outp_flg) doHdr_pay_ntc_dtl_outp_flg_NX(info);
		else if (nx == Hdr_pay_ntc_bfw_bal_disp_flg) doHdr_pay_ntc_bfw_bal_disp_flg_NX(info);
		else if (nx == Hdr_pay_ntc_adv_pay_flg) doHdr_pay_ntc_adv_pay_flg_NX(info);
		else if (nx == Hdr_pay_ntc_dtl_pay_flg) doHdr_pay_ntc_dtl_pay_flg_NX(info);
		else if (nx == Hdr_pay_ntc_dtl_subttl_typ) doHdr_pay_ntc_dtl_subttl_typ_NX(info);
		else if (nx == Hdr_pay_ntc_dtl_subttl_typ_nm) doHdr_pay_ntc_dtl_subttl_typ_nm_NX(info);
		else if (nx == Hdr_pay_ntc_dtl_brk_typ) doHdr_pay_ntc_dtl_brk_typ_NX(info);
		else if (nx == Hdr_pay_ntc_dtl_brk_typ_nm) doHdr_pay_ntc_dtl_brk_typ_nm_NX(info);
		else if (nx == Hdr_pay_ntc_dtl_sort_typ) doHdr_pay_ntc_dtl_sort_typ_NX(info);
		else if (nx == Hdr_pay_ntc_dtl_sort_typ_nm) doHdr_pay_ntc_dtl_sort_typ_nm_NX(info);
		else if (nx == Hdr_pay_ntc_can_slip_typ) doHdr_pay_ntc_can_slip_typ_NX(info);
		else if (nx == Hdr_pay_ntc_can_slip_typ_nm) doHdr_pay_ntc_can_slip_typ_nm_NX(info);
		else if (nx == Hdr_psppl_rmrks) doHdr_psppl_rmrks_NX(info);
		else if (nx == Hdr_note_days) doHdr_note_days_NX(info);
		else if (nx == Hdr_pay_dpt_cd) doHdr_pay_dpt_cd_NX(info);
		else if (nx == Hdr_pay_dpt_nm) doHdr_pay_dpt_nm_NX(info);
		else if (nx == Hdr_check_pay_dpt_cd) doHdr_check_pay_dpt_cd_NX(info);
		else if (nx == Hdr_psppl_prnt_typ) doHdr_psppl_prnt_typ_NX(info);
		else if (nx == Hdr_psppl_prnt_typ_nm) doHdr_psppl_prnt_typ_nm_NX(info);
		else if (nx == Wrk3Hdr_psppl_cl_day1) doWrk3Hdr_psppl_cl_day1_NX(info);
		else if (nx == Wrk3Hdr_psppl_cl_day2) doWrk3Hdr_psppl_cl_day2_NX(info);
		else if (nx == Wrk3Hdr_psppl_cl_day3) doWrk3Hdr_psppl_cl_day3_NX(info);
		else if (nx == Wrk3Hdr_psppl_cl_day4) doWrk3Hdr_psppl_cl_day4_NX(info);
		else if (nx == Wrk3Hdr_psppl_cl_day5) doWrk3Hdr_psppl_cl_day5_NX(info);
		else if (nx == columnWrk3Dtl_check) doWrk3Dtl_check_NX(info);
		else if (nx == columnWrk3Dtl_del_flg) doWrk3Dtl_del_flg_NX(info);
		else if (nx == columnWrk3Dtl_bsppl_cd) doWrk3Dtl_bsppl_cd_NX(info);
		else if (nx == columnWrk3Dtl_psppl_cl_day1) doWrk3Dtl_psppl_cl_day1_NX(info);
		else if (nx == columnWrk3Dtl_psppl_cl_day2) doWrk3Dtl_psppl_cl_day2_NX(info);
		else if (nx == columnWrk3Dtl_psppl_cl_day3) doWrk3Dtl_psppl_cl_day3_NX(info);
		else if (nx == columnWrk3Dtl_psppl_cl_day4) doWrk3Dtl_psppl_cl_day4_NX(info);
		else if (nx == columnWrk3Dtl_psppl_cl_day5) doWrk3Dtl_psppl_cl_day5_NX(info);
		else if (nx == columnWrk3Dtl_cur_cd) doWrk3Dtl_cur_cd_NX(info);
		else if (nx == columnWrk3Dtl_cur_nm) doWrk3Dtl_cur_nm_NX(info);
		else if (nx == columnWrk3Dtl_amt_dec_place) doWrk3Dtl_amt_dec_place_NX(info);
		else if (nx == columnWrk3Dtl_sttl_cd) doWrk3Dtl_sttl_cd_NX(info);
		else if (nx == columnWrk3Dtl_sttl_nm) doWrk3Dtl_sttl_nm_NX(info);
		else if (nx == columnWrk3Dtl_ap_sttl_typ) doWrk3Dtl_ap_sttl_typ_NX(info);
		else if (nx == columnWrk3Dtl_wg_cd) doWrk3Dtl_wg_cd_NX(info);
		else if (nx == columnWrk3Dtl_wg_nm) doWrk3Dtl_wg_nm_NX(info);
		else if (nx == columnWrk3Dtl_rate) doWrk3Dtl_rate_NX(info);
		else if (nx == columnWrk3Dtl_crryovr_mons_typ) doWrk3Dtl_crryovr_mons_typ_NX(info);
		else if (nx == columnWrk3Dtl_crryovr_mons_typ_nm) doWrk3Dtl_crryovr_mons_typ_nm_NX(info);
		else if (nx == columnWrk3Dtl_pay_crryovr_mons1) doWrk3Dtl_pay_crryovr_mons1_NX(info);
		else if (nx == columnWrk3Dtl_pay_day1) doWrk3Dtl_pay_day1_NX(info);
		else if (nx == columnWrk3Dtl_pay_crryovr_mons2) doWrk3Dtl_pay_crryovr_mons2_NX(info);
		else if (nx == columnWrk3Dtl_pay_day2) doWrk3Dtl_pay_day2_NX(info);
		else if (nx == columnWrk3Dtl_pay_crryovr_mons3) doWrk3Dtl_pay_crryovr_mons3_NX(info);
		else if (nx == columnWrk3Dtl_pay_day3) doWrk3Dtl_pay_day3_NX(info);
		else if (nx == columnWrk3Dtl_pay_crryovr_mons4) doWrk3Dtl_pay_crryovr_mons4_NX(info);
		else if (nx == columnWrk3Dtl_pay_day4) doWrk3Dtl_pay_day4_NX(info);
		else if (nx == columnWrk3Dtl_pay_crryovr_mons5) doWrk3Dtl_pay_crryovr_mons5_NX(info);
		else if (nx == columnWrk3Dtl_pay_day5) doWrk3Dtl_pay_day5_NX(info);
		else if (nx == columnWrk3Dtl_memo1) doWrk3Dtl_memo1_NX(info);
		else if (nx == columnWrk3Dtl_memo2) doWrk3Dtl_memo2_NX(info);
		else if (nx == columnWrk3Dtl_memo3) doWrk3Dtl_memo3_NX(info);
		else if (nx == columnWrk3Dtl_ins_usr_id) doWrk3Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk3Dtl_ins_usr_nm) doWrk3Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk3Dtl_ins_ts) doWrk3Dtl_ins_ts_NX(info);
		else if (nx == columnWrk3Dtl_ins_func_id) doWrk3Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk3Dtl_ins_func_nm) doWrk3Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk3Dtl_upd_cntr) doWrk3Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk3Dtl_upd_usr_id) doWrk3Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk3Dtl_upd_usr_nm) doWrk3Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk3Dtl_upd_ts) doWrk3Dtl_upd_ts_NX(info);
		else if (nx == columnWrk3Dtl_upd_func_id) doWrk3Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk3Dtl_upd_func_nm) doWrk3Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk3Dtl_upd_srv_req_no) doWrk3Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk3Dtl_del_usr_id) doWrk3Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk3Dtl_del_usr_nm) doWrk3Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk3Dtl_del_ts) doWrk3Dtl_del_ts_NX(info);
		else if (nx == Wrk5Hdr_st_dt) doWrk5Hdr_st_dt_NX(info);
		else if (nx == Wrk5Hdr_end_dt) doWrk5Hdr_end_dt_NX(info);
		else if (nx == columnWrk5Dtl_check) doWrk5Dtl_check_NX(info);
		else if (nx == columnWrk5Dtl_del_flg) doWrk5Dtl_del_flg_NX(info);
		else if (nx == columnWrk5Dtl_bp_cd) doWrk5Dtl_bp_cd_NX(info);
		else if (nx == columnWrk5Dtl_if_proc_typ) doWrk5Dtl_if_proc_typ_NX(info);
		else if (nx == columnWrk5Dtl_if_proc_typ_nm) doWrk5Dtl_if_proc_typ_nm_NX(info);
		else if (nx == columnWrk5Dtl_not_onr_prov_flg) doWrk5Dtl_not_onr_prov_flg_NX(info);
		else if (nx == columnWrk5Dtl_ext_sys_cd) doWrk5Dtl_ext_sys_cd_NX(info);
		else if (nx == columnWrk5Dtl_ext_sys_nm) doWrk5Dtl_ext_sys_nm_NX(info);
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
		else if (nx == columnHdrAll_check) doHdrAll_check_NX(info);
		else if (nx == columnHdrAll_bp_cd) doHdrAll_bp_cd_NX(info);
		else if (nx == columnHdrAll_bp_nm) doHdrAll_bp_nm_NX(info);
		else if (nx == columnHdrAll_bsppl_flg) doHdrAll_bsppl_flg_NX(info);
		else if (nx == columnHdrAll_psppl_flg) doHdrAll_psppl_flg_NX(info);
		else if (nx == columnHdrAll_psppl_cd) doHdrAll_psppl_cd_NX(info);
		else if (nx == columnHdrAll_psppl_nm) doHdrAll_psppl_nm_NX(info);
		else if (nx == columnHdrAll_bsppl_dpt_cd) doHdrAll_bsppl_dpt_cd_NX(info);
		else if (nx == columnHdrAll_bsppl_dpt_nm) doHdrAll_bsppl_dpt_nm_NX(info);
		else if (nx == columnHdrAll_check_bsppl_dpt_cd) doHdrAll_check_bsppl_dpt_cd_NX(info);
		else if (nx == columnHdrAll_ap_cred_cd) doHdrAll_ap_cred_cd_NX(info);
		else if (nx == columnHdrAll_ap_cred_nm) doHdrAll_ap_cred_nm_NX(info);
		else if (nx == columnHdrAll_purc_interim_cl_flg) doHdrAll_purc_interim_cl_flg_NX(info);
		else if (nx == columnHdrAll_pay_bank_ac_cd) doHdrAll_pay_bank_ac_cd_NX(info);
		else if (nx == columnHdrAll_pay_bank_ac_nm) doHdrAll_pay_bank_ac_nm_NX(info);
		else if (nx == columnHdrAll_pay_spot_flg) doHdrAll_pay_spot_flg_NX(info);
		else if (nx == columnHdrAll_psppl_cl_day1) doHdrAll_psppl_cl_day1_NX(info);
		else if (nx == columnHdrAll_psppl_cl_day2) doHdrAll_psppl_cl_day2_NX(info);
		else if (nx == columnHdrAll_psppl_cl_day3) doHdrAll_psppl_cl_day3_NX(info);
		else if (nx == columnHdrAll_psppl_cl_day4) doHdrAll_psppl_cl_day4_NX(info);
		else if (nx == columnHdrAll_psppl_cl_day5) doHdrAll_psppl_cl_day5_NX(info);
		else if (nx == columnHdrAll_ap_setoff_grp_cd) doHdrAll_ap_setoff_grp_cd_NX(info);
		else if (nx == columnHdrAll_ap_setoff_grp_nm) doHdrAll_ap_setoff_grp_nm_NX(info);
		else if (nx == columnHdrAll_tax_on_pay_flg) doHdrAll_tax_on_pay_flg_NX(info);
		else if (nx == columnHdrAll_pay_tax_rnd_typ) doHdrAll_pay_tax_rnd_typ_NX(info);
		else if (nx == columnHdrAll_pay_tax_rnd_typ_nm) doHdrAll_pay_tax_rnd_typ_nm_NX(info);
		else if (nx == columnHdrAll_pay_schd_ba_typ) doHdrAll_pay_schd_ba_typ_NX(info);
		else if (nx == columnHdrAll_pay_schd_ba_typ_nm) doHdrAll_pay_schd_ba_typ_nm_NX(info);
		else if (nx == columnHdrAll_batch_pay_schd_cl_flg) doHdrAll_batch_pay_schd_cl_flg_NX(info);
		else if (nx == columnHdrAll_pay_schd_cl_delay_days) doHdrAll_pay_schd_cl_delay_days_NX(info);
		else if (nx == columnHdrAll_pay_schd_cl_ba_typ) doHdrAll_pay_schd_cl_ba_typ_NX(info);
		else if (nx == columnHdrAll_pay_schd_cl_ba_typ_nm) doHdrAll_pay_schd_cl_ba_typ_nm_NX(info);
		else if (nx == columnHdrAll_bsppl_prnt_typ) doHdrAll_bsppl_prnt_typ_NX(info);
		else if (nx == columnHdrAll_bsppl_prnt_typ_nm) doHdrAll_bsppl_prnt_typ_nm_NX(info);
		else if (nx == columnHdrAll_pay_ntc_prnt_flg) doHdrAll_pay_ntc_prnt_flg_NX(info);
		else if (nx == columnHdrAll_pay_ntc_zip_cd) doHdrAll_pay_ntc_zip_cd_NX(info);
		else if (nx == columnHdrAll_pay_ntc_addr1) doHdrAll_pay_ntc_addr1_NX(info);
		else if (nx == columnHdrAll_pay_ntc_addr2) doHdrAll_pay_ntc_addr2_NX(info);
		else if (nx == columnHdrAll_pay_ntc_addr3) doHdrAll_pay_ntc_addr3_NX(info);
		else if (nx == columnHdrAll_pay_ntc_addr4) doHdrAll_pay_ntc_addr4_NX(info);
		else if (nx == columnHdrAll_pay_ntc_tel) doHdrAll_pay_ntc_tel_NX(info);
		else if (nx == columnHdrAll_pay_ntc_bsppl_nm) doHdrAll_pay_ntc_bsppl_nm_NX(info);
		else if (nx == columnHdrAll_pay_ntc_bsppl_dpt) doHdrAll_pay_ntc_bsppl_dpt_NX(info);
		else if (nx == columnHdrAll_pay_ntc_bsppl_psn) doHdrAll_pay_ntc_bsppl_psn_NX(info);
		else if (nx == columnHdrAll_pay_ntc_bsppl_psn_title) doHdrAll_pay_ntc_bsppl_psn_title_NX(info);
		else if (nx == columnHdrAll_pay_ntc_dtl_outp_flg) doHdrAll_pay_ntc_dtl_outp_flg_NX(info);
		else if (nx == columnHdrAll_pay_ntc_bfw_bal_disp_flg) doHdrAll_pay_ntc_bfw_bal_disp_flg_NX(info);
		else if (nx == columnHdrAll_pay_ntc_adv_pay_flg) doHdrAll_pay_ntc_adv_pay_flg_NX(info);
		else if (nx == columnHdrAll_pay_ntc_dtl_pay_flg) doHdrAll_pay_ntc_dtl_pay_flg_NX(info);
		else if (nx == columnHdrAll_pay_ntc_dtl_subttl_typ) doHdrAll_pay_ntc_dtl_subttl_typ_NX(info);
		else if (nx == columnHdrAll_pay_ntc_dtl_subttl_typ_nm) doHdrAll_pay_ntc_dtl_subttl_typ_nm_NX(info);
		else if (nx == columnHdrAll_pay_ntc_dtl_brk_typ) doHdrAll_pay_ntc_dtl_brk_typ_NX(info);
		else if (nx == columnHdrAll_pay_ntc_dtl_brk_typ_nm) doHdrAll_pay_ntc_dtl_brk_typ_nm_NX(info);
		else if (nx == columnHdrAll_pay_ntc_dtl_sort_typ) doHdrAll_pay_ntc_dtl_sort_typ_NX(info);
		else if (nx == columnHdrAll_pay_ntc_dtl_sort_typ_nm) doHdrAll_pay_ntc_dtl_sort_typ_nm_NX(info);
		else if (nx == columnHdrAll_pay_ntc_can_slip_typ) doHdrAll_pay_ntc_can_slip_typ_NX(info);
		else if (nx == columnHdrAll_pay_ntc_can_slip_typ_nm) doHdrAll_pay_ntc_can_slip_typ_nm_NX(info);
		else if (nx == columnHdrAll_psppl_rmrks) doHdrAll_psppl_rmrks_NX(info);
		else if (nx == columnHdrAll_note_days) doHdrAll_note_days_NX(info);
		else if (nx == columnHdrAll_pay_dpt_cd) doHdrAll_pay_dpt_cd_NX(info);
		else if (nx == columnHdrAll_pay_dpt_nm) doHdrAll_pay_dpt_nm_NX(info);
		else if (nx == columnHdrAll_check_pay_dpt_cd) doHdrAll_check_pay_dpt_cd_NX(info);
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
		else if (nx == columnHdrAll_psppl_prnt_typ) doHdrAll_psppl_prnt_typ_NX(info);
		else if (nx == columnHdrAll_psppl_prnt_typ_nm) doHdrAll_psppl_prnt_typ_nm_NX(info);
	}

	/**
	 * [DtlTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[bsppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[check_bsppl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_check_bsppl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_cred_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_cred_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_cred_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_cred_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_interim_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_interim_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_bank_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_bank_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_spot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_spot_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cl_day1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cl_day2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cl_day3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cl_day4_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cl_day5_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_setoff_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_setoff_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_setoff_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_setoff_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[tax_on_pay_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_tax_on_pay_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_tax_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_tax_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_ba_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_ba_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_ba_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_ba_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[batch_pay_schd_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_batch_pay_schd_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_cl_delay_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_cl_delay_days_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_cl_ba_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_cl_ba_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_cl_ba_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_cl_ba_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_addr1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_addr2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_addr3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_addr4_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_tel_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_bsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bsppl_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_bsppl_dpt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bsppl_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_bsppl_psn_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bsppl_psn_title]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_bsppl_psn_title_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_outp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_outp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bfw_bal_disp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_bfw_bal_disp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_adv_pay_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_adv_pay_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_pay_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_pay_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_subttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_subttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_subttl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_subttl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_brk_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_brk_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_brk_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_brk_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_sort_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_sort_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_sort_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_sort_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_can_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_can_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_can_slip_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_can_slip_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_days_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[check_pay_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_check_pay_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Hdr_psppl_cl_day1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Hdr_psppl_cl_day2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Hdr_psppl_cl_day3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Hdr_psppl_cl_day4_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Hdr_psppl_cl_day5_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[bsppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_bsppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_psppl_cl_day1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_psppl_cl_day2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_psppl_cl_day3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_psppl_cl_day4_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_psppl_cl_day5_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[sttl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_sttl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[sttl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_sttl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ap_sttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ap_sttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[rate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_rate_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[crryovr_mons_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_crryovr_mons_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[crryovr_mons_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_crryovr_mons_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_crryovr_mons1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_day1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_crryovr_mons2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_day2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_crryovr_mons3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_day3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_crryovr_mons4_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_day4_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_crryovr_mons5_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_day5_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Hdr]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Hdr_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Hdr]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Hdr_end_dt_NX(MCEventInfo info){
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
	 * [Wrk5Dtl]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[if_proc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_if_proc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[if_proc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_if_proc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[not_onr_prov_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_not_onr_prov_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ext_sys_nm_NX(MCEventInfo info){
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
	 * [HdrAll]パネルの[bsppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bsppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bsppl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bsppl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bsppl_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bsppl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[check_bsppl_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_check_bsppl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ap_cred_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ap_cred_cd_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ap_cred_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ap_cred_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[purc_interim_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_purc_interim_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_bank_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_bank_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_bank_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_bank_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_spot_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_spot_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cl_day1_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cl_day2_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cl_day3_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cl_day4_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cl_day5_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ap_setoff_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ap_setoff_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ap_setoff_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ap_setoff_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[tax_on_pay_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_tax_on_pay_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_tax_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_tax_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_tax_rnd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_tax_rnd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_schd_ba_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_schd_ba_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_schd_ba_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_schd_ba_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[batch_pay_schd_cl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_batch_pay_schd_cl_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_schd_cl_delay_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_schd_cl_delay_days_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_schd_cl_ba_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_schd_cl_ba_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_schd_cl_ba_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_schd_cl_ba_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bsppl_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bsppl_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bsppl_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bsppl_prnt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_zip_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_zip_cd_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_addr1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_addr1_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_addr2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_addr2_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_addr3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_addr3_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_addr4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_addr4_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_tel]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_tel_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bsppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_bsppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bsppl_dpt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_bsppl_dpt_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bsppl_psn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_bsppl_psn_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bsppl_psn_title]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_bsppl_psn_title_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_outp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_outp_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bfw_bal_disp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_bfw_bal_disp_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_adv_pay_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_adv_pay_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_pay_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_pay_flg_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_subttl_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_subttl_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_subttl_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_subttl_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_brk_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_brk_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_brk_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_brk_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_sort_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_sort_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_sort_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_sort_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_can_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_can_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_can_slip_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_can_slip_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[note_days]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_note_days_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[check_pay_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_check_pay_dpt_cd_NX(MCEventInfo info){
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
	 * [HdrAll]パネルの[psppl_prnt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_prnt_typ_NX(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_prnt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_prnt_typ_nm_NX(MCEventInfo info){
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
		else if (lc == Hdr_psppl_cd) doHdr_psppl_cd_LC(info);
		else if (lc == Hdr_psppl_nm) doHdr_psppl_nm_LC(info);
		else if (lc == Hdr_bsppl_dpt_cd) doHdr_bsppl_dpt_cd_LC(info);
		else if (lc == Hdr_bsppl_dpt_nm) doHdr_bsppl_dpt_nm_LC(info);
		else if (lc == Hdr_check_bsppl_dpt_cd) doHdr_check_bsppl_dpt_cd_LC(info);
		else if (lc == Hdr_ap_cred_cd) doHdr_ap_cred_cd_LC(info);
		else if (lc == Hdr_ap_cred_nm) doHdr_ap_cred_nm_LC(info);
		else if (lc == Hdr_pay_bank_ac_cd) doHdr_pay_bank_ac_cd_LC(info);
		else if (lc == Hdr_pay_bank_ac_nm) doHdr_pay_bank_ac_nm_LC(info);
		else if (lc == Hdr_psppl_cl_day1) doHdr_psppl_cl_day1_LC(info);
		else if (lc == Hdr_psppl_cl_day2) doHdr_psppl_cl_day2_LC(info);
		else if (lc == Hdr_psppl_cl_day3) doHdr_psppl_cl_day3_LC(info);
		else if (lc == Hdr_psppl_cl_day4) doHdr_psppl_cl_day4_LC(info);
		else if (lc == Hdr_psppl_cl_day5) doHdr_psppl_cl_day5_LC(info);
		else if (lc == Hdr_ap_setoff_grp_cd) doHdr_ap_setoff_grp_cd_LC(info);
		else if (lc == Hdr_ap_setoff_grp_nm) doHdr_ap_setoff_grp_nm_LC(info);
		else if (lc == Hdr_pay_tax_rnd_typ) doHdr_pay_tax_rnd_typ_LC(info);
		else if (lc == Hdr_pay_tax_rnd_typ_nm) doHdr_pay_tax_rnd_typ_nm_LC(info);
		else if (lc == Hdr_pay_schd_ba_typ) doHdr_pay_schd_ba_typ_LC(info);
		else if (lc == Hdr_pay_schd_ba_typ_nm) doHdr_pay_schd_ba_typ_nm_LC(info);
		else if (lc == Hdr_pay_schd_cl_delay_days) doHdr_pay_schd_cl_delay_days_LC(info);
		else if (lc == Hdr_pay_schd_cl_ba_typ) doHdr_pay_schd_cl_ba_typ_LC(info);
		else if (lc == Hdr_pay_schd_cl_ba_typ_nm) doHdr_pay_schd_cl_ba_typ_nm_LC(info);
		else if (lc == Hdr_bsppl_prnt_typ) doHdr_bsppl_prnt_typ_LC(info);
		else if (lc == Hdr_bsppl_prnt_typ_nm) doHdr_bsppl_prnt_typ_nm_LC(info);
		else if (lc == Hdr_pay_ntc_zip_cd) doHdr_pay_ntc_zip_cd_LC(info);
		else if (lc == Hdr_pay_ntc_addr1) doHdr_pay_ntc_addr1_LC(info);
		else if (lc == Hdr_pay_ntc_addr2) doHdr_pay_ntc_addr2_LC(info);
		else if (lc == Hdr_pay_ntc_addr3) doHdr_pay_ntc_addr3_LC(info);
		else if (lc == Hdr_pay_ntc_addr4) doHdr_pay_ntc_addr4_LC(info);
		else if (lc == Hdr_pay_ntc_tel) doHdr_pay_ntc_tel_LC(info);
		else if (lc == Hdr_pay_ntc_bsppl_nm) doHdr_pay_ntc_bsppl_nm_LC(info);
		else if (lc == Hdr_pay_ntc_bsppl_dpt) doHdr_pay_ntc_bsppl_dpt_LC(info);
		else if (lc == Hdr_pay_ntc_bsppl_psn) doHdr_pay_ntc_bsppl_psn_LC(info);
		else if (lc == Hdr_pay_ntc_bsppl_psn_title) doHdr_pay_ntc_bsppl_psn_title_LC(info);
		else if (lc == Hdr_pay_ntc_dtl_subttl_typ) doHdr_pay_ntc_dtl_subttl_typ_LC(info);
		else if (lc == Hdr_pay_ntc_dtl_subttl_typ_nm) doHdr_pay_ntc_dtl_subttl_typ_nm_LC(info);
		else if (lc == Hdr_pay_ntc_dtl_brk_typ) doHdr_pay_ntc_dtl_brk_typ_LC(info);
		else if (lc == Hdr_pay_ntc_dtl_brk_typ_nm) doHdr_pay_ntc_dtl_brk_typ_nm_LC(info);
		else if (lc == Hdr_pay_ntc_dtl_sort_typ) doHdr_pay_ntc_dtl_sort_typ_LC(info);
		else if (lc == Hdr_pay_ntc_dtl_sort_typ_nm) doHdr_pay_ntc_dtl_sort_typ_nm_LC(info);
		else if (lc == Hdr_pay_ntc_can_slip_typ) doHdr_pay_ntc_can_slip_typ_LC(info);
		else if (lc == Hdr_pay_ntc_can_slip_typ_nm) doHdr_pay_ntc_can_slip_typ_nm_LC(info);
		else if (lc == Hdr_psppl_rmrks) doHdr_psppl_rmrks_LC(info);
		else if (lc == Hdr_note_days) doHdr_note_days_LC(info);
		else if (lc == Hdr_pay_dpt_cd) doHdr_pay_dpt_cd_LC(info);
		else if (lc == Hdr_pay_dpt_nm) doHdr_pay_dpt_nm_LC(info);
		else if (lc == Hdr_check_pay_dpt_cd) doHdr_check_pay_dpt_cd_LC(info);
		else if (lc == Hdr_psppl_prnt_typ) doHdr_psppl_prnt_typ_LC(info);
		else if (lc == Hdr_psppl_prnt_typ_nm) doHdr_psppl_prnt_typ_nm_LC(info);
		else if (lc == Wrk3Hdr_psppl_cl_day1) doWrk3Hdr_psppl_cl_day1_LC(info);
		else if (lc == Wrk3Hdr_psppl_cl_day2) doWrk3Hdr_psppl_cl_day2_LC(info);
		else if (lc == Wrk3Hdr_psppl_cl_day3) doWrk3Hdr_psppl_cl_day3_LC(info);
		else if (lc == Wrk3Hdr_psppl_cl_day4) doWrk3Hdr_psppl_cl_day4_LC(info);
		else if (lc == Wrk3Hdr_psppl_cl_day5) doWrk3Hdr_psppl_cl_day5_LC(info);
		else if (lc == columnWrk3Dtl_bsppl_cd) doWrk3Dtl_bsppl_cd_LC(info);
		else if (lc == columnWrk3Dtl_psppl_cl_day1) doWrk3Dtl_psppl_cl_day1_LC(info);
		else if (lc == columnWrk3Dtl_psppl_cl_day2) doWrk3Dtl_psppl_cl_day2_LC(info);
		else if (lc == columnWrk3Dtl_psppl_cl_day3) doWrk3Dtl_psppl_cl_day3_LC(info);
		else if (lc == columnWrk3Dtl_psppl_cl_day4) doWrk3Dtl_psppl_cl_day4_LC(info);
		else if (lc == columnWrk3Dtl_psppl_cl_day5) doWrk3Dtl_psppl_cl_day5_LC(info);
		else if (lc == columnWrk3Dtl_cur_cd) doWrk3Dtl_cur_cd_LC(info);
		else if (lc == columnWrk3Dtl_cur_nm) doWrk3Dtl_cur_nm_LC(info);
		else if (lc == columnWrk3Dtl_amt_dec_place) doWrk3Dtl_amt_dec_place_LC(info);
		else if (lc == columnWrk3Dtl_sttl_cd) doWrk3Dtl_sttl_cd_LC(info);
		else if (lc == columnWrk3Dtl_sttl_nm) doWrk3Dtl_sttl_nm_LC(info);
		else if (lc == columnWrk3Dtl_ap_sttl_typ) doWrk3Dtl_ap_sttl_typ_LC(info);
		else if (lc == columnWrk3Dtl_wg_cd) doWrk3Dtl_wg_cd_LC(info);
		else if (lc == columnWrk3Dtl_wg_nm) doWrk3Dtl_wg_nm_LC(info);
		else if (lc == columnWrk3Dtl_rate) doWrk3Dtl_rate_LC(info);
		else if (lc == columnWrk3Dtl_crryovr_mons_typ) doWrk3Dtl_crryovr_mons_typ_LC(info);
		else if (lc == columnWrk3Dtl_crryovr_mons_typ_nm) doWrk3Dtl_crryovr_mons_typ_nm_LC(info);
		else if (lc == columnWrk3Dtl_pay_crryovr_mons1) doWrk3Dtl_pay_crryovr_mons1_LC(info);
		else if (lc == columnWrk3Dtl_pay_day1) doWrk3Dtl_pay_day1_LC(info);
		else if (lc == columnWrk3Dtl_pay_crryovr_mons2) doWrk3Dtl_pay_crryovr_mons2_LC(info);
		else if (lc == columnWrk3Dtl_pay_day2) doWrk3Dtl_pay_day2_LC(info);
		else if (lc == columnWrk3Dtl_pay_crryovr_mons3) doWrk3Dtl_pay_crryovr_mons3_LC(info);
		else if (lc == columnWrk3Dtl_pay_day3) doWrk3Dtl_pay_day3_LC(info);
		else if (lc == columnWrk3Dtl_pay_crryovr_mons4) doWrk3Dtl_pay_crryovr_mons4_LC(info);
		else if (lc == columnWrk3Dtl_pay_day4) doWrk3Dtl_pay_day4_LC(info);
		else if (lc == columnWrk3Dtl_pay_crryovr_mons5) doWrk3Dtl_pay_crryovr_mons5_LC(info);
		else if (lc == columnWrk3Dtl_pay_day5) doWrk3Dtl_pay_day5_LC(info);
		else if (lc == columnWrk3Dtl_memo1) doWrk3Dtl_memo1_LC(info);
		else if (lc == columnWrk3Dtl_memo2) doWrk3Dtl_memo2_LC(info);
		else if (lc == columnWrk3Dtl_memo3) doWrk3Dtl_memo3_LC(info);
		else if (lc == columnWrk3Dtl_ins_usr_id) doWrk3Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk3Dtl_ins_usr_nm) doWrk3Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk3Dtl_ins_ts) doWrk3Dtl_ins_ts_LC(info);
		else if (lc == columnWrk3Dtl_ins_func_id) doWrk3Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk3Dtl_ins_func_nm) doWrk3Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk3Dtl_upd_cntr) doWrk3Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk3Dtl_upd_usr_id) doWrk3Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk3Dtl_upd_usr_nm) doWrk3Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk3Dtl_upd_ts) doWrk3Dtl_upd_ts_LC(info);
		else if (lc == columnWrk3Dtl_upd_func_id) doWrk3Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk3Dtl_upd_func_nm) doWrk3Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk3Dtl_upd_srv_req_no) doWrk3Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk3Dtl_del_usr_id) doWrk3Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk3Dtl_del_usr_nm) doWrk3Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk3Dtl_del_ts) doWrk3Dtl_del_ts_LC(info);
		else if (lc == Wrk5Hdr_st_dt) doWrk5Hdr_st_dt_LC(info);
		else if (lc == Wrk5Hdr_end_dt) doWrk5Hdr_end_dt_LC(info);
		else if (lc == columnWrk5Dtl_bp_cd) doWrk5Dtl_bp_cd_LC(info);
		else if (lc == columnWrk5Dtl_if_proc_typ) doWrk5Dtl_if_proc_typ_LC(info);
		else if (lc == columnWrk5Dtl_if_proc_typ_nm) doWrk5Dtl_if_proc_typ_nm_LC(info);
		else if (lc == columnWrk5Dtl_ext_sys_cd) doWrk5Dtl_ext_sys_cd_LC(info);
		else if (lc == columnWrk5Dtl_ext_sys_nm) doWrk5Dtl_ext_sys_nm_LC(info);
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
		else if (lc == columnHdrAll_bp_cd) doHdrAll_bp_cd_LC(info);
		else if (lc == columnHdrAll_bp_nm) doHdrAll_bp_nm_LC(info);
		else if (lc == columnHdrAll_psppl_cd) doHdrAll_psppl_cd_LC(info);
		else if (lc == columnHdrAll_psppl_nm) doHdrAll_psppl_nm_LC(info);
		else if (lc == columnHdrAll_bsppl_dpt_cd) doHdrAll_bsppl_dpt_cd_LC(info);
		else if (lc == columnHdrAll_bsppl_dpt_nm) doHdrAll_bsppl_dpt_nm_LC(info);
		else if (lc == columnHdrAll_check_bsppl_dpt_cd) doHdrAll_check_bsppl_dpt_cd_LC(info);
		else if (lc == columnHdrAll_ap_cred_cd) doHdrAll_ap_cred_cd_LC(info);
		else if (lc == columnHdrAll_ap_cred_nm) doHdrAll_ap_cred_nm_LC(info);
		else if (lc == columnHdrAll_pay_bank_ac_cd) doHdrAll_pay_bank_ac_cd_LC(info);
		else if (lc == columnHdrAll_pay_bank_ac_nm) doHdrAll_pay_bank_ac_nm_LC(info);
		else if (lc == columnHdrAll_psppl_cl_day1) doHdrAll_psppl_cl_day1_LC(info);
		else if (lc == columnHdrAll_psppl_cl_day2) doHdrAll_psppl_cl_day2_LC(info);
		else if (lc == columnHdrAll_psppl_cl_day3) doHdrAll_psppl_cl_day3_LC(info);
		else if (lc == columnHdrAll_psppl_cl_day4) doHdrAll_psppl_cl_day4_LC(info);
		else if (lc == columnHdrAll_psppl_cl_day5) doHdrAll_psppl_cl_day5_LC(info);
		else if (lc == columnHdrAll_ap_setoff_grp_cd) doHdrAll_ap_setoff_grp_cd_LC(info);
		else if (lc == columnHdrAll_ap_setoff_grp_nm) doHdrAll_ap_setoff_grp_nm_LC(info);
		else if (lc == columnHdrAll_pay_tax_rnd_typ) doHdrAll_pay_tax_rnd_typ_LC(info);
		else if (lc == columnHdrAll_pay_tax_rnd_typ_nm) doHdrAll_pay_tax_rnd_typ_nm_LC(info);
		else if (lc == columnHdrAll_pay_schd_ba_typ) doHdrAll_pay_schd_ba_typ_LC(info);
		else if (lc == columnHdrAll_pay_schd_ba_typ_nm) doHdrAll_pay_schd_ba_typ_nm_LC(info);
		else if (lc == columnHdrAll_pay_schd_cl_delay_days) doHdrAll_pay_schd_cl_delay_days_LC(info);
		else if (lc == columnHdrAll_pay_schd_cl_ba_typ) doHdrAll_pay_schd_cl_ba_typ_LC(info);
		else if (lc == columnHdrAll_pay_schd_cl_ba_typ_nm) doHdrAll_pay_schd_cl_ba_typ_nm_LC(info);
		else if (lc == columnHdrAll_bsppl_prnt_typ) doHdrAll_bsppl_prnt_typ_LC(info);
		else if (lc == columnHdrAll_bsppl_prnt_typ_nm) doHdrAll_bsppl_prnt_typ_nm_LC(info);
		else if (lc == columnHdrAll_pay_ntc_zip_cd) doHdrAll_pay_ntc_zip_cd_LC(info);
		else if (lc == columnHdrAll_pay_ntc_addr1) doHdrAll_pay_ntc_addr1_LC(info);
		else if (lc == columnHdrAll_pay_ntc_addr2) doHdrAll_pay_ntc_addr2_LC(info);
		else if (lc == columnHdrAll_pay_ntc_addr3) doHdrAll_pay_ntc_addr3_LC(info);
		else if (lc == columnHdrAll_pay_ntc_addr4) doHdrAll_pay_ntc_addr4_LC(info);
		else if (lc == columnHdrAll_pay_ntc_tel) doHdrAll_pay_ntc_tel_LC(info);
		else if (lc == columnHdrAll_pay_ntc_bsppl_nm) doHdrAll_pay_ntc_bsppl_nm_LC(info);
		else if (lc == columnHdrAll_pay_ntc_bsppl_dpt) doHdrAll_pay_ntc_bsppl_dpt_LC(info);
		else if (lc == columnHdrAll_pay_ntc_bsppl_psn) doHdrAll_pay_ntc_bsppl_psn_LC(info);
		else if (lc == columnHdrAll_pay_ntc_bsppl_psn_title) doHdrAll_pay_ntc_bsppl_psn_title_LC(info);
		else if (lc == columnHdrAll_pay_ntc_dtl_subttl_typ) doHdrAll_pay_ntc_dtl_subttl_typ_LC(info);
		else if (lc == columnHdrAll_pay_ntc_dtl_subttl_typ_nm) doHdrAll_pay_ntc_dtl_subttl_typ_nm_LC(info);
		else if (lc == columnHdrAll_pay_ntc_dtl_brk_typ) doHdrAll_pay_ntc_dtl_brk_typ_LC(info);
		else if (lc == columnHdrAll_pay_ntc_dtl_brk_typ_nm) doHdrAll_pay_ntc_dtl_brk_typ_nm_LC(info);
		else if (lc == columnHdrAll_pay_ntc_dtl_sort_typ) doHdrAll_pay_ntc_dtl_sort_typ_LC(info);
		else if (lc == columnHdrAll_pay_ntc_dtl_sort_typ_nm) doHdrAll_pay_ntc_dtl_sort_typ_nm_LC(info);
		else if (lc == columnHdrAll_pay_ntc_can_slip_typ) doHdrAll_pay_ntc_can_slip_typ_LC(info);
		else if (lc == columnHdrAll_pay_ntc_can_slip_typ_nm) doHdrAll_pay_ntc_can_slip_typ_nm_LC(info);
		else if (lc == columnHdrAll_psppl_rmrks) doHdrAll_psppl_rmrks_LC(info);
		else if (lc == columnHdrAll_note_days) doHdrAll_note_days_LC(info);
		else if (lc == columnHdrAll_pay_dpt_cd) doHdrAll_pay_dpt_cd_LC(info);
		else if (lc == columnHdrAll_pay_dpt_nm) doHdrAll_pay_dpt_nm_LC(info);
		else if (lc == columnHdrAll_check_pay_dpt_cd) doHdrAll_check_pay_dpt_cd_LC(info);
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
		else if (lc == columnHdrAll_psppl_prnt_typ) doHdrAll_psppl_prnt_typ_LC(info);
		else if (lc == columnHdrAll_psppl_prnt_typ_nm) doHdrAll_psppl_prnt_typ_nm_LC(info);
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
	 * [Hdr]パネルの[psppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[check_bsppl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_check_bsppl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_cred_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_cred_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_cred_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_cred_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_bank_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_bank_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cl_day1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cl_day2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cl_day3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cl_day4_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_cl_day5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_cl_day5_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_setoff_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_setoff_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ap_setoff_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ap_setoff_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_tax_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_tax_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_ba_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_ba_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_ba_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_ba_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_cl_delay_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_cl_delay_days_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_cl_ba_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_cl_ba_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_schd_cl_ba_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_schd_cl_ba_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bsppl_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bsppl_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_addr1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_addr2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_addr3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_addr4_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_tel_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_bsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bsppl_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_bsppl_dpt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bsppl_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_bsppl_psn_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_bsppl_psn_title]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_bsppl_psn_title_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_subttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_subttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_subttl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_subttl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_brk_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_brk_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_brk_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_brk_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_sort_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_sort_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_dtl_sort_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_dtl_sort_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_can_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_can_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_ntc_can_slip_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_ntc_can_slip_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[note_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_note_days_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[pay_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_pay_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[check_pay_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_check_pay_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[psppl_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_psppl_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Hdr_psppl_cl_day1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Hdr_psppl_cl_day2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Hdr_psppl_cl_day3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Hdr_psppl_cl_day4_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Hdr]パネルの[psppl_cl_day5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Hdr_psppl_cl_day5_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[bsppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_bsppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_psppl_cl_day1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_psppl_cl_day2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_psppl_cl_day3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_psppl_cl_day4_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[psppl_cl_day5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_psppl_cl_day5_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[sttl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_sttl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[sttl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_sttl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ap_sttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ap_sttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[rate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_rate_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[crryovr_mons_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_crryovr_mons_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[crryovr_mons_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_crryovr_mons_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_crryovr_mons1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_day1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_crryovr_mons2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_day2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_crryovr_mons3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_day3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_crryovr_mons4_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_day4_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_crryovr_mons5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_crryovr_mons5_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[pay_day5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_pay_day5_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Hdr]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Hdr_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Hdr]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Hdr_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[if_proc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_if_proc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[if_proc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_if_proc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ext_sys_nm_LC(MCEventInfo info){
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
	 * [HdrAll]パネルの[psppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bsppl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bsppl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bsppl_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bsppl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[check_bsppl_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_check_bsppl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ap_cred_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ap_cred_cd_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ap_cred_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ap_cred_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_bank_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_bank_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_bank_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_bank_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cl_day1_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cl_day2_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cl_day3_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cl_day4_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_cl_day5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_cl_day5_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ap_setoff_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ap_setoff_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[ap_setoff_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_ap_setoff_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_tax_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_tax_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_tax_rnd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_tax_rnd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_schd_ba_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_schd_ba_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_schd_ba_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_schd_ba_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_schd_cl_delay_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_schd_cl_delay_days_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_schd_cl_ba_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_schd_cl_ba_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_schd_cl_ba_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_schd_cl_ba_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bsppl_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bsppl_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[bsppl_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_bsppl_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_zip_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_zip_cd_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_addr1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_addr1_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_addr2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_addr2_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_addr3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_addr3_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_addr4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_addr4_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_tel]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_tel_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bsppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_bsppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bsppl_dpt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_bsppl_dpt_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bsppl_psn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_bsppl_psn_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_bsppl_psn_title]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_bsppl_psn_title_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_subttl_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_subttl_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_subttl_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_subttl_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_brk_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_brk_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_brk_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_brk_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_sort_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_sort_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_dtl_sort_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_dtl_sort_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_can_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_can_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_ntc_can_slip_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_ntc_can_slip_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[note_days]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_note_days_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[pay_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_pay_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[check_pay_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_check_pay_dpt_cd_LC(MCEventInfo info){
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
	 * [HdrAll]パネルの[psppl_prnt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_prnt_typ_LC(MCEventInfo info){
	}

	/**
	 * [HdrAll]パネルの[psppl_prnt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrAll_psppl_prnt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_cd]の作成メソッド
	 */
	public MCList getCnd_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_psppl_cd]の作成メソッド
	 */
	public MCList getHdr_psppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_bsppl_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_bsppl_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_ap_cred_cd]の作成メソッド
	 */
	public MCList getHdr_ap_cred_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_pay_bank_ac_cd]の作成メソッド
	 */
	public MCList getHdr_pay_bank_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExtBankAc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_ap_setoff_grp_cd]の作成メソッド
	 */
	public MCList getHdr_ap_setoff_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSetoffGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_pay_tax_rnd_typ]の作成メソッド
	 */
	public MCList getHdr_pay_tax_rnd_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRndTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_pay_schd_ba_typ]の作成メソッド
	 */
	public MCList getHdr_pay_schd_ba_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBaTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_pay_schd_cl_ba_typ]の作成メソッド
	 */
	public MCList getHdr_pay_schd_cl_ba_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBaTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_bsppl_prnt_typ]の作成メソッド
	 */
	public MCList getHdr_bsppl_prnt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPrntTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_pay_ntc_dtl_subttl_typ]の作成メソッド
	 */
	public MCList getHdr_pay_ntc_dtl_subttl_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPayNtcDtlSubttlTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_pay_ntc_dtl_brk_typ]の作成メソッド
	 */
	public MCList getHdr_pay_ntc_dtl_brk_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPayNtcDtlBrkTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_pay_ntc_dtl_sort_typ]の作成メソッド
	 */
	public MCList getHdr_pay_ntc_dtl_sort_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPayNtcDtlSortTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_pay_ntc_can_slip_typ]の作成メソッド
	 */
	public MCList getHdr_pay_ntc_can_slip_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPayNtcCanSlipTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_pay_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_pay_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_psppl_prnt_typ]の作成メソッド
	 */
	public MCList getHdr_psppl_prnt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPrntTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk3Dtl_cur_cd]の作成メソッド
	 */
	public MCList getWrk3Dtl_cur_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCur(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk3Dtl_sttl_cd]の作成メソッド
	 */
	public MCList getWrk3Dtl_sttl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApSttlPaySchdCtl(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk3Dtl_wg_cd]の作成メソッド
	 */
	public MCList getWrk3Dtl_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getApWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk3Dtl_crryovr_mons_typ]の作成メソッド
	 */
	public MCList getWrk3Dtl_crryovr_mons_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCrryovrMonsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk5Dtl_if_proc_typ]の作成メソッド
	 */
	public MCList getWrk5Dtl_if_proc_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIfProcTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk5Dtl_ext_sys_cd]の作成メソッド
	 */
	public MCList getWrk5Dtl_ext_sys_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExtSysEdi(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnHdrAll_pay_ntc_dtl_subttl_typ]の作成メソッド
	 */
	public MCList getHdrAll_pay_ntc_dtl_subttl_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnHdrAll_pay_ntc_dtl_brk_typ]の作成メソッド
	 */
	public MCList getHdrAll_pay_ntc_dtl_brk_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnHdrAll_pay_ntc_dtl_sort_typ]の作成メソッド
	 */
	public MCList getHdrAll_pay_ntc_dtl_sort_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnHdrAll_pay_ntc_can_slip_typ]の作成メソッド
	 */
	public MCList getHdrAll_pay_ntc_can_slip_typ(MCRow row, MCEventInfo info){
		return null;
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABCL0580.Srch01")) {
			return new MA_MABCL0580_Srch01Bridge();
		}
		if (id.equals("MA.MABCL0580.Upd01")) {
			return new MA_MABCL0580_Upd01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABCL0580_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0580_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0580_Srch01;

		/** コンストラクタ */
		protected MA_MABCL0580_Srch01Bridge() {
			p_MA_MABCL0580_Srch01 = new MCParam(PDef.MA_MABCL0580_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0580_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABC.MABCP0580.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0580.HdrAllR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0580.Wrk3DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0580.Wrk5DtlR.class));

			p_MA_MABCL0580_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0580_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0580_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0580_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0580_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABC.MABCP0580.CndR up0() {
			return (mcframe.clientMABC.MABCP0580.CndR)up(0);
		}

		protected MCList<mcframe.clientMABC.MABCP0580.HdrAllR> down0() {
			return (MCList<mcframe.clientMABC.MABCP0580.HdrAllR>)down(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0580.Wrk3DtlR> down1() {
			return (MCList<mcframe.clientMABC.MABCP0580.Wrk3DtlR>)down(1);
		}
		protected MCList<mcframe.clientMABC.MABCP0580.Wrk5DtlR> down2() {
			return (MCList<mcframe.clientMABC.MABCP0580.Wrk5DtlR>)down(2);
		}

		protected void setupDownParam() {
			p_MA_MABCL0580_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0580.HdrAllR.class));
			p_MA_MABCL0580_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0580.Wrk3DtlR.class));
			p_MA_MABCL0580_Srch01.addDownBlock(MCList.create(mcframe.clientMABC.MABCP0580.Wrk5DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABCL0580_Srch01;
		}

		protected void show() {
			setHdrAllL((MCList<mcframe.clientMABC.MABCP0580.HdrAllR>)p_MA_MABCL0580_Srch01.getContainerParam().getDownBlock(0));
			setWrk3DtlL((MCList<mcframe.clientMABC.MABCP0580.Wrk3DtlR>)p_MA_MABCL0580_Srch01.getContainerParam().getDownBlock(1));
			setWrk5DtlL((MCList<mcframe.clientMABC.MABCP0580.Wrk5DtlR>)p_MA_MABCL0580_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrAllL().clear();
			getWrk3DtlL().clear();
			getWrk5DtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrAllL());
			result.add(getWrk3DtlL());
			result.add(getWrk5DtlL());
			return result;
		}
	}
	/**
	 * [MA_MABCL0580_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABCL0580_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABCL0580_Upd01;

		/** コンストラクタ */
		protected MA_MABCL0580_Upd01Bridge() {
			p_MA_MABCL0580_Upd01 = new MCParam(PDef.MA_MABCL0580_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABCL0580_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0580.HdrAllR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0580.Wrk3DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABC.MABCP0580.Wrk5DtlR.class));
			// Down

			p_MA_MABCL0580_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABCL0580_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABCL0580_Upd01.addUpBlock(getHdrAllL().shallowClone());
			p_MA_MABCL0580_Upd01.addUpBlock(getWrk3DtlL().shallowClone());
			p_MA_MABCL0580_Upd01.addUpBlock(getWrk5DtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABCL0580_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABCL0580_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABC.MABCP0580.HdrAllR> up0() {
			return (MCList<mcframe.clientMABC.MABCP0580.HdrAllR>)up(0);
		}
		protected MCList<mcframe.clientMABC.MABCP0580.Wrk3DtlR> up1() {
			return (MCList<mcframe.clientMABC.MABCP0580.Wrk3DtlR>)up(1);
		}
		protected MCList<mcframe.clientMABC.MABCP0580.Wrk5DtlR> up2() {
			return (MCList<mcframe.clientMABC.MABCP0580.Wrk5DtlR>)up(2);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABCL0580_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrAllL());
			result.add(getWrk3DtlL());
			result.add(getWrk5DtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}